// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cs20151215.models.*;
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

    CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request);

    CompletableFuture<CancelClusterUpgradeResponse> cancelClusterUpgrade(CancelClusterUpgradeRequest request);

    CompletableFuture<CancelComponentUpgradeResponse> cancelComponentUpgrade(CancelComponentUpgradeRequest request);

    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    CompletableFuture<CancelWorkflowResponse> cancelWorkflow(CancelWorkflowRequest request);

    CompletableFuture<CreateAutoscalingConfigResponse> createAutoscalingConfig(CreateAutoscalingConfigRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateClusterNodePoolResponse> createClusterNodePool(CreateClusterNodePoolRequest request);

    CompletableFuture<CreateEdgeMachineResponse> createEdgeMachine(CreateEdgeMachineRequest request);

    CompletableFuture<CreateKubernetesTriggerResponse> createKubernetesTrigger(CreateKubernetesTriggerRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request);

    CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteClusterNodepoolResponse> deleteClusterNodepool(DeleteClusterNodepoolRequest request);

    CompletableFuture<DeleteClusterNodesResponse> deleteClusterNodes(DeleteClusterNodesRequest request);

    CompletableFuture<DeleteEdgeMachineResponse> deleteEdgeMachine(DeleteEdgeMachineRequest request);

    CompletableFuture<DeleteKubernetesTriggerResponse> deleteKubernetesTrigger(DeleteKubernetesTriggerRequest request);

    CompletableFuture<DeletePolicyInstanceResponse> deletePolicyInstance(DeletePolicyInstanceRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    CompletableFuture<DeployPolicyInstanceResponse> deployPolicyInstance(DeployPolicyInstanceRequest request);

    CompletableFuture<DescirbeWorkflowResponse> descirbeWorkflow(DescirbeWorkflowRequest request);

    CompletableFuture<DescribeAddonsResponse> describeAddons(DescribeAddonsRequest request);

    CompletableFuture<DescribeClusterAddonMetadataResponse> describeClusterAddonMetadata(DescribeClusterAddonMetadataRequest request);

    CompletableFuture<DescribeClusterAddonUpgradeStatusResponse> describeClusterAddonUpgradeStatus(DescribeClusterAddonUpgradeStatusRequest request);

    CompletableFuture<DescribeClusterAddonsUpgradeStatusResponse> describeClusterAddonsUpgradeStatus(DescribeClusterAddonsUpgradeStatusRequest request);

    CompletableFuture<DescribeClusterAddonsVersionResponse> describeClusterAddonsVersion(DescribeClusterAddonsVersionRequest request);

    CompletableFuture<DescribeClusterAttachScriptsResponse> describeClusterAttachScripts(DescribeClusterAttachScriptsRequest request);

    CompletableFuture<DescribeClusterDetailResponse> describeClusterDetail(DescribeClusterDetailRequest request);

    CompletableFuture<DescribeClusterEventsResponse> describeClusterEvents(DescribeClusterEventsRequest request);

    CompletableFuture<DescribeClusterLogsResponse> describeClusterLogs(DescribeClusterLogsRequest request);

    CompletableFuture<DescribeClusterNodePoolDetailResponse> describeClusterNodePoolDetail(DescribeClusterNodePoolDetailRequest request);

    CompletableFuture<DescribeClusterNodePoolsResponse> describeClusterNodePools(DescribeClusterNodePoolsRequest request);

    CompletableFuture<DescribeClusterNodesResponse> describeClusterNodes(DescribeClusterNodesRequest request);

    CompletableFuture<DescribeClusterResourcesResponse> describeClusterResources(DescribeClusterResourcesRequest request);

    CompletableFuture<DescribeClusterTasksResponse> describeClusterTasks(DescribeClusterTasksRequest request);

    CompletableFuture<DescribeClusterUserKubeconfigResponse> describeClusterUserKubeconfig(DescribeClusterUserKubeconfigRequest request);

    CompletableFuture<DescribeClusterV2UserKubeconfigResponse> describeClusterV2UserKubeconfig(DescribeClusterV2UserKubeconfigRequest request);

    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    CompletableFuture<DescribeClustersV1Response> describeClustersV1(DescribeClustersV1Request request);

    CompletableFuture<DescribeEdgeMachineActiveProcessResponse> describeEdgeMachineActiveProcess(DescribeEdgeMachineActiveProcessRequest request);

    CompletableFuture<DescribeEdgeMachineModelsResponse> describeEdgeMachineModels(DescribeEdgeMachineModelsRequest request);

    CompletableFuture<DescribeEdgeMachineTunnelConfigDetailResponse> describeEdgeMachineTunnelConfigDetail(DescribeEdgeMachineTunnelConfigDetailRequest request);

    CompletableFuture<DescribeEdgeMachinesResponse> describeEdgeMachines(DescribeEdgeMachinesRequest request);

    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    CompletableFuture<DescribeExternalAgentResponse> describeExternalAgent(DescribeExternalAgentRequest request);

    CompletableFuture<DescribeKubernetesVersionMetadataResponse> describeKubernetesVersionMetadata(DescribeKubernetesVersionMetadataRequest request);

    CompletableFuture<DescribeNodePoolVulsResponse> describeNodePoolVuls(DescribeNodePoolVulsRequest request);

    CompletableFuture<DescribePoliciesResponse> describePolicies(DescribePoliciesRequest request);

    CompletableFuture<DescribePolicyDetailsResponse> describePolicyDetails(DescribePolicyDetailsRequest request);

    CompletableFuture<DescribePolicyGovernanceInClusterResponse> describePolicyGovernanceInCluster(DescribePolicyGovernanceInClusterRequest request);

    CompletableFuture<DescribePolicyInstancesResponse> describePolicyInstances(DescribePolicyInstancesRequest request);

    CompletableFuture<DescribePolicyInstancesStatusResponse> describePolicyInstancesStatus(DescribePolicyInstancesStatusRequest request);

    CompletableFuture<DescribeTaskInfoResponse> describeTaskInfo(DescribeTaskInfoRequest request);

    CompletableFuture<DescribeTemplateAttributeResponse> describeTemplateAttribute(DescribeTemplateAttributeRequest request);

    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    CompletableFuture<DescribeTriggerResponse> describeTrigger(DescribeTriggerRequest request);

    CompletableFuture<DescribeUserPermissionResponse> describeUserPermission(DescribeUserPermissionRequest request);

    CompletableFuture<DescribeUserQuotaResponse> describeUserQuota(DescribeUserQuotaRequest request);

    CompletableFuture<DescribeWorkflowsResponse> describeWorkflows(DescribeWorkflowsRequest request);

    CompletableFuture<EdgeClusterAddEdgeMachineResponse> edgeClusterAddEdgeMachine(EdgeClusterAddEdgeMachineRequest request);

    CompletableFuture<FixNodePoolVulsResponse> fixNodePoolVuls(FixNodePoolVulsRequest request);

    CompletableFuture<GetKubernetesTriggerResponse> getKubernetesTrigger(GetKubernetesTriggerRequest request);

    CompletableFuture<GetUpgradeStatusResponse> getUpgradeStatus(GetUpgradeStatusRequest request);

    CompletableFuture<GrantPermissionsResponse> grantPermissions(GrantPermissionsRequest request);

    CompletableFuture<InstallClusterAddonsResponse> installClusterAddons(InstallClusterAddonsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<MigrateClusterResponse> migrateCluster(MigrateClusterRequest request);

    CompletableFuture<ModifyClusterResponse> modifyCluster(ModifyClusterRequest request);

    CompletableFuture<ModifyClusterAddonResponse> modifyClusterAddon(ModifyClusterAddonRequest request);

    CompletableFuture<ModifyClusterConfigurationResponse> modifyClusterConfiguration(ModifyClusterConfigurationRequest request);

    CompletableFuture<ModifyClusterNodePoolResponse> modifyClusterNodePool(ModifyClusterNodePoolRequest request);

    CompletableFuture<ModifyClusterTagsResponse> modifyClusterTags(ModifyClusterTagsRequest request);

    CompletableFuture<ModifyNodePoolNodeConfigResponse> modifyNodePoolNodeConfig(ModifyNodePoolNodeConfigRequest request);

    CompletableFuture<ModifyPolicyInstanceResponse> modifyPolicyInstance(ModifyPolicyInstanceRequest request);

    CompletableFuture<OpenAckServiceResponse> openAckService(OpenAckServiceRequest request);

    CompletableFuture<PauseClusterUpgradeResponse> pauseClusterUpgrade(PauseClusterUpgradeRequest request);

    CompletableFuture<PauseComponentUpgradeResponse> pauseComponentUpgrade(PauseComponentUpgradeRequest request);

    CompletableFuture<PauseTaskResponse> pauseTask(PauseTaskRequest request);

    CompletableFuture<RemoveClusterNodesResponse> removeClusterNodes(RemoveClusterNodesRequest request);

    CompletableFuture<RemoveNodePoolNodesResponse> removeNodePoolNodes(RemoveNodePoolNodesRequest request);

    CompletableFuture<RemoveWorkflowResponse> removeWorkflow(RemoveWorkflowRequest request);

    CompletableFuture<RepairClusterNodePoolResponse> repairClusterNodePool(RepairClusterNodePoolRequest request);

    CompletableFuture<ResumeComponentUpgradeResponse> resumeComponentUpgrade(ResumeComponentUpgradeRequest request);

    CompletableFuture<ResumeTaskResponse> resumeTask(ResumeTaskRequest request);

    CompletableFuture<ResumeUpgradeClusterResponse> resumeUpgradeCluster(ResumeUpgradeClusterRequest request);

    CompletableFuture<ScaleClusterResponse> scaleCluster(ScaleClusterRequest request);

    CompletableFuture<ScaleClusterNodePoolResponse> scaleClusterNodePool(ScaleClusterNodePoolRequest request);

    CompletableFuture<ScaleOutClusterResponse> scaleOutCluster(ScaleOutClusterRequest request);

    CompletableFuture<StartWorkflowResponse> startWorkflow(StartWorkflowRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnInstallClusterAddonsResponse> unInstallClusterAddons(UnInstallClusterAddonsRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateContactGroupForAlertResponse> updateContactGroupForAlert(UpdateContactGroupForAlertRequest request);

    CompletableFuture<UpdateK8sClusterUserConfigExpireResponse> updateK8sClusterUserConfigExpire(UpdateK8sClusterUserConfigExpireRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<UpgradeClusterResponse> upgradeCluster(UpgradeClusterRequest request);

    CompletableFuture<UpgradeClusterAddonsResponse> upgradeClusterAddons(UpgradeClusterAddonsRequest request);

    CompletableFuture<UpgradeClusterNodepoolResponse> upgradeClusterNodepool(UpgradeClusterNodepoolRequest request);

}
