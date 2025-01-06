// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dataworks_public20180601.models.*;
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
     * @param request the request parameters of CreateManualDag  CreateManualDagRequest
     * @return CreateManualDagResponse
     */
    CompletableFuture<CreateManualDagResponse> createManualDag(CreateManualDagRequest request);

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    /**
     * @param request the request parameters of DescribeEmrHiveTable  DescribeEmrHiveTableRequest
     * @return DescribeEmrHiveTableResponse
     */
    CompletableFuture<DescribeEmrHiveTableResponse> describeEmrHiveTable(DescribeEmrHiveTableRequest request);

    /**
     * @param request the request parameters of GetDataServiceApiAuthMapContext  GetDataServiceApiAuthMapContextRequest
     * @return GetDataServiceApiAuthMapContextResponse
     */
    CompletableFuture<GetDataServiceApiAuthMapContextResponse> getDataServiceApiAuthMapContext(GetDataServiceApiAuthMapContextRequest request);

    /**
     * @param request the request parameters of GetDataServiceApiContext  GetDataServiceApiContextRequest
     * @return GetDataServiceApiContextResponse
     */
    CompletableFuture<GetDataServiceApiContextResponse> getDataServiceApiContext(GetDataServiceApiContextRequest request);

    /**
     * @param request the request parameters of GetDataServiceConnection  GetDataServiceConnectionRequest
     * @return GetDataServiceConnectionResponse
     */
    CompletableFuture<GetDataServiceConnectionResponse> getDataServiceConnection(GetDataServiceConnectionRequest request);

    /**
     * @param request the request parameters of GetDataServiceContextUpdateEvent  GetDataServiceContextUpdateEventRequest
     * @return GetDataServiceContextUpdateEventResponse
     */
    CompletableFuture<GetDataServiceContextUpdateEventResponse> getDataServiceContextUpdateEvent(GetDataServiceContextUpdateEventRequest request);

    /**
     * @param request the request parameters of GetDataServiceFunction  GetDataServiceFunctionRequest
     * @return GetDataServiceFunctionResponse
     */
    CompletableFuture<GetDataServiceFunctionResponse> getDataServiceFunction(GetDataServiceFunctionRequest request);

    /**
     * @param request the request parameters of GetSwitchValue  GetSwitchValueRequest
     * @return GetSwitchValueResponse
     */
    CompletableFuture<GetSwitchValueResponse> getSwitchValue(GetSwitchValueRequest request);

    /**
     * @param request the request parameters of GetTimeMachineTask  GetTimeMachineTaskRequest
     * @return GetTimeMachineTaskResponse
     */
    CompletableFuture<GetTimeMachineTaskResponse> getTimeMachineTask(GetTimeMachineTaskRequest request);

    /**
     * @param request the request parameters of ListEmrHiveAuditLogs  ListEmrHiveAuditLogsRequest
     * @return ListEmrHiveAuditLogsResponse
     */
    CompletableFuture<ListEmrHiveAuditLogsResponse> listEmrHiveAuditLogs(ListEmrHiveAuditLogsRequest request);

    /**
     * @param request the request parameters of ListEmrHiveDatabases  ListEmrHiveDatabasesRequest
     * @return ListEmrHiveDatabasesResponse
     */
    CompletableFuture<ListEmrHiveDatabasesResponse> listEmrHiveDatabases(ListEmrHiveDatabasesRequest request);

    /**
     * @param request the request parameters of ListEmrHiveTables  ListEmrHiveTablesRequest
     * @return ListEmrHiveTablesResponse
     */
    CompletableFuture<ListEmrHiveTablesResponse> listEmrHiveTables(ListEmrHiveTablesRequest request);

    /**
     * @param request the request parameters of ListGovernanceIssueDataServiceAPIs  ListGovernanceIssueDataServiceAPIsRequest
     * @return ListGovernanceIssueDataServiceAPIsResponse
     */
    CompletableFuture<ListGovernanceIssueDataServiceAPIsResponse> listGovernanceIssueDataServiceAPIs(ListGovernanceIssueDataServiceAPIsRequest request);

    /**
     * @param request the request parameters of ListGovernanceIssueTables  ListGovernanceIssueTablesRequest
     * @return ListGovernanceIssueTablesResponse
     */
    CompletableFuture<ListGovernanceIssueTablesResponse> listGovernanceIssueTables(ListGovernanceIssueTablesRequest request);

    /**
     * @param request the request parameters of ListGovernanceIssueTasks  ListGovernanceIssueTasksRequest
     * @return ListGovernanceIssueTasksResponse
     */
    CompletableFuture<ListGovernanceIssueTasksResponse> listGovernanceIssueTasks(ListGovernanceIssueTasksRequest request);

    /**
     * @param request the request parameters of ListGovernanceRules  ListGovernanceRulesRequest
     * @return ListGovernanceRulesResponse
     */
    CompletableFuture<ListGovernanceRulesResponse> listGovernanceRules(ListGovernanceRulesRequest request);

    /**
     * @param request the request parameters of ListHiveColumnLineages  ListHiveColumnLineagesRequest
     * @return ListHiveColumnLineagesResponse
     */
    CompletableFuture<ListHiveColumnLineagesResponse> listHiveColumnLineages(ListHiveColumnLineagesRequest request);

    /**
     * @param request the request parameters of ListHiveTableLineages  ListHiveTableLineagesRequest
     * @return ListHiveTableLineagesResponse
     */
    CompletableFuture<ListHiveTableLineagesResponse> listHiveTableLineages(ListHiveTableLineagesRequest request);

    /**
     * @param request the request parameters of ListTablePartitions  ListTablePartitionsRequest
     * @return ListTablePartitionsResponse
     */
    CompletableFuture<ListTablePartitionsResponse> listTablePartitions(ListTablePartitionsRequest request);

    /**
     * @param request the request parameters of OpenDataWorksStandardService  OpenDataWorksStandardServiceRequest
     * @return OpenDataWorksStandardServiceResponse
     */
    CompletableFuture<OpenDataWorksStandardServiceResponse> openDataWorksStandardService(OpenDataWorksStandardServiceRequest request);

    /**
     * @param request the request parameters of SearchManualDagNodeInstance  SearchManualDagNodeInstanceRequest
     * @return SearchManualDagNodeInstanceResponse
     */
    CompletableFuture<SearchManualDagNodeInstanceResponse> searchManualDagNodeInstance(SearchManualDagNodeInstanceRequest request);

    /**
     * @param request the request parameters of SendTaskMetaCallback  SendTaskMetaCallbackRequest
     * @return SendTaskMetaCallbackResponse
     */
    CompletableFuture<SendTaskMetaCallbackResponse> sendTaskMetaCallback(SendTaskMetaCallbackRequest request);

    /**
     * @param request the request parameters of SetSwitchValue  SetSwitchValueRequest
     * @return SetSwitchValueResponse
     */
    CompletableFuture<SetSwitchValueResponse> setSwitchValue(SetSwitchValueRequest request);

    /**
     * @param request the request parameters of StartCollectQuality  StartCollectQualityRequest
     * @return StartCollectQualityResponse
     */
    CompletableFuture<StartCollectQualityResponse> startCollectQuality(StartCollectQualityRequest request);

    /**
     * @param request the request parameters of StartDoCheckQuality  StartDoCheckQualityRequest
     * @return StartDoCheckQualityResponse
     */
    CompletableFuture<StartDoCheckQualityResponse> startDoCheckQuality(StartDoCheckQualityRequest request);

    /**
     * @param request the request parameters of StartTaskQuality  StartTaskQualityRequest
     * @return StartTaskQualityResponse
     */
    CompletableFuture<StartTaskQualityResponse> startTaskQuality(StartTaskQualityRequest request);

    /**
     * @param request the request parameters of TriggerDataLoader  TriggerDataLoaderRequest
     * @return TriggerDataLoaderResponse
     */
    CompletableFuture<TriggerDataLoaderResponse> triggerDataLoader(TriggerDataLoaderRequest request);

    /**
     * @param request the request parameters of TriggerTimeMachineTask  TriggerTimeMachineTaskRequest
     * @return TriggerTimeMachineTaskResponse
     */
    CompletableFuture<TriggerTimeMachineTaskResponse> triggerTimeMachineTask(TriggerTimeMachineTaskRequest request);

}
