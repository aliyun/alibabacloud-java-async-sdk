// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIpTrademarkResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIpTrademarkResponseBody</p>
 */
public class GetOcIpTrademarkResponseBody extends TeaModel {
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

    private GetOcIpTrademarkResponseBody(Builder builder) {
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

    public static GetOcIpTrademarkResponseBody create() {
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

        public GetOcIpTrademarkResponseBody build() {
            return new GetOcIpTrademarkResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Agent")
        private String agent;

        @NameInMap("ApplyDate")
        private String applyDate;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("FirstPubDate")
        private String firstPubDate;

        @NameInMap("FirstPubNo")
        private String firstPubNo;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("Period")
        private String period;

        @NameInMap("RegNum")
        private String regNum;

        @NameInMap("RegPubDate")
        private String regPubDate;

        @NameInMap("RegPubNo")
        private String regPubNo;

        @NameInMap("TrademarkForm")
        private String trademarkForm;

        @NameInMap("TrademarkName")
        private String trademarkName;

        @NameInMap("TrademarkStatus")
        private String trademarkStatus;

        @NameInMap("TrademarkType")
        private String trademarkType;

        @NameInMap("TypeName")
        private String typeName;

        private Data(Builder builder) {
            this.agent = builder.agent;
            this.applyDate = builder.applyDate;
            this.entName = builder.entName;
            this.firstPubDate = builder.firstPubDate;
            this.firstPubNo = builder.firstPubNo;
            this.imageUrl = builder.imageUrl;
            this.period = builder.period;
            this.regNum = builder.regNum;
            this.regPubDate = builder.regPubDate;
            this.regPubNo = builder.regPubNo;
            this.trademarkForm = builder.trademarkForm;
            this.trademarkName = builder.trademarkName;
            this.trademarkStatus = builder.trademarkStatus;
            this.trademarkType = builder.trademarkType;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public String getAgent() {
            return this.agent;
        }

        /**
         * @return applyDate
         */
        public String getApplyDate() {
            return this.applyDate;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return firstPubDate
         */
        public String getFirstPubDate() {
            return this.firstPubDate;
        }

        /**
         * @return firstPubNo
         */
        public String getFirstPubNo() {
            return this.firstPubNo;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return regNum
         */
        public String getRegNum() {
            return this.regNum;
        }

        /**
         * @return regPubDate
         */
        public String getRegPubDate() {
            return this.regPubDate;
        }

        /**
         * @return regPubNo
         */
        public String getRegPubNo() {
            return this.regPubNo;
        }

        /**
         * @return trademarkForm
         */
        public String getTrademarkForm() {
            return this.trademarkForm;
        }

        /**
         * @return trademarkName
         */
        public String getTrademarkName() {
            return this.trademarkName;
        }

        /**
         * @return trademarkStatus
         */
        public String getTrademarkStatus() {
            return this.trademarkStatus;
        }

        /**
         * @return trademarkType
         */
        public String getTrademarkType() {
            return this.trademarkType;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String agent; 
            private String applyDate; 
            private String entName; 
            private String firstPubDate; 
            private String firstPubNo; 
            private String imageUrl; 
            private String period; 
            private String regNum; 
            private String regPubDate; 
            private String regPubNo; 
            private String trademarkForm; 
            private String trademarkName; 
            private String trademarkStatus; 
            private String trademarkType; 
            private String typeName; 

            /**
             * 代理人名称
             */
            public Builder agent(String agent) {
                this.agent = agent;
                return this;
            }

            /**
             * 申请日期
             */
            public Builder applyDate(String applyDate) {
                this.applyDate = applyDate;
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
             * 初审公告日期
             */
            public Builder firstPubDate(String firstPubDate) {
                this.firstPubDate = firstPubDate;
                return this;
            }

            /**
             * 初审公告
             */
            public Builder firstPubNo(String firstPubNo) {
                this.firstPubNo = firstPubNo;
                return this;
            }

            /**
             * 图片链接
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * 专用权期限
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * 商标注册号
             */
            public Builder regNum(String regNum) {
                this.regNum = regNum;
                return this;
            }

            /**
             * 注册公告日期
             */
            public Builder regPubDate(String regPubDate) {
                this.regPubDate = regPubDate;
                return this;
            }

            /**
             * 注册公告
             */
            public Builder regPubNo(String regPubNo) {
                this.regPubNo = regPubNo;
                return this;
            }

            /**
             * 商标形式
             */
            public Builder trademarkForm(String trademarkForm) {
                this.trademarkForm = trademarkForm;
                return this;
            }

            /**
             * 商标名称
             */
            public Builder trademarkName(String trademarkName) {
                this.trademarkName = trademarkName;
                return this;
            }

            /**
             * 商标状态
             */
            public Builder trademarkStatus(String trademarkStatus) {
                this.trademarkStatus = trademarkStatus;
                return this;
            }

            /**
             * 商标类型
             */
            public Builder trademarkType(String trademarkType) {
                this.trademarkType = trademarkType;
                return this;
            }

            /**
             * 商标类型名
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
