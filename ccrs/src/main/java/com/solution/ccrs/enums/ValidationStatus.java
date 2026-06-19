package com.solution.ccrs.enums;

/**
 * Enumeration representing the validation status of a card.
 * 
 * This enum defines the current state of a card's validation process.
 * It is used to track whether a card is yet to be validated, has been
 * successfully validated, or has failed validation.
 * 
 * Primary Purpose:
 * - Represent the current validation state of a card
 * - Support validation workflow and status tracking
 * - Ensure type-safe handling of validation states
 * 
 * Values:
 * - PENDING: Card validation is not yet completed
 * - VALID: Card has been successfully validated
 * - INVALID: Card failed validation
 */
public enum ValidationStatus {
    PENDING,
    VALID,
    INVALID
}