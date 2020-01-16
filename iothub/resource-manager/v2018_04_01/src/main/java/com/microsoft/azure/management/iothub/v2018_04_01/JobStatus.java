/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for JobStatus.
 */
public enum JobStatus {
    /** Enum value unknown. */
    UNKNOWN("unknown"),

    /** Enum value enqueued. */
    ENQUEUED("enqueued"),

    /** Enum value running. */
    RUNNING("running"),

    /** Enum value completed. */
    COMPLETED("completed"),

    /** Enum value failed. */
    FAILED("failed"),

    /** Enum value cancelled. */
    CANCELLED("cancelled");

    /** The actual serialized value for a JobStatus instance. */
    private String value;

    JobStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static JobStatus fromString(String value) {
        JobStatus[] items = JobStatus.values();
        for (JobStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}