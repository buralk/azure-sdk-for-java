/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.implementation;

import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementAssociationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * The container for solution.
 */
public class ManagementAssociationInner extends ProxyResource {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Properties for ManagementAssociation object supported by the
     * OperationsManagement resource provider.
     */
    @JsonProperty(value = "properties")
    private ManagementAssociationProperties properties;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the ManagementAssociationInner object itself.
     */
    public ManagementAssociationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get properties for ManagementAssociation object supported by the OperationsManagement resource provider.
     *
     * @return the properties value
     */
    public ManagementAssociationProperties properties() {
        return this.properties;
    }

    /**
     * Set properties for ManagementAssociation object supported by the OperationsManagement resource provider.
     *
     * @param properties the properties value to set
     * @return the ManagementAssociationInner object itself.
     */
    public ManagementAssociationInner withProperties(ManagementAssociationProperties properties) {
        this.properties = properties;
        return this;
    }

}