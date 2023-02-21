// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcCompetitorsResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcCompetitorsResponseBody</p>
 */
public class GetOcCompetitorsResponseBody extends TeaModel {
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

    private GetOcCompetitorsResponseBody(Builder builder) {
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

    public static GetOcCompetitorsResponseBody create() {
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

        public GetOcCompetitorsResponseBody build() {
            return new GetOcCompetitorsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CompetitionBrandIntroduction")
        private String competitionBrandIntroduction;

        @NameInMap("CompetitionEntAddress")
        private String competitionEntAddress;

        @NameInMap("CompetitionEntEsDate")
        private String competitionEntEsDate;

        @NameInMap("CompetitionEntFinTurn")
        private String competitionEntFinTurn;

        @NameInMap("CompetitionEntName")
        private String competitionEntName;

        @NameInMap("CompetitionIntroduction")
        private String competitionIntroduction;

        @NameInMap("CompetitionLogoUrl")
        private String competitionLogoUrl;

        @NameInMap("CompetitionProductName")
        private String competitionProductName;

        @NameInMap("CompetitionTag")
        private String competitionTag;

        @NameInMap("CompetitionWebsite")
        private String competitionWebsite;

        @NameInMap("EntName")
        private String entName;

        private Data(Builder builder) {
            this.competitionBrandIntroduction = builder.competitionBrandIntroduction;
            this.competitionEntAddress = builder.competitionEntAddress;
            this.competitionEntEsDate = builder.competitionEntEsDate;
            this.competitionEntFinTurn = builder.competitionEntFinTurn;
            this.competitionEntName = builder.competitionEntName;
            this.competitionIntroduction = builder.competitionIntroduction;
            this.competitionLogoUrl = builder.competitionLogoUrl;
            this.competitionProductName = builder.competitionProductName;
            this.competitionTag = builder.competitionTag;
            this.competitionWebsite = builder.competitionWebsite;
            this.entName = builder.entName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return competitionBrandIntroduction
         */
        public String getCompetitionBrandIntroduction() {
            return this.competitionBrandIntroduction;
        }

        /**
         * @return competitionEntAddress
         */
        public String getCompetitionEntAddress() {
            return this.competitionEntAddress;
        }

        /**
         * @return competitionEntEsDate
         */
        public String getCompetitionEntEsDate() {
            return this.competitionEntEsDate;
        }

        /**
         * @return competitionEntFinTurn
         */
        public String getCompetitionEntFinTurn() {
            return this.competitionEntFinTurn;
        }

        /**
         * @return competitionEntName
         */
        public String getCompetitionEntName() {
            return this.competitionEntName;
        }

        /**
         * @return competitionIntroduction
         */
        public String getCompetitionIntroduction() {
            return this.competitionIntroduction;
        }

        /**
         * @return competitionLogoUrl
         */
        public String getCompetitionLogoUrl() {
            return this.competitionLogoUrl;
        }

        /**
         * @return competitionProductName
         */
        public String getCompetitionProductName() {
            return this.competitionProductName;
        }

        /**
         * @return competitionTag
         */
        public String getCompetitionTag() {
            return this.competitionTag;
        }

        /**
         * @return competitionWebsite
         */
        public String getCompetitionWebsite() {
            return this.competitionWebsite;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        public static final class Builder {
            private String competitionBrandIntroduction; 
            private String competitionEntAddress; 
            private String competitionEntEsDate; 
            private String competitionEntFinTurn; 
            private String competitionEntName; 
            private String competitionIntroduction; 
            private String competitionLogoUrl; 
            private String competitionProductName; 
            private String competitionTag; 
            private String competitionWebsite; 
            private String entName; 

            /**
             * 品牌介绍
             */
            public Builder competitionBrandIntroduction(String competitionBrandIntroduction) {
                this.competitionBrandIntroduction = competitionBrandIntroduction;
                return this;
            }

            /**
             * 竞品公司地址
             */
            public Builder competitionEntAddress(String competitionEntAddress) {
                this.competitionEntAddress = competitionEntAddress;
                return this;
            }

            /**
             * 竞品公司成立日期
             */
            public Builder competitionEntEsDate(String competitionEntEsDate) {
                this.competitionEntEsDate = competitionEntEsDate;
                return this;
            }

            /**
             * 竞品公司最新融资轮次
             */
            public Builder competitionEntFinTurn(String competitionEntFinTurn) {
                this.competitionEntFinTurn = competitionEntFinTurn;
                return this;
            }

            /**
             * 竞品公司名称
             */
            public Builder competitionEntName(String competitionEntName) {
                this.competitionEntName = competitionEntName;
                return this;
            }

            /**
             * 竞品简介
             */
            public Builder competitionIntroduction(String competitionIntroduction) {
                this.competitionIntroduction = competitionIntroduction;
                return this;
            }

            /**
             * 竞品logo链接
             */
            public Builder competitionLogoUrl(String competitionLogoUrl) {
                this.competitionLogoUrl = competitionLogoUrl;
                return this;
            }

            /**
             * 竞品名称
             */
            public Builder competitionProductName(String competitionProductName) {
                this.competitionProductName = competitionProductName;
                return this;
            }

            /**
             * 竞品标签
             */
            public Builder competitionTag(String competitionTag) {
                this.competitionTag = competitionTag;
                return this;
            }

            /**
             * 竞品官网
             */
            public Builder competitionWebsite(String competitionWebsite) {
                this.competitionWebsite = competitionWebsite;
                return this;
            }

            /**
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
