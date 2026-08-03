// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link ApplyRefundRequest} extends {@link RequestModel}
 *
 * <p>ApplyRefundRequest</p>
 */
public class ApplyRefundRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundReason")
    private String refundReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private ApplyRefundRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.orderNo = builder.orderNo;
        this.refundReason = builder.refundReason;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyRefundRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return orderNo
     */
    public String getOrderNo() {
        return this.orderNo;
    }

    /**
     * @return refundReason
     */
    public String getRefundReason() {
        return this.refundReason;
    }

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder extends Request.Builder<ApplyRefundRequest, Builder> {
        private Long accountNo; 
        private String orderNo; 
        private String refundReason; 
        private String tracerId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyRefundRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.orderNo = request.orderNo;
            this.refundReason = request.refundReason;
            this.tracerId = request.tracerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SO202606290001</p>
         */
        public Builder orderNo(String orderNo) {
            this.putBodyParameter("OrderNo", orderNo);
            this.orderNo = orderNo;
            return this;
        }

        /**
         * RefundReason.
         */
        public Builder refundReason(String refundReason) {
            this.putBodyParameter("RefundReason", refundReason);
            this.refundReason = refundReason;
            return this;
        }

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.putBodyParameter("TracerId", tracerId);
            this.tracerId = tracerId;
            return this;
        }

        @Override
        public ApplyRefundRequest build() {
            return new ApplyRefundRequest(this);
        } 

    } 

}
