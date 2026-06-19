package com.solution.ccrs.enums;

/**
 * Enumeration representing the types of transactions supported
 * within the system.
 * 
 * This enum defines the various categories of financial operations
 * that can be performed, allowing the system to differentiate between
 * payment types and apply specific business logic accordingly.
 * 
 * Primary Purpose:
 * - Categorize transactions based on their purpose
 * - Enable conditional processing depending on transaction type
 * - Improve clarity and maintainability of transaction logic
 * 
 * Values:
 * - BILL_PAYMENT: Transaction related to paying a bill
 * - CARD_PAYMENT: Transaction performed directly using a card
 * - REFUND: Transaction representing a refund operation
 */
public enum TxnType {
    BILL_PAYMENT,
    CARD_PAYMENT,
    REFUND
}
