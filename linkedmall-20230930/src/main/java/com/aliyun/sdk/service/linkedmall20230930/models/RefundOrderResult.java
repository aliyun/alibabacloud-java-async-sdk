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
 * {@link RefundOrderResult} extends {@link TeaModel}
 *
 * <p>RefundOrderResult</p>
 */
public class RefundOrderResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disputeId")
    private String disputeId;

    @com.aliyun.core.annotation.NameInMap("disputeStatus")
    private Integer disputeStatus;

    @com.aliyun.core.annotation.NameInMap("orderLineId")
    private String orderLineId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RefundOrderResult(Builder builder) {
        this.disputeId = builder.disputeId;
        this.disputeStatus = builder.disputeStatus;
        this.orderLineId = builder.orderLineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundOrderResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String orderLineId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RefundOrderResult model) {
            this.disputeId = model.disputeId;
            this.disputeStatus = model.disputeStatus;
            this.orderLineId = model.orderLineId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Dispute ID</p>
         * 
         * <strong>example:</strong>
         * <p>6693****4352</p>
         */
        public Builder disputeId(String disputeId) {
            this.disputeId = disputeId;
            return this;
        }

        /**
         * <p>Status of the reverse operation<br>1 – Return pending<br>2 – Awaiting buyer return<br>3 – Awaiting merchant receipt<br>4 – Refund closed<br>5 – Refund succeeded<br>6 – Refund denied<br>17 – Canceling refund</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder disputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }

        /**
         * <p>Sub-distribution order ID for which the reverse operation was initiated</p>
         * 
         * <strong>example:</strong>
         * <p>6692****5458</p>
         */
        public Builder orderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        /**
         * <p>API request ID</p>
         * 
         * <strong>example:</strong>
         * <p>3239281273464326823</p>
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
