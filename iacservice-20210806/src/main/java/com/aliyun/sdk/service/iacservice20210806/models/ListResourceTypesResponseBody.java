// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListResourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceTypesResponseBody</p>
 */
public class ListResourceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceTypes")
    private java.util.List<ResourceTypes> resourceTypes;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListResourceTypesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceTypes = builder.resourceTypes;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List<ResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ResourceTypes> resourceTypes; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListResourceTypesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resourceTypes = model.resourceTypes;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries per page. Valid values: 0 to 200. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>LC4NJL3Ru2bIiRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9bcaac3c-420d-4303-87ab-7638c07b0a0b</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of resources.</p>
         */
        public Builder resourceTypes(java.util.List<ResourceTypes> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>93</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceTypesResponseBody build() {
            return new ListResourceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceTypesResponseBody</p>
     */
    public static class ResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("resourceDetailPageUrl")
        private String resourceDetailPageUrl;

        @com.aliyun.core.annotation.NameInMap("resourceListPageUrl")
        private String resourceListPageUrl;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusStartVersion")
        private String statusStartVersion;

        @com.aliyun.core.annotation.NameInMap("subcategory")
        private String subcategory;

        @com.aliyun.core.annotation.NameInMap("supportTerraformer")
        private String supportTerraformer;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        @com.aliyun.core.annotation.NameInMap("terraformResourceType")
        private String terraformResourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private ResourceTypes(Builder builder) {
            this.description = builder.description;
            this.product = builder.product;
            this.productName = builder.productName;
            this.resourceDetailPageUrl = builder.resourceDetailPageUrl;
            this.resourceListPageUrl = builder.resourceListPageUrl;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.statusStartVersion = builder.statusStartVersion;
            this.subcategory = builder.subcategory;
            this.supportTerraformer = builder.supportTerraformer;
            this.terraformProviderVersion = builder.terraformProviderVersion;
            this.terraformResourceType = builder.terraformResourceType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypes create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return resourceDetailPageUrl
         */
        public String getResourceDetailPageUrl() {
            return this.resourceDetailPageUrl;
        }

        /**
         * @return resourceListPageUrl
         */
        public String getResourceListPageUrl() {
            return this.resourceListPageUrl;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusStartVersion
         */
        public String getStatusStartVersion() {
            return this.statusStartVersion;
        }

        /**
         * @return subcategory
         */
        public String getSubcategory() {
            return this.subcategory;
        }

        /**
         * @return supportTerraformer
         */
        public String getSupportTerraformer() {
            return this.supportTerraformer;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        /**
         * @return terraformResourceType
         */
        public String getTerraformResourceType() {
            return this.terraformResourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String product; 
            private String productName; 
            private String resourceDetailPageUrl; 
            private String resourceListPageUrl; 
            private String resourceType; 
            private String status; 
            private String statusStartVersion; 
            private String subcategory; 
            private String supportTerraformer; 
            private String terraformProviderVersion; 
            private String terraformResourceType; 
            private String title; 

            private Builder() {
            } 

            private Builder(ResourceTypes model) {
                this.description = model.description;
                this.product = model.product;
                this.productName = model.productName;
                this.resourceDetailPageUrl = model.resourceDetailPageUrl;
                this.resourceListPageUrl = model.resourceListPageUrl;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.statusStartVersion = model.statusStartVersion;
                this.subcategory = model.subcategory;
                this.supportTerraformer = model.supportTerraformer;
                this.terraformProviderVersion = model.terraformProviderVersion;
                this.terraformResourceType = model.terraformResourceType;
                this.title = model.title;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Route Table</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>专有网络VPC</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The URL of the resource details page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://vpc.console.aliyun.com/vpc/$%7BRegionId%7D/route-tables/$%7BRouteTableId%7D">https://vpc.console.aliyun.com/vpc/${RegionId}/route-tables/${RouteTableId}</a></p>
             */
            public Builder resourceDetailPageUrl(String resourceDetailPageUrl) {
                this.resourceDetailPageUrl = resourceDetailPageUrl;
                return this;
            }

            /**
             * <p>The URL of the resources page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://vpc.console.aliyun.com/vpc/$%7BRegionId%7D/route-tables">https://vpc.console.aliyun.com/vpc/${RegionId}/route-tables</a></p>
             */
            public Builder resourceListPageUrl(String resourceListPageUrl) {
                this.resourceListPageUrl = resourceListPageUrl;
                return this;
            }

            /**
             * <p>The Alibaba Cloud resource type in the format of ALIYUN::\<cloud service>::\<resource type>.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::VPC::VPC</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The resource status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version from which the resource status takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder statusStartVersion(String statusStartVersion) {
                this.statusStartVersion = statusStartVersion;
                return this;
            }

            /**
             * <p>The product subcategory in Terraform.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder subcategory(String subcategory) {
                this.subcategory = subcategory;
                return this;
            }

            /**
             * <p>Specifies whether Terraformer is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportTerraformer(String supportTerraformer) {
                this.supportTerraformer = supportTerraformer;
                return this;
            }

            /**
             * <p>The Terraform Provider version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.248.0</p>
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            /**
             * <p>The resource type in Terraform.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud_route_table</p>
             */
            public Builder terraformResourceType(String terraformResourceType) {
                this.terraformResourceType = terraformResourceType;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>Route Table</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ResourceTypes build() {
                return new ResourceTypes(this);
            } 

        } 

    }
}
