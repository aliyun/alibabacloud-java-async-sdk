// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshObjectCacheByCacheTagRequest} extends {@link RequestModel}
 *
 * <p>RefreshObjectCacheByCacheTagRequest</p>
 */
public class RefreshObjectCacheByCacheTagRequest extends Request {
    @Query
    @NameInMap("CacheTag")
    @Validation(required = true, maxLength = 16384)
    private String cacheTag;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Force")
    private Boolean force;

    private RefreshObjectCacheByCacheTagRequest(Builder builder) {
        super(builder);
        this.cacheTag = builder.cacheTag;
        this.domainName = builder.domainName;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshObjectCacheByCacheTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheTag
     */
    public String getCacheTag() {
        return this.cacheTag;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<RefreshObjectCacheByCacheTagRequest, Builder> {
        private String cacheTag; 
        private String domainName; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(RefreshObjectCacheByCacheTagRequest request) {
            super(request);
            this.cacheTag = request.cacheTag;
            this.domainName = request.domainName;
            this.force = request.force;
        } 

        /**
         * CacheTag.
         */
        public Builder cacheTag(String cacheTag) {
            this.putQueryParameter("CacheTag", cacheTag);
            this.cacheTag = cacheTag;
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
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        @Override
        public RefreshObjectCacheByCacheTagRequest build() {
            return new RefreshObjectCacheByCacheTagRequest(this);
        } 

    } 

}
