package com.solution.ccrs.enums;

/**
 * Enumeration representing different authentication methods
 * supported by the system.
 * 
 * This enum is used to define how a user is authenticated
 * when creating a session. It helps in distinguishing between
 * different login mechanisms and enhances security tracking.
 * 
 * Primary Purpose:
 * - Define supported authentication strategies
 * - Standardize authentication type across the system
 * - Improve readability and maintainability of session logic
 * 
 * Values:
 * - PASSWORD: Authentication using username and password
 * - TOKEN: Authentication using a token-based mechanism
 *   (e.g., session token, JWT, or API token)
 */
public enum AuthMethod {
    PASSWORD,
    TOKEN
}
