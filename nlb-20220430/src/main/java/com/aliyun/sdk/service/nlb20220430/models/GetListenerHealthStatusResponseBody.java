// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetListenerHealthStatusResponseBody</p>
 */
public class GetListenerHealthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListenerHealthStatus")
    private java.util.List<ListenerHealthStatus> listenerHealthStatus;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listenerHealthStatus
     */
    public java.util.List<ListenerHealthStatus> getListenerHealthStatus() {
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
        private java.util.List<ListenerHealthStatus> listenerHealthStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetListenerHealthStatusResponseBody model) {
            this.listenerHealthStatus = model.listenerHealthStatus;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The health check status of the server group of the listener.</p>
         */
        public Builder listenerHealthStatus(java.util.List<ListenerHealthStatus> listenerHealthStatus) {
            this.listenerHealthStatus = listenerHealthStatus;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, it indicates that no next query is to be sent.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value is the token used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetListenerHealthStatusResponseBody build() {
            return new GetListenerHealthStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerHealthStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Reason model) {
                this.reasonCode = model.reasonCode;
            } 

            /**
             * <p>The reason why the <strong>status</strong> is abnormal. Valid values:</p>
             * <ul>
             * <li><strong>CONNECT_TIMEOUT</strong>: The NLB instance failed to connect to the backend server within the specified period of time.</li>
             * <li><strong>CONNECT_FAILED</strong>: The NLB instance failed to connect to the backend server.</li>
             * <li><strong>RECV_RESPONSE_TIMEOUT</strong>: The NLB instance failed to receive a response from the backend server within the specified period of time.</li>
             * <li><strong>CONNECT_INTERRUPT</strong>: The connection between the health check and the backend servers was interrupted.</li>
             * <li><strong>HTTP_CODE_NOT_MATCH</strong>: The HTTP status code from the backend servers was not the expected one.</li>
             * <li><strong>HTTP_INVALID_HEADER</strong>: The format of the response from the backend servers is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONNECT_TIMEOUT</p>
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
    /**
     * 
     * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerHealthStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NonNormalServers model) {
                this.port = model.port;
                this.reason = model.reason;
                this.serverId = model.serverId;
                this.serverIp = model.serverIp;
                this.status = model.status;
            } 

            /**
             * <p>The backend port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The cause of the health check failure.</p>
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The ID of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1bt75jaujl7tjl****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP address of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.8.10</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The health check status. Valid values:</p>
             * <ul>
             * <li><strong>Initial</strong>: indicates that health checks are configured for the NLB instance, but no data was found.</li>
             * <li><strong>Unhealthy</strong>: indicates that the backend server consecutively fails health checks.</li>
             * <li><strong>Unavailable</strong>: indicates that health checks are disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Initial</p>
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
    /**
     * 
     * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerHealthStatusResponseBody</p>
     */
    public static class ServerGroupInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeathCheckEnabled")
        private Boolean heathCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("NonNormalServers")
        private java.util.List<NonNormalServers> nonNormalServers;

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
        public java.util.List<NonNormalServers> getNonNormalServers() {
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
            private java.util.List<NonNormalServers> nonNormalServers; 
            private String serverGroupId; 

            private Builder() {
            } 

            private Builder(ServerGroupInfos model) {
                this.heathCheckEnabled = model.heathCheckEnabled;
                this.nonNormalServers = model.nonNormalServers;
                this.serverGroupId = model.serverGroupId;
            } 

            /**
             * <p>Indicates whether the health check feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder heathCheckEnabled(Boolean heathCheckEnabled) {
                this.heathCheckEnabled = heathCheckEnabled;
                return this;
            }

            /**
             * <p>A list of unhealthy backend servers.</p>
             */
            public Builder nonNormalServers(java.util.List<NonNormalServers> nonNormalServers) {
                this.nonNormalServers = nonNormalServers;
                return this;
            }

            /**
             * <p>The ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-ppdpc14gdm3x4o****</p>
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
    /**
     * 
     * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerHealthStatusResponseBody</p>
     */
    public static class ListenerHealthStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("ServerGroupInfos")
        private java.util.List<ServerGroupInfos> serverGroupInfos;

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
        public java.util.List<ServerGroupInfos> getServerGroupInfos() {
            return this.serverGroupInfos;
        }

        public static final class Builder {
            private String listenerId; 
            private Integer listenerPort; 
            private String listenerProtocol; 
            private java.util.List<ServerGroupInfos> serverGroupInfos; 

            private Builder() {
            } 

            private Builder(ListenerHealthStatus model) {
                this.listenerId = model.listenerId;
                this.listenerPort = model.listenerPort;
                this.listenerProtocol = model.listenerProtocol;
                this.serverGroupInfos = model.serverGroupInfos;
            } 

            /**
             * <p>The ID of the listener of the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lsn-bp1bpn0kn908w4nbw****@80</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The listening port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The listening protocol. Valid values: <strong>TCP</strong>, <strong>UDP</strong>, and <strong>TCPSSL</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>TCPSSL</p>
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * <p>The information about the server groups.</p>
             */
            public Builder serverGroupInfos(java.util.List<ServerGroupInfos> serverGroupInfos) {
                this.serverGroupInfos = serverGroupInfos;
                return this;
            }

            public ListenerHealthStatus build() {
                return new ListenerHealthStatus(this);
            } 

        } 

    }
}
