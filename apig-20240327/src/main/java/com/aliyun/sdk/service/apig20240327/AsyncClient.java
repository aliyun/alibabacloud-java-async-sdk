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
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

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
     * <p>The interface supports creating multiple services.</p>
     * 
     * @param request the request parameters of CreateService  CreateServiceRequest
     * @return CreateServiceResponse
     */
    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

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
     * @param request the request parameters of DeployHttpApi  DeployHttpApiRequest
     * @return DeployHttpApiResponse
     */
    CompletableFuture<DeployHttpApiResponse> deployHttpApi(DeployHttpApiRequest request);

    /**
     * @param request the request parameters of ExportHttpApi  ExportHttpApiRequest
     * @return ExportHttpApiResponse
     */
    CompletableFuture<ExportHttpApiResponse> exportHttpApi(ExportHttpApiRequest request);

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
     * @param request the request parameters of RestartGateway  RestartGatewayRequest
     * @return RestartGatewayResponse
     */
    CompletableFuture<RestartGatewayResponse> restartGateway(RestartGatewayRequest request);

    /**
     * @param request the request parameters of UndeployHttpApi  UndeployHttpApiRequest
     * @return UndeployHttpApiResponse
     */
    CompletableFuture<UndeployHttpApiResponse> undeployHttpApi(UndeployHttpApiRequest request);

    /**
     * <b>description</b> :
     * <p>只有类型为<strong>容器服务</strong>的来源允许更新监听Ingress的配置。</p>
     * 
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
