// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcTaxAbnormalResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcTaxAbnormalResponseBody</p>
 */
public class GetOcTaxAbnormalResponseBody extends TeaModel {
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

    private GetOcTaxAbnormalResponseBody(Builder builder) {
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

    public static GetOcTaxAbnormalResponseBody create() {
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

        public GetOcTaxAbnormalResponseBody build() {
            return new GetOcTaxAbnormalResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CardNum")
        private String cardNum;

        @NameInMap("CardType")
        private String cardType;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("JudgeDate")
        private String judgeDate;

        @NameInMap("JudgeDepartment")
        private String judgeDepartment;

        @NameInMap("JudgeReason")
        private String judgeReason;

        @NameInMap("LegalName")
        private String legalName;

        @NameInMap("OverdueAmount")
        private String overdueAmount;

        @NameInMap("OverdueType")
        private String overdueType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaxpayerNum")
        private String taxpayerNum;

        private Data(Builder builder) {
            this.cardNum = builder.cardNum;
            this.cardType = builder.cardType;
            this.entName = builder.entName;
            this.judgeDate = builder.judgeDate;
            this.judgeDepartment = builder.judgeDepartment;
            this.judgeReason = builder.judgeReason;
            this.legalName = builder.legalName;
            this.overdueAmount = builder.overdueAmount;
            this.overdueType = builder.overdueType;
            this.status = builder.status;
            this.taxpayerNum = builder.taxpayerNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cardNum
         */
        public String getCardNum() {
            return this.cardNum;
        }

        /**
         * @return cardType
         */
        public String getCardType() {
            return this.cardType;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return judgeDate
         */
        public String getJudgeDate() {
            return this.judgeDate;
        }

        /**
         * @return judgeDepartment
         */
        public String getJudgeDepartment() {
            return this.judgeDepartment;
        }

        /**
         * @return judgeReason
         */
        public String getJudgeReason() {
            return this.judgeReason;
        }

        /**
         * @return legalName
         */
        public String getLegalName() {
            return this.legalName;
        }

        /**
         * @return overdueAmount
         */
        public String getOverdueAmount() {
            return this.overdueAmount;
        }

        /**
         * @return overdueType
         */
        public String getOverdueType() {
            return this.overdueType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taxpayerNum
         */
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

        public static final class Builder {
            private String cardNum; 
            private String cardType; 
            private String entName; 
            private String judgeDate; 
            private String judgeDepartment; 
            private String judgeReason; 
            private String legalName; 
            private String overdueAmount; 
            private String overdueType; 
            private String status; 
            private String taxpayerNum; 

            /**
             * 法人证件号
             */
            public Builder cardNum(String cardNum) {
                this.cardNum = cardNum;
                return this;
            }

            /**
             * 证件类型
             */
            public Builder cardType(String cardType) {
                this.cardType = cardType;
                return this;
            }

            /**
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 认定日期
             */
            public Builder judgeDate(String judgeDate) {
                this.judgeDate = judgeDate;
                return this;
            }

            /**
             * 认定单位
             */
            public Builder judgeDepartment(String judgeDepartment) {
                this.judgeDepartment = judgeDepartment;
                return this;
            }

            /**
             * 认定原因
             */
            public Builder judgeReason(String judgeReason) {
                this.judgeReason = judgeReason;
                return this;
            }

            /**
             * 法人姓名
             */
            public Builder legalName(String legalName) {
                this.legalName = legalName;
                return this;
            }

            /**
             * 欠税金额
             */
            public Builder overdueAmount(String overdueAmount) {
                this.overdueAmount = overdueAmount;
                return this;
            }

            /**
             * 欠税税务种类
             */
            public Builder overdueType(String overdueType) {
                this.overdueType = overdueType;
                return this;
            }

            /**
             * 异常状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 纳税人识别号
             */
            public Builder taxpayerNum(String taxpayerNum) {
                this.taxpayerNum = taxpayerNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
