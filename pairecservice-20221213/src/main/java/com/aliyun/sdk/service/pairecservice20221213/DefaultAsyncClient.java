// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.pairecservice20221213.models.*;
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
        this.product = "PaiRecService";
        this.version = "2022-12-13";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ApplyEngineConfig  ApplyEngineConfigRequest
     * @return ApplyEngineConfigResponse
     */
    @Override
    public CompletableFuture<ApplyEngineConfigResponse> applyEngineConfig(ApplyEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyEngineConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}/action/apply").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BackflowFeatureConsistencyCheckJobData  BackflowFeatureConsistencyCheckJobDataRequest
     * @return BackflowFeatureConsistencyCheckJobDataResponse
     */
    @Override
    public CompletableFuture<BackflowFeatureConsistencyCheckJobDataResponse> backflowFeatureConsistencyCheckJobData(BackflowFeatureConsistencyCheckJobDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BackflowFeatureConsistencyCheckJobData").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobs/action/backflowdata").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BackflowFeatureConsistencyCheckJobDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BackflowFeatureConsistencyCheckJobDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckInstanceResources  CheckInstanceResourcesRequest
     * @return CheckInstanceResourcesResponse
     */
    @Override
    public CompletableFuture<CheckInstanceResourcesResponse> checkInstanceResources(CheckInstanceResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckInstanceResources").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/action/checkresources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckInstanceResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckInstanceResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckTrafficControlTaskExpression  CheckTrafficControlTaskExpressionRequest
     * @return CheckTrafficControlTaskExpressionResponse
     */
    @Override
    public CompletableFuture<CheckTrafficControlTaskExpressionResponse> checkTrafficControlTaskExpression(CheckTrafficControlTaskExpressionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckTrafficControlTaskExpression").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks/action/checkexpression").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckTrafficControlTaskExpressionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckTrafficControlTaskExpressionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneEngineConfig  CloneEngineConfigRequest
     * @return CloneEngineConfigResponse
     */
    @Override
    public CompletableFuture<CloneEngineConfigResponse> cloneEngineConfig(CloneEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneEngineConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneEngineConfigResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneExperimentGroup  CloneExperimentGroupRequest
     * @return CloneExperimentGroupResponse
     */
    @Override
    public CompletableFuture<CloneExperimentGroupResponse> cloneExperimentGroup(CloneExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneExperimentGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneFeatureConsistencyCheckJobConfig  CloneFeatureConsistencyCheckJobConfigRequest
     * @return CloneFeatureConsistencyCheckJobConfigResponse
     */
    @Override
    public CompletableFuture<CloneFeatureConsistencyCheckJobConfigResponse> cloneFeatureConsistencyCheckJobConfig(CloneFeatureConsistencyCheckJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneFeatureConsistencyCheckJobConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs/{SourceFeatureConsistencyCheckJobConfigId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneFeatureConsistencyCheckJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneFeatureConsistencyCheckJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneLaboratory  CloneLaboratoryRequest
     * @return CloneLaboratoryResponse
     */
    @Override
    public CompletableFuture<CloneLaboratoryResponse> cloneLaboratory(CloneLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneLaboratory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/laboratories/{LaboratoryId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneTrafficControlTask  CloneTrafficControlTaskRequest
     * @return CloneTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<CloneTrafficControlTaskResponse> cloneTrafficControlTask(CloneTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CompareSampleConsistencyJob  CompareSampleConsistencyJobRequest
     * @return CompareSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<CompareSampleConsistencyJobResponse> compareSampleConsistencyJob(CompareSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CompareSampleConsistencyJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}/action/compare").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompareSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompareSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateABMetric  CreateABMetricRequest
     * @return CreateABMetricResponse
     */
    @Override
    public CompletableFuture<CreateABMetricResponse> createABMetric(CreateABMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateABMetric").setMethod(HttpMethod.POST).setPathRegex("/api/v1/abmetrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateABMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateABMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateABMetricGroup  CreateABMetricGroupRequest
     * @return CreateABMetricGroupResponse
     */
    @Override
    public CompletableFuture<CreateABMetricGroupResponse> createABMetricGroup(CreateABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateABMetricGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/abmetricgroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCalculationJobs  CreateCalculationJobsRequest
     * @return CreateCalculationJobsResponse
     */
    @Override
    public CompletableFuture<CreateCalculationJobsResponse> createCalculationJobs(CreateCalculationJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCalculationJobs").setMethod(HttpMethod.POST).setPathRegex("/api/v1/batch/calculationjobs/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCalculationJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCalculationJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCrowd  CreateCrowdRequest
     * @return CreateCrowdResponse
     */
    @Override
    public CompletableFuture<CreateCrowdResponse> createCrowd(CreateCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCrowd").setMethod(HttpMethod.POST).setPathRegex("/api/v1/crowds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEngineConfig  CreateEngineConfigRequest
     * @return CreateEngineConfigResponse
     */
    @Override
    public CompletableFuture<CreateEngineConfigResponse> createEngineConfig(CreateEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateEngineConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/engineconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExperiment  CreateExperimentRequest
     * @return CreateExperimentResponse
     */
    @Override
    public CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExperimentGroup  CreateExperimentGroupRequest
     * @return CreateExperimentGroupResponse
     */
    @Override
    public CompletableFuture<CreateExperimentGroupResponse> createExperimentGroup(CreateExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExperimentGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experimentgroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFeatureConsistencyCheckJob  CreateFeatureConsistencyCheckJobRequest
     * @return CreateFeatureConsistencyCheckJobResponse
     */
    @Override
    public CompletableFuture<CreateFeatureConsistencyCheckJobResponse> createFeatureConsistencyCheckJob(CreateFeatureConsistencyCheckJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFeatureConsistencyCheckJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFeatureConsistencyCheckJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFeatureConsistencyCheckJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFeatureConsistencyCheckJobConfig  CreateFeatureConsistencyCheckJobConfigRequest
     * @return CreateFeatureConsistencyCheckJobConfigResponse
     */
    @Override
    public CompletableFuture<CreateFeatureConsistencyCheckJobConfigResponse> createFeatureConsistencyCheckJobConfig(CreateFeatureConsistencyCheckJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFeatureConsistencyCheckJobConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFeatureConsistencyCheckJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFeatureConsistencyCheckJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstanceResource  CreateInstanceResourceRequest
     * @return CreateInstanceResourceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResourceResponse> createInstanceResource(CreateInstanceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstanceResource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLaboratory  CreateLaboratoryRequest
     * @return CreateLaboratoryResponse
     */
    @Override
    public CompletableFuture<CreateLaboratoryResponse> createLaboratory(CreateLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLaboratory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/laboratories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLayer  CreateLayerRequest
     * @return CreateLayerResponse
     */
    @Override
    public CompletableFuture<CreateLayerResponse> createLayer(CreateLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLayer").setMethod(HttpMethod.POST).setPathRegex("/api/v1/layers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateParam  CreateParamRequest
     * @return CreateParamResponse
     */
    @Override
    public CompletableFuture<CreateParamResponse> createParam(CreateParamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateParam").setMethod(HttpMethod.POST).setPathRegex("/api/v1/params").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateParamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateParamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateResourceRule  CreateResourceRuleRequest
     * @return CreateResourceRuleResponse
     */
    @Override
    public CompletableFuture<CreateResourceRuleResponse> createResourceRule(CreateResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateResourceRule").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateResourceRuleItem  CreateResourceRuleItemRequest
     * @return CreateResourceRuleItemResponse
     */
    @Override
    public CompletableFuture<CreateResourceRuleItemResponse> createResourceRuleItem(CreateResourceRuleItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateResourceRuleItem").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceRuleItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceRuleItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSampleConsistencyJob  CreateSampleConsistencyJobRequest
     * @return CreateSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<CreateSampleConsistencyJobResponse> createSampleConsistencyJob(CreateSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSampleConsistencyJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/sampleconsistencyjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateScene  CreateSceneRequest
     * @return CreateSceneResponse
     */
    @Override
    public CompletableFuture<CreateSceneResponse> createScene(CreateSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateScene").setMethod(HttpMethod.POST).setPathRegex("/api/v1/scenes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSubCrowd  CreateSubCrowdRequest
     * @return CreateSubCrowdResponse
     */
    @Override
    public CompletableFuture<CreateSubCrowdResponse> createSubCrowd(CreateSubCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSubCrowd").setMethod(HttpMethod.POST).setPathRegex("/api/v1/crowds/{CrowdId}/subcrowds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSubCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSubCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTableMeta  CreateTableMetaRequest
     * @return CreateTableMetaResponse
     */
    @Override
    public CompletableFuture<CreateTableMetaResponse> createTableMeta(CreateTableMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTableMeta").setMethod(HttpMethod.POST).setPathRegex("/api/v1/tablemetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTableMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTableMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTrafficControlTarget  CreateTrafficControlTargetRequest
     * @return CreateTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<CreateTrafficControlTargetResponse> createTrafficControlTarget(CreateTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTrafficControlTarget").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltargets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTrafficControlTask  CreateTrafficControlTaskRequest
     * @return CreateTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<CreateTrafficControlTaskResponse> createTrafficControlTask(CreateTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DebugResourceRule  DebugResourceRuleRequest
     * @return DebugResourceRuleResponse
     */
    @Override
    public CompletableFuture<DebugResourceRuleResponse> debugResourceRule(DebugResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DebugResourceRule").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/action/debug").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DebugResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DebugResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteABMetric  DeleteABMetricRequest
     * @return DeleteABMetricResponse
     */
    @Override
    public CompletableFuture<DeleteABMetricResponse> deleteABMetric(DeleteABMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteABMetric").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/abmetrics/{ABMetricId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteABMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteABMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteABMetricGroup  DeleteABMetricGroupRequest
     * @return DeleteABMetricGroupResponse
     */
    @Override
    public CompletableFuture<DeleteABMetricGroupResponse> deleteABMetricGroup(DeleteABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteABMetricGroup").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/abmetricgroups/{ABMetricGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCrowd  DeleteCrowdRequest
     * @return DeleteCrowdResponse
     */
    @Override
    public CompletableFuture<DeleteCrowdResponse> deleteCrowd(DeleteCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCrowd").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/crowds/{CrowdId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEngineConfig  DeleteEngineConfigRequest
     * @return DeleteEngineConfigResponse
     */
    @Override
    public CompletableFuture<DeleteEngineConfigResponse> deleteEngineConfig(DeleteEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteEngineConfig").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEngineConfigResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExperiment").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExperimentGroup  DeleteExperimentGroupRequest
     * @return DeleteExperimentGroupResponse
     */
    @Override
    public CompletableFuture<DeleteExperimentGroupResponse> deleteExperimentGroup(DeleteExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExperimentGroup").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstanceResource  DeleteInstanceResourceRequest
     * @return DeleteInstanceResourceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResourceResponse> deleteInstanceResource(DeleteInstanceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstanceResource").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLaboratory  DeleteLaboratoryRequest
     * @return DeleteLaboratoryResponse
     */
    @Override
    public CompletableFuture<DeleteLaboratoryResponse> deleteLaboratory(DeleteLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLaboratory").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/laboratories/{LaboratoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLayer  DeleteLayerRequest
     * @return DeleteLayerResponse
     */
    @Override
    public CompletableFuture<DeleteLayerResponse> deleteLayer(DeleteLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLayer").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/layers/{LayerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteParam  DeleteParamRequest
     * @return DeleteParamResponse
     */
    @Override
    public CompletableFuture<DeleteParamResponse> deleteParam(DeleteParamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteParam").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/params/{ParamId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteParamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteParamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteResourceRule  DeleteResourceRuleRequest
     * @return DeleteResourceRuleResponse
     */
    @Override
    public CompletableFuture<DeleteResourceRuleResponse> deleteResourceRule(DeleteResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResourceRule").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteResourceRuleItem  DeleteResourceRuleItemRequest
     * @return DeleteResourceRuleItemResponse
     */
    @Override
    public CompletableFuture<DeleteResourceRuleItemResponse> deleteResourceRuleItem(DeleteResourceRuleItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResourceRuleItem").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/items/{ResourceRuleItemId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceRuleItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceRuleItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSampleConsistencyJob  DeleteSampleConsistencyJobRequest
     * @return DeleteSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<DeleteSampleConsistencyJobResponse> deleteSampleConsistencyJob(DeleteSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSampleConsistencyJob").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteScene  DeleteSceneRequest
     * @return DeleteSceneResponse
     */
    @Override
    public CompletableFuture<DeleteSceneResponse> deleteScene(DeleteSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteScene").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/scenes/{SceneId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSubCrowd  DeleteSubCrowdRequest
     * @return DeleteSubCrowdResponse
     */
    @Override
    public CompletableFuture<DeleteSubCrowdResponse> deleteSubCrowd(DeleteSubCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSubCrowd").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/crowds/{CrowdId}/subcrowds/{SubCrowdId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSubCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSubCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTableMeta  DeleteTableMetaRequest
     * @return DeleteTableMetaResponse
     */
    @Override
    public CompletableFuture<DeleteTableMetaResponse> deleteTableMeta(DeleteTableMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTableMeta").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/tablemetas/{TableMetaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTableMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTableMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTrafficControlTarget  DeleteTrafficControlTargetRequest
     * @return DeleteTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<DeleteTrafficControlTargetResponse> deleteTrafficControlTarget(DeleteTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTrafficControlTarget").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTrafficControlTask  DeleteTrafficControlTaskRequest
     * @return DeleteTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<DeleteTrafficControlTaskResponse> deleteTrafficControlTask(DeleteTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTrafficControlTask").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateAlgorithmCustomizationScript  GenerateAlgorithmCustomizationScriptRequest
     * @return GenerateAlgorithmCustomizationScriptResponse
     */
    @Override
    public CompletableFuture<GenerateAlgorithmCustomizationScriptResponse> generateAlgorithmCustomizationScript(GenerateAlgorithmCustomizationScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateAlgorithmCustomizationScript").setMethod(HttpMethod.POST).setPathRegex("/api/v1/algorithmcustomizations/{AlgorithmCustomizationId}/action/generatescript").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateAlgorithmCustomizationScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateAlgorithmCustomizationScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateTrafficControlTaskCode  GenerateTrafficControlTaskCodeRequest
     * @return GenerateTrafficControlTaskCodeResponse
     */
    @Override
    public CompletableFuture<GenerateTrafficControlTaskCodeResponse> generateTrafficControlTaskCode(GenerateTrafficControlTaskCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateTrafficControlTaskCode").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/generatecode").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateTrafficControlTaskCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateTrafficControlTaskCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateTrafficControlTaskConfig  GenerateTrafficControlTaskConfigRequest
     * @return GenerateTrafficControlTaskConfigResponse
     */
    @Override
    public CompletableFuture<GenerateTrafficControlTaskConfigResponse> generateTrafficControlTaskConfig(GenerateTrafficControlTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateTrafficControlTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/generateconfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateTrafficControlTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateTrafficControlTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetABMetric  GetABMetricRequest
     * @return GetABMetricResponse
     */
    @Override
    public CompletableFuture<GetABMetricResponse> getABMetric(GetABMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetABMetric").setMethod(HttpMethod.GET).setPathRegex("/api/v1/abmetrics/{ABMetricId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetABMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetABMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetABMetricGroup  GetABMetricGroupRequest
     * @return GetABMetricGroupResponse
     */
    @Override
    public CompletableFuture<GetABMetricGroupResponse> getABMetricGroup(GetABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetABMetricGroup").setMethod(HttpMethod.GET).setPathRegex("/api/v1/abmetricgroups/{ABMetricGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCalculationJob  GetCalculationJobRequest
     * @return GetCalculationJobResponse
     */
    @Override
    public CompletableFuture<GetCalculationJobResponse> getCalculationJob(GetCalculationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCalculationJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/calculationjobs/{CalculationJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCalculationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCalculationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEngineConfig  GetEngineConfigRequest
     * @return GetEngineConfigResponse
     */
    @Override
    public CompletableFuture<GetEngineConfigResponse> getEngineConfig(GetEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEngineConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperiment  GetExperimentRequest
     * @return GetExperimentResponse
     */
    @Override
    public CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperiment").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperimentGroup  GetExperimentGroupRequest
     * @return GetExperimentGroupResponse
     */
    @Override
    public CompletableFuture<GetExperimentGroupResponse> getExperimentGroup(GetExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperimentGroup").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFeatureConsistencyCheckJob  GetFeatureConsistencyCheckJobRequest
     * @return GetFeatureConsistencyCheckJobResponse
     */
    @Override
    public CompletableFuture<GetFeatureConsistencyCheckJobResponse> getFeatureConsistencyCheckJob(GetFeatureConsistencyCheckJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFeatureConsistencyCheckJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobs/{FeatureConsistencyCheckJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFeatureConsistencyCheckJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFeatureConsistencyCheckJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFeatureConsistencyCheckJobConfig  GetFeatureConsistencyCheckJobConfigRequest
     * @return GetFeatureConsistencyCheckJobConfigResponse
     */
    @Override
    public CompletableFuture<GetFeatureConsistencyCheckJobConfigResponse> getFeatureConsistencyCheckJobConfig(GetFeatureConsistencyCheckJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFeatureConsistencyCheckJobConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs/{FeatureConsistencyCheckJobConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFeatureConsistencyCheckJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFeatureConsistencyCheckJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    @Override
    public CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstance").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceResource  GetInstanceResourceRequest
     * @return GetInstanceResourceResponse
     */
    @Override
    public CompletableFuture<GetInstanceResourceResponse> getInstanceResource(GetInstanceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceResource").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceResourceTable  GetInstanceResourceTableRequest
     * @return GetInstanceResourceTableResponse
     */
    @Override
    public CompletableFuture<GetInstanceResourceTableResponse> getInstanceResourceTable(GetInstanceResourceTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceResourceTable").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}/tables/{TableName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResourceTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResourceTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLaboratory  GetLaboratoryRequest
     * @return GetLaboratoryResponse
     */
    @Override
    public CompletableFuture<GetLaboratoryResponse> getLaboratory(GetLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLaboratory").setMethod(HttpMethod.GET).setPathRegex("/api/v1/laboratories/{LaboratoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLayer  GetLayerRequest
     * @return GetLayerResponse
     */
    @Override
    public CompletableFuture<GetLayerResponse> getLayer(GetLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLayer").setMethod(HttpMethod.GET).setPathRegex("/api/v1/layers/{LayerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceRule  GetResourceRuleRequest
     * @return GetResourceRuleResponse
     */
    @Override
    public CompletableFuture<GetResourceRuleResponse> getResourceRule(GetResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceRule").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSampleConsistencyJob  GetSampleConsistencyJobRequest
     * @return GetSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<GetSampleConsistencyJobResponse> getSampleConsistencyJob(GetSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSampleConsistencyJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScene  GetSceneRequest
     * @return GetSceneResponse
     */
    @Override
    public CompletableFuture<GetSceneResponse> getScene(GetSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScene").setMethod(HttpMethod.GET).setPathRegex("/api/v1/scenes/{SceneId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSubCrowd  GetSubCrowdRequest
     * @return GetSubCrowdResponse
     */
    @Override
    public CompletableFuture<GetSubCrowdResponse> getSubCrowd(GetSubCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSubCrowd").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crowds/{CrowdId}/subcrowds/{SubCrowdId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSubCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSubCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTableMeta  GetTableMetaRequest
     * @return GetTableMetaResponse
     */
    @Override
    public CompletableFuture<GetTableMetaResponse> getTableMeta(GetTableMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTableMeta").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tablemetas/{TableMetaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTableMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTableMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrafficControlTarget  GetTrafficControlTargetRequest
     * @return GetTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<GetTrafficControlTargetResponse> getTrafficControlTarget(GetTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrafficControlTarget").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrafficControlTask  GetTrafficControlTaskRequest
     * @return GetTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<GetTrafficControlTaskResponse> getTrafficControlTask(GetTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrafficControlTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrafficControlTaskTraffic  GetTrafficControlTaskTrafficRequest
     * @return GetTrafficControlTaskTrafficResponse
     */
    @Override
    public CompletableFuture<GetTrafficControlTaskTrafficResponse> getTrafficControlTaskTraffic(GetTrafficControlTaskTrafficRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrafficControlTaskTraffic").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/trafficinfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrafficControlTaskTrafficResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrafficControlTaskTrafficResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListABMetricGroups  ListABMetricGroupsRequest
     * @return ListABMetricGroupsResponse
     */
    @Override
    public CompletableFuture<ListABMetricGroupsResponse> listABMetricGroups(ListABMetricGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListABMetricGroups").setMethod(HttpMethod.GET).setPathRegex("/api/v1/abmetricgroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListABMetricGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListABMetricGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListABMetrics  ListABMetricsRequest
     * @return ListABMetricsResponse
     */
    @Override
    public CompletableFuture<ListABMetricsResponse> listABMetrics(ListABMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListABMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/abmetrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListABMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListABMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCalculationJobs  ListCalculationJobsRequest
     * @return ListCalculationJobsResponse
     */
    @Override
    public CompletableFuture<ListCalculationJobsResponse> listCalculationJobs(ListCalculationJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCalculationJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/calculationjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCalculationJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCalculationJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCrowdUsers  ListCrowdUsersRequest
     * @return ListCrowdUsersResponse
     */
    @Override
    public CompletableFuture<ListCrowdUsersResponse> listCrowdUsers(ListCrowdUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCrowdUsers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crowds/{CrowdId}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrowdUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrowdUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCrowds  ListCrowdsRequest
     * @return ListCrowdsResponse
     */
    @Override
    public CompletableFuture<ListCrowdsResponse> listCrowds(ListCrowdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCrowds").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crowds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrowdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrowdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEngineConfigs  ListEngineConfigsRequest
     * @return ListEngineConfigsResponse
     */
    @Override
    public CompletableFuture<ListEngineConfigsResponse> listEngineConfigs(ListEngineConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEngineConfigs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/engineconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEngineConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEngineConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExperimentGroups  ListExperimentGroupsRequest
     * @return ListExperimentGroupsResponse
     */
    @Override
    public CompletableFuture<ListExperimentGroupsResponse> listExperimentGroups(ListExperimentGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExperimentGroups").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experimentgroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExperimentGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExperimentGroupsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExperiments").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExperimentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExperimentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobConfigs  ListFeatureConsistencyCheckJobConfigsRequest
     * @return ListFeatureConsistencyCheckJobConfigsResponse
     */
    @Override
    public CompletableFuture<ListFeatureConsistencyCheckJobConfigsResponse> listFeatureConsistencyCheckJobConfigs(ListFeatureConsistencyCheckJobConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureConsistencyCheckJobConfigs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureConsistencyCheckJobConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureConsistencyCheckJobConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobFeatureReports  ListFeatureConsistencyCheckJobFeatureReportsRequest
     * @return ListFeatureConsistencyCheckJobFeatureReportsResponse
     */
    @Override
    public CompletableFuture<ListFeatureConsistencyCheckJobFeatureReportsResponse> listFeatureConsistencyCheckJobFeatureReports(ListFeatureConsistencyCheckJobFeatureReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureConsistencyCheckJobFeatureReports").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobs/{FeatureConsistencyCheckJobId}/featurereports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureConsistencyCheckJobFeatureReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureConsistencyCheckJobFeatureReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobScoreReports  ListFeatureConsistencyCheckJobScoreReportsRequest
     * @return ListFeatureConsistencyCheckJobScoreReportsResponse
     */
    @Override
    public CompletableFuture<ListFeatureConsistencyCheckJobScoreReportsResponse> listFeatureConsistencyCheckJobScoreReports(ListFeatureConsistencyCheckJobScoreReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureConsistencyCheckJobScoreReports").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobs/{FeatureConsistencyCheckJobId}/scorereports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureConsistencyCheckJobScoreReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureConsistencyCheckJobScoreReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobs  ListFeatureConsistencyCheckJobsRequest
     * @return ListFeatureConsistencyCheckJobsResponse
     */
    @Override
    public CompletableFuture<ListFeatureConsistencyCheckJobsResponse> listFeatureConsistencyCheckJobs(ListFeatureConsistencyCheckJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureConsistencyCheckJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureConsistencyCheckJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureConsistencyCheckJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceResources  ListInstanceResourcesRequest
     * @return ListInstanceResourcesResponse
     */
    @Override
    public CompletableFuture<ListInstanceResourcesResponse> listInstanceResources(ListInstanceResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceResources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLaboratories  ListLaboratoriesRequest
     * @return ListLaboratoriesResponse
     */
    @Override
    public CompletableFuture<ListLaboratoriesResponse> listLaboratories(ListLaboratoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLaboratories").setMethod(HttpMethod.GET).setPathRegex("/api/v1/laboratories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLaboratoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLaboratoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLayers  ListLayersRequest
     * @return ListLayersResponse
     */
    @Override
    public CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLayers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/layers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLayersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLayersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListParams  ListParamsRequest
     * @return ListParamsResponse
     */
    @Override
    public CompletableFuture<ListParamsResponse> listParams(ListParamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListParams").setMethod(HttpMethod.GET).setPathRegex("/api/v1/params").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListParamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListParamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceRules  ListResourceRulesRequest
     * @return ListResourceRulesResponse
     */
    @Override
    public CompletableFuture<ListResourceRulesResponse> listResourceRules(ListResourceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceRules").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resourcerules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSampleConsistencyJobs  ListSampleConsistencyJobsRequest
     * @return ListSampleConsistencyJobsResponse
     */
    @Override
    public CompletableFuture<ListSampleConsistencyJobsResponse> listSampleConsistencyJobs(ListSampleConsistencyJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSampleConsistencyJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/sampleconsistencyjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSampleConsistencyJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSampleConsistencyJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListScenes  ListScenesRequest
     * @return ListScenesResponse
     */
    @Override
    public CompletableFuture<ListScenesResponse> listScenes(ListScenesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListScenes").setMethod(HttpMethod.GET).setPathRegex("/api/v1/scenes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListScenesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListScenesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubCrowds  ListSubCrowdsRequest
     * @return ListSubCrowdsResponse
     */
    @Override
    public CompletableFuture<ListSubCrowdsResponse> listSubCrowds(ListSubCrowdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSubCrowds").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crowds/{CrowdId}/subcrowds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubCrowdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubCrowdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTableMetas  ListTableMetasRequest
     * @return ListTableMetasResponse
     */
    @Override
    public CompletableFuture<ListTableMetasResponse> listTableMetas(ListTableMetasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTableMetas").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tablemetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTableMetasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTableMetasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTrafficControlTargetTrafficHistory  ListTrafficControlTargetTrafficHistoryRequest
     * @return ListTrafficControlTargetTrafficHistoryResponse
     */
    @Override
    public CompletableFuture<ListTrafficControlTargetTrafficHistoryResponse> listTrafficControlTargetTrafficHistory(ListTrafficControlTargetTrafficHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrafficControlTargetTrafficHistory").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/traffichistories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrafficControlTargetTrafficHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrafficControlTargetTrafficHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTrafficControlTasks  ListTrafficControlTasksRequest
     * @return ListTrafficControlTasksResponse
     */
    @Override
    public CompletableFuture<ListTrafficControlTasksResponse> listTrafficControlTasks(ListTrafficControlTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrafficControlTasks").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrafficControlTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrafficControlTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OfflineExperiment  OfflineExperimentRequest
     * @return OfflineExperimentResponse
     */
    @Override
    public CompletableFuture<OfflineExperimentResponse> offlineExperiment(OfflineExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/action/offline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OfflineExperimentGroup  OfflineExperimentGroupRequest
     * @return OfflineExperimentGroupResponse
     */
    @Override
    public CompletableFuture<OfflineExperimentGroupResponse> offlineExperimentGroup(OfflineExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineExperimentGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}/action/offline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OfflineLaboratory  OfflineLaboratoryRequest
     * @return OfflineLaboratoryResponse
     */
    @Override
    public CompletableFuture<OfflineLaboratoryResponse> offlineLaboratory(OfflineLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineLaboratory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/laboratories/{LaboratoryId}/action/offline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OnlineExperiment  OnlineExperimentRequest
     * @return OnlineExperimentResponse
     */
    @Override
    public CompletableFuture<OnlineExperimentResponse> onlineExperiment(OnlineExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OnlineExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/action/online").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OnlineExperimentGroup  OnlineExperimentGroupRequest
     * @return OnlineExperimentGroupResponse
     */
    @Override
    public CompletableFuture<OnlineExperimentGroupResponse> onlineExperimentGroup(OnlineExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OnlineExperimentGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}/action/online").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OnlineLaboratory  OnlineLaboratoryRequest
     * @return OnlineLaboratoryResponse
     */
    @Override
    public CompletableFuture<OnlineLaboratoryResponse> onlineLaboratory(OnlineLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OnlineLaboratory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/laboratories/{LaboratoryId}/action/online").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushAllExperiment  PushAllExperimentRequest
     * @return PushAllExperimentResponse
     */
    @Override
    public CompletableFuture<PushAllExperimentResponse> pushAllExperiment(PushAllExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushAllExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/action/pushall").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushAllExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushAllExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushResourceRule  PushResourceRuleRequest
     * @return PushResourceRuleResponse
     */
    @Override
    public CompletableFuture<PushResourceRuleResponse> pushResourceRule(PushResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushResourceRule").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/action/push").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySampleConsistencyJobDifference  QuerySampleConsistencyJobDifferenceRequest
     * @return QuerySampleConsistencyJobDifferenceResponse
     */
    @Override
    public CompletableFuture<QuerySampleConsistencyJobDifferenceResponse> querySampleConsistencyJobDifference(QuerySampleConsistencyJobDifferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySampleConsistencyJobDifference").setMethod(HttpMethod.GET).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}/action/querydifference").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySampleConsistencyJobDifferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySampleConsistencyJobDifferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTrafficControlTargetItemReportDetail  QueryTrafficControlTargetItemReportDetailRequest
     * @return QueryTrafficControlTargetItemReportDetailResponse
     */
    @Override
    public CompletableFuture<QueryTrafficControlTargetItemReportDetailResponse> queryTrafficControlTargetItemReportDetail(QueryTrafficControlTargetItemReportDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryTrafficControlTargetItemReportDetail").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/itemcontrolreportdetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTrafficControlTargetItemReportDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTrafficControlTargetItemReportDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseTrafficControlTask  ReleaseTrafficControlTaskRequest
     * @return ReleaseTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<ReleaseTrafficControlTaskResponse> releaseTrafficControlTask(ReleaseTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReleaseTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/release").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReportABMetricGroup  ReportABMetricGroupRequest
     * @return ReportABMetricGroupResponse
     */
    @Override
    public CompletableFuture<ReportABMetricGroupResponse> reportABMetricGroup(ReportABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReportABMetricGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/abmetricgroups/{ABMetricGroupId}/action/report").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReportABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReportABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReportSampleConsistencyJob  ReportSampleConsistencyJobRequest
     * @return ReportSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<ReportSampleConsistencyJobResponse> reportSampleConsistencyJob(ReportSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReportSampleConsistencyJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}/action/report").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReportSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReportSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SplitTrafficControlTarget  SplitTrafficControlTargetRequest
     * @return SplitTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<SplitTrafficControlTargetResponse> splitTrafficControlTarget(SplitTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SplitTrafficControlTarget").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/action/split").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SplitTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SplitTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartTrafficControlTarget  StartTrafficControlTargetRequest
     * @return StartTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<StartTrafficControlTargetResponse> startTrafficControlTarget(StartTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartTrafficControlTarget").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/action/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartTrafficControlTask  StartTrafficControlTaskRequest
     * @return StartTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<StartTrafficControlTaskResponse> startTrafficControlTask(StartTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopSampleConsistencyJob  StopSampleConsistencyJobRequest
     * @return StopSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<StopSampleConsistencyJobResponse> stopSampleConsistencyJob(StopSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopSampleConsistencyJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}/action/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopTrafficControlTarget  StopTrafficControlTargetRequest
     * @return StopTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<StopTrafficControlTargetResponse> stopTrafficControlTarget(StopTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopTrafficControlTarget").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/action/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopTrafficControlTask  StopTrafficControlTaskRequest
     * @return StopTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<StopTrafficControlTaskResponse> stopTrafficControlTask(StopTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncFeatureConsistencyCheckJobReplayLog  SyncFeatureConsistencyCheckJobReplayLogRequest
     * @return SyncFeatureConsistencyCheckJobReplayLogResponse
     */
    @Override
    public CompletableFuture<SyncFeatureConsistencyCheckJobReplayLogResponse> syncFeatureConsistencyCheckJobReplayLog(SyncFeatureConsistencyCheckJobReplayLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncFeatureConsistencyCheckJobReplayLog").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobs/action/syncreplaylog").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncFeatureConsistencyCheckJobReplayLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncFeatureConsistencyCheckJobReplayLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TerminateFeatureConsistencyCheckJob  TerminateFeatureConsistencyCheckJobRequest
     * @return TerminateFeatureConsistencyCheckJobResponse
     */
    @Override
    public CompletableFuture<TerminateFeatureConsistencyCheckJobResponse> terminateFeatureConsistencyCheckJob(TerminateFeatureConsistencyCheckJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TerminateFeatureConsistencyCheckJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobs/{FeatureConsistencyCheckJobId}/action/terminate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateFeatureConsistencyCheckJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateFeatureConsistencyCheckJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateABMetric  UpdateABMetricRequest
     * @return UpdateABMetricResponse
     */
    @Override
    public CompletableFuture<UpdateABMetricResponse> updateABMetric(UpdateABMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateABMetric").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/abmetrics/{ABMetricId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateABMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateABMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateABMetricGroup  UpdateABMetricGroupRequest
     * @return UpdateABMetricGroupResponse
     */
    @Override
    public CompletableFuture<UpdateABMetricGroupResponse> updateABMetricGroup(UpdateABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateABMetricGroup").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/abmetricgroups/{ABMetricGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCrowd  UpdateCrowdRequest
     * @return UpdateCrowdResponse
     */
    @Override
    public CompletableFuture<UpdateCrowdResponse> updateCrowd(UpdateCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCrowd").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/crowds/{CrowdId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEngineConfig  UpdateEngineConfigRequest
     * @return UpdateEngineConfigResponse
     */
    @Override
    public CompletableFuture<UpdateEngineConfigResponse> updateEngineConfig(UpdateEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEngineConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperiment  UpdateExperimentRequest
     * @return UpdateExperimentResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperiment").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperimentGroup  UpdateExperimentGroupRequest
     * @return UpdateExperimentGroupResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentGroupResponse> updateExperimentGroup(UpdateExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperimentGroup").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFeatureConsistencyCheckJobConfig  UpdateFeatureConsistencyCheckJobConfigRequest
     * @return UpdateFeatureConsistencyCheckJobConfigResponse
     */
    @Override
    public CompletableFuture<UpdateFeatureConsistencyCheckJobConfigResponse> updateFeatureConsistencyCheckJobConfig(UpdateFeatureConsistencyCheckJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFeatureConsistencyCheckJobConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs/{FeatureConsistencyCheckJobConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFeatureConsistencyCheckJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFeatureConsistencyCheckJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceResource  UpdateInstanceResourceRequest
     * @return UpdateInstanceResourceResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceResourceResponse> updateInstanceResource(UpdateInstanceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceResource").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLaboratory  UpdateLaboratoryRequest
     * @return UpdateLaboratoryResponse
     */
    @Override
    public CompletableFuture<UpdateLaboratoryResponse> updateLaboratory(UpdateLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLaboratory").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/laboratories/{LaboratoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLayer  UpdateLayerRequest
     * @return UpdateLayerResponse
     */
    @Override
    public CompletableFuture<UpdateLayerResponse> updateLayer(UpdateLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLayer").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/layers/{LayerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateParam  UpdateParamRequest
     * @return UpdateParamResponse
     */
    @Override
    public CompletableFuture<UpdateParamResponse> updateParam(UpdateParamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateParam").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/params/{ParamId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateParamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateParamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateResourceRule  UpdateResourceRuleRequest
     * @return UpdateResourceRuleResponse
     */
    @Override
    public CompletableFuture<UpdateResourceRuleResponse> updateResourceRule(UpdateResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResourceRule").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateResourceRuleItem  UpdateResourceRuleItemRequest
     * @return UpdateResourceRuleItemResponse
     */
    @Override
    public CompletableFuture<UpdateResourceRuleItemResponse> updateResourceRuleItem(UpdateResourceRuleItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResourceRuleItem").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/items/{ResourceRuleItemId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceRuleItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceRuleItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateScene  UpdateSceneRequest
     * @return UpdateSceneResponse
     */
    @Override
    public CompletableFuture<UpdateSceneResponse> updateScene(UpdateSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateScene").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/scenes/{SceneId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTableMeta  UpdateTableMetaRequest
     * @return UpdateTableMetaResponse
     */
    @Override
    public CompletableFuture<UpdateTableMetaResponse> updateTableMeta(UpdateTableMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTableMeta").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/tablemetas/{TableMetaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTrafficControlTarget  UpdateTrafficControlTargetRequest
     * @return UpdateTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<UpdateTrafficControlTargetResponse> updateTrafficControlTarget(UpdateTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTrafficControlTarget").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTrafficControlTask  UpdateTrafficControlTaskRequest
     * @return UpdateTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<UpdateTrafficControlTaskResponse> updateTrafficControlTask(UpdateTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTrafficControlTask").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTrafficControlTaskTraffic  UpdateTrafficControlTaskTrafficRequest
     * @return UpdateTrafficControlTaskTrafficResponse
     */
    @Override
    public CompletableFuture<UpdateTrafficControlTaskTrafficResponse> updateTrafficControlTaskTraffic(UpdateTrafficControlTaskTrafficRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTrafficControlTaskTraffic").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/traffic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficControlTaskTrafficResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficControlTaskTrafficResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UploadRecommendationData  UploadRecommendationDataRequest
     * @return UploadRecommendationDataResponse
     */
    @Override
    public CompletableFuture<UploadRecommendationDataResponse> uploadRecommendationData(UploadRecommendationDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadRecommendationData").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recommendationdata/action/upload").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadRecommendationDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadRecommendationDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
