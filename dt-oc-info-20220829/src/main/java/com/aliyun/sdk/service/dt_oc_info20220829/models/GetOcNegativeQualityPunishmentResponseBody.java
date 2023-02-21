// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcNegativeQualityPunishmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcNegativeQualityPunishmentResponseBody</p>
 */
public class GetOcNegativeQualityPunishmentResponseBody extends TeaModel {
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

    private GetOcNegativeQualityPunishmentResponseBody(Builder builder) {
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

    public static GetOcNegativeQualityPunishmentResponseBody create() {
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

        public GetOcNegativeQualityPunishmentResponseBody build() {
            return new GetOcNegativeQualityPunishmentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Department")
        private String department;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("EventDate")
        private String eventDate;

        @NameInMap("EventResult")
        private String eventResult;

        @NameInMap("PubDate")
        private String pubDate;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.department = builder.department;
            this.entName = builder.entName;
            this.eventDate = builder.eventDate;
            this.eventResult = builder.eventResult;
            this.pubDate = builder.pubDate;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return eventDate
         */
        public String getEventDate() {
            return this.eventDate;
        }

        /**
         * @return eventResult
         */
        public String getEventResult() {
            return this.eventResult;
        }

        /**
         * @return pubDate
         */
        public String getPubDate() {
            return this.pubDate;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String department; 
            private String entName; 
            private String eventDate; 
            private String eventResult; 
            private String pubDate; 
            private String title; 

            /**
             * 管理机关
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 被查企业
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 事件日期
             */
            public Builder eventDate(String eventDate) {
                this.eventDate = eventDate;
                return this;
            }

            /**
             * 事件结果
             */
            public Builder eventResult(String eventResult) {
                this.eventResult = eventResult;
                return this;
            }

            /**
             * 发布时间
             */
            public Builder pubDate(String pubDate) {
                this.pubDate = pubDate;
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
