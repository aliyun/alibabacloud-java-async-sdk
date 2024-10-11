// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PreloadVodObjectCachesRequest} extends {@link RequestModel}
 *
 * <p>PreloadVodObjectCachesRequest</p>
 */
public class PreloadVodObjectCachesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithHeader")
    private String withHeader;

    private PreloadVodObjectCachesRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.l2Preload = builder.l2Preload;
        this.objectPath = builder.objectPath;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.withHeader = builder.withHeader;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadVodObjectCachesRequest create() {
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

    public static final class Builder extends Request.Builder<PreloadVodObjectCachesRequest, Builder> {
        private String area; 
        private Boolean l2Preload; 
        private String objectPath; 
        private Long ownerId; 
        private String securityToken; 
        private String withHeader; 

        private Builder() {
            super();
        } 

        private Builder(PreloadVodObjectCachesRequest request) {
            super(request);
            this.area = request.area;
            this.l2Preload = request.l2Preload;
            this.objectPath = request.objectPath;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
            this.withHeader = request.withHeader;
        } 

        /**
         * <p>The acceleration region in which you want to prefetch content. If you do not specify a region, the value overseas is used.</p>
         * <ul>
         * <li><strong>domestic</strong>: Chinese mainland</li>
         * <li><strong>overseas</strong>: outside the Chinese mainland</li>
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
         * <p>Specifies whether to prefetch content to POPs. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prefetches content to nodes that include L2 DCDN nodes.</li>
         * <li><strong>false</strong>: prefetches content to L2 POPs or L3 POPs.</li>
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
         * <p>The URL of the file to be prefetched. Separate multiple URLs with line breaks (\n or \r\n).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vod.test.com/test.txt</p>
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
         *             &quot;gzip, deflate, br&quot;
         *       ]
         * }</p>
         */
        public Builder withHeader(String withHeader) {
            this.putQueryParameter("WithHeader", withHeader);
            this.withHeader = withHeader;
            return this;
        }

        @Override
        public PreloadVodObjectCachesRequest build() {
            return new PreloadVodObjectCachesRequest(this);
        } 

    } 

}
