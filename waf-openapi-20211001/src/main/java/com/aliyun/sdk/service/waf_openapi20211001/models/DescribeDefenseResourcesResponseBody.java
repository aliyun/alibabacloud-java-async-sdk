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
 * {@link DescribeDefenseResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourcesResponseBody</p>
 */
public class DescribeDefenseResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDefenseResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Resources> resources; 
        private Long totalCount; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>618F2626-DB27-5187-8C6C-4E61A491DF29</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array of protected objects.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseResourcesResponseBody build() {
            return new DescribeDefenseResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("XffStatus")
        private Integer xffStatus;

        private Resources(Builder builder) {
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

        public static Resources create() {
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
            private Integer xffStatus; 

            /**
             * <p>跟踪cookie开关状态。</p>
             * <ul>
             * <li><p><strong>0</strong>：表示关闭。</p>
             * </li>
             * <li><p><strong>1</strong>：表示开启。</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder acwCookieStatus(Integer acwCookieStatus) {
                this.acwCookieStatus = acwCookieStatus;
                return this;
            }

            /**
             * <p>跟踪cookie的secure属性状态。</p>
             * <ul>
             * <li><p><strong>0</strong>：表示关闭。</p>
             * </li>
             * <li><p><strong>1</strong>：表示开启。</p>
             * </li>
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
             * <p>滑块cookie的secure属性状态。</p>
             * <ul>
             * <li><p><strong>0</strong>：表示关闭。</p>
             * </li>
             * <li><p><strong>1</strong>：表示开启。</p>
             * </li>
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
             * <p>An array of custom XFF headers that are used to identify the originating IP addresses of clients. If the value of the XffStatus parameter is 1 and the CustomHeaders field is left empty, the first IP address in the XFF header is the originating IP address of the client.</p>
             */
            public Builder customHeaders(java.util.List<String> customHeaders) {
                this.customHeaders = customHeaders;
                return this;
            }

            /**
             * <p>The description of the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The description of the protected object. Different key-value pairs in a map indicate different properties of the protected object.</p>
             */
            public Builder detail(java.util.Map<String, ?> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The creation time of the protected object. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652149203187</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The most recent modification time of the protected object. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665633032000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>多账号统一管理场景中防护对象资产归属账号。</p>
             * 
             * <strong>example:</strong>
             * <p>135*********46</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The protection pattern.</p>
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
             * <p>test</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm***q</p>
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * <p>The origin of the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder resourceOrigin(String resourceOrigin) {
                this.resourceOrigin = resourceOrigin;
                return this;
            }

            /**
             * <p>Indicates whether the X-Forwarded-For (XFF) header is used.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder xffStatus(Integer xffStatus) {
                this.xffStatus = xffStatus;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
