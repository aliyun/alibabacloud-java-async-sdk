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

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<ConsumerGroupHeartBeatResponse> consumerGroupHeartBeat(ConsumerGroupHeartBeatRequest request);

    CompletableFuture<CreateAnnotationDataSetResponse> createAnnotationDataSet(CreateAnnotationDataSetRequest request);

    CompletableFuture<CreateAnnotationLabelResponse> createAnnotationLabel(CreateAnnotationLabelRequest request);

    CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request);

    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    CompletableFuture<CreateDashboardResponse> createDashboard(CreateDashboardRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request);

    CompletableFuture<CreateLoggingResponse> createLogging(CreateLoggingRequest request);

    CompletableFuture<CreateLogtailPipelineConfigResponse> createLogtailPipelineConfig(CreateLogtailPipelineConfigRequest request);

    CompletableFuture<CreateMachineGroupResponse> createMachineGroup(CreateMachineGroupRequest request);

    CompletableFuture<CreateOssExternalStoreResponse> createOssExternalStore(CreateOssExternalStoreRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateRdsExternalStoreResponse> createRdsExternalStore(CreateRdsExternalStoreRequest request);

    CompletableFuture<CreateSavedSearchResponse> createSavedSearch(CreateSavedSearchRequest request);

    CompletableFuture<DeleteAnnotationDataResponse> deleteAnnotationData(DeleteAnnotationDataRequest request);

    CompletableFuture<DeleteAnnotationDataSetResponse> deleteAnnotationDataSet(DeleteAnnotationDataSetRequest request);

    CompletableFuture<DeleteAnnotationLabelResponse> deleteAnnotationLabel(DeleteAnnotationLabelRequest request);

    CompletableFuture<DeleteCollectionPolicyResponse> deleteCollectionPolicy(DeleteCollectionPolicyRequest request);

    CompletableFuture<DeleteConfigResponse> deleteConfig(DeleteConfigRequest request);

    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteDashboardResponse> deleteDashboard(DeleteDashboardRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteExternalStoreResponse> deleteExternalStore(DeleteExternalStoreRequest request);

    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request);

    CompletableFuture<DeleteLoggingResponse> deleteLogging(DeleteLoggingRequest request);

    CompletableFuture<DeleteLogtailPipelineConfigResponse> deleteLogtailPipelineConfig(DeleteLogtailPipelineConfigRequest request);

    CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteProjectPolicyResponse> deleteProjectPolicy(DeleteProjectPolicyRequest request);

    CompletableFuture<DeleteSavedSearchResponse> deleteSavedSearch(DeleteSavedSearchRequest request);

    CompletableFuture<DeleteShipperResponse> deleteShipper(DeleteShipperRequest request);

    CompletableFuture<GetAnnotationDataResponse> getAnnotationData(GetAnnotationDataRequest request);

    CompletableFuture<GetAnnotationDataSetResponse> getAnnotationDataSet(GetAnnotationDataSetRequest request);

    CompletableFuture<GetAnnotationLabelResponse> getAnnotationLabel(GetAnnotationLabelRequest request);

    CompletableFuture<GetAppliedConfigsResponse> getAppliedConfigs(GetAppliedConfigsRequest request);

    CompletableFuture<GetAppliedMachineGroupsResponse> getAppliedMachineGroups(GetAppliedMachineGroupsRequest request);

    CompletableFuture<GetCheckPointResponse> getCheckPoint(GetCheckPointRequest request);

    CompletableFuture<GetCollectionPolicyResponse> getCollectionPolicy(GetCollectionPolicyRequest request);

    CompletableFuture<GetConfigResponse> getConfig(GetConfigRequest request);

    CompletableFuture<GetContextLogsResponse> getContextLogs(GetContextLogsRequest request);

    CompletableFuture<GetCursorResponse> getCursor(GetCursorRequest request);

    CompletableFuture<GetCursorTimeResponse> getCursorTime(GetCursorTimeRequest request);

    CompletableFuture<GetDashboardResponse> getDashboard(GetDashboardRequest request);

    CompletableFuture<GetExternalStoreResponse> getExternalStore(GetExternalStoreRequest request);

    CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request);

    CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request);

    CompletableFuture<GetLogStoreResponse> getLogStore(GetLogStoreRequest request);

    CompletableFuture<GetLogStoreMeteringModeResponse> getLogStoreMeteringMode(GetLogStoreMeteringModeRequest request);

    CompletableFuture<GetLoggingResponse> getLogging(GetLoggingRequest request);

    CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request);

    CompletableFuture<GetLogsV2Response> getLogsV2(GetLogsV2Request request);

    CompletableFuture<GetLogtailPipelineConfigResponse> getLogtailPipelineConfig(GetLogtailPipelineConfigRequest request);

    CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetProjectLogsResponse> getProjectLogs(GetProjectLogsRequest request);

    CompletableFuture<GetProjectPolicyResponse> getProjectPolicy(GetProjectPolicyRequest request);

    CompletableFuture<GetSavedSearchResponse> getSavedSearch(GetSavedSearchRequest request);

    CompletableFuture<GetShipperStatusResponse> getShipperStatus(GetShipperStatusRequest request);

    CompletableFuture<ListAnnotationDataResponse> listAnnotationData(ListAnnotationDataRequest request);

    CompletableFuture<ListAnnotationDataSetsResponse> listAnnotationDataSets(ListAnnotationDataSetsRequest request);

    CompletableFuture<ListAnnotationLabelsResponse> listAnnotationLabels(ListAnnotationLabelsRequest request);

    CompletableFuture<ListCollectionPoliciesResponse> listCollectionPolicies(ListCollectionPoliciesRequest request);

    CompletableFuture<ListConfigResponse> listConfig(ListConfigRequest request);

    CompletableFuture<ListConsumerGroupResponse> listConsumerGroup(ListConsumerGroupRequest request);

    CompletableFuture<ListDashboardResponse> listDashboard(ListDashboardRequest request);

    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    CompletableFuture<ListExternalStoreResponse> listExternalStore(ListExternalStoreRequest request);

    CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request);

    CompletableFuture<ListLogtailPipelineConfigResponse> listLogtailPipelineConfig(ListLogtailPipelineConfigRequest request);

    CompletableFuture<ListMachineGroupResponse> listMachineGroup(ListMachineGroupRequest request);

    CompletableFuture<ListMachinesResponse> listMachines(ListMachinesRequest request);

    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    CompletableFuture<ListSavedSearchResponse> listSavedSearch(ListSavedSearchRequest request);

    CompletableFuture<ListShardsResponse> listShards(ListShardsRequest request);

    CompletableFuture<ListShipperResponse> listShipper(ListShipperRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<PutAnnotationDataResponse> putAnnotationData(PutAnnotationDataRequest request);

    CompletableFuture<PutProjectPolicyResponse> putProjectPolicy(PutProjectPolicyRequest request);

    CompletableFuture<PutWebtrackingResponse> putWebtracking(PutWebtrackingRequest request);

    CompletableFuture<QueryMLServiceResultsResponse> queryMLServiceResults(QueryMLServiceResultsRequest request);

    CompletableFuture<RemoveConfigFromMachineGroupResponse> removeConfigFromMachineGroup(RemoveConfigFromMachineGroupRequest request);

    CompletableFuture<SplitShardResponse> splitShard(SplitShardRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAnnotationDataSetResponse> updateAnnotationDataSet(UpdateAnnotationDataSetRequest request);

    CompletableFuture<UpdateAnnotationLabelResponse> updateAnnotationLabel(UpdateAnnotationLabelRequest request);

    CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request);

    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    CompletableFuture<UpdateDashboardResponse> updateDashboard(UpdateDashboardRequest request);

    CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request);

    CompletableFuture<UpdateLogStoreResponse> updateLogStore(UpdateLogStoreRequest request);

    CompletableFuture<UpdateLogStoreMeteringModeResponse> updateLogStoreMeteringMode(UpdateLogStoreMeteringModeRequest request);

    CompletableFuture<UpdateLoggingResponse> updateLogging(UpdateLoggingRequest request);

    CompletableFuture<UpdateLogtailPipelineConfigResponse> updateLogtailPipelineConfig(UpdateLogtailPipelineConfigRequest request);

    CompletableFuture<UpdateMachineGroupResponse> updateMachineGroup(UpdateMachineGroupRequest request);

    CompletableFuture<UpdateMachineGroupMachineResponse> updateMachineGroupMachine(UpdateMachineGroupMachineRequest request);

    CompletableFuture<UpdateOssExternalStoreResponse> updateOssExternalStore(UpdateOssExternalStoreRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateRdsExternalStoreResponse> updateRdsExternalStore(UpdateRdsExternalStoreRequest request);

    CompletableFuture<UpdateSavedSearchResponse> updateSavedSearch(UpdateSavedSearchRequest request);

    CompletableFuture<UpsertCollectionPolicyResponse> upsertCollectionPolicy(UpsertCollectionPolicyRequest request);

}
