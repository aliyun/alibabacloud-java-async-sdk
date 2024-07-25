// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineGatewayRouteRequest} extends {@link RequestModel}
 *
 * <p>OfflineGatewayRouteRequest</p>
 */
public class OfflineGatewayRouteRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayRouteId")
    private String gatewayRouteId;

    private OfflineGatewayRouteRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayRouteId = builder.gatewayRouteId;
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
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayRouteId
     */
    public String getGatewayRouteId() {
        return this.gatewayRouteId;
    }

    public static final class Builder extends Request.Builder<OfflineGatewayRouteRequest, Builder> {
        private String gatewayId; 
        private String gatewayRouteId; 

        private Builder() {
            super();
        } 

        private Builder(OfflineGatewayRouteRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayRouteId = request.gatewayRouteId;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * gatewayRouteId.
         */
        public Builder gatewayRouteId(String gatewayRouteId) {
            this.putPathParameter("gatewayRouteId", gatewayRouteId);
            this.gatewayRouteId = gatewayRouteId;
            return this;
        }

        @Override
        public OfflineGatewayRouteRequest build() {
            return new OfflineGatewayRouteRequest(this);
        } 

    } 

}
