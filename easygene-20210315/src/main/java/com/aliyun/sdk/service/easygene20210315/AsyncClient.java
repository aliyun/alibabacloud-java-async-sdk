// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.easygene20210315.models.*;
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

    CompletableFuture<AbortRunResponse> abortRun(AbortRunRequest request);

    CompletableFuture<AbortSubmissionResponse> abortSubmission(AbortSubmissionRequest request);

    CompletableFuture<CopyPublicEntityResponse> copyPublicEntity(CopyPublicEntityRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateEntityResponse> createEntity(CreateEntityRequest request);

    CompletableFuture<CreateRunResponse> createRun(CreateRunRequest request);

    CompletableFuture<CreateSubmissionResponse> createSubmission(CreateSubmissionRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteEntityItemsResponse> deleteEntityItems(DeleteEntityItemsRequest request);

    CompletableFuture<DeleteRunResponse> deleteRun(DeleteRunRequest request);

    CompletableFuture<DeleteSubmissionResponse> deleteSubmission(DeleteSubmissionRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    CompletableFuture<DownloadEntityResponse> downloadEntity(DownloadEntityRequest request);

    CompletableFuture<GetAppResponse> getApp(GetAppRequest request);

    CompletableFuture<GetEntityResponse> getEntity(GetEntityRequest request);

    CompletableFuture<GetGlobalAppResponse> getGlobalApp(GetGlobalAppRequest request);

    CompletableFuture<GetPublicDatasetResponse> getPublicDataset(GetPublicDatasetRequest request);

    CompletableFuture<GetPublicDatasetEntityResponse> getPublicDatasetEntity(GetPublicDatasetEntityRequest request);

    CompletableFuture<GetRunResponse> getRun(GetRunRequest request);

    CompletableFuture<GetSubmissionResponse> getSubmission(GetSubmissionRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    CompletableFuture<ImportAppResponse> importApp(ImportAppRequest request);

    CompletableFuture<InstallGlobalAppResponse> installGlobalApp(InstallGlobalAppRequest request);

    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    CompletableFuture<ListAuthorizedSoftwareResponse> listAuthorizedSoftware(ListAuthorizedSoftwareRequest request);

    CompletableFuture<ListContainerImagesResponse> listContainerImages(ListContainerImagesRequest request);

    CompletableFuture<ListEntitiesResponse> listEntities(ListEntitiesRequest request);

    CompletableFuture<ListEntityItemsResponse> listEntityItems(ListEntityItemsRequest request);

    CompletableFuture<ListGlobalAppsResponse> listGlobalApps(ListGlobalAppsRequest request);

    CompletableFuture<ListPublicDatasetResponse> listPublicDataset(ListPublicDatasetRequest request);

    CompletableFuture<ListPublicDatasetEntitiesResponse> listPublicDatasetEntities(ListPublicDatasetEntitiesRequest request);

    CompletableFuture<ListPublicDatasetEntityItemsResponse> listPublicDatasetEntityItems(ListPublicDatasetEntityItemsRequest request);

    CompletableFuture<ListPublicDatasetTagsResponse> listPublicDatasetTags(ListPublicDatasetTagsRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListRunsResponse> listRuns(ListRunsRequest request);

    CompletableFuture<ListSubmissionsResponse> listSubmissions(ListSubmissionsRequest request);

    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    CompletableFuture<ListUserActiveRunsResponse> listUserActiveRuns(ListUserActiveRunsRequest request);

    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    CompletableFuture<ResumeSubmissionResponse> resumeSubmission(ResumeSubmissionRequest request);

    CompletableFuture<TagAppResponse> tagApp(TagAppRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UpdateEntityResponse> updateEntity(UpdateEntityRequest request);

    CompletableFuture<UpdateEntityItemsResponse> updateEntityItems(UpdateEntityItemsRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request);

    CompletableFuture<UploadEntityResponse> uploadEntity(UploadEntityRequest request);

}
