// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteRequest</p>
 */
public class UpdateGatewayRouteRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayRouteId")
    private String gatewayRouteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("backendConfig")
    private GatewayRouteBackendConfig backendConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domainConfig")
    private GatewayRouteDomainConfig domainConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("match")
    private HttpRouteMatch match;

    private UpdateGatewayRouteRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayRouteId = builder.gatewayRouteId;
        this.backendConfig = builder.backendConfig;
        this.description = builder.description;
        this.domainConfig = builder.domainConfig;
        this.match = builder.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteRequest create() {
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

    /**
     * @return backendConfig
     */
    public GatewayRouteBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainConfig
     */
    public GatewayRouteDomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    /**
     * @return match
     */
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRouteRequest, Builder> {
        private String gatewayId; 
        private String gatewayRouteId; 
        private GatewayRouteBackendConfig backendConfig; 
        private String description; 
        private GatewayRouteDomainConfig domainConfig; 
        private HttpRouteMatch match; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayRouteId = request.gatewayRouteId;
            this.backendConfig = request.backendConfig;
            this.description = request.description;
            this.domainConfig = request.domainConfig;
            this.match = request.match;
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

        /**
         * backendConfig.
         */
        public Builder backendConfig(GatewayRouteBackendConfig backendConfig) {
            this.putBodyParameter("backendConfig", backendConfig);
            this.backendConfig = backendConfig;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * domainConfig.
         */
        public Builder domainConfig(GatewayRouteDomainConfig domainConfig) {
            this.putBodyParameter("domainConfig", domainConfig);
            this.domainConfig = domainConfig;
            return this;
        }

        /**
         * match.
         */
        public Builder match(HttpRouteMatch match) {
            this.putBodyParameter("match", match);
            this.match = match;
            return this;
        }

        @Override
        public UpdateGatewayRouteRequest build() {
            return new UpdateGatewayRouteRequest(this);
        } 

    } 

}
