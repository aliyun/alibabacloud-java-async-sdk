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
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * @param request the request parameters of BatchGetMedias  BatchGetMediasRequest
     * @return BatchGetMediasResponse
     */
    CompletableFuture<BatchGetMediasResponse> batchGetMedias(BatchGetMediasRequest request);

    /**
     * <b>description</b> :
     * <p>Categories support up to three levels, and each level supports up to 100 subcategories.</p>
     * 
     * @param request the request parameters of CreateAssetCategory  CreateAssetCategoryRequest
     * @return CreateAssetCategoryResponse
     */
    CompletableFuture<CreateAssetCategoryResponse> createAssetCategory(CreateAssetCategoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation is used to query media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of CreateInfiniteCanvas  CreateInfiniteCanvasRequest
     * @return CreateInfiniteCanvasResponse
     */
    CompletableFuture<CreateInfiniteCanvasResponse> createInfiniteCanvas(CreateInfiniteCanvasRequest request);

    /**
     * <b>description</b> :
     * <p>This operation also deletes all subcategories (including second-level and third-level categories). Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteAssetCategory  DeleteAssetCategoryRequest
     * @return DeleteAssetCategoryResponse
     */
    CompletableFuture<DeleteAssetCategoryResponse> deleteAssetCategory(DeleteAssetCategoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation is used to query media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of DeleteInfiniteCanvas  DeleteInfiniteCanvasRequest
     * @return DeleteInfiniteCanvasResponse
     */
    CompletableFuture<DeleteInfiniteCanvasResponse> deleteInfiniteCanvas(DeleteInfiniteCanvasRequest request);

    /**
     * @param request the request parameters of DeleteMedias  DeleteMediasRequest
     * @return DeleteMediasResponse
     */
    CompletableFuture<DeleteMediasResponse> deleteMedias(DeleteMediasRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice:  The AI generation-related API operations in the 2026-03-19 API version will be deprecated soon. Upgrade to the 2026-07-07 API version.</notice></p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateYikeLoginToken  GenerateYikeLoginTokenRequest
     * @return GenerateYikeLoginTokenResponse
     */
    CompletableFuture<GenerateYikeLoginTokenResponse> generateYikeLoginToken(GenerateYikeLoginTokenRequest request);

    /**
     * @param request the request parameters of GetAgentJob  GetAgentJobRequest
     * @return GetAgentJobResponse
     */
    CompletableFuture<GetAgentJobResponse> getAgentJob(GetAgentJobRequest request);

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
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API is used to query a media asset content understanding job.</p>
     * 
     * @param request the request parameters of GetInfiniteCanvas  GetInfiniteCanvasRequest
     * @return GetInfiniteCanvasResponse
     */
    CompletableFuture<GetInfiniteCanvasResponse> getInfiniteCanvas(GetInfiniteCanvasRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation is used to query a media content analysis job.</p>
     * 
     * @param request the request parameters of GetMedia  GetMediaRequest
     * @return GetMediaResponse
     */
    CompletableFuture<GetMediaResponse> getMedia(GetMediaRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API is used to query a media asset content understanding job.</p>
     * 
     * @param request the request parameters of GetMediaComprehensionJob  GetMediaComprehensionJobRequest
     * @return GetMediaComprehensionJobResponse
     */
    CompletableFuture<GetMediaComprehensionJobResponse> getMediaComprehensionJob(GetMediaComprehensionJobRequest request);

    /**
     * @param request the request parameters of GetRemakeScriptJob  GetRemakeScriptJobRequest
     * @return GetRemakeScriptJobResponse
     */
    CompletableFuture<GetRemakeScriptJobResponse> getRemakeScriptJob(GetRemakeScriptJobRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status, input, parameters, and desired state result of a video text erasure task based on <code>JobId</code>.</p>
     * 
     * @param request the request parameters of GetVideoDetextJob  GetVideoDetextJobRequest
     * @return GetVideoDetextJobResponse
     */
    CompletableFuture<GetVideoDetextJobResponse> getVideoDetextJob(GetVideoDetextJobRequest request);

    /**
     * @param request the request parameters of GetVideoGenerationJob  GetVideoGenerationJobRequest
     * @return GetVideoGenerationJobResponse
     */
    CompletableFuture<GetVideoGenerationJobResponse> getVideoGenerationJob(GetVideoGenerationJobRequest request);

    /**
     * @param request the request parameters of GetVideoRenderJob  GetVideoRenderJobRequest
     * @return GetVideoRenderJobResponse
     */
    CompletableFuture<GetVideoRenderJobResponse> getVideoRenderJob(GetVideoRenderJobRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status, input, parameters, and desired state results of a video translation job based on the <code>JobId</code>.</p>
     * 
     * @param request the request parameters of GetVideoTranslationJob  GetVideoTranslationJobRequest
     * @return GetVideoTranslationJobResponse
     */
    CompletableFuture<GetVideoTranslationJobResponse> getVideoTranslationJob(GetVideoTranslationJobRequest request);

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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API is used to query media content analysis jobs.</p>
     * 
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API is used to query media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of ListInfiniteCanvases  ListInfiniteCanvasesRequest
     * @return ListInfiniteCanvasesResponse
     */
    CompletableFuture<ListInfiniteCanvasesResponse> listInfiniteCanvases(ListInfiniteCanvasesRequest request);

    /**
     * @param request the request parameters of SearchMedia  SearchMediaRequest
     * @return SearchMediaResponse
     */
    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    /**
     * @param request the request parameters of SubmitAgentJob  SubmitAgentJobRequest
     * @return SubmitAgentJobResponse
     */
    CompletableFuture<SubmitAgentJobResponse> submitAgentJob(SubmitAgentJobRequest request);

    /**
     * @param request the request parameters of SubmitImageGenerationJob  SubmitImageGenerationJobRequest
     * @return SubmitImageGenerationJobResponse
     */
    CompletableFuture<SubmitImageGenerationJobResponse> submitImageGenerationJob(SubmitImageGenerationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation performs content understanding based on the provided media asset files (such as video URLs). You can pass custom parameters through the <code>UserData</code> field, which are returned as-is in the callback.</p>
     * 
     * @param request the request parameters of SubmitMediaComprehensionJob  SubmitMediaComprehensionJobRequest
     * @return SubmitMediaComprehensionJobResponse
     */
    CompletableFuture<SubmitMediaComprehensionJobResponse> submitMediaComprehensionJob(SubmitMediaComprehensionJobRequest request);

    /**
     * <b>description</b> :
     * <p>This API generates a new voiceover script based on content comprehension results and new product/model information by imitating the style of the original script. You can pass custom parameters through the UserData field, which are returned as-is in the callback.</p>
     * 
     * @param request the request parameters of SubmitRemakeScriptJob  SubmitRemakeScriptJobRequest
     * @return SubmitRemakeScriptJobResponse
     */
    CompletableFuture<SubmitRemakeScriptJobResponse> submitRemakeScriptJob(SubmitRemakeScriptJobRequest request);

    /**
     * <b>description</b> :
     * <p>Submits an asynchronous video text erasure task. The input can be an accessible video URL or a Yike video media asset ID. You can configure the erasure time range and text regions.</p>
     * 
     * @param request the request parameters of SubmitVideoDetextJob  SubmitVideoDetextJobRequest
     * @return SubmitVideoDetextJobResponse
     */
    CompletableFuture<SubmitVideoDetextJobResponse> submitVideoDetextJob(SubmitVideoDetextJobRequest request);

    /**
     * @param request the request parameters of SubmitVideoGenerationJob  SubmitVideoGenerationJobRequest
     * @return SubmitVideoGenerationJobResponse
     */
    CompletableFuture<SubmitVideoGenerationJobResponse> submitVideoGenerationJob(SubmitVideoGenerationJobRequest request);

    /**
     * @param request the request parameters of SubmitVideoRenderJob  SubmitVideoRenderJobRequest
     * @return SubmitVideoRenderJobResponse
     */
    CompletableFuture<SubmitVideoRenderJobResponse> submitVideoRenderJob(SubmitVideoRenderJobRequest request);

    /**
     * <b>description</b> :
     * <p>Submits an asynchronous video translation task. The input supports a media URL or an Intelligent Media Management (IMM) media asset ID. Task parameters specify the source language, target language, and translation capabilities to enable.</p>
     * 
     * @param request the request parameters of SubmitVideoTranslationJob  SubmitVideoTranslationJobRequest
     * @return SubmitVideoTranslationJobResponse
     */
    CompletableFuture<SubmitVideoTranslationJobResponse> submitVideoTranslationJob(SubmitVideoTranslationJobRequest request);

    /**
     * <b>description</b> :
     * <p>After creating a media asset category, you can call this operation to locate and update the name of the category by category ID.</p>
     * 
     * @param request the request parameters of UpdateAssetCategory  UpdateAssetCategoryRequest
     * @return UpdateAssetCategoryResponse
     */
    CompletableFuture<UpdateAssetCategoryResponse> updateAssetCategory(UpdateAssetCategoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation is used to query media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of UpdateInfiniteCanvas  UpdateInfiniteCanvasRequest
     * @return UpdateInfiniteCanvasResponse
     */
    CompletableFuture<UpdateInfiniteCanvasResponse> updateInfiniteCanvas(UpdateInfiniteCanvasRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation is used to query media content understanding jobs.</p>
     * 
     * @param request the request parameters of UpdateMedia  UpdateMediaRequest
     * @return UpdateMediaResponse
     */
    CompletableFuture<UpdateMediaResponse> updateMedia(UpdateMediaRequest request);

}
