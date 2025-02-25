// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rmc20211104;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rmc20211104.models.*;
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
      * This section provides the types of resources that can be queried. Two-way queries are supported. For example, you can query the disks (ACS::ECS::Disk) that are associated with a specific Elastic Compute Service (ECS) instance (ACS::ECS::Instance) or query the ECS instance that is associated with a specific disk.  
      * - For ECS instances, the following types of resources can be queried:    - ACS::ECS::Disk
      *   - ACS::EIP::EipAddress
      *   - ACS::VPC::VPC
      *   - ACS::ECS::KeyPair
      *   - ACS::ECS::SecurityGroup
      *   - ACS::ECS::NetworkInterface
      *   - ACS::ECS::Image
      * - For virtual private clouds (VPCs), which are indicated by ACS::VPC::VPC, the following types of resources can be queried:    - ACS::ECS::Instance
      *   - ACS::RDS::DBInstance
      *   - ACS::SLB::LoadBalancer
      *   - ACS::ALB::LoadBalancer
      *   - ACS::Elasticsearch::Instance
      *   - ACS::Redis::DBInstance
      *   - ACS::PolarDB::DBCluster
      *   - ACS::MongoDB::DBInstance
      *   - ACS::DRDS::PolarDBXInstance
      *   - ACS::EDAS::Cluster
      *   - ACS::ECI::ContainerGroup
      *   - ACS::ADB::DBCluster
      *   - ACS::DRDS::DBInstance
      *   - ACS::HBase::Cluster
      *   - ACS::EMR::Cluster
      * This topic provides an example on how to call the API operation to query the resources that are associated with the ECS instance `i-uf6imlgyr1nudhud****` in the China (Shanghai) region.
      * ## Prerequisites
      * Resource Meta Center (RMC) is enabled. For more information, see [Query resources that belong to different resource groups](~~310198~~).
      * ## QPS limits
      * You can call this API operation up to 20 times per second per account. Requests that exceed this limit will fail, and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
     */
    CompletableFuture<ListResourceRelationshipsResponse> listResourceRelationships(ListResourceRelationshipsRequest request);

    /**
      * For more information about resource types that support RMC, see [Resource types that support RMC](https://www.alibabacloud.com/help/en/resource-management/latest/resource-types-that-support-rmc).  
      * This topic provides an example on how to call the API operation to query the resources that can be accessed within the current account in the China (Hangzhou) region.
      * ## Prerequisites
      * Resource Meta Center (RMC) is enabled. For more information, see [Query resources that belong to different resource groups](~~310198~~).
      * ## QPS limits
      * You can call this API operation up to 20 times per second per account. Requests that exceed this limit will fail, and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
     */
    CompletableFuture<SearchResourcesResponse> searchResources(SearchResourcesRequest request);

}
