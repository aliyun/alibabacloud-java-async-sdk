// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayCacheDiskRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayCacheDiskRequest</p>
 */
public class DeleteGatewayCacheDiskRequest extends Request {
    @Query
    @NameInMap("CacheId")
    @Validation(required = true)
    private String cacheId;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("LocalFilePath")
    @Validation(required = true)
    private String localFilePath;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteGatewayCacheDiskRequest(Builder builder) {
        super(builder);
        this.cacheId = builder.cacheId;
        this.gatewayId = builder.gatewayId;
        this.localFilePath = builder.localFilePath;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayCacheDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheId
     */
    public String getCacheId() {
        return this.cacheId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return localFilePath
     */
    public String getLocalFilePath() {
        return this.localFilePath;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteGatewayCacheDiskRequest, Builder> {
        private String cacheId; 
        private String gatewayId; 
        private String localFilePath; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayCacheDiskRequest request) {
            super(request);
            this.cacheId = request.cacheId;
            this.gatewayId = request.gatewayId;
            this.localFilePath = request.localFilePath;
            this.securityToken = request.securityToken;
        } 

        /**
         * CacheId.
         */
        public Builder cacheId(String cacheId) {
            this.putQueryParameter("CacheId", cacheId);
            this.cacheId = cacheId;
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
         * LocalFilePath.
         */
        public Builder localFilePath(String localFilePath) {
            this.putQueryParameter("LocalFilePath", localFilePath);
            this.localFilePath = localFilePath;
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
        public DeleteGatewayCacheDiskRequest build() {
            return new DeleteGatewayCacheDiskRequest(this);
        } 

    } 

}
