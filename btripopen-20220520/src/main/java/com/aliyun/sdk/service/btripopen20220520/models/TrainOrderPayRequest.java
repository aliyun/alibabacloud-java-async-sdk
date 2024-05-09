// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainOrderPayRequest} extends {@link RequestModel}
 *
 * <p>TrainOrderPayRequest</p>
 */
public class TrainOrderPayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pay_amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long payAmount;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainOrderPayRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.payAmount = builder.payAmount;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainOrderPayRequest create() {
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
     * @return payAmount
     */
    public Long getPayAmount() {
        return this.payAmount;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainOrderPayRequest, Builder> {
        private String orderId; 
        private String outOrderId; 
        private Long payAmount; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainOrderPayRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.payAmount = request.payAmount;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * order_id.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * pay_amount.
         */
        public Builder payAmount(Long payAmount) {
            this.putBodyParameter("pay_amount", payAmount);
            this.payAmount = payAmount;
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
        public TrainOrderPayRequest build() {
            return new TrainOrderPayRequest(this);
        } 

    } 

}
