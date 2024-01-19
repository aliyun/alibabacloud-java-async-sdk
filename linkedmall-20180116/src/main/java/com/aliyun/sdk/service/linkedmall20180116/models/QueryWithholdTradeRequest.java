// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWithholdTradeRequest} extends {@link RequestModel}
 *
 * <p>QueryWithholdTradeRequest</p>
 */
public class QueryWithholdTradeRequest extends Request {
    @Body
    @NameInMap("MerchantId")
    private String merchantId;

    @Body
    @NameInMap("OutTradeNo")
    private String outTradeNo;

    @Body
    @NameInMap("TradeNo")
    private String tradeNo;

    private QueryWithholdTradeRequest(Builder builder) {
        super(builder);
        this.merchantId = builder.merchantId;
        this.outTradeNo = builder.outTradeNo;
        this.tradeNo = builder.tradeNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWithholdTradeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return merchantId
     */
    public String getMerchantId() {
        return this.merchantId;
    }

    /**
     * @return outTradeNo
     */
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    /**
     * @return tradeNo
     */
    public String getTradeNo() {
        return this.tradeNo;
    }

    public static final class Builder extends Request.Builder<QueryWithholdTradeRequest, Builder> {
        private String merchantId; 
        private String outTradeNo; 
        private String tradeNo; 

        private Builder() {
            super();
        } 

        private Builder(QueryWithholdTradeRequest request) {
            super(request);
            this.merchantId = request.merchantId;
            this.outTradeNo = request.outTradeNo;
            this.tradeNo = request.tradeNo;
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
         * OutTradeNo.
         */
        public Builder outTradeNo(String outTradeNo) {
            this.putBodyParameter("OutTradeNo", outTradeNo);
            this.outTradeNo = outTradeNo;
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
        public QueryWithholdTradeRequest build() {
            return new QueryWithholdTradeRequest(this);
        } 

    } 

}
