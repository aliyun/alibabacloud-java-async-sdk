// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dds20151201.models.*;
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
        this.product = "Dds";
        this.version = "2015-12-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mongodb.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mongodb.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mongodb.aliyuncs.com"),
            new TeaPair("cn-heyuan", "mongodb.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "mongodb.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mongodb.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mongodb.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mongodb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mongodb.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mongodb.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mongodb.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "mongodb.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-east-1", "mongodb.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "mongodb.us-west-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "mongodb.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "mongodb.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "mongodb.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "mongodb.me-east-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mongodb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-fujian", "mongodb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mongodb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mongodb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mongodb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mongodb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mongodb.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * This operation is applicable only to sharded cluster instances. For more information, see [Apply for an endpoint for a shard or Configserver node](~~134037~~).
      * >  The allocated endpoints can be used only for internal access. To gain Internet access, you must call the [AllocatePublicNetworkAddress](~~67602~~) operation to apply for public endpoints.
      *
     */
    @Override
    public CompletableFuture<AllocateNodePrivateNetworkAddressResponse> allocateNodePrivateNetworkAddress(AllocateNodePrivateNetworkAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateNodePrivateNetworkAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateNodePrivateNetworkAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateNodePrivateNetworkAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AllocatePublicNetworkAddressResponse> allocatePublicNetworkAddress(AllocatePublicNetworkAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocatePublicNetworkAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocatePublicNetworkAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocatePublicNetworkAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you enable Transparent Data Encryption (TDE) by calling the [ModifyDBInstanceTDE](~~131267~~) operation, you can call this operation to check whether KMS keys are authorized to ApsaraDB for MongoDB instances.
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
      * This operation is applicable to replica set instances and sharded cluster instances.
      * >  After you call this operation to confirm that the data of the instance can be restored, you can call the [CreateDBInstance](~~61763~~) operation to restore data to a new instance.
      *
     */
    @Override
    public CompletableFuture<CheckRecoveryConditionResponse> checkRecoveryCondition(CheckRecoveryConditionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckRecoveryCondition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckRecoveryConditionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckRecoveryConditionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Database accounts can be created only for shards in sharded cluster instances that use cloud disks.
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
      * ## Usage
      * When you call this operation, the instance must be in the Running state.
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
      * Creates or clones an ApsaraDB for MongoDB replica set instance.
      *
     */
    @Override
    public CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBInstanceResponse> future = new CompletableFuture<>();
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
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * This operation is applicable only to sharded cluster instances.
      *
     */
    @Override
    public CompletableFuture<CreateNodeResponse> createNode(CreateNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The ID of the request.
      *
     */
    @Override
    public CompletableFuture<CreateNodeBatchResponse> createNodeBatch(CreateNodeBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNodeBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNodeBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNodeBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Make sure that you fully understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB before you call this operation.
      * *   For more information about the instance types of ApsaraDB for MongoDB, see [Instance types](~~57141~~).
      * *   To create standalone instances and replica set instances, you can call the [CreateDBInstance](~~61763~~) operation.
      *
     */
    @Override
    public CompletableFuture<CreateShardingDBInstanceResponse> createShardingDBInstance(CreateShardingDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateShardingDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateShardingDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateShardingDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The instance is in the running state.
      * *   A pay-as-you-go instance is used.
      * > After you release an ApsaraDB for MongoDB instance, data in the instance can no longer be recovered. Proceed with caution.
      *
     */
    @Override
    public CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is a sharded cluster instance.
      * *   The billing method of the instance is pay-as-you-go.
      * *   The number of the shard or mongos nodes in the instance is greater than two.
      *
     */
    @Override
    public CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this operation to query only the information of the root account.
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
      * This operation is no longer updated and will be unavailable.
      *
     */
    @Override
    public CompletableFuture<DescribeActiveOperationTaskTypeResponse> describeActiveOperationTaskType(DescribeActiveOperationTaskTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActiveOperationTaskType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActiveOperationTaskTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActiveOperationTaskTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    @Override
    public CompletableFuture<DescribeAuditLogFilterResponse> describeAuditLogFilter(DescribeAuditLogFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAuditLogFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAuditLogFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAuditLogFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    @Override
    public CompletableFuture<DescribeAuditPolicyResponse> describeAuditPolicy(DescribeAuditPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAuditPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAuditPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAuditPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   When you call this operation, ensure that the audit log feature of the instance is enabled. Otherwise, the operation returns an empty audit log.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
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

    /**
      * Queries the zones in which an ApsaraDB for MongoDB instance can be deployed under specified purchase conditions. The region ID is required in the purchase condition.
      *
     */
    @Override
    public CompletableFuture<DescribeAvailabilityZonesResponse> describeAvailabilityZones(DescribeAvailabilityZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailabilityZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailabilityZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailabilityZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAvailableEngineVersionResponse> describeAvailableEngineVersion(DescribeAvailableEngineVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableEngineVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableEngineVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableEngineVersionResponse> future = new CompletableFuture<>();
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

    /**
      * ## Precautions
      * You can call the [CreateDBInstance](~~61763~~) operation to restore a database for an ApsaraDB for MongoDB instance. For more information, see [Restore one or more databases of an ApsaraDB for MongoDB instance](~~112274~~).
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance was created after March 26, 2019.
      * *   The instance is located in the China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), or Singapore (Singapore) region. Other regions are not supported.
      * *   The instance is a replica set instance.
      * *   The version of the database engine is 3.4, 4.0, or 4.2.
      * *   The storage engine of the instance is WiredTiger.
      *
     */
    @Override
    public CompletableFuture<DescribeBackupDBsResponse> describeBackupDBs(DescribeBackupDBsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupDBs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupDBsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupDBsResponse> future = new CompletableFuture<>();
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
      * For a sharded cluster instance that is created before October 19, 2023 and uses cloud disks, you must call the [TransferClusterBackup](~~2587931~~) operation to switch the instance from the shard backup mode to the cluster backup mode before you call the DescribeClusterBackups operation.
      * By default, cloud disk-based sharded cluster instances that are created after October 19, 2023 are in the cluster backup mode.
      *
     */
    @Override
    public CompletableFuture<DescribeClusterBackupsResponse> describeClusterBackups(DescribeClusterBackupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterBackups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterBackupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterBackupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.
      * *   You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. The DescribeClusterRecoverTime operation is applicable only to instances that are switched to the cluster backup mode or instances that are created on or after October 19, 2023.
      *
     */
    @Override
    public CompletableFuture<DescribeClusterRecoverTimeResponse> describeClusterRecoverTime(DescribeClusterRecoverTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterRecoverTime").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterRecoverTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterRecoverTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage
      * When you call the DescribeDBInstanceEncryptionKey operation, the instance must have transparent data encryption (TDE) enabled in BYOK mode. You can call the [ModifyDBInstanceTDE](~~131267~~) operation to enable TDE.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceEncryptionKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceEncryptionKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstancePerformance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancePerformanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancePerformanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance is a replica set instance.
      * *   The instance runs MongoDB 3.4 or later.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is a replica set or sharded cluster instance.
      * *   The instance uses local physical disks to store data.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceSwitchLogResponse> describeDBInstanceSwitchLog(DescribeDBInstanceSwitchLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceSwitchLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceSwitchLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceSwitchLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  For more information about this function, see [Configure TDE](~~131048~~).
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   A replica set or sharded cluster instance is used.
      * *   The storage engine of the instance is WiredTiger.
      * *   The database engine version of the instance is 4.0 or 4.2. If the database engine version is earlier than 4.0, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceTDEInfoResponse> describeDBInstanceTDEInfo(DescribeDBInstanceTDEInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceTDEInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceTDEInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceTDEInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The list of replica set and standalone instances is displayed when the **DBInstanceType** parameter uses the default value **replicate**. To query a list of sharded cluster instances, you must set the **DBInstanceType** parameter to **sharding**.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you do not specify an instance when you call this operation, the overview information of all instances in the specified region within this account is returned.
      * *   Paged query is disabled for this operation.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstancesOverviewResponse> describeDBInstancesOverview(DescribeDBInstancesOverviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstancesOverview").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancesOverviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancesOverviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    @Override
    public CompletableFuture<DescribeErrorLogRecordsResponse> describeErrorLogRecords(DescribeErrorLogRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeErrorLogRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeErrorLogRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeErrorLogRecordsResponse> future = new CompletableFuture<>();
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
      * This operation is applicable to subscription instances.
      *
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

    @Override
    public CompletableFuture<DescribeKernelReleaseNotesResponse> describeKernelReleaseNotes(DescribeKernelReleaseNotesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeKernelReleaseNotes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKernelReleaseNotesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKernelReleaseNotesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Queried keys are available only for disk encryption.
      *
     */
    @Override
    public CompletableFuture<DescribeKmsKeysResponse> describeKmsKeys(DescribeKmsKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeKmsKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKmsKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKmsKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * This operation depends on the audit log feature of ApsaraDB for MongoDB. You can enable the audit log feature based on your business requirements. For more information, see [Enable the audit log feature](~~59903~~).
      * *   Starting from January 6, 2022, the official edition of the audit log feature has been launched in all regions, and new applications for the free trial edition have ended. For more information, see [Notice on official launch of the pay-as-you-go audit log feature and no more application for the free trial edition](~~377480~~)
      * *   You are charged for the official edition of the audit log feature based on the storage capacity that is consumed by audit logs and the retention period of the audit logs. For more information, see [Pricing of ApsaraDB for MongoDB instances](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      *
     */
    @Override
    public CompletableFuture<DescribeMongoDBLogConfigResponse> describeMongoDBLogConfig(DescribeMongoDBLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMongoDBLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMongoDBLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMongoDBLogConfigResponse> future = new CompletableFuture<>();
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

    /**
      * >  To query available regions and zones in which an ApsaraDB for MongoDB instance can be created, call the [DescribeAvailableResource](~~149719~~) operation.
      *
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
      * This operation is applicable to subscription instances.
      *
     */
    @Override
    public CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRenewalPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRenewalPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRenewalPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is applicable to replica set instances and standalone instances, but not to sharded cluster instances.
      *
     */
    @Override
    public CompletableFuture<DescribeReplicaSetRoleResponse> describeReplicaSetRole(DescribeReplicaSetRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReplicaSetRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeReplicaSetRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeReplicaSetRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > For more information, see [View the zone of a node](~~123825~~).
      * This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.
      *
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
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
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
      * This operation is applicable only to sharded cluster instances.
      *
     */
    @Override
    public CompletableFuture<DescribeShardingNetworkAddressResponse> describeShardingNetworkAddress(DescribeShardingNetworkAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeShardingNetworkAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeShardingNetworkAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeShardingNetworkAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
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
      * You can use the custom key obtained by calling the DescribeUserEncryptionKeyList operation to enable TDE. For more information, see [ModifyDBInstanceTDE](~~131267~~).
      *
     */
    @Override
    public CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserEncryptionKeyList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserEncryptionKeyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserEncryptionKeyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The billing method of the instance is subscription.
      * *   The instance has expired and is in the **Locking** state.
      *
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
      * This operation is applicable to replica set instances and sharded cluster instances. You can call this operation to check whether resources are sufficient for creating an instance, upgrading a replica set or sharded cluster instance, or upgrading a single node of the sharded cluster instance.
      * > You can call this operation a maximum of 200 times per minute.
      *
     */
    @Override
    public CompletableFuture<EvaluateResourceResponse> evaluateResource(EvaluateResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EvaluateResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EvaluateResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EvaluateResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * *   This operation is available only for replica set instances that run MongoDB 4.2 or earlier and sharded cluster instances.
      * *   If you have applied for a public endpoint for the ApsaraDB for MongoDB instance, you must call the [ReleasePublicNetworkAddress](~~67604~~) operation to release the public endpoint before you call the MigrateAvailableZone operation.
      * *   Transparent data encryption (TDE) is disabled for the ApsaraDB for MongoDB instance.
      * *   The source zone and the destination zone belong to the same region.
      * *   A vSwitch is created in the destination zone. This prerequisite must be met if the instance resides in a virtual private cloud (VPC). For more information about how to create a vSwitch, see [Work with vSwitches](~~65387~~).
      *
     */
    @Override
    public CompletableFuture<MigrateAvailableZoneResponse> migrateAvailableZone(MigrateAvailableZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MigrateAvailableZone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateAvailableZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateAvailableZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is applicable only to replica set instances, but not to standalone instances or sharded cluster instances.
      * >  If you have applied for a public endpoint of the instance, you must first call the [ReleasePublicNetworkAddress](~~67604~~) operation to release the public endpoint.
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
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** or **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    @Override
    public CompletableFuture<ModifyAuditLogFilterResponse> modifyAuditLogFilter(ModifyAuditLogFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAuditLogFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAuditLogFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAuditLogFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    @Override
    public CompletableFuture<ModifyAuditPolicyResponse> modifyAuditPolicy(ModifyAuditPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAuditPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAuditPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAuditPolicyResponse> future = new CompletableFuture<>();
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
    public CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceMaintainTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceMaintainTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceMaintainTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  This operation is applicable only to the ApsaraDB for MongoDB console of the previous version due to the change in the frequency at which the monitoring data of an ApsaraDB for MongoDB instance is collected.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is a replica set or sharded cluster instance.
      * *   The instance runs MongoDB 3.4 (the latest minor version) or 4.0.
      *
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
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The instance is in the Running state.
      * *   The network of the instance is in hybrid access mode.
      * >  This operation is supported by replica set instances and sharded cluster instances. This operation is not supported by standalone instances.
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceNetExpireTimeResponse> modifyDBInstanceNetExpireTime(ModifyDBInstanceNetExpireTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceNetExpireTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceNetExpireTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceNetExpireTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is applicable to replica set instances and sharded cluster instances, but not standalone instances. You can call this operation to change the network of an instance from a classic network to a VPC.
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceNetworkType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceNetworkTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceNetworkTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is a replica set instance.
      * *   The engine version of the instance is \\<ph props="intl">3.4 or 4.0\\</ph>\\<ph props="china">3.4, 4.0, or 4.2\\</ph>.
      * >  When you enable or disable SSL encryption or update the SSL certificate, the instance restarts. We recommend that you call this operation during off-peak hours.
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * This operation applies only to standalone and replica set instances. To modify the specifications of sharded cluster instances, you can call the [ModifyNodeSpec](~~61911~~), [CreateNode](~~61922~~), [DeleteNode](~~61816~~), or [ModifyNodeSpecBatch](~~61923~~) operation.
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * TDE allows you to perform real-time I/O encryption and decryption on data files. Data is encrypted before it is written to a disk and is decrypted when it is read from the disk to the memory. For more information, see [Configure TDE](~~131048~~).
      * >  TDE cannot be disabled after it is enabled.
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   A replica set or sharded cluster instance is used.
      * *   The storage engine of the instance is WiredTiger.
      * *   The instance uses local disks to store data.
      * *   The database engine version of the instance is 4.0 or 4.2. If the database engine version is earlier than 4.0, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceTDEResponse> modifyDBInstanceTDE(ModifyDBInstanceTDERequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceTDE").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceTDEResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceTDEResponse> future = new CompletableFuture<>();
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
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      * This operation is applicable to subscription instances.
      * >  When auto-renewal is enabled, your payment will be collected nine days before the expiration date of ApsaraDB for MongoDB. Ensure that your account has sufficient balance.
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

    /**
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is a replica set or sharded cluster instance.
      * *   The database engine version of the instance is 4.0 (with the minor version of mongodb\\_20190408\\_3.0.11 or later) or 4.2. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to view the database engine version of the instance. If necessary, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine version of the instance.
      * *   The network type of the instance must be VPC. If the network type of the instance is classic network, you must call the [ModifyDBInstanceNetworkType](~~62138~~) operation to change the network type to VPC.
      * *   You can only disable but not enable password-free access over VPC.
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
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * > This operation is applicable only to sharded cluster instances.
      *
     */
    @Override
    public CompletableFuture<ModifyNodeSpecResponse> modifyNodeSpec(ModifyNodeSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNodeSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNodeSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNodeSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Make sure that you fully understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB before you call this operation.
      * This operation is applicable to only sharded cluster instances.
      *
     */
    @Override
    public CompletableFuture<ModifyNodeSpecBatchResponse> modifyNodeSpecBatch(ModifyNodeSpecBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNodeSpecBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNodeSpecBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNodeSpecBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Precautions
      * *   The instance must be in the Running state when you call this operation.
      * *   If you call this operation to modify specific instance parameters and the modification for part of the parameters can take effect only after an instance restart, the instance is automatically restarted after this operation is called. You can call the [DescribeParameterTemplates](~~67618~~) operation to query the parameters that take effect only after the instance is restarted.
      *
     */
    @Override
    public CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see [What is Resource Management?](~~94475~~)
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
      * >  For a sharded cluster instance, the bound ECS security group takes effect only for mongos nodes.
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
      * The actions performed by this operation for a task vary based on the current state of the task. The supported actions for a task can be obtained from the value of the actionInfo parameter in the DescribeHistoryTasks operation.
      *
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
      * *   This operation can be used to release the internal endpoint of a shard or Configserver node in a sharded cluster instance. For more information, see [Release the endpoint of a shard or Configserver node](~~134067~~).
      * *   To release the public endpoint of a shard or Configserver node in a sharded cluster instance, you can call the [ReleasePublicNetworkAddress](~~67604~~) operation.
      *
     */
    @Override
    public CompletableFuture<ReleaseNodePrivateNetworkAddressResponse> releaseNodePrivateNetworkAddress(ReleaseNodePrivateNetworkAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseNodePrivateNetworkAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseNodePrivateNetworkAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseNodePrivateNetworkAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReleasePublicNetworkAddressResponse> releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleasePublicNetworkAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleasePublicNetworkAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleasePublicNetworkAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB before you call this operation.
      * This parameter is only applicable to Subscription instances.
      *
     */
    @Override
    public CompletableFuture<RenewDBInstanceResponse> renewDBInstance(RenewDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  This operation can reset only the password of the root account of an instance.
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

    /**
      * This operation can also be used to restart an instance, or restart a shard or mongos node in a sharded cluster instance.
      *
     */
    @Override
    public CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is no longer maintained and will be unavailable.
      * This operation is applicable only to replica set instances. You can clone a standalone instance by [creating an instance from a backup set](~~55013~~). You can clone a sharded cluster instance by calling the [CreateShardingDBInstance](~~61884~~) operation.
      * >  This operation overwrites the data of the current instance, and the data cannot be recovered. Proceed with caution.
      *
     */
    @Override
    public CompletableFuture<RestoreDBInstanceResponse> restoreDBInstance(RestoreDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestoreDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestoreDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestoreDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The instance must be running when you call this operation.
      * > 
      * *   This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.
      * *   On replica set instances, the switch is performed between instances. On sharded cluster instances, the switch is performed between shards.
      *
     */
    @Override
    public CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchDBInstanceHA").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchDBInstanceHAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchDBInstanceHAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can create multiple tags and bind them to multiple instances. This allows you to classify and filter instances by tag.
      * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can have the same value.
      * *   If the tag you specify does not exist, this tag is automatically created and bound to the specified instance.
      * *   If a tag that has the same key is already bound to the instance, the new tag overwrites the existing tag.
      * *   You can bind up to 20 tags to each instance.
      * *   You can bind tags to up to 50 instances each time you call the operation.
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
      * *   The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.
      * *   You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. Cloud disk-based sharded cluster instances that are created on or after October 19, 2023 are set to the cluster backup mode by default.
      *
     */
    @Override
    public CompletableFuture<TransferClusterBackupResponse> transferClusterBackup(TransferClusterBackupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferClusterBackup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferClusterBackupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferClusterBackupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is in the Running state.
      * *   Your instance has no unpaid billing method change orders.
      * *   The instance type is available for purchase. For more information about unavailable instance types, see [Instance types](~~57141~~).
      * > To change the billing method of an instance whose instance type is no longer available to purchase, call the [ModifyDBInstanceSpec](~~61816~~) or [ModifyNodeSpec](~~61923~~) operation to first change the instance type.
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
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      * A subscription instance cannot be changed to a pay-as-you-go instance. To avoid wasting resources, proceed with caution.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is in the running state.
      * *   The billing method of the instance is pay-as-you-go.
      * *   The instance has no unpaid subscription orders.
      * *   The instance type is available for purchase. For more information about unavailable instance types, see [Instance types](~~57141~~).
      * >  To change the billing method of an instance whose instance type is no longer available to subscription, call the [ModifyDBInstanceSpec](~~61816~~) or [ModifyNodeSpec](~~61923~~) operation to first change the instance type.
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

    /**
      * > 
      * *   You can remove up to 20 tags at a time.
      * *   If you remove a tag from all instances, the tag is automatically deleted.
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

    /**
      * The instance must be in the running state when you call this operation.
      * > * The available database versions depend on the storage engine used by the instance. For more information, see [Upgrades of MongoDB major versions](~~398673~~). You can also call the [DescribeAvailableEngineVersion](~~141355~~) operation to query the available database versions.
      * > * You cannot downgrade the MongoDB version of an instance after you upgrade it.
      * > * The instance is automatically restarted for two to three times during the upgrade process. Make sure that you upgrade the instance during off-peak hours.
      *
     */
    @Override
    public CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeDBInstanceEngineVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeDBInstanceEngineVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeDBInstanceEngineVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call the UpgradeDBInstanceKernelVersion operation, the instance must be in the Running state.
      * > * The UpgradeDBInstanceKernelVersion operation is applicable to replica set and sharded cluster instances, but not to standalone instances.
      * > * The instance will be restarted once during the upgrade. Call this operation during off-peak hours.
      *
     */
    @Override
    public CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeDBInstanceKernelVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeDBInstanceKernelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeDBInstanceKernelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
