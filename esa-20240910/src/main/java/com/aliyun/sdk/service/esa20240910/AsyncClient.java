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

    /**
     * @param request the request parameters of ActivateClientCertificate  ActivateClientCertificateRequest
     * @return ActivateClientCertificateResponse
     */
    CompletableFuture<ActivateClientCertificateResponse> activateClientCertificate(ActivateClientCertificateRequest request);

    /**
     * @param request the request parameters of BatchCreateRecords  BatchCreateRecordsRequest
     * @return BatchCreateRecordsResponse
     */
    CompletableFuture<BatchCreateRecordsResponse> batchCreateRecords(BatchCreateRecordsRequest request);

    /**
     * @param request the request parameters of BatchCreateWafRules  BatchCreateWafRulesRequest
     * @return BatchCreateWafRulesResponse
     */
    CompletableFuture<BatchCreateWafRulesResponse> batchCreateWafRules(BatchCreateWafRulesRequest request);

    /**
     * @param request the request parameters of BatchDeleteKv  BatchDeleteKvRequest
     * @return BatchDeleteKvResponse
     */
    CompletableFuture<BatchDeleteKvResponse> batchDeleteKv(BatchDeleteKvRequest request);

    /**
     * @param request the request parameters of BatchGetExpressionFields  BatchGetExpressionFieldsRequest
     * @return BatchGetExpressionFieldsResponse
     */
    CompletableFuture<BatchGetExpressionFieldsResponse> batchGetExpressionFields(BatchGetExpressionFieldsRequest request);

    /**
     * @param request the request parameters of BatchPutKv  BatchPutKvRequest
     * @return BatchPutKvResponse
     */
    CompletableFuture<BatchPutKvResponse> batchPutKv(BatchPutKvRequest request);

    /**
     * @param request the request parameters of BatchUpdateWafRules  BatchUpdateWafRulesRequest
     * @return BatchUpdateWafRulesResponse
     */
    CompletableFuture<BatchUpdateWafRulesResponse> batchUpdateWafRules(BatchUpdateWafRulesRequest request);

    /**
     * @param request the request parameters of BlockObject  BlockObjectRequest
     * @return BlockObjectResponse
     */
    CompletableFuture<BlockObjectResponse> blockObject(BlockObjectRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckSiteName  CheckSiteNameRequest
     * @return CheckSiteNameResponse
     */
    CompletableFuture<CheckSiteNameResponse> checkSiteName(CheckSiteNameRequest request);

    /**
     * @param request the request parameters of CheckSiteProjectName  CheckSiteProjectNameRequest
     * @return CheckSiteProjectNameResponse
     */
    CompletableFuture<CheckSiteProjectNameResponse> checkSiteProjectName(CheckSiteProjectNameRequest request);

    /**
     * @param request the request parameters of CheckUserProjectName  CheckUserProjectNameRequest
     * @return CheckUserProjectNameResponse
     */
    CompletableFuture<CheckUserProjectNameResponse> checkUserProjectName(CheckUserProjectNameRequest request);

    /**
     * @param request the request parameters of CreateCustomScenePolicy  CreateCustomScenePolicyRequest
     * @return CreateCustomScenePolicyResponse
     */
    CompletableFuture<CreateCustomScenePolicyResponse> createCustomScenePolicy(CreateCustomScenePolicyRequest request);

    /**
     * @param request the request parameters of CreateKvNamespace  CreateKvNamespaceRequest
     * @return CreateKvNamespaceResponse
     */
    CompletableFuture<CreateKvNamespaceResponse> createKvNamespace(CreateKvNamespaceRequest request);

    /**
     * @param request the request parameters of CreateList  CreateListRequest
     * @return CreateListResponse
     */
    CompletableFuture<CreateListResponse> createList(CreateListRequest request);

    /**
     * @param request the request parameters of CreatePage  CreatePageRequest
     * @return CreatePageResponse
     */
    CompletableFuture<CreatePageResponse> createPage(CreatePageRequest request);

    /**
     * @param request the request parameters of CreateRecord  CreateRecordRequest
     * @return CreateRecordResponse
     */
    CompletableFuture<CreateRecordResponse> createRecord(CreateRecordRequest request);

    /**
     * @param request the request parameters of CreateScheduledPreloadExecutions  CreateScheduledPreloadExecutionsRequest
     * @return CreateScheduledPreloadExecutionsResponse
     */
    CompletableFuture<CreateScheduledPreloadExecutionsResponse> createScheduledPreloadExecutions(CreateScheduledPreloadExecutionsRequest request);

    /**
     * @param request the request parameters of CreateScheduledPreloadJob  CreateScheduledPreloadJobRequest
     * @return CreateScheduledPreloadJobResponse
     */
    CompletableFuture<CreateScheduledPreloadJobResponse> createScheduledPreloadJob(CreateScheduledPreloadJobRequest request);

    /**
     * @param request the request parameters of CreateSite  CreateSiteRequest
     * @return CreateSiteResponse
     */
    CompletableFuture<CreateSiteResponse> createSite(CreateSiteRequest request);

    /**
     * @param request the request parameters of CreateSiteCustomLog  CreateSiteCustomLogRequest
     * @return CreateSiteCustomLogResponse
     */
    CompletableFuture<CreateSiteCustomLogResponse> createSiteCustomLog(CreateSiteCustomLogRequest request);

    /**
     * @param request the request parameters of CreateSiteDeliveryTask  CreateSiteDeliveryTaskRequest
     * @return CreateSiteDeliveryTaskResponse
     */
    CompletableFuture<CreateSiteDeliveryTaskResponse> createSiteDeliveryTask(CreateSiteDeliveryTaskRequest request);

    /**
     * @param request the request parameters of CreateUserDeliveryTask  CreateUserDeliveryTaskRequest
     * @return CreateUserDeliveryTaskResponse
     */
    CompletableFuture<CreateUserDeliveryTaskResponse> createUserDeliveryTask(CreateUserDeliveryTaskRequest request);

    /**
     * @param request the request parameters of CreateWafRule  CreateWafRuleRequest
     * @return CreateWafRuleResponse
     */
    CompletableFuture<CreateWafRuleResponse> createWafRule(CreateWafRuleRequest request);

    /**
     * @param request the request parameters of CreateWaitingRoom  CreateWaitingRoomRequest
     * @return CreateWaitingRoomResponse
     */
    CompletableFuture<CreateWaitingRoomResponse> createWaitingRoom(CreateWaitingRoomRequest request);

    /**
     * @param request the request parameters of CreateWaitingRoomEvent  CreateWaitingRoomEventRequest
     * @return CreateWaitingRoomEventResponse
     */
    CompletableFuture<CreateWaitingRoomEventResponse> createWaitingRoomEvent(CreateWaitingRoomEventRequest request);

    /**
     * @param request the request parameters of CreateWaitingRoomRule  CreateWaitingRoomRuleRequest
     * @return CreateWaitingRoomRuleResponse
     */
    CompletableFuture<CreateWaitingRoomRuleResponse> createWaitingRoomRule(CreateWaitingRoomRuleRequest request);

    /**
     * @param request the request parameters of DeleteCustomScenePolicy  DeleteCustomScenePolicyRequest
     * @return DeleteCustomScenePolicyResponse
     */
    CompletableFuture<DeleteCustomScenePolicyResponse> deleteCustomScenePolicy(DeleteCustomScenePolicyRequest request);

    /**
     * @param request the request parameters of DeleteKv  DeleteKvRequest
     * @return DeleteKvResponse
     */
    CompletableFuture<DeleteKvResponse> deleteKv(DeleteKvRequest request);

    /**
     * @param request the request parameters of DeleteKvNamespace  DeleteKvNamespaceRequest
     * @return DeleteKvNamespaceResponse
     */
    CompletableFuture<DeleteKvNamespaceResponse> deleteKvNamespace(DeleteKvNamespaceRequest request);

    /**
     * @param request the request parameters of DeleteList  DeleteListRequest
     * @return DeleteListResponse
     */
    CompletableFuture<DeleteListResponse> deleteList(DeleteListRequest request);

    /**
     * @param request the request parameters of DeletePage  DeletePageRequest
     * @return DeletePageResponse
     */
    CompletableFuture<DeletePageResponse> deletePage(DeletePageRequest request);

    /**
     * @param request the request parameters of DeleteRecord  DeleteRecordRequest
     * @return DeleteRecordResponse
     */
    CompletableFuture<DeleteRecordResponse> deleteRecord(DeleteRecordRequest request);

    /**
     * @param request the request parameters of DeleteScheduledPreloadExecution  DeleteScheduledPreloadExecutionRequest
     * @return DeleteScheduledPreloadExecutionResponse
     */
    CompletableFuture<DeleteScheduledPreloadExecutionResponse> deleteScheduledPreloadExecution(DeleteScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of DeleteScheduledPreloadJob  DeleteScheduledPreloadJobRequest
     * @return DeleteScheduledPreloadJobResponse
     */
    CompletableFuture<DeleteScheduledPreloadJobResponse> deleteScheduledPreloadJob(DeleteScheduledPreloadJobRequest request);

    /**
     * @param request the request parameters of DeleteSite  DeleteSiteRequest
     * @return DeleteSiteResponse
     */
    CompletableFuture<DeleteSiteResponse> deleteSite(DeleteSiteRequest request);

    /**
     * @param request the request parameters of DeleteSiteDeliveryTask  DeleteSiteDeliveryTaskRequest
     * @return DeleteSiteDeliveryTaskResponse
     */
    CompletableFuture<DeleteSiteDeliveryTaskResponse> deleteSiteDeliveryTask(DeleteSiteDeliveryTaskRequest request);

    /**
     * @param request the request parameters of DeleteUserDeliveryTask  DeleteUserDeliveryTaskRequest
     * @return DeleteUserDeliveryTaskResponse
     */
    CompletableFuture<DeleteUserDeliveryTaskResponse> deleteUserDeliveryTask(DeleteUserDeliveryTaskRequest request);

    /**
     * @param request the request parameters of DeleteWafRule  DeleteWafRuleRequest
     * @return DeleteWafRuleResponse
     */
    CompletableFuture<DeleteWafRuleResponse> deleteWafRule(DeleteWafRuleRequest request);

    /**
     * @param request the request parameters of DeleteWafRuleset  DeleteWafRulesetRequest
     * @return DeleteWafRulesetResponse
     */
    CompletableFuture<DeleteWafRulesetResponse> deleteWafRuleset(DeleteWafRulesetRequest request);

    /**
     * @param request the request parameters of DeleteWaitingRoom  DeleteWaitingRoomRequest
     * @return DeleteWaitingRoomResponse
     */
    CompletableFuture<DeleteWaitingRoomResponse> deleteWaitingRoom(DeleteWaitingRoomRequest request);

    /**
     * @param request the request parameters of DeleteWaitingRoomEvent  DeleteWaitingRoomEventRequest
     * @return DeleteWaitingRoomEventResponse
     */
    CompletableFuture<DeleteWaitingRoomEventResponse> deleteWaitingRoomEvent(DeleteWaitingRoomEventRequest request);

    /**
     * @param request the request parameters of DeleteWaitingRoomRule  DeleteWaitingRoomRuleRequest
     * @return DeleteWaitingRoomRuleResponse
     */
    CompletableFuture<DeleteWaitingRoomRuleResponse> deleteWaitingRoomRule(DeleteWaitingRoomRuleRequest request);

    /**
     * @param request the request parameters of DescribeCustomScenePolicies  DescribeCustomScenePoliciesRequest
     * @return DescribeCustomScenePoliciesResponse
     */
    CompletableFuture<DescribeCustomScenePoliciesResponse> describeCustomScenePolicies(DescribeCustomScenePoliciesRequest request);

    /**
     * @param request the request parameters of DescribeDDoSAllEventList  DescribeDDoSAllEventListRequest
     * @return DescribeDDoSAllEventListResponse
     */
    CompletableFuture<DescribeDDoSAllEventListResponse> describeDDoSAllEventList(DescribeDDoSAllEventListRequest request);

    /**
     * @param request the request parameters of DescribeHttpDDoSAttackIntelligentProtection  DescribeHttpDDoSAttackIntelligentProtectionRequest
     * @return DescribeHttpDDoSAttackIntelligentProtectionResponse
     */
    CompletableFuture<DescribeHttpDDoSAttackIntelligentProtectionResponse> describeHttpDDoSAttackIntelligentProtection(DescribeHttpDDoSAttackIntelligentProtectionRequest request);

    /**
     * @param request the request parameters of DescribeHttpDDoSAttackProtection  DescribeHttpDDoSAttackProtectionRequest
     * @return DescribeHttpDDoSAttackProtectionResponse
     */
    CompletableFuture<DescribeHttpDDoSAttackProtectionResponse> describeHttpDDoSAttackProtection(DescribeHttpDDoSAttackProtectionRequest request);

    /**
     * @param request the request parameters of DescribeIPRangeList  DescribeIPRangeListRequest
     * @return DescribeIPRangeListResponse
     */
    CompletableFuture<DescribeIPRangeListResponse> describeIPRangeList(DescribeIPRangeListRequest request);

    /**
     * @param request the request parameters of DescribeKvAccountStatus  DescribeKvAccountStatusRequest
     * @return DescribeKvAccountStatusResponse
     */
    CompletableFuture<DescribeKvAccountStatusResponse> describeKvAccountStatus(DescribeKvAccountStatusRequest request);

    /**
     * @param request the request parameters of DescribePreloadTasks  DescribePreloadTasksRequest
     * @return DescribePreloadTasksResponse
     */
    CompletableFuture<DescribePreloadTasksResponse> describePreloadTasks(DescribePreloadTasksRequest request);

    /**
     * @param request the request parameters of DescribePurgeTasks  DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     */
    CompletableFuture<DescribePurgeTasksResponse> describePurgeTasks(DescribePurgeTasksRequest request);

    /**
     * @param request the request parameters of DisableCustomScenePolicy  DisableCustomScenePolicyRequest
     * @return DisableCustomScenePolicyResponse
     */
    CompletableFuture<DisableCustomScenePolicyResponse> disableCustomScenePolicy(DisableCustomScenePolicyRequest request);

    /**
     * @param request the request parameters of EditSiteWafSettings  EditSiteWafSettingsRequest
     * @return EditSiteWafSettingsResponse
     */
    CompletableFuture<EditSiteWafSettingsResponse> editSiteWafSettings(EditSiteWafSettingsRequest request);

    /**
     * @param request the request parameters of EnableCustomScenePolicy  EnableCustomScenePolicyRequest
     * @return EnableCustomScenePolicyResponse
     */
    CompletableFuture<EnableCustomScenePolicyResponse> enableCustomScenePolicy(EnableCustomScenePolicyRequest request);

    /**
     * @param request the request parameters of ExportRecords  ExportRecordsRequest
     * @return ExportRecordsResponse
     */
    CompletableFuture<ExportRecordsResponse> exportRecords(ExportRecordsRequest request);

    /**
     * @param request the request parameters of GetCacheReserveSpecification  GetCacheReserveSpecificationRequest
     * @return GetCacheReserveSpecificationResponse
     */
    CompletableFuture<GetCacheReserveSpecificationResponse> getCacheReserveSpecification(GetCacheReserveSpecificationRequest request);

    /**
     * @param request the request parameters of GetErService  GetErServiceRequest
     * @return GetErServiceResponse
     */
    CompletableFuture<GetErServiceResponse> getErService(GetErServiceRequest request);

    /**
     * @param request the request parameters of GetKv  GetKvRequest
     * @return GetKvResponse
     */
    CompletableFuture<GetKvResponse> getKv(GetKvRequest request);

    /**
     * @param request the request parameters of GetKvAccount  GetKvAccountRequest
     * @return GetKvAccountResponse
     */
    CompletableFuture<GetKvAccountResponse> getKvAccount(GetKvAccountRequest request);

    /**
     * @param request the request parameters of GetKvNamespace  GetKvNamespaceRequest
     * @return GetKvNamespaceResponse
     */
    CompletableFuture<GetKvNamespaceResponse> getKvNamespace(GetKvNamespaceRequest request);

    /**
     * @param request the request parameters of GetList  GetListRequest
     * @return GetListResponse
     */
    CompletableFuture<GetListResponse> getList(GetListRequest request);

    /**
     * @param request the request parameters of GetPage  GetPageRequest
     * @return GetPageResponse
     */
    CompletableFuture<GetPageResponse> getPage(GetPageRequest request);

    /**
     * @param request the request parameters of GetPurgeQuota  GetPurgeQuotaRequest
     * @return GetPurgeQuotaResponse
     */
    CompletableFuture<GetPurgeQuotaResponse> getPurgeQuota(GetPurgeQuotaRequest request);

    /**
     * @param request the request parameters of GetRealtimeDeliveryField  GetRealtimeDeliveryFieldRequest
     * @return GetRealtimeDeliveryFieldResponse
     */
    CompletableFuture<GetRealtimeDeliveryFieldResponse> getRealtimeDeliveryField(GetRealtimeDeliveryFieldRequest request);

    /**
     * @param request the request parameters of GetRecord  GetRecordRequest
     * @return GetRecordResponse
     */
    CompletableFuture<GetRecordResponse> getRecord(GetRecordRequest request);

    /**
     * @param request the request parameters of GetScheduledPreloadJob  GetScheduledPreloadJobRequest
     * @return GetScheduledPreloadJobResponse
     */
    CompletableFuture<GetScheduledPreloadJobResponse> getScheduledPreloadJob(GetScheduledPreloadJobRequest request);

    /**
     * @param request the request parameters of GetSite  GetSiteRequest
     * @return GetSiteResponse
     */
    CompletableFuture<GetSiteResponse> getSite(GetSiteRequest request);

    /**
     * @param request the request parameters of GetSiteCurrentNS  GetSiteCurrentNSRequest
     * @return GetSiteCurrentNSResponse
     */
    CompletableFuture<GetSiteCurrentNSResponse> getSiteCurrentNS(GetSiteCurrentNSRequest request);

    /**
     * @param request the request parameters of GetSiteCustomLog  GetSiteCustomLogRequest
     * @return GetSiteCustomLogResponse
     */
    CompletableFuture<GetSiteCustomLogResponse> getSiteCustomLog(GetSiteCustomLogRequest request);

    /**
     * @param request the request parameters of GetSiteDeliveryTask  GetSiteDeliveryTaskRequest
     * @return GetSiteDeliveryTaskResponse
     */
    CompletableFuture<GetSiteDeliveryTaskResponse> getSiteDeliveryTask(GetSiteDeliveryTaskRequest request);

    /**
     * @param request the request parameters of GetSiteLogDeliveryQuota  GetSiteLogDeliveryQuotaRequest
     * @return GetSiteLogDeliveryQuotaResponse
     */
    CompletableFuture<GetSiteLogDeliveryQuotaResponse> getSiteLogDeliveryQuota(GetSiteLogDeliveryQuotaRequest request);

    /**
     * @param request the request parameters of GetSiteWafSettings  GetSiteWafSettingsRequest
     * @return GetSiteWafSettingsResponse
     */
    CompletableFuture<GetSiteWafSettingsResponse> getSiteWafSettings(GetSiteWafSettingsRequest request);

    /**
     * @param request the request parameters of GetUploadTask  GetUploadTaskRequest
     * @return GetUploadTaskResponse
     */
    CompletableFuture<GetUploadTaskResponse> getUploadTask(GetUploadTaskRequest request);

    /**
     * @param request the request parameters of GetUserDeliveryTask  GetUserDeliveryTaskRequest
     * @return GetUserDeliveryTaskResponse
     */
    CompletableFuture<GetUserDeliveryTaskResponse> getUserDeliveryTask(GetUserDeliveryTaskRequest request);

    /**
     * @param request the request parameters of GetUserLogDeliveryQuota  GetUserLogDeliveryQuotaRequest
     * @return GetUserLogDeliveryQuotaResponse
     */
    CompletableFuture<GetUserLogDeliveryQuotaResponse> getUserLogDeliveryQuota(GetUserLogDeliveryQuotaRequest request);

    /**
     * @param request the request parameters of GetWafBotAppKey  GetWafBotAppKeyRequest
     * @return GetWafBotAppKeyResponse
     */
    CompletableFuture<GetWafBotAppKeyResponse> getWafBotAppKey(GetWafBotAppKeyRequest request);

    /**
     * @param request the request parameters of GetWafFilter  GetWafFilterRequest
     * @return GetWafFilterResponse
     */
    CompletableFuture<GetWafFilterResponse> getWafFilter(GetWafFilterRequest request);

    /**
     * @param request the request parameters of GetWafQuota  GetWafQuotaRequest
     * @return GetWafQuotaResponse
     */
    CompletableFuture<GetWafQuotaResponse> getWafQuota(GetWafQuotaRequest request);

    /**
     * @param request the request parameters of GetWafRule  GetWafRuleRequest
     * @return GetWafRuleResponse
     */
    CompletableFuture<GetWafRuleResponse> getWafRule(GetWafRuleRequest request);

    /**
     * @param request the request parameters of GetWafRuleset  GetWafRulesetRequest
     * @return GetWafRulesetResponse
     */
    CompletableFuture<GetWafRulesetResponse> getWafRuleset(GetWafRulesetRequest request);

    /**
     * @param request the request parameters of ListCacheReserveInstances  ListCacheReserveInstancesRequest
     * @return ListCacheReserveInstancesResponse
     */
    CompletableFuture<ListCacheReserveInstancesResponse> listCacheReserveInstances(ListCacheReserveInstancesRequest request);

    /**
     * @param request the request parameters of ListClientCertificates  ListClientCertificatesRequest
     * @return ListClientCertificatesResponse
     */
    CompletableFuture<ListClientCertificatesResponse> listClientCertificates(ListClientCertificatesRequest request);

    /**
     * @param request the request parameters of ListEdgeContainerAppRecords  ListEdgeContainerAppRecordsRequest
     * @return ListEdgeContainerAppRecordsResponse
     */
    CompletableFuture<ListEdgeContainerAppRecordsResponse> listEdgeContainerAppRecords(ListEdgeContainerAppRecordsRequest request);

    /**
     * @param request the request parameters of ListEdgeContainerApps  ListEdgeContainerAppsRequest
     * @return ListEdgeContainerAppsResponse
     */
    CompletableFuture<ListEdgeContainerAppsResponse> listEdgeContainerApps(ListEdgeContainerAppsRequest request);

    /**
     * @param request the request parameters of ListEdgeContainerRecords  ListEdgeContainerRecordsRequest
     * @return ListEdgeContainerRecordsResponse
     */
    CompletableFuture<ListEdgeContainerRecordsResponse> listEdgeContainerRecords(ListEdgeContainerRecordsRequest request);

    /**
     * @param request the request parameters of ListEdgeRoutinePlans  ListEdgeRoutinePlansRequest
     * @return ListEdgeRoutinePlansResponse
     */
    CompletableFuture<ListEdgeRoutinePlansResponse> listEdgeRoutinePlans(ListEdgeRoutinePlansRequest request);

    /**
     * @param request the request parameters of ListEdgeRoutineRecords  ListEdgeRoutineRecordsRequest
     * @return ListEdgeRoutineRecordsResponse
     */
    CompletableFuture<ListEdgeRoutineRecordsResponse> listEdgeRoutineRecords(ListEdgeRoutineRecordsRequest request);

    /**
     * @param request the request parameters of ListInstanceQuotas  ListInstanceQuotasRequest
     * @return ListInstanceQuotasResponse
     */
    CompletableFuture<ListInstanceQuotasResponse> listInstanceQuotas(ListInstanceQuotasRequest request);

    /**
     * @param request the request parameters of ListInstanceQuotasWithUsage  ListInstanceQuotasWithUsageRequest
     * @return ListInstanceQuotasWithUsageResponse
     */
    CompletableFuture<ListInstanceQuotasWithUsageResponse> listInstanceQuotasWithUsage(ListInstanceQuotasWithUsageRequest request);

    /**
     * @param request the request parameters of ListKvs  ListKvsRequest
     * @return ListKvsResponse
     */
    CompletableFuture<ListKvsResponse> listKvs(ListKvsRequest request);

    /**
     * @param request the request parameters of ListLists  ListListsRequest
     * @return ListListsResponse
     */
    CompletableFuture<ListListsResponse> listLists(ListListsRequest request);

    /**
     * @param request the request parameters of ListLoadBalancerRegions  ListLoadBalancerRegionsRequest
     * @return ListLoadBalancerRegionsResponse
     */
    CompletableFuture<ListLoadBalancerRegionsResponse> listLoadBalancerRegions(ListLoadBalancerRegionsRequest request);

    /**
     * @param request the request parameters of ListManagedRulesGroups  ListManagedRulesGroupsRequest
     * @return ListManagedRulesGroupsResponse
     */
    CompletableFuture<ListManagedRulesGroupsResponse> listManagedRulesGroups(ListManagedRulesGroupsRequest request);

    /**
     * @param request the request parameters of ListPages  ListPagesRequest
     * @return ListPagesResponse
     */
    CompletableFuture<ListPagesResponse> listPages(ListPagesRequest request);

    /**
     * @param request the request parameters of ListRecords  ListRecordsRequest
     * @return ListRecordsResponse
     */
    CompletableFuture<ListRecordsResponse> listRecords(ListRecordsRequest request);

    /**
     * @param request the request parameters of ListScheduledPreloadExecutions  ListScheduledPreloadExecutionsRequest
     * @return ListScheduledPreloadExecutionsResponse
     */
    CompletableFuture<ListScheduledPreloadExecutionsResponse> listScheduledPreloadExecutions(ListScheduledPreloadExecutionsRequest request);

    /**
     * @param request the request parameters of ListScheduledPreloadJobs  ListScheduledPreloadJobsRequest
     * @return ListScheduledPreloadJobsResponse
     */
    CompletableFuture<ListScheduledPreloadJobsResponse> listScheduledPreloadJobs(ListScheduledPreloadJobsRequest request);

    /**
     * @param request the request parameters of ListSiteDeliveryTasks  ListSiteDeliveryTasksRequest
     * @return ListSiteDeliveryTasksResponse
     */
    CompletableFuture<ListSiteDeliveryTasksResponse> listSiteDeliveryTasks(ListSiteDeliveryTasksRequest request);

    /**
     * @param request the request parameters of ListSites  ListSitesRequest
     * @return ListSitesResponse
     */
    CompletableFuture<ListSitesResponse> listSites(ListSitesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListUploadTasks  ListUploadTasksRequest
     * @return ListUploadTasksResponse
     */
    CompletableFuture<ListUploadTasksResponse> listUploadTasks(ListUploadTasksRequest request);

    /**
     * @param request the request parameters of ListUserDeliveryTasks  ListUserDeliveryTasksRequest
     * @return ListUserDeliveryTasksResponse
     */
    CompletableFuture<ListUserDeliveryTasksResponse> listUserDeliveryTasks(ListUserDeliveryTasksRequest request);

    /**
     * @param request the request parameters of ListUserRatePlanInstances  ListUserRatePlanInstancesRequest
     * @return ListUserRatePlanInstancesResponse
     */
    CompletableFuture<ListUserRatePlanInstancesResponse> listUserRatePlanInstances(ListUserRatePlanInstancesRequest request);

    /**
     * @param request the request parameters of ListWafManagedRules  ListWafManagedRulesRequest
     * @return ListWafManagedRulesResponse
     */
    CompletableFuture<ListWafManagedRulesResponse> listWafManagedRules(ListWafManagedRulesRequest request);

    /**
     * @param request the request parameters of ListWafPhases  ListWafPhasesRequest
     * @return ListWafPhasesResponse
     */
    CompletableFuture<ListWafPhasesResponse> listWafPhases(ListWafPhasesRequest request);

    /**
     * @param request the request parameters of ListWafRules  ListWafRulesRequest
     * @return ListWafRulesResponse
     */
    CompletableFuture<ListWafRulesResponse> listWafRules(ListWafRulesRequest request);

    /**
     * @param request the request parameters of ListWafRulesets  ListWafRulesetsRequest
     * @return ListWafRulesetsResponse
     */
    CompletableFuture<ListWafRulesetsResponse> listWafRulesets(ListWafRulesetsRequest request);

    /**
     * @param request the request parameters of ListWafTemplateRules  ListWafTemplateRulesRequest
     * @return ListWafTemplateRulesResponse
     */
    CompletableFuture<ListWafTemplateRulesResponse> listWafTemplateRules(ListWafTemplateRulesRequest request);

    /**
     * @param request the request parameters of ListWafUsageOfRules  ListWafUsageOfRulesRequest
     * @return ListWafUsageOfRulesResponse
     */
    CompletableFuture<ListWafUsageOfRulesResponse> listWafUsageOfRules(ListWafUsageOfRulesRequest request);

    /**
     * @param request the request parameters of ListWaitingRoomEvents  ListWaitingRoomEventsRequest
     * @return ListWaitingRoomEventsResponse
     */
    CompletableFuture<ListWaitingRoomEventsResponse> listWaitingRoomEvents(ListWaitingRoomEventsRequest request);

    /**
     * @param request the request parameters of ListWaitingRoomRules  ListWaitingRoomRulesRequest
     * @return ListWaitingRoomRulesResponse
     */
    CompletableFuture<ListWaitingRoomRulesResponse> listWaitingRoomRules(ListWaitingRoomRulesRequest request);

    /**
     * @param request the request parameters of ListWaitingRooms  ListWaitingRoomsRequest
     * @return ListWaitingRoomsResponse
     */
    CompletableFuture<ListWaitingRoomsResponse> listWaitingRooms(ListWaitingRoomsRequest request);

    /**
     * @param request the request parameters of PreloadCaches  PreloadCachesRequest
     * @return PreloadCachesResponse
     */
    CompletableFuture<PreloadCachesResponse> preloadCaches(PreloadCachesRequest request);

    /**
     * @param request the request parameters of PurgeCaches  PurgeCachesRequest
     * @return PurgeCachesResponse
     */
    CompletableFuture<PurgeCachesResponse> purgeCaches(PurgeCachesRequest request);

    /**
     * @param request the request parameters of PutKv  PutKvRequest
     * @return PutKvResponse
     */
    CompletableFuture<PutKvResponse> putKv(PutKvRequest request);

    /**
     * @param request the request parameters of ResetScheduledPreloadJob  ResetScheduledPreloadJobRequest
     * @return ResetScheduledPreloadJobResponse
     */
    CompletableFuture<ResetScheduledPreloadJobResponse> resetScheduledPreloadJob(ResetScheduledPreloadJobRequest request);

    /**
     * @param request the request parameters of SetCertificate  SetCertificateRequest
     * @return SetCertificateResponse
     */
    CompletableFuture<SetCertificateResponse> setCertificate(SetCertificateRequest request);

    /**
     * @param request the request parameters of SetHttpDDoSAttackIntelligentProtection  SetHttpDDoSAttackIntelligentProtectionRequest
     * @return SetHttpDDoSAttackIntelligentProtectionResponse
     */
    CompletableFuture<SetHttpDDoSAttackIntelligentProtectionResponse> setHttpDDoSAttackIntelligentProtection(SetHttpDDoSAttackIntelligentProtectionRequest request);

    /**
     * @param request the request parameters of SetHttpDDoSAttackProtection  SetHttpDDoSAttackProtectionRequest
     * @return SetHttpDDoSAttackProtectionResponse
     */
    CompletableFuture<SetHttpDDoSAttackProtectionResponse> setHttpDDoSAttackProtection(SetHttpDDoSAttackProtectionRequest request);

    /**
     * @param request the request parameters of StartScheduledPreloadExecution  StartScheduledPreloadExecutionRequest
     * @return StartScheduledPreloadExecutionResponse
     */
    CompletableFuture<StartScheduledPreloadExecutionResponse> startScheduledPreloadExecution(StartScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of StopScheduledPreloadExecution  StopScheduledPreloadExecutionRequest
     * @return StopScheduledPreloadExecutionResponse
     */
    CompletableFuture<StopScheduledPreloadExecutionResponse> stopScheduledPreloadExecution(StopScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of TransformExpressionToMatch  TransformExpressionToMatchRequest
     * @return TransformExpressionToMatchResponse
     */
    CompletableFuture<TransformExpressionToMatchResponse> transformExpressionToMatch(TransformExpressionToMatchRequest request);

    /**
     * @param request the request parameters of TransformMatchToExpression  TransformMatchToExpressionRequest
     * @return TransformMatchToExpressionResponse
     */
    CompletableFuture<TransformMatchToExpressionResponse> transformMatchToExpression(TransformMatchToExpressionRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateCustomScenePolicy  UpdateCustomScenePolicyRequest
     * @return UpdateCustomScenePolicyResponse
     */
    CompletableFuture<UpdateCustomScenePolicyResponse> updateCustomScenePolicy(UpdateCustomScenePolicyRequest request);

    /**
     * @param request the request parameters of UpdateKvNamespace  UpdateKvNamespaceRequest
     * @return UpdateKvNamespaceResponse
     */
    CompletableFuture<UpdateKvNamespaceResponse> updateKvNamespace(UpdateKvNamespaceRequest request);

    /**
     * @param request the request parameters of UpdateList  UpdateListRequest
     * @return UpdateListResponse
     */
    CompletableFuture<UpdateListResponse> updateList(UpdateListRequest request);

    /**
     * @param request the request parameters of UpdatePage  UpdatePageRequest
     * @return UpdatePageResponse
     */
    CompletableFuture<UpdatePageResponse> updatePage(UpdatePageRequest request);

    /**
     * @param request the request parameters of UpdateRecord  UpdateRecordRequest
     * @return UpdateRecordResponse
     */
    CompletableFuture<UpdateRecordResponse> updateRecord(UpdateRecordRequest request);

    /**
     * @param request the request parameters of UpdateScheduledPreloadExecution  UpdateScheduledPreloadExecutionRequest
     * @return UpdateScheduledPreloadExecutionResponse
     */
    CompletableFuture<UpdateScheduledPreloadExecutionResponse> updateScheduledPreloadExecution(UpdateScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of UpdateSiteAccessType  UpdateSiteAccessTypeRequest
     * @return UpdateSiteAccessTypeResponse
     */
    CompletableFuture<UpdateSiteAccessTypeResponse> updateSiteAccessType(UpdateSiteAccessTypeRequest request);

    /**
     * @param request the request parameters of UpdateSiteCoverage  UpdateSiteCoverageRequest
     * @return UpdateSiteCoverageResponse
     */
    CompletableFuture<UpdateSiteCoverageResponse> updateSiteCoverage(UpdateSiteCoverageRequest request);

    /**
     * @param request the request parameters of UpdateSiteCustomLog  UpdateSiteCustomLogRequest
     * @return UpdateSiteCustomLogResponse
     */
    CompletableFuture<UpdateSiteCustomLogResponse> updateSiteCustomLog(UpdateSiteCustomLogRequest request);

    /**
     * @param request the request parameters of UpdateSiteDeliveryTask  UpdateSiteDeliveryTaskRequest
     * @return UpdateSiteDeliveryTaskResponse
     */
    CompletableFuture<UpdateSiteDeliveryTaskResponse> updateSiteDeliveryTask(UpdateSiteDeliveryTaskRequest request);

    /**
     * @param request the request parameters of UpdateSiteDeliveryTaskStatus  UpdateSiteDeliveryTaskStatusRequest
     * @return UpdateSiteDeliveryTaskStatusResponse
     */
    CompletableFuture<UpdateSiteDeliveryTaskStatusResponse> updateSiteDeliveryTaskStatus(UpdateSiteDeliveryTaskStatusRequest request);

    /**
     * @param request the request parameters of UpdateSiteVanityNS  UpdateSiteVanityNSRequest
     * @return UpdateSiteVanityNSResponse
     */
    CompletableFuture<UpdateSiteVanityNSResponse> updateSiteVanityNS(UpdateSiteVanityNSRequest request);

    /**
     * @param request the request parameters of UpdateUserDeliveryTask  UpdateUserDeliveryTaskRequest
     * @return UpdateUserDeliveryTaskResponse
     */
    CompletableFuture<UpdateUserDeliveryTaskResponse> updateUserDeliveryTask(UpdateUserDeliveryTaskRequest request);

    /**
     * @param request the request parameters of UpdateUserDeliveryTaskStatus  UpdateUserDeliveryTaskStatusRequest
     * @return UpdateUserDeliveryTaskStatusResponse
     */
    CompletableFuture<UpdateUserDeliveryTaskStatusResponse> updateUserDeliveryTaskStatus(UpdateUserDeliveryTaskStatusRequest request);

    /**
     * @param request the request parameters of UpdateWafRule  UpdateWafRuleRequest
     * @return UpdateWafRuleResponse
     */
    CompletableFuture<UpdateWafRuleResponse> updateWafRule(UpdateWafRuleRequest request);

    /**
     * @param request the request parameters of UpdateWafRuleset  UpdateWafRulesetRequest
     * @return UpdateWafRulesetResponse
     */
    CompletableFuture<UpdateWafRulesetResponse> updateWafRuleset(UpdateWafRulesetRequest request);

    /**
     * @param request the request parameters of UpdateWaitingRoom  UpdateWaitingRoomRequest
     * @return UpdateWaitingRoomResponse
     */
    CompletableFuture<UpdateWaitingRoomResponse> updateWaitingRoom(UpdateWaitingRoomRequest request);

    /**
     * @param request the request parameters of UpdateWaitingRoomEvent  UpdateWaitingRoomEventRequest
     * @return UpdateWaitingRoomEventResponse
     */
    CompletableFuture<UpdateWaitingRoomEventResponse> updateWaitingRoomEvent(UpdateWaitingRoomEventRequest request);

    /**
     * @param request the request parameters of UpdateWaitingRoomRule  UpdateWaitingRoomRuleRequest
     * @return UpdateWaitingRoomRuleResponse
     */
    CompletableFuture<UpdateWaitingRoomRuleResponse> updateWaitingRoomRule(UpdateWaitingRoomRuleRequest request);

    /**
     * @param request the request parameters of VerifySite  VerifySiteRequest
     * @return VerifySiteResponse
     */
    CompletableFuture<VerifySiteResponse> verifySite(VerifySiteRequest request);

}
