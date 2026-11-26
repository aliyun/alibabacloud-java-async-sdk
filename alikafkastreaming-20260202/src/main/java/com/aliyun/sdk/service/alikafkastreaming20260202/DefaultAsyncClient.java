// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.alikafkastreaming20260202.models.*;
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
        this.product = "AlikafkaStreaming";
        this.version = "2026-02-02";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
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
    @Override
    public CompletableFuture<CheckSqlContentResponse> checkSqlContent(CheckSqlContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckSqlContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckSqlContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckSqlContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateComputeInstanceResponse> createComputeInstance(CreateComputeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateComputeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComputeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComputeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateComputeJobResponse> createComputeJob(CreateComputeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateComputeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComputeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComputeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteComputeInstanceResponse> deleteComputeInstance(DeleteComputeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteComputeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteComputeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteComputeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteComputeJobResponse> deleteComputeJob(DeleteComputeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteComputeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteComputeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteComputeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetComputeInstance  GetComputeInstanceRequest
     * @return GetComputeInstanceResponse
     */
    @Override
    public CompletableFuture<GetComputeInstanceResponse> getComputeInstance(GetComputeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetComputeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComputeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComputeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetComputeJobResponse> getComputeJob(GetComputeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetComputeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComputeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComputeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJobDebugData  GetJobDebugDataRequest
     * @return GetJobDebugDataResponse
     */
    @Override
    public CompletableFuture<GetJobDebugDataResponse> getJobDebugData(GetJobDebugDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJobDebugData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobDebugDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobDebugDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListComputeInstances  ListComputeInstancesRequest
     * @return ListComputeInstancesResponse
     */
    @Override
    public CompletableFuture<ListComputeInstancesResponse> listComputeInstances(ListComputeInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListComputeInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComputeInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComputeInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListComputeInstancesInPage  ListComputeInstancesInPageRequest
     * @return ListComputeInstancesInPageResponse
     */
    @Override
    public CompletableFuture<ListComputeInstancesInPageResponse> listComputeInstancesInPage(ListComputeInstancesInPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListComputeInstancesInPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComputeInstancesInPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComputeInstancesInPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListComputeJobsResponse> listComputeJobs(ListComputeJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListComputeJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComputeJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComputeJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSupportedConnectors  ListSupportedConnectorsRequest
     * @return ListSupportedConnectorsResponse
     */
    @Override
    public CompletableFuture<ListSupportedConnectorsResponse> listSupportedConnectors(ListSupportedConnectorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSupportedConnectors").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSupportedConnectorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSupportedConnectorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ReopenComputeInstanceResponse> reopenComputeInstance(ReopenComputeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReopenComputeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReopenComputeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReopenComputeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartComputeJob  RestartComputeJobRequest
     * @return RestartComputeJobResponse
     */
    @Override
    public CompletableFuture<RestartComputeJobResponse> restartComputeJob(RestartComputeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartComputeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartComputeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartComputeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<StartComputeInstanceResponse> startComputeInstance(StartComputeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartComputeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartComputeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartComputeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<StartComputeJobResponse> startComputeJob(StartComputeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartComputeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartComputeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartComputeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<StopComputeInstanceResponse> stopComputeInstance(StopComputeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopComputeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopComputeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopComputeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation stops the production or debug running instance of a specified computing job.</li>
     * <li>A successful response indicates that the stop request has been accepted, but it does not mean that the job stops immediately.</li>
     * </ul>
     * 
     * @param request the request parameters of StopComputeJob  StopComputeJobRequest
     * @return StopComputeJobResponse
     */
    @Override
    public CompletableFuture<StopComputeJobResponse> stopComputeJob(StopComputeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopComputeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopComputeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopComputeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateComputeInstanceNameResponse> updateComputeInstanceName(UpdateComputeInstanceNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateComputeInstanceName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComputeInstanceNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComputeInstanceNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateComputeJobResponse> updateComputeJob(UpdateComputeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateComputeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComputeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComputeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation allows you to modify the compute unit (CU) limit and the number of reserved CUs for a specific compute job. Before calling this operation, ensure that the specified <code>InstanceId</code> and <code>JobName</code> are correct and that the instance is in the running state. Additionally, verify the validity and reasonableness of the <code>CuLimit</code> and <code>CuReserved</code> parameters to prevent request failures caused by exceeding limits or violating business logic.</p>
     * 
     * @param request the request parameters of UpdateComputeJobCu  UpdateComputeJobCuRequest
     * @return UpdateComputeJobCuResponse
     */
    @Override
    public CompletableFuture<UpdateComputeJobCuResponse> updateComputeJobCu(UpdateComputeJobCuRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateComputeJobCu").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComputeJobCuResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComputeJobCuResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateComputeJobDraftSqlResponse> updateComputeJobDraftSql(UpdateComputeJobDraftSqlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateComputeJobDraftSql").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComputeJobDraftSqlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComputeJobDraftSqlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
