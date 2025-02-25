// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dataworks_public20200518.models.*;
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
        this.product = "dataworks-public";
        this.version = "2020-05-18";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "dataworks.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "dataworks.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dataworks.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dataworks.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dataworks.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dataworks.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dataworks.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dataworks.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dataworks.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dataworks.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dataworks.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dataworks.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dataworks.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dataworks.aliyuncs.com"),
            new TeaPair("eu-central-1", "dataworks.eu-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dataworks.eu-west-1.aliyuncs.com"),
            new TeaPair("me-east-1", "dataworks.me-east-1.aliyuncs.com"),
            new TeaPair("us-east-1", "dataworks.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dataworks.us-west-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dataworks.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AbolishDataServiceApi  AbolishDataServiceApiRequest
     * @return AbolishDataServiceApiResponse
     */
    @Override
    public CompletableFuture<AbolishDataServiceApiResponse> abolishDataServiceApi(AbolishDataServiceApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AbolishDataServiceApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AbolishDataServiceApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AbolishDataServiceApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddMetaCollectionEntity  AddMetaCollectionEntityRequest
     * @return AddMetaCollectionEntityResponse
     */
    @Override
    public CompletableFuture<AddMetaCollectionEntityResponse> addMetaCollectionEntity(AddMetaCollectionEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddMetaCollectionEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMetaCollectionEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMetaCollectionEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  For information about how to add an account to a DataWorks workspace as a member, see <a href="https://help.aliyun.com/document_detail/136941.html">Add workspace members and assign roles to them</a>.</p>
     * <ul>
     * <li>If you assign a built-in workspace-level role to a member of a DataWorks workspace, the member is automatically granted the permissions of the mapped role of the MaxCompute compute engine in the development environment. For more information, see <a href="https://help.aliyun.com/document_detail/449397.html">Appendix: Mappings between the built-in workspace-level roles of DataWorks and the roles of MaxCompute</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddProjectMemberToRole  AddProjectMemberToRoleRequest
     * @return AddProjectMemberToRoleResponse
     */
    @Override
    public CompletableFuture<AddProjectMemberToRoleResponse> addProjectMemberToRole(AddProjectMemberToRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddProjectMemberToRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddProjectMemberToRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddProjectMemberToRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddRecognizeRule  AddRecognizeRuleRequest
     * @return AddRecognizeRuleResponse
     */
    @Override
    public CompletableFuture<AddRecognizeRuleResponse> addRecognizeRule(AddRecognizeRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddRecognizeRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddRecognizeRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddRecognizeRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddToMetaCategory  AddToMetaCategoryRequest
     * @return AddToMetaCategoryResponse
     */
    @Override
    public CompletableFuture<AddToMetaCategoryResponse> addToMetaCategory(AddToMetaCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddToMetaCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddToMetaCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddToMetaCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApprovePermissionApplyOrder  ApprovePermissionApplyOrderRequest
     * @return ApprovePermissionApplyOrderResponse
     */
    @Override
    public CompletableFuture<ApprovePermissionApplyOrderResponse> approvePermissionApplyOrder(ApprovePermissionApplyOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApprovePermissionApplyOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApprovePermissionApplyOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApprovePermissionApplyOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CallbackExtension  CallbackExtensionRequest
     * @return CallbackExtensionResponse
     */
    @Override
    public CompletableFuture<CallbackExtensionResponse> callbackExtension(CallbackExtensionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CallbackExtension").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CallbackExtensionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CallbackExtensionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResourceManagerResourceGroup  ChangeResourceManagerResourceGroupRequest
     * @return ChangeResourceManagerResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceManagerResourceGroupResponse> changeResourceManagerResourceGroup(ChangeResourceManagerResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceManagerResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceManagerResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceManagerResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckFileDeployment  CheckFileDeploymentRequest
     * @return CheckFileDeploymentResponse
     */
    @Override
    public CompletableFuture<CheckFileDeploymentResponse> checkFileDeployment(CheckFileDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckFileDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckFileDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckFileDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckMetaPartition  CheckMetaPartitionRequest
     * @return CheckMetaPartitionResponse
     */
    @Override
    public CompletableFuture<CheckMetaPartitionResponse> checkMetaPartition(CheckMetaPartitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckMetaPartition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckMetaPartitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckMetaPartitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckMetaTable  CheckMetaTableRequest
     * @return CheckMetaTableResponse
     */
    @Override
    public CompletableFuture<CheckMetaTableResponse> checkMetaTable(CheckMetaTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckMetaTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckMetaTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckMetaTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBaseline  CreateBaselineRequest
     * @return CreateBaselineResponse
     */
    @Override
    public CompletableFuture<CreateBaselineResponse> createBaseline(CreateBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBusiness  CreateBusinessRequest
     * @return CreateBusinessResponse
     */
    @Override
    public CompletableFuture<CreateBusinessResponse> createBusiness(CreateBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateConnection is deprecated  * @param request  the request parameters of CreateConnection  CreateConnectionRequest
     * @return CreateConnectionResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateConnectionResponse> createConnection(CreateConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization.</p>
     * 
     * @param request the request parameters of CreateDIAlarmRule  CreateDIAlarmRuleRequest
     * @return CreateDIAlarmRuleResponse
     */
    @Override
    public CompletableFuture<CreateDIAlarmRuleResponse> createDIAlarmRule(CreateDIAlarmRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDIAlarmRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDIAlarmRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDIAlarmRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDIJob  CreateDIJobRequest
     * @return CreateDIJobResponse
     */
    @Override
    public CompletableFuture<CreateDIJobResponse> createDIJob(CreateDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDISyncTask  CreateDISyncTaskRequest
     * @return CreateDISyncTaskResponse
     */
    @Override
    public CompletableFuture<CreateDISyncTaskResponse> createDISyncTask(CreateDISyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDISyncTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDISyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDISyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateDagComplement is deprecated  * @param request  the request parameters of CreateDagComplement  CreateDagComplementRequest
     * @return CreateDagComplementResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateDagComplementResponse> createDagComplement(CreateDagComplementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDagComplement").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDagComplementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDagComplementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateDagTest is deprecated  * @param request  the request parameters of CreateDagTest  CreateDagTestRequest
     * @return CreateDagTestResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateDagTestResponse> createDagTest(CreateDagTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDagTest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDagTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDagTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataServiceApi  CreateDataServiceApiRequest
     * @return CreateDataServiceApiResponse
     */
    @Override
    public CompletableFuture<CreateDataServiceApiResponse> createDataServiceApi(CreateDataServiceApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataServiceApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataServiceApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataServiceApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataServiceApiAuthority  CreateDataServiceApiAuthorityRequest
     * @return CreateDataServiceApiAuthorityResponse
     */
    @Override
    public CompletableFuture<CreateDataServiceApiAuthorityResponse> createDataServiceApiAuthority(CreateDataServiceApiAuthorityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataServiceApiAuthority").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataServiceApiAuthorityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataServiceApiAuthorityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataServiceFolder  CreateDataServiceFolderRequest
     * @return CreateDataServiceFolderResponse
     */
    @Override
    public CompletableFuture<CreateDataServiceFolderResponse> createDataServiceFolder(CreateDataServiceFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataServiceFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataServiceFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataServiceFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataServiceGroup  CreateDataServiceGroupRequest
     * @return CreateDataServiceGroupResponse
     */
    @Override
    public CompletableFuture<CreateDataServiceGroupResponse> createDataServiceGroup(CreateDataServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataServiceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    @Override
    public CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExportMigration  CreateExportMigrationRequest
     * @return CreateExportMigrationResponse
     */
    @Override
    public CompletableFuture<CreateExportMigrationResponse> createExportMigration(CreateExportMigrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateExportMigration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExportMigrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExportMigrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    @Override
    public CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFolder  CreateFolderRequest
     * @return CreateFolderResponse
     */
    @Override
    public CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateManualDag is deprecated  * @param request  the request parameters of CreateManualDag  CreateManualDagRequest
     * @return CreateManualDagResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateManualDagResponse> createManualDag(CreateManualDagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateManualDag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateManualDagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateManualDagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMetaCategory  CreateMetaCategoryRequest
     * @return CreateMetaCategoryResponse
     */
    @Override
    public CompletableFuture<CreateMetaCategoryResponse> createMetaCategory(CreateMetaCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMetaCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMetaCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMetaCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Collections are classified into various types. The names of collections of the same type must be different.</p>
     * 
     * @param request the request parameters of CreateMetaCollection  CreateMetaCollectionRequest
     * @return CreateMetaCollectionResponse
     */
    @Override
    public CompletableFuture<CreateMetaCollectionResponse> createMetaCollection(CreateMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMetaCollection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePermissionApplyOrder  CreatePermissionApplyOrderRequest
     * @return CreatePermissionApplyOrderResponse
     */
    @Override
    public CompletableFuture<CreatePermissionApplyOrderResponse> createPermissionApplyOrder(CreatePermissionApplyOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePermissionApplyOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePermissionApplyOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePermissionApplyOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    @Override
    public CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProjectMember  CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     */
    @Override
    public CompletableFuture<CreateProjectMemberResponse> createProjectMember(CreateProjectMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProjectMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQualityEntity  CreateQualityEntityRequest
     * @return CreateQualityEntityResponse
     */
    @Override
    public CompletableFuture<CreateQualityEntityResponse> createQualityEntity(CreateQualityEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQualityEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQualityEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQualityEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQualityFollower  CreateQualityFollowerRequest
     * @return CreateQualityFollowerResponse
     */
    @Override
    public CompletableFuture<CreateQualityFollowerResponse> createQualityFollower(CreateQualityFollowerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQualityFollower").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQualityFollowerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQualityFollowerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQualityRelativeNode  CreateQualityRelativeNodeRequest
     * @return CreateQualityRelativeNodeResponse
     */
    @Override
    public CompletableFuture<CreateQualityRelativeNodeResponse> createQualityRelativeNode(CreateQualityRelativeNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQualityRelativeNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQualityRelativeNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQualityRelativeNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQualityRule  CreateQualityRuleRequest
     * @return CreateQualityRuleResponse
     */
    @Override
    public CompletableFuture<CreateQualityRuleResponse> createQualityRule(CreateQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRemind  CreateRemindRequest
     * @return CreateRemindResponse
     */
    @Override
    public CompletableFuture<CreateRemindResponse> createRemind(CreateRemindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRemind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRemindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRemindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTable  CreateTableRequest
     * @return CreateTableResponse
     */
    @Override
    public CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTableLevel  CreateTableLevelRequest
     * @return CreateTableLevelResponse
     */
    @Override
    public CompletableFuture<CreateTableLevelResponse> createTableLevel(CreateTableLevelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTableLevel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTableLevelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTableLevelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTableTheme  CreateTableThemeRequest
     * @return CreateTableThemeResponse
     */
    @Override
    public CompletableFuture<CreateTableThemeResponse> createTableTheme(CreateTableThemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTableTheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTableThemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTableThemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUdfFile  CreateUdfFileRequest
     * @return CreateUdfFileResponse
     */
    @Override
    public CompletableFuture<CreateUdfFileResponse> createUdfFile(CreateUdfFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUdfFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUdfFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUdfFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBaseline  DeleteBaselineRequest
     * @return DeleteBaselineResponse
     */
    @Override
    public CompletableFuture<DeleteBaselineResponse> deleteBaseline(DeleteBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBusiness  DeleteBusinessRequest
     * @return DeleteBusinessResponse
     */
    @Override
    public CompletableFuture<DeleteBusinessResponse> deleteBusiness(DeleteBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteConnection is deprecated  * @param request  the request parameters of DeleteConnection  DeleteConnectionRequest
     * @return DeleteConnectionResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteConnectionResponse> deleteConnection(DeleteConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks whose MigrationType is set to RealtimeIncremental.</p>
     * 
     * @param request the request parameters of DeleteDIAlarmRule  DeleteDIAlarmRuleRequest
     * @return DeleteDIAlarmRuleResponse
     */
    @Override
    public CompletableFuture<DeleteDIAlarmRuleResponse> deleteDIAlarmRule(DeleteDIAlarmRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDIAlarmRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDIAlarmRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDIAlarmRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDIJob  DeleteDIJobRequest
     * @return DeleteDIJobResponse
     */
    @Override
    public CompletableFuture<DeleteDIJobResponse> deleteDIJob(DeleteDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you want to delete a batch synchronization task, call the DeleteFile operation. For more information, see <a href="https://help.aliyun.com/document_detail/321443.html">Delete a synchronization task</a>.</p>
     * 
     * @param request the request parameters of DeleteDISyncTask  DeleteDISyncTaskRequest
     * @return DeleteDISyncTaskResponse
     */
    @Override
    public CompletableFuture<DeleteDISyncTaskResponse> deleteDISyncTask(DeleteDISyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDISyncTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDISyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDISyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataServiceApi  DeleteDataServiceApiRequest
     * @return DeleteDataServiceApiResponse
     */
    @Override
    public CompletableFuture<DeleteDataServiceApiResponse> deleteDataServiceApi(DeleteDataServiceApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataServiceApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataServiceApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataServiceApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataServiceApiAuthority  DeleteDataServiceApiAuthorityRequest
     * @return DeleteDataServiceApiAuthorityResponse
     */
    @Override
    public CompletableFuture<DeleteDataServiceApiAuthorityResponse> deleteDataServiceApiAuthority(DeleteDataServiceApiAuthorityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataServiceApiAuthority").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataServiceApiAuthorityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataServiceApiAuthorityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    @Override
    public CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    @Override
    public CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFolder  DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    @Override
    public CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFromMetaCategory  DeleteFromMetaCategoryRequest
     * @return DeleteFromMetaCategoryResponse
     */
    @Override
    public CompletableFuture<DeleteFromMetaCategoryResponse> deleteFromMetaCategory(DeleteFromMetaCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFromMetaCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFromMetaCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFromMetaCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is currently in the trial phase. Users who wish to experience it can apply, and after the administrator adds them to the trial list, they can call this API.</p>
     * 
     * @param request the request parameters of DeleteLineageRelation  DeleteLineageRelationRequest
     * @return DeleteLineageRelationResponse
     */
    @Override
    public CompletableFuture<DeleteLineageRelationResponse> deleteLineageRelation(DeleteLineageRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLineageRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLineageRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLineageRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMetaCategory  DeleteMetaCategoryRequest
     * @return DeleteMetaCategoryResponse
     */
    @Override
    public CompletableFuture<DeleteMetaCategoryResponse> deleteMetaCategory(DeleteMetaCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetaCategory").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetaCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetaCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMetaCollection  DeleteMetaCollectionRequest
     * @return DeleteMetaCollectionResponse
     */
    @Override
    public CompletableFuture<DeleteMetaCollectionResponse> deleteMetaCollection(DeleteMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetaCollection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMetaCollectionEntity  DeleteMetaCollectionEntityRequest
     * @return DeleteMetaCollectionEntityResponse
     */
    @Override
    public CompletableFuture<DeleteMetaCollectionEntityResponse> deleteMetaCollectionEntity(DeleteMetaCollectionEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetaCollectionEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetaCollectionEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetaCollectionEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProjectMember  DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     */
    @Override
    public CompletableFuture<DeleteProjectMemberResponse> deleteProjectMember(DeleteProjectMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProjectMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQualityEntity  DeleteQualityEntityRequest
     * @return DeleteQualityEntityResponse
     */
    @Override
    public CompletableFuture<DeleteQualityEntityResponse> deleteQualityEntity(DeleteQualityEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQualityEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQualityEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQualityEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In Data Quality, you must configure monitoring rules based on a partition filter expression. Data Quality uses these rules to detect changes in source data and dirty data generated during the process of extract, transform, and load (ETL). This way, you can prevent tasks from producing unexpected dirty data that affects the smooth running of tasks and business decision-making. You can go to the Manage Subscriptions page to add subscribers for a partition filter expression. When the monitoring rule that is created based on the partition filter expression is triggered, the subscribers can receive notifications and troubleshoot errors at the earliest opportunity. For more information, see <a href="https://help.aliyun.com/document_detail/73690.html">Configure monitoring rules</a>.</p>
     * 
     * @param request the request parameters of DeleteQualityFollower  DeleteQualityFollowerRequest
     * @return DeleteQualityFollowerResponse
     */
    @Override
    public CompletableFuture<DeleteQualityFollowerResponse> deleteQualityFollower(DeleteQualityFollowerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQualityFollower").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQualityFollowerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQualityFollowerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQualityRelativeNode  DeleteQualityRelativeNodeRequest
     * @return DeleteQualityRelativeNodeResponse
     */
    @Override
    public CompletableFuture<DeleteQualityRelativeNodeResponse> deleteQualityRelativeNode(DeleteQualityRelativeNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQualityRelativeNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQualityRelativeNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQualityRelativeNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQualityRule  DeleteQualityRuleRequest
     * @return DeleteQualityRuleResponse
     */
    @Override
    public CompletableFuture<DeleteQualityRuleResponse> deleteQualityRule(DeleteQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRecognizeRule  DeleteRecognizeRuleRequest
     * @return DeleteRecognizeRuleResponse
     */
    @Override
    public CompletableFuture<DeleteRecognizeRuleResponse> deleteRecognizeRule(DeleteRecognizeRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRecognizeRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRecognizeRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRecognizeRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRemind  DeleteRemindRequest
     * @return DeleteRemindResponse
     */
    @Override
    public CompletableFuture<DeleteRemindResponse> deleteRemind(DeleteRemindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRemind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRemindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRemindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTable  DeleteTableRequest
     * @return DeleteTableResponse
     */
    @Override
    public CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTableLevel  DeleteTableLevelRequest
     * @return DeleteTableLevelResponse
     */
    @Override
    public CompletableFuture<DeleteTableLevelResponse> deleteTableLevel(DeleteTableLevelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTableLevel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTableLevelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTableLevelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTableTheme  DeleteTableThemeRequest
     * @return DeleteTableThemeResponse
     */
    @Override
    public CompletableFuture<DeleteTableThemeResponse> deleteTableTheme(DeleteTableThemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTableTheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTableThemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTableThemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployDISyncTask  DeployDISyncTaskRequest
     * @return DeployDISyncTaskResponse
     */
    @Override
    public CompletableFuture<DeployDISyncTaskResponse> deployDISyncTask(DeployDISyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeployDISyncTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployDISyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployDISyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployFile  DeployFileRequest
     * @return DeployFileResponse
     */
    @Override
    public CompletableFuture<DeployFileResponse> deployFile(DeployFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeployFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DesensitizeData  DesensitizeDataRequest
     * @return DesensitizeDataResponse
     */
    @Override
    public CompletableFuture<DesensitizeDataResponse> desensitizeData(DesensitizeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DesensitizeData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DesensitizeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DesensitizeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgDesensPlanAddOrUpdate  DsgDesensPlanAddOrUpdateRequest
     * @return DsgDesensPlanAddOrUpdateResponse
     */
    @Override
    public CompletableFuture<DsgDesensPlanAddOrUpdateResponse> dsgDesensPlanAddOrUpdate(DsgDesensPlanAddOrUpdateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgDesensPlanAddOrUpdate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgDesensPlanAddOrUpdateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgDesensPlanAddOrUpdateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgDesensPlanDelete  DsgDesensPlanDeleteRequest
     * @return DsgDesensPlanDeleteResponse
     */
    @Override
    public CompletableFuture<DsgDesensPlanDeleteResponse> dsgDesensPlanDelete(DsgDesensPlanDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgDesensPlanDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgDesensPlanDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgDesensPlanDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgDesensPlanQueryList  DsgDesensPlanQueryListRequest
     * @return DsgDesensPlanQueryListResponse
     */
    @Override
    public CompletableFuture<DsgDesensPlanQueryListResponse> dsgDesensPlanQueryList(DsgDesensPlanQueryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgDesensPlanQueryList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgDesensPlanQueryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgDesensPlanQueryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgDesensPlanUpdateStatus  DsgDesensPlanUpdateStatusRequest
     * @return DsgDesensPlanUpdateStatusResponse
     */
    @Override
    public CompletableFuture<DsgDesensPlanUpdateStatusResponse> dsgDesensPlanUpdateStatus(DsgDesensPlanUpdateStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgDesensPlanUpdateStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgDesensPlanUpdateStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgDesensPlanUpdateStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgPlatformQueryProjectsAndSchemaFromMeta  DsgPlatformQueryProjectsAndSchemaFromMetaRequest
     * @return DsgPlatformQueryProjectsAndSchemaFromMetaResponse
     */
    @Override
    public CompletableFuture<DsgPlatformQueryProjectsAndSchemaFromMetaResponse> dsgPlatformQueryProjectsAndSchemaFromMeta(DsgPlatformQueryProjectsAndSchemaFromMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgPlatformQueryProjectsAndSchemaFromMeta").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgPlatformQueryProjectsAndSchemaFromMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgPlatformQueryProjectsAndSchemaFromMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgQueryDefaultTemplates  DsgQueryDefaultTemplatesRequest
     * @return DsgQueryDefaultTemplatesResponse
     */
    @Override
    public CompletableFuture<DsgQueryDefaultTemplatesResponse> dsgQueryDefaultTemplates(DsgQueryDefaultTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgQueryDefaultTemplates").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgQueryDefaultTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgQueryDefaultTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The query capability of the API operation is similar to the query feature in Data Security Guard in the DataWorks console. The API operation can be used to query the identification results of sensitive data of a tenant based on the association with the tenant ID.</p>
     * <ul>
     * <li>You can search for a specific identification result based on filter conditions such as data source type and workspace.</li>
     * <li>You can sort the identification results of sensitive data of a tenant based on the values of a field in ascending or descending order.</li>
     * <li>This operation supports paged query.</li>
     * </ul>
     * 
     * @param request the request parameters of DsgQuerySensResult  DsgQuerySensResultRequest
     * @return DsgQuerySensResultResponse
     */
    @Override
    public CompletableFuture<DsgQuerySensResultResponse> dsgQuerySensResult(DsgQuerySensResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgQuerySensResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgQuerySensResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgQuerySensResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgRunSensIdentify  DsgRunSensIdentifyRequest
     * @return DsgRunSensIdentifyResponse
     */
    @Override
    public CompletableFuture<DsgRunSensIdentifyResponse> dsgRunSensIdentify(DsgRunSensIdentifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgRunSensIdentify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgRunSensIdentifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgRunSensIdentifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgSceneAddOrUpdateScene  DsgSceneAddOrUpdateSceneRequest
     * @return DsgSceneAddOrUpdateSceneResponse
     */
    @Override
    public CompletableFuture<DsgSceneAddOrUpdateSceneResponse> dsgSceneAddOrUpdateScene(DsgSceneAddOrUpdateSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgSceneAddOrUpdateScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgSceneAddOrUpdateSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgSceneAddOrUpdateSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgSceneQuerySceneListByName  DsgSceneQuerySceneListByNameRequest
     * @return DsgSceneQuerySceneListByNameResponse
     */
    @Override
    public CompletableFuture<DsgSceneQuerySceneListByNameResponse> dsgSceneQuerySceneListByName(DsgSceneQuerySceneListByNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgSceneQuerySceneListByName").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgSceneQuerySceneListByNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgSceneQuerySceneListByNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgScenedDeleteScene  DsgScenedDeleteSceneRequest
     * @return DsgScenedDeleteSceneResponse
     */
    @Override
    public CompletableFuture<DsgScenedDeleteSceneResponse> dsgScenedDeleteScene(DsgScenedDeleteSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgScenedDeleteScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgScenedDeleteSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgScenedDeleteSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgStopSensIdentify  DsgStopSensIdentifyRequest
     * @return DsgStopSensIdentifyResponse
     */
    @Override
    public CompletableFuture<DsgStopSensIdentifyResponse> dsgStopSensIdentify(DsgStopSensIdentifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgStopSensIdentify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgStopSensIdentifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgStopSensIdentifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgUserGroupAddOrUpdate  DsgUserGroupAddOrUpdateRequest
     * @return DsgUserGroupAddOrUpdateResponse
     */
    @Override
    public CompletableFuture<DsgUserGroupAddOrUpdateResponse> dsgUserGroupAddOrUpdate(DsgUserGroupAddOrUpdateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgUserGroupAddOrUpdate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgUserGroupAddOrUpdateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgUserGroupAddOrUpdateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgUserGroupDelete  DsgUserGroupDeleteRequest
     * @return DsgUserGroupDeleteResponse
     */
    @Override
    public CompletableFuture<DsgUserGroupDeleteResponse> dsgUserGroupDelete(DsgUserGroupDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgUserGroupDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgUserGroupDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgUserGroupDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgUserGroupGetOdpsRoleGroups  DsgUserGroupGetOdpsRoleGroupsRequest
     * @return DsgUserGroupGetOdpsRoleGroupsResponse
     */
    @Override
    public CompletableFuture<DsgUserGroupGetOdpsRoleGroupsResponse> dsgUserGroupGetOdpsRoleGroups(DsgUserGroupGetOdpsRoleGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgUserGroupGetOdpsRoleGroups").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgUserGroupGetOdpsRoleGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgUserGroupGetOdpsRoleGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgUserGroupQueryList  DsgUserGroupQueryListRequest
     * @return DsgUserGroupQueryListResponse
     */
    @Override
    public CompletableFuture<DsgUserGroupQueryListResponse> dsgUserGroupQueryList(DsgUserGroupQueryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgUserGroupQueryList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgUserGroupQueryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgUserGroupQueryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgUserGroupQueryUserList  DsgUserGroupQueryUserListRequest
     * @return DsgUserGroupQueryUserListResponse
     */
    @Override
    public CompletableFuture<DsgUserGroupQueryUserListResponse> dsgUserGroupQueryUserList(DsgUserGroupQueryUserListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgUserGroupQueryUserList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgUserGroupQueryUserListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgUserGroupQueryUserListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgWhiteListAddOrUpdate  DsgWhiteListAddOrUpdateRequest
     * @return DsgWhiteListAddOrUpdateResponse
     */
    @Override
    public CompletableFuture<DsgWhiteListAddOrUpdateResponse> dsgWhiteListAddOrUpdate(DsgWhiteListAddOrUpdateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgWhiteListAddOrUpdate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgWhiteListAddOrUpdateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgWhiteListAddOrUpdateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgWhiteListDeleteList  DsgWhiteListDeleteListRequest
     * @return DsgWhiteListDeleteListResponse
     */
    @Override
    public CompletableFuture<DsgWhiteListDeleteListResponse> dsgWhiteListDeleteList(DsgWhiteListDeleteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgWhiteListDeleteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgWhiteListDeleteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgWhiteListDeleteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DsgWhiteListQueryList  DsgWhiteListQueryListRequest
     * @return DsgWhiteListQueryListResponse
     */
    @Override
    public CompletableFuture<DsgWhiteListQueryListResponse> dsgWhiteListQueryList(DsgWhiteListQueryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DsgWhiteListQueryList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DsgWhiteListQueryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DsgWhiteListQueryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EditRecognizeRule  EditRecognizeRuleRequest
     * @return EditRecognizeRuleResponse
     */
    @Override
    public CompletableFuture<EditRecognizeRuleResponse> editRecognizeRule(EditRecognizeRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditRecognizeRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditRecognizeRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditRecognizeRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EstablishRelationTableToBusiness  EstablishRelationTableToBusinessRequest
     * @return EstablishRelationTableToBusinessResponse
     */
    @Override
    public CompletableFuture<EstablishRelationTableToBusinessResponse> establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EstablishRelationTableToBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EstablishRelationTableToBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EstablishRelationTableToBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportDataSources  ExportDataSourcesRequest
     * @return ExportDataSourcesResponse
     */
    @Override
    public CompletableFuture<ExportDataSourcesResponse> exportDataSources(ExportDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportDataSources").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to use the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to directly create a batch synchronization task in Data Integration. To create a real-time synchronization task or another type of synchronization task, you must first call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a> operation to generate the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can use the parameters as request parameters of <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> and call the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to create a real-time synchronization task or another type of synchronization task. DataWorks allows you to create real-time synchronization tasks and other types of synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * @param request the request parameters of GenerateDISyncTaskConfigForCreating  GenerateDISyncTaskConfigForCreatingRequest
     * @return GenerateDISyncTaskConfigForCreatingResponse
     */
    @Override
    public CompletableFuture<GenerateDISyncTaskConfigForCreatingResponse> generateDISyncTaskConfigForCreating(GenerateDISyncTaskConfigForCreatingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateDISyncTaskConfigForCreating").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateDISyncTaskConfigForCreatingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateDISyncTaskConfigForCreatingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to use only the <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to update a batch synchronization task in Data Integration. To update a real-time synchronization task, you must first call the GenerateDISyncTaskConfigForUpdating operation to generate the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the UpdateDISyncTask operation and use the parameters as request parameters to update a real-time synchronization task in Data Integration. DataWorks allows you to create or update real-time synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * @param request the request parameters of GenerateDISyncTaskConfigForUpdating  GenerateDISyncTaskConfigForUpdatingRequest
     * @return GenerateDISyncTaskConfigForUpdatingResponse
     */
    @Override
    public CompletableFuture<GenerateDISyncTaskConfigForUpdatingResponse> generateDISyncTaskConfigForUpdating(GenerateDISyncTaskConfigForUpdatingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateDISyncTaskConfigForUpdating").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateDISyncTaskConfigForUpdatingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateDISyncTaskConfigForUpdatingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlertMessage  GetAlertMessageRequest
     * @return GetAlertMessageResponse
     */
    @Override
    public CompletableFuture<GetAlertMessageResponse> getAlertMessage(GetAlertMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAlertMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlertMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlertMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBaseline  GetBaselineRequest
     * @return GetBaselineResponse
     */
    @Override
    public CompletableFuture<GetBaselineResponse> getBaseline(GetBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBaselineConfig  GetBaselineConfigRequest
     * @return GetBaselineConfigResponse
     */
    @Override
    public CompletableFuture<GetBaselineConfigResponse> getBaselineConfig(GetBaselineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBaselineConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBaselineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBaselineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBaselineKeyPath  GetBaselineKeyPathRequest
     * @return GetBaselineKeyPathResponse
     */
    @Override
    public CompletableFuture<GetBaselineKeyPathResponse> getBaselineKeyPath(GetBaselineKeyPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBaselineKeyPath").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBaselineKeyPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBaselineKeyPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBaselineStatus  GetBaselineStatusRequest
     * @return GetBaselineStatusResponse
     */
    @Override
    public CompletableFuture<GetBaselineStatusResponse> getBaselineStatus(GetBaselineStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBaselineStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBaselineStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBaselineStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBusiness  GetBusinessRequest
     * @return GetBusinessResponse
     */
    @Override
    public CompletableFuture<GetBusinessResponse> getBusiness(GetBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDDLJobStatus  GetDDLJobStatusRequest
     * @return GetDDLJobStatusResponse
     */
    @Override
    public CompletableFuture<GetDDLJobStatusResponse> getDDLJobStatus(GetDDLJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDDLJobStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDDLJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDDLJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization.</p>
     * 
     * @param request the request parameters of GetDIAlarmRule  GetDIAlarmRuleRequest
     * @return GetDIAlarmRuleResponse
     */
    @Override
    public CompletableFuture<GetDIAlarmRuleResponse> getDIAlarmRule(GetDIAlarmRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDIAlarmRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDIAlarmRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDIAlarmRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDIJob  GetDIJobRequest
     * @return GetDIJobResponse
     */
    @Override
    public CompletableFuture<GetDIJobResponse> getDIJob(GetDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDISyncInstanceInfo  GetDISyncInstanceInfoRequest
     * @return GetDISyncInstanceInfoResponse
     */
    @Override
    public CompletableFuture<GetDISyncInstanceInfoResponse> getDISyncInstanceInfo(GetDISyncInstanceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDISyncInstanceInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDISyncInstanceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDISyncInstanceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDISyncTask  GetDISyncTaskRequest
     * @return GetDISyncTaskResponse
     */
    @Override
    public CompletableFuture<GetDISyncTaskResponse> getDISyncTask(GetDISyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDISyncTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDISyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDISyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Supported DAG types:</p>
     * <ul>
     * <li>MANUAL: DAG for a manually triggered workflow</li>
     * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
     * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
     * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow
     * Supported DAG states:</li>
     * <li>CREATED</li>
     * <li>RUNNING</li>
     * <li>FAILURE</li>
     * <li>SUCCESS</li>
     * </ul>
     * 
     * @param request the request parameters of GetDag  GetDagRequest
     * @return GetDagResponse
     */
    @Override
    public CompletableFuture<GetDagResponse> getDag(GetDagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceApi  GetDataServiceApiRequest
     * @return GetDataServiceApiResponse
     */
    @Override
    public CompletableFuture<GetDataServiceApiResponse> getDataServiceApi(GetDataServiceApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceApiTest  GetDataServiceApiTestRequest
     * @return GetDataServiceApiTestResponse
     */
    @Override
    public CompletableFuture<GetDataServiceApiTestResponse> getDataServiceApiTest(GetDataServiceApiTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceApiTest").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceApiTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceApiTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceApplication  GetDataServiceApplicationRequest
     * @return GetDataServiceApplicationResponse
     */
    @Override
    public CompletableFuture<GetDataServiceApplicationResponse> getDataServiceApplication(GetDataServiceApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceFolder  GetDataServiceFolderRequest
     * @return GetDataServiceFolderResponse
     */
    @Override
    public CompletableFuture<GetDataServiceFolderResponse> getDataServiceFolder(GetDataServiceFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceGroup  GetDataServiceGroupRequest
     * @return GetDataServiceGroupResponse
     */
    @Override
    public CompletableFuture<GetDataServiceGroupResponse> getDataServiceGroup(GetDataServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServicePublishedApi  GetDataServicePublishedApiRequest
     * @return GetDataServicePublishedApiResponse
     */
    @Override
    public CompletableFuture<GetDataServicePublishedApiResponse> getDataServicePublishedApi(GetDataServicePublishedApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServicePublishedApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServicePublishedApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServicePublishedApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataSourceMeta  GetDataSourceMetaRequest
     * @return GetDataSourceMetaResponse
     */
    @Override
    public CompletableFuture<GetDataSourceMetaResponse> getDataSourceMeta(GetDataSourceMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataSourceMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataSourceMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataSourceMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeployment  GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    @Override
    public CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExtension  GetExtensionRequest
     * @return GetExtensionResponse
     */
    @Override
    public CompletableFuture<GetExtensionResponse> getExtension(GetExtensionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetExtension").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExtensionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExtensionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFile  GetFileRequest
     * @return GetFileResponse
     */
    @Override
    public CompletableFuture<GetFileResponse> getFile(GetFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileTypeStatistic  GetFileTypeStatisticRequest
     * @return GetFileTypeStatisticResponse
     */
    @Override
    public CompletableFuture<GetFileTypeStatisticResponse> getFileTypeStatistic(GetFileTypeStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileTypeStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileTypeStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileTypeStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileVersion  GetFileVersionRequest
     * @return GetFileVersionResponse
     */
    @Override
    public CompletableFuture<GetFileVersionResponse> getFileVersion(GetFileVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFolder  GetFolderRequest
     * @return GetFolderResponse
     */
    @Override
    public CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIDEEventDetail  GetIDEEventDetailRequest
     * @return GetIDEEventDetailResponse
     */
    @Override
    public CompletableFuture<GetIDEEventDetailResponse> getIDEEventDetail(GetIDEEventDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIDEEventDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIDEEventDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIDEEventDetailResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetInstanceConsumeTimeRank is deprecated  * @param request  the request parameters of GetInstanceConsumeTimeRank  GetInstanceConsumeTimeRankRequest
     * @return GetInstanceConsumeTimeRankResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetInstanceConsumeTimeRankResponse> getInstanceConsumeTimeRank(GetInstanceConsumeTimeRankRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceConsumeTimeRank").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceConsumeTimeRankResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceConsumeTimeRankResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetInstanceCountTrend is deprecated  * @param request  the request parameters of GetInstanceCountTrend  GetInstanceCountTrendRequest
     * @return GetInstanceCountTrendResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetInstanceCountTrendResponse> getInstanceCountTrend(GetInstanceCountTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceCountTrend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceCountTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceCountTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetInstanceErrorRank is deprecated  * @param request  the request parameters of GetInstanceErrorRank  GetInstanceErrorRankRequest
     * @return GetInstanceErrorRankResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetInstanceErrorRankResponse> getInstanceErrorRank(GetInstanceErrorRankRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceErrorRank").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceErrorRankResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceErrorRankResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You may not obtain the instance logs that were generated more than seven days ago.</p>
     * 
     * @param request the request parameters of GetInstanceLog  GetInstanceLogRequest
     * @return GetInstanceLogResponse
     */
    @Override
    public CompletableFuture<GetInstanceLogResponse> getInstanceLog(GetInstanceLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetInstanceStatusCount is deprecated  * @param request  the request parameters of GetInstanceStatusCount  GetInstanceStatusCountRequest
     * @return GetInstanceStatusCountResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetInstanceStatusCountResponse> getInstanceStatusCount(GetInstanceStatusCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceStatusCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceStatusCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceStatusCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceStatusStatistic  GetInstanceStatusStatisticRequest
     * @return GetInstanceStatusStatisticResponse
     */
    @Override
    public CompletableFuture<GetInstanceStatusStatisticResponse> getInstanceStatusStatistic(GetInstanceStatusStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceStatusStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceStatusStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceStatusStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetManualDagInstances is deprecated  * @param request  the request parameters of GetManualDagInstances  GetManualDagInstancesRequest
     * @return GetManualDagInstancesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetManualDagInstancesResponse> getManualDagInstances(GetManualDagInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetManualDagInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetManualDagInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetManualDagInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaCategory  GetMetaCategoryRequest
     * @return GetMetaCategoryResponse
     */
    @Override
    public CompletableFuture<GetMetaCategoryResponse> getMetaCategory(GetMetaCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaCollectionDetail  GetMetaCollectionDetailRequest
     * @return GetMetaCollectionDetailResponse
     */
    @Override
    public CompletableFuture<GetMetaCollectionDetailResponse> getMetaCollectionDetail(GetMetaCollectionDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaCollectionDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaCollectionDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaCollectionDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaColumnLineage  GetMetaColumnLineageRequest
     * @return GetMetaColumnLineageResponse
     */
    @Override
    public CompletableFuture<GetMetaColumnLineageResponse> getMetaColumnLineage(GetMetaColumnLineageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaColumnLineage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaColumnLineageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaColumnLineageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.
     * You can log on to the <a href="https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou">EMR console</a> to obtain the ID of the EMR cluster.</p>
     * 
     * @param request the request parameters of GetMetaDBInfo  GetMetaDBInfoRequest
     * @return GetMetaDBInfoResponse
     */
    @Override
    public CompletableFuture<GetMetaDBInfoResponse> getMetaDBInfo(GetMetaDBInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaDBInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaDBInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaDBInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaDBTableList  GetMetaDBTableListRequest
     * @return GetMetaDBTableListResponse
     */
    @Override
    public CompletableFuture<GetMetaDBTableListResponse> getMetaDBTableList(GetMetaDBTableListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaDBTableList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaDBTableListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaDBTableListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaTableBasicInfo  GetMetaTableBasicInfoRequest
     * @return GetMetaTableBasicInfoResponse
     */
    @Override
    public CompletableFuture<GetMetaTableBasicInfoResponse> getMetaTableBasicInfo(GetMetaTableBasicInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableBasicInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableBasicInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableBasicInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetMetaTableChangeLog  GetMetaTableChangeLogRequest
     * @return GetMetaTableChangeLogResponse
     */
    @Override
    public CompletableFuture<GetMetaTableChangeLogResponse> getMetaTableChangeLog(GetMetaTableChangeLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableChangeLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableChangeLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableChangeLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaTableColumn  GetMetaTableColumnRequest
     * @return GetMetaTableColumnResponse
     */
    @Override
    public CompletableFuture<GetMetaTableColumnResponse> getMetaTableColumn(GetMetaTableColumnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableColumn").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableColumnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableColumnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about a table of the E-MapReduce (EMR) compute engine type.</p>
     * 
     * @param request the request parameters of GetMetaTableFullInfo  GetMetaTableFullInfoRequest
     * @return GetMetaTableFullInfoResponse
     */
    @Override
    public CompletableFuture<GetMetaTableFullInfoResponse> getMetaTableFullInfo(GetMetaTableFullInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableFullInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableFullInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableFullInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaTableIntroWiki  GetMetaTableIntroWikiRequest
     * @return GetMetaTableIntroWikiResponse
     */
    @Override
    public CompletableFuture<GetMetaTableIntroWikiResponse> getMetaTableIntroWiki(GetMetaTableIntroWikiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableIntroWiki").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableIntroWikiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableIntroWikiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaTableLineage  GetMetaTableLineageRequest
     * @return GetMetaTableLineageResponse
     */
    @Override
    public CompletableFuture<GetMetaTableLineageResponse> getMetaTableLineage(GetMetaTableLineageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableLineage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableLineageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableLineageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaTableListByCategory  GetMetaTableListByCategoryRequest
     * @return GetMetaTableListByCategoryResponse
     */
    @Override
    public CompletableFuture<GetMetaTableListByCategoryResponse> getMetaTableListByCategory(GetMetaTableListByCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableListByCategory").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableListByCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableListByCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaTableOutput  GetMetaTableOutputRequest
     * @return GetMetaTableOutputResponse
     */
    @Override
    public CompletableFuture<GetMetaTableOutputResponse> getMetaTableOutput(GetMetaTableOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableOutput").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableOutputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableOutputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the partitions of a metatable in a MaxCompute or E-MapReduce (EMR) compute engine. If you query partitions of a metatable in an EMR compute engine, only DataLake clusters that use Data Lake Formation (DLF) to manage metadata and Hadoop clusters whose cluster version is earlier than 3.41.0 or 5.7.0 are supported.</p>
     * 
     * @param request the request parameters of GetMetaTablePartition  GetMetaTablePartitionRequest
     * @return GetMetaTablePartitionResponse
     */
    @Override
    public CompletableFuture<GetMetaTablePartitionResponse> getMetaTablePartition(GetMetaTablePartitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTablePartition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTablePartitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTablePartitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaTableProducingTasks  GetMetaTableProducingTasksRequest
     * @return GetMetaTableProducingTasksResponse
     */
    @Override
    public CompletableFuture<GetMetaTableProducingTasksResponse> getMetaTableProducingTasks(GetMetaTableProducingTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableProducingTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableProducingTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableProducingTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaTableThemeLevel  GetMetaTableThemeLevelRequest
     * @return GetMetaTableThemeLevelResponse
     */
    @Override
    public CompletableFuture<GetMetaTableThemeLevelResponse> getMetaTableThemeLevel(GetMetaTableThemeLevelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaTableThemeLevel").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaTableThemeLevelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaTableThemeLevelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMigrationProcess  GetMigrationProcessRequest
     * @return GetMigrationProcessResponse
     */
    @Override
    public CompletableFuture<GetMigrationProcessResponse> getMigrationProcess(GetMigrationProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMigrationProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMigrationProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMigrationProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMigrationSummary  GetMigrationSummaryRequest
     * @return GetMigrationSummaryResponse
     */
    @Override
    public CompletableFuture<GetMigrationSummaryResponse> getMigrationSummary(GetMigrationSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMigrationSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMigrationSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMigrationSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNode  GetNodeRequest
     * @return GetNodeResponse
     */
    @Override
    public CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodeChildren  GetNodeChildrenRequest
     * @return GetNodeChildrenResponse
     */
    @Override
    public CompletableFuture<GetNodeChildrenResponse> getNodeChildren(GetNodeChildrenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNodeChildren").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeChildrenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeChildrenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodeCode  GetNodeCodeRequest
     * @return GetNodeCodeResponse
     */
    @Override
    public CompletableFuture<GetNodeCodeResponse> getNodeCode(GetNodeCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNodeCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetNodeOnBaseline is deprecated  * @param request  the request parameters of GetNodeOnBaseline  GetNodeOnBaselineRequest
     * @return GetNodeOnBaselineResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetNodeOnBaselineResponse> getNodeOnBaseline(GetNodeOnBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNodeOnBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeOnBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeOnBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodeParents  GetNodeParentsRequest
     * @return GetNodeParentsResponse
     */
    @Override
    public CompletableFuture<GetNodeParentsResponse> getNodeParents(GetNodeParentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNodeParents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeParentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeParentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetNodeTypeListInfo is deprecated  * @param request  the request parameters of GetNodeTypeListInfo  GetNodeTypeListInfoRequest
     * @return GetNodeTypeListInfoResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetNodeTypeListInfoResponse> getNodeTypeListInfo(GetNodeTypeListInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNodeTypeListInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeTypeListInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeTypeListInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpRiskData  GetOpRiskDataRequest
     * @return GetOpRiskDataResponse
     */
    @Override
    public CompletableFuture<GetOpRiskDataResponse> getOpRiskData(GetOpRiskDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpRiskData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpRiskDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpRiskDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpSensitiveData  GetOpSensitiveDataRequest
     * @return GetOpSensitiveDataResponse
     */
    @Override
    public CompletableFuture<GetOpSensitiveDataResponse> getOpSensitiveData(GetOpSensitiveDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpSensitiveData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpSensitiveDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpSensitiveDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOptionValueForProject  GetOptionValueForProjectRequest
     * @return GetOptionValueForProjectResponse
     */
    @Override
    public CompletableFuture<GetOptionValueForProjectResponse> getOptionValueForProject(GetOptionValueForProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOptionValueForProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOptionValueForProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOptionValueForProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPermissionApplyOrderDetail  GetPermissionApplyOrderDetailRequest
     * @return GetPermissionApplyOrderDetailResponse
     */
    @Override
    public CompletableFuture<GetPermissionApplyOrderDetailResponse> getPermissionApplyOrderDetail(GetPermissionApplyOrderDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPermissionApplyOrderDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPermissionApplyOrderDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPermissionApplyOrderDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    @Override
    public CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetProjectDetail is deprecated  * @param request  the request parameters of GetProjectDetail  GetProjectDetailRequest
     * @return GetProjectDetailResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetProjectDetailResponse> getProjectDetail(GetProjectDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProjectDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityEntity  GetQualityEntityRequest
     * @return GetQualityEntityResponse
     */
    @Override
    public CompletableFuture<GetQualityEntityResponse> getQualityEntity(GetQualityEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityFollower  GetQualityFollowerRequest
     * @return GetQualityFollowerResponse
     */
    @Override
    public CompletableFuture<GetQualityFollowerResponse> getQualityFollower(GetQualityFollowerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityFollower").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityFollowerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityFollowerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityRule  GetQualityRuleRequest
     * @return GetQualityRuleResponse
     */
    @Override
    public CompletableFuture<GetQualityRuleResponse> getQualityRule(GetQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=dataworks-public%5C&api=GetRemind%5C&type=RPC%5C&version=2020-05-18">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of GetRemind  GetRemindRequest
     * @return GetRemindResponse
     */
    @Override
    public CompletableFuture<GetRemindResponse> getRemind(GetRemindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRemind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRemindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRemindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSensitiveData  GetSensitiveDataRequest
     * @return GetSensitiveDataResponse
     */
    @Override
    public CompletableFuture<GetSensitiveDataResponse> getSensitiveData(GetSensitiveDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSensitiveData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSensitiveDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSensitiveDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetSuccessInstanceTrend is deprecated  * @param request  the request parameters of GetSuccessInstanceTrend  GetSuccessInstanceTrendRequest
     * @return GetSuccessInstanceTrendResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetSuccessInstanceTrendResponse> getSuccessInstanceTrend(GetSuccessInstanceTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSuccessInstanceTrend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSuccessInstanceTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSuccessInstanceTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of GetTopic  GetTopicRequest
     * @return GetTopicResponse
     */
    @Override
    public CompletableFuture<GetTopicResponse> getTopic(GetTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTopic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=dataworks-public%5C&api=GetTopicInfluence%5C&type=RPC%5C&version=2020-05-18">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of GetTopicInfluence  GetTopicInfluenceRequest
     * @return GetTopicInfluenceResponse
     */
    @Override
    public CompletableFuture<GetTopicInfluenceResponse> getTopicInfluence(GetTopicInfluenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTopicInfluence").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTopicInfluenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTopicInfluenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can import self-managed data sources or data sources that are exported from other DataWorks workspaces to a specific DataWorks workspace.</p>
     * <ul>
     * <li>To import a self-managed data source to a DataWorks workspace, the data source type must be supported by DataWorks. For more information about the types of data sources supported by DataWorks, see <a href="https://help.aliyun.com/document_detail/181656.html">Supported data stores</a>.</li>
     * <li>For more information about how to export data sources from DataWorks workspaces to your on-premises machine, see <a href="https://help.aliyun.com/document_detail/279570.html">ExportDataSources</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportDataSources  ImportDataSourcesRequest
     * @return ImportDataSourcesResponse
     */
    @Override
    public CompletableFuture<ImportDataSourcesResponse> importDataSources(ImportDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportDataSources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlertMessages  ListAlertMessagesRequest
     * @return ListAlertMessagesResponse
     */
    @Override
    public CompletableFuture<ListAlertMessagesResponse> listAlertMessages(ListAlertMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAlertMessages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlertMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlertMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBaselineConfigs  ListBaselineConfigsRequest
     * @return ListBaselineConfigsResponse
     */
    @Override
    public CompletableFuture<ListBaselineConfigsResponse> listBaselineConfigs(ListBaselineConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBaselineConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBaselineConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBaselineConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBaselineStatuses  ListBaselineStatusesRequest
     * @return ListBaselineStatusesResponse
     */
    @Override
    public CompletableFuture<ListBaselineStatusesResponse> listBaselineStatuses(ListBaselineStatusesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBaselineStatuses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBaselineStatusesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBaselineStatusesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBaselines  ListBaselinesRequest
     * @return ListBaselinesResponse
     */
    @Override
    public CompletableFuture<ListBaselinesResponse> listBaselines(ListBaselinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBaselines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBaselinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBaselinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBusiness  ListBusinessRequest
     * @return ListBusinessResponse
     */
    @Override
    public CompletableFuture<ListBusinessResponse> listBusiness(ListBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCalcEngines  ListCalcEnginesRequest
     * @return ListCalcEnginesResponse
     */
    @Override
    public CompletableFuture<ListCalcEnginesResponse> listCalcEngines(ListCalcEnginesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCalcEngines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCalcEnginesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCalcEnginesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCheckProcesses  ListCheckProcessesRequest
     * @return ListCheckProcessesResponse
     */
    @Override
    public CompletableFuture<ListCheckProcessesResponse> listCheckProcesses(ListCheckProcessesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCheckProcesses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCheckProcessesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCheckProcessesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterConfigs  ListClusterConfigsRequest
     * @return ListClusterConfigsResponse
     */
    @Override
    public CompletableFuture<ListClusterConfigsResponse> listClusterConfigs(ListClusterConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClusterConfigs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    @Override
    public CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClusters").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListConnections is deprecated  * @param request  the request parameters of ListConnections  ListConnectionsRequest
     * @return ListConnectionsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListConnectionsResponse> listConnections(ListConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListConnections").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization.</p>
     * 
     * @param request the request parameters of ListDIAlarmRules  ListDIAlarmRulesRequest
     * @return ListDIAlarmRulesResponse
     */
    @Override
    public CompletableFuture<ListDIAlarmRulesResponse> listDIAlarmRules(ListDIAlarmRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDIAlarmRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDIAlarmRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDIAlarmRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to obtain only the basic information about the tasks. If you want to obtain the details of a task, call the GetDIJob operation.</p>
     * 
     * @param request the request parameters of ListDIJobs  ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    @Override
    public CompletableFuture<ListDIJobsResponse> listDIJobs(ListDIJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDIJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDIJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDIJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the <strong>processing rules of DDL messages</strong> in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization tasks in the solutions. You can modify the <strong>processing rules of DDL messages</strong> based on your business requirements. For more information about how to configure a synchronization solution, see <a href="https://help.aliyun.com/document_detail/199008.html">Synchronization solutions</a>.</p>
     * 
     * @param request the request parameters of ListDIProjectConfig  ListDIProjectConfigRequest
     * @return ListDIProjectConfigResponse
     */
    @Override
    public CompletableFuture<ListDIProjectConfigResponse> listDIProjectConfig(ListDIProjectConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDIProjectConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDIProjectConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDIProjectConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Supported DAG types:</p>
     * <ul>
     * <li>MANUAL: DAG for a manually triggered workflow</li>
     * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
     * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
     * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow
     * Supported DAG states:</li>
     * <li>CREATED: The DAG is created.</li>
     * <li>RUNNING: The DAG is running.</li>
     * <li>FAILURE: The DAG fails to run.</li>
     * <li>SUCCESS: The DAG is successfully run.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDags  ListDagsRequest
     * @return ListDagsResponse
     */
    @Override
    public CompletableFuture<ListDagsResponse> listDags(ListDagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataServiceApiAuthorities  ListDataServiceApiAuthoritiesRequest
     * @return ListDataServiceApiAuthoritiesResponse
     */
    @Override
    public CompletableFuture<ListDataServiceApiAuthoritiesResponse> listDataServiceApiAuthorities(ListDataServiceApiAuthoritiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataServiceApiAuthorities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataServiceApiAuthoritiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataServiceApiAuthoritiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataServiceApiTest  ListDataServiceApiTestRequest
     * @return ListDataServiceApiTestResponse
     */
    @Override
    public CompletableFuture<ListDataServiceApiTestResponse> listDataServiceApiTest(ListDataServiceApiTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataServiceApiTest").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataServiceApiTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataServiceApiTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataServiceApis  ListDataServiceApisRequest
     * @return ListDataServiceApisResponse
     */
    @Override
    public CompletableFuture<ListDataServiceApisResponse> listDataServiceApis(ListDataServiceApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataServiceApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataServiceApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataServiceApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataServiceApplications  ListDataServiceApplicationsRequest
     * @return ListDataServiceApplicationsResponse
     */
    @Override
    public CompletableFuture<ListDataServiceApplicationsResponse> listDataServiceApplications(ListDataServiceApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataServiceApplications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataServiceApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataServiceApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataServiceAuthorizedApis  ListDataServiceAuthorizedApisRequest
     * @return ListDataServiceAuthorizedApisResponse
     */
    @Override
    public CompletableFuture<ListDataServiceAuthorizedApisResponse> listDataServiceAuthorizedApis(ListDataServiceAuthorizedApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataServiceAuthorizedApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataServiceAuthorizedApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataServiceAuthorizedApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataServiceFolders  ListDataServiceFoldersRequest
     * @return ListDataServiceFoldersResponse
     */
    @Override
    public CompletableFuture<ListDataServiceFoldersResponse> listDataServiceFolders(ListDataServiceFoldersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataServiceFolders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataServiceFoldersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataServiceFoldersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataServiceGroups  ListDataServiceGroupsRequest
     * @return ListDataServiceGroupsResponse
     */
    @Override
    public CompletableFuture<ListDataServiceGroupsResponse> listDataServiceGroups(ListDataServiceGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataServiceGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataServiceGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataServiceGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataServicePublishedApis  ListDataServicePublishedApisRequest
     * @return ListDataServicePublishedApisResponse
     */
    @Override
    public CompletableFuture<ListDataServicePublishedApisResponse> listDataServicePublishedApis(ListDataServicePublishedApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataServicePublishedApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataServicePublishedApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataServicePublishedApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    @Override
    public CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSources").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeployments  ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    @Override
    public CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDeployments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeploymentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeploymentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For information about codes of extension point events, see <a href="https://help.aliyun.com/document_detail/463357.html">Development references: Extension point event codes</a>.</p>
     * 
     * @param request the request parameters of ListEnabledExtensionsForProject  ListEnabledExtensionsForProjectRequest
     * @return ListEnabledExtensionsForProjectResponse
     */
    @Override
    public CompletableFuture<ListEnabledExtensionsForProjectResponse> listEnabledExtensionsForProject(ListEnabledExtensionsForProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEnabledExtensionsForProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnabledExtensionsForProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnabledExtensionsForProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEntitiesByTags  ListEntitiesByTagsRequest
     * @return ListEntitiesByTagsResponse
     */
    @Override
    public CompletableFuture<ListEntitiesByTagsResponse> listEntitiesByTags(ListEntitiesByTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEntitiesByTags").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEntitiesByTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEntitiesByTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEntityTags  ListEntityTagsRequest
     * @return ListEntityTagsResponse
     */
    @Override
    public CompletableFuture<ListEntityTagsResponse> listEntityTags(ListEntityTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEntityTags").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEntityTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEntityTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExtensions  ListExtensionsRequest
     * @return ListExtensionsResponse
     */
    @Override
    public CompletableFuture<ListExtensionsResponse> listExtensions(ListExtensionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListExtensions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExtensionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExtensionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFileType  ListFileTypeRequest
     * @return ListFileTypeResponse
     */
    @Override
    public CompletableFuture<ListFileTypeResponse> listFileType(ListFileTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFileType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFileTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFileTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFileVersions  ListFileVersionsRequest
     * @return ListFileVersionsResponse
     */
    @Override
    public CompletableFuture<ListFileVersionsResponse> listFileVersions(ListFileVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFileVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFileVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFileVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFiles  ListFilesRequest
     * @return ListFilesResponse
     */
    @Override
    public CompletableFuture<ListFilesResponse> listFiles(ListFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFolders  ListFoldersRequest
     * @return ListFoldersResponse
     */
    @Override
    public CompletableFuture<ListFoldersResponse> listFolders(ListFoldersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFolders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFoldersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFoldersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInnerNodes  ListInnerNodesRequest
     * @return ListInnerNodesResponse
     */
    @Override
    public CompletableFuture<ListInnerNodesResponse> listInnerNodes(ListInnerNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInnerNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInnerNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInnerNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceAmount  ListInstanceAmountRequest
     * @return ListInstanceAmountResponse
     */
    @Override
    public CompletableFuture<ListInstanceAmountResponse> listInstanceAmount(ListInstanceAmountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstanceAmount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceAmountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceAmountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceHistory  ListInstanceHistoryRequest
     * @return ListInstanceHistoryResponse
     */
    @Override
    public CompletableFuture<ListInstanceHistoryResponse> listInstanceHistory(ListInstanceHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstanceHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceHistoryResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLineage  ListLineageRequest
     * @return ListLineageResponse
     */
    @Override
    public CompletableFuture<ListLineageResponse> listLineage(ListLineageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLineage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLineageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLineageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListManualDagInstances  ListManualDagInstancesRequest
     * @return ListManualDagInstancesResponse
     */
    @Override
    public CompletableFuture<ListManualDagInstancesResponse> listManualDagInstances(ListManualDagInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListManualDagInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListManualDagInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListManualDagInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMeasureData  ListMeasureDataRequest
     * @return ListMeasureDataResponse
     */
    @Override
    public CompletableFuture<ListMeasureDataResponse> listMeasureData(ListMeasureDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMeasureData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMeasureDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMeasureDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMetaCollectionEntities  ListMetaCollectionEntitiesRequest
     * @return ListMetaCollectionEntitiesResponse
     */
    @Override
    public CompletableFuture<ListMetaCollectionEntitiesResponse> listMetaCollectionEntities(ListMetaCollectionEntitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMetaCollectionEntities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMetaCollectionEntitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMetaCollectionEntitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The type can be ALBUM or ALBUM_CATEGORY. ALBUM indicates data albums. ALBUM_CATEGORY indicates categories.</p>
     * 
     * @param request the request parameters of ListMetaCollections  ListMetaCollectionsRequest
     * @return ListMetaCollectionsResponse
     */
    @Override
    public CompletableFuture<ListMetaCollectionsResponse> listMetaCollections(ListMetaCollectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMetaCollections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMetaCollectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMetaCollectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMetaDB  ListMetaDBRequest
     * @return ListMetaDBResponse
     */
    @Override
    public CompletableFuture<ListMetaDBResponse> listMetaDB(ListMetaDBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMetaDB").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMetaDBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMetaDBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMigrations  ListMigrationsRequest
     * @return ListMigrationsResponse
     */
    @Override
    public CompletableFuture<ListMigrationsResponse> listMigrations(ListMigrationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMigrations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMigrationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMigrationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListNodeIO is deprecated  * @param request  the request parameters of ListNodeIO  ListNodeIORequest
     * @return ListNodeIOResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListNodeIOResponse> listNodeIO(ListNodeIORequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodeIO").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodeIOResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodeIOResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodeInputOrOutput  ListNodeInputOrOutputRequest
     * @return ListNodeInputOrOutputResponse
     */
    @Override
    public CompletableFuture<ListNodeInputOrOutputResponse> listNodeInputOrOutput(ListNodeInputOrOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodeInputOrOutput").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodeInputOrOutputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodeInputOrOutputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    @Override
    public CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodesByBaseline  ListNodesByBaselineRequest
     * @return ListNodesByBaselineResponse
     */
    @Override
    public CompletableFuture<ListNodesByBaselineResponse> listNodesByBaseline(ListNodesByBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodesByBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodesByBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodesByBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodesByOutput  ListNodesByOutputRequest
     * @return ListNodesByOutputResponse
     */
    @Override
    public CompletableFuture<ListNodesByOutputResponse> listNodesByOutput(ListNodesByOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodesByOutput").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodesByOutputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodesByOutputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPermissionApplyOrders  ListPermissionApplyOrdersRequest
     * @return ListPermissionApplyOrdersResponse
     */
    @Override
    public CompletableFuture<ListPermissionApplyOrdersResponse> listPermissionApplyOrders(ListPermissionApplyOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPermissionApplyOrders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPermissionApplyOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPermissionApplyOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListProgramTypeCount is deprecated  * @param request  the request parameters of ListProgramTypeCount  ListProgramTypeCountRequest
     * @return ListProgramTypeCountResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListProgramTypeCountResponse> listProgramTypeCount(ListProgramTypeCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProgramTypeCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProgramTypeCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProgramTypeCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>An Alibaba Cloud account can assume a role such as the developer, O\&amp;M engineer, or workspace administrator role in a workspace. For more information, see <a href="https://help.aliyun.com/document_detail/136941.html">Manage members and roles</a>.</p>
     * 
     * @param request the request parameters of ListProjectIds  ListProjectIdsRequest
     * @return ListProjectIdsResponse
     */
    @Override
    public CompletableFuture<ListProjectIdsResponse> listProjectIds(ListProjectIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProjectIds").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjectMembers  ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    @Override
    public CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProjectMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=dataworks-public%5C&api=ListProjectRoles%5C&type=RPC%5C&version=2020-05-18">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of ListProjectRoles  ListProjectRolesRequest
     * @return ListProjectRolesResponse
     */
    @Override
    public CompletableFuture<ListProjectRolesResponse> listProjectRoles(ListProjectRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProjectRoles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    @Override
    public CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProjects").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ListQualityResultsByEntity  ListQualityResultsByEntityRequest
     * @return ListQualityResultsByEntityResponse
     */
    @Override
    public CompletableFuture<ListQualityResultsByEntityResponse> listQualityResultsByEntity(ListQualityResultsByEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQualityResultsByEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQualityResultsByEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQualityResultsByEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQualityResultsByRule  ListQualityResultsByRuleRequest
     * @return ListQualityResultsByRuleResponse
     */
    @Override
    public CompletableFuture<ListQualityResultsByRuleResponse> listQualityResultsByRule(ListQualityResultsByRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQualityResultsByRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQualityResultsByRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQualityResultsByRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQualityRules  ListQualityRulesRequest
     * @return ListQualityRulesResponse
     */
    @Override
    public CompletableFuture<ListQualityRulesResponse> listQualityRules(ListQualityRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQualityRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQualityRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQualityRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRefDISyncTasks  ListRefDISyncTasksRequest
     * @return ListRefDISyncTasksResponse
     */
    @Override
    public CompletableFuture<ListRefDISyncTasksResponse> listRefDISyncTasks(ListRefDISyncTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRefDISyncTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRefDISyncTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRefDISyncTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListReminds  ListRemindsRequest
     * @return ListRemindsResponse
     */
    @Override
    public CompletableFuture<ListRemindsResponse> listReminds(ListRemindsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListReminds").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRemindsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRemindsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    @Override
    public CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListShiftPersonnels  ListShiftPersonnelsRequest
     * @return ListShiftPersonnelsResponse
     */
    @Override
    public CompletableFuture<ListShiftPersonnelsResponse> listShiftPersonnels(ListShiftPersonnelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListShiftPersonnels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListShiftPersonnelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListShiftPersonnelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListShiftSchedules  ListShiftSchedulesRequest
     * @return ListShiftSchedulesResponse
     */
    @Override
    public CompletableFuture<ListShiftSchedulesResponse> listShiftSchedules(ListShiftSchedulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListShiftSchedules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListShiftSchedulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListShiftSchedulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSuccessInstanceAmount  ListSuccessInstanceAmountRequest
     * @return ListSuccessInstanceAmountResponse
     */
    @Override
    public CompletableFuture<ListSuccessInstanceAmountResponse> listSuccessInstanceAmount(ListSuccessInstanceAmountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSuccessInstanceAmount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSuccessInstanceAmountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSuccessInstanceAmountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTableLevel  ListTableLevelRequest
     * @return ListTableLevelResponse
     */
    @Override
    public CompletableFuture<ListTableLevelResponse> listTableLevel(ListTableLevelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTableLevel").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTableLevelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTableLevelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTableTheme  ListTableThemeRequest
     * @return ListTableThemeResponse
     */
    @Override
    public CompletableFuture<ListTableThemeResponse> listTableTheme(ListTableThemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTableTheme").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTableThemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTableThemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    @Override
    public CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTopics  ListTopicsRequest
     * @return ListTopicsResponse
     */
    @Override
    public CompletableFuture<ListTopicsResponse> listTopics(ListTopicsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTopics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTopicsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTopicsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MountDirectory  MountDirectoryRequest
     * @return MountDirectoryResponse
     */
    @Override
    public CompletableFuture<MountDirectoryResponse> mountDirectory(MountDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MountDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MountDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MountDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OfflineNode  OfflineNodeRequest
     * @return OfflineNodeResponse
     */
    @Override
    public CompletableFuture<OfflineNodeResponse> offlineNode(OfflineNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OfflineNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishDataServiceApi  PublishDataServiceApiRequest
     * @return PublishDataServiceApiResponse
     */
    @Override
    public CompletableFuture<PublishDataServiceApiResponse> publishDataServiceApi(PublishDataServiceApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishDataServiceApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishDataServiceApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishDataServiceApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to call only the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to create a batch synchronization task or the <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to update a batch synchronization task in Data Integration. To create or update a real-time synchronization task, you must first call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a> or <a href="https://help.aliyun.com/document_detail/383464.html">GenerateDISyncTaskConfigForUpdating</a> operation to obtain the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the CreateDISyncTask or UpdateDISyncTask operation and use the parameters as request parameters to create or update a real-time synchronization task. DataWorks allows you to create or update real-time synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * @param request the request parameters of QueryDISyncTaskConfigProcessResult  QueryDISyncTaskConfigProcessResultRequest
     * @return QueryDISyncTaskConfigProcessResultResponse
     */
    @Override
    public CompletableFuture<QueryDISyncTaskConfigProcessResultResponse> queryDISyncTaskConfigProcessResult(QueryDISyncTaskConfigProcessResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDISyncTaskConfigProcessResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDISyncTaskConfigProcessResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDISyncTaskConfigProcessResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDefaultTemplate  QueryDefaultTemplateRequest
     * @return QueryDefaultTemplateResponse
     */
    @Override
    public CompletableFuture<QueryDefaultTemplateResponse> queryDefaultTemplate(QueryDefaultTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDefaultTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDefaultTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDefaultTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Each time you call this API operation, you must use FML statements to query information about objects that are created in Data Modeling.</p>
     * <ul>
     * <li>The information about the objects can be queried by page, except for data layers, business processes, and data domains. You can add an offset to the end of an FML statement. The num LIMIT num statement specifies the offset when the information about the objects is queried, and the number of pages to return each time. The offset value must be a multiple of the number of pages.</li>
     * <li>A maximum of 1,000 entries can be returned each time you call this API operation.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryPublicModelEngine  QueryPublicModelEngineRequest
     * @return QueryPublicModelEngineResponse
     */
    @Override
    public CompletableFuture<QueryPublicModelEngineResponse> queryPublicModelEngine(QueryPublicModelEngineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPublicModelEngine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPublicModelEngineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPublicModelEngineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecognizeDataByRuleType  QueryRecognizeDataByRuleTypeRequest
     * @return QueryRecognizeDataByRuleTypeResponse
     */
    @Override
    public CompletableFuture<QueryRecognizeDataByRuleTypeResponse> queryRecognizeDataByRuleType(QueryRecognizeDataByRuleTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecognizeDataByRuleType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecognizeDataByRuleTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecognizeDataByRuleTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecognizeRuleDetail  QueryRecognizeRuleDetailRequest
     * @return QueryRecognizeRuleDetailResponse
     */
    @Override
    public CompletableFuture<QueryRecognizeRuleDetailResponse> queryRecognizeRuleDetail(QueryRecognizeRuleDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecognizeRuleDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecognizeRuleDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecognizeRuleDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecognizeRulesType  QueryRecognizeRulesTypeRequest
     * @return QueryRecognizeRulesTypeResponse
     */
    @Override
    public CompletableFuture<QueryRecognizeRulesTypeResponse> queryRecognizeRulesType(QueryRecognizeRulesTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecognizeRulesType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecognizeRulesTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecognizeRulesTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySensClassification  QuerySensClassificationRequest
     * @return QuerySensClassificationResponse
     */
    @Override
    public CompletableFuture<QuerySensClassificationResponse> querySensClassification(QuerySensClassificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySensClassification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySensClassificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySensClassificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySensLevel  QuerySensLevelRequest
     * @return QuerySensLevelResponse
     */
    @Override
    public CompletableFuture<QuerySensLevelResponse> querySensLevel(QuerySensLevelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySensLevel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySensLevelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySensLevelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySensNodeInfo  QuerySensNodeInfoRequest
     * @return QuerySensNodeInfoResponse
     */
    @Override
    public CompletableFuture<QuerySensNodeInfoResponse> querySensNodeInfo(QuerySensNodeInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySensNodeInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySensNodeInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySensNodeInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is in the trial phase. Users who need to call this operation can apply for it. The users can call this operation after the administrator adds the users to the trial list.</p>
     * 
     * @param request the request parameters of RegisterLineageRelation  RegisterLineageRelationRequest
     * @return RegisterLineageRelationResponse
     */
    @Override
    public CompletableFuture<RegisterLineageRelationResponse> registerLineageRelation(RegisterLineageRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterLineageRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterLineageRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterLineageRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveEntityTags  RemoveEntityTagsRequest
     * @return RemoveEntityTagsResponse
     */
    @Override
    public CompletableFuture<RemoveEntityTagsResponse> removeEntityTags(RemoveEntityTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveEntityTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveEntityTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveEntityTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveProjectMemberFromRole  RemoveProjectMemberFromRoleRequest
     * @return RemoveProjectMemberFromRoleResponse
     */
    @Override
    public CompletableFuture<RemoveProjectMemberFromRoleResponse> removeProjectMemberFromRole(RemoveProjectMemberFromRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveProjectMemberFromRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveProjectMemberFromRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveProjectMemberFromRoleResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartInstanceResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeColumnPermission  RevokeColumnPermissionRequest
     * @return RevokeColumnPermissionResponse
     */
    @Override
    public CompletableFuture<RevokeColumnPermissionResponse> revokeColumnPermission(RevokeColumnPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeColumnPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeColumnPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeColumnPermissionResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeTablePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeTablePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeTablePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about data backfill, see <a href="https://help.aliyun.com/document_detail/137937.html">Backfill data</a>.</p>
     * 
     * @param request the request parameters of RunCycleDagNodes  RunCycleDagNodesRequest
     * @return RunCycleDagNodesResponse
     */
    @Override
    public CompletableFuture<RunCycleDagNodesResponse> runCycleDagNodes(RunCycleDagNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunCycleDagNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCycleDagNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCycleDagNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunManualDagNodes  RunManualDagNodesRequest
     * @return RunManualDagNodesResponse
     */
    @Override
    public CompletableFuture<RunManualDagNodesResponse> runManualDagNodes(RunManualDagNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunManualDagNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunManualDagNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunManualDagNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunSmokeTest  RunSmokeTestRequest
     * @return RunSmokeTestResponse
     */
    @Override
    public CompletableFuture<RunSmokeTestResponse> runSmokeTest(RunSmokeTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunSmokeTest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunSmokeTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunSmokeTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunTriggerNode  RunTriggerNodeRequest
     * @return RunTriggerNodeResponse
     */
    @Override
    public CompletableFuture<RunTriggerNodeResponse> runTriggerNode(RunTriggerNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunTriggerNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunTriggerNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunTriggerNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveDataServiceApiTestResult  SaveDataServiceApiTestResultRequest
     * @return SaveDataServiceApiTestResultResponse
     */
    @Override
    public CompletableFuture<SaveDataServiceApiTestResultResponse> saveDataServiceApiTestResult(SaveDataServiceApiTestResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveDataServiceApiTestResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveDataServiceApiTestResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveDataServiceApiTestResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScanSensitiveData  ScanSensitiveDataRequest
     * @return ScanSensitiveDataResponse
     */
    @Override
    public CompletableFuture<ScanSensitiveDataResponse> scanSensitiveData(ScanSensitiveDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ScanSensitiveData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScanSensitiveDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScanSensitiveDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only metatables in a MaxCompute or E-MapReduce (EMR) compute engine.</p>
     * 
     * @param request the request parameters of SearchMetaTables  SearchMetaTablesRequest
     * @return SearchMetaTablesResponse
     */
    @Override
    public CompletableFuture<SearchMetaTablesResponse> searchMetaTables(SearchMetaTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMetaTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMetaTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMetaTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI SearchNodesByOutput is deprecated  * @param request  the request parameters of SearchNodesByOutput  SearchNodesByOutputRequest
     * @return SearchNodesByOutputResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<SearchNodesByOutputResponse> searchNodesByOutput(SearchNodesByOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchNodesByOutput").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchNodesByOutputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchNodesByOutputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI SetDataSourceShare is deprecated  * @param request  the request parameters of SetDataSourceShare  SetDataSourceShareRequest
     * @return SetDataSourceShareResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<SetDataSourceShareResponse> setDataSourceShare(SetDataSourceShareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDataSourceShare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDataSourceShareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDataSourceShareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetEntityTags  SetEntityTagsRequest
     * @return SetEntityTagsResponse
     */
    @Override
    public CompletableFuture<SetEntityTagsResponse> setEntityTags(SetEntityTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetEntityTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetEntityTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetEntityTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetSuccessInstance  SetSuccessInstanceRequest
     * @return SetSuccessInstanceResponse
     */
    @Override
    public CompletableFuture<SetSuccessInstanceResponse> setSuccessInstance(SetSuccessInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSuccessInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSuccessInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSuccessInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartDIJob  StartDIJobRequest
     * @return StartDIJobResponse
     */
    @Override
    public CompletableFuture<StartDIJobResponse> startDIJob(StartDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartDISyncInstance  StartDISyncInstanceRequest
     * @return StartDISyncInstanceResponse
     */
    @Override
    public CompletableFuture<StartDISyncInstanceResponse> startDISyncInstance(StartDISyncInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDISyncInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDISyncInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDISyncInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartMigration  StartMigrationRequest
     * @return StartMigrationResponse
     */
    @Override
    public CompletableFuture<StartMigrationResponse> startMigration(StartMigrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartMigration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartMigrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartMigrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopDIJob  StopDIJobRequest
     * @return StopDIJobResponse
     */
    @Override
    public CompletableFuture<StopDIJobResponse> stopDIJob(StopDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopDISyncInstance  StopDISyncInstanceRequest
     * @return StopDISyncInstanceResponse
     */
    @Override
    public CompletableFuture<StopDISyncInstanceResponse> stopDISyncInstance(StopDISyncInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDISyncInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDISyncInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDISyncInstanceResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitDataServiceApi  SubmitDataServiceApiRequest
     * @return SubmitDataServiceApiResponse
     */
    @Override
    public CompletableFuture<SubmitDataServiceApiResponse> submitDataServiceApi(SubmitDataServiceApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitDataServiceApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDataServiceApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDataServiceApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitFile  SubmitFileRequest
     * @return SubmitFileResponse
     */
    @Override
    public CompletableFuture<SubmitFileResponse> submitFile(SubmitFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SuspendInstance  SuspendInstanceRequest
     * @return SuspendInstanceResponse
     */
    @Override
    public CompletableFuture<SuspendInstanceResponse> suspendInstance(SuspendInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TerminateDISyncInstance  TerminateDISyncInstanceRequest
     * @return TerminateDISyncInstanceResponse
     */
    @Override
    public CompletableFuture<TerminateDISyncInstanceResponse> terminateDISyncInstance(TerminateDISyncInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminateDISyncInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateDISyncInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateDISyncInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TestDataServiceApi  TestDataServiceApiRequest
     * @return TestDataServiceApiResponse
     */
    @Override
    public CompletableFuture<TestDataServiceApiResponse> testDataServiceApi(TestDataServiceApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestDataServiceApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestDataServiceApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestDataServiceApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TestNetworkConnection  TestNetworkConnectionRequest
     * @return TestNetworkConnectionResponse
     */
    @Override
    public CompletableFuture<TestNetworkConnectionResponse> testNetworkConnection(TestNetworkConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestNetworkConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestNetworkConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestNetworkConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TopTenElapsedTimeInstance  TopTenElapsedTimeInstanceRequest
     * @return TopTenElapsedTimeInstanceResponse
     */
    @Override
    public CompletableFuture<TopTenElapsedTimeInstanceResponse> topTenElapsedTimeInstance(TopTenElapsedTimeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TopTenElapsedTimeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TopTenElapsedTimeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TopTenElapsedTimeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TopTenErrorTimesInstance  TopTenErrorTimesInstanceRequest
     * @return TopTenErrorTimesInstanceResponse
     */
    @Override
    public CompletableFuture<TopTenErrorTimesInstanceResponse> topTenErrorTimesInstance(TopTenErrorTimesInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TopTenErrorTimesInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TopTenErrorTimesInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TopTenErrorTimesInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UmountDirectory  UmountDirectoryRequest
     * @return UmountDirectoryResponse
     */
    @Override
    public CompletableFuture<UmountDirectoryResponse> umountDirectory(UmountDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UmountDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UmountDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UmountDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateBaseline  UpdateBaselineRequest
     * @return UpdateBaselineResponse
     */
    @Override
    public CompletableFuture<UpdateBaselineResponse> updateBaseline(UpdateBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateBusiness  UpdateBusinessRequest
     * @return UpdateBusinessResponse
     */
    @Override
    public CompletableFuture<UpdateBusinessResponse> updateBusiness(UpdateBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateClusterConfigs  UpdateClusterConfigsRequest
     * @return UpdateClusterConfigsResponse
     */
    @Override
    public CompletableFuture<UpdateClusterConfigsResponse> updateClusterConfigs(UpdateClusterConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateClusterConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClusterConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClusterConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateConnection is deprecated  * @param request  the request parameters of UpdateConnection  UpdateConnectionRequest
     * @return UpdateConnectionResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateConnectionResponse> updateConnection(UpdateConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateConnection").setMethod(HttpMethod.PUT).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization. You must update all fields in the alert rule.</p>
     * 
     * @param request the request parameters of UpdateDIAlarmRule  UpdateDIAlarmRuleRequest
     * @return UpdateDIAlarmRuleResponse
     */
    @Override
    public CompletableFuture<UpdateDIAlarmRuleResponse> updateDIAlarmRule(UpdateDIAlarmRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDIAlarmRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDIAlarmRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDIAlarmRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDIJob  UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    @Override
    public CompletableFuture<UpdateDIJobResponse> updateDIJob(UpdateDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the <strong>processing rules of DDL messages</strong> in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization tasks in the solutions. You can modify the <strong>processing rules of DDL messages</strong> based on your business requirements. For more information about how to configure a synchronization solution, see <a href="https://help.aliyun.com/document_detail/199008.html">Synchronization solutions</a>.</p>
     * 
     * @param request the request parameters of UpdateDIProjectConfig  UpdateDIProjectConfigRequest
     * @return UpdateDIProjectConfigResponse
     */
    @Override
    public CompletableFuture<UpdateDIProjectConfigResponse> updateDIProjectConfig(UpdateDIProjectConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDIProjectConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDIProjectConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDIProjectConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDISyncTask  UpdateDISyncTaskRequest
     * @return UpdateDISyncTaskResponse
     */
    @Override
    public CompletableFuture<UpdateDISyncTaskResponse> updateDISyncTask(UpdateDISyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDISyncTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDISyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDISyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDataServiceApi  UpdateDataServiceApiRequest
     * @return UpdateDataServiceApiResponse
     */
    @Override
    public CompletableFuture<UpdateDataServiceApiResponse> updateDataServiceApi(UpdateDataServiceApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataServiceApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataServiceApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataServiceApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDataSource  UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    @Override
    public CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataSource").setMethod(HttpMethod.PUT).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you debug or call this operation, you must specify new values for the specified parameters to ensure that the values are different from the original configurations of the file. For example, if the original value of a parameter is A, you must change the value of this parameter to B before you commit the node. If you set the parameter to A, an exception that indicates invalid data occurs.</p>
     * 
     * @param request the request parameters of UpdateFile  UpdateFileRequest
     * @return UpdateFileResponse
     */
    @Override
    public CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFolder  UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    @Override
    public CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateIDEEventResult  UpdateIDEEventResultRequest
     * @return UpdateIDEEventResultResponse
     */
    @Override
    public CompletableFuture<UpdateIDEEventResultResponse> updateIDEEventResult(UpdateIDEEventResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIDEEventResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIDEEventResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIDEEventResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMetaCategory  UpdateMetaCategoryRequest
     * @return UpdateMetaCategoryResponse
     */
    @Override
    public CompletableFuture<UpdateMetaCategoryResponse> updateMetaCategory(UpdateMetaCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMetaCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMetaCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMetaCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the name and comment of a collection can be updated.</p>
     * 
     * @param request the request parameters of UpdateMetaCollection  UpdateMetaCollectionRequest
     * @return UpdateMetaCollectionResponse
     */
    @Override
    public CompletableFuture<UpdateMetaCollectionResponse> updateMetaCollection(UpdateMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMetaCollection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMetaTable  UpdateMetaTableRequest
     * @return UpdateMetaTableResponse
     */
    @Override
    public CompletableFuture<UpdateMetaTableResponse> updateMetaTable(UpdateMetaTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMetaTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMetaTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMetaTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMetaTableIntroWiki  UpdateMetaTableIntroWikiRequest
     * @return UpdateMetaTableIntroWikiResponse
     */
    @Override
    public CompletableFuture<UpdateMetaTableIntroWikiResponse> updateMetaTableIntroWiki(UpdateMetaTableIntroWikiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMetaTableIntroWiki").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMetaTableIntroWikiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMetaTableIntroWikiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateNodeOwner  UpdateNodeOwnerRequest
     * @return UpdateNodeOwnerResponse
     */
    @Override
    public CompletableFuture<UpdateNodeOwnerResponse> updateNodeOwner(UpdateNodeOwnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNodeOwner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNodeOwnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNodeOwnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateNodeRunMode  UpdateNodeRunModeRequest
     * @return UpdateNodeRunModeResponse
     */
    @Override
    public CompletableFuture<UpdateNodeRunModeResponse> updateNodeRunMode(UpdateNodeRunModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNodeRunMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNodeRunModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNodeRunModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateQualityFollower  UpdateQualityFollowerRequest
     * @return UpdateQualityFollowerResponse
     */
    @Override
    public CompletableFuture<UpdateQualityFollowerResponse> updateQualityFollower(UpdateQualityFollowerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateQualityFollower").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQualityFollowerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQualityFollowerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateQualityRule  UpdateQualityRuleRequest
     * @return UpdateQualityRuleResponse
     */
    @Override
    public CompletableFuture<UpdateQualityRuleResponse> updateQualityRule(UpdateQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRemind  UpdateRemindRequest
     * @return UpdateRemindResponse
     */
    @Override
    public CompletableFuture<UpdateRemindResponse> updateRemind(UpdateRemindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRemind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRemindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRemindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTable  UpdateTableRequest
     * @return UpdateTableResponse
     */
    @Override
    public CompletableFuture<UpdateTableResponse> updateTable(UpdateTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTableAddColumn  UpdateTableAddColumnRequest
     * @return UpdateTableAddColumnResponse
     */
    @Override
    public CompletableFuture<UpdateTableAddColumnResponse> updateTableAddColumn(UpdateTableAddColumnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTableAddColumn").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableAddColumnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableAddColumnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTableLevel  UpdateTableLevelRequest
     * @return UpdateTableLevelResponse
     */
    @Override
    public CompletableFuture<UpdateTableLevelResponse> updateTableLevel(UpdateTableLevelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTableLevel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableLevelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableLevelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTableModelInfo  UpdateTableModelInfoRequest
     * @return UpdateTableModelInfoResponse
     */
    @Override
    public CompletableFuture<UpdateTableModelInfoResponse> updateTableModelInfo(UpdateTableModelInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTableModelInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableModelInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableModelInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTableTheme  UpdateTableThemeRequest
     * @return UpdateTableThemeResponse
     */
    @Override
    public CompletableFuture<UpdateTableThemeResponse> updateTableTheme(UpdateTableThemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTableTheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableThemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableThemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUdfFile  UpdateUdfFileRequest
     * @return UpdateUdfFileResponse
     */
    @Override
    public CompletableFuture<UpdateUdfFileResponse> updateUdfFile(UpdateUdfFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUdfFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUdfFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUdfFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkbenchEventResult  UpdateWorkbenchEventResultRequest
     * @return UpdateWorkbenchEventResultResponse
     */
    @Override
    public CompletableFuture<UpdateWorkbenchEventResultResponse> updateWorkbenchEventResult(UpdateWorkbenchEventResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWorkbenchEventResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkbenchEventResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkbenchEventResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
