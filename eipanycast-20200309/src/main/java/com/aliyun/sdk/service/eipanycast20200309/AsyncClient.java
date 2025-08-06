// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eipanycast20200309.models.*;
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
     * @param request the request parameters of AllocateAnycastEipAddress  AllocateAnycastEipAddressRequest
     * @return AllocateAnycastEipAddressResponse
     */
    CompletableFuture<AllocateAnycastEipAddressResponse> allocateAnycastEipAddress(AllocateAnycastEipAddressRequest request);

    /**
     * @param request the request parameters of AssociateAnycastEipAddress  AssociateAnycastEipAddressRequest
     * @return AssociateAnycastEipAddressResponse
     */
    CompletableFuture<AssociateAnycastEipAddressResponse> associateAnycastEipAddress(AssociateAnycastEipAddressRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of DescribeAnycastEipAddress  DescribeAnycastEipAddressRequest
     * @return DescribeAnycastEipAddressResponse
     */
    CompletableFuture<DescribeAnycastEipAddressResponse> describeAnycastEipAddress(DescribeAnycastEipAddressRequest request);

    /**
     * @param request the request parameters of DescribeAnycastPopLocations  DescribeAnycastPopLocationsRequest
     * @return DescribeAnycastPopLocationsResponse
     */
    CompletableFuture<DescribeAnycastPopLocationsResponse> describeAnycastPopLocations(DescribeAnycastPopLocationsRequest request);

    /**
     * @param request the request parameters of DescribeAnycastServerRegions  DescribeAnycastServerRegionsRequest
     * @return DescribeAnycastServerRegionsResponse
     */
    CompletableFuture<DescribeAnycastServerRegionsResponse> describeAnycastServerRegions(DescribeAnycastServerRegionsRequest request);

    /**
     * @param request the request parameters of ListAnycastEipAddresses  ListAnycastEipAddressesRequest
     * @return ListAnycastEipAddressesResponse
     */
    CompletableFuture<ListAnycastEipAddressesResponse> listAnycastEipAddresses(ListAnycastEipAddressesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyAnycastEipAddressAttribute  ModifyAnycastEipAddressAttributeRequest
     * @return ModifyAnycastEipAddressAttributeResponse
     */
    CompletableFuture<ModifyAnycastEipAddressAttributeResponse> modifyAnycastEipAddressAttribute(ModifyAnycastEipAddressAttributeRequest request);

    /**
     * @param request the request parameters of ModifyAnycastEipAddressSpec  ModifyAnycastEipAddressSpecRequest
     * @return ModifyAnycastEipAddressSpecResponse
     */
    CompletableFuture<ModifyAnycastEipAddressSpecResponse> modifyAnycastEipAddressSpec(ModifyAnycastEipAddressSpecRequest request);

    /**
     * @param request the request parameters of ReleaseAnycastEipAddress  ReleaseAnycastEipAddressRequest
     * @return ReleaseAnycastEipAddressResponse
     */
    CompletableFuture<ReleaseAnycastEipAddressResponse> releaseAnycastEipAddress(ReleaseAnycastEipAddressRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnassociateAnycastEipAddress  UnassociateAnycastEipAddressRequest
     * @return UnassociateAnycastEipAddressResponse
     */
    CompletableFuture<UnassociateAnycastEipAddressResponse> unassociateAnycastEipAddress(UnassociateAnycastEipAddressRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAnycastEipAddressAssociations  UpdateAnycastEipAddressAssociationsRequest
     * @return UpdateAnycastEipAddressAssociationsResponse
     */
    CompletableFuture<UpdateAnycastEipAddressAssociationsResponse> updateAnycastEipAddressAssociations(UpdateAnycastEipAddressAssociationsRequest request);

}
