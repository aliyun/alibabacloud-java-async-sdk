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

    /**
      * Each host can have only one account. Before you create an account for a host, make sure that the existing account of the host is deleted. For more information, see [Create an account for a host](~~211413~~).
      *
     */
    CompletableFuture<CreateDedicatedHostAccountResponse> createDedicatedHostAccount(CreateDedicatedHostAccountRequest request);

    CompletableFuture<CreateDedicatedHostGroupResponse> createDedicatedHostGroup(CreateDedicatedHostGroupRequest request);

    CompletableFuture<CreateMyBaseResponse> createMyBase(CreateMyBaseRequest request);

    CompletableFuture<DeleteDedicatedHostAccountResponse> deleteDedicatedHostAccount(DeleteDedicatedHostAccountRequest request);

    /**
      * You can call this operation to delete a dedicated cluster only after all the instances and hosts in the dedicated cluster are deleted.
      *
     */
    CompletableFuture<DeleteDedicatedHostGroupResponse> deleteDedicatedHostGroup(DeleteDedicatedHostGroupRequest request);

    CompletableFuture<DescribeDedicatedHostAttributeResponse> describeDedicatedHostAttribute(DescribeDedicatedHostAttributeRequest request);

    CompletableFuture<DescribeDedicatedHostDisksResponse> describeDedicatedHostDisks(DescribeDedicatedHostDisksRequest request);

    CompletableFuture<DescribeDedicatedHostGroupsResponse> describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request);

    /**
      * After hosts are created in a dedicated cluster, you can query the information about the hosts such as performance metrics, total number of CPU cores, total memory size, and total storage.
      *
     */
    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    /**
      * After a host is created, you can call this operation to query the information about the host specifications, such as the CPU resources, memory resources, CPU model, host category, and storage type.
      *
     */
    CompletableFuture<DescribeHostEcsLevelInfoResponse> describeHostEcsLevelInfo(DescribeHostEcsLevelInfoRequest request);

    /**
      * You can use a webshell to access a host in an ApsaraDB MyBase for MySQL or ApsaraDB MyBase for PostgreSQL dedicated cluster. For more information, see [Use a webshell to access a host](~~205456~~).
      *
     */
    CompletableFuture<DescribeHostWebShellResponse> describeHostWebShell(DescribeHostWebShellRequest request);

    /**
      * For more information about region IDs, see [Region IDs](~~198326~~).
      *
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyDedicatedHostAccountResponse> modifyDedicatedHostAccount(ModifyDedicatedHostAccountRequest request);

    CompletableFuture<ModifyDedicatedHostAttributeResponse> modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request);

    /**
      * After a host is created in a dedicated cluster, you can modify the specifications of the host based on your business requirements. The host specifications include the CPU and memory resources. For more information, see [Upgrade host specifications](~~262822~~).
      * >  When you upgrade the specifications of a host, the host restarts. The database instances that are running on the host also restart. For information about the impacts of a host restart, see [Restart a host](~~141772~~).
      *
     */
    CompletableFuture<ModifyDedicatedHostClassResponse> modifyDedicatedHostClass(ModifyDedicatedHostClassRequest request);

    /**
      * For more information, see [Manage dedicated clusters](~~182328~~).
      *
     */
    CompletableFuture<ModifyDedicatedHostGroupAttributeResponse> modifyDedicatedHostGroupAttribute(ModifyDedicatedHostGroupAttributeRequest request);

    /**
      * This operation is supported only for ApsaraDB MyBase for Redis Enhanced Edition (Tair) dedicated clusters.
      *
     */
    CompletableFuture<ModifyDedicatedHostPasswordResponse> modifyDedicatedHostPassword(ModifyDedicatedHostPasswordRequest request);

    CompletableFuture<QueryHostBaseInfoByInstanceResponse> queryHostBaseInfoByInstance(QueryHostBaseInfoByInstanceRequest request);

    CompletableFuture<QueryHostInstanceConsoleInfoResponse> queryHostInstanceConsoleInfo(QueryHostInstanceConsoleInfoRequest request);

    /**
      * If you specify the manual host replacement policy when you create an ApsaraDB MyBase for MySQL dedicated cluster, you can call this operation to replace a **faulty** host in the dedicated cluster.
      * >  You can call the [DescribeDedicatedHostAttribute](~~213010~~) operation to query the value of the **HostStatus** parameter.
      *
     */
    CompletableFuture<ReplaceDedicatedHostResponse> replaceDedicatedHost(ReplaceDedicatedHostRequest request);

    CompletableFuture<RestartDedicatedHostResponse> restartDedicatedHost(RestartDedicatedHostRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
