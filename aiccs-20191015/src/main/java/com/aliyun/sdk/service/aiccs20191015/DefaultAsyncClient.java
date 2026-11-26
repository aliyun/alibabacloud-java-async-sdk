// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aiccs20191015.models.*;
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
        this.product = "aiccs";
        this.version = "2019-10-15";
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
     * <blockquote>
     * <p>Hotline numbers are used only for inbound and outbound calls.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AddHotlineNumber  AddHotlineNumberRequest
     * @return AddHotlineNumberResponse
     */
    @Override
    public CompletableFuture<AddHotlineNumberResponse> addHotlineNumber(AddHotlineNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddHotlineNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddHotlineNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddHotlineNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddInboundNumber  AddInboundNumberRequest
     * @return AddInboundNumberResponse
     */
    @Override
    public CompletableFuture<AddInboundNumberResponse> addInboundNumber(AddInboundNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddInboundNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddInboundNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddInboundNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddLargeModel  AddLargeModelRequest
     * @return AddLargeModelResponse
     */
    @Override
    public CompletableFuture<AddLargeModelResponse> addLargeModel(AddLargeModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLargeModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLargeModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLargeModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddModelApplication  AddModelApplicationRequest
     * @return AddModelApplicationResponse
     */
    @Override
    public CompletableFuture<AddModelApplicationResponse> addModelApplication(AddModelApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddModelApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddModelApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddModelApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddOuterAccount  AddOuterAccountRequest
     * @return AddOuterAccountResponse
     */
    @Override
    public CompletableFuture<AddOuterAccountResponse> addOuterAccount(AddOuterAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddOuterAccount").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddOuterAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddOuterAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSkillGroup  AddSkillGroupRequest
     * @return AddSkillGroupResponse
     */
    @Override
    public CompletableFuture<AddSkillGroupResponse> addSkillGroup(AddSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSkillGroup").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AiccsSmartCall  AiccsSmartCallRequest
     * @return AiccsSmartCallResponse
     */
    @Override
    public CompletableFuture<AiccsSmartCallResponse> aiccsSmartCall(AiccsSmartCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AiccsSmartCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AiccsSmartCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AiccsSmartCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AiccsSmartCallOperate  AiccsSmartCallOperateRequest
     * @return AiccsSmartCallOperateResponse
     */
    @Override
    public CompletableFuture<AiccsSmartCallOperateResponse> aiccsSmartCallOperate(AiccsSmartCallOperateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AiccsSmartCallOperate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AiccsSmartCallOperateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AiccsSmartCallOperateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AnswerCall  AnswerCallRequest
     * @return AnswerCallResponse
     */
    @Override
    public CompletableFuture<AnswerCallResponse> answerCall(AnswerCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AnswerCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AnswerCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AnswerCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you create an intelligent contact robot call task, you can call this operation to append task details.
     * Before you call this operation, make sure that you have a successfully created intelligent contact robot call task.
     * If you do not have a successfully created intelligent contact robot call task, you can click Create Task on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page or call the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> operation to create a task.</p>
     * <h3>Rate limit</h3>
     * <ul>
     * <li>Call frequency per user: not limited.</li>
     * <li>API rate limit: 500 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachTask  AttachTaskRequest
     * @return AttachTaskResponse
     */
    @Override
    public CompletableFuture<AttachTaskResponse> attachTask(AttachTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchCreateQualityProjects  BatchCreateQualityProjectsRequest
     * @return BatchCreateQualityProjectsResponse
     */
    @Override
    public CompletableFuture<BatchCreateQualityProjectsResponse> batchCreateQualityProjects(BatchCreateQualityProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCreateQualityProjects").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateQualityProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateQualityProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to cancel a call task, or manually cancel a call task on the <strong>Call task management</strong> &gt; <strong>Manage</strong> &gt; <strong>Execution records</strong> &gt; <strong>Pending</strong> page.</li>
     * <li>Before calling this operation, make sure that you have created a call task and imported the callee data.</li>
     * <li>If you do not have an existing call task, you can create a call task and import callee data on the Call task management page, or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> and <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operations to create a call task and import callee data.</li>
     * <li>Canceling a call task may affect your business. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelAiCallDetails  CancelAiCallDetailsRequest
     * @return CancelAiCallDetailsResponse
     */
    @Override
    public CompletableFuture<CancelAiCallDetailsResponse> cancelAiCallDetails(CancelAiCallDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelAiCallDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelAiCallDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelAiCallDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to cancel an intelligent contact robot call task, or manually cancel the task on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page.</li>
     * <li>After an intelligent contact robot call task is canceled, it cannot be restarted. Proceed with caution.</li>
     * <li>If you want to pause a task and restart it later, you can manually pause the task on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page or call the <a href="https://help.aliyun.com/document_detail/2718006.html">StopTask</a> operation to pause the task.</li>
     * </ul>
     * <h3>Rate limit</h3>
     * <ul>
     * <li>Rate limit per user: None.</li>
     * <li>API rate limit: 500 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    @Override
    public CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Currently, you can only change the status of an online customer service agent to offline.</p>
     * 
     * @param request the request parameters of ChangeChatAgentStatus  ChangeChatAgentStatusRequest
     * @return ChangeChatAgentStatusResponse
     */
    @Override
    public CompletableFuture<ChangeChatAgentStatusResponse> changeChatAgentStatus(ChangeChatAgentStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeChatAgentStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeChatAgentStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeChatAgentStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeQualityProjectStatus  ChangeQualityProjectStatusRequest
     * @return ChangeQualityProjectStatusResponse
     */
    @Override
    public CompletableFuture<ChangeQualityProjectStatusResponse> changeQualityProjectStatus(ChangeQualityProjectStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeQualityProjectStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeQualityProjectStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeQualityProjectStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/activate-aiccs">activated the service</a> and <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/create-an-instance">created an instance</a>.</li>
     * <li>If you need to specify skill group information, refer to the instructions in the <a href="#api-detail-35">request parameters</a> section.</li>
     * <li>You can call <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-deleteagent">DeleteAgent</a> to delete an agent, or call <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-updateagent">UpdateAgent</a> to update agent data and manage the agent.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Not limited.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    @Override
    public CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before creating a voice call task, use an agent to perform a test call to ensure that the results meet your requirements.</p>
     * 
     * @param request the request parameters of CreateAiCallTask  CreateAiCallTaskRequest
     * @return CreateAiCallTaskResponse
     */
    @Override
    public CompletableFuture<CreateAiCallTaskResponse> createAiCallTask(CreateAiCallTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAiCallTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAiCallTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAiCallTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The <strong>Data</strong> parameter in the response is the task ID.</li>
     * <li>After you create an intelligent outbound call task, you can call the <a href="https://help.aliyun.com/document_detail/2718021.html">UpdateAiOutboundTask</a> operation to update the task.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: not throttled.</li>
     * <li>API frequency: 20 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAiOutboundTask  CreateAiOutboundTaskRequest
     * @return CreateAiOutboundTaskResponse
     */
    @Override
    public CompletableFuture<CreateAiOutboundTaskResponse> createAiOutboundTask(CreateAiOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAiOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAiOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAiOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, confirm the instance ID and task ID. For more information, see the instructions in the <a href="#api-detail-35">Request parameters</a> section.</p>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Calls per user: 20 calls per second.</li>
     * <li>API rate limit: 20 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAiOutboundTaskBatch  CreateAiOutboundTaskBatchRequest
     * @return CreateAiOutboundTaskBatchResponse
     */
    @Override
    public CompletableFuture<CreateAiOutboundTaskBatchResponse> createAiOutboundTaskBatch(CreateAiOutboundTaskBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAiOutboundTaskBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAiOutboundTaskBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAiOutboundTaskBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you need to update department information, you can invoke the <a href="https://help.aliyun.com/document_detail/2717977.html">UpdateDepartment</a> API.</li>
     * <li>After successfully creating department information by invoking this API, the <strong>Data</strong> field in the response contains the department ID. If you need to query the department ID later, you can invoke the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDepartment  CreateDepartmentRequest
     * @return CreateDepartmentResponse
     */
    @Override
    public CompletableFuture<CreateDepartmentResponse> createDepartment(CreateDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDepartment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOutboundTask  CreateOutboundTaskRequest
     * @return CreateOutboundTaskResponse
     */
    @Override
    public CompletableFuture<CreateOutboundTaskResponse> createOutboundTask(CreateOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQualityProject  CreateQualityProjectRequest
     * @return CreateQualityProjectResponse
     */
    @Override
    public CompletableFuture<CreateQualityProjectResponse> createQualityProject(CreateQualityProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQualityProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQualityProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQualityProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQualityRule  CreateQualityRuleRequest
     * @return CreateQualityRuleResponse
     */
    @Override
    public CompletableFuture<CreateQualityRuleResponse> createQualityRule(CreateQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API allows you to define information such as the external display name and description of the skill group. For details, see <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>The <strong>Data</strong> parameter returned by this API is the ID of the successfully created skill group.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateSkillGroup  CreateSkillGroupRequest
     * @return CreateSkillGroupResponse
     */
    @Override
    public CompletableFuture<CreateSkillGroupResponse> createSkillGroup(CreateSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to create a job, or create one in the <strong>Artificial Intelligence Cloud Call Service console</strong> &gt; <strong>Outbound Robot (Standard Edition)</strong> &gt; <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> by clicking <strong>Create Job</strong>.  </li>
     * <li>After invoking this API, the <strong>Data</strong> field in the response contains the unique job ID of the robot outbound calling task.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    @Override
    public CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateThirdSsoAgent  CreateThirdSsoAgentRequest
     * @return CreateThirdSsoAgentResponse
     */
    @Override
    public CompletableFuture<CreateThirdSsoAgentResponse> createThirdSsoAgent(CreateThirdSsoAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateThirdSsoAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateThirdSsoAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateThirdSsoAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before deleting an agent account, verify the agent account name and instance ID. For more information, see the instructions in the <a href="#api-detail-35">Request parameters</a> section.</li>
     * <li>If you delete an agent account by mistake, you can call the <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-createagent">CreateAgent</a> operation to recreate the agent account.<blockquote>
     * <p>If you add the account again after it is deleted, the agent ID remains unchanged.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Not limited.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    @Override
    public CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAgent").setMethod(HttpMethod.DELETE).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Deletion is a sensitive operation. Proceed with caution.</p>
     * </blockquote>
     * <ul>
     * <li>Before deletion, confirm the ID and information of the task to be deleted. You can call the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> operation to view the list of outbound call tasks and confirm the task name, description, and corresponding task ID.</li>
     * <li>To recreate an AI outbound call task, call the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> operation.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: 20 calls per second.</li>
     * <li>API rate limit: 20 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAiOutboundTask  DeleteAiOutboundTaskRequest
     * @return DeleteAiOutboundTaskResponse
     */
    @Override
    public CompletableFuture<DeleteAiOutboundTaskResponse> deleteAiOutboundTask(DeleteAiOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAiOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAiOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAiOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deletion is a sensitive operation. Proceed with caution.</li>
     * <li>Before invoking this API, we recommend that you confirm the AICCS instance ID and department ID. For guidance on how to obtain them, see the instructions in <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>If you accidentally delete department information, you can call the <a href="https://help.aliyun.com/document_detail/2717974.html">CreateDepartment</a> API to recreate it.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDepartment  DeleteDepartmentRequest
     * @return DeleteDepartmentResponse
     */
    @Override
    public CompletableFuture<DeleteDepartmentResponse> deleteDepartment(DeleteDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDepartment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHotlineNumber  DeleteHotlineNumberRequest
     * @return DeleteHotlineNumberResponse
     */
    @Override
    public CompletableFuture<DeleteHotlineNumberResponse> deleteHotlineNumber(DeleteHotlineNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHotlineNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHotlineNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHotlineNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOutboundTask  DeleteOutboundTaskRequest
     * @return DeleteOutboundTaskResponse
     */
    @Override
    public CompletableFuture<DeleteOutboundTaskResponse> deleteOutboundTask(DeleteOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOuterAccount  DeleteOuterAccountRequest
     * @return DeleteOuterAccountResponse
     */
    @Override
    public CompletableFuture<DeleteOuterAccountResponse> deleteOuterAccount(DeleteOuterAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteOuterAccount").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOuterAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOuterAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQualityProject  DeleteQualityProjectRequest
     * @return DeleteQualityProjectResponse
     */
    @Override
    public CompletableFuture<DeleteQualityProjectResponse> deleteQualityProject(DeleteQualityProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQualityProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQualityProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQualityProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQualityRule  DeleteQualityRuleRequest
     * @return DeleteQualityRuleResponse
     */
    @Override
    public CompletableFuture<DeleteQualityRuleResponse> deleteQualityRule(DeleteQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSkillGroup  DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    @Override
    public CompletableFuture<DeleteSkillGroupResponse> deleteSkillGroup(DeleteSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSkillGroup").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRecordData  DescribeRecordDataRequest
     * @return DescribeRecordDataResponse
     */
    @Override
    public CompletableFuture<DescribeRecordDataResponse> describeRecordData(DescribeRecordDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRecordData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRecordDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRecordDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EditQualityProject  EditQualityProjectRequest
     * @return EditQualityProjectResponse
     */
    @Override
    public CompletableFuture<EditQualityProjectResponse> editQualityProject(EditQualityProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditQualityProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditQualityProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditQualityProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EditQualityRule  EditQualityRuleRequest
     * @return EditQualityRuleResponse
     */
    @Override
    public CompletableFuture<EditQualityRuleResponse> editQualityRule(EditQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EditQualityRuleTag  EditQualityRuleTagRequest
     * @return EditQualityRuleTagResponse
     */
    @Override
    public CompletableFuture<EditQualityRuleTagResponse> editQualityRuleTag(EditQualityRuleTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditQualityRuleTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditQualityRuleTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditQualityRuleTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EncryptPhoneNum  EncryptPhoneNumRequest
     * @return EncryptPhoneNumResponse
     */
    @Override
    public CompletableFuture<EncryptPhoneNumResponse> encryptPhoneNum(EncryptPhoneNumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EncryptPhoneNum").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EncryptPhoneNumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EncryptPhoneNumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FetchCall  FetchCallRequest
     * @return FetchCallResponse
     */
    @Override
    public CompletableFuture<FetchCallResponse> fetchCall(FetchCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FetchCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FetchCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FetchCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: not throttled.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of FinishHotlineService  FinishHotlineServiceRequest
     * @return FinishHotlineServiceResponse
     */
    @Override
    public CompletableFuture<FinishHotlineServiceResponse> finishHotlineService(FinishHotlineServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FinishHotlineService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FinishHotlineServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FinishHotlineServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to generate a message channel access signature. The <strong>Data</strong> parameter in the response is the MessageBox message channel signature code. </li>
     * <li>Before calling this operation, confirm the AICCS instance ID. Refer to the instructions in the <a href="#api-detail-35">request parameters</a> section to obtain the ID.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Not throttled.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>Throttling is also triggered if the total number of calls from multiple users exceeds the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GenerateWebSocketSign  GenerateWebSocketSignRequest
     * @return GenerateWebSocketSignResponse
     */
    @Override
    public CompletableFuture<GenerateWebSocketSignResponse> generateWebSocketSign(GenerateWebSocketSignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateWebSocketSign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateWebSocketSignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateWebSocketSignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, confirm the AICCS instance information and the agent account name. For guidance on how to obtain these details, refer to the instructions in <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>Deleted agents can also be queried. Check the <strong>Status</strong> parameter in the response. If its value is 2, it indicates that the agent has been deleted.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    @Override
    public CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgent").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentBasisStatus  GetAgentBasisStatusRequest
     * @return GetAgentBasisStatusResponse
     */
    @Override
    public CompletableFuture<GetAgentBasisStatusResponse> getAgentBasisStatus(GetAgentBasisStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentBasisStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentBasisStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentBasisStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentById  GetAgentByIdRequest
     * @return GetAgentByIdResponse
     */
    @Override
    public CompletableFuture<GetAgentByIdResponse> getAgentById(GetAgentByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent or department information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentDetailReport  GetAgentDetailReportRequest
     * @return GetAgentDetailReportResponse
     */
    @Override
    public CompletableFuture<GetAgentDetailReportResponse> getAgentDetailReport(GetAgentDetailReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentDetailReport").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentDetailReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentDetailReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/activate-aiccs">activated the service</a> and <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/create-an-instance">created an instance</a>.</li>
     * <li>If you need to specify department and skill group information, refer to the instructions in the <a href="#api-detail-35">request parameters</a> section.</li>
     * </ul>
     * <h3>Rate limit</h3>
     * <ul>
     * <li>Rate limit per user: None.</li>
     * <li>API rate limit: 10 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentIndexRealTime  GetAgentIndexRealTimeRequest
     * @return GetAgentIndexRealTimeResponse
     */
    @Override
    public CompletableFuture<GetAgentIndexRealTimeResponse> getAgentIndexRealTime(GetAgentIndexRealTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentIndexRealTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentIndexRealTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentIndexRealTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 queries per second.</li>
     * <li>API-wide invocation frequency: 100 queries per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentServiceStatus  GetAgentServiceStatusRequest
     * @return GetAgentServiceStatusResponse
     */
    @Override
    public CompletableFuture<GetAgentServiceStatusResponse> getAgentServiceStatus(GetAgentServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentServiceStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/activate-aiccs">activated the service</a> and <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/create-an-instance">created an instance</a>.</li>
     * <li>If you need to specify agent and department information, refer to the instructions in the <a href="#api-detail-35">request parameters</a> section to obtain them.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: 100 calls per second.</li>
     * <li>API rate limit: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentStatistics  GetAgentStatisticsRequest
     * @return GetAgentStatisticsResponse
     */
    @Override
    public CompletableFuture<GetAgentStatisticsResponse> getAgentStatistics(GetAgentStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentStatistics").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Call frequency per user: 100 times/second.</li>
     * <li>API call frequency: 100 times/second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAiOutboundTaskBizData  GetAiOutboundTaskBizDataRequest
     * @return GetAiOutboundTaskBizDataResponse
     */
    @Override
    public CompletableFuture<GetAiOutboundTaskBizDataResponse> getAiOutboundTaskBizData(GetAiOutboundTaskBizDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAiOutboundTaskBizData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAiOutboundTaskBizDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAiOutboundTaskBizDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The outbound call task details include the task ID, task status, task type, outbound caller number, callee number deduplication policy, and other information. For more information, see <a href="#api-detail-40">Response elements</a>.</p>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call rate: 100 calls per second.</li>
     * <li>API call rate: 100 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API call rate, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAiOutboundTaskDetail  GetAiOutboundTaskDetailRequest
     * @return GetAiOutboundTaskDetailResponse
     */
    @Override
    public CompletableFuture<GetAiOutboundTaskDetailResponse> getAiOutboundTaskDetail(GetAiOutboundTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAiOutboundTaskDetail").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAiOutboundTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAiOutboundTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The task execution details include information such as the total number of tasks, task batches, outbound call numbers and their corresponding call counts, and execution statuses.</p>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: 100 calls per second.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAiOutboundTaskExecDetail  GetAiOutboundTaskExecDetailRequest
     * @return GetAiOutboundTaskExecDetailResponse
     */
    @Override
    public CompletableFuture<GetAiOutboundTaskExecDetailResponse> getAiOutboundTaskExecDetail(GetAiOutboundTaskExecDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAiOutboundTaskExecDetail").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAiOutboundTaskExecDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAiOutboundTaskExecDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The task list contains task information, including the task ID, task status, task name, and task completion rate. For more information, see <a href="#api-detail-40">Response parameters</a>.</li>
     * <li>To update task information, call the <a href="https://help.aliyun.com/document_detail/2718021.html">UpdateAiOutboundTask</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Calls per second per user: 100.</li>
     * <li>Calls per second for the API: 100.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAiOutboundTaskList  GetAiOutboundTaskListRequest
     * @return GetAiOutboundTaskListResponse
     */
    @Override
    public CompletableFuture<GetAiOutboundTaskListResponse> getAiOutboundTaskList(GetAiOutboundTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAiOutboundTaskList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAiOutboundTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAiOutboundTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, we recommend that you confirm the instance ID and job ID. For more information, see <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>The outbound call job progress includes information such as job ID, Task Type, job completion rate, agent connection rate, and customer connection rate. For details, see <a href="#api-detail-40">Response Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API-wide invocation frequency: 100 times/second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAiOutboundTaskProgress  GetAiOutboundTaskProgressRequest
     * @return GetAiOutboundTaskProgressResponse
     */
    @Override
    public CompletableFuture<GetAiOutboundTaskProgressResponse> getAiOutboundTaskProgress(GetAiOutboundTaskProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAiOutboundTaskProgress").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAiOutboundTaskProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAiOutboundTaskProgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to obtain department IDs for department group queries in certain data query APIs (such as <a href="https://help.aliyun.com/document_detail/2717938.html">GetHotlineServiceStatistics</a>).  </li>
     * <li>After creating, deleting, or updating department information, you can invoke this API to confirm whether the department information matches your expectations.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAllDepartment  GetAllDepartmentRequest
     * @return GetAllDepartmentResponse
     */
    @Override
    public CompletableFuture<GetAllDepartmentResponse> getAllDepartment(GetAllDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAllDepartment").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAllDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAllDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAudioNoteUploadUrl  GetAudioNoteUploadUrlRequest
     * @return GetAudioNoteUploadUrlResponse
     */
    @Override
    public CompletableFuture<GetAudioNoteUploadUrlResponse> getAudioNoteUploadUrl(GetAudioNoteUploadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAudioNoteUploadUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAudioNoteUploadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAudioNoteUploadUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCallDialogContent  GetCallDialogContentRequest
     * @return GetCallDialogContentResponse
     */
    @Override
    public CompletableFuture<GetCallDialogContentResponse> getCallDialogContent(GetCallDialogContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCallDialogContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCallDialogContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCallDialogContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>Before invoking this API, ensure that call recording was enabled during the invocation of the <a href="https://help.aliyun.com/document_detail/223270.html">RobotCall</a> API and that you successfully received the recording receipt, indicating that the recording file has been generated. Otherwise, an invalid URL will be returned.</p>
     * <h3>How-To</h3>
     * <p>This API serves as a supplementary method to the recording receipt. If the URL in the recording receipt message expires, you can use this API to obtain a new recording URL. By default, the validity period of the recording receipt URL is three days.</p>
     * <blockquote>
     * <p>We recommend that you directly download the recording content using the recording receipt URL and save it locally, rather than relying on the receipt URL, to avoid issues caused by expiration.</p>
     * </blockquote>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>Throttling will be triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetCallSoundRecord  GetCallSoundRecordRequest
     * @return GetCallSoundRecordResponse
     */
    @Override
    public CompletableFuture<GetCallSoundRecordResponse> getCallSoundRecord(GetCallSoundRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCallSoundRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCallSoundRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCallSoundRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConfigNumList  GetConfigNumListRequest
     * @return GetConfigNumListResponse
     */
    @Override
    public CompletableFuture<GetConfigNumListResponse> getConfigNumList(GetConfigNumListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConfigNumList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigNumListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigNumListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomerInfo  GetCustomerInfoRequest
     * @return GetCustomerInfoResponse
     */
    @Override
    public CompletableFuture<GetCustomerInfoResponse> getCustomerInfo(GetCustomerInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomerInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomerInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomerInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The skill groups queried by this operation are grouped by department ID. You can specify the department ID when you <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-createskillgroup">create a skill group</a>.</li>
     * <li>To query detailed skill group information, call the <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> operation.</li>
     * <li>Before calling this operation, verify the AICCS instance ID and agent ID. For more information, see the instructions in the <a href="#api-detail-35">Request parameters</a> section.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: 1,000 calls per second.</li>
     * <li>API frequency: 1,000 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetDepGroupTreeData  GetDepGroupTreeDataRequest
     * @return GetDepGroupTreeDataResponse
     */
    @Override
    public CompletableFuture<GetDepGroupTreeDataResponse> getDepGroupTreeData(GetDepGroupTreeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDepGroupTreeData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDepGroupTreeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDepGroupTreeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/activate-aiccs">activated the service</a> and <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/create-an-instance">created an instance</a>.</li>
     * <li>If you need to specify department information, refer to the instructions in the <a href="#api-detail-35">request parameters</a> section.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: 100 calls per second.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetDepartmentalLatitudeAgentStatus  GetDepartmentalLatitudeAgentStatusRequest
     * @return GetDepartmentalLatitudeAgentStatusResponse
     */
    @Override
    public CompletableFuture<GetDepartmentalLatitudeAgentStatusResponse> getDepartmentalLatitudeAgentStatus(GetDepartmentalLatitudeAgentStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDepartmentalLatitudeAgentStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDepartmentalLatitudeAgentStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDepartmentalLatitudeAgentStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The hotline agent details include the agent status, agent ID, heartbeat signature, and other information. For more information, see <a href="#api-detail-40">Response parameters</a>.</p>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Rate limit per user: None.</li>
     * <li>API rate limit: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetHotlineAgentDetail  GetHotlineAgentDetailRequest
     * @return GetHotlineAgentDetailResponse
     */
    @Override
    public CompletableFuture<GetHotlineAgentDetailResponse> getHotlineAgentDetail(GetHotlineAgentDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineAgentDetail").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineAgentDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineAgentDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have <a href="https://help.aliyun.com/document_detail/276009.html">activated the service</a> and <a href="https://help.aliyun.com/document_detail/276011.html">created an instance</a>.</li>
     * <li>If you need to specify department and skill group information, refer to the instructions in the <a href="#api-detail-35">Request parameters</a> section.<blockquote>
     * <p>Query logic priority:</p>
     * <ul>
     * <li>If GroupIds is not empty, the system queries the data metrics under the specified skill groups.</li>
     * <li>Otherwise, if DepIds is not empty, the system queries the data metrics under the specified departments.</li>
     * <li>Otherwise, the system queries the data metrics under the AICCS instance.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Not limited.</li>
     * <li>API frequency: 10 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetHotlineAgentDetailReport  GetHotlineAgentDetailReportRequest
     * @return GetHotlineAgentDetailReportResponse
     */
    @Override
    public CompletableFuture<GetHotlineAgentDetailReportResponse> getHotlineAgentDetailReport(GetHotlineAgentDetailReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineAgentDetailReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineAgentDetailReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineAgentDetailReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, confirm the AICCS instance information and the agent account name. For guidance on how to obtain these details, see the description in <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>To retrieve detailed information about a hotline agent, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-gethotlineagentdetail">GetHotlineAgentDetail</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API-wide frequency: 200 queries per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetHotlineAgentStatus  GetHotlineAgentStatusRequest
     * @return GetHotlineAgentStatusResponse
     */
    @Override
    public CompletableFuture<GetHotlineAgentStatusResponse> getHotlineAgentStatus(GetHotlineAgentStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineAgentStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineAgentStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineAgentStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: 50 calls per second.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>Throttling is also triggered if the total call volume from multiple users exceeds the API rate limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetHotlineCallAction  GetHotlineCallActionRequest
     * @return GetHotlineCallActionResponse
     */
    @Override
    public CompletableFuture<GetHotlineCallActionResponse> getHotlineCallAction(GetHotlineCallActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineCallAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineCallActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineCallActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/document_detail/276009.html">activated the service</a> and <a href="https://help.aliyun.com/document_detail/276011.html">created an instance</a>.  </li>
     * <li>If you need to specify agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.  </li>
     * <li>API frequency: 10 queries per second.<blockquote>
     * <p>Throttle will be triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetHotlineGroupDetailReport  GetHotlineGroupDetailReportRequest
     * @return GetHotlineGroupDetailReportResponse
     */
    @Override
    public CompletableFuture<GetHotlineGroupDetailReportResponse> getHotlineGroupDetailReport(GetHotlineGroupDetailReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineGroupDetailReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineGroupDetailReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineGroupDetailReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotlineMessageLog  GetHotlineMessageLogRequest
     * @return GetHotlineMessageLogResponse
     */
    @Override
    public CompletableFuture<GetHotlineMessageLogResponse> getHotlineMessageLog(GetHotlineMessageLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineMessageLog").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineMessageLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineMessageLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotlineRuntimeInfo  GetHotlineRuntimeInfoRequest
     * @return GetHotlineRuntimeInfoResponse
     */
    @Override
    public CompletableFuture<GetHotlineRuntimeInfoResponse> getHotlineRuntimeInfo(GetHotlineRuntimeInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineRuntimeInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineRuntimeInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineRuntimeInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetHotlineServiceStatistics  GetHotlineServiceStatisticsRequest
     * @return GetHotlineServiceStatisticsResponse
     */
    @Override
    public CompletableFuture<GetHotlineServiceStatisticsResponse> getHotlineServiceStatistics(GetHotlineServiceStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineServiceStatistics").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineServiceStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineServiceStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotlineWaitingNumber  GetHotlineWaitingNumberRequest
     * @return GetHotlineWaitingNumberResponse
     */
    @Override
    public CompletableFuture<GetHotlineWaitingNumberResponse> getHotlineWaitingNumber(GetHotlineWaitingNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHotlineWaitingNumber").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotlineWaitingNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotlineWaitingNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Current data statistics metrics include cumulative metrics for the current day and real-time metrics.</li>
     * <li>To specify department or skill group information, follow the instructions in the <a href="#api-detail-35">request parameters</a> descriptions to obtain the required values.<blockquote>
     * <p>Query logic priority:</p>
     * <ul>
     * <li>If GroupIds is not empty, the data metrics for the corresponding skill group list are queried.</li>
     * <li>Otherwise, if DepIds is not empty, the data metrics for the corresponding department list are queried.</li>
     * <li>Otherwise, the data metrics for the AICCS instance are queried.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: No throttling.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetIndexCurrentValue  GetIndexCurrentValueRequest
     * @return GetIndexCurrentValueResponse
     */
    @Override
    public CompletableFuture<GetIndexCurrentValueResponse> getIndexCurrentValue(GetIndexCurrentValueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIndexCurrentValue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIndexCurrentValueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIndexCurrentValueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceList  GetInstanceListRequest
     * @return GetInstanceListResponse
     */
    @Override
    public CompletableFuture<GetInstanceListResponse> getInstanceList(GetInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMcuLvsIp  GetMcuLvsIpRequest
     * @return GetMcuLvsIpResponse
     */
    @Override
    public CompletableFuture<GetMcuLvsIpResponse> getMcuLvsIp(GetMcuLvsIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMcuLvsIp").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMcuLvsIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMcuLvsIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Not throttled.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetNumLocation  GetNumLocationRequest
     * @return GetNumLocationResponse
     */
    @Override
    public CompletableFuture<GetNumLocationResponse> getNumLocation(GetNumLocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNumLocation").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNumLocationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNumLocationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetOnlineSeatInformation  GetOnlineSeatInformationRequest
     * @return GetOnlineSeatInformationResponse
     */
    @Override
    public CompletableFuture<GetOnlineSeatInformationResponse> getOnlineSeatInformation(GetOnlineSeatInformationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOnlineSeatInformation").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOnlineSeatInformationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOnlineSeatInformationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetOnlineServiceVolume  GetOnlineServiceVolumeRequest
     * @return GetOnlineServiceVolumeResponse
     */
    @Override
    public CompletableFuture<GetOnlineServiceVolumeResponse> getOnlineServiceVolume(GetOnlineServiceVolumeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOnlineServiceVolume").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOnlineServiceVolumeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOnlineServiceVolumeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOutbounNumList  GetOutbounNumListRequest
     * @return GetOutbounNumListResponse
     */
    @Override
    public CompletableFuture<GetOutbounNumListResponse> getOutbounNumList(GetOutbounNumListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOutbounNumList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOutbounNumListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOutbounNumListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityProjectDetail  GetQualityProjectDetailRequest
     * @return GetQualityProjectDetailResponse
     */
    @Override
    public CompletableFuture<GetQualityProjectDetailResponse> getQualityProjectDetail(GetQualityProjectDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityProjectDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityProjectDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityProjectDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityProjectList  GetQualityProjectListRequest
     * @return GetQualityProjectListResponse
     */
    @Override
    public CompletableFuture<GetQualityProjectListResponse> getQualityProjectList(GetQualityProjectListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityProjectList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityProjectListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityProjectListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityProjectLog  GetQualityProjectLogRequest
     * @return GetQualityProjectLogResponse
     */
    @Override
    public CompletableFuture<GetQualityProjectLogResponse> getQualityProjectLog(GetQualityProjectLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityProjectLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityProjectLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityProjectLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityResult  GetQualityResultRequest
     * @return GetQualityResultResponse
     */
    @Override
    public CompletableFuture<GetQualityResultResponse> getQualityResult(GetQualityResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityRuleDetail  GetQualityRuleDetailRequest
     * @return GetQualityRuleDetailResponse
     */
    @Override
    public CompletableFuture<GetQualityRuleDetailResponse> getQualityRuleDetail(GetQualityRuleDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityRuleDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityRuleDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityRuleDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityRuleList  GetQualityRuleListRequest
     * @return GetQualityRuleListResponse
     */
    @Override
    public CompletableFuture<GetQualityRuleListResponse> getQualityRuleList(GetQualityRuleListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityRuleList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityRuleListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityRuleListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityRuleTagList  GetQualityRuleTagListRequest
     * @return GetQualityRuleTagListResponse
     */
    @Override
    public CompletableFuture<GetQualityRuleTagListResponse> getQualityRuleTagList(GetQualityRuleTagListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityRuleTagList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityRuleTagListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityRuleTagListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueueInformation  GetQueueInformationRequest
     * @return GetQueueInformationResponse
     */
    @Override
    public CompletableFuture<GetQueueInformationResponse> getQueueInformation(GetQueueInformationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueueInformation").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueueInformationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueueInformationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRecordData  GetRecordDataRequest
     * @return GetRecordDataResponse
     */
    @Override
    public CompletableFuture<GetRecordDataResponse> getRecordData(GetRecordDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRecordData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRecordDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRecordDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRecordUrl  GetRecordUrlRequest
     * @return GetRecordUrlResponse
     */
    @Override
    public CompletableFuture<GetRecordUrlResponse> getRecordUrl(GetRecordUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRecordUrl").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRecordUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRecordUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRtcToken  GetRtcTokenRequest
     * @return GetRtcTokenResponse
     */
    @Override
    public CompletableFuture<GetRtcTokenResponse> getRtcToken(GetRtcTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRtcToken").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRtcTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRtcTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSeatInformation  GetSeatInformationRequest
     * @return GetSeatInformationResponse
     */
    @Override
    public CompletableFuture<GetSeatInformationResponse> getSeatInformation(GetSeatInformationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSeatInformation").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSeatInformationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSeatInformationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSkillGroupAgentStatusDetails  GetSkillGroupAgentStatusDetailsRequest
     * @return GetSkillGroupAgentStatusDetailsResponse
     */
    @Override
    public CompletableFuture<GetSkillGroupAgentStatusDetailsResponse> getSkillGroupAgentStatusDetails(GetSkillGroupAgentStatusDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkillGroupAgentStatusDetails").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillGroupAgentStatusDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillGroupAgentStatusDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/activate-aiccs">activated the service</a> and <a href="https://www.alibabacloud.com/help/en/aiccs/user-guide/create-an-instance">created an instance</a>.</li>
     * <li>If you need to specify department and skill group information, refer to the instructions in the <a href="#api-detail-35">request parameters</a> section.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: 100 calls per second.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSkillGroupAndAgentStatusSummary  GetSkillGroupAndAgentStatusSummaryRequest
     * @return GetSkillGroupAndAgentStatusSummaryResponse
     */
    @Override
    public CompletableFuture<GetSkillGroupAndAgentStatusSummaryResponse> getSkillGroupAndAgentStatusSummary(GetSkillGroupAndAgentStatusSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkillGroupAndAgentStatusSummary").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillGroupAndAgentStatusSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillGroupAndAgentStatusSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSkillGroupLatitudeState  GetSkillGroupLatitudeStateRequest
     * @return GetSkillGroupLatitudeStateResponse
     */
    @Override
    public CompletableFuture<GetSkillGroupLatitudeStateResponse> getSkillGroupLatitudeState(GetSkillGroupLatitudeStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkillGroupLatitudeState").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillGroupLatitudeStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillGroupLatitudeStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSkillGroupServiceCapability  GetSkillGroupServiceCapabilityRequest
     * @return GetSkillGroupServiceCapabilityResponse
     */
    @Override
    public CompletableFuture<GetSkillGroupServiceCapabilityResponse> getSkillGroupServiceCapability(GetSkillGroupServiceCapabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkillGroupServiceCapability").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillGroupServiceCapabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillGroupServiceCapabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSkillGroupServiceStatus  GetSkillGroupServiceStatusRequest
     * @return GetSkillGroupServiceStatusResponse
     */
    @Override
    public CompletableFuture<GetSkillGroupServiceStatusResponse> getSkillGroupServiceStatus(GetSkillGroupServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkillGroupServiceStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillGroupServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillGroupServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling will be triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSkillGroupStatusTotal  GetSkillGroupStatusTotalRequest
     * @return GetSkillGroupStatusTotalResponse
     */
    @Override
    public CompletableFuture<GetSkillGroupStatusTotalResponse> getSkillGroupStatusTotal(GetSkillGroupStatusTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkillGroupStatusTotal").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillGroupStatusTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillGroupStatusTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HangUpDoubleCall  HangUpDoubleCallRequest
     * @return HangUpDoubleCallResponse
     */
    @Override
    public CompletableFuture<HangUpDoubleCallResponse> hangUpDoubleCall(HangUpDoubleCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HangUpDoubleCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HangUpDoubleCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HangUpDoubleCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HangupCall  HangupCallRequest
     * @return HangupCallResponse
     */
    @Override
    public CompletableFuture<HangupCallResponse> hangupCall(HangupCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HangupCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HangupCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HangupCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you hang up a call in Communication Intelligence Engine, ensure that a call has been initiated by a large model.</li>
     * <li>If a call has not been initiated, use the <a href="https://help.aliyun.com/document_detail/2862828.html">LlmSmartCall</a> or <a href="https://help.aliyun.com/document_detail/2881065.html">LlmSmartCallEncrypt</a> operation to do so.</li>
     * </ul>
     * 
     * @param request the request parameters of HangupOperate  HangupOperateRequest
     * @return HangupOperateResponse
     */
    @Override
    public CompletableFuture<HangupOperateResponse> hangupOperate(HangupOperateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HangupOperate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HangupOperateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HangupOperateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HangupThirdCall  HangupThirdCallRequest
     * @return HangupThirdCallResponse
     */
    @Override
    public CompletableFuture<HangupThirdCallResponse> hangupThirdCall(HangupThirdCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HangupThirdCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HangupThirdCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HangupThirdCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HoldCall  HoldCallRequest
     * @return HoldCallResponse
     */
    @Override
    public CompletableFuture<HoldCallResponse> holdCall(HoldCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HoldCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HoldCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HoldCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call details include the total number of records, call results, agent names, call time, and other information.</p>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Single-user call frequency: not throttled.</li>
     * <li>API frequency: 80 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of HotlineSessionQuery  HotlineSessionQueryRequest
     * @return HotlineSessionQueryResponse
     */
    @Override
    public CompletableFuture<HotlineSessionQueryResponse> hotlineSessionQuery(HotlineSessionQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HotlineSessionQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotlineSessionQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotlineSessionQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportOneTaskPhoneNumber  ImportOneTaskPhoneNumberRequest
     * @return ImportOneTaskPhoneNumberResponse
     */
    @Override
    public CompletableFuture<ImportOneTaskPhoneNumberResponse> importOneTaskPhoneNumber(ImportOneTaskPhoneNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportOneTaskPhoneNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportOneTaskPhoneNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportOneTaskPhoneNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to import callee data. You can also import callee data by clicking <strong>Import Callee Data</strong> on the <strong>Call Task Management</strong> page, downloading the template, and uploading a file.</li>
     * <li>This operation currently supports only the JSON data type for importing callee data.</li>
     * <li>Before calling this operation, make sure that a call task has been created.</li>
     * <li>If you do not have a created call task, you can create one on the <strong>Call Task Management</strong> page or by calling the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportTaskNumberDatas  ImportTaskNumberDatasRequest
     * @return ImportTaskNumberDatasResponse
     */
    @Override
    public CompletableFuture<ImportTaskNumberDatasResponse> importTaskNumberDatas(ImportTaskNumberDatasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportTaskNumberDatas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportTaskNumberDatasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportTaskNumberDatasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you import outbound called numbers, the outbound call task can make calls normally.</li>
     * <li>Before you call this operation, verify the instance ID and task ID. For more information, see <a href="#api-detail-35">Request parameters</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Calls per second (CPS) per user: 20.</li>
     * <li>CPS per API: 50.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API CPS limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of InsertAiOutboundPhoneNums  InsertAiOutboundPhoneNumsRequest
     * @return InsertAiOutboundPhoneNumsResponse
     */
    @Override
    public CompletableFuture<InsertAiOutboundPhoneNumsResponse> insertAiOutboundPhoneNums(InsertAiOutboundPhoneNumsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InsertAiOutboundPhoneNums").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertAiOutboundPhoneNumsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertAiOutboundPhoneNumsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertTaskDetail  InsertTaskDetailRequest
     * @return InsertTaskDetailResponse
     */
    @Override
    public CompletableFuture<InsertTaskDetailResponse> insertTaskDetail(InsertTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InsertTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of JoinThirdCall  JoinThirdCallRequest
     * @return JoinThirdCallResponse
     */
    @Override
    public CompletableFuture<JoinThirdCallResponse> joinThirdCall(JoinThirdCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinThirdCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JoinThirdCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JoinThirdCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, confirm the AICCS instance information and skill group information. For guidance on how to obtain these details, refer to the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>If an agent is not assigned to any skill group, you can invoke <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-getagent">GetAgent</a> to query the agent information.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListAgentBySkillGroupId  ListAgentBySkillGroupIdRequest
     * @return ListAgentBySkillGroupIdResponse
     */
    @Override
    public CompletableFuture<ListAgentBySkillGroupIdResponse> listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentBySkillGroupId").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentBySkillGroupIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentBySkillGroupIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure you have scripts that have passed review.</li>
     * <li>If you do not have any approved scripts, first add scripts and submit them for review on the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> page.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: not throttled.</li>
     * <li>API frequency: 500 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListAiccsRobot  ListAiccsRobotRequest
     * @return ListAiccsRobotResponse
     */
    @Override
    public CompletableFuture<ListAiccsRobotResponse> listAiccsRobot(ListAiccsRobotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAiccsRobot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAiccsRobotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAiccsRobotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you do not have any created and online voices on the <a href="https://aiccs.console.aliyun.com/engine/voiceprint">Personalized Voices</a> page, only system preset voices are returned.</p>
     * 
     * @param request the request parameters of ListAvailableTts  ListAvailableTtsRequest
     * @return ListAvailableTtsResponse
     */
    @Override
    public CompletableFuture<ListAvailableTtsResponse> listAvailableTts(ListAvailableTtsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAvailableTts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableTtsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableTtsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries online session information for sessions completed within a specified time period, including the session content. The query rules are as follows:</p>
     * <ul>
     * <li>The maximum time span for a query is one day.</li>
     * <li>If only the end time is specified, the start time is set to one hour before the end time.</li>
     * <li>If only the start time is specified, the end time is set to one hour after the start time.</li>
     * <li>If neither is specified, the end time is set to the current time, and the start time is set to one hour before the end time.</li>
     * <li>If both are specified but the time span exceeds one day, an error message is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChatRecordDetail  ListChatRecordDetailRequest
     * @return ListChatRecordDetailResponse
     */
    @Override
    public CompletableFuture<ListChatRecordDetailResponse> listChatRecordDetail(ListChatRecordDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListChatRecordDetail").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChatRecordDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChatRecordDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the conversation records of the intelligent contact robot. You can also view the records on the <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a> &gt; <strong>Details</strong> &gt; <strong>View Conversation Records</strong> page.</li>
     * <li>Before calling this operation, make sure that the intelligent contact robot call task you created has successfully connected calls.</li>
     * <li>If you do not have an existing intelligent contact robot call task, you can create and start a task on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page, or by calling the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> and <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> operations.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: not limited.</li>
     * <li>API frequency: 500 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListDialog  ListDialogRequest
     * @return ListDialogResponse
     */
    @Override
    public CompletableFuture<ListDialogResponse> listDialog(ListDialogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDialog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDialogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDialogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotlineRecord  ListHotlineRecordRequest
     * @return ListHotlineRecordResponse
     */
    @Override
    public CompletableFuture<ListHotlineRecordResponse> listHotlineRecord(ListHotlineRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHotlineRecord").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotlineRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotlineRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries hotline details within a specified time range, including hotline call information. The query rules are as follows:</p>
     * <ul>
     * <li>The maximum time span for a query is 1 day.</li>
     * <li>If only the end time is specified, the start time is set to 1 hour before the end time.</li>
     * <li>If only the start time is specified, the end time is set to 1 hour after the start time.</li>
     * <li>If neither is specified, the end time is set to the current time, and the start time is set to 1 hour before the end time.</li>
     * <li>If both are specified but the time span exceeds 1 day, an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListHotlineRecordDetail  ListHotlineRecordDetailRequest
     * @return ListHotlineRecordDetailResponse
     */
    @Override
    public CompletableFuture<ListHotlineRecordDetailResponse> listHotlineRecordDetail(ListHotlineRecordDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHotlineRecordDetail").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotlineRecordDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotlineRecordDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user API call frequency: No rate limiting.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListOutboundPhoneNumber  ListOutboundPhoneNumberRequest
     * @return ListOutboundPhoneNumberResponse
     */
    @Override
    public CompletableFuture<ListOutboundPhoneNumberResponse> listOutboundPhoneNumber(ListOutboundPhoneNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOutboundPhoneNumber").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOutboundPhoneNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOutboundPhoneNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have initiated an outbound call task by using the intelligent contact robot.</li>
     * <li>If you have not initiated an outbound call task by using the intelligent contact robot, you can call the <a href="https://help.aliyun.com/document_detail/2717996.html">RobotCall</a> operation to initiate an outbound call task.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Not throttled.</li>
     * <li>API frequency: 500 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListRobotCallDialog  ListRobotCallDialogRequest
     * @return ListRobotCallDialogResponse
     */
    @Override
    public CompletableFuture<ListRobotCallDialogResponse> listRobotCallDialog(ListRobotCallDialogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRobotCallDialog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRobotCallDialogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRobotCallDialogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Robot node information includes flow name, model name, node name, whether it is an output, and output ID.  </li>
     * <li>Before invoking this API, you can confirm the robot ID (that is, the script ID) by following the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListRobotNode  ListRobotNodeRequest
     * @return ListRobotNodeResponse
     */
    @Override
    public CompletableFuture<ListRobotNodeResponse> listRobotNode(ListRobotNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRobotNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRobotNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRobotNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have added input parameters for the chatbot.</li>
     * <li>If you have not added input parameters for your chatbot, click Add Input Parameter on the <strong>Dialog Flow Management</strong> &gt; <strong>Configuration</strong> &gt; <strong>Input and Output Parameters</strong> page.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: No throttling.</li>
     * <li>API frequency: 500 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.
     * <a href="https://aiccs.console.aliyun.com/patter/list"><strong>Script management</strong></a></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListRobotParams  ListRobotParamsRequest
     * @return ListRobotParamsResponse
     */
    @Override
    public CompletableFuture<ListRobotParamsResponse> listRobotParams(ListRobotParamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRobotParams").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRobotParamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRobotParamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    @Override
    public CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRoles").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListSkillGroup  ListSkillGroupRequest
     * @return ListSkillGroupResponse
     */
    @Override
    public CompletableFuture<ListSkillGroupResponse> listSkillGroup(ListSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkillGroup").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can use this API to obtain the list of Intelligent Contact Robot call jobs, or retrieve the job list from the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</li>
     * <li>If you have not created any Intelligent Contact Robot call jobs, you can click <strong>Create Job</strong> in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or create a job by invoking the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> API.</li>
     * <li>The optional parameters of this API serve as Filter Conditions for the Intelligent Contact Robot call job list. If these parameters are not specified, the API queries all jobs.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 500 calls per second.<blockquote>
     * <p>If the combined invocations from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListTask  ListTaskRequest
     * @return ListTaskResponse
     */
    @Override
    public CompletableFuture<ListTaskResponse> listTask(ListTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to retrieve the details of a call task for an intelligent contact robot. You can also view the details on the <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a> &gt; <strong>Details</strong> page.</li>
     * <li>Before calling this operation, make sure that your intelligent contact robot has been created and the task has been started.</li>
     * <li>If you do not have a created call task, create and start a task on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page, or by calling the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> and <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> operations.</li>
     * <li>The optional parameters in this operation are filter conditions for the call task details. If you do not specify them, all task details are returned.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: not throttled.</li>
     * <li>API frequency: 500 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListTaskDetail  ListTaskDetailRequest
     * @return ListTaskDetailResponse
     */
    @Override
    public CompletableFuture<ListTaskDetailResponse> listTaskDetail(ListTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation can only be successfully called during an intelligent outbound call. When calling this operation, note that the <strong>CallId</strong> request parameter must be set to the unique receipt ID of the ongoing call.</li>
     * <li>The <strong>CallId</strong> is the <strong>CallId</strong> response parameter returned when you call the <a href="https://help.aliyun.com/document_detail/2718012.html">LlmSmartCallFullDuplex</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of LlmFullDuplexCallOperate  LlmFullDuplexCallOperateRequest
     * @return LlmFullDuplexCallOperateResponse
     */
    @Override
    public CompletableFuture<LlmFullDuplexCallOperateResponse> llmFullDuplexCallOperate(LlmFullDuplexCallOperateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LlmFullDuplexCallOperate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LlmFullDuplexCallOperateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LlmFullDuplexCallOperateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can add only one called number per API call. To add multiple called numbers, call the API multiple times.</li>
     * <li>Before initiating an intelligent call based on a large language model, make sure that you have created a large language model application on the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Large Language Model Application Management</a> page and have successfully applied for a real number on the <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Real Number Management</a> page of Voice Service.</li>
     * </ul>
     * 
     * @param request the request parameters of LlmSmartCall  LlmSmartCallRequest
     * @return LlmSmartCallResponse
     */
    @Override
    public CompletableFuture<LlmSmartCallResponse> llmSmartCall(LlmSmartCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LlmSmartCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LlmSmartCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LlmSmartCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LlmSmartCallEncrypt  LlmSmartCallEncryptRequest
     * @return LlmSmartCallEncryptResponse
     */
    @Override
    public CompletableFuture<LlmSmartCallEncryptResponse> llmSmartCallEncrypt(LlmSmartCallEncryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LlmSmartCallEncrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LlmSmartCallEncryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LlmSmartCallEncryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before calling this operation, ensure that the ASR callback URL is configured.</li>
     * <li>This operation is only available to specific users in the UID whitelist.</li>
     * <li>The request frequency limit for a single user is 100 QPS.</li>
     * <li><code>CalledNumber</code> and <code>CallerNumber</code> are required parameters, which represent the called number and the caller display number, respectively.</li>
     * <li>Optional parameters such as <code>StartWordParam</code>, <code>TtsVoiceCode</code>, <code>TtsSpeed</code>, and <code>TtsVolume</code> allow you to customize the call experience. If these parameters are not provided, the default settings of the application are used.</li>
     * <li>The <code>SessionTimeout</code> parameter is used to set the maximum call duration in seconds. The call is automatically ended when this duration is exceeded. For the default value and valid range, refer to the specific documentation.</li>
     * <li>The <code>OutId</code> field can be used to track a unique identifier in an external system. The length is limited to 1 to 32 bytes.</li>
     * </ul>
     * 
     * @param request the request parameters of LlmSmartCallFullDuplex  LlmSmartCallFullDuplexRequest
     * @return LlmSmartCallFullDuplexResponse
     */
    @Override
    public CompletableFuture<LlmSmartCallFullDuplexResponse> llmSmartCallFullDuplex(LlmSmartCallFullDuplexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LlmSmartCallFullDuplex").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LlmSmartCallFullDuplexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LlmSmartCallFullDuplexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MakeCall  MakeCallRequest
     * @return MakeCallResponse
     */
    @Override
    public CompletableFuture<MakeCallResponse> makeCall(MakeCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MakeCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MakeCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MakeCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MakeDoubleCall  MakeDoubleCallRequest
     * @return MakeDoubleCallResponse
     */
    @Override
    public CompletableFuture<MakeDoubleCallResponse> makeDoubleCall(MakeDoubleCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MakeDoubleCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MakeDoubleCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MakeDoubleCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PageQueryAgentList  PageQueryAgentListRequest
     * @return PageQueryAgentListResponse
     */
    @Override
    public CompletableFuture<PageQueryAgentListResponse> pageQueryAgentList(PageQueryAgentListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PageQueryAgentList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PageQueryAgentListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PageQueryAgentListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PageQueryAgentListNew  PageQueryAgentListNewRequest
     * @return PageQueryAgentListNewResponse
     */
    @Override
    public CompletableFuture<PageQueryAgentListNewResponse> pageQueryAgentListNew(PageQueryAgentListNewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PageQueryAgentListNew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PageQueryAgentListNewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PageQueryAgentListNewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before querying call task details, make sure that you have created a call task.</li>
     * <li>If you have not created a call task, you can create one on the <strong>Call Task Management</strong> page or by calling the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryAiCallDetailPage  QueryAiCallDetailPageRequest
     * @return QueryAiCallDetailPageResponse
     */
    @Override
    public CompletableFuture<QueryAiCallDetailPageResponse> queryAiCallDetailPage(QueryAiCallDetailPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAiCallDetailPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAiCallDetailPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAiCallDetailPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAiCallTaskDetail  QueryAiCallTaskDetailRequest
     * @return QueryAiCallTaskDetailResponse
     */
    @Override
    public CompletableFuture<QueryAiCallTaskDetailResponse> queryAiCallTaskDetail(QueryAiCallTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAiCallTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAiCallTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAiCallTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAiCallTaskPage  QueryAiCallTaskPageRequest
     * @return QueryAiCallTaskPageResponse
     */
    @Override
    public CompletableFuture<QueryAiCallTaskPageResponse> queryAiCallTaskPage(QueryAiCallTaskPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAiCallTaskPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAiCallTaskPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAiCallTaskPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAiVoiceAgentDetail  QueryAiVoiceAgentDetailRequest
     * @return QueryAiVoiceAgentDetailResponse
     */
    @Override
    public CompletableFuture<QueryAiVoiceAgentDetailResponse> queryAiVoiceAgentDetail(QueryAiVoiceAgentDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAiVoiceAgentDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAiVoiceAgentDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAiVoiceAgentDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the details of a communication agent.</li>
     * <li>If both BranchId and VersionId are empty, the configuration of the latest published version of the current active branch is returned. If the active branch has only a draft version, no configuration is returned.</li>
     * <li>If only BranchId is specified, the configuration of the latest published version of the specified branch is returned. If the branch has only a draft version, no configuration is returned.</li>
     * <li>If both BranchId and VersionId are specified, the configuration of the specified version is returned.</li>
     * <li>If BranchDeployStatus = 1 (the branch is deployed and online) and VersionPublishStatus = 1 (the version is published), the branch configuration is used by currently imported outbound call tasks.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryAiVoiceAgentDetailNew  QueryAiVoiceAgentDetailNewRequest
     * @return QueryAiVoiceAgentDetailNewResponse
     */
    @Override
    public CompletableFuture<QueryAiVoiceAgentDetailNewResponse> queryAiVoiceAgentDetailNew(QueryAiVoiceAgentDetailNewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAiVoiceAgentDetailNew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAiVoiceAgentDetailNewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAiVoiceAgentDetailNewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query call details. You can also view call details on the <strong>Call task management</strong> &gt; <strong>Details</strong> &gt; <strong>Execution records</strong> &gt; <strong>Completed</strong> &gt; <strong>Call details</strong> page.</li>
     * <li>Before you call this operation, make sure that you have created a call task and imported the called numbers.</li>
     * <li>If you do not have a call task, you can create a call task and import called numbers on the <strong>Call task management</strong> page, or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> and <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operations to create a call task and import called numbers.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryConversationDetailInfo  QueryConversationDetailInfoRequest
     * @return QueryConversationDetailInfoResponse
     */
    @Override
    public CompletableFuture<QueryConversationDetailInfoResponse> queryConversationDetailInfo(QueryConversationDetailInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryConversationDetailInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryConversationDetailInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryConversationDetailInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query call details. You can also view call details on the <strong>Call Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>Execution Records</strong> &gt; <strong>Completed</strong> &gt; <strong>Call Details</strong> page.</li>
     * <li>Before calling this operation, make sure that you have created a call task and imported the called numbers.</li>
     * <li>If you do not have a call task, you can create a call task and import called numbers on the <strong>Call Task Management</strong> page, or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> and <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operations to create a call task and import called numbers.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryConversationDetailInfoNew  QueryConversationDetailInfoNewRequest
     * @return QueryConversationDetailInfoNewResponse
     */
    @Override
    public CompletableFuture<QueryConversationDetailInfoNewResponse> queryConversationDetailInfoNew(QueryConversationDetailInfoNewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryConversationDetailInfoNew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryConversationDetailInfoNewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryConversationDetailInfoNewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryHotlineInQueue  QueryHotlineInQueueRequest
     * @return QueryHotlineInQueueResponse
     */
    @Override
    public CompletableFuture<QueryHotlineInQueueResponse> queryHotlineInQueue(QueryHotlineInQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryHotlineInQueue").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryHotlineInQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryHotlineInQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The hotline number configuration includes information such as the hotline number, number location, carrier, and whether it is used for incoming calls. For details, see <a href="#api-detail-40">Return Parameters</a>.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.</li>
     * <li>API invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryHotlineNumber  QueryHotlineNumberRequest
     * @return QueryHotlineNumberResponse
     */
    @Override
    public CompletableFuture<QueryHotlineNumberResponse> queryHotlineNumber(QueryHotlineNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryHotlineNumber").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryHotlineNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryHotlineNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryInboundCallId  QueryInboundCallIdRequest
     * @return QueryInboundCallIdResponse
     */
    @Override
    public CompletableFuture<QueryInboundCallIdResponse> queryInboundCallId(QueryInboundCallIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryInboundCallId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryInboundCallIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryInboundCallIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryOutboundTask  QueryOutboundTaskRequest
     * @return QueryOutboundTaskResponse
     */
    @Override
    public CompletableFuture<QueryOutboundTaskResponse> queryOutboundTask(QueryOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries information about skill groups, such as the display name, description, channel type, and ID. For more information, see <a href="#api-detail-40">Response elements</a>.</p>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Single-user call frequency: not throttled.</li>
     * <li>API frequency: 1,000 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QuerySkillGroups  QuerySkillGroupsRequest
     * @return QuerySkillGroupsResponse
     */
    @Override
    public CompletableFuture<QuerySkillGroupsResponse> querySkillGroups(QuerySkillGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySkillGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySkillGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySkillGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTaskDetail  QueryTaskDetailRequest
     * @return QueryTaskDetailResponse
     */
    @Override
    public CompletableFuture<QueryTaskDetailResponse> queryTaskDetail(QueryTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTickets  QueryTicketsRequest
     * @return QueryTicketsResponse
     */
    @Override
    public CompletableFuture<QueryTicketsResponse> queryTickets(QueryTicketsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTickets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTicketsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTicketsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries contact data, including contact status, session acceptor, agent name, contact channel, satisfaction score, and evaluation status. For more information, see <a href="#api-detail-40">Response elements</a>.</p>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: not throttled.</li>
     * <li>API frequency: 50 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryTouchList  QueryTouchListRequest
     * @return QueryTouchListResponse
     */
    @Override
    public CompletableFuture<QueryTouchListResponse> queryTouchList(QueryTouchListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTouchList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTouchListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTouchListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To obtain the agent and skill group information, refer to the instructions in the <a href="#api-detail-35">Request parameters</a> section.</li>
     * <li>You can call the <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-listagentbyskillgroupid">ListAgentBySkillGroupId</a> operation to query the agents in the skill group and verify whether the removal meets your expectations.</li>
     * <li>If an agent is removed by mistake, you can call the <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-updateagent">UpdateAgent</a> operation to update the agent data and reassign the skill group to the agent.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Rate limit per user: 50 calls per second.</li>
     * <li>Rate limit per API: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RemoveAgentFromSkillGroup  RemoveAgentFromSkillGroupRequest
     * @return RemoveAgentFromSkillGroupResponse
     */
    @Override
    public CompletableFuture<RemoveAgentFromSkillGroupResponse> removeAgentFromSkillGroup(RemoveAgentFromSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveAgentFromSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveAgentFromSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveAgentFromSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deletion is a sensitive operation. Proceed with caution.</li>
     * <li>Before deleting a skill group, confirm the AICCS instance ID and the ID of the skill group to be deleted. For more information about how to obtain these IDs, see the instructions in the <a href="#api-detail-35">request parameters</a> section.</li>
     * <li>After deletion, you can call the <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> operation to query skill groups and verify the deletion.</li>
     * <li>If a skill group is deleted by mistake, you can call the <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-createskillgroup">CreateSkillGroup</a> operation to recreate the skill group.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Rate limit per user: no limit.</li>
     * <li>API rate limit: 1,000 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RemoveSkillGroup  RemoveSkillGroupRequest
     * @return RemoveSkillGroupResponse
     */
    @Override
    public CompletableFuture<RemoveSkillGroupResponse> removeSkillGroup(RemoveSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetHotlineNumber  ResetHotlineNumberRequest
     * @return ResetHotlineNumberResponse
     */
    @Override
    public CompletableFuture<ResetHotlineNumberResponse> resetHotlineNumber(ResetHotlineNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetHotlineNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetHotlineNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetHotlineNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartOutboundTask  RestartOutboundTaskRequest
     * @return RestartOutboundTaskResponse
     */
    @Override
    public CompletableFuture<RestartOutboundTaskResponse> restartOutboundTask(RestartOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before initiating an outbound call from an intelligent contact robot, make sure that you have an approved script on the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> page and an approved real number on the <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Real Number Management</a> page of the voice messaging service.</li>
     * <li>You can obtain the creation time of the call from the <strong>date</strong> parameter in the <strong>Response Header</strong> after calling this operation.<blockquote>
     * <p>For example, if the <strong>date</strong> parameter is &quot;date&quot;: &quot;Mon, 24 Jun 2024 03:40:31 GMT&quot;, the creation time of the call is &quot;2024-06-24 03:40:31&quot;.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: not throttled.</li>
     * <li>API frequency: 1,000 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RobotCall  RobotCallRequest
     * @return RobotCallResponse
     */
    @Override
    public CompletableFuture<RobotCallResponse> robotCall(RobotCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RobotCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RobotCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RobotCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The following characters cannot appear in the SendCcoSmartCall callback for intelligent interactive voice response: <code>@ = : &quot;&quot; $ { } ^ * ￥</code>.</li>
     * <li>After you invoke this operation, the <strong>Data</strong> response parameter returns the unique receipt ID for this call, which can be used to invoke the <a href="https://help.aliyun.com/document_detail/2718013.html">SendCcoSmartCallOperate</a> operation.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Invoke frequency per user: Not limited.</li>
     * <li>API frequency: 100 invocations per second.<blockquote>
     * <p>If the total number of invocations from multiple users exceeds the API frequency limit, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SendCcoSmartCall  SendCcoSmartCallRequest
     * @return SendCcoSmartCallResponse
     */
    @Override
    public CompletableFuture<SendCcoSmartCallResponse> sendCcoSmartCall(SendCcoSmartCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendCcoSmartCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendCcoSmartCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendCcoSmartCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation can be called successfully only during an intelligent outbound call. When you call this operation, note that you must set the <strong>CallId</strong> request parameter to the unique receipt ID of the ongoing call.</li>
     * <li>You can obtain the <strong>CallId</strong> from the <strong>Data</strong> response parameter returned when you call the <a href="https://api.aliyun.com/document/aiccs/2019-10-15/SendCcoSmartCall">SendCcoSmartCall</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SendCcoSmartCallOperate  SendCcoSmartCallOperateRequest
     * @return SendCcoSmartCallOperateResponse
     */
    @Override
    public CompletableFuture<SendCcoSmartCallOperateResponse> sendCcoSmartCallOperate(SendCcoSmartCallOperateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendCcoSmartCallOperate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendCcoSmartCallOperateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendCcoSmartCallOperateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SendHotlineHeartBeat  SendHotlineHeartBeatRequest
     * @return SendHotlineHeartBeatResponse
     */
    @Override
    public CompletableFuture<SendHotlineHeartBeatResponse> sendHotlineHeartBeat(SendHotlineHeartBeatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendHotlineHeartBeat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendHotlineHeartBeatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendHotlineHeartBeatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you start a call task, ensure its status is Stopped.</li>
     * <li>If you do not have a call task, create one on the <strong>Call Task Management</strong> page or by calling the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of StartAiCallTask  StartAiCallTaskRequest
     * @return StartAiCallTaskResponse
     */
    @Override
    public CompletableFuture<StartAiCallTaskResponse> startAiCallTask(StartAiCallTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartAiCallTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAiCallTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAiCallTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to start an outbound calling job that is in the paused state.  </li>
     * <li>An outbound calling job in the stopped state cannot be started again.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times per second.  </li>
     * <li>API invocation frequency: 20 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StartAiOutboundTask  StartAiOutboundTaskRequest
     * @return StartAiOutboundTaskResponse
     */
    @Override
    public CompletableFuture<StartAiOutboundTaskResponse> startAiOutboundTask(StartAiOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartAiOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAiOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAiOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Unlimited.</li>
     * <li>API rate limit: 100 calls per second.<blockquote>
     * <p>Throttling is also triggered if the total number of calls from multiple users exceeds the API rate limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StartCall  StartCallRequest
     * @return StartCallResponse
     */
    @Override
    public CompletableFuture<StartCallResponse> startCall(StartCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartCallV2  StartCallV2Request
     * @return StartCallV2Response
     */
    @Override
    public CompletableFuture<StartCallV2Response> startCallV2(StartCallV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartCallV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartCallV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartCallV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartChatWork  StartChatWorkRequest
     * @return StartChatWorkResponse
     */
    @Override
    public CompletableFuture<StartChatWorkResponse> startChatWork(StartChatWorkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartChatWork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartChatWorkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartChatWorkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The <strong>Data</strong> parameter returned by this operation is the token required to initiate a heartbeat.</li>
     * <li>To pause the hotline service when an agent takes a short break, call the <a href="https://help.aliyun.com/document_detail/2718046.html">SuspendHotlineService</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: not throttled.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StartHotlineService  StartHotlineServiceRequest
     * @return StartHotlineServiceResponse
     */
    @Override
    public CompletableFuture<StartHotlineServiceResponse> startHotlineService(StartHotlineServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartHotlineService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartHotlineServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartHotlineServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartMicroOutbound  StartMicroOutboundRequest
     * @return StartMicroOutboundResponse
     */
    @Override
    public CompletableFuture<StartMicroOutboundResponse> startMicroOutbound(StartMicroOutboundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartMicroOutbound").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartMicroOutboundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartMicroOutboundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to start a successfully created outbound call task for the Artificial Intelligence Cloud Call Service chatbot. You can also manually start the task on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page.</li>
     * <li>Before calling this operation, ensure that you have a successfully created outbound call task for the Artificial Intelligence Cloud Call Service chatbot.</li>
     * <li>If you do not have a successfully created outbound call task, you can click Create Task on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page or call the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> operation to create one.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Not throttled.</li>
     * <li>API frequency: 500 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StartTask  StartTaskRequest
     * @return StartTaskResponse
     */
    @Override
    public CompletableFuture<StartTaskResponse> startTask(StartTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you stop an outbound call task, ensure that the task has been created and its status is <code>running</code>.</li>
     * <li>If you have not created an outbound call task, create one on the Outbound Task Management page or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of StopAiCallTask  StopAiCallTaskRequest
     * @return StopAiCallTaskResponse
     */
    @Override
    public CompletableFuture<StopAiCallTaskResponse> stopAiCallTask(StopAiCallTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopAiCallTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopAiCallTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopAiCallTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you pause an outbound call task, you can call the <a href="https://help.aliyun.com/document_detail/2718027.html">StartAiOutboundTask</a> operation to restart the task.</p>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: 20 calls per second.</li>
     * <li>API frequency: 20 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StopAiOutboundTask  StopAiOutboundTaskRequest
     * @return StopAiOutboundTaskResponse
     */
    @Override
    public CompletableFuture<StopAiOutboundTaskResponse> stopAiOutboundTask(StopAiOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopAiOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopAiOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopAiOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can use this API to pause an Intelligent Contact Robot calling job that has been successfully started, or manually pause the job on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</li>
     * <li>Before invoking this API, ensure that you already have a successfully started Intelligent Contact Robot calling job.</li>
     * <li>If you do not have a successfully started Intelligent Contact Robot calling job, click <strong>Start</strong> on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or start a job by using the <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StopTask  StopTaskRequest
     * @return StopTaskResponse
     */
    @Override
    public CompletableFuture<StopTaskResponse> stopTask(StopTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAudioNote  SubmitAudioNoteRequest
     * @return SubmitAudioNoteResponse
     */
    @Override
    public CompletableFuture<SubmitAudioNoteResponse> submitAudioNote(SubmitAudioNoteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAudioNote").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAudioNoteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAudioNoteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To resume the hotline service after a break, call the <a href="https://help.aliyun.com/document_detail/2718045.html">StartHotlineService</a> operation.</p>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Not limited.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SuspendHotlineService  SuspendHotlineServiceRequest
     * @return SuspendHotlineServiceResponse
     */
    @Override
    public CompletableFuture<SuspendHotlineServiceResponse> suspendHotlineService(SuspendHotlineServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendHotlineService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendHotlineServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendHotlineServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SuspendOutboundTask  SuspendOutboundTaskRequest
     * @return SuspendOutboundTaskResponse
     */
    @Override
    public CompletableFuture<SuspendOutboundTaskResponse> suspendOutboundTask(SuspendOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API supports terminating an outbound call job. Once terminated, the job cannot be restarted.</li>
     * <li>To temporarily stop an outbound call job, you can invoke the <a href="https://help.aliyun.com/document_detail/2718024.html">StopAiOutboundTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.</li>
     * <li>API-wide invocation frequency: 20 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of TerminateAiOutboundTask  TerminateAiOutboundTaskRequest
     * @return TerminateAiOutboundTaskResponse
     */
    @Override
    public CompletableFuture<TerminateAiOutboundTaskResponse> terminateAiOutboundTask(TerminateAiOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminateAiOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateAiOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateAiOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TestLargeModel  TestLargeModelRequest
     * @return TestLargeModelResponse
     */
    @Override
    public CompletableFuture<TestLargeModelResponse> testLargeModel(TestLargeModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestLargeModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestLargeModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestLargeModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferCallToSkillGroup  TransferCallToSkillGroupRequest
     * @return TransferCallToSkillGroupResponse
     */
    @Override
    public CompletableFuture<TransferCallToSkillGroupResponse> transferCallToSkillGroup(TransferCallToSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferCallToSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferCallToSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferCallToSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have obtained the AICCS instance ID. For more information, see the instructions in the <a href="#api-detail-35">Request parameters</a> section.</li>
     * <li>After the update, you can call the <a href="https://help.aliyun.com/document_detail/2717961.html">GetAgent</a> operation to check whether the update meets your expectations.<blockquote>
     * <p>Currently, only the display name and skill groups can be updated.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: not limited.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    @Override
    public CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAgent").setMethod(HttpMethod.PUT).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you update the configuration of a voice call task, ensure that the task is stopped.</p>
     * 
     * @param request the request parameters of UpdateAiCallTask  UpdateAiCallTaskRequest
     * @return UpdateAiCallTaskResponse
     */
    @Override
    public CompletableFuture<UpdateAiCallTaskResponse> updateAiCallTask(UpdateAiCallTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAiCallTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAiCallTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAiCallTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to update the task name, task description, outbound caller number, skill group ID, and other information. For more details, refer to <a href="#api-detail-35">Request parameters</a>.</p>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: not throttled.</li>
     * <li>API frequency: 20 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAiOutboundTask  UpdateAiOutboundTaskRequest
     * @return UpdateAiOutboundTaskResponse
     */
    @Override
    public CompletableFuture<UpdateAiOutboundTaskResponse> updateAiOutboundTask(UpdateAiOutboundTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAiOutboundTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAiOutboundTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAiOutboundTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation only supports updating the department name and does not support updating the department ID.</li>
     * <li>Before you call this operation, make sure that you have obtained the AICCS instance ID and department ID. For more information, see the instructions in the <a href="#api-detail-35">Request parameters</a> section.</li>
     * <li>After the update is complete, you can call the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> operation to check whether the department information meets your expectations.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Calls per second per user: 100.</li>
     * <li>API calls per second: 100.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API rate limit, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDepartment  UpdateDepartmentRequest
     * @return UpdateDepartmentResponse
     */
    @Override
    public CompletableFuture<UpdateDepartmentResponse> updateDepartment(UpdateDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDepartment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLargeModel  UpdateLargeModelRequest
     * @return UpdateLargeModelResponse
     */
    @Override
    public CompletableFuture<UpdateLargeModelResponse> updateLargeModel(UpdateLargeModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLargeModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLargeModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLargeModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModelApplication  UpdateModelApplicationRequest
     * @return UpdateModelApplicationResponse
     */
    @Override
    public CompletableFuture<UpdateModelApplicationResponse> updateModelApplication(UpdateModelApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateModelApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOuterAccount  UpdateOuterAccountRequest
     * @return UpdateOuterAccountResponse
     */
    @Override
    public CompletableFuture<UpdateOuterAccountResponse> updateOuterAccount(UpdateOuterAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOuterAccount").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOuterAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOuterAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation does not support updating the skill group ID or skill group name.</li>
     * <li>After the update, you can call the <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> operation to query the skill group information.</li>
     * <li>To obtain the AICCS instance ID and skill group ID, refer to the instructions in the <a href="#api-detail-35">Request parameters</a> section.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Call frequency per user: Not throttled.</li>
     * <li>API frequency: 1,000 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency, throttling is triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSkillGroup  UpdateSkillGroupRequest
     * @return UpdateSkillGroupResponse
     */
    @Override
    public CompletableFuture<UpdateSkillGroupResponse> updateSkillGroup(UpdateSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
