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
     * @param request the request parameters of BicyclingDirectionNova  BicyclingDirectionNovaRequest
     * @return BicyclingDirectionNovaResponse
     */
    CompletableFuture<BicyclingDirectionNovaResponse> bicyclingDirectionNova(BicyclingDirectionNovaRequest request);

    /**
     * @param request the request parameters of CommonQueryByScene  CommonQueryBySceneRequest
     * @return CommonQueryBySceneResponse
     */
    CompletableFuture<CommonQueryBySceneResponse> commonQueryByScene(CommonQueryBySceneRequest request);

    /**
     * @param request the request parameters of DrivingDirectionNova  DrivingDirectionNovaRequest
     * @return DrivingDirectionNovaResponse
     */
    CompletableFuture<DrivingDirectionNovaResponse> drivingDirectionNova(DrivingDirectionNovaRequest request);

    /**
     * @param request the request parameters of ElectrobikeDirectionNova  ElectrobikeDirectionNovaRequest
     * @return ElectrobikeDirectionNovaResponse
     */
    CompletableFuture<ElectrobikeDirectionNovaResponse> electrobikeDirectionNova(ElectrobikeDirectionNovaRequest request);

    /**
     * @param request the request parameters of GeoCode  GeoCodeRequest
     * @return GeoCodeResponse
     */
    CompletableFuture<GeoCodeResponse> geoCode(GeoCodeRequest request);

    /**
     * @param request the request parameters of NearbySearch  NearbySearchRequest
     * @return NearbySearchResponse
     */
    CompletableFuture<NearbySearchResponse> nearbySearch(NearbySearchRequest request);

    /**
     * @param request the request parameters of NearbySearchNova  NearbySearchNovaRequest
     * @return NearbySearchNovaResponse
     */
    CompletableFuture<NearbySearchNovaResponse> nearbySearchNova(NearbySearchNovaRequest request);

    /**
     * @param request the request parameters of PlaceSearch  PlaceSearchRequest
     * @return PlaceSearchResponse
     */
    CompletableFuture<PlaceSearchResponse> placeSearch(PlaceSearchRequest request);

    /**
     * @param request the request parameters of PlaceSearchNova  PlaceSearchNovaRequest
     * @return PlaceSearchNovaResponse
     */
    CompletableFuture<PlaceSearchNovaResponse> placeSearchNova(PlaceSearchNovaRequest request);

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

    /**
     * @param request the request parameters of RgeoCode  RgeoCodeRequest
     * @return RgeoCodeResponse
     */
    CompletableFuture<RgeoCodeResponse> rgeoCode(RgeoCodeRequest request);

    /**
     * @param request the request parameters of TransitIntegratedDirection  TransitIntegratedDirectionRequest
     * @return TransitIntegratedDirectionResponse
     */
    CompletableFuture<TransitIntegratedDirectionResponse> transitIntegratedDirection(TransitIntegratedDirectionRequest request);

    /**
     * @param request the request parameters of WalkingDirectionNova  WalkingDirectionNovaRequest
     * @return WalkingDirectionNovaResponse
     */
    CompletableFuture<WalkingDirectionNovaResponse> walkingDirectionNova(WalkingDirectionNovaRequest request);

}
