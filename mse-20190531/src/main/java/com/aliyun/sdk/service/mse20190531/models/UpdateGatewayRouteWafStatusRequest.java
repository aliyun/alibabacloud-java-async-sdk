// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayRouteWafStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteWafStatusRequest</p>
 */
public class UpdateGatewayRouteWafStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableWaf")
    private Boolean enableWaf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteId")
    private Long routeId;

    private UpdateGatewayRouteWafStatusRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.enableWaf = builder.enableWaf;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.routeId = builder.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteWafStatusRequest create() {
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
     * @return enableWaf
     */
    public Boolean getEnableWaf() {
        return this.enableWaf;
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
    public Long getRouteId() {
        return this.routeId;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRouteWafStatusRequest, Builder> {
        private String acceptLanguage; 
        private Boolean enableWaf; 
        private String gatewayUniqueId; 
        private Long routeId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteWafStatusRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.enableWaf = request.enableWaf;
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
         * Specifies whether to activate Web Application Firewall (WAF).
         */
        public Builder enableWaf(Boolean enableWaf) {
            this.putQueryParameter("EnableWaf", enableWaf);
            this.enableWaf = enableWaf;
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
        public Builder routeId(Long routeId) {
            this.putQueryParameter("RouteId", routeId);
            this.routeId = routeId;
            return this;
        }

        @Override
        public UpdateGatewayRouteWafStatusRequest build() {
            return new UpdateGatewayRouteWafStatusRequest(this);
        } 

    } 

}
