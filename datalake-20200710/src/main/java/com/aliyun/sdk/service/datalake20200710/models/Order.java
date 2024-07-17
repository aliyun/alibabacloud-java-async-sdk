// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Order} extends {@link TeaModel}
 *
 * <p>Order</p>
 */
public class Order extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Col")
    private String col;

    @com.aliyun.core.annotation.NameInMap("Order")
    private Integer order;

    private Order(Builder builder) {
        this.col = builder.col;
        this.order = builder.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Order create() {
        return builder().build();
    }

    /**
     * @return col
     */
    public String getCol() {
        return this.col;
    }

    /**
     * @return order
     */
    public Integer getOrder() {
        return this.order;
    }

    public static final class Builder {
        private String col; 
        private Integer order; 

        /**
         * Col.
         */
        public Builder col(String col) {
            this.col = col;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(Integer order) {
            this.order = order;
            return this;
        }

        public Order build() {
            return new Order(this);
        } 

    } 

}
