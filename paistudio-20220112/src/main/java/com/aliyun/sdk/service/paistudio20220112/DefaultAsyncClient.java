// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.paistudio20220112.models.*;
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
        this.product = "PaiStudio";
        this.version = "2022-01-12";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-beijing", "pai.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pai.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "pai.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "pai.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "pai.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "pai.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "pai.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "pai.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "pai.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-west-1", "pai.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "pai.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "pai.eu-central-1.aliyuncs.com"),
            new TeaPair("me-east-1", "pai.me-east-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai.ap-south-1.aliyuncs.com"),
            new TeaPair("cn-qingdao", "pai.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "pai.cn-zhangjiakou.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CheckInstanceWebTerminal  CheckInstanceWebTerminalRequest
     * @return CheckInstanceWebTerminalResponse
     */
    @Override
    public CompletableFuture<CheckInstanceWebTerminalResponse> checkInstanceWebTerminal(CheckInstanceWebTerminalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckInstanceWebTerminal").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/instances/{InstanceId}/webterminals/action/check").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckInstanceWebTerminalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckInstanceWebTerminalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAlgorithm  CreateAlgorithmRequest
     * @return CreateAlgorithmResponse
     */
    @Override
    public CompletableFuture<CreateAlgorithmResponse> createAlgorithm(CreateAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAlgorithm").setMethod(HttpMethod.POST).setPathRegex("/api/v1/algorithms").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAlgorithmVersion  CreateAlgorithmVersionRequest
     * @return CreateAlgorithmVersionResponse
     */
    @Override
    public CompletableFuture<CreateAlgorithmVersionResponse> createAlgorithmVersion(CreateAlgorithmVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAlgorithmVersion").setMethod(HttpMethod.POST).setPathRegex("/api/v1/algorithms/{AlgorithmId}/versions/{AlgorithmVersion}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAlgorithmVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAlgorithmVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstanceWebTerminal  CreateInstanceWebTerminalRequest
     * @return CreateInstanceWebTerminalResponse
     */
    @Override
    public CompletableFuture<CreateInstanceWebTerminalResponse> createInstanceWebTerminal(CreateInstanceWebTerminalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstanceWebTerminal").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/instances/{InstanceId}/webterminals").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceWebTerminalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceWebTerminalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQuota  CreateQuotaRequest
     * @return CreateQuotaResponse
     */
    @Override
    public CompletableFuture<CreateQuotaResponse> createQuota(CreateQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateQuota").setMethod(HttpMethod.POST).setPathRegex("/api/v1/quotas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateResourceGroup  CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    @Override
    public CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTrainingJob  CreateTrainingJobRequest
     * @return CreateTrainingJobResponse
     */
    @Override
    public CompletableFuture<CreateTrainingJobResponse> createTrainingJob(CreateTrainingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTrainingJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trainingjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrainingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrainingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlgorithm  DeleteAlgorithmRequest
     * @return DeleteAlgorithmResponse
     */
    @Override
    public CompletableFuture<DeleteAlgorithmResponse> deleteAlgorithm(DeleteAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlgorithm").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/algorithms/{AlgorithmId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlgorithmVersion  DeleteAlgorithmVersionRequest
     * @return DeleteAlgorithmVersionResponse
     */
    @Override
    public CompletableFuture<DeleteAlgorithmVersionResponse> deleteAlgorithmVersion(DeleteAlgorithmVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlgorithmVersion").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/algorithms/{AlgorithmId}/versions/{AlgorithmVersion}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlgorithmVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlgorithmVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteMachineGroup is deprecated, please use PaiStudio::2022-01-12::DeleteMachineGroup instead.  * @param request  the request parameters of DeleteMachineGroup  DeleteMachineGroupRequest
     * @return DeleteMachineGroupResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMachineGroup").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/resources/machinegroups/{MachineGroupID}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQuota  DeleteQuotaRequest
     * @return DeleteQuotaResponse
     */
    @Override
    public CompletableFuture<DeleteQuotaResponse> deleteQuota(DeleteQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteQuota").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/quotas/{QuotaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteResourceGroup  DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    @Override
    public CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResourceGroup").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/resources/{ResourceGroupID}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteResourceGroupMachineGroup is deprecated, please use PaiStudio::2022-01-12::DeleteResourceGroupMachineGroup instead.  * @param request  the request parameters of DeleteResourceGroupMachineGroup  DeleteResourceGroupMachineGroupRequest
     * @return DeleteResourceGroupMachineGroupResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteResourceGroupMachineGroupResponse> deleteResourceGroupMachineGroup(DeleteResourceGroupMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResourceGroupMachineGroup").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/resources/{ResourceGroupID}/machinegroups/{MachineGroupID}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceGroupMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceGroupMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTrainingJob  DeleteTrainingJobRequest
     * @return DeleteTrainingJobResponse
     */
    @Override
    public CompletableFuture<DeleteTrainingJobResponse> deleteTrainingJob(DeleteTrainingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTrainingJob").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrainingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrainingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTrainingJobLabels  DeleteTrainingJobLabelsRequest
     * @return DeleteTrainingJobLabelsResponse
     */
    @Override
    public CompletableFuture<DeleteTrainingJobLabelsResponse> deleteTrainingJobLabels(DeleteTrainingJobLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTrainingJobLabels").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrainingJobLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrainingJobLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlgorithm  GetAlgorithmRequest
     * @return GetAlgorithmResponse
     */
    @Override
    public CompletableFuture<GetAlgorithmResponse> getAlgorithm(GetAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlgorithm").setMethod(HttpMethod.GET).setPathRegex("/api/v1/algorithms/{AlgorithmId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlgorithmVersion  GetAlgorithmVersionRequest
     * @return GetAlgorithmVersionResponse
     */
    @Override
    public CompletableFuture<GetAlgorithmVersionResponse> getAlgorithmVersion(GetAlgorithmVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlgorithmVersion").setMethod(HttpMethod.GET).setPathRegex("/api/v1/algorithms/{AlgorithmId}/versions/{AlgorithmVersion}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlgorithmVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlgorithmVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetMachineGroup is deprecated, please use PaiStudio::2022-01-12::GetMachineGroup instead.  * @param request  the request parameters of GetMachineGroup  GetMachineGroupRequest
     * @return GetMachineGroupResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMachineGroup").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources/machinegroups/{MachineGroupID}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetNodeMetrics is deprecated, please use Cms::2019-01-01::DescribeMetricList instead.  * @param request  the request parameters of GetNodeMetrics  GetNodeMetricsRequest
     * @return GetNodeMetricsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetNodeMetricsResponse> getNodeMetrics(GetNodeMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNodeMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources/{ResourceGroupID}/nodemetrics/{MetricType}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQuota  GetQuotaRequest
     * @return GetQuotaResponse
     */
    @Override
    public CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetQuota").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{QuotaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceGroup  GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    @Override
    public CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceGroup").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources/{ResourceGroupID}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceGroupMachineGroup  GetResourceGroupMachineGroupRequest
     * @return GetResourceGroupMachineGroupResponse
     */
    @Override
    public CompletableFuture<GetResourceGroupMachineGroupResponse> getResourceGroupMachineGroup(GetResourceGroupMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceGroupMachineGroup").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources/{ResourceGroupID}/machinegroups/{MachineGroupID}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceGroupMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceGroupMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetResourceGroupRequest is deprecated  * @param request  the request parameters of GetResourceGroupRequest  GetResourceGroupRequestRequest
     * @return GetResourceGroupRequestResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetResourceGroupRequestResponse> getResourceGroupRequest(GetResourceGroupRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceGroupRequest").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources/data/request").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceGroupRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceGroupRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceGroupTotal  GetResourceGroupTotalRequest
     * @return GetResourceGroupTotalResponse
     */
    @Override
    public CompletableFuture<GetResourceGroupTotalResponse> getResourceGroupTotal(GetResourceGroupTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceGroupTotal").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources/data/total").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceGroupTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceGroupTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    @Override
    public CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetToken").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tokens").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrainingJob  GetTrainingJobRequest
     * @return GetTrainingJobResponse
     */
    @Override
    public CompletableFuture<GetTrainingJobResponse> getTrainingJob(GetTrainingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrainingJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrainingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrainingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrainingJobErrorInfo  GetTrainingJobErrorInfoRequest
     * @return GetTrainingJobErrorInfoResponse
     */
    @Override
    public CompletableFuture<GetTrainingJobErrorInfoResponse> getTrainingJobErrorInfo(GetTrainingJobErrorInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrainingJobErrorInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/errorinfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrainingJobErrorInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrainingJobErrorInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrainingJobLatestMetrics  GetTrainingJobLatestMetricsRequest
     * @return GetTrainingJobLatestMetricsResponse
     */
    @Override
    public CompletableFuture<GetTrainingJobLatestMetricsResponse> getTrainingJobLatestMetrics(GetTrainingJobLatestMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrainingJobLatestMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/latestmetrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrainingJobLatestMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrainingJobLatestMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetUserViewMetrics is deprecated, please use PaiStudio::2022-01-12::GetQuotaUserViewMetrics instead.  * @param request  the request parameters of GetUserViewMetrics  GetUserViewMetricsRequest
     * @return GetUserViewMetricsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetUserViewMetricsResponse> getUserViewMetrics(GetUserViewMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserViewMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources/{ResourceGroupID}/usermetrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserViewMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserViewMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlgorithmVersions  ListAlgorithmVersionsRequest
     * @return ListAlgorithmVersionsResponse
     */
    @Override
    public CompletableFuture<ListAlgorithmVersionsResponse> listAlgorithmVersions(ListAlgorithmVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlgorithmVersions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/algorithms/{AlgorithmId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlgorithmVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlgorithmVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlgorithms  ListAlgorithmsRequest
     * @return ListAlgorithmsResponse
     */
    @Override
    public CompletableFuture<ListAlgorithmsResponse> listAlgorithms(ListAlgorithmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlgorithms").setMethod(HttpMethod.GET).setPathRegex("/api/v1/algorithms").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlgorithmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlgorithmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    @Override
    public CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListNodes").setMethod(HttpMethod.GET).setPathRegex("/api/v1/nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotaWorkloads  ListQuotaWorkloadsRequest
     * @return ListQuotaWorkloadsResponse
     */
    @Override
    public CompletableFuture<ListQuotaWorkloadsResponse> listQuotaWorkloads(ListQuotaWorkloadsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListQuotaWorkloads").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{QuotaId}/workloads").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotaWorkloadsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotaWorkloadsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotas  ListQuotasRequest
     * @return ListQuotasResponse
     */
    @Override
    public CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListQuotas").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceGroupMachineGroups  ListResourceGroupMachineGroupsRequest
     * @return ListResourceGroupMachineGroupsResponse
     */
    @Override
    public CompletableFuture<ListResourceGroupMachineGroupsResponse> listResourceGroupMachineGroups(ListResourceGroupMachineGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceGroupMachineGroups").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources/{ResourceGroupID}/machinegroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceGroupMachineGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceGroupMachineGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    @Override
    public CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceGroups").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTrainingJobEvents  ListTrainingJobEventsRequest
     * @return ListTrainingJobEventsResponse
     */
    @Override
    public CompletableFuture<ListTrainingJobEventsResponse> listTrainingJobEvents(ListTrainingJobEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrainingJobEvents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrainingJobEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrainingJobEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTrainingJobInstanceEvents  ListTrainingJobInstanceEventsRequest
     * @return ListTrainingJobInstanceEventsResponse
     */
    @Override
    public CompletableFuture<ListTrainingJobInstanceEventsResponse> listTrainingJobInstanceEvents(ListTrainingJobInstanceEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrainingJobInstanceEvents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/instances/{InstanceId}/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrainingJobInstanceEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrainingJobInstanceEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTrainingJobInstanceMetrics  ListTrainingJobInstanceMetricsRequest
     * @return ListTrainingJobInstanceMetricsResponse
     */
    @Override
    public CompletableFuture<ListTrainingJobInstanceMetricsResponse> listTrainingJobInstanceMetrics(ListTrainingJobInstanceMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrainingJobInstanceMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/instancemetrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrainingJobInstanceMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrainingJobInstanceMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTrainingJobLogs  ListTrainingJobLogsRequest
     * @return ListTrainingJobLogsResponse
     */
    @Override
    public CompletableFuture<ListTrainingJobLogsResponse> listTrainingJobLogs(ListTrainingJobLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrainingJobLogs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrainingJobLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrainingJobLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTrainingJobMetrics  ListTrainingJobMetricsRequest
     * @return ListTrainingJobMetricsResponse
     */
    @Override
    public CompletableFuture<ListTrainingJobMetricsResponse> listTrainingJobMetrics(ListTrainingJobMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrainingJobMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrainingJobMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrainingJobMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTrainingJobOutputModels  ListTrainingJobOutputModelsRequest
     * @return ListTrainingJobOutputModelsResponse
     */
    @Override
    public CompletableFuture<ListTrainingJobOutputModelsResponse> listTrainingJobOutputModels(ListTrainingJobOutputModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrainingJobOutputModels").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/outputmodels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrainingJobOutputModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrainingJobOutputModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTrainingJobs  ListTrainingJobsRequest
     * @return ListTrainingJobsResponse
     */
    @Override
    public CompletableFuture<ListTrainingJobsResponse> listTrainingJobs(ListTrainingJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrainingJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trainingjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrainingJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrainingJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScaleQuota  ScaleQuotaRequest
     * @return ScaleQuotaResponse
     */
    @Override
    public CompletableFuture<ScaleQuotaResponse> scaleQuota(ScaleQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleQuota").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/quotas/{QuotaId}/action/scale").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopTrainingJob  StopTrainingJobRequest
     * @return StopTrainingJobResponse
     */
    @Override
    public CompletableFuture<StopTrainingJobResponse> stopTrainingJob(StopTrainingJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopTrainingJob").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTrainingJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTrainingJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlgorithm  UpdateAlgorithmRequest
     * @return UpdateAlgorithmResponse
     */
    @Override
    public CompletableFuture<UpdateAlgorithmResponse> updateAlgorithm(UpdateAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlgorithm").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/algorithms/{AlgorithmId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlgorithmVersion  UpdateAlgorithmVersionRequest
     * @return UpdateAlgorithmVersionResponse
     */
    @Override
    public CompletableFuture<UpdateAlgorithmVersionResponse> updateAlgorithmVersion(UpdateAlgorithmVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlgorithmVersion").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/algorithms/{AlgorithmId}/versions/{AlgorithmVersion}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlgorithmVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlgorithmVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateQuota  UpdateQuotaRequest
     * @return UpdateQuotaResponse
     */
    @Override
    public CompletableFuture<UpdateQuotaResponse> updateQuota(UpdateQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateQuota").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/quotas/{QuotaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateResourceGroup  UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    @Override
    public CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResourceGroup").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/resources/{ResourceGroupID}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTrainingJobLabels  UpdateTrainingJobLabelsRequest
     * @return UpdateTrainingJobLabelsResponse
     */
    @Override
    public CompletableFuture<UpdateTrainingJobLabelsResponse> updateTrainingJobLabels(UpdateTrainingJobLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTrainingJobLabels").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trainingjobs/{TrainingJobId}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrainingJobLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrainingJobLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
