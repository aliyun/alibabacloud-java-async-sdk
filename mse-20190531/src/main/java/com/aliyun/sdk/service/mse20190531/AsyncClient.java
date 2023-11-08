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

    CompletableFuture<AddAuthPolicyResponse> addAuthPolicy(AddAuthPolicyRequest request);

    CompletableFuture<AddAuthResourceResponse> addAuthResource(AddAuthResourceRequest request);

    CompletableFuture<AddBlackWhiteListResponse> addBlackWhiteList(AddBlackWhiteListRequest request);

    CompletableFuture<AddGatewayResponse> addGateway(AddGatewayRequest request);

    CompletableFuture<AddGatewayAuthConsumerResponse> addGatewayAuthConsumer(AddGatewayAuthConsumerRequest request);

    CompletableFuture<AddGatewayDomainResponse> addGatewayDomain(AddGatewayDomainRequest request);

    CompletableFuture<AddGatewayRouteResponse> addGatewayRoute(AddGatewayRouteRequest request);

    CompletableFuture<AddGatewayServiceVersionResponse> addGatewayServiceVersion(AddGatewayServiceVersionRequest request);

    CompletableFuture<AddGatewaySlbResponse> addGatewaySlb(AddGatewaySlbRequest request);

    CompletableFuture<AddMigrationTaskResponse> addMigrationTask(AddMigrationTaskRequest request);

    CompletableFuture<AddMockRuleResponse> addMockRule(AddMockRuleRequest request);

    CompletableFuture<AddSSLCertResponse> addSSLCert(AddSSLCertRequest request);

    CompletableFuture<AddSecurityGroupRuleResponse> addSecurityGroupRule(AddSecurityGroupRuleRequest request);

    CompletableFuture<AddServiceSourceResponse> addServiceSource(AddServiceSourceRequest request);

    CompletableFuture<ApplyGatewayRouteResponse> applyGatewayRoute(ApplyGatewayRouteRequest request);

    CompletableFuture<ApplyTagPoliciesResponse> applyTagPolicies(ApplyTagPoliciesRequest request);

    /**
      * mse-200-105
      *
     * @tags cluster
     */
    CompletableFuture<CloneNacosConfigResponse> cloneNacosConfig(CloneNacosConfigRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateCircuitBreakerRuleResponse> createCircuitBreakerRule(CreateCircuitBreakerRuleRequest request);

    /**
      * Before you call this API operation, you must make sure that you fully understand the billing methods and pricing of MSE.
      *
     * @tags cluster
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateEngineNamespaceResponse> createEngineNamespace(CreateEngineNamespaceRequest request);

    CompletableFuture<CreateFlowRuleResponse> createFlowRule(CreateFlowRuleRequest request);

    /**
      * @deprecated
      *
     * @tags msc
     */
    CompletableFuture<CreateMseServiceApplicationResponse> createMseServiceApplication(CreateMseServiceApplicationRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<CreateNacosConfigResponse> createNacosConfig(CreateNacosConfigRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<CreateNacosInstanceResponse> createNacosInstance(CreateNacosInstanceRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<CreateNacosServiceResponse> createNacosService(CreateNacosServiceRequest request);

    CompletableFuture<CreateOrUpdateSwimmingLaneResponse> createOrUpdateSwimmingLane(CreateOrUpdateSwimmingLaneRequest request);

    CompletableFuture<CreateOrUpdateSwimmingLaneGroupResponse> createOrUpdateSwimmingLaneGroup(CreateOrUpdateSwimmingLaneGroupRequest request);

    CompletableFuture<CreateZnodeResponse> createZnode(CreateZnodeRequest request);

    CompletableFuture<DeleteAuthResourceResponse> deleteAuthResource(DeleteAuthResourceRequest request);

    CompletableFuture<DeleteCircuitBreakerRulesResponse> deleteCircuitBreakerRules(DeleteCircuitBreakerRulesRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteEngineNamespaceResponse> deleteEngineNamespace(DeleteEngineNamespaceRequest request);

    CompletableFuture<DeleteFlowRulesResponse> deleteFlowRules(DeleteFlowRulesRequest request);

    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    CompletableFuture<DeleteGatewayAuthConsumerResponse> deleteGatewayAuthConsumer(DeleteGatewayAuthConsumerRequest request);

    CompletableFuture<DeleteGatewayAuthConsumerResourceResponse> deleteGatewayAuthConsumerResource(DeleteGatewayAuthConsumerResourceRequest request);

    CompletableFuture<DeleteGatewayDomainResponse> deleteGatewayDomain(DeleteGatewayDomainRequest request);

    CompletableFuture<DeleteGatewayRouteResponse> deleteGatewayRoute(DeleteGatewayRouteRequest request);

    CompletableFuture<DeleteGatewayServiceResponse> deleteGatewayService(DeleteGatewayServiceRequest request);

    CompletableFuture<DeleteGatewayServiceVersionResponse> deleteGatewayServiceVersion(DeleteGatewayServiceVersionRequest request);

    CompletableFuture<DeleteGatewaySlbResponse> deleteGatewaySlb(DeleteGatewaySlbRequest request);

    CompletableFuture<DeleteMigrationTaskResponse> deleteMigrationTask(DeleteMigrationTaskRequest request);

    CompletableFuture<DeleteNacosConfigResponse> deleteNacosConfig(DeleteNacosConfigRequest request);

    /**
      * >  The current API operation is not provided in Nacos SDK. For more information about the Nacos-SDK API, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<DeleteNacosConfigsResponse> deleteNacosConfigs(DeleteNacosConfigsRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<DeleteNacosInstanceResponse> deleteNacosInstance(DeleteNacosInstanceRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<DeleteNacosServiceResponse> deleteNacosService(DeleteNacosServiceRequest request);

    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request);

    CompletableFuture<DeleteServiceSourceResponse> deleteServiceSource(DeleteServiceSourceRequest request);

    CompletableFuture<DeleteSwimmingLaneResponse> deleteSwimmingLane(DeleteSwimmingLaneRequest request);

    CompletableFuture<DeleteSwimmingLaneGroupResponse> deleteSwimmingLaneGroup(DeleteSwimmingLaneGroupRequest request);

    CompletableFuture<DeleteZnodeResponse> deleteZnode(DeleteZnodeRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<ExportNacosConfigResponse> exportNacosConfig(ExportNacosConfigRequest request);

    /**
      * Only one task can run at a time.
      *
     * @tags cluster
     */
    CompletableFuture<ExportZookeeperDataResponse> exportZookeeperData(ExportZookeeperDataRequest request);

    /**
      * You can call this operation to query the rules for graceful start and shutdown.
      *
     * @tags msc
     */
    CompletableFuture<FetchLosslessRuleListResponse> fetchLosslessRuleList(FetchLosslessRuleListRequest request);

    CompletableFuture<GetAppMessageQueueRouteResponse> getAppMessageQueueRoute(GetAppMessageQueueRouteRequest request);

    CompletableFuture<GetApplicationInstanceListResponse> getApplicationInstanceList(GetApplicationInstanceListRequest request);

    CompletableFuture<GetApplicationListResponse> getApplicationList(GetApplicationListRequest request);

    CompletableFuture<GetBlackWhiteListResponse> getBlackWhiteList(GetBlackWhiteListRequest request);

    CompletableFuture<GetEngineNamepaceResponse> getEngineNamepace(GetEngineNamepaceRequest request);

    CompletableFuture<GetGatewayResponse> getGateway(GetGatewayRequest request);

    CompletableFuture<GetGatewayAuthConsumerDetailResponse> getGatewayAuthConsumerDetail(GetGatewayAuthConsumerDetailRequest request);

    CompletableFuture<GetGatewayDomainDetailResponse> getGatewayDomainDetail(GetGatewayDomainDetailRequest request);

    CompletableFuture<GetGatewayOptionResponse> getGatewayOption(GetGatewayOptionRequest request);

    CompletableFuture<GetGatewayRouteDetailResponse> getGatewayRouteDetail(GetGatewayRouteDetailRequest request);

    CompletableFuture<GetGatewayServiceDetailResponse> getGatewayServiceDetail(GetGatewayServiceDetailRequest request);

    CompletableFuture<GetGovernanceKubernetesClusterResponse> getGovernanceKubernetesCluster(GetGovernanceKubernetesClusterRequest request);

    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).\\n
      *
     * @tags cluster
     */
    CompletableFuture<GetImportFileUrlResponse> getImportFileUrl(GetImportFileUrlRequest request);

    CompletableFuture<GetKubernetesSourceResponse> getKubernetesSource(GetKubernetesSourceRequest request);

    /**
      * You can call this operation to query the rules for graceful start and shutdown of an application.
      * You can query the rules for graceful start and shutdown of an application preferentially by using the AppId parameter.
      * If the AppId parameter is left empty, you can use the RegionId, Namespace, and AppName parameters to query the rules for graceful start and shutdown of an application.
      *
     * @tags msc
     */
    CompletableFuture<GetLosslessRuleByAppResponse> getLosslessRuleByApp(GetLosslessRuleByAppRequest request);

    CompletableFuture<GetMseFeatureSwitchResponse> getMseFeatureSwitch(GetMseFeatureSwitchRequest request);

    CompletableFuture<GetMseSourceResponse> getMseSource(GetMseSourceRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<GetNacosConfigResponse> getNacosConfig(GetNacosConfigRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<GetNacosHistoryConfigResponse> getNacosHistoryConfig(GetNacosHistoryConfigRequest request);

    /**
      * You can call this operation to query overview information about service governance.
      *
     * @tags msc
     */
    CompletableFuture<GetOverviewResponse> getOverview(GetOverviewRequest request);

    CompletableFuture<GetPluginConfigResponse> getPluginConfig(GetPluginConfigRequest request);

    CompletableFuture<GetPluginsResponse> getPlugins(GetPluginsRequest request);

    CompletableFuture<GetServiceListResponse> getServiceList(GetServiceListRequest request);

    CompletableFuture<GetServiceListPageResponse> getServiceListPage(GetServiceListPageRequest request);

    CompletableFuture<GetServiceListenersResponse> getServiceListeners(GetServiceListenersRequest request);

    CompletableFuture<GetServiceMethodPageResponse> getServiceMethodPage(GetServiceMethodPageRequest request);

    CompletableFuture<GetTagsBySwimmingLaneGroupIdResponse> getTagsBySwimmingLaneGroupId(GetTagsBySwimmingLaneGroupIdRequest request);

    CompletableFuture<GetZookeeperDataImportUrlResponse> getZookeeperDataImportUrl(GetZookeeperDataImportUrlRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<ImportNacosConfigResponse> importNacosConfig(ImportNacosConfigRequest request);

    CompletableFuture<ImportServicesResponse> importServices(ImportServicesRequest request);

    /**
      * **Danger** This operation clears existing data. Exercise caution when you call this API operation.
      *
     */
    CompletableFuture<ImportZookeeperDataResponse> importZookeeperData(ImportZookeeperDataRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     */
    CompletableFuture<ListAnsInstancesResponse> listAnsInstances(ListAnsInstancesRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<ListAnsServiceClustersResponse> listAnsServiceClusters(ListAnsServiceClustersRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<ListAnsServicesResponse> listAnsServices(ListAnsServicesRequest request);

    /**
      * @deprecated
      *
     * @tags msc
     */
    CompletableFuture<ListAppBySwimmingLaneGroupTagResponse> listAppBySwimmingLaneGroupTag(ListAppBySwimmingLaneGroupTagRequest request);

    CompletableFuture<ListAppBySwimmingLaneGroupTagsResponse> listAppBySwimmingLaneGroupTags(ListAppBySwimmingLaneGroupTagsRequest request);

    CompletableFuture<ListApplicationsWithTagRulesResponse> listApplicationsWithTagRules(ListApplicationsWithTagRulesRequest request);

    CompletableFuture<ListAuthPolicyResponse> listAuthPolicy(ListAuthPolicyRequest request);

    CompletableFuture<ListCircuitBreakerRulesResponse> listCircuitBreakerRules(ListCircuitBreakerRulesRequest request);

    CompletableFuture<ListClusterConnectionTypesResponse> listClusterConnectionTypes(ListClusterConnectionTypesRequest request);

    CompletableFuture<ListClusterHealthCheckTaskResponse> listClusterHealthCheckTask(ListClusterHealthCheckTaskRequest request);

    CompletableFuture<ListClusterTypesResponse> listClusterTypes(ListClusterTypesRequest request);

    CompletableFuture<ListClusterVersionsResponse> listClusterVersions(ListClusterVersionsRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListConfigTrackResponse> listConfigTrack(ListConfigTrackRequest request);

    CompletableFuture<ListEngineNamespacesResponse> listEngineNamespaces(ListEngineNamespacesRequest request);

    CompletableFuture<ListEurekaInstancesResponse> listEurekaInstances(ListEurekaInstancesRequest request);

    CompletableFuture<ListEurekaServicesResponse> listEurekaServices(ListEurekaServicesRequest request);

    CompletableFuture<ListExportZookeeperDataResponse> listExportZookeeperData(ListExportZookeeperDataRequest request);

    CompletableFuture<ListFlowRulesResponse> listFlowRules(ListFlowRulesRequest request);

    CompletableFuture<ListGatewayResponse> listGateway(ListGatewayRequest request);

    CompletableFuture<ListGatewayAuthConsumerResponse> listGatewayAuthConsumer(ListGatewayAuthConsumerRequest request);

    CompletableFuture<ListGatewayAuthConsumerResourceResponse> listGatewayAuthConsumerResource(ListGatewayAuthConsumerResourceRequest request);

    CompletableFuture<ListGatewayDomainResponse> listGatewayDomain(ListGatewayDomainRequest request);

    CompletableFuture<ListGatewayRouteResponse> listGatewayRoute(ListGatewayRouteRequest request);

    CompletableFuture<ListGatewayRouteOnAuthResponse> listGatewayRouteOnAuth(ListGatewayRouteOnAuthRequest request);

    CompletableFuture<ListGatewayServiceResponse> listGatewayService(ListGatewayServiceRequest request);

    CompletableFuture<ListGatewaySlbResponse> listGatewaySlb(ListGatewaySlbRequest request);

    CompletableFuture<ListInstanceCountResponse> listInstanceCount(ListInstanceCountRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     */
    CompletableFuture<ListListenersByConfigResponse> listListenersByConfig(ListListenersByConfigRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<ListListenersByIpResponse> listListenersByIp(ListListenersByIpRequest request);

    CompletableFuture<ListMigrationTaskResponse> listMigrationTask(ListMigrationTaskRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<ListNacosConfigsResponse> listNacosConfigs(ListNacosConfigsRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<ListNacosHistoryConfigsResponse> listNacosHistoryConfigs(ListNacosHistoryConfigsRequest request);

    CompletableFuture<ListNamingTrackResponse> listNamingTrack(ListNamingTrackRequest request);

    CompletableFuture<ListSSLCertResponse> listSSLCert(ListSSLCertRequest request);

    CompletableFuture<ListSecurityGroupResponse> listSecurityGroup(ListSecurityGroupRequest request);

    CompletableFuture<ListSecurityGroupRuleResponse> listSecurityGroupRule(ListSecurityGroupRuleRequest request);

    CompletableFuture<ListServiceSourceResponse> listServiceSource(ListServiceSourceRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListZkTrackResponse> listZkTrack(ListZkTrackRequest request);

    CompletableFuture<ListZnodeChildrenResponse> listZnodeChildren(ListZnodeChildrenRequest request);

    CompletableFuture<ModifyGovernanceKubernetesClusterResponse> modifyGovernanceKubernetesCluster(ModifyGovernanceKubernetesClusterRequest request);

    CompletableFuture<ModifyLosslessRuleResponse> modifyLosslessRule(ModifyLosslessRuleRequest request);

    CompletableFuture<OfflineGatewayRouteResponse> offlineGatewayRoute(OfflineGatewayRouteRequest request);

    CompletableFuture<OrderClusterHealthCheckRiskNoticeResponse> orderClusterHealthCheckRiskNotice(OrderClusterHealthCheckRiskNoticeRequest request);

    CompletableFuture<PullServicesResponse> pullServices(PullServicesRequest request);

    CompletableFuture<PutClusterHealthCheckTaskResponse> putClusterHealthCheckTask(PutClusterHealthCheckTaskRequest request);

    CompletableFuture<QueryAllSwimmingLaneResponse> queryAllSwimmingLane(QueryAllSwimmingLaneRequest request);

    CompletableFuture<QueryAllSwimmingLaneGroupResponse> queryAllSwimmingLaneGroup(QueryAllSwimmingLaneGroupRequest request);

    CompletableFuture<QueryBusinessLocationsResponse> queryBusinessLocations(QueryBusinessLocationsRequest request);

    CompletableFuture<QueryClusterDetailResponse> queryClusterDetail(QueryClusterDetailRequest request);

    CompletableFuture<QueryClusterDiskSpecificationResponse> queryClusterDiskSpecification(QueryClusterDiskSpecificationRequest request);

    CompletableFuture<QueryClusterInfoResponse> queryClusterInfo(QueryClusterInfoRequest request);

    CompletableFuture<QueryClusterSpecificationResponse> queryClusterSpecification(QueryClusterSpecificationRequest request);

    CompletableFuture<QueryConfigResponse> queryConfig(QueryConfigRequest request);

    CompletableFuture<QueryGatewayRegionResponse> queryGatewayRegion(QueryGatewayRegionRequest request);

    CompletableFuture<QueryGatewayTypeResponse> queryGatewayType(QueryGatewayTypeRequest request);

    CompletableFuture<QueryGovernanceKubernetesClusterResponse> queryGovernanceKubernetesCluster(QueryGovernanceKubernetesClusterRequest request);

    CompletableFuture<QueryInstancesInfoResponse> queryInstancesInfo(QueryInstancesInfoRequest request);

    CompletableFuture<QueryMonitorResponse> queryMonitor(QueryMonitorRequest request);

    CompletableFuture<QueryNamespaceResponse> queryNamespace(QueryNamespaceRequest request);

    CompletableFuture<QuerySlbSpecResponse> querySlbSpec(QuerySlbSpecRequest request);

    CompletableFuture<QuerySwimmingLaneByIdResponse> querySwimmingLaneById(QuerySwimmingLaneByIdRequest request);

    CompletableFuture<QueryZnodeDetailResponse> queryZnodeDetail(QueryZnodeDetailRequest request);

    CompletableFuture<RemoveApplicationResponse> removeApplication(RemoveApplicationRequest request);

    CompletableFuture<RemoveAuthPolicyResponse> removeAuthPolicy(RemoveAuthPolicyRequest request);

    CompletableFuture<RestartClusterResponse> restartCluster(RestartClusterRequest request);

    CompletableFuture<RetryClusterResponse> retryCluster(RetryClusterRequest request);

    CompletableFuture<SelectGatewaySlbResponse> selectGatewaySlb(SelectGatewaySlbRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAclResponse> updateAcl(UpdateAclRequest request);

    CompletableFuture<UpdateAuthPolicyResponse> updateAuthPolicy(UpdateAuthPolicyRequest request);

    CompletableFuture<UpdateBlackWhiteListResponse> updateBlackWhiteList(UpdateBlackWhiteListRequest request);

    CompletableFuture<UpdateCircuitBreakerRuleResponse> updateCircuitBreakerRule(UpdateCircuitBreakerRuleRequest request);

    CompletableFuture<UpdateClusterResponse> updateCluster(UpdateClusterRequest request);

    /**
      * You can call this operation to update the number or specifications of nodes in a pay-as-you-go MSE instance. You are charged when you add nodes or upgrade node specifications. For more information, see \\[Pricing] (`~~1806469~~`).
      *
     */
    CompletableFuture<UpdateClusterSpecResponse> updateClusterSpec(UpdateClusterSpecRequest request);

    CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request);

    CompletableFuture<UpdateEngineNamespaceResponse> updateEngineNamespace(UpdateEngineNamespaceRequest request);

    CompletableFuture<UpdateFlowRuleResponse> updateFlowRule(UpdateFlowRuleRequest request);

    CompletableFuture<UpdateGatewayAuthConsumerResponse> updateGatewayAuthConsumer(UpdateGatewayAuthConsumerRequest request);

    CompletableFuture<UpdateGatewayAuthConsumerResourceResponse> updateGatewayAuthConsumerResource(UpdateGatewayAuthConsumerResourceRequest request);

    CompletableFuture<UpdateGatewayAuthConsumerResourceStatusResponse> updateGatewayAuthConsumerResourceStatus(UpdateGatewayAuthConsumerResourceStatusRequest request);

    CompletableFuture<UpdateGatewayAuthConsumerStatusResponse> updateGatewayAuthConsumerStatus(UpdateGatewayAuthConsumerStatusRequest request);

    CompletableFuture<UpdateGatewayDomainResponse> updateGatewayDomain(UpdateGatewayDomainRequest request);

    CompletableFuture<UpdateGatewayNameResponse> updateGatewayName(UpdateGatewayNameRequest request);

    CompletableFuture<UpdateGatewayOptionResponse> updateGatewayOption(UpdateGatewayOptionRequest request);

    CompletableFuture<UpdateGatewayRouteResponse> updateGatewayRoute(UpdateGatewayRouteRequest request);

    CompletableFuture<UpdateGatewayRouteAuthResponse> updateGatewayRouteAuth(UpdateGatewayRouteAuthRequest request);

    CompletableFuture<UpdateGatewayRouteCORSResponse> updateGatewayRouteCORS(UpdateGatewayRouteCORSRequest request);

    CompletableFuture<UpdateGatewayRouteHTTPRewriteResponse> updateGatewayRouteHTTPRewrite(UpdateGatewayRouteHTTPRewriteRequest request);

    CompletableFuture<UpdateGatewayRouteHeaderOpResponse> updateGatewayRouteHeaderOp(UpdateGatewayRouteHeaderOpRequest request);

    CompletableFuture<UpdateGatewayRouteRetryResponse> updateGatewayRouteRetry(UpdateGatewayRouteRetryRequest request);

    CompletableFuture<UpdateGatewayRouteTimeoutResponse> updateGatewayRouteTimeout(UpdateGatewayRouteTimeoutRequest request);

    CompletableFuture<UpdateGatewayRouteWafStatusResponse> updateGatewayRouteWafStatus(UpdateGatewayRouteWafStatusRequest request);

    CompletableFuture<UpdateGatewayServiceCheckResponse> updateGatewayServiceCheck(UpdateGatewayServiceCheckRequest request);

    CompletableFuture<UpdateGatewayServiceTrafficPolicyResponse> updateGatewayServiceTrafficPolicy(UpdateGatewayServiceTrafficPolicyRequest request);

    CompletableFuture<UpdateGatewayServiceVersionResponse> updateGatewayServiceVersion(UpdateGatewayServiceVersionRequest request);

    /**
      * You can call this operation to update the number of nodes or the specifications of nodes in a pay-as-you-go or subscription cloud-native gateway. If you add nodes or increase the specifications, you will incur fees. For more information, see [Pricing](~~250950~~).
      *
     * @tags gateway
     */
    CompletableFuture<UpdateGatewaySpecResponse> updateGatewaySpec(UpdateGatewaySpecRequest request);

    CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request);

    CompletableFuture<UpdateMessageQueueRouteResponse> updateMessageQueueRoute(UpdateMessageQueueRouteRequest request);

    CompletableFuture<UpdateMigrationTaskResponse> updateMigrationTask(UpdateMigrationTaskRequest request);

    CompletableFuture<UpdateNacosClusterResponse> updateNacosCluster(UpdateNacosClusterRequest request);

    /**
      * >  The current API operation is not provided in Nacos SDK. For more information about Nacos SDK, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     * @tags cluster
     */
    CompletableFuture<UpdateNacosConfigResponse> updateNacosConfig(UpdateNacosConfigRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     */
    CompletableFuture<UpdateNacosInstanceResponse> updateNacosInstance(UpdateNacosInstanceRequest request);

    /**
      * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
      *
     */
    CompletableFuture<UpdateNacosServiceResponse> updateNacosService(UpdateNacosServiceRequest request);

    CompletableFuture<UpdatePluginConfigResponse> updatePluginConfig(UpdatePluginConfigRequest request);

    CompletableFuture<UpdateSSLCertResponse> updateSSLCert(UpdateSSLCertRequest request);

    CompletableFuture<UpdateServiceSourceResponse> updateServiceSource(UpdateServiceSourceRequest request);

    CompletableFuture<UpdateZnodeResponse> updateZnode(UpdateZnodeRequest request);

    CompletableFuture<UpgradeClusterResponse> upgradeCluster(UpgradeClusterRequest request);

}
