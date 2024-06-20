// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddosbgp20180720.models.*;
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

    CompletableFuture<AddIpResponse> addIp(AddIpRequest request);

    CompletableFuture<AddRdMemberListResponse> addRdMemberList(AddRdMemberListRequest request);

    CompletableFuture<AttachAssetGroupToInstanceResponse> attachAssetGroupToInstance(AttachAssetGroupToInstanceRequest request);

    CompletableFuture<CheckAccessLogAuthResponse> checkAccessLogAuth(CheckAccessLogAuthRequest request);

    /**
      * You can call the CheckGrant operation to query whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.
      * ### Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CheckGrantResponse> checkGrant(CheckGrantRequest request);

    CompletableFuture<ConfigSchedruleOnDemandResponse> configSchedruleOnDemand(ConfigSchedruleOnDemandRequest request);

    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

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
      * The Anti-DDoS Origin Enterprise instance no longer protects the IP addresses that are removed.
      *
     */
    CompletableFuture<DeleteIpResponse> deleteIp(DeleteIpRequest request);

    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    CompletableFuture<DeleteRdMemberListResponse> deleteRdMemberList(DeleteRdMemberListRequest request);

    CompletableFuture<DeleteSchedruleOnDemandResponse> deleteSchedruleOnDemand(DeleteSchedruleOnDemandRequest request);

    CompletableFuture<DescribeAssetGroupResponse> describeAssetGroup(DescribeAssetGroupRequest request);

    CompletableFuture<DescribeAssetGroupToInstanceResponse> describeAssetGroupToInstance(DescribeAssetGroupToInstanceRequest request);

    /**
      * You can call the DescribeDdosEvent operation to query the details about the DDoS attack events that occurred on a specific Anti-DDoS Origin instance by page. The details include the start time, end time, attacked IP address, and status of each event.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDdosEventResponse> describeDdosEvent(DescribeDdosEventRequest request);

    CompletableFuture<DescribeDdosOriginInstanceBillResponse> describeDdosOriginInstanceBill(DescribeDdosOriginInstanceBillRequest request);

    /**
      * ## Usage notes
      * You can call the DescribeExcpetionCount operation to query the number of assets that are in an abnormal state and the number of Anti-DDoS Origin instances that are about to expire in a specific region. For example, if blackhole filtering is triggered for an IP address, the IP address is in an abnormal state. An instance whose remaining validity period is less than seven days is considered as an instance that is about to expire.
      *
     */
    CompletableFuture<DescribeExcpetionCountResponse> describeExcpetionCount(DescribeExcpetionCountRequest request);

    /**
      * You can call the DescribeInstanceList operation to query the details of all Anti-DDoS Origin instances within your Alibaba Cloud account by page. The details include the ID, validity period, and status of each instance.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeInstanceListResponse> describeInstanceList(DescribeInstanceListRequest request);

    CompletableFuture<DescribeInstanceSpecsResponse> describeInstanceSpecs(DescribeInstanceSpecsRequest request);

    /**
      * >  Anti-DDoS Origin API operations are available for only Anti-DDoS Origin Enterprise users.
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
      * You can call the DescribePackIpList operation to query the details about each IP address that is protected by a specific Anti-DDoS Origin instance by page. The details include the IP address and the type of the cloud asset to which the IP address belongs. The details also include the status of the IP address, such as whether blackhole filtering is triggered for the IP address.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribePackIpListResponse> describePackIpList(DescribePackIpListRequest request);

    CompletableFuture<DescribeRdMemberListResponse> describeRdMemberList(DescribeRdMemberListRequest request);

    CompletableFuture<DescribeRdStatusResponse> describeRdStatus(DescribeRdStatusRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * You can call the DescribeTraffic operation to query traffic statistics of an Anti-DDoS Origin instance within a specific time period.  
      * >  When you call this operation, you must configure the **InstanceId** parameter to specify the Anti-DDoS Origin instance whose traffic statistics you want to query.  
      * ## Limits
      * You can call this operation once per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeTrafficResponse> describeTraffic(DescribeTrafficRequest request);

    CompletableFuture<DetachFromPolicyResponse> detachFromPolicy(DetachFromPolicyRequest request);

    CompletableFuture<DettachAssetGroupToInstanceResponse> dettachAssetGroupToInstance(DettachAssetGroupToInstanceRequest request);

    CompletableFuture<GetSlsOpenStatusResponse> getSlsOpenStatus(GetSlsOpenStatusRequest request);

    CompletableFuture<ListOpenedAccessLogInstancesResponse> listOpenedAccessLogInstances(ListOpenedAccessLogInstancesRequest request);

    CompletableFuture<ListPolicyResponse> listPolicy(ListPolicyRequest request);

    CompletableFuture<ListPolicyAttachmentResponse> listPolicyAttachment(ListPolicyAttachmentRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
      * You can call the ListTagResources operation to query the tags that are added to Anti-DDoS Origin instances at a time.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyPolicyResponse> modifyPolicy(ModifyPolicyRequest request);

    CompletableFuture<ModifyPolicyContentResponse> modifyPolicyContent(ModifyPolicyContentRequest request);

    /**
      * You can call the ModifyRemark operation to add remarks for a single Anti-DDoS Origin instance.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyRemarkResponse> modifyRemark(ModifyRemarkRequest request);

    CompletableFuture<QuerySchedruleOnDemandResponse> querySchedruleOnDemand(QuerySchedruleOnDemandRequest request);

    CompletableFuture<ReleaseDdosOriginInstanceResponse> releaseDdosOriginInstance(ReleaseDdosOriginInstanceRequest request);

    CompletableFuture<SetInstanceModeOnDemandResponse> setInstanceModeOnDemand(SetInstanceModeOnDemandRequest request);

    /**
      * You can call the TagResources operation to add tags to Anti-DDoS Origin instances. 
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
