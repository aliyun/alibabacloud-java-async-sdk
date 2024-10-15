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

    /**
     * @param request the request parameters of AddCategory  AddCategoryRequest
     * @return AddCategoryResponse
     */
    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you have obtained the lease and uploaded the document to the temporary storage space by using the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/upload-files-by-calling-api">Upload files by calling API</a>.</p>
     * <blockquote>
     * <p> After you call this operation, the used lease ID expires immediately. Do not use the same lease ID to submit new requests.</p>
     * </blockquote>
     * <ul>
     * <li>You must call this operation within 12 hours after you call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation. Otherwise, the lease expires and the request fails.</li>
     * <li>After you call this operation, the system parses and imports your document. The process takes some time.</li>
     * <li>This interface is not idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFile  AddFileRequest
     * @return AddFileResponse
     */
    CompletableFuture<AddFileResponse> addFile(AddFileRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation returns an HTTP URL that can be used to upload an unstructured document (the lease) and parameters required for the upload. Structured documents are not supported.</p>
     * <ul>
     * <li>The HTTP URL returned by this operation is valid only for minutes. Upload the document before the URL expires.</li>
     * <li>After you apply for a lease and upload a document, the document is stored in a temporary storage space for 12 hours. Call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-addfile">AddFile</a> interface in time to import the document to the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> page.</li>
     * <li>This interface is not idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyFileUploadLease  ApplyFileUploadLeaseRequest
     * @return ApplyFileUploadLeaseResponse
     */
    CompletableFuture<ApplyFileUploadLeaseResponse> applyFileUploadLease(ApplyFileUploadLeaseRequest request);

    /**
     * @param request the request parameters of CreateAndPulishAgent  CreateAndPulishAgentRequest
     * @return CreateAndPulishAgentResponse
     */
    CompletableFuture<CreateAndPulishAgentResponse> createAndPulishAgent(CreateAndPulishAgentRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must first upload documents to <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> and obtain the <code>FileId</code>. The documents are the knowledge source of the knowledge base. To upload documents, call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-addfile">AddFile</a> operation.</li>
     * <li>This operation only initializes a knowledge base creation job. You must also call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> operation to complete the job.</li>
     * <li>This interface is not idempotent.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateIndex  CreateIndexRequest
     * @return CreateIndexResponse
     */
    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    /**
     * @param request the request parameters of CreateMemory  CreateMemoryRequest
     * @return CreateMemoryResponse
     */
    CompletableFuture<CreateMemoryResponse> createMemory(CreateMemoryRequest request);

    /**
     * @param request the request parameters of CreateMemoryNode  CreateMemoryNodeRequest
     * @return CreateMemoryNodeResponse
     */
    CompletableFuture<CreateMemoryNodeResponse> createMemoryNode(CreateMemoryNodeRequest request);

    /**
     * @param request the request parameters of CreatePromptTemplate  CreatePromptTemplateRequest
     * @return CreatePromptTemplateResponse
     */
    CompletableFuture<CreatePromptTemplateResponse> createPromptTemplate(CreatePromptTemplateRequest request);

    /**
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

    /**
     * @param request the request parameters of DeleteCategory  DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>If a knowledge base is being called by an application, disassociate the knowledge base before you can delete it. To disassociate the knowledge base, you must use the console. For more information, see <a href="https://help.aliyun.com/zh/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>.</li>
     * <li>After you delete a knowledge base, it cannot be recovered. We recommend that you proceed with caution.</li>
     * <li>Imported documents are not deleted from the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> if you call this operation.</li>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIndex  DeleteIndexRequest
     * @return DeleteIndexResponse
     */
    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>Only documents with the INSERT_ERROR and FINISH states can be deleted. To query the status of documents in a specified knowledge base, call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-listindexdocuments">ListIndexDocuments</a> operation.</li>
     * <li>After you delete a document, it cannot be recovered and the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-retrieve">Retrieve</a> operation cannot query information about the document. We recommend that you proceed with caution.</li>
     * <li>Imported documents are not deleted from the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> if you call this operation.</li>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIndexDocument  DeleteIndexDocumentRequest
     * @return DeleteIndexDocumentResponse
     */
    CompletableFuture<DeleteIndexDocumentResponse> deleteIndexDocument(DeleteIndexDocumentRequest request);

    /**
     * @param request the request parameters of DeleteMemory  DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request);

    /**
     * @param request the request parameters of DeleteMemoryNode  DeleteMemoryNodeRequest
     * @return DeleteMemoryNodeResponse
     */
    CompletableFuture<DeleteMemoryNodeResponse> deleteMemoryNode(DeleteMemoryNodeRequest request);

    /**
     * @param request the request parameters of DeletePromptTemplate  DeletePromptTemplateRequest
     * @return DeletePromptTemplateResponse
     */
    CompletableFuture<DeletePromptTemplateResponse> deletePromptTemplate(DeletePromptTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure that your document is uploaded to the <a href="https://bailian.console.aliyun.com/knowledge-base#/data-center">Data Management</a> page of Alibaba Cloud Model Studio.</p>
     * <ul>
     * <li>If you upload the document by calling an API, make sure that you have called the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-addfile">AddFile</a> operation to obtain <code>FileId</code>.</li>
     * <li>You can also call this operation to query unstructured documents that you upload on the <a href="https://bailian.console.aliyun.com/knowledge-base#/data-center">Data Management</a> page.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong> Make sure that the interval between the two queries is at least 15 seconds. Otherwise, you may trigger system throttling. If throttling is triggered, try again later.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFile  DescribeFileRequest
     * @return DescribeFileResponse
     */
    CompletableFuture<DescribeFileResponse> describeFile(DescribeFileRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>A knowledge base job is running. You can call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> operation to create a creation job or the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-submitindexadddocumentsjob">SubmitIndexAddDocumentsJob</a> operation to create a add document job. Then, obtain the <code>JobId</code> returned by the operations.</li>
     * <li>We recommend that you call this operation at intervals of more than 5 seconds.</li>
     * <li>This interface is idempotent.</li>
     * </ol>
     * 
     * @param request the request parameters of GetIndexJobStatus  GetIndexJobStatusRequest
     * @return GetIndexJobStatusResponse
     */
    CompletableFuture<GetIndexJobStatusResponse> getIndexJobStatus(GetIndexJobStatusRequest request);

    /**
     * @param request the request parameters of GetMemory  GetMemoryRequest
     * @return GetMemoryResponse
     */
    CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request);

    /**
     * @param request the request parameters of GetMemoryNode  GetMemoryNodeRequest
     * @return GetMemoryNodeResponse
     */
    CompletableFuture<GetMemoryNodeResponse> getMemoryNode(GetMemoryNodeRequest request);

    /**
     * @param request the request parameters of GetPromptTemplate  GetPromptTemplateRequest
     * @return GetPromptTemplateResponse
     */
    CompletableFuture<GetPromptTemplateResponse> getPromptTemplate(GetPromptTemplateRequest request);

    /**
     * @param request the request parameters of GetPublishedAgent  GetPublishedAgentRequest
     * @return GetPublishedAgentResponse
     */
    CompletableFuture<GetPublishedAgentResponse> getPublishedAgent(GetPublishedAgentRequest request);

    /**
     * @param request the request parameters of ListCategory  ListCategoryRequest
     * @return ListCategoryResponse
     */
    CompletableFuture<ListCategoryResponse> listCategory(ListCategoryRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChunks  ListChunksRequest
     * @return ListChunksResponse
     */
    CompletableFuture<ListChunksResponse> listChunks(ListChunksRequest request);

    /**
     * @param request the request parameters of ListFile  ListFileRequest
     * @return ListFileResponse
     */
    CompletableFuture<ListFileResponse> listFile(ListFileRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of ListIndexDocuments  ListIndexDocumentsRequest
     * @return ListIndexDocumentsResponse
     */
    CompletableFuture<ListIndexDocumentsResponse> listIndexDocuments(ListIndexDocumentsRequest request);

    /**
     * <b>description</b> :
     * <p>This interface is idempotent.</p>
     * 
     * @param request the request parameters of ListIndices  ListIndicesRequest
     * @return ListIndicesResponse
     */
    CompletableFuture<ListIndicesResponse> listIndices(ListIndicesRequest request);

    /**
     * @param request the request parameters of ListMemories  ListMemoriesRequest
     * @return ListMemoriesResponse
     */
    CompletableFuture<ListMemoriesResponse> listMemories(ListMemoriesRequest request);

    /**
     * @param request the request parameters of ListMemoryNodes  ListMemoryNodesRequest
     * @return ListMemoryNodesResponse
     */
    CompletableFuture<ListMemoryNodesResponse> listMemoryNodes(ListMemoryNodesRequest request);

    /**
     * @param request the request parameters of ListPromptTemplates  ListPromptTemplatesRequest
     * @return ListPromptTemplatesResponse
     */
    CompletableFuture<ListPromptTemplatesResponse> listPromptTemplates(ListPromptTemplatesRequest request);

    /**
     * @param request the request parameters of ListPublishedAgent  ListPublishedAgentRequest
     * @return ListPublishedAgentResponse
     */
    CompletableFuture<ListPublishedAgentResponse> listPublishedAgent(ListPublishedAgentRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>The response time may be long because this operation involves complex retrieval and matching. We recommend that you set appropriate timeout and retry policy for requests.</li>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of Retrieve  RetrieveRequest
     * @return RetrieveResponse
     */
    CompletableFuture<RetrieveResponse> retrieve(RetrieveRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>Before you call this operation, call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-addfile">AddFile</a> operation to upload the documents to Model Studio.</li>
     * <li>After you call this operation, you can call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-getindexjobstatus">GetIndexJobStatus</a> operation to query the status of the job. More than 20 calls to the GetIndexJobStatus operation per minute may trigger throttling.</li>
     * <li>Execution takes a period of time after this operation is called. Do not make new request before the request is returned. This interface is not idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitIndexAddDocumentsJob  SubmitIndexAddDocumentsJobRequest
     * @return SubmitIndexAddDocumentsJobResponse
     */
    CompletableFuture<SubmitIndexAddDocumentsJobResponse> submitIndexAddDocumentsJob(SubmitIndexAddDocumentsJobRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation and obtain the <code>IndexId</code>.</li>
     * <li>Execution takes a period of time after this operation is called. Do not make new request before the request is returned.</li>
     * <li>If you want to query the execution status of the job after you call this operation, call the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-getindexjobstatus">GetIndexJobStatus</a> operation.</li>
     * <li>This interface is not idempotent.</li>
     * </ol>
     * 
     * @param request the request parameters of SubmitIndexJob  SubmitIndexJobRequest
     * @return SubmitIndexJobResponse
     */
    CompletableFuture<SubmitIndexJobResponse> submitIndexJob(SubmitIndexJobRequest request);

    /**
     * @param request the request parameters of UpdateAndPublishAgent  UpdateAndPublishAgentRequest
     * @return UpdateAndPublishAgentResponse
     */
    CompletableFuture<UpdateAndPublishAgentResponse> updateAndPublishAgent(UpdateAndPublishAgentRequest request);

    /**
     * @param request the request parameters of UpdateMemory  UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request);

    /**
     * @param request the request parameters of UpdateMemoryNode  UpdateMemoryNodeRequest
     * @return UpdateMemoryNodeResponse
     */
    CompletableFuture<UpdateMemoryNodeResponse> updateMemoryNode(UpdateMemoryNodeRequest request);

    /**
     * @param request the request parameters of UpdatePromptTemplate  UpdatePromptTemplateRequest
     * @return UpdatePromptTemplateResponse
     */
    CompletableFuture<UpdatePromptTemplateResponse> updatePromptTemplate(UpdatePromptTemplateRequest request);

}
