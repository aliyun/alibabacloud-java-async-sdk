// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.imm20200930.models.*;
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

    CompletableFuture<AddImageMosaicResponse> addImageMosaic(AddImageMosaicRequest request);

    CompletableFuture<AddStoryFilesResponse> addStoryFiles(AddStoryFilesRequest request);

    CompletableFuture<AttachOSSBucketResponse> attachOSSBucket(AttachOSSBucketRequest request);

    CompletableFuture<BatchDeleteFileMetaResponse> batchDeleteFileMeta(BatchDeleteFileMetaRequest request);

    CompletableFuture<BatchGetFigureClusterResponse> batchGetFigureCluster(BatchGetFigureClusterRequest request);

    CompletableFuture<BatchGetFileMetaResponse> batchGetFileMeta(BatchGetFileMetaRequest request);

    CompletableFuture<BatchIndexFileMetaResponse> batchIndexFileMeta(BatchIndexFileMetaRequest request);

    CompletableFuture<BatchUpdateFileMetaResponse> batchUpdateFileMeta(BatchUpdateFileMetaRequest request);

    CompletableFuture<CompareImageFacesResponse> compareImageFaces(CompareImageFacesRequest request);

    CompletableFuture<CreateArchiveFileInspectionTaskResponse> createArchiveFileInspectionTask(CreateArchiveFileInspectionTaskRequest request);

    CompletableFuture<CreateBatchResponse> createBatch(CreateBatchRequest request);

    CompletableFuture<CreateBindingResponse> createBinding(CreateBindingRequest request);

    CompletableFuture<CreateCompressPointCloudTaskResponse> createCompressPointCloudTask(CreateCompressPointCloudTaskRequest request);

    CompletableFuture<CreateCustomizedStoryResponse> createCustomizedStory(CreateCustomizedStoryRequest request);

    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    CompletableFuture<CreateDecodeBlindWatermarkTaskResponse> createDecodeBlindWatermarkTask(CreateDecodeBlindWatermarkTaskRequest request);

    CompletableFuture<CreateFacesSearchingTaskResponse> createFacesSearchingTask(CreateFacesSearchingTaskRequest request);

    CompletableFuture<CreateFigureClusteringTaskResponse> createFigureClusteringTask(CreateFigureClusteringTaskRequest request);

    CompletableFuture<CreateFigureClustersMergingTaskResponse> createFigureClustersMergingTask(CreateFigureClustersMergingTaskRequest request);

    CompletableFuture<CreateFileCompressionTaskResponse> createFileCompressionTask(CreateFileCompressionTaskRequest request);

    CompletableFuture<CreateFileUncompressionTaskResponse> createFileUncompressionTask(CreateFileUncompressionTaskRequest request);

    CompletableFuture<CreateImageModerationTaskResponse> createImageModerationTask(CreateImageModerationTaskRequest request);

    CompletableFuture<CreateImageSplicingTaskResponse> createImageSplicingTask(CreateImageSplicingTaskRequest request);

    CompletableFuture<CreateImageToPDFTaskResponse> createImageToPDFTask(CreateImageToPDFTaskRequest request);

    CompletableFuture<CreateLocationDateClusteringTaskResponse> createLocationDateClusteringTask(CreateLocationDateClusteringTaskRequest request);

    CompletableFuture<CreateMediaConvertTaskResponse> createMediaConvertTask(CreateMediaConvertTaskRequest request);

    CompletableFuture<CreateOfficeConversionTaskResponse> createOfficeConversionTask(CreateOfficeConversionTaskRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateSimilarImageClusteringTaskResponse> createSimilarImageClusteringTask(CreateSimilarImageClusteringTaskRequest request);

    CompletableFuture<CreateStoryResponse> createStory(CreateStoryRequest request);

    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    CompletableFuture<CreateVideoLabelClassificationTaskResponse> createVideoLabelClassificationTask(CreateVideoLabelClassificationTaskRequest request);

    CompletableFuture<CreateVideoModerationTaskResponse> createVideoModerationTask(CreateVideoModerationTaskRequest request);

    CompletableFuture<DeleteBatchResponse> deleteBatch(DeleteBatchRequest request);

    CompletableFuture<DeleteBindingResponse> deleteBinding(DeleteBindingRequest request);

    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    CompletableFuture<DeleteFileMetaResponse> deleteFileMeta(DeleteFileMetaRequest request);

    CompletableFuture<DeleteLocationDateClusterResponse> deleteLocationDateCluster(DeleteLocationDateClusterRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteStoryResponse> deleteStory(DeleteStoryRequest request);

    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    CompletableFuture<DetachOSSBucketResponse> detachOSSBucket(DetachOSSBucketRequest request);

    CompletableFuture<DetectImageBodiesResponse> detectImageBodies(DetectImageBodiesRequest request);

    CompletableFuture<DetectImageCarsResponse> detectImageCars(DetectImageCarsRequest request);

    CompletableFuture<DetectImageCodesResponse> detectImageCodes(DetectImageCodesRequest request);

    CompletableFuture<DetectImageCroppingResponse> detectImageCropping(DetectImageCroppingRequest request);

    CompletableFuture<DetectImageFacesResponse> detectImageFaces(DetectImageFacesRequest request);

    CompletableFuture<DetectImageLabelsResponse> detectImageLabels(DetectImageLabelsRequest request);

    CompletableFuture<DetectImageScoreResponse> detectImageScore(DetectImageScoreRequest request);

    CompletableFuture<DetectImageTextsResponse> detectImageTexts(DetectImageTextsRequest request);

    CompletableFuture<DetectMediaMetaResponse> detectMediaMeta(DetectMediaMetaRequest request);

    CompletableFuture<DetectTextAnomalyResponse> detectTextAnomaly(DetectTextAnomalyRequest request);

    CompletableFuture<EncodeBlindWatermarkResponse> encodeBlindWatermark(EncodeBlindWatermarkRequest request);

    CompletableFuture<ExtractDocumentTextResponse> extractDocumentText(ExtractDocumentTextRequest request);

    CompletableFuture<FuzzyQueryResponse> fuzzyQuery(FuzzyQueryRequest request);

    CompletableFuture<GenerateVideoPlaylistResponse> generateVideoPlaylist(GenerateVideoPlaylistRequest request);

    CompletableFuture<GenerateWebofficeTokenResponse> generateWebofficeToken(GenerateWebofficeTokenRequest request);

    CompletableFuture<GetBatchResponse> getBatch(GetBatchRequest request);

    CompletableFuture<GetBindingResponse> getBinding(GetBindingRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetDRMLicenseResponse> getDRMLicense(GetDRMLicenseRequest request);

    CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request);

    CompletableFuture<GetDecodeBlindWatermarkResultResponse> getDecodeBlindWatermarkResult(GetDecodeBlindWatermarkResultRequest request);

    CompletableFuture<GetFigureClusterResponse> getFigureCluster(GetFigureClusterRequest request);

    CompletableFuture<GetFileMetaResponse> getFileMeta(GetFileMetaRequest request);

    CompletableFuture<GetImageModerationResultResponse> getImageModerationResult(GetImageModerationResultRequest request);

    CompletableFuture<GetOSSBucketAttachmentResponse> getOSSBucketAttachment(GetOSSBucketAttachmentRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetStoryResponse> getStory(GetStoryRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request);

    CompletableFuture<GetVideoLabelClassificationResultResponse> getVideoLabelClassificationResult(GetVideoLabelClassificationResultRequest request);

    CompletableFuture<GetVideoModerationResultResponse> getVideoModerationResult(GetVideoModerationResultRequest request);

    CompletableFuture<IndexFileMetaResponse> indexFileMeta(IndexFileMetaRequest request);

    CompletableFuture<ListBatchesResponse> listBatches(ListBatchesRequest request);

    CompletableFuture<ListBindingsResponse> listBindings(ListBindingsRequest request);

    CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    CompletableFuture<QueryFigureClustersResponse> queryFigureClusters(QueryFigureClustersRequest request);

    CompletableFuture<QueryLocationDateClustersResponse> queryLocationDateClusters(QueryLocationDateClustersRequest request);

    CompletableFuture<QuerySimilarImageClustersResponse> querySimilarImageClusters(QuerySimilarImageClustersRequest request);

    CompletableFuture<QueryStoriesResponse> queryStories(QueryStoriesRequest request);

    CompletableFuture<RefreshWebofficeTokenResponse> refreshWebofficeToken(RefreshWebofficeTokenRequest request);

    CompletableFuture<RemoveStoryFilesResponse> removeStoryFiles(RemoveStoryFilesRequest request);

    CompletableFuture<ResumeBatchResponse> resumeBatch(ResumeBatchRequest request);

    CompletableFuture<ResumeTriggerResponse> resumeTrigger(ResumeTriggerRequest request);

    CompletableFuture<SearchImageFigureClusterResponse> searchImageFigureCluster(SearchImageFigureClusterRequest request);

    CompletableFuture<SemanticQueryResponse> semanticQuery(SemanticQueryRequest request);

    CompletableFuture<SimpleQueryResponse> simpleQuery(SimpleQueryRequest request);

    CompletableFuture<SuspendBatchResponse> suspendBatch(SuspendBatchRequest request);

    CompletableFuture<SuspendTriggerResponse> suspendTrigger(SuspendTriggerRequest request);

    CompletableFuture<UpdateBatchResponse> updateBatch(UpdateBatchRequest request);

    CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request);

    CompletableFuture<UpdateFigureClusterResponse> updateFigureCluster(UpdateFigureClusterRequest request);

    CompletableFuture<UpdateFileMetaResponse> updateFileMeta(UpdateFileMetaRequest request);

    CompletableFuture<UpdateLocationDateClusterResponse> updateLocationDateCluster(UpdateLocationDateClusterRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateStoryResponse> updateStory(UpdateStoryRequest request);

    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

}
