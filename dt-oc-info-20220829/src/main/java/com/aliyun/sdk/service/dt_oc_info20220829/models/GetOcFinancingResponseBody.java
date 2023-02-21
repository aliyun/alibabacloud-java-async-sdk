// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcFinancingResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcFinancingResponseBody</p>
 */
public class GetOcFinancingResponseBody extends TeaModel {
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

    private GetOcFinancingResponseBody(Builder builder) {
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

    public static GetOcFinancingResponseBody create() {
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

        public GetOcFinancingResponseBody build() {
            return new GetOcFinancingResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EntName")
        private String entName;

        @NameInMap("FinAmount")
        private String finAmount;

        @NameInMap("FinDate")
        private String finDate;

        @NameInMap("FinTurn")
        private String finTurn;

        @NameInMap("Investors")
        private String investors;

        private Data(Builder builder) {
            this.entName = builder.entName;
            this.finAmount = builder.finAmount;
            this.finDate = builder.finDate;
            this.finTurn = builder.finTurn;
            this.investors = builder.investors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return finAmount
         */
        public String getFinAmount() {
            return this.finAmount;
        }

        /**
         * @return finDate
         */
        public String getFinDate() {
            return this.finDate;
        }

        /**
         * @return finTurn
         */
        public String getFinTurn() {
            return this.finTurn;
        }

        /**
         * @return investors
         */
        public String getInvestors() {
            return this.investors;
        }

        public static final class Builder {
            private String entName; 
            private String finAmount; 
            private String finDate; 
            private String finTurn; 
            private String investors; 

            /**
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 融资金额
             */
            public Builder finAmount(String finAmount) {
                this.finAmount = finAmount;
                return this;
            }

            /**
             * 融资日期
             */
            public Builder finDate(String finDate) {
                this.finDate = finDate;
                return this;
            }

            /**
             * 融资轮次
             */
            public Builder finTurn(String finTurn) {
                this.finTurn = finTurn;
                return this;
            }

            /**
             * 投资方
             */
            public Builder investors(String investors) {
                this.investors = investors;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
