// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Order} extends {@link TeaModel}
 *
 * <p>Order</p>
 */
public class Order extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("OrderId")
    private String orderId;

    private Order(Builder builder) {
        this.createTime = builder.createTime;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Order create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder {
        private String createTime; 
        private String orderId; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Order build() {
            return new Order(this);
        } 

    } 

}
