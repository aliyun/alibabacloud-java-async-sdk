// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dts20200101.models.*;
import darabonba.core.*;
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
     * @param request the request parameters of ConfigureMigrationJob  ConfigureMigrationJobRequest
     * @return ConfigureMigrationJobResponse
     */
    CompletableFuture<ConfigureMigrationJobResponse> configureMigrationJob(ConfigureMigrationJobRequest request);

    /**
     * @param request the request parameters of ConfigureMigrationJobAlert  ConfigureMigrationJobAlertRequest
     * @return ConfigureMigrationJobAlertResponse
     */
    CompletableFuture<ConfigureMigrationJobAlertResponse> configureMigrationJobAlert(ConfigureMigrationJobAlertRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can preview related API operation parameters when you configure a change tracking task in the Data Transmission Service (DTS) console. This helps you configure the request parameters of this API operation. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview the request parameters of API operations</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ConfigureSubscription  ConfigureSubscriptionRequest
     * @return ConfigureSubscriptionResponse
     */
    CompletableFuture<ConfigureSubscriptionResponse> configureSubscription(ConfigureSubscriptionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/49436.html">CreateSubscriptionInstance</a> operation to create a change tracking instance.</p>
     * 
     * @param request the request parameters of ConfigureSubscriptionInstance  ConfigureSubscriptionInstanceRequest
     * @return ConfigureSubscriptionInstanceResponse
     */
    CompletableFuture<ConfigureSubscriptionInstanceResponse> configureSubscriptionInstance(ConfigureSubscriptionInstanceRequest request);

    /**
     * @param request the request parameters of ConfigureSubscriptionInstanceAlert  ConfigureSubscriptionInstanceAlertRequest
     * @return ConfigureSubscriptionInstanceAlertResponse
     */
    CompletableFuture<ConfigureSubscriptionInstanceAlertResponse> configureSubscriptionInstanceAlert(ConfigureSubscriptionInstanceAlertRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/49446.html">CreateSynchronizationJob</a> operation to create a data synchronization instance.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>After you call this operation to configure a data synchronization task, the task will be automatically started and prechecked. You do not need to call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to start the task.</li>
     * <li>A data synchronization task may fail to be started due to precheck failures. You can call the <a href="https://help.aliyun.com/document_detail/49453.html">DescribeSynchronizationJobStatus</a> operation to query the status of the task. Then, you can change parameter settings based on the error messages about the precheck failures. After you fix the issue, you must call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to restart the data synchronization task.</li>
     * </ul>
     * 
     * @param request the request parameters of ConfigureSynchronizationJob  ConfigureSynchronizationJobRequest
     * @return ConfigureSynchronizationJobResponse
     */
    CompletableFuture<ConfigureSynchronizationJobResponse> configureSynchronizationJob(ConfigureSynchronizationJobRequest request);

    /**
     * @param request the request parameters of ConfigureSynchronizationJobAlert  ConfigureSynchronizationJobAlertRequest
     * @return ConfigureSynchronizationJobAlertResponse
     */
    CompletableFuture<ConfigureSynchronizationJobAlertResponse> configureSynchronizationJobAlert(ConfigureSynchronizationJobAlertRequest request);

    /**
     * @param request the request parameters of ConfigureSynchronizationJobReplicatorCompare  ConfigureSynchronizationJobReplicatorCompareRequest
     * @return ConfigureSynchronizationJobReplicatorCompareResponse
     */
    CompletableFuture<ConfigureSynchronizationJobReplicatorCompareResponse> configureSynchronizationJobReplicatorCompare(ConfigureSynchronizationJobReplicatorCompareRequest request);

    /**
     * @param request the request parameters of CountJobByCondition  CountJobByConditionRequest
     * @return CountJobByConditionResponse
     */
    CompletableFuture<CountJobByConditionResponse> countJobByCondition(CountJobByConditionRequest request);

    /**
     * @param request the request parameters of CreateConsumerChannel  CreateConsumerChannelRequest
     * @return CreateConsumerChannelResponse
     */
    CompletableFuture<CreateConsumerChannelResponse> createConsumerChannel(CreateConsumerChannelRequest request);

    /**
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    /**
     * @param request the request parameters of CreateDedicatedClusterMonitorRule  CreateDedicatedClusterMonitorRuleRequest
     * @return CreateDedicatedClusterMonitorRuleResponse
     */
    CompletableFuture<CreateDedicatedClusterMonitorRuleResponse> createDedicatedClusterMonitorRule(CreateDedicatedClusterMonitorRuleRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of DTS.</p>
     * <ul>
     * <li>If you want to run a DTS task on a DTS dedicated cluster, you must configure the task before you purchase a DTS instance. You can call the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to configure a DTS task.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDtsInstance  CreateDtsInstanceRequest
     * @return CreateDtsInstanceResponse
     */
    CompletableFuture<CreateDtsInstanceResponse> createDtsInstance(CreateDtsInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>DTS provides the following metrics for DTS tasks:************</p>
     * <ul>
     * <li><strong>Latency</strong>: DTS monitors the latency of a DTS task. If the latency of the task exceeds the specified threshold, an alert is triggered. The threshold is specified in units of seconds.</li>
     * <li><strong>Status</strong>: DTS monitors the status of a DTS task. If the state of the task changes to <strong>Error</strong> or <strong>Restore</strong>, an alert is triggered.</li>
     * <li><strong>Full Timeout</strong>: DTS monitors the duration of a DTS task. If the duration of the task exceeds the specified threshold, an alert is triggered. The threshold is specified in units of hours.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateJobMonitorRule  CreateJobMonitorRuleRequest
     * @return CreateJobMonitorRuleResponse
     */
    CompletableFuture<CreateJobMonitorRuleResponse> createJobMonitorRule(CreateJobMonitorRuleRequest request);

    /**
     * @param request the request parameters of CreateMigrationJob  CreateMigrationJobRequest
     * @return CreateMigrationJobResponse
     */
    CompletableFuture<CreateMigrationJobResponse> createMigrationJob(CreateMigrationJobRequest request);

    /**
     * <b>description</b> :
     * <p>调用接口创建的反向任务会立即进行预检查，预检查通过后会进行增量数据采集，增量数据写入模块不会运行（需要调用<strong>StartReverseWriter</strong>接口运行）。</p>
     * <blockquote>
     * <p>创建的反向任务固定为同步任务，且只有增量写入模块。</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateReverseDtsJob  CreateReverseDtsJobRequest
     * @return CreateReverseDtsJobResponse
     */
    CompletableFuture<CreateReverseDtsJobResponse> createReverseDtsJob(CreateReverseDtsJobRequest request);

    /**
     * @param request the request parameters of CreateSubscriptionInstance  CreateSubscriptionInstanceRequest
     * @return CreateSubscriptionInstanceResponse
     */
    CompletableFuture<CreateSubscriptionInstanceResponse> createSubscriptionInstance(CreateSubscriptionInstanceRequest request);

    /**
     * @param request the request parameters of CreateSynchronizationJob  CreateSynchronizationJobRequest
     * @return CreateSynchronizationJobResponse
     */
    CompletableFuture<CreateSynchronizationJobResponse> createSynchronizationJob(CreateSynchronizationJobRequest request);

    /**
     * @param request the request parameters of DeleteConsumerChannel  DeleteConsumerChannelRequest
     * @return DeleteConsumerChannelResponse
     */
    CompletableFuture<DeleteConsumerChannelResponse> deleteConsumerChannel(DeleteConsumerChannelRequest request);

    /**
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    /**
     * @param request the request parameters of DeleteDtsJob  DeleteDtsJobRequest
     * @return DeleteDtsJobResponse
     */
    CompletableFuture<DeleteDtsJobResponse> deleteDtsJob(DeleteDtsJobRequest request);

    /**
     * @param request the request parameters of DeleteDtsJobs  DeleteDtsJobsRequest
     * @return DeleteDtsJobsResponse
     */
    CompletableFuture<DeleteDtsJobsResponse> deleteDtsJobs(DeleteDtsJobsRequest request);

    /**
     * @param request the request parameters of DeleteMigrationJob  DeleteMigrationJobRequest
     * @return DeleteMigrationJobResponse
     */
    CompletableFuture<DeleteMigrationJobResponse> deleteMigrationJob(DeleteMigrationJobRequest request);

    /**
     * @param request the request parameters of DeleteSubscriptionInstance  DeleteSubscriptionInstanceRequest
     * @return DeleteSubscriptionInstanceResponse
     */
    CompletableFuture<DeleteSubscriptionInstanceResponse> deleteSubscriptionInstance(DeleteSubscriptionInstanceRequest request);

    /**
     * @param request the request parameters of DeleteSynchronizationJob  DeleteSynchronizationJobRequest
     * @return DeleteSynchronizationJobResponse
     */
    CompletableFuture<DeleteSynchronizationJobResponse> deleteSynchronizationJob(DeleteSynchronizationJobRequest request);

    /**
     * @param request the request parameters of DescribeChannelAccount  DescribeChannelAccountRequest
     * @return DescribeChannelAccountResponse
     */
    CompletableFuture<DescribeChannelAccountResponse> describeChannelAccount(DescribeChannelAccountRequest request);

    /**
     * @param request the request parameters of DescribeCheckJobs  DescribeCheckJobsRequest
     * @return DescribeCheckJobsResponse
     */
    CompletableFuture<DescribeCheckJobsResponse> describeCheckJobs(DescribeCheckJobsRequest request);

    /**
     * @param request the request parameters of DescribeClusterOperateLogs  DescribeClusterOperateLogsRequest
     * @return DescribeClusterOperateLogsResponse
     */
    CompletableFuture<DescribeClusterOperateLogsResponse> describeClusterOperateLogs(DescribeClusterOperateLogsRequest request);

    /**
     * @param request the request parameters of DescribeClusterUsedUtilization  DescribeClusterUsedUtilizationRequest
     * @return DescribeClusterUsedUtilizationResponse
     */
    CompletableFuture<DescribeClusterUsedUtilizationResponse> describeClusterUsedUtilization(DescribeClusterUsedUtilizationRequest request);

    /**
     * @param request the request parameters of DescribeConnectionStatus  DescribeConnectionStatusRequest
     * @return DescribeConnectionStatusResponse
     */
    CompletableFuture<DescribeConnectionStatusResponse> describeConnectionStatus(DescribeConnectionStatusRequest request);

    /**
     * @param request the request parameters of DescribeConsumerChannel  DescribeConsumerChannelRequest
     * @return DescribeConsumerChannelResponse
     */
    CompletableFuture<DescribeConsumerChannelResponse> describeConsumerChannel(DescribeConsumerChannelRequest request);

    /**
     * @param request the request parameters of DescribeConsumerGroup  DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     */
    CompletableFuture<DescribeConsumerGroupResponse> describeConsumerGroup(DescribeConsumerGroupRequest request);

    /**
     * @param request the request parameters of DescribeDTSIP  DescribeDTSIPRequest
     * @return DescribeDTSIPResponse
     */
    CompletableFuture<DescribeDTSIPResponse> describeDTSIP(DescribeDTSIPRequest request);

    /**
     * @param request the request parameters of DescribeDataCheckReportUrl  DescribeDataCheckReportUrlRequest
     * @return DescribeDataCheckReportUrlResponse
     */
    CompletableFuture<DescribeDataCheckReportUrlResponse> describeDataCheckReportUrl(DescribeDataCheckReportUrlRequest request);

    /**
     * @param request the request parameters of DescribeDataCheckTableDetails  DescribeDataCheckTableDetailsRequest
     * @return DescribeDataCheckTableDetailsResponse
     */
    CompletableFuture<DescribeDataCheckTableDetailsResponse> describeDataCheckTableDetails(DescribeDataCheckTableDetailsRequest request);

    /**
     * @param request the request parameters of DescribeDataCheckTableDiffDetails  DescribeDataCheckTableDiffDetailsRequest
     * @return DescribeDataCheckTableDiffDetailsResponse
     */
    CompletableFuture<DescribeDataCheckTableDiffDetailsResponse> describeDataCheckTableDiffDetails(DescribeDataCheckTableDiffDetailsRequest request);

    /**
     * @param request the request parameters of DescribeDedicatedCluster  DescribeDedicatedClusterRequest
     * @return DescribeDedicatedClusterResponse
     */
    CompletableFuture<DescribeDedicatedClusterResponse> describeDedicatedCluster(DescribeDedicatedClusterRequest request);

    /**
     * @param request the request parameters of DescribeDedicatedClusterMonitorRule  DescribeDedicatedClusterMonitorRuleRequest
     * @return DescribeDedicatedClusterMonitorRuleResponse
     */
    CompletableFuture<DescribeDedicatedClusterMonitorRuleResponse> describeDedicatedClusterMonitorRule(DescribeDedicatedClusterMonitorRuleRequest request);

    /**
     * @param request the request parameters of DescribeDtsEtlJobVersionInfo  DescribeDtsEtlJobVersionInfoRequest
     * @return DescribeDtsEtlJobVersionInfoResponse
     */
    CompletableFuture<DescribeDtsEtlJobVersionInfoResponse> describeDtsEtlJobVersionInfo(DescribeDtsEtlJobVersionInfoRequest request);

    /**
     * @param request the request parameters of DescribeDtsJobConfig  DescribeDtsJobConfigRequest
     * @return DescribeDtsJobConfigResponse
     */
    CompletableFuture<DescribeDtsJobConfigResponse> describeDtsJobConfig(DescribeDtsJobConfigRequest request);

    /**
     * @param request the request parameters of DescribeDtsJobDetail  DescribeDtsJobDetailRequest
     * @return DescribeDtsJobDetailResponse
     */
    CompletableFuture<DescribeDtsJobDetailResponse> describeDtsJobDetail(DescribeDtsJobDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Dts%5C&api=DescribeDtsJobs%5C&type=RPC%5C&version=2020-01-01">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DescribeDtsJobs  DescribeDtsJobsRequest
     * @return DescribeDtsJobsResponse
     */
    CompletableFuture<DescribeDtsJobsResponse> describeDtsJobs(DescribeDtsJobsRequest request);

    /**
     * @param request the request parameters of DescribeDtsServiceLog  DescribeDtsServiceLogRequest
     * @return DescribeDtsServiceLogResponse
     */
    CompletableFuture<DescribeDtsServiceLogResponse> describeDtsServiceLog(DescribeDtsServiceLogRequest request);

    /**
     * @param request the request parameters of DescribeEndpointSwitchStatus  DescribeEndpointSwitchStatusRequest
     * @return DescribeEndpointSwitchStatusResponse
     */
    CompletableFuture<DescribeEndpointSwitchStatusResponse> describeEndpointSwitchStatus(DescribeEndpointSwitchStatusRequest request);

    /**
     * @param request the request parameters of DescribeEtlJobLogs  DescribeEtlJobLogsRequest
     * @return DescribeEtlJobLogsResponse
     */
    CompletableFuture<DescribeEtlJobLogsResponse> describeEtlJobLogs(DescribeEtlJobLogsRequest request);

    /**
     * @param request the request parameters of DescribeInitializationStatus  DescribeInitializationStatusRequest
     * @return DescribeInitializationStatusResponse
     */
    CompletableFuture<DescribeInitializationStatusResponse> describeInitializationStatus(DescribeInitializationStatusRequest request);

    /**
     * @param request the request parameters of DescribeJobMonitorRule  DescribeJobMonitorRuleRequest
     * @return DescribeJobMonitorRuleResponse
     */
    CompletableFuture<DescribeJobMonitorRuleResponse> describeJobMonitorRule(DescribeJobMonitorRuleRequest request);

    /**
     * @param request the request parameters of DescribeMetricList  DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    CompletableFuture<DescribeMetricListResponse> describeMetricList(DescribeMetricListRequest request);

    /**
     * @param request the request parameters of DescribeMigrationJobAlert  DescribeMigrationJobAlertRequest
     * @return DescribeMigrationJobAlertResponse
     */
    CompletableFuture<DescribeMigrationJobAlertResponse> describeMigrationJobAlert(DescribeMigrationJobAlertRequest request);

    /**
     * @param request the request parameters of DescribeMigrationJobDetail  DescribeMigrationJobDetailRequest
     * @return DescribeMigrationJobDetailResponse
     */
    CompletableFuture<DescribeMigrationJobDetailResponse> describeMigrationJobDetail(DescribeMigrationJobDetailRequest request);

    /**
     * @param request the request parameters of DescribeMigrationJobStatus  DescribeMigrationJobStatusRequest
     * @return DescribeMigrationJobStatusResponse
     */
    CompletableFuture<DescribeMigrationJobStatusResponse> describeMigrationJobStatus(DescribeMigrationJobStatusRequest request);

    /**
     * @param request the request parameters of DescribeMigrationJobs  DescribeMigrationJobsRequest
     * @return DescribeMigrationJobsResponse
     */
    CompletableFuture<DescribeMigrationJobsResponse> describeMigrationJobs(DescribeMigrationJobsRequest request);

    /**
     * @param request the request parameters of DescribePreCheckStatus  DescribePreCheckStatusRequest
     * @return DescribePreCheckStatusResponse
     */
    CompletableFuture<DescribePreCheckStatusResponse> describePreCheckStatus(DescribePreCheckStatusRequest request);

    /**
     * @param request the request parameters of DescribeSubscriptionInstanceAlert  DescribeSubscriptionInstanceAlertRequest
     * @return DescribeSubscriptionInstanceAlertResponse
     */
    CompletableFuture<DescribeSubscriptionInstanceAlertResponse> describeSubscriptionInstanceAlert(DescribeSubscriptionInstanceAlertRequest request);

    /**
     * @param request the request parameters of DescribeSubscriptionInstanceStatus  DescribeSubscriptionInstanceStatusRequest
     * @return DescribeSubscriptionInstanceStatusResponse
     */
    CompletableFuture<DescribeSubscriptionInstanceStatusResponse> describeSubscriptionInstanceStatus(DescribeSubscriptionInstanceStatusRequest request);

    /**
     * @param request the request parameters of DescribeSubscriptionInstances  DescribeSubscriptionInstancesRequest
     * @return DescribeSubscriptionInstancesResponse
     */
    CompletableFuture<DescribeSubscriptionInstancesResponse> describeSubscriptionInstances(DescribeSubscriptionInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>  When Data Transmission Service (DTS) tracks data changes from a PolarDB-X 1.0 instance, data is distributed across the attached ApsaraDB RDS for MySQL instances. DTS runs a subtask for each ApsaraDB RDS for MySQL instance. You can call this operation to query the details of the subtasks in a distributed change tracking task.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the ID of the change tracking instance and the ID of the consumer group.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSubscriptionMeta  DescribeSubscriptionMetaRequest
     * @return DescribeSubscriptionMetaResponse
     */
    CompletableFuture<DescribeSubscriptionMetaResponse> describeSubscriptionMeta(DescribeSubscriptionMetaRequest request);

    /**
     * @param request the request parameters of DescribeSyncStatus  DescribeSyncStatusRequest
     * @return DescribeSyncStatusResponse
     */
    CompletableFuture<DescribeSyncStatusResponse> describeSyncStatus(DescribeSyncStatusRequest request);

    /**
     * @param request the request parameters of DescribeSynchronizationJobAlert  DescribeSynchronizationJobAlertRequest
     * @return DescribeSynchronizationJobAlertResponse
     */
    CompletableFuture<DescribeSynchronizationJobAlertResponse> describeSynchronizationJobAlert(DescribeSynchronizationJobAlertRequest request);

    /**
     * @param request the request parameters of DescribeSynchronizationJobReplicatorCompare  DescribeSynchronizationJobReplicatorCompareRequest
     * @return DescribeSynchronizationJobReplicatorCompareResponse
     */
    CompletableFuture<DescribeSynchronizationJobReplicatorCompareResponse> describeSynchronizationJobReplicatorCompare(DescribeSynchronizationJobReplicatorCompareRequest request);

    /**
     * @param request the request parameters of DescribeSynchronizationJobStatus  DescribeSynchronizationJobStatusRequest
     * @return DescribeSynchronizationJobStatusResponse
     */
    CompletableFuture<DescribeSynchronizationJobStatusResponse> describeSynchronizationJobStatus(DescribeSynchronizationJobStatusRequest request);

    /**
     * @param request the request parameters of DescribeSynchronizationJobStatusList  DescribeSynchronizationJobStatusListRequest
     * @return DescribeSynchronizationJobStatusListResponse
     */
    CompletableFuture<DescribeSynchronizationJobStatusListResponse> describeSynchronizationJobStatusList(DescribeSynchronizationJobStatusListRequest request);

    /**
     * @param request the request parameters of DescribeSynchronizationJobs  DescribeSynchronizationJobsRequest
     * @return DescribeSynchronizationJobsResponse
     */
    CompletableFuture<DescribeSynchronizationJobsResponse> describeSynchronizationJobs(DescribeSynchronizationJobsRequest request);

    /**
     * @param request the request parameters of DescribeSynchronizationObjectModifyStatus  DescribeSynchronizationObjectModifyStatusRequest
     * @return DescribeSynchronizationObjectModifyStatusResponse
     */
    CompletableFuture<DescribeSynchronizationObjectModifyStatusResponse> describeSynchronizationObjectModifyStatus(DescribeSynchronizationObjectModifyStatusRequest request);

    /**
     * @param request the request parameters of DescribeTagKeys  DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     */
    CompletableFuture<DescribeTagKeysResponse> describeTagKeys(DescribeTagKeysRequest request);

    /**
     * @param request the request parameters of DescribeTagValues  DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     */
    CompletableFuture<DescribeTagValuesResponse> describeTagValues(DescribeTagValuesRequest request);

    /**
     * <b>description</b> :
     * <p>  The node must be an ApsaraDB RDS for MySQL instance or a self-managed MySQL database that is connected over Cloud Enterprise Network (CEN).</p>
     * <ul>
     * <li>This operation is used to initialize the built-in account named rdsdt_dtsacct on a node of an active geo-redundancy database cluster. DTS uses this account to connect to the node and perform data synchronization tasks.</li>
     * </ul>
     * 
     * @param request the request parameters of InitDtsRdsInstance  InitDtsRdsInstanceRequest
     * @return InitDtsRdsInstanceResponse
     */
    CompletableFuture<InitDtsRdsInstanceResponse> initDtsRdsInstance(InitDtsRdsInstanceRequest request);

    /**
     * @param request the request parameters of ListDedicatedCluster  ListDedicatedClusterRequest
     * @return ListDedicatedClusterResponse
     */
    CompletableFuture<ListDedicatedClusterResponse> listDedicatedCluster(ListDedicatedClusterRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyConsumerChannel  ModifyConsumerChannelRequest
     * @return ModifyConsumerChannelResponse
     */
    CompletableFuture<ModifyConsumerChannelResponse> modifyConsumerChannel(ModifyConsumerChannelRequest request);

    /**
     * @param request the request parameters of ModifyConsumerGroupPassword  ModifyConsumerGroupPasswordRequest
     * @return ModifyConsumerGroupPasswordResponse
     */
    CompletableFuture<ModifyConsumerGroupPasswordResponse> modifyConsumerGroupPassword(ModifyConsumerGroupPasswordRequest request);

    /**
     * @param request the request parameters of ModifyConsumptionTimestamp  ModifyConsumptionTimestampRequest
     * @return ModifyConsumptionTimestampResponse
     */
    CompletableFuture<ModifyConsumptionTimestampResponse> modifyConsumptionTimestamp(ModifyConsumptionTimestampRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify only the overcommit ratio.</p>
     * 
     * @param request the request parameters of ModifyDedicatedCluster  ModifyDedicatedClusterRequest
     * @return ModifyDedicatedClusterResponse
     */
    CompletableFuture<ModifyDedicatedClusterResponse> modifyDedicatedCluster(ModifyDedicatedClusterRequest request);

    /**
     * @param request the request parameters of ModifyDtsJobConfig  ModifyDtsJobConfigRequest
     * @return ModifyDtsJobConfigResponse
     */
    CompletableFuture<ModifyDtsJobConfigResponse> modifyDtsJobConfig(ModifyDtsJobConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After a DTS task is migrated from a dedicated cluster to a shared cluster, the task is billed on a pay-as-you-go basis.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDtsJobDedicatedCluster  ModifyDtsJobDedicatedClusterRequest
     * @return ModifyDtsJobDedicatedClusterResponse
     */
    CompletableFuture<ModifyDtsJobDedicatedClusterResponse> modifyDtsJobDedicatedCluster(ModifyDtsJobDedicatedClusterRequest request);

    /**
     * <b>description</b> :
     * <p>  DTS allows you to upgrade or downgrade the configurations of DTS instances in a dedicated cluster. You can adjust the resources that are occupied for task execution to dynamically adjust the number of tasks that can be scheduled in the cluster. This way, you can reduce the total number of DUs required for the cluster or release DUs.</p>
     * <ul>
     * <li>Before you modify the upper limit of DUs for a DTS task, make sure that sufficient DUs are available.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDtsJobDuLimit  ModifyDtsJobDuLimitRequest
     * @return ModifyDtsJobDuLimitResponse
     */
    CompletableFuture<ModifyDtsJobDuLimitResponse> modifyDtsJobDuLimit(ModifyDtsJobDuLimitRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> After the database is changed, Data Transmission Service (DTS) rolls back the incremental write offset for 10 seconds. If the synchronized or migrated data does not have a primary key, make sure that no data is written to the source database while the source or destination database is being replaced. Otherwise, duplicate data may exist.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDtsJobEndpoint  ModifyDtsJobEndpointRequest
     * @return ModifyDtsJobEndpointResponse
     */
    CompletableFuture<ModifyDtsJobEndpointResponse> modifyDtsJobEndpoint(ModifyDtsJobEndpointRequest request);

    /**
     * @param request the request parameters of ModifyDtsJobName  ModifyDtsJobNameRequest
     * @return ModifyDtsJobNameResponse
     */
    CompletableFuture<ModifyDtsJobNameResponse> modifyDtsJobName(ModifyDtsJobNameRequest request);

    /**
     * @param request the request parameters of ModifyDtsJobPassword  ModifyDtsJobPasswordRequest
     * @return ModifyDtsJobPasswordResponse
     */
    CompletableFuture<ModifyDtsJobPasswordResponse> modifyDtsJobPassword(ModifyDtsJobPasswordRequest request);

    /**
     * @param request the request parameters of ModifyDynamicConfig  ModifyDynamicConfigRequest
     * @return ModifyDynamicConfigResponse
     */
    CompletableFuture<ModifyDynamicConfigResponse> modifyDynamicConfig(ModifyDynamicConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can preview related API operation parameters when you modify the information about a change tracking task in the Data Transmission Service (DTS) console. This helps you configure the request parameters of this API operation. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview the request parameters of API operations</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifySubscription  ModifySubscriptionRequest
     * @return ModifySubscriptionResponse
     */
    CompletableFuture<ModifySubscriptionResponse> modifySubscription(ModifySubscriptionRequest request);

    /**
     * @param request the request parameters of ModifySubscriptionObject  ModifySubscriptionObjectRequest
     * @return ModifySubscriptionObjectResponse
     */
    CompletableFuture<ModifySubscriptionObjectResponse> modifySubscriptionObject(ModifySubscriptionObjectRequest request);

    /**
     * @param request the request parameters of ModifySynchronizationObject  ModifySynchronizationObjectRequest
     * @return ModifySynchronizationObjectResponse
     */
    CompletableFuture<ModifySynchronizationObjectResponse> modifySynchronizationObject(ModifySynchronizationObjectRequest request);

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If you clear the configurations of a data synchronization or change tracking task, DTS deletes the task. Then, DTS creates another task. The task is in the Not Configured state. You must call the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation reconfigure the task.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetDtsJob  ResetDtsJobRequest
     * @return ResetDtsJobResponse
     */
    CompletableFuture<ResetDtsJobResponse> resetDtsJob(ResetDtsJobRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If you clear the configurations of a data synchronization task, the task will be released. To start the task again, you must call the <strong>ConfigureSynchronizationJob</strong> operation to reconfigure the task.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetSynchronizationJob  ResetSynchronizationJobRequest
     * @return ResetSynchronizationJobResponse
     */
    CompletableFuture<ResetSynchronizationJobResponse> resetSynchronizationJob(ResetSynchronizationJobRequest request);

    /**
     * @param request the request parameters of ReverseTwoWayDirection  ReverseTwoWayDirectionRequest
     * @return ReverseTwoWayDirectionResponse
     */
    CompletableFuture<ReverseTwoWayDirectionResponse> reverseTwoWayDirection(ReverseTwoWayDirectionRequest request);

    /**
     * @param request the request parameters of ShieldPrecheck  ShieldPrecheckRequest
     * @return ShieldPrecheckResponse
     */
    CompletableFuture<ShieldPrecheckResponse> shieldPrecheck(ShieldPrecheckRequest request);

    /**
     * @param request the request parameters of SkipPreCheck  SkipPreCheckRequest
     * @return SkipPreCheckResponse
     */
    CompletableFuture<SkipPreCheckResponse> skipPreCheck(SkipPreCheckRequest request);

    /**
     * @param request the request parameters of StartDtsJob  StartDtsJobRequest
     * @return StartDtsJobResponse
     */
    CompletableFuture<StartDtsJobResponse> startDtsJob(StartDtsJobRequest request);

    /**
     * @param request the request parameters of StartDtsJobs  StartDtsJobsRequest
     * @return StartDtsJobsResponse
     */
    CompletableFuture<StartDtsJobsResponse> startDtsJobs(StartDtsJobsRequest request);

    /**
     * @param request the request parameters of StartMigrationJob  StartMigrationJobRequest
     * @return StartMigrationJobResponse
     */
    CompletableFuture<StartMigrationJobResponse> startMigrationJob(StartMigrationJobRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that your instance is not released and is paused. You can check the status of the instance in the Data Transmission Service (DTS) console or by calling the <a href="https://help.aliyun.com/document_detail/208925.html">DescribeDtsJobDetail</a> operation.</p>
     * 
     * @param request the request parameters of StartReverseWriter  StartReverseWriterRequest
     * @return StartReverseWriterResponse
     */
    CompletableFuture<StartReverseWriterResponse> startReverseWriter(StartReverseWriterRequest request);

    /**
     * @param request the request parameters of StartSubscriptionInstance  StartSubscriptionInstanceRequest
     * @return StartSubscriptionInstanceResponse
     */
    CompletableFuture<StartSubscriptionInstanceResponse> startSubscriptionInstance(StartSubscriptionInstanceRequest request);

    /**
     * @param request the request parameters of StartSynchronizationJob  StartSynchronizationJobRequest
     * @return StartSynchronizationJobResponse
     */
    CompletableFuture<StartSynchronizationJobResponse> startSynchronizationJob(StartSynchronizationJobRequest request);

    /**
     * @param request the request parameters of StopDedicatedCluster  StopDedicatedClusterRequest
     * @return StopDedicatedClusterResponse
     */
    CompletableFuture<StopDedicatedClusterResponse> stopDedicatedCluster(StopDedicatedClusterRequest request);

    /**
     * @param request the request parameters of StopDtsJob  StopDtsJobRequest
     * @return StopDtsJobResponse
     */
    CompletableFuture<StopDtsJobResponse> stopDtsJob(StopDtsJobRequest request);

    /**
     * @param request the request parameters of StopDtsJobs  StopDtsJobsRequest
     * @return StopDtsJobsResponse
     */
    CompletableFuture<StopDtsJobsResponse> stopDtsJobs(StopDtsJobsRequest request);

    /**
     * @param request the request parameters of StopMigrationJob  StopMigrationJobRequest
     * @return StopMigrationJobResponse
     */
    CompletableFuture<StopMigrationJobResponse> stopMigrationJob(StopMigrationJobRequest request);

    /**
     * @param request the request parameters of SummaryJobDetail  SummaryJobDetailRequest
     * @return SummaryJobDetailResponse
     */
    CompletableFuture<SummaryJobDetailResponse> summaryJobDetail(SummaryJobDetailRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of SuspendDtsJob  SuspendDtsJobRequest
     * @return SuspendDtsJobResponse
     */
    CompletableFuture<SuspendDtsJobResponse> suspendDtsJob(SuspendDtsJobRequest request);

    /**
     * @param request the request parameters of SuspendDtsJobs  SuspendDtsJobsRequest
     * @return SuspendDtsJobsResponse
     */
    CompletableFuture<SuspendDtsJobsResponse> suspendDtsJobs(SuspendDtsJobsRequest request);

    /**
     * @param request the request parameters of SuspendMigrationJob  SuspendMigrationJobRequest
     * @return SuspendMigrationJobResponse
     */
    CompletableFuture<SuspendMigrationJobResponse> suspendMigrationJob(SuspendMigrationJobRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>When you call this operation, the data synchronization task must be in the Synchronizing state.</li>
     * <li>We recommend that you do not pause a data synchronization task for more than 6 hours. Otherwise, the task cannot be started again.</li>
     * <li>If the billing method is pay-as-you-go, DTS charges a fee even when the task is paused. This is because DTS only stops writing data to the destination database. DTS continues to pull the logs of the source database so that the task can resume quickly after it is restarted. Therefore, data synchronization consumes resources such as the bandwidth of the source database.</li>
     * </ul>
     * 
     * @param request the request parameters of SuspendSynchronizationJob  SuspendSynchronizationJobRequest
     * @return SuspendSynchronizationJobResponse
     */
    CompletableFuture<SuspendSynchronizationJobResponse> suspendSynchronizationJob(SuspendSynchronizationJobRequest request);

    /**
     * @param request the request parameters of SwitchPhysicalDtsJobToCloud  SwitchPhysicalDtsJobToCloudRequest
     * @return SwitchPhysicalDtsJobToCloudResponse
     */
    CompletableFuture<SwitchPhysicalDtsJobToCloudResponse> switchPhysicalDtsJobToCloud(SwitchPhysicalDtsJobToCloudRequest request);

    /**
     * @param request the request parameters of SwitchSynchronizationEndpoint  SwitchSynchronizationEndpointRequest
     * @return SwitchSynchronizationEndpointResponse
     */
    CompletableFuture<SwitchSynchronizationEndpointResponse> switchSynchronizationEndpoint(SwitchSynchronizationEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>If you have a large number of instances, you can create multiple tags and add these tags to the instances. Then, you can query instances by tag.</p>
     * <ul>
     * <li>A tag consists of a key and a value. Each key must be unique in a region within an Alibaba Cloud account. Different keys can be mapped to the same value.</li>
     * <li>If the tag that you specify does not exist, this tag is automatically created and added to the specified instance.</li>
     * <li>If the key of the specified tag is the same as that of an existing tag, the specified tag overwrites the existing tag.</li>
     * <li>You can add up to 20 tags to an instance.</li>
     * <li>You can add tags to up to 50 instances in each request.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TransferInstanceClass  TransferInstanceClassRequest
     * @return TransferInstanceClassResponse
     */
    CompletableFuture<TransferInstanceClassResponse> transferInstanceClass(TransferInstanceClassRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">billing</a> of DTS.</p>
     * <ul>
     * <li>To prevent resource waste, make sure that the billing method of your DTS instances has to be changed.</li>
     * <li>Data migration instances only support the pay-as-you-go billing method.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferPayType  TransferPayTypeRequest
     * @return TransferPayTypeResponse
     */
    CompletableFuture<TransferPayTypeResponse> transferPayType(TransferPayTypeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If a tag is unbound from an instance and is not bound to other instances, the tag is deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">pricing</a> of Data Transmission Service (DTS)
     * When you call this operation, take note of the following information:</p>
     * <ul>
     * <li>The source and destination databases of the data synchronization task are both <strong>MySQL</strong> databases.</li>
     * <li>The synchronization topology of the data synchronization task is <strong>one-way synchronization</strong>.</li>
     * <li>The data synchronization task is in the <strong>Synchronizing</strong> state.</li>
     * <li>The upgrade operation causes data synchronization latency of about 5 seconds. We recommend that you perform this operation during off-peak hours.</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeTwoWay  UpgradeTwoWayRequest
     * @return UpgradeTwoWayResponse
     */
    CompletableFuture<UpgradeTwoWayResponse> upgradeTwoWay(UpgradeTwoWayRequest request);

    /**
     * <b>description</b> :
     * <p>The operation that you want to perform. Set the value to <strong>WhiteIpList</strong>.</p>
     * 
     * @param request the request parameters of WhiteIpList  WhiteIpListRequest
     * @return WhiteIpListResponse
     */
    CompletableFuture<WhiteIpListResponse> whiteIpList(WhiteIpListRequest request);

}
