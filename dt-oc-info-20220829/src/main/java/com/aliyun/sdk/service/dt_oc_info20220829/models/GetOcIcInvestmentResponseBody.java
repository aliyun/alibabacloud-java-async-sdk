// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcInvestmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcInvestmentResponseBody</p>
 */
public class GetOcIcInvestmentResponseBody extends TeaModel {
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

    private GetOcIcInvestmentResponseBody(Builder builder) {
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

    public static GetOcIcInvestmentResponseBody create() {
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

        public GetOcIcInvestmentResponseBody build() {
            return new GetOcIcInvestmentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EntName")
        private String entName;

        @NameInMap("InvestCreditCode")
        private String investCreditCode;

        @NameInMap("InvestEsDate")
        private String investEsDate;

        @NameInMap("InvestLegalName")
        private String investLegalName;

        @NameInMap("InvestLicenseNo")
        private String investLicenseNo;

        @NameInMap("InvestName")
        private String investName;

        @NameInMap("InvestRegCap")
        private String investRegCap;

        @NameInMap("InvestStatus")
        private String investStatus;

        @NameInMap("ShouldCap")
        private String shouldCap;

        @NameInMap("StockPercentage")
        private String stockPercentage;

        private Data(Builder builder) {
            this.entName = builder.entName;
            this.investCreditCode = builder.investCreditCode;
            this.investEsDate = builder.investEsDate;
            this.investLegalName = builder.investLegalName;
            this.investLicenseNo = builder.investLicenseNo;
            this.investName = builder.investName;
            this.investRegCap = builder.investRegCap;
            this.investStatus = builder.investStatus;
            this.shouldCap = builder.shouldCap;
            this.stockPercentage = builder.stockPercentage;
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
         * @return investCreditCode
         */
        public String getInvestCreditCode() {
            return this.investCreditCode;
        }

        /**
         * @return investEsDate
         */
        public String getInvestEsDate() {
            return this.investEsDate;
        }

        /**
         * @return investLegalName
         */
        public String getInvestLegalName() {
            return this.investLegalName;
        }

        /**
         * @return investLicenseNo
         */
        public String getInvestLicenseNo() {
            return this.investLicenseNo;
        }

        /**
         * @return investName
         */
        public String getInvestName() {
            return this.investName;
        }

        /**
         * @return investRegCap
         */
        public String getInvestRegCap() {
            return this.investRegCap;
        }

        /**
         * @return investStatus
         */
        public String getInvestStatus() {
            return this.investStatus;
        }

        /**
         * @return shouldCap
         */
        public String getShouldCap() {
            return this.shouldCap;
        }

        /**
         * @return stockPercentage
         */
        public String getStockPercentage() {
            return this.stockPercentage;
        }

        public static final class Builder {
            private String entName; 
            private String investCreditCode; 
            private String investEsDate; 
            private String investLegalName; 
            private String investLicenseNo; 
            private String investName; 
            private String investRegCap; 
            private String investStatus; 
            private String shouldCap; 
            private String stockPercentage; 

            /**
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 社会信用代码
             */
            public Builder investCreditCode(String investCreditCode) {
                this.investCreditCode = investCreditCode;
                return this;
            }

            /**
             * 企业成立日期
             */
            public Builder investEsDate(String investEsDate) {
                this.investEsDate = investEsDate;
                return this;
            }

            /**
             * 企业法定年龄代表人
             */
            public Builder investLegalName(String investLegalName) {
                this.investLegalName = investLegalName;
                return this;
            }

            /**
             * 企业注册号
             */
            public Builder investLicenseNo(String investLicenseNo) {
                this.investLicenseNo = investLicenseNo;
                return this;
            }

            /**
             * 被投资企业名称
             */
            public Builder investName(String investName) {
                this.investName = investName;
                return this;
            }

            /**
             * 企业注册资本
             */
            public Builder investRegCap(String investRegCap) {
                this.investRegCap = investRegCap;
                return this;
            }

            /**
             * 企业经营状态
             */
            public Builder investStatus(String investStatus) {
                this.investStatus = investStatus;
                return this;
            }

            /**
             * 投资数额
             */
            public Builder shouldCap(String shouldCap) {
                this.shouldCap = shouldCap;
                return this;
            }

            /**
             * 投资比例
             */
            public Builder stockPercentage(String stockPercentage) {
                this.stockPercentage = stockPercentage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
