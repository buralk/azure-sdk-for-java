// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Management policy for a certificate.
 */
public class CertificatePolicy {
    /**
     * The certificate id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Properties of the key backing a certificate.
     */
    @JsonProperty(value = "key_props")
    private KeyProperties keyProperties;

    /**
     * Properties of the secret backing a certificate.
     */
    @JsonProperty(value = "secret_props")
    private SecretProperties secretProperties;

    /**
     * Properties of the X509 component of a certificate.
     */
    @JsonProperty(value = "x509_props")
    private X509CertificateProperties x509CertificateProperties;

    /**
     * Actions that will be performed by Key Vault over the lifetime of a
     * certificate.
     */
    @JsonProperty(value = "lifetime_actions")
    private List<LifetimeAction> lifetimeActions;

    /**
     * Parameters for the issuer of the X509 component of a certificate.
     */
    @JsonProperty(value = "issuer")
    private IssuerParameters issuerParameters;

    /**
     * The certificate attributes.
     */
    @JsonProperty(value = "attributes")
    private CertificateAttributes attributes;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the keyProperties value.
     *
     * @return the keyProperties value
     */
    public KeyProperties keyProperties() {
        return this.keyProperties;
    }

    /**
     * Set the keyProperties value.
     *
     * @param keyProperties the keyProperties value to set
     * @return the CertificatePolicy object itself.
     */
    public CertificatePolicy withKeyProperties(KeyProperties keyProperties) {
        this.keyProperties = keyProperties;
        return this;
    }

    /**
     * Get the secretProperties value.
     *
     * @return the secretProperties value
     */
    public SecretProperties secretProperties() {
        return this.secretProperties;
    }

    /**
     * Set the secretProperties value.
     *
     * @param secretProperties the secretProperties value to set
     * @return the CertificatePolicy object itself.
     */
    public CertificatePolicy withSecretProperties(SecretProperties secretProperties) {
        this.secretProperties = secretProperties;
        return this;
    }

    /**
     * Get the x509CertificateProperties value.
     *
     * @return the x509CertificateProperties value
     */
    public X509CertificateProperties x509CertificateProperties() {
        return this.x509CertificateProperties;
    }

    /**
     * Set the x509CertificateProperties value.
     *
     * @param x509CertificateProperties the x509CertificateProperties value to set
     * @return the CertificatePolicy object itself.
     */
    public CertificatePolicy withX509CertificateProperties(X509CertificateProperties x509CertificateProperties) {
        this.x509CertificateProperties = x509CertificateProperties;
        return this;
    }

    /**
     * Get the lifetimeActions value.
     *
     * @return the lifetimeActions value
     */
    public List<LifetimeAction> lifetimeActions() {
        return this.lifetimeActions;
    }

    /**
     * Set the lifetimeActions value.
     *
     * @param lifetimeActions the lifetimeActions value to set
     * @return the CertificatePolicy object itself.
     */
    public CertificatePolicy withLifetimeActions(List<LifetimeAction> lifetimeActions) {
        this.lifetimeActions = lifetimeActions;
        return this;
    }

    /**
     * Get the issuerParameters value.
     *
     * @return the issuerParameters value
     */
    public IssuerParameters issuerParameters() {
        return this.issuerParameters;
    }

    /**
     * Set the issuerParameters value.
     *
     * @param issuerParameters the issuerParameters value to set
     * @return the CertificatePolicy object itself.
     */
    public CertificatePolicy withIssuerParameters(IssuerParameters issuerParameters) {
        this.issuerParameters = issuerParameters;
        return this;
    }

    /**
     * Get the attributes value.
     *
     * @return the attributes value
     */
    public CertificateAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes value.
     *
     * @param attributes the attributes value to set
     * @return the CertificatePolicy object itself.
     */
    public CertificatePolicy withAttributes(CertificateAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

}
