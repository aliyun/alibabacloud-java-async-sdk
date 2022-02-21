// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.devops_rdc20200303.models.*;
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

    CompletableFuture<AddCodeupSourceToPipelineResponse> addCodeupSourceToPipeline(AddCodeupSourceToPipelineRequest request);

    CompletableFuture<BatchInsertMembersResponse> batchInsertMembers(BatchInsertMembersRequest request);

    CompletableFuture<CancelPipelineResponse> cancelPipeline(CancelPipelineRequest request);

    CompletableFuture<CheckAliyunAccountExistsResponse> checkAliyunAccountExists(CheckAliyunAccountExistsRequest request);

    CompletableFuture<CreateCommonGroupResponse> createCommonGroup(CreateCommonGroupRequest request);

    CompletableFuture<CreateCredentialResponse> createCredential(CreateCredentialRequest request);

    CompletableFuture<CreateDevopsOrganizationResponse> createDevopsOrganization(CreateDevopsOrganizationRequest request);

    CompletableFuture<CreateDevopsProjectResponse> createDevopsProject(CreateDevopsProjectRequest request);

    CompletableFuture<CreateDevopsProjectSprintResponse> createDevopsProjectSprint(CreateDevopsProjectSprintRequest request);

    CompletableFuture<CreateDevopsProjectTaskResponse> createDevopsProjectTask(CreateDevopsProjectTaskRequest request);

    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    CompletableFuture<CreatePipelineFromTemplateResponse> createPipelineFromTemplate(CreatePipelineFromTemplateRequest request);

    CompletableFuture<CreateServiceConnectionResponse> createServiceConnection(CreateServiceConnectionRequest request);

    CompletableFuture<DeleteCommonGroupResponse> deleteCommonGroup(DeleteCommonGroupRequest request);

    CompletableFuture<DeleteDevopsOrganizationResponse> deleteDevopsOrganization(DeleteDevopsOrganizationRequest request);

    CompletableFuture<DeleteDevopsOrganizationMembersResponse> deleteDevopsOrganizationMembers(DeleteDevopsOrganizationMembersRequest request);

    CompletableFuture<DeleteDevopsProjectResponse> deleteDevopsProject(DeleteDevopsProjectRequest request);

    CompletableFuture<DeleteDevopsProjectMembersResponse> deleteDevopsProjectMembers(DeleteDevopsProjectMembersRequest request);

    CompletableFuture<DeleteDevopsProjectSprintResponse> deleteDevopsProjectSprint(DeleteDevopsProjectSprintRequest request);

    CompletableFuture<DeleteDevopsProjectTaskResponse> deleteDevopsProjectTask(DeleteDevopsProjectTaskRequest request);

    CompletableFuture<DeletePipelineMemberResponse> deletePipelineMember(DeletePipelineMemberRequest request);

    CompletableFuture<ExecutePipelineResponse> executePipeline(ExecutePipelineRequest request);

    CompletableFuture<GetDevopsOrganizationMembersResponse> getDevopsOrganizationMembers(GetDevopsOrganizationMembersRequest request);

    CompletableFuture<GetDevopsProjectInfoResponse> getDevopsProjectInfo(GetDevopsProjectInfoRequest request);

    CompletableFuture<GetDevopsProjectMembersResponse> getDevopsProjectMembers(GetDevopsProjectMembersRequest request);

    CompletableFuture<GetDevopsProjectSprintInfoResponse> getDevopsProjectSprintInfo(GetDevopsProjectSprintInfoRequest request);

    CompletableFuture<GetDevopsProjectTaskInfoResponse> getDevopsProjectTaskInfo(GetDevopsProjectTaskInfoRequest request);

    CompletableFuture<GetLastWorkspaceResponse> getLastWorkspace(GetLastWorkspaceRequest request);

    CompletableFuture<GetPipelineInstHistoryResponse> getPipelineInstHistory(GetPipelineInstHistoryRequest request);

    CompletableFuture<GetPipelineInstanceBuildNumberStatusResponse> getPipelineInstanceBuildNumberStatus(GetPipelineInstanceBuildNumberStatusRequest request);

    CompletableFuture<GetPipelineInstanceGroupStatusResponse> getPipelineInstanceGroupStatus(GetPipelineInstanceGroupStatusRequest request);

    CompletableFuture<GetPipelineInstanceInfoResponse> getPipelineInstanceInfo(GetPipelineInstanceInfoRequest request);

    CompletableFuture<GetPipelineInstanceStatusResponse> getPipelineInstanceStatus(GetPipelineInstanceStatusRequest request);

    CompletableFuture<GetPipelineLogResponse> getPipelineLog(GetPipelineLogRequest request);

    CompletableFuture<GetPipelineStepLogResponse> getPipelineStepLog(GetPipelineStepLogRequest request);

    CompletableFuture<GetPipelineTemplatesResponse> getPipelineTemplates(GetPipelineTemplatesRequest request);

    CompletableFuture<GetPipleineLatestInstanceStatusResponse> getPipleineLatestInstanceStatus(GetPipleineLatestInstanceStatusRequest request);

    CompletableFuture<GetProjectOptionResponse> getProjectOption(GetProjectOptionRequest request);

    CompletableFuture<GetTaskDetailActivityResponse> getTaskDetailActivity(GetTaskDetailActivityRequest request);

    CompletableFuture<GetTaskDetailBaseResponse> getTaskDetailBase(GetTaskDetailBaseRequest request);

    CompletableFuture<GetTaskListFilterResponse> getTaskListFilter(GetTaskListFilterRequest request);

    CompletableFuture<GetUserByAliyunUidResponse> getUserByAliyunUid(GetUserByAliyunUidRequest request);

    CompletableFuture<GetUserNameResponse> getUserName(GetUserNameRequest request);

    CompletableFuture<InsertDevopsUserResponse> insertDevopsUser(InsertDevopsUserRequest request);

    CompletableFuture<InsertPipelineMemberResponse> insertPipelineMember(InsertPipelineMemberRequest request);

    CompletableFuture<InsertProjectMembersResponse> insertProjectMembers(InsertProjectMembersRequest request);

    CompletableFuture<ListCommonGroupResponse> listCommonGroup(ListCommonGroupRequest request);

    CompletableFuture<ListCredentialsResponse> listCredentials(ListCredentialsRequest request);

    CompletableFuture<ListDevopsProjectSprintsResponse> listDevopsProjectSprints(ListDevopsProjectSprintsRequest request);

    CompletableFuture<ListDevopsProjectTaskFlowResponse> listDevopsProjectTaskFlow(ListDevopsProjectTaskFlowRequest request);

    CompletableFuture<ListDevopsProjectTaskFlowStatusResponse> listDevopsProjectTaskFlowStatus(ListDevopsProjectTaskFlowStatusRequest request);

    CompletableFuture<ListDevopsProjectTaskListResponse> listDevopsProjectTaskList(ListDevopsProjectTaskListRequest request);

    CompletableFuture<ListDevopsProjectTasksResponse> listDevopsProjectTasks(ListDevopsProjectTasksRequest request);

    CompletableFuture<ListDevopsProjectsResponse> listDevopsProjects(ListDevopsProjectsRequest request);

    CompletableFuture<ListDevopsScenarioFieldConfigResponse> listDevopsScenarioFieldConfig(ListDevopsScenarioFieldConfigRequest request);

    CompletableFuture<ListPipelineTemplatesResponse> listPipelineTemplates(ListPipelineTemplatesRequest request);

    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    CompletableFuture<ListProjectCustomFieldsResponse> listProjectCustomFields(ListProjectCustomFieldsRequest request);

    CompletableFuture<ListServiceConnectionsResponse> listServiceConnections(ListServiceConnectionsRequest request);

    CompletableFuture<ListSmartGroupResponse> listSmartGroup(ListSmartGroupRequest request);

    CompletableFuture<ListUserOrganizationResponse> listUserOrganization(ListUserOrganizationRequest request);

    CompletableFuture<TransferPipelineOwnerResponse> transferPipelineOwner(TransferPipelineOwnerRequest request);

    CompletableFuture<UpdateCommonGroupResponse> updateCommonGroup(UpdateCommonGroupRequest request);

    CompletableFuture<UpdateDevopsProjectResponse> updateDevopsProject(UpdateDevopsProjectRequest request);

    CompletableFuture<UpdateDevopsProjectSprintResponse> updateDevopsProjectSprint(UpdateDevopsProjectSprintRequest request);

    CompletableFuture<UpdateDevopsProjectTaskResponse> updateDevopsProjectTask(UpdateDevopsProjectTaskRequest request);

    CompletableFuture<UpdatePipelineEnvVarsResponse> updatePipelineEnvVars(UpdatePipelineEnvVarsRequest request);

    CompletableFuture<UpdatePipelineMemberResponse> updatePipelineMember(UpdatePipelineMemberRequest request);

    CompletableFuture<UpdateTaskDetailResponse> updateTaskDetail(UpdateTaskDetailRequest request);

}
