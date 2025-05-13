// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aiccs20230516.models.*;
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
     * @param request the request parameters of AddBlacklist  AddBlacklistRequest
     * @return AddBlacklistResponse
     */
    CompletableFuture<AddBlacklistResponse> addBlacklist(AddBlacklistRequest request);

    /**
     * @param request the request parameters of AddTask  AddTaskRequest
     * @return AddTaskResponse
     */
    CompletableFuture<AddTaskResponse> addTask(AddTaskRequest request);

    /**
     * @param request the request parameters of AgentCancelCall  AgentCancelCallRequest
     * @return AgentCancelCallResponse
     */
    CompletableFuture<AgentCancelCallResponse> agentCancelCall(AgentCancelCallRequest request);

    /**
     * @param request the request parameters of AgentRecoverCall  AgentRecoverCallRequest
     * @return AgentRecoverCallResponse
     */
    CompletableFuture<AgentRecoverCallResponse> agentRecoverCall(AgentRecoverCallRequest request);

    /**
     * @param request the request parameters of Details  DetailsRequest
     * @return DetailsResponse
     */
    CompletableFuture<DetailsResponse> details(DetailsRequest request);

    /**
     * @param request the request parameters of EditTask  EditTaskRequest
     * @return EditTaskResponse
     */
    CompletableFuture<EditTaskResponse> editTask(EditTaskRequest request);

    /**
     * @param request the request parameters of ImportNumber  ImportNumberRequest
     * @return ImportNumberResponse
     */
    CompletableFuture<ImportNumberResponse> importNumber(ImportNumberRequest request);

    /**
     * @param request the request parameters of ImportNumberV2  ImportNumberV2Request
     * @return ImportNumberV2Response
     */
    CompletableFuture<ImportNumberV2Response> importNumberV2(ImportNumberV2Request request);

    /**
     * @param request the request parameters of Page  PageRequest
     * @return PageResponse
     */
    CompletableFuture<PageResponse> page(PageRequest request);

    /**
     * @param request the request parameters of SmsTemplateCreate  SmsTemplateCreateRequest
     * @return SmsTemplateCreateResponse
     */
    CompletableFuture<SmsTemplateCreateResponse> smsTemplateCreate(SmsTemplateCreateRequest request);

    /**
     * @param request the request parameters of SmsTemplatePageList  SmsTemplatePageListRequest
     * @return SmsTemplatePageListResponse
     */
    CompletableFuture<SmsTemplatePageListResponse> smsTemplatePageList(SmsTemplatePageListRequest request);

    /**
     * @param request the request parameters of TaskCallChats  TaskCallChatsRequest
     * @return TaskCallChatsResponse
     */
    CompletableFuture<TaskCallChatsResponse> taskCallChats(TaskCallChatsRequest request);

    /**
     * @param request the request parameters of TaskCallInfo  TaskCallInfoRequest
     * @return TaskCallInfoResponse
     */
    CompletableFuture<TaskCallInfoResponse> taskCallInfo(TaskCallInfoRequest request);

    /**
     * @param request the request parameters of TaskCallList  TaskCallListRequest
     * @return TaskCallListResponse
     */
    CompletableFuture<TaskCallListResponse> taskCallList(TaskCallListRequest request);

    /**
     * @param request the request parameters of TaskCancelCall  TaskCancelCallRequest
     * @return TaskCancelCallResponse
     */
    CompletableFuture<TaskCancelCallResponse> taskCancelCall(TaskCancelCallRequest request);

    /**
     * @param request the request parameters of TaskList  TaskListRequest
     * @return TaskListResponse
     */
    CompletableFuture<TaskListResponse> taskList(TaskListRequest request);

    /**
     * @param request the request parameters of TaskRecoverCall  TaskRecoverCallRequest
     * @return TaskRecoverCallResponse
     */
    CompletableFuture<TaskRecoverCallResponse> taskRecoverCall(TaskRecoverCallRequest request);

    /**
     * @param request the request parameters of TemplateList  TemplateListRequest
     * @return TemplateListResponse
     */
    CompletableFuture<TemplateListResponse> templateList(TemplateListRequest request);

    /**
     * @param request the request parameters of UpdateAgentStatus  UpdateAgentStatusRequest
     * @return UpdateAgentStatusResponse
     */
    CompletableFuture<UpdateAgentStatusResponse> updateAgentStatus(UpdateAgentStatusRequest request);

    /**
     * @param request the request parameters of UpdateTaskCustomer  UpdateTaskCustomerRequest
     * @return UpdateTaskCustomerResponse
     */
    CompletableFuture<UpdateTaskCustomerResponse> updateTaskCustomer(UpdateTaskCustomerRequest request);

}
