// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link IntlFlightRefundDetailRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightRefundDetailRequest</p>
 */
public class IntlFlightRefundDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_refund_apply_id")
    private String outRefundApplyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("refund_apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refundApplyId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightRefundDetailRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outRefundApplyId = builder.outRefundApplyId;
        this.refundApplyId = builder.refundApplyId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightRefundDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return outRefundApplyId
     */
    public String getOutRefundApplyId() {
        return this.outRefundApplyId;
    }

    /**
     * @return refundApplyId
     */
    public String getRefundApplyId() {
        return this.refundApplyId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightRefundDetailRequest, Builder> {
        private String orderId; 
        private String outOrderId; 
        private String outRefundApplyId; 
        private String refundApplyId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightRefundDetailRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outRefundApplyId = request.outRefundApplyId;
            this.refundApplyId = request.refundApplyId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002145190081005400</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putQueryParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * out_refund_apply_id.
         */
        public Builder outRefundApplyId(String outRefundApplyId) {
            this.putQueryParameter("out_refund_apply_id", outRefundApplyId);
            this.outRefundApplyId = outRefundApplyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder refundApplyId(String refundApplyId) {
            this.putQueryParameter("refund_apply_id", refundApplyId);
            this.refundApplyId = refundApplyId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public IntlFlightRefundDetailRequest build() {
            return new IntlFlightRefundDetailRequest(this);
        } 

    } 

}
