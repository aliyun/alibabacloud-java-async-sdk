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
     * <b>description</b> :
     * <p>  You cannot use API to create structured table. To create a table, go to <a href="https://bailian.console.alibabacloud.com/#/data-center">Data Management</a> in the console. You can associate a knowledge base with ApsaraDB for RDS to automatically update structured knowledge base. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     * <ul>
     * <li>If you are using a RAM user, you must first obtain the OpenAPI management permissions (namely sfm:AddCategory) of Model Studio. For more information, see <a href="https://help.aliyun.com/document_detail/2848578.html">Grant OpenAPI permissions to a RAM user</a>. If you are using the Alibaba Cloud account, you do not need permissions. We recommend that you use <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">the latest version of the SDK</a> to call this operation.</li>
     * <li>You can create up to 1,000 categories in each workspace.</li>
     * <li>This interface is not idempotent.
     * <strong>Throttling:</strong> Throttling will be triggered if you call this operation frequently. Do not exceed 5 times per second. If throttling is triggered, try again later.</li>
     * </ul>
     * 
     * @param request the request parameters of AddCategory  AddCategoryRequest
     * @return AddCategoryResponse
     */
    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you have obtained the lease and uploaded the document to the temporary storage space by using the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/upload-files-by-calling-api">Upload files by calling API</a>.</p>
     * <blockquote>
     * <p> After you call this operation, the used lease ID expires immediately. Do not use the same lease ID to submit new requests.</p>
     * </blockquote>
     * <ul>
     * <li>You must call this operation within 12 hours after you call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation. Otherwise, the lease expires and the request fails.</li>
     * <li>After you call this operation, the system parses and imports your document. The process takes some time.</li>
     * <li>This interface is not idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFile  AddFileRequest
     * @return AddFileResponse
     */
    CompletableFuture<AddFileResponse> addFile(AddFileRequest request);

    /**
     * @param request the request parameters of AddFilesFromAuthorizedOss  AddFilesFromAuthorizedOssRequest
     * @return AddFilesFromAuthorizedOssResponse
     */
    CompletableFuture<AddFilesFromAuthorizedOssResponse> addFilesFromAuthorizedOss(AddFilesFromAuthorizedOssRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation returns an HTTP URL that can be used to upload an unstructured document (the lease) and parameters required for the upload. Structured documents are not supported.</p>
     * <ul>
     * <li>The HTTP URL returned by this operation is valid only for minutes. Upload the document before the URL expires.</li>
     * <li>After you apply for a lease and upload a document, the document is stored in a temporary storage space for 12 hours. </li>
     * <li>This interface is not idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyFileUploadLease  ApplyFileUploadLeaseRequest
     * @return ApplyFileUploadLeaseResponse
     */
    CompletableFuture<ApplyFileUploadLeaseResponse> applyFileUploadLease(ApplyFileUploadLeaseRequest request);

    /**
     * <b>description</b> :
     * <p>1\. This interface is intended for pro-code deployment only; other scenarios are currently not supported. 2. After obtaining the temporary file upload lease via this interface, upload the file manually.</p>
     * 
     * @param request the request parameters of ApplyTempStorageLease  ApplyTempStorageLeaseRequest
     * @return ApplyTempStorageLeaseResponse
     */
    CompletableFuture<ApplyTempStorageLeaseResponse> applyTempStorageLease(ApplyTempStorageLeaseRequest request);

    /**
     * @param request the request parameters of ChangeParseSetting  ChangeParseSettingRequest
     * @return ChangeParseSettingResponse
     */
    CompletableFuture<ChangeParseSettingResponse> changeParseSetting(ChangeParseSettingRequest request);

    /**
     * @param request the request parameters of CreateAndPulishAgent  CreateAndPulishAgentRequest
     * @return CreateAndPulishAgentResponse
     */
    CompletableFuture<CreateAndPulishAgentResponse> createAndPulishAgent(CreateAndPulishAgentRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Limits</strong>: This operation can create only knowledge base of the document search type. Data query and image Q\&amp;A types are not supported. Use the console instead.</p>
     * <ul>
     * <li><strong>Required permissions</strong><ul>
     * <li><strong>RAM users</strong>: Must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> of Model Studio (such as the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:CreateIndex permission required), and <a href="https://help.aliyun.com/document_detail/2851098.html">become member of a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has the permission by default, and can call the operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Call method</strong>: We recommend using the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">GenAI Service Platform SDK</a>. The SDK encapsulates complex signature computational logic to simplify the call process.</li>
     * <li><strong>What to do next</strong>: This operation only initializes knowledge base creation job. After that, call <strong>SubmitIndexJob</strong> to complete the creation. Otherwise, you will get an empty knowledge base. For more information about the sample code, see <a href="https://help.aliyun.com/document_detail/2852772.html">Knowledge base API guide</a>.</li>
     * <li><strong>Idempotence</strong>: This operation is not idempotent. If you call the operation for multiple times, you may create several knowledge bases with the same name. We recommend following a &quot;query first, then create&quot; logic.
     * <strong>Rate limit:</strong> Rate limiting will be triggered if you call this operation frequently. Do not exceed 10 times per second. If limiting is triggered, try again later.</li>
     * </ul>
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
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> After a text chunk is deleted, it cannot be restored. Proceed with caution.</li>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM users</strong>: Must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> of Model Studio (such as the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:DeleteChunk permission required), and <a href="https://help.aliyun.com/document_detail/2851098.html">become member of a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has the permission by default, and can call the operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Call method</strong>: We recommend using the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">GenAI Service Platform SDK</a>. The SDK encapsulates complex signature computational logic to simplify the call process.</li>
     * <li><strong>Delay</strong>: The update takes effect immediately. During peak hours, the update may take place in seconds.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you perform a repeated operation on a chunk that has already been deleted, the interface returns a success.
     * <strong>Rate limit:</strong> Rate limiting will be triggered if you call this operation frequently. Do not exceed 10 times per second. If limiting is triggered, try again later.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteChunk  DeleteChunkRequest
     * @return DeleteChunkResponse
     */
    CompletableFuture<DeleteChunkResponse> deleteChunk(DeleteChunkRequest request);

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>If a knowledge base is being called by an application, disassociate the knowledge base before you can delete it. To disassociate the knowledge base, you must use the console. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>.</li>
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
     * <li>Only documents with the INSERT_ERROR and FINISH states can be deleted. To query the status of documents in a specified knowledge base, call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-listindexdocuments">ListIndexDocuments</a> operation.</li>
     * <li>After you delete a document, it cannot be recovered and the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-retrieve">Retrieve</a> operation cannot query information about the document. We recommend that you proceed with caution.</li>
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
     * @param request the request parameters of GetAlipayTransferStatus  GetAlipayTransferStatusRequest
     * @return GetAlipayTransferStatusResponse
     */
    CompletableFuture<GetAlipayTransferStatusResponse> getAlipayTransferStatus(GetAlipayTransferStatusRequest request);

    /**
     * @param request the request parameters of GetAlipayUrl  GetAlipayUrlRequest
     * @return GetAlipayUrlResponse
     */
    CompletableFuture<GetAlipayUrlResponse> getAlipayUrl(GetAlipayUrlRequest request);

    /**
     * @param request the request parameters of GetAvailableParserTypes  GetAvailableParserTypesRequest
     * @return GetAvailableParserTypesResponse
     */
    CompletableFuture<GetAvailableParserTypesResponse> getAvailableParserTypes(GetAvailableParserTypesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>A knowledge base job is running. You can call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> operation to create a creation job or the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexadddocumentsjob">SubmitIndexAddDocumentsJob</a> operation to create a add document job. Then, obtain the <code>JobId</code> returned by the operations.</li>
     * <li>We recommend that you call this operation at intervals of more than 5 seconds.</li>
     * <li>This interface is idempotent.</li>
     * </ol>
     * 
     * @param request the request parameters of GetIndexJobStatus  GetIndexJobStatusRequest
     * @return GetIndexJobStatusResponse
     */
    CompletableFuture<GetIndexJobStatusResponse> getIndexJobStatus(GetIndexJobStatusRequest request);

    /**
     * @param request the request parameters of GetIndexMonitor  GetIndexMonitorRequest
     * @return GetIndexMonitorResponse
     */
    CompletableFuture<GetIndexMonitorResponse> getIndexMonitor(GetIndexMonitorRequest request);

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
     * @param request the request parameters of GetParseSettings  GetParseSettingsRequest
     * @return GetParseSettingsResponse
     */
    CompletableFuture<GetParseSettingsResponse> getParseSettings(GetParseSettingsRequest request);

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
     * @param request the request parameters of HighCodeDeploy  HighCodeDeployRequest
     * @return HighCodeDeployResponse
     */
    CompletableFuture<HighCodeDeployResponse> highCodeDeploy(HighCodeDeployRequest request);

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
     * <b>description</b> :
     * <p>  If you are using a RAM user, you must first obtain the OpenAPI management permissions (namely sfm:ListFile) of Model Studio. For more information, see <a href="https://help.aliyun.com/document_detail/2848578.html">Grant OpenAPI permissions to a RAM user</a>. If you are using the Alibaba Cloud account, you do not need permissions. We recommend that you use <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">the latest version of the SDK</a> to call this operation.</p>
     * <ul>
     * <li>During a paged query, set <code>MaxResults</code> to specify the maximum number of entries to return. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you query subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> obtained in the last returned result. You can also set the <code>MaxResults</code> parameter to limit the number of entries to be returned. If no <code>NextToken</code> is returned, the result is completely returned and no more requests are required.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong> Throttling will be triggered if you call this operation frequently. Do not exceed 5 times per second. If throttling is triggered, try again later.</li>
     * </ul>
     * 
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
     * @param request the request parameters of ListIndexFileDetails  ListIndexFileDetailsRequest
     * @return ListIndexFileDetailsResponse
     */
    CompletableFuture<ListIndexFileDetailsResponse> listIndexFileDetails(ListIndexFileDetailsRequest request);

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
     * <p>  You must first upload documents to <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> and obtain the <code>FileId</code>. The documents are the knowledge source of the knowledge base. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/data-import-instructions">Import Data</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</li>
     * <li>After you call this operation, you can call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getindexjobstatus">GetIndexJobStatus</a> operation to query the status of the job. More than 20 calls to the GetIndexJobStatus operation per minute may trigger throttling.</li>
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
     * <li>Before you call this operation, you must call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation and obtain the <code>IndexId</code>.</li>
     * <li>Execution takes a period of time after this operation is called. Do not make new request before the request is returned.</li>
     * <li>If you want to query the execution status of the job after you call this operation, call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getindexjobstatus">GetIndexJobStatus</a> operation.</li>
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
     * @param request the request parameters of UpdateAndPublishAgentSelective  UpdateAndPublishAgentSelectiveRequest
     * @return UpdateAndPublishAgentSelectiveResponse
     */
    CompletableFuture<UpdateAndPublishAgentSelectiveResponse> updateAndPublishAgentSelective(UpdateAndPublishAgentSelectiveRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Limits</strong>: This operation supports only knowledge base of the document search type. Data query and image Q\&amp;A types are not supported.</p>
     * <ul>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM users</strong>: Must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> of Model Studio (such as the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:UpdateChunk permission required), and <a href="https://help.aliyun.com/document_detail/2851098.html">become member of a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has the permission by default, and can call the operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Call method</strong>: We recommend using the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">GenAI Service Platform SDK</a>. The SDK encapsulates complex signature computational logic to simplify the call process.</li>
     * <li><strong>Delay</strong>: The update takes effect immediately. During peak hours, the update may take place in seconds.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you perform a repeated operation on a chunk that has already been updated, the interface returns a success.
     * <strong>Rate limit:</strong> Rate limiting will be triggered if you call this operation frequently. Do not exceed 10 times per second. If limiting is triggered, try again later.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateChunk  UpdateChunkRequest
     * @return UpdateChunkResponse
     */
    CompletableFuture<UpdateChunkResponse> updateChunk(UpdateChunkRequest request);

    /**
     * @param request the request parameters of UpdateFileTag  UpdateFileTagRequest
     * @return UpdateFileTagResponse
     */
    CompletableFuture<UpdateFileTagResponse> updateFileTag(UpdateFileTagRequest request);

    /**
     * @param request the request parameters of UpdateIndex  UpdateIndexRequest
     * @return UpdateIndexResponse
     */
    CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request);

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
