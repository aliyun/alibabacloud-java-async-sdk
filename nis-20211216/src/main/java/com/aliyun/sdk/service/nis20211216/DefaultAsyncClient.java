// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.nis20211216.models.*;
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
        this.product = "nis";
        this.version = "2021-12-16";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate a task for analyzing network reachability by specifying only the information about the source and destination. You do not need to create a network path for reachability analysis. The analysis result is not recorded in the system. If you want to record the path parameters and analysis result in the Network Intelligence Service (NIS) console, we recommend that you call the <strong>createNetworkReachableAnalysis</strong> operation.</p>
     * 
     * @param request the request parameters of CreateAndAnalyzeNetworkPath  CreateAndAnalyzeNetworkPathRequest
     * @return CreateAndAnalyzeNetworkPathResponse
     */
    @Override
    public CompletableFuture<CreateAndAnalyzeNetworkPathResponse> createAndAnalyzeNetworkPath(CreateAndAnalyzeNetworkPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAndAnalyzeNetworkPath").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAndAnalyzeNetworkPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAndAnalyzeNetworkPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <strong>CreateNetworkPath</strong> operation to create network paths in multiple networking scenarios and between multiple resources. After a path is created, the path parameters are saved for repeated analysis.</p>
     * <ul>
     * <li>You can create up to 100 network paths within one Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNetworkPath  CreateNetworkPathRequest
     * @return CreateNetworkPathResponse
     */
    @Override
    public CompletableFuture<CreateNetworkPathResponse> createNetworkPath(CreateNetworkPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkPath").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The <strong>CreateNetworkReachableAnalysis</strong> operation is used to create a task for analyzing the reachability of the network path that is created by calling the <strong>CreateNetworkPath</strong> operation and record the analysis results.</p>
     * <ul>
     * <li>The <strong>CreateNetworkReachableAnalysis</strong> operation can be called to repeatedly analyze the reachability of a network path.</li>
     * <li>You can create up to 1,000 reachability analysis records within one Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNetworkReachableAnalysis  CreateNetworkReachableAnalysisRequest
     * @return CreateNetworkReachableAnalysisResponse
     */
    @Override
    public CompletableFuture<CreateNetworkReachableAnalysisResponse> createNetworkReachableAnalysis(CreateNetworkReachableAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkReachableAnalysis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkReachableAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkReachableAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteNetworkPath  DeleteNetworkPathRequest
     * @return DeleteNetworkPathResponse
     */
    @Override
    public CompletableFuture<DeleteNetworkPathResponse> deleteNetworkPath(DeleteNetworkPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkPath").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteNetworkReachableAnalysis  DeleteNetworkReachableAnalysisRequest
     * @return DeleteNetworkReachableAnalysisResponse
     */
    @Override
    public CompletableFuture<DeleteNetworkReachableAnalysisResponse> deleteNetworkReachableAnalysis(DeleteNetworkReachableAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkReachableAnalysis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkReachableAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkReachableAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteNisInspectionReport  DeleteNisInspectionReportRequest
     * @return DeleteNisInspectionReportResponse
     */
    @Override
    public CompletableFuture<DeleteNisInspectionReportResponse> deleteNisInspectionReport(DeleteNisInspectionReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNisInspectionReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNisInspectionReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNisInspectionReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteNisInspectionTask  DeleteNisInspectionTaskRequest
     * @return DeleteNisInspectionTaskResponse
     */
    @Override
    public CompletableFuture<DeleteNisInspectionTaskResponse> deleteNisInspectionTask(DeleteNisInspectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNisInspectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNisInspectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNisInspectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNisInspectionRecommendationResources  DescribeNisInspectionRecommendationResourcesRequest
     * @return DescribeNisInspectionRecommendationResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeNisInspectionRecommendationResourcesResponse> describeNisInspectionRecommendationResources(DescribeNisInspectionRecommendationResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNisInspectionRecommendationResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNisInspectionRecommendationResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNisInspectionRecommendationResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNisInspectionReportCheckItems  DescribeNisInspectionReportCheckItemsRequest
     * @return DescribeNisInspectionReportCheckItemsResponse
     */
    @Override
    public CompletableFuture<DescribeNisInspectionReportCheckItemsResponse> describeNisInspectionReportCheckItems(DescribeNisInspectionReportCheckItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNisInspectionReportCheckItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNisInspectionReportCheckItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNisInspectionReportCheckItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNisInspectionReportStatus  DescribeNisInspectionReportStatusRequest
     * @return DescribeNisInspectionReportStatusResponse
     */
    @Override
    public CompletableFuture<DescribeNisInspectionReportStatusResponse> describeNisInspectionReportStatus(DescribeNisInspectionReportStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNisInspectionReportStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNisInspectionReportStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNisInspectionReportStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNisInspectionReportSummary  DescribeNisInspectionReportSummaryRequest
     * @return DescribeNisInspectionReportSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeNisInspectionReportSummaryResponse> describeNisInspectionReportSummary(DescribeNisInspectionReportSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNisInspectionReportSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNisInspectionReportSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNisInspectionReportSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNisInspectionTask  DescribeNisInspectionTaskRequest
     * @return DescribeNisInspectionTaskResponse
     */
    @Override
    public CompletableFuture<DescribeNisInspectionTaskResponse> describeNisInspectionTask(DescribeNisInspectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNisInspectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNisInspectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNisInspectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetInternetTuple is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.  * @param request  the request parameters of GetInternetTuple  GetInternetTupleRequest
     * @return GetInternetTupleResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetInternetTupleResponse> getInternetTuple(GetInternetTupleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInternetTuple").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInternetTupleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInternetTupleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetNatTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.  * @param request  the request parameters of GetNatTopN  GetNatTopNRequest
     * @return GetNatTopNResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetNatTopNResponse> getNatTopN(GetNatTopNRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNatTopN").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNatTopNResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNatTopNResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>GetNetworkReachableAnalysis</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can query the state of the task for analyzing network reachability.</p>
     * <ul>
     * <li>The <strong>init</strong> state indicates that the task is in progress.</li>
     * <li>The <strong>finish</strong> state indicates that the task is complete. In this state, you can obtain the analysis result.</li>
     * </ul>
     * 
     * @param request the request parameters of GetNetworkReachableAnalysis  GetNetworkReachableAnalysisRequest
     * @return GetNetworkReachableAnalysisResponse
     */
    @Override
    public CompletableFuture<GetNetworkReachableAnalysisResponse> getNetworkReachableAnalysis(GetNetworkReachableAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNetworkReachableAnalysis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNetworkReachableAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNetworkReachableAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNisNetworkMetrics  GetNisNetworkMetricsRequest
     * @return GetNisNetworkMetricsResponse
     */
    @Override
    public CompletableFuture<GetNisNetworkMetricsResponse> getNisNetworkMetrics(GetNisNetworkMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNisNetworkMetrics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNisNetworkMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNisNetworkMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNisNetworkRanking  GetNisNetworkRankingRequest
     * @return GetNisNetworkRankingResponse
     */
    @Override
    public CompletableFuture<GetNisNetworkRankingResponse> getNisNetworkRanking(GetNisNetworkRankingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNisNetworkRanking").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNisNetworkRankingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNisNetworkRankingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetTransitRouterFlowTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.  * @param request  the request parameters of GetTransitRouterFlowTopN  GetTransitRouterFlowTopNRequest
     * @return GetTransitRouterFlowTopNResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetTransitRouterFlowTopNResponse> getTransitRouterFlowTopN(GetTransitRouterFlowTopNRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTransitRouterFlowTopN").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTransitRouterFlowTopNResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTransitRouterFlowTopNResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetVbrFlowTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.  * @param request  the request parameters of GetVbrFlowTopN  GetVbrFlowTopNRequest
     * @return GetVbrFlowTopNResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetVbrFlowTopNResponse> getVbrFlowTopN(GetVbrFlowTopNRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVbrFlowTopN").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVbrFlowTopNResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVbrFlowTopNResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNisInspectionResourceType  ListNisInspectionResourceTypeRequest
     * @return ListNisInspectionResourceTypeResponse
     */
    @Override
    public CompletableFuture<ListNisInspectionResourceTypeResponse> listNisInspectionResourceType(ListNisInspectionResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNisInspectionResourceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNisInspectionResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNisInspectionResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNisInspectionTaskReports  ListNisInspectionTaskReportsRequest
     * @return ListNisInspectionTaskReportsResponse
     */
    @Override
    public CompletableFuture<ListNisInspectionTaskReportsResponse> listNisInspectionTaskReports(ListNisInspectionTaskReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNisInspectionTaskReports").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNisInspectionTaskReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNisInspectionTaskReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNisInspectionTasks  ListNisInspectionTasksRequest
     * @return ListNisInspectionTasksResponse
     */
    @Override
    public CompletableFuture<ListNisInspectionTasksResponse> listNisInspectionTasks(ListNisInspectionTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNisInspectionTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNisInspectionTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNisInspectionTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartNisInspectionTask  StartNisInspectionTaskRequest
     * @return StartNisInspectionTaskResponse
     */
    @Override
    public CompletableFuture<StartNisInspectionTaskResponse> startNisInspectionTask(StartNisInspectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartNisInspectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartNisInspectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartNisInspectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateNisInspectionTask  UpdateNisInspectionTaskRequest
     * @return UpdateNisInspectionTaskResponse
     */
    @Override
    public CompletableFuture<UpdateNisInspectionTaskResponse> updateNisInspectionTask(UpdateNisInspectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNisInspectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNisInspectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNisInspectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
