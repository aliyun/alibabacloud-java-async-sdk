// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderListResult} extends {@link TeaModel}
 *
 * <p>OrderListResult</p>
 */
public class OrderListResult extends TeaModel {
    @NameInMap("orderList")
    private java.util.List < OrderResult > orderList;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("total")
    private Integer total;

    private OrderListResult(Builder builder) {
        this.orderList = builder.orderList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderListResult create() {
        return builder().build();
    }

    /**
     * @return orderList
     */
    public java.util.List < OrderResult > getOrderList() {
        return this.orderList;
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
        private java.util.List < OrderResult > orderList; 
        private String requestId; 
        private Integer total; 

        /**
         * orderList.
         */
        public Builder orderList(java.util.List < OrderResult > orderList) {
            this.orderList = orderList;
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

        public OrderListResult build() {
            return new OrderListResult(this);
        } 

    } 

}
