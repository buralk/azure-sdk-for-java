// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

module com.azure.security.keyvault.administration {
    requires transitive com.azure.core;

    exports com.azure.security.keyvault.administration;
    exports com.azure.security.keyvault.administration.models;
    exports com.azure.security.keyvault.administration.implementation;
    exports com.azure.security.keyvault.administration.implementation.models;

    opens com.azure.security.keyvault.administration to com.fasterxml.jackson.databind;
    opens com.azure.security.keyvault.administration.models to com.fasterxml.jackson.databind;
    opens com.azure.security.keyvault.administration.implementation to com.fasterxml.jackson.databind;
}
