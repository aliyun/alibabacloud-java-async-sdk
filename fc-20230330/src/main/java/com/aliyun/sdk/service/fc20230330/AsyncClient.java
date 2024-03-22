// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.fc20230330.models.*;
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

    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request);

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

    CompletableFuture<GetConcurrencyConfigResponse> getConcurrencyConfig(GetConcurrencyConfigRequest request);

    CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request);

    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request);

    CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request);

    CompletableFuture<GetLayerVersionByArnResponse> getLayerVersionByArn(GetLayerVersionByArnRequest request);

    CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetResourceTagsResponse> getResourceTags(GetResourceTagsRequest request);

    CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunctionWithRequestBody(InvokeFunctionRequest request, RequestBody requestBody);

<ReturnT> CompletableFuture<ReturnT> invokeFunctionWithAsyncResponseHandler(InvokeFunctionRequest request, AsyncResponseHandler<InvokeFunctionResponse, ReturnT> responseHandler);

    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    CompletableFuture<ListAsyncInvokeConfigsResponse> listAsyncInvokeConfigs(ListAsyncInvokeConfigsRequest request);

    CompletableFuture<ListConcurrencyConfigsResponse> listConcurrencyConfigs(ListConcurrencyConfigsRequest request);

    CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request);

    CompletableFuture<ListFunctionVersionsResponse> listFunctionVersions(ListFunctionVersionsRequest request);

    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request);

    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListTaggedResourcesResponse> listTaggedResources(ListTaggedResourcesRequest request);

    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    CompletableFuture<ListVpcBindingsResponse> listVpcBindings(ListVpcBindingsRequest request);

    CompletableFuture<PublishFunctionVersionResponse> publishFunctionVersion(PublishFunctionVersionRequest request);

    CompletableFuture<PutAsyncInvokeConfigResponse> putAsyncInvokeConfig(PutAsyncInvokeConfigRequest request);

    CompletableFuture<PutConcurrencyConfigResponse> putConcurrencyConfig(PutConcurrencyConfigRequest request);

    CompletableFuture<PutLayerACLResponse> putLayerACL(PutLayerACLRequest request);

    CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request);

    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

}
