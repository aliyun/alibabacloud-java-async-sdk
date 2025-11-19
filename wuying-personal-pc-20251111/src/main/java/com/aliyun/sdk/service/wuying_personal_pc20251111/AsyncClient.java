// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.wuying_personal_pc20251111.models.*;
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
     * @param request the request parameters of CreateDesktopImage  CreateDesktopImageRequest
     * @return CreateDesktopImageResponse
     */
    CompletableFuture<CreateDesktopImageResponse> createDesktopImage(CreateDesktopImageRequest request);

    /**
     * @param request the request parameters of CreateOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    /**
     * @param request the request parameters of DeleteDesktop  DeleteDesktopRequest
     * @return DeleteDesktopResponse
     */
    CompletableFuture<DeleteDesktopResponse> deleteDesktop(DeleteDesktopRequest request);

    /**
     * @param request the request parameters of DeleteDesktopImage  DeleteDesktopImageRequest
     * @return DeleteDesktopImageResponse
     */
    CompletableFuture<DeleteDesktopImageResponse> deleteDesktopImage(DeleteDesktopImageRequest request);

    /**
     * @param request the request parameters of DescribeAccessibleImages  DescribeAccessibleImagesRequest
     * @return DescribeAccessibleImagesResponse
     */
    CompletableFuture<DescribeAccessibleImagesResponse> describeAccessibleImages(DescribeAccessibleImagesRequest request);

    /**
     * @param request the request parameters of DescribeCorePackageList  DescribeCorePackageListRequest
     * @return DescribeCorePackageListResponse
     */
    CompletableFuture<DescribeCorePackageListResponse> describeCorePackageList(DescribeCorePackageListRequest request);

    /**
     * @param request the request parameters of DescribeDesktops  DescribeDesktopsRequest
     * @return DescribeDesktopsResponse
     */
    CompletableFuture<DescribeDesktopsResponse> describeDesktops(DescribeDesktopsRequest request);

    /**
     * @param request the request parameters of DescribeImageDetail  DescribeImageDetailRequest
     * @return DescribeImageDetailResponse
     */
    CompletableFuture<DescribeImageDetailResponse> describeImageDetail(DescribeImageDetailRequest request);

    /**
     * @param request the request parameters of DescribePackageOrders  DescribePackageOrdersRequest
     * @return DescribePackageOrdersResponse
     */
    CompletableFuture<DescribePackageOrdersResponse> describePackageOrders(DescribePackageOrdersRequest request);

    /**
     * @param request the request parameters of GenerateWuyingServerSceneUrl  GenerateWuyingServerSceneUrlRequest
     * @return GenerateWuyingServerSceneUrlResponse
     */
    CompletableFuture<GenerateWuyingServerSceneUrlResponse> generateWuyingServerSceneUrl(GenerateWuyingServerSceneUrlRequest request);

    /**
     * @param request the request parameters of GetProductList  GetProductListRequest
     * @return GetProductListResponse
     */
    CompletableFuture<GetProductListResponse> getProductList(GetProductListRequest request);

    /**
     * @param request the request parameters of GetUserInfo  GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

    /**
     * @param request the request parameters of StartDesktop  StartDesktopRequest
     * @return StartDesktopResponse
     */
    CompletableFuture<StartDesktopResponse> startDesktop(StartDesktopRequest request);

    /**
     * @param request the request parameters of StopDesktop  StopDesktopRequest
     * @return StopDesktopResponse
     */
    CompletableFuture<StopDesktopResponse> stopDesktop(StopDesktopRequest request);

}
