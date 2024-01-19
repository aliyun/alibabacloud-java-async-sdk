// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWithholdTradeRequest} extends {@link RequestModel}
 *
 * <p>CreateWithholdTradeRequest</p>
 */
public class CreateWithholdTradeRequest extends Request {
    @Body
    @NameInMap("AgreementNo")
    private String agreementNo;

    @Body
    @NameInMap("Body")
    private String body;

    @Body
    @NameInMap("BuyerId")
    private String buyerId;

    @Body
    @NameInMap("ExtInfo")
    private String extInfo;

    @Body
    @NameInMap("GoodsDetail")
    private String goodsDetail;

    @Body
    @NameInMap("MerchantId")
    private String merchantId;

    @Body
    @NameInMap("OutRequestNo")
    private String outRequestNo;

    @Body
    @NameInMap("OutTradeNo")
    private String outTradeNo;

    @Body
    @NameInMap("SettleMode")
    private String settleMode;

    @Body
    @NameInMap("Subject")
    private String subject;

    @Body
    @NameInMap("TotalAmount")
    private String totalAmount;

    private CreateWithholdTradeRequest(Builder builder) {
        super(builder);
        this.agreementNo = builder.agreementNo;
        this.body = builder.body;
        this.buyerId = builder.buyerId;
        this.extInfo = builder.extInfo;
        this.goodsDetail = builder.goodsDetail;
        this.merchantId = builder.merchantId;
        this.outRequestNo = builder.outRequestNo;
        this.outTradeNo = builder.outTradeNo;
        this.settleMode = builder.settleMode;
        this.subject = builder.subject;
        this.totalAmount = builder.totalAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWithholdTradeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agreementNo
     */
    public String getAgreementNo() {
        return this.agreementNo;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return buyerId
     */
    public String getBuyerId() {
        return this.buyerId;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return goodsDetail
     */
    public String getGoodsDetail() {
        return this.goodsDetail;
    }

    /**
     * @return merchantId
     */
    public String getMerchantId() {
        return this.merchantId;
    }

    /**
     * @return outRequestNo
     */
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    /**
     * @return outTradeNo
     */
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    /**
     * @return settleMode
     */
    public String getSettleMode() {
        return this.settleMode;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return totalAmount
     */
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public static final class Builder extends Request.Builder<CreateWithholdTradeRequest, Builder> {
        private String agreementNo; 
        private String body; 
        private String buyerId; 
        private String extInfo; 
        private String goodsDetail; 
        private String merchantId; 
        private String outRequestNo; 
        private String outTradeNo; 
        private String settleMode; 
        private String subject; 
        private String totalAmount; 

        private Builder() {
            super();
        } 

        private Builder(CreateWithholdTradeRequest request) {
            super(request);
            this.agreementNo = request.agreementNo;
            this.body = request.body;
            this.buyerId = request.buyerId;
            this.extInfo = request.extInfo;
            this.goodsDetail = request.goodsDetail;
            this.merchantId = request.merchantId;
            this.outRequestNo = request.outRequestNo;
            this.outTradeNo = request.outTradeNo;
            this.settleMode = request.settleMode;
            this.subject = request.subject;
            this.totalAmount = request.totalAmount;
        } 

        /**
         * AgreementNo.
         */
        public Builder agreementNo(String agreementNo) {
            this.putBodyParameter("AgreementNo", agreementNo);
            this.agreementNo = agreementNo;
            return this;
        }

        /**
         * Body.
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * BuyerId.
         */
        public Builder buyerId(String buyerId) {
            this.putBodyParameter("BuyerId", buyerId);
            this.buyerId = buyerId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * GoodsDetail.
         */
        public Builder goodsDetail(String goodsDetail) {
            this.putBodyParameter("GoodsDetail", goodsDetail);
            this.goodsDetail = goodsDetail;
            return this;
        }

        /**
         * MerchantId.
         */
        public Builder merchantId(String merchantId) {
            this.putBodyParameter("MerchantId", merchantId);
            this.merchantId = merchantId;
            return this;
        }

        /**
         * OutRequestNo.
         */
        public Builder outRequestNo(String outRequestNo) {
            this.putBodyParameter("OutRequestNo", outRequestNo);
            this.outRequestNo = outRequestNo;
            return this;
        }

        /**
         * OutTradeNo.
         */
        public Builder outTradeNo(String outTradeNo) {
            this.putBodyParameter("OutTradeNo", outTradeNo);
            this.outTradeNo = outTradeNo;
            return this;
        }

        /**
         * SettleMode.
         */
        public Builder settleMode(String settleMode) {
            this.putBodyParameter("SettleMode", settleMode);
            this.settleMode = settleMode;
            return this;
        }

        /**
         * Subject.
         */
        public Builder subject(String subject) {
            this.putBodyParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * TotalAmount.
         */
        public Builder totalAmount(String totalAmount) {
            this.putBodyParameter("TotalAmount", totalAmount);
            this.totalAmount = totalAmount;
            return this;
        }

        @Override
        public CreateWithholdTradeRequest build() {
            return new CreateWithholdTradeRequest(this);
        } 

    } 

}
