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

    /**
     * @param request the request parameters of AuditPublicTemplateRegistration  AuditPublicTemplateRegistrationRequest
     * @return AuditPublicTemplateRegistrationResponse
     */
    CompletableFuture<AuditPublicTemplateRegistrationResponse> auditPublicTemplateRegistration(AuditPublicTemplateRegistrationRequest request);

    /**
     * @param request the request parameters of CreateAction  CreateActionRequest
     * @return CreateActionResponse
     */
    CompletableFuture<CreateActionResponse> createAction(CreateActionRequest request);

    /**
     * @param request the request parameters of CreatePublicParameter  CreatePublicParameterRequest
     * @return CreatePublicParameterResponse
     */
    CompletableFuture<CreatePublicParameterResponse> createPublicParameter(CreatePublicParameterRequest request);

    /**
     * @param request the request parameters of CreatePublicPatchBaseline  CreatePublicPatchBaselineRequest
     * @return CreatePublicPatchBaselineResponse
     */
    CompletableFuture<CreatePublicPatchBaselineResponse> createPublicPatchBaseline(CreatePublicPatchBaselineRequest request);

    /**
     * @param request the request parameters of CreatePublicTemplate  CreatePublicTemplateRequest
     * @return CreatePublicTemplateResponse
     */
    CompletableFuture<CreatePublicTemplateResponse> createPublicTemplate(CreatePublicTemplateRequest request);

    /**
     * @param request the request parameters of DeleteFailureMsg  DeleteFailureMsgRequest
     * @return DeleteFailureMsgResponse
     */
    CompletableFuture<DeleteFailureMsgResponse> deleteFailureMsg(DeleteFailureMsgRequest request);

    /**
     * @param request the request parameters of DeletePublicParameter  DeletePublicParameterRequest
     * @return DeletePublicParameterResponse
     */
    CompletableFuture<DeletePublicParameterResponse> deletePublicParameter(DeletePublicParameterRequest request);

    /**
     * @param request the request parameters of DeletePublicPatchBaseline  DeletePublicPatchBaselineRequest
     * @return DeletePublicPatchBaselineResponse
     */
    CompletableFuture<DeletePublicPatchBaselineResponse> deletePublicPatchBaseline(DeletePublicPatchBaselineRequest request);

    /**
     * @param request the request parameters of DeletePublicTemplate  DeletePublicTemplateRequest
     * @return DeletePublicTemplateResponse
     */
    CompletableFuture<DeletePublicTemplateResponse> deletePublicTemplate(DeletePublicTemplateRequest request);

    /**
     * @param request the request parameters of DoCheckResource  DoCheckResourceRequest
     * @return DoCheckResourceResponse
     */
    CompletableFuture<DoCheckResourceResponse> doCheckResource(DoCheckResourceRequest request);

    /**
     * @param request the request parameters of GetAction  GetActionRequest
     * @return GetActionResponse
     */
    CompletableFuture<GetActionResponse> getAction(GetActionRequest request);

    /**
     * @param request the request parameters of GetFlowControl  GetFlowControlRequest
     * @return GetFlowControlResponse
     */
    CompletableFuture<GetFlowControlResponse> getFlowControl(GetFlowControlRequest request);

    /**
     * @param request the request parameters of GetPublicParameter  GetPublicParameterRequest
     * @return GetPublicParameterResponse
     */
    CompletableFuture<GetPublicParameterResponse> getPublicParameter(GetPublicParameterRequest request);

    /**
     * @param request the request parameters of GetPublicPatchBaseline  GetPublicPatchBaselineRequest
     * @return GetPublicPatchBaselineResponse
     */
    CompletableFuture<GetPublicPatchBaselineResponse> getPublicPatchBaseline(GetPublicPatchBaselineRequest request);

    /**
     * @param request the request parameters of GetPublicTemplate  GetPublicTemplateRequest
     * @return GetPublicTemplateResponse
     */
    CompletableFuture<GetPublicTemplateResponse> getPublicTemplate(GetPublicTemplateRequest request);

    /**
     * @param request the request parameters of GetQuota  GetQuotaRequest
     * @return GetQuotaResponse
     */
    CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request);

    /**
     * @param request the request parameters of GetUserExecutionTemplate  GetUserExecutionTemplateRequest
     * @return GetUserExecutionTemplateResponse
     */
    CompletableFuture<GetUserExecutionTemplateResponse> getUserExecutionTemplate(GetUserExecutionTemplateRequest request);

    /**
     * @param request the request parameters of GetUserTemplate  GetUserTemplateRequest
     * @return GetUserTemplateResponse
     */
    CompletableFuture<GetUserTemplateResponse> getUserTemplate(GetUserTemplateRequest request);

    /**
     * @param request the request parameters of ListActions  ListActionsRequest
     * @return ListActionsResponse
     */
    CompletableFuture<ListActionsResponse> listActions(ListActionsRequest request);

    /**
     * @param request the request parameters of ListDefaultQuota  ListDefaultQuotaRequest
     * @return ListDefaultQuotaResponse
     */
    CompletableFuture<ListDefaultQuotaResponse> listDefaultQuota(ListDefaultQuotaRequest request);

    /**
     * @param request the request parameters of ListFailureMsgs  ListFailureMsgsRequest
     * @return ListFailureMsgsResponse
     */
    CompletableFuture<ListFailureMsgsResponse> listFailureMsgs(ListFailureMsgsRequest request);

    /**
     * @param request the request parameters of ListOOSLogs  ListOOSLogsRequest
     * @return ListOOSLogsResponse
     */
    CompletableFuture<ListOOSLogsResponse> listOOSLogs(ListOOSLogsRequest request);

    /**
     * @param request the request parameters of ListPublicParameters  ListPublicParametersRequest
     * @return ListPublicParametersResponse
     */
    CompletableFuture<ListPublicParametersResponse> listPublicParameters(ListPublicParametersRequest request);

    /**
     * @param request the request parameters of ListPublicPatchBaselines  ListPublicPatchBaselinesRequest
     * @return ListPublicPatchBaselinesResponse
     */
    CompletableFuture<ListPublicPatchBaselinesResponse> listPublicPatchBaselines(ListPublicPatchBaselinesRequest request);

    /**
     * @param request the request parameters of ListPublicTemplateRegistrations  ListPublicTemplateRegistrationsRequest
     * @return ListPublicTemplateRegistrationsResponse
     */
    CompletableFuture<ListPublicTemplateRegistrationsResponse> listPublicTemplateRegistrations(ListPublicTemplateRegistrationsRequest request);

    /**
     * @param request the request parameters of ListPublicTemplates  ListPublicTemplatesRequest
     * @return ListPublicTemplatesResponse
     */
    CompletableFuture<ListPublicTemplatesResponse> listPublicTemplates(ListPublicTemplatesRequest request);

    /**
     * @param request the request parameters of ListUserExecutionLogs  ListUserExecutionLogsRequest
     * @return ListUserExecutionLogsResponse
     */
    CompletableFuture<ListUserExecutionLogsResponse> listUserExecutionLogs(ListUserExecutionLogsRequest request);

    /**
     * @param request the request parameters of ListUserExecutions  ListUserExecutionsRequest
     * @return ListUserExecutionsResponse
     */
    CompletableFuture<ListUserExecutionsResponse> listUserExecutions(ListUserExecutionsRequest request);

    /**
     * @param request the request parameters of ListUserInstancePatchStates  ListUserInstancePatchStatesRequest
     * @return ListUserInstancePatchStatesResponse
     */
    CompletableFuture<ListUserInstancePatchStatesResponse> listUserInstancePatchStates(ListUserInstancePatchStatesRequest request);

    /**
     * @param request the request parameters of ListUserInstancePatches  ListUserInstancePatchesRequest
     * @return ListUserInstancePatchesResponse
     */
    CompletableFuture<ListUserInstancePatchesResponse> listUserInstancePatches(ListUserInstancePatchesRequest request);

    /**
     * @param request the request parameters of ListUserInventoryEntries  ListUserInventoryEntriesRequest
     * @return ListUserInventoryEntriesResponse
     */
    CompletableFuture<ListUserInventoryEntriesResponse> listUserInventoryEntries(ListUserInventoryEntriesRequest request);

    /**
     * @param request the request parameters of ListUserTaskExecutions  ListUserTaskExecutionsRequest
     * @return ListUserTaskExecutionsResponse
     */
    CompletableFuture<ListUserTaskExecutionsResponse> listUserTaskExecutions(ListUserTaskExecutionsRequest request);

    /**
     * @param request the request parameters of ListUserTemplates  ListUserTemplatesRequest
     * @return ListUserTemplatesResponse
     */
    CompletableFuture<ListUserTemplatesResponse> listUserTemplates(ListUserTemplatesRequest request);

    /**
     * @param request the request parameters of ResetTimerTriggerExecution  ResetTimerTriggerExecutionRequest
     * @return ResetTimerTriggerExecutionResponse
     */
    CompletableFuture<ResetTimerTriggerExecutionResponse> resetTimerTriggerExecution(ResetTimerTriggerExecutionRequest request);

    /**
     * @param request the request parameters of ResetUserExecution  ResetUserExecutionRequest
     * @return ResetUserExecutionResponse
     */
    CompletableFuture<ResetUserExecutionResponse> resetUserExecution(ResetUserExecutionRequest request);

    /**
     * @param request the request parameters of SetFlowControl  SetFlowControlRequest
     * @return SetFlowControlResponse
     */
    CompletableFuture<SetFlowControlResponse> setFlowControl(SetFlowControlRequest request);

    /**
     * @param request the request parameters of SetQuota  SetQuotaRequest
     * @return SetQuotaResponse
     */
    CompletableFuture<SetQuotaResponse> setQuota(SetQuotaRequest request);

    /**
     * @param request the request parameters of TerminateUserExecution  TerminateUserExecutionRequest
     * @return TerminateUserExecutionResponse
     */
    CompletableFuture<TerminateUserExecutionResponse> terminateUserExecution(TerminateUserExecutionRequest request);

    /**
     * @param request the request parameters of UpdateAction  UpdateActionRequest
     * @return UpdateActionResponse
     */
    CompletableFuture<UpdateActionResponse> updateAction(UpdateActionRequest request);

    /**
     * @param request the request parameters of UpdatePublicParameter  UpdatePublicParameterRequest
     * @return UpdatePublicParameterResponse
     */
    CompletableFuture<UpdatePublicParameterResponse> updatePublicParameter(UpdatePublicParameterRequest request);

    /**
     * @param request the request parameters of UpdatePublicPatchBaseline  UpdatePublicPatchBaselineRequest
     * @return UpdatePublicPatchBaselineResponse
     */
    CompletableFuture<UpdatePublicPatchBaselineResponse> updatePublicPatchBaseline(UpdatePublicPatchBaselineRequest request);

    /**
     * @param request the request parameters of UpdatePublicTemplate  UpdatePublicTemplateRequest
     * @return UpdatePublicTemplateResponse
     */
    CompletableFuture<UpdatePublicTemplateResponse> updatePublicTemplate(UpdatePublicTemplateRequest request);

    /**
     * @param request the request parameters of ValidatePublicTemplateContent  ValidatePublicTemplateContentRequest
     * @return ValidatePublicTemplateContentResponse
     */
    CompletableFuture<ValidatePublicTemplateContentResponse> validatePublicTemplateContent(ValidatePublicTemplateContentRequest request);

}
