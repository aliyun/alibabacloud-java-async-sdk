// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.apig20240327.models.*;
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
        this.product = "APIG";
        this.version = "2024-03-27";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddGatewaySecurityGroupRule  AddGatewaySecurityGroupRuleRequest
     * @return AddGatewaySecurityGroupRuleResponse
     */
    @Override
    public CompletableFuture<AddGatewaySecurityGroupRuleResponse> addGatewaySecurityGroupRule(AddGatewaySecurityGroupRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddGatewaySecurityGroupRule").setMethod(HttpMethod.POST).setPathRegex("/v1/gateways/{gatewayId}/security-group-rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddGatewaySecurityGroupRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddGatewaySecurityGroupRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchDeleteConsumerAuthorizationRule  BatchDeleteConsumerAuthorizationRuleRequest
     * @return BatchDeleteConsumerAuthorizationRuleResponse
     */
    @Override
    public CompletableFuture<BatchDeleteConsumerAuthorizationRuleResponse> batchDeleteConsumerAuthorizationRule(BatchDeleteConsumerAuthorizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchDeleteConsumerAuthorizationRule").setMethod(HttpMethod.DELETE).setPathRegex("/v1/authorization-rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteConsumerAuthorizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteConsumerAuthorizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/move-resource-group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAndAttachPolicy  CreateAndAttachPolicyRequest
     * @return CreateAndAttachPolicyResponse
     */
    @Override
    public CompletableFuture<CreateAndAttachPolicyResponse> createAndAttachPolicy(CreateAndAttachPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAndAttachPolicy").setMethod(HttpMethod.POST).setPathRegex("/v1/policies").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAndAttachPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAndAttachPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateConsumer  CreateConsumerRequest
     * @return CreateConsumerResponse
     */
    @Override
    public CompletableFuture<CreateConsumerResponse> createConsumer(CreateConsumerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConsumer").setMethod(HttpMethod.POST).setPathRegex("/v1/consumers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateConsumerAuthorizationRule  CreateConsumerAuthorizationRuleRequest
     * @return CreateConsumerAuthorizationRuleResponse
     */
    @Override
    public CompletableFuture<CreateConsumerAuthorizationRuleResponse> createConsumerAuthorizationRule(CreateConsumerAuthorizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConsumerAuthorizationRule").setMethod(HttpMethod.POST).setPathRegex("/v1/consumers/{consumerId}/authorization-rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerAuthorizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerAuthorizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateConsumerAuthorizationRules  CreateConsumerAuthorizationRulesRequest
     * @return CreateConsumerAuthorizationRulesResponse
     */
    @Override
    public CompletableFuture<CreateConsumerAuthorizationRulesResponse> createConsumerAuthorizationRules(CreateConsumerAuthorizationRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConsumerAuthorizationRules").setMethod(HttpMethod.POST).setPathRegex("/v1/authorization-rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerAuthorizationRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerAuthorizationRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Create Domain.</p>
     * 
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    @Override
    public CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDomain").setMethod(HttpMethod.POST).setPathRegex("/v1/domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateEnvironment is deprecated  * @description Create environment.
     * 
     * @param request the request parameters of CreateEnvironment  CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateEnvironment").setMethod(HttpMethod.POST).setPathRegex("/v1/environments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEnvironmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEnvironmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateGateway  CreateGatewayRequest
     * @return CreateGatewayResponse
     */
    @Override
    public CompletableFuture<CreateGatewayResponse> createGateway(CreateGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateGateway").setMethod(HttpMethod.POST).setPathRegex("/v1/gateways").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHttpApi  CreateHttpApiRequest
     * @return CreateHttpApiResponse
     */
    @Override
    public CompletableFuture<CreateHttpApiResponse> createHttpApi(CreateHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateHttpApi").setMethod(HttpMethod.POST).setPathRegex("/v1/http-apis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHttpApiOperation  CreateHttpApiOperationRequest
     * @return CreateHttpApiOperationResponse
     */
    @Override
    public CompletableFuture<CreateHttpApiOperationResponse> createHttpApiOperation(CreateHttpApiOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateHttpApiOperation").setMethod(HttpMethod.POST).setPathRegex("/v1/http-apis/{httpApiId}/operations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHttpApiOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHttpApiOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHttpApiRoute  CreateHttpApiRouteRequest
     * @return CreateHttpApiRouteResponse
     */
    @Override
    public CompletableFuture<CreateHttpApiRouteResponse> createHttpApiRoute(CreateHttpApiRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateHttpApiRoute").setMethod(HttpMethod.POST).setPathRegex("/v1/http-apis/{httpApiId}/routes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHttpApiRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHttpApiRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMcpServer  CreateMcpServerRequest
     * @return CreateMcpServerResponse
     */
    @Override
    public CompletableFuture<CreateMcpServerResponse> createMcpServer(CreateMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMcpServer").setMethod(HttpMethod.POST).setPathRegex("/v1/mcp-servers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePluginAttachment  CreatePluginAttachmentRequest
     * @return CreatePluginAttachmentResponse
     */
    @Override
    public CompletableFuture<CreatePluginAttachmentResponse> createPluginAttachment(CreatePluginAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePluginAttachment").setMethod(HttpMethod.POST).setPathRegex("/v1/plugin-attachments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePluginAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePluginAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    @Override
    public CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePolicy").setMethod(HttpMethod.POST).setPathRegex("/v2/policies").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePolicyAttachment  CreatePolicyAttachmentRequest
     * @return CreatePolicyAttachmentResponse
     */
    @Override
    public CompletableFuture<CreatePolicyAttachmentResponse> createPolicyAttachment(CreatePolicyAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePolicyAttachment").setMethod(HttpMethod.POST).setPathRegex("/v1/policy-attachments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePolicyAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePolicyAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * @param request the request parameters of CreateService  CreateServiceRequest
     * @return CreateServiceResponse
     */
    @Override
    public CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateService").setMethod(HttpMethod.POST).setPathRegex("/v1/services").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceVersion  CreateServiceVersionRequest
     * @return CreateServiceVersionResponse
     */
    @Override
    public CompletableFuture<CreateServiceVersionResponse> createServiceVersion(CreateServiceVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateServiceVersion").setMethod(HttpMethod.POST).setPathRegex("/v1/services/{serviceId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSource  CreateSourceRequest
     * @return CreateSourceResponse
     */
    @Override
    public CompletableFuture<CreateSourceResponse> createSource(CreateSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSource").setMethod(HttpMethod.POST).setPathRegex("/v1/sources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConsumer  DeleteConsumerRequest
     * @return DeleteConsumerResponse
     */
    @Override
    public CompletableFuture<DeleteConsumerResponse> deleteConsumer(DeleteConsumerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConsumer").setMethod(HttpMethod.DELETE).setPathRegex("/v1/consumers/{consumerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConsumerAuthorizationRule  DeleteConsumerAuthorizationRuleRequest
     * @return DeleteConsumerAuthorizationRuleResponse
     */
    @Override
    public CompletableFuture<DeleteConsumerAuthorizationRuleResponse> deleteConsumerAuthorizationRule(DeleteConsumerAuthorizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConsumerAuthorizationRule").setMethod(HttpMethod.DELETE).setPathRegex("/v1/consumers/{consumerId}/authorization-rules/{consumerAuthorizationRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerAuthorizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerAuthorizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    @Override
    public CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDomain").setMethod(HttpMethod.DELETE).setPathRegex("/v1/domains/{domainId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteEnvironment is deprecated  * @param request  the request parameters of DeleteEnvironment  DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteEnvironment").setMethod(HttpMethod.DELETE).setPathRegex("/v1/environments/{environmentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEnvironmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEnvironmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGateway  DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    @Override
    public CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteGateway").setMethod(HttpMethod.DELETE).setPathRegex("/v1/gateways/{gatewayId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGatewaySecurityGroupRule  DeleteGatewaySecurityGroupRuleRequest
     * @return DeleteGatewaySecurityGroupRuleResponse
     */
    @Override
    public CompletableFuture<DeleteGatewaySecurityGroupRuleResponse> deleteGatewaySecurityGroupRule(DeleteGatewaySecurityGroupRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteGatewaySecurityGroupRule").setMethod(HttpMethod.DELETE).setPathRegex("/v1/gateways/{gatewayId}/security-group-rules/{securityGroupRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGatewaySecurityGroupRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGatewaySecurityGroupRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHttpApi  DeleteHttpApiRequest
     * @return DeleteHttpApiResponse
     */
    @Override
    public CompletableFuture<DeleteHttpApiResponse> deleteHttpApi(DeleteHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteHttpApi").setMethod(HttpMethod.DELETE).setPathRegex("/v1/http-apis/{httpApiId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHttpApiOperation  DeleteHttpApiOperationRequest
     * @return DeleteHttpApiOperationResponse
     */
    @Override
    public CompletableFuture<DeleteHttpApiOperationResponse> deleteHttpApiOperation(DeleteHttpApiOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteHttpApiOperation").setMethod(HttpMethod.DELETE).setPathRegex("/v1/http-apis/{httpApiId}/operations/{operationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHttpApiOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHttpApiOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHttpApiRoute  DeleteHttpApiRouteRequest
     * @return DeleteHttpApiRouteResponse
     */
    @Override
    public CompletableFuture<DeleteHttpApiRouteResponse> deleteHttpApiRoute(DeleteHttpApiRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteHttpApiRoute").setMethod(HttpMethod.DELETE).setPathRegex("/v1/http-apis/{httpApiId}/routes/{routeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHttpApiRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHttpApiRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMcpServer  DeleteMcpServerRequest
     * @return DeleteMcpServerResponse
     */
    @Override
    public CompletableFuture<DeleteMcpServerResponse> deleteMcpServer(DeleteMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMcpServer").setMethod(HttpMethod.DELETE).setPathRegex("/v1/mcp-servers/{mcpServerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePluginAttachment  DeletePluginAttachmentRequest
     * @return DeletePluginAttachmentResponse
     */
    @Override
    public CompletableFuture<DeletePluginAttachmentResponse> deletePluginAttachment(DeletePluginAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePluginAttachment").setMethod(HttpMethod.DELETE).setPathRegex("/v1/plugin-attachments/{pluginAttachmentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePluginAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePluginAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    @Override
    public CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePolicy").setMethod(HttpMethod.DELETE).setPathRegex("/v2/policies/{policyId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePolicyAttachment  DeletePolicyAttachmentRequest
     * @return DeletePolicyAttachmentResponse
     */
    @Override
    public CompletableFuture<DeletePolicyAttachmentResponse> deletePolicyAttachment(DeletePolicyAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePolicyAttachment").setMethod(HttpMethod.DELETE).setPathRegex("/v1/policy-attachments/{policyAttachmentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePolicyAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePolicyAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteService  DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    @Override
    public CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteService").setMethod(HttpMethod.DELETE).setPathRegex("/v1/services/{serviceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteServiceVersion  DeleteServiceVersionRequest
     * @return DeleteServiceVersionResponse
     */
    @Override
    public CompletableFuture<DeleteServiceVersionResponse> deleteServiceVersion(DeleteServiceVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteServiceVersion").setMethod(HttpMethod.DELETE).setPathRegex("/v1/services/{serviceId}/versions/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSource  DeleteSourceRequest
     * @return DeleteSourceResponse
     */
    @Override
    public CompletableFuture<DeleteSourceResponse> deleteSource(DeleteSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSource").setMethod(HttpMethod.DELETE).setPathRegex("/v1/sources/{sourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployHttpApi  DeployHttpApiRequest
     * @return DeployHttpApiResponse
     */
    @Override
    public CompletableFuture<DeployHttpApiResponse> deployHttpApi(DeployHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeployHttpApi").setMethod(HttpMethod.POST).setPathRegex("/v1/http-apis/{httpApiId}/deploy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployMcpServer  DeployMcpServerRequest
     * @return DeployMcpServerResponse
     */
    @Override
    public CompletableFuture<DeployMcpServerResponse> deployMcpServer(DeployMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeployMcpServer").setMethod(HttpMethod.POST).setPathRegex("/v1/mcp-servers/{mcpServerId}/deploy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportHttpApi  ExportHttpApiRequest
     * @return ExportHttpApiResponse
     */
    @Override
    public CompletableFuture<ExportHttpApiResponse> exportHttpApi(ExportHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportHttpApi").setMethod(HttpMethod.POST).setPathRegex("/v1/http-apis/{httpApiId}/export").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConsumer  GetConsumerRequest
     * @return GetConsumerResponse
     */
    @Override
    public CompletableFuture<GetConsumerResponse> getConsumer(GetConsumerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConsumer").setMethod(HttpMethod.GET).setPathRegex("/v1/consumers/{consumerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConsumerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConsumerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConsumerAuthorizationRule  GetConsumerAuthorizationRuleRequest
     * @return GetConsumerAuthorizationRuleResponse
     */
    @Override
    public CompletableFuture<GetConsumerAuthorizationRuleResponse> getConsumerAuthorizationRule(GetConsumerAuthorizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConsumerAuthorizationRule").setMethod(HttpMethod.GET).setPathRegex("/v1/consumers/{consumerId}/authorization-rules/{consumerAuthorizationRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConsumerAuthorizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConsumerAuthorizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDashboard  GetDashboardRequest
     * @return GetDashboardResponse
     */
    @Override
    public CompletableFuture<GetDashboardResponse> getDashboard(GetDashboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDashboard").setMethod(HttpMethod.GET).setPathRegex("/v1/gateways/{gatewayId}/dashboards").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDashboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDashboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDomain  GetDomainRequest
     * @return GetDomainResponse
     */
    @Override
    public CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDomain").setMethod(HttpMethod.GET).setPathRegex("/v1/domains/{domainId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetEnvironment is deprecated  * @param request  the request parameters of GetEnvironment  GetEnvironmentRequest
     * @return GetEnvironmentResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetEnvironmentResponse> getEnvironment(GetEnvironmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEnvironment").setMethod(HttpMethod.GET).setPathRegex("/v1/environments/{environmentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEnvironmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEnvironmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetGateway  GetGatewayRequest
     * @return GetGatewayResponse
     */
    @Override
    public CompletableFuture<GetGatewayResponse> getGateway(GetGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGateway").setMethod(HttpMethod.GET).setPathRegex("/v1/gateways/{gatewayId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHttpApi  GetHttpApiRequest
     * @return GetHttpApiResponse
     */
    @Override
    public CompletableFuture<GetHttpApiResponse> getHttpApi(GetHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHttpApi").setMethod(HttpMethod.GET).setPathRegex("/v1/http-apis/{httpApiId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHttpApiOperation  GetHttpApiOperationRequest
     * @return GetHttpApiOperationResponse
     */
    @Override
    public CompletableFuture<GetHttpApiOperationResponse> getHttpApiOperation(GetHttpApiOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHttpApiOperation").setMethod(HttpMethod.GET).setPathRegex("/v1/http-apis/{httpApiId}/operations/{operationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHttpApiOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHttpApiOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHttpApiRoute  GetHttpApiRouteRequest
     * @return GetHttpApiRouteResponse
     */
    @Override
    public CompletableFuture<GetHttpApiRouteResponse> getHttpApiRoute(GetHttpApiRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHttpApiRoute").setMethod(HttpMethod.GET).setPathRegex("/v1/http-apis/{httpApiId}/routes/{routeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHttpApiRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHttpApiRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * @param request the request parameters of GetMcpServer  GetMcpServerRequest
     * @return GetMcpServerResponse
     */
    @Override
    public CompletableFuture<GetMcpServerResponse> getMcpServer(GetMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMcpServer").setMethod(HttpMethod.GET).setPathRegex("/v1/mcp-servers/{mcpServerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPluginAttachment  GetPluginAttachmentRequest
     * @return GetPluginAttachmentResponse
     */
    @Override
    public CompletableFuture<GetPluginAttachmentResponse> getPluginAttachment(GetPluginAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPluginAttachment").setMethod(HttpMethod.GET).setPathRegex("/v1/plugin-attachments/{pluginAttachmentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPluginAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPluginAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPolicy  GetPolicyRequest
     * @return GetPolicyResponse
     */
    @Override
    public CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPolicy").setMethod(HttpMethod.GET).setPathRegex("/v2/policies/{policyId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPolicyAttachment  GetPolicyAttachmentRequest
     * @return GetPolicyAttachmentResponse
     */
    @Override
    public CompletableFuture<GetPolicyAttachmentResponse> getPolicyAttachment(GetPolicyAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPolicyAttachment").setMethod(HttpMethod.GET).setPathRegex("/v1/policy-attachments/{policyAttachmentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPolicyAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPolicyAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceOverview  GetResourceOverviewRequest
     * @return GetResourceOverviewResponse
     */
    @Override
    public CompletableFuture<GetResourceOverviewResponse> getResourceOverview(GetResourceOverviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceOverview").setMethod(HttpMethod.GET).setPathRegex("/v1/overview/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceOverviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceOverviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetService  GetServiceRequest
     * @return GetServiceResponse
     */
    @Override
    public CompletableFuture<GetServiceResponse> getService(GetServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetService").setMethod(HttpMethod.GET).setPathRegex("/v1/services/{serviceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSource  GetSourceRequest
     * @return GetSourceResponse
     */
    @Override
    public CompletableFuture<GetSourceResponse> getSource(GetSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSource").setMethod(HttpMethod.GET).setPathRegex("/v1/sources/{sourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTraceConfig  GetTraceConfigRequest
     * @return GetTraceConfigResponse
     */
    @Override
    public CompletableFuture<GetTraceConfigResponse> getTraceConfig(GetTraceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTraceConfig").setMethod(HttpMethod.GET).setPathRegex("/v1/gateways/{gatewayId}/trace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTraceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTraceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportHttpApi  ImportHttpApiRequest
     * @return ImportHttpApiResponse
     */
    @Override
    public CompletableFuture<ImportHttpApiResponse> importHttpApi(ImportHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ImportHttpApi").setMethod(HttpMethod.POST).setPathRegex("/v1/http-apis/import").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallPlugin  InstallPluginRequest
     * @return InstallPluginResponse
     */
    @Override
    public CompletableFuture<InstallPluginResponse> installPlugin(InstallPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallPlugin").setMethod(HttpMethod.POST).setPathRegex("/v1/plugins/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConsumerAuthorizationRules  ListConsumerAuthorizationRulesRequest
     * @return ListConsumerAuthorizationRulesResponse
     */
    @Override
    public CompletableFuture<ListConsumerAuthorizationRulesResponse> listConsumerAuthorizationRules(ListConsumerAuthorizationRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConsumerAuthorizationRules").setMethod(HttpMethod.GET).setPathRegex("/v1/consumers/{consumerId}/authorization-rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConsumerAuthorizationRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConsumerAuthorizationRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConsumers  ListConsumersRequest
     * @return ListConsumersResponse
     */
    @Override
    public CompletableFuture<ListConsumersResponse> listConsumers(ListConsumersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConsumers").setMethod(HttpMethod.GET).setPathRegex("/v1/consumers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConsumersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConsumersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    @Override
    public CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDomains").setMethod(HttpMethod.GET).setPathRegex("/v1/domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListEnvironments is deprecated  * @param request  the request parameters of ListEnvironments  ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEnvironments").setMethod(HttpMethod.GET).setPathRegex("/v1/environments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnvironmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnvironmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGatewayFeatures  ListGatewayFeaturesRequest
     * @return ListGatewayFeaturesResponse
     */
    @Override
    public CompletableFuture<ListGatewayFeaturesResponse> listGatewayFeatures(ListGatewayFeaturesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGatewayFeatures").setMethod(HttpMethod.GET).setPathRegex("/v1/gateways/{gatewayId}/gateway-features").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGatewayFeaturesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGatewayFeaturesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGateways  ListGatewaysRequest
     * @return ListGatewaysResponse
     */
    @Override
    public CompletableFuture<ListGatewaysResponse> listGateways(ListGatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGateways").setMethod(HttpMethod.GET).setPathRegex("/v1/gateways").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHttpApiOperations  ListHttpApiOperationsRequest
     * @return ListHttpApiOperationsResponse
     */
    @Override
    public CompletableFuture<ListHttpApiOperationsResponse> listHttpApiOperations(ListHttpApiOperationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHttpApiOperations").setMethod(HttpMethod.GET).setPathRegex("/v1/http-apis/{httpApiId}/operations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHttpApiOperationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHttpApiOperationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHttpApiRoutes  ListHttpApiRoutesRequest
     * @return ListHttpApiRoutesResponse
     */
    @Override
    public CompletableFuture<ListHttpApiRoutesResponse> listHttpApiRoutes(ListHttpApiRoutesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHttpApiRoutes").setMethod(HttpMethod.GET).setPathRegex("/v1/http-apis/{httpApiId}/routes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHttpApiRoutesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHttpApiRoutesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHttpApis  ListHttpApisRequest
     * @return ListHttpApisResponse
     */
    @Override
    public CompletableFuture<ListHttpApisResponse> listHttpApis(ListHttpApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHttpApis").setMethod(HttpMethod.GET).setPathRegex("/v1/http-apis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHttpApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHttpApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * @param request the request parameters of ListMcpServers  ListMcpServersRequest
     * @return ListMcpServersResponse
     */
    @Override
    public CompletableFuture<ListMcpServersResponse> listMcpServers(ListMcpServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMcpServers").setMethod(HttpMethod.GET).setPathRegex("/v1/mcp-servers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMcpServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMcpServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPluginAttachments  ListPluginAttachmentsRequest
     * @return ListPluginAttachmentsResponse
     */
    @Override
    public CompletableFuture<ListPluginAttachmentsResponse> listPluginAttachments(ListPluginAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPluginAttachments").setMethod(HttpMethod.GET).setPathRegex("/v1/plugin-attachments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPluginAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPluginAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPluginClasses  ListPluginClassesRequest
     * @return ListPluginClassesResponse
     */
    @Override
    public CompletableFuture<ListPluginClassesResponse> listPluginClasses(ListPluginClassesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPluginClasses").setMethod(HttpMethod.GET).setPathRegex("/v1/plugin-classes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPluginClassesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPluginClassesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPlugins  ListPluginsRequest
     * @return ListPluginsResponse
     */
    @Override
    public CompletableFuture<ListPluginsResponse> listPlugins(ListPluginsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPlugins").setMethod(HttpMethod.GET).setPathRegex("/v1/plugins").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPluginsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPluginsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    @Override
    public CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPolicies").setMethod(HttpMethod.GET).setPathRegex("/v1/policies").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPolicyClasses  ListPolicyClassesRequest
     * @return ListPolicyClassesResponse
     */
    @Override
    public CompletableFuture<ListPolicyClassesResponse> listPolicyClasses(ListPolicyClassesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPolicyClasses").setMethod(HttpMethod.GET).setPathRegex("/v1/policy-classes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPolicyClassesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPolicyClassesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    @Override
    public CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServices").setMethod(HttpMethod.GET).setPathRegex("/v1/services").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSslCerts  ListSslCertsRequest
     * @return ListSslCertsResponse
     */
    @Override
    public CompletableFuture<ListSslCertsResponse> listSslCerts(ListSslCertsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSslCerts").setMethod(HttpMethod.GET).setPathRegex("/v1/ssl/certs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSslCertsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSslCertsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListZones  ListZonesRequest
     * @return ListZonesResponse
     */
    @Override
    public CompletableFuture<ListZonesResponse> listZones(ListZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListZones").setMethod(HttpMethod.GET).setPathRegex("/v1/zones").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryConsumerAuthorizationRules  QueryConsumerAuthorizationRulesRequest
     * @return QueryConsumerAuthorizationRulesResponse
     */
    @Override
    public CompletableFuture<QueryConsumerAuthorizationRulesResponse> queryConsumerAuthorizationRules(QueryConsumerAuthorizationRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryConsumerAuthorizationRules").setMethod(HttpMethod.GET).setPathRegex("/v1/authorization-rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryConsumerAuthorizationRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryConsumerAuthorizationRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveConsumerAuthorizationRule  RemoveConsumerAuthorizationRuleRequest
     * @return RemoveConsumerAuthorizationRuleResponse
     */
    @Override
    public CompletableFuture<RemoveConsumerAuthorizationRuleResponse> removeConsumerAuthorizationRule(RemoveConsumerAuthorizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveConsumerAuthorizationRule").setMethod(HttpMethod.DELETE).setPathRegex("/v1/authorization-rules/{consumerAuthorizationRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveConsumerAuthorizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveConsumerAuthorizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartGateway  RestartGatewayRequest
     * @return RestartGatewayResponse
     */
    @Override
    public CompletableFuture<RestartGatewayResponse> restartGateway(RestartGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartGateway").setMethod(HttpMethod.POST).setPathRegex("/v1/gateways/{gatewayId}/restart").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncMCPServers  SyncMCPServersRequest
     * @return SyncMCPServersResponse
     */
    @Override
    public CompletableFuture<SyncMCPServersResponse> syncMCPServers(SyncMCPServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncMCPServers").setMethod(HttpMethod.POST).setPathRegex("/v1/mcp-servers/sync-mcp-server").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncMCPServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncMCPServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnDeployMcpServer  UnDeployMcpServerRequest
     * @return UnDeployMcpServerResponse
     */
    @Override
    public CompletableFuture<UnDeployMcpServerResponse> unDeployMcpServer(UnDeployMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnDeployMcpServer").setMethod(HttpMethod.POST).setPathRegex("/v1/mcp-servers/{mcpServerId}/undeploy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnDeployMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnDeployMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UndeployHttpApi  UndeployHttpApiRequest
     * @return UndeployHttpApiResponse
     */
    @Override
    public CompletableFuture<UndeployHttpApiResponse> undeployHttpApi(UndeployHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UndeployHttpApi").setMethod(HttpMethod.POST).setPathRegex("/v1/http-apis/{httpApiId}/undeploy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UndeployHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UndeployHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UninstallPlugin  UninstallPluginRequest
     * @return UninstallPluginResponse
     */
    @Override
    public CompletableFuture<UninstallPluginResponse> uninstallPlugin(UninstallPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallPlugin").setMethod(HttpMethod.DELETE).setPathRegex("/v1/plugins/{pluginId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAndAttachPolicy  UpdateAndAttachPolicyRequest
     * @return UpdateAndAttachPolicyResponse
     */
    @Override
    public CompletableFuture<UpdateAndAttachPolicyResponse> updateAndAttachPolicy(UpdateAndAttachPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAndAttachPolicy").setMethod(HttpMethod.PUT).setPathRegex("/v1/policies/{policyId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAndAttachPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAndAttachPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateConsumer  UpdateConsumerRequest
     * @return UpdateConsumerResponse
     */
    @Override
    public CompletableFuture<UpdateConsumerResponse> updateConsumer(UpdateConsumerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConsumer").setMethod(HttpMethod.PUT).setPathRegex("/v1/consumers/{consumerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConsumerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConsumerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateConsumerAuthorizationRule  UpdateConsumerAuthorizationRuleRequest
     * @return UpdateConsumerAuthorizationRuleResponse
     */
    @Override
    public CompletableFuture<UpdateConsumerAuthorizationRuleResponse> updateConsumerAuthorizationRule(UpdateConsumerAuthorizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConsumerAuthorizationRule").setMethod(HttpMethod.PUT).setPathRegex("/v1/consumers/{consumerId}/authorization-rules/{consumerAuthorizationRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConsumerAuthorizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConsumerAuthorizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDomain  UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    @Override
    public CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDomain").setMethod(HttpMethod.PUT).setPathRegex("/v1/domains/{domainId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateEnvironment is deprecated  * @param request  the request parameters of UpdateEnvironment  UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEnvironment").setMethod(HttpMethod.PUT).setPathRegex("/v1/environments/{environmentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEnvironmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEnvironmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateGatewayFeature  UpdateGatewayFeatureRequest
     * @return UpdateGatewayFeatureResponse
     */
    @Override
    public CompletableFuture<UpdateGatewayFeatureResponse> updateGatewayFeature(UpdateGatewayFeatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateGatewayFeature").setMethod(HttpMethod.PUT).setPathRegex("/v1/gateways/{gatewayId}/gateway-features/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGatewayFeatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGatewayFeatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateGatewayName  UpdateGatewayNameRequest
     * @return UpdateGatewayNameResponse
     */
    @Override
    public CompletableFuture<UpdateGatewayNameResponse> updateGatewayName(UpdateGatewayNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateGatewayName").setMethod(HttpMethod.PUT).setPathRegex("/v1/gateways/{gatewayId}/name").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGatewayNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGatewayNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHttpApi  UpdateHttpApiRequest
     * @return UpdateHttpApiResponse
     */
    @Override
    public CompletableFuture<UpdateHttpApiResponse> updateHttpApi(UpdateHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHttpApi").setMethod(HttpMethod.PUT).setPathRegex("/v1/http-apis/{httpApiId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHttpApiOperation  UpdateHttpApiOperationRequest
     * @return UpdateHttpApiOperationResponse
     */
    @Override
    public CompletableFuture<UpdateHttpApiOperationResponse> updateHttpApiOperation(UpdateHttpApiOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHttpApiOperation").setMethod(HttpMethod.POST).setPathRegex("/v1/http-apis/{httpApiId}/operations/{operationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHttpApiOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHttpApiOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHttpApiRoute  UpdateHttpApiRouteRequest
     * @return UpdateHttpApiRouteResponse
     */
    @Override
    public CompletableFuture<UpdateHttpApiRouteResponse> updateHttpApiRoute(UpdateHttpApiRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHttpApiRoute").setMethod(HttpMethod.PUT).setPathRegex("/v1/http-apis/{httpApiId}/routes/{routeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHttpApiRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHttpApiRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can only update the listening Ingress configuration for sources of the <strong>ACK</strong> type.</p>
     * 
     * @param request the request parameters of UpdateMcpServer  UpdateMcpServerRequest
     * @return UpdateMcpServerResponse
     */
    @Override
    public CompletableFuture<UpdateMcpServerResponse> updateMcpServer(UpdateMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMcpServer").setMethod(HttpMethod.PUT).setPathRegex("/v1/mcp-servers/{mcpServerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePluginAttachment  UpdatePluginAttachmentRequest
     * @return UpdatePluginAttachmentResponse
     */
    @Override
    public CompletableFuture<UpdatePluginAttachmentResponse> updatePluginAttachment(UpdatePluginAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePluginAttachment").setMethod(HttpMethod.PUT).setPathRegex("/v1/plugin-attachments/{pluginAttachmentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePluginAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePluginAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePolicy  UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    @Override
    public CompletableFuture<UpdatePolicyResponse> updatePolicy(UpdatePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePolicy").setMethod(HttpMethod.PUT).setPathRegex("/v2/policies/{policyId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateService  UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    @Override
    public CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateService").setMethod(HttpMethod.PUT).setPathRegex("/v1/services/{serviceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateServiceVersion  UpdateServiceVersionRequest
     * @return UpdateServiceVersionResponse
     */
    @Override
    public CompletableFuture<UpdateServiceVersionResponse> updateServiceVersion(UpdateServiceVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateServiceVersion").setMethod(HttpMethod.PUT).setPathRegex("/v1/services/{serviceId}/versions/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServiceVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServiceVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeGateway  UpgradeGatewayRequest
     * @return UpgradeGatewayResponse
     */
    @Override
    public CompletableFuture<UpgradeGatewayResponse> upgradeGateway(UpgradeGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeGateway").setMethod(HttpMethod.POST).setPathRegex("/v1/gateways/{gatewayId}/upgrade").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
