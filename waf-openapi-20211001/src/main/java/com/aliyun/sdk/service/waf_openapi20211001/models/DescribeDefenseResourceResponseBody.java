// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourceResponseBody</p>
 */
public class DescribeDefenseResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    private DescribeDefenseResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    public static final class Builder {
        private String requestId; 
        private Resource resource; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the protected object.
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        public DescribeDefenseResourceResponseBody build() {
            return new DescribeDefenseResourceResponseBody(this);
        } 

    } 

    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcwCookieStatus")
        private Integer acwCookieStatus;

        @com.aliyun.core.annotation.NameInMap("AcwSecureStatus")
        private Integer acwSecureStatus;

        @com.aliyun.core.annotation.NameInMap("AcwV3SecureStatus")
        private Integer acwV3SecureStatus;

        @com.aliyun.core.annotation.NameInMap("CustomHeaders")
        private java.util.List < String > customHeaders;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.Map < String, ? > detail;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceOrigin")
        private String resourceOrigin;

        @com.aliyun.core.annotation.NameInMap("XffStatus")
        private Integer xffStatus;

        private Resource(Builder builder) {
            this.acwCookieStatus = builder.acwCookieStatus;
            this.acwSecureStatus = builder.acwSecureStatus;
            this.acwV3SecureStatus = builder.acwV3SecureStatus;
            this.customHeaders = builder.customHeaders;
            this.description = builder.description;
            this.detail = builder.detail;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ownerUserId = builder.ownerUserId;
            this.pattern = builder.pattern;
            this.product = builder.product;
            this.resource = builder.resource;
            this.resourceGroup = builder.resourceGroup;
            this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
            this.resourceOrigin = builder.resourceOrigin;
            this.xffStatus = builder.xffStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return acwCookieStatus
         */
        public Integer getAcwCookieStatus() {
            return this.acwCookieStatus;
        }

        /**
         * @return acwSecureStatus
         */
        public Integer getAcwSecureStatus() {
            return this.acwSecureStatus;
        }

        /**
         * @return acwV3SecureStatus
         */
        public Integer getAcwV3SecureStatus() {
            return this.acwV3SecureStatus;
        }

        /**
         * @return customHeaders
         */
        public java.util.List < String > getCustomHeaders() {
            return this.customHeaders;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detail
         */
        public java.util.Map < String, ? > getDetail() {
            return this.detail;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return resourceManagerResourceGroupId
         */
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        /**
         * @return resourceOrigin
         */
        public String getResourceOrigin() {
            return this.resourceOrigin;
        }

        /**
         * @return xffStatus
         */
        public Integer getXffStatus() {
            return this.xffStatus;
        }

        public static final class Builder {
            private Integer acwCookieStatus; 
            private Integer acwSecureStatus; 
            private Integer acwV3SecureStatus; 
            private java.util.List < String > customHeaders; 
            private String description; 
            private java.util.Map < String, ? > detail; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String ownerUserId; 
            private String pattern; 
            private String product; 
            private String resource; 
            private String resourceGroup; 
            private String resourceManagerResourceGroupId; 
            private String resourceOrigin; 
            private Integer xffStatus; 

            /**
             * The status of the tracking cookie.
             * <p>
             * 
             * *   **0**: disabled.
             * *   **1**: enabled.
             */
            public Builder acwCookieStatus(Integer acwCookieStatus) {
                this.acwCookieStatus = acwCookieStatus;
                return this;
            }

            /**
             * The status of the secure attribute of the tracking cookie.
             * <p>
             * 
             * *   **0**: disabled.
             * *   **1**: enabled.
             */
            public Builder acwSecureStatus(Integer acwSecureStatus) {
                this.acwSecureStatus = acwSecureStatus;
                return this;
            }

            /**
             * The status of the secure attribute of the slider CAPTCHA cookie.
             * <p>
             * 
             * *   **0**: disabled.
             * *   **1**: enabled.
             */
            public Builder acwV3SecureStatus(Integer acwV3SecureStatus) {
                this.acwV3SecureStatus = acwV3SecureStatus;
                return this;
            }

            /**
             * The custom header fields.
             * <p>
             * 
             * >  If the value of XffStatus is 1, the first IP address in the specified header field is used as the originating IP address of the client to prevent X-Forwarded-For (XFF) forgery. If you specify multiple header fields, WAF reads the values of the header fields in sequence until the originating IP address is obtained. If the originating IP address cannot be obtained, the first IP address in the XFF header field is used as the originating IP address of the client.
             */
            public Builder customHeaders(java.util.List < String > customHeaders) {
                this.customHeaders = customHeaders;
                return this;
            }

            /**
             * The description of the protected object.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The details of the protected object. Different key-value pairs indicate different attributes of the protected object.
             */
            public Builder detail(java.util.Map < String, ? > detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The time when the protected object was created. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the protected object was modified. Unit: milliseconds.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The user ID (UID) of the Alibaba Cloud account to which the protected object belongs.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * The pattern used for the protected object.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * The name of the cloud service.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The name of the protected object.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The name of the protected object group to which the protected object belongs.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud resource group.
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * The origin of the protected object. Valid values:
             * <p>
             * 
             * *   **custom**
             * *   **access**
             */
            public Builder resourceOrigin(String resourceOrigin) {
                this.resourceOrigin = resourceOrigin;
                return this;
            }

            /**
             * Indicates whether a Layer 7 proxy is deployed in front of WAF, such as Anti-DDoS Proxy and Alibaba Cloud CDN. Valid values:
             * <p>
             * 
             * *   **0**: No Layer 7 proxy is deployed.
             * *   **1**: A Layer 7 proxy is deployed.
             */
            public Builder xffStatus(Integer xffStatus) {
                this.xffStatus = xffStatus;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
