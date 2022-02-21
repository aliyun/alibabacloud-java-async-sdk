// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetFileCacheExpiredConfigRequest} extends {@link RequestModel}
 *
 * <p>SetFileCacheExpiredConfigRequest</p>
 */
public class SetFileCacheExpiredConfigRequest extends Request {
    @Query
    @NameInMap("CacheContent")
    @Validation(required = true)
    private String cacheContent;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TTL")
    @Validation(required = true)
    private String TTL;

    @Query
    @NameInMap("Weight")
    private String weight;

    private SetFileCacheExpiredConfigRequest(Builder builder) {
        super(builder);
        this.cacheContent = builder.cacheContent;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.TTL = builder.TTL;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFileCacheExpiredConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheContent
     */
    public String getCacheContent() {
        return this.cacheContent;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return TTL
     */
    public String getTTL() {
        return this.TTL;
    }

    /**
     * @return weight
     */
    public String getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<SetFileCacheExpiredConfigRequest, Builder> {
        private String cacheContent; 
        private String domainName; 
        private Long ownerId; 
        private String securityToken; 
        private String TTL; 
        private String weight; 

        private Builder() {
            super();
        } 

        private Builder(SetFileCacheExpiredConfigRequest response) {
            super(response);
            this.cacheContent = response.cacheContent;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
            this.TTL = response.TTL;
            this.weight = response.weight;
        } 

        /**
         * CacheContent.
         */
        public Builder cacheContent(String cacheContent) {
            this.putQueryParameter("CacheContent", cacheContent);
            this.cacheContent = cacheContent;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * TTL.
         */
        public Builder TTL(String TTL) {
            this.putQueryParameter("TTL", TTL);
            this.TTL = TTL;
            return this;
        }

        /**
         * Weight.
         */
        public Builder weight(String weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public SetFileCacheExpiredConfigRequest build() {
            return new SetFileCacheExpiredConfigRequest(this);
        } 

    } 

}
