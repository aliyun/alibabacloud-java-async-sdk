// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aiworkspace20210204.models.*;
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
     * @param request the request parameters of AddImage  AddImageRequest
     * @return AddImageResponse
     */
    CompletableFuture<AddImageResponse> addImage(AddImageRequest request);

    /**
     * @param request the request parameters of AddImageLabels  AddImageLabelsRequest
     * @return AddImageLabelsResponse
     */
    CompletableFuture<AddImageLabelsResponse> addImageLabels(AddImageLabelsRequest request);

    /**
     * @param request the request parameters of AddMemberRole  AddMemberRoleRequest
     * @return AddMemberRoleResponse
     */
    CompletableFuture<AddMemberRoleResponse> addMemberRole(AddMemberRoleRequest request);

    /**
     * @param request the request parameters of CreateCodeSource  CreateCodeSourceRequest
     * @return CreateCodeSourceResponse
     */
    CompletableFuture<CreateCodeSourceResponse> createCodeSource(CreateCodeSourceRequest request);

    /**
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    /**
     * @param request the request parameters of CreateDatasetLabels  CreateDatasetLabelsRequest
     * @return CreateDatasetLabelsResponse
     */
    CompletableFuture<CreateDatasetLabelsResponse> createDatasetLabels(CreateDatasetLabelsRequest request);

    /**
     * @param request the request parameters of CreateDatasetVersion  CreateDatasetVersionRequest
     * @return CreateDatasetVersionResponse
     */
    CompletableFuture<CreateDatasetVersionResponse> createDatasetVersion(CreateDatasetVersionRequest request);

    /**
     * @param request the request parameters of CreateDatasetVersionLabels  CreateDatasetVersionLabelsRequest
     * @return CreateDatasetVersionLabelsResponse
     */
    CompletableFuture<CreateDatasetVersionLabelsResponse> createDatasetVersionLabels(CreateDatasetVersionLabelsRequest request);

    /**
     * @param request the request parameters of CreateExperiment  CreateExperimentRequest
     * @return CreateExperimentResponse
     */
    CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request);

    /**
     * @param request the request parameters of CreateMember  CreateMemberRequest
     * @return CreateMemberResponse
     */
    CompletableFuture<CreateMemberResponse> createMember(CreateMemberRequest request);

    /**
     * @param request the request parameters of CreateModel  CreateModelRequest
     * @return CreateModelResponse
     */
    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    /**
     * @param request the request parameters of CreateModelLabels  CreateModelLabelsRequest
     * @return CreateModelLabelsResponse
     */
    CompletableFuture<CreateModelLabelsResponse> createModelLabels(CreateModelLabelsRequest request);

    /**
     * @param request the request parameters of CreateModelVersion  CreateModelVersionRequest
     * @return CreateModelVersionResponse
     */
    CompletableFuture<CreateModelVersionResponse> createModelVersion(CreateModelVersionRequest request);

    /**
     * @param request the request parameters of CreateModelVersionLabels  CreateModelVersionLabelsRequest
     * @return CreateModelVersionLabelsResponse
     */
    CompletableFuture<CreateModelVersionLabelsResponse> createModelVersionLabels(CreateModelVersionLabelsRequest request);

    /**
     * @param request the request parameters of CreateProductOrders  CreateProductOrdersRequest
     * @return CreateProductOrdersResponse
     */
    CompletableFuture<CreateProductOrdersResponse> createProductOrders(CreateProductOrdersRequest request);

    /**
     * @param request the request parameters of CreateRun  CreateRunRequest
     * @return CreateRunResponse
     */
    CompletableFuture<CreateRunResponse> createRun(CreateRunRequest request);

    /**
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    /**
     * @param request the request parameters of CreateWorkspaceResource  CreateWorkspaceResourceRequest
     * @return CreateWorkspaceResourceResponse
     */
    CompletableFuture<CreateWorkspaceResourceResponse> createWorkspaceResource(CreateWorkspaceResourceRequest request);

    /**
     * @param request the request parameters of DeleteCodeSource  DeleteCodeSourceRequest
     * @return DeleteCodeSourceResponse
     */
    CompletableFuture<DeleteCodeSourceResponse> deleteCodeSource(DeleteCodeSourceRequest request);

    /**
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    /**
     * @param request the request parameters of DeleteDatasetLabels  DeleteDatasetLabelsRequest
     * @return DeleteDatasetLabelsResponse
     */
    CompletableFuture<DeleteDatasetLabelsResponse> deleteDatasetLabels(DeleteDatasetLabelsRequest request);

    /**
     * @param request the request parameters of DeleteDatasetVersion  DeleteDatasetVersionRequest
     * @return DeleteDatasetVersionResponse
     */
    CompletableFuture<DeleteDatasetVersionResponse> deleteDatasetVersion(DeleteDatasetVersionRequest request);

    /**
     * @param request the request parameters of DeleteDatasetVersionLabels  DeleteDatasetVersionLabelsRequest
     * @return DeleteDatasetVersionLabelsResponse
     */
    CompletableFuture<DeleteDatasetVersionLabelsResponse> deleteDatasetVersionLabels(DeleteDatasetVersionLabelsRequest request);

    /**
     * @param request the request parameters of DeleteExperiment  DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request);

    /**
     * @param request the request parameters of DeleteExperimentLabel  DeleteExperimentLabelRequest
     * @return DeleteExperimentLabelResponse
     */
    CompletableFuture<DeleteExperimentLabelResponse> deleteExperimentLabel(DeleteExperimentLabelRequest request);

    /**
     * @param request the request parameters of DeleteMembers  DeleteMembersRequest
     * @return DeleteMembersResponse
     */
    CompletableFuture<DeleteMembersResponse> deleteMembers(DeleteMembersRequest request);

    /**
     * @param request the request parameters of DeleteModel  DeleteModelRequest
     * @return DeleteModelResponse
     */
    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    /**
     * @param request the request parameters of DeleteModelLabels  DeleteModelLabelsRequest
     * @return DeleteModelLabelsResponse
     */
    CompletableFuture<DeleteModelLabelsResponse> deleteModelLabels(DeleteModelLabelsRequest request);

    /**
     * @param request the request parameters of DeleteModelVersion  DeleteModelVersionRequest
     * @return DeleteModelVersionResponse
     */
    CompletableFuture<DeleteModelVersionResponse> deleteModelVersion(DeleteModelVersionRequest request);

    /**
     * @param request the request parameters of DeleteModelVersionLabels  DeleteModelVersionLabelsRequest
     * @return DeleteModelVersionLabelsResponse
     */
    CompletableFuture<DeleteModelVersionLabelsResponse> deleteModelVersionLabels(DeleteModelVersionLabelsRequest request);

    /**
     * @param request the request parameters of DeleteRun  DeleteRunRequest
     * @return DeleteRunResponse
     */
    CompletableFuture<DeleteRunResponse> deleteRun(DeleteRunRequest request);

    /**
     * @param request the request parameters of DeleteRunLabel  DeleteRunLabelRequest
     * @return DeleteRunLabelResponse
     */
    CompletableFuture<DeleteRunLabelResponse> deleteRunLabel(DeleteRunLabelRequest request);

    /**
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteWorkspaceResource  DeleteWorkspaceResourceRequest
     * @return DeleteWorkspaceResourceResponse
     */
    CompletableFuture<DeleteWorkspaceResourceResponse> deleteWorkspaceResource(DeleteWorkspaceResourceRequest request);

    /**
     * @param request the request parameters of GetCodeSource  GetCodeSourceRequest
     * @return GetCodeSourceResponse
     */
    CompletableFuture<GetCodeSourceResponse> getCodeSource(GetCodeSourceRequest request);

    /**
     * @param request the request parameters of GetDataset  GetDatasetRequest
     * @return GetDatasetResponse
     */
    CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request);

    /**
     * @param request the request parameters of GetDatasetVersion  GetDatasetVersionRequest
     * @return GetDatasetVersionResponse
     */
    CompletableFuture<GetDatasetVersionResponse> getDatasetVersion(GetDatasetVersionRequest request);

    /**
     * @param request the request parameters of GetDefaultWorkspace  GetDefaultWorkspaceRequest
     * @return GetDefaultWorkspaceResponse
     */
    CompletableFuture<GetDefaultWorkspaceResponse> getDefaultWorkspace(GetDefaultWorkspaceRequest request);

    /**
     * @param request the request parameters of GetExperiment  GetExperimentRequest
     * @return GetExperimentResponse
     */
    CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request);

    /**
     * @param request the request parameters of GetImage  GetImageRequest
     * @return GetImageResponse
     */
    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    /**
     * @param request the request parameters of GetMember  GetMemberRequest
     * @return GetMemberResponse
     */
    CompletableFuture<GetMemberResponse> getMember(GetMemberRequest request);

    /**
     * @param request the request parameters of GetModel  GetModelRequest
     * @return GetModelResponse
     */
    CompletableFuture<GetModelResponse> getModel(GetModelRequest request);

    /**
     * @param request the request parameters of GetModelVersion  GetModelVersionRequest
     * @return GetModelVersionResponse
     */
    CompletableFuture<GetModelVersionResponse> getModelVersion(GetModelVersionRequest request);

    /**
     * @param request the request parameters of GetPermission  GetPermissionRequest
     * @return GetPermissionResponse
     */
    CompletableFuture<GetPermissionResponse> getPermission(GetPermissionRequest request);

    /**
     * @param request the request parameters of GetRun  GetRunRequest
     * @return GetRunResponse
     */
    CompletableFuture<GetRunResponse> getRun(GetRunRequest request);

    /**
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * @param request the request parameters of ListCodeSources  ListCodeSourcesRequest
     * @return ListCodeSourcesResponse
     */
    CompletableFuture<ListCodeSourcesResponse> listCodeSources(ListCodeSourcesRequest request);

    /**
     * @param request the request parameters of ListDatasetVersions  ListDatasetVersionsRequest
     * @return ListDatasetVersionsResponse
     */
    CompletableFuture<ListDatasetVersionsResponse> listDatasetVersions(ListDatasetVersionsRequest request);

    /**
     * @param request the request parameters of ListDatasets  ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request);

    /**
     * @param request the request parameters of ListExperiment  ListExperimentRequest
     * @return ListExperimentResponse
     */
    CompletableFuture<ListExperimentResponse> listExperiment(ListExperimentRequest request);

    /**
     * @param request the request parameters of ListImageLabels  ListImageLabelsRequest
     * @return ListImageLabelsResponse
     */
    CompletableFuture<ListImageLabelsResponse> listImageLabels(ListImageLabelsRequest request);

    /**
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * @param request the request parameters of ListMembers  ListMembersRequest
     * @return ListMembersResponse
     */
    CompletableFuture<ListMembersResponse> listMembers(ListMembersRequest request);

    /**
     * @param request the request parameters of ListModelVersions  ListModelVersionsRequest
     * @return ListModelVersionsResponse
     */
    CompletableFuture<ListModelVersionsResponse> listModelVersions(ListModelVersionsRequest request);

    /**
     * @param request the request parameters of ListModels  ListModelsRequest
     * @return ListModelsResponse
     */
    CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request);

    /**
     * @param request the request parameters of ListPermissions  ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request);

    /**
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * @param request the request parameters of ListQuotas  ListQuotasRequest
     * @return ListQuotasResponse
     */
    CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request);

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    /**
     * @param request the request parameters of ListRunMetrics  ListRunMetricsRequest
     * @return ListRunMetricsResponse
     */
    CompletableFuture<ListRunMetricsResponse> listRunMetrics(ListRunMetricsRequest request);

    /**
     * @param request the request parameters of ListRuns  ListRunsRequest
     * @return ListRunsResponse
     */
    CompletableFuture<ListRunsResponse> listRuns(ListRunsRequest request);

    /**
     * @param request the request parameters of ListWorkspaceUsers  ListWorkspaceUsersRequest
     * @return ListWorkspaceUsersResponse
     */
    CompletableFuture<ListWorkspaceUsersResponse> listWorkspaceUsers(ListWorkspaceUsersRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of LogRunMetrics  LogRunMetricsRequest
     * @return LogRunMetricsResponse
     */
    CompletableFuture<LogRunMetricsResponse> logRunMetrics(LogRunMetricsRequest request);

    /**
     * @param request the request parameters of PublishCodeSource  PublishCodeSourceRequest
     * @return PublishCodeSourceResponse
     */
    CompletableFuture<PublishCodeSourceResponse> publishCodeSource(PublishCodeSourceRequest request);

    /**
     * @param request the request parameters of PublishDataset  PublishDatasetRequest
     * @return PublishDatasetResponse
     */
    CompletableFuture<PublishDatasetResponse> publishDataset(PublishDatasetRequest request);

    /**
     * @param request the request parameters of PublishImage  PublishImageRequest
     * @return PublishImageResponse
     */
    CompletableFuture<PublishImageResponse> publishImage(PublishImageRequest request);

    /**
     * @param request the request parameters of RemoveImage  RemoveImageRequest
     * @return RemoveImageResponse
     */
    CompletableFuture<RemoveImageResponse> removeImage(RemoveImageRequest request);

    /**
     * @param request the request parameters of RemoveImageLabels  RemoveImageLabelsRequest
     * @return RemoveImageLabelsResponse
     */
    CompletableFuture<RemoveImageLabelsResponse> removeImageLabels(RemoveImageLabelsRequest request);

    /**
     * @param request the request parameters of RemoveMemberRole  RemoveMemberRoleRequest
     * @return RemoveMemberRoleResponse
     */
    CompletableFuture<RemoveMemberRoleResponse> removeMemberRole(RemoveMemberRoleRequest request);

    /**
     * @param request the request parameters of SetExperimentLabels  SetExperimentLabelsRequest
     * @return SetExperimentLabelsResponse
     */
    CompletableFuture<SetExperimentLabelsResponse> setExperimentLabels(SetExperimentLabelsRequest request);

    /**
     * @param request the request parameters of UpdateDataset  UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request);

    /**
     * @param request the request parameters of UpdateDatasetVersion  UpdateDatasetVersionRequest
     * @return UpdateDatasetVersionResponse
     */
    CompletableFuture<UpdateDatasetVersionResponse> updateDatasetVersion(UpdateDatasetVersionRequest request);

    /**
     * @param request the request parameters of UpdateDefaultWorkspace  UpdateDefaultWorkspaceRequest
     * @return UpdateDefaultWorkspaceResponse
     */
    CompletableFuture<UpdateDefaultWorkspaceResponse> updateDefaultWorkspace(UpdateDefaultWorkspaceRequest request);

    /**
     * @param request the request parameters of UpdateExperiment  UpdateExperimentRequest
     * @return UpdateExperimentResponse
     */
    CompletableFuture<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request);

    /**
     * @param request the request parameters of UpdateModel  UpdateModelRequest
     * @return UpdateModelResponse
     */
    CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request);

    /**
     * @param request the request parameters of UpdateModelVersion  UpdateModelVersionRequest
     * @return UpdateModelVersionResponse
     */
    CompletableFuture<UpdateModelVersionResponse> updateModelVersion(UpdateModelVersionRequest request);

    /**
     * @param request the request parameters of UpdateRun  UpdateRunRequest
     * @return UpdateRunResponse
     */
    CompletableFuture<UpdateRunResponse> updateRun(UpdateRunRequest request);

    /**
     * @param request the request parameters of UpdateWorkspace  UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request);

    /**
     * @param request the request parameters of UpdateWorkspaceResource  UpdateWorkspaceResourceRequest
     * @return UpdateWorkspaceResourceResponse
     */
    CompletableFuture<UpdateWorkspaceResourceResponse> updateWorkspaceResource(UpdateWorkspaceResourceRequest request);

}
