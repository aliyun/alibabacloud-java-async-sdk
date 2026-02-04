// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshErObjectCachesByCacheTagRequest} extends {@link RequestModel}
 *
 * <p>RefreshErObjectCachesByCacheTagRequest</p>
 */
public class RefreshErObjectCachesByCacheTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cacheTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MergeDomainName")
    private String mergeDomainName;

    private RefreshErObjectCachesByCacheTagRequest(Builder builder) {
        super(builder);
        this.cacheTag = builder.cacheTag;
        this.domain = builder.domain;
        this.force = builder.force;
        this.mergeDomainName = builder.mergeDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshErObjectCachesByCacheTagRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return mergeDomainName
     */
    public String getMergeDomainName() {
        return this.mergeDomainName;
    }

    public static final class Builder extends Request.Builder<RefreshErObjectCachesByCacheTagRequest, Builder> {
        private String cacheTag; 
        private String domain; 
        private Boolean force; 
        private String mergeDomainName; 

        private Builder() {
            super();
        } 

        private Builder(RefreshErObjectCachesByCacheTagRequest request) {
            super(request);
            this.cacheTag = request.cacheTag;
            this.domain = request.domain;
            this.force = request.force;
            this.mergeDomainName = request.mergeDomainName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1,tag2</p>
         */
        public Builder cacheTag(String cacheTag) {
            this.putQueryParameter("CacheTag", cacheTag);
            this.cacheTag = cacheTag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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

        /**
         * MergeDomainName.
         */
        public Builder mergeDomainName(String mergeDomainName) {
            this.putQueryParameter("MergeDomainName", mergeDomainName);
            this.mergeDomainName = mergeDomainName;
            return this;
        }

        @Override
        public RefreshErObjectCachesByCacheTagRequest build() {
            return new RefreshErObjectCachesByCacheTagRequest(this);
        } 

    } 

}
