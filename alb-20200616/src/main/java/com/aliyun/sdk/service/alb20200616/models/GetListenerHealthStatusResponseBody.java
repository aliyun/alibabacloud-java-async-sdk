// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetListenerHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetListenerHealthStatusResponseBody</p>
 */
public class GetListenerHealthStatusResponseBody extends TeaModel {
    @NameInMap("ListenerHealthStatus")
    private java.util.List < ListenerHealthStatus> listenerHealthStatus;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleHealthStatus")
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
         * 监听健康检查结果
         */
        public Builder listenerHealthStatus(java.util.List < ListenerHealthStatus> listenerHealthStatus) {
            this.listenerHealthStatus = listenerHealthStatus;
            return this;
        }

        /**
         * 下一页标识
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 转发规则健康检查结果
         */
        public Builder ruleHealthStatus(java.util.List < RuleHealthStatus> ruleHealthStatus) {
            this.ruleHealthStatus = ruleHealthStatus;
            return this;
        }

        public GetListenerHealthStatusResponseBody build() {
            return new GetListenerHealthStatusResponseBody(this);
        } 

    } 

    public static class Reason extends TeaModel {
        @NameInMap("ActualResponse")
        private String actualResponse;

        @NameInMap("ExpectedResponse")
        private String expectedResponse;

        @NameInMap("ReasonCode")
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
             * 后端实际的返回码信息
             */
            public Builder actualResponse(String actualResponse) {
                this.actualResponse = actualResponse;
                return this;
            }

            /**
             * 用户预期的后端返回码信息
             */
            public Builder expectedResponse(String expectedResponse) {
                this.expectedResponse = expectedResponse;
                return this;
            }

            /**
             * 失败reasonCode
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
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Reason")
        private Reason reason;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("Status")
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
             * 后端服务器端口
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * status为非正常状态时的详细异常原因
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * 后端服务器id
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * 后端服务器Ip
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * 健康检查状态
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
        @NameInMap("ActionType")
        private String actionType;

        @NameInMap("HealthCheckEnabled")
        private String healthCheckEnabled;

        @NameInMap("NonNormalServers")
        private java.util.List < NonNormalServers> nonNormalServers;

        @NameInMap("ServerGroupId")
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
             * 服务器组使用类型
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * 健康检查开启/关闭
             */
            public Builder healthCheckEnabled(String healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * 处于非正常状态的后端服务器
             */
            public Builder nonNormalServers(java.util.List < NonNormalServers> nonNormalServers) {
                this.nonNormalServers = nonNormalServers;
                return this;
            }

            /**
             * 服务器组ID
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
        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @NameInMap("ServerGroupInfos")
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
             * 监听Id
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * 监听的端口号
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * 监听的协议
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * 服务器组健康检查结果
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
    public static class NonNormalServersReason extends TeaModel {
        @NameInMap("ActualResponse")
        private String actualResponse;

        @NameInMap("ExpectedResponse")
        private String expectedResponse;

        @NameInMap("ReasonCode")
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
             * 后端实际的返回码信息
             */
            public Builder actualResponse(String actualResponse) {
                this.actualResponse = actualResponse;
                return this;
            }

            /**
             * 用户预期的后端返回码信息
             */
            public Builder expectedResponse(String expectedResponse) {
                this.expectedResponse = expectedResponse;
                return this;
            }

            /**
             * 失败reasonCode
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
    public static class ServerGroupInfosNonNormalServers extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Reason")
        private NonNormalServersReason reason;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("Status")
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
             * 后端服务器端口
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * status为非正常状态时的详细异常原因
             */
            public Builder reason(NonNormalServersReason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * 后端服务器Id
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * 后端服务器ID
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * 健康检查状态
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
    public static class RuleHealthStatusServerGroupInfos extends TeaModel {
        @NameInMap("ActionType")
        private String actionType;

        @NameInMap("HealthCheckEnabled")
        private String healthCheckEnabled;

        @NameInMap("NonNormalServers")
        private java.util.List < ServerGroupInfosNonNormalServers> nonNormalServers;

        @NameInMap("ServerGroupId")
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
             * 服务器组使用类型
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * 健康检查开启/关闭
             */
            public Builder healthCheckEnabled(String healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * 处于非正常状态的后端服务器
             */
            public Builder nonNormalServers(java.util.List < ServerGroupInfosNonNormalServers> nonNormalServers) {
                this.nonNormalServers = nonNormalServers;
                return this;
            }

            /**
             * 服务器组ID
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
    public static class RuleHealthStatus extends TeaModel {
        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("ServerGroupInfos")
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
             * 转发规则ID
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * 服务器组健康检查结果
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
