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
      * 创建函数别名。
      *
     */
    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    /**
      * 创建自定义域名。
      *
     */
    CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request);

    /**
      * 创建函数。
      *
     */
    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    /**
      * 创建层版本。
      *
     */
    CompletableFuture<CreateLayerVersionResponse> createLayerVersion(CreateLayerVersionRequest request);

    /**
      * 创建函数触发器。
      *
     */
    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    /**
      * 创建VPC绑定。
      *
     */
    CompletableFuture<CreateVpcBindingResponse> createVpcBinding(CreateVpcBindingRequest request);

    /**
      * 删除函数别名。
      *
     */
    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    /**
      * 删除函数异步调用配置。
      *
     */
    CompletableFuture<DeleteAsyncInvokeConfigResponse> deleteAsyncInvokeConfig(DeleteAsyncInvokeConfigRequest request);

    /**
      * 删除函数并发度配置。
      *
     */
    CompletableFuture<DeleteConcurrencyConfigResponse> deleteConcurrencyConfig(DeleteConcurrencyConfigRequest request);

    /**
      * 删除自定义域名。
      *
     */
    CompletableFuture<DeleteCustomDomainResponse> deleteCustomDomain(DeleteCustomDomainRequest request);

    /**
      * 删除函数。
      *
     */
    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    /**
      * 删除函数版本。
      *
     */
    CompletableFuture<DeleteFunctionVersionResponse> deleteFunctionVersion(DeleteFunctionVersionRequest request);

    /**
      * 删除层版本。
      *
     */
    CompletableFuture<DeleteLayerVersionResponse> deleteLayerVersion(DeleteLayerVersionRequest request);

    /**
      * 删除函数预留配置。
      *
     */
    CompletableFuture<DeleteProvisionConfigResponse> deleteProvisionConfig(DeleteProvisionConfigRequest request);

    /**
      * 删除函数触发器。
      *
     */
    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    /**
      * 删除VPC绑定。
      *
     */
    CompletableFuture<DeleteVpcBindingResponse> deleteVpcBinding(DeleteVpcBindingRequest request);

    /**
      * 获取函数别名信息。
      *
     */
    CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request);

    /**
      * 获取函数异步调用配置。
      *
     */
    CompletableFuture<GetAsyncInvokeConfigResponse> getAsyncInvokeConfig(GetAsyncInvokeConfigRequest request);

    /**
      * 获取函数并发度配置。
      *
     */
    CompletableFuture<GetConcurrencyConfigResponse> getConcurrencyConfig(GetConcurrencyConfigRequest request);

    /**
      * 获取自定义域名。
      *
     */
    CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request);

    /**
      * 获取函数信息。
      *
     */
    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    /**
      * 获取函数代码。
      *
     */
    CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request);

    /**
      * 获取层版本。
      *
     */
    CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request);

    /**
      * 根据资源标识获取层版本。
      *
     */
    CompletableFuture<GetLayerVersionByArnResponse> getLayerVersionByArn(GetLayerVersionByArnRequest request);

    /**
      * 获取函数预留配置。
      *
     */
    CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request);

    /**
      * 获取资源标签。
      *
     */
    CompletableFuture<GetResourceTagsResponse> getResourceTags(GetResourceTagsRequest request);

    /**
      * 获取函数触发器。
      *
     */
    CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request);

    /**
      * 调用函数。
      *
     */
    CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunctionWithRequestBody(InvokeFunctionRequest request, RequestBody requestBody);

<ReturnT> CompletableFuture<ReturnT> invokeFunctionWithAsyncResponseHandler(InvokeFunctionRequest request, AsyncResponseHandler<InvokeFunctionResponse, ReturnT> responseHandler);

    /**
      * 列出函数别名。
      *
     */
    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    /**
      * 列出函数异步调用配置。
      *
     */
    CompletableFuture<ListAsyncInvokeConfigsResponse> listAsyncInvokeConfigs(ListAsyncInvokeConfigsRequest request);

    /**
      * 列出函数并发度配置。
      *
     */
    CompletableFuture<ListConcurrencyConfigsResponse> listConcurrencyConfigs(ListConcurrencyConfigsRequest request);

    /**
      * 列出自定义域名。
      *
     */
    CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request);

    /**
      * 列出函数版本。
      *
     */
    CompletableFuture<ListFunctionVersionsResponse> listFunctionVersions(ListFunctionVersionsRequest request);

    /**
      * 列出函数。
      *
     */
    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    /**
      * 列出函数实例。
      *
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
      * 列出层版本。
      *
     */
    CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request);

    /**
      * 列出层。
      *
     */
    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    /**
      * 列出函数预留配置。
      *
     */
    CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request);

    /**
      * 列出具有标签的资源。
      *
     */
    CompletableFuture<ListTaggedResourcesResponse> listTaggedResources(ListTaggedResourcesRequest request);

    /**
      * 列出函数触发器。
      *
     */
    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    /**
      * 列出VPC绑定配置。
      *
     */
    CompletableFuture<ListVpcBindingsResponse> listVpcBindings(ListVpcBindingsRequest request);

    /**
      * 发布函数版本。
      *
     */
    CompletableFuture<PublishFunctionVersionResponse> publishFunctionVersion(PublishFunctionVersionRequest request);

    /**
      * 设置函数异步调用配置。
      *
     */
    CompletableFuture<PutAsyncInvokeConfigResponse> putAsyncInvokeConfig(PutAsyncInvokeConfigRequest request);

    /**
      * 设置函数并发度配置。
      *
     */
    CompletableFuture<PutConcurrencyConfigResponse> putConcurrencyConfig(PutConcurrencyConfigRequest request);

    /**
      * 设置层的访问权限。
      *
     */
    CompletableFuture<PutLayerACLResponse> putLayerACL(PutLayerACLRequest request);

    /**
      * 设置函数预留配置。
      *
     */
    CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request);

    /**
      * 设置资源标签。
      *
     */
    CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request);

    /**
      * 删除资源标签。
      *
     */
    CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request);

    /**
      * 更新函数别名。
      *
     */
    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    /**
      * 更新自定义域名。
      *
     */
    CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request);

    /**
      * 更新函数。
      *
     */
    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    /**
      * 更新函数触发器。
      *
     */
    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

}
