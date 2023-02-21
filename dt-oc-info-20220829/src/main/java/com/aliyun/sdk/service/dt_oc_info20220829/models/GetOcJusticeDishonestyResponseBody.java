// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeDishonestyResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcJusticeDishonestyResponseBody</p>
 */
public class GetOcJusticeDishonestyResponseBody extends TeaModel {
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

    private GetOcJusticeDishonestyResponseBody(Builder builder) {
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

    public static GetOcJusticeDishonestyResponseBody create() {
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

        public GetOcJusticeDishonestyResponseBody build() {
            return new GetOcJusticeDishonestyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Amount")
        private String amount;

        @NameInMap("CaseNum")
        private String caseNum;

        @NameInMap("Court")
        private String court;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("ExecuteDepartment")
        private String executeDepartment;

        @NameInMap("ExecutionDesc")
        private String executionDesc;

        @NameInMap("ExecutionStatus")
        private String executionStatus;

        @NameInMap("FilingDate")
        private String filingDate;

        @NameInMap("FinalDuty")
        private String finalDuty;

        @NameInMap("FromCaseNum")
        private String fromCaseNum;

        @NameInMap("LegalName")
        private String legalName;

        @NameInMap("Province")
        private String province;

        @NameInMap("PublishDate")
        private String publishDate;

        @NameInMap("SocialCreditCode")
        private String socialCreditCode;

        private Data(Builder builder) {
            this.amount = builder.amount;
            this.caseNum = builder.caseNum;
            this.court = builder.court;
            this.entName = builder.entName;
            this.executeDepartment = builder.executeDepartment;
            this.executionDesc = builder.executionDesc;
            this.executionStatus = builder.executionStatus;
            this.filingDate = builder.filingDate;
            this.finalDuty = builder.finalDuty;
            this.fromCaseNum = builder.fromCaseNum;
            this.legalName = builder.legalName;
            this.province = builder.province;
            this.publishDate = builder.publishDate;
            this.socialCreditCode = builder.socialCreditCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return caseNum
         */
        public String getCaseNum() {
            return this.caseNum;
        }

        /**
         * @return court
         */
        public String getCourt() {
            return this.court;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return executeDepartment
         */
        public String getExecuteDepartment() {
            return this.executeDepartment;
        }

        /**
         * @return executionDesc
         */
        public String getExecutionDesc() {
            return this.executionDesc;
        }

        /**
         * @return executionStatus
         */
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        /**
         * @return filingDate
         */
        public String getFilingDate() {
            return this.filingDate;
        }

        /**
         * @return finalDuty
         */
        public String getFinalDuty() {
            return this.finalDuty;
        }

        /**
         * @return fromCaseNum
         */
        public String getFromCaseNum() {
            return this.fromCaseNum;
        }

        /**
         * @return legalName
         */
        public String getLegalName() {
            return this.legalName;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return publishDate
         */
        public String getPublishDate() {
            return this.publishDate;
        }

        /**
         * @return socialCreditCode
         */
        public String getSocialCreditCode() {
            return this.socialCreditCode;
        }

        public static final class Builder {
            private String amount; 
            private String caseNum; 
            private String court; 
            private String entName; 
            private String executeDepartment; 
            private String executionDesc; 
            private String executionStatus; 
            private String filingDate; 
            private String finalDuty; 
            private String fromCaseNum; 
            private String legalName; 
            private String province; 
            private String publishDate; 
            private String socialCreditCode; 

            /**
             * 标的
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * 案号
             */
            public Builder caseNum(String caseNum) {
                this.caseNum = caseNum;
                return this;
            }

            /**
             * 执行法院
             */
            public Builder court(String court) {
                this.court = court;
                return this;
            }

            /**
             * 被执行人
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 做出执行依据单位
             */
            public Builder executeDepartment(String executeDepartment) {
                this.executeDepartment = executeDepartment;
                return this;
            }

            /**
             * 失信被执行人行为具体情形
             */
            public Builder executionDesc(String executionDesc) {
                this.executionDesc = executionDesc;
                return this;
            }

            /**
             * 被执行人履行情况
             */
            public Builder executionStatus(String executionStatus) {
                this.executionStatus = executionStatus;
                return this;
            }

            /**
             * 立案时间
             */
            public Builder filingDate(String filingDate) {
                this.filingDate = filingDate;
                return this;
            }

            /**
             * 生效法律文书确定的义务
             */
            public Builder finalDuty(String finalDuty) {
                this.finalDuty = finalDuty;
                return this;
            }

            /**
             * 执行依据文号
             */
            public Builder fromCaseNum(String fromCaseNum) {
                this.fromCaseNum = fromCaseNum;
                return this;
            }

            /**
             * 法定代表人
             */
            public Builder legalName(String legalName) {
                this.legalName = legalName;
                return this;
            }

            /**
             * 省份
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * 发布时间
             */
            public Builder publishDate(String publishDate) {
                this.publishDate = publishDate;
                return this;
            }

            /**
             * 企业统一信用代码
             */
            public Builder socialCreditCode(String socialCreditCode) {
                this.socialCreditCode = socialCreditCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
