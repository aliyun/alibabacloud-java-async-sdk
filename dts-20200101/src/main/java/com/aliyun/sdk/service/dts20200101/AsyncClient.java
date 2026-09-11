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
     * <p>You can perform the required pre-configurations in the console and then preview the corresponding OpenAPI parameter information to help you specify request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ConfigureSubscription  ConfigureSubscriptionRequest
     * @return ConfigureSubscriptionResponse
     */
    CompletableFuture<ConfigureSubscriptionResponse> configureSubscription(ConfigureSubscriptionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/49436.html">CreateSubscriptionInstance</a> operation to create a change tracking instance.</p>
     * <blockquote>
     * <p>In the <strong>Advanced Settings</strong> step of the console, move the pointer over the <strong>Next: Save the task and perform a precheck</strong> button, and then click <strong>Preview OpenAPI parameters</strong> in the tooltip to view the parameter information for configuring this instance by using API operations.</p>
     * </blockquote>
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
     * <ul>
     * <li>After this operation is called, the data synchronization instance automatically starts and performs a precheck. You do not need to call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to start the instance.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the data synchronization instance fails to start, the precheck may have failed. You can call the <a href="https://help.aliyun.com/document_detail/49453.html">DescribeSynchronizationJobStatus</a> operation to query the status of the data synchronization instance, obtain the error message of the precheck failure, and adjust the parameters. After the adjustment, you can call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to restart the data synchronization instance.</li>
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
     * @param request the request parameters of ConvertInstanceResourceGroup  ConvertInstanceResourceGroupRequest
     * @return ConvertInstanceResourceGroupResponse
     */
    CompletableFuture<ConvertInstanceResourceGroupResponse> convertInstanceResourceGroup(ConvertInstanceResourceGroupRequest request);

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
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before invoking this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of Data Transmission Service (DTS).
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Before invoking this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/product/data-transmission-service/pricing">pricing</a> of Data Transmission Service (DTS).</li>
     * <li>Nodes on a dedicated cluster support only the workflow of configuring a node before purchasing an instance. You can invoke the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to configure a node.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDtsInstance  CreateDtsInstanceRequest
     * @return CreateDtsInstanceResponse
     */
    CompletableFuture<CreateDtsInstanceResponse> createDtsInstance(CreateDtsInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>DTS currently supports the following alert metrics: <strong>Latency</strong>, <strong>Migration Status</strong>, and <strong>Full Migration Duration</strong>:</p>
     * <ul>
     * <li><strong>Latency</strong>: Monitors incremental data migration latency. An alert is triggered when the migration latency, synchronization latency, or change tracking latency exceeds the specified threshold (in seconds).</li>
     * <li><strong>Migration Status</strong>: Monitors the task status. An alert is triggered when the task status is <strong>Error</strong> or <strong>Recovered</strong>.</li>
     * <li><strong>Full Migration Duration</strong>: Monitors the duration of full data migration. An alert is triggered when the duration exceeds the specified threshold (in hours).</li>
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
     * <p>The reverse task created by calling this operation immediately starts a precheck. After the precheck is passed, incremental data collection begins, but the incremental data write module does not run. You must call the <strong>StartReverseWriter</strong> operation to start it.</p>
     * <blockquote>
     * <p>The created reverse task is a synchronization task that contains only the incremental write module.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>Subscription DTS instances cannot be released by calling this API operation. You can release them by unsubscribing. For more information, see <a href="https://help.aliyun.com/document_detail/289054.html">Release a DTS instance</a>.</ph>&lt;props=&quot;intl&quot;&gt;<ph>Subscription DTS instances cannot be released.</ph>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDtsJob  DeleteDtsJobRequest
     * @return DeleteDtsJobResponse
     */
    CompletableFuture<DeleteDtsJobResponse> deleteDtsJob(DeleteDtsJobRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>Subscription DTS instances cannot be released by calling API operations. You can release them by unsubscribing. For more information, see <a href="https://help.aliyun.com/document_detail/289054.html">Release a DTS instance</a>.</ph>&lt;props=&quot;intl&quot;&gt;<ph>Subscription DTS instances cannot be released.</ph>.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative call threshold per region is 100 calls per second.</li>
     * <li>The call threshold per account per region is 5 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDocParserJobResult  DescribeDocParserJobResultRequest
     * @return DescribeDocParserJobResultResponse
     */
    CompletableFuture<DescribeDocParserJobResultResponse> describeDocParserJobResult(DescribeDocParserJobResultRequest request);

    /**
     * <b>description</b> :
     * <p>This operation has call frequency limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative call threshold for a single region is 200 calls per second.</li>
     * <li>The call threshold for a single account in a single region is 20 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDocParserJobStatus  DescribeDocParserJobStatusRequest
     * @return DescribeDocParserJobStatusResponse
     */
    CompletableFuture<DescribeDocParserJobStatusResponse> describeDocParserJobStatus(DescribeDocParserJobStatusRequest request);

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
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative threshold for calls in a single region is 160 calls per second.</li>
     * <li>The threshold for calls by a single account in a single region is 40 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDtsJobDetail  DescribeDtsJobDetailRequest
     * @return DescribeDtsJobDetailResponse
     */
    CompletableFuture<DescribeDtsJobDetailResponse> describeDtsJobDetail(DescribeDtsJobDetailRequest request);

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative threshold for calls in a single region is 200 calls per second.</li>
     * <li>The threshold for calls by a single account in a single region is 20 calls per second.</li>
     * </ul>
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
     * @param request the request parameters of DescribeFullProcessList  DescribeFullProcessListRequest
     * @return DescribeFullProcessListResponse
     */
    CompletableFuture<DescribeFullProcessListResponse> describeFullProcessList(DescribeFullProcessListRequest request);

    /**
     * @param request the request parameters of DescribeGadInstances  DescribeGadInstancesRequest
     * @return DescribeGadInstancesResponse
     */
    CompletableFuture<DescribeGadInstancesResponse> describeGadInstances(DescribeGadInstancesRequest request);

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
     * @param request the request parameters of DescribePreCheckCreateGadOrderResult  DescribePreCheckCreateGadOrderResultRequest
     * @return DescribePreCheckCreateGadOrderResultResponse
     */
    CompletableFuture<DescribePreCheckCreateGadOrderResultResponse> describePreCheckCreateGadOrderResult(DescribePreCheckCreateGadOrderResultRequest request);

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
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Because a PolarDB-X 1.0 change tracking task is a distributed change tracking task, each ApsaraDB RDS for MySQL instance associated with the task corresponds to a change tracking subtask. You can call this operation to query the information about change tracking subtasks.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID, consumer group ID, and other information about a PolarDB-X 1.0 change tracking task.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Because a DRDS change tracking task is a distributed change tracking task, each ApsaraDB RDS for MySQL instance associated with the task corresponds to a change tracking subtask. You can call this operation to query the information about change tracking subtasks.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID, consumer group ID, and other information about a DRDS change tracking task.
     * .</li>
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
     * @param request the request parameters of DetachGadInstanceDbMember  DetachGadInstanceDbMemberRequest
     * @return DetachGadInstanceDbMemberResponse
     */
    CompletableFuture<DetachGadInstanceDbMemberResponse> detachGadInstanceDbMember(DetachGadInstanceDbMemberRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The unit node must be an ApsaraDB RDS for MySQL instance or a self-managed MySQL database connected through Cloud Enterprise Network (CEN).</li>
     * <li>This operation initializes a built-in account named rdsdt_dtsacct in a unit node of an active geo-redundancy database cluster. DTS uses this account to connect to the node and perform synchronization tasks.</li>
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
     * @param request the request parameters of ListJobStep  ListJobStepRequest
     * @return ListJobStepResponse
     */
    CompletableFuture<ListJobStepResponse> listJobStep(ListJobStepRequest request);

    /**
     * <b>description</b> :
     * <p>***.</p>
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
     * <p>Currently, only the overcommit ratio can be modified.</p>
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
     * <p>After a migration task is changed from a dedicated cluster to a public cluster, the billing method of the task changes to pay-as-you-go, and billing starts.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDtsJobDedicatedCluster  ModifyDtsJobDedicatedClusterRequest
     * @return ModifyDtsJobDedicatedClusterResponse
     */
    CompletableFuture<ModifyDtsJobDedicatedClusterResponse> modifyDtsJobDedicatedCluster(ModifyDtsJobDedicatedClusterRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>DTS instances in a dedicated cluster must support specification changes. By changing the resources consumed by a task at runtime, you can dynamically adjust the number of schedulable tasks in the current cluster, thereby deducting or releasing the total number of DUs in the cluster.</li>
     * <li>Before modifying the DU upper limit of a task, ensure that sufficient resources are available.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDtsJobDuLimit  ModifyDtsJobDuLimitRequest
     * @return ModifyDtsJobDuLimitResponse
     */
    CompletableFuture<ModifyDtsJobDuLimitResponse> modifyDtsJobDuLimit(ModifyDtsJobDuLimitRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the database instance is modified, the DTS incremental write module rolls back writes by 10 seconds. If the data being synchronized or migrated does not have a primary key, stop writing data to the business associated with the source instance during the database instance replacement. Otherwise, duplicate data may occur.</p>
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
     * @param request the request parameters of ModifyGadInstanceName  ModifyGadInstanceNameRequest
     * @return ModifyGadInstanceNameResponse
     */
    CompletableFuture<ModifyGadInstanceNameResponse> modifyGadInstanceName(ModifyGadInstanceNameRequest request);

    /**
     * @param request the request parameters of ModifyJobStepCheckpoint  ModifyJobStepCheckpointRequest
     * @return ModifyJobStepCheckpointResponse
     */
    CompletableFuture<ModifyJobStepCheckpointResponse> modifyJobStepCheckpoint(ModifyJobStepCheckpointRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can perform the required preconfigurations in the console and then preview the corresponding OpenAPI parameter information to help you fill in the request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
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
     * @param request the request parameters of PreCheckCreateGadOrder  PreCheckCreateGadOrderRequest
     * @return PreCheckCreateGadOrderResponse
     */
    CompletableFuture<PreCheckCreateGadOrderResponse> preCheckCreateGadOrder(PreCheckCreateGadOrderRequest request);

    /**
     * @param request the request parameters of PromoteToMaster  PromoteToMasterRequest
     * @return PromoteToMasterResponse
     */
    CompletableFuture<PromoteToMasterResponse> promoteToMaster(PromoteToMasterRequest request);

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the configuration of a data synchronization or change tracking task is cleared, the original task is deleted. DTS creates a new unconfigured task. You must call the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to reconfigure the task.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetDtsJob  ResetDtsJobRequest
     * @return ResetDtsJobResponse
     */
    CompletableFuture<ResetDtsJobResponse> resetDtsJob(ResetDtsJobRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you reset the configuration of a data synchronization task, the original synchronization task is released. You must call the <strong>ConfigureSynchronizationJob</strong> operation to reconfigure the synchronization task before you can start the task.</p>
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
     * @param request the request parameters of SkipFullJobTable  SkipFullJobTableRequest
     * @return SkipFullJobTableResponse
     */
    CompletableFuture<SkipFullJobTableResponse> skipFullJobTable(SkipFullJobTableRequest request);

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
     * <p>Before you call this operation, check the status of the reverse task in the console or by calling <a href="https://help.aliyun.com/document_detail/208925.html">DescribeDtsJobDetail</a>. Make sure that the task has not been released and is in the paused state.</p>
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
     * <ul>
     * <li>When you call this operation, the synchronization task must be in the Synchronizing state.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>A synchronization task cannot be paused for more than 6 hours. Otherwise, the task cannot be restarted.</li>
     * <li>DTS continues to charge fees for a pay-as-you-go synchronization task even if the task is paused. This is because DTS only pauses writing data to the destination instance but continues to pull logs from the source instance to ensure quick resumption when the task is restarted. Therefore, the task still consumes resources such as bandwidth of the source database.</li>
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
     * <p>If you have a large number of instances, you can create multiple tags and attach different tags to instances for categorization. Then, you can filter instances by tag.</p>
     * <ul>
     * <li>A tag consists of a key-value pair. Tag keys must be unique within the same Alibaba Cloud account and region. Tag values do not have this restriction.</li>
     * <li>If the specified tag does not exist, the tag is automatically created and attached to the destination instance.</li>
     * <li>If the instance already has a tag with the same key, the existing tag is overwritten.</li>
     * <li>You can attach up to 20 tags to each instance.</li>
     * <li>You can invoke the operation to attach tags to up to 50 instances at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Downgrading DTS instance specifications is no longer supported.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the source of a DTS instance is Redis 6.0 and incremental data updates exist, do not perform an upgrade. Otherwise, the DTS instance may fail and cannot be recovered. You must reconfigure the instance after a failure.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferInstanceClass  TransferInstanceClassRequest
     * @return TransferInstanceClassResponse
     */
    CompletableFuture<TransferInstanceClassResponse> transferInstanceClass(TransferInstanceClassRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of Data Transmission Service (DTS).
     * &lt;props=&quot;intl&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">pricing</a> of Data Transmission Service (DTS).</p>
     * <ul>
     * <li>To avoid resource waste, confirm the payment method transformation before you perform the operation.</li>
     * <li>Data migration instances support only the pay-as-you-go billing method. No transformation is required.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>Serverless instances do not support payment method transformation.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferPayType  TransferPayTypeRequest
     * @return TransferPayTypeResponse
     */
    CompletableFuture<TransferPayTypeResponse> transferPayType(TransferPayTypeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After a tag is unbound from an instance, the tag is automatically deleted if it is not bound to any other instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of ApsaraDB DTS.
     * &lt;props=&quot;intl&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">pricing</a> of ApsaraDB DTS.
     * Before you begin:</p>
     * <ul>
     * <li>The database type of both the source instance and the destination instance of the data synchronization node must be <strong>MySQL</strong>.</li>
     * <li>The synchronization topology of the data synchronization node must be <strong>one-way synchronization</strong>.</li>
     * <li>The data synchronization node must be in the <strong>Synchronizing</strong> state.</li>
     * <li>During the upgrade, data synchronization may experience a latency of approximately 5 seconds. Perform this operation during off-peak hours.</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeTwoWay  UpgradeTwoWayRequest
     * @return UpgradeTwoWayResponse
     */
    CompletableFuture<UpgradeTwoWayResponse> upgradeTwoWay(UpgradeTwoWayRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;If the <strong>source or destination instance</strong> is a <strong>self-managed database</strong> or a <strong>third-party ApsaraDB database</strong>, you need to invoke this operation to query the IP addresses of DTS servers, and then add the returned IP addresses to the security settings (typically the firewall) of the source or destination instance. For more information about how to add IP addresses, see <a href="https://help.aliyun.com/document_detail/84900.html">Add the CIDR blocks of DTS servers to the whitelist of a self-managed database for migration, synchronization, or subscribe</a>.
     * &lt;props=&quot;intl&quot;&gt;If the <strong>source or destination instance</strong> is a <strong>self-managed database</strong> or a <strong>third-party ApsaraDB database</strong>, you need to invoke this operation to query the IP addresses of DTS servers, and then add the returned IP addresses to the security settings (typically the firewall) of the source or destination instance. For more information about how to add IP addresses, see <a href="https://help.aliyun.com/document_detail/176627.html">Add the CIDR blocks of DTS servers to the whitelist of a self-managed database</a>.</p>
     * <blockquote>
     * <p>If the <strong>source or destination database</strong> is an <strong>Alibaba Cloud database instance</strong> (such as ApsaraDB RDS or ApsaraDB for MongoDB) or a <strong>self-managed database hosted on ECS</strong>, the system automatically adds the IP addresses of DTS servers to the security settings of the instance when you click <strong>Authorize Whitelist and Proceed to Next Step</strong> during the configuration of the source or destination instance. You do not need to manually add the IP addresses.</p>
     * </blockquote>
     * 
     * @param request the request parameters of WhiteIpList  WhiteIpListRequest
     * @return WhiteIpListResponse
     */
    CompletableFuture<WhiteIpListResponse> whiteIpList(WhiteIpListRequest request);

}
