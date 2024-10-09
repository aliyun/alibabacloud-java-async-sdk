// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
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
         * <p>The information of the sessions.</p>
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

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Connection(Builder builder) {
            this.closedReason = builder.closedReason;
            this.endTime = builder.endTime;
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
            private String instanceId; 
            private String startTime; 
            private String status; 

            /**
             * <p>The reason why the connection was closed. This parameter is returned only when the <code>Status</code> value is <code>Disconnected</code>, <code>Terminated</code>, or <code>Failed</code>. Valid values:</p>
             * <ul>
             * <li>InstanceNotExists: The specified instance did not exist or was released.</li>
             * <li>InstanceNotRunning: The specified instance was not running.</li>
             * <li>DeliveryTimeout: The connection timed out.</li>
             * <li>AgentNeedUpgrade: Cloud Assistant Agent required an upgrade.</li>
             * <li>AgentNotOnline: Cloud Assistant Agent was not connected to the Cloud Assistant server.</li>
             * <li>MessageFormatInvalid: The message format was invalid.</li>
             * <li>AgentSocketClosed: The connection was closed as expected.</li>
             * <li>ClientClosed: Session Manager Client closed the connection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AgentNeedUpgrade</p>
             */
            public Builder closedReason(String closedReason) {
                this.closedReason = closedReason;
                return this;
            }

            /**
             * <p>The time when the connection was closed.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-19T09:16:46Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1i7gg30r52z2em****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the connection started to be established.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-19T09:16:40Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the session. Valid values:</p>
             * <ul>
             * <li>Connecting: The connection is being established.</li>
             * <li>Connected: The connection is established.</li>
             * <li>Disconnected: The connection is disconnected.</li>
             * <li>Terminating: The session is being terminated.</li>
             * <li>Terminated: The session is terminated.</li>
             * <li>Failed: The connection failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connecting</p>
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
        private java.util.List < Connection> connection;

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
        public java.util.List < Connection> getConnection() {
            return this.connection;
        }

        public static final class Builder {
            private java.util.List < Connection> connection; 

            /**
             * Connection.
             */
            public Builder connection(java.util.List < Connection> connection) {
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

            /**
             * <p>The IP address of the client used to establish connections.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * <p>The information of the connections.</p>
             */
            public Builder connections(Connections connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The time when the session was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-19T09:15:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The principal type. Valid values:</p>
             * <ul>
             * <li>Account: an Alibaba Cloud account</li>
             * <li>RAMUser: a RAM user</li>
             * <li>AssumedRoleUser: a RAM role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RAMUser</p>
             */
            public Builder identityType(String identityType) {
                this.identityType = identityType;
                return this;
            }

            /**
             * <p>The port number of the instance, which is used for data forwarding. If no port number was specified for data forwarding when the session was created, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder portNumber(Integer portNumber) {
                this.portNumber = portNumber;
                return this;
            }

            /**
             * <p>The ID of the principal. Valid values based on the <code>IdentityType</code> value:</p>
             * <ul>
             * <li>If the requester uses an Alibaba Cloud account to call the operation, the ID of the Alibaba Cloud account is returned.</li>
             * <li>If the requester uses a Resource Access Management (RAM) user to call the operation, the ID of the RAM user is returned.</li>
             * <li>If the requester uses a RAM role to call the operation, the ID of the principal that actually calls the operation is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>123456xxxx</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s-hz023od0x9****</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The address of the service that was accessed in a virtual private cloud (VPC) from the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.246</p>
             */
            public Builder targetServer(String targetServer) {
                this.targetServer = targetServer;
                return this;
            }

            /**
             * <p>The username used to establish connections.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
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
        private java.util.List < Session> session;

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
        public java.util.List < Session> getSession() {
            return this.session;
        }

        public static final class Builder {
            private java.util.List < Session> session; 

            /**
             * Session.
             */
            public Builder session(java.util.List < Session> session) {
                this.session = session;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
}
