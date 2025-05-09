// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.hbr20170908.models.*;
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
        this.product = "hbr";
        this.version = "2017-09-08";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "hbr.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "hbr.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-edge-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-fujian", "hbr.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "hbr.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "hbr.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "hbr.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "hbr.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "hbr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "hbr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-wuhan", "hbr.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "hbr.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "hbr.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "hbr.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "hbr.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "hbr.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "hbr.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddContainerCluster  AddContainerClusterRequest
     * @return AddContainerClusterResponse
     */
    @Override
    public CompletableFuture<AddContainerClusterResponse> addContainerCluster(AddContainerClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddContainerCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddContainerClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddContainerClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelBackupJob  CancelBackupJobRequest
     * @return CancelBackupJobResponse
     */
    @Override
    public CompletableFuture<CancelBackupJobResponse> cancelBackupJob(CancelBackupJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelBackupJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelBackupJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelBackupJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelRestoreJob  CancelRestoreJobRequest
     * @return CancelRestoreJobResponse
     */
    @Override
    public CompletableFuture<CancelRestoreJobResponse> cancelRestoreJob(CancelRestoreJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelRestoreJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelRestoreJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelRestoreJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  In the Cloud Backup console, you can use resource groups to manage resources such as backup vaults, Cloud Backup clients, and SAP HANA instances.</p>
     * <ul>
     * <li>A resource is a cloud service entity that you create on Alibaba Cloud, such as an Elastic Compute Service (ECS) instance, a backup vault, or an SAP HANA instance.</li>
     * <li>You can sort resources owned by your Alibaba Cloud account into various resource groups. Resource groups facilitate resource management among multiple projects or applications within your Alibaba Cloud account and simplify permission management.</li>
     * </ul>
     * 
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckRole  CheckRoleRequest
     * @return CheckRoleResponse
     */
    @Override
    public CompletableFuture<CheckRoleResponse> checkRole(CheckRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBackupJob  CreateBackupJobRequest
     * @return CreateBackupJobResponse
     */
    @Override
    public CompletableFuture<CreateBackupJobResponse> createBackupJob(CreateBackupJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBackupJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBackupJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBackupJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A backup plan associates data sources with backup policies and other necessary information for backups. After the execution of a backup plan, it generates a backup task that records the progress and results of the backup. If the backup task is successful, a backup snapshot is created. You can use the backup snapshot to create a recovery task.</li>
     * <li>A backup plan supports only one type of data source.</li>
     * <li>A backup plan supports only a single fixed interval backup cycle strategy.</li>
     * <li>A backup plan can back up to only one backup vault.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBackupPlan  CreateBackupPlanRequest
     * @return CreateBackupPlanResponse
     */
    @Override
    public CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of Cloud Backup. For more information, see <a href="https://help.aliyun.com/document_detail/89062.html">Billing methods and billable items</a>.</p>
     * 
     * @param request the request parameters of CreateClients  CreateClientsRequest
     * @return CreateClientsResponse
     */
    @Override
    public CompletableFuture<CreateClientsResponse> createClients(CreateClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateHanaBackupPlan  CreateHanaBackupPlanRequest
     * @return CreateHanaBackupPlanResponse
     */
    @Override
    public CompletableFuture<CreateHanaBackupPlanResponse> createHanaBackupPlan(CreateHanaBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHanaBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHanaBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHanaBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To register an SAP HANA instance, you must configure the SAP HANA connection information. After the SAP HANA instance is registered, Cloud Backup installs a backup client on the node of the SAP HANA instance.</p>
     * 
     * @param request the request parameters of CreateHanaInstance  CreateHanaInstanceRequest
     * @return CreateHanaInstanceResponse
     */
    @Override
    public CompletableFuture<CreateHanaInstanceResponse> createHanaInstance(CreateHanaInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHanaInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHanaInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHanaInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to restore a database, the database is restored to a specified state. Proceed with caution. For more information, see <a href="https://help.aliyun.com/document_detail/101178.html">Restore databases to an SAP HANA instance</a>.</p>
     * 
     * @param request the request parameters of CreateHanaRestore  CreateHanaRestoreRequest
     * @return CreateHanaRestoreResponse
     */
    @Override
    public CompletableFuture<CreateHanaRestoreResponse> createHanaRestore(CreateHanaRestoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHanaRestore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHanaRestoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHanaRestoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can bind data sources to only one policy in each request.</p>
     * <ul>
     * <li>Elastic Compute Service (ECS) instances can be bound to only one policy.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePolicyBindings  CreatePolicyBindingsRequest
     * @return CreatePolicyBindingsResponse
     */
    @Override
    public CompletableFuture<CreatePolicyBindingsResponse> createPolicyBindings(CreatePolicyBindingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePolicyBindings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePolicyBindingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePolicyBindingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A backup policy records the information required for backup. After you execute a backup policy, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>A backup policy supports multiple data sources. The data sources can be only Elastic Compute Service (ECS) instances.</li>
     * <li>You can specify only one interval as a backup cycle in a backup policy.</li>
     * <li>Each backup policy allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePolicyV2  CreatePolicyV2Request
     * @return CreatePolicyV2Response
     */
    @Override
    public CompletableFuture<CreatePolicyV2Response> createPolicyV2(CreatePolicyV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePolicyV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePolicyV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePolicyV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state.Call this operation in the region where the mirror vault resides, which is specified by the VaultRegionId parameter.</p>
     * 
     * @param request the request parameters of CreateReplicationVault  CreateReplicationVaultRequest
     * @return CreateReplicationVaultResponse
     */
    @Override
    public CompletableFuture<CreateReplicationVaultResponse> createReplicationVault(CreateReplicationVaultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateReplicationVault").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateReplicationVaultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateReplicationVaultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Create a restore job based on the selected snapshot and the restore destination.</li>
     * <li>Currently, the data source type must match the restore destination data source type.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRestoreJob  CreateRestoreJobRequest
     * @return CreateRestoreJobResponse
     */
    @Override
    public CompletableFuture<CreateRestoreJobResponse> createRestoreJob(CreateRestoreJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRestoreJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRestoreJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRestoreJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can directly upload a file to Object Storage Service (OSS) by using a form based on the returned value of this operation.</li>
     * <li>For more information about how to upload a file to OSS by using a form, see OSS documentation.</li>
     * <li>The system periodically deletes files that are uploaded to OSS.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateTempFileUploadUrl  CreateTempFileUploadUrlRequest
     * @return CreateTempFileUploadUrlResponse
     */
    @Override
    public CompletableFuture<CreateTempFileUploadUrlResponse> createTempFileUploadUrl(CreateTempFileUploadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTempFileUploadUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTempFileUploadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTempFileUploadUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Each Alibaba Cloud account can create up to 100 backup vaults.</p>
     * <ul>
     * <li>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state. A backup job can use a backup vault to store backup data only if the backup vault is in the CREATED state.
     * **
     * <strong>Note</strong> Before you call this operation, make sure that you fully understand the billing of Cloud Backup.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVault  CreateVaultRequest
     * @return CreateVaultResponse
     */
    @Override
    public CompletableFuture<CreateVaultResponse> createVault(CreateVaultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVault").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVaultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVaultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAirEcsInstance  DeleteAirEcsInstanceRequest
     * @return DeleteAirEcsInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteAirEcsInstanceResponse> deleteAirEcsInstance(DeleteAirEcsInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAirEcsInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAirEcsInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAirEcsInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete the active Cloud Backup clients that receive heartbeat packets within 1 hour. You can call the UninstallBackupClients operation to uninstall a Cloud Backup client. Then, the client becomes inactive.</p>
     * <ul>
     * <li>When you perform this operation, resources that are associated with the client are also deleted, including:<ul>
     * <li>Backup plans</li>
     * <li>Backup jobs</li>
     * <li>Snapshots</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBackupClient  DeleteBackupClientRequest
     * @return DeleteBackupClientResponse
     */
    @Override
    public CompletableFuture<DeleteBackupClientResponse> deleteBackupClient(DeleteBackupClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackupClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes only the resources that are related to HBR clients. The resources include backup plans, backup jobs, and backup snapshots. The operation does not delete HBR clients.</p>
     * 
     * @param request the request parameters of DeleteBackupClientResource  DeleteBackupClientResourceRequest
     * @return DeleteBackupClientResourceResponse
     */
    @Override
    public CompletableFuture<DeleteBackupClientResourceResponse> deleteBackupClientResource(DeleteBackupClientResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackupClientResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupClientResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupClientResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If you delete a backup plan, the backup jobs are also deleted.</p>
     * <ul>
     * <li>If you delete a backup plan, the created snapshot files are not deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBackupPlan  DeleteBackupPlanRequest
     * @return DeleteBackupPlanResponse
     */
    @Override
    public CompletableFuture<DeleteBackupPlanResponse> deleteBackupPlan(DeleteBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteClient  DeleteClientRequest
     * @return DeleteClientResponse
     */
    @Override
    public CompletableFuture<DeleteClientResponse> deleteClient(DeleteClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHanaBackupPlan  DeleteHanaBackupPlanRequest
     * @return DeleteHanaBackupPlanResponse
     */
    @Override
    public CompletableFuture<DeleteHanaBackupPlanResponse> deleteHanaBackupPlan(DeleteHanaBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHanaBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHanaBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHanaBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you delete an SAP HANA instance, the existing backup data is also deleted and the running backup and restore jobs fail to be completed. Before you delete the SAP HANA instance, make sure that you no longer need the backup data of the instance and no backup or restore jobs are running for the instance. To delete an SAP HANA instance, you must specify the security identifier (SID) of the instance. The SID is three characters in length and starts with a letter. For more information, see <a href="https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?">How to find sid user and instance number of HANA db?</a></p>
     * 
     * @param request the request parameters of DeleteHanaInstance  DeleteHanaInstanceRequest
     * @return DeleteHanaInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteHanaInstanceResponse> deleteHanaInstance(DeleteHanaInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHanaInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHanaInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHanaInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePolicyBinding  DeletePolicyBindingRequest
     * @return DeletePolicyBindingResponse
     */
    @Override
    public CompletableFuture<DeletePolicyBindingResponse> deletePolicyBinding(DeletePolicyBindingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePolicyBinding").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePolicyBindingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePolicyBindingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you delete a backup policy, the backup policy is disassociated with all data sources. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeletePolicyV2  DeletePolicyV2Request
     * @return DeletePolicyV2Response
     */
    @Override
    public CompletableFuture<DeletePolicyV2Response> deletePolicyV2(DeletePolicyV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePolicyV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePolicyV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePolicyV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    @Override
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUdmDisk  DeleteUdmDiskRequest
     * @return DeleteUdmDiskResponse
     */
    @Override
    public CompletableFuture<DeleteUdmDiskResponse> deleteUdmDisk(DeleteUdmDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUdmDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUdmDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUdmDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUdmEcsInstance  DeleteUdmEcsInstanceRequest
     * @return DeleteUdmEcsInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteUdmEcsInstanceResponse> deleteUdmEcsInstance(DeleteUdmEcsInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUdmEcsInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUdmEcsInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUdmEcsInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete a backup vault within 2 hours after the backup vault is created or a backup vault that is in the INITIALIZING state.</p>
     * <ul>
     * <li>After you delete a backup vault, all resources that are associated with the backup vault are deleted. The resources include the Cloud Backup client of the old version, backup plans, backup jobs, snapshots, and restore jobs.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVault  DeleteVaultRequest
     * @return DeleteVaultResponse
     */
    @Override
    public CompletableFuture<DeleteVaultResponse> deleteVault(DeleteVaultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVault").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVaultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVaultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupClients  DescribeBackupClientsRequest
     * @return DescribeBackupClientsResponse
     */
    @Override
    public CompletableFuture<DescribeBackupClientsResponse> describeBackupClients(DescribeBackupClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupJobs2  DescribeBackupJobs2Request
     * @return DescribeBackupJobs2Response
     */
    @Override
    public CompletableFuture<DescribeBackupJobs2Response> describeBackupJobs2(DescribeBackupJobs2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupJobs2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupJobs2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupJobs2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupPlans  DescribeBackupPlansRequest
     * @return DescribeBackupPlansResponse
     */
    @Override
    public CompletableFuture<DescribeBackupPlansResponse> describeBackupPlans(DescribeBackupPlansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupPlans").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupPlansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupPlansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to SAP HANA backup. For Cloud Backup clients of other data sources, call the DescribeBackupClients operation.</p>
     * 
     * @param request the request parameters of DescribeClients  DescribeClientsRequest
     * @return DescribeClientsResponse
     */
    @Override
    public CompletableFuture<DescribeClientsResponse> describeClients(DescribeClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only Container Service for Kubernetes (ACK) clusters.</p>
     * 
     * @param request the request parameters of DescribeContainerCluster  DescribeContainerClusterRequest
     * @return DescribeContainerClusterResponse
     */
    @Override
    public CompletableFuture<DescribeContainerClusterResponse> describeContainerCluster(DescribeContainerClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCrossAccounts  DescribeCrossAccountsRequest
     * @return DescribeCrossAccountsResponse
     */
    @Override
    public CompletableFuture<DescribeCrossAccountsResponse> describeCrossAccounts(DescribeCrossAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCrossAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCrossAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCrossAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHanaBackupPlans  DescribeHanaBackupPlansRequest
     * @return DescribeHanaBackupPlansResponse
     */
    @Override
    public CompletableFuture<DescribeHanaBackupPlansResponse> describeHanaBackupPlans(DescribeHanaBackupPlansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHanaBackupPlans").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHanaBackupPlansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHanaBackupPlansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you want to query the backup retention period of a database, you can call the DescribeHanaRetentionSetting operation.</p>
     * 
     * @param request the request parameters of DescribeHanaBackupSetting  DescribeHanaBackupSettingRequest
     * @return DescribeHanaBackupSettingResponse
     */
    @Override
    public CompletableFuture<DescribeHanaBackupSettingResponse> describeHanaBackupSetting(DescribeHanaBackupSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHanaBackupSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHanaBackupSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHanaBackupSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you call the DescribeHanaBackupsAsync operation to query the SAP HANA backups that meet the specified conditions, call the DescribeTask operation to query the final result.</p>
     * 
     * @param request the request parameters of DescribeHanaBackupsAsync  DescribeHanaBackupsAsyncRequest
     * @return DescribeHanaBackupsAsyncResponse
     */
    @Override
    public CompletableFuture<DescribeHanaBackupsAsyncResponse> describeHanaBackupsAsync(DescribeHanaBackupsAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHanaBackupsAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHanaBackupsAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHanaBackupsAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you register an SAP HANA instance and install a Cloud Backup client on the instance, you can call this operation to query the information about SAP HANA databases. You can call the StartHanaDatabaseAsync operation to start a database and call the StopHanaDatabaseAsync operation to stop a database.</p>
     * 
     * @param request the request parameters of DescribeHanaDatabases  DescribeHanaDatabasesRequest
     * @return DescribeHanaDatabasesResponse
     */
    @Override
    public CompletableFuture<DescribeHanaDatabasesResponse> describeHanaDatabases(DescribeHanaDatabasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHanaDatabases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHanaDatabasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHanaDatabasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHanaInstances  DescribeHanaInstancesRequest
     * @return DescribeHanaInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeHanaInstancesResponse> describeHanaInstances(DescribeHanaInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHanaInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHanaInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHanaInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHanaRestores  DescribeHanaRestoresRequest
     * @return DescribeHanaRestoresResponse
     */
    @Override
    public CompletableFuture<DescribeHanaRestoresResponse> describeHanaRestores(DescribeHanaRestoresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHanaRestores").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHanaRestoresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHanaRestoresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If you want to query the backup parameters of a database, you can call the DescribeHanaBackupSetting operation.</p>
     * <ul>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHanaRetentionSetting  DescribeHanaRetentionSettingRequest
     * @return DescribeHanaRetentionSettingResponse
     */
    @Override
    public CompletableFuture<DescribeHanaRetentionSettingResponse> describeHanaRetentionSetting(DescribeHanaRetentionSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHanaRetentionSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHanaRetentionSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHanaRetentionSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOtsTableSnapshots  DescribeOtsTableSnapshotsRequest
     * @return DescribeOtsTableSnapshotsResponse
     */
    @Override
    public CompletableFuture<DescribeOtsTableSnapshotsResponse> describeOtsTableSnapshots(DescribeOtsTableSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOtsTableSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOtsTableSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOtsTableSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePoliciesV2  DescribePoliciesV2Request
     * @return DescribePoliciesV2Response
     */
    @Override
    public CompletableFuture<DescribePoliciesV2Response> describePoliciesV2(DescribePoliciesV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePoliciesV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePoliciesV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePoliciesV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePolicyBindings  DescribePolicyBindingsRequest
     * @return DescribePolicyBindingsResponse
     */
    @Override
    public CompletableFuture<DescribePolicyBindingsResponse> describePolicyBindings(DescribePolicyBindingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePolicyBindings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePolicyBindingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePolicyBindingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRecoverableOtsInstances  DescribeRecoverableOtsInstancesRequest
     * @return DescribeRecoverableOtsInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeRecoverableOtsInstancesResponse> describeRecoverableOtsInstances(DescribeRecoverableOtsInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRecoverableOtsInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRecoverableOtsInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRecoverableOtsInstancesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeRestoreJobs2  DescribeRestoreJobs2Request
     * @return DescribeRestoreJobs2Response
     */
    @Override
    public CompletableFuture<DescribeRestoreJobs2Response> describeRestoreJobs2(DescribeRestoreJobs2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRestoreJobs2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRestoreJobs2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRestoreJobs2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTask  DescribeTaskRequest
     * @return DescribeTaskResponse
     */
    @Override
    public CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUdmSnapshots  DescribeUdmSnapshotsRequest
     * @return DescribeUdmSnapshotsResponse
     */
    @Override
    public CompletableFuture<DescribeUdmSnapshotsResponse> describeUdmSnapshots(DescribeUdmSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUdmSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUdmSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUdmSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVaultReplicationRegions  DescribeVaultReplicationRegionsRequest
     * @return DescribeVaultReplicationRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeVaultReplicationRegionsResponse> describeVaultReplicationRegions(DescribeVaultReplicationRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVaultReplicationRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVaultReplicationRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVaultReplicationRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVaults  DescribeVaultsRequest
     * @return DescribeVaultsResponse
     */
    @Override
    public CompletableFuture<DescribeVaultsResponse> describeVaults(DescribeVaultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVaults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVaultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVaultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If the request is successful, the mount target is deleted.</p>
     * <ul>
     * <li>After you create a backup plan for an Apsara File Storage NAS file system, HBR automatically creates a mount target for the file system. You can call this operation to delete the mount target. In the <strong>Status</strong> column of the mount target of the NAS file system, the following information is displayed: <strong>This mount target is created by an Alibaba Cloud internal service and cannot be operated. Service name: HBR</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachNasFileSystem  DetachNasFileSystemRequest
     * @return DetachNasFileSystemResponse
     */
    @Override
    public CompletableFuture<DetachNasFileSystemResponse> detachNasFileSystem(DetachNasFileSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachNasFileSystem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachNasFileSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachNasFileSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is suspended. In the DescribeBackupPlans operation, the Disabled parameter is set to true.</p>
     * 
     * @param request the request parameters of DisableBackupPlan  DisableBackupPlanRequest
     * @return DisableBackupPlanResponse
     */
    @Override
    public CompletableFuture<DisableBackupPlanResponse> disableBackupPlan(DisableBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To enable the backup plan again, call the EnableHanaBackupPlan operation.</p>
     * 
     * @param request the request parameters of DisableHanaBackupPlan  DisableHanaBackupPlanRequest
     * @return DisableHanaBackupPlanResponse
     */
    @Override
    public CompletableFuture<DisableHanaBackupPlanResponse> disableHanaBackupPlan(DisableHanaBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableHanaBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableHanaBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableHanaBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is restarted (Disabled is set to false in the DescribeBackupPlans operation). Cloud Backup continues to perform backups based on the policy specified in the backup plan.</p>
     * 
     * @param request the request parameters of EnableBackupPlan  EnableBackupPlanRequest
     * @return EnableBackupPlanResponse
     */
    @Override
    public CompletableFuture<EnableBackupPlanResponse> enableBackupPlan(EnableBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To disable the backup plan again, call the DisableHanaBackupPlan operation.</p>
     * 
     * @param request the request parameters of EnableHanaBackupPlan  EnableHanaBackupPlanRequest
     * @return EnableHanaBackupPlanResponse
     */
    @Override
    public CompletableFuture<EnableHanaBackupPlanResponse> enableHanaBackupPlan(EnableHanaBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableHanaBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableHanaBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableHanaBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteBackupPlan  ExecuteBackupPlanRequest
     * @return ExecuteBackupPlanResponse
     */
    @Override
    public CompletableFuture<ExecuteBackupPlanResponse> executeBackupPlan(ExecuteBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecutePolicyV2  ExecutePolicyV2Request
     * @return ExecutePolicyV2Response
     */
    @Override
    public CompletableFuture<ExecutePolicyV2Response> executePolicyV2(ExecutePolicyV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecutePolicyV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecutePolicyV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecutePolicyV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateRamPolicy  GenerateRamPolicyRequest
     * @return GenerateRamPolicyResponse
     */
    @Override
    public CompletableFuture<GenerateRamPolicyResponse> generateRamPolicy(GenerateRamPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateRamPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateRamPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateRamPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTempFileDownloadLink  GetTempFileDownloadLinkRequest
     * @return GetTempFileDownloadLinkResponse
     */
    @Override
    public CompletableFuture<GetTempFileDownloadLinkResponse> getTempFileDownloadLink(GetTempFileDownloadLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTempFileDownloadLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTempFileDownloadLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTempFileDownloadLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to install an HBR client on an ECS instance.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/431265.html">DescribeTask</a> operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 60 seconds after you call the InstallBackupClients operation to install HBR clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     * 
     * @param request the request parameters of InstallBackupClients  InstallBackupClientsRequest
     * @return InstallBackupClientsResponse
     */
    @Override
    public CompletableFuture<InstallBackupClientsResponse> installBackupClients(InstallBackupClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallBackupClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallBackupClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallBackupClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenHbrService  OpenHbrServiceRequest
     * @return OpenHbrServiceResponse
     */
    @Override
    public CompletableFuture<OpenHbrServiceResponse> openHbrService(OpenHbrServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenHbrService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenHbrServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenHbrServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchHistoricalSnapshots  SearchHistoricalSnapshotsRequest
     * @return SearchHistoricalSnapshotsResponse
     */
    @Override
    public CompletableFuture<SearchHistoricalSnapshotsResponse> searchHistoricalSnapshots(SearchHistoricalSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchHistoricalSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchHistoricalSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchHistoricalSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To stop the database again, call the StopHanaDatabaseAsync operation.</p>
     * 
     * @param request the request parameters of StartHanaDatabaseAsync  StartHanaDatabaseAsyncRequest
     * @return StartHanaDatabaseAsyncResponse
     */
    @Override
    public CompletableFuture<StartHanaDatabaseAsyncResponse> startHanaDatabaseAsync(StartHanaDatabaseAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartHanaDatabaseAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartHanaDatabaseAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartHanaDatabaseAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To start the database again, call the StartHanaDatabaseAsync operation.</p>
     * 
     * @param request the request parameters of StopHanaDatabaseAsync  StopHanaDatabaseAsyncRequest
     * @return StopHanaDatabaseAsyncResponse
     */
    @Override
    public CompletableFuture<StopHanaDatabaseAsyncResponse> stopHanaDatabaseAsync(StopHanaDatabaseAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopHanaDatabaseAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopHanaDatabaseAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopHanaDatabaseAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to uninstall a backup client from an ECS instance.</p>
     * <ul>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 30 seconds after you call the UninstallBackupClients operation to uninstall backup clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     * 
     * @param request the request parameters of UninstallBackupClients  UninstallBackupClientsRequest
     * @return UninstallBackupClientsResponse
     */
    @Override
    public CompletableFuture<UninstallBackupClientsResponse> uninstallBackupClients(UninstallBackupClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UninstallBackupClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallBackupClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallBackupClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation, the specified HBR client is uninstalled. To reinstall the HBR client, call the CreateClients operation.</p>
     * 
     * @param request the request parameters of UninstallClient  UninstallClientRequest
     * @return UninstallClientResponse
     */
    @Override
    public CompletableFuture<UninstallClientResponse> uninstallClient(UninstallClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UninstallClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateBackupPlan  UpdateBackupPlanRequest
     * @return UpdateBackupPlanResponse
     */
    @Override
    public CompletableFuture<UpdateBackupPlanResponse> updateBackupPlan(UpdateBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the configurations of both the old and new HBR clients.</p>
     * 
     * @param request the request parameters of UpdateClientSettings  UpdateClientSettingsRequest
     * @return UpdateClientSettingsResponse
     */
    @Override
    public CompletableFuture<UpdateClientSettingsResponse> updateClientSettings(UpdateClientSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateClientSettings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClientSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClientSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateContainerCluster  UpdateContainerClusterRequest
     * @return UpdateContainerClusterResponse
     */
    @Override
    public CompletableFuture<UpdateContainerClusterResponse> updateContainerCluster(UpdateContainerClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContainerCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContainerClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContainerClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateHanaBackupPlan  UpdateHanaBackupPlanRequest
     * @return UpdateHanaBackupPlanResponse
     */
    @Override
    public CompletableFuture<UpdateHanaBackupPlanResponse> updateHanaBackupPlan(UpdateHanaBackupPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHanaBackupPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHanaBackupPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHanaBackupPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the UpdateHanaRetentionSetting operation to update the backup retention period of a database.</p>
     * 
     * @param request the request parameters of UpdateHanaBackupSetting  UpdateHanaBackupSettingRequest
     * @return UpdateHanaBackupSettingResponse
     */
    @Override
    public CompletableFuture<UpdateHanaBackupSettingResponse> updateHanaBackupSetting(UpdateHanaBackupSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHanaBackupSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHanaBackupSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHanaBackupSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHanaInstance  UpdateHanaInstanceRequest
     * @return UpdateHanaInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateHanaInstanceResponse> updateHanaInstance(UpdateHanaInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHanaInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHanaInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHanaInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If you want to update the backup parameters of a database, you can call the UpdateHanaBackupSetting operation.</p>
     * <ul>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateHanaRetentionSetting  UpdateHanaRetentionSettingRequest
     * @return UpdateHanaRetentionSettingResponse
     */
    @Override
    public CompletableFuture<UpdateHanaRetentionSettingResponse> updateHanaRetentionSetting(UpdateHanaRetentionSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHanaRetentionSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHanaRetentionSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHanaRetentionSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePolicyBinding  UpdatePolicyBindingRequest
     * @return UpdatePolicyBindingResponse
     */
    @Override
    public CompletableFuture<UpdatePolicyBindingResponse> updatePolicyBinding(UpdatePolicyBindingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePolicyBinding").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePolicyBindingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePolicyBindingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you modify a backup policy, the modification takes effect on all data sources that are bound to the backup policy. Proceed with caution.</p>
     * 
     * @param request the request parameters of UpdatePolicyV2  UpdatePolicyV2Request
     * @return UpdatePolicyV2Response
     */
    @Override
    public CompletableFuture<UpdatePolicyV2Response> updatePolicyV2(UpdatePolicyV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePolicyV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePolicyV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePolicyV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateVault  UpdateVaultRequest
     * @return UpdateVaultResponse
     */
    @Override
    public CompletableFuture<UpdateVaultResponse> updateVault(UpdateVaultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVault").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVaultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVaultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to upgrade an HBR client that is installed on an ECS instance.</p>
     * <ul>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes.</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeBackupClients  UpgradeBackupClientsRequest
     * @return UpgradeBackupClientsResponse
     */
    @Override
    public CompletableFuture<UpgradeBackupClientsResponse> upgradeBackupClients(UpgradeBackupClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeBackupClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeBackupClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeBackupClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to upgrade a Cloud Backup client to the latest version. After the Cloud Backup client is upgraded, the version of the client cannot be rolled back.</p>
     * 
     * @param request the request parameters of UpgradeClient  UpgradeClientRequest
     * @return UpgradeClientResponse
     */
    @Override
    public CompletableFuture<UpgradeClientResponse> upgradeClient(UpgradeClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
