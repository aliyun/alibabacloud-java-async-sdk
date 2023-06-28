// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.fc20230330.models.*;
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
      * create function version
      *
     */
    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    /**
      * Create custom domain.
      *
     */
    CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request);

    /**
      * Create function
      *
     */
    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    /**
      * Create layer version
      *
     */
    CompletableFuture<CreateLayerVersionResponse> createLayerVersion(CreateLayerVersionRequest request);

    /**
      * Create trigger.
      *
     */
    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    /**
      * Delete function alias
      *
     */
    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    /**
      * Delete function async invoke config
      *
     */
    CompletableFuture<DeleteAsyncInvokeConfigResponse> deleteAsyncInvokeConfig(DeleteAsyncInvokeConfigRequest request);

    /**
      * deletes the concurrency config for a function
      *
     */
    CompletableFuture<DeleteConcurrencyConfigResponse> deleteConcurrencyConfig(DeleteConcurrencyConfigRequest request);

    /**
      * Delete custom domain.
      *
     */
    CompletableFuture<DeleteCustomDomainResponse> deleteCustomDomain(DeleteCustomDomainRequest request);

    /**
      * Delete function
      *
     */
    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    /**
      * Delete function version
      *
     */
    CompletableFuture<DeleteFunctionVersionResponse> deleteFunctionVersion(DeleteFunctionVersionRequest request);

    /**
      * Delete layer version
      *
     */
    CompletableFuture<DeleteLayerVersionResponse> deleteLayerVersion(DeleteLayerVersionRequest request);

    /**
      * Delete provision config.
      *
     */
    CompletableFuture<DeleteProvisionConfigResponse> deleteProvisionConfig(DeleteProvisionConfigRequest request);

    /**
      * Delete trigger.
      *
     */
    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    /**
      * Get function alias
      *
     */
    CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request);

    /**
      * Get function async invoke config
      *
     */
    CompletableFuture<GetAsyncInvokeConfigResponse> getAsyncInvokeConfig(GetAsyncInvokeConfigRequest request);

    /**
      * gets the concurrency config for a function
      *
     */
    CompletableFuture<GetConcurrencyConfigResponse> getConcurrencyConfig(GetConcurrencyConfigRequest request);

    /**
      * Get custom domain.
      *
     */
    CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request);

    /**
      * Get function info by function name
      *
     */
    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    /**
      * Get function code by function name
      *
     */
    CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request);

    /**
      * Get layer version.
      *
     */
    CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request);

    /**
      * Get layer version by arn.
      *
     */
    CompletableFuture<GetLayerVersionByArnResponse> getLayerVersionByArn(GetLayerVersionByArnRequest request);

    /**
      * Get provision config.
      *
     */
    CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request);

    /**
      * Get resource tag
      *
     */
    CompletableFuture<GetResourceTagsResponse> getResourceTags(GetResourceTagsRequest request);

    /**
      * Get trigger.
      *
     */
    CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request);

    /**
      * Invoke function
      *
     */
    CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request);

    /**
      * List function aliases
      *
     */
    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    /**
      * List all functions async invoke config
      *
     */
    CompletableFuture<ListAsyncInvokeConfigsResponse> listAsyncInvokeConfigs(ListAsyncInvokeConfigsRequest request);

    /**
      * List all functions concurrency configs
      *
     */
    CompletableFuture<ListConcurrencyConfigsResponse> listConcurrencyConfigs(ListConcurrencyConfigsRequest request);

    /**
      * List custom domains.
      *
     */
    CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request);

    /**
      * List function versions
      *
     */
    CompletableFuture<ListFunctionVersionsResponse> listFunctionVersions(ListFunctionVersionsRequest request);

    /**
      * Lists existing functions.
      *
     */
    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    /**
      * List instances for function.
      *
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
      * List layer versions.
      *
     */
    CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request);

    /**
      * List layers .
      *
     */
    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    /**
      * List provision configs.
      *
     */
    CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request);

    /**
      * List tagged resources
      *
     */
    CompletableFuture<ListTaggedResourcesResponse> listTaggedResources(ListTaggedResourcesRequest request);

    /**
      * List triggers.
      *
     */
    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    /**
      * publish new function version
      *
     */
    CompletableFuture<PublishFunctionVersionResponse> publishFunctionVersion(PublishFunctionVersionRequest request);

    /**
      * Put function async invoke config.
      *
     */
    CompletableFuture<PutAsyncInvokeConfigResponse> putAsyncInvokeConfig(PutAsyncInvokeConfigRequest request);

    /**
      * sets the concurrency config for a function
      *
     */
    CompletableFuture<PutConcurrencyConfigResponse> putConcurrencyConfig(PutConcurrencyConfigRequest request);

    /**
      * Update layer ACL.
      *
     */
    CompletableFuture<PutLayerACLResponse> putLayerACL(PutLayerACLRequest request);

    /**
      * Put provision config.
      *
     */
    CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request);

    /**
      * Tag resource
      *
     */
    CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request);

    /**
      * Untag resource tag, support resource type: function, service
      *
     */
    CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request);

    /**
      * Update function alias
      *
     */
    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    /**
      * Update custom domain.
      *
     */
    CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request);

    /**
      * Update function
      *
     */
    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    /**
      * Update trigger.
      *
     */
    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

}
