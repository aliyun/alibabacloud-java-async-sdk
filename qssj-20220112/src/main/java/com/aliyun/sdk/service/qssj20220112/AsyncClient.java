// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.qssj20220112.models.*;
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

    CompletableFuture<GetAgeDistributionResponse> getAgeDistribution(GetAgeDistributionRequest request);

    CompletableFuture<GetAllTrendCategoryResponse> getAllTrendCategory(GetAllTrendCategoryRequest request);

    CompletableFuture<GetCrowdDataResponse> getCrowdData(GetCrowdDataRequest request);

    CompletableFuture<GetCrowdLabelResponse> getCrowdLabel(GetCrowdLabelRequest request);

    CompletableFuture<GetCrowdReginResponse> getCrowdRegin(GetCrowdReginRequest request);

    CompletableFuture<GetOpportunityMarketResponse> getOpportunityMarket(GetOpportunityMarketRequest request);

    CompletableFuture<GetPriceRangeResponse> getPriceRange(GetPriceRangeRequest request);

    CompletableFuture<GetSexRatioResponse> getSexRatio(GetSexRatioRequest request);

    CompletableFuture<GetStoreSalesVolumeTopResponse> getStoreSalesVolumeTop(GetStoreSalesVolumeTopRequest request);

    CompletableFuture<GetStoreSearchTopResponse> getStoreSearchTop(GetStoreSearchTopRequest request);

    CompletableFuture<GetStyleOnlineResponse> getStyleOnline(GetStyleOnlineRequest request);

    CompletableFuture<GetStyleTopResponse> getStyleTop(GetStyleTopRequest request);

    CompletableFuture<GetTrendImageDetailResponse> getTrendImageDetail(GetTrendImageDetailRequest request);

    CompletableFuture<GetTrendImageListResponse> getTrendImageList(GetTrendImageListRequest request);

    CompletableFuture<GetTrendIndexResponse> getTrendIndex(GetTrendIndexRequest request);

    CompletableFuture<GetTrendSearchRecordResponse> getTrendSearchRecord(GetTrendSearchRecordRequest request);

    CompletableFuture<GetTrendStatisticResponse> getTrendStatistic(GetTrendStatisticRequest request);

    CompletableFuture<GetTrendWordAndIndexResponse> getTrendWordAndIndex(GetTrendWordAndIndexRequest request);

}
