// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.fc20230330.models.*;
import com.aliyun.sdk.gateway.pop.Configuration;
import com.aliyun.sdk.gateway.pop.auth.SignatureVersion;
import darabonba.core.*;
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

    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    /**
      * If you wish to access applications or functions created in Function Compute via a fixed domain name in a production environment, or if you need to address the forced download behavior when accessing HTTP triggers, you can achieve this by binding a custom domain to your application or function.
      *
     */
    CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request);

    /**
      * In Function Compute, a function serves as the smallest unit of resource scheduling and execution, typically referring to a piece of code written by users that can execute independently in response to specific events or requests.
      *
     */
    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    CompletableFuture<CreateLayerVersionResponse> createLayerVersion(CreateLayerVersionRequest request);

    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    CompletableFuture<CreateVpcBindingResponse> createVpcBinding(CreateVpcBindingRequest request);

    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    CompletableFuture<DeleteAsyncInvokeConfigResponse> deleteAsyncInvokeConfig(DeleteAsyncInvokeConfigRequest request);

    CompletableFuture<DeleteConcurrencyConfigResponse> deleteConcurrencyConfig(DeleteConcurrencyConfigRequest request);

    CompletableFuture<DeleteCustomDomainResponse> deleteCustomDomain(DeleteCustomDomainRequest request);

    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    CompletableFuture<DeleteFunctionVersionResponse> deleteFunctionVersion(DeleteFunctionVersionRequest request);

    CompletableFuture<DeleteLayerVersionResponse> deleteLayerVersion(DeleteLayerVersionRequest request);

    CompletableFuture<DeleteProvisionConfigResponse> deleteProvisionConfig(DeleteProvisionConfigRequest request);

    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    CompletableFuture<DeleteVpcBindingResponse> deleteVpcBinding(DeleteVpcBindingRequest request);

    CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request);

    CompletableFuture<GetAsyncInvokeConfigResponse> getAsyncInvokeConfig(GetAsyncInvokeConfigRequest request);

    CompletableFuture<GetAsyncTaskResponse> getAsyncTask(GetAsyncTaskRequest request);

    CompletableFuture<GetConcurrencyConfigResponse> getConcurrencyConfig(GetConcurrencyConfigRequest request);

    CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request);

    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request);

    CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request);

    CompletableFuture<GetLayerVersionByArnResponse> getLayerVersionByArn(GetLayerVersionByArnRequest request);

    CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request);

    CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunctionWithRequestBody(InvokeFunctionRequest request, RequestBody requestBody);

<ReturnT> CompletableFuture<ReturnT> invokeFunctionWithAsyncResponseHandler(InvokeFunctionRequest request, AsyncResponseHandler<InvokeFunctionResponse, ReturnT> responseHandler);

    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    CompletableFuture<ListAsyncInvokeConfigsResponse> listAsyncInvokeConfigs(ListAsyncInvokeConfigsRequest request);

    CompletableFuture<ListAsyncTasksResponse> listAsyncTasks(ListAsyncTasksRequest request);

    CompletableFuture<ListConcurrencyConfigsResponse> listConcurrencyConfigs(ListConcurrencyConfigsRequest request);

    CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request);

    CompletableFuture<ListFunctionVersionsResponse> listFunctionVersions(ListFunctionVersionsRequest request);

    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request);

    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    CompletableFuture<ListVpcBindingsResponse> listVpcBindings(ListVpcBindingsRequest request);

    CompletableFuture<PublishFunctionVersionResponse> publishFunctionVersion(PublishFunctionVersionRequest request);

    CompletableFuture<PutAsyncInvokeConfigResponse> putAsyncInvokeConfig(PutAsyncInvokeConfigRequest request);

    CompletableFuture<PutConcurrencyConfigResponse> putConcurrencyConfig(PutConcurrencyConfigRequest request);

    CompletableFuture<PutLayerACLResponse> putLayerACL(PutLayerACLRequest request);

    CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request);

    CompletableFuture<StopAsyncTaskResponse> stopAsyncTask(StopAsyncTaskRequest request);

    /**
      * Tags are used to identify resources. Tags allow you to categorize, search for, and aggregate resources that have the same characteristics from different dimensions. This facilitates resource management. For more information, see [Tag overview](~~156983~~).
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request);

    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

}
