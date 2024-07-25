// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayRouteRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayRouteRequest</p>
 */
public class CreateGatewayRouteRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private CreateGatewayRouteRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.backendConfig = builder.backendConfig;
        this.description = builder.description;
        this.domainConfig = builder.domainConfig;
        this.match = builder.match;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayRouteRequest create() {
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateGatewayRouteRequest, Builder> {
        private String gatewayId; 
        private GatewayRouteBackendConfig backendConfig; 
        private String description; 
        private GatewayRouteDomainConfig domainConfig; 
        private HttpRouteMatch match; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayRouteRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.backendConfig = request.backendConfig;
            this.description = request.description;
            this.domainConfig = request.domainConfig;
            this.match = request.match;
            this.name = request.name;
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

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateGatewayRouteRequest build() {
            return new CreateGatewayRouteRequest(this);
        } 

    } 

}
