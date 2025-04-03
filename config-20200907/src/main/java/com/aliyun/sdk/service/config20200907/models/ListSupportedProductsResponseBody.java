// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListSupportedProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupportedProductsResponseBody</p>
 */
public class ListSupportedProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Products")
    private java.util.List<Products> products;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSupportedProductsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.products = builder.products;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportedProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return products
     */
    public java.util.List<Products> getProducts() {
        return this.products;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String maxResults; 
        private String nextToken; 
        private java.util.List<Products> products; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSupportedProductsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.products = model.products;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The maximum number of entries to return for a single request. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>D3AjqMNSy0ls7zBNCf3a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The cloud services that are supported by Cloud Config.</p>
         */
        public Builder products(java.util.List<Products> products) {
            this.products = products;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>610B0276-ABEE-57DF-9C13-C2324FADA9D7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSupportedProductsResponseBody build() {
            return new ListSupportedProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSupportedProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupportedProductsResponseBody</p>
     */
    public static class ResourceTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TypeNameEn")
        private String typeNameEn;

        @com.aliyun.core.annotation.NameInMap("TypeNameZh")
        private String typeNameZh;

        @com.aliyun.core.annotation.NameInMap("TypePageLink")
        private String typePageLink;

        private ResourceTypeList(Builder builder) {
            this.resourceType = builder.resourceType;
            this.typeNameEn = builder.typeNameEn;
            this.typeNameZh = builder.typeNameZh;
            this.typePageLink = builder.typePageLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypeList create() {
            return builder().build();
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return typeNameEn
         */
        public String getTypeNameEn() {
            return this.typeNameEn;
        }

        /**
         * @return typeNameZh
         */
        public String getTypeNameZh() {
            return this.typeNameZh;
        }

        /**
         * @return typePageLink
         */
        public String getTypePageLink() {
            return this.typePageLink;
        }

        public static final class Builder {
            private String resourceType; 
            private String typeNameEn; 
            private String typeNameZh; 
            private String typePageLink; 

            private Builder() {
            } 

            private Builder(ResourceTypeList model) {
                this.resourceType = model.resourceType;
                this.typeNameEn = model.typeNameEn;
                this.typeNameZh = model.typeNameZh;
                this.typePageLink = model.typePageLink;
            } 

            /**
             * <p>The identifier of the resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::Instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The English name of the resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Ecs Instance</p>
             */
            public Builder typeNameEn(String typeNameEn) {
                this.typeNameEn = typeNameEn;
                return this;
            }

            /**
             * <p>The Chinese name of the resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS实例</p>
             */
            public Builder typeNameZh(String typeNameZh) {
                this.typeNameZh = typeNameZh;
                return this;
            }

            /**
             * <p>The URL of the resource type in the console.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ecs.console.aliyun.com/#/server/@%7BResourceId%7D/detail?regionId=@%7BRegionId%7D">https://ecs.console.aliyun.com/#/server/@{ResourceId}/detail?regionId=@{RegionId}</a></p>
             */
            public Builder typePageLink(String typePageLink) {
                this.typePageLink = typePageLink;
                return this;
            }

            public ResourceTypeList build() {
                return new ResourceTypeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSupportedProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupportedProductsResponseBody</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductNameEn")
        private String productNameEn;

        @com.aliyun.core.annotation.NameInMap("ProductNameZh")
        private String productNameZh;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeList")
        private java.util.List<ResourceTypeList> resourceTypeList;

        private Products(Builder builder) {
            this.productNameEn = builder.productNameEn;
            this.productNameZh = builder.productNameZh;
            this.resourceTypeList = builder.resourceTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return productNameEn
         */
        public String getProductNameEn() {
            return this.productNameEn;
        }

        /**
         * @return productNameZh
         */
        public String getProductNameZh() {
            return this.productNameZh;
        }

        /**
         * @return resourceTypeList
         */
        public java.util.List<ResourceTypeList> getResourceTypeList() {
            return this.resourceTypeList;
        }

        public static final class Builder {
            private String productNameEn; 
            private String productNameZh; 
            private java.util.List<ResourceTypeList> resourceTypeList; 

            private Builder() {
            } 

            private Builder(Products model) {
                this.productNameEn = model.productNameEn;
                this.productNameZh = model.productNameZh;
                this.resourceTypeList = model.resourceTypeList;
            } 

            /**
             * <p>The English name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute Service</p>
             */
            public Builder productNameEn(String productNameEn) {
                this.productNameEn = productNameEn;
                return this;
            }

            /**
             * <p>The Chinese name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>云服务器ECS</p>
             */
            public Builder productNameZh(String productNameZh) {
                this.productNameZh = productNameZh;
                return this;
            }

            /**
             * <p>The resource types that are supported by Cloud Config.</p>
             */
            public Builder resourceTypeList(java.util.List<ResourceTypeList> resourceTypeList) {
                this.resourceTypeList = resourceTypeList;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
}
