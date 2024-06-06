// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cs20151215.models.*;
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

    CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request);

    CompletableFuture<AttachInstancesToNodePoolResponse> attachInstancesToNodePool(AttachInstancesToNodePoolRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CancelClusterUpgradeResponse> cancelClusterUpgrade(CancelClusterUpgradeRequest request);

    CompletableFuture<CancelComponentUpgradeResponse> cancelComponentUpgrade(CancelComponentUpgradeRequest request);

    CompletableFuture<CancelOperationPlanResponse> cancelOperationPlan(CancelOperationPlanRequest request);

    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    CompletableFuture<CancelWorkflowResponse> cancelWorkflow(CancelWorkflowRequest request);

    CompletableFuture<CheckControlPlaneLogEnableResponse> checkControlPlaneLogEnable(CheckControlPlaneLogEnableRequest request);

    CompletableFuture<CheckServiceRoleResponse> checkServiceRole(CheckServiceRoleRequest request);

    CompletableFuture<CreateAutoscalingConfigResponse> createAutoscalingConfig(CreateAutoscalingConfigRequest request);

    /**
      * This topic describes all parameters for creating an ACK cluster. You can create the following types of ACK clusters.
      * *   [Create an ACK managed cluster](~~90776~~)
      * *   [Create an ACK dedicated cluster](~~197620~~)
      * *   [Create an ACK Serverless cluster](~~144246~~)
      * *   [Create an ACK Edge cluster](~~128204~~)
      * *   [Create an ACK Basic cluster that supports sandboxed containers](~~196321~~)
      * *   [Create an ACK Pro cluster that supports sandboxed containers](~~140623~~)
      *
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateClusterDiagnosisResponse> createClusterDiagnosis(CreateClusterDiagnosisRequest request);

    CompletableFuture<CreateClusterNodePoolResponse> createClusterNodePool(CreateClusterNodePoolRequest request);

    CompletableFuture<CreateEdgeMachineResponse> createEdgeMachine(CreateEdgeMachineRequest request);

    CompletableFuture<CreateKubernetesTriggerResponse> createKubernetesTrigger(CreateKubernetesTriggerRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request);

    CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteClusterNodepoolResponse> deleteClusterNodepool(DeleteClusterNodepoolRequest request);

    /**
      * > 
      * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours. - The operation may have unexpected risks. Back up the data before you perform this operation. - When the system removes a node, it sets the status of the node to Unschedulable. - The system removes only worker nodes. It does not remove master nodes.
      *
     */
    CompletableFuture<DeleteClusterNodesResponse> deleteClusterNodes(DeleteClusterNodesRequest request);

    CompletableFuture<DeleteEdgeMachineResponse> deleteEdgeMachine(DeleteEdgeMachineRequest request);

    CompletableFuture<DeleteKubernetesTriggerResponse> deleteKubernetesTrigger(DeleteKubernetesTriggerRequest request);

    CompletableFuture<DeletePolicyInstanceResponse> deletePolicyInstance(DeletePolicyInstanceRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    CompletableFuture<DeployPolicyInstanceResponse> deployPolicyInstance(DeployPolicyInstanceRequest request);

    CompletableFuture<DescirbeWorkflowResponse> descirbeWorkflow(DescirbeWorkflowRequest request);

    CompletableFuture<DescribeAddonResponse> describeAddon(DescribeAddonRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeAddonsResponse> describeAddons(DescribeAddonsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeClusterAddonInstanceResponse> describeClusterAddonInstance(DescribeClusterAddonInstanceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeClusterAddonMetadataResponse> describeClusterAddonMetadata(DescribeClusterAddonMetadataRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeClusterAddonUpgradeStatusResponse> describeClusterAddonUpgradeStatus(DescribeClusterAddonUpgradeStatusRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeClusterAddonsUpgradeStatusResponse> describeClusterAddonsUpgradeStatus(DescribeClusterAddonsUpgradeStatusRequest request);

    /**
      * @deprecated
      *
     */
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

    /**
      * **
      * ****The default validity period of a kubeconfig file is 3 years. Two months before a kubeconfig file expires, you can renew it in the Container Service for Kubernetes (ACK) console or by calling API operations. After a kubeconfig file is renewed, the secret is valid for 3 years. The previous kubeconfig secret remains valid until expiration. We recommend that you renew your kubeconfig file at the earliest opportunity.
      *
     */
    CompletableFuture<DescribeClusterUserKubeconfigResponse> describeClusterUserKubeconfig(DescribeClusterUserKubeconfigRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeClusterV2UserKubeconfigResponse> describeClusterV2UserKubeconfig(DescribeClusterV2UserKubeconfigRequest request);

    CompletableFuture<DescribeClusterVulsResponse> describeClusterVuls(DescribeClusterVulsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    CompletableFuture<DescribeClustersV1Response> describeClustersV1(DescribeClustersV1Request request);

    CompletableFuture<DescribeEdgeMachineActiveProcessResponse> describeEdgeMachineActiveProcess(DescribeEdgeMachineActiveProcessRequest request);

    CompletableFuture<DescribeEdgeMachineModelsResponse> describeEdgeMachineModels(DescribeEdgeMachineModelsRequest request);

    CompletableFuture<DescribeEdgeMachineTunnelConfigDetailResponse> describeEdgeMachineTunnelConfigDetail(DescribeEdgeMachineTunnelConfigDetailRequest request);

    CompletableFuture<DescribeEdgeMachinesResponse> describeEdgeMachines(DescribeEdgeMachinesRequest request);

    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
      * For more information, see [Register an external Kubernetes cluster](~~121053~~).
      *
     */
    CompletableFuture<DescribeExternalAgentResponse> describeExternalAgent(DescribeExternalAgentRequest request);

    CompletableFuture<DescribeKubernetesVersionMetadataResponse> describeKubernetesVersionMetadata(DescribeKubernetesVersionMetadataRequest request);

    CompletableFuture<DescribeNodePoolVulsResponse> describeNodePoolVuls(DescribeNodePoolVulsRequest request);

    CompletableFuture<DescribePoliciesResponse> describePolicies(DescribePoliciesRequest request);

    CompletableFuture<DescribePolicyDetailsResponse> describePolicyDetails(DescribePolicyDetailsRequest request);

    CompletableFuture<DescribePolicyGovernanceInClusterResponse> describePolicyGovernanceInCluster(DescribePolicyGovernanceInClusterRequest request);

    CompletableFuture<DescribePolicyInstancesResponse> describePolicyInstances(DescribePolicyInstancesRequest request);

    CompletableFuture<DescribePolicyInstancesStatusResponse> describePolicyInstancesStatus(DescribePolicyInstancesStatusRequest request);

    /**
      * **
      * ****Only Alibaba Cloud accounts can call this API operation.
      *
     */
    CompletableFuture<DescribeSubaccountK8sClusterUserConfigResponse> describeSubaccountK8sClusterUserConfig(DescribeSubaccountK8sClusterUserConfigRequest request);

    CompletableFuture<DescribeTaskInfoResponse> describeTaskInfo(DescribeTaskInfoRequest request);

    CompletableFuture<DescribeTemplateAttributeResponse> describeTemplateAttribute(DescribeTemplateAttributeRequest request);

    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    CompletableFuture<DescribeTriggerResponse> describeTrigger(DescribeTriggerRequest request);

    CompletableFuture<DescribeUserClusterNamespacesResponse> describeUserClusterNamespaces(DescribeUserClusterNamespacesRequest request);

    CompletableFuture<DescribeUserPermissionResponse> describeUserPermission(DescribeUserPermissionRequest request);

    CompletableFuture<DescribeUserQuotaResponse> describeUserQuota(DescribeUserQuotaRequest request);

    CompletableFuture<DescribeWorkflowsResponse> describeWorkflows(DescribeWorkflowsRequest request);

    CompletableFuture<EdgeClusterAddEdgeMachineResponse> edgeClusterAddEdgeMachine(EdgeClusterAddEdgeMachineRequest request);

    /**
      * 1.  The Common Vulnerabilities and Exposures (CVE) patching feature is developed based on Security Center. To use this feature, you must purchase the Security Center Ultimate Edition that supports Container Service for Kubernetes (ACK).
      * 2.  ACK may need to restart nodes to patch certain vulnerabilities. ACK drains a node before the node restarts. Make sure that the ACK cluster has sufficient idle nodes to host the pods evicted from the trained nodes. For example, you can scale out a node pool before you patch vulnerabilities for the nodes in the node pool.
      * 3.  Security Center ensures the compatibility of CVE patches. We recommend that you check the compatibility of a CVE patch with your application before you install the patch. You can pause or cancel a CVE patching task anytime.
      * 4.  CVE patching is a progressive task that consists of multiple batches. After you pause or cancel a CVE patching task, ACK continues to process the dispatched batches. Only the batches that have not been dispatched are paused or canceled.
      *
     */
    CompletableFuture<FixNodePoolVulsResponse> fixNodePoolVuls(FixNodePoolVulsRequest request);

    CompletableFuture<GetClusterAddonInstanceResponse> getClusterAddonInstance(GetClusterAddonInstanceRequest request);

    CompletableFuture<GetClusterCheckResponse> getClusterCheck(GetClusterCheckRequest request);

    CompletableFuture<GetClusterDiagnosisCheckItemsResponse> getClusterDiagnosisCheckItems(GetClusterDiagnosisCheckItemsRequest request);

    CompletableFuture<GetClusterDiagnosisResultResponse> getClusterDiagnosisResult(GetClusterDiagnosisResultRequest request);

    CompletableFuture<GetKubernetesTriggerResponse> getKubernetesTrigger(GetKubernetesTriggerRequest request);

    CompletableFuture<GetUpgradeStatusResponse> getUpgradeStatus(GetUpgradeStatusRequest request);

    /**
      * ****
      * *   Make sure that you have granted the RAM user at least read-only permissions on the desired ACK clusters in the RAM console. Otherwise, the `ErrorRamPolicyConfig` error code is returned. For more information about how to authorize a RAM user by attaching RAM policies, see [Create a custom RAM policy](~~86485~~).
      * *   If you use a RAM user to call this API operation, make sure that the RAM user is authorized to modify the permissions of other RAM users on the desired ACK clusters. Otherwise, the `StatusForbidden` or `ForbiddenGrantPermissions` error code is returned. For more information, see [Use a RAM user to grant RBAC permissions to other RAM users](~~119035~~).
      * *   This operation overwrites the permissions that have been granted to the specified RAM user. When you call this operation, make sure that the required permissions are included.
      *
     */
    CompletableFuture<GrantPermissionsResponse> grantPermissions(GrantPermissionsRequest request);

    CompletableFuture<InstallClusterAddonsResponse> installClusterAddons(InstallClusterAddonsRequest request);

    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

    CompletableFuture<ListClusterAddonInstancesResponse> listClusterAddonInstances(ListClusterAddonInstancesRequest request);

    CompletableFuture<ListClusterChecksResponse> listClusterChecks(ListClusterChecksRequest request);

    CompletableFuture<ListOperationPlansResponse> listOperationPlans(ListOperationPlansRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<MigrateClusterResponse> migrateCluster(MigrateClusterRequest request);

    CompletableFuture<ModifyClusterResponse> modifyCluster(ModifyClusterRequest request);

    /**
      * You can use this API operation to modify the components in a Container Service for Kubernetes (ACK) cluster or the control plane components in an ACK Pro cluster.
      * *   To query the customizable parameters of a component, call the `DescribeClusterAddonMetadata` API operation. For more information, see [Query the metadata of a specified component version](https://www.alibabacloud.com/help/zh/container-service-for-kubernetes/latest/query).
      * *   For more information about the customizable parameters of control plane components in ACK Pro clusters, see [Customize the parameters of control plane components in ACK Pro clusters](https://www.alibabacloud.com/help/zh/container-service-for-kubernetes/latest/customize-control-plane-parameters-for-a-professional-kubernetes-cluster).
      * After you call this operation, the component may be redeployed and restarted. We recommend that you assess the impact before you call this operation.
      *
     */
    CompletableFuture<ModifyClusterAddonResponse> modifyClusterAddon(ModifyClusterAddonRequest request);

    CompletableFuture<ModifyClusterConfigurationResponse> modifyClusterConfiguration(ModifyClusterConfigurationRequest request);

    CompletableFuture<ModifyClusterNodePoolResponse> modifyClusterNodePool(ModifyClusterNodePoolRequest request);

    CompletableFuture<ModifyClusterTagsResponse> modifyClusterTags(ModifyClusterTagsRequest request);

    /**
      * >  Container Service for Kubernetes (ACK) allows you to modify the kubelet configuration of nodes in a node pool. After you modify the kubelet configuration, the new configuration immediately takes effect on existing nodes in the node pool and is automatically applied to newly added nodes.
      *
     */
    CompletableFuture<ModifyNodePoolNodeConfigResponse> modifyNodePoolNodeConfig(ModifyNodePoolNodeConfigRequest request);

    CompletableFuture<ModifyPolicyInstanceResponse> modifyPolicyInstance(ModifyPolicyInstanceRequest request);

    /**
      * *   You can activate ACK by using Alibaba Cloud accounts.
      * *   To activate ACK by using RAM users, you need to grant the AdministratorAccess permission to the RAM users.
      *
     */
    CompletableFuture<OpenAckServiceResponse> openAckService(OpenAckServiceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<PauseClusterUpgradeResponse> pauseClusterUpgrade(PauseClusterUpgradeRequest request);

    CompletableFuture<PauseComponentUpgradeResponse> pauseComponentUpgrade(PauseComponentUpgradeRequest request);

    CompletableFuture<PauseTaskResponse> pauseTask(PauseTaskRequest request);

    /**
      * @deprecated
      * ****
      * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.
      * *   Unknown errors may occur when you remove nodes. Before you remove nodes, back up the data on the nodes.
      * *   Nodes remain in the Unschedulable state when they are being removed.
      * *   You can remove only worker nodes. You cannot remove master nodes.
      *
     */
    CompletableFuture<RemoveClusterNodesResponse> removeClusterNodes(RemoveClusterNodesRequest request);

    /**
      * **
      * ****
      * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours. - The operation may have unexpected risks. Back up the data before you perform this operation. - When the system removes a node, it sets the status of the node to Unschedulable. - The system removes only worker nodes. It does not remove master nodes.
      *
     */
    CompletableFuture<RemoveNodePoolNodesResponse> removeNodePoolNodes(RemoveNodePoolNodesRequest request);

    CompletableFuture<RemoveWorkflowResponse> removeWorkflow(RemoveWorkflowRequest request);

    CompletableFuture<RepairClusterNodePoolResponse> repairClusterNodePool(RepairClusterNodePoolRequest request);

    CompletableFuture<ResumeComponentUpgradeResponse> resumeComponentUpgrade(ResumeComponentUpgradeRequest request);

    CompletableFuture<ResumeTaskResponse> resumeTask(ResumeTaskRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ResumeUpgradeClusterResponse> resumeUpgradeCluster(ResumeUpgradeClusterRequest request);

    CompletableFuture<RunClusterCheckResponse> runClusterCheck(RunClusterCheckRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ScaleClusterResponse> scaleCluster(ScaleClusterRequest request);

    CompletableFuture<ScaleClusterNodePoolResponse> scaleClusterNodePool(ScaleClusterNodePoolRequest request);

    /**
      * **
      * ****The ScaleOutCluster API operation is phased out. You must call the node pool-related API operations to manage nodes. If you want to add worker nodes to a Container Service for Kubernetes (ACK) cluster, call the ScaleClusterNodePool API operation. For more information, see [ScaleClusterNodePool](~~184928~~).
      *
     */
    CompletableFuture<ScaleOutClusterResponse> scaleOutCluster(ScaleOutClusterRequest request);

    CompletableFuture<ScanClusterVulsResponse> scanClusterVuls(ScanClusterVulsRequest request);

    CompletableFuture<StartAlertResponse> startAlert(StartAlertRequest request);

    CompletableFuture<StartWorkflowResponse> startWorkflow(StartWorkflowRequest request);

    CompletableFuture<StopAlertResponse> stopAlert(StopAlertRequest request);

    CompletableFuture<SyncClusterNodePoolResponse> syncClusterNodePool(SyncClusterNodePoolRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnInstallClusterAddonsResponse> unInstallClusterAddons(UnInstallClusterAddonsRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateContactGroupForAlertResponse> updateContactGroupForAlert(UpdateContactGroupForAlertRequest request);

    CompletableFuture<UpdateControlPlaneLogResponse> updateControlPlaneLog(UpdateControlPlaneLogRequest request);

    /**
      * - You can call this operation only with an Alibaba Cloud account. 
      * - If the kubeconfig file used by your cluster is revoked, the custom validity period of the kubeconfig file is reset. In this case, you need to call this API operation to reconfigure the validity period of the kubeconfig file.
      *
     */
    CompletableFuture<UpdateK8sClusterUserConfigExpireResponse> updateK8sClusterUserConfigExpire(UpdateK8sClusterUserConfigExpireRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<UpdateUserPermissionsResponse> updateUserPermissions(UpdateUserPermissionsRequest request);

    CompletableFuture<UpgradeClusterResponse> upgradeCluster(UpgradeClusterRequest request);

    CompletableFuture<UpgradeClusterAddonsResponse> upgradeClusterAddons(UpgradeClusterAddonsRequest request);

    /**
      * This operation allows you to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.
      *
     */
    CompletableFuture<UpgradeClusterNodepoolResponse> upgradeClusterNodepool(UpgradeClusterNodepoolRequest request);

}
