// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paifeaturestore20230621.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of CheckInstanceDatasource  CheckInstanceDatasourceRequest
     * @return CheckInstanceDatasourceResponse
     */
    CompletableFuture<CheckInstanceDatasourceResponse> checkInstanceDatasource(CheckInstanceDatasourceRequest request);

    /**
     * @param request the request parameters of CreateDatasource  CreateDatasourceRequest
     * @return CreateDatasourceResponse
     */
    CompletableFuture<CreateDatasourceResponse> createDatasource(CreateDatasourceRequest request);

    /**
     * @param request the request parameters of CreateFeatureEntity  CreateFeatureEntityRequest
     * @return CreateFeatureEntityResponse
     */
    CompletableFuture<CreateFeatureEntityResponse> createFeatureEntity(CreateFeatureEntityRequest request);

    /**
     * @param request the request parameters of CreateFeatureView  CreateFeatureViewRequest
     * @return CreateFeatureViewResponse
     */
    CompletableFuture<CreateFeatureViewResponse> createFeatureView(CreateFeatureViewRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateLabelTable  CreateLabelTableRequest
     * @return CreateLabelTableResponse
     */
    CompletableFuture<CreateLabelTableResponse> createLabelTable(CreateLabelTableRequest request);

    /**
     * @param request the request parameters of CreateModelFeature  CreateModelFeatureRequest
     * @return CreateModelFeatureResponse
     */
    CompletableFuture<CreateModelFeatureResponse> createModelFeature(CreateModelFeatureRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateServiceIdentityRole  CreateServiceIdentityRoleRequest
     * @return CreateServiceIdentityRoleResponse
     */
    CompletableFuture<CreateServiceIdentityRoleResponse> createServiceIdentityRole(CreateServiceIdentityRoleRequest request);

    /**
     * @param request the request parameters of DeleteDatasource  DeleteDatasourceRequest
     * @return DeleteDatasourceResponse
     */
    CompletableFuture<DeleteDatasourceResponse> deleteDatasource(DeleteDatasourceRequest request);

    /**
     * @param request the request parameters of DeleteFeatureEntity  DeleteFeatureEntityRequest
     * @return DeleteFeatureEntityResponse
     */
    CompletableFuture<DeleteFeatureEntityResponse> deleteFeatureEntity(DeleteFeatureEntityRequest request);

    /**
     * @param request the request parameters of DeleteFeatureView  DeleteFeatureViewRequest
     * @return DeleteFeatureViewResponse
     */
    CompletableFuture<DeleteFeatureViewResponse> deleteFeatureView(DeleteFeatureViewRequest request);

    /**
     * @param request the request parameters of DeleteLabelTable  DeleteLabelTableRequest
     * @return DeleteLabelTableResponse
     */
    CompletableFuture<DeleteLabelTableResponse> deleteLabelTable(DeleteLabelTableRequest request);

    /**
     * @param request the request parameters of DeleteModelFeature  DeleteModelFeatureRequest
     * @return DeleteModelFeatureResponse
     */
    CompletableFuture<DeleteModelFeatureResponse> deleteModelFeature(DeleteModelFeatureRequest request);

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * @param request the request parameters of ExportModelFeatureTrainingSetTable  ExportModelFeatureTrainingSetTableRequest
     * @return ExportModelFeatureTrainingSetTableResponse
     */
    CompletableFuture<ExportModelFeatureTrainingSetTableResponse> exportModelFeatureTrainingSetTable(ExportModelFeatureTrainingSetTableRequest request);

    /**
     * @param request the request parameters of GetDatasource  GetDatasourceRequest
     * @return GetDatasourceResponse
     */
    CompletableFuture<GetDatasourceResponse> getDatasource(GetDatasourceRequest request);

    /**
     * @param request the request parameters of GetDatasourceTable  GetDatasourceTableRequest
     * @return GetDatasourceTableResponse
     */
    CompletableFuture<GetDatasourceTableResponse> getDatasourceTable(GetDatasourceTableRequest request);

    /**
     * @param request the request parameters of GetFeatureEntity  GetFeatureEntityRequest
     * @return GetFeatureEntityResponse
     */
    CompletableFuture<GetFeatureEntityResponse> getFeatureEntity(GetFeatureEntityRequest request);

    /**
     * @param request the request parameters of GetFeatureView  GetFeatureViewRequest
     * @return GetFeatureViewResponse
     */
    CompletableFuture<GetFeatureViewResponse> getFeatureView(GetFeatureViewRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetLabelTable  GetLabelTableRequest
     * @return GetLabelTableResponse
     */
    CompletableFuture<GetLabelTableResponse> getLabelTable(GetLabelTableRequest request);

    /**
     * @param request the request parameters of GetModelFeature  GetModelFeatureRequest
     * @return GetModelFeatureResponse
     */
    CompletableFuture<GetModelFeatureResponse> getModelFeature(GetModelFeatureRequest request);

    /**
     * @param request the request parameters of GetModelFeatureFGFeature  GetModelFeatureFGFeatureRequest
     * @return GetModelFeatureFGFeatureResponse
     */
    CompletableFuture<GetModelFeatureFGFeatureResponse> getModelFeatureFGFeature(GetModelFeatureFGFeatureRequest request);

    /**
     * @param request the request parameters of GetModelFeatureFGInfo  GetModelFeatureFGInfoRequest
     * @return GetModelFeatureFGInfoResponse
     */
    CompletableFuture<GetModelFeatureFGInfoResponse> getModelFeatureFGInfo(GetModelFeatureFGInfoRequest request);

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @param request the request parameters of GetProjectFeatureEntity  GetProjectFeatureEntityRequest
     * @return GetProjectFeatureEntityResponse
     */
    CompletableFuture<GetProjectFeatureEntityResponse> getProjectFeatureEntity(GetProjectFeatureEntityRequest request);

    /**
     * @param request the request parameters of GetServiceIdentityRole  GetServiceIdentityRoleRequest
     * @return GetServiceIdentityRoleResponse
     */
    CompletableFuture<GetServiceIdentityRoleResponse> getServiceIdentityRole(GetServiceIdentityRoleRequest request);

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * @param request the request parameters of ListDatasourceTables  ListDatasourceTablesRequest
     * @return ListDatasourceTablesResponse
     */
    CompletableFuture<ListDatasourceTablesResponse> listDatasourceTables(ListDatasourceTablesRequest request);

    /**
     * @param request the request parameters of ListDatasources  ListDatasourcesRequest
     * @return ListDatasourcesResponse
     */
    CompletableFuture<ListDatasourcesResponse> listDatasources(ListDatasourcesRequest request);

    /**
     * @param request the request parameters of ListFeatureEntities  ListFeatureEntitiesRequest
     * @return ListFeatureEntitiesResponse
     */
    CompletableFuture<ListFeatureEntitiesResponse> listFeatureEntities(ListFeatureEntitiesRequest request);

    /**
     * @param request the request parameters of ListFeatureViewFieldRelationships  ListFeatureViewFieldRelationshipsRequest
     * @return ListFeatureViewFieldRelationshipsResponse
     */
    CompletableFuture<ListFeatureViewFieldRelationshipsResponse> listFeatureViewFieldRelationships(ListFeatureViewFieldRelationshipsRequest request);

    /**
     * @param request the request parameters of ListFeatureViewOnlineFeatures  ListFeatureViewOnlineFeaturesRequest
     * @return ListFeatureViewOnlineFeaturesResponse
     */
    CompletableFuture<ListFeatureViewOnlineFeaturesResponse> listFeatureViewOnlineFeatures(ListFeatureViewOnlineFeaturesRequest request);

    /**
     * @param request the request parameters of ListFeatureViewRelationships  ListFeatureViewRelationshipsRequest
     * @return ListFeatureViewRelationshipsResponse
     */
    CompletableFuture<ListFeatureViewRelationshipsResponse> listFeatureViewRelationships(ListFeatureViewRelationshipsRequest request);

    /**
     * @param request the request parameters of ListFeatureViews  ListFeatureViewsRequest
     * @return ListFeatureViewsResponse
     */
    CompletableFuture<ListFeatureViewsResponse> listFeatureViews(ListFeatureViewsRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListLabelTables  ListLabelTablesRequest
     * @return ListLabelTablesResponse
     */
    CompletableFuture<ListLabelTablesResponse> listLabelTables(ListLabelTablesRequest request);

    /**
     * @param request the request parameters of ListModelFeatureAvailableFeatures  ListModelFeatureAvailableFeaturesRequest
     * @return ListModelFeatureAvailableFeaturesResponse
     */
    CompletableFuture<ListModelFeatureAvailableFeaturesResponse> listModelFeatureAvailableFeatures(ListModelFeatureAvailableFeaturesRequest request);

    /**
     * @param request the request parameters of ListModelFeatures  ListModelFeaturesRequest
     * @return ListModelFeaturesResponse
     */
    CompletableFuture<ListModelFeaturesResponse> listModelFeatures(ListModelFeaturesRequest request);

    /**
     * @param request the request parameters of ListProjectFeatureViews  ListProjectFeatureViewsRequest
     * @return ListProjectFeatureViewsResponse
     */
    CompletableFuture<ListProjectFeatureViewsResponse> listProjectFeatureViews(ListProjectFeatureViewsRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @param request the request parameters of ListTaskLogs  ListTaskLogsRequest
     * @return ListTaskLogsResponse
     */
    CompletableFuture<ListTaskLogsResponse> listTaskLogs(ListTaskLogsRequest request);

    /**
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * @param request the request parameters of PublishFeatureViewTable  PublishFeatureViewTableRequest
     * @return PublishFeatureViewTableResponse
     */
    CompletableFuture<PublishFeatureViewTableResponse> publishFeatureViewTable(PublishFeatureViewTableRequest request);

    /**
     * @param request the request parameters of UpdateDatasource  UpdateDatasourceRequest
     * @return UpdateDatasourceResponse
     */
    CompletableFuture<UpdateDatasourceResponse> updateDatasource(UpdateDatasourceRequest request);

    /**
     * @param request the request parameters of UpdateLabelTable  UpdateLabelTableRequest
     * @return UpdateLabelTableResponse
     */
    CompletableFuture<UpdateLabelTableResponse> updateLabelTable(UpdateLabelTableRequest request);

    /**
     * @param request the request parameters of UpdateModelFeature  UpdateModelFeatureRequest
     * @return UpdateModelFeatureResponse
     */
    CompletableFuture<UpdateModelFeatureResponse> updateModelFeature(UpdateModelFeatureRequest request);

    /**
     * @param request the request parameters of UpdateModelFeatureFGFeature  UpdateModelFeatureFGFeatureRequest
     * @return UpdateModelFeatureFGFeatureResponse
     */
    CompletableFuture<UpdateModelFeatureFGFeatureResponse> updateModelFeatureFGFeature(UpdateModelFeatureFGFeatureRequest request);

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    /**
     * @param request the request parameters of WriteFeatureViewTable  WriteFeatureViewTableRequest
     * @return WriteFeatureViewTableResponse
     */
    CompletableFuture<WriteFeatureViewTableResponse> writeFeatureViewTable(WriteFeatureViewTableRequest request);

}
