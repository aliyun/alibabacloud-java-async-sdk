// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Products> products;

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
    public java.util.List < Products> getProducts() {
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
        private java.util.List < Products> products; 
        private String requestId; 

        /**
         * The maximum number of entries to return for a single request. Valid values: 1 to 500.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The cloud services that are supported by Cloud Config.
         */
        public Builder products(java.util.List < Products> products) {
            this.products = products;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSupportedProductsResponseBody build() {
            return new ListSupportedProductsResponseBody(this);
        } 

    } 

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

            /**
             * The identifier of the resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The English name of the resource type.
             */
            public Builder typeNameEn(String typeNameEn) {
                this.typeNameEn = typeNameEn;
                return this;
            }

            /**
             * The Chinese name of the resource type.
             */
            public Builder typeNameZh(String typeNameZh) {
                this.typeNameZh = typeNameZh;
                return this;
            }

            /**
             * The URL of the resource type in the console.
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
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductNameEn")
        private String productNameEn;

        @com.aliyun.core.annotation.NameInMap("ProductNameZh")
        private String productNameZh;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeList")
        private java.util.List < ResourceTypeList> resourceTypeList;

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
        public java.util.List < ResourceTypeList> getResourceTypeList() {
            return this.resourceTypeList;
        }

        public static final class Builder {
            private String productNameEn; 
            private String productNameZh; 
            private java.util.List < ResourceTypeList> resourceTypeList; 

            /**
             * The English name of the Alibaba Cloud service.
             */
            public Builder productNameEn(String productNameEn) {
                this.productNameEn = productNameEn;
                return this;
            }

            /**
             * The Chinese name of the Alibaba Cloud service.
             */
            public Builder productNameZh(String productNameZh) {
                this.productNameZh = productNameZh;
                return this;
            }

            /**
             * The resource types that are supported by Cloud Config.
             */
            public Builder resourceTypeList(java.util.List < ResourceTypeList> resourceTypeList) {
                this.resourceTypeList = resourceTypeList;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
}
