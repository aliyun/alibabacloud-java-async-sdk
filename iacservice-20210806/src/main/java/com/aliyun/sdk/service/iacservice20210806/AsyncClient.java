// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.iacservice20210806.models.*;
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
     * @param request the request parameters of AssociateGroup  AssociateGroupRequest
     * @return AssociateGroupResponse
     */
    CompletableFuture<AssociateGroupResponse> associateGroup(AssociateGroupRequest request);

    /**
     * @param request the request parameters of AssociateParameterSet  AssociateParameterSetRequest
     * @return AssociateParameterSetResponse
     */
    CompletableFuture<AssociateParameterSetResponse> associateParameterSet(AssociateParameterSetRequest request);

    /**
     * @param request the request parameters of AttachRabbitmqPublisher  AttachRabbitmqPublisherRequest
     * @return AttachRabbitmqPublisherResponse
     */
    CompletableFuture<AttachRabbitmqPublisherResponse> attachRabbitmqPublisher(AttachRabbitmqPublisherRequest request);

    /**
     * @param request the request parameters of CancelProjectBuild  CancelProjectBuildRequest
     * @return CancelProjectBuildResponse
     */
    CompletableFuture<CancelProjectBuildResponse> cancelProjectBuild(CancelProjectBuildRequest request);

    /**
     * @param request the request parameters of CancelRamPolicyExportTask  CancelRamPolicyExportTaskRequest
     * @return CancelRamPolicyExportTaskResponse
     */
    CompletableFuture<CancelRamPolicyExportTaskResponse> cancelRamPolicyExportTask(CancelRamPolicyExportTaskRequest request);

    /**
     * @param request the request parameters of CancelResourceExportTask  CancelResourceExportTaskRequest
     * @return CancelResourceExportTaskResponse
     */
    CompletableFuture<CancelResourceExportTaskResponse> cancelResourceExportTask(CancelResourceExportTaskRequest request);

    /**
     * @param request the request parameters of CheckResourceName  CheckResourceNameRequest
     * @return CheckResourceNameResponse
     */
    CompletableFuture<CheckResourceNameResponse> checkResourceName(CheckResourceNameRequest request);

    /**
     * @param request the request parameters of CloneGroup  CloneGroupRequest
     * @return CloneGroupResponse
     */
    CompletableFuture<CloneGroupResponse> cloneGroup(CloneGroupRequest request);

    /**
     * @param request the request parameters of CloneModule  CloneModuleRequest
     * @return CloneModuleResponse
     */
    CompletableFuture<CloneModuleResponse> cloneModule(CloneModuleRequest request);

    /**
     * @param request the request parameters of CreateAuthorization  CreateAuthorizationRequest
     * @return CreateAuthorizationResponse
     */
    CompletableFuture<CreateAuthorizationResponse> createAuthorization(CreateAuthorizationRequest request);

    /**
     * @param request the request parameters of CreateExplorerTask  CreateExplorerTaskRequest
     * @return CreateExplorerTaskResponse
     */
    CompletableFuture<CreateExplorerTaskResponse> createExplorerTask(CreateExplorerTaskRequest request);

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * @param request the request parameters of CreateModule  CreateModuleRequest
     * @return CreateModuleResponse
     */
    CompletableFuture<CreateModuleResponse> createModule(CreateModuleRequest request);

    /**
     * @param request the request parameters of CreateModuleVersion  CreateModuleVersionRequest
     * @return CreateModuleVersionResponse
     */
    CompletableFuture<CreateModuleVersionResponse> createModuleVersion(CreateModuleVersionRequest request);

    /**
     * @param request the request parameters of CreateParameterSet  CreateParameterSetRequest
     * @return CreateParameterSetResponse
     */
    CompletableFuture<CreateParameterSetResponse> createParameterSet(CreateParameterSetRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateProjectBuild  CreateProjectBuildRequest
     * @return CreateProjectBuildResponse
     */
    CompletableFuture<CreateProjectBuildResponse> createProjectBuild(CreateProjectBuildRequest request);

    /**
     * @param request the request parameters of CreateRabbitmqPublisher  CreateRabbitmqPublisherRequest
     * @return CreateRabbitmqPublisherResponse
     */
    CompletableFuture<CreateRabbitmqPublisherResponse> createRabbitmqPublisher(CreateRabbitmqPublisherRequest request);

    /**
     * @param request the request parameters of CreateRamPolicyExportTask  CreateRamPolicyExportTaskRequest
     * @return CreateRamPolicyExportTaskResponse
     */
    CompletableFuture<CreateRamPolicyExportTaskResponse> createRamPolicyExportTask(CreateRamPolicyExportTaskRequest request);

    /**
     * @param request the request parameters of CreateResourceExportTask  CreateResourceExportTaskRequest
     * @return CreateResourceExportTaskResponse
     */
    CompletableFuture<CreateResourceExportTaskResponse> createResourceExportTask(CreateResourceExportTaskRequest request);

    /**
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of DeleteAuthorization  DeleteAuthorizationRequest
     * @return DeleteAuthorizationResponse
     */
    CompletableFuture<DeleteAuthorizationResponse> deleteAuthorization(DeleteAuthorizationRequest request);

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * @param request the request parameters of DeleteModule  DeleteModuleRequest
     * @return DeleteModuleResponse
     */
    CompletableFuture<DeleteModuleResponse> deleteModule(DeleteModuleRequest request);

    /**
     * @param request the request parameters of DeleteParameterSet  DeleteParameterSetRequest
     * @return DeleteParameterSetResponse
     */
    CompletableFuture<DeleteParameterSetResponse> deleteParameterSet(DeleteParameterSetRequest request);

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * @param request the request parameters of DeleteRabbitmqPublisher  DeleteRabbitmqPublisherRequest
     * @return DeleteRabbitmqPublisherResponse
     */
    CompletableFuture<DeleteRabbitmqPublisherResponse> deleteRabbitmqPublisher(DeleteRabbitmqPublisherRequest request);

    /**
     * @param request the request parameters of DeleteRamPolicyExportTask  DeleteRamPolicyExportTaskRequest
     * @return DeleteRamPolicyExportTaskResponse
     */
    CompletableFuture<DeleteRamPolicyExportTaskResponse> deleteRamPolicyExportTask(DeleteRamPolicyExportTaskRequest request);

    /**
     * @param request the request parameters of DeleteRamPolicyExportTaskVersion  DeleteRamPolicyExportTaskVersionRequest
     * @return DeleteRamPolicyExportTaskVersionResponse
     */
    CompletableFuture<DeleteRamPolicyExportTaskVersionResponse> deleteRamPolicyExportTaskVersion(DeleteRamPolicyExportTaskVersionRequest request);

    /**
     * @param request the request parameters of DeleteResourceExportTask  DeleteResourceExportTaskRequest
     * @return DeleteResourceExportTaskResponse
     */
    CompletableFuture<DeleteResourceExportTaskResponse> deleteResourceExportTask(DeleteResourceExportTaskRequest request);

    /**
     * @param request the request parameters of DeleteSceneTestingTask  DeleteSceneTestingTaskRequest
     * @return DeleteSceneTestingTaskResponse
     */
    CompletableFuture<DeleteSceneTestingTaskResponse> deleteSceneTestingTask(DeleteSceneTestingTaskRequest request);

    /**
     * @param request the request parameters of DeleteTask  DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    /**
     * @param request the request parameters of DetachRabbitmqPublisher  DetachRabbitmqPublisherRequest
     * @return DetachRabbitmqPublisherResponse
     */
    CompletableFuture<DetachRabbitmqPublisherResponse> detachRabbitmqPublisher(DetachRabbitmqPublisherRequest request);

    /**
     * @param request the request parameters of DissociateGroup  DissociateGroupRequest
     * @return DissociateGroupResponse
     */
    CompletableFuture<DissociateGroupResponse> dissociateGroup(DissociateGroupRequest request);

    /**
     * @param request the request parameters of DissociateParameterSet  DissociateParameterSetRequest
     * @return DissociateParameterSetResponse
     */
    CompletableFuture<DissociateParameterSetResponse> dissociateParameterSet(DissociateParameterSetRequest request);

    /**
     * @param request the request parameters of ExecuteRamPolicyExportTask  ExecuteRamPolicyExportTaskRequest
     * @return ExecuteRamPolicyExportTaskResponse
     */
    CompletableFuture<ExecuteRamPolicyExportTaskResponse> executeRamPolicyExportTask(ExecuteRamPolicyExportTaskRequest request);

    /**
     * @param request the request parameters of ExecuteResourceExportTask  ExecuteResourceExportTaskRequest
     * @return ExecuteResourceExportTaskResponse
     */
    CompletableFuture<ExecuteResourceExportTaskResponse> executeResourceExportTask(ExecuteResourceExportTaskRequest request);

    /**
     * @param request the request parameters of GetExplorerTask  GetExplorerTaskRequest
     * @return GetExplorerTaskResponse
     */
    CompletableFuture<GetExplorerTaskResponse> getExplorerTask(GetExplorerTaskRequest request);

    /**
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    /**
     * @param request the request parameters of GetModule  GetModuleRequest
     * @return GetModuleResponse
     */
    CompletableFuture<GetModuleResponse> getModule(GetModuleRequest request);

    /**
     * @param request the request parameters of GetModuleVersion  GetModuleVersionRequest
     * @return GetModuleVersionResponse
     */
    CompletableFuture<GetModuleVersionResponse> getModuleVersion(GetModuleVersionRequest request);

    /**
     * @param request the request parameters of GetParameterSet  GetParameterSetRequest
     * @return GetParameterSetResponse
     */
    CompletableFuture<GetParameterSetResponse> getParameterSet(GetParameterSetRequest request);

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @param request the request parameters of GetProjectBuildContext  GetProjectBuildContextRequest
     * @return GetProjectBuildContextResponse
     */
    CompletableFuture<GetProjectBuildContextResponse> getProjectBuildContext(GetProjectBuildContextRequest request);

    /**
     * @param request the request parameters of GetRabbitmqPublisher  GetRabbitmqPublisherRequest
     * @return GetRabbitmqPublisherResponse
     */
    CompletableFuture<GetRabbitmqPublisherResponse> getRabbitmqPublisher(GetRabbitmqPublisherRequest request);

    /**
     * @param request the request parameters of GetRamPolicyExportTask  GetRamPolicyExportTaskRequest
     * @return GetRamPolicyExportTaskResponse
     */
    CompletableFuture<GetRamPolicyExportTaskResponse> getRamPolicyExportTask(GetRamPolicyExportTaskRequest request);

    /**
     * @param request the request parameters of GetRamPolicyExportTaskVersion  GetRamPolicyExportTaskVersionRequest
     * @return GetRamPolicyExportTaskVersionResponse
     */
    CompletableFuture<GetRamPolicyExportTaskVersionResponse> getRamPolicyExportTaskVersion(GetRamPolicyExportTaskVersionRequest request);

    /**
     * @param request the request parameters of GetResourceExportTask  GetResourceExportTaskRequest
     * @return GetResourceExportTaskResponse
     */
    CompletableFuture<GetResourceExportTaskResponse> getResourceExportTask(GetResourceExportTaskRequest request);

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * @param request the request parameters of GetTaskPolicy  GetTaskPolicyRequest
     * @return GetTaskPolicyResponse
     */
    CompletableFuture<GetTaskPolicyResponse> getTaskPolicy(GetTaskPolicyRequest request);

    /**
     * @param request the request parameters of ListAuthorizations  ListAuthorizationsRequest
     * @return ListAuthorizationsResponse
     */
    CompletableFuture<ListAuthorizationsResponse> listAuthorizations(ListAuthorizationsRequest request);

    /**
     * @param request the request parameters of ListAvailableTerraformVersions  ListAvailableTerraformVersionsRequest
     * @return ListAvailableTerraformVersionsResponse
     */
    CompletableFuture<ListAvailableTerraformVersionsResponse> listAvailableTerraformVersions(ListAvailableTerraformVersionsRequest request);

    /**
     * @param request the request parameters of ListExplorerTasks  ListExplorerTasksRequest
     * @return ListExplorerTasksResponse
     */
    CompletableFuture<ListExplorerTasksResponse> listExplorerTasks(ListExplorerTasksRequest request);

    /**
     * @param request the request parameters of ListGroup  ListGroupRequest
     * @return ListGroupResponse
     */
    CompletableFuture<ListGroupResponse> listGroup(ListGroupRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListModuleVersion  ListModuleVersionRequest
     * @return ListModuleVersionResponse
     */
    CompletableFuture<ListModuleVersionResponse> listModuleVersion(ListModuleVersionRequest request);

    /**
     * @param request the request parameters of ListModules  ListModulesRequest
     * @return ListModulesResponse
     */
    CompletableFuture<ListModulesResponse> listModules(ListModulesRequest request);

    /**
     * @param request the request parameters of ListParameterSetRelation  ListParameterSetRelationRequest
     * @return ListParameterSetRelationResponse
     */
    CompletableFuture<ListParameterSetRelationResponse> listParameterSetRelation(ListParameterSetRelationRequest request);

    /**
     * @param request the request parameters of ListParameterSets  ListParameterSetsRequest
     * @return ListParameterSetsResponse
     */
    CompletableFuture<ListParameterSetsResponse> listParameterSets(ListParameterSetsRequest request);

    /**
     * @param request the request parameters of ListProject  ListProjectRequest
     * @return ListProjectResponse
     */
    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    /**
     * @param request the request parameters of ListProjectBuilds  ListProjectBuildsRequest
     * @return ListProjectBuildsResponse
     */
    CompletableFuture<ListProjectBuildsResponse> listProjectBuilds(ListProjectBuildsRequest request);

    /**
     * @param request the request parameters of ListRabbitmqPublishers  ListRabbitmqPublishersRequest
     * @return ListRabbitmqPublishersResponse
     */
    CompletableFuture<ListRabbitmqPublishersResponse> listRabbitmqPublishers(ListRabbitmqPublishersRequest request);

    /**
     * @param request the request parameters of ListRamPolicyExportTaskVersions  ListRamPolicyExportTaskVersionsRequest
     * @return ListRamPolicyExportTaskVersionsResponse
     */
    CompletableFuture<ListRamPolicyExportTaskVersionsResponse> listRamPolicyExportTaskVersions(ListRamPolicyExportTaskVersionsRequest request);

    /**
     * @param request the request parameters of ListRamPolicyExportTasks  ListRamPolicyExportTasksRequest
     * @return ListRamPolicyExportTasksResponse
     */
    CompletableFuture<ListRamPolicyExportTasksResponse> listRamPolicyExportTasks(ListRamPolicyExportTasksRequest request);

    /**
     * @param request the request parameters of ListResourceExportTaskVersions  ListResourceExportTaskVersionsRequest
     * @return ListResourceExportTaskVersionsResponse
     */
    CompletableFuture<ListResourceExportTaskVersionsResponse> listResourceExportTaskVersions(ListResourceExportTaskVersionsRequest request);

    /**
     * @param request the request parameters of ListResourceExportTasks  ListResourceExportTasksRequest
     * @return ListResourceExportTasksResponse
     */
    CompletableFuture<ListResourceExportTasksResponse> listResourceExportTasks(ListResourceExportTasksRequest request);

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    /**
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * @param request the request parameters of ListTerraformProviderVersions  ListTerraformProviderVersionsRequest
     * @return ListTerraformProviderVersionsResponse
     */
    CompletableFuture<ListTerraformProviderVersionsResponse> listTerraformProviderVersions(ListTerraformProviderVersionsRequest request);

    /**
     * @param request the request parameters of OperateJob  OperateJobRequest
     * @return OperateJobResponse
     */
    CompletableFuture<OperateJobResponse> operateJob(OperateJobRequest request);

    /**
     * @param request the request parameters of RemoveResourceExportTaskVersion  RemoveResourceExportTaskVersionRequest
     * @return RemoveResourceExportTaskVersionResponse
     */
    CompletableFuture<RemoveResourceExportTaskVersionResponse> removeResourceExportTaskVersion(RemoveResourceExportTaskVersionRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAuthorizationAttribute  UpdateAuthorizationAttributeRequest
     * @return UpdateAuthorizationAttributeResponse
     */
    CompletableFuture<UpdateAuthorizationAttributeResponse> updateAuthorizationAttribute(UpdateAuthorizationAttributeRequest request);

    /**
     * @param request the request parameters of UpdateExplorerTaskAttribute  UpdateExplorerTaskAttributeRequest
     * @return UpdateExplorerTaskAttributeResponse
     */
    CompletableFuture<UpdateExplorerTaskAttributeResponse> updateExplorerTaskAttribute(UpdateExplorerTaskAttributeRequest request);

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    /**
     * @param request the request parameters of UpdateModuleAttribute  UpdateModuleAttributeRequest
     * @return UpdateModuleAttributeResponse
     */
    CompletableFuture<UpdateModuleAttributeResponse> updateModuleAttribute(UpdateModuleAttributeRequest request);

    /**
     * @param request the request parameters of UpdateParameterSetAttribute  UpdateParameterSetAttributeRequest
     * @return UpdateParameterSetAttributeResponse
     */
    CompletableFuture<UpdateParameterSetAttributeResponse> updateParameterSetAttribute(UpdateParameterSetAttributeRequest request);

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    /**
     * @param request the request parameters of UpdateRabbitmqPublisherAttribute  UpdateRabbitmqPublisherAttributeRequest
     * @return UpdateRabbitmqPublisherAttributeResponse
     */
    CompletableFuture<UpdateRabbitmqPublisherAttributeResponse> updateRabbitmqPublisherAttribute(UpdateRabbitmqPublisherAttributeRequest request);

    /**
     * @param request the request parameters of UpdateRamPolicyExportTaskAttribute  UpdateRamPolicyExportTaskAttributeRequest
     * @return UpdateRamPolicyExportTaskAttributeResponse
     */
    CompletableFuture<UpdateRamPolicyExportTaskAttributeResponse> updateRamPolicyExportTaskAttribute(UpdateRamPolicyExportTaskAttributeRequest request);

    /**
     * @param request the request parameters of UpdateResourceExportTaskAttribute  UpdateResourceExportTaskAttributeRequest
     * @return UpdateResourceExportTaskAttributeResponse
     */
    CompletableFuture<UpdateResourceExportTaskAttributeResponse> updateResourceExportTaskAttribute(UpdateResourceExportTaskAttributeRequest request);

    /**
     * @param request the request parameters of UpdateTaskAttribute  UpdateTaskAttributeRequest
     * @return UpdateTaskAttributeResponse
     */
    CompletableFuture<UpdateTaskAttributeResponse> updateTaskAttribute(UpdateTaskAttributeRequest request);

    /**
     * @param request the request parameters of UpdateTaskPolicy  UpdateTaskPolicyRequest
     * @return UpdateTaskPolicyResponse
     */
    CompletableFuture<UpdateTaskPolicyResponse> updateTaskPolicy(UpdateTaskPolicyRequest request);

}
