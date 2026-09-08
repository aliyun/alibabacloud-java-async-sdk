// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeTerminalSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTerminalSessionsResponseBody</p>
 */
public class DescribeTerminalSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sessions")
    private Sessions sessions;

    private DescribeTerminalSessionsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.sessions = builder.sessions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTerminalSessionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessions
     */
    public Sessions getSessions() {
        return this.sessions;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Sessions sessions; 

        private Builder() {
        } 

        private Builder(DescribeTerminalSessionsResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.sessions = model.sessions;
        } 

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sessions.
         */
        public Builder sessions(Sessions sessions) {
            this.sessions = sessions;
            return this;
        }

        public DescribeTerminalSessionsResponseBody build() {
            return new DescribeTerminalSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTerminalSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTerminalSessionsResponseBody</p>
     */
    public static class Connection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClosedReason")
        private String closedReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FailedDetail")
        private String failedDetail;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Connection(Builder builder) {
            this.closedReason = builder.closedReason;
            this.endTime = builder.endTime;
            this.failedDetail = builder.failedDetail;
            this.instanceId = builder.instanceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connection create() {
            return builder().build();
        }

        /**
         * @return closedReason
         */
        public String getClosedReason() {
            return this.closedReason;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return failedDetail
         */
        public String getFailedDetail() {
            return this.failedDetail;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String closedReason; 
            private String endTime; 
            private String failedDetail; 
            private String instanceId; 
            private String startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Connection model) {
                this.closedReason = model.closedReason;
                this.endTime = model.endTime;
                this.failedDetail = model.failedDetail;
                this.instanceId = model.instanceId;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * ClosedReason.
             */
            public Builder closedReason(String closedReason) {
                this.closedReason = closedReason;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FailedDetail.
             */
            public Builder failedDetail(String failedDetail) {
                this.failedDetail = failedDetail;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Connection build() {
                return new Connection(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTerminalSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTerminalSessionsResponseBody</p>
     */
    public static class Connections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connection")
        private java.util.List<Connection> connection;

        private Connections(Builder builder) {
            this.connection = builder.connection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connections create() {
            return builder().build();
        }

        /**
         * @return connection
         */
        public java.util.List<Connection> getConnection() {
            return this.connection;
        }

        public static final class Builder {
            private java.util.List<Connection> connection; 

            private Builder() {
            } 

            private Builder(Connections model) {
                this.connection = model.connection;
            } 

            /**
             * Connection.
             */
            public Builder connection(java.util.List<Connection> connection) {
                this.connection = connection;
                return this;
            }

            public Connections build() {
                return new Connections(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTerminalSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTerminalSessionsResponseBody</p>
     */
    public static class Session extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIP")
        private String clientIP;

        @com.aliyun.core.annotation.NameInMap("Connections")
        private Connections connections;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("IdentityType")
        private String identityType;

        @com.aliyun.core.annotation.NameInMap("PortNumber")
        private Integer portNumber;

        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TargetServer")
        private String targetServer;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Session(Builder builder) {
            this.clientIP = builder.clientIP;
            this.connections = builder.connections;
            this.creationTime = builder.creationTime;
            this.identityType = builder.identityType;
            this.portNumber = builder.portNumber;
            this.principalId = builder.principalId;
            this.sessionId = builder.sessionId;
            this.targetServer = builder.targetServer;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Session create() {
            return builder().build();
        }

        /**
         * @return clientIP
         */
        public String getClientIP() {
            return this.clientIP;
        }

        /**
         * @return connections
         */
        public Connections getConnections() {
            return this.connections;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return identityType
         */
        public String getIdentityType() {
            return this.identityType;
        }

        /**
         * @return portNumber
         */
        public Integer getPortNumber() {
            return this.portNumber;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return targetServer
         */
        public String getTargetServer() {
            return this.targetServer;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String clientIP; 
            private Connections connections; 
            private String creationTime; 
            private String identityType; 
            private Integer portNumber; 
            private String principalId; 
            private String sessionId; 
            private String targetServer; 
            private String username; 

            private Builder() {
            } 

            private Builder(Session model) {
                this.clientIP = model.clientIP;
                this.connections = model.connections;
                this.creationTime = model.creationTime;
                this.identityType = model.identityType;
                this.portNumber = model.portNumber;
                this.principalId = model.principalId;
                this.sessionId = model.sessionId;
                this.targetServer = model.targetServer;
                this.username = model.username;
            } 

            /**
             * ClientIP.
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * Connections.
             */
            public Builder connections(Connections connections) {
                this.connections = connections;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * IdentityType.
             */
            public Builder identityType(String identityType) {
                this.identityType = identityType;
                return this;
            }

            /**
             * PortNumber.
             */
            public Builder portNumber(Integer portNumber) {
                this.portNumber = portNumber;
                return this;
            }

            /**
             * PrincipalId.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * TargetServer.
             */
            public Builder targetServer(String targetServer) {
                this.targetServer = targetServer;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Session build() {
                return new Session(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTerminalSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTerminalSessionsResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Session")
        private java.util.List<Session> session;

        private Sessions(Builder builder) {
            this.session = builder.session;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return session
         */
        public java.util.List<Session> getSession() {
            return this.session;
        }

        public static final class Builder {
            private java.util.List<Session> session; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.session = model.session;
            } 

            /**
             * Session.
             */
            public Builder session(java.util.List<Session> session) {
                this.session = session;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
}
