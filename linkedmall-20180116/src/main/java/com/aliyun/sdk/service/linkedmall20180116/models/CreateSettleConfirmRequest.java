// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSettleConfirmRequest} extends {@link RequestModel}
 *
 * <p>CreateSettleConfirmRequest</p>
 */
public class CreateSettleConfirmRequest extends Request {
    @Body
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("ExtInfo")
    private String extInfo;

    @Body
    @NameInMap("MerchantId")
    @Validation(required = true)
    private String merchantId;

    @Body
    @NameInMap("OutRequestNo")
    @Validation(required = true)
    private String outRequestNo;

    @Body
    @NameInMap("OutTradeNo")
    private String outTradeNo;

    @Body
    @NameInMap("SettleInfo")
    @Validation(required = true)
    private String settleInfo;

    @Body
    @NameInMap("TradeNo")
    private String tradeNo;

    private CreateSettleConfirmRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.extInfo = builder.extInfo;
        this.merchantId = builder.merchantId;
        this.outRequestNo = builder.outRequestNo;
        this.outTradeNo = builder.outTradeNo;
        this.settleInfo = builder.settleInfo;
        this.tradeNo = builder.tradeNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSettleConfirmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
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
     * @return settleInfo
     */
    public String getSettleInfo() {
        return this.settleInfo;
    }

    /**
     * @return tradeNo
     */
    public String getTradeNo() {
        return this.tradeNo;
    }

    public static final class Builder extends Request.Builder<CreateSettleConfirmRequest, Builder> {
        private String bizId; 
        private String extInfo; 
        private String merchantId; 
        private String outRequestNo; 
        private String outTradeNo; 
        private String settleInfo; 
        private String tradeNo; 

        private Builder() {
            super();
        } 

        private Builder(CreateSettleConfirmRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.extInfo = request.extInfo;
            this.merchantId = request.merchantId;
            this.outRequestNo = request.outRequestNo;
            this.outTradeNo = request.outTradeNo;
            this.settleInfo = request.settleInfo;
            this.tradeNo = request.tradeNo;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
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
         * SettleInfo.
         */
        public Builder settleInfo(String settleInfo) {
            this.putBodyParameter("SettleInfo", settleInfo);
            this.settleInfo = settleInfo;
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
        public CreateSettleConfirmRequest build() {
            return new CreateSettleConfirmRequest(this);
        } 

    } 

}
