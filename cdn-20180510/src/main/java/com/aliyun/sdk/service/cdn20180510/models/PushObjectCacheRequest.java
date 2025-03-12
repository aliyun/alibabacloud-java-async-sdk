// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link PushObjectCacheRequest} extends {@link RequestModel}
 *
 * <p>PushObjectCacheRequest</p>
 */
public class PushObjectCacheRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("L2Preload")
    private Boolean l2Preload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryHashkey")
    private Boolean queryHashkey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithHeader")
    private String withHeader;

    private PushObjectCacheRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.l2Preload = builder.l2Preload;
        this.objectPath = builder.objectPath;
        this.ownerId = builder.ownerId;
        this.queryHashkey = builder.queryHashkey;
        this.securityToken = builder.securityToken;
        this.withHeader = builder.withHeader;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushObjectCacheRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return l2Preload
     */
    public Boolean getL2Preload() {
        return this.l2Preload;
    }

    /**
     * @return objectPath
     */
    public String getObjectPath() {
        return this.objectPath;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return queryHashkey
     */
    public Boolean getQueryHashkey() {
        return this.queryHashkey;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return withHeader
     */
    public String getWithHeader() {
        return this.withHeader;
    }

    public static final class Builder extends Request.Builder<PushObjectCacheRequest, Builder> {
        private String area; 
        private Boolean l2Preload; 
        private String objectPath; 
        private Long ownerId; 
        private Boolean queryHashkey; 
        private String securityToken; 
        private String withHeader; 

        private Builder() {
            super();
        } 

        private Builder(PushObjectCacheRequest request) {
            super(request);
            this.area = request.area;
            this.l2Preload = request.l2Preload;
            this.objectPath = request.objectPath;
            this.ownerId = request.ownerId;
            this.queryHashkey = request.queryHashkey;
            this.securityToken = request.securityToken;
            this.withHeader = request.withHeader;
        } 

        /**
         * <p>The acceleration region where content is to be prefetched. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong><strong>: Chinese mainland</strong></li>
         * <li><strong>overseas</strong><strong>: regions outside the Chinese mainland</strong></li>
         * </ul>
         * <p>If you do not set this parameter, content in the service location (specified by parameter Coverage) that you configured for the domain is prefetched. Content is prefetched based on the following rules:</p>
         * <ul>
         * <li>If the acceleration region is set to <strong>Chinese Mainland Only</strong>, content in regions in the Chinese mainland is prefetched.</li>
         * <li>If the acceleration region is set to <strong>Global</strong>, content in all regions is prefetched.</li>
         * <li>If the acceleration region is set to <strong>Global (Excluding the Chinese Mainland)</strong>, content in regions outside the Chinese mainland is prefetched.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * <p>Specifies whether to prefetch content to L2 points of presence (POPs). Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prefetches content to L2 POPs.</li>
         * <li><strong>false</strong>: prefetches content to regular POPs. Regular POPs can be L2 POPs or L3 POPs. Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder l2Preload(Boolean l2Preload) {
            this.putQueryParameter("L2Preload", l2Preload);
            this.l2Preload = l2Preload;
            return this;
        }

        /**
         * <p>The URLs based on which content is prefetched. Format: <strong>accelerated domain name/files to be prefetched</strong>.</p>
         * <blockquote>
         * <p>Separate URLs with line feeds (\n or \r\n). Each object path can be up to 1,024 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com/image/1.png\nexample.org/image/2.png</p>
         */
        public Builder objectPath(String objectPath) {
            this.putQueryParameter("ObjectPath", objectPath);
            this.objectPath = objectPath;
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
         * <p>This parameter specifies whether to enable the hash key query mode when you run a prefetch task. Valid values:</p>
         * <ul>
         * <li>false: The default mode, in which the submitted URL is used as the hash key for the prefetch.</li>
         * <li>true: In this mode, the actual hash key used for the prefetch is queried based on the configuration of the domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder queryHashkey(Boolean queryHashkey) {
            this.putQueryParameter("QueryHashkey", queryHashkey);
            this.queryHashkey = queryHashkey;
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
         * <p>The custom header for prefetch in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Accept-Encoding&quot;: [
         *             &quot;gzip&quot;
         *       ]
         * }</p>
         */
        public Builder withHeader(String withHeader) {
            this.putQueryParameter("WithHeader", withHeader);
            this.withHeader = withHeader;
            return this;
        }

        @Override
        public PushObjectCacheRequest build() {
            return new PushObjectCacheRequest(this);
        } 

    } 

}
