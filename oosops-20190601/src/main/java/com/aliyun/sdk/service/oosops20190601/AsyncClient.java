// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.oosops20190601.models.*;
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

    CompletableFuture<AuditPublicTemplateRegistrationResponse> auditPublicTemplateRegistration(AuditPublicTemplateRegistrationRequest request);

    CompletableFuture<CreateActionResponse> createAction(CreateActionRequest request);

    CompletableFuture<CreatePublicParameterResponse> createPublicParameter(CreatePublicParameterRequest request);

    CompletableFuture<CreatePublicPatchBaselineResponse> createPublicPatchBaseline(CreatePublicPatchBaselineRequest request);

    CompletableFuture<CreatePublicTemplateResponse> createPublicTemplate(CreatePublicTemplateRequest request);

    CompletableFuture<DeleteFailureMsgResponse> deleteFailureMsg(DeleteFailureMsgRequest request);

    CompletableFuture<DeletePublicParameterResponse> deletePublicParameter(DeletePublicParameterRequest request);

    CompletableFuture<DeletePublicPatchBaselineResponse> deletePublicPatchBaseline(DeletePublicPatchBaselineRequest request);

    CompletableFuture<DeletePublicTemplateResponse> deletePublicTemplate(DeletePublicTemplateRequest request);

    CompletableFuture<DoCheckResourceResponse> doCheckResource(DoCheckResourceRequest request);

    CompletableFuture<GetActionResponse> getAction(GetActionRequest request);

    CompletableFuture<GetFlowControlResponse> getFlowControl(GetFlowControlRequest request);

    CompletableFuture<GetPublicParameterResponse> getPublicParameter(GetPublicParameterRequest request);

    CompletableFuture<GetPublicPatchBaselineResponse> getPublicPatchBaseline(GetPublicPatchBaselineRequest request);

    CompletableFuture<GetPublicTemplateResponse> getPublicTemplate(GetPublicTemplateRequest request);

    CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request);

    CompletableFuture<GetUserExecutionTemplateResponse> getUserExecutionTemplate(GetUserExecutionTemplateRequest request);

    CompletableFuture<GetUserTemplateResponse> getUserTemplate(GetUserTemplateRequest request);

    CompletableFuture<ListActionsResponse> listActions(ListActionsRequest request);

    CompletableFuture<ListDefaultQuotaResponse> listDefaultQuota(ListDefaultQuotaRequest request);

    CompletableFuture<ListFailureMsgsResponse> listFailureMsgs(ListFailureMsgsRequest request);

    CompletableFuture<ListOOSLogsResponse> listOOSLogs(ListOOSLogsRequest request);

    CompletableFuture<ListPublicParametersResponse> listPublicParameters(ListPublicParametersRequest request);

    CompletableFuture<ListPublicPatchBaselinesResponse> listPublicPatchBaselines(ListPublicPatchBaselinesRequest request);

    CompletableFuture<ListPublicTemplateRegistrationsResponse> listPublicTemplateRegistrations(ListPublicTemplateRegistrationsRequest request);

    CompletableFuture<ListPublicTemplatesResponse> listPublicTemplates(ListPublicTemplatesRequest request);

    CompletableFuture<ListUserExecutionLogsResponse> listUserExecutionLogs(ListUserExecutionLogsRequest request);

    CompletableFuture<ListUserExecutionsResponse> listUserExecutions(ListUserExecutionsRequest request);

    CompletableFuture<ListUserInstancePatchStatesResponse> listUserInstancePatchStates(ListUserInstancePatchStatesRequest request);

    CompletableFuture<ListUserInstancePatchesResponse> listUserInstancePatches(ListUserInstancePatchesRequest request);

    CompletableFuture<ListUserInventoryEntriesResponse> listUserInventoryEntries(ListUserInventoryEntriesRequest request);

    CompletableFuture<ListUserTaskExecutionsResponse> listUserTaskExecutions(ListUserTaskExecutionsRequest request);

    CompletableFuture<ListUserTemplatesResponse> listUserTemplates(ListUserTemplatesRequest request);

    CompletableFuture<ResetTimerTriggerExecutionResponse> resetTimerTriggerExecution(ResetTimerTriggerExecutionRequest request);

    CompletableFuture<ResetUserExecutionResponse> resetUserExecution(ResetUserExecutionRequest request);

    CompletableFuture<SetFlowControlResponse> setFlowControl(SetFlowControlRequest request);

    CompletableFuture<SetQuotaResponse> setQuota(SetQuotaRequest request);

    CompletableFuture<TerminateUserExecutionResponse> terminateUserExecution(TerminateUserExecutionRequest request);

    CompletableFuture<UpdateActionResponse> updateAction(UpdateActionRequest request);

    CompletableFuture<UpdatePublicParameterResponse> updatePublicParameter(UpdatePublicParameterRequest request);

    CompletableFuture<UpdatePublicPatchBaselineResponse> updatePublicPatchBaseline(UpdatePublicPatchBaselineRequest request);

    CompletableFuture<UpdatePublicTemplateResponse> updatePublicTemplate(UpdatePublicTemplateRequest request);

    CompletableFuture<ValidatePublicTemplateContentResponse> validatePublicTemplateContent(ValidatePublicTemplateContentRequest request);

}
