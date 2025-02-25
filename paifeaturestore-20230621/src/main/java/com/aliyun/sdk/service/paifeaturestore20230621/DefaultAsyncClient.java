// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.paifeaturestore20230621.models.*;
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
        this.product = "PaiFeatureStore";
        this.version = "2023-06-21";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CheckInstanceDatasource  CheckInstanceDatasourceRequest
     * @return CheckInstanceDatasourceResponse
     */
    @Override
    public CompletableFuture<CheckInstanceDatasourceResponse> checkInstanceDatasource(CheckInstanceDatasourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckInstanceDatasource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/action/checkdatasource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckInstanceDatasourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckInstanceDatasourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatasource  CreateDatasourceRequest
     * @return CreateDatasourceResponse
     */
    @Override
    public CompletableFuture<CreateDatasourceResponse> createDatasource(CreateDatasourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDatasource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/datasources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFeatureEntity  CreateFeatureEntityRequest
     * @return CreateFeatureEntityResponse
     */
    @Override
    public CompletableFuture<CreateFeatureEntityResponse> createFeatureEntity(CreateFeatureEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFeatureEntity").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/featureentities").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFeatureEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFeatureEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFeatureView  CreateFeatureViewRequest
     * @return CreateFeatureViewResponse
     */
    @Override
    public CompletableFuture<CreateFeatureViewResponse> createFeatureView(CreateFeatureViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFeatureView").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/featureviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFeatureViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFeatureViewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLabelTable  CreateLabelTableRequest
     * @return CreateLabelTableResponse
     */
    @Override
    public CompletableFuture<CreateLabelTableResponse> createLabelTable(CreateLabelTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLabelTable").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/labeltables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLabelTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLabelTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateModelFeature  CreateModelFeatureRequest
     * @return CreateModelFeatureResponse
     */
    @Override
    public CompletableFuture<CreateModelFeatureResponse> createModelFeature(CreateModelFeatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModelFeature").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelFeatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelFeatureResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/projects").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceIdentityRole  CreateServiceIdentityRoleRequest
     * @return CreateServiceIdentityRoleResponse
     */
    @Override
    public CompletableFuture<CreateServiceIdentityRoleResponse> createServiceIdentityRole(CreateServiceIdentityRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateServiceIdentityRole").setMethod(HttpMethod.POST).setPathRegex("/api/v1/serviceidentityroles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceIdentityRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceIdentityRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDatasource  DeleteDatasourceRequest
     * @return DeleteDatasourceResponse
     */
    @Override
    public CompletableFuture<DeleteDatasourceResponse> deleteDatasource(DeleteDatasourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDatasource").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{InstanceId}/datasources/{DatasourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFeatureEntity  DeleteFeatureEntityRequest
     * @return DeleteFeatureEntityResponse
     */
    @Override
    public CompletableFuture<DeleteFeatureEntityResponse> deleteFeatureEntity(DeleteFeatureEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFeatureEntity").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{InstanceId}/featureentities/{FeatureEntityId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFeatureEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFeatureEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFeatureView  DeleteFeatureViewRequest
     * @return DeleteFeatureViewResponse
     */
    @Override
    public CompletableFuture<DeleteFeatureViewResponse> deleteFeatureView(DeleteFeatureViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFeatureView").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{InstanceId}/featureviews/{FeatureViewId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFeatureViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFeatureViewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLabelTable  DeleteLabelTableRequest
     * @return DeleteLabelTableResponse
     */
    @Override
    public CompletableFuture<DeleteLabelTableResponse> deleteLabelTable(DeleteLabelTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLabelTable").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{InstanceId}/labeltables/{LabelTableId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLabelTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLabelTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModelFeature  DeleteModelFeatureRequest
     * @return DeleteModelFeatureResponse
     */
    @Override
    public CompletableFuture<DeleteModelFeatureResponse> deleteModelFeature(DeleteModelFeatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModelFeature").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures/{ModelFeatureId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelFeatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelFeatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    @Override
    public CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProject").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{InstanceId}/projects/{ProjectId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportModelFeatureTrainingSetTable  ExportModelFeatureTrainingSetTableRequest
     * @return ExportModelFeatureTrainingSetTableResponse
     */
    @Override
    public CompletableFuture<ExportModelFeatureTrainingSetTableResponse> exportModelFeatureTrainingSetTable(ExportModelFeatureTrainingSetTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportModelFeatureTrainingSetTable").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures/{ModelFeatureId}/action/exporttrainingsettable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportModelFeatureTrainingSetTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportModelFeatureTrainingSetTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDatasource  GetDatasourceRequest
     * @return GetDatasourceResponse
     */
    @Override
    public CompletableFuture<GetDatasourceResponse> getDatasource(GetDatasourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDatasource").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/datasources/{DatasourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDatasourceTable  GetDatasourceTableRequest
     * @return GetDatasourceTableResponse
     */
    @Override
    public CompletableFuture<GetDatasourceTableResponse> getDatasourceTable(GetDatasourceTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDatasourceTable").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/datasources/{DatasourceId}/tables/{TableName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasourceTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasourceTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFeatureEntity  GetFeatureEntityRequest
     * @return GetFeatureEntityResponse
     */
    @Override
    public CompletableFuture<GetFeatureEntityResponse> getFeatureEntity(GetFeatureEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFeatureEntity").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/featureentities/{FeatureEntityId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFeatureEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFeatureEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFeatureView  GetFeatureViewRequest
     * @return GetFeatureViewResponse
     */
    @Override
    public CompletableFuture<GetFeatureViewResponse> getFeatureView(GetFeatureViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFeatureView").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/featureviews/{FeatureViewId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFeatureViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFeatureViewResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstance").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLabelTable  GetLabelTableRequest
     * @return GetLabelTableResponse
     */
    @Override
    public CompletableFuture<GetLabelTableResponse> getLabelTable(GetLabelTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLabelTable").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/labeltables/{LabelTableId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLabelTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLabelTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModelFeature  GetModelFeatureRequest
     * @return GetModelFeatureResponse
     */
    @Override
    public CompletableFuture<GetModelFeatureResponse> getModelFeature(GetModelFeatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModelFeature").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures/{ModelFeatureId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelFeatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelFeatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModelFeatureFGFeature  GetModelFeatureFGFeatureRequest
     * @return GetModelFeatureFGFeatureResponse
     */
    @Override
    public CompletableFuture<GetModelFeatureFGFeatureResponse> getModelFeatureFGFeature(GetModelFeatureFGFeatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModelFeatureFGFeature").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures/{ModelFeatureId}/fgfeature").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelFeatureFGFeatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelFeatureFGFeatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModelFeatureFGInfo  GetModelFeatureFGInfoRequest
     * @return GetModelFeatureFGInfoResponse
     */
    @Override
    public CompletableFuture<GetModelFeatureFGInfoResponse> getModelFeatureFGInfo(GetModelFeatureFGInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModelFeatureFGInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures/{ModelFeatureId}/fginfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelFeatureFGInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelFeatureFGInfoResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProject").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/projects/{ProjectId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProjectFeatureEntity  GetProjectFeatureEntityRequest
     * @return GetProjectFeatureEntityResponse
     */
    @Override
    public CompletableFuture<GetProjectFeatureEntityResponse> getProjectFeatureEntity(GetProjectFeatureEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProjectFeatureEntity").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/projects/{ProjectId}/featureentities/{FeatureEntityName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectFeatureEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectFeatureEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceIdentityRole  GetServiceIdentityRoleRequest
     * @return GetServiceIdentityRoleResponse
     */
    @Override
    public CompletableFuture<GetServiceIdentityRoleResponse> getServiceIdentityRole(GetServiceIdentityRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceIdentityRole").setMethod(HttpMethod.GET).setPathRegex("/api/v1/serviceidentityroles/{RoleName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceIdentityRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceIdentityRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    @Override
    public CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/tasks/{TaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasourceTables  ListDatasourceTablesRequest
     * @return ListDatasourceTablesResponse
     */
    @Override
    public CompletableFuture<ListDatasourceTablesResponse> listDatasourceTables(ListDatasourceTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatasourceTables").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/datasources/{DatasourceId}/tables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasourceTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasourceTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasources  ListDatasourcesRequest
     * @return ListDatasourcesResponse
     */
    @Override
    public CompletableFuture<ListDatasourcesResponse> listDatasources(ListDatasourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatasources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/datasources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureEntities  ListFeatureEntitiesRequest
     * @return ListFeatureEntitiesResponse
     */
    @Override
    public CompletableFuture<ListFeatureEntitiesResponse> listFeatureEntities(ListFeatureEntitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureEntities").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/featureentities").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureEntitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureEntitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureViewFieldRelationships  ListFeatureViewFieldRelationshipsRequest
     * @return ListFeatureViewFieldRelationshipsResponse
     */
    @Override
    public CompletableFuture<ListFeatureViewFieldRelationshipsResponse> listFeatureViewFieldRelationships(ListFeatureViewFieldRelationshipsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureViewFieldRelationships").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/featureviews/{FeatureViewId}/fields/{FieldName}/relationships").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureViewFieldRelationshipsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureViewFieldRelationshipsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureViewOnlineFeatures  ListFeatureViewOnlineFeaturesRequest
     * @return ListFeatureViewOnlineFeaturesResponse
     */
    @Override
    public CompletableFuture<ListFeatureViewOnlineFeaturesResponse> listFeatureViewOnlineFeatures(ListFeatureViewOnlineFeaturesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureViewOnlineFeatures").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/featureviews/{FeatureViewId}/onlinefeatures").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureViewOnlineFeaturesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureViewOnlineFeaturesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureViewRelationships  ListFeatureViewRelationshipsRequest
     * @return ListFeatureViewRelationshipsResponse
     */
    @Override
    public CompletableFuture<ListFeatureViewRelationshipsResponse> listFeatureViewRelationships(ListFeatureViewRelationshipsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureViewRelationships").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/featureviews/{FeatureViewId}/relationships").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureViewRelationshipsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureViewRelationshipsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureViews  ListFeatureViewsRequest
     * @return ListFeatureViewsResponse
     */
    @Override
    public CompletableFuture<ListFeatureViewsResponse> listFeatureViews(ListFeatureViewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureViews").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/featureviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureViewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureViewsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLabelTables  ListLabelTablesRequest
     * @return ListLabelTablesResponse
     */
    @Override
    public CompletableFuture<ListLabelTablesResponse> listLabelTables(ListLabelTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLabelTables").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/labeltables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLabelTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLabelTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListModelFeatureAvailableFeatures  ListModelFeatureAvailableFeaturesRequest
     * @return ListModelFeatureAvailableFeaturesResponse
     */
    @Override
    public CompletableFuture<ListModelFeatureAvailableFeaturesResponse> listModelFeatureAvailableFeatures(ListModelFeatureAvailableFeaturesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelFeatureAvailableFeatures").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures/{ModelFeatureId}/availablefeatures").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelFeatureAvailableFeaturesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelFeatureAvailableFeaturesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListModelFeatures  ListModelFeaturesRequest
     * @return ListModelFeaturesResponse
     */
    @Override
    public CompletableFuture<ListModelFeaturesResponse> listModelFeatures(ListModelFeaturesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelFeatures").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelFeaturesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelFeaturesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjectFeatureViews  ListProjectFeatureViewsRequest
     * @return ListProjectFeatureViewsResponse
     */
    @Override
    public CompletableFuture<ListProjectFeatureViewsResponse> listProjectFeatureViews(ListProjectFeatureViewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProjectFeatureViews").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/projects/{ProjectId}/featureviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectFeatureViewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectFeatureViewsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProjects").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/projects").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTaskLogs  ListTaskLogsRequest
     * @return ListTaskLogsResponse
     */
    @Override
    public CompletableFuture<ListTaskLogsResponse> listTaskLogs(ListTaskLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTaskLogs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/tasks/{TaskId}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTaskLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTaskLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    @Override
    public CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTasks").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishFeatureViewTable  PublishFeatureViewTableRequest
     * @return PublishFeatureViewTableResponse
     */
    @Override
    public CompletableFuture<PublishFeatureViewTableResponse> publishFeatureViewTable(PublishFeatureViewTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishFeatureViewTable").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/featureviews/{FeatureViewId}/action/publishtable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishFeatureViewTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishFeatureViewTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDatasource  UpdateDatasourceRequest
     * @return UpdateDatasourceResponse
     */
    @Override
    public CompletableFuture<UpdateDatasourceResponse> updateDatasource(UpdateDatasourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDatasource").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{InstanceId}/datasources/{DatasourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLabelTable  UpdateLabelTableRequest
     * @return UpdateLabelTableResponse
     */
    @Override
    public CompletableFuture<UpdateLabelTableResponse> updateLabelTable(UpdateLabelTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLabelTable").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{InstanceId}/labeltables/{LabelTableId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLabelTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLabelTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModelFeature  UpdateModelFeatureRequest
     * @return UpdateModelFeatureResponse
     */
    @Override
    public CompletableFuture<UpdateModelFeatureResponse> updateModelFeature(UpdateModelFeatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModelFeature").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures/{ModelFeatureId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelFeatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelFeatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModelFeatureFGFeature  UpdateModelFeatureFGFeatureRequest
     * @return UpdateModelFeatureFGFeatureResponse
     */
    @Override
    public CompletableFuture<UpdateModelFeatureFGFeatureResponse> updateModelFeatureFGFeature(UpdateModelFeatureFGFeatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModelFeatureFGFeature").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{InstanceId}/modelfeatures/{ModelFeatureId}/fgfeature").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelFeatureFGFeatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelFeatureFGFeatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    @Override
    public CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProject").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{InstanceId}/projects/{ProjectId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WriteFeatureViewTable  WriteFeatureViewTableRequest
     * @return WriteFeatureViewTableResponse
     */
    @Override
    public CompletableFuture<WriteFeatureViewTableResponse> writeFeatureViewTable(WriteFeatureViewTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("WriteFeatureViewTable").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/featureviews/{FeatureViewId}/action/writetable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WriteFeatureViewTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WriteFeatureViewTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
