package com.solution.ccrs.enums;

/**
 * Enumeration representing the possible statuses of a bill in the system.
 * 
 * This enum defines the different states a bill can be in during its lifecycle.
 * It helps standardize bill status handling across the application and ensures
 * consistency in business logic and API responses.
 * 
 * Primary Purpose:
 * - Represent the lifecycle stage of a bill
 * - Ensure type-safe handling of bill status values
 * - Improve readability and maintainability of billing logic
 * 
 * Values:
 * - PENDING: Bill has been generated but not yet paid
 * - PAID: Bill has been successfully paid
 * - CANCELLED: Bill has been cancelled and is no longer valid
 * - OVERDUE: Bill has not been paid and has passed its due date
 */
public enum BillStatus {
    PENDING,
    PAID,
    CANCELLED,
    OVERDUE
}