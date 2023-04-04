// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.devops20210625.models.*;
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

    CompletableFuture<AddGroupMemberResponse> addGroupMember(AddGroupMemberRequest request);

    CompletableFuture<AddPipelineRelationsResponse> addPipelineRelations(AddPipelineRelationsRequest request);

    CompletableFuture<AddRepositoryMemberResponse> addRepositoryMember(AddRepositoryMemberRequest request);

    CompletableFuture<AddWebhookResponse> addWebhook(AddWebhookRequest request);

    CompletableFuture<CreateBranchResponse> createBranch(CreateBranchRequest request);

    CompletableFuture<CreateDeployKeyResponse> createDeployKey(CreateDeployKeyRequest request);

    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    CompletableFuture<CreateFlowTagResponse> createFlowTag(CreateFlowTagRequest request);

    CompletableFuture<CreateFlowTagGroupResponse> createFlowTagGroup(CreateFlowTagGroupRequest request);

    CompletableFuture<CreateHostGroupResponse> createHostGroup(CreateHostGroupRequest request);

    CompletableFuture<CreateOAuthTokenResponse> createOAuthToken(CreateOAuthTokenRequest request);

    CompletableFuture<CreatePipelineGroupResponse> createPipelineGroup(CreatePipelineGroupRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateProtectdBranchResponse> createProtectdBranch(CreateProtectdBranchRequest request);

    CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request);

    CompletableFuture<CreateRepositoryGroupResponse> createRepositoryGroup(CreateRepositoryGroupRequest request);

    CompletableFuture<CreateResourceMemberResponse> createResourceMember(CreateResourceMemberRequest request);

    CompletableFuture<CreateSprintResponse> createSprint(CreateSprintRequest request);

    CompletableFuture<CreateSshKeyResponse> createSshKey(CreateSshKeyRequest request);

    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    CompletableFuture<CreateVariableGroupResponse> createVariableGroup(CreateVariableGroupRequest request);

    CompletableFuture<CreateWorkitemResponse> createWorkitem(CreateWorkitemRequest request);

    CompletableFuture<CreateWorkitemCommentResponse> createWorkitemComment(CreateWorkitemCommentRequest request);

    CompletableFuture<CreateWorkitemEstimateResponse> createWorkitemEstimate(CreateWorkitemEstimateRequest request);

    CompletableFuture<CreateWorkitemRecordResponse> createWorkitemRecord(CreateWorkitemRecordRequest request);

    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    CompletableFuture<DeleteBranchResponse> deleteBranch(DeleteBranchRequest request);

    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    CompletableFuture<DeleteFlowTagResponse> deleteFlowTag(DeleteFlowTagRequest request);

    CompletableFuture<DeleteFlowTagGroupResponse> deleteFlowTagGroup(DeleteFlowTagGroupRequest request);

    CompletableFuture<DeleteGroupMemberResponse> deleteGroupMember(DeleteGroupMemberRequest request);

    CompletableFuture<DeleteHostGroupResponse> deleteHostGroup(DeleteHostGroupRequest request);

    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    CompletableFuture<DeletePipelineGroupResponse> deletePipelineGroup(DeletePipelineGroupRequest request);

    CompletableFuture<DeletePipelineRelationsResponse> deletePipelineRelations(DeletePipelineRelationsRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteProtectedBranchResponse> deleteProtectedBranch(DeleteProtectedBranchRequest request);

    CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request);

    CompletableFuture<DeleteRepositoryGroupResponse> deleteRepositoryGroup(DeleteRepositoryGroupRequest request);

    CompletableFuture<DeleteRepositoryMemberResponse> deleteRepositoryMember(DeleteRepositoryMemberRequest request);

    CompletableFuture<DeleteRepositoryWebhookResponse> deleteRepositoryWebhook(DeleteRepositoryWebhookRequest request);

    CompletableFuture<DeleteResourceMemberResponse> deleteResourceMember(DeleteResourceMemberRequest request);

    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    CompletableFuture<DeleteVariableGroupResponse> deleteVariableGroup(DeleteVariableGroupRequest request);

    CompletableFuture<DeleteWorkitemResponse> deleteWorkitem(DeleteWorkitemRequest request);

    CompletableFuture<DeleteWorkitemAllCommentResponse> deleteWorkitemAllComment(DeleteWorkitemAllCommentRequest request);

    CompletableFuture<DeleteWorkitemCommentResponse> deleteWorkitemComment(DeleteWorkitemCommentRequest request);

    CompletableFuture<EnableDeployKeyResponse> enableDeployKey(EnableDeployKeyRequest request);

    CompletableFuture<FrozenWorkspaceResponse> frozenWorkspace(FrozenWorkspaceRequest request);

    CompletableFuture<GetBranchInfoResponse> getBranchInfo(GetBranchInfoRequest request);

    CompletableFuture<GetCodeupOrganizationResponse> getCodeupOrganization(GetCodeupOrganizationRequest request);

    CompletableFuture<GetCompareDetailResponse> getCompareDetail(GetCompareDetailRequest request);

    CompletableFuture<GetCustomFieldOptionResponse> getCustomFieldOption(GetCustomFieldOptionRequest request);

    CompletableFuture<GetFileBlobsResponse> getFileBlobs(GetFileBlobsRequest request);

    CompletableFuture<GetFileLastCommitResponse> getFileLastCommit(GetFileLastCommitRequest request);

    CompletableFuture<GetFlowTagGroupResponse> getFlowTagGroup(GetFlowTagGroupRequest request);

    CompletableFuture<GetGroupDetailResponse> getGroupDetail(GetGroupDetailRequest request);

    CompletableFuture<GetHostGroupResponse> getHostGroup(GetHostGroupRequest request);

    CompletableFuture<GetOrganizationMemberResponse> getOrganizationMember(GetOrganizationMemberRequest request);

    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    CompletableFuture<GetPipelineArtifactUrlResponse> getPipelineArtifactUrl(GetPipelineArtifactUrlRequest request);

    CompletableFuture<GetPipelineEmasArtifactUrlResponse> getPipelineEmasArtifactUrl(GetPipelineEmasArtifactUrlRequest request);

    CompletableFuture<GetPipelineGroupResponse> getPipelineGroup(GetPipelineGroupRequest request);

    CompletableFuture<GetPipelineRunResponse> getPipelineRun(GetPipelineRunRequest request);

    CompletableFuture<GetPipelineScanReportUrlResponse> getPipelineScanReportUrl(GetPipelineScanReportUrlRequest request);

    CompletableFuture<GetProjectInfoResponse> getProjectInfo(GetProjectInfoRequest request);

    CompletableFuture<GetProjectMemberResponse> getProjectMember(GetProjectMemberRequest request);

    CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request);

    CompletableFuture<GetRepositoryCommitResponse> getRepositoryCommit(GetRepositoryCommitRequest request);

    CompletableFuture<GetRepositoryTagResponse> getRepositoryTag(GetRepositoryTagRequest request);

    CompletableFuture<GetSearchCodePreviewResponse> getSearchCodePreview(GetSearchCodePreviewRequest request);

    CompletableFuture<GetSprintInfoResponse> getSprintInfo(GetSprintInfoRequest request);

    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

    CompletableFuture<GetVMDeployOrderResponse> getVMDeployOrder(GetVMDeployOrderRequest request);

    CompletableFuture<GetVariableGroupResponse> getVariableGroup(GetVariableGroupRequest request);

    CompletableFuture<GetWorkItemActivityResponse> getWorkItemActivity(GetWorkItemActivityRequest request);

    CompletableFuture<GetWorkItemInfoResponse> getWorkItemInfo(GetWorkItemInfoRequest request);

    CompletableFuture<GetWorkItemWorkFlowInfoResponse> getWorkItemWorkFlowInfo(GetWorkItemWorkFlowInfoRequest request);

    CompletableFuture<GetWorkitemCommentListResponse> getWorkitemCommentList(GetWorkitemCommentListRequest request);

    CompletableFuture<GetWorkitemRelationsResponse> getWorkitemRelations(GetWorkitemRelationsRequest request);

    CompletableFuture<GetWorkitemTimeTypeListResponse> getWorkitemTimeTypeList(GetWorkitemTimeTypeListRequest request);

    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    CompletableFuture<JoinPipelineGroupResponse> joinPipelineGroup(JoinPipelineGroupRequest request);

    CompletableFuture<ListFlowTagGroupsResponse> listFlowTagGroups(ListFlowTagGroupsRequest request);

    CompletableFuture<ListGroupMemberResponse> listGroupMember(ListGroupMemberRequest request);

    CompletableFuture<ListGroupRepositoriesResponse> listGroupRepositories(ListGroupRepositoriesRequest request);

    CompletableFuture<ListHostGroupsResponse> listHostGroups(ListHostGroupsRequest request);

    CompletableFuture<ListOrganizationMembersResponse> listOrganizationMembers(ListOrganizationMembersRequest request);

    CompletableFuture<ListOrganizationsResponse> listOrganizations(ListOrganizationsRequest request);

    CompletableFuture<ListPipelineGroupPipelinesResponse> listPipelineGroupPipelines(ListPipelineGroupPipelinesRequest request);

    CompletableFuture<ListPipelineGroupsResponse> listPipelineGroups(ListPipelineGroupsRequest request);

    CompletableFuture<ListPipelineJobHistorysResponse> listPipelineJobHistorys(ListPipelineJobHistorysRequest request);

    CompletableFuture<ListPipelineJobsResponse> listPipelineJobs(ListPipelineJobsRequest request);

    CompletableFuture<ListPipelineRelationsResponse> listPipelineRelations(ListPipelineRelationsRequest request);

    CompletableFuture<ListPipelineRunsResponse> listPipelineRuns(ListPipelineRunsRequest request);

    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request);

    CompletableFuture<ListProjectTemplatesResponse> listProjectTemplates(ListProjectTemplatesRequest request);

    CompletableFuture<ListProjectWorkitemTypesResponse> listProjectWorkitemTypes(ListProjectWorkitemTypesRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListProtectedBranchesResponse> listProtectedBranches(ListProtectedBranchesRequest request);

    CompletableFuture<ListRepositoriesResponse> listRepositories(ListRepositoriesRequest request);

    CompletableFuture<ListRepositoryBranchesResponse> listRepositoryBranches(ListRepositoryBranchesRequest request);

    CompletableFuture<ListRepositoryCommitDiffResponse> listRepositoryCommitDiff(ListRepositoryCommitDiffRequest request);

    CompletableFuture<ListRepositoryCommitsResponse> listRepositoryCommits(ListRepositoryCommitsRequest request);

    CompletableFuture<ListRepositoryGroupsResponse> listRepositoryGroups(ListRepositoryGroupsRequest request);

    CompletableFuture<ListRepositoryMemberWithInheritedResponse> listRepositoryMemberWithInherited(ListRepositoryMemberWithInheritedRequest request);

    CompletableFuture<ListRepositoryTagsResponse> listRepositoryTags(ListRepositoryTagsRequest request);

    CompletableFuture<ListRepositoryTreeResponse> listRepositoryTree(ListRepositoryTreeRequest request);

    CompletableFuture<ListRepositoryWebhookResponse> listRepositoryWebhook(ListRepositoryWebhookRequest request);

    CompletableFuture<ListResourceMembersResponse> listResourceMembers(ListResourceMembersRequest request);

    CompletableFuture<ListSearchCommitResponse> listSearchCommit(ListSearchCommitRequest request);

    CompletableFuture<ListSearchRepositoryResponse> listSearchRepository(ListSearchRepositoryRequest request);

    CompletableFuture<ListSearchSourceCodeResponse> listSearchSourceCode(ListSearchSourceCodeRequest request);

    CompletableFuture<ListServiceConnectionsResponse> listServiceConnections(ListServiceConnectionsRequest request);

    CompletableFuture<ListSprintsResponse> listSprints(ListSprintsRequest request);

    CompletableFuture<ListVariableGroupsResponse> listVariableGroups(ListVariableGroupsRequest request);

    CompletableFuture<ListWorkItemAllFieldsResponse> listWorkItemAllFields(ListWorkItemAllFieldsRequest request);

    CompletableFuture<ListWorkItemWorkFlowStatusResponse> listWorkItemWorkFlowStatus(ListWorkItemWorkFlowStatusRequest request);

    CompletableFuture<ListWorkitemTimeResponse> listWorkitemTime(ListWorkitemTimeRequest request);

    CompletableFuture<ListWorkitemsResponse> listWorkitems(ListWorkitemsRequest request);

    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    CompletableFuture<LogPipelineJobRunResponse> logPipelineJobRun(LogPipelineJobRunRequest request);

    CompletableFuture<LogVMDeployMachineResponse> logVMDeployMachine(LogVMDeployMachineRequest request);

    CompletableFuture<PassPipelineValidateResponse> passPipelineValidate(PassPipelineValidateRequest request);

    CompletableFuture<RefusePipelineValidateResponse> refusePipelineValidate(RefusePipelineValidateRequest request);

    CompletableFuture<ReleaseWorkspaceResponse> releaseWorkspace(ReleaseWorkspaceRequest request);

    CompletableFuture<ResetSshKeyResponse> resetSshKey(ResetSshKeyRequest request);

    CompletableFuture<ResumeVMDeployOrderResponse> resumeVMDeployOrder(ResumeVMDeployOrderRequest request);

    CompletableFuture<RetryPipelineJobRunResponse> retryPipelineJobRun(RetryPipelineJobRunRequest request);

    CompletableFuture<RetryVMDeployMachineResponse> retryVMDeployMachine(RetryVMDeployMachineRequest request);

    CompletableFuture<SkipPipelineJobRunResponse> skipPipelineJobRun(SkipPipelineJobRunRequest request);

    CompletableFuture<SkipVMDeployMachineResponse> skipVMDeployMachine(SkipVMDeployMachineRequest request);

    CompletableFuture<StartPipelineRunResponse> startPipelineRun(StartPipelineRunRequest request);

    CompletableFuture<StopPipelineJobRunResponse> stopPipelineJobRun(StopPipelineJobRunRequest request);

    CompletableFuture<StopPipelineRunResponse> stopPipelineRun(StopPipelineRunRequest request);

    CompletableFuture<StopVMDeployOrderResponse> stopVMDeployOrder(StopVMDeployOrderRequest request);

    CompletableFuture<TriggerRepositoryMirrorSyncResponse> triggerRepositoryMirrorSync(TriggerRepositoryMirrorSyncRequest request);

    CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request);

    CompletableFuture<UpdateFlowTagResponse> updateFlowTag(UpdateFlowTagRequest request);

    CompletableFuture<UpdateFlowTagGroupResponse> updateFlowTagGroup(UpdateFlowTagGroupRequest request);

    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    CompletableFuture<UpdateGroupMemberResponse> updateGroupMember(UpdateGroupMemberRequest request);

    CompletableFuture<UpdateHostGroupResponse> updateHostGroup(UpdateHostGroupRequest request);

    CompletableFuture<UpdatePipelineBaseInfoResponse> updatePipelineBaseInfo(UpdatePipelineBaseInfoRequest request);

    CompletableFuture<UpdatePipelineGroupResponse> updatePipelineGroup(UpdatePipelineGroupRequest request);

    CompletableFuture<UpdateProjectMemberResponse> updateProjectMember(UpdateProjectMemberRequest request);

    CompletableFuture<UpdateProtectedBranchesResponse> updateProtectedBranches(UpdateProtectedBranchesRequest request);

    CompletableFuture<UpdatePushReviewOnOffResponse> updatePushReviewOnOff(UpdatePushReviewOnOffRequest request);

    CompletableFuture<UpdateRepositoryResponse> updateRepository(UpdateRepositoryRequest request);

    CompletableFuture<UpdateRepositoryMemberResponse> updateRepositoryMember(UpdateRepositoryMemberRequest request);

    CompletableFuture<UpdateResourceMemberResponse> updateResourceMember(UpdateResourceMemberRequest request);

    CompletableFuture<UpdateVariableGroupResponse> updateVariableGroup(UpdateVariableGroupRequest request);

    CompletableFuture<UpdateWorkItemResponse> updateWorkItem(UpdateWorkItemRequest request);

    CompletableFuture<UpdateWorkitemCommentResponse> updateWorkitemComment(UpdateWorkitemCommentRequest request);

    CompletableFuture<UpdateWorkitemFieldResponse> updateWorkitemField(UpdateWorkitemFieldRequest request);

}
