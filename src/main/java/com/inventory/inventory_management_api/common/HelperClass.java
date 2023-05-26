package com.inventory.inventory_management_api.common;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;
@Slf4j
public class HelperClass {
    public static String generateExternalRef() {
        RandomStringGenerator stringGenerator = new RandomStringGenerator.Builder()
                .withinRange('0', 'z')
                .filteredBy(CharacterPredicates.DIGITS, CharacterPredicates.DIGITS).build();
        String transactionNumber = stringGenerator.generate(5).toUpperCase();
        log.info("Transaction Number:{}", transactionNumber);
        return transactionNumber;

    }
}
