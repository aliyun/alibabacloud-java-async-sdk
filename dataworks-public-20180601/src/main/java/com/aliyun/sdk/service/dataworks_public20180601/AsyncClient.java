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

    CompletableFuture<CreateManualDagResponse> createManualDag(CreateManualDagRequest request);

    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    CompletableFuture<DescribeEmrHiveTableResponse> describeEmrHiveTable(DescribeEmrHiveTableRequest request);

    CompletableFuture<GetDataServiceApiContextResponse> getDataServiceApiContext(GetDataServiceApiContextRequest request);

    CompletableFuture<GetDataServiceContextUpdateEventResponse> getDataServiceContextUpdateEvent(GetDataServiceContextUpdateEventRequest request);

    CompletableFuture<GetSwitchValueResponse> getSwitchValue(GetSwitchValueRequest request);

    CompletableFuture<GetTimeMachineTaskResponse> getTimeMachineTask(GetTimeMachineTaskRequest request);

    CompletableFuture<ListEmrHiveAuditLogsResponse> listEmrHiveAuditLogs(ListEmrHiveAuditLogsRequest request);

    CompletableFuture<ListEmrHiveDatabasesResponse> listEmrHiveDatabases(ListEmrHiveDatabasesRequest request);

    CompletableFuture<ListEmrHiveTablesResponse> listEmrHiveTables(ListEmrHiveTablesRequest request);

    CompletableFuture<ListGovernanceIssueDataServiceAPIsResponse> listGovernanceIssueDataServiceAPIs(ListGovernanceIssueDataServiceAPIsRequest request);

    CompletableFuture<ListGovernanceIssueTablesResponse> listGovernanceIssueTables(ListGovernanceIssueTablesRequest request);

    CompletableFuture<ListGovernanceIssueTasksResponse> listGovernanceIssueTasks(ListGovernanceIssueTasksRequest request);

    CompletableFuture<ListGovernanceRulesResponse> listGovernanceRules(ListGovernanceRulesRequest request);

    CompletableFuture<ListHiveColumnLineagesResponse> listHiveColumnLineages(ListHiveColumnLineagesRequest request);

    CompletableFuture<ListHiveTableLineagesResponse> listHiveTableLineages(ListHiveTableLineagesRequest request);

    CompletableFuture<ListTablePartitionsResponse> listTablePartitions(ListTablePartitionsRequest request);

    CompletableFuture<OpenDataWorksStandardServiceResponse> openDataWorksStandardService(OpenDataWorksStandardServiceRequest request);

    CompletableFuture<SearchManualDagNodeInstanceResponse> searchManualDagNodeInstance(SearchManualDagNodeInstanceRequest request);

    CompletableFuture<SendTaskMetaCallbackResponse> sendTaskMetaCallback(SendTaskMetaCallbackRequest request);

    CompletableFuture<SetSwitchValueResponse> setSwitchValue(SetSwitchValueRequest request);

    CompletableFuture<StartCollectQualityResponse> startCollectQuality(StartCollectQualityRequest request);

    CompletableFuture<StartDoCheckQualityResponse> startDoCheckQuality(StartDoCheckQualityRequest request);

    CompletableFuture<StartTaskQualityResponse> startTaskQuality(StartTaskQualityRequest request);

    CompletableFuture<TriggerDataLoaderResponse> triggerDataLoader(TriggerDataLoaderRequest request);

    CompletableFuture<TriggerTimeMachineTaskResponse> triggerTimeMachineTask(TriggerTimeMachineTaskRequest request);

}
