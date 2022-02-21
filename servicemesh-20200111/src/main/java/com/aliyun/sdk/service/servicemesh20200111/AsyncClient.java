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

    CompletableFuture<AddBuiltinEnvoyFilterResponse> addBuiltinEnvoyFilter(AddBuiltinEnvoyFilterRequest request);

    CompletableFuture<AddClusterIntoServiceMeshResponse> addClusterIntoServiceMesh(AddClusterIntoServiceMeshRequest request);

    CompletableFuture<AddMeshTagToEcsResponse> addMeshTagToEcs(AddMeshTagToEcsRequest request);

    CompletableFuture<AddVMIntoServiceMeshResponse> addVMIntoServiceMesh(AddVMIntoServiceMeshRequest request);

    CompletableFuture<AddVmAppToMeshResponse> addVmAppToMesh(AddVmAppToMeshRequest request);

    CompletableFuture<CreateASMGatewayResponse> createASMGateway(CreateASMGatewayRequest request);

    CompletableFuture<CreateExtensionProviderResponse> createExtensionProvider(CreateExtensionProviderRequest request);

    CompletableFuture<CreateServiceMeshResponse> createServiceMesh(CreateServiceMeshRequest request);

    CompletableFuture<DeleteExtensionProviderResponse> deleteExtensionProvider(DeleteExtensionProviderRequest request);

    CompletableFuture<DeleteServiceMeshResponse> deleteServiceMesh(DeleteServiceMeshRequest request);

    CompletableFuture<DescribeASMGatewayImportedServicesResponse> describeASMGatewayImportedServices(DescribeASMGatewayImportedServicesRequest request);

    CompletableFuture<DescribeAlertActionPoliciesResponse> describeAlertActionPolicies(DescribeAlertActionPoliciesRequest request);

    CompletableFuture<DescribeAvailableNacosInstancesResponse> describeAvailableNacosInstances(DescribeAvailableNacosInstancesRequest request);

    CompletableFuture<DescribeCCMVersionResponse> describeCCMVersion(DescribeCCMVersionRequest request);

    CompletableFuture<DescribeCensResponse> describeCens(DescribeCensRequest request);

    CompletableFuture<DescribeClusterGrafanaResponse> describeClusterGrafana(DescribeClusterGrafanaRequest request);

    CompletableFuture<DescribeClusterPrometheusResponse> describeClusterPrometheus(DescribeClusterPrometheusRequest request);

    CompletableFuture<DescribeClustersInServiceMeshResponse> describeClustersInServiceMesh(DescribeClustersInServiceMeshRequest request);

    CompletableFuture<DescribeControlPlaneLogAlertRulesResponse> describeControlPlaneLogAlertRules(DescribeControlPlaneLogAlertRulesRequest request);

    CompletableFuture<DescribeCrTemplatesResponse> describeCrTemplates(DescribeCrTemplatesRequest request);

    CompletableFuture<DescribeExtensionProviderResponse> describeExtensionProvider(DescribeExtensionProviderRequest request);

    CompletableFuture<DescribeGuestClusterAccessLogDashboardsResponse> describeGuestClusterAccessLogDashboards(DescribeGuestClusterAccessLogDashboardsRequest request);

    CompletableFuture<DescribeGuestClusterNamespacesResponse> describeGuestClusterNamespaces(DescribeGuestClusterNamespacesRequest request);

    CompletableFuture<DescribeGuestClusterPodsResponse> describeGuestClusterPods(DescribeGuestClusterPodsRequest request);

    CompletableFuture<DescribeImportedServicesDetailResponse> describeImportedServicesDetail(DescribeImportedServicesDetailRequest request);

    CompletableFuture<DescribeIngressGatewaysResponse> describeIngressGateways(DescribeIngressGatewaysRequest request);

    CompletableFuture<DescribeNamespaceScopeSidecarConfigResponse> describeNamespaceScopeSidecarConfig(DescribeNamespaceScopeSidecarConfigRequest request);

    CompletableFuture<DescribeNodesInstanceTypeResponse> describeNodesInstanceType(DescribeNodesInstanceTypeRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeServiceMeshDetailResponse> describeServiceMeshDetail(DescribeServiceMeshDetailRequest request);

    CompletableFuture<DescribeServiceMeshGatewayPodStatusResponse> describeServiceMeshGatewayPodStatus(DescribeServiceMeshGatewayPodStatusRequest request);

    CompletableFuture<DescribeServiceMeshGatewaySLBStatusResponse> describeServiceMeshGatewaySLBStatus(DescribeServiceMeshGatewaySLBStatusRequest request);

    CompletableFuture<DescribeServiceMeshKubeconfigResponse> describeServiceMeshKubeconfig(DescribeServiceMeshKubeconfigRequest request);

    CompletableFuture<DescribeServiceMeshUpgradeStatusResponse> describeServiceMeshUpgradeStatus(DescribeServiceMeshUpgradeStatusRequest request);

    CompletableFuture<DescribeServiceMeshVMsResponse> describeServiceMeshVMs(DescribeServiceMeshVMsRequest request);

    CompletableFuture<DescribeServiceMeshesResponse> describeServiceMeshes(DescribeServiceMeshesRequest request);

    CompletableFuture<DescribeUpgradeVersionResponse> describeUpgradeVersion(DescribeUpgradeVersionRequest request);

    CompletableFuture<DescribeUsersWithPermissionsResponse> describeUsersWithPermissions(DescribeUsersWithPermissionsRequest request);

    CompletableFuture<DescribeVMsInServiceMeshResponse> describeVMsInServiceMesh(DescribeVMsInServiceMeshRequest request);

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    CompletableFuture<DescribeVersionsResponse> describeVersions(DescribeVersionsRequest request);

    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    CompletableFuture<DisableControlPlaneLogAlertResponse> disableControlPlaneLogAlert(DisableControlPlaneLogAlertRequest request);

    CompletableFuture<EnableControlPlaneLogAlertResponse> enableControlPlaneLogAlert(EnableControlPlaneLogAlertRequest request);

    CompletableFuture<GetAutoInjectionLabelSyncStatusResponse> getAutoInjectionLabelSyncStatus(GetAutoInjectionLabelSyncStatusRequest request);

    CompletableFuture<GetBuiltinEnvoyFilterResponse> getBuiltinEnvoyFilter(GetBuiltinEnvoyFilterRequest request);

    CompletableFuture<GetBuiltinEnvoyFilterCatalogResponse> getBuiltinEnvoyFilterCatalog(GetBuiltinEnvoyFilterCatalogRequest request);

    CompletableFuture<GetCaCertResponse> getCaCert(GetCaCertRequest request);

    CompletableFuture<GetDiagnosisResponse> getDiagnosis(GetDiagnosisRequest request);

    CompletableFuture<GetEcsListResponse> getEcsList(GetEcsListRequest request);

    CompletableFuture<GetRegisteredServiceEndpointsResponse> getRegisteredServiceEndpoints(GetRegisteredServiceEndpointsRequest request);

    CompletableFuture<GetRegisteredServiceNamespacesResponse> getRegisteredServiceNamespaces(GetRegisteredServiceNamespacesRequest request);

    CompletableFuture<GetRegisteredServicesResponse> getRegisteredServices(GetRegisteredServicesRequest request);

    CompletableFuture<GetSaTokenResponse> getSaToken(GetSaTokenRequest request);

    CompletableFuture<GetServiceMeshSlbResponse> getServiceMeshSlb(GetServiceMeshSlbRequest request);

    CompletableFuture<GetServiceRegistrySourceResponse> getServiceRegistrySource(GetServiceRegistrySourceRequest request);

    CompletableFuture<GetVmAppMeshInfoResponse> getVmAppMeshInfo(GetVmAppMeshInfoRequest request);

    CompletableFuture<GetVmMetaResponse> getVmMeta(GetVmMetaRequest request);

    CompletableFuture<InitializeASMRoleResponse> initializeASMRole(InitializeASMRoleRequest request);

    CompletableFuture<ListBuiltinEnvoyFilterResponse> listBuiltinEnvoyFilter(ListBuiltinEnvoyFilterRequest request);

    CompletableFuture<ModifyBuiltinEnvoyFilterResponse> modifyBuiltinEnvoyFilter(ModifyBuiltinEnvoyFilterRequest request);

    CompletableFuture<ModifyServiceMeshNameResponse> modifyServiceMeshName(ModifyServiceMeshNameRequest request);

    CompletableFuture<ReActivateAuditResponse> reActivateAudit(ReActivateAuditRequest request);

    CompletableFuture<RemoveBuiltinEnvoyFilterResponse> removeBuiltinEnvoyFilter(RemoveBuiltinEnvoyFilterRequest request);

    CompletableFuture<RemoveClusterFromServiceMeshResponse> removeClusterFromServiceMesh(RemoveClusterFromServiceMeshRequest request);

    CompletableFuture<RemoveVMFromServiceMeshResponse> removeVMFromServiceMesh(RemoveVMFromServiceMeshRequest request);

    CompletableFuture<RemoveVmAppFromMeshResponse> removeVmAppFromMesh(RemoveVmAppFromMeshRequest request);

    CompletableFuture<RevokeKubeconfigResponse> revokeKubeconfig(RevokeKubeconfigRequest request);

    CompletableFuture<RunDiagnosisResponse> runDiagnosis(RunDiagnosisRequest request);

    CompletableFuture<SetServiceRegistrySourceResponse> setServiceRegistrySource(SetServiceRegistrySourceRequest request);

    CompletableFuture<UpdateASMGatewayResponse> updateASMGateway(UpdateASMGatewayRequest request);

    CompletableFuture<UpdateASMGatewayImportedServicesResponse> updateASMGatewayImportedServices(UpdateASMGatewayImportedServicesRequest request);

    CompletableFuture<UpdateControlPlaneLogAlertActionPolicyResponse> updateControlPlaneLogAlertActionPolicy(UpdateControlPlaneLogAlertActionPolicyRequest request);

    CompletableFuture<UpdateControlPlaneLogConfigResponse> updateControlPlaneLogConfig(UpdateControlPlaneLogConfigRequest request);

    CompletableFuture<UpdateExtensionProviderResponse> updateExtensionProvider(UpdateExtensionProviderRequest request);

    CompletableFuture<UpdateIstioInjectionConfigResponse> updateIstioInjectionConfig(UpdateIstioInjectionConfigRequest request);

    CompletableFuture<UpdateMeshFeatureResponse> updateMeshFeature(UpdateMeshFeatureRequest request);

    CompletableFuture<UpdateNamespaceScopeSidecarConfigResponse> updateNamespaceScopeSidecarConfig(UpdateNamespaceScopeSidecarConfigRequest request);

    CompletableFuture<UpgradeMeshVersionResponse> upgradeMeshVersion(UpgradeMeshVersionRequest request);

}
