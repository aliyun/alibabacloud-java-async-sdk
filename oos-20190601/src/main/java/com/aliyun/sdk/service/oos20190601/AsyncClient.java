// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.oos20190601.models.*;
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
     * @param request the request parameters of AnalyzeGitRepository  AnalyzeGitRepositoryRequest
     * @return AnalyzeGitRepositoryResponse
     */
    CompletableFuture<AnalyzeGitRepositoryResponse> analyzeGitRepository(AnalyzeGitRepositoryRequest request);

    /**
     * @param request the request parameters of CancelExecution  CancelExecutionRequest
     * @return CancelExecutionResponse
     */
    CompletableFuture<CancelExecutionResponse> cancelExecution(CancelExecutionRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of ContinueDeployApplicationGroup  ContinueDeployApplicationGroupRequest
     * @return ContinueDeployApplicationGroupResponse
     */
    CompletableFuture<ContinueDeployApplicationGroupResponse> continueDeployApplicationGroup(ContinueDeployApplicationGroupRequest request);

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
     * @param request the request parameters of CreateApplicationGroup  CreateApplicationGroupRequest
     * @return CreateApplicationGroupResponse
     */
    CompletableFuture<CreateApplicationGroupResponse> createApplicationGroup(CreateApplicationGroupRequest request);

    /**
     * @param request the request parameters of CreateOpsItem  CreateOpsItemRequest
     * @return CreateOpsItemResponse
     */
    CompletableFuture<CreateOpsItemResponse> createOpsItem(CreateOpsItemRequest request);

    /**
     * @param request the request parameters of CreateParameter  CreateParameterRequest
     * @return CreateParameterResponse
     */
    CompletableFuture<CreateParameterResponse> createParameter(CreateParameterRequest request);

    /**
     * @param request the request parameters of CreatePatchBaseline  CreatePatchBaselineRequest
     * @return CreatePatchBaselineResponse
     */
    CompletableFuture<CreatePatchBaselineResponse> createPatchBaseline(CreatePatchBaselineRequest request);

    /**
     * @param request the request parameters of CreateSecretParameter  CreateSecretParameterRequest
     * @return CreateSecretParameterResponse
     */
    CompletableFuture<CreateSecretParameterResponse> createSecretParameter(CreateSecretParameterRequest request);

    /**
     * @param request the request parameters of CreateStateConfiguration  CreateStateConfigurationRequest
     * @return CreateStateConfigurationResponse
     */
    CompletableFuture<CreateStateConfigurationResponse> createStateConfiguration(CreateStateConfigurationRequest request);

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * @param request the request parameters of DeleteApplicationGroup  DeleteApplicationGroupRequest
     * @return DeleteApplicationGroupResponse
     */
    CompletableFuture<DeleteApplicationGroupResponse> deleteApplicationGroup(DeleteApplicationGroupRequest request);

    /**
     * @param request the request parameters of DeleteExecutions  DeleteExecutionsRequest
     * @return DeleteExecutionsResponse
     */
    CompletableFuture<DeleteExecutionsResponse> deleteExecutions(DeleteExecutionsRequest request);

    /**
     * @param request the request parameters of DeleteParameter  DeleteParameterRequest
     * @return DeleteParameterResponse
     */
    CompletableFuture<DeleteParameterResponse> deleteParameter(DeleteParameterRequest request);

    /**
     * @param request the request parameters of DeletePatchBaseline  DeletePatchBaselineRequest
     * @return DeletePatchBaselineResponse
     */
    CompletableFuture<DeletePatchBaselineResponse> deletePatchBaseline(DeletePatchBaselineRequest request);

    /**
     * @param request the request parameters of DeleteSecretParameter  DeleteSecretParameterRequest
     * @return DeleteSecretParameterResponse
     */
    CompletableFuture<DeleteSecretParameterResponse> deleteSecretParameter(DeleteSecretParameterRequest request);

    /**
     * @param request the request parameters of DeleteStateConfigurations  DeleteStateConfigurationsRequest
     * @return DeleteStateConfigurationsResponse
     */
    CompletableFuture<DeleteStateConfigurationsResponse> deleteStateConfigurations(DeleteStateConfigurationsRequest request);

    /**
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of DeleteTemplates  DeleteTemplatesRequest
     * @return DeleteTemplatesResponse
     */
    CompletableFuture<DeleteTemplatesResponse> deleteTemplates(DeleteTemplatesRequest request);

    /**
     * @param request the request parameters of DeployApplicationGroup  DeployApplicationGroupRequest
     * @return DeployApplicationGroupResponse
     */
    CompletableFuture<DeployApplicationGroupResponse> deployApplicationGroup(DeployApplicationGroupRequest request);

    /**
     * @param request the request parameters of DescribeApplicationGroupBill  DescribeApplicationGroupBillRequest
     * @return DescribeApplicationGroupBillResponse
     */
    CompletableFuture<DescribeApplicationGroupBillResponse> describeApplicationGroupBill(DescribeApplicationGroupBillRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of GenerateExecutionPolicy  GenerateExecutionPolicyRequest
     * @return GenerateExecutionPolicyResponse
     */
    CompletableFuture<GenerateExecutionPolicyResponse> generateExecutionPolicy(GenerateExecutionPolicyRequest request);

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of GetApplicationGroup  GetApplicationGroupRequest
     * @return GetApplicationGroupResponse
     */
    CompletableFuture<GetApplicationGroupResponse> getApplicationGroup(GetApplicationGroupRequest request);

    /**
     * @param request the request parameters of GetExecutionTemplate  GetExecutionTemplateRequest
     * @return GetExecutionTemplateResponse
     */
    CompletableFuture<GetExecutionTemplateResponse> getExecutionTemplate(GetExecutionTemplateRequest request);

    /**
     * @param request the request parameters of GetInventorySchema  GetInventorySchemaRequest
     * @return GetInventorySchemaResponse
     */
    CompletableFuture<GetInventorySchemaResponse> getInventorySchema(GetInventorySchemaRequest request);

    /**
     * @param request the request parameters of GetOpsItem  GetOpsItemRequest
     * @return GetOpsItemResponse
     */
    CompletableFuture<GetOpsItemResponse> getOpsItem(GetOpsItemRequest request);

    /**
     * @param request the request parameters of GetParameter  GetParameterRequest
     * @return GetParameterResponse
     */
    CompletableFuture<GetParameterResponse> getParameter(GetParameterRequest request);

    /**
     * @param request the request parameters of GetParameters  GetParametersRequest
     * @return GetParametersResponse
     */
    CompletableFuture<GetParametersResponse> getParameters(GetParametersRequest request);

    /**
     * @param request the request parameters of GetParametersByPath  GetParametersByPathRequest
     * @return GetParametersByPathResponse
     */
    CompletableFuture<GetParametersByPathResponse> getParametersByPath(GetParametersByPathRequest request);

    /**
     * @param request the request parameters of GetPatchBaseline  GetPatchBaselineRequest
     * @return GetPatchBaselineResponse
     */
    CompletableFuture<GetPatchBaselineResponse> getPatchBaseline(GetPatchBaselineRequest request);

    /**
     * @param request the request parameters of GetSecretParameter  GetSecretParameterRequest
     * @return GetSecretParameterResponse
     */
    CompletableFuture<GetSecretParameterResponse> getSecretParameter(GetSecretParameterRequest request);

    /**
     * @param request the request parameters of GetSecretParameters  GetSecretParametersRequest
     * @return GetSecretParametersResponse
     */
    CompletableFuture<GetSecretParametersResponse> getSecretParameters(GetSecretParametersRequest request);

    /**
     * @param request the request parameters of GetSecretParametersByPath  GetSecretParametersByPathRequest
     * @return GetSecretParametersByPathResponse
     */
    CompletableFuture<GetSecretParametersByPathResponse> getSecretParametersByPath(GetSecretParametersByPathRequest request);

    /**
     * @param request the request parameters of GetServiceSettings  GetServiceSettingsRequest
     * @return GetServiceSettingsResponse
     */
    CompletableFuture<GetServiceSettingsResponse> getServiceSettings(GetServiceSettingsRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of ListActions  ListActionsRequest
     * @return ListActionsResponse
     */
    CompletableFuture<ListActionsResponse> listActions(ListActionsRequest request);

    /**
     * @param request the request parameters of ListApplicationGroups  ListApplicationGroupsRequest
     * @return ListApplicationGroupsResponse
     */
    CompletableFuture<ListApplicationGroupsResponse> listApplicationGroups(ListApplicationGroupsRequest request);

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ListExecutionLogs  ListExecutionLogsRequest
     * @return ListExecutionLogsResponse
     */
    CompletableFuture<ListExecutionLogsResponse> listExecutionLogs(ListExecutionLogsRequest request);

    /**
     * @param request the request parameters of ListExecutionRiskyTasks  ListExecutionRiskyTasksRequest
     * @return ListExecutionRiskyTasksResponse
     */
    CompletableFuture<ListExecutionRiskyTasksResponse> listExecutionRiskyTasks(ListExecutionRiskyTasksRequest request);

    /**
     * @param request the request parameters of ListExecutions  ListExecutionsRequest
     * @return ListExecutionsResponse
     */
    CompletableFuture<ListExecutionsResponse> listExecutions(ListExecutionsRequest request);

    /**
     * @param request the request parameters of ListGitRepositories  ListGitRepositoriesRequest
     * @return ListGitRepositoriesResponse
     */
    CompletableFuture<ListGitRepositoriesResponse> listGitRepositories(ListGitRepositoriesRequest request);

    /**
     * @param request the request parameters of ListGitRepositoryContents  ListGitRepositoryContentsRequest
     * @return ListGitRepositoryContentsResponse
     */
    CompletableFuture<ListGitRepositoryContentsResponse> listGitRepositoryContents(ListGitRepositoryContentsRequest request);

    /**
     * @param request the request parameters of ListInstancePackageStates  ListInstancePackageStatesRequest
     * @return ListInstancePackageStatesResponse
     */
    CompletableFuture<ListInstancePackageStatesResponse> listInstancePackageStates(ListInstancePackageStatesRequest request);

    /**
     * @param request the request parameters of ListInstancePatchStates  ListInstancePatchStatesRequest
     * @return ListInstancePatchStatesResponse
     */
    CompletableFuture<ListInstancePatchStatesResponse> listInstancePatchStates(ListInstancePatchStatesRequest request);

    /**
     * @param request the request parameters of ListInstancePatches  ListInstancePatchesRequest
     * @return ListInstancePatchesResponse
     */
    CompletableFuture<ListInstancePatchesResponse> listInstancePatches(ListInstancePatchesRequest request);

    /**
     * @param request the request parameters of ListInventoryEntries  ListInventoryEntriesRequest
     * @return ListInventoryEntriesResponse
     */
    CompletableFuture<ListInventoryEntriesResponse> listInventoryEntries(ListInventoryEntriesRequest request);

    /**
     * @param request the request parameters of ListOpsItems  ListOpsItemsRequest
     * @return ListOpsItemsResponse
     */
    CompletableFuture<ListOpsItemsResponse> listOpsItems(ListOpsItemsRequest request);

    /**
     * @param request the request parameters of ListParameterVersions  ListParameterVersionsRequest
     * @return ListParameterVersionsResponse
     */
    CompletableFuture<ListParameterVersionsResponse> listParameterVersions(ListParameterVersionsRequest request);

    /**
     * @param request the request parameters of ListParameters  ListParametersRequest
     * @return ListParametersResponse
     */
    CompletableFuture<ListParametersResponse> listParameters(ListParametersRequest request);

    /**
     * @param request the request parameters of ListPatchBaselines  ListPatchBaselinesRequest
     * @return ListPatchBaselinesResponse
     */
    CompletableFuture<ListPatchBaselinesResponse> listPatchBaselines(ListPatchBaselinesRequest request);

    /**
     * @param request the request parameters of ListResourceExecutionStatus  ListResourceExecutionStatusRequest
     * @return ListResourceExecutionStatusResponse
     */
    CompletableFuture<ListResourceExecutionStatusResponse> listResourceExecutionStatus(ListResourceExecutionStatusRequest request);

    /**
     * @param request the request parameters of ListSecretParameterVersions  ListSecretParameterVersionsRequest
     * @return ListSecretParameterVersionsResponse
     */
    CompletableFuture<ListSecretParameterVersionsResponse> listSecretParameterVersions(ListSecretParameterVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have the permission to manage Key Management Service (KMS) secrets.</p>
     * 
     * @param request the request parameters of ListSecretParameters  ListSecretParametersRequest
     * @return ListSecretParametersResponse
     */
    CompletableFuture<ListSecretParametersResponse> listSecretParameters(ListSecretParametersRequest request);

    /**
     * @param request the request parameters of ListStateConfigurations  ListStateConfigurationsRequest
     * @return ListStateConfigurationsResponse
     */
    CompletableFuture<ListStateConfigurationsResponse> listStateConfigurations(ListStateConfigurationsRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * @param request the request parameters of ListTaskExecutions  ListTaskExecutionsRequest
     * @return ListTaskExecutionsResponse
     */
    CompletableFuture<ListTaskExecutionsResponse> listTaskExecutions(ListTaskExecutionsRequest request);

    /**
     * @param request the request parameters of ListTemplateVersions  ListTemplateVersionsRequest
     * @return ListTemplateVersionsResponse
     */
    CompletableFuture<ListTemplateVersionsResponse> listTemplateVersions(ListTemplateVersionsRequest request);

    /**
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to notify an execution in the following scenarios:</p>
     * <ul>
     * <li>If a template contains a special task, such as an approval task, the Operation Orchestration Service (OOS) execution engine sets the execution state to Waiting when the approval task is being run. You can call this operation to specify whether to continue the execution.</li>
     * <li>If you perform debugging in the debug mode, you can call this operation to notify the execution of the subsequent operations after the execution is created or a task is complete.</li>
     * <li>If a high-risk operation task waits for approval, you can call this operation to specify whether to continue the execution.</li>
     * </ul>
     * 
     * @param request the request parameters of NotifyExecution  NotifyExecutionRequest
     * @return NotifyExecutionResponse
     */
    CompletableFuture<NotifyExecutionResponse> notifyExecution(NotifyExecutionRequest request);

    /**
     * @param request the request parameters of RegisterDefaultPatchBaseline  RegisterDefaultPatchBaselineRequest
     * @return RegisterDefaultPatchBaselineResponse
     */
    CompletableFuture<RegisterDefaultPatchBaselineResponse> registerDefaultPatchBaseline(RegisterDefaultPatchBaselineRequest request);

    /**
     * @param request the request parameters of SearchInventory  SearchInventoryRequest
     * @return SearchInventoryResponse
     */
    CompletableFuture<SearchInventoryResponse> searchInventory(SearchInventoryRequest request);

    /**
     * @param request the request parameters of SetServiceSettings  SetServiceSettingsRequest
     * @return SetServiceSettingsResponse
     */
    CompletableFuture<SetServiceSettingsResponse> setServiceSettings(SetServiceSettingsRequest request);

    /**
     * @param request the request parameters of StartExecution  StartExecutionRequest
     * @return StartExecutionResponse
     */
    CompletableFuture<StartExecutionResponse> startExecution(StartExecutionRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TriggerExecution  TriggerExecutionRequest
     * @return TriggerExecutionResponse
     */
    CompletableFuture<TriggerExecutionResponse> triggerExecution(TriggerExecutionRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateApplication  UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

    /**
     * @param request the request parameters of UpdateApplicationGroup  UpdateApplicationGroupRequest
     * @return UpdateApplicationGroupResponse
     */
    CompletableFuture<UpdateApplicationGroupResponse> updateApplicationGroup(UpdateApplicationGroupRequest request);

    /**
     * @param request the request parameters of UpdateExecution  UpdateExecutionRequest
     * @return UpdateExecutionResponse
     */
    CompletableFuture<UpdateExecutionResponse> updateExecution(UpdateExecutionRequest request);

    /**
     * @param request the request parameters of UpdateInstancePackageState  UpdateInstancePackageStateRequest
     * @return UpdateInstancePackageStateResponse
     */
    CompletableFuture<UpdateInstancePackageStateResponse> updateInstancePackageState(UpdateInstancePackageStateRequest request);

    /**
     * @param request the request parameters of UpdateOpsItem  UpdateOpsItemRequest
     * @return UpdateOpsItemResponse
     */
    CompletableFuture<UpdateOpsItemResponse> updateOpsItem(UpdateOpsItemRequest request);

    /**
     * @param request the request parameters of UpdateParameter  UpdateParameterRequest
     * @return UpdateParameterResponse
     */
    CompletableFuture<UpdateParameterResponse> updateParameter(UpdateParameterRequest request);

    /**
     * @param request the request parameters of UpdatePatchBaseline  UpdatePatchBaselineRequest
     * @return UpdatePatchBaselineResponse
     */
    CompletableFuture<UpdatePatchBaselineResponse> updatePatchBaseline(UpdatePatchBaselineRequest request);

    /**
     * @param request the request parameters of UpdateSecretParameter  UpdateSecretParameterRequest
     * @return UpdateSecretParameterResponse
     */
    CompletableFuture<UpdateSecretParameterResponse> updateSecretParameter(UpdateSecretParameterRequest request);

    /**
     * @param request the request parameters of UpdateStateConfiguration  UpdateStateConfigurationRequest
     * @return UpdateStateConfigurationResponse
     */
    CompletableFuture<UpdateStateConfigurationResponse> updateStateConfiguration(UpdateStateConfigurationRequest request);

    /**
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
     * @param request the request parameters of ValidateTemplateContent  ValidateTemplateContentRequest
     * @return ValidateTemplateContentResponse
     */
    CompletableFuture<ValidateTemplateContentResponse> validateTemplateContent(ValidateTemplateContentRequest request);

}
