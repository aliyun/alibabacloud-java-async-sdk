// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayStockResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayStockResponseBody</p>
 */
public class DescribeGatewayStockResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Stocks")
    private Stocks stocks;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayStockResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.stocks = builder.stocks;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayStockResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return stocks
     */
    public Stocks getStocks() {
        return this.stocks;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Stocks stocks; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Stocks.
         */
        public Builder stocks(Stocks stocks) {
            this.stocks = stocks;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGatewayStockResponseBody build() {
            return new DescribeGatewayStockResponseBody(this);
        } 

    } 

    public static class Stock extends TeaModel {
        @NameInMap("StockInfo")
        private String stockInfo;

        @NameInMap("ZoneId")
        private String zoneId;

        private Stock(Builder builder) {
            this.stockInfo = builder.stockInfo;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stock create() {
            return builder().build();
        }

        /**
         * @return stockInfo
         */
        public String getStockInfo() {
            return this.stockInfo;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String stockInfo; 
            private String zoneId; 

            /**
             * StockInfo.
             */
            public Builder stockInfo(String stockInfo) {
                this.stockInfo = stockInfo;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Stock build() {
                return new Stock(this);
            } 

        } 

    }
    public static class Stocks extends TeaModel {
        @NameInMap("Stock")
        private java.util.List < Stock> stock;

        private Stocks(Builder builder) {
            this.stock = builder.stock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stocks create() {
            return builder().build();
        }

        /**
         * @return stock
         */
        public java.util.List < Stock> getStock() {
            return this.stock;
        }

        public static final class Builder {
            private java.util.List < Stock> stock; 

            /**
             * Stock.
             */
            public Builder stock(java.util.List < Stock> stock) {
                this.stock = stock;
                return this;
            }

            public Stocks build() {
                return new Stocks(this);
            } 

        } 

    }
}
