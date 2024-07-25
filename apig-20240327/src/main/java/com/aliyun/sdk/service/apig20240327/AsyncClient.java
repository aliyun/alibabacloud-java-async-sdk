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

    CompletableFuture<AddGatewaySecurityGroupRuleResponse> addGatewaySecurityGroupRule(AddGatewaySecurityGroupRuleRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    CompletableFuture<CreateGatewayRouteResponse> createGatewayRoute(CreateGatewayRouteRequest request);

    CompletableFuture<CreateGatewayServiceResponse> createGatewayService(CreateGatewayServiceRequest request);

    CompletableFuture<CreateGatewayServiceVersionResponse> createGatewayServiceVersion(CreateGatewayServiceVersionRequest request);

    CompletableFuture<CreateHttpApiResponse> createHttpApi(CreateHttpApiRequest request);

    CompletableFuture<CreateHttpApiOperationResponse> createHttpApiOperation(CreateHttpApiOperationRequest request);

    CompletableFuture<CreateServiceSourceResponse> createServiceSource(CreateServiceSourceRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    CompletableFuture<DeleteGatewayRouteResponse> deleteGatewayRoute(DeleteGatewayRouteRequest request);

    CompletableFuture<DeleteGatewayServiceResponse> deleteGatewayService(DeleteGatewayServiceRequest request);

    CompletableFuture<DeleteGatewayServiceVersionResponse> deleteGatewayServiceVersion(DeleteGatewayServiceVersionRequest request);

    CompletableFuture<DeleteHttpApiResponse> deleteHttpApi(DeleteHttpApiRequest request);

    CompletableFuture<DeleteHttpApiOperationResponse> deleteHttpApiOperation(DeleteHttpApiOperationRequest request);

    CompletableFuture<DeleteServiceSourceResponse> deleteServiceSource(DeleteServiceSourceRequest request);

    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    CompletableFuture<GetEnvironmentResponse> getEnvironment(GetEnvironmentRequest request);

    CompletableFuture<GetGatewayResponse> getGateway(GetGatewayRequest request);

    CompletableFuture<GetGatewayRouteResponse> getGatewayRoute(GetGatewayRouteRequest request);

    CompletableFuture<GetGatewayServiceResponse> getGatewayService(GetGatewayServiceRequest request);

    CompletableFuture<GetHttpApiResponse> getHttpApi(GetHttpApiRequest request);

    CompletableFuture<GetHttpApiOperationResponse> getHttpApiOperation(GetHttpApiOperationRequest request);

    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    CompletableFuture<ListGatewayRoutesResponse> listGatewayRoutes(ListGatewayRoutesRequest request);

    CompletableFuture<ListGatewayServicesResponse> listGatewayServices(ListGatewayServicesRequest request);

    CompletableFuture<ListGatewaysResponse> listGateways(ListGatewaysRequest request);

    CompletableFuture<ListHttpApiOperationsResponse> listHttpApiOperations(ListHttpApiOperationsRequest request);

    CompletableFuture<ListHttpApisResponse> listHttpApis(ListHttpApisRequest request);

    CompletableFuture<OfflineGatewayRouteResponse> offlineGatewayRoute(OfflineGatewayRouteRequest request);

    CompletableFuture<OfflineHttpApiResponse> offlineHttpApi(OfflineHttpApiRequest request);

    CompletableFuture<PublishGatewayRouteResponse> publishGatewayRoute(PublishGatewayRouteRequest request);

    CompletableFuture<PublishHttpApiResponse> publishHttpApi(PublishHttpApiRequest request);

    CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request);

    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    CompletableFuture<UpdateGatewayRouteResponse> updateGatewayRoute(UpdateGatewayRouteRequest request);

    CompletableFuture<UpdateGatewayServiceResponse> updateGatewayService(UpdateGatewayServiceRequest request);

    CompletableFuture<UpdateGatewayServiceVersionResponse> updateGatewayServiceVersion(UpdateGatewayServiceVersionRequest request);

    CompletableFuture<UpdateHttpApiResponse> updateHttpApi(UpdateHttpApiRequest request);

    CompletableFuture<UpdateHttpApiOperationResponse> updateHttpApiOperation(UpdateHttpApiOperationRequest request);

    CompletableFuture<UpdateServiceSourceResponse> updateServiceSource(UpdateServiceSourceRequest request);

}
