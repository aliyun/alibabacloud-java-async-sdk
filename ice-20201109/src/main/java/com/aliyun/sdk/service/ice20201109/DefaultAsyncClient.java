// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ice20201109.models.*;
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
        this.product = "ICE";
        this.version = "2020-11-09";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "ice.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ice.aliyuncs.com"),
            new TeaPair("ap-south-1", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ice.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ice.aliyuncs.com"),
            new TeaPair("cn-fujian", "ice.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ice.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ice.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ice.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ice.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ice.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ice.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ice.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ice.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "ice.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ice.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ice.aliyuncs.com"),
            new TeaPair("eu-central-1", "ice.aliyuncs.com"),
            new TeaPair("eu-west-1", "ice.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ice.aliyuncs.com"),
            new TeaPair("me-east-1", "ice.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ice.aliyuncs.com"),
            new TeaPair("us-east-1", "ice.aliyuncs.com"),
            new TeaPair("us-west-1", "ice.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>You can create at most three levels of categories. Each category level can contain a maximum of 100 subcategories.</p>
     * 
     * @param request the request parameters of AddCategory  AddCategoryRequest
     * @return AddCategoryResponse
     */
    @Override
    public CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddEditingProjectMaterials  AddEditingProjectMaterialsRequest
     * @return AddEditingProjectMaterialsResponse
     */
    @Override
    public CompletableFuture<AddEditingProjectMaterialsResponse> addEditingProjectMaterials(AddEditingProjectMaterialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddEditingProjectMaterials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEditingProjectMaterialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEditingProjectMaterialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddFavoritePublicMedia  AddFavoritePublicMediaRequest
     * @return AddFavoritePublicMediaResponse
     */
    @Override
    public CompletableFuture<AddFavoritePublicMediaResponse> addFavoritePublicMedia(AddFavoritePublicMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFavoritePublicMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFavoritePublicMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFavoritePublicMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddMediaMarks  AddMediaMarksRequest
     * @return AddMediaMarksResponse
     */
    @Override
    public CompletableFuture<AddMediaMarksResponse> addMediaMarks(AddMediaMarksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddMediaMarks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMediaMarksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMediaMarksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use a regular template</a>.</p>
     * <ul>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
     * <li>After an advanced template is created, it enters the Processing state. In this case, the template is unavailable. The template can be used only when it is in the Available state. The time required for template processing varies based on the size of the template file. Generally, it ranges from 10 seconds to 5 minutes.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTemplate  AddTemplateRequest
     * @return AddTemplateResponse
     */
    @Override
    public CompletableFuture<AddTemplateResponse> addTemplate(AddTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AlterSearchIndex  AlterSearchIndexRequest
     * @return AlterSearchIndexResponse
     */
    @Override
    public CompletableFuture<AlterSearchIndexResponse> alterSearchIndex(AlterSearchIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AlterSearchIndex").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AlterSearchIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AlterSearchIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetMediaInfos  BatchGetMediaInfosRequest
     * @return BatchGetMediaInfosResponse
     */
    @Override
    public CompletableFuture<BatchGetMediaInfosResponse> batchGetMediaInfos(BatchGetMediaInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetMediaInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetMediaInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetMediaInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can cancel a media fingerprint analysis job only if the job is in the Queuing state.</p>
     * <ul>
     * <li>We recommend that you call the <strong>UpdatePipeline</strong> operation to set the status of the ApsaraVideo Media Processing (MPS) queue to Paused before you cancel a job. This suspends job scheduling in the MPS queue. After the job is canceled, you must set the status of the MPS queue back to Active so that the other jobs in the MPS queue can be scheduled.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDNAJob  CancelDNAJobRequest
     * @return CancelDNAJobResponse
     */
    @Override
    public CompletableFuture<CancelDNAJobResponse> cancelDNAJob(CancelDNAJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelDNAJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelDNAJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelDNAJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelFavoritePublicMedia  CancelFavoritePublicMediaRequest
     * @return CancelFavoritePublicMediaResponse
     */
    @Override
    public CompletableFuture<CancelFavoritePublicMediaResponse> cancelFavoritePublicMedia(CancelFavoritePublicMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelFavoritePublicMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelFavoritePublicMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelFavoritePublicMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAudit  CreateAuditRequest
     * @return CreateAuditResponse
     */
    @Override
    public CompletableFuture<CreateAuditResponse> createAudit(CreateAuditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAudit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAuditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAuditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAvatarTrainingJob  CreateAvatarTrainingJobRequest
     * @return CreateAvatarTrainingJobResponse
     */
    @Override
    public CompletableFuture<CreateAvatarTrainingJobResponse> createAvatarTrainingJob(CreateAvatarTrainingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAvatarTrainingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAvatarTrainingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAvatarTrainingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomTemplate  CreateCustomTemplateRequest
     * @return CreateCustomTemplateResponse
     */
    @Override
    public CompletableFuture<CreateCustomTemplateResponse> createCustomTemplate(CreateCustomTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomizedVoiceJob  CreateCustomizedVoiceJobRequest
     * @return CreateCustomizedVoiceJobResponse
     */
    @Override
    public CompletableFuture<CreateCustomizedVoiceJobResponse> createCustomizedVoiceJob(CreateCustomizedVoiceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomizedVoiceJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomizedVoiceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomizedVoiceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can create up to five media fingerprint libraries within an account. To increase the quota, submit a ticket. You can call the DeleteDNADB operation to delete the fingerprint libraries that you no longer need.</p>
     * 
     * @param request the request parameters of CreateDNADB  CreateDNADBRequest
     * @return CreateDNADBResponse
     */
    @Override
    public CompletableFuture<CreateDNADBResponse> createDNADB(CreateDNADBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDNADB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDNADBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDNADBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEditingProject  CreateEditingProjectRequest
     * @return CreateEditingProjectResponse
     */
    @Override
    public CompletableFuture<CreateEditingProjectResponse> createEditingProject(CreateEditingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEditingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEditingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEditingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must specify a recording template for live stream recording. You can configure information such as the format and duration of a recording in a recording template. The recording format can be M3U8, MP4, or FLV.</p>
     * 
     * @param request the request parameters of CreateLiveRecordTemplate  CreateLiveRecordTemplateRequest
     * @return CreateLiveRecordTemplateResponse
     */
    @Override
    public CompletableFuture<CreateLiveRecordTemplateResponse> createLiveRecordTemplate(CreateLiveRecordTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveRecordTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveRecordTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveRecordTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLiveSnapshotTemplate  CreateLiveSnapshotTemplateRequest
     * @return CreateLiveSnapshotTemplateResponse
     */
    @Override
    public CompletableFuture<CreateLiveSnapshotTemplateResponse> createLiveSnapshotTemplate(CreateLiveSnapshotTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveSnapshotTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveSnapshotTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveSnapshotTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLiveTranscodeTemplate  CreateLiveTranscodeTemplateRequest
     * @return CreateLiveTranscodeTemplateResponse
     */
    @Override
    public CompletableFuture<CreateLiveTranscodeTemplateResponse> createLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveTranscodeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveTranscodeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveTranscodeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePipeline  CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    @Override
    public CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The large visual model feature is still in the public preview phase. You can use this feature for free for 1,000 hours of videos.</p>
     * 
     * @param request the request parameters of CreateSearchIndex  CreateSearchIndexRequest
     * @return CreateSearchIndexResponse
     */
    @Override
    public CompletableFuture<CreateSearchIndexResponse> createSearchIndex(CreateSearchIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSearchIndex").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSearchIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSearchIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSearchLib  CreateSearchLibRequest
     * @return CreateSearchLibResponse
     */
    @Override
    public CompletableFuture<CreateSearchLibResponse> createSearchLib(CreateSearchLibRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSearchLib").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSearchLibResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSearchLibResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to obtain the upload URLs and credentials of audio and video files. You can also call this operation to obtain the upload URLs and credentials of images and auxiliary media assets.</p>
     * <ul>
     * <li>Obtaining an upload URL and credential is essential for Intelligent Media Services (IMS) and is required in each upload operation.</li>
     * <li>If the video upload credential expires, you can call the RefreshUploadMedia operation to obtain a new upload credential. The default validity period of a video upload credential is 3,000 seconds.</li>
     * <li>After you upload a media asset, you can configure a callback to receive upload event notifications or call the GetMediaInfo operation to determine whether the media asset is uploaded based on the returned status.</li>
     * <li>The MediaId parameter returned by this operation can be used for media asset lifecycle management or media processing.</li>
     * <li>You can call this operation to upload media assets only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media asset to your own OSS bucket, you can upload the file to your OSS bucket by using <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a>, and then call the <a href="https://help.aliyun.com/document_detail/441152.html">RegisterMediaInfo</a> operation to register the file in the OSS bucket with the media asset library.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadMedia  CreateUploadMediaRequest
     * @return CreateUploadMediaResponse
     */
    @Override
    public CompletableFuture<CreateUploadMediaResponse> createUploadMedia(CreateUploadMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUploadMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUploadMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUploadMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to upload only a local media stream. After the media stream is uploaded, it is associated with the specified media asset ID.</p>
     * <ul>
     * <li>You can call this operation to upload media streams only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media stream to your own OSS bucket, you can upload the file to your OSS bucket by using <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a>, and then call the <a href="https://help.aliyun.com/document_detail/440765.html">RegisterMediaStream</a> operation to associate the media stream with the specified media asset ID.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadStream  CreateUploadStreamRequest
     * @return CreateUploadStreamResponse
     */
    @Override
    public CompletableFuture<CreateUploadStreamResponse> createUploadStream(CreateUploadStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUploadStream").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUploadStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUploadStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DecryptKMSDataKey  DecryptKMSDataKeyRequest
     * @return DecryptKMSDataKeyResponse
     */
    @Override
    public CompletableFuture<DecryptKMSDataKeyResponse> decryptKMSDataKey(DecryptKMSDataKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DecryptKMSDataKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DecryptKMSDataKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DecryptKMSDataKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAvatarTrainingJob  DeleteAvatarTrainingJobRequest
     * @return DeleteAvatarTrainingJobResponse
     */
    @Override
    public CompletableFuture<DeleteAvatarTrainingJobResponse> deleteAvatarTrainingJob(DeleteAvatarTrainingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAvatarTrainingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAvatarTrainingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAvatarTrainingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation also deletes the subcategories, including the level-2 and level-3 categories, of the category.</p>
     * 
     * @param request the request parameters of DeleteCategory  DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    @Override
    public CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomTemplate  DeleteCustomTemplateRequest
     * @return DeleteCustomTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteCustomTemplateResponse> deleteCustomTemplate(DeleteCustomTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomizedVoiceJob  DeleteCustomizedVoiceJobRequest
     * @return DeleteCustomizedVoiceJobResponse
     */
    @Override
    public CompletableFuture<DeleteCustomizedVoiceJobResponse> deleteCustomizedVoiceJob(DeleteCustomizedVoiceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomizedVoiceJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomizedVoiceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomizedVoiceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDNADB  DeleteDNADBRequest
     * @return DeleteDNADBResponse
     */
    @Override
    public CompletableFuture<DeleteDNADBResponse> deleteDNADB(DeleteDNADBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDNADB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDNADBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDNADBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDNAFiles  DeleteDNAFilesRequest
     * @return DeleteDNAFilesResponse
     */
    @Override
    public CompletableFuture<DeleteDNAFilesResponse> deleteDNAFiles(DeleteDNAFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDNAFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDNAFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDNAFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEditingProjectMaterials  DeleteEditingProjectMaterialsRequest
     * @return DeleteEditingProjectMaterialsResponse
     */
    @Override
    public CompletableFuture<DeleteEditingProjectMaterialsResponse> deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEditingProjectMaterials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEditingProjectMaterialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEditingProjectMaterialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEditingProjects  DeleteEditingProjectsRequest
     * @return DeleteEditingProjectsResponse
     */
    @Override
    public CompletableFuture<DeleteEditingProjectsResponse> deleteEditingProjects(DeleteEditingProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEditingProjects").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEditingProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEditingProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLiveRecordFiles  DeleteLiveRecordFilesRequest
     * @return DeleteLiveRecordFilesResponse
     */
    @Override
    public CompletableFuture<DeleteLiveRecordFilesResponse> deleteLiveRecordFiles(DeleteLiveRecordFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveRecordFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveRecordFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveRecordFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLiveRecordTemplate  DeleteLiveRecordTemplateRequest
     * @return DeleteLiveRecordTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteLiveRecordTemplateResponse> deleteLiveRecordTemplate(DeleteLiveRecordTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveRecordTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveRecordTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveRecordTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLiveSnapshotFiles  DeleteLiveSnapshotFilesRequest
     * @return DeleteLiveSnapshotFilesResponse
     */
    @Override
    public CompletableFuture<DeleteLiveSnapshotFilesResponse> deleteLiveSnapshotFiles(DeleteLiveSnapshotFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveSnapshotFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveSnapshotFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveSnapshotFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLiveSnapshotTemplate  DeleteLiveSnapshotTemplateRequest
     * @return DeleteLiveSnapshotTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteLiveSnapshotTemplateResponse> deleteLiveSnapshotTemplate(DeleteLiveSnapshotTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveSnapshotTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveSnapshotTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveSnapshotTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLiveTranscodeJob  DeleteLiveTranscodeJobRequest
     * @return DeleteLiveTranscodeJobResponse
     */
    @Override
    public CompletableFuture<DeleteLiveTranscodeJobResponse> deleteLiveTranscodeJob(DeleteLiveTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLiveTranscodeTemplate  DeleteLiveTranscodeTemplateRequest
     * @return DeleteLiveTranscodeTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteLiveTranscodeTemplateResponse> deleteLiveTranscodeTemplate(DeleteLiveTranscodeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveTranscodeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveTranscodeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveTranscodeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMediaFromSearchLib  DeleteMediaFromSearchLibRequest
     * @return DeleteMediaFromSearchLibResponse
     */
    @Override
    public CompletableFuture<DeleteMediaFromSearchLibResponse> deleteMediaFromSearchLib(DeleteMediaFromSearchLibRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMediaFromSearchLib").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMediaFromSearchLibResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMediaFromSearchLibResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMediaInfos  DeleteMediaInfosRequest
     * @return DeleteMediaInfosResponse
     */
    @Override
    public CompletableFuture<DeleteMediaInfosResponse> deleteMediaInfos(DeleteMediaInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMediaInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMediaInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMediaInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMediaMarks  DeleteMediaMarksRequest
     * @return DeleteMediaMarksResponse
     */
    @Override
    public CompletableFuture<DeleteMediaMarksResponse> deleteMediaMarks(DeleteMediaMarksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMediaMarks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMediaMarksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMediaMarksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * <p>You can call this operation to delete multiple media streams at a time.</p>
     * 
     * @param request the request parameters of DeletePlayInfo  DeletePlayInfoRequest
     * @return DeletePlayInfoResponse
     */
    @Override
    public CompletableFuture<DeletePlayInfoResponse> deletePlayInfo(DeletePlayInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePlayInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePlayInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePlayInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSmartJob  DeleteSmartJobRequest
     * @return DeleteSmartJobResponse
     */
    @Override
    public CompletableFuture<DeleteSmartJobResponse> deleteSmartJob(DeleteSmartJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSmartJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSmartJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSmartJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A template is an encapsulation of the timeline of a media editing and production job. You can define a common timeline as a template. When you have the same requirements, you need to only specify key parameters and materials to produce videos.</p>
     * <ul>
     * <li>For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/270942.html">Create and use a regular template</a>.</li>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/291418.html">Create and use advanced templates</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTemplate").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAIAgentInstance  DescribeAIAgentInstanceRequest
     * @return DescribeAIAgentInstanceResponse
     */
    @Override
    public CompletableFuture<DescribeAIAgentInstanceResponse> describeAIAgentInstance(DescribeAIAgentInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAIAgentInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAIAgentInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAIAgentInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMeterImsEditUsage  DescribeMeterImsEditUsageRequest
     * @return DescribeMeterImsEditUsageResponse
     */
    @Override
    public CompletableFuture<DescribeMeterImsEditUsageResponse> describeMeterImsEditUsage(DescribeMeterImsEditUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMeterImsEditUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMeterImsEditUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMeterImsEditUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMeterImsMediaConvertUHDUsage  DescribeMeterImsMediaConvertUHDUsageRequest
     * @return DescribeMeterImsMediaConvertUHDUsageResponse
     */
    @Override
    public CompletableFuture<DescribeMeterImsMediaConvertUHDUsageResponse> describeMeterImsMediaConvertUHDUsage(DescribeMeterImsMediaConvertUHDUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMeterImsMediaConvertUHDUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMeterImsMediaConvertUHDUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMeterImsMediaConvertUHDUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMeterImsMediaConvertUsage  DescribeMeterImsMediaConvertUsageRequest
     * @return DescribeMeterImsMediaConvertUsageResponse
     */
    @Override
    public CompletableFuture<DescribeMeterImsMediaConvertUsageResponse> describeMeterImsMediaConvertUsage(DescribeMeterImsMediaConvertUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMeterImsMediaConvertUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMeterImsMediaConvertUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMeterImsMediaConvertUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMeterImsMpsAiUsage  DescribeMeterImsMpsAiUsageRequest
     * @return DescribeMeterImsMpsAiUsageResponse
     */
    @Override
    public CompletableFuture<DescribeMeterImsMpsAiUsageResponse> describeMeterImsMpsAiUsage(DescribeMeterImsMpsAiUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMeterImsMpsAiUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMeterImsMpsAiUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMeterImsMpsAiUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMeterImsSummary  DescribeMeterImsSummaryRequest
     * @return DescribeMeterImsSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeMeterImsSummaryResponse> describeMeterImsSummary(DescribeMeterImsSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMeterImsSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMeterImsSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMeterImsSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNotifyConfig  DescribeNotifyConfigRequest
     * @return DescribeNotifyConfigResponse
     */
    @Override
    public CompletableFuture<DescribeNotifyConfigResponse> describeNotifyConfig(DescribeNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePlayList  DescribePlayListRequest
     * @return DescribePlayListResponse
     */
    @Override
    public CompletableFuture<DescribePlayListResponse> describePlayList(DescribePlayListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRtcRobotInstance  DescribeRtcRobotInstanceRequest
     * @return DescribeRtcRobotInstanceResponse
     */
    @Override
    public CompletableFuture<DescribeRtcRobotInstanceResponse> describeRtcRobotInstance(DescribeRtcRobotInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRtcRobotInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRtcRobotInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRtcRobotInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetectAudioForCustomizedVoiceJob  DetectAudioForCustomizedVoiceJobRequest
     * @return DetectAudioForCustomizedVoiceJobResponse
     */
    @Override
    public CompletableFuture<DetectAudioForCustomizedVoiceJobResponse> detectAudioForCustomizedVoiceJob(DetectAudioForCustomizedVoiceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectAudioForCustomizedVoiceJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectAudioForCustomizedVoiceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectAudioForCustomizedVoiceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DropSearchIndex  DropSearchIndexRequest
     * @return DropSearchIndexResponse
     */
    @Override
    public CompletableFuture<DropSearchIndexResponse> dropSearchIndex(DropSearchIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DropSearchIndex").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DropSearchIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DropSearchIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DropSearchLib  DropSearchLibRequest
     * @return DropSearchLibResponse
     */
    @Override
    public CompletableFuture<DropSearchLibResponse> dropSearchLib(DropSearchLibRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DropSearchLib").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DropSearchLibResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DropSearchLibResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateAIAgentCall  GenerateAIAgentCallRequest
     * @return GenerateAIAgentCallResponse
     */
    @Override
    public CompletableFuture<GenerateAIAgentCallResponse> generateAIAgentCall(GenerateAIAgentCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateAIAgentCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateAIAgentCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateAIAgentCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateKMSDataKey  GenerateKMSDataKeyRequest
     * @return GenerateKMSDataKeyResponse
     */
    @Override
    public CompletableFuture<GenerateKMSDataKeyResponse> generateKMSDataKey(GenerateKMSDataKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateKMSDataKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateKMSDataKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateKMSDataKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAvatar  GetAvatarRequest
     * @return GetAvatarResponse
     */
    @Override
    public CompletableFuture<GetAvatarResponse> getAvatar(GetAvatarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAvatar").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAvatarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAvatarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAvatarTrainingJob  GetAvatarTrainingJobRequest
     * @return GetAvatarTrainingJobResponse
     */
    @Override
    public CompletableFuture<GetAvatarTrainingJobResponse> getAvatarTrainingJob(GetAvatarTrainingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAvatarTrainingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAvatarTrainingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAvatarTrainingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBatchMediaProducingJob  GetBatchMediaProducingJobRequest
     * @return GetBatchMediaProducingJobResponse
     */
    @Override
    public CompletableFuture<GetBatchMediaProducingJobResponse> getBatchMediaProducingJob(GetBatchMediaProducingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBatchMediaProducingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBatchMediaProducingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBatchMediaProducingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a category and its subcategories based on the category ID and category type.</p>
     * 
     * @param request the request parameters of GetCategories  GetCategoriesRequest
     * @return GetCategoriesResponse
     */
    @Override
    public CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCategories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCategoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCategoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetContentAnalyzeConfig  GetContentAnalyzeConfigRequest
     * @return GetContentAnalyzeConfigResponse
     */
    @Override
    public CompletableFuture<GetContentAnalyzeConfigResponse> getContentAnalyzeConfig(GetContentAnalyzeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContentAnalyzeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContentAnalyzeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContentAnalyzeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a template with the ID specified by the TemplateId parameter. You can also query the information about the default template. If TemplateId is specified, other parameters are ignored and the template whose ID is specified is queried. If TemplateId is not specified, the default template is queried based on other parameters. In this case, Type is required.
     * Template types:</p>
     * <ol>
     * <li>1: transcoding template.</li>
     * <li>2: snapshot template.</li>
     * <li>3: animated image template.</li>
     * <li>4\. image watermark template.</li>
     * <li>5: text watermark template.</li>
     * <li>6: subtitle template.</li>
     * <li>7: AI-assisted content moderation template.</li>
     * <li>8: AI-assisted intelligent thumbnail template.</li>
     * <li>9: AI-assisted intelligent erasure template.
     * Subtypes of transcoding templates:</li>
     * <li>1 (Normal): regular template.</li>
     * <li>2 (AudioTranscode): audio transcoding template.</li>
     * <li>3 (Remux): container format conversion template.</li>
     * <li>4 (NarrowBandV1): Narrowband HD 1.0 template.</li>
     * <li>5 (NarrowBandV2): Narrowband HD 2.0 template.
     * Subtypes of snapshot templates:</li>
     * <li>1 (Normal): regular template.</li>
     * <li>2 (Sprite): sprite template.</li>
     * <li>3 (WebVtt): WebVTT template.
     * Subtypes of AI-assisted content moderation templates:</li>
     * <li>1 (Video): video moderation template.</li>
     * <li>2 (Audio): audio moderation template.</li>
     * <li>3 (Image): image moderation template.
     * Subtypes of AI-assisted intelligent erasure templates:</li>
     * <li>1 (VideoDelogo): logo erasure template.</li>
     * <li>2 (VideoDetext): subtitle erasure template.</li>
     * </ol>
     * 
     * @param request the request parameters of GetCustomTemplate  GetCustomTemplateRequest
     * @return GetCustomTemplateResponse
     */
    @Override
    public CompletableFuture<GetCustomTemplateResponse> getCustomTemplate(GetCustomTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomizedVoice  GetCustomizedVoiceRequest
     * @return GetCustomizedVoiceResponse
     */
    @Override
    public CompletableFuture<GetCustomizedVoiceResponse> getCustomizedVoice(GetCustomizedVoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomizedVoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomizedVoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomizedVoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomizedVoiceJob  GetCustomizedVoiceJobRequest
     * @return GetCustomizedVoiceJobResponse
     */
    @Override
    public CompletableFuture<GetCustomizedVoiceJobResponse> getCustomizedVoiceJob(GetCustomizedVoiceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomizedVoiceJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomizedVoiceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomizedVoiceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDefaultStorageLocation  GetDefaultStorageLocationRequest
     * @return GetDefaultStorageLocationResponse
     */
    @Override
    public CompletableFuture<GetDefaultStorageLocationResponse> getDefaultStorageLocation(GetDefaultStorageLocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDefaultStorageLocation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDefaultStorageLocationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDefaultStorageLocationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDemonstrationForCustomizedVoiceJob  GetDemonstrationForCustomizedVoiceJobRequest
     * @return GetDemonstrationForCustomizedVoiceJobResponse
     */
    @Override
    public CompletableFuture<GetDemonstrationForCustomizedVoiceJobResponse> getDemonstrationForCustomizedVoiceJob(GetDemonstrationForCustomizedVoiceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDemonstrationForCustomizedVoiceJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDemonstrationForCustomizedVoiceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDemonstrationForCustomizedVoiceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDynamicImageJob  GetDynamicImageJobRequest
     * @return GetDynamicImageJobResponse
     */
    @Override
    public CompletableFuture<GetDynamicImageJobResponse> getDynamicImageJob(GetDynamicImageJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDynamicImageJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDynamicImageJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDynamicImageJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEditingProject  GetEditingProjectRequest
     * @return GetEditingProjectResponse
     */
    @Override
    public CompletableFuture<GetEditingProjectResponse> getEditingProject(GetEditingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEditingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEditingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEditingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEditingProjectMaterials  GetEditingProjectMaterialsRequest
     * @return GetEditingProjectMaterialsResponse
     */
    @Override
    public CompletableFuture<GetEditingProjectMaterialsResponse> getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEditingProjectMaterials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEditingProjectMaterialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEditingProjectMaterialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEventCallback  GetEventCallbackRequest
     * @return GetEventCallbackResponse
     */
    @Override
    public CompletableFuture<GetEventCallbackResponse> getEventCallback(GetEventCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEventCallback").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEventCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEventCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLiveEditingIndexFile  GetLiveEditingIndexFileRequest
     * @return GetLiveEditingIndexFileResponse
     */
    @Override
    public CompletableFuture<GetLiveEditingIndexFileResponse> getLiveEditingIndexFile(GetLiveEditingIndexFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLiveEditingIndexFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLiveEditingIndexFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLiveEditingIndexFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLiveEditingJob  GetLiveEditingJobRequest
     * @return GetLiveEditingJobResponse
     */
    @Override
    public CompletableFuture<GetLiveEditingJobResponse> getLiveEditingJob(GetLiveEditingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLiveEditingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLiveEditingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLiveEditingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLiveRecordJob  GetLiveRecordJobRequest
     * @return GetLiveRecordJobResponse
     */
    @Override
    public CompletableFuture<GetLiveRecordJobResponse> getLiveRecordJob(GetLiveRecordJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLiveRecordJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLiveRecordJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLiveRecordJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLiveRecordTemplate  GetLiveRecordTemplateRequest
     * @return GetLiveRecordTemplateResponse
     */
    @Override
    public CompletableFuture<GetLiveRecordTemplateResponse> getLiveRecordTemplate(GetLiveRecordTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLiveRecordTemplate").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLiveRecordTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLiveRecordTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLiveSnapshotJob  GetLiveSnapshotJobRequest
     * @return GetLiveSnapshotJobResponse
     */
    @Override
    public CompletableFuture<GetLiveSnapshotJobResponse> getLiveSnapshotJob(GetLiveSnapshotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLiveSnapshotJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLiveSnapshotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLiveSnapshotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLiveSnapshotTemplate  GetLiveSnapshotTemplateRequest
     * @return GetLiveSnapshotTemplateResponse
     */
    @Override
    public CompletableFuture<GetLiveSnapshotTemplateResponse> getLiveSnapshotTemplate(GetLiveSnapshotTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLiveSnapshotTemplate").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLiveSnapshotTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLiveSnapshotTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLiveTranscodeJob  GetLiveTranscodeJobRequest
     * @return GetLiveTranscodeJobResponse
     */
    @Override
    public CompletableFuture<GetLiveTranscodeJobResponse> getLiveTranscodeJob(GetLiveTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLiveTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLiveTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLiveTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLiveTranscodeTemplate  GetLiveTranscodeTemplateRequest
     * @return GetLiveTranscodeTemplateResponse
     */
    @Override
    public CompletableFuture<GetLiveTranscodeTemplateResponse> getLiveTranscodeTemplate(GetLiveTranscodeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLiveTranscodeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLiveTranscodeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLiveTranscodeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the MediaId parameter is specified, the MediaId parameter is preferentially used for the query. If the MediaId parameter is left empty, the InputURL parameter must be specified.</p>
     * 
     * @param request the request parameters of GetMediaInfo  GetMediaInfoRequest
     * @return GetMediaInfoResponse
     */
    @Override
    public CompletableFuture<GetMediaInfoResponse> getMediaInfo(GetMediaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMediaInfoJob  GetMediaInfoJobRequest
     * @return GetMediaInfoJobResponse
     */
    @Override
    public CompletableFuture<GetMediaInfoJobResponse> getMediaInfoJob(GetMediaInfoJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaInfoJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaInfoJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaInfoJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMediaMarks  GetMediaMarksRequest
     * @return GetMediaMarksResponse
     */
    @Override
    public CompletableFuture<GetMediaMarksResponse> getMediaMarks(GetMediaMarksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaMarks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaMarksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaMarksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMediaProducingJob  GetMediaProducingJobRequest
     * @return GetMediaProducingJobResponse
     */
    @Override
    public CompletableFuture<GetMediaProducingJobResponse> getMediaProducingJob(GetMediaProducingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaProducingJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaProducingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaProducingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPackageJob  GetPackageJobRequest
     * @return GetPackageJobResponse
     */
    @Override
    public CompletableFuture<GetPackageJobResponse> getPackageJob(GetPackageJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPackageJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPackageJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPackageJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    @Override
    public CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You use the ID of a video or audio file to query the playback URL of the file. Then, you can use the playback URL to play the audio or video in ApsaraVideo Player SDK (for URL-based playback) or a third-party player.</p>
     * 
     * @param request the request parameters of GetPlayInfo  GetPlayInfoRequest
     * @return GetPlayInfoResponse
     */
    @Override
    public CompletableFuture<GetPlayInfoResponse> getPlayInfo(GetPlayInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPlayInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPlayInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPlayInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPublicMediaInfo  GetPublicMediaInfoRequest
     * @return GetPublicMediaInfoResponse
     */
    @Override
    public CompletableFuture<GetPublicMediaInfoResponse> getPublicMediaInfo(GetPublicMediaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPublicMediaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPublicMediaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPublicMediaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSmartHandleJob  GetSmartHandleJobRequest
     * @return GetSmartHandleJobResponse
     */
    @Override
    public CompletableFuture<GetSmartHandleJobResponse> getSmartHandleJob(GetSmartHandleJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSmartHandleJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSmartHandleJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSmartHandleJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSnapshotJob  GetSnapshotJobRequest
     * @return GetSnapshotJobResponse
     */
    @Override
    public CompletableFuture<GetSnapshotJobResponse> getSnapshotJob(GetSnapshotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSnapshotJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSnapshotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSnapshotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSnapshotUrls  GetSnapshotUrlsRequest
     * @return GetSnapshotUrlsResponse
     */
    @Override
    public CompletableFuture<GetSnapshotUrlsResponse> getSnapshotUrls(GetSnapshotUrlsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSnapshotUrls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSnapshotUrlsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSnapshotUrlsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStorageList  GetStorageListRequest
     * @return GetStorageListResponse
     */
    @Override
    public CompletableFuture<GetStorageListResponse> getStorageList(GetStorageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStorageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStorageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStorageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSystemTemplate  GetSystemTemplateRequest
     * @return GetSystemTemplateResponse
     */
    @Override
    public CompletableFuture<GetSystemTemplateResponse> getSystemTemplate(GetSystemTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSystemTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSystemTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSystemTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A template is an encapsulation of the timeline of a media editing and production job. You can define a common timeline as a template. When you have the same requirements, you need to only specify key parameters and materials to produce videos.</p>
     * <ul>
     * <li>For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use a regular template</a>.</li>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    @Override
    public CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTemplateMaterials  GetTemplateMaterialsRequest
     * @return GetTemplateMaterialsResponse
     */
    @Override
    public CompletableFuture<GetTemplateMaterialsResponse> getTemplateMaterials(GetTemplateMaterialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplateMaterials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateMaterialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateMaterialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTemplateParams  GetTemplateParamsRequest
     * @return GetTemplateParamsResponse
     */
    @Override
    public CompletableFuture<GetTemplateParamsResponse> getTemplateParams(GetTemplateParamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplateParams").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateParamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateParamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTranscodeJob  GetTranscodeJobRequest
     * @return GetTranscodeJobResponse
     */
    @Override
    public CompletableFuture<GetTranscodeJobResponse> getTranscodeJob(GetTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information, including the upload status, user data, creation time, and completion time, about URL-based upload jobs based on the returned job IDs or the URLs used during the upload.
     * If an upload job fails, you can view the error code and error message. If an upload job is successful, you can obtain the video ID.</p>
     * 
     * @param request the request parameters of GetUrlUploadInfos  GetUrlUploadInfosRequest
     * @return GetUrlUploadInfosResponse
     */
    @Override
    public CompletableFuture<GetUrlUploadInfosResponse> getUrlUploadInfos(GetUrlUploadInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUrlUploadInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUrlUploadInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUrlUploadInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about up to the first 5,000 audio and video files based on the filter condition, such as the status or category ID of the file. We recommend that you set the StartTime and EndTime parameters to narrow down the time range and perform multiple queries to obtain data.</p>
     * 
     * @param request the request parameters of GetVideoList  GetVideoListRequest
     * @return GetVideoListResponse
     */
    @Override
    public CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkflowTask  GetWorkflowTaskRequest
     * @return GetWorkflowTaskResponse
     */
    @Override
    public CompletableFuture<GetWorkflowTaskResponse> getWorkflowTask(GetWorkflowTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWorkflowTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkflowTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkflowTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertMediaToSearchLib  InsertMediaToSearchLibRequest
     * @return InsertMediaToSearchLibResponse
     */
    @Override
    public CompletableFuture<InsertMediaToSearchLibResponse> insertMediaToSearchLib(InsertMediaToSearchLibRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InsertMediaToSearchLib").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertMediaToSearchLibResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertMediaToSearchLibResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIAgentInstance  ListAIAgentInstanceRequest
     * @return ListAIAgentInstanceResponse
     */
    @Override
    public CompletableFuture<ListAIAgentInstanceResponse> listAIAgentInstance(ListAIAgentInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIAgentInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIAgentInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIAgentInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAllPublicMediaTags  ListAllPublicMediaTagsRequest
     * @return ListAllPublicMediaTagsResponse
     */
    @Override
    public CompletableFuture<ListAllPublicMediaTagsResponse> listAllPublicMediaTags(ListAllPublicMediaTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAllPublicMediaTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAllPublicMediaTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAllPublicMediaTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAvatarTrainingJobs  ListAvatarTrainingJobsRequest
     * @return ListAvatarTrainingJobsResponse
     */
    @Override
    public CompletableFuture<ListAvatarTrainingJobsResponse> listAvatarTrainingJobs(ListAvatarTrainingJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAvatarTrainingJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvatarTrainingJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvatarTrainingJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAvatars  ListAvatarsRequest
     * @return ListAvatarsResponse
     */
    @Override
    public CompletableFuture<ListAvatarsResponse> listAvatars(ListAvatarsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAvatars").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvatarsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvatarsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBatchMediaProducingJobs  ListBatchMediaProducingJobsRequest
     * @return ListBatchMediaProducingJobsResponse
     */
    @Override
    public CompletableFuture<ListBatchMediaProducingJobsResponse> listBatchMediaProducingJobs(ListBatchMediaProducingJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBatchMediaProducingJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBatchMediaProducingJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBatchMediaProducingJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomTemplates  ListCustomTemplatesRequest
     * @return ListCustomTemplatesResponse
     */
    @Override
    public CompletableFuture<ListCustomTemplatesResponse> listCustomTemplates(ListCustomTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomizedVoiceJobs  ListCustomizedVoiceJobsRequest
     * @return ListCustomizedVoiceJobsResponse
     */
    @Override
    public CompletableFuture<ListCustomizedVoiceJobsResponse> listCustomizedVoiceJobs(ListCustomizedVoiceJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomizedVoiceJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomizedVoiceJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomizedVoiceJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomizedVoices  ListCustomizedVoicesRequest
     * @return ListCustomizedVoicesResponse
     */
    @Override
    public CompletableFuture<ListCustomizedVoicesResponse> listCustomizedVoices(ListCustomizedVoicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomizedVoices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomizedVoicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomizedVoicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDNADB  ListDNADBRequest
     * @return ListDNADBResponse
     */
    @Override
    public CompletableFuture<ListDNADBResponse> listDNADB(ListDNADBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDNADB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDNADBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDNADBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query files in a media fingerprint library based on the library ID. The queried results can be paginated.</p>
     * 
     * @param request the request parameters of ListDNAFiles  ListDNAFilesRequest
     * @return ListDNAFilesResponse
     */
    @Override
    public CompletableFuture<ListDNAFilesResponse> listDNAFiles(ListDNAFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDNAFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDNAFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDNAFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDynamicImageJobs  ListDynamicImageJobsRequest
     * @return ListDynamicImageJobsResponse
     */
    @Override
    public CompletableFuture<ListDynamicImageJobsResponse> listDynamicImageJobs(ListDynamicImageJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDynamicImageJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDynamicImageJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDynamicImageJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEditingProjects  ListEditingProjectsRequest
     * @return ListEditingProjectsResponse
     */
    @Override
    public CompletableFuture<ListEditingProjectsResponse> listEditingProjects(ListEditingProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEditingProjects").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEditingProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEditingProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLiveRecordFiles  ListLiveRecordFilesRequest
     * @return ListLiveRecordFilesResponse
     */
    @Override
    public CompletableFuture<ListLiveRecordFilesResponse> listLiveRecordFiles(ListLiveRecordFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveRecordFiles").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveRecordFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveRecordFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLiveRecordJobs  ListLiveRecordJobsRequest
     * @return ListLiveRecordJobsResponse
     */
    @Override
    public CompletableFuture<ListLiveRecordJobsResponse> listLiveRecordJobs(ListLiveRecordJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveRecordJobs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveRecordJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveRecordJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLiveRecordTemplates  ListLiveRecordTemplatesRequest
     * @return ListLiveRecordTemplatesResponse
     */
    @Override
    public CompletableFuture<ListLiveRecordTemplatesResponse> listLiveRecordTemplates(ListLiveRecordTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveRecordTemplates").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveRecordTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveRecordTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLiveSnapshotFiles  ListLiveSnapshotFilesRequest
     * @return ListLiveSnapshotFilesResponse
     */
    @Override
    public CompletableFuture<ListLiveSnapshotFilesResponse> listLiveSnapshotFiles(ListLiveSnapshotFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveSnapshotFiles").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveSnapshotFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveSnapshotFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLiveSnapshotJobs  ListLiveSnapshotJobsRequest
     * @return ListLiveSnapshotJobsResponse
     */
    @Override
    public CompletableFuture<ListLiveSnapshotJobsResponse> listLiveSnapshotJobs(ListLiveSnapshotJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveSnapshotJobs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveSnapshotJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveSnapshotJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLiveSnapshotTemplates  ListLiveSnapshotTemplatesRequest
     * @return ListLiveSnapshotTemplatesResponse
     */
    @Override
    public CompletableFuture<ListLiveSnapshotTemplatesResponse> listLiveSnapshotTemplates(ListLiveSnapshotTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveSnapshotTemplates").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveSnapshotTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveSnapshotTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLiveTranscodeJobs  ListLiveTranscodeJobsRequest
     * @return ListLiveTranscodeJobsResponse
     */
    @Override
    public CompletableFuture<ListLiveTranscodeJobsResponse> listLiveTranscodeJobs(ListLiveTranscodeJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveTranscodeJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveTranscodeJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveTranscodeJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLiveTranscodeTemplates  ListLiveTranscodeTemplatesRequest
     * @return ListLiveTranscodeTemplatesResponse
     */
    @Override
    public CompletableFuture<ListLiveTranscodeTemplatesResponse> listLiveTranscodeTemplates(ListLiveTranscodeTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveTranscodeTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveTranscodeTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveTranscodeTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If includeFileBasicInfo is set to true, the basic information, such as the duration and file size, of the source file is also returned. At most the first 100 entries that meet the specified conditions are returned. All media assets must exactly match all non-empty fields. The fields that support exact match include MediaType, Source, BusinessType, Category, and Status. If all information cannot be returned at a time, you can use NextToken to initiate a request to retrieve a new page of results.</p>
     * 
     * @param request the request parameters of ListMediaBasicInfos  ListMediaBasicInfosRequest
     * @return ListMediaBasicInfosResponse
     */
    @Override
    public CompletableFuture<ListMediaBasicInfosResponse> listMediaBasicInfos(ListMediaBasicInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMediaBasicInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMediaBasicInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMediaBasicInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMediaInfoJobs  ListMediaInfoJobsRequest
     * @return ListMediaInfoJobsResponse
     */
    @Override
    public CompletableFuture<ListMediaInfoJobsResponse> listMediaInfoJobs(ListMediaInfoJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMediaInfoJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMediaInfoJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMediaInfoJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMediaMarks  ListMediaMarksRequest
     * @return ListMediaMarksResponse
     */
    @Override
    public CompletableFuture<ListMediaMarksResponse> listMediaMarks(ListMediaMarksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMediaMarks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMediaMarksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMediaMarksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMediaProducingJobs  ListMediaProducingJobsRequest
     * @return ListMediaProducingJobsResponse
     */
    @Override
    public CompletableFuture<ListMediaProducingJobsResponse> listMediaProducingJobs(ListMediaProducingJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMediaProducingJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMediaProducingJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMediaProducingJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPackageJobs  ListPackageJobsRequest
     * @return ListPackageJobsResponse
     */
    @Override
    public CompletableFuture<ListPackageJobsResponse> listPackageJobs(ListPackageJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPackageJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPackageJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPackageJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelines  ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    @Override
    public CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPipelines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPublicMediaBasicInfos  ListPublicMediaBasicInfosRequest
     * @return ListPublicMediaBasicInfosResponse
     */
    @Override
    public CompletableFuture<ListPublicMediaBasicInfosResponse> listPublicMediaBasicInfos(ListPublicMediaBasicInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPublicMediaBasicInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublicMediaBasicInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublicMediaBasicInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSearchLib  ListSearchLibRequest
     * @return ListSearchLibResponse
     */
    @Override
    public CompletableFuture<ListSearchLibResponse> listSearchLib(ListSearchLibRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSearchLib").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSearchLibResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSearchLibResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSmartJobs  ListSmartJobsRequest
     * @return ListSmartJobsResponse
     */
    @Override
    public CompletableFuture<ListSmartJobsResponse> listSmartJobs(ListSmartJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSmartJobs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSmartJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSmartJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSmartSysAvatarModels  ListSmartSysAvatarModelsRequest
     * @return ListSmartSysAvatarModelsResponse
     */
    @Override
    public CompletableFuture<ListSmartSysAvatarModelsResponse> listSmartSysAvatarModels(ListSmartSysAvatarModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSmartSysAvatarModels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSmartSysAvatarModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSmartSysAvatarModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSmartVoiceGroups  ListSmartVoiceGroupsRequest
     * @return ListSmartVoiceGroupsResponse
     */
    @Override
    public CompletableFuture<ListSmartVoiceGroupsResponse> listSmartVoiceGroups(ListSmartVoiceGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSmartVoiceGroups").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSmartVoiceGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSmartVoiceGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSnapshotJobs  ListSnapshotJobsRequest
     * @return ListSnapshotJobsResponse
     */
    @Override
    public CompletableFuture<ListSnapshotJobsResponse> listSnapshotJobs(ListSnapshotJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSnapshotJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSnapshotJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSnapshotJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Template types:</p>
     * <ol>
     * <li>1: transcoding template.</li>
     * <li>2: snapshot template.</li>
     * <li>3: animated image template.</li>
     * <li>4\. image watermark template.</li>
     * <li>5: text watermark template.</li>
     * <li>6: subtitle template.</li>
     * <li>7: AI-assisted content moderation template.</li>
     * <li>8: AI-assisted intelligent thumbnail template.</li>
     * <li>9: AI-assisted intelligent erasure template.
     * Subtypes of transcoding templates:</li>
     * <li>1 (Normal): regular template.</li>
     * <li>2 (AudioTranscode): audio transcoding template.</li>
     * <li>3 (Remux): container format conversion template.</li>
     * <li>4 (NarrowBandV1): Narrowband HD 1.0 template.</li>
     * <li>5 (NarrowBandV2): Narrowband HD 2.0 template.
     * Subtypes of snapshot templates:</li>
     * <li>1 (Normal): regular template.</li>
     * <li>2 (Sprite): sprite template.</li>
     * <li>3 (WebVtt): WebVTT template.
     * Subtypes of AI-assisted content moderation templates:</li>
     * <li>1 (Video): video moderation template.</li>
     * <li>2 (Audio): audio moderation template.</li>
     * <li>3 (Image): image moderation template.
     * Subtypes of AI-assisted intelligent erasure templates:</li>
     * <li>1 (VideoDelogo): logo erasure template.</li>
     * <li>2 (VideoDetext): subtitle erasure template.</li>
     * </ol>
     * 
     * @param request the request parameters of ListSystemTemplates  ListSystemTemplatesRequest
     * @return ListSystemTemplatesResponse
     */
    @Override
    public CompletableFuture<ListSystemTemplatesResponse> listSystemTemplates(ListSystemTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSystemTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSystemTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSystemTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A template is an encapsulation of the timeline of a media editing and production job. You can define a common timeline as a template. When you have the same requirements, you need to only specify key parameters and materials to produce videos.</p>
     * <ul>
     * <li>For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/270942.html">Create and use a regular template</a>.</li>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/291418.html">Create and use advanced templates</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    @Override
    public CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTranscodeJobs  ListTranscodeJobsRequest
     * @return ListTranscodeJobsResponse
     */
    @Override
    public CompletableFuture<ListTranscodeJobsResponse> listTranscodeJobs(ListTranscodeJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTranscodeJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTranscodeJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTranscodeJobsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of QueryCopyrightJobList  QueryCopyrightJobListRequest
     * @return QueryCopyrightJobListResponse
     */
    @Override
    public CompletableFuture<QueryCopyrightJobListResponse> queryCopyrightJobList(QueryCopyrightJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCopyrightJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCopyrightJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCopyrightJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDNAJobList  QueryDNAJobListRequest
     * @return QueryDNAJobListResponse
     */
    @Override
    public CompletableFuture<QueryDNAJobListResponse> queryDNAJobList(QueryDNAJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDNAJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDNAJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDNAJobListResponse> future = new CompletableFuture<>();
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
     * <p>In the content moderation results, the moderation results of the video are sorted in ascending order by time into a timeline. If the video is long, the content moderation results are paginated, and the first page is returned. You can call this operation again to query the remaining moderation results of the video.</p>
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
     * <p>You can call this operation to query only the content moderation jobs within the most recent three months.</p>
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
     * @param request the request parameters of QueryMediaIndexJob  QueryMediaIndexJobRequest
     * @return QueryMediaIndexJobResponse
     */
    @Override
    public CompletableFuture<QueryMediaIndexJobResponse> queryMediaIndexJob(QueryMediaIndexJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMediaIndexJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMediaIndexJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMediaIndexJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySearchIndex  QuerySearchIndexRequest
     * @return QuerySearchIndexResponse
     */
    @Override
    public CompletableFuture<QuerySearchIndexResponse> querySearchIndex(QuerySearchIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySearchIndex").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySearchIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySearchIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySearchLib  QuerySearchLibRequest
     * @return QuerySearchLibResponse
     */
    @Override
    public CompletableFuture<QuerySearchLibResponse> querySearchLib(QuerySearchLibRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySearchLib").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySearchLibResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySearchLibResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of QueryTraceAbJobList  QueryTraceAbJobListRequest
     * @return QueryTraceAbJobListResponse
     */
    @Override
    public CompletableFuture<QueryTraceAbJobListResponse> queryTraceAbJobList(QueryTraceAbJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTraceAbJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTraceAbJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTraceAbJobListResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of QueryTraceM3u8JobList  QueryTraceM3u8JobListRequest
     * @return QueryTraceM3u8JobListResponse
     */
    @Override
    public CompletableFuture<QueryTraceM3u8JobListResponse> queryTraceM3u8JobList(QueryTraceM3u8JobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTraceM3u8JobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTraceM3u8JobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTraceM3u8JobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can also call this operation to overwrite media files. After you obtain the upload URL of a media file, you can upload the media file again without changing the audio or video ID.</p>
     * 
     * @param request the request parameters of RefreshUploadMedia  RefreshUploadMediaRequest
     * @return RefreshUploadMediaResponse
     */
    @Override
    public CompletableFuture<RefreshUploadMediaResponse> refreshUploadMedia(RefreshUploadMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshUploadMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshUploadMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshUploadMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Registering a media asset is an asynchronous job that takes 2 to 3 seconds. When the operation returns the ID of the media asset, the registration may have not be completed. If you call the GetMediaInfo operation at this time, you may fail to obtain the information about the media asset.</p>
     * 
     * @param request the request parameters of RegisterMediaInfo  RegisterMediaInfoRequest
     * @return RegisterMediaInfoResponse
     */
    @Override
    public CompletableFuture<RegisterMediaInfoResponse> registerMediaInfo(RegisterMediaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterMediaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterMediaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterMediaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to register a media stream file in an Object Storage Service (OSS) bucket with Intelligent Media Services (IMS) and associate the media stream with the specified media asset ID.</p>
     * 
     * @param request the request parameters of RegisterMediaStream  RegisterMediaStreamRequest
     * @return RegisterMediaStreamResponse
     */
    @Override
    public CompletableFuture<RegisterMediaStreamResponse> registerMediaStream(RegisterMediaStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterMediaStream").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterMediaStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterMediaStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchEditingProject  SearchEditingProjectRequest
     * @return SearchEditingProjectResponse
     */
    @Override
    public CompletableFuture<SearchEditingProjectResponse> searchEditingProject(SearchEditingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchEditingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchEditingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchEditingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchIndexJobRerun  SearchIndexJobRerunRequest
     * @return SearchIndexJobRerunResponse
     */
    @Override
    public CompletableFuture<SearchIndexJobRerunResponse> searchIndexJobRerun(SearchIndexJobRerunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchIndexJobRerun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchIndexJobRerunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchIndexJobRerunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * @param request the request parameters of SearchMedia  SearchMediaRequest
     * @return SearchMediaResponse
     */
    @Override
    public CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query media assets or media asset clips based on character names, subtitles, or AI categories.</p>
     * 
     * @param request the request parameters of SearchMediaByAILabel  SearchMediaByAILabelRequest
     * @return SearchMediaByAILabelResponse
     */
    @Override
    public CompletableFuture<SearchMediaByAILabelResponse> searchMediaByAILabel(SearchMediaByAILabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMediaByAILabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMediaByAILabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMediaByAILabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * @param request the request parameters of SearchMediaByFace  SearchMediaByFaceRequest
     * @return SearchMediaByFaceResponse
     */
    @Override
    public CompletableFuture<SearchMediaByFaceResponse> searchMediaByFace(SearchMediaByFaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMediaByFace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMediaByFaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMediaByFaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchMediaByHybrid  SearchMediaByHybridRequest
     * @return SearchMediaByHybridResponse
     */
    @Override
    public CompletableFuture<SearchMediaByHybridResponse> searchMediaByHybrid(SearchMediaByHybridRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMediaByHybrid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMediaByHybridResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMediaByHybridResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * @param request the request parameters of SearchMediaByMultimodal  SearchMediaByMultimodalRequest
     * @return SearchMediaByMultimodalResponse
     */
    @Override
    public CompletableFuture<SearchMediaByMultimodalResponse> searchMediaByMultimodal(SearchMediaByMultimodalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMediaByMultimodal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMediaByMultimodalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMediaByMultimodalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * @param request the request parameters of SearchMediaClipByFace  SearchMediaClipByFaceRequest
     * @return SearchMediaClipByFaceResponse
     */
    @Override
    public CompletableFuture<SearchMediaClipByFaceResponse> searchMediaClipByFace(SearchMediaClipByFaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMediaClipByFace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMediaClipByFaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMediaClipByFaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchPublicMediaInfo  SearchPublicMediaInfoRequest
     * @return SearchPublicMediaInfoResponse
     */
    @Override
    public CompletableFuture<SearchPublicMediaInfoResponse> searchPublicMediaInfo(SearchPublicMediaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchPublicMediaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchPublicMediaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchPublicMediaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendAIAgentSpeech  SendAIAgentSpeechRequest
     * @return SendAIAgentSpeechResponse
     */
    @Override
    public CompletableFuture<SendAIAgentSpeechResponse> sendAIAgentSpeech(SendAIAgentSpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendAIAgentSpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendAIAgentSpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendAIAgentSpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendLiveSnapshotJobCommand  SendLiveSnapshotJobCommandRequest
     * @return SendLiveSnapshotJobCommandResponse
     */
    @Override
    public CompletableFuture<SendLiveSnapshotJobCommandResponse> sendLiveSnapshotJobCommand(SendLiveSnapshotJobCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendLiveSnapshotJobCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendLiveSnapshotJobCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendLiveSnapshotJobCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendLiveTranscodeJobCommand  SendLiveTranscodeJobCommandRequest
     * @return SendLiveTranscodeJobCommandResponse
     */
    @Override
    public CompletableFuture<SendLiveTranscodeJobCommandResponse> sendLiveTranscodeJobCommand(SendLiveTranscodeJobCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendLiveTranscodeJobCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendLiveTranscodeJobCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendLiveTranscodeJobCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetContentAnalyzeConfig  SetContentAnalyzeConfigRequest
     * @return SetContentAnalyzeConfigResponse
     */
    @Override
    public CompletableFuture<SetContentAnalyzeConfigResponse> setContentAnalyzeConfig(SetContentAnalyzeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetContentAnalyzeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetContentAnalyzeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetContentAnalyzeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDefaultCustomTemplate  SetDefaultCustomTemplateRequest
     * @return SetDefaultCustomTemplateResponse
     */
    @Override
    public CompletableFuture<SetDefaultCustomTemplateResponse> setDefaultCustomTemplate(SetDefaultCustomTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultCustomTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultCustomTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultCustomTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDefaultStorageLocation  SetDefaultStorageLocationRequest
     * @return SetDefaultStorageLocationResponse
     */
    @Override
    public CompletableFuture<SetDefaultStorageLocationResponse> setDefaultStorageLocation(SetDefaultStorageLocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultStorageLocation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultStorageLocationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultStorageLocationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetEventCallback  SetEventCallbackRequest
     * @return SetEventCallbackResponse
     */
    @Override
    public CompletableFuture<SetEventCallbackResponse> setEventCallback(SetEventCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetEventCallback").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetEventCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetEventCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetNotifyConfig  SetNotifyConfigRequest
     * @return SetNotifyConfigResponse
     */
    @Override
    public CompletableFuture<SetNotifyConfigResponse> setNotifyConfig(SetNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartAIAgentInstance  StartAIAgentInstanceRequest
     * @return StartAIAgentInstanceResponse
     */
    @Override
    public CompletableFuture<StartAIAgentInstanceResponse> startAIAgentInstance(StartAIAgentInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartAIAgentInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAIAgentInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAIAgentInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartRtcRobotInstance  StartRtcRobotInstanceRequest
     * @return StartRtcRobotInstanceResponse
     */
    @Override
    public CompletableFuture<StartRtcRobotInstanceResponse> startRtcRobotInstance(StartRtcRobotInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartRtcRobotInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartRtcRobotInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartRtcRobotInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Only media assets from Intelligent Media Services (IMS) or ApsaraVideo VOD can be used as the input of a workflow.</p>
     * <ul>
     * <li>When you submit a workflow task, you must specify a workflow template. You can create a workflow template in the <a href="https://ims.console.aliyun.com/settings/workflow/list">IMS console</a> or use a preset workflow template.</li>
     * </ul>
     * 
     * @param request the request parameters of StartWorkflow  StartWorkflowRequest
     * @return StartWorkflowResponse
     */
    @Override
    public CompletableFuture<StartWorkflowResponse> startWorkflow(StartWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopAIAgentInstance  StopAIAgentInstanceRequest
     * @return StopAIAgentInstanceResponse
     */
    @Override
    public CompletableFuture<StopAIAgentInstanceResponse> stopAIAgentInstance(StopAIAgentInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopAIAgentInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopAIAgentInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopAIAgentInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopRtcRobotInstance  StopRtcRobotInstanceRequest
     * @return StopRtcRobotInstanceResponse
     */
    @Override
    public CompletableFuture<StopRtcRobotInstanceResponse> stopRtcRobotInstance(StopRtcRobotInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopRtcRobotInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopRtcRobotInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopRtcRobotInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitASRJob  SubmitASRJobRequest
     * @return SubmitASRJobResponse
     */
    @Override
    public CompletableFuture<SubmitASRJobResponse> submitASRJob(SubmitASRJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitASRJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitASRJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitASRJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAudioProduceJob  SubmitAudioProduceJobRequest
     * @return SubmitAudioProduceJobResponse
     */
    @Override
    public CompletableFuture<SubmitAudioProduceJobResponse> submitAudioProduceJob(SubmitAudioProduceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAudioProduceJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAudioProduceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAudioProduceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAvatarTrainingJob  SubmitAvatarTrainingJobRequest
     * @return SubmitAvatarTrainingJobResponse
     */
    @Override
    public CompletableFuture<SubmitAvatarTrainingJobResponse> submitAvatarTrainingJob(SubmitAvatarTrainingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAvatarTrainingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAvatarTrainingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAvatarTrainingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAvatarVideoJob  SubmitAvatarVideoJobRequest
     * @return SubmitAvatarVideoJobResponse
     */
    @Override
    public CompletableFuture<SubmitAvatarVideoJobResponse> submitAvatarVideoJob(SubmitAvatarVideoJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAvatarVideoJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAvatarVideoJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAvatarVideoJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitBatchMediaProducingJob  SubmitBatchMediaProducingJobRequest
     * @return SubmitBatchMediaProducingJobResponse
     */
    @Override
    public CompletableFuture<SubmitBatchMediaProducingJobResponse> submitBatchMediaProducingJob(SubmitBatchMediaProducingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitBatchMediaProducingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitBatchMediaProducingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitBatchMediaProducingJobResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SubmitCustomizedVoiceJob  SubmitCustomizedVoiceJobRequest
     * @return SubmitCustomizedVoiceJobResponse
     */
    @Override
    public CompletableFuture<SubmitCustomizedVoiceJobResponse> submitCustomizedVoiceJob(SubmitCustomizedVoiceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitCustomizedVoiceJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitCustomizedVoiceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitCustomizedVoiceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  SubmitDNAJob is an asynchronous operation. After a request is sent, the system returns a request ID and a job ID and runs the task in the background.</p>
     * <ul>
     * <li>You can call this operation only in the China (Beijing), China (Hangzhou), and China (Shanghai) regions.</li>
     * <li>You can submit a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitDNAJob  SubmitDNAJobRequest
     * @return SubmitDNAJobResponse
     */
    @Override
    public CompletableFuture<SubmitDNAJobResponse> submitDNAJob(SubmitDNAJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitDNAJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDNAJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDNAJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitDynamicChartJob  SubmitDynamicChartJobRequest
     * @return SubmitDynamicChartJobResponse
     */
    @Override
    public CompletableFuture<SubmitDynamicChartJobResponse> submitDynamicChartJob(SubmitDynamicChartJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitDynamicChartJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDynamicChartJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDynamicChartJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitDynamicImageJob  SubmitDynamicImageJobRequest
     * @return SubmitDynamicImageJobResponse
     */
    @Override
    public CompletableFuture<SubmitDynamicImageJobResponse> submitDynamicImageJob(SubmitDynamicImageJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitDynamicImageJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDynamicImageJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDynamicImageJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * <b>description</b> :
     * <p>Live editing is supported for live streams that are recorded and stored in Object Storage Service (OSS) and ApsaraVideo VOD. If multiple live streams are involved in a single job, only those recorded within the same application are supported for mixed editing. The streams must all be recorded either in OSS or ApsaraVideo VOD.</p>
     * 
     * @param request the request parameters of SubmitLiveEditingJob  SubmitLiveEditingJobRequest
     * @return SubmitLiveEditingJobResponse
     */
    @Override
    public CompletableFuture<SubmitLiveEditingJobResponse> submitLiveEditingJob(SubmitLiveEditingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitLiveEditingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitLiveEditingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitLiveEditingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to record live streams of ApsaraVideo Live or third-party Real-Time Messaging Protocol (RTMP) live streams. We recommend that you ingest a stream before you call this operation to submit a recording job. If no stream is pulled from the streaming URL, the job attempts to pull a stream for 3 minutes. If the attempt times out, the recording service stops.
     * Before you submit a recording job, you must prepare an Object Storage Service (OSS) or ApsaraVideo VOD bucket. We recommend that you use a storage address configured in Intelligent Media Services (IMS) to facilitate the management and processing of generated recording files.
     * If the preset recording template does not meet your requirements, you can create a custom recording template.</p>
     * 
     * @param request the request parameters of SubmitLiveRecordJob  SubmitLiveRecordJobRequest
     * @return SubmitLiveRecordJobResponse
     */
    @Override
    public CompletableFuture<SubmitLiveRecordJobResponse> submitLiveRecordJob(SubmitLiveRecordJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitLiveRecordJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitLiveRecordJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitLiveRecordJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitLiveSnapshotJob  SubmitLiveSnapshotJobRequest
     * @return SubmitLiveSnapshotJobResponse
     */
    @Override
    public CompletableFuture<SubmitLiveSnapshotJobResponse> submitLiveSnapshotJob(SubmitLiveSnapshotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitLiveSnapshotJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitLiveSnapshotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitLiveSnapshotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When you submit a transcoding job that immediately takes effect, make sure that the input stream can be streamed.</p>
     * <ul>
     * <li>When you submit a timed transcoding job, make sure that the input stream can be streamed before the specified time.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitLiveTranscodeJob  SubmitLiveTranscodeJobRequest
     * @return SubmitLiveTranscodeJobResponse
     */
    @Override
    public CompletableFuture<SubmitLiveTranscodeJobResponse> submitLiveTranscodeJob(SubmitLiveTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitLiveTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitLiveTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitLiveTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitMediaAiAnalysisJob  SubmitMediaAiAnalysisJobRequest
     * @return SubmitMediaAiAnalysisJobResponse
     */
    @Override
    public CompletableFuture<SubmitMediaAiAnalysisJobResponse> submitMediaAiAnalysisJob(SubmitMediaAiAnalysisJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitMediaAiAnalysisJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitMediaAiAnalysisJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitMediaAiAnalysisJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The job that you submit by calling this operation is run in asynchronous mode. The job is added to an ApsaraVideo Media Processing (MPS) queue to be scheduled and run. You can call the <a href="https://help.aliyun.com/document_detail/444847.html">QueryMediaCensorJobDetail</a> operation or configure an asynchronous notification to obtain the job results.</p>
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
     * <p>You can call this operation to analyze an input media file by using a callback mechanism or initiating subsequent queries. This operation is suitable for scenarios in which real-time performance is less critical and high concurrency is expected.</p>
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
     * <b>description</b> :
     * <p>  This operation returns only the submission result of a media editing and production job. When the submission result is returned, the job may still be in progress. After a media editing and production job is submitted, the job is queued in the background for asynchronous processing.</p>
     * <ul>
     * <li>The materials referenced in the timeline of an online editing project can be media assets in the media asset library or Object Storage Service (OSS) objects. External URLs or Alibaba Cloud Content Delivery Network (CDN) URLs are not supported. To use an OSS object as a material, you must set MediaUrl to an OSS URL, such as <a href="https://your-bucket.oss-region-name.aliyuncs.com/your-object.ext">https://your-bucket.oss-region-name.aliyuncs.com/your-object.ext</a>.</li>
     * <li>After the production is complete, the output file is automatically registered as a media asset. The media asset first needs to be analyzed. After the media asset is analyzed, you can query the duration and resolution information based on the media asset ID.</li>
     * </ul>
     * <h2><a href="#"></a>Limits</h2>
     * <ul>
     * <li>The throttling threshold of this operation is 30 queries per second (QPS).
     * **
     * <strong>Note</strong> If the threshold is exceeded, a &quot;Throttling.User&quot; error is returned when you submit an editing job. For more information about how to resolve this issue, see the <a href="https://help.aliyun.com/document_detail/453484.html">FAQ</a>.</li>
     * <li>You can create up to 100 video tracks, 100 image tracks, and 100 subtitle tracks in a project.</li>
     * <li>The total size of material files cannot exceed 1 TB.</li>
     * <li>The OSS buckets in which the materials reside and where the output media assets are stored must be in the same region as the region in which Intelligent Media Services (IMS) is activated.</li>
     * <li>An output video must meet the following requirements:<ul>
     * <li>Both the width and height must be at least 128 pixels.</li>
     * <li>Both the width and height cannot exceed 4,096 pixels.</li>
     * <li>The shorter side of the video cannot exceed 2,160 pixels.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SubmitMediaProducingJob  SubmitMediaProducingJobRequest
     * @return SubmitMediaProducingJobResponse
     */
    @Override
    public CompletableFuture<SubmitMediaProducingJobResponse> submitMediaProducingJob(SubmitMediaProducingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitMediaProducingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitMediaProducingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitMediaProducingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitPackageJob  SubmitPackageJobRequest
     * @return SubmitPackageJobResponse
     */
    @Override
    public CompletableFuture<SubmitPackageJobResponse> submitPackageJob(SubmitPackageJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitPackageJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitPackageJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitPackageJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to submit a smart tagging job, you must add a smart tagging template and specify the analysis types that you want to use in the template. For more information, see CreateCustomTemplate. You can use the smart tagging feature only in the China (Beijing), China (Shanghai), and China (Hangzhou) regions. By default, an ApsaraVideo Media Processing (MPS) queue can process a maximum of two concurrent smart tagging jobs. If you need to process more concurrent smart tagging jobs, submit a ticket to contact Alibaba Cloud Technical Support for evaluation and configuration.</p>
     * 
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
     * @param request the request parameters of SubmitSportsHighlightsJob  SubmitSportsHighlightsJobRequest
     * @return SubmitSportsHighlightsJobResponse
     */
    @Override
    public CompletableFuture<SubmitSportsHighlightsJobResponse> submitSportsHighlightsJob(SubmitSportsHighlightsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitSportsHighlightsJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSportsHighlightsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSportsHighlightsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitStandardCustomizedVoiceJob  SubmitStandardCustomizedVoiceJobRequest
     * @return SubmitStandardCustomizedVoiceJobResponse
     */
    @Override
    public CompletableFuture<SubmitStandardCustomizedVoiceJobResponse> submitStandardCustomizedVoiceJob(SubmitStandardCustomizedVoiceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitStandardCustomizedVoiceJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitStandardCustomizedVoiceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitStandardCustomizedVoiceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to analyze an input media file in synchronous mode. This operation is suitable for scenarios that require high real-time performance and low concurrency. If it takes an extended period of time to obtain the media information about the input media file, the request may time out or the obtained information may be inaccurate. We recommend that you call the <a href="https://help.aliyun.com/document_detail/441222.html">SubmitMediaInfoJob</a> operation to obtain media information.</p>
     * 
     * @param request the request parameters of SubmitSyncMediaInfoJob  SubmitSyncMediaInfoJobRequest
     * @return SubmitSyncMediaInfoJobResponse
     */
    @Override
    public CompletableFuture<SubmitSyncMediaInfoJobResponse> submitSyncMediaInfoJob(SubmitSyncMediaInfoJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitSyncMediaInfoJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSyncMediaInfoJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSyncMediaInfoJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitTextGenerateJob  SubmitTextGenerateJobRequest
     * @return SubmitTextGenerateJobResponse
     */
    @Override
    public CompletableFuture<SubmitTextGenerateJobResponse> submitTextGenerateJob(SubmitTextGenerateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitTextGenerateJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitTextGenerateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitTextGenerateJobResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SubmitTranscodeJob  SubmitTranscodeJobRequest
     * @return SubmitTranscodeJobResponse
     */
    @Override
    public CompletableFuture<SubmitTranscodeJobResponse> submitTranscodeJob(SubmitTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation to submit a video translation job, the system returns a job ID. You can call the GetSmartHandleJob operation based on the job ID to obtain the status and result information of the job.</p>
     * 
     * @param request the request parameters of SubmitVideoTranslationJob  SubmitVideoTranslationJobRequest
     * @return SubmitVideoTranslationJobResponse
     */
    @Override
    public CompletableFuture<SubmitVideoTranslationJobResponse> submitVideoTranslationJob(SubmitVideoTranslationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitVideoTranslationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitVideoTranslationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitVideoTranslationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAIAgentInstance  UpdateAIAgentInstanceRequest
     * @return UpdateAIAgentInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateAIAgentInstanceResponse> updateAIAgentInstance(UpdateAIAgentInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAIAgentInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAIAgentInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAIAgentInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAvatarTrainingJob  UpdateAvatarTrainingJobRequest
     * @return UpdateAvatarTrainingJobResponse
     */
    @Override
    public CompletableFuture<UpdateAvatarTrainingJobResponse> updateAvatarTrainingJob(UpdateAvatarTrainingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAvatarTrainingJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAvatarTrainingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAvatarTrainingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you create a media asset category, you can call this operation to find the category based on the category ID and change the name of the category.</p>
     * 
     * @param request the request parameters of UpdateCategory  UpdateCategoryRequest
     * @return UpdateCategoryResponse
     */
    @Override
    public CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomTemplate  UpdateCustomTemplateRequest
     * @return UpdateCustomTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateCustomTemplateResponse> updateCustomTemplate(UpdateCustomTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomizedVoice  UpdateCustomizedVoiceRequest
     * @return UpdateCustomizedVoiceResponse
     */
    @Override
    public CompletableFuture<UpdateCustomizedVoiceResponse> updateCustomizedVoice(UpdateCustomizedVoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomizedVoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomizedVoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomizedVoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEditingProject  UpdateEditingProjectRequest
     * @return UpdateEditingProjectResponse
     */
    @Override
    public CompletableFuture<UpdateEditingProjectResponse> updateEditingProject(UpdateEditingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEditingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEditingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEditingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only user-created templates can be updated. The preset template cannot be updated.</p>
     * 
     * @param request the request parameters of UpdateLiveRecordTemplate  UpdateLiveRecordTemplateRequest
     * @return UpdateLiveRecordTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateLiveRecordTemplateResponse> updateLiveRecordTemplate(UpdateLiveRecordTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveRecordTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveRecordTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveRecordTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLiveSnapshotTemplate  UpdateLiveSnapshotTemplateRequest
     * @return UpdateLiveSnapshotTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateLiveSnapshotTemplateResponse> updateLiveSnapshotTemplate(UpdateLiveSnapshotTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveSnapshotTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveSnapshotTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveSnapshotTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  For a non-timed transcoding job, you can modify the Name parameter of the job, regardless of the job state.</p>
     * <ul>
     * <li>For a timed job, you can modify the Name, StreamInput, TranscodeOutput, and TimedConfig parameters. However, the StreamInput, TranscodeOutput, and TimedConfig parameters can be modified only when the job is not started.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLiveTranscodeJob  UpdateLiveTranscodeJobRequest
     * @return UpdateLiveTranscodeJobResponse
     */
    @Override
    public CompletableFuture<UpdateLiveTranscodeJobResponse> updateLiveTranscodeJob(UpdateLiveTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLiveTranscodeTemplate  UpdateLiveTranscodeTemplateRequest
     * @return UpdateLiveTranscodeTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateLiveTranscodeTemplateResponse> updateLiveTranscodeTemplate(UpdateLiveTranscodeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveTranscodeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveTranscodeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveTranscodeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the MediaId parameter is specified, the MediaId parameter is preferentially used for the query. If the MediaId parameter is left empty, the InputURL parameter must be specified. The request ID and media asset ID are returned. You cannot modify the input URL of a media asset by specifying the ID of the media asset.</p>
     * 
     * @param request the request parameters of UpdateMediaInfo  UpdateMediaInfoRequest
     * @return UpdateMediaInfoResponse
     */
    @Override
    public CompletableFuture<UpdateMediaInfoResponse> updateMediaInfo(UpdateMediaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMediaMarks  UpdateMediaMarksRequest
     * @return UpdateMediaMarksResponse
     */
    @Override
    public CompletableFuture<UpdateMediaMarksResponse> updateMediaMarks(UpdateMediaMarksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaMarks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaMarksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaMarksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMediaToSearchLib  UpdateMediaToSearchLibRequest
     * @return UpdateMediaToSearchLibResponse
     */
    @Override
    public CompletableFuture<UpdateMediaToSearchLibResponse> updateMediaToSearchLib(UpdateMediaToSearchLibRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaToSearchLib").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaToSearchLibResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaToSearchLibResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of UpdateRtcRobotInstance  UpdateRtcRobotInstanceRequest
     * @return UpdateRtcRobotInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateRtcRobotInstanceResponse> updateRtcRobotInstance(UpdateRtcRobotInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRtcRobotInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRtcRobotInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRtcRobotInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/270942.html">Create and use a regular template</a>.</p>
     * <ul>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/291418.html">Create and use advanced templates</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <p>  If a callback is configured, you will receive an UploadByURLComplete event notification after the file is uploaded. You can query the upload status by calling the GetURLUploadInfos operation.</p>
     * <ul>
     * <li>After a request is submitted, the upload job is queued as an asynchronous job in the cloud. You can query the status of the upload job based on information such as the URL and media asset ID that are returned in the event notification.</li>
     * <li>You can call this operation to upload media files that are not stored on a local server or device and must be uploaded by using URLs that are accessible over the Internet.</li>
     * <li>You can call this operation to upload media files only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media file to an OSS bucket, pull the file to a local directory, use <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a> to upload the file to an OSS bucket, and then call the <a href="https://help.aliyun.com/document_detail/441152.html">RegisterMediaInfo</a> operation to register the file in the OSS bucket with the media asset library.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * <li>You can call this operation to upload only audio and video files.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadMediaByURL  UploadMediaByURLRequest
     * @return UploadMediaByURLResponse
     */
    @Override
    public CompletableFuture<UploadMediaByURLResponse> uploadMediaByURL(UploadMediaByURLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadMediaByURL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadMediaByURLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadMediaByURLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to pull a media stream file based on a URL and upload the file. After the media stream file is uploaded, the media stream is associated with the specified media asset ID.</p>
     * <ul>
     * <li>You can call this operation to upload media stream files only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media stream file to an OSS bucket, pull the file to a local directory, use <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a> to upload the file to an OSS bucket, and then call the <a href="https://help.aliyun.com/document_detail/440765.html">RegisterMediaStream</a> operation to associate the media stream with the specified media asset ID.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadStreamByURL  UploadStreamByURLRequest
     * @return UploadStreamByURLResponse
     */
    @Override
    public CompletableFuture<UploadStreamByURLResponse> uploadStreamByURL(UploadStreamByURLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadStreamByURL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadStreamByURLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadStreamByURLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
