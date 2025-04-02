// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.pai_dlc20201203.models.*;
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
        this.product = "pai-dlc";
        this.version = "2020-12-03";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "pai-dlc.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-chengdu", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-edge-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-fujian", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-qingdao", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-wuhan", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("eu-west-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "pai-dlc.aliyuncs.com"),
            new TeaPair("me-east-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "pai-dlc.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of Deep Learning Containers (DLC) of Platform for AI (PAI).</p>
     * 
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    @Override
    public CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTensorboard  CreateTensorboardRequest
     * @return CreateTensorboardResponse
     */
    @Override
    public CompletableFuture<CreateTensorboardResponse> createTensorboard(CreateTensorboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTensorboard").setMethod(HttpMethod.POST).setPathRegex("/api/v1/tensorboards").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTensorboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTensorboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteJob  DeleteJobRequest
     * @return DeleteJobResponse
     */
    @Override
    public CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteJob").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/jobs/{JobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTensorboard  DeleteTensorboardRequest
     * @return DeleteTensorboardResponse
     */
    @Override
    public CompletableFuture<DeleteTensorboardResponse> deleteTensorboard(DeleteTensorboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTensorboard").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/tensorboards/{TensorboardId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTensorboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTensorboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    @Override
    public CompletableFuture<GetJobResponse> getJob(GetJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/{JobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJobEvents  GetJobEventsRequest
     * @return GetJobEventsResponse
     */
    @Override
    public CompletableFuture<GetJobEventsResponse> getJobEvents(GetJobEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJobEvents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/{JobId}/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJobMetrics  GetJobMetricsRequest
     * @return GetJobMetricsResponse
     */
    @Override
    public CompletableFuture<GetJobMetricsResponse> getJobMetrics(GetJobMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJobMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/{JobId}/metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJobSanityCheckResult  GetJobSanityCheckResultRequest
     * @return GetJobSanityCheckResultResponse
     */
    @Override
    public CompletableFuture<GetJobSanityCheckResultResponse> getJobSanityCheckResult(GetJobSanityCheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJobSanityCheckResult").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/{JobId}/sanitycheckresult").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobSanityCheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobSanityCheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPodEvents  GetPodEventsRequest
     * @return GetPodEventsResponse
     */
    @Override
    public CompletableFuture<GetPodEventsResponse> getPodEvents(GetPodEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPodEvents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/{JobId}/pods/{PodId}/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPodEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPodEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPodLogs  GetPodLogsRequest
     * @return GetPodLogsResponse
     */
    @Override
    public CompletableFuture<GetPodLogsResponse> getPodLogs(GetPodLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPodLogs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/{JobId}/pods/{PodId}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPodLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPodLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTensorboard  GetTensorboardRequest
     * @return GetTensorboardResponse
     */
    @Override
    public CompletableFuture<GetTensorboardResponse> getTensorboard(GetTensorboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTensorboard").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tensorboards/{TensorboardId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTensorboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTensorboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTensorboardSharedUrl  GetTensorboardSharedUrlRequest
     * @return GetTensorboardSharedUrlResponse
     */
    @Override
    public CompletableFuture<GetTensorboardSharedUrlResponse> getTensorboardSharedUrl(GetTensorboardSharedUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTensorboardSharedUrl").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tensorboards/{TensorboardId}/sharedurl").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTensorboardSharedUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTensorboardSharedUrlResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetWebTerminal  GetWebTerminalRequest
     * @return GetWebTerminalResponse
     */
    @Override
    public CompletableFuture<GetWebTerminalResponse> getWebTerminal(GetWebTerminalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWebTerminal").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/{JobId}/pods/{PodId}/webterminal").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWebTerminalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWebTerminalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEcsSpecs  ListEcsSpecsRequest
     * @return ListEcsSpecsResponse
     */
    @Override
    public CompletableFuture<ListEcsSpecsResponse> listEcsSpecs(ListEcsSpecsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEcsSpecs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/ecsspecs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEcsSpecsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEcsSpecsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJobSanityCheckResults  ListJobSanityCheckResultsRequest
     * @return ListJobSanityCheckResultsResponse
     */
    @Override
    public CompletableFuture<ListJobSanityCheckResultsResponse> listJobSanityCheckResults(ListJobSanityCheckResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJobSanityCheckResults").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/{JobId}/sanitycheckresults").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobSanityCheckResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobSanityCheckResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    @Override
    public CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTensorboards  ListTensorboardsRequest
     * @return ListTensorboardsResponse
     */
    @Override
    public CompletableFuture<ListTensorboardsResponse> listTensorboards(ListTensorboardsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTensorboards").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tensorboards").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTensorboardsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTensorboardsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartTensorboard  StartTensorboardRequest
     * @return StartTensorboardResponse
     */
    @Override
    public CompletableFuture<StartTensorboardResponse> startTensorboard(StartTensorboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartTensorboard").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/tensorboards/{TensorboardId}/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTensorboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTensorboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopJob  StopJobRequest
     * @return StopJobResponse
     */
    @Override
    public CompletableFuture<StopJobResponse> stopJob(StopJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/jobs/{JobId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopTensorboard  StopTensorboardRequest
     * @return StopTensorboardResponse
     */
    @Override
    public CompletableFuture<StopTensorboardResponse> stopTensorboard(StopTensorboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopTensorboard").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/tensorboards/{TensorboardId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTensorboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTensorboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateJob  UpdateJobRequest
     * @return UpdateJobResponse
     */
    @Override
    public CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateJob").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/jobs/{JobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTensorboard  UpdateTensorboardRequest
     * @return UpdateTensorboardResponse
     */
    @Override
    public CompletableFuture<UpdateTensorboardResponse> updateTensorboard(UpdateTensorboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTensorboard").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/tensorboards/{TensorboardId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTensorboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTensorboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
