// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterLogsResponseBody</p>
 */
public class ListClusterLogsResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("Logs")
    private Logs logs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClusterLogsResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.logs = builder.logs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return logs
     */
    public Logs getLogs() {
        return this.logs;
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
        private String clusterId; 
        private Logs logs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The details about operations logs.
         */
        public Builder logs(Logs logs) {
            this.logs = logs;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries that are returned per page.
         */
        public Builder pageSize(Integer pageSize) {
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
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClusterLogsResponseBody build() {
            return new ListClusterLogsResponseBody(this);
        } 

    } 

    public static class LogInfo extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("Operation")
        private String operation;

        private LogInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.level = builder.level;
            this.message = builder.message;
            this.operation = builder.operation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        public static final class Builder {
            private String createTime; 
            private String level; 
            private String message; 
            private String operation; 

            /**
             * The time when the log was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The severity level of the log entry.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The content of the log entry.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The name of the operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            public LogInfo build() {
                return new LogInfo(this);
            } 

        } 

    }
    public static class Logs extends TeaModel {
        @NameInMap("LogInfo")
        private java.util.List < LogInfo> logInfo;

        private Logs(Builder builder) {
            this.logInfo = builder.logInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return logInfo
         */
        public java.util.List < LogInfo> getLogInfo() {
            return this.logInfo;
        }

        public static final class Builder {
            private java.util.List < LogInfo> logInfo; 

            /**
             * LogInfo.
             */
            public Builder logInfo(java.util.List < LogInfo> logInfo) {
                this.logInfo = logInfo;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
