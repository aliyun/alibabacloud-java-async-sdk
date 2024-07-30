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

}
