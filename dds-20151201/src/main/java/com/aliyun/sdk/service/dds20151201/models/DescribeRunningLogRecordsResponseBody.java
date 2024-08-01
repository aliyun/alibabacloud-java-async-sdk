// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRunningLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRunningLogRecordsResponseBody</p>
 */
public class DescribeRunningLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeRunningLogRecordsResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRunningLogRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String engine; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The database engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Details about the operational log entries.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeRunningLogRecordsResponseBody build() {
            return new DescribeRunningLogRecordsResponseBody(this);
        } 

    } 

    public static class LogRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ConnInfo")
        private String connInfo;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        private LogRecords(Builder builder) {
            this.category = builder.category;
            this.connInfo = builder.connInfo;
            this.content = builder.content;
            this.createTime = builder.createTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogRecords create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return connInfo
         */
        public String getConnInfo() {
            return this.connInfo;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        public static final class Builder {
            private String category; 
            private String connInfo; 
            private String content; 
            private String createTime; 

            /**
             * The category of the log entry.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The connection information of the log entry.
             */
            public Builder connInfo(String connInfo) {
                this.connInfo = connInfo;
                return this;
            }

            /**
             * The content of the log entry.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The time when the log entry was generated. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            public LogRecords build() {
                return new LogRecords(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogRecords")
        private java.util.List < LogRecords> logRecords;

        private Items(Builder builder) {
            this.logRecords = builder.logRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return logRecords
         */
        public java.util.List < LogRecords> getLogRecords() {
            return this.logRecords;
        }

        public static final class Builder {
            private java.util.List < LogRecords> logRecords; 

            /**
             * LogRecords.
             */
            public Builder logRecords(java.util.List < LogRecords> logRecords) {
                this.logRecords = logRecords;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
