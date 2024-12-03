// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySkuPriceListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySkuPriceListResponseBody</p>
 */
public class QuerySkuPriceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F5B803CF-94D8-43AF-ADB3-D819AAD30E27</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySkuPriceListResponseBody build() {
            return new QuerySkuPriceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySkuPriceListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySkuPriceListResponseBody</p>
     */
    public static class RangeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FactorCode")
        private String factorCode;

        @com.aliyun.core.annotation.NameInMap("Max")
        private String max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private String min;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The code of the pricing factor.</p>
             * 
             * <strong>example:</strong>
             * <p>212fbd27866307fc79ecf06934a88b2c</p>
             */
            public Builder factorCode(String factorCode) {
                this.factorCode = factorCode;
                return this;
            }

            /**
             * <p>The maximum value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            /**
             * <p>The closure type of the interval.</p>
             * 
             * <strong>example:</strong>
             * <p>LORC</p>
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
    /**
     * 
     * {@link QuerySkuPriceListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySkuPriceListResponseBody</p>
     */
    public static class CskuPriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CskuCode")
        private String cskuCode;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("Price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("PriceMode")
        private String priceMode;

        @com.aliyun.core.annotation.NameInMap("PriceType")
        private String priceType;

        @com.aliyun.core.annotation.NameInMap("PriceUnit")
        private String priceUnit;

        @com.aliyun.core.annotation.NameInMap("RangeList")
        private java.util.List < RangeList> rangeList;

        @com.aliyun.core.annotation.NameInMap("UsageUnit")
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
             * <p>The unique code of the SKU price.</p>
             * 
             * <strong>example:</strong>
             * <p>ac74dd7b52ae6389ddef099283fb8275</p>
             */
            public Builder cskuCode(String cskuCode) {
                this.cskuCode = cskuCode;
                return this;
            }

            /**
             * <p>The currency.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The price.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The pricing mode.</p>
             * 
             * <strong>example:</strong>
             * <p>STEP_ARRIVE</p>
             */
            public Builder priceMode(String priceMode) {
                this.priceMode = priceMode;
                return this;
            }

            /**
             * <p>The pricing type.</p>
             * 
             * <strong>example:</strong>
             * <p>hourPrice</p>
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            /**
             * <p>The unit of the price.</p>
             * 
             * <strong>example:</strong>
             * <p>USD (per unit)</p>
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * <p>If the PriceMode parameter is set to STEP_ACCUMULATION or STEP_ARRIVE, the value of this field exists and specifies the range. If the PriceMode parameter is set to NORMAL_PRICE, the value of this field is null.</p>
             */
            public Builder rangeList(java.util.List < RangeList> rangeList) {
                this.rangeList = rangeList;
                return this;
            }

            /**
             * <p>The usage unit.</p>
             * 
             * <strong>example:</strong>
             * <p>Count</p>
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
    /**
     * 
     * {@link QuerySkuPriceListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySkuPriceListResponseBody</p>
     */
    public static class SkuPriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CskuPriceList")
        private java.util.List < CskuPriceList> cskuPriceList;

        @com.aliyun.core.annotation.NameInMap("SkuCode")
        private String skuCode;

        @com.aliyun.core.annotation.NameInMap("SkuFactorMap")
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
             * <p>The prices of the SKUs.</p>
             */
            public Builder cskuPriceList(java.util.List < CskuPriceList> cskuPriceList) {
                this.cskuPriceList = cskuPriceList;
                return this;
            }

            /**
             * <p>The code of the SKU.</p>
             * 
             * <strong>example:</strong>
             * <p>017c15a31507bc6de22aa93777461adc</p>
             */
            public Builder skuCode(String skuCode) {
                this.skuCode = skuCode;
                return this;
            }

            /**
             * <p>The values of the pricing factors.</p>
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
    /**
     * 
     * {@link QuerySkuPriceListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySkuPriceListResponseBody</p>
     */
    public static class SkuPricePage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextPageToken")
        private String nextPageToken;

        @com.aliyun.core.annotation.NameInMap("SkuPriceList")
        private java.util.List < SkuPriceList> skuPriceList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The token that is used to query the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>080112060a0422020800180022490a470342000000315333303332363436363336333433393636333136333338333733373333333133373336363336323634363336363337333836333636333636313336363433363332</p>
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * <p>The SKUs.</p>
             */
            public Builder skuPriceList(java.util.List < SkuPriceList> skuPriceList) {
                this.skuPriceList = skuPriceList;
                return this;
            }

            /**
             * <p>The total number of SKUs.</p>
             * 
             * <strong>example:</strong>
             * <p>18732</p>
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
    /**
     * 
     * {@link QuerySkuPriceListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySkuPriceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkuPricePage")
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
             * <p>The SKUs of the pricing object.</p>
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
