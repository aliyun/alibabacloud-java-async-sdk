// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProductPageResult} extends {@link TeaModel}
 *
 * <p>ProductPageResult</p>
 */
public class ProductPageResult extends TeaModel {
    @NameInMap("pageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @NameInMap("pageSize")
    @Validation(required = true)
    private Integer pageSize;

    @NameInMap("products")
    private java.util.List < Product > products;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("total")
    @Validation(required = true)
    private Integer total;

    private ProductPageResult(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.products = builder.products;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductPageResult create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return products
     */
    public java.util.List < Product > getProducts() {
        return this.products;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < Product > products; 
        private String requestId; 
        private Integer total; 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * products.
         */
        public Builder products(java.util.List < Product > products) {
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
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ProductPageResult build() {
            return new ProductPageResult(this);
        } 

    } 

}
