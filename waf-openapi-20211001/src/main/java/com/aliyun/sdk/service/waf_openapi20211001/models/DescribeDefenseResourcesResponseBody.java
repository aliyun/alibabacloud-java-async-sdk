// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourcesResponseBody</p>
 */
public class DescribeDefenseResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private java.util.List < Resources> resources;

    @NameInMap("TotalCount")
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
    public java.util.List < Resources> getResources() {
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
        private java.util.List < Resources> resources; 
        private Long totalCount; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array of protected objects.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * The total number of entries that are returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseResourcesResponseBody build() {
            return new DescribeDefenseResourcesResponseBody(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("AcwCookieStatus")
        private Integer acwCookieStatus;

        @NameInMap("AcwSecureStatus")
        private Integer acwSecureStatus;

        @NameInMap("AcwV3SecureStatus")
        private Integer acwV3SecureStatus;

        @NameInMap("CustomHeaders")
        private java.util.List < String > customHeaders;

        @NameInMap("Description")
        private String description;

        @NameInMap("Detail")
        private java.util.Map < String, ? > detail;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Pattern")
        private String pattern;

        @NameInMap("Product")
        private String product;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("ResourceGroup")
        private String resourceGroup;

        @NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @NameInMap("ResourceOrigin")
        private String resourceOrigin;

        @NameInMap("XffStatus")
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
            private String pattern; 
            private String product; 
            private String resource; 
            private String resourceGroup; 
            private String resourceManagerResourceGroupId; 
            private String resourceOrigin; 
            private Integer xffStatus; 

            /**
             * 跟踪cookie开关状态。
             * <p>
             * 
             * - **0**：表示关闭。
             * 
             * - **1**：表示开启。
             */
            public Builder acwCookieStatus(Integer acwCookieStatus) {
                this.acwCookieStatus = acwCookieStatus;
                return this;
            }

            /**
             * 跟踪cookie的secure属性状态。
             * <p>
             * 
             * - **0**：表示关闭。
             * 
             * - **1**：表示开启。
             */
            public Builder acwSecureStatus(Integer acwSecureStatus) {
                this.acwSecureStatus = acwSecureStatus;
                return this;
            }

            /**
             * 滑块cookie的secure属性状态。
             * <p>
             * 
             * - **0**：表示关闭。
             * 
             * - **1**：表示开启。
             */
            public Builder acwV3SecureStatus(Integer acwV3SecureStatus) {
                this.acwV3SecureStatus = acwV3SecureStatus;
                return this;
            }

            /**
             * An array of custom XFF headers that are used to identify the originating IP addresses of clients. If the value of the XffStatus parameter is 1 and the CustomHeaders field is left empty, the first IP address in the XFF header is the originating IP address of the client.
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
             * The description of the protected object. Different key-value pairs in a map indicate different properties of the protected object.
             */
            public Builder detail(java.util.Map < String, ? > detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The creation time of the protected object. Unit: seconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The most recent modification time of the protected object. Unit: seconds.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The protection pattern.
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
             * The ID of the resource group.
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * The origin of the protected object.
             */
            public Builder resourceOrigin(String resourceOrigin) {
                this.resourceOrigin = resourceOrigin;
                return this;
            }

            /**
             * Indicates whether the X-Forwarded-For (XFF) header is used.
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
