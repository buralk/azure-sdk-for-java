// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The action that will be executed.
 */
public class Action {
    /**
     * The type of the action. Possible values include: 'EmailContacts',
     * 'AutoRenew'.
     */
    @JsonProperty(value = "action_type")
    private ActionType actionType;

    /**
     * Get the actionType value.
     *
     * @return the actionType value
     */
    public ActionType actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType value.
     *
     * @param actionType the actionType value to set
     * @return the Action object itself.
     */
    public Action withActionType(ActionType actionType) {
        this.actionType = actionType;
        return this;
    }

}
