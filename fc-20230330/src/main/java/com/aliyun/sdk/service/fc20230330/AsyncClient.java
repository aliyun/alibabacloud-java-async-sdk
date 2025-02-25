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

    /**
     * @param request the request parameters of CreateAlias  CreateAliasRequest
     * @return CreateAliasResponse
     */
    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to use a fixed domain name to access an application or function in a production environment of Function Compute, or to resolve the issue of forced downloads when accessing an HTTP trigger, you can bind a custom domain name to the application or function.</p>
     * 
     * @param request the request parameters of CreateCustomDomain  CreateCustomDomainRequest
     * @return CreateCustomDomainResponse
     */
    CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request);

    /**
     * <b>description</b> :
     * <p>Resources of Function Compute are scheduled and run based on functions. A function usually refers to a code snippet that is written by a user and can be independently executed to respond to events and requests.</p>
     * 
     * @param request the request parameters of CreateFunction  CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    /**
     * @param request the request parameters of CreateLayerVersion  CreateLayerVersionRequest
     * @return CreateLayerVersionResponse
     */
    CompletableFuture<CreateLayerVersionResponse> createLayerVersion(CreateLayerVersionRequest request);

    /**
     * @param request the request parameters of CreateTrigger  CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    /**
     * @param request the request parameters of CreateVpcBinding  CreateVpcBindingRequest
     * @return CreateVpcBindingResponse
     */
    CompletableFuture<CreateVpcBindingResponse> createVpcBinding(CreateVpcBindingRequest request);

    /**
     * @param request the request parameters of DeleteAlias  DeleteAliasRequest
     * @return DeleteAliasResponse
     */
    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    /**
     * @param request the request parameters of DeleteAsyncInvokeConfig  DeleteAsyncInvokeConfigRequest
     * @return DeleteAsyncInvokeConfigResponse
     */
    CompletableFuture<DeleteAsyncInvokeConfigResponse> deleteAsyncInvokeConfig(DeleteAsyncInvokeConfigRequest request);

    /**
     * @param request the request parameters of DeleteConcurrencyConfig  DeleteConcurrencyConfigRequest
     * @return DeleteConcurrencyConfigResponse
     */
    CompletableFuture<DeleteConcurrencyConfigResponse> deleteConcurrencyConfig(DeleteConcurrencyConfigRequest request);

    /**
     * @param request the request parameters of DeleteCustomDomain  DeleteCustomDomainRequest
     * @return DeleteCustomDomainResponse
     */
    CompletableFuture<DeleteCustomDomainResponse> deleteCustomDomain(DeleteCustomDomainRequest request);

    /**
     * @param request the request parameters of DeleteFunction  DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    /**
     * @param request the request parameters of DeleteFunctionVersion  DeleteFunctionVersionRequest
     * @return DeleteFunctionVersionResponse
     */
    CompletableFuture<DeleteFunctionVersionResponse> deleteFunctionVersion(DeleteFunctionVersionRequest request);

    /**
     * @param request the request parameters of DeleteLayerVersion  DeleteLayerVersionRequest
     * @return DeleteLayerVersionResponse
     */
    CompletableFuture<DeleteLayerVersionResponse> deleteLayerVersion(DeleteLayerVersionRequest request);

    /**
     * @param request the request parameters of DeleteProvisionConfig  DeleteProvisionConfigRequest
     * @return DeleteProvisionConfigResponse
     */
    CompletableFuture<DeleteProvisionConfigResponse> deleteProvisionConfig(DeleteProvisionConfigRequest request);

    /**
     * @param request the request parameters of DeleteTrigger  DeleteTriggerRequest
     * @return DeleteTriggerResponse
     */
    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    /**
     * @param request the request parameters of DeleteVpcBinding  DeleteVpcBindingRequest
     * @return DeleteVpcBindingResponse
     */
    CompletableFuture<DeleteVpcBindingResponse> deleteVpcBinding(DeleteVpcBindingRequest request);

    /**
     * @param request the request parameters of GetAlias  GetAliasRequest
     * @return GetAliasResponse
     */
    CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request);

    /**
     * @param request the request parameters of GetAsyncInvokeConfig  GetAsyncInvokeConfigRequest
     * @return GetAsyncInvokeConfigResponse
     */
    CompletableFuture<GetAsyncInvokeConfigResponse> getAsyncInvokeConfig(GetAsyncInvokeConfigRequest request);

    /**
     * @param request the request parameters of GetAsyncTask  GetAsyncTaskRequest
     * @return GetAsyncTaskResponse
     */
    CompletableFuture<GetAsyncTaskResponse> getAsyncTask(GetAsyncTaskRequest request);

    /**
     * @param request the request parameters of GetConcurrencyConfig  GetConcurrencyConfigRequest
     * @return GetConcurrencyConfigResponse
     */
    CompletableFuture<GetConcurrencyConfigResponse> getConcurrencyConfig(GetConcurrencyConfigRequest request);

    /**
     * @param request the request parameters of GetCustomDomain  GetCustomDomainRequest
     * @return GetCustomDomainResponse
     */
    CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request);

    /**
     * @param request the request parameters of GetFunction  GetFunctionRequest
     * @return GetFunctionResponse
     */
    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    /**
     * @param request the request parameters of GetFunctionCode  GetFunctionCodeRequest
     * @return GetFunctionCodeResponse
     */
    CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request);

    /**
     * @param request the request parameters of GetLayerVersion  GetLayerVersionRequest
     * @return GetLayerVersionResponse
     */
    CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request);

    /**
     * @param request the request parameters of GetLayerVersionByArn  GetLayerVersionByArnRequest
     * @return GetLayerVersionByArnResponse
     */
    CompletableFuture<GetLayerVersionByArnResponse> getLayerVersionByArn(GetLayerVersionByArnRequest request);

    /**
     * @param request the request parameters of GetProvisionConfig  GetProvisionConfigRequest
     * @return GetProvisionConfigResponse
     */
    CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request);

    /**
     * @param request the request parameters of GetTrigger  GetTriggerRequest
     * @return GetTriggerResponse
     */
    CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request);

    /**
     * @param request the request parameters of InvokeFunction  InvokeFunctionRequest
     * @return InvokeFunctionResponse
     */
    CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunctionWithRequestBody(InvokeFunctionRequest request, RequestBody requestBody);

<ReturnT> CompletableFuture<ReturnT> invokeFunctionWithAsyncResponseHandler(InvokeFunctionRequest request, AsyncResponseHandler<InvokeFunctionResponse, ReturnT> responseHandler);

    /**
     * @param request the request parameters of ListAliases  ListAliasesRequest
     * @return ListAliasesResponse
     */
    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    /**
     * @param request the request parameters of ListAsyncInvokeConfigs  ListAsyncInvokeConfigsRequest
     * @return ListAsyncInvokeConfigsResponse
     */
    CompletableFuture<ListAsyncInvokeConfigsResponse> listAsyncInvokeConfigs(ListAsyncInvokeConfigsRequest request);

    /**
     * @param request the request parameters of ListAsyncTasks  ListAsyncTasksRequest
     * @return ListAsyncTasksResponse
     */
    CompletableFuture<ListAsyncTasksResponse> listAsyncTasks(ListAsyncTasksRequest request);

    /**
     * @param request the request parameters of ListConcurrencyConfigs  ListConcurrencyConfigsRequest
     * @return ListConcurrencyConfigsResponse
     */
    CompletableFuture<ListConcurrencyConfigsResponse> listConcurrencyConfigs(ListConcurrencyConfigsRequest request);

    /**
     * @param request the request parameters of ListCustomDomains  ListCustomDomainsRequest
     * @return ListCustomDomainsResponse
     */
    CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request);

    /**
     * @param request the request parameters of ListFunctionVersions  ListFunctionVersionsRequest
     * @return ListFunctionVersionsResponse
     */
    CompletableFuture<ListFunctionVersionsResponse> listFunctionVersions(ListFunctionVersionsRequest request);

    /**
     * @param request the request parameters of ListFunctions  ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListLayerVersions  ListLayerVersionsRequest
     * @return ListLayerVersionsResponse
     */
    CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request);

    /**
     * @param request the request parameters of ListLayers  ListLayersRequest
     * @return ListLayersResponse
     */
    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    /**
     * @param request the request parameters of ListProvisionConfigs  ListProvisionConfigsRequest
     * @return ListProvisionConfigsResponse
     */
    CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTriggers  ListTriggersRequest
     * @return ListTriggersResponse
     */
    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    /**
     * @param request the request parameters of ListVpcBindings  ListVpcBindingsRequest
     * @return ListVpcBindingsResponse
     */
    CompletableFuture<ListVpcBindingsResponse> listVpcBindings(ListVpcBindingsRequest request);

    /**
     * @param request the request parameters of PublishFunctionVersion  PublishFunctionVersionRequest
     * @return PublishFunctionVersionResponse
     */
    CompletableFuture<PublishFunctionVersionResponse> publishFunctionVersion(PublishFunctionVersionRequest request);

    /**
     * @param request the request parameters of PutAsyncInvokeConfig  PutAsyncInvokeConfigRequest
     * @return PutAsyncInvokeConfigResponse
     */
    CompletableFuture<PutAsyncInvokeConfigResponse> putAsyncInvokeConfig(PutAsyncInvokeConfigRequest request);

    /**
     * @param request the request parameters of PutConcurrencyConfig  PutConcurrencyConfigRequest
     * @return PutConcurrencyConfigResponse
     */
    CompletableFuture<PutConcurrencyConfigResponse> putConcurrencyConfig(PutConcurrencyConfigRequest request);

    /**
     * @param request the request parameters of PutLayerACL  PutLayerACLRequest
     * @return PutLayerACLResponse
     */
    CompletableFuture<PutLayerACLResponse> putLayerACL(PutLayerACLRequest request);

    /**
     * @param request the request parameters of PutProvisionConfig  PutProvisionConfigRequest
     * @return PutProvisionConfigResponse
     */
    CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request);

    /**
     * @param request the request parameters of StopAsyncTask  StopAsyncTaskRequest
     * @return StopAsyncTaskResponse
     */
    CompletableFuture<StopAsyncTaskResponse> stopAsyncTask(StopAsyncTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Tags are used to identify resources. Tags allow you to categorize, search for, and aggregate resources that have the same characteristics from different dimensions. This facilitates resource management. For more information, see <a href="https://help.aliyun.com/document_detail/156983.html">Tag overview</a>.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAlias  UpdateAliasRequest
     * @return UpdateAliasResponse
     */
    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    /**
     * @param request the request parameters of UpdateCustomDomain  UpdateCustomDomainRequest
     * @return UpdateCustomDomainResponse
     */
    CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request);

    /**
     * @param request the request parameters of UpdateFunction  UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    /**
     * @param request the request parameters of UpdateTrigger  UpdateTriggerRequest
     * @return UpdateTriggerResponse
     */
    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

}
