// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.imm20200930.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "imm";
        this.version = "2020-09-30";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-beijing-gov-1", "imm-vpc.cn-beijing-gov-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>The operation accepts JPG and PNG images with a maximum side length of 30,000 pixels and a total of up to 250 million pixels.</li>
     * </ul>
     * 
     * @param request the request parameters of AddImageMosaic  AddImageMosaicRequest
     * @return AddImageMosaicResponse
     */
    @Override
    public CompletableFuture<AddImageMosaicResponse> addImageMosaic(AddImageMosaicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddImageMosaic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddImageMosaicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddImageMosaicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddStoryFiles  AddStoryFilesRequest
     * @return AddStoryFilesResponse
     */
    @Override
    public CompletableFuture<AddStoryFilesResponse> addStoryFiles(AddStoryFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddStoryFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddStoryFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddStoryFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>To use data processing capabilities of IMM based on the x-oss-process parameter, you must bind an OSS bucket to an IMM project. For more information, see <a href="https://help.aliyun.com/document_detail/2391270.html">x-oss-process</a>.</li>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachOSSBucket  AttachOSSBucketRequest
     * @return AttachOSSBucketResponse
     */
    @Override
    public CompletableFuture<AttachOSSBucketResponse> attachOSSBucket(AttachOSSBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachOSSBucket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachOSSBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachOSSBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>A successful deletion message is returned regardless of whether the metadata of the file exists in the dataset.<blockquote>
     * </blockquote>
     * </li>
     * <li>If you delete the metadata of a file from a dataset, the file stored in Object Storage Service (OSS) or Photo and Drive Service is <strong>not</strong> deleted. If you want to delete the file, use the operations provided by OSS or Photo and Drive Service.</li>
     * <li>Metadata deletion affects existing face groups and stories but does not affect existing spatiotemporal groups.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchDeleteFileMeta  BatchDeleteFileMetaRequest
     * @return BatchDeleteFileMetaResponse
     */
    @Override
    public CompletableFuture<BatchDeleteFileMetaResponse> batchDeleteFileMeta(BatchDeleteFileMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteFileMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteFileMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteFileMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetFigureCluster  BatchGetFigureClusterRequest
     * @return BatchGetFigureClusterResponse
     */
    @Override
    public CompletableFuture<BatchGetFigureClusterResponse> batchGetFigureCluster(BatchGetFigureClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetFigureCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetFigureClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetFigureClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, feel free to join the DingTalk chat group (ID: 31690030817) and share your questions with us.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchGetFileMeta  BatchGetFileMetaRequest
     * @return BatchGetFileMetaResponse
     */
    @Override
    public CompletableFuture<BatchGetFileMetaResponse> batchGetFileMeta(BatchGetFileMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetFileMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetFileMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetFileMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Data processing operations supported for metadata processing vary with workflow templates. For more information, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</li>
     * <li>Metadata indexing poses limits on the total number and size of objects. For more information about these limits, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>. For more information about how to create</li>
     * <li>Metadata indexing is available in specific regions. For information about regions that support metadata indexing, see the &quot;Data management and indexing&quot; section of the <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a> topic.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchIndexFileMeta  BatchIndexFileMetaRequest
     * @return BatchIndexFileMetaResponse
     */
    @Override
    public CompletableFuture<BatchIndexFileMetaResponse> batchIndexFileMeta(BatchIndexFileMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchIndexFileMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchIndexFileMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchIndexFileMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>You cannot call this operation to update all metadata. You can update only metadata fields such as CustomLabels, CustomId, and Figures. For more information, see the &quot;Request parameters&quot; section of this topic.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchUpdateFileMeta  BatchUpdateFileMetaRequest
     * @return BatchUpdateFileMetaResponse
     */
    @Override
    public CompletableFuture<BatchUpdateFileMetaResponse> batchUpdateFileMeta(BatchUpdateFileMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchUpdateFileMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUpdateFileMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUpdateFileMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>For the input image, only the face with the largest face frame in the image is used for face comparison. The face frame detection result is consistent with the responses of the <a href="https://help.aliyun.com/document_detail/478213.html">DetectImageFaces</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CompareImageFaces  CompareImageFacesRequest
     * @return CompareImageFacesResponse
     */
    @Override
    public CompletableFuture<CompareImageFacesResponse> compareImageFaces(CompareImageFacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompareImageFaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompareImageFacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompareImageFacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ContextualAnswer  ContextualAnswerRequest
     * @return ContextualAnswerResponse
     */
    @Override
    public CompletableFuture<ContextualAnswerResponse> contextualAnswer(ContextualAnswerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ContextualAnswer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ContextualAnswerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ContextualAnswerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ContextualAnswerResponseBody> contextualAnswerWithResponseIterable(ContextualAnswerRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ContextualAnswer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        ContextualAnswerResponseBodyIterator iterator = ContextualAnswerResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ContextualRetrieval  ContextualRetrievalRequest
     * @return ContextualRetrievalResponse
     */
    @Override
    public CompletableFuture<ContextualRetrievalResponse> contextualRetrieval(ContextualRetrievalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ContextualRetrieval").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ContextualRetrievalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ContextualRetrievalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The operation is in public preview. For any inquires, join our DingTalk chat group (ID: 31690030817) and share your questions with us.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>The operation supports a package that contains up to 80,000 files.</li>
     * <li>The operation supports ZIP or RAR packages up to 200 GB in size, or 7z packages up to 50 GB in size.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateArchiveFileInspectionTask  CreateArchiveFileInspectionTaskRequest
     * @return CreateArchiveFileInspectionTaskResponse
     */
    @Override
    public CompletableFuture<CreateArchiveFileInspectionTaskResponse> createArchiveFileInspectionTask(CreateArchiveFileInspectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateArchiveFileInspectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateArchiveFileInspectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateArchiveFileInspectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you want to create a batch processing task to process data in <a href="https://help.aliyun.com/document_detail/99372.html">OSS</a>, make sure that you have bound the dataset to the OSS bucket where the data is stored. For more information about how to bind a dataset to a bucket, see <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a>.</p>
     * 
     * @param request the request parameters of CreateBatch  CreateBatchRequest
     * @return CreateBatchResponse
     */
    @Override
    public CompletableFuture<CreateBatchResponse> createBatch(CreateBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * Before you create a binding relationship, make sure that the project and the dataset that you want to use exist.</p>
     * <ul>
     * <li>For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>For information about how to create a dataset, see <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a>.<blockquote>
     * <p> The CreateBinding operation works by using the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template</a> that is specified when you created the project or dataset.
     * After you create a binding relationship between a dataset and an OSS bucket, IMM scans the existing objects in the bucket and extracts metadata based on the scanning result. Then, IMM creates an index from the extracted metadata. If new objects are added to the OSS bucket, IMM constantly tracks and scans the objects and updates the index. For objects whose index is created in this way, you can call the <a href="https://help.aliyun.com/document_detail/478175.html">SimpleQuery</a> operation to query, manage, and collect statistics from the objects.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateBinding  CreateBindingRequest
     * @return CreateBindingResponse
     */
    @Override
    public CompletableFuture<CreateBindingResponse> createBinding(CreateBindingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBinding").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBindingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBindingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>This operation supports only Point Cloud Data (PCD) files.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications. &gt;</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCompressPointCloudTask  CreateCompressPointCloudTaskRequest
     * @return CreateCompressPointCloudTaskResponse
     */
    @Override
    public CompletableFuture<CreateCompressPointCloudTaskResponse> createCompressPointCloudTask(CreateCompressPointCloudTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCompressPointCloudTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCompressPointCloudTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCompressPointCloudTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCustomizedStory  CreateCustomizedStoryRequest
     * @return CreateCustomizedStoryResponse
     */
    @Override
    public CompletableFuture<CreateCustomizedStoryResponse> createCustomizedStory(CreateCustomizedStoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomizedStory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomizedStoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomizedStoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>A dataset name must be unique within the same project.</li>
     * <li>A project has an upper limit on the number of datasets that can be created in the project. You can call the <a href="https://help.aliyun.com/document_detail/478155.html">GetProjcet</a> operation to query the dataset limit of the project.</li>
     * <li>After creating a dataset, you can call the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> operation to index metadata. Metadata indexing enhances <a href="https://help.aliyun.com/document_detail/478175.html">data retrieval efficiency and statistics collection</a>, and enables intelligent data management.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    @Override
    public CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of Intelligent Media Management (IMM).
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Make sure that an IMM project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>The region and project specified in the request to decode a blind watermark must match those in the <a href="https://help.aliyun.com/document_detail/2743655.html">EncodeBlindWatermark</a> request to encode the blind watermark.</li>
     * <li>A blind watermark can still be extracted even if attacks, such as compression, scaling, cropping, rotation, and color transformation, are performed on the image.</li>
     * <li>This operation is compatible with its earlier version DecodeBlindWatermark.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task. If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDecodeBlindWatermarkTask  CreateDecodeBlindWatermarkTaskRequest
     * @return CreateDecodeBlindWatermarkTaskResponse
     */
    @Override
    public CompletableFuture<CreateDecodeBlindWatermarkTaskResponse> createDecodeBlindWatermarkTask(CreateDecodeBlindWatermarkTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDecodeBlindWatermarkTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDecodeBlindWatermarkTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDecodeBlindWatermarkTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>The operation searches for faces within the face boundary in each input image.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFacesSearchingTask  CreateFacesSearchingTaskRequest
     * @return CreateFacesSearchingTaskResponse
     */
    @Override
    public CompletableFuture<CreateFacesSearchingTaskResponse> createFacesSearchingTask(CreateFacesSearchingTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFacesSearchingTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFacesSearchingTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFacesSearchingTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the CreateBinding operation or manually by calling the IndexFileMeta or BatchIndexFileMeta operation.</li>
     * <li>Each call to the operation incrementally processes metadata in the dataset. You can regularly call this operation to process incremental files.
     * After the clustering task is completed, you can call the GetFigureCluster or BatchGetFigureCluster  operation to query information about a specific cluster. You can also call the QueryFigureClusters operation to query all face clusters of the specified dataset.</li>
     * <li>Removing image information from the dataset causes changes to face clusters. When images that contain all faces in a cluster are removed, the cluster is deleted.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task. If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFigureClusteringTask  CreateFigureClusteringTaskRequest
     * @return CreateFigureClusteringTaskResponse
     */
    @Override
    public CompletableFuture<CreateFigureClusteringTaskResponse> createFigureClusteringTask(CreateFigureClusteringTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFigureClusteringTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFigureClusteringTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFigureClusteringTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation to cluster all faces in the dataset.</li>
     * <li>If you merge unrelated groups, the feature values of the target groups are affected. As a result, the incremental data may be inaccurately grouped when you create a face clustering task.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFigureClustersMergingTask  CreateFigureClustersMergingTaskRequest
     * @return CreateFigureClustersMergingTaskResponse
     */
    @Override
    public CompletableFuture<CreateFigureClustersMergingTaskResponse> createFigureClustersMergingTask(CreateFigureClustersMergingTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFigureClustersMergingTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFigureClustersMergingTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFigureClustersMergingTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The operation is in public preview. For any inquires, join our DingTalk group (ID: 88490020073) and share your questions with us.
     *  The operation supports file packing only. Compression support will be added later.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>A call to the operation can pack up to 80,000 objects into a package.</li>
     * <li>The total size of all objects to be packed into a package cannot exceed 200 GB.</li>
     * <li>The operation can pack only Standard objects in Object Storage Service (OSS). To pack an object in another storage class, you must first <a href="https://help.aliyun.com/document_detail/90090.html">convert the storage class of the object</a>.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFileCompressionTask  CreateFileCompressionTaskRequest
     * @return CreateFileCompressionTaskResponse
     */
    @Override
    public CompletableFuture<CreateFileCompressionTaskResponse> createFileCompressionTask(CreateFileCompressionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFileCompressionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileCompressionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileCompressionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The operation is in public preview. For any inquires, join our DingTalk group (ID: 88490020073) and share your questions with us.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>The operation supports a package that contains up to 80,000 files.</li>
     * <li>The operation supports ZIP or RAR packages up to 200 GB in size, or 7z packages up to 50 GB in size.</li>
     * <li>The operation extracts files in streams to the specified directory. If the file extraction task is interrupted by a corrupt file, files that have been extracted are not deleted.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFileUncompressionTask  CreateFileUncompressionTaskRequest
     * @return CreateFileUncompressionTaskResponse
     */
    @Override
    public CompletableFuture<CreateFileUncompressionTaskResponse> createFileUncompressionTask(CreateFileUncompressionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFileUncompressionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileUncompressionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileUncompressionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>The image for which you want to create a content moderation task must meet the following requirements:<ul>
     * <li>The image URL supports the HTTP and HTTPS protocols.</li>
     * <li>The image is in one of the following formats: PNG, JPG, JPEG, BMP, GIF, and WebP</li>
     * <li>The image size is limited to 20 MB for synchronous and asynchronous calls, with a maximum height or width of 30,000 pixels. The total number of pixels cannot exceed 250 million. GIF images are limited to 4,194,304 pixels, with a maximum height or width of 30,000 pixels.</li>
     * <li>The image download time is limited to 3 seconds. If the download takes longer, a timeout error occurs.</li>
     * <li>To ensure effective moderation, we recommend that you submit an image with dimensions of at least 256 × 256 pixels.</li>
     * <li>The response time of the CreateImageModerationTask operation varies based on the duration of the image download. Make sure that the image is stored in a stable and reliable service. We recommend that you store images on Alibaba Cloud Object Storage Service (OSS) or cache them on Alibaba Cloud CDN.</li>
     * </ul>
     * </li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478241.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can also obtain information about the task based on notifications.<blockquote>
     * <p> The detection result is sent as an asynchronous notification. The Suggestion field of the notification can have one of the following values:</p>
     * </blockquote>
     * </li>
     * <li>pass: No non-compliant content is found.</li>
     * <li>block: Non-compliant content is detected. The Categories field value indicates the non-compliance categories. For more information, see Content moderation results.</li>
     * <li>review: A manual review is needed. After the manual review is finished, another asynchronous notification is sent to inform you about the review result. &gt;</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageModerationTask  CreateImageModerationTaskRequest
     * @return CreateImageModerationTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageModerationTaskResponse> createImageModerationTask(CreateImageModerationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageModerationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageModerationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageModerationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the project that you want to use exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>You can call this operation to splice up to eight images. Each side of an image cannot exceed 32,876 pixels, and the total number of pixels of the image cannot exceed 1 billion.</li>
     * <li>The CreateImageSplicingTask operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period elapses, the task information is no longer retrievable. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can also obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageSplicingTask  CreateImageSplicingTaskRequest
     * @return CreateImageSplicingTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageSplicingTaskResponse> createImageSplicingTask(CreateImageSplicingTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageSplicingTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageSplicingTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageSplicingTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>You can specify up to 100 images in a call to the operation.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageToPDFTask  CreateImageToPDFTaskRequest
     * @return CreateImageToPDFTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageToPDFTaskResponse> createImageToPDFTask(CreateImageToPDFTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageToPDFTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageToPDFTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageToPDFTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Each call to the operation incrementally processes metadata in the dataset.****`` You can regularly call this operation to process incremental files.</li>
     * <li>After a spatiotemporal clustering task is complete, you can call the <a href="https://help.aliyun.com/document_detail/478189.html">QueryLocationDateClusters</a> operation to query the spatiotemporal clustering result.</li>
     * <li>Removing metadata from a dataset does not affect existing spatiotemporal clusters for the dataset. To delete a spatiotemporal cluster, call the <a href="https://help.aliyun.com/document_detail/478191.html">DeleteLocationDateCluster</a> operation.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLocationDateClusteringTask  CreateLocationDateClusteringTaskRequest
     * @return CreateLocationDateClusteringTaskResponse
     */
    @Override
    public CompletableFuture<CreateLocationDateClusteringTaskResponse> createLocationDateClusteringTask(CreateLocationDateClusteringTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLocationDateClusteringTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLocationDateClusteringTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLocationDateClusteringTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>By default, only one type of video, audio, and subtitle streams is processed when you call this operation to process media transcoding. However, you can specify the number of video, audio, or subtitle streams that you want to process.</li>
     * <li>When you use this operation to execute a media merging task, up to 11 media files are supported. In this case, the parameters that involve media transcoding and frame capturing apply to the merged media data.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.
     * **<hr>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateMediaConvertTask  CreateMediaConvertTaskRequest
     * @return CreateMediaConvertTaskResponse
     */
    @Override
    public CompletableFuture<CreateMediaConvertTaskResponse> createMediaConvertTask(CreateMediaConvertTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMediaConvertTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMediaConvertTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMediaConvertTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>The operation supports the following input formats:<ul>
     * <li>Text documents: doc, docx, wps, wpss, docm, dotm, dot, dotx, and html</li>
     * <li>Presentation documents: pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, and dpss</li>
     * <li>Spreadsheet documents: xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, and ets</li>
     * <li>PDF documents: pdf</li>
     * </ul>
     * </li>
     * <li>The operation supports the following output formats:<ul>
     * <li>Image files: png and jpg</li>
     * <li>Text files: txt</li>
     * <li>PDF files: pdf</li>
     * </ul>
     * </li>
     * <li>Each input document can be up to 200 MB in size.</li>
     * <li>The maximum conversion time is 120 seconds. If the document contains too much or complex content, the conversion may time out.</li>
     * <li>The operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can use one of the following methods to query task information:<ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.``</li>
     * <li>In the region in which the IMM project is located, configure a Simple Message Queue (SMQ) subscription to receive task information notifications. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>. For information about SMQ SDKs, see <a href="https://help.aliyun.com/document_detail/32449.html">Use queues</a>.</li>
     * <li>In the region in which the IMM project is located, create an ApsaraMQ for RocketMQ 4.0 instance, a topic, and a group to receive task notifications. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>. For more information about how to use ApsaraMQ for RocketMQ, see <a href="https://help.aliyun.com/document_detail/169009.html">Call HTTP SDKs to send and subscribe to messages</a>.</li>
     * <li>In the region in which the IMM project is located, use <a href="https://www.aliyun.com/product/aliware/eventbridge">EventBridge</a> to receive task information notifications. For more information, see <a href="https://help.aliyun.com/document_detail/205730.html">IMM events</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateOfficeConversionTask  CreateOfficeConversionTaskRequest
     * @return CreateOfficeConversionTaskResponse
     */
    @Override
    public CompletableFuture<CreateOfficeConversionTaskResponse> createOfficeConversionTask(CreateOfficeConversionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOfficeConversionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOfficeConversionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOfficeConversionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The name of a project must be unique in a region.</p>
     * <ul>
     * <li>By default, you can create up to 100 projects in a region. If you want to request a quota increase to create more projects, submit a ticket or join the DingTalk chat group (ID: 88490020073).</li>
     * <li>After you create a project, you can create other Intelligent Media Management (IMM) resources in the project. For more information, see the following links:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/479912.html">CreateTrigger</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/606694.html">CreateBatch</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    @Override
    public CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note that</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Each call to the operation incrementally processes metadata in the dataset.****`` You can regularly call this operation to process incremental files.</li>
     * <li>After clustering is completed, you can call the <a href="https://help.aliyun.com/document_detail/611304.html">QuerySimilarImageClusters</a> operation to query image clustering results.</li>
     * <li>An image cluster contains at lest two images. Removing similar images from the dataset affects existing image clusters. If image deletion reduces the number of images in a cluster to less than 2, the cluster is automatically deleted.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSimilarImageClusteringTask  CreateSimilarImageClusteringTaskRequest
     * @return CreateSimilarImageClusteringTaskResponse
     */
    @Override
    public CompletableFuture<CreateSimilarImageClusteringTaskResponse> createSimilarImageClusteringTask(CreateSimilarImageClusteringTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSimilarImageClusteringTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSimilarImageClusteringTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSimilarImageClusteringTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> to query information about the task. If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateStory  CreateStoryRequest
     * @return CreateStoryResponse
     */
    @Override
    public CompletableFuture<CreateStoryResponse> createStory(CreateStoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you want to create a trigger to process data in <a href="https://help.aliyun.com/document_detail/99372.html">OSS</a>, make sure that you have bound the dataset to the OSS bucket where the data is stored. For more information about how to bind a dataset to a bucket, see <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a>.</p>
     * 
     * @param request the request parameters of CreateTrigger  CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    @Override
    public CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTrigger").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/2747104.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that an IMM project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>For more information about video label detection, see <a href="https://help.aliyun.com/document_detail/477189.html">Video label detection</a>.</li>
     * <li>This operation supports multiple video formats, such as MP4, MPEG-TS, MKV, MOV, AVI, FLV, and M3U8.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVideoLabelClassificationTask  CreateVideoLabelClassificationTaskRequest
     * @return CreateVideoLabelClassificationTaskResponse
     */
    @Override
    public CompletableFuture<CreateVideoLabelClassificationTaskResponse> createVideoLabelClassificationTask(CreateVideoLabelClassificationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVideoLabelClassificationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVideoLabelClassificationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVideoLabelClassificationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>The detection result is sent as an asynchronous notification. The Suggestion parameter in asynchronous notifications supports the following values:<ul>
     * <li>pass: No non-compliant content is found.</li>
     * <li>block: Non-compliant content is detected. The Categories field value indicates the non-compliance category. For more information, see <a href="https://help.aliyun.com/document_detail/2743995.html">Content moderation results</a>.</li>
     * <li>review: A manual review is needed before an asynchronous notification is sent to inform you about the result.</li>
     * </ul>
     * </li>
     * <li>The following video frame requirements apply:<ul>
     * <li>The URLs for video frames must use HTTP or HTTPS.</li>
     * <li>Video frames must be in PNG, JPG, JPEG, BMP, GIF, or WebP format.</li>
     * <li>The size of a video frame cannot exceed 10 MB.</li>
     * <li>The recommended resolution for video frames is not lower than 256 × 256 pixels. A frame resolution lower than the recommended resolution may affect detection accuracy.</li>
     * <li>The response time of the operation varies based on the amount of time required to download frames. Make sure that video frames to detect are stored in a reliable and stable service. We recommend that you store video frames in OSS or cache video frames on Alibaba Cloud CDN.</li>
     * </ul>
     * </li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVideoModerationTask  CreateVideoModerationTaskRequest
     * @return CreateVideoModerationTaskResponse
     */
    @Override
    public CompletableFuture<CreateVideoModerationTaskResponse> createVideoModerationTask(CreateVideoModerationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVideoModerationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVideoModerationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVideoModerationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can delete only a batch processing task that is in one of the following states: Ready, Failed, Suspended, and Succeeded.</p>
     * <ul>
     * <li>Before you delete a batch processing task, you can call the <a href="https://help.aliyun.com/document_detail/479922.html">GetBatch</a> operation to query the task status. This ensures a successful deletion.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBatch  DeleteBatchRequest
     * @return DeleteBatchResponse
     */
    @Override
    public CompletableFuture<DeleteBatchResponse> deleteBatch(DeleteBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>If you delete a binding, new changes in the OSS bucket are not synchronized to the dataset. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBinding  DeleteBindingRequest
     * @return DeleteBindingResponse
     */
    @Override
    public CompletableFuture<DeleteBindingResponse> deleteBinding(DeleteBindingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBinding").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBindingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBindingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a dataset, make sure that you have deleted all indexes in the dataset. For more information about how to delete indexes, see <a href="https://help.aliyun.com/document_detail/478172.html">DeleteFileMeta</a> and <a href="https://help.aliyun.com/document_detail/478173.html">BatchDeleteFileMeta</a>.</p>
     * <ul>
     * <li>Before you <a href="https://help.aliyun.com/document_detail/478160.html">delete a dataset</a>, make sure that you have deleted all bindings between the dataset and Object Storage Service (OSS) buckets. For more information about how to delete a binding, see <a href="https://help.aliyun.com/document_detail/478205.html">DeleteBinding</a>. The <a href="https://help.aliyun.com/document_detail/478205.html">DeleteBinding</a> operation does not delete an index that is manually created, even if you set the <code>Cleanup</code> parameter to <code>true</code>. To delete indexes that are manually created, you must call the <a href="https://help.aliyun.com/document_detail/478172.html">DeleteFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478173.html">BatchDeleteFileMeta</a> operation. For more information about the differences between automatically and manually created indexes, see <a href="https://help.aliyun.com/document_detail/478166.html">Create a metadata index</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>A successful deletion message is returned regardless of whether the metadata of the file exists in the dataset.<blockquote>
     * </blockquote>
     * </li>
     * <li>The objects stored in Object Storage Service (OSS) or Photo and Drive Service are <strong>not</strong> deleted if you delete metadata from a dataset. If you want to delete the file, call the corresponding operations of OSS and Photo and Drive Service.</li>
     * <li>When you delete file metadata, the corresponding face clustering group information and story (if any) are changed, but the spatiotemporal clustering is not changed.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFileMeta  DeleteFileMetaRequest
     * @return DeleteFileMetaResponse
     */
    @Override
    public CompletableFuture<DeleteFileMetaResponse> deleteFileMeta(DeleteFileMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFileMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFileMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFileMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to perform spatiotemporal clustering.</li>
     * <li>A successful deletion is returned regardless of whether a spatiotemporal clustering group ID exists.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLocationDateCluster  DeleteLocationDateClusterRequest
     * @return DeleteLocationDateClusterResponse
     */
    @Override
    public CompletableFuture<DeleteLocationDateClusterResponse> deleteLocationDateCluster(DeleteLocationDateClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLocationDateCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLocationDateClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLocationDateClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a project, make sure that all resources in the project, such as datasets, bindings, batch processing tasks, and triggers, are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/478164.html">DeleteDataset</a>, <a href="https://help.aliyun.com/document_detail/479918.html">DeleteBatch</a>, and <a href="https://help.aliyun.com/document_detail/479915.html">DeleteTrigger</a>.</p>
     * <ul>
     * <li>After a project is deleted, all resources used by the project are recycled, and all related data is lost and cannot be recovered.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    @Override
    public CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478193.html">CreateStory</a> or <a href="https://help.aliyun.com/document_detail/478196.html">CreateCustomizedStory</a> operation to create a story.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteStory  DeleteStoryRequest
     * @return DeleteStoryResponse
     */
    @Override
    public CompletableFuture<DeleteStoryResponse> deleteStory(DeleteStoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can delete a trigger only if the trigger is in one of the following states: Ready, Failed, Suspended, and Succeeded. You cannot delete a trigger that is in the Running state.</p>
     * 
     * @param request the request parameters of DeleteTrigger  DeleteTriggerRequest
     * @return DeleteTriggerResponse
     */
    @Override
    public CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTrigger").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that the project is bound to a bucket. For more information, see <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachOSSBucket  DetachOSSBucketRequest
     * @return DetachOSSBucketResponse
     */
    @Override
    public CompletableFuture<DetachOSSBucketResponse> detachOSSBucket(DetachOSSBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachOSSBucket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachOSSBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachOSSBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that an Intelligent Media Management (IMM) project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <ul>
     * <li>For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectImageBodies  DetectImageBodiesRequest
     * @return DetectImageBodiesResponse
     */
    @Override
    public CompletableFuture<DetectImageBodiesResponse> detectImageBodies(DetectImageBodiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectImageBodies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectImageBodiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectImageBodiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</p>
     * 
     * @param request the request parameters of DetectImageCars  DetectImageCarsRequest
     * @return DetectImageCarsResponse
     */
    @Override
    public CompletableFuture<DetectImageCarsResponse> detectImageCars(DetectImageCarsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectImageCars").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectImageCarsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectImageCarsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</p>
     * 
     * @param request the request parameters of DetectImageCodes  DetectImageCodesRequest
     * @return DetectImageCodesResponse
     */
    @Override
    public CompletableFuture<DetectImageCodesResponse> detectImageCodes(DetectImageCodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectImageCodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectImageCodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectImageCodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetectImageCropping  DetectImageCroppingRequest
     * @return DetectImageCroppingResponse
     */
    @Override
    public CompletableFuture<DetectImageCroppingResponse> detectImageCropping(DetectImageCroppingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectImageCropping").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectImageCroppingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectImageCroppingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectImageFaces  DetectImageFacesRequest
     * @return DetectImageFacesResponse
     */
    @Override
    public CompletableFuture<DetectImageFacesResponse> detectImageFaces(DetectImageFacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectImageFaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectImageFacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectImageFacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that an IMM <a href="https://help.aliyun.com/document_detail/478273.html">project</a> is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>For more information about the features of this operation, see <a href="https://help.aliyun.com/document_detail/477179.html">Image label detection</a>.</li>
     * <li>For more information about the input images supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectImageLabels  DetectImageLabelsRequest
     * @return DetectImageLabelsResponse
     */
    @Override
    public CompletableFuture<DetectImageLabelsResponse> detectImageLabels(DetectImageLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectImageLabels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectImageLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectImageLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478273.html">Project management</a>.<a href="~~478152~~"></a></li>
     * <li>For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectImageScore  DetectImageScoreRequest
     * @return DetectImageScoreResponse
     */
    @Override
    public CompletableFuture<DetectImageScoreResponse> detectImageScore(DetectImageScoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectImageScore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectImageScoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectImageScoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>The size of the image cannot exceed 20 MB.</li>
     * <li>The shortest side of the image is not less than 20 px, and the longest side is not more than 30,000 px.</li>
     * <li>The aspect ratio of the image is less than 1:2.</li>
     * <li>We recommend that you do not use an image that is smaller than 15 px × 15 px in size. Otherwise, the recognition rate is low.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectImageTexts  DetectImageTextsRequest
     * @return DetectImageTextsResponse
     */
    @Override
    public CompletableFuture<DetectImageTextsResponse> detectImageTexts(DetectImageTextsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectImageTexts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectImageTextsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectImageTextsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectMediaMeta  DetectMediaMetaRequest
     * @return DetectMediaMetaResponse
     */
    @Override
    public CompletableFuture<DetectMediaMetaResponse> detectMediaMeta(DetectMediaMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectMediaMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectMediaMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectMediaMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <blockquote>
     * <p> The text compliance detection feature only supports Chinese characters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DetectTextAnomaly  DetectTextAnomalyRequest
     * @return DetectTextAnomalyResponse
     */
    @Override
    public CompletableFuture<DetectTextAnomalyResponse> detectTextAnomaly(DetectTextAnomalyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectTextAnomaly").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectTextAnomalyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectTextAnomalyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of Intelligent Media Management (IMM).</p>
     * <ul>
     * <li>Make sure that an IMM project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>You can embed only text as blind watermarks to an image.</li>
     * <li>The format of the output image is the same as that of the input image.</li>
     * <li>The watermarks can still be extracted even if attacks, such as compression, scaling, cropping, rotation, and color transformation, are performed on the image.</li>
     * <li>Pure black and white images and images with low resolution (roughly less than 200 px × 200 px,) are not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of EncodeBlindWatermark  EncodeBlindWatermarkRequest
     * @return EncodeBlindWatermarkResponse
     */
    @Override
    public CompletableFuture<EncodeBlindWatermarkResponse> encodeBlindWatermark(EncodeBlindWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EncodeBlindWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EncodeBlindWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EncodeBlindWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478273.html">Project management</a>.<a href="~~478152~~"></a></li>
     * <li>The following document formats are supported: Word, Excel, PPT, PDF, and TXT.</li>
     * <li>The document cannot exceed 200 MB in size. The size of the extracted text cannot exceed 2 MB in size (approximately 1.2 million letters).<blockquote>
     * <p> If the format of the document is complex or the document body is too large, a timeout error may occur. In this case, we recommend that you call the CreateOfficeConversionTask operation to convert the document to the TXT format before you call the ExtractDocumentText operation.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ExtractDocumentText  ExtractDocumentTextRequest
     * @return ExtractDocumentTextResponse
     */
    @Override
    public CompletableFuture<ExtractDocumentTextResponse> extractDocumentText(ExtractDocumentTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExtractDocumentText").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExtractDocumentTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExtractDocumentTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, join the DingTalk chat group (ID: 88490020073) and share your questions with us.</li>
     * <li>For information about the fields that you can use as query conditions, see <a href="https://help.aliyun.com/document_detail/2743991.html">Supported fields and operators</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of FuzzyQuery  FuzzyQueryRequest
     * @return FuzzyQueryResponse
     */
    @Override
    public CompletableFuture<FuzzyQueryResponse> fuzzyQuery(FuzzyQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FuzzyQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FuzzyQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FuzzyQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Make sure that the project that you want to use is available in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project Management</a>.</li>
     * <li>By default, you can call this operation to process only one video, audio, or subtitle track. You can specify the number of the video, audio, or subtitle tracks that you want to process.</li>
     * <li>You can call this operation to generate a media playlist and a master playlist. For more information, see the parameter description.</li>
     * <li>This operation is a synchronous operation. Synchronous or asynchronous transcoding is triggered only during playback or pre-transcoding. You can configure the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to obtain the transcoding task result.</li>
     * <li>For information about the feature description of this operation, see <a href="https://help.aliyun.com/document_detail/477192.html">Live transcoding</a>.</li>
     * <li>The data processing capability of Object Storage Service (OSS) also provides the playlist generation feature. However, this feature can generate only a media playlist, and related parameters are simplified.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateVideoPlaylist  GenerateVideoPlaylistRequest
     * @return GenerateVideoPlaylistResponse
     */
    @Override
    public CompletableFuture<GenerateVideoPlaylistResponse> generateVideoPlaylist(GenerateVideoPlaylistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateVideoPlaylist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateVideoPlaylistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateVideoPlaylistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>The operation generates an access token that is valid for 30 minutes and a refresh token that is valid for 1 day.</li>
     * <li>The returned expiration time is in UTC.</li>
     * <li>The operation supports the following input formats:<ul>
     * <li>Word files: .doc, .docx, .txt, .dot, .wps, .wpt, .dotx, .docm, .dotm, and .rtf</li>
     * <li>Presentation files: .ppt, .pptx, .pptm, .ppsx, .ppsm, .pps, .potx, .potm, .dpt, and .dps</li>
     * <li>Spreadsheet documents: .et, .xls, .xlt, .xlsx, .xlsm, .xltx, .xltm, and .csv</li>
     * <li>PDF files: .pdf</li>
     * </ul>
     * </li>
     * <li>The operation supports an input document that is up to 200 MB in size.</li>
     * <li>The operation supports an input document that contains up to 5,000 pages.</li>
     * <li>For a project created before December 1, 2023, you are charged for previewing or editing a document in the project based on the number of times the document is opened. For a project created on or after December 1, 2023, you are charged based on the number of API operation calls made for previewing or editing a document. If you want to switch to API call-based billing for document previewing and editing, use a project created on or after December 1, 2023. In API call-based billing, one API call allows only one user to use the feature. If multiple users use the information returned by the API call, only the last user has access to the document and the access permissions of other users are revoked.</li>
     * <li>You can use the NotifyTopicName parameter to specify a Simple Message Queue (SMQ) topic in the same region as the IMM project for getting notified of file save operations. For more information, see <a href="https://help.aliyun.com/document_detail/32449.html">Use queues</a>. For more information about the JSON example of the Message field, see <a href="https://help.aliyun.com/document_detail/2743999.html">WebOffice message example</a>.<blockquote>
     * <p> To manage multiple versions of the document, you must enable versioning for the bucket that stores the document and set the History parameter to true.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GenerateWebofficeToken  GenerateWebofficeTokenRequest
     * @return GenerateWebofficeTokenResponse
     */
    @Override
    public CompletableFuture<GenerateWebofficeTokenResponse> generateWebofficeToken(GenerateWebofficeTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateWebofficeToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateWebofficeTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateWebofficeTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBatch  GetBatchRequest
     * @return GetBatchResponse
     */
    @Override
    public CompletableFuture<GetBatchResponse> getBatch(GetBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Make sure that the binding relationship that you want to query exists. For information about how to create a binding relationship, see <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetBinding  GetBindingRequest
     * @return GetBindingResponse
     */
    @Override
    public CompletableFuture<GetBindingResponse> getBinding(GetBindingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBinding").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBindingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBindingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetDRMLicense is deprecated  * @param request  the request parameters of GetDRMLicense  GetDRMLicenseRequest
     * @return GetDRMLicenseResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetDRMLicenseResponse> getDRMLicense(GetDRMLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDRMLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDRMLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDRMLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>The GetDataset operation supports real-time retrieval of file statistics. You can specify WithStatistics to enable real-time retrieval of file statistics.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDataset  GetDatasetRequest
     * @return GetDatasetResponse
     */
    @Override
    public CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that an Intelligent Media Management (IMM) project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that an invisible watermark task is created and the task ID is obtained.``</li>
     * </ul>
     * 
     * @param request the request parameters of GetDecodeBlindWatermarkResult  GetDecodeBlindWatermarkResultRequest
     * @return GetDecodeBlindWatermarkResultResponse
     */
    @Override
    public CompletableFuture<GetDecodeBlindWatermarkResultResponse> getDecodeBlindWatermarkResult(GetDecodeBlindWatermarkResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDecodeBlindWatermarkResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDecodeBlindWatermarkResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDecodeBlindWatermarkResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Before you call this operation, make sure that a face clustering task is created to group all faces in a dataset. For information about how to create a face clustering task, see <a href="~~CreateFigureClusteringTask~~">CreateFigureClusteringTask</a>. For information about how to create a dataset, see <a href="~~CreateDataset~~">CreateDataset</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetFigureCluster  GetFigureClusterRequest
     * @return GetFigureClusterResponse
     */
    @Override
    public CompletableFuture<GetFigureClusterResponse> getFigureCluster(GetFigureClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFigureCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFigureClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFigureClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, join the DingTalk chat group (ID: 31690030817) and share your questions with us.</li>
     * </ul>
     * 
     * @param request the request parameters of GetFileMeta  GetFileMetaRequest
     * @return GetFileMetaResponse
     */
    @Override
    public CompletableFuture<GetFileMetaResponse> getFileMeta(GetFileMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageModerationResult  GetImageModerationResultRequest
     * @return GetImageModerationResultResponse
     */
    @Override
    public CompletableFuture<GetImageModerationResultResponse> getImageModerationResult(GetImageModerationResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageModerationResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageModerationResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageModerationResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Before you call this operation, make sure that <a href="https://help.aliyun.com/document_detail/478206.html">the project whose name you want to query is bound to the specified OSS bucket</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetOSSBucketAttachment  GetOSSBucketAttachmentRequest
     * @return GetOSSBucketAttachmentResponse
     */
    @Override
    public CompletableFuture<GetOSSBucketAttachmentResponse> getOSSBucketAttachment(GetOSSBucketAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOSSBucketAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOSSBucketAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOSSBucketAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you can enable the real-time retrieval of file statistics based on your business requirements. For more information, see the &quot;Request parameters&quot; section of this topic.</p>
     * 
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    @Override
    public CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478193.html">CreateStory</a> or <a href="https://help.aliyun.com/document_detail/478196.html">CreateCustomizedStory</a> operation to create a story.</li>
     * </ul>
     * 
     * @param request the request parameters of GetStory  GetStoryRequest
     * @return GetStoryResponse
     */
    @Override
    public CompletableFuture<GetStoryResponse> getStory(GetStoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.</p>
     * 
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    @Override
    public CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrigger  GetTriggerRequest
     * @return GetTriggerResponse
     */
    @Override
    public CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTrigger").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that a <a href="https://help.aliyun.com/document_detail/478273.html">project</a> is created on Intelligent Media Management (IMM). For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that a video label detection task is created and the <code>TaskId</code> of the task is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/478223.html">CreateVideoLabelClassificationTask</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetVideoLabelClassificationResult  GetVideoLabelClassificationResultRequest
     * @return GetVideoLabelClassificationResultResponse
     */
    @Override
    public CompletableFuture<GetVideoLabelClassificationResultResponse> getVideoLabelClassificationResult(GetVideoLabelClassificationResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoLabelClassificationResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoLabelClassificationResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoLabelClassificationResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideoModerationResult  GetVideoModerationResultRequest
     * @return GetVideoModerationResultResponse
     */
    @Override
    public CompletableFuture<GetVideoModerationResultResponse> getVideoModerationResult(GetVideoModerationResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoModerationResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoModerationResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoModerationResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>For information about how to create indexes from metadata, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</li>
     * <li>For information about the limits on the maximum number and size of index files that you can create, see the &quot;Limits on datasets&quot; section of the <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a> topic. For information about how to create a dataset, see the &quot;CreateDataset&quot; topic.</li>
     * <li>For information about the regions in which you can create index files from metadata, see the &quot;Datasets and indexes&quot; section of the <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a> topic.</li>
     * <li>After you create an index from metadata, you can try <a href="https://help.aliyun.com/document_detail/478175.html">simple query</a> to retrieve data. For information about other query capabilities, see <a href="https://help.aliyun.com/document_detail/2402363.html">Query and statistics</a>. You can also <a href="https://help.aliyun.com/document_detail/478180.html">create a face clustering task</a> to group faces. For information about other clustering capabilities, see <a href="https://help.aliyun.com/document_detail/2402365.html">Intelligent management</a>.
     * **
     * <strong>Usage notes</strong></li>
     * <li>The IndexFileMeta operation is asynchronous, indicating that it takes some time to process the data after a request is submitted. After the processing is complete, the metadata is stored in your dataset. The amount of time it takes for this process varies based on <a href="https://help.aliyun.com/document_detail/466304.html">the workflow template, the operator</a>, and the content of the file, ranging from several seconds to several minutes or even longer. You can subscribe to <a href="https://help.aliyun.com/document_detail/2743997.html">Simple Message Service</a> for task completion notifications.</li>
     * </ul>
     * 
     * @param request the request parameters of IndexFileMeta  IndexFileMetaRequest
     * @return IndexFileMetaResponse
     */
    @Override
    public CompletableFuture<IndexFileMetaResponse> indexFileMeta(IndexFileMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IndexFileMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IndexFileMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IndexFileMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBatches  ListBatchesRequest
     * @return ListBatchesResponse
     */
    @Override
    public CompletableFuture<ListBatchesResponse> listBatches(ListBatchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBatches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBatchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBatchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</p>
     * 
     * @param request the request parameters of ListBindings  ListBindingsRequest
     * @return ListBindingsResponse
     */
    @Override
    public CompletableFuture<ListBindingsResponse> listBindings(ListBindingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBindings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBindingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBindingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasets  ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    @Override
    public CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDatasets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The ListProjects operation supports pagination. When you call this operation, you must specify the token that is obtained from the previous query as the value of NextToken. You must also specify MaxResults to limit the number of entries to return.</p>
     * 
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    @Override
    public CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProjects").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    @Override
    public CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</p>
     * 
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    @Override
    public CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTriggers  ListTriggersRequest
     * @return ListTriggersResponse
     */
    @Override
    public CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTriggers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTriggersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTriggersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that a face clustering task is created to group all faces in a dataset. For information about how to create a face clustering task, see <a href="~~CreateFigureClusteringTask~~">CreateFigureClusteringTask</a>. For information about how to create a dataset, see <a href="~~CreateDataset~~">CreateDataset</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryFigureClusters  QueryFigureClustersRequest
     * @return QueryFigureClustersResponse
     */
    @Override
    public CompletableFuture<QueryFigureClustersResponse> queryFigureClusters(QueryFigureClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFigureClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFigureClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFigureClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to perform spatiotemporal clustering.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryLocationDateClusters  QueryLocationDateClustersRequest
     * @return QueryLocationDateClustersResponse
     */
    @Override
    public CompletableFuture<QueryLocationDateClustersResponse> queryLocationDateClusters(QueryLocationDateClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryLocationDateClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLocationDateClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLocationDateClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/611302.html">CreateSimilarImageClusteringTask</a> operation to cluster similar images in the dataset.</li>
     * </ul>
     * 
     * @param request the request parameters of QuerySimilarImageClusters  QuerySimilarImageClustersRequest
     * @return QuerySimilarImageClustersResponse
     */
    @Override
    public CompletableFuture<QuerySimilarImageClustersResponse> querySimilarImageClusters(QuerySimilarImageClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySimilarImageClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySimilarImageClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySimilarImageClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478193.html">CreateStory</a> or <a href="https://help.aliyun.com/document_detail/478196.html">CreateCustomizedStory</a> operation to create a story.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryStories  QueryStoriesRequest
     * @return QueryStoriesResponse
     */
    @Override
    public CompletableFuture<QueryStoriesResponse> queryStories(QueryStoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryStories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryStoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryStoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/2639703.html">WebOffice billing</a>.</li>
     * <li>The access token returned by this operation is valid for 30 minutes. After the access token expires, you cannot use it to access the document.</li>
     * <li>The refresh token returned by this operation is valid for one day. You need to use the refresh token for the next call to the operation before the refresh token expires. After the validity period elapses, the refresh token is invalid.</li>
     * <li>The returned expiration time is displayed in UTC.<blockquote>
     * <p> An access token is used to actually access a document, whereas a refresh token is used to avoid repeated access configurations.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RefreshWebofficeToken  RefreshWebofficeTokenRequest
     * @return RefreshWebofficeTokenResponse
     */
    @Override
    public CompletableFuture<RefreshWebofficeTokenResponse> refreshWebofficeToken(RefreshWebofficeTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshWebofficeToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshWebofficeTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshWebofficeTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveStoryFiles  RemoveStoryFilesRequest
     * @return RemoveStoryFilesResponse
     */
    @Override
    public CompletableFuture<RemoveStoryFilesResponse> removeStoryFiles(RemoveStoryFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveStoryFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveStoryFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveStoryFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can resume a batch processing task only when the task is in the Suspended or Failed state. A batch processing task continues to provide services after you resume the task.</p>
     * 
     * @param request the request parameters of ResumeBatch  ResumeBatchRequest
     * @return ResumeBatchResponse
     */
    @Override
    public CompletableFuture<ResumeBatchResponse> resumeBatch(ResumeBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can resume only a trigger that is in the Suspended or Failed state. After you resume a trigger, the trigger continues to provide services as expected.</p>
     * 
     * @param request the request parameters of ResumeTrigger  ResumeTriggerRequest
     * @return ResumeTriggerResponse
     */
    @Override
    public CompletableFuture<ResumeTriggerResponse> resumeTrigger(ResumeTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeTrigger").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have created a face clustering task by calling the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation to cluster all faces in the dataset.</li>
     * </ul>
     * 
     * @param request the request parameters of SearchImageFigureCluster  SearchImageFigureClusterRequest
     * @return SearchImageFigureClusterResponse
     */
    @Override
    public CompletableFuture<SearchImageFigureClusterResponse> searchImageFigureCluster(SearchImageFigureClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchImageFigureCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchImageFigureClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchImageFigureClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).**** Each time you call this operation, you are charged for semantic understanding and query fees.</li>
     * <li>Before you call this operation, make sure that the file that you want to use is indexed into the dataset that you use. To index a file into a dataset, you can call one of the following operations: <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>, <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a>, and <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>.</li>
     * <li>The response provided in this example is for reference only. The categories and content of metadata vary based on configurations of <a href="https://help.aliyun.com/document_detail/466304.html">workflow templates</a>. If you have questions, search for and join the DingTalk group numbered 21714099.</li>
     * </ul>
     * <h3><a href="#"></a>Usage limits</h3>
     * <ul>
     * <li>Each time you call this operation, up to 1,000 metadata files are returned.</li>
     * <li>Pagination is not supported.</li>
     * <li>The natural language processing capability may not always produce completely accurate results.</li>
     * </ul>
     * <h3><a href="#"></a>Usage methods</h3>
     * <p>You can query files within a dataset by using natural language keywords. Key information supported for understanding includes labels (Labels.LabelName), time (ProduceTime), and location (Address.AddressLine). For example, if you use <code>2023 Hangzhou scenery</code> as the query criterion, the operation intelligently breaks the query criterion down into the following sub-criteria, and returns the files that meet all the sub-criteria:</p>
     * <ul>
     * <li>ProduceTime: 00:00 on January 1, 2023 to 00:00 on December 31, 2023.</li>
     * <li>Address.AddressLine: <code>Hangzhou</code></li>
     * <li>Labels.LabelName: <code>scenery</code>.
     * When you call this operation, you can configure a <a href="https://help.aliyun.com/document_detail/466304.html">workflow template</a> that includes the <code>ImageEmbeddingExtraction</code> operator. This allows the operation to return image content when the query you input matches the image content, thereby achieving intelligent image retrieval.``</li>
     * </ul>
     * 
     * @param request the request parameters of SemanticQuery  SemanticQueryRequest
     * @return SemanticQueryResponse
     */
    @Override
    public CompletableFuture<SemanticQueryResponse> semanticQuery(SemanticQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SemanticQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SemanticQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SemanticQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, join the DingTalk chat group (ID: 31690030817) and share your questions with us.
     * <strong>Limits</strong></li>
     * <li>Each query returns information about up to 100 files.</li>
     * <li>Each query returns up to 2,000 aggregations.</li>
     * <li>A subquery supports up to 100 conditions.</li>
     * <li>A subquery can have a maximum nesting depth of 5 levels.
     * <strong>Example query conditions</strong></li>
     * <li>Retrieve JPEG images larger than 1,000 pixels:<!---->
     * {
     *   &quot;SubQueries&quot;:[
     * {
     *   &quot;Field&quot;:&quot;ContentType&quot;,
     *   &quot;Value&quot;: &quot;image/jpeg&quot;,
     *   &quot;Operation&quot;:&quot;eq&quot;
     * },<br>{
     *   &quot;Field&quot;:&quot;ImageWidth&quot;,
     *   &quot;Value&quot;:&quot;1000&quot;,
     *   &quot;Operation&quot;:&quot;gt&quot;
     * }
     *   ],
     *   &quot;Operation&quot;:&quot;and&quot;
     * }</li>
     * <li>Search <code>oss://examplebucket/path/</code> for objects that have the <code>TV</code> or <code>Stereo</code> label and are larger than 10 MB in size:<blockquote>
     * <p> This query requires matching files to have the <code>TV</code> or <code>Stereo</code> label. The two labels are specified as separate objects in the <code>Labels</code> fields.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <pre><code>{
     *   &quot;SubQueries&quot;: [
     *     {
     *       &quot;Field&quot;: &quot;URI&quot;,
     *       &quot;Value&quot;: &quot;oss://examplebucket/path/&quot;,
     *       &quot;Operation&quot;: &quot;prefix&quot;
     *     },
     *     {
     *       &quot;Field&quot;: &quot;Size&quot;,
     *       &quot;Value&quot;: &quot;1048576&quot;,
     *       &quot;Operation&quot;: &quot;gt&quot;
     *     },
     *     {
     *       &quot;SubQueries&quot;: [
     *         {
     *           &quot;Field&quot;: &quot;Labels.LabelName&quot;,
     *           &quot;Value&quot;: &quot;TV&quot;,
     *           &quot;Operation&quot;: &quot;eq&quot;
     *         },
     *         {
     *           &quot;Field&quot;: &quot;Labels.LabelName&quot;,
     *           &quot;Value&quot;: &quot;Stereo&quot;,
     *           &quot;Operation&quot;: &quot;eq&quot;
     *         }
     *       ],
     *       &quot;Operation&quot;: &quot;or&quot;
     *     }
     *   ],
     *   &quot;Operation&quot;: &quot;and&quot;
     * }
     *         
     * </code></pre>
     * <ul>
     * <li>Exclude images that contain a face of a male over the age of 36:<blockquote>
     * <p> In this example query, an image will be excluded from the query results if it contains a face of a male over the age of 36. This query is different from excluding an image that contains a male face or a face of a person over the age of 36. In this query, you need to use the <code>nested</code> operator to specify that the conditions are met on the same element.
     * {
     *     &quot;Operation&quot;: &quot;not&quot;,
     *     &quot;SubQueries&quot;: [{
     *         &quot;Operation&quot;: &quot;nested&quot;,
     *         &quot;SubQueries&quot;: [{
     *             &quot;Operation&quot;: &quot;and&quot;,
     *             &quot;SubQueries&quot;: [{
     *                 &quot;Field&quot;: &quot;Figures.Age&quot;,
     *                 &quot;Operation&quot;: &quot;gt&quot;,
     *                 &quot;Value&quot;: &quot;36&quot;
     *             }, {
     *                 &quot;Field&quot;: &quot;Figures.Gender&quot;,
     *                 &quot;Operation&quot;: &quot;eq&quot;,
     *                 &quot;Value&quot;: &quot;male&quot;
     *             }]
     *         }]
     *     }]
     * }</p>
     * </blockquote>
     * </li>
     * <li>Query JPEG images that have both custom labels and system labels:<!---->
     * {
     *   &quot;SubQueries&quot;:[
     * {
     *   &quot;Field&quot;:&quot;ContentType&quot;,
     *   &quot;Value&quot;: &quot;image/jpeg&quot;,
     *   &quot;Operation&quot;:&quot;eq&quot;
     * },<br>{
     *   &quot;Field&quot;:&quot;CustomLabels.test&quot;,
     *   &quot;Operation&quot;:&quot;exist&quot;
     * },<br>{
     *   &quot;Field&quot;:&quot;Labels.LabelName&quot;,
     *   &quot;Operation&quot;:&quot;exist&quot;
     * }
     *   ],
     *   &quot;Operation&quot;:&quot;and&quot;
     * }
     * You can also perform aggregate operations to collect and analyze different data based on the specified conditions. For example, you can calculate the sum, count, average value, or maximum value of all files that meet the query conditions. You can also calculate the size distribution of images that meet the query conditions.</li>
     * </ul>
     * 
     * @param request the request parameters of SimpleQuery  SimpleQueryRequest
     * @return SimpleQueryResponse
     */
    @Override
    public CompletableFuture<SimpleQueryResponse> simpleQuery(SimpleQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SimpleQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SimpleQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SimpleQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can suspend a batch processing task that is in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/479914.html">ResumeBatch</a> operation to resume a batch processing task that is suspended.</p>
     * 
     * @param request the request parameters of SuspendBatch  SuspendBatchRequest
     * @return SuspendBatchResponse
     */
    @Override
    public CompletableFuture<SuspendBatchResponse> suspendBatch(SuspendBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The operation can be used to suspend a trigger only in the Running state. If you want to resume a suspended trigger, call the <a href="https://help.aliyun.com/document_detail/479919.html">ResumeTrigger</a> operation.</p>
     * 
     * @param request the request parameters of SuspendTrigger  SuspendTriggerRequest
     * @return SuspendTriggerResponse
     */
    @Override
    public CompletableFuture<SuspendTriggerResponse> suspendTrigger(SuspendTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendTrigger").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can update only a batch processing task that is in the Ready or Failed state. The update operation does not change the status of the batch processing task.</p>
     * <ul>
     * <li>If you update a batch processing task that is in progress, the task is not automatically resumed after the update is complete. You must call the <a href="https://help.aliyun.com/document_detail/479914.html">ResumeBatch</a> operation to resume the task.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateBatch  UpdateBatchRequest
     * @return UpdateBatchResponse
     */
    @Override
    public CompletableFuture<UpdateBatchResponse> updateBatch(UpdateBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDataset  UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    @Override
    public CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation to cluster all faces in the dataset.</li>
     * <li>The operation updates only the cover image, cluster name, and tags.</li>
     * <li>After the operation is successful, you can call the <a href="https://help.aliyun.com/document_detail/478182.html">GetFigureCluster</a> or <a href="https://help.aliyun.com/document_detail/2248450.html">BatchGetFigureCluster</a> operation to query the updated cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateFigureCluster  UpdateFigureClusterRequest
     * @return UpdateFigureClusterResponse
     */
    @Override
    public CompletableFuture<UpdateFigureClusterResponse> updateFigureCluster(UpdateFigureClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFigureCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFigureClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFigureClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>You cannot call this operation to update all metadata. You can update only metadata specified by CustomLabels, CustomId, and Figures. For more information, see the &quot;Request parameters&quot; section of this topic.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateFileMeta  UpdateFileMetaRequest
     * @return UpdateFileMetaResponse
     */
    @Override
    public CompletableFuture<UpdateFileMetaResponse> updateFileMeta(UpdateFileMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFileMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to create spatiotemporal clusters in the project.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLocationDateCluster  UpdateLocationDateClusterRequest
     * @return UpdateLocationDateClusterResponse
     */
    @Override
    public CompletableFuture<UpdateLocationDateClusterResponse> updateLocationDateCluster(UpdateLocationDateClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLocationDateCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLocationDateClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLocationDateClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that the project exists. For information about how to create a project, see &quot;CreateProject&quot;.</p>
     * <ul>
     * <li>When you call this operation, you need to specify only the parameters that you want to update. The parameters that you do not specify remain unchanged after you call this operation.</li>
     * <li>Wait for up to 5 minutes for the update to take effect.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    @Override
    public CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateStory  UpdateStoryRequest
     * @return UpdateStoryResponse
     */
    @Override
    public CompletableFuture<UpdateStoryResponse> updateStory(UpdateStoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateStory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateStoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateStoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can update only a trigger that is in the Ready or Failed state. The update operation does not change the trigger status.</p>
     * <ul>
     * <li>After you update a trigger, the uncompleted tasks under the original trigger are no longer executed. You can call the <a href="https://help.aliyun.com/document_detail/479916.html">ResumeTrigger</a> operation to resume the execution of the trigger.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTrigger  UpdateTriggerRequest
     * @return UpdateTriggerResponse
     */
    @Override
    public CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTrigger").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
