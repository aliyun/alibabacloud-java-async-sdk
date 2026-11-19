// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ProductPageResult} extends {@link TeaModel}
 *
 * <p>ProductPageResult</p>
 */
public class ProductPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextCursor")
    private String nextCursor;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("products")
    private java.util.List<Product> products;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer total;

    private ProductPageResult(Builder builder) {
        this.nextCursor = builder.nextCursor;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextCursor
     */
    public String getNextCursor() {
        return this.nextCursor;
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
    public java.util.List<Product> getProducts() {
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
        private String nextCursor; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<Product> products; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ProductPageResult model) {
            this.nextCursor = model.nextCursor;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.products = model.products;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The cursor value for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>7091510713</p>
         */
        public Builder nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product collection.</p>
         */
        public Builder products(java.util.List<Product> products) {
            this.products = products;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3239281273464326823</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total count.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
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
