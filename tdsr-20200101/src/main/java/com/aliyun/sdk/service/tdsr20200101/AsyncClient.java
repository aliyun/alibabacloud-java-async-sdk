// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.tdsr20200101.models.*;
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

    CompletableFuture<AddHotspotFileResponse> addHotspotFile(AddHotspotFileRequest request);

    CompletableFuture<AddMosaicsResponse> addMosaics(AddMosaicsRequest request);

    CompletableFuture<AddProjectResponse> addProject(AddProjectRequest request);

    CompletableFuture<AddRelativePositionResponse> addRelativePosition(AddRelativePositionRequest request);

    CompletableFuture<AddRoomPlanResponse> addRoomPlan(AddRoomPlanRequest request);

    CompletableFuture<AddSceneResponse> addScene(AddSceneRequest request);

    CompletableFuture<AddSubSceneResponse> addSubScene(AddSubSceneRequest request);

    CompletableFuture<CheckUserPropertyResponse> checkUserProperty(CheckUserPropertyRequest request);

    CompletableFuture<CopySceneResponse> copyScene(CopySceneRequest request);

    CompletableFuture<CreateUploadPolicyResponse> createUploadPolicy(CreateUploadPolicyRequest request);

    CompletableFuture<DecryptContentResponse> decryptContent(DecryptContentRequest request);

    CompletableFuture<DetailProjectResponse> detailProject(DetailProjectRequest request);

    CompletableFuture<DetailSceneResponse> detailScene(DetailSceneRequest request);

    CompletableFuture<DetailSubSceneResponse> detailSubScene(DetailSubSceneRequest request);

    CompletableFuture<DropProjectResponse> dropProject(DropProjectRequest request);

    CompletableFuture<DropSceneResponse> dropScene(DropSceneRequest request);

    CompletableFuture<DropSubSceneResponse> dropSubScene(DropSubSceneRequest request);

    CompletableFuture<EncryptContentResponse> encryptContent(EncryptContentRequest request);

    CompletableFuture<GetConnDataResponse> getConnData(GetConnDataRequest request);

    CompletableFuture<GetCopySceneTaskStatusResponse> getCopySceneTaskStatus(GetCopySceneTaskStatusRequest request);

    CompletableFuture<GetHotspotConfigResponse> getHotspotConfig(GetHotspotConfigRequest request);

    CompletableFuture<GetHotspotSceneDataResponse> getHotspotSceneData(GetHotspotSceneDataRequest request);

    CompletableFuture<GetHotspotTagResponse> getHotspotTag(GetHotspotTagRequest request);

    CompletableFuture<GetLayoutDataResponse> getLayoutData(GetLayoutDataRequest request);

    CompletableFuture<GetOriginLayoutDataResponse> getOriginLayoutData(GetOriginLayoutDataRequest request);

    CompletableFuture<GetOssPolicyResponse> getOssPolicy(GetOssPolicyRequest request);

    CompletableFuture<GetPackSceneTaskStatusResponse> getPackSceneTaskStatus(GetPackSceneTaskStatusRequest request);

    CompletableFuture<GetRectifyImageResponse> getRectifyImage(GetRectifyImageRequest request);

    CompletableFuture<GetSceneBuildTaskStatusResponse> getSceneBuildTaskStatus(GetSceneBuildTaskStatusRequest request);

    CompletableFuture<GetScenePackUrlResponse> getScenePackUrl(GetScenePackUrlRequest request);

    CompletableFuture<GetScenePreviewDataResponse> getScenePreviewData(GetScenePreviewDataRequest request);

    CompletableFuture<GetScenePreviewInfoResponse> getScenePreviewInfo(GetScenePreviewInfoRequest request);

    CompletableFuture<GetScenePreviewResourceResponse> getScenePreviewResource(GetScenePreviewResourceRequest request);

    CompletableFuture<GetSingleConnDataResponse> getSingleConnData(GetSingleConnDataRequest request);

    CompletableFuture<GetSourcePackStatusResponse> getSourcePackStatus(GetSourcePackStatusRequest request);

    CompletableFuture<GetSubSceneTaskStatusResponse> getSubSceneTaskStatus(GetSubSceneTaskStatusRequest request);

    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    CompletableFuture<GetWindowConfigResponse> getWindowConfig(GetWindowConfigRequest request);

    CompletableFuture<LabelBuildResponse> labelBuild(LabelBuildRequest request);

    CompletableFuture<LinkImageResponse> linkImage(LinkImageRequest request);

    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    CompletableFuture<ListSceneResponse> listScene(ListSceneRequest request);

    CompletableFuture<ListSubSceneResponse> listSubScene(ListSubSceneRequest request);

    CompletableFuture<OptimizeRightAngleResponse> optimizeRightAngle(OptimizeRightAngleRequest request);

    CompletableFuture<PackSceneResponse> packScene(PackSceneRequest request);

    CompletableFuture<PackSourceResponse> packSource(PackSourceRequest request);

    CompletableFuture<PredImageResponse> predImage(PredImageRequest request);

    CompletableFuture<PredictionWallLineResponse> predictionWallLine(PredictionWallLineRequest request);

    CompletableFuture<PublishHotspotResponse> publishHotspot(PublishHotspotRequest request);

    CompletableFuture<PublishHotspotConfigResponse> publishHotspotConfig(PublishHotspotConfigRequest request);

    CompletableFuture<PublishSceneResponse> publishScene(PublishSceneRequest request);

    CompletableFuture<PublishStatusResponse> publishStatus(PublishStatusRequest request);

    CompletableFuture<RecoveryOriginImageResponse> recoveryOriginImage(RecoveryOriginImageRequest request);

    CompletableFuture<RectVerticalResponse> rectVertical(RectVerticalRequest request);

    CompletableFuture<RectifyImageResponse> rectifyImage(RectifyImageRequest request);

    CompletableFuture<RollbackSubSceneResponse> rollbackSubScene(RollbackSubSceneRequest request);

    CompletableFuture<SaveHotspotConfigResponse> saveHotspotConfig(SaveHotspotConfigRequest request);

    CompletableFuture<SaveHotspotTagResponse> saveHotspotTag(SaveHotspotTagRequest request);

    CompletableFuture<SaveHotspotTagListResponse> saveHotspotTagList(SaveHotspotTagListRequest request);

    CompletableFuture<SaveModelConfigResponse> saveModelConfig(SaveModelConfigRequest request);

    CompletableFuture<ScenePublishResponse> scenePublish(ScenePublishRequest request);

    CompletableFuture<TempPreviewResponse> tempPreview(TempPreviewRequest request);

    CompletableFuture<TempPreviewStatusResponse> tempPreviewStatus(TempPreviewStatusRequest request);

    CompletableFuture<UpdateConnDataResponse> updateConnData(UpdateConnDataRequest request);

    CompletableFuture<UpdateLayoutDataResponse> updateLayoutData(UpdateLayoutDataRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateSceneResponse> updateScene(UpdateSceneRequest request);

    CompletableFuture<UpdateSubSceneResponse> updateSubScene(UpdateSubSceneRequest request);

    CompletableFuture<UpdateSubSceneSeqResponse> updateSubSceneSeq(UpdateSubSceneSeqRequest request);

}
