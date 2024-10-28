// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.easygene20210315.models.*;
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
     * @param request the request parameters of AbortRun  AbortRunRequest
     * @return AbortRunResponse
     */
    CompletableFuture<AbortRunResponse> abortRun(AbortRunRequest request);

    /**
     * @param request the request parameters of AbortSubmission  AbortSubmissionRequest
     * @return AbortSubmissionResponse
     */
    CompletableFuture<AbortSubmissionResponse> abortSubmission(AbortSubmissionRequest request);

    /**
     * @param request the request parameters of CopyPublicEntity  CopyPublicEntityRequest
     * @return CopyPublicEntityResponse
     */
    CompletableFuture<CopyPublicEntityResponse> copyPublicEntity(CopyPublicEntityRequest request);

    /**
     * @param request the request parameters of CreateApp  CreateAppRequest
     * @return CreateAppResponse
     */
    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    /**
     * @param request the request parameters of CreateEntity  CreateEntityRequest
     * @return CreateEntityResponse
     */
    CompletableFuture<CreateEntityResponse> createEntity(CreateEntityRequest request);

    /**
     * @param request the request parameters of CreateRun  CreateRunRequest
     * @return CreateRunResponse
     */
    CompletableFuture<CreateRunResponse> createRun(CreateRunRequest request);

    /**
     * @param request the request parameters of CreateSubmission  CreateSubmissionRequest
     * @return CreateSubmissionResponse
     */
    CompletableFuture<CreateSubmissionResponse> createSubmission(CreateSubmissionRequest request);

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteApp  DeleteAppRequest
     * @return DeleteAppResponse
     */
    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    /**
     * @param request the request parameters of DeleteEntity  DeleteEntityRequest
     * @return DeleteEntityResponse
     */
    CompletableFuture<DeleteEntityResponse> deleteEntity(DeleteEntityRequest request);

    /**
     * @param request the request parameters of DeleteEntityItems  DeleteEntityItemsRequest
     * @return DeleteEntityItemsResponse
     */
    CompletableFuture<DeleteEntityItemsResponse> deleteEntityItems(DeleteEntityItemsRequest request);

    /**
     * @param request the request parameters of DeleteRun  DeleteRunRequest
     * @return DeleteRunResponse
     */
    CompletableFuture<DeleteRunResponse> deleteRun(DeleteRunRequest request);

    /**
     * @param request the request parameters of DeleteSubmission  DeleteSubmissionRequest
     * @return DeleteSubmissionResponse
     */
    CompletableFuture<DeleteSubmissionResponse> deleteSubmission(DeleteSubmissionRequest request);

    /**
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * @param request the request parameters of DownloadEntity  DownloadEntityRequest
     * @return DownloadEntityResponse
     */
    CompletableFuture<DownloadEntityResponse> downloadEntity(DownloadEntityRequest request);

    /**
     * @param request the request parameters of GetApp  GetAppRequest
     * @return GetAppResponse
     */
    CompletableFuture<GetAppResponse> getApp(GetAppRequest request);

    /**
     * @param request the request parameters of GetEntity  GetEntityRequest
     * @return GetEntityResponse
     */
    CompletableFuture<GetEntityResponse> getEntity(GetEntityRequest request);

    /**
     * @param request the request parameters of GetGlobalApp  GetGlobalAppRequest
     * @return GetGlobalAppResponse
     */
    CompletableFuture<GetGlobalAppResponse> getGlobalApp(GetGlobalAppRequest request);

    /**
     * @param request the request parameters of GetPublicDataset  GetPublicDatasetRequest
     * @return GetPublicDatasetResponse
     */
    CompletableFuture<GetPublicDatasetResponse> getPublicDataset(GetPublicDatasetRequest request);

    /**
     * @param request the request parameters of GetPublicDatasetEntity  GetPublicDatasetEntityRequest
     * @return GetPublicDatasetEntityResponse
     */
    CompletableFuture<GetPublicDatasetEntityResponse> getPublicDatasetEntity(GetPublicDatasetEntityRequest request);

    /**
     * @param request the request parameters of GetRun  GetRunRequest
     * @return GetRunResponse
     */
    CompletableFuture<GetRunResponse> getRun(GetRunRequest request);

    /**
     * @param request the request parameters of GetSubmission  GetSubmissionRequest
     * @return GetSubmissionResponse
     */
    CompletableFuture<GetSubmissionResponse> getSubmission(GetSubmissionRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * @param request the request parameters of ImportApp  ImportAppRequest
     * @return ImportAppResponse
     */
    CompletableFuture<ImportAppResponse> importApp(ImportAppRequest request);

    /**
     * @param request the request parameters of InstallGlobalApp  InstallGlobalAppRequest
     * @return InstallGlobalAppResponse
     */
    CompletableFuture<InstallGlobalAppResponse> installGlobalApp(InstallGlobalAppRequest request);

    /**
     * @param request the request parameters of ListApps  ListAppsRequest
     * @return ListAppsResponse
     */
    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    /**
     * @param request the request parameters of ListAuthorizedSoftware  ListAuthorizedSoftwareRequest
     * @return ListAuthorizedSoftwareResponse
     */
    CompletableFuture<ListAuthorizedSoftwareResponse> listAuthorizedSoftware(ListAuthorizedSoftwareRequest request);

    /**
     * @param request the request parameters of ListContainerImages  ListContainerImagesRequest
     * @return ListContainerImagesResponse
     */
    CompletableFuture<ListContainerImagesResponse> listContainerImages(ListContainerImagesRequest request);

    /**
     * @param request the request parameters of ListEntities  ListEntitiesRequest
     * @return ListEntitiesResponse
     */
    CompletableFuture<ListEntitiesResponse> listEntities(ListEntitiesRequest request);

    /**
     * @param request the request parameters of ListEntityItems  ListEntityItemsRequest
     * @return ListEntityItemsResponse
     */
    CompletableFuture<ListEntityItemsResponse> listEntityItems(ListEntityItemsRequest request);

    /**
     * @param request the request parameters of ListGlobalApps  ListGlobalAppsRequest
     * @return ListGlobalAppsResponse
     */
    CompletableFuture<ListGlobalAppsResponse> listGlobalApps(ListGlobalAppsRequest request);

    /**
     * @param request the request parameters of ListPublicDataset  ListPublicDatasetRequest
     * @return ListPublicDatasetResponse
     */
    CompletableFuture<ListPublicDatasetResponse> listPublicDataset(ListPublicDatasetRequest request);

    /**
     * @param request the request parameters of ListPublicDatasetEntities  ListPublicDatasetEntitiesRequest
     * @return ListPublicDatasetEntitiesResponse
     */
    CompletableFuture<ListPublicDatasetEntitiesResponse> listPublicDatasetEntities(ListPublicDatasetEntitiesRequest request);

    /**
     * @param request the request parameters of ListPublicDatasetEntityItems  ListPublicDatasetEntityItemsRequest
     * @return ListPublicDatasetEntityItemsResponse
     */
    CompletableFuture<ListPublicDatasetEntityItemsResponse> listPublicDatasetEntityItems(ListPublicDatasetEntityItemsRequest request);

    /**
     * @param request the request parameters of ListPublicDatasetTags  ListPublicDatasetTagsRequest
     * @return ListPublicDatasetTagsResponse
     */
    CompletableFuture<ListPublicDatasetTagsResponse> listPublicDatasetTags(ListPublicDatasetTagsRequest request);

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListRuns  ListRunsRequest
     * @return ListRunsResponse
     */
    CompletableFuture<ListRunsResponse> listRuns(ListRunsRequest request);

    /**
     * @param request the request parameters of ListSubmissions  ListSubmissionsRequest
     * @return ListSubmissionsResponse
     */
    CompletableFuture<ListSubmissionsResponse> listSubmissions(ListSubmissionsRequest request);

    /**
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * @param request the request parameters of ListUserActiveRuns  ListUserActiveRunsRequest
     * @return ListUserActiveRunsResponse
     */
    CompletableFuture<ListUserActiveRunsResponse> listUserActiveRuns(ListUserActiveRunsRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of ResumeSubmission  ResumeSubmissionRequest
     * @return ResumeSubmissionResponse
     */
    CompletableFuture<ResumeSubmissionResponse> resumeSubmission(ResumeSubmissionRequest request);

    /**
     * @param request the request parameters of TagApp  TagAppRequest
     * @return TagAppResponse
     */
    CompletableFuture<TagAppResponse> tagApp(TagAppRequest request);

    /**
     * @deprecated OpenAPI UpdateEntity is deprecated, please use EasyGene::2021-03-15::UpdateEntityItems instead.  * @param request  the request parameters of UpdateEntity  UpdateEntityRequest
     * @return UpdateEntityResponse
     */
    @Deprecated
    CompletableFuture<UpdateEntityResponse> updateEntity(UpdateEntityRequest request);

    /**
     * @param request the request parameters of UpdateEntityItems  UpdateEntityItemsRequest
     * @return UpdateEntityItemsResponse
     */
    CompletableFuture<UpdateEntityItemsResponse> updateEntityItems(UpdateEntityItemsRequest request);

    /**
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
     * @param request the request parameters of UpdateWorkspace  UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request);

    /**
     * @param request the request parameters of UploadEntity  UploadEntityRequest
     * @return UploadEntityResponse
     */
    CompletableFuture<UploadEntityResponse> uploadEntity(UploadEntityRequest request);

}
