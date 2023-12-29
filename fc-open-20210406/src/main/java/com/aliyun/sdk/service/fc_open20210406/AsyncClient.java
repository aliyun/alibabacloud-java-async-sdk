// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.fc_open20210406.models.*;
import com.aliyun.sdk.gateway.pop.Configuration;
import com.aliyun.sdk.gateway.pop.auth.SignatureVersion;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder().serviceConfiguration(Configuration.create().setSignatureVersion(SignatureVersion.V3));
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<ClaimGPUInstanceResponse> claimGPUInstance(ClaimGPUInstanceRequest request);

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

    /**
      * StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If the value of StatefulAsyncInvocation is true, the asynchronous task feature is enabled. All asynchronous invocations change to asynchronous task mode.
      *
     */
    CompletableFuture<GetFunctionAsyncInvokeConfigResponse> getFunctionAsyncInvokeConfig(GetFunctionAsyncInvokeConfigRequest request);

    CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request);

    CompletableFuture<GetFunctionOnDemandConfigResponse> getFunctionOnDemandConfig(GetFunctionOnDemandConfigRequest request);

    CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request);

    CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request);

    CompletableFuture<GetResourceTagsResponse> getResourceTags(GetResourceTagsRequest request);

    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    /**
      * The version or alias of the service to which the asynchronous task belongs.
      *
     */
    CompletableFuture<GetStatefulAsyncInvocationResponse> getStatefulAsyncInvocation(GetStatefulAsyncInvocationRequest request);

    CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request);

    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request);

    CompletableFuture<ListEventSourcesResponse> listEventSources(ListEventSourcesRequest request);

    /**
      * StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If StatefulAsyncInvocation is set to true, the asynchronous task is enabled. All asynchronous invocations to the function corresponding to this configuration change to asynchronous task mode.
      *
     */
    CompletableFuture<ListFunctionAsyncInvokeConfigsResponse> listFunctionAsyncInvokeConfigs(ListFunctionAsyncInvokeConfigsRequest request);

    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    /**
      * The ListInstances operation allows you to query the available instances of a function.
      * Available instances are instances that are processing requests or can be scheduled to process requests. Available instances queried by the ListInstances operation are the same as those that can be used when you call the InvokeFunction operation with the same values specified for the `serviceName`, `functionName`, and `qualifier` parameters.
      *
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request);

    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    CompletableFuture<ListOnDemandConfigsResponse> listOnDemandConfigs(ListOnDemandConfigsRequest request);

    CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request);

    CompletableFuture<ListReservedCapacitiesResponse> listReservedCapacities(ListReservedCapacitiesRequest request);

    CompletableFuture<ListServiceVersionsResponse> listServiceVersions(ListServiceVersionsRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    /**
      * The metadata of the service and function to which the asynchronous task belongs.
      *
     */
    CompletableFuture<ListStatefulAsyncInvocationFunctionsResponse> listStatefulAsyncInvocationFunctions(ListStatefulAsyncInvocationFunctionsRequest request);

    /**
      * The name of the service to which the asynchronous task belongs.
      *
     */
    CompletableFuture<ListStatefulAsyncInvocationsResponse> listStatefulAsyncInvocations(ListStatefulAsyncInvocationsRequest request);

    CompletableFuture<ListTaggedResourcesResponse> listTaggedResources(ListTaggedResourcesRequest request);

    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    CompletableFuture<ListVpcBindingsResponse> listVpcBindings(ListVpcBindingsRequest request);

    CompletableFuture<PublishServiceVersionResponse> publishServiceVersion(PublishServiceVersionRequest request);

    /**
      * The maximum validity period of messages.
      *
     */
    CompletableFuture<PutFunctionAsyncInvokeConfigResponse> putFunctionAsyncInvokeConfig(PutFunctionAsyncInvokeConfigRequest request);

    CompletableFuture<PutFunctionOnDemandConfigResponse> putFunctionOnDemandConfig(PutFunctionOnDemandConfigRequest request);

    CompletableFuture<PutLayerACLResponse> putLayerACL(PutLayerACLRequest request);

    CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request);

    CompletableFuture<RegisterEventSourceResponse> registerEventSource(RegisterEventSourceRequest request);

    CompletableFuture<ReleaseGPUInstanceResponse> releaseGPUInstance(ReleaseGPUInstanceRequest request);

    /**
      * StatefulAsyncInvocation: asynchronous task. Asynchronous tasks allow you to manage the states on the basis of common asynchronous invocations, which is more suitable for task scenarios.
      *
     */
    CompletableFuture<StopStatefulAsyncInvocationResponse> stopStatefulAsyncInvocation(StopStatefulAsyncInvocationRequest request);

    CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request);

    CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request);

    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request);

    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

}
