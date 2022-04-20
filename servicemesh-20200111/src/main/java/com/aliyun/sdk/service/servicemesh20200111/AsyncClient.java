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

    CompletableFuture<AddVMIntoServiceMeshResponse> addVMIntoServiceMesh(AddVMIntoServiceMeshRequest request);

    CompletableFuture<CreateASMGatewayResponse> createASMGateway(CreateASMGatewayRequest request);

    CompletableFuture<CreateGatewaySecretResponse> createGatewaySecret(CreateGatewaySecretRequest request);

    CompletableFuture<CreateIstioGatewayDomainsResponse> createIstioGatewayDomains(CreateIstioGatewayDomainsRequest request);

    CompletableFuture<CreateIstioGatewayRoutesResponse> createIstioGatewayRoutes(CreateIstioGatewayRoutesRequest request);

    CompletableFuture<CreateServiceMeshResponse> createServiceMesh(CreateServiceMeshRequest request);

    CompletableFuture<DeleteGatewayRouteResponse> deleteGatewayRoute(DeleteGatewayRouteRequest request);

    CompletableFuture<DeleteGatewaySecretResponse> deleteGatewaySecret(DeleteGatewaySecretRequest request);

    CompletableFuture<DeleteIstioGatewayDomainsResponse> deleteIstioGatewayDomains(DeleteIstioGatewayDomainsRequest request);

    CompletableFuture<DeleteServiceMeshResponse> deleteServiceMesh(DeleteServiceMeshRequest request);

    CompletableFuture<DescribeASMGatewayImportedServicesResponse> describeASMGatewayImportedServices(DescribeASMGatewayImportedServicesRequest request);

    CompletableFuture<DescribeAhasProResponse> describeAhasPro(DescribeAhasProRequest request);

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

    CompletableFuture<DescribeIngressGatewaysResponse> describeIngressGateways(DescribeIngressGatewaysRequest request);

    CompletableFuture<DescribeIstioGatewayDomainsResponse> describeIstioGatewayDomains(DescribeIstioGatewayDomainsRequest request);

    CompletableFuture<DescribeIstioGatewayRouteDetailResponse> describeIstioGatewayRouteDetail(DescribeIstioGatewayRouteDetailRequest request);

    CompletableFuture<DescribeIstioGatewayRoutesResponse> describeIstioGatewayRoutes(DescribeIstioGatewayRoutesRequest request);

    CompletableFuture<DescribeManagedServicesResponse> describeManagedServices(DescribeManagedServicesRequest request);

    CompletableFuture<DescribeNamespaceScopeSidecarConfigResponse> describeNamespaceScopeSidecarConfig(DescribeNamespaceScopeSidecarConfigRequest request);

    CompletableFuture<DescribeNodesInstanceTypeResponse> describeNodesInstanceType(DescribeNodesInstanceTypeRequest request);

    CompletableFuture<DescribeReusableSlbResponse> describeReusableSlb(DescribeReusableSlbRequest request);

    CompletableFuture<DescribeServiceAccessDetailResponse> describeServiceAccessDetail(DescribeServiceAccessDetailRequest request);

    CompletableFuture<DescribeServiceMeshAdditionalStatusResponse> describeServiceMeshAdditionalStatus(DescribeServiceMeshAdditionalStatusRequest request);

    CompletableFuture<DescribeServiceMeshClustersResponse> describeServiceMeshClusters(DescribeServiceMeshClustersRequest request);

    CompletableFuture<DescribeServiceMeshDetailResponse> describeServiceMeshDetail(DescribeServiceMeshDetailRequest request);

    CompletableFuture<DescribeServiceMeshKubeconfigResponse> describeServiceMeshKubeconfig(DescribeServiceMeshKubeconfigRequest request);

    CompletableFuture<DescribeServiceMeshLogsResponse> describeServiceMeshLogs(DescribeServiceMeshLogsRequest request);

    CompletableFuture<DescribeServiceMeshProxyStatusResponse> describeServiceMeshProxyStatus(DescribeServiceMeshProxyStatusRequest request);

    CompletableFuture<DescribeServiceMeshServiceLabelResponse> describeServiceMeshServiceLabel(DescribeServiceMeshServiceLabelRequest request);

    CompletableFuture<DescribeServiceMeshUpgradeStatusResponse> describeServiceMeshUpgradeStatus(DescribeServiceMeshUpgradeStatusRequest request);

    CompletableFuture<DescribeServiceMeshVMsResponse> describeServiceMeshVMs(DescribeServiceMeshVMsRequest request);

    CompletableFuture<DescribeServiceMeshesResponse> describeServiceMeshes(DescribeServiceMeshesRequest request);

    CompletableFuture<DescribeUpgradeVersionResponse> describeUpgradeVersion(DescribeUpgradeVersionRequest request);

    CompletableFuture<DescribeUsersWithPermissionsResponse> describeUsersWithPermissions(DescribeUsersWithPermissionsRequest request);

    CompletableFuture<DescribeVMsInServiceMeshResponse> describeVMsInServiceMesh(DescribeVMsInServiceMeshRequest request);

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    CompletableFuture<DescribeVersionManagementResponse> describeVersionManagement(DescribeVersionManagementRequest request);

    CompletableFuture<DescribeVersionsResponse> describeVersions(DescribeVersionsRequest request);

    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    CompletableFuture<GetCaCertResponse> getCaCert(GetCaCertRequest request);

    CompletableFuture<GetRegisteredServiceEndpointsResponse> getRegisteredServiceEndpoints(GetRegisteredServiceEndpointsRequest request);

    CompletableFuture<GetRegisteredServiceNamespacesResponse> getRegisteredServiceNamespaces(GetRegisteredServiceNamespacesRequest request);

    CompletableFuture<GetVmAppMeshInfoResponse> getVmAppMeshInfo(GetVmAppMeshInfoRequest request);

    CompletableFuture<GetVmMetaResponse> getVmMeta(GetVmMetaRequest request);

    CompletableFuture<ListDashboardResponse> listDashboard(ListDashboardRequest request);

    CompletableFuture<ModifyApiServerEipResourceResponse> modifyApiServerEipResource(ModifyApiServerEipResourceRequest request);

    CompletableFuture<ModifyServiceMeshNameResponse> modifyServiceMeshName(ModifyServiceMeshNameRequest request);

    CompletableFuture<ReActivateAuditResponse> reActivateAudit(ReActivateAuditRequest request);

    CompletableFuture<RemoveClusterFromServiceMeshResponse> removeClusterFromServiceMesh(RemoveClusterFromServiceMeshRequest request);

    CompletableFuture<RemoveVMFromServiceMeshResponse> removeVMFromServiceMesh(RemoveVMFromServiceMeshRequest request);

    CompletableFuture<RevokeKubeconfigResponse> revokeKubeconfig(RevokeKubeconfigRequest request);

    CompletableFuture<UpdateASMGatewayResponse> updateASMGateway(UpdateASMGatewayRequest request);

    CompletableFuture<UpdateASMGatewayImportedServicesResponse> updateASMGatewayImportedServices(UpdateASMGatewayImportedServicesRequest request);

    CompletableFuture<UpdateIstioGatewayRoutesResponse> updateIstioGatewayRoutes(UpdateIstioGatewayRoutesRequest request);

    CompletableFuture<UpdateIstioRouteAdditionalStatusResponse> updateIstioRouteAdditionalStatus(UpdateIstioRouteAdditionalStatusRequest request);

    CompletableFuture<UpdateMeshFeatureResponse> updateMeshFeature(UpdateMeshFeatureRequest request);

    CompletableFuture<UpdateNamespaceScopeSidecarConfigResponse> updateNamespaceScopeSidecarConfig(UpdateNamespaceScopeSidecarConfigRequest request);

    CompletableFuture<UpgradeMeshEditionPartiallyResponse> upgradeMeshEditionPartially(UpgradeMeshEditionPartiallyRequest request);

    CompletableFuture<UpgradeMeshVersionResponse> upgradeMeshVersion(UpgradeMeshVersionRequest request);

}
