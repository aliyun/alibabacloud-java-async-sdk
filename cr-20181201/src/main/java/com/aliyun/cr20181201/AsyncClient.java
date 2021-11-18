// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201;

import com.aliyun.cr20181201.models.*;
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

    CompletableFuture<CancelArtifactBuildTaskResponse> cancelArtifactBuildTask(CancelArtifactBuildTaskRequest request);

    CompletableFuture<CancelRepoBuildRecordResponse> cancelRepoBuildRecord(CancelRepoBuildRecordRequest request);

    CompletableFuture<CreateBuildRecordByRuleResponse> createBuildRecordByRule(CreateBuildRecordByRuleRequest request);

    CompletableFuture<CreateChainResponse> createChain(CreateChainRequest request);

    CompletableFuture<CreateChartNamespaceResponse> createChartNamespace(CreateChartNamespaceRequest request);

    CompletableFuture<CreateChartRepositoryResponse> createChartRepository(CreateChartRepositoryRequest request);

    CompletableFuture<CreateInstanceEndpointAclPolicyResponse> createInstanceEndpointAclPolicy(CreateInstanceEndpointAclPolicyRequest request);

    /**
     * 
    
    
    
    
    <props = "china"> currently, the number of VPCs that can be associated is limited to 3. If you need to associate VPCs, [submit a ticket](https://account.aliyun.com/login/login.htm? oauth_callback = https://selfservice.console.aliyun.com/ticket/createIndex). </props>
    <props = "intl"> currently, the number of VPCs that can be associated is limited to 3. If necessary, [submit a ticket](https://account.alibabacloud.com/login/login.htm? oauth_callback = https%3A // ticket-intl. Console.aliyun.com/%23).
    </props>
    
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

    CompletableFuture<DeleteChainResponse> deleteChain(DeleteChainRequest request);

    /**
     * > deleting a Chart namespace deletes all repositories in the namespace and all repositories.
     */
    CompletableFuture<DeleteChartNamespaceResponse> deleteChartNamespace(DeleteChartNamespaceRequest request);

    CompletableFuture<DeleteChartReleaseResponse> deleteChartRelease(DeleteChartReleaseRequest request);

    CompletableFuture<DeleteChartRepositoryResponse> deleteChartRepository(DeleteChartRepositoryRequest request);

    CompletableFuture<DeleteInstanceEndpointAclPolicyResponse> deleteInstanceEndpointAclPolicy(DeleteInstanceEndpointAclPolicyRequest request);

    CompletableFuture<DeleteInstanceVpcEndpointLinkedVpcResponse> deleteInstanceVpcEndpointLinkedVpc(DeleteInstanceVpcEndpointLinkedVpcRequest request);

    /**
     * > deleting an image repository namespace deletes all repositories in the namespace and all repositories.
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DeleteRepoBuildRuleResponse> deleteRepoBuildRule(DeleteRepoBuildRuleRequest request);

    CompletableFuture<DeleteRepoSyncRuleResponse> deleteRepoSyncRule(DeleteRepoSyncRuleRequest request);

    CompletableFuture<DeleteRepoTagResponse> deleteRepoTag(DeleteRepoTagRequest request);

    CompletableFuture<DeleteRepoTriggerResponse> deleteRepoTrigger(DeleteRepoTriggerRequest request);

    /**
     * Note that this operation will delete all images that exist in the repository.
     */
    CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request);

    CompletableFuture<GetArtifactBuildTaskResponse> getArtifactBuildTask(GetArtifactBuildTaskRequest request);

    /**
     * The validity period of the temporary password is one hour. If you use STS to request a temporary password, the validity period of the temporary password is equivalent to the validity period of the STS Token of the request.
    
    -The permission to log on to an instance by using a temporary Token obtained by the primary account is equivalent to the permission to log on to the instance by using the username and password of the primary account.
    -The permission to log on to an instance by using a temporary Token obtained through a sub-account is equivalent to the permission to log on to the instance by using the user name and password of the sub-account.
    -The temporary Token obtained by STS is equivalent to the STS Token permission to log on to the instance.
    
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
     * * * * *
     */
    CompletableFuture<GetRepoBuildRecordResponse> getRepoBuildRecord(GetRepoBuildRecordRequest request);

    CompletableFuture<GetRepoBuildRecordStatusResponse> getRepoBuildRecordStatus(GetRepoBuildRecordStatusRequest request);

    CompletableFuture<GetRepoSourceCodeRepoResponse> getRepoSourceCodeRepo(GetRepoSourceCodeRepoRequest request);

    CompletableFuture<GetRepoSyncTaskResponse> getRepoSyncTask(GetRepoSyncTaskRequest request);

    CompletableFuture<GetRepoTagLayersResponse> getRepoTagLayers(GetRepoTagLayersRequest request);

    CompletableFuture<GetRepoTagManifestResponse> getRepoTagManifest(GetRepoTagManifestRequest request);

    CompletableFuture<GetRepoTagScanStatusResponse> getRepoTagScanStatus(GetRepoTagScanStatusRequest request);

    CompletableFuture<GetRepoTagScanSummaryResponse> getRepoTagScanSummary(GetRepoTagScanSummaryRequest request);

    CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request);

    CompletableFuture<ListArtifactBuildTaskLogResponse> listArtifactBuildTaskLog(ListArtifactBuildTaskLogRequest request);

    CompletableFuture<ListChainResponse> listChain(ListChainRequest request);

    CompletableFuture<ListChainInstanceResponse> listChainInstance(ListChainInstanceRequest request);

    CompletableFuture<ListChartNamespaceResponse> listChartNamespace(ListChartNamespaceRequest request);

    CompletableFuture<ListChartReleaseResponse> listChartRelease(ListChartReleaseRequest request);

    CompletableFuture<ListChartRepositoryResponse> listChartRepository(ListChartRepositoryRequest request);

    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    CompletableFuture<ListInstanceEndpointResponse> listInstanceEndpoint(ListInstanceEndpointRequest request);

    CompletableFuture<ListInstanceRegionResponse> listInstanceRegion(ListInstanceRegionRequest request);

    CompletableFuture<ListNamespaceResponse> listNamespace(ListNamespaceRequest request);

    CompletableFuture<ListRepoBuildRecordResponse> listRepoBuildRecord(ListRepoBuildRecordRequest request);

    CompletableFuture<ListRepoBuildRecordLogResponse> listRepoBuildRecordLog(ListRepoBuildRecordLogRequest request);

    CompletableFuture<ListRepoBuildRuleResponse> listRepoBuildRule(ListRepoBuildRuleRequest request);

    CompletableFuture<ListRepoSyncRuleResponse> listRepoSyncRule(ListRepoSyncRuleRequest request);

    /**
     * * * * *
     */
    CompletableFuture<ListRepoSyncTaskResponse> listRepoSyncTask(ListRepoSyncTaskRequest request);

    CompletableFuture<ListRepoTagResponse> listRepoTag(ListRepoTagRequest request);

    CompletableFuture<ListRepoTagScanResultResponse> listRepoTagScanResult(ListRepoTagScanResultRequest request);

    CompletableFuture<ListRepoTriggerResponse> listRepoTrigger(ListRepoTriggerRequest request);

    CompletableFuture<ListRepositoryResponse> listRepository(ListRepositoryRequest request);

    CompletableFuture<ResetLoginPasswordResponse> resetLoginPassword(ResetLoginPasswordRequest request);

    CompletableFuture<UpdateChainResponse> updateChain(UpdateChainRequest request);

    CompletableFuture<UpdateChartNamespaceResponse> updateChartNamespace(UpdateChartNamespaceRequest request);

    CompletableFuture<UpdateChartRepositoryResponse> updateChartRepository(UpdateChartRepositoryRequest request);

    CompletableFuture<UpdateInstanceEndpointStatusResponse> updateInstanceEndpointStatus(UpdateInstanceEndpointStatusRequest request);

    CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request);

    CompletableFuture<UpdateRepoBuildRuleResponse> updateRepoBuildRule(UpdateRepoBuildRuleRequest request);

    CompletableFuture<UpdateRepoSourceCodeRepoResponse> updateRepoSourceCodeRepo(UpdateRepoSourceCodeRepoRequest request);

    CompletableFuture<UpdateRepoTriggerResponse> updateRepoTrigger(UpdateRepoTriggerRequest request);

    CompletableFuture<UpdateRepositoryResponse> updateRepository(UpdateRepositoryRequest request);

}
