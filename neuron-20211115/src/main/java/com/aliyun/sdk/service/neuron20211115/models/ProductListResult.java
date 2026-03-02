// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ProductListResult} extends {@link TeaModel}
 *
 * <p>ProductListResult</p>
 */
public class ProductListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("products")
    private java.util.List<Product> products;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ProductListResult(Builder builder) {
        this.products = builder.products;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private java.util.List<Product> products; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ProductListResult model) {
            this.products = model.products;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * products.
         */
        public Builder products(java.util.List<Product> products) {
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

        public ProductListResult build() {
            return new ProductListResult(this);
        } 

    } 

}
