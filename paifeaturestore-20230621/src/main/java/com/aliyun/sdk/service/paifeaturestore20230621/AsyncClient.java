// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paifeaturestore20230621.models.*;
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

    CompletableFuture<ChangeProjectFeatureEntityHotIdVersionResponse> changeProjectFeatureEntityHotIdVersion(ChangeProjectFeatureEntityHotIdVersionRequest request);

    CompletableFuture<CheckInstanceDatasourceResponse> checkInstanceDatasource(CheckInstanceDatasourceRequest request);

    CompletableFuture<CreateDatasourceResponse> createDatasource(CreateDatasourceRequest request);

    CompletableFuture<CreateFeatureEntityResponse> createFeatureEntity(CreateFeatureEntityRequest request);

    CompletableFuture<CreateFeatureViewResponse> createFeatureView(CreateFeatureViewRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateLabelTableResponse> createLabelTable(CreateLabelTableRequest request);

    CompletableFuture<CreateModelFeatureResponse> createModelFeature(CreateModelFeatureRequest request);

    CompletableFuture<CreateModelFeatureTrainingSetFGTableResponse> createModelFeatureTrainingSetFGTable(CreateModelFeatureTrainingSetFGTableRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateServiceIdentityRoleResponse> createServiceIdentityRole(CreateServiceIdentityRoleRequest request);

    CompletableFuture<DeleteDatasourceResponse> deleteDatasource(DeleteDatasourceRequest request);

    CompletableFuture<DeleteFeatureEntityResponse> deleteFeatureEntity(DeleteFeatureEntityRequest request);

    CompletableFuture<DeleteFeatureViewResponse> deleteFeatureView(DeleteFeatureViewRequest request);

    CompletableFuture<DeleteLabelTableResponse> deleteLabelTable(DeleteLabelTableRequest request);

    CompletableFuture<DeleteModelFeatureResponse> deleteModelFeature(DeleteModelFeatureRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<ExportModelFeatureTrainingSetFGTableResponse> exportModelFeatureTrainingSetFGTable(ExportModelFeatureTrainingSetFGTableRequest request);

    CompletableFuture<ExportModelFeatureTrainingSetTableResponse> exportModelFeatureTrainingSetTable(ExportModelFeatureTrainingSetTableRequest request);

    CompletableFuture<GetDatasourceResponse> getDatasource(GetDatasourceRequest request);

    CompletableFuture<GetDatasourceTableResponse> getDatasourceTable(GetDatasourceTableRequest request);

    CompletableFuture<GetFeatureEntityResponse> getFeatureEntity(GetFeatureEntityRequest request);

    CompletableFuture<GetFeatureViewResponse> getFeatureView(GetFeatureViewRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetLabelTableResponse> getLabelTable(GetLabelTableRequest request);

    CompletableFuture<GetModelFeatureResponse> getModelFeature(GetModelFeatureRequest request);

    CompletableFuture<GetModelFeatureFGFeatureResponse> getModelFeatureFGFeature(GetModelFeatureFGFeatureRequest request);

    CompletableFuture<GetModelFeatureFGInfoResponse> getModelFeatureFGInfo(GetModelFeatureFGInfoRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetProjectFeatureEntityResponse> getProjectFeatureEntity(GetProjectFeatureEntityRequest request);

    CompletableFuture<GetProjectFeatureEntityHotIdsResponse> getProjectFeatureEntityHotIds(GetProjectFeatureEntityHotIdsRequest request);

    CompletableFuture<GetProjectFeatureViewResponse> getProjectFeatureView(GetProjectFeatureViewRequest request);

    CompletableFuture<GetProjectModelFeatureResponse> getProjectModelFeature(GetProjectModelFeatureRequest request);

    CompletableFuture<GetServiceIdentityRoleResponse> getServiceIdentityRole(GetServiceIdentityRoleRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<ListDatasourceTablesResponse> listDatasourceTables(ListDatasourceTablesRequest request);

    CompletableFuture<ListDatasourcesResponse> listDatasources(ListDatasourcesRequest request);

    CompletableFuture<ListFeatureEntitiesResponse> listFeatureEntities(ListFeatureEntitiesRequest request);

    CompletableFuture<ListFeatureViewFieldRelationshipsResponse> listFeatureViewFieldRelationships(ListFeatureViewFieldRelationshipsRequest request);

    CompletableFuture<ListFeatureViewRelationshipsResponse> listFeatureViewRelationships(ListFeatureViewRelationshipsRequest request);

    CompletableFuture<ListFeatureViewsResponse> listFeatureViews(ListFeatureViewsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListLabelTablesResponse> listLabelTables(ListLabelTablesRequest request);

    CompletableFuture<ListModelFeatureAvailableFeaturesResponse> listModelFeatureAvailableFeatures(ListModelFeatureAvailableFeaturesRequest request);

    CompletableFuture<ListModelFeaturesResponse> listModelFeatures(ListModelFeaturesRequest request);

    CompletableFuture<ListProjectFeatureViewOwnersResponse> listProjectFeatureViewOwners(ListProjectFeatureViewOwnersRequest request);

    CompletableFuture<ListProjectFeatureViewTagsResponse> listProjectFeatureViewTags(ListProjectFeatureViewTagsRequest request);

    CompletableFuture<ListProjectFeatureViewsResponse> listProjectFeatureViews(ListProjectFeatureViewsRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListTaskLogsResponse> listTaskLogs(ListTaskLogsRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<PublishFeatureViewTableResponse> publishFeatureViewTable(PublishFeatureViewTableRequest request);

    CompletableFuture<UpdateDatasourceResponse> updateDatasource(UpdateDatasourceRequest request);

    CompletableFuture<UpdateLabelTableResponse> updateLabelTable(UpdateLabelTableRequest request);

    CompletableFuture<UpdateModelFeatureResponse> updateModelFeature(UpdateModelFeatureRequest request);

    CompletableFuture<UpdateModelFeatureFGFeatureResponse> updateModelFeatureFGFeature(UpdateModelFeatureFGFeatureRequest request);

    CompletableFuture<UpdateModelFeatureFGInfoResponse> updateModelFeatureFGInfo(UpdateModelFeatureFGInfoRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<WriteFeatureViewTableResponse> writeFeatureViewTable(WriteFeatureViewTableRequest request);

    CompletableFuture<WriteProjectFeatureEntityHotIdsResponse> writeProjectFeatureEntityHotIds(WriteProjectFeatureEntityHotIdsRequest request);

}
