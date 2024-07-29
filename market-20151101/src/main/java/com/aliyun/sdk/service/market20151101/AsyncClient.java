// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.market20151101.models.*;
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

    CompletableFuture<ActivateLicenseResponse> activateLicense(ActivateLicenseRequest request);

    CompletableFuture<AutoRenewInstanceResponse> autoRenewInstance(AutoRenewInstanceRequest request);

    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    CompletableFuture<CrossAccountVerifyTokenResponse> crossAccountVerifyToken(CrossAccountVerifyTokenRequest request);

    CompletableFuture<DescribeApiMeteringResponse> describeApiMetering(DescribeApiMeteringRequest request);

    CompletableFuture<DescribeCurrentNodeInfoResponse> describeCurrentNodeInfo(DescribeCurrentNodeInfoRequest request);

    CompletableFuture<DescribeDistributionProductsResponse> describeDistributionProducts(DescribeDistributionProductsRequest request);

    CompletableFuture<DescribeDistributionProductsLinkResponse> describeDistributionProductsLink(DescribeDistributionProductsLinkRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeLicenseResponse> describeLicense(DescribeLicenseRequest request);

    CompletableFuture<DescribeOrderResponse> describeOrder(DescribeOrderRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribeProductResponse> describeProduct(DescribeProductRequest request);

    CompletableFuture<DescribeProductsResponse> describeProducts(DescribeProductsRequest request);

    CompletableFuture<DescribeProjectAttachmentsResponse> describeProjectAttachments(DescribeProjectAttachmentsRequest request);

    CompletableFuture<DescribeProjectInfoResponse> describeProjectInfo(DescribeProjectInfoRequest request);

    CompletableFuture<DescribeProjectMessagesResponse> describeProjectMessages(DescribeProjectMessagesRequest request);

    /**
      * **
      * **
      *
     */
    CompletableFuture<DescribeProjectNodesResponse> describeProjectNodes(DescribeProjectNodesRequest request);

    CompletableFuture<DescribeProjectOperateLogsResponse> describeProjectOperateLogs(DescribeProjectOperateLogsRequest request);

    CompletableFuture<FinishCurrentProjectNodeResponse> finishCurrentProjectNode(FinishCurrentProjectNodeRequest request);

    CompletableFuture<PauseProjectResponse> pauseProject(PauseProjectRequest request);

    CompletableFuture<PushMeteringDataResponse> pushMeteringData(PushMeteringDataRequest request);

    CompletableFuture<ResumeProjectResponse> resumeProject(ResumeProjectRequest request);

    CompletableFuture<RollbackCurrentProjectNodeResponse> rollbackCurrentProjectNode(RollbackCurrentProjectNodeRequest request);

}
