// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sysom20231230.models.*;
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
        this.product = "SysOM";
        this.version = "2023-12-30";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AuthDiagnosis  AuthDiagnosisRequest
     * @return AuthDiagnosisResponse
     */
    @Override
    public CompletableFuture<AuthDiagnosisResponse> authDiagnosis(AuthDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/diagnosis/auth").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateCopilotResponse  GenerateCopilotResponseRequest
     * @return GenerateCopilotResponseResponse
     */
    @Override
    public CompletableFuture<GenerateCopilotResponseResponse> generateCopilotResponse(GenerateCopilotResponseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateCopilotResponse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/generate_copilot_response").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateCopilotResponseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateCopilotResponseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateCopilotStreamResponse  GenerateCopilotStreamResponseRequest
     * @return GenerateCopilotStreamResponseResponse
     */
    @Override
    public CompletableFuture<GenerateCopilotStreamResponseResponse> generateCopilotStreamResponse(GenerateCopilotStreamResponseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateCopilotStreamResponse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/generate_copilot_stream_response").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateCopilotStreamResponseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateCopilotStreamResponseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<GenerateCopilotStreamResponseResponseBody> generateCopilotStreamResponseWithResponseIterable(GenerateCopilotStreamResponseRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("GenerateCopilotStreamResponse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/generate_copilot_stream_response").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        GenerateCopilotStreamResponseResponseBodyIterator iterator = GenerateCopilotStreamResponseResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of GetAIQueryResult  GetAIQueryResultRequest
     * @return GetAIQueryResultResponse
     */
    @Override
    public CompletableFuture<GetAIQueryResultResponse> getAIQueryResult(GetAIQueryResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAIQueryResult").setMethod(HttpMethod.POST).setPathRegex("/api/v1/app_observ/aiAnalysis/query_result").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAIQueryResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAIQueryResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAbnormalEventsCount  GetAbnormalEventsCountRequest
     * @return GetAbnormalEventsCountResponse
     */
    @Override
    public CompletableFuture<GetAbnormalEventsCountResponse> getAbnormalEventsCount(GetAbnormalEventsCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAbnormalEventsCount").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/abnormaly_events_count").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAbnormalEventsCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAbnormalEventsCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    @Override
    public CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgent").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/get_agent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentTask  GetAgentTaskRequest
     * @return GetAgentTaskResponse
     */
    @Override
    public CompletableFuture<GetAgentTaskResponse> getAgentTask(GetAgentTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/get_agent_task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCopilotHistory  GetCopilotHistoryRequest
     * @return GetCopilotHistoryResponse
     */
    @Override
    public CompletableFuture<GetCopilotHistoryResponse> getCopilotHistory(GetCopilotHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCopilotHistory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/get_copilot_history").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCopilotHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCopilotHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDiagnosisResult  GetDiagnosisResultRequest
     * @return GetDiagnosisResultResponse
     */
    @Override
    public CompletableFuture<GetDiagnosisResultResponse> getDiagnosisResult(GetDiagnosisResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDiagnosisResult").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/diagnosis/get_diagnosis_results").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDiagnosisResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDiagnosisResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHealthPercentage  GetHealthPercentageRequest
     * @return GetHealthPercentageResponse
     */
    @Override
    public CompletableFuture<GetHealthPercentageResponse> getHealthPercentage(GetHealthPercentageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHealthPercentage").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/health_percentage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHealthPercentageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHealthPercentageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHostCount  GetHostCountRequest
     * @return GetHostCountResponse
     */
    @Override
    public CompletableFuture<GetHostCountResponse> getHostCount(GetHostCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHostCount").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/host_count").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHostCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHostCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotSpotUniqList  GetHotSpotUniqListRequest
     * @return GetHotSpotUniqListResponse
     */
    @Override
    public CompletableFuture<GetHotSpotUniqListResponse> getHotSpotUniqList(GetHotSpotUniqListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotSpotUniqList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/livetrace_proxy/hotspot_uniq_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotSpotUniqListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotSpotUniqListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotAnalysis  GetHotspotAnalysisRequest
     * @return GetHotspotAnalysisResponse
     */
    @Override
    public CompletableFuture<GetHotspotAnalysisResponse> getHotspotAnalysis(GetHotspotAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotAnalysis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotCompare  GetHotspotCompareRequest
     * @return GetHotspotCompareResponse
     */
    @Override
    public CompletableFuture<GetHotspotCompareResponse> getHotspotCompare(GetHotspotCompareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotCompare").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_compare").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotCompareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotCompareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotInstanceList  GetHotspotInstanceListRequest
     * @return GetHotspotInstanceListResponse
     */
    @Override
    public CompletableFuture<GetHotspotInstanceListResponse> getHotspotInstanceList(GetHotspotInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotInstanceList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_instance_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotPidList  GetHotspotPidListRequest
     * @return GetHotspotPidListResponse
     */
    @Override
    public CompletableFuture<GetHotspotPidListResponse> getHotspotPidList(GetHotspotPidListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotPidList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_pid_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotPidListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotPidListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotTracking  GetHotspotTrackingRequest
     * @return GetHotspotTrackingResponse
     */
    @Override
    public CompletableFuture<GetHotspotTrackingResponse> getHotspotTracking(GetHotspotTrackingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotTracking").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_tracking").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotTrackingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotTrackingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstantScore  GetInstantScoreRequest
     * @return GetInstantScoreResponse
     */
    @Override
    public CompletableFuture<GetInstantScoreResponse> getInstantScore(GetInstantScoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstantScore").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/instant/score").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstantScoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstantScoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetListRecord  GetListRecordRequest
     * @return GetListRecordResponse
     */
    @Override
    public CompletableFuture<GetListRecordResponse> getListRecord(GetListRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetListRecord").setMethod(HttpMethod.GET).setPathRegex("/api/v1/app_observ/aiAnalysis/list_record").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetListRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetListRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProblemPercentage  GetProblemPercentageRequest
     * @return GetProblemPercentageResponse
     */
    @Override
    public CompletableFuture<GetProblemPercentageResponse> getProblemPercentage(GetProblemPercentageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProblemPercentage").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/problem_percentage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProblemPercentageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProblemPercentageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRangeScore  GetRangeScoreRequest
     * @return GetRangeScoreResponse
     */
    @Override
    public CompletableFuture<GetRangeScoreResponse> getRangeScore(GetRangeScoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRangeScore").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/score").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRangeScoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRangeScoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResources  GetResourcesRequest
     * @return GetResourcesResponse
     */
    @Override
    public CompletableFuture<GetResourcesResponse> getResources(GetResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/instant/resource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceFuncStatus  GetServiceFuncStatusRequest
     * @return GetServiceFuncStatusResponse
     */
    @Override
    public CompletableFuture<GetServiceFuncStatusResponse> getServiceFuncStatus(GetServiceFuncStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceFuncStatus").setMethod(HttpMethod.GET).setPathRegex("/api/v1/func-switch/get-service-func-status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceFuncStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceFuncStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InitialSysom  InitialSysomRequest
     * @return InitialSysomResponse
     */
    @Override
    public CompletableFuture<InitialSysomResponse> initialSysom(InitialSysomRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InitialSysom").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/initial").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitialSysomResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitialSysomResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallAgent  InstallAgentRequest
     * @return InstallAgentResponse
     */
    @Override
    public CompletableFuture<InstallAgentResponse> installAgent(InstallAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallAgent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/install_agent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallAgentForCluster  InstallAgentForClusterRequest
     * @return InstallAgentForClusterResponse
     */
    @Override
    public CompletableFuture<InstallAgentForClusterResponse> installAgentForCluster(InstallAgentForClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallAgentForCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/install_agent_by_cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallAgentForClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallAgentForClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvokeAnomalyDiagnosis  InvokeAnomalyDiagnosisRequest
     * @return InvokeAnomalyDiagnosisResponse
     */
    @Override
    public CompletableFuture<InvokeAnomalyDiagnosisResponse> invokeAnomalyDiagnosis(InvokeAnomalyDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeAnomalyDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/cluster_health/diagnosis/invoke_anomaly_diagnose").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeAnomalyDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeAnomalyDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvokeDiagnosis  InvokeDiagnosisRequest
     * @return InvokeDiagnosisResponse
     */
    @Override
    public CompletableFuture<InvokeDiagnosisResponse> invokeDiagnosis(InvokeDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/diagnosis/invoke_diagnosis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAbnormalyEvents  ListAbnormalyEventsRequest
     * @return ListAbnormalyEventsResponse
     */
    @Override
    public CompletableFuture<ListAbnormalyEventsResponse> listAbnormalyEvents(ListAbnormalyEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAbnormalyEvents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/abnormaly_events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAbnormalyEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAbnormalyEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentInstallRecords  ListAgentInstallRecordsRequest
     * @return ListAgentInstallRecordsResponse
     */
    @Override
    public CompletableFuture<ListAgentInstallRecordsResponse> listAgentInstallRecords(ListAgentInstallRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentInstallRecords").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/list_agent_install_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentInstallRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentInstallRecordsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/list_agents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterAgentInstallRecords  ListClusterAgentInstallRecordsRequest
     * @return ListClusterAgentInstallRecordsResponse
     */
    @Override
    public CompletableFuture<ListClusterAgentInstallRecordsResponse> listClusterAgentInstallRecords(ListClusterAgentInstallRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterAgentInstallRecords").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/list_cluster_agent_install_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterAgentInstallRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterAgentInstallRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    @Override
    public CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusters").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/cluster/list_clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDiagnosis  ListDiagnosisRequest
     * @return ListDiagnosisResponse
     */
    @Override
    public CompletableFuture<ListDiagnosisResponse> listDiagnosis(ListDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDiagnosis").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/diagnosis/list_diagnosis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceHealth  ListInstanceHealthRequest
     * @return ListInstanceHealthResponse
     */
    @Override
    public CompletableFuture<ListInstanceHealthResponse> listInstanceHealth(ListInstanceHealthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceHealth").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/instance_health_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceHealthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceHealthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceStatus  ListInstanceStatusRequest
     * @return ListInstanceStatusResponse
     */
    @Override
    public CompletableFuture<ListInstanceStatusResponse> listInstanceStatus(ListInstanceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceStatus").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/list_instance_status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceStatusResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/list_instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstancesEcsInfoList  ListInstancesEcsInfoListRequest
     * @return ListInstancesEcsInfoListResponse
     */
    @Override
    public CompletableFuture<ListInstancesEcsInfoListResponse> listInstancesEcsInfoList(ListInstancesEcsInfoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstancesEcsInfoList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/listInstancesEcsInfoList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesEcsInfoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesEcsInfoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstancesWithEcsInfo  ListInstancesWithEcsInfoRequest
     * @return ListInstancesWithEcsInfoResponse
     */
    @Override
    public CompletableFuture<ListInstancesWithEcsInfoResponse> listInstancesWithEcsInfo(ListInstancesWithEcsInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstancesWithEcsInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/listInstancesWithEcsInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesWithEcsInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesWithEcsInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPluginsInstances  ListPluginsInstancesRequest
     * @return ListPluginsInstancesResponse
     */
    @Override
    public CompletableFuture<ListPluginsInstancesResponse> listPluginsInstances(ListPluginsInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPluginsInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/listPluginsInstances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPluginsInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPluginsInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPodsOfInstance  ListPodsOfInstanceRequest
     * @return ListPodsOfInstanceResponse
     */
    @Override
    public CompletableFuture<ListPodsOfInstanceResponse> listPodsOfInstance(ListPodsOfInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPodsOfInstance").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/list_pod_of_instance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPodsOfInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPodsOfInstanceResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRegions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/list_regions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartAIAnalysis  StartAIAnalysisRequest
     * @return StartAIAnalysisResponse
     */
    @Override
    public CompletableFuture<StartAIAnalysisResponse> startAIAnalysis(StartAIAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartAIAnalysis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/start_ai_analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAIAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAIAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UninstallAgent  UninstallAgentRequest
     * @return UninstallAgentResponse
     */
    @Override
    public CompletableFuture<UninstallAgentResponse> uninstallAgent(UninstallAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallAgent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/uninstall_agent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UninstallAgentForCluster  UninstallAgentForClusterRequest
     * @return UninstallAgentForClusterResponse
     */
    @Override
    public CompletableFuture<UninstallAgentForClusterResponse> uninstallAgentForCluster(UninstallAgentForClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallAgentForCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/uninstall_agent_by_cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallAgentForClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallAgentForClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEventsAttention  UpdateEventsAttentionRequest
     * @return UpdateEventsAttentionResponse
     */
    @Override
    public CompletableFuture<UpdateEventsAttentionResponse> updateEventsAttention(UpdateEventsAttentionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEventsAttention").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/cluster_update_events_attention").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEventsAttentionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEventsAttentionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFuncSwitchRecord  UpdateFuncSwitchRecordRequest
     * @return UpdateFuncSwitchRecordResponse
     */
    @Override
    public CompletableFuture<UpdateFuncSwitchRecordResponse> updateFuncSwitchRecord(UpdateFuncSwitchRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFuncSwitchRecord").setMethod(HttpMethod.GET).setPathRegex("/api/v1/func-switch/update-service-func-switch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFuncSwitchRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFuncSwitchRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeAgent  UpgradeAgentRequest
     * @return UpgradeAgentResponse
     */
    @Override
    public CompletableFuture<UpgradeAgentResponse> upgradeAgent(UpgradeAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeAgent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/upgrade_agent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeAgentForCluster  UpgradeAgentForClusterRequest
     * @return UpgradeAgentForClusterResponse
     */
    @Override
    public CompletableFuture<UpgradeAgentForClusterResponse> upgradeAgentForCluster(UpgradeAgentForClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeAgentForCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/upgrade_agent_by_cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeAgentForClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeAgentForClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
