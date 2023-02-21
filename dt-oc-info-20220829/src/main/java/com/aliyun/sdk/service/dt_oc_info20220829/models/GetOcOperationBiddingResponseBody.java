// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcOperationBiddingResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcOperationBiddingResponseBody</p>
 */
public class GetOcOperationBiddingResponseBody extends TeaModel {
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

    private GetOcOperationBiddingResponseBody(Builder builder) {
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

    public static GetOcOperationBiddingResponseBody create() {
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

        public GetOcOperationBiddingResponseBody build() {
            return new GetOcOperationBiddingResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AgentEntName")
        private String agentEntName;

        @NameInMap("BidIndustry")
        private String bidIndustry;

        @NameInMap("BidTitle")
        private String bidTitle;

        @NameInMap("BidType")
        private String bidType;

        @NameInMap("Content")
        private String content;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("InfoType")
        private String infoType;

        @NameInMap("OpeningTime")
        private String openingTime;

        @NameInMap("ProjectAmount")
        private String projectAmount;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("ProjectNum")
        private String projectNum;

        @NameInMap("PublicDate")
        private String publicDate;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("SubType")
        private String subType;

        @NameInMap("TenderEntName")
        private String tenderEntName;

        @NameInMap("WinnerEntName")
        private String winnerEntName;

        private Data(Builder builder) {
            this.agentEntName = builder.agentEntName;
            this.bidIndustry = builder.bidIndustry;
            this.bidTitle = builder.bidTitle;
            this.bidType = builder.bidType;
            this.content = builder.content;
            this.entName = builder.entName;
            this.infoType = builder.infoType;
            this.openingTime = builder.openingTime;
            this.projectAmount = builder.projectAmount;
            this.projectName = builder.projectName;
            this.projectNum = builder.projectNum;
            this.publicDate = builder.publicDate;
            this.regionName = builder.regionName;
            this.subType = builder.subType;
            this.tenderEntName = builder.tenderEntName;
            this.winnerEntName = builder.winnerEntName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentEntName
         */
        public String getAgentEntName() {
            return this.agentEntName;
        }

        /**
         * @return bidIndustry
         */
        public String getBidIndustry() {
            return this.bidIndustry;
        }

        /**
         * @return bidTitle
         */
        public String getBidTitle() {
            return this.bidTitle;
        }

        /**
         * @return bidType
         */
        public String getBidType() {
            return this.bidType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return infoType
         */
        public String getInfoType() {
            return this.infoType;
        }

        /**
         * @return openingTime
         */
        public String getOpeningTime() {
            return this.openingTime;
        }

        /**
         * @return projectAmount
         */
        public String getProjectAmount() {
            return this.projectAmount;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectNum
         */
        public String getProjectNum() {
            return this.projectNum;
        }

        /**
         * @return publicDate
         */
        public String getPublicDate() {
            return this.publicDate;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return tenderEntName
         */
        public String getTenderEntName() {
            return this.tenderEntName;
        }

        /**
         * @return winnerEntName
         */
        public String getWinnerEntName() {
            return this.winnerEntName;
        }

        public static final class Builder {
            private String agentEntName; 
            private String bidIndustry; 
            private String bidTitle; 
            private String bidType; 
            private String content; 
            private String entName; 
            private String infoType; 
            private String openingTime; 
            private String projectAmount; 
            private String projectName; 
            private String projectNum; 
            private String publicDate; 
            private String regionName; 
            private String subType; 
            private String tenderEntName; 
            private String winnerEntName; 

            /**
             * 代理企业
             */
            public Builder agentEntName(String agentEntName) {
                this.agentEntName = agentEntName;
                return this;
            }

            /**
             * 标的所属行业
             */
            public Builder bidIndustry(String bidIndustry) {
                this.bidIndustry = bidIndustry;
                return this;
            }

            /**
             * 标文标题
             */
            public Builder bidTitle(String bidTitle) {
                this.bidTitle = bidTitle;
                return this;
            }

            /**
             * 招标方式
             */
            public Builder bidType(String bidType) {
                this.bidType = bidType;
                return this;
            }

            /**
             * 正文
             */
            public Builder content(String content) {
                this.content = content;
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
             * 标文类型
             */
            public Builder infoType(String infoType) {
                this.infoType = infoType;
                return this;
            }

            /**
             * 开标时间
             */
            public Builder openingTime(String openingTime) {
                this.openingTime = openingTime;
                return this;
            }

            /**
             * 项目金额
             */
            public Builder projectAmount(String projectAmount) {
                this.projectAmount = projectAmount;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * 项目编号
             */
            public Builder projectNum(String projectNum) {
                this.projectNum = projectNum;
                return this;
            }

            /**
             * 发布时间
             */
            public Builder publicDate(String publicDate) {
                this.publicDate = publicDate;
                return this;
            }

            /**
             * 地区
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * 子类型
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * 招标企业
             */
            public Builder tenderEntName(String tenderEntName) {
                this.tenderEntName = tenderEntName;
                return this;
            }

            /**
             * 中标企业
             */
            public Builder winnerEntName(String winnerEntName) {
                this.winnerEntName = winnerEntName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
