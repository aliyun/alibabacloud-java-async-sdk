// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHealthStatus")
    private java.util.List < RuleHealthStatus> ruleHealthStatus;

    private GetListenerHealthStatusResponseBody(Builder builder) {
        this.listenerHealthStatus = builder.listenerHealthStatus;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.ruleHealthStatus = builder.ruleHealthStatus;
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
     * @return ruleHealthStatus
     */
    public java.util.List < RuleHealthStatus> getRuleHealthStatus() {
        return this.ruleHealthStatus;
    }

    public static final class Builder {
        private java.util.List < ListenerHealthStatus> listenerHealthStatus; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < RuleHealthStatus> ruleHealthStatus; 

        /**
         * <p>The health check status of the server groups that are associated with the listener.</p>
         */
        public Builder listenerHealthStatus(java.util.List < ListenerHealthStatus> listenerHealthStatus) {
            this.listenerHealthStatus = listenerHealthStatus;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The health check status of the forwarding rules.</p>
         */
        public Builder ruleHealthStatus(java.util.List < RuleHealthStatus> ruleHealthStatus) {
            this.ruleHealthStatus = ruleHealthStatus;
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
        @com.aliyun.core.annotation.NameInMap("ActualResponse")
        private String actualResponse;

        @com.aliyun.core.annotation.NameInMap("ExpectedResponse")
        private String expectedResponse;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        private Reason(Builder builder) {
            this.actualResponse = builder.actualResponse;
            this.expectedResponse = builder.expectedResponse;
            this.reasonCode = builder.reasonCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reason create() {
            return builder().build();
        }

        /**
         * @return actualResponse
         */
        public String getActualResponse() {
            return this.actualResponse;
        }

        /**
         * @return expectedResponse
         */
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        public static final class Builder {
            private String actualResponse; 
            private String expectedResponse; 
            private String reasonCode; 

            /**
             * <p>The HTTP status code returned from the server, for example, <strong>302</strong>.</p>
             * <blockquote>
             * <p>A value is returned only if <code>ReasonCode</code> is set to <strong>RESPONSE_MISMATCH</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>302</p>
             */
            public Builder actualResponse(String actualResponse) {
                this.actualResponse = actualResponse;
                return this;
            }

            /**
             * <p>The HTTP status code returned after backend servers pass health checks.</p>
             * <p>Valid values: <strong>HTTP_2xx</strong>, <strong>HTTP_3xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong>. Multiple status codes are separated by commas (,).</p>
             * <blockquote>
             * <p>This value is returned only if <strong>ReasonCode</strong> is set to <strong>RESPONSE_MISMATCH</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP_2xx</p>
             */
            public Builder expectedResponse(String expectedResponse) {
                this.expectedResponse = expectedResponse;
                return this;
            }

            /**
             * <p>The reason why the value of <strong>Status</strong> is Unhealthy. Only HTTP and HTTPS listeners support this parameter.</p>
             * <ul>
             * <li><strong>CONNECT_TIMEOUT</strong>: ALB failed to connect to the backend server within the specified period of time.</li>
             * <li><strong>CONNECT_FAILED</strong>: ALB failed to connect to the backend server.</li>
             * <li><strong>RECV_RESPONSE_FAILED</strong>: ALB failed to receive a response from the backend server.</li>
             * <li><strong>RECV_RESPONSE_TIMEOUT</strong>: ALB failed to receive a response from the backend server within the specified period of time.</li>
             * <li><strong>SEND_REQUEST_FAILED</strong>: ALB failed to send a request to the backend server.</li>
             * <li><strong>SEND_REQUEST_TIMEOUT</strong>: ALB failed to send a request to the backend server within the specified period of time.</li>
             * <li><strong>RESPONSE_FORMAT_ERROR</strong>: The format of the response from the backend server is invalid.</li>
             * <li><strong>RESPONSE_FORMAT_ERROR</strong>: The HTTP status code returned from the backend server is not the expected one.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESPONSE_MISMATCH</p>
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

            /**
             * <p>The backend port.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The cause of the abnormal state.</p>
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The ID of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp1bfa08ex*****</p>
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
             * <p>The status of the health check. Valid values: Valid values:</p>
             * <ul>
             * <li><strong>Initial</strong>: indicates that health checks are configured for the NLB instance, but no data was found.</li>
             * <li><strong>Unhealthy</strong>: indicates that the backend server consecutively fails health checks.</li>
             * <li><strong>Unused</strong>: indicates that the weight of the backend server is 0.</li>
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
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        private String healthCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("NonNormalServers")
        private java.util.List < NonNormalServers> nonNormalServers;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        private ServerGroupInfos(Builder builder) {
            this.actionType = builder.actionType;
            this.healthCheckEnabled = builder.healthCheckEnabled;
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
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return healthCheckEnabled
         */
        public String getHealthCheckEnabled() {
            return this.healthCheckEnabled;
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
            private String actionType; 
            private String healthCheckEnabled; 
            private java.util.List < NonNormalServers> nonNormalServers; 
            private String serverGroupId; 

            /**
             * <p>The action specified for the server group. Valid values:</p>
             * <ul>
             * <li><strong>ForwardGroup</strong>: distributes requests to server groups.</li>
             * <li><strong>TrafficMirror</strong>: mirrors requests to server groups.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TrafficMirror</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>Indicates whether health checks are enabled. If <strong>on</strong> is returned, it indicates that health checks are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder healthCheckEnabled(String healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * <p>A list of unhealthy backend servers.</p>
             */
            public Builder nonNormalServers(java.util.List < NonNormalServers> nonNormalServers) {
                this.nonNormalServers = nonNormalServers;
                return this;
            }

            /**
             * <p>The ID of the server group that is associated with the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>vsp-bp1qjwo61pqz3ahltv****</p>
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
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsr-bp1bpn0kn908w4nbw****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The listener protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * <p>The information about the server group.</p>
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
    /**
     * 
     * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerHealthStatusResponseBody</p>
     */
    public static class NonNormalServersReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualResponse")
        private String actualResponse;

        @com.aliyun.core.annotation.NameInMap("ExpectedResponse")
        private String expectedResponse;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        private NonNormalServersReason(Builder builder) {
            this.actualResponse = builder.actualResponse;
            this.expectedResponse = builder.expectedResponse;
            this.reasonCode = builder.reasonCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonNormalServersReason create() {
            return builder().build();
        }

        /**
         * @return actualResponse
         */
        public String getActualResponse() {
            return this.actualResponse;
        }

        /**
         * @return expectedResponse
         */
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        public static final class Builder {
            private String actualResponse; 
            private String expectedResponse; 
            private String reasonCode; 

            /**
             * <p>The HTTP status code returned from the server, for example, <strong>302</strong>.</p>
             * <blockquote>
             * <p>A value is returned only if <strong>ReasonCode</strong> is set to <strong>RESPONSE_MISMATCH</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>302</p>
             */
            public Builder actualResponse(String actualResponse) {
                this.actualResponse = actualResponse;
                return this;
            }

            /**
             * <p>The HTTP status code returned after backend servers pass health checks.</p>
             * <p>Valid values: <strong>HTTP_2xx</strong>, <strong>HTTP_3xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong>. Multiple status codes are separated by commas (,).</p>
             * <blockquote>
             * <p>A value is returned only if <strong>ReasonCode</strong> is set to <strong>RESPONSE_MISMATCH</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP_2xx</p>
             */
            public Builder expectedResponse(String expectedResponse) {
                this.expectedResponse = expectedResponse;
                return this;
            }

            /**
             * <p>The reason why the value of <strong>Status</strong> is Unhealthy. Only HTTP and HTTPS listeners support this parameter.</p>
             * <ul>
             * <li><strong>CONNECT_TIMEOUT</strong>: ALB failed to connect to the backend server within the specified period of time.</li>
             * <li><strong>CONNECT_FAILED</strong>: ALB failed to connect to the backend server.</li>
             * <li><strong>RECV_RESPONSE_FAILED</strong>: ALB failed to receive a response from the backend server.</li>
             * <li><strong>RECV_RESPONSE_TIMEOUT</strong>: ALB failed to receive a response from the backend server within the specified period of time.</li>
             * <li><strong>SEND_REQUEST_FAILED</strong>: ALB failed to send a request to the backend server.</li>
             * <li><strong>SEND_REQUEST_TIMEOUT</strong>: ALB failed to send a request to the backend server within the specified period of time.</li>
             * <li><strong>RESPONSE_FORMAT_ERROR</strong>: The format of the response from the backend server is invalid.</li>
             * <li><strong>RESPONSE_FORMAT_ERROR</strong>: The HTTP status code returned from the backend server is not the expected one.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESPONSE_MISMATCH</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            public NonNormalServersReason build() {
                return new NonNormalServersReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerHealthStatusResponseBody</p>
     */
    public static class ServerGroupInfosNonNormalServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private NonNormalServersReason reason;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ServerGroupInfosNonNormalServers(Builder builder) {
            this.port = builder.port;
            this.reason = builder.reason;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupInfosNonNormalServers create() {
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
        public NonNormalServersReason getReason() {
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
            private NonNormalServersReason reason; 
            private String serverId; 
            private String serverIp; 
            private String status; 

            /**
             * <p>The backend port.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The cause of the abnormal state.</p>
             */
            public Builder reason(NonNormalServersReason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The ID of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp1bfa08ex****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP address of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.2.11</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The status of the health check. Valid values: Valid values:</p>
             * <ul>
             * <li><strong>Initial</strong>: indicates that health checks are configured for the NLB instance, but no data was found.</li>
             * <li><strong>Unhealthy</strong>: indicates that the backend server consecutively fails health checks.</li>
             * <li><strong>Unused</strong>: indicates that the weight of the backend server is 0.</li>
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

            public ServerGroupInfosNonNormalServers build() {
                return new ServerGroupInfosNonNormalServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerHealthStatusResponseBody</p>
     */
    public static class RuleHealthStatusServerGroupInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        private String healthCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("NonNormalServers")
        private java.util.List < ServerGroupInfosNonNormalServers> nonNormalServers;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        private RuleHealthStatusServerGroupInfos(Builder builder) {
            this.actionType = builder.actionType;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.nonNormalServers = builder.nonNormalServers;
            this.serverGroupId = builder.serverGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHealthStatusServerGroupInfos create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return healthCheckEnabled
         */
        public String getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        /**
         * @return nonNormalServers
         */
        public java.util.List < ServerGroupInfosNonNormalServers> getNonNormalServers() {
            return this.nonNormalServers;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public static final class Builder {
            private String actionType; 
            private String healthCheckEnabled; 
            private java.util.List < ServerGroupInfosNonNormalServers> nonNormalServers; 
            private String serverGroupId; 

            /**
             * <p>The action specified for the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>TrafficMirror</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>Indicates whether health checks are enabled. If <strong>on</strong> is returned, it indicates that health checks are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder healthCheckEnabled(String healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * <p>A list of unhealthy backend servers.</p>
             */
            public Builder nonNormalServers(java.util.List < ServerGroupInfosNonNormalServers> nonNormalServers) {
                this.nonNormalServers = nonNormalServers;
                return this;
            }

            /**
             * <p>The ID of the server group that is associated with the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>vsp-bp1qjwo61pqz3ahlt****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            public RuleHealthStatusServerGroupInfos build() {
                return new RuleHealthStatusServerGroupInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerHealthStatusResponseBody</p>
     */
    public static class RuleHealthStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ServerGroupInfos")
        private java.util.List < RuleHealthStatusServerGroupInfos> serverGroupInfos;

        private RuleHealthStatus(Builder builder) {
            this.ruleId = builder.ruleId;
            this.serverGroupInfos = builder.serverGroupInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHealthStatus create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return serverGroupInfos
         */
        public java.util.List < RuleHealthStatusServerGroupInfos> getServerGroupInfos() {
            return this.serverGroupInfos;
        }

        public static final class Builder {
            private String ruleId; 
            private java.util.List < RuleHealthStatusServerGroupInfos> serverGroupInfos; 

            /**
             * <p>The ID of the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-hp34s2h0xx1ht4nwo****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The server groups.</p>
             */
            public Builder serverGroupInfos(java.util.List < RuleHealthStatusServerGroupInfos> serverGroupInfos) {
                this.serverGroupInfos = serverGroupInfos;
                return this;
            }

            public RuleHealthStatus build() {
                return new RuleHealthStatus(this);
            } 

        } 

    }
}
