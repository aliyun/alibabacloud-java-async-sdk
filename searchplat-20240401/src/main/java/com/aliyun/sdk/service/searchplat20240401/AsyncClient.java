// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.searchplat20240401.models.*;
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
     * @param request the request parameters of CeaseFunctionInstance  CeaseFunctionInstanceRequest
     * @return CeaseFunctionInstanceResponse
     */
    CompletableFuture<CeaseFunctionInstanceResponse> ceaseFunctionInstance(CeaseFunctionInstanceRequest request);

    /**
     * @param request the request parameters of CreateAsyncTask  CreateAsyncTaskRequest
     * @return CreateAsyncTaskResponse
     */
    CompletableFuture<CreateAsyncTaskResponse> createAsyncTask(CreateAsyncTaskRequest request);

    /**
     * @param request the request parameters of CreateCapability  CreateCapabilityRequest
     * @return CreateCapabilityResponse
     */
    CompletableFuture<CreateCapabilityResponse> createCapability(CreateCapabilityRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许用户为特定的工作空间创建新配置。</li>
     * <li><code>configType</code>参数指定了要创建的配置类型，当前支持<code>prompt</code>和<code>lark</code>两种。</li>
     * <li>当设置<code>dryRun=true</code>时，API将仅验证请求而不实际执行创建操作。</li>
     * <li><code>configData</code>字段根据<code>configType</code>的不同而变化，请参考示例中的具体结构来构建请求体。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateConfig  CreateConfigRequest
     * @return CreateConfigResponse
     */
    CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request);

    /**
     * @param request the request parameters of CreateCredentials  CreateCredentialsRequest
     * @return CreateCredentialsResponse
     */
    CompletableFuture<CreateCredentialsResponse> createCredentials(CreateCredentialsRequest request);

    /**
     * @param request the request parameters of CreateExperienceData  CreateExperienceDataRequest
     * @return CreateExperienceDataResponse
     */
    CompletableFuture<CreateExperienceDataResponse> createExperienceData(CreateExperienceDataRequest request);

    /**
     * @param request the request parameters of CreateFunctionInstance  CreateFunctionInstanceRequest
     * @return CreateFunctionInstanceResponse
     */
    CompletableFuture<CreateFunctionInstanceResponse> createFunctionInstance(CreateFunctionInstanceRequest request);

    /**
     * @param request the request parameters of CreateFunctionTask  CreateFunctionTaskRequest
     * @return CreateFunctionTaskResponse
     */
    CompletableFuture<CreateFunctionTaskResponse> createFunctionTask(CreateFunctionTaskRequest request);

    /**
     * @param request the request parameters of CreateOfflineTask  CreateOfflineTaskRequest
     * @return CreateOfflineTaskResponse
     */
    CompletableFuture<CreateOfflineTaskResponse> createOfflineTask(CreateOfflineTaskRequest request);

    /**
     * @param request the request parameters of CreateRagEvaluatorTask  CreateRagEvaluatorTaskRequest
     * @return CreateRagEvaluatorTaskResponse
     */
    CompletableFuture<CreateRagEvaluatorTaskResponse> createRagEvaluatorTask(CreateRagEvaluatorTaskRequest request);

    /**
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteCapability  DeleteCapabilityRequest
     * @return DeleteCapabilityResponse
     */
    CompletableFuture<DeleteCapabilityResponse> deleteCapability(DeleteCapabilityRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * @param request the request parameters of DeleteConfig  DeleteConfigRequest
     * @return DeleteConfigResponse
     */
    CompletableFuture<DeleteConfigResponse> deleteConfig(DeleteConfigRequest request);

    /**
     * @param request the request parameters of DeleteCredentials  DeleteCredentialsRequest
     * @return DeleteCredentialsResponse
     */
    CompletableFuture<DeleteCredentialsResponse> deleteCredentials(DeleteCredentialsRequest request);

    /**
     * @param request the request parameters of DeleteExperienceData  DeleteExperienceDataRequest
     * @return DeleteExperienceDataResponse
     */
    CompletableFuture<DeleteExperienceDataResponse> deleteExperienceData(DeleteExperienceDataRequest request);

    /**
     * @param request the request parameters of DeleteFunctionInstance  DeleteFunctionInstanceRequest
     * @return DeleteFunctionInstanceResponse
     */
    CompletableFuture<DeleteFunctionInstanceResponse> deleteFunctionInstance(DeleteFunctionInstanceRequest request);

    /**
     * @param request the request parameters of DeleteOfflineTask  DeleteOfflineTaskRequest
     * @return DeleteOfflineTaskResponse
     */
    CompletableFuture<DeleteOfflineTaskResponse> deleteOfflineTask(DeleteOfflineTaskRequest request);

    /**
     * @param request the request parameters of DeleteRagEvaluatorTask  DeleteRagEvaluatorTaskRequest
     * @return DeleteRagEvaluatorTaskResponse
     */
    CompletableFuture<DeleteRagEvaluatorTaskResponse> deleteRagEvaluatorTask(DeleteRagEvaluatorTaskRequest request);

    /**
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * @param request the request parameters of DescribeCapability  DescribeCapabilityRequest
     * @return DescribeCapabilityResponse
     */
    CompletableFuture<DescribeCapabilityResponse> describeCapability(DescribeCapabilityRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of GetAsyncTask  GetAsyncTaskRequest
     * @return GetAsyncTaskResponse
     */
    CompletableFuture<GetAsyncTaskResponse> getAsyncTask(GetAsyncTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * @param request the request parameters of GetConfig  GetConfigRequest
     * @return GetConfigResponse
     */
    CompletableFuture<GetConfigResponse> getConfig(GetConfigRequest request);

    /**
     * @param request the request parameters of GetCredentials  GetCredentialsRequest
     * @return GetCredentialsResponse
     */
    CompletableFuture<GetCredentialsResponse> getCredentials(GetCredentialsRequest request);

    /**
     * @param request the request parameters of GetExperienceData  GetExperienceDataRequest
     * @return GetExperienceDataResponse
     */
    CompletableFuture<GetExperienceDataResponse> getExperienceData(GetExperienceDataRequest request);

    /**
     * @param request the request parameters of GetFunctionInstance  GetFunctionInstanceRequest
     * @return GetFunctionInstanceResponse
     */
    CompletableFuture<GetFunctionInstanceResponse> getFunctionInstance(GetFunctionInstanceRequest request);

    /**
     * @param request the request parameters of GetOfflineTask  GetOfflineTaskRequest
     * @return GetOfflineTaskResponse
     */
    CompletableFuture<GetOfflineTaskResponse> getOfflineTask(GetOfflineTaskRequest request);

    /**
     * @param request the request parameters of GetOfflineTaskLog  GetOfflineTaskLogRequest
     * @return GetOfflineTaskLogResponse
     */
    CompletableFuture<GetOfflineTaskLogResponse> getOfflineTaskLog(GetOfflineTaskLogRequest request);

    /**
     * @param request the request parameters of GetRagEvaluatorTask  GetRagEvaluatorTaskRequest
     * @return GetRagEvaluatorTaskResponse
     */
    CompletableFuture<GetRagEvaluatorTaskResponse> getRagEvaluatorTask(GetRagEvaluatorTaskRequest request);

    /**
     * @param request the request parameters of GetTableColumns  GetTableColumnsRequest
     * @return GetTableColumnsResponse
     */
    CompletableFuture<GetTableColumnsResponse> getTableColumns(GetTableColumnsRequest request);

    /**
     * @param request the request parameters of GetTableFields  GetTableFieldsRequest
     * @return GetTableFieldsResponse
     */
    CompletableFuture<GetTableFieldsResponse> getTableFields(GetTableFieldsRequest request);

    /**
     * @param request the request parameters of GetTables  GetTablesRequest
     * @return GetTablesResponse
     */
    CompletableFuture<GetTablesResponse> getTables(GetTablesRequest request);

    /**
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * @param request the request parameters of ListAsyncTasks  ListAsyncTasksRequest
     * @return ListAsyncTasksResponse
     */
    CompletableFuture<ListAsyncTasksResponse> listAsyncTasks(ListAsyncTasksRequest request);

    /**
     * @param request the request parameters of ListCapabilities  ListCapabilitiesRequest
     * @return ListCapabilitiesResponse
     */
    CompletableFuture<ListCapabilitiesResponse> listCapabilities(ListCapabilitiesRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * @param request the request parameters of ListConfigs  ListConfigsRequest
     * @return ListConfigsResponse
     */
    CompletableFuture<ListConfigsResponse> listConfigs(ListConfigsRequest request);

    /**
     * @param request the request parameters of ListCredentials  ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    CompletableFuture<ListCredentialsResponse> listCredentials(ListCredentialsRequest request);

    /**
     * @param request the request parameters of ListExperienceData  ListExperienceDataRequest
     * @return ListExperienceDataResponse
     */
    CompletableFuture<ListExperienceDataResponse> listExperienceData(ListExperienceDataRequest request);

    /**
     * @param request the request parameters of ListFunctionInstances  ListFunctionInstancesRequest
     * @return ListFunctionInstancesResponse
     */
    CompletableFuture<ListFunctionInstancesResponse> listFunctionInstances(ListFunctionInstancesRequest request);

    /**
     * @param request the request parameters of ListFunctionRestrictions  ListFunctionRestrictionsRequest
     * @return ListFunctionRestrictionsResponse
     */
    CompletableFuture<ListFunctionRestrictionsResponse> listFunctionRestrictions(ListFunctionRestrictionsRequest request);

    /**
     * @param request the request parameters of ListOfflineTask  ListOfflineTaskRequest
     * @return ListOfflineTaskResponse
     */
    CompletableFuture<ListOfflineTaskResponse> listOfflineTask(ListOfflineTaskRequest request);

    /**
     * @param request the request parameters of ListOfflineTaskErrorLogs  ListOfflineTaskErrorLogsRequest
     * @return ListOfflineTaskErrorLogsResponse
     */
    CompletableFuture<ListOfflineTaskErrorLogsResponse> listOfflineTaskErrorLogs(ListOfflineTaskErrorLogsRequest request);

    /**
     * @param request the request parameters of ListRagEvaluatorTasks  ListRagEvaluatorTasksRequest
     * @return ListRagEvaluatorTasksResponse
     */
    CompletableFuture<ListRagEvaluatorTasksResponse> listRagEvaluatorTasks(ListRagEvaluatorTasksRequest request);

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of ModifyOfflineTask  ModifyOfflineTaskRequest
     * @return ModifyOfflineTaskResponse
     */
    CompletableFuture<ModifyOfflineTaskResponse> modifyOfflineTask(ModifyOfflineTaskRequest request);

    /**
     * @param request the request parameters of ModifyOfflineTaskLog  ModifyOfflineTaskLogRequest
     * @return ModifyOfflineTaskLogResponse
     */
    CompletableFuture<ModifyOfflineTaskLogResponse> modifyOfflineTaskLog(ModifyOfflineTaskLogRequest request);

    /**
     * @param request the request parameters of ResumeFunctionInstance  ResumeFunctionInstanceRequest
     * @return ResumeFunctionInstanceResponse
     */
    CompletableFuture<ResumeFunctionInstanceResponse> resumeFunctionInstance(ResumeFunctionInstanceRequest request);

    /**
     * @param request the request parameters of StartOfflineTask  StartOfflineTaskRequest
     * @return StartOfflineTaskResponse
     */
    CompletableFuture<StartOfflineTaskResponse> startOfflineTask(StartOfflineTaskRequest request);

    /**
     * @param request the request parameters of StopOfflineTask  StopOfflineTaskRequest
     * @return StopOfflineTaskResponse
     */
    CompletableFuture<StopOfflineTaskResponse> stopOfflineTask(StopOfflineTaskRequest request);

    /**
     * @param request the request parameters of UpdateCapability  UpdateCapabilityRequest
     * @return UpdateCapabilityResponse
     */
    CompletableFuture<UpdateCapabilityResponse> updateCapability(UpdateCapabilityRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * @param request the request parameters of UpdateConfig  UpdateConfigRequest
     * @return UpdateConfigResponse
     */
    CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request);

    /**
     * @param request the request parameters of UpdateCredentials  UpdateCredentialsRequest
     * @return UpdateCredentialsResponse
     */
    CompletableFuture<UpdateCredentialsResponse> updateCredentials(UpdateCredentialsRequest request);

    /**
     * @param request the request parameters of UpdateFunctionInstance  UpdateFunctionInstanceRequest
     * @return UpdateFunctionInstanceResponse
     */
    CompletableFuture<UpdateFunctionInstanceResponse> updateFunctionInstance(UpdateFunctionInstanceRequest request);

    /**
     * @param request the request parameters of UpdateWorkspace  UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request);

}
