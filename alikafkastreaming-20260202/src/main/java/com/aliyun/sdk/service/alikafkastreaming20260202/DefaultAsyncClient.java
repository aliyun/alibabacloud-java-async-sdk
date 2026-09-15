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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过 GET 或 POST 方法调用。</li>
     * <li>必须提供 <code>InstanceId</code>、<code>JobName</code> 和 <code>SqlContent</code> 参数，其中 <code>SqlContent</code> 是待校验的 Flink SQL 语句。</li>
     * <li>返回结果中，<code>Data.Valid</code> 字段指示 SQL 是否通过校验；若未通过，则错误详情位于 <code>Data.ErrorList</code> 中。</li>
     * <li>当前版本要求同时传入实例 ID (<code>InstanceId</code>) 和作业名称 (<code>JobName</code>) 以构建作业上下文。</li>
     * <li>接口返回成功仅表示校验流程执行完成，并不直接反映 SQL 的有效性，请检查 <code>Data.Valid</code> 字段来确定 SQL 是否有效。</li>
     * <li>错误码和异常处理请参考文档中的“错误码”部分。</li>
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
     * <p>创建一个计算实例。接口只完成购买阶段；创建成功后需调用 StartComputeInstance 完成网络配置和部署。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：CreateComputeInstance</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于在指定的运行中的计算实例上创建一个新的Flink SQL作业。</li>
     * <li>创建后的作业将处于<code>INIT</code>状态。</li>
     * <li>用户可以通过设置<code>CuLimit</code>和<code>CuReserved</code>来控制作业的资源使用情况。</li>
     * <li><code>Remark</code>字段允许用户为作业添加备注信息，便于管理和识别。</li>
     * <li>确保提供的<code>RegionId</code>、<code>InstanceId</code>以及<code>JobName</code>参数准确无误，否则可能导致请求失败。</li>
     * <li>如果尝试创建同名作业，则会返回错误提示。</li>
     * <li>计算实例必须处于运行状态才能成功创建作业。</li>
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
     * <p>删除处于待部署、已停止或已释放状态的计算实例。</p>
     * <ul>
     * <li>API版本：2026-02-02</li>
     * <li>Action：DeleteComputeInstance</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于删除一个特定的计算作业。</li>
     * <li>成功调用此接口仅表示删除请求已被系统接受，并非立即完成删除操作。</li>
     * <li>确保提供的<code>RegionId</code>、<code>InstanceId</code>以及<code>JobName</code>参数准确无误，否则可能导致请求失败。</li>
     * <li>如果计算实例或作业处于不允许删除的状态（例如：非运行状态），则会返回相应的错误信息。</li>
     * <li>删除操作不可逆，请谨慎使用。</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于查询指定计算作业的详情。</li>
     * <li>支持使用 GET 或 POST 方法进行请求。</li>
     * <li>所有时间字段以 Unix 时间戳形式返回，单位为毫秒。</li>
     * <li>必须提供 <code>RegionId</code>、<code>InstanceId</code> 和 <code>JobName</code> 参数。</li>
     * <li>授权操作为 <code>alikafkastreaming:GetComputeJob</code>，访问级别为读取（Read）。</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过 <code>MaxResults</code> 和 <code>NextToken</code> 参数进行游标分页查询。</li>
     * <li>首次请求时不需要传递 <code>NextToken</code>，后续请求需使用上一次响应中返回的 <code>NextToken</code> 值。</li>
     * <li>支持按作业名称或备注搜索，并可选择不同的排序字段和方向。</li>
     * <li>返回的时间字段均为 Unix 时间戳（单位：毫秒）。</li>
     * <li>授权操作为 <code>alikafkastreaming:ListComputeJobs</code>，访问级别为列出（List），适用于全部资源。</li>
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
     * <p>重新启用一个已停止的后付费计算实例。接口返回成功表示启用请求已受理。</p>
     * <ul>
     * <li>API版本：2026-02-02</li>
     * <li>Action：ReopenComputeInstance</li>
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
     * <p>为处于待部署状态的计算实例配置网络并发起部署。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：StartComputeInstance</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>RecoveryMode</code> 支持两种模式：<code>savepoint</code> 和 <code>stateless</code>。如果选择 <code>savepoint</code> 模式但没有可用的 savepoint，则会返回错误。</li>
     * <li><code>CuLimit</code> 和 <code>CuReserved</code> 参数分别用来设定作业的 CU 上限和预留 CU 数量，支持整数或小数形式输入。</li>
     * <li>确保提供的 <code>RegionId</code>, <code>InstanceId</code>, 和 <code>JobName</code> 参数值正确且存在，否则将导致请求失败。</li>
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
     * <p>停止一个正在运行的后付费计算实例。接口返回成功表示停止请求已受理。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：StopComputeInstance</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于停止指定的计算作业生产或 Debug 运行实例。</li>
     * <li>接口返回成功表示停止请求已被受理，但并不意味着作业立即停止。</li>
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
     * <p>修改计算实例名称。实例需处于部署准备阶段或运行中状态。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：UpdateComputeInstanceName</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>确保提供的 <code>InstanceId</code> 和 <code>JobName</code> 是有效的，否则将返回错误。</li>
     * <li>如果实例状态不在运行中，则不允许执行此操作。</li>
     * <li>当前作业状态如果为调试任务正在运行或变更中，则不支持修改。</li>
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
     * <h2>请求说明</h2>
     * <p>本API允许用户修改特定计算作业的计算单元（CU）上限和预留CU数量。在调用此接口前，请确保提供的<code>InstanceId</code>和<code>JobName</code>正确无误，并且实例处于运行状态。此外，注意检查<code>CuLimit</code>与<code>CuReserved</code>参数的有效性和合理性，避免因超出限制或不符合业务逻辑导致请求失败。</p>
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
     * <h2>请求说明</h2>
     * <p>本接口用于更新特定计算实例下的某个计算作业所保存的Flink SQL草稿内容。请确保提供的<code>InstanceId</code>和<code>JobName</code>准确无误，并且该作业当前状态支持进行SQL修改操作。</p>
     * <ul>
     * <li><strong>注意事项</strong>：<ul>
     * <li>确保目标实例处于运行状态。</li>
     * <li>当前作业状态需允许修改SQL，即作业不应处于调试或变更过程中。</li>
     * <li><code>DraftSql</code>参数应包含完整的、格式正确的Flink SQL语句。</li>
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
