// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeErrorLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeErrorLogRecordsResponseBody</p>
 */
public class DescribeErrorLogRecordsResponseBody extends TeaModel {
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

    private DescribeErrorLogRecordsResponseBody(Builder builder) {
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

    public static DescribeErrorLogRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeErrorLogRecordsResponseBody model) {
            this.engine = model.engine;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The engine type of the current database.</p>
         * 
         * <strong>example:</strong>
         * <p>MongoDB</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68BCBEC2-1E66-471F-A1A8-E3C60C0A80B0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeErrorLogRecordsResponseBody build() {
            return new DescribeErrorLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeErrorLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeErrorLogRecordsResponseBody</p>
     */
    public static class LogRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ConnInfo")
        private String connInfo;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        private LogRecords(Builder builder) {
            this.category = builder.category;
            this.connInfo = builder.connInfo;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.id = builder.id;
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

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        public static final class Builder {
            private String category; 
            private String connInfo; 
            private String content; 
            private String createTime; 
            private Integer id; 

            private Builder() {
            } 

            private Builder(LogRecords model) {
                this.category = model.category;
                this.connInfo = model.connInfo;
                this.content = model.content;
                this.createTime = model.createTime;
                this.id = model.id;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ConnInfo.
             */
            public Builder connInfo(String connInfo) {
                this.connInfo = connInfo;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            public LogRecords build() {
                return new LogRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeErrorLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeErrorLogRecordsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogRecords")
        private java.util.List<LogRecords> logRecords;

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
        public java.util.List<LogRecords> getLogRecords() {
            return this.logRecords;
        }

        public static final class Builder {
            private java.util.List<LogRecords> logRecords; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.logRecords = model.logRecords;
            } 

            /**
             * LogRecords.
             */
            public Builder logRecords(java.util.List<LogRecords> logRecords) {
                this.logRecords = logRecords;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
