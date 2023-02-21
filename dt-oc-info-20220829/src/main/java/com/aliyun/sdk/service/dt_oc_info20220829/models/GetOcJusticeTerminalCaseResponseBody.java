// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeTerminalCaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcJusticeTerminalCaseResponseBody</p>
 */
public class GetOcJusticeTerminalCaseResponseBody extends TeaModel {
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

    private GetOcJusticeTerminalCaseResponseBody(Builder builder) {
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

    public static GetOcJusticeTerminalCaseResponseBody create() {
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

        public GetOcJusticeTerminalCaseResponseBody build() {
            return new GetOcJusticeTerminalCaseResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CaseNum")
        private String caseNum;

        @NameInMap("Court")
        private String court;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("ExecAmount")
        private String execAmount;

        @NameInMap("FailPerformAmount")
        private String failPerformAmount;

        @NameInMap("FilingDate")
        private String filingDate;

        @NameInMap("Name")
        private String name;

        @NameInMap("TerminalNum")
        private String terminalNum;

        @NameInMap("TerminateDate")
        private String terminateDate;

        private Data(Builder builder) {
            this.caseNum = builder.caseNum;
            this.court = builder.court;
            this.entName = builder.entName;
            this.execAmount = builder.execAmount;
            this.failPerformAmount = builder.failPerformAmount;
            this.filingDate = builder.filingDate;
            this.name = builder.name;
            this.terminalNum = builder.terminalNum;
            this.terminateDate = builder.terminateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return execAmount
         */
        public String getExecAmount() {
            return this.execAmount;
        }

        /**
         * @return failPerformAmount
         */
        public String getFailPerformAmount() {
            return this.failPerformAmount;
        }

        /**
         * @return filingDate
         */
        public String getFilingDate() {
            return this.filingDate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return terminalNum
         */
        public String getTerminalNum() {
            return this.terminalNum;
        }

        /**
         * @return terminateDate
         */
        public String getTerminateDate() {
            return this.terminateDate;
        }

        public static final class Builder {
            private String caseNum; 
            private String court; 
            private String entName; 
            private String execAmount; 
            private String failPerformAmount; 
            private String filingDate; 
            private String name; 
            private String terminalNum; 
            private String terminateDate; 

            /**
             * 立案案号
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
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 执行标的
             */
            public Builder execAmount(String execAmount) {
                this.execAmount = execAmount;
                return this;
            }

            /**
             * 未履行金额
             */
            public Builder failPerformAmount(String failPerformAmount) {
                this.failPerformAmount = failPerformAmount;
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
             * 被执行人
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 终本案号
             */
            public Builder terminalNum(String terminalNum) {
                this.terminalNum = terminalNum;
                return this;
            }

            /**
             * 终本时间
             */
            public Builder terminateDate(String terminateDate) {
                this.terminateDate = terminateDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
