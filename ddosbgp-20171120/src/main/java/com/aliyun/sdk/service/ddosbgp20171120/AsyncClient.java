// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddosbgp20171120.models.*;
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

    CompletableFuture<AddIpResponse> addIp(AddIpRequest request);

    CompletableFuture<AddProductResponse> addProduct(AddProductRequest request);

    CompletableFuture<CheckGrantResponse> checkGrant(CheckGrantRequest request);

    CompletableFuture<DeleteBlackholeResponse> deleteBlackhole(DeleteBlackholeRequest request);

    CompletableFuture<DeleteIpResponse> deleteIp(DeleteIpRequest request);

    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    CompletableFuture<DescribeDdosEventResponse> describeDdosEvent(DescribeDdosEventRequest request);

    CompletableFuture<DescribeInstanceListResponse> describeInstanceList(DescribeInstanceListRequest request);

    /**
      * Queries the information about on-demand instances, such as whether an on-demand instance is enabled and the CIDR block of each on-demand instance.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeOnDemandInstanceResponse> describeOnDemandInstance(DescribeOnDemandInstanceRequest request);

    CompletableFuture<DescribeOpEntitiesResponse> describeOpEntities(DescribeOpEntitiesRequest request);

    CompletableFuture<DescribePackResponse> describePack(DescribePackRequest request);

    CompletableFuture<DescribePackListResponse> describePackList(DescribePackListRequest request);

    CompletableFuture<DescribePackPaidTrafficResponse> describePackPaidTraffic(DescribePackPaidTrafficRequest request);

    CompletableFuture<DescribeResourcePackInstancesResponse> describeResourcePackInstances(DescribeResourcePackInstancesRequest request);

    CompletableFuture<DescribeResourcePackStatisticsResponse> describeResourcePackStatistics(DescribeResourcePackStatisticsRequest request);

    CompletableFuture<DescribeResourcePackUsageResponse> describeResourcePackUsage(DescribeResourcePackUsageRequest request);

    /**
      * You can call the DescribeTopTraffic operation to query the top N IP addresses from which the most traffic is forwarded by an on-demand instance within a specific period. 
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeTopTrafficResponse> describeTopTraffic(DescribeTopTrafficRequest request);

    CompletableFuture<DescribeTrafficResponse> describeTraffic(DescribeTrafficRequest request);

    CompletableFuture<ModifyOnDemaondDefenseStatusResponse> modifyOnDemaondDefenseStatus(ModifyOnDemaondDefenseStatusRequest request);

}
