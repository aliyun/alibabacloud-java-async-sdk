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
            new TeaPair("cn-qingdao", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-heyuan", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hongkong", "r-kvstore.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "r-kvstore.aliyuncs.com"),
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
      * This operation is available only for cluster instances that use cloud disks.
      *
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
      * In direct connection mode, you can use private endpoints to bypass proxy nodes and connect to ApsaraDB for Redis instances from clients in the same manner as you connect to native Redis clusters. The direct connection mode can reduce communication overheads and accelerate the response speed. For more information, see [Enable the direct connection mode](~~146901~~).
      * To call this operation, the instance must meet the following requirements:
      * *   The instance is an ApsaraDB for Redis cluster instance.
      * *   The instance is a Community Edition instance that runs Redis 4.0 or 5.0, or an Enhanced Edition instance (Tair) that runs Redis 5.0.
      * *   The instance is deployed in a virtual private cloud (VPC). If the instance is deployed in the classic network, call the [SwitchNetwork](~~61005~~) operation to change the network type to VPC.
      * *   SSL encryption is disabled for the instance. If SSL encryption is enabled, you can call the [ModifyInstanceSSL](~~96194~~) operation to disable it.
      * *   The vSwitch to which the instance is connected has sufficient IP addresses to be allocated. For more information, see [Obtain the number of available IP addresses in the vSwitch to which an ApsaraDB for Redis instance is connected](~~183151~~).
      *
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
      * You can also apply for public endpoints in the ApsaraDB for Redis console. For more information, see [Use a public endpoint to connect to an ApsaraDB for Redis instance](~~43850~~).
      *
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
      * *   For information about Transparent Data Encryption (TDE) and the usage notes of TDE, see [Enable TDE](~~265913~~).
      * *   If the ApsaraDB for Redis instance is authorized to use KMS, you can call the [ModifyInstanceTDE](~~302337~~) operation to enable TDE.
      *
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
      * > 
      * *   This operation is supported only for ApsaraDB for Redis instances that run Redis 4.0 or later.
      * *   The ApsaraDB for Redis instance for which you want to call this operation must be in the running state.
      * *   You can create up to 18 accounts for an ApsaraDB for Redis instance.
      * You can also create an account in the ApsaraDB for Redis console. For more information, see [Manage database accounts](~~92665~~).
      *
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
      * You can also back up an instance in the ApsaraDB for Redis console. For more information, see [Backup and recovery](~~43886~~).
      *
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
      * > ApsaraDB for Redis has optimized the cache analytics feature to improve user experience. This API operation is phased out. You can use the new API operation for cache analytics. For more information, see [API operations for cache analytics are upgraded](~~186019~~).
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The engine version of the instance is Redis 4.0 or later.
      * *   The instance is a Community Edition instance or an Enhanced Edition (Tair) [DRAM-based instance](~~126164~~).
      * This feature is unavailable for cloud disk-based cluster instances. For more information, see [Comparison between ApsaraDB for Redis instances that use local disks and those that use cloud disks](~~188068~~).
      * *   The instance is of the latest minor version. For more information about whether you must update the minor version of an instance, see [How do I check whether the minor version of an ApsaraDB for Redis instance is the latest?](~~129203~~)
      * After you call this operation, you can call the [DescribeCacheAnalysisReport](~~128808~~) operation to view the analytic results.
      *
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
      * You cannot directly create a distributed instance. If you require a distributed instance, you must call this operation to convert an existing instance to the first child instance of the distributed instance. After the instance is converted, the distributed instance is created. Before you call this operation, make sure that the following requirements are met:
      * *   A [DRAM-based instance](~~126164~~) of Enhanced Edition is used.
      * *   If the existing instance is a cluster instance, the direct connection mode must be disabled for the instance. For more information, see [Release a private endpoint](~~150047~~).
      * > You can also call the [CreateInstance](~~60873~~) operation to create an instance that is specified as the first child instance of a distributed instance. After the child instance is created, the distributed instance to which the child instance belongs is created.
      *
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
      * Before you call this operation, make sure that you understand the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * You can call this operation to create an ApsaraDB for Redis instance or a classic Tair DRAM-based instance. To create a cloud-native Tair instance, call the [CreateTairInstance](~~208271~~) operation.
      * > For more information about how to create an instance that meets your requirements in the ApsaraDB for Redis console, see [Step 1: Create an ApsaraDB for Redis instance](~~26351~~).
      *
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
      * Before you call this operation, make sure that you understand the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * >  For more information about how to create an instance that meets your requirements in the ApsaraDB for Redis console, see Step 1: Create an ApsaraDB for Redis instance.[](~~26351~~)
      * This operation can only be used to create ApsaraDB for Redis Community Edition instances and ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based classic instances.
      *
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
      * For information about instance selection, see [Select an ApsaraDB for Redis instance](~~223808~~).
      * Before you call this operation, make sure that you are familiar with the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * *   For information about how to create a Tair instance in the Tair console, see [Create a Tair instance](~~443863~~).
      * *   If you want to create other types of instances, such as Community Edition instances or [Tair DRAM-based](~~126164~~) instances, you can call the [CreateInstance](~~60873~~) operation.
      *
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
      * *   This operation is supported only for ApsaraDB for Redis instances that run Redis 4.0.
      * *   The ApsaraDB for Redis instance must be in the Running state.
      *
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
      * Before you delete an IP whitelist template, you must unbind (disassociate) the instances that are currently associated with the template.
      *
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
      * For more information about how to perform the corresponding operation in the console, see [Release an instance](~~43882~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is charged on a pay-as-you-go basis.
      * >  You cannot call this operation to release a subscription instance, which is automatically released when it expires. To release a subscription instance before it expires, submit a ticket.
      *
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
      * You can also remove data shards from an instance in the ApsaraDB for Redis console. For more information, see [Adjust the number of shards for an ApsaraDB for Redis instance with cloud disks](~~198082~~).\\
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The instance is a persistent memory-optimized instance in the cluster architecture. For more information about persistent memory-optimized instances, see [Persistent memory-optimized instances](~~183956~~).
      * *   The instance has more than one data shard.
      *
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
      * >  Only ApsaraDB for Redis instances of Redis 4.0 or later are supported.
      *
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
      * After you have called this API operation and queried the information about a specific O&M task, you can also call the [ModifyActiveOperationTask](~~ModifyActiveOperationTask~~) operation to modify the scheduled switchover time of the O&M task.
      *
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
      * > You can call the [ModifyAuditLogConfig](~~130206~~) operation to enable or disable the audit log feature for an ApsaraDB for Redis instance. For more information, see [Enable the new audit log feature](~~102015~~).
      * Before you call this operation, make sure that the ApsaraDB for Redis instance meets the following requirements:
      * *   The instance is an ApsaraDB for Redis Community Edition instance or ApsaraDB for Redis Enhanced Edition (Tair) [DRAM-based instance](~~126164~~).
      * *   The engine version of the instance is Redis 4.0 or later, and the latest minor version is used. You can call the [DescribeEngineVersion](~~95268~~) operation to check whether the instance uses the latest minor version.
      * *   The audit log feature is enabled for the instance. For more information, see [ModifyAuditLogConfig](~~130206~~).
      *
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
      * This operation can be called up to 100 times per minute. You can also query audit logs in the ApsaraDB for Redis console. For more information, see [Query audit logs of an instance](~~101937~~).
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The instance is an ApsaraDB for Redis Community Edition instance or an ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance.
      * *   The engine version of the instance is Redis 4.0 or later.
      * *   The audit log feature is enabled for the instance. For more information, see [ModifyAuditLogConfig](~~130206~~).
      *
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
      * > ApsaraDB for Redis has optimized the cache analytics feature to improve user experience. This API operation is phased out. You can use the new API operation for cache analytics. For more information, see [API operations for cache analytics are upgraded](~~186019~~).
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The engine version of the instance is Redis 4.0 or later.
      * *   The instance uses the latest minor version. For more information about how to check whether to update the minor version of an instance, see [How do I check whether the minor version of an ApsaraDB for Redis instance is the latest?](~~129203~~)
      *
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
      * > ApsaraDB for Redis has optimized the cache analytics feature to improve user experience. This API operation is phased out. You can use the new API operation for cache analytics. For more information, see [API operations for cache analytics are upgraded](~~186019~~).
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The engine version of the instance is Redis 4.0 or later.
      * *   The instance uses the latest minor version. For more information about how to check whether to update the minor version of an instance, see [How do I check whether the minor version of an ApsaraDB for Redis instance is the latest?](~~129203~~)
      *
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
      * > This API operation is applicable only to ApsaraDB for Redis instances that use [cloud disks](~~188068~~) and the [cluster architecture](~~52228~~).
      *
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
      * > Only instances that use cloud disks support this operation.
      *
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
      * > If you want to query the information about ApsaraDB for Redis instances that are not deployed in a dedicated cluster, call the [DescribeInstanceAttribute](~~60996~~) operation.
      *
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
      * Before you call this operation, TDE must be enabled for the ApsaraDB for Redis instance by using a custom key. For more information, see [ModifyInstanceTDE](~~302337~~).
      * > For more information about TDE, see [Enable TDE](~~265913~~).
      *
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
      * *   You can specify a custom key when you call the [ModifyInstanceTDE](~~302337~~) operation to enable Transparent Data Encryption (TDE). You can call the DescribeEncryptionKeyList operation to query the custom keys that are in use. To create a custom key, you can call the [CreateKey](~~28947~~) operation of Key Management Service (KMS).
      * *   For more information about TDE and the usage notes of TDE, see [Enable TDE](~~265913~~).
      *
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
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=R-kvstore\\&api=DescribeEngineVersion\\&type=RPC\\&version=2015-01-01)
      *
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
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=R-kvstore\\&api=DescribeGlobalDistributeCache\\&type=RPC\\&version=2015-01-01)
      *
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

    @Override
    public CompletableFuture<DescribeGlobalSecurityIPGroupResponse> describeGlobalSecurityIPGroup(DescribeGlobalSecurityIPGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalSecurityIPGroup").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalSecurityIPGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalSecurityIPGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeGlobalSecurityIPGroupRelationResponse> describeGlobalSecurityIPGroupRelation(DescribeGlobalSecurityIPGroupRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalSecurityIPGroupRelation").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalSecurityIPGroupRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalSecurityIPGroupRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can also query the performance monitoring data of an instance in the ApsaraDB for Redis console. For more information, see [Metrics](~~43887~~).
      *
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
      * This operation is available only for instances that use cloud disks.
      * > You can call the [DescribeParameters](~~473847~~) operation to query the parameter settings of instances that use local disks.
      *
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
      * SSL encryption is supported for ApsaraDB for Redis 2.8 standard master-replica instances, ApsaraDB for Redis 2.8 master-replica cluster instances, and ApsaraDB for Redis 4.0 master-replica cluster instances. You can enable SSL encryption to enhance data transmission security.
      * You can use one of the following methods to enable or disable SSL encryption or update the SSL certificate for an ApsaraDB for Redis instance:
      * *   Call the [ModifyInstanceSSL](~~96194~~) operation.
      * *   Enable or disable SSL encryption or update the SSL certificate in the ApsaraDB for Redis console. For more information, see [Configure SSL encryption](~~84898~~).
      * > After SSL encryption is enabled, the instance may respond slower.
      *
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
      * For more information about TDE and the usage notes of TDE, see [Enable TDE](~~265913~~).
      * >  You can call the [ModifyInstanceTDE](~~302337~~) to enable or disable TDE.
      *
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
      * If you do not specify the InstanceIds parameter when you call this operation, the overview information of all instances is returned.
      * > This operation returns non-paged results.
      *
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
      * You can call the [EnableAdditionalBandwidth](~~206173~~) operation to increase the internal bandwidth of an instance.
      *
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
      * This parameter is supported only for cluster and read/write splitting instances.
      *
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
      * >  ApsaraDB for Redis has upgraded the monitoring metrics. The DescribeMonitorItems operation is phased out. For more information, see [The DescribeMonitorItems operation supported by ApsaraDB for Redis is phased out](~~189893~~).
      * After you call this operation to retrieve a list of metrics for a specified ApsaraDB for Redis instance, you can call the [DescribeHistoryMonitorValues](~~DescribeHistoryMonitorValues~~) operation to query monitoring history of the instance.
      *
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
      * After you call this operation to query the parameters and default values of an instance, you can call the [ModifyInstanceConfig](~~61113~~) operation to reconfigure the parameters of the instance.
      *
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
      * This operation is available only for instances that use local disks.
      * > You can call the [DescribeInstanceConfig](~~473846~~) operation to query the parameter settings of instances that use cloud disks.
      *
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
      * For more information about how to view the operational logs of an instance in the ApsaraDB for Redis console, see [View active logs](~~101713~~).
      * This operation can be called up to 100 times per minute.
      *
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
      * You can also query slow logs in the ApsaraDB for Redis console. For more information, see [Query slow logs of an instance](~~95874~~). This operation can be called up to 100 times per minute.
      *
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
      * You can call this operation to query the progress of a task when you perform time-consuming operations. You can also log on to the ApsaraDB for Redis console and click the Tasks icon in the upper-right corner of the **Instance Information** page to view the progress of the current task.
      *
     */
    @Override
    public CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * When you call this operation, make sure that your instance is an ApsaraDB for Redis Community Edition instance or an ApsaraDB for Redis Enhanced Edition (Tair) [DRAM-based instance](~~126164~~), and that the instance is deployed in classic mode. For more information, see [Comparison between cloud-native instances and classic instances](~~188068~~).
      * If you enable the bandwidth auto scaling feature and call this operation at the same time, bandwidth auto scaling takes precedence. During bandwidth scale-back, the instance is scaled back to the default bandwidth of the instance type. For more information about the limits, costs, and FAQ about this feature, see [Adjust the bandwidth of an instance](~~102588~~).
      * >  Before you call this operation, you can call the [DescribeRoleZoneInfo](~~190794~~) operation to query the current bandwidth of each data node in an instance.
      *
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
      * For more information about how to clear the expired keys in the ApsaraDB for Redis console, see [Clear data](~~43881~~).
      * >  Expired keys cannot be recovered after they are deleted. Exercise caution when you call this operation.
      *
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
      * Each ApsaraDB for Redis or Tair instance can contain up to 256 databases. Each database does not have a separate memory usage limit. The memory capacity that a database can use is subject to the total memory limit of the instance. You can execute the `SELECT` statement to switch between databases. For more information, see [What is the size of each database on an ApsaraDB for Redis instance, and how can I choose databases?](~~38688~~)
      * >  This operation is available only for cloud-native instances that use cloud disks.
      *
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
      * > 
      * *   Only ApsaraDB for Redis instances of Redis 4.0 or later are supported.
      * *   The ApsaraDB for Redis instance must be in the running state.
      *
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
      * The log management feature of ApsaraDB for Redis requires the resources of [Log Service](~~48869~~). To use the log management feature of ApsaraDB for Redis, you can call this operation to associate the RAM role named AliyunServiceRoleForKvstore with the ApsaraDB for Redis instance. For more information, see [Associated RAM roles of ApsaraDB for Redis](~~184337~~).
      *
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
      * You can also query the relationships between instances and tags in the ApsaraDB for Redis console. For more information, see [Filter ApsaraDB for Redis instances by tag](~~119160~~) and [View tags bound to an instance](~~134038~~).
      *
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
      * For more information about how to migrate an instance across zones in the ApsaraDB for Redis console, see [Migrate an instance across zones](~~106272~~).
      * > *   If the network type of an ApsaraDB for Redis instance is switched from classic network to Virtual Private Cloud (VPC), and the endpoint of the classic network is retained, you can migrate the instance across zones only after the classic network endpoint is released upon expiration.
      * > *   After the data is migrated, the endpoint of an instance remains unchanged. However, the virtual IP address (VIP) is changed. We recommend that you use the endpoint instead of the VIP to connect to the instance.
      *
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
      * > This operation is supported only for instances that run Redis 4.0 or later.
      *
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
      * You can receive notifications for ApsaraDB for Redis events such as instance migration and version upgrade by text message, phone call, email, internal message, or by using the ApsaraDB for Redis console. You can also change the scheduled switchover time of a task in the ApsaraDB for Redis console. For more information, see [Query or manage pending events](~~187022~~).
      *
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
      * Before you call this operation, make sure that you understand the billing methods and [pricing](~~54532~~) of the audit log feature.
      * Before you call this operation, make sure that the ApsaraDB for Redis instance meets the following requirements:
      * *   The instance is an ApsaraDB for Redis Community Edition instance or ApsaraDB for Redis Enhanced Edition (Tair) [DRAM-based instance](~~126164~~).
      * *   The engine version of the instance is Redis 4.0 or later, and the latest minor version is used. You can call the [DescribeEngineVersion](~~95268~~) operation to check whether the instance uses the latest major version and minor version.
      *
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
      * You can also modify the endpoint or port number of an instance in the ApsaraDB for Redis console. For more information, see [Change the endpoint or port number of an instance](~~85683~~).
      *
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
      * You can also modify the information of an instance in the ApsaraDB for Redis console. For more information, see [Change or reset the password](~~43874~~).
      *
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
      * > Auto-renewal is triggered seven days before the expiration date of the instance.
      *
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
      * You can also modify the maintenance window of an instance in the ApsaraDB for Redis console. For more information, see [Set a maintenance window](~~55252~~).
      *
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
      * For more information about how to perform the corresponding operation in the console, see [Upgrade the major version](~~101764~~).
      *
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
      * The procedure to update the minor version of an instance varies based on types of ApsaraDB for Redis instances. For more information, see [Upgrade the minor version](~~56450~~).
      * > 
      * *   Before you call this operation, you can call the [DescribeEngineVersion](~~95268~~) operation to query the minor version of the current instance.
      * *   When you switch your workloads over from the original instance to a new instance or from the master node to the replica node in the original instance, you may experience disconnections that last a few seconds. The original instance stays in the read-only state within 60 seconds until all data is synchronized. We recommend that you upgrade the original instance during off-peak hours and make sure that your application is configured to automatically reconnect to the original instance.
      *
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
      * You can also perform this operation in the ApsaraDB for Redis console. For more information, see [Change the expiration time for the endpoint of the classic network](~~60062~~).
      * > For more information about how to switch the network type of an ApsaraDB for Redis instance from classic network to VPC, see [SwitchNetwork](~~61005~~).
      *
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
      * You can also modify SSL encryption configurations in the ApsaraDB for Redis console. For more information, see [Configure SSL encryption](~~84898~~).
      * >  To specify the earliest supported SSL version, you can call the [ModifyInstanceConfig](~~ModifyInstanceConfig~~) operation to modify the required parameter.
      *
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
      * >  For more information about the procedure, impacts, limits, and fees of this operation, see [Change the configurations of an instance](~~26353~~).
      *
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
      * > For more information about TDE and the impact of TDE, see [Enable TDE](~~265913~~).
      *
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
      * When the password-free access feature is enabled, Elastic Compute Service (ECS) instances in the same virtual private cloud (VPC) can connect to the ApsaraDB for Redis instance without a password. You can also use the username and password to connect to the ApsaraDB for Redis instance.
      * > The ApsaraDB for Redis instance is deployed in a VPC. For more information, see [Enable password-free access](~~85168~~).
      *
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
      * > 
      * *   This operation is applicable only to an ApsaraDB for Redis instance that is deployed in a dedicated cluster. To adjust the bandwidth of a standard ApsaraDB for Redis instance, call the [EnableAdditionalBandwidth](~~206173~~) operation.
      *
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
      * Resource groups allow you to sort resources owned by your Alibaba Cloud account into groups. This simplifies resource and permission management within your Alibaba Cloud account. For more information, see [What is Resource Management?](~~94475~~)
      * > For more information about resource group API operations, see [Resource Management API overview](~~160024~~).
      *
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
      * > After you call this operation, the security groups that are added to the whitelists of the ApsaraDB for Redis instance are deleted, and the security group specified by the **SecurityGroupId** parameter is added to the whitelists. For more information about how to reset security groups in the ApsaraDB for Redis console, see [Add security groups](~~148267~~).
      *
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
      * You can also modify the whitelists of an instance in the ApsaraDB for Redis console. For more information, see [Configure a whitelist for an instance](~~56464~~).
      *
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
      * In direct connection mode, clients can bypass proxy nodes and use private endpoints to connect to ApsaraDB for Redis instances. This is similar to the connection to a native Redis cluster. The direct connection mode can reduce communication overheads and the response time of ApsaraDB for Redis. For more information, see [Enable the direct connection mode](~~146901~~).
      *
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
      * For more information about how to perform the API operation in the ApsaraDB for Redis console, see [Release public endpoints](~~125424~~).
      *
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
      * The operation that you want to perform. Set the value to **RemoveSubInstance**.
      *
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
      * Before you call this operation, make sure that you understand the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * You can adjust the bandwidth of an instance in the ApsaraDB for Redis console. For more information, see [Adjust the bandwidth of an ApsaraDB for Redis instance](~~102588~~). You can also call the [EnableAdditionalBandwidth](~~206173~~) operation to adjust the bandwidth of an instance. If you want to continue using the bandwidth that you purchase after the validity period of the bandwidth, you must call the RenewAdditionalBandwidth operation to renew the bandwidth before the bandwidth expires.
      * > Before you call this operation, you can call the [DescribeIntranetAttribute](~~128715~~) operation, which returns the expiration time of the purchased bandwidth in the **BandwidthExpireTime** parameter.
      *
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
      * This operation is applicable only to subscription instances.
      *
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
      * >  Only ApsaraDB for Redis instances of Redis 4.0 or later are supported.
      *
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
      * *   If your instance is a [persistent memory-optimized instance](~~443828~~) or [DRAM-based instance](~~443827~~) that is compatible with Redis 5.0 and the [data flashback](~~443784~~) feature is enabled, you can call this operation to restore the data of a specified key to a specified point in time that is accurate to the second. Other keys are not affected. This way, you can achieve more fine-grained data restoration.
      * *   For other instance series, this operation overwrites the existing data of your instance with the backup data. Proceed with caution. We recommend that you call the [CreateInstance](~~60873~~) operation to create an instance. Then, you can restore data to the new instance.
      *
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
      * > For more information about nearby access to applications that are deployed across zones, see [Switch node roles](~~164222~~).
      * The instance must be an ApsaraDB for Redis Community Edition instance or Enhanced Edition (Tair) [DRAM-based](~~126164~~) instance that uses local disks.
      * A call to this operation has the following impacts on your instance:
      * *   The data shards in the instance may change to the read-only state and experience transient connections within seconds. Make sure that your application is configured to automatically reconnect to the instance.
      * *   If the instance enters the switching state, you cannot manage this instance. For example, you cannot modify the instance configurations or migrate the instance to another zone.
      *
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
      * For more information about the proxy mode, see [Features of proxy nodes](~~142959~~). Before you call this operation, make sure that the following requirements are met:
      * *   Your ApsaraDB for Redis instance is created by using a dedicated cluster. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      * *   The instance uses the cluster architecture. For more information about the cluster architecture, see [Cluster master-replica instances](~~52228~~).
      * > Before you call the SwitchInstanceProxy operation, you must call the [DescribeDedicatedClusterInstanceList](~~229522~~) operation and view the value of the **ProxyCount** response parameter to check whether the proxy mode is enabled. A value of 0 indicates that the proxy mode is disabled. A value that is greater than 0 indicates that the proxy mode is enabled.
      *
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
      * If you have a large number of instances, you can create multiple tags and add these tags to the instances. Then, you can filter instances by tag.
      * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.
      * *   If the tag that you specify does not exist, this tag is automatically created and added to the specified instance.
      * *   If the key of the specified tag is the same as that of an existing tag, the specified tag overwrites the existing tag.
      * *   You can add up to 20 tags to each instance.
      * *   You can add tags to up to 50 instances in each request.
      * You can also add tags to instances in the ApsaraDB for Redis console. For more information, see [Create a tag](~~118779~~).
      *
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
      * Before you call this operation, make sure that you understand relevant precautions and billing rules. For more information, see the following topics:
      * *   [Change the billing method to subscription](~~54542~~).
      * *   [Change the billing method to pay-as-you-go](~~211549~~).
      *
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
      * For more information about how to change the billing method in the ApsaraDB for Redis console, see [Switch to subscription](~~54542~~).
      * >  You cannot change the billing method of an ApsaraDB for Redis instance from subscription to pay-as-you-go.
      *
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
      * *   You can remove up to 20 tags at a time.
      * *   If a tag is removed from an instance and is not added to other instances, the tag is deleted.
      * You can also remove tags from instances in the ApsaraDB for Redis console. For more information, see [Remove a tag](~~119157~~).
      *
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

}
