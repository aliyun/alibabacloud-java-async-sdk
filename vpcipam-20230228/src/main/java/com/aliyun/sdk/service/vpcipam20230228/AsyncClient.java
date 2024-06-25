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

    CompletableFuture<AddIpamPoolCidrResponse> addIpamPoolCidr(AddIpamPoolCidrRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CreateIpamResponse> createIpam(CreateIpamRequest request);

    CompletableFuture<CreateIpamPoolResponse> createIpamPool(CreateIpamPoolRequest request);

    CompletableFuture<CreateIpamPoolAllocationResponse> createIpamPoolAllocation(CreateIpamPoolAllocationRequest request);

    CompletableFuture<CreateIpamScopeResponse> createIpamScope(CreateIpamScopeRequest request);

    CompletableFuture<DeleteIpamResponse> deleteIpam(DeleteIpamRequest request);

    CompletableFuture<DeleteIpamPoolResponse> deleteIpamPool(DeleteIpamPoolRequest request);

    CompletableFuture<DeleteIpamPoolAllocationResponse> deleteIpamPoolAllocation(DeleteIpamPoolAllocationRequest request);

    CompletableFuture<DeleteIpamPoolCidrResponse> deleteIpamPoolCidr(DeleteIpamPoolCidrRequest request);

    CompletableFuture<DeleteIpamScopeResponse> deleteIpamScope(DeleteIpamScopeRequest request);

    CompletableFuture<GetVpcIpamServiceStatusResponse> getVpcIpamServiceStatus(GetVpcIpamServiceStatusRequest request);

    CompletableFuture<ListIpamPoolAllocationsResponse> listIpamPoolAllocations(ListIpamPoolAllocationsRequest request);

    CompletableFuture<ListIpamPoolCidrsResponse> listIpamPoolCidrs(ListIpamPoolCidrsRequest request);

    CompletableFuture<ListIpamPoolsResponse> listIpamPools(ListIpamPoolsRequest request);

    CompletableFuture<ListIpamResourceCidrsResponse> listIpamResourceCidrs(ListIpamResourceCidrsRequest request);

    CompletableFuture<ListIpamScopesResponse> listIpamScopes(ListIpamScopesRequest request);

    CompletableFuture<ListIpamsResponse> listIpams(ListIpamsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<OpenVpcIpamServiceResponse> openVpcIpamService(OpenVpcIpamServiceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateIpamResponse> updateIpam(UpdateIpamRequest request);

    CompletableFuture<UpdateIpamPoolResponse> updateIpamPool(UpdateIpamPoolRequest request);

    CompletableFuture<UpdateIpamScopeResponse> updateIpamScope(UpdateIpamScopeRequest request);

}
