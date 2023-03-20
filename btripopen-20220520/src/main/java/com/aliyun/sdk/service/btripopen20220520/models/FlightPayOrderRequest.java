// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightPayOrderRequest} extends {@link RequestModel}
 *
 * <p>FlightPayOrderRequest</p>
 */
public class FlightPayOrderRequest extends Request {
    @Body
    @NameInMap("corp_pay_price")
    @Validation(required = true)
    private Long corpPayPrice;

    @Body
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Body
    @NameInMap("extra")
    private java.util.Map < String, String > extra;

    @Body
    @NameInMap("personal_pay_price")
    @Validation(required = true)
    private Long personalPayPrice;

    @Body
    @NameInMap("total_pay_price")
    @Validation(required = true)
    private Long totalPayPrice;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightPayOrderRequest(Builder builder) {
        super(builder);
        this.corpPayPrice = builder.corpPayPrice;
        this.disOrderId = builder.disOrderId;
        this.extra = builder.extra;
        this.personalPayPrice = builder.personalPayPrice;
        this.totalPayPrice = builder.totalPayPrice;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightPayOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpPayPrice
     */
    public Long getCorpPayPrice() {
        return this.corpPayPrice;
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return extra
     */
    public java.util.Map < String, String > getExtra() {
        return this.extra;
    }

    /**
     * @return personalPayPrice
     */
    public Long getPersonalPayPrice() {
        return this.personalPayPrice;
    }

    /**
     * @return totalPayPrice
     */
    public Long getTotalPayPrice() {
        return this.totalPayPrice;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightPayOrderRequest, Builder> {
        private Long corpPayPrice; 
        private String disOrderId; 
        private java.util.Map < String, String > extra; 
        private Long personalPayPrice; 
        private Long totalPayPrice; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightPayOrderRequest request) {
            super(request);
            this.corpPayPrice = request.corpPayPrice;
            this.disOrderId = request.disOrderId;
            this.extra = request.extra;
            this.personalPayPrice = request.personalPayPrice;
            this.totalPayPrice = request.totalPayPrice;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 企业支付金额
         */
        public Builder corpPayPrice(Long corpPayPrice) {
            this.putBodyParameter("corp_pay_price", corpPayPrice);
            this.corpPayPrice = corpPayPrice;
            return this;
        }

        /**
         * 分销外部订单号
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * 扩展信息
         */
        public Builder extra(java.util.Map < String, String > extra) {
            String extraShrink = shrink(extra, "extra", "json");
            this.putBodyParameter("extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * 个人支付金额
         */
        public Builder personalPayPrice(Long personalPayPrice) {
            this.putBodyParameter("personal_pay_price", personalPayPrice);
            this.personalPayPrice = personalPayPrice;
            return this;
        }

        /**
         * 订单支付总金额
         */
        public Builder totalPayPrice(Long totalPayPrice) {
            this.putBodyParameter("total_pay_price", totalPayPrice);
            this.totalPayPrice = totalPayPrice;
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
        public FlightPayOrderRequest build() {
            return new FlightPayOrderRequest(this);
        } 

    } 

}
