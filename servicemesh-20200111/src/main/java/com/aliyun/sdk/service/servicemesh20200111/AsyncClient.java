// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.servicemesh20200111.models.*;
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

    CompletableFuture<AddClusterIntoServiceMeshResponse> addClusterIntoServiceMesh(AddClusterIntoServiceMeshRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<AddVMIntoServiceMeshResponse> addVMIntoServiceMesh(AddVMIntoServiceMeshRequest request);

    CompletableFuture<CreateASMGatewayResponse> createASMGateway(CreateASMGatewayRequest request);

    CompletableFuture<CreateGatewaySecretResponse> createGatewaySecret(CreateGatewaySecretRequest request);

    CompletableFuture<CreateIstioGatewayDomainsResponse> createIstioGatewayDomains(CreateIstioGatewayDomainsRequest request);

    CompletableFuture<CreateIstioGatewayRoutesResponse> createIstioGatewayRoutes(CreateIstioGatewayRoutesRequest request);

    CompletableFuture<CreateServiceMeshResponse> createServiceMesh(CreateServiceMeshRequest request);

    CompletableFuture<CreateSwimLaneResponse> createSwimLane(CreateSwimLaneRequest request);

    CompletableFuture<CreateSwimLaneGroupResponse> createSwimLaneGroup(CreateSwimLaneGroupRequest request);

    CompletableFuture<DeleteGatewayRouteResponse> deleteGatewayRoute(DeleteGatewayRouteRequest request);

    CompletableFuture<DeleteGatewaySecretResponse> deleteGatewaySecret(DeleteGatewaySecretRequest request);

    CompletableFuture<DeleteIstioGatewayDomainsResponse> deleteIstioGatewayDomains(DeleteIstioGatewayDomainsRequest request);

    CompletableFuture<DeleteServiceMeshResponse> deleteServiceMesh(DeleteServiceMeshRequest request);

    CompletableFuture<DeleteSwimLaneResponse> deleteSwimLane(DeleteSwimLaneRequest request);

    CompletableFuture<DeleteSwimLaneGroupResponse> deleteSwimLaneGroup(DeleteSwimLaneGroupRequest request);

    CompletableFuture<DescribeASMGatewayImportedServicesResponse> describeASMGatewayImportedServices(DescribeASMGatewayImportedServicesRequest request);

    CompletableFuture<DescribeCCMVersionResponse> describeCCMVersion(DescribeCCMVersionRequest request);

    CompletableFuture<DescribeCensResponse> describeCens(DescribeCensRequest request);

    CompletableFuture<DescribeClusterGrafanaResponse> describeClusterGrafana(DescribeClusterGrafanaRequest request);

    CompletableFuture<DescribeClusterPrometheusResponse> describeClusterPrometheus(DescribeClusterPrometheusRequest request);

    CompletableFuture<DescribeClustersInServiceMeshResponse> describeClustersInServiceMesh(DescribeClustersInServiceMeshRequest request);

    CompletableFuture<DescribeCrTemplatesResponse> describeCrTemplates(DescribeCrTemplatesRequest request);

    CompletableFuture<DescribeEipResourcesResponse> describeEipResources(DescribeEipResourcesRequest request);

    CompletableFuture<DescribeGatewaySecretDetailsResponse> describeGatewaySecretDetails(DescribeGatewaySecretDetailsRequest request);

    CompletableFuture<DescribeGuestClusterAccessLogDashboardsResponse> describeGuestClusterAccessLogDashboards(DescribeGuestClusterAccessLogDashboardsRequest request);

    CompletableFuture<DescribeGuestClusterNamespacesResponse> describeGuestClusterNamespaces(DescribeGuestClusterNamespacesRequest request);

    CompletableFuture<DescribeGuestClusterPodsResponse> describeGuestClusterPods(DescribeGuestClusterPodsRequest request);

    CompletableFuture<DescribeImportedServicesDetailResponse> describeImportedServicesDetail(DescribeImportedServicesDetailRequest request);

    CompletableFuture<DescribeIstioGatewayDomainsResponse> describeIstioGatewayDomains(DescribeIstioGatewayDomainsRequest request);

    CompletableFuture<DescribeIstioGatewayRouteDetailResponse> describeIstioGatewayRouteDetail(DescribeIstioGatewayRouteDetailRequest request);

    CompletableFuture<DescribeIstioGatewayRoutesResponse> describeIstioGatewayRoutes(DescribeIstioGatewayRoutesRequest request);

    CompletableFuture<DescribeMetadataResponse> describeMetadata(DescribeMetadataRequest request);

    CompletableFuture<DescribeNamespaceScopeSidecarConfigResponse> describeNamespaceScopeSidecarConfig(DescribeNamespaceScopeSidecarConfigRequest request);

    CompletableFuture<DescribeNodesInstanceTypeResponse> describeNodesInstanceType(DescribeNodesInstanceTypeRequest request);

    CompletableFuture<DescribeReusableSlbResponse> describeReusableSlb(DescribeReusableSlbRequest request);

    CompletableFuture<DescribeServiceMeshAdditionalStatusResponse> describeServiceMeshAdditionalStatus(DescribeServiceMeshAdditionalStatusRequest request);

    CompletableFuture<DescribeServiceMeshClustersResponse> describeServiceMeshClusters(DescribeServiceMeshClustersRequest request);

    CompletableFuture<DescribeServiceMeshDetailResponse> describeServiceMeshDetail(DescribeServiceMeshDetailRequest request);

    CompletableFuture<DescribeServiceMeshKubeconfigResponse> describeServiceMeshKubeconfig(DescribeServiceMeshKubeconfigRequest request);

    CompletableFuture<DescribeServiceMeshLogsResponse> describeServiceMeshLogs(DescribeServiceMeshLogsRequest request);

    CompletableFuture<DescribeServiceMeshProxyStatusResponse> describeServiceMeshProxyStatus(DescribeServiceMeshProxyStatusRequest request);

    CompletableFuture<DescribeServiceMeshUpgradeStatusResponse> describeServiceMeshUpgradeStatus(DescribeServiceMeshUpgradeStatusRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeServiceMeshVMsResponse> describeServiceMeshVMs(DescribeServiceMeshVMsRequest request);

    CompletableFuture<DescribeServiceMeshesResponse> describeServiceMeshes(DescribeServiceMeshesRequest request);

    CompletableFuture<DescribeUpgradeVersionResponse> describeUpgradeVersion(DescribeUpgradeVersionRequest request);

    CompletableFuture<DescribeUserPermissionsResponse> describeUserPermissions(DescribeUserPermissionsRequest request);

    CompletableFuture<DescribeUsersWithPermissionsResponse> describeUsersWithPermissions(DescribeUsersWithPermissionsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeVMsInServiceMeshResponse> describeVMsInServiceMesh(DescribeVMsInServiceMeshRequest request);

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    CompletableFuture<DescribeVersionsResponse> describeVersions(DescribeVersionsRequest request);

    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    CompletableFuture<GetCaCertResponse> getCaCert(GetCaCertRequest request);

    CompletableFuture<GetDeploymentBySelectorResponse> getDeploymentBySelector(GetDeploymentBySelectorRequest request);

    CompletableFuture<GetGrafanaDashboardUrlResponse> getGrafanaDashboardUrl(GetGrafanaDashboardUrlRequest request);

    CompletableFuture<GetRegisteredServiceEndpointsResponse> getRegisteredServiceEndpoints(GetRegisteredServiceEndpointsRequest request);

    CompletableFuture<GetRegisteredServiceNamespacesResponse> getRegisteredServiceNamespaces(GetRegisteredServiceNamespacesRequest request);

    CompletableFuture<GetSwimLaneDetailResponse> getSwimLaneDetail(GetSwimLaneDetailRequest request);

    CompletableFuture<GetSwimLaneGroupListResponse> getSwimLaneGroupList(GetSwimLaneGroupListRequest request);

    CompletableFuture<GetSwimLaneListResponse> getSwimLaneList(GetSwimLaneListRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetVmAppMeshInfoResponse> getVmAppMeshInfo(GetVmAppMeshInfoRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetVmMetaResponse> getVmMeta(GetVmMetaRequest request);

    CompletableFuture<GrantUserPermissionsResponse> grantUserPermissions(GrantUserPermissionsRequest request);

    CompletableFuture<ModifyApiServerEipResourceResponse> modifyApiServerEipResource(ModifyApiServerEipResourceRequest request);

    CompletableFuture<ModifyServiceMeshNameResponse> modifyServiceMeshName(ModifyServiceMeshNameRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods of Log Service. For more information, visit the [pricing page](https://www.aliyun.com/price/product?spm=5176.10695662.1119587.4.194c6a67rcPWQH#/sls/detail).
      *
     */
    CompletableFuture<ReActivateAuditResponse> reActivateAudit(ReActivateAuditRequest request);

    CompletableFuture<RemoveClusterFromServiceMeshResponse> removeClusterFromServiceMesh(RemoveClusterFromServiceMeshRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<RemoveVMFromServiceMeshResponse> removeVMFromServiceMesh(RemoveVMFromServiceMeshRequest request);

    CompletableFuture<RevokeKubeconfigResponse> revokeKubeconfig(RevokeKubeconfigRequest request);

    CompletableFuture<UpdateASMGatewayResponse> updateASMGateway(UpdateASMGatewayRequest request);

    CompletableFuture<UpdateASMGatewayImportedServicesResponse> updateASMGatewayImportedServices(UpdateASMGatewayImportedServicesRequest request);

    CompletableFuture<UpdateASMNamespaceFromGuestClusterResponse> updateASMNamespaceFromGuestCluster(UpdateASMNamespaceFromGuestClusterRequest request);

    CompletableFuture<UpdateIstioGatewayRoutesResponse> updateIstioGatewayRoutes(UpdateIstioGatewayRoutesRequest request);

    CompletableFuture<UpdateIstioInjectionConfigResponse> updateIstioInjectionConfig(UpdateIstioInjectionConfigRequest request);

    CompletableFuture<UpdateIstioRouteAdditionalStatusResponse> updateIstioRouteAdditionalStatus(UpdateIstioRouteAdditionalStatusRequest request);

    CompletableFuture<UpdateMeshCRAggregationResponse> updateMeshCRAggregation(UpdateMeshCRAggregationRequest request);

    CompletableFuture<UpdateMeshFeatureResponse> updateMeshFeature(UpdateMeshFeatureRequest request);

    CompletableFuture<UpdateNamespaceScopeSidecarConfigResponse> updateNamespaceScopeSidecarConfig(UpdateNamespaceScopeSidecarConfigRequest request);

    CompletableFuture<UpdateSwimLaneResponse> updateSwimLane(UpdateSwimLaneRequest request);

    CompletableFuture<UpdateSwimLaneGroupResponse> updateSwimLaneGroup(UpdateSwimLaneGroupRequest request);

    CompletableFuture<UpgradeMeshEditionPartiallyResponse> upgradeMeshEditionPartially(UpgradeMeshEditionPartiallyRequest request);

    CompletableFuture<UpgradeMeshVersionResponse> upgradeMeshVersion(UpgradeMeshVersionRequest request);

}
