// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.tdsr20200101.models.*;
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
     * @param request the request parameters of AddHotspotFile  AddHotspotFileRequest
     * @return AddHotspotFileResponse
     */
    CompletableFuture<AddHotspotFileResponse> addHotspotFile(AddHotspotFileRequest request);

    /**
     * @param request the request parameters of AddMosaics  AddMosaicsRequest
     * @return AddMosaicsResponse
     */
    CompletableFuture<AddMosaicsResponse> addMosaics(AddMosaicsRequest request);

    /**
     * @param request the request parameters of AddProject  AddProjectRequest
     * @return AddProjectResponse
     */
    CompletableFuture<AddProjectResponse> addProject(AddProjectRequest request);

    /**
     * @deprecated OpenAPI AddRelativePosition is deprecated  * @param request  the request parameters of AddRelativePosition  AddRelativePositionRequest
     * @return AddRelativePositionResponse
     */
    @Deprecated
    CompletableFuture<AddRelativePositionResponse> addRelativePosition(AddRelativePositionRequest request);

    /**
     * @param request the request parameters of AddRoomPlan  AddRoomPlanRequest
     * @return AddRoomPlanResponse
     */
    CompletableFuture<AddRoomPlanResponse> addRoomPlan(AddRoomPlanRequest request);

    /**
     * @param request the request parameters of AddScene  AddSceneRequest
     * @return AddSceneResponse
     */
    CompletableFuture<AddSceneResponse> addScene(AddSceneRequest request);

    /**
     * @param request the request parameters of AddSubScene  AddSubSceneRequest
     * @return AddSubSceneResponse
     */
    CompletableFuture<AddSubSceneResponse> addSubScene(AddSubSceneRequest request);

    /**
     * @param request the request parameters of CheckUserProperty  CheckUserPropertyRequest
     * @return CheckUserPropertyResponse
     */
    CompletableFuture<CheckUserPropertyResponse> checkUserProperty(CheckUserPropertyRequest request);

    /**
     * @param request the request parameters of CopyScene  CopySceneRequest
     * @return CopySceneResponse
     */
    CompletableFuture<CopySceneResponse> copyScene(CopySceneRequest request);

    /**
     * @param request the request parameters of CreateUploadPolicy  CreateUploadPolicyRequest
     * @return CreateUploadPolicyResponse
     */
    CompletableFuture<CreateUploadPolicyResponse> createUploadPolicy(CreateUploadPolicyRequest request);

    /**
     * @param request the request parameters of DetailProject  DetailProjectRequest
     * @return DetailProjectResponse
     */
    CompletableFuture<DetailProjectResponse> detailProject(DetailProjectRequest request);

    /**
     * @param request the request parameters of DetailScene  DetailSceneRequest
     * @return DetailSceneResponse
     */
    CompletableFuture<DetailSceneResponse> detailScene(DetailSceneRequest request);

    /**
     * @param request the request parameters of DetailSubScene  DetailSubSceneRequest
     * @return DetailSubSceneResponse
     */
    CompletableFuture<DetailSubSceneResponse> detailSubScene(DetailSubSceneRequest request);

    /**
     * @param request the request parameters of DropProject  DropProjectRequest
     * @return DropProjectResponse
     */
    CompletableFuture<DropProjectResponse> dropProject(DropProjectRequest request);

    /**
     * @param request the request parameters of DropScene  DropSceneRequest
     * @return DropSceneResponse
     */
    CompletableFuture<DropSceneResponse> dropScene(DropSceneRequest request);

    /**
     * @param request the request parameters of DropSubScene  DropSubSceneRequest
     * @return DropSubSceneResponse
     */
    CompletableFuture<DropSubSceneResponse> dropSubScene(DropSubSceneRequest request);

    /**
     * @param request the request parameters of GetConnData  GetConnDataRequest
     * @return GetConnDataResponse
     */
    CompletableFuture<GetConnDataResponse> getConnData(GetConnDataRequest request);

    /**
     * @param request the request parameters of GetCopySceneTaskStatus  GetCopySceneTaskStatusRequest
     * @return GetCopySceneTaskStatusResponse
     */
    CompletableFuture<GetCopySceneTaskStatusResponse> getCopySceneTaskStatus(GetCopySceneTaskStatusRequest request);

    /**
     * @param request the request parameters of GetHotspotConfig  GetHotspotConfigRequest
     * @return GetHotspotConfigResponse
     */
    CompletableFuture<GetHotspotConfigResponse> getHotspotConfig(GetHotspotConfigRequest request);

    /**
     * @param request the request parameters of GetHotspotSceneData  GetHotspotSceneDataRequest
     * @return GetHotspotSceneDataResponse
     */
    CompletableFuture<GetHotspotSceneDataResponse> getHotspotSceneData(GetHotspotSceneDataRequest request);

    /**
     * @param request the request parameters of GetHotspotTag  GetHotspotTagRequest
     * @return GetHotspotTagResponse
     */
    CompletableFuture<GetHotspotTagResponse> getHotspotTag(GetHotspotTagRequest request);

    /**
     * @param request the request parameters of GetLayoutData  GetLayoutDataRequest
     * @return GetLayoutDataResponse
     */
    CompletableFuture<GetLayoutDataResponse> getLayoutData(GetLayoutDataRequest request);

    /**
     * @param request the request parameters of GetOriginLayoutData  GetOriginLayoutDataRequest
     * @return GetOriginLayoutDataResponse
     */
    CompletableFuture<GetOriginLayoutDataResponse> getOriginLayoutData(GetOriginLayoutDataRequest request);

    /**
     * @param request the request parameters of GetOssPolicy  GetOssPolicyRequest
     * @return GetOssPolicyResponse
     */
    CompletableFuture<GetOssPolicyResponse> getOssPolicy(GetOssPolicyRequest request);

    /**
     * @param request the request parameters of GetPackSceneTaskStatus  GetPackSceneTaskStatusRequest
     * @return GetPackSceneTaskStatusResponse
     */
    CompletableFuture<GetPackSceneTaskStatusResponse> getPackSceneTaskStatus(GetPackSceneTaskStatusRequest request);

    /**
     * @param request the request parameters of GetRectifyImage  GetRectifyImageRequest
     * @return GetRectifyImageResponse
     */
    CompletableFuture<GetRectifyImageResponse> getRectifyImage(GetRectifyImageRequest request);

    /**
     * @param request the request parameters of GetSceneBuildTaskStatus  GetSceneBuildTaskStatusRequest
     * @return GetSceneBuildTaskStatusResponse
     */
    CompletableFuture<GetSceneBuildTaskStatusResponse> getSceneBuildTaskStatus(GetSceneBuildTaskStatusRequest request);

    /**
     * @param request the request parameters of GetScenePackUrl  GetScenePackUrlRequest
     * @return GetScenePackUrlResponse
     */
    CompletableFuture<GetScenePackUrlResponse> getScenePackUrl(GetScenePackUrlRequest request);

    /**
     * @param request the request parameters of GetScenePreviewData  GetScenePreviewDataRequest
     * @return GetScenePreviewDataResponse
     */
    CompletableFuture<GetScenePreviewDataResponse> getScenePreviewData(GetScenePreviewDataRequest request);

    /**
     * @param request the request parameters of GetScenePreviewInfo  GetScenePreviewInfoRequest
     * @return GetScenePreviewInfoResponse
     */
    CompletableFuture<GetScenePreviewInfoResponse> getScenePreviewInfo(GetScenePreviewInfoRequest request);

    /**
     * @param request the request parameters of GetScenePreviewResource  GetScenePreviewResourceRequest
     * @return GetScenePreviewResourceResponse
     */
    CompletableFuture<GetScenePreviewResourceResponse> getScenePreviewResource(GetScenePreviewResourceRequest request);

    /**
     * @param request the request parameters of GetSingleConnData  GetSingleConnDataRequest
     * @return GetSingleConnDataResponse
     */
    CompletableFuture<GetSingleConnDataResponse> getSingleConnData(GetSingleConnDataRequest request);

    /**
     * @param request the request parameters of GetSourcePackStatus  GetSourcePackStatusRequest
     * @return GetSourcePackStatusResponse
     */
    CompletableFuture<GetSourcePackStatusResponse> getSourcePackStatus(GetSourcePackStatusRequest request);

    /**
     * @param request the request parameters of GetSubSceneTaskStatus  GetSubSceneTaskStatusRequest
     * @return GetSubSceneTaskStatusResponse
     */
    CompletableFuture<GetSubSceneTaskStatusResponse> getSubSceneTaskStatus(GetSubSceneTaskStatusRequest request);

    /**
     * @param request the request parameters of GetTaskStatus  GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    /**
     * @param request the request parameters of GetWindowConfig  GetWindowConfigRequest
     * @return GetWindowConfigResponse
     */
    CompletableFuture<GetWindowConfigResponse> getWindowConfig(GetWindowConfigRequest request);

    /**
     * @param request the request parameters of LabelBuild  LabelBuildRequest
     * @return LabelBuildResponse
     */
    CompletableFuture<LabelBuildResponse> labelBuild(LabelBuildRequest request);

    /**
     * @param request the request parameters of LinkImage  LinkImageRequest
     * @return LinkImageResponse
     */
    CompletableFuture<LinkImageResponse> linkImage(LinkImageRequest request);

    /**
     * @param request the request parameters of ListProject  ListProjectRequest
     * @return ListProjectResponse
     */
    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    /**
     * @param request the request parameters of ListScene  ListSceneRequest
     * @return ListSceneResponse
     */
    CompletableFuture<ListSceneResponse> listScene(ListSceneRequest request);

    /**
     * @param request the request parameters of ListSubScene  ListSubSceneRequest
     * @return ListSubSceneResponse
     */
    CompletableFuture<ListSubSceneResponse> listSubScene(ListSubSceneRequest request);

    /**
     * @param request the request parameters of OptimizeRightAngle  OptimizeRightAngleRequest
     * @return OptimizeRightAngleResponse
     */
    CompletableFuture<OptimizeRightAngleResponse> optimizeRightAngle(OptimizeRightAngleRequest request);

    /**
     * @param request the request parameters of PackScene  PackSceneRequest
     * @return PackSceneResponse
     */
    CompletableFuture<PackSceneResponse> packScene(PackSceneRequest request);

    /**
     * @param request the request parameters of PackSource  PackSourceRequest
     * @return PackSourceResponse
     */
    CompletableFuture<PackSourceResponse> packSource(PackSourceRequest request);

    /**
     * @param request the request parameters of PredImage  PredImageRequest
     * @return PredImageResponse
     */
    CompletableFuture<PredImageResponse> predImage(PredImageRequest request);

    /**
     * @param request the request parameters of PredictionWallLine  PredictionWallLineRequest
     * @return PredictionWallLineResponse
     */
    CompletableFuture<PredictionWallLineResponse> predictionWallLine(PredictionWallLineRequest request);

    /**
     * @param request the request parameters of PublishHotspot  PublishHotspotRequest
     * @return PublishHotspotResponse
     */
    CompletableFuture<PublishHotspotResponse> publishHotspot(PublishHotspotRequest request);

    /**
     * @param request the request parameters of PublishHotspotConfig  PublishHotspotConfigRequest
     * @return PublishHotspotConfigResponse
     */
    CompletableFuture<PublishHotspotConfigResponse> publishHotspotConfig(PublishHotspotConfigRequest request);

    /**
     * @param request the request parameters of PublishScene  PublishSceneRequest
     * @return PublishSceneResponse
     */
    CompletableFuture<PublishSceneResponse> publishScene(PublishSceneRequest request);

    /**
     * @param request the request parameters of PublishStatus  PublishStatusRequest
     * @return PublishStatusResponse
     */
    CompletableFuture<PublishStatusResponse> publishStatus(PublishStatusRequest request);

    /**
     * @param request the request parameters of RecoveryOriginImage  RecoveryOriginImageRequest
     * @return RecoveryOriginImageResponse
     */
    CompletableFuture<RecoveryOriginImageResponse> recoveryOriginImage(RecoveryOriginImageRequest request);

    /**
     * @param request the request parameters of RectVertical  RectVerticalRequest
     * @return RectVerticalResponse
     */
    CompletableFuture<RectVerticalResponse> rectVertical(RectVerticalRequest request);

    /**
     * @param request the request parameters of RectifyImage  RectifyImageRequest
     * @return RectifyImageResponse
     */
    CompletableFuture<RectifyImageResponse> rectifyImage(RectifyImageRequest request);

    /**
     * @param request the request parameters of RollbackSubScene  RollbackSubSceneRequest
     * @return RollbackSubSceneResponse
     */
    CompletableFuture<RollbackSubSceneResponse> rollbackSubScene(RollbackSubSceneRequest request);

    /**
     * @param request the request parameters of SaveHotspotConfig  SaveHotspotConfigRequest
     * @return SaveHotspotConfigResponse
     */
    CompletableFuture<SaveHotspotConfigResponse> saveHotspotConfig(SaveHotspotConfigRequest request);

    /**
     * @param request the request parameters of SaveHotspotTag  SaveHotspotTagRequest
     * @return SaveHotspotTagResponse
     */
    CompletableFuture<SaveHotspotTagResponse> saveHotspotTag(SaveHotspotTagRequest request);

    /**
     * @param request the request parameters of SaveHotspotTagList  SaveHotspotTagListRequest
     * @return SaveHotspotTagListResponse
     */
    CompletableFuture<SaveHotspotTagListResponse> saveHotspotTagList(SaveHotspotTagListRequest request);

    /**
     * @param request the request parameters of SaveMinimap  SaveMinimapRequest
     * @return SaveMinimapResponse
     */
    CompletableFuture<SaveMinimapResponse> saveMinimap(SaveMinimapRequest request);

    /**
     * @param request the request parameters of SaveModelConfig  SaveModelConfigRequest
     * @return SaveModelConfigResponse
     */
    CompletableFuture<SaveModelConfigResponse> saveModelConfig(SaveModelConfigRequest request);

    /**
     * @param request the request parameters of ScenePublish  ScenePublishRequest
     * @return ScenePublishResponse
     */
    CompletableFuture<ScenePublishResponse> scenePublish(ScenePublishRequest request);

    /**
     * @param request the request parameters of TempPreview  TempPreviewRequest
     * @return TempPreviewResponse
     */
    CompletableFuture<TempPreviewResponse> tempPreview(TempPreviewRequest request);

    /**
     * @param request the request parameters of TempPreviewStatus  TempPreviewStatusRequest
     * @return TempPreviewStatusResponse
     */
    CompletableFuture<TempPreviewStatusResponse> tempPreviewStatus(TempPreviewStatusRequest request);

    /**
     * @param request the request parameters of UpdateConnData  UpdateConnDataRequest
     * @return UpdateConnDataResponse
     */
    CompletableFuture<UpdateConnDataResponse> updateConnData(UpdateConnDataRequest request);

    /**
     * @param request the request parameters of UpdateLayoutData  UpdateLayoutDataRequest
     * @return UpdateLayoutDataResponse
     */
    CompletableFuture<UpdateLayoutDataResponse> updateLayoutData(UpdateLayoutDataRequest request);

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    /**
     * @param request the request parameters of UpdateScene  UpdateSceneRequest
     * @return UpdateSceneResponse
     */
    CompletableFuture<UpdateSceneResponse> updateScene(UpdateSceneRequest request);

    /**
     * @param request the request parameters of UpdateSubScene  UpdateSubSceneRequest
     * @return UpdateSubSceneResponse
     */
    CompletableFuture<UpdateSubSceneResponse> updateSubScene(UpdateSubSceneRequest request);

    /**
     * @param request the request parameters of UpdateSubSceneSeq  UpdateSubSceneSeqRequest
     * @return UpdateSubSceneSeqResponse
     */
    CompletableFuture<UpdateSubSceneSeqResponse> updateSubSceneSeq(UpdateSubSceneSeqRequest request);

}
