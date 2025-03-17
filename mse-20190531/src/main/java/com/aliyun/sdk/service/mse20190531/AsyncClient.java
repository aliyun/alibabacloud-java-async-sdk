// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mse20190531.models.*;
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
     * @param request the request parameters of AddAuthPolicy  AddAuthPolicyRequest
     * @return AddAuthPolicyResponse
     */
    CompletableFuture<AddAuthPolicyResponse> addAuthPolicy(AddAuthPolicyRequest request);

    /**
     * @param request the request parameters of AddAuthResource  AddAuthResourceRequest
     * @return AddAuthResourceResponse
     */
    CompletableFuture<AddAuthResourceResponse> addAuthResource(AddAuthResourceRequest request);

    /**
     * @param request the request parameters of AddBlackWhiteList  AddBlackWhiteListRequest
     * @return AddBlackWhiteListResponse
     */
    CompletableFuture<AddBlackWhiteListResponse> addBlackWhiteList(AddBlackWhiteListRequest request);

    /**
     * @param request the request parameters of AddGateway  AddGatewayRequest
     * @return AddGatewayResponse
     */
    CompletableFuture<AddGatewayResponse> addGateway(AddGatewayRequest request);

    /**
     * @param request the request parameters of AddGatewayAuth  AddGatewayAuthRequest
     * @return AddGatewayAuthResponse
     */
    CompletableFuture<AddGatewayAuthResponse> addGatewayAuth(AddGatewayAuthRequest request);

    /**
     * @param request the request parameters of AddGatewayAuthConsumer  AddGatewayAuthConsumerRequest
     * @return AddGatewayAuthConsumerResponse
     */
    CompletableFuture<AddGatewayAuthConsumerResponse> addGatewayAuthConsumer(AddGatewayAuthConsumerRequest request);

    /**
     * @param request the request parameters of AddGatewayDomain  AddGatewayDomainRequest
     * @return AddGatewayDomainResponse
     */
    CompletableFuture<AddGatewayDomainResponse> addGatewayDomain(AddGatewayDomainRequest request);

    /**
     * @param request the request parameters of AddGatewayRoute  AddGatewayRouteRequest
     * @return AddGatewayRouteResponse
     */
    CompletableFuture<AddGatewayRouteResponse> addGatewayRoute(AddGatewayRouteRequest request);

    /**
     * @param request the request parameters of AddGatewayServiceVersion  AddGatewayServiceVersionRequest
     * @return AddGatewayServiceVersionResponse
     */
    CompletableFuture<AddGatewayServiceVersionResponse> addGatewayServiceVersion(AddGatewayServiceVersionRequest request);

    /**
     * @param request the request parameters of AddGatewaySlb  AddGatewaySlbRequest
     * @return AddGatewaySlbResponse
     */
    CompletableFuture<AddGatewaySlbResponse> addGatewaySlb(AddGatewaySlbRequest request);

    /**
     * @param request the request parameters of AddMigrationTask  AddMigrationTaskRequest
     * @return AddMigrationTaskResponse
     */
    CompletableFuture<AddMigrationTaskResponse> addMigrationTask(AddMigrationTaskRequest request);

    /**
     * @param request the request parameters of AddMockRule  AddMockRuleRequest
     * @return AddMockRuleResponse
     */
    CompletableFuture<AddMockRuleResponse> addMockRule(AddMockRuleRequest request);

    /**
     * @param request the request parameters of AddSSLCert  AddSSLCertRequest
     * @return AddSSLCertResponse
     */
    CompletableFuture<AddSSLCertResponse> addSSLCert(AddSSLCertRequest request);

    /**
     * @param request the request parameters of AddSecurityGroupRule  AddSecurityGroupRuleRequest
     * @return AddSecurityGroupRuleResponse
     */
    CompletableFuture<AddSecurityGroupRuleResponse> addSecurityGroupRule(AddSecurityGroupRuleRequest request);

    /**
     * @param request the request parameters of AddServiceSource  AddServiceSourceRequest
     * @return AddServiceSourceResponse
     */
    CompletableFuture<AddServiceSourceResponse> addServiceSource(AddServiceSourceRequest request);

    /**
     * @param request the request parameters of ApplyGatewayRoute  ApplyGatewayRouteRequest
     * @return ApplyGatewayRouteResponse
     */
    CompletableFuture<ApplyGatewayRouteResponse> applyGatewayRoute(ApplyGatewayRouteRequest request);

    /**
     * @param request the request parameters of ApplyTagPolicies  ApplyTagPoliciesRequest
     * @return ApplyTagPoliciesResponse
     */
    CompletableFuture<ApplyTagPoliciesResponse> applyTagPolicies(ApplyTagPoliciesRequest request);

    /**
     * @param request the request parameters of BindSentinelBlockFallbackDefinition  BindSentinelBlockFallbackDefinitionRequest
     * @return BindSentinelBlockFallbackDefinitionResponse
     */
    CompletableFuture<BindSentinelBlockFallbackDefinitionResponse> bindSentinelBlockFallbackDefinition(BindSentinelBlockFallbackDefinitionRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This OpenAPI is not the Nacos-SDK API. For information related to the Nacos-SDK API, please refer to the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CloneNacosConfig  CloneNacosConfigRequest
     * @return CloneNacosConfigResponse
     */
    CompletableFuture<CloneNacosConfigResponse> cloneNacosConfig(CloneNacosConfigRequest request);

    /**
     * @param request the request parameters of CloneSentinelRuleFromAhas  CloneSentinelRuleFromAhasRequest
     * @return CloneSentinelRuleFromAhasResponse
     */
    CompletableFuture<CloneSentinelRuleFromAhasResponse> cloneSentinelRuleFromAhas(CloneSentinelRuleFromAhasRequest request);

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
     * @param request the request parameters of CreateCircuitBreakerRule  CreateCircuitBreakerRuleRequest
     * @return CreateCircuitBreakerRuleResponse
     */
    CompletableFuture<CreateCircuitBreakerRuleResponse> createCircuitBreakerRule(CreateCircuitBreakerRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Please ensure that you fully understand the billing method and pricing of the MSE (Microservice Engine) product before using this interface.</p>
     * 
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateEngineNamespace  CreateEngineNamespaceRequest
     * @return CreateEngineNamespaceResponse
     */
    CompletableFuture<CreateEngineNamespaceResponse> createEngineNamespace(CreateEngineNamespaceRequest request);

    /**
     * @param request the request parameters of CreateFlowRule  CreateFlowRuleRequest
     * @return CreateFlowRuleResponse
     */
    CompletableFuture<CreateFlowRuleResponse> createFlowRule(CreateFlowRuleRequest request);

    /**
     * @param request the request parameters of CreateGatewayCircuitBreakerRule  CreateGatewayCircuitBreakerRuleRequest
     * @return CreateGatewayCircuitBreakerRuleResponse
     */
    CompletableFuture<CreateGatewayCircuitBreakerRuleResponse> createGatewayCircuitBreakerRule(CreateGatewayCircuitBreakerRuleRequest request);

    /**
     * @param request the request parameters of CreateGatewayFlowRule  CreateGatewayFlowRuleRequest
     * @return CreateGatewayFlowRuleResponse
     */
    CompletableFuture<CreateGatewayFlowRuleResponse> createGatewayFlowRule(CreateGatewayFlowRuleRequest request);

    /**
     * @param request the request parameters of CreateGatewayIsolationRule  CreateGatewayIsolationRuleRequest
     * @return CreateGatewayIsolationRuleResponse
     */
    CompletableFuture<CreateGatewayIsolationRuleResponse> createGatewayIsolationRule(CreateGatewayIsolationRuleRequest request);

    /**
     * @param request the request parameters of CreateIsolationRule  CreateIsolationRuleRequest
     * @return CreateIsolationRuleResponse
     */
    CompletableFuture<CreateIsolationRuleResponse> createIsolationRule(CreateIsolationRuleRequest request);

    /**
     * @deprecated OpenAPI CreateMseServiceApplication is deprecated, please use mse::2019-05-31::CreateApplication instead.  * @tags msc
     * 
     * @param request the request parameters of CreateMseServiceApplication  CreateMseServiceApplicationRequest
     * @return CreateMseServiceApplicationResponse
     */
    @Deprecated
    CompletableFuture<CreateMseServiceApplicationResponse> createMseServiceApplication(CreateMseServiceApplicationRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateNacosConfig  CreateNacosConfigRequest
     * @return CreateNacosConfigResponse
     */
    CompletableFuture<CreateNacosConfigResponse> createNacosConfig(CreateNacosConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateNacosInstance  CreateNacosInstanceRequest
     * @return CreateNacosInstanceResponse
     */
    CompletableFuture<CreateNacosInstanceResponse> createNacosInstance(CreateNacosInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateNacosService  CreateNacosServiceRequest
     * @return CreateNacosServiceResponse
     */
    CompletableFuture<CreateNacosServiceResponse> createNacosService(CreateNacosServiceRequest request);

    /**
     * @param request the request parameters of CreateNamespace  CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateSwimmingLane  CreateOrUpdateSwimmingLaneRequest
     * @return CreateOrUpdateSwimmingLaneResponse
     */
    CompletableFuture<CreateOrUpdateSwimmingLaneResponse> createOrUpdateSwimmingLane(CreateOrUpdateSwimmingLaneRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateSwimmingLaneGroup  CreateOrUpdateSwimmingLaneGroupRequest
     * @return CreateOrUpdateSwimmingLaneGroupResponse
     */
    CompletableFuture<CreateOrUpdateSwimmingLaneGroupResponse> createOrUpdateSwimmingLaneGroup(CreateOrUpdateSwimmingLaneGroupRequest request);

    /**
     * @param request the request parameters of CreatePluginConfig  CreatePluginConfigRequest
     * @return CreatePluginConfigResponse
     */
    CompletableFuture<CreatePluginConfigResponse> createPluginConfig(CreatePluginConfigRequest request);

    /**
     * @param request the request parameters of CreateZnode  CreateZnodeRequest
     * @return CreateZnodeResponse
     */
    CompletableFuture<CreateZnodeResponse> createZnode(CreateZnodeRequest request);

    /**
     * @param request the request parameters of DeleteAuthResource  DeleteAuthResourceRequest
     * @return DeleteAuthResourceResponse
     */
    CompletableFuture<DeleteAuthResourceResponse> deleteAuthResource(DeleteAuthResourceRequest request);

    /**
     * @param request the request parameters of DeleteCircuitBreakerRules  DeleteCircuitBreakerRulesRequest
     * @return DeleteCircuitBreakerRulesResponse
     */
    CompletableFuture<DeleteCircuitBreakerRulesResponse> deleteCircuitBreakerRules(DeleteCircuitBreakerRulesRequest request);

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteEngineNamespace  DeleteEngineNamespaceRequest
     * @return DeleteEngineNamespaceResponse
     */
    CompletableFuture<DeleteEngineNamespaceResponse> deleteEngineNamespace(DeleteEngineNamespaceRequest request);

    /**
     * @param request the request parameters of DeleteFlowRules  DeleteFlowRulesRequest
     * @return DeleteFlowRulesResponse
     */
    CompletableFuture<DeleteFlowRulesResponse> deleteFlowRules(DeleteFlowRulesRequest request);

    /**
     * @param request the request parameters of DeleteGateway  DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    /**
     * @param request the request parameters of DeleteGatewayAuthConsumer  DeleteGatewayAuthConsumerRequest
     * @return DeleteGatewayAuthConsumerResponse
     */
    CompletableFuture<DeleteGatewayAuthConsumerResponse> deleteGatewayAuthConsumer(DeleteGatewayAuthConsumerRequest request);

    /**
     * @param request the request parameters of DeleteGatewayAuthConsumerResource  DeleteGatewayAuthConsumerResourceRequest
     * @return DeleteGatewayAuthConsumerResourceResponse
     */
    CompletableFuture<DeleteGatewayAuthConsumerResourceResponse> deleteGatewayAuthConsumerResource(DeleteGatewayAuthConsumerResourceRequest request);

    /**
     * @param request the request parameters of DeleteGatewayCircuitBreakerRule  DeleteGatewayCircuitBreakerRuleRequest
     * @return DeleteGatewayCircuitBreakerRuleResponse
     */
    CompletableFuture<DeleteGatewayCircuitBreakerRuleResponse> deleteGatewayCircuitBreakerRule(DeleteGatewayCircuitBreakerRuleRequest request);

    /**
     * @param request the request parameters of DeleteGatewayDomain  DeleteGatewayDomainRequest
     * @return DeleteGatewayDomainResponse
     */
    CompletableFuture<DeleteGatewayDomainResponse> deleteGatewayDomain(DeleteGatewayDomainRequest request);

    /**
     * @param request the request parameters of DeleteGatewayFlowRule  DeleteGatewayFlowRuleRequest
     * @return DeleteGatewayFlowRuleResponse
     */
    CompletableFuture<DeleteGatewayFlowRuleResponse> deleteGatewayFlowRule(DeleteGatewayFlowRuleRequest request);

    /**
     * @param request the request parameters of DeleteGatewayIsolationRule  DeleteGatewayIsolationRuleRequest
     * @return DeleteGatewayIsolationRuleResponse
     */
    CompletableFuture<DeleteGatewayIsolationRuleResponse> deleteGatewayIsolationRule(DeleteGatewayIsolationRuleRequest request);

    /**
     * @param request the request parameters of DeleteGatewayRoute  DeleteGatewayRouteRequest
     * @return DeleteGatewayRouteResponse
     */
    CompletableFuture<DeleteGatewayRouteResponse> deleteGatewayRoute(DeleteGatewayRouteRequest request);

    /**
     * @param request the request parameters of DeleteGatewayService  DeleteGatewayServiceRequest
     * @return DeleteGatewayServiceResponse
     */
    CompletableFuture<DeleteGatewayServiceResponse> deleteGatewayService(DeleteGatewayServiceRequest request);

    /**
     * @param request the request parameters of DeleteGatewayServiceVersion  DeleteGatewayServiceVersionRequest
     * @return DeleteGatewayServiceVersionResponse
     */
    CompletableFuture<DeleteGatewayServiceVersionResponse> deleteGatewayServiceVersion(DeleteGatewayServiceVersionRequest request);

    /**
     * @param request the request parameters of DeleteGatewaySlb  DeleteGatewaySlbRequest
     * @return DeleteGatewaySlbResponse
     */
    CompletableFuture<DeleteGatewaySlbResponse> deleteGatewaySlb(DeleteGatewaySlbRequest request);

    /**
     * @param request the request parameters of DeleteIsolationRules  DeleteIsolationRulesRequest
     * @return DeleteIsolationRulesResponse
     */
    CompletableFuture<DeleteIsolationRulesResponse> deleteIsolationRules(DeleteIsolationRulesRequest request);

    /**
     * @param request the request parameters of DeleteMigrationTask  DeleteMigrationTaskRequest
     * @return DeleteMigrationTaskResponse
     */
    CompletableFuture<DeleteMigrationTaskResponse> deleteMigrationTask(DeleteMigrationTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The current OpenAPI is not the Nacos-SDK API. For information related to the Nacos-SDK API, please refer to the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNacosConfig  DeleteNacosConfigRequest
     * @return DeleteNacosConfigResponse
     */
    CompletableFuture<DeleteNacosConfigResponse> deleteNacosConfig(DeleteNacosConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The current API operation is not provided in Nacos SDK. For more information about the Nacos-SDK API, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNacosConfigs  DeleteNacosConfigsRequest
     * @return DeleteNacosConfigsResponse
     */
    CompletableFuture<DeleteNacosConfigsResponse> deleteNacosConfigs(DeleteNacosConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNacosInstance  DeleteNacosInstanceRequest
     * @return DeleteNacosInstanceResponse
     */
    CompletableFuture<DeleteNacosInstanceResponse> deleteNacosInstance(DeleteNacosInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNacosService  DeleteNacosServiceRequest
     * @return DeleteNacosServiceResponse
     */
    CompletableFuture<DeleteNacosServiceResponse> deleteNacosService(DeleteNacosServiceRequest request);

    /**
     * @param request the request parameters of DeleteNamespace  DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    /**
     * @param request the request parameters of DeletePluginConfig  DeletePluginConfigRequest
     * @return DeletePluginConfigResponse
     */
    CompletableFuture<DeletePluginConfigResponse> deletePluginConfig(DeletePluginConfigRequest request);

    /**
     * @param request the request parameters of DeleteSecurityGroupRule  DeleteSecurityGroupRuleRequest
     * @return DeleteSecurityGroupRuleResponse
     */
    CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request);

    /**
     * @param request the request parameters of DeleteServiceSource  DeleteServiceSourceRequest
     * @return DeleteServiceSourceResponse
     */
    CompletableFuture<DeleteServiceSourceResponse> deleteServiceSource(DeleteServiceSourceRequest request);

    /**
     * @param request the request parameters of DeleteSwimmingLane  DeleteSwimmingLaneRequest
     * @return DeleteSwimmingLaneResponse
     */
    CompletableFuture<DeleteSwimmingLaneResponse> deleteSwimmingLane(DeleteSwimmingLaneRequest request);

    /**
     * @param request the request parameters of DeleteSwimmingLaneGroup  DeleteSwimmingLaneGroupRequest
     * @return DeleteSwimmingLaneGroupResponse
     */
    CompletableFuture<DeleteSwimmingLaneGroupResponse> deleteSwimmingLaneGroup(DeleteSwimmingLaneGroupRequest request);

    /**
     * @param request the request parameters of DeleteZnode  DeleteZnodeRequest
     * @return DeleteZnodeResponse
     */
    CompletableFuture<DeleteZnodeResponse> deleteZnode(DeleteZnodeRequest request);

    /**
     * @param request the request parameters of EnableHttp2  EnableHttp2Request
     * @return EnableHttp2Response
     */
    CompletableFuture<EnableHttp2Response> enableHttp2(EnableHttp2Request request);

    /**
     * @param request the request parameters of EnableProxyProtocol  EnableProxyProtocolRequest
     * @return EnableProxyProtocolResponse
     */
    CompletableFuture<EnableProxyProtocolResponse> enableProxyProtocol(EnableProxyProtocolRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ExportNacosConfig  ExportNacosConfigRequest
     * @return ExportNacosConfigResponse
     */
    CompletableFuture<ExportNacosConfigResponse> exportNacosConfig(ExportNacosConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Only one task can run at a time.</p>
     * 
     * @param request the request parameters of ExportZookeeperData  ExportZookeeperDataRequest
     * @return ExportZookeeperDataResponse
     */
    CompletableFuture<ExportZookeeperDataResponse> exportZookeeperData(ExportZookeeperDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the rules for graceful start and shutdown.</p>
     * 
     * @param request the request parameters of FetchLosslessRuleList  FetchLosslessRuleListRequest
     * @return FetchLosslessRuleListResponse
     */
    CompletableFuture<FetchLosslessRuleListResponse> fetchLosslessRuleList(FetchLosslessRuleListRequest request);

    /**
     * @param request the request parameters of GatewayBlackWhiteList  GatewayBlackWhiteListRequest
     * @return GatewayBlackWhiteListResponse
     */
    CompletableFuture<GatewayBlackWhiteListResponse> gatewayBlackWhiteList(GatewayBlackWhiteListRequest request);

    /**
     * @param request the request parameters of GetAppMessageQueueRoute  GetAppMessageQueueRouteRequest
     * @return GetAppMessageQueueRouteResponse
     */
    CompletableFuture<GetAppMessageQueueRouteResponse> getAppMessageQueueRoute(GetAppMessageQueueRouteRequest request);

    /**
     * @param request the request parameters of GetApplicationInstanceList  GetApplicationInstanceListRequest
     * @return GetApplicationInstanceListResponse
     */
    CompletableFuture<GetApplicationInstanceListResponse> getApplicationInstanceList(GetApplicationInstanceListRequest request);

    /**
     * @param request the request parameters of GetApplicationList  GetApplicationListRequest
     * @return GetApplicationListResponse
     */
    CompletableFuture<GetApplicationListResponse> getApplicationList(GetApplicationListRequest request);

    /**
     * @deprecated OpenAPI GetBlackWhiteList is deprecated, please use mse::2019-05-31::GatewayBlackWhiteList instead.  * @tags gateway
     * 
     * @param request the request parameters of GetBlackWhiteList  GetBlackWhiteListRequest
     * @return GetBlackWhiteListResponse
     */
    @Deprecated
    CompletableFuture<GetBlackWhiteListResponse> getBlackWhiteList(GetBlackWhiteListRequest request);

    /**
     * @param request the request parameters of GetEngineNamepace  GetEngineNamepaceRequest
     * @return GetEngineNamepaceResponse
     */
    CompletableFuture<GetEngineNamepaceResponse> getEngineNamepace(GetEngineNamepaceRequest request);

    /**
     * @param request the request parameters of GetGateway  GetGatewayRequest
     * @return GetGatewayResponse
     */
    CompletableFuture<GetGatewayResponse> getGateway(GetGatewayRequest request);

    /**
     * @param request the request parameters of GetGatewayAuthConsumerDetail  GetGatewayAuthConsumerDetailRequest
     * @return GetGatewayAuthConsumerDetailResponse
     */
    CompletableFuture<GetGatewayAuthConsumerDetailResponse> getGatewayAuthConsumerDetail(GetGatewayAuthConsumerDetailRequest request);

    /**
     * @param request the request parameters of GetGatewayAuthDetail  GetGatewayAuthDetailRequest
     * @return GetGatewayAuthDetailResponse
     */
    CompletableFuture<GetGatewayAuthDetailResponse> getGatewayAuthDetail(GetGatewayAuthDetailRequest request);

    /**
     * @param request the request parameters of GetGatewayConfig  GetGatewayConfigRequest
     * @return GetGatewayConfigResponse
     */
    CompletableFuture<GetGatewayConfigResponse> getGatewayConfig(GetGatewayConfigRequest request);

    /**
     * @param request the request parameters of GetGatewayDomainDetail  GetGatewayDomainDetailRequest
     * @return GetGatewayDomainDetailResponse
     */
    CompletableFuture<GetGatewayDomainDetailResponse> getGatewayDomainDetail(GetGatewayDomainDetailRequest request);

    /**
     * @param request the request parameters of GetGatewayOption  GetGatewayOptionRequest
     * @return GetGatewayOptionResponse
     */
    CompletableFuture<GetGatewayOptionResponse> getGatewayOption(GetGatewayOptionRequest request);

    /**
     * @param request the request parameters of GetGatewayRouteDetail  GetGatewayRouteDetailRequest
     * @return GetGatewayRouteDetailResponse
     */
    CompletableFuture<GetGatewayRouteDetailResponse> getGatewayRouteDetail(GetGatewayRouteDetailRequest request);

    /**
     * @param request the request parameters of GetGatewayServiceDetail  GetGatewayServiceDetailRequest
     * @return GetGatewayServiceDetailResponse
     */
    CompletableFuture<GetGatewayServiceDetailResponse> getGatewayServiceDetail(GetGatewayServiceDetailRequest request);

    /**
     * @param request the request parameters of GetGovernanceKubernetesCluster  GetGovernanceKubernetesClusterRequest
     * @return GetGovernanceKubernetesClusterResponse
     */
    CompletableFuture<GetGovernanceKubernetesClusterResponse> getGovernanceKubernetesCluster(GetGovernanceKubernetesClusterRequest request);

    /**
     * @param request the request parameters of GetImage  GetImageRequest
     * @return GetImageResponse
     */
    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.\n</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetImportFileUrl  GetImportFileUrlRequest
     * @return GetImportFileUrlResponse
     */
    CompletableFuture<GetImportFileUrlResponse> getImportFileUrl(GetImportFileUrlRequest request);

    /**
     * @param request the request parameters of GetKubernetesSource  GetKubernetesSourceRequest
     * @return GetKubernetesSourceResponse
     */
    CompletableFuture<GetKubernetesSourceResponse> getKubernetesSource(GetKubernetesSourceRequest request);

    /**
     * @param request the request parameters of GetLocalityRule  GetLocalityRuleRequest
     * @return GetLocalityRuleResponse
     */
    CompletableFuture<GetLocalityRuleResponse> getLocalityRule(GetLocalityRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the rules for graceful start and shutdown of an application.
     * You can query the rules for graceful start and shutdown of an application preferentially by using the AppId parameter.
     * If the AppId parameter is left empty, you can use the RegionId, Namespace, and AppName parameters to query the rules for graceful start and shutdown of an application.</p>
     * 
     * @param request the request parameters of GetLosslessRuleByApp  GetLosslessRuleByAppRequest
     * @return GetLosslessRuleByAppResponse
     */
    CompletableFuture<GetLosslessRuleByAppResponse> getLosslessRuleByApp(GetLosslessRuleByAppRequest request);

    /**
     * @param request the request parameters of GetMseFeatureSwitch  GetMseFeatureSwitchRequest
     * @return GetMseFeatureSwitchResponse
     */
    CompletableFuture<GetMseFeatureSwitchResponse> getMseFeatureSwitch(GetMseFeatureSwitchRequest request);

    /**
     * @param request the request parameters of GetMseSource  GetMseSourceRequest
     * @return GetMseSourceResponse
     */
    CompletableFuture<GetMseSourceResponse> getMseSource(GetMseSourceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This OpenAPI is not the Nacos-SDK API. For information related to the Nacos-SDK API, please refer to the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetNacosConfig  GetNacosConfigRequest
     * @return GetNacosConfigResponse
     */
    CompletableFuture<GetNacosConfigResponse> getNacosConfig(GetNacosConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetNacosHistoryConfig  GetNacosHistoryConfigRequest
     * @return GetNacosHistoryConfigResponse
     */
    CompletableFuture<GetNacosHistoryConfigResponse> getNacosHistoryConfig(GetNacosHistoryConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query overview information about service governance.</p>
     * 
     * @param request the request parameters of GetOverview  GetOverviewRequest
     * @return GetOverviewResponse
     */
    CompletableFuture<GetOverviewResponse> getOverview(GetOverviewRequest request);

    /**
     * @param request the request parameters of GetPluginConfig  GetPluginConfigRequest
     * @return GetPluginConfigResponse
     */
    CompletableFuture<GetPluginConfigResponse> getPluginConfig(GetPluginConfigRequest request);

    /**
     * @param request the request parameters of GetPlugins  GetPluginsRequest
     * @return GetPluginsResponse
     */
    CompletableFuture<GetPluginsResponse> getPlugins(GetPluginsRequest request);

    /**
     * @param request the request parameters of GetServiceList  GetServiceListRequest
     * @return GetServiceListResponse
     */
    CompletableFuture<GetServiceListResponse> getServiceList(GetServiceListRequest request);

    /**
     * @param request the request parameters of GetServiceListPage  GetServiceListPageRequest
     * @return GetServiceListPageResponse
     */
    CompletableFuture<GetServiceListPageResponse> getServiceListPage(GetServiceListPageRequest request);

    /**
     * @param request the request parameters of GetServiceListeners  GetServiceListenersRequest
     * @return GetServiceListenersResponse
     */
    CompletableFuture<GetServiceListenersResponse> getServiceListeners(GetServiceListenersRequest request);

    /**
     * @param request the request parameters of GetServiceMethodPage  GetServiceMethodPageRequest
     * @return GetServiceMethodPageResponse
     */
    CompletableFuture<GetServiceMethodPageResponse> getServiceMethodPage(GetServiceMethodPageRequest request);

    /**
     * @param request the request parameters of GetTagsBySwimmingLaneGroupId  GetTagsBySwimmingLaneGroupIdRequest
     * @return GetTagsBySwimmingLaneGroupIdResponse
     */
    CompletableFuture<GetTagsBySwimmingLaneGroupIdResponse> getTagsBySwimmingLaneGroupId(GetTagsBySwimmingLaneGroupIdRequest request);

    /**
     * @param request the request parameters of GetZookeeperDataImportUrl  GetZookeeperDataImportUrlRequest
     * @return GetZookeeperDataImportUrlResponse
     */
    CompletableFuture<GetZookeeperDataImportUrlResponse> getZookeeperDataImportUrl(GetZookeeperDataImportUrlRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ImportNacosConfig  ImportNacosConfigRequest
     * @return ImportNacosConfigResponse
     */
    CompletableFuture<ImportNacosConfigResponse> importNacosConfig(ImportNacosConfigRequest request);

    /**
     * @param request the request parameters of ImportServices  ImportServicesRequest
     * @return ImportServicesResponse
     */
    CompletableFuture<ImportServicesResponse> importServices(ImportServicesRequest request);

    /**
     * <b>description</b> :
     * <p><em>Danger</em>* This operation clears existing data. Exercise caution when you call this API operation.</p>
     * 
     * @param request the request parameters of ImportZookeeperData  ImportZookeeperDataRequest
     * @return ImportZookeeperDataResponse
     */
    CompletableFuture<ImportZookeeperDataResponse> importZookeeperData(ImportZookeeperDataRequest request);

    /**
     * @param request the request parameters of InitializeServiceLinkRole  InitializeServiceLinkRoleRequest
     * @return InitializeServiceLinkRoleResponse
     */
    CompletableFuture<InitializeServiceLinkRoleResponse> initializeServiceLinkRole(InitializeServiceLinkRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAnsInstances  ListAnsInstancesRequest
     * @return ListAnsInstancesResponse
     */
    CompletableFuture<ListAnsInstancesResponse> listAnsInstances(ListAnsInstancesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAnsServiceClusters  ListAnsServiceClustersRequest
     * @return ListAnsServiceClustersResponse
     */
    CompletableFuture<ListAnsServiceClustersResponse> listAnsServiceClusters(ListAnsServiceClustersRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAnsServices  ListAnsServicesRequest
     * @return ListAnsServicesResponse
     */
    CompletableFuture<ListAnsServicesResponse> listAnsServices(ListAnsServicesRequest request);

    /**
     * @deprecated OpenAPI ListAppBySwimmingLaneGroupTag is deprecated, please use mse::2019-05-31::ListAppBySwimmingLaneGroupTags instead.  * @tags msc
     * 
     * @param request the request parameters of ListAppBySwimmingLaneGroupTag  ListAppBySwimmingLaneGroupTagRequest
     * @return ListAppBySwimmingLaneGroupTagResponse
     */
    @Deprecated
    CompletableFuture<ListAppBySwimmingLaneGroupTagResponse> listAppBySwimmingLaneGroupTag(ListAppBySwimmingLaneGroupTagRequest request);

    /**
     * @param request the request parameters of ListAppBySwimmingLaneGroupTags  ListAppBySwimmingLaneGroupTagsRequest
     * @return ListAppBySwimmingLaneGroupTagsResponse
     */
    CompletableFuture<ListAppBySwimmingLaneGroupTagsResponse> listAppBySwimmingLaneGroupTags(ListAppBySwimmingLaneGroupTagsRequest request);

    /**
     * @param request the request parameters of ListApplicationsWithTagRules  ListApplicationsWithTagRulesRequest
     * @return ListApplicationsWithTagRulesResponse
     */
    CompletableFuture<ListApplicationsWithTagRulesResponse> listApplicationsWithTagRules(ListApplicationsWithTagRulesRequest request);

    /**
     * @param request the request parameters of ListAuthPolicy  ListAuthPolicyRequest
     * @return ListAuthPolicyResponse
     */
    CompletableFuture<ListAuthPolicyResponse> listAuthPolicy(ListAuthPolicyRequest request);

    /**
     * @param request the request parameters of ListCircuitBreakerRules  ListCircuitBreakerRulesRequest
     * @return ListCircuitBreakerRulesResponse
     */
    CompletableFuture<ListCircuitBreakerRulesResponse> listCircuitBreakerRules(ListCircuitBreakerRulesRequest request);

    /**
     * @param request the request parameters of ListClusterConnectionTypes  ListClusterConnectionTypesRequest
     * @return ListClusterConnectionTypesResponse
     */
    CompletableFuture<ListClusterConnectionTypesResponse> listClusterConnectionTypes(ListClusterConnectionTypesRequest request);

    /**
     * @param request the request parameters of ListClusterHealthCheckTask  ListClusterHealthCheckTaskRequest
     * @return ListClusterHealthCheckTaskResponse
     */
    CompletableFuture<ListClusterHealthCheckTaskResponse> listClusterHealthCheckTask(ListClusterHealthCheckTaskRequest request);

    /**
     * @param request the request parameters of ListClusterTypes  ListClusterTypesRequest
     * @return ListClusterTypesResponse
     */
    CompletableFuture<ListClusterTypesResponse> listClusterTypes(ListClusterTypesRequest request);

    /**
     * @param request the request parameters of ListClusterVersions  ListClusterVersionsRequest
     * @return ListClusterVersionsResponse
     */
    CompletableFuture<ListClusterVersionsResponse> listClusterVersions(ListClusterVersionsRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * @param request the request parameters of ListConfigTrack  ListConfigTrackRequest
     * @return ListConfigTrackResponse
     */
    CompletableFuture<ListConfigTrackResponse> listConfigTrack(ListConfigTrackRequest request);

    /**
     * @param request the request parameters of ListEngineNamespaces  ListEngineNamespacesRequest
     * @return ListEngineNamespacesResponse
     */
    CompletableFuture<ListEngineNamespacesResponse> listEngineNamespaces(ListEngineNamespacesRequest request);

    /**
     * @param request the request parameters of ListEurekaInstances  ListEurekaInstancesRequest
     * @return ListEurekaInstancesResponse
     */
    CompletableFuture<ListEurekaInstancesResponse> listEurekaInstances(ListEurekaInstancesRequest request);

    /**
     * @param request the request parameters of ListEurekaServices  ListEurekaServicesRequest
     * @return ListEurekaServicesResponse
     */
    CompletableFuture<ListEurekaServicesResponse> listEurekaServices(ListEurekaServicesRequest request);

    /**
     * @param request the request parameters of ListExportZookeeperData  ListExportZookeeperDataRequest
     * @return ListExportZookeeperDataResponse
     */
    CompletableFuture<ListExportZookeeperDataResponse> listExportZookeeperData(ListExportZookeeperDataRequest request);

    /**
     * @param request the request parameters of ListFlowRules  ListFlowRulesRequest
     * @return ListFlowRulesResponse
     */
    CompletableFuture<ListFlowRulesResponse> listFlowRules(ListFlowRulesRequest request);

    /**
     * @param request the request parameters of ListGateway  ListGatewayRequest
     * @return ListGatewayResponse
     */
    CompletableFuture<ListGatewayResponse> listGateway(ListGatewayRequest request);

    /**
     * @param request the request parameters of ListGatewayAuthConsumer  ListGatewayAuthConsumerRequest
     * @return ListGatewayAuthConsumerResponse
     */
    CompletableFuture<ListGatewayAuthConsumerResponse> listGatewayAuthConsumer(ListGatewayAuthConsumerRequest request);

    /**
     * @param request the request parameters of ListGatewayAuthConsumerResource  ListGatewayAuthConsumerResourceRequest
     * @return ListGatewayAuthConsumerResourceResponse
     */
    CompletableFuture<ListGatewayAuthConsumerResourceResponse> listGatewayAuthConsumerResource(ListGatewayAuthConsumerResourceRequest request);

    /**
     * @param request the request parameters of ListGatewayCircuitBreakerRule  ListGatewayCircuitBreakerRuleRequest
     * @return ListGatewayCircuitBreakerRuleResponse
     */
    CompletableFuture<ListGatewayCircuitBreakerRuleResponse> listGatewayCircuitBreakerRule(ListGatewayCircuitBreakerRuleRequest request);

    /**
     * @param request the request parameters of ListGatewayDomain  ListGatewayDomainRequest
     * @return ListGatewayDomainResponse
     */
    CompletableFuture<ListGatewayDomainResponse> listGatewayDomain(ListGatewayDomainRequest request);

    /**
     * @param request the request parameters of ListGatewayFlowRule  ListGatewayFlowRuleRequest
     * @return ListGatewayFlowRuleResponse
     */
    CompletableFuture<ListGatewayFlowRuleResponse> listGatewayFlowRule(ListGatewayFlowRuleRequest request);

    /**
     * @param request the request parameters of ListGatewayIsolationRule  ListGatewayIsolationRuleRequest
     * @return ListGatewayIsolationRuleResponse
     */
    CompletableFuture<ListGatewayIsolationRuleResponse> listGatewayIsolationRule(ListGatewayIsolationRuleRequest request);

    /**
     * @param request the request parameters of ListGatewayRoute  ListGatewayRouteRequest
     * @return ListGatewayRouteResponse
     */
    CompletableFuture<ListGatewayRouteResponse> listGatewayRoute(ListGatewayRouteRequest request);

    /**
     * @param request the request parameters of ListGatewayRouteOnAuth  ListGatewayRouteOnAuthRequest
     * @return ListGatewayRouteOnAuthResponse
     */
    CompletableFuture<ListGatewayRouteOnAuthResponse> listGatewayRouteOnAuth(ListGatewayRouteOnAuthRequest request);

    /**
     * @param request the request parameters of ListGatewayService  ListGatewayServiceRequest
     * @return ListGatewayServiceResponse
     */
    CompletableFuture<ListGatewayServiceResponse> listGatewayService(ListGatewayServiceRequest request);

    /**
     * @param request the request parameters of ListGatewaySlb  ListGatewaySlbRequest
     * @return ListGatewaySlbResponse
     */
    CompletableFuture<ListGatewaySlbResponse> listGatewaySlb(ListGatewaySlbRequest request);

    /**
     * @param request the request parameters of ListGatewayZone  ListGatewayZoneRequest
     * @return ListGatewayZoneResponse
     */
    CompletableFuture<ListGatewayZoneResponse> listGatewayZone(ListGatewayZoneRequest request);

    /**
     * @param request the request parameters of ListInstanceCount  ListInstanceCountRequest
     * @return ListInstanceCountResponse
     */
    CompletableFuture<ListInstanceCountResponse> listInstanceCount(ListInstanceCountRequest request);

    /**
     * @param request the request parameters of ListIsolationRules  ListIsolationRulesRequest
     * @return ListIsolationRulesResponse
     */
    CompletableFuture<ListIsolationRulesResponse> listIsolationRules(ListIsolationRulesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListListenersByConfig  ListListenersByConfigRequest
     * @return ListListenersByConfigResponse
     */
    CompletableFuture<ListListenersByConfigResponse> listListenersByConfig(ListListenersByConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListListenersByIp  ListListenersByIpRequest
     * @return ListListenersByIpResponse
     */
    CompletableFuture<ListListenersByIpResponse> listListenersByIp(ListListenersByIpRequest request);

    /**
     * @param request the request parameters of ListMigrationTask  ListMigrationTaskRequest
     * @return ListMigrationTaskResponse
     */
    CompletableFuture<ListMigrationTaskResponse> listMigrationTask(ListMigrationTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListNacosConfigs  ListNacosConfigsRequest
     * @return ListNacosConfigsResponse
     */
    CompletableFuture<ListNacosConfigsResponse> listNacosConfigs(ListNacosConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListNacosHistoryConfigs  ListNacosHistoryConfigsRequest
     * @return ListNacosHistoryConfigsResponse
     */
    CompletableFuture<ListNacosHistoryConfigsResponse> listNacosHistoryConfigs(ListNacosHistoryConfigsRequest request);

    /**
     * @param request the request parameters of ListNamespaces  ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    /**
     * @param request the request parameters of ListNamingTrack  ListNamingTrackRequest
     * @return ListNamingTrackResponse
     */
    CompletableFuture<ListNamingTrackResponse> listNamingTrack(ListNamingTrackRequest request);

    /**
     * @param request the request parameters of ListSSLCert  ListSSLCertRequest
     * @return ListSSLCertResponse
     */
    CompletableFuture<ListSSLCertResponse> listSSLCert(ListSSLCertRequest request);

    /**
     * @param request the request parameters of ListSecurityGroup  ListSecurityGroupRequest
     * @return ListSecurityGroupResponse
     */
    CompletableFuture<ListSecurityGroupResponse> listSecurityGroup(ListSecurityGroupRequest request);

    /**
     * @param request the request parameters of ListSecurityGroupRule  ListSecurityGroupRuleRequest
     * @return ListSecurityGroupRuleResponse
     */
    CompletableFuture<ListSecurityGroupRuleResponse> listSecurityGroupRule(ListSecurityGroupRuleRequest request);

    /**
     * @param request the request parameters of ListSentinelBlockFallbackDefinitions  ListSentinelBlockFallbackDefinitionsRequest
     * @return ListSentinelBlockFallbackDefinitionsResponse
     */
    CompletableFuture<ListSentinelBlockFallbackDefinitionsResponse> listSentinelBlockFallbackDefinitions(ListSentinelBlockFallbackDefinitionsRequest request);

    /**
     * @param request the request parameters of ListServiceSource  ListServiceSourceRequest
     * @return ListServiceSourceResponse
     */
    CompletableFuture<ListServiceSourceResponse> listServiceSource(ListServiceSourceRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListZkTrack  ListZkTrackRequest
     * @return ListZkTrackResponse
     */
    CompletableFuture<ListZkTrackResponse> listZkTrack(ListZkTrackRequest request);

    /**
     * @param request the request parameters of ListZnodeChildren  ListZnodeChildrenRequest
     * @return ListZnodeChildrenResponse
     */
    CompletableFuture<ListZnodeChildrenResponse> listZnodeChildren(ListZnodeChildrenRequest request);

    /**
     * @param request the request parameters of ModifyGovernanceKubernetesCluster  ModifyGovernanceKubernetesClusterRequest
     * @return ModifyGovernanceKubernetesClusterResponse
     */
    CompletableFuture<ModifyGovernanceKubernetesClusterResponse> modifyGovernanceKubernetesCluster(ModifyGovernanceKubernetesClusterRequest request);

    /**
     * @param request the request parameters of ModifyLosslessRule  ModifyLosslessRuleRequest
     * @return ModifyLosslessRuleResponse
     */
    CompletableFuture<ModifyLosslessRuleResponse> modifyLosslessRule(ModifyLosslessRuleRequest request);

    /**
     * @param request the request parameters of OfflineGatewayRoute  OfflineGatewayRouteRequest
     * @return OfflineGatewayRouteResponse
     */
    CompletableFuture<OfflineGatewayRouteResponse> offlineGatewayRoute(OfflineGatewayRouteRequest request);

    /**
     * @param request the request parameters of OrderClusterHealthCheckRiskNotice  OrderClusterHealthCheckRiskNoticeRequest
     * @return OrderClusterHealthCheckRiskNoticeResponse
     */
    CompletableFuture<OrderClusterHealthCheckRiskNoticeResponse> orderClusterHealthCheckRiskNotice(OrderClusterHealthCheckRiskNoticeRequest request);

    /**
     * @param request the request parameters of PreserveHeaderFormat  PreserveHeaderFormatRequest
     * @return PreserveHeaderFormatResponse
     */
    CompletableFuture<PreserveHeaderFormatResponse> preserveHeaderFormat(PreserveHeaderFormatRequest request);

    /**
     * @param request the request parameters of PullServices  PullServicesRequest
     * @return PullServicesResponse
     */
    CompletableFuture<PullServicesResponse> pullServices(PullServicesRequest request);

    /**
     * @param request the request parameters of PutClusterHealthCheckTask  PutClusterHealthCheckTaskRequest
     * @return PutClusterHealthCheckTaskResponse
     */
    CompletableFuture<PutClusterHealthCheckTaskResponse> putClusterHealthCheckTask(PutClusterHealthCheckTaskRequest request);

    /**
     * @param request the request parameters of QueryAllSwimmingLane  QueryAllSwimmingLaneRequest
     * @return QueryAllSwimmingLaneResponse
     */
    CompletableFuture<QueryAllSwimmingLaneResponse> queryAllSwimmingLane(QueryAllSwimmingLaneRequest request);

    /**
     * @param request the request parameters of QueryAllSwimmingLaneGroup  QueryAllSwimmingLaneGroupRequest
     * @return QueryAllSwimmingLaneGroupResponse
     */
    CompletableFuture<QueryAllSwimmingLaneGroupResponse> queryAllSwimmingLaneGroup(QueryAllSwimmingLaneGroupRequest request);

    /**
     * @param request the request parameters of QueryBusinessLocations  QueryBusinessLocationsRequest
     * @return QueryBusinessLocationsResponse
     */
    CompletableFuture<QueryBusinessLocationsResponse> queryBusinessLocations(QueryBusinessLocationsRequest request);

    /**
     * @param request the request parameters of QueryClusterDetail  QueryClusterDetailRequest
     * @return QueryClusterDetailResponse
     */
    CompletableFuture<QueryClusterDetailResponse> queryClusterDetail(QueryClusterDetailRequest request);

    /**
     * @param request the request parameters of QueryClusterDiskSpecification  QueryClusterDiskSpecificationRequest
     * @return QueryClusterDiskSpecificationResponse
     */
    CompletableFuture<QueryClusterDiskSpecificationResponse> queryClusterDiskSpecification(QueryClusterDiskSpecificationRequest request);

    /**
     * @param request the request parameters of QueryClusterInfo  QueryClusterInfoRequest
     * @return QueryClusterInfoResponse
     */
    CompletableFuture<QueryClusterInfoResponse> queryClusterInfo(QueryClusterInfoRequest request);

    /**
     * @param request the request parameters of QueryClusterSpecification  QueryClusterSpecificationRequest
     * @return QueryClusterSpecificationResponse
     */
    CompletableFuture<QueryClusterSpecificationResponse> queryClusterSpecification(QueryClusterSpecificationRequest request);

    /**
     * @param request the request parameters of QueryConfig  QueryConfigRequest
     * @return QueryConfigResponse
     */
    CompletableFuture<QueryConfigResponse> queryConfig(QueryConfigRequest request);

    /**
     * @param request the request parameters of QueryGatewayRegion  QueryGatewayRegionRequest
     * @return QueryGatewayRegionResponse
     */
    CompletableFuture<QueryGatewayRegionResponse> queryGatewayRegion(QueryGatewayRegionRequest request);

    /**
     * @param request the request parameters of QueryGatewayType  QueryGatewayTypeRequest
     * @return QueryGatewayTypeResponse
     */
    CompletableFuture<QueryGatewayTypeResponse> queryGatewayType(QueryGatewayTypeRequest request);

    /**
     * @param request the request parameters of QueryGovernanceKubernetesCluster  QueryGovernanceKubernetesClusterRequest
     * @return QueryGovernanceKubernetesClusterResponse
     */
    CompletableFuture<QueryGovernanceKubernetesClusterResponse> queryGovernanceKubernetesCluster(QueryGovernanceKubernetesClusterRequest request);

    /**
     * @param request the request parameters of QueryInstancesInfo  QueryInstancesInfoRequest
     * @return QueryInstancesInfoResponse
     */
    CompletableFuture<QueryInstancesInfoResponse> queryInstancesInfo(QueryInstancesInfoRequest request);

    /**
     * @param request the request parameters of QueryMonitor  QueryMonitorRequest
     * @return QueryMonitorResponse
     */
    CompletableFuture<QueryMonitorResponse> queryMonitor(QueryMonitorRequest request);

    /**
     * @param request the request parameters of QueryNamespace  QueryNamespaceRequest
     * @return QueryNamespaceResponse
     */
    CompletableFuture<QueryNamespaceResponse> queryNamespace(QueryNamespaceRequest request);

    /**
     * @param request the request parameters of QuerySlbSpec  QuerySlbSpecRequest
     * @return QuerySlbSpecResponse
     */
    CompletableFuture<QuerySlbSpecResponse> querySlbSpec(QuerySlbSpecRequest request);

    /**
     * @param request the request parameters of QuerySwimmingLaneById  QuerySwimmingLaneByIdRequest
     * @return QuerySwimmingLaneByIdResponse
     */
    CompletableFuture<QuerySwimmingLaneByIdResponse> querySwimmingLaneById(QuerySwimmingLaneByIdRequest request);

    /**
     * @param request the request parameters of QueryZnodeDetail  QueryZnodeDetailRequest
     * @return QueryZnodeDetailResponse
     */
    CompletableFuture<QueryZnodeDetailResponse> queryZnodeDetail(QueryZnodeDetailRequest request);

    /**
     * @param request the request parameters of RemoveApplication  RemoveApplicationRequest
     * @return RemoveApplicationResponse
     */
    CompletableFuture<RemoveApplicationResponse> removeApplication(RemoveApplicationRequest request);

    /**
     * @param request the request parameters of RemoveAuthPolicy  RemoveAuthPolicyRequest
     * @return RemoveAuthPolicyResponse
     */
    CompletableFuture<RemoveAuthPolicyResponse> removeAuthPolicy(RemoveAuthPolicyRequest request);

    /**
     * @param request the request parameters of RestartCluster  RestartClusterRequest
     * @return RestartClusterResponse
     */
    CompletableFuture<RestartClusterResponse> restartCluster(RestartClusterRequest request);

    /**
     * @param request the request parameters of RetryCluster  RetryClusterRequest
     * @return RetryClusterResponse
     */
    CompletableFuture<RetryClusterResponse> retryCluster(RetryClusterRequest request);

    /**
     * @param request the request parameters of SelectGatewaySlb  SelectGatewaySlbRequest
     * @return SelectGatewaySlbResponse
     */
    CompletableFuture<SelectGatewaySlbResponse> selectGatewaySlb(SelectGatewaySlbRequest request);

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
     * @param request the request parameters of UpdateAcl  UpdateAclRequest
     * @return UpdateAclResponse
     */
    CompletableFuture<UpdateAclResponse> updateAcl(UpdateAclRequest request);

    /**
     * @param request the request parameters of UpdateAuthPolicy  UpdateAuthPolicyRequest
     * @return UpdateAuthPolicyResponse
     */
    CompletableFuture<UpdateAuthPolicyResponse> updateAuthPolicy(UpdateAuthPolicyRequest request);

    /**
     * @param request the request parameters of UpdateBlackWhiteList  UpdateBlackWhiteListRequest
     * @return UpdateBlackWhiteListResponse
     */
    CompletableFuture<UpdateBlackWhiteListResponse> updateBlackWhiteList(UpdateBlackWhiteListRequest request);

    /**
     * @param request the request parameters of UpdateCircuitBreakerRule  UpdateCircuitBreakerRuleRequest
     * @return UpdateCircuitBreakerRuleResponse
     */
    CompletableFuture<UpdateCircuitBreakerRuleResponse> updateCircuitBreakerRule(UpdateCircuitBreakerRuleRequest request);

    /**
     * @param request the request parameters of UpdateCluster  UpdateClusterRequest
     * @return UpdateClusterResponse
     */
    CompletableFuture<UpdateClusterResponse> updateCluster(UpdateClusterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the number or specifications of nodes in a pay-as-you-go MSE instance. You are charged when you add nodes or upgrade node specifications. For more information, see [Pricing] (<code>~~1806469~~</code>).</p>
     * 
     * @param request the request parameters of UpdateClusterSpec  UpdateClusterSpecRequest
     * @return UpdateClusterSpecResponse
     */
    CompletableFuture<UpdateClusterSpecResponse> updateClusterSpec(UpdateClusterSpecRequest request);

    /**
     * @param request the request parameters of UpdateConfig  UpdateConfigRequest
     * @return UpdateConfigResponse
     */
    CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request);

    /**
     * @param request the request parameters of UpdateEngineNamespace  UpdateEngineNamespaceRequest
     * @return UpdateEngineNamespaceResponse
     */
    CompletableFuture<UpdateEngineNamespaceResponse> updateEngineNamespace(UpdateEngineNamespaceRequest request);

    /**
     * @param request the request parameters of UpdateFlowRule  UpdateFlowRuleRequest
     * @return UpdateFlowRuleResponse
     */
    CompletableFuture<UpdateFlowRuleResponse> updateFlowRule(UpdateFlowRuleRequest request);

    /**
     * @param request the request parameters of UpdateGatewayAuthConsumer  UpdateGatewayAuthConsumerRequest
     * @return UpdateGatewayAuthConsumerResponse
     */
    CompletableFuture<UpdateGatewayAuthConsumerResponse> updateGatewayAuthConsumer(UpdateGatewayAuthConsumerRequest request);

    /**
     * @param request the request parameters of UpdateGatewayAuthConsumerResource  UpdateGatewayAuthConsumerResourceRequest
     * @return UpdateGatewayAuthConsumerResourceResponse
     */
    CompletableFuture<UpdateGatewayAuthConsumerResourceResponse> updateGatewayAuthConsumerResource(UpdateGatewayAuthConsumerResourceRequest request);

    /**
     * @param request the request parameters of UpdateGatewayAuthConsumerResourceStatus  UpdateGatewayAuthConsumerResourceStatusRequest
     * @return UpdateGatewayAuthConsumerResourceStatusResponse
     */
    CompletableFuture<UpdateGatewayAuthConsumerResourceStatusResponse> updateGatewayAuthConsumerResourceStatus(UpdateGatewayAuthConsumerResourceStatusRequest request);

    /**
     * @param request the request parameters of UpdateGatewayAuthConsumerStatus  UpdateGatewayAuthConsumerStatusRequest
     * @return UpdateGatewayAuthConsumerStatusResponse
     */
    CompletableFuture<UpdateGatewayAuthConsumerStatusResponse> updateGatewayAuthConsumerStatus(UpdateGatewayAuthConsumerStatusRequest request);

    /**
     * @param request the request parameters of UpdateGatewayCircuitBreakerRule  UpdateGatewayCircuitBreakerRuleRequest
     * @return UpdateGatewayCircuitBreakerRuleResponse
     */
    CompletableFuture<UpdateGatewayCircuitBreakerRuleResponse> updateGatewayCircuitBreakerRule(UpdateGatewayCircuitBreakerRuleRequest request);

    /**
     * @param request the request parameters of UpdateGatewayConfig  UpdateGatewayConfigRequest
     * @return UpdateGatewayConfigResponse
     */
    CompletableFuture<UpdateGatewayConfigResponse> updateGatewayConfig(UpdateGatewayConfigRequest request);

    /**
     * @param request the request parameters of UpdateGatewayDomain  UpdateGatewayDomainRequest
     * @return UpdateGatewayDomainResponse
     */
    CompletableFuture<UpdateGatewayDomainResponse> updateGatewayDomain(UpdateGatewayDomainRequest request);

    /**
     * @param request the request parameters of UpdateGatewayFlowRule  UpdateGatewayFlowRuleRequest
     * @return UpdateGatewayFlowRuleResponse
     */
    CompletableFuture<UpdateGatewayFlowRuleResponse> updateGatewayFlowRule(UpdateGatewayFlowRuleRequest request);

    /**
     * @param request the request parameters of UpdateGatewayIsolationRule  UpdateGatewayIsolationRuleRequest
     * @return UpdateGatewayIsolationRuleResponse
     */
    CompletableFuture<UpdateGatewayIsolationRuleResponse> updateGatewayIsolationRule(UpdateGatewayIsolationRuleRequest request);

    /**
     * @param request the request parameters of UpdateGatewayName  UpdateGatewayNameRequest
     * @return UpdateGatewayNameResponse
     */
    CompletableFuture<UpdateGatewayNameResponse> updateGatewayName(UpdateGatewayNameRequest request);

    /**
     * @param request the request parameters of UpdateGatewayOption  UpdateGatewayOptionRequest
     * @return UpdateGatewayOptionResponse
     */
    CompletableFuture<UpdateGatewayOptionResponse> updateGatewayOption(UpdateGatewayOptionRequest request);

    /**
     * @param request the request parameters of UpdateGatewayRoute  UpdateGatewayRouteRequest
     * @return UpdateGatewayRouteResponse
     */
    CompletableFuture<UpdateGatewayRouteResponse> updateGatewayRoute(UpdateGatewayRouteRequest request);

    /**
     * @param request the request parameters of UpdateGatewayRouteAuth  UpdateGatewayRouteAuthRequest
     * @return UpdateGatewayRouteAuthResponse
     */
    CompletableFuture<UpdateGatewayRouteAuthResponse> updateGatewayRouteAuth(UpdateGatewayRouteAuthRequest request);

    /**
     * @param request the request parameters of UpdateGatewayRouteCORS  UpdateGatewayRouteCORSRequest
     * @return UpdateGatewayRouteCORSResponse
     */
    CompletableFuture<UpdateGatewayRouteCORSResponse> updateGatewayRouteCORS(UpdateGatewayRouteCORSRequest request);

    /**
     * @param request the request parameters of UpdateGatewayRouteHTTPRewrite  UpdateGatewayRouteHTTPRewriteRequest
     * @return UpdateGatewayRouteHTTPRewriteResponse
     */
    CompletableFuture<UpdateGatewayRouteHTTPRewriteResponse> updateGatewayRouteHTTPRewrite(UpdateGatewayRouteHTTPRewriteRequest request);

    /**
     * @param request the request parameters of UpdateGatewayRouteHeaderOp  UpdateGatewayRouteHeaderOpRequest
     * @return UpdateGatewayRouteHeaderOpResponse
     */
    CompletableFuture<UpdateGatewayRouteHeaderOpResponse> updateGatewayRouteHeaderOp(UpdateGatewayRouteHeaderOpRequest request);

    /**
     * @param request the request parameters of UpdateGatewayRouteRetry  UpdateGatewayRouteRetryRequest
     * @return UpdateGatewayRouteRetryResponse
     */
    CompletableFuture<UpdateGatewayRouteRetryResponse> updateGatewayRouteRetry(UpdateGatewayRouteRetryRequest request);

    /**
     * @param request the request parameters of UpdateGatewayRouteTimeout  UpdateGatewayRouteTimeoutRequest
     * @return UpdateGatewayRouteTimeoutResponse
     */
    CompletableFuture<UpdateGatewayRouteTimeoutResponse> updateGatewayRouteTimeout(UpdateGatewayRouteTimeoutRequest request);

    /**
     * @param request the request parameters of UpdateGatewayRouteWafStatus  UpdateGatewayRouteWafStatusRequest
     * @return UpdateGatewayRouteWafStatusResponse
     */
    CompletableFuture<UpdateGatewayRouteWafStatusResponse> updateGatewayRouteWafStatus(UpdateGatewayRouteWafStatusRequest request);

    /**
     * @param request the request parameters of UpdateGatewayService  UpdateGatewayServiceRequest
     * @return UpdateGatewayServiceResponse
     */
    CompletableFuture<UpdateGatewayServiceResponse> updateGatewayService(UpdateGatewayServiceRequest request);

    /**
     * @param request the request parameters of UpdateGatewayServiceCheck  UpdateGatewayServiceCheckRequest
     * @return UpdateGatewayServiceCheckResponse
     */
    CompletableFuture<UpdateGatewayServiceCheckResponse> updateGatewayServiceCheck(UpdateGatewayServiceCheckRequest request);

    /**
     * @param request the request parameters of UpdateGatewayServiceTrafficPolicy  UpdateGatewayServiceTrafficPolicyRequest
     * @return UpdateGatewayServiceTrafficPolicyResponse
     */
    CompletableFuture<UpdateGatewayServiceTrafficPolicyResponse> updateGatewayServiceTrafficPolicy(UpdateGatewayServiceTrafficPolicyRequest request);

    /**
     * @param request the request parameters of UpdateGatewayServiceVersion  UpdateGatewayServiceVersionRequest
     * @return UpdateGatewayServiceVersionResponse
     */
    CompletableFuture<UpdateGatewayServiceVersionResponse> updateGatewayServiceVersion(UpdateGatewayServiceVersionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the number of nodes or the specifications of nodes in a pay-as-you-go or subscription cloud-native gateway. If you add nodes or increase the specifications, you will incur fees. For more information, see <a href="https://help.aliyun.com/document_detail/250950.html">Pricing</a>.</p>
     * 
     * @param request the request parameters of UpdateGatewaySpec  UpdateGatewaySpecRequest
     * @return UpdateGatewaySpecResponse
     */
    CompletableFuture<UpdateGatewaySpecResponse> updateGatewaySpec(UpdateGatewaySpecRequest request);

    /**
     * @param request the request parameters of UpdateImage  UpdateImageRequest
     * @return UpdateImageResponse
     */
    CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request);

    /**
     * @param request the request parameters of UpdateIsolationRule  UpdateIsolationRuleRequest
     * @return UpdateIsolationRuleResponse
     */
    CompletableFuture<UpdateIsolationRuleResponse> updateIsolationRule(UpdateIsolationRuleRequest request);

    /**
     * @param request the request parameters of UpdateLocalityRule  UpdateLocalityRuleRequest
     * @return UpdateLocalityRuleResponse
     */
    CompletableFuture<UpdateLocalityRuleResponse> updateLocalityRule(UpdateLocalityRuleRequest request);

    /**
     * @param request the request parameters of UpdateMessageQueueRoute  UpdateMessageQueueRouteRequest
     * @return UpdateMessageQueueRouteResponse
     */
    CompletableFuture<UpdateMessageQueueRouteResponse> updateMessageQueueRoute(UpdateMessageQueueRouteRequest request);

    /**
     * @param request the request parameters of UpdateMigrationTask  UpdateMigrationTaskRequest
     * @return UpdateMigrationTaskResponse
     */
    CompletableFuture<UpdateMigrationTaskResponse> updateMigrationTask(UpdateMigrationTaskRequest request);

    /**
     * @param request the request parameters of UpdateNacosCluster  UpdateNacosClusterRequest
     * @return UpdateNacosClusterResponse
     */
    CompletableFuture<UpdateNacosClusterResponse> updateNacosCluster(UpdateNacosClusterRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The current API operation is not provided in Nacos SDK. For more information about Nacos SDK, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateNacosConfig  UpdateNacosConfigRequest
     * @return UpdateNacosConfigResponse
     */
    CompletableFuture<UpdateNacosConfigResponse> updateNacosConfig(UpdateNacosConfigRequest request);

    /**
     * @param request the request parameters of UpdateNacosGrayConfig  UpdateNacosGrayConfigRequest
     * @return UpdateNacosGrayConfigResponse
     */
    CompletableFuture<UpdateNacosGrayConfigResponse> updateNacosGrayConfig(UpdateNacosGrayConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateNacosInstance  UpdateNacosInstanceRequest
     * @return UpdateNacosInstanceResponse
     */
    CompletableFuture<UpdateNacosInstanceResponse> updateNacosInstance(UpdateNacosInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the <a href="https://nacos.io/zh-cn/docs/sdk.html">official documentation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateNacosService  UpdateNacosServiceRequest
     * @return UpdateNacosServiceResponse
     */
    CompletableFuture<UpdateNacosServiceResponse> updateNacosService(UpdateNacosServiceRequest request);

    /**
     * @param request the request parameters of UpdatePluginConfig  UpdatePluginConfigRequest
     * @return UpdatePluginConfigResponse
     */
    CompletableFuture<UpdatePluginConfigResponse> updatePluginConfig(UpdatePluginConfigRequest request);

    /**
     * @param request the request parameters of UpdateSSLCert  UpdateSSLCertRequest
     * @return UpdateSSLCertResponse
     */
    CompletableFuture<UpdateSSLCertResponse> updateSSLCert(UpdateSSLCertRequest request);

    /**
     * @param request the request parameters of UpdateServiceSource  UpdateServiceSourceRequest
     * @return UpdateServiceSourceResponse
     */
    CompletableFuture<UpdateServiceSourceResponse> updateServiceSource(UpdateServiceSourceRequest request);

    /**
     * @param request the request parameters of UpdateZnode  UpdateZnodeRequest
     * @return UpdateZnodeResponse
     */
    CompletableFuture<UpdateZnodeResponse> updateZnode(UpdateZnodeRequest request);

    /**
     * @param request the request parameters of UpgradeCluster  UpgradeClusterRequest
     * @return UpgradeClusterResponse
     */
    CompletableFuture<UpgradeClusterResponse> upgradeCluster(UpgradeClusterRequest request);

}
