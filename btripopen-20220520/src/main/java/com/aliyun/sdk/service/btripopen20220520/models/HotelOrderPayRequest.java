// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderPayRequest} extends {@link RequestModel}
 *
 * <p>HotelOrderPayRequest</p>
 */
public class HotelOrderPayRequest extends Request {
    @Body
    @NameInMap("btrip_user_id")
    @Validation(required = true)
    private String btripUserId;

    @Body
    @NameInMap("company_pay_fee")
    @Validation(required = true)
    private Long companyPayFee;

    @Body
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Body
    @NameInMap("person_pay_fee")
    @Validation(required = true)
    private Long personPayFee;

    @Body
    @NameInMap("third_pay_account")
    private String thirdPayAccount;

    @Body
    @NameInMap("third_trade_no")
    private String thirdTradeNo;

    @Body
    @NameInMap("total_price")
    private Long totalPrice;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelOrderPayRequest(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.companyPayFee = builder.companyPayFee;
        this.disOrderId = builder.disOrderId;
        this.personPayFee = builder.personPayFee;
        this.thirdPayAccount = builder.thirdPayAccount;
        this.thirdTradeNo = builder.thirdTradeNo;
        this.totalPrice = builder.totalPrice;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelOrderPayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return companyPayFee
     */
    public Long getCompanyPayFee() {
        return this.companyPayFee;
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return personPayFee
     */
    public Long getPersonPayFee() {
        return this.personPayFee;
    }

    /**
     * @return thirdPayAccount
     */
    public String getThirdPayAccount() {
        return this.thirdPayAccount;
    }

    /**
     * @return thirdTradeNo
     */
    public String getThirdTradeNo() {
        return this.thirdTradeNo;
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

    public static final class Builder extends Request.Builder<HotelOrderPayRequest, Builder> {
        private String btripUserId; 
        private Long companyPayFee; 
        private String disOrderId; 
        private Long personPayFee; 
        private String thirdPayAccount; 
        private String thirdTradeNo; 
        private Long totalPrice; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelOrderPayRequest request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.companyPayFee = request.companyPayFee;
            this.disOrderId = request.disOrderId;
            this.personPayFee = request.personPayFee;
            this.thirdPayAccount = request.thirdPayAccount;
            this.thirdTradeNo = request.thirdTradeNo;
            this.totalPrice = request.totalPrice;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * 企业支付金额
         */
        public Builder companyPayFee(Long companyPayFee) {
            this.putBodyParameter("company_pay_fee", companyPayFee);
            this.companyPayFee = companyPayFee;
            return this;
        }

        /**
         * 分销商订单id
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * 个人支付金额
         */
        public Builder personPayFee(Long personPayFee) {
            this.putBodyParameter("person_pay_fee", personPayFee);
            this.personPayFee = personPayFee;
            return this;
        }

        /**
         * 三方支付账号
         */
        public Builder thirdPayAccount(String thirdPayAccount) {
            this.putBodyParameter("third_pay_account", thirdPayAccount);
            this.thirdPayAccount = thirdPayAccount;
            return this;
        }

        /**
         * 三方交易号
         */
        public Builder thirdTradeNo(String thirdTradeNo) {
            this.putBodyParameter("third_trade_no", thirdTradeNo);
            this.thirdTradeNo = thirdTradeNo;
            return this;
        }

        /**
         * 房费总价（不含服务费）
         */
        public Builder totalPrice(Long totalPrice) {
            this.putBodyParameter("total_price", totalPrice);
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
        public HotelOrderPayRequest build() {
            return new HotelOrderPayRequest(this);
        } 

    } 

}
