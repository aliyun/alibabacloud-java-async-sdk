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

    CompletableFuture<AddResolverEndpointResponse> addResolverEndpoint(AddResolverEndpointRequest request);

    CompletableFuture<AddResolverRuleResponse> addResolverRule(AddResolverRuleRequest request);

    CompletableFuture<AddUserVpcAuthorizationResponse> addUserVpcAuthorization(AddUserVpcAuthorizationRequest request);

    CompletableFuture<AddZoneResponse> addZone(AddZoneRequest request);

    CompletableFuture<AddZoneRecordResponse> addZoneRecord(AddZoneRecordRequest request);

    CompletableFuture<BindResolverRuleVpcResponse> bindResolverRuleVpc(BindResolverRuleVpcRequest request);

    CompletableFuture<BindZoneVpcResponse> bindZoneVpc(BindZoneVpcRequest request);

    CompletableFuture<CheckZoneNameResponse> checkZoneName(CheckZoneNameRequest request);

    CompletableFuture<DeleteResolverEndpointResponse> deleteResolverEndpoint(DeleteResolverEndpointRequest request);

    CompletableFuture<DeleteResolverRuleResponse> deleteResolverRule(DeleteResolverRuleRequest request);

    CompletableFuture<DeleteUserVpcAuthorizationResponse> deleteUserVpcAuthorization(DeleteUserVpcAuthorizationRequest request);

    CompletableFuture<DeleteZoneResponse> deleteZone(DeleteZoneRequest request);

    CompletableFuture<DeleteZoneRecordResponse> deleteZoneRecord(DeleteZoneRecordRequest request);

    CompletableFuture<DescribeChangeLogsResponse> describeChangeLogs(DescribeChangeLogsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRequestGraphResponse> describeRequestGraph(DescribeRequestGraphRequest request);

    CompletableFuture<DescribeResolverAvailableZonesResponse> describeResolverAvailableZones(DescribeResolverAvailableZonesRequest request);

    CompletableFuture<DescribeResolverEndpointResponse> describeResolverEndpoint(DescribeResolverEndpointRequest request);

    CompletableFuture<DescribeResolverEndpointsResponse> describeResolverEndpoints(DescribeResolverEndpointsRequest request);

    CompletableFuture<DescribeResolverRuleResponse> describeResolverRule(DescribeResolverRuleRequest request);

    CompletableFuture<DescribeResolverRulesResponse> describeResolverRules(DescribeResolverRulesRequest request);

    CompletableFuture<DescribeStatisticSummaryResponse> describeStatisticSummary(DescribeStatisticSummaryRequest request);

    CompletableFuture<DescribeSyncEcsHostTaskResponse> describeSyncEcsHostTask(DescribeSyncEcsHostTaskRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeUserVpcAuthorizationsResponse> describeUserVpcAuthorizations(DescribeUserVpcAuthorizationsRequest request);

    CompletableFuture<DescribeZoneInfoResponse> describeZoneInfo(DescribeZoneInfoRequest request);

    CompletableFuture<DescribeZoneRecordsResponse> describeZoneRecords(DescribeZoneRecordsRequest request);

    CompletableFuture<DescribeZoneVpcTreeResponse> describeZoneVpcTree(DescribeZoneVpcTreeRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<SetProxyPatternResponse> setProxyPattern(SetProxyPatternRequest request);

    CompletableFuture<SetZoneRecordStatusResponse> setZoneRecordStatus(SetZoneRecordStatusRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateRecordRemarkResponse> updateRecordRemark(UpdateRecordRemarkRequest request);

    CompletableFuture<UpdateResolverEndpointResponse> updateResolverEndpoint(UpdateResolverEndpointRequest request);

    CompletableFuture<UpdateResolverRuleResponse> updateResolverRule(UpdateResolverRuleRequest request);

    CompletableFuture<UpdateSyncEcsHostTaskResponse> updateSyncEcsHostTask(UpdateSyncEcsHostTaskRequest request);

    CompletableFuture<UpdateZoneRecordResponse> updateZoneRecord(UpdateZoneRecordRequest request);

    CompletableFuture<UpdateZoneRemarkResponse> updateZoneRemark(UpdateZoneRemarkRequest request);

}
