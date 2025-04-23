// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeRecordLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordLogsResponseBody</p>
 */
public class DescribeRecordLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RecordLogs")
    private RecordLogs recordLogs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRecordLogsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.recordLogs = model.recordLogs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The operation logs.</p>
         */
        public Builder recordLogs(RecordLogs recordLogs) {
            this.recordLogs = recordLogs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRecordLogsResponseBody build() {
            return new DescribeRecordLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecordLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordLogsResponseBody</p>
     */
    public static class RecordLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionTime")
        private String actionTime;

        @com.aliyun.core.annotation.NameInMap("ActionTimestamp")
        private Long actionTimestamp;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("Message")
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

            private Builder() {
            } 

            private Builder(RecordLog model) {
                this.action = model.action;
                this.actionTime = model.actionTime;
                this.actionTimestamp = model.actionTimestamp;
                this.clientIp = model.clientIp;
                this.message = model.message;
            } 

            /**
             * <p>The operation that you performed.</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The time when you performed the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-12T09:23Z</p>
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * <p>The time when you performed the operation. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>134514540000</p>
             */
            public Builder actionTimestamp(Long actionTimestamp) {
                this.actionTimestamp = actionTimestamp;
                return this;
            }

            /**
             * <p>The IP address of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>182.92.253.XX</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The operation message.</p>
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
    /**
     * 
     * {@link DescribeRecordLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordLogsResponseBody</p>
     */
    public static class RecordLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordLog")
        private java.util.List<RecordLog> recordLog;

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
        public java.util.List<RecordLog> getRecordLog() {
            return this.recordLog;
        }

        public static final class Builder {
            private java.util.List<RecordLog> recordLog; 

            private Builder() {
            } 

            private Builder(RecordLogs model) {
                this.recordLog = model.recordLog;
            } 

            /**
             * RecordLog.
             */
            public Builder recordLog(java.util.List<RecordLog> recordLog) {
                this.recordLog = recordLog;
                return this;
            }

            public RecordLogs build() {
                return new RecordLogs(this);
            } 

        } 

    }
}
