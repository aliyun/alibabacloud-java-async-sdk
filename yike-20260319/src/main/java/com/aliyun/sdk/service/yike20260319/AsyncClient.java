// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yike20260319.models.*;
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
     * @param request the request parameters of AddYikeProductionMembers  AddYikeProductionMembersRequest
     * @return AddYikeProductionMembersResponse
     */
    CompletableFuture<AddYikeProductionMembersResponse> addYikeProductionMembers(AddYikeProductionMembersRequest request);

    /**
     * @param request the request parameters of AddYikeUserCredit  AddYikeUserCreditRequest
     * @return AddYikeUserCreditResponse
     */
    CompletableFuture<AddYikeUserCreditResponse> addYikeUserCredit(AddYikeUserCreditRequest request);

    /**
     * @param request the request parameters of BatchGetYikeAIAppJob  BatchGetYikeAIAppJobRequest
     * @return BatchGetYikeAIAppJobResponse
     */
    CompletableFuture<BatchGetYikeAIAppJobResponse> batchGetYikeAIAppJob(BatchGetYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of BatchGetYikeAssetMediaInfos  BatchGetYikeAssetMediaInfosRequest
     * @return BatchGetYikeAssetMediaInfosResponse
     */
    CompletableFuture<BatchGetYikeAssetMediaInfosResponse> batchGetYikeAssetMediaInfos(BatchGetYikeAssetMediaInfosRequest request);

    /**
     * @param request the request parameters of CreateYikeAssetUpload  CreateYikeAssetUploadRequest
     * @return CreateYikeAssetUploadResponse
     */
    CompletableFuture<CreateYikeAssetUploadResponse> createYikeAssetUpload(CreateYikeAssetUploadRequest request);

    /**
     * @param request the request parameters of CreateYikeProduction  CreateYikeProductionRequest
     * @return CreateYikeProductionResponse
     */
    CompletableFuture<CreateYikeProductionResponse> createYikeProduction(CreateYikeProductionRequest request);

    /**
     * @param request the request parameters of CreateYikeUser  CreateYikeUserRequest
     * @return CreateYikeUserResponse
     */
    CompletableFuture<CreateYikeUserResponse> createYikeUser(CreateYikeUserRequest request);

    /**
     * @param request the request parameters of CreateYikeWorkspace  CreateYikeWorkspaceRequest
     * @return CreateYikeWorkspaceResponse
     */
    CompletableFuture<CreateYikeWorkspaceResponse> createYikeWorkspace(CreateYikeWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteYikeAssetMediaInfos  DeleteYikeAssetMediaInfosRequest
     * @return DeleteYikeAssetMediaInfosResponse
     */
    CompletableFuture<DeleteYikeAssetMediaInfosResponse> deleteYikeAssetMediaInfos(DeleteYikeAssetMediaInfosRequest request);

    /**
     * @param request the request parameters of GetYikeAIAppJob  GetYikeAIAppJobRequest
     * @return GetYikeAIAppJobResponse
     */
    CompletableFuture<GetYikeAIAppJobResponse> getYikeAIAppJob(GetYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of GetYikeAgentJob  GetYikeAgentJobRequest
     * @return GetYikeAgentJobResponse
     */
    CompletableFuture<GetYikeAgentJobResponse> getYikeAgentJob(GetYikeAgentJobRequest request);

    /**
     * @param request the request parameters of GetYikeAssetMediaInfo  GetYikeAssetMediaInfoRequest
     * @return GetYikeAssetMediaInfoResponse
     */
    CompletableFuture<GetYikeAssetMediaInfoResponse> getYikeAssetMediaInfo(GetYikeAssetMediaInfoRequest request);

    /**
     * @param request the request parameters of GetYikeProjectExportJob  GetYikeProjectExportJobRequest
     * @return GetYikeProjectExportJobResponse
     */
    CompletableFuture<GetYikeProjectExportJobResponse> getYikeProjectExportJob(GetYikeProjectExportJobRequest request);

    /**
     * @param request the request parameters of GetYikePromptExpansionVoiceFixJob  GetYikePromptExpansionVoiceFixJobRequest
     * @return GetYikePromptExpansionVoiceFixJobResponse
     */
    CompletableFuture<GetYikePromptExpansionVoiceFixJobResponse> getYikePromptExpansionVoiceFixJob(GetYikePromptExpansionVoiceFixJobRequest request);

    /**
     * @param request the request parameters of GetYikeStoryboardJob  GetYikeStoryboardJobRequest
     * @return GetYikeStoryboardJobResponse
     */
    CompletableFuture<GetYikeStoryboardJobResponse> getYikeStoryboardJob(GetYikeStoryboardJobRequest request);

    /**
     * @param request the request parameters of GetYikeUser  GetYikeUserRequest
     * @return GetYikeUserResponse
     */
    CompletableFuture<GetYikeUserResponse> getYikeUser(GetYikeUserRequest request);

    /**
     * @param request the request parameters of GetYikeUserCredit  GetYikeUserCreditRequest
     * @return GetYikeUserCreditResponse
     */
    CompletableFuture<GetYikeUserCreditResponse> getYikeUserCredit(GetYikeUserCreditRequest request);

    /**
     * @param request the request parameters of GetYikeVoiceNarratorJob  GetYikeVoiceNarratorJobRequest
     * @return GetYikeVoiceNarratorJobResponse
     */
    CompletableFuture<GetYikeVoiceNarratorJobResponse> getYikeVoiceNarratorJob(GetYikeVoiceNarratorJobRequest request);

    /**
     * @param request the request parameters of ListYikeAssetFolders  ListYikeAssetFoldersRequest
     * @return ListYikeAssetFoldersResponse
     */
    CompletableFuture<ListYikeAssetFoldersResponse> listYikeAssetFolders(ListYikeAssetFoldersRequest request);

    /**
     * @param request the request parameters of ListYikeProductions  ListYikeProductionsRequest
     * @return ListYikeProductionsResponse
     */
    CompletableFuture<ListYikeProductionsResponse> listYikeProductions(ListYikeProductionsRequest request);

    /**
     * @param request the request parameters of ListYikeWorkspaces  ListYikeWorkspacesRequest
     * @return ListYikeWorkspacesResponse
     */
    CompletableFuture<ListYikeWorkspacesResponse> listYikeWorkspaces(ListYikeWorkspacesRequest request);

    /**
     * @param request the request parameters of PrecheckYikeAIAppJob  PrecheckYikeAIAppJobRequest
     * @return PrecheckYikeAIAppJobResponse
     */
    CompletableFuture<PrecheckYikeAIAppJobResponse> precheckYikeAIAppJob(PrecheckYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of RegisterYikeAssetMediaInfo  RegisterYikeAssetMediaInfoRequest
     * @return RegisterYikeAssetMediaInfoResponse
     */
    CompletableFuture<RegisterYikeAssetMediaInfoResponse> registerYikeAssetMediaInfo(RegisterYikeAssetMediaInfoRequest request);

    /**
     * @param request the request parameters of ResumeYikeStoryboardJob  ResumeYikeStoryboardJobRequest
     * @return ResumeYikeStoryboardJobResponse
     */
    CompletableFuture<ResumeYikeStoryboardJobResponse> resumeYikeStoryboardJob(ResumeYikeStoryboardJobRequest request);

    /**
     * @param request the request parameters of SetYikeCallbackConfig  SetYikeCallbackConfigRequest
     * @return SetYikeCallbackConfigResponse
     */
    CompletableFuture<SetYikeCallbackConfigResponse> setYikeCallbackConfig(SetYikeCallbackConfigRequest request);

    /**
     * @param request the request parameters of SetYikeUserRole  SetYikeUserRoleRequest
     * @return SetYikeUserRoleResponse
     */
    CompletableFuture<SetYikeUserRoleResponse> setYikeUserRole(SetYikeUserRoleRequest request);

    /**
     * @param request the request parameters of SubYikeUserCredit  SubYikeUserCreditRequest
     * @return SubYikeUserCreditResponse
     */
    CompletableFuture<SubYikeUserCreditResponse> subYikeUserCredit(SubYikeUserCreditRequest request);

    /**
     * @param request the request parameters of SubmitYikeAIAppJob  SubmitYikeAIAppJobRequest
     * @return SubmitYikeAIAppJobResponse
     */
    CompletableFuture<SubmitYikeAIAppJobResponse> submitYikeAIAppJob(SubmitYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of SubmitYikeAvatarNarratorJob  SubmitYikeAvatarNarratorJobRequest
     * @return SubmitYikeAvatarNarratorJobResponse
     */
    CompletableFuture<SubmitYikeAvatarNarratorJobResponse> submitYikeAvatarNarratorJob(SubmitYikeAvatarNarratorJobRequest request);

    /**
     * @param request the request parameters of SubmitYikeProjectExportJob  SubmitYikeProjectExportJobRequest
     * @return SubmitYikeProjectExportJobResponse
     */
    CompletableFuture<SubmitYikeProjectExportJobResponse> submitYikeProjectExportJob(SubmitYikeProjectExportJobRequest request);

    /**
     * @param request the request parameters of SubmitYikePromptExpansionVoiceFixJob  SubmitYikePromptExpansionVoiceFixJobRequest
     * @return SubmitYikePromptExpansionVoiceFixJobResponse
     */
    CompletableFuture<SubmitYikePromptExpansionVoiceFixJobResponse> submitYikePromptExpansionVoiceFixJob(SubmitYikePromptExpansionVoiceFixJobRequest request);

    /**
     * @param request the request parameters of SubmitYikeStoryboardJob  SubmitYikeStoryboardJobRequest
     * @return SubmitYikeStoryboardJobResponse
     */
    CompletableFuture<SubmitYikeStoryboardJobResponse> submitYikeStoryboardJob(SubmitYikeStoryboardJobRequest request);

    /**
     * @param request the request parameters of SubmitYikeVoiceNarratorJob  SubmitYikeVoiceNarratorJobRequest
     * @return SubmitYikeVoiceNarratorJobResponse
     */
    CompletableFuture<SubmitYikeVoiceNarratorJobResponse> submitYikeVoiceNarratorJob(SubmitYikeVoiceNarratorJobRequest request);

    /**
     * @param request the request parameters of UpdateYikeProduction  UpdateYikeProductionRequest
     * @return UpdateYikeProductionResponse
     */
    CompletableFuture<UpdateYikeProductionResponse> updateYikeProduction(UpdateYikeProductionRequest request);

    /**
     * @param request the request parameters of UpdateYikeProductionMemberAuth  UpdateYikeProductionMemberAuthRequest
     * @return UpdateYikeProductionMemberAuthResponse
     */
    CompletableFuture<UpdateYikeProductionMemberAuthResponse> updateYikeProductionMemberAuth(UpdateYikeProductionMemberAuthRequest request);

}
