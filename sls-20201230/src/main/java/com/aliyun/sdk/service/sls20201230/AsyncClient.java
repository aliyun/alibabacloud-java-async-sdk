// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sls20201230.models.*;
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ApplyConfigToMachineGroupResponse> applyConfigToMachineGroup(ApplyConfigToMachineGroupRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<ConsumerGroupHeartBeatResponse> consumerGroupHeartBeat(ConsumerGroupHeartBeatRequest request);

    CompletableFuture<CreateAnnotationDataSetResponse> createAnnotationDataSet(CreateAnnotationDataSetRequest request);

    CompletableFuture<CreateAnnotationLabelResponse> createAnnotationLabel(CreateAnnotationLabelRequest request);

    CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request);

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   You can create up to 30 consumer groups for a Logstore.
      * *   Simple Log Service provides examples of both regular log consumption and consumer group-based log consumption by using Simple Log Service SDKs for Java. For more information, see [Consume log data](~~120035~~) and [Use consumer groups to consume data](~~28998~~).
      *
     */
    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    CompletableFuture<CreateDashboardResponse> createDashboard(CreateDashboardRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<CreateLoggingResponse> createLogging(CreateLoggingRequest request);

    CompletableFuture<CreateLogtailPipelineConfigResponse> createLogtailPipelineConfig(CreateLogtailPipelineConfigRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<CreateMachineGroupResponse> createMachineGroup(CreateMachineGroupRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<CreateOssExternalStoreResponse> createOssExternalStore(CreateOssExternalStoreRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<CreateRdsExternalStoreResponse> createRdsExternalStore(CreateRdsExternalStoreRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<CreateSavedSearchResponse> createSavedSearch(CreateSavedSearchRequest request);

    CompletableFuture<DeleteAnnotationDataResponse> deleteAnnotationData(DeleteAnnotationDataRequest request);

    CompletableFuture<DeleteAnnotationDataSetResponse> deleteAnnotationDataSet(DeleteAnnotationDataSetRequest request);

    CompletableFuture<DeleteAnnotationLabelResponse> deleteAnnotationLabel(DeleteAnnotationLabelRequest request);

    CompletableFuture<DeleteCollectionPolicyResponse> deleteCollectionPolicy(DeleteCollectionPolicyRequest request);

    CompletableFuture<DeleteConfigResponse> deleteConfig(DeleteConfigRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteDashboardResponse> deleteDashboard(DeleteDashboardRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<DeleteExternalStoreResponse> deleteExternalStore(DeleteExternalStoreRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request);

    CompletableFuture<DeleteLoggingResponse> deleteLogging(DeleteLoggingRequest request);

    CompletableFuture<DeleteLogtailPipelineConfigResponse> deleteLogtailPipelineConfig(DeleteLogtailPipelineConfigRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<DeleteProjectPolicyResponse> deleteProjectPolicy(DeleteProjectPolicyRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<DeleteSavedSearchResponse> deleteSavedSearch(DeleteSavedSearchRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<DeleteShipperResponse> deleteShipper(DeleteShipperRequest request);

    CompletableFuture<GetAnnotationDataResponse> getAnnotationData(GetAnnotationDataRequest request);

    CompletableFuture<GetAnnotationDataSetResponse> getAnnotationDataSet(GetAnnotationDataSetRequest request);

    CompletableFuture<GetAnnotationLabelResponse> getAnnotationLabel(GetAnnotationLabelRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetAppliedConfigsResponse> getAppliedConfigs(GetAppliedConfigsRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetAppliedMachineGroupsResponse> getAppliedMachineGroups(GetAppliedMachineGroupsRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetCheckPointResponse> getCheckPoint(GetCheckPointRequest request);

    CompletableFuture<GetCollectionPolicyResponse> getCollectionPolicy(GetCollectionPolicyRequest request);

    CompletableFuture<GetConfigResponse> getConfig(GetConfigRequest request);

    /**
      * *   You can specify a log as the start log. The time range of a contextual query is one day before and one day after the generation time of the start log.
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetContextLogsResponse> getContextLogs(GetContextLogsRequest request);

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   The following content describes the relationships among a cursor, project, Logstore, and shard:
      *     *   A project can have multiple Logstores.
      *     *   A Logstore can have multiple shards.
      *     *   You can use a cursor to obtain a log in a shard.
      *
     */
    CompletableFuture<GetCursorResponse> getCursor(GetCursorRequest request);

    CompletableFuture<GetCursorTimeResponse> getCursorTime(GetCursorTimeRequest request);

    CompletableFuture<GetDashboardResponse> getDashboard(GetDashboardRequest request);

    /**
      * *   The supported data sources of external stores include Object Storage Service (OSS) buckets and ApsaraDB RDS for MySQL databases in a virtual private cloud (VPC).
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetExternalStoreResponse> getExternalStore(GetExternalStoreRequest request);

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   The time range is evenly divided into subintervals in the responses. If the time range that is specified in the request remains unchanged, the subintervals in the responses also remain unchanged.
      * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
      * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
      *     *   Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds.
      *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval \\[-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
      *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
      * > Simple Log Service calculates the difference between the log time that is specified by the \\__time\\_\\_ field and the receiving time that is specified by the \\__tag\\_\\_:\\__receive_time\\_\\_ field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval \\[-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
      * *   Simple Log Service provides examples on how to call the GetHistograms operation by using Simple Log Service SDK for Java. For more information, see [Use GetHistograms to query the distribution of logs](~~462234~~).
      *
     */
    CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetLogStoreResponse> getLogStore(GetLogStoreRequest request);

    CompletableFuture<GetLogStoreMeteringModeResponse> getLogStoreMeteringMode(GetLogStoreMeteringModeRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetLoggingResponse> getLogging(GetLoggingRequest request);

    /**
      * ### Usage notes
      * > Simple Log Service allows you to create a Scheduled SQL job. For more information, see [Create a Scheduled SQL job](~~286457~~).
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot forecast the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the x-log-progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
      * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
      *         Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. This type of log is usually generated in common scenarios. 
      *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval \\[-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
      *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
      * > Simple Log Service calculates the difference between the log time that is specified by the \\__time\\_\\_ field and the receiving time that is specified by the \\__tag\\_\\_:**receive_time** field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval \\[-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
      * *   Simple Log Service provides examples on how to call the GetLogs operation by using Simple Log Service SDK for Java and Simple Log Service SDK for Python. For more information, see [Examples of calling the GetLogs operation by using Simple Log Service SDK for Java](~~407683~~) and [Examples of calling the GetLogs operation by using Simple Log Service SDK for Python](~~407684~~).
      *
     */
    CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request);

    /**
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times you must call this API operation to obtain a complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation again to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
      * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log. The latency of the query varies based on the type of the log. Simple Log Service classifies logs into the following types based on log timestamps:
      * 1.  1.  Real-time data: The difference between the time record in the log and the current server time is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as real-time data. This type of log is usually generated in common scenarios.
      * 2.  2.  Historical data: The difference between the time record in the log and the current server time is within the interval \\[-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as historical data. This type of log is usually generated in data backfill scenarios. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
      *
     */
    CompletableFuture<GetLogsV2Response> getLogsV2(GetLogsV2Request request);

    CompletableFuture<GetLogtailPipelineConfigResponse> getLogtailPipelineConfig(GetLogtailPipelineConfigRequest request);

    CompletableFuture<GetMLServiceResultsResponse> getMLServiceResults(GetMLServiceResultsRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
      * ### Usage notes
      * *   You can use the query parameter to specify a standard SQL statement.
      * *   You must specify a project in the domain name of the request.
      * *   You must specify a Logstore in the FROM clause of the SQL statement. A Logstore can be used as an SQL table.
      * *   You must specify a time range in the SQL statement by using the \\__date\\_\\_ parameter or \\__time\\_\\_ parameter. The value of the \\__date\\_\\_ parameter is a timestamp, and the value of the \\__time\\_\\_ parameter is an integer. The unit of the \\__time\\_\\_ parameter is seconds.
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetProjectLogsResponse> getProjectLogs(GetProjectLogsRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetProjectPolicyResponse> getProjectPolicy(GetProjectPolicyRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetSavedSearchResponse> getSavedSearch(GetSavedSearchRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<GetShipperStatusResponse> getShipperStatus(GetShipperStatusRequest request);

    CompletableFuture<ListAnnotationDataResponse> listAnnotationData(ListAnnotationDataRequest request);

    CompletableFuture<ListAnnotationDataSetsResponse> listAnnotationDataSets(ListAnnotationDataSetsRequest request);

    CompletableFuture<ListAnnotationLabelsResponse> listAnnotationLabels(ListAnnotationLabelsRequest request);

    CompletableFuture<ListCollectionPoliciesResponse> listCollectionPolicies(ListCollectionPoliciesRequest request);

    CompletableFuture<ListConfigResponse> listConfig(ListConfigRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ListConsumerGroupResponse> listConsumerGroup(ListConsumerGroupRequest request);

    CompletableFuture<ListDashboardResponse> listDashboard(ListDashboardRequest request);

    /**
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   Only one custom domain name can be bound to each project.
      *
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ListExternalStoreResponse> listExternalStore(ListExternalStoreRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request);

    CompletableFuture<ListLogtailPipelineConfigResponse> listLogtailPipelineConfig(ListLogtailPipelineConfigRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ListMachineGroupResponse> listMachineGroup(ListMachineGroupRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ListMachinesResponse> listMachines(ListMachinesRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ListSavedSearchResponse> listSavedSearch(ListSavedSearchRequest request);

    CompletableFuture<ListShardsResponse> listShards(ListShardsRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ListShipperResponse> listShipper(ListShipperRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<PutAnnotationDataResponse> putAnnotationData(PutAnnotationDataRequest request);

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   Alibaba Cloud Simple Log Service allows you to configure a project policy to authorize other users to access the specified Log Service resources.
      *     *   You must configure a project policy based on policy syntax. Before you configure a project policy, you must be familiar with the Action, Resource, and Condition parameters. For more information, see [RAM](~~128139~~).
      *     *   If you set the Principal element to an asterisk (\\*) and do not configure the Condition element when you configure a project policy, the policy applies to all users except for the project owner. If you set the Principal element to an asterisk (\\*) and configure the Condition element when you configure a project policy, the policy applies to all users including the project owner.
      *     *   You can configure multiple project policies for a project. The total size of the policies cannot exceed 16 KB.
      *
     */
    CompletableFuture<PutProjectPolicyResponse> putProjectPolicy(PutProjectPolicyRequest request);

    CompletableFuture<PutProjectTransferAccelerationResponse> putProjectTransferAcceleration(PutProjectTransferAccelerationRequest request);

    CompletableFuture<PutWebtrackingResponse> putWebtracking(PutWebtrackingRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<QueryMLServiceResultsResponse> queryMLServiceResults(QueryMLServiceResultsRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<RemoveConfigFromMachineGroupResponse> removeConfigFromMachineGroup(RemoveConfigFromMachineGroupRequest request);

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   Each shard has an MD5 hash range, and each range is a left-closed, right-open interval. The interval is in the `[BeginKey,EndKey)` format. A shard can be in the readwrite or readonly state. You can split a shard and merge shards. For more information, see [Shard](~~28976~~).
      *
     */
    CompletableFuture<SplitShardResponse> splitShard(SplitShardRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAnnotationDataSetResponse> updateAnnotationDataSet(UpdateAnnotationDataSetRequest request);

    CompletableFuture<UpdateAnnotationLabelResponse> updateAnnotationLabel(UpdateAnnotationLabelRequest request);

    CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    CompletableFuture<UpdateDashboardResponse> updateDashboard(UpdateDashboardRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request);

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      * *   You can call the UpdateLogStore operation to change only the time-to-live (TTL) attribute.
      *
     */
    CompletableFuture<UpdateLogStoreResponse> updateLogStore(UpdateLogStoreRequest request);

    CompletableFuture<UpdateLogStoreMeteringModeResponse> updateLogStoreMeteringMode(UpdateLogStoreMeteringModeRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<UpdateLoggingResponse> updateLogging(UpdateLoggingRequest request);

    CompletableFuture<UpdateLogtailPipelineConfigResponse> updateLogtailPipelineConfig(UpdateLogtailPipelineConfigRequest request);

    /**
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<UpdateMachineGroupResponse> updateMachineGroup(UpdateMachineGroupRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<UpdateMachineGroupMachineResponse> updateMachineGroupMachine(UpdateMachineGroupMachineRequest request);

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<UpdateOssExternalStoreResponse> updateOssExternalStore(UpdateOssExternalStoreRequest request);

    /**
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    /**
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      *
     */
    CompletableFuture<UpdateRdsExternalStoreResponse> updateRdsExternalStore(UpdateRdsExternalStoreRequest request);

    CompletableFuture<UpdateSavedSearchResponse> updateSavedSearch(UpdateSavedSearchRequest request);

    CompletableFuture<UpsertCollectionPolicyResponse> upsertCollectionPolicy(UpsertCollectionPolicyRequest request);

}
