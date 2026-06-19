package com.solution.ccrs.enums;

/**
 * Enumeration representing the possible statuses of a transaction
 * in the system.
 * 
 * This enum defines the lifecycle stages of a transaction from
 * initiation to completion, helping track whether a transaction
 * is in progress, successful, or failed.
 * 
 * Primary Purpose:
 * - Represent the current state of a transaction
 * - Enable tracking of transaction progress
 * - Provide type-safe status handling across the system
 * 
 * Values:
 * - PENDING: Transaction has been initiated but not yet completed
 * - SUCCESS: Transaction has been successfully processed
 * - FAILED: Transaction processing has failed
 */
public enum TxnStatus {
    PENDING,
    SUCCESS,
    FAILED
}