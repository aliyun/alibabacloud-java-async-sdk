// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIAgentOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIAgentOrderResponseBody</p>
 */
public class DescribeAIAgentOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    private String agentVersion;

    @com.aliyun.core.annotation.NameInMap("CapacityPack")
    private String capacityPack;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("HasOrder")
    private Boolean hasOrder;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("OrderName")
    private String orderName;

    @com.aliyun.core.annotation.NameInMap("OrderNum")
    private String orderNum;

    @com.aliyun.core.annotation.NameInMap("OrderStatus")
    private String orderStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAIAgentOrderResponseBody(Builder builder) {
        this.agentVersion = builder.agentVersion;
        this.capacityPack = builder.capacityPack;
        this.expireTime = builder.expireTime;
        this.hasOrder = builder.hasOrder;
        this.orderId = builder.orderId;
        this.orderName = builder.orderName;
        this.orderNum = builder.orderNum;
        this.orderStatus = builder.orderStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIAgentOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return capacityPack
     */
    public String getCapacityPack() {
        return this.capacityPack;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return hasOrder
     */
    public Boolean getHasOrder() {
        return this.hasOrder;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderName
     */
    public String getOrderName() {
        return this.orderName;
    }

    /**
     * @return orderNum
     */
    public String getOrderNum() {
        return this.orderNum;
    }

    /**
     * @return orderStatus
     */
    public String getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String agentVersion; 
        private String capacityPack; 
        private String expireTime; 
        private Boolean hasOrder; 
        private String orderId; 
        private String orderName; 
        private String orderNum; 
        private String orderStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAIAgentOrderResponseBody model) {
            this.agentVersion = model.agentVersion;
            this.capacityPack = model.capacityPack;
            this.expireTime = model.expireTime;
            this.hasOrder = model.hasOrder;
            this.orderId = model.orderId;
            this.orderName = model.orderName;
            this.orderNum = model.orderNum;
            this.orderStatus = model.orderStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The AI assistant version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * <p>The capacity package specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>small</p>
         */
        public Builder capacityPack(String capacityPack) {
            this.capacityPack = capacityPack;
            return this;
        }

        /**
         * <p>The expiration time of the order in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-01-01T00:00:00Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Indicates whether the current account has an AI assistant order.</p>
         */
        public Builder hasOrder(Boolean hasOrder) {
            this.hasOrder = hasOrder;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>order-001</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The order name.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-copilot-001</p>
         */
        public Builder orderName(String orderName) {
            this.orderName = orderName;
            return this;
        }

        /**
         * <p>The order number.</p>
         * 
         * <strong>example:</strong>
         * <p>ord-001</p>
         */
        public Builder orderNum(String orderNum) {
            this.orderNum = orderNum;
            return this;
        }

        /**
         * <p>The order status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder orderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIAgentOrderResponseBody build() {
            return new DescribeAIAgentOrderResponseBody(this);
        } 

    } 

}
