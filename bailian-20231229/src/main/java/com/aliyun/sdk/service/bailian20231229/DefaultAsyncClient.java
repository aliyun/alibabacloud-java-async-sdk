// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.bailian20231229.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "bailian";
        this.version = "2023-12-29";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddCategory  AddCategoryRequest
     * @return AddCategoryResponse
     */
    @Override
    public CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddCategory").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/category/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<AddFileResponse> addFile(AddFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddFile").setMethod(HttpMethod.PUT).setPathRegex("/{WorkspaceId}/datacenter/file").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ApplyFileUploadLeaseResponse> applyFileUploadLease(ApplyFileUploadLeaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyFileUploadLease").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/category/{CategoryId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyFileUploadLeaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyFileUploadLeaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAndPulishAgent  CreateAndPulishAgentRequest
     * @return CreateAndPulishAgentResponse
     */
    @Override
    public CompletableFuture<CreateAndPulishAgentResponse> createAndPulishAgent(CreateAndPulishAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAndPulishAgent").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/application/agents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAndPulishAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAndPulishAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must first upload documents to <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> and obtain the <code>FileId</code>. The documents are the knowledge source of the knowledge base. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/data-import-instructions">Import Data</a>.</li>
     * <li>This operation only initializes a knowledge base creation job. You must also call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> operation to complete the job.</li>
     * <li>This interface is not idempotent.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateIndex  CreateIndexRequest
     * @return CreateIndexResponse
     */
    @Override
    public CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIndex").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMemory  CreateMemoryRequest
     * @return CreateMemoryResponse
     */
    @Override
    public CompletableFuture<CreateMemoryResponse> createMemory(CreateMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMemory").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/memories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMemoryNode  CreateMemoryNodeRequest
     * @return CreateMemoryNodeResponse
     */
    @Override
    public CompletableFuture<CreateMemoryNodeResponse> createMemoryNode(CreateMemoryNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMemoryNode").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMemoryNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMemoryNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePromptTemplate  CreatePromptTemplateRequest
     * @return CreatePromptTemplateResponse
     */
    @Override
    public CompletableFuture<CreatePromptTemplateResponse> createPromptTemplate(CreatePromptTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePromptTemplate").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/promptTemplates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePromptTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePromptTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    @Override
    public CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgent").setMethod(HttpMethod.DELETE).setPathRegex("/{workspaceId}/application/agents/{appCode}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCategory  DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    @Override
    public CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCategory").setMethod(HttpMethod.DELETE).setPathRegex("/{WorkspaceId}/datacenter/category/{CategoryId}/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    @Override
    public CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFile").setMethod(HttpMethod.DELETE).setPathRegex("/{WorkspaceId}/datacenter/file/{FileId}/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndex").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteIndexDocumentResponse> deleteIndexDocument(DeleteIndexDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndexDocument").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/delete_index_document").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndexDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndexDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMemory  DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    @Override
    public CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMemory").setMethod(HttpMethod.DELETE).setPathRegex("/{workspaceId}/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMemoryNode  DeleteMemoryNodeRequest
     * @return DeleteMemoryNodeResponse
     */
    @Override
    public CompletableFuture<DeleteMemoryNodeResponse> deleteMemoryNode(DeleteMemoryNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMemoryNode").setMethod(HttpMethod.DELETE).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes/{memoryNodeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMemoryNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMemoryNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePromptTemplate  DeletePromptTemplateRequest
     * @return DeletePromptTemplateResponse
     */
    @Override
    public CompletableFuture<DeletePromptTemplateResponse> deletePromptTemplate(DeletePromptTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePromptTemplate").setMethod(HttpMethod.DELETE).setPathRegex("/{workspaceId}/promptTemplates/{promptTemplateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePromptTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePromptTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeFileResponse> describeFile(DescribeFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeFile").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/datacenter/file/{FileId}/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetIndexJobStatusResponse> getIndexJobStatus(GetIndexJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIndexJobStatus").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/index/job/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIndexJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIndexJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMemory  GetMemoryRequest
     * @return GetMemoryResponse
     */
    @Override
    public CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemory").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMemoryNode  GetMemoryNodeRequest
     * @return GetMemoryNodeResponse
     */
    @Override
    public CompletableFuture<GetMemoryNodeResponse> getMemoryNode(GetMemoryNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemoryNode").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes/{memoryNodeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemoryNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemoryNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPromptTemplate  GetPromptTemplateRequest
     * @return GetPromptTemplateResponse
     */
    @Override
    public CompletableFuture<GetPromptTemplateResponse> getPromptTemplate(GetPromptTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPromptTemplate").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/promptTemplates/{promptTemplateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPromptTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPromptTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPublishedAgent  GetPublishedAgentRequest
     * @return GetPublishedAgentResponse
     */
    @Override
    public CompletableFuture<GetPublishedAgentResponse> getPublishedAgent(GetPublishedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPublishedAgent").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/application/agents/{appCode}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPublishedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPublishedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCategory  ListCategoryRequest
     * @return ListCategoryResponse
     */
    @Override
    public CompletableFuture<ListCategoryResponse> listCategory(ListCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCategory").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/categories").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListChunksResponse> listChunks(ListChunksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListChunks").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/list_chunks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChunksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChunksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFile  ListFileRequest
     * @return ListFileResponse
     */
    @Override
    public CompletableFuture<ListFileResponse> listFile(ListFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFile").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/datacenter/files").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListIndexDocumentsResponse> listIndexDocuments(ListIndexDocumentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIndexDocuments").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/index/list_index_documents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIndexDocumentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIndexDocumentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This interface is idempotent.</p>
     * 
     * @param request the request parameters of ListIndices  ListIndicesRequest
     * @return ListIndicesResponse
     */
    @Override
    public CompletableFuture<ListIndicesResponse> listIndices(ListIndicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIndices").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/index/list_indices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIndicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIndicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMemories  ListMemoriesRequest
     * @return ListMemoriesResponse
     */
    @Override
    public CompletableFuture<ListMemoriesResponse> listMemories(ListMemoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemories").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/memories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMemoryNodes  ListMemoryNodesRequest
     * @return ListMemoryNodesResponse
     */
    @Override
    public CompletableFuture<ListMemoryNodesResponse> listMemoryNodes(ListMemoryNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemoryNodes").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemoryNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemoryNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPromptTemplates  ListPromptTemplatesRequest
     * @return ListPromptTemplatesResponse
     */
    @Override
    public CompletableFuture<ListPromptTemplatesResponse> listPromptTemplates(ListPromptTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPromptTemplates").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/promptTemplates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPromptTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPromptTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPublishedAgent  ListPublishedAgentRequest
     * @return ListPublishedAgentResponse
     */
    @Override
    public CompletableFuture<ListPublishedAgentResponse> listPublishedAgent(ListPublishedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPublishedAgent").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/application/agents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublishedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublishedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RetrieveResponse> retrieve(RetrieveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Retrieve").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/retrieve").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetrieveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetrieveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<SubmitIndexAddDocumentsJobResponse> submitIndexAddDocumentsJob(SubmitIndexAddDocumentsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitIndexAddDocumentsJob").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/add_documents_to_index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitIndexAddDocumentsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitIndexAddDocumentsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<SubmitIndexJobResponse> submitIndexJob(SubmitIndexJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitIndexJob").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/submit_index_job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitIndexJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitIndexJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAndPublishAgent  UpdateAndPublishAgentRequest
     * @return UpdateAndPublishAgentResponse
     */
    @Override
    public CompletableFuture<UpdateAndPublishAgentResponse> updateAndPublishAgent(UpdateAndPublishAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAndPublishAgent").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/application/agents/{appCode}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAndPublishAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAndPublishAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFileTag  UpdateFileTagRequest
     * @return UpdateFileTagResponse
     */
    @Override
    public CompletableFuture<UpdateFileTagResponse> updateFileTag(UpdateFileTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFileTag").setMethod(HttpMethod.PUT).setPathRegex("/{WorkspaceId}/datacenter/file/{FileId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMemory  UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    @Override
    public CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMemory").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMemoryNode  UpdateMemoryNodeRequest
     * @return UpdateMemoryNodeResponse
     */
    @Override
    public CompletableFuture<UpdateMemoryNodeResponse> updateMemoryNode(UpdateMemoryNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMemoryNode").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes/{memoryNodeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMemoryNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMemoryNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePromptTemplate  UpdatePromptTemplateRequest
     * @return UpdatePromptTemplateResponse
     */
    @Override
    public CompletableFuture<UpdatePromptTemplateResponse> updatePromptTemplate(UpdatePromptTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePromptTemplate").setMethod(HttpMethod.PATCH).setPathRegex("/{workspaceId}/promptTemplates/{promptTemplateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePromptTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePromptTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
