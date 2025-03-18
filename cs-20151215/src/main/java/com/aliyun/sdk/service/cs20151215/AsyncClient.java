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

    /**
     * @param request the request parameters of AttachInstances  AttachInstancesRequest
     * @return AttachInstancesResponse
     */
    CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request);

    /**
     * @param request the request parameters of AttachInstancesToNodePool  AttachInstancesToNodePoolRequest
     * @return AttachInstancesToNodePoolResponse
     */
    CompletableFuture<AttachInstancesToNodePoolResponse> attachInstancesToNodePool(AttachInstancesToNodePoolRequest request);

    /**
     * @deprecated OpenAPI CancelClusterUpgrade is deprecated, please use CS::2015-12-15::CancelTask instead.  * @param request  the request parameters of CancelClusterUpgrade  CancelClusterUpgradeRequest
     * @return CancelClusterUpgradeResponse
     */
    @Deprecated
    CompletableFuture<CancelClusterUpgradeResponse> cancelClusterUpgrade(CancelClusterUpgradeRequest request);

    /**
     * @deprecated OpenAPI CancelComponentUpgrade is deprecated, please use CS::2015-12-15::CancelTask instead.  * @param request  the request parameters of CancelComponentUpgrade  CancelComponentUpgradeRequest
     * @return CancelComponentUpgradeResponse
     */
    @Deprecated
    CompletableFuture<CancelComponentUpgradeResponse> cancelComponentUpgrade(CancelComponentUpgradeRequest request);

    /**
     * @param request the request parameters of CancelOperationPlan  CancelOperationPlanRequest
     * @return CancelOperationPlanResponse
     */
    CompletableFuture<CancelOperationPlanResponse> cancelOperationPlan(CancelOperationPlanRequest request);

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
     * @param request the request parameters of CheckControlPlaneLogEnable  CheckControlPlaneLogEnableRequest
     * @return CheckControlPlaneLogEnableResponse
     */
    CompletableFuture<CheckControlPlaneLogEnableResponse> checkControlPlaneLogEnable(CheckControlPlaneLogEnableRequest request);

    /**
     * @param request the request parameters of CheckServiceRole  CheckServiceRoleRequest
     * @return CheckServiceRoleResponse
     */
    CompletableFuture<CheckServiceRoleResponse> checkServiceRole(CheckServiceRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permission.</li>
     * <li>You cannot revoke the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot revoke the permissions of the account that you use to call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CleanClusterUserPermissions  CleanClusterUserPermissionsRequest
     * @return CleanClusterUserPermissionsResponse
     */
    CompletableFuture<CleanClusterUserPermissionsResponse> cleanClusterUserPermissions(CleanClusterUserPermissionsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permission.</li>
     * <li>You cannot revoke the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot revoke the permissions of the account that you use to call this operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CleanUserPermissions  CleanUserPermissionsRequest
     * @return CleanUserPermissionsResponse
     */
    CompletableFuture<CleanUserPermissionsResponse> cleanUserPermissions(CleanUserPermissionsRequest request);

    /**
     * @param request the request parameters of CreateAutoscalingConfig  CreateAutoscalingConfigRequest
     * @return CreateAutoscalingConfigResponse
     */
    CompletableFuture<CreateAutoscalingConfigResponse> createAutoscalingConfig(CreateAutoscalingConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#-openapi-"></a>Generate API request parameters in the ACK console</h3>
     * <p>When you fail to create an ACK cluster by calling the CreateCluster operation due to invalid parameter settings, you can generate valid API request parameters in the ACK console. Procedure:</p>
     * <ol>
     * <li>Log on to the <a href="https://cs.console.aliyun.com">ACK console</a>. In the left-side navigation pane, click <strong>Clusters</strong>.</li>
     * <li>On the <strong>Cluster</strong> page, click <strong>Cluster Templates</strong>.</li>
     * <li>In the Select Cluster Template dialog box, select the type of cluster that you want to create and click Create. Then, configure the cluster setting parameters.</li>
     * <li>After you configure the cluster parameters, click <strong>Generate API Request Parameters</strong> in the <strong>Confirm Order</strong> step.
     * The API request parameters are displayed in the API Request Parameters dialog box.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateClusterDiagnosis  CreateClusterDiagnosisRequest
     * @return CreateClusterDiagnosisResponse
     */
    CompletableFuture<CreateClusterDiagnosisResponse> createClusterDiagnosis(CreateClusterDiagnosisRequest request);

    /**
     * @param request the request parameters of CreateClusterNodePool  CreateClusterNodePoolRequest
     * @return CreateClusterNodePoolResponse
     */
    CompletableFuture<CreateClusterNodePoolResponse> createClusterNodePool(CreateClusterNodePoolRequest request);

    /**
     * @param request the request parameters of CreateEdgeMachine  CreateEdgeMachineRequest
     * @return CreateEdgeMachineResponse
     */
    CompletableFuture<CreateEdgeMachineResponse> createEdgeMachine(CreateEdgeMachineRequest request);

    /**
     * @deprecated OpenAPI CreateKubernetesTrigger is deprecated, please use CS::2015-12-15::CreateTrigger instead.  * @param request  the request parameters of CreateKubernetesTrigger  CreateKubernetesTriggerRequest
     * @return CreateKubernetesTriggerResponse
     */
    @Deprecated
    CompletableFuture<CreateKubernetesTriggerResponse> createKubernetesTrigger(CreateKubernetesTriggerRequest request);

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * @param request the request parameters of CreateTrigger  CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    /**
     * @param request the request parameters of DeleteAlertContact  DeleteAlertContactRequest
     * @return DeleteAlertContactResponse
     */
    CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request);

    /**
     * @param request the request parameters of DeleteAlertContactGroup  DeleteAlertContactGroupRequest
     * @return DeleteAlertContactGroupResponse
     */
    CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Warning:</p>
     * <ul>
     * <li>Subscription ECS instances and Lingjun nodes in a cluster cannot be automatically released. To avoid unnecessary costs, we recommend that you manually release the resources. For more information, see \<a href="{0}" target="_blank">Rules for deleting clusters and releasing nodes\</a>.</li>
     * <li>If the SLB instance of the API server uses the subscription billing method, it cannot be automatically released. To avoid unnecessary costs, we recommend that you manually release it.</li>
     * <li>By default, virtual private clouds (VPCs), vSwitches, security groups, and RAM roles are retained if they are used by other resources. To avoid unnecessary costs, we recommend that you manually release the resources.</li>
     * <li>Elastic container instances created on virtual nodes are automatically released.</li>
     * <li>Some resources created together with a cluster are not automatically released when the cluster is deleted. After the cluster is deleted, you are still charged for the resources. Release or retain the resources based on your actual needs. The resources include Simple Log Service projects automatically created by the cluster and dynamically provisioned disks.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteClusterNodepool  DeleteClusterNodepoolRequest
     * @return DeleteClusterNodepoolResponse
     */
    CompletableFuture<DeleteClusterNodepoolResponse> deleteClusterNodepool(DeleteClusterNodepoolRequest request);

    /**
     * <b>description</b> :
     * <p>  When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.</p>
     * <ul>
     * <li>The operation may have unexpected risks. Back up the data before you perform this operation.</li>
     * <li>When you remove a node, the system sets the status of the node to Unschedulable.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteClusterNodes  DeleteClusterNodesRequest
     * @return DeleteClusterNodesResponse
     */
    CompletableFuture<DeleteClusterNodesResponse> deleteClusterNodes(DeleteClusterNodesRequest request);

    /**
     * @param request the request parameters of DeleteEdgeMachine  DeleteEdgeMachineRequest
     * @return DeleteEdgeMachineResponse
     */
    CompletableFuture<DeleteEdgeMachineResponse> deleteEdgeMachine(DeleteEdgeMachineRequest request);

    /**
     * @deprecated OpenAPI DeleteKubernetesTrigger is deprecated, please use CS::2015-12-15::DeleteTrigger instead.  * @param request  the request parameters of DeleteKubernetesTrigger  DeleteKubernetesTriggerRequest
     * @return DeleteKubernetesTriggerResponse
     */
    @Deprecated
    CompletableFuture<DeleteKubernetesTriggerResponse> deleteKubernetesTrigger(DeleteKubernetesTriggerRequest request);

    /**
     * @param request the request parameters of DeletePolicyInstance  DeletePolicyInstanceRequest
     * @return DeletePolicyInstanceResponse
     */
    CompletableFuture<DeletePolicyInstanceResponse> deletePolicyInstance(DeletePolicyInstanceRequest request);

    /**
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of DeleteTrigger  DeleteTriggerRequest
     * @return DeleteTriggerResponse
     */
    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    /**
     * @param request the request parameters of DeployPolicyInstance  DeployPolicyInstanceRequest
     * @return DeployPolicyInstanceResponse
     */
    CompletableFuture<DeployPolicyInstanceResponse> deployPolicyInstance(DeployPolicyInstanceRequest request);

    /**
     * @param request the request parameters of DescribeAddon  DescribeAddonRequest
     * @return DescribeAddonResponse
     */
    CompletableFuture<DescribeAddonResponse> describeAddon(DescribeAddonRequest request);

    /**
     * @deprecated OpenAPI DescribeAddons is deprecated, please use CS::2015-12-15::ListAddons instead.  * @param request  the request parameters of DescribeAddons  DescribeAddonsRequest
     * @return DescribeAddonsResponse
     */
    @Deprecated
    CompletableFuture<DescribeAddonsResponse> describeAddons(DescribeAddonsRequest request);

    /**
     * @deprecated OpenAPI DescribeClusterAddonInstance is deprecated, please use CS::2015-12-15::GetClusterAddonInstance instead.  * @param request  the request parameters of DescribeClusterAddonInstance  DescribeClusterAddonInstanceRequest
     * @return DescribeClusterAddonInstanceResponse
     */
    @Deprecated
    CompletableFuture<DescribeClusterAddonInstanceResponse> describeClusterAddonInstance(DescribeClusterAddonInstanceRequest request);

    /**
     * @deprecated OpenAPI DescribeClusterAddonMetadata is deprecated, please use CS::2015-12-15::DescribeAddon instead.  * @param request  the request parameters of DescribeClusterAddonMetadata  DescribeClusterAddonMetadataRequest
     * @return DescribeClusterAddonMetadataResponse
     */
    @Deprecated
    CompletableFuture<DescribeClusterAddonMetadataResponse> describeClusterAddonMetadata(DescribeClusterAddonMetadataRequest request);

    /**
     * @deprecated OpenAPI DescribeClusterAddonUpgradeStatus is deprecated, please use CS::2015-12-15::GetClusterAddonInstance instead.  * @param request  the request parameters of DescribeClusterAddonUpgradeStatus  DescribeClusterAddonUpgradeStatusRequest
     * @return DescribeClusterAddonUpgradeStatusResponse
     */
    @Deprecated
    CompletableFuture<DescribeClusterAddonUpgradeStatusResponse> describeClusterAddonUpgradeStatus(DescribeClusterAddonUpgradeStatusRequest request);

    /**
     * @deprecated OpenAPI DescribeClusterAddonsUpgradeStatus is deprecated, please use CS::2015-12-15::ListClusterAddonInstances,CS::2015-12-15::GetClusterAddonInstance instead.  * @param request  the request parameters of DescribeClusterAddonsUpgradeStatus  DescribeClusterAddonsUpgradeStatusRequest
     * @return DescribeClusterAddonsUpgradeStatusResponse
     */
    @Deprecated
    CompletableFuture<DescribeClusterAddonsUpgradeStatusResponse> describeClusterAddonsUpgradeStatus(DescribeClusterAddonsUpgradeStatusRequest request);

    /**
     * @deprecated OpenAPI DescribeClusterAddonsVersion is deprecated, please use CS::2015-12-15::ListClusterAddonInstances,CS::2015-12-15::GetClusterAddonInstance instead.  * @param request  the request parameters of DescribeClusterAddonsVersion  DescribeClusterAddonsVersionRequest
     * @return DescribeClusterAddonsVersionResponse
     */
    @Deprecated
    CompletableFuture<DescribeClusterAddonsVersionResponse> describeClusterAddonsVersion(DescribeClusterAddonsVersionRequest request);

    /**
     * @param request the request parameters of DescribeClusterAttachScripts  DescribeClusterAttachScriptsRequest
     * @return DescribeClusterAttachScriptsResponse
     */
    CompletableFuture<DescribeClusterAttachScriptsResponse> describeClusterAttachScripts(DescribeClusterAttachScriptsRequest request);

    /**
     * @param request the request parameters of DescribeClusterDetail  DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     */
    CompletableFuture<DescribeClusterDetailResponse> describeClusterDetail(DescribeClusterDetailRequest request);

    /**
     * @param request the request parameters of DescribeClusterEvents  DescribeClusterEventsRequest
     * @return DescribeClusterEventsResponse
     */
    CompletableFuture<DescribeClusterEventsResponse> describeClusterEvents(DescribeClusterEventsRequest request);

    /**
     * @param request the request parameters of DescribeClusterLogs  DescribeClusterLogsRequest
     * @return DescribeClusterLogsResponse
     */
    CompletableFuture<DescribeClusterLogsResponse> describeClusterLogs(DescribeClusterLogsRequest request);

    /**
     * @param request the request parameters of DescribeClusterNodePoolDetail  DescribeClusterNodePoolDetailRequest
     * @return DescribeClusterNodePoolDetailResponse
     */
    CompletableFuture<DescribeClusterNodePoolDetailResponse> describeClusterNodePoolDetail(DescribeClusterNodePoolDetailRequest request);

    /**
     * @param request the request parameters of DescribeClusterNodePools  DescribeClusterNodePoolsRequest
     * @return DescribeClusterNodePoolsResponse
     */
    CompletableFuture<DescribeClusterNodePoolsResponse> describeClusterNodePools(DescribeClusterNodePoolsRequest request);

    /**
     * @param request the request parameters of DescribeClusterNodes  DescribeClusterNodesRequest
     * @return DescribeClusterNodesResponse
     */
    CompletableFuture<DescribeClusterNodesResponse> describeClusterNodes(DescribeClusterNodesRequest request);

    /**
     * @param request the request parameters of DescribeClusterResources  DescribeClusterResourcesRequest
     * @return DescribeClusterResourcesResponse
     */
    CompletableFuture<DescribeClusterResourcesResponse> describeClusterResources(DescribeClusterResourcesRequest request);

    /**
     * @param request the request parameters of DescribeClusterTasks  DescribeClusterTasksRequest
     * @return DescribeClusterTasksResponse
     */
    CompletableFuture<DescribeClusterTasksResponse> describeClusterTasks(DescribeClusterTasksRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The default validity period of a kubeconfig file is 3 years. 180 days before a kubeconfig file expires, you can renew it in the Container Service for Kubernetes (ACK) console or by calling API operations. After a kubeconfig file is renewed, the kubeconfig file is valid for 3 years. The previous kubeconfig file still remains valid until expiration. We recommend that you renew your kubeconfig file at the earliest opportunity.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeClusterUserKubeconfig  DescribeClusterUserKubeconfigRequest
     * @return DescribeClusterUserKubeconfigResponse
     */
    CompletableFuture<DescribeClusterUserKubeconfigResponse> describeClusterUserKubeconfig(DescribeClusterUserKubeconfigRequest request);

    /**
     * @deprecated OpenAPI DescribeClusterV2UserKubeconfig is deprecated, please use CS::2015-12-15::DescribeClusterUserKubeconfig instead.  * @param request  the request parameters of DescribeClusterV2UserKubeconfig  DescribeClusterV2UserKubeconfigRequest
     * @return DescribeClusterV2UserKubeconfigResponse
     */
    @Deprecated
    CompletableFuture<DescribeClusterV2UserKubeconfigResponse> describeClusterV2UserKubeconfig(DescribeClusterV2UserKubeconfigRequest request);

    /**
     * @param request the request parameters of DescribeClusterVuls  DescribeClusterVulsRequest
     * @return DescribeClusterVulsResponse
     */
    CompletableFuture<DescribeClusterVulsResponse> describeClusterVuls(DescribeClusterVulsRequest request);

    /**
     * @deprecated OpenAPI DescribeClusters is deprecated, please use CS::2015-12-15::DescribeClustersV1 instead.  * @param request  the request parameters of DescribeClusters  DescribeClustersRequest
     * @return DescribeClustersResponse
     */
    @Deprecated
    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    /**
     * @param request the request parameters of DescribeClustersForRegion  DescribeClustersForRegionRequest
     * @return DescribeClustersForRegionResponse
     */
    CompletableFuture<DescribeClustersForRegionResponse> describeClustersForRegion(DescribeClustersForRegionRequest request);

    /**
     * @param request the request parameters of DescribeClustersV1  DescribeClustersV1Request
     * @return DescribeClustersV1Response
     */
    CompletableFuture<DescribeClustersV1Response> describeClustersV1(DescribeClustersV1Request request);

    /**
     * @deprecated OpenAPI DescribeEdgeMachineActiveProcess is deprecated  * @param request  the request parameters of DescribeEdgeMachineActiveProcess  DescribeEdgeMachineActiveProcessRequest
     * @return DescribeEdgeMachineActiveProcessResponse
     */
    @Deprecated
    CompletableFuture<DescribeEdgeMachineActiveProcessResponse> describeEdgeMachineActiveProcess(DescribeEdgeMachineActiveProcessRequest request);

    /**
     * @param request the request parameters of DescribeEdgeMachineModels  DescribeEdgeMachineModelsRequest
     * @return DescribeEdgeMachineModelsResponse
     */
    CompletableFuture<DescribeEdgeMachineModelsResponse> describeEdgeMachineModels(DescribeEdgeMachineModelsRequest request);

    /**
     * @param request the request parameters of DescribeEdgeMachineTunnelConfigDetail  DescribeEdgeMachineTunnelConfigDetailRequest
     * @return DescribeEdgeMachineTunnelConfigDetailResponse
     */
    CompletableFuture<DescribeEdgeMachineTunnelConfigDetailResponse> describeEdgeMachineTunnelConfigDetail(DescribeEdgeMachineTunnelConfigDetailRequest request);

    /**
     * @param request the request parameters of DescribeEdgeMachines  DescribeEdgeMachinesRequest
     * @return DescribeEdgeMachinesResponse
     */
    CompletableFuture<DescribeEdgeMachinesResponse> describeEdgeMachines(DescribeEdgeMachinesRequest request);

    /**
     * @param request the request parameters of DescribeEvents  DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
     * @param request the request parameters of DescribeEventsForRegion  DescribeEventsForRegionRequest
     * @return DescribeEventsForRegionResponse
     */
    CompletableFuture<DescribeEventsForRegionResponse> describeEventsForRegion(DescribeEventsForRegionRequest request);

    /**
     * @deprecated OpenAPI DescribeExternalAgent is deprecated  * @description For more information, see [Register an external Kubernetes cluster](https://help.aliyun.com/document_detail/121053.html).
     * 
     * @param request the request parameters of DescribeExternalAgent  DescribeExternalAgentRequest
     * @return DescribeExternalAgentResponse
     */
    @Deprecated
    CompletableFuture<DescribeExternalAgentResponse> describeExternalAgent(DescribeExternalAgentRequest request);

    /**
     * @param request the request parameters of DescribeKubernetesVersionMetadata  DescribeKubernetesVersionMetadataRequest
     * @return DescribeKubernetesVersionMetadataResponse
     */
    CompletableFuture<DescribeKubernetesVersionMetadataResponse> describeKubernetesVersionMetadata(DescribeKubernetesVersionMetadataRequest request);

    /**
     * @param request the request parameters of DescribeNodePoolVuls  DescribeNodePoolVulsRequest
     * @return DescribeNodePoolVulsResponse
     */
    CompletableFuture<DescribeNodePoolVulsResponse> describeNodePoolVuls(DescribeNodePoolVulsRequest request);

    /**
     * @param request the request parameters of DescribePolicies  DescribePoliciesRequest
     * @return DescribePoliciesResponse
     */
    CompletableFuture<DescribePoliciesResponse> describePolicies(DescribePoliciesRequest request);

    /**
     * @param request the request parameters of DescribePolicyDetails  DescribePolicyDetailsRequest
     * @return DescribePolicyDetailsResponse
     */
    CompletableFuture<DescribePolicyDetailsResponse> describePolicyDetails(DescribePolicyDetailsRequest request);

    /**
     * @param request the request parameters of DescribePolicyGovernanceInCluster  DescribePolicyGovernanceInClusterRequest
     * @return DescribePolicyGovernanceInClusterResponse
     */
    CompletableFuture<DescribePolicyGovernanceInClusterResponse> describePolicyGovernanceInCluster(DescribePolicyGovernanceInClusterRequest request);

    /**
     * @param request the request parameters of DescribePolicyInstances  DescribePolicyInstancesRequest
     * @return DescribePolicyInstancesResponse
     */
    CompletableFuture<DescribePolicyInstancesResponse> describePolicyInstances(DescribePolicyInstancesRequest request);

    /**
     * @param request the request parameters of DescribePolicyInstancesStatus  DescribePolicyInstancesStatusRequest
     * @return DescribePolicyInstancesStatusResponse
     */
    CompletableFuture<DescribePolicyInstancesStatusResponse> describePolicyInstancesStatus(DescribePolicyInstancesStatusRequest request);

    /**
     * @param request the request parameters of DescribeResourcesDeleteProtection  DescribeResourcesDeleteProtectionRequest
     * @return DescribeResourcesDeleteProtectionResponse
     */
    CompletableFuture<DescribeResourcesDeleteProtectionResponse> describeResourcesDeleteProtection(DescribeResourcesDeleteProtectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only by using an Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of DescribeSubaccountK8sClusterUserConfig  DescribeSubaccountK8sClusterUserConfigRequest
     * @return DescribeSubaccountK8sClusterUserConfigResponse
     */
    CompletableFuture<DescribeSubaccountK8sClusterUserConfigResponse> describeSubaccountK8sClusterUserConfig(DescribeSubaccountK8sClusterUserConfigRequest request);

    /**
     * @param request the request parameters of DescribeTaskInfo  DescribeTaskInfoRequest
     * @return DescribeTaskInfoResponse
     */
    CompletableFuture<DescribeTaskInfoResponse> describeTaskInfo(DescribeTaskInfoRequest request);

    /**
     * @param request the request parameters of DescribeTemplateAttribute  DescribeTemplateAttributeRequest
     * @return DescribeTemplateAttributeResponse
     */
    CompletableFuture<DescribeTemplateAttributeResponse> describeTemplateAttribute(DescribeTemplateAttributeRequest request);

    /**
     * @param request the request parameters of DescribeTemplates  DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     */
    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeTrigger  DescribeTriggerRequest
     * @return DescribeTriggerResponse
     */
    CompletableFuture<DescribeTriggerResponse> describeTrigger(DescribeTriggerRequest request);

    /**
     * @param request the request parameters of DescribeUserClusterNamespaces  DescribeUserClusterNamespacesRequest
     * @return DescribeUserClusterNamespacesResponse
     */
    CompletableFuture<DescribeUserClusterNamespacesResponse> describeUserClusterNamespaces(DescribeUserClusterNamespacesRequest request);

    /**
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>If you call this operation as a Resource Access Management (RAM) user or by assuming a RAM role, only the permissions granted on the clusters on which the current account has the role-based access control (RBAC) administrator permissions are returned. If you want to query the permissions on all clusters, you must use an account that has the RBAC administrator permissions on all clusters.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserPermission  DescribeUserPermissionRequest
     * @return DescribeUserPermissionResponse
     */
    CompletableFuture<DescribeUserPermissionResponse> describeUserPermission(DescribeUserPermissionRequest request);

    /**
     * @param request the request parameters of DescribeUserQuota  DescribeUserQuotaRequest
     * @return DescribeUserQuotaResponse
     */
    CompletableFuture<DescribeUserQuotaResponse> describeUserQuota(DescribeUserQuotaRequest request);

    /**
     * @deprecated OpenAPI EdgeClusterAddEdgeMachine is deprecated  * @param request  the request parameters of EdgeClusterAddEdgeMachine  EdgeClusterAddEdgeMachineRequest
     * @return EdgeClusterAddEdgeMachineResponse
     */
    @Deprecated
    CompletableFuture<EdgeClusterAddEdgeMachineResponse> edgeClusterAddEdgeMachine(EdgeClusterAddEdgeMachineRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>The Common Vulnerabilities and Exposures (CVE) patching feature is developed based on Security Center. To use this feature, you must purchase the Security Center Ultimate Edition that supports Container Service for Kubernetes (ACK).</li>
     * <li>ACK may need to restart nodes to patch certain vulnerabilities. ACK drains a node before the node restarts. Make sure that the ACK cluster has sufficient idle nodes to host the pods evicted from the trained nodes. For example, you can scale out a node pool before you patch vulnerabilities for the nodes in the node pool.</li>
     * <li>Security Center ensures the compatibility of CVE patches. We recommend that you check the compatibility of a CVE patch with your application before you install the patch. You can pause or cancel a CVE patching task anytime.</li>
     * <li>CVE patching is a progressive task that consists of multiple batches. After you pause or cancel a CVE patching task, ACK continues to process the dispatched batches. Only the batches that have not been dispatched are paused or canceled.</li>
     * </ol>
     * 
     * @param request the request parameters of FixNodePoolVuls  FixNodePoolVulsRequest
     * @return FixNodePoolVulsResponse
     */
    CompletableFuture<FixNodePoolVulsResponse> fixNodePoolVuls(FixNodePoolVulsRequest request);

    /**
     * @param request the request parameters of GetClusterAddonInstance  GetClusterAddonInstanceRequest
     * @return GetClusterAddonInstanceResponse
     */
    CompletableFuture<GetClusterAddonInstanceResponse> getClusterAddonInstance(GetClusterAddonInstanceRequest request);

    /**
     * @param request the request parameters of GetClusterAuditProject  GetClusterAuditProjectRequest
     * @return GetClusterAuditProjectResponse
     */
    CompletableFuture<GetClusterAuditProjectResponse> getClusterAuditProject(GetClusterAuditProjectRequest request);

    /**
     * @param request the request parameters of GetClusterCheck  GetClusterCheckRequest
     * @return GetClusterCheckResponse
     */
    CompletableFuture<GetClusterCheckResponse> getClusterCheck(GetClusterCheckRequest request);

    /**
     * @param request the request parameters of GetClusterDiagnosisCheckItems  GetClusterDiagnosisCheckItemsRequest
     * @return GetClusterDiagnosisCheckItemsResponse
     */
    CompletableFuture<GetClusterDiagnosisCheckItemsResponse> getClusterDiagnosisCheckItems(GetClusterDiagnosisCheckItemsRequest request);

    /**
     * @param request the request parameters of GetClusterDiagnosisResult  GetClusterDiagnosisResultRequest
     * @return GetClusterDiagnosisResultResponse
     */
    CompletableFuture<GetClusterDiagnosisResultResponse> getClusterDiagnosisResult(GetClusterDiagnosisResultRequest request);

    /**
     * @deprecated OpenAPI GetKubernetesTrigger is deprecated, please use CS::2015-12-15::DescribeTrigger instead.  * @param request  the request parameters of GetKubernetesTrigger  GetKubernetesTriggerRequest
     * @return GetKubernetesTriggerResponse
     */
    @Deprecated
    CompletableFuture<GetKubernetesTriggerResponse> getKubernetesTrigger(GetKubernetesTriggerRequest request);

    /**
     * @deprecated OpenAPI GetUpgradeStatus is deprecated, please use CS::2015-12-15::DescribeTaskInfo instead.  * @param request  the request parameters of GetUpgradeStatus  GetUpgradeStatusRequest
     * @return GetUpgradeStatusResponse
     */
    @Deprecated
    CompletableFuture<GetUpgradeStatusResponse> getUpgradeStatus(GetUpgradeStatusRequest request);

    /**
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>If you use a Resource Access Management (RAM) user to call the operation, make sure that the RAM user has the permissions to modify the permissions of other RAM users or RAM roles. Otherwise, the <code>StatusForbidden</code> or <code>ForbiddenGrantPermissions</code> error code is returned after you call the operation. For more information, see <a href="https://help.aliyun.com/document_detail/119035.html">Use a RAM user to grant RBAC permissions to other RAM users</a>.</li>
     * <li>If you update full permissions, the existing permissions of the RAM user or RAM role on the cluster are overwritten. You must specify all the permissions that you want to grant to the RAM user or RAM role in the request parameters when you call the operation.</li>
     * </ul>
     * 
     * @param request the request parameters of GrantPermissions  GrantPermissionsRequest
     * @return GrantPermissionsResponse
     */
    CompletableFuture<GrantPermissionsResponse> grantPermissions(GrantPermissionsRequest request);

    /**
     * @param request the request parameters of InstallClusterAddons  InstallClusterAddonsRequest
     * @return InstallClusterAddonsResponse
     */
    CompletableFuture<InstallClusterAddonsResponse> installClusterAddons(InstallClusterAddonsRequest request);

    /**
     * @param request the request parameters of ListAddons  ListAddonsRequest
     * @return ListAddonsResponse
     */
    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

    /**
     * @param request the request parameters of ListClusterAddonInstances  ListClusterAddonInstancesRequest
     * @return ListClusterAddonInstancesResponse
     */
    CompletableFuture<ListClusterAddonInstancesResponse> listClusterAddonInstances(ListClusterAddonInstancesRequest request);

    /**
     * @param request the request parameters of ListClusterChecks  ListClusterChecksRequest
     * @return ListClusterChecksResponse
     */
    CompletableFuture<ListClusterChecksResponse> listClusterChecks(ListClusterChecksRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have ram:ListUsers and ram:ListRoles permissions.</li>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permissions.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ListClusterKubeconfigStates  ListClusterKubeconfigStatesRequest
     * @return ListClusterKubeconfigStatesResponse
     */
    CompletableFuture<ListClusterKubeconfigStatesResponse> listClusterKubeconfigStates(ListClusterKubeconfigStatesRequest request);

    /**
     * @param request the request parameters of ListOperationPlans  ListOperationPlansRequest
     * @return ListOperationPlansResponse
     */
    CompletableFuture<ListOperationPlansResponse> listOperationPlans(ListOperationPlansRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> To call this operation, make sure that you have the AliyunCSFullAccess permissions.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListUserKubeConfigStates  ListUserKubeConfigStatesRequest
     * @return ListUserKubeConfigStatesResponse
     */
    CompletableFuture<ListUserKubeConfigStatesResponse> listUserKubeConfigStates(ListUserKubeConfigStatesRequest request);

    /**
     * @param request the request parameters of MigrateCluster  MigrateClusterRequest
     * @return MigrateClusterResponse
     */
    CompletableFuture<MigrateClusterResponse> migrateCluster(MigrateClusterRequest request);

    /**
     * @param request the request parameters of ModifyCluster  ModifyClusterRequest
     * @return ModifyClusterResponse
     */
    CompletableFuture<ModifyClusterResponse> modifyCluster(ModifyClusterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to modify the component parameters of an ACK Basic cluster or the control plane parameters of an ACK Pro cluster:</p>
     * <ul>
     * <li>To view the component parameters of an ACK Basic cluster, call the DescribeClusterAddonMetadata API operation. For more information, see <a href="https://help.aliyun.com/document_detail/2667944.html">Query the metadata of a cluster component</a>.</li>
     * <li>To view the control plane parameters of an ACK Pro cluster, see <a href="https://help.aliyun.com/document_detail/199588.html">Customize the control plane parameters of an ACK Pro cluster</a>.
     * After you call this operation, the component may be redeployed and restarted. We recommend that you assess the impact before you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyClusterAddon  ModifyClusterAddonRequest
     * @return ModifyClusterAddonResponse
     */
    CompletableFuture<ModifyClusterAddonResponse> modifyClusterAddon(ModifyClusterAddonRequest request);

    /**
     * @deprecated OpenAPI ModifyClusterConfiguration is deprecated, please use CS::2015-12-15::ModifyClusterAddon instead.  * @param request  the request parameters of ModifyClusterConfiguration  ModifyClusterConfigurationRequest
     * @return ModifyClusterConfigurationResponse
     */
    @Deprecated
    CompletableFuture<ModifyClusterConfigurationResponse> modifyClusterConfiguration(ModifyClusterConfigurationRequest request);

    /**
     * @param request the request parameters of ModifyClusterNodePool  ModifyClusterNodePoolRequest
     * @return ModifyClusterNodePoolResponse
     */
    CompletableFuture<ModifyClusterNodePoolResponse> modifyClusterNodePool(ModifyClusterNodePoolRequest request);

    /**
     * @param request the request parameters of ModifyClusterTags  ModifyClusterTagsRequest
     * @return ModifyClusterTagsResponse
     */
    CompletableFuture<ModifyClusterTagsResponse> modifyClusterTags(ModifyClusterTagsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Container Service for Kubernetes (ACK) allows you to modify the kubelet configuration of nodes in a node pool. After you modify the kubelet configuration, the new configuration immediately takes effect on existing nodes in the node pool and is automatically applied to newly added nodes.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyNodePoolNodeConfig  ModifyNodePoolNodeConfigRequest
     * @return ModifyNodePoolNodeConfigResponse
     */
    CompletableFuture<ModifyNodePoolNodeConfigResponse> modifyNodePoolNodeConfig(ModifyNodePoolNodeConfigRequest request);

    /**
     * @param request the request parameters of ModifyPolicyInstance  ModifyPolicyInstanceRequest
     * @return ModifyPolicyInstanceResponse
     */
    CompletableFuture<ModifyPolicyInstanceResponse> modifyPolicyInstance(ModifyPolicyInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can activate ACK by using Alibaba Cloud accounts.</p>
     * <ul>
     * <li>To activate ACK by using RAM users, you need to grant the AdministratorAccess permission to the RAM users.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenAckService  OpenAckServiceRequest
     * @return OpenAckServiceResponse
     */
    CompletableFuture<OpenAckServiceResponse> openAckService(OpenAckServiceRequest request);

    /**
     * @deprecated OpenAPI PauseClusterUpgrade is deprecated, please use CS::2015-12-15::PauseTask instead.  * @param request  the request parameters of PauseClusterUpgrade  PauseClusterUpgradeRequest
     * @return PauseClusterUpgradeResponse
     */
    @Deprecated
    CompletableFuture<PauseClusterUpgradeResponse> pauseClusterUpgrade(PauseClusterUpgradeRequest request);

    /**
     * @deprecated OpenAPI PauseComponentUpgrade is deprecated, please use CS::2015-12-15::PauseTask instead.  * @param request  the request parameters of PauseComponentUpgrade  PauseComponentUpgradeRequest
     * @return PauseComponentUpgradeResponse
     */
    @Deprecated
    CompletableFuture<PauseComponentUpgradeResponse> pauseComponentUpgrade(PauseComponentUpgradeRequest request);

    /**
     * @param request the request parameters of PauseTask  PauseTaskRequest
     * @return PauseTaskResponse
     */
    CompletableFuture<PauseTaskResponse> pauseTask(PauseTaskRequest request);

    /**
     * @deprecated OpenAPI RemoveClusterNodes is deprecated, please use CS::2015-12-15::RemoveNodePoolNodes instead.  * @description ****
     * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.
     * *   Unknown errors may occur when you remove nodes. Before you remove nodes, back up the data on the nodes.
     * *   Nodes remain in the Unschedulable state when they are being removed.
     * *   You can remove only worker nodes. You cannot remove master nodes.
     * 
     * @param request the request parameters of RemoveClusterNodes  RemoveClusterNodesRequest
     * @return RemoveClusterNodesResponse
     */
    @Deprecated
    CompletableFuture<RemoveClusterNodesResponse> removeClusterNodes(RemoveClusterNodesRequest request);

    /**
     * <b>description</b> :
     * <p>  When you remove a node, the pods on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.</p>
     * <ul>
     * <li>The operation may have unexpected risks. Back up the data before you perform this operation.</li>
     * <li>Nodes remain in the Unschedulable state when they are being removed.</li>
     * <li>The system removes only worker nodes. It does not remove master nodes.</li>
     * <li>Even if you set the <code>release_node</code> parameter to <code>true</code>, subscription nodes are not released. You must release the subscription nodes in the <a href="https://ecs.console.aliyun.com/">ECS console</a> after you remove the nodes.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveNodePoolNodes  RemoveNodePoolNodesRequest
     * @return RemoveNodePoolNodesResponse
     */
    CompletableFuture<RemoveNodePoolNodesResponse> removeNodePoolNodes(RemoveNodePoolNodesRequest request);

    /**
     * @param request the request parameters of RepairClusterNodePool  RepairClusterNodePoolRequest
     * @return RepairClusterNodePoolResponse
     */
    CompletableFuture<RepairClusterNodePoolResponse> repairClusterNodePool(RepairClusterNodePoolRequest request);

    /**
     * @deprecated OpenAPI ResumeComponentUpgrade is deprecated, please use CS::2015-12-15::ResumeTask instead.  * @param request  the request parameters of ResumeComponentUpgrade  ResumeComponentUpgradeRequest
     * @return ResumeComponentUpgradeResponse
     */
    @Deprecated
    CompletableFuture<ResumeComponentUpgradeResponse> resumeComponentUpgrade(ResumeComponentUpgradeRequest request);

    /**
     * @param request the request parameters of ResumeTask  ResumeTaskRequest
     * @return ResumeTaskResponse
     */
    CompletableFuture<ResumeTaskResponse> resumeTask(ResumeTaskRequest request);

    /**
     * @deprecated OpenAPI ResumeUpgradeCluster is deprecated, please use CS::2015-12-15::ResumeTask instead.  * @param request  the request parameters of ResumeUpgradeCluster  ResumeUpgradeClusterRequest
     * @return ResumeUpgradeClusterResponse
     */
    @Deprecated
    CompletableFuture<ResumeUpgradeClusterResponse> resumeUpgradeCluster(ResumeUpgradeClusterRequest request);

    /**
     * @param request the request parameters of RevokeK8sClusterKubeConfig  RevokeK8sClusterKubeConfigRequest
     * @return RevokeK8sClusterKubeConfigResponse
     */
    CompletableFuture<RevokeK8sClusterKubeConfigResponse> revokeK8sClusterKubeConfig(RevokeK8sClusterKubeConfigRequest request);

    /**
     * @param request the request parameters of RunClusterCheck  RunClusterCheckRequest
     * @return RunClusterCheckResponse
     */
    CompletableFuture<RunClusterCheckResponse> runClusterCheck(RunClusterCheckRequest request);

    /**
     * @deprecated OpenAPI ScaleCluster is deprecated, please use CS::2015-12-15::ModifyClusterNodePool instead.  * @param request  the request parameters of ScaleCluster  ScaleClusterRequest
     * @return ScaleClusterResponse
     */
    @Deprecated
    CompletableFuture<ScaleClusterResponse> scaleCluster(ScaleClusterRequest request);

    /**
     * @param request the request parameters of ScaleClusterNodePool  ScaleClusterNodePoolRequest
     * @return ScaleClusterNodePoolResponse
     */
    CompletableFuture<ScaleClusterNodePoolResponse> scaleClusterNodePool(ScaleClusterNodePoolRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>****The ScaleOutCluster API operation is phased out. You must call the node pool-related API operations to manage nodes. If you want to add worker nodes to a Container Service for Kubernetes (ACK) cluster, call the ScaleClusterNodePool API operation. For more information, see <a href="https://help.aliyun.com/document_detail/184928.html">ScaleClusterNodePool</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ScaleOutCluster  ScaleOutClusterRequest
     * @return ScaleOutClusterResponse
     */
    CompletableFuture<ScaleOutClusterResponse> scaleOutCluster(ScaleOutClusterRequest request);

    /**
     * @param request the request parameters of ScanClusterVuls  ScanClusterVulsRequest
     * @return ScanClusterVulsResponse
     */
    CompletableFuture<ScanClusterVulsResponse> scanClusterVuls(ScanClusterVulsRequest request);

    /**
     * @param request the request parameters of StartAlert  StartAlertRequest
     * @return StartAlertResponse
     */
    CompletableFuture<StartAlertResponse> startAlert(StartAlertRequest request);

    /**
     * @param request the request parameters of StopAlert  StopAlertRequest
     * @return StopAlertResponse
     */
    CompletableFuture<StopAlertResponse> stopAlert(StopAlertRequest request);

    /**
     * @param request the request parameters of SyncClusterNodePool  SyncClusterNodePoolRequest
     * @return SyncClusterNodePoolResponse
     */
    CompletableFuture<SyncClusterNodePoolResponse> syncClusterNodePool(SyncClusterNodePoolRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnInstallClusterAddons  UnInstallClusterAddonsRequest
     * @return UnInstallClusterAddonsResponse
     */
    CompletableFuture<UnInstallClusterAddonsResponse> unInstallClusterAddons(UnInstallClusterAddonsRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you understand the billing methods and pricing of <a href="https://www.alibabacloud.com/product/log-service/pricing">Simple Log Service</a>.</p>
     * 
     * @param request the request parameters of UpdateClusterAuditLogConfig  UpdateClusterAuditLogConfigRequest
     * @return UpdateClusterAuditLogConfigResponse
     */
    CompletableFuture<UpdateClusterAuditLogConfigResponse> updateClusterAuditLogConfig(UpdateClusterAuditLogConfigRequest request);

    /**
     * @param request the request parameters of UpdateContactGroupForAlert  UpdateContactGroupForAlertRequest
     * @return UpdateContactGroupForAlertResponse
     */
    CompletableFuture<UpdateContactGroupForAlertResponse> updateContactGroupForAlert(UpdateContactGroupForAlertRequest request);

    /**
     * @param request the request parameters of UpdateControlPlaneLog  UpdateControlPlaneLogRequest
     * @return UpdateControlPlaneLogResponse
     */
    CompletableFuture<UpdateControlPlaneLogResponse> updateControlPlaneLog(UpdateControlPlaneLogRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation only with an Alibaba Cloud account.</p>
     * <ul>
     * <li>If the kubeconfig file used by your cluster is revoked, the custom validity period of the kubeconfig file is reset. In this case, you need to call this API operation to reconfigure the validity period of the kubeconfig file.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateK8sClusterUserConfigExpire  UpdateK8sClusterUserConfigExpireRequest
     * @return UpdateK8sClusterUserConfigExpireResponse
     */
    CompletableFuture<UpdateK8sClusterUserConfigExpireResponse> updateK8sClusterUserConfigExpire(UpdateK8sClusterUserConfigExpireRequest request);

    /**
     * @param request the request parameters of UpdateResourcesDeleteProtection  UpdateResourcesDeleteProtectionRequest
     * @return UpdateResourcesDeleteProtectionResponse
     */
    CompletableFuture<UpdateResourcesDeleteProtectionResponse> updateResourcesDeleteProtection(UpdateResourcesDeleteProtectionRequest request);

    /**
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>You can update the permissions of a RAM user or RAM role on a cluster by using full update or incremental update. If you use full update, the existing permissions of the RAM user or RAM role on the cluster are overwritten. You must specify all the permissions that you want to grant to the RAM user or RAM role in the request parameters when you call the operation. If you use incremental update, you can grant permissions to or revoke permissions from the RAM user or RAM role on the cluster. In this case, only the permissions that you specify in the request parameters when you call the operation are granted or revoked, other permissions of the RAM user or RAM role on the cluster are not affected.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateUserPermissions  UpdateUserPermissionsRequest
     * @return UpdateUserPermissionsResponse
     */
    CompletableFuture<UpdateUserPermissionsResponse> updateUserPermissions(UpdateUserPermissionsRequest request);

    /**
     * <b>description</b> :
     * <p>After successfully calling the UpgradeCluster interface, this API returns the <code>task_id</code> of the upgrade task. You can manage this operation task by calling the following task APIs:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a> </li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a task that has been paused</a> </li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a></li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeCluster  UpgradeClusterRequest
     * @return UpgradeClusterResponse
     */
    CompletableFuture<UpgradeClusterResponse> upgradeCluster(UpgradeClusterRequest request);

    /**
     * @param request the request parameters of UpgradeClusterAddons  UpgradeClusterAddonsRequest
     * @return UpgradeClusterAddonsResponse
     */
    CompletableFuture<UpgradeClusterAddonsResponse> upgradeClusterAddons(UpgradeClusterAddonsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.</p>
     * 
     * @param request the request parameters of UpgradeClusterNodepool  UpgradeClusterNodepoolRequest
     * @return UpgradeClusterNodepoolResponse
     */
    CompletableFuture<UpgradeClusterNodepoolResponse> upgradeClusterNodepool(UpgradeClusterNodepoolRequest request);

}
