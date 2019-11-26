/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.ManagedInstanceInner;

/**
 * Type representing ManagedInstance.
 */
public interface ManagedInstance extends HasInner<ManagedInstanceInner>, Resource, GroupableResourceCore<SqlManager, ManagedInstanceInner>, HasResourceGroup, Refreshable<ManagedInstance>, Updatable<ManagedInstance.Update>, HasManager<SqlManager> {
    /**
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * @return the administratorLoginPassword value.
     */
    String administratorLoginPassword();

    /**
     * @return the collation value.
     */
    String collation();

    /**
     * @return the dnsZone value.
     */
    String dnsZone();

    /**
     * @return the dnsZonePartner value.
     */
    String dnsZonePartner();

    /**
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * @return the licenseType value.
     */
    String licenseType();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the storageSizeInGB value.
     */
    Integer storageSizeInGB();

    /**
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * @return the vCores value.
     */
    Integer vCores();

    /**
     * The entirety of the ManagedInstance definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ManagedInstance definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ManagedInstance definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ManagedInstance definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the managedinstance definition allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             * @param administratorLogin Administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation)
             * @return the next definition stage
             */
            WithCreate withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the managedinstance definition allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             * @param administratorLoginPassword The administrator login password (required for managed instance creation)
             * @return the next definition stage
             */
            WithCreate withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation Collation of the managed instance
             * @return the next definition stage
             */
            WithCreate withCollation(String collation);
        }

        /**
         * The stage of the managedinstance definition allowing to specify DnsZonePartner.
         */
        interface WithDnsZonePartner {
            /**
             * Specifies dnsZonePartner.
             * @param dnsZonePartner The resource id of another managed instance whose DNS zone this managed instance will share after creation
             * @return the next definition stage
             */
            WithCreate withDnsZonePartner(String dnsZonePartner);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The Azure Active Directory identity of the managed instance
             * @return the next definition stage
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the managedinstance definition allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             * @param licenseType The license type. Possible values are 'LicenseIncluded' and 'BasePrice'
             * @return the next definition stage
             */
            WithCreate withLicenseType(String licenseType);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Managed instance sku
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the managedinstance definition allowing to specify StorageSizeInGB.
         */
        interface WithStorageSizeInGB {
            /**
             * Specifies storageSizeInGB.
             * @param storageSizeInGB The maximum storage size in GB
             * @return the next definition stage
             */
            WithCreate withStorageSizeInGB(Integer storageSizeInGB);
        }

        /**
         * The stage of the managedinstance definition allowing to specify SubnetId.
         */
        interface WithSubnetId {
            /**
             * Specifies subnetId.
             * @param subnetId Subnet resource ID for the managed instance
             * @return the next definition stage
             */
            WithCreate withSubnetId(String subnetId);
        }

        /**
         * The stage of the managedinstance definition allowing to specify VCores.
         */
        interface WithVCores {
            /**
             * Specifies vCores.
             * @param vCores The number of VCores
             * @return the next definition stage
             */
            WithCreate withVCores(Integer vCores);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ManagedInstance>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAdministratorLogin, DefinitionStages.WithAdministratorLoginPassword, DefinitionStages.WithCollation, DefinitionStages.WithDnsZonePartner, DefinitionStages.WithIdentity, DefinitionStages.WithLicenseType, DefinitionStages.WithSku, DefinitionStages.WithStorageSizeInGB, DefinitionStages.WithSubnetId, DefinitionStages.WithVCores {
        }
    }
    /**
     * The template for a ManagedInstance update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ManagedInstance>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdministratorLogin, UpdateStages.WithAdministratorLoginPassword, UpdateStages.WithCollation, UpdateStages.WithDnsZonePartner, UpdateStages.WithLicenseType, UpdateStages.WithSku, UpdateStages.WithStorageSizeInGB, UpdateStages.WithSubnetId, UpdateStages.WithVCores {
    }

    /**
     * Grouping of ManagedInstance update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the managedinstance update allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             * @param administratorLogin Administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation)
             * @return the next update stage
             */
            Update withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the managedinstance update allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             * @param administratorLoginPassword The administrator login password (required for managed instance creation)
             * @return the next update stage
             */
            Update withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the managedinstance update allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation Collation of the managed instance
             * @return the next update stage
             */
            Update withCollation(String collation);
        }

        /**
         * The stage of the managedinstance update allowing to specify DnsZonePartner.
         */
        interface WithDnsZonePartner {
            /**
             * Specifies dnsZonePartner.
             * @param dnsZonePartner The resource id of another managed instance whose DNS zone this managed instance will share after creation
             * @return the next update stage
             */
            Update withDnsZonePartner(String dnsZonePartner);
        }

        /**
         * The stage of the managedinstance update allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             * @param licenseType The license type. Possible values are 'LicenseIncluded' and 'BasePrice'
             * @return the next update stage
             */
            Update withLicenseType(String licenseType);
        }

        /**
         * The stage of the managedinstance update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Managed instance sku
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the managedinstance update allowing to specify StorageSizeInGB.
         */
        interface WithStorageSizeInGB {
            /**
             * Specifies storageSizeInGB.
             * @param storageSizeInGB The maximum storage size in GB
             * @return the next update stage
             */
            Update withStorageSizeInGB(Integer storageSizeInGB);
        }

        /**
         * The stage of the managedinstance update allowing to specify SubnetId.
         */
        interface WithSubnetId {
            /**
             * Specifies subnetId.
             * @param subnetId Subnet resource ID for the managed instance
             * @return the next update stage
             */
            Update withSubnetId(String subnetId);
        }

        /**
         * The stage of the managedinstance update allowing to specify VCores.
         */
        interface WithVCores {
            /**
             * Specifies vCores.
             * @param vCores The number of VCores
             * @return the next update stage
             */
            Update withVCores(Integer vCores);
        }

    }
}