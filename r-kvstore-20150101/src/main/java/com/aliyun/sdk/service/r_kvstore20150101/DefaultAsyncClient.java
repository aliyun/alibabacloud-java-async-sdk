// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.r_kvstore20150101.models.*;
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
        this.product = "R-kvstore";
        this.version = "2015-01-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "r-kvstore.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-edge-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-fujian", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-wuhan", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "r-kvstore.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "r-kvstore.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddShardingNode  AddShardingNodeRequest
     * @return AddShardingNodeResponse
     */
    @Override
    public CompletableFuture<AddShardingNodeResponse> addShardingNode(AddShardingNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddShardingNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddShardingNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddShardingNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Clients can use the direct connection endpoint to bypass the proxy and connect to the cluster instance in the same way as they connect to a native Redis cluster. This reduces link overhead and further improves the response speed of the Tair (Redis® OSS-Compatible) database service.
     * To call this operation, the instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance uses the cluster architecture.</li>
     * <li>The deployment mode is classic.</li>
     * <li>The network type of the instance is VPC. If the instance is connected to the classic network, you can call the <a href="https://help.aliyun.com/document_detail/473797.html">SwitchNetwork</a> operation to switch the network type to VPC.</li>
     * <li>The Secure Sockets Layer (SSL) encryption feature is disabled for the instance. If the Secure Sockets Layer (SSL) encryption feature is enabled, you can call the <a href="https://help.aliyun.com/document_detail/473838.html">ModifyInstanceSSL</a> operation to shut down the feature.</li>
     * </ul>
     * 
     * @param request the request parameters of AllocateDirectConnection  AllocateDirectConnectionRequest
     * @return AllocateDirectConnectionResponse
     */
    @Override
    public CompletableFuture<AllocateDirectConnectionResponse> allocateDirectConnection(AllocateDirectConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateDirectConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateDirectConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateDirectConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/124920.html">Apply for a public endpoint</a>.</p>
     * 
     * @param request the request parameters of AllocateInstancePublicConnection  AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    @Override
    public CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateInstancePublicConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateInstancePublicConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateInstancePublicConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Scenarios where O&amp;M events cannot be canceled:</p>
     * <ul>
     * <li>allowCancel is 0.</li>
     * <li>The current time is later than the start time of the O&amp;M event.</li>
     * <li>The status of the O&amp;M event is not 3 (Pending execution).</li>
     * </ul>
     * 
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    @Override
    public CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelActiveOperationTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelActiveOperationTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelActiveOperationTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelInspectionTask  CancelInspectionTaskRequest
     * @return CancelInspectionTaskResponse
     */
    @Override
    public CompletableFuture<CancelInspectionTaskResponse> cancelInspectionTask(CancelInspectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelInspectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelInspectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelInspectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about Transparent Data Encryption (TDE) and precautions, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * <ul>
     * <li>After you call this operation to confirm the authorization, you can call the <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a> operation to enable TDE.</li>
     * </ul>
     * 
     * @param request the request parameters of CheckCloudResourceAuthorized  CheckCloudResourceAuthorizedRequest
     * @return CheckCloudResourceAuthorizedResponse
     */
    @Override
    public CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckCloudResourceAuthorized").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckCloudResourceAuthorizedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckCloudResourceAuthorizedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is supported only by instances that are compatible with Redis 4.0 or later.</p>
     * <ul>
     * <li>This API operation requires the instance to be in the Running state. </li>
     * <li>You can create up to 18 accounts for each instance.<blockquote>
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/92665.html">Account management</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    @Override
    public CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, refer to <a href="https://help.aliyun.com/document_detail/43886.html">Backup and recovery</a>.</p>
     * 
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    @Override
    public CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBackup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBackupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBackupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/184226.html">Real-time top key statistics and offline full key analysis</a> operation instead.</p>
     * 
     * @param request the request parameters of CreateCacheAnalysisTask  CreateCacheAnalysisTaskRequest
     * @return CreateCacheAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<CreateCacheAnalysisTaskResponse> createCacheAnalysisTask(CreateCacheAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCacheAnalysisTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCacheAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCacheAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to convert an existing instance into the first child instance of a distributed instance. After the conversion, the distributed instance to which the instance belongs is created.
     * The instance to be converted must meet the following requirements:</p>
     * <ul>
     * <li>The instance to be converted is a Tair <a href="https://help.aliyun.com/document_detail/126164.html">memory-optimized</a> (Classic Edition) instance.</li>
     * <li>If the instance to be converted uses the cluster architecture, the direct connection mode must be disabled. For more information, see <a href="https://help.aliyun.com/document_detail/150047.html">Release a direct connection endpoint</a>.<blockquote>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a> operation to purchase a new instance as the first child instance of a distributed instance. After the child instance is created, the distributed instance to which the child instance belongs is created.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateGlobalDistributeCache  CreateGlobalDistributeCacheRequest
     * @return CreateGlobalDistributeCacheResponse
     */
    @Override
    public CompletableFuture<CreateGlobalDistributeCacheResponse> createGlobalDistributeCache(CreateGlobalDistributeCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGlobalDistributeCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGlobalDistributeCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGlobalDistributeCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateGlobalSecurityIPGroup  CreateGlobalSecurityIPGroupRequest
     * @return CreateGlobalSecurityIPGroupResponse
     */
    @Override
    public CompletableFuture<CreateGlobalSecurityIPGroupResponse> createGlobalSecurityIPGroup(CreateGlobalSecurityIPGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGlobalSecurityIPGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGlobalSecurityIPGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGlobalSecurityIPGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInspectionSchedule  CreateInspectionScheduleRequest
     * @return CreateInspectionScheduleResponse
     */
    @Override
    public CompletableFuture<CreateInspectionScheduleResponse> createInspectionSchedule(CreateInspectionScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInspectionSchedule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInspectionScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInspectionScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInspectionTask  CreateInspectionTaskRequest
     * @return CreateInspectionTaskResponse
     */
    @Override
    public CompletableFuture<CreateInspectionTaskResponse> createInspectionTask(CreateInspectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInspectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInspectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInspectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of ApsaraDB for Redis (Tair) before you call this operation.
     * This operation allows you to create a Redis Community Edition instance or a Tair memory-optimized instance with the classic architecture. To create a Tair instance with the cloud-native architecture, call the <a href="https://help.aliyun.com/document_detail/473770.html">CreateTairInstance</a> operation.</p>
     * <blockquote>
     * <p>For information about how to create a Redis instance and select instance types in the console, see <a href="https://help.aliyun.com/document_detail/26351.html">Create a Redis instance</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstanceMultiVIP  CreateInstanceMultiVIPRequest
     * @return CreateInstanceMultiVIPResponse
     */
    @Override
    public CompletableFuture<CreateInstanceMultiVIPResponse> createInstanceMultiVIP(CreateInstanceMultiVIPRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstanceMultiVIP").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceMultiVIPResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceMultiVIPResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of the ApsaraDB for Tair (Redis-compatible) database.</p>
     * <blockquote>
     * <p>This operation only supports creating Classic Edition instances.
     * Use the following API operations to create a single instance:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a>: Creates an open-source Redis instance or a Tair memory-optimized Classic Edition instance.</li>
     * <li><a href="https://help.aliyun.com/document_detail/473770.html">CreateTairInstance</a>: Creates a Tair cloud-native instance (including memory-optimized, persistent memory-optimized, and disk-optimized instances).</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CreateInstances  CreateInstancesRequest
     * @return CreateInstancesResponse
     */
    @Override
    public CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Parameter templates apply only to instances in cloud-native deployment mode (formerly cloud disk instances).</p>
     * 
     * @param request the request parameters of CreateParameterGroup  CreateParameterGroupRequest
     * @return CreateParameterGroupResponse
     */
    @Override
    public CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateParameterGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateParameterGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateParameterGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTCInstance  CreateTCInstanceRequest
     * @return CreateTCInstanceResponse
     */
    @Override
    public CompletableFuture<CreateTCInstanceResponse> createTCInstance(CreateTCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTairAIGatewayInstance  CreateTairAIGatewayInstanceRequest
     * @return CreateTairAIGatewayInstanceResponse
     */
    @Override
    public CompletableFuture<CreateTairAIGatewayInstanceResponse> createTairAIGatewayInstance(CreateTairAIGatewayInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTairAIGatewayInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTairAIGatewayInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTairAIGatewayInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For selection reference, see <a href="https://help.aliyun.com/document_detail/223808.html">Must-read for selecting the ApsaraDB Tair database (Redis OSS-compatible)</a>.
     * Make sure you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of the ApsaraDB Tair database (Redis OSS-compatible) before you invoke this operation.</p>
     * <blockquote>
     * <ul>
     * <li>For console operations, see <a href="https://help.aliyun.com/document_detail/26351.html">Create a Tair instance</a>.</li>
     * <li>To create other types of instances, such as open-source or <a href="https://help.aliyun.com/document_detail/126164.html">Tair memory-optimized</a> classic edition instances, you can invoke the <a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CreateTairInstance  CreateTairInstanceRequest
     * @return CreateTairInstanceResponse
     */
    @Override
    public CompletableFuture<CreateTairInstanceResponse> createTairInstance(CreateTairInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTairInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTairInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTairInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTairKVCacheVNode  CreateTairKVCacheVNodeRequest
     * @return CreateTairKVCacheVNodeResponse
     */
    @Override
    public CompletableFuture<CreateTairKVCacheVNodeResponse> createTairKVCacheVNode(CreateTairKVCacheVNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTairKVCacheVNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTairKVCacheVNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTairKVCacheVNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before calling this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.htm">pricing details</a> of ApsaraDB for Redis.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTairSkvDdbTable  CreateTairSkvDdbTableRequest
     * @return CreateTairSkvDdbTableResponse
     */
    @Override
    public CompletableFuture<CreateTairSkvDdbTableResponse> createTairSkvDdbTable(CreateTairSkvDdbTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTairSkvDdbTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTairSkvDdbTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTairSkvDdbTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.htm">pricing details</a> of ApsaraDB for Redis.</li>
     * <li>To create a Tair Serverless KV table instance, use the <code>CreateTairSkvDdbTable</code> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTairSkvDdbWorkspace  CreateTairSkvDdbWorkspaceRequest
     * @return CreateTairSkvDdbWorkspaceResponse
     */
    @Override
    public CompletableFuture<CreateTairSkvDdbWorkspaceResponse> createTairSkvDdbWorkspace(CreateTairSkvDdbWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTairSkvDdbWorkspace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTairSkvDdbWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTairSkvDdbWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for instances that are compatible with Redis 4.0 or later.</p>
     * <ul>
     * <li>You can call this operation only when the instance is in the Running state.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    @Override
    public CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for cloud-native instances.</p>
     * 
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    @Override
    public CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before deleting an IP address whitelist template, disassociate the instances that are associated with the template.</p>
     * 
     * @param request the request parameters of DeleteGlobalSecurityIPGroup  DeleteGlobalSecurityIPGroupRequest
     * @return DeleteGlobalSecurityIPGroupResponse
     */
    @Override
    public CompletableFuture<DeleteGlobalSecurityIPGroupResponse> deleteGlobalSecurityIPGroup(DeleteGlobalSecurityIPGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGlobalSecurityIPGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGlobalSecurityIPGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGlobalSecurityIPGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/43882.html">Release an instance</a>.
     * When you invoke this operation, the instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The payer of the instance uses the pay-as-you-go billing method.<blockquote>
     * <p>You cannot invoke this operation to delete an upfront (subscription) instance. An upfront instance is subject to automatic release upon expiration. To delete an upfront instance in advance, use the console.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInspectionSchedule  DeleteInspectionScheduleRequest
     * @return DeleteInspectionScheduleResponse
     */
    @Override
    public CompletableFuture<DeleteInspectionScheduleResponse> deleteInspectionSchedule(DeleteInspectionScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInspectionSchedule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInspectionScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInspectionScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/43882.html">Release an instance</a>.
     * When you invoke this operation, the instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The payer of the instance uses the pay-as-you-go billing method.<blockquote>
     * <p>You cannot invoke this operation to manually delete an upfront (subscription) instance. Such instances undergo automatic release upon expiration. To release an upfront instance in advance, use the console.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteParameterGroup  DeleteParameterGroupRequest
     * @return DeleteParameterGroupResponse
     */
    @Override
    public CompletableFuture<DeleteParameterGroupResponse> deleteParameterGroup(DeleteParameterGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteParameterGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteParameterGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteParameterGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteShardingNode  DeleteShardingNodeRequest
     * @return DeleteShardingNodeResponse
     */
    @Override
    public CompletableFuture<DeleteShardingNodeResponse> deleteShardingNode(DeleteShardingNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteShardingNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteShardingNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteShardingNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    @Override
    public CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeActiveOperationMaintenanceConfig  DescribeActiveOperationMaintenanceConfigRequest
     * @return DescribeActiveOperationMaintenanceConfigResponse
     */
    @Override
    public CompletableFuture<DescribeActiveOperationMaintenanceConfigResponse> describeActiveOperationMaintenanceConfig(DescribeActiveOperationMaintenanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActiveOperationMaintenanceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActiveOperationMaintenanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActiveOperationMaintenanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation to query existing O&amp;M tasks, you can call <a href="https://help.aliyun.com/document_detail/473864.html">ModifyActiveOperationTask</a> to modify the scheduled switchover time of an O&amp;M task.</p>
     * 
     * @param request the request parameters of DescribeActiveOperationTask  DescribeActiveOperationTaskRequest
     * @return DescribeActiveOperationTaskResponse
     */
    @Override
    public CompletableFuture<DescribeActiveOperationTaskResponse> describeActiveOperationTask(DescribeActiveOperationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActiveOperationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActiveOperationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActiveOperationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeActiveOperationTaskCount  DescribeActiveOperationTaskCountRequest
     * @return DescribeActiveOperationTaskCountResponse
     */
    @Override
    public CompletableFuture<DescribeActiveOperationTaskCountResponse> describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActiveOperationTaskCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActiveOperationTaskCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActiveOperationTaskCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    @Override
    public CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActiveOperationTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActiveOperationTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActiveOperationTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, the audit log feature must be enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/473829.html">ModifyAuditLogConfig</a> or <a href="https://help.aliyun.com/document_detail/102015.html">Audit logs</a>.</p>
     * 
     * @param request the request parameters of DescribeAuditLogConfig  DescribeAuditLogConfigRequest
     * @return DescribeAuditLogConfigResponse
     */
    @Override
    public CompletableFuture<DescribeAuditLogConfigResponse> describeAuditLogConfig(DescribeAuditLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAuditLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAuditLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAuditLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, the audit log feature must be enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/473829.html">ModifyAuditLogConfig</a>.</p>
     * 
     * @param request the request parameters of DescribeAuditRecords  DescribeAuditRecordsRequest
     * @return DescribeAuditRecordsResponse
     */
    @Override
    public CompletableFuture<DescribeAuditRecordsResponse> describeAuditRecords(DescribeAuditRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAuditRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAuditRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAuditRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    @Override
    public CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupTasks  DescribeBackupTasksRequest
     * @return DescribeBackupTasksResponse
     */
    @Override
    public CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is not applicable to cloud-native cluster architecture instances. To query the backup sets of such instances, use the <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> operation.</p>
     * 
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    @Override
    public CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is deprecated. Use the new operation <a href="https://help.aliyun.com/document_detail/184226.html">Real-time top key statistics and offline full key analysis</a> instead.</p>
     * 
     * @param request the request parameters of DescribeCacheAnalysisReport  DescribeCacheAnalysisReportRequest
     * @return DescribeCacheAnalysisReportResponse
     */
    @Override
    public CompletableFuture<DescribeCacheAnalysisReportResponse> describeCacheAnalysisReport(DescribeCacheAnalysisReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCacheAnalysisReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCacheAnalysisReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCacheAnalysisReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is deprecated. Use the new API operation <a href="https://help.aliyun.com/document_detail/184226.html">Real-time top key statistics and offline full key analysis</a>.</p>
     * 
     * @param request the request parameters of DescribeCacheAnalysisReportList  DescribeCacheAnalysisReportListRequest
     * @return DescribeCacheAnalysisReportListResponse
     */
    @Override
    public CompletableFuture<DescribeCacheAnalysisReportListResponse> describeCacheAnalysisReportList(DescribeCacheAnalysisReportListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCacheAnalysisReportList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCacheAnalysisReportListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCacheAnalysisReportListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to cloud-native instances.</p>
     * 
     * @param request the request parameters of DescribeClusterBackupList  DescribeClusterBackupListRequest
     * @return DescribeClusterBackupListResponse
     */
    @Override
    public CompletableFuture<DescribeClusterBackupListResponse> describeClusterBackupList(DescribeClusterBackupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterBackupList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterBackupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterBackupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to <a href="https://help.aliyun.com/document_detail/188068.html">cloud-native instances</a> in the <a href="https://help.aliyun.com/document_detail/52228.html">cluster architecture</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeClusterMemberInfo  DescribeClusterMemberInfoRequest
     * @return DescribeClusterMemberInfoResponse
     */
    @Override
    public CompletableFuture<DescribeClusterMemberInfoResponse> describeClusterMemberInfo(DescribeClusterMemberInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterMemberInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterMemberInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterMemberInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBInstanceMonitor  DescribeDBInstanceMonitorRequest
     * @return DescribeDBInstanceMonitorResponse
     */
    @Override
    public CompletableFuture<DescribeDBInstanceMonitorResponse> describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBInstanceNetInfo  DescribeDBInstanceNetInfoRequest
     * @return DescribeDBInstanceNetInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceNetInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceNetInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceNetInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><notice>Only cloud-native instances support this operation.</notice></p>
     * 
     * @param request the request parameters of DescribeDBNodeDirectVipInfo  DescribeDBNodeDirectVipInfoRequest
     * @return DescribeDBNodeDirectVipInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDBNodeDirectVipInfoResponse> describeDBNodeDirectVipInfo(DescribeDBNodeDirectVipInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBNodeDirectVipInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBNodeDirectVipInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBNodeDirectVipInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDbInstanceConnectivity  DescribeDbInstanceConnectivityRequest
     * @return DescribeDbInstanceConnectivityResponse
     */
    @Override
    public CompletableFuture<DescribeDbInstanceConnectivityResponse> describeDbInstanceConnectivity(DescribeDbInstanceConnectivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDbInstanceConnectivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDbInstanceConnectivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDbInstanceConnectivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To query the information about instances that are not in a dedicated cluster, call <a href="https://help.aliyun.com/document_detail/473779.html">DescribeInstanceAttribute</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDedicatedClusterInstanceList  DescribeDedicatedClusterInstanceListRequest
     * @return DescribeDedicatedClusterInstanceListResponse
     */
    @Override
    public CompletableFuture<DescribeDedicatedClusterInstanceListResponse> describeDedicatedClusterInstanceList(DescribeDedicatedClusterInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedClusterInstanceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedClusterInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedClusterInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, the instance must have Transparent Data Encryption (TDE) enabled by using a custom key. For more information about the related operation, see <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a>.</p>
     * <blockquote>
     * <p>For more information about TDE and precautions, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeEncryptionKey  DescribeEncryptionKeyRequest
     * @return DescribeEncryptionKeyResponse
     */
    @Override
    public CompletableFuture<DescribeEncryptionKeyResponse> describeEncryptionKey(DescribeEncryptionKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEncryptionKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEncryptionKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEncryptionKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you invoke <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a> to enable transparent data encryption (TDE), you can use custom keys. This operation helps you query the custom keys used by the instance. To create a custom key, invoke the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation of Key Management Service (KMS).</p>
     * <ul>
     * <li>For more information and precautions about transparent data encryption (TDE), see <a href="https://help.aliyun.com/document_detail/265913.html">Enable transparent data encryption (TDE)</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeEncryptionKeyList  DescribeEncryptionKeyListRequest
     * @return DescribeEncryptionKeyListResponse
     */
    @Override
    public CompletableFuture<DescribeEncryptionKeyListResponse> describeEncryptionKeyList(DescribeEncryptionKeyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEncryptionKeyList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEncryptionKeyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEncryptionKeyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEngineVersion  DescribeEngineVersionRequest
     * @return DescribeEngineVersionResponse
     */
    @Override
    public CompletableFuture<DescribeEngineVersionResponse> describeEngineVersion(DescribeEngineVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEngineVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEngineVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEngineVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGlobalDistributeCache  DescribeGlobalDistributeCacheRequest
     * @return DescribeGlobalDistributeCacheResponse
     */
    @Override
    public CompletableFuture<DescribeGlobalDistributeCacheResponse> describeGlobalDistributeCache(DescribeGlobalDistributeCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalDistributeCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalDistributeCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalDistributeCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGlobalSecurityIPGroup  DescribeGlobalSecurityIPGroupRequest
     * @return DescribeGlobalSecurityIPGroupResponse
     */
    @Override
    public CompletableFuture<DescribeGlobalSecurityIPGroupResponse> describeGlobalSecurityIPGroup(DescribeGlobalSecurityIPGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalSecurityIPGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalSecurityIPGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalSecurityIPGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGlobalSecurityIPGroupRelation  DescribeGlobalSecurityIPGroupRelationRequest
     * @return DescribeGlobalSecurityIPGroupRelationResponse
     */
    @Override
    public CompletableFuture<DescribeGlobalSecurityIPGroupRelationResponse> describeGlobalSecurityIPGroupRelation(DescribeGlobalSecurityIPGroupRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalSecurityIPGroupRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalSecurityIPGroupRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalSecurityIPGroupRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHistoryEvents  DescribeHistoryEventsRequest
     * @return DescribeHistoryEventsResponse
     */
    @Override
    public CompletableFuture<DescribeHistoryEventsResponse> describeHistoryEvents(DescribeHistoryEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHistoryEventsStat  DescribeHistoryEventsStatRequest
     * @return DescribeHistoryEventsStatResponse
     */
    @Override
    public CompletableFuture<DescribeHistoryEventsStatResponse> describeHistoryEventsStat(DescribeHistoryEventsStatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryEventsStat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryEventsStatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryEventsStatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the console operation that corresponds to this API, see <a href="https://help.aliyun.com/document_detail/43887.html">Performance monitoring</a>.</p>
     * 
     * @param request the request parameters of DescribeHistoryMonitorValues  DescribeHistoryMonitorValuesRequest
     * @return DescribeHistoryMonitorValuesResponse
     */
    @Override
    public CompletableFuture<DescribeHistoryMonitorValuesResponse> describeHistoryMonitorValues(DescribeHistoryMonitorValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryMonitorValues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryMonitorValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryMonitorValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHistoryTasks  DescribeHistoryTasksRequest
     * @return DescribeHistoryTasksResponse
     */
    @Override
    public CompletableFuture<DescribeHistoryTasksResponse> describeHistoryTasks(DescribeHistoryTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHistoryTasksStat  DescribeHistoryTasksStatRequest
     * @return DescribeHistoryTasksStatResponse
     */
    @Override
    public CompletableFuture<DescribeHistoryTasksStatResponse> describeHistoryTasksStat(DescribeHistoryTasksStatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryTasksStat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryTasksStatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryTasksStatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInspectionScheduleReports  DescribeInspectionScheduleReportsRequest
     * @return DescribeInspectionScheduleReportsResponse
     */
    @Override
    public CompletableFuture<DescribeInspectionScheduleReportsResponse> describeInspectionScheduleReports(DescribeInspectionScheduleReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInspectionScheduleReports").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInspectionScheduleReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInspectionScheduleReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInspectionSchedules  DescribeInspectionSchedulesRequest
     * @return DescribeInspectionSchedulesResponse
     */
    @Override
    public CompletableFuture<DescribeInspectionSchedulesResponse> describeInspectionSchedules(DescribeInspectionSchedulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInspectionSchedules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInspectionSchedulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInspectionSchedulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInspectionTaskReport  DescribeInspectionTaskReportRequest
     * @return DescribeInspectionTaskReportResponse
     */
    @Override
    public CompletableFuture<DescribeInspectionTaskReportResponse> describeInspectionTaskReport(DescribeInspectionTaskReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInspectionTaskReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInspectionTaskReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInspectionTaskReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInspectionTasks  DescribeInspectionTasksRequest
     * @return DescribeInspectionTasksResponse
     */
    @Override
    public CompletableFuture<DescribeInspectionTasksResponse> describeInspectionTasks(DescribeInspectionTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInspectionTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInspectionTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInspectionTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceAttribute  DescribeInstanceAttributeRequest
     * @return DescribeInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceAutoRenewalAttribute  DescribeInstanceAutoRenewalAttributeRequest
     * @return DescribeInstanceAutoRenewalAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAutoRenewalAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAutoRenewalAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceConfig  DescribeInstanceConfigRequest
     * @return DescribeInstanceConfigResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceConfigResponse> describeInstanceConfig(DescribeInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about multiple load balancers, see.</p>
     * 
     * @param request the request parameters of DescribeInstanceMultiVIP  DescribeInstanceMultiVIPRequest
     * @return DescribeInstanceMultiVIPResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceMultiVIPResponse> describeInstanceMultiVIP(DescribeInstanceMultiVIPRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceMultiVIP").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceMultiVIPResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceMultiVIPResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceSSL  DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For detailed information and precautions about Transparent Data Encryption (TDE), see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a> to enable or disable TDE.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstanceTDEStatus  DescribeInstanceTDEStatusRequest
     * @return DescribeInstanceTDEStatusResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceTDEStatusResponse> describeInstanceTDEStatus(DescribeInstanceTDEStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTDEStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceTDEStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceTDEStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you do not specify request parameters, the overview information of all instances is returned.</p>
     * <blockquote>
     * <p>The response of this operation is not paginated.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstancesOverview  DescribeInstancesOverviewRequest
     * @return DescribeInstancesOverviewResponse
     */
    @Override
    public CompletableFuture<DescribeInstancesOverviewResponse> describeInstancesOverview(DescribeInstancesOverviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstancesOverview").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstancesOverviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstancesOverviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/473771.html">EnableAdditionalBandwidth</a> operation to purchase bandwidth for an instance.</p>
     * 
     * @param request the request parameters of DescribeIntranetAttribute  DescribeIntranetAttributeRequest
     * @return DescribeIntranetAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeIntranetAttributeResponse> describeIntranetAttribute(DescribeIntranetAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIntranetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIntranetAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIntranetAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only by instances that use the cluster or read/write splitting architecture.</p>
     * 
     * @param request the request parameters of DescribeLogicInstanceTopology  DescribeLogicInstanceTopologyRequest
     * @return DescribeLogicInstanceTopologyResponse
     */
    @Override
    public CompletableFuture<DescribeLogicInstanceTopologyResponse> describeLogicInstanceTopology(DescribeLogicInstanceTopologyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogicInstanceTopology").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogicInstanceTopologyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogicInstanceTopologyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To improve user experience, the ApsaraDB for Tair (Redis® OSS-Compatible) database has upgraded its performance monitoring feature, and this API operation will be taken offline. For more information, see <a href="https://help.aliyun.com/document_detail/189893.html">Notice: The DescribeMonitorItems API operation for ApsaraDB for Tair (Redis® OSS-Compatible) is taken offline</a>.
     * After you invoke this API operation to obtain the list of monitoring metrics, you can invoke the <a href="https://help.aliyun.com/document_detail/473827.html">DescribeHistoryMonitorValues</a> API operation to query the historical monitoring information of the instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeMonitorItems  DescribeMonitorItemsRequest
     * @return DescribeMonitorItemsResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorItemsResponse> describeMonitorItems(DescribeMonitorItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeParameterGroup  DescribeParameterGroupRequest
     * @return DescribeParameterGroupResponse
     */
    @Override
    public CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeParameterGroupSupportParam  DescribeParameterGroupSupportParamRequest
     * @return DescribeParameterGroupSupportParamResponse
     */
    @Override
    public CompletableFuture<DescribeParameterGroupSupportParamResponse> describeParameterGroupSupportParam(DescribeParameterGroupSupportParamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterGroupSupportParam").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterGroupSupportParamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterGroupSupportParamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeParameterGroupTemplateList  DescribeParameterGroupTemplateListRequest
     * @return DescribeParameterGroupTemplateListResponse
     */
    @Override
    public CompletableFuture<DescribeParameterGroupTemplateListResponse> describeParameterGroupTemplateList(DescribeParameterGroupTemplateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterGroupTemplateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterGroupTemplateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterGroupTemplateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeParameterGroups  DescribeParameterGroupsRequest
     * @return DescribeParameterGroupsResponse
     */
    @Override
    public CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeParameterModificationHistory  DescribeParameterModificationHistoryRequest
     * @return DescribeParameterModificationHistoryResponse
     */
    @Override
    public CompletableFuture<DescribeParameterModificationHistoryResponse> describeParameterModificationHistory(DescribeParameterModificationHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterModificationHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterModificationHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterModificationHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation to query the parameter list and default values, you can call the <a href="https://help.aliyun.com/document_detail/473844.html">ModifyInstanceConfig</a> operation to modify the parameters of the instance based on your business requirements.</p>
     * 
     * @param request the request parameters of DescribeParameterTemplates  DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     */
    @Override
    public CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeParameters  DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    @Override
    public CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    @Override
    public CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRoleZoneInfo  DescribeRoleZoneInfoRequest
     * @return DescribeRoleZoneInfoResponse
     */
    @Override
    public CompletableFuture<DescribeRoleZoneInfoResponse> describeRoleZoneInfo(DescribeRoleZoneInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRoleZoneInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRoleZoneInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRoleZoneInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/101713.html">Query running logs</a>.
     * The maximum number of calls to the DescribeRunningLogRecords operation is 100 per minute.</p>
     * 
     * @param request the request parameters of DescribeRunningLogRecords  DescribeRunningLogRecordsRequest
     * @return DescribeRunningLogRecordsResponse
     */
    @Override
    public CompletableFuture<DescribeRunningLogRecordsResponse> describeRunningLogRecords(DescribeRunningLogRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRunningLogRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRunningLogRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRunningLogRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecurityGroupConfiguration  DescribeSecurityGroupConfigurationRequest
     * @return DescribeSecurityGroupConfigurationResponse
     */
    @Override
    public CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroupConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityGroupConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityGroupConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecurityIps  DescribeSecurityIpsRequest
     * @return DescribeSecurityIpsResponse
     */
    @Override
    public CompletableFuture<DescribeSecurityIpsResponse> describeSecurityIps(DescribeSecurityIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can invoke this operation to query whether the authorization of the service-linked role named AliyunServiceRoleForKvstore is associated with the ApsaraDB Tair (Redis® OSS-Compatible) database within the current account. For more information, see <a href="https://help.aliyun.com/document_detail/184337.html">Service-linked role associated with ApsaraDB Tair (Redis® OSS-Compatible)</a>.</p>
     * 
     * @param request the request parameters of DescribeServiceLinkedRoleExists  DescribeServiceLinkedRoleExistsRequest
     * @return DescribeServiceLinkedRoleExistsResponse
     */
    @Override
    public CompletableFuture<DescribeServiceLinkedRoleExistsResponse> describeServiceLinkedRoleExists(DescribeServiceLinkedRoleExistsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeServiceLinkedRoleExists").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeServiceLinkedRoleExistsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeServiceLinkedRoleExistsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/95874.html">Query slow logs</a>.
     * The rate limit for the DescribeSlowLogRecords operation is 100 calls per minute.</p>
     * 
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    @Override
    public CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSlowLogRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSlowLogRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSlowLogRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    @Override
    public CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTairAIGatewayInstances  DescribeTairAIGatewayInstancesRequest
     * @return DescribeTairAIGatewayInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeTairAIGatewayInstancesResponse> describeTairAIGatewayInstances(DescribeTairAIGatewayInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairAIGatewayInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairAIGatewayInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairAIGatewayInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTairAIGatewayParameters  DescribeTairAIGatewayParametersRequest
     * @return DescribeTairAIGatewayParametersResponse
     */
    @Override
    public CompletableFuture<DescribeTairAIGatewayParametersResponse> describeTairAIGatewayParameters(DescribeTairAIGatewayParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairAIGatewayParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairAIGatewayParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairAIGatewayParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTairAIGatewayPluginSwitch  DescribeTairAIGatewayPluginSwitchRequest
     * @return DescribeTairAIGatewayPluginSwitchResponse
     */
    @Override
    public CompletableFuture<DescribeTairAIGatewayPluginSwitchResponse> describeTairAIGatewayPluginSwitch(DescribeTairAIGatewayPluginSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairAIGatewayPluginSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairAIGatewayPluginSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairAIGatewayPluginSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTairKVCacheCustomInstanceAttribute  DescribeTairKVCacheCustomInstanceAttributeRequest
     * @return DescribeTairKVCacheCustomInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeTairKVCacheCustomInstanceAttributeResponse> describeTairKVCacheCustomInstanceAttribute(DescribeTairKVCacheCustomInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairKVCacheCustomInstanceAttribute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairKVCacheCustomInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairKVCacheCustomInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTairKVCacheCustomInstanceHistoryMonitorValues  DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest
     * @return DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse
     */
    @Override
    public CompletableFuture<DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse> describeTairKVCacheCustomInstanceHistoryMonitorValues(DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairKVCacheCustomInstanceHistoryMonitorValues").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTairKVCacheCustomInstances  DescribeTairKVCacheCustomInstancesRequest
     * @return DescribeTairKVCacheCustomInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeTairKVCacheCustomInstancesResponse> describeTairKVCacheCustomInstances(DescribeTairKVCacheCustomInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairKVCacheCustomInstances").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairKVCacheCustomInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairKVCacheCustomInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTairKVCacheInferInstanceAttribute  DescribeTairKVCacheInferInstanceAttributeRequest
     * @return DescribeTairKVCacheInferInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeTairKVCacheInferInstanceAttributeResponse> describeTairKVCacheInferInstanceAttribute(DescribeTairKVCacheInferInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairKVCacheInferInstanceAttribute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairKVCacheInferInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairKVCacheInferInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries inference operator instances, virtual cluster instances, and cache service instances of Tair KVCache.</p>
     * 
     * @param request the request parameters of DescribeTairKVCacheInferInstances  DescribeTairKVCacheInferInstancesRequest
     * @return DescribeTairKVCacheInferInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeTairKVCacheInferInstancesResponse> describeTairKVCacheInferInstances(DescribeTairKVCacheInferInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairKVCacheInferInstances").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairKVCacheInferInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairKVCacheInferInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>When you call this operation, you must specify the <code>InstanceId</code> parameter.</li>
     * <li>The response includes the basic information of each table, such as the table ID, name, bandwidth, and maximum number of connections.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTairSkvDdbTable  DescribeTairSkvDdbTableRequest
     * @return DescribeTairSkvDdbTableResponse
     */
    @Override
    public CompletableFuture<DescribeTairSkvDdbTableResponse> describeTairSkvDdbTable(DescribeTairSkvDdbTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairSkvDdbTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairSkvDdbTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairSkvDdbTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the table schema and configuration information of a Tair Serverless KV table instance.</li>
     * <li>You must specify the <code>InstanceId</code> parameter when you call this operation, and set it to the ID of the instance that you want to query.</li>
     * <li>The <code>BackupId</code> parameter specifies the backup set of the table to query.</li>
     * <li>The returned data includes the time-to-live (TTL) specifications and detailed table schema definitions.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTairSkvDdbTableSchema  DescribeTairSkvDdbTableSchemaRequest
     * @return DescribeTairSkvDdbTableSchemaResponse
     */
    @Override
    public CompletableFuture<DescribeTairSkvDdbTableSchemaResponse> describeTairSkvDdbTableSchema(DescribeTairSkvDdbTableSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTairSkvDdbTableSchema").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTairSkvDdbTableSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTairSkvDdbTableSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTaskDetail  DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     */
    @Override
    public CompletableFuture<DescribeTaskDetailResponse> describeTaskDetail(DescribeTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    @Override
    public CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, the instances must exist in the recycle bin. For more information, see <a href="https://help.aliyun.com/document_detail/86114.html">Instance recycle bin</a>.</p>
     * <blockquote>
     * <p>After you call this operation, the instances and their data backups in the recycle bin are permanently deleted.
     * <danger>After this operation is performed, the data of the instances is permanently deleted and cannot be recovered. Proceed with caution.</danger></p>
     * </blockquote>
     * 
     * @param request the request parameters of DestroyInstance  DestroyInstanceRequest
     * @return DestroyInstanceResponse
     */
    @Override
    public CompletableFuture<DestroyInstanceResponse> destroyInstance(DestroyInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DestroyInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DestroyInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DestroyInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you enable the elastic bandwidth scaling feature for the instance when calling this operation, the elastic bandwidth scaling feature takes precedence. During an elastic bandwidth scale-down, the bandwidth reverts to the default bandwidth of the instance type. For more information about the limits, billing, and FAQs of this feature, see <a href="https://help.aliyun.com/document_detail/102588.html">Adjust instance bandwidth</a>.</p>
     * <blockquote>
     * <p>Before calling this operation, you can call <a href="https://help.aliyun.com/document_detail/473782.html">DescribeRoleZoneInfo</a> to query the current bandwidth of each data node in the instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EnableAdditionalBandwidth  EnableAdditionalBandwidthRequest
     * @return EnableAdditionalBandwidthResponse
     */
    @Override
    public CompletableFuture<EnableAdditionalBandwidthResponse> enableAdditionalBandwidth(EnableAdditionalBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableAdditionalBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableAdditionalBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableAdditionalBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/43881.html">Clear data</a>.</p>
     * <blockquote>
     * <p>Expired keys cannot be recovered after they are cleared. Use this API operation with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of FlushExpireKeys  FlushExpireKeysRequest
     * @return FlushExpireKeysResponse
     */
    @Override
    public CompletableFuture<FlushExpireKeysResponse> flushExpireKeys(FlushExpireKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FlushExpireKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlushExpireKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlushExpireKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding operation in the console, refer to <a href="https://help.aliyun.com/document_detail/43881.html">Clear data</a>.</p>
     * <blockquote>
     * <p>Before calling this API to delete data, back up your data or confirm that no backup is required.</p>
     * </blockquote>
     * 
     * @param request the request parameters of FlushInstance  FlushInstanceRequest
     * @return FlushInstanceResponse
     */
    @Override
    public CompletableFuture<FlushInstanceResponse> flushInstance(FlushInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FlushInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlushInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlushInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>An ApsaraDB Tair (Redis® OSS-Compatible) instance supports 256 databases, from DB0 to DB255. Each database does not have a separate memory usage limit. The memory capacity available for a database is constrained by the total memory of the instance. You can use the <code>SELECT</code> command to switch databases. For more information, see <a href="https://help.aliyun.com/document_detail/38688.html">Tair DB</a>.</p>
     * <blockquote>
     * <p>This operation is supported only by cloud-native instances (formerly cloud disk instances) in a cluster architecture.</p>
     * </blockquote>
     * 
     * @param request the request parameters of FlushInstanceForDB  FlushInstanceForDBRequest
     * @return FlushInstanceForDBResponse
     */
    @Override
    public CompletableFuture<FlushInstanceForDBResponse> flushInstanceForDB(FlushInstanceForDBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FlushInstanceForDB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlushInstanceForDBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlushInstanceForDBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantAccountPrivilege  GrantAccountPrivilegeRequest
     * @return GrantAccountPrivilegeResponse
     */
    @Override
    public CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantAccountPrivilege").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantAccountPrivilegeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantAccountPrivilegeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The log management feature of the ApsaraDB for Tair (Redis® OSS-Compatible) database requires resources from <a href="https://help.aliyun.com/document_detail/48869.html">Simple Log Service</a>. Before using the log management feature, invoke this operation to associate the service-linked role named AliyunServiceRoleForKvstore with the ApsaraDB for Tair (Redis® OSS-Compatible) database and grant the required authorization. For more information, see <a href="https://help.aliyun.com/document_detail/184337.html">Service-linked role for ApsaraDB for Tair (Redis® OSS-Compatible)</a>.</p>
     * 
     * @param request the request parameters of InitializeKvstorePermission  InitializeKvstorePermissionRequest
     * @return InitializeKvstorePermissionResponse
     */
    @Override
    public CompletableFuture<InitializeKvstorePermissionResponse> initializeKvstorePermission(InitializeKvstorePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitializeKvstorePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitializeKvstorePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitializeKvstorePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operations of this API, refer to <a href="https://help.aliyun.com/document_detail/119160.html">Filter instances by tag</a> and <a href="https://help.aliyun.com/document_detail/134038.html">View tags bound to an instance</a>.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LockDBInstanceWrite  LockDBInstanceWriteRequest
     * @return LockDBInstanceWriteResponse
     */
    @Override
    public CompletableFuture<LockDBInstanceWriteResponse> lockDBInstanceWrite(LockDBInstanceWriteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LockDBInstanceWrite").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LockDBInstanceWriteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LockDBInstanceWriteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you call this operation, the specified node is shut down. The instance automatically triggers a primary/secondary switchover to promote the secondary node to the primary node.</li>
     * <li>The node with the simulated failure automatically recovers later.</li>
     * <li>This operation is not supported for single-node (single-replica) instances.</li>
     * </ul>
     * 
     * @param request the request parameters of MasterNodeShutDownFailOver  MasterNodeShutDownFailOverRequest
     * @return MasterNodeShutDownFailOverResponse
     */
    @Override
    public CompletableFuture<MasterNodeShutDownFailOverResponse> masterNodeShutDownFailOver(MasterNodeShutDownFailOverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MasterNodeShutDownFailOver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MasterNodeShutDownFailOverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MasterNodeShutDownFailOverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must release the public endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/106272.html">Migrate an instance across zones</a>.</p>
     * <blockquote>
     * <ul>
     * <li>If the instance was switched from the classic network to a VPC and the classic network endpoint is retained, you must wait until the classic network endpoint expires and is released before you can migrate the instance across zones.</li>
     * <li>After the migration, the endpoint of the instance remains unchanged, but the virtual IP address (VIP) changes. Use the endpoint instead of the VIP to connect to the instance in your business applications.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of MigrateToOtherZone  MigrateToOtherZoneRequest
     * @return MigrateToOtherZoneResponse
     */
    @Override
    public CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MigrateToOtherZone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateToOtherZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateToOtherZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation supports only instances that are compatible with Redis 4.0 or later.</p>
     * 
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    @Override
    public CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccountDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccountDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccountDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for Tair Serverless KV instances.</p>
     * 
     * @param request the request parameters of ModifyAccountParameter  ModifyAccountParameterRequest
     * @return ModifyAccountParameterResponse
     */
    @Override
    public CompletableFuture<ModifyAccountParameterResponse> modifyAccountParameter(ModifyAccountParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccountParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccountParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccountParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAccountPassword  ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     */
    @Override
    public CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccountPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccountPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccountPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyActiveOperationMaintainConfig  ModifyActiveOperationMaintainConfigRequest
     * @return ModifyActiveOperationMaintainConfigResponse
     */
    @Override
    public CompletableFuture<ModifyActiveOperationMaintainConfigResponse> modifyActiveOperationMaintainConfig(ModifyActiveOperationMaintainConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyActiveOperationMaintainConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyActiveOperationMaintainConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyActiveOperationMaintainConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>O&amp;M events for ApsaraDB for Tair (Redis® OSS-Compatible) database instances, such as instance migration and version upgrades, are notified through SMS, voice calls, emails, or internal messages, as well as in the console. You can invoke this operation to modify the scheduled switchover time. Alternatively, you can modify it in the console. For more information, see <a href="https://help.aliyun.com/document_detail/187022.html">Query or manage pending events</a>.</p>
     * 
     * @param request the request parameters of ModifyActiveOperationTask  ModifyActiveOperationTaskRequest
     * @return ModifyActiveOperationTaskResponse
     */
    @Override
    public CompletableFuture<ModifyActiveOperationTaskResponse> modifyActiveOperationTask(ModifyActiveOperationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyActiveOperationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyActiveOperationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyActiveOperationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    @Override
    public CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyActiveOperationTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyActiveOperationTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyActiveOperationTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of audit logs.</p>
     * 
     * @param request the request parameters of ModifyAuditLogConfig  ModifyAuditLogConfigRequest
     * @return ModifyAuditLogConfigResponse
     */
    @Override
    public CompletableFuture<ModifyAuditLogConfigResponse> modifyAuditLogConfig(ModifyAuditLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAuditLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAuditLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAuditLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyBackupExpireTime  ModifyBackupExpireTimeRequest
     * @return ModifyBackupExpireTimeResponse
     */
    @Override
    public CompletableFuture<ModifyBackupExpireTimeResponse> modifyBackupExpireTime(ModifyBackupExpireTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBackupExpireTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBackupExpireTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBackupExpireTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBInstanceAutoUpgrade  ModifyDBInstanceAutoUpgradeRequest
     * @return ModifyDBInstanceAutoUpgradeResponse
     */
    @Override
    public CompletableFuture<ModifyDBInstanceAutoUpgradeResponse> modifyDBInstanceAutoUpgrade(ModifyDBInstanceAutoUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceAutoUpgrade").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceAutoUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceAutoUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/85683.html">Modify endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceConnectionString  ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    @Override
    public CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceConnectionString").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceConnectionStringResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceConnectionStringResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBInstanceMonitor  ModifyDBInstanceMonitorRequest
     * @return ModifyDBInstanceMonitorResponse
     */
    @Override
    public CompletableFuture<ModifyDBInstanceMonitorResponse> modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyEventInfo  ModifyEventInfoRequest
     * @return ModifyEventInfoResponse
     */
    @Override
    public CompletableFuture<ModifyEventInfoResponse> modifyEventInfo(ModifyEventInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyEventInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyEventInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyEventInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyGlobalSecurityIPGroup  ModifyGlobalSecurityIPGroupRequest
     * @return ModifyGlobalSecurityIPGroupResponse
     */
    @Override
    public CompletableFuture<ModifyGlobalSecurityIPGroupResponse> modifyGlobalSecurityIPGroup(ModifyGlobalSecurityIPGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGlobalSecurityIPGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGlobalSecurityIPGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGlobalSecurityIPGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyGlobalSecurityIPGroupName  ModifyGlobalSecurityIPGroupNameRequest
     * @return ModifyGlobalSecurityIPGroupNameResponse
     */
    @Override
    public CompletableFuture<ModifyGlobalSecurityIPGroupNameResponse> modifyGlobalSecurityIPGroupName(ModifyGlobalSecurityIPGroupNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGlobalSecurityIPGroupName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGlobalSecurityIPGroupNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGlobalSecurityIPGroupNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyGlobalSecurityIPGroupRelation  ModifyGlobalSecurityIPGroupRelationRequest
     * @return ModifyGlobalSecurityIPGroupRelationResponse
     */
    @Override
    public CompletableFuture<ModifyGlobalSecurityIPGroupRelationResponse> modifyGlobalSecurityIPGroupRelation(ModifyGlobalSecurityIPGroupRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGlobalSecurityIPGroupRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGlobalSecurityIPGroupRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGlobalSecurityIPGroupRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInspectionSchedule  ModifyInspectionScheduleRequest
     * @return ModifyInspectionScheduleResponse
     */
    @Override
    public CompletableFuture<ModifyInspectionScheduleResponse> modifyInspectionSchedule(ModifyInspectionScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInspectionSchedule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInspectionScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInspectionScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Auto-renewal is triggered 7 days before the instance expires.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceAutoRenewalAttribute  ModifyInstanceAutoRenewalAttributeRequest
     * @return ModifyInstanceAutoRenewalAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAutoRenewalAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAutoRenewalAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you fully understand the bandwidth billing method and pricing of the instance. Tair (Redis® OSS-Compatible) charges hourly fees based on the increased bandwidth and usage duration. Billing standards vary by region. For more information, see <a href="https://help.aliyun.com/document_detail/54532.html">Billable items</a>.</li>
     * <li>An instance or a single shard supports an additional bandwidth increase of up to 6 times the default bandwidth of the original instance, with a maximum increase limit of 192 MB/s. For example, the default bandwidth of a 2 GB standard-architecture Tair memory-optimized instance is 96 MB/s. The bandwidth for this specification can be increased by up to 192 MB/s, resulting in a maximum instance bandwidth of 288 MB/s. The default bandwidth of a 256 MB standard-architecture open-source Redis instance is 10 MB/s. The bandwidth for this specification can be increased by up to 60 MB/s, resulting in a maximum instance bandwidth of 70 MB/s.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceBandwidth  ModifyInstanceBandwidthRequest
     * @return ModifyInstanceBandwidthResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceBandwidthResponse> modifyInstanceBandwidth(ModifyInstanceBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstanceConfig  ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/55252.html">Set the maintenance window</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceMaintainTime  ModifyInstanceMaintainTimeRequest
     * @return ModifyInstanceMaintainTimeResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMaintainTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceMaintainTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceMaintainTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For precautions and impacts of this API operation, see <a href="https://help.aliyun.com/document_detail/101764.html">Upgrade the major version</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceMajorVersion  ModifyInstanceMajorVersionRequest
     * @return ModifyInstanceMajorVersionResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceMajorVersionResponse> modifyInstanceMajorVersion(ModifyInstanceMajorVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMajorVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceMajorVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceMajorVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The upgrade process varies based on the architecture. For more information, see <a href="https://help.aliyun.com/document_detail/56450.html">Minor engine version upgrade principles</a>.</p>
     * <blockquote>
     * <ul>
     * <li>Before calling this operation, you can call <a href="https://help.aliyun.com/document_detail/473781.html">DescribeEngineVersion</a> to query the current minor engine version of the instance.</li>
     * <li>During an instance switchover or primary/secondary switchover, the instance remains in a read-only state for up to 60 seconds while waiting for data to be fully synchronized. Transient disconnections that last for a few seconds may also occur. Perform the upgrade during off-peak hours and ensure that your application is configured with a reconnection mechanism.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceMinorVersion  ModifyInstanceMinorVersionRequest
     * @return ModifyInstanceMinorVersionResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceMinorVersionResponse> modifyInstanceMinorVersion(ModifyInstanceMinorVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMinorVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceMinorVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceMinorVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation of this API operation, refer to <a href="https://help.aliyun.com/document_detail/60062.html">Modify the validity period of the original classic network endpoint</a>.</p>
     * <blockquote>
     * <p>For information about how to switch an instance from the classic network to a VPC, refer to <a href="https://help.aliyun.com/document_detail/473797.html">SwitchNetwork</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceNetExpireTime  ModifyInstanceNetExpireTimeRequest
     * @return ModifyInstanceNetExpireTimeResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceNetExpireTimeResponse> modifyInstanceNetExpireTime(ModifyInstanceNetExpireTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceNetExpireTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceNetExpireTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceNetExpireTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstanceParameter  ModifyInstanceParameterRequest
     * @return ModifyInstanceParameterResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceParameterResponse> modifyInstanceParameter(ModifyInstanceParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/84898.html">Settings for Secure Sockets Layer (SSL) encryption</a>.</p>
     * <blockquote>
     * <p>To specify the minimum SSL version, you can invoke the <a href="https://help.aliyun.com/document_detail/473844.html">ModifyInstanceConfig</a> operation to modify the parameter.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceSSL  ModifyInstanceSSLRequest
     * @return ModifyInstanceSSLResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For information about the execution process, impacts, feature limits, and billing of changing instance specifications, see <a href="https://help.aliyun.com/document_detail/26353.html">Change the configurations of an instance</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For detailed information about Transparent Data Encryption (TDE) and the impacts of enabling it, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable Transparent Data Encryption (TDE)</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceTDE  ModifyInstanceTDERequest
     * @return ModifyInstanceTDEResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceTDEResponse> modifyInstanceTDE(ModifyInstanceTDERequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceTDE").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceTDEResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceTDEResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For information about how to perform this operation in the console, see <a href="https://help.aliyun.com/document_detail/85168.html">Enable password-free access</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceVpcAuthMode  ModifyInstanceVpcAuthModeRequest
     * @return ModifyInstanceVpcAuthModeResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceVpcAuthModeResponse> modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceVpcAuthMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceVpcAuthModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceVpcAuthModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation applies only to instances created in dedicated clusters&lt;props=&quot;china&quot;&gt;. For information about the related console operations and limits, see <a href="https://help.aliyun.com/document_detail/206257.html">Modify bandwidth policies</a>. To adjust the bandwidth of a regular instance, call the <a href="https://help.aliyun.com/document_detail/473771.html">EnableAdditionalBandwidth</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyIntranetAttribute  ModifyIntranetAttributeRequest
     * @return ModifyIntranetAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyIntranetAttributeResponse> modifyIntranetAttribute(ModifyIntranetAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIntranetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIntranetAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIntranetAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyParameterGroup  ModifyParameterGroupRequest
     * @return ModifyParameterGroupResponse
     */
    @Override
    public CompletableFuture<ModifyParameterGroupResponse> modifyParameterGroup(ModifyParameterGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyParameterGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyParameterGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyParameterGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can also perform this operation in the <a href="https://resourcemanager.console.aliyun.com/resource-center">Resource Management</a> console. For more information, see <a href="https://help.aliyun.com/document_detail/94487.html">Transfer resources across resource groups</a>.</p>
     * <blockquote>
     * <p>A resource group is a mechanism for grouping and managing resources within an Alibaba Cloud account. Resource groups help you simplify resource grouping and authorization management within a single Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyResourceGroup  ModifyResourceGroupRequest
     * @return ModifyResourceGroupResponse
     */
    @Override
    public CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation overwrites the existing security groups in the instance whitelist and adds the security groups specified in the <strong>SecurityGroupId</strong> parameter to the whitelist. For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/148267.html">Add security groups</a>.</p>
     * 
     * @param request the request parameters of ModifySecurityGroupConfiguration  ModifySecurityGroupConfigurationRequest
     * @return ModifySecurityGroupConfigurationResponse
     */
    @Override
    public CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/56464.html">Configure the IP whitelist</a>.</p>
     * 
     * @param request the request parameters of ModifySecurityIps  ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    @Override
    public CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTairAIGatewayParameter  ModifyTairAIGatewayParameterRequest
     * @return ModifyTairAIGatewayParameterResponse
     */
    @Override
    public CompletableFuture<ModifyTairAIGatewayParameterResponse> modifyTairAIGatewayParameter(ModifyTairAIGatewayParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTairAIGatewayParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTairAIGatewayParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTairAIGatewayParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTairAIGatewayPluginSwitch  ModifyTairAIGatewayPluginSwitchRequest
     * @return ModifyTairAIGatewayPluginSwitchResponse
     */
    @Override
    public CompletableFuture<ModifyTairAIGatewayPluginSwitchResponse> modifyTairAIGatewayPluginSwitch(ModifyTairAIGatewayPluginSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTairAIGatewayPluginSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTairAIGatewayPluginSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTairAIGatewayPluginSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTairKVCacheCustomInstanceAttribute  ModifyTairKVCacheCustomInstanceAttributeRequest
     * @return ModifyTairKVCacheCustomInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyTairKVCacheCustomInstanceAttributeResponse> modifyTairKVCacheCustomInstanceAttribute(ModifyTairKVCacheCustomInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTairKVCacheCustomInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTairKVCacheCustomInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTairKVCacheCustomInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTaskInfo  ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     */
    @Override
    public CompletableFuture<ModifyTaskInfoResponse> modifyTaskInfo(ModifyTaskInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTaskInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTaskInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTaskInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for instances that use the cluster architecture in proxy mode or the read/write splitting architecture. For more information, see <a href="https://help.aliyun.com/document_detail/164224.html">Restart or rebuild proxy nodes</a>.</p>
     * 
     * @param request the request parameters of RebootProxy  RebootProxyRequest
     * @return RebootProxyResponse
     */
    @Override
    public CompletableFuture<RebootProxyResponse> rebootProxy(RebootProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Clients can use the direct connection endpoint to bypass proxies and connect to an ApsaraDB for Tair (Redis® OSS-Compatible) database cluster in the same way as connecting to a native Redis cluster. This reduces link overhead and further improves the response speed of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/146901.html">Enable direct connection access</a>.</p>
     * 
     * @param request the request parameters of ReleaseDirectConnection  ReleaseDirectConnectionRequest
     * @return ReleaseDirectConnectionResponse
     */
    @Override
    public CompletableFuture<ReleaseDirectConnectionResponse> releaseDirectConnection(ReleaseDirectConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseDirectConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseDirectConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseDirectConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/125424.html">Release a public endpoint</a>.</p>
     * 
     * @param request the request parameters of ReleaseInstancePublicConnection  ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    @Override
    public CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseInstancePublicConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseInstancePublicConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseInstancePublicConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the conversion is complete, the child instance becomes a regular instance. You can find and manage the instance in the instance list of the corresponding region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveSubInstance  RemoveSubInstanceRequest
     * @return RemoveSubInstanceResponse
     */
    @Override
    public CompletableFuture<RemoveSubInstanceResponse> removeSubInstance(RemoveSubInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveSubInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveSubInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveSubInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is deprecated. You can purchase bandwidth for an instance by using the console (<a href="https://help.aliyun.com/document_detail/102588.html">Adjust instance bandwidth</a>) or by calling the <a href="https://help.aliyun.com/document_detail/473771.html">EnableAdditionalBandwidth</a> operation.</p>
     * 
     * @param request the request parameters of RenewAdditionalBandwidth  RenewAdditionalBandwidthRequest
     * @return RenewAdditionalBandwidthResponse
     */
    @Override
    public CompletableFuture<RenewAdditionalBandwidthResponse> renewAdditionalBandwidth(RenewAdditionalBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewAdditionalBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewAdditionalBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewAdditionalBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    @Override
    public CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is supported only by Redis instances of version 4.0 or later.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    @Override
    public CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetAccountPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetAccountPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetAccountPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetTairKVCacheCustomInstancePassword  ResetTairKVCacheCustomInstancePasswordRequest
     * @return ResetTairKVCacheCustomInstancePasswordResponse
     */
    @Override
    public CompletableFuture<ResetTairKVCacheCustomInstancePasswordResponse> resetTairKVCacheCustomInstancePassword(ResetTairKVCacheCustomInstancePasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetTairKVCacheCustomInstancePassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetTairKVCacheCustomInstancePasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetTairKVCacheCustomInstancePasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResizeTairKVCacheCustomInstanceDisk  ResizeTairKVCacheCustomInstanceDiskRequest
     * @return ResizeTairKVCacheCustomInstanceDiskResponse
     */
    @Override
    public CompletableFuture<ResizeTairKVCacheCustomInstanceDiskResponse> resizeTairKVCacheCustomInstanceDisk(ResizeTairKVCacheCustomInstanceDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResizeTairKVCacheCustomInstanceDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResizeTairKVCacheCustomInstanceDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResizeTairKVCacheCustomInstanceDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    @Override
    public CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartTairKVCacheCustomInstance  RestartTairKVCacheCustomInstanceRequest
     * @return RestartTairKVCacheCustomInstanceResponse
     */
    @Override
    public CompletableFuture<RestartTairKVCacheCustomInstanceResponse> restartTairKVCacheCustomInstance(RestartTairKVCacheCustomInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartTairKVCacheCustomInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartTairKVCacheCustomInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartTairKVCacheCustomInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If your instance is a Tair (Enterprise Edition) memory-optimized instance with the classic architecture, you can call this operation to restore specified keys in the current instance to a specific point in time accurate to seconds. This enables more fine-grained data restoration.</p>
     * <ul>
     * <li>For other types of instances, call the <a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a> or <a href="https://help.aliyun.com/document_detail/473770.html">CreateTairInstance</a> operation to restore backup data to a new instance.</li>
     * </ul>
     * 
     * @param request the request parameters of RestoreInstance  RestoreInstanceRequest
     * @return RestoreInstanceResponse
     */
    @Override
    public CompletableFuture<RestoreInstanceResponse> restoreInstance(RestoreInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestoreInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestoreInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestoreInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetryInspectionTask  RetryInspectionTaskRequest
     * @return RetryInspectionTaskResponse
     */
    @Override
    public CompletableFuture<RetryInspectionTaskResponse> retryInspectionTask(RetryInspectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryInspectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryInspectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryInspectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartTairKVCacheCustomInstance  StartTairKVCacheCustomInstanceRequest
     * @return StartTairKVCacheCustomInstanceResponse
     */
    @Override
    public CompletableFuture<StartTairKVCacheCustomInstanceResponse> startTairKVCacheCustomInstance(StartTairKVCacheCustomInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartTairKVCacheCustomInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTairKVCacheCustomInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTairKVCacheCustomInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopTairKVCacheCustomInstance  StopTairKVCacheCustomInstanceRequest
     * @return StopTairKVCacheCustomInstanceResponse
     */
    @Override
    public CompletableFuture<StopTairKVCacheCustomInstanceResponse> stopTairKVCacheCustomInstance(StopTairKVCacheCustomInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopTairKVCacheCustomInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTairKVCacheCustomInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTairKVCacheCustomInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information about nearest access for applications in multi-zone scenarios, see <a href="https://help.aliyun.com/document_detail/164222.html">Scenario examples</a>.
     * When you call this operation, the instance must be of the high-availability or dual-replica type.
     * Calling this operation has the following impacts:</p>
     * </blockquote>
     * <ul>
     * <li>After the node role switchover is triggered, the data node on which the switchover is performed will enter a read-only state for a few seconds and experience transient disconnections. Make sure that your application has a reconnection mechanism.</li>
     * <li>While the instance is in the switching state, you cannot perform instance-level operations, such as modifying configurations or migrating zones.</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchInstanceHA  SwitchInstanceHARequest
     * @return SwitchInstanceHAResponse
     */
    @Override
    public CompletableFuture<SwitchInstanceHAResponse> switchInstanceHA(SwitchInstanceHARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchInstanceHA").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchInstanceHAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchInstanceHAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about the proxy mode, see <a href="https://help.aliyun.com/document_detail/142959.html">Proxy features</a>.
     * To call this operation, the following conditions must be met:</p>
     * <ul>
     * <li>The instance is created in a dedicated cluster. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">ApsaraDB MyBase</a>.</li>
     * <li>The instance uses the <a href="https://help.aliyun.com/document_detail/52228.html">cluster architecture</a>.<blockquote>
     * <p>Before calling this operation, call the <a href="https://help.aliyun.com/document_detail/473867.html">DescribeDedicatedClusterInstanceList</a> operation and check the value of the <strong>ProxyCount</strong> response parameter to determine whether the proxy mode is enabled for the instance. For example, a value of 0 indicates that the proxy mode is disabled, and a value greater than 0 indicates that the proxy mode is enabled.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SwitchInstanceProxy  SwitchInstanceProxyRequest
     * @return SwitchInstanceProxyResponse
     */
    @Override
    public CompletableFuture<SwitchInstanceProxyResponse> switchInstanceProxy(SwitchInstanceProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchInstanceProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchInstanceProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchInstanceProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation supports only cloud-native architecture instances.</p>
     * 
     * @param request the request parameters of SwitchInstanceToTargetZone  SwitchInstanceToTargetZoneRequest
     * @return SwitchInstanceToTargetZoneResponse
     */
    @Override
    public CompletableFuture<SwitchInstanceToTargetZoneResponse> switchInstanceToTargetZone(SwitchInstanceToTargetZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchInstanceToTargetZone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchInstanceToTargetZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchInstanceToTargetZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to multi-zone (dual-zone) cluster architecture instances.</li>
     * <li>The node where the failure is simulated automatically recovers later. However, the primary node is located in the secondary zone and the secondary node is located in the primary zone, which may result in cross-data center access between the instance and other workloads. To resolve this issue, you can manually switch zones on the Service Availability page in the console.</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchInstanceZoneFailOver  SwitchInstanceZoneFailOverRequest
     * @return SwitchInstanceZoneFailOverResponse
     */
    @Override
    public CompletableFuture<SwitchInstanceZoneFailOverResponse> switchInstanceZoneFailOver(SwitchInstanceZoneFailOverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchInstanceZoneFailOver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchInstanceZoneFailOverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchInstanceZoneFailOverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SwitchNetwork  SwitchNetworkRequest
     * @return SwitchNetworkResponse
     */
    @Override
    public CompletableFuture<SwitchNetworkResponse> switchNetwork(SwitchNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Classic Edition instances.</li>
     * <li>After the data migration or synchronization task is completed, you can call this operation again to remove the specification change restrictions.</li>
     * </ul>
     * 
     * @param request the request parameters of SyncDtsStatus  SyncDtsStatusRequest
     * @return SyncDtsStatusResponse
     */
    @Override
    public CompletableFuture<SyncDtsStatusResponse> syncDtsStatus(SyncDtsStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncDtsStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncDtsStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncDtsStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you manage a large number of instances, you can create multiple labels and attach different labels to instances for categorization. You can then filter instances by label.</p>
     * <ul>
     * <li>A label consists of a key-value pair. Keys must be unique within the same account and region, whereas values have no such restriction.</li>
     * <li>If the label in Settings does not exist, automatic creation of the label is performed and it is attached to the target instances.</li>
     * <li>If an instance already has a label with the same key attached, the new label overwrites the existing one.</li>
     * <li>You can attach up to 20 labels to each instance.</li>
     * <li>You can attach labels to up to 50 instances each time you invoke the API.
     * For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/118779.html">Create a label</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the precautions and billing instructions. For more information, see:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/54542.html">Change the billing method from pay-as-you-go to subscription</a>.</li>
     * <li><a href="https://help.aliyun.com/document_detail/211549.html">Change the billing method from subscription to pay-as-you-go</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of TransformInstanceChargeType  TransformInstanceChargeTypeRequest
     * @return TransformInstanceChargeTypeResponse
     */
    @Override
    public CompletableFuture<TransformInstanceChargeTypeResponse> transformInstanceChargeType(TransformInstanceChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransformInstanceChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransformInstanceChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransformInstanceChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransformToEcs  TransformToEcsRequest
     * @return TransformToEcsResponse
     */
    @Override
    public CompletableFuture<TransformToEcsResponse> transformToEcs(TransformToEcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransformToEcs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransformToEcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransformToEcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, refer to <a href="https://help.aliyun.com/document_detail/54542.html">Change the billing method to subscription</a>.</p>
     * 
     * @param request the request parameters of TransformToPrePaid  TransformToPrePaidRequest
     * @return TransformToPrePaidResponse
     */
    @Override
    public CompletableFuture<TransformToPrePaidResponse> transformToPrePaid(TransformToPrePaidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransformToPrePaid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransformToPrePaidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransformToPrePaidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnlockDBInstanceWrite  UnlockDBInstanceWriteRequest
     * @return UnlockDBInstanceWriteResponse
     */
    @Override
    public CompletableFuture<UnlockDBInstanceWriteResponse> unlockDBInstanceWrite(UnlockDBInstanceWriteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnlockDBInstanceWrite").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnlockDBInstanceWriteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnlockDBInstanceWriteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can remove a maximum of 20 tags at a time.</p>
     * <ul>
     * <li>If a tag is removed from an instance and is not attached to any other instances, the tag is automatically deleted.
     * For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/119157.html">Remove tags</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The upgrade process and impact vary based on the architecture. For more information, see <a href="https://help.aliyun.com/document_detail/56450.html">Principles of minor version updates</a>.</p>
     * <blockquote>
     * <ul>
     * <li>Before you call this operation, you can call <a href="https://help.aliyun.com/document_detail/473781.html">DescribeEngineVersion</a> to query the current minor version of the proxy node.</li>
     * <li>Upgrades cause connection interruptions. Perform upgrades during off-peak hours and ensure that your applications have a reconnection mechanism. For more information about the impact, see <a href="https://help.aliyun.com/document_detail/56450.html">Principles of minor version updates</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeProxy  UpgradeProxyRequest
     * @return UpgradeProxyResponse
     */
    @Override
    public CompletableFuture<UpgradeProxyResponse> upgradeProxy(UpgradeProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
