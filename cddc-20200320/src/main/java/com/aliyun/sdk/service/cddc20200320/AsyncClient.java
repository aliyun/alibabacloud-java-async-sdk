// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cddc20200320.models.*;
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

    CompletableFuture<CreateDedicatedHostResponse> createDedicatedHost(CreateDedicatedHostRequest request);

    CompletableFuture<CreateDedicatedHostAccountResponse> createDedicatedHostAccount(CreateDedicatedHostAccountRequest request);

    CompletableFuture<CreateDedicatedHostGroupResponse> createDedicatedHostGroup(CreateDedicatedHostGroupRequest request);

    CompletableFuture<CreateMyBaseResponse> createMyBase(CreateMyBaseRequest request);

    CompletableFuture<DeleteDedicatedHostAccountResponse> deleteDedicatedHostAccount(DeleteDedicatedHostAccountRequest request);

    CompletableFuture<DeleteDedicatedHostGroupResponse> deleteDedicatedHostGroup(DeleteDedicatedHostGroupRequest request);

    CompletableFuture<DescribeDedicatedHostAttributeResponse> describeDedicatedHostAttribute(DescribeDedicatedHostAttributeRequest request);

    CompletableFuture<DescribeDedicatedHostDisksResponse> describeDedicatedHostDisks(DescribeDedicatedHostDisksRequest request);

    CompletableFuture<DescribeDedicatedHostGroupsResponse> describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request);

    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    CompletableFuture<DescribeHostEcsLevelInfoResponse> describeHostEcsLevelInfo(DescribeHostEcsLevelInfoRequest request);

    CompletableFuture<DescribeHostSecurityGroupAttributeResponse> describeHostSecurityGroupAttribute(DescribeHostSecurityGroupAttributeRequest request);

    CompletableFuture<DescribeHostWebShellResponse> describeHostWebShell(DescribeHostWebShellRequest request);

    CompletableFuture<DescribeMyBaseHostOverViewResponse> describeMyBaseHostOverView(DescribeMyBaseHostOverViewRequest request);

    CompletableFuture<DescribeMyBaseInstanceOverViewResponse> describeMyBaseInstanceOverView(DescribeMyBaseInstanceOverViewRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyDedicatedHostAccountResponse> modifyDedicatedHostAccount(ModifyDedicatedHostAccountRequest request);

    CompletableFuture<ModifyDedicatedHostAttributeResponse> modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request);

    CompletableFuture<ModifyDedicatedHostClassResponse> modifyDedicatedHostClass(ModifyDedicatedHostClassRequest request);

    CompletableFuture<ModifyDedicatedHostGroupAttributeResponse> modifyDedicatedHostGroupAttribute(ModifyDedicatedHostGroupAttributeRequest request);

    CompletableFuture<ModifyDedicatedHostPasswordResponse> modifyDedicatedHostPassword(ModifyDedicatedHostPasswordRequest request);

    CompletableFuture<QueryHostBaseInfoByInstanceResponse> queryHostBaseInfoByInstance(QueryHostBaseInfoByInstanceRequest request);

    CompletableFuture<QueryHostInstanceConsoleInfoResponse> queryHostInstanceConsoleInfo(QueryHostInstanceConsoleInfoRequest request);

    CompletableFuture<ReplaceDedicatedHostResponse> replaceDedicatedHost(ReplaceDedicatedHostRequest request);

    CompletableFuture<RestartDedicatedHostResponse> restartDedicatedHost(RestartDedicatedHostRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<ListResponse> list(ListRequest request);

    CompletableFuture<TagResponse> tag(TagRequest request);

    CompletableFuture<UntagResponse> untag(UntagRequest request);

}
