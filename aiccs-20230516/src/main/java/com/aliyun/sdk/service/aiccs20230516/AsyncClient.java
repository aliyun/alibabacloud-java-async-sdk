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

    CompletableFuture<AddBlacklistResponse> addBlacklist(AddBlacklistRequest request);

    CompletableFuture<AddTaskResponse> addTask(AddTaskRequest request);

    CompletableFuture<AgentCancelCallResponse> agentCancelCall(AgentCancelCallRequest request);

    CompletableFuture<AgentRecoverCallResponse> agentRecoverCall(AgentRecoverCallRequest request);

    CompletableFuture<DetailsResponse> details(DetailsRequest request);

    CompletableFuture<EditTaskResponse> editTask(EditTaskRequest request);

    CompletableFuture<ImportNumberResponse> importNumber(ImportNumberRequest request);

    CompletableFuture<PageResponse> page(PageRequest request);

    CompletableFuture<SmsTemplateCreateResponse> smsTemplateCreate(SmsTemplateCreateRequest request);

    CompletableFuture<SmsTemplatePageListResponse> smsTemplatePageList(SmsTemplatePageListRequest request);

    CompletableFuture<TaskCallChatsResponse> taskCallChats(TaskCallChatsRequest request);

    CompletableFuture<TaskCallInfoResponse> taskCallInfo(TaskCallInfoRequest request);

    CompletableFuture<TaskCallListResponse> taskCallList(TaskCallListRequest request);

    CompletableFuture<TaskCancelCallResponse> taskCancelCall(TaskCancelCallRequest request);

    CompletableFuture<TaskListResponse> taskList(TaskListRequest request);

    CompletableFuture<TaskRecoverCallResponse> taskRecoverCall(TaskRecoverCallRequest request);

    CompletableFuture<TemplateListResponse> templateList(TemplateListRequest request);

    CompletableFuture<UpdateAgentStatusResponse> updateAgentStatus(UpdateAgentStatusRequest request);

    CompletableFuture<UpdateTaskCustomerResponse> updateTaskCustomer(UpdateTaskCustomerRequest request);

}
