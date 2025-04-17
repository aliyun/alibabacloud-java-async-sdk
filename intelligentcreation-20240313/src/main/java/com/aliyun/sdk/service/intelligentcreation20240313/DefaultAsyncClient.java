// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.intelligentcreation20240313.models.*;
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
        this.product = "IntelligentCreation";
        this.version = "2024-03-13";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddTextFeedback  AddTextFeedbackRequest
     * @return AddTextFeedbackResponse
     */
    @Override
    public CompletableFuture<AddTextFeedbackResponse> addTextFeedback(AddTextFeedbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddTextFeedback").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/addTextFeedback").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTextFeedbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTextFeedbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchAddDocument  BatchAddDocumentRequest
     * @return BatchAddDocumentResponse
     */
    @Override
    public CompletableFuture<BatchAddDocumentResponse> batchAddDocument(BatchAddDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchAddDocument").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/knowledge-base/{knowledgeBaseId}/documents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchAddDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchAddDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchCreateAICoachTask  BatchCreateAICoachTaskRequest
     * @return BatchCreateAICoachTaskResponse
     */
    @Override
    public CompletableFuture<BatchCreateAICoachTaskResponse> batchCreateAICoachTask(BatchCreateAICoachTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchCreateAICoachTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/aicoach/batchCreateTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateAICoachTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateAICoachTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetProjectTask  BatchGetProjectTaskRequest
     * @return BatchGetProjectTaskResponse
     */
    @Override
    public CompletableFuture<BatchGetProjectTaskResponse> batchGetProjectTask(BatchGetProjectTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchGetProjectTask").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/digitalHuman/project/batchGetProjectTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetProjectTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetProjectTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetTrainTask  BatchGetTrainTaskRequest
     * @return BatchGetTrainTaskResponse
     */
    @Override
    public CompletableFuture<BatchGetTrainTaskResponse> batchGetTrainTask(BatchGetTrainTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchGetTrainTask").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/train/task/batchGetTrainTaskInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetTrainTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetTrainTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetVideoClipTask  BatchGetVideoClipTaskRequest
     * @return BatchGetVideoClipTaskResponse
     */
    @Override
    public CompletableFuture<BatchGetVideoClipTaskResponse> batchGetVideoClipTask(BatchGetVideoClipTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchGetVideoClipTask").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/video/clip/batchGetVideoClipTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetVideoClipTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetVideoClipTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchQueryIndividuationText  BatchQueryIndividuationTextRequest
     * @return BatchQueryIndividuationTextResponse
     */
    @Override
    public CompletableFuture<BatchQueryIndividuationTextResponse> batchQueryIndividuationText(BatchQueryIndividuationTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchQueryIndividuationText").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/individuationText/batchQueryText").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchQueryIndividuationTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchQueryIndividuationTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckSession  CheckSessionRequest
     * @return CheckSessionResponse
     */
    @Override
    public CompletableFuture<CheckSessionResponse> checkSession(CheckSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckSession").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/avatar/project/checkSession").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloseAICoachTaskSession  CloseAICoachTaskSessionRequest
     * @return CloseAICoachTaskSessionResponse
     */
    @Override
    public CompletableFuture<CloseAICoachTaskSessionResponse> closeAICoachTaskSession(CloseAICoachTaskSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloseAICoachTaskSession").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/aicoach/closeSession").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseAICoachTaskSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseAICoachTaskSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CountText  CountTextRequest
     * @return CountTextResponse
     */
    @Override
    public CompletableFuture<CountTextResponse> countText(CountTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CountText").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/countText").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CountTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CountTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAICoachTask  CreateAICoachTaskRequest
     * @return CreateAICoachTaskResponse
     */
    @Override
    public CompletableFuture<CreateAICoachTaskResponse> createAICoachTask(CreateAICoachTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAICoachTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/aicoach/createTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAICoachTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAICoachTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAICoachTaskSession  CreateAICoachTaskSessionRequest
     * @return CreateAICoachTaskSessionResponse
     */
    @Override
    public CompletableFuture<CreateAICoachTaskSessionResponse> createAICoachTaskSession(CreateAICoachTaskSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAICoachTaskSession").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/aicoach/startSession").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAICoachTaskSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAICoachTaskSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAnchor  CreateAnchorRequest
     * @return CreateAnchorResponse
     */
    @Override
    public CompletableFuture<CreateAnchorResponse> createAnchor(CreateAnchorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAnchor").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/digitalHuman/anchorOpen/createAnchor").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAnchorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAnchorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIllustrationTask  CreateIllustrationTaskRequest
     * @return CreateIllustrationTaskResponse
     */
    @Override
    public CompletableFuture<CreateIllustrationTaskResponse> createIllustrationTask(CreateIllustrationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIllustrationTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/texts/{textId}/illustrationTasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIllustrationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIllustrationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIndividuationProject  CreateIndividuationProjectRequest
     * @return CreateIndividuationProjectResponse
     */
    @Override
    public CompletableFuture<CreateIndividuationProjectResponse> createIndividuationProject(CreateIndividuationProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIndividuationProject").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/individuationText/createProject").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIndividuationProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIndividuationProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIndividuationTextTask  CreateIndividuationTextTaskRequest
     * @return CreateIndividuationTextTaskResponse
     */
    @Override
    public CompletableFuture<CreateIndividuationTextTaskResponse> createIndividuationTextTask(CreateIndividuationTextTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIndividuationTextTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/individuationText/createTextTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIndividuationTextTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIndividuationTextTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProductImage  CreateProductImageRequest
     * @return CreateProductImageResponse
     */
    @Override
    public CompletableFuture<CreateProductImageResponse> createProductImage(CreateProductImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProductImage").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/images/products").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProductImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProductImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRealisticPortrait  CreateRealisticPortraitRequest
     * @return CreateRealisticPortraitResponse
     */
    @Override
    public CompletableFuture<CreateRealisticPortraitResponse> createRealisticPortrait(CreateRealisticPortraitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRealisticPortrait").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/images/portrait/realistic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRealisticPortraitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRealisticPortraitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTextTask  CreateTextTaskRequest
     * @return CreateTextTaskResponse
     */
    @Override
    public CompletableFuture<CreateTextTaskResponse> createTextTask(CreateTextTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTextTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/textTasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTextTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTextTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTrainTask  CreateTrainTaskRequest
     * @return CreateTrainTaskResponse
     */
    @Override
    public CompletableFuture<CreateTrainTaskResponse> createTrainTask(CreateTrainTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTrainTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/train/task/createTrainTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrainTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrainTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVideoClipTask  CreateVideoClipTaskRequest
     * @return CreateVideoClipTaskResponse
     */
    @Override
    public CompletableFuture<CreateVideoClipTaskResponse> createVideoClipTask(CreateVideoClipTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVideoClipTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/video/clip/createVideoClipTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVideoClipTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVideoClipTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteIndividuationProject  DeleteIndividuationProjectRequest
     * @return DeleteIndividuationProjectResponse
     */
    @Override
    public CompletableFuture<DeleteIndividuationProjectResponse> deleteIndividuationProject(DeleteIndividuationProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndividuationProject").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/individuationText/deleteProject").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndividuationProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndividuationProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteIndividuationText  DeleteIndividuationTextRequest
     * @return DeleteIndividuationTextResponse
     */
    @Override
    public CompletableFuture<DeleteIndividuationTextResponse> deleteIndividuationText(DeleteIndividuationTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndividuationText").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/individuationText/deleteText").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndividuationTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndividuationTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDocument  DescribeDocumentRequest
     * @return DescribeDocumentResponse
     */
    @Override
    public CompletableFuture<DescribeDocumentResponse> describeDocument(DescribeDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeDocument").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/knowledge-base/{knowledgeBaseId}/documents/{documentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FinishAICoachTaskSession  FinishAICoachTaskSessionRequest
     * @return FinishAICoachTaskSessionResponse
     */
    @Override
    public CompletableFuture<FinishAICoachTaskSessionResponse> finishAICoachTaskSession(FinishAICoachTaskSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FinishAICoachTaskSession").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/aicoach/finishSession").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FinishAICoachTaskSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FinishAICoachTaskSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAICoachAssessmentPoint  GetAICoachAssessmentPointRequest
     * @return GetAICoachAssessmentPointResponse
     */
    @Override
    public CompletableFuture<GetAICoachAssessmentPointResponse> getAICoachAssessmentPoint(GetAICoachAssessmentPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAICoachAssessmentPoint").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/aicoach/getAssessmentPoint").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAICoachAssessmentPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAICoachAssessmentPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAICoachCheatDetection  GetAICoachCheatDetectionRequest
     * @return GetAICoachCheatDetectionResponse
     */
    @Override
    public CompletableFuture<GetAICoachCheatDetectionResponse> getAICoachCheatDetection(GetAICoachCheatDetectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAICoachCheatDetection").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/aicoach/getCheatDetection").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAICoachCheatDetectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAICoachCheatDetectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAICoachScript  GetAICoachScriptRequest
     * @return GetAICoachScriptResponse
     */
    @Override
    public CompletableFuture<GetAICoachScriptResponse> getAICoachScript(GetAICoachScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAICoachScript").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/aicoach/getScript").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAICoachScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAICoachScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAICoachTaskSessionHistory  GetAICoachTaskSessionHistoryRequest
     * @return GetAICoachTaskSessionHistoryResponse
     */
    @Override
    public CompletableFuture<GetAICoachTaskSessionHistoryResponse> getAICoachTaskSessionHistory(GetAICoachTaskSessionHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAICoachTaskSessionHistory").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/aicoach/querySessionHistory").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAICoachTaskSessionHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAICoachTaskSessionHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAICoachTaskSessionReport  GetAICoachTaskSessionReportRequest
     * @return GetAICoachTaskSessionReportResponse
     */
    @Override
    public CompletableFuture<GetAICoachTaskSessionReportResponse> getAICoachTaskSessionReport(GetAICoachTaskSessionReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAICoachTaskSessionReport").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/aicoach/queryTaskSessionReport").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAICoachTaskSessionReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAICoachTaskSessionReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIllustration  GetIllustrationRequest
     * @return GetIllustrationResponse
     */
    @Override
    public CompletableFuture<GetIllustrationResponse> getIllustration(GetIllustrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIllustration").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/texts/{textId}/illustrations/{illustrationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIllustrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIllustrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIllustrationTask  GetIllustrationTaskRequest
     * @return GetIllustrationTaskResponse
     */
    @Override
    public CompletableFuture<GetIllustrationTaskResponse> getIllustrationTask(GetIllustrationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIllustrationTask").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/texts/{textId}/illustrationTasks/{illustrationTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIllustrationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIllustrationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOssUploadToken  GetOssUploadTokenRequest
     * @return GetOssUploadTokenResponse
     */
    @Override
    public CompletableFuture<GetOssUploadTokenResponse> getOssUploadToken(GetOssUploadTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOssUploadToken").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/uploadToken").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOssUploadTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOssUploadTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProjectTask  GetProjectTaskRequest
     * @return GetProjectTaskResponse
     */
    @Override
    public CompletableFuture<GetProjectTaskResponse> getProjectTask(GetProjectTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProjectTask").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/digitalHuman/project/getProjectTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetText  GetTextRequest
     * @return GetTextResponse
     */
    @Override
    public CompletableFuture<GetTextResponse> getText(GetTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetText").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/texts/{textId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTextTask  GetTextTaskRequest
     * @return GetTextTaskResponse
     */
    @Override
    public CompletableFuture<GetTextTaskResponse> getTextTask(GetTextTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTextTask").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/textTasks/{textTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTextTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTextTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTextTemplate  GetTextTemplateRequest
     * @return GetTextTemplateResponse
     */
    @Override
    public CompletableFuture<GetTextTemplateResponse> getTextTemplate(GetTextTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTextTemplate").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/texts/commands/getTextTemplate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTextTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTextTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InteractText  InteractTextRequest
     * @return InteractTextResponse
     */
    @Override
    public CompletableFuture<InteractTextResponse> interactText(InteractTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InteractText").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/stream/interactText").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InteractTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InteractTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<InteractTextResponseBody> interactTextWithResponseIterable(InteractTextRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("InteractText").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/stream/interactText").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        InteractTextResponseBodyIterator iterator = InteractTextResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ListAICoachScriptPage  ListAICoachScriptPageRequest
     * @return ListAICoachScriptPageResponse
     */
    @Override
    public CompletableFuture<ListAICoachScriptPageResponse> listAICoachScriptPage(ListAICoachScriptPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAICoachScriptPage").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/aicoach/pageScript").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAICoachScriptPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAICoachScriptPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAICoachTaskPage  ListAICoachTaskPageRequest
     * @return ListAICoachTaskPageResponse
     */
    @Override
    public CompletableFuture<ListAICoachTaskPageResponse> listAICoachTaskPage(ListAICoachTaskPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAICoachTaskPage").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/aicoach/listTaskPage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAICoachTaskPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAICoachTaskPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    @Override
    public CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgents").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/agent/listAgents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAnchor  ListAnchorRequest
     * @return ListAnchorResponse
     */
    @Override
    public CompletableFuture<ListAnchorResponse> listAnchor(ListAnchorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAnchor").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/digitalHuman/anchorOpen/listAnchor").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAnchorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAnchorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAvatarProject  ListAvatarProjectRequest
     * @return ListAvatarProjectResponse
     */
    @Override
    public CompletableFuture<ListAvatarProjectResponse> listAvatarProject(ListAvatarProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAvatarProject").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/avatar/project/listAvatarProject").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvatarProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvatarProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKnowledgeBase  ListKnowledgeBaseRequest
     * @return ListKnowledgeBaseResponse
     */
    @Override
    public CompletableFuture<ListKnowledgeBaseResponse> listKnowledgeBase(ListKnowledgeBaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKnowledgeBase").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/knowledge-base").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKnowledgeBaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKnowledgeBaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTextThemes  ListTextThemesRequest
     * @return ListTextThemesResponse
     */
    @Override
    public CompletableFuture<ListTextThemesResponse> listTextThemes(ListTextThemesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTextThemes").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/textThemes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTextThemesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTextThemesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTexts  ListTextsRequest
     * @return ListTextsResponse
     */
    @Override
    public CompletableFuture<ListTextsResponse> listTexts(ListTextsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTexts").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/texts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTextsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTextsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVoiceModels  ListVoiceModelsRequest
     * @return ListVoiceModelsResponse
     */
    @Override
    public CompletableFuture<ListVoiceModelsResponse> listVoiceModels(ListVoiceModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVoiceModels").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/digitalHuman/voiceOpen/listVoiceModels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVoiceModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVoiceModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateAvatarProject  OperateAvatarProjectRequest
     * @return OperateAvatarProjectResponse
     */
    @Override
    public CompletableFuture<OperateAvatarProjectResponse> operateAvatarProject(OperateAvatarProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OperateAvatarProject").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/avatar/project/operateProjectAvatar").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateAvatarProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateAvatarProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAvatarProject  QueryAvatarProjectRequest
     * @return QueryAvatarProjectResponse
     */
    @Override
    public CompletableFuture<QueryAvatarProjectResponse> queryAvatarProject(QueryAvatarProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryAvatarProject").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/avatar/project/queryAvatarProject").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAvatarProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAvatarProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAvatarResource  QueryAvatarResourceRequest
     * @return QueryAvatarResourceResponse
     */
    @Override
    public CompletableFuture<QueryAvatarResourceResponse> queryAvatarResource(QueryAvatarResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryAvatarResource").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/avatar/project/queryResource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAvatarResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAvatarResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryImageToVideoTask  QueryImageToVideoTaskRequest
     * @return QueryImageToVideoTaskResponse
     */
    @Override
    public CompletableFuture<QueryImageToVideoTaskResponse> queryImageToVideoTask(QueryImageToVideoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryImageToVideoTask").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/video/imageToVideo/task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryImageToVideoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryImageToVideoTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIndividuationTextTask  QueryIndividuationTextTaskRequest
     * @return QueryIndividuationTextTaskResponse
     */
    @Override
    public CompletableFuture<QueryIndividuationTextTaskResponse> queryIndividuationTextTask(QueryIndividuationTextTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryIndividuationTextTask").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/individuationText/queryTextTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIndividuationTextTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIndividuationTextTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySessionInfo  QuerySessionInfoRequest
     * @return QuerySessionInfoResponse
     */
    @Override
    public CompletableFuture<QuerySessionInfoResponse> querySessionInfo(QuerySessionInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySessionInfo").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/avatar/project/querySessionInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySessionInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySessionInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTextStream  QueryTextStreamRequest
     * @return QueryTextStreamResponse
     */
    @Override
    public CompletableFuture<QueryTextStreamResponse> queryTextStream(QueryTextStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryTextStream").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/stream/queryTextStream/{textId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTextStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTextStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<QueryTextStreamResponseBody> queryTextStreamWithResponseIterable(QueryTextStreamRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("QueryTextStream").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/stream/queryTextStream/{textId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        QueryTextStreamResponseBodyIterator iterator = QueryTextStreamResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of SaveAvatarProject  SaveAvatarProjectRequest
     * @return SaveAvatarProjectResponse
     */
    @Override
    public CompletableFuture<SaveAvatarProjectResponse> saveAvatarProject(SaveAvatarProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveAvatarProject").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/avatar/project/saveAvatarProject").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveAvatarProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveAvatarProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SelectImageTask  SelectImageTaskRequest
     * @return SelectImageTaskResponse
     */
    @Override
    public CompletableFuture<SelectImageTaskResponse> selectImageTask(SelectImageTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SelectImageTask").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/images/portrait/select/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SelectImageTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SelectImageTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SelectResource  SelectResourceRequest
     * @return SelectResourceResponse
     */
    @Override
    public CompletableFuture<SelectResourceResponse> selectResource(SelectResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SelectResource").setMethod(HttpMethod.GET).setPathRegex("/yic/yic-console/openService/v1/digitalHuman/project/commands/overview").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SelectResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SelectResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendSdkMessage  SendSdkMessageRequest
     * @return SendSdkMessageResponse
     */
    @Override
    public CompletableFuture<SendSdkMessageResponse> sendSdkMessage(SendSdkMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendSdkMessage").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/sdk/sendMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendSdkMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendSdkMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendSdkStreamMessage  SendSdkStreamMessageRequest
     * @return SendSdkStreamMessageResponse
     */
    @Override
    public CompletableFuture<SendSdkStreamMessageResponse> sendSdkStreamMessage(SendSdkStreamMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendSdkStreamMessage").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/sdk/stream/sendMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendSdkStreamMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendSdkStreamMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> sendSdkStreamMessageWithAsyncResponseHandler(SendSdkStreamMessageRequest request, AsyncResponseHandler<SendSdkStreamMessageResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendSdkStreamMessage").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/sdk/stream/sendMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(SendSdkStreamMessageResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((SendSdkStreamMessageResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<SendSdkStreamMessageResponseBody> sendSdkStreamMessageWithResponseIterable(SendSdkStreamMessageRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("SendSdkStreamMessage").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/sdk/stream/sendMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        SendSdkStreamMessageResponseBodyIterator iterator = SendSdkStreamMessageResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of SendTextMsg  SendTextMsgRequest
     * @return SendTextMsgResponse
     */
    @Override
    public CompletableFuture<SendTextMsgResponse> sendTextMsg(SendTextMsgRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendTextMsg").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/avatar/project/sendTextMsg").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendTextMsgResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendTextMsgResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartAvatarSession  StartAvatarSessionRequest
     * @return StartAvatarSessionResponse
     */
    @Override
    public CompletableFuture<StartAvatarSessionResponse> startAvatarSession(StartAvatarSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartAvatarSession").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/avatar/project/startAvatarSession").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAvatarSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAvatarSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopAvatarSession  StopAvatarSessionRequest
     * @return StopAvatarSessionResponse
     */
    @Override
    public CompletableFuture<StopAvatarSessionResponse> stopAvatarSession(StopAvatarSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopAvatarSession").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/avatar/project/stopAvatarSession").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopAvatarSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopAvatarSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopProjectTask  StopProjectTaskRequest
     * @return StopProjectTaskResponse
     */
    @Override
    public CompletableFuture<StopProjectTaskResponse> stopProjectTask(StopProjectTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopProjectTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/digitalHuman/project/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopProjectTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopProjectTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitImageToVideoTask  SubmitImageToVideoTaskRequest
     * @return SubmitImageToVideoTaskResponse
     */
    @Override
    public CompletableFuture<SubmitImageToVideoTaskResponse> submitImageToVideoTask(SubmitImageToVideoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitImageToVideoTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/video/imageToVideo/task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitImageToVideoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitImageToVideoTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitProjectTask  SubmitProjectTaskRequest
     * @return SubmitProjectTaskResponse
     */
    @Override
    public CompletableFuture<SubmitProjectTaskResponse> submitProjectTask(SubmitProjectTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitProjectTask").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/digitalHuman/project/submitProjectTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitProjectTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitProjectTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferPortraitStyle  TransferPortraitStyleRequest
     * @return TransferPortraitStyleResponse
     */
    @Override
    public CompletableFuture<TransferPortraitStyleResponse> transferPortraitStyle(TransferPortraitStyleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TransferPortraitStyle").setMethod(HttpMethod.POST).setPathRegex("/yic/yic-console/openService/v1/images/portrait/transferPortraitStyle").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferPortraitStyleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferPortraitStyleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
