// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
 *
 * <p>TicketQueryPriceStockResponseBody</p>
 */
public class TicketQueryPriceStockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private TicketQueryPriceStockResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketQueryPriceStockResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TicketQueryPriceStockResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public TicketQueryPriceStockResponseBody build() {
            return new TicketQueryPriceStockResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryPriceStockResponseBody</p>
     */
    public static class DistributionPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        private String currencyCode;

        private DistributionPrice(Builder builder) {
            this.amount = builder.amount;
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DistributionPrice create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private Long amount; 
            private String currencyCode; 

            private Builder() {
            } 

            private Builder(DistributionPrice model) {
                this.amount = model.amount;
                this.currencyCode = model.currencyCode;
            } 

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public DistributionPrice build() {
                return new DistributionPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryPriceStockResponseBody</p>
     */
    public static class MarketPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        private String currencyCode;

        private MarketPrice(Builder builder) {
            this.amount = builder.amount;
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarketPrice create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private Long amount; 
            private String currencyCode; 

            private Builder() {
            } 

            private Builder(MarketPrice model) {
                this.amount = model.amount;
                this.currencyCode = model.currencyCode;
            } 

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public MarketPrice build() {
                return new MarketPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryPriceStockResponseBody</p>
     */
    public static class SuggestedPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        private String currencyCode;

        private SuggestedPrice(Builder builder) {
            this.amount = builder.amount;
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuggestedPrice create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private Long amount; 
            private String currencyCode; 

            private Builder() {
            } 

            private Builder(SuggestedPrice model) {
                this.amount = model.amount;
                this.currencyCode = model.currencyCode;
            } 

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public SuggestedPrice build() {
                return new SuggestedPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryPriceStockResponseBody</p>
     */
    public static class CalendarPriceStocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DistributionPrice")
        private DistributionPrice distributionPrice;

        @com.aliyun.core.annotation.NameInMap("MarketPrice")
        private MarketPrice marketPrice;

        @com.aliyun.core.annotation.NameInMap("Stock")
        private Long stock;

        @com.aliyun.core.annotation.NameInMap("SuggestedPrice")
        private SuggestedPrice suggestedPrice;

        private CalendarPriceStocks(Builder builder) {
            this.date = builder.date;
            this.distributionPrice = builder.distributionPrice;
            this.marketPrice = builder.marketPrice;
            this.stock = builder.stock;
            this.suggestedPrice = builder.suggestedPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CalendarPriceStocks create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return distributionPrice
         */
        public DistributionPrice getDistributionPrice() {
            return this.distributionPrice;
        }

        /**
         * @return marketPrice
         */
        public MarketPrice getMarketPrice() {
            return this.marketPrice;
        }

        /**
         * @return stock
         */
        public Long getStock() {
            return this.stock;
        }

        /**
         * @return suggestedPrice
         */
        public SuggestedPrice getSuggestedPrice() {
            return this.suggestedPrice;
        }

        public static final class Builder {
            private String date; 
            private DistributionPrice distributionPrice; 
            private MarketPrice marketPrice; 
            private Long stock; 
            private SuggestedPrice suggestedPrice; 

            private Builder() {
            } 

            private Builder(CalendarPriceStocks model) {
                this.date = model.date;
                this.distributionPrice = model.distributionPrice;
                this.marketPrice = model.marketPrice;
                this.stock = model.stock;
                this.suggestedPrice = model.suggestedPrice;
            } 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * DistributionPrice.
             */
            public Builder distributionPrice(DistributionPrice distributionPrice) {
                this.distributionPrice = distributionPrice;
                return this;
            }

            /**
             * MarketPrice.
             */
            public Builder marketPrice(MarketPrice marketPrice) {
                this.marketPrice = marketPrice;
                return this;
            }

            /**
             * Stock.
             */
            public Builder stock(Long stock) {
                this.stock = stock;
                return this;
            }

            /**
             * SuggestedPrice.
             */
            public Builder suggestedPrice(SuggestedPrice suggestedPrice) {
                this.suggestedPrice = suggestedPrice;
                return this;
            }

            public CalendarPriceStocks build() {
                return new CalendarPriceStocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryPriceStockResponseBody</p>
     */
    public static class NormalPriceStockDistributionPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        private String currencyCode;

        private NormalPriceStockDistributionPrice(Builder builder) {
            this.amount = builder.amount;
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalPriceStockDistributionPrice create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private Long amount; 
            private String currencyCode; 

            private Builder() {
            } 

            private Builder(NormalPriceStockDistributionPrice model) {
                this.amount = model.amount;
                this.currencyCode = model.currencyCode;
            } 

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public NormalPriceStockDistributionPrice build() {
                return new NormalPriceStockDistributionPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryPriceStockResponseBody</p>
     */
    public static class NormalPriceStockMarketPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        private String currencyCode;

        private NormalPriceStockMarketPrice(Builder builder) {
            this.amount = builder.amount;
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalPriceStockMarketPrice create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private Long amount; 
            private String currencyCode; 

            private Builder() {
            } 

            private Builder(NormalPriceStockMarketPrice model) {
                this.amount = model.amount;
                this.currencyCode = model.currencyCode;
            } 

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public NormalPriceStockMarketPrice build() {
                return new NormalPriceStockMarketPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryPriceStockResponseBody</p>
     */
    public static class NormalPriceStockSuggestedPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        private String currencyCode;

        private NormalPriceStockSuggestedPrice(Builder builder) {
            this.amount = builder.amount;
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalPriceStockSuggestedPrice create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private Long amount; 
            private String currencyCode; 

            private Builder() {
            } 

            private Builder(NormalPriceStockSuggestedPrice model) {
                this.amount = model.amount;
                this.currencyCode = model.currencyCode;
            } 

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public NormalPriceStockSuggestedPrice build() {
                return new NormalPriceStockSuggestedPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryPriceStockResponseBody</p>
     */
    public static class NormalPriceStock extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributionPrice")
        private NormalPriceStockDistributionPrice distributionPrice;

        @com.aliyun.core.annotation.NameInMap("MarketPrice")
        private NormalPriceStockMarketPrice marketPrice;

        @com.aliyun.core.annotation.NameInMap("Stock")
        private Long stock;

        @com.aliyun.core.annotation.NameInMap("SuggestedPrice")
        private NormalPriceStockSuggestedPrice suggestedPrice;

        private NormalPriceStock(Builder builder) {
            this.distributionPrice = builder.distributionPrice;
            this.marketPrice = builder.marketPrice;
            this.stock = builder.stock;
            this.suggestedPrice = builder.suggestedPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalPriceStock create() {
            return builder().build();
        }

        /**
         * @return distributionPrice
         */
        public NormalPriceStockDistributionPrice getDistributionPrice() {
            return this.distributionPrice;
        }

        /**
         * @return marketPrice
         */
        public NormalPriceStockMarketPrice getMarketPrice() {
            return this.marketPrice;
        }

        /**
         * @return stock
         */
        public Long getStock() {
            return this.stock;
        }

        /**
         * @return suggestedPrice
         */
        public NormalPriceStockSuggestedPrice getSuggestedPrice() {
            return this.suggestedPrice;
        }

        public static final class Builder {
            private NormalPriceStockDistributionPrice distributionPrice; 
            private NormalPriceStockMarketPrice marketPrice; 
            private Long stock; 
            private NormalPriceStockSuggestedPrice suggestedPrice; 

            private Builder() {
            } 

            private Builder(NormalPriceStock model) {
                this.distributionPrice = model.distributionPrice;
                this.marketPrice = model.marketPrice;
                this.stock = model.stock;
                this.suggestedPrice = model.suggestedPrice;
            } 

            /**
             * DistributionPrice.
             */
            public Builder distributionPrice(NormalPriceStockDistributionPrice distributionPrice) {
                this.distributionPrice = distributionPrice;
                return this;
            }

            /**
             * MarketPrice.
             */
            public Builder marketPrice(NormalPriceStockMarketPrice marketPrice) {
                this.marketPrice = marketPrice;
                return this;
            }

            /**
             * Stock.
             */
            public Builder stock(Long stock) {
                this.stock = stock;
                return this;
            }

            /**
             * SuggestedPrice.
             */
            public Builder suggestedPrice(NormalPriceStockSuggestedPrice suggestedPrice) {
                this.suggestedPrice = suggestedPrice;
                return this;
            }

            public NormalPriceStock build() {
                return new NormalPriceStock(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryPriceStockResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryPriceStockResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalendarPriceStocks")
        private java.util.List<CalendarPriceStocks> calendarPriceStocks;

        @com.aliyun.core.annotation.NameInMap("NormalPriceStock")
        private NormalPriceStock normalPriceStock;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("StockType")
        private Integer stockType;

        private Data(Builder builder) {
            this.calendarPriceStocks = builder.calendarPriceStocks;
            this.normalPriceStock = builder.normalPriceStock;
            this.productId = builder.productId;
            this.stockType = builder.stockType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return calendarPriceStocks
         */
        public java.util.List<CalendarPriceStocks> getCalendarPriceStocks() {
            return this.calendarPriceStocks;
        }

        /**
         * @return normalPriceStock
         */
        public NormalPriceStock getNormalPriceStock() {
            return this.normalPriceStock;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return stockType
         */
        public Integer getStockType() {
            return this.stockType;
        }

        public static final class Builder {
            private java.util.List<CalendarPriceStocks> calendarPriceStocks; 
            private NormalPriceStock normalPriceStock; 
            private String productId; 
            private Integer stockType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.calendarPriceStocks = model.calendarPriceStocks;
                this.normalPriceStock = model.normalPriceStock;
                this.productId = model.productId;
                this.stockType = model.stockType;
            } 

            /**
             * CalendarPriceStocks.
             */
            public Builder calendarPriceStocks(java.util.List<CalendarPriceStocks> calendarPriceStocks) {
                this.calendarPriceStocks = calendarPriceStocks;
                return this;
            }

            /**
             * NormalPriceStock.
             */
            public Builder normalPriceStock(NormalPriceStock normalPriceStock) {
                this.normalPriceStock = normalPriceStock;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * StockType.
             */
            public Builder stockType(Integer stockType) {
                this.stockType = stockType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
