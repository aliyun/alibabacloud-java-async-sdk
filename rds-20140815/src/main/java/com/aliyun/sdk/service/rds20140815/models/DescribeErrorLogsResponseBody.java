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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ErrorInfo.
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
