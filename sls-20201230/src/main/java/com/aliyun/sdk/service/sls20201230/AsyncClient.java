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

    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request);

    CompletableFuture<CreateLoggingResponse> createLogging(CreateLoggingRequest request);

    CompletableFuture<CreateMachineGroupResponse> createMachineGroup(CreateMachineGroupRequest request);

    CompletableFuture<CreateOdpsShipperResponse> createOdpsShipper(CreateOdpsShipperRequest request);

    CompletableFuture<CreateOssExternalStoreResponse> createOssExternalStore(CreateOssExternalStoreRequest request);

    CompletableFuture<CreateOssShipperResponse> createOssShipper(CreateOssShipperRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateRdsExternalStoreResponse> createRdsExternalStore(CreateRdsExternalStoreRequest request);

    CompletableFuture<CreateSavedSearchResponse> createSavedSearch(CreateSavedSearchRequest request);

    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteExternalStoreResponse> deleteExternalStore(DeleteExternalStoreRequest request);

    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request);

    CompletableFuture<DeleteLoggingResponse> deleteLogging(DeleteLoggingRequest request);

    CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteProjectPolicyResponse> deleteProjectPolicy(DeleteProjectPolicyRequest request);

    CompletableFuture<DeleteSavedSearchResponse> deleteSavedSearch(DeleteSavedSearchRequest request);

    CompletableFuture<DeleteShipperResponse> deleteShipper(DeleteShipperRequest request);

    CompletableFuture<GetAppliedConfigsResponse> getAppliedConfigs(GetAppliedConfigsRequest request);

    CompletableFuture<GetAppliedMachineGroupsResponse> getAppliedMachineGroups(GetAppliedMachineGroupsRequest request);

    CompletableFuture<GetCheckPointResponse> getCheckPoint(GetCheckPointRequest request);

    CompletableFuture<GetContextLogsResponse> getContextLogs(GetContextLogsRequest request);

    CompletableFuture<GetCursorResponse> getCursor(GetCursorRequest request);

    CompletableFuture<GetCursorTimeResponse> getCursorTime(GetCursorTimeRequest request);

    CompletableFuture<GetExternalStoreResponse> getExternalStore(GetExternalStoreRequest request);

    CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request);

    CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request);

    CompletableFuture<GetLogStoreResponse> getLogStore(GetLogStoreRequest request);

    CompletableFuture<GetLoggingResponse> getLogging(GetLoggingRequest request);

    CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request);

    CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetProjectLogsResponse> getProjectLogs(GetProjectLogsRequest request);

    CompletableFuture<GetProjectPolicyResponse> getProjectPolicy(GetProjectPolicyRequest request);

    CompletableFuture<GetSavedSearchResponse> getSavedSearch(GetSavedSearchRequest request);

    CompletableFuture<GetShipperStatusResponse> getShipperStatus(GetShipperStatusRequest request);

    CompletableFuture<ListConsumerGroupResponse> listConsumerGroup(ListConsumerGroupRequest request);

    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    CompletableFuture<ListExternalStoreResponse> listExternalStore(ListExternalStoreRequest request);

    CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request);

    CompletableFuture<ListMachineGroupResponse> listMachineGroup(ListMachineGroupRequest request);

    CompletableFuture<ListMachinesResponse> listMachines(ListMachinesRequest request);

    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    CompletableFuture<ListSavedSearchResponse> listSavedSearch(ListSavedSearchRequest request);

    CompletableFuture<ListShardsResponse> listShards(ListShardsRequest request);

    CompletableFuture<ListShipperResponse> listShipper(ListShipperRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<PullDataResponse> pullData(PullDataRequest request);

    CompletableFuture<PutProjectPolicyResponse> putProjectPolicy(PutProjectPolicyRequest request);

    CompletableFuture<PutWebtrackingResponse> putWebtracking(PutWebtrackingRequest request);

    CompletableFuture<RemoveConfigFromMachineGroupResponse> removeConfigFromMachineGroup(RemoveConfigFromMachineGroupRequest request);

    CompletableFuture<SplitShardResponse> splitShard(SplitShardRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request);

    CompletableFuture<UpdateLogStoreResponse> updateLogStore(UpdateLogStoreRequest request);

    CompletableFuture<UpdateLoggingResponse> updateLogging(UpdateLoggingRequest request);

    CompletableFuture<UpdateMachineGroupResponse> updateMachineGroup(UpdateMachineGroupRequest request);

    CompletableFuture<UpdateMachineGroupMachineResponse> updateMachineGroupMachine(UpdateMachineGroupMachineRequest request);

    CompletableFuture<UpdateOdpsShipperResponse> updateOdpsShipper(UpdateOdpsShipperRequest request);

    CompletableFuture<UpdateOssExternalStoreResponse> updateOssExternalStore(UpdateOssExternalStoreRequest request);

    CompletableFuture<UpdateOssShipperResponse> updateOssShipper(UpdateOssShipperRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateRdsExternalStoreResponse> updateRdsExternalStore(UpdateRdsExternalStoreRequest request);

    CompletableFuture<UpdateSavedSearchResponse> updateSavedSearch(UpdateSavedSearchRequest request);

}
