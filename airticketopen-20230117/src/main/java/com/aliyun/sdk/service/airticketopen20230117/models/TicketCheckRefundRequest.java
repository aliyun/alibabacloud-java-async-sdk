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
 * {@link TicketCheckRefundRequest} extends {@link RequestModel}
 *
 * <p>TicketCheckRefundRequest</p>
 */
public class TicketCheckRefundRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistributorOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String distributorOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundReason")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refundReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundRemark")
    private String refundRemark;

    private TicketCheckRefundRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.distributorOrderId = builder.distributorOrderId;
        this.refundReason = builder.refundReason;
        this.refundRemark = builder.refundRemark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketCheckRefundRequest create() {
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
     * @return distributorOrderId
     */
    public String getDistributorOrderId() {
        return this.distributorOrderId;
    }

    /**
     * @return refundReason
     */
    public String getRefundReason() {
        return this.refundReason;
    }

    /**
     * @return refundRemark
     */
    public String getRefundRemark() {
        return this.refundRemark;
    }

    public static final class Builder extends Request.Builder<TicketCheckRefundRequest, Builder> {
        private Long accountNo; 
        private String distributorOrderId; 
        private String refundReason; 
        private String refundRemark; 

        private Builder() {
            super();
        } 

        private Builder(TicketCheckRefundRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.distributorOrderId = request.distributorOrderId;
            this.refundReason = request.refundReason;
            this.refundRemark = request.refundRemark;
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
         * <p>123456</p>
         */
        public Builder distributorOrderId(String distributorOrderId) {
            this.putBodyParameter("DistributorOrderId", distributorOrderId);
            this.distributorOrderId = distributorOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>计划有变</p>
         */
        public Builder refundReason(String refundReason) {
            this.putBodyParameter("RefundReason", refundReason);
            this.refundReason = refundReason;
            return this;
        }

        /**
         * RefundRemark.
         */
        public Builder refundRemark(String refundRemark) {
            this.putBodyParameter("RefundRemark", refundRemark);
            this.refundRemark = refundRemark;
            return this;
        }

        @Override
        public TicketCheckRefundRequest build() {
            return new TicketCheckRefundRequest(this);
        } 

    } 

}
