// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeCourtAnnouncementResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcJusticeCourtAnnouncementResponseBody</p>
 */
public class GetOcJusticeCourtAnnouncementResponseBody extends TeaModel {
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

    private GetOcJusticeCourtAnnouncementResponseBody(Builder builder) {
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

    public static GetOcJusticeCourtAnnouncementResponseBody create() {
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

        public GetOcJusticeCourtAnnouncementResponseBody build() {
            return new GetOcJusticeCourtAnnouncementResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CaseNum")
        private String caseNum;

        @NameInMap("CauseAction")
        private String causeAction;

        @NameInMap("Court")
        private String court;

        @NameInMap("Department")
        private String department;

        @NameInMap("HearingDate")
        private String hearingDate;

        @NameInMap("Judge")
        private String judge;

        @NameInMap("Party")
        private String party;

        @NameInMap("Title")
        private String title;

        @NameInMap("Tribunal")
        private String tribunal;

        private Data(Builder builder) {
            this.caseNum = builder.caseNum;
            this.causeAction = builder.causeAction;
            this.court = builder.court;
            this.department = builder.department;
            this.hearingDate = builder.hearingDate;
            this.judge = builder.judge;
            this.party = builder.party;
            this.title = builder.title;
            this.tribunal = builder.tribunal;
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
         * @return court
         */
        public String getCourt() {
            return this.court;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return tribunal
         */
        public String getTribunal() {
            return this.tribunal;
        }

        public static final class Builder {
            private String caseNum; 
            private String causeAction; 
            private String court; 
            private String department; 
            private String hearingDate; 
            private String judge; 
            private String party; 
            private String title; 
            private String tribunal; 

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
             * 法院
             */
            public Builder court(String court) {
                this.court = court;
                return this;
            }

            /**
             * 承办部门
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 开庭日期
             */
            public Builder hearingDate(String hearingDate) {
                this.hearingDate = hearingDate;
                return this;
            }

            /**
             * 审判长
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
             * 标题
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * 法庭
             */
            public Builder tribunal(String tribunal) {
                this.tribunal = tribunal;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
