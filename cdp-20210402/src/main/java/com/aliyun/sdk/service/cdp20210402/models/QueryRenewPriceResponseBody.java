// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRenewPriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRenewPriceResponseBody</p>
 */
public class QueryRenewPriceResponseBody extends TeaModel {
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

    private QueryRenewPriceResponseBody(Builder builder) {
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

    public static QueryRenewPriceResponseBody create() {
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

        public QueryRenewPriceResponseBody build() {
            return new QueryRenewPriceResponseBody(this);
        } 

    } 

    public static class CdpSoftPriceInfo extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("TradePrice")
        private Float tradePrice;

        private CdpSoftPriceInfo(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdpSoftPriceInfo create() {
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

            public CdpSoftPriceInfo build() {
                return new CdpSoftPriceInfo(this);
            } 

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
    public static class Data extends TeaModel {
        @NameInMap("CdpSoftPriceInfo")
        private CdpSoftPriceInfo cdpSoftPriceInfo;

        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("EcsPriceInfo")
        private EcsPriceInfo ecsPriceInfo;

        @NameInMap("SumPrice")
        private Float sumPrice;

        private Data(Builder builder) {
            this.cdpSoftPriceInfo = builder.cdpSoftPriceInfo;
            this.discountPrice = builder.discountPrice;
            this.ecsPriceInfo = builder.ecsPriceInfo;
            this.sumPrice = builder.sumPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cdpSoftPriceInfo
         */
        public CdpSoftPriceInfo getCdpSoftPriceInfo() {
            return this.cdpSoftPriceInfo;
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
         * @return sumPrice
         */
        public Float getSumPrice() {
            return this.sumPrice;
        }

        public static final class Builder {
            private CdpSoftPriceInfo cdpSoftPriceInfo; 
            private Float discountPrice; 
            private EcsPriceInfo ecsPriceInfo; 
            private Float sumPrice; 

            /**
             * CdpSoftPriceInfo.
             */
            public Builder cdpSoftPriceInfo(CdpSoftPriceInfo cdpSoftPriceInfo) {
                this.cdpSoftPriceInfo = cdpSoftPriceInfo;
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
             * EcsPriceInfo.
             */
            public Builder ecsPriceInfo(EcsPriceInfo ecsPriceInfo) {
                this.ecsPriceInfo = ecsPriceInfo;
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
