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

    CompletableFuture<CancelFineTuneJobResponse> cancelFineTuneJob(CancelFineTuneJobRequest request);

    CompletableFuture<CreateDocumentTagResponse> createDocumentTag(CreateDocumentTagRequest request);

    CompletableFuture<CreateFineTuneJobResponse> createFineTuneJob(CreateFineTuneJobRequest request);

    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    CompletableFuture<CreateTextEmbeddingsResponse> createTextEmbeddings(CreateTextEmbeddingsRequest request);

    CompletableFuture<CreateTokenResponse> createToken(CreateTokenRequest request);

    CompletableFuture<DeleteDocResponse> deleteDoc(DeleteDocRequest request);

    CompletableFuture<DeleteDocumentTagResponse> deleteDocumentTag(DeleteDocumentTagRequest request);

    CompletableFuture<DeleteFineTuneJobResponse> deleteFineTuneJob(DeleteFineTuneJobRequest request);

    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    CompletableFuture<DescribeDocResponse> describeDoc(DescribeDocRequest request);

    CompletableFuture<DescribeDocumentImportJobResponse> describeDocumentImportJob(DescribeDocumentImportJobRequest request);

    CompletableFuture<DescribeFineTuneJobResponse> describeFineTuneJob(DescribeFineTuneJobRequest request);

    CompletableFuture<DescribeServiceResponse> describeService(DescribeServiceRequest request);

    CompletableFuture<GetFileStoreUploadPolicyResponse> getFileStoreUploadPolicy(GetFileStoreUploadPolicyRequest request);

    CompletableFuture<GetPromptResponse> getPrompt(GetPromptRequest request);

    CompletableFuture<GetText2ImageJobResponse> getText2ImageJob(GetText2ImageJobRequest request);

    CompletableFuture<ImportUserDocumentResponse> importUserDocument(ImportUserDocumentRequest request);

    CompletableFuture<ListDocsResponse> listDocs(ListDocsRequest request);

    CompletableFuture<ListDocumentTagsResponse> listDocumentTags(ListDocumentTagsRequest request);

    CompletableFuture<ListFineTuneJobsResponse> listFineTuneJobs(ListFineTuneJobsRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<QueryUserDocumentResponse> queryUserDocument(QueryUserDocumentRequest request);

    CompletableFuture<SubmitDocumentImportJobResponse> submitDocumentImportJob(SubmitDocumentImportJobRequest request);

    CompletableFuture<SubmitText2ImageJobResponse> submitText2ImageJob(SubmitText2ImageJobRequest request);

    CompletableFuture<UpdateDocAttributeResponse> updateDocAttribute(UpdateDocAttributeRequest request);

    CompletableFuture<UpdateDocumentTagResponse> updateDocumentTag(UpdateDocumentTagRequest request);

}
