// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionPriceResponseBody</p>
 */
public class DescribeSubscriptionPriceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Currency")
    private String currency;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TradePrice")
    private Float tradePrice;

    private DescribeSubscriptionPriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.currency = builder.currency;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tradePrice = builder.tradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionPriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tradePrice
     */
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static final class Builder {
        private String code; 
        private String currency; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Float tradePrice; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TradePrice.
         */
        public Builder tradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public DescribeSubscriptionPriceResponseBody build() {
            return new DescribeSubscriptionPriceResponseBody(this);
        } 

    } 

}
