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
     * @param request the request parameters of CreateEntityStore  CreateEntityStoreRequest
     * @return CreateEntityStoreResponse
     */
    CompletableFuture<CreateEntityStoreResponse> createEntityStore(CreateEntityStoreRequest request);

    /**
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
     * @param request the request parameters of CreatePrometheusView  CreatePrometheusViewRequest
     * @return CreatePrometheusViewResponse
     */
    CompletableFuture<CreatePrometheusViewResponse> createPrometheusView(CreatePrometheusViewRequest request);

    /**
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
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
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
     * @param request the request parameters of DeletePrometheusInstance  DeletePrometheusInstanceRequest
     * @return DeletePrometheusInstanceResponse
     */
    CompletableFuture<DeletePrometheusInstanceResponse> deletePrometheusInstance(DeletePrometheusInstanceRequest request);

    /**
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
     * @param request the request parameters of DeleteUmodel  DeleteUmodelRequest
     * @return DeleteUmodelResponse
     */
    CompletableFuture<DeleteUmodelResponse> deleteUmodel(DeleteUmodelRequest request);

    /**
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
     * @param request the request parameters of GetAddonRelease  GetAddonReleaseRequest
     * @return GetAddonReleaseResponse
     */
    CompletableFuture<GetAddonReleaseResponse> getAddonRelease(GetAddonReleaseRequest request);

    /**
     * @param request the request parameters of GetAggTaskGroup  GetAggTaskGroupRequest
     * @return GetAggTaskGroupResponse
     */
    CompletableFuture<GetAggTaskGroupResponse> getAggTaskGroup(GetAggTaskGroupRequest request);

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
     * @param request the request parameters of GetPrometheusInstance  GetPrometheusInstanceRequest
     * @return GetPrometheusInstanceResponse
     */
    CompletableFuture<GetPrometheusInstanceResponse> getPrometheusInstance(GetPrometheusInstanceRequest request);

    /**
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
     * @param request the request parameters of GetUmodel  GetUmodelRequest
     * @return GetUmodelResponse
     */
    CompletableFuture<GetUmodelResponse> getUmodel(GetUmodelRequest request);

    /**
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
     * @param request the request parameters of ListAddonReleases  ListAddonReleasesRequest
     * @return ListAddonReleasesResponse
     */
    CompletableFuture<ListAddonReleasesResponse> listAddonReleases(ListAddonReleasesRequest request);

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
     * @param request the request parameters of ListIntegrationPolicyCustomScrapeJobRules  ListIntegrationPolicyCustomScrapeJobRulesRequest
     * @return ListIntegrationPolicyCustomScrapeJobRulesResponse
     */
    CompletableFuture<ListIntegrationPolicyCustomScrapeJobRulesResponse> listIntegrationPolicyCustomScrapeJobRules(ListIntegrationPolicyCustomScrapeJobRulesRequest request);

    /**
     * @param request the request parameters of ListIntegrationPolicyPodMonitors  ListIntegrationPolicyPodMonitorsRequest
     * @return ListIntegrationPolicyPodMonitorsResponse
     */
    CompletableFuture<ListIntegrationPolicyPodMonitorsResponse> listIntegrationPolicyPodMonitors(ListIntegrationPolicyPodMonitorsRequest request);

    /**
     * @param request the request parameters of ListIntegrationPolicyStorageRequirements  ListIntegrationPolicyStorageRequirementsRequest
     * @return ListIntegrationPolicyStorageRequirementsResponse
     */
    CompletableFuture<ListIntegrationPolicyStorageRequirementsResponse> listIntegrationPolicyStorageRequirements(ListIntegrationPolicyStorageRequirementsRequest request);

    /**
     * @param request the request parameters of ListPrometheusDashboards  ListPrometheusDashboardsRequest
     * @return ListPrometheusDashboardsResponse
     */
    CompletableFuture<ListPrometheusDashboardsResponse> listPrometheusDashboards(ListPrometheusDashboardsRequest request);

    /**
     * @param request the request parameters of ListPrometheusInstances  ListPrometheusInstancesRequest
     * @return ListPrometheusInstancesResponse
     */
    CompletableFuture<ListPrometheusInstancesResponse> listPrometheusInstances(ListPrometheusInstancesRequest request);

    /**
     * @param request the request parameters of ListPrometheusViews  ListPrometheusViewsRequest
     * @return ListPrometheusViewsResponse
     */
    CompletableFuture<ListPrometheusViewsResponse> listPrometheusViews(ListPrometheusViewsRequest request);

    /**
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
     * @param request the request parameters of UpdateIntegrationPolicy  UpdateIntegrationPolicyRequest
     * @return UpdateIntegrationPolicyResponse
     */
    CompletableFuture<UpdateIntegrationPolicyResponse> updateIntegrationPolicy(UpdateIntegrationPolicyRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusInstance  UpdatePrometheusInstanceRequest
     * @return UpdatePrometheusInstanceResponse
     */
    CompletableFuture<UpdatePrometheusInstanceResponse> updatePrometheusInstance(UpdatePrometheusInstanceRequest request);

    /**
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
     * @param request the request parameters of UpdateUmodel  UpdateUmodelRequest
     * @return UpdateUmodelResponse
     */
    CompletableFuture<UpdateUmodelResponse> updateUmodel(UpdateUmodelRequest request);

    /**
     * @param request the request parameters of UpsertUmodelData  UpsertUmodelDataRequest
     * @return UpsertUmodelDataResponse
     */
    CompletableFuture<UpsertUmodelDataResponse> upsertUmodelData(UpsertUmodelDataRequest request);

}
