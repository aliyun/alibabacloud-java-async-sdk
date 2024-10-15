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
     * @param request the request parameters of ListHotlineTransferNumber  ListHotlineTransferNumberRequest
     * @return ListHotlineTransferNumberResponse
     */
    @Override
    public CompletableFuture<ListHotlineTransferNumberResponse> listHotlineTransferNumber(ListHotlineTransferNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHotlineTransferNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotlineTransferNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotlineTransferNumberResponse> future = new CompletableFuture<>();
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
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryVirtualNumber  QueryVirtualNumberRequest
     * @return QueryVirtualNumberResponse
     */
    @Override
    public CompletableFuture<QueryVirtualNumberResponse> queryVirtualNumber(QueryVirtualNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVirtualNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVirtualNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVirtualNumberResponse> future = new CompletableFuture<>();
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
