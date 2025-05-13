// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sae20190506.models.*;
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
        this.product = "sae";
        this.version = "2019-05-06";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AbortAndRollbackChangeOrder  AbortAndRollbackChangeOrderRequest
     * @return AbortAndRollbackChangeOrderResponse
     */
    @Override
    public CompletableFuture<AbortAndRollbackChangeOrderResponse> abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AbortAndRollbackChangeOrder").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/changeorder/AbortAndRollbackChangeOrder").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AbortAndRollbackChangeOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AbortAndRollbackChangeOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AbortChangeOrder  AbortChangeOrderRequest
     * @return AbortChangeOrderResponse
     */
    @Override
    public CompletableFuture<AbortChangeOrderResponse> abortChangeOrder(AbortChangeOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AbortChangeOrder").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/changeorder/AbortChangeOrder").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AbortChangeOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AbortChangeOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchStartApplications  BatchStartApplicationsRequest
     * @return BatchStartApplicationsResponse
     */
    @Override
    public CompletableFuture<BatchStartApplicationsResponse> batchStartApplications(BatchStartApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchStartApplications").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/batchStartApplications").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchStartApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchStartApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchStopApplications  BatchStopApplicationsRequest
     * @return BatchStopApplicationsResponse
     */
    @Override
    public CompletableFuture<BatchStopApplicationsResponse> batchStopApplications(BatchStopApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchStopApplications").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/batchStopApplications").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchStopApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchStopApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindSlb  BindSlbRequest
     * @return BindSlbResponse
     */
    @Override
    public CompletableFuture<BindSlbResponse> bindSlb(BindSlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BindSlb").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/app/slb").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindSlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindSlbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConfirmPipelineBatch  ConfirmPipelineBatchRequest
     * @return ConfirmPipelineBatchResponse
     */
    @Override
    public CompletableFuture<ConfirmPipelineBatchResponse> confirmPipelineBatch(ConfirmPipelineBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ConfirmPipelineBatch").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/changeorder/ConfirmPipelineBatch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmPipelineBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmPipelineBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    @Override
    public CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/app/createApplication").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The HTTP status code. Take note of the following rules:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateApplicationScalingRule  CreateApplicationScalingRuleRequest
     * @return CreateApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<CreateApplicationScalingRuleResponse> createApplicationScalingRule(CreateApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateApplicationScalingRule").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/scale/applicationScalingRule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateConfigMap  CreateConfigMapRequest
     * @return CreateConfigMapResponse
     */
    @Override
    public CompletableFuture<CreateConfigMapResponse> createConfigMap(CreateConfigMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConfigMap").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/configmap/configMap").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConfigMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConfigMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can configure only one canary release rule for each application.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateGreyTagRoute  CreateGreyTagRouteRequest
     * @return CreateGreyTagRouteResponse
     */
    @Override
    public CompletableFuture<CreateGreyTagRouteResponse> createGreyTagRoute(CreateGreyTagRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateGreyTagRoute").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/tagroute/greyTagRoute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGreyTagRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGreyTagRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIngress  CreateIngressRequest
     * @return CreateIngressResponse
     */
    @Override
    public CompletableFuture<CreateIngressResponse> createIngress(CreateIngressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIngress").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/ingress/Ingress").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIngressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIngressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    @Override
    public CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateJob").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/job/createJob").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateNamespace  CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    @Override
    public CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateNamespace").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/paas/namespace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSecret  CreateSecretRequest
     * @return CreateSecretResponse
     */
    @Override
    public CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSecret").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/secret/secret").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the CreateWebApplication operation to create a web application.</p>
     * 
     * @param request the request parameters of CreateWebApplication  CreateWebApplicationRequest
     * @return CreateWebApplicationResponse
     */
    @Override
    public CompletableFuture<CreateWebApplicationResponse> createWebApplication(CreateWebApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWebApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v2/api/web/applications").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWebApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWebApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Create a custom domain name for the web application.</p>
     * 
     * @param request the request parameters of CreateWebCustomDomain  CreateWebCustomDomainRequest
     * @return CreateWebCustomDomainResponse
     */
    @Override
    public CompletableFuture<CreateWebCustomDomainResponse> createWebCustomDomain(CreateWebCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWebCustomDomain").setMethod(HttpMethod.POST).setPathRegex("/pop/v2/api/web/custom-domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWebCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWebCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    @Override
    public CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteApplication").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/app/deleteApplication").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteApplicationScalingRule  DeleteApplicationScalingRuleRequest
     * @return DeleteApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<DeleteApplicationScalingRuleResponse> deleteApplicationScalingRule(DeleteApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteApplicationScalingRule").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/scale/applicationScalingRule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConfigMap  DeleteConfigMapRequest
     * @return DeleteConfigMapResponse
     */
    @Override
    public CompletableFuture<DeleteConfigMapResponse> deleteConfigMap(DeleteConfigMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConfigMap").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/configmap/configMap").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConfigMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConfigMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGreyTagRoute  DeleteGreyTagRouteRequest
     * @return DeleteGreyTagRouteResponse
     */
    @Override
    public CompletableFuture<DeleteGreyTagRouteResponse> deleteGreyTagRoute(DeleteGreyTagRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteGreyTagRoute").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/tagroute/greyTagRoute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGreyTagRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGreyTagRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHistoryJob  DeleteHistoryJobRequest
     * @return DeleteHistoryJobResponse
     */
    @Override
    public CompletableFuture<DeleteHistoryJobResponse> deleteHistoryJob(DeleteHistoryJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteHistoryJob").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/job/deleteHistoryJob").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHistoryJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHistoryJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteIngress  DeleteIngressRequest
     * @return DeleteIngressResponse
     */
    @Override
    public CompletableFuture<DeleteIngressResponse> deleteIngress(DeleteIngressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIngress").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/ingress/Ingress").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIngressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIngressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteJob  DeleteJobRequest
     * @return DeleteJobResponse
     */
    @Override
    public CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteJob").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/job/deleteJob").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteNamespace  DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    @Override
    public CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteNamespace").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/paas/namespace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSecret  DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    @Override
    public CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSecret").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/secret/secret").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the DeleteWebApplication operation to delete a web application.</p>
     * 
     * @param request the request parameters of DeleteWebApplication  DeleteWebApplicationRequest
     * @return DeleteWebApplicationResponse
     */
    @Override
    public CompletableFuture<DeleteWebApplicationResponse> deleteWebApplication(DeleteWebApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWebApplication").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v2/api/web/applications/{ApplicationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWebApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWebApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Delete a web application version.</p>
     * 
     * @param request the request parameters of DeleteWebApplicationRevision  DeleteWebApplicationRevisionRequest
     * @return DeleteWebApplicationRevisionResponse
     */
    @Override
    public CompletableFuture<DeleteWebApplicationRevisionResponse> deleteWebApplicationRevision(DeleteWebApplicationRevisionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWebApplicationRevision").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v2/api/web/application-revisions/{ApplicationId}/revisions/{RevisionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWebApplicationRevisionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWebApplicationRevisionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Delete a custom domain name.</p>
     * 
     * @param request the request parameters of DeleteWebCustomDomain  DeleteWebCustomDomainRequest
     * @return DeleteWebCustomDomainResponse
     */
    @Override
    public CompletableFuture<DeleteWebCustomDomainResponse> deleteWebCustomDomain(DeleteWebCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWebCustomDomain").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v2/api/web/custom-domains/{DomainName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWebCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWebCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployApplication  DeployApplicationRequest
     * @return DeployApplicationResponse
     */
    @Override
    public CompletableFuture<DeployApplicationResponse> deployApplication(DeployApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeployApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/app/deployApplication").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAppServiceDetail  DescribeAppServiceDetailRequest
     * @return DescribeAppServiceDetailResponse
     */
    @Override
    public CompletableFuture<DescribeAppServiceDetailResponse> describeAppServiceDetail(DescribeAppServiceDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeAppServiceDetail").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/service/describeAppServiceDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppServiceDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppServiceDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationConfig  DescribeApplicationConfigRequest
     * @return DescribeApplicationConfigResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationConfigResponse> describeApplicationConfig(DescribeApplicationConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApplicationConfig").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/app/describeApplicationConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationGroups  DescribeApplicationGroupsRequest
     * @return DescribeApplicationGroupsResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationGroupsResponse> describeApplicationGroups(DescribeApplicationGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApplicationGroups").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/app/describeApplicationGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationImage  DescribeApplicationImageRequest
     * @return DescribeApplicationImageResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationImageResponse> describeApplicationImage(DescribeApplicationImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApplicationImage").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/container/describeApplicationImage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationInstances  DescribeApplicationInstancesRequest
     * @return DescribeApplicationInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationInstancesResponse> describeApplicationInstances(DescribeApplicationInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApplicationInstances").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/app/describeApplicationInstances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationScalingRule  DescribeApplicationScalingRuleRequest
     * @return DescribeApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationScalingRuleResponse> describeApplicationScalingRule(DescribeApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApplicationScalingRule").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/scale/applicationScalingRule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationScalingRules  DescribeApplicationScalingRulesRequest
     * @return DescribeApplicationScalingRulesResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationScalingRulesResponse> describeApplicationScalingRules(DescribeApplicationScalingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApplicationScalingRules").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/scale/applicationScalingRules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationScalingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationScalingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationSlbs  DescribeApplicationSlbsRequest
     * @return DescribeApplicationSlbsResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationSlbsResponse> describeApplicationSlbs(DescribeApplicationSlbsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApplicationSlbs").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/app/slb").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationSlbsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationSlbsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationStatus  DescribeApplicationStatusRequest
     * @return DescribeApplicationStatusResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationStatusResponse> describeApplicationStatus(DescribeApplicationStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApplicationStatus").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/app/describeApplicationStatus").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeChangeOrder  DescribeChangeOrderRequest
     * @return DescribeChangeOrderResponse
     */
    @Override
    public CompletableFuture<DescribeChangeOrderResponse> describeChangeOrder(DescribeChangeOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeChangeOrder").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/changeorder/DescribeChangeOrder").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeChangeOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeChangeOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeComponents  DescribeComponentsRequest
     * @return DescribeComponentsResponse
     */
    @Override
    public CompletableFuture<DescribeComponentsResponse> describeComponents(DescribeComponentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeComponents").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/resource/components").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeComponentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeComponentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeConfigMap  DescribeConfigMapRequest
     * @return DescribeConfigMapResponse
     */
    @Override
    public CompletableFuture<DescribeConfigMapResponse> describeConfigMap(DescribeConfigMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeConfigMap").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/configmap/configMap").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeConfigMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeConfigMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeConfigurationPrice  DescribeConfigurationPriceRequest
     * @return DescribeConfigurationPriceResponse
     */
    @Override
    public CompletableFuture<DescribeConfigurationPriceResponse> describeConfigurationPrice(DescribeConfigurationPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeConfigurationPrice").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/paas/configurationPrice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeConfigurationPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeConfigurationPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEdasContainers  DescribeEdasContainersRequest
     * @return DescribeEdasContainersResponse
     */
    @Override
    public CompletableFuture<DescribeEdasContainersResponse> describeEdasContainers(DescribeEdasContainersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeEdasContainers").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/resource/edasContainers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEdasContainersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEdasContainersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGreyTagRoute  DescribeGreyTagRouteRequest
     * @return DescribeGreyTagRouteResponse
     */
    @Override
    public CompletableFuture<DescribeGreyTagRouteResponse> describeGreyTagRoute(DescribeGreyTagRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeGreyTagRoute").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/tagroute/greyTagRoute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGreyTagRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGreyTagRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeIngress  DescribeIngressRequest
     * @return DescribeIngressResponse
     */
    @Override
    public CompletableFuture<DescribeIngressResponse> describeIngress(DescribeIngressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeIngress").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/ingress/Ingress").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIngressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIngressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceLog  DescribeInstanceLogRequest
     * @return DescribeInstanceLogResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceLogResponse> describeInstanceLog(DescribeInstanceLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeInstanceLog").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/instance/describeInstanceLog").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceSpecifications  DescribeInstanceSpecificationsRequest
     * @return DescribeInstanceSpecificationsResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceSpecificationsResponse> describeInstanceSpecifications(DescribeInstanceSpecificationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeInstanceSpecifications").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/paas/quota/instanceSpecifications").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceSpecificationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceSpecificationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeJob  DescribeJobRequest
     * @return DescribeJobResponse
     */
    @Override
    public CompletableFuture<DescribeJobResponse> describeJob(DescribeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeJob").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/job/describeJob").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeJobHistory  DescribeJobHistoryRequest
     * @return DescribeJobHistoryResponse
     */
    @Override
    public CompletableFuture<DescribeJobHistoryResponse> describeJobHistory(DescribeJobHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeJobHistory").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/job/describeJobHistory").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeJobHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeJobHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeJobStatus  DescribeJobStatusRequest
     * @return DescribeJobStatusResponse
     */
    @Override
    public CompletableFuture<DescribeJobStatusResponse> describeJobStatus(DescribeJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeJobStatus").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/job/describeJobStatus").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNamespace  DescribeNamespaceRequest
     * @return DescribeNamespaceResponse
     */
    @Override
    public CompletableFuture<DescribeNamespaceResponse> describeNamespace(DescribeNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeNamespace").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/paas/namespace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNamespaceList  DescribeNamespaceListRequest
     * @return DescribeNamespaceListResponse
     */
    @Override
    public CompletableFuture<DescribeNamespaceListResponse> describeNamespaceList(DescribeNamespaceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeNamespaceList").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/namespace/describeNamespaceList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNamespaceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNamespaceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNamespaceResources  DescribeNamespaceResourcesRequest
     * @return DescribeNamespaceResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeNamespaceResourcesResponse> describeNamespaceResources(DescribeNamespaceResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeNamespaceResources").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/namespace/describeNamespaceResources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNamespaceResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNamespaceResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNamespaces  DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     */
    @Override
    public CompletableFuture<DescribeNamespacesResponse> describeNamespaces(DescribeNamespacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeNamespaces").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/paas/namespaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNamespacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNamespacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePipeline  DescribePipelineRequest
     * @return DescribePipelineResponse
     */
    @Override
    public CompletableFuture<DescribePipelineResponse> describePipeline(DescribePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribePipeline").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/changeorder/DescribePipeline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeRegions").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/paas/regionConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecret  DescribeSecretRequest
     * @return DescribeSecretResponse
     */
    @Override
    public CompletableFuture<DescribeSecretResponse> describeSecret(DescribeSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSecret").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/secret/secret").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplication operation to query web applications.</p>
     * 
     * @param request the request parameters of DescribeWebApplication  DescribeWebApplicationRequest
     * @return DescribeWebApplicationResponse
     */
    @Override
    public CompletableFuture<DescribeWebApplicationResponse> describeWebApplication(DescribeWebApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeWebApplication").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/applications/{ApplicationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query the resource usage of a web application.</p>
     * 
     * @param request the request parameters of DescribeWebApplicationResourceStatics  DescribeWebApplicationResourceStaticsRequest
     * @return DescribeWebApplicationResourceStaticsResponse
     */
    @Override
    public CompletableFuture<DescribeWebApplicationResourceStaticsResponse> describeWebApplicationResourceStatics(DescribeWebApplicationResourceStaticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeWebApplicationResourceStatics").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/applications-observability/{ApplicationId}/resource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebApplicationResourceStaticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebApplicationResourceStaticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Describe a web application version.</p>
     * 
     * @param request the request parameters of DescribeWebApplicationRevision  DescribeWebApplicationRevisionRequest
     * @return DescribeWebApplicationRevisionResponse
     */
    @Override
    public CompletableFuture<DescribeWebApplicationRevisionResponse> describeWebApplicationRevision(DescribeWebApplicationRevisionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeWebApplicationRevision").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/application-revisions/{ApplicationId}/revisions/{RevisionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebApplicationRevisionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebApplicationRevisionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplicationScalingConfig operation to obtain the scaling configuration of a web application.</p>
     * 
     * @param request the request parameters of DescribeWebApplicationScalingConfig  DescribeWebApplicationScalingConfigRequest
     * @return DescribeWebApplicationScalingConfigResponse
     */
    @Override
    public CompletableFuture<DescribeWebApplicationScalingConfigResponse> describeWebApplicationScalingConfig(DescribeWebApplicationScalingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeWebApplicationScalingConfig").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/application-scaling/{ApplicationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebApplicationScalingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebApplicationScalingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplicationTrafficConfig operation to query the traffic configurations of a web application.</p>
     * 
     * @param request the request parameters of DescribeWebApplicationTrafficConfig  DescribeWebApplicationTrafficConfigRequest
     * @return DescribeWebApplicationTrafficConfigResponse
     */
    @Override
    public CompletableFuture<DescribeWebApplicationTrafficConfigResponse> describeWebApplicationTrafficConfig(DescribeWebApplicationTrafficConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeWebApplicationTrafficConfig").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/application-traffic/{ApplicationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebApplicationTrafficConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebApplicationTrafficConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query the details of a custom domain name for a web application.</p>
     * 
     * @param request the request parameters of DescribeWebCustomDomain  DescribeWebCustomDomainRequest
     * @return DescribeWebCustomDomainResponse
     */
    @Override
    public CompletableFuture<DescribeWebCustomDomainResponse> describeWebCustomDomain(DescribeWebCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeWebCustomDomain").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/custom-domains/{DomainName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the logs of web application instances.</p>
     * 
     * @param request the request parameters of DescribeWebInstanceLogs  DescribeWebInstanceLogsRequest
     * @return DescribeWebInstanceLogsResponse
     */
    @Override
    public CompletableFuture<DescribeWebInstanceLogsResponse> describeWebInstanceLogs(DescribeWebInstanceLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeWebInstanceLogs").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/applications-observability/{ApplicationId}/instances/{InstanceId}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebInstanceLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebInstanceLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableApplicationScalingRule  DisableApplicationScalingRuleRequest
     * @return DisableApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<DisableApplicationScalingRuleResponse> disableApplicationScalingRule(DisableApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableApplicationScalingRule").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/scale/disableApplicationScalingRule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DowngradeApplicationApmService  DowngradeApplicationApmServiceRequest
     * @return DowngradeApplicationApmServiceResponse
     */
    @Override
    public CompletableFuture<DowngradeApplicationApmServiceResponse> downgradeApplicationApmService(DowngradeApplicationApmServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DowngradeApplicationApmService").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/app/applicationApmService").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DowngradeApplicationApmServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DowngradeApplicationApmServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableApplicationScalingRule  EnableApplicationScalingRuleRequest
     * @return EnableApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<EnableApplicationScalingRuleResponse> enableApplicationScalingRule(EnableApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableApplicationScalingRule").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/scale/enableApplicationScalingRule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecJob  ExecJobRequest
     * @return ExecJobResponse
     */
    @Override
    public CompletableFuture<ExecJobResponse> execJob(ExecJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecJob").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/job/execJob").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    @Override
    public CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetApplication").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/app/getApplication").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetArmsTopNMetric  GetArmsTopNMetricRequest
     * @return GetArmsTopNMetricResponse
     */
    @Override
    public CompletableFuture<GetArmsTopNMetricResponse> getArmsTopNMetric(GetArmsTopNMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetArmsTopNMetric").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/getArmsTopNMetric").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetArmsTopNMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetArmsTopNMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAvailabilityMetric  GetAvailabilityMetricRequest
     * @return GetAvailabilityMetricResponse
     */
    @Override
    public CompletableFuture<GetAvailabilityMetricResponse> getAvailabilityMetric(GetAvailabilityMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAvailabilityMetric").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/getAvailabilityMetric").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAvailabilityMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAvailabilityMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetChangeOrderMetric  GetChangeOrderMetricRequest
     * @return GetChangeOrderMetricResponse
     */
    @Override
    public CompletableFuture<GetChangeOrderMetricResponse> getChangeOrderMetric(GetChangeOrderMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetChangeOrderMetric").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/getChangeOrderMetric").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChangeOrderMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChangeOrderMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScaleAppMetric  GetScaleAppMetricRequest
     * @return GetScaleAppMetricResponse
     */
    @Override
    public CompletableFuture<GetScaleAppMetricResponse> getScaleAppMetric(GetScaleAppMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScaleAppMetric").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/getScaleAppMetric").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScaleAppMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScaleAppMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWarningEventMetric  GetWarningEventMetricRequest
     * @return GetWarningEventMetricResponse
     */
    @Override
    public CompletableFuture<GetWarningEventMetricResponse> getWarningEventMetric(GetWarningEventMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWarningEventMetric").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/getWarningEventMetric").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWarningEventMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWarningEventMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWebshellToken  GetWebshellTokenRequest
     * @return GetWebshellTokenResponse
     */
    @Override
    public CompletableFuture<GetWebshellTokenResponse> getWebshellToken(GetWebshellTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWebshellToken").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/instance/webshellToken").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWebshellTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWebshellTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppEvents  ListAppEventsRequest
     * @return ListAppEventsResponse
     */
    @Override
    public CompletableFuture<ListAppEventsResponse> listAppEvents(ListAppEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAppEvents").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/app/listAppEvents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppServices  ListAppServicesRequest
     * @return ListAppServicesResponse
     */
    @Override
    public CompletableFuture<ListAppServicesResponse> listAppServices(ListAppServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAppServices").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/service/listAppServices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppServicesPage  ListAppServicesPageRequest
     * @return ListAppServicesPageResponse
     */
    @Override
    public CompletableFuture<ListAppServicesPageResponse> listAppServicesPage(ListAppServicesPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAppServicesPage").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/service/listAppServicesPage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppServicesPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppServicesPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppVersions  ListAppVersionsRequest
     * @return ListAppVersionsResponse
     */
    @Override
    public CompletableFuture<ListAppVersionsResponse> listAppVersions(ListAppVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAppVersions").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/app/listAppVersions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    @Override
    public CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApplications").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/app/listApplications").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplicationsForSwimmingLane  ListApplicationsForSwimmingLaneRequest
     * @return ListApplicationsForSwimmingLaneResponse
     */
    @Override
    public CompletableFuture<ListApplicationsForSwimmingLaneResponse> listApplicationsForSwimmingLane(ListApplicationsForSwimmingLaneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApplicationsForSwimmingLane").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/cas/gray/listApplicationsForSwimmingLane").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationsForSwimmingLaneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationsForSwimmingLaneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListChangeOrders  ListChangeOrdersRequest
     * @return ListChangeOrdersResponse
     */
    @Override
    public CompletableFuture<ListChangeOrdersResponse> listChangeOrders(ListChangeOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListChangeOrders").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/changeorder/ListChangeOrders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChangeOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChangeOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConsumedServices  ListConsumedServicesRequest
     * @return ListConsumedServicesResponse
     */
    @Override
    public CompletableFuture<ListConsumedServicesResponse> listConsumedServices(ListConsumedServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConsumedServices").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/service/listConsumedServices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConsumedServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConsumedServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can configure only one canary release rule for each application.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListGreyTagRoute  ListGreyTagRouteRequest
     * @return ListGreyTagRouteResponse
     */
    @Override
    public CompletableFuture<ListGreyTagRouteResponse> listGreyTagRoute(ListGreyTagRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGreyTagRoute").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/tagroute/greyTagRouteList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGreyTagRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGreyTagRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIngresses  ListIngressesRequest
     * @return ListIngressesResponse
     */
    @Override
    public CompletableFuture<ListIngressesResponse> listIngresses(ListIngressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIngresses").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/ingress/IngressList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIngressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIngressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    @Override
    public CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJobs").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/job/listJobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLogConfigs  ListLogConfigsRequest
     * @return ListLogConfigsResponse
     */
    @Override
    public CompletableFuture<ListLogConfigsResponse> listLogConfigs(ListLogConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogConfigs").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/log/listLogConfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNamespaceChangeOrders  ListNamespaceChangeOrdersRequest
     * @return ListNamespaceChangeOrdersResponse
     */
    @Override
    public CompletableFuture<ListNamespaceChangeOrdersResponse> listNamespaceChangeOrders(ListNamespaceChangeOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListNamespaceChangeOrders").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/changeorder/listNamespaceChangeOrders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNamespaceChangeOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNamespaceChangeOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNamespacedConfigMaps  ListNamespacedConfigMapsRequest
     * @return ListNamespacedConfigMapsResponse
     */
    @Override
    public CompletableFuture<ListNamespacedConfigMapsResponse> listNamespacedConfigMaps(ListNamespacedConfigMapsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListNamespacedConfigMaps").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/configmap/listNamespacedConfigMaps").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNamespacedConfigMapsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNamespacedConfigMapsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPublishedServices  ListPublishedServicesRequest
     * @return ListPublishedServicesResponse
     */
    @Override
    public CompletableFuture<ListPublishedServicesResponse> listPublishedServices(ListPublishedServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPublishedServices").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/service/listPublishedServices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublishedServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublishedServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSecrets  ListSecretsRequest
     * @return ListSecretsResponse
     */
    @Override
    public CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSecrets").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/secret/secrets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSecretsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSecretsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTagResources").setMethod(HttpMethod.GET).setPathRegex("/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query the list of web application instances.</p>
     * 
     * @param request the request parameters of ListWebApplicationInstances  ListWebApplicationInstancesRequest
     * @return ListWebApplicationInstancesResponse
     */
    @Override
    public CompletableFuture<ListWebApplicationInstancesResponse> listWebApplicationInstances(ListWebApplicationInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWebApplicationInstances").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/applications-observability/{ApplicationId}/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWebApplicationInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWebApplicationInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query the list of web application versions.</p>
     * 
     * @param request the request parameters of ListWebApplicationRevisions  ListWebApplicationRevisionsRequest
     * @return ListWebApplicationRevisionsResponse
     */
    @Override
    public CompletableFuture<ListWebApplicationRevisionsResponse> listWebApplicationRevisions(ListWebApplicationRevisionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWebApplicationRevisions").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/application-revisions/{ApplicationId}/revisions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWebApplicationRevisionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWebApplicationRevisionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the ListWebApplications operation to query the list of web applications.</p>
     * 
     * @param request the request parameters of ListWebApplications  ListWebApplicationsRequest
     * @return ListWebApplicationsResponse
     */
    @Override
    public CompletableFuture<ListWebApplicationsResponse> listWebApplications(ListWebApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWebApplications").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/applications").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWebApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWebApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query available custom domain names.</p>
     * 
     * @param request the request parameters of ListWebCustomDomains  ListWebCustomDomainsRequest
     * @return ListWebCustomDomainsResponse
     */
    @Override
    public CompletableFuture<ListWebCustomDomainsResponse> listWebCustomDomains(ListWebCustomDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWebCustomDomains").setMethod(HttpMethod.GET).setPathRegex("/pop/v2/api/web/custom-domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWebCustomDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWebCustomDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Make sure that your account balance is greater than 0. Otherwise, the SAE service cannot be activated.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OpenSaeService  OpenSaeServiceRequest
     * @return OpenSaeServiceResponse
     */
    @Override
    public CompletableFuture<OpenSaeServiceResponse> openSaeService(OpenSaeServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenSaeService").setMethod(HttpMethod.POST).setPathRegex("/service/open").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenSaeServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenSaeServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Publish a web application version. You can change the configurations of the version and create a new version.</p>
     * 
     * @param request the request parameters of PublishWebApplicationRevision  PublishWebApplicationRevisionRequest
     * @return PublishWebApplicationRevisionResponse
     */
    @Override
    public CompletableFuture<PublishWebApplicationRevisionResponse> publishWebApplicationRevision(PublishWebApplicationRevisionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishWebApplicationRevision").setMethod(HttpMethod.POST).setPathRegex("/pop/v2/api/web/application-revisions/{ApplicationId}/revisions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishWebApplicationRevisionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishWebApplicationRevisionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryResourceStatics  QueryResourceStaticsRequest
     * @return QueryResourceStaticsResponse
     */
    @Override
    public CompletableFuture<QueryResourceStaticsResponse> queryResourceStatics(QueryResourceStaticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryResourceStatics").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/paas/quota/queryResourceStatics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryResourceStaticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryResourceStaticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReduceApplicationCapacityByInstanceIds  ReduceApplicationCapacityByInstanceIdsRequest
     * @return ReduceApplicationCapacityByInstanceIdsResponse
     */
    @Override
    public CompletableFuture<ReduceApplicationCapacityByInstanceIdsResponse> reduceApplicationCapacityByInstanceIds(ReduceApplicationCapacityByInstanceIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReduceApplicationCapacityByInstanceIds").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/ScaleInApplicationWithInstanceIds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReduceApplicationCapacityByInstanceIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReduceApplicationCapacityByInstanceIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RescaleApplication  RescaleApplicationRequest
     * @return RescaleApplicationResponse
     */
    @Override
    public CompletableFuture<RescaleApplicationResponse> rescaleApplication(RescaleApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RescaleApplication").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/rescaleApplication").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RescaleApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RescaleApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RescaleApplicationVertically  RescaleApplicationVerticallyRequest
     * @return RescaleApplicationVerticallyResponse
     */
    @Override
    public CompletableFuture<RescaleApplicationVerticallyResponse> rescaleApplicationVertically(RescaleApplicationVerticallyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RescaleApplicationVertically").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/app/rescaleApplicationVertically").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RescaleApplicationVerticallyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RescaleApplicationVerticallyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartApplication  RestartApplicationRequest
     * @return RestartApplicationResponse
     */
    @Override
    public CompletableFuture<RestartApplicationResponse> restartApplication(RestartApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartApplication").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/restartApplication").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartInstances  RestartInstancesRequest
     * @return RestartInstancesResponse
     */
    @Override
    public CompletableFuture<RestartInstancesResponse> restartInstances(RestartInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartInstances").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/restartInstances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RollbackApplication  RollbackApplicationRequest
     * @return RollbackApplicationResponse
     */
    @Override
    public CompletableFuture<RollbackApplicationResponse> rollbackApplication(RollbackApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RollbackApplication").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/rollbackApplication").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartApplication  StartApplicationRequest
     * @return StartApplicationResponse
     */
    @Override
    public CompletableFuture<StartApplicationResponse> startApplication(StartApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartApplication").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/startApplication").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the StartWebApplication operation to start a web application.</p>
     * 
     * @param request the request parameters of StartWebApplication  StartWebApplicationRequest
     * @return StartWebApplicationResponse
     */
    @Override
    public CompletableFuture<StartWebApplicationResponse> startWebApplication(StartWebApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartWebApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v2/api/web/application-ops/{ApplicationId}/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartWebApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartWebApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopApplication  StopApplicationRequest
     * @return StopApplicationResponse
     */
    @Override
    public CompletableFuture<StopApplicationResponse> stopApplication(StopApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopApplication").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/stopApplication").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the StopWebApplication operation to stop a web application.</p>
     * 
     * @param request the request parameters of StopWebApplication  StopWebApplicationRequest
     * @return StopWebApplicationResponse
     */
    @Override
    public CompletableFuture<StopWebApplicationResponse> stopWebApplication(StopWebApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopWebApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v2/api/web/application-ops/{ApplicationId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopWebApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopWebApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SuspendJob  SuspendJobRequest
     * @return SuspendJobResponse
     */
    @Override
    public CompletableFuture<SuspendJobResponse> suspendJob(SuspendJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SuspendJob").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/sam/job/suspendJob").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/tags").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindNlb  UnbindNlbRequest
     * @return UnbindNlbResponse
     */
    @Override
    public CompletableFuture<UnbindNlbResponse> unbindNlb(UnbindNlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnbindNlb").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/app/nlb").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindNlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindNlbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindSlb  UnbindSlbRequest
     * @return UnbindSlbResponse
     */
    @Override
    public CompletableFuture<UnbindSlbResponse> unbindSlb(UnbindSlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnbindSlb").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/sam/app/slb").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindSlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindSlbResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResources").setMethod(HttpMethod.DELETE).setPathRegex("/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAppSecurityGroup  UpdateAppSecurityGroupRequest
     * @return UpdateAppSecurityGroupResponse
     */
    @Override
    public CompletableFuture<UpdateAppSecurityGroupResponse> updateAppSecurityGroup(UpdateAppSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAppSecurityGroup").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/updateAppSecurityGroup").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAppSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAppSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApplicationDescription  UpdateApplicationDescriptionRequest
     * @return UpdateApplicationDescriptionResponse
     */
    @Override
    public CompletableFuture<UpdateApplicationDescriptionResponse> updateApplicationDescription(UpdateApplicationDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateApplicationDescription").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/updateAppDescription").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>If you want to configure more than 50 instances for an application, you must submit a <a href="https://workorder.console.aliyun.com/#/ticket/createIndex">ticket</a> to add your account to the whitelist.</p>
     * 
     * @param request the request parameters of UpdateApplicationScalingRule  UpdateApplicationScalingRuleRequest
     * @return UpdateApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<UpdateApplicationScalingRuleResponse> updateApplicationScalingRule(UpdateApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateApplicationScalingRule").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/scale/applicationScalingRule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApplicationVswitches  UpdateApplicationVswitchesRequest
     * @return UpdateApplicationVswitchesResponse
     */
    @Override
    public CompletableFuture<UpdateApplicationVswitchesResponse> updateApplicationVswitches(UpdateApplicationVswitchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateApplicationVswitches").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/app/updateAppVswitches").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationVswitchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationVswitchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateConfigMap  UpdateConfigMapRequest
     * @return UpdateConfigMapResponse
     */
    @Override
    public CompletableFuture<UpdateConfigMapResponse> updateConfigMap(UpdateConfigMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConfigMap").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/configmap/configMap").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConfigMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConfigMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateGreyTagRoute  UpdateGreyTagRouteRequest
     * @return UpdateGreyTagRouteResponse
     */
    @Override
    public CompletableFuture<UpdateGreyTagRouteResponse> updateGreyTagRoute(UpdateGreyTagRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateGreyTagRoute").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/tagroute/greyTagRoute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGreyTagRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGreyTagRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateIngress  UpdateIngressRequest
     * @return UpdateIngressResponse
     */
    @Override
    public CompletableFuture<UpdateIngressResponse> updateIngress(UpdateIngressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateIngress").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/ingress/Ingress").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIngressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIngressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateJob  UpdateJobRequest
     * @return UpdateJobResponse
     */
    @Override
    public CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateJob").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/job/updateJob").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateNamespace  UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     */
    @Override
    public CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateNamespace").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/paas/namespace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateNamespaceVpc  UpdateNamespaceVpcRequest
     * @return UpdateNamespaceVpcResponse
     */
    @Override
    public CompletableFuture<UpdateNamespaceVpcResponse> updateNamespaceVpc(UpdateNamespaceVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateNamespaceVpc").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/namespace/updateNamespaceVpc").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNamespaceVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNamespaceVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSecret  UpdateSecretRequest
     * @return UpdateSecretResponse
     */
    @Override
    public CompletableFuture<UpdateSecretResponse> updateSecret(UpdateSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSecret").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/sam/secret/secret").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the UpdateWebApplication operation to update the configuration at the web application level.</p>
     * 
     * @param request the request parameters of UpdateWebApplication  UpdateWebApplicationRequest
     * @return UpdateWebApplicationResponse
     */
    @Override
    public CompletableFuture<UpdateWebApplicationResponse> updateWebApplication(UpdateWebApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWebApplication").setMethod(HttpMethod.PUT).setPathRegex("/pop/v2/api/web/applications/{ApplicationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWebApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWebApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the UpdateWebApplicationScalingConfig operation to update the scaling configurations of a web application.</p>
     * 
     * @param request the request parameters of UpdateWebApplicationScalingConfig  UpdateWebApplicationScalingConfigRequest
     * @return UpdateWebApplicationScalingConfigResponse
     */
    @Override
    public CompletableFuture<UpdateWebApplicationScalingConfigResponse> updateWebApplicationScalingConfig(UpdateWebApplicationScalingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWebApplicationScalingConfig").setMethod(HttpMethod.PUT).setPathRegex("/pop/v2/api/web/application-scaling/{ApplicationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWebApplicationScalingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWebApplicationScalingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the UpdateWebApplicationTrafficConfig operation to update the traffic configurations of a web application.</p>
     * 
     * @param request the request parameters of UpdateWebApplicationTrafficConfig  UpdateWebApplicationTrafficConfigRequest
     * @return UpdateWebApplicationTrafficConfigResponse
     */
    @Override
    public CompletableFuture<UpdateWebApplicationTrafficConfigResponse> updateWebApplicationTrafficConfig(UpdateWebApplicationTrafficConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWebApplicationTrafficConfig").setMethod(HttpMethod.PUT).setPathRegex("/pop/v2/api/web/application-traffic/{ApplicationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWebApplicationTrafficConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWebApplicationTrafficConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Update a custom domain name.</p>
     * 
     * @param request the request parameters of UpdateWebCustomDomain  UpdateWebCustomDomainRequest
     * @return UpdateWebCustomDomainResponse
     */
    @Override
    public CompletableFuture<UpdateWebCustomDomainResponse> updateWebCustomDomain(UpdateWebCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWebCustomDomain").setMethod(HttpMethod.PUT).setPathRegex("/pop/v2/api/web/custom-domains/{DomainName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWebCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWebCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You are charged when you use the ARMS advanced monitoring feature. Enable this feature based on your business requirements. For more information, see <a href="https://icms.alibaba-inc.com/content/arms/arms?l=1%5C&m=16992%5C&n=3183148">Billing overview</a>.</p>
     * 
     * @param request the request parameters of UpgradeApplicationApmService  UpgradeApplicationApmServiceRequest
     * @return UpgradeApplicationApmServiceResponse
     */
    @Override
    public CompletableFuture<UpgradeApplicationApmServiceResponse> upgradeApplicationApmService(UpgradeApplicationApmServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeApplicationApmService").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/sam/app/applicationApmService").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeApplicationApmServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeApplicationApmServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
