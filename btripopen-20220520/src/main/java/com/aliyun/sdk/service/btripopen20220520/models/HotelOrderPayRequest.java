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
 * {@link HotelOrderPayRequest} extends {@link RequestModel}
 *
 * <p>HotelOrderPayRequest</p>
 */
public class HotelOrderPayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long btripOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String btripUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("company_pay_fee")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyPayFee;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("person_pay_fee")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long personPayFee;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_pay_account")
    private String thirdPayAccount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_trade_no")
    private String thirdTradeNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_price")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long totalPrice;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelOrderPayRequest(Builder builder) {
        super(builder);
        this.btripOrderId = builder.btripOrderId;
        this.btripUserId = builder.btripUserId;
        this.companyPayFee = builder.companyPayFee;
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
     * @return btripOrderId
     */
    public Long getBtripOrderId() {
        return this.btripOrderId;
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
        private Long btripOrderId; 
        private String btripUserId; 
        private Long companyPayFee; 
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
            this.btripOrderId = request.btripOrderId;
            this.btripUserId = request.btripUserId;
            this.companyPayFee = request.companyPayFee;
            this.personPayFee = request.personPayFee;
            this.thirdPayAccount = request.thirdPayAccount;
            this.thirdTradeNo = request.thirdTradeNo;
            this.totalPrice = request.totalPrice;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>供应商订单号（取自创单返回的订单号）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002202194207077022</p>
         */
        public Builder btripOrderId(Long btripOrderId) {
            this.putBodyParameter("btrip_order_id", btripOrderId);
            this.btripOrderId = btripOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23918781</p>
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder companyPayFee(Long companyPayFee) {
            this.putBodyParameter("company_pay_fee", companyPayFee);
            this.companyPayFee = companyPayFee;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder personPayFee(Long personPayFee) {
            this.putBodyParameter("person_pay_fee", personPayFee);
            this.personPayFee = personPayFee;
            return this;
        }

        /**
         * third_pay_account.
         */
        public Builder thirdPayAccount(String thirdPayAccount) {
            this.putBodyParameter("third_pay_account", thirdPayAccount);
            this.thirdPayAccount = thirdPayAccount;
            return this;
        }

        /**
         * third_trade_no.
         */
        public Builder thirdTradeNo(String thirdTradeNo) {
            this.putBodyParameter("third_trade_no", thirdTradeNo);
            this.thirdTradeNo = thirdTradeNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
