// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.fnf20190315.models.*;
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

    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    CompletableFuture<CreateScheduleResponse> createSchedule(CreateScheduleRequest request);

    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    CompletableFuture<DeleteScheduleResponse> deleteSchedule(DeleteScheduleRequest request);

    CompletableFuture<DescribeExecutionResponse> describeExecution(DescribeExecutionRequest request);

    CompletableFuture<DescribeFlowResponse> describeFlow(DescribeFlowRequest request);

    CompletableFuture<DescribeScheduleResponse> describeSchedule(DescribeScheduleRequest request);

    CompletableFuture<GetExecutionHistoryResponse> getExecutionHistory(GetExecutionHistoryRequest request);

    CompletableFuture<ListExecutionsResponse> listExecutions(ListExecutionsRequest request);

    CompletableFuture<ListFlowsResponse> listFlows(ListFlowsRequest request);

    CompletableFuture<ListSchedulesResponse> listSchedules(ListSchedulesRequest request);

    CompletableFuture<ReportTaskFailedResponse> reportTaskFailed(ReportTaskFailedRequest request);

    CompletableFuture<ReportTaskSucceededResponse> reportTaskSucceeded(ReportTaskSucceededRequest request);

    CompletableFuture<StartExecutionResponse> startExecution(StartExecutionRequest request);

    CompletableFuture<StopExecutionResponse> stopExecution(StopExecutionRequest request);

    CompletableFuture<UpdateFlowResponse> updateFlow(UpdateFlowRequest request);

    CompletableFuture<UpdateScheduleResponse> updateSchedule(UpdateScheduleRequest request);

}
