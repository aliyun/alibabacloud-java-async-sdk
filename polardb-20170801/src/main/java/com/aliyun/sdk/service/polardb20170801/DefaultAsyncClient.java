// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.polardb20170801.models.*;
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
        this.product = "polardb";
        this.version = "2017-08-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing", "polardb.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "polardb.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "polardb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "polardb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-fujian", "polardb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "polardb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "polardb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "polardb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "polardb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "polardb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "polardb.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
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
     * @param request the request parameters of CancelScheduleTasks  CancelScheduleTasksRequest
     * @return CancelScheduleTasksResponse
     */
    @Override
    public CompletableFuture<CancelScheduleTasksResponse> cancelScheduleTasks(CancelScheduleTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelScheduleTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelScheduleTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelScheduleTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckAccountName  CheckAccountNameRequest
     * @return CheckAccountNameResponse
     */
    @Override
    public CompletableFuture<CheckAccountNameResponse> checkAccountName(CheckAccountNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckAccountName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckAccountNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckAccountNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckDBName  CheckDBNameRequest
     * @return CheckDBNameResponse
     */
    @Override
    public CompletableFuture<CheckDBNameResponse> checkDBName(CheckDBNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDBName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDBNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDBNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckKMSAuthorized  CheckKMSAuthorizedRequest
     * @return CheckKMSAuthorizedResponse
     */
    @Override
    public CompletableFuture<CheckKMSAuthorizedResponse> checkKMSAuthorized(CheckKMSAuthorizedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckKMSAuthorized").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckKMSAuthorizedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckKMSAuthorizedResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of CloseAITask  CloseAITaskRequest
     * @return CloseAITaskResponse
     */
    @Override
    public CompletableFuture<CloseAITaskResponse> closeAITask(CloseAITaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloseAITask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseAITaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseAITaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to cancel the migration task before data migration.</p>
     * <ul>
     * <li>You can call this operation to perform the migration task after data migration.<blockquote>
     * <p>Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Create a PolarDB for MySQL cluster by using the Migration from RDS method</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CloseDBClusterMigration  CloseDBClusterMigrationRequest
     * @return CloseDBClusterMigrationResponse
     */
    @Override
    public CompletableFuture<CloseDBClusterMigrationResponse> closeDBClusterMigration(CloseDBClusterMigrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloseDBClusterMigration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseDBClusterMigrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseDBClusterMigrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of CreateActivationCode  CreateActivationCodeRequest
     * @return CreateActivationCodeResponse
     */
    @Override
    public CompletableFuture<CreateActivationCodeResponse> createActivationCode(CreateActivationCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateActivationCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateActivationCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateActivationCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can manually create up to three backups for each cluster.</li>
     * <li>The <code>Exceeding the daily backup times of this DB cluster</code> error message indicates that three manual backups already exist in your cluster. You must delete existing backups before you call this operation to manually create backups. For more information about how to delete backups, see <a href="https://help.aliyun.com/document_detail/98101.html">Delete backups</a>.</li>
     * <li>After you call this operation, a backup task is created in the backend. The task may be time-consuming if you want to back up large amounts of data.</li>
     * </ul>
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
     * @param request the request parameters of CreateColdStorageInstance  CreateColdStorageInstanceRequest
     * @return CreateColdStorageInstanceResponse
     */
    @Override
    public CompletableFuture<CreateColdStorageInstanceResponse> createColdStorageInstance(CreateColdStorageInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateColdStorageInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateColdStorageInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateColdStorageInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDBCluster  CreateDBClusterRequest
     * @return CreateDBClusterResponse
     */
    @Override
    public CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDBClusterEndpoint  CreateDBClusterEndpointRequest
     * @return CreateDBClusterEndpointResponse
     */
    @Override
    public CompletableFuture<CreateDBClusterEndpointResponse> createDBClusterEndpoint(CreateDBClusterEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBClusterEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBClusterEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBClusterEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a public endpoint for the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDBEndpointAddress  CreateDBEndpointAddressRequest
     * @return CreateDBEndpointAddressResponse
     */
    @Override
    public CompletableFuture<CreateDBEndpointAddressResponse> createDBEndpointAddress(CreateDBEndpointAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBEndpointAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBEndpointAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBEndpointAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A database link can be used to connect two PolarDB for PostgreSQL(Compatible with Oracle) clusters, or connect a PolarDB for PostgreSQL(Compatible with Oracle) cluster to a user-created PostgreSQL database that is hosted on an Elastic Compute Service (ECS) instance. You can use database links to query data across clusters.</p>
     * <blockquote>
     * <ul>
     * <li>You can create up to 10 database links for a cluster.</li>
     * <li>Each database link connects a source cluster and a destination cluster.</li>
     * <li>The source cluster and the destination cluster or the destination ECS instance must be located in the same region.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDBLink  CreateDBLinkRequest
     * @return CreateDBLinkResponse
     */
    @Override
    public CompletableFuture<CreateDBLinkResponse> createDBLink(CreateDBLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDBNodes  CreateDBNodesRequest
     * @return CreateDBNodesResponse
     */
    @Override
    public CompletableFuture<CreateDBNodesResponse> createDBNodes(CreateDBNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The cluster is unlocked.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    @Override
    public CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateGlobalDataNetwork  CreateGlobalDataNetworkRequest
     * @return CreateGlobalDataNetworkResponse
     */
    @Override
    public CompletableFuture<CreateGlobalDataNetworkResponse> createGlobalDataNetwork(CreateGlobalDataNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGlobalDataNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGlobalDataNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGlobalDataNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A cluster belongs to only one GDN.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateGlobalDatabaseNetwork  CreateGlobalDatabaseNetworkRequest
     * @return CreateGlobalDatabaseNetworkResponse
     */
    @Override
    public CompletableFuture<CreateGlobalDatabaseNetworkResponse> createGlobalDatabaseNetwork(CreateGlobalDatabaseNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGlobalDatabaseNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGlobalDatabaseNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGlobalDatabaseNetworkResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of CreateOrGetVirtualLicenseOrder  CreateOrGetVirtualLicenseOrderRequest
     * @return CreateOrGetVirtualLicenseOrderResponse
     */
    @Override
    public CompletableFuture<CreateOrGetVirtualLicenseOrderResponse> createOrGetVirtualLicenseOrder(CreateOrGetVirtualLicenseOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrGetVirtualLicenseOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrGetVirtualLicenseOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrGetVirtualLicenseOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>You can call this operation only on a PolarDB for MySQL cluster.</p>
     * </blockquote>
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
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    @Override
    public CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceLinkedRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceLinkedRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceLinkedRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateStoragePlan  CreateStoragePlanRequest
     * @return CreateStoragePlanResponse
     */
    @Override
    public CompletableFuture<CreateStoragePlanResponse> createStoragePlan(CreateStoragePlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStoragePlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStoragePlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStoragePlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.</p>
     * </blockquote>
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
     * <p>Before you call this operation, make sure that the cluster meets the following requirements:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The backup sets are in the Success state.<blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query the status of backup sets.</li>
     * <li>After you delete the backup set file, the storage space that is occupied by the file is released. The released storage space is smaller than the size of the file because your snapshots share some data blocks</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
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
     * @param request the request parameters of DeleteDBCluster  DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    @Override
    public CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDBClusterEndpoint  DeleteDBClusterEndpointRequest
     * @return DeleteDBClusterEndpointResponse
     */
    @Override
    public CompletableFuture<DeleteDBClusterEndpointResponse> deleteDBClusterEndpoint(DeleteDBClusterEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBClusterEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBClusterEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBClusterEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can delete a public-facing or classic network endpoint of the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</li>
     * <li>Classic network endpoints are supported only on the China site (aliyun.com). Therefore, you do not need to delete classic network endpoints on the International site (alibabacloud.com).</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDBEndpointAddress  DeleteDBEndpointAddressRequest
     * @return DeleteDBEndpointAddressResponse
     */
    @Override
    public CompletableFuture<DeleteDBEndpointAddressResponse> deleteDBEndpointAddress(DeleteDBEndpointAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBEndpointAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBEndpointAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBEndpointAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDBLink  DeleteDBLinkRequest
     * @return DeleteDBLinkResponse
     */
    @Override
    public CompletableFuture<DeleteDBLinkResponse> deleteDBLink(DeleteDBLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDBNodes  DeleteDBNodesRequest
     * @return DeleteDBNodesResponse
     */
    @Override
    public CompletableFuture<DeleteDBNodesResponse> deleteDBNodes(DeleteDBNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The cluster must be in the Running state and unlocked. Otherwise, the specified database cannot be deleted.</li>
     * <li>The delete operation is performed in an asynchronous manner. A long period of time may be required to delete a large database. A success response for this operation only indicates that the request to delete the database is sent. You must query the database to check whether the database is deleted.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDatabase  DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     */
    @Override
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGlobalDataNetwork  DeleteGlobalDataNetworkRequest
     * @return DeleteGlobalDataNetworkResponse
     */
    @Override
    public CompletableFuture<DeleteGlobalDataNetworkResponse> deleteGlobalDataNetwork(DeleteGlobalDataNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGlobalDataNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGlobalDataNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGlobalDataNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can delete a GDN only when the GDN includes only a primary cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteGlobalDatabaseNetwork  DeleteGlobalDatabaseNetworkRequest
     * @return DeleteGlobalDatabaseNetworkResponse
     */
    @Override
    public CompletableFuture<DeleteGlobalDatabaseNetworkResponse> deleteGlobalDatabaseNetwork(DeleteGlobalDatabaseNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGlobalDatabaseNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGlobalDatabaseNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGlobalDatabaseNetworkResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteMaskingRules  DeleteMaskingRulesRequest
     * @return DeleteMaskingRulesResponse
     */
    @Override
    public CompletableFuture<DeleteMaskingRulesResponse> deleteMaskingRules(DeleteMaskingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMaskingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMaskingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMaskingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and quickly apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p> When you delete a parameter template, the parameter settings that are applied to PolarDB clusters are not affected.</p>
     * </blockquote>
     * 
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
     * @param request the request parameters of DescribeAITaskStatus  DescribeAITaskStatusRequest
     * @return DescribeAITaskStatusResponse
     */
    @Override
    public CompletableFuture<DescribeAITaskStatusResponse> describeAITaskStatus(DescribeAITaskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAITaskStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAITaskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAITaskStatusResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeActivationCodeDetails  DescribeActivationCodeDetailsRequest
     * @return DescribeActivationCodeDetailsResponse
     */
    @Override
    public CompletableFuture<DescribeActivationCodeDetailsResponse> describeActivationCodeDetails(DescribeActivationCodeDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActivationCodeDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActivationCodeDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActivationCodeDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeActivationCodes  DescribeActivationCodesRequest
     * @return DescribeActivationCodesResponse
     */
    @Override
    public CompletableFuture<DescribeActivationCodesResponse> describeActivationCodes(DescribeActivationCodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActivationCodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActivationCodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActivationCodesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeAutoRenewAttribute  DescribeAutoRenewAttributeRequest
     * @return DescribeAutoRenewAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeAutoRenewAttributeResponse> describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupLogs  DescribeBackupLogsRequest
     * @return DescribeBackupLogsResponse
     */
    @Override
    public CompletableFuture<DescribeBackupLogsResponse> describeBackupLogs(DescribeBackupLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupLogsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeCharacterSetName  DescribeCharacterSetNameRequest
     * @return DescribeCharacterSetNameResponse
     */
    @Override
    public CompletableFuture<DescribeCharacterSetNameResponse> describeCharacterSetName(DescribeCharacterSetNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCharacterSetName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCharacterSetNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCharacterSetNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClassList  DescribeClassListRequest
     * @return DescribeClassListResponse
     */
    @Override
    public CompletableFuture<DescribeClassListResponse> describeClassList(DescribeClassListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClassList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClassListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClassListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterAccessWhitelist  DescribeDBClusterAccessWhitelistRequest
     * @return DescribeDBClusterAccessWhitelistResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterAccessWhitelistResponse> describeDBClusterAccessWhitelist(DescribeDBClusterAccessWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterAccessWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterAccessWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterAccessWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterAttribute  DescribeDBClusterAttributeRequest
     * @return DescribeDBClusterAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterAuditLogCollector  DescribeDBClusterAuditLogCollectorRequest
     * @return DescribeDBClusterAuditLogCollectorResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterAuditLogCollectorResponse> describeDBClusterAuditLogCollector(DescribeDBClusterAuditLogCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterAuditLogCollector").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterAuditLogCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterAuditLogCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterAvailableResources  DescribeDBClusterAvailableResourcesRequest
     * @return DescribeDBClusterAvailableResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterAvailableResourcesResponse> describeDBClusterAvailableResources(DescribeDBClusterAvailableResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterAvailableResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterAvailableResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterAvailableResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterConnectivity  DescribeDBClusterConnectivityRequest
     * @return DescribeDBClusterConnectivityResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterConnectivityResponse> describeDBClusterConnectivity(DescribeDBClusterConnectivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterConnectivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterConnectivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterConnectivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterEndpoints  DescribeDBClusterEndpointsRequest
     * @return DescribeDBClusterEndpointsResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterEndpointsResponse> describeDBClusterEndpoints(DescribeDBClusterEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The ID of the request.</p>
     * 
     * @param request the request parameters of DescribeDBClusterMigration  DescribeDBClusterMigrationRequest
     * @return DescribeDBClusterMigrationResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterMigrationResponse> describeDBClusterMigration(DescribeDBClusterMigrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterMigration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterMigrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterMigrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterMonitor  DescribeDBClusterMonitorRequest
     * @return DescribeDBClusterMonitorResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterMonitorResponse> describeDBClusterMonitor(DescribeDBClusterMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterParameters  DescribeDBClusterParametersRequest
     * @return DescribeDBClusterParametersResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterParametersResponse> describeDBClusterParameters(DescribeDBClusterParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.<blockquote>
     * <p> By default, the monitoring data is collected once every 60 seconds. You can call the <a href="https://help.aliyun.com/document_detail/159557.html">ModifyDBClusterMonitor</a> operation to set the data collection interval to every 5 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBClusterPerformance  DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterPerformance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterPerformanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterPerformanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterSSL  DescribeDBClusterSSLRequest
     * @return DescribeDBClusterSSLResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterSSLResponse> describeDBClusterSSL(DescribeDBClusterSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterServerlessConf  DescribeDBClusterServerlessConfRequest
     * @return DescribeDBClusterServerlessConfResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterServerlessConfResponse> describeDBClusterServerlessConf(DescribeDBClusterServerlessConfRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterServerlessConf").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterServerlessConfResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterServerlessConfResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterTDE  DescribeDBClusterTDERequest
     * @return DescribeDBClusterTDEResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterTDEResponse> describeDBClusterTDE(DescribeDBClusterTDERequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterTDE").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterTDEResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterTDEResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusterVersion  DescribeDBClusterVersionRequest
     * @return DescribeDBClusterVersionResponse
     */
    @Override
    public CompletableFuture<DescribeDBClusterVersionResponse> describeDBClusterVersion(DescribeDBClusterVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusterVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClusterVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClusterVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClusters  DescribeDBClustersRequest
     * @return DescribeDBClustersResponse
     */
    @Override
    public CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBClustersWithBackups  DescribeDBClustersWithBackupsRequest
     * @return DescribeDBClustersWithBackupsResponse
     */
    @Override
    public CompletableFuture<DescribeDBClustersWithBackupsResponse> describeDBClustersWithBackups(DescribeDBClustersWithBackupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBClustersWithBackups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBClustersWithBackupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBClustersWithBackupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBInitializeVariable  DescribeDBInitializeVariableRequest
     * @return DescribeDBInitializeVariableResponse
     */
    @Override
    public CompletableFuture<DescribeDBInitializeVariableResponse> describeDBInitializeVariable(DescribeDBInitializeVariableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInitializeVariable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInitializeVariableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInitializeVariableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the database links that use a PolarDB for Oracle cluster as the source.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBLinks  DescribeDBLinksRequest
     * @return DescribeDBLinksResponse
     */
    @Override
    public CompletableFuture<DescribeDBLinksResponse> describeDBLinks(DescribeDBLinksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBLinks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBLinksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBLinksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.<blockquote>
     * <p> By default, the monitoring data is collected once every 60 seconds. You can call the <a href="https://help.aliyun.com/document_detail/159557.html">ModifyDBClusterMonitor</a> operation to set the data collection interval to every 5 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBNodePerformance  DescribeDBNodePerformanceRequest
     * @return DescribeDBNodePerformanceResponse
     */
    @Override
    public CompletableFuture<DescribeDBNodePerformanceResponse> describeDBNodePerformance(DescribeDBNodePerformanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBNodePerformance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBNodePerformanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBNodePerformanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBNodesParameters  DescribeDBNodesParametersRequest
     * @return DescribeDBNodesParametersResponse
     */
    @Override
    public CompletableFuture<DescribeDBNodesParametersResponse> describeDBNodesParameters(DescribeDBNodesParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBNodesParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBNodesParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBNodesParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBProxyPerformance  DescribeDBProxyPerformanceRequest
     * @return DescribeDBProxyPerformanceResponse
     */
    @Override
    public CompletableFuture<DescribeDBProxyPerformanceResponse> describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBProxyPerformance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBProxyPerformanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBProxyPerformanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDasConfig  DescribeDasConfigRequest
     * @return DescribeDasConfigResponse
     */
    @Override
    public CompletableFuture<DescribeDasConfigResponse> describeDasConfig(DescribeDasConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDasConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDasConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDasConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDatabases  DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     */
    @Override
    public CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDatabases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDatabasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDatabasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the PolarDB cluster is in the <strong>Released</strong> state. You must also confirm that the <strong>Retain All Backups Permanently</strong> or <strong>Retain Last Automatic Backup Permanently</strong> backup retention policy takes effect after you release the cluster. If you delete all backup sets after the cluster is released, you cannot use this API operation to query the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/98181.html">DescribeDBClusterAttribute</a> operation to query the cluster status.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDetachedBackups  DescribeDetachedBackupsRequest
     * @return DescribeDetachedBackupsResponse
     */
    @Override
    public CompletableFuture<DescribeDetachedBackupsResponse> describeDetachedBackups(DescribeDetachedBackupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDetachedBackups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDetachedBackupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDetachedBackupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGlobalDataNetworkList  DescribeGlobalDataNetworkListRequest
     * @return DescribeGlobalDataNetworkListResponse
     */
    @Override
    public CompletableFuture<DescribeGlobalDataNetworkListResponse> describeGlobalDataNetworkList(DescribeGlobalDataNetworkListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalDataNetworkList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalDataNetworkListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalDataNetworkListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGlobalDatabaseNetwork  DescribeGlobalDatabaseNetworkRequest
     * @return DescribeGlobalDatabaseNetworkResponse
     */
    @Override
    public CompletableFuture<DescribeGlobalDatabaseNetworkResponse> describeGlobalDatabaseNetwork(DescribeGlobalDatabaseNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalDatabaseNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalDatabaseNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalDatabaseNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGlobalDatabaseNetworks  DescribeGlobalDatabaseNetworksRequest
     * @return DescribeGlobalDatabaseNetworksResponse
     */
    @Override
    public CompletableFuture<DescribeGlobalDatabaseNetworksResponse> describeGlobalDatabaseNetworks(DescribeGlobalDatabaseNetworksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalDatabaseNetworks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalDatabaseNetworksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalDatabaseNetworksResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeLicenseOrderDetails  DescribeLicenseOrderDetailsRequest
     * @return DescribeLicenseOrderDetailsResponse
     */
    @Override
    public CompletableFuture<DescribeLicenseOrderDetailsResponse> describeLicenseOrderDetails(DescribeLicenseOrderDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLicenseOrderDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLicenseOrderDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLicenseOrderDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLicenseOrders  DescribeLicenseOrdersRequest
     * @return DescribeLicenseOrdersResponse
     */
    @Override
    public CompletableFuture<DescribeLicenseOrdersResponse> describeLicenseOrders(DescribeLicenseOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLicenseOrders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLicenseOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLicenseOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLogBackupPolicy  DescribeLogBackupPolicyRequest
     * @return DescribeLogBackupPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeLogBackupPolicyResponse> describeLogBackupPolicy(DescribeLogBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMaskingRules  DescribeMaskingRulesRequest
     * @return DescribeMaskingRulesResponse
     */
    @Override
    public CompletableFuture<DescribeMaskingRulesResponse> describeMaskingRules(DescribeMaskingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMaskingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMaskingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMaskingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMetaList  DescribeMetaListRequest
     * @return DescribeMetaListResponse
     */
    @Override
    public CompletableFuture<DescribeMetaListResponse> describeMetaList(DescribeMetaListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetaList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetaListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetaListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>This parameter is valid only for a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
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
     * @param request the request parameters of DescribePendingMaintenanceAction  DescribePendingMaintenanceActionRequest
     * @return DescribePendingMaintenanceActionResponse
     */
    @Override
    public CompletableFuture<DescribePendingMaintenanceActionResponse> describePendingMaintenanceAction(DescribePendingMaintenanceActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePendingMaintenanceAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePendingMaintenanceActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePendingMaintenanceActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePendingMaintenanceActions  DescribePendingMaintenanceActionsRequest
     * @return DescribePendingMaintenanceActionsResponse
     */
    @Override
    public CompletableFuture<DescribePendingMaintenanceActionsResponse> describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePendingMaintenanceActions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePendingMaintenanceActionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePendingMaintenanceActionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePolarSQLCollectorPolicy  DescribePolarSQLCollectorPolicyRequest
     * @return DescribePolarSQLCollectorPolicyResponse
     */
    @Override
    public CompletableFuture<DescribePolarSQLCollectorPolicyResponse> describePolarSQLCollectorPolicy(DescribePolarSQLCollectorPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePolarSQLCollectorPolicy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePolarSQLCollectorPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePolarSQLCollectorPolicyResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeScheduleTasks  DescribeScheduleTasksRequest
     * @return DescribeScheduleTasksResponse
     */
    @Override
    public CompletableFuture<DescribeScheduleTasksResponse> describeScheduleTasks(DescribeScheduleTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScheduleTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScheduleTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScheduleTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Only PolarDB MySQL Edition clusters support calling this interface.</li>
     * <li>Starting from September 1, 2024, due to the optimization of the SQL template algorithm, when calling this interface, the value of the SQLHash field will change. For more details, please refer to [Notice] Optimization of Slow SQL Template Algorithm (<del>2845725</del>).</li>
     * </ul>
     * </blockquote>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeSlowLogs  DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     */
    @Override
    public CompletableFuture<DescribeSlowLogsResponse> describeSlowLogs(DescribeSlowLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSlowLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSlowLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSlowLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to view the details of a task that is generated by a specific API operation or in the PolarDB console. The system calls the specific API operation when you perform an operation in the PolarDB console. For example, you can view the details of the task when you call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation or <a href="https://help.aliyun.com/document_detail/58769.html">create a cluster</a> in the PolarDB console.</p>
     * <ul>
     * <li>You can view the details of tasks that are generated only when you call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create a cluster and <code>CreationOption</code> is not set to <code>CreateGdnStandby</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
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

    /**
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
     * @param request the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    @Override
    public CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVSwitches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVSwitchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVSwitchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableDBClusterServerless  DisableDBClusterServerlessRequest
     * @return DisableDBClusterServerlessResponse
     */
    @Override
    public CompletableFuture<DisableDBClusterServerlessResponse> disableDBClusterServerless(DisableDBClusterServerlessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableDBClusterServerless").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableDBClusterServerlessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableDBClusterServerlessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableDBClusterServerless  EnableDBClusterServerlessRequest
     * @return EnableDBClusterServerlessResponse
     */
    @Override
    public CompletableFuture<EnableDBClusterServerlessResponse> enableDBClusterServerless(EnableDBClusterServerlessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableDBClusterServerless").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableDBClusterServerlessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableDBClusterServerlessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableFirewallRules  EnableFirewallRulesRequest
     * @return EnableFirewallRulesResponse
     */
    @Override
    public CompletableFuture<EnableFirewallRulesResponse> enableFirewallRules(EnableFirewallRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableFirewallRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableFirewallRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableFirewallRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EvaluateRegionResource  EvaluateRegionResourceRequest
     * @return EvaluateRegionResourceResponse
     */
    @Override
    public CompletableFuture<EvaluateRegionResourceResponse> evaluateRegionResource(EvaluateRegionResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EvaluateRegionResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EvaluateRegionResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EvaluateRegionResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FailoverDBCluster  FailoverDBClusterRequest
     * @return FailoverDBClusterResponse
     */
    @Override
    public CompletableFuture<FailoverDBClusterResponse> failoverDBCluster(FailoverDBClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FailoverDBCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FailoverDBClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FailoverDBClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>An account can be authorized to access one or more databases.</li>
     * <li>If the specified account already has the access permissions on the specified databases, the operation returns a successful response.</li>
     * <li>Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.</li>
     * <li>You can call this operation only on a PolarDB for MySQL cluster.</li>
     * <li>By default, a privileged account for a cluster has all the permissions on the databases in the cluster.</li>
     * </ul>
     * </blockquote>
     * 
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
     * @param request the request parameters of ManuallyStartDBCluster  ManuallyStartDBClusterRequest
     * @return ManuallyStartDBClusterResponse
     */
    @Override
    public CompletableFuture<ManuallyStartDBClusterResponse> manuallyStartDBCluster(ManuallyStartDBClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ManuallyStartDBCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ManuallyStartDBClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ManuallyStartDBClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of ModifyAutoRenewAttribute  ModifyAutoRenewAttributeRequest
     * @return ModifyAutoRenewAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyAutoRenewAttributeResponse> modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can also modify the automatic backup policy of a PolarDB cluster in the console. For more information, see <a href="https://help.aliyun.com/document_detail/280422.html">Backup settings</a>.</p>
     * </blockquote>
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
     * @param request the request parameters of ModifyDBCluster  ModifyDBClusterRequest
     * @return ModifyDBClusterResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterAccessWhitelist  ModifyDBClusterAccessWhitelistRequest
     * @return ModifyDBClusterAccessWhitelistResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterAccessWhitelistResponse> modifyDBClusterAccessWhitelist(ModifyDBClusterAccessWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterAccessWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterAccessWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterAccessWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterAndNodesParameters  ModifyDBClusterAndNodesParametersRequest
     * @return ModifyDBClusterAndNodesParametersResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterAndNodesParametersResponse> modifyDBClusterAndNodesParameters(ModifyDBClusterAndNodesParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterAndNodesParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterAndNodesParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterAndNodesParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterArch  ModifyDBClusterArchRequest
     * @return ModifyDBClusterArchResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterArchResponse> modifyDBClusterArch(ModifyDBClusterArchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterArch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterArchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterArchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterAuditLogCollector  ModifyDBClusterAuditLogCollectorRequest
     * @return ModifyDBClusterAuditLogCollectorResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterAuditLogCollectorResponse> modifyDBClusterAuditLogCollector(ModifyDBClusterAuditLogCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterAuditLogCollector").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterAuditLogCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterAuditLogCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterDeletion  ModifyDBClusterDeletionRequest
     * @return ModifyDBClusterDeletionResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterDeletionResponse> modifyDBClusterDeletion(ModifyDBClusterDeletionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterDeletion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterDeletionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterDeletionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterDescription  ModifyDBClusterDescriptionRequest
     * @return ModifyDBClusterDescriptionResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterEndpoint  ModifyDBClusterEndpointRequest
     * @return ModifyDBClusterEndpointResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterEndpointResponse> modifyDBClusterEndpoint(ModifyDBClusterEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> We recommend that you set the routine maintenance window to off-peak hours. Alibaba Cloud maintains your cluster within the specified maintenance window to minimize the negative impacts on your business.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDBClusterMaintainTime  ModifyDBClusterMaintainTimeRequest
     * @return ModifyDBClusterMaintainTimeResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterMaintainTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterMaintainTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterMaintainTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to switch the task that migrates data from ApsaraDB for RDS to PolarDB.</p>
     * <ul>
     * <li>You can call this operation to roll back the task that migrates data from ApsaraDB for RDS to PolarDB.<blockquote>
     * <p>Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Create a PolarDB for MySQL cluster by using the Migration from RDS method</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBClusterMigration  ModifyDBClusterMigrationRequest
     * @return ModifyDBClusterMigrationResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterMigrationResponse> modifyDBClusterMigration(ModifyDBClusterMigrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterMigration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterMigrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterMigrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBClusterMonitor  ModifyDBClusterMonitorRequest
     * @return ModifyDBClusterMonitorResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterMonitorResponse> modifyDBClusterMonitor(ModifyDBClusterMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>PolarDB supports the parameter template feature to centrally manage clusters. You can configure a number of parameters at a time by using a parameter template and apply the template to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.
     * **
     * **Only PolarDB for MySQL clusters support parameter templates.</p>
     * 
     * @param request the request parameters of ModifyDBClusterParameters  ModifyDBClusterParametersRequest
     * @return ModifyDBClusterParametersResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterParametersResponse> modifyDBClusterParameters(ModifyDBClusterParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterPrimaryZone  ModifyDBClusterPrimaryZoneRequest
     * @return ModifyDBClusterPrimaryZoneResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterPrimaryZoneResponse> modifyDBClusterPrimaryZone(ModifyDBClusterPrimaryZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterPrimaryZone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterPrimaryZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterPrimaryZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterResourceGroup  ModifyDBClusterResourceGroupRequest
     * @return ModifyDBClusterResourceGroupResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterResourceGroupResponse> modifyDBClusterResourceGroup(ModifyDBClusterResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterSSL  ModifyDBClusterSSLRequest
     * @return ModifyDBClusterSSLResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterSSLResponse> modifyDBClusterSSL(ModifyDBClusterSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterServerlessConf  ModifyDBClusterServerlessConfRequest
     * @return ModifyDBClusterServerlessConfResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterServerlessConfResponse> modifyDBClusterServerlessConf(ModifyDBClusterServerlessConfRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterServerlessConf").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterServerlessConfResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterServerlessConfResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterStoragePerformance  ModifyDBClusterStoragePerformanceRequest
     * @return ModifyDBClusterStoragePerformanceResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterStoragePerformanceResponse> modifyDBClusterStoragePerformance(ModifyDBClusterStoragePerformanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterStoragePerformance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterStoragePerformanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterStoragePerformanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBClusterStorageSpace  ModifyDBClusterStorageSpaceRequest
     * @return ModifyDBClusterStorageSpaceResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterStorageSpaceResponse> modifyDBClusterStorageSpace(ModifyDBClusterStorageSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterStorageSpace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterStorageSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterStorageSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To perform this operation, you must activate KMS first. For more information, see <a href="https://help.aliyun.com/document_detail/153781.html">Purchase a dedicated KMS instance</a>.</li>
     * <li>After TDE is enabled, you cannot disable TDE.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDBClusterTDE  ModifyDBClusterTDERequest
     * @return ModifyDBClusterTDEResponse
     */
    @Override
    public CompletableFuture<ModifyDBClusterTDEResponse> modifyDBClusterTDE(ModifyDBClusterTDERequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBClusterTDE").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBClusterTDEResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBClusterTDEResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBDescription  ModifyDBDescriptionRequest
     * @return ModifyDBDescriptionResponse
     */
    @Override
    public CompletableFuture<ModifyDBDescriptionResponse> modifyDBDescription(ModifyDBDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBEndpointAddress  ModifyDBEndpointAddressRequest
     * @return ModifyDBEndpointAddressResponse
     */
    @Override
    public CompletableFuture<ModifyDBEndpointAddressResponse> modifyDBEndpointAddress(ModifyDBEndpointAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBEndpointAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBEndpointAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBEndpointAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBNodeClass  ModifyDBNodeClassRequest
     * @return ModifyDBNodeClassResponse
     */
    @Override
    public CompletableFuture<ModifyDBNodeClassResponse> modifyDBNodeClass(ModifyDBNodeClassRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBNodeClass").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBNodeClassResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBNodeClassResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBNodeHotReplicaMode  ModifyDBNodeHotReplicaModeRequest
     * @return ModifyDBNodeHotReplicaModeResponse
     */
    @Override
    public CompletableFuture<ModifyDBNodeHotReplicaModeResponse> modifyDBNodeHotReplicaMode(ModifyDBNodeHotReplicaModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBNodeHotReplicaMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBNodeHotReplicaModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBNodeHotReplicaModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBNodesClass  ModifyDBNodesClassRequest
     * @return ModifyDBNodesClassResponse
     */
    @Override
    public CompletableFuture<ModifyDBNodesClassResponse> modifyDBNodesClass(ModifyDBNodesClassRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBNodesClass").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBNodesClassResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBNodesClassResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBNodesParameters  ModifyDBNodesParametersRequest
     * @return ModifyDBNodesParametersResponse
     */
    @Override
    public CompletableFuture<ModifyDBNodesParametersResponse> modifyDBNodesParameters(ModifyDBNodesParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBNodesParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBNodesParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBNodesParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyGlobalDatabaseNetwork  ModifyGlobalDatabaseNetworkRequest
     * @return ModifyGlobalDatabaseNetworkResponse
     */
    @Override
    public CompletableFuture<ModifyGlobalDatabaseNetworkResponse> modifyGlobalDatabaseNetwork(ModifyGlobalDatabaseNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGlobalDatabaseNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGlobalDatabaseNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGlobalDatabaseNetworkResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModifyLogBackupPolicy  ModifyLogBackupPolicyRequest
     * @return ModifyLogBackupPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyLogBackupPolicyResponse> modifyLogBackupPolicy(ModifyLogBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLogBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLogBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLogBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyMaskingRules  ModifyMaskingRulesRequest
     * @return ModifyMaskingRulesResponse
     */
    @Override
    public CompletableFuture<ModifyMaskingRulesResponse> modifyMaskingRules(ModifyMaskingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyMaskingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyMaskingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyMaskingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyPendingMaintenanceAction  ModifyPendingMaintenanceActionRequest
     * @return ModifyPendingMaintenanceActionResponse
     */
    @Override
    public CompletableFuture<ModifyPendingMaintenanceActionResponse> modifyPendingMaintenanceAction(ModifyPendingMaintenanceActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPendingMaintenanceAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPendingMaintenanceActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPendingMaintenanceActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenAITask  OpenAITaskRequest
     * @return OpenAITaskResponse
     */
    @Override
    public CompletableFuture<OpenAITaskResponse> openAITask(OpenAITaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenAITask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenAITaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenAITaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshDBClusterStorageUsage  RefreshDBClusterStorageUsageRequest
     * @return RefreshDBClusterStorageUsageResponse
     */
    @Override
    public CompletableFuture<RefreshDBClusterStorageUsageResponse> refreshDBClusterStorageUsage(RefreshDBClusterStorageUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshDBClusterStorageUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshDBClusterStorageUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshDBClusterStorageUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot remove the primary cluster from a GDN.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveDBClusterFromGDN  RemoveDBClusterFromGDNRequest
     * @return RemoveDBClusterFromGDNResponse
     */
    @Override
    public CompletableFuture<RemoveDBClusterFromGDNResponse> removeDBClusterFromGDN(RemoveDBClusterFromGDNRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveDBClusterFromGDN").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveDBClusterFromGDNResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveDBClusterFromGDNResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Only PolarDB for MySQL clusters support this operation.</li>
     * <li>If the privileged account of your cluster encounters exceptions, you can call this operation to reset the permissions. For example, the permissions are accidentally revoked.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ResetAccount  ResetAccountRequest
     * @return ResetAccountResponse
     */
    @Override
    public CompletableFuture<ResetAccountResponse> resetAccount(ResetAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetGlobalDatabaseNetwork  ResetGlobalDatabaseNetworkRequest
     * @return ResetGlobalDatabaseNetworkResponse
     */
    @Override
    public CompletableFuture<ResetGlobalDatabaseNetworkResponse> resetGlobalDatabaseNetwork(ResetGlobalDatabaseNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetGlobalDatabaseNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetGlobalDatabaseNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetGlobalDatabaseNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartDBLink  RestartDBLinkRequest
     * @return RestartDBLinkResponse
     */
    @Override
    public CompletableFuture<RestartDBLinkResponse> restartDBLink(RestartDBLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartDBLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartDBLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartDBLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartDBNode  RestartDBNodeRequest
     * @return RestartDBNodeResponse
     */
    @Override
    public CompletableFuture<RestartDBNodeResponse> restartDBNode(RestartDBNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartDBNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartDBNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartDBNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestoreTable  RestoreTableRequest
     * @return RestoreTableResponse
     */
    @Override
    public CompletableFuture<RestoreTableResponse> restoreTable(RestoreTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestoreTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestoreTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestoreTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeAccountPrivilege  RevokeAccountPrivilegeRequest
     * @return RevokeAccountPrivilegeResponse
     */
    @Override
    public CompletableFuture<RevokeAccountPrivilegeResponse> revokeAccountPrivilege(RevokeAccountPrivilegeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeAccountPrivilege").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeAccountPrivilegeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeAccountPrivilegeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SwitchOverGlobalDatabaseNetwork  SwitchOverGlobalDatabaseNetworkRequest
     * @return SwitchOverGlobalDatabaseNetworkResponse
     */
    @Override
    public CompletableFuture<SwitchOverGlobalDatabaseNetworkResponse> switchOverGlobalDatabaseNetwork(SwitchOverGlobalDatabaseNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchOverGlobalDatabaseNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchOverGlobalDatabaseNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchOverGlobalDatabaseNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of TempModifyDBNode  TempModifyDBNodeRequest
     * @return TempModifyDBNodeResponse
     */
    @Override
    public CompletableFuture<TempModifyDBNodeResponse> tempModifyDBNode(TempModifyDBNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TempModifyDBNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TempModifyDBNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TempModifyDBNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>PolarDB clusters support the subscription and pay-as-you-go billing methods. You can change the billing method from subscription to pay-as-you-go or from pay-as-you-go to subscription based on your business requirements. For more information, see <a href="https://help.aliyun.com/document_detail/172886.html">Change the billing method from subscription to pay-as-you-go</a> and <a href="https://help.aliyun.com/document_detail/84076.html">Change the billing method from pay-as-you-go to subscription</a>.</li>
     * <li>You cannot change the billing method from pay-as-you-go to subscription if your account balance is insufficient.</li>
     * <li>If you change the billing method from subscription to pay-as-you-go, the system automatically refunds the balance of the prepaid subscription fees.</li>
     * </ul>
     * 
     * @param request the request parameters of TransformDBClusterPayType  TransformDBClusterPayTypeRequest
     * @return TransformDBClusterPayTypeResponse
     */
    @Override
    public CompletableFuture<TransformDBClusterPayTypeResponse> transformDBClusterPayType(TransformDBClusterPayTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransformDBClusterPayType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransformDBClusterPayTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransformDBClusterPayTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * <blockquote>
     * <ul>
     * <li>You can update only the revision version of a PolarDB for MySQL cluster, for example, from 8.0.1.1.3 to 8.0.1.1.4.</li>
     * <li>You can use only your Alibaba Cloud account to create scheduled tasks that update the kernel version of a PolarDB for MySQL cluster. RAM users are not authorized to update the kernel version of a PolarDB for MySQL cluster.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBClusterVersion  UpgradeDBClusterVersionRequest
     * @return UpgradeDBClusterVersionResponse
     */
    @Override
    public CompletableFuture<UpgradeDBClusterVersionResponse> upgradeDBClusterVersion(UpgradeDBClusterVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeDBClusterVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeDBClusterVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeDBClusterVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
