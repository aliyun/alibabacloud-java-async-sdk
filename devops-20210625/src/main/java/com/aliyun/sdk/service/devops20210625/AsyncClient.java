// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.devops20210625.models.*;
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
     * @param request the request parameters of AddGroupMember  AddGroupMemberRequest
     * @return AddGroupMemberResponse
     */
    CompletableFuture<AddGroupMemberResponse> addGroupMember(AddGroupMemberRequest request);

    /**
     * @param request the request parameters of AddPipelineRelations  AddPipelineRelationsRequest
     * @return AddPipelineRelationsResponse
     */
    CompletableFuture<AddPipelineRelationsResponse> addPipelineRelations(AddPipelineRelationsRequest request);

    /**
     * @param request the request parameters of AddRepositoryMember  AddRepositoryMemberRequest
     * @return AddRepositoryMemberResponse
     */
    CompletableFuture<AddRepositoryMemberResponse> addRepositoryMember(AddRepositoryMemberRequest request);

    /**
     * @param request the request parameters of AddWebhook  AddWebhookRequest
     * @return AddWebhookResponse
     */
    CompletableFuture<AddWebhookResponse> addWebhook(AddWebhookRequest request);

    /**
     * @param request the request parameters of CancelExecutionReleaseStage  CancelExecutionReleaseStageRequest
     * @return CancelExecutionReleaseStageResponse
     */
    CompletableFuture<CancelExecutionReleaseStageResponse> cancelExecutionReleaseStage(CancelExecutionReleaseStageRequest request);

    /**
     * @param request the request parameters of CloseMergeRequest  CloseMergeRequestRequest
     * @return CloseMergeRequestResponse
     */
    CompletableFuture<CloseMergeRequestResponse> closeMergeRequest(CloseMergeRequestRequest request);

    /**
     * @param request the request parameters of CreateAppMembers  CreateAppMembersRequest
     * @return CreateAppMembersResponse
     */
    CompletableFuture<CreateAppMembersResponse> createAppMembers(CreateAppMembersRequest request);

    /**
     * @param request the request parameters of CreateBranch  CreateBranchRequest
     * @return CreateBranchResponse
     */
    CompletableFuture<CreateBranchResponse> createBranch(CreateBranchRequest request);

    /**
     * @param request the request parameters of CreateChangeRequest  CreateChangeRequestRequest
     * @return CreateChangeRequestResponse
     */
    CompletableFuture<CreateChangeRequestResponse> createChangeRequest(CreateChangeRequestRequest request);

    /**
     * @param request the request parameters of CreateCheckRun  CreateCheckRunRequest
     * @return CreateCheckRunResponse
     */
    CompletableFuture<CreateCheckRunResponse> createCheckRun(CreateCheckRunRequest request);

    /**
     * @param request the request parameters of CreateComment  CreateCommentRequest
     * @return CreateCommentResponse
     */
    CompletableFuture<CreateCommentResponse> createComment(CreateCommentRequest request);

    /**
     * @param request the request parameters of CreateCommitStatus  CreateCommitStatusRequest
     * @return CreateCommitStatusResponse
     */
    CompletableFuture<CreateCommitStatusResponse> createCommitStatus(CreateCommitStatusRequest request);

    /**
     * @param request the request parameters of CreateCommitWithMultipleFiles  CreateCommitWithMultipleFilesRequest
     * @return CreateCommitWithMultipleFilesResponse
     */
    CompletableFuture<CreateCommitWithMultipleFilesResponse> createCommitWithMultipleFiles(CreateCommitWithMultipleFilesRequest request);

    /**
     * @param request the request parameters of CreateDeployKey  CreateDeployKeyRequest
     * @return CreateDeployKeyResponse
     */
    CompletableFuture<CreateDeployKeyResponse> createDeployKey(CreateDeployKeyRequest request);

    /**
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    /**
     * @param request the request parameters of CreateFlowTag  CreateFlowTagRequest
     * @return CreateFlowTagResponse
     */
    CompletableFuture<CreateFlowTagResponse> createFlowTag(CreateFlowTagRequest request);

    /**
     * @param request the request parameters of CreateFlowTagGroup  CreateFlowTagGroupRequest
     * @return CreateFlowTagGroupResponse
     */
    CompletableFuture<CreateFlowTagGroupResponse> createFlowTagGroup(CreateFlowTagGroupRequest request);

    /**
     * @param request the request parameters of CreateHostGroup  CreateHostGroupRequest
     * @return CreateHostGroupResponse
     */
    CompletableFuture<CreateHostGroupResponse> createHostGroup(CreateHostGroupRequest request);

    /**
     * @param request the request parameters of CreateMergeRequest  CreateMergeRequestRequest
     * @return CreateMergeRequestResponse
     */
    CompletableFuture<CreateMergeRequestResponse> createMergeRequest(CreateMergeRequestRequest request);

    /**
     * @param request the request parameters of CreateOAuthToken  CreateOAuthTokenRequest
     * @return CreateOAuthTokenResponse
     */
    CompletableFuture<CreateOAuthTokenResponse> createOAuthToken(CreateOAuthTokenRequest request);

    /**
     * @param request the request parameters of CreatePipeline  CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    /**
     * @param request the request parameters of CreatePipelineGroup  CreatePipelineGroupRequest
     * @return CreatePipelineGroupResponse
     */
    CompletableFuture<CreatePipelineGroupResponse> createPipelineGroup(CreatePipelineGroupRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateProjectLabel  CreateProjectLabelRequest
     * @return CreateProjectLabelResponse
     */
    CompletableFuture<CreateProjectLabelResponse> createProjectLabel(CreateProjectLabelRequest request);

    /**
     * @param request the request parameters of CreateProtectdBranch  CreateProtectdBranchRequest
     * @return CreateProtectdBranchResponse
     */
    CompletableFuture<CreateProtectdBranchResponse> createProtectdBranch(CreateProtectdBranchRequest request);

    /**
     * @param request the request parameters of CreatePushRule  CreatePushRuleRequest
     * @return CreatePushRuleResponse
     */
    CompletableFuture<CreatePushRuleResponse> createPushRule(CreatePushRuleRequest request);

    /**
     * @param request the request parameters of CreateRepository  CreateRepositoryRequest
     * @return CreateRepositoryResponse
     */
    CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request);

    /**
     * @param request the request parameters of CreateRepositoryGroup  CreateRepositoryGroupRequest
     * @return CreateRepositoryGroupResponse
     */
    CompletableFuture<CreateRepositoryGroupResponse> createRepositoryGroup(CreateRepositoryGroupRequest request);

    /**
     * @param request the request parameters of CreateResourceMember  CreateResourceMemberRequest
     * @return CreateResourceMemberResponse
     */
    CompletableFuture<CreateResourceMemberResponse> createResourceMember(CreateResourceMemberRequest request);

    /**
     * @param request the request parameters of CreateServiceAuth  CreateServiceAuthRequest
     * @return CreateServiceAuthResponse
     */
    CompletableFuture<CreateServiceAuthResponse> createServiceAuth(CreateServiceAuthRequest request);

    /**
     * @param request the request parameters of CreateServiceConnection  CreateServiceConnectionRequest
     * @return CreateServiceConnectionResponse
     */
    CompletableFuture<CreateServiceConnectionResponse> createServiceConnection(CreateServiceConnectionRequest request);

    /**
     * @param request the request parameters of CreateServiceCredential  CreateServiceCredentialRequest
     * @return CreateServiceCredentialResponse
     */
    CompletableFuture<CreateServiceCredentialResponse> createServiceCredential(CreateServiceCredentialRequest request);

    /**
     * @param request the request parameters of CreateSprint  CreateSprintRequest
     * @return CreateSprintResponse
     */
    CompletableFuture<CreateSprintResponse> createSprint(CreateSprintRequest request);

    /**
     * @param request the request parameters of CreateSshKey  CreateSshKeyRequest
     * @return CreateSshKeyResponse
     */
    CompletableFuture<CreateSshKeyResponse> createSshKey(CreateSshKeyRequest request);

    /**
     * @param request the request parameters of CreateTag  CreateTagRequest
     * @return CreateTagResponse
     */
    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    /**
     * @param request the request parameters of CreateTestCase  CreateTestCaseRequest
     * @return CreateTestCaseResponse
     */
    CompletableFuture<CreateTestCaseResponse> createTestCase(CreateTestCaseRequest request);

    /**
     * @param request the request parameters of CreateUserKey  CreateUserKeyRequest
     * @return CreateUserKeyResponse
     */
    CompletableFuture<CreateUserKeyResponse> createUserKey(CreateUserKeyRequest request);

    /**
     * @param request the request parameters of CreateVariableGroup  CreateVariableGroupRequest
     * @return CreateVariableGroupResponse
     */
    CompletableFuture<CreateVariableGroupResponse> createVariableGroup(CreateVariableGroupRequest request);

    /**
     * @param request the request parameters of CreateWorkitem  CreateWorkitemRequest
     * @return CreateWorkitemResponse
     */
    CompletableFuture<CreateWorkitemResponse> createWorkitem(CreateWorkitemRequest request);

    /**
     * @param request the request parameters of CreateWorkitemComment  CreateWorkitemCommentRequest
     * @return CreateWorkitemCommentResponse
     */
    CompletableFuture<CreateWorkitemCommentResponse> createWorkitemComment(CreateWorkitemCommentRequest request);

    /**
     * @param request the request parameters of CreateWorkitemEstimate  CreateWorkitemEstimateRequest
     * @return CreateWorkitemEstimateResponse
     */
    CompletableFuture<CreateWorkitemEstimateResponse> createWorkitemEstimate(CreateWorkitemEstimateRequest request);

    /**
     * @param request the request parameters of CreateWorkitemRecord  CreateWorkitemRecordRequest
     * @return CreateWorkitemRecordResponse
     */
    CompletableFuture<CreateWorkitemRecordResponse> createWorkitemRecord(CreateWorkitemRecordRequest request);

    /**
     * @param request the request parameters of CreateWorkitemV2  CreateWorkitemV2Request
     * @return CreateWorkitemV2Response
     */
    CompletableFuture<CreateWorkitemV2Response> createWorkitemV2(CreateWorkitemV2Request request);

    /**
     * @param request the request parameters of DeleteAppMember  DeleteAppMemberRequest
     * @return DeleteAppMemberResponse
     */
    CompletableFuture<DeleteAppMemberResponse> deleteAppMember(DeleteAppMemberRequest request);

    /**
     * @param request the request parameters of DeleteBranch  DeleteBranchRequest
     * @return DeleteBranchResponse
     */
    CompletableFuture<DeleteBranchResponse> deleteBranch(DeleteBranchRequest request);

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    /**
     * @param request the request parameters of DeleteFlowTag  DeleteFlowTagRequest
     * @return DeleteFlowTagResponse
     */
    CompletableFuture<DeleteFlowTagResponse> deleteFlowTag(DeleteFlowTagRequest request);

    /**
     * @param request the request parameters of DeleteFlowTagGroup  DeleteFlowTagGroupRequest
     * @return DeleteFlowTagGroupResponse
     */
    CompletableFuture<DeleteFlowTagGroupResponse> deleteFlowTagGroup(DeleteFlowTagGroupRequest request);

    /**
     * @param request the request parameters of DeleteGroupMember  DeleteGroupMemberRequest
     * @return DeleteGroupMemberResponse
     */
    CompletableFuture<DeleteGroupMemberResponse> deleteGroupMember(DeleteGroupMemberRequest request);

    /**
     * @param request the request parameters of DeleteHostGroup  DeleteHostGroupRequest
     * @return DeleteHostGroupResponse
     */
    CompletableFuture<DeleteHostGroupResponse> deleteHostGroup(DeleteHostGroupRequest request);

    /**
     * @param request the request parameters of DeletePipeline  DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    /**
     * @param request the request parameters of DeletePipelineGroup  DeletePipelineGroupRequest
     * @return DeletePipelineGroupResponse
     */
    CompletableFuture<DeletePipelineGroupResponse> deletePipelineGroup(DeletePipelineGroupRequest request);

    /**
     * @param request the request parameters of DeletePipelineRelations  DeletePipelineRelationsRequest
     * @return DeletePipelineRelationsResponse
     */
    CompletableFuture<DeletePipelineRelationsResponse> deletePipelineRelations(DeletePipelineRelationsRequest request);

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * @param request the request parameters of DeleteProjectLabel  DeleteProjectLabelRequest
     * @return DeleteProjectLabelResponse
     */
    CompletableFuture<DeleteProjectLabelResponse> deleteProjectLabel(DeleteProjectLabelRequest request);

    /**
     * @param request the request parameters of DeleteProtectedBranch  DeleteProtectedBranchRequest
     * @return DeleteProtectedBranchResponse
     */
    CompletableFuture<DeleteProtectedBranchResponse> deleteProtectedBranch(DeleteProtectedBranchRequest request);

    /**
     * @param request the request parameters of DeletePushRule  DeletePushRuleRequest
     * @return DeletePushRuleResponse
     */
    CompletableFuture<DeletePushRuleResponse> deletePushRule(DeletePushRuleRequest request);

    /**
     * @param request the request parameters of DeleteRepository  DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     */
    CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request);

    /**
     * @param request the request parameters of DeleteRepositoryGroup  DeleteRepositoryGroupRequest
     * @return DeleteRepositoryGroupResponse
     */
    CompletableFuture<DeleteRepositoryGroupResponse> deleteRepositoryGroup(DeleteRepositoryGroupRequest request);

    /**
     * @param request the request parameters of DeleteRepositoryMember  DeleteRepositoryMemberRequest
     * @return DeleteRepositoryMemberResponse
     */
    CompletableFuture<DeleteRepositoryMemberResponse> deleteRepositoryMember(DeleteRepositoryMemberRequest request);

    /**
     * @param request the request parameters of DeleteRepositoryWebhook  DeleteRepositoryWebhookRequest
     * @return DeleteRepositoryWebhookResponse
     */
    CompletableFuture<DeleteRepositoryWebhookResponse> deleteRepositoryWebhook(DeleteRepositoryWebhookRequest request);

    /**
     * @param request the request parameters of DeleteResourceMember  DeleteResourceMemberRequest
     * @return DeleteResourceMemberResponse
     */
    CompletableFuture<DeleteResourceMemberResponse> deleteResourceMember(DeleteResourceMemberRequest request);

    /**
     * @param request the request parameters of DeleteTag  DeleteTagRequest
     * @return DeleteTagResponse
     */
    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    /**
     * @param request the request parameters of DeleteUserKey  DeleteUserKeyRequest
     * @return DeleteUserKeyResponse
     */
    CompletableFuture<DeleteUserKeyResponse> deleteUserKey(DeleteUserKeyRequest request);

    /**
     * @param request the request parameters of DeleteVariableGroup  DeleteVariableGroupRequest
     * @return DeleteVariableGroupResponse
     */
    CompletableFuture<DeleteVariableGroupResponse> deleteVariableGroup(DeleteVariableGroupRequest request);

    /**
     * @param request the request parameters of DeleteWorkitem  DeleteWorkitemRequest
     * @return DeleteWorkitemResponse
     */
    CompletableFuture<DeleteWorkitemResponse> deleteWorkitem(DeleteWorkitemRequest request);

    /**
     * @param request the request parameters of DeleteWorkitemAllComment  DeleteWorkitemAllCommentRequest
     * @return DeleteWorkitemAllCommentResponse
     */
    CompletableFuture<DeleteWorkitemAllCommentResponse> deleteWorkitemAllComment(DeleteWorkitemAllCommentRequest request);

    /**
     * @param request the request parameters of DeleteWorkitemComment  DeleteWorkitemCommentRequest
     * @return DeleteWorkitemCommentResponse
     */
    CompletableFuture<DeleteWorkitemCommentResponse> deleteWorkitemComment(DeleteWorkitemCommentRequest request);

    /**
     * @param request the request parameters of EnableDeployKey  EnableDeployKeyRequest
     * @return EnableDeployKeyResponse
     */
    CompletableFuture<EnableDeployKeyResponse> enableDeployKey(EnableDeployKeyRequest request);

    /**
     * @param request the request parameters of ExecuteChangeRequestReleaseStage  ExecuteChangeRequestReleaseStageRequest
     * @return ExecuteChangeRequestReleaseStageResponse
     */
    CompletableFuture<ExecuteChangeRequestReleaseStageResponse> executeChangeRequestReleaseStage(ExecuteChangeRequestReleaseStageRequest request);

    /**
     * @param request the request parameters of ExportInsightCustomValue  ExportInsightCustomValueRequest
     * @return ExportInsightCustomValueResponse
     */
    CompletableFuture<ExportInsightCustomValueResponse> exportInsightCustomValue(ExportInsightCustomValueRequest request);

    /**
     * @param request the request parameters of ExportInsightExpectedWorkTime  ExportInsightExpectedWorkTimeRequest
     * @return ExportInsightExpectedWorkTimeResponse
     */
    CompletableFuture<ExportInsightExpectedWorkTimeResponse> exportInsightExpectedWorkTime(ExportInsightExpectedWorkTimeRequest request);

    /**
     * @param request the request parameters of ExportInsightField  ExportInsightFieldRequest
     * @return ExportInsightFieldResponse
     */
    CompletableFuture<ExportInsightFieldResponse> exportInsightField(ExportInsightFieldRequest request);

    /**
     * @param request the request parameters of ExportInsightSpace  ExportInsightSpaceRequest
     * @return ExportInsightSpaceResponse
     */
    CompletableFuture<ExportInsightSpaceResponse> exportInsightSpace(ExportInsightSpaceRequest request);

    /**
     * @param request the request parameters of ExportInsightSpaceRef  ExportInsightSpaceRefRequest
     * @return ExportInsightSpaceRefResponse
     */
    CompletableFuture<ExportInsightSpaceRefResponse> exportInsightSpaceRef(ExportInsightSpaceRefRequest request);

    /**
     * @param request the request parameters of ExportInsightSprint  ExportInsightSprintRequest
     * @return ExportInsightSprintResponse
     */
    CompletableFuture<ExportInsightSprintResponse> exportInsightSprint(ExportInsightSprintRequest request);

    /**
     * @param request the request parameters of ExportInsightTagRef  ExportInsightTagRefRequest
     * @return ExportInsightTagRefResponse
     */
    CompletableFuture<ExportInsightTagRefResponse> exportInsightTagRef(ExportInsightTagRefRequest request);

    /**
     * @param request the request parameters of ExportInsightWorkTime  ExportInsightWorkTimeRequest
     * @return ExportInsightWorkTimeResponse
     */
    CompletableFuture<ExportInsightWorkTimeResponse> exportInsightWorkTime(ExportInsightWorkTimeRequest request);

    /**
     * @param request the request parameters of ExportInsightWorkitemStatus  ExportInsightWorkitemStatusRequest
     * @return ExportInsightWorkitemStatusResponse
     */
    CompletableFuture<ExportInsightWorkitemStatusResponse> exportInsightWorkitemStatus(ExportInsightWorkitemStatusRequest request);

    /**
     * @param request the request parameters of ExportInsightWorkitemStatusJoinWorkitemDefectExtra  ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest
     * @return ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse
     */
    CompletableFuture<ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse> exportInsightWorkitemStatusJoinWorkitemDefectExtra(ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest request);

    /**
     * @param request the request parameters of ExportInsightWorkitemVersion  ExportInsightWorkitemVersionRequest
     * @return ExportInsightWorkitemVersionResponse
     */
    CompletableFuture<ExportInsightWorkitemVersionResponse> exportInsightWorkitemVersion(ExportInsightWorkitemVersionRequest request);

    /**
     * @param request the request parameters of ExportWorkitemActivity  ExportWorkitemActivityRequest
     * @return ExportWorkitemActivityResponse
     */
    CompletableFuture<ExportWorkitemActivityResponse> exportWorkitemActivity(ExportWorkitemActivityRequest request);

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of GetBranchInfo  GetBranchInfoRequest
     * @return GetBranchInfoResponse
     */
    CompletableFuture<GetBranchInfoResponse> getBranchInfo(GetBranchInfoRequest request);

    /**
     * @param request the request parameters of GetCheckRun  GetCheckRunRequest
     * @return GetCheckRunResponse
     */
    CompletableFuture<GetCheckRunResponse> getCheckRun(GetCheckRunRequest request);

    /**
     * @param request the request parameters of GetCodeupOrganization  GetCodeupOrganizationRequest
     * @return GetCodeupOrganizationResponse
     */
    CompletableFuture<GetCodeupOrganizationResponse> getCodeupOrganization(GetCodeupOrganizationRequest request);

    /**
     * @param request the request parameters of GetCompareDetail  GetCompareDetailRequest
     * @return GetCompareDetailResponse
     */
    CompletableFuture<GetCompareDetailResponse> getCompareDetail(GetCompareDetailRequest request);

    /**
     * @param request the request parameters of GetCustomFieldOption  GetCustomFieldOptionRequest
     * @return GetCustomFieldOptionResponse
     */
    CompletableFuture<GetCustomFieldOptionResponse> getCustomFieldOption(GetCustomFieldOptionRequest request);

    /**
     * @param request the request parameters of GetFileBlobs  GetFileBlobsRequest
     * @return GetFileBlobsResponse
     */
    CompletableFuture<GetFileBlobsResponse> getFileBlobs(GetFileBlobsRequest request);

    /**
     * @param request the request parameters of GetFileLastCommit  GetFileLastCommitRequest
     * @return GetFileLastCommitResponse
     */
    CompletableFuture<GetFileLastCommitResponse> getFileLastCommit(GetFileLastCommitRequest request);

    /**
     * @param request the request parameters of GetFlowTagGroup  GetFlowTagGroupRequest
     * @return GetFlowTagGroupResponse
     */
    CompletableFuture<GetFlowTagGroupResponse> getFlowTagGroup(GetFlowTagGroupRequest request);

    /**
     * @param request the request parameters of GetGroupByPath  GetGroupByPathRequest
     * @return GetGroupByPathResponse
     */
    CompletableFuture<GetGroupByPathResponse> getGroupByPath(GetGroupByPathRequest request);

    /**
     * @param request the request parameters of GetGroupDetail  GetGroupDetailRequest
     * @return GetGroupDetailResponse
     */
    CompletableFuture<GetGroupDetailResponse> getGroupDetail(GetGroupDetailRequest request);

    /**
     * @param request the request parameters of GetHostGroup  GetHostGroupRequest
     * @return GetHostGroupResponse
     */
    CompletableFuture<GetHostGroupResponse> getHostGroup(GetHostGroupRequest request);

    /**
     * @param request the request parameters of GetMergeRequest  GetMergeRequestRequest
     * @return GetMergeRequestResponse
     */
    CompletableFuture<GetMergeRequestResponse> getMergeRequest(GetMergeRequestRequest request);

    /**
     * @param request the request parameters of GetMergeRequestChangeTree  GetMergeRequestChangeTreeRequest
     * @return GetMergeRequestChangeTreeResponse
     */
    CompletableFuture<GetMergeRequestChangeTreeResponse> getMergeRequestChangeTree(GetMergeRequestChangeTreeRequest request);

    /**
     * @param request the request parameters of GetOrganizationMember  GetOrganizationMemberRequest
     * @return GetOrganizationMemberResponse
     */
    CompletableFuture<GetOrganizationMemberResponse> getOrganizationMember(GetOrganizationMemberRequest request);

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    /**
     * @param request the request parameters of GetPipelineArtifactUrl  GetPipelineArtifactUrlRequest
     * @return GetPipelineArtifactUrlResponse
     */
    CompletableFuture<GetPipelineArtifactUrlResponse> getPipelineArtifactUrl(GetPipelineArtifactUrlRequest request);

    /**
     * @param request the request parameters of GetPipelineEmasArtifactUrl  GetPipelineEmasArtifactUrlRequest
     * @return GetPipelineEmasArtifactUrlResponse
     */
    CompletableFuture<GetPipelineEmasArtifactUrlResponse> getPipelineEmasArtifactUrl(GetPipelineEmasArtifactUrlRequest request);

    /**
     * @param request the request parameters of GetPipelineGroup  GetPipelineGroupRequest
     * @return GetPipelineGroupResponse
     */
    CompletableFuture<GetPipelineGroupResponse> getPipelineGroup(GetPipelineGroupRequest request);

    /**
     * @param request the request parameters of GetPipelineRun  GetPipelineRunRequest
     * @return GetPipelineRunResponse
     */
    CompletableFuture<GetPipelineRunResponse> getPipelineRun(GetPipelineRunRequest request);

    /**
     * @param request the request parameters of GetPipelineScanReportUrl  GetPipelineScanReportUrlRequest
     * @return GetPipelineScanReportUrlResponse
     */
    CompletableFuture<GetPipelineScanReportUrlResponse> getPipelineScanReportUrl(GetPipelineScanReportUrlRequest request);

    /**
     * @param request the request parameters of GetProjectInfo  GetProjectInfoRequest
     * @return GetProjectInfoResponse
     */
    CompletableFuture<GetProjectInfoResponse> getProjectInfo(GetProjectInfoRequest request);

    /**
     * @param request the request parameters of GetProjectMember  GetProjectMemberRequest
     * @return GetProjectMemberResponse
     */
    CompletableFuture<GetProjectMemberResponse> getProjectMember(GetProjectMemberRequest request);

    /**
     * @param request the request parameters of GetReleaseStagePipelineRun  GetReleaseStagePipelineRunRequest
     * @return GetReleaseStagePipelineRunResponse
     */
    CompletableFuture<GetReleaseStagePipelineRunResponse> getReleaseStagePipelineRun(GetReleaseStagePipelineRunRequest request);

    /**
     * @param request the request parameters of GetRepository  GetRepositoryRequest
     * @return GetRepositoryResponse
     */
    CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request);

    /**
     * @param request the request parameters of GetRepositoryCommit  GetRepositoryCommitRequest
     * @return GetRepositoryCommitResponse
     */
    CompletableFuture<GetRepositoryCommitResponse> getRepositoryCommit(GetRepositoryCommitRequest request);

    /**
     * @param request the request parameters of GetRepositoryTag  GetRepositoryTagRequest
     * @return GetRepositoryTagResponse
     */
    CompletableFuture<GetRepositoryTagResponse> getRepositoryTag(GetRepositoryTagRequest request);

    /**
     * @param request the request parameters of GetSearchCodePreview  GetSearchCodePreviewRequest
     * @return GetSearchCodePreviewResponse
     */
    CompletableFuture<GetSearchCodePreviewResponse> getSearchCodePreview(GetSearchCodePreviewRequest request);

    /**
     * @param request the request parameters of GetSprintInfo  GetSprintInfoRequest
     * @return GetSprintInfoResponse
     */
    CompletableFuture<GetSprintInfoResponse> getSprintInfo(GetSprintInfoRequest request);

    /**
     * @param request the request parameters of GetTestResultList  GetTestResultListRequest
     * @return GetTestResultListResponse
     */
    CompletableFuture<GetTestResultListResponse> getTestResultList(GetTestResultListRequest request);

    /**
     * @param request the request parameters of GetTestcaseList  GetTestcaseListRequest
     * @return GetTestcaseListResponse
     */
    CompletableFuture<GetTestcaseListResponse> getTestcaseList(GetTestcaseListRequest request);

    /**
     * @param request the request parameters of GetUserInfo  GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

    /**
     * @param request the request parameters of GetVMDeployOrder  GetVMDeployOrderRequest
     * @return GetVMDeployOrderResponse
     */
    CompletableFuture<GetVMDeployOrderResponse> getVMDeployOrder(GetVMDeployOrderRequest request);

    /**
     * @param request the request parameters of GetVariableGroup  GetVariableGroupRequest
     * @return GetVariableGroupResponse
     */
    CompletableFuture<GetVariableGroupResponse> getVariableGroup(GetVariableGroupRequest request);

    /**
     * @param request the request parameters of GetWorkItemActivity  GetWorkItemActivityRequest
     * @return GetWorkItemActivityResponse
     */
    CompletableFuture<GetWorkItemActivityResponse> getWorkItemActivity(GetWorkItemActivityRequest request);

    /**
     * @param request the request parameters of GetWorkItemInfo  GetWorkItemInfoRequest
     * @return GetWorkItemInfoResponse
     */
    CompletableFuture<GetWorkItemInfoResponse> getWorkItemInfo(GetWorkItemInfoRequest request);

    /**
     * @param request the request parameters of GetWorkItemWorkFlowInfo  GetWorkItemWorkFlowInfoRequest
     * @return GetWorkItemWorkFlowInfoResponse
     */
    CompletableFuture<GetWorkItemWorkFlowInfoResponse> getWorkItemWorkFlowInfo(GetWorkItemWorkFlowInfoRequest request);

    /**
     * @param request the request parameters of GetWorkitemAttachmentCreatemeta  GetWorkitemAttachmentCreatemetaRequest
     * @return GetWorkitemAttachmentCreatemetaResponse
     */
    CompletableFuture<GetWorkitemAttachmentCreatemetaResponse> getWorkitemAttachmentCreatemeta(GetWorkitemAttachmentCreatemetaRequest request);

    /**
     * @param request the request parameters of GetWorkitemCommentList  GetWorkitemCommentListRequest
     * @return GetWorkitemCommentListResponse
     */
    CompletableFuture<GetWorkitemCommentListResponse> getWorkitemCommentList(GetWorkitemCommentListRequest request);

    /**
     * @param request the request parameters of GetWorkitemFile  GetWorkitemFileRequest
     * @return GetWorkitemFileResponse
     */
    CompletableFuture<GetWorkitemFileResponse> getWorkitemFile(GetWorkitemFileRequest request);

    /**
     * @param request the request parameters of GetWorkitemRelations  GetWorkitemRelationsRequest
     * @return GetWorkitemRelationsResponse
     */
    CompletableFuture<GetWorkitemRelationsResponse> getWorkitemRelations(GetWorkitemRelationsRequest request);

    /**
     * @param request the request parameters of GetWorkitemTimeTypeList  GetWorkitemTimeTypeListRequest
     * @return GetWorkitemTimeTypeListResponse
     */
    CompletableFuture<GetWorkitemTimeTypeListResponse> getWorkitemTimeTypeList(GetWorkitemTimeTypeListRequest request);

    /**
     * @param request the request parameters of JoinPipelineGroup  JoinPipelineGroupRequest
     * @return JoinPipelineGroupResponse
     */
    CompletableFuture<JoinPipelineGroupResponse> joinPipelineGroup(JoinPipelineGroupRequest request);

    /**
     * @param request the request parameters of LinkMergeRequestLabel  LinkMergeRequestLabelRequest
     * @return LinkMergeRequestLabelResponse
     */
    CompletableFuture<LinkMergeRequestLabelResponse> linkMergeRequestLabel(LinkMergeRequestLabelRequest request);

    /**
     * @param request the request parameters of ListAllReleaseWorkflows  ListAllReleaseWorkflowsRequest
     * @return ListAllReleaseWorkflowsResponse
     */
    CompletableFuture<ListAllReleaseWorkflowsResponse> listAllReleaseWorkflows(ListAllReleaseWorkflowsRequest request);

    /**
     * @param request the request parameters of ListAppReleaseStageExecutionIntegratedMetadata  ListAppReleaseStageExecutionIntegratedMetadataRequest
     * @return ListAppReleaseStageExecutionIntegratedMetadataResponse
     */
    CompletableFuture<ListAppReleaseStageExecutionIntegratedMetadataResponse> listAppReleaseStageExecutionIntegratedMetadata(ListAppReleaseStageExecutionIntegratedMetadataRequest request);

    /**
     * @param request the request parameters of ListAppReleaseStageExecutions  ListAppReleaseStageExecutionsRequest
     * @return ListAppReleaseStageExecutionsResponse
     */
    CompletableFuture<ListAppReleaseStageExecutionsResponse> listAppReleaseStageExecutions(ListAppReleaseStageExecutionsRequest request);

    /**
     * @param request the request parameters of ListApplicationMembers  ListApplicationMembersRequest
     * @return ListApplicationMembersResponse
     */
    CompletableFuture<ListApplicationMembersResponse> listApplicationMembers(ListApplicationMembersRequest request);

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * @param request the request parameters of ListChangeRequestWorkflowExecutions  ListChangeRequestWorkflowExecutionsRequest
     * @return ListChangeRequestWorkflowExecutionsResponse
     */
    CompletableFuture<ListChangeRequestWorkflowExecutionsResponse> listChangeRequestWorkflowExecutions(ListChangeRequestWorkflowExecutionsRequest request);

    /**
     * @param request the request parameters of ListChangeRequests  ListChangeRequestsRequest
     * @return ListChangeRequestsResponse
     */
    CompletableFuture<ListChangeRequestsResponse> listChangeRequests(ListChangeRequestsRequest request);

    /**
     * @param request the request parameters of ListCheckRuns  ListCheckRunsRequest
     * @return ListCheckRunsResponse
     */
    CompletableFuture<ListCheckRunsResponse> listCheckRuns(ListCheckRunsRequest request);

    /**
     * @param request the request parameters of ListCommitStatuses  ListCommitStatusesRequest
     * @return ListCommitStatusesResponse
     */
    CompletableFuture<ListCommitStatusesResponse> listCommitStatuses(ListCommitStatusesRequest request);

    /**
     * @param request the request parameters of ListFlowTagGroups  ListFlowTagGroupsRequest
     * @return ListFlowTagGroupsResponse
     */
    CompletableFuture<ListFlowTagGroupsResponse> listFlowTagGroups(ListFlowTagGroupsRequest request);

    /**
     * @param request the request parameters of ListGroupMember  ListGroupMemberRequest
     * @return ListGroupMemberResponse
     */
    CompletableFuture<ListGroupMemberResponse> listGroupMember(ListGroupMemberRequest request);

    /**
     * @param request the request parameters of ListGroupRepositories  ListGroupRepositoriesRequest
     * @return ListGroupRepositoriesResponse
     */
    CompletableFuture<ListGroupRepositoriesResponse> listGroupRepositories(ListGroupRepositoriesRequest request);

    /**
     * @param request the request parameters of ListHostGroups  ListHostGroupsRequest
     * @return ListHostGroupsResponse
     */
    CompletableFuture<ListHostGroupsResponse> listHostGroups(ListHostGroupsRequest request);

    /**
     * @param request the request parameters of ListJoinedOrganizations  ListJoinedOrganizationsRequest
     * @return ListJoinedOrganizationsResponse
     */
    CompletableFuture<ListJoinedOrganizationsResponse> listJoinedOrganizations(ListJoinedOrganizationsRequest request);

    /**
     * @param request the request parameters of ListMergeRequestComments  ListMergeRequestCommentsRequest
     * @return ListMergeRequestCommentsResponse
     */
    CompletableFuture<ListMergeRequestCommentsResponse> listMergeRequestComments(ListMergeRequestCommentsRequest request);

    /**
     * @param request the request parameters of ListMergeRequestFilesReads  ListMergeRequestFilesReadsRequest
     * @return ListMergeRequestFilesReadsResponse
     */
    CompletableFuture<ListMergeRequestFilesReadsResponse> listMergeRequestFilesReads(ListMergeRequestFilesReadsRequest request);

    /**
     * @param request the request parameters of ListMergeRequestLabels  ListMergeRequestLabelsRequest
     * @return ListMergeRequestLabelsResponse
     */
    CompletableFuture<ListMergeRequestLabelsResponse> listMergeRequestLabels(ListMergeRequestLabelsRequest request);

    /**
     * @param request the request parameters of ListMergeRequestPatchSets  ListMergeRequestPatchSetsRequest
     * @return ListMergeRequestPatchSetsResponse
     */
    CompletableFuture<ListMergeRequestPatchSetsResponse> listMergeRequestPatchSets(ListMergeRequestPatchSetsRequest request);

    /**
     * @param request the request parameters of ListMergeRequests  ListMergeRequestsRequest
     * @return ListMergeRequestsResponse
     */
    CompletableFuture<ListMergeRequestsResponse> listMergeRequests(ListMergeRequestsRequest request);

    /**
     * @param request the request parameters of ListOrganizationMembers  ListOrganizationMembersRequest
     * @return ListOrganizationMembersResponse
     */
    CompletableFuture<ListOrganizationMembersResponse> listOrganizationMembers(ListOrganizationMembersRequest request);

    /**
     * @param request the request parameters of ListOrganizations  ListOrganizationsRequest
     * @return ListOrganizationsResponse
     */
    CompletableFuture<ListOrganizationsResponse> listOrganizations(ListOrganizationsRequest request);

    /**
     * @param request the request parameters of ListPipelineGroupPipelines  ListPipelineGroupPipelinesRequest
     * @return ListPipelineGroupPipelinesResponse
     */
    CompletableFuture<ListPipelineGroupPipelinesResponse> listPipelineGroupPipelines(ListPipelineGroupPipelinesRequest request);

    /**
     * @param request the request parameters of ListPipelineGroups  ListPipelineGroupsRequest
     * @return ListPipelineGroupsResponse
     */
    CompletableFuture<ListPipelineGroupsResponse> listPipelineGroups(ListPipelineGroupsRequest request);

    /**
     * @param request the request parameters of ListPipelineJobHistorys  ListPipelineJobHistorysRequest
     * @return ListPipelineJobHistorysResponse
     */
    CompletableFuture<ListPipelineJobHistorysResponse> listPipelineJobHistorys(ListPipelineJobHistorysRequest request);

    /**
     * @param request the request parameters of ListPipelineJobs  ListPipelineJobsRequest
     * @return ListPipelineJobsResponse
     */
    CompletableFuture<ListPipelineJobsResponse> listPipelineJobs(ListPipelineJobsRequest request);

    /**
     * @param request the request parameters of ListPipelineRelations  ListPipelineRelationsRequest
     * @return ListPipelineRelationsResponse
     */
    CompletableFuture<ListPipelineRelationsResponse> listPipelineRelations(ListPipelineRelationsRequest request);

    /**
     * @param request the request parameters of ListPipelineRuns  ListPipelineRunsRequest
     * @return ListPipelineRunsResponse
     */
    CompletableFuture<ListPipelineRunsResponse> listPipelineRuns(ListPipelineRunsRequest request);

    /**
     * @param request the request parameters of ListPipelines  ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    /**
     * @param request the request parameters of ListProjectLabels  ListProjectLabelsRequest
     * @return ListProjectLabelsResponse
     */
    CompletableFuture<ListProjectLabelsResponse> listProjectLabels(ListProjectLabelsRequest request);

    /**
     * @param request the request parameters of ListProjectMembers  ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request);

    /**
     * @param request the request parameters of ListProjectTemplates  ListProjectTemplatesRequest
     * @return ListProjectTemplatesResponse
     */
    CompletableFuture<ListProjectTemplatesResponse> listProjectTemplates(ListProjectTemplatesRequest request);

    /**
     * @param request the request parameters of ListProjectWorkitemTypes  ListProjectWorkitemTypesRequest
     * @return ListProjectWorkitemTypesResponse
     */
    CompletableFuture<ListProjectWorkitemTypesResponse> listProjectWorkitemTypes(ListProjectWorkitemTypesRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @param request the request parameters of ListProtectedBranches  ListProtectedBranchesRequest
     * @return ListProtectedBranchesResponse
     */
    CompletableFuture<ListProtectedBranchesResponse> listProtectedBranches(ListProtectedBranchesRequest request);

    /**
     * @param request the request parameters of ListPushRules  ListPushRulesRequest
     * @return ListPushRulesResponse
     */
    CompletableFuture<ListPushRulesResponse> listPushRules(ListPushRulesRequest request);

    /**
     * @param request the request parameters of ListRepositories  ListRepositoriesRequest
     * @return ListRepositoriesResponse
     */
    CompletableFuture<ListRepositoriesResponse> listRepositories(ListRepositoriesRequest request);

    /**
     * @param request the request parameters of ListRepositoryBranches  ListRepositoryBranchesRequest
     * @return ListRepositoryBranchesResponse
     */
    CompletableFuture<ListRepositoryBranchesResponse> listRepositoryBranches(ListRepositoryBranchesRequest request);

    /**
     * @param request the request parameters of ListRepositoryCommitDiff  ListRepositoryCommitDiffRequest
     * @return ListRepositoryCommitDiffResponse
     */
    CompletableFuture<ListRepositoryCommitDiffResponse> listRepositoryCommitDiff(ListRepositoryCommitDiffRequest request);

    /**
     * @param request the request parameters of ListRepositoryCommits  ListRepositoryCommitsRequest
     * @return ListRepositoryCommitsResponse
     */
    CompletableFuture<ListRepositoryCommitsResponse> listRepositoryCommits(ListRepositoryCommitsRequest request);

    /**
     * @param request the request parameters of ListRepositoryGroups  ListRepositoryGroupsRequest
     * @return ListRepositoryGroupsResponse
     */
    CompletableFuture<ListRepositoryGroupsResponse> listRepositoryGroups(ListRepositoryGroupsRequest request);

    /**
     * @param request the request parameters of ListRepositoryMemberWithInherited  ListRepositoryMemberWithInheritedRequest
     * @return ListRepositoryMemberWithInheritedResponse
     */
    CompletableFuture<ListRepositoryMemberWithInheritedResponse> listRepositoryMemberWithInherited(ListRepositoryMemberWithInheritedRequest request);

    /**
     * @param request the request parameters of ListRepositoryTags  ListRepositoryTagsRequest
     * @return ListRepositoryTagsResponse
     */
    CompletableFuture<ListRepositoryTagsResponse> listRepositoryTags(ListRepositoryTagsRequest request);

    /**
     * @param request the request parameters of ListRepositoryTree  ListRepositoryTreeRequest
     * @return ListRepositoryTreeResponse
     */
    CompletableFuture<ListRepositoryTreeResponse> listRepositoryTree(ListRepositoryTreeRequest request);

    /**
     * @param request the request parameters of ListRepositoryWebhook  ListRepositoryWebhookRequest
     * @return ListRepositoryWebhookResponse
     */
    CompletableFuture<ListRepositoryWebhookResponse> listRepositoryWebhook(ListRepositoryWebhookRequest request);

    /**
     * @param request the request parameters of ListResourceMembers  ListResourceMembersRequest
     * @return ListResourceMembersResponse
     */
    CompletableFuture<ListResourceMembersResponse> listResourceMembers(ListResourceMembersRequest request);

    /**
     * @param request the request parameters of ListSearchCommit  ListSearchCommitRequest
     * @return ListSearchCommitResponse
     */
    CompletableFuture<ListSearchCommitResponse> listSearchCommit(ListSearchCommitRequest request);

    /**
     * @param request the request parameters of ListSearchRepository  ListSearchRepositoryRequest
     * @return ListSearchRepositoryResponse
     */
    CompletableFuture<ListSearchRepositoryResponse> listSearchRepository(ListSearchRepositoryRequest request);

    /**
     * @param request the request parameters of ListSearchSourceCode  ListSearchSourceCodeRequest
     * @return ListSearchSourceCodeResponse
     */
    CompletableFuture<ListSearchSourceCodeResponse> listSearchSourceCode(ListSearchSourceCodeRequest request);

    /**
     * @param request the request parameters of ListServiceAuths  ListServiceAuthsRequest
     * @return ListServiceAuthsResponse
     */
    CompletableFuture<ListServiceAuthsResponse> listServiceAuths(ListServiceAuthsRequest request);

    /**
     * @param request the request parameters of ListServiceConnections  ListServiceConnectionsRequest
     * @return ListServiceConnectionsResponse
     */
    CompletableFuture<ListServiceConnectionsResponse> listServiceConnections(ListServiceConnectionsRequest request);

    /**
     * @param request the request parameters of ListServiceCredentials  ListServiceCredentialsRequest
     * @return ListServiceCredentialsResponse
     */
    CompletableFuture<ListServiceCredentialsResponse> listServiceCredentials(ListServiceCredentialsRequest request);

    /**
     * @param request the request parameters of ListSprints  ListSprintsRequest
     * @return ListSprintsResponse
     */
    CompletableFuture<ListSprintsResponse> listSprints(ListSprintsRequest request);

    /**
     * @param request the request parameters of ListTestCaseFields  ListTestCaseFieldsRequest
     * @return ListTestCaseFieldsResponse
     */
    CompletableFuture<ListTestCaseFieldsResponse> listTestCaseFields(ListTestCaseFieldsRequest request);

    /**
     * @param request the request parameters of ListUserDrawRecordByPk  ListUserDrawRecordByPkRequest
     * @return ListUserDrawRecordByPkResponse
     */
    CompletableFuture<ListUserDrawRecordByPkResponse> listUserDrawRecordByPk(ListUserDrawRecordByPkRequest request);

    /**
     * @param request the request parameters of ListUserKeys  ListUserKeysRequest
     * @return ListUserKeysResponse
     */
    CompletableFuture<ListUserKeysResponse> listUserKeys(ListUserKeysRequest request);

    /**
     * @param request the request parameters of ListUserResources  ListUserResourcesRequest
     * @return ListUserResourcesResponse
     */
    CompletableFuture<ListUserResourcesResponse> listUserResources(ListUserResourcesRequest request);

    /**
     * @param request the request parameters of ListVariableGroups  ListVariableGroupsRequest
     * @return ListVariableGroupsResponse
     */
    CompletableFuture<ListVariableGroupsResponse> listVariableGroups(ListVariableGroupsRequest request);

    /**
     * @param request the request parameters of ListWorkItemAllFields  ListWorkItemAllFieldsRequest
     * @return ListWorkItemAllFieldsResponse
     */
    CompletableFuture<ListWorkItemAllFieldsResponse> listWorkItemAllFields(ListWorkItemAllFieldsRequest request);

    /**
     * @param request the request parameters of ListWorkItemWorkFlowStatus  ListWorkItemWorkFlowStatusRequest
     * @return ListWorkItemWorkFlowStatusResponse
     */
    CompletableFuture<ListWorkItemWorkFlowStatusResponse> listWorkItemWorkFlowStatus(ListWorkItemWorkFlowStatusRequest request);

    /**
     * @param request the request parameters of ListWorkitemAttachments  ListWorkitemAttachmentsRequest
     * @return ListWorkitemAttachmentsResponse
     */
    CompletableFuture<ListWorkitemAttachmentsResponse> listWorkitemAttachments(ListWorkitemAttachmentsRequest request);

    /**
     * @param request the request parameters of ListWorkitemEstimate  ListWorkitemEstimateRequest
     * @return ListWorkitemEstimateResponse
     */
    CompletableFuture<ListWorkitemEstimateResponse> listWorkitemEstimate(ListWorkitemEstimateRequest request);

    /**
     * @param request the request parameters of ListWorkitemTime  ListWorkitemTimeRequest
     * @return ListWorkitemTimeResponse
     */
    CompletableFuture<ListWorkitemTimeResponse> listWorkitemTime(ListWorkitemTimeRequest request);

    /**
     * @param request the request parameters of ListWorkitems  ListWorkitemsRequest
     * @return ListWorkitemsResponse
     */
    CompletableFuture<ListWorkitemsResponse> listWorkitems(ListWorkitemsRequest request);

    /**
     * @param request the request parameters of LogPipelineJobRun  LogPipelineJobRunRequest
     * @return LogPipelineJobRunResponse
     */
    CompletableFuture<LogPipelineJobRunResponse> logPipelineJobRun(LogPipelineJobRunRequest request);

    /**
     * @param request the request parameters of LogVMDeployMachine  LogVMDeployMachineRequest
     * @return LogVMDeployMachineResponse
     */
    CompletableFuture<LogVMDeployMachineResponse> logVMDeployMachine(LogVMDeployMachineRequest request);

    /**
     * @param request the request parameters of MergeMergeRequest  MergeMergeRequestRequest
     * @return MergeMergeRequestResponse
     */
    CompletableFuture<MergeMergeRequestResponse> mergeMergeRequest(MergeMergeRequestRequest request);

    /**
     * @param request the request parameters of PassPipelineValidate  PassPipelineValidateRequest
     * @return PassPipelineValidateResponse
     */
    CompletableFuture<PassPipelineValidateResponse> passPipelineValidate(PassPipelineValidateRequest request);

    /**
     * @param request the request parameters of PassReleaseStagePipelineValidate  PassReleaseStagePipelineValidateRequest
     * @return PassReleaseStagePipelineValidateResponse
     */
    CompletableFuture<PassReleaseStagePipelineValidateResponse> passReleaseStagePipelineValidate(PassReleaseStagePipelineValidateRequest request);

    /**
     * @param request the request parameters of RefusePipelineValidate  RefusePipelineValidateRequest
     * @return RefusePipelineValidateResponse
     */
    CompletableFuture<RefusePipelineValidateResponse> refusePipelineValidate(RefusePipelineValidateRequest request);

    /**
     * @param request the request parameters of RefuseReleaseStagePipelineValidate  RefuseReleaseStagePipelineValidateRequest
     * @return RefuseReleaseStagePipelineValidateResponse
     */
    CompletableFuture<RefuseReleaseStagePipelineValidateResponse> refuseReleaseStagePipelineValidate(RefuseReleaseStagePipelineValidateRequest request);

    /**
     * @param request the request parameters of ReopenMergeRequest  ReopenMergeRequestRequest
     * @return ReopenMergeRequestResponse
     */
    CompletableFuture<ReopenMergeRequestResponse> reopenMergeRequest(ReopenMergeRequestRequest request);

    /**
     * @param request the request parameters of ResetSshKey  ResetSshKeyRequest
     * @return ResetSshKeyResponse
     */
    CompletableFuture<ResetSshKeyResponse> resetSshKey(ResetSshKeyRequest request);

    /**
     * @param request the request parameters of ResumeVMDeployOrder  ResumeVMDeployOrderRequest
     * @return ResumeVMDeployOrderResponse
     */
    CompletableFuture<ResumeVMDeployOrderResponse> resumeVMDeployOrder(ResumeVMDeployOrderRequest request);

    /**
     * @param request the request parameters of RetryPipelineJobRun  RetryPipelineJobRunRequest
     * @return RetryPipelineJobRunResponse
     */
    CompletableFuture<RetryPipelineJobRunResponse> retryPipelineJobRun(RetryPipelineJobRunRequest request);

    /**
     * @param request the request parameters of RetryVMDeployMachine  RetryVMDeployMachineRequest
     * @return RetryVMDeployMachineResponse
     */
    CompletableFuture<RetryVMDeployMachineResponse> retryVMDeployMachine(RetryVMDeployMachineRequest request);

    /**
     * @param request the request parameters of ReviewMergeRequest  ReviewMergeRequestRequest
     * @return ReviewMergeRequestResponse
     */
    CompletableFuture<ReviewMergeRequestResponse> reviewMergeRequest(ReviewMergeRequestRequest request);

    /**
     * @param request the request parameters of SkipPipelineJobRun  SkipPipelineJobRunRequest
     * @return SkipPipelineJobRunResponse
     */
    CompletableFuture<SkipPipelineJobRunResponse> skipPipelineJobRun(SkipPipelineJobRunRequest request);

    /**
     * @param request the request parameters of SkipVMDeployMachine  SkipVMDeployMachineRequest
     * @return SkipVMDeployMachineResponse
     */
    CompletableFuture<SkipVMDeployMachineResponse> skipVMDeployMachine(SkipVMDeployMachineRequest request);

    /**
     * @param request the request parameters of StartPipelineRun  StartPipelineRunRequest
     * @return StartPipelineRunResponse
     */
    CompletableFuture<StartPipelineRunResponse> startPipelineRun(StartPipelineRunRequest request);

    /**
     * @param request the request parameters of StopPipelineJobRun  StopPipelineJobRunRequest
     * @return StopPipelineJobRunResponse
     */
    CompletableFuture<StopPipelineJobRunResponse> stopPipelineJobRun(StopPipelineJobRunRequest request);

    /**
     * @param request the request parameters of StopPipelineRun  StopPipelineRunRequest
     * @return StopPipelineRunResponse
     */
    CompletableFuture<StopPipelineRunResponse> stopPipelineRun(StopPipelineRunRequest request);

    /**
     * @param request the request parameters of StopVMDeployOrder  StopVMDeployOrderRequest
     * @return StopVMDeployOrderResponse
     */
    CompletableFuture<StopVMDeployOrderResponse> stopVMDeployOrder(StopVMDeployOrderRequest request);

    /**
     * @param request the request parameters of TransferRepository  TransferRepositoryRequest
     * @return TransferRepositoryResponse
     */
    CompletableFuture<TransferRepositoryResponse> transferRepository(TransferRepositoryRequest request);

    /**
     * @param request the request parameters of TriggerRepositoryMirrorSync  TriggerRepositoryMirrorSyncRequest
     * @return TriggerRepositoryMirrorSyncResponse
     */
    CompletableFuture<TriggerRepositoryMirrorSyncResponse> triggerRepositoryMirrorSync(TriggerRepositoryMirrorSyncRequest request);

    /**
     * @param request the request parameters of UpdateAppMember  UpdateAppMemberRequest
     * @return UpdateAppMemberResponse
     */
    CompletableFuture<UpdateAppMemberResponse> updateAppMember(UpdateAppMemberRequest request);

    /**
     * @param request the request parameters of UpdateApplication  UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

    /**
     * @param request the request parameters of UpdateCheckRun  UpdateCheckRunRequest
     * @return UpdateCheckRunResponse
     */
    CompletableFuture<UpdateCheckRunResponse> updateCheckRun(UpdateCheckRunRequest request);

    /**
     * @param request the request parameters of UpdateFile  UpdateFileRequest
     * @return UpdateFileResponse
     */
    CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request);

    /**
     * @param request the request parameters of UpdateFlowTag  UpdateFlowTagRequest
     * @return UpdateFlowTagResponse
     */
    CompletableFuture<UpdateFlowTagResponse> updateFlowTag(UpdateFlowTagRequest request);

    /**
     * @param request the request parameters of UpdateFlowTagGroup  UpdateFlowTagGroupRequest
     * @return UpdateFlowTagGroupResponse
     */
    CompletableFuture<UpdateFlowTagGroupResponse> updateFlowTagGroup(UpdateFlowTagGroupRequest request);

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    /**
     * @param request the request parameters of UpdateGroupMember  UpdateGroupMemberRequest
     * @return UpdateGroupMemberResponse
     */
    CompletableFuture<UpdateGroupMemberResponse> updateGroupMember(UpdateGroupMemberRequest request);

    /**
     * @param request the request parameters of UpdateHostGroup  UpdateHostGroupRequest
     * @return UpdateHostGroupResponse
     */
    CompletableFuture<UpdateHostGroupResponse> updateHostGroup(UpdateHostGroupRequest request);

    /**
     * @param request the request parameters of UpdateMergeRequest  UpdateMergeRequestRequest
     * @return UpdateMergeRequestResponse
     */
    CompletableFuture<UpdateMergeRequestResponse> updateMergeRequest(UpdateMergeRequestRequest request);

    /**
     * @param request the request parameters of UpdateMergeRequestPersonnel  UpdateMergeRequestPersonnelRequest
     * @return UpdateMergeRequestPersonnelResponse
     */
    CompletableFuture<UpdateMergeRequestPersonnelResponse> updateMergeRequestPersonnel(UpdateMergeRequestPersonnelRequest request);

    /**
     * @param request the request parameters of UpdateOrganizationMember  UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     */
    CompletableFuture<UpdateOrganizationMemberResponse> updateOrganizationMember(UpdateOrganizationMemberRequest request);

    /**
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    /**
     * @param request the request parameters of UpdatePipelineBaseInfo  UpdatePipelineBaseInfoRequest
     * @return UpdatePipelineBaseInfoResponse
     */
    CompletableFuture<UpdatePipelineBaseInfoResponse> updatePipelineBaseInfo(UpdatePipelineBaseInfoRequest request);

    /**
     * @param request the request parameters of UpdatePipelineGroup  UpdatePipelineGroupRequest
     * @return UpdatePipelineGroupResponse
     */
    CompletableFuture<UpdatePipelineGroupResponse> updatePipelineGroup(UpdatePipelineGroupRequest request);

    /**
     * @param request the request parameters of UpdateProjectField  UpdateProjectFieldRequest
     * @return UpdateProjectFieldResponse
     */
    CompletableFuture<UpdateProjectFieldResponse> updateProjectField(UpdateProjectFieldRequest request);

    /**
     * @param request the request parameters of UpdateProjectLabel  UpdateProjectLabelRequest
     * @return UpdateProjectLabelResponse
     */
    CompletableFuture<UpdateProjectLabelResponse> updateProjectLabel(UpdateProjectLabelRequest request);

    /**
     * @param request the request parameters of UpdateProjectMember  UpdateProjectMemberRequest
     * @return UpdateProjectMemberResponse
     */
    CompletableFuture<UpdateProjectMemberResponse> updateProjectMember(UpdateProjectMemberRequest request);

    /**
     * @param request the request parameters of UpdateProtectedBranches  UpdateProtectedBranchesRequest
     * @return UpdateProtectedBranchesResponse
     */
    CompletableFuture<UpdateProtectedBranchesResponse> updateProtectedBranches(UpdateProtectedBranchesRequest request);

    /**
     * @param request the request parameters of UpdatePushReviewOnOff  UpdatePushReviewOnOffRequest
     * @return UpdatePushReviewOnOffResponse
     */
    CompletableFuture<UpdatePushReviewOnOffResponse> updatePushReviewOnOff(UpdatePushReviewOnOffRequest request);

    /**
     * @param request the request parameters of UpdatePushRule  UpdatePushRuleRequest
     * @return UpdatePushRuleResponse
     */
    CompletableFuture<UpdatePushRuleResponse> updatePushRule(UpdatePushRuleRequest request);

    /**
     * @param request the request parameters of UpdateRepository  UpdateRepositoryRequest
     * @return UpdateRepositoryResponse
     */
    CompletableFuture<UpdateRepositoryResponse> updateRepository(UpdateRepositoryRequest request);

    /**
     * @param request the request parameters of UpdateRepositoryMember  UpdateRepositoryMemberRequest
     * @return UpdateRepositoryMemberResponse
     */
    CompletableFuture<UpdateRepositoryMemberResponse> updateRepositoryMember(UpdateRepositoryMemberRequest request);

    /**
     * @param request the request parameters of UpdateResourceMember  UpdateResourceMemberRequest
     * @return UpdateResourceMemberResponse
     */
    CompletableFuture<UpdateResourceMemberResponse> updateResourceMember(UpdateResourceMemberRequest request);

    /**
     * @param request the request parameters of UpdateTestCase  UpdateTestCaseRequest
     * @return UpdateTestCaseResponse
     */
    CompletableFuture<UpdateTestCaseResponse> updateTestCase(UpdateTestCaseRequest request);

    /**
     * @param request the request parameters of UpdateTestResult  UpdateTestResultRequest
     * @return UpdateTestResultResponse
     */
    CompletableFuture<UpdateTestResultResponse> updateTestResult(UpdateTestResultRequest request);

    /**
     * @param request the request parameters of UpdateVariableGroup  UpdateVariableGroupRequest
     * @return UpdateVariableGroupResponse
     */
    CompletableFuture<UpdateVariableGroupResponse> updateVariableGroup(UpdateVariableGroupRequest request);

    /**
     * @param request the request parameters of UpdateWorkItem  UpdateWorkItemRequest
     * @return UpdateWorkItemResponse
     */
    CompletableFuture<UpdateWorkItemResponse> updateWorkItem(UpdateWorkItemRequest request);

    /**
     * @param request the request parameters of UpdateWorkitemComment  UpdateWorkitemCommentRequest
     * @return UpdateWorkitemCommentResponse
     */
    CompletableFuture<UpdateWorkitemCommentResponse> updateWorkitemComment(UpdateWorkitemCommentRequest request);

    /**
     * @param request the request parameters of UpdateWorkitemField  UpdateWorkitemFieldRequest
     * @return UpdateWorkitemFieldResponse
     */
    CompletableFuture<UpdateWorkitemFieldResponse> updateWorkitemField(UpdateWorkitemFieldRequest request);

    /**
     * @param request the request parameters of WorkitemAttachmentCreate  WorkitemAttachmentCreateRequest
     * @return WorkitemAttachmentCreateResponse
     */
    CompletableFuture<WorkitemAttachmentCreateResponse> workitemAttachmentCreate(WorkitemAttachmentCreateRequest request);

}
