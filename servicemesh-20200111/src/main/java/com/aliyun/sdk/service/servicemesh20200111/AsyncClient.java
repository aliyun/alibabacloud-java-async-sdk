// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.servicemesh20200111.models.*;
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
     * @param request the request parameters of AddClusterIntoServiceMesh  AddClusterIntoServiceMeshRequest
     * @return AddClusterIntoServiceMeshResponse
     */
    CompletableFuture<AddClusterIntoServiceMeshResponse> addClusterIntoServiceMesh(AddClusterIntoServiceMeshRequest request);

    /**
     * @deprecated OpenAPI AddVMIntoServiceMesh is deprecated  * @param request  the request parameters of AddVMIntoServiceMesh  AddVMIntoServiceMeshRequest
     * @return AddVMIntoServiceMeshResponse
     */
    @Deprecated
    CompletableFuture<AddVMIntoServiceMeshResponse> addVMIntoServiceMesh(AddVMIntoServiceMeshRequest request);

    /**
     * @param request the request parameters of CreateASMGateway  CreateASMGatewayRequest
     * @return CreateASMGatewayResponse
     */
    CompletableFuture<CreateASMGatewayResponse> createASMGateway(CreateASMGatewayRequest request);

    /**
     * @param request the request parameters of CreateGatewaySecret  CreateGatewaySecretRequest
     * @return CreateGatewaySecretResponse
     */
    CompletableFuture<CreateGatewaySecretResponse> createGatewaySecret(CreateGatewaySecretRequest request);

    /**
     * @param request the request parameters of CreateIstioGatewayDomains  CreateIstioGatewayDomainsRequest
     * @return CreateIstioGatewayDomainsResponse
     */
    CompletableFuture<CreateIstioGatewayDomainsResponse> createIstioGatewayDomains(CreateIstioGatewayDomainsRequest request);

    /**
     * @param request the request parameters of CreateIstioGatewayRoutes  CreateIstioGatewayRoutesRequest
     * @return CreateIstioGatewayRoutesResponse
     */
    CompletableFuture<CreateIstioGatewayRoutesResponse> createIstioGatewayRoutes(CreateIstioGatewayRoutesRequest request);

    /**
     * @param request the request parameters of CreateServiceMesh  CreateServiceMeshRequest
     * @return CreateServiceMeshResponse
     */
    CompletableFuture<CreateServiceMeshResponse> createServiceMesh(CreateServiceMeshRequest request);

    /**
     * @param request the request parameters of CreateSwimLane  CreateSwimLaneRequest
     * @return CreateSwimLaneResponse
     */
    CompletableFuture<CreateSwimLaneResponse> createSwimLane(CreateSwimLaneRequest request);

    /**
     * @param request the request parameters of CreateSwimLaneGroup  CreateSwimLaneGroupRequest
     * @return CreateSwimLaneGroupResponse
     */
    CompletableFuture<CreateSwimLaneGroupResponse> createSwimLaneGroup(CreateSwimLaneGroupRequest request);

    /**
     * @param request the request parameters of CreateWaypoint  CreateWaypointRequest
     * @return CreateWaypointResponse
     */
    CompletableFuture<CreateWaypointResponse> createWaypoint(CreateWaypointRequest request);

    /**
     * @param request the request parameters of DeleteGatewayRoute  DeleteGatewayRouteRequest
     * @return DeleteGatewayRouteResponse
     */
    CompletableFuture<DeleteGatewayRouteResponse> deleteGatewayRoute(DeleteGatewayRouteRequest request);

    /**
     * @param request the request parameters of DeleteGatewaySecret  DeleteGatewaySecretRequest
     * @return DeleteGatewaySecretResponse
     */
    CompletableFuture<DeleteGatewaySecretResponse> deleteGatewaySecret(DeleteGatewaySecretRequest request);

    /**
     * @param request the request parameters of DeleteIstioGatewayDomains  DeleteIstioGatewayDomainsRequest
     * @return DeleteIstioGatewayDomainsResponse
     */
    CompletableFuture<DeleteIstioGatewayDomainsResponse> deleteIstioGatewayDomains(DeleteIstioGatewayDomainsRequest request);

    /**
     * @param request the request parameters of DeleteServiceMesh  DeleteServiceMeshRequest
     * @return DeleteServiceMeshResponse
     */
    CompletableFuture<DeleteServiceMeshResponse> deleteServiceMesh(DeleteServiceMeshRequest request);

    /**
     * @param request the request parameters of DeleteSwimLane  DeleteSwimLaneRequest
     * @return DeleteSwimLaneResponse
     */
    CompletableFuture<DeleteSwimLaneResponse> deleteSwimLane(DeleteSwimLaneRequest request);

    /**
     * @param request the request parameters of DeleteSwimLaneGroup  DeleteSwimLaneGroupRequest
     * @return DeleteSwimLaneGroupResponse
     */
    CompletableFuture<DeleteSwimLaneGroupResponse> deleteSwimLaneGroup(DeleteSwimLaneGroupRequest request);

    /**
     * @param request the request parameters of DeleteWaypoint  DeleteWaypointRequest
     * @return DeleteWaypointResponse
     */
    CompletableFuture<DeleteWaypointResponse> deleteWaypoint(DeleteWaypointRequest request);

    /**
     * @param request the request parameters of DescribeASMGatewayImportedServices  DescribeASMGatewayImportedServicesRequest
     * @return DescribeASMGatewayImportedServicesResponse
     */
    CompletableFuture<DescribeASMGatewayImportedServicesResponse> describeASMGatewayImportedServices(DescribeASMGatewayImportedServicesRequest request);

    /**
     * @param request the request parameters of DescribeCCMVersion  DescribeCCMVersionRequest
     * @return DescribeCCMVersionResponse
     */
    CompletableFuture<DescribeCCMVersionResponse> describeCCMVersion(DescribeCCMVersionRequest request);

    /**
     * @param request the request parameters of DescribeCens  DescribeCensRequest
     * @return DescribeCensResponse
     */
    CompletableFuture<DescribeCensResponse> describeCens(DescribeCensRequest request);

    /**
     * @param request the request parameters of DescribeClusterGrafana  DescribeClusterGrafanaRequest
     * @return DescribeClusterGrafanaResponse
     */
    CompletableFuture<DescribeClusterGrafanaResponse> describeClusterGrafana(DescribeClusterGrafanaRequest request);

    /**
     * @param request the request parameters of DescribeClusterPrometheus  DescribeClusterPrometheusRequest
     * @return DescribeClusterPrometheusResponse
     */
    CompletableFuture<DescribeClusterPrometheusResponse> describeClusterPrometheus(DescribeClusterPrometheusRequest request);

    /**
     * @param request the request parameters of DescribeClustersInServiceMesh  DescribeClustersInServiceMeshRequest
     * @return DescribeClustersInServiceMeshResponse
     */
    CompletableFuture<DescribeClustersInServiceMeshResponse> describeClustersInServiceMesh(DescribeClustersInServiceMeshRequest request);

    /**
     * @param request the request parameters of DescribeCrTemplates  DescribeCrTemplatesRequest
     * @return DescribeCrTemplatesResponse
     */
    CompletableFuture<DescribeCrTemplatesResponse> describeCrTemplates(DescribeCrTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeEipResources  DescribeEipResourcesRequest
     * @return DescribeEipResourcesResponse
     */
    CompletableFuture<DescribeEipResourcesResponse> describeEipResources(DescribeEipResourcesRequest request);

    /**
     * @param request the request parameters of DescribeGatewaySecretDetails  DescribeGatewaySecretDetailsRequest
     * @return DescribeGatewaySecretDetailsResponse
     */
    CompletableFuture<DescribeGatewaySecretDetailsResponse> describeGatewaySecretDetails(DescribeGatewaySecretDetailsRequest request);

    /**
     * @param request the request parameters of DescribeGuestClusterAccessLogDashboards  DescribeGuestClusterAccessLogDashboardsRequest
     * @return DescribeGuestClusterAccessLogDashboardsResponse
     */
    CompletableFuture<DescribeGuestClusterAccessLogDashboardsResponse> describeGuestClusterAccessLogDashboards(DescribeGuestClusterAccessLogDashboardsRequest request);

    /**
     * @param request the request parameters of DescribeGuestClusterNamespaces  DescribeGuestClusterNamespacesRequest
     * @return DescribeGuestClusterNamespacesResponse
     */
    CompletableFuture<DescribeGuestClusterNamespacesResponse> describeGuestClusterNamespaces(DescribeGuestClusterNamespacesRequest request);

    /**
     * @param request the request parameters of DescribeGuestClusterPods  DescribeGuestClusterPodsRequest
     * @return DescribeGuestClusterPodsResponse
     */
    CompletableFuture<DescribeGuestClusterPodsResponse> describeGuestClusterPods(DescribeGuestClusterPodsRequest request);

    /**
     * @param request the request parameters of DescribeImportedServicesDetail  DescribeImportedServicesDetailRequest
     * @return DescribeImportedServicesDetailResponse
     */
    CompletableFuture<DescribeImportedServicesDetailResponse> describeImportedServicesDetail(DescribeImportedServicesDetailRequest request);

    /**
     * @param request the request parameters of DescribeIstioGatewayDomains  DescribeIstioGatewayDomainsRequest
     * @return DescribeIstioGatewayDomainsResponse
     */
    CompletableFuture<DescribeIstioGatewayDomainsResponse> describeIstioGatewayDomains(DescribeIstioGatewayDomainsRequest request);

    /**
     * @param request the request parameters of DescribeIstioGatewayRouteDetail  DescribeIstioGatewayRouteDetailRequest
     * @return DescribeIstioGatewayRouteDetailResponse
     */
    CompletableFuture<DescribeIstioGatewayRouteDetailResponse> describeIstioGatewayRouteDetail(DescribeIstioGatewayRouteDetailRequest request);

    /**
     * @param request the request parameters of DescribeIstioGatewayRoutes  DescribeIstioGatewayRoutesRequest
     * @return DescribeIstioGatewayRoutesResponse
     */
    CompletableFuture<DescribeIstioGatewayRoutesResponse> describeIstioGatewayRoutes(DescribeIstioGatewayRoutesRequest request);

    /**
     * @param request the request parameters of DescribeMeshMultiClusterNetwork  DescribeMeshMultiClusterNetworkRequest
     * @return DescribeMeshMultiClusterNetworkResponse
     */
    CompletableFuture<DescribeMeshMultiClusterNetworkResponse> describeMeshMultiClusterNetwork(DescribeMeshMultiClusterNetworkRequest request);

    /**
     * @param request the request parameters of DescribeMetadata  DescribeMetadataRequest
     * @return DescribeMetadataResponse
     */
    CompletableFuture<DescribeMetadataResponse> describeMetadata(DescribeMetadataRequest request);

    /**
     * @param request the request parameters of DescribeNamespaceScopeSidecarConfig  DescribeNamespaceScopeSidecarConfigRequest
     * @return DescribeNamespaceScopeSidecarConfigResponse
     */
    CompletableFuture<DescribeNamespaceScopeSidecarConfigResponse> describeNamespaceScopeSidecarConfig(DescribeNamespaceScopeSidecarConfigRequest request);

    /**
     * @param request the request parameters of DescribeNodesInstanceType  DescribeNodesInstanceTypeRequest
     * @return DescribeNodesInstanceTypeResponse
     */
    CompletableFuture<DescribeNodesInstanceTypeResponse> describeNodesInstanceType(DescribeNodesInstanceTypeRequest request);

    /**
     * @param request the request parameters of DescribeReusableSlb  DescribeReusableSlbRequest
     * @return DescribeReusableSlbResponse
     */
    CompletableFuture<DescribeReusableSlbResponse> describeReusableSlb(DescribeReusableSlbRequest request);

    /**
     * @param request the request parameters of DescribeServiceMeshAdditionalStatus  DescribeServiceMeshAdditionalStatusRequest
     * @return DescribeServiceMeshAdditionalStatusResponse
     */
    CompletableFuture<DescribeServiceMeshAdditionalStatusResponse> describeServiceMeshAdditionalStatus(DescribeServiceMeshAdditionalStatusRequest request);

    /**
     * @param request the request parameters of DescribeServiceMeshClusters  DescribeServiceMeshClustersRequest
     * @return DescribeServiceMeshClustersResponse
     */
    CompletableFuture<DescribeServiceMeshClustersResponse> describeServiceMeshClusters(DescribeServiceMeshClustersRequest request);

    /**
     * @param request the request parameters of DescribeServiceMeshDetail  DescribeServiceMeshDetailRequest
     * @return DescribeServiceMeshDetailResponse
     */
    CompletableFuture<DescribeServiceMeshDetailResponse> describeServiceMeshDetail(DescribeServiceMeshDetailRequest request);

    /**
     * @param request the request parameters of DescribeServiceMeshKubeconfig  DescribeServiceMeshKubeconfigRequest
     * @return DescribeServiceMeshKubeconfigResponse
     */
    CompletableFuture<DescribeServiceMeshKubeconfigResponse> describeServiceMeshKubeconfig(DescribeServiceMeshKubeconfigRequest request);

    /**
     * @param request the request parameters of DescribeServiceMeshLogs  DescribeServiceMeshLogsRequest
     * @return DescribeServiceMeshLogsResponse
     */
    CompletableFuture<DescribeServiceMeshLogsResponse> describeServiceMeshLogs(DescribeServiceMeshLogsRequest request);

    /**
     * @param request the request parameters of DescribeServiceMeshProxyStatus  DescribeServiceMeshProxyStatusRequest
     * @return DescribeServiceMeshProxyStatusResponse
     */
    CompletableFuture<DescribeServiceMeshProxyStatusResponse> describeServiceMeshProxyStatus(DescribeServiceMeshProxyStatusRequest request);

    /**
     * @param request the request parameters of DescribeServiceMeshUpgradeStatus  DescribeServiceMeshUpgradeStatusRequest
     * @return DescribeServiceMeshUpgradeStatusResponse
     */
    CompletableFuture<DescribeServiceMeshUpgradeStatusResponse> describeServiceMeshUpgradeStatus(DescribeServiceMeshUpgradeStatusRequest request);

    /**
     * @deprecated OpenAPI DescribeServiceMeshVMs is deprecated  * @param request  the request parameters of DescribeServiceMeshVMs  DescribeServiceMeshVMsRequest
     * @return DescribeServiceMeshVMsResponse
     */
    @Deprecated
    CompletableFuture<DescribeServiceMeshVMsResponse> describeServiceMeshVMs(DescribeServiceMeshVMsRequest request);

    /**
     * @param request the request parameters of DescribeServiceMeshes  DescribeServiceMeshesRequest
     * @return DescribeServiceMeshesResponse
     */
    CompletableFuture<DescribeServiceMeshesResponse> describeServiceMeshes(DescribeServiceMeshesRequest request);

    /**
     * @param request the request parameters of DescribeUpgradeVersion  DescribeUpgradeVersionRequest
     * @return DescribeUpgradeVersionResponse
     */
    CompletableFuture<DescribeUpgradeVersionResponse> describeUpgradeVersion(DescribeUpgradeVersionRequest request);

    /**
     * @param request the request parameters of DescribeUserPermissions  DescribeUserPermissionsRequest
     * @return DescribeUserPermissionsResponse
     */
    CompletableFuture<DescribeUserPermissionsResponse> describeUserPermissions(DescribeUserPermissionsRequest request);

    /**
     * @param request the request parameters of DescribeUsersWithPermissions  DescribeUsersWithPermissionsRequest
     * @return DescribeUsersWithPermissionsResponse
     */
    CompletableFuture<DescribeUsersWithPermissionsResponse> describeUsersWithPermissions(DescribeUsersWithPermissionsRequest request);

    /**
     * @deprecated OpenAPI DescribeVMsInServiceMesh is deprecated  * @param request  the request parameters of DescribeVMsInServiceMesh  DescribeVMsInServiceMeshRequest
     * @return DescribeVMsInServiceMeshResponse
     */
    @Deprecated
    CompletableFuture<DescribeVMsInServiceMeshResponse> describeVMsInServiceMesh(DescribeVMsInServiceMeshRequest request);

    /**
     * @param request the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
     * @param request the request parameters of DescribeVersions  DescribeVersionsRequest
     * @return DescribeVersionsResponse
     */
    CompletableFuture<DescribeVersionsResponse> describeVersions(DescribeVersionsRequest request);

    /**
     * @param request the request parameters of DescribeVpcs  DescribeVpcsRequest
     * @return DescribeVpcsResponse
     */
    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    /**
     * @param request the request parameters of GetCaCert  GetCaCertRequest
     * @return GetCaCertResponse
     */
    CompletableFuture<GetCaCertResponse> getCaCert(GetCaCertRequest request);

    /**
     * @param request the request parameters of GetDeploymentBySelector  GetDeploymentBySelectorRequest
     * @return GetDeploymentBySelectorResponse
     */
    CompletableFuture<GetDeploymentBySelectorResponse> getDeploymentBySelector(GetDeploymentBySelectorRequest request);

    /**
     * @param request the request parameters of GetGrafanaDashboardUrl  GetGrafanaDashboardUrlRequest
     * @return GetGrafanaDashboardUrlResponse
     */
    CompletableFuture<GetGrafanaDashboardUrlResponse> getGrafanaDashboardUrl(GetGrafanaDashboardUrlRequest request);

    /**
     * @param request the request parameters of GetRegisteredServiceEndpoints  GetRegisteredServiceEndpointsRequest
     * @return GetRegisteredServiceEndpointsResponse
     */
    CompletableFuture<GetRegisteredServiceEndpointsResponse> getRegisteredServiceEndpoints(GetRegisteredServiceEndpointsRequest request);

    /**
     * @param request the request parameters of GetRegisteredServiceNamespaces  GetRegisteredServiceNamespacesRequest
     * @return GetRegisteredServiceNamespacesResponse
     */
    CompletableFuture<GetRegisteredServiceNamespacesResponse> getRegisteredServiceNamespaces(GetRegisteredServiceNamespacesRequest request);

    /**
     * @param request the request parameters of GetSwimLaneDetail  GetSwimLaneDetailRequest
     * @return GetSwimLaneDetailResponse
     */
    CompletableFuture<GetSwimLaneDetailResponse> getSwimLaneDetail(GetSwimLaneDetailRequest request);

    /**
     * @param request the request parameters of GetSwimLaneGroupList  GetSwimLaneGroupListRequest
     * @return GetSwimLaneGroupListResponse
     */
    CompletableFuture<GetSwimLaneGroupListResponse> getSwimLaneGroupList(GetSwimLaneGroupListRequest request);

    /**
     * @param request the request parameters of GetSwimLaneList  GetSwimLaneListRequest
     * @return GetSwimLaneListResponse
     */
    CompletableFuture<GetSwimLaneListResponse> getSwimLaneList(GetSwimLaneListRequest request);

    /**
     * @deprecated OpenAPI GetVmAppMeshInfo is deprecated  * @param request  the request parameters of GetVmAppMeshInfo  GetVmAppMeshInfoRequest
     * @return GetVmAppMeshInfoResponse
     */
    @Deprecated
    CompletableFuture<GetVmAppMeshInfoResponse> getVmAppMeshInfo(GetVmAppMeshInfoRequest request);

    /**
     * @deprecated OpenAPI GetVmMeta is deprecated  * @param request  the request parameters of GetVmMeta  GetVmMetaRequest
     * @return GetVmMetaResponse
     */
    @Deprecated
    CompletableFuture<GetVmMetaResponse> getVmMeta(GetVmMetaRequest request);

    /**
     * @param request the request parameters of GrantUserPermissions  GrantUserPermissionsRequest
     * @return GrantUserPermissionsResponse
     */
    CompletableFuture<GrantUserPermissionsResponse> grantUserPermissions(GrantUserPermissionsRequest request);

    /**
     * @param request the request parameters of ListServiceAccounts  ListServiceAccountsRequest
     * @return ListServiceAccountsResponse
     */
    CompletableFuture<ListServiceAccountsResponse> listServiceAccounts(ListServiceAccountsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListWaypoints  ListWaypointsRequest
     * @return ListWaypointsResponse
     */
    CompletableFuture<ListWaypointsResponse> listWaypoints(ListWaypointsRequest request);

    /**
     * @param request the request parameters of ModifyApiServerEipResource  ModifyApiServerEipResourceRequest
     * @return ModifyApiServerEipResourceResponse
     */
    CompletableFuture<ModifyApiServerEipResourceResponse> modifyApiServerEipResource(ModifyApiServerEipResourceRequest request);

    /**
     * @param request the request parameters of ModifyPilotEipResource  ModifyPilotEipResourceRequest
     * @return ModifyPilotEipResourceResponse
     */
    CompletableFuture<ModifyPilotEipResourceResponse> modifyPilotEipResource(ModifyPilotEipResourceRequest request);

    /**
     * @param request the request parameters of ModifyServiceMeshName  ModifyServiceMeshNameRequest
     * @return ModifyServiceMeshNameResponse
     */
    CompletableFuture<ModifyServiceMeshNameResponse> modifyServiceMeshName(ModifyServiceMeshNameRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods of Simple Log Service. For more information, visit the <a href="https://www.alibabacloud.com/zh/pricing-calculator?_p_lc=1%5C&spm=a2796.7960336.3034855210.1.44e6b91aaSp2M7#/commodity/vm_intl">pricing page</a>.</p>
     * 
     * @param request the request parameters of ReActivateAudit  ReActivateAuditRequest
     * @return ReActivateAuditResponse
     */
    CompletableFuture<ReActivateAuditResponse> reActivateAudit(ReActivateAuditRequest request);

    /**
     * @param request the request parameters of RemoveClusterFromServiceMesh  RemoveClusterFromServiceMeshRequest
     * @return RemoveClusterFromServiceMeshResponse
     */
    CompletableFuture<RemoveClusterFromServiceMeshResponse> removeClusterFromServiceMesh(RemoveClusterFromServiceMeshRequest request);

    /**
     * @deprecated OpenAPI RemoveVMFromServiceMesh is deprecated  * @param request  the request parameters of RemoveVMFromServiceMesh  RemoveVMFromServiceMeshRequest
     * @return RemoveVMFromServiceMeshResponse
     */
    @Deprecated
    CompletableFuture<RemoveVMFromServiceMeshResponse> removeVMFromServiceMesh(RemoveVMFromServiceMeshRequest request);

    /**
     * @param request the request parameters of RevokeKubeconfig  RevokeKubeconfigRequest
     * @return RevokeKubeconfigResponse
     */
    CompletableFuture<RevokeKubeconfigResponse> revokeKubeconfig(RevokeKubeconfigRequest request);

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
     * @param request the request parameters of UpdateASMGateway  UpdateASMGatewayRequest
     * @return UpdateASMGatewayResponse
     */
    CompletableFuture<UpdateASMGatewayResponse> updateASMGateway(UpdateASMGatewayRequest request);

    /**
     * @param request the request parameters of UpdateASMGatewayImportedServices  UpdateASMGatewayImportedServicesRequest
     * @return UpdateASMGatewayImportedServicesResponse
     */
    CompletableFuture<UpdateASMGatewayImportedServicesResponse> updateASMGatewayImportedServices(UpdateASMGatewayImportedServicesRequest request);

    /**
     * @param request the request parameters of UpdateASMNamespaceFromGuestCluster  UpdateASMNamespaceFromGuestClusterRequest
     * @return UpdateASMNamespaceFromGuestClusterResponse
     */
    CompletableFuture<UpdateASMNamespaceFromGuestClusterResponse> updateASMNamespaceFromGuestCluster(UpdateASMNamespaceFromGuestClusterRequest request);

    /**
     * @param request the request parameters of UpdateControlPlaneLogConfig  UpdateControlPlaneLogConfigRequest
     * @return UpdateControlPlaneLogConfigResponse
     */
    CompletableFuture<UpdateControlPlaneLogConfigResponse> updateControlPlaneLogConfig(UpdateControlPlaneLogConfigRequest request);

    /**
     * @param request the request parameters of UpdateGuestClusterConfig  UpdateGuestClusterConfigRequest
     * @return UpdateGuestClusterConfigResponse
     */
    CompletableFuture<UpdateGuestClusterConfigResponse> updateGuestClusterConfig(UpdateGuestClusterConfigRequest request);

    /**
     * @param request the request parameters of UpdateIstioGatewayRoutes  UpdateIstioGatewayRoutesRequest
     * @return UpdateIstioGatewayRoutesResponse
     */
    CompletableFuture<UpdateIstioGatewayRoutesResponse> updateIstioGatewayRoutes(UpdateIstioGatewayRoutesRequest request);

    /**
     * @param request the request parameters of UpdateIstioInjectionConfig  UpdateIstioInjectionConfigRequest
     * @return UpdateIstioInjectionConfigResponse
     */
    CompletableFuture<UpdateIstioInjectionConfigResponse> updateIstioInjectionConfig(UpdateIstioInjectionConfigRequest request);

    /**
     * @param request the request parameters of UpdateIstioRouteAdditionalStatus  UpdateIstioRouteAdditionalStatusRequest
     * @return UpdateIstioRouteAdditionalStatusResponse
     */
    CompletableFuture<UpdateIstioRouteAdditionalStatusResponse> updateIstioRouteAdditionalStatus(UpdateIstioRouteAdditionalStatusRequest request);

    /**
     * @param request the request parameters of UpdateMeshCRAggregation  UpdateMeshCRAggregationRequest
     * @return UpdateMeshCRAggregationResponse
     */
    CompletableFuture<UpdateMeshCRAggregationResponse> updateMeshCRAggregation(UpdateMeshCRAggregationRequest request);

    /**
     * @param request the request parameters of UpdateMeshFeature  UpdateMeshFeatureRequest
     * @return UpdateMeshFeatureResponse
     */
    CompletableFuture<UpdateMeshFeatureResponse> updateMeshFeature(UpdateMeshFeatureRequest request);

    /**
     * @param request the request parameters of UpdateMeshMultiClusterNetwork  UpdateMeshMultiClusterNetworkRequest
     * @return UpdateMeshMultiClusterNetworkResponse
     */
    CompletableFuture<UpdateMeshMultiClusterNetworkResponse> updateMeshMultiClusterNetwork(UpdateMeshMultiClusterNetworkRequest request);

    /**
     * @param request the request parameters of UpdateNamespaceScopeSidecarConfig  UpdateNamespaceScopeSidecarConfigRequest
     * @return UpdateNamespaceScopeSidecarConfigResponse
     */
    CompletableFuture<UpdateNamespaceScopeSidecarConfigResponse> updateNamespaceScopeSidecarConfig(UpdateNamespaceScopeSidecarConfigRequest request);

    /**
     * @param request the request parameters of UpdateSwimLane  UpdateSwimLaneRequest
     * @return UpdateSwimLaneResponse
     */
    CompletableFuture<UpdateSwimLaneResponse> updateSwimLane(UpdateSwimLaneRequest request);

    /**
     * @param request the request parameters of UpdateSwimLaneGroup  UpdateSwimLaneGroupRequest
     * @return UpdateSwimLaneGroupResponse
     */
    CompletableFuture<UpdateSwimLaneGroupResponse> updateSwimLaneGroup(UpdateSwimLaneGroupRequest request);

    /**
     * @param request the request parameters of UpdateWaypoint  UpdateWaypointRequest
     * @return UpdateWaypointResponse
     */
    CompletableFuture<UpdateWaypointResponse> updateWaypoint(UpdateWaypointRequest request);

    /**
     * @param request the request parameters of UpgradeMeshEditionPartially  UpgradeMeshEditionPartiallyRequest
     * @return UpgradeMeshEditionPartiallyResponse
     */
    CompletableFuture<UpgradeMeshEditionPartiallyResponse> upgradeMeshEditionPartially(UpgradeMeshEditionPartiallyRequest request);

    /**
     * @param request the request parameters of UpgradeMeshVersion  UpgradeMeshVersionRequest
     * @return UpgradeMeshVersionResponse
     */
    CompletableFuture<UpgradeMeshVersionResponse> upgradeMeshVersion(UpgradeMeshVersionRequest request);

}
