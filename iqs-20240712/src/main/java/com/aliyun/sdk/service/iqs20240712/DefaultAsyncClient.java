// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.iqs20240712.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "IQS";
        this.version = "2024-07-12";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of BicyclingDirectionNova  BicyclingDirectionNovaRequest
     * @return BicyclingDirectionNovaResponse
     */
    @Override
    public CompletableFuture<BicyclingDirectionNovaResponse> bicyclingDirectionNova(BicyclingDirectionNovaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BicyclingDirectionNova").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v2/direction/bicycling").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BicyclingDirectionNovaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BicyclingDirectionNovaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CommonQueryByScene  CommonQueryBySceneRequest
     * @return CommonQueryBySceneResponse
     */
    @Override
    public CompletableFuture<CommonQueryBySceneResponse> commonQueryByScene(CommonQueryBySceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CommonQueryByScene").setMethod(HttpMethod.POST).setPathRegex("/amap-function-call-agent/iqs-agent-service/v2/nl/common").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommonQueryBySceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommonQueryBySceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DrivingDirectionNova  DrivingDirectionNovaRequest
     * @return DrivingDirectionNovaResponse
     */
    @Override
    public CompletableFuture<DrivingDirectionNovaResponse> drivingDirectionNova(DrivingDirectionNovaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DrivingDirectionNova").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v2/direction/driving").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DrivingDirectionNovaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DrivingDirectionNovaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ElectrobikeDirectionNova  ElectrobikeDirectionNovaRequest
     * @return ElectrobikeDirectionNovaResponse
     */
    @Override
    public CompletableFuture<ElectrobikeDirectionNovaResponse> electrobikeDirectionNova(ElectrobikeDirectionNovaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ElectrobikeDirectionNova").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v2/direction/electrobike").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ElectrobikeDirectionNovaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ElectrobikeDirectionNovaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GeoCode  GeoCodeRequest
     * @return GeoCodeResponse
     */
    @Override
    public CompletableFuture<GeoCodeResponse> geoCode(GeoCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GeoCode").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v1/geocode/geo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GeoCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GeoCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of NearbySearch  NearbySearchRequest
     * @return NearbySearchResponse
     */
    @Override
    public CompletableFuture<NearbySearchResponse> nearbySearch(NearbySearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("NearbySearch").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v1/pois/nearby").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(NearbySearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<NearbySearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of NearbySearchNova  NearbySearchNovaRequest
     * @return NearbySearchNovaResponse
     */
    @Override
    public CompletableFuture<NearbySearchNovaResponse> nearbySearchNova(NearbySearchNovaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("NearbySearchNova").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v2/pois/nearby").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(NearbySearchNovaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<NearbySearchNovaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PlaceSearch  PlaceSearchRequest
     * @return PlaceSearchResponse
     */
    @Override
    public CompletableFuture<PlaceSearchResponse> placeSearch(PlaceSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PlaceSearch").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v1/pois/place").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PlaceSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PlaceSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PlaceSearchNova  PlaceSearchNovaRequest
     * @return PlaceSearchNovaResponse
     */
    @Override
    public CompletableFuture<PlaceSearchNovaResponse> placeSearchNova(PlaceSearchNovaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PlaceSearchNova").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v2/pois/place").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PlaceSearchNovaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PlaceSearchNovaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAttractions  QueryAttractionsRequest
     * @return QueryAttractionsResponse
     */
    @Override
    public CompletableFuture<QueryAttractionsResponse> queryAttractions(QueryAttractionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryAttractions").setMethod(HttpMethod.POST).setPathRegex("/amap-function-call-agent/iqs-agent-service/v1/nl/attractions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAttractionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAttractionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryHotels  QueryHotelsRequest
     * @return QueryHotelsResponse
     */
    @Override
    public CompletableFuture<QueryHotelsResponse> queryHotels(QueryHotelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryHotels").setMethod(HttpMethod.POST).setPathRegex("/amap-function-call-agent/iqs-agent-service/v1/nl/hotels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryHotelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryHotelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRestaurants  QueryRestaurantsRequest
     * @return QueryRestaurantsResponse
     */
    @Override
    public CompletableFuture<QueryRestaurantsResponse> queryRestaurants(QueryRestaurantsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryRestaurants").setMethod(HttpMethod.POST).setPathRegex("/amap-function-call-agent/iqs-agent-service/v1/nl/restaurants").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRestaurantsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRestaurantsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RgeoCode  RgeoCodeRequest
     * @return RgeoCodeResponse
     */
    @Override
    public CompletableFuture<RgeoCodeResponse> rgeoCode(RgeoCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RgeoCode").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v1/geocode/regeo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RgeoCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RgeoCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WalkingDirectionNova  WalkingDirectionNovaRequest
     * @return WalkingDirectionNovaResponse
     */
    @Override
    public CompletableFuture<WalkingDirectionNovaResponse> walkingDirectionNova(WalkingDirectionNovaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("WalkingDirectionNova").setMethod(HttpMethod.GET).setPathRegex("/ipaas/v2/direction/walking").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WalkingDirectionNovaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WalkingDirectionNovaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
