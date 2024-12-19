// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link CreateSettleConfirmRequest} extends {@link RequestModel}
 *
 * <p>CreateSettleConfirmRequest</p>
 */
public class CreateSettleConfirmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutRequestNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outRequestNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutTradeNo")
    private String outTradeNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SettleInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String settleInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TradeNo")
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
         * <p>This parameter is required.</p>
         */
        public Builder merchantId(String merchantId) {
            this.putBodyParameter("MerchantId", merchantId);
            this.merchantId = merchantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
