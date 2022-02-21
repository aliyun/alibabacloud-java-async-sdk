// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.imm20170906.models.*;
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

    CompletableFuture<CompareImageFacesResponse> compareImageFaces(CompareImageFacesRequest request);

    CompletableFuture<ConvertOfficeFormatResponse> convertOfficeFormat(ConvertOfficeFormatRequest request);

    CompletableFuture<CreateGrabFrameTaskResponse> createGrabFrameTask(CreateGrabFrameTaskRequest request);

    CompletableFuture<CreateGroupFacesJobResponse> createGroupFacesJob(CreateGroupFacesJobRequest request);

    CompletableFuture<CreateMergeFaceGroupsJobResponse> createMergeFaceGroupsJob(CreateMergeFaceGroupsJobRequest request);

    CompletableFuture<CreateOfficeConversionTaskResponse> createOfficeConversionTask(CreateOfficeConversionTaskRequest request);

    CompletableFuture<CreateSetResponse> createSet(CreateSetRequest request);

    CompletableFuture<CreateVideoCompressTaskResponse> createVideoCompressTask(CreateVideoCompressTaskRequest request);

    CompletableFuture<DecodeBlindWatermarkResponse> decodeBlindWatermark(DecodeBlindWatermarkRequest request);

    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    CompletableFuture<DeleteOfficeConversionTaskResponse> deleteOfficeConversionTask(DeleteOfficeConversionTaskRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteSetResponse> deleteSet(DeleteSetRequest request);

    CompletableFuture<DeleteVideoResponse> deleteVideo(DeleteVideoRequest request);

    CompletableFuture<DeleteVideoTaskResponse> deleteVideoTask(DeleteVideoTaskRequest request);

    CompletableFuture<DetectImageBodiesResponse> detectImageBodies(DetectImageBodiesRequest request);

    CompletableFuture<DetectImageFacesResponse> detectImageFaces(DetectImageFacesRequest request);

    CompletableFuture<DetectImageQRCodesResponse> detectImageQRCodes(DetectImageQRCodesRequest request);

    CompletableFuture<DetectImageTagsResponse> detectImageTags(DetectImageTagsRequest request);

    CompletableFuture<DetectQRCodesResponse> detectQRCodes(DetectQRCodesRequest request);

    CompletableFuture<EncodeBlindWatermarkResponse> encodeBlindWatermark(EncodeBlindWatermarkRequest request);

    CompletableFuture<FindImagesResponse> findImages(FindImagesRequest request);

    CompletableFuture<FindSimilarFacesResponse> findSimilarFaces(FindSimilarFacesRequest request);

    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    CompletableFuture<GetImageCroppingSuggestionsResponse> getImageCroppingSuggestions(GetImageCroppingSuggestionsRequest request);

    CompletableFuture<GetImageQualityResponse> getImageQuality(GetImageQualityRequest request);

    CompletableFuture<GetMediaMetaResponse> getMediaMeta(GetMediaMetaRequest request);

    CompletableFuture<GetOfficeConversionTaskResponse> getOfficeConversionTask(GetOfficeConversionTaskRequest request);

    CompletableFuture<GetOfficePreviewURLResponse> getOfficePreviewURL(GetOfficePreviewURLRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetSetResponse> getSet(GetSetRequest request);

    CompletableFuture<GetVideoResponse> getVideo(GetVideoRequest request);

    CompletableFuture<GetVideoTaskResponse> getVideoTask(GetVideoTaskRequest request);

    CompletableFuture<GetWebofficeURLResponse> getWebofficeURL(GetWebofficeURLRequest request);

    CompletableFuture<IndexImageResponse> indexImage(IndexImageRequest request);

    CompletableFuture<IndexVideoResponse> indexVideo(IndexVideoRequest request);

    CompletableFuture<ListFaceGroupsResponse> listFaceGroups(ListFaceGroupsRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListOfficeConversionTaskResponse> listOfficeConversionTask(ListOfficeConversionTaskRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListSetTagsResponse> listSetTags(ListSetTagsRequest request);

    CompletableFuture<ListSetsResponse> listSets(ListSetsRequest request);

    CompletableFuture<ListVideoAudiosResponse> listVideoAudios(ListVideoAudiosRequest request);

    CompletableFuture<ListVideoFramesResponse> listVideoFrames(ListVideoFramesRequest request);

    CompletableFuture<ListVideoTasksResponse> listVideoTasks(ListVideoTasksRequest request);

    CompletableFuture<ListVideosResponse> listVideos(ListVideosRequest request);

    CompletableFuture<OpenImmServiceResponse> openImmService(OpenImmServiceRequest request);

    CompletableFuture<PutProjectResponse> putProject(PutProjectRequest request);

    CompletableFuture<RefreshOfficePreviewTokenResponse> refreshOfficePreviewToken(RefreshOfficePreviewTokenRequest request);

    CompletableFuture<RefreshWebofficeTokenResponse> refreshWebofficeToken(RefreshWebofficeTokenRequest request);

    CompletableFuture<UpdateFaceGroupResponse> updateFaceGroup(UpdateFaceGroupRequest request);

    CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateSetResponse> updateSet(UpdateSetRequest request);

}
