// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alikafkastreaming20260202.models.*;
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>You can invoke this operation by using the GET or POST method.</li>
     * <li>You must specify the <code>InstanceId</code>, <code>JobName</code>, and <code>SqlContent</code> parameters. The <code>SqlContent</code> parameter specifies the Flink SQL statement to be validated.</li>
     * <li>In the response, the <code>Data.Valid</code> field indicates whether the SQL statement passed the validation. If the validation fails, the fault details are returned in the <code>Data.ErrorList</code> field.</li>
     * <li>The current version requires both the instance ID (<code>InstanceId</code>) and the job name (<code>JobName</code>) to build the job context.</li>
     * <li>A successful response only indicates that the system starts to execute the validation flow. It does not directly indicate whether the SQL statement is valid. Check the <code>Data.Valid</code> field to determine whether the SQL statement is valid.</li>
     * <li>For error codes and exception handling, refer to the Error codes section in the References.</li>
     * </ul>
     * 
     * @param request the request parameters of CheckSqlContent  CheckSqlContentRequest
     * @return CheckSqlContentResponse
     */
    CompletableFuture<CheckSqlContentResponse> checkSqlContent(CheckSqlContentRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a compute instance. This operation only completes the purchase phase. After the instance is created, call StartComputeInstance to complete network configuration and deployment.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: CreateComputeInstance</li>
     * </ul>
     * 
     * @param request the request parameters of CreateComputeInstance  CreateComputeInstanceRequest
     * @return CreateComputeInstanceResponse
     */
    CompletableFuture<CreateComputeInstanceResponse> createComputeInstance(CreateComputeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates a new Flink SQL job on a specified running compute instance.</li>
     * <li>The created job is in the <code>INIT</code> state.</li>
     * <li>You can control the resource usage of the job by setting <code>CuLimit</code> and <code>CuReserved</code>.</li>
     * <li>The <code>Remark</code> field allows you to add remarks to the job for easier management and identification.</li>
     * <li>Make sure that the <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are accurate. Otherwise, the request may fail.</li>
     * <li>If you attempt to create a job with a duplicate name, an error is returned.</li>
     * <li>The compute instance must be in the running state to successfully create a job.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateComputeJob  CreateComputeJobRequest
     * @return CreateComputeJobResponse
     */
    CompletableFuture<CreateComputeJobResponse> createComputeJob(CreateComputeJobRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a compute instance that is in the pending deployment, stopped, or released state.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: DeleteComputeInstance</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteComputeInstance  DeleteComputeInstanceRequest
     * @return DeleteComputeInstanceResponse
     */
    CompletableFuture<DeleteComputeInstanceResponse> deleteComputeInstance(DeleteComputeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation deletes a specific compute job.</li>
     * <li>A successful call to this operation only indicates that the deletion request has been accepted by the system. The deletion is not completed immediately.</li>
     * <li>Make sure that the <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are accurate. Otherwise, the request may fail.</li>
     * <li>If the compute instance or job is in a state that does not allow deletion, such as a non-running state, an error message is returned.</li>
     * <li>The deletion operation is irreversible. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteComputeJob  DeleteComputeJobRequest
     * @return DeleteComputeJobResponse
     */
    CompletableFuture<DeleteComputeJobResponse> deleteComputeJob(DeleteComputeJobRequest request);

    /**
     * @param request the request parameters of GetComputeInstance  GetComputeInstanceRequest
     * @return GetComputeInstanceResponse
     */
    CompletableFuture<GetComputeInstanceResponse> getComputeInstance(GetComputeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the details of a specified compute job.</li>
     * <li>You can use the GET or POST method to send requests.</li>
     * <li>The <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are required.</li>
     * <li>The authorization action is <code>alikafkastreaming:GetComputeJob</code>, and the access level is Read.</li>
     * </ul>
     * 
     * @param request the request parameters of GetComputeJob  GetComputeJobRequest
     * @return GetComputeJobResponse
     */
    CompletableFuture<GetComputeJobResponse> getComputeJob(GetComputeJobRequest request);

    /**
     * @param request the request parameters of GetJobDebugData  GetJobDebugDataRequest
     * @return GetJobDebugDataResponse
     */
    CompletableFuture<GetJobDebugDataResponse> getJobDebugData(GetJobDebugDataRequest request);

    /**
     * @param request the request parameters of ListComputeInstances  ListComputeInstancesRequest
     * @return ListComputeInstancesResponse
     */
    CompletableFuture<ListComputeInstancesResponse> listComputeInstances(ListComputeInstancesRequest request);

    /**
     * @param request the request parameters of ListComputeInstancesInPage  ListComputeInstancesInPageRequest
     * @return ListComputeInstancesInPageResponse
     */
    CompletableFuture<ListComputeInstancesInPageResponse> listComputeInstancesInPage(ListComputeInstancesInPageRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports a cursor-based paged query by using the <code>MaxResults</code> and <code>NextToken</code> parameters.</li>
     * <li>You do not need to specify <code>NextToken</code> in the first request. For subsequent requests, use the <code>NextToken</code> value returned in the previous response.</li>
     * <li>You can search by job name or remark, and specify different sorting fields and directions.</li>
     * <li>The authorization action is <code>alikafkastreaming:ListComputeJobs</code>. The access level is List, which applies to all resources.</li>
     * </ul>
     * 
     * @param request the request parameters of ListComputeJobs  ListComputeJobsRequest
     * @return ListComputeJobsResponse
     */
    CompletableFuture<ListComputeJobsResponse> listComputeJobs(ListComputeJobsRequest request);

    /**
     * @param request the request parameters of ListSupportedConnectors  ListSupportedConnectorsRequest
     * @return ListSupportedConnectorsResponse
     */
    CompletableFuture<ListSupportedConnectorsResponse> listSupportedConnectors(ListSupportedConnectorsRequest request);

    /**
     * <b>description</b> :
     * <p>Re-enables a stopped pay-as-you-go compute instance. A successful response indicates that the re-enablement request has been accepted.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: ReopenComputeInstance</li>
     * </ul>
     * 
     * @param request the request parameters of ReopenComputeInstance  ReopenComputeInstanceRequest
     * @return ReopenComputeInstanceResponse
     */
    CompletableFuture<ReopenComputeInstanceResponse> reopenComputeInstance(ReopenComputeInstanceRequest request);

    /**
     * @param request the request parameters of RestartComputeJob  RestartComputeJobRequest
     * @return RestartComputeJobResponse
     */
    CompletableFuture<RestartComputeJobResponse> restartComputeJob(RestartComputeJobRequest request);

    /**
     * <b>description</b> :
     * <p>Configures the network and deploys a compute instance in the pending deployment state.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: StartComputeInstance</li>
     * </ul>
     * 
     * @param request the request parameters of StartComputeInstance  StartComputeInstanceRequest
     * @return StartComputeInstanceResponse
     */
    CompletableFuture<StartComputeInstanceResponse> startComputeInstance(StartComputeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><code>RecoveryMode</code> supports two modes: <code>savepoint</code> and <code>stateless</code>. If you select the <code>savepoint</code> mode but no savepoint is available, an error is returned.</li>
     * <li>The <code>CuLimit</code> and <code>CuReserved</code> parameters are used to set the CU limit and the number of reserved CUs for the job, respectively. Integers and decimals are supported.</li>
     * <li>Make sure that the values of the <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are correct and exist. Otherwise, the request fails.</li>
     * </ul>
     * 
     * @param request the request parameters of StartComputeJob  StartComputeJobRequest
     * @return StartComputeJobResponse
     */
    CompletableFuture<StartComputeJobResponse> startComputeJob(StartComputeJobRequest request);

    /**
     * <b>description</b> :
     * <p>Stops a running pay-as-you-go compute instance. A successful response indicates that the stop request has been accepted.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: StopComputeInstance</li>
     * </ul>
     * 
     * @param request the request parameters of StopComputeInstance  StopComputeInstanceRequest
     * @return StopComputeInstanceResponse
     */
    CompletableFuture<StopComputeInstanceResponse> stopComputeInstance(StopComputeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation stops the production or debug runtime instance of a specified compute job.</li>
     * <li>A successful response indicates that the stop request has been accepted, but it does not mean that the job stops immediately.</li>
     * </ul>
     * 
     * @param request the request parameters of StopComputeJob  StopComputeJobRequest
     * @return StopComputeJobResponse
     */
    CompletableFuture<StopComputeJobResponse> stopComputeJob(StopComputeJobRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the name of a compute instance. The instance must be in the deployment preparation or running state.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: UpdateComputeInstanceName</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateComputeInstanceName  UpdateComputeInstanceNameRequest
     * @return UpdateComputeInstanceNameResponse
     */
    CompletableFuture<UpdateComputeInstanceNameResponse> updateComputeInstanceName(UpdateComputeInstanceNameRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Ensure that the provided <code>InstanceId</code> and <code>JobName</code> are valid. Otherwise, an error is returned.</li>
     * <li>You cannot execute this operation if the instance is not in the running state.</li>
     * <li>Modifications are not supported if the current job is running as a debug node or undergoing changes.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateComputeJob  UpdateComputeJobRequest
     * @return UpdateComputeJobResponse
     */
    CompletableFuture<UpdateComputeJobResponse> updateComputeJob(UpdateComputeJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation allows you to modify the compute unit (CU) limit and the number of reserved CUs for a specific compute job. Before calling this operation, ensure that the specified <code>InstanceId</code> and <code>JobName</code> are correct and that the instance is in the running state. Additionally, verify the validity and reasonableness of the <code>CuLimit</code> and <code>CuReserved</code> parameters to prevent request failures caused by exceeding limits or violating business logic.</p>
     * 
     * @param request the request parameters of UpdateComputeJobCu  UpdateComputeJobCuRequest
     * @return UpdateComputeJobCuResponse
     */
    CompletableFuture<UpdateComputeJobCuResponse> updateComputeJobCu(UpdateComputeJobCuRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation updates the Flink SQL draft saved for a specific compute job under a given compute instance. Make sure that the provided <code>InstanceId</code> and <code>JobName</code> are accurate, and the current status of the job supports SQL modification.</p>
     * <ul>
     * <li><strong>Precautions</strong>:<ul>
     * <li>Make sure that the target instance is in the running state.</li>
     * <li>The current job status must allow SQL modification. The job must not be undergoing debugging or modification.</li>
     * <li>The <code>DraftSql</code> parameter must contain a complete and correctly formatted Flink SQL statement.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateComputeJobDraftSql  UpdateComputeJobDraftSqlRequest
     * @return UpdateComputeJobDraftSqlResponse
     */
    CompletableFuture<UpdateComputeJobDraftSqlResponse> updateComputeJobDraftSql(UpdateComputeJobDraftSqlRequest request);

}
