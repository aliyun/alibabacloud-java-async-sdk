// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.apig20240327.models.*;
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
     * @param request the request parameters of AddGatewaySecurityGroupRule  AddGatewaySecurityGroupRuleRequest
     * @return AddGatewaySecurityGroupRuleResponse
     */
    CompletableFuture<AddGatewaySecurityGroupRuleResponse> addGatewaySecurityGroupRule(AddGatewaySecurityGroupRuleRequest request);

    /**
     * @param request the request parameters of BatchDeleteConsumerAuthorizationRule  BatchDeleteConsumerAuthorizationRuleRequest
     * @return BatchDeleteConsumerAuthorizationRuleResponse
     */
    CompletableFuture<BatchDeleteConsumerAuthorizationRuleResponse> batchDeleteConsumerAuthorizationRule(BatchDeleteConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateAndAttachPolicy  CreateAndAttachPolicyRequest
     * @return CreateAndAttachPolicyResponse
     */
    CompletableFuture<CreateAndAttachPolicyResponse> createAndAttachPolicy(CreateAndAttachPolicyRequest request);

    /**
     * @param request the request parameters of CreateConsumer  CreateConsumerRequest
     * @return CreateConsumerResponse
     */
    CompletableFuture<CreateConsumerResponse> createConsumer(CreateConsumerRequest request);

    /**
     * @param request the request parameters of CreateConsumerAuthorizationRule  CreateConsumerAuthorizationRuleRequest
     * @return CreateConsumerAuthorizationRuleResponse
     */
    CompletableFuture<CreateConsumerAuthorizationRuleResponse> createConsumerAuthorizationRule(CreateConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of CreateConsumerAuthorizationRules  CreateConsumerAuthorizationRulesRequest
     * @return CreateConsumerAuthorizationRulesResponse
     */
    CompletableFuture<CreateConsumerAuthorizationRulesResponse> createConsumerAuthorizationRules(CreateConsumerAuthorizationRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Create Domain.</p>
     * 
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * @deprecated OpenAPI CreateEnvironment is deprecated  * @description Create environment.
     * 
     * @param request the request parameters of CreateEnvironment  CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    @Deprecated
    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    /**
     * @param request the request parameters of CreateGateway  CreateGatewayRequest
     * @return CreateGatewayResponse
     */
    CompletableFuture<CreateGatewayResponse> createGateway(CreateGatewayRequest request);

    /**
     * @param request the request parameters of CreateHttpApi  CreateHttpApiRequest
     * @return CreateHttpApiResponse
     */
    CompletableFuture<CreateHttpApiResponse> createHttpApi(CreateHttpApiRequest request);

    /**
     * @param request the request parameters of CreateHttpApiOperation  CreateHttpApiOperationRequest
     * @return CreateHttpApiOperationResponse
     */
    CompletableFuture<CreateHttpApiOperationResponse> createHttpApiOperation(CreateHttpApiOperationRequest request);

    /**
     * @param request the request parameters of CreateHttpApiRoute  CreateHttpApiRouteRequest
     * @return CreateHttpApiRouteResponse
     */
    CompletableFuture<CreateHttpApiRouteResponse> createHttpApiRoute(CreateHttpApiRouteRequest request);

    /**
     * @param request the request parameters of CreateMcpServer  CreateMcpServerRequest
     * @return CreateMcpServerResponse
     */
    CompletableFuture<CreateMcpServerResponse> createMcpServer(CreateMcpServerRequest request);

    /**
     * @param request the request parameters of CreatePluginAttachment  CreatePluginAttachmentRequest
     * @return CreatePluginAttachmentResponse
     */
    CompletableFuture<CreatePluginAttachmentResponse> createPluginAttachment(CreatePluginAttachmentRequest request);

    /**
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * @param request the request parameters of CreatePolicyAttachment  CreatePolicyAttachmentRequest
     * @return CreatePolicyAttachmentResponse
     */
    CompletableFuture<CreatePolicyAttachmentResponse> createPolicyAttachment(CreatePolicyAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * @param request the request parameters of CreateService  CreateServiceRequest
     * @return CreateServiceResponse
     */
    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    /**
     * @param request the request parameters of DeleteConsumer  DeleteConsumerRequest
     * @return DeleteConsumerResponse
     */
    CompletableFuture<DeleteConsumerResponse> deleteConsumer(DeleteConsumerRequest request);

    /**
     * @param request the request parameters of DeleteConsumerAuthorizationRule  DeleteConsumerAuthorizationRuleRequest
     * @return DeleteConsumerAuthorizationRuleResponse
     */
    CompletableFuture<DeleteConsumerAuthorizationRuleResponse> deleteConsumerAuthorizationRule(DeleteConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @deprecated OpenAPI DeleteEnvironment is deprecated  * @param request  the request parameters of DeleteEnvironment  DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     */
    @Deprecated
    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    /**
     * @param request the request parameters of DeleteGateway  DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    /**
     * @param request the request parameters of DeleteGatewaySecurityGroupRule  DeleteGatewaySecurityGroupRuleRequest
     * @return DeleteGatewaySecurityGroupRuleResponse
     */
    CompletableFuture<DeleteGatewaySecurityGroupRuleResponse> deleteGatewaySecurityGroupRule(DeleteGatewaySecurityGroupRuleRequest request);

    /**
     * @param request the request parameters of DeleteHttpApi  DeleteHttpApiRequest
     * @return DeleteHttpApiResponse
     */
    CompletableFuture<DeleteHttpApiResponse> deleteHttpApi(DeleteHttpApiRequest request);

    /**
     * @param request the request parameters of DeleteHttpApiOperation  DeleteHttpApiOperationRequest
     * @return DeleteHttpApiOperationResponse
     */
    CompletableFuture<DeleteHttpApiOperationResponse> deleteHttpApiOperation(DeleteHttpApiOperationRequest request);

    /**
     * @param request the request parameters of DeleteHttpApiRoute  DeleteHttpApiRouteRequest
     * @return DeleteHttpApiRouteResponse
     */
    CompletableFuture<DeleteHttpApiRouteResponse> deleteHttpApiRoute(DeleteHttpApiRouteRequest request);

    /**
     * @param request the request parameters of DeleteMcpServer  DeleteMcpServerRequest
     * @return DeleteMcpServerResponse
     */
    CompletableFuture<DeleteMcpServerResponse> deleteMcpServer(DeleteMcpServerRequest request);

    /**
     * @param request the request parameters of DeletePluginAttachment  DeletePluginAttachmentRequest
     * @return DeletePluginAttachmentResponse
     */
    CompletableFuture<DeletePluginAttachmentResponse> deletePluginAttachment(DeletePluginAttachmentRequest request);

    /**
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * @param request the request parameters of DeletePolicyAttachment  DeletePolicyAttachmentRequest
     * @return DeletePolicyAttachmentResponse
     */
    CompletableFuture<DeletePolicyAttachmentResponse> deletePolicyAttachment(DeletePolicyAttachmentRequest request);

    /**
     * @param request the request parameters of DeleteService  DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    /**
     * @param request the request parameters of DeployHttpApi  DeployHttpApiRequest
     * @return DeployHttpApiResponse
     */
    CompletableFuture<DeployHttpApiResponse> deployHttpApi(DeployHttpApiRequest request);

    /**
     * @param request the request parameters of DeployMcpServer  DeployMcpServerRequest
     * @return DeployMcpServerResponse
     */
    CompletableFuture<DeployMcpServerResponse> deployMcpServer(DeployMcpServerRequest request);

    /**
     * @param request the request parameters of ExportHttpApi  ExportHttpApiRequest
     * @return ExportHttpApiResponse
     */
    CompletableFuture<ExportHttpApiResponse> exportHttpApi(ExportHttpApiRequest request);

    /**
     * @param request the request parameters of GetConsumer  GetConsumerRequest
     * @return GetConsumerResponse
     */
    CompletableFuture<GetConsumerResponse> getConsumer(GetConsumerRequest request);

    /**
     * @param request the request parameters of GetConsumerAuthorizationRule  GetConsumerAuthorizationRuleRequest
     * @return GetConsumerAuthorizationRuleResponse
     */
    CompletableFuture<GetConsumerAuthorizationRuleResponse> getConsumerAuthorizationRule(GetConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of GetDashboard  GetDashboardRequest
     * @return GetDashboardResponse
     */
    CompletableFuture<GetDashboardResponse> getDashboard(GetDashboardRequest request);

    /**
     * @param request the request parameters of GetDomain  GetDomainRequest
     * @return GetDomainResponse
     */
    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    /**
     * @deprecated OpenAPI GetEnvironment is deprecated  * @param request  the request parameters of GetEnvironment  GetEnvironmentRequest
     * @return GetEnvironmentResponse
     */
    @Deprecated
    CompletableFuture<GetEnvironmentResponse> getEnvironment(GetEnvironmentRequest request);

    /**
     * @param request the request parameters of GetGateway  GetGatewayRequest
     * @return GetGatewayResponse
     */
    CompletableFuture<GetGatewayResponse> getGateway(GetGatewayRequest request);

    /**
     * @param request the request parameters of GetHttpApi  GetHttpApiRequest
     * @return GetHttpApiResponse
     */
    CompletableFuture<GetHttpApiResponse> getHttpApi(GetHttpApiRequest request);

    /**
     * @param request the request parameters of GetHttpApiOperation  GetHttpApiOperationRequest
     * @return GetHttpApiOperationResponse
     */
    CompletableFuture<GetHttpApiOperationResponse> getHttpApiOperation(GetHttpApiOperationRequest request);

    /**
     * @param request the request parameters of GetHttpApiRoute  GetHttpApiRouteRequest
     * @return GetHttpApiRouteResponse
     */
    CompletableFuture<GetHttpApiRouteResponse> getHttpApiRoute(GetHttpApiRouteRequest request);

    /**
     * @param request the request parameters of GetMcpServer  GetMcpServerRequest
     * @return GetMcpServerResponse
     */
    CompletableFuture<GetMcpServerResponse> getMcpServer(GetMcpServerRequest request);

    /**
     * @param request the request parameters of GetPluginAttachment  GetPluginAttachmentRequest
     * @return GetPluginAttachmentResponse
     */
    CompletableFuture<GetPluginAttachmentResponse> getPluginAttachment(GetPluginAttachmentRequest request);

    /**
     * @param request the request parameters of GetPolicy  GetPolicyRequest
     * @return GetPolicyResponse
     */
    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    /**
     * @param request the request parameters of GetPolicyAttachment  GetPolicyAttachmentRequest
     * @return GetPolicyAttachmentResponse
     */
    CompletableFuture<GetPolicyAttachmentResponse> getPolicyAttachment(GetPolicyAttachmentRequest request);

    /**
     * @param request the request parameters of GetResourceOverview  GetResourceOverviewRequest
     * @return GetResourceOverviewResponse
     */
    CompletableFuture<GetResourceOverviewResponse> getResourceOverview(GetResourceOverviewRequest request);

    /**
     * @param request the request parameters of GetService  GetServiceRequest
     * @return GetServiceResponse
     */
    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    /**
     * @param request the request parameters of GetTraceConfig  GetTraceConfigRequest
     * @return GetTraceConfigResponse
     */
    CompletableFuture<GetTraceConfigResponse> getTraceConfig(GetTraceConfigRequest request);

    /**
     * @param request the request parameters of ImportHttpApi  ImportHttpApiRequest
     * @return ImportHttpApiResponse
     */
    CompletableFuture<ImportHttpApiResponse> importHttpApi(ImportHttpApiRequest request);

    /**
     * @param request the request parameters of InstallPlugin  InstallPluginRequest
     * @return InstallPluginResponse
     */
    CompletableFuture<InstallPluginResponse> installPlugin(InstallPluginRequest request);

    /**
     * @param request the request parameters of ListConsumers  ListConsumersRequest
     * @return ListConsumersResponse
     */
    CompletableFuture<ListConsumersResponse> listConsumers(ListConsumersRequest request);

    /**
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    /**
     * @deprecated OpenAPI ListEnvironments is deprecated  * @param request  the request parameters of ListEnvironments  ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    @Deprecated
    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    /**
     * @param request the request parameters of ListGateways  ListGatewaysRequest
     * @return ListGatewaysResponse
     */
    CompletableFuture<ListGatewaysResponse> listGateways(ListGatewaysRequest request);

    /**
     * @param request the request parameters of ListHttpApiOperations  ListHttpApiOperationsRequest
     * @return ListHttpApiOperationsResponse
     */
    CompletableFuture<ListHttpApiOperationsResponse> listHttpApiOperations(ListHttpApiOperationsRequest request);

    /**
     * @param request the request parameters of ListHttpApiRoutes  ListHttpApiRoutesRequest
     * @return ListHttpApiRoutesResponse
     */
    CompletableFuture<ListHttpApiRoutesResponse> listHttpApiRoutes(ListHttpApiRoutesRequest request);

    /**
     * @param request the request parameters of ListHttpApis  ListHttpApisRequest
     * @return ListHttpApisResponse
     */
    CompletableFuture<ListHttpApisResponse> listHttpApis(ListHttpApisRequest request);

    /**
     * @param request the request parameters of ListMcpServers  ListMcpServersRequest
     * @return ListMcpServersResponse
     */
    CompletableFuture<ListMcpServersResponse> listMcpServers(ListMcpServersRequest request);

    /**
     * @param request the request parameters of ListPluginAttachments  ListPluginAttachmentsRequest
     * @return ListPluginAttachmentsResponse
     */
    CompletableFuture<ListPluginAttachmentsResponse> listPluginAttachments(ListPluginAttachmentsRequest request);

    /**
     * @param request the request parameters of ListPlugins  ListPluginsRequest
     * @return ListPluginsResponse
     */
    CompletableFuture<ListPluginsResponse> listPlugins(ListPluginsRequest request);

    /**
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
     * @param request the request parameters of ListPolicyClasses  ListPolicyClassesRequest
     * @return ListPolicyClassesResponse
     */
    CompletableFuture<ListPolicyClassesResponse> listPolicyClasses(ListPolicyClassesRequest request);

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    /**
     * @param request the request parameters of ListSslCerts  ListSslCertsRequest
     * @return ListSslCertsResponse
     */
    CompletableFuture<ListSslCertsResponse> listSslCerts(ListSslCertsRequest request);

    /**
     * @param request the request parameters of ListZones  ListZonesRequest
     * @return ListZonesResponse
     */
    CompletableFuture<ListZonesResponse> listZones(ListZonesRequest request);

    /**
     * @param request the request parameters of QueryConsumerAuthorizationRules  QueryConsumerAuthorizationRulesRequest
     * @return QueryConsumerAuthorizationRulesResponse
     */
    CompletableFuture<QueryConsumerAuthorizationRulesResponse> queryConsumerAuthorizationRules(QueryConsumerAuthorizationRulesRequest request);

    /**
     * @param request the request parameters of RemoveConsumerAuthorizationRule  RemoveConsumerAuthorizationRuleRequest
     * @return RemoveConsumerAuthorizationRuleResponse
     */
    CompletableFuture<RemoveConsumerAuthorizationRuleResponse> removeConsumerAuthorizationRule(RemoveConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of RestartGateway  RestartGatewayRequest
     * @return RestartGatewayResponse
     */
    CompletableFuture<RestartGatewayResponse> restartGateway(RestartGatewayRequest request);

    /**
     * @param request the request parameters of UnDeployMcpServer  UnDeployMcpServerRequest
     * @return UnDeployMcpServerResponse
     */
    CompletableFuture<UnDeployMcpServerResponse> unDeployMcpServer(UnDeployMcpServerRequest request);

    /**
     * @param request the request parameters of UndeployHttpApi  UndeployHttpApiRequest
     * @return UndeployHttpApiResponse
     */
    CompletableFuture<UndeployHttpApiResponse> undeployHttpApi(UndeployHttpApiRequest request);

    /**
     * @param request the request parameters of UninstallPlugin  UninstallPluginRequest
     * @return UninstallPluginResponse
     */
    CompletableFuture<UninstallPluginResponse> uninstallPlugin(UninstallPluginRequest request);

    /**
     * @param request the request parameters of UpdateAndAttachPolicy  UpdateAndAttachPolicyRequest
     * @return UpdateAndAttachPolicyResponse
     */
    CompletableFuture<UpdateAndAttachPolicyResponse> updateAndAttachPolicy(UpdateAndAttachPolicyRequest request);

    /**
     * @param request the request parameters of UpdateConsumer  UpdateConsumerRequest
     * @return UpdateConsumerResponse
     */
    CompletableFuture<UpdateConsumerResponse> updateConsumer(UpdateConsumerRequest request);

    /**
     * @param request the request parameters of UpdateConsumerAuthorizationRule  UpdateConsumerAuthorizationRuleRequest
     * @return UpdateConsumerAuthorizationRuleResponse
     */
    CompletableFuture<UpdateConsumerAuthorizationRuleResponse> updateConsumerAuthorizationRule(UpdateConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of UpdateDomain  UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request);

    /**
     * @deprecated OpenAPI UpdateEnvironment is deprecated  * @param request  the request parameters of UpdateEnvironment  UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    @Deprecated
    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    /**
     * @param request the request parameters of UpdateGatewayFeature  UpdateGatewayFeatureRequest
     * @return UpdateGatewayFeatureResponse
     */
    CompletableFuture<UpdateGatewayFeatureResponse> updateGatewayFeature(UpdateGatewayFeatureRequest request);

    /**
     * @param request the request parameters of UpdateGatewayName  UpdateGatewayNameRequest
     * @return UpdateGatewayNameResponse
     */
    CompletableFuture<UpdateGatewayNameResponse> updateGatewayName(UpdateGatewayNameRequest request);

    /**
     * @param request the request parameters of UpdateHttpApi  UpdateHttpApiRequest
     * @return UpdateHttpApiResponse
     */
    CompletableFuture<UpdateHttpApiResponse> updateHttpApi(UpdateHttpApiRequest request);

    /**
     * @param request the request parameters of UpdateHttpApiOperation  UpdateHttpApiOperationRequest
     * @return UpdateHttpApiOperationResponse
     */
    CompletableFuture<UpdateHttpApiOperationResponse> updateHttpApiOperation(UpdateHttpApiOperationRequest request);

    /**
     * @param request the request parameters of UpdateHttpApiRoute  UpdateHttpApiRouteRequest
     * @return UpdateHttpApiRouteResponse
     */
    CompletableFuture<UpdateHttpApiRouteResponse> updateHttpApiRoute(UpdateHttpApiRouteRequest request);

    /**
     * @param request the request parameters of UpdateMcpServer  UpdateMcpServerRequest
     * @return UpdateMcpServerResponse
     */
    CompletableFuture<UpdateMcpServerResponse> updateMcpServer(UpdateMcpServerRequest request);

    /**
     * @param request the request parameters of UpdatePluginAttachment  UpdatePluginAttachmentRequest
     * @return UpdatePluginAttachmentResponse
     */
    CompletableFuture<UpdatePluginAttachmentResponse> updatePluginAttachment(UpdatePluginAttachmentRequest request);

    /**
     * @param request the request parameters of UpdatePolicy  UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    CompletableFuture<UpdatePolicyResponse> updatePolicy(UpdatePolicyRequest request);

    /**
     * @param request the request parameters of UpgradeGateway  UpgradeGatewayRequest
     * @return UpgradeGatewayResponse
     */
    CompletableFuture<UpgradeGatewayResponse> upgradeGateway(UpgradeGatewayRequest request);

}
