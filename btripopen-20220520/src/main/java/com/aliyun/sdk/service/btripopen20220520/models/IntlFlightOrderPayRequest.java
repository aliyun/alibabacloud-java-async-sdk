// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntlFlightOrderPayRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightOrderPayRequest</p>
 */
public class IntlFlightOrderPayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ext_params")
    private java.util.Map < String, ? > extParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_id")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("total_price")
    private Long totalPrice;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightOrderPayRequest(Builder builder) {
        super(builder);
        this.extParams = builder.extParams;
        this.isvName = builder.isvName;
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.totalPrice = builder.totalPrice;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightOrderPayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extParams
     */
    public java.util.Map < String, ? > getExtParams() {
        return this.extParams;
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
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightOrderPayRequest, Builder> {
        private java.util.Map < String, ? > extParams; 
        private String isvName; 
        private String orderId; 
        private String outOrderId; 
        private Long totalPrice; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightOrderPayRequest request) {
            super(request);
            this.extParams = request.extParams;
            this.isvName = request.isvName;
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.totalPrice = request.totalPrice;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * ext_params.
         */
        public Builder extParams(java.util.Map < String, ? > extParams) {
            String extParamsShrink = shrink(extParams, "ext_params", "json");
            this.putQueryParameter("ext_params", extParamsShrink);
            this.extParams = extParams;
            return this;
        }

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * order_id.
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
         * total_price.
         */
        public Builder totalPrice(Long totalPrice) {
            this.putQueryParameter("total_price", totalPrice);
            this.totalPrice = totalPrice;
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
        public IntlFlightOrderPayRequest build() {
            return new IntlFlightOrderPayRequest(this);
        } 

    } 

}
