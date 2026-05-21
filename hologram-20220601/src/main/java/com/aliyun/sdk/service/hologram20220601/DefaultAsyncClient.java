// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.hologram20220601.models.*;
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
        this.product = "Hologram";
        this.version = "2022-06-01";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of BindLeaderInstance  BindLeaderInstanceRequest
     * @return BindLeaderInstanceResponse
     */
    @Override
    public CompletableFuture<BindLeaderInstanceResponse> bindLeaderInstance(BindLeaderInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BindLeaderInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/bindReadOnly").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindLeaderInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindLeaderInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/tag/changeResourceGroup").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    @Override
    public CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDatabase").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/createDatabase").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExternalDatabase  CreateExternalDatabaseRequest
     * @return CreateExternalDatabaseResponse
     */
    @Override
    public CompletableFuture<CreateExternalDatabaseResponse> createExternalDatabase(CreateExternalDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExternalDatabase").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/createExternalDatabase").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExternalDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExternalDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHoloWarehouse  CreateHoloWarehouseRequest
     * @return CreateHoloWarehouseResponse
     */
    @Override
    public CompletableFuture<CreateHoloWarehouseResponse> createHoloWarehouse(CreateHoloWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateHoloWarehouse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/createHoloWarehouse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHoloWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHoloWarehouseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing details of Hologres, see <a href="https://www.alibabacloud.com/help/en/hologres/developer-reference/api-hologram-2022-06-01-createinstance">Pricing</a>.</li>
     * <li>When you purchase a Hologres instance, you must specify the region and zone in which the Hologres instance resides. A region may correspond to multiple zones. Example:<!---->
     * cn-hangzhou: cn-hangzhou-h, cn-hangzhou-j
     *    cn-shanghai: cn-shanghai-e, cn-shanghai-f
     *    cn-beijing: cn-beijing-i, cn-beijing-g
     *    cn-zhangjiakou: cn-zhangjiakou-b
     *    cn-shenzhen: cn-shenzhen-e
     *    cn-hongkong: cn-hongkong-b
     *    cn-shanghai-finance-1: cn-shanghai-finance-1z
     *    ap-northeast-1: ap-northeast-1a
     *    ap-southeast-1: ap-southeast-1c
     *    ap-southeast-3: ap-southeast-3b
     *    ap-southeast-5: ap-southeast-5b
     *    ap-south-1: ap-south-1b
     *    eu-central-1: eu-central-1a
     *    us-east-1: us-east-1a
     *    us-west-1: us-west-1b</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateManualBackup  CreateManualBackupRequest
     * @return CreateManualBackupResponse
     */
    @Override
    public CompletableFuture<CreateManualBackupResponse> createManualBackup(CreateManualBackupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateManualBackup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/backups/manual").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateManualBackupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateManualBackupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateModelService  CreateModelServiceRequest
     * @return CreateModelServiceResponse
     */
    @Override
    public CompletableFuture<CreateModelServiceResponse> createModelService(CreateModelServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModelService").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/createModelService").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    @Override
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUser").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/createUser").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWarehouse  CreateWarehouseRequest
     * @return CreateWarehouseResponse
     */
    @Override
    public CompletableFuture<CreateWarehouseResponse> createWarehouse(CreateWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWarehouse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/warehouse/{instanceId}/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWarehouseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWarehouseScheduleTask  CreateWarehouseScheduleTaskRequest
     * @return CreateWarehouseScheduleTaskResponse
     */
    @Override
    public CompletableFuture<CreateWarehouseScheduleTaskResponse> createWarehouseScheduleTask(CreateWarehouseScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWarehouseScheduleTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/createWarehouseScheduleTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWarehouseScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWarehouseScheduleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBackupData  DeleteBackupDataRequest
     * @return DeleteBackupDataResponse
     */
    @Override
    public CompletableFuture<DeleteBackupDataResponse> deleteBackupData(DeleteBackupDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteBackupData").setMethod(HttpMethod.POST).setPathRegex("/api/v1/backups/{id}/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHoloWarehouse  DeleteHoloWarehouseRequest
     * @return DeleteHoloWarehouseResponse
     */
    @Override
    public CompletableFuture<DeleteHoloWarehouseResponse> deleteHoloWarehouse(DeleteHoloWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteHoloWarehouse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/deleteHoloWarehouse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHoloWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHoloWarehouseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, read the documentation and make sure that you understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li>After you delete a Hologres instance, data and objects in the instance cannot be restored. Proceed with caution. For more information, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview?spm=a2c63.p38356.0.0.efc33b87i5pDl7">Billing overview</a>.</li>
     * <li>You can delete only pay-as-you-go instances.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModelResource  DeleteModelResourceRequest
     * @return DeleteModelResourceResponse
     */
    @Override
    public CompletableFuture<DeleteModelResourceResponse> deleteModelResource(DeleteModelResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModelResource").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{instanceId}/deleteModelResource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModelService  DeleteModelServiceRequest
     * @return DeleteModelServiceResponse
     */
    @Override
    public CompletableFuture<DeleteModelServiceResponse> deleteModelService(DeleteModelServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModelService").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{instanceId}/deleteModelService").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWarehouseScheduleTask  DeleteWarehouseScheduleTaskRequest
     * @return DeleteWarehouseScheduleTaskResponse
     */
    @Override
    public CompletableFuture<DeleteWarehouseScheduleTaskResponse> deleteWarehouseScheduleTask(DeleteWarehouseScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWarehouseScheduleTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/deleteWarehouseScheduleTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWarehouseScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWarehouseScheduleTaskResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeTags").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tag").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableExecuteStatement  DisableExecuteStatementRequest
     * @return DisableExecuteStatementResponse
     */
    @Override
    public CompletableFuture<DisableExecuteStatementResponse> disableExecuteStatement(DisableExecuteStatementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableExecuteStatement").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/disableExecuteStatement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableExecuteStatementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableExecuteStatementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableHiveAccess  DisableHiveAccessRequest
     * @return DisableHiveAccessResponse
     */
    @Override
    public CompletableFuture<DisableHiveAccessResponse> disableHiveAccess(DisableHiveAccessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableHiveAccess").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/disableHiveAccess").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableHiveAccessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableHiveAccessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableOperationEvent  DisableOperationEventRequest
     * @return DisableOperationEventResponse
     */
    @Override
    public CompletableFuture<DisableOperationEventResponse> disableOperationEvent(DisableOperationEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableOperationEvent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/disableOperationEvent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableOperationEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableOperationEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableSSL  DisableSSLRequest
     * @return DisableSSLResponse
     */
    @Override
    public CompletableFuture<DisableSSLResponse> disableSSL(DisableSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableSSL").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/disableSSL").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableSupportAccount  DisableSupportAccountRequest
     * @return DisableSupportAccountResponse
     */
    @Override
    public CompletableFuture<DisableSupportAccountResponse> disableSupportAccount(DisableSupportAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableSupportAccount").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/supportAccount/disable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableSupportAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableSupportAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableWarehouseAutoScale  DisableWarehouseAutoScaleRequest
     * @return DisableWarehouseAutoScaleResponse
     */
    @Override
    public CompletableFuture<DisableWarehouseAutoScaleResponse> disableWarehouseAutoScale(DisableWarehouseAutoScaleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableWarehouseAutoScale").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{instanceId}/disableWarehouseAutoScale").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableWarehouseAutoScaleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableWarehouseAutoScaleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DiscardUpgrade  DiscardUpgradeRequest
     * @return DiscardUpgradeResponse
     */
    @Override
    public CompletableFuture<DiscardUpgradeResponse> discardUpgrade(DiscardUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DiscardUpgrade").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/upgrade/discard").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DiscardUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DiscardUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DropUser  DropUserRequest
     * @return DropUserResponse
     */
    @Override
    public CompletableFuture<DropUserResponse> dropUser(DropUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DropUser").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/dropUser").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DropUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DropUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableExecuteStatement  EnableExecuteStatementRequest
     * @return EnableExecuteStatementResponse
     */
    @Override
    public CompletableFuture<EnableExecuteStatementResponse> enableExecuteStatement(EnableExecuteStatementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableExecuteStatement").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/enableExecuteStatement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableExecuteStatementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableExecuteStatementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableHiveAccess  EnableHiveAccessRequest
     * @return EnableHiveAccessResponse
     */
    @Override
    public CompletableFuture<EnableHiveAccessResponse> enableHiveAccess(EnableHiveAccessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableHiveAccess").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/enableHiveAccess").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableHiveAccessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableHiveAccessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableSSL  EnableSSLRequest
     * @return EnableSSLResponse
     */
    @Override
    public CompletableFuture<EnableSSLResponse> enableSSL(EnableSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableSSL").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/enableSSL").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableSupportAccount  EnableSupportAccountRequest
     * @return EnableSupportAccountResponse
     */
    @Override
    public CompletableFuture<EnableSupportAccountResponse> enableSupportAccount(EnableSupportAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableSupportAccount").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/supportAccount/enable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSupportAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSupportAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableWarehouseAutoScale  EnableWarehouseAutoScaleRequest
     * @return EnableWarehouseAutoScaleResponse
     */
    @Override
    public CompletableFuture<EnableWarehouseAutoScaleResponse> enableWarehouseAutoScale(EnableWarehouseAutoScaleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableWarehouseAutoScale").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/enableWarehouseAutoScale").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableWarehouseAutoScaleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableWarehouseAutoScaleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteStatement  ExecuteStatementRequest
     * @return ExecuteStatementResponse
     */
    @Override
    public CompletableFuture<ExecuteStatementResponse> executeStatement(ExecuteStatementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteStatement").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/executeStatement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteStatementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteStatementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCertificateAttribute  GetCertificateAttributeRequest
     * @return GetCertificateAttributeResponse
     */
    @Override
    public CompletableFuture<GetCertificateAttributeResponse> getCertificateAttribute(GetCertificateAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCertificateAttribute").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/certificateAttribute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCertificateAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCertificateAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExecuteStatementEnabled  GetExecuteStatementEnabledRequest
     * @return GetExecuteStatementEnabledResponse
     */
    @Override
    public CompletableFuture<GetExecuteStatementEnabledResponse> getExecuteStatementEnabled(GetExecuteStatementEnabledRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExecuteStatementEnabled").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/executeStatementEnabled").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExecuteStatementEnabledResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExecuteStatementEnabledResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHoloWebLoginSetting  GetHoloWebLoginSettingRequest
     * @return GetHoloWebLoginSettingResponse
     */
    @Override
    public CompletableFuture<GetHoloWebLoginSettingResponse> getHoloWebLoginSetting(GetHoloWebLoginSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHoloWebLoginSetting").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/getHoloWebLoginSetting").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHoloWebLoginSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHoloWebLoginSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    @Override
    public CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstance").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceModel  GetInstanceModelRequest
     * @return GetInstanceModelResponse
     */
    @Override
    public CompletableFuture<GetInstanceModelResponse> getInstanceModel(GetInstanceModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceModel").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/getInstanceModel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLastUpgradeRecord  GetLastUpgradeRecordRequest
     * @return GetLastUpgradeRecordResponse
     */
    @Override
    public CompletableFuture<GetLastUpgradeRecordResponse> getLastUpgradeRecord(GetLastUpgradeRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLastUpgradeRecord").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/lastUpgradeRecord").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLastUpgradeRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLastUpgradeRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRootCertificate  GetRootCertificateRequest
     * @return GetRootCertificateResponse
     */
    @Override
    public CompletableFuture<GetRootCertificateResponse> getRootCertificate(GetRootCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRootCertificate").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/rootCertificate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRootCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRootCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScheduledBackupConfig  GetScheduledBackupConfigRequest
     * @return GetScheduledBackupConfigResponse
     */
    @Override
    public CompletableFuture<GetScheduledBackupConfigResponse> getScheduledBackupConfig(GetScheduledBackupConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScheduledBackupConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/backups/scheduledConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduledBackupConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduledBackupConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUpgradeStatus  GetUpgradeStatusRequest
     * @return GetUpgradeStatusResponse
     */
    @Override
    public CompletableFuture<GetUpgradeStatusResponse> getUpgradeStatus(GetUpgradeStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUpgradeStatus").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/upgrade/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUpgradeStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUpgradeStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUpgradeable  GetUpgradeableRequest
     * @return GetUpgradeableResponse
     */
    @Override
    public CompletableFuture<GetUpgradeableResponse> getUpgradeable(GetUpgradeableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUpgradeable").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/upgradeable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUpgradeableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUpgradeableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWarehouseDetail  GetWarehouseDetailRequest
     * @return GetWarehouseDetailResponse
     */
    @Override
    public CompletableFuture<GetWarehouseDetailResponse> getWarehouseDetail(GetWarehouseDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWarehouseDetail").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/getWarehouseDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWarehouseDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWarehouseDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantDatabasePermission  GrantDatabasePermissionRequest
     * @return GrantDatabasePermissionResponse
     */
    @Override
    public CompletableFuture<GrantDatabasePermissionResponse> grantDatabasePermission(GrantDatabasePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GrantDatabasePermission").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/grantDatabasePermission").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantDatabasePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantDatabasePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantSchemaPermission  GrantSchemaPermissionRequest
     * @return GrantSchemaPermissionResponse
     */
    @Override
    public CompletableFuture<GrantSchemaPermissionResponse> grantSchemaPermission(GrantSchemaPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GrantSchemaPermission").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/grantSchemaPermission").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantSchemaPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantSchemaPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantTablePermission  GrantTablePermissionRequest
     * @return GrantTablePermissionResponse
     */
    @Override
    public CompletableFuture<GrantTablePermissionResponse> grantTablePermission(GrantTablePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GrantTablePermission").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/grantTablePermission").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantTablePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantTablePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBackupData  ListBackupDataRequest
     * @return ListBackupDataResponse
     */
    @Override
    public CompletableFuture<ListBackupDataResponse> listBackupData(ListBackupDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListBackupData").setMethod(HttpMethod.GET).setPathRegex("/api/v1/backups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBackupDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBackupDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatabases  ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    @Override
    public CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatabases").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/listDatabases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatabasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatabasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFollowerInstances  ListFollowerInstancesRequest
     * @return ListFollowerInstancesResponse
     */
    @Override
    public CompletableFuture<ListFollowerInstancesResponse> listFollowerInstances(ListFollowerInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFollowerInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/listFollowerInstances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFollowerInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFollowerInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceModel  ListInstanceModelRequest
     * @return ListInstanceModelResponse
     */
    @Override
    public CompletableFuture<ListInstanceModelResponse> listInstanceModel(ListInstanceModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceModel").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/rpc/listInstanceModel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLeaderInstances  ListLeaderInstancesRequest
     * @return ListLeaderInstancesResponse
     */
    @Override
    public CompletableFuture<ListLeaderInstancesResponse> listLeaderInstances(ListLeaderInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLeaderInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/primaryInstances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLeaderInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLeaderInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMigrationZones  ListMigrationZonesRequest
     * @return ListMigrationZonesResponse
     */
    @Override
    public CompletableFuture<ListMigrationZonesResponse> listMigrationZones(ListMigrationZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMigrationZones").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/listMigrationZones").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMigrationZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMigrationZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListModelCatalog  ListModelCatalogRequest
     * @return ListModelCatalogResponse
     */
    @Override
    public CompletableFuture<ListModelCatalogResponse> listModelCatalog(ListModelCatalogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelCatalog").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/listModelCatalog").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelCatalogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelCatalogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOperationEvents  ListOperationEventsRequest
     * @return ListOperationEventsResponse
     */
    @Override
    public CompletableFuture<ListOperationEventsResponse> listOperationEvents(ListOperationEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOperationEvents").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/listOperationEvents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOperationEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOperationEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    @Override
    public CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRegions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/regions/listRegions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUpgradeReleaseVersions  ListUpgradeReleaseVersionsRequest
     * @return ListUpgradeReleaseVersionsResponse
     */
    @Override
    public CompletableFuture<ListUpgradeReleaseVersionsResponse> listUpgradeReleaseVersions(ListUpgradeReleaseVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUpgradeReleaseVersions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/upgrade/listReleaseVersions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUpgradeReleaseVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUpgradeReleaseVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWarehouseScheduleEvent  ListWarehouseScheduleEventRequest
     * @return ListWarehouseScheduleEventResponse
     */
    @Override
    public CompletableFuture<ListWarehouseScheduleEventResponse> listWarehouseScheduleEvent(ListWarehouseScheduleEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWarehouseScheduleEvent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/listWarehouseScheduleEvent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWarehouseScheduleEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWarehouseScheduleEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWarehouseScheduleTask  ListWarehouseScheduleTaskRequest
     * @return ListWarehouseScheduleTaskResponse
     */
    @Override
    public CompletableFuture<ListWarehouseScheduleTaskResponse> listWarehouseScheduleTask(ListWarehouseScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWarehouseScheduleTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/listWarehouseScheduleTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWarehouseScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWarehouseScheduleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWarehouses  ListWarehousesRequest
     * @return ListWarehousesResponse
     */
    @Override
    public CompletableFuture<ListWarehousesResponse> listWarehouses(ListWarehousesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWarehouses").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{instanceId}/listWarehouses").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWarehousesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWarehousesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MigrateInstanceZone  MigrateInstanceZoneRequest
     * @return MigrateInstanceZoneResponse
     */
    @Override
    public CompletableFuture<MigrateInstanceZoneResponse> migrateInstanceZone(MigrateInstanceZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MigrateInstanceZone").setMethod(HttpMethod.PATCH).setPathRegex("/api/v1/instances/{instanceId}/migrateInstanceZone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateInstanceZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateInstanceZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PrepareUpgrade  PrepareUpgradeRequest
     * @return PrepareUpgradeResponse
     */
    @Override
    public CompletableFuture<PrepareUpgradeResponse> prepareUpgrade(PrepareUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PrepareUpgrade").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/upgrade/prepare").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PrepareUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PrepareUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RebalanceHoloWarehouse  RebalanceHoloWarehouseRequest
     * @return RebalanceHoloWarehouseResponse
     */
    @Override
    public CompletableFuture<RebalanceHoloWarehouseResponse> rebalanceHoloWarehouse(RebalanceHoloWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RebalanceHoloWarehouse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/rebalanceHoloWarehouse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebalanceHoloWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebalanceHoloWarehouseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenameHoloWarehouse  RenameHoloWarehouseRequest
     * @return RenameHoloWarehouseResponse
     */
    @Override
    public CompletableFuture<RenameHoloWarehouseResponse> renameHoloWarehouse(RenameHoloWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenameHoloWarehouse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/renameHoloWarehouse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameHoloWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameHoloWarehouseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing of Hologres, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</li>
     * <li>For more information about how to renew a Hologres instance, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/manage-renewals?spm=a2c63.p38356.0.0.38e731c9VAwtDP">Manage renewals</a>.</li>
     * <li>You can renew only subscription instances.</li>
     * </ul>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    @Override
    public CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenewInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/renew").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewSSLCertificate  RenewSSLCertificateRequest
     * @return RenewSSLCertificateResponse
     */
    @Override
    public CompletableFuture<RenewSSLCertificateResponse> renewSSLCertificate(RenewSSLCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenewSSLCertificate").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/renewSSLCertificate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewSSLCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewSSLCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartHoloWarehouse  RestartHoloWarehouseRequest
     * @return RestartHoloWarehouseResponse
     */
    @Override
    public CompletableFuture<RestartHoloWarehouseResponse> restartHoloWarehouse(RestartHoloWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartHoloWarehouse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/restartHoloWarehouse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartHoloWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartHoloWarehouseResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/restart").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResumeHoloWarehouse  ResumeHoloWarehouseRequest
     * @return ResumeHoloWarehouseResponse
     */
    @Override
    public CompletableFuture<ResumeHoloWarehouseResponse> resumeHoloWarehouse(ResumeHoloWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResumeHoloWarehouse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/resumeHoloWarehouse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeHoloWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeHoloWarehouseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResumeInstance  ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    @Override
    public CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResumeInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/resume").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeDatabasePermission  RevokeDatabasePermissionRequest
     * @return RevokeDatabasePermissionResponse
     */
    @Override
    public CompletableFuture<RevokeDatabasePermissionResponse> revokeDatabasePermission(RevokeDatabasePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeDatabasePermission").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{instanceId}/revokeDatabasePermission").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeDatabasePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeDatabasePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeSchemaPermission  RevokeSchemaPermissionRequest
     * @return RevokeSchemaPermissionResponse
     */
    @Override
    public CompletableFuture<RevokeSchemaPermissionResponse> revokeSchemaPermission(RevokeSchemaPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeSchemaPermission").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{instanceId}/revokeSchemaPermission").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeSchemaPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeSchemaPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeTablePermission  RevokeTablePermissionRequest
     * @return RevokeTablePermissionResponse
     */
    @Override
    public CompletableFuture<RevokeTablePermissionResponse> revokeTablePermission(RevokeTablePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeTablePermission").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{instanceId}/revokeTablePermission").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeTablePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeTablePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScaleHoloWarehouse  ScaleHoloWarehouseRequest
     * @return ScaleHoloWarehouseResponse
     */
    @Override
    public CompletableFuture<ScaleHoloWarehouseResponse> scaleHoloWarehouse(ScaleHoloWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleHoloWarehouse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/scaleHoloWarehouse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleHoloWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleHoloWarehouseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing of Hologres, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</li>
     * <li>During the change of computing resource specifications of a Hologres instance, the instance is unavailable. During the change of storage resource specifications of a Hologres instance, the instance can work normally. Do not frequently change instance specifications. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/upgrade-or-downgrade-instance-specifications">Upgrade or downgrade instance specifications</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ScaleInstance  ScaleInstanceRequest
     * @return ScaleInstanceResponse
     */
    @Override
    public CompletableFuture<ScaleInstanceResponse> scaleInstance(ScaleInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/scale").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    @Override
    public CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SuspendHoloWarehouse  SuspendHoloWarehouseRequest
     * @return SuspendHoloWarehouseResponse
     */
    @Override
    public CompletableFuture<SuspendHoloWarehouseResponse> suspendHoloWarehouse(SuspendHoloWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SuspendHoloWarehouse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/suspendHoloWarehouse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendHoloWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendHoloWarehouseResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/api/v1/tag").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnBindLeaderInstance  UnBindLeaderInstanceRequest
     * @return UnBindLeaderInstanceResponse
     */
    @Override
    public CompletableFuture<UnBindLeaderInstanceResponse> unBindLeaderInstance(UnBindLeaderInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnBindLeaderInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/unBindReadOnly").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnBindLeaderInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnBindLeaderInstanceResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/api/v1/tag/unTag").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAutoUpgrade  UpdateAutoUpgradeRequest
     * @return UpdateAutoUpgradeResponse
     */
    @Override
    public CompletableFuture<UpdateAutoUpgradeResponse> updateAutoUpgrade(UpdateAutoUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAutoUpgrade").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/autoUpgrade").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAutoUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAutoUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateBackupDataDesc  UpdateBackupDataDescRequest
     * @return UpdateBackupDataDescResponse
     */
    @Override
    public CompletableFuture<UpdateBackupDataDescResponse> updateBackupDataDesc(UpdateBackupDataDescRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateBackupDataDesc").setMethod(HttpMethod.POST).setPathRegex("/api/v1/backups/{id}/desc").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBackupDataDescResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBackupDataDescResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHoloWebLoginSetting  UpdateHoloWebLoginSettingRequest
     * @return UpdateHoloWebLoginSettingResponse
     */
    @Override
    public CompletableFuture<UpdateHoloWebLoginSettingResponse> updateHoloWebLoginSetting(UpdateHoloWebLoginSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHoloWebLoginSetting").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/updateHoloWebLoginSetting").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHoloWebLoginSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHoloWebLoginSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceName  UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceName").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/instanceName").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceNetworkType  UpdateInstanceNetworkTypeRequest
     * @return UpdateInstanceNetworkTypeResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceNetworkTypeResponse> updateInstanceNetworkType(UpdateInstanceNetworkTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceNetworkType").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/network").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceNetworkTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceNetworkTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstancePort  UpdateInstancePortRequest
     * @return UpdateInstancePortResponse
     */
    @Override
    public CompletableFuture<UpdateInstancePortResponse> updateInstancePort(UpdateInstancePortRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstancePort").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/updatePort").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstancePortResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstancePortResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMaintenanceWindow  UpdateMaintenanceWindowRequest
     * @return UpdateMaintenanceWindowResponse
     */
    @Override
    public CompletableFuture<UpdateMaintenanceWindowResponse> updateMaintenanceWindow(UpdateMaintenanceWindowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMaintenanceWindow").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/maintenanceWindow").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMaintenanceWindowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMaintenanceWindowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModelService  UpdateModelServiceRequest
     * @return UpdateModelServiceResponse
     */
    @Override
    public CompletableFuture<UpdateModelServiceResponse> updateModelService(UpdateModelServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModelService").setMethod(HttpMethod.PATCH).setPathRegex("/api/v1/instances/{instanceId}/updateModelService").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOperationEventScheduleTime  UpdateOperationEventScheduleTimeRequest
     * @return UpdateOperationEventScheduleTimeResponse
     */
    @Override
    public CompletableFuture<UpdateOperationEventScheduleTimeResponse> updateOperationEventScheduleTime(UpdateOperationEventScheduleTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateOperationEventScheduleTime").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/updateOperationEventScheduleTime").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOperationEventScheduleTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOperationEventScheduleTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateScheduledBackupConfig  UpdateScheduledBackupConfigRequest
     * @return UpdateScheduledBackupConfigResponse
     */
    @Override
    public CompletableFuture<UpdateScheduledBackupConfigResponse> updateScheduledBackupConfig(UpdateScheduledBackupConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateScheduledBackupConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/backups/scheduledConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateScheduledBackupConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateScheduledBackupConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWarehouseScheduleTask  UpdateWarehouseScheduleTaskRequest
     * @return UpdateWarehouseScheduleTaskResponse
     */
    @Override
    public CompletableFuture<UpdateWarehouseScheduleTaskResponse> updateWarehouseScheduleTask(UpdateWarehouseScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWarehouseScheduleTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/updateWarehouseScheduleTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWarehouseScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWarehouseScheduleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeInstance  UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     */
    @Override
    public CompletableFuture<UpgradeInstanceResponse> upgradeInstance(UpgradeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{instanceId}/upgrade").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
