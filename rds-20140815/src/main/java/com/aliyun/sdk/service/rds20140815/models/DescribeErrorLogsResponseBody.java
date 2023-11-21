// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeErrorLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeErrorLogsResponseBody</p>
 */
public class DescribeErrorLogsResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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
         * Details about the log entries returned.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of error logs on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeErrorLogsResponseBody build() {
            return new DescribeErrorLogsResponseBody(this);
        } 

    } 

    public static class ErrorLog extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ErrorInfo")
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
             * The time when the error log entry was generated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The error log information.
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
    public static class Items extends TeaModel {
        @NameInMap("ErrorLog")
        private java.util.List < ErrorLog> errorLog;

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
        public java.util.List < ErrorLog> getErrorLog() {
            return this.errorLog;
        }

        public static final class Builder {
            private java.util.List < ErrorLog> errorLog; 

            /**
             * ErrorLog.
             */
            public Builder errorLog(java.util.List < ErrorLog> errorLog) {
                this.errorLog = errorLog;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
