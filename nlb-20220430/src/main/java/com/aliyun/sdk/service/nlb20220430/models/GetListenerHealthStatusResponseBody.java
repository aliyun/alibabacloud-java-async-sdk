// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetListenerHealthStatusResponseBody</p>
 */
public class GetListenerHealthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListenerHealthStatus")
    private java.util.List < ListenerHealthStatus> listenerHealthStatus;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetListenerHealthStatusResponseBody(Builder builder) {
        this.listenerHealthStatus = builder.listenerHealthStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListenerHealthStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return listenerHealthStatus
     */
    public java.util.List < ListenerHealthStatus> getListenerHealthStatus() {
        return this.listenerHealthStatus;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < ListenerHealthStatus> listenerHealthStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The health check status of the server groups that are associated with the listener.
         */
        public Builder listenerHealthStatus(java.util.List < ListenerHealthStatus> listenerHealthStatus) {
            this.listenerHealthStatus = listenerHealthStatus;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * - If **NextToken** is empty, it indicates that no next query is to be sent.
         * - If a value of **NextToken** is returned, the value is the token used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetListenerHealthStatusResponseBody build() {
            return new GetListenerHealthStatusResponseBody(this);
        } 

    } 

    public static class Reason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        private Reason(Builder builder) {
            this.reasonCode = builder.reasonCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reason create() {
            return builder().build();
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        public static final class Builder {
            private String reasonCode; 

            /**
             * The reason why the **status** is abnormal. Valid values:
             * <p>
             * 
             * *   **CONNECT_TIMEOUT**: The NLB instance failed to connect to the backend server within the specified period of time.
             * *   **CONNECT_FAILED**: The NLB instance failed to connect to the backend server.
             * *   **RECV_RESPONSE_TIMEOUT**: The NLB instance failed to receive a response from the backend server within the specified period of time.
             * *   **CONNECT_INTERRUPT**: The connection between the health check and the backend servers was interrupted.
             * *   **HTTP_CODE_NOT_MATCH**: The HTTP status code from the backend servers was not the expected one.
             * *   **HTTP_INVALID_HEADER**: The format of the response from the backend servers is invalid.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            public Reason build() {
                return new Reason(this);
            } 

        } 

    }
    public static class NonNormalServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private Reason reason;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NonNormalServers(Builder builder) {
            this.port = builder.port;
            this.reason = builder.reason;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonNormalServers create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return reason
         */
        public Reason getReason() {
            return this.reason;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer port; 
            private Reason reason; 
            private String serverId; 
            private String serverIp; 
            private String status; 

            /**
             * The backend port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The cause of the health check failure.
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The ID of the backend server.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The IP address of the backend server.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * The health check status. Valid values:
             * <p>
             * 
             * *   **Initial**: indicates that health checks are configured for the NLB instance, but no data was found.
             * *   **Unhealthy**: indicates that the backend server consecutively fails health checks.
             * *   **Unused**: indicates that the weight of the backend server is 0.
             * *   **Unavailable**: indicates that health checks are disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NonNormalServers build() {
                return new NonNormalServers(this);
            } 

        } 

    }
    public static class ServerGroupInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeathCheckEnabled")
        private Boolean heathCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("NonNormalServers")
        private java.util.List < NonNormalServers> nonNormalServers;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        private ServerGroupInfos(Builder builder) {
            this.heathCheckEnabled = builder.heathCheckEnabled;
            this.nonNormalServers = builder.nonNormalServers;
            this.serverGroupId = builder.serverGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupInfos create() {
            return builder().build();
        }

        /**
         * @return heathCheckEnabled
         */
        public Boolean getHeathCheckEnabled() {
            return this.heathCheckEnabled;
        }

        /**
         * @return nonNormalServers
         */
        public java.util.List < NonNormalServers> getNonNormalServers() {
            return this.nonNormalServers;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public static final class Builder {
            private Boolean heathCheckEnabled; 
            private java.util.List < NonNormalServers> nonNormalServers; 
            private String serverGroupId; 

            /**
             * Indicates whether the health check feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder heathCheckEnabled(Boolean heathCheckEnabled) {
                this.heathCheckEnabled = heathCheckEnabled;
                return this;
            }

            /**
             * A list of unhealthy backend servers.
             */
            public Builder nonNormalServers(java.util.List < NonNormalServers> nonNormalServers) {
                this.nonNormalServers = nonNormalServers;
                return this;
            }

            /**
             * The ID of the server group.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            public ServerGroupInfos build() {
                return new ServerGroupInfos(this);
            } 

        } 

    }
    public static class ListenerHealthStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("ServerGroupInfos")
        private java.util.List < ServerGroupInfos> serverGroupInfos;

        private ListenerHealthStatus(Builder builder) {
            this.listenerId = builder.listenerId;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.serverGroupInfos = builder.serverGroupInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerHealthStatus create() {
            return builder().build();
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        /**
         * @return serverGroupInfos
         */
        public java.util.List < ServerGroupInfos> getServerGroupInfos() {
            return this.serverGroupInfos;
        }

        public static final class Builder {
            private String listenerId; 
            private Integer listenerPort; 
            private String listenerProtocol; 
            private java.util.List < ServerGroupInfos> serverGroupInfos; 

            /**
             * The ID of the listener of the NLB instance.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The listening port.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The listening protocol. Valid values: **TCP**, **UDP**, and **TCPSSL**.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * The information about the server groups.
             */
            public Builder serverGroupInfos(java.util.List < ServerGroupInfos> serverGroupInfos) {
                this.serverGroupInfos = serverGroupInfos;
                return this;
            }

            public ListenerHealthStatus build() {
                return new ListenerHealthStatus(this);
            } 

        } 

    }
}
