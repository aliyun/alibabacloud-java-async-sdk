// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yike20260707.models.*;
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
     * @param request the request parameters of BatchGetMedias  BatchGetMediasRequest
     * @return BatchGetMediasResponse
     */
    CompletableFuture<BatchGetMediasResponse> batchGetMedias(BatchGetMediasRequest request);

    /**
     * @param request the request parameters of CreateAssetCategory  CreateAssetCategoryRequest
     * @return CreateAssetCategoryResponse
     */
    CompletableFuture<CreateAssetCategoryResponse> createAssetCategory(CreateAssetCategoryRequest request);

    /**
     * @param request the request parameters of DeleteAssetCategory  DeleteAssetCategoryRequest
     * @return DeleteAssetCategoryResponse
     */
    CompletableFuture<DeleteAssetCategoryResponse> deleteAssetCategory(DeleteAssetCategoryRequest request);

    /**
     * @param request the request parameters of DeleteMedias  DeleteMediasRequest
     * @return DeleteMediasResponse
     */
    CompletableFuture<DeleteMediasResponse> deleteMedias(DeleteMediasRequest request);

    /**
     * @param request the request parameters of GetAssetCategory  GetAssetCategoryRequest
     * @return GetAssetCategoryResponse
     */
    CompletableFuture<GetAssetCategoryResponse> getAssetCategory(GetAssetCategoryRequest request);

    /**
     * @param request the request parameters of GetImageGenerationJob  GetImageGenerationJobRequest
     * @return GetImageGenerationJobResponse
     */
    CompletableFuture<GetImageGenerationJobResponse> getImageGenerationJob(GetImageGenerationJobRequest request);

    /**
     * @param request the request parameters of GetMedia  GetMediaRequest
     * @return GetMediaResponse
     */
    CompletableFuture<GetMediaResponse> getMedia(GetMediaRequest request);

    /**
     * @param request the request parameters of GetMediaComprehensionJob  GetMediaComprehensionJobRequest
     * @return GetMediaComprehensionJobResponse
     */
    CompletableFuture<GetMediaComprehensionJobResponse> getMediaComprehensionJob(GetMediaComprehensionJobRequest request);

    /**
     * @param request the request parameters of GetVideoGenerationJob  GetVideoGenerationJobRequest
     * @return GetVideoGenerationJobResponse
     */
    CompletableFuture<GetVideoGenerationJobResponse> getVideoGenerationJob(GetVideoGenerationJobRequest request);

    /**
     * @param request the request parameters of GetYikeAccountCredit  GetYikeAccountCreditRequest
     * @return GetYikeAccountCreditResponse
     */
    CompletableFuture<GetYikeAccountCreditResponse> getYikeAccountCredit(GetYikeAccountCreditRequest request);

    /**
     * @param request the request parameters of GetYikeJobCredit  GetYikeJobCreditRequest
     * @return GetYikeJobCreditResponse
     */
    CompletableFuture<GetYikeJobCreditResponse> getYikeJobCredit(GetYikeJobCreditRequest request);

    /**
     * @param request the request parameters of ImportMedia  ImportMediaRequest
     * @return ImportMediaResponse
     */
    CompletableFuture<ImportMediaResponse> importMedia(ImportMediaRequest request);

    /**
     * @param request the request parameters of ListAssetCategories  ListAssetCategoriesRequest
     * @return ListAssetCategoriesResponse
     */
    CompletableFuture<ListAssetCategoriesResponse> listAssetCategories(ListAssetCategoriesRequest request);

    /**
     * @param request the request parameters of SearchMedia  SearchMediaRequest
     * @return SearchMediaResponse
     */
    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    /**
     * @param request the request parameters of SubmitImageGenerationJob  SubmitImageGenerationJobRequest
     * @return SubmitImageGenerationJobResponse
     */
    CompletableFuture<SubmitImageGenerationJobResponse> submitImageGenerationJob(SubmitImageGenerationJobRequest request);

    /**
     * @param request the request parameters of SubmitMediaComprehensionJob  SubmitMediaComprehensionJobRequest
     * @return SubmitMediaComprehensionJobResponse
     */
    CompletableFuture<SubmitMediaComprehensionJobResponse> submitMediaComprehensionJob(SubmitMediaComprehensionJobRequest request);

    /**
     * @param request the request parameters of SubmitVideoGenerationJob  SubmitVideoGenerationJobRequest
     * @return SubmitVideoGenerationJobResponse
     */
    CompletableFuture<SubmitVideoGenerationJobResponse> submitVideoGenerationJob(SubmitVideoGenerationJobRequest request);

    /**
     * @param request the request parameters of SubmitVideoTranslationJob  SubmitVideoTranslationJobRequest
     * @return SubmitVideoTranslationJobResponse
     */
    CompletableFuture<SubmitVideoTranslationJobResponse> submitVideoTranslationJob(SubmitVideoTranslationJobRequest request);

    /**
     * @param request the request parameters of UpdateAssetCategory  UpdateAssetCategoryRequest
     * @return UpdateAssetCategoryResponse
     */
    CompletableFuture<UpdateAssetCategoryResponse> updateAssetCategory(UpdateAssetCategoryRequest request);

    /**
     * @param request the request parameters of UpdateMedia  UpdateMediaRequest
     * @return UpdateMediaResponse
     */
    CompletableFuture<UpdateMediaResponse> updateMedia(UpdateMediaRequest request);

}
