// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.nis20211216.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate a task for analyzing network reachability by specifying only the information about the source and destination. You do not need to create a network path for reachability analysis. The analysis result is not recorded in the system. If you want to record the path parameters and analysis result in the Network Intelligence Service (NIS) console, we recommend that you call the <strong>createNetworkReachableAnalysis</strong> operation.</p>
     * 
     * @param request the request parameters of CreateAndAnalyzeNetworkPath  CreateAndAnalyzeNetworkPathRequest
     * @return CreateAndAnalyzeNetworkPathResponse
     */
    CompletableFuture<CreateAndAnalyzeNetworkPathResponse> createAndAnalyzeNetworkPath(CreateAndAnalyzeNetworkPathRequest request);

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
    CompletableFuture<CreateNetworkPathResponse> createNetworkPath(CreateNetworkPathRequest request);

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
    CompletableFuture<CreateNetworkReachableAnalysisResponse> createNetworkReachableAnalysis(CreateNetworkReachableAnalysisRequest request);

    /**
     * @param request the request parameters of DeleteNetworkPath  DeleteNetworkPathRequest
     * @return DeleteNetworkPathResponse
     */
    CompletableFuture<DeleteNetworkPathResponse> deleteNetworkPath(DeleteNetworkPathRequest request);

    /**
     * @param request the request parameters of DeleteNetworkReachableAnalysis  DeleteNetworkReachableAnalysisRequest
     * @return DeleteNetworkReachableAnalysisResponse
     */
    CompletableFuture<DeleteNetworkReachableAnalysisResponse> deleteNetworkReachableAnalysis(DeleteNetworkReachableAnalysisRequest request);

    /**
     * @param request the request parameters of DeleteNisInspectionReport  DeleteNisInspectionReportRequest
     * @return DeleteNisInspectionReportResponse
     */
    CompletableFuture<DeleteNisInspectionReportResponse> deleteNisInspectionReport(DeleteNisInspectionReportRequest request);

    /**
     * @param request the request parameters of DeleteNisInspectionTask  DeleteNisInspectionTaskRequest
     * @return DeleteNisInspectionTaskResponse
     */
    CompletableFuture<DeleteNisInspectionTaskResponse> deleteNisInspectionTask(DeleteNisInspectionTaskRequest request);

    /**
     * @param request the request parameters of DescribeNisInspectionRecommendationResources  DescribeNisInspectionRecommendationResourcesRequest
     * @return DescribeNisInspectionRecommendationResourcesResponse
     */
    CompletableFuture<DescribeNisInspectionRecommendationResourcesResponse> describeNisInspectionRecommendationResources(DescribeNisInspectionRecommendationResourcesRequest request);

    /**
     * @param request the request parameters of DescribeNisInspectionReportCheckItems  DescribeNisInspectionReportCheckItemsRequest
     * @return DescribeNisInspectionReportCheckItemsResponse
     */
    CompletableFuture<DescribeNisInspectionReportCheckItemsResponse> describeNisInspectionReportCheckItems(DescribeNisInspectionReportCheckItemsRequest request);

    /**
     * @param request the request parameters of DescribeNisInspectionReportStatus  DescribeNisInspectionReportStatusRequest
     * @return DescribeNisInspectionReportStatusResponse
     */
    CompletableFuture<DescribeNisInspectionReportStatusResponse> describeNisInspectionReportStatus(DescribeNisInspectionReportStatusRequest request);

    /**
     * @param request the request parameters of DescribeNisInspectionReportSummary  DescribeNisInspectionReportSummaryRequest
     * @return DescribeNisInspectionReportSummaryResponse
     */
    CompletableFuture<DescribeNisInspectionReportSummaryResponse> describeNisInspectionReportSummary(DescribeNisInspectionReportSummaryRequest request);

    /**
     * @param request the request parameters of DescribeNisInspectionTask  DescribeNisInspectionTaskRequest
     * @return DescribeNisInspectionTaskResponse
     */
    CompletableFuture<DescribeNisInspectionTaskResponse> describeNisInspectionTask(DescribeNisInspectionTaskRequest request);

    /**
     * @deprecated OpenAPI GetInternetTuple is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.  * @param request  the request parameters of GetInternetTuple  GetInternetTupleRequest
     * @return GetInternetTupleResponse
     */
    @Deprecated
    CompletableFuture<GetInternetTupleResponse> getInternetTuple(GetInternetTupleRequest request);

    /**
     * @deprecated OpenAPI GetNatTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.  * @param request  the request parameters of GetNatTopN  GetNatTopNRequest
     * @return GetNatTopNResponse
     */
    @Deprecated
    CompletableFuture<GetNatTopNResponse> getNatTopN(GetNatTopNRequest request);

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
    CompletableFuture<GetNetworkReachableAnalysisResponse> getNetworkReachableAnalysis(GetNetworkReachableAnalysisRequest request);

    /**
     * @param request the request parameters of GetNisNetworkMetrics  GetNisNetworkMetricsRequest
     * @return GetNisNetworkMetricsResponse
     */
    CompletableFuture<GetNisNetworkMetricsResponse> getNisNetworkMetrics(GetNisNetworkMetricsRequest request);

    /**
     * @param request the request parameters of GetNisNetworkRanking  GetNisNetworkRankingRequest
     * @return GetNisNetworkRankingResponse
     */
    CompletableFuture<GetNisNetworkRankingResponse> getNisNetworkRanking(GetNisNetworkRankingRequest request);

    /**
     * @deprecated OpenAPI GetTransitRouterFlowTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.  * @param request  the request parameters of GetTransitRouterFlowTopN  GetTransitRouterFlowTopNRequest
     * @return GetTransitRouterFlowTopNResponse
     */
    @Deprecated
    CompletableFuture<GetTransitRouterFlowTopNResponse> getTransitRouterFlowTopN(GetTransitRouterFlowTopNRequest request);

    /**
     * @deprecated OpenAPI GetVbrFlowTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.  * @param request  the request parameters of GetVbrFlowTopN  GetVbrFlowTopNRequest
     * @return GetVbrFlowTopNResponse
     */
    @Deprecated
    CompletableFuture<GetVbrFlowTopNResponse> getVbrFlowTopN(GetVbrFlowTopNRequest request);

    /**
     * @param request the request parameters of ListNisInspectionResourceType  ListNisInspectionResourceTypeRequest
     * @return ListNisInspectionResourceTypeResponse
     */
    CompletableFuture<ListNisInspectionResourceTypeResponse> listNisInspectionResourceType(ListNisInspectionResourceTypeRequest request);

    /**
     * @param request the request parameters of ListNisInspectionTaskReports  ListNisInspectionTaskReportsRequest
     * @return ListNisInspectionTaskReportsResponse
     */
    CompletableFuture<ListNisInspectionTaskReportsResponse> listNisInspectionTaskReports(ListNisInspectionTaskReportsRequest request);

    /**
     * @param request the request parameters of ListNisInspectionTasks  ListNisInspectionTasksRequest
     * @return ListNisInspectionTasksResponse
     */
    CompletableFuture<ListNisInspectionTasksResponse> listNisInspectionTasks(ListNisInspectionTasksRequest request);

    /**
     * @param request the request parameters of StartNisInspectionTask  StartNisInspectionTaskRequest
     * @return StartNisInspectionTaskResponse
     */
    CompletableFuture<StartNisInspectionTaskResponse> startNisInspectionTask(StartNisInspectionTaskRequest request);

    /**
     * @param request the request parameters of UpdateNisInspectionTask  UpdateNisInspectionTaskRequest
     * @return UpdateNisInspectionTaskResponse
     */
    CompletableFuture<UpdateNisInspectionTaskResponse> updateNisInspectionTask(UpdateNisInspectionTaskRequest request);

}
