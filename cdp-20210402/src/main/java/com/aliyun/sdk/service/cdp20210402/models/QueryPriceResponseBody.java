// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPriceResponseBody</p>
 */
public class QueryPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryPriceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public QueryPriceResponseBody build() {
            return new QueryPriceResponseBody(this);
        } 

    } 

    public static class EcsPriceInfo extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("DiscountPrice")
        private Double discountPrice;

        @NameInMap("OriginalPrice")
        private Double originalPrice;

        @NameInMap("TradePrice")
        private Double tradePrice;

        private EcsPriceInfo(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsPriceInfo create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return discountPrice
         */
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return originalPrice
         */
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return tradePrice
         */
        public Double getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private Double discountPrice; 
            private Double originalPrice; 
            private Double tradePrice; 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Double discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Double tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public EcsPriceInfo build() {
                return new EcsPriceInfo(this);
            } 

        } 

    }
    public static class SoftPriceInfo extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("DiscountPrice")
        private Double discountPrice;

        @NameInMap("OriginalPrice")
        private Double originalPrice;

        @NameInMap("TradePrice")
        private Double tradePrice;

        private SoftPriceInfo(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftPriceInfo create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return discountPrice
         */
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return originalPrice
         */
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return tradePrice
         */
        public Double getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private Double discountPrice; 
            private Double originalPrice; 
            private Double tradePrice; 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Double discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Double tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public SoftPriceInfo build() {
                return new SoftPriceInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DiscountPrice")
        private Double discountPrice;

        @NameInMap("EcsPriceInfo")
        private EcsPriceInfo ecsPriceInfo;

        @NameInMap("SoftPriceInfo")
        private SoftPriceInfo softPriceInfo;

        @NameInMap("SumPrice")
        private Double sumPrice;

        private Data(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.ecsPriceInfo = builder.ecsPriceInfo;
            this.softPriceInfo = builder.softPriceInfo;
            this.sumPrice = builder.sumPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return discountPrice
         */
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return ecsPriceInfo
         */
        public EcsPriceInfo getEcsPriceInfo() {
            return this.ecsPriceInfo;
        }

        /**
         * @return softPriceInfo
         */
        public SoftPriceInfo getSoftPriceInfo() {
            return this.softPriceInfo;
        }

        /**
         * @return sumPrice
         */
        public Double getSumPrice() {
            return this.sumPrice;
        }

        public static final class Builder {
            private Double discountPrice; 
            private EcsPriceInfo ecsPriceInfo; 
            private SoftPriceInfo softPriceInfo; 
            private Double sumPrice; 

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Double discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * EcsPriceInfo.
             */
            public Builder ecsPriceInfo(EcsPriceInfo ecsPriceInfo) {
                this.ecsPriceInfo = ecsPriceInfo;
                return this;
            }

            /**
             * SoftPriceInfo.
             */
            public Builder softPriceInfo(SoftPriceInfo softPriceInfo) {
                this.softPriceInfo = softPriceInfo;
                return this;
            }

            /**
             * SumPrice.
             */
            public Builder sumPrice(Double sumPrice) {
                this.sumPrice = sumPrice;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
