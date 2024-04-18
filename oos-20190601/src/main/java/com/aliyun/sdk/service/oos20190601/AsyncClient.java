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

    CompletableFuture<CancelExecutionResponse> cancelExecution(CancelExecutionRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<ContinueDeployApplicationGroupResponse> continueDeployApplicationGroup(ContinueDeployApplicationGroupRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateApplicationGroupResponse> createApplicationGroup(CreateApplicationGroupRequest request);

    CompletableFuture<CreateOpsItemResponse> createOpsItem(CreateOpsItemRequest request);

    CompletableFuture<CreateParameterResponse> createParameter(CreateParameterRequest request);

    CompletableFuture<CreatePatchBaselineResponse> createPatchBaseline(CreatePatchBaselineRequest request);

    CompletableFuture<CreateSecretParameterResponse> createSecretParameter(CreateSecretParameterRequest request);

    CompletableFuture<CreateStateConfigurationResponse> createStateConfiguration(CreateStateConfigurationRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeleteApplicationGroupResponse> deleteApplicationGroup(DeleteApplicationGroupRequest request);

    CompletableFuture<DeleteExecutionsResponse> deleteExecutions(DeleteExecutionsRequest request);

    CompletableFuture<DeleteParameterResponse> deleteParameter(DeleteParameterRequest request);

    CompletableFuture<DeletePatchBaselineResponse> deletePatchBaseline(DeletePatchBaselineRequest request);

    CompletableFuture<DeleteSecretParameterResponse> deleteSecretParameter(DeleteSecretParameterRequest request);

    CompletableFuture<DeleteStateConfigurationsResponse> deleteStateConfigurations(DeleteStateConfigurationsRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteTemplatesResponse> deleteTemplates(DeleteTemplatesRequest request);

    CompletableFuture<DeployApplicationGroupResponse> deployApplicationGroup(DeployApplicationGroupRequest request);

    CompletableFuture<DescribeApplicationGroupBillResponse> describeApplicationGroupBill(DescribeApplicationGroupBillRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<GenerateExecutionPolicyResponse> generateExecutionPolicy(GenerateExecutionPolicyRequest request);

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetApplicationGroupResponse> getApplicationGroup(GetApplicationGroupRequest request);

    CompletableFuture<GetExecutionTemplateResponse> getExecutionTemplate(GetExecutionTemplateRequest request);

    CompletableFuture<GetInventorySchemaResponse> getInventorySchema(GetInventorySchemaRequest request);

    CompletableFuture<GetOpsItemResponse> getOpsItem(GetOpsItemRequest request);

    CompletableFuture<GetParameterResponse> getParameter(GetParameterRequest request);

    CompletableFuture<GetParametersResponse> getParameters(GetParametersRequest request);

    CompletableFuture<GetParametersByPathResponse> getParametersByPath(GetParametersByPathRequest request);

    CompletableFuture<GetPatchBaselineResponse> getPatchBaseline(GetPatchBaselineRequest request);

    CompletableFuture<GetSecretParameterResponse> getSecretParameter(GetSecretParameterRequest request);

    CompletableFuture<GetSecretParametersResponse> getSecretParameters(GetSecretParametersRequest request);

    CompletableFuture<GetSecretParametersByPathResponse> getSecretParametersByPath(GetSecretParametersByPathRequest request);

    CompletableFuture<GetServiceSettingsResponse> getServiceSettings(GetServiceSettingsRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    CompletableFuture<ListActionsResponse> listActions(ListActionsRequest request);

    CompletableFuture<ListApplicationGroupsResponse> listApplicationGroups(ListApplicationGroupsRequest request);

    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<ListExecutionLogsResponse> listExecutionLogs(ListExecutionLogsRequest request);

    CompletableFuture<ListExecutionRiskyTasksResponse> listExecutionRiskyTasks(ListExecutionRiskyTasksRequest request);

    CompletableFuture<ListExecutionsResponse> listExecutions(ListExecutionsRequest request);

    CompletableFuture<ListGitRepositoriesResponse> listGitRepositories(ListGitRepositoriesRequest request);

    CompletableFuture<ListInstancePatchStatesResponse> listInstancePatchStates(ListInstancePatchStatesRequest request);

    CompletableFuture<ListInstancePatchesResponse> listInstancePatches(ListInstancePatchesRequest request);

    CompletableFuture<ListInventoryEntriesResponse> listInventoryEntries(ListInventoryEntriesRequest request);

    CompletableFuture<ListOpsItemsResponse> listOpsItems(ListOpsItemsRequest request);

    CompletableFuture<ListParameterVersionsResponse> listParameterVersions(ListParameterVersionsRequest request);

    CompletableFuture<ListParametersResponse> listParameters(ListParametersRequest request);

    CompletableFuture<ListPatchBaselinesResponse> listPatchBaselines(ListPatchBaselinesRequest request);

    CompletableFuture<ListResourceExecutionStatusResponse> listResourceExecutionStatus(ListResourceExecutionStatusRequest request);

    CompletableFuture<ListSecretParameterVersionsResponse> listSecretParameterVersions(ListSecretParameterVersionsRequest request);

    /**
      * Before you call this operation, make sure that you have the permission to manage Key Management Service (KMS) secrets.
      *
     */
    CompletableFuture<ListSecretParametersResponse> listSecretParameters(ListSecretParametersRequest request);

    CompletableFuture<ListStateConfigurationsResponse> listStateConfigurations(ListStateConfigurationsRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<ListTaskExecutionsResponse> listTaskExecutions(ListTaskExecutionsRequest request);

    CompletableFuture<ListTemplateVersionsResponse> listTemplateVersions(ListTemplateVersionsRequest request);

    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
      * You can call this operation to notify an execution in the following scenarios:
      * *   If a template contains a special task, such as an approval task, the Operation Orchestration Service (OOS) execution engine sets the execution state to Waiting when the approval task is being run. You can call this operation to specify whether to continue the execution.
      * *   If you perform debugging in the debug mode, you can call this operation to notify the execution of the subsequent operations after the execution is created or a task is complete.
      * *   If a high-risk operation task waits for approval, you can call this operation to specify whether to continue the execution.
      *
     */
    CompletableFuture<NotifyExecutionResponse> notifyExecution(NotifyExecutionRequest request);

    CompletableFuture<RegisterDefaultPatchBaselineResponse> registerDefaultPatchBaseline(RegisterDefaultPatchBaselineRequest request);

    CompletableFuture<SearchInventoryResponse> searchInventory(SearchInventoryRequest request);

    CompletableFuture<SetServiceSettingsResponse> setServiceSettings(SetServiceSettingsRequest request);

    CompletableFuture<StartExecutionResponse> startExecution(StartExecutionRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TriggerExecutionResponse> triggerExecution(TriggerExecutionRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

    CompletableFuture<UpdateApplicationGroupResponse> updateApplicationGroup(UpdateApplicationGroupRequest request);

    CompletableFuture<UpdateExecutionResponse> updateExecution(UpdateExecutionRequest request);

    CompletableFuture<UpdateOpsItemResponse> updateOpsItem(UpdateOpsItemRequest request);

    CompletableFuture<UpdateParameterResponse> updateParameter(UpdateParameterRequest request);

    CompletableFuture<UpdatePatchBaselineResponse> updatePatchBaseline(UpdatePatchBaselineRequest request);

    CompletableFuture<UpdateSecretParameterResponse> updateSecretParameter(UpdateSecretParameterRequest request);

    CompletableFuture<UpdateStateConfigurationResponse> updateStateConfiguration(UpdateStateConfigurationRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<ValidateTemplateContentResponse> validateTemplateContent(ValidateTemplateContentRequest request);

}
