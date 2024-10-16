// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.iqs20240712.models.*;
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
     * @param request the request parameters of CommonQueryByScene  CommonQueryBySceneRequest
     * @return CommonQueryBySceneResponse
     */
    CompletableFuture<CommonQueryBySceneResponse> commonQueryByScene(CommonQueryBySceneRequest request);

    /**
     * @param request the request parameters of QueryAttractions  QueryAttractionsRequest
     * @return QueryAttractionsResponse
     */
    CompletableFuture<QueryAttractionsResponse> queryAttractions(QueryAttractionsRequest request);

    /**
     * @param request the request parameters of QueryHotels  QueryHotelsRequest
     * @return QueryHotelsResponse
     */
    CompletableFuture<QueryHotelsResponse> queryHotels(QueryHotelsRequest request);

    /**
     * @param request the request parameters of QueryRestaurants  QueryRestaurantsRequest
     * @return QueryRestaurantsResponse
     */
    CompletableFuture<QueryRestaurantsResponse> queryRestaurants(QueryRestaurantsRequest request);

}
