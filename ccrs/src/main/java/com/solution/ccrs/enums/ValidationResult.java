package com.solution.ccrs.enums;

/**
 * Enumeration representing the possible results of a card validation process.
 * 
 * This enum defines the different outcomes that can occur when validating
 * a card. It helps standardize validation responses and ensures consistent
 * handling of validation results across the system.
 * 
 * Primary Purpose:
 * - Represent the outcome of a card validation
 * - Provide clear and type-safe validation status
 * - Support audit logging and response messaging
 * 
 * Values:
 * - VALID: Card is valid and successfully verified
 * - INVALID: Card failed validation due to incorrect details
 * - EXPIRED: Card is no longer valid due to expiry
 * - BLOCKED: Card is blocked and cannot be used
 */
public enum ValidationResult {
    VALID,
    INVALID,
    EXPIRED,
    BLOCKED
}