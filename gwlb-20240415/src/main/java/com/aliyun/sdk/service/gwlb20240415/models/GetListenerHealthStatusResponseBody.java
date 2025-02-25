// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

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
         * ListenerHealthStatus.
         */
        public Builder listenerHealthStatus(java.util.List < ListenerHealthStatus> listenerHealthStatus) {
            this.listenerHealthStatus = listenerHealthStatus;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
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

            /**
             * ReasonCode.
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

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * Status.
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
        private java.util.List < Servers> servers;

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
        public java.util.List < Servers> getServers() {
            return this.servers;
        }

        public static final class Builder {
            private Boolean healthCheckEnabled; 
            private String serverGroupId; 
            private java.util.List < Servers> servers; 

            /**
             * HealthCheckEnabled.
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * ServerGroupId.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * Servers.
             */
            public Builder servers(java.util.List < Servers> servers) {
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
        private java.util.List < ServerGroupInfos> serverGroupInfos;

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
        public java.util.List < ServerGroupInfos> getServerGroupInfos() {
            return this.serverGroupInfos;
        }

        public static final class Builder {
            private String listenerId; 
            private java.util.List < ServerGroupInfos> serverGroupInfos; 

            /**
             * ListenerId.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * ServerGroupInfos.
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
