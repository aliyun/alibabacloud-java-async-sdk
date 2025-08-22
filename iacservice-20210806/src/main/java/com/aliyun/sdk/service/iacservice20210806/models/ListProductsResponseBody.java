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
 * {@link ListProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsResponseBody</p>
 */
public class ListProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("products")
    private java.util.List<Products> products;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListProductsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.products = builder.products;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsResponseBody create() {
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Products> products; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProductsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.products = model.products;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * products.
         */
        public Builder products(java.util.List<Products> products) {
            this.products = products;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProductsResponseBody build() {
            return new ListProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("firstCategoryName")
        private String firstCategoryName;

        @com.aliyun.core.annotation.NameInMap("firstCategoryNameEn")
        private String firstCategoryNameEn;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("productNameEn")
        private String productNameEn;

        @com.aliyun.core.annotation.NameInMap("secondCategoryName")
        private String secondCategoryName;

        @com.aliyun.core.annotation.NameInMap("secondCategoryNameEn")
        private String secondCategoryNameEn;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subcategory")
        private String subcategory;

        @com.aliyun.core.annotation.NameInMap("supportTerraformer")
        private Boolean supportTerraformer;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        private Products(Builder builder) {
            this.firstCategoryName = builder.firstCategoryName;
            this.firstCategoryNameEn = builder.firstCategoryNameEn;
            this.product = builder.product;
            this.productName = builder.productName;
            this.productNameEn = builder.productNameEn;
            this.secondCategoryName = builder.secondCategoryName;
            this.secondCategoryNameEn = builder.secondCategoryNameEn;
            this.status = builder.status;
            this.subcategory = builder.subcategory;
            this.supportTerraformer = builder.supportTerraformer;
            this.terraformProviderVersion = builder.terraformProviderVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return firstCategoryName
         */
        public String getFirstCategoryName() {
            return this.firstCategoryName;
        }

        /**
         * @return firstCategoryNameEn
         */
        public String getFirstCategoryNameEn() {
            return this.firstCategoryNameEn;
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
         * @return productNameEn
         */
        public String getProductNameEn() {
            return this.productNameEn;
        }

        /**
         * @return secondCategoryName
         */
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        /**
         * @return secondCategoryNameEn
         */
        public String getSecondCategoryNameEn() {
            return this.secondCategoryNameEn;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
        public Boolean getSupportTerraformer() {
            return this.supportTerraformer;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public static final class Builder {
            private String firstCategoryName; 
            private String firstCategoryNameEn; 
            private String product; 
            private String productName; 
            private String productNameEn; 
            private String secondCategoryName; 
            private String secondCategoryNameEn; 
            private String status; 
            private String subcategory; 
            private Boolean supportTerraformer; 
            private String terraformProviderVersion; 

            private Builder() {
            } 

            private Builder(Products model) {
                this.firstCategoryName = model.firstCategoryName;
                this.firstCategoryNameEn = model.firstCategoryNameEn;
                this.product = model.product;
                this.productName = model.productName;
                this.productNameEn = model.productNameEn;
                this.secondCategoryName = model.secondCategoryName;
                this.secondCategoryNameEn = model.secondCategoryNameEn;
                this.status = model.status;
                this.subcategory = model.subcategory;
                this.supportTerraformer = model.supportTerraformer;
                this.terraformProviderVersion = model.terraformProviderVersion;
            } 

            /**
             * firstCategoryName.
             */
            public Builder firstCategoryName(String firstCategoryName) {
                this.firstCategoryName = firstCategoryName;
                return this;
            }

            /**
             * firstCategoryNameEn.
             */
            public Builder firstCategoryNameEn(String firstCategoryNameEn) {
                this.firstCategoryNameEn = firstCategoryNameEn;
                return this;
            }

            /**
             * product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productNameEn.
             */
            public Builder productNameEn(String productNameEn) {
                this.productNameEn = productNameEn;
                return this;
            }

            /**
             * secondCategoryName.
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
                return this;
            }

            /**
             * secondCategoryNameEn.
             */
            public Builder secondCategoryNameEn(String secondCategoryNameEn) {
                this.secondCategoryNameEn = secondCategoryNameEn;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * subcategory.
             */
            public Builder subcategory(String subcategory) {
                this.subcategory = subcategory;
                return this;
            }

            /**
             * supportTerraformer.
             */
            public Builder supportTerraformer(Boolean supportTerraformer) {
                this.supportTerraformer = supportTerraformer;
                return this;
            }

            /**
             * terraformProviderVersion.
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
}
