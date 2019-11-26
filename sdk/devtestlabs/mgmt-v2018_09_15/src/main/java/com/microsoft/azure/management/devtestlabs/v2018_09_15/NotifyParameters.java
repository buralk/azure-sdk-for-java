/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for generating a Notification.
 */
public class NotifyParameters {
    /**
     * The type of event (i.e. AutoShutdown, Cost). Possible values include:
     * 'AutoShutdown', 'Cost'.
     */
    @JsonProperty(value = "eventName")
    private NotificationChannelEventType eventName;

    /**
     * Properties for the notification in json format.
     */
    @JsonProperty(value = "jsonPayload")
    private String jsonPayload;

    /**
     * Get the type of event (i.e. AutoShutdown, Cost). Possible values include: 'AutoShutdown', 'Cost'.
     *
     * @return the eventName value
     */
    public NotificationChannelEventType eventName() {
        return this.eventName;
    }

    /**
     * Set the type of event (i.e. AutoShutdown, Cost). Possible values include: 'AutoShutdown', 'Cost'.
     *
     * @param eventName the eventName value to set
     * @return the NotifyParameters object itself.
     */
    public NotifyParameters withEventName(NotificationChannelEventType eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * Get properties for the notification in json format.
     *
     * @return the jsonPayload value
     */
    public String jsonPayload() {
        return this.jsonPayload;
    }

    /**
     * Set properties for the notification in json format.
     *
     * @param jsonPayload the jsonPayload value to set
     * @return the NotifyParameters object itself.
     */
    public NotifyParameters withJsonPayload(String jsonPayload) {
        this.jsonPayload = jsonPayload;
        return this;
    }

}