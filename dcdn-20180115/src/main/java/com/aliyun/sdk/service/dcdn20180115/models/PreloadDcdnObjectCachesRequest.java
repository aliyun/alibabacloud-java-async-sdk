// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreloadDcdnObjectCachesRequest} extends {@link RequestModel}
 *
 * <p>PreloadDcdnObjectCachesRequest</p>
 */
public class PreloadDcdnObjectCachesRequest extends Request {
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

    private PreloadDcdnObjectCachesRequest(Builder builder) {
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

    public static PreloadDcdnObjectCachesRequest create() {
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

    public static final class Builder extends Request.Builder<PreloadDcdnObjectCachesRequest, Builder> {
        private String area; 
        private Boolean l2Preload; 
        private String objectPath; 
        private Long ownerId; 
        private String securityToken; 
        private String withHeader; 

        private Builder() {
            super();
        } 

        private Builder(PreloadDcdnObjectCachesRequest request) {
            super(request);
            this.area = request.area;
            this.l2Preload = request.l2Preload;
            this.objectPath = request.objectPath;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
            this.withHeader = request.withHeader;
        } 

        /**
         * The acceleration region in which you want to prefetch content. If you do not specify a region, the value overseas is used.
         * <p>
         * 
         * *   **domestic**: Chinese mainland
         * *   **overseas**: outside the Chinese mainland
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * Specifies whether to prefetch content to POPs. Valid values:
         * <p>
         * 
         * *   **true**: prefetches content to nodes that include L2 DCDN nodes.
         * *   **false**: prefetches content to L2 POPs or L3 POPs.
         */
        public Builder l2Preload(Boolean l2Preload) {
            this.putQueryParameter("L2Preload", l2Preload);
            this.l2Preload = l2Preload;
            return this;
        }

        /**
         * The path of the content that you want to prefetch. Separate multiple URLs with line feed characters (\n) or a pair of carriage return and line feed characters (\r\n).
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
         * The custom header for prefetch in the JSON format.
         */
        public Builder withHeader(String withHeader) {
            this.putQueryParameter("WithHeader", withHeader);
            this.withHeader = withHeader;
            return this;
        }

        @Override
        public PreloadDcdnObjectCachesRequest build() {
            return new PreloadDcdnObjectCachesRequest(this);
        } 

    } 

}
