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

    CompletableFuture<CloseMergeRequestResponse> closeMergeRequest(CloseMergeRequestRequest request);

    CompletableFuture<CreateBranchResponse> createBranch(CreateBranchRequest request);

    CompletableFuture<CreateCommitStatusResponse> createCommitStatus(CreateCommitStatusRequest request);

    CompletableFuture<CreateDeployKeyResponse> createDeployKey(CreateDeployKeyRequest request);

    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    CompletableFuture<CreateFlowTagResponse> createFlowTag(CreateFlowTagRequest request);

    CompletableFuture<CreateFlowTagGroupResponse> createFlowTagGroup(CreateFlowTagGroupRequest request);

    CompletableFuture<CreateHostGroupResponse> createHostGroup(CreateHostGroupRequest request);

    CompletableFuture<CreateMergeRequestResponse> createMergeRequest(CreateMergeRequestRequest request);

    CompletableFuture<CreateOAuthTokenResponse> createOAuthToken(CreateOAuthTokenRequest request);

    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    CompletableFuture<CreatePipelineGroupResponse> createPipelineGroup(CreatePipelineGroupRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateProtectdBranchResponse> createProtectdBranch(CreateProtectdBranchRequest request);

    CompletableFuture<CreatePushRuleResponse> createPushRule(CreatePushRuleRequest request);

    CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request);

    CompletableFuture<CreateRepositoryGroupResponse> createRepositoryGroup(CreateRepositoryGroupRequest request);

    CompletableFuture<CreateResourceMemberResponse> createResourceMember(CreateResourceMemberRequest request);

    CompletableFuture<CreateServiceAuthResponse> createServiceAuth(CreateServiceAuthRequest request);

    CompletableFuture<CreateServiceConnectionResponse> createServiceConnection(CreateServiceConnectionRequest request);

    CompletableFuture<CreateServiceCredentialResponse> createServiceCredential(CreateServiceCredentialRequest request);

    CompletableFuture<CreateSprintResponse> createSprint(CreateSprintRequest request);

    CompletableFuture<CreateSshKeyResponse> createSshKey(CreateSshKeyRequest request);

    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    CompletableFuture<CreateTestCaseResponse> createTestCase(CreateTestCaseRequest request);

    CompletableFuture<CreateUserKeyResponse> createUserKey(CreateUserKeyRequest request);

    CompletableFuture<CreateVariableGroupResponse> createVariableGroup(CreateVariableGroupRequest request);

    CompletableFuture<CreateWorkitemResponse> createWorkitem(CreateWorkitemRequest request);

    CompletableFuture<CreateWorkitemCommentResponse> createWorkitemComment(CreateWorkitemCommentRequest request);

    CompletableFuture<CreateWorkitemEstimateResponse> createWorkitemEstimate(CreateWorkitemEstimateRequest request);

    CompletableFuture<CreateWorkitemRecordResponse> createWorkitemRecord(CreateWorkitemRecordRequest request);

    CompletableFuture<CreateWorkitemV2Response> createWorkitemV2(CreateWorkitemV2Request request);

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

    CompletableFuture<DeletePushRuleResponse> deletePushRule(DeletePushRuleRequest request);

    CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request);

    CompletableFuture<DeleteRepositoryGroupResponse> deleteRepositoryGroup(DeleteRepositoryGroupRequest request);

    CompletableFuture<DeleteRepositoryMemberResponse> deleteRepositoryMember(DeleteRepositoryMemberRequest request);

    CompletableFuture<DeleteRepositoryWebhookResponse> deleteRepositoryWebhook(DeleteRepositoryWebhookRequest request);

    CompletableFuture<DeleteResourceMemberResponse> deleteResourceMember(DeleteResourceMemberRequest request);

    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    CompletableFuture<DeleteUserKeyResponse> deleteUserKey(DeleteUserKeyRequest request);

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

    CompletableFuture<GetGroupByPathResponse> getGroupByPath(GetGroupByPathRequest request);

    CompletableFuture<GetGroupDetailResponse> getGroupDetail(GetGroupDetailRequest request);

    CompletableFuture<GetHostGroupResponse> getHostGroup(GetHostGroupRequest request);

    CompletableFuture<GetMergeRequestResponse> getMergeRequest(GetMergeRequestRequest request);

    CompletableFuture<GetMergeRequestChangeTreeResponse> getMergeRequestChangeTree(GetMergeRequestChangeTreeRequest request);

    CompletableFuture<GetOrganizationMemberResponse> getOrganizationMember(GetOrganizationMemberRequest request);

    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    CompletableFuture<GetPipelineArtifactUrlResponse> getPipelineArtifactUrl(GetPipelineArtifactUrlRequest request);

    CompletableFuture<GetPipelineEmasArtifactUrlResponse> getPipelineEmasArtifactUrl(GetPipelineEmasArtifactUrlRequest request);

    CompletableFuture<GetPipelineGroupResponse> getPipelineGroup(GetPipelineGroupRequest request);

    CompletableFuture<GetPipelineRunResponse> getPipelineRun(GetPipelineRunRequest request);

    CompletableFuture<GetPipelineScanReportUrlResponse> getPipelineScanReportUrl(GetPipelineScanReportUrlRequest request);

    CompletableFuture<GetProjectInfoResponse> getProjectInfo(GetProjectInfoRequest request);

    CompletableFuture<GetProjectMemberResponse> getProjectMember(GetProjectMemberRequest request);

    CompletableFuture<GetPushRuleResponse> getPushRule(GetPushRuleRequest request);

    CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request);

    CompletableFuture<GetRepositoryCommitResponse> getRepositoryCommit(GetRepositoryCommitRequest request);

    CompletableFuture<GetRepositoryTagResponse> getRepositoryTag(GetRepositoryTagRequest request);

    CompletableFuture<GetSearchCodePreviewResponse> getSearchCodePreview(GetSearchCodePreviewRequest request);

    CompletableFuture<GetSprintInfoResponse> getSprintInfo(GetSprintInfoRequest request);

    CompletableFuture<GetTestResultListResponse> getTestResultList(GetTestResultListRequest request);

    CompletableFuture<GetTestcaseListResponse> getTestcaseList(GetTestcaseListRequest request);

    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

    CompletableFuture<GetVMDeployOrderResponse> getVMDeployOrder(GetVMDeployOrderRequest request);

    CompletableFuture<GetVariableGroupResponse> getVariableGroup(GetVariableGroupRequest request);

    CompletableFuture<GetWorkItemActivityResponse> getWorkItemActivity(GetWorkItemActivityRequest request);

    CompletableFuture<GetWorkItemInfoResponse> getWorkItemInfo(GetWorkItemInfoRequest request);

    CompletableFuture<GetWorkItemWorkFlowInfoResponse> getWorkItemWorkFlowInfo(GetWorkItemWorkFlowInfoRequest request);

    CompletableFuture<GetWorkitemAttachmentCreatemetaResponse> getWorkitemAttachmentCreatemeta(GetWorkitemAttachmentCreatemetaRequest request);

    CompletableFuture<GetWorkitemCommentListResponse> getWorkitemCommentList(GetWorkitemCommentListRequest request);

    CompletableFuture<GetWorkitemRelationsResponse> getWorkitemRelations(GetWorkitemRelationsRequest request);

    CompletableFuture<GetWorkitemTimeTypeListResponse> getWorkitemTimeTypeList(GetWorkitemTimeTypeListRequest request);

    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    CompletableFuture<JoinPipelineGroupResponse> joinPipelineGroup(JoinPipelineGroupRequest request);

    CompletableFuture<ListCommitStatusesResponse> listCommitStatuses(ListCommitStatusesRequest request);

    CompletableFuture<ListFlowTagGroupsResponse> listFlowTagGroups(ListFlowTagGroupsRequest request);

    CompletableFuture<ListGroupMemberResponse> listGroupMember(ListGroupMemberRequest request);

    CompletableFuture<ListGroupRepositoriesResponse> listGroupRepositories(ListGroupRepositoriesRequest request);

    CompletableFuture<ListHostGroupsResponse> listHostGroups(ListHostGroupsRequest request);

    CompletableFuture<ListMergeRequestCommentsResponse> listMergeRequestComments(ListMergeRequestCommentsRequest request);

    CompletableFuture<ListMergeRequestFilesReadsResponse> listMergeRequestFilesReads(ListMergeRequestFilesReadsRequest request);

    CompletableFuture<ListMergeRequestPatchSetsResponse> listMergeRequestPatchSets(ListMergeRequestPatchSetsRequest request);

    CompletableFuture<ListMergeRequestsResponse> listMergeRequests(ListMergeRequestsRequest request);

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

    CompletableFuture<ListPushRulesResponse> listPushRules(ListPushRulesRequest request);

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

    CompletableFuture<ListServiceAuthsResponse> listServiceAuths(ListServiceAuthsRequest request);

    CompletableFuture<ListServiceConnectionsResponse> listServiceConnections(ListServiceConnectionsRequest request);

    CompletableFuture<ListServiceCredentialsResponse> listServiceCredentials(ListServiceCredentialsRequest request);

    CompletableFuture<ListSprintsResponse> listSprints(ListSprintsRequest request);

    CompletableFuture<ListTestCaseFieldsResponse> listTestCaseFields(ListTestCaseFieldsRequest request);

    CompletableFuture<ListUserKeysResponse> listUserKeys(ListUserKeysRequest request);

    CompletableFuture<ListUserResourcesResponse> listUserResources(ListUserResourcesRequest request);

    CompletableFuture<ListVariableGroupsResponse> listVariableGroups(ListVariableGroupsRequest request);

    CompletableFuture<ListWorkItemAllFieldsResponse> listWorkItemAllFields(ListWorkItemAllFieldsRequest request);

    CompletableFuture<ListWorkItemWorkFlowStatusResponse> listWorkItemWorkFlowStatus(ListWorkItemWorkFlowStatusRequest request);

    CompletableFuture<ListWorkitemAttachmentsResponse> listWorkitemAttachments(ListWorkitemAttachmentsRequest request);

    CompletableFuture<ListWorkitemEstimateResponse> listWorkitemEstimate(ListWorkitemEstimateRequest request);

    CompletableFuture<ListWorkitemTimeResponse> listWorkitemTime(ListWorkitemTimeRequest request);

    CompletableFuture<ListWorkitemsResponse> listWorkitems(ListWorkitemsRequest request);

    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    CompletableFuture<LogPipelineJobRunResponse> logPipelineJobRun(LogPipelineJobRunRequest request);

    CompletableFuture<LogVMDeployMachineResponse> logVMDeployMachine(LogVMDeployMachineRequest request);

    CompletableFuture<MergeMergeRequestResponse> mergeMergeRequest(MergeMergeRequestRequest request);

    CompletableFuture<PassPipelineValidateResponse> passPipelineValidate(PassPipelineValidateRequest request);

    CompletableFuture<RefusePipelineValidateResponse> refusePipelineValidate(RefusePipelineValidateRequest request);

    CompletableFuture<ReleaseWorkspaceResponse> releaseWorkspace(ReleaseWorkspaceRequest request);

    CompletableFuture<ReopenMergeRequestResponse> reopenMergeRequest(ReopenMergeRequestRequest request);

    CompletableFuture<ResetSshKeyResponse> resetSshKey(ResetSshKeyRequest request);

    CompletableFuture<ResumeVMDeployOrderResponse> resumeVMDeployOrder(ResumeVMDeployOrderRequest request);

    CompletableFuture<RetryPipelineJobRunResponse> retryPipelineJobRun(RetryPipelineJobRunRequest request);

    CompletableFuture<RetryVMDeployMachineResponse> retryVMDeployMachine(RetryVMDeployMachineRequest request);

    CompletableFuture<ReviewMergeRequestResponse> reviewMergeRequest(ReviewMergeRequestRequest request);

    CompletableFuture<SkipPipelineJobRunResponse> skipPipelineJobRun(SkipPipelineJobRunRequest request);

    CompletableFuture<SkipVMDeployMachineResponse> skipVMDeployMachine(SkipVMDeployMachineRequest request);

    CompletableFuture<StartPipelineRunResponse> startPipelineRun(StartPipelineRunRequest request);

    CompletableFuture<StopPipelineJobRunResponse> stopPipelineJobRun(StopPipelineJobRunRequest request);

    CompletableFuture<StopPipelineRunResponse> stopPipelineRun(StopPipelineRunRequest request);

    CompletableFuture<StopVMDeployOrderResponse> stopVMDeployOrder(StopVMDeployOrderRequest request);

    CompletableFuture<TransferRepositoryResponse> transferRepository(TransferRepositoryRequest request);

    CompletableFuture<TriggerRepositoryMirrorSyncResponse> triggerRepositoryMirrorSync(TriggerRepositoryMirrorSyncRequest request);

    CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request);

    CompletableFuture<UpdateFlowTagResponse> updateFlowTag(UpdateFlowTagRequest request);

    CompletableFuture<UpdateFlowTagGroupResponse> updateFlowTagGroup(UpdateFlowTagGroupRequest request);

    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    CompletableFuture<UpdateGroupMemberResponse> updateGroupMember(UpdateGroupMemberRequest request);

    CompletableFuture<UpdateHostGroupResponse> updateHostGroup(UpdateHostGroupRequest request);

    CompletableFuture<UpdateMergeRequestResponse> updateMergeRequest(UpdateMergeRequestRequest request);

    CompletableFuture<UpdateMergeRequestPersonnelResponse> updateMergeRequestPersonnel(UpdateMergeRequestPersonnelRequest request);

    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    CompletableFuture<UpdatePipelineBaseInfoResponse> updatePipelineBaseInfo(UpdatePipelineBaseInfoRequest request);

    CompletableFuture<UpdatePipelineGroupResponse> updatePipelineGroup(UpdatePipelineGroupRequest request);

    CompletableFuture<UpdateProjectFieldResponse> updateProjectField(UpdateProjectFieldRequest request);

    CompletableFuture<UpdateProjectMemberResponse> updateProjectMember(UpdateProjectMemberRequest request);

    CompletableFuture<UpdateProtectedBranchesResponse> updateProtectedBranches(UpdateProtectedBranchesRequest request);

    CompletableFuture<UpdatePushReviewOnOffResponse> updatePushReviewOnOff(UpdatePushReviewOnOffRequest request);

    CompletableFuture<UpdatePushRuleResponse> updatePushRule(UpdatePushRuleRequest request);

    CompletableFuture<UpdateRepositoryResponse> updateRepository(UpdateRepositoryRequest request);

    CompletableFuture<UpdateRepositoryMemberResponse> updateRepositoryMember(UpdateRepositoryMemberRequest request);

    CompletableFuture<UpdateResourceMemberResponse> updateResourceMember(UpdateResourceMemberRequest request);

    CompletableFuture<UpdateTestCaseResponse> updateTestCase(UpdateTestCaseRequest request);

    CompletableFuture<UpdateTestResultResponse> updateTestResult(UpdateTestResultRequest request);

    CompletableFuture<UpdateVariableGroupResponse> updateVariableGroup(UpdateVariableGroupRequest request);

    CompletableFuture<UpdateWorkItemResponse> updateWorkItem(UpdateWorkItemRequest request);

    CompletableFuture<UpdateWorkitemCommentResponse> updateWorkitemComment(UpdateWorkitemCommentRequest request);

    CompletableFuture<UpdateWorkitemFieldResponse> updateWorkitemField(UpdateWorkitemFieldRequest request);

    CompletableFuture<WorkitemAttachmentCreateResponse> workitemAttachmentCreate(WorkitemAttachmentCreateRequest request);

}
