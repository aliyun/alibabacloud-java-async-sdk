// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundOrderResult} extends {@link TeaModel}
 *
 * <p>RefundOrderResult</p>
 */
public class RefundOrderResult extends TeaModel {
    @NameInMap("disputeId")
    private String disputeId;

    @NameInMap("disputeStatus")
    private Integer disputeStatus;

    @NameInMap("disputeType")
    private Integer disputeType;

    @NameInMap("orderLineId")
    private String orderLineId;

    @NameInMap("requestId")
    private String requestId;

    private RefundOrderResult(Builder builder) {
        this.disputeId = builder.disputeId;
        this.disputeStatus = builder.disputeStatus;
        this.disputeType = builder.disputeType;
        this.orderLineId = builder.orderLineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundOrderResult create() {
        return builder().build();
    }

    /**
     * @return disputeId
     */
    public String getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return disputeStatus
     */
    public Integer getDisputeStatus() {
        return this.disputeStatus;
    }

    /**
     * @return disputeType
     */
    public Integer getDisputeType() {
        return this.disputeType;
    }

    /**
     * @return orderLineId
     */
    public String getOrderLineId() {
        return this.orderLineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String disputeId; 
        private Integer disputeStatus; 
        private Integer disputeType; 
        private String orderLineId; 
        private String requestId; 

        /**
         * disputeId.
         */
        public Builder disputeId(String disputeId) {
            this.disputeId = disputeId;
            return this;
        }

        /**
         * disputeStatus.
         */
        public Builder disputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }

        /**
         * disputeType.
         */
        public Builder disputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }

        /**
         * orderLineId.
         */
        public Builder orderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefundOrderResult build() {
            return new RefundOrderResult(this);
        } 

    } 

}
