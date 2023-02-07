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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Id of the request
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
             * FactorCode.
             */
            public Builder factorCode(String factorCode) {
                this.factorCode = factorCode;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            /**
             * Type.
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
             * CskuCode.
             */
            public Builder cskuCode(String cskuCode) {
                this.cskuCode = cskuCode;
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
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * PriceMode.
             */
            public Builder priceMode(String priceMode) {
                this.priceMode = priceMode;
                return this;
            }

            /**
             * PriceType.
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            /**
             * PriceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * RangeList.
             */
            public Builder rangeList(java.util.List < RangeList> rangeList) {
                this.rangeList = rangeList;
                return this;
            }

            /**
             * UsageUnit.
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
             * CskuPriceList.
             */
            public Builder cskuPriceList(java.util.List < CskuPriceList> cskuPriceList) {
                this.cskuPriceList = cskuPriceList;
                return this;
            }

            /**
             * sku code
             */
            public Builder skuCode(String skuCode) {
                this.skuCode = skuCode;
                return this;
            }

            /**
             * SkuFactorMap.
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
             * NextPageToken.
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * SkuPriceList.
             */
            public Builder skuPriceList(java.util.List < SkuPriceList> skuPriceList) {
                this.skuPriceList = skuPriceList;
                return this;
            }

            /**
             * TotalCount.
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
             * SkuPricePage.
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
