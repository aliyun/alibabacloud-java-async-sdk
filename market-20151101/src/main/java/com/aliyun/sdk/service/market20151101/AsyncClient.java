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

    /**
     * @param request the request parameters of ActivateLicense  ActivateLicenseRequest
     * @return ActivateLicenseResponse
     */
    CompletableFuture<ActivateLicenseResponse> activateLicense(ActivateLicenseRequest request);

    /**
     * @param request the request parameters of AutoRenewInstance  AutoRenewInstanceRequest
     * @return AutoRenewInstanceResponse
     */
    CompletableFuture<AutoRenewInstanceResponse> autoRenewInstance(AutoRenewInstanceRequest request);

    /**
     * @param request the request parameters of CreateOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    /**
     * @param request the request parameters of CrossAccountVerifyToken  CrossAccountVerifyTokenRequest
     * @return CrossAccountVerifyTokenResponse
     */
    CompletableFuture<CrossAccountVerifyTokenResponse> crossAccountVerifyToken(CrossAccountVerifyTokenRequest request);

    /**
     * @param request the request parameters of DescribeApiMetering  DescribeApiMeteringRequest
     * @return DescribeApiMeteringResponse
     */
    CompletableFuture<DescribeApiMeteringResponse> describeApiMetering(DescribeApiMeteringRequest request);

    /**
     * @param request the request parameters of DescribeCurrentNodeInfo  DescribeCurrentNodeInfoRequest
     * @return DescribeCurrentNodeInfoResponse
     */
    CompletableFuture<DescribeCurrentNodeInfoResponse> describeCurrentNodeInfo(DescribeCurrentNodeInfoRequest request);

    /**
     * @param request the request parameters of DescribeDistributionProducts  DescribeDistributionProductsRequest
     * @return DescribeDistributionProductsResponse
     */
    CompletableFuture<DescribeDistributionProductsResponse> describeDistributionProducts(DescribeDistributionProductsRequest request);

    /**
     * @param request the request parameters of DescribeDistributionProductsLink  DescribeDistributionProductsLinkRequest
     * @return DescribeDistributionProductsLinkResponse
     */
    CompletableFuture<DescribeDistributionProductsLinkResponse> describeDistributionProductsLink(DescribeDistributionProductsLinkRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeInstanceForIsv  DescribeInstanceForIsvRequest
     * @return DescribeInstanceForIsvResponse
     */
    CompletableFuture<DescribeInstanceForIsvResponse> describeInstanceForIsv(DescribeInstanceForIsvRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeLicense  DescribeLicenseRequest
     * @return DescribeLicenseResponse
     */
    CompletableFuture<DescribeLicenseResponse> describeLicense(DescribeLicenseRequest request);

    /**
     * @param request the request parameters of DescribeOrder  DescribeOrderRequest
     * @return DescribeOrderResponse
     */
    CompletableFuture<DescribeOrderResponse> describeOrder(DescribeOrderRequest request);

    /**
     * @param request the request parameters of DescribeOrderForIsv  DescribeOrderForIsvRequest
     * @return DescribeOrderForIsvResponse
     */
    CompletableFuture<DescribeOrderForIsvResponse> describeOrderForIsv(DescribeOrderForIsvRequest request);

    /**
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
     * @param request the request parameters of DescribeProduct  DescribeProductRequest
     * @return DescribeProductResponse
     */
    CompletableFuture<DescribeProductResponse> describeProduct(DescribeProductRequest request);

    /**
     * @param request the request parameters of DescribeProducts  DescribeProductsRequest
     * @return DescribeProductsResponse
     */
    CompletableFuture<DescribeProductsResponse> describeProducts(DescribeProductsRequest request);

    /**
     * @param request the request parameters of DescribeProjectAttachments  DescribeProjectAttachmentsRequest
     * @return DescribeProjectAttachmentsResponse
     */
    CompletableFuture<DescribeProjectAttachmentsResponse> describeProjectAttachments(DescribeProjectAttachmentsRequest request);

    /**
     * @param request the request parameters of DescribeProjectInfo  DescribeProjectInfoRequest
     * @return DescribeProjectInfoResponse
     */
    CompletableFuture<DescribeProjectInfoResponse> describeProjectInfo(DescribeProjectInfoRequest request);

    /**
     * @param request the request parameters of DescribeProjectMessages  DescribeProjectMessagesRequest
     * @return DescribeProjectMessagesResponse
     */
    CompletableFuture<DescribeProjectMessagesResponse> describeProjectMessages(DescribeProjectMessagesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeProjectNodes  DescribeProjectNodesRequest
     * @return DescribeProjectNodesResponse
     */
    CompletableFuture<DescribeProjectNodesResponse> describeProjectNodes(DescribeProjectNodesRequest request);

    /**
     * @param request the request parameters of DescribeProjectOperateLogs  DescribeProjectOperateLogsRequest
     * @return DescribeProjectOperateLogsResponse
     */
    CompletableFuture<DescribeProjectOperateLogsResponse> describeProjectOperateLogs(DescribeProjectOperateLogsRequest request);

    /**
     * @param request the request parameters of FinishCurrentProjectNode  FinishCurrentProjectNodeRequest
     * @return FinishCurrentProjectNodeResponse
     */
    CompletableFuture<FinishCurrentProjectNodeResponse> finishCurrentProjectNode(FinishCurrentProjectNodeRequest request);

    /**
     * @param request the request parameters of PauseProject  PauseProjectRequest
     * @return PauseProjectResponse
     */
    CompletableFuture<PauseProjectResponse> pauseProject(PauseProjectRequest request);

    /**
     * @param request the request parameters of PushMeteringData  PushMeteringDataRequest
     * @return PushMeteringDataResponse
     */
    CompletableFuture<PushMeteringDataResponse> pushMeteringData(PushMeteringDataRequest request);

    /**
     * @param request the request parameters of ResumeProject  ResumeProjectRequest
     * @return ResumeProjectResponse
     */
    CompletableFuture<ResumeProjectResponse> resumeProject(ResumeProjectRequest request);

    /**
     * @param request the request parameters of RollbackCurrentProjectNode  RollbackCurrentProjectNodeRequest
     * @return RollbackCurrentProjectNodeResponse
     */
    CompletableFuture<RollbackCurrentProjectNodeResponse> rollbackCurrentProjectNode(RollbackCurrentProjectNodeRequest request);

}
