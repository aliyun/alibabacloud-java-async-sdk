// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGatewayFileShareRequest} extends {@link RequestModel}
 *
 * <p>ModifyGatewayFileShareRequest</p>
 */
public class ModifyGatewayFileShareRequest extends Request {
    @Query
    @NameInMap("CacheConfig")
    private String cacheConfig;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IndexId")
    private String indexId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifyGatewayFileShareRequest(Builder builder) {
        super(builder);
        this.cacheConfig = builder.cacheConfig;
        this.gatewayId = builder.gatewayId;
        this.indexId = builder.indexId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGatewayFileShareRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheConfig
     */
    public String getCacheConfig() {
        return this.cacheConfig;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyGatewayFileShareRequest, Builder> {
        private String cacheConfig; 
        private String gatewayId; 
        private String indexId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGatewayFileShareRequest request) {
            super(request);
            this.cacheConfig = request.cacheConfig;
            this.gatewayId = request.gatewayId;
            this.indexId = request.indexId;
            this.securityToken = request.securityToken;
        } 

        /**
         * CacheConfig.
         */
        public Builder cacheConfig(String cacheConfig) {
            this.putQueryParameter("CacheConfig", cacheConfig);
            this.cacheConfig = cacheConfig;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public ModifyGatewayFileShareRequest build() {
            return new ModifyGatewayFileShareRequest(this);
        } 

    } 

}
