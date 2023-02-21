// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeLimitHighConsumeResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcJusticeLimitHighConsumeResponseBody</p>
 */
public class GetOcJusticeLimitHighConsumeResponseBody extends TeaModel {
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

    private GetOcJusticeLimitHighConsumeResponseBody(Builder builder) {
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

    public static GetOcJusticeLimitHighConsumeResponseBody create() {
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

        public GetOcJusticeLimitHighConsumeResponseBody build() {
            return new GetOcJusticeLimitHighConsumeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CaseNum")
        private String caseNum;

        @NameInMap("CauseAction")
        private String causeAction;

        @NameInMap("CompanyName")
        private String companyName;

        @NameInMap("Court")
        private String court;

        @NameInMap("ExecutionApplicant")
        private String executionApplicant;

        @NameInMap("FilingDate")
        private String filingDate;

        @NameInMap("Name")
        private String name;

        @NameInMap("PublishDate")
        private String publishDate;

        private Data(Builder builder) {
            this.caseNum = builder.caseNum;
            this.causeAction = builder.causeAction;
            this.companyName = builder.companyName;
            this.court = builder.court;
            this.executionApplicant = builder.executionApplicant;
            this.filingDate = builder.filingDate;
            this.name = builder.name;
            this.publishDate = builder.publishDate;
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
         * @return causeAction
         */
        public String getCauseAction() {
            return this.causeAction;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return court
         */
        public String getCourt() {
            return this.court;
        }

        /**
         * @return executionApplicant
         */
        public String getExecutionApplicant() {
            return this.executionApplicant;
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
         * @return publishDate
         */
        public String getPublishDate() {
            return this.publishDate;
        }

        public static final class Builder {
            private String caseNum; 
            private String causeAction; 
            private String companyName; 
            private String court; 
            private String executionApplicant; 
            private String filingDate; 
            private String name; 
            private String publishDate; 

            /**
             * 案号
             */
            public Builder caseNum(String caseNum) {
                this.caseNum = caseNum;
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
             * 关联企业
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
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
             * 申请执行人
             */
            public Builder executionApplicant(String executionApplicant) {
                this.executionApplicant = executionApplicant;
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
             * 限消法人/组织名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 限制令发布时间
             */
            public Builder publishDate(String publishDate) {
                this.publishDate = publishDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
