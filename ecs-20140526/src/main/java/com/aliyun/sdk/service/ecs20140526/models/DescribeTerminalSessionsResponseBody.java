// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTerminalSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTerminalSessionsResponseBody</p>
 */
public class DescribeTerminalSessionsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sessions")
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
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The information of the sessions.
         */
        public Builder sessions(Sessions sessions) {
            this.sessions = sessions;
            return this;
        }

        public DescribeTerminalSessionsResponseBody build() {
            return new DescribeTerminalSessionsResponseBody(this);
        } 

    } 

    public static class Connection extends TeaModel {
        @NameInMap("ClosedReason")
        private String closedReason;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
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
             * The reason why the connection was closed. This parameter is returned only when the `Status` value is `Disconnected`, `Terminated`, or `Failed`. Valid values:
             * <p>
             * 
             * *   InstanceNotExists: The specified instance did not exist or was released.
             * *   InstanceNotRunning: The specified instance was not running.
             * *   DeliveryTimeout: The connection timed out.
             * *   AgentNeedUpgrade: Cloud Assistant Agent required an upgrade.
             * *   AgentNotOnline: Cloud Assistant Agent was not connected to the Cloud Assistant server.
             * *   MessageFormatInvalid: The message format was invalid.
             * *   AgentSocketClosed: The connection was closed as expected.
             * *   ClientClosed: Session Manager Client closed the connection.
             */
            public Builder closedReason(String closedReason) {
                this.closedReason = closedReason;
                return this;
            }

            /**
             * The time when the connection was closed.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the connection started to be established.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the session. Valid values:
             * <p>
             * 
             * *   Connecting: The connection is being established.
             * *   Connected: The connection is established.
             * *   Disconnected: The connection is disconnected.
             * *   Terminating: The session is being terminated.
             * *   Terminated: The session is terminated.
             * *   Failed: The connection failed.
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
    public static class Connections extends TeaModel {
        @NameInMap("Connection")
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
    public static class Session extends TeaModel {
        @NameInMap("ClientIP")
        private String clientIP;

        @NameInMap("Connections")
        private Connections connections;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IdentityType")
        private String identityType;

        @NameInMap("PortNumber")
        private Integer portNumber;

        @NameInMap("PrincipalId")
        private String principalId;

        @NameInMap("SessionId")
        private String sessionId;

        @NameInMap("TargetServer")
        private String targetServer;

        @NameInMap("Username")
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
             * The IP address of the client used to establish connections.
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * The information of the connections.
             */
            public Builder connections(Connections connections) {
                this.connections = connections;
                return this;
            }

            /**
             * The time when the session was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The principal type. Valid values:
             * <p>
             * 
             * *   Account: an Alibaba Cloud account
             * *   RAMUser: a RAM user
             * *   AssumedRoleUser: a RAM role
             */
            public Builder identityType(String identityType) {
                this.identityType = identityType;
                return this;
            }

            /**
             * The port number of the instance, which is used for data forwarding. If no port number was specified for data forwarding when the session was created, this parameter is empty.
             */
            public Builder portNumber(Integer portNumber) {
                this.portNumber = portNumber;
                return this;
            }

            /**
             * The ID of the principal. Valid values based on the `IdentityType` value:
             * <p>
             * 
             * *   If the requester uses an Alibaba Cloud account to call the operation, the ID of the Alibaba Cloud account is returned.
             * *   If the requester uses a Resource Access Management (RAM) user to call the operation, the ID of the RAM user is returned.
             * *   If the requester uses a RAM role to call the operation, the ID of the principal that actually calls the operation is returned.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * The session ID.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * The address of the service that was accessed in a virtual private cloud (VPC) from the instance.
             */
            public Builder targetServer(String targetServer) {
                this.targetServer = targetServer;
                return this;
            }

            /**
             * The username used to establish connections.
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
    public static class Sessions extends TeaModel {
        @NameInMap("Session")
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
