// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dts20200101.models.*;
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

    /**
      * After you call this operation to configure a data migration task, the task will be automatically started. You do not need to call the [StartMigrationJob](~~49429~~) operation to start the task.
      * A data migration task may fail to be started due to precheck failures. You can call the [DescribeMigrationJobStatus](~~49433~~) operation to query the error messages about precheck failures. Then, you can fix the issue based on the error messages. After you fix the issue, you must call the [StartMigrationJob](~~49429~~) operation to restart the data migration task.
      *
     */
    CompletableFuture<ConfigureMigrationJobResponse> configureMigrationJob(ConfigureMigrationJobRequest request);

    CompletableFuture<ConfigureMigrationJobAlertResponse> configureMigrationJobAlert(ConfigureMigrationJobAlertRequest request);

    CompletableFuture<ConfigureSubscriptionResponse> configureSubscription(ConfigureSubscriptionRequest request);

    /**
      * The operation that you want to perform. Set the value to **ConfigureSubscriptionInstance**.
      *
     */
    CompletableFuture<ConfigureSubscriptionInstanceResponse> configureSubscriptionInstance(ConfigureSubscriptionInstanceRequest request);

    CompletableFuture<ConfigureSubscriptionInstanceAlertResponse> configureSubscriptionInstanceAlert(ConfigureSubscriptionInstanceAlertRequest request);

    /**
      * Before you call this operation, you must call the [CreateSynchronizationJob](~~49446~~) operation to create a data synchronization instance.
      * > 
      * *   After you call this operation to configure a data synchronization task, the task will be automatically started and prechecked. You do not need to call the [StartSynchronizationJob](~~49448~~) operation to start the task.
      * *   A data synchronization task may fail to be started due to precheck failures. You can call the [DescribeSynchronizationJobStatus](~~49453~~) operation to query the status of the task. Then, you can change parameter settings based on the error messages about the precheck failures. After you fix the issue, you must call the [StartSynchronizationJob](~~49448~~) operation to restart the data synchronization task.
      *
     */
    CompletableFuture<ConfigureSynchronizationJobResponse> configureSynchronizationJob(ConfigureSynchronizationJobRequest request);

    CompletableFuture<ConfigureSynchronizationJobAlertResponse> configureSynchronizationJobAlert(ConfigureSynchronizationJobAlertRequest request);

    /**
      * When you use Data Transmission Service (DTS) to synchronize data, other data sources may write data to the destination instance. In this case, data may become inconsistent between the source and destination instances. To ensure data consistency, you can enable image matching.
      * After you call this operation, you can call the [DescribeSynchronizationJobReplicatorCompare](~~199183~~) operation to verify whether image matching is enabled for the data synchronization instance.
      *
     */
    CompletableFuture<ConfigureSynchronizationJobReplicatorCompareResponse> configureSynchronizationJobReplicatorCompare(ConfigureSynchronizationJobReplicatorCompareRequest request);

    CompletableFuture<CountJobByConditionResponse> countJobByCondition(CountJobByConditionRequest request);

    CompletableFuture<CreateConsumerChannelResponse> createConsumerChannel(CreateConsumerChannelRequest request);

    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    CompletableFuture<CreateDedicatedClusterMonitorRuleResponse> createDedicatedClusterMonitorRule(CreateDedicatedClusterMonitorRuleRequest request);

    /**
      * *   Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of DTS.
      * *   If you want to run a DTS task on a DTS dedicated cluster, you must configure the task before you purchase a DTS instance. You can call the [ConfigureDtsJob](~~208399~~) operation to configure a DTS task.
      *
     */
    CompletableFuture<CreateDtsInstanceResponse> createDtsInstance(CreateDtsInstanceRequest request);

    /**
      * DTS provides the following metrics for DTS tasks:************
      * *   **Latency**: DTS monitors the latency of a DTS task. If the latency of the task exceeds the specified threshold, an alert is triggered. Unit: seconds.
      * *   **Status**: DTS monitors the status of a DTS task. If the state of the task changes to **Error** or **Restore**, an alert is triggered.
      * *   **Full Timeout**: DTS monitors the duration of a DTS task. If the duration of the task exceeds the specified threshold, an alert is triggered. Unit: hours.
      *
     */
    CompletableFuture<CreateJobMonitorRuleResponse> createJobMonitorRule(CreateJobMonitorRuleRequest request);

    /**
      * >  This API operation is outdated. We recommend that you use the new version. For more information, see [CreateDtsInstance](~~208270~~).
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
      * After you purchase a data migration instance, you must call the [ConfigureMigrationJob](~~324260~~) operation to configure a data migration task.
      *
     */
    CompletableFuture<CreateMigrationJobResponse> createMigrationJob(CreateMigrationJobRequest request);

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
      *
     */
    CompletableFuture<CreateSubscriptionInstanceResponse> createSubscriptionInstance(CreateSubscriptionInstanceRequest request);

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
      * After you purchase a data synchronization instance, you must call the [ConfigureSynchronizationJob](~~49447~~) operation to configure a data synchronization task. Then, the task is automatically started.
      *
     */
    CompletableFuture<CreateSynchronizationJobResponse> createSynchronizationJob(CreateSynchronizationJobRequest request);

    CompletableFuture<DeleteConsumerChannelResponse> deleteConsumerChannel(DeleteConsumerChannelRequest request);

    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteDtsJobResponse> deleteDtsJob(DeleteDtsJobRequest request);

    CompletableFuture<DeleteDtsJobsResponse> deleteDtsJobs(DeleteDtsJobsRequest request);

    /**
      * >  After a data migration instance is released, it cannot be recovered.
      *
     */
    CompletableFuture<DeleteMigrationJobResponse> deleteMigrationJob(DeleteMigrationJobRequest request);

    /**
      * >  After a change tracking instance is released, it cannot be recovered.
      *
     */
    CompletableFuture<DeleteSubscriptionInstanceResponse> deleteSubscriptionInstance(DeleteSubscriptionInstanceRequest request);

    /**
      * >  After a data synchronization instance is released, it cannot be recovered.
      *
     */
    CompletableFuture<DeleteSynchronizationJobResponse> deleteSynchronizationJob(DeleteSynchronizationJobRequest request);

    CompletableFuture<DescribeChannelAccountResponse> describeChannelAccount(DescribeChannelAccountRequest request);

    CompletableFuture<DescribeCheckJobsResponse> describeCheckJobs(DescribeCheckJobsRequest request);

    CompletableFuture<DescribeClusterOperateLogsResponse> describeClusterOperateLogs(DescribeClusterOperateLogsRequest request);

    CompletableFuture<DescribeClusterUsedUtilizationResponse> describeClusterUsedUtilization(DescribeClusterUsedUtilizationRequest request);

    CompletableFuture<DescribeConnectionStatusResponse> describeConnectionStatus(DescribeConnectionStatusRequest request);

    CompletableFuture<DescribeConsumerChannelResponse> describeConsumerChannel(DescribeConsumerChannelRequest request);

    CompletableFuture<DescribeConsumerGroupResponse> describeConsumerGroup(DescribeConsumerGroupRequest request);

    /**
      * If the **source or destination instance** is an **on-premises database**, you need to call this operation to query the CIDR blocks of DTS servers. Then, you need to add the CIDR blocks of DTS servers to the security settings of the source or destination instance, for example, the firewall of your database. For more information, see [Add the CIDR blocks of DTS servers to the security settings of on-premises databases](~~176627~~).
      * >  If the **source or destination database** is an **ApsaraDB database instance** (such as RDS instance and ApsaraDB for MongoDB instance) or a **self-managed database hosted on ECS**, you do not need to add the CIDR blocks. When you click **Set Whitelist and Next** in the DTS console, DTS automatically add the CIDR blocks of DTS servers to the security settings of the source or destination instance.
      *
     */
    CompletableFuture<DescribeDTSIPResponse> describeDTSIP(DescribeDTSIPRequest request);

    CompletableFuture<DescribeDataCheckReportUrlResponse> describeDataCheckReportUrl(DescribeDataCheckReportUrlRequest request);

    CompletableFuture<DescribeDataCheckTableDetailsResponse> describeDataCheckTableDetails(DescribeDataCheckTableDetailsRequest request);

    CompletableFuture<DescribeDataCheckTableDiffDetailsResponse> describeDataCheckTableDiffDetails(DescribeDataCheckTableDiffDetailsRequest request);

    CompletableFuture<DescribeDedicatedClusterResponse> describeDedicatedCluster(DescribeDedicatedClusterRequest request);

    CompletableFuture<DescribeDedicatedClusterMonitorRuleResponse> describeDedicatedClusterMonitorRule(DescribeDedicatedClusterMonitorRuleRequest request);

    CompletableFuture<DescribeDtsEtlJobVersionInfoResponse> describeDtsEtlJobVersionInfo(DescribeDtsEtlJobVersionInfoRequest request);

    CompletableFuture<DescribeDtsJobDetailResponse> describeDtsJobDetail(DescribeDtsJobDetailRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Dts\\&api=DescribeDtsJobs\\&type=RPC\\&version=2020-01-01)
      *
     */
    CompletableFuture<DescribeDtsJobsResponse> describeDtsJobs(DescribeDtsJobsRequest request);

    CompletableFuture<DescribeDtsServiceLogResponse> describeDtsServiceLog(DescribeDtsServiceLogRequest request);

    /**
      * Before you call this operation, you must call the [SwitchSynchronizationEndpoint](~~201858~~) operation to change the database connection settings.
      *
     */
    CompletableFuture<DescribeEndpointSwitchStatusResponse> describeEndpointSwitchStatus(DescribeEndpointSwitchStatusRequest request);

    CompletableFuture<DescribeEtlJobLogsResponse> describeEtlJobLogs(DescribeEtlJobLogsRequest request);

    CompletableFuture<DescribeInitializationStatusResponse> describeInitializationStatus(DescribeInitializationStatusRequest request);

    CompletableFuture<DescribeJobMonitorRuleResponse> describeJobMonitorRule(DescribeJobMonitorRuleRequest request);

    CompletableFuture<DescribeMetricListResponse> describeMetricList(DescribeMetricListRequest request);

    CompletableFuture<DescribeMigrationJobAlertResponse> describeMigrationJobAlert(DescribeMigrationJobAlertRequest request);

    /**
      * When you call this operation, the data migration task must be in the Migrating, Failed, Paused, or Finished state.
      *
     */
    CompletableFuture<DescribeMigrationJobDetailResponse> describeMigrationJobDetail(DescribeMigrationJobDetailRequest request);

    CompletableFuture<DescribeMigrationJobStatusResponse> describeMigrationJobStatus(DescribeMigrationJobStatusRequest request);

    CompletableFuture<DescribeMigrationJobsResponse> describeMigrationJobs(DescribeMigrationJobsRequest request);

    CompletableFuture<DescribePreCheckStatusResponse> describePreCheckStatus(DescribePreCheckStatusRequest request);

    CompletableFuture<DescribeSubscriptionInstanceAlertResponse> describeSubscriptionInstanceAlert(DescribeSubscriptionInstanceAlertRequest request);

    CompletableFuture<DescribeSubscriptionInstanceStatusResponse> describeSubscriptionInstanceStatus(DescribeSubscriptionInstanceStatusRequest request);

    CompletableFuture<DescribeSubscriptionInstancesResponse> describeSubscriptionInstances(DescribeSubscriptionInstancesRequest request);

    /**
      * *   When Data Transmission Service (DTS) tracks data changes from a PolarDB-X 1.0 instance, data is distributed across the attached ApsaraDB RDS for MySQL instances. DTS runs a subtask for each ApsaraDB RDS for MySQL instance. You can call this operation to query the details of the subtasks in a distributed change tracking task.
      * *   You can call the [DescribeDtsJobs](~~209702~~) operation to query the ID of the change tracking instance and the ID of the consumer group.
      *
     */
    CompletableFuture<DescribeSubscriptionMetaResponse> describeSubscriptionMeta(DescribeSubscriptionMetaRequest request);

    CompletableFuture<DescribeSynchronizationJobAlertResponse> describeSynchronizationJobAlert(DescribeSynchronizationJobAlertRequest request);

    CompletableFuture<DescribeSynchronizationJobReplicatorCompareResponse> describeSynchronizationJobReplicatorCompare(DescribeSynchronizationJobReplicatorCompareRequest request);

    CompletableFuture<DescribeSynchronizationJobStatusResponse> describeSynchronizationJobStatus(DescribeSynchronizationJobStatusRequest request);

    CompletableFuture<DescribeSynchronizationJobStatusListResponse> describeSynchronizationJobStatusList(DescribeSynchronizationJobStatusListRequest request);

    CompletableFuture<DescribeSynchronizationJobsResponse> describeSynchronizationJobs(DescribeSynchronizationJobsRequest request);

    /**
      * Before you call this operation, you must call the [ModifySynchronizationObject](~~49451~~) operation to obtain the task ID.
      *
     */
    CompletableFuture<DescribeSynchronizationObjectModifyStatusResponse> describeSynchronizationObjectModifyStatus(DescribeSynchronizationObjectModifyStatusRequest request);

    CompletableFuture<DescribeTagKeysResponse> describeTagKeys(DescribeTagKeysRequest request);

    CompletableFuture<DescribeTagValuesResponse> describeTagValues(DescribeTagValuesRequest request);

    /**
      * *   The node must be an ApsaraDB RDS for MySQL instance or a self-managed MySQL database that is connected over Cloud Enterprise Network (CEN).
      * *   This operation is used to initialize the built-in account named rdsdt_dtsacct on a node of an active geo-redundancy database cluster. DTS uses this account to connect to the node and perform data synchronization tasks.
      *
     */
    CompletableFuture<InitDtsRdsInstanceResponse> initDtsRdsInstance(InitDtsRdsInstanceRequest request);

    CompletableFuture<ListDedicatedClusterResponse> listDedicatedCluster(ListDedicatedClusterRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyConsumerChannelResponse> modifyConsumerChannel(ModifyConsumerChannelRequest request);

    /**
      * > 
      * *   This operation is applicable to only the new version of the change tracking feature. To use the new version, you must specify the SubscriptionInstanceNetworkType parameter when you call the ConfigureSubscriptionInstance operation. If you use the previous version, you do not need to specify the **SubscriptionInstanceNetworkType** parameter.
      * *   When you call this operation, the change tracking task must be in the NotStarted, Failed, Normal, or Abnormal state.
      *
     */
    CompletableFuture<ModifyConsumerGroupPasswordResponse> modifyConsumerGroupPassword(ModifyConsumerGroupPasswordRequest request);

    /**
      * > 
      * *   This operation is applicable to only the previous version of the change tracking feature. To use the new version, you must specify the SubscriptionInstanceNetworkType parameter when you call the [ConfigureSubscriptionInstance](~~49437~~) operation. If you use the previous version, you do not need to specify the **SubscriptionInstanceNetworkType** parameter.
      * *   If you use the new version, you need to set the consumption checkpoint on the change tracking client.
      * *   When you call this operation, you must stop the change tracking client, and the change tracking task must be in the Normal state.
      *
     */
    CompletableFuture<ModifyConsumptionTimestampResponse> modifyConsumptionTimestamp(ModifyConsumptionTimestampRequest request);

    /**
      * You can modify only the overcommit ratio.
      *
     */
    CompletableFuture<ModifyDedicatedClusterResponse> modifyDedicatedCluster(ModifyDedicatedClusterRequest request);

    CompletableFuture<ModifyDtsJobConfigResponse> modifyDtsJobConfig(ModifyDtsJobConfigRequest request);

    CompletableFuture<ModifyDtsJobDedicatedClusterResponse> modifyDtsJobDedicatedCluster(ModifyDtsJobDedicatedClusterRequest request);

    /**
      * *   DTS allows you to upgrade or downgrade the configurations of DTS instances in a dedicated cluster. You can adjust the resources that are occupied for task execution to dynamically adjust the number of tasks that can be scheduled in the cluster. This way, you can reduce the total number of DUs required for the cluster or release DUs.
      * *   Before you modify the upper limit of DUs for a DTS task, make sure that sufficient DUs are available.
      *
     */
    CompletableFuture<ModifyDtsJobDuLimitResponse> modifyDtsJobDuLimit(ModifyDtsJobDuLimitRequest request);

    CompletableFuture<ModifyDtsJobNameResponse> modifyDtsJobName(ModifyDtsJobNameRequest request);

    CompletableFuture<ModifyDtsJobPasswordResponse> modifyDtsJobPassword(ModifyDtsJobPasswordRequest request);

    CompletableFuture<ModifyDynamicConfigResponse> modifyDynamicConfig(ModifyDynamicConfigRequest request);

    CompletableFuture<ModifySubscriptionResponse> modifySubscription(ModifySubscriptionRequest request);

    /**
      * When you call this operation, the change tracking task must be in the Normal, NotStarted, or Failed state.
      * > 
      * *   If you call this operation to modify the objects of a change tracking task that is in the Normal state, DTS automatically calls the [StartSubscriptionInstance](~~49438~~) to restart the task.
      * *   If you call this operation to modify the objects of a change tracking task that is in the NotStarted or Failed state, DTS does not automatically start the task. You must call the [StartSubscriptionInstance](~~49438~~) to restart the task.
      *
     */
    CompletableFuture<ModifySubscriptionObjectResponse> modifySubscriptionObject(ModifySubscriptionObjectRequest request);

    /**
      * >  When you call this operation, the data synchronization task must be in the Not Started or Synchronizing state.
      *
     */
    CompletableFuture<ModifySynchronizationObjectResponse> modifySynchronizationObject(ModifySynchronizationObjectRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
      * >  If you clear the configurations of a data synchronization or change tracking task, DTS deletes the task. Then, DTS creates another task. The task is in the Not Configured state. You must call the [ConfigureDtsJob](~~208399~~) operation reconfigure the task.
      *
     */
    CompletableFuture<ResetDtsJobResponse> resetDtsJob(ResetDtsJobRequest request);

    /**
      * >  If you clear the configurations of a data synchronization task, the task will be released. To start the task again, you must call the **ConfigureSynchronizationJob** operation to reconfigure the task.
      *
     */
    CompletableFuture<ResetSynchronizationJobResponse> resetSynchronizationJob(ResetSynchronizationJobRequest request);

    CompletableFuture<ReverseTwoWayDirectionResponse> reverseTwoWayDirection(ReverseTwoWayDirectionRequest request);

    /**
      * If you call this operation to ignore all precheck items, you must call the [StartMigrationJob](https://www.alibabacloud.com/help/zh/doc-detail/49429.htm) or [StartSynchronizationJob](https://www.alibabacloud.com/help/zh/doc-detail/49448.htm) operation. DTS performs a precheck again. After the data migration or synchronization task passes the precheck, the task will be automatically started.
      *
     */
    CompletableFuture<ShieldPrecheckResponse> shieldPrecheck(ShieldPrecheckRequest request);

    CompletableFuture<SkipPreCheckResponse> skipPreCheck(SkipPreCheckRequest request);

    CompletableFuture<StartDtsJobResponse> startDtsJob(StartDtsJobRequest request);

    CompletableFuture<StartDtsJobsResponse> startDtsJobs(StartDtsJobsRequest request);

    /**
      * >  When you call this operation, the data migration task must be in the Not Started, Paused, or Migration Failed state.
      *
     */
    CompletableFuture<StartMigrationJobResponse> startMigrationJob(StartMigrationJobRequest request);

    /**
      * When you call this operation, the change tracking task must be in the NotStarted or Failed state.
      *
     */
    CompletableFuture<StartSubscriptionInstanceResponse> startSubscriptionInstance(StartSubscriptionInstanceRequest request);

    /**
      * > 
      * *   Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service) of Data Transmission Service (DTS).
      * *   When you call this operation, the data synchronization task must be in the NotStarted, Failed, or Suspending state. If you call this operation to start a task that is in the NotStarted state, the task will be prechecked.
      *
     */
    CompletableFuture<StartSynchronizationJobResponse> startSynchronizationJob(StartSynchronizationJobRequest request);

    CompletableFuture<StopDedicatedClusterResponse> stopDedicatedCluster(StopDedicatedClusterRequest request);

    CompletableFuture<StopDtsJobResponse> stopDtsJob(StopDtsJobRequest request);

    CompletableFuture<StopDtsJobsResponse> stopDtsJobs(StopDtsJobsRequest request);

    /**
      * >  After you call this operation to stop a data migration task, the status of the task changes to Finished and you cannot restart the task by calling the [StartMigrationJob](~~49429~~) operation.
      *
     */
    CompletableFuture<StopMigrationJobResponse> stopMigrationJob(StopMigrationJobRequest request);

    CompletableFuture<SummaryJobDetailResponse> summaryJobDetail(SummaryJobDetailRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<SuspendDtsJobResponse> suspendDtsJob(SuspendDtsJobRequest request);

    CompletableFuture<SuspendDtsJobsResponse> suspendDtsJobs(SuspendDtsJobsRequest request);

    /**
      * > 
      * *   If a data migration task is performing incremental data migration, we recommend that you do not pause the task for more than 6 hours. Otherwise, you will not be able to call the [StartMigrationJob](~~49429~~) operation to restart the task.
      * *   If you select incremental data migration as the migration type for a pay-as-you-go instance, DTS charges a fee even when the task is paused. This is because DTS only stops writing data to the destination database. DTS continues to pull the logs of the source database so that the task can resume quickly after it is restarted. Therefore, incremental data migration consumes resources such as the bandwidth of the source database.
      *
     */
    CompletableFuture<SuspendMigrationJobResponse> suspendMigrationJob(SuspendMigrationJobRequest request);

    /**
      * > 
      * *   When you call this operation, the data synchronization task must be in the Synchronizing state.
      * *   We recommend that you do not pause a data synchronization task for more than 6 hours. Otherwise, the task cannot be started again.
      * *   If the billing method is pay-as-you-go, DTS charges a fee even when the task is paused. This is because DTS only stops writing data to the destination database. DTS continues to pull the logs of the source database so that the task can resume quickly after it is restarted. Therefore, data synchronization consumes resources such as the bandwidth of the source database.
      *
     */
    CompletableFuture<SuspendSynchronizationJobResponse> suspendSynchronizationJob(SuspendSynchronizationJobRequest request);

    CompletableFuture<SwitchPhysicalDtsJobToCloudResponse> switchPhysicalDtsJobToCloud(SwitchPhysicalDtsJobToCloudRequest request);

    /**
      * *   If the source or destination database is a self-managed MySQL database connected over the Internet, Elastic Compute Service (ECS) or Express Connect, you must call this operation to update the connection settings.
      * *   If the source or destination database is hosted on an ApsaraDB instance (such as ApsaraDB RDS instance and ApsaraDB for MongoDB instance), DTS automatically updates the connection settings. You do not need to call this operation.
      * > *   For two-way synchronization tasks, if you perform a primary/secondary switchover on the source or destination database, you must call this operation twice to update the connection settings.
      *         For example, if you perform a primary/secondary switchover on the destination database of the forward direction, you must call this operation twice. In the first call, set the **SynchronizationDirection** parameter to **Forward**, set the **Endpoint.Type **parameter to **Destination**, and configure the connection settings. In the second call, set the **SynchronizationDirection** parameter to **Reverse**, set the **Endpoint.Type **parameter to **Source**, and configure the connection settings.
      *
     */
    CompletableFuture<SwitchSynchronizationEndpointResponse> switchSynchronizationEndpoint(SwitchSynchronizationEndpointRequest request);

    /**
      * If you have a large number of instances, you can create multiple tags and bind these tags to the instances. Then, you can filter the instances by tag.
      * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.
      * *   If the tag that you specify does not exist, this tag is automatically created and bound to the specified instance.
      * *   If the key of the specified tag is the same as that of an existing tag, the specified tag overwrites the existing tag.
      * *   You can bind up to 20 tags to each instance.
      * *   You can bind tags to up to 50 instances in each call.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TransferInstanceClassResponse> transferInstanceClass(TransferInstanceClassRequest request);

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of DTS.
      * *   The billing method of subscription instances cannot be changed to pay-as-you-go. To prevent resource waste, determine whether you need to change the billing method of your resources.
      * *   Data migration instances are all pay-as-you-go instances. You do not need to change the billing method of data migration instances.
      * *   After you change the billing method from pay-as-you-go to subscription, the DTS instance is not affected.
      *
     */
    CompletableFuture<TransferPayTypeResponse> transferPayType(TransferPayTypeRequest request);

    /**
      * >  If a tag is unbound from an instance and is not bound to other instances, the tag is deleted.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS)
      * When you call this operation, take note of the following information:
      * *   The source and destination databases of the data synchronization task are both **MySQL** databases.
      * *   The synchronization topology of the data synchronization task is **one-way synchronization**.
      * *   The data synchronization task is in the **Synchronizing** state.
      * *   The upgrade operation causes data synchronization latency of about 5 seconds. We recommend that you perform this operation during off-peak hours.
      *
     */
    CompletableFuture<UpgradeTwoWayResponse> upgradeTwoWay(UpgradeTwoWayRequest request);

    /**
      * The operation that you want to perform. Set the value to **WhiteIpList**.
      *
     */
    CompletableFuture<WhiteIpListResponse> whiteIpList(WhiteIpListRequest request);

}
