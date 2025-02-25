// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeErrorLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeErrorLogsResponseBody</p>
 */
public class DescribeErrorLogsResponseBody extends TeaModel {
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

    private DescribeErrorLogsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeErrorLogsResponseBody create() {
        return builder().build();
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
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * <p>Details about the log entries returned.</p>
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
         * <p>The number of error logs on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98504E07-BB0E-40FC-B152-E4882615812C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeErrorLogsResponseBody build() {
            return new DescribeErrorLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeErrorLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeErrorLogsResponseBody</p>
     */
    public static class ErrorLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        private ErrorLog(Builder builder) {
            this.createTime = builder.createTime;
            this.errorInfo = builder.errorInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorLog create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public static final class Builder {
            private String createTime; 
            private String errorInfo; 

            /**
             * <p>The time when the error log entry was generated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2011-05-30T12:11:04Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error log information.</p>
             * 
             * <strong>example:</strong>
             * <p>spid52 DBCC TRACEON 3499, server process ID (SPID) 52. This is an informational message only; no user action is required</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            public ErrorLog build() {
                return new ErrorLog(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeErrorLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeErrorLogsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorLog")
        private java.util.List<ErrorLog> errorLog;

        private Items(Builder builder) {
            this.errorLog = builder.errorLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return errorLog
         */
        public java.util.List<ErrorLog> getErrorLog() {
            return this.errorLog;
        }

        public static final class Builder {
            private java.util.List<ErrorLog> errorLog; 

            /**
             * ErrorLog.
             */
            public Builder errorLog(java.util.List<ErrorLog> errorLog) {
                this.errorLog = errorLog;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
