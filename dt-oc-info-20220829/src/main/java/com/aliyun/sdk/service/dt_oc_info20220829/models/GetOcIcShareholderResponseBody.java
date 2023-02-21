// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcShareholderResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcShareholderResponseBody</p>
 */
public class GetOcIcShareholderResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalNum")
    private Integer totalNum;

    private GetOcIcShareholderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcIcShareholderResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageNum; 
        private String requestId; 
        private Boolean success; 
        private Integer totalNum; 

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
        public Builder data(java.util.List < Data> data) {
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
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public GetOcIcShareholderResponseBody build() {
            return new GetOcIcShareholderResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ShouldCap")
        private String shouldCap;

        @NameInMap("ShouldCapTime")
        private String shouldCapTime;

        @NameInMap("StockName")
        private String stockName;

        @NameInMap("StockPercent")
        private String stockPercent;

        @NameInMap("StockType")
        private String stockType;

        private Data(Builder builder) {
            this.shouldCap = builder.shouldCap;
            this.shouldCapTime = builder.shouldCapTime;
            this.stockName = builder.stockName;
            this.stockPercent = builder.stockPercent;
            this.stockType = builder.stockType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return shouldCap
         */
        public String getShouldCap() {
            return this.shouldCap;
        }

        /**
         * @return shouldCapTime
         */
        public String getShouldCapTime() {
            return this.shouldCapTime;
        }

        /**
         * @return stockName
         */
        public String getStockName() {
            return this.stockName;
        }

        /**
         * @return stockPercent
         */
        public String getStockPercent() {
            return this.stockPercent;
        }

        /**
         * @return stockType
         */
        public String getStockType() {
            return this.stockType;
        }

        public static final class Builder {
            private String shouldCap; 
            private String shouldCapTime; 
            private String stockName; 
            private String stockPercent; 
            private String stockType; 

            /**
             * 认缴出资额
             */
            public Builder shouldCap(String shouldCap) {
                this.shouldCap = shouldCap;
                return this;
            }

            /**
             * 认缴日期
             */
            public Builder shouldCapTime(String shouldCapTime) {
                this.shouldCapTime = shouldCapTime;
                return this;
            }

            /**
             * 股东名称
             */
            public Builder stockName(String stockName) {
                this.stockName = stockName;
                return this;
            }

            /**
             * 持股比例
             */
            public Builder stockPercent(String stockPercent) {
                this.stockPercent = stockPercent;
                return this;
            }

            /**
             * 股东类型
             */
            public Builder stockType(String stockType) {
                this.stockType = stockType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
