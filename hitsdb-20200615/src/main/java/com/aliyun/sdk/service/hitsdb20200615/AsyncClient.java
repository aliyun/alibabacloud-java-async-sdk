// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hitsdb20200615.models.*;
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

    CompletableFuture<CreateLdpsComputeGroupResponse> createLdpsComputeGroup(CreateLdpsComputeGroupRequest request);

    CompletableFuture<CreateLdpsNamespaceResponse> createLdpsNamespace(CreateLdpsNamespaceRequest request);

    /**
      * You must select at least one engine when you create a Lindorm instance. For more information about how to select the storage type and engine type when you create a Lindorm instance, see [Select engine types](~~181971~~) and [Select storage types](~~174643~~).
      *
     */
    CompletableFuture<CreateLindormInstanceResponse> createLindormInstance(CreateLindormInstanceRequest request);

    CompletableFuture<DeleteLdpsComputeGroupResponse> deleteLdpsComputeGroup(DeleteLdpsComputeGroupRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<GetClientSourceIpResponse> getClientSourceIp(GetClientSourceIpRequest request);

    CompletableFuture<GetEngineDefaultAuthResponse> getEngineDefaultAuth(GetEngineDefaultAuthRequest request);

    CompletableFuture<GetInstanceIpWhiteListResponse> getInstanceIpWhiteList(GetInstanceIpWhiteListRequest request);

    CompletableFuture<GetInstanceSecurityGroupsResponse> getInstanceSecurityGroups(GetInstanceSecurityGroupsRequest request);

    CompletableFuture<GetLdpsComputeGroupResponse> getLdpsComputeGroup(GetLdpsComputeGroupRequest request);

    CompletableFuture<GetLdpsNamespacedQuotaResponse> getLdpsNamespacedQuota(GetLdpsNamespacedQuotaRequest request);

    CompletableFuture<GetLdpsResourceCostResponse> getLdpsResourceCost(GetLdpsResourceCostRequest request);

    CompletableFuture<GetLindormInstanceResponse> getLindormInstance(GetLindormInstanceRequest request);

    CompletableFuture<GetLindormInstanceEngineListResponse> getLindormInstanceEngineList(GetLindormInstanceEngineListRequest request);

    CompletableFuture<GetLindormInstanceListResponse> getLindormInstanceList(GetLindormInstanceListRequest request);

    CompletableFuture<ListLdpsComputeGroupsResponse> listLdpsComputeGroups(ListLdpsComputeGroupsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * You can call this operation to change the billing method of an instance to subscription or pay-as-you-go.
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.aliyun.com/price/product?spm=openapi-amp.newDocPublishment.0.0.6345281fu63xJ3#/hitsdb/detail/hitsdb_lindormpre_public_cn) of Lindorm.
      *
     */
    CompletableFuture<ModifyInstancePayTypeResponse> modifyInstancePayType(ModifyInstancePayTypeRequest request);

    CompletableFuture<OpenComputeEngineResponse> openComputeEngine(OpenComputeEngineRequest request);

    CompletableFuture<OpenComputePreCheckResponse> openComputePreCheck(OpenComputePreCheckRequest request);

    CompletableFuture<ReleaseLindormInstanceResponse> releaseLindormInstance(ReleaseLindormInstanceRequest request);

    /**
      * You can call this operation to renew a subscription Lindorm instance for 1 to 9 months or 1 to 3 years.
      * Before you call this operation, make sure that you fully understand the billing methods and pricing of Lindorm.
      *
     */
    CompletableFuture<RenewLindormInstanceResponse> renewLindormInstance(RenewLindormInstanceRequest request);

    CompletableFuture<RestartLdpsComputeGroupResponse> restartLdpsComputeGroup(RestartLdpsComputeGroupRequest request);

    /**
      * Prerequisites
      * *   The LindormTable version of your instance is 2.6.0 or later.
      * *   The LindormTable of your instance supports LindormSQL V3. The value of the EnableLsqlVersionV3 parameter in the response of the GetLindormInstance operation is true for Lindorm instances purchased after Oct 24, 2023, which indicates that LindormSQL is supported by these instances by default. If you want to enable LindormSQL for instances purchased before Oct 24, 2023, contact the on-duty technical support.
      * You can enable the MySQL compatibility feature for a Lindorm instance only when the instance meets the preceding requirements.
      *
     */
    CompletableFuture<SwitchLSQLV3MySQLServiceResponse> switchLSQLV3MySQLService(SwitchLSQLV3MySQLServiceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * If a tag is not added to any Lindorm instance, it is deleted.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateInstanceIpWhiteListResponse> updateInstanceIpWhiteList(UpdateInstanceIpWhiteListRequest request);

    CompletableFuture<UpdateInstanceSecurityGroupsResponse> updateInstanceSecurityGroups(UpdateInstanceSecurityGroupsRequest request);

    CompletableFuture<UpdateLdpsComputeGroupResponse> updateLdpsComputeGroup(UpdateLdpsComputeGroupRequest request);

    /**
      * For more information about how to select the storage type and engine type when you create a Lindorm instance, see [Select engine typpes](~~181971~~) and [Select storage types](~~174643~~).
      *
     */
    CompletableFuture<UpgradeLindormInstanceResponse> upgradeLindormInstance(UpgradeLindormInstanceRequest request);

}
