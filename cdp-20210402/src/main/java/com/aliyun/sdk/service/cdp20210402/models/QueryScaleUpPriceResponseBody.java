// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryScaleUpPriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryScaleUpPriceResponseBody</p>
 */
public class QueryScaleUpPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryScaleUpPriceResponseBody(Builder builder) {
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

    public static QueryScaleUpPriceResponseBody create() {
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
    public Long getHttpStatusCode() {
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
        private Long httpStatusCode; 
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
        public Builder httpStatusCode(Long httpStatusCode) {
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

        public QueryScaleUpPriceResponseBody build() {
            return new QueryScaleUpPriceResponseBody(this);
        } 

    } 

    public static class EcsPriceInfo extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("TradePrice")
        private Float tradePrice;

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
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private Float discountPrice; 
            private Float originalPrice; 
            private Float tradePrice; 

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
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
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
        private Float discountPrice;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("TradePrice")
        private Float tradePrice;

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
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private Float discountPrice; 
            private Float originalPrice; 
            private Float tradePrice; 

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
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
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
        private Float discountPrice;

        @NameInMap("EcsPriceInfo")
        private EcsPriceInfo ecsPriceInfo;

        @NameInMap("SoftPriceInfo")
        private SoftPriceInfo softPriceInfo;

        @NameInMap("SumPrice")
        private Float sumPrice;

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
        public Float getDiscountPrice() {
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
        public Float getSumPrice() {
            return this.sumPrice;
        }

        public static final class Builder {
            private Float discountPrice; 
            private EcsPriceInfo ecsPriceInfo; 
            private SoftPriceInfo softPriceInfo; 
            private Float sumPrice; 

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Float discountPrice) {
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
            public Builder sumPrice(Float sumPrice) {
                this.sumPrice = sumPrice;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
