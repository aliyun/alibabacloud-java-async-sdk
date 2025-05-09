// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDefenseResourceResponseBody model) {
            this.requestId = model.requestId;
            this.resource = model.resource;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>439AADF2-368C-5E98-B14E-3086****0573</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The protected object.</p>
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        public DescribeDefenseResourceResponseBody build() {
            return new DescribeDefenseResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseResourceResponseBody</p>
     */
    public static class ResponseHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ResponseHeaders(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseHeaders create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ResponseHeaders model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Specifies the key for a custom response header.</p>
             * 
             * <strong>example:</strong>
             * <p>Header-Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Specifies the value for a custom response header.</p>
             * 
             * <strong>example:</strong>
             * <p>Header-Value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResponseHeaders build() {
                return new ResponseHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDefenseResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseResourceResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcwCookieStatus")
        private Integer acwCookieStatus;

        @com.aliyun.core.annotation.NameInMap("AcwSecureStatus")
        private Integer acwSecureStatus;

        @com.aliyun.core.annotation.NameInMap("AcwV3SecureStatus")
        private Integer acwV3SecureStatus;

        @com.aliyun.core.annotation.NameInMap("CustomHeaders")
        private java.util.List<String> customHeaders;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.Map<String, ?> detail;

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

        @com.aliyun.core.annotation.NameInMap("ResponseHeaders")
        private java.util.List<ResponseHeaders> responseHeaders;

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
            this.responseHeaders = builder.responseHeaders;
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
        public java.util.List<String> getCustomHeaders() {
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
        public java.util.Map<String, ?> getDetail() {
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
         * @return responseHeaders
         */
        public java.util.List<ResponseHeaders> getResponseHeaders() {
            return this.responseHeaders;
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
            private java.util.List<String> customHeaders; 
            private String description; 
            private java.util.Map<String, ?> detail; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String ownerUserId; 
            private String pattern; 
            private String product; 
            private String resource; 
            private String resourceGroup; 
            private String resourceManagerResourceGroupId; 
            private String resourceOrigin; 
            private java.util.List<ResponseHeaders> responseHeaders; 
            private Integer xffStatus; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.acwCookieStatus = model.acwCookieStatus;
                this.acwSecureStatus = model.acwSecureStatus;
                this.acwV3SecureStatus = model.acwV3SecureStatus;
                this.customHeaders = model.customHeaders;
                this.description = model.description;
                this.detail = model.detail;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.ownerUserId = model.ownerUserId;
                this.pattern = model.pattern;
                this.product = model.product;
                this.resource = model.resource;
                this.resourceGroup = model.resourceGroup;
                this.resourceManagerResourceGroupId = model.resourceManagerResourceGroupId;
                this.resourceOrigin = model.resourceOrigin;
                this.responseHeaders = model.responseHeaders;
                this.xffStatus = model.xffStatus;
            } 

            /**
             * <p>The status of the tracking cookie.</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder acwCookieStatus(Integer acwCookieStatus) {
                this.acwCookieStatus = acwCookieStatus;
                return this;
            }

            /**
             * <p>The status of the secure attribute of the tracking cookie.</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder acwSecureStatus(Integer acwSecureStatus) {
                this.acwSecureStatus = acwSecureStatus;
                return this;
            }

            /**
             * <p>The status of the secure attribute of the slider CAPTCHA cookie.</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder acwV3SecureStatus(Integer acwV3SecureStatus) {
                this.acwV3SecureStatus = acwV3SecureStatus;
                return this;
            }

            /**
             * <p>The custom header fields.</p>
             * <blockquote>
             * <p> If the value of XffStatus is 1, the first IP address in the specified header field is used as the originating IP address of the client to prevent X-Forwarded-For (XFF) forgery. If you specify multiple header fields, WAF reads the values of the header fields in sequence until the originating IP address is obtained. If the originating IP address cannot be obtained, the first IP address in the XFF header field is used as the originating IP address of the client.</p>
             * </blockquote>
             */
            public Builder customHeaders(java.util.List<String> customHeaders) {
                this.customHeaders = customHeaders;
                return this;
            }

            /**
             * <p>The description of the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>This is Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The details of the protected object. Different key-value pairs indicate different attributes of the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             * &quot;product&quot;: &quot;waf&quot;,
             *  &quot;domain&quot;: &quot;demo.aliyundoc****.com&quot;
             * }</p>
             */
            public Builder detail(java.util.Map<String, ?> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The time when the protected object was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1607493144000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the protected object was modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1691720010000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The user ID (UID) of the Alibaba Cloud account to which the protected object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>170457******9107</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The pattern used for the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>The name of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>alb</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The name of the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-rencs***</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The name of the protected object group to which the protected object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>example_resource_group</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmoiy****p2oq</p>
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * <p>The origin of the protected object. Valid values:</p>
             * <ul>
             * <li><strong>custom</strong></li>
             * <li><strong>access</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder resourceOrigin(String resourceOrigin) {
                this.resourceOrigin = resourceOrigin;
                return this;
            }

            /**
             * <p>The response header.</p>
             */
            public Builder responseHeaders(java.util.List<ResponseHeaders> responseHeaders) {
                this.responseHeaders = responseHeaders;
                return this;
            }

            /**
             * <p>Indicates whether a Layer 7 proxy is deployed in front of WAF, such as Anti-DDoS Proxy and Alibaba Cloud CDN. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No Layer 7 proxy is deployed.</li>
             * <li><strong>1</strong>: A Layer 7 proxy is deployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
