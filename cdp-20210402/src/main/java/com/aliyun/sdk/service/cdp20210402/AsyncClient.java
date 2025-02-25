// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cdp20210402.models.*;
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

    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    CompletableFuture<CheckClusterNameResponse> checkClusterName(CheckClusterNameRequest request);

    CompletableFuture<ConfirmNoticeResponse> confirmNotice(ConfirmNoticeRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<GetClusterDetailResponse> getClusterDetail(GetClusterDetailRequest request);

    CompletableFuture<HasDefaultRoleResponse> hasDefaultRole(HasDefaultRoleRequest request);

    CompletableFuture<InitializeClouderaDataPlatformResponse> initializeClouderaDataPlatform(InitializeClouderaDataPlatformRequest request);

    CompletableFuture<ListDefaultComponentsResponse> listDefaultComponents(ListDefaultComponentsRequest request);

    CompletableFuture<ListNodeGroupConstraintsResponse> listNodeGroupConstraints(ListNodeGroupConstraintsRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListOperationsResponse> listOperations(ListOperationsRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListZonesResponse> listZones(ListZonesRequest request);

    CompletableFuture<QueryOrderResponse> queryOrder(QueryOrderRequest request);

    CompletableFuture<QueryPriceResponse> queryPrice(QueryPriceRequest request);

    CompletableFuture<QueryRenewOrderResponse> queryRenewOrder(QueryRenewOrderRequest request);

    CompletableFuture<QueryRenewPriceResponse> queryRenewPrice(QueryRenewPriceRequest request);

    CompletableFuture<QueryScaleUpOrderResponse> queryScaleUpOrder(QueryScaleUpOrderRequest request);

    CompletableFuture<QueryScaleUpPriceResponse> queryScaleUpPrice(QueryScaleUpPriceRequest request);

    CompletableFuture<ReleaseClusterResponse> releaseCluster(ReleaseClusterRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<ScaleUpClusterResponse> scaleUpCluster(ScaleUpClusterRequest request);

    CompletableFuture<SearchClusterInstancesResponse> searchClusterInstances(SearchClusterInstancesRequest request);

    CompletableFuture<SingleOrderResponse> singleOrder(SingleOrderRequest request);

    CompletableFuture<UpdateClusterNameResponse> updateClusterName(UpdateClusterNameRequest request);

    CompletableFuture<UploadLicenseResponse> uploadLicense(UploadLicenseRequest request);

}
