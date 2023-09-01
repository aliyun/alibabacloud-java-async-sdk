// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aiworkspace20210204.models.*;
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

    CompletableFuture<AddImageResponse> addImage(AddImageRequest request);

    CompletableFuture<AddImageLabelsResponse> addImageLabels(AddImageLabelsRequest request);

    CompletableFuture<AddMemberRoleResponse> addMemberRole(AddMemberRoleRequest request);

    CompletableFuture<CreateCodeSourceResponse> createCodeSource(CreateCodeSourceRequest request);

    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    CompletableFuture<CreateDatasetLabelsResponse> createDatasetLabels(CreateDatasetLabelsRequest request);

    CompletableFuture<CreateMemberResponse> createMember(CreateMemberRequest request);

    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    CompletableFuture<CreateModelLabelsResponse> createModelLabels(CreateModelLabelsRequest request);

    CompletableFuture<CreateModelVersionResponse> createModelVersion(CreateModelVersionRequest request);

    CompletableFuture<CreateModelVersionLabelsResponse> createModelVersionLabels(CreateModelVersionLabelsRequest request);

    CompletableFuture<CreateProductOrdersResponse> createProductOrders(CreateProductOrdersRequest request);

    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    CompletableFuture<CreateWorkspaceResourceResponse> createWorkspaceResource(CreateWorkspaceResourceRequest request);

    CompletableFuture<DeleteCodeSourceResponse> deleteCodeSource(DeleteCodeSourceRequest request);

    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    CompletableFuture<DeleteDatasetLabelsResponse> deleteDatasetLabels(DeleteDatasetLabelsRequest request);

    CompletableFuture<DeleteMembersResponse> deleteMembers(DeleteMembersRequest request);

    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    CompletableFuture<DeleteModelLabelsResponse> deleteModelLabels(DeleteModelLabelsRequest request);

    CompletableFuture<DeleteModelVersionResponse> deleteModelVersion(DeleteModelVersionRequest request);

    CompletableFuture<DeleteModelVersionLabelsResponse> deleteModelVersionLabels(DeleteModelVersionLabelsRequest request);

    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    CompletableFuture<DeleteWorkspaceResourceResponse> deleteWorkspaceResource(DeleteWorkspaceResourceRequest request);

    CompletableFuture<GetCodeSourceResponse> getCodeSource(GetCodeSourceRequest request);

    CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request);

    CompletableFuture<GetDefaultWorkspaceResponse> getDefaultWorkspace(GetDefaultWorkspaceRequest request);

    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    CompletableFuture<GetMemberResponse> getMember(GetMemberRequest request);

    CompletableFuture<GetModelResponse> getModel(GetModelRequest request);

    CompletableFuture<GetModelVersionResponse> getModelVersion(GetModelVersionRequest request);

    CompletableFuture<GetPermissionResponse> getPermission(GetPermissionRequest request);

    CompletableFuture<GetServiceTemplateResponse> getServiceTemplate(GetServiceTemplateRequest request);

    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    CompletableFuture<ListCodeSourcesResponse> listCodeSources(ListCodeSourcesRequest request);

    CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request);

    CompletableFuture<ListImageLabelsResponse> listImageLabels(ListImageLabelsRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListMembersResponse> listMembers(ListMembersRequest request);

    CompletableFuture<ListModelVersionsResponse> listModelVersions(ListModelVersionsRequest request);

    CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request);

    CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request);

    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request);

    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    CompletableFuture<ListServiceTemplatesResponse> listServiceTemplates(ListServiceTemplatesRequest request);

    CompletableFuture<ListWorkspaceUsersResponse> listWorkspaceUsers(ListWorkspaceUsersRequest request);

    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    CompletableFuture<PublishCodeSourceResponse> publishCodeSource(PublishCodeSourceRequest request);

    CompletableFuture<PublishDatasetResponse> publishDataset(PublishDatasetRequest request);

    CompletableFuture<PublishImageResponse> publishImage(PublishImageRequest request);

    CompletableFuture<RemoveImageResponse> removeImage(RemoveImageRequest request);

    CompletableFuture<RemoveImageLabelsResponse> removeImageLabels(RemoveImageLabelsRequest request);

    CompletableFuture<RemoveMemberRoleResponse> removeMemberRole(RemoveMemberRoleRequest request);

    CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request);

    CompletableFuture<UpdateDefaultWorkspaceResponse> updateDefaultWorkspace(UpdateDefaultWorkspaceRequest request);

    CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request);

    CompletableFuture<UpdateModelVersionResponse> updateModelVersion(UpdateModelVersionRequest request);

    CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request);

    CompletableFuture<UpdateWorkspaceResourceResponse> updateWorkspaceResource(UpdateWorkspaceResourceRequest request);

}
