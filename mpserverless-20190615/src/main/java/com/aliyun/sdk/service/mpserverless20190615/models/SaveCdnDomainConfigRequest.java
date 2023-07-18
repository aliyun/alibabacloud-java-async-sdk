// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveCdnDomainConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveCdnDomainConfigRequest</p>
 */
public class SaveCdnDomainConfigRequest extends Request {
    @Body
    @NameInMap("AuthConfig")
    private String authConfig;

    @Body
    @NameInMap("CorsConfig")
    private String corsConfig;

    @Body
    @NameInMap("IpConfig")
    private String ipConfig;

    @Body
    @NameInMap("RefererConfig")
    private String refererConfig;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Body
    @NameInMap("UaConfig")
    private String uaConfig;

    private SaveCdnDomainConfigRequest(Builder builder) {
        super(builder);
        this.authConfig = builder.authConfig;
        this.corsConfig = builder.corsConfig;
        this.ipConfig = builder.ipConfig;
        this.refererConfig = builder.refererConfig;
        this.spaceId = builder.spaceId;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
        this.uaConfig = builder.uaConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveCdnDomainConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfig
     */
    public String getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return corsConfig
     */
    public String getCorsConfig() {
        return this.corsConfig;
    }

    /**
     * @return ipConfig
     */
    public String getIpConfig() {
        return this.ipConfig;
    }

    /**
     * @return refererConfig
     */
    public String getRefererConfig() {
        return this.refererConfig;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uaConfig
     */
    public String getUaConfig() {
        return this.uaConfig;
    }

    public static final class Builder extends Request.Builder<SaveCdnDomainConfigRequest, Builder> {
        private String authConfig; 
        private String corsConfig; 
        private String ipConfig; 
        private String refererConfig; 
        private String spaceId; 
        private String tenantId; 
        private String type; 
        private String uaConfig; 

        private Builder() {
            super();
        } 

        private Builder(SaveCdnDomainConfigRequest request) {
            super(request);
            this.authConfig = request.authConfig;
            this.corsConfig = request.corsConfig;
            this.ipConfig = request.ipConfig;
            this.refererConfig = request.refererConfig;
            this.spaceId = request.spaceId;
            this.tenantId = request.tenantId;
            this.type = request.type;
            this.uaConfig = request.uaConfig;
        } 

        /**
         * AuthConfig.
         */
        public Builder authConfig(String authConfig) {
            this.putBodyParameter("AuthConfig", authConfig);
            this.authConfig = authConfig;
            return this;
        }

        /**
         * CorsConfig.
         */
        public Builder corsConfig(String corsConfig) {
            this.putBodyParameter("CorsConfig", corsConfig);
            this.corsConfig = corsConfig;
            return this;
        }

        /**
         * IpConfig.
         */
        public Builder ipConfig(String ipConfig) {
            this.putBodyParameter("IpConfig", ipConfig);
            this.ipConfig = ipConfig;
            return this;
        }

        /**
         * RefererConfig.
         */
        public Builder refererConfig(String refererConfig) {
            this.putBodyParameter("RefererConfig", refererConfig);
            this.refererConfig = refererConfig;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UaConfig.
         */
        public Builder uaConfig(String uaConfig) {
            this.putBodyParameter("UaConfig", uaConfig);
            this.uaConfig = uaConfig;
            return this;
        }

        @Override
        public SaveCdnDomainConfigRequest build() {
            return new SaveCdnDomainConfigRequest(this);
        } 

    } 

}
