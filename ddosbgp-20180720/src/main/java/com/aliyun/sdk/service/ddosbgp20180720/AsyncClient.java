// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddosbgp20180720.models.*;
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

    CompletableFuture<CheckAccessLogAuthResponse> checkAccessLogAuth(CheckAccessLogAuthRequest request);

    /**
      * Indicates whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account. Valid values:
      * *   **1**: Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.
      * *   **0**: Anti-DDoS Origin is not authorized to obtain information about the assets within the current Alibaba Cloud account.
      *
     */
    CompletableFuture<CheckGrantResponse> checkGrant(CheckGrantRequest request);

    CompletableFuture<ConfigSchedruleOnDemandResponse> configSchedruleOnDemand(ConfigSchedruleOnDemandRequest request);

    CompletableFuture<CreateSchedruleOnDemandResponse> createSchedruleOnDemand(CreateSchedruleOnDemandRequest request);

    /**
      * You can call the DeleteBlackhole operation to deactivate blackhole filtering for a protected IP address.
      * Before you call this operation, you can call the [DescribePackIpList](~~118701~~) operation to query the protection status of the IP addresses that are protected by your Anti-DDoS Origin instance. For example, you can query whether blackhole filtering is triggered for an IP address.
      * ### Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteBlackholeResponse> deleteBlackhole(DeleteBlackholeRequest request);

    /**
      * The ID of the Anti-DDoS Origin Enterprise instance.
      * >  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin Enterprise instances.
      *
     */
    CompletableFuture<DeleteIpResponse> deleteIp(DeleteIpRequest request);

    CompletableFuture<DeleteSchedruleOnDemandResponse> deleteSchedruleOnDemand(DeleteSchedruleOnDemandRequest request);

    /**
      * The number of entries to return on each page.
      *
     */
    CompletableFuture<DescribeDdosEventResponse> describeDdosEvent(DescribeDdosEventRequest request);

    /**
      * The operation that you want to perform. Set the value to **DescribeExcpetionCount**.
      *
     */
    CompletableFuture<DescribeExcpetionCountResponse> describeExcpetionCount(DescribeExcpetionCountRequest request);

    /**
      * The status of the instance. Valid values:
      * *   **1**: normal
      * *   **2**: expired
      * *   **3**: released
      *
     */
    CompletableFuture<DescribeInstanceListResponse> describeInstanceList(DescribeInstanceListRequest request);

    CompletableFuture<DescribeInstanceSpecsResponse> describeInstanceSpecs(DescribeInstanceSpecsRequest request);

    /**
      * The ID of the resource group.
      *
     */
    CompletableFuture<DescribeOnDemandDdosEventResponse> describeOnDemandDdosEvent(DescribeOnDemandDdosEventRequest request);

    CompletableFuture<DescribeOnDemandInstanceStatusResponse> describeOnDemandInstanceStatus(DescribeOnDemandInstanceStatusRequest request);

    /**
      * The start time. Operation logs that were generated after this time are queried.**** This value is a UNIX timestamp. Unit: milliseconds.
      *
     */
    CompletableFuture<DescribeOpEntitiesResponse> describeOpEntities(DescribeOpEntitiesRequest request);

    /**
      * The number of entries to return on each page.
      *
     */
    CompletableFuture<DescribePackIpListResponse> describePackIpList(DescribePackIpListRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * The bandwidth of attack traffic. Unit: bit/s.
      * >  This parameter is returned only if attack traffic exists.
      *
     */
    CompletableFuture<DescribeTrafficResponse> describeTraffic(DescribeTrafficRequest request);

    CompletableFuture<GetSlsOpenStatusResponse> getSlsOpenStatus(GetSlsOpenStatusRequest request);

    CompletableFuture<ListOpenedAccessLogInstancesResponse> listOpenedAccessLogInstances(ListOpenedAccessLogInstancesRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
      * The ID of the region where the Anti-DDoS Origin instance resides.
      * >  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * The operation that you want to perform. Set the value to **ModifyRemark**.
      *
     */
    CompletableFuture<ModifyRemarkResponse> modifyRemark(ModifyRemarkRequest request);

    CompletableFuture<QuerySchedruleOnDemandResponse> querySchedruleOnDemand(QuerySchedruleOnDemandRequest request);

    CompletableFuture<SetInstanceModeOnDemandResponse> setInstanceModeOnDemand(SetInstanceModeOnDemandRequest request);

    /**
      * The ID of Anti-DDoS Origin Instance N to which you want to add tags.
      * >  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin instances.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
