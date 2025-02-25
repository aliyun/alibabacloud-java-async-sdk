// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.fc20230330.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "FC";
        this.version = "2023-03-30";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateAlias  CreateAliasRequest
     * @return CreateAliasResponse
     */
    @Override
    public CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAlias").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/aliases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you want to use a fixed domain name to access an application or function in a production environment of Function Compute, or to resolve the issue of forced downloads when accessing an HTTP trigger, you can bind a custom domain name to the application or function.</p>
     * 
     * @param request the request parameters of CreateCustomDomain  CreateCustomDomainRequest
     * @return CreateCustomDomainResponse
     */
    @Override
    public CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCustomDomain").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/custom-domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Resources of Function Compute are scheduled and run based on functions. A function usually refers to a code snippet that is written by a user and can be independently executed to respond to events and requests.</p>
     * 
     * @param request the request parameters of CreateFunction  CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    @Override
    public CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFunction").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLayerVersion  CreateLayerVersionRequest
     * @return CreateLayerVersionResponse
     */
    @Override
    public CompletableFuture<CreateLayerVersionResponse> createLayerVersion(CreateLayerVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLayerVersion").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/layers/{layerName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLayerVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLayerVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTrigger  CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    @Override
    public CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTrigger").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/triggers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVpcBinding  CreateVpcBindingRequest
     * @return CreateVpcBindingResponse
     */
    @Override
    public CompletableFuture<CreateVpcBindingResponse> createVpcBinding(CreateVpcBindingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVpcBinding").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/vpc-bindings").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcBindingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcBindingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlias  DeleteAliasRequest
     * @return DeleteAliasResponse
     */
    @Override
    public CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlias").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/aliases/{aliasName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAsyncInvokeConfig  DeleteAsyncInvokeConfigRequest
     * @return DeleteAsyncInvokeConfigResponse
     */
    @Override
    public CompletableFuture<DeleteAsyncInvokeConfigResponse> deleteAsyncInvokeConfig(DeleteAsyncInvokeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAsyncInvokeConfig").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/async-invoke-config").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAsyncInvokeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAsyncInvokeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConcurrencyConfig  DeleteConcurrencyConfigRequest
     * @return DeleteConcurrencyConfigResponse
     */
    @Override
    public CompletableFuture<DeleteConcurrencyConfigResponse> deleteConcurrencyConfig(DeleteConcurrencyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConcurrencyConfig").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/concurrency").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConcurrencyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConcurrencyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomDomain  DeleteCustomDomainRequest
     * @return DeleteCustomDomainResponse
     */
    @Override
    public CompletableFuture<DeleteCustomDomainResponse> deleteCustomDomain(DeleteCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCustomDomain").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/custom-domains/{domainName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFunction  DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    @Override
    public CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFunction").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFunctionVersion  DeleteFunctionVersionRequest
     * @return DeleteFunctionVersionResponse
     */
    @Override
    public CompletableFuture<DeleteFunctionVersionResponse> deleteFunctionVersion(DeleteFunctionVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFunctionVersion").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/versions/{versionId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFunctionVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFunctionVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLayerVersion  DeleteLayerVersionRequest
     * @return DeleteLayerVersionResponse
     */
    @Override
    public CompletableFuture<DeleteLayerVersionResponse> deleteLayerVersion(DeleteLayerVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLayerVersion").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/layers/{layerName}/versions/{version}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLayerVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLayerVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProvisionConfig  DeleteProvisionConfigRequest
     * @return DeleteProvisionConfigResponse
     */
    @Override
    public CompletableFuture<DeleteProvisionConfigResponse> deleteProvisionConfig(DeleteProvisionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProvisionConfig").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/provision-config").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProvisionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProvisionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTrigger  DeleteTriggerRequest
     * @return DeleteTriggerResponse
     */
    @Override
    public CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTrigger").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/triggers/{triggerName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVpcBinding  DeleteVpcBindingRequest
     * @return DeleteVpcBindingResponse
     */
    @Override
    public CompletableFuture<DeleteVpcBindingResponse> deleteVpcBinding(DeleteVpcBindingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteVpcBinding").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/vpc-bindings/{vpcId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcBindingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcBindingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlias  GetAliasRequest
     * @return GetAliasResponse
     */
    @Override
    public CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlias").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/aliases/{aliasName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAsyncInvokeConfig  GetAsyncInvokeConfigRequest
     * @return GetAsyncInvokeConfigResponse
     */
    @Override
    public CompletableFuture<GetAsyncInvokeConfigResponse> getAsyncInvokeConfig(GetAsyncInvokeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAsyncInvokeConfig").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/async-invoke-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAsyncInvokeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAsyncInvokeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAsyncTask  GetAsyncTaskRequest
     * @return GetAsyncTaskResponse
     */
    @Override
    public CompletableFuture<GetAsyncTaskResponse> getAsyncTask(GetAsyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAsyncTask").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/async-tasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAsyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAsyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConcurrencyConfig  GetConcurrencyConfigRequest
     * @return GetConcurrencyConfigResponse
     */
    @Override
    public CompletableFuture<GetConcurrencyConfigResponse> getConcurrencyConfig(GetConcurrencyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConcurrencyConfig").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/concurrency").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConcurrencyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConcurrencyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomDomain  GetCustomDomainRequest
     * @return GetCustomDomainResponse
     */
    @Override
    public CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCustomDomain").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/custom-domains/{domainName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFunction  GetFunctionRequest
     * @return GetFunctionResponse
     */
    @Override
    public CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFunction").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFunctionCode  GetFunctionCodeRequest
     * @return GetFunctionCodeResponse
     */
    @Override
    public CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFunctionCode").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/code").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFunctionCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFunctionCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLayerVersion  GetLayerVersionRequest
     * @return GetLayerVersionResponse
     */
    @Override
    public CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLayerVersion").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/layers/{layerName}/versions/{version}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLayerVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLayerVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLayerVersionByArn  GetLayerVersionByArnRequest
     * @return GetLayerVersionByArnResponse
     */
    @Override
    public CompletableFuture<GetLayerVersionByArnResponse> getLayerVersionByArn(GetLayerVersionByArnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLayerVersionByArn").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/layerarn/{arn}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLayerVersionByArnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLayerVersionByArnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProvisionConfig  GetProvisionConfigRequest
     * @return GetProvisionConfigResponse
     */
    @Override
    public CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProvisionConfig").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/provision-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProvisionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProvisionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrigger  GetTriggerRequest
     * @return GetTriggerResponse
     */
    @Override
    public CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrigger").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/triggers/{triggerName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvokeFunction  InvokeFunctionRequest
     * @return InvokeFunctionResponse
     */
    @Override
    public CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeFunction").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/invocations").setBodyType(BodyType.BINARY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<InvokeFunctionResponse> invokeFunctionWithRequestBody(InvokeFunctionRequest request, RequestBody requestBody) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeFunction").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/invocations").setBodyType(BodyType.BINARY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withRequestBody(requestBody).withOutput(InvokeFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> invokeFunctionWithAsyncResponseHandler(InvokeFunctionRequest request, AsyncResponseHandler<InvokeFunctionResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeFunction").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/invocations").setBodyType(BodyType.BINARY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(InvokeFunctionResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((InvokeFunctionResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAliases  ListAliasesRequest
     * @return ListAliasesResponse
     */
    @Override
    public CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAliases").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/aliases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAliasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAliasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAsyncInvokeConfigs  ListAsyncInvokeConfigsRequest
     * @return ListAsyncInvokeConfigsResponse
     */
    @Override
    public CompletableFuture<ListAsyncInvokeConfigsResponse> listAsyncInvokeConfigs(ListAsyncInvokeConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAsyncInvokeConfigs").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/async-invoke-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAsyncInvokeConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAsyncInvokeConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAsyncTasks  ListAsyncTasksRequest
     * @return ListAsyncTasksResponse
     */
    @Override
    public CompletableFuture<ListAsyncTasksResponse> listAsyncTasks(ListAsyncTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAsyncTasks").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/async-tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAsyncTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAsyncTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConcurrencyConfigs  ListConcurrencyConfigsRequest
     * @return ListConcurrencyConfigsResponse
     */
    @Override
    public CompletableFuture<ListConcurrencyConfigsResponse> listConcurrencyConfigs(ListConcurrencyConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConcurrencyConfigs").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/concurrency-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConcurrencyConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConcurrencyConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomDomains  ListCustomDomainsRequest
     * @return ListCustomDomainsResponse
     */
    @Override
    public CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCustomDomains").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/custom-domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFunctionVersions  ListFunctionVersionsRequest
     * @return ListFunctionVersionsResponse
     */
    @Override
    public CompletableFuture<ListFunctionVersionsResponse> listFunctionVersions(ListFunctionVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFunctionVersions").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFunctionVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFunctionVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFunctions  ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    @Override
    public CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFunctions").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFunctionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFunctionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLayerVersions  ListLayerVersionsRequest
     * @return ListLayerVersionsResponse
     */
    @Override
    public CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLayerVersions").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/layers/{layerName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLayerVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLayerVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLayers  ListLayersRequest
     * @return ListLayersResponse
     */
    @Override
    public CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLayers").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/layers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLayersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLayersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProvisionConfigs  ListProvisionConfigsRequest
     * @return ListProvisionConfigsResponse
     */
    @Override
    public CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProvisionConfigs").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/provision-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProvisionConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProvisionConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTagResources").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/tags-v2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTriggers  ListTriggersRequest
     * @return ListTriggersResponse
     */
    @Override
    public CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTriggers").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/triggers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTriggersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTriggersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpcBindings  ListVpcBindingsRequest
     * @return ListVpcBindingsResponse
     */
    @Override
    public CompletableFuture<ListVpcBindingsResponse> listVpcBindings(ListVpcBindingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVpcBindings").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/vpc-bindings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcBindingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcBindingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishFunctionVersion  PublishFunctionVersionRequest
     * @return PublishFunctionVersionResponse
     */
    @Override
    public CompletableFuture<PublishFunctionVersionResponse> publishFunctionVersion(PublishFunctionVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishFunctionVersion").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishFunctionVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishFunctionVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutAsyncInvokeConfig  PutAsyncInvokeConfigRequest
     * @return PutAsyncInvokeConfigResponse
     */
    @Override
    public CompletableFuture<PutAsyncInvokeConfigResponse> putAsyncInvokeConfig(PutAsyncInvokeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutAsyncInvokeConfig").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/async-invoke-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutAsyncInvokeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutAsyncInvokeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutConcurrencyConfig  PutConcurrencyConfigRequest
     * @return PutConcurrencyConfigResponse
     */
    @Override
    public CompletableFuture<PutConcurrencyConfigResponse> putConcurrencyConfig(PutConcurrencyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutConcurrencyConfig").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/concurrency").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutConcurrencyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutConcurrencyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutLayerACL  PutLayerACLRequest
     * @return PutLayerACLResponse
     */
    @Override
    public CompletableFuture<PutLayerACLResponse> putLayerACL(PutLayerACLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutLayerACL").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/layers/{layerName}/acl").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutLayerACLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutLayerACLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutProvisionConfig  PutProvisionConfigRequest
     * @return PutProvisionConfigResponse
     */
    @Override
    public CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutProvisionConfig").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/provision-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutProvisionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutProvisionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopAsyncTask  StopAsyncTaskRequest
     * @return StopAsyncTaskResponse
     */
    @Override
    public CompletableFuture<StopAsyncTaskResponse> stopAsyncTask(StopAsyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopAsyncTask").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/async-tasks/{taskId}/stop").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopAsyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopAsyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Tags are used to identify resources. Tags allow you to categorize, search for, and aggregate resources that have the same characteristics from different dimensions. This facilitates resource management. For more information, see <a href="https://help.aliyun.com/document_detail/156983.html">Tag overview</a>.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/tags-v2").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResources").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/tags-v2").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlias  UpdateAliasRequest
     * @return UpdateAliasResponse
     */
    @Override
    public CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlias").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/aliases/{aliasName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomDomain  UpdateCustomDomainRequest
     * @return UpdateCustomDomainResponse
     */
    @Override
    public CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCustomDomain").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/custom-domains/{domainName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFunction  UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    @Override
    public CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFunction").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTrigger  UpdateTriggerRequest
     * @return UpdateTriggerResponse
     */
    @Override
    public CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTrigger").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/triggers/{triggerName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
