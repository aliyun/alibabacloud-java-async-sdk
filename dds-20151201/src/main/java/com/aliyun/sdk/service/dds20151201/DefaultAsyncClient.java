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
            new TeaPair("cn-qingdao", "mongodb.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-beijing", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mongodb.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mongodb.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mongodb.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-heyuan", "mongodb.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "mongodb.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mongodb.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mongodb.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mongodb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mongodb.ap-southeast-1.aliyuncs.com"),
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
            new TeaPair("cn-shanghai-finance-1", "mongodb.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mongodb.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mongodb.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mongodb.cn-beijing-finance-1.aliyuncs.com"),
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
            new TeaPair("rus-west-1-pop", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "mongodb.cn-zhengzhou-jva.aliyuncs.com"),
            new TeaPair("cn-wuhan-lr", "mongodb.cn-wuhan-lr.aliyuncs.com"),
            new TeaPair("cn-nanjing", "mongodb.cn-nanjing.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "mongodb.ap-northeast-2.aliyuncs.com"),
            new TeaPair("cn-fuzhou", "mongodb.cn-fuzhou.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "mongodb.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "mongodb.ap-southeast-7.aliyuncs.com"),
            new TeaPair("us-southeast-1", "mongodb.us-southeast-1.aliyuncs.com"),
            new TeaPair("sa-east-1", "mongodb.sa-east-1.aliyuncs.com"),
            new TeaPair("na-south-1", "mongodb.na-south-1.aliyuncs.com"),
            new TeaPair("me-central-1", "mongodb.me-central-1.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "mongodb.cn-heyuan-acdr-1.aliyuncs.com"),
            new TeaPair("cn-wulanchabu-gic-1", "mongodb.cn-wulanchabu-gic-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>This operation applies only to replica set instances and sharded cluster instances that use cloud disks.</p>
     * 
     * @param request the request parameters of AllocateDBInstanceSrvNetworkAddress  AllocateDBInstanceSrvNetworkAddressRequest
     * @return AllocateDBInstanceSrvNetworkAddressResponse
     */
    @Override
    public CompletableFuture<AllocateDBInstanceSrvNetworkAddressResponse> allocateDBInstanceSrvNetworkAddress(AllocateDBInstanceSrvNetworkAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateDBInstanceSrvNetworkAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateDBInstanceSrvNetworkAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateDBInstanceSrvNetworkAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation applies only to sharded cluster instances. For more details, see <a href="https://help.aliyun.com/document_detail/134037.html">Apply for an endpoint for a shard or ConfigServer node</a>.</p>
     * <blockquote>
     * <p>The allocated endpoint supports only internal network access. If you require public network access, invoke the <a href="https://help.aliyun.com/document_detail/67602.html">AllocatePublicNetworkAddress</a> operation to apply for a public endpoint.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AllocateNodePrivateNetworkAddress  AllocateNodePrivateNetworkAddressRequest
     * @return AllocateNodePrivateNetworkAddressResponse
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

    /**
     * @param request the request parameters of AllocatePublicNetworkAddress  AllocatePublicNetworkAddressRequest
     * @return AllocatePublicNetworkAddressResponse
     */
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
     * <b>description</b> :
     * <p>Scenarios where O&amp;M events cannot be canceled:</p>
     * <ul>
     * <li>The event cannot be canceled (AllowCancel is 0).</li>
     * <li>The current time is later than the start time of the O&amp;M event.</li>
     * <li>The status of the O&amp;M event is not Pending Execution (Status is not 3).</li>
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
     * <b>description</b> :
     * <p>Before you invoke the <a href="https://help.aliyun.com/document_detail/131267.html">ModifyDBInstanceTDE</a> operation to enable transparent data encryption (TDE), invoke this operation to query the authorization of the KMS key for the MongoDB instance.</p>
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
     * <p>This operation is applicable to replica set instances or sharded cluster instances.</p>
     * <blockquote>
     * <p>After you call this operation to confirm that the conditions for data restoration are met, you can call the <a href="https://help.aliyun.com/document_detail/61763.html">CreateDBInstance</a> operation to restore data to a new instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CheckRecoveryCondition  CheckRecoveryConditionRequest
     * @return CheckRecoveryConditionResponse
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
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    @Override
    public CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckServiceLinkedRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckServiceLinkedRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckServiceLinkedRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Shard accounts can be created only for ApsaraDB for MongoDB sharded cluster instances with cloud disks.</li>
     * <li>Shard accounts are granted fixed read-only permissions.</li>
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
     * <p>The instance status must be running when you invoke the CreateBackup operation.</p>
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
     * <p>Before using this operation, make sure you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     * For information about instance specifications, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance specifications</a>.
     * To create a sharded cluster instance, call the <a href="https://help.aliyun.com/document_detail/61884.html">CreateShardingDBInstance</a> operation.</p>
     * 
     * @param request the request parameters of CreateDBInstance  CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
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
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     * This operation is applicable only to sharded cluster instances.</p>
     * 
     * @param request the request parameters of CreateNode  CreateNodeRequest
     * @return CreateNodeResponse
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
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB before you call this operation.
     * This operation is applicable only to ApsaraDB for MongoDB sharded cluster instances.</p>
     * 
     * @param request the request parameters of CreateNodeBatch  CreateNodeBatchRequest
     * @return CreateNodeBatchResponse
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
     * @param request the request parameters of CreateNodeRoleTag  CreateNodeRoleTagRequest
     * @return CreateNodeRoleTagResponse
     */
    @Override
    public CompletableFuture<CreateNodeRoleTagResponse> createNodeRoleTag(CreateNodeRoleTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNodeRoleTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNodeRoleTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNodeRoleTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.</li>
     * <li>For more information about the specifications of ApsaraDB for MongoDB instances, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance specifications</a>.</li>
     * <li>To create a standalone instance or a replica set instance, call the <a href="https://help.aliyun.com/document_detail/61763.html">CreateDBInstance</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateShardingDBInstance  CreateShardingDBInstanceRequest
     * @return CreateShardingDBInstanceResponse
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
     * <b>description</b> :
     * <p>Only manual backups can be deleted.
     * Only MongoDB instances with cloud disks are supported.</p>
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
     * <p>The instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance status is running.</li>
     * <li>The billing method of the instance is pay-as-you-go.<blockquote>
     * <p>After an instance is released, its data cannot be recovered. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBInstance  DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
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

    /**
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
     * <p>When you invoke this operation, the instance must meet the following requirements: </p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The instance is a sharded cluster instance.</li>
     * <li>The billing method of the instance is pay-as-you-go.</li>
     * <li>The number of shard or mongos nodes in the instance is greater than 2.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteNode  DeleteNodeRequest
     * @return DeleteNodeResponse
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
     * @param request the request parameters of DescribeActiveOperationTaskRegion  DescribeActiveOperationTaskRegionRequest
     * @return DescribeActiveOperationTaskRegionResponse
     */
    @Override
    public CompletableFuture<DescribeActiveOperationTaskRegionResponse> describeActiveOperationTaskRegion(DescribeActiveOperationTaskRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActiveOperationTaskRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActiveOperationTaskRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActiveOperationTaskRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer updated and will be unavailable.</p>
     * 
     * @param request the request parameters of DescribeActiveOperationTaskType  DescribeActiveOperationTaskTypeRequest
     * @return DescribeActiveOperationTaskTypeResponse
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
     * <p>Queries advanced backup policies. This operation is supported only for cloud disk replica set and cloud disk sharded cluster instances.</p>
     * 
     * @param request the request parameters of DescribeAdvancedBackupPolicy  DescribeAdvancedBackupPolicyRequest
     * @return DescribeAdvancedBackupPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeAdvancedBackupPolicyResponse> describeAdvancedBackupPolicy(DescribeAdvancedBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAdvancedBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAdvancedBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAdvancedBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries whether advanced backup is enabled. This operation supports only cloud disk replica set instances and cloud disk sharded cluster instances.</p>
     * 
     * @param request the request parameters of DescribeAdvancedBackupStatus  DescribeAdvancedBackupStatusRequest
     * @return DescribeAdvancedBackupStatusResponse
     */
    @Override
    public CompletableFuture<DescribeAdvancedBackupStatusResponse> describeAdvancedBackupStatus(DescribeAdvancedBackupStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAdvancedBackupStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAdvancedBackupStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAdvancedBackupStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The instance must be in the running state when you call this operation.</li>
     * <li>This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</li>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuditLogFilter  DescribeAuditLogFilterRequest
     * @return DescribeAuditLogFilterResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The instance must be in the running state.</li>
     * <li>This operation is available only for <strong>General-purpose Local Disk Edition</strong> and <strong>Dedicated Local Disk Edition</strong> instances.</li>
     * <li>You can call this operation up to 30 times per minute. Calls that exceed this limit are throttled. To make frequent calls, use Log Service. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuditPolicy  DescribeAuditPolicyRequest
     * @return DescribeAuditPolicyResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The audit log feature must be enabled for the instance before you call this operation. Otherwise, the returned audit log content is empty.</li>
     * <li>This operation applies to instances of the <strong>General-purpose local disk</strong> and <strong>Dedicated local disk</strong> specification types.</li>
     * <li>This operation can be called up to 30 times per minute. Calls that exceed this limit are throttled. Do not call this operation at a high frequency. If high-frequency calls are required, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>Queries the zones in which an ApsaraDB for MongoDB instance can be deployed under specified purchase conditions. The region ID is required in the purchase condition.</p>
     * 
     * @param request the request parameters of DescribeAvailabilityZones  DescribeAvailabilityZonesRequest
     * @return DescribeAvailabilityZonesResponse
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

    /**
     * @param request the request parameters of DescribeAvailableEngineVersion  DescribeAvailableEngineVersionRequest
     * @return DescribeAvailableEngineVersionResponse
     */
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
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/61763.html">CreateDBInstance</a> operation to restore a database for an ApsaraDB for MongoDB instance. For more information, see <a href="https://help.aliyun.com/document_detail/112274.html">Restore one database of an ApsaraDB for MongoDB instance</a>.
     * Before you call this operation, make sure that the instance meets the following requirements:</p>
     * <ul>
     * <li>The instance was created after March 26, 2019.</li>
     * <li>The instance is located in the China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), or Singapore region. Other regions are not supported.</li>
     * <li>The instance is a replica set instance.</li>
     * <li>The instance runs MongoDB 3.4, MongoDB 4.0, or MongoDB 4.2. In addition, the instance uses local disks to store data.</li>
     * <li>The storage engine of the instance is WiredTiger.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeBackupDBs  DescribeBackupDBsRequest
     * @return DescribeBackupDBsResponse
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
     * <b>description</b> :
     * <p>Backup usage for a sharded cluster is billed on a per-shard basis. You can use this operation to query the backup usage for a single shard.</p>
     * 
     * @param request the request parameters of DescribeBackupStorage  DescribeBackupStorageRequest
     * @return DescribeBackupStorageResponse
     */
    @Override
    public CompletableFuture<DescribeBackupStorageResponse> describeBackupStorage(DescribeBackupStorageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupStorage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupStorageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupStorageResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeBinlogFiles  DescribeBinlogFilesRequest
     * @return DescribeBinlogFilesResponse
     */
    @Override
    public CompletableFuture<DescribeBinlogFilesResponse> describeBinlogFiles(DescribeBinlogFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBinlogFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBinlogFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBinlogFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For sharded cluster instances that use cloud disks and were created before October 19, 2023, you must first call the <a href="https://help.aliyun.com/document_detail/2587931.html">TransferClusterBackup</a> operation to convert shard backups to cluster backups.
     * Sharded cluster instances that use cloud disks and were created after October 19, 2023 use cluster backups by default.</p>
     * 
     * @param request the request parameters of DescribeClusterBackups  DescribeClusterBackupsRequest
     * @return DescribeClusterBackupsResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The MongoDB instance must be a sharded cluster instance that runs major engine version 4.4 or later and uses standard SSDs as the storage pattern.</li>
     * <li>Only instances created before October 19, 2023 need to invoke the TransferClusterBackup operation to switch to the cluster backup mode. Instances that have been switched to the cluster backup mode or sharded cluster instances with cloud disks created on or after October 19, 2023 can directly invoke this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClusterRecoverTime  DescribeClusterRecoverTimeRequest
     * @return DescribeClusterRecoverTimeResponse
     */
    @Override
    public CompletableFuture<DescribeClusterRecoverTimeResponse> describeClusterRecoverTime(DescribeClusterRecoverTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterRecoverTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterRecoverTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterRecoverTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBInstanceAttribute  DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
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
     * <b>description</b> :
     * <p>When you invoke the DescribeDBInstanceEncryptionKey operation, transparent data encryption (TDE) must be enabled for the instance by using Bring Your Own Key (BYOK). You can invoke <a href="https://help.aliyun.com/document_detail/131267.html">ModifyDBInstanceTDE</a> to enable TDE.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceEncryptionKey  DescribeDBInstanceEncryptionKeyRequest
     * @return DescribeDBInstanceEncryptionKeyResponse
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
     * @param request the request parameters of DescribeDBInstancePerformance  DescribeDBInstancePerformanceRequest
     * @return DescribeDBInstancePerformanceResponse
     */
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
     * <b>description</b> :
     * <p>To use this operation, the instance must meet the following requirements:</p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The instance is a replica set instance or a sharded cluster instance.<ul>
     * <li>The replica set instance must be version 3.4 or later.</li>
     * <li>The sharded cluster instance must use Enhanced SSDs (ESSDs).</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceSSL  DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
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
     * @param request the request parameters of DescribeDBInstanceSpecInfo  DescribeDBInstanceSpecInfoRequest
     * @return DescribeDBInstanceSpecInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDBInstanceSpecInfoResponse> describeDBInstanceSpecInfo(DescribeDBInstanceSpecInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceSpecInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceSpecInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceSpecInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is a replica set or sharded cluster instance.</li>
     * <li>The instance uses local physical disks to store data.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceSwitchLog  DescribeDBInstanceSwitchLogRequest
     * @return DescribeDBInstanceSwitchLogResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>For more information about this feature, see <a href="https://help.aliyun.com/document_detail/131048.html">Settings for transparent data encryption TDE</a>.
     * When you invoke this operation, the instance must meet the following conditions:</p>
     * </blockquote>
     * <ul>
     * <li>The instance is a replica set instance or a sharded cluster instance.</li>
     * <li>The storage DPI engine of the instance is WiredTiger.</li>
     * <li>The database DPI engine version of the instance is 4.0 or 4.2. If the database DPI engine version is earlier than the required version, you can invoke the <a href="https://help.aliyun.com/document_detail/67608.html">UpgradeDBInstanceEngineVersion</a> operation to upgrade the database DPI engine version.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceTDEInfo  DescribeDBInstanceTDEInfoRequest
     * @return DescribeDBInstanceTDEInfoResponse
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;By default, this operation queries the list of replica set instances (including single-node instances). If the request parameter <strong>DBInstanceType</strong> is not specified, the default value of this parameter is <strong>replicate</strong>. To query the list of sharded cluster instances, set <strong>DBInstanceType</strong> to <strong>sharding</strong>. To query the list of Serverless instances, set <strong>DBInstanceType</strong> to <strong>serverless</strong>.
     * &lt;props=&quot;intl&quot;&gt;By default, this operation queries the list of replica set instances (including single-node instances). If the request parameter <strong>DBInstanceType</strong> is not specified, the default value of this parameter is <strong>replicate</strong>. To query the list of sharded cluster instances, set <strong>DBInstanceType</strong> to <strong>sharding</strong>.</p>
     * 
     * @param request the request parameters of DescribeDBInstances  DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
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
     * <b>description</b> :
     * <ul>
     * <li>If you do not specify any instances, the operation returns overview information for all instances in the destination region associated with your Alibaba Cloud account.</li>
     * <li>The results of this operation are not paginated.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstancesOverview  DescribeDBInstancesOverviewRequest
     * @return DescribeDBInstancesOverviewResponse
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
     * <b>description</b> :
     * <ul>
     * <li>This operation applies to instances of the <strong>General-purpose Local Disk</strong> and <strong>Dedicated Local Disk</strong> specification types.</li>
     * <li>This operation is limited to 30 calls per minute. Exceeding this limit triggers throttling. Do not call this operation at a high frequency. For high-frequency access, use Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeErrorLogRecords  DescribeErrorLogRecordsRequest
     * @return DescribeErrorLogRecordsResponse
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

    /**
     * @param request the request parameters of DescribeGlobalSecurityIPGroup  DescribeGlobalSecurityIPGroupRequest
     * @return DescribeGlobalSecurityIPGroupResponse
     */
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
     * <b>description</b> :
     * <p>This operation is applicable to subscription instances.</p>
     * 
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
     * @param request the request parameters of DescribeInstanceRecoverTime  DescribeInstanceRecoverTimeRequest
     * @return DescribeInstanceRecoverTimeResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceRecoverTimeResponse> describeInstanceRecoverTime(DescribeInstanceRecoverTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceRecoverTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceRecoverTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceRecoverTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeKernelReleaseNotes  DescribeKernelReleaseNotesRequest
     * @return DescribeKernelReleaseNotesResponse
     */
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
     * <b>description</b> :
     * <p>Queried keys are available only for disk encryption.</p>
     * 
     * @param request the request parameters of DescribeKmsKeys  DescribeKmsKeysRequest
     * @return DescribeKmsKeysResponse
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
     * <b>description</b> :
     * <p>This API applies to General-purpose and Dedicated instances that use local disks.
     * You can enable the audit log feature for ApsaraDB for MongoDB as needed. For more information, see <a href="https://help.aliyun.com/document_detail/59903.html">Enable audit logs</a>.</p>
     * <ul>
     * <li>As of January 6, 2022, the official version of the audit log feature is being rolled out to all regions. New requests for the free trial version are no longer accepted. For more information, see <a href="~~377480~~">[Notice] ApsaraDB for MongoDB launches pay-as-you-go audit logs and discontinues the free trial</a>.</li>
     * <li>The official version of the audit log feature is pay-as-you-go. Charges are based on storage usage and retention period. For pricing details, see &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product?#/mongodb/detail/badds">ApsaraDB for MongoDB pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">ApsaraDB for MongoDB pricing</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMongoDBLogConfig  DescribeMongoDBLogConfigRequest
     * @return DescribeMongoDBLogConfigResponse
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
     * <b>description</b> :
     * <p>Queries the vSwitches that are available in a specified region and zone. Use this before creating an ApsaraDB for MongoDB instance to select a vSwitch.</p>
     * 
     * @param request the request parameters of DescribeRdsVSwitchs  DescribeRdsVSwitchsRequest
     * @return DescribeRdsVSwitchsResponse
     */
    @Override
    public CompletableFuture<DescribeRdsVSwitchsResponse> describeRdsVSwitchs(DescribeRdsVSwitchsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRdsVSwitchs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRdsVSwitchsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRdsVSwitchsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries available VPCs in a specified region and zone. Use this before creating an ApsaraDB for MongoDB instance to select a VPC.</p>
     * 
     * @param request the request parameters of DescribeRdsVpcs  DescribeRdsVpcsRequest
     * @return DescribeRdsVpcsResponse
     */
    @Override
    public CompletableFuture<DescribeRdsVpcsResponse> describeRdsVpcs(DescribeRdsVpcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRdsVpcs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRdsVpcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRdsVpcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To query available regions and zones in which an ApsaraDB for MongoDB instance can be created, call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>This operation applies to subscription MongoDB instances.</p>
     * 
     * @param request the request parameters of DescribeRenewalPrice  DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
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
     * <b>description</b> :
     * <p>This operation applies to replica set instances and single-node instances. It does not apply to sharded cluster instances.</p>
     * 
     * @param request the request parameters of DescribeReplicaSetRole  DescribeReplicaSetRoleRequest
     * @return DescribeReplicaSetRoleResponse
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
     * @param request the request parameters of DescribeRestoreDBInstanceList  DescribeRestoreDBInstanceListRequest
     * @return DescribeRestoreDBInstanceListResponse
     */
    @Override
    public CompletableFuture<DescribeRestoreDBInstanceListResponse> describeRestoreDBInstanceList(DescribeRestoreDBInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRestoreDBInstanceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRestoreDBInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRestoreDBInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRoleTagStatus  DescribeRoleTagStatusRequest
     * @return DescribeRoleTagStatusResponse
     */
    @Override
    public CompletableFuture<DescribeRoleTagStatusResponse> describeRoleTagStatus(DescribeRoleTagStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRoleTagStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRoleTagStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRoleTagStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/123825.html">View the zone of a node</a>.
     * This operation is applicable to replica set instances and sharded cluster instances. Standalone instances are not supported.</p>
     * </blockquote>
     * 
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
     * <ul>
     * <li>This operation is applicable to instances of the <strong>shared local disk</strong>, <strong>dedicated local disk</strong>, and <strong>cloud disk</strong> specification types.</li>
     * <li>This operation is limited to 30 calls per minute. If this limit is exceeded, the calls are throttled. Do not call this operation at a high frequency. If you need to call this operation at a high frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
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
     * <p>This API is for sharded cluster instances only.</p>
     * 
     * @param request the request parameters of DescribeShardingNetworkAddress  DescribeShardingNetworkAddressRequest
     * @return DescribeShardingNetworkAddressResponse
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
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</li>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>You can use the custom keys obtained by calling DescribeUserEncryptionKeyList to enable transparent data encryption (TDE). For more information, see <a href="https://help.aliyun.com/document_detail/131267.html">ModifyDBInstanceTDE</a>.</p>
     * 
     * @param request the request parameters of DescribeUserEncryptionKeyList  DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
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
     * @param request the request parameters of DescribeVpcsForMongoDB  DescribeVpcsForMongoDBRequest
     * @return DescribeVpcsForMongoDBResponse
     */
    @Override
    public CompletableFuture<DescribeVpcsForMongoDBResponse> describeVpcsForMongoDB(DescribeVpcsForMongoDBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcsForMongoDB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcsForMongoDBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcsForMongoDBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is a replica set instance or a sharded cluster instance that uses local disks.</li>
     * <li>The billing method of the instance is subscription.</li>
     * <li>The instance has expired and is in the <strong>Locking</strong> state.
     * **
     * <strong>Warning</strong> Data cannot be restored after the instance is destroyed. Proceed with caution.</li>
     * </ul>
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
     * <p>This operation evaluates resources for ApsaraDB for MongoDB replica set and sharded cluster instances. It supports resource evaluation for creating replica set and sharded cluster instances, changing instance specifications, and adding nodes to sharded cluster instances.</p>
     * <blockquote>
     * <p>You can call this operation up to 200 times per minute. Exceeding this limit triggers throttling.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EvaluateResource  EvaluateResourceRequest
     * @return EvaluateResourceResponse
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

    /**
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
     * <b>description</b> :
     * <ul>
     * <li>The MigrateAvailableZone operation does not support standalone instances. It is applicable to active cloud disk instances and local disk instances.</li>
     * <li>The transparent data encryption (TDE) feature is not enabled for the instance.</li>
     * <li>The destination zone and the current zone of the instance are in the same region.</li>
     * <li>If the instance is deployed in a VPC, make sure that a vSwitch is created in the destination zone before you migrate the zone. For more information, see <a href="https://help.aliyun.com/document_detail/65387.html">Create a vSwitch</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of MigrateAvailableZone  MigrateAvailableZoneRequest
     * @return MigrateAvailableZoneResponse
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
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable to replica set instances. Standalone instances and sharded cluster instances are not supported.</li>
     * <li>Transparent Data Encryption (TDE) is not enabled for the instance.</li>
     * <li>The destination zone and the current zone of the instance must be in the same region.</li>
     * <li>If the instance is deployed in a virtual private cloud (VPC), make sure that a vSwitch is created in the destination zone before you migrate the instance. For more information, see <a href="https://help.aliyun.com/document_detail/65387.html">Create a vSwitch</a>.</li>
     * </ul>
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
     * <p>This operation is not supported for sharded cluster instances.</p>
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
     * @param request the request parameters of ModifyActiveOperationMaintenanceConfig  ModifyActiveOperationMaintenanceConfigRequest
     * @return ModifyActiveOperationMaintenanceConfigResponse
     */
    @Override
    public CompletableFuture<ModifyActiveOperationMaintenanceConfigResponse> modifyActiveOperationMaintenanceConfig(ModifyActiveOperationMaintenanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyActiveOperationMaintenanceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyActiveOperationMaintenanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyActiveOperationMaintenanceConfigResponse> future = new CompletableFuture<>();
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
     * <p>Geo-redundancy applies only to cloud disk replica set and cloud disk sharded instances.</p>
     * 
     * @param request the request parameters of ModifyAdvancedBackupPolicy  ModifyAdvancedBackupPolicyRequest
     * @return ModifyAdvancedBackupPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyAdvancedBackupPolicyResponse> modifyAdvancedBackupPolicy(ModifyAdvancedBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAdvancedBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAdvancedBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAdvancedBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Enables advanced backup. This feature is supported only for cloud disk replica set and sharded cluster instances.</p>
     * 
     * @param request the request parameters of ModifyAdvancedBackupStatus  ModifyAdvancedBackupStatusRequest
     * @return ModifyAdvancedBackupStatusResponse
     */
    @Override
    public CompletableFuture<ModifyAdvancedBackupStatusResponse> modifyAdvancedBackupStatus(ModifyAdvancedBackupStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAdvancedBackupStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAdvancedBackupStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAdvancedBackupStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The instance must be in the Running instance status when you invoke this operation.</li>
     * <li>This operation is limited to 30 calls per minute. If this limit is exceeded, the calls are throttled. Do not invoke this operation at a high frequency. If you require high-frequency calls, use a Logstore. For details, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAuditLogFilter  ModifyAuditLogFilterRequest
     * @return ModifyAuditLogFilterResponse
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
     * <b>description</b> :
     * <ul>
     * <li>This operation is limited to 30 calls per minute. If this limit is exceeded, the request is throttled. Do not call this operation at a high frequency. For high-frequency calls, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAuditPolicy  ModifyAuditPolicyRequest
     * @return ModifyAuditPolicyResponse
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

    /**
     * <b>description</b> :
     * <p>You can modify the TTL only for manual backups.
     * This operation is applicable only to MongoDB instances that use cloud disks.</p>
     * 
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
     * <b>description</b> :
     * <p>Cross-region backup is applicable only to replica set and sharded cluster instances that use cloud disks.</p>
     * 
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
     * <b>description</b> :
     * <p>This operation is applicable only to pay-as-you-go instances.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceAttribute  ModifyDBInstanceAttributeRequest
     * @return ModifyDBInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyDBInstanceAttributeResponse> modifyDBInstanceAttribute(ModifyDBInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBInstanceConfig  ModifyDBInstanceConfigRequest
     * @return ModifyDBInstanceConfigResponse
     */
    @Override
    public CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The instance types that support modifying the endpoint and port are as follows:</p>
     * <ul>
     * <li>You can modify the endpoints of instances with local disks and cloud disks.</li>
     * <li>For sharded cluster instances, you can modify only the endpoints of Mongos nodes.</li>
     * </ul>
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
     * @param request the request parameters of ModifyDBInstanceDescription  ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is not supported for instances with less than 40 GB of disk space.</li>
     * <li>You can change the disk type only to an ESSD AutoPL disk (cloud_auto).</li>
     * <li>The interval between two consecutive modifications to the provisioned input/output operations per second (IOPS) of an instance must be longer than one hour. For more information, see <a href="https://help.aliyun.com/document_detail/413275.html">Modify the performance of an ESSD AutoPL disk</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceDiskType  ModifyDBInstanceDiskTypeRequest
     * @return ModifyDBInstanceDiskTypeResponse
     */
    @Override
    public CompletableFuture<ModifyDBInstanceDiskTypeResponse> modifyDBInstanceDiskType(ModifyDBInstanceDiskTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceDiskType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceDiskTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceDiskTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBInstanceMaintainTime  ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
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
     * <b>description</b> :
     * <blockquote>
     * <p>Due to changes in the monitoring collection granularity adjustment feature, this operation is only applicable to the previous version of the MongoDB console.
     * To use this operation, the instance must meet the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li>A replica set or sharded cluster instance is used.</li>
     * <li>MongoDB 3.4 (the latest minor version) or MongoDB 4.0 is selected.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>When you call this operation, the instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The network type of the instance is hybrid access mode.<blockquote>
     * <p>This operation is applicable to replica set instances and sharded cluster instances. Standalone instances are not supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceNetExpireTime  ModifyDBInstanceNetExpireTimeRequest
     * @return ModifyDBInstanceNetExpireTimeResponse
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
     * <b>description</b> :
     * <ul>
     * <li>This operation applies to replica set instances and sharded cluster instances. Single-node instances are not supported. Only the transform from the classic network type to the VPC network type is supported.</li>
     * <li>This operation supports only instances that run MongoDB 4.2 or earlier and use local disks.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceNetworkType  ModifyDBInstanceNetworkTypeRequest
     * @return ModifyDBInstanceNetworkTypeResponse
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
     * <b>description</b> :
     * <p>When you call the ModifyDBInstanceSSL operation, the instance must meet the following conditions: </p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The instance is a replica set or sharded cluster instance.<ul>
     * <li>The MongoDB version of a replica set instance must be 3.4 or later.</li>
     * <li>The storage mode of a sharded cluster instance must be ESSD cloud disk.<blockquote>
     * <p>When you enable, update, or disable SSL, the instance restarts once. Perform this operation during off-peak hours.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceSSL  ModifyDBInstanceSSLRequest
     * @return ModifyDBInstanceSSLResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     * This operation is applicable only to ApsaraDB for MongoDB &lt;props=&quot;china&quot;&gt;<ph>standalone instances, replica set instances, and serverless instances</ph>&lt;props=&quot;intl&quot;&gt;<ph>standalone instances and replica set instances</ph>. To modify the configurations of a sharded cluster instance, call the <a href="https://help.aliyun.com/document_detail/61923.html">ModifyNodeSpec</a>, <a href="https://help.aliyun.com/document_detail/61911.html">CreateNode</a>, <a href="https://help.aliyun.com/document_detail/61922.html">DeleteNode</a>, or <a href="https://help.aliyun.com/document_detail/61816.html">ModifyNodeSpecBatch</a> operation based on your business requirements.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceSpec  ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
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
     * <b>description</b> :
     * <p>Transparent Data Encryption (TDE) performs real-time I/O encryption and decryption on data files. Data is encrypted before it is written to the disk and decrypted when it is read from the disk into the memory. For more information, see <a href="https://help.aliyun.com/document_detail/131048.html">Configure TDE</a>.</p>
     * <blockquote>
     * <p>You cannot disable TDE after it is enabled.
     * When you call this operation, the instance must meet the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li>The instance is a replica set instance or a sharded cluster instance.</li>
     * <li>The storage engine of the instance is WiredTiger.</li>
     * <li>The storage type of the instance is local disk.</li>
     * <li>The database version of the instance is 4.0 or 4.2. If the database version is earlier than 4.0, you can call the <a href="https://help.aliyun.com/document_detail/67608.html">UpgradeDBInstanceEngineVersion</a> operation to upgrade the database version.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceTDE  ModifyDBInstanceTDERequest
     * @return ModifyDBInstanceTDEResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a>.
     * This operation is applicable to subscription instances.</p>
     * <blockquote>
     * <p> When auto-renewal is enabled, your payment will be collected nine days before the expiration date of ApsaraDB for MongoDB. Ensure that your account has sufficient balance.</p>
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
     * <p>Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is a replica set or sharded cluster instance.</li>
     * <li>The database engine version of the instance is 4.0 (with the minor version of mongodb_20190408_3.0.11 or later) or 4.2. You can call the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> operation to view the database engine version of the instance. If necessary, you can call the <a href="https://help.aliyun.com/document_detail/67608.html">UpgradeDBInstanceEngineVersion</a> operation to upgrade the database engine version of the instance.</li>
     * <li>The network type of the instance must be VPC. If the network type of the instance is classic network, you must call the <a href="https://help.aliyun.com/document_detail/62138.html">ModifyDBInstanceNetworkType</a> operation to change the network type to VPC.</li>
     * <li>You can only disable but not enable password-free access over VPC.</li>
     * </ul>
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
     * <p>Make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB before you call this operation.</p>
     * <blockquote>
     * <p>This operation is applicable only to sharded cluster instances.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyNodeSpec  ModifyNodeSpecRequest
     * @return ModifyNodeSpecResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     *  This operation is applicable only to ApsaraDB for MongoDB sharded cluster instances.
     * When you perform batch upgrade or decrease the quota on multiple sharded cluster instances, the target specifications are subject to certain constraints. For example, for storage capacity expansion, the target capacity must be greater than or equal to the current capacity. If the specifications of multiple sharded cluster instances are inconsistent, the system randomly selects the specifications of one sharded cluster instance to construct the constraints, which may cause the upgrade or decrease the quota to fail.
     * If the batch upgrade or decrease the quota process is not Normal, we recommend that you use the ModifyNodeSpec operation to perform an Upgrade/Downgrade on a single sharded cluster instance.</p>
     * 
     * @param request the request parameters of ModifyNodeSpecBatch  ModifyNodeSpecBatchRequest
     * @return ModifyNodeSpecBatchResponse
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
     * <b>description</b> :
     * <ul>
     * <li>When you call this operation, the instance status must be running.</li>
     * <li>If you call this operation to modify specific instance parameters that require a restart to take effect, the instance is automatically restarted after the operation is called. You can call the <a href="https://help.aliyun.com/document_detail/67618.html">DescribeParameterTemplates</a> operation to identify which parameters require an instance restart to take effect after modification.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyParameters  ModifyParametersRequest
     * @return ModifyParametersResponse
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
     * <b>description</b> :
     * <p>Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a></p>
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
     * <blockquote>
     * <p>For a sharded cluster instance, the bound ECS security group takes effect only for mongos nodes.</p>
     * </blockquote>
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
     * <b>description</b> :
     * <p>This operation applies only to replica set instances and sharded cluster instances that use disks.</p>
     * 
     * @param request the request parameters of ModifySrvNetworkAddress  ModifySrvNetworkAddressRequest
     * @return ModifySrvNetworkAddressResponse
     */
    @Override
    public CompletableFuture<ModifySrvNetworkAddressResponse> modifySrvNetworkAddress(ModifySrvNetworkAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySrvNetworkAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySrvNetworkAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySrvNetworkAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The actions performed by this operation for a task vary based on the current state of the task. The supported actions for a task can be obtained from the value of the actionInfo parameter in the DescribeHistoryTasks operation.</p>
     * 
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
     * <ul>
     * <li>This operation releases the internal endpoint of a shard or Configserver node for a sharded cluster instance. For more information, see <a href="https://help.aliyun.com/document_detail/134067.html">Release the endpoint of a shard or Configserver node</a>.</li>
     * <li>To release the public endpoint of a shard or Configserver node for a sharded cluster instance, call the <a href="https://help.aliyun.com/document_detail/67604.html">ReleasePublicNetworkAddress</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseNodePrivateNetworkAddress  ReleaseNodePrivateNetworkAddressRequest
     * @return ReleaseNodePrivateNetworkAddressResponse
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

    /**
     * @param request the request parameters of ReleasePublicNetworkAddress  ReleasePublicNetworkAddressRequest
     * @return ReleasePublicNetworkAddressResponse
     */
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
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and pricing of ApsaraDB for MongoDB before you call this operation. For more information about the pricing of ApsaraDB for MongoDB, visit the <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing tab of the product buy page</a>.
     * This operation is only applicable to instances that use the subscription billing method.</p>
     * 
     * @param request the request parameters of RenewDBInstance  RenewDBInstanceRequest
     * @return RenewDBInstanceResponse
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
     * <b>description</b> :
     * <p>You can call this operation to restart an instance, or a specific shard or mongos node in a sharded cluster instance.</p>
     * 
     * @param request the request parameters of RestartDBInstance  RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
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
     * <b>description</b> :
     * <p>Limits:</p>
     * <ul>
     * <li>The instance is in the running state.</li>
     * <li>The instance is a standard replica set or sharded cluster instance.</li>
     * </ul>
     * 
     * @param request the request parameters of RestartNode  RestartNodeRequest
     * @return RestartNodeResponse
     */
    @Override
    public CompletableFuture<RestartNodeResponse> restartNode(RestartNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The instance must be running when you call this operation.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.</li>
     * <li>On replica set instances, the switch is performed between instances. On sharded cluster instances, the switch is performed between shards.</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchDBInstanceHA  SwitchDBInstanceHARequest
     * @return SwitchDBInstanceHAResponse
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
     * <b>description</b> :
     * <p>If you have a large number of instances, you can create multiple tags, bind the tags to the instances, and filter the instances by tag.</p>
     * <ul>
     * <li>A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.</li>
     * <li>If the tag that you specify does not exist, this tag is automatically created and bound to the specified instance.</li>
     * <li>If a tag that has the same key is already bound to the instance, the new tag overwrites the existing tag.</li>
     * <li>You can bind up to 20 tags to each instance.</li>
     * <li>You can bind tags to up to 50 instances each time you call the operation.</li>
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
     * <ul>
     * <li>The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.</li>
     * <li>You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. Cloud disk-based sharded cluster instances that are created on or after October 19, 2023 are set to the cluster backup mode by default.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferClusterBackup  TransferClusterBackupRequest
     * @return TransferClusterBackupResponse
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
     * <b>description</b> :
     * <p>Ensure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB before you call this operation.
     * When you call this operation, the instance must meet the following requirements:</p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The instance does not have unpaid orders for billing method transform.</li>
     * <li>The instance type is not a legacy instance type (an instance type that is no longer available). For more information about legacy instance types, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.<blockquote>
     * <p>To change the billing method of an instance of a legacy instance type, call the <a href="https://help.aliyun.com/document_detail/61816.html">ModifyDBInstanceSpec</a> or <a href="https://help.aliyun.com/document_detail/61923.html">ModifyNodeSpec</a> operation to change the instance type first.</p>
     * </blockquote>
     * </li>
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a>.
     * A subscription instance cannot be changed to a pay-as-you-go instance. To avoid wasting resources, proceed with caution.
     * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is in the running state.</li>
     * <li>The billing method of the instance is pay-as-you-go.</li>
     * <li>The instance has no unpaid subscription orders.</li>
     * <li>The instance type is available for purchase. For more information about unavailable instance types, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.<blockquote>
     * <p>To change the billing method of an instance whose instance type is no longer available to subscription, call the <a href="https://help.aliyun.com/document_detail/61816.html">ModifyDBInstanceSpec</a> or <a href="https://help.aliyun.com/document_detail/61923.html">ModifyNodeSpec</a> operation to first change the instance type.</p>
     * </blockquote>
     * </li>
     * </ul>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can remove up to 20 tags at a time.</li>
     * <li>If you remove a tag from all instances, the tag is automatically deleted.</li>
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
     * <p>The instance must be in the running state when you call this operation.</p>
     * <blockquote>
     * <ul>
     * <li><p>The available database versions depend on the storage engine used by the instance. For more information, see <a href="https://help.aliyun.com/document_detail/398673.html">Upgrades of MongoDB major versions</a>. You can also call the <a href="https://help.aliyun.com/document_detail/141355.html">DescribeAvailableEngineVersion</a> operation to query the available database versions.</p>
     * </li>
     * <li><p>You cannot downgrade the MongoDB version of an instance after you upgrade it.</p>
     * </li>
     * <li><p>The instance is automatically restarted for two to three times during the upgrade process. Make sure that you upgrade the instance during off-peak hours.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBInstanceEngineVersion  UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
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
     * <b>description</b> :
     * <p>When you call the UpgradeDBInstanceKernelVersion operation, the instance must be in the Running state.</p>
     * <blockquote>
     * <ul>
     * <li>The UpgradeDBInstanceKernelVersion operation is applicable to replica set and sharded cluster instances, but not to standalone instances.</li>
     * <li>The instance will be restarted once during the upgrade. Call this operation during off-peak hours.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBInstanceKernelVersion  UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
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
