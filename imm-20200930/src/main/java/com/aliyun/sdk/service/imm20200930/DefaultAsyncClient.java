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
     * <ul>
     * <li><strong>Before calling this operation, make sure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before calling this operation, make sure that you have indexed the files into a dataset by using the binding method (<a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>) or the active indexing method (<a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>).</li>
     * <li>The response is only an example. Depending on the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configuration</a>, the categories and content of the retrieved file metadata may differ from the example. If you have any questions, join the DingTalk group for feedback. For the DingTalk group ID, refer to <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</li>
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
     * <ul>
     * <li><strong>Before you use this API, review the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>For a list of supported data processing tasks, see <a href="https://help.aliyun.com/document_detail/466304.html">Define a workflow</a>.</li>
     * <li>The files to be indexed are subject to limits on their total number and size. For more information about dataset limits, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>. For information about how to create a dataset, see the parameter descriptions.</li>
     * <li>For information about the regions that support file indexing, see the dataset and index information in <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</li>
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
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>Before using this interface, please make sure you fully understand the billing method and <a href="https://help.aliyun.com/zh/imm/product-overview/billable-items?spm=openapi-amp.newDocPublishment.0.0.1ecd281fi27Zgk">pricing</a> of the Intelligent Media Management product.</li>
     * <li>Before calling this interface, ensure that you have indexed the files into the dataset (Dataset) through binding (<a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-createbinding?spm=a2c4g.11186623.0.0.a3d76f44xJrOnF">CreateBinding</a>) or active indexing (<a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-indexfilemeta?spm=a2c4g.11186623.help-menu-search-62354.d_0">IndexFileMeta</a> or <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-batchindexfilemeta?spm=a2c4g.11186623.help-menu-62354.d_5_2_4_2_1_1.f1d86f44iBs3QZ">BatchIndexFileMeta</a>).</li>
     * <li>The returned result is only an example. Depending on the <a href="https://help.aliyun.com/zh/imm/user-guide/workflow-templates-and-operators?spm=a2c4g.11186623.0.0.a3d775abr3hDFp">workflow template configuration</a>, the categories and content of the file metadata information obtained may differ from the example. If you have any questions, please join the DingTalk group by searching for the group number 21714099 in DingTalk.</li>
     * </ul>
     * <h3>Usage Restrictions</h3>
     * <ul>
     * <li>The maximum length of the historical conversation is 100, including both user and assistant messages.</li>
     * <li>Each message should not exceed 1000 Chinese characters.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>Make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/imm/product-overview/billable-items">pricing</a> of Intelligent Media Management before you call this operation.</li>
     * <li>Before you call this operation, make sure that you have indexed files into a dataset by using the binding method (<a href="https://www.alibabacloud.com/help/en/imm/developer-reference/api-imm-2020-09-30-createbinding">CreateBinding</a>) or the active indexing method (<a href="https://www.alibabacloud.com/help/en/imm/developer-reference/api-imm-2020-09-30-indexfilemeta">IndexFileMeta</a> or <a href="https://www.alibabacloud.com/help/en/imm/developer-reference/api-imm-2020-09-30-batchindexfilemeta">BatchIndexFileMeta</a>).</li>
     * <li>The returned results are for reference only. Based on different <a href="https://www.alibabacloud.com/help/en/imm/user-guide/workflow-templates-and-operators">workflow template configurations</a>, the categories and content of the obtained file metadata may differ from the examples. If you have any questions, search for the DingTalk group number 21714099 in DingTalk to join the group and provide feedback.</li>
     * </ul>
     * <h3>Limits</h3>
     * <ul>
     * <li>The maximum length of the conversation history is 100, including user messages and assistant messages.</li>
     * <li>The length of each message cannot exceed 1,000 Chinese characters.</li>
     * </ul>
     * 
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
     * <p>This API is in public preview. If you have any questions, join the DingTalk group to provide feedback. For the DingTalk group number, see <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Before using this API, make sure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management (IMM)</strong>.<blockquote>
     * <p>Notice: The completion time of asynchronous tasks is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li>File count limit: A compressed file can contain a maximum of 80,000 files.</li>
     * <li>File size limit: The maximum size is 200 GB for ZIP and RAR files, and 50 GB for 7z files.</li>
     * <li>This is an asynchronous API. Task information is saved for 7 days after a task starts and is then deleted. To view the task information, call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation with the returned <code>TaskId</code>. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information through notification messages.</li>
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
     * <p>If you want to process data using <a href="https://help.aliyun.com/document_detail/99372.html">Object Storage Service (OSS) data processing</a>, make sure you <a href="https://help.aliyun.com/document_detail/478206.html">bind an OSS bucket</a> before you create a batch processing task.</p>
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
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/2743997.html">billing</a> of Intelligent Media Management (IMM).\<em>\</em>\<em>\</em></p>
     * <blockquote>
     * <p>Asynchronous processing does not guarantee timely task completion.
     * Before you create a binding, make sure that the project and the dataset that you want to use exist.</p>
     * </blockquote>
     * <ul>
     * <li>For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>For information about how to create a dataset, see <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a>.<blockquote>
     * <p>The CreateBinding operation works by using the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template</a> that is specified when you created the project or dataset.
     * After you create a binding between a dataset and an OSS bucket, IMM scans the existing objects in the bucket and extracts metadata based on the scanning result. Then, IMM creates an index from the extracted metadata. If new objects are uploaded to the OSS bucket, IMM tracks and scans the objects and updates the index. For objects whose metadata index is created by calling this operation, you can call query operations, such as <a href="https://help.aliyun.com/document_detail/478175.html">SimpleQuery</a>, to query objects, manage objects, and collect statistics on objects.</p>
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
     * <p><strong>Before you use this operation, make sure that you are familiar with the billing of Intelligent Media Management (IMM). For more information, see <a href="https://help.aliyun.com/document_detail/477042.html">Billing</a>.</strong>
     * <notice>Asynchronous tasks do not guarantee timeliness.</notice></p>
     * <ul>
     * <li>File format limit: Only point cloud files in PCD format are supported.</li>
     * <li>This is an asynchronous operation. After the task starts, task information is retained for only 7 days. After 7 days, the task information can no longer be retrieved. Call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to obtain the returned <code>TaskId</code> and view the task information. You can also configure the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information through message notifications.</li>
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
     * <ul>
     * <li><strong>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management</strong>.</li>
     * <li>The dataset name must be unique within a project.</li>
     * <li>The number of datasets that you can create is limited. You can call the <a href="https://help.aliyun.com/document_detail/478155.html">GetProjcet</a> operation to query the limit.</li>
     * <li>After creating a dataset, you can call the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> operation to create file metadata indexes for diversified <a href="https://help.aliyun.com/document_detail/478175.html">data retrieval and statistics</a> and intelligent management.</li>
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
     * <ul>
     * <li>Before you use this API, make sure that you understand the billing methods and pricing of Intelligent Media Management (IMM).<blockquote>
     * <p>Notice: Asynchronous tasks are not guaranteed to be completed within a specific time frame.</p>
     * </blockquote>
     * </li>
     * <li>Make sure that a project is created in IMM. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</li>
     * <li>Make sure the service region and project are the same as those used to add the blind watermark using the <a href="https://help.aliyun.com/document_detail/2743655.html">EncodeBlindWatermark</a> operation. Otherwise, the watermark cannot be extracted.</li>
     * <li>The watermark can be extracted even after the image undergoes attacks such as compression, scaling, clipping, and color changes.</li>
     * <li>This API is compatible with the previous version of the blind watermarking feature. Some parameters are from the previous DecodeBlindWatermark API.</li>
     * <li>This is an asynchronous API. After a task starts, its information is saved for only 7 days. After this period, the information can no longer be retrieved. Call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> API to retrieve the TaskId and view task information. Alternatively, set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information through asynchronous notification messages.</li>
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
     * <ul>
     * <li><p><strong>Before you use this operation, review the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a></strong></p>
     * <blockquote>
     * <p>Notice: 
     * The execution time of asynchronous tasks is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li><p>For each input image, only the face with the largest bounding box is used for the face search.</p>
     * </li>
     * <li><p>This is an asynchronous operation. After a task starts, the task information is retained for 7 days and cannot be retrieved after this period. To retrieve task information, you can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation with the returned <code>TaskId</code>. Alternatively, you can configure the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive asynchronous notifications that contain task information.</p>
     * </li>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong><blockquote>
     * <p>Notice: The completion time of asynchronous tasks is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li>Before you call this operation, make sure that you have indexed files to a dataset (<a href="~~CreateDataset~~">CreateDataset</a>) by attaching them (<a href="~~CreateBinding~~">CreateBinding</a>) or by indexing them (<a href="~~IndexFileMeta~~">IndexFileMeta</a> or <a href="~~BatchIndexFileMeta~~">BatchIndexFileMeta</a>).</li>
     * <li>Each time you call this operation, files in the dataset (<a href="~~CreateDataset~~">CreateDataset</a>) are incrementally processed. You can periodically call this operation to process new files.</li>
     * <li>After the clustering is complete, you can call the <a href="~~GetFigureCluster~~">GetFigureCluster</a> or <a href="~~BatchGetFigureCluster~~">BatchGetFigureCluster</a> operation to retrieve information about specific groups. You can also call <a href="~~QueryFigureClusters~~">QueryFigureClusters</a> to query and list the groups in the dataset.</li>
     * <li>Deleting files from a dataset changes the face clustering results. When all images that contain the faces in a cluster are deleted, the cluster is also deleted.</li>
     * <li>This is an asynchronous operation. After a task starts, its information is saved for only 7 days. You cannot retrieve the task information after this period. You can call the <a href="~~GetTask~~">GetTask</a> or <a href="~~ListTasks~~">ListTasks</a> operation to view the task information. Alternatively, you can set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information from asynchronous notification messages.</li>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before you call this operation, make sure that you have clustered all faces in the dataset by calling the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation.</li>
     * <li>Merging unrelated groups affects the feature values of the destination group. This may cause inaccurate grouping of incremental data when you create a figure clustering task.</li>
     * <li>This operation is asynchronous. Task information is retained for only 7 days. During this period, you can query task information by calling the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation with the returned <code>TaskId</code>. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive asynchronous notification messages about the task.</li>
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
     * <p>This API is in public preview. If you have any questions, join our DingTalk group to provide feedback. For the group number, see <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.
     * This API currently supports packaging but not compression. The compression feature will be added later.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Before using this API, make sure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management (IMM)</strong>.<blockquote>
     * <p>Notice: The completion time of asynchronous tasks is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li>File count limit: You can package up to 80,000 files.</li>
     * <li>File size limit: The total size of all files before packaging must not exceed 200 GB.</li>
     * <li>This feature supports files of the Standard storage class on OSS. To package files of other storage classes, first <a href="https://help.aliyun.com/document_detail/90090.html">convert their storage class</a>.</li>
     * <li>This is an asynchronous API. After a task starts, its information is stored for 7 days. After 7 days, the information can no longer be retrieved. To view task information, call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation with the returned <code>TaskId</code>. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information through asynchronous notification messages.</li>
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
     * <p>This API is in public preview. If you have any questions, join our DingTalk group to provide feedback. For the group number, see <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Before you use this API, review the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> for Intelligent Media Management.</strong><blockquote>
     * <p>Notice: Timeliness is not guaranteed for asynchronous tasks.</p>
     * </blockquote>
     * </li>
     * <li>File count limit: A compressed package can contain a maximum of 80,000 files.</li>
     * <li>File size limit: 200 GB for Zip and RAR formats, and 50 GB for 7z format.</li>
     * <li>File decompression tasks use stream decompression, which outputs files as they are decompressed. If an operation is aborted due to file corruption, the files that have already been decompressed are not deleted.</li>
     * <li>This is an asynchronous API. Task information is stored for only 7 days and cannot be retrieved after this period. To view the task information, you can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation with the returned <code>TaskId</code>. Alternatively, you can set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information through an asynchronous notification message.</li>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and</strong> <a href="https://www.alibabacloud.com/help/en/imm/product-overview/billing-overview">pricing</a> <strong>of Intelligent Media Management (IMM). Fees are charged for highlight extraction and media processing.</strong></li>
     * <li>Before you call this operation, make sure that an available project exists in the current region. For more information, see <a href="https://www.alibabacloud.com/help/en/imm/developer-reference/api-imm-2020-09-30-createproject">Project management</a>.<blockquote>
     * <p>Notice: Asynchronous tasks do not guarantee timeliness.</notice></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateHighlightTask  CreateHighlightTaskRequest
     * @return CreateHighlightTaskResponse
     */
    @Override
    public CompletableFuture<CreateHighlightTaskResponse> createHighlightTask(CreateHighlightTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHighlightTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHighlightTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHighlightTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p><strong>Before you use this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></p>
     * <blockquote>
     * <p>Notice: 
     * The execution time of asynchronous tasks is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li><p>Image requirements:</p>
     * <ul>
     * <li>Image URLs support the HTTP and HTTPS protocols.</li>
     * <li>The following image formats are supported: PNG, JPG, JPEG, BMP, GIF, and WEBP.</li>
     * <li>The image size cannot exceed 20 MB for both synchronous and asynchronous invocations. The height or width cannot exceed 30,000 pixels, and the total number of pixels cannot exceed 250 million. For GIF images, the total number of pixels cannot exceed 4,194,304, and the height or width cannot exceed 30,000 pixels.</li>
     * <li>The image download timeout period is 3 seconds. If the download takes longer than 3 seconds, a timeout error is returned.</li>
     * <li>For best results, the image resolution should be at least 256 × 256 pixels. Low resolution may affect detection accuracy.</li>
     * <li>The response time for image detection depends on the image download time. Ensure the storage service where the image is stored is stable and reliable. Use Alibaba Cloud Object Storage Service (OSS) or CDN.</li>
     * </ul>
     * </li>
     * <li><p>This is an asynchronous operation. After a task starts, its information is saved for only 7 days. You cannot query the information after this period. To view task information, you can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation and use the returned <code>TaskId</code>. Alternatively, you can set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information through asynchronous notification messages.</p>
     * <blockquote>
     * <p>The detection results are returned in an asynchronous notification message. The Suggestion field in the message has one of the following values:</p>
     * <ul>
     * <li><p>pass: The image passed the review. No non-compliant content was detected.</p>
     * </li>
     * <li><p>block: The image failed the review. Non-compliant content was detected. The Categories field indicates the non-compliant category. For more information about the categories, see Content Moderation detection results.</p>
     * </li>
     * <li><p>review: The image requires manual review. After the manual review is complete, another asynchronous notification message is sent to inform you of the result.</p>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before you call this operation, ensure that an active project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>You can stitch a maximum of 10 images in this operation. The length of a single edge of each image cannot exceed 32,876 pixels. The total number of pixels cannot exceed 1 billion.</li>
     * <li>This is an asynchronous operation. After a task starts, its information is saved for 7 days. After this period, you can no longer query the task information. To query task information, call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation and use the returned <code>TaskId</code>. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive asynchronous notifications about the task.</li>
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
     * <ul>
     * <li><strong>Before using this API, make sure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before calling this API, make sure that an active project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>This API supports up to 100 input images.</li>
     * <li>This is an asynchronous API. After a task starts, its information is stored for only 7 days and cannot be retrieved after this period. To view task information, call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> API with the returned <code>TaskId</code>. You can also receive task information through asynchronous notification messages by setting the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter.</li>
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
     * <ul>
     * <li><strong>Before you use this operation, you must understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management (IMM)</strong>.<blockquote>
     * <p>Notice: Asynchronous tasks do not have a guaranteed processing time.</p>
     * </blockquote>
     * </li>
     * <li>Before you call this operation, you must index files into a dataset. You can index files by binding data sources using <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> or by indexing files using <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>.</li>
     * <li>Each call to this operation processes the files in the specified <code>Dataset</code> <strong>incrementally</strong>. You can call this operation periodically to process new files.</li>
     * <li>After clustering is complete, you can call the <a href="https://help.aliyun.com/document_detail/478189.html">QueryLocationDateClusters</a> operation to retrieve the clustering results.</li>
     * <li>Deleting a file from a dataset does not change the spatio-temporal clusters. To delete existing spatio-temporal clusters, you can call the <a href="https://help.aliyun.com/document_detail/478191.html">DeleteLocationDateCluster</a> operation.</li>
     * <li>This is an asynchronous operation. After a task starts, its information is saved for only 7 days. You cannot retrieve task information after 7 days. You can call the <a href="~~GetTask~~">GetTask</a> or <a href="~~ListTasks~~">ListTasks</a> operation to view task information using the returned <code>TaskId</code>. You can also configure the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information through message notifications.</li>
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
     * <ul>
     * <li><p><strong>Before you call this operation, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> for Intelligent Media Management.</strong></p>
     * </li>
     * <li><p>Before calling this operation, ensure a project is available in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project Management</a>.</p>
     * <blockquote>
     * <p>Notice: 
     * The completion time of an asynchronous task is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li><p>When you use this operation for media transcoding, it processes only one video, audio, or subtitle stream by default. You can also configure the number of streams to process.</p>
     * </li>
     * <li><p>When you use this operation for media concatenation, you can specify a maximum of 11 media files. Parameters for operations such as media transcoding and frame capture apply to the final concatenated output.</p>
     * </li>
     * <li><p>This operation is asynchronous. After a task starts, its information is retained for only 7 days. After this period, you cannot retrieve it. To view task information, call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation with the returned <code>TaskId</code>. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information via message notifications.</p>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management (IMM).</strong><blockquote>
     * <p>Notice: The execution time of asynchronous tasks is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li>Supported input file formats:<ul>
     * <li>Word processor documents (Word): doc, docx, wps, wpss, docm, dotm, dot, and dotx.</li>
     * <li>Presentation documents (PowerPoint): pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, and dpss.</li>
     * <li>Spreadsheet documents (Excel): xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, and ets.</li>
     * <li>PDF documents: pdf.</li>
     * </ul>
     * </li>
     * <li>Supported output file formats:<ul>
     * <li>Images: png and jpg.</li>
     * <li>Text: txt.</li>
     * <li>PDF: pdf.</li>
     * </ul>
     * </li>
     * <li>The maximum size of a single file is 200 MB. This limit cannot be changed.</li>
     * <li>If a file is large or its content is complex, the conversion may time out.</li>
     * <li>The number of requests per second is limited to 50 for a single user.</li>
     * <li>Task information is stored for only 7 days after a task starts. After this period, the information cannot be retrieved. You can promptly obtain task information using one of the following methods:<ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to obtain the returned <code>TaskId</code> and view the task information.</li>
     * <li>You can activate Message Service (MNS) in the same region as IMM and configure a subscription to promptly receive task information notifications. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>. For more information about the MNS software development kit (SDK), see <a href="https://help.aliyun.com/document_detail/32449.html">Receive and delete messages</a>.</li>
     * <li>You can activate RocketMQ in the same region as IMM, and create a RocketMQ 4.0 instance, a topic, and a group to promptly receive task information notifications. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>. For more information about how to use RocketMQ, see <a href="https://help.aliyun.com/document_detail/169009.html">Use an SDK for HTTP to send and receive normal messages</a>.</li>
     * <li>You can activate and connect to <a href="https://www.aliyun.com/product/aliware/eventbridge">EventBridge</a> in the same region as IMM to promptly receive task information notifications. For more information, see <a href="https://help.aliyun.com/document_detail/205730.html">Intelligent Media Management IMM events</a>.</li>
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
     * <p>The project name must be unique within a region.</p>
     * <ul>
     * <li>The number of projects you can create is limited. By default, you can create up to 100 projects. To increase the quota, submit a ticket or search for the DingTalk group number 88490020073 in DingTalk to join the group and apply for an increase.</li>
     * <li>After you create a project, you can continue to create other Intelligent Media Management (IMM) resources:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/479912.html">Create a trigger</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/606694.html">Create a batch task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/478202.html">Create a binding task</a></li>
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
     * <ul>
     * <li><strong>Before calling this operation, review the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management (IMM).</strong><blockquote>
     * <p>Notice: The execution time of asynchronous tasks is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li>Before calling this operation, index files to a dataset. You can index files by attaching a data source using <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>, or by actively indexing files using <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>.</li>
     * <li>Each call to this operation <strong>incrementally</strong> processes the files in the specified <code>Dataset</code>. You can call this operation periodically to process new files.</li>
     * <li>After clustering completes, call the <a href="https://help.aliyun.com/document_detail/611304.html">QuerySimilarImageClusters</a> operation to retrieve the clustering results.</li>
     * <li>Each similar image cluster must contain at least two images. Deleting a file from a dataset changes the similar image clusters. If deleting an image reduces a cluster to fewer than two images, the cluster is automatically deleted.</li>
     * <li>This operation is asynchronous. After a task starts, its information is retained for only seven days. You cannot query the information after this period. Call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation and use the returned <code>TaskId</code> to view task information. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive asynchronous notification messages about the task.</li>
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
     * <ul>
     * <li><strong>Before calling this operation, understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management (IMM).</strong></li>
     * <li>Before calling this operation, index files to a dataset by calling <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>, <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a>, or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>.</li>
     * <li>This is an asynchronous operation. After a task starts, its information is saved for only 7 days. The information cannot be retrieved after this period. Call <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> with the returned TaskId to view task information. Alternatively, set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to obtain task information from notification messages.</li>
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
     * <p>To process data from <a href="https://help.aliyun.com/document_detail/99372.html">Object Storage Service</a>, ensure that you have <a href="https://help.aliyun.com/document_detail/478206.html">attached an OSS bucket</a>.</p>
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
     * <ul>
     * <li><p><strong>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/2747104.html">pricing</a> of Intelligent Media Management.</strong></p>
     * </li>
     * <li><p>Before you call this operation, make sure that you have created a project in Intelligent Media Management. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <blockquote>
     * <p>Notice: 
     * The completion time of asynchronous tasks is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li><p>For more information about the features of this operation, see <a href="https://help.aliyun.com/document_detail/477189.html">Video label detection</a>.</p>
     * </li>
     * <li><p>This operation supports multiple video formats, such as MP4, MPEG-TS, MKV, MOV, AVI, FLV, and M3U8.</p>
     * </li>
     * <li><p>This is an asynchronous operation. After a task starts, its information is stored for seven days. You cannot retrieve the information after this period. Call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation with the returned <code>TaskId</code> to view task information. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information through message notifications.</p>
     * </li>
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
     * <ul>
     * <li><p><strong>Before you use this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of Intelligent Media Management.</strong></p>
     * <blockquote>
     * <p>Notice: 
     * The completion time of asynchronous tasks is not guaranteed.</p>
     * </blockquote>
     * </li>
     * <li><p>The detection results are returned in an asynchronous notification message. The Suggestion field in the asynchronous notification message can have the following values:</p>
     * <ul>
     * <li>pass: The video passed the review. No non-compliant content was detected.</li>
     * <li>block: The video must be blocked. This value is returned when non-compliant content is detected. The Categories field indicates the category of the non-compliant content. For more information about the categories, see <a href="https://help.aliyun.com/document_detail/2743995.html">Content Moderation detection results</a>.</li>
     * <li>review: The video requires manual review. After the manual review is complete, another asynchronous notification message is sent with the result.</li>
     * </ul>
     * </li>
     * <li><p>Video snapshot requirements:</p>
     * <ul>
     * <li>Video frame URLs support the HTTP and HTTPS protocols.</li>
     * <li>Supported video frame formats: PNG, JPG, JPEG, BMP, GIF, and WEBP.</li>
     * <li>The size of a video frame cannot exceed 10 MB.</li>
     * <li>The recommended resolution for video frames is at least 256 × 256 pixels. A lower resolution may affect detection accuracy.</li>
     * <li>The response time for the video detection operation depends on the download time of the video frames. Make sure that the storage service for your video frames is stable and reliable. We recommend that you use Alibaba Cloud Object Storage Service (OSS) or cache frames with Alibaba Cloud CDN.</li>
     * </ul>
     * </li>
     * <li><p>This is an asynchronous operation. After a task is created, the task information is saved for only 7 days. After this period, the information cannot be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query the task information using the returned <code>TaskId</code>. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to receive task information through asynchronous notification messages.</p>
     * </li>
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
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).\<em>\</em>\<em>\</em></li>
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
     * <ul>
     * <li>Before you delete a project, make sure that all resources in the project, such as datasets, bindings, batch processing tasks, and triggers, are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/478164.html">DeleteDataset</a>, <a href="https://help.aliyun.com/document_detail/479918.html">DeleteBatch</a>, and <a href="https://help.aliyun.com/document_detail/479915.html">DeleteTrigger</a>.</li>
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
     * <p>  For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</p>
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
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).\<em>\</em>\<em>\</em></li>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing of Intelligent Media Management (IMM) and its <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a>.</strong></li>
     * <li>Before you call this operation, make sure that a project is available in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
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
     * <li>A blind watermark can still be extracted even if attacks, such as compression, scaling, cropping, and color transformation, are performed on the image.</li>
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
     * <ul>
     * <li><strong>Before using this interface, please make sure you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of the Intelligent Media Management product.</strong></li>
     * <li>Before calling this interface, ensure that there is an available project (<a href="https://help.aliyun.com/document_detail/478273.html">Project</a>) in the current Region. For more details, see <a href="https://help.aliyun.com/document_detail/478152.html">Project Management</a>.</li>
     * <li>Supports common Word, Excel, PPT, PDF, and TXT documents.</li>
     * <li>The file size must not exceed 200 MB. The extracted plain text file size should not exceed 2 MB (approximately 600,000 Chinese characters).<blockquote>
     * <p>Notice: If the document format is complex or the text volume is too large, a timeout error may occur. In such scenarios, it is recommended to use the <a href="478228">CreateOfficeConversionTask</a> interface and specify the output format as txt to achieve similar functionality.</p>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before you call this operation, make sure that you have indexed files into a dataset by using bindings (<a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>) or active indexing (<a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>).</li>
     * <li>The returned results are for reference only. Depending on the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configuration</a>, the categories and content of the obtained file metadata may differ from the examples. If you have any questions, join the DingTalk group for feedback. For the DingTalk group ID, refer to <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</li>
     * <li>For the fields that participate in the search, refer to the <a href="https://help.aliyun.com/document_detail/2743991.html">list of supported fields and operators</a>.</li>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing of Intelligent Media Management and its <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a>.</strong></li>
     * <li>Before invoking this operation, make sure that an active project exists in the current region. For details, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>By default, this operation processes only one video, audio, or subtitle stream. You can configure the number of video, audio, and subtitle streams to process.
     * <notice>The Video, Audio, and Subtitle parameters under Targets cannot all be empty. An empty value indicates that the corresponding processing is disabled. For example, if Video is empty, video processing is disabled and the output TS files do not contain a video stream.</notice></li>
     * <li>This operation requires the source video to have a minimum duration of approximately 0.x seconds, which varies depending on the output frame rate.</li>
     * <li>This operation supports generating both Media Playlists and Master Playlists. Pay attention to the metric descriptions in this document.</li>
     * <li>This is a synchronous operation. Synchronous or asynchronous transcoding is triggered only during playback or pre-transcoding. You can set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> message notification parameter to obtain the transcoding task result through message notifications.</li>
     * <li>For more information about this feature, see <a href="https://help.aliyun.com/document_detail/477192.html">Just-in-time transcoding</a>.</li>
     * <li>The data processing capability of OSS also provides a playlist generation feature, but it only supports generating Media Playlists with simplified parameters. For details, see <a href="https://help.aliyun.com/document_detail/2709281.html">Generate a playlist</a> in OSS data processing.</li>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing of Intelligent Media Management. For more information, see <a href="https://help.aliyun.com/document_detail/477042.html">Pricing</a></strong>.</li>
     * <li>Do not perform cross-border access on OSS files. For example, if a file is stored in a bucket in the Singapore region, do not initiate preview, read, or download requests from the Chinese mainland. In such scenarios, the network link quality is significantly affected by the cross-border network environment, which may cause increased access latency, preview failures, download interruptions, or unstable connections. Network stability and access experience cannot be guaranteed. Make sure that the access point and the bucket are in the same region to avoid uncertainties caused by cross-border access.</li>
     * <li>The access credential expires in 30 minutes, and the refresh credential expires in 1 day.</li>
     * <li>The returned expiration time is in UTC, which is 8 hours behind UTC+8.</li>
     * <li>Supported input file formats:<ul>
     * <li>Word documents: doc, docx, txt, dot, wps, wpt, dotx, docm, dotm, and rtf.</li>
     * <li>Presentation documents (PPT): ppt, pptx, pptm, ppsx, ppsm, pps, potx, potm, dpt, and dps.</li>
     * <li>Excel documents: et, xls, xlt, xlsx, xlsm, xltx, xltm, and csv.</li>
     * <li>PDF documents: pdf.</li>
     * </ul>
     * </li>
     * <li>The maximum supported file size is 200 MB.</li>
     * <li>The maximum supported number of document pages is 5,000.</li>
     * <li>For projects created before December 1, 2023, billing is based on the number of document opens. Currently, billing is based on the number of API calls. To switch to the new billing mode, create a new project. Note that each API call can be used by only one user. If the call is reused, only the last user can access the document normally, and the access permissions of other users are revoked.</li>
     * <li>Activate Message Service (MNS) in the same region as Intelligent Media Management, create a topic and a queue, and configure a subscription. You can pass in the MNS topic name by using the NotifyTopicName parameter to receive message notifications about file saves. For more information about the MNS SDK, see <a href="https://help.aliyun.com/document_detail/32449.html">Receive and delete messages</a>.
     * For an example of the JSON format of the Message field in file save message notifications, see <a href="https://help.aliyun.com/document_detail/2743999.html">WebOffice message notification format</a>.<blockquote>
     * <p>To use the versioning feature, you must first enable versioning in OSS and then set the History parameter to true.
     * .</p>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></li>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>You can obtain real-time file statistics information when you query dataset information. This feature is enabled through parameter settings. For more details, see the request parameters section.</li>
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
     * <ul>
     * <li>Before you call this operation, make sure that you have created a project in Intelligent Media Management (IMM). For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</li>
     * <li>Before you call this operation, make sure that you have created a blind watermark extraction task for an image and obtained the <code>TaskId</code> of the task.</li>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before you call this operation, make sure that you have grouped all faces in the dataset (<a href="~~CreateDataset~~">CreateDataset</a>) by creating a face clustering task (<a href="~~CreateFigureClusteringTask~~">CreateFigureClusteringTask</a>).</li>
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
     * <ul>
     * <li><strong>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before calling this operation, make sure that you have indexed the files into a dataset by using the binding method (<a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>) or the active indexing method (<a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>).</li>
     * <li>The response is only an example. The categories and content of the retrieved file metadata may vary from the example based on the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configuration</a>. If you have any questions, join the DingTalk group for feedback. For the DingTalk group ID, refer to <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</li>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing of Intelligent Media Management (IMM) and its <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a>.</strong></li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a> operation to bind a project to an OSS bucket.</li>
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
     * <p>Querying project information supports obtaining real-time file statistics information, which is enabled through parameter settings. For details, see the request parameters section.</p>
     * <blockquote>
     * <p>Notice: File statistics are supported only for datasets created before December 20, 2025.</p>
     * </blockquote>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before you call this operation, make sure that you have indexed files into a dataset by using bindings (<a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>) or active indexing (<a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>).</li>
     * <li>Before you call this operation, make sure that you have generated album stories by calling the <a href="https://help.aliyun.com/document_detail/478193.html">Create a story</a> or <a href="https://help.aliyun.com/document_detail/478196.html">Create a custom story</a> operation.</li>
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
     * <p>*Before you use this operation, make sure that you are familiar with the billing of Intelligent Media Management and its <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a>.**.</p>
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
     * <ul>
     * <li>Before you call this operation, make sure that you have created a project (<a href="https://help.aliyun.com/document_detail/478273.html">Project</a>) in Intelligent Media Management. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>Before you call this operation, make sure that you have created a <a href="https://help.aliyun.com/document_detail/478223.html">video label detection task</a> and obtained the <code>TaskId</code> of the task.</li>
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
     * <ul>
     * <li><strong>Make sure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management before you use this API.</strong></li>
     * <li>For a list of supported data processing operations for indexing object metadata, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</li>
     * <li>The total number and size of files that can be indexed are limited. For more information, see the Dataset limits section in <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>. For information about how to create a dataset, see the parameter descriptions.</li>
     * <li>For a list of regions where you can index object metadata, see the \&quot;Features supported by region, Datasets and indexes\&quot; section in <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</li>
     * <li>After you index object metadata, you can retrieve data using <a href="https://help.aliyun.com/document_detail/478175.html">Simple query</a>. For information about other retrieval features, see <a href="https://help.aliyun.com/document_detail/2402363.html">Query and statistics</a>. You can also create face groups using <a href="https://help.aliyun.com/document_detail/478180.html">Create a face clustering task</a>. For information about other clustering features, see <a href="https://help.aliyun.com/document_detail/2402365.html">Intelligent management</a>.<blockquote>
     * <ul>
     * <li>This is an asynchronous operation. After you submit a request, the file is processed. The processing time can range from several seconds to several minutes or longer, depending on the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template and operators</a> and file content. After the processing is complete, the metadata is stored in the dataset. You can use the <a href="https://help.aliyun.com/document_detail/603317.html">message subscription</a> feature to receive a notification when the task is complete.</li>
     * </ul>
     * </blockquote>
     * </li>
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
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>Ensure that you have called <a href="%EF%BD%9E%EF%BD%9E478206%EF%BD%9E%EF%BD%9E">Bind Object Storage Bucket</a> to bind the OSS Bucket to the project.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAttachedOSSBuckets  ListAttachedOSSBucketsRequest
     * @return ListAttachedOSSBucketsResponse
     */
    @Override
    public CompletableFuture<ListAttachedOSSBucketsResponse> listAttachedOSSBuckets(ListAttachedOSSBucketsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAttachedOSSBuckets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAttachedOSSBucketsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAttachedOSSBucketsResponse> future = new CompletableFuture<>();
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
     * <p><em>Before you use this operation, make sure that you are familiar with the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management (IMM).</em>*</p>
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
     * <p>Supports paginated data retrieval. Paged query the first page, set MaxResults to limit the number of returned entries. The NextToken value in the response serves as the token for querying subsequent pages. Paged query subsequent pages, set the NextToken parameter to the NextToken value obtained from the previous response, and set MaxResults to limit the number of returned entries.</p>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before you call this operation, make sure that you have grouped all faces in the dataset (<a href="~~CreateDataset~~">CreateDataset</a>) by creating a face clustering task (<a href="~~CreateFigureClusteringTask~~">CreateFigureClusteringTask</a>).</li>
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
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to create spatiotemporal clusters in the project.</li>
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
     * <ul>
     * <li><strong>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before calling this operation, make sure that you have indexed files into a dataset by using bindings (<a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>) or active indexing (<a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>).</li>
     * <li>Before calling this operation, make sure that you have generated album stories by using the <a href="https://help.aliyun.com/document_detail/478193.html">Create a story</a> or <a href="https://help.aliyun.com/document_detail/478196.html">Create a custom story</a> operation.</li>
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
     * <p><em>Make sure that you are familiar with the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management (IMM) before you invoke this operation.</em>*</p>
     * <ul>
     * <li>For billing details, refer to <a href="https://help.aliyun.com/document_detail/2639703.html">WebOffice billing</a>.</li>
     * <li>The access token expires in 30 minutes. Open the preview before the access token expires. After the token expires, previewing is no longer available.</li>
     * <li>The refresh token expires in 1 day. Invoke the refresh operation before the refresh token expires. After the token expires, it becomes invalid.</li>
     * <li>The returned expiration time is in UTC, which is 8 hours behind UTC+8.<blockquote>
     * <p>The access token is used for actual preview session access. The refresh token simplifies the parameter settings required for refreshing tokens. You can use the refresh token to directly obtain a new token with the previously configured settings.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li><strong>Before calling this operation, ensure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong> Each request to this operation incurs one semantic understanding fee and one query fee.</li>
     * <li>Before calling this operation, ensure that you have indexed files into a dataset by binding (<a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>) or active indexing (<a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>).</li>
     * <li>The returned results are for reference only. Depending on the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configuration</a>, the categories and content of the retrieved file metadata may differ from the examples. If you have any questions, join the DingTalk group for feedback. For the DingTalk group ID, refer to <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</li>
     * </ul>
     * <h3>Limits</h3>
     * <ul>
     * <li>A maximum of 100 file records are returned for each query.</li>
     * <li>Paged queries are not supported.</li>
     * <li>Natural language understanding is not guaranteed to be completely accurate.</li>
     * <li>This feature is not supported in the US (Silicon Valley) and US (Virginia) regions.</li>
     * </ul>
     * <h3>Usage</h3>
     * <p>Use natural language keywords to search for files in a dataset. Currently, the supported key information includes labels (Labels.LabelName), time (ProduceTime), and locations (Address.AddressLine). For example, if you use <code>scenery in Hangzhou in 2023</code> as the query condition, it is intelligently split into the following three conditions to find files that meet all these conditions:</p>
     * <ul>
     * <li>ProduceTime: From 00:00:00 on January 1, 2023 to 23:59:59 on December 31, 2023.</li>
     * <li>Address.AddressLine: Contains the keyword <code>Hangzhou</code>.</li>
     * <li>Labels.LabelName: Contains the <code>scenery</code> label.
     * In combination with the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configuration</a>, when the template includes the <code>ImageEmbeddingExtraction</code> operator, the search request provides content-based image search. This means the <code>Query</code> content you enter is also understood as the content contained in the image, thereby implementing intelligent image retrieval.</li>
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
     * <ul>
     * <li><strong>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management.</strong></li>
     * <li>Before calling this operation, make sure that you have indexed files into a dataset by using bindings (<a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>) or active indexing (<a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>).</li>
     * <li>The returned results are only examples. Depending on the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configuration</a>, the categories and content of the obtained file metadata may differ from the examples. If you have any questions, join the DingTalk group for feedback. For the DingTalk group ID, refer to <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.
     * <strong>Limits</strong></li>
     * <li>Each query returns a maximum of 100 files.</li>
     * <li>Each query returns a maximum of 2,000 pieces of aggregation statistics information.</li>
     * <li>A maximum of 100 subquery conditions are supported.</li>
     * <li>A maximum nesting depth of 5 levels is supported for subqueries.
     * <strong>Query condition examples</strong></li>
     * <li>To search for JPEG images with a size greater than 1,000 pixels, specify the Query parameter as follows:</li>
     * </ul>
     * <pre><code>{
     *   &quot;SubQueries&quot;:[
     *     {
     *       &quot;Field&quot;:&quot;ContentType&quot;,
     *       &quot;Value&quot;: &quot;image/jpeg&quot;,
     *       &quot;Operation&quot;:&quot;eq&quot;
     *     },         
     *     {
     *       &quot;Field&quot;:&quot;ImageWidth&quot;,
     *       &quot;Value&quot;:&quot;1000&quot;,
     *       &quot;Operation&quot;:&quot;gt&quot;
     *     }
     *   ],
     *   &quot;Operation&quot;:&quot;and&quot;
     * }
     * </code></pre>
     * <ul>
     * <li>To search for all files in <code>oss://examplebucket/path/</code> that contain the <code>TV</code> or <code>Speaker</code> tag and are larger than 10 MB, specify the Query parameter as follows:<blockquote>
     * <p>Here, <code>TV</code> and <code>Speaker</code> are different tags of the same file and exist as two independent objects in the <code>Labels</code> field. Note the difference between this and the next example.</p>
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
     *           &quot;Value&quot;: &quot;Speaker&quot;,
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
     * <li>To exclude files that contain face information of a male older than 36 years, specify the Query parameter as follows:<blockquote>
     * <p>Unlike the previous example, this requires a single face to meet both conditions: older than 36 years and male. This is different from a requirement where an image contains multiple faces, one of which is male and another is older than 36 years. In this request, you must use a <code>nested</code> query to ensure that the conditions are met within the same element.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <pre><code>{
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
     * }
     * </code></pre>
     * <ul>
     * <li>To search for JPEG images that have both custom tags and system tags, specify the Query parameter as follows:</li>
     * </ul>
     * <pre><code>{
     *   &quot;SubQueries&quot;:[
     *     {
     *       &quot;Field&quot;:&quot;ContentType&quot;,
     *       &quot;Value&quot;: &quot;image/jpeg&quot;,
     *       &quot;Operation&quot;:&quot;eq&quot;
     *     },         
     *     {
     *       &quot;Field&quot;:&quot;CustomLabels.test&quot;,
     *       &quot;Operation&quot;:&quot;exist&quot;
     *     },         
     *     {
     *       &quot;Field&quot;:&quot;Labels.LabelName&quot;,
     *       &quot;Operation&quot;:&quot;exist&quot;
     *     }
     *   ],
     *   &quot;Operation&quot;:&quot;and&quot;
     * }
     * </code></pre>
     * <p>Based on the preceding search conditions, you can also use aggregation operations to collect statistics and analyze different data. For example, you can calculate the total size, count, average, or extreme values of all files that meet the search conditions, or collect statistics on the size distribution of all images that meet the search conditions.</p>
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
     * <ul>
     * <li>You can update a batch processing task only when its status is Ready or Failed. The update does not change the current status of the task.</li>
     * <li>After the update, an incomplete batch processing task does not automatically resume. To resume the task, call the <a href="https://help.aliyun.com/document_detail/479914.html">ResumeBatch</a> operation.</li>
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
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of Intelligent Media Management</strong>.</li>
     * <li>When you update a dataset, make sure that the dataset is created. For more information about how to create a dataset, see the request parameter description.</li>
     * <li>When you update a dataset, you only need to specify the fields that you want to update. Unspecified fields remain unchanged.</li>
     * <li>The dataset update does not take effect immediately. It takes up to 5 minutes for the update to take effect.</li>
     * </ul>
     * 
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
     * <ul>
     * <li>When updating project information, ensure that the project has been successfully created. For more information about creating a project, refer to the request parameter descriptions.</li>
     * <li>When updating project information, you only need to specify the fields that you want to update. Unspecified fields remain unchanged.</li>
     * <li>Project updates do not take effect immediately. It may take up to 5 minutes for the updates to take effect.</li>
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
