// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pvtz20180101.models.*;
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
     * @param request the request parameters of AddCustomLine  AddCustomLineRequest
     * @return AddCustomLineResponse
     */
    CompletableFuture<AddCustomLineResponse> addCustomLine(AddCustomLineRequest request);

    /**
     * @param request the request parameters of AddResolverEndpoint  AddResolverEndpointRequest
     * @return AddResolverEndpointResponse
     */
    CompletableFuture<AddResolverEndpointResponse> addResolverEndpoint(AddResolverEndpointRequest request);

    /**
     * <b>description</b> :
     * <h4><a href="#"></a><strong>Precautions</strong></h4>
     * <p>If a virtual private cloud (VPC) serves as both an inbound VPC and an outbound VPC, the IP addresses of external Domain Name System (DNS) servers cannot be the same as the IP addresses of the inbound endpoint in the VPC. The IP addresses of the external DNS servers are specified in the forwarding rule associated with the outbound endpoint in the same VPC. If the IP addresses are the same, the DNS requests sent from the IP addresses of the inbound endpoint are returned to the VPC. This results in resolution failures.</p>
     * 
     * @param request the request parameters of AddResolverRule  AddResolverRuleRequest
     * @return AddResolverRuleResponse
     */
    CompletableFuture<AddResolverRuleResponse> addResolverRule(AddResolverRuleRequest request);

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <ul>
     * <li>You can set an effective scope across accounts only by using an Alibaba Cloud account instead of a RAM user. You can set an effective scope across accounts registered on the same site. For example, you can perform the operation across accounts that are both registered on the Alibaba Cloud China site or Alibaba Cloud international site. You cannot set an effective scope across accounts registered on different sites. For example, you cannot perform the operation across accounts that are separately registered on the Alibaba Cloud China site and Alibaba Cloud international site.</li>
     * <li>No API operation is provided for sending the verification codes that are required for authorization.</li>
     * </ul>
     * <h4><strong>Precautions</strong></h4>
     * <p>If you set an effective scope across accounts, bills are settled within the account that is used to perform routine management on built-in authoritative zones.</p>
     * 
     * @param request the request parameters of AddUserVpcAuthorization  AddUserVpcAuthorizationRequest
     * @return AddUserVpcAuthorizationResponse
     */
    CompletableFuture<AddUserVpcAuthorizationResponse> addUserVpcAuthorization(AddUserVpcAuthorizationRequest request);

    /**
     * @param request the request parameters of AddZone  AddZoneRequest
     * @return AddZoneResponse
     */
    CompletableFuture<AddZoneResponse> addZone(AddZoneRequest request);

    /**
     * @param request the request parameters of AddZoneRecord  AddZoneRecordRequest
     * @return AddZoneRecordResponse
     */
    CompletableFuture<AddZoneRecordResponse> addZoneRecord(AddZoneRecordRequest request);

    /**
     * @param request the request parameters of BindResolverRuleVpc  BindResolverRuleVpcRequest
     * @return BindResolverRuleVpcResponse
     */
    CompletableFuture<BindResolverRuleVpcResponse> bindResolverRuleVpc(BindResolverRuleVpcRequest request);

    /**
     * <b>description</b> :
     * <h5><a href="#"></a>Precautions:</h5>
     * <p>We recommend that you set the effective scope of a zone after you configure all Domain Name System (DNS) records. If you set an effective scope before you configure DNS records, the DNS resolution for the zone within the effective scope will fail unless you enable the recursive resolution proxy for subdomain names.</p>
     * 
     * @param request the request parameters of BindZoneVpc  BindZoneVpcRequest
     * @return BindZoneVpcResponse
     */
    CompletableFuture<BindZoneVpcResponse> bindZoneVpc(BindZoneVpcRequest request);

    /**
     * @param request the request parameters of ChangeZoneDnsGroup  ChangeZoneDnsGroupRequest
     * @return ChangeZoneDnsGroupResponse
     */
    CompletableFuture<ChangeZoneDnsGroupResponse> changeZoneDnsGroup(ChangeZoneDnsGroupRequest request);

    /**
     * @param request the request parameters of CheckZoneName  CheckZoneNameRequest
     * @return CheckZoneNameResponse
     */
    CompletableFuture<CheckZoneNameResponse> checkZoneName(CheckZoneNameRequest request);

    /**
     * @param request the request parameters of DeleteCustomLine  DeleteCustomLineRequest
     * @return DeleteCustomLineResponse
     */
    CompletableFuture<DeleteCustomLineResponse> deleteCustomLine(DeleteCustomLineRequest request);

    /**
     * @param request the request parameters of DeleteResolverEndpoint  DeleteResolverEndpointRequest
     * @return DeleteResolverEndpointResponse
     */
    CompletableFuture<DeleteResolverEndpointResponse> deleteResolverEndpoint(DeleteResolverEndpointRequest request);

    /**
     * @param request the request parameters of DeleteResolverRule  DeleteResolverRuleRequest
     * @return DeleteResolverRuleResponse
     */
    CompletableFuture<DeleteResolverRuleResponse> deleteResolverRule(DeleteResolverRuleRequest request);

    /**
     * @param request the request parameters of DeleteUserVpcAuthorization  DeleteUserVpcAuthorizationRequest
     * @return DeleteUserVpcAuthorizationResponse
     */
    CompletableFuture<DeleteUserVpcAuthorizationResponse> deleteUserVpcAuthorization(DeleteUserVpcAuthorizationRequest request);

    /**
     * <b>description</b> :
     * <h4><a href="#"></a>Precautions</h4>
     * <p>If you want to delete a built-in authoritative zone whose effective scope is configured, you must disassociate the zone from the effective scope first.</p>
     * 
     * @param request the request parameters of DeleteZone  DeleteZoneRequest
     * @return DeleteZoneResponse
     */
    CompletableFuture<DeleteZoneResponse> deleteZone(DeleteZoneRequest request);

    /**
     * <b>description</b> :
     * <h4><strong>Precautions</strong></h4>
     * <p>Deleted DNS records cannot be restored. Exercise caution when you perform this operation.</p>
     * 
     * @param request the request parameters of DeleteZoneRecord  DeleteZoneRecordRequest
     * @return DeleteZoneRecordResponse
     */
    CompletableFuture<DeleteZoneRecordResponse> deleteZoneRecord(DeleteZoneRecordRequest request);

    /**
     * <b>description</b> :
     * <h4><strong>Precautions</strong></h4>
     * <p>You can query the operation logs of Private DNS that are generated within the last six months.</p>
     * 
     * @param request the request parameters of DescribeChangeLogs  DescribeChangeLogsRequest
     * @return DescribeChangeLogsResponse
     */
    CompletableFuture<DescribeChangeLogsResponse> describeChangeLogs(DescribeChangeLogsRequest request);

    /**
     * @param request the request parameters of DescribeCustomLineInfo  DescribeCustomLineInfoRequest
     * @return DescribeCustomLineInfoResponse
     */
    CompletableFuture<DescribeCustomLineInfoResponse> describeCustomLineInfo(DescribeCustomLineInfoRequest request);

    /**
     * @param request the request parameters of DescribeCustomLines  DescribeCustomLinesRequest
     * @return DescribeCustomLinesResponse
     */
    CompletableFuture<DescribeCustomLinesResponse> describeCustomLines(DescribeCustomLinesRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRequestGraph  DescribeRequestGraphRequest
     * @return DescribeRequestGraphResponse
     */
    CompletableFuture<DescribeRequestGraphResponse> describeRequestGraph(DescribeRequestGraphRequest request);

    /**
     * @param request the request parameters of DescribeResolverAvailableZones  DescribeResolverAvailableZonesRequest
     * @return DescribeResolverAvailableZonesResponse
     */
    CompletableFuture<DescribeResolverAvailableZonesResponse> describeResolverAvailableZones(DescribeResolverAvailableZonesRequest request);

    /**
     * @param request the request parameters of DescribeResolverEndpoint  DescribeResolverEndpointRequest
     * @return DescribeResolverEndpointResponse
     */
    CompletableFuture<DescribeResolverEndpointResponse> describeResolverEndpoint(DescribeResolverEndpointRequest request);

    /**
     * @param request the request parameters of DescribeResolverEndpoints  DescribeResolverEndpointsRequest
     * @return DescribeResolverEndpointsResponse
     */
    CompletableFuture<DescribeResolverEndpointsResponse> describeResolverEndpoints(DescribeResolverEndpointsRequest request);

    /**
     * @param request the request parameters of DescribeResolverRule  DescribeResolverRuleRequest
     * @return DescribeResolverRuleResponse
     */
    CompletableFuture<DescribeResolverRuleResponse> describeResolverRule(DescribeResolverRuleRequest request);

    /**
     * @param request the request parameters of DescribeResolverRules  DescribeResolverRulesRequest
     * @return DescribeResolverRulesResponse
     */
    CompletableFuture<DescribeResolverRulesResponse> describeResolverRules(DescribeResolverRulesRequest request);

    /**
     * @param request the request parameters of DescribeStatisticSummary  DescribeStatisticSummaryRequest
     * @return DescribeStatisticSummaryResponse
     */
    CompletableFuture<DescribeStatisticSummaryResponse> describeStatisticSummary(DescribeStatisticSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeSyncEcsHostTask operation to query the information about a hostname synchronization task based on a zone ID.</p>
     * 
     * @param request the request parameters of DescribeSyncEcsHostTask  DescribeSyncEcsHostTaskRequest
     * @return DescribeSyncEcsHostTaskResponse
     */
    CompletableFuture<DescribeSyncEcsHostTaskResponse> describeSyncEcsHostTask(DescribeSyncEcsHostTaskRequest request);

    /**
     * <b>description</b> :
     * <h4><strong>Precautions</strong></h4>
     * <p>You can call this API operation to query the information about tags added only to zones.</p>
     * 
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * @param request the request parameters of DescribeUserServiceStatus  DescribeUserServiceStatusRequest
     * @return DescribeUserServiceStatusResponse
     */
    CompletableFuture<DescribeUserServiceStatusResponse> describeUserServiceStatus(DescribeUserServiceStatusRequest request);

    /**
     * @param request the request parameters of DescribeUserVpcAuthorizations  DescribeUserVpcAuthorizationsRequest
     * @return DescribeUserVpcAuthorizationsResponse
     */
    CompletableFuture<DescribeUserVpcAuthorizationsResponse> describeUserVpcAuthorizations(DescribeUserVpcAuthorizationsRequest request);

    /**
     * @param request the request parameters of DescribeZoneInfo  DescribeZoneInfoRequest
     * @return DescribeZoneInfoResponse
     */
    CompletableFuture<DescribeZoneInfoResponse> describeZoneInfo(DescribeZoneInfoRequest request);

    /**
     * @param request the request parameters of DescribeZoneRecord  DescribeZoneRecordRequest
     * @return DescribeZoneRecordResponse
     */
    CompletableFuture<DescribeZoneRecordResponse> describeZoneRecord(DescribeZoneRecordRequest request);

    /**
     * @param request the request parameters of DescribeZoneRecords  DescribeZoneRecordsRequest
     * @return DescribeZoneRecordsResponse
     */
    CompletableFuture<DescribeZoneRecordsResponse> describeZoneRecords(DescribeZoneRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call this API operation due to its poor performance. Instead, you can call the DescribeZones operation to query a list of zones. If you want to query the information about VPCs with which a zone is associated, you can call the DescribeZoneInfo operation based on the zone ID.</p>
     * 
     * @param request the request parameters of DescribeZoneVpcTree  DescribeZoneVpcTreeRequest
     * @return DescribeZoneVpcTreeResponse
     */
    CompletableFuture<DescribeZoneVpcTreeResponse> describeZoneVpcTree(DescribeZoneVpcTreeRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * <b>description</b> :
     * <h4><a href="#"></a><strong>Precautions</strong></h4>
     * <p>You can call this API operation to query tags added only to zones.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h4><a href="#"></a>Precautions</h4>
     * <p>You can call this API operation to change a resource group only for a zone.</p>
     * 
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * @param request the request parameters of SearchCustomLines  SearchCustomLinesRequest
     * @return SearchCustomLinesResponse
     */
    CompletableFuture<SearchCustomLinesResponse> searchCustomLines(SearchCustomLinesRequest request);

    /**
     * @param request the request parameters of SetProxyPattern  SetProxyPatternRequest
     * @return SetProxyPatternResponse
     */
    CompletableFuture<SetProxyPatternResponse> setProxyPattern(SetProxyPatternRequest request);

    /**
     * @param request the request parameters of SetZoneRecordStatus  SetZoneRecordStatusRequest
     * @return SetZoneRecordStatusResponse
     */
    CompletableFuture<SetZoneRecordStatusResponse> setZoneRecordStatus(SetZoneRecordStatusRequest request);

    /**
     * <b>description</b> :
     * <h5><a href="#"></a>Precautions</h5>
     * <p>You can configure tags only for zones.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h4><a href="#"></a><strong>Precautions</strong></h4>
     * <p>You can call this API operation to remove tags added only to zones.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateCustomLine  UpdateCustomLineRequest
     * @return UpdateCustomLineResponse
     */
    CompletableFuture<UpdateCustomLineResponse> updateCustomLine(UpdateCustomLineRequest request);

    /**
     * @param request the request parameters of UpdateRecordRemark  UpdateRecordRemarkRequest
     * @return UpdateRecordRemarkResponse
     */
    CompletableFuture<UpdateRecordRemarkResponse> updateRecordRemark(UpdateRecordRemarkRequest request);

    /**
     * @param request the request parameters of UpdateResolverEndpoint  UpdateResolverEndpointRequest
     * @return UpdateResolverEndpointResponse
     */
    CompletableFuture<UpdateResolverEndpointResponse> updateResolverEndpoint(UpdateResolverEndpointRequest request);

    /**
     * @param request the request parameters of UpdateResolverRule  UpdateResolverRuleRequest
     * @return UpdateResolverRuleResponse
     */
    CompletableFuture<UpdateResolverRuleResponse> updateResolverRule(UpdateResolverRuleRequest request);

    /**
     * @param request the request parameters of UpdateSyncEcsHostTask  UpdateSyncEcsHostTaskRequest
     * @return UpdateSyncEcsHostTaskResponse
     */
    CompletableFuture<UpdateSyncEcsHostTaskResponse> updateSyncEcsHostTask(UpdateSyncEcsHostTaskRequest request);

    /**
     * <b>description</b> :
     * <h4><strong>Precautions</strong></h4>
     * <p>The DNS record modification for a zone in the regular module takes effect only after the time to live (TTL) expires. The DNS record modification for a zone in the acceleration module takes effect immediately.</p>
     * 
     * @param request the request parameters of UpdateZoneRecord  UpdateZoneRecordRequest
     * @return UpdateZoneRecordResponse
     */
    CompletableFuture<UpdateZoneRecordResponse> updateZoneRecord(UpdateZoneRecordRequest request);

    /**
     * @param request the request parameters of UpdateZoneRemark  UpdateZoneRemarkRequest
     * @return UpdateZoneRemarkResponse
     */
    CompletableFuture<UpdateZoneRemarkResponse> updateZoneRemark(UpdateZoneRemarkRequest request);

}
