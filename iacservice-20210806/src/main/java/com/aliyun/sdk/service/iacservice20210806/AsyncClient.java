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
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of AddSharedAccounts  AddSharedAccountsRequest
     * @return AddSharedAccountsResponse
     */
    CompletableFuture<AddSharedAccountsResponse> addSharedAccounts(AddSharedAccountsRequest request);

    /**
     * @param request the request parameters of AssociateDetectConfig  AssociateDetectConfigRequest
     * @return AssociateDetectConfigResponse
     */
    CompletableFuture<AssociateDetectConfigResponse> associateDetectConfig(AssociateDetectConfigRequest request);

    /**
     * @param request the request parameters of AssociateGroup  AssociateGroupRequest
     * @return AssociateGroupResponse
     */
    CompletableFuture<AssociateGroupResponse> associateGroup(AssociateGroupRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a parameter set, you must associate it with a resource. Valid values for the resource type:</p>
     * <ul>
     * <li>Module: template</li>
     * <li>ModuleVersion: template version</li>
     * <li>Task: task.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateParameterSet  AssociateParameterSetRequest
     * @return AssociateParameterSetResponse
     */
    CompletableFuture<AssociateParameterSetResponse> associateParameterSet(AssociateParameterSetRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of CancelResourceExportTask  CancelResourceExportTaskRequest
     * @return CancelResourceExportTaskResponse
     */
    CompletableFuture<CancelResourceExportTaskResponse> cancelResourceExportTask(CancelResourceExportTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>When <code>triggerType</code> is set to <code>Cron</code>, a valid <code>cronExpression</code> must be provided.  </li>
     * <li>Each element in the <code>alarmConfigs</code> list must specify the alerting method <code>type</code> and the corresponding alerting address <code>address</code>.  </li>
     * <li>If the <code>enabled</code> parameter is not explicitly set, its default value is <code>true</code>, meaning newly created detection configurations are enabled by default.  </li>
     * <li>It is recommended to use a UUID as the value of <code>clientToken</code> to ensure request idempotence.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDetectConfig  CreateDetectConfigRequest
     * @return CreateDetectConfigResponse
     */
    CompletableFuture<CreateDetectConfigResponse> createDetectConfig(CreateDetectConfigRequest request);

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit for a single user is 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateModule  CreateModuleRequest
     * @return CreateModuleResponse
     */
    CompletableFuture<CreateModuleResponse> createModule(CreateModuleRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Use the <code>clientToken</code> parameter to ensure the idempotence of the request and prevent duplicate submissions caused by network retries.</li>
     * <li>Use semantic versioning (such as <code>v1.0.0</code>).</li>
     * </ul>
     * 
     * @param request the request parameters of CreateModuleVersion  CreateModuleVersionRequest
     * @return CreateModuleVersionResponse
     */
    CompletableFuture<CreateModuleVersionResponse> createModuleVersion(CreateModuleVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates a new parameter set.</li>
     * <li>The <code>name</code> field is required and can be up to 128 characters in length.</li>
     * <li>Each element in the <code>parameters</code> array must contain the <code>name</code> field. Other fields are optional.</li>
     * <li>Use the <code>clientToken</code> field to ensure idempotence of the request.</li>
     * <li>The request header must contain authentication information to ensure secure access.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateRegistryModule  CreateRegistryModuleRequest
     * @return CreateRegistryModuleResponse
     */
    CompletableFuture<CreateRegistryModuleResponse> createRegistryModule(CreateRegistryModuleRequest request);

    /**
     * <b>description</b> :
     * <p>Rate limit per user: 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateRegistryNamespace  CreateRegistryNamespaceRequest
     * @return CreateRegistryNamespaceResponse
     */
    CompletableFuture<CreateRegistryNamespaceResponse> createRegistryNamespace(CreateRegistryNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateResourceExportTask  CreateResourceExportTaskRequest
     * @return CreateResourceExportTaskResponse
     */
    CompletableFuture<CreateResourceExportTaskResponse> createResourceExportTask(CreateResourceExportTaskRequest request);

    /**
     * @param request the request parameters of CreateStack  CreateStackRequest
     * @return CreateStackResponse
     */
    CompletableFuture<CreateStackResponse> createStack(CreateStackRequest request);

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of CreateTaskFromResourceImport  CreateTaskFromResourceImportRequest
     * @return CreateTaskFromResourceImportResponse
     */
    CompletableFuture<CreateTaskFromResourceImportResponse> createTaskFromResourceImport(CreateTaskFromResourceImportRequest request);

    /**
     * @param request the request parameters of DeleteDetectConfig  DeleteDetectConfigRequest
     * @return DeleteDetectConfigResponse
     */
    CompletableFuture<DeleteDetectConfigResponse> deleteDetectConfig(DeleteDetectConfigRequest request);

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation deletes a specified template.</li>
     * <li>The deletion operation is irreversible. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteModule  DeleteModuleRequest
     * @return DeleteModuleResponse
     */
    CompletableFuture<DeleteModuleResponse> deleteModule(DeleteModuleRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a parameter set.</p>
     * 
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
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of DeleteRegistryModule  DeleteRegistryModuleRequest
     * @return DeleteRegistryModuleResponse
     */
    CompletableFuture<DeleteRegistryModuleResponse> deleteRegistryModule(DeleteRegistryModuleRequest request);

    /**
     * <b>description</b> :
     * <p>Rate limit per user: 100 calls per second.</p>
     * 
     * @param request the request parameters of DeleteRegistryModuleVersion  DeleteRegistryModuleVersionRequest
     * @return DeleteRegistryModuleVersionResponse
     */
    CompletableFuture<DeleteRegistryModuleVersionResponse> deleteRegistryModuleVersion(DeleteRegistryModuleVersionRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of DeleteRegistryNamespace  DeleteRegistryNamespaceRequest
     * @return DeleteRegistryNamespaceResponse
     */
    CompletableFuture<DeleteRegistryNamespaceResponse> deleteRegistryNamespace(DeleteRegistryNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>The call frequency per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of DeleteResourceExportTask  DeleteResourceExportTaskRequest
     * @return DeleteResourceExportTaskResponse
     */
    CompletableFuture<DeleteResourceExportTaskResponse> deleteResourceExportTask(DeleteResourceExportTaskRequest request);

    /**
     * @param request the request parameters of DeleteStack  DeleteStackRequest
     * @return DeleteStackResponse
     */
    CompletableFuture<DeleteStackResponse> deleteStack(DeleteStackRequest request);

    /**
     * <b>description</b> :
     * <p>Rate limit per user: 100 calls per second.
     * Deletes a task. If the task has unreleased resources, it cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteTask  DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This API is primarily used to perform drift detection on the state files of resource orchestration tasks and stack tasks on the automated service desk.</p>
     * 
     * @param request the request parameters of DetectTerraformState  DetectTerraformStateRequest
     * @return DetectTerraformStateResponse
     */
    CompletableFuture<DetectTerraformStateResponse> detectTerraformState(DetectTerraformStateRequest request);

    /**
     * @param request the request parameters of DissociateDetectConfig  DissociateDetectConfigRequest
     * @return DissociateDetectConfigResponse
     */
    CompletableFuture<DissociateDetectConfigResponse> dissociateDetectConfig(DissociateDetectConfigRequest request);

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
     * <b>description</b> :
     * <p>This API is primarily used to execute Terraform module code to create or update cloud resources. Before using this API, ensure that all necessary authentication information is correctly configured and that the Terraform code for the module meets the expected functional requirements.</p>
     * 
     * @param request the request parameters of ExecuteRegistryModule  ExecuteRegistryModuleRequest
     * @return ExecuteRegistryModuleResponse
     */
    CompletableFuture<ExecuteRegistryModuleResponse> executeRegistryModule(ExecuteRegistryModuleRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of ExecuteResourceExportTask  ExecuteResourceExportTaskRequest
     * @return ExecuteResourceExportTaskResponse
     */
    CompletableFuture<ExecuteResourceExportTaskResponse> executeResourceExportTask(ExecuteResourceExportTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This API executes the Terraform Apply command to create or update cloud resources by using the provided Terraform code. It handles complex scenarios, such as operations that depend on the previous state.
     * Before you use this API, ensure that all required authentication information is correctly configured and the Terraform code meets your functional requirements.</p>
     * 
     * @param request the request parameters of ExecuteTerraformApply  ExecuteTerraformApplyRequest
     * @return ExecuteTerraformApplyResponse
     */
    CompletableFuture<ExecuteTerraformApplyResponse> executeTerraformApply(ExecuteTerraformApplyRequest request);

    /**
     * <b>description</b> :
     * <p>Executes the Terraform destroy command to destroy resources created by using Terraform.</p>
     * 
     * @param request the request parameters of ExecuteTerraformDestroy  ExecuteTerraformDestroyRequest
     * @return ExecuteTerraformDestroyResponse
     */
    CompletableFuture<ExecuteTerraformDestroyResponse> executeTerraformDestroy(ExecuteTerraformDestroyRequest request);

    /**
     * <b>description</b> :
     * <p>This API executes the Terraform plan command to create or update cloud resources based on the provided Terraform code. It can also handle complex scenarios, such as operations that depend on the previous state.
     * Before you call this API, ensure that all required authentication information is correctly configured and that the Terraform code meets your functional requirements.</p>
     * 
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
     * @param request the request parameters of GetDetectConfig  GetDetectConfigRequest
     * @return GetDetectConfigResponse
     */
    CompletableFuture<GetDetectConfigResponse> getDetectConfig(GetDetectConfigRequest request);

    /**
     * @param request the request parameters of GetEncryptionConfig  GetEncryptionConfigRequest
     * @return GetEncryptionConfigResponse
     */
    CompletableFuture<GetEncryptionConfigResponse> getEncryptionConfig(GetEncryptionConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the Terraform execution results.</p>
     * 
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
     * <b>description</b> :
     * <p>Rate limit per user: 100 calls per second.</p>
     * 
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation retrieves the details of a specified template, including but not limited to the template name, description, source, status, and latest version. The request must include the template ID and authentication information.</p>
     * 
     * @param request the request parameters of GetModule  GetModuleRequest
     * @return GetModuleResponse
     */
    CompletableFuture<GetModuleResponse> getModule(GetModuleRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation retrieves the details of a specific version of a specified template, including the version number, description, and release time. Make sure that the provided template ID and version number are correct.</p>
     * 
     * @param request the request parameters of GetModuleVersion  GetModuleVersionRequest
     * @return GetModuleVersionResponse
     */
    CompletableFuture<GetModuleVersionResponse> getModuleVersion(GetModuleVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves detailed parameter set information by specifying a <code>parameterSetId</code>.</li>
     * <li>Authentication is required to access this operation.</li>
     * <li>If the request is successful, detailed data including the parameter set name, description, and parameter list is returned.</li>
     * </ul>
     * 
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
     * @param request the request parameters of GetProviderDocument  GetProviderDocumentRequest
     * @return GetProviderDocumentResponse
     */
    CompletableFuture<GetProviderDocumentResponse> getProviderDocument(GetProviderDocumentRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 200 calls per second.</p>
     * 
     * @param request the request parameters of GetRegistryModule  GetRegistryModuleRequest
     * @return GetRegistryModuleResponse
     */
    CompletableFuture<GetRegistryModuleResponse> getRegistryModule(GetRegistryModuleRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 200 calls per second.</p>
     * 
     * @param request the request parameters of GetRegistryModuleVersion  GetRegistryModuleVersionRequest
     * @return GetRegistryModuleVersionResponse
     */
    CompletableFuture<GetRegistryModuleVersionResponse> getRegistryModuleVersion(GetRegistryModuleVersionRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 200 calls per second.</p>
     * 
     * @param request the request parameters of GetRegistryNamespace  GetRegistryNamespaceRequest
     * @return GetRegistryNamespaceResponse
     */
    CompletableFuture<GetRegistryNamespaceResponse> getRegistryNamespace(GetRegistryNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of GetResourceExportTask  GetResourceExportTaskRequest
     * @return GetResourceExportTaskResponse
     */
    CompletableFuture<GetResourceExportTaskResponse> getResourceExportTask(GetResourceExportTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * @param request the request parameters of GetResourceType  GetResourceTypeRequest
     * @return GetResourceTypeResponse
     */
    CompletableFuture<GetResourceTypeResponse> getResourceType(GetResourceTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the results of a Terraform run.</p>
     * 
     * @param request the request parameters of GetStack  GetStackRequest
     * @return GetStackResponse
     */
    CompletableFuture<GetStackResponse> getStack(GetStackRequest request);

    /**
     * @param request the request parameters of GetStackDeployments  GetStackDeploymentsRequest
     * @return GetStackDeploymentsResponse
     */
    CompletableFuture<GetStackDeploymentsResponse> getStackDeployments(GetStackDeploymentsRequest request);

    /**
     * @param request the request parameters of GetStackExecutionResult  GetStackExecutionResultRequest
     * @return GetStackExecutionResultResponse
     */
    CompletableFuture<GetStackExecutionResultResponse> getStackExecutionResult(GetStackExecutionResultRequest request);

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the detection results of state files for resource orchestration tasks and stack tasks on the automated service desk.</p>
     * 
     * @param request the request parameters of GetTerraformStateDetection  GetTerraformStateDetectionRequest
     * @return GetTerraformStateDetectionResponse
     */
    CompletableFuture<GetTerraformStateDetectionResponse> getTerraformStateDetection(GetTerraformStateDetectionRequest request);

    /**
     * @param request the request parameters of ListDetectConfigRelations  ListDetectConfigRelationsRequest
     * @return ListDetectConfigRelationsResponse
     */
    CompletableFuture<ListDetectConfigRelationsResponse> listDetectConfigRelations(ListDetectConfigRelationsRequest request);

    /**
     * @param request the request parameters of ListDetectConfigs  ListDetectConfigsRequest
     * @return ListDetectConfigsResponse
     */
    CompletableFuture<ListDetectConfigsResponse> listDetectConfigs(ListDetectConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries example information for Terraform modules officially provided by Alibaba Cloud.
     * You can specify the maxResults parameter to adjust the maximum number of returned entries.</p>
     * <ul>
     * <li>If nextToken is not present in the response, no more data is available. Otherwise, more data is available. To query the next page, set the nextToken parameter of the ListExplorerRegistryModuleExamples operation to the nextToken value returned in the previous response. If the NextToken parameter is not specified, the first page of data is returned by default.</li>
     * <li>You can set keyword, namespaceName, moduleName, moduleVersion, and exampleName as filter conditions to narrow the search scope. Multiple filter conditions are connected by the logical AND operator. Only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: Optional. Keyword search. Supports fuzzy matching for exampleName. For example, if keyword is set to ecs, the system queries module examples whose names contain ecs.</li>
     * <li>namespaceName: Optional. Filters module examples in a specific workspace. For example, if namespaceName is set to alibaba, the system queries module examples in the alibaba workspace.</li>
     * <li>moduleName: Optional. Filters module examples with a specific name. For example, if moduleName is set to ecs, the system queries module examples named ecs.</li>
     * <li>moduleVersion: Optional. Filters module examples of a specific version. For example, if moduleVersion is set to 1.0.0, the system queries module examples of version 1.0.0.</li>
     * <li>exampleName: Optional. Filters module examples with a specific example name. For example, if exampleName is set to ecs, the system queries module examples named ecs.
     * The response structure includes the request ID, total number of entries, current page data, and pagination information to facilitate processing the query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListExplorerRegistryModuleExamples  ListExplorerRegistryModuleExamplesRequest
     * @return ListExplorerRegistryModuleExamplesResponse
     */
    CompletableFuture<ListExplorerRegistryModuleExamplesResponse> listExplorerRegistryModuleExamples(ListExplorerRegistryModuleExamplesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the version information of modules officially provided by Alibaba Cloud Terraform.
     * You can specify the maxResults parameter to adjust the maximum number of returned entries.</p>
     * <ul>
     * <li>If nextToken is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the nextToken parameter of the ListExplorerRegistryModules operation to the nextToken value returned in the previous response. If the NextToken parameter is not specified, the first page of data is returned by default.</li>
     * <li>By using the Settings of keyword, namespaceName, moduleName, and moduleVersion as conditional filters, you can narrow down the search scope. Multiple conditional filters are connected by the logical AND operator. Only resources that meet all conditional filters are returned.<ul>
     * <li>keyword: optional. The keyword for fuzzy matching against the module name. For example, if you set keyword to ecs, the system queries modules whose names contain ecs.</li>
     * <li>namespaceName: optional. Supports filtering modules in a specific workspace. For example, if you set namespaceName to alibaba, the system queries modules whose workspace is alibaba. If you specify moduleName, you must also specify namespaceName. You can call the ListExplorerRegistryModule operation to obtain the namespaceName.</li>
     * <li>moduleName: optional. Supports filtering modules with a specific name. For example, if you set keyword to ecs, the system queries the module named ecs.</li>
     * <li>moduleVersion: optional. Supports filtering modules with a specific version. For example, if you set keyword to 1.0.0, the system queries modules whose version is 1.0.0.
     * The response structure includes the request ID, total number of entries, current page data, and pagination information to facilitate result processing.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListExplorerRegistryModuleVersions  ListExplorerRegistryModuleVersionsRequest
     * @return ListExplorerRegistryModuleVersionsResponse
     */
    CompletableFuture<ListExplorerRegistryModuleVersionsResponse> listExplorerRegistryModuleVersions(ListExplorerRegistryModuleVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the official Terraform modules provided by Alibaba Cloud.
     * You can specify the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If <code>nextToken</code> is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModules operation to the <code>nextToken</code> value returned in the previous response. If you do not specify the <code>nextToken</code> parameter, the first page of data is returned by default.</li>
     * <li>You can set <code>keyword</code> and <code>moduleName</code> as filter conditions to narrow down the search scope. Multiple filter conditions are connected by the logical <code>AND</code> operator. Only resources that meet all filter conditions are returned.<ul>
     * <li><code>keyword</code>: optional. The keyword for search. The system performs a fuzzy match on the module name. For example, if you set this parameter to ecs, the system queries modules whose names contain ecs.</li>
     * <li><code>moduleName</code>: optional. The name of the module. You can use this parameter to filter modules by a specific name. For example, if you set this parameter to ecs, the system queries the module whose name is ecs.
     * The response structure includes the request ID, total number of entries, data on the current page, and pagination information to help you process the query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of ListModuleVersion  ListModuleVersionRequest
     * @return ListModuleVersionResponse
     */
    CompletableFuture<ListModuleVersionResponse> listModuleVersion(ListModuleVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation lists all Terraform templates under the current user. You can specify query parameters to implement pagination, fuzzy match template names, filter templates by source or status, and more. You can also filter templates by tags for more granular results.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>The pagination parameters <code>pageNumber</code> and <code>pageSize</code> help control the number of returned results.</li>
     * <li>Use the <code>name</code> parameter to perform a fuzzy match search on template names.</li>
     * <li>Use the <code>source</code> parameter to filter templates by source (such as OSS import or file upload).</li>
     * <li>Use the <code>status</code> parameter to filter templates by status (such as created or published).</li>
     * <li>Tag filtering requires a JSON-formatted string, for example, <code>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;prod&quot;}]</code>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries all parameter sets in the system and supports filtering by keyword and paginated results. Authentication information is required in the request.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>The <code>keyword</code> parameter can be used to fuzzy match parameter sets by name or description.</li>
     * <li>Pagination is controlled by <code>pageNumber</code> and <code>pageSize</code>. By default, results start from the first page. The page size is customizable but should be set to a reasonable value to avoid performance issues.</li>
     * </ul>
     * 
     * @param request the request parameters of ListParameterSets  ListParameterSetsRequest
     * @return ListParameterSetsResponse
     */
    CompletableFuture<ListParameterSetsResponse> listParameterSets(ListParameterSetsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Keyword search</strong>: Uses the <code>keyword</code> parameter for fuzzy matching.</li>
     * <li><strong>Paged query</strong>: Uses <code>nextToken</code> for pagination and <code>maxResults</code> to specify the maximum number of results to return on each page. Default value: 100. Maximum value: 200.</li>
     * <li><strong>Terraform provider version</strong>: The optional <code>terraformProviderVersion</code> parameter is used to filter products related to a specific provider version.</li>
     * <li><strong>Response structure</strong>: Includes the request ID, total number of entries, data on the current page, and pagination information to facilitate the processing of query results.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Rate limit per user: 200 calls per second.</p>
     * 
     * @param request the request parameters of ListRegistryModuleVersions  ListRegistryModuleVersionsRequest
     * @return ListRegistryModuleVersionsResponse
     */
    CompletableFuture<ListRegistryModuleVersionsResponse> listRegistryModuleVersions(ListRegistryModuleVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * @param request the request parameters of ListRegistryModules  ListRegistryModulesRequest
     * @return ListRegistryModulesResponse
     */
    CompletableFuture<ListRegistryModulesResponse> listRegistryModules(ListRegistryModulesRequest request);

    /**
     * <b>description</b> :
     * <p>The maximum call frequency per user is 200 calls per second.</p>
     * 
     * @param request the request parameters of ListRegistryNamespaces  ListRegistryNamespacesRequest
     * @return ListRegistryNamespacesResponse
     */
    CompletableFuture<ListRegistryNamespacesResponse> listRegistryNamespaces(ListRegistryNamespacesRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit for a single user is 100 calls per second.</p>
     * 
     * @param request the request parameters of ListResourceExportTaskVersions  ListResourceExportTaskVersionsRequest
     * @return ListResourceExportTaskVersionsResponse
     */
    CompletableFuture<ListResourceExportTaskVersionsResponse> listResourceExportTaskVersions(ListResourceExportTaskVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of ListResourceExportTasks  ListResourceExportTasksRequest
     * @return ListResourceExportTasksResponse
     */
    CompletableFuture<ListResourceExportTasksResponse> listResourceExportTasks(ListResourceExportTasksRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API allows you to perform a conditional query for a list of resource types based on conditions such as product code, Terraform Provider version, child class, status, and keyword. The results contain detailed information about resources, including product code, status, status effective version, child class, Terraform Provider version, and resource type code. Paging is supported for handling large amounts of data.</p>
     * 
     * @param request the request parameters of ListResourceTypes  ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request);

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    /**
     * @param request the request parameters of ListStackConfigs  ListStackConfigsRequest
     * @return ListStackConfigsResponse
     */
    CompletableFuture<ListStackConfigsResponse> listStackConfigs(ListStackConfigsRequest request);

    /**
     * @param request the request parameters of ListStacks  ListStacksRequest
     * @return ListStacksResponse
     */
    CompletableFuture<ListStacksResponse> listStacks(ListStacksRequest request);

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
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
     * <b>description</b> :
     * <p>This API is primarily used to manage state files for resource orchestration tasks and stack tasks on the automated service desk.
     * Before you use this API, ensure that all required authentication information is correctly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * @param request the request parameters of ManageTerraformState  ManageTerraformStateRequest
     * @return ManageTerraformStateResponse
     */
    CompletableFuture<ManageTerraformStateResponse> manageTerraformState(ManageTerraformStateRequest request);

    /**
     * <b>description</b> :
     * <p>The maximum call frequency for a single user is 100 calls per second.</p>
     * 
     * @param request the request parameters of OperateJob  OperateJobRequest
     * @return OperateJobResponse
     */
    CompletableFuture<OperateJobResponse> operateJob(OperateJobRequest request);

    /**
     * <b>description</b> :
     * <p>Rate limit for a single user: 100 calls per second.</p>
     * 
     * @param request the request parameters of PublishRegistryModuleVersion  PublishRegistryModuleVersionRequest
     * @return PublishRegistryModuleVersionResponse
     */
    CompletableFuture<PublishRegistryModuleVersionResponse> publishRegistryModuleVersion(PublishRegistryModuleVersionRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of RemoveSharedAccounts  RemoveSharedAccountsRequest
     * @return RemoveSharedAccountsResponse
     */
    CompletableFuture<RemoveSharedAccountsResponse> removeSharedAccounts(RemoveSharedAccountsRequest request);

    /**
     * @param request the request parameters of SetEncryptionConfig  SetEncryptionConfigRequest
     * @return SetEncryptionConfigResponse
     */
    CompletableFuture<SetEncryptionConfigResponse> setEncryptionConfig(SetEncryptionConfigRequest request);

    /**
     * @param request the request parameters of TriggerStackExecution  TriggerStackExecutionRequest
     * @return TriggerStackExecutionResponse
     */
    CompletableFuture<TriggerStackExecutionResponse> triggerStackExecution(TriggerStackExecutionRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li><code>detectConfigId</code> is a required parameter used to identify the specific detection configuration to update.  </li>
     * <li>When <code>triggerType</code> is set to <code>Cron</code>, a valid <code>cronExpression</code> must be provided.  </li>
     * <li>Each element in the <code>alarmConfigs</code> list must include an alert type (<code>type</code>) and an address (<code>address</code>).  </li>
     * <li>If you do not want to change certain properties (such as <code>name</code>, <code>description</code>, etc.), you can omit these fields from the request body.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDetectConfig  UpdateDetectConfigRequest
     * @return UpdateDetectConfigResponse
     */
    CompletableFuture<UpdateDetectConfigResponse> updateDetectConfig(UpdateDetectConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the Explorer template.</p>
     * 
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the basic attributes of an existing template, including but not limited to the template name, description, and tags.</li>
     * <li>The update operation does not affect the content or version information of the template.</li>
     * <li>To enable or disable deletion protection, set the <code>deletionProtection</code> parameter.</li>
     * <li>Use <code>clientToken</code> to ensure the idempotence of the request and prevent duplicate submissions caused by network issues.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateModuleAttribute  UpdateModuleAttributeRequest
     * @return UpdateModuleAttributeResponse
     */
    CompletableFuture<UpdateModuleAttributeResponse> updateModuleAttribute(UpdateModuleAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the basic information of an existing parameter set, including the name and description.</li>
     * <li>If the request includes the <code>parameters</code> field, the parameter list in the parameter set is updated.</li>
     * <li>The <code>clientToken</code> field can be used to ensure the idempotence of the request.</li>
     * <li>The update operation requires a valid <code>parameterSetId</code> as a path parameter.</li>
     * <li>The request must include authentication information to pass identity verification.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>The rate limit per user is 100 calls per second.</p>
     * 
     * @param request the request parameters of UpdateRegistryModuleAttribute  UpdateRegistryModuleAttributeRequest
     * @return UpdateRegistryModuleAttributeResponse
     */
    CompletableFuture<UpdateRegistryModuleAttributeResponse> updateRegistryModuleAttribute(UpdateRegistryModuleAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit for a single user is 100 calls per second.</p>
     * 
     * @param request the request parameters of UpdateRegistryNamespaceAttribute  UpdateRegistryNamespaceAttributeRequest
     * @return UpdateRegistryNamespaceAttributeResponse
     */
    CompletableFuture<UpdateRegistryNamespaceAttributeResponse> updateRegistryNamespaceAttribute(UpdateRegistryNamespaceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit for a single user is 100 calls per second.</p>
     * 
     * @param request the request parameters of UpdateResourceExportTaskAttribute  UpdateResourceExportTaskAttributeRequest
     * @return UpdateResourceExportTaskAttributeResponse
     */
    CompletableFuture<UpdateResourceExportTaskAttributeResponse> updateResourceExportTaskAttribute(UpdateResourceExportTaskAttributeRequest request);

    /**
     * @param request the request parameters of UpdateStack  UpdateStackRequest
     * @return UpdateStackResponse
     */
    CompletableFuture<UpdateStackResponse> updateStack(UpdateStackRequest request);

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of UpdateTaskAttribute  UpdateTaskAttributeRequest
     * @return UpdateTaskAttributeResponse
     */
    CompletableFuture<UpdateTaskAttributeResponse> updateTaskAttribute(UpdateTaskAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a dry run on the content of a Terraform configuration file.</p>
     * 
     * @param request the request parameters of ValidateModule  ValidateModuleRequest
     * @return ValidateModuleResponse
     */
    CompletableFuture<ValidateModuleResponse> validateModule(ValidateModuleRequest request);

    ResponseIterable<ValidateModuleResponseBody> validateModuleWithResponseIterable(ValidateModuleRequest request);

}
