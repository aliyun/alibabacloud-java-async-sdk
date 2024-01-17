// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordLogsResponseBody</p>
 */
public class DescribeRecordLogsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RecordLogs")
    private RecordLogs recordLogs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeRecordLogsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recordLogs = builder.recordLogs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return recordLogs
     */
    public RecordLogs getRecordLogs() {
        return this.recordLogs;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private RecordLogs recordLogs; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The operation logs.
         */
        public Builder recordLogs(RecordLogs recordLogs) {
            this.recordLogs = recordLogs;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRecordLogsResponseBody build() {
            return new DescribeRecordLogsResponseBody(this);
        } 

    } 

    public static class RecordLog extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ActionTime")
        private String actionTime;

        @NameInMap("ActionTimestamp")
        private Long actionTimestamp;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("Message")
        private String message;

        private RecordLog(Builder builder) {
            this.action = builder.action;
            this.actionTime = builder.actionTime;
            this.actionTimestamp = builder.actionTimestamp;
            this.clientIp = builder.clientIp;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordLog create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionTime
         */
        public String getActionTime() {
            return this.actionTime;
        }

        /**
         * @return actionTimestamp
         */
        public Long getActionTimestamp() {
            return this.actionTimestamp;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String action; 
            private String actionTime; 
            private Long actionTimestamp; 
            private String clientIp; 
            private String message; 

            /**
             * The operation that you performed.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The time when you performed the operation.
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * The time when you performed the operation. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder actionTimestamp(Long actionTimestamp) {
                this.actionTimestamp = actionTimestamp;
                return this;
            }

            /**
             * The IP address of the operator.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The operation message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public RecordLog build() {
                return new RecordLog(this);
            } 

        } 

    }
    public static class RecordLogs extends TeaModel {
        @NameInMap("RecordLog")
        private java.util.List < RecordLog> recordLog;

        private RecordLogs(Builder builder) {
            this.recordLog = builder.recordLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordLogs create() {
            return builder().build();
        }

        /**
         * @return recordLog
         */
        public java.util.List < RecordLog> getRecordLog() {
            return this.recordLog;
        }

        public static final class Builder {
            private java.util.List < RecordLog> recordLog; 

            /**
             * RecordLog.
             */
            public Builder recordLog(java.util.List < RecordLog> recordLog) {
                this.recordLog = recordLog;
                return this;
            }

            public RecordLogs build() {
                return new RecordLogs(this);
            } 

        } 

    }
}
