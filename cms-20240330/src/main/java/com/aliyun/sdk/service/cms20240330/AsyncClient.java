// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cms20240330.models.*;
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
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Used to create a site monitoring task</p>
     * 
     * @param request the request parameters of CreateAddonRelease  CreateAddonReleaseRequest
     * @return CreateAddonReleaseResponse
     */
    CompletableFuture<CreateAddonReleaseResponse> createAddonRelease(CreateAddonReleaseRequest request);

    /**
     * @param request the request parameters of CreateAggTaskGroup  CreateAggTaskGroupRequest
     * @return CreateAggTaskGroupResponse
     */
    CompletableFuture<CreateAggTaskGroupResponse> createAggTaskGroup(CreateAggTaskGroupRequest request);

    /**
     * @param request the request parameters of CreateAlertWebhook  CreateAlertWebhookRequest
     * @return CreateAlertWebhookResponse
     */
    CompletableFuture<CreateAlertWebhookResponse> createAlertWebhook(CreateAlertWebhookRequest request);

    /**
     * @param request the request parameters of CreateBizTrace  CreateBizTraceRequest
     * @return CreateBizTraceResponse
     */
    CompletableFuture<CreateBizTraceResponse> createBizTrace(CreateBizTraceRequest request);

    /**
     * @param request the request parameters of CreateChat  CreateChatRequest
     * @return CreateChatResponse
     */
    CompletableFuture<CreateChatResponse> createChat(CreateChatRequest request);

    CompletableFuture<CreateChatResponse> createChatWithRequestBody(CreateChatRequest request, RequestBody requestBody);

<ReturnT> CompletableFuture<ReturnT> createChatWithAsyncResponseHandler(CreateChatRequest request, AsyncResponseHandler<CreateChatResponse, ReturnT> responseHandler);

    ResponseIterable<CreateChatResponseBody> createChatWithResponseIterable(CreateChatRequest request);

    /**
     * @param request the request parameters of CreateCloudResource  CreateCloudResourceRequest
     * @return CreateCloudResourceResponse
     */
    CompletableFuture<CreateCloudResourceResponse> createCloudResource(CreateCloudResourceRequest request);

    /**
     * @param request the request parameters of CreateDigitalEmployee  CreateDigitalEmployeeRequest
     * @return CreateDigitalEmployeeResponse
     */
    CompletableFuture<CreateDigitalEmployeeResponse> createDigitalEmployee(CreateDigitalEmployeeRequest request);

    /**
     * @param request the request parameters of CreateDigitalEmployeeSkill  CreateDigitalEmployeeSkillRequest
     * @return CreateDigitalEmployeeSkillResponse
     */
    CompletableFuture<CreateDigitalEmployeeSkillResponse> createDigitalEmployeeSkill(CreateDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of CreateEntityStore  CreateEntityStoreRequest
     * @return CreateEntityStoreResponse
     */
    CompletableFuture<CreateEntityStoreResponse> createEntityStore(CreateEntityStoreRequest request);

    /**
     * <b>description</b> :
     * <p>This interface is used to support users in creating event integration.</p>
     * 
     * @param request the request parameters of CreateIntegrationPolicy  CreateIntegrationPolicyRequest
     * @return CreateIntegrationPolicyResponse
     */
    CompletableFuture<CreateIntegrationPolicyResponse> createIntegrationPolicy(CreateIntegrationPolicyRequest request);

    /**
     * @param request the request parameters of CreatePrometheusInstance  CreatePrometheusInstanceRequest
     * @return CreatePrometheusInstanceResponse
     */
    CompletableFuture<CreatePrometheusInstanceResponse> createPrometheusInstance(CreatePrometheusInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Used to create a site monitoring task</p>
     * 
     * @param request the request parameters of CreatePrometheusView  CreatePrometheusViewRequest
     * @return CreatePrometheusViewResponse
     */
    CompletableFuture<CreatePrometheusViewResponse> createPrometheusView(CreatePrometheusViewRequest request);

    /**
     * <b>description</b> :
     * <p>Create a Prometheus monitoring virtual instance.</p>
     * 
     * @param request the request parameters of CreatePrometheusVirtualInstance  CreatePrometheusVirtualInstanceRequest
     * @return CreatePrometheusVirtualInstanceResponse
     */
    CompletableFuture<CreatePrometheusVirtualInstanceResponse> createPrometheusVirtualInstance(CreatePrometheusVirtualInstanceRequest request);

    /**
     * @param request the request parameters of CreateService  CreateServiceRequest
     * @return CreateServiceResponse
     */
    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    /**
     * @param request the request parameters of CreateServiceObservability  CreateServiceObservabilityRequest
     * @return CreateServiceObservabilityResponse
     */
    CompletableFuture<CreateServiceObservabilityResponse> createServiceObservability(CreateServiceObservabilityRequest request);

    /**
     * @param request the request parameters of CreateThread  CreateThreadRequest
     * @return CreateThreadResponse
     */
    CompletableFuture<CreateThreadResponse> createThread(CreateThreadRequest request);

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * <b>description</b> :
     * <p>Create Umodel configuration in the specified workspace</p>
     * 
     * @param request the request parameters of CreateUmodel  CreateUmodelRequest
     * @return CreateUmodelResponse
     */
    CompletableFuture<CreateUmodelResponse> createUmodel(CreateUmodelRequest request);

    /**
     * @param request the request parameters of DeleteAddonRelease  DeleteAddonReleaseRequest
     * @return DeleteAddonReleaseResponse
     */
    CompletableFuture<DeleteAddonReleaseResponse> deleteAddonRelease(DeleteAddonReleaseRequest request);

    /**
     * @param request the request parameters of DeleteAggTaskGroup  DeleteAggTaskGroupRequest
     * @return DeleteAggTaskGroupResponse
     */
    CompletableFuture<DeleteAggTaskGroupResponse> deleteAggTaskGroup(DeleteAggTaskGroupRequest request);

    /**
     * @param request the request parameters of DeleteAlertWebhooks  DeleteAlertWebhooksRequest
     * @return DeleteAlertWebhooksResponse
     */
    CompletableFuture<DeleteAlertWebhooksResponse> deleteAlertWebhooks(DeleteAlertWebhooksRequest request);

    /**
     * @param request the request parameters of DeleteBizTrace  DeleteBizTraceRequest
     * @return DeleteBizTraceResponse
     */
    CompletableFuture<DeleteBizTraceResponse> deleteBizTrace(DeleteBizTraceRequest request);

    /**
     * @param request the request parameters of DeleteCloudResource  DeleteCloudResourceRequest
     * @return DeleteCloudResourceResponse
     */
    CompletableFuture<DeleteCloudResourceResponse> deleteCloudResource(DeleteCloudResourceRequest request);

    /**
     * @param request the request parameters of DeleteDigitalEmployee  DeleteDigitalEmployeeRequest
     * @return DeleteDigitalEmployeeResponse
     */
    CompletableFuture<DeleteDigitalEmployeeResponse> deleteDigitalEmployee(DeleteDigitalEmployeeRequest request);

    /**
     * @param request the request parameters of DeleteDigitalEmployeeSkill  DeleteDigitalEmployeeSkillRequest
     * @return DeleteDigitalEmployeeSkillResponse
     */
    CompletableFuture<DeleteDigitalEmployeeSkillResponse> deleteDigitalEmployeeSkill(DeleteDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of DeleteEntityStore  DeleteEntityStoreRequest
     * @return DeleteEntityStoreResponse
     */
    CompletableFuture<DeleteEntityStoreResponse> deleteEntityStore(DeleteEntityStoreRequest request);

    /**
     * @param request the request parameters of DeleteIntegrationPolicy  DeleteIntegrationPolicyRequest
     * @return DeleteIntegrationPolicyResponse
     */
    CompletableFuture<DeleteIntegrationPolicyResponse> deleteIntegrationPolicy(DeleteIntegrationPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Delete a Prometheus instance.</p>
     * 
     * @param request the request parameters of DeletePrometheusInstance  DeletePrometheusInstanceRequest
     * @return DeletePrometheusInstanceResponse
     */
    CompletableFuture<DeletePrometheusInstanceResponse> deletePrometheusInstance(DeletePrometheusInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Delete prometheus view instance.</p>
     * 
     * @param request the request parameters of DeletePrometheusView  DeletePrometheusViewRequest
     * @return DeletePrometheusViewResponse
     */
    CompletableFuture<DeletePrometheusViewResponse> deletePrometheusView(DeletePrometheusViewRequest request);

    /**
     * @param request the request parameters of DeleteService  DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    /**
     * @param request the request parameters of DeleteThread  DeleteThreadRequest
     * @return DeleteThreadResponse
     */
    CompletableFuture<DeleteThreadResponse> deleteThread(DeleteThreadRequest request);

    /**
     * <b>description</b> :
     * <p>Delete the Umodel under the specified workspace</p>
     * 
     * @param request the request parameters of DeleteUmodel  DeleteUmodelRequest
     * @return DeleteUmodelResponse
     */
    CompletableFuture<DeleteUmodelResponse> deleteUmodel(DeleteUmodelRequest request);

    /**
     * @param request the request parameters of DeleteUmodelCommonSchemaRef  DeleteUmodelCommonSchemaRefRequest
     * @return DeleteUmodelCommonSchemaRefResponse
     */
    CompletableFuture<DeleteUmodelCommonSchemaRefResponse> deleteUmodelCommonSchemaRef(DeleteUmodelCommonSchemaRefRequest request);

    /**
     * <b>description</b> :
     * <p>Delete the Umodel Data under a specified workspace</p>
     * 
     * @param request the request parameters of DeleteUmodelData  DeleteUmodelDataRequest
     * @return DeleteUmodelDataResponse
     */
    CompletableFuture<DeleteUmodelDataResponse> deleteUmodelData(DeleteUmodelDataRequest request);

    /**
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of GetAddon  GetAddonRequest
     * @return GetAddonResponse
     */
    CompletableFuture<GetAddonResponse> getAddon(GetAddonRequest request);

    /**
     * @param request the request parameters of GetAddonCodeTemplate  GetAddonCodeTemplateRequest
     * @return GetAddonCodeTemplateResponse
     */
    CompletableFuture<GetAddonCodeTemplateResponse> getAddonCodeTemplate(GetAddonCodeTemplateRequest request);

    /**
     * @param request the request parameters of GetAddonRelease  GetAddonReleaseRequest
     * @return GetAddonReleaseResponse
     */
    CompletableFuture<GetAddonReleaseResponse> getAddonRelease(GetAddonReleaseRequest request);

    /**
     * @param request the request parameters of GetAddonSchema  GetAddonSchemaRequest
     * @return GetAddonSchemaResponse
     */
    CompletableFuture<GetAddonSchemaResponse> getAddonSchema(GetAddonSchemaRequest request);

    /**
     * @param request the request parameters of GetAggTaskGroup  GetAggTaskGroupRequest
     * @return GetAggTaskGroupResponse
     */
    CompletableFuture<GetAggTaskGroupResponse> getAggTaskGroup(GetAggTaskGroupRequest request);

    /**
     * @param request the request parameters of GetBizTrace  GetBizTraceRequest
     * @return GetBizTraceResponse
     */
    CompletableFuture<GetBizTraceResponse> getBizTrace(GetBizTraceRequest request);

    /**
     * @param request the request parameters of GetCloudResource  GetCloudResourceRequest
     * @return GetCloudResourceResponse
     */
    CompletableFuture<GetCloudResourceResponse> getCloudResource(GetCloudResourceRequest request);

    /**
     * @param request the request parameters of GetCloudResourceData  GetCloudResourceDataRequest
     * @return GetCloudResourceDataResponse
     */
    CompletableFuture<GetCloudResourceDataResponse> getCloudResourceData(GetCloudResourceDataRequest request);

    /**
     * @param request the request parameters of GetCmsService  GetCmsServiceRequest
     * @return GetCmsServiceResponse
     */
    CompletableFuture<GetCmsServiceResponse> getCmsService(GetCmsServiceRequest request);

    /**
     * @param request the request parameters of GetDigitalEmployee  GetDigitalEmployeeRequest
     * @return GetDigitalEmployeeResponse
     */
    CompletableFuture<GetDigitalEmployeeResponse> getDigitalEmployee(GetDigitalEmployeeRequest request);

    /**
     * @param request the request parameters of GetDigitalEmployeeSkill  GetDigitalEmployeeSkillRequest
     * @return GetDigitalEmployeeSkillResponse
     */
    CompletableFuture<GetDigitalEmployeeSkillResponse> getDigitalEmployeeSkill(GetDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of GetEntityStore  GetEntityStoreRequest
     * @return GetEntityStoreResponse
     */
    CompletableFuture<GetEntityStoreResponse> getEntityStore(GetEntityStoreRequest request);

    /**
     * @param request the request parameters of GetEntityStoreData  GetEntityStoreDataRequest
     * @return GetEntityStoreDataResponse
     */
    CompletableFuture<GetEntityStoreDataResponse> getEntityStoreData(GetEntityStoreDataRequest request);

    /**
     * @param request the request parameters of GetIntegrationPolicy  GetIntegrationPolicyRequest
     * @return GetIntegrationPolicyResponse
     */
    CompletableFuture<GetIntegrationPolicyResponse> getIntegrationPolicy(GetIntegrationPolicyRequest request);

    /**
     * @param request the request parameters of GetIntegrationVersionForCS  GetIntegrationVersionForCSRequest
     * @return GetIntegrationVersionForCSResponse
     */
    CompletableFuture<GetIntegrationVersionForCSResponse> getIntegrationVersionForCS(GetIntegrationVersionForCSRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieve details of a Prometheus instance.</p>
     * 
     * @param request the request parameters of GetPrometheusInstance  GetPrometheusInstanceRequest
     * @return GetPrometheusInstanceResponse
     */
    CompletableFuture<GetPrometheusInstanceResponse> getPrometheusInstance(GetPrometheusInstanceRequest request);

    /**
     * @param request the request parameters of GetPrometheusUserSetting  GetPrometheusUserSettingRequest
     * @return GetPrometheusUserSettingResponse
     */
    CompletableFuture<GetPrometheusUserSettingResponse> getPrometheusUserSetting(GetPrometheusUserSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Query a specified Prometheus view instance.</p>
     * 
     * @param request the request parameters of GetPrometheusView  GetPrometheusViewRequest
     * @return GetPrometheusViewResponse
     */
    CompletableFuture<GetPrometheusViewResponse> getPrometheusView(GetPrometheusViewRequest request);

    /**
     * @param request the request parameters of GetService  GetServiceRequest
     * @return GetServiceResponse
     */
    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    /**
     * @param request the request parameters of GetServiceObservability  GetServiceObservabilityRequest
     * @return GetServiceObservabilityResponse
     */
    CompletableFuture<GetServiceObservabilityResponse> getServiceObservability(GetServiceObservabilityRequest request);

    /**
     * @param request the request parameters of GetThread  GetThreadRequest
     * @return GetThreadResponse
     */
    CompletableFuture<GetThreadResponse> getThread(GetThreadRequest request);

    /**
     * @param request the request parameters of GetThreadData  GetThreadDataRequest
     * @return GetThreadDataResponse
     */
    CompletableFuture<GetThreadDataResponse> getThreadData(GetThreadDataRequest request);

    /**
     * <b>description</b> :
     * <p>Get Umodel configuration information</p>
     * 
     * @param request the request parameters of GetUmodel  GetUmodelRequest
     * @return GetUmodelResponse
     */
    CompletableFuture<GetUmodelResponse> getUmodel(GetUmodelRequest request);

    /**
     * @param request the request parameters of GetUmodelCommonSchemaRef  GetUmodelCommonSchemaRefRequest
     * @return GetUmodelCommonSchemaRefResponse
     */
    CompletableFuture<GetUmodelCommonSchemaRefResponse> getUmodelCommonSchemaRef(GetUmodelCommonSchemaRefRequest request);

    /**
     * <b>description</b> :
     * <p>Find Umodel</p>
     * 
     * @param request the request parameters of GetUmodelData  GetUmodelDataRequest
     * @return GetUmodelDataResponse
     */
    CompletableFuture<GetUmodelDataResponse> getUmodelData(GetUmodelDataRequest request);

    /**
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>Query the list of access configurations</p>
     * 
     * @param request the request parameters of ListAddonReleases  ListAddonReleasesRequest
     * @return ListAddonReleasesResponse
     */
    CompletableFuture<ListAddonReleasesResponse> listAddonReleases(ListAddonReleasesRequest request);

    /**
     * @param request the request parameters of ListAddons  ListAddonsRequest
     * @return ListAddonsResponse
     */
    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

    /**
     * @param request the request parameters of ListAggTaskGroups  ListAggTaskGroupsRequest
     * @return ListAggTaskGroupsResponse
     */
    CompletableFuture<ListAggTaskGroupsResponse> listAggTaskGroups(ListAggTaskGroupsRequest request);

    /**
     * @param request the request parameters of ListAlertActions  ListAlertActionsRequest
     * @return ListAlertActionsResponse
     */
    CompletableFuture<ListAlertActionsResponse> listAlertActions(ListAlertActionsRequest request);

    /**
     * @param request the request parameters of ListAlertWebhooks  ListAlertWebhooksRequest
     * @return ListAlertWebhooksResponse
     */
    CompletableFuture<ListAlertWebhooksResponse> listAlertWebhooks(ListAlertWebhooksRequest request);

    /**
     * @param request the request parameters of ListBizTraces  ListBizTracesRequest
     * @return ListBizTracesResponse
     */
    CompletableFuture<ListBizTracesResponse> listBizTraces(ListBizTracesRequest request);

    /**
     * @param request the request parameters of ListDigitalEmployeeSkillVersions  ListDigitalEmployeeSkillVersionsRequest
     * @return ListDigitalEmployeeSkillVersionsResponse
     */
    CompletableFuture<ListDigitalEmployeeSkillVersionsResponse> listDigitalEmployeeSkillVersions(ListDigitalEmployeeSkillVersionsRequest request);

    /**
     * @param request the request parameters of ListDigitalEmployeeSkills  ListDigitalEmployeeSkillsRequest
     * @return ListDigitalEmployeeSkillsResponse
     */
    CompletableFuture<ListDigitalEmployeeSkillsResponse> listDigitalEmployeeSkills(ListDigitalEmployeeSkillsRequest request);

    /**
     * @param request the request parameters of ListDigitalEmployees  ListDigitalEmployeesRequest
     * @return ListDigitalEmployeesResponse
     */
    CompletableFuture<ListDigitalEmployeesResponse> listDigitalEmployees(ListDigitalEmployeesRequest request);

    /**
     * <b>description</b> :
     * <p>Query integration list</p>
     * 
     * @param request the request parameters of ListIntegrationPolicies  ListIntegrationPoliciesRequest
     * @return ListIntegrationPoliciesResponse
     */
    CompletableFuture<ListIntegrationPoliciesResponse> listIntegrationPolicies(ListIntegrationPoliciesRequest request);

    /**
     * @param request the request parameters of ListIntegrationPolicyAddons  ListIntegrationPolicyAddonsRequest
     * @return ListIntegrationPolicyAddonsResponse
     */
    CompletableFuture<ListIntegrationPolicyAddonsResponse> listIntegrationPolicyAddons(ListIntegrationPolicyAddonsRequest request);

    /**
     * @param request the request parameters of ListIntegrationPolicyCollectors  ListIntegrationPolicyCollectorsRequest
     * @return ListIntegrationPolicyCollectorsResponse
     */
    CompletableFuture<ListIntegrationPolicyCollectorsResponse> listIntegrationPolicyCollectors(ListIntegrationPolicyCollectorsRequest request);

    /**
     * @param request the request parameters of ListIntegrationPolicyCustomScrapeJobRules  ListIntegrationPolicyCustomScrapeJobRulesRequest
     * @return ListIntegrationPolicyCustomScrapeJobRulesResponse
     */
    CompletableFuture<ListIntegrationPolicyCustomScrapeJobRulesResponse> listIntegrationPolicyCustomScrapeJobRules(ListIntegrationPolicyCustomScrapeJobRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This article provides an example of querying the alarm template list. The result shows that there are 2 alarm templates in the list, which are <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * @param request the request parameters of ListIntegrationPolicyDashboards  ListIntegrationPolicyDashboardsRequest
     * @return ListIntegrationPolicyDashboardsResponse
     */
    CompletableFuture<ListIntegrationPolicyDashboardsResponse> listIntegrationPolicyDashboards(ListIntegrationPolicyDashboardsRequest request);

    /**
     * <b>description</b> :
     * <p>This article provides an example to query the alarm template list. The result shows that there are 2 alarm templates in the alarm template list, which are <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * @param request the request parameters of ListIntegrationPolicyPodMonitors  ListIntegrationPolicyPodMonitorsRequest
     * @return ListIntegrationPolicyPodMonitorsResponse
     */
    CompletableFuture<ListIntegrationPolicyPodMonitorsResponse> listIntegrationPolicyPodMonitors(ListIntegrationPolicyPodMonitorsRequest request);

    /**
     * @param request the request parameters of ListIntegrationPolicyServiceMonitors  ListIntegrationPolicyServiceMonitorsRequest
     * @return ListIntegrationPolicyServiceMonitorsResponse
     */
    CompletableFuture<ListIntegrationPolicyServiceMonitorsResponse> listIntegrationPolicyServiceMonitors(ListIntegrationPolicyServiceMonitorsRequest request);

    /**
     * <b>description</b> :
     * <p>During the effective period of the policy, all alarms within the application group will no longer send notifications.</p>
     * <p>This article provides an example of creating a pause alarm notification policy <code>PauseNotify</code> for the application group <code>7301****</code>. This application group will pause alarms from <code>1622949300000</code> to <code>1623208500000</code> (Beijing Time <code>2021-06-06 11:15:00</code> to <code>2021-06-09 11:15:00</code>).</p>
     * 
     * @param request the request parameters of ListIntegrationPolicyStorageRequirements  ListIntegrationPolicyStorageRequirementsRequest
     * @return ListIntegrationPolicyStorageRequirementsResponse
     */
    CompletableFuture<ListIntegrationPolicyStorageRequirementsResponse> listIntegrationPolicyStorageRequirements(ListIntegrationPolicyStorageRequirementsRequest request);

    /**
     * <b>description</b> :
     * <p>Get the list of Prometheus instance dashboards.</p>
     * 
     * @param request the request parameters of ListPrometheusDashboards  ListPrometheusDashboardsRequest
     * @return ListPrometheusDashboardsResponse
     */
    CompletableFuture<ListPrometheusDashboardsResponse> listPrometheusDashboards(ListPrometheusDashboardsRequest request);

    /**
     * <b>description</b> :
     * <p>Get the list of Prometheus instances.</p>
     * 
     * @param request the request parameters of ListPrometheusInstances  ListPrometheusInstancesRequest
     * @return ListPrometheusInstancesResponse
     */
    CompletableFuture<ListPrometheusInstancesResponse> listPrometheusInstances(ListPrometheusInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieve a list of Prometheus view instance information.</p>
     * 
     * @param request the request parameters of ListPrometheusViews  ListPrometheusViewsRequest
     * @return ListPrometheusViewsResponse
     */
    CompletableFuture<ListPrometheusViewsResponse> listPrometheusViews(ListPrometheusViewsRequest request);

    /**
     * <b>description</b> :
     * <p>Used for creating a site monitoring task</p>
     * 
     * @param request the request parameters of ListPrometheusVirtualInstances  ListPrometheusVirtualInstancesRequest
     * @return ListPrometheusVirtualInstancesResponse
     */
    CompletableFuture<ListPrometheusVirtualInstancesResponse> listPrometheusVirtualInstances(ListPrometheusVirtualInstancesRequest request);

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListThreads  ListThreadsRequest
     * @return ListThreadsResponse
     */
    CompletableFuture<ListThreadsResponse> listThreads(ListThreadsRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of PutWorkspace  PutWorkspaceRequest
     * @return PutWorkspaceResponse
     */
    CompletableFuture<PutWorkspaceResponse> putWorkspace(PutWorkspaceRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAddonRelease  UpdateAddonReleaseRequest
     * @return UpdateAddonReleaseResponse
     */
    CompletableFuture<UpdateAddonReleaseResponse> updateAddonRelease(UpdateAddonReleaseRequest request);

    /**
     * @param request the request parameters of UpdateAggTaskGroup  UpdateAggTaskGroupRequest
     * @return UpdateAggTaskGroupResponse
     */
    CompletableFuture<UpdateAggTaskGroupResponse> updateAggTaskGroup(UpdateAggTaskGroupRequest request);

    /**
     * @param request the request parameters of UpdateAggTaskGroupStatus  UpdateAggTaskGroupStatusRequest
     * @return UpdateAggTaskGroupStatusResponse
     */
    CompletableFuture<UpdateAggTaskGroupStatusResponse> updateAggTaskGroupStatus(UpdateAggTaskGroupStatusRequest request);

    /**
     * @param request the request parameters of UpdateAlertWebhook  UpdateAlertWebhookRequest
     * @return UpdateAlertWebhookResponse
     */
    CompletableFuture<UpdateAlertWebhookResponse> updateAlertWebhook(UpdateAlertWebhookRequest request);

    /**
     * @param request the request parameters of UpdateBizTrace  UpdateBizTraceRequest
     * @return UpdateBizTraceResponse
     */
    CompletableFuture<UpdateBizTraceResponse> updateBizTrace(UpdateBizTraceRequest request);

    /**
     * @param request the request parameters of UpdateDigitalEmployee  UpdateDigitalEmployeeRequest
     * @return UpdateDigitalEmployeeResponse
     */
    CompletableFuture<UpdateDigitalEmployeeResponse> updateDigitalEmployee(UpdateDigitalEmployeeRequest request);

    /**
     * @param request the request parameters of UpdateDigitalEmployeeSkill  UpdateDigitalEmployeeSkillRequest
     * @return UpdateDigitalEmployeeSkillResponse
     */
    CompletableFuture<UpdateDigitalEmployeeSkillResponse> updateDigitalEmployeeSkill(UpdateDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of UpdateIntegrationPolicy  UpdateIntegrationPolicyRequest
     * @return UpdateIntegrationPolicyResponse
     */
    CompletableFuture<UpdateIntegrationPolicyResponse> updateIntegrationPolicy(UpdateIntegrationPolicyRequest request);

    /**
     * @param request the request parameters of UpdateNotifyStrategy  UpdateNotifyStrategyRequest
     * @return UpdateNotifyStrategyResponse
     */
    CompletableFuture<UpdateNotifyStrategyResponse> updateNotifyStrategy(UpdateNotifyStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Update Prometheus instance information.</p>
     * 
     * @param request the request parameters of UpdatePrometheusInstance  UpdatePrometheusInstanceRequest
     * @return UpdatePrometheusInstanceResponse
     */
    CompletableFuture<UpdatePrometheusInstanceResponse> updatePrometheusInstance(UpdatePrometheusInstanceRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusUserSetting  UpdatePrometheusUserSettingRequest
     * @return UpdatePrometheusUserSettingResponse
     */
    CompletableFuture<UpdatePrometheusUserSettingResponse> updatePrometheusUserSetting(UpdatePrometheusUserSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Update Prometheus view instance information.</p>
     * 
     * @param request the request parameters of UpdatePrometheusView  UpdatePrometheusViewRequest
     * @return UpdatePrometheusViewResponse
     */
    CompletableFuture<UpdatePrometheusViewResponse> updatePrometheusView(UpdatePrometheusViewRequest request);

    /**
     * @param request the request parameters of UpdateService  UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    /**
     * @param request the request parameters of UpdateSubscription  UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    CompletableFuture<UpdateSubscriptionResponse> updateSubscription(UpdateSubscriptionRequest request);

    /**
     * @param request the request parameters of UpdateThread  UpdateThreadRequest
     * @return UpdateThreadResponse
     */
    CompletableFuture<UpdateThreadResponse> updateThread(UpdateThreadRequest request);

    /**
     * <b>description</b> :
     * <p>Update Umodel configuration information</p>
     * 
     * @param request the request parameters of UpdateUmodel  UpdateUmodelRequest
     * @return UpdateUmodelResponse
     */
    CompletableFuture<UpdateUmodelResponse> updateUmodel(UpdateUmodelRequest request);

    /**
     * @param request the request parameters of UpsertUmodelCommonSchemaRef  UpsertUmodelCommonSchemaRefRequest
     * @return UpsertUmodelCommonSchemaRefResponse
     */
    CompletableFuture<UpsertUmodelCommonSchemaRefResponse> upsertUmodelCommonSchemaRef(UpsertUmodelCommonSchemaRefRequest request);

    /**
     * @param request the request parameters of UpsertUmodelData  UpsertUmodelDataRequest
     * @return UpsertUmodelDataResponse
     */
    CompletableFuture<UpsertUmodelDataResponse> upsertUmodelData(UpsertUmodelDataRequest request);

}
