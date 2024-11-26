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
     * <b>description</b> :
     * <p>Create Domain.</p>
     * 
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * <b>description</b> :
     * <p>Create environment.</p>
     * 
     * @param request the request parameters of CreateEnvironment  CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
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
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @param request the request parameters of DeleteEnvironment  DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     */
    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    /**
     * @param request the request parameters of DeleteGateway  DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

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
     * @param request the request parameters of GetDomain  GetDomainRequest
     * @return GetDomainResponse
     */
    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    /**
     * @param request the request parameters of GetEnvironment  GetEnvironmentRequest
     * @return GetEnvironmentResponse
     */
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
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    /**
     * @param request the request parameters of ListEnvironments  ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
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
     * @param request the request parameters of ListHttpApis  ListHttpApisRequest
     * @return ListHttpApisResponse
     */
    CompletableFuture<ListHttpApisResponse> listHttpApis(ListHttpApisRequest request);

    /**
     * @param request the request parameters of UpdateDomain  UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request);

    /**
     * @param request the request parameters of UpdateEnvironment  UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

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

}
