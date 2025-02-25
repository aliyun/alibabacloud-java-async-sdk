// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.green20180509.models.*;
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

    CompletableFuture<AddFacesResponse> addFaces(AddFacesRequest request);

    CompletableFuture<AddGroupsResponse> addGroups(AddGroupsRequest request);

    CompletableFuture<AddPersonResponse> addPerson(AddPersonRequest request);

    CompletableFuture<AddSimilarityImageResponse> addSimilarityImage(AddSimilarityImageRequest request);

    CompletableFuture<AddSimilarityLibraryResponse> addSimilarityLibrary(AddSimilarityLibraryRequest request);

    CompletableFuture<AddVideoDnaResponse> addVideoDna(AddVideoDnaRequest request);

    CompletableFuture<AddVideoDnaGroupResponse> addVideoDnaGroup(AddVideoDnaGroupRequest request);

    CompletableFuture<DeleteFacesResponse> deleteFaces(DeleteFacesRequest request);

    CompletableFuture<DeleteGroupsResponse> deleteGroups(DeleteGroupsRequest request);

    CompletableFuture<DeletePersonResponse> deletePerson(DeletePersonRequest request);

    CompletableFuture<DeleteSimilarityImageResponse> deleteSimilarityImage(DeleteSimilarityImageRequest request);

    CompletableFuture<DeleteSimilarityLibraryResponse> deleteSimilarityLibrary(DeleteSimilarityLibraryRequest request);

    CompletableFuture<DeleteVideoDnaResponse> deleteVideoDna(DeleteVideoDnaRequest request);

    CompletableFuture<DeleteVideoDnaGroupResponse> deleteVideoDnaGroup(DeleteVideoDnaGroupRequest request);

    CompletableFuture<DetectFaceResponse> detectFace(DetectFaceRequest request);

    CompletableFuture<FileAsyncScanResponse> fileAsyncScan(FileAsyncScanRequest request);

    CompletableFuture<FileAsyncScanResultsResponse> fileAsyncScanResults(FileAsyncScanResultsRequest request);

    CompletableFuture<FileAsyncScanV2Response> fileAsyncScanV2(FileAsyncScanV2Request request);

    CompletableFuture<GetFacesResponse> getFaces(GetFacesRequest request);

    CompletableFuture<GetGroupsResponse> getGroups(GetGroupsRequest request);

    CompletableFuture<GetPersonResponse> getPerson(GetPersonRequest request);

    CompletableFuture<GetPersonsResponse> getPersons(GetPersonsRequest request);

    CompletableFuture<GetSimilarityImageResponse> getSimilarityImage(GetSimilarityImageRequest request);

    CompletableFuture<GetSimilarityLibraryResponse> getSimilarityLibrary(GetSimilarityLibraryRequest request);

    CompletableFuture<ImageAsyncManualScanResponse> imageAsyncManualScan(ImageAsyncManualScanRequest request);

    CompletableFuture<ImageAsyncManualScanResultsResponse> imageAsyncManualScanResults(ImageAsyncManualScanResultsRequest request);

    CompletableFuture<ImageAsyncScanResponse> imageAsyncScan(ImageAsyncScanRequest request);

    CompletableFuture<ImageAsyncScanResultsResponse> imageAsyncScanResults(ImageAsyncScanResultsRequest request);

    CompletableFuture<ImageScanFeedbackResponse> imageScanFeedback(ImageScanFeedbackRequest request);

    CompletableFuture<ImageSyncScanResponse> imageSyncScan(ImageSyncScanRequest request);

    CompletableFuture<ListSimilarityImagesResponse> listSimilarityImages(ListSimilarityImagesRequest request);

    CompletableFuture<ListSimilarityLibrariesResponse> listSimilarityLibraries(ListSimilarityLibrariesRequest request);

    CompletableFuture<LiveStreamAsyncScanResponse> liveStreamAsyncScan(LiveStreamAsyncScanRequest request);

    CompletableFuture<LiveStreamAsyncScanResultsResponse> liveStreamAsyncScanResults(LiveStreamAsyncScanResultsRequest request);

    CompletableFuture<LiveStreamCancelScanResponse> liveStreamCancelScan(LiveStreamCancelScanRequest request);

    CompletableFuture<SetPersonResponse> setPerson(SetPersonRequest request);

    CompletableFuture<TextAsyncManualScanResponse> textAsyncManualScan(TextAsyncManualScanRequest request);

    CompletableFuture<TextAsyncManualScanResultsResponse> textAsyncManualScanResults(TextAsyncManualScanResultsRequest request);

    CompletableFuture<TextFeedbackResponse> textFeedback(TextFeedbackRequest request);

    CompletableFuture<TextScanResponse> textScan(TextScanRequest request);

    CompletableFuture<UploadCredentialsResponse> uploadCredentials(UploadCredentialsRequest request);

    CompletableFuture<VideoAsyncManualScanResponse> videoAsyncManualScan(VideoAsyncManualScanRequest request);

    CompletableFuture<VideoAsyncManualScanResultsResponse> videoAsyncManualScanResults(VideoAsyncManualScanResultsRequest request);

    CompletableFuture<VideoAsyncScanResponse> videoAsyncScan(VideoAsyncScanRequest request);

    CompletableFuture<VideoAsyncScanResultsResponse> videoAsyncScanResults(VideoAsyncScanResultsRequest request);

    CompletableFuture<VideoCancelScanResponse> videoCancelScan(VideoCancelScanRequest request);

    CompletableFuture<VideoFeedbackResponse> videoFeedback(VideoFeedbackRequest request);

    CompletableFuture<VideoSyncScanResponse> videoSyncScan(VideoSyncScanRequest request);

    CompletableFuture<VodAsyncScanResponse> vodAsyncScan(VodAsyncScanRequest request);

    CompletableFuture<VodAsyncScanResultsResponse> vodAsyncScanResults(VodAsyncScanResultsRequest request);

    CompletableFuture<VoiceAsyncManualScanResponse> voiceAsyncManualScan(VoiceAsyncManualScanRequest request);

    CompletableFuture<VoiceAsyncManualScanResultsResponse> voiceAsyncManualScanResults(VoiceAsyncManualScanResultsRequest request);

    CompletableFuture<VoiceAsyncScanResponse> voiceAsyncScan(VoiceAsyncScanRequest request);

    CompletableFuture<VoiceAsyncScanResultsResponse> voiceAsyncScanResults(VoiceAsyncScanResultsRequest request);

    CompletableFuture<VoiceCancelScanResponse> voiceCancelScan(VoiceCancelScanRequest request);

    CompletableFuture<VoiceIdentityCheckResponse> voiceIdentityCheck(VoiceIdentityCheckRequest request);

    CompletableFuture<VoiceIdentityRegisterResponse> voiceIdentityRegister(VoiceIdentityRegisterRequest request);

    CompletableFuture<VoiceIdentityStartCheckResponse> voiceIdentityStartCheck(VoiceIdentityStartCheckRequest request);

    CompletableFuture<VoiceIdentityStartRegisterResponse> voiceIdentityStartRegister(VoiceIdentityStartRegisterRequest request);

    CompletableFuture<VoiceIdentityUnregisterResponse> voiceIdentityUnregister(VoiceIdentityUnregisterRequest request);

    CompletableFuture<VoiceSyncScanResponse> voiceSyncScan(VoiceSyncScanRequest request);

    CompletableFuture<WebpageAsyncScanResponse> webpageAsyncScan(WebpageAsyncScanRequest request);

    CompletableFuture<WebpageAsyncScanResultsResponse> webpageAsyncScanResults(WebpageAsyncScanResultsRequest request);

    CompletableFuture<WebpageSyncScanResponse> webpageSyncScan(WebpageSyncScanRequest request);

}
