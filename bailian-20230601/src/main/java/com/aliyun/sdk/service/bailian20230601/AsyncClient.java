// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bailian20230601.models.*;
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

    CompletableFuture<AddEnterpriseTagResponse> addEnterpriseTag(AddEnterpriseTagRequest request);

    CompletableFuture<CancelFineTuneJobResponse> cancelFineTuneJob(CancelFineTuneJobRequest request);

    CompletableFuture<CreateFineTuneJobResponse> createFineTuneJob(CreateFineTuneJobRequest request);

    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    CompletableFuture<CreateTextEmbeddingsResponse> createTextEmbeddings(CreateTextEmbeddingsRequest request);

    CompletableFuture<CreateTokenResponse> createToken(CreateTokenRequest request);

    CompletableFuture<DelEnterpriseTagResponse> delEnterpriseTag(DelEnterpriseTagRequest request);

    CompletableFuture<DeleteEnterpriseDataResponse> deleteEnterpriseData(DeleteEnterpriseDataRequest request);

    CompletableFuture<DeleteFineTuneJobResponse> deleteFineTuneJob(DeleteFineTuneJobRequest request);

    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    CompletableFuture<DescribeFineTuneJobResponse> describeFineTuneJob(DescribeFineTuneJobRequest request);

    CompletableFuture<DescribeServiceResponse> describeService(DescribeServiceRequest request);

    CompletableFuture<GetEnterpriseDataByDataIdResponse> getEnterpriseDataByDataId(GetEnterpriseDataByDataIdRequest request);

    CompletableFuture<GetEnterpriseDataChunkResponse> getEnterpriseDataChunk(GetEnterpriseDataChunkRequest request);

    CompletableFuture<GetEnterpriseDataPageImageResponse> getEnterpriseDataPageImage(GetEnterpriseDataPageImageRequest request);

    CompletableFuture<GetEnterpriseDataParseResultResponse> getEnterpriseDataParseResult(GetEnterpriseDataParseResultRequest request);

    CompletableFuture<GetFileStoreUploadPolicyResponse> getFileStoreUploadPolicy(GetFileStoreUploadPolicyRequest request);

    CompletableFuture<GetImportTaskResultResponse> getImportTaskResult(GetImportTaskResultRequest request);

    CompletableFuture<GetPromptResponse> getPrompt(GetPromptRequest request);

    CompletableFuture<ImportEnterpriseDocumentResponse> importEnterpriseDocument(ImportEnterpriseDocumentRequest request);

    CompletableFuture<ImportUserDocumentResponse> importUserDocument(ImportUserDocumentRequest request);

    CompletableFuture<ListFineTuneJobsResponse> listFineTuneJobs(ListFineTuneJobsRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<QueryEnterpriseDataListResponse> queryEnterpriseDataList(QueryEnterpriseDataListRequest request);

    CompletableFuture<QueryEnterpriseDataTagResponse> queryEnterpriseDataTag(QueryEnterpriseDataTagRequest request);

    CompletableFuture<QueryEnterpriseTagListResponse> queryEnterpriseTagList(QueryEnterpriseTagListRequest request);

    CompletableFuture<QueryUserDocumentResponse> queryUserDocument(QueryUserDocumentRequest request);

    CompletableFuture<SearchEnterpriseDataResponse> searchEnterpriseData(SearchEnterpriseDataRequest request);

    CompletableFuture<UpdateEnterpriseDataInfoResponse> updateEnterpriseDataInfo(UpdateEnterpriseDataInfoRequest request);

    CompletableFuture<UpdateEnterpriseDataTagResponse> updateEnterpriseDataTag(UpdateEnterpriseDataTagRequest request);

    CompletableFuture<UpdateEnterpriseTagResponse> updateEnterpriseTag(UpdateEnterpriseTagRequest request);

}
