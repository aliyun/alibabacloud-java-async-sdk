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
 * {@link TicketQueryRefundOrderRequest} extends {@link RequestModel}
 *
 * <p>TicketQueryRefundOrderRequest</p>
 */
public class TicketQueryRefundOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistributorOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String distributorOrderId;

    private TicketQueryRefundOrderRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.distributorOrderId = builder.distributorOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketQueryRefundOrderRequest create() {
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

    public static final class Builder extends Request.Builder<TicketQueryRefundOrderRequest, Builder> {
        private Long accountNo; 
        private String distributorOrderId; 

        private Builder() {
            super();
        } 

        private Builder(TicketQueryRefundOrderRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.distributorOrderId = request.distributorOrderId;
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

        @Override
        public TicketQueryRefundOrderRequest build() {
            return new TicketQueryRefundOrderRequest(this);
        } 

    } 

}
