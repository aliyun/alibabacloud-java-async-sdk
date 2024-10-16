// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.mts20140618.models.*;
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
        this.product = "Mts";
        this.version = "2014-06-18";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "mts.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mts.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mts.aliyuncs.com"),
            new TeaPair("cn-fujian", "mts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "mts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mts.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mts.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "mts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mts.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "mts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mts.aliyuncs.com"),
            new TeaPair("me-east-1", "mts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mts.aliyuncs.com"),
            new TeaPair("us-east-1", "mts.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to activate a media workflow that has been deactivated. After you activate a media workflow, you cannot modify the workflow information, such as the name, topology, or trigger mode. A media workflow is activated by default after it is created.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ActivateMediaWorkflow  ActivateMediaWorkflowRequest
     * @return ActivateMediaWorkflowResponse
     */
    @Override
    public CompletableFuture<ActivateMediaWorkflowResponse> activateMediaWorkflow(ActivateMediaWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActivateMediaWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActivateMediaWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActivateMediaWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to process videos that are uploaded to Object Storage Service (OSS) but not processed. This way, you do not need to upload the videos to OSS again. If you have configured media workflows, OSS automatically notifies ApsaraVideo Media Processing (MPS) when a media file is uploaded to OSS. MPS automatically finds the corresponding workflow in the Active state based on the specified OSS bucket and object. Therefore, in most cases, you do not need to manually call the AddMedia operation to process the media file.</p>
     * <ul>
     * <li>Media information is automatically obtained only when the specified media workflow is in the Active state. If no media workflow is specified or the specified media workflow is not in the Active state, media information is not obtained.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of AddMedia  AddMediaRequest
     * @return AddMediaResponse
     */
    @Override
    public CompletableFuture<AddMediaResponse> addMedia(AddMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add only one tag. To add multiple tags at a time, you can call the <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a> operation.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of AddMediaTag  AddMediaTagRequest
     * @return AddMediaTagResponse
     */
    @Override
    public CompletableFuture<AddMediaTagResponse> addMediaTag(AddMediaTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddMediaTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMediaTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMediaTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to define the topology, activities, and dependencies of a media workflow. The topology is represented by a directed acyclic graph (DAG) in the console. For more information, see <a href="https://help.aliyun.com/document_detail/68494.html">Workflow activities</a>. You can view and run the workflows that are created by calling this operation in the ApsaraVideo Media Processing (MPS) console.</p>
     * <ul>
     * <li>MPS media workflows can be automatically triggered only by using the prefix of the file path. Automatic triggering by using the suffix is not supported. For more information about the trigger rules, see <a href="https://help.aliyun.com/document_detail/68574.html">Workflow triggering rules for files</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of AddMediaWorkflow  AddMediaWorkflowRequest
     * @return AddMediaWorkflowResponse
     */
    @Override
    public CompletableFuture<AddMediaWorkflowResponse> addMediaWorkflow(AddMediaWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddMediaWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMediaWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMediaWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddPipeline  AddPipelineRequest
     * @return AddPipelineResponse
     */
    @Override
    public CompletableFuture<AddPipelineResponse> addPipeline(AddPipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddPipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSmarttagTemplate  AddSmarttagTemplateRequest
     * @return AddSmarttagTemplateResponse
     */
    @Override
    public CompletableFuture<AddSmarttagTemplateResponse> addSmarttagTemplate(AddSmarttagTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSmarttagTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSmarttagTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSmarttagTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you need to set transcoding parameters such as those related to the container format, video stream, and audio stream. If you do not specify some parameters, streams that are generated by using the template do not contain the information specified by those parameters.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of AddTemplate  AddTemplateRequest
     * @return AddTemplateResponse
     */
    @Override
    public CompletableFuture<AddTemplateResponse> addTemplate(AddTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you create a watermark template by calling this operation, you can specify the watermark template and watermark asset when you <a href="https://help.aliyun.com/document_detail/29226.html">submit a transcoding job</a>. This allows you to add watermark information to the output video.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of AddWaterMarkTemplate  AddWaterMarkTemplateRequest
     * @return AddWaterMarkTemplateResponse
     */
    @Override
    public CompletableFuture<AddWaterMarkTemplateResponse> addWaterMarkTemplate(AddWaterMarkTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddWaterMarkTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddWaterMarkTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddWaterMarkTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to bind an input media bucket, you must create a media bucket. For more information, see <a href="https://help.aliyun.com/document_detail/42430.html">Add media buckets</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of BindInputBucket  BindInputBucketRequest
     * @return BindInputBucketResponse
     */
    @Override
    public CompletableFuture<BindInputBucketResponse> bindInputBucket(BindInputBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindInputBucket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindInputBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindInputBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to bind an output media bucket to the media library, you must create a media bucket. For more information, see <a href="https://help.aliyun.com/document_detail/42430.html">Add media buckets</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of BindOutputBucket  BindOutputBucketRequest
     * @return BindOutputBucketResponse
     */
    @Override
    public CompletableFuture<BindOutputBucketResponse> bindOutputBucket(BindOutputBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindOutputBucket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindOutputBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindOutputBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can cancel a transcoding job only if the job is in the Submitted state.</p>
     * <ul>
     * <li>We recommend that you call the <strong>UpdatePipeline</strong> operation to set the status of the ApsaraVideo Media Processing (MPS) queue to Paused before you cancel a job. This suspends job scheduling in the MPS queue. After the job is canceled, you must set the status of the MPS queue back to Active so that the other jobs in the MPS queue can be scheduled.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of CancelJob  CancelJobRequest
     * @return CancelJobResponse
     */
    @Override
    public CompletableFuture<CancelJobResponse> cancelJob(CancelJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomEntity  CreateCustomEntityRequest
     * @return CreateCustomEntityResponse
     */
    @Override
    public CompletableFuture<CreateCustomEntityResponse> createCustomEntity(CreateCustomEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomGroup  CreateCustomGroupRequest
     * @return CreateCustomGroupResponse
     */
    @Override
    public CompletableFuture<CreateCustomGroupResponse> createCustomGroup(CreateCustomGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to submit a job to create a video or text fingerprint library. You can use a text fingerprint library to store fingerprints for text.</p>
     * <ul>
     * <li>You can submit a job of creating a text fingerprint library only in the China (Shanghai) region.</li>
     * <li>By default, you can submit up to 10 jobs of creating a video fingerprint library to an ApsaraVideo Media Processing (MPS) queue at a time. If you submit more than 10 jobs at a time, the call may fail.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of CreateFpShotDB  CreateFpShotDBRequest
     * @return CreateFpShotDBResponse
     */
    @Override
    public CompletableFuture<CreateFpShotDBResponse> createFpShotDB(CreateFpShotDBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFpShotDB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFpShotDBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFpShotDBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The time when the media workflow was created.</p>
     * 
     * @param request the request parameters of DeactivateMediaWorkflow  DeactivateMediaWorkflowRequest
     * @return DeactivateMediaWorkflowResponse
     */
    @Override
    public CompletableFuture<DeactivateMediaWorkflowResponse> deactivateMediaWorkflow(DeactivateMediaWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeactivateMediaWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeactivateMediaWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeactivateMediaWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomEntity  DeleteCustomEntityRequest
     * @return DeleteCustomEntityResponse
     */
    @Override
    public CompletableFuture<DeleteCustomEntityResponse> deleteCustomEntity(DeleteCustomEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only in the China (Beijing), China (Shanghai), and China (Hangzhou) regions.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteCustomGroup  DeleteCustomGroupRequest
     * @return DeleteCustomGroupResponse
     */
    @Override
    public CompletableFuture<DeleteCustomGroupResponse> deleteCustomGroup(DeleteCustomGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomView  DeleteCustomViewRequest
     * @return DeleteCustomViewResponse
     */
    @Override
    public CompletableFuture<DeleteCustomViewResponse> deleteCustomView(DeleteCustomViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomView").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomViewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to logically delete a media file. The media file can no longer be processed, but the corresponding objects in the input and output Object Storage Service (OSS) buckets are retained.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteMedia  DeleteMediaRequest
     * @return DeleteMediaResponse
     */
    @Override
    public CompletableFuture<DeleteMediaResponse> deleteMedia(DeleteMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove only one tag at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteMediaTag  DeleteMediaTagRequest
     * @return DeleteMediaTagResponse
     */
    @Override
    public CompletableFuture<DeleteMediaTagResponse> deleteMediaTag(DeleteMediaTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMediaTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMediaTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMediaTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you delete or disable a workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteMediaWorkflow  DeleteMediaWorkflowRequest
     * @return DeleteMediaWorkflowResponse
     */
    @Override
    public CompletableFuture<DeleteMediaWorkflowResponse> deleteMediaWorkflow(DeleteMediaWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMediaWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMediaWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMediaWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only one MPS queue at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeletePipeline  DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    @Override
    public CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only one template at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteSmarttagTemplate  DeleteSmarttagTemplateRequest
     * @return DeleteSmarttagTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteSmarttagTemplateResponse> deleteSmarttagTemplate(DeleteSmarttagTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSmarttagTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSmarttagTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSmarttagTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A custom transcoding template cannot be deleted if it is being used by a job that has been submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A watermark template cannot be deleted if it is being used by a submitted job.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteWaterMarkTemplate  DeleteWaterMarkTemplateRequest
     * @return DeleteWaterMarkTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteWaterMarkTemplateResponse> deleteWaterMarkTemplate(DeleteWaterMarkTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWaterMarkTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWaterMarkTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWaterMarkTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The moderation results are synchronously returned after the moderation is complete.</p>
     * <ul>
     * <li>You can use the image and text moderation feature only in the China (Beijing), China (Shanghai), and Singapore regions.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ImAudit  ImAuditRequest
     * @return ImAuditResponse
     */
    @Override
    public CompletableFuture<ImAuditResponse> imAudit(ImAuditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImAudit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImAuditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImAuditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to import multiple text files to a text fingerprint library at a time. The system extracts fingerprints from the text files and saves the fingerprints to the text fingerprint library.</p>
     * <ul>
     * <li>You can call this operation only in the China (Shanghai) region.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ImportFpShotJob  ImportFpShotJobRequest
     * @return ImportFpShotJobResponse
     */
    @Override
    public CompletableFuture<ImportFpShotJobResponse> importFpShotJob(ImportFpShotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportFpShotJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportFpShotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportFpShotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A maximum of 100 media buckets can be returned.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListAllMediaBucket  ListAllMediaBucketRequest
     * @return ListAllMediaBucketResponse
     */
    @Override
    public CompletableFuture<ListAllMediaBucketResponse> listAllMediaBucket(ListAllMediaBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAllMediaBucket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAllMediaBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAllMediaBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomEntities  ListCustomEntitiesRequest
     * @return ListCustomEntitiesResponse
     */
    @Override
    public CompletableFuture<ListCustomEntitiesResponse> listCustomEntities(ListCustomEntitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomEntities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomEntitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomEntitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomGroups  ListCustomGroupsRequest
     * @return ListCustomGroupsResponse
     */
    @Override
    public CompletableFuture<ListCustomGroupsResponse> listCustomGroups(ListCustomGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can specify the ID of a figure or a figure library to query the corresponding information. If neither the figure ID nor figure library ID is specified, the operation returns the information about all figures and faces in all figure libraries within the current RAM user.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListCustomPersons  ListCustomPersonsRequest
     * @return ListCustomPersonsResponse
     */
    @Override
    public CompletableFuture<ListCustomPersonsResponse> listCustomPersons(ListCustomPersonsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomPersons").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomPersonsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomPersonsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomViews  ListCustomViewsRequest
     * @return ListCustomViewsResponse
     */
    @Override
    public CompletableFuture<ListCustomViewsResponse> listCustomViews(ListCustomViewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomViews").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomViewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomViewsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the status and information about the media fingerprint libraries based on the specified IDs.</p>
     * <ul>
     * <li>You can query text fingerprint libraries only in the China (Shanghai) region.</li>
     * <li>You can call this operation to query up to 10 media fingerprint libraries.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListFpShotDB  ListFpShotDBRequest
     * @return ListFpShotDBResponse
     */
    @Override
    public CompletableFuture<ListFpShotDBResponse> listFpShotDB(ListFpShotDBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFpShotDB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFpShotDBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFpShotDBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query media files in a specific media fingerprint library based on the library ID. This operation supports paged queries.</p>
     * <ul>
     * <li>You can call this operation only in the China (Beijing), China (Hangzhou), China (Shanghai), and Singapore regions.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListFpShotFiles  ListFpShotFilesRequest
     * @return ListFpShotFilesResponse
     */
    @Override
    public CompletableFuture<ListFpShotFilesResponse> listFpShotFiles(ListFpShotFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFpShotFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFpShotFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFpShotFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only in the China (Shanghai) region.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListFpShotImportJob  ListFpShotImportJobRequest
     * @return ListFpShotImportJobResponse
     */
    @Override
    public CompletableFuture<ListFpShotImportJobResponse> listFpShotImportJob(ListFpShotImportJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFpShotImportJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFpShotImportJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFpShotImportJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  By default, the returned transcoding jobs are sorted by CreationTime in descending order.</p>
     * <ul>
     * <li>You can call this operation to return transcoding jobs of the last 90 days. The jobs are returned based on the specified time range.</li>
     * <li>You can filter query results by configuring request parameters such as job status, creation time interval, and ApsaraVideo Media Processing (MPS) queue for transcoding.</li>
     * <li>By default, MPS does not allow you to access data across regions within the same account. Before you call this operation, make sure that the region that you specify is the same as the region of the transcoding jobs to be queried. Otherwise, this operation may fail to be called, or invalid information may be returned.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListJob  ListJobRequest
     * @return ListJobResponse
     */
    @Override
    public CompletableFuture<ListJobResponse> listJob(ListJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation returns execution instances only in the recent 90 days.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListMediaWorkflowExecutions  ListMediaWorkflowExecutionsRequest
     * @return ListMediaWorkflowExecutionsResponse
     */
    @Override
    public CompletableFuture<ListMediaWorkflowExecutionsResponse> listMediaWorkflowExecutions(ListMediaWorkflowExecutionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMediaWorkflowExecutions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMediaWorkflowExecutionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMediaWorkflowExecutionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The time when the job was created.</p>
     * 
     * @param request the request parameters of QueryAnalysisJobList  QueryAnalysisJobListRequest
     * @return QueryAnalysisJobListResponse
     */
    @Override
    public CompletableFuture<QueryAnalysisJobListResponse> queryAnalysisJobList(QueryAnalysisJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAnalysisJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAnalysisJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAnalysisJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCopyrightExtractJob  QueryCopyrightExtractJobRequest
     * @return QueryCopyrightExtractJobResponse
     */
    @Override
    public CompletableFuture<QueryCopyrightExtractJobResponse> queryCopyrightExtractJob(QueryCopyrightExtractJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCopyrightExtractJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCopyrightExtractJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCopyrightExtractJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCopyrightJob  QueryCopyrightJobRequest
     * @return QueryCopyrightJobResponse
     */
    @Override
    public CompletableFuture<QueryCopyrightJobResponse> queryCopyrightJob(QueryCopyrightJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCopyrightJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCopyrightJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCopyrightJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specified jobs of clearing or deleting a media fingerprint library based on the job IDs. If you do not specify job IDs, the system returns the latest 20 jobs that are submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryFpDBDeleteJobList  QueryFpDBDeleteJobListRequest
     * @return QueryFpDBDeleteJobListResponse
     */
    @Override
    public CompletableFuture<QueryFpDBDeleteJobListResponse> queryFpDBDeleteJobList(QueryFpDBDeleteJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFpDBDeleteJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFpDBDeleteJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFpDBDeleteJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specified jobs of deleting media files from a media fingerprint library based on the job IDs. If you do not specify job IDs, the system returns the latest 20 jobs that are submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryFpFileDeleteJobList  QueryFpFileDeleteJobListRequest
     * @return QueryFpFileDeleteJobListResponse
     */
    @Override
    public CompletableFuture<QueryFpFileDeleteJobListResponse> queryFpFileDeleteJobList(QueryFpFileDeleteJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFpFileDeleteJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFpFileDeleteJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFpFileDeleteJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  After a media fingerprint analysis job is submitted, the media fingerprinting service compares the fingerprints of the job input with those of the media files in the media fingerprint library. You can call this operation to query the job results.</p>
     * <ul>
     * <li>You can query the results of a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of QueryFpShotJobList  QueryFpShotJobListRequest
     * @return QueryFpShotJobListResponse
     */
    @Override
    public CompletableFuture<QueryFpShotJobListResponse> queryFpShotJobList(QueryFpShotJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFpShotJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFpShotJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFpShotJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIProductionJob  QueryIProductionJobRequest
     * @return QueryIProductionJobResponse
     */
    @Override
    public CompletableFuture<QueryIProductionJobResponse> queryIProductionJob(QueryIProductionJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryIProductionJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIProductionJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIProductionJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  By default, returned jobs are sorted in descending order by CreationTime.</p>
     * <ul>
     * <li>You can call this operation to query up to 10 transcoding jobs at a time.</li>
     * <li>If you do not set the JobIds parameter, the <code>InvalidParameter</code> error code is returned.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryJobList  QueryJobListRequest
     * @return QueryJobListResponse
     */
    @Override
    public CompletableFuture<QueryJobListResponse> queryJobList(QueryJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In the content moderation results, the moderation results of the video are sorted in ascending order by time into a timeline. If the video is long, the content moderation results are paginated, and the first page is returned. You can call this operation again to query the remaining moderation results of the video.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaCensorJobDetail  QueryMediaCensorJobDetailRequest
     * @return QueryMediaCensorJobDetailResponse
     */
    @Override
    public CompletableFuture<QueryMediaCensorJobDetailResponse> queryMediaCensorJobDetail(QueryMediaCensorJobDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMediaCensorJobDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMediaCensorJobDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMediaCensorJobDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the content moderation jobs within three months.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaCensorJobList  QueryMediaCensorJobListRequest
     * @return QueryMediaCensorJobListResponse
     */
    @Override
    public CompletableFuture<QueryMediaCensorJobListResponse> queryMediaCensorJobList(QueryMediaCensorJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMediaCensorJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMediaCensorJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMediaCensorJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  In asynchronous mode, the media information can be retrieved only after the Message Service (MNS) callback of <strong>submitting a media information job</strong> is returned. If you have not retrieved the media information for a long period, the job may have failed.</p>
     * <ul>
     * <li>You can call this operation to query up to 10 media information analysis jobs at a time.</li>
     * <li>By default, returned jobs are sorted in descending order by CreationTime.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaInfoJobList  QueryMediaInfoJobListRequest
     * @return QueryMediaInfoJobListResponse
     */
    @Override
    public CompletableFuture<QueryMediaInfoJobListResponse> queryMediaInfoJobList(QueryMediaInfoJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMediaInfoJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMediaInfoJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMediaInfoJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 media files at a time.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * @param request the request parameters of QueryMediaList  QueryMediaListRequest
     * @return QueryMediaListResponse
     */
    @Override
    public CompletableFuture<QueryMediaListResponse> queryMediaList(QueryMediaListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMediaList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMediaListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMediaListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query up to 10 media files at a time.</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/44458.html">AddMedia</a> operation to add media files.</li>
     * <li>You can call this operation to query only media files that are processed in a workflow. To obtain comprehensive information about a media file that is newly uploaded to OSS, you can call this operation after the corresponding workflow is complete. To query media files that are not processed in a workflow, you must call the <a href="https://help.aliyun.com/document_detail/29220.html">SubmitMediaInfoJob</a> operation to submit a media information analysis job. After the job is complete, you can query the information about the media files.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaListByURL  QueryMediaListByURLRequest
     * @return QueryMediaListByURLResponse
     */
    @Override
    public CompletableFuture<QueryMediaListByURLResponse> queryMediaListByURL(QueryMediaListByURLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMediaListByURL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMediaListByURLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMediaListByURLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query a maximum of 10 media workflow execution instances at a time.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the workflow pipeline is enabled. Otherwise, the workflow may not run as expected. For example, the following exceptions may occur: the workflow node is invalid and jobs created in the workflow cannot be executed.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaWorkflowExecutionList  QueryMediaWorkflowExecutionListRequest
     * @return QueryMediaWorkflowExecutionListResponse
     */
    @Override
    public CompletableFuture<QueryMediaWorkflowExecutionListResponse> queryMediaWorkflowExecutionList(QueryMediaWorkflowExecutionListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMediaWorkflowExecutionList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMediaWorkflowExecutionListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMediaWorkflowExecutionListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 media workflows at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaWorkflowList  QueryMediaWorkflowListRequest
     * @return QueryMediaWorkflowListResponse
     */
    @Override
    public CompletableFuture<QueryMediaWorkflowListResponse> queryMediaWorkflowList(QueryMediaWorkflowListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMediaWorkflowList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMediaWorkflowListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMediaWorkflowListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query up to 10 MPS queues at a time.</p>
     * <ul>
     * <li>If <code>&quot;Code&quot;: &quot;InvalidIdentity.ServiceDisabled&quot;,&quot;Message&quot;: &quot;The request identity was not allowed operated.&quot;,&quot;Recommend&quot;</code> is returned after you call this operation, check whether the RAM user that you use is assigned the AliyunMTSDefaultRole role to obtain the permissions on MPS and whether your Alibaba Cloud account has overdue payments.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryPipelineList  QueryPipelineListRequest
     * @return QueryPipelineListResponse
     */
    @Override
    public CompletableFuture<QueryPipelineListResponse> queryPipelineList(QueryPipelineListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPipelineList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPipelineListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPipelineListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySmarttagJob  QuerySmarttagJobRequest
     * @return QuerySmarttagJobResponse
     */
    @Override
    public CompletableFuture<QuerySmarttagJobResponse> querySmarttagJob(QuerySmarttagJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySmarttagJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySmarttagJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySmarttagJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to query the information about a smart tagging template, you must specify the template ID. Otherwise, the operation returns the information about all the templates that are created by the current RAM user.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QuerySmarttagTemplateList  QuerySmarttagTemplateListRequest
     * @return QuerySmarttagTemplateListResponse
     */
    @Override
    public CompletableFuture<QuerySmarttagTemplateListResponse> querySmarttagTemplateList(QuerySmarttagTemplateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySmarttagTemplateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySmarttagTemplateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySmarttagTemplateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The status of the snapshot jobs that you want to query.</p>
     * <ul>
     * <li><strong>Submitted</strong>: The job was submitted.</li>
     * <li><strong>Snapshoting</strong>: The job is being processed.</li>
     * <li><strong>Success</strong>: The job was successfully processed.</li>
     * <li><strong>Fail</strong>: The job failed.</li>
     * </ul>
     * 
     * @param request the request parameters of QuerySnapshotJobList  QuerySnapshotJobListRequest
     * @return QuerySnapshotJobListResponse
     */
    @Override
    public CompletableFuture<QuerySnapshotJobListResponse> querySnapshotJobList(QuerySnapshotJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySnapshotJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySnapshotJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySnapshotJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The IDs of the transcoding templates that you want to query. You can query up to 10 transcoding templates at a time. Separate multiple IDs of custom transcoding templates with commas (,).</p>
     * 
     * @param request the request parameters of QueryTemplateList  QueryTemplateListRequest
     * @return QueryTemplateListResponse
     */
    @Override
    public CompletableFuture<QueryTemplateListResponse> queryTemplateList(QueryTemplateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTemplateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTemplateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTemplateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTraceAbJob  QueryTraceAbJobRequest
     * @return QueryTraceAbJobResponse
     */
    @Override
    public CompletableFuture<QueryTraceAbJobResponse> queryTraceAbJob(QueryTraceAbJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTraceAbJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTraceAbJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTraceAbJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTraceExtractJob  QueryTraceExtractJobRequest
     * @return QueryTraceExtractJobResponse
     */
    @Override
    public CompletableFuture<QueryTraceExtractJobResponse> queryTraceExtractJob(QueryTraceExtractJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTraceExtractJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTraceExtractJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTraceExtractJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTraceM3u8Job  QueryTraceM3u8JobRequest
     * @return QueryTraceM3u8JobResponse
     */
    @Override
    public CompletableFuture<QueryTraceM3u8JobResponse> queryTraceM3u8Job(QueryTraceM3u8JobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTraceM3u8Job").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTraceM3u8JobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTraceM3u8JobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 watermark templates at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryWaterMarkTemplateList  QueryWaterMarkTemplateListRequest
     * @return QueryWaterMarkTemplateListResponse
     */
    @Override
    public CompletableFuture<QueryWaterMarkTemplateListResponse> queryWaterMarkTemplateList(QueryWaterMarkTemplateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryWaterMarkTemplateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryWaterMarkTemplateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryWaterMarkTemplateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to register only one custom face at a time.</p>
     * <ul>
     * <li>A maximum of 10 images can be registered for a custom face.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of RegisterCustomFace  RegisterCustomFaceRequest
     * @return RegisterCustomFaceResponse
     */
    @Override
    public CompletableFuture<RegisterCustomFaceResponse> registerCustomFace(RegisterCustomFaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterCustomFace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterCustomFaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterCustomFaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RegisterCustomView  RegisterCustomViewRequest
     * @return RegisterCustomViewResponse
     */
    @Override
    public CompletableFuture<RegisterCustomViewResponse> registerCustomView(RegisterCustomViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterCustomView").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterCustomViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterCustomViewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query media workflows in the specified state. If you do not specify the state, all media workflows are queried by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SearchMediaWorkflow  SearchMediaWorkflowRequest
     * @return SearchMediaWorkflowResponse
     */
    @Override
    public CompletableFuture<SearchMediaWorkflowResponse> searchMediaWorkflow(SearchMediaWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMediaWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMediaWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMediaWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query MPS queues in the specified state. If you do not specify the state, all MPS queues are queried by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SearchPipeline  SearchPipelineRequest
     * @return SearchPipelineResponse
     */
    @Override
    public CompletableFuture<SearchPipelineResponse> searchPipeline(SearchPipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchPipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchPipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchPipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SearchTemplate  SearchTemplateRequest
     * @return SearchTemplateResponse
     */
    @Override
    public CompletableFuture<SearchTemplateResponse> searchTemplate(SearchTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The total number of returned entries.</p>
     * 
     * @param request the request parameters of SearchWaterMarkTemplate  SearchWaterMarkTemplateRequest
     * @return SearchWaterMarkTemplateResponse
     */
    @Override
    public CompletableFuture<SearchWaterMarkTemplateResponse> searchWaterMarkTemplate(SearchWaterMarkTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchWaterMarkTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchWaterMarkTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchWaterMarkTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  After you call the SubmitAnalysisJob operation to submit a preset template analysis job, ApsaraVideo Media Processing (MPS) intelligently analyzes the input file of the job and recommends a suitable preset template. You can call the <a href="https://help.aliyun.com/document_detail/29224.html">QueryAnalysisJobList</a> operation to query the analysis result or enable asynchronous notifications to receive the analysis result.</p>
     * <ul>
     * <li>The analysis result is retained only for two weeks after it is generated. The analysis result is deleted after two weeks. If you use the recommended preset template in a transcoding job after two weeks, the job fails, and the <code>AnalysisResultNotFound</code> error code is returned.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitAnalysisJob  SubmitAnalysisJobRequest
     * @return SubmitAnalysisJobResponse
     */
    @Override
    public CompletableFuture<SubmitAnalysisJobResponse> submitAnalysisJob(SubmitAnalysisJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAnalysisJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAnalysisJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAnalysisJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitCopyrightExtractJob  SubmitCopyrightExtractJobRequest
     * @return SubmitCopyrightExtractJobResponse
     */
    @Override
    public CompletableFuture<SubmitCopyrightExtractJobResponse> submitCopyrightExtractJob(SubmitCopyrightExtractJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitCopyrightExtractJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitCopyrightExtractJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitCopyrightExtractJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitCopyrightJob  SubmitCopyrightJobRequest
     * @return SubmitCopyrightJobResponse
     */
    @Override
    public CompletableFuture<SubmitCopyrightJobResponse> submitCopyrightJob(SubmitCopyrightJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitCopyrightJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitCopyrightJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitCopyrightJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to clear or delete the specified media fingerprint library based on the library ID. If you clear a media fingerprint library, the content in the library is deleted, but the library is not deleted. If you delete a media fingerprint library, both the library and the content in the library are deleted. If you do not specify the operation type, the system clears the media fingerprint library by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitFpDBDeleteJob  SubmitFpDBDeleteJobRequest
     * @return SubmitFpDBDeleteJobResponse
     */
    @Override
    public CompletableFuture<SubmitFpDBDeleteJobResponse> submitFpDBDeleteJob(SubmitFpDBDeleteJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitFpDBDeleteJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitFpDBDeleteJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitFpDBDeleteJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <ul>
     * <li>You can call this operation to delete up to 200 media files from a media fingerprint library at a time.</li>
     * <li>This operation is available in the following regions: China (Beijing), China (Hangzhou), China (Shanghai), and Singapore.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SubmitFpFileDeleteJob  SubmitFpFileDeleteJobRequest
     * @return SubmitFpFileDeleteJobResponse
     */
    @Override
    public CompletableFuture<SubmitFpFileDeleteJobResponse> submitFpFileDeleteJob(SubmitFpFileDeleteJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitFpFileDeleteJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitFpFileDeleteJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitFpFileDeleteJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to submit a video, audio, image, or text fingerprint analysis job.</p>
     * <ul>
     * <li>This operation asynchronously submits a job. The query results may not have been generated when the response is returned. After the results are generated, an asynchronous message is returned.</li>
     * <li>You can submit a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * <li>The input file of the job must be in one of the following formats:<ul>
     * <li>Image formats: JPEG, PNG, and BMP.</li>
     * <li>Video formats: MP4, AVI, MKV, MPG, TS, MOV, FLV, MXF.</li>
     * <li>Video encoding formats: MPEG2, MPEG4, H264, HEVC, and WMV.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 150 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitFpShotJob  SubmitFpShotJobRequest
     * @return SubmitFpShotJobResponse
     */
    @Override
    public CompletableFuture<SubmitFpShotJobResponse> submitFpShotJob(SubmitFpShotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitFpShotJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitFpShotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitFpShotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Jobs that are submitted by calling this operation run in an asynchronous manner. After a job is added to the ApsaraVideo Media Processing (MPS) queue, the job is scheduled to run. You can call the <a href="https://help.aliyun.com/document_detail/170217.html">QueryIProductionJob</a> operation or configure a callback to query the job result.</p>
     * <ul>
     * <li>Capabilities provided by the intelligent production feature vary based on the region. Before you call this operation to submit an intelligent production job, check whether the job is supported in the region in which your service is activated. For more information, see <a href="https://help.aliyun.com/document_detail/43248.html">Regions and endpoints</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limit</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SubmitIProductionJob  SubmitIProductionJobRequest
     * @return SubmitIProductionJobResponse
     */
    @Override
    public CompletableFuture<SubmitIProductionJobResponse> submitIProductionJob(SubmitIProductionJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitIProductionJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitIProductionJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitIProductionJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitImageCopyright  SubmitImageCopyrightRequest
     * @return SubmitImageCopyrightResponse
     */
    @Override
    public CompletableFuture<SubmitImageCopyrightResponse> submitImageCopyright(SubmitImageCopyrightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitImageCopyright").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitImageCopyrightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitImageCopyrightResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  SubmitJobs is an asynchronous operation. After you submit transcoding jobs, the jobs are added to an MPS queue to be scheduled and run. The transcoding jobs may not have been complete when the response is returned. After you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/602836.html">QueryJobList</a> operation to query the job results. You can also associate a Message Service (MNS) queue or topic with the MPS queue to receive notifications on the jobs. For more information, see <a href="https://help.aliyun.com/document_detail/42618.html">Receive notifications</a>.</p>
     * <ul>
     * <li>An input file can be up to 100 GB in size. If the size of the input file exceeds this limit, the job may fail.</li>
     * <li>If you use an <strong>intelligent preset template</strong> to transcode an input file, you must first call the <a href="https://help.aliyun.com/document_detail/29223.html">SubmitAnalysisJob</a> operation to submit a preset template analysis job. After the analysis job is complete, you can call the <a href="https://help.aliyun.com/document_detail/29224.html">QueryAnalysisJobList</a>operation to obtain the available preset templates for the input file. When you submit a transcoding job, set TemplateId to the ID of an available preset template. If you specify a preset template that is not in the available preset templates, the transcoding job fails.</li>
     * <li>If you use a <strong>static preset template</strong> to transcode an input file, you do not need to submit a preset template analysis job.</li>
     * <li>If you want to use multiple accounts in MPS, you can create Resource Access Management (RAM) users by using your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/42841.html">Create a RAM user and grant permissions to the RAM user</a>. If the Alibaba Cloud account that is used to query transcoding jobs is not the one that is used to submit the transcoding jobs, no data is returned.</li>
     * <li>For information about transcoding FAQ, see <a href="https://help.aliyun.com/document_detail/38986.html">FAQ about MPS</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SubmitJobs  SubmitJobsRequest
     * @return SubmitJobsResponse
     */
    @Override
    public CompletableFuture<SubmitJobsResponse> submitJobs(SubmitJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The job that you submit by calling this operation is run in asynchronous mode. The job is added to an ApsaraVideo Media Processing (MPS) queue and then scheduled, queued, and run. You can call the <a href="https://help.aliyun.com/document_detail/91779.html">QueryMediaCensorJobDetail</a> operation or configure an asynchronous notification to obtain the job result.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitMediaCensorJob  SubmitMediaCensorJobRequest
     * @return SubmitMediaCensorJobResponse
     */
    @Override
    public CompletableFuture<SubmitMediaCensorJobResponse> submitMediaCensorJob(SubmitMediaCensorJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitMediaCensorJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitMediaCensorJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitMediaCensorJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you submit a media information analysis job, make sure that the input file is uploaded to an Object Storage Service (OSS) bucket. Otherwise, the job fails. You can configure upload callbacks to be notified of the upload status of files.****</p>
     * <ul>
     * <li>A media information analysis job can be run in synchronous or asynchronous mode.</li>
     * <li>In asynchronous mode, the media information analysis job is submitted to and scheduled in an ApsaraVideo Media Processing (MPS) queue. In this case, the media information analysis job may be queued. The media information analysis job may not be generated when the response to the SubmitMediaInfoJob operation is returned. After the execution is complete, you can call the <a href="https://help.aliyun.com/document_detail/602828.html">QueryMediaInfoJobList</a> operation to poll the execution results, or associate a Message Service (MNS) queue or topic with the MPS queue to receive the execution results. For more information, see <a href="https://www.alibabacloud.com/help/en/mps/receive-message-notifications/?spm=a2c63.p38356.0.0.b48576d2jxNSca">Receive message notifications</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of requests that you send to call this operation within one second reaches the request limit of this operation, new requests fail and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitMediaInfoJob  SubmitMediaInfoJobRequest
     * @return SubmitMediaInfoJobResponse
     */
    @Override
    public CompletableFuture<SubmitMediaInfoJobResponse> submitMediaInfoJob(SubmitMediaInfoJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitMediaInfoJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitMediaInfoJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitMediaInfoJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitSmarttagJob  SubmitSmarttagJobRequest
     * @return SubmitSmarttagJobResponse
     */
    @Override
    public CompletableFuture<SubmitSmarttagJobResponse> submitSmarttagJob(SubmitSmarttagJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitSmarttagJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSmarttagJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSmarttagJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Only JPG images can be generated by calling this operation.</p>
     * <ul>
     * <li>Asynchronous mode: This operation may return a response before snapshots are captured. Snapshot jobs are queued in the background and asynchronously processed by ApsaraVideo Media Processing (MPS). If the <strong>Interval</strong> or <strong>Num</strong> parameter is set, the snapshot job is processed in asynchronous mode. For more information about FAQ about capturing snapshots, see <a href="https://help.aliyun.com/document_detail/60805.html">FAQ about taking snapshots</a>.</li>
     * <li>Notifications: When you submit a snapshot job, the <strong>PipelineId</strong> parameter is required. An asynchronous message is sent only after the notification feature is enabled for the MPS queue.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitSnapshotJob  SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    @Override
    public CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitSnapshotJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSnapshotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSnapshotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitTraceAbJob  SubmitTraceAbJobRequest
     * @return SubmitTraceAbJobResponse
     */
    @Override
    public CompletableFuture<SubmitTraceAbJobResponse> submitTraceAbJob(SubmitTraceAbJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitTraceAbJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitTraceAbJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitTraceAbJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitTraceExtractJob  SubmitTraceExtractJobRequest
     * @return SubmitTraceExtractJobResponse
     */
    @Override
    public CompletableFuture<SubmitTraceExtractJobResponse> submitTraceExtractJob(SubmitTraceExtractJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitTraceExtractJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitTraceExtractJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitTraceExtractJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitTraceM3u8Job  SubmitTraceM3u8JobRequest
     * @return SubmitTraceM3u8JobResponse
     */
    @Override
    public CompletableFuture<SubmitTraceM3u8JobResponse> submitTraceM3u8Job(SubmitTraceM3u8JobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitTraceM3u8Job").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitTraceM3u8JobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitTraceM3u8JobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The response parameters.</p>
     * 
     * @param request the request parameters of TagCustomPerson  TagCustomPersonRequest
     * @return TagCustomPersonResponse
     */
    @Override
    public CompletableFuture<TagCustomPersonResponse> tagCustomPerson(TagCustomPersonRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagCustomPerson").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagCustomPersonResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagCustomPersonResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>You can call this operation to unbind an input media bucket from the media library based on the name of the output media bucket.</p>
     * <h1>QPS limits</h1>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UnbindInputBucket  UnbindInputBucketRequest
     * @return UnbindInputBucketResponse
     */
    @Override
    public CompletableFuture<UnbindInputBucketResponse> unbindInputBucket(UnbindInputBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindInputBucket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindInputBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindInputBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The name of the output media bucket to be unbound. To obtain the media bucket name, you can log on to the <strong>ApsaraVideo Media Processing (MPS)</strong> console and choose <strong>Workflows</strong> &gt; <strong>Media Buckets</strong> in the left-side navigation pane. Alternatively, you can log on to the <strong>Object Storage Service (OSS) console</strong> and click <strong>My OSS Paths</strong>.</p>
     * 
     * @param request the request parameters of UnbindOutputBucket  UnbindOutputBucketRequest
     * @return UnbindOutputBucketResponse
     */
    @Override
    public CompletableFuture<UnbindOutputBucketResponse> unbindOutputBucket(UnbindOutputBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindOutputBucket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindOutputBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindOutputBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a specific custom face, all the custom faces that are registered in a custom figure library, or a custom figure library.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UnregisterCustomFace  UnregisterCustomFaceRequest
     * @return UnregisterCustomFaceResponse
     */
    @Override
    public CompletableFuture<UnregisterCustomFaceResponse> unregisterCustomFace(UnregisterCustomFaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnregisterCustomFace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnregisterCustomFaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnregisterCustomFaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The basic information that you can update by calling this operation includes the title, description, and category of a media file. This operation applies to a full update. You must set all the parameters unless you want to replace the value of a specific parameter with a NULL value.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateMedia  UpdateMediaRequest
     * @return UpdateMediaResponse
     */
    @Override
    public CompletableFuture<UpdateMediaResponse> updateMedia(UpdateMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update only the category of a media file. For more information about how to update all the information about a media file, see <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateMediaCategory  UpdateMediaCategoryRequest
     * @return UpdateMediaCategoryResponse
     */
    @Override
    public CompletableFuture<UpdateMediaCategoryResponse> updateMediaCategory(UpdateMediaCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update only the thumbnail of a media file. For more information about how to update all the information about a media file, see <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a>.</p>
     * <h2>Limits on QPS</h2>
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateMediaCover  UpdateMediaCoverRequest
     * @return UpdateMediaCoverResponse
     */
    @Override
    public CompletableFuture<UpdateMediaCoverResponse> updateMediaCover(UpdateMediaCoverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaCover").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaCoverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaCoverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The published state indicates that the access control list (ACL) of media playback resources and snapshot files is set to inherit the ACL of the bucket to which they belong. The unpublished state indicates that the ACL of media playback resources and snapshot files is set to private.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateMediaPublishState  UpdateMediaPublishStateRequest
     * @return UpdateMediaPublishStateResponse
     */
    @Override
    public CompletableFuture<UpdateMediaPublishStateResponse> updateMediaPublishState(UpdateMediaPublishStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaPublishState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaPublishStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaPublishStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update the topology of a media workflow. To update the trigger mode of a media workflow, call the <a href="https://help.aliyun.com/document_detail/70372.html">UpdateMediaWorkflowTriggerMode</a> operation.</p>
     * <ul>
     * <li>After you delete or deactivate a media workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.
     * <warning>Deleting or deactivating a workflow will not affect tasks that have already been submitted. If a workflow is deleted or deactivated after a task has been submitted, tasks that are already in the processing queue will not be canceled and will be executed normally and charged the corresponding fees.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.&gt;</p>
     * 
     * @param request the request parameters of UpdateMediaWorkflow  UpdateMediaWorkflowRequest
     * @return UpdateMediaWorkflowResponse
     */
    @Override
    public CompletableFuture<UpdateMediaWorkflowResponse> updateMediaWorkflow(UpdateMediaWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only to modify the trigger mode of a media workflow. To modify other information about the workflow, call the <a href="https://help.aliyun.com/document_detail/44438.html">UpdateMediaWorkflow</a> operation.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateMediaWorkflowTriggerMode  UpdateMediaWorkflowTriggerModeRequest
     * @return UpdateMediaWorkflowTriggerModeResponse
     */
    @Override
    public CompletableFuture<UpdateMediaWorkflowTriggerModeResponse> updateMediaWorkflowTriggerMode(UpdateMediaWorkflowTriggerModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaWorkflowTriggerMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaWorkflowTriggerModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaWorkflowTriggerModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to modify the name, status, and notification settings of the specified MPS queue.</p>
     * <ul>
     * <li>If a paused MPS queue is selected in a workflow or a job, such as a video review or media fingerprint job, the workflow or job fails.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    @Override
    public CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSmarttagTemplate  UpdateSmarttagTemplateRequest
     * @return UpdateSmarttagTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateSmarttagTemplateResponse> updateSmarttagTemplate(UpdateSmarttagTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmarttagTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmarttagTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmarttagTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A custom transcoding template cannot be updated if it is being used by a job that has been submitted.The ID of the template. You can obtain the template ID from the response of the <a href="https://help.aliyun.com/document_detail/213306.html">AddTemplate</a> operation.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update the information about a watermark template based on the ID of the watermark template. For example, you can update the name and configurations of a watermark template.</p>
     * <ul>
     * <li>A watermark template cannot be updated if it is being used by a job that has been submitted.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateWaterMarkTemplate  UpdateWaterMarkTemplateRequest
     * @return UpdateWaterMarkTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateWaterMarkTemplateResponse> updateWaterMarkTemplate(UpdateWaterMarkTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWaterMarkTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWaterMarkTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWaterMarkTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
