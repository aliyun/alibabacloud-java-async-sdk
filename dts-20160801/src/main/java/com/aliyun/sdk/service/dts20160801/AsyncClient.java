// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dts20160801.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<ConfigurationSynchronizationJobResponse> configurationSynchronizationJob(ConfigurationSynchronizationJobRequest request);

    CompletableFuture<ConfigureMigrationJobResponse> configureMigrationJob(ConfigureMigrationJobRequest request);

    CompletableFuture<ConfigureSubscriptionInstanceResponse> configureSubscriptionInstance(ConfigureSubscriptionInstanceRequest request);

    CompletableFuture<ConfigureSynchronizationJobResponse> configureSynchronizationJob(ConfigureSynchronizationJobRequest request);

    CompletableFuture<CreateMigrationJobResponse> createMigrationJob(CreateMigrationJobRequest request);

    CompletableFuture<CreateSubscriptionInstanceResponse> createSubscriptionInstance(CreateSubscriptionInstanceRequest request);

    CompletableFuture<CreateSynchronizationJobResponse> createSynchronizationJob(CreateSynchronizationJobRequest request);

    CompletableFuture<DeleteMigrationJobResponse> deleteMigrationJob(DeleteMigrationJobRequest request);

    CompletableFuture<DeleteSubscriptionInstanceResponse> deleteSubscriptionInstance(DeleteSubscriptionInstanceRequest request);

    CompletableFuture<DeleteSynchronizationJobResponse> deleteSynchronizationJob(DeleteSynchronizationJobRequest request);

    CompletableFuture<DescirbeMigrationJobsResponse> descirbeMigrationJobs(DescirbeMigrationJobsRequest request);

    CompletableFuture<DescribeInitializationStatusResponse> describeInitializationStatus(DescribeInitializationStatusRequest request);

    CompletableFuture<DescribeMigrationJobDetailResponse> describeMigrationJobDetail(DescribeMigrationJobDetailRequest request);

    CompletableFuture<DescribeMigrationJobStatusResponse> describeMigrationJobStatus(DescribeMigrationJobStatusRequest request);

    CompletableFuture<DescribeMigrationJobsResponse> describeMigrationJobs(DescribeMigrationJobsRequest request);

    CompletableFuture<DescribeSubscriptionInstanceStatusResponse> describeSubscriptionInstanceStatus(DescribeSubscriptionInstanceStatusRequest request);

    CompletableFuture<DescribeSubscriptionInstancesResponse> describeSubscriptionInstances(DescribeSubscriptionInstancesRequest request);

    CompletableFuture<DescribeSubscriptionObjectModifyStatusResponse> describeSubscriptionObjectModifyStatus(DescribeSubscriptionObjectModifyStatusRequest request);

    CompletableFuture<DescribeSynchronizationJobStatusResponse> describeSynchronizationJobStatus(DescribeSynchronizationJobStatusRequest request);

    CompletableFuture<DescribeSynchronizationJobsResponse> describeSynchronizationJobs(DescribeSynchronizationJobsRequest request);

    CompletableFuture<DescribeSynchronizationObjectModifyStatusResponse> describeSynchronizationObjectModifyStatus(DescribeSynchronizationObjectModifyStatusRequest request);

    CompletableFuture<ModifyConsumptionTimestampResponse> modifyConsumptionTimestamp(ModifyConsumptionTimestampRequest request);

    CompletableFuture<ModifyMigrationObjectResponse> modifyMigrationObject(ModifyMigrationObjectRequest request);

    CompletableFuture<ModifySubscriptionObjectResponse> modifySubscriptionObject(ModifySubscriptionObjectRequest request);

    CompletableFuture<ModifySynchronizationObjectResponse> modifySynchronizationObject(ModifySynchronizationObjectRequest request);

    CompletableFuture<StartMigrationJobResponse> startMigrationJob(StartMigrationJobRequest request);

    CompletableFuture<StartSubscriptionInstanceResponse> startSubscriptionInstance(StartSubscriptionInstanceRequest request);

    CompletableFuture<StartSynchronizationJobResponse> startSynchronizationJob(StartSynchronizationJobRequest request);

    CompletableFuture<StopMigrationJobResponse> stopMigrationJob(StopMigrationJobRequest request);

    CompletableFuture<SuspendMigrationJobResponse> suspendMigrationJob(SuspendMigrationJobRequest request);

    CompletableFuture<SuspendSynchronizationJobResponse> suspendSynchronizationJob(SuspendSynchronizationJobRequest request);

}
