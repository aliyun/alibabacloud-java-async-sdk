// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlightPayOrderV2Request} extends {@link RequestModel}
 *
 * <p>FlightPayOrderV2Request</p>
 */
public class FlightPayOrderV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_price")
    private Long totalPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_service_fee_price")
    private Long totalServiceFeePrice;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightPayOrderV2Request(Builder builder) {
        super(builder);
        this.isvName = builder.isvName;
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.totalPrice = builder.totalPrice;
        this.totalServiceFeePrice = builder.totalServiceFeePrice;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightPayOrderV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
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
     * @return totalPrice
     */
    public Long getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * @return totalServiceFeePrice
     */
    public Long getTotalServiceFeePrice() {
        return this.totalServiceFeePrice;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightPayOrderV2Request, Builder> {
        private String isvName; 
        private String orderId; 
        private String outOrderId; 
        private Long totalPrice; 
        private Long totalServiceFeePrice; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightPayOrderV2Request request) {
            super(request);
            this.isvName = request.isvName;
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.totalPrice = request.totalPrice;
            this.totalServiceFeePrice = request.totalServiceFeePrice;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putBodyParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
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
         * total_price.
         */
        public Builder totalPrice(Long totalPrice) {
            this.putBodyParameter("total_price", totalPrice);
            this.totalPrice = totalPrice;
            return this;
        }

        /**
         * total_service_fee_price.
         */
        public Builder totalServiceFeePrice(Long totalServiceFeePrice) {
            this.putBodyParameter("total_service_fee_price", totalServiceFeePrice);
            this.totalServiceFeePrice = totalServiceFeePrice;
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
        public FlightPayOrderV2Request build() {
            return new FlightPayOrderV2Request(this);
        } 

    } 

}
