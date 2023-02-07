// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClusterLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHubClusterLogsResponseBody</p>
 */
public class DescribeHubClusterLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    private java.util.List < Logs> logs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHubClusterLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHubClusterLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public java.util.List < Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Logs> logs; 
        private String requestId; 

        /**
         * Brief information about operation logs.
         */
        public Builder logs(java.util.List < Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHubClusterLogsResponseBody build() {
            return new DescribeHubClusterLogsResponseBody(this);
        } 

    } 

    public static class Logs extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterLog")
        private String clusterLog;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("LogLevel")
        private String logLevel;

        private Logs(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterLog = builder.clusterLog;
            this.creationTime = builder.creationTime;
            this.logLevel = builder.logLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterLog
         */
        public String getClusterLog() {
            return this.clusterLog;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterLog; 
            private String creationTime; 
            private String logLevel; 

            /**
             * The ID of the master instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * A log of the master instance.
             */
            public Builder clusterLog(String clusterLog) {
                this.clusterLog = clusterLog;
                return this;
            }

            /**
             * The time when the log was created. Format: <i>yyyy-mm-dd</i>t<i>hh:mm:ss</i>z (UTC time).
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The severity level of the log. Valid values: - error: errors. - warn: warnings. - info: information.
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
