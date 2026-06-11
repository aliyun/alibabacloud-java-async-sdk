// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.airegistry20260317.models.*;
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
     * @param request the request parameters of CreateNamespace  CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
     * @param request the request parameters of CreatePrompt  CreatePromptRequest
     * @return CreatePromptResponse
     */
    CompletableFuture<CreatePromptResponse> createPrompt(CreatePromptRequest request);

    /**
     * @param request the request parameters of CreatePromptVersion  CreatePromptVersionRequest
     * @return CreatePromptVersionResponse
     */
    CompletableFuture<CreatePromptVersionResponse> createPromptVersion(CreatePromptVersionRequest request);

    /**
     * @param request the request parameters of CreateSkillDraft  CreateSkillDraftRequest
     * @return CreateSkillDraftResponse
     */
    CompletableFuture<CreateSkillDraftResponse> createSkillDraft(CreateSkillDraftRequest request);

    /**
     * @param request the request parameters of DeleteNamespace  DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    /**
     * @param request the request parameters of DeletePrompt  DeletePromptRequest
     * @return DeletePromptResponse
     */
    CompletableFuture<DeletePromptResponse> deletePrompt(DeletePromptRequest request);

    /**
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request);

    /**
     * @param request the request parameters of DownloadSkillVersionViaOss  DownloadSkillVersionViaOssRequest
     * @return DownloadSkillVersionViaOssResponse
     */
    CompletableFuture<DownloadSkillVersionViaOssResponse> downloadSkillVersionViaOss(DownloadSkillVersionViaOssRequest request);

    /**
     * @param request the request parameters of ForcePublishSkillVersion  ForcePublishSkillVersionRequest
     * @return ForcePublishSkillVersionResponse
     */
    CompletableFuture<ForcePublishSkillVersionResponse> forcePublishSkillVersion(ForcePublishSkillVersionRequest request);

    /**
     * @param request the request parameters of GetNamespace  GetNamespaceRequest
     * @return GetNamespaceResponse
     */
    CompletableFuture<GetNamespaceResponse> getNamespace(GetNamespaceRequest request);

    /**
     * @param request the request parameters of GetPrompt  GetPromptRequest
     * @return GetPromptResponse
     */
    CompletableFuture<GetPromptResponse> getPrompt(GetPromptRequest request);

    /**
     * @param request the request parameters of GetPromptVersion  GetPromptVersionRequest
     * @return GetPromptVersionResponse
     */
    CompletableFuture<GetPromptVersionResponse> getPromptVersion(GetPromptVersionRequest request);

    /**
     * @param request the request parameters of GetSkillDetail  GetSkillDetailRequest
     * @return GetSkillDetailResponse
     */
    CompletableFuture<GetSkillDetailResponse> getSkillDetail(GetSkillDetailRequest request);

    /**
     * @param request the request parameters of GetSkillImportFileUrl  GetSkillImportFileUrlRequest
     * @return GetSkillImportFileUrlResponse
     */
    CompletableFuture<GetSkillImportFileUrlResponse> getSkillImportFileUrl(GetSkillImportFileUrlRequest request);

    /**
     * @param request the request parameters of GetSkillVersionDetail  GetSkillVersionDetailRequest
     * @return GetSkillVersionDetailResponse
     */
    CompletableFuture<GetSkillVersionDetailResponse> getSkillVersionDetail(GetSkillVersionDetailRequest request);

    /**
     * @param request the request parameters of ListNamespaces  ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    /**
     * @param request the request parameters of ListPromptVersions  ListPromptVersionsRequest
     * @return ListPromptVersionsResponse
     */
    CompletableFuture<ListPromptVersionsResponse> listPromptVersions(ListPromptVersionsRequest request);

    /**
     * @param request the request parameters of ListPrompts  ListPromptsRequest
     * @return ListPromptsResponse
     */
    CompletableFuture<ListPromptsResponse> listPrompts(ListPromptsRequest request);

    /**
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request);

    /**
     * @param request the request parameters of OfflineSkill  OfflineSkillRequest
     * @return OfflineSkillResponse
     */
    CompletableFuture<OfflineSkillResponse> offlineSkill(OfflineSkillRequest request);

    /**
     * @param request the request parameters of OnlineSkill  OnlineSkillRequest
     * @return OnlineSkillResponse
     */
    CompletableFuture<OnlineSkillResponse> onlineSkill(OnlineSkillRequest request);

    /**
     * @param request the request parameters of PublishSkillVersion  PublishSkillVersionRequest
     * @return PublishSkillVersionResponse
     */
    CompletableFuture<PublishSkillVersionResponse> publishSkillVersion(PublishSkillVersionRequest request);

    /**
     * @param request the request parameters of SubmitPromptVersion  SubmitPromptVersionRequest
     * @return SubmitPromptVersionResponse
     */
    CompletableFuture<SubmitPromptVersionResponse> submitPromptVersion(SubmitPromptVersionRequest request);

    /**
     * @param request the request parameters of SubmitSkillVersion  SubmitSkillVersionRequest
     * @return SubmitSkillVersionResponse
     */
    CompletableFuture<SubmitSkillVersionResponse> submitSkillVersion(SubmitSkillVersionRequest request);

    /**
     * @param request the request parameters of UpdateNamespace  UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     */
    CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request);

    /**
     * @param request the request parameters of UpdatePrompt  UpdatePromptRequest
     * @return UpdatePromptResponse
     */
    CompletableFuture<UpdatePromptResponse> updatePrompt(UpdatePromptRequest request);

    /**
     * @param request the request parameters of UpdatePromptVersion  UpdatePromptVersionRequest
     * @return UpdatePromptVersionResponse
     */
    CompletableFuture<UpdatePromptVersionResponse> updatePromptVersion(UpdatePromptVersionRequest request);

    /**
     * @param request the request parameters of UpdateSkillBizTags  UpdateSkillBizTagsRequest
     * @return UpdateSkillBizTagsResponse
     */
    CompletableFuture<UpdateSkillBizTagsResponse> updateSkillBizTags(UpdateSkillBizTagsRequest request);

    /**
     * @param request the request parameters of UpdateSkillDraft  UpdateSkillDraftRequest
     * @return UpdateSkillDraftResponse
     */
    CompletableFuture<UpdateSkillDraftResponse> updateSkillDraft(UpdateSkillDraftRequest request);

    /**
     * @param request the request parameters of UpdateSkillLabels  UpdateSkillLabelsRequest
     * @return UpdateSkillLabelsResponse
     */
    CompletableFuture<UpdateSkillLabelsResponse> updateSkillLabels(UpdateSkillLabelsRequest request);

    /**
     * @param request the request parameters of UpdateSkillScope  UpdateSkillScopeRequest
     * @return UpdateSkillScopeResponse
     */
    CompletableFuture<UpdateSkillScopeResponse> updateSkillScope(UpdateSkillScopeRequest request);

    /**
     * @param request the request parameters of UploadSkillViaOss  UploadSkillViaOssRequest
     * @return UploadSkillViaOssResponse
     */
    CompletableFuture<UploadSkillViaOssResponse> uploadSkillViaOss(UploadSkillViaOssRequest request);

}
