// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ros20190910.models.*;
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

    CompletableFuture<CancelStackOperationResponse> cancelStackOperation(CancelStackOperationRequest request);

    CompletableFuture<CancelUpdateStackResponse> cancelUpdateStack(CancelUpdateStackRequest request);

    /**
      * This topic provides an example on how to continue to create a stack that failed to be created. In this example, the stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` failed to be created in the China (Hangzhou) region.
      *
     */
    CompletableFuture<ContinueCreateStackResponse> continueCreateStack(ContinueCreateStackRequest request);

    /**
      * ### Limits
      * You can create and execute change sets to update running stacks. For more information about change sets, see [Overview](~~156038~~).
      * ### Usage notes
      * *   A stack can contain up to 20 change sets.
      * *   Change sets reflect only the changes of stacks. Change sets do not reflect whether stacks are updated.
      * *   You cannot use change sets to check the following items: whether the upper limit of your Alibaba Cloud account is reached, whether resources that cannot be updated are updated, and whether your Alibaba Cloud account has permissions to modify resources. These items may cause stack updates to fail. If stacks fail to be updated, Resource Orchestration Service (ROS) rolls back the resources to the original status.
      * In this topic, a change set named `MyChangeSet` is created in the `China (Hangzhou)` region. In this example, the template of the stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` is updated to `{"ROSTemplateFormatVersion":"2015-09-01"}`.
      *
     */
    CompletableFuture<CreateChangeSetResponse> createChangeSet(CreateChangeSetRequest request);

    /**
      * A stack is a collection of ROS resources that you can manage as a single unit. To create a collection of resources, you can create a stack. For more information about stacks, see [Overview](~~172973~~).\\
      * When you call the operation, take note of the following limits:
      * *   You can create up to 200 stacks within an Alibaba Cloud account.
      * *   You can create up to 200 resources in a stack.
      * This topic provides an example on how to create a stack named `MyStack` in the China (Hangzhou) region by using a template. In this example, `TemplateBody` is set to `{"ROSTemplateFormatVersion":"2015-09-01"}`.
      *
     */
    CompletableFuture<CreateStackResponse> createStack(CreateStackRequest request);

    /**
      * | Error code | Error message | HTTP status code | Description |
      * | ---------- | ------------- | ---------------- | ----------- |
      * | CircularDependency | Circular Dependency Found: {reason}. | 400 | The error message returned because the template contains circular dependencies. reason indicates the cause of the error. |
      * | InvalidSchema | {reason}. | 400 | The error message returned because the template format is invalid. reason indicates the cause of the error. |
      * | InvalidTemplateAttribute | The Referenced Attribute ({resource} {name}) is incorrect. | 400 | The error message returned because the resource property that is referenced in the Outputs section of the template is invalid. resource indicates the resource name. name indicates the property name. |
      * | InvalidTemplatePropertyType | The specified value type of ({resource} {section}) is incorrect. | 400 | The error message returned because the type of the resource property that is defined in a template section is invalid. resource indicates the resource name. section indicates the section name. |
      * | InvalidTemplateReference | The specified reference "{name}" (in {referencer}) is incorrect. | 400 | The error message returned because the template contains an invalid reference. name indicates the reference name. referencer indicates the referencer name. |
      * | InvalidTemplateSection | The template section is invalid: {section}. | 400 | The error message returned because the template contains an invalid section. section indicates the section name. |
      * | InvalidTemplateVersion | The template version is invalid: {reason}. | 400 | The error message returned because the template version is invalid. reason indicates the cause of the error. |
      * | UnknownUserParameter | The Parameter ({name}) was not defined in template. | 400 | The error message returned because the specified parameter is not defined in the template. name indicates the parameter name. |
      * | UserParameterMissing | The Parameter {name} was not provided. | 400 | The error message returned because no value is specified for a parameter in the template. name indicates the parameter name. |
      * | StackGroupExists | The StackGroup ({name}) already exists. | 409 | The error message returned because a stack group that has the same name already exists. name indicates the name of the stack group. |
      * | TemplateNotFound | The Tempalte ({ ID }) could not be found. | 404 | The error message returned because the template does not exist. ID indicates the ID of the template. |
      * | TemplateNotFound | The Template { ID } with version { version } could not be found. | 404 | The error message returned because the specified template or template version does not exist. ID indicates the ID of the template. version indicates the version of the template. |
      *
     */
    CompletableFuture<CreateStackGroupResponse> createStackGroup(CreateStackGroupRequest request);

    /**
      * Before you call this operation, make sure that a stack group is created. For more information, see [CreateStackGroup](~~151333~~).
      * This topic provides an example on how to create stacks in a stack group. In this example, stacks are created in a stack group named `MyStackGroup`. The stacks are created within the `151266687691****` and `141261387191****` Alibaba Cloud accounts in the China (Hangzhou) and China (Beijing) regions. The stack group is granted self-managed permissions and created in the China (Hangzhou) region.
      *
     */
    CompletableFuture<CreateStackInstancesResponse> createStackInstances(CreateStackInstancesRequest request);

    /**
      * This topic provides an example on how to create a template. In this example, a template named `MyTemplate` is created in the `China (Hangzhou)` region. The `TemplateBody` parameter is set to `{"ROSTemplateFormatVersion": "2015-09-01"}`.
      *
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
      * You can call this operation to create a scenario that allows you to specify a resource scope on a visualized interface and easily replicate and manage the resources that you specify. For more information about scenarios, see [Overview](~~352074~~).
      * This topic provides an example on how to create a scenario of the resource replication type in the China (Hangzhou) region. In this example, a virtual private cloud (VPC) named `vpc-bp1m6fww66xbntjyc****` is replicated by using the scenario.
      *
     */
    CompletableFuture<CreateTemplateScratchResponse> createTemplateScratch(CreateTemplateScratchRequest request);

    /**
      * Limits:
      * *   Before you call this operation, make sure that the following requirements are met:
      *     *   The status of the change set is CREATE_COMPLETE, CREATE_FAILED, or DELETE_FAILED.
      *     *   The execution status is UNAVAILABLE or AVAILABLE.
      * *   After a change set is executed, other change sets associated with the same stack as this change set are deleted.
      * *   After a stack is deleted, change sets associated with the stack are deleted.
      * *   If a change set of the CREATE type is deleted, you must delete stacks associated with the change set.
      * In this example, a change set in the China (Hangzhou) region whose ID is `1f6521a4-05af-4975-afe9-bc4b45ad****` is deleted.
      *
     */
    CompletableFuture<DeleteChangeSetResponse> deleteChangeSet(DeleteChangeSetRequest request);

    CompletableFuture<DeleteStackResponse> deleteStack(DeleteStackRequest request);

    /**
      * A stack group can be deleted only when the stack group does not contain stacks. You can call the [DeleteStackInstances](~~151715~~) operation to delete stacks.
      * This topic provides an example on how to delete a stack group. In this example, a stack group named `MyStackGroup` in the China (Hangzhou) region is deleted.
      *
     */
    CompletableFuture<DeleteStackGroupResponse> deleteStackGroup(DeleteStackGroupRequest request);

    /**
      * This topic provides an example on how to delete stacks from a stack group. In this example, the stacks that are deployed within the `151266687691****` Alibaba Cloud account in the China (Beijing) region are deleted from a stack group named `MyStackGroup`. The stack group is deployed in the China (Hangzhou) region and granted self-managed permissions.
      *
     */
    CompletableFuture<DeleteStackInstancesResponse> deleteStackInstances(DeleteStackInstancesRequest request);

    /**
      * If the template is shared with other Alibaba Cloud accounts, you must unshare the template before you delete it.
      *
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
      * This topic describes how to delete a scenario. In this topic, the `ts-4f83704400994409****` scenario in the China (Hangzhou) region is deleted.
      *
     */
    CompletableFuture<DeleteTemplateScratchResponse> deleteTemplateScratch(DeleteTemplateScratchRequest request);

    CompletableFuture<DeregisterResourceTypeResponse> deregisterResourceType(DeregisterResourceTypeRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DetectStackDriftResponse> detectStackDrift(DetectStackDriftRequest request);

    CompletableFuture<DetectStackGroupDriftResponse> detectStackGroupDrift(DetectStackGroupDriftRequest request);

    CompletableFuture<DetectStackResourceDriftResponse> detectStackResourceDrift(DetectStackResourceDriftRequest request);

    /**
      * In this example, a change set in the `China (Hangzhou)` region whose ID is `1f6521a4-05af-4975-afe9-bc4b45ad****` is executed.
      *
     */
    CompletableFuture<ExecuteChangeSetResponse> executeChangeSet(ExecuteChangeSetRequest request);

    /**
      * This topic describes how to create a template for a scenario. In this topic, the `ts-aa9c62feab844a6b****` scenario of the Resource Management type in the China (Hangzhou) region is used.
      *
     */
    CompletableFuture<GenerateTemplateByScratchResponse> generateTemplateByScratch(GenerateTemplateByScratchRequest request);

    /**
      * If the policy information is related to Enterprise Distributed Application Service (EDAS), you must log on to your Alibaba Cloud account and grant the required permissions to the relevant RAM users.
      * In this example, a policy is generated for a template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****`.
      *
     */
    CompletableFuture<GenerateTemplatePolicyResponse> generateTemplatePolicy(GenerateTemplatePolicyRequest request);

    /**
      * In this example, the information of the change set whose ID is `4c11658d-bd47-4dd0-ba64-727edc62****` is queried.
      *
     */
    CompletableFuture<GetChangeSetResponse> getChangeSet(GetChangeSetRequest request);

    /**
      * You can call this operation to query the Terraform hosting, resource cleaner, and scenario features.
      * This topic provides an example on how to query the details of features supported by ROS in the China (Hangzhou) region. The details include Terraform versions, provider versions, and supported resource types.
      * >  In the Examples section, only part of the sample code is provided.
      *
     */
    CompletableFuture<GetFeatureDetailsResponse> getFeatureDetails(GetFeatureDetailsRequest request);

    /**
      * For more information about common request parameters, see [Common parameters](~~131957~~).
      *
     */
    CompletableFuture<GetResourceTypeResponse> getResourceType(GetResourceTypeRequest request);

    CompletableFuture<GetResourceTypeTemplateResponse> getResourceTypeTemplate(GetResourceTypeTemplateRequest request);

    /**
      * This topic describes how to query the activation status and the RAM roles of an Alibaba Cloud service. In this example, the Elastic High Performance Computing (E-HPC) service that is deployed in the China (Hangzhou) region is queried.
      * >  Make sure that you have obtained the permissions on the [GetRole](~~28711~~) operation.
      *
     */
    CompletableFuture<GetServiceProvisionsResponse> getServiceProvisions(GetServiceProvisionsRequest request);

    /**
      * In this topic, the information about a stack whose ID is `c754d2a4-28f1-46df-b557-9586173a****` is queried. The stack is deployed in the China (Hangzhou) region.
      *
     */
    CompletableFuture<GetStackResponse> getStack(GetStackRequest request);

    /**
      * In this topic, the status of a drift detection operation whose ID is `a7044f0d-6f2e-4128-a307-4524ef88****` is queried. The operation is performed in the China (Hangzhou) region.
      *
     */
    CompletableFuture<GetStackDriftDetectionStatusResponse> getStackDriftDetectionStatus(GetStackDriftDetectionStatusRequest request);

    /**
      * For more information about common request parameters, see [Common parameters](~~131957~~).
      *
     */
    CompletableFuture<GetStackGroupResponse> getStackGroup(GetStackGroupRequest request);

    /**
      * In this example, the operation ID `6da106ca-1784-4a6f-a7e1-e723863d∗∗∗∗` is set to query the details of an operation that you perform on a stack group named `MyStackGroup`. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
     */
    CompletableFuture<GetStackGroupOperationResponse> getStackGroupOperation(GetStackGroupOperationRequest request);

    /**
      * In this example, the details of a stack that is deployed in the China (Beijing) region within the `151266687691****` Alibaba Cloud account are queried. The stack is deployed in a stack group named `MyStackGroup`. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
     */
    CompletableFuture<GetStackInstanceResponse> getStackInstance(GetStackInstanceRequest request);

    /**
      * In this example, the stack policy of a stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` is queried. The stack is deployed in the China (Hangzhou) region.
      *
     */
    CompletableFuture<GetStackPolicyResponse> getStackPolicy(GetStackPolicyRequest request);

    /**
      * | Http status code | Error code | Error message | Description |
      * | ---------------- | ---------- | ------------- | ----------- |
      * | 404 | ResourceNotFound | The Resource ({name}) could not be found in Stack {stack}. | The error message returned because the specified resource does not exist in the stack. name indicates the resource name. stack indicates the stack name or ID. |
      * | 404 | StackNotFound | The Stack ({name}) could not be found. | The error message returned because the stack does not exist. name indicates the name or ID of the stack. |
      *
     */
    CompletableFuture<GetStackResourceResponse> getStackResource(GetStackResourceRequest request);

    /**
      * In this example, the details of a template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****` and region ID is `cn-hangzhou` are queried.
      *
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
      * ###
      * *   For more information about the resources that support price inquiry in Resource Orchestration Service (ROS) templates, see the "**Resource types that support price inquiry**" section of the [Estimate resource prices](~~203165~~) topic.
      * *   For more information about the resources that support price inquiry in Terraform templates, see the "**ROS resources supported by Terraform**" section of the [ROS features and resources supported by Terraform](~~184389~~) topic.
      * The following sample code provides an example on how to query the estimated price of an elastic IP address (EIP) that you want to create based on a template. In this example, the following template is used:
      *     {
      *       "ROSTemplateFormatVersion": "2015-09-01",
      *       "Parameters": {
      *         "Isp": {
      *           "Type": "String",
      *           "Default": "BGP"
      *         },
      *         "Name": {
      *           "Type": "String",
      *           "Default": "test"
      *         },
      *         "Netmode": {
      *           "Type": "String",
      *           "Default": "public"
      *         },
      *         "Bandwidth": {
      *           "Type": "Number",
      *           "Default": 5
      *         }
      *       },
      *       "Resources": {
      *         "NewEip": {
      *           "Type": "ALIYUN::VPC::EIP",
      *           "Properties": {
      *             "InstanceChargeType": "Prepaid",
      *             "PricingCycle": "Month",
      *             "Isp": {
      *               "Ref": "Isp"
      *             },
      *             "Period": 1,
      *             "DeletionProtection": false,
      *             "AutoPay": false,
      *             "Name": {
      *               "Ref": "Name"
      *             },
      *             "InternetChargeType": "PayByTraffic",
      *             "Netmode": {
      *               "Ref": "Netmode"
      *             },
      *             "Bandwidth": {
      *               "Ref": "Bandwidth"
      *             }
      *           }
      *         }
      *       }
      *     }
      *
     */
    CompletableFuture<GetTemplateEstimateCostResponse> getTemplateEstimateCost(GetTemplateEstimateCostRequest request);

    /**
      * This topic provides an example on how to query the values of a parameter. In this example, the values of the `ZoneInfo` parameter in a template that is created in the China (Hangzhou) region are queried. The template body is `{"Parameters":{"ZoneInfo":{"Type": "String"},"InstanceType": {"Type": "String"}},"ROSTemplateFormatVersion": "2015-09-01","Resources":{"ECS":{"Properties":{"ZoneId":{"Ref": "ZoneInfo"},"InstanceType": {"Ref": "InstanceType"}},"Type": "ALIYUN::ECS::Instance"}}}`.
      * For more information about the template parameters whose values you can query by calling this operation and the sample code of the template, see [Query the constraints of parameters](~~432820~~).
      *
     */
    CompletableFuture<GetTemplateParameterConstraintsResponse> getTemplateParameterConstraints(GetTemplateParameterConstraintsRequest request);

    CompletableFuture<GetTemplateRecommendParametersResponse> getTemplateRecommendParameters(GetTemplateRecommendParametersRequest request);

    /**
      * In this example, the details of the scenario whose ID is `ts-7f7a704cf71c49a6****` is queried. In the response, the source node data is displayed.
      *
     */
    CompletableFuture<GetTemplateScratchResponse> getTemplateScratch(GetTemplateScratchRequest request);

    CompletableFuture<GetTemplateSummaryResponse> getTemplateSummary(GetTemplateSummaryRequest request);

    CompletableFuture<ListChangeSetsResponse> listChangeSets(ListChangeSetsRequest request);

    CompletableFuture<ListResourceTypeRegistrationsResponse> listResourceTypeRegistrations(ListResourceTypeRegistrationsRequest request);

    CompletableFuture<ListResourceTypeVersionsResponse> listResourceTypeVersions(ListResourceTypeVersionsRequest request);

    /**
      * For more information about errors common to all operations, see [Common error codes](/help/en/resource-orchestration-service/latest/common-error-codes).
      *
     */
    CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request);

    CompletableFuture<ListStackEventsResponse> listStackEvents(ListStackEventsRequest request);

    /**
      * In this example, the operation ID `6da106ca-1784-4a6f-a7e1-e723863d∗∗∗∗` is set to query the results of an operation on a stack group named `MyStackGroup`. The stack group is granted self-managed permissions and created in the China (Hangzhou) region.
      *
     */
    CompletableFuture<ListStackGroupOperationResultsResponse> listStackGroupOperationResults(ListStackGroupOperationResultsRequest request);

    CompletableFuture<ListStackGroupOperationsResponse> listStackGroupOperations(ListStackGroupOperationsRequest request);

    /**
      * In this example, the list of stack groups that are in the ACTIVE state and deployed in the China (Hangzhou) region is queried.
      *
     */
    CompletableFuture<ListStackGroupsResponse> listStackGroups(ListStackGroupsRequest request);

    /**
      * In this example, the list of stack instances that are associated with a stack group named `MyStackGroup` is queried. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
     */
    CompletableFuture<ListStackInstancesResponse> listStackInstances(ListStackInstancesRequest request);

    /**
      * The ListStackOperationRisks operation is suitable for the following scenarios:
      * *   You want to detect high risks that may arise in resources when you delete a stack that contains the resources, and query the cause of each risk in a resource.
      * *   When you create a stack, the creation may fail. In this case, you can call this operation to check which types of permissions that are required to create stacks are missing.
      *
     */
    CompletableFuture<ListStackOperationRisksResponse> listStackOperationRisks(ListStackOperationRisksRequest request);

    CompletableFuture<ListStackResourceDriftsResponse> listStackResourceDrifts(ListStackResourceDriftsRequest request);

    /**
      * For more information about common request parameters, see [Common parameters](~~131957~~).
      *
     */
    CompletableFuture<ListStackResourcesResponse> listStackResources(ListStackResourcesRequest request);

    /**
      * Specifies whether to return nested stacks. Default value: false. Valid values:
      * *   true
      * *   false
      * > If the ParentStackId parameter is specified, you must set the ShowNestedStack parameter to true.
      *
     */
    CompletableFuture<ListStacksResponse> listStacks(ListStacksRequest request);

    /**
      * In this example, the tag keys that are added to a stack in the China (Hangzhou) region are queried.
      *
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
      * *   To specify the query object, you must specify the ResourceId.N or Tag.N parameter in the request. Tag.N consists of Tag.N.Key and Tag.N.Value.
      * *   If you specify the Tag.N and ResourceId.N parameters, ROS resources that match both the parameters are returned.
      * This topic provides an example on how to query the tags that are added to a resource in a stack. In this example, the resource ID is `6bc589b5-9c02-4944-8fc3-f3624234****`. The stack is deployed in the China (Hangzhou) region.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * In this example, the tag values of `TagKey1` that is added to a stack in the China (Hangzhou) region are queried.
      *
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
      * This topic provides an example on how to query the list of scenarios. In this example, the scenarios that are created in the China (Hangzhou) region are queried. The following scenarios are returned: resource management and resource replication scenarios.
      *
     */
    CompletableFuture<ListTemplateScratchesResponse> listTemplateScratches(ListTemplateScratchesRequest request);

    CompletableFuture<ListTemplateVersionsResponse> listTemplateVersions(ListTemplateVersionsRequest request);

    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
      * In this example, a stack deployed in the `China (Hangzhou)` region is moved to a specific resource group. The ID of the stack is `4e8611cb-251e-42b7-b9cb-3496362c****` and the ID of the resource group is `rg-acfm3peow3k****`.
      *
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
      * This topic provides an example on how to create a stack named `MyStack` in the China (Hangzhou) region and preview the information about the stack. In this example, the template body of the stack is `{"ROSTemplateFormatVersion":"2015-09-01"}`.
      *
     */
    CompletableFuture<PreviewStackResponse> previewStack(PreviewStackRequest request);

    CompletableFuture<RegisterResourceTypeResponse> registerResourceType(RegisterResourceTypeRequest request);

    CompletableFuture<SetDeletionProtectionResponse> setDeletionProtection(SetDeletionProtectionRequest request);

    CompletableFuture<SetResourceTypeResponse> setResourceType(SetResourceTypeRequest request);

    /**
      * In this example, a stack policy is configured for a stack deployed in the `China (Hangzhou)` region whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****`. The URL to the stack policy body is `oss://ros/stack-policy/demo`.
      *
     */
    CompletableFuture<SetStackPolicyResponse> setStackPolicy(SetStackPolicyRequest request);

    /**
      * In this example, a template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****` is shared with an Alibaba Cloud account whose ID is `151266687691****`.
      * >  The account can authorize an RAM user to use the shared template.``
      *
     */
    CompletableFuture<SetTemplatePermissionResponse> setTemplatePermission(SetTemplatePermissionRequest request);

    CompletableFuture<SignalResourceResponse> signalResource(SignalResourceRequest request);

    /**
      * This topic provides an example on how to stop a stack group operation whose ID is `6da106ca-1784-4a6f-a7e1-e723863****` in the China (Hangzhou) region.
      *
     */
    CompletableFuture<StopStackGroupOperationResponse> stopStackGroupOperation(StopStackGroupOperationRequest request);

    /**
      * This topic provides an example on how to create a tag and add the tag to a resource in a stack. In this example, the resource ID is `7fee80e1-8c48-4c2f-8300-0f6dc40b****`, the tag key is `FinanceDept`, and the tag value is `FinanceJoshua`.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * This topic provides an example on how to remove all tags from a stack that is deployed in the China (Hangzhou) region. In this example, the ID of the stack is `46ec7b78-9d5e-4b21-aefd-448c90aa****`.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * The values of parameters in the Parameters section vary based on the value that you specify for the UsePreviousParameters parameter in the request. If you do not add the parameters that are defined in the template to the Parameters section, take note of the following items:
      * *   UsePreviousParameters is set to false: If the template parameters have default values, the default values are used. Otherwise, you must specify values for the template parameters in the Parameters section.
      * *   UsePreviousParameters is set to true: If you specify values for the template parameters when you create a stack, the values are used. If you leave the template parameters empty when you create a stack but the template parameters have default values, the default values are used.
      * This topic describes how to update a stack. In this example, the template body of a stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` in the China (Beijing) region is updated to `{"ROSTemplateFormatVersion": "2015-09-01"}`.
      *
     */
    CompletableFuture<UpdateStackResponse> updateStack(UpdateStackRequest request);

    /**
      * The name of the stack group. The name must be unique within a region.
      * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\\_). The name must start with a digit or a letter.
      *
     */
    CompletableFuture<UpdateStackGroupResponse> updateStackGroup(UpdateStackGroupRequest request);

    /**
      * This topic provides an example on how to update stacks in a stack group. In this example, the stacks that are deployed in a stack group named `MyStackGroup` are updated. The stacks are deployed within the `151266687691****` and `141261387191****` Alibaba Cloud accounts in the China (Hangzhou) and China (Beijing) regions. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
     */
    CompletableFuture<UpdateStackInstancesResponse> updateStackInstances(UpdateStackInstancesRequest request);

    /**
      * Limits: You can eliminate only drift on stacks that have drifted. You must call the [DetectStackDrift](~~155094~~) operation to perform drift detection on a stack, call the [GetStackDriftDetectionStatus](~~155097~~) operation to query the drift status of the stack to make sure that the stack has drifted, and then call the UpdateStackTemplateByResources operation to eliminate drift.
      * In this topic, drift is eliminated for a stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****`. The stack is deployed in the China (Hangzhou) region.
      *
     */
    CompletableFuture<UpdateStackTemplateByResourcesResponse> updateStackTemplateByResources(UpdateStackTemplateByResourcesRequest request);

    /**
      * Take note of the following items:
      * *   If you specify the TemplateBody or TemplateURL parameter, the existing version number is automatically incremented by 1 after the template is updated. For example, the version is changed from v1 to V2.
      * *   If you do not specify the TemplateBody or TemplateURL parameter, the version number remains unchanged.
      * *   A template can have up to 100 versions. If the number of templates reaches the upper limit, the template fails to be updated. You must create another template.
      *
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
      * In this topic, the `ts-7f7a704cf71c49a6****` scenario that is created in the China (Hangzhou) region is updated. In this scenario, the ID of the virtual private cloud (VPC) is updated to `ts-7f7a704cf71c49a6****`.
      *
     */
    CompletableFuture<UpdateTemplateScratchResponse> updateTemplateScratch(UpdateTemplateScratchRequest request);

    /**
      * The description of the template.
      *
     */
    CompletableFuture<ValidateTemplateResponse> validateTemplate(ValidateTemplateRequest request);

}
