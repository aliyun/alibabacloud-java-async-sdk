// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dyvmsapi20170525.models.*;
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
        this.product = "Dyvmsapi";
        this.version = "2017-05-25";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account.</p>
     * 
     * @param request the request parameters of AddVirtualNumberRelation  AddVirtualNumberRelationRequest
     * @return AddVirtualNumberRelationResponse
     */
    @Override
    public CompletableFuture<AddVirtualNumberRelationResponse> addVirtualNumberRelation(AddVirtualNumberRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddVirtualNumberRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddVirtualNumberRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddVirtualNumberRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.</p>
     * <ul>
     * <li>The BatchRobotSmartCall operation is used to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>You have passed the real-name verification for an enterprise user and passed the enterprise qualification review.</li>
     * <li>You have purchased numbers in the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/number/normal">Voice Messaging Service console</a>.</li>
     * <li>You have added communication scripts on the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/smart-call/saas/robot/list">Communication script management</a> page, and the communication scripts have been approved.<blockquote>
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://www.aliyun.com/price/product#/vms/detail">billing</a> of Voice Messaging Service (VMS).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of BatchRobotSmartCall  BatchRobotSmartCallRequest
     * @return BatchRobotSmartCallResponse
     */
    @Override
    public CompletableFuture<BatchRobotSmartCallResponse> batchRobotSmartCall(BatchRobotSmartCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchRobotSmartCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchRobotSmartCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchRobotSmartCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelCall  CancelCallRequest
     * @return CancelCallResponse
     */
    @Override
    public CompletableFuture<CancelCallResponse> cancelCall(CancelCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of CancelOrderRobotTask  CancelOrderRobotTaskRequest
     * @return CancelOrderRobotTaskResponse
     */
    @Override
    public CompletableFuture<CancelOrderRobotTaskResponse> cancelOrderRobotTask(CancelOrderRobotTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelOrderRobotTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOrderRobotTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOrderRobotTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only a task in progress can be terminated by calling the CancelRobotTask operation, and the task cannot be resumed after it is terminated.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of CancelRobotTask  CancelRobotTaskRequest
     * @return CancelRobotTaskResponse
     */
    @Override
    public CompletableFuture<CancelRobotTaskResponse> cancelRobotTask(CancelRobotTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelRobotTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelRobotTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelRobotTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeMediaType  ChangeMediaTypeRequest
     * @return ChangeMediaTypeResponse
     */
    @Override
    public CompletableFuture<ChangeMediaTypeResponse> changeMediaType(ChangeMediaTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeMediaType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeMediaTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeMediaTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkAgentStatus  ClinkAgentStatusRequest
     * @return ClinkAgentStatusResponse
     */
    @Override
    public CompletableFuture<ClinkAgentStatusResponse> clinkAgentStatus(ClinkAgentStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkAgentStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkAgentStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkAgentStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkAgentStatusDetail  ClinkAgentStatusDetailRequest
     * @return ClinkAgentStatusDetailResponse
     */
    @Override
    public CompletableFuture<ClinkAgentStatusDetailResponse> clinkAgentStatusDetail(ClinkAgentStatusDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkAgentStatusDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkAgentStatusDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkAgentStatusDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkBindClientTel  ClinkBindClientTelRequest
     * @return ClinkBindClientTelResponse
     */
    @Override
    public CompletableFuture<ClinkBindClientTelResponse> clinkBindClientTel(ClinkBindClientTelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkBindClientTel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkBindClientTelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkBindClientTelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkCdrObDetails  ClinkCdrObDetailsRequest
     * @return ClinkCdrObDetailsResponse
     */
    @Override
    public CompletableFuture<ClinkCdrObDetailsResponse> clinkCdrObDetails(ClinkCdrObDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkCdrObDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkCdrObDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkCdrObDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkCreateClient  ClinkCreateClientRequest
     * @return ClinkCreateClientResponse
     */
    @Override
    public CompletableFuture<ClinkCreateClientResponse> clinkCreateClient(ClinkCreateClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkCreateClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkCreateClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkCreateClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkCreateEnterprisePause  ClinkCreateEnterprisePauseRequest
     * @return ClinkCreateEnterprisePauseResponse
     */
    @Override
    public CompletableFuture<ClinkCreateEnterprisePauseResponse> clinkCreateEnterprisePause(ClinkCreateEnterprisePauseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkCreateEnterprisePause").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkCreateEnterprisePauseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkCreateEnterprisePauseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkCreateExten  ClinkCreateExtenRequest
     * @return ClinkCreateExtenResponse
     */
    @Override
    public CompletableFuture<ClinkCreateExtenResponse> clinkCreateExten(ClinkCreateExtenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkCreateExten").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkCreateExtenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkCreateExtenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkCreateQueue  ClinkCreateQueueRequest
     * @return ClinkCreateQueueResponse
     */
    @Override
    public CompletableFuture<ClinkCreateQueueResponse> clinkCreateQueue(ClinkCreateQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkCreateQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkCreateQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkCreateQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDeleteClient  ClinkDeleteClientRequest
     * @return ClinkDeleteClientResponse
     */
    @Override
    public CompletableFuture<ClinkDeleteClientResponse> clinkDeleteClient(ClinkDeleteClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDeleteClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDeleteClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDeleteClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDeleteExten  ClinkDeleteExtenRequest
     * @return ClinkDeleteExtenResponse
     */
    @Override
    public CompletableFuture<ClinkDeleteExtenResponse> clinkDeleteExten(ClinkDeleteExtenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDeleteExten").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDeleteExtenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDeleteExtenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDescribeCdrIb  ClinkDescribeCdrIbRequest
     * @return ClinkDescribeCdrIbResponse
     */
    @Override
    public CompletableFuture<ClinkDescribeCdrIbResponse> clinkDescribeCdrIb(ClinkDescribeCdrIbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDescribeCdrIb").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDescribeCdrIbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDescribeCdrIbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDescribeCdrIbDetails  ClinkDescribeCdrIbDetailsRequest
     * @return ClinkDescribeCdrIbDetailsResponse
     */
    @Override
    public CompletableFuture<ClinkDescribeCdrIbDetailsResponse> clinkDescribeCdrIbDetails(ClinkDescribeCdrIbDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDescribeCdrIbDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDescribeCdrIbDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDescribeCdrIbDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDescribeCdrOb  ClinkDescribeCdrObRequest
     * @return ClinkDescribeCdrObResponse
     */
    @Override
    public CompletableFuture<ClinkDescribeCdrObResponse> clinkDescribeCdrOb(ClinkDescribeCdrObRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDescribeCdrOb").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDescribeCdrObResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDescribeCdrObResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDescribeCdrObDetails  ClinkDescribeCdrObDetailsRequest
     * @return ClinkDescribeCdrObDetailsResponse
     */
    @Override
    public CompletableFuture<ClinkDescribeCdrObDetailsResponse> clinkDescribeCdrObDetails(ClinkDescribeCdrObDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDescribeCdrObDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDescribeCdrObDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDescribeCdrObDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDescribeClient  ClinkDescribeClientRequest
     * @return ClinkDescribeClientResponse
     */
    @Override
    public CompletableFuture<ClinkDescribeClientResponse> clinkDescribeClient(ClinkDescribeClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDescribeClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDescribeClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDescribeClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDescribeQueue  ClinkDescribeQueueRequest
     * @return ClinkDescribeQueueResponse
     */
    @Override
    public CompletableFuture<ClinkDescribeQueueResponse> clinkDescribeQueue(ClinkDescribeQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDescribeQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDescribeQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDescribeQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDescribeRecordFileUrl  ClinkDescribeRecordFileUrlRequest
     * @return ClinkDescribeRecordFileUrlResponse
     */
    @Override
    public CompletableFuture<ClinkDescribeRecordFileUrlResponse> clinkDescribeRecordFileUrl(ClinkDescribeRecordFileUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDescribeRecordFileUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDescribeRecordFileUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDescribeRecordFileUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkDetailCdrIb  ClinkDetailCdrIbRequest
     * @return ClinkDetailCdrIbResponse
     */
    @Override
    public CompletableFuture<ClinkDetailCdrIbResponse> clinkDetailCdrIb(ClinkDetailCdrIbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkDetailCdrIb").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkDetailCdrIbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkDetailCdrIbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListCdrIb  ClinkListCdrIbRequest
     * @return ClinkListCdrIbResponse
     */
    @Override
    public CompletableFuture<ClinkListCdrIbResponse> clinkListCdrIb(ClinkListCdrIbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListCdrIb").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListCdrIbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListCdrIbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListCdrIbAgent  ClinkListCdrIbAgentRequest
     * @return ClinkListCdrIbAgentResponse
     */
    @Override
    public CompletableFuture<ClinkListCdrIbAgentResponse> clinkListCdrIbAgent(ClinkListCdrIbAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListCdrIbAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListCdrIbAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListCdrIbAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListCdrIbs  ClinkListCdrIbsRequest
     * @return ClinkListCdrIbsResponse
     */
    @Override
    public CompletableFuture<ClinkListCdrIbsResponse> clinkListCdrIbs(ClinkListCdrIbsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListCdrIbs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListCdrIbsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListCdrIbsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListCdrOb  ClinkListCdrObRequest
     * @return ClinkListCdrObResponse
     */
    @Override
    public CompletableFuture<ClinkListCdrObResponse> clinkListCdrOb(ClinkListCdrObRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListCdrOb").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListCdrObResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListCdrObResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListCdrObs  ClinkListCdrObsRequest
     * @return ClinkListCdrObsResponse
     */
    @Override
    public CompletableFuture<ClinkListCdrObsResponse> clinkListCdrObs(ClinkListCdrObsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListCdrObs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListCdrObsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListCdrObsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListClients  ClinkListClientsRequest
     * @return ClinkListClientsResponse
     */
    @Override
    public CompletableFuture<ClinkListClientsResponse> clinkListClients(ClinkListClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListEnterprisePauses  ClinkListEnterprisePausesRequest
     * @return ClinkListEnterprisePausesResponse
     */
    @Override
    public CompletableFuture<ClinkListEnterprisePausesResponse> clinkListEnterprisePauses(ClinkListEnterprisePausesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListEnterprisePauses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListEnterprisePausesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListEnterprisePausesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListExtens  ClinkListExtensRequest
     * @return ClinkListExtensResponse
     */
    @Override
    public CompletableFuture<ClinkListExtensResponse> clinkListExtens(ClinkListExtensRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListExtens").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListExtensResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListExtensResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListIvrNodes  ClinkListIvrNodesRequest
     * @return ClinkListIvrNodesResponse
     */
    @Override
    public CompletableFuture<ClinkListIvrNodesResponse> clinkListIvrNodes(ClinkListIvrNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListIvrNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListIvrNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListIvrNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListIvrs  ClinkListIvrsRequest
     * @return ClinkListIvrsResponse
     */
    @Override
    public CompletableFuture<ClinkListIvrsResponse> clinkListIvrs(ClinkListIvrsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListIvrs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListIvrsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListIvrsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkListQueues  ClinkListQueuesRequest
     * @return ClinkListQueuesResponse
     */
    @Override
    public CompletableFuture<ClinkListQueuesResponse> clinkListQueues(ClinkListQueuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkListQueues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkListQueuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkListQueuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkStatIb  ClinkStatIbRequest
     * @return ClinkStatIbResponse
     */
    @Override
    public CompletableFuture<ClinkStatIbResponse> clinkStatIb(ClinkStatIbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkStatIb").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkStatIbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkStatIbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClinkUpdateClient  ClinkUpdateClientRequest
     * @return ClinkUpdateClientResponse
     */
    @Override
    public CompletableFuture<ClinkUpdateClientResponse> clinkUpdateClient(ClinkUpdateClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClinkUpdateClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClinkUpdateClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClinkUpdateClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudAgentLogin  CloudAgentLoginRequest
     * @return CloudAgentLoginResponse
     */
    @Override
    public CompletableFuture<CloudAgentLoginResponse> cloudAgentLogin(CloudAgentLoginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudAgentLogin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudAgentLoginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudAgentLoginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudAgentLogout  CloudAgentLogoutRequest
     * @return CloudAgentLogoutResponse
     */
    @Override
    public CompletableFuture<CloudAgentLogoutResponse> cloudAgentLogout(CloudAgentLogoutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudAgentLogout").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudAgentLogoutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudAgentLogoutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudAgentMonitorStatistics  CloudAgentMonitorStatisticsRequest
     * @return CloudAgentMonitorStatisticsResponse
     */
    @Override
    public CompletableFuture<CloudAgentMonitorStatisticsResponse> cloudAgentMonitorStatistics(CloudAgentMonitorStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudAgentMonitorStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudAgentMonitorStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudAgentMonitorStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudAgentSetUserData  CloudAgentSetUserDataRequest
     * @return CloudAgentSetUserDataResponse
     */
    @Override
    public CompletableFuture<CloudAgentSetUserDataResponse> cloudAgentSetUserData(CloudAgentSetUserDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudAgentSetUserData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudAgentSetUserDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudAgentSetUserDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudAgentUnlink  CloudAgentUnlinkRequest
     * @return CloudAgentUnlinkResponse
     */
    @Override
    public CompletableFuture<CloudAgentUnlinkResponse> cloudAgentUnlink(CloudAgentUnlinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudAgentUnlink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudAgentUnlinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudAgentUnlinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudAgentWorkloadReport  CloudAgentWorkloadReportRequest
     * @return CloudAgentWorkloadReportResponse
     */
    @Override
    public CompletableFuture<CloudAgentWorkloadReportResponse> cloudAgentWorkloadReport(CloudAgentWorkloadReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudAgentWorkloadReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudAgentWorkloadReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudAgentWorkloadReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudAssignAgentGroup  CloudAssignAgentGroupRequest
     * @return CloudAssignAgentGroupResponse
     */
    @Override
    public CompletableFuture<CloudAssignAgentGroupResponse> cloudAssignAgentGroup(CloudAssignAgentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudAssignAgentGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudAssignAgentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudAssignAgentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudBatchCreateAgent  CloudBatchCreateAgentRequest
     * @return CloudBatchCreateAgentResponse
     */
    @Override
    public CompletableFuture<CloudBatchCreateAgentResponse> cloudBatchCreateAgent(CloudBatchCreateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudBatchCreateAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudBatchCreateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudBatchCreateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudBatchGetAgentStatus  CloudBatchGetAgentStatusRequest
     * @return CloudBatchGetAgentStatusResponse
     */
    @Override
    public CompletableFuture<CloudBatchGetAgentStatusResponse> cloudBatchGetAgentStatus(CloudBatchGetAgentStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudBatchGetAgentStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudBatchGetAgentStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudBatchGetAgentStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudBatchUpdateAgent  CloudBatchUpdateAgentRequest
     * @return CloudBatchUpdateAgentResponse
     */
    @Override
    public CompletableFuture<CloudBatchUpdateAgentResponse> cloudBatchUpdateAgent(CloudBatchUpdateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudBatchUpdateAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudBatchUpdateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudBatchUpdateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudCreateAgent  CloudCreateAgentRequest
     * @return CloudCreateAgentResponse
     */
    @Override
    public CompletableFuture<CloudCreateAgentResponse> cloudCreateAgent(CloudCreateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudCreateAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudCreateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudCreateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudCreateAgentGroup  CloudCreateAgentGroupRequest
     * @return CloudCreateAgentGroupResponse
     */
    @Override
    public CompletableFuture<CloudCreateAgentGroupResponse> cloudCreateAgentGroup(CloudCreateAgentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudCreateAgentGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudCreateAgentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudCreateAgentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudCreateAsr  CloudCreateAsrRequest
     * @return CloudCreateAsrResponse
     */
    @Override
    public CompletableFuture<CloudCreateAsrResponse> cloudCreateAsr(CloudCreateAsrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudCreateAsr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudCreateAsrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudCreateAsrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudCreateEnterpriseTime  CloudCreateEnterpriseTimeRequest
     * @return CloudCreateEnterpriseTimeResponse
     */
    @Override
    public CompletableFuture<CloudCreateEnterpriseTimeResponse> cloudCreateEnterpriseTime(CloudCreateEnterpriseTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudCreateEnterpriseTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudCreateEnterpriseTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudCreateEnterpriseTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudCreateExten  CloudCreateExtenRequest
     * @return CloudCreateExtenResponse
     */
    @Override
    public CompletableFuture<CloudCreateExtenResponse> cloudCreateExten(CloudCreateExtenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudCreateExten").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudCreateExtenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudCreateExtenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudCreateQueue  CloudCreateQueueRequest
     * @return CloudCreateQueueResponse
     */
    @Override
    public CompletableFuture<CloudCreateQueueResponse> cloudCreateQueue(CloudCreateQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudCreateQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudCreateQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudCreateQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudCreateQueueSkill  CloudCreateQueueSkillRequest
     * @return CloudCreateQueueSkillResponse
     */
    @Override
    public CompletableFuture<CloudCreateQueueSkillResponse> cloudCreateQueueSkill(CloudCreateQueueSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudCreateQueueSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudCreateQueueSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudCreateQueueSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudCreateSkill  CloudCreateSkillRequest
     * @return CloudCreateSkillResponse
     */
    @Override
    public CompletableFuture<CloudCreateSkillResponse> cloudCreateSkill(CloudCreateSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudCreateSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudCreateSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudCreateSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudCreateTask  CloudCreateTaskRequest
     * @return CloudCreateTaskResponse
     */
    @Override
    public CompletableFuture<CloudCreateTaskResponse> cloudCreateTask(CloudCreateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudCreateTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudCreateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudCreateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteAgent  CloudDeleteAgentRequest
     * @return CloudDeleteAgentResponse
     */
    @Override
    public CompletableFuture<CloudDeleteAgentResponse> cloudDeleteAgent(CloudDeleteAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteAgentGroup  CloudDeleteAgentGroupRequest
     * @return CloudDeleteAgentGroupResponse
     */
    @Override
    public CompletableFuture<CloudDeleteAgentGroupResponse> cloudDeleteAgentGroup(CloudDeleteAgentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteAgentGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteAgentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteAgentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteAgentTel  CloudDeleteAgentTelRequest
     * @return CloudDeleteAgentTelResponse
     */
    @Override
    public CompletableFuture<CloudDeleteAgentTelResponse> cloudDeleteAgentTel(CloudDeleteAgentTelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteAgentTel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteAgentTelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteAgentTelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteEnterpriseTime  CloudDeleteEnterpriseTimeRequest
     * @return CloudDeleteEnterpriseTimeResponse
     */
    @Override
    public CompletableFuture<CloudDeleteEnterpriseTimeResponse> cloudDeleteEnterpriseTime(CloudDeleteEnterpriseTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteEnterpriseTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteEnterpriseTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteEnterpriseTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteExten  CloudDeleteExtenRequest
     * @return CloudDeleteExtenResponse
     */
    @Override
    public CompletableFuture<CloudDeleteExtenResponse> cloudDeleteExten(CloudDeleteExtenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteExten").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteExtenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteExtenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteQueue  CloudDeleteQueueRequest
     * @return CloudDeleteQueueResponse
     */
    @Override
    public CompletableFuture<CloudDeleteQueueResponse> cloudDeleteQueue(CloudDeleteQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteQueueSkill  CloudDeleteQueueSkillRequest
     * @return CloudDeleteQueueSkillResponse
     */
    @Override
    public CompletableFuture<CloudDeleteQueueSkillResponse> cloudDeleteQueueSkill(CloudDeleteQueueSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteQueueSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteQueueSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteQueueSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteSkill  CloudDeleteSkillRequest
     * @return CloudDeleteSkillResponse
     */
    @Override
    public CompletableFuture<CloudDeleteSkillResponse> cloudDeleteSkill(CloudDeleteSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteTask  CloudDeleteTaskRequest
     * @return CloudDeleteTaskResponse
     */
    @Override
    public CompletableFuture<CloudDeleteTaskResponse> cloudDeleteTask(CloudDeleteTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudDeleteTaskTel  CloudDeleteTaskTelRequest
     * @return CloudDeleteTaskTelResponse
     */
    @Override
    public CompletableFuture<CloudDeleteTaskTelResponse> cloudDeleteTaskTel(CloudDeleteTaskTelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudDeleteTaskTel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudDeleteTaskTelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudDeleteTaskTelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudGetAgent  CloudGetAgentRequest
     * @return CloudGetAgentResponse
     */
    @Override
    public CompletableFuture<CloudGetAgentResponse> cloudGetAgent(CloudGetAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudGetAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudGetAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudGetAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudGetAgentStatus  CloudGetAgentStatusRequest
     * @return CloudGetAgentStatusResponse
     */
    @Override
    public CompletableFuture<CloudGetAgentStatusResponse> cloudGetAgentStatus(CloudGetAgentStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudGetAgentStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudGetAgentStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudGetAgentStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudGetAreaCode  CloudGetAreaCodeRequest
     * @return CloudGetAreaCodeResponse
     */
    @Override
    public CompletableFuture<CloudGetAreaCodeResponse> cloudGetAreaCode(CloudGetAreaCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudGetAreaCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudGetAreaCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudGetAreaCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudGetAsr  CloudGetAsrRequest
     * @return CloudGetAsrResponse
     */
    @Override
    public CompletableFuture<CloudGetAsrResponse> cloudGetAsr(CloudGetAsrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudGetAsr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudGetAsrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudGetAsrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudGetExten  CloudGetExtenRequest
     * @return CloudGetExtenResponse
     */
    @Override
    public CompletableFuture<CloudGetExtenResponse> cloudGetExten(CloudGetExtenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudGetExten").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudGetExtenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudGetExtenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudGetObCdr  CloudGetObCdrRequest
     * @return CloudGetObCdrResponse
     */
    @Override
    public CompletableFuture<CloudGetObCdrResponse> cloudGetObCdr(CloudGetObCdrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudGetObCdr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudGetObCdrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudGetObCdrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudGetQueue  CloudGetQueueRequest
     * @return CloudGetQueueResponse
     */
    @Override
    public CompletableFuture<CloudGetQueueResponse> cloudGetQueue(CloudGetQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudGetQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudGetQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudGetQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudGetRecordUrl  CloudGetRecordUrlRequest
     * @return CloudGetRecordUrlResponse
     */
    @Override
    public CompletableFuture<CloudGetRecordUrlResponse> cloudGetRecordUrl(CloudGetRecordUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudGetRecordUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudGetRecordUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudGetRecordUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudGetTask  CloudGetTaskRequest
     * @return CloudGetTaskResponse
     */
    @Override
    public CompletableFuture<CloudGetTaskResponse> cloudGetTask(CloudGetTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudGetTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudGetTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudGetTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudImportTaskTel  CloudImportTaskTelRequest
     * @return CloudImportTaskTelResponse
     */
    @Override
    public CompletableFuture<CloudImportTaskTelResponse> cloudImportTaskTel(CloudImportTaskTelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudImportTaskTel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudImportTaskTelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudImportTaskTelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudInterruptIvr  CloudInterruptIvrRequest
     * @return CloudInterruptIvrResponse
     */
    @Override
    public CompletableFuture<CloudInterruptIvrResponse> cloudInterruptIvr(CloudInterruptIvrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudInterruptIvr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudInterruptIvrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudInterruptIvrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListAgentGroup  CloudListAgentGroupRequest
     * @return CloudListAgentGroupResponse
     */
    @Override
    public CompletableFuture<CloudListAgentGroupResponse> cloudListAgentGroup(CloudListAgentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListAgentGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListAgentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListAgentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListAgentTel  CloudListAgentTelRequest
     * @return CloudListAgentTelResponse
     */
    @Override
    public CompletableFuture<CloudListAgentTelResponse> cloudListAgentTel(CloudListAgentTelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListAgentTel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListAgentTelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListAgentTelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListAssignedAgentGroup  CloudListAssignedAgentGroupRequest
     * @return CloudListAssignedAgentGroupResponse
     */
    @Override
    public CompletableFuture<CloudListAssignedAgentGroupResponse> cloudListAssignedAgentGroup(CloudListAssignedAgentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListAssignedAgentGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListAssignedAgentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListAssignedAgentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListCurlLog  CloudListCurlLogRequest
     * @return CloudListCurlLogResponse
     */
    @Override
    public CompletableFuture<CloudListCurlLogResponse> cloudListCurlLog(CloudListCurlLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListCurlLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListCurlLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListCurlLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListEnterpriseTime  CloudListEnterpriseTimeRequest
     * @return CloudListEnterpriseTimeResponse
     */
    @Override
    public CompletableFuture<CloudListEnterpriseTimeResponse> cloudListEnterpriseTime(CloudListEnterpriseTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListEnterpriseTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListEnterpriseTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListEnterpriseTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListExten  CloudListExtenRequest
     * @return CloudListExtenResponse
     */
    @Override
    public CompletableFuture<CloudListExtenResponse> cloudListExten(CloudListExtenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListExten").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListExtenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListExtenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListFreeAgent  CloudListFreeAgentRequest
     * @return CloudListFreeAgentResponse
     */
    @Override
    public CompletableFuture<CloudListFreeAgentResponse> cloudListFreeAgent(CloudListFreeAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListFreeAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListFreeAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListFreeAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListOnlineAgent  CloudListOnlineAgentRequest
     * @return CloudListOnlineAgentResponse
     */
    @Override
    public CompletableFuture<CloudListOnlineAgentResponse> cloudListOnlineAgent(CloudListOnlineAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListOnlineAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListOnlineAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListOnlineAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListQueue  CloudListQueueRequest
     * @return CloudListQueueResponse
     */
    @Override
    public CompletableFuture<CloudListQueueResponse> cloudListQueue(CloudListQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListQueueSkill  CloudListQueueSkillRequest
     * @return CloudListQueueSkillResponse
     */
    @Override
    public CompletableFuture<CloudListQueueSkillResponse> cloudListQueueSkill(CloudListQueueSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListQueueSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListQueueSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListQueueSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListSkill  CloudListSkillRequest
     * @return CloudListSkillResponse
     */
    @Override
    public CompletableFuture<CloudListSkillResponse> cloudListSkill(CloudListSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudListTaskFile  CloudListTaskFileRequest
     * @return CloudListTaskFileResponse
     */
    @Override
    public CompletableFuture<CloudListTaskFileResponse> cloudListTaskFile(CloudListTaskFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudListTaskFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudListTaskFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudListTaskFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudMonitorTask  CloudMonitorTaskRequest
     * @return CloudMonitorTaskResponse
     */
    @Override
    public CompletableFuture<CloudMonitorTaskResponse> cloudMonitorTask(CloudMonitorTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudMonitorTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudMonitorTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudMonitorTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudOutboundObClidReport  CloudOutboundObClidReportRequest
     * @return CloudOutboundObClidReportResponse
     */
    @Override
    public CompletableFuture<CloudOutboundObClidReportResponse> cloudOutboundObClidReport(CloudOutboundObClidReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudOutboundObClidReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudOutboundObClidReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudOutboundObClidReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudOutboundPreviewObReport  CloudOutboundPreviewObReportRequest
     * @return CloudOutboundPreviewObReportResponse
     */
    @Override
    public CompletableFuture<CloudOutboundPreviewObReportResponse> cloudOutboundPreviewObReport(CloudOutboundPreviewObReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudOutboundPreviewObReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudOutboundPreviewObReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudOutboundPreviewObReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudPauseTask  CloudPauseTaskRequest
     * @return CloudPauseTaskResponse
     */
    @Override
    public CompletableFuture<CloudPauseTaskResponse> cloudPauseTask(CloudPauseTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudPauseTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudPauseTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudPauseTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudPreviewoutcall  CloudPreviewoutcallRequest
     * @return CloudPreviewoutcallResponse
     */
    @Override
    public CompletableFuture<CloudPreviewoutcallResponse> cloudPreviewoutcall(CloudPreviewoutcallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudPreviewoutcall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudPreviewoutcallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudPreviewoutcallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryAgent  CloudQueryAgentRequest
     * @return CloudQueryAgentResponse
     */
    @Override
    public CompletableFuture<CloudQueryAgentResponse> cloudQueryAgent(CloudQueryAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryAgentCnoAndName  CloudQueryAgentCnoAndNameRequest
     * @return CloudQueryAgentCnoAndNameResponse
     */
    @Override
    public CompletableFuture<CloudQueryAgentCnoAndNameResponse> cloudQueryAgentCnoAndName(CloudQueryAgentCnoAndNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryAgentCnoAndName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryAgentCnoAndNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryAgentCnoAndNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryAgentGroup  CloudQueryAgentGroupRequest
     * @return CloudQueryAgentGroupResponse
     */
    @Override
    public CompletableFuture<CloudQueryAgentGroupResponse> cloudQueryAgentGroup(CloudQueryAgentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryAgentGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryAgentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryAgentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryAgentSkill  CloudQueryAgentSkillRequest
     * @return CloudQueryAgentSkillResponse
     */
    @Override
    public CompletableFuture<CloudQueryAgentSkillResponse> cloudQueryAgentSkill(CloudQueryAgentSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryAgentSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryAgentSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryAgentSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryIbCdr  CloudQueryIbCdrRequest
     * @return CloudQueryIbCdrResponse
     */
    @Override
    public CompletableFuture<CloudQueryIbCdrResponse> cloudQueryIbCdr(CloudQueryIbCdrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryIbCdr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryIbCdrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryIbCdrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryObCdr  CloudQueryObCdrRequest
     * @return CloudQueryObCdrResponse
     */
    @Override
    public CompletableFuture<CloudQueryObCdrResponse> cloudQueryObCdr(CloudQueryObCdrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryObCdr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryObCdrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryObCdrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryPredictiveCallCdr  CloudQueryPredictiveCallCdrRequest
     * @return CloudQueryPredictiveCallCdrResponse
     */
    @Override
    public CompletableFuture<CloudQueryPredictiveCallCdrResponse> cloudQueryPredictiveCallCdr(CloudQueryPredictiveCallCdrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryPredictiveCallCdr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryPredictiveCallCdrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryPredictiveCallCdrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryRasrEvent  CloudQueryRasrEventRequest
     * @return CloudQueryRasrEventResponse
     */
    @Override
    public CompletableFuture<CloudQueryRasrEventResponse> cloudQueryRasrEvent(CloudQueryRasrEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryRasrEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryRasrEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryRasrEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryTask  CloudQueryTaskRequest
     * @return CloudQueryTaskResponse
     */
    @Override
    public CompletableFuture<CloudQueryTaskResponse> cloudQueryTask(CloudQueryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudQueryWebcallCdr  CloudQueryWebcallCdrRequest
     * @return CloudQueryWebcallCdrResponse
     */
    @Override
    public CompletableFuture<CloudQueryWebcallCdrResponse> cloudQueryWebcallCdr(CloudQueryWebcallCdrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudQueryWebcallCdr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudQueryWebcallCdrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudQueryWebcallCdrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudStartTask  CloudStartTaskRequest
     * @return CloudStartTaskResponse
     */
    @Override
    public CompletableFuture<CloudStartTaskResponse> cloudStartTask(CloudStartTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudStartTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudStartTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudStartTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudUnassignAgentGroup  CloudUnassignAgentGroupRequest
     * @return CloudUnassignAgentGroupResponse
     */
    @Override
    public CompletableFuture<CloudUnassignAgentGroupResponse> cloudUnassignAgentGroup(CloudUnassignAgentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudUnassignAgentGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudUnassignAgentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudUnassignAgentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudUpdateAgent  CloudUpdateAgentRequest
     * @return CloudUpdateAgentResponse
     */
    @Override
    public CompletableFuture<CloudUpdateAgentResponse> cloudUpdateAgent(CloudUpdateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudUpdateAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudUpdateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudUpdateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudUpdateTask  CloudUpdateTaskRequest
     * @return CloudUpdateTaskResponse
     */
    @Override
    public CompletableFuture<CloudUpdateTaskResponse> cloudUpdateTask(CloudUpdateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudUpdateTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudUpdateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudUpdateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloudWebcall  CloudWebcallRequest
     * @return CloudWebcallResponse
     */
    @Override
    public CompletableFuture<CloudWebcallResponse> cloudWebcall(CloudWebcallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloudWebcall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudWebcallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudWebcallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 1,000 voice notifications for each task.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of CreateCallTask  CreateCallTaskRequest
     * @return CreateCallTaskResponse
     */
    @Override
    public CompletableFuture<CreateCallTaskResponse> createCallTask(CreateCallTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCallTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCallTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCallTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console. In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of CreateRobotTask  CreateRobotTaskRequest
     * @return CreateRobotTaskResponse
     */
    @Override
    public CompletableFuture<CreateRobotTaskResponse> createRobotTask(CreateRobotTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRobotTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRobotTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRobotTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DegradeVideoFile  DegradeVideoFileRequest
     * @return DegradeVideoFileResponse
     */
    @Override
    public CompletableFuture<DegradeVideoFileResponse> degradeVideoFile(DegradeVideoFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DegradeVideoFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DegradeVideoFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DegradeVideoFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only tasks that are not started, that are completed, and that are terminated.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of DeleteRobotTask  DeleteRobotTaskRequest
     * @return DeleteRobotTaskResponse
     */
    @Override
    public CompletableFuture<DeleteRobotTaskResponse> deleteRobotTask(DeleteRobotTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRobotTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRobotTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRobotTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of ExecuteCallTask  ExecuteCallTaskRequest
     * @return ExecuteCallTaskResponse
     */
    @Override
    public CompletableFuture<ExecuteCallTaskResponse> executeCallTask(ExecuteCallTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteCallTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteCallTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteCallTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCallMediaType  GetCallMediaTypeRequest
     * @return GetCallMediaTypeResponse
     */
    @Override
    public CompletableFuture<GetCallMediaTypeResponse> getCallMediaType(GetCallMediaTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCallMediaType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCallMediaTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCallMediaTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCallProgress  GetCallProgressRequest
     * @return GetCallProgressResponse
     */
    @Override
    public CompletableFuture<GetCallProgressResponse> getCallProgress(GetCallProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCallProgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCallProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCallProgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of GetHotlineQualificationByOrder  GetHotlineQualificationByOrderRequest
     * @return GetHotlineQualificationByOrderResponse
     */
    @Override
    public CompletableFuture<GetHotlineQualificationByOrderResponse> getHotlineQualificationByOrder(GetHotlineQualificationByOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineQualificationByOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineQualificationByOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineQualificationByOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTemporaryFileUrl  GetTemporaryFileUrlRequest
     * @return GetTemporaryFileUrlResponse
     */
    @Override
    public CompletableFuture<GetTemporaryFileUrlResponse> getTemporaryFileUrl(GetTemporaryFileUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemporaryFileUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemporaryFileUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemporaryFileUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to five times per second per account.</p>
     * 
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    @Override
    public CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideoFieldUrl  GetVideoFieldUrlRequest
     * @return GetVideoFieldUrlResponse
     */
    @Override
    public CompletableFuture<GetVideoFieldUrlResponse> getVideoFieldUrl(GetVideoFieldUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoFieldUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoFieldUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoFieldUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Your enterprise qualification is approved. For more information, see <a href="https://help.aliyun.com/document_detail/149795.html">Submit enterprise qualifications</a>.</p>
     * <ul>
     * <li>Voice numbers are purchased. For more information, see <a href="https://help.aliyun.com/document_detail/149794.html">Purchase numbers</a>.</li>
     * <li>When the subscriber answers the call, the subscriber hears a voice that instructs the subscriber to press a key as needed. If the <a href="https://help.aliyun.com/document_detail/112503.html">message receipt</a> feature is enabled, the Voice Messaging Service (VMS) platform returns the information about the key pressed by the subscriber to the business system. The key information includes the order confirmation, questionnaire survey, and satisfaction survey completed by the subscriber.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of IvrCall  IvrCallRequest
     * @return IvrCallResponse
     */
    @Override
    public CompletableFuture<IvrCallResponse> ivrCall(IvrCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IvrCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IvrCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IvrCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of ListCallTask  ListCallTaskRequest
     * @return ListCallTaskResponse
     */
    @Override
    public CompletableFuture<ListCallTaskResponse> listCallTask(ListCallTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCallTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCallTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCallTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of ListCallTaskDetail  ListCallTaskDetailRequest
     * @return ListCallTaskDetailResponse
     */
    @Override
    public CompletableFuture<ListCallTaskDetailResponse> listCallTaskDetail(ListCallTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCallTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCallTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCallTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of ListHotlineTransferRegisterFile  ListHotlineTransferRegisterFileRequest
     * @return ListHotlineTransferRegisterFileResponse
     */
    @Override
    public CompletableFuture<ListHotlineTransferRegisterFileResponse> listHotlineTransferRegisterFile(ListHotlineTransferRegisterFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHotlineTransferRegisterFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotlineTransferRegisterFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotlineTransferRegisterFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceInstanceForPage  ListServiceInstanceForPageRequest
     * @return ListServiceInstanceForPageResponse
     */
    @Override
    public CompletableFuture<ListServiceInstanceForPageResponse> listServiceInstanceForPage(ListServiceInstanceForPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceInstanceForPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceInstanceForPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceInstanceForPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PauseVideoFile  PauseVideoFileRequest
     * @return PauseVideoFileResponse
     */
    @Override
    public CompletableFuture<PauseVideoFileResponse> pauseVideoFile(PauseVideoFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PauseVideoFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PauseVideoFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PauseVideoFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PlayVideoFile  PlayVideoFileRequest
     * @return PlayVideoFileResponse
     */
    @Override
    public CompletableFuture<PlayVideoFileResponse> playVideoFile(PlayVideoFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PlayVideoFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PlayVideoFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PlayVideoFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>QueryCallDetailByCallId is a common query operation. You can call this operation to query the details of a voice notification, voice verification code, interactive voice response (IVR), intelligent inbound voice call, intelligent outbound voice call, or intelligent robocall.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryCallDetailByCallId  QueryCallDetailByCallIdRequest
     * @return QueryCallDetailByCallIdResponse
     */
    @Override
    public CompletableFuture<QueryCallDetailByCallIdResponse> queryCallDetailByCallId(QueryCallDetailByCallIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCallDetailByCallId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCallDetailByCallIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCallDetailByCallIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCallDetailByTaskId  QueryCallDetailByTaskIdRequest
     * @return QueryCallDetailByTaskIdResponse
     */
    @Override
    public CompletableFuture<QueryCallDetailByTaskIdResponse> queryCallDetailByTaskId(QueryCallDetailByTaskIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCallDetailByTaskId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCallDetailByTaskIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCallDetailByTaskIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryCallInPoolTransferConfig  QueryCallInPoolTransferConfigRequest
     * @return QueryCallInPoolTransferConfigResponse
     */
    @Override
    public CompletableFuture<QueryCallInPoolTransferConfigResponse> queryCallInPoolTransferConfig(QueryCallInPoolTransferConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCallInPoolTransferConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCallInPoolTransferConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCallInPoolTransferConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryCallInTransferRecord  QueryCallInTransferRecordRequest
     * @return QueryCallInTransferRecordResponse
     */
    @Override
    public CompletableFuture<QueryCallInTransferRecordResponse> queryCallInTransferRecord(QueryCallInTransferRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCallInTransferRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCallInTransferRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCallInTransferRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRobotInfoList  QueryRobotInfoListRequest
     * @return QueryRobotInfoListResponse
     */
    @Override
    public CompletableFuture<QueryRobotInfoListResponse> queryRobotInfoList(QueryRobotInfoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRobotInfoList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRobotInfoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRobotInfoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotTaskCallDetail  QueryRobotTaskCallDetailRequest
     * @return QueryRobotTaskCallDetailResponse
     */
    @Override
    public CompletableFuture<QueryRobotTaskCallDetailResponse> queryRobotTaskCallDetail(QueryRobotTaskCallDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRobotTaskCallDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRobotTaskCallDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRobotTaskCallDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotTaskCallList  QueryRobotTaskCallListRequest
     * @return QueryRobotTaskCallListResponse
     */
    @Override
    public CompletableFuture<QueryRobotTaskCallListResponse> queryRobotTaskCallList(QueryRobotTaskCallListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRobotTaskCallList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRobotTaskCallListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRobotTaskCallListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotTaskDetail  QueryRobotTaskDetailRequest
     * @return QueryRobotTaskDetailResponse
     */
    @Override
    public CompletableFuture<QueryRobotTaskDetailResponse> queryRobotTaskDetail(QueryRobotTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRobotTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRobotTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRobotTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotTaskList  QueryRobotTaskListRequest
     * @return QueryRobotTaskListResponse
     */
    @Override
    public CompletableFuture<QueryRobotTaskListResponse> queryRobotTaskList(QueryRobotTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRobotTaskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRobotTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRobotTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotv2AllList  QueryRobotv2AllListRequest
     * @return QueryRobotv2AllListResponse
     */
    @Override
    public CompletableFuture<QueryRobotv2AllListResponse> queryRobotv2AllList(QueryRobotv2AllListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRobotv2AllList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRobotv2AllListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRobotv2AllListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryVideoPlayProgress  QueryVideoPlayProgressRequest
     * @return QueryVideoPlayProgressResponse
     */
    @Override
    public CompletableFuture<QueryVideoPlayProgressResponse> queryVideoPlayProgress(QueryVideoPlayProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVideoPlayProgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVideoPlayProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVideoPlayProgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account.</p>
     * 
     * @param request the request parameters of QueryVirtualNumberRelation  QueryVirtualNumberRelationRequest
     * @return QueryVirtualNumberRelationResponse
     */
    @Override
    public CompletableFuture<QueryVirtualNumberRelationResponse> queryVirtualNumberRelation(QueryVirtualNumberRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVirtualNumberRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVirtualNumberRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVirtualNumberRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryVmsRealNumberCallConnectionRateInfo  QueryVmsRealNumberCallConnectionRateInfoRequest
     * @return QueryVmsRealNumberCallConnectionRateInfoResponse
     */
    @Override
    public CompletableFuture<QueryVmsRealNumberCallConnectionRateInfoResponse> queryVmsRealNumberCallConnectionRateInfo(QueryVmsRealNumberCallConnectionRateInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVmsRealNumberCallConnectionRateInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVmsRealNumberCallConnectionRateInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVmsRealNumberCallConnectionRateInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryVmsVirtualNumberRelationByPage  QueryVmsVirtualNumberRelationByPageRequest
     * @return QueryVmsVirtualNumberRelationByPageResponse
     */
    @Override
    public CompletableFuture<QueryVmsVirtualNumberRelationByPageResponse> queryVmsVirtualNumberRelationByPage(QueryVmsVirtualNumberRelationByPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVmsVirtualNumberRelationByPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVmsVirtualNumberRelationByPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVmsVirtualNumberRelationByPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryVoiceFileAuditInfo  QueryVoiceFileAuditInfoRequest
     * @return QueryVoiceFileAuditInfoResponse
     */
    @Override
    public CompletableFuture<QueryVoiceFileAuditInfoResponse> queryVoiceFileAuditInfo(QueryVoiceFileAuditInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVoiceFileAuditInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVoiceFileAuditInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVoiceFileAuditInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecoverCallInConfig  RecoverCallInConfigRequest
     * @return RecoverCallInConfigResponse
     */
    @Override
    public CompletableFuture<RecoverCallInConfigResponse> recoverCallInConfig(RecoverCallInConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecoverCallInConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecoverCallInConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecoverCallInConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResumeVideoFile  ResumeVideoFileRequest
     * @return ResumeVideoFileResponse
     */
    @Override
    public CompletableFuture<ResumeVideoFileResponse> resumeVideoFile(ResumeVideoFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeVideoFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeVideoFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeVideoFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SeekVideoFile  SeekVideoFileRequest
     * @return SeekVideoFileResponse
     */
    @Override
    public CompletableFuture<SeekVideoFileResponse> seekVideoFile(SeekVideoFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SeekVideoFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SeekVideoFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SeekVideoFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of SendVerification  SendVerificationRequest
     * @return SendVerificationResponse
     */
    @Override
    public CompletableFuture<SendVerificationResponse> sendVerification(SendVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of SetTransferCalleePoolConfig  SetTransferCalleePoolConfigRequest
     * @return SetTransferCalleePoolConfigResponse
     */
    @Override
    public CompletableFuture<SetTransferCalleePoolConfigResponse> setTransferCalleePoolConfig(SetTransferCalleePoolConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetTransferCalleePoolConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetTransferCalleePoolConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetTransferCalleePoolConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.</p>
     * <ul>
     * <li>For more information about voice plans or voice service billing, see <a href="https://help.aliyun.com/document_detail/150083.html">Pricing of VMS on China site (aliyun.com)</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account.</p>
     * 
     * @param request the request parameters of SingleCallByTts  SingleCallByTtsRequest
     * @return SingleCallByTtsResponse
     */
    @Override
    public CompletableFuture<SingleCallByTtsResponse> singleCallByTts(SingleCallByTtsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SingleCallByTts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SingleCallByTtsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SingleCallByTtsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SingleCallByVideo  SingleCallByVideoRequest
     * @return SingleCallByVideoResponse
     */
    @Override
    public CompletableFuture<SingleCallByVideoResponse> singleCallByVideo(SingleCallByVideoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SingleCallByVideo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SingleCallByVideoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SingleCallByVideoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.
     * You can call the <a href="https://help.aliyun.com/document_detail/393519.html">SingleCallByTts</a> operation to send voice notifications with variables.</p>
     * </blockquote>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,200 times per second per account.</p>
     * 
     * @param request the request parameters of SingleCallByVoice  SingleCallByVoiceRequest
     * @return SingleCallByVoiceResponse
     */
    @Override
    public CompletableFuture<SingleCallByVoiceResponse> singleCallByVoice(SingleCallByVoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SingleCallByVoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SingleCallByVoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SingleCallByVoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SkipVideoFile  SkipVideoFileRequest
     * @return SkipVideoFileResponse
     */
    @Override
    public CompletableFuture<SkipVideoFileResponse> skipVideoFile(SkipVideoFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SkipVideoFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SkipVideoFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SkipVideoFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The SmartCall operation must be used together with the <a href="https://help.aliyun.com/document_detail/112703.html">intelligent outbound HTTP operation</a>. After the call initiated by the Voice Messaging Service (VMS) platform is connected, the VMS platform sends the text converted from speech back to the business side, and the business side then returns the follow-up action to the VMS platform.</p>
     * <ul>
     * <li>The SmartCall operation does not support the following characters: <code>@ = : &quot;&quot; $ { } ^ * ￥</code>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account.</p>
     * 
     * @param request the request parameters of SmartCall  SmartCallRequest
     * @return SmartCallResponse
     */
    @Override
    public CompletableFuture<SmartCallResponse> smartCall(SmartCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SmartCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SmartCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SmartCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate a specified action on the called number of an outbound robocall when the call is transferred to an agent of the call center.</p>
     * <blockquote>
     * <p>You can only initiate the action of bridging a called number and an agent of the call center.</p>
     * </blockquote>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of SmartCallOperate  SmartCallOperateRequest
     * @return SmartCallOperateResponse
     */
    @Override
    public CompletableFuture<SmartCallOperateResponse> smartCallOperate(SmartCallOperateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SmartCallOperate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SmartCallOperateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SmartCallOperateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of StartRobotTask  StartRobotTaskRequest
     * @return StartRobotTaskResponse
     */
    @Override
    public CompletableFuture<StartRobotTaskResponse> startRobotTask(StartRobotTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartRobotTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartRobotTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartRobotTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopCallInConfig  StopCallInConfigRequest
     * @return StopCallInConfigResponse
     */
    @Override
    public CompletableFuture<StopCallInConfigResponse> stopCallInConfig(StopCallInConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopCallInConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopCallInConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopCallInConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you stop a robocall task, you can call the <a href="~~StartRobotTask~~">StartRobotTask</a> operation to start it again.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of StopRobotTask  StopRobotTaskRequest
     * @return StopRobotTaskResponse
     */
    @Override
    public CompletableFuture<StopRobotTaskResponse> stopRobotTask(StopRobotTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopRobotTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopRobotTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopRobotTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of SubmitHotlineTransferRegister  SubmitHotlineTransferRegisterRequest
     * @return SubmitHotlineTransferRegisterResponse
     */
    @Override
    public CompletableFuture<SubmitHotlineTransferRegisterResponse> submitHotlineTransferRegister(SubmitHotlineTransferRegisterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitHotlineTransferRegister").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitHotlineTransferRegisterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitHotlineTransferRegisterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeVideoFile  UpgradeVideoFileRequest
     * @return UpgradeVideoFileResponse
     */
    @Override
    public CompletableFuture<UpgradeVideoFileResponse> upgradeVideoFile(UpgradeVideoFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeVideoFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeVideoFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeVideoFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of UploadRobotTaskCalledFile  UploadRobotTaskCalledFileRequest
     * @return UploadRobotTaskCalledFileResponse
     */
    @Override
    public CompletableFuture<UploadRobotTaskCalledFileResponse> uploadRobotTaskCalledFile(UploadRobotTaskCalledFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadRobotTaskCalledFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadRobotTaskCalledFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadRobotTaskCalledFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
