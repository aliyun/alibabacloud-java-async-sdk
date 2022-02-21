// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProductListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductListResponseBody</p>
 */
public class QueryProductListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryProductListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryProductListResponseBody build() {
            return new QueryProductListResponseBody(this);
        } 

    } 

    public static class Product extends TeaModel {
        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        private Product(Builder builder) {
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.subscriptionType = builder.subscriptionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Product create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public static final class Builder {
            private String productCode; 
            private String productName; 
            private String productType; 
            private String subscriptionType; 

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * SubscriptionType.
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            public Product build() {
                return new Product(this);
            } 

        } 

    }
    public static class ProductList extends TeaModel {
        @NameInMap("Product")
        private java.util.List < Product> product;

        private ProductList(Builder builder) {
            this.product = builder.product;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductList create() {
            return builder().build();
        }

        /**
         * @return product
         */
        public java.util.List < Product> getProduct() {
            return this.product;
        }

        public static final class Builder {
            private java.util.List < Product> product; 

            /**
             * Product.
             */
            public Builder product(java.util.List < Product> product) {
                this.product = product;
                return this;
            }

            public ProductList build() {
                return new ProductList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ProductList")
        private ProductList productList;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.productList = builder.productList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return productList
         */
        public ProductList getProductList() {
            return this.productList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNum; 
            private Integer pageSize; 
            private ProductList productList; 
            private Integer totalCount; 

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * ProductList.
             */
            public Builder productList(ProductList productList) {
                this.productList = productList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
