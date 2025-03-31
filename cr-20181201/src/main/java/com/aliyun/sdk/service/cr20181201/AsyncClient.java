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

    /**
     * @param request the request parameters of CancelArtifactBuildTask  CancelArtifactBuildTaskRequest
     * @return CancelArtifactBuildTaskResponse
     */
    CompletableFuture<CancelArtifactBuildTaskResponse> cancelArtifactBuildTask(CancelArtifactBuildTaskRequest request);

    /**
     * @param request the request parameters of CancelRepoBuildRecord  CancelRepoBuildRecordRequest
     * @return CancelRepoBuildRecordResponse
     */
    CompletableFuture<CancelRepoBuildRecordResponse> cancelRepoBuildRecord(CancelRepoBuildRecordRequest request);

    /**
     * @param request the request parameters of CancelRepoSyncTask  CancelRepoSyncTaskRequest
     * @return CancelRepoSyncTaskResponse
     */
    CompletableFuture<CancelRepoSyncTaskResponse> cancelRepoSyncTask(CancelRepoSyncTaskRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can create building rules of accelerated images only for image repositories of Container Registry Advanced Edition instances. You cannot create building rules of accelerated images for image repositories of Container Registry Basic Edition instances. For more information, see <a href="https://www.alibabacloud.com/help/en/acr/product-overview/what-is-container-registry?spm=openapi-amp.newDocPublishment.0.0.bf82281fRj7rmV#section-n3q-ps7-x6k">Specifications of different editions</a>.
     * Accelerated images are not supported in Alibaba Finance Cloud regions or Alibaba Gov Cloud regions.</p>
     * 
     * @param request the request parameters of CreateArtifactBuildRule  CreateArtifactBuildRuleRequest
     * @return CreateArtifactBuildRuleResponse
     */
    CompletableFuture<CreateArtifactBuildRuleResponse> createArtifactBuildRule(CreateArtifactBuildRuleRequest request);

    /**
     * @param request the request parameters of CreateArtifactLifecycleRule  CreateArtifactLifecycleRuleRequest
     * @return CreateArtifactLifecycleRuleResponse
     */
    CompletableFuture<CreateArtifactLifecycleRuleResponse> createArtifactLifecycleRule(CreateArtifactLifecycleRuleRequest request);

    /**
     * @param request the request parameters of CreateArtifactSubscriptionRule  CreateArtifactSubscriptionRuleRequest
     * @return CreateArtifactSubscriptionRuleResponse
     */
    CompletableFuture<CreateArtifactSubscriptionRuleResponse> createArtifactSubscriptionRule(CreateArtifactSubscriptionRuleRequest request);

    /**
     * @param request the request parameters of CreateArtifactSubscriptionTask  CreateArtifactSubscriptionTaskRequest
     * @return CreateArtifactSubscriptionTaskResponse
     */
    CompletableFuture<CreateArtifactSubscriptionTaskResponse> createArtifactSubscriptionTask(CreateArtifactSubscriptionTaskRequest request);

    /**
     * @param request the request parameters of CreateBuildRecordByRecord  CreateBuildRecordByRecordRequest
     * @return CreateBuildRecordByRecordResponse
     */
    CompletableFuture<CreateBuildRecordByRecordResponse> createBuildRecordByRecord(CreateBuildRecordByRecordRequest request);

    /**
     * @param request the request parameters of CreateBuildRecordByRule  CreateBuildRecordByRuleRequest
     * @return CreateBuildRecordByRuleResponse
     */
    CompletableFuture<CreateBuildRecordByRuleResponse> createBuildRecordByRule(CreateBuildRecordByRuleRequest request);

    /**
     * @param request the request parameters of CreateChain  CreateChainRequest
     * @return CreateChainResponse
     */
    CompletableFuture<CreateChainResponse> createChain(CreateChainRequest request);

    /**
     * @param request the request parameters of CreateChartNamespace  CreateChartNamespaceRequest
     * @return CreateChartNamespaceResponse
     */
    CompletableFuture<CreateChartNamespaceResponse> createChartNamespace(CreateChartNamespaceRequest request);

    /**
     * @param request the request parameters of CreateChartRepository  CreateChartRepositoryRequest
     * @return CreateChartRepositoryResponse
     */
    CompletableFuture<CreateChartRepositoryResponse> createChartRepository(CreateChartRepositoryRequest request);

    /**
     * @param request the request parameters of CreateInstanceEndpointAclPolicy  CreateInstanceEndpointAclPolicyRequest
     * @return CreateInstanceEndpointAclPolicyResponse
     */
    CompletableFuture<CreateInstanceEndpointAclPolicyResponse> createInstanceEndpointAclPolicy(CreateInstanceEndpointAclPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>The VPC quota must be purchased separately.</p>
     * 
     * @param request the request parameters of CreateInstanceVpcEndpointLinkedVpc  CreateInstanceVpcEndpointLinkedVpcRequest
     * @return CreateInstanceVpcEndpointLinkedVpcResponse
     */
    CompletableFuture<CreateInstanceVpcEndpointLinkedVpcResponse> createInstanceVpcEndpointLinkedVpc(CreateInstanceVpcEndpointLinkedVpcRequest request);

    /**
     * @param request the request parameters of CreateNamespace  CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
     * @param request the request parameters of CreateRepoBuildRule  CreateRepoBuildRuleRequest
     * @return CreateRepoBuildRuleResponse
     */
    CompletableFuture<CreateRepoBuildRuleResponse> createRepoBuildRule(CreateRepoBuildRuleRequest request);

    /**
     * @param request the request parameters of CreateRepoSourceCodeRepo  CreateRepoSourceCodeRepoRequest
     * @return CreateRepoSourceCodeRepoResponse
     */
    CompletableFuture<CreateRepoSourceCodeRepoResponse> createRepoSourceCodeRepo(CreateRepoSourceCodeRepoRequest request);

    /**
     * @param request the request parameters of CreateRepoSyncRule  CreateRepoSyncRuleRequest
     * @return CreateRepoSyncRuleResponse
     */
    CompletableFuture<CreateRepoSyncRuleResponse> createRepoSyncRule(CreateRepoSyncRuleRequest request);

    /**
     * @param request the request parameters of CreateRepoSyncTask  CreateRepoSyncTaskRequest
     * @return CreateRepoSyncTaskResponse
     */
    CompletableFuture<CreateRepoSyncTaskResponse> createRepoSyncTask(CreateRepoSyncTaskRequest request);

    /**
     * @param request the request parameters of CreateRepoSyncTaskByRule  CreateRepoSyncTaskByRuleRequest
     * @return CreateRepoSyncTaskByRuleResponse
     */
    CompletableFuture<CreateRepoSyncTaskByRuleResponse> createRepoSyncTaskByRule(CreateRepoSyncTaskByRuleRequest request);

    /**
     * @param request the request parameters of CreateRepoTag  CreateRepoTagRequest
     * @return CreateRepoTagResponse
     */
    CompletableFuture<CreateRepoTagResponse> createRepoTag(CreateRepoTagRequest request);

    /**
     * @param request the request parameters of CreateRepoTagScanTask  CreateRepoTagScanTaskRequest
     * @return CreateRepoTagScanTaskResponse
     */
    CompletableFuture<CreateRepoTagScanTaskResponse> createRepoTagScanTask(CreateRepoTagScanTaskRequest request);

    /**
     * @param request the request parameters of CreateRepoTrigger  CreateRepoTriggerRequest
     * @return CreateRepoTriggerResponse
     */
    CompletableFuture<CreateRepoTriggerResponse> createRepoTrigger(CreateRepoTriggerRequest request);

    /**
     * @param request the request parameters of CreateRepository  CreateRepositoryRequest
     * @return CreateRepositoryResponse
     */
    CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request);

    /**
     * @param request the request parameters of DeleteArtifactLifecycleRule  DeleteArtifactLifecycleRuleRequest
     * @return DeleteArtifactLifecycleRuleResponse
     */
    CompletableFuture<DeleteArtifactLifecycleRuleResponse> deleteArtifactLifecycleRule(DeleteArtifactLifecycleRuleRequest request);

    /**
     * @param request the request parameters of DeleteArtifactSubscriptionRule  DeleteArtifactSubscriptionRuleRequest
     * @return DeleteArtifactSubscriptionRuleResponse
     */
    CompletableFuture<DeleteArtifactSubscriptionRuleResponse> deleteArtifactSubscriptionRule(DeleteArtifactSubscriptionRuleRequest request);

    /**
     * @param request the request parameters of DeleteChain  DeleteChainRequest
     * @return DeleteChainResponse
     */
    CompletableFuture<DeleteChainResponse> deleteChain(DeleteChainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If you delete a chart namespace, all repositories in the namespace and the charts in all repositories are deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteChartNamespace  DeleteChartNamespaceRequest
     * @return DeleteChartNamespaceResponse
     */
    CompletableFuture<DeleteChartNamespaceResponse> deleteChartNamespace(DeleteChartNamespaceRequest request);

    /**
     * @param request the request parameters of DeleteChartRelease  DeleteChartReleaseRequest
     * @return DeleteChartReleaseResponse
     */
    CompletableFuture<DeleteChartReleaseResponse> deleteChartRelease(DeleteChartReleaseRequest request);

    /**
     * @param request the request parameters of DeleteChartRepository  DeleteChartRepositoryRequest
     * @return DeleteChartRepositoryResponse
     */
    CompletableFuture<DeleteChartRepositoryResponse> deleteChartRepository(DeleteChartRepositoryRequest request);

    /**
     * @param request the request parameters of DeleteEventCenterRule  DeleteEventCenterRuleRequest
     * @return DeleteEventCenterRuleResponse
     */
    CompletableFuture<DeleteEventCenterRuleResponse> deleteEventCenterRule(DeleteEventCenterRuleRequest request);

    /**
     * @param request the request parameters of DeleteInstanceEndpointAclPolicy  DeleteInstanceEndpointAclPolicyRequest
     * @return DeleteInstanceEndpointAclPolicyResponse
     */
    CompletableFuture<DeleteInstanceEndpointAclPolicyResponse> deleteInstanceEndpointAclPolicy(DeleteInstanceEndpointAclPolicyRequest request);

    /**
     * @param request the request parameters of DeleteInstanceVpcEndpointLinkedVpc  DeleteInstanceVpcEndpointLinkedVpcRequest
     * @return DeleteInstanceVpcEndpointLinkedVpcResponse
     */
    CompletableFuture<DeleteInstanceVpcEndpointLinkedVpcResponse> deleteInstanceVpcEndpointLinkedVpc(DeleteInstanceVpcEndpointLinkedVpcRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you delete a namespace, all repositories in the namespace and all images in these repositories are deleted as well.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNamespace  DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    /**
     * @param request the request parameters of DeleteRepoBuildRule  DeleteRepoBuildRuleRequest
     * @return DeleteRepoBuildRuleResponse
     */
    CompletableFuture<DeleteRepoBuildRuleResponse> deleteRepoBuildRule(DeleteRepoBuildRuleRequest request);

    /**
     * @param request the request parameters of DeleteRepoSyncRule  DeleteRepoSyncRuleRequest
     * @return DeleteRepoSyncRuleResponse
     */
    CompletableFuture<DeleteRepoSyncRuleResponse> deleteRepoSyncRule(DeleteRepoSyncRuleRequest request);

    /**
     * @param request the request parameters of DeleteRepoTag  DeleteRepoTagRequest
     * @return DeleteRepoTagResponse
     */
    CompletableFuture<DeleteRepoTagResponse> deleteRepoTag(DeleteRepoTagRequest request);

    /**
     * @param request the request parameters of DeleteRepoTrigger  DeleteRepoTriggerRequest
     * @return DeleteRepoTriggerResponse
     */
    CompletableFuture<DeleteRepoTriggerResponse> deleteRepoTrigger(DeleteRepoTriggerRequest request);

    /**
     * <b>description</b> :
     * <p>If you delete a repository, all images in the repository are also deleted.</p>
     * 
     * @param request the request parameters of DeleteRepository  DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     */
    CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request);

    /**
     * @param request the request parameters of GetArtifactBuildRule  GetArtifactBuildRuleRequest
     * @return GetArtifactBuildRuleResponse
     */
    CompletableFuture<GetArtifactBuildRuleResponse> getArtifactBuildRule(GetArtifactBuildRuleRequest request);

    /**
     * @param request the request parameters of GetArtifactBuildTask  GetArtifactBuildTaskRequest
     * @return GetArtifactBuildTaskResponse
     */
    CompletableFuture<GetArtifactBuildTaskResponse> getArtifactBuildTask(GetArtifactBuildTaskRequest request);

    /**
     * @param request the request parameters of GetArtifactLifecycleRule  GetArtifactLifecycleRuleRequest
     * @return GetArtifactLifecycleRuleResponse
     */
    CompletableFuture<GetArtifactLifecycleRuleResponse> getArtifactLifecycleRule(GetArtifactLifecycleRuleRequest request);

    /**
     * @param request the request parameters of GetArtifactSubscriptionRule  GetArtifactSubscriptionRuleRequest
     * @return GetArtifactSubscriptionRuleResponse
     */
    CompletableFuture<GetArtifactSubscriptionRuleResponse> getArtifactSubscriptionRule(GetArtifactSubscriptionRuleRequest request);

    /**
     * @param request the request parameters of GetArtifactSubscriptionTask  GetArtifactSubscriptionTaskRequest
     * @return GetArtifactSubscriptionTaskResponse
     */
    CompletableFuture<GetArtifactSubscriptionTaskResponse> getArtifactSubscriptionTask(GetArtifactSubscriptionTaskRequest request);

    /**
     * @param request the request parameters of GetArtifactSubscriptionTaskResult  GetArtifactSubscriptionTaskResultRequest
     * @return GetArtifactSubscriptionTaskResultResponse
     */
    CompletableFuture<GetArtifactSubscriptionTaskResultResponse> getArtifactSubscriptionTaskResult(GetArtifactSubscriptionTaskResultRequest request);

    /**
     * <b>description</b> :
     * <p>The ID of the Container Registry instance.</p>
     * 
     * @param request the request parameters of GetAuthorizationToken  GetAuthorizationTokenRequest
     * @return GetAuthorizationTokenResponse
     */
    CompletableFuture<GetAuthorizationTokenResponse> getAuthorizationToken(GetAuthorizationTokenRequest request);

    /**
     * @param request the request parameters of GetChain  GetChainRequest
     * @return GetChainResponse
     */
    CompletableFuture<GetChainResponse> getChain(GetChainRequest request);

    /**
     * @param request the request parameters of GetChartNamespace  GetChartNamespaceRequest
     * @return GetChartNamespaceResponse
     */
    CompletableFuture<GetChartNamespaceResponse> getChartNamespace(GetChartNamespaceRequest request);

    /**
     * @param request the request parameters of GetChartRepository  GetChartRepositoryRequest
     * @return GetChartRepositoryResponse
     */
    CompletableFuture<GetChartRepositoryResponse> getChartRepository(GetChartRepositoryRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetInstanceCount  GetInstanceCountRequest
     * @return GetInstanceCountResponse
     */
    CompletableFuture<GetInstanceCountResponse> getInstanceCount(GetInstanceCountRequest request);

    /**
     * @param request the request parameters of GetInstanceEndpoint  GetInstanceEndpointRequest
     * @return GetInstanceEndpointResponse
     */
    CompletableFuture<GetInstanceEndpointResponse> getInstanceEndpoint(GetInstanceEndpointRequest request);

    /**
     * @param request the request parameters of GetInstanceUsage  GetInstanceUsageRequest
     * @return GetInstanceUsageResponse
     */
    CompletableFuture<GetInstanceUsageResponse> getInstanceUsage(GetInstanceUsageRequest request);

    /**
     * @param request the request parameters of GetInstanceVpcEndpoint  GetInstanceVpcEndpointRequest
     * @return GetInstanceVpcEndpointResponse
     */
    CompletableFuture<GetInstanceVpcEndpointResponse> getInstanceVpcEndpoint(GetInstanceVpcEndpointRequest request);

    /**
     * @param request the request parameters of GetNamespace  GetNamespaceRequest
     * @return GetNamespaceResponse
     */
    CompletableFuture<GetNamespaceResponse> getNamespace(GetNamespaceRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of GetRepoBuildRecord  GetRepoBuildRecordRequest
     * @return GetRepoBuildRecordResponse
     */
    CompletableFuture<GetRepoBuildRecordResponse> getRepoBuildRecord(GetRepoBuildRecordRequest request);

    /**
     * @param request the request parameters of GetRepoBuildRecordStatus  GetRepoBuildRecordStatusRequest
     * @return GetRepoBuildRecordStatusResponse
     */
    CompletableFuture<GetRepoBuildRecordStatusResponse> getRepoBuildRecordStatus(GetRepoBuildRecordStatusRequest request);

    /**
     * @param request the request parameters of GetRepoSourceCodeRepo  GetRepoSourceCodeRepoRequest
     * @return GetRepoSourceCodeRepoResponse
     */
    CompletableFuture<GetRepoSourceCodeRepoResponse> getRepoSourceCodeRepo(GetRepoSourceCodeRepoRequest request);

    /**
     * @param request the request parameters of GetRepoSyncTask  GetRepoSyncTaskRequest
     * @return GetRepoSyncTaskResponse
     */
    CompletableFuture<GetRepoSyncTaskResponse> getRepoSyncTask(GetRepoSyncTaskRequest request);

    /**
     * @param request the request parameters of GetRepoTag  GetRepoTagRequest
     * @return GetRepoTagResponse
     */
    CompletableFuture<GetRepoTagResponse> getRepoTag(GetRepoTagRequest request);

    /**
     * @param request the request parameters of GetRepoTagScanStatus  GetRepoTagScanStatusRequest
     * @return GetRepoTagScanStatusResponse
     */
    CompletableFuture<GetRepoTagScanStatusResponse> getRepoTagScanStatus(GetRepoTagScanStatusRequest request);

    /**
     * @param request the request parameters of GetRepoTagScanSummary  GetRepoTagScanSummaryRequest
     * @return GetRepoTagScanSummaryResponse
     */
    CompletableFuture<GetRepoTagScanSummaryResponse> getRepoTagScanSummary(GetRepoTagScanSummaryRequest request);

    /**
     * @param request the request parameters of GetRepository  GetRepositoryRequest
     * @return GetRepositoryResponse
     */
    CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request);

    /**
     * @param request the request parameters of ListArtifactBuildTaskLog  ListArtifactBuildTaskLogRequest
     * @return ListArtifactBuildTaskLogResponse
     */
    CompletableFuture<ListArtifactBuildTaskLogResponse> listArtifactBuildTaskLog(ListArtifactBuildTaskLogRequest request);

    /**
     * @param request the request parameters of ListArtifactLifecycleRule  ListArtifactLifecycleRuleRequest
     * @return ListArtifactLifecycleRuleResponse
     */
    CompletableFuture<ListArtifactLifecycleRuleResponse> listArtifactLifecycleRule(ListArtifactLifecycleRuleRequest request);

    /**
     * @param request the request parameters of ListArtifactSubscriptionRule  ListArtifactSubscriptionRuleRequest
     * @return ListArtifactSubscriptionRuleResponse
     */
    CompletableFuture<ListArtifactSubscriptionRuleResponse> listArtifactSubscriptionRule(ListArtifactSubscriptionRuleRequest request);

    /**
     * @param request the request parameters of ListArtifactSubscriptionTask  ListArtifactSubscriptionTaskRequest
     * @return ListArtifactSubscriptionTaskResponse
     */
    CompletableFuture<ListArtifactSubscriptionTaskResponse> listArtifactSubscriptionTask(ListArtifactSubscriptionTaskRequest request);

    /**
     * @param request the request parameters of ListChain  ListChainRequest
     * @return ListChainResponse
     */
    CompletableFuture<ListChainResponse> listChain(ListChainRequest request);

    /**
     * @param request the request parameters of ListChainInstance  ListChainInstanceRequest
     * @return ListChainInstanceResponse
     */
    CompletableFuture<ListChainInstanceResponse> listChainInstance(ListChainInstanceRequest request);

    /**
     * @param request the request parameters of ListChartNamespace  ListChartNamespaceRequest
     * @return ListChartNamespaceResponse
     */
    CompletableFuture<ListChartNamespaceResponse> listChartNamespace(ListChartNamespaceRequest request);

    /**
     * @param request the request parameters of ListChartRelease  ListChartReleaseRequest
     * @return ListChartReleaseResponse
     */
    CompletableFuture<ListChartReleaseResponse> listChartRelease(ListChartReleaseRequest request);

    /**
     * @param request the request parameters of ListChartRepository  ListChartRepositoryRequest
     * @return ListChartRepositoryResponse
     */
    CompletableFuture<ListChartRepositoryResponse> listChartRepository(ListChartRepositoryRequest request);

    /**
     * @param request the request parameters of ListEventCenterRecord  ListEventCenterRecordRequest
     * @return ListEventCenterRecordResponse
     */
    CompletableFuture<ListEventCenterRecordResponse> listEventCenterRecord(ListEventCenterRecordRequest request);

    /**
     * @param request the request parameters of ListEventCenterRuleName  ListEventCenterRuleNameRequest
     * @return ListEventCenterRuleNameResponse
     */
    CompletableFuture<ListEventCenterRuleNameResponse> listEventCenterRuleName(ListEventCenterRuleNameRequest request);

    /**
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    /**
     * @param request the request parameters of ListInstanceEndpoint  ListInstanceEndpointRequest
     * @return ListInstanceEndpointResponse
     */
    CompletableFuture<ListInstanceEndpointResponse> listInstanceEndpoint(ListInstanceEndpointRequest request);

    /**
     * @param request the request parameters of ListInstanceRegion  ListInstanceRegionRequest
     * @return ListInstanceRegionResponse
     */
    CompletableFuture<ListInstanceRegionResponse> listInstanceRegion(ListInstanceRegionRequest request);

    /**
     * @param request the request parameters of ListNamespace  ListNamespaceRequest
     * @return ListNamespaceResponse
     */
    CompletableFuture<ListNamespaceResponse> listNamespace(ListNamespaceRequest request);

    /**
     * @param request the request parameters of ListRepoBuildRecord  ListRepoBuildRecordRequest
     * @return ListRepoBuildRecordResponse
     */
    CompletableFuture<ListRepoBuildRecordResponse> listRepoBuildRecord(ListRepoBuildRecordRequest request);

    /**
     * @param request the request parameters of ListRepoBuildRecordLog  ListRepoBuildRecordLogRequest
     * @return ListRepoBuildRecordLogResponse
     */
    CompletableFuture<ListRepoBuildRecordLogResponse> listRepoBuildRecordLog(ListRepoBuildRecordLogRequest request);

    /**
     * @param request the request parameters of ListRepoBuildRule  ListRepoBuildRuleRequest
     * @return ListRepoBuildRuleResponse
     */
    CompletableFuture<ListRepoBuildRuleResponse> listRepoBuildRule(ListRepoBuildRuleRequest request);

    /**
     * @param request the request parameters of ListRepoSyncRule  ListRepoSyncRuleRequest
     * @return ListRepoSyncRuleResponse
     */
    CompletableFuture<ListRepoSyncRuleResponse> listRepoSyncRule(ListRepoSyncRuleRequest request);

    /**
     * @param request the request parameters of ListRepoSyncTask  ListRepoSyncTaskRequest
     * @return ListRepoSyncTaskResponse
     */
    CompletableFuture<ListRepoSyncTaskResponse> listRepoSyncTask(ListRepoSyncTaskRequest request);

    /**
     * @param request the request parameters of ListRepoTag  ListRepoTagRequest
     * @return ListRepoTagResponse
     */
    CompletableFuture<ListRepoTagResponse> listRepoTag(ListRepoTagRequest request);

    /**
     * @param request the request parameters of ListRepoTagScanResult  ListRepoTagScanResultRequest
     * @return ListRepoTagScanResultResponse
     */
    CompletableFuture<ListRepoTagScanResultResponse> listRepoTagScanResult(ListRepoTagScanResultRequest request);

    /**
     * @param request the request parameters of ListRepoTrigger  ListRepoTriggerRequest
     * @return ListRepoTriggerResponse
     */
    CompletableFuture<ListRepoTriggerResponse> listRepoTrigger(ListRepoTriggerRequest request);

    /**
     * @param request the request parameters of ListRepository  ListRepositoryRequest
     * @return ListRepositoryResponse
     */
    CompletableFuture<ListRepositoryResponse> listRepository(ListRepositoryRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, use a Security Center scan engine to scan the image.</p>
     * 
     * @param request the request parameters of ListScanBaselineByTask  ListScanBaselineByTaskRequest
     * @return ListScanBaselineByTaskResponse
     */
    CompletableFuture<ListScanBaselineByTaskResponse> listScanBaselineByTask(ListScanBaselineByTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, use a Security Center scan engine to scan the image.</p>
     * 
     * @param request the request parameters of ListScanMaliciousFileByTask  ListScanMaliciousFileByTaskRequest
     * @return ListScanMaliciousFileByTaskResponse
     */
    CompletableFuture<ListScanMaliciousFileByTaskResponse> listScanMaliciousFileByTask(ListScanMaliciousFileByTaskRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ResetLoginPassword  ResetLoginPasswordRequest
     * @return ResetLoginPasswordResponse
     */
    CompletableFuture<ResetLoginPasswordResponse> resetLoginPassword(ResetLoginPasswordRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateArtifactLifecycleRule  UpdateArtifactLifecycleRuleRequest
     * @return UpdateArtifactLifecycleRuleResponse
     */
    CompletableFuture<UpdateArtifactLifecycleRuleResponse> updateArtifactLifecycleRule(UpdateArtifactLifecycleRuleRequest request);

    /**
     * @param request the request parameters of UpdateArtifactSubscriptionRule  UpdateArtifactSubscriptionRuleRequest
     * @return UpdateArtifactSubscriptionRuleResponse
     */
    CompletableFuture<UpdateArtifactSubscriptionRuleResponse> updateArtifactSubscriptionRule(UpdateArtifactSubscriptionRuleRequest request);

    /**
     * @param request the request parameters of UpdateChain  UpdateChainRequest
     * @return UpdateChainResponse
     */
    CompletableFuture<UpdateChainResponse> updateChain(UpdateChainRequest request);

    /**
     * @param request the request parameters of UpdateChartNamespace  UpdateChartNamespaceRequest
     * @return UpdateChartNamespaceResponse
     */
    CompletableFuture<UpdateChartNamespaceResponse> updateChartNamespace(UpdateChartNamespaceRequest request);

    /**
     * @param request the request parameters of UpdateChartRepository  UpdateChartRepositoryRequest
     * @return UpdateChartRepositoryResponse
     */
    CompletableFuture<UpdateChartRepositoryResponse> updateChartRepository(UpdateChartRepositoryRequest request);

    /**
     * @param request the request parameters of UpdateEventCenterRule  UpdateEventCenterRuleRequest
     * @return UpdateEventCenterRuleResponse
     */
    CompletableFuture<UpdateEventCenterRuleResponse> updateEventCenterRule(UpdateEventCenterRuleRequest request);

    /**
     * @param request the request parameters of UpdateInstanceEndpointStatus  UpdateInstanceEndpointStatusRequest
     * @return UpdateInstanceEndpointStatusResponse
     */
    CompletableFuture<UpdateInstanceEndpointStatusResponse> updateInstanceEndpointStatus(UpdateInstanceEndpointStatusRequest request);

    /**
     * @param request the request parameters of UpdateNamespace  UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     */
    CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request);

    /**
     * @param request the request parameters of UpdateRepoBuildRule  UpdateRepoBuildRuleRequest
     * @return UpdateRepoBuildRuleResponse
     */
    CompletableFuture<UpdateRepoBuildRuleResponse> updateRepoBuildRule(UpdateRepoBuildRuleRequest request);

    /**
     * @param request the request parameters of UpdateRepoSourceCodeRepo  UpdateRepoSourceCodeRepoRequest
     * @return UpdateRepoSourceCodeRepoResponse
     */
    CompletableFuture<UpdateRepoSourceCodeRepoResponse> updateRepoSourceCodeRepo(UpdateRepoSourceCodeRepoRequest request);

    /**
     * @param request the request parameters of UpdateRepoTrigger  UpdateRepoTriggerRequest
     * @return UpdateRepoTriggerResponse
     */
    CompletableFuture<UpdateRepoTriggerResponse> updateRepoTrigger(UpdateRepoTriggerRequest request);

    /**
     * @param request the request parameters of UpdateRepository  UpdateRepositoryRequest
     * @return UpdateRepositoryResponse
     */
    CompletableFuture<UpdateRepositoryResponse> updateRepository(UpdateRepositoryRequest request);

}
