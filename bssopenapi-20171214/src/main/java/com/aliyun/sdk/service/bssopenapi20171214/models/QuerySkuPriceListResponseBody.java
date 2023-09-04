// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySkuPriceListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySkuPriceListResponseBody</p>
 */
public class QuerySkuPriceListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QuerySkuPriceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySkuPriceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySkuPriceListResponseBody build() {
            return new QuerySkuPriceListResponseBody(this);
        } 

    } 

    public static class RangeList extends TeaModel {
        @NameInMap("FactorCode")
        private String factorCode;

        @NameInMap("Max")
        private String max;

        @NameInMap("Min")
        private String min;

        @NameInMap("Type")
        private String type;

        private RangeList(Builder builder) {
            this.factorCode = builder.factorCode;
            this.max = builder.max;
            this.min = builder.min;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RangeList create() {
            return builder().build();
        }

        /**
         * @return factorCode
         */
        public String getFactorCode() {
            return this.factorCode;
        }

        /**
         * @return max
         */
        public String getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public String getMin() {
            return this.min;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String factorCode; 
            private String max; 
            private String min; 
            private String type; 

            /**
             * The code of the pricing factor.
             */
            public Builder factorCode(String factorCode) {
                this.factorCode = factorCode;
                return this;
            }

            /**
             * The maximum value.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * The minimum value.
             */
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            /**
             * The closure type of the interval.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RangeList build() {
                return new RangeList(this);
            } 

        } 

    }
    public static class CskuPriceList extends TeaModel {
        @NameInMap("CskuCode")
        private String cskuCode;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("Price")
        private String price;

        @NameInMap("PriceMode")
        private String priceMode;

        @NameInMap("PriceType")
        private String priceType;

        @NameInMap("PriceUnit")
        private String priceUnit;

        @NameInMap("RangeList")
        private java.util.List < RangeList> rangeList;

        @NameInMap("UsageUnit")
        private String usageUnit;

        private CskuPriceList(Builder builder) {
            this.cskuCode = builder.cskuCode;
            this.currency = builder.currency;
            this.price = builder.price;
            this.priceMode = builder.priceMode;
            this.priceType = builder.priceType;
            this.priceUnit = builder.priceUnit;
            this.rangeList = builder.rangeList;
            this.usageUnit = builder.usageUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CskuPriceList create() {
            return builder().build();
        }

        /**
         * @return cskuCode
         */
        public String getCskuCode() {
            return this.cskuCode;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return priceMode
         */
        public String getPriceMode() {
            return this.priceMode;
        }

        /**
         * @return priceType
         */
        public String getPriceType() {
            return this.priceType;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return rangeList
         */
        public java.util.List < RangeList> getRangeList() {
            return this.rangeList;
        }

        /**
         * @return usageUnit
         */
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public static final class Builder {
            private String cskuCode; 
            private String currency; 
            private String price; 
            private String priceMode; 
            private String priceType; 
            private String priceUnit; 
            private java.util.List < RangeList> rangeList; 
            private String usageUnit; 

            /**
             * The unique code of the SKU price.
             */
            public Builder cskuCode(String cskuCode) {
                this.cskuCode = cskuCode;
                return this;
            }

            /**
             * The currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * The pricing mode.
             */
            public Builder priceMode(String priceMode) {
                this.priceMode = priceMode;
                return this;
            }

            /**
             * The pricing type.
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            /**
             * The unit of the price.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * If the PriceMode parameter is set to STEP_ACCUMULATION or STEP_ARRIVE, the value of this field exists and specifies the range. If the PriceMode parameter is set to NORMAL_PRICE, the value of this field is null.
             */
            public Builder rangeList(java.util.List < RangeList> rangeList) {
                this.rangeList = rangeList;
                return this;
            }

            /**
             * The usage unit.
             */
            public Builder usageUnit(String usageUnit) {
                this.usageUnit = usageUnit;
                return this;
            }

            public CskuPriceList build() {
                return new CskuPriceList(this);
            } 

        } 

    }
    public static class SkuPriceList extends TeaModel {
        @NameInMap("CskuPriceList")
        private java.util.List < CskuPriceList> cskuPriceList;

        @NameInMap("SkuCode")
        private String skuCode;

        @NameInMap("SkuFactorMap")
        private java.util.Map < String, String > skuFactorMap;

        private SkuPriceList(Builder builder) {
            this.cskuPriceList = builder.cskuPriceList;
            this.skuCode = builder.skuCode;
            this.skuFactorMap = builder.skuFactorMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuPriceList create() {
            return builder().build();
        }

        /**
         * @return cskuPriceList
         */
        public java.util.List < CskuPriceList> getCskuPriceList() {
            return this.cskuPriceList;
        }

        /**
         * @return skuCode
         */
        public String getSkuCode() {
            return this.skuCode;
        }

        /**
         * @return skuFactorMap
         */
        public java.util.Map < String, String > getSkuFactorMap() {
            return this.skuFactorMap;
        }

        public static final class Builder {
            private java.util.List < CskuPriceList> cskuPriceList; 
            private String skuCode; 
            private java.util.Map < String, String > skuFactorMap; 

            /**
             * The prices of the SKUs.
             */
            public Builder cskuPriceList(java.util.List < CskuPriceList> cskuPriceList) {
                this.cskuPriceList = cskuPriceList;
                return this;
            }

            /**
             * The code of the SKU.
             */
            public Builder skuCode(String skuCode) {
                this.skuCode = skuCode;
                return this;
            }

            /**
             * The values of the pricing factors.
             */
            public Builder skuFactorMap(java.util.Map < String, String > skuFactorMap) {
                this.skuFactorMap = skuFactorMap;
                return this;
            }

            public SkuPriceList build() {
                return new SkuPriceList(this);
            } 

        } 

    }
    public static class SkuPricePage extends TeaModel {
        @NameInMap("NextPageToken")
        private String nextPageToken;

        @NameInMap("SkuPriceList")
        private java.util.List < SkuPriceList> skuPriceList;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private SkuPricePage(Builder builder) {
            this.nextPageToken = builder.nextPageToken;
            this.skuPriceList = builder.skuPriceList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuPricePage create() {
            return builder().build();
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        /**
         * @return skuPriceList
         */
        public java.util.List < SkuPriceList> getSkuPriceList() {
            return this.skuPriceList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String nextPageToken; 
            private java.util.List < SkuPriceList> skuPriceList; 
            private Integer totalCount; 

            /**
             * The token that is used to query the next page.
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * The SKUs.
             */
            public Builder skuPriceList(java.util.List < SkuPriceList> skuPriceList) {
                this.skuPriceList = skuPriceList;
                return this;
            }

            /**
             * The total number of SKUs.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public SkuPricePage build() {
                return new SkuPricePage(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SkuPricePage")
        private SkuPricePage skuPricePage;

        private Data(Builder builder) {
            this.skuPricePage = builder.skuPricePage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return skuPricePage
         */
        public SkuPricePage getSkuPricePage() {
            return this.skuPricePage;
        }

        public static final class Builder {
            private SkuPricePage skuPricePage; 

            /**
             * The SKUs of the pricing object.
             */
            public Builder skuPricePage(SkuPricePage skuPricePage) {
                this.skuPricePage = skuPricePage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
