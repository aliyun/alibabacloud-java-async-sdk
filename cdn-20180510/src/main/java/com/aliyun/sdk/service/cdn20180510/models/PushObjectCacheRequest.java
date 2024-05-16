// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
            this.securityToken = request.securityToken;
            this.withHeader = request.withHeader;
        } 

        /**
         * The accelerated region where content is to be prefetched. Valid values:
         * <p>
         * 
         * *   **domestic****: Chinese mainland**
         * *   **overseas****: regions outside the Chinese mainland**
         * 
         * If you do not set this parameter, content in the accelerated region of the domain name is prefetched.
         * 
         * *   If the accelerated region is set to **Mainland China Only**, content in regions in the Chinese mainland is prefetched.
         * *   If the accelerated region is set to **Global**, content in all regions is prefetched.
         * *   If the accelerated region is set to **Global (Excluding Mainland China)**, content in regions outside the Chinese mainland is prefetched.
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
         * *   **true**: prefetches content to POPs.
         * *   **false**: prefetches content to regular POPs. Regular POPs can be L2 POPs or L3 POPs. Default value: **false**.
         */
        public Builder l2Preload(Boolean l2Preload) {
            this.putQueryParameter("L2Preload", l2Preload);
            this.l2Preload = l2Preload;
            return this;
        }

        /**
         * The URLs based on which content is prefetched. Format: **accelerated domain name/files to be prefetched**.
         * <p>
         * 
         * > Separate URLs with line feeds (\n or \r\n). Each object path can be up to 1,024 characters in length.
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
        public PushObjectCacheRequest build() {
            return new PushObjectCacheRequest(this);
        } 

    } 

}
