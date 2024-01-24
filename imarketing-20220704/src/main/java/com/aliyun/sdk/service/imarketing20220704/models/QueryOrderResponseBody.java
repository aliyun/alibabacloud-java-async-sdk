// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderResponseBody</p>
 */
public class QueryOrderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Ext")
    private java.util.Map < String, ? > ext;

    @NameInMap("Header")
    private QueryOrderResponseBodyHeader header;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private QueryOrderResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.ext = builder.ext;
        this.header = builder.header;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderResponseBody create() {
        return builder().build();
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
     * @return ext
     */
    public java.util.Map < String, ? > getExt() {
        return this.ext;
    }

    /**
     * @return header
     */
    public QueryOrderResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private java.util.Map < String, ? > ext; 
        private QueryOrderResponseBodyHeader header; 
        private Result result; 
        private Boolean success; 

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
         * Ext.
         */
        public Builder ext(java.util.Map < String, ? > ext) {
            this.ext = ext;
            return this;
        }

        /**
         * Header.
         */
        public Builder header(QueryOrderResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryOrderResponseBody build() {
            return new QueryOrderResponseBody(this);
        } 

    } 

    public static class QueryOrderResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        private Long costTime;

        @NameInMap("InnerErrorCode")
        private String innerErrorCode;

        @NameInMap("InnerErrorMsg")
        private String innerErrorMsg;

        @NameInMap("RpcId")
        private String rpcId;

        @NameInMap("TraceId")
        private String traceId;

        @NameInMap("Version")
        private String version;

        private QueryOrderResponseBodyHeader(Builder builder) {
            this.costTime = builder.costTime;
            this.innerErrorCode = builder.innerErrorCode;
            this.innerErrorMsg = builder.innerErrorMsg;
            this.rpcId = builder.rpcId;
            this.traceId = builder.traceId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryOrderResponseBodyHeader create() {
            return builder().build();
        }

        /**
         * @return costTime
         */
        public Long getCostTime() {
            return this.costTime;
        }

        /**
         * @return innerErrorCode
         */
        public String getInnerErrorCode() {
            return this.innerErrorCode;
        }

        /**
         * @return innerErrorMsg
         */
        public String getInnerErrorMsg() {
            return this.innerErrorMsg;
        }

        /**
         * @return rpcId
         */
        public String getRpcId() {
            return this.rpcId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long costTime; 
            private String innerErrorCode; 
            private String innerErrorMsg; 
            private String rpcId; 
            private String traceId; 
            private String version; 

            /**
             * CostTime.
             */
            public Builder costTime(Long costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * InnerErrorCode.
             */
            public Builder innerErrorCode(String innerErrorCode) {
                this.innerErrorCode = innerErrorCode;
                return this;
            }

            /**
             * InnerErrorMsg.
             */
            public Builder innerErrorMsg(String innerErrorMsg) {
                this.innerErrorMsg = innerErrorMsg;
                return this;
            }

            /**
             * RPC ID
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public QueryOrderResponseBodyHeader build() {
                return new QueryOrderResponseBodyHeader(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AlipayTradeId")
        private String alipayTradeId;

        @NameInMap("ChannelTradeId")
        private String channelTradeId;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("OrderStatus")
        private Integer orderStatus;

        @NameInMap("Price")
        private Long price;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("TaobaoTradeId")
        private String taobaoTradeId;

        @NameInMap("TradeId")
        private String tradeId;

        private Result(Builder builder) {
            this.alipayTradeId = builder.alipayTradeId;
            this.channelTradeId = builder.channelTradeId;
            this.itemId = builder.itemId;
            this.modifiedTime = builder.modifiedTime;
            this.orderStatus = builder.orderStatus;
            this.price = builder.price;
            this.requestId = builder.requestId;
            this.success = builder.success;
            this.taobaoTradeId = builder.taobaoTradeId;
            this.tradeId = builder.tradeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return alipayTradeId
         */
        public String getAlipayTradeId() {
            return this.alipayTradeId;
        }

        /**
         * @return channelTradeId
         */
        public String getChannelTradeId() {
            return this.channelTradeId;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
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
         * @return taobaoTradeId
         */
        public String getTaobaoTradeId() {
            return this.taobaoTradeId;
        }

        /**
         * @return tradeId
         */
        public String getTradeId() {
            return this.tradeId;
        }

        public static final class Builder {
            private String alipayTradeId; 
            private String channelTradeId; 
            private Long itemId; 
            private Long modifiedTime; 
            private Integer orderStatus; 
            private Long price; 
            private String requestId; 
            private Boolean success; 
            private String taobaoTradeId; 
            private String tradeId; 

            /**
             * AlipayTradeId.
             */
            public Builder alipayTradeId(String alipayTradeId) {
                this.alipayTradeId = alipayTradeId;
                return this;
            }

            /**
             * ChannelTradeId.
             */
            public Builder channelTradeId(String channelTradeId) {
                this.channelTradeId = channelTradeId;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Long price) {
                this.price = price;
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
             * TaobaoTradeId.
             */
            public Builder taobaoTradeId(String taobaoTradeId) {
                this.taobaoTradeId = taobaoTradeId;
                return this;
            }

            /**
             * TradeId.
             */
            public Builder tradeId(String tradeId) {
                this.tradeId = tradeId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
