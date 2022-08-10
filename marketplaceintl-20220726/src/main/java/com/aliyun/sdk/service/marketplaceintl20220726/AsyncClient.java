// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.marketplaceintl20220726.models.*;
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

    CompletableFuture<AddIntlImageProductVersionResponse> addIntlImageProductVersion(AddIntlImageProductVersionRequest request);

    CompletableFuture<CreateOrUpdateIntlImageResponse> createOrUpdateIntlImage(CreateOrUpdateIntlImageRequest request);

    CompletableFuture<DescribeAccessibleRegionsResponse> describeAccessibleRegions(DescribeAccessibleRegionsRequest request);

    CompletableFuture<DescribeCategoriesResponse> describeCategories(DescribeCategoriesRequest request);

    CompletableFuture<DescribeCountriesResponse> describeCountries(DescribeCountriesRequest request);

    CompletableFuture<DescribeCustomImagesResponse> describeCustomImages(DescribeCustomImagesRequest request);

    CompletableFuture<DescribeImageCommodityInfoResponse> describeImageCommodityInfo(DescribeImageCommodityInfoRequest request);

    CompletableFuture<DescribeImageCommodityStatusResponse> describeImageCommodityStatus(DescribeImageCommodityStatusRequest request);

    CompletableFuture<DescribeImageConstraintsResponse> describeImageConstraints(DescribeImageConstraintsRequest request);

    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    CompletableFuture<DescribeListResourcesResponse> describeListResources(DescribeListResourcesRequest request);

    CompletableFuture<DescribeReleasableRegionListResponse> describeReleasableRegionList(DescribeReleasableRegionListRequest request);

    CompletableFuture<SubmitImageCommodityReviewResponse> submitImageCommodityReview(SubmitImageCommodityReviewRequest request);

}
