// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cr20181201.models.*;
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

    CompletableFuture<CancelArtifactBuildTaskResponse> cancelArtifactBuildTask(CancelArtifactBuildTaskRequest request);

    CompletableFuture<CancelRepoBuildRecordResponse> cancelRepoBuildRecord(CancelRepoBuildRecordRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
      * You can create building rules of accelerated images only for image repositories of Container Registry Advanced Edition instances. You cannot create building rules of accelerated images for image repositories of Container Registry Basic Edition instances. For more information, see [Specifications of different editions](https://www.alibabacloud.com/help/zh/container-registry/latest/what-is-container-registry#section-go7-lhg-qbc).
      * Accelerated images can be built in the following regions: China (Hangzhou), China (Shanghai), China (Beijing), China (Shenzhen), China (Guangzhou), China (Zhangjiakou), China (Hong Kong), US (Virginia), US (Silicon Valley), Singapore, Japan (Tokyo), and Malaysia (Kuala Lumpur).
      *
     */
    CompletableFuture<CreateArtifactBuildRuleResponse> createArtifactBuildRule(CreateArtifactBuildRuleRequest request);

    CompletableFuture<CreateArtifactLifecycleRuleResponse> createArtifactLifecycleRule(CreateArtifactLifecycleRuleRequest request);

    CompletableFuture<CreateBuildRecordByRecordResponse> createBuildRecordByRecord(CreateBuildRecordByRecordRequest request);

    CompletableFuture<CreateBuildRecordByRuleResponse> createBuildRecordByRule(CreateBuildRecordByRuleRequest request);

    CompletableFuture<CreateChainResponse> createChain(CreateChainRequest request);

    CompletableFuture<CreateChartNamespaceResponse> createChartNamespace(CreateChartNamespaceRequest request);

    CompletableFuture<CreateChartRepositoryResponse> createChartRepository(CreateChartRepositoryRequest request);

    CompletableFuture<CreateInstanceEndpointAclPolicyResponse> createInstanceEndpointAclPolicy(CreateInstanceEndpointAclPolicyRequest request);

    /**
      * A maximum of three VPCs can be associated with a Container Registry instance. If you want to associate more VPCs, contact Alibaba Cloud technical support.
      *
     */
    CompletableFuture<CreateInstanceVpcEndpointLinkedVpcResponse> createInstanceVpcEndpointLinkedVpc(CreateInstanceVpcEndpointLinkedVpcRequest request);

    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    CompletableFuture<CreateRepoBuildRuleResponse> createRepoBuildRule(CreateRepoBuildRuleRequest request);

    CompletableFuture<CreateRepoSourceCodeRepoResponse> createRepoSourceCodeRepo(CreateRepoSourceCodeRepoRequest request);

    CompletableFuture<CreateRepoSyncRuleResponse> createRepoSyncRule(CreateRepoSyncRuleRequest request);

    CompletableFuture<CreateRepoSyncTaskResponse> createRepoSyncTask(CreateRepoSyncTaskRequest request);

    CompletableFuture<CreateRepoSyncTaskByRuleResponse> createRepoSyncTaskByRule(CreateRepoSyncTaskByRuleRequest request);

    CompletableFuture<CreateRepoTagResponse> createRepoTag(CreateRepoTagRequest request);

    CompletableFuture<CreateRepoTagScanTaskResponse> createRepoTagScanTask(CreateRepoTagScanTaskRequest request);

    CompletableFuture<CreateRepoTriggerResponse> createRepoTrigger(CreateRepoTriggerRequest request);

    CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request);

    CompletableFuture<DeleteArtifactLifecycleRuleResponse> deleteArtifactLifecycleRule(DeleteArtifactLifecycleRuleRequest request);

    CompletableFuture<DeleteChainResponse> deleteChain(DeleteChainRequest request);

    /**
      * >  If you delete a chart namespace, all repositories in the namespace and the charts in all repositories are deleted.
      *
     */
    CompletableFuture<DeleteChartNamespaceResponse> deleteChartNamespace(DeleteChartNamespaceRequest request);

    CompletableFuture<DeleteChartReleaseResponse> deleteChartRelease(DeleteChartReleaseRequest request);

    CompletableFuture<DeleteChartRepositoryResponse> deleteChartRepository(DeleteChartRepositoryRequest request);

    CompletableFuture<DeleteEventCenterRuleResponse> deleteEventCenterRule(DeleteEventCenterRuleRequest request);

    CompletableFuture<DeleteInstanceEndpointAclPolicyResponse> deleteInstanceEndpointAclPolicy(DeleteInstanceEndpointAclPolicyRequest request);

    CompletableFuture<DeleteInstanceVpcEndpointLinkedVpcResponse> deleteInstanceVpcEndpointLinkedVpc(DeleteInstanceVpcEndpointLinkedVpcRequest request);

    /**
      * > After you delete a namespace, all repositories in the namespace and all images in these repositories are deleted as well.
      *
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DeleteRepoBuildRuleResponse> deleteRepoBuildRule(DeleteRepoBuildRuleRequest request);

    CompletableFuture<DeleteRepoSyncRuleResponse> deleteRepoSyncRule(DeleteRepoSyncRuleRequest request);

    CompletableFuture<DeleteRepoTagResponse> deleteRepoTag(DeleteRepoTagRequest request);

    CompletableFuture<DeleteRepoTriggerResponse> deleteRepoTrigger(DeleteRepoTriggerRequest request);

    /**
      * If you delete a repository, all images in the repository are also deleted.
      *
     */
    CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request);

    CompletableFuture<GetArtifactBuildRuleResponse> getArtifactBuildRule(GetArtifactBuildRuleRequest request);

    CompletableFuture<GetArtifactBuildTaskResponse> getArtifactBuildTask(GetArtifactBuildTaskRequest request);

    CompletableFuture<GetArtifactLifecycleRuleResponse> getArtifactLifecycleRule(GetArtifactLifecycleRuleRequest request);

    /**
      * The ID of the Container Registry instance.
      *
     */
    CompletableFuture<GetAuthorizationTokenResponse> getAuthorizationToken(GetAuthorizationTokenRequest request);

    CompletableFuture<GetChainResponse> getChain(GetChainRequest request);

    CompletableFuture<GetChartNamespaceResponse> getChartNamespace(GetChartNamespaceRequest request);

    CompletableFuture<GetChartRepositoryResponse> getChartRepository(GetChartRepositoryRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetInstanceCountResponse> getInstanceCount(GetInstanceCountRequest request);

    CompletableFuture<GetInstanceEndpointResponse> getInstanceEndpoint(GetInstanceEndpointRequest request);

    CompletableFuture<GetInstanceUsageResponse> getInstanceUsage(GetInstanceUsageRequest request);

    CompletableFuture<GetInstanceVpcEndpointResponse> getInstanceVpcEndpoint(GetInstanceVpcEndpointRequest request);

    CompletableFuture<GetNamespaceResponse> getNamespace(GetNamespaceRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<GetRepoBuildRecordResponse> getRepoBuildRecord(GetRepoBuildRecordRequest request);

    CompletableFuture<GetRepoBuildRecordStatusResponse> getRepoBuildRecordStatus(GetRepoBuildRecordStatusRequest request);

    CompletableFuture<GetRepoSourceCodeRepoResponse> getRepoSourceCodeRepo(GetRepoSourceCodeRepoRequest request);

    CompletableFuture<GetRepoSyncTaskResponse> getRepoSyncTask(GetRepoSyncTaskRequest request);

    CompletableFuture<GetRepoTagResponse> getRepoTag(GetRepoTagRequest request);

    CompletableFuture<GetRepoTagLayersResponse> getRepoTagLayers(GetRepoTagLayersRequest request);

    CompletableFuture<GetRepoTagManifestResponse> getRepoTagManifest(GetRepoTagManifestRequest request);

    CompletableFuture<GetRepoTagScanStatusResponse> getRepoTagScanStatus(GetRepoTagScanStatusRequest request);

    CompletableFuture<GetRepoTagScanSummaryResponse> getRepoTagScanSummary(GetRepoTagScanSummaryRequest request);

    CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request);

    CompletableFuture<ListArtifactBuildTaskLogResponse> listArtifactBuildTaskLog(ListArtifactBuildTaskLogRequest request);

    CompletableFuture<ListArtifactLifecycleRuleResponse> listArtifactLifecycleRule(ListArtifactLifecycleRuleRequest request);

    CompletableFuture<ListChainResponse> listChain(ListChainRequest request);

    CompletableFuture<ListChainInstanceResponse> listChainInstance(ListChainInstanceRequest request);

    CompletableFuture<ListChartNamespaceResponse> listChartNamespace(ListChartNamespaceRequest request);

    CompletableFuture<ListChartReleaseResponse> listChartRelease(ListChartReleaseRequest request);

    CompletableFuture<ListChartRepositoryResponse> listChartRepository(ListChartRepositoryRequest request);

    CompletableFuture<ListEventCenterRecordResponse> listEventCenterRecord(ListEventCenterRecordRequest request);

    CompletableFuture<ListEventCenterRuleNameResponse> listEventCenterRuleName(ListEventCenterRuleNameRequest request);

    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    CompletableFuture<ListInstanceEndpointResponse> listInstanceEndpoint(ListInstanceEndpointRequest request);

    CompletableFuture<ListInstanceRegionResponse> listInstanceRegion(ListInstanceRegionRequest request);

    CompletableFuture<ListNamespaceResponse> listNamespace(ListNamespaceRequest request);

    CompletableFuture<ListRepoBuildRecordResponse> listRepoBuildRecord(ListRepoBuildRecordRequest request);

    CompletableFuture<ListRepoBuildRecordLogResponse> listRepoBuildRecordLog(ListRepoBuildRecordLogRequest request);

    CompletableFuture<ListRepoBuildRuleResponse> listRepoBuildRule(ListRepoBuildRuleRequest request);

    CompletableFuture<ListRepoSyncRuleResponse> listRepoSyncRule(ListRepoSyncRuleRequest request);

    CompletableFuture<ListRepoSyncTaskResponse> listRepoSyncTask(ListRepoSyncTaskRequest request);

    CompletableFuture<ListRepoTagResponse> listRepoTag(ListRepoTagRequest request);

    CompletableFuture<ListRepoTagScanResultResponse> listRepoTagScanResult(ListRepoTagScanResultRequest request);

    CompletableFuture<ListRepoTriggerResponse> listRepoTrigger(ListRepoTriggerRequest request);

    CompletableFuture<ListRepositoryResponse> listRepository(ListRepositoryRequest request);

    CompletableFuture<ListScanBaselineByTaskResponse> listScanBaselineByTask(ListScanBaselineByTaskRequest request);

    CompletableFuture<ListScanMaliciousFileByTaskResponse> listScanMaliciousFileByTask(ListScanMaliciousFileByTaskRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ResetLoginPasswordResponse> resetLoginPassword(ResetLoginPasswordRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateArtifactLifecycleRuleResponse> updateArtifactLifecycleRule(UpdateArtifactLifecycleRuleRequest request);

    CompletableFuture<UpdateChainResponse> updateChain(UpdateChainRequest request);

    CompletableFuture<UpdateChartNamespaceResponse> updateChartNamespace(UpdateChartNamespaceRequest request);

    CompletableFuture<UpdateChartRepositoryResponse> updateChartRepository(UpdateChartRepositoryRequest request);

    CompletableFuture<UpdateEventCenterRuleResponse> updateEventCenterRule(UpdateEventCenterRuleRequest request);

    CompletableFuture<UpdateInstanceEndpointStatusResponse> updateInstanceEndpointStatus(UpdateInstanceEndpointStatusRequest request);

    CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request);

    CompletableFuture<UpdateRepoBuildRuleResponse> updateRepoBuildRule(UpdateRepoBuildRuleRequest request);

    CompletableFuture<UpdateRepoSourceCodeRepoResponse> updateRepoSourceCodeRepo(UpdateRepoSourceCodeRepoRequest request);

    CompletableFuture<UpdateRepoTriggerResponse> updateRepoTrigger(UpdateRepoTriggerRequest request);

    CompletableFuture<UpdateRepositoryResponse> updateRepository(UpdateRepositoryRequest request);

}
