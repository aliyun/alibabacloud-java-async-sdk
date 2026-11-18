// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yike20260707.models.*;
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
     * <b>description</b> :
     * <p>Adds users under the same Alibaba Cloud account to a specified project in the default workspace of the Alibaba Cloud account, and grants the Edit permission by default. ProjectId specifies the project ID. YikeUserIds specifies a comma-separated list of Yike user IDs, which are not Alibaba Cloud UIDs. Currently, only the default workspace of the Alibaba Cloud account is supported, and projects in newly created workspaces are not supported. This operation follows the behavior of the original member API operation: adding an existing member resets the project permissions. Regular members are assigned the Edit permission, and SuperAdmins of the default workspace retain the Manage permission. Only Alibaba Cloud accounts that have activated ProductionOpenAPI are supported. Default Alibaba Cloud account projects (pd_Alibaba Cloud account ID) are not supported.</p>
     * 
     * @param request the request parameters of AddProjectMembers  AddProjectMembersRequest
     * @return AddProjectMembersResponse
     */
    CompletableFuture<AddProjectMembersResponse> addProjectMembers(AddProjectMembersRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation queries media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of BatchGetMedias  BatchGetMediasRequest
     * @return BatchGetMediasResponse
     */
    CompletableFuture<BatchGetMediasResponse> batchGetMedias(BatchGetMediasRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status and results of multiple video character replacement jobs. JobIds is a comma-separated string of job IDs. The response includes a JobList. The input parameters for each job are located in the AppInputConfig field. For the single query operation GetVideoCharacterReplaceJob, the corresponding field is AppParams. When the Status is Finished, you can retrieve the output media assets from the Result field.</p>
     * 
     * @param request the request parameters of BatchGetVideoCharacterReplaceJobs  BatchGetVideoCharacterReplaceJobsRequest
     * @return BatchGetVideoCharacterReplaceJobsResponse
     */
    CompletableFuture<BatchGetVideoCharacterReplaceJobsResponse> batchGetVideoCharacterReplaceJobs(BatchGetVideoCharacterReplaceJobsRequest request);

    /**
     * @param request the request parameters of CancelGenerationJob  CancelGenerationJobRequest
     * @return CancelGenerationJobResponse
     */
    CompletableFuture<CancelGenerationJobResponse> cancelGenerationJob(CancelGenerationJobRequest request);

    /**
     * <b>description</b> :
     * <p>Categories support up to three levels of hierarchy, and each level supports up to 100 subcategories.</p>
     * 
     * @param request the request parameters of CreateAssetCategory  CreateAssetCategoryRequest
     * @return CreateAssetCategoryResponse
     */
    CompletableFuture<CreateAssetCategoryResponse> createAssetCategory(CreateAssetCategoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of CreateInfiniteCanvas  CreateInfiniteCanvasRequest
     * @return CreateInfiniteCanvasResponse
     */
    CompletableFuture<CreateInfiniteCanvasResponse> createInfiniteCanvas(CreateInfiniteCanvasRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a project in a specified workspace and returns the project ID. If WorkspaceId is not specified, the default workspace of the current account is used. After the project is created, you can call GetProject to query the details or call ListProjects to list projects.</p>
     * 
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a studio and triggers the automatic creation of a default project for the studio. Returns the WorkspaceId and the ProjectId of the default project. You can use the ProjectId directly without creating the default project again.</p>
     * 
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation also deletes its subcategories, including level-2 and level-3 subcategories. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteAssetCategory  DeleteAssetCategoryRequest
     * @return DeleteAssetCategoryResponse
     */
    CompletableFuture<DeleteAssetCategoryResponse> deleteAssetCategory(DeleteAssetCategoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation queries media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of DeleteInfiniteCanvas  DeleteInfiniteCanvasRequest
     * @return DeleteInfiniteCanvasResponse
     */
    CompletableFuture<DeleteInfiniteCanvasResponse> deleteInfiniteCanvas(DeleteInfiniteCanvasRequest request);

    /**
     * @param request the request parameters of DeleteMedias  DeleteMediasRequest
     * @return DeleteMediasResponse
     */
    CompletableFuture<DeleteMediasResponse> deleteMedias(DeleteMediasRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a project by ProjectId. The caller must have project management permissions.
     * Default projects cannot be deleted. If you attempt to delete a default project, DefaultProductionNotSupported is returned. This operation marks the project as deleted and does not physically delete all assets in the project.</p>
     * 
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice:  The AI generation-related API operations in the current 2026-03-19 API version will be retired soon. Upgrade to the 2026-07-07 API version.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateYikeLoginToken  GenerateYikeLoginTokenRequest
     * @return GenerateYikeLoginTokenResponse
     */
    CompletableFuture<GenerateYikeLoginTokenResponse> generateYikeLoginToken(GenerateYikeLoginTokenRequest request);

    /**
     * @param request the request parameters of GetAgentJob  GetAgentJobRequest
     * @return GetAgentJobResponse
     */
    CompletableFuture<GetAgentJobResponse> getAgentJob(GetAgentJobRequest request);

    /**
     * @param request the request parameters of GetAssetCategory  GetAssetCategoryRequest
     * @return GetAssetCategoryResponse
     */
    CompletableFuture<GetAssetCategoryResponse> getAssetCategory(GetAssetCategoryRequest request);

    /**
     * @param request the request parameters of GetImageGenerationJob  GetImageGenerationJobRequest
     * @return GetImageGenerationJobResponse
     */
    CompletableFuture<GetImageGenerationJobResponse> getImageGenerationJob(GetImageGenerationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of GetInfiniteCanvas  GetInfiniteCanvasRequest
     * @return GetInfiniteCanvasResponse
     */
    CompletableFuture<GetInfiniteCanvasResponse> getInfiniteCanvas(GetInfiniteCanvasRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation queries media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of GetMedia  GetMediaRequest
     * @return GetMediaResponse
     */
    CompletableFuture<GetMediaResponse> getMedia(GetMediaRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries media content comprehension jobs.</p>
     * 
     * @param request the request parameters of GetMediaComprehensionJob  GetMediaComprehensionJobRequest
     * @return GetMediaComprehensionJobResponse
     */
    CompletableFuture<GetMediaComprehensionJobResponse> getMediaComprehensionJob(GetMediaComprehensionJobRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the basic information of a project and the permissions of the current caller on the project based on the ProjectId. The project information is contained in the Project object of the response and does not include the list of project assets.</p>
     * 
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @param request the request parameters of GetRemakeScriptJob  GetRemakeScriptJobRequest
     * @return GetRemakeScriptJobResponse
     */
    CompletableFuture<GetRemakeScriptJobResponse> getRemakeScriptJob(GetRemakeScriptJobRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status and result of a single task by using the JobId returned by the submit operation. When the Status is Finished, you can read the output media assets in Result. Executing indicates that the task is still running.
     * This operation uses AppParams to return the task input parameters. The corresponding field name in the batch query operation is AppInputConfig. The output results are categorized into ImageResult, VideoResult, and AudioResult. Each category contains MediaId and OutputUrl.</p>
     * 
     * @param request the request parameters of GetVideoCharacterReplaceJob  GetVideoCharacterReplaceJobRequest
     * @return GetVideoCharacterReplaceJobResponse
     */
    CompletableFuture<GetVideoCharacterReplaceJobResponse> getVideoCharacterReplaceJob(GetVideoCharacterReplaceJobRequest request);

    /**
     * @param request the request parameters of GetVideoCreativeGenerationJob  GetVideoCreativeGenerationJobRequest
     * @return GetVideoCreativeGenerationJobResponse
     */
    CompletableFuture<GetVideoCreativeGenerationJobResponse> getVideoCreativeGenerationJob(GetVideoCreativeGenerationJobRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status, input, parameters, and final results of a video text removal job based on the <code>JobId</code>.</p>
     * 
     * @param request the request parameters of GetVideoDetextJob  GetVideoDetextJobRequest
     * @return GetVideoDetextJobResponse
     */
    CompletableFuture<GetVideoDetextJobResponse> getVideoDetextJob(GetVideoDetextJobRequest request);

    /**
     * @param request the request parameters of GetVideoGenerationJob  GetVideoGenerationJobRequest
     * @return GetVideoGenerationJobResponse
     */
    CompletableFuture<GetVideoGenerationJobResponse> getVideoGenerationJob(GetVideoGenerationJobRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the task status based on the JobId returned by SubmitVideoRemakeJob. Upon completion, returns the download URLs of the JSON files for the video content understanding results and the creative script. If the task fails, returns ErrorCode and ErrorMessage.</p>
     * 
     * @param request the request parameters of GetVideoRemakeJob  GetVideoRemakeJobRequest
     * @return GetVideoRemakeJobResponse
     */
    CompletableFuture<GetVideoRemakeJobResponse> getVideoRemakeJob(GetVideoRemakeJobRequest request);

    /**
     * @param request the request parameters of GetVideoRenderJob  GetVideoRenderJobRequest
     * @return GetVideoRenderJobResponse
     */
    CompletableFuture<GetVideoRenderJobResponse> getVideoRenderJob(GetVideoRenderJobRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status, input, parameters, and final results of a video translation job based on JobId.</p>
     * 
     * @param request the request parameters of GetVideoTranslationJob  GetVideoTranslationJobRequest
     * @return GetVideoTranslationJobResponse
     */
    CompletableFuture<GetVideoTranslationJobResponse> getVideoTranslationJob(GetVideoTranslationJobRequest request);

    /**
     * @param request the request parameters of GetYikeAccountCredit  GetYikeAccountCreditRequest
     * @return GetYikeAccountCreditResponse
     */
    CompletableFuture<GetYikeAccountCreditResponse> getYikeAccountCredit(GetYikeAccountCreditRequest request);

    /**
     * @param request the request parameters of GetYikeJobCredit  GetYikeJobCreditRequest
     * @return GetYikeJobCreditResponse
     */
    CompletableFuture<GetYikeJobCreditResponse> getYikeJobCredit(GetYikeJobCreditRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation queries media content understanding jobs.</p>
     * 
     * @param request the request parameters of ImportMedia  ImportMediaRequest
     * @return ImportMediaResponse
     */
    CompletableFuture<ImportMediaResponse> importMedia(ImportMediaRequest request);

    /**
     * @param request the request parameters of ListAssetCategories  ListAssetCategoriesRequest
     * @return ListAssetCategoriesResponse
     */
    CompletableFuture<ListAssetCategoriesResponse> listAssetCategories(ListAssetCategoriesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of ListInfiniteCanvases  ListInfiniteCanvasesRequest
     * @return ListInfiniteCanvasesResponse
     */
    CompletableFuture<ListInfiniteCanvasesResponse> listInfiniteCanvases(ListInfiniteCanvasesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of projects accessible to the current caller. You can use WorkspaceId to filter projects by workspace. For pagination, specify both PageNo and PageSize as positive integers starting from 1. If valid values are not provided for both parameters, the query defaults to page 1 with 10 entries per page. The response includes ProjectList but does not include TotalCount. MaxResults and NextToken are retained for backward compatibility and are not used for pagination.</p>
     * 
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of workspaces accessible to the current caller. You can use PageNo and PageSize to paginate the results. The default page number is 1, and the default page size is 10. The response includes WorkspaceList and TotalCount. The ID of the default project for a workspace is returned in the DefaultProjectId field.</p>
     * 
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * <b>description</b> :
     * <p>Before submitting a task, validates the input materials for a specified application. AppParams is a JSON-serialized string. The field names must match the input definition of the application corresponding to the AppId. Image, audio, and video materials must match the input types and be accessible.
     * If Status is Success, the validation passes and Result is an empty array. If Status is Failed, Result returns the failed parameter keys and error codes for each item. This operation does not create a task. After the validation passes, call SubmitVideoCharacterReplaceJob to submit the task.</p>
     * 
     * @param request the request parameters of PrecheckVideoCharacterReplaceJob  PrecheckVideoCharacterReplaceJobRequest
     * @return PrecheckVideoCharacterReplaceJobResponse
     */
    CompletableFuture<PrecheckVideoCharacterReplaceJobResponse> precheckVideoCharacterReplaceJob(PrecheckVideoCharacterReplaceJobRequest request);

    /**
     * @param request the request parameters of SearchMedia  SearchMediaRequest
     * @return SearchMediaResponse
     */
    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    /**
     * @param request the request parameters of SubmitAgentJob  SubmitAgentJobRequest
     * @return SubmitAgentJobResponse
     */
    CompletableFuture<SubmitAgentJobResponse> submitAgentJob(SubmitAgentJobRequest request);

    /**
     * @param request the request parameters of SubmitImageGenerationJob  SubmitImageGenerationJobRequest
     * @return SubmitImageGenerationJobResponse
     */
    CompletableFuture<SubmitImageGenerationJobResponse> submitImageGenerationJob(SubmitImageGenerationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation performs content understanding based on provided media files, such as video URLs. Additionally, you can pass custom parameters through the <code>UserData</code> field, which are returned as-is in the callback.</p>
     * 
     * @param request the request parameters of SubmitMediaComprehensionJob  SubmitMediaComprehensionJobRequest
     * @return SubmitMediaComprehensionJobResponse
     */
    CompletableFuture<SubmitMediaComprehensionJobResponse> submitMediaComprehensionJob(SubmitMediaComprehensionJobRequest request);

    /**
     * <b>description</b> :
     * <p>This API generates a new voiceover script based on content understanding results and new product or avatar information. It also supports passing custom parameters through the UserData field, which are returned as-is in the callback.</p>
     * 
     * @param request the request parameters of SubmitRemakeScriptJob  SubmitRemakeScriptJobRequest
     * @return SubmitRemakeScriptJobResponse
     */
    CompletableFuture<SubmitRemakeScriptJobResponse> submitRemakeScriptJob(SubmitRemakeScriptJobRequest request);

    /**
     * <b>description</b> :
     * <p>Performs an asynchronous commit for a video character replacement node. First, call PrecheckVideoCharacterReplaceJob with the same AppId and AppParams to check the input materials.
     * A returned JobId only indicates that the node has been submitted, not that it has been completed. Use GetVideoCharacterReplaceJob or BatchGetVideoCharacterReplaceJobs to query the status and output results. ProjectId is used to specify a project, and FolderId is used to specify a file folder.</p>
     * 
     * @param request the request parameters of SubmitVideoCharacterReplaceJob  SubmitVideoCharacterReplaceJobRequest
     * @return SubmitVideoCharacterReplaceJobResponse
     */
    CompletableFuture<SubmitVideoCharacterReplaceJobResponse> submitVideoCharacterReplaceJob(SubmitVideoCharacterReplaceJobRequest request);

    /**
     * @param request the request parameters of SubmitVideoCreativeGenerationJob  SubmitVideoCreativeGenerationJobRequest
     * @return SubmitVideoCreativeGenerationJobResponse
     */
    CompletableFuture<SubmitVideoCreativeGenerationJobResponse> submitVideoCreativeGenerationJob(SubmitVideoCreativeGenerationJobRequest request);

    /**
     * <b>description</b> :
     * <p>Submits an asynchronous video text erasure task. The input can be an accessible video URL or a Yike video media asset ID. You can configure the erasure time range and text region.</p>
     * 
     * @param request the request parameters of SubmitVideoDetextJob  SubmitVideoDetextJobRequest
     * @return SubmitVideoDetextJobResponse
     */
    CompletableFuture<SubmitVideoDetextJobResponse> submitVideoDetextJob(SubmitVideoDetextJobRequest request);

    /**
     * @param request the request parameters of SubmitVideoGenerationJob  SubmitVideoGenerationJobRequest
     * @return SubmitVideoGenerationJobResponse
     */
    CompletableFuture<SubmitVideoGenerationJobResponse> submitVideoGenerationJob(SubmitVideoGenerationJobRequest request);

    /**
     * <b>description</b> :
     * <p>Submits the original video and remake information such as new products and characters to asynchronously complete video content understanding and creative script generation. Uses the returned JobId to call GetVideoRemakeJob to query the progress and outputs. Video rendering requires a separate call to SubmitVideoRenderJob.</p>
     * 
     * @param request the request parameters of SubmitVideoRemakeJob  SubmitVideoRemakeJobRequest
     * @return SubmitVideoRemakeJobResponse
     */
    CompletableFuture<SubmitVideoRemakeJobResponse> submitVideoRemakeJob(SubmitVideoRemakeJobRequest request);

    /**
     * @param request the request parameters of SubmitVideoRenderJob  SubmitVideoRenderJobRequest
     * @return SubmitVideoRenderJobResponse
     */
    CompletableFuture<SubmitVideoRenderJobResponse> submitVideoRenderJob(SubmitVideoRenderJobRequest request);

    /**
     * <b>description</b> :
     * <p>Submits an asynchronous video translation task. The input supports a media URL or a Yike media asset ID. The task parameters are used to select the source language, target language, and the translation capabilities to be enabled.</p>
     * 
     * @param request the request parameters of SubmitVideoTranslationJob  SubmitVideoTranslationJobRequest
     * @return SubmitVideoTranslationJobResponse
     */
    CompletableFuture<SubmitVideoTranslationJobResponse> submitVideoTranslationJob(SubmitVideoTranslationJobRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a media asset category, you can call this operation to update the name of the category by specifying its ID.</p>
     * 
     * @param request the request parameters of UpdateAssetCategory  UpdateAssetCategoryRequest
     * @return UpdateAssetCategoryResponse
     */
    CompletableFuture<UpdateAssetCategoryResponse> updateAssetCategory(UpdateAssetCategoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of UpdateInfiniteCanvas  UpdateInfiniteCanvasRequest
     * @return UpdateInfiniteCanvasResponse
     */
    CompletableFuture<UpdateInfiniteCanvasResponse> updateInfiniteCanvas(UpdateInfiniteCanvasRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * @param request the request parameters of UpdateMedia  UpdateMediaRequest
     * @return UpdateMediaResponse
     */
    CompletableFuture<UpdateMediaResponse> updateMedia(UpdateMediaRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the name of a project based on the ProjectId and uses Title to specify the new name. This operation only supports modifying the name and does not support modifying the description or cover image. The caller must have edit permissions for the project.</p>
     * 
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

}
