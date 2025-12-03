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
     * @param request the request parameters of AddSharedAccounts  AddSharedAccountsRequest
     * @return AddSharedAccountsResponse
     */
    CompletableFuture<AddSharedAccountsResponse> addSharedAccounts(AddSharedAccountsRequest request);

    /**
     * @param request the request parameters of AssociateGroup  AssociateGroupRequest
     * @return AssociateGroupResponse
     */
    CompletableFuture<AssociateGroupResponse> associateGroup(AssociateGroupRequest request);

    /**
     * @param request the request parameters of CancelResourceExportTask  CancelResourceExportTaskRequest
     * @return CancelResourceExportTaskResponse
     */
    CompletableFuture<CancelResourceExportTaskResponse> cancelResourceExportTask(CancelResourceExportTaskRequest request);

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
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateRegistryModule  CreateRegistryModuleRequest
     * @return CreateRegistryModuleResponse
     */
    CompletableFuture<CreateRegistryModuleResponse> createRegistryModule(CreateRegistryModuleRequest request);

    /**
     * @param request the request parameters of CreateRegistryNamespace  CreateRegistryNamespaceRequest
     * @return CreateRegistryNamespaceResponse
     */
    CompletableFuture<CreateRegistryNamespaceResponse> createRegistryNamespace(CreateRegistryNamespaceRequest request);

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
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * @param request the request parameters of DeleteRegistryModule  DeleteRegistryModuleRequest
     * @return DeleteRegistryModuleResponse
     */
    CompletableFuture<DeleteRegistryModuleResponse> deleteRegistryModule(DeleteRegistryModuleRequest request);

    /**
     * @param request the request parameters of DeleteRegistryModuleVersion  DeleteRegistryModuleVersionRequest
     * @return DeleteRegistryModuleVersionResponse
     */
    CompletableFuture<DeleteRegistryModuleVersionResponse> deleteRegistryModuleVersion(DeleteRegistryModuleVersionRequest request);

    /**
     * @param request the request parameters of DeleteRegistryNamespace  DeleteRegistryNamespaceRequest
     * @return DeleteRegistryNamespaceResponse
     */
    CompletableFuture<DeleteRegistryNamespaceResponse> deleteRegistryNamespace(DeleteRegistryNamespaceRequest request);

    /**
     * @param request the request parameters of DeleteResourceExportTask  DeleteResourceExportTaskRequest
     * @return DeleteResourceExportTaskResponse
     */
    CompletableFuture<DeleteResourceExportTaskResponse> deleteResourceExportTask(DeleteResourceExportTaskRequest request);

    /**
     * @param request the request parameters of DeleteTask  DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    /**
     * @param request the request parameters of DissociateGroup  DissociateGroupRequest
     * @return DissociateGroupResponse
     */
    CompletableFuture<DissociateGroupResponse> dissociateGroup(DissociateGroupRequest request);

    /**
     * @param request the request parameters of ExecuteRegistryModule  ExecuteRegistryModuleRequest
     * @return ExecuteRegistryModuleResponse
     */
    CompletableFuture<ExecuteRegistryModuleResponse> executeRegistryModule(ExecuteRegistryModuleRequest request);

    /**
     * @param request the request parameters of ExecuteResourceExportTask  ExecuteResourceExportTaskRequest
     * @return ExecuteResourceExportTaskResponse
     */
    CompletableFuture<ExecuteResourceExportTaskResponse> executeResourceExportTask(ExecuteResourceExportTaskRequest request);

    /**
     * @param request the request parameters of ExecuteTerraformApply  ExecuteTerraformApplyRequest
     * @return ExecuteTerraformApplyResponse
     */
    CompletableFuture<ExecuteTerraformApplyResponse> executeTerraformApply(ExecuteTerraformApplyRequest request);

    /**
     * @param request the request parameters of ExecuteTerraformDestroy  ExecuteTerraformDestroyRequest
     * @return ExecuteTerraformDestroyResponse
     */
    CompletableFuture<ExecuteTerraformDestroyResponse> executeTerraformDestroy(ExecuteTerraformDestroyRequest request);

    /**
     * @param request the request parameters of ExecuteTerraformPlan  ExecuteTerraformPlanRequest
     * @return ExecuteTerraformPlanResponse
     */
    CompletableFuture<ExecuteTerraformPlanResponse> executeTerraformPlan(ExecuteTerraformPlanRequest request);

    /**
     * @param request the request parameters of GenerateModule  GenerateModuleRequest
     * @return GenerateModuleResponse
     */
    CompletableFuture<GenerateModuleResponse> generateModule(GenerateModuleRequest request);

    /**
     * @param request the request parameters of GetExecuteState  GetExecuteStateRequest
     * @return GetExecuteStateResponse
     */
    CompletableFuture<GetExecuteStateResponse> getExecuteState(GetExecuteStateRequest request);

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
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @param request the request parameters of GetRegistryModule  GetRegistryModuleRequest
     * @return GetRegistryModuleResponse
     */
    CompletableFuture<GetRegistryModuleResponse> getRegistryModule(GetRegistryModuleRequest request);

    /**
     * @param request the request parameters of GetRegistryModuleVersion  GetRegistryModuleVersionRequest
     * @return GetRegistryModuleVersionResponse
     */
    CompletableFuture<GetRegistryModuleVersionResponse> getRegistryModuleVersion(GetRegistryModuleVersionRequest request);

    /**
     * @param request the request parameters of GetRegistryNamespace  GetRegistryNamespaceRequest
     * @return GetRegistryNamespaceResponse
     */
    CompletableFuture<GetRegistryNamespaceResponse> getRegistryNamespace(GetRegistryNamespaceRequest request);

    /**
     * @param request the request parameters of GetResourceExportTask  GetResourceExportTaskRequest
     * @return GetResourceExportTaskResponse
     */
    CompletableFuture<GetResourceExportTaskResponse> getResourceExportTask(GetResourceExportTaskRequest request);

    /**
     * @param request the request parameters of GetResourceType  GetResourceTypeRequest
     * @return GetResourceTypeResponse
     */
    CompletableFuture<GetResourceTypeResponse> getResourceType(GetResourceTypeRequest request);

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * @param request the request parameters of ListExplorerRegistryModuleExamples  ListExplorerRegistryModuleExamplesRequest
     * @return ListExplorerRegistryModuleExamplesResponse
     */
    CompletableFuture<ListExplorerRegistryModuleExamplesResponse> listExplorerRegistryModuleExamples(ListExplorerRegistryModuleExamplesRequest request);

    /**
     * @param request the request parameters of ListExplorerRegistryModuleVersions  ListExplorerRegistryModuleVersionsRequest
     * @return ListExplorerRegistryModuleVersionsResponse
     */
    CompletableFuture<ListExplorerRegistryModuleVersionsResponse> listExplorerRegistryModuleVersions(ListExplorerRegistryModuleVersionsRequest request);

    /**
     * @param request the request parameters of ListExplorerRegistryModules  ListExplorerRegistryModulesRequest
     * @return ListExplorerRegistryModulesResponse
     */
    CompletableFuture<ListExplorerRegistryModulesResponse> listExplorerRegistryModules(ListExplorerRegistryModulesRequest request);

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
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * @param request the request parameters of ListProject  ListProjectRequest
     * @return ListProjectResponse
     */
    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    /**
     * @param request the request parameters of ListRegistryModuleVersions  ListRegistryModuleVersionsRequest
     * @return ListRegistryModuleVersionsResponse
     */
    CompletableFuture<ListRegistryModuleVersionsResponse> listRegistryModuleVersions(ListRegistryModuleVersionsRequest request);

    /**
     * @param request the request parameters of ListRegistryModules  ListRegistryModulesRequest
     * @return ListRegistryModulesResponse
     */
    CompletableFuture<ListRegistryModulesResponse> listRegistryModules(ListRegistryModulesRequest request);

    /**
     * @param request the request parameters of ListRegistryNamespaces  ListRegistryNamespacesRequest
     * @return ListRegistryNamespacesResponse
     */
    CompletableFuture<ListRegistryNamespacesResponse> listRegistryNamespaces(ListRegistryNamespacesRequest request);

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
     * @param request the request parameters of ListResourceTypes  ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request);

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
     * @param request the request parameters of PublishRegistryModuleVersion  PublishRegistryModuleVersionRequest
     * @return PublishRegistryModuleVersionResponse
     */
    CompletableFuture<PublishRegistryModuleVersionResponse> publishRegistryModuleVersion(PublishRegistryModuleVersionRequest request);

    /**
     * @param request the request parameters of RemoveSharedAccounts  RemoveSharedAccountsRequest
     * @return RemoveSharedAccountsResponse
     */
    CompletableFuture<RemoveSharedAccountsResponse> removeSharedAccounts(RemoveSharedAccountsRequest request);

    /**
     * @param request the request parameters of UpdateExplorerModuleAttribute  UpdateExplorerModuleAttributeRequest
     * @return UpdateExplorerModuleAttributeResponse
     */
    CompletableFuture<UpdateExplorerModuleAttributeResponse> updateExplorerModuleAttribute(UpdateExplorerModuleAttributeRequest request);

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
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    /**
     * @param request the request parameters of UpdateRegistryModuleAttribute  UpdateRegistryModuleAttributeRequest
     * @return UpdateRegistryModuleAttributeResponse
     */
    CompletableFuture<UpdateRegistryModuleAttributeResponse> updateRegistryModuleAttribute(UpdateRegistryModuleAttributeRequest request);

    /**
     * @param request the request parameters of UpdateRegistryNamespaceAttribute  UpdateRegistryNamespaceAttributeRequest
     * @return UpdateRegistryNamespaceAttributeResponse
     */
    CompletableFuture<UpdateRegistryNamespaceAttributeResponse> updateRegistryNamespaceAttribute(UpdateRegistryNamespaceAttributeRequest request);

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
     * @param request the request parameters of ValidateModule  ValidateModuleRequest
     * @return ValidateModuleResponse
     */
    CompletableFuture<ValidateModuleResponse> validateModule(ValidateModuleRequest request);

    ResponseIterable<ValidateModuleResponseBody> validateModuleWithResponseIterable(ValidateModuleRequest request);

}
