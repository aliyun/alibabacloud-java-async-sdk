// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshObjectCacheByCacheTagRequest} extends {@link RequestModel}
 *
 * <p>RefreshObjectCacheByCacheTagRequest</p>
 */
public class RefreshObjectCacheByCacheTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheTag")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 16384)
    private String cacheTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
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
         * <p>The accelerated domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether to purge all resources that you submit if the requested content is one of the resources that you submit to purge. Default value: false.</p>
         * <ul>
         * <li><strong>true</strong>: The nearest POP fetches all resources from the origin server, delivers them to the client, and updates the cache with the new version.</li>
         * <li><strong>false</strong>: The nearest POP checks the Last-Modified parameter of the resource on the origin server. If the parameter value is the same as that of the cached resource, the POP serves the cached resource. If the parameter value is not the same as that of the cached resource, the POP fetches the latest version from the origin server, delivers it to the client, and updates the cache with the new version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
