/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.JobSchedulesInner;
import com.microsoft.azure.arm.model.HasInner;

import java.util.UUID;

/**
 * Type representing JobSchedules.
 */
public interface JobSchedules extends SupportsCreating<JobSchedule.DefinitionStages.Blank>, HasInner<JobSchedulesInner> {
    /**
     * Retrieve the job schedule identified by job schedule name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobScheduleId The job schedule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobSchedule> getAsync(String resourceGroupName, String automationAccountName, UUID jobScheduleId);

    /**
     * Retrieve a list of job schedules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobSchedule> listByAutomationAccountAsync(final String resourceGroupName, final String automationAccountName);

    /**
     * Delete the job schedule identified by job schedule name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobScheduleId The job schedule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String automationAccountName, UUID jobScheduleId);

}