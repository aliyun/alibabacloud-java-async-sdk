// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.intelligentcreation20240313.models.*;
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
     * @param request the request parameters of AddTextFeedback  AddTextFeedbackRequest
     * @return AddTextFeedbackResponse
     */
    CompletableFuture<AddTextFeedbackResponse> addTextFeedback(AddTextFeedbackRequest request);

    /**
     * @param request the request parameters of BatchAddDocument  BatchAddDocumentRequest
     * @return BatchAddDocumentResponse
     */
    CompletableFuture<BatchAddDocumentResponse> batchAddDocument(BatchAddDocumentRequest request);

    /**
     * @param request the request parameters of BatchCreateAICoachTask  BatchCreateAICoachTaskRequest
     * @return BatchCreateAICoachTaskResponse
     */
    CompletableFuture<BatchCreateAICoachTaskResponse> batchCreateAICoachTask(BatchCreateAICoachTaskRequest request);

    /**
     * @param request the request parameters of BatchGetProjectTask  BatchGetProjectTaskRequest
     * @return BatchGetProjectTaskResponse
     */
    CompletableFuture<BatchGetProjectTaskResponse> batchGetProjectTask(BatchGetProjectTaskRequest request);

    /**
     * @param request the request parameters of BatchGetTrainTask  BatchGetTrainTaskRequest
     * @return BatchGetTrainTaskResponse
     */
    CompletableFuture<BatchGetTrainTaskResponse> batchGetTrainTask(BatchGetTrainTaskRequest request);

    /**
     * @param request the request parameters of BatchGetVideoClipTask  BatchGetVideoClipTaskRequest
     * @return BatchGetVideoClipTaskResponse
     */
    CompletableFuture<BatchGetVideoClipTaskResponse> batchGetVideoClipTask(BatchGetVideoClipTaskRequest request);

    /**
     * @param request the request parameters of BatchQueryIndividuationText  BatchQueryIndividuationTextRequest
     * @return BatchQueryIndividuationTextResponse
     */
    CompletableFuture<BatchQueryIndividuationTextResponse> batchQueryIndividuationText(BatchQueryIndividuationTextRequest request);

    /**
     * @param request the request parameters of CheckSession  CheckSessionRequest
     * @return CheckSessionResponse
     */
    CompletableFuture<CheckSessionResponse> checkSession(CheckSessionRequest request);

    /**
     * @param request the request parameters of CloseAICoachTaskSession  CloseAICoachTaskSessionRequest
     * @return CloseAICoachTaskSessionResponse
     */
    CompletableFuture<CloseAICoachTaskSessionResponse> closeAICoachTaskSession(CloseAICoachTaskSessionRequest request);

    /**
     * @param request the request parameters of CountText  CountTextRequest
     * @return CountTextResponse
     */
    CompletableFuture<CountTextResponse> countText(CountTextRequest request);

    /**
     * @param request the request parameters of CreateAICoachTask  CreateAICoachTaskRequest
     * @return CreateAICoachTaskResponse
     */
    CompletableFuture<CreateAICoachTaskResponse> createAICoachTask(CreateAICoachTaskRequest request);

    /**
     * @param request the request parameters of CreateAICoachTaskSession  CreateAICoachTaskSessionRequest
     * @return CreateAICoachTaskSessionResponse
     */
    CompletableFuture<CreateAICoachTaskSessionResponse> createAICoachTaskSession(CreateAICoachTaskSessionRequest request);

    /**
     * @param request the request parameters of CreateAnchor  CreateAnchorRequest
     * @return CreateAnchorResponse
     */
    CompletableFuture<CreateAnchorResponse> createAnchor(CreateAnchorRequest request);

    /**
     * @param request the request parameters of CreateIllustrationTask  CreateIllustrationTaskRequest
     * @return CreateIllustrationTaskResponse
     */
    CompletableFuture<CreateIllustrationTaskResponse> createIllustrationTask(CreateIllustrationTaskRequest request);

    /**
     * @param request the request parameters of CreateIndividuationProject  CreateIndividuationProjectRequest
     * @return CreateIndividuationProjectResponse
     */
    CompletableFuture<CreateIndividuationProjectResponse> createIndividuationProject(CreateIndividuationProjectRequest request);

    /**
     * @param request the request parameters of CreateIndividuationTextTask  CreateIndividuationTextTaskRequest
     * @return CreateIndividuationTextTaskResponse
     */
    CompletableFuture<CreateIndividuationTextTaskResponse> createIndividuationTextTask(CreateIndividuationTextTaskRequest request);

    /**
     * @param request the request parameters of CreateRealisticPortrait  CreateRealisticPortraitRequest
     * @return CreateRealisticPortraitResponse
     */
    CompletableFuture<CreateRealisticPortraitResponse> createRealisticPortrait(CreateRealisticPortraitRequest request);

    /**
     * @param request the request parameters of CreateTextTask  CreateTextTaskRequest
     * @return CreateTextTaskResponse
     */
    CompletableFuture<CreateTextTaskResponse> createTextTask(CreateTextTaskRequest request);

    /**
     * @param request the request parameters of CreateTrainTask  CreateTrainTaskRequest
     * @return CreateTrainTaskResponse
     */
    CompletableFuture<CreateTrainTaskResponse> createTrainTask(CreateTrainTaskRequest request);

    /**
     * @param request the request parameters of CreateVideoClipTask  CreateVideoClipTaskRequest
     * @return CreateVideoClipTaskResponse
     */
    CompletableFuture<CreateVideoClipTaskResponse> createVideoClipTask(CreateVideoClipTaskRequest request);

    /**
     * @param request the request parameters of DeleteIndividuationProject  DeleteIndividuationProjectRequest
     * @return DeleteIndividuationProjectResponse
     */
    CompletableFuture<DeleteIndividuationProjectResponse> deleteIndividuationProject(DeleteIndividuationProjectRequest request);

    /**
     * @param request the request parameters of DeleteIndividuationText  DeleteIndividuationTextRequest
     * @return DeleteIndividuationTextResponse
     */
    CompletableFuture<DeleteIndividuationTextResponse> deleteIndividuationText(DeleteIndividuationTextRequest request);

    /**
     * @param request the request parameters of DescribeDocument  DescribeDocumentRequest
     * @return DescribeDocumentResponse
     */
    CompletableFuture<DescribeDocumentResponse> describeDocument(DescribeDocumentRequest request);

    /**
     * @param request the request parameters of FinishAICoachTaskSession  FinishAICoachTaskSessionRequest
     * @return FinishAICoachTaskSessionResponse
     */
    CompletableFuture<FinishAICoachTaskSessionResponse> finishAICoachTaskSession(FinishAICoachTaskSessionRequest request);

    /**
     * @param request the request parameters of GetAICoachCheatDetection  GetAICoachCheatDetectionRequest
     * @return GetAICoachCheatDetectionResponse
     */
    CompletableFuture<GetAICoachCheatDetectionResponse> getAICoachCheatDetection(GetAICoachCheatDetectionRequest request);

    /**
     * @param request the request parameters of GetAICoachScript  GetAICoachScriptRequest
     * @return GetAICoachScriptResponse
     */
    CompletableFuture<GetAICoachScriptResponse> getAICoachScript(GetAICoachScriptRequest request);

    /**
     * @param request the request parameters of GetAICoachTaskSessionHistory  GetAICoachTaskSessionHistoryRequest
     * @return GetAICoachTaskSessionHistoryResponse
     */
    CompletableFuture<GetAICoachTaskSessionHistoryResponse> getAICoachTaskSessionHistory(GetAICoachTaskSessionHistoryRequest request);

    /**
     * @param request the request parameters of GetAICoachTaskSessionReport  GetAICoachTaskSessionReportRequest
     * @return GetAICoachTaskSessionReportResponse
     */
    CompletableFuture<GetAICoachTaskSessionReportResponse> getAICoachTaskSessionReport(GetAICoachTaskSessionReportRequest request);

    /**
     * @param request the request parameters of GetIllustration  GetIllustrationRequest
     * @return GetIllustrationResponse
     */
    CompletableFuture<GetIllustrationResponse> getIllustration(GetIllustrationRequest request);

    /**
     * @param request the request parameters of GetIllustrationTask  GetIllustrationTaskRequest
     * @return GetIllustrationTaskResponse
     */
    CompletableFuture<GetIllustrationTaskResponse> getIllustrationTask(GetIllustrationTaskRequest request);

    /**
     * @param request the request parameters of GetOssUploadToken  GetOssUploadTokenRequest
     * @return GetOssUploadTokenResponse
     */
    CompletableFuture<GetOssUploadTokenResponse> getOssUploadToken(GetOssUploadTokenRequest request);

    /**
     * @param request the request parameters of GetProjectTask  GetProjectTaskRequest
     * @return GetProjectTaskResponse
     */
    CompletableFuture<GetProjectTaskResponse> getProjectTask(GetProjectTaskRequest request);

    /**
     * @param request the request parameters of GetText  GetTextRequest
     * @return GetTextResponse
     */
    CompletableFuture<GetTextResponse> getText(GetTextRequest request);

    /**
     * @param request the request parameters of GetTextTask  GetTextTaskRequest
     * @return GetTextTaskResponse
     */
    CompletableFuture<GetTextTaskResponse> getTextTask(GetTextTaskRequest request);

    /**
     * @param request the request parameters of GetTextTemplate  GetTextTemplateRequest
     * @return GetTextTemplateResponse
     */
    CompletableFuture<GetTextTemplateResponse> getTextTemplate(GetTextTemplateRequest request);

    /**
     * @param request the request parameters of InteractText  InteractTextRequest
     * @return InteractTextResponse
     */
    CompletableFuture<InteractTextResponse> interactText(InteractTextRequest request);

    ResponseIterable<InteractTextResponseBody> interactTextWithResponseIterable(InteractTextRequest request);

    /**
     * @param request the request parameters of ListAICoachScriptPage  ListAICoachScriptPageRequest
     * @return ListAICoachScriptPageResponse
     */
    CompletableFuture<ListAICoachScriptPageResponse> listAICoachScriptPage(ListAICoachScriptPageRequest request);

    /**
     * @param request the request parameters of ListAICoachTaskPage  ListAICoachTaskPageRequest
     * @return ListAICoachTaskPageResponse
     */
    CompletableFuture<ListAICoachTaskPageResponse> listAICoachTaskPage(ListAICoachTaskPageRequest request);

    /**
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request);

    /**
     * @param request the request parameters of ListAnchor  ListAnchorRequest
     * @return ListAnchorResponse
     */
    CompletableFuture<ListAnchorResponse> listAnchor(ListAnchorRequest request);

    /**
     * @param request the request parameters of ListAvatarProject  ListAvatarProjectRequest
     * @return ListAvatarProjectResponse
     */
    CompletableFuture<ListAvatarProjectResponse> listAvatarProject(ListAvatarProjectRequest request);

    /**
     * @param request the request parameters of ListKnowledgeBase  ListKnowledgeBaseRequest
     * @return ListKnowledgeBaseResponse
     */
    CompletableFuture<ListKnowledgeBaseResponse> listKnowledgeBase(ListKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of ListTextThemes  ListTextThemesRequest
     * @return ListTextThemesResponse
     */
    CompletableFuture<ListTextThemesResponse> listTextThemes(ListTextThemesRequest request);

    /**
     * @param request the request parameters of ListTexts  ListTextsRequest
     * @return ListTextsResponse
     */
    CompletableFuture<ListTextsResponse> listTexts(ListTextsRequest request);

    /**
     * @param request the request parameters of ListVoiceModels  ListVoiceModelsRequest
     * @return ListVoiceModelsResponse
     */
    CompletableFuture<ListVoiceModelsResponse> listVoiceModels(ListVoiceModelsRequest request);

    /**
     * @param request the request parameters of OperateAvatarProject  OperateAvatarProjectRequest
     * @return OperateAvatarProjectResponse
     */
    CompletableFuture<OperateAvatarProjectResponse> operateAvatarProject(OperateAvatarProjectRequest request);

    /**
     * @param request the request parameters of QueryAvatarProject  QueryAvatarProjectRequest
     * @return QueryAvatarProjectResponse
     */
    CompletableFuture<QueryAvatarProjectResponse> queryAvatarProject(QueryAvatarProjectRequest request);

    /**
     * @param request the request parameters of QueryAvatarResource  QueryAvatarResourceRequest
     * @return QueryAvatarResourceResponse
     */
    CompletableFuture<QueryAvatarResourceResponse> queryAvatarResource(QueryAvatarResourceRequest request);

    /**
     * @param request the request parameters of QueryIndividuationTextTask  QueryIndividuationTextTaskRequest
     * @return QueryIndividuationTextTaskResponse
     */
    CompletableFuture<QueryIndividuationTextTaskResponse> queryIndividuationTextTask(QueryIndividuationTextTaskRequest request);

    /**
     * @param request the request parameters of QuerySessionInfo  QuerySessionInfoRequest
     * @return QuerySessionInfoResponse
     */
    CompletableFuture<QuerySessionInfoResponse> querySessionInfo(QuerySessionInfoRequest request);

    /**
     * @param request the request parameters of QueryTextStream  QueryTextStreamRequest
     * @return QueryTextStreamResponse
     */
    CompletableFuture<QueryTextStreamResponse> queryTextStream(QueryTextStreamRequest request);

    ResponseIterable<QueryTextStreamResponseBody> queryTextStreamWithResponseIterable(QueryTextStreamRequest request);

    /**
     * @param request the request parameters of SaveAvatarProject  SaveAvatarProjectRequest
     * @return SaveAvatarProjectResponse
     */
    CompletableFuture<SaveAvatarProjectResponse> saveAvatarProject(SaveAvatarProjectRequest request);

    /**
     * @param request the request parameters of SelectImageTask  SelectImageTaskRequest
     * @return SelectImageTaskResponse
     */
    CompletableFuture<SelectImageTaskResponse> selectImageTask(SelectImageTaskRequest request);

    /**
     * @param request the request parameters of SelectResource  SelectResourceRequest
     * @return SelectResourceResponse
     */
    CompletableFuture<SelectResourceResponse> selectResource(SelectResourceRequest request);

    /**
     * @param request the request parameters of SendSdkMessage  SendSdkMessageRequest
     * @return SendSdkMessageResponse
     */
    CompletableFuture<SendSdkMessageResponse> sendSdkMessage(SendSdkMessageRequest request);

    /**
     * @param request the request parameters of SendTextMsg  SendTextMsgRequest
     * @return SendTextMsgResponse
     */
    CompletableFuture<SendTextMsgResponse> sendTextMsg(SendTextMsgRequest request);

    /**
     * @param request the request parameters of StartAvatarSession  StartAvatarSessionRequest
     * @return StartAvatarSessionResponse
     */
    CompletableFuture<StartAvatarSessionResponse> startAvatarSession(StartAvatarSessionRequest request);

    /**
     * @param request the request parameters of StopAvatarSession  StopAvatarSessionRequest
     * @return StopAvatarSessionResponse
     */
    CompletableFuture<StopAvatarSessionResponse> stopAvatarSession(StopAvatarSessionRequest request);

    /**
     * @param request the request parameters of StopProjectTask  StopProjectTaskRequest
     * @return StopProjectTaskResponse
     */
    CompletableFuture<StopProjectTaskResponse> stopProjectTask(StopProjectTaskRequest request);

    /**
     * @param request the request parameters of SubmitProjectTask  SubmitProjectTaskRequest
     * @return SubmitProjectTaskResponse
     */
    CompletableFuture<SubmitProjectTaskResponse> submitProjectTask(SubmitProjectTaskRequest request);

    /**
     * @param request the request parameters of TransferPortraitStyle  TransferPortraitStyleRequest
     * @return TransferPortraitStyleResponse
     */
    CompletableFuture<TransferPortraitStyleResponse> transferPortraitStyle(TransferPortraitStyleRequest request);

}
