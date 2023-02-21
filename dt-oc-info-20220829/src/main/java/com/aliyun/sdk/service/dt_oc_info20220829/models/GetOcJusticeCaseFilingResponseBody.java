// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeCaseFilingResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcJusticeCaseFilingResponseBody</p>
 */
public class GetOcJusticeCaseFilingResponseBody extends TeaModel {
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

    private GetOcJusticeCaseFilingResponseBody(Builder builder) {
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

    public static GetOcJusticeCaseFilingResponseBody create() {
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

        public GetOcJusticeCaseFilingResponseBody build() {
            return new GetOcJusticeCaseFilingResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Assistant")
        private String assistant;

        @NameInMap("CaseNum")
        private String caseNum;

        @NameInMap("CaseStatus")
        private String caseStatus;

        @NameInMap("CauseAction")
        private String causeAction;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("FilingDate")
        private String filingDate;

        @NameInMap("HearingDate")
        private String hearingDate;

        @NameInMap("Judge")
        private String judge;

        @NameInMap("Party")
        private String party;

        @NameInMap("Role")
        private String role;

        private Data(Builder builder) {
            this.assistant = builder.assistant;
            this.caseNum = builder.caseNum;
            this.caseStatus = builder.caseStatus;
            this.causeAction = builder.causeAction;
            this.endDate = builder.endDate;
            this.filingDate = builder.filingDate;
            this.hearingDate = builder.hearingDate;
            this.judge = builder.judge;
            this.party = builder.party;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assistant
         */
        public String getAssistant() {
            return this.assistant;
        }

        /**
         * @return caseNum
         */
        public String getCaseNum() {
            return this.caseNum;
        }

        /**
         * @return caseStatus
         */
        public String getCaseStatus() {
            return this.caseStatus;
        }

        /**
         * @return causeAction
         */
        public String getCauseAction() {
            return this.causeAction;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return filingDate
         */
        public String getFilingDate() {
            return this.filingDate;
        }

        /**
         * @return hearingDate
         */
        public String getHearingDate() {
            return this.hearingDate;
        }

        /**
         * @return judge
         */
        public String getJudge() {
            return this.judge;
        }

        /**
         * @return party
         */
        public String getParty() {
            return this.party;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String assistant; 
            private String caseNum; 
            private String caseStatus; 
            private String causeAction; 
            private String endDate; 
            private String filingDate; 
            private String hearingDate; 
            private String judge; 
            private String party; 
            private String role; 

            /**
             * 法官助理
             */
            public Builder assistant(String assistant) {
                this.assistant = assistant;
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
             * 案件状态
             */
            public Builder caseStatus(String caseStatus) {
                this.caseStatus = caseStatus;
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
             * 结束时间
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
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
             * 开庭时间
             */
            public Builder hearingDate(String hearingDate) {
                this.hearingDate = hearingDate;
                return this;
            }

            /**
             * 承办法官
             */
            public Builder judge(String judge) {
                this.judge = judge;
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
             * 身份
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
