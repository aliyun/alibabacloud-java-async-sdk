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

    /**
      * ## [](#)Usage notes
      * *   The number of flows that each user can create is restricted by resources. For more information, see [Limits](~~122093~~). If you want to create more flows, submit a ticket.
      * *   At the user level, flows are distinguished by name. The name of a flow within one account must be unique.
      *
     */
    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    CompletableFuture<CreateScheduleResponse> createSchedule(CreateScheduleRequest request);

    /**
      * ## [](#)Usage notes
      * A delete operation is asynchronous. If this operation is successful, the system returns a successful response. If an existing flow is pending to be deleted, a new flow of the same name will not be affected by the existing one. After you delete a flow, you cannot query its historical executions. All executions in progress will stop after their most recent steps are complete.
      *
     */
    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    CompletableFuture<DeleteScheduleResponse> deleteSchedule(DeleteScheduleRequest request);

    CompletableFuture<DescribeExecutionResponse> describeExecution(DescribeExecutionRequest request);

    CompletableFuture<DescribeFlowResponse> describeFlow(DescribeFlowRequest request);

    CompletableFuture<DescribeScheduleResponse> describeSchedule(DescribeScheduleRequest request);

    CompletableFuture<GetExecutionHistoryResponse> getExecutionHistory(GetExecutionHistoryRequest request);

    /**
      * ## [](#)Usage notes
      * After you delete a flow, you cannot query its historical executions, even if you create a flow of the same name.
      *
     */
    CompletableFuture<ListExecutionsResponse> listExecutions(ListExecutionsRequest request);

    CompletableFuture<ListFlowsResponse> listFlows(ListFlowsRequest request);

    CompletableFuture<ListSchedulesResponse> listSchedules(ListSchedulesRequest request);

    /**
      * ## [](#)Usage notes
      * You can use this operation to call back the task step of `pattern: waitForCallback`, which indicates that the current task fails to be executed.
      *
     */
    CompletableFuture<ReportTaskFailedResponse> reportTaskFailed(ReportTaskFailedRequest request);

    /**
      * ## [](#)Usage notes
      * You can use this operation to call back the task step of `pattern: waitForCallback`, which indicates that the current task is successfully executed.
      *
     */
    CompletableFuture<ReportTaskSucceededResponse> reportTaskSucceeded(ReportTaskSucceededRequest request);

    /**
      * ## [](#)Usage notes
      * *   The flow is created.
      * *   If you do not specify an execution, the system automatically generates an execution and starts the execution.
      * *   If an ongoing execution has the same name as that of the execution to be started, the system directly returns the ongoing execution.
      * *   If the ongoing execution with the same name has ended (succeeded or failed), the `ExecutionAlreadyExists` error is returned.
      * *   If no execution with the same name exists, the system starts a new execution.
      *
     */
    CompletableFuture<StartExecutionResponse> startExecution(StartExecutionRequest request);

    CompletableFuture<StartSyncExecutionResponse> startSyncExecution(StartSyncExecutionRequest request);

    /**
      * ## [](#)Usage notes
      * The flow must be in progress.
      *
     */
    CompletableFuture<StopExecutionResponse> stopExecution(StopExecutionRequest request);

    CompletableFuture<UpdateFlowResponse> updateFlow(UpdateFlowRequest request);

    CompletableFuture<UpdateScheduleResponse> updateSchedule(UpdateScheduleRequest request);

}
