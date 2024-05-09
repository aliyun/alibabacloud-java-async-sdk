// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApsActionLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsActionLogsResponseBody</p>
 */
public class DescribeApsActionLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionLogs")
    private java.util.List < ActionLogs> actionLogs;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("WorkloadId")
    private String workloadId;

    private DescribeApsActionLogsResponseBody(Builder builder) {
        this.actionLogs = builder.actionLogs;
        this.DBClusterId = builder.DBClusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workloadId = builder.workloadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsActionLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return actionLogs
     */
    public java.util.List < ActionLogs> getActionLogs() {
        return this.actionLogs;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workloadId
     */
    public String getWorkloadId() {
        return this.workloadId;
    }

    public static final class Builder {
        private java.util.List < ActionLogs> actionLogs; 
        private String DBClusterId; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 
        private String workloadId; 

        /**
         * Details of the logs.
         */
        public Builder actionLogs(java.util.List < ActionLogs> actionLogs) {
            this.actionLogs = actionLogs;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The ID of the real-time data ingestion task.
         */
        public Builder workloadId(String workloadId) {
            this.workloadId = workloadId;
            return this;
        }

        public DescribeApsActionLogsResponseBody build() {
            return new DescribeApsActionLogsResponseBody(this);
        } 

    } 

    public static class ActionLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private ActionLogs(Builder builder) {
            this.context = builder.context;
            this.stage = builder.stage;
            this.state = builder.state;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionLogs create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String context; 
            private String stage; 
            private String state; 
            private String time; 

            /**
             * The content of the log.
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * The task phase during which the logs are generated. Valid values:
             * <p>
             * 
             * *   **StructureMigrate**: schema migration.
             * *   **FullDataSync**: full data synchronization.
             * *   **IncrementalSync**: incremental data synchronization.
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * The type of the log. Multiple log types are separated by commas (,). Valid values:
             * <p>
             * 
             * *   **INFO**
             * *   **WARN**
             * *   **ERROR**
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The time when the log is generated. The time follows the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format. The time is displayed in UTC.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ActionLogs build() {
                return new ActionLogs(this);
            } 

        } 

    }
}
