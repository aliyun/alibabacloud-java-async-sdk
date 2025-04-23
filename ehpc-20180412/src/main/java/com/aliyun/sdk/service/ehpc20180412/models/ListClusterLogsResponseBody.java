// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListClusterLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterLogsResponseBody</p>
 */
public class ListClusterLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Logs")
    private Logs logs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListClusterLogsResponseBody model) {
            this.clusterId = model.clusterId;
            this.logs = model.logs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The queried operations logs.</p>
         */
        public Builder logs(Logs logs) {
            this.logs = logs;
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
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BBC2F93D-003A-49C4-850C-B826EECF6667</p>
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClusterLogsResponseBody build() {
            return new ListClusterLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterLogsResponseBody</p>
     */
    public static class LogInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Operation")
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

            private Builder() {
            } 

            private Builder(LogInfo model) {
                this.createTime = model.createTime;
                this.level = model.level;
                this.message = model.message;
                this.operation = model.operation;
            } 

            /**
             * <p>The time when the log was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-18T13:24:13.000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The level of the log entry. Valid values:</p>
             * <ul>
             * <li>warn</li>
             * <li>error</li>
             * <li>info</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The content of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>Begin to create cluster</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The type of the operation. Valid values:</p>
             * <ul>
             * <li>CreateCluster</li>
             * <li>StartCluster</li>
             * <li>StopCluster</li>
             * <li>DeleteCluster</li>
             * <li>AddNodes</li>
             * <li>StartNodes</li>
             * <li>ResetNodes</li>
             * <li>StopNodes</li>
             * <li>DeleteNodes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CreateCluster</p>
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
    /**
     * 
     * {@link ListClusterLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterLogsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogInfo")
        private java.util.List<LogInfo> logInfo;

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
        public java.util.List<LogInfo> getLogInfo() {
            return this.logInfo;
        }

        public static final class Builder {
            private java.util.List<LogInfo> logInfo; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.logInfo = model.logInfo;
            } 

            /**
             * LogInfo.
             */
            public Builder logInfo(java.util.List<LogInfo> logInfo) {
                this.logInfo = logInfo;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
