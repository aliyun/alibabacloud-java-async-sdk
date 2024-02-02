// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.xrengine20230313.models.*;
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

    CompletableFuture<AuthUserResponse> authUser(AuthUserRequest request);

    CompletableFuture<BatchQueryMotionShopTaskStatusResponse> batchQueryMotionShopTaskStatus(BatchQueryMotionShopTaskStatusRequest request);

    CompletableFuture<CreateAvatarTalkProjectResponse> createAvatarTalkProject(CreateAvatarTalkProjectRequest request);

    CompletableFuture<CreateDigitalHumanProjectResponse> createDigitalHumanProject(CreateDigitalHumanProjectRequest request);

    CompletableFuture<CreateLivePortraitProjectResponse> createLivePortraitProject(CreateLivePortraitProjectRequest request);

    CompletableFuture<GenerateMotionShopVideoUploadUrlResponse> generateMotionShopVideoUploadUrl(GenerateMotionShopVideoUploadUrlRequest request);

    CompletableFuture<GetMapDataResponse> getMapData(GetMapDataRequest request);

    CompletableFuture<GetMapPublishDataResponse> getMapPublishData(GetMapPublishDataRequest request);

    CompletableFuture<InitLocateResponse> initLocate(InitLocateRequest request);

    CompletableFuture<ListCommonMaterialsResponse> listCommonMaterials(ListCommonMaterialsRequest request);

    CompletableFuture<ListDigitalHumanMaterialsResponse> listDigitalHumanMaterials(ListDigitalHumanMaterialsRequest request);

    CompletableFuture<ListLocationServiceResponse> listLocationService(ListLocationServiceRequest request);

    CompletableFuture<ListMotionShopTasksResponse> listMotionShopTasks(ListMotionShopTasksRequest request);

    CompletableFuture<LivePortraitFaceDetectResponse> livePortraitFaceDetect(LivePortraitFaceDetectRequest request);

    CompletableFuture<LocateResponse> locate(LocateRequest request);

    CompletableFuture<LoginHuggingFaceResponse> loginHuggingFace(LoginHuggingFaceRequest request);

    CompletableFuture<LoginModelScopeResponse> loginModelScope(LoginModelScopeRequest request);

    CompletableFuture<MotionShopVideoDetectResponse> motionShopVideoDetect(MotionShopVideoDetectRequest request);

    CompletableFuture<PopBatchQueryObjectGenerationProjectStatusResponse> popBatchQueryObjectGenerationProjectStatus(PopBatchQueryObjectGenerationProjectStatusRequest request);

    CompletableFuture<PopBatchQueryObjectProjectStatusResponse> popBatchQueryObjectProjectStatus(PopBatchQueryObjectProjectStatusRequest request);

    CompletableFuture<PopBuildFeatureToAvatarProjectResponse> popBuildFeatureToAvatarProject(PopBuildFeatureToAvatarProjectRequest request);

    CompletableFuture<PopBuildLivePortraitModelScopeProjectResponse> popBuildLivePortraitModelScopeProject(PopBuildLivePortraitModelScopeProjectRequest request);

    CompletableFuture<PopBuildObjectGenerationProjectResponse> popBuildObjectGenerationProject(PopBuildObjectGenerationProjectRequest request);

    CompletableFuture<PopBuildObjectProjectResponse> popBuildObjectProject(PopBuildObjectProjectRequest request);

    CompletableFuture<PopBuildPakRenderProjectResponse> popBuildPakRenderProject(PopBuildPakRenderProjectRequest request);

    CompletableFuture<PopBuildTextToAvatarProjectResponse> popBuildTextToAvatarProject(PopBuildTextToAvatarProjectRequest request);

    CompletableFuture<PopCreateFeatureToAvatarProjectResponse> popCreateFeatureToAvatarProject(PopCreateFeatureToAvatarProjectRequest request);

    CompletableFuture<PopCreateLivePortraitModelScopeProjectResponse> popCreateLivePortraitModelScopeProject(PopCreateLivePortraitModelScopeProjectRequest request);

    CompletableFuture<PopCreateMaterialResponse> popCreateMaterial(PopCreateMaterialRequest request);

    CompletableFuture<PopCreateObjectGenerationProjectResponse> popCreateObjectGenerationProject(PopCreateObjectGenerationProjectRequest request);

    CompletableFuture<PopCreateObjectProjectResponse> popCreateObjectProject(PopCreateObjectProjectRequest request);

    CompletableFuture<PopCreatePakRenderProjectResponse> popCreatePakRenderProject(PopCreatePakRenderProjectRequest request);

    CompletableFuture<PopCreateTextToAvatarProjectResponse> popCreateTextToAvatarProject(PopCreateTextToAvatarProjectRequest request);

    CompletableFuture<PopDeleteMaterialResponse> popDeleteMaterial(PopDeleteMaterialRequest request);

    CompletableFuture<PopGetAITryOnJobResponse> popGetAITryOnJob(PopGetAITryOnJobRequest request);

    CompletableFuture<PopListAITryOnJobsResponse> popListAITryOnJobs(PopListAITryOnJobsRequest request);

    CompletableFuture<PopListCommonMaterialsAllResponse> popListCommonMaterialsAll(PopListCommonMaterialsAllRequest request);

    CompletableFuture<PopListFeatureToAvatarMaterialsResponse> popListFeatureToAvatarMaterials(PopListFeatureToAvatarMaterialsRequest request);

    CompletableFuture<PopListFeatureToAvatarProjectResponse> popListFeatureToAvatarProject(PopListFeatureToAvatarProjectRequest request);

    CompletableFuture<PopListLivePortraitModelScopeMaterialsResponse> popListLivePortraitModelScopeMaterials(PopListLivePortraitModelScopeMaterialsRequest request);

    CompletableFuture<PopListObjectCaseResponse> popListObjectCase(PopListObjectCaseRequest request);

    CompletableFuture<PopListObjectGenerationProjectResponse> popListObjectGenerationProject(PopListObjectGenerationProjectRequest request);

    CompletableFuture<PopListObjectProjectResponse> popListObjectProject(PopListObjectProjectRequest request);

    CompletableFuture<PopListPakRenderExpressionResponse> popListPakRenderExpression(PopListPakRenderExpressionRequest request);

    CompletableFuture<PopListTextToAvatarProjectResponse> popListTextToAvatarProject(PopListTextToAvatarProjectRequest request);

    CompletableFuture<PopObjectProjectDetailResponse> popObjectProjectDetail(PopObjectProjectDetailRequest request);

    CompletableFuture<PopObjectRetrievalResponse> popObjectRetrieval(PopObjectRetrievalRequest request);

    CompletableFuture<PopObjectRetrievalUploadDataResponse> popObjectRetrievalUploadData(PopObjectRetrievalUploadDataRequest request);

    CompletableFuture<PopQueryAvatarProjectDetailResponse> popQueryAvatarProjectDetail(PopQueryAvatarProjectDetailRequest request);

    CompletableFuture<PopQueryLatestAvatarProjectDetailByUserResponse> popQueryLatestAvatarProjectDetailByUser(PopQueryLatestAvatarProjectDetailByUserRequest request);

    CompletableFuture<PopQueryLivePortraitModelScopeProjectDetailResponse> popQueryLivePortraitModelScopeProjectDetail(PopQueryLivePortraitModelScopeProjectDetailRequest request);

    CompletableFuture<PopQueryObjectGenerationProjectDetailResponse> popQueryObjectGenerationProjectDetail(PopQueryObjectGenerationProjectDetailRequest request);

    CompletableFuture<PopRetryAITryOnTaskResponse> popRetryAITryOnTask(PopRetryAITryOnTaskRequest request);

    CompletableFuture<PopSubmitAITryOnJobResponse> popSubmitAITryOnJob(PopSubmitAITryOnJobRequest request);

    CompletableFuture<PopUploadMaterialResponse> popUploadMaterial(PopUploadMaterialRequest request);

    CompletableFuture<PopVideoSaveSourceResponse> popVideoSaveSource(PopVideoSaveSourceRequest request);

    CompletableFuture<QueryDigitalHumanProjectResponse> queryDigitalHumanProject(QueryDigitalHumanProjectRequest request);

    CompletableFuture<QueryLongTtsResultResponse> queryLongTtsResult(QueryLongTtsResultRequest request);

    CompletableFuture<QueryMotionShopVideoDetectResultResponse> queryMotionShopVideoDetectResult(QueryMotionShopVideoDetectResultRequest request);

    CompletableFuture<SubmitLongTtsTaskResponse> submitLongTtsTask(SubmitLongTtsTaskRequest request);

    CompletableFuture<SubmitMotionShopTaskResponse> submitMotionShopTask(SubmitMotionShopTaskRequest request);

    CompletableFuture<UpdateUserEmailResponse> updateUserEmail(UpdateUserEmailRequest request);

}
