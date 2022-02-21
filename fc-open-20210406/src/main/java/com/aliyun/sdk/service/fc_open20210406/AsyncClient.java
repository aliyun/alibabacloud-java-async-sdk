// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.fc_open20210406.models.*;
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

    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request);

    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    CompletableFuture<CreateLayerVersionResponse> createLayerVersion(CreateLayerVersionRequest request);

    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    CompletableFuture<CreateVpcBindingResponse> createVpcBinding(CreateVpcBindingRequest request);

    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    CompletableFuture<DeleteCustomDomainResponse> deleteCustomDomain(DeleteCustomDomainRequest request);

    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    CompletableFuture<DeleteFunctionAsyncInvokeConfigResponse> deleteFunctionAsyncInvokeConfig(DeleteFunctionAsyncInvokeConfigRequest request);

    CompletableFuture<DeleteFunctionOnDemandConfigResponse> deleteFunctionOnDemandConfig(DeleteFunctionOnDemandConfigRequest request);

    CompletableFuture<DeleteLayerVersionResponse> deleteLayerVersion(DeleteLayerVersionRequest request);

    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    CompletableFuture<DeleteServiceVersionResponse> deleteServiceVersion(DeleteServiceVersionRequest request);

    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    CompletableFuture<DeleteVpcBindingResponse> deleteVpcBinding(DeleteVpcBindingRequest request);

    CompletableFuture<DeregisterEventSourceResponse> deregisterEventSource(DeregisterEventSourceRequest request);

    CompletableFuture<GetAccountSettingsResponse> getAccountSettings(GetAccountSettingsRequest request);

    CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request);

    CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request);

    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    CompletableFuture<GetFunctionAsyncInvokeConfigResponse> getFunctionAsyncInvokeConfig(GetFunctionAsyncInvokeConfigRequest request);

    CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request);

    CompletableFuture<GetFunctionOnDemandConfigResponse> getFunctionOnDemandConfig(GetFunctionOnDemandConfigRequest request);

    CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request);

    CompletableFuture<GetLayerVersionByArnResponse> getLayerVersionByArn(GetLayerVersionByArnRequest request);

    CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request);

    CompletableFuture<GetResourceTagsResponse> getResourceTags(GetResourceTagsRequest request);

    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    CompletableFuture<GetStatefulAsyncInvocationResponse> getStatefulAsyncInvocation(GetStatefulAsyncInvocationRequest request);

    CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request);

    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request);

    CompletableFuture<ListEventSourcesResponse> listEventSources(ListEventSourcesRequest request);

    CompletableFuture<ListFunctionAsyncInvokeConfigsResponse> listFunctionAsyncInvokeConfigs(ListFunctionAsyncInvokeConfigsRequest request);

    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request);

    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    CompletableFuture<ListOnDemandConfigsResponse> listOnDemandConfigs(ListOnDemandConfigsRequest request);

    CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request);

    CompletableFuture<ListReservedCapacitiesResponse> listReservedCapacities(ListReservedCapacitiesRequest request);

    CompletableFuture<ListServiceVersionsResponse> listServiceVersions(ListServiceVersionsRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<ListStatefulAsyncInvocationsResponse> listStatefulAsyncInvocations(ListStatefulAsyncInvocationsRequest request);

    CompletableFuture<ListTaggedResourcesResponse> listTaggedResources(ListTaggedResourcesRequest request);

    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    CompletableFuture<ListVpcBindingsResponse> listVpcBindings(ListVpcBindingsRequest request);

    CompletableFuture<PermanentDeleteLayerVersionResponse> permanentDeleteLayerVersion(PermanentDeleteLayerVersionRequest request);

    CompletableFuture<PublishLayerAsPublicResponse> publishLayerAsPublic(PublishLayerAsPublicRequest request);

    CompletableFuture<PublishServiceVersionResponse> publishServiceVersion(PublishServiceVersionRequest request);

    CompletableFuture<PutFunctionAsyncInvokeConfigResponse> putFunctionAsyncInvokeConfig(PutFunctionAsyncInvokeConfigRequest request);

    CompletableFuture<PutFunctionOnDemandConfigResponse> putFunctionOnDemandConfig(PutFunctionOnDemandConfigRequest request);

    CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request);

    CompletableFuture<RegisterEventSourceResponse> registerEventSource(RegisterEventSourceRequest request);

    CompletableFuture<StopStatefulAsyncInvocationResponse> stopStatefulAsyncInvocation(StopStatefulAsyncInvocationRequest request);

    CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request);

    CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request);

    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request);

    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

}
