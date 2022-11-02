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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * TotalCount.
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

        @NameInMap("ResourceOrigin")
        private String resourceOrigin;

        @NameInMap("XffStatus")
        private Integer xffStatus;

        private Resources(Builder builder) {
            this.customHeaders = builder.customHeaders;
            this.description = builder.description;
            this.detail = builder.detail;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.pattern = builder.pattern;
            this.product = builder.product;
            this.resource = builder.resource;
            this.resourceGroup = builder.resourceGroup;
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
            private java.util.List < String > customHeaders; 
            private String description; 
            private java.util.Map < String, ? > detail; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String pattern; 
            private String product; 
            private String resource; 
            private String resourceGroup; 
            private String resourceOrigin; 
            private Integer xffStatus; 

            /**
             * CustomHeaders.
             */
            public Builder customHeaders(java.util.List < String > customHeaders) {
                this.customHeaders = customHeaders;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(java.util.Map < String, ? > detail) {
                this.detail = detail;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * ResourceGroup.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * ResourceOrigin.
             */
            public Builder resourceOrigin(String resourceOrigin) {
                this.resourceOrigin = resourceOrigin;
                return this;
            }

            /**
             * XffStatus.
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
