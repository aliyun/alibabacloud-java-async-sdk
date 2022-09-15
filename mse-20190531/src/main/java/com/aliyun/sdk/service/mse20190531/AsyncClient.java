// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mse20190531.models.*;
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

    CompletableFuture<AddAuthResourceResponse> addAuthResource(AddAuthResourceRequest request);

    CompletableFuture<AddBlackWhiteListResponse> addBlackWhiteList(AddBlackWhiteListRequest request);

    CompletableFuture<AddGatewayResponse> addGateway(AddGatewayRequest request);

    CompletableFuture<AddGatewayDomainResponse> addGatewayDomain(AddGatewayDomainRequest request);

    CompletableFuture<AddGatewayRouteResponse> addGatewayRoute(AddGatewayRouteRequest request);

    CompletableFuture<AddGatewayServiceVersionResponse> addGatewayServiceVersion(AddGatewayServiceVersionRequest request);

    CompletableFuture<AddGatewaySlbResponse> addGatewaySlb(AddGatewaySlbRequest request);

    CompletableFuture<AddMockRuleResponse> addMockRule(AddMockRuleRequest request);

    CompletableFuture<AddSSLCertResponse> addSSLCert(AddSSLCertRequest request);

    CompletableFuture<AddSecurityGroupRuleResponse> addSecurityGroupRule(AddSecurityGroupRuleRequest request);

    CompletableFuture<AddServiceSourceResponse> addServiceSource(AddServiceSourceRequest request);

    CompletableFuture<ApplyGatewayRouteResponse> applyGatewayRoute(ApplyGatewayRouteRequest request);

    CompletableFuture<ApplyTagPoliciesResponse> applyTagPolicies(ApplyTagPoliciesRequest request);

    CompletableFuture<CloneNacosConfigResponse> cloneNacosConfig(CloneNacosConfigRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateEngineNamespaceResponse> createEngineNamespace(CreateEngineNamespaceRequest request);

    CompletableFuture<CreateMseServiceApplicationResponse> createMseServiceApplication(CreateMseServiceApplicationRequest request);

    CompletableFuture<CreateNacosConfigResponse> createNacosConfig(CreateNacosConfigRequest request);

    CompletableFuture<CreateNacosInstanceResponse> createNacosInstance(CreateNacosInstanceRequest request);

    CompletableFuture<CreateNacosServiceResponse> createNacosService(CreateNacosServiceRequest request);

    CompletableFuture<CreateOrUpdateSwimmingLaneResponse> createOrUpdateSwimmingLane(CreateOrUpdateSwimmingLaneRequest request);

    CompletableFuture<CreateOrUpdateSwimmingLaneGroupResponse> createOrUpdateSwimmingLaneGroup(CreateOrUpdateSwimmingLaneGroupRequest request);

    CompletableFuture<CreateZnodeResponse> createZnode(CreateZnodeRequest request);

    CompletableFuture<DeleteAuthResourceResponse> deleteAuthResource(DeleteAuthResourceRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteEngineNamespaceResponse> deleteEngineNamespace(DeleteEngineNamespaceRequest request);

    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    CompletableFuture<DeleteGatewayDomainResponse> deleteGatewayDomain(DeleteGatewayDomainRequest request);

    CompletableFuture<DeleteGatewayRouteResponse> deleteGatewayRoute(DeleteGatewayRouteRequest request);

    CompletableFuture<DeleteGatewayServiceResponse> deleteGatewayService(DeleteGatewayServiceRequest request);

    CompletableFuture<DeleteGatewayServiceVersionResponse> deleteGatewayServiceVersion(DeleteGatewayServiceVersionRequest request);

    CompletableFuture<DeleteGatewaySlbResponse> deleteGatewaySlb(DeleteGatewaySlbRequest request);

    CompletableFuture<DeleteNacosConfigResponse> deleteNacosConfig(DeleteNacosConfigRequest request);

    CompletableFuture<DeleteNacosConfigsResponse> deleteNacosConfigs(DeleteNacosConfigsRequest request);

    CompletableFuture<DeleteNacosInstanceResponse> deleteNacosInstance(DeleteNacosInstanceRequest request);

    CompletableFuture<DeleteNacosServiceResponse> deleteNacosService(DeleteNacosServiceRequest request);

    CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request);

    CompletableFuture<DeleteServiceSourceResponse> deleteServiceSource(DeleteServiceSourceRequest request);

    CompletableFuture<DeleteSwimmingLaneResponse> deleteSwimmingLane(DeleteSwimmingLaneRequest request);

    CompletableFuture<DeleteSwimmingLaneGroupResponse> deleteSwimmingLaneGroup(DeleteSwimmingLaneGroupRequest request);

    CompletableFuture<DeleteZnodeResponse> deleteZnode(DeleteZnodeRequest request);

    CompletableFuture<ExportNacosConfigResponse> exportNacosConfig(ExportNacosConfigRequest request);

    CompletableFuture<GetAppMessageQueueRouteResponse> getAppMessageQueueRoute(GetAppMessageQueueRouteRequest request);

    CompletableFuture<GetApplicationListResponse> getApplicationList(GetApplicationListRequest request);

    CompletableFuture<GetBlackWhiteListResponse> getBlackWhiteList(GetBlackWhiteListRequest request);

    CompletableFuture<GetEngineNamepaceResponse> getEngineNamepace(GetEngineNamepaceRequest request);

    CompletableFuture<GetGatewayResponse> getGateway(GetGatewayRequest request);

    CompletableFuture<GetGatewayDomainDetailResponse> getGatewayDomainDetail(GetGatewayDomainDetailRequest request);

    CompletableFuture<GetGatewayOptionResponse> getGatewayOption(GetGatewayOptionRequest request);

    CompletableFuture<GetGatewayRouteDetailResponse> getGatewayRouteDetail(GetGatewayRouteDetailRequest request);

    CompletableFuture<GetGatewayServiceDetailResponse> getGatewayServiceDetail(GetGatewayServiceDetailRequest request);

    CompletableFuture<GetGovernanceKubernetesClusterResponse> getGovernanceKubernetesCluster(GetGovernanceKubernetesClusterRequest request);

    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    CompletableFuture<GetImportFileUrlResponse> getImportFileUrl(GetImportFileUrlRequest request);

    CompletableFuture<GetKubernetesSourceResponse> getKubernetesSource(GetKubernetesSourceRequest request);

    CompletableFuture<GetMseFeatureSwitchResponse> getMseFeatureSwitch(GetMseFeatureSwitchRequest request);

    CompletableFuture<GetMseSourceResponse> getMseSource(GetMseSourceRequest request);

    CompletableFuture<GetNacosConfigResponse> getNacosConfig(GetNacosConfigRequest request);

    CompletableFuture<GetNacosHistoryConfigResponse> getNacosHistoryConfig(GetNacosHistoryConfigRequest request);

    CompletableFuture<GetOverviewResponse> getOverview(GetOverviewRequest request);

    CompletableFuture<GetPluginConfigResponse> getPluginConfig(GetPluginConfigRequest request);

    CompletableFuture<GetPluginsResponse> getPlugins(GetPluginsRequest request);

    CompletableFuture<GetServiceListResponse> getServiceList(GetServiceListRequest request);

    CompletableFuture<GetServiceListenersResponse> getServiceListeners(GetServiceListenersRequest request);

    CompletableFuture<GetTagsBySwimmingLaneGroupIdResponse> getTagsBySwimmingLaneGroupId(GetTagsBySwimmingLaneGroupIdRequest request);

    CompletableFuture<ImportNacosConfigResponse> importNacosConfig(ImportNacosConfigRequest request);

    CompletableFuture<ImportServicesResponse> importServices(ImportServicesRequest request);

    CompletableFuture<ListAnsInstancesResponse> listAnsInstances(ListAnsInstancesRequest request);

    CompletableFuture<ListAnsServiceClustersResponse> listAnsServiceClusters(ListAnsServiceClustersRequest request);

    CompletableFuture<ListAnsServicesResponse> listAnsServices(ListAnsServicesRequest request);

    CompletableFuture<ListAppBySwimmingLaneGroupTagResponse> listAppBySwimmingLaneGroupTag(ListAppBySwimmingLaneGroupTagRequest request);

    CompletableFuture<ListApplicationsWithTagRulesResponse> listApplicationsWithTagRules(ListApplicationsWithTagRulesRequest request);

    CompletableFuture<ListClusterConnectionTypesResponse> listClusterConnectionTypes(ListClusterConnectionTypesRequest request);

    CompletableFuture<ListClusterTypesResponse> listClusterTypes(ListClusterTypesRequest request);

    CompletableFuture<ListClusterVersionsResponse> listClusterVersions(ListClusterVersionsRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListEngineNamespacesResponse> listEngineNamespaces(ListEngineNamespacesRequest request);

    CompletableFuture<ListEurekaInstancesResponse> listEurekaInstances(ListEurekaInstancesRequest request);

    CompletableFuture<ListEurekaServicesResponse> listEurekaServices(ListEurekaServicesRequest request);

    CompletableFuture<ListGatewayResponse> listGateway(ListGatewayRequest request);

    CompletableFuture<ListGatewayDomainResponse> listGatewayDomain(ListGatewayDomainRequest request);

    CompletableFuture<ListGatewayRouteResponse> listGatewayRoute(ListGatewayRouteRequest request);

    CompletableFuture<ListGatewayServiceResponse> listGatewayService(ListGatewayServiceRequest request);

    CompletableFuture<ListGatewaySlbResponse> listGatewaySlb(ListGatewaySlbRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListListenersByConfigResponse> listListenersByConfig(ListListenersByConfigRequest request);

    CompletableFuture<ListListenersByIpResponse> listListenersByIp(ListListenersByIpRequest request);

    CompletableFuture<ListNacosConfigsResponse> listNacosConfigs(ListNacosConfigsRequest request);

    CompletableFuture<ListNacosHistoryConfigsResponse> listNacosHistoryConfigs(ListNacosHistoryConfigsRequest request);

    CompletableFuture<ListSSLCertResponse> listSSLCert(ListSSLCertRequest request);

    CompletableFuture<ListSecurityGroupResponse> listSecurityGroup(ListSecurityGroupRequest request);

    CompletableFuture<ListSecurityGroupRuleResponse> listSecurityGroupRule(ListSecurityGroupRuleRequest request);

    CompletableFuture<ListServiceSourceResponse> listServiceSource(ListServiceSourceRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListUserInstancesResponse> listUserInstances(ListUserInstancesRequest request);

    CompletableFuture<ListVgroupsResponse> listVgroups(ListVgroupsRequest request);

    CompletableFuture<ListZnodeChildrenResponse> listZnodeChildren(ListZnodeChildrenRequest request);

    CompletableFuture<ModifyGovernanceKubernetesClusterResponse> modifyGovernanceKubernetesCluster(ModifyGovernanceKubernetesClusterRequest request);

    CompletableFuture<ModifyLosslessRuleResponse> modifyLosslessRule(ModifyLosslessRuleRequest request);

    CompletableFuture<OfflineGatewayRouteResponse> offlineGatewayRoute(OfflineGatewayRouteRequest request);

    CompletableFuture<PullServicesResponse> pullServices(PullServicesRequest request);

    CompletableFuture<QueryAllSwimmingLaneResponse> queryAllSwimmingLane(QueryAllSwimmingLaneRequest request);

    CompletableFuture<QueryAllSwimmingLaneGroupResponse> queryAllSwimmingLaneGroup(QueryAllSwimmingLaneGroupRequest request);

    CompletableFuture<QueryBusinessLocationsResponse> queryBusinessLocations(QueryBusinessLocationsRequest request);

    CompletableFuture<QueryClusterDetailResponse> queryClusterDetail(QueryClusterDetailRequest request);

    CompletableFuture<QueryClusterDiskSpecificationResponse> queryClusterDiskSpecification(QueryClusterDiskSpecificationRequest request);

    CompletableFuture<QueryClusterSpecificationResponse> queryClusterSpecification(QueryClusterSpecificationRequest request);

    CompletableFuture<QueryConfigResponse> queryConfig(QueryConfigRequest request);

    CompletableFuture<QueryGatewayRegionResponse> queryGatewayRegion(QueryGatewayRegionRequest request);

    CompletableFuture<QueryGatewayTypeResponse> queryGatewayType(QueryGatewayTypeRequest request);

    CompletableFuture<QueryGovernanceKubernetesClusterResponse> queryGovernanceKubernetesCluster(QueryGovernanceKubernetesClusterRequest request);

    CompletableFuture<QueryMonitorResponse> queryMonitor(QueryMonitorRequest request);

    CompletableFuture<QuerySlbSpecResponse> querySlbSpec(QuerySlbSpecRequest request);

    CompletableFuture<QuerySwimmingLaneByIdResponse> querySwimmingLaneById(QuerySwimmingLaneByIdRequest request);

    CompletableFuture<QueryZnodeDetailResponse> queryZnodeDetail(QueryZnodeDetailRequest request);

    CompletableFuture<RestartClusterResponse> restartCluster(RestartClusterRequest request);

    CompletableFuture<RetryClusterResponse> retryCluster(RetryClusterRequest request);

    CompletableFuture<SelectGatewaySlbResponse> selectGatewaySlb(SelectGatewaySlbRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAclResponse> updateAcl(UpdateAclRequest request);

    CompletableFuture<UpdateBlackWhiteListResponse> updateBlackWhiteList(UpdateBlackWhiteListRequest request);

    CompletableFuture<UpdateClusterResponse> updateCluster(UpdateClusterRequest request);

    CompletableFuture<UpdateClusterSpecResponse> updateClusterSpec(UpdateClusterSpecRequest request);

    CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request);

    CompletableFuture<UpdateEngineNamespaceResponse> updateEngineNamespace(UpdateEngineNamespaceRequest request);

    CompletableFuture<UpdateGatewayDomainResponse> updateGatewayDomain(UpdateGatewayDomainRequest request);

    CompletableFuture<UpdateGatewayNameResponse> updateGatewayName(UpdateGatewayNameRequest request);

    CompletableFuture<UpdateGatewayOptionResponse> updateGatewayOption(UpdateGatewayOptionRequest request);

    CompletableFuture<UpdateGatewayRouteResponse> updateGatewayRoute(UpdateGatewayRouteRequest request);

    CompletableFuture<UpdateGatewayRouteCORSResponse> updateGatewayRouteCORS(UpdateGatewayRouteCORSRequest request);

    CompletableFuture<UpdateGatewayRouteHTTPRewriteResponse> updateGatewayRouteHTTPRewrite(UpdateGatewayRouteHTTPRewriteRequest request);

    CompletableFuture<UpdateGatewayRouteHeaderOpResponse> updateGatewayRouteHeaderOp(UpdateGatewayRouteHeaderOpRequest request);

    CompletableFuture<UpdateGatewayRouteRetryResponse> updateGatewayRouteRetry(UpdateGatewayRouteRetryRequest request);

    CompletableFuture<UpdateGatewayRouteTimeoutResponse> updateGatewayRouteTimeout(UpdateGatewayRouteTimeoutRequest request);

    CompletableFuture<UpdateGatewayRouteWafStatusResponse> updateGatewayRouteWafStatus(UpdateGatewayRouteWafStatusRequest request);

    CompletableFuture<UpdateGatewayServiceTrafficPolicyResponse> updateGatewayServiceTrafficPolicy(UpdateGatewayServiceTrafficPolicyRequest request);

    CompletableFuture<UpdateGatewayServiceVersionResponse> updateGatewayServiceVersion(UpdateGatewayServiceVersionRequest request);

    CompletableFuture<UpdateGatewaySpecResponse> updateGatewaySpec(UpdateGatewaySpecRequest request);

    CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request);

    CompletableFuture<UpdateMessageQueueRouteResponse> updateMessageQueueRoute(UpdateMessageQueueRouteRequest request);

    CompletableFuture<UpdateNacosClusterResponse> updateNacosCluster(UpdateNacosClusterRequest request);

    CompletableFuture<UpdateNacosConfigResponse> updateNacosConfig(UpdateNacosConfigRequest request);

    CompletableFuture<UpdateNacosInstanceResponse> updateNacosInstance(UpdateNacosInstanceRequest request);

    CompletableFuture<UpdateNacosServiceResponse> updateNacosService(UpdateNacosServiceRequest request);

    CompletableFuture<UpdatePluginConfigResponse> updatePluginConfig(UpdatePluginConfigRequest request);

    CompletableFuture<UpdateSSLCertResponse> updateSSLCert(UpdateSSLCertRequest request);

    CompletableFuture<UpdateServiceSourceResponse> updateServiceSource(UpdateServiceSourceRequest request);

    CompletableFuture<UpdateZnodeResponse> updateZnode(UpdateZnodeRequest request);

    CompletableFuture<UpgradeClusterResponse> upgradeCluster(UpgradeClusterRequest request);

}
