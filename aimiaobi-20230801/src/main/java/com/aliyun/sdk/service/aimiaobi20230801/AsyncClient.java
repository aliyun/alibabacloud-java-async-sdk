// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aimiaobi20230801.models.*;
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

    CompletableFuture<CancelAsyncTaskResponse> cancelAsyncTask(CancelAsyncTaskRequest request);

    CompletableFuture<CreateGeneratedContentResponse> createGeneratedContent(CreateGeneratedContentRequest request);

    CompletableFuture<CreateTokenResponse> createToken(CreateTokenRequest request);

    CompletableFuture<DeleteGeneratedContentResponse> deleteGeneratedContent(DeleteGeneratedContentRequest request);

    CompletableFuture<DeleteMaterialByIdResponse> deleteMaterialById(DeleteMaterialByIdRequest request);

    CompletableFuture<ExportGeneratedContentResponse> exportGeneratedContent(ExportGeneratedContentRequest request);

    CompletableFuture<FeedbackDialogueResponse> feedbackDialogue(FeedbackDialogueRequest request);

    CompletableFuture<FetchImageTaskResponse> fetchImageTask(FetchImageTaskRequest request);

    CompletableFuture<GenerateImageTaskResponse> generateImageTask(GenerateImageTaskRequest request);

    CompletableFuture<GenerateViewPointResponse> generateViewPoint(GenerateViewPointRequest request);

    CompletableFuture<GetDataSourceOrderConfigResponse> getDataSourceOrderConfig(GetDataSourceOrderConfigRequest request);

    CompletableFuture<GetGeneratedContentResponse> getGeneratedContent(GetGeneratedContentRequest request);

    CompletableFuture<GetMaterialByIdResponse> getMaterialById(GetMaterialByIdRequest request);

    CompletableFuture<GetPropertiesResponse> getProperties(GetPropertiesRequest request);

    CompletableFuture<ListAsyncTasksResponse> listAsyncTasks(ListAsyncTasksRequest request);

    CompletableFuture<ListBuildConfigsResponse> listBuildConfigs(ListBuildConfigsRequest request);

    CompletableFuture<ListDialoguesResponse> listDialogues(ListDialoguesRequest request);

    CompletableFuture<ListGeneratedContentsResponse> listGeneratedContents(ListGeneratedContentsRequest request);

    CompletableFuture<ListHotNewsWithTypeResponse> listHotNewsWithType(ListHotNewsWithTypeRequest request);

    CompletableFuture<ListMaterialDocumentsResponse> listMaterialDocuments(ListMaterialDocumentsRequest request);

    CompletableFuture<ListVersionsResponse> listVersions(ListVersionsRequest request);

    CompletableFuture<QueryAsyncTaskResponse> queryAsyncTask(QueryAsyncTaskRequest request);

    CompletableFuture<SaveDataSourceOrderConfigResponse> saveDataSourceOrderConfig(SaveDataSourceOrderConfigRequest request);

    CompletableFuture<SaveMaterialDocumentResponse> saveMaterialDocument(SaveMaterialDocumentRequest request);

    CompletableFuture<SubmitAsyncTaskResponse> submitAsyncTask(SubmitAsyncTaskRequest request);

    CompletableFuture<UpdateGeneratedContentResponse> updateGeneratedContent(UpdateGeneratedContentRequest request);

    CompletableFuture<UpdateMaterialDocumentResponse> updateMaterialDocument(UpdateMaterialDocumentRequest request);

}
