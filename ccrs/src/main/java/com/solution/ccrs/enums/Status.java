package com.solution.ccrs.enums;

/**
 * Enumeration representing the status of a user in the system.
 * 
 * This enum defines the possible states a user account can have,
 * helping control access, authentication, and system behavior
 * based on the user’s current state.
 * 
 * Primary Purpose:
 * - Represent the current state of a user account
 * - Enable conditional logic based on user status
 * - Ensure consistent and type-safe status handling
 * 
 * Values:
 * - ACTIVE: User account is active and allowed to access the system
 * - INACTIVE: User account exists but is not currently active (e.g., not verified)
 * - BLOCKED: User account is restricted due to security or policy reasons
 */
public enum Status {
    ACTIVE,
    INACTIVE,
    BLOCKED
}