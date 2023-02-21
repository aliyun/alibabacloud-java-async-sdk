// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeJudgementDocResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcJusticeJudgementDocResponseBody</p>
 */
public class GetOcJusticeJudgementDocResponseBody extends TeaModel {
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

    private GetOcJusticeJudgementDocResponseBody(Builder builder) {
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

    public static GetOcJusticeJudgementDocResponseBody create() {
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

        public GetOcJusticeJudgementDocResponseBody build() {
            return new GetOcJusticeJudgementDocResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CaseFlow")
        private String caseFlow;

        @NameInMap("CaseNum")
        private String caseNum;

        @NameInMap("CaseType")
        private String caseType;

        @NameInMap("CauseAction")
        private String causeAction;

        @NameInMap("Court")
        private String court;

        @NameInMap("Defendant")
        private String defendant;

        @NameInMap("JudgeDate")
        private String judgeDate;

        @NameInMap("JudgeResult")
        private String judgeResult;

        @NameInMap("JudgeType")
        private String judgeType;

        @NameInMap("Party")
        private String party;

        @NameInMap("Plaintiff")
        private String plaintiff;

        @NameInMap("PublicDate")
        private String publicDate;

        @NameInMap("Role")
        private String role;

        @NameInMap("SubAmount")
        private String subAmount;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.caseFlow = builder.caseFlow;
            this.caseNum = builder.caseNum;
            this.caseType = builder.caseType;
            this.causeAction = builder.causeAction;
            this.court = builder.court;
            this.defendant = builder.defendant;
            this.judgeDate = builder.judgeDate;
            this.judgeResult = builder.judgeResult;
            this.judgeType = builder.judgeType;
            this.party = builder.party;
            this.plaintiff = builder.plaintiff;
            this.publicDate = builder.publicDate;
            this.role = builder.role;
            this.subAmount = builder.subAmount;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return caseFlow
         */
        public String getCaseFlow() {
            return this.caseFlow;
        }

        /**
         * @return caseNum
         */
        public String getCaseNum() {
            return this.caseNum;
        }

        /**
         * @return caseType
         */
        public String getCaseType() {
            return this.caseType;
        }

        /**
         * @return causeAction
         */
        public String getCauseAction() {
            return this.causeAction;
        }

        /**
         * @return court
         */
        public String getCourt() {
            return this.court;
        }

        /**
         * @return defendant
         */
        public String getDefendant() {
            return this.defendant;
        }

        /**
         * @return judgeDate
         */
        public String getJudgeDate() {
            return this.judgeDate;
        }

        /**
         * @return judgeResult
         */
        public String getJudgeResult() {
            return this.judgeResult;
        }

        /**
         * @return judgeType
         */
        public String getJudgeType() {
            return this.judgeType;
        }

        /**
         * @return party
         */
        public String getParty() {
            return this.party;
        }

        /**
         * @return plaintiff
         */
        public String getPlaintiff() {
            return this.plaintiff;
        }

        /**
         * @return publicDate
         */
        public String getPublicDate() {
            return this.publicDate;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return subAmount
         */
        public String getSubAmount() {
            return this.subAmount;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String caseFlow; 
            private String caseNum; 
            private String caseType; 
            private String causeAction; 
            private String court; 
            private String defendant; 
            private String judgeDate; 
            private String judgeResult; 
            private String judgeType; 
            private String party; 
            private String plaintiff; 
            private String publicDate; 
            private String role; 
            private String subAmount; 
            private String title; 

            /**
             * 案件流程
             */
            public Builder caseFlow(String caseFlow) {
                this.caseFlow = caseFlow;
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
             * 案件类型
             */
            public Builder caseType(String caseType) {
                this.caseType = caseType;
                return this;
            }

            /**
             * 案由
             */
            public Builder causeAction(String causeAction) {
                this.causeAction = causeAction;
                return this;
            }

            /**
             * 法庭
             */
            public Builder court(String court) {
                this.court = court;
                return this;
            }

            /**
             * 被告
             */
            public Builder defendant(String defendant) {
                this.defendant = defendant;
                return this;
            }

            /**
             * 判决日期
             */
            public Builder judgeDate(String judgeDate) {
                this.judgeDate = judgeDate;
                return this;
            }

            /**
             * 判决结果
             */
            public Builder judgeResult(String judgeResult) {
                this.judgeResult = judgeResult;
                return this;
            }

            /**
             * 裁判类型
             */
            public Builder judgeType(String judgeType) {
                this.judgeType = judgeType;
                return this;
            }

            /**
             * 当事人
             */
            public Builder party(String party) {
                this.party = party;
                return this;
            }

            /**
             * 原告
             */
            public Builder plaintiff(String plaintiff) {
                this.plaintiff = plaintiff;
                return this;
            }

            /**
             * 公示日期
             */
            public Builder publicDate(String publicDate) {
                this.publicDate = publicDate;
                return this;
            }

            /**
             * 身份
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * 涉案金额
             */
            public Builder subAmount(String subAmount) {
                this.subAmount = subAmount;
                return this;
            }

            /**
             * 标题
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
