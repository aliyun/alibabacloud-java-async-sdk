// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayRouteWafStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteWafStatusRequest</p>
 */
public class UpdateGatewayRouteWafStatusRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("EnableWaf")
    private Boolean enableWaf;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("RouteId")
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
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * EnableWaf.
         */
        public Builder enableWaf(Boolean enableWaf) {
            this.putQueryParameter("EnableWaf", enableWaf);
            this.enableWaf = enableWaf;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * RouteId.
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
