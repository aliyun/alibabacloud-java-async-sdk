// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineGatewayRouteRequest} extends {@link RequestModel}
 *
 * <p>OfflineGatewayRouteRequest</p>
 */
public class OfflineGatewayRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteId")
    private String routeId;

    private OfflineGatewayRouteRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.routeId = builder.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineGatewayRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    public static final class Builder extends Request.Builder<OfflineGatewayRouteRequest, Builder> {
        private String acceptLanguage; 
        private String gatewayUniqueId; 
        private String routeId; 

        private Builder() {
            super();
        } 

        private Builder(OfflineGatewayRouteRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.routeId = request.routeId;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The unique ID of the gateway.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * The ID of the route.
         */
        public Builder routeId(String routeId) {
            this.putQueryParameter("RouteId", routeId);
            this.routeId = routeId;
            return this;
        }

        @Override
        public OfflineGatewayRouteRequest build() {
            return new OfflineGatewayRouteRequest(this);
        } 

    } 

}
