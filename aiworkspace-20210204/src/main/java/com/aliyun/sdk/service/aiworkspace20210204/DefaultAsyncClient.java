// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aiworkspace20210204.models.*;
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
        this.product = "AIWorkSpace";
        this.version = "2021-02-04";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>This operation can be called only by the internal system and cannot be called by external users.</p>
     * 
     * @param request the request parameters of AcceptDataworksEvent  AcceptDataworksEventRequest
     * @return AcceptDataworksEventResponse
     */
    @Override
    public CompletableFuture<AcceptDataworksEventResponse> acceptDataworksEvent(AcceptDataworksEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AcceptDataworksEvent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/action/acceptdataworksevent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcceptDataworksEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcceptDataworksEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddImage  AddImageRequest
     * @return AddImageResponse
     */
    @Override
    public CompletableFuture<AddImageResponse> addImage(AddImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddImage").setMethod(HttpMethod.POST).setPathRegex("/api/v1/images").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddImageLabels  AddImageLabelsRequest
     * @return AddImageLabelsResponse
     */
    @Override
    public CompletableFuture<AddImageLabelsResponse> addImageLabels(AddImageLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddImageLabels").setMethod(HttpMethod.POST).setPathRegex("/api/v1/images/{ImageId}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddImageLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddImageLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddMemberRole  AddMemberRoleRequest
     * @return AddMemberRoleResponse
     */
    @Override
    public CompletableFuture<AddMemberRoleResponse> addMemberRole(AddMemberRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddMemberRole").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/{WorkspaceId}/members/{MemberId}/roles/{RoleName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMemberRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMemberRoleResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeResourceGroup").setMethod(HttpMethod.PUT).setPathRegex("/resourcegroups/action/changeresourcegroup").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCodeSource  CreateCodeSourceRequest
     * @return CreateCodeSourceResponse
     */
    @Override
    public CompletableFuture<CreateCodeSourceResponse> createCodeSource(CreateCodeSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCodeSource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/codesources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCodeSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCodeSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateConnection  CreateConnectionRequest
     * @return CreateConnectionResponse
     */
    @Override
    public CompletableFuture<CreateConnectionResponse> createConnection(CreateConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConnection").setMethod(HttpMethod.POST).setPathRegex("/api/v1/connections").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    @Override
    public CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDataset").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datasets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatasetFileMetas  CreateDatasetFileMetasRequest
     * @return CreateDatasetFileMetasResponse
     */
    @Override
    public CompletableFuture<CreateDatasetFileMetasResponse> createDatasetFileMetas(CreateDatasetFileMetasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDatasetFileMetas").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datasets/{DatasetId}/datasetfilemetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetFileMetasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetFileMetasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatasetJob  CreateDatasetJobRequest
     * @return CreateDatasetJobResponse
     */
    @Override
    public CompletableFuture<CreateDatasetJobResponse> createDatasetJob(CreateDatasetJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDatasetJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatasetJobConfig  CreateDatasetJobConfigRequest
     * @return CreateDatasetJobConfigResponse
     */
    @Override
    public CompletableFuture<CreateDatasetJobConfigResponse> createDatasetJobConfig(CreateDatasetJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDatasetJobConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The tag key and value are not empty strings and cannot exceed 128 characters in length.</li>
     * <li>The tag key cannot start with any of the following strings: &quot;aliyun&quot;, &quot;acs&quot;, &quot;http://&quot;, and &quot;https://&quot;.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDatasetLabels  CreateDatasetLabelsRequest
     * @return CreateDatasetLabelsResponse
     */
    @Override
    public CompletableFuture<CreateDatasetLabelsResponse> createDatasetLabels(CreateDatasetLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDatasetLabels").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datasets/{DatasetId}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatasetVersion  CreateDatasetVersionRequest
     * @return CreateDatasetVersionResponse
     */
    @Override
    public CompletableFuture<CreateDatasetVersionResponse> createDatasetVersion(CreateDatasetVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDatasetVersion").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datasets/{DatasetId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatasetVersionLabels  CreateDatasetVersionLabelsRequest
     * @return CreateDatasetVersionLabelsResponse
     */
    @Override
    public CompletableFuture<CreateDatasetVersionLabelsResponse> createDatasetVersionLabels(CreateDatasetVersionLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDatasetVersionLabels").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/datasets/{DatasetId}/versions/{VersionName}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetVersionLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetVersionLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExperiment  CreateExperimentRequest
     * @return CreateExperimentResponse
     */
    @Override
    public CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMember  CreateMemberRequest
     * @return CreateMemberResponse
     */
    @Override
    public CompletableFuture<CreateMemberResponse> createMember(CreateMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMember").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/{WorkspaceId}/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateModel  CreateModelRequest
     * @return CreateModelResponse
     */
    @Override
    public CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModel").setMethod(HttpMethod.POST).setPathRegex("/api/v1/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateModelLabels  CreateModelLabelsRequest
     * @return CreateModelLabelsResponse
     */
    @Override
    public CompletableFuture<CreateModelLabelsResponse> createModelLabels(CreateModelLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModelLabels").setMethod(HttpMethod.POST).setPathRegex("/api/v1/models/{ModelId}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateModelVersion  CreateModelVersionRequest
     * @return CreateModelVersionResponse
     */
    @Override
    public CompletableFuture<CreateModelVersionResponse> createModelVersion(CreateModelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModelVersion").setMethod(HttpMethod.POST).setPathRegex("/api/v1/models/{ModelId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateModelVersionLabels  CreateModelVersionLabelsRequest
     * @return CreateModelVersionLabelsResponse
     */
    @Override
    public CompletableFuture<CreateModelVersionLabelsResponse> createModelVersionLabels(CreateModelVersionLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModelVersionLabels").setMethod(HttpMethod.POST).setPathRegex("/api/v1/models/{ModelId}/versions/{VersionName}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelVersionLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelVersionLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProductOrders  CreateProductOrdersRequest
     * @return CreateProductOrdersResponse
     */
    @Override
    public CompletableFuture<CreateProductOrdersResponse> createProductOrders(CreateProductOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProductOrders").setMethod(HttpMethod.POST).setPathRegex("/api/v1/productorders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProductOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProductOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRun  CreateRunRequest
     * @return CreateRunResponse
     */
    @Override
    public CompletableFuture<CreateRunResponse> createRun(CreateRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRun").setMethod(HttpMethod.POST).setPathRegex("/api/v1/runs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    @Override
    public CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkspace").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkspaceResource  CreateWorkspaceResourceRequest
     * @return CreateWorkspaceResourceResponse
     */
    @Override
    public CompletableFuture<CreateWorkspaceResourceResponse> createWorkspaceResource(CreateWorkspaceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkspaceResource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/{WorkspaceId}/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkspaceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkspaceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCodeSource  DeleteCodeSourceRequest
     * @return DeleteCodeSourceResponse
     */
    @Override
    public CompletableFuture<DeleteCodeSourceResponse> deleteCodeSource(DeleteCodeSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCodeSource").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/codesources/{CodeSourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCodeSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCodeSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConfig  DeleteConfigRequest
     * @return DeleteConfigResponse
     */
    @Override
    public CompletableFuture<DeleteConfigResponse> deleteConfig(DeleteConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConfig").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/workspaces/{WorkspaceId}/configs/{ConfigKey}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConnection  DeleteConnectionRequest
     * @return DeleteConnectionResponse
     */
    @Override
    public CompletableFuture<DeleteConnectionResponse> deleteConnection(DeleteConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConnection").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/connections/{ConnectionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDataset").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/datasets/{DatasetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDatasetFileMetas  DeleteDatasetFileMetasRequest
     * @return DeleteDatasetFileMetasResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetFileMetasResponse> deleteDatasetFileMetas(DeleteDatasetFileMetasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDatasetFileMetas").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/datasets/{DatasetId}/datasetfilemetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetFileMetasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetFileMetasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDatasetJob  DeleteDatasetJobRequest
     * @return DeleteDatasetJobResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetJobResponse> deleteDatasetJob(DeleteDatasetJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDatasetJob").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobs/{DatasetJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDatasetJobConfig  DeleteDatasetJobConfigRequest
     * @return DeleteDatasetJobConfigResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetJobConfigResponse> deleteDatasetJobConfig(DeleteDatasetJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDatasetJobConfig").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobconfigs/{DatasetJobConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDatasetLabels  DeleteDatasetLabelsRequest
     * @return DeleteDatasetLabelsResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetLabelsResponse> deleteDatasetLabels(DeleteDatasetLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDatasetLabels").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/datasets/{DatasetId}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDatasetVersion  DeleteDatasetVersionRequest
     * @return DeleteDatasetVersionResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetVersionResponse> deleteDatasetVersion(DeleteDatasetVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDatasetVersion").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/datasets/{DatasetId}/versions/{VersionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDatasetVersionLabels  DeleteDatasetVersionLabelsRequest
     * @return DeleteDatasetVersionLabelsResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetVersionLabelsResponse> deleteDatasetVersionLabels(DeleteDatasetVersionLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDatasetVersionLabels").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/datasets/{DatasetId}/versions/{VersionName}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetVersionLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetVersionLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExperiment  DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    @Override
    public CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExperiment").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExperimentLabel  DeleteExperimentLabelRequest
     * @return DeleteExperimentLabelResponse
     */
    @Override
    public CompletableFuture<DeleteExperimentLabelResponse> deleteExperimentLabel(DeleteExperimentLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExperimentLabel").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/experiments/{ExperimentId}/labels/{Key}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExperimentLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExperimentLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMembers  DeleteMembersRequest
     * @return DeleteMembersResponse
     */
    @Override
    public CompletableFuture<DeleteMembersResponse> deleteMembers(DeleteMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMembers").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/workspaces/{WorkspaceId}/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModel  DeleteModelRequest
     * @return DeleteModelResponse
     */
    @Override
    public CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModel").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/models/{ModelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModelLabels  DeleteModelLabelsRequest
     * @return DeleteModelLabelsResponse
     */
    @Override
    public CompletableFuture<DeleteModelLabelsResponse> deleteModelLabels(DeleteModelLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModelLabels").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/models/{ModelId}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModelVersion  DeleteModelVersionRequest
     * @return DeleteModelVersionResponse
     */
    @Override
    public CompletableFuture<DeleteModelVersionResponse> deleteModelVersion(DeleteModelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModelVersion").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/models/{ModelId}/versions/{VersionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModelVersionLabels  DeleteModelVersionLabelsRequest
     * @return DeleteModelVersionLabelsResponse
     */
    @Override
    public CompletableFuture<DeleteModelVersionLabelsResponse> deleteModelVersionLabels(DeleteModelVersionLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModelVersionLabels").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/models/{ModelId}/versions/{VersionName}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelVersionLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelVersionLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRun  DeleteRunRequest
     * @return DeleteRunResponse
     */
    @Override
    public CompletableFuture<DeleteRunResponse> deleteRun(DeleteRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRun").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/runs/{RunId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRunLabel  DeleteRunLabelRequest
     * @return DeleteRunLabelResponse
     */
    @Override
    public CompletableFuture<DeleteRunLabelResponse> deleteRunLabel(DeleteRunLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRunLabel").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/runs/{RunId}/labels/{Key}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRunLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRunLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUserConfig  DeleteUserConfigRequest
     * @return DeleteUserConfigResponse
     */
    @Override
    public CompletableFuture<DeleteUserConfigResponse> deleteUserConfig(DeleteUserConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteUserConfig").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/userconfigs/{CategoryName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    @Override
    public CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkspace").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/workspaces/{WorkspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorkspaceResource  DeleteWorkspaceResourceRequest
     * @return DeleteWorkspaceResourceResponse
     */
    @Override
    public CompletableFuture<DeleteWorkspaceResourceResponse> deleteWorkspaceResource(DeleteWorkspaceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkspaceResource").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/workspaces/{WorkspaceId}/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkspaceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkspaceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCodeSource  GetCodeSourceRequest
     * @return GetCodeSourceResponse
     */
    @Override
    public CompletableFuture<GetCodeSourceResponse> getCodeSource(GetCodeSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCodeSource").setMethod(HttpMethod.GET).setPathRegex("/api/v1/codesources/{CodeSourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCodeSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCodeSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConfig  GetConfigRequest
     * @return GetConfigResponse
     */
    @Override
    public CompletableFuture<GetConfigResponse> getConfig(GetConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{WorkspaceId}/config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConnection  GetConnectionRequest
     * @return GetConnectionResponse
     */
    @Override
    public CompletableFuture<GetConnectionResponse> getConnection(GetConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConnection").setMethod(HttpMethod.GET).setPathRegex("/api/v1/connections/{ConnectionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataset  GetDatasetRequest
     * @return GetDatasetResponse
     */
    @Override
    public CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDataset").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets/{DatasetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDatasetFileMeta  GetDatasetFileMetaRequest
     * @return GetDatasetFileMetaResponse
     */
    @Override
    public CompletableFuture<GetDatasetFileMetaResponse> getDatasetFileMeta(GetDatasetFileMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDatasetFileMeta").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets/{DatasetId}/datasetfilemetas/{DatasetFileMetaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetFileMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetFileMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDatasetFileMetasStatistics  GetDatasetFileMetasStatisticsRequest
     * @return GetDatasetFileMetasStatisticsResponse
     */
    @Override
    public CompletableFuture<GetDatasetFileMetasStatisticsResponse> getDatasetFileMetasStatistics(GetDatasetFileMetasStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDatasetFileMetasStatistics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/statistics/datasets/{DatasetId}/datasetfilemetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetFileMetasStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetFileMetasStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDatasetJob  GetDatasetJobRequest
     * @return GetDatasetJobResponse
     */
    @Override
    public CompletableFuture<GetDatasetJobResponse> getDatasetJob(GetDatasetJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDatasetJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobs/{DatasetJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDatasetJobConfig  GetDatasetJobConfigRequest
     * @return GetDatasetJobConfigResponse
     */
    @Override
    public CompletableFuture<GetDatasetJobConfigResponse> getDatasetJobConfig(GetDatasetJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDatasetJobConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobconfigs/{DatasetJobConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDatasetVersion  GetDatasetVersionRequest
     * @return GetDatasetVersionResponse
     */
    @Override
    public CompletableFuture<GetDatasetVersionResponse> getDatasetVersion(GetDatasetVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDatasetVersion").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets/{DatasetId}/versions/{VersionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDefaultWorkspace  GetDefaultWorkspaceRequest
     * @return GetDefaultWorkspaceResponse
     */
    @Override
    public CompletableFuture<GetDefaultWorkspaceResponse> getDefaultWorkspace(GetDefaultWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDefaultWorkspace").setMethod(HttpMethod.GET).setPathRegex("/api/v1/defaultWorkspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDefaultWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDefaultWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperiment  GetExperimentRequest
     * @return GetExperimentResponse
     */
    @Override
    public CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperiment").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImage  GetImageRequest
     * @return GetImageResponse
     */
    @Override
    public CompletableFuture<GetImageResponse> getImage(GetImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetImage").setMethod(HttpMethod.GET).setPathRegex("/api/v1/images/{ImageId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMember  GetMemberRequest
     * @return GetMemberResponse
     */
    @Override
    public CompletableFuture<GetMemberResponse> getMember(GetMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMember").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{WorkspaceId}/member").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModel  GetModelRequest
     * @return GetModelResponse
     */
    @Override
    public CompletableFuture<GetModelResponse> getModel(GetModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModel").setMethod(HttpMethod.GET).setPathRegex("/api/v1/models/{ModelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModelVersion  GetModelVersionRequest
     * @return GetModelVersionResponse
     */
    @Override
    public CompletableFuture<GetModelVersionResponse> getModelVersion(GetModelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModelVersion").setMethod(HttpMethod.GET).setPathRegex("/api/v1/models/{ModelId}/versions/{VersionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPermission  GetPermissionRequest
     * @return GetPermissionResponse
     */
    @Override
    public CompletableFuture<GetPermissionResponse> getPermission(GetPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPermission").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{WorkspaceId}/permissions/{PermissionCode}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRun  GetRunRequest
     * @return GetRunResponse
     */
    @Override
    public CompletableFuture<GetRunResponse> getRun(GetRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRun").setMethod(HttpMethod.GET).setPathRegex("/api/v1/runs/{RunId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    @Override
    public CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkspace").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{WorkspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCodeSources  ListCodeSourcesRequest
     * @return ListCodeSourcesResponse
     */
    @Override
    public CompletableFuture<ListCodeSourcesResponse> listCodeSources(ListCodeSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCodeSources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/codesources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCodeSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCodeSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConfigs  ListConfigsRequest
     * @return ListConfigsResponse
     */
    @Override
    public CompletableFuture<ListConfigsResponse> listConfigs(ListConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConfigs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{WorkspaceId}/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConnections  ListConnectionsRequest
     * @return ListConnectionsResponse
     */
    @Override
    public CompletableFuture<ListConnectionsResponse> listConnections(ListConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConnections").setMethod(HttpMethod.GET).setPathRegex("/api/v1/connections").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasetFileMetas  ListDatasetFileMetasRequest
     * @return ListDatasetFileMetasResponse
     */
    @Override
    public CompletableFuture<ListDatasetFileMetasResponse> listDatasetFileMetas(ListDatasetFileMetasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatasetFileMetas").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets/{DatasetId}/datasetfilemetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasetFileMetasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasetFileMetasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasetJobConfigs  ListDatasetJobConfigsRequest
     * @return ListDatasetJobConfigsResponse
     */
    @Override
    public CompletableFuture<ListDatasetJobConfigsResponse> listDatasetJobConfigs(ListDatasetJobConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatasetJobConfigs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobconfigs/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasetJobConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasetJobConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasetJobs  ListDatasetJobsRequest
     * @return ListDatasetJobsResponse
     */
    @Override
    public CompletableFuture<ListDatasetJobsResponse> listDatasetJobs(ListDatasetJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatasetJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasetJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasetJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasetVersions  ListDatasetVersionsRequest
     * @return ListDatasetVersionsResponse
     */
    @Override
    public CompletableFuture<ListDatasetVersionsResponse> listDatasetVersions(ListDatasetVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatasetVersions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets/{DatasetId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasetVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasetVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasets  ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    @Override
    public CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatasets").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExperiment  ListExperimentRequest
     * @return ListExperimentResponse
     */
    @Override
    public CompletableFuture<ListExperimentResponse> listExperiment(ListExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExperiment").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListImageLabels  ListImageLabelsRequest
     * @return ListImageLabelsResponse
     */
    @Override
    public CompletableFuture<ListImageLabelsResponse> listImageLabels(ListImageLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListImageLabels").setMethod(HttpMethod.GET).setPathRegex("/api/v1/image/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    @Override
    public CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListImages").setMethod(HttpMethod.GET).setPathRegex("/api/v1/images").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMembers  ListMembersRequest
     * @return ListMembersResponse
     */
    @Override
    public CompletableFuture<ListMembersResponse> listMembers(ListMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMembers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{WorkspaceId}/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListModelVersions  ListModelVersionsRequest
     * @return ListModelVersionsResponse
     */
    @Override
    public CompletableFuture<ListModelVersionsResponse> listModelVersions(ListModelVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelVersions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/models/{ModelId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListModels  ListModelsRequest
     * @return ListModelsResponse
     */
    @Override
    public CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModels").setMethod(HttpMethod.GET).setPathRegex("/api/v1/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPermissions  ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    @Override
    public CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPermissions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{WorkspaceId}/permissions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    @Override
    public CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProducts").setMethod(HttpMethod.GET).setPathRegex("/api/v1/products").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotas  ListQuotasRequest
     * @return ListQuotasResponse
     */
    @Override
    public CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListQuotas").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    @Override
    public CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRunMetrics  ListRunMetricsRequest
     * @return ListRunMetricsResponse
     */
    @Override
    public CompletableFuture<ListRunMetricsResponse> listRunMetrics(ListRunMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRunMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/runs/{RunId}/metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRunMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRunMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRuns  ListRunsRequest
     * @return ListRunsResponse
     */
    @Override
    public CompletableFuture<ListRunsResponse> listRuns(ListRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRuns").setMethod(HttpMethod.GET).setPathRegex("/api/v1/runs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserConfigs  ListUserConfigsRequest
     * @return ListUserConfigsResponse
     */
    @Override
    public CompletableFuture<ListUserConfigsResponse> listUserConfigs(ListUserConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserConfigs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/userconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkspaceUsers  ListWorkspaceUsersRequest
     * @return ListWorkspaceUsersResponse
     */
    @Override
    public CompletableFuture<ListWorkspaceUsersResponse> listWorkspaceUsers(ListWorkspaceUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkspaceUsers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{WorkspaceId}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkspaceUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkspaceUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use the option parameter to specify query options, so as to obtain different information about the workspaces.</p>
     * 
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    @Override
    public CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkspaces").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LogRunMetrics  LogRunMetricsRequest
     * @return LogRunMetricsResponse
     */
    @Override
    public CompletableFuture<LogRunMetricsResponse> logRunMetrics(LogRunMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("LogRunMetrics").setMethod(HttpMethod.POST).setPathRegex("/api/v1/runs/{RunId}/metrics/action/log").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LogRunMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LogRunMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishCodeSource  PublishCodeSourceRequest
     * @return PublishCodeSourceResponse
     */
    @Override
    public CompletableFuture<PublishCodeSourceResponse> publishCodeSource(PublishCodeSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishCodeSource").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/codesources/{CodeSourceId}/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishCodeSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishCodeSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishDataset  PublishDatasetRequest
     * @return PublishDatasetResponse
     */
    @Override
    public CompletableFuture<PublishDatasetResponse> publishDataset(PublishDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishDataset").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/datasets/{DatasetId}/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishImage  PublishImageRequest
     * @return PublishImageResponse
     */
    @Override
    public CompletableFuture<PublishImageResponse> publishImage(PublishImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishImage").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/images/{ImageId}/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveImage  RemoveImageRequest
     * @return RemoveImageResponse
     */
    @Override
    public CompletableFuture<RemoveImageResponse> removeImage(RemoveImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveImage").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/images/{ImageId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveImageLabels  RemoveImageLabelsRequest
     * @return RemoveImageLabelsResponse
     */
    @Override
    public CompletableFuture<RemoveImageLabelsResponse> removeImageLabels(RemoveImageLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveImageLabels").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/images/{ImageId}/labels/{LabelKey}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveImageLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveImageLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveMemberRole  RemoveMemberRoleRequest
     * @return RemoveMemberRoleResponse
     */
    @Override
    public CompletableFuture<RemoveMemberRoleResponse> removeMemberRole(RemoveMemberRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveMemberRole").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/workspaces/{WorkspaceId}/members/{MemberId}/roles/{RoleName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveMemberRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveMemberRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetExperimentLabels  SetExperimentLabelsRequest
     * @return SetExperimentLabelsResponse
     */
    @Override
    public CompletableFuture<SetExperimentLabelsResponse> setExperimentLabels(SetExperimentLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SetExperimentLabels").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetExperimentLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetExperimentLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetUserConfigs  SetUserConfigsRequest
     * @return SetUserConfigsResponse
     */
    @Override
    public CompletableFuture<SetUserConfigsResponse> setUserConfigs(SetUserConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SetUserConfigs").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/userconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetUserConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetUserConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopDatasetJob  StopDatasetJobRequest
     * @return StopDatasetJobResponse
     */
    @Override
    public CompletableFuture<StopDatasetJobResponse> stopDatasetJob(StopDatasetJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopDatasetJob").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobs/{DatasetJobId}/action/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDatasetJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDatasetJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCodeSource  UpdateCodeSourceRequest
     * @return UpdateCodeSourceResponse
     */
    @Override
    public CompletableFuture<UpdateCodeSourceResponse> updateCodeSource(UpdateCodeSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCodeSource").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/codesources/{CodeSourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCodeSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCodeSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateConfig  UpdateConfigRequest
     * @return UpdateConfigResponse
     */
    @Override
    public CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/workspaces/{WorkspaceId}/config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateConfigs  UpdateConfigsRequest
     * @return UpdateConfigsResponse
     */
    @Override
    public CompletableFuture<UpdateConfigsResponse> updateConfigs(UpdateConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConfigs").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/workspaces/{WorkspaceId}/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateConnection  UpdateConnectionRequest
     * @return UpdateConnectionResponse
     */
    @Override
    public CompletableFuture<UpdateConnectionResponse> updateConnection(UpdateConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConnection").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/connections/{ConnectionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDataset  UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    @Override
    public CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDataset").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/datasets/{DatasetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDatasetFileMetas  UpdateDatasetFileMetasRequest
     * @return UpdateDatasetFileMetasResponse
     */
    @Override
    public CompletableFuture<UpdateDatasetFileMetasResponse> updateDatasetFileMetas(UpdateDatasetFileMetasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDatasetFileMetas").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/datasets/{DatasetId}/datasetfilemetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasetFileMetasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasetFileMetasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDatasetJob  UpdateDatasetJobRequest
     * @return UpdateDatasetJobResponse
     */
    @Override
    public CompletableFuture<UpdateDatasetJobResponse> updateDatasetJob(UpdateDatasetJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDatasetJob").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobs/{DatasetJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasetJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasetJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDatasetJobConfig  UpdateDatasetJobConfigRequest
     * @return UpdateDatasetJobConfigResponse
     */
    @Override
    public CompletableFuture<UpdateDatasetJobConfigResponse> updateDatasetJobConfig(UpdateDatasetJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDatasetJobConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/datasets/{DatasetId}/datasetjobconfigs/{DatasetJobConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasetJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasetJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDatasetVersion  UpdateDatasetVersionRequest
     * @return UpdateDatasetVersionResponse
     */
    @Override
    public CompletableFuture<UpdateDatasetVersionResponse> updateDatasetVersion(UpdateDatasetVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDatasetVersion").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/datasets/{DatasetId}/versions/{VersionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasetVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasetVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDefaultWorkspace  UpdateDefaultWorkspaceRequest
     * @return UpdateDefaultWorkspaceResponse
     */
    @Override
    public CompletableFuture<UpdateDefaultWorkspaceResponse> updateDefaultWorkspace(UpdateDefaultWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDefaultWorkspace").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/defaultWorkspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDefaultWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDefaultWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperiment  UpdateExperimentRequest
     * @return UpdateExperimentResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperiment").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModel  UpdateModelRequest
     * @return UpdateModelResponse
     */
    @Override
    public CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModel").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/models/{ModelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModelVersion  UpdateModelVersionRequest
     * @return UpdateModelVersionResponse
     */
    @Override
    public CompletableFuture<UpdateModelVersionResponse> updateModelVersion(UpdateModelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModelVersion").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/models/{ModelId}/versions/{VersionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRun  UpdateRunRequest
     * @return UpdateRunResponse
     */
    @Override
    public CompletableFuture<UpdateRunResponse> updateRun(UpdateRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRun").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/runs/{RunId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkspace  UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    @Override
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWorkspace").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/workspaces/{WorkspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkspaceResource  UpdateWorkspaceResourceRequest
     * @return UpdateWorkspaceResourceResponse
     */
    @Override
    public CompletableFuture<UpdateWorkspaceResourceResponse> updateWorkspaceResource(UpdateWorkspaceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWorkspaceResource").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/workspaces/{WorkspaceId}/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkspaceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkspaceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
