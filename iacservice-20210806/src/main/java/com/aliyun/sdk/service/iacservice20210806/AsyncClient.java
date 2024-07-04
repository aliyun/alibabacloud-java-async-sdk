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

    CompletableFuture<AssociateGroupResponse> associateGroup(AssociateGroupRequest request);

    CompletableFuture<AssociateParameterSetResponse> associateParameterSet(AssociateParameterSetRequest request);

    CompletableFuture<AttachRabbitmqPublisherResponse> attachRabbitmqPublisher(AttachRabbitmqPublisherRequest request);

    CompletableFuture<CancelProjectBuildResponse> cancelProjectBuild(CancelProjectBuildRequest request);

    CompletableFuture<CancelRamPolicyExportTaskResponse> cancelRamPolicyExportTask(CancelRamPolicyExportTaskRequest request);

    CompletableFuture<CancelResourceExportTaskResponse> cancelResourceExportTask(CancelResourceExportTaskRequest request);

    CompletableFuture<CheckResourceNameResponse> checkResourceName(CheckResourceNameRequest request);

    CompletableFuture<CloneGroupResponse> cloneGroup(CloneGroupRequest request);

    CompletableFuture<CloneModuleResponse> cloneModule(CloneModuleRequest request);

    CompletableFuture<CreateAuthorizationResponse> createAuthorization(CreateAuthorizationRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    CompletableFuture<CreateModuleResponse> createModule(CreateModuleRequest request);

    CompletableFuture<CreateModuleVersionResponse> createModuleVersion(CreateModuleVersionRequest request);

    CompletableFuture<CreateParameterSetResponse> createParameterSet(CreateParameterSetRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateProjectBuildResponse> createProjectBuild(CreateProjectBuildRequest request);

    CompletableFuture<CreateRabbitmqPublisherResponse> createRabbitmqPublisher(CreateRabbitmqPublisherRequest request);

    CompletableFuture<CreateRamPolicyExportTaskResponse> createRamPolicyExportTask(CreateRamPolicyExportTaskRequest request);

    CompletableFuture<CreateResourceExportTaskResponse> createResourceExportTask(CreateResourceExportTaskRequest request);

    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    CompletableFuture<DeleteAuthorizationResponse> deleteAuthorization(DeleteAuthorizationRequest request);

    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteModuleResponse> deleteModule(DeleteModuleRequest request);

    CompletableFuture<DeleteParameterSetResponse> deleteParameterSet(DeleteParameterSetRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteRabbitmqPublisherResponse> deleteRabbitmqPublisher(DeleteRabbitmqPublisherRequest request);

    CompletableFuture<DeleteRamPolicyExportTaskResponse> deleteRamPolicyExportTask(DeleteRamPolicyExportTaskRequest request);

    CompletableFuture<DeleteRamPolicyExportTaskVersionResponse> deleteRamPolicyExportTaskVersion(DeleteRamPolicyExportTaskVersionRequest request);

    CompletableFuture<DeleteResourceExportTaskResponse> deleteResourceExportTask(DeleteResourceExportTaskRequest request);

    CompletableFuture<DeleteSceneTestingTaskResponse> deleteSceneTestingTask(DeleteSceneTestingTaskRequest request);

    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    CompletableFuture<DetachRabbitmqPublisherResponse> detachRabbitmqPublisher(DetachRabbitmqPublisherRequest request);

    CompletableFuture<DissociateGroupResponse> dissociateGroup(DissociateGroupRequest request);

    CompletableFuture<DissociateParameterSetResponse> dissociateParameterSet(DissociateParameterSetRequest request);

    CompletableFuture<ExecuteRamPolicyExportTaskResponse> executeRamPolicyExportTask(ExecuteRamPolicyExportTaskRequest request);

    CompletableFuture<ExecuteResourceExportTaskResponse> executeResourceExportTask(ExecuteResourceExportTaskRequest request);

    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    CompletableFuture<GetModuleResponse> getModule(GetModuleRequest request);

    CompletableFuture<GetModuleVersionResponse> getModuleVersion(GetModuleVersionRequest request);

    CompletableFuture<GetParameterSetResponse> getParameterSet(GetParameterSetRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetProjectBuildContextResponse> getProjectBuildContext(GetProjectBuildContextRequest request);

    CompletableFuture<GetRabbitmqPublisherResponse> getRabbitmqPublisher(GetRabbitmqPublisherRequest request);

    CompletableFuture<GetRamPolicyExportTaskResponse> getRamPolicyExportTask(GetRamPolicyExportTaskRequest request);

    CompletableFuture<GetRamPolicyExportTaskVersionResponse> getRamPolicyExportTaskVersion(GetRamPolicyExportTaskVersionRequest request);

    CompletableFuture<GetResourceExportTaskResponse> getResourceExportTask(GetResourceExportTaskRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<GetTaskPolicyResponse> getTaskPolicy(GetTaskPolicyRequest request);

    CompletableFuture<ListAuthorizationsResponse> listAuthorizations(ListAuthorizationsRequest request);

    CompletableFuture<ListAvailableTerraformVersionsResponse> listAvailableTerraformVersions(ListAvailableTerraformVersionsRequest request);

    CompletableFuture<ListGroupResponse> listGroup(ListGroupRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListModuleVersionResponse> listModuleVersion(ListModuleVersionRequest request);

    CompletableFuture<ListModulesResponse> listModules(ListModulesRequest request);

    CompletableFuture<ListParameterSetRelationResponse> listParameterSetRelation(ListParameterSetRelationRequest request);

    CompletableFuture<ListParameterSetsResponse> listParameterSets(ListParameterSetsRequest request);

    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    CompletableFuture<ListProjectBuildsResponse> listProjectBuilds(ListProjectBuildsRequest request);

    CompletableFuture<ListRabbitmqPublishersResponse> listRabbitmqPublishers(ListRabbitmqPublishersRequest request);

    CompletableFuture<ListRamPolicyExportTaskVersionsResponse> listRamPolicyExportTaskVersions(ListRamPolicyExportTaskVersionsRequest request);

    CompletableFuture<ListRamPolicyExportTasksResponse> listRamPolicyExportTasks(ListRamPolicyExportTasksRequest request);

    CompletableFuture<ListResourceExportTaskVersionsResponse> listResourceExportTaskVersions(ListResourceExportTaskVersionsRequest request);

    CompletableFuture<ListResourceExportTasksResponse> listResourceExportTasks(ListResourceExportTasksRequest request);

    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListTerraformProviderVersionsResponse> listTerraformProviderVersions(ListTerraformProviderVersionsRequest request);

    CompletableFuture<OperateJobResponse> operateJob(OperateJobRequest request);

    CompletableFuture<RemoveResourceExportTaskVersionResponse> removeResourceExportTaskVersion(RemoveResourceExportTaskVersionRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UpdateAuthorizationAttributeResponse> updateAuthorizationAttribute(UpdateAuthorizationAttributeRequest request);

    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    CompletableFuture<UpdateModuleAttributeResponse> updateModuleAttribute(UpdateModuleAttributeRequest request);

    CompletableFuture<UpdateParameterSetAttributeResponse> updateParameterSetAttribute(UpdateParameterSetAttributeRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateRabbitmqPublisherAttributeResponse> updateRabbitmqPublisherAttribute(UpdateRabbitmqPublisherAttributeRequest request);

    CompletableFuture<UpdateRamPolicyExportTaskAttributeResponse> updateRamPolicyExportTaskAttribute(UpdateRamPolicyExportTaskAttributeRequest request);

    CompletableFuture<UpdateResourceExportTaskAttributeResponse> updateResourceExportTaskAttribute(UpdateResourceExportTaskAttributeRequest request);

    CompletableFuture<UpdateTaskAttributeResponse> updateTaskAttribute(UpdateTaskAttributeRequest request);

    CompletableFuture<UpdateTaskPolicyResponse> updateTaskPolicy(UpdateTaskPolicyRequest request);

}
