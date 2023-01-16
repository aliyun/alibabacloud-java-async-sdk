// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingPayRequest} extends {@link RequestModel}
 *
 * <p>TicketChangingPayRequest</p>
 */
public class TicketChangingPayRequest extends Request {
    @Body
    @NameInMap("corp_pay_price")
    private Long corpPayPrice;

    @Body
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Body
    @NameInMap("dis_sub_order_id")
    @Validation(required = true)
    private String disSubOrderId;

    @Body
    @NameInMap("extra")
    private java.util.Map < String, String > extra;

    @Body
    @NameInMap("personal_pay_price")
    private Long personalPayPrice;

    @Body
    @NameInMap("total_pay_price")
    @Validation(required = true)
    private Long totalPayPrice;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    @Validation(required = true)
    private String xAcsBtripCorpToken;

    private TicketChangingPayRequest(Builder builder) {
        super(builder);
        this.corpPayPrice = builder.corpPayPrice;
        this.disOrderId = builder.disOrderId;
        this.disSubOrderId = builder.disSubOrderId;
        this.extra = builder.extra;
        this.personalPayPrice = builder.personalPayPrice;
        this.totalPayPrice = builder.totalPayPrice;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketChangingPayRequest create() {
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
     * @return disSubOrderId
     */
    public String getDisSubOrderId() {
        return this.disSubOrderId;
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

    public static final class Builder extends Request.Builder<TicketChangingPayRequest, Builder> {
        private Long corpPayPrice; 
        private String disOrderId; 
        private String disSubOrderId; 
        private java.util.Map < String, String > extra; 
        private Long personalPayPrice; 
        private Long totalPayPrice; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TicketChangingPayRequest request) {
            super(request);
            this.corpPayPrice = request.corpPayPrice;
            this.disOrderId = request.disOrderId;
            this.disSubOrderId = request.disSubOrderId;
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
         * 改签单号
         */
        public Builder disSubOrderId(String disSubOrderId) {
            this.putBodyParameter("dis_sub_order_id", disSubOrderId);
            this.disSubOrderId = disSubOrderId;
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
        public TicketChangingPayRequest build() {
            return new TicketChangingPayRequest(this);
        } 

    } 

}
