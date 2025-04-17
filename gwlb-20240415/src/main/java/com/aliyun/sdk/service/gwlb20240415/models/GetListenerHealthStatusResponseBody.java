// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

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
         * <p>The health check status of the server groups that are associated with the listener.</p>
         */
        public Builder listenerHealthStatus(java.util.List<ListenerHealthStatus> listenerHealthStatus) {
            this.listenerHealthStatus = listenerHealthStatus;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 1000. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>U12WEI6Ro2ol3wA54rBNSwdC5+lYy6q5SjIQEvc1wz5mjZxV+YjsHRdXV8XauY1BpOQIvwX63E0en54H3D****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED4F222-36A0-5470-8A9A-AAB4E96BAC1A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
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
             * <p>The reason why <strong>Status</strong> indicates an unhealthy status. Valid values:</p>
             * <ul>
             * <li><strong>CONNECT_TIMEOUT</strong>: The GWLB instance failed to connect to the backend server within the specified period of time.</li>
             * <li><strong>CONNECT_FAILED</strong>: The GWLB instance failed to connect to the backend server.</li>
             * <li><strong>RECV_RESPONSE_TIMEOUT</strong>: The GWLB instance failed to receive a response from the backend server within the specified period of time.</li>
             * <li><strong>CONNECT_INTERRUPT</strong>: The connection between the health check and the backend server was interrupted.</li>
             * <li><strong>HTTP_CODE_NOT_MATCH</strong>: The HTTP status code from the backend server is not the expected one.</li>
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
    public static class Servers extends TeaModel {
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

        private Servers(Builder builder) {
            this.port = builder.port;
            this.reason = builder.reason;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Servers create() {
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

            private Builder(Servers model) {
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
             * <p>6081</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The reason why <strong>Status</strong> indicates an unhealthy status.</p>
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The backend server ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze4rnh8yj9kif3z****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.XXX</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The health status of the backend server. Valid values:</p>
             * <ul>
             * <li><strong>Initial</strong>: Health checks are configured for the GWLB instance, but no data is found.</li>
             * <li><strong>Unhealthy</strong>: The backend server consecutively fails health checks.</li>
             * <li><strong>Unused</strong>: The backend server is not in use.</li>
             * <li><strong>Unavailable</strong>: Health checks are disabled.</li>
             * <li><strong>Healthy</strong>: The backend server is healthy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Servers build() {
                return new Servers(this);
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
        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("Servers")
        private java.util.List<Servers> servers;

        private ServerGroupInfos(Builder builder) {
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.serverGroupId = builder.serverGroupId;
            this.servers = builder.servers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupInfos create() {
            return builder().build();
        }

        /**
         * @return healthCheckEnabled
         */
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return servers
         */
        public java.util.List<Servers> getServers() {
            return this.servers;
        }

        public static final class Builder {
            private Boolean healthCheckEnabled; 
            private String serverGroupId; 
            private java.util.List<Servers> servers; 

            private Builder() {
            } 

            private Builder(ServerGroupInfos model) {
                this.healthCheckEnabled = model.healthCheckEnabled;
                this.serverGroupId = model.serverGroupId;
                this.servers = model.servers;
            } 

            /**
             * <p>Indicates whether the health check feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * <p>The server group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-0vdsbyszro3nr6****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The backend servers.</p>
             */
            public Builder servers(java.util.List<Servers> servers) {
                this.servers = servers;
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

        @com.aliyun.core.annotation.NameInMap("ServerGroupInfos")
        private java.util.List<ServerGroupInfos> serverGroupInfos;

        private ListenerHealthStatus(Builder builder) {
            this.listenerId = builder.listenerId;
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
         * @return serverGroupInfos
         */
        public java.util.List<ServerGroupInfos> getServerGroupInfos() {
            return this.serverGroupInfos;
        }

        public static final class Builder {
            private String listenerId; 
            private java.util.List<ServerGroupInfos> serverGroupInfos; 

            private Builder() {
            } 

            private Builder(ListenerHealthStatus model) {
                this.listenerId = model.listenerId;
                this.serverGroupInfos = model.serverGroupInfos;
            } 

            /**
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsn-sg8aha6pzjavvo****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
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
