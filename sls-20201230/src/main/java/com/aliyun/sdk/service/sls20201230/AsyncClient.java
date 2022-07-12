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

    CompletableFuture<ApplyConfigToMachineGroupResponse> applyConfigToMachineGroup(ApplyConfigToMachineGroupRequest request);

    CompletableFuture<BatchCreateEtlMetaResponse> batchCreateEtlMeta(BatchCreateEtlMetaRequest request);

    CompletableFuture<BatchModifyEtlMetaStatusResponse> batchModifyEtlMetaStatus(BatchModifyEtlMetaStatusRequest request);

    CompletableFuture<BatchUpdateEtlMetaResponse> batchUpdateEtlMeta(BatchUpdateEtlMetaRequest request);

    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateEtlMetaResponse> createEtlMeta(CreateEtlMetaRequest request);

    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request);

    CompletableFuture<CreateLoggingResponse> createLogging(CreateLoggingRequest request);

    CompletableFuture<CreateMachineGroupResponse> createMachineGroup(CreateMachineGroupRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateSavedSearchResponse> createSavedSearch(CreateSavedSearchRequest request);

    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteEtlMetaResponse> deleteEtlMeta(DeleteEtlMetaRequest request);

    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request);

    CompletableFuture<DeleteLoggingResponse> deleteLogging(DeleteLoggingRequest request);

    CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteSavedSearchResponse> deleteSavedSearch(DeleteSavedSearchRequest request);

    CompletableFuture<GetAppliedConfigsResponse> getAppliedConfigs(GetAppliedConfigsRequest request);

    CompletableFuture<GetCheckPointResponse> getCheckPoint(GetCheckPointRequest request);

    CompletableFuture<GetContextLogsResponse> getContextLogs(GetContextLogsRequest request);

    CompletableFuture<GetCursorResponse> getCursor(GetCursorRequest request);

    CompletableFuture<GetCursorTimeResponse> getCursorTime(GetCursorTimeRequest request);

    CompletableFuture<GetEtlMetaResponse> getEtlMeta(GetEtlMetaRequest request);

    CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request);

    CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request);

    CompletableFuture<GetLogStoreResponse> getLogStore(GetLogStoreRequest request);

    CompletableFuture<GetLoggingResponse> getLogging(GetLoggingRequest request);

    CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request);

    CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetProjectLogsResponse> getProjectLogs(GetProjectLogsRequest request);

    CompletableFuture<GetSavedSearchResponse> getSavedSearch(GetSavedSearchRequest request);

    CompletableFuture<ListConsumerGroupResponse> listConsumerGroup(ListConsumerGroupRequest request);

    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    CompletableFuture<ListEtlMetaResponse> listEtlMeta(ListEtlMetaRequest request);

    CompletableFuture<ListEtlMetaNameResponse> listEtlMetaName(ListEtlMetaNameRequest request);

    CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request);

    CompletableFuture<ListMachineGroupResponse> listMachineGroup(ListMachineGroupRequest request);

    CompletableFuture<ListMachinesResponse> listMachines(ListMachinesRequest request);

    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    CompletableFuture<ListSavedSearchResponse> listSavedSearch(ListSavedSearchRequest request);

    CompletableFuture<ListShardsResponse> listShards(ListShardsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<MergeShardsResponse> mergeShards(MergeShardsRequest request);

    CompletableFuture<RemoveConfigFromMachineGroupResponse> removeConfigFromMachineGroup(RemoveConfigFromMachineGroupRequest request);

    CompletableFuture<SplitShardResponse> splitShard(SplitShardRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    CompletableFuture<UpdateCheckPointResponse> updateCheckPoint(UpdateCheckPointRequest request);

    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    CompletableFuture<UpdateEtlMetaResponse> updateEtlMeta(UpdateEtlMetaRequest request);

    CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request);

    CompletableFuture<UpdateLogStoreResponse> updateLogStore(UpdateLogStoreRequest request);

    CompletableFuture<UpdateLoggingResponse> updateLogging(UpdateLoggingRequest request);

    CompletableFuture<UpdateMachineGroupResponse> updateMachineGroup(UpdateMachineGroupRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateSavedSearchResponse> updateSavedSearch(UpdateSavedSearchRequest request);

}
