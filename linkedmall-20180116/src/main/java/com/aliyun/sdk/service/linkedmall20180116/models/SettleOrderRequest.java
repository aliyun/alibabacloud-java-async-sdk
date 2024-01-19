// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SettleOrderRequest} extends {@link RequestModel}
 *
 * <p>SettleOrderRequest</p>
 */
public class SettleOrderRequest extends Request {
    @Body
    @NameInMap("ExtInfo")
    private String extInfo;

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
    @NameInMap("RoyaltyParameters")
    private String royaltyParameters;

    @Body
    @NameInMap("TradeNo")
    private String tradeNo;

    private SettleOrderRequest(Builder builder) {
        super(builder);
        this.extInfo = builder.extInfo;
        this.merchantId = builder.merchantId;
        this.outRequestNo = builder.outRequestNo;
        this.outTradeNo = builder.outTradeNo;
        this.royaltyParameters = builder.royaltyParameters;
        this.tradeNo = builder.tradeNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SettleOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
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
     * @return royaltyParameters
     */
    public String getRoyaltyParameters() {
        return this.royaltyParameters;
    }

    /**
     * @return tradeNo
     */
    public String getTradeNo() {
        return this.tradeNo;
    }

    public static final class Builder extends Request.Builder<SettleOrderRequest, Builder> {
        private String extInfo; 
        private String merchantId; 
        private String outRequestNo; 
        private String outTradeNo; 
        private String royaltyParameters; 
        private String tradeNo; 

        private Builder() {
            super();
        } 

        private Builder(SettleOrderRequest request) {
            super(request);
            this.extInfo = request.extInfo;
            this.merchantId = request.merchantId;
            this.outRequestNo = request.outRequestNo;
            this.outTradeNo = request.outTradeNo;
            this.royaltyParameters = request.royaltyParameters;
            this.tradeNo = request.tradeNo;
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
         * RoyaltyParameters.
         */
        public Builder royaltyParameters(String royaltyParameters) {
            this.putBodyParameter("RoyaltyParameters", royaltyParameters);
            this.royaltyParameters = royaltyParameters;
            return this;
        }

        /**
         * TradeNo.
         */
        public Builder tradeNo(String tradeNo) {
            this.putBodyParameter("TradeNo", tradeNo);
            this.tradeNo = tradeNo;
            return this;
        }

        @Override
        public SettleOrderRequest build() {
            return new SettleOrderRequest(this);
        } 

    } 

}
