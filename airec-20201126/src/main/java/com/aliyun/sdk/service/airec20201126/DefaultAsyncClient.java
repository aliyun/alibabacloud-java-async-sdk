// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.airec20201126.models.*;
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
        this.product = "Airec";
        this.version = "2020-11-26";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AttachDataset  AttachDatasetRequest
     * @return AttachDatasetResponse
     */
    @Override
    public CompletableFuture<AttachDatasetResponse> attachDataset(AttachDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AttachDataset").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/dataSets/{versionId}/actions/current").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AttachIndexVersion  AttachIndexVersionRequest
     * @return AttachIndexVersionResponse
     */
    @Override
    public CompletableFuture<AttachIndexVersionResponse> attachIndexVersion(AttachIndexVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AttachIndexVersion").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms/{algorithmId}/index-versions/{versionId}/actions/attach").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachIndexVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachIndexVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckRankingModelReachable  CheckRankingModelReachableRequest
     * @return CheckRankingModelReachableResponse
     */
    @Override
    public CompletableFuture<CheckRankingModelReachableResponse> checkRankingModelReachable(CheckRankingModelReachableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckRankingModelReachable").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-models/{rankingModelId}/actions/check-connectivity").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckRankingModelReachableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckRankingModelReachableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneExperiment  CloneExperimentRequest
     * @return CloneExperimentResponse
     */
    @Override
    public CompletableFuture<CloneExperimentResponse> cloneExperiment(CloneExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneExperiment").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiments/{experimentId}/actions/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneSample  CloneSampleRequest
     * @return CloneSampleResponse
     */
    @Override
    public CompletableFuture<CloneSampleResponse> cloneSample(CloneSampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneSample").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/samples/{sampleId}/actions/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneSampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneSampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ColdStartRank  ColdStartRankRequest
     * @return ColdStartRankResponse
     */
    @Override
    public CompletableFuture<ColdStartRankResponse> coldStartRank(ColdStartRankRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ColdStartRank").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/cold-start/{instanceId}/actions/rank").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ColdStartRankResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ColdStartRankResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomAnalysisTask  CreateCustomAnalysisTaskRequest
     * @return CreateCustomAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<CreateCustomAnalysisTaskResponse> createCustomAnalysisTask(CreateCustomAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCustomAnalysisTask").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/dashboard/custom-analysis-tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomSample  CreateCustomSampleRequest
     * @return CreateCustomSampleResponse
     */
    @Override
    public CompletableFuture<CreateCustomSampleResponse> createCustomSample(CreateCustomSampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCustomSample").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/samples").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomSampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomSampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataDiagnoseTask  CreateDataDiagnoseTaskRequest
     * @return CreateDataDiagnoseTaskResponse
     */
    @Override
    public CompletableFuture<CreateDataDiagnoseTaskResponse> createDataDiagnoseTask(CreateDataDiagnoseTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDataDiagnoseTask").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/data-diagnose-task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataDiagnoseTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataDiagnoseTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExtraDataSource  CreateExtraDataSourceRequest
     * @return CreateExtraDataSourceResponse
     */
    @Override
    public CompletableFuture<CreateExtraDataSourceResponse> createExtraDataSource(CreateExtraDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExtraDataSource").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/extra-data-sources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExtraDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExtraDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFilteringAlgorithm  CreateFilteringAlgorithmRequest
     * @return CreateFilteringAlgorithmResponse
     */
    @Override
    public CompletableFuture<CreateFilteringAlgorithmResponse> createFilteringAlgorithm(CreateFilteringAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFilteringAlgorithm").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFilteringAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFilteringAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFlowControlTask  CreateFlowControlTaskRequest
     * @return CreateFlowControlTaskResponse
     */
    @Override
    public CompletableFuture<CreateFlowControlTaskResponse> createFlowControlTask(CreateFlowControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFlowControlTask").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFlowControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFlowControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRankingModel  CreateRankingModelRequest
     * @return CreateRankingModelResponse
     */
    @Override
    public CompletableFuture<CreateRankingModelResponse> createRankingModel(CreateRankingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRankingModel").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRankingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRankingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRankingModelTemplate  CreateRankingModelTemplateRequest
     * @return CreateRankingModelTemplateResponse
     */
    @Override
    public CompletableFuture<CreateRankingModelTemplateResponse> createRankingModelTemplate(CreateRankingModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRankingModelTemplate").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-model-templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRankingModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRankingModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRankingSystem  CreateRankingSystemRequest
     * @return CreateRankingSystemResponse
     */
    @Override
    public CompletableFuture<CreateRankingSystemResponse> createRankingSystem(CreateRankingSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRankingSystem").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRankingSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRankingSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    @Override
    public CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRule").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSampleFormatConfig  CreateSampleFormatConfigRequest
     * @return CreateSampleFormatConfigResponse
     */
    @Override
    public CompletableFuture<CreateSampleFormatConfigResponse> createSampleFormatConfig(CreateSampleFormatConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSampleFormatConfig").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/samples/{sampleId}/format-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSampleFormatConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSampleFormatConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of CreateScene  CreateSceneRequest
     * @return CreateSceneResponse
     */
    @Override
    public CompletableFuture<CreateSceneResponse> createScene(CreateSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateScene").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/scenes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUmengToken  CreateUmengTokenRequest
     * @return CreateUmengTokenResponse
     */
    @Override
    public CompletableFuture<CreateUmengTokenResponse> createUmengToken(CreateUmengTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUmengToken").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/umeng/token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUmengTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUmengTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DecribeRankingModel  DecribeRankingModelRequest
     * @return DecribeRankingModelResponse
     */
    @Override
    public CompletableFuture<DecribeRankingModelResponse> decribeRankingModel(DecribeRankingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DecribeRankingModel").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-models/{rankingModelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DecribeRankingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DecribeRankingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataSet  DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    @Override
    public CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDataSet").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/dataSets/{versionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExperiment  DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    @Override
    public CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExperiment").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiments/{experimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExtraDataSource  DeleteExtraDataSourceRequest
     * @return DeleteExtraDataSourceResponse
     */
    @Override
    public CompletableFuture<DeleteExtraDataSourceResponse> deleteExtraDataSource(DeleteExtraDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExtraDataSource").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/extra-data-sources/{type}/{dataSourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExtraDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExtraDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFilteringAlgorithm  DeleteFilteringAlgorithmRequest
     * @return DeleteFilteringAlgorithmResponse
     */
    @Override
    public CompletableFuture<DeleteFilteringAlgorithmResponse> deleteFilteringAlgorithm(DeleteFilteringAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFilteringAlgorithm").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms/{algorithmId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFilteringAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFilteringAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFlowControlTask  DeleteFlowControlTaskRequest
     * @return DeleteFlowControlTaskResponse
     */
    @Override
    public CompletableFuture<DeleteFlowControlTaskResponse> deleteFlowControlTask(DeleteFlowControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFlowControlTask").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFlowControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFlowControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRankingModel  DeleteRankingModelRequest
     * @return DeleteRankingModelResponse
     */
    @Override
    public CompletableFuture<DeleteRankingModelResponse> deleteRankingModel(DeleteRankingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRankingModel").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-models/{rankingModelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRankingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRankingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRankingModelTemplate  DeleteRankingModelTemplateRequest
     * @return DeleteRankingModelTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteRankingModelTemplateResponse> deleteRankingModelTemplate(DeleteRankingModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRankingModelTemplate").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-model-templates/{templateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRankingModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRankingModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRankingModelVersion  DeleteRankingModelVersionRequest
     * @return DeleteRankingModelVersionResponse
     */
    @Override
    public CompletableFuture<DeleteRankingModelVersionResponse> deleteRankingModelVersion(DeleteRankingModelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRankingModelVersion").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-model-versions/{versionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRankingModelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRankingModelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRankingSystem  DeleteRankingSystemRequest
     * @return DeleteRankingSystemResponse
     */
    @Override
    public CompletableFuture<DeleteRankingSystemResponse> deleteRankingSystem(DeleteRankingSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRankingSystem").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRankingSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRankingSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSample  DeleteSampleRequest
     * @return DeleteSampleResponse
     */
    @Override
    public CompletableFuture<DeleteSampleResponse> deleteSample(DeleteSampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSample").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/samples/{sampleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of DeleteScene  DeleteSceneRequest
     * @return DeleteSceneResponse
     */
    @Override
    public CompletableFuture<DeleteSceneResponse> deleteScene(DeleteSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteScene").setMethod(HttpMethod.DELETE).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployRankingSystem  DeployRankingSystemRequest
     * @return DeployRankingSystemResponse
     */
    @Override
    public CompletableFuture<DeployRankingSystemResponse> deployRankingSystem(DeployRankingSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeployRankingSystem").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems/{name}/actions/deploy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployRankingSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployRankingSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBaseExperiment  DescribeBaseExperimentRequest
     * @return DescribeBaseExperimentResponse
     */
    @Override
    public CompletableFuture<DescribeBaseExperimentResponse> describeBaseExperiment(DescribeBaseExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeBaseExperiment").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/base-experiment").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBaseExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBaseExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCustomAnalysisTask  DescribeCustomAnalysisTaskRequest
     * @return DescribeCustomAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<DescribeCustomAnalysisTaskResponse> describeCustomAnalysisTask(DescribeCustomAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeCustomAnalysisTask").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/dashboard/custom-analysis-tasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDataSetMessage  DescribeDataSetMessageRequest
     * @return DescribeDataSetMessageResponse
     */
    @Override
    public CompletableFuture<DescribeDataSetMessageResponse> describeDataSetMessage(DescribeDataSetMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeDataSetMessage").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/dataSets/{versionId}/messages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDataSetMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDataSetMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDefaultAlgorithms  DescribeDefaultAlgorithmsRequest
     * @return DescribeDefaultAlgorithmsResponse
     */
    @Override
    public CompletableFuture<DescribeDefaultAlgorithmsResponse> describeDefaultAlgorithms(DescribeDefaultAlgorithmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeDefaultAlgorithms").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/default-algorithms").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDefaultAlgorithmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDefaultAlgorithmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExperiment  DescribeExperimentRequest
     * @return DescribeExperimentResponse
     */
    @Override
    public CompletableFuture<DescribeExperimentResponse> describeExperiment(DescribeExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeExperiment").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiments/{experimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExperimentEnv  DescribeExperimentEnvRequest
     * @return DescribeExperimentEnvResponse
     */
    @Override
    public CompletableFuture<DescribeExperimentEnvResponse> describeExperimentEnv(DescribeExperimentEnvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeExperimentEnv").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiment-env").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExperimentEnvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExperimentEnvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExperimentEnvProgress  DescribeExperimentEnvProgressRequest
     * @return DescribeExperimentEnvProgressResponse
     */
    @Override
    public CompletableFuture<DescribeExperimentEnvProgressResponse> describeExperimentEnvProgress(DescribeExperimentEnvProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeExperimentEnvProgress").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiment-progress").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExperimentEnvProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExperimentEnvProgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFilteringAlgorithm  DescribeFilteringAlgorithmRequest
     * @return DescribeFilteringAlgorithmResponse
     */
    @Override
    public CompletableFuture<DescribeFilteringAlgorithmResponse> describeFilteringAlgorithm(DescribeFilteringAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeFilteringAlgorithm").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms/{algorithmId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFilteringAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFilteringAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeInstance").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLatestTask  DescribeLatestTaskRequest
     * @return DescribeLatestTaskResponse
     */
    @Override
    public CompletableFuture<DescribeLatestTaskResponse> describeLatestTask(DescribeLatestTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeLatestTask").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms/{algorithmId}/tasks/latest").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLatestTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLatestTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeQuota  DescribeQuotaRequest
     * @return DescribeQuotaResponse
     */
    @Override
    public CompletableFuture<DescribeQuotaResponse> describeQuota(DescribeQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeQuota").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/quota").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeRegions").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/configurations/regions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRule  DescribeRuleRequest
     * @return DescribeRuleResponse
     */
    @Override
    public CompletableFuture<DescribeRuleResponse> describeRule(DescribeRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeRule").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/rules/{ruleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of DescribeScene  DescribeSceneRequest
     * @return DescribeSceneResponse
     */
    @Override
    public CompletableFuture<DescribeSceneResponse> describeScene(DescribeSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeScene").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSceneBucket  DescribeSceneBucketRequest
     * @return DescribeSceneBucketResponse
     */
    @Override
    public CompletableFuture<DescribeSceneBucketResponse> describeSceneBucket(DescribeSceneBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSceneBucket").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiment-bucket").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSceneBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSceneBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><strong>null</strong></p>
     * 
     * @param request the request parameters of DescribeSceneThroughput  DescribeSceneThroughputRequest
     * @return DescribeSceneThroughputResponse
     */
    @Override
    public CompletableFuture<DescribeSceneThroughputResponse> describeSceneThroughput(DescribeSceneThroughputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSceneThroughput").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/throughput").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSceneThroughputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSceneThroughputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSyncReportDetail  DescribeSyncReportDetailRequest
     * @return DescribeSyncReportDetailResponse
     */
    @Override
    public CompletableFuture<DescribeSyncReportDetailResponse> describeSyncReportDetail(DescribeSyncReportDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSyncReportDetail").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/sync-reports/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSyncReportDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSyncReportDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSyncReportOutliers  DescribeSyncReportOutliersRequest
     * @return DescribeSyncReportOutliersResponse
     */
    @Override
    public CompletableFuture<DescribeSyncReportOutliersResponse> describeSyncReportOutliers(DescribeSyncReportOutliersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSyncReportOutliers").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/sync-reports/outliers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSyncReportOutliersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSyncReportOutliersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserMetrics  DescribeUserMetricsRequest
     * @return DescribeUserMetricsResponse
     */
    @Override
    public CompletableFuture<DescribeUserMetricsResponse> describeUserMetrics(DescribeUserMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeUserMetrics").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The returned results.</p>
     * 
     * @param request the request parameters of DowngradeInstance  DowngradeInstanceRequest
     * @return DowngradeInstanceResponse
     */
    @Override
    public CompletableFuture<DowngradeInstanceResponse> downgradeInstance(DowngradeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DowngradeInstance").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/actions/downgrade").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DowngradeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DowngradeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableExperiment  EnableExperimentRequest
     * @return EnableExperimentResponse
     */
    @Override
    public CompletableFuture<EnableExperimentResponse> enableExperiment(EnableExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableExperiment").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/actions/enable-experiment").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateSample  GenerateSampleRequest
     * @return GenerateSampleResponse
     */
    @Override
    public CompletableFuture<GenerateSampleResponse> generateSample(GenerateSampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateSample").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/samples/{sampleId}/actions/generate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateSampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateSampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExtraDataSource  GetExtraDataSourceRequest
     * @return GetExtraDataSourceResponse
     */
    @Override
    public CompletableFuture<GetExtraDataSourceResponse> getExtraDataSource(GetExtraDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExtraDataSource").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/extra-data-sources/{type}/{dataSourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExtraDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExtraDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFlowControlTask  GetFlowControlTaskRequest
     * @return GetFlowControlTaskResponse
     */
    @Override
    public CompletableFuture<GetFlowControlTaskResponse> getFlowControlTask(GetFlowControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFlowControlTask").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFlowControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFlowControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLatestDataDiagnoseTaskStatus  GetLatestDataDiagnoseTaskStatusRequest
     * @return GetLatestDataDiagnoseTaskStatusResponse
     */
    @Override
    public CompletableFuture<GetLatestDataDiagnoseTaskStatusResponse> getLatestDataDiagnoseTaskStatus(GetLatestDataDiagnoseTaskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLatestDataDiagnoseTaskStatus").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/data-diagnose-task/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLatestDataDiagnoseTaskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLatestDataDiagnoseTaskStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRankingModelTemplate  GetRankingModelTemplateRequest
     * @return GetRankingModelTemplateResponse
     */
    @Override
    public CompletableFuture<GetRankingModelTemplateResponse> getRankingModelTemplate(GetRankingModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRankingModelTemplate").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-model-templates/{templateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRankingModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRankingModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRankingModelVersion  GetRankingModelVersionRequest
     * @return GetRankingModelVersionResponse
     */
    @Override
    public CompletableFuture<GetRankingModelVersionResponse> getRankingModelVersion(GetRankingModelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRankingModelVersion").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-model-versions/{versionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRankingModelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRankingModelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRankingSystem  GetRankingSystemRequest
     * @return GetRankingSystemResponse
     */
    @Override
    public CompletableFuture<GetRankingSystemResponse> getRankingSystem(GetRankingSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRankingSystem").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRankingSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRankingSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRankingSystemHistory  GetRankingSystemHistoryRequest
     * @return GetRankingSystemHistoryResponse
     */
    @Override
    public CompletableFuture<GetRankingSystemHistoryResponse> getRankingSystemHistory(GetRankingSystemHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRankingSystemHistory").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems/{name}/histories/{operateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRankingSystemHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRankingSystemHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSample  GetSampleRequest
     * @return GetSampleResponse
     */
    @Override
    public CompletableFuture<GetSampleResponse> getSample(GetSampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSample").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/samples/{sampleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InitComputingResource  InitComputingResourceRequest
     * @return InitComputingResourceResponse
     */
    @Override
    public CompletableFuture<InitComputingResourceResponse> initComputingResource(InitComputingResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InitComputingResource").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/computing-resources/actions/init").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitComputingResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitComputingResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDashboardDetails  ListDashboardDetailsRequest
     * @return ListDashboardDetailsResponse
     */
    @Override
    public CompletableFuture<ListDashboardDetailsResponse> listDashboardDetails(ListDashboardDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDashboardDetails").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/dashboard/details").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDashboardDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDashboardDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDashboardDetailsFlows  ListDashboardDetailsFlowsRequest
     * @return ListDashboardDetailsFlowsResponse
     */
    @Override
    public CompletableFuture<ListDashboardDetailsFlowsResponse> listDashboardDetailsFlows(ListDashboardDetailsFlowsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDashboardDetailsFlows").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/dashboard/details/flows").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDashboardDetailsFlowsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDashboardDetailsFlowsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDashboardMetrics  ListDashboardMetricsRequest
     * @return ListDashboardMetricsResponse
     */
    @Override
    public CompletableFuture<ListDashboardMetricsResponse> listDashboardMetrics(ListDashboardMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDashboardMetrics").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/dashboard/metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDashboardMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDashboardMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDashboardMetricsFlows  ListDashboardMetricsFlowsRequest
     * @return ListDashboardMetricsFlowsResponse
     */
    @Override
    public CompletableFuture<ListDashboardMetricsFlowsResponse> listDashboardMetricsFlows(ListDashboardMetricsFlowsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDashboardMetricsFlows").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/dashboard/metrics/flows").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDashboardMetricsFlowsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDashboardMetricsFlowsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataDiagnoseReports  ListDataDiagnoseReportsRequest
     * @return ListDataDiagnoseReportsResponse
     */
    @Override
    public CompletableFuture<ListDataDiagnoseReportsResponse> listDataDiagnoseReports(ListDataDiagnoseReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataDiagnoseReports").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/data-diagnose-reports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataDiagnoseReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataDiagnoseReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataDiagnoseSampleDetails  ListDataDiagnoseSampleDetailsRequest
     * @return ListDataDiagnoseSampleDetailsResponse
     */
    @Override
    public CompletableFuture<ListDataDiagnoseSampleDetailsResponse> listDataDiagnoseSampleDetails(ListDataDiagnoseSampleDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataDiagnoseSampleDetails").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/data-diagnose-reports/sample-details").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataDiagnoseSampleDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataDiagnoseSampleDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataSet  ListDataSetRequest
     * @return ListDataSetResponse
     */
    @Override
    public CompletableFuture<ListDataSetResponse> listDataSet(ListDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataSet").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/dataSets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataSource  ListDataSourceRequest
     * @return ListDataSourceResponse
     */
    @Override
    public CompletableFuture<ListDataSourceResponse> listDataSource(ListDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataSource").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/dataSources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExperiments  ListExperimentsRequest
     * @return ListExperimentsResponse
     */
    @Override
    public CompletableFuture<ListExperimentsResponse> listExperiments(ListExperimentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExperiments").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExperimentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExperimentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExtraDataSources  ListExtraDataSourcesRequest
     * @return ListExtraDataSourcesResponse
     */
    @Override
    public CompletableFuture<ListExtraDataSourcesResponse> listExtraDataSources(ListExtraDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExtraDataSources").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/extra-data-sources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExtraDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExtraDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureTables  ListFeatureTablesRequest
     * @return ListFeatureTablesResponse
     */
    @Override
    public CompletableFuture<ListFeatureTablesResponse> listFeatureTables(ListFeatureTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureTables").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/feature-tables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFilteringAlgorithms  ListFilteringAlgorithmsRequest
     * @return ListFilteringAlgorithmsResponse
     */
    @Override
    public CompletableFuture<ListFilteringAlgorithmsResponse> listFilteringAlgorithms(ListFilteringAlgorithmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFilteringAlgorithms").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFilteringAlgorithmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFilteringAlgorithmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlowControlTask  ListFlowControlTaskRequest
     * @return ListFlowControlTaskResponse
     */
    @Override
    public CompletableFuture<ListFlowControlTaskResponse> listFlowControlTask(ListFlowControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFlowControlTask").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlowControlTaskInvalidItems  ListFlowControlTaskInvalidItemsRequest
     * @return ListFlowControlTaskInvalidItemsResponse
     */
    @Override
    public CompletableFuture<ListFlowControlTaskInvalidItemsResponse> listFlowControlTaskInvalidItems(ListFlowControlTaskInvalidItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFlowControlTaskInvalidItems").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}/invalidItems").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowControlTaskInvalidItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowControlTaskInvalidItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlowControlTaskItemReports  ListFlowControlTaskItemReportsRequest
     * @return ListFlowControlTaskItemReportsResponse
     */
    @Override
    public CompletableFuture<ListFlowControlTaskItemReportsResponse> listFlowControlTaskItemReports(ListFlowControlTaskItemReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFlowControlTaskItemReports").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}/itemReports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowControlTaskItemReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowControlTaskItemReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlowControlTaskItems  ListFlowControlTaskItemsRequest
     * @return ListFlowControlTaskItemsResponse
     */
    @Override
    public CompletableFuture<ListFlowControlTaskItemsResponse> listFlowControlTaskItems(ListFlowControlTaskItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFlowControlTaskItems").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}/actions/items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowControlTaskItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowControlTaskItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlowControlTaskReference  ListFlowControlTaskReferenceRequest
     * @return ListFlowControlTaskReferenceResponse
     */
    @Override
    public CompletableFuture<ListFlowControlTaskReferenceResponse> listFlowControlTaskReference(ListFlowControlTaskReferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFlowControlTaskReference").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}/reference").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowControlTaskReferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowControlTaskReferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlowControlTaskReports  ListFlowControlTaskReportsRequest
     * @return ListFlowControlTaskReportsResponse
     */
    @Override
    public CompletableFuture<ListFlowControlTaskReportsResponse> listFlowControlTaskReports(ListFlowControlTaskReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFlowControlTaskReports").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}/flowTaskReports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowControlTaskReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowControlTaskReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIndexVersions  ListIndexVersionsRequest
     * @return ListIndexVersionsResponse
     */
    @Override
    public CompletableFuture<ListIndexVersionsResponse> listIndexVersions(ListIndexVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIndexVersions").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms/{algorithmId}/index-versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIndexVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIndexVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the list of instances. The returned instances are ranked in descending order based on the values of GmtCreate. You can specify multiple request parameters. These request parameters can be used to filter query results. The request parameters that you specify have logical AND relations. Only the specified parameters can be used to filter query results.</p>
     * 
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    @Override
    public CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstance").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceTask  ListInstanceTaskRequest
     * @return ListInstanceTaskResponse
     */
    @Override
    public CompletableFuture<ListInstanceTaskResponse> listInstanceTask(ListInstanceTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceTask").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListItems  ListItemsRequest
     * @return ListItemsResponse
     */
    @Override
    public CompletableFuture<ListItemsResponse> listItems(ListItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListItems").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/items/actions/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLogs  ListLogsRequest
     * @return ListLogsResponse
     */
    @Override
    public CompletableFuture<ListLogsResponse> listLogs(ListLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogs").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMixCategories  ListMixCategoriesRequest
     * @return ListMixCategoriesResponse
     */
    @Override
    public CompletableFuture<ListMixCategoriesResponse> listMixCategories(ListMixCategoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMixCategories").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/configurations/mixCategories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMixCategoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMixCategoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOfflineStorages  ListOfflineStoragesRequest
     * @return ListOfflineStoragesResponse
     */
    @Override
    public CompletableFuture<ListOfflineStoragesResponse> listOfflineStorages(ListOfflineStoragesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOfflineStorages").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/[instanceId]/offlineStorages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOfflineStoragesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOfflineStoragesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRankingModelTemplates  ListRankingModelTemplatesRequest
     * @return ListRankingModelTemplatesResponse
     */
    @Override
    public CompletableFuture<ListRankingModelTemplatesResponse> listRankingModelTemplates(ListRankingModelTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRankingModelTemplates").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-model-templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRankingModelTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRankingModelTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRankingModelVersions  ListRankingModelVersionsRequest
     * @return ListRankingModelVersionsResponse
     */
    @Override
    public CompletableFuture<ListRankingModelVersionsResponse> listRankingModelVersions(ListRankingModelVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRankingModelVersions").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-model-versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRankingModelVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRankingModelVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRankingModels  ListRankingModelsRequest
     * @return ListRankingModelsResponse
     */
    @Override
    public CompletableFuture<ListRankingModelsResponse> listRankingModels(ListRankingModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRankingModels").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRankingModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRankingModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRankingSystemHistories  ListRankingSystemHistoriesRequest
     * @return ListRankingSystemHistoriesResponse
     */
    @Override
    public CompletableFuture<ListRankingSystemHistoriesResponse> listRankingSystemHistories(ListRankingSystemHistoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRankingSystemHistories").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems/{name}/histories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRankingSystemHistoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRankingSystemHistoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRankingSystems  ListRankingSystemsRequest
     * @return ListRankingSystemsResponse
     */
    @Override
    public CompletableFuture<ListRankingSystemsResponse> listRankingSystems(ListRankingSystemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRankingSystems").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRankingSystemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRankingSystemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRuleConditions  ListRuleConditionsRequest
     * @return ListRuleConditionsResponse
     */
    @Override
    public CompletableFuture<ListRuleConditionsResponse> listRuleConditions(ListRuleConditionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRuleConditions").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/rule-conditions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRuleConditionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRuleConditionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRuleTasks  ListRuleTasksRequest
     * @return ListRuleTasksResponse
     */
    @Override
    public CompletableFuture<ListRuleTasksResponse> listRuleTasks(ListRuleTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRuleTasks").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/rule-tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRuleTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRuleTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRules  ListRulesRequest
     * @return ListRulesResponse
     */
    @Override
    public CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRules").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSampleFormatConfigs  ListSampleFormatConfigsRequest
     * @return ListSampleFormatConfigsResponse
     */
    @Override
    public CompletableFuture<ListSampleFormatConfigsResponse> listSampleFormatConfigs(ListSampleFormatConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSampleFormatConfigs").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/samples/{sampleId}/format-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSampleFormatConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSampleFormatConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSamples  ListSamplesRequest
     * @return ListSamplesResponse
     */
    @Override
    public CompletableFuture<ListSamplesResponse> listSamples(ListSamplesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSamples").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/samples").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSamplesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSamplesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of ListSceneItems  ListSceneItemsRequest
     * @return ListSceneItemsResponse
     */
    @Override
    public CompletableFuture<ListSceneItemsResponse> listSceneItems(ListSceneItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSceneItems").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSceneItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSceneItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSceneParameters  ListSceneParametersRequest
     * @return ListSceneParametersResponse
     */
    @Override
    public CompletableFuture<ListSceneParametersResponse> listSceneParameters(ListSceneParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSceneParameters").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/dashboard/scene-parameters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSceneParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSceneParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. Go to the Scenario Building page in the AIRec console to manage scenes.</p>
     * 
     * @param request the request parameters of ListScenes  ListScenesRequest
     * @return ListScenesResponse
     */
    @Override
    public CompletableFuture<ListScenesResponse> listScenes(ListScenesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListScenes").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/scenes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListScenesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListScenesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUmengAppkeys  ListUmengAppkeysRequest
     * @return ListUmengAppkeysResponse
     */
    @Override
    public CompletableFuture<ListUmengAppkeysResponse> listUmengAppkeys(ListUmengAppkeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUmengAppkeys").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/umeng/appkeys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUmengAppkeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUmengAppkeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserClusters  ListUserClustersRequest
     * @return ListUserClustersResponse
     */
    @Override
    public CompletableFuture<ListUserClustersResponse> listUserClusters(ListUserClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserClusters").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/user-clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDataSource  ModifyDataSourceRequest
     * @return ModifyDataSourceResponse
     */
    @Override
    public CompletableFuture<ModifyDataSourceResponse> modifyDataSource(ModifyDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyDataSource").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/dataSources/{tableName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyFeatureTable  ModifyFeatureTableRequest
     * @return ModifyFeatureTableResponse
     */
    @Override
    public CompletableFuture<ModifyFeatureTableResponse> modifyFeatureTable(ModifyFeatureTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyFeatureTable").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/feature-tables/{type}/{featureTableId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFeatureTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFeatureTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The name of the filtering algorithm.</p>
     * 
     * @param request the request parameters of ModifyFilteringAlgorithmMeta  ModifyFilteringAlgorithmMetaRequest
     * @return ModifyFilteringAlgorithmMetaResponse
     */
    @Override
    public CompletableFuture<ModifyFilteringAlgorithmMetaResponse> modifyFilteringAlgorithmMeta(ModifyFilteringAlgorithmMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyFilteringAlgorithmMeta").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms/{algorithmId}/meta").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFilteringAlgorithmMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFilteringAlgorithmMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyFlowControlTask  ModifyFlowControlTaskRequest
     * @return ModifyFlowControlTaskResponse
     */
    @Override
    public CompletableFuture<ModifyFlowControlTaskResponse> modifyFlowControlTask(ModifyFlowControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyFlowControlTask").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFlowControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFlowControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyInstance").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyItems  ModifyItemsRequest
     * @return ModifyItemsResponse
     */
    @Override
    public CompletableFuture<ModifyItemsResponse> modifyItems(ModifyItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyItems").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyOfflineStorages  ModifyOfflineStoragesRequest
     * @return ModifyOfflineStoragesResponse
     */
    @Override
    public CompletableFuture<ModifyOfflineStoragesResponse> modifyOfflineStorages(ModifyOfflineStoragesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyOfflineStorages").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/[instanceId]/offlineStorages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyOfflineStoragesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyOfflineStoragesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRankingModel  ModifyRankingModelRequest
     * @return ModifyRankingModelResponse
     */
    @Override
    public CompletableFuture<ModifyRankingModelResponse> modifyRankingModel(ModifyRankingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyRankingModel").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-models/{rankingModelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRankingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRankingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRankingModelTemplate  ModifyRankingModelTemplateRequest
     * @return ModifyRankingModelTemplateResponse
     */
    @Override
    public CompletableFuture<ModifyRankingModelTemplateResponse> modifyRankingModelTemplate(ModifyRankingModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyRankingModelTemplate").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-model-templates/{templateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRankingModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRankingModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRankingSystem  ModifyRankingSystemRequest
     * @return ModifyRankingSystemResponse
     */
    @Override
    public CompletableFuture<ModifyRankingSystemResponse> modifyRankingSystem(ModifyRankingSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyRankingSystem").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRankingSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRankingSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRule  ModifyRuleRequest
     * @return ModifyRuleResponse
     */
    @Override
    public CompletableFuture<ModifyRuleResponse> modifyRule(ModifyRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyRule").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/rules/{ruleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySample  ModifySampleRequest
     * @return ModifySampleResponse
     */
    @Override
    public CompletableFuture<ModifySampleResponse> modifySample(ModifySampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifySample").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/samples/{sampleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of ModifyScene  ModifySceneRequest
     * @return ModifySceneResponse
     */
    @Override
    public CompletableFuture<ModifySceneResponse> modifyScene(ModifySceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyScene").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OfflineFilteringAlgorithm  OfflineFilteringAlgorithmRequest
     * @return OfflineFilteringAlgorithmResponse
     */
    @Override
    public CompletableFuture<OfflineFilteringAlgorithmResponse> offlineFilteringAlgorithm(OfflineFilteringAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineFilteringAlgorithm").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms/{algorithmId}/actions/offline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineFilteringAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineFilteringAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishFlowControlTask  PublishFlowControlTaskRequest
     * @return PublishFlowControlTaskResponse
     */
    @Override
    public CompletableFuture<PublishFlowControlTaskResponse> publishFlowControlTask(PublishFlowControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishFlowControlTask").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}/actions/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishFlowControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishFlowControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishRule  PublishRuleRequest
     * @return PublishRuleResponse
     */
    @Override
    public CompletableFuture<PublishRuleResponse> publishRule(PublishRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishRule").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/rules/{ruleId}/actions/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushColdStartDocument  PushColdStartDocumentRequest
     * @return PushColdStartDocumentResponse
     */
    @Override
    public CompletableFuture<PushColdStartDocumentResponse> pushColdStartDocument(PushColdStartDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushColdStartDocument").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/cold-start/{instanceId}/tables/{tableName}/actions/bulk").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushColdStartDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushColdStartDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushDocument  PushDocumentRequest
     * @return PushDocumentResponse
     */
    @Override
    public CompletableFuture<PushDocumentResponse> pushDocument(PushDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushDocument").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/tables/{tableName}/actions/bulk").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushIntervention  PushInterventionRequest
     * @return PushInterventionResponse
     */
    @Override
    public CompletableFuture<PushInterventionResponse> pushIntervention(PushInterventionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushIntervention").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/actions/intervene").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushInterventionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushInterventionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDataMessage  QueryDataMessageRequest
     * @return QueryDataMessageResponse
     */
    @Override
    public CompletableFuture<QueryDataMessageResponse> queryDataMessage(QueryDataMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryDataMessage").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/tables/{table}/data-message").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDataMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDataMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query statistics on update messages in a specified data table of a specified instance.</p>
     * 
     * @param request the request parameters of QueryDataMessageStatistics  QueryDataMessageStatisticsRequest
     * @return QueryDataMessageStatisticsResponse
     */
    @Override
    public CompletableFuture<QueryDataMessageStatisticsResponse> queryDataMessageStatistics(QueryDataMessageStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryDataMessageStatistics").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/tables/{table}/data-message-statistics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDataMessageStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDataMessageStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryExceptionHistory  QueryExceptionHistoryRequest
     * @return QueryExceptionHistoryResponse
     */
    @Override
    public CompletableFuture<QueryExceptionHistoryResponse> queryExceptionHistory(QueryExceptionHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryExceptionHistory").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/sync-reports/exception-history").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryExceptionHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryExceptionHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query raw data in a specific data table of an instance by using the primary key. The returned results need to be confirmed by customers.</p>
     * 
     * @param request the request parameters of QueryRawData  QueryRawDataRequest
     * @return QueryRawDataResponse
     */
    @Override
    public CompletableFuture<QueryRawDataResponse> queryRawData(QueryRawDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryRawData").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/tables/{table}/raw-data").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRawDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRawDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySingleAggregationReport  QuerySingleAggregationReportRequest
     * @return QuerySingleAggregationReportResponse
     */
    @Override
    public CompletableFuture<QuerySingleAggregationReportResponse> querySingleAggregationReport(QuerySingleAggregationReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySingleAggregationReport").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/sync-reports/single-aggregation-report").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySingleAggregationReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySingleAggregationReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySingleReport  QuerySingleReportRequest
     * @return QuerySingleReportResponse
     */
    @Override
    public CompletableFuture<QuerySingleReportResponse> querySingleReport(QuerySingleReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySingleReport").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/sync-reports/single-report").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySingleReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySingleReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySyncReportAggregation  QuerySyncReportAggregationRequest
     * @return QuerySyncReportAggregationResponse
     */
    @Override
    public CompletableFuture<QuerySyncReportAggregationResponse> querySyncReportAggregation(QuerySyncReportAggregationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySyncReportAggregation").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/sync-reports/aggregation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySyncReportAggregationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySyncReportAggregationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RebuildIndex  RebuildIndexRequest
     * @return RebuildIndexResponse
     */
    @Override
    public CompletableFuture<RebuildIndexResponse> rebuildIndex(RebuildIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RebuildIndex").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms/{algorithmId}/actions/rebuild").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebuildIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebuildIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Recommend  RecommendRequest
     * @return RecommendResponse
     */
    @Override
    public CompletableFuture<RecommendResponse> recommend(RecommendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Recommend").setMethod(HttpMethod.GET).setPathRegex("/v2/openapi/instances/{instanceId}/actions/recommend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecommendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecommendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshFeatureTable  RefreshFeatureTableRequest
     * @return RefreshFeatureTableResponse
     */
    @Override
    public CompletableFuture<RefreshFeatureTableResponse> refreshFeatureTable(RefreshFeatureTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RefreshFeatureTable").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/feature-tables/{type}/{featureTableId}/actions/refresh").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshFeatureTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshFeatureTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RollbackRankingSystem  RollbackRankingSystemRequest
     * @return RollbackRankingSystemResponse
     */
    @Override
    public CompletableFuture<RollbackRankingSystemResponse> rollbackRankingSystem(RollbackRankingSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RollbackRankingSystem").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems/{name}/actions/rollback").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackRankingSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackRankingSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to run an instance to start a full data import task. After you call this API operation, the system creates a dataset. Then, the system imports all data from your data sources into the dataset for data training.</p>
     * 
     * @param request the request parameters of RunInstance  RunInstanceRequest
     * @return RunInstanceResponse
     */
    @Override
    public CompletableFuture<RunInstanceResponse> runInstance(RunInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunInstance").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/actions/import").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunRankingModelTemplate  RunRankingModelTemplateRequest
     * @return RunRankingModelTemplateResponse
     */
    @Override
    public CompletableFuture<RunRankingModelTemplateResponse> runRankingModelTemplate(RunRankingModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunRankingModelTemplate").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-model-templates/{templateId}/actions/run").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunRankingModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunRankingModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunSampleFormatConfig  RunSampleFormatConfigRequest
     * @return RunSampleFormatConfigResponse
     */
    @Override
    public CompletableFuture<RunSampleFormatConfigResponse> runSampleFormatConfig(RunSampleFormatConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunSampleFormatConfig").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/samples/{sampleId}/format-configs/actions/run").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunSampleFormatConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunSampleFormatConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopDataSet  StopDataSetRequest
     * @return StopDataSetResponse
     */
    @Override
    public CompletableFuture<StopDataSetResponse> stopDataSet(StopDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopDataSet").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/dataSets/{versionId}/actions/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopFlowControlTask  StopFlowControlTaskRequest
     * @return StopFlowControlTaskResponse
     */
    @Override
    public CompletableFuture<StopFlowControlTaskResponse> stopFlowControlTask(StopFlowControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopFlowControlTask").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/flowControlTasks/{taskId}/actions/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopFlowControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopFlowControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnLockIndexVersion  UnLockIndexVersionRequest
     * @return UnLockIndexVersionResponse
     */
    @Override
    public CompletableFuture<UnLockIndexVersionResponse> unLockIndexVersion(UnLockIndexVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnLockIndexVersion").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/filtering-algorithms/{algorithmId}/actions/unlock").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnLockIndexVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnLockIndexVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperimentBasicInfo  UpdateExperimentBasicInfoRequest
     * @return UpdateExperimentBasicInfoResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentBasicInfoResponse> updateExperimentBasicInfo(UpdateExperimentBasicInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperimentBasicInfo").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiments/{experimentId}/basic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentBasicInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentBasicInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperimentConfig  UpdateExperimentConfigRequest
     * @return UpdateExperimentConfigResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentConfigResponse> updateExperimentConfig(UpdateExperimentConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperimentConfig").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiments/{experimentId}/config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperimentStatus  UpdateExperimentStatusRequest
     * @return UpdateExperimentStatusResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentStatusResponse> updateExperimentStatus(UpdateExperimentStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperimentStatus").setMethod(HttpMethod.PUT).setPathRegex("/v2/openapi/instances/{instanceId}/scenes/{sceneId}/experiments/{experimentId}/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the quotas of a specified instance.
     * The limits on the number of users: 1,000,000 to 10,000,000. The limits on the number of items: 1,000,000 to 10,000,000. The limits on the queries per second (QPS) for recommendation requests: 10 to 500.</p>
     * 
     * @param request the request parameters of UpgradeInstance  UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     */
    @Override
    public CompletableFuture<UpgradeInstanceResponse> upgradeInstance(UpgradeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeInstance").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/actions/upgrade").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateInstance  ValidateInstanceRequest
     * @return ValidateInstanceResponse
     */
    @Override
    public CompletableFuture<ValidateInstanceResponse> validateInstance(ValidateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateInstance").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/actions/validate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyRankingSystem  VerifyRankingSystemRequest
     * @return VerifyRankingSystemResponse
     */
    @Override
    public CompletableFuture<VerifyRankingSystemResponse> verifyRankingSystem(VerifyRankingSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("VerifyRankingSystem").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/instances/{instanceId}/ranking-systems/{name}/actions/verify").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyRankingSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyRankingSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
