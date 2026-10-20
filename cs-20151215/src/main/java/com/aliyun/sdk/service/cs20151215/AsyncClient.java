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
     * <b>description</b> :
     * <p>Before you invoke this operation, read <a href="https://help.aliyun.com/document_detail/86919.html">Limits</a> to make sure that the ECS instances to be added meet the requirements.</p>
     * 
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
     * <ol>
     * <li>You must have the permission to manage Container Service for Kubernetes (ACK) (AliyunCSFullAccess). </li>
     * <li>Cleaning up permissions of an Alibaba Cloud account is not supported.</li>
     * <li>Cleaning up the permissions of the user who performs this operation is not supported.</li>
     * </ol>
     * </blockquote>
     * 
     * @param request the request parameters of CleanClusterUserPermissions  CleanClusterUserPermissionsRequest
     * @return CleanClusterUserPermissionsResponse
     */
    CompletableFuture<CleanClusterUserPermissionsResponse> cleanClusterUserPermissions(CleanClusterUserPermissionsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You must have the permission to manage Container Service for Kubernetes (ACK) (AliyunCSFullAccess).</li>
     * <li>Cleaning up permissions of an Alibaba Cloud account is not supported.</li>
     * <li>Cleaning up the permissions of the user who performs the operation is not supported.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CleanUserPermissions  CleanUserPermissionsRequest
     * @return CleanUserPermissionsResponse
     */
    CompletableFuture<CleanUserPermissionsResponse> cleanUserPermissions(CleanUserPermissionsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</notice></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAutoRepairPolicy  CreateAutoRepairPolicyRequest
     * @return CreateAutoRepairPolicyResponse
     */
    CompletableFuture<CreateAutoRepairPolicyResponse> createAutoRepairPolicy(CreateAutoRepairPolicyRequest request);

    /**
     * @param request the request parameters of CreateAutoscalingConfig  CreateAutoscalingConfigRequest
     * @return CreateAutoscalingConfigResponse
     */
    CompletableFuture<CreateAutoscalingConfigResponse> createAutoscalingConfig(CreateAutoscalingConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Generate OpenAPI request parameters by using the console</h3>
     * <p>When you call the CreateCluster operation to create a cluster, if the API call fails due to incorrect combinations of request parameters, you can use the console to generate the required request parameter combinations. Perform the following steps:</p>
     * <ol>
     * <li>Log on to the <a href="https://csnew.console.aliyun.com">Container Service for Kubernetes (ACK) console</a> and choose <strong>Clusters</strong> in the left-side navigation pane.</li>
     * <li>On the <strong>Clusters</strong> page, click <strong>Cluster Template</strong>.</li>
     * <li>In the dialog box, select the cluster type that you want to create, click Create, and then configure the cluster information on the cluster configuration page.</li>
     * <li>After the configuration is complete, on the <strong>Confirm Configuration</strong> page, click <strong>Equivalent Code</strong> in the upper-right corner. The dialog box displays the parameter combinations required for creating the cluster. You can copy and use them.<blockquote>
     * <p>Notice: Starting from July 04, 2026, some request parameters will no longer take effect. For details about the changes and replacement parameter descriptions, see <a href="https://help.aliyun.com/document_detail/2932733.html">Notice on changes to OpenAPI request and response parameters for ACK cluster management and OpenAPI offline</a>.</notice></p>
     * </blockquote>
     * </li>
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
     * @param request the request parameters of CreateClusterInspectConfig  CreateClusterInspectConfigRequest
     * @return CreateClusterInspectConfigResponse
     */
    CompletableFuture<CreateClusterInspectConfigResponse> createClusterInspectConfig(CreateClusterInspectConfigRequest request);

    /**
     * @param request the request parameters of CreateClusterNodePool  CreateClusterNodePoolRequest
     * @return CreateClusterNodePoolResponse
     */
    CompletableFuture<CreateClusterNodePoolResponse> createClusterNodePool(CreateClusterNodePoolRequest request);

    /**
     * @deprecated OpenAPI CreateKubernetesTrigger is deprecated, please use CS::2015-12-15::CreateTrigger instead.  * @param request  the request parameters of CreateKubernetesTrigger  CreateKubernetesTriggerRequest
     * @return CreateKubernetesTriggerResponse
     */
    @Deprecated
    CompletableFuture<CreateKubernetesTriggerResponse> createKubernetesTrigger(CreateKubernetesTriggerRequest request);

    /**
     * @param request the request parameters of CreateNodePoolComponentInstances  CreateNodePoolComponentInstancesRequest
     * @return CreateNodePoolComponentInstancesResponse
     */
    CompletableFuture<CreateNodePoolComponentInstancesResponse> createNodePoolComponentInstances(CreateNodePoolComponentInstancesRequest request);

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Creating a trigger supports only pod redeployment.</p>
     * </blockquote>
     * 
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
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</notice></p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAutoRepairPolicy  DeleteAutoRepairPolicyRequest
     * @return DeleteAutoRepairPolicyResponse
     */
    CompletableFuture<DeleteAutoRepairPolicyResponse> deleteAutoRepairPolicy(DeleteAutoRepairPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Risk notice:</p>
     * <ul>
     * <li>Subscription ECS instances, Lingjun AI Computing Service compute nodes, and other subscription resources in the cluster cannot be subject to automatic release. To avoid unnecessary billing, perform manual release. For more information, see Cluster deletion and node release rules.</li>
     * <li>Subscription APIServer SLB resources cannot be subject to automatic release. To avoid unnecessary billing, perform manual release.</li>
     * <li>VPCs, vSwitches, security groups, and RAM roles that are used by other resources cannot be deleted and are retained by default. Perform manual release.</li>
     * <li>Elastic Container Instance (ECI) instances created through virtual nodes are subject to automatic release.</li>
     * <li>Some cloud resources created through the cluster are not subject to automatic release when the cluster is deleted. These resources continue to incur billing after the cluster is deleted. Release or retain them as needed. These resources include: Simple Log Service (SLS) projects automatically created by the cluster, and cloud disks purchased through dynamically provisioned storage volumes.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteClusterInspectConfig  DeleteClusterInspectConfigRequest
     * @return DeleteClusterInspectConfigResponse
     */
    CompletableFuture<DeleteClusterInspectConfigResponse> deleteClusterInspectConfig(DeleteClusterInspectConfigRequest request);

    /**
     * @param request the request parameters of DeleteClusterNodepool  DeleteClusterNodepoolRequest
     * @return DeleteClusterNodepoolResponse
     */
    CompletableFuture<DeleteClusterNodepoolResponse> deleteClusterNodepool(DeleteClusterNodepoolRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When removing nodes, perform standardized operations through this operation or the <a href="https://cs.console.aliyun.com">Container Service console</a>. Do not manually remove nodes by running <code>kubectl delete node</code>.</li>
     * <li>Do not directly release nodes or remove instances in the ECS or ESS console (or through related API operations), or allow nodes to be passively released when a subscription instance expires. In these cases, the nodes are directly stopped and automatically removed from the Container Service console.</li>
     * <li>If the node pool has a desired number of nodes configured, the node pool automatically scales out other instances based on the corresponding configuration to maintain the node count at the desired number.</li>
     * <li>Removing nodes involves Pod migration, which may affect your services. Perform this operation during off-peak hours. Unexpected risks may occur during the operation. Back up your data in advance.</li>
     * <li>When removing nodes, ACK executes a drain operation. Make sure that the remaining nodes in the cluster have sufficient resources to avoid application pods that cannot be scheduling.</li>
     * <li>Check the node affinity rules and scheduling policies of the Pods on the nodes to be removed to make sure that the Pods can be scheduled to other nodes after the nodes are removed.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteClusterNodes  DeleteClusterNodesRequest
     * @return DeleteClusterNodesResponse
     */
    CompletableFuture<DeleteClusterNodesResponse> deleteClusterNodes(DeleteClusterNodesRequest request);

    /**
     * @deprecated OpenAPI DeleteKubernetesTrigger is deprecated, please use CS::2015-12-15::DeleteTrigger instead.  * @param request  the request parameters of DeleteKubernetesTrigger  DeleteKubernetesTriggerRequest
     * @return DeleteKubernetesTriggerResponse
     */
    @Deprecated
    CompletableFuture<DeleteKubernetesTriggerResponse> deleteKubernetesTrigger(DeleteKubernetesTriggerRequest request);

    /**
     * @param request the request parameters of DeleteNodePoolComponentInstance  DeleteNodePoolComponentInstanceRequest
     * @return DeleteNodePoolComponentInstanceResponse
     */
    CompletableFuture<DeleteNodePoolComponentInstanceResponse> deleteNodePoolComponentInstance(DeleteNodePoolComponentInstanceRequest request);

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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAutoRepairPolicy  DescribeAutoRepairPolicyRequest
     * @return DescribeAutoRepairPolicyResponse
     */
    CompletableFuture<DescribeAutoRepairPolicyResponse> describeAutoRepairPolicy(DescribeAutoRepairPolicyRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>When removing nodes, perform standardized operations through this API or the <a href="https://cs.console.aliyun.com">Container Service console</a>. Do not manually remove nodes by using <code>kubectl delete node</code>.</li>
     * <li>Do not directly release nodes, remove instances in the ECS or ESS console (or through related APIs), or allow nodes to be passively released due to subscription instance expires. In these cases, the node is directly stopped and automatically removed from the Container Service console.</li>
     * <li>If the node pool has a desired number of nodes configured, the node pool automatically scales out other instances based on the corresponding configuration to maintain the node count at the desired number.</li>
     * <li>Removing nodes involves Pod migration, which may affect your services. Perform this operation during off-peak hours. Unexpected risks may occur during the operation. Back up your data in advance.</li>
     * <li>When removing nodes, ACK executes a drain operation. Make sure that other nodes in the cluster have sufficient resources to avoid application pods from being unable to be scheduled for scheduling.</li>
     * <li>Check the node affinity rules and scheduling policies of Pods on the nodes to be removed to ensure that Pods are not unschedulable on other nodes after the node is removed.</li>
     * </ul>
     * 
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
     * <ul>
     * <li>The default validity period of the certificate issued by KubeConfig is 3 years. Within 180 days before the certificate expires, you can obtain a rotated and refreshed KubeConfig by using the Container Service console or the DescribeClusterUserKubeconfig operation. The new KubeConfig certificate is valid for 3 years. The old KubeConfig credential remains valid until the certificate expires. Obtain the rotated credential promptly based on the KubeConfig expiration time displayed in the console or returned by the operation.</li>
     * <li>Properly manage the KubeConfig credentials of your cluster and revoke them when they are no longer needed to avoid security risks such as sensitive data leakage caused by KubeConfig exposure.</li>
     * </ul>
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
     * @deprecated OpenAPI DescribeClusters is deprecated, please use CS::2015-12-15::DescribeClustersForRegion instead.  * @param request  the request parameters of DescribeClusters  DescribeClustersRequest
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
     * @deprecated OpenAPI DescribeExternalAgent is deprecated  * @description For more information about cluster registration, see [Register an external Kubernetes cluster](https://help.aliyun.com/document_detail/121053.html).
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
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeResourcesDeleteProtection  DescribeResourcesDeleteProtectionRequest
     * @return DescribeResourcesDeleteProtectionResponse
     */
    CompletableFuture<DescribeResourcesDeleteProtectionResponse> describeResourcesDeleteProtection(DescribeResourcesDeleteProtectionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be called only by an Alibaba Cloud account.</p>
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
     * <li>If the account that invokes this API operation is a Resource Access Management (RAM) user or RAM role, the API operation returns only the permissions for clusters on which the calling account has RBAC administrator permissions. To list permissions for all clusters, the calling account must have RBAC administrator permissions on all clusters.</li>
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
     * <b>description</b> :
     * <ul>
     * <li>CVE compatibility is guaranteed by Security Center. Ensure that you have activated the Ultimate edition of Security Center or <a href="https://help.aliyun.com/document_detail/42308.html">purchased the vulnerability fixing feature (pay-as-you-go)</a>.</li>
     * <li>Some CVE fixes require node restarts. Container Service drains the node before restarting it. Ensure that the cluster has sufficient spare node resources for drain operations. For example, scale out the node pool in advance.</li>
     * <li>Pay attention to the compatibility between your applications and CVEs. CVE fixes are performed in batches. During the CVE fixing process, you can pause or cancel the task. After you pause or cancel the task, batches that have already been dispatched continue to run until completion. Batches that have not been dispatched are paused or canceled.</li>
     * </ul>
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
     * @param request the request parameters of GetClusterInspectConfig  GetClusterInspectConfigRequest
     * @return GetClusterInspectConfigResponse
     */
    CompletableFuture<GetClusterInspectConfigResponse> getClusterInspectConfig(GetClusterInspectConfigRequest request);

    /**
     * @param request the request parameters of GetClusterInspectReportDetail  GetClusterInspectReportDetailRequest
     * @return GetClusterInspectReportDetailResponse
     */
    CompletableFuture<GetClusterInspectReportDetailResponse> getClusterInspectReportDetail(GetClusterInspectReportDetailRequest request);

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
     * <ul>
     * <li>If the account that invokes this API operation is a Resource Access Management (RAM) user, make sure that the account has been granted permissions to modify the cluster authorization information of other RAM users or RAM roles. Otherwise, the API returns the <code>StatusForbidden</code> or <code>ForbiddenGrantPermissions</code> fault code. For more information, see <a href="https://help.aliyun.com/document_detail/119035.html">Grant RBAC authorization to other RAM users</a>.</li>
     * <li>The operation of updating all RBAC permissions of a RAM user or RAM role overwrites the existing cluster permissions of the target RAM user or RAM role. The request must include all permission configurations that you want to grant to the target RAM user or RAM role.</li>
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
     * @param request the request parameters of InstallNodePoolComponents  InstallNodePoolComponentsRequest
     * @return InstallNodePoolComponentsResponse
     */
    CompletableFuture<InstallNodePoolComponentsResponse> installNodePoolComponents(InstallNodePoolComponentsRequest request);

    /**
     * @param request the request parameters of ListAddons  ListAddonsRequest
     * @return ListAddonsResponse
     */
    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAutoRepairPolicies  ListAutoRepairPoliciesRequest
     * @return ListAutoRepairPoliciesResponse
     */
    CompletableFuture<ListAutoRepairPoliciesResponse> listAutoRepairPolicies(ListAutoRepairPoliciesRequest request);

    /**
     * @param request the request parameters of ListClusterAddonInstanceResources  ListClusterAddonInstanceResourcesRequest
     * @return ListClusterAddonInstanceResourcesResponse
     */
    CompletableFuture<ListClusterAddonInstanceResourcesResponse> listClusterAddonInstanceResources(ListClusterAddonInstanceResourcesRequest request);

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
     * @param request the request parameters of ListClusterInspectReports  ListClusterInspectReportsRequest
     * @return ListClusterInspectReportsResponse
     */
    CompletableFuture<ListClusterInspectReportsResponse> listClusterInspectReports(ListClusterInspectReportsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You must have the ram:ListUsers and ram:ListRoles permissions.</li>
     * <li>You must have the permissions to manage Container Service for Kubernetes (CS) (AliyunCSFullAccess).</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ListClusterKubeconfigStates  ListClusterKubeconfigStatesRequest
     * @return ListClusterKubeconfigStatesResponse
     */
    CompletableFuture<ListClusterKubeconfigStatesResponse> listClusterKubeconfigStates(ListClusterKubeconfigStatesRequest request);

    /**
     * @param request the request parameters of ListNodePoolComponentInstanceNodes  ListNodePoolComponentInstanceNodesRequest
     * @return ListNodePoolComponentInstanceNodesResponse
     */
    CompletableFuture<ListNodePoolComponentInstanceNodesResponse> listNodePoolComponentInstanceNodes(ListNodePoolComponentInstanceNodesRequest request);

    /**
     * @param request the request parameters of ListNodePoolComponentInstances  ListNodePoolComponentInstancesRequest
     * @return ListNodePoolComponentInstancesResponse
     */
    CompletableFuture<ListNodePoolComponentInstancesResponse> listNodePoolComponentInstances(ListNodePoolComponentInstancesRequest request);

    /**
     * @param request the request parameters of ListNodePoolComponents  ListNodePoolComponentsRequest
     * @return ListNodePoolComponentsResponse
     */
    CompletableFuture<ListNodePoolComponentsResponse> listNodePoolComponents(ListNodePoolComponentsRequest request);

    /**
     * @param request the request parameters of ListOperationPlans  ListOperationPlansRequest
     * @return ListOperationPlansResponse
     */
    CompletableFuture<ListOperationPlansResponse> listOperationPlans(ListOperationPlansRequest request);

    /**
     * @param request the request parameters of ListOperationPlansForRegion  ListOperationPlansForRegionRequest
     * @return ListOperationPlansForRegionResponse
     */
    CompletableFuture<ListOperationPlansForRegionResponse> listOperationPlansForRegion(ListOperationPlansForRegionRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To call this operation, you must have full access permissions on Container Service for Kubernetes (ACK) (AliyunCSFullAccess).</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListUserKubeConfigStates  ListUserKubeConfigStatesRequest
     * @return ListUserKubeConfigStatesResponse
     */
    CompletableFuture<ListUserKubeConfigStatesResponse> listUserKubeConfigStates(ListUserKubeConfigStatesRequest request);

    /**
     * <b>description</b> :
     * <p>After you migrate an ACK basic managed cluster to an ACK Pro managed cluster, a <a href="https://help.aliyun.com/document_detail/462278.html">cluster management fee</a> charged by ACK is added. The billing of other cloud resources remains unchanged.</p>
     * 
     * @param request the request parameters of MigrateCluster  MigrateClusterRequest
     * @return MigrateClusterResponse
     */
    CompletableFuture<MigrateClusterResponse> migrateCluster(MigrateClusterRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyAutoRepairPolicy  ModifyAutoRepairPolicyRequest
     * @return ModifyAutoRepairPolicyResponse
     */
    CompletableFuture<ModifyAutoRepairPolicyResponse> modifyAutoRepairPolicy(ModifyAutoRepairPolicyRequest request);

    /**
     * <b>description</b> :
     * <p><notice>Starting from July 4, 2026, the request parameters instance_deletion_protection, ingress_loadbalancer_id, and access_control_list will no longer take effect. For more information about the changes, see <a href="https://help.aliyun.com/document_detail/2932733.html">Announcement on changes to OpenAPI request and response parameters and OpenAPI deprecation for ACK cluster management</a>.</notice></p>
     * 
     * @param request the request parameters of ModifyCluster  ModifyClusterRequest
     * @return ModifyClusterResponse
     */
    CompletableFuture<ModifyClusterResponse> modifyCluster(ModifyClusterRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this API operation to modify the configuration of common clusters components and the control plane parameter settings of ACK Pro clusters:</p>
     * <ul>
     * <li>To query the configurable parameters of common components, call the DescribeClusterAddonMetadata API operation. For details, see <a href="https://help.aliyun.com/document_detail/2667944.html">Query cluster component version metadata</a>.</li>
     * <li>For the configurable control plane parameter settings of ACK Pro clusters, see <a href="https://help.aliyun.com/document_detail/199588.html">Customize control plane parameters of an ACK Pro cluster</a>.
     * Modifying the configuration may cause the component to be redeployed and restarted. Evaluate the impact before performing this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyClusterAddon  ModifyClusterAddonRequest
     * @return ModifyClusterAddonResponse
     */
    CompletableFuture<ModifyClusterAddonResponse> modifyClusterAddon(ModifyClusterAddonRequest request);

    /**
     * <b>description</b> :
     * <p><notice>Starting July 4, 2026, the request parameters instance_deletion_protection, ingress_loadbalancer_id, and access_control_list will no longer take effect. For more information about the changes, see <a href="https://help.aliyun.com/document_detail/2932733.html">Announcement on changes to input and output parameters of ACK cluster management OpenAPI operations and deprecation of OpenAPI operations</a>.</notice></p>
     * 
     * @param request the request parameters of ModifyClusterNodePool  ModifyClusterNodePoolRequest
     * @return ModifyClusterNodePoolResponse
     */
    CompletableFuture<ModifyClusterNodePoolResponse> modifyClusterNodePool(ModifyClusterNodePoolRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation performs a full update. Specify the complete set of target tags as input parameters to avoid losing existing tags. To perform an incremental update, use <a href="https://help.aliyun.com/document_detail/2667969.html">TagResources to bind tags to a cluster</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyClusterTags  ModifyClusterTagsRequest
     * @return ModifyClusterTagsResponse
     */
    CompletableFuture<ModifyClusterTagsResponse> modifyClusterTags(ModifyClusterTagsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>ACK supports modifying the kubelet configurations of nodes in a node pool. After the modification is complete, the configurations automatically take effect on existing nodes in the node pool, and new nodes added to the node pool also use the new configurations.</p>
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
     * <ul>
     * <li>An Alibaba Cloud account can activate ACK.</li>
     * <li>A Resource Access Management (RAM) user that has the AdministratorAccess permission can activate the service.</li>
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
     * @deprecated OpenAPI RemoveClusterNodes is deprecated, please use CS::2015-12-15::RemoveNodePoolNodes instead.  * @param request  the request parameters of RemoveClusterNodes  RemoveClusterNodesRequest
     * @return RemoveClusterNodesResponse
     */
    @Deprecated
    CompletableFuture<RemoveClusterNodesResponse> removeClusterNodes(RemoveClusterNodesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Removing nodes involves pod migration, which may affect your services. Perform this operation during off-peak hours.</li>
     * <li>Unexpected risks may occur during the operation. Back up your data in advance.</li>
     * <li>During the operation, the nodes being removed are set to the unschedulable state in the background.</li>
     * <li>This operation removes only worker nodes, not master nodes.</li>
     * <li>Even if you choose to release nodes (nodes with <code>release_node</code> set to <code>true</code>), subscription nodes are not released. After removing the nodes, release them in the <a href="https://ecs.console.aliyun.com/">ECS console</a>.</li>
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
     * @param request the request parameters of RunClusterInspect  RunClusterInspectRequest
     * @return RunClusterInspectResponse
     */
    CompletableFuture<RunClusterInspectResponse> runClusterInspect(RunClusterInspectRequest request);

    /**
     * @param request the request parameters of RunNodeOperation  RunNodeOperationRequest
     * @return RunNodeOperationResponse
     */
    CompletableFuture<RunNodeOperationResponse> runNodeOperation(RunNodeOperationRequest request);

    /**
     * @param request the request parameters of ScaleClusterNodePool  ScaleClusterNodePoolRequest
     * @return ScaleClusterNodePoolResponse
     */
    CompletableFuture<ScaleClusterNodePoolResponse> scaleClusterNodePool(ScaleClusterNodePoolRequest request);

    /**
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
     * <p>Before you use this operation, make sure that you fully understand the billing methods and pricing of &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/sls/detail/sls">Simple Log Service</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/log-service/pricing">Simple Log Service</a>.</p>
     * 
     * @param request the request parameters of UpdateClusterAuditLogConfig  UpdateClusterAuditLogConfigRequest
     * @return UpdateClusterAuditLogConfigResponse
     */
    CompletableFuture<UpdateClusterAuditLogConfigResponse> updateClusterAuditLogConfig(UpdateClusterAuditLogConfigRequest request);

    /**
     * @param request the request parameters of UpdateClusterInspectConfig  UpdateClusterInspectConfigRequest
     * @return UpdateClusterInspectConfigResponse
     */
    CompletableFuture<UpdateClusterInspectConfigResponse> updateClusterInspectConfig(UpdateClusterInspectConfigRequest request);

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
     * <ul>
     * <li>This operation can be called only by an Alibaba Cloud account.</li>
     * <li>If you revoke the KubeConfig credential used in the cluster, the custom expiration time configured for the KubeConfig credential in the cluster is also reset. You must call this operation to reconfigure the expiration time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateK8sClusterUserConfigExpire  UpdateK8sClusterUserConfigExpireRequest
     * @return UpdateK8sClusterUserConfigExpireResponse
     */
    CompletableFuture<UpdateK8sClusterUserConfigExpireResponse> updateK8sClusterUserConfigExpire(UpdateK8sClusterUserConfigExpireRequest request);

    /**
     * <b>description</b> :
     * <p>Do not use the KMS console or OpenAPI to disable or delete the KMS key used for this feature while enabling or disabling encryption at rest, or after the feature is successfully enabled. Otherwise, the cluster API server becomes unavailable, which prevents you from retrieving objects such as Secrets and ServiceAccounts and affects the normal operation of your applications. For more information, see <a href="https://help.aliyun.com/document_detail/177372.html">Use Alibaba Cloud KMS to encrypt Secrets at rest</a>.</p>
     * <ul>
     * <li>The user or role that calls this API must be granted the required cluster RBAC permissions, such as O&amp;M engineer or administrator permissions. Otherwise, the ForbiddenUpdateKMSState error code is returned.</li>
     * <li>After this API is successfully called, the cluster status changes to Updating. After the update is complete, the cluster status changes back to Running. You must wait at least 5 minutes after an update is complete before you can call this API again for the same cluster. Otherwise, the 409 status code is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKMSEncryption  UpdateKMSEncryptionRequest
     * @return UpdateKMSEncryptionResponse
     */
    CompletableFuture<UpdateKMSEncryptionResponse> updateKMSEncryption(UpdateKMSEncryptionRequest request);

    /**
     * @param request the request parameters of UpdateNodePoolComponent  UpdateNodePoolComponentRequest
     * @return UpdateNodePoolComponentResponse
     */
    CompletableFuture<UpdateNodePoolComponentResponse> updateNodePoolComponent(UpdateNodePoolComponentRequest request);

    /**
     * @param request the request parameters of UpdateNodePoolComponentInstance  UpdateNodePoolComponentInstanceRequest
     * @return UpdateNodePoolComponentInstanceResponse
     */
    CompletableFuture<UpdateNodePoolComponentInstanceResponse> updateNodePoolComponentInstance(UpdateNodePoolComponentInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, install or upgrade the security policy component for the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/359818.html">Enable security policy management</a>.</p>
     * 
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
     * <p>You can update the cluster authorization information of a target Resource Access Management (RAM) user or RAM role by using full update or incremental update. A full update overwrites all existing cluster permissions of the target RAM user or RAM role. The request must include all permission configurations that you want to grant to the target RAM user or RAM role. An incremental update includes add and delete operations. Only the cluster authorization information included in the request is changed, and other cluster permissions of the RAM user or RAM role are not affected.</p>
     * 
     * @param request the request parameters of UpdateUserPermissions  UpdateUserPermissionsRequest
     * @return UpdateUserPermissionsResponse
     */
    CompletableFuture<UpdateUserPermissionsResponse> updateUserPermissions(UpdateUserPermissionsRequest request);

    /**
     * <b>description</b> :
     * <p>After you successfully call the UpgradeCluster operation, the API returns the <code>task_id</code> of the upgrade task. You can manage the task by calling the following task API operations:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a paused task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a><blockquote>
     * <p>Notice: Starting from July 04, 2026, the request parameters rolling_policy and rolling_policy.max_parallelism will no longer take effect. Use <a href="https://help.aliyun.com/document_detail/2667922.html">UpgradeClusterNodepool</a> to upgrade worker nodes instead. For more information about the changes, see <a href="https://help.aliyun.com/document_detail/2932733.html">Notice on changes to request and response parameters of ACK cluster management OpenAPI operations and deprecation of OpenAPI operations</a>.</notice></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeCluster  UpgradeClusterRequest
     * @return UpgradeClusterResponse
     */
    CompletableFuture<UpgradeClusterResponse> upgradeCluster(UpgradeClusterRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Upgrading cluster component instance versions may affect your business. Assess the impact before performing the operation during off-peak hours and back up relevant data in advance.</li>
     * <li>Before upgrading a component, refer to <a href="https://help.aliyun.com/document_detail/176087.html">Component release notes</a> to learn about the changes and their impact for the specified component.</li>
     * <li>Upgrade components one at a time. Confirm that one component has been successfully upgraded before upgrading the next.</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeClusterAddons  UpgradeClusterAddonsRequest
     * @return UpgradeClusterAddonsResponse
     */
    CompletableFuture<UpgradeClusterAddonsResponse> upgradeClusterAddons(UpgradeClusterAddonsRequest request);

    /**
     * <b>description</b> :
     * <p>Upgrades the Kubernetes version, operating system version, or container runtime version of nodes in a specified cluster node pool. After you successfully call the UpgradeClusterNodepool operation, the API returns a <code>task_id</code> for the upgrade task. You can manage the task by calling the following task API operations:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a paused task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a></li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeClusterNodepool  UpgradeClusterNodepoolRequest
     * @return UpgradeClusterNodepoolResponse
     */
    CompletableFuture<UpgradeClusterNodepoolResponse> upgradeClusterNodepool(UpgradeClusterNodepoolRequest request);

}
