// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ModifyInstanceGroupSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceGroupSpecResponseBody</p>
 */
public class ModifyInstanceGroupSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderInfo")
    private java.util.List<OrderInfo> orderInfo;

    @com.aliyun.core.annotation.NameInMap("OrderTaskId")
    private String orderTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceGroupSpecResponseBody(Builder builder) {
        this.orderInfo = builder.orderInfo;
        this.orderTaskId = builder.orderTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceGroupSpecResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderInfo
     */
    public java.util.List<OrderInfo> getOrderInfo() {
        return this.orderInfo;
    }

    /**
     * @return orderTaskId
     */
    public String getOrderTaskId() {
        return this.orderTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<OrderInfo> orderInfo; 
        private String orderTaskId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyInstanceGroupSpecResponseBody model) {
            this.orderInfo = model.orderInfo;
            this.orderTaskId = model.orderTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * OrderInfo.
         */
        public Builder orderInfo(java.util.List<OrderInfo> orderInfo) {
            this.orderInfo = orderInfo;
            return this;
        }

        /**
         * OrderTaskId.
         */
        public Builder orderTaskId(String orderTaskId) {
            this.orderTaskId = orderTaskId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceGroupSpecResponseBody build() {
            return new ModifyInstanceGroupSpecResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceGroupSpecResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyInstanceGroupSpecResponseBody</p>
     */
    public static class OrderInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        private OrderInfo(Builder builder) {
            this.instanceIds = builder.instanceIds;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderInfo create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private java.util.List<String> instanceIds; 
            private String orderId; 

            private Builder() {
            } 

            private Builder(OrderInfo model) {
                this.instanceIds = model.instanceIds;
                this.orderId = model.orderId;
            } 

            /**
             * InstanceIds.
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public OrderInfo build() {
                return new OrderInfo(this);
            } 

        } 

    }
}
