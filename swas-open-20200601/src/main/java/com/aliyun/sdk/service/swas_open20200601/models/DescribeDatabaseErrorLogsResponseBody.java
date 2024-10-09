// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDatabaseErrorLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseErrorLogsResponseBody</p>
 */
public class DescribeDatabaseErrorLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorLogs")
    private java.util.List < ErrorLogs> errorLogs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDatabaseErrorLogsResponseBody(Builder builder) {
        this.errorLogs = builder.errorLogs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseErrorLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorLogs
     */
    public java.util.List < ErrorLogs> getErrorLogs() {
        return this.errorLogs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < ErrorLogs> errorLogs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The time when the error log entry was generated. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p>The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
         * </blockquote>
         */
        public Builder errorLogs(java.util.List < ErrorLogs> errorLogs) {
            this.errorLogs = errorLogs;
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatabaseErrorLogsResponseBody build() {
            return new DescribeDatabaseErrorLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatabaseErrorLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabaseErrorLogsResponseBody</p>
     */
    public static class ErrorLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        private ErrorLogs(Builder builder) {
            this.createTime = builder.createTime;
            this.errorInfo = builder.errorInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorLogs create() {
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
             * <p>The time when the resource was created. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-08T12:11:04Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>spid52 DBCC TRACEON 3499, server process ID (SPID) 52. This is an informational message only; no user action is required</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            public ErrorLogs build() {
                return new ErrorLogs(this);
            } 

        } 

    }
}
