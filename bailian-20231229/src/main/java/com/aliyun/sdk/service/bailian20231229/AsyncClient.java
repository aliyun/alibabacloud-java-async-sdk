// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bailian20231229.models.*;
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

    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    CompletableFuture<AddFileResponse> addFile(AddFileRequest request);

    CompletableFuture<ApplyFileUploadLeaseResponse> applyFileUploadLease(ApplyFileUploadLeaseRequest request);

    CompletableFuture<CreateAndPulishAgentResponse> createAndPulishAgent(CreateAndPulishAgentRequest request);

    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    CompletableFuture<CreateMemoryResponse> createMemory(CreateMemoryRequest request);

    CompletableFuture<CreateMemoryNodeResponse> createMemoryNode(CreateMemoryNodeRequest request);

    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    CompletableFuture<DeleteIndexDocumentResponse> deleteIndexDocument(DeleteIndexDocumentRequest request);

    CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request);

    CompletableFuture<DeleteMemoryNodeResponse> deleteMemoryNode(DeleteMemoryNodeRequest request);

    CompletableFuture<DescribeFileResponse> describeFile(DescribeFileRequest request);

    CompletableFuture<GetIndexJobStatusResponse> getIndexJobStatus(GetIndexJobStatusRequest request);

    CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request);

    CompletableFuture<GetMemoryNodeResponse> getMemoryNode(GetMemoryNodeRequest request);

    CompletableFuture<GetPublishedAgentResponse> getPublishedAgent(GetPublishedAgentRequest request);

    CompletableFuture<ListCategoryResponse> listCategory(ListCategoryRequest request);

    CompletableFuture<ListChunksResponse> listChunks(ListChunksRequest request);

    CompletableFuture<ListFileResponse> listFile(ListFileRequest request);

    CompletableFuture<ListIndexDocumentsResponse> listIndexDocuments(ListIndexDocumentsRequest request);

    CompletableFuture<ListIndicesResponse> listIndices(ListIndicesRequest request);

    CompletableFuture<ListMemoriesResponse> listMemories(ListMemoriesRequest request);

    CompletableFuture<ListMemoryNodesResponse> listMemoryNodes(ListMemoryNodesRequest request);

    CompletableFuture<ListPublishedAgentResponse> listPublishedAgent(ListPublishedAgentRequest request);

    CompletableFuture<RetrieveResponse> retrieve(RetrieveRequest request);

    CompletableFuture<SubmitIndexAddDocumentsJobResponse> submitIndexAddDocumentsJob(SubmitIndexAddDocumentsJobRequest request);

    CompletableFuture<SubmitIndexJobResponse> submitIndexJob(SubmitIndexJobRequest request);

    CompletableFuture<UpdateAndPublishAgentResponse> updateAndPublishAgent(UpdateAndPublishAgentRequest request);

    CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request);

    CompletableFuture<UpdateMemoryNodeResponse> updateMemoryNode(UpdateMemoryNodeRequest request);

}
