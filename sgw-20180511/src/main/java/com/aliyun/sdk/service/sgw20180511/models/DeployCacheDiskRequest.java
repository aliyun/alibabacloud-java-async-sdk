// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployCacheDiskRequest} extends {@link RequestModel}
 *
 * <p>DeployCacheDiskRequest</p>
 */
public class DeployCacheDiskRequest extends Request {
    @Query
    @NameInMap("CacheConfig")
    private String cacheConfig;

    @Query
    @NameInMap("DiskCategory")
    private String diskCategory;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SizeInGB")
    private Integer sizeInGB;

    private DeployCacheDiskRequest(Builder builder) {
        super(builder);
        this.cacheConfig = builder.cacheConfig;
        this.diskCategory = builder.diskCategory;
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.sizeInGB = builder.sizeInGB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployCacheDiskRequest create() {
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
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sizeInGB
     */
    public Integer getSizeInGB() {
        return this.sizeInGB;
    }

    public static final class Builder extends Request.Builder<DeployCacheDiskRequest, Builder> {
        private String cacheConfig; 
        private String diskCategory; 
        private String gatewayId; 
        private String securityToken; 
        private Integer sizeInGB; 

        private Builder() {
            super();
        } 

        private Builder(DeployCacheDiskRequest request) {
            super(request);
            this.cacheConfig = request.cacheConfig;
            this.diskCategory = request.diskCategory;
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.sizeInGB = request.sizeInGB;
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
         * DiskCategory.
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SizeInGB.
         */
        public Builder sizeInGB(Integer sizeInGB) {
            this.putQueryParameter("SizeInGB", sizeInGB);
            this.sizeInGB = sizeInGB;
            return this;
        }

        @Override
        public DeployCacheDiskRequest build() {
            return new DeployCacheDiskRequest(this);
        } 

    } 

}
