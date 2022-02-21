// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterConnectionsResponseBody</p>
 */
public class DescribeClusterConnectionsResponseBody extends TeaModel {
    @NameInMap("Connections")
    private java.util.List < Connections> connections;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskFinished")
    private Boolean taskFinished;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeClusterConnectionsResponseBody(Builder builder) {
        this.connections = builder.connections;
        this.requestId = builder.requestId;
        this.taskFinished = builder.taskFinished;
        this.taskId = builder.taskId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterConnectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return connections
     */
    public java.util.List < Connections> getConnections() {
        return this.connections;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskFinished
     */
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Connections> connections; 
        private String requestId; 
        private Boolean taskFinished; 
        private String taskId; 
        private Long totalCount; 

        /**
         * Connections.
         */
        public Builder connections(java.util.List < Connections> connections) {
            this.connections = connections;
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
         * TaskFinished.
         */
        public Builder taskFinished(Boolean taskFinished) {
            this.taskFinished = taskFinished;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeClusterConnectionsResponseBody build() {
            return new DescribeClusterConnectionsResponseBody(this);
        } 

    } 

    public static class Connections extends TeaModel {
        @NameInMap("ClientName")
        private String clientName;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("LogoffStatus")
        private String logoffStatus;

        @NameInMap("LogoffTime")
        private String logoffTime;

        @NameInMap("LogonTime")
        private String logonTime;

        private Connections(Builder builder) {
            this.clientName = builder.clientName;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.logoffStatus = builder.logoffStatus;
            this.logoffTime = builder.logoffTime;
            this.logonTime = builder.logonTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connections create() {
            return builder().build();
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return logoffStatus
         */
        public String getLogoffStatus() {
            return this.logoffStatus;
        }

        /**
         * @return logoffTime
         */
        public String getLogoffTime() {
            return this.logoffTime;
        }

        /**
         * @return logonTime
         */
        public String getLogonTime() {
            return this.logonTime;
        }

        public static final class Builder {
            private String clientName; 
            private String hostName; 
            private String instanceId; 
            private String instanceName; 
            private String logoffStatus; 
            private String logoffTime; 
            private String logonTime; 

            /**
             * ClientName.
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * LogoffStatus.
             */
            public Builder logoffStatus(String logoffStatus) {
                this.logoffStatus = logoffStatus;
                return this;
            }

            /**
             * LogoffTime.
             */
            public Builder logoffTime(String logoffTime) {
                this.logoffTime = logoffTime;
                return this;
            }

            /**
             * LogonTime.
             */
            public Builder logonTime(String logonTime) {
                this.logonTime = logonTime;
                return this;
            }

            public Connections build() {
                return new Connections(this);
            } 

        } 

    }
}
