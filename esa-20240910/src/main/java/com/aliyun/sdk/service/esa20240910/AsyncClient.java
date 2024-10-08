// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.esa20240910.models.*;
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

    CompletableFuture<ActivateClientCertificateResponse> activateClientCertificate(ActivateClientCertificateRequest request);

    CompletableFuture<AddUserBusinessFormResponse> addUserBusinessForm(AddUserBusinessFormRequest request);

    CompletableFuture<AdvancePurgeObjectCacheResponse> advancePurgeObjectCache(AdvancePurgeObjectCacheRequest request);

    CompletableFuture<BatchCreateRecordsResponse> batchCreateRecords(BatchCreateRecordsRequest request);

    CompletableFuture<BatchCreateWafRulesResponse> batchCreateWafRules(BatchCreateWafRulesRequest request);

    CompletableFuture<BatchDeleteKvResponse> batchDeleteKv(BatchDeleteKvRequest request);

    CompletableFuture<BatchGetExpressionFieldsResponse> batchGetExpressionFields(BatchGetExpressionFieldsRequest request);

    CompletableFuture<BatchPutKvResponse> batchPutKv(BatchPutKvRequest request);

    CompletableFuture<BatchUpdateWafRulesResponse> batchUpdateWafRules(BatchUpdateWafRulesRequest request);

    CompletableFuture<BlockObjectResponse> blockObject(BlockObjectRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckSiteNameResponse> checkSiteName(CheckSiteNameRequest request);

    CompletableFuture<CheckSiteProjectNameResponse> checkSiteProjectName(CheckSiteProjectNameRequest request);

    CompletableFuture<CheckUserProjectNameResponse> checkUserProjectName(CheckUserProjectNameRequest request);

    CompletableFuture<CreateCustomScenePolicyResponse> createCustomScenePolicy(CreateCustomScenePolicyRequest request);

    CompletableFuture<CreateKvNamespaceResponse> createKvNamespace(CreateKvNamespaceRequest request);

    CompletableFuture<CreateListResponse> createList(CreateListRequest request);

    CompletableFuture<CreatePageResponse> createPage(CreatePageRequest request);

    CompletableFuture<CreateRecordResponse> createRecord(CreateRecordRequest request);

    CompletableFuture<CreateScheduledPreloadExecutionsResponse> createScheduledPreloadExecutions(CreateScheduledPreloadExecutionsRequest request);

    CompletableFuture<CreateScheduledPreloadJobResponse> createScheduledPreloadJob(CreateScheduledPreloadJobRequest request);

    CompletableFuture<CreateSiteResponse> createSite(CreateSiteRequest request);

    CompletableFuture<CreateSiteCustomLogResponse> createSiteCustomLog(CreateSiteCustomLogRequest request);

    CompletableFuture<CreateSiteDeliveryTaskResponse> createSiteDeliveryTask(CreateSiteDeliveryTaskRequest request);

    CompletableFuture<CreateUserDeliveryTaskResponse> createUserDeliveryTask(CreateUserDeliveryTaskRequest request);

    CompletableFuture<CreateWafRuleResponse> createWafRule(CreateWafRuleRequest request);

    CompletableFuture<CreateWaitingRoomResponse> createWaitingRoom(CreateWaitingRoomRequest request);

    CompletableFuture<CreateWaitingRoomEventResponse> createWaitingRoomEvent(CreateWaitingRoomEventRequest request);

    CompletableFuture<CreateWaitingRoomRuleResponse> createWaitingRoomRule(CreateWaitingRoomRuleRequest request);

    CompletableFuture<DeleteCustomScenePolicyResponse> deleteCustomScenePolicy(DeleteCustomScenePolicyRequest request);

    CompletableFuture<DeleteListResponse> deleteList(DeleteListRequest request);

    CompletableFuture<DeletePageResponse> deletePage(DeletePageRequest request);

    CompletableFuture<DeleteRecordResponse> deleteRecord(DeleteRecordRequest request);

    CompletableFuture<DeleteScheduledPreloadExecutionResponse> deleteScheduledPreloadExecution(DeleteScheduledPreloadExecutionRequest request);

    CompletableFuture<DeleteScheduledPreloadJobResponse> deleteScheduledPreloadJob(DeleteScheduledPreloadJobRequest request);

    CompletableFuture<DeleteSiteResponse> deleteSite(DeleteSiteRequest request);

    CompletableFuture<DeleteSiteDeliveryTaskResponse> deleteSiteDeliveryTask(DeleteSiteDeliveryTaskRequest request);

    CompletableFuture<DeleteUserDeliveryTaskResponse> deleteUserDeliveryTask(DeleteUserDeliveryTaskRequest request);

    CompletableFuture<DeleteWafRuleResponse> deleteWafRule(DeleteWafRuleRequest request);

    CompletableFuture<DeleteWafRulesetResponse> deleteWafRuleset(DeleteWafRulesetRequest request);

    CompletableFuture<DeleteWaitingRoomResponse> deleteWaitingRoom(DeleteWaitingRoomRequest request);

    CompletableFuture<DeleteWaitingRoomEventResponse> deleteWaitingRoomEvent(DeleteWaitingRoomEventRequest request);

    CompletableFuture<DeleteWaitingRoomRuleResponse> deleteWaitingRoomRule(DeleteWaitingRoomRuleRequest request);

    CompletableFuture<DescribeCustomScenePoliciesResponse> describeCustomScenePolicies(DescribeCustomScenePoliciesRequest request);

    CompletableFuture<DescribeDDoSAllEventListResponse> describeDDoSAllEventList(DescribeDDoSAllEventListRequest request);

    CompletableFuture<DescribeHttpDDoSAttackIntelligentProtectionResponse> describeHttpDDoSAttackIntelligentProtection(DescribeHttpDDoSAttackIntelligentProtectionRequest request);

    CompletableFuture<DescribeHttpDDoSAttackProtectionResponse> describeHttpDDoSAttackProtection(DescribeHttpDDoSAttackProtectionRequest request);

    CompletableFuture<DescribeIPRangeListResponse> describeIPRangeList(DescribeIPRangeListRequest request);

    CompletableFuture<DescribePreloadTasksResponse> describePreloadTasks(DescribePreloadTasksRequest request);

    CompletableFuture<DescribePurgeTasksResponse> describePurgeTasks(DescribePurgeTasksRequest request);

    CompletableFuture<DisableCustomScenePolicyResponse> disableCustomScenePolicy(DisableCustomScenePolicyRequest request);

    CompletableFuture<EditSiteWafSettingsResponse> editSiteWafSettings(EditSiteWafSettingsRequest request);

    CompletableFuture<EnableCustomScenePolicyResponse> enableCustomScenePolicy(EnableCustomScenePolicyRequest request);

    CompletableFuture<ExportRecordsResponse> exportRecords(ExportRecordsRequest request);

    CompletableFuture<GetKvNamespaceResponse> getKvNamespace(GetKvNamespaceRequest request);

    CompletableFuture<GetListResponse> getList(GetListRequest request);

    CompletableFuture<GetPageResponse> getPage(GetPageRequest request);

    CompletableFuture<GetPurgeQuotaResponse> getPurgeQuota(GetPurgeQuotaRequest request);

    CompletableFuture<GetRealtimeDeliveryFieldResponse> getRealtimeDeliveryField(GetRealtimeDeliveryFieldRequest request);

    CompletableFuture<GetRecordResponse> getRecord(GetRecordRequest request);

    CompletableFuture<GetScheduledPreloadJobResponse> getScheduledPreloadJob(GetScheduledPreloadJobRequest request);

    CompletableFuture<GetSiteResponse> getSite(GetSiteRequest request);

    CompletableFuture<GetSiteCurrentNSResponse> getSiteCurrentNS(GetSiteCurrentNSRequest request);

    CompletableFuture<GetSiteCustomLogResponse> getSiteCustomLog(GetSiteCustomLogRequest request);

    CompletableFuture<GetSiteDeliveryTaskResponse> getSiteDeliveryTask(GetSiteDeliveryTaskRequest request);

    CompletableFuture<GetSiteLogDeliveryQuotaResponse> getSiteLogDeliveryQuota(GetSiteLogDeliveryQuotaRequest request);

    CompletableFuture<GetSiteWafSettingsResponse> getSiteWafSettings(GetSiteWafSettingsRequest request);

    CompletableFuture<GetUploadTaskResponse> getUploadTask(GetUploadTaskRequest request);

    CompletableFuture<GetUserDeliveryTaskResponse> getUserDeliveryTask(GetUserDeliveryTaskRequest request);

    CompletableFuture<GetUserLogDeliveryQuotaResponse> getUserLogDeliveryQuota(GetUserLogDeliveryQuotaRequest request);

    CompletableFuture<GetWafBotAppKeyResponse> getWafBotAppKey(GetWafBotAppKeyRequest request);

    CompletableFuture<GetWafFilterResponse> getWafFilter(GetWafFilterRequest request);

    CompletableFuture<GetWafQuotaResponse> getWafQuota(GetWafQuotaRequest request);

    CompletableFuture<GetWafRuleResponse> getWafRule(GetWafRuleRequest request);

    CompletableFuture<GetWafRulesetResponse> getWafRuleset(GetWafRulesetRequest request);

    CompletableFuture<ListEdgeContainerAppRecordsResponse> listEdgeContainerAppRecords(ListEdgeContainerAppRecordsRequest request);

    CompletableFuture<ListEdgeContainerRecordsResponse> listEdgeContainerRecords(ListEdgeContainerRecordsRequest request);

    CompletableFuture<ListEdgeRoutineRecordsResponse> listEdgeRoutineRecords(ListEdgeRoutineRecordsRequest request);

    CompletableFuture<ListKvsResponse> listKvs(ListKvsRequest request);

    CompletableFuture<ListListsResponse> listLists(ListListsRequest request);

    CompletableFuture<ListLoadBalancerRegionsResponse> listLoadBalancerRegions(ListLoadBalancerRegionsRequest request);

    CompletableFuture<ListManagedRulesGroupsResponse> listManagedRulesGroups(ListManagedRulesGroupsRequest request);

    CompletableFuture<ListPagesResponse> listPages(ListPagesRequest request);

    CompletableFuture<ListRecordsResponse> listRecords(ListRecordsRequest request);

    CompletableFuture<ListScheduledPreloadExecutionsResponse> listScheduledPreloadExecutions(ListScheduledPreloadExecutionsRequest request);

    CompletableFuture<ListScheduledPreloadJobsResponse> listScheduledPreloadJobs(ListScheduledPreloadJobsRequest request);

    CompletableFuture<ListSiteDeliveryTasksResponse> listSiteDeliveryTasks(ListSiteDeliveryTasksRequest request);

    CompletableFuture<ListSitesResponse> listSites(ListSitesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListUploadTasksResponse> listUploadTasks(ListUploadTasksRequest request);

    CompletableFuture<ListUserDeliveryTasksResponse> listUserDeliveryTasks(ListUserDeliveryTasksRequest request);

    CompletableFuture<ListWafPhasesResponse> listWafPhases(ListWafPhasesRequest request);

    CompletableFuture<ListWafRulesResponse> listWafRules(ListWafRulesRequest request);

    CompletableFuture<ListWafRulesetsResponse> listWafRulesets(ListWafRulesetsRequest request);

    CompletableFuture<ListWafTemplateRulesResponse> listWafTemplateRules(ListWafTemplateRulesRequest request);

    CompletableFuture<ListWafUsageOfRulesResponse> listWafUsageOfRules(ListWafUsageOfRulesRequest request);

    CompletableFuture<ListWaitingRoomEventsResponse> listWaitingRoomEvents(ListWaitingRoomEventsRequest request);

    CompletableFuture<ListWaitingRoomRulesResponse> listWaitingRoomRules(ListWaitingRoomRulesRequest request);

    CompletableFuture<ListWaitingRoomsResponse> listWaitingRooms(ListWaitingRoomsRequest request);

    CompletableFuture<PreloadCachesResponse> preloadCaches(PreloadCachesRequest request);

    CompletableFuture<PurgeCachesResponse> purgeCaches(PurgeCachesRequest request);

    CompletableFuture<PutKvResponse> putKv(PutKvRequest request);

    CompletableFuture<PutKvAccountResponse> putKvAccount(PutKvAccountRequest request);

    CompletableFuture<ResetScheduledPreloadJobResponse> resetScheduledPreloadJob(ResetScheduledPreloadJobRequest request);

    CompletableFuture<SetCertificateResponse> setCertificate(SetCertificateRequest request);

    CompletableFuture<SetHttpDDoSAttackIntelligentProtectionResponse> setHttpDDoSAttackIntelligentProtection(SetHttpDDoSAttackIntelligentProtectionRequest request);

    CompletableFuture<SetHttpDDoSAttackProtectionResponse> setHttpDDoSAttackProtection(SetHttpDDoSAttackProtectionRequest request);

    CompletableFuture<StartScheduledPreloadExecutionResponse> startScheduledPreloadExecution(StartScheduledPreloadExecutionRequest request);

    CompletableFuture<StopScheduledPreloadExecutionResponse> stopScheduledPreloadExecution(StopScheduledPreloadExecutionRequest request);

    CompletableFuture<TransformExpressionToMatchResponse> transformExpressionToMatch(TransformExpressionToMatchRequest request);

    CompletableFuture<TransformMatchToExpressionResponse> transformMatchToExpression(TransformMatchToExpressionRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateCustomScenePolicyResponse> updateCustomScenePolicy(UpdateCustomScenePolicyRequest request);

    CompletableFuture<UpdateKvNamespaceResponse> updateKvNamespace(UpdateKvNamespaceRequest request);

    CompletableFuture<UpdateListResponse> updateList(UpdateListRequest request);

    CompletableFuture<UpdatePageResponse> updatePage(UpdatePageRequest request);

    CompletableFuture<UpdateRecordResponse> updateRecord(UpdateRecordRequest request);

    CompletableFuture<UpdateScheduledPreloadExecutionResponse> updateScheduledPreloadExecution(UpdateScheduledPreloadExecutionRequest request);

    CompletableFuture<UpdateSiteAccessTypeResponse> updateSiteAccessType(UpdateSiteAccessTypeRequest request);

    CompletableFuture<UpdateSiteCoverageResponse> updateSiteCoverage(UpdateSiteCoverageRequest request);

    CompletableFuture<UpdateSiteCustomLogResponse> updateSiteCustomLog(UpdateSiteCustomLogRequest request);

    CompletableFuture<UpdateSiteDeliveryTaskResponse> updateSiteDeliveryTask(UpdateSiteDeliveryTaskRequest request);

    CompletableFuture<UpdateSiteDeliveryTaskStatusResponse> updateSiteDeliveryTaskStatus(UpdateSiteDeliveryTaskStatusRequest request);

    CompletableFuture<UpdateSiteVanityNSResponse> updateSiteVanityNS(UpdateSiteVanityNSRequest request);

    CompletableFuture<UpdateUserDeliveryTaskResponse> updateUserDeliveryTask(UpdateUserDeliveryTaskRequest request);

    CompletableFuture<UpdateUserDeliveryTaskStatusResponse> updateUserDeliveryTaskStatus(UpdateUserDeliveryTaskStatusRequest request);

    CompletableFuture<UpdateWafRuleResponse> updateWafRule(UpdateWafRuleRequest request);

    CompletableFuture<UpdateWafRulesetResponse> updateWafRuleset(UpdateWafRulesetRequest request);

    CompletableFuture<UpdateWaitingRoomResponse> updateWaitingRoom(UpdateWaitingRoomRequest request);

    CompletableFuture<UpdateWaitingRoomEventResponse> updateWaitingRoomEvent(UpdateWaitingRoomEventRequest request);

    CompletableFuture<UpdateWaitingRoomRuleResponse> updateWaitingRoomRule(UpdateWaitingRoomRuleRequest request);

    CompletableFuture<VerifySiteResponse> verifySite(VerifySiteRequest request);

}
