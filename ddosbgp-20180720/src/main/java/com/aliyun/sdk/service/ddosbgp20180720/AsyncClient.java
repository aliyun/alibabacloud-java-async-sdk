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

    /**
     * @param request the request parameters of AddIp  AddIpRequest
     * @return AddIpResponse
     */
    CompletableFuture<AddIpResponse> addIp(AddIpRequest request);

    /**
     * <b>description</b> :
     * <p>Only a delegated administrator account or the management account of a resource directory can be used to add members to the resource directory.</p>
     * 
     * @param request the request parameters of AddRdMemberList  AddRdMemberListRequest
     * @return AddRdMemberListResponse
     */
    CompletableFuture<AddRdMemberListResponse> addRdMemberList(AddRdMemberListRequest request);

    /**
     * @param request the request parameters of AttachAssetGroupToInstance  AttachAssetGroupToInstanceRequest
     * @return AttachAssetGroupToInstanceResponse
     */
    CompletableFuture<AttachAssetGroupToInstanceResponse> attachAssetGroupToInstance(AttachAssetGroupToInstanceRequest request);

    /**
     * @param request the request parameters of AttachToPolicy  AttachToPolicyRequest
     * @return AttachToPolicyResponse
     */
    CompletableFuture<AttachToPolicyResponse> attachToPolicy(AttachToPolicyRequest request);

    /**
     * @param request the request parameters of CheckAccessLogAuth  CheckAccessLogAuthRequest
     * @return CheckAccessLogAuthResponse
     */
    CompletableFuture<CheckAccessLogAuthResponse> checkAccessLogAuth(CheckAccessLogAuthRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the CheckGrant operation to query whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CheckGrant  CheckGrantRequest
     * @return CheckGrantResponse
     */
    CompletableFuture<CheckGrantResponse> checkGrant(CheckGrantRequest request);

    /**
     * @param request the request parameters of ConfigSchedruleOnDemand  ConfigSchedruleOnDemandRequest
     * @return ConfigSchedruleOnDemandResponse
     */
    CompletableFuture<ConfigSchedruleOnDemandResponse> configSchedruleOnDemand(ConfigSchedruleOnDemandRequest request);

    /**
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * @param request the request parameters of CreateSchedruleOnDemand  CreateSchedruleOnDemandRequest
     * @return CreateSchedruleOnDemandResponse
     */
    CompletableFuture<CreateSchedruleOnDemandResponse> createSchedruleOnDemand(CreateSchedruleOnDemandRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DeleteBlackhole operation to deactivate blackhole filtering for a protected IP address.
     * Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/118701.html">DescribePackIpList</a> operation to query the protection status of the IP addresses that are protected by your Anti-DDoS Origin instance. For example, you can query whether blackhole filtering is triggered for an IP address.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteBlackhole  DeleteBlackholeRequest
     * @return DeleteBlackholeResponse
     */
    CompletableFuture<DeleteBlackholeResponse> deleteBlackhole(DeleteBlackholeRequest request);

    /**
     * <b>description</b> :
     * <p>The Anti-DDoS Origin Enterprise instance no longer protects the IP addresses that are removed.</p>
     * 
     * @param request the request parameters of DeleteIp  DeleteIpRequest
     * @return DeleteIpResponse
     */
    CompletableFuture<DeleteIpResponse> deleteIp(DeleteIpRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot delete a mitigation policy to which a protected object is added.</p>
     * 
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Only a delegated administrator account or the management account of a resource directory can be used to delete members.</p>
     * 
     * @param request the request parameters of DeleteRdMemberList  DeleteRdMemberListRequest
     * @return DeleteRdMemberListResponse
     */
    CompletableFuture<DeleteRdMemberListResponse> deleteRdMemberList(DeleteRdMemberListRequest request);

    /**
     * @param request the request parameters of DeleteSchedruleOnDemand  DeleteSchedruleOnDemandRequest
     * @return DeleteSchedruleOnDemandResponse
     */
    CompletableFuture<DeleteSchedruleOnDemandResponse> deleteSchedruleOnDemand(DeleteSchedruleOnDemandRequest request);

    /**
     * @param request the request parameters of DescribeAssetGroup  DescribeAssetGroupRequest
     * @return DescribeAssetGroupResponse
     */
    CompletableFuture<DescribeAssetGroupResponse> describeAssetGroup(DescribeAssetGroupRequest request);

    /**
     * @param request the request parameters of DescribeAssetGroupToInstance  DescribeAssetGroupToInstanceRequest
     * @return DescribeAssetGroupToInstanceResponse
     */
    CompletableFuture<DescribeAssetGroupToInstanceResponse> describeAssetGroupToInstance(DescribeAssetGroupToInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosEvent operation to query the details about the DDoS attack events that occurred on an Anti-DDoS Origin instance by page. The details include the start time, end time, attacked IP address, and status of each event.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDdosEvent  DescribeDdosEventRequest
     * @return DescribeDdosEventResponse
     */
    CompletableFuture<DescribeDdosEventResponse> describeDdosEvent(DescribeDdosEventRequest request);

    /**
     * @param request the request parameters of DescribeDdosOriginInstanceBill  DescribeDdosOriginInstanceBillRequest
     * @return DescribeDdosOriginInstanceBillResponse
     */
    CompletableFuture<DescribeDdosOriginInstanceBillResponse> describeDdosOriginInstanceBill(DescribeDdosOriginInstanceBillRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call the DescribeExcpetionCount operation to query the number of assets that are in an abnormal state and the number of Anti-DDoS Origin instances that are about to expire in a specific region. For example, if blackhole filtering is triggered for an IP address, the IP address is in an abnormal state. An instance whose remaining validity period is less than seven days is considered as an instance that is about to expire.</p>
     * 
     * @param request the request parameters of DescribeExcpetionCount  DescribeExcpetionCountRequest
     * @return DescribeExcpetionCountResponse
     */
    CompletableFuture<DescribeExcpetionCountResponse> describeExcpetionCount(DescribeExcpetionCountRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeInstanceList operation to query the details of all Anti-DDoS Origin instances within your Alibaba Cloud account by page. The details include the ID, validity period, and status of each instance.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstanceList  DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     */
    CompletableFuture<DescribeInstanceListResponse> describeInstanceList(DescribeInstanceListRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSpecs  DescribeInstanceSpecsRequest
     * @return DescribeInstanceSpecsResponse
     */
    CompletableFuture<DescribeInstanceSpecsResponse> describeInstanceSpecs(DescribeInstanceSpecsRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the details about the DDoS attack events that occurred on the IP address of an anti-DDoS diversion instance of Anti-DDoS Origin by page. The details include the start time, end time, volume of attack traffic, and status of each event.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeOnDemandDdosEvent  DescribeOnDemandDdosEventRequest
     * @return DescribeOnDemandDdosEventResponse
     */
    CompletableFuture<DescribeOnDemandDdosEventResponse> describeOnDemandDdosEvent(DescribeOnDemandDdosEventRequest request);

    /**
     * @param request the request parameters of DescribeOnDemandInstanceStatus  DescribeOnDemandInstanceStatusRequest
     * @return DescribeOnDemandInstanceStatusResponse
     */
    CompletableFuture<DescribeOnDemandInstanceStatusResponse> describeOnDemandInstanceStatus(DescribeOnDemandInstanceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeOpEntities operation to query the operation logs of an instance by page.</p>
     * <h3>Limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeOpEntities  DescribeOpEntitiesRequest
     * @return DescribeOpEntitiesResponse
     */
    CompletableFuture<DescribeOpEntitiesResponse> describeOpEntities(DescribeOpEntitiesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribePackIpList operation to query the details about each IP address that is protected by a specific Anti-DDoS Origin instance by page. The details include the IP address and the type of the cloud asset to which the IP address belongs. The details also include the status of the IP address, such as whether blackhole filtering is triggered for the IP address.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribePackIpList  DescribePackIpListRequest
     * @return DescribePackIpListResponse
     */
    CompletableFuture<DescribePackIpListResponse> describePackIpList(DescribePackIpListRequest request);

    /**
     * @param request the request parameters of DescribeRdMemberList  DescribeRdMemberListRequest
     * @return DescribeRdMemberListResponse
     */
    CompletableFuture<DescribeRdMemberListResponse> describeRdMemberList(DescribeRdMemberListRequest request);

    /**
     * @param request the request parameters of DescribeRdStatus  DescribeRdStatusRequest
     * @return DescribeRdStatusResponse
     */
    CompletableFuture<DescribeRdStatusResponse> describeRdStatus(DescribeRdStatusRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeTraffic operation to query traffic statistics of an Anti-DDoS Origin instance within a specific time period.  </p>
     * <blockquote>
     * <p> When you call this operation, you must configure the <strong>InstanceId</strong> parameter to specify the Anti-DDoS Origin instance whose traffic statistics you want to query.  </p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation once per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeTraffic  DescribeTrafficRequest
     * @return DescribeTrafficResponse
     */
    CompletableFuture<DescribeTrafficResponse> describeTraffic(DescribeTrafficRequest request);

    /**
     * @param request the request parameters of DetachFromPolicy  DetachFromPolicyRequest
     * @return DetachFromPolicyResponse
     */
    CompletableFuture<DetachFromPolicyResponse> detachFromPolicy(DetachFromPolicyRequest request);

    /**
     * @param request the request parameters of DettachAssetGroupToInstance  DettachAssetGroupToInstanceRequest
     * @return DettachAssetGroupToInstanceResponse
     */
    CompletableFuture<DettachAssetGroupToInstanceResponse> dettachAssetGroupToInstance(DettachAssetGroupToInstanceRequest request);

    /**
     * @param request the request parameters of GetSlsOpenStatus  GetSlsOpenStatusRequest
     * @return GetSlsOpenStatusResponse
     */
    CompletableFuture<GetSlsOpenStatusResponse> getSlsOpenStatus(GetSlsOpenStatusRequest request);

    /**
     * @param request the request parameters of ListOpenedAccessLogInstances  ListOpenedAccessLogInstancesRequest
     * @return ListOpenedAccessLogInstancesResponse
     */
    CompletableFuture<ListOpenedAccessLogInstancesResponse> listOpenedAccessLogInstances(ListOpenedAccessLogInstancesRequest request);

    /**
     * @param request the request parameters of ListPolicy  ListPolicyRequest
     * @return ListPolicyResponse
     */
    CompletableFuture<ListPolicyResponse> listPolicy(ListPolicyRequest request);

    /**
     * @param request the request parameters of ListPolicyAttachment  ListPolicyAttachmentRequest
     * @return ListPolicyAttachmentResponse
     */
    CompletableFuture<ListPolicyAttachmentResponse> listPolicyAttachment(ListPolicyAttachmentRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ListTagResources operation to query the tags that are added to Anti-DDoS Origin instances at a time.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this API operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyPolicy  ModifyPolicyRequest
     * @return ModifyPolicyResponse
     */
    CompletableFuture<ModifyPolicyResponse> modifyPolicy(ModifyPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that all request parameters are configured when you call this operation. If any parameter is left empty, the configuration is deleted.</p>
     * 
     * @param request the request parameters of ModifyPolicyContent  ModifyPolicyContentRequest
     * @return ModifyPolicyContentResponse
     */
    CompletableFuture<ModifyPolicyContentResponse> modifyPolicyContent(ModifyPolicyContentRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ModifyRemark operation to add remarks for a single Anti-DDoS Origin instance.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyRemark  ModifyRemarkRequest
     * @return ModifyRemarkResponse
     */
    CompletableFuture<ModifyRemarkResponse> modifyRemark(ModifyRemarkRequest request);

    /**
     * @param request the request parameters of QuerySchedruleOnDemand  QuerySchedruleOnDemandRequest
     * @return QuerySchedruleOnDemandResponse
     */
    CompletableFuture<QuerySchedruleOnDemandResponse> querySchedruleOnDemand(QuerySchedruleOnDemandRequest request);

    /**
     * @param request the request parameters of ReleaseDdosOriginInstance  ReleaseDdosOriginInstanceRequest
     * @return ReleaseDdosOriginInstanceResponse
     */
    CompletableFuture<ReleaseDdosOriginInstanceResponse> releaseDdosOriginInstance(ReleaseDdosOriginInstanceRequest request);

    /**
     * @param request the request parameters of SetInstanceModeOnDemand  SetInstanceModeOnDemandRequest
     * @return SetInstanceModeOnDemandResponse
     */
    CompletableFuture<SetInstanceModeOnDemandResponse> setInstanceModeOnDemand(SetInstanceModeOnDemandRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the TagResources operation to add tags to instances.</p>
     * <h3>Limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
