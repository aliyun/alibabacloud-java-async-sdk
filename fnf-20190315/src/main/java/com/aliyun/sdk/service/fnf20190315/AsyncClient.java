// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.fnf20190315.models.*;
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The number of flows that each user can create is restricted by resources. For more information, see <a href="https://help.aliyun.com/document_detail/122093.html">Limits</a>. If you want to create more flows, submit a ticket.</li>
     * <li>At the user level, flows are distinguished by name. The name of a flow within one account must be unique.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFlow  CreateFlowRequest
     * @return CreateFlowResponse
     */
    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    /**
     * @param request the request parameters of CreateSchedule  CreateScheduleRequest
     * @return CreateScheduleResponse
     */
    CompletableFuture<CreateScheduleResponse> createSchedule(CreateScheduleRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>A delete operation is asynchronous. If this operation is successful, the system returns a successful response. If an existing flow is pending to be deleted, a new flow of the same name will not be affected by the existing one. After you delete a flow, you cannot query its historical executions. All executions in progress will stop after their most recent steps are complete.</p>
     * 
     * @param request the request parameters of DeleteFlow  DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    /**
     * @param request the request parameters of DeleteSchedule  DeleteScheduleRequest
     * @return DeleteScheduleResponse
     */
    CompletableFuture<DeleteScheduleResponse> deleteSchedule(DeleteScheduleRequest request);

    /**
     * @param request the request parameters of DescribeExecution  DescribeExecutionRequest
     * @return DescribeExecutionResponse
     */
    CompletableFuture<DescribeExecutionResponse> describeExecution(DescribeExecutionRequest request);

    /**
     * @param request the request parameters of DescribeFlow  DescribeFlowRequest
     * @return DescribeFlowResponse
     */
    CompletableFuture<DescribeFlowResponse> describeFlow(DescribeFlowRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeSchedule  DescribeScheduleRequest
     * @return DescribeScheduleResponse
     */
    CompletableFuture<DescribeScheduleResponse> describeSchedule(DescribeScheduleRequest request);

    /**
     * @param request the request parameters of GetExecutionHistory  GetExecutionHistoryRequest
     * @return GetExecutionHistoryResponse
     */
    CompletableFuture<GetExecutionHistoryResponse> getExecutionHistory(GetExecutionHistoryRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After you delete a flow, you cannot query its historical executions, even if you create a flow of the same name.</p>
     * 
     * @param request the request parameters of ListExecutions  ListExecutionsRequest
     * @return ListExecutionsResponse
     */
    CompletableFuture<ListExecutionsResponse> listExecutions(ListExecutionsRequest request);

    /**
     * @param request the request parameters of ListFlows  ListFlowsRequest
     * @return ListFlowsResponse
     */
    CompletableFuture<ListFlowsResponse> listFlows(ListFlowsRequest request);

    /**
     * @param request the request parameters of ListSchedules  ListSchedulesRequest
     * @return ListSchedulesResponse
     */
    CompletableFuture<ListSchedulesResponse> listSchedules(ListSchedulesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>In the previous service (Serverless Workflow), the task step that ReportTaskFailed is used to call back <code>pattern: waitForCallback</code> indicates that the current task fails to be executed.
     * In the new service (CloudFlow), the task step that ReportTaskFailed is used to call back <code>TaskMode: WaitForCustomCallback</code> indicates that the current task fails to be executed.</p>
     * 
     * @param request the request parameters of ReportTaskFailed  ReportTaskFailedRequest
     * @return ReportTaskFailedResponse
     */
    CompletableFuture<ReportTaskFailedResponse> reportTaskFailed(ReportTaskFailedRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>In the previous service (Serverless Workflow), the task step that ReportTaskSucceeded is used to call back pattern: waitForCallback indicates that the current task is successfully executed.
     * In the new service (CloudFlow), the task step that ReportTaskSucceeded is used to call back TaskMode: WaitForCustomCallback indicates that the current task is successfully executed.</p>
     * 
     * @param request the request parameters of ReportTaskSucceeded  ReportTaskSucceededRequest
     * @return ReportTaskSucceededResponse
     */
    CompletableFuture<ReportTaskSucceededResponse> reportTaskSucceeded(ReportTaskSucceededRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The flow is created. A flow only in standard mode is supported.</li>
     * <li>If you do not specify an execution, the system automatically generates an execution and starts the execution.</li>
     * <li>If an ongoing execution has the same name as that of the execution to be started, the system directly returns the ongoing execution.</li>
     * <li>If the ongoing execution with the same name has ended (succeeded or failed), <code>ExecutionAlreadyExists</code> is returned.</li>
     * <li>If no execution with the same name exists, the system starts a new execution.</li>
     * </ul>
     * 
     * @param request the request parameters of StartExecution  StartExecutionRequest
     * @return StartExecutionResponse
     */
    CompletableFuture<StartExecutionResponse> startExecution(StartExecutionRequest request);

    /**
     * <b>description</b> :
     * <p>  Only flows of the express execution mode are supported.</p>
     * 
     * @param request the request parameters of StartSyncExecution  StartSyncExecutionRequest
     * @return StartSyncExecutionResponse
     */
    CompletableFuture<StartSyncExecutionResponse> startSyncExecution(StartSyncExecutionRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The flow must be in progress.</p>
     * 
     * @param request the request parameters of StopExecution  StopExecutionRequest
     * @return StopExecutionResponse
     */
    CompletableFuture<StopExecutionResponse> stopExecution(StopExecutionRequest request);

    /**
     * @param request the request parameters of UpdateFlow  UpdateFlowRequest
     * @return UpdateFlowResponse
     */
    CompletableFuture<UpdateFlowResponse> updateFlow(UpdateFlowRequest request);

    /**
     * @param request the request parameters of UpdateSchedule  UpdateScheduleRequest
     * @return UpdateScheduleResponse
     */
    CompletableFuture<UpdateScheduleResponse> updateSchedule(UpdateScheduleRequest request);

}
