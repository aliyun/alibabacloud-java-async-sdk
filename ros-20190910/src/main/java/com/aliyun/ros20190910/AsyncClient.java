// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910;

import com.aliyun.ros20190910.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<CancelUpdateStackResponse> cancelUpdateStack(CancelUpdateStackRequest request);

    CompletableFuture<ContinueCreateStackResponse> continueCreateStack(ContinueCreateStackRequest request);

    CompletableFuture<CreateChangeSetResponse> createChangeSet(CreateChangeSetRequest request);

    CompletableFuture<CreateStackResponse> createStack(CreateStackRequest request);

    CompletableFuture<CreateStackGroupResponse> createStackGroup(CreateStackGroupRequest request);

    CompletableFuture<CreateStackInstancesResponse> createStackInstances(CreateStackInstancesRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<CreateTemplateScratchResponse> createTemplateScratch(CreateTemplateScratchRequest request);

    CompletableFuture<DeleteChangeSetResponse> deleteChangeSet(DeleteChangeSetRequest request);

    CompletableFuture<DeleteStackResponse> deleteStack(DeleteStackRequest request);

    CompletableFuture<DeleteStackGroupResponse> deleteStackGroup(DeleteStackGroupRequest request);

    CompletableFuture<DeleteStackInstancesResponse> deleteStackInstances(DeleteStackInstancesRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteTemplateScratchResponse> deleteTemplateScratch(DeleteTemplateScratchRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DetectStackDriftResponse> detectStackDrift(DetectStackDriftRequest request);

    CompletableFuture<DetectStackGroupDriftResponse> detectStackGroupDrift(DetectStackGroupDriftRequest request);

    CompletableFuture<DetectStackResourceDriftResponse> detectStackResourceDrift(DetectStackResourceDriftRequest request);

    CompletableFuture<ExecuteChangeSetResponse> executeChangeSet(ExecuteChangeSetRequest request);

    CompletableFuture<GenerateTemplateByScratchResponse> generateTemplateByScratch(GenerateTemplateByScratchRequest request);

    CompletableFuture<GenerateTemplatePolicyResponse> generateTemplatePolicy(GenerateTemplatePolicyRequest request);

    CompletableFuture<GetChangeSetResponse> getChangeSet(GetChangeSetRequest request);

    CompletableFuture<GetFeatureDetailsResponse> getFeatureDetails(GetFeatureDetailsRequest request);

    CompletableFuture<GetResourceTypeResponse> getResourceType(GetResourceTypeRequest request);

    CompletableFuture<GetResourceTypeTemplateResponse> getResourceTypeTemplate(GetResourceTypeTemplateRequest request);

    CompletableFuture<GetServiceProvisionsResponse> getServiceProvisions(GetServiceProvisionsRequest request);

    CompletableFuture<GetStackResponse> getStack(GetStackRequest request);

    CompletableFuture<GetStackDriftDetectionStatusResponse> getStackDriftDetectionStatus(GetStackDriftDetectionStatusRequest request);

    CompletableFuture<GetStackGroupResponse> getStackGroup(GetStackGroupRequest request);

    CompletableFuture<GetStackGroupOperationResponse> getStackGroupOperation(GetStackGroupOperationRequest request);

    CompletableFuture<GetStackInstanceResponse> getStackInstance(GetStackInstanceRequest request);

    CompletableFuture<GetStackPolicyResponse> getStackPolicy(GetStackPolicyRequest request);

    CompletableFuture<GetStackResourceResponse> getStackResource(GetStackResourceRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    CompletableFuture<GetTemplateEstimateCostResponse> getTemplateEstimateCost(GetTemplateEstimateCostRequest request);

    CompletableFuture<GetTemplateParameterConstraintsResponse> getTemplateParameterConstraints(GetTemplateParameterConstraintsRequest request);

    CompletableFuture<GetTemplateScratchResponse> getTemplateScratch(GetTemplateScratchRequest request);

    CompletableFuture<GetTemplateSummaryResponse> getTemplateSummary(GetTemplateSummaryRequest request);

    CompletableFuture<ListChangeSetsResponse> listChangeSets(ListChangeSetsRequest request);

    CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request);

    CompletableFuture<ListStackEventsResponse> listStackEvents(ListStackEventsRequest request);

    CompletableFuture<ListStackGroupOperationResultsResponse> listStackGroupOperationResults(ListStackGroupOperationResultsRequest request);

    CompletableFuture<ListStackGroupOperationsResponse> listStackGroupOperations(ListStackGroupOperationsRequest request);

    CompletableFuture<ListStackGroupsResponse> listStackGroups(ListStackGroupsRequest request);

    CompletableFuture<ListStackInstancesResponse> listStackInstances(ListStackInstancesRequest request);

    CompletableFuture<ListStackOperationRisksResponse> listStackOperationRisks(ListStackOperationRisksRequest request);

    CompletableFuture<ListStackResourceDriftsResponse> listStackResourceDrifts(ListStackResourceDriftsRequest request);

    CompletableFuture<ListStackResourcesResponse> listStackResources(ListStackResourcesRequest request);

    CompletableFuture<ListStacksResponse> listStacks(ListStacksRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<ListTemplateScratchesResponse> listTemplateScratches(ListTemplateScratchesRequest request);

    CompletableFuture<ListTemplateVersionsResponse> listTemplateVersions(ListTemplateVersionsRequest request);

    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<PreviewStackResponse> previewStack(PreviewStackRequest request);

    CompletableFuture<SetDeletionProtectionResponse> setDeletionProtection(SetDeletionProtectionRequest request);

    CompletableFuture<SetStackPolicyResponse> setStackPolicy(SetStackPolicyRequest request);

    CompletableFuture<SetTemplatePermissionResponse> setTemplatePermission(SetTemplatePermissionRequest request);

    CompletableFuture<SignalResourceResponse> signalResource(SignalResourceRequest request);

    CompletableFuture<StopStackGroupOperationResponse> stopStackGroupOperation(StopStackGroupOperationRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateStackResponse> updateStack(UpdateStackRequest request);

    CompletableFuture<UpdateStackGroupResponse> updateStackGroup(UpdateStackGroupRequest request);

    CompletableFuture<UpdateStackInstancesResponse> updateStackInstances(UpdateStackInstancesRequest request);

    CompletableFuture<UpdateStackTemplateByResourcesResponse> updateStackTemplateByResources(UpdateStackTemplateByResourcesRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<UpdateTemplateScratchResponse> updateTemplateScratch(UpdateTemplateScratchRequest request);

    CompletableFuture<ValidateTemplateResponse> validateTemplate(ValidateTemplateRequest request);

}
