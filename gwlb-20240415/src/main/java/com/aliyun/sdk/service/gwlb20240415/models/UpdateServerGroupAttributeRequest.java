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
 * {@link UpdateServerGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateServerGroupAttributeRequest</p>
 */
public class UpdateServerGroupAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionDrainConfig")
    private ConnectionDrainConfig connectionDrainConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckConfig")
    private HealthCheckConfig healthCheckConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerFailoverMode")
    private String serverFailoverMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerGroupName")
    private String serverGroupName;

    private UpdateServerGroupAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionDrainConfig = builder.connectionDrainConfig;
        this.dryRun = builder.dryRun;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.scheduler = builder.scheduler;
        this.serverFailoverMode = builder.serverFailoverMode;
        this.serverGroupId = builder.serverGroupId;
        this.serverGroupName = builder.serverGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServerGroupAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectionDrainConfig
     */
    public ConnectionDrainConfig getConnectionDrainConfig() {
        return this.connectionDrainConfig;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return healthCheckConfig
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return serverFailoverMode
     */
    public String getServerFailoverMode() {
        return this.serverFailoverMode;
    }

    /**
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    /**
     * @return serverGroupName
     */
    public String getServerGroupName() {
        return this.serverGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateServerGroupAttributeRequest, Builder> {
        private String clientToken; 
        private ConnectionDrainConfig connectionDrainConfig; 
        private Boolean dryRun; 
        private HealthCheckConfig healthCheckConfig; 
        private String scheduler; 
        private String serverFailoverMode; 
        private String serverGroupId; 
        private String serverGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServerGroupAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionDrainConfig = request.connectionDrainConfig;
            this.dryRun = request.dryRun;
            this.healthCheckConfig = request.healthCheckConfig;
            this.scheduler = request.scheduler;
            this.serverFailoverMode = request.serverFailoverMode;
            this.serverGroupId = request.serverGroupId;
            this.serverGroupName = request.serverGroupName;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The configurations of connection draining.</p>
         */
        public Builder connectionDrainConfig(ConnectionDrainConfig connectionDrainConfig) {
            this.putBodyParameter("ConnectionDrainConfig", connectionDrainConfig);
            this.connectionDrainConfig = connectionDrainConfig;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The configurations of the health check feature.</p>
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.putBodyParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>5TCH</strong>: specifies consistent hashing that is based on the following factors: source IP address, destination IP address, source port, protocol, and destination port. Requests that contain the same information based on the preceding factors are forwarded to the same backend server.</li>
         * <li><strong>3TCH</strong>: specifies consistent hashing that is based on the following factors: source IP address, destination IP address, and protocol. Requests that contain the same information based on the preceding factors are forwarded to the same backend server.</li>
         * <li><strong>2TCH</strong>: specifies consistent hashing that is based on the following factors: source IP address and destination IP address. Requests that contain the same information based on the preceding factors are forwarded to the same backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5TCH</p>
         */
        public Builder scheduler(String scheduler) {
            this.putBodyParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * ServerFailoverMode.
         */
        public Builder serverFailoverMode(String serverFailoverMode) {
            this.putBodyParameter("ServerFailoverMode", serverFailoverMode);
            this.serverFailoverMode = serverFailoverMode;
            return this;
        }

        /**
         * <p>The server group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtoptyui****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putBodyParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * <p>The server group name.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>testServerGroupName</p>
         */
        public Builder serverGroupName(String serverGroupName) {
            this.putBodyParameter("ServerGroupName", serverGroupName);
            this.serverGroupName = serverGroupName;
            return this;
        }

        @Override
        public UpdateServerGroupAttributeRequest build() {
            return new UpdateServerGroupAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServerGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateServerGroupAttributeRequest</p>
     */
    public static class ConnectionDrainConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDrainEnabled")
        private Boolean connectionDrainEnabled;

        @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
        private Integer connectionDrainTimeout;

        private ConnectionDrainConfig(Builder builder) {
            this.connectionDrainEnabled = builder.connectionDrainEnabled;
            this.connectionDrainTimeout = builder.connectionDrainTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionDrainConfig create() {
            return builder().build();
        }

        /**
         * @return connectionDrainEnabled
         */
        public Boolean getConnectionDrainEnabled() {
            return this.connectionDrainEnabled;
        }

        /**
         * @return connectionDrainTimeout
         */
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        public static final class Builder {
            private Boolean connectionDrainEnabled; 
            private Integer connectionDrainTimeout; 

            private Builder() {
            } 

            private Builder(ConnectionDrainConfig model) {
                this.connectionDrainEnabled = model.connectionDrainEnabled;
                this.connectionDrainTimeout = model.connectionDrainTimeout;
            } 

            /**
             * <p>Specifies whether to enable connection draining. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder connectionDrainEnabled(Boolean connectionDrainEnabled) {
                this.connectionDrainEnabled = connectionDrainEnabled;
                return this;
            }

            /**
             * <p>The timeout period of connection draining.</p>
             * <p>Unit: seconds</p>
             * <p>Valid values: 1 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            public ConnectionDrainConfig build() {
                return new ConnectionDrainConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServerGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateServerGroupAttributeRequest</p>
     */
    public static class HealthCheckConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectTimeout")
        private Integer healthCheckConnectTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
        private java.util.List<String> healthCheckHttpCode;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @com.aliyun.core.annotation.NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheckConfig(Builder builder) {
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
            this.healthCheckDomain = builder.healthCheckDomain;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckHttpCode = builder.healthCheckHttpCode;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckPath = builder.healthCheckPath;
            this.healthCheckProtocol = builder.healthCheckProtocol;
            this.healthyThreshold = builder.healthyThreshold;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckConfig create() {
            return builder().build();
        }

        /**
         * @return healthCheckConnectPort
         */
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        /**
         * @return healthCheckConnectTimeout
         */
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        /**
         * @return healthCheckDomain
         */
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        /**
         * @return healthCheckEnabled
         */
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        /**
         * @return healthCheckHttpCode
         */
        public java.util.List<String> getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckPath
         */
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        /**
         * @return healthCheckProtocol
         */
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private Integer healthCheckConnectPort; 
            private Integer healthCheckConnectTimeout; 
            private String healthCheckDomain; 
            private Boolean healthCheckEnabled; 
            private java.util.List<String> healthCheckHttpCode; 
            private Integer healthCheckInterval; 
            private String healthCheckPath; 
            private String healthCheckProtocol; 
            private Integer healthyThreshold; 
            private Integer unhealthyThreshold; 

            private Builder() {
            } 

            private Builder(HealthCheckConfig model) {
                this.healthCheckConnectPort = model.healthCheckConnectPort;
                this.healthCheckConnectTimeout = model.healthCheckConnectTimeout;
                this.healthCheckDomain = model.healthCheckDomain;
                this.healthCheckEnabled = model.healthCheckEnabled;
                this.healthCheckHttpCode = model.healthCheckHttpCode;
                this.healthCheckInterval = model.healthCheckInterval;
                this.healthCheckPath = model.healthCheckPath;
                this.healthCheckProtocol = model.healthCheckProtocol;
                this.healthyThreshold = model.healthyThreshold;
                this.unhealthyThreshold = model.unhealthyThreshold;
            } 

            /**
             * <p>The backend server port that is used by health checks.</p>
             * <p>Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The maximum timeout period of a health check response.</p>
             * <p>Unit: seconds</p>
             * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * <p>The domain name that is used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>$SERVER_IP</strong>: the internal IP address of a backend server.</li>
             * <li><strong>domain</strong>: a domain name. The domain name must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), and periods (.).</li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only if you set <strong>HealthCheckProtocol</strong> to <strong>HTTP</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>$SERVER_IP</p>
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * <p>Specifies whether to enable the health check feature. Valid values:</p>
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
             * <p>The HTTP status codes that the system returns for health checks.</p>
             */
            public Builder healthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * <p>The interval at which health checks are performed.</p>
             * <p>Unit: seconds</p>
             * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The URL that is used for health checks.</p>
             * <p>The URL must be 1 to 80 characters in length, and can contain letters, digits, and the following special characters: <code>- / . % ? # &amp; </code>The URL must start with a forward slash (/).</p>
             * <blockquote>
             * <p>This parameter takes effect only if you set <strong>HealthCheckProtocol</strong> to <strong>HTTP</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/test/index.html</p>
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * <p>The protocol that is used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong>: TCP health checks send TCP SYN packets to a backend server to check whether the port of the backend server is reachable.</li>
             * <li><strong>HTTP</strong>: HTTP health checks simulate a process that uses a web browser to access resources by sending HEAD or GET requests to an instance. These requests are used to check whether the instance is healthy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from <strong>fail</strong> to <strong>success</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from <strong>success</strong> to <strong>fail</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheckConfig build() {
                return new HealthCheckConfig(this);
            } 

        } 

    }
}
