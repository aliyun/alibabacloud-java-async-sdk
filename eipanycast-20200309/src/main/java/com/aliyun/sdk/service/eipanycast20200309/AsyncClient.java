// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eipanycast20200309.models.*;
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

    CompletableFuture<AllocateAnycastEipAddressResponse> allocateAnycastEipAddress(AllocateAnycastEipAddressRequest request);

    CompletableFuture<AssociateAnycastEipAddressResponse> associateAnycastEipAddress(AssociateAnycastEipAddressRequest request);

    CompletableFuture<DescribeAnycastEipAddressResponse> describeAnycastEipAddress(DescribeAnycastEipAddressRequest request);

    CompletableFuture<DescribeAnycastPopLocationsResponse> describeAnycastPopLocations(DescribeAnycastPopLocationsRequest request);

    CompletableFuture<DescribeAnycastServerRegionsResponse> describeAnycastServerRegions(DescribeAnycastServerRegionsRequest request);

    CompletableFuture<ListAnycastEipAddressesResponse> listAnycastEipAddresses(ListAnycastEipAddressesRequest request);

    CompletableFuture<ModifyAnycastEipAddressAttributeResponse> modifyAnycastEipAddressAttribute(ModifyAnycastEipAddressAttributeRequest request);

    CompletableFuture<ModifyAnycastEipAddressSpecResponse> modifyAnycastEipAddressSpec(ModifyAnycastEipAddressSpecRequest request);

    CompletableFuture<ReleaseAnycastEipAddressResponse> releaseAnycastEipAddress(ReleaseAnycastEipAddressRequest request);

    CompletableFuture<UnassociateAnycastEipAddressResponse> unassociateAnycastEipAddress(UnassociateAnycastEipAddressRequest request);

    CompletableFuture<UpdateAnycastEipAddressAssociationsResponse> updateAnycastEipAddressAssociations(UpdateAnycastEipAddressAssociationsRequest request);

}
