// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aiccs20191015.models.*;
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Hotline numbers are for inbound and outbound calls only.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AddHotlineNumber  AddHotlineNumberRequest
     * @return AddHotlineNumberResponse
     */
    CompletableFuture<AddHotlineNumberResponse> addHotlineNumber(AddHotlineNumberRequest request);

    /**
     * @param request the request parameters of AddInboundNumber  AddInboundNumberRequest
     * @return AddInboundNumberResponse
     */
    CompletableFuture<AddInboundNumberResponse> addInboundNumber(AddInboundNumberRequest request);

    /**
     * @param request the request parameters of AddLargeModel  AddLargeModelRequest
     * @return AddLargeModelResponse
     */
    CompletableFuture<AddLargeModelResponse> addLargeModel(AddLargeModelRequest request);

    /**
     * @param request the request parameters of AddModelApplication  AddModelApplicationRequest
     * @return AddModelApplicationResponse
     */
    CompletableFuture<AddModelApplicationResponse> addModelApplication(AddModelApplicationRequest request);

    /**
     * @param request the request parameters of AddOuterAccount  AddOuterAccountRequest
     * @return AddOuterAccountResponse
     */
    CompletableFuture<AddOuterAccountResponse> addOuterAccount(AddOuterAccountRequest request);

    /**
     * @param request the request parameters of AddSkillGroup  AddSkillGroupRequest
     * @return AddSkillGroupResponse
     */
    CompletableFuture<AddSkillGroupResponse> addSkillGroup(AddSkillGroupRequest request);

    /**
     * @param request the request parameters of AiccsSmartCall  AiccsSmartCallRequest
     * @return AiccsSmartCallResponse
     */
    CompletableFuture<AiccsSmartCallResponse> aiccsSmartCall(AiccsSmartCallRequest request);

    /**
     * @param request the request parameters of AiccsSmartCallOperate  AiccsSmartCallOperateRequest
     * @return AiccsSmartCallOperateResponse
     */
    CompletableFuture<AiccsSmartCallOperateResponse> aiccsSmartCallOperate(AiccsSmartCallOperateRequest request);

    /**
     * @param request the request parameters of AnswerCall  AnswerCallRequest
     * @return AnswerCallResponse
     */
    CompletableFuture<AnswerCallResponse> answerCall(AnswerCallRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After creating an Intelligent Contact Robot calling job, you can invoke this API to append job details.</li>
     * <li>Before invoking this API, ensure that you already have a successfully created Intelligent Contact Robot calling job.</li>
     * <li>If you do not have a successfully created Intelligent Contact Robot calling job, you can click <strong>Create Job</strong> on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or create a job by using the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> API.</li>
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
     * @param request the request parameters of AttachTask  AttachTaskRequest
     * @return AttachTaskResponse
     */
    CompletableFuture<AttachTaskResponse> attachTask(AttachTaskRequest request);

    /**
     * @param request the request parameters of BatchCreateQualityProjects  BatchCreateQualityProjectsRequest
     * @return BatchCreateQualityProjectsResponse
     */
    CompletableFuture<BatchCreateQualityProjectsResponse> batchCreateQualityProjects(BatchCreateQualityProjectsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use this operation to cancel calls. Alternatively, you can manually cancel calls in the console by navigating to <strong>Call Task Management</strong> &gt; <strong>Manage</strong> &gt; <strong>Execution Records</strong> &gt; <strong>Pending</strong>.</li>
     * <li>Before calling this operation, ensure you have created a call task and imported callee data.</li>
     * <li>If you have not created a call task, you can create one and import callee data on the <strong>Call Task Management</strong> page. You can also call the <a href="https://help.aliyun.com/document_detail/2926815.html">CreateAiCallTask</a> and <a href="">ImportTaskNumberDatas</a> operations.</li>
     * <li>Canceling a call task may affect your business. Please proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelAiCallDetails  CancelAiCallDetailsRequest
     * @return CancelAiCallDetailsResponse
     */
    CompletableFuture<CancelAiCallDetailsResponse> cancelAiCallDetails(CancelAiCallDetailsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to cancel an Intelligent Contact Robot calling job, or manually cancel the job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</li>
     * <li>After an Intelligent Contact Robot calling job is canceled, it cannot be started again. Proceed with caution.</li>
     * <li>If you want to pause a job and restart it later, you can manually pause the job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or pause it by using the <a href="https://help.aliyun.com/document_detail/2718006.html">StopTask</a> API.</li>
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
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Currently, only changing the Live Support status to offline is supported.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ChangeChatAgentStatus  ChangeChatAgentStatusRequest
     * @return ChangeChatAgentStatusResponse
     */
    CompletableFuture<ChangeChatAgentStatusResponse> changeChatAgentStatus(ChangeChatAgentStatusRequest request);

    /**
     * @param request the request parameters of ChangeQualityProjectStatus  ChangeQualityProjectStatusRequest
     * @return ChangeQualityProjectStatusResponse
     */
    CompletableFuture<ChangeQualityProjectStatusResponse> changeQualityProjectStatus(ChangeQualityProjectStatusRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify skill group information, refer to the guidance in <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>You can manage agents by calling <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-deleteagent">DeleteAgent</a> to delete an agent or <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-updateagent">UpdateAgent</a> to update agent data.</li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <ul>
     * <li>Per-user call frequency: No rate limiting.  </li>
     * <li>API call frequency: 100 queries per second (QPS).  <blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Before creating a voice call task, use an agent to perform a test call to confirm that the results meet your requirements.</p>
     * 
     * @param request the request parameters of CreateAiCallTask  CreateAiCallTaskRequest
     * @return CreateAiCallTaskResponse
     */
    CompletableFuture<CreateAiCallTaskResponse> createAiCallTask(CreateAiCallTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The <strong>Data</strong> field in the response parameters of this API is the job ID.  </li>
     * <li>After creating an Intelligent Outbound Call Job, if you need to make updates, you can invoke the <a href="https://help.aliyun.com/document_detail/2718021.html">UpdateAiOutboundTask</a> API to update the outbound call job.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 20 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAiOutboundTask  CreateAiOutboundTaskRequest
     * @return CreateAiOutboundTaskResponse
     */
    CompletableFuture<CreateAiOutboundTaskResponse> createAiOutboundTask(CreateAiOutboundTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before invoking this API, we recommend that you confirm the instance ID and job ID. For guidance on how to obtain them, see the instructions in <a href="#api-detail-35">Request Parameters</a>.</p>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 queries per second (QPS).</li>
     * <li>API-wide invocation frequency: 20 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAiOutboundTaskBatch  CreateAiOutboundTaskBatchRequest
     * @return CreateAiOutboundTaskBatchResponse
     */
    CompletableFuture<CreateAiOutboundTaskBatchResponse> createAiOutboundTaskBatch(CreateAiOutboundTaskBatchRequest request);

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
    CompletableFuture<CreateDepartmentResponse> createDepartment(CreateDepartmentRequest request);

    /**
     * @param request the request parameters of CreateOutboundTask  CreateOutboundTaskRequest
     * @return CreateOutboundTaskResponse
     */
    CompletableFuture<CreateOutboundTaskResponse> createOutboundTask(CreateOutboundTaskRequest request);

    /**
     * @param request the request parameters of CreateQualityProject  CreateQualityProjectRequest
     * @return CreateQualityProjectResponse
     */
    CompletableFuture<CreateQualityProjectResponse> createQualityProject(CreateQualityProjectRequest request);

    /**
     * @param request the request parameters of CreateQualityRule  CreateQualityRuleRequest
     * @return CreateQualityRuleResponse
     */
    CompletableFuture<CreateQualityRuleResponse> createQualityRule(CreateQualityRuleRequest request);

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
    CompletableFuture<CreateSkillGroupResponse> createSkillGroup(CreateSkillGroupRequest request);

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
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of CreateThirdSsoAgent  CreateThirdSsoAgentRequest
     * @return CreateThirdSsoAgentResponse
     */
    CompletableFuture<CreateThirdSsoAgentResponse> createThirdSsoAgent(CreateThirdSsoAgentRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before deletion, we recommend that you confirm the agent account name and instance ID to be deleted. For guidance on how to obtain them, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>If an agent is accidentally deleted, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-createagent">CreateAgent</a> API to recreate the agent.<blockquote>
     * <p>If an account is re-added after deletion, the agent ID remains unchanged.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Deletion is a sensitive operation. Proceed with caution.</p>
     * </blockquote>
     * <ul>
     * <li>Before deletion, we recommend that you confirm the job ID and related information. You can call the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> API to view the outbound calling job list and verify the task name, description, and corresponding job ID.</li>
     * <li>If you need to recreate an Intelligent Outbound Calling job, you can call the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.</li>
     * <li>API invocation frequency: 20 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAiOutboundTask  DeleteAiOutboundTaskRequest
     * @return DeleteAiOutboundTaskResponse
     */
    CompletableFuture<DeleteAiOutboundTaskResponse> deleteAiOutboundTask(DeleteAiOutboundTaskRequest request);

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
    CompletableFuture<DeleteDepartmentResponse> deleteDepartment(DeleteDepartmentRequest request);

    /**
     * @param request the request parameters of DeleteHotlineNumber  DeleteHotlineNumberRequest
     * @return DeleteHotlineNumberResponse
     */
    CompletableFuture<DeleteHotlineNumberResponse> deleteHotlineNumber(DeleteHotlineNumberRequest request);

    /**
     * @param request the request parameters of DeleteOutboundTask  DeleteOutboundTaskRequest
     * @return DeleteOutboundTaskResponse
     */
    CompletableFuture<DeleteOutboundTaskResponse> deleteOutboundTask(DeleteOutboundTaskRequest request);

    /**
     * @param request the request parameters of DeleteOuterAccount  DeleteOuterAccountRequest
     * @return DeleteOuterAccountResponse
     */
    CompletableFuture<DeleteOuterAccountResponse> deleteOuterAccount(DeleteOuterAccountRequest request);

    /**
     * @param request the request parameters of DeleteQualityProject  DeleteQualityProjectRequest
     * @return DeleteQualityProjectResponse
     */
    CompletableFuture<DeleteQualityProjectResponse> deleteQualityProject(DeleteQualityProjectRequest request);

    /**
     * @param request the request parameters of DeleteQualityRule  DeleteQualityRuleRequest
     * @return DeleteQualityRuleResponse
     */
    CompletableFuture<DeleteQualityRuleResponse> deleteQualityRule(DeleteQualityRuleRequest request);

    /**
     * @param request the request parameters of DeleteSkillGroup  DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    CompletableFuture<DeleteSkillGroupResponse> deleteSkillGroup(DeleteSkillGroupRequest request);

    /**
     * @param request the request parameters of DescribeRecordData  DescribeRecordDataRequest
     * @return DescribeRecordDataResponse
     */
    CompletableFuture<DescribeRecordDataResponse> describeRecordData(DescribeRecordDataRequest request);

    /**
     * @param request the request parameters of EditQualityProject  EditQualityProjectRequest
     * @return EditQualityProjectResponse
     */
    CompletableFuture<EditQualityProjectResponse> editQualityProject(EditQualityProjectRequest request);

    /**
     * @param request the request parameters of EditQualityRule  EditQualityRuleRequest
     * @return EditQualityRuleResponse
     */
    CompletableFuture<EditQualityRuleResponse> editQualityRule(EditQualityRuleRequest request);

    /**
     * @param request the request parameters of EditQualityRuleTag  EditQualityRuleTagRequest
     * @return EditQualityRuleTagResponse
     */
    CompletableFuture<EditQualityRuleTagResponse> editQualityRuleTag(EditQualityRuleTagRequest request);

    /**
     * @param request the request parameters of EncryptPhoneNum  EncryptPhoneNumRequest
     * @return EncryptPhoneNumResponse
     */
    CompletableFuture<EncryptPhoneNumResponse> encryptPhoneNum(EncryptPhoneNumRequest request);

    /**
     * @param request the request parameters of FetchCall  FetchCallRequest
     * @return FetchCallResponse
     */
    CompletableFuture<FetchCallResponse> fetchCall(FetchCallRequest request);

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
    CompletableFuture<FinishHotlineServiceResponse> finishHotlineService(FinishHotlineServiceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to generate a message channel access signature. The <strong>Data</strong> field in the response contains the MessageBox message channel signature code.</li>
     * <li>Before invoking the API, we recommend that you confirm your AICCS instance ID. For instructions on how to obtain it, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API-wide frequency: 100 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GenerateWebSocketSign  GenerateWebSocketSignRequest
     * @return GenerateWebSocketSignResponse
     */
    CompletableFuture<GenerateWebSocketSignResponse> generateWebSocketSign(GenerateWebSocketSignRequest request);

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
    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

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
    CompletableFuture<GetAgentBasisStatusResponse> getAgentBasisStatus(GetAgentBasisStatusRequest request);

    /**
     * @param request the request parameters of GetAgentById  GetAgentByIdRequest
     * @return GetAgentByIdResponse
     */
    CompletableFuture<GetAgentByIdResponse> getAgentById(GetAgentByIdRequest request);

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
    CompletableFuture<GetAgentDetailReportResponse> getAgentDetailReport(GetAgentDetailReportRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.</li>
     * <li>If you need to specify department or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 10 requests per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentIndexRealTime  GetAgentIndexRealTimeRequest
     * @return GetAgentIndexRealTimeResponse
     */
    CompletableFuture<GetAgentIndexRealTimeResponse> getAgentIndexRealTime(GetAgentIndexRealTimeRequest request);

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
    CompletableFuture<GetAgentServiceStatusResponse> getAgentServiceStatus(GetAgentServiceStatusRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentStatistics  GetAgentStatisticsRequest
     * @return GetAgentStatisticsResponse
     */
    CompletableFuture<GetAgentStatisticsResponse> getAgentStatistics(GetAgentStatisticsRequest request);

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
    CompletableFuture<GetAiOutboundTaskBizDataResponse> getAiOutboundTaskBizData(GetAiOutboundTaskBizDataRequest request);

    /**
     * <b>description</b> :
     * <p>The outbound call job details include the job ID, job status, task type, outbound caller number, callee number repetition policy, and other information. For more information, see <a href="#api-detail-40">Response parameters</a>.  </p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAiOutboundTaskDetail  GetAiOutboundTaskDetailRequest
     * @return GetAiOutboundTaskDetailResponse
     */
    CompletableFuture<GetAiOutboundTaskDetailResponse> getAiOutboundTaskDetail(GetAiOutboundTaskDetailRequest request);

    /**
     * <b>description</b> :
     * <p>The task execution details include the total number of jobs, job batches, outbound call numbers, corresponding call counts, execution status, and other information.</p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAiOutboundTaskExecDetail  GetAiOutboundTaskExecDetailRequest
     * @return GetAiOutboundTaskExecDetailResponse
     */
    CompletableFuture<GetAiOutboundTaskExecDetailResponse> getAiOutboundTaskExecDetail(GetAiOutboundTaskExecDetailRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The job list contains job information, including job ID, Task Status, Task Name, task completion rate, and more. For details, see <a href="#api-detail-40">Response parameters</a>.</li>
     * <li>If you need to update job information, you can invoke the <a href="https://help.aliyun.com/document_detail/2718021.html">UpdateAiOutboundTask</a> API.</li>
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
     * @param request the request parameters of GetAiOutboundTaskList  GetAiOutboundTaskListRequest
     * @return GetAiOutboundTaskListResponse
     */
    CompletableFuture<GetAiOutboundTaskListResponse> getAiOutboundTaskList(GetAiOutboundTaskListRequest request);

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
    CompletableFuture<GetAiOutboundTaskProgressResponse> getAiOutboundTaskProgress(GetAiOutboundTaskProgressRequest request);

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
    CompletableFuture<GetAllDepartmentResponse> getAllDepartment(GetAllDepartmentRequest request);

    /**
     * @param request the request parameters of GetAudioNoteUploadUrl  GetAudioNoteUploadUrlRequest
     * @return GetAudioNoteUploadUrlResponse
     */
    CompletableFuture<GetAudioNoteUploadUrlResponse> getAudioNoteUploadUrl(GetAudioNoteUploadUrlRequest request);

    /**
     * @param request the request parameters of GetCallDialogContent  GetCallDialogContentRequest
     * @return GetCallDialogContentResponse
     */
    CompletableFuture<GetCallDialogContentResponse> getCallDialogContent(GetCallDialogContentRequest request);

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
    CompletableFuture<GetCallSoundRecordResponse> getCallSoundRecord(GetCallSoundRecordRequest request);

    /**
     * @param request the request parameters of GetConfigNumList  GetConfigNumListRequest
     * @return GetConfigNumListResponse
     */
    CompletableFuture<GetConfigNumListResponse> getConfigNumList(GetConfigNumListRequest request);

    /**
     * @param request the request parameters of GetCustomerInfo  GetCustomerInfoRequest
     * @return GetCustomerInfoResponse
     */
    CompletableFuture<GetCustomerInfoResponse> getCustomerInfo(GetCustomerInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The skill groups returned by this API are grouped by department ID, which can be specified when you <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-createskillgroup">create a skill group</a>.</li>
     * <li>To query detailed skill group information, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API.</li>
     * <li>Before invoking this API, you should confirm the AICCS instance ID and agent ID. For guidance on how to obtain them, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 1000 queries per second.</li>
     * <li>API-wide invocation frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetDepGroupTreeData  GetDepGroupTreeDataRequest
     * @return GetDepGroupTreeDataResponse
     */
    CompletableFuture<GetDepGroupTreeDataResponse> getDepGroupTreeData(GetDepGroupTreeDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API-wide invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetDepartmentalLatitudeAgentStatus  GetDepartmentalLatitudeAgentStatusRequest
     * @return GetDepartmentalLatitudeAgentStatusResponse
     */
    CompletableFuture<GetDepartmentalLatitudeAgentStatusResponse> getDepartmentalLatitudeAgentStatus(GetDepartmentalLatitudeAgentStatusRequest request);

    /**
     * <b>description</b> :
     * <p>The hotline agent details include information such as agent posture status, agent ID, and heartbeat signature. For more information, see <a href="#api-detail-40">Response parameters</a>.  </p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: Rate Limiting is not applied.  </li>
     * <li>API frequency: 100 queries per second (QPS).  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetHotlineAgentDetail  GetHotlineAgentDetailRequest
     * @return GetHotlineAgentDetailResponse
     */
    CompletableFuture<GetHotlineAgentDetailResponse> getHotlineAgentDetail(GetHotlineAgentDetailRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/document_detail/276009.html">activated the service</a> and <a href="https://help.aliyun.com/document_detail/276011.html">created an instance</a>.</li>
     * <li>If you need to specify department or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.<blockquote>
     * <p>Query logic priority:</p>
     * <ul>
     * <li>If GroupIds is not empty, query data metrics under the specified skill groups.</li>
     * <li>Otherwise, if DepIds is not empty, query data metrics under the corresponding department groups.</li>
     * <li>Otherwise, query data metrics under the AICCS instance.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 10 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetHotlineAgentDetailReport  GetHotlineAgentDetailReportRequest
     * @return GetHotlineAgentDetailReportResponse
     */
    CompletableFuture<GetHotlineAgentDetailReportResponse> getHotlineAgentDetailReport(GetHotlineAgentDetailReportRequest request);

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
    CompletableFuture<GetHotlineAgentStatusResponse> getHotlineAgentStatus(GetHotlineAgentStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 50 times/second.  </li>
     * <li>API invocation frequency: 100 times/second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetHotlineCallAction  GetHotlineCallActionRequest
     * @return GetHotlineCallActionResponse
     */
    CompletableFuture<GetHotlineCallActionResponse> getHotlineCallAction(GetHotlineCallActionRequest request);

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
    CompletableFuture<GetHotlineGroupDetailReportResponse> getHotlineGroupDetailReport(GetHotlineGroupDetailReportRequest request);

    /**
     * @param request the request parameters of GetHotlineMessageLog  GetHotlineMessageLogRequest
     * @return GetHotlineMessageLogResponse
     */
    CompletableFuture<GetHotlineMessageLogResponse> getHotlineMessageLog(GetHotlineMessageLogRequest request);

    /**
     * @param request the request parameters of GetHotlineRuntimeInfo  GetHotlineRuntimeInfoRequest
     * @return GetHotlineRuntimeInfoResponse
     */
    CompletableFuture<GetHotlineRuntimeInfoResponse> getHotlineRuntimeInfo(GetHotlineRuntimeInfoRequest request);

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
    CompletableFuture<GetHotlineServiceStatisticsResponse> getHotlineServiceStatistics(GetHotlineServiceStatisticsRequest request);

    /**
     * @param request the request parameters of GetHotlineWaitingNumber  GetHotlineWaitingNumberRequest
     * @return GetHotlineWaitingNumberResponse
     */
    CompletableFuture<GetHotlineWaitingNumberResponse> getHotlineWaitingNumber(GetHotlineWaitingNumberRequest request);

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
    CompletableFuture<GetIndexCurrentValueResponse> getIndexCurrentValue(GetIndexCurrentValueRequest request);

    /**
     * @param request the request parameters of GetInstanceList  GetInstanceListRequest
     * @return GetInstanceListResponse
     */
    CompletableFuture<GetInstanceListResponse> getInstanceList(GetInstanceListRequest request);

    /**
     * @param request the request parameters of GetMcuLvsIp  GetMcuLvsIpRequest
     * @return GetMcuLvsIpResponse
     */
    CompletableFuture<GetMcuLvsIpResponse> getMcuLvsIp(GetMcuLvsIpRequest request);

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
     * @param request the request parameters of GetNumLocation  GetNumLocationRequest
     * @return GetNumLocationResponse
     */
    CompletableFuture<GetNumLocationResponse> getNumLocation(GetNumLocationRequest request);

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
    CompletableFuture<GetOnlineSeatInformationResponse> getOnlineSeatInformation(GetOnlineSeatInformationRequest request);

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
    CompletableFuture<GetOnlineServiceVolumeResponse> getOnlineServiceVolume(GetOnlineServiceVolumeRequest request);

    /**
     * @param request the request parameters of GetOutbounNumList  GetOutbounNumListRequest
     * @return GetOutbounNumListResponse
     */
    CompletableFuture<GetOutbounNumListResponse> getOutbounNumList(GetOutbounNumListRequest request);

    /**
     * @param request the request parameters of GetQualityProjectDetail  GetQualityProjectDetailRequest
     * @return GetQualityProjectDetailResponse
     */
    CompletableFuture<GetQualityProjectDetailResponse> getQualityProjectDetail(GetQualityProjectDetailRequest request);

    /**
     * @param request the request parameters of GetQualityProjectList  GetQualityProjectListRequest
     * @return GetQualityProjectListResponse
     */
    CompletableFuture<GetQualityProjectListResponse> getQualityProjectList(GetQualityProjectListRequest request);

    /**
     * @param request the request parameters of GetQualityProjectLog  GetQualityProjectLogRequest
     * @return GetQualityProjectLogResponse
     */
    CompletableFuture<GetQualityProjectLogResponse> getQualityProjectLog(GetQualityProjectLogRequest request);

    /**
     * @param request the request parameters of GetQualityResult  GetQualityResultRequest
     * @return GetQualityResultResponse
     */
    CompletableFuture<GetQualityResultResponse> getQualityResult(GetQualityResultRequest request);

    /**
     * @param request the request parameters of GetQualityRuleDetail  GetQualityRuleDetailRequest
     * @return GetQualityRuleDetailResponse
     */
    CompletableFuture<GetQualityRuleDetailResponse> getQualityRuleDetail(GetQualityRuleDetailRequest request);

    /**
     * @param request the request parameters of GetQualityRuleList  GetQualityRuleListRequest
     * @return GetQualityRuleListResponse
     */
    CompletableFuture<GetQualityRuleListResponse> getQualityRuleList(GetQualityRuleListRequest request);

    /**
     * @param request the request parameters of GetQualityRuleTagList  GetQualityRuleTagListRequest
     * @return GetQualityRuleTagListResponse
     */
    CompletableFuture<GetQualityRuleTagListResponse> getQualityRuleTagList(GetQualityRuleTagListRequest request);

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
    CompletableFuture<GetQueueInformationResponse> getQueueInformation(GetQueueInformationRequest request);

    /**
     * @param request the request parameters of GetRecordData  GetRecordDataRequest
     * @return GetRecordDataResponse
     */
    CompletableFuture<GetRecordDataResponse> getRecordData(GetRecordDataRequest request);

    /**
     * @param request the request parameters of GetRecordUrl  GetRecordUrlRequest
     * @return GetRecordUrlResponse
     */
    CompletableFuture<GetRecordUrlResponse> getRecordUrl(GetRecordUrlRequest request);

    /**
     * @param request the request parameters of GetRtcToken  GetRtcTokenRequest
     * @return GetRtcTokenResponse
     */
    CompletableFuture<GetRtcTokenResponse> getRtcToken(GetRtcTokenRequest request);

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
    CompletableFuture<GetSeatInformationResponse> getSeatInformation(GetSeatInformationRequest request);

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
    CompletableFuture<GetSkillGroupAgentStatusDetailsResponse> getSkillGroupAgentStatusDetails(GetSkillGroupAgentStatusDetailsRequest request);

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
     * @param request the request parameters of GetSkillGroupAndAgentStatusSummary  GetSkillGroupAndAgentStatusSummaryRequest
     * @return GetSkillGroupAndAgentStatusSummaryResponse
     */
    CompletableFuture<GetSkillGroupAndAgentStatusSummaryResponse> getSkillGroupAndAgentStatusSummary(GetSkillGroupAndAgentStatusSummaryRequest request);

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
    CompletableFuture<GetSkillGroupLatitudeStateResponse> getSkillGroupLatitudeState(GetSkillGroupLatitudeStateRequest request);

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
    CompletableFuture<GetSkillGroupServiceCapabilityResponse> getSkillGroupServiceCapability(GetSkillGroupServiceCapabilityRequest request);

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
    CompletableFuture<GetSkillGroupServiceStatusResponse> getSkillGroupServiceStatus(GetSkillGroupServiceStatusRequest request);

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
    CompletableFuture<GetSkillGroupStatusTotalResponse> getSkillGroupStatusTotal(GetSkillGroupStatusTotalRequest request);

    /**
     * @param request the request parameters of HangUpDoubleCall  HangUpDoubleCallRequest
     * @return HangUpDoubleCallResponse
     */
    CompletableFuture<HangUpDoubleCallResponse> hangUpDoubleCall(HangUpDoubleCallRequest request);

    /**
     * @param request the request parameters of HangupCall  HangupCallRequest
     * @return HangupCallResponse
     */
    CompletableFuture<HangupCallResponse> hangupCall(HangupCallRequest request);

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
    CompletableFuture<HangupOperateResponse> hangupOperate(HangupOperateRequest request);

    /**
     * @param request the request parameters of HangupThirdCall  HangupThirdCallRequest
     * @return HangupThirdCallResponse
     */
    CompletableFuture<HangupThirdCallResponse> hangupThirdCall(HangupThirdCallRequest request);

    /**
     * @param request the request parameters of HoldCall  HoldCallRequest
     * @return HoldCallResponse
     */
    CompletableFuture<HoldCallResponse> holdCall(HoldCallRequest request);

    /**
     * <b>description</b> :
     * <p>Call details include the total number of records, call results, agent names, call time, and other information.</p>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user call frequency: not throttled.</li>
     * <li>API frequency: 80 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency, throttling is also triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of HotlineSessionQuery  HotlineSessionQueryRequest
     * @return HotlineSessionQueryResponse
     */
    CompletableFuture<HotlineSessionQueryResponse> hotlineSessionQuery(HotlineSessionQueryRequest request);

    /**
     * @param request the request parameters of ImportOneTaskPhoneNumber  ImportOneTaskPhoneNumberRequest
     * @return ImportOneTaskPhoneNumberResponse
     */
    CompletableFuture<ImportOneTaskPhoneNumberResponse> importOneTaskPhoneNumber(ImportOneTaskPhoneNumberRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can import callee data by calling this operation. Alternatively, go to the <strong>call task management</strong> page, click <strong>Import Callee Data</strong>, download the template, and then upload your file.</li>
     * <li>This API operation currently supports only the JSON data type for importing callee data.</li>
     * <li>Ensure that you have created a call task before you call this operation.</li>
     * <li>To create a call task, go to the <strong>call task management</strong> page and click <strong>Create Call Task</strong>, or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportTaskNumberDatas  ImportTaskNumberDatasRequest
     * @return ImportTaskNumberDatasResponse
     */
    CompletableFuture<ImportTaskNumberDatasResponse> importTaskNumberDatas(ImportTaskNumberDatasRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After importing outbound call callee numbers, the outbound calling job can operate normally.  </li>
     * <li>Before invoking this API, we recommend that you confirm the instance ID and job ID. For more information, see <a href="#api-detail-35">Request Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.  </li>
     * <li>API invocation frequency: 50 times/second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of InsertAiOutboundPhoneNums  InsertAiOutboundPhoneNumsRequest
     * @return InsertAiOutboundPhoneNumsResponse
     */
    CompletableFuture<InsertAiOutboundPhoneNumsResponse> insertAiOutboundPhoneNums(InsertAiOutboundPhoneNumsRequest request);

    /**
     * @param request the request parameters of InsertTaskDetail  InsertTaskDetailRequest
     * @return InsertTaskDetailResponse
     */
    CompletableFuture<InsertTaskDetailResponse> insertTaskDetail(InsertTaskDetailRequest request);

    /**
     * @param request the request parameters of JoinThirdCall  JoinThirdCallRequest
     * @return JoinThirdCallResponse
     */
    CompletableFuture<JoinThirdCallResponse> joinThirdCall(JoinThirdCallRequest request);

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
    CompletableFuture<ListAgentBySkillGroupIdResponse> listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request);

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
    CompletableFuture<ListAiccsRobotResponse> listAiccsRobot(ListAiccsRobotRequest request);

    /**
     * <b>description</b> :
     * <p>If you have not created and published any custom voices on the <a href="https://aiccs.console.aliyun.com/engine/voiceprint">Custom Voice</a> page, the operation returns only system voices.</p>
     * 
     * @param request the request parameters of ListAvailableTts  ListAvailableTtsRequest
     * @return ListAvailableTtsResponse
     */
    CompletableFuture<ListAvailableTtsResponse> listAvailableTts(ListAvailableTtsRequest request);

    /**
     * <b>description</b> :
     * <p>This API queries information about completed online sessions within a specified time range, including session content. The query rules are as follows:  </p>
     * <ul>
     * <li>The maximum time span for the query is 1 Day.  </li>
     * <li>If only the query End Time is provided, the query Start Time is set to 1 hour before the End Time.  </li>
     * <li>If only the query Start Time is provided, the End Time is set to 1 hour after the Start Time.  </li>
     * <li>If neither time is provided, the End Time defaults to the current time, and the Start Time is set to 1 hour before the End Time.  </li>
     * <li>If both times are provided but the time span exceeds 1 Day, an abnormal response is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChatRecordDetail  ListChatRecordDetailRequest
     * @return ListChatRecordDetailResponse
     */
    CompletableFuture<ListChatRecordDetailResponse> listChatRecordDetail(ListChatRecordDetailRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to query Intelligent Contact Bot conversation records, or view them in the <strong>Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>View Conversation Records</strong> interface.</li>
     * <li>Before invoking this API, ensure that your created Intelligent Contact Bot calling job has successfully connected to at least one phone number.</li>
     * <li>If you do not have an existing Intelligent Contact Bot calling job, you can create and start a job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface, or use the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> and <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> APIs to create and start a job.</li>
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
     * @param request the request parameters of ListDialog  ListDialogRequest
     * @return ListDialogResponse
     */
    CompletableFuture<ListDialogResponse> listDialog(ListDialogRequest request);

    /**
     * @param request the request parameters of ListHotlineRecord  ListHotlineRecordRequest
     * @return ListHotlineRecordResponse
     */
    CompletableFuture<ListHotlineRecordResponse> listHotlineRecord(ListHotlineRecordRequest request);

    /**
     * <b>description</b> :
     * <p>This API queries detailed hotline information within a specified time range, including hotline call information. The query rules are as follows:  </p>
     * <ul>
     * <li>The maximum time span for the query is 1 Day.  </li>
     * <li>If only the query End Time is provided, the query Start Time is set to 1 hour before the End Time.  </li>
     * <li>If only the query Start Time is provided, the End Time is set to 1 hour after the Start Time.  </li>
     * <li>If neither time is provided, the End Time defaults to the current time, and the Start Time is set to 1 hour before the End Time.  </li>
     * <li>If both times are provided but the time span exceeds 1 Day, an abnormal result is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListHotlineRecordDetail  ListHotlineRecordDetailRequest
     * @return ListHotlineRecordDetailResponse
     */
    CompletableFuture<ListHotlineRecordDetailResponse> listHotlineRecordDetail(ListHotlineRecordDetailRequest request);

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
    CompletableFuture<ListOutboundPhoneNumberResponse> listOutboundPhoneNumber(ListOutboundPhoneNumberRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have initiated an outbound call task by using the intelligent contact robot.</li>
     * <li>If you have not initiated an outbound call task by using the intelligent contact robot, call the <a href="https://help.aliyun.com/document_detail/2717996.html">RobotCall</a> operation to initiate an outbound call task.</li>
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
     * @param request the request parameters of ListRobotCallDialog  ListRobotCallDialogRequest
     * @return ListRobotCallDialogResponse
     */
    CompletableFuture<ListRobotCallDialogResponse> listRobotCallDialog(ListRobotCallDialogRequest request);

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
    CompletableFuture<ListRobotNodeResponse> listRobotNode(ListRobotNodeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have already added input parameters for the robot.</li>
     * <li>If your robot does not have any input parameters, go to the <a href="https://aiccs.console.aliyun.com/patter/list"><strong>Script Management</strong></a> &gt; <strong>Configuration</strong> &gt; <strong>Input and Output Parameters</strong> interface and click to add an input parameter.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListRobotParams  ListRobotParamsRequest
     * @return ListRobotParamsResponse
     */
    CompletableFuture<ListRobotParamsResponse> listRobotParams(ListRobotParamsRequest request);

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

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
    CompletableFuture<ListSkillGroupResponse> listSkillGroup(ListSkillGroupRequest request);

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
    CompletableFuture<ListTaskResponse> listTask(ListTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Call this operation to retrieve the details of a call task for an intelligent contact robot. You can also view the details on the <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a> &gt; <strong>Details</strong> page.</li>
     * <li>Before calling this operation, make sure that the intelligent contact robot you created has successfully started a task.</li>
     * <li>If you do not have a created call task, create and start a task on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page or by calling the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> and <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> operations.</li>
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
    CompletableFuture<ListTaskDetailResponse> listTaskDetail(ListTaskDetailRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can be called only during an intelligent outbound call. When you call this operation, set the <strong>CallId</strong> request parameter to the unique receipt ID of the ongoing call.</li>
     * <li><strong>CallId</strong> is the <strong>CallId</strong> parameter returned by the <a href="https://help.aliyun.com/document_detail/2718012.html">LlmSmartCallFullDuplex</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of LlmFullDuplexCallOperate  LlmFullDuplexCallOperateRequest
     * @return LlmFullDuplexCallOperateResponse
     */
    CompletableFuture<LlmFullDuplexCallOperateResponse> llmFullDuplexCallOperate(LlmFullDuplexCallOperateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Each API invocation supports adding only one called number. If you have multiple called numbers, invoke the API multiple times.</li>
     * <li>Before initiating an intelligent call based on an LLM, ensure that you have created an LLM application in the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Application Management</a> interface and have successfully requested a real number in the Voice Service <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Number Management</a> interface.</li>
     * </ul>
     * 
     * @param request the request parameters of LlmSmartCall  LlmSmartCallRequest
     * @return LlmSmartCallResponse
     */
    CompletableFuture<LlmSmartCallResponse> llmSmartCall(LlmSmartCallRequest request);

    /**
     * @param request the request parameters of LlmSmartCallEncrypt  LlmSmartCallEncryptRequest
     * @return LlmSmartCallEncryptResponse
     */
    CompletableFuture<LlmSmartCallEncryptResponse> llmSmartCallEncrypt(LlmSmartCallEncryptRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Before calling this operation, make sure that you have configured the ASR callback URL.</li>
     * <li>This operation is available only to users whose UIDs are added to the whitelist.</li>
     * <li>The request rate limit for a single user is 100 QPS.</li>
     * <li><code>CalledNumber</code> and <code>CallerNumber</code> are required parameters that specify the called number and the calling number, respectively.</li>
     * <li>Optional parameters such as <code>StartWordParam</code>, <code>TtsVoiceCode</code>, <code>TtsSpeed</code>, and <code>TtsVolume</code> allow you to customize the call experience. If these parameters are not specified, the default settings of the application are used.</li>
     * <li>The <code>SessionTimeout</code> parameter specifies the maximum call duration in seconds. The call is automatically ended when the specified duration is exceeded. For the default value and valid range, refer to the relevant documentation.</li>
     * <li>The <code>OutId</code> field can be used to track a unique identifier in an external system. The value must be 1 to 32 bytes in length.</li>
     * </ul>
     * 
     * @param request the request parameters of LlmSmartCallFullDuplex  LlmSmartCallFullDuplexRequest
     * @return LlmSmartCallFullDuplexResponse
     */
    CompletableFuture<LlmSmartCallFullDuplexResponse> llmSmartCallFullDuplex(LlmSmartCallFullDuplexRequest request);

    /**
     * @param request the request parameters of MakeCall  MakeCallRequest
     * @return MakeCallResponse
     */
    CompletableFuture<MakeCallResponse> makeCall(MakeCallRequest request);

    /**
     * @param request the request parameters of MakeDoubleCall  MakeDoubleCallRequest
     * @return MakeDoubleCallResponse
     */
    CompletableFuture<MakeDoubleCallResponse> makeDoubleCall(MakeDoubleCallRequest request);

    /**
     * @param request the request parameters of PageQueryAgentList  PageQueryAgentListRequest
     * @return PageQueryAgentListResponse
     */
    CompletableFuture<PageQueryAgentListResponse> pageQueryAgentList(PageQueryAgentListRequest request);

    /**
     * @param request the request parameters of PageQueryAgentListNew  PageQueryAgentListNewRequest
     * @return PageQueryAgentListNewResponse
     */
    CompletableFuture<PageQueryAgentListNewResponse> pageQueryAgentListNew(PageQueryAgentListNewRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before querying call task details, make sure that you have created a call task.</li>
     * <li>If you have not created a call task, create one on the <strong>Call Task Management</strong> page or by calling the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryAiCallDetailPage  QueryAiCallDetailPageRequest
     * @return QueryAiCallDetailPageResponse
     */
    CompletableFuture<QueryAiCallDetailPageResponse> queryAiCallDetailPage(QueryAiCallDetailPageRequest request);

    /**
     * @param request the request parameters of QueryAiCallTaskDetail  QueryAiCallTaskDetailRequest
     * @return QueryAiCallTaskDetailResponse
     */
    CompletableFuture<QueryAiCallTaskDetailResponse> queryAiCallTaskDetail(QueryAiCallTaskDetailRequest request);

    /**
     * @param request the request parameters of QueryAiCallTaskPage  QueryAiCallTaskPageRequest
     * @return QueryAiCallTaskPageResponse
     */
    CompletableFuture<QueryAiCallTaskPageResponse> queryAiCallTaskPage(QueryAiCallTaskPageRequest request);

    /**
     * @param request the request parameters of QueryAiVoiceAgentDetail  QueryAiVoiceAgentDetailRequest
     * @return QueryAiVoiceAgentDetailResponse
     */
    CompletableFuture<QueryAiVoiceAgentDetailResponse> queryAiVoiceAgentDetail(QueryAiVoiceAgentDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>This API retrieves the details of a communication agent.</li>
     * <li>If you do not specify <code>BranchId</code> and <code>VersionId</code>, the API returns the configuration for the latest published version on the effective branch. If the effective branch only contains a draft version, no configuration is returned.</li>
     * <li>If you specify only <code>BranchId</code>, the API returns the configuration for the latest published version on the specified branch. If the specified branch only contains a draft version, no configuration is returned.</li>
     * <li>If you specify both <code>BranchId</code> and <code>VersionId</code>, the API returns the configuration for the specified version.</li>
     * <li>When <code>BranchDeployStatus</code> is <code>1</code> (branch deployed) and <code>VersionPublishStatus</code> is <code>1</code> (version published), imported outbound tasks use the configuration of this branch.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryAiVoiceAgentDetailNew  QueryAiVoiceAgentDetailNewRequest
     * @return QueryAiVoiceAgentDetailNewResponse
     */
    CompletableFuture<QueryAiVoiceAgentDetailNewResponse> queryAiVoiceAgentDetailNew(QueryAiVoiceAgentDetailNewRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API retrieves call details. You can also view these details on the <strong>call task management</strong> &gt; <strong>details</strong> &gt; <strong>execution history</strong> &gt; <strong>completed</strong> &gt; <strong>call details</strong> page.</li>
     * <li>Before calling this API, make sure you have created a call task and imported called number data.</li>
     * <li>You can create a call task and import called number data either on the <strong>call task management</strong> page or by using the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> and <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> APIs.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryConversationDetailInfo  QueryConversationDetailInfoRequest
     * @return QueryConversationDetailInfoResponse
     */
    CompletableFuture<QueryConversationDetailInfoResponse> queryConversationDetailInfo(QueryConversationDetailInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can use this operation to query call details. You can also view call details in the <strong>Call Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>Execution Records</strong> &gt; <strong>Completed</strong> &gt; <strong>Call Details</strong> console.</li>
     * <li>Before calling this operation, make sure that you have created a call task and imported callee data.</li>
     * <li>If you do not have a created call task, create a call task and import callee data in the <strong>Call Task Management</strong> console, or use the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> and <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operations to create a call task and import callee data.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryConversationDetailInfoNew  QueryConversationDetailInfoNewRequest
     * @return QueryConversationDetailInfoNewResponse
     */
    CompletableFuture<QueryConversationDetailInfoNewResponse> queryConversationDetailInfoNew(QueryConversationDetailInfoNewRequest request);

    /**
     * @param request the request parameters of QueryHotlineInQueue  QueryHotlineInQueueRequest
     * @return QueryHotlineInQueueResponse
     */
    CompletableFuture<QueryHotlineInQueueResponse> queryHotlineInQueue(QueryHotlineInQueueRequest request);

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
    CompletableFuture<QueryHotlineNumberResponse> queryHotlineNumber(QueryHotlineNumberRequest request);

    /**
     * @param request the request parameters of QueryInboundCallId  QueryInboundCallIdRequest
     * @return QueryInboundCallIdResponse
     */
    CompletableFuture<QueryInboundCallIdResponse> queryInboundCallId(QueryInboundCallIdRequest request);

    /**
     * @param request the request parameters of QueryOutboundTask  QueryOutboundTaskRequest
     * @return QueryOutboundTaskResponse
     */
    CompletableFuture<QueryOutboundTaskResponse> queryOutboundTask(QueryOutboundTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This API allows you to query information such as the display name, description, channel type, and ID of skill groups. For details, see <a href="#api-detail-40">Response Parameters</a>.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QuerySkillGroups  QuerySkillGroupsRequest
     * @return QuerySkillGroupsResponse
     */
    CompletableFuture<QuerySkillGroupsResponse> querySkillGroups(QuerySkillGroupsRequest request);

    /**
     * @param request the request parameters of QueryTaskDetail  QueryTaskDetailRequest
     * @return QueryTaskDetailResponse
     */
    CompletableFuture<QueryTaskDetailResponse> queryTaskDetail(QueryTaskDetailRequest request);

    /**
     * @param request the request parameters of QueryTickets  QueryTicketsRequest
     * @return QueryTicketsResponse
     */
    CompletableFuture<QueryTicketsResponse> queryTickets(QueryTicketsRequest request);

    /**
     * <b>description</b> :
     * <p>This API allows you to query contact data such as contact status, session recipient, agent name, contact channel, satisfaction rating, and evaluation status. For details, see <a href="#api-detail-40">Response parameters</a>.  </p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.  </li>
     * <li>API frequency: 50 queries per second (QPS).  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryTouchList  QueryTouchListRequest
     * @return QueryTouchListResponse
     */
    CompletableFuture<QueryTouchListResponse> queryTouchList(QueryTouchListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you need to provide agent or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * <li>You can invoke <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-listagentbyskillgroupid">ListAgentBySkillGroupId</a> to retrieve agent information under a skill group and verify whether the removal aligns with your expectations.</li>
     * <li>If you accidentally remove an agent, you can invoke <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-updateagent">UpdateAgent</a> to update the agent data and reassign the skill group to the agent.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 50 times/second.</li>
     * <li>API-wide invocation frequency: 100 times/second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RemoveAgentFromSkillGroup  RemoveAgentFromSkillGroupRequest
     * @return RemoveAgentFromSkillGroupResponse
     */
    CompletableFuture<RemoveAgentFromSkillGroupResponse> removeAgentFromSkillGroup(RemoveAgentFromSkillGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deletion is a sensitive operation. Proceed with caution.  </li>
     * <li>Before deletion, confirm the AICCS instance ID and the skill group ID to be deleted. Refer to the guidance in <a href="#api-detail-35">Request Parameters</a> for details on how to obtain them.  </li>
     * <li>After deletion, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API to verify the skill group status.  </li>
     * <li>If you accidentally delete a skill group, you can recreate it by invoking the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-createskillgroup">CreateSkillGroup</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RemoveSkillGroup  RemoveSkillGroupRequest
     * @return RemoveSkillGroupResponse
     */
    CompletableFuture<RemoveSkillGroupResponse> removeSkillGroup(RemoveSkillGroupRequest request);

    /**
     * @param request the request parameters of ResetHotlineNumber  ResetHotlineNumberRequest
     * @return ResetHotlineNumberResponse
     */
    CompletableFuture<ResetHotlineNumberResponse> resetHotlineNumber(ResetHotlineNumberRequest request);

    /**
     * @param request the request parameters of RestartOutboundTask  RestartOutboundTaskRequest
     * @return RestartOutboundTaskResponse
     */
    CompletableFuture<RestartOutboundTaskResponse> restartOutboundTask(RestartOutboundTaskRequest request);

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
    CompletableFuture<RobotCallResponse> robotCall(RobotCallRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The following characters cannot appear in the intelligent interactive voice response SendCcoSmartCall callback: <code>@ = : &quot;&quot; $ { } ^ * ￥</code>.</li>
     * <li>After you invoke this operation, the <strong>Data</strong> response parameter returns the unique receipt ID for this call, which can be used to invoke the <a href="https://help.aliyun.com/document_detail/2718013.html">SendCcoSmartCallOperate</a> operation.</li>
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
     * @param request the request parameters of SendCcoSmartCall  SendCcoSmartCallRequest
     * @return SendCcoSmartCallResponse
     */
    CompletableFuture<SendCcoSmartCallResponse> sendCcoSmartCall(SendCcoSmartCallRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API can be successfully invoked only during an ongoing Intelligent Outbound Call. When invoking it, note that the <strong>CallId</strong> in the request parameters must be set to the unique receipt ID of the active call.  </li>
     * <li>The <strong>CallId</strong> is the <strong>Data</strong> parameter returned when you invoke the <a href="https://help.aliyun.com/document_detail/2718012.html">SendCcoSmartCall</a> API.</li>
     * </ul>
     * 
     * @param request the request parameters of SendCcoSmartCallOperate  SendCcoSmartCallOperateRequest
     * @return SendCcoSmartCallOperateResponse
     */
    CompletableFuture<SendCcoSmartCallOperateResponse> sendCcoSmartCallOperate(SendCcoSmartCallOperateRequest request);

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
    CompletableFuture<SendHotlineHeartBeatResponse> sendHotlineHeartBeat(SendHotlineHeartBeatRequest request);

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
    CompletableFuture<StartAiCallTaskResponse> startAiCallTask(StartAiCallTaskRequest request);

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
    CompletableFuture<StartAiOutboundTaskResponse> startAiOutboundTask(StartAiOutboundTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StartCall  StartCallRequest
     * @return StartCallResponse
     */
    CompletableFuture<StartCallResponse> startCall(StartCallRequest request);

    /**
     * @param request the request parameters of StartCallV2  StartCallV2Request
     * @return StartCallV2Response
     */
    CompletableFuture<StartCallV2Response> startCallV2(StartCallV2Request request);

    /**
     * @param request the request parameters of StartChatWork  StartChatWorkRequest
     * @return StartChatWorkResponse
     */
    CompletableFuture<StartChatWorkResponse> startChatWork(StartChatWorkRequest request);

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
    CompletableFuture<StartHotlineServiceResponse> startHotlineService(StartHotlineServiceRequest request);

    /**
     * @param request the request parameters of StartMicroOutbound  StartMicroOutboundRequest
     * @return StartMicroOutboundResponse
     */
    CompletableFuture<StartMicroOutboundResponse> startMicroOutbound(StartMicroOutboundRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to start a successfully created Intelligent Contact Robot calling job, or manually start the job on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page.</li>
     * <li>Before invoking this API, ensure that you already have a successfully created Intelligent Contact Robot calling job.</li>
     * <li>If you do not have a successfully created Intelligent Contact Robot outbound calling job, you can click to create a job on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page or create one by using the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> API.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StartTask  StartTaskRequest
     * @return StartTaskResponse
     */
    CompletableFuture<StartTaskResponse> startTask(StartTaskRequest request);

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
    CompletableFuture<StopAiCallTaskResponse> stopAiCallTask(StopAiCallTaskRequest request);

    /**
     * <b>description</b> :
     * <p>After pausing an outbound calling job, you can invoke the <a href="https://help.aliyun.com/document_detail/2718027.html">StartAiOutboundTask</a> API to restart it.</p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.</li>
     * <li>API invocation frequency: 20 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StopAiOutboundTask  StopAiOutboundTaskRequest
     * @return StopAiOutboundTaskResponse
     */
    CompletableFuture<StopAiOutboundTaskResponse> stopAiOutboundTask(StopAiOutboundTaskRequest request);

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
    CompletableFuture<StopTaskResponse> stopTask(StopTaskRequest request);

    /**
     * @param request the request parameters of SubmitAudioNote  SubmitAudioNoteRequest
     * @return SubmitAudioNoteResponse
     */
    CompletableFuture<SubmitAudioNoteResponse> submitAudioNote(SubmitAudioNoteRequest request);

    /**
     * <b>description</b> :
     * <p>If the break ends and you need to resume hotline service, you can invoke the <a href="https://help.aliyun.com/document_detail/2718045.html">StartHotlineService</a> API.</p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SuspendHotlineService  SuspendHotlineServiceRequest
     * @return SuspendHotlineServiceResponse
     */
    CompletableFuture<SuspendHotlineServiceResponse> suspendHotlineService(SuspendHotlineServiceRequest request);

    /**
     * @param request the request parameters of SuspendOutboundTask  SuspendOutboundTaskRequest
     * @return SuspendOutboundTaskResponse
     */
    CompletableFuture<SuspendOutboundTaskResponse> suspendOutboundTask(SuspendOutboundTaskRequest request);

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
    CompletableFuture<TerminateAiOutboundTaskResponse> terminateAiOutboundTask(TerminateAiOutboundTaskRequest request);

    /**
     * @param request the request parameters of TestLargeModel  TestLargeModelRequest
     * @return TestLargeModelResponse
     */
    CompletableFuture<TestLargeModelResponse> testLargeModel(TestLargeModelRequest request);

    /**
     * @param request the request parameters of TransferCallToSkillGroup  TransferCallToSkillGroupRequest
     * @return TransferCallToSkillGroupResponse
     */
    CompletableFuture<TransferCallToSkillGroupResponse> transferCallToSkillGroup(TransferCallToSkillGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, we recommend that you confirm your Artificial Intelligence Cloud Call Service (AICCS) instance ID. For guidance on how to obtain it, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>After the update, you can invoke the <a href="https://help.aliyun.com/document_detail/2717961.html">GetAgent</a> API to confirm whether the update meets your expectations.<blockquote>
     * <p>Currently, only the display name and assigned skill groups can be modified.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API-wide invocation frequency: 100 queries per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Before updating the configuration of a call task, make sure that the task status is stopped.</p>
     * 
     * @param request the request parameters of UpdateAiCallTask  UpdateAiCallTaskRequest
     * @return UpdateAiCallTaskResponse
     */
    CompletableFuture<UpdateAiCallTaskResponse> updateAiCallTask(UpdateAiCallTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This API supports updating information such as the task name, task description, outbound caller number, and skill group ID. For details, see <a href="#api-detail-35">Request Parameters</a>.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 20 times per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAiOutboundTask  UpdateAiOutboundTaskRequest
     * @return UpdateAiOutboundTaskResponse
     */
    CompletableFuture<UpdateAiOutboundTaskResponse> updateAiOutboundTask(UpdateAiOutboundTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API supports updating only the department name and does not support updating the department ID.  </li>
     * <li>Before invoking this API, we recommend that you confirm the AICCS instance ID and department ID. For guidance on how to obtain them, see the instructions in <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>After the update is complete, you can invoke the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> API to confirm whether the department information matches your expectations.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API-wide invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDepartment  UpdateDepartmentRequest
     * @return UpdateDepartmentResponse
     */
    CompletableFuture<UpdateDepartmentResponse> updateDepartment(UpdateDepartmentRequest request);

    /**
     * @param request the request parameters of UpdateLargeModel  UpdateLargeModelRequest
     * @return UpdateLargeModelResponse
     */
    CompletableFuture<UpdateLargeModelResponse> updateLargeModel(UpdateLargeModelRequest request);

    /**
     * @param request the request parameters of UpdateModelApplication  UpdateModelApplicationRequest
     * @return UpdateModelApplicationResponse
     */
    CompletableFuture<UpdateModelApplicationResponse> updateModelApplication(UpdateModelApplicationRequest request);

    /**
     * @param request the request parameters of UpdateOuterAccount  UpdateOuterAccountRequest
     * @return UpdateOuterAccountResponse
     */
    CompletableFuture<UpdateOuterAccountResponse> updateOuterAccount(UpdateOuterAccountRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API does not support updating the skill group ID or skill group name.  </li>
     * <li>After the update, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API to query the skill group information.  </li>
     * <li>If you need to provide the AICCS instance ID and skill group ID, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user call frequency: No rate limiting.</li>
     * <li>API call frequency: 1000 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSkillGroup  UpdateSkillGroupRequest
     * @return UpdateSkillGroupResponse
     */
    CompletableFuture<UpdateSkillGroupResponse> updateSkillGroup(UpdateSkillGroupRequest request);

}
