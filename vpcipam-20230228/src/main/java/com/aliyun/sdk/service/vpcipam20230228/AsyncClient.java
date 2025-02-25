// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vpcipam20230228.models.*;
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
     * @param request the request parameters of AddIpamPoolCidr  AddIpamPoolCidrRequest
     * @return AddIpamPoolCidrResponse
     */
    CompletableFuture<AddIpamPoolCidrResponse> addIpamPoolCidr(AddIpamPoolCidrRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateIpam  CreateIpamRequest
     * @return CreateIpamResponse
     */
    CompletableFuture<CreateIpamResponse> createIpam(CreateIpamRequest request);

    /**
     * @param request the request parameters of CreateIpamPool  CreateIpamPoolRequest
     * @return CreateIpamPoolResponse
     */
    CompletableFuture<CreateIpamPoolResponse> createIpamPool(CreateIpamPoolRequest request);

    /**
     * @param request the request parameters of CreateIpamPoolAllocation  CreateIpamPoolAllocationRequest
     * @return CreateIpamPoolAllocationResponse
     */
    CompletableFuture<CreateIpamPoolAllocationResponse> createIpamPoolAllocation(CreateIpamPoolAllocationRequest request);

    /**
     * @param request the request parameters of CreateIpamScope  CreateIpamScopeRequest
     * @return CreateIpamScopeResponse
     */
    CompletableFuture<CreateIpamScopeResponse> createIpamScope(CreateIpamScopeRequest request);

    /**
     * @param request the request parameters of DeleteIpam  DeleteIpamRequest
     * @return DeleteIpamResponse
     */
    CompletableFuture<DeleteIpamResponse> deleteIpam(DeleteIpamRequest request);

    /**
     * @param request the request parameters of DeleteIpamPool  DeleteIpamPoolRequest
     * @return DeleteIpamPoolResponse
     */
    CompletableFuture<DeleteIpamPoolResponse> deleteIpamPool(DeleteIpamPoolRequest request);

    /**
     * @param request the request parameters of DeleteIpamPoolAllocation  DeleteIpamPoolAllocationRequest
     * @return DeleteIpamPoolAllocationResponse
     */
    CompletableFuture<DeleteIpamPoolAllocationResponse> deleteIpamPoolAllocation(DeleteIpamPoolAllocationRequest request);

    /**
     * @param request the request parameters of DeleteIpamPoolCidr  DeleteIpamPoolCidrRequest
     * @return DeleteIpamPoolCidrResponse
     */
    CompletableFuture<DeleteIpamPoolCidrResponse> deleteIpamPoolCidr(DeleteIpamPoolCidrRequest request);

    /**
     * @param request the request parameters of DeleteIpamScope  DeleteIpamScopeRequest
     * @return DeleteIpamScopeResponse
     */
    CompletableFuture<DeleteIpamScopeResponse> deleteIpamScope(DeleteIpamScopeRequest request);

    /**
     * @param request the request parameters of GetIpamPoolAllocation  GetIpamPoolAllocationRequest
     * @return GetIpamPoolAllocationResponse
     */
    CompletableFuture<GetIpamPoolAllocationResponse> getIpamPoolAllocation(GetIpamPoolAllocationRequest request);

    /**
     * @param request the request parameters of GetVpcIpamServiceStatus  GetVpcIpamServiceStatusRequest
     * @return GetVpcIpamServiceStatusResponse
     */
    CompletableFuture<GetVpcIpamServiceStatusResponse> getVpcIpamServiceStatus(GetVpcIpamServiceStatusRequest request);

    /**
     * @param request the request parameters of ListIpamDiscoveredResource  ListIpamDiscoveredResourceRequest
     * @return ListIpamDiscoveredResourceResponse
     */
    CompletableFuture<ListIpamDiscoveredResourceResponse> listIpamDiscoveredResource(ListIpamDiscoveredResourceRequest request);

    /**
     * @param request the request parameters of ListIpamPoolAllocations  ListIpamPoolAllocationsRequest
     * @return ListIpamPoolAllocationsResponse
     */
    CompletableFuture<ListIpamPoolAllocationsResponse> listIpamPoolAllocations(ListIpamPoolAllocationsRequest request);

    /**
     * @param request the request parameters of ListIpamPoolCidrs  ListIpamPoolCidrsRequest
     * @return ListIpamPoolCidrsResponse
     */
    CompletableFuture<ListIpamPoolCidrsResponse> listIpamPoolCidrs(ListIpamPoolCidrsRequest request);

    /**
     * @param request the request parameters of ListIpamPools  ListIpamPoolsRequest
     * @return ListIpamPoolsResponse
     */
    CompletableFuture<ListIpamPoolsResponse> listIpamPools(ListIpamPoolsRequest request);

    /**
     * @param request the request parameters of ListIpamResourceCidrs  ListIpamResourceCidrsRequest
     * @return ListIpamResourceCidrsResponse
     */
    CompletableFuture<ListIpamResourceCidrsResponse> listIpamResourceCidrs(ListIpamResourceCidrsRequest request);

    /**
     * @param request the request parameters of ListIpamResourceDiscoveries  ListIpamResourceDiscoveriesRequest
     * @return ListIpamResourceDiscoveriesResponse
     */
    CompletableFuture<ListIpamResourceDiscoveriesResponse> listIpamResourceDiscoveries(ListIpamResourceDiscoveriesRequest request);

    /**
     * @param request the request parameters of ListIpamScopes  ListIpamScopesRequest
     * @return ListIpamScopesResponse
     */
    CompletableFuture<ListIpamScopesResponse> listIpamScopes(ListIpamScopesRequest request);

    /**
     * @param request the request parameters of ListIpams  ListIpamsRequest
     * @return ListIpamsResponse
     */
    CompletableFuture<ListIpamsResponse> listIpams(ListIpamsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of OpenVpcIpamService  OpenVpcIpamServiceRequest
     * @return OpenVpcIpamServiceResponse
     */
    CompletableFuture<OpenVpcIpamServiceResponse> openVpcIpamService(OpenVpcIpamServiceRequest request);

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
     * @param request the request parameters of UpdateIpam  UpdateIpamRequest
     * @return UpdateIpamResponse
     */
    CompletableFuture<UpdateIpamResponse> updateIpam(UpdateIpamRequest request);

    /**
     * @param request the request parameters of UpdateIpamPool  UpdateIpamPoolRequest
     * @return UpdateIpamPoolResponse
     */
    CompletableFuture<UpdateIpamPoolResponse> updateIpamPool(UpdateIpamPoolRequest request);

    /**
     * @param request the request parameters of UpdateIpamPoolAllocation  UpdateIpamPoolAllocationRequest
     * @return UpdateIpamPoolAllocationResponse
     */
    CompletableFuture<UpdateIpamPoolAllocationResponse> updateIpamPoolAllocation(UpdateIpamPoolAllocationRequest request);

    /**
     * @param request the request parameters of UpdateIpamScope  UpdateIpamScopeRequest
     * @return UpdateIpamScopeResponse
     */
    CompletableFuture<UpdateIpamScopeResponse> updateIpamScope(UpdateIpamScopeRequest request);

}
