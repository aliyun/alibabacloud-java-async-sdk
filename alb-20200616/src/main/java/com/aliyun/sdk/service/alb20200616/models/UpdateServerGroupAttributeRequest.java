// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionDrainConfig")
    private ConnectionDrainConfig connectionDrainConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossZoneEnabled")
    private Boolean crossZoneEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConfig")
    private HealthCheckConfig healthCheckConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersionAffinityMode")
    private String ipVersionAffinityMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroupName")
    private String serverGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlowStartConfig")
    private SlowStartConfig slowStartConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StickySessionConfig")
    private StickySessionConfig stickySessionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UchConfig")
    private UchConfig uchConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpstreamKeepaliveEnabled")
    private Boolean upstreamKeepaliveEnabled;

    private UpdateServerGroupAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionDrainConfig = builder.connectionDrainConfig;
        this.crossZoneEnabled = builder.crossZoneEnabled;
        this.dryRun = builder.dryRun;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.ipVersionAffinityMode = builder.ipVersionAffinityMode;
        this.scheduler = builder.scheduler;
        this.serverGroupId = builder.serverGroupId;
        this.serverGroupName = builder.serverGroupName;
        this.serviceName = builder.serviceName;
        this.slowStartConfig = builder.slowStartConfig;
        this.stickySessionConfig = builder.stickySessionConfig;
        this.uchConfig = builder.uchConfig;
        this.upstreamKeepaliveEnabled = builder.upstreamKeepaliveEnabled;
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
     * @return crossZoneEnabled
     */
    public Boolean getCrossZoneEnabled() {
        return this.crossZoneEnabled;
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
     * @return ipVersionAffinityMode
     */
    public String getIpVersionAffinityMode() {
        return this.ipVersionAffinityMode;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
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

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return slowStartConfig
     */
    public SlowStartConfig getSlowStartConfig() {
        return this.slowStartConfig;
    }

    /**
     * @return stickySessionConfig
     */
    public StickySessionConfig getStickySessionConfig() {
        return this.stickySessionConfig;
    }

    /**
     * @return uchConfig
     */
    public UchConfig getUchConfig() {
        return this.uchConfig;
    }

    /**
     * @return upstreamKeepaliveEnabled
     */
    public Boolean getUpstreamKeepaliveEnabled() {
        return this.upstreamKeepaliveEnabled;
    }

    public static final class Builder extends Request.Builder<UpdateServerGroupAttributeRequest, Builder> {
        private String clientToken; 
        private ConnectionDrainConfig connectionDrainConfig; 
        private Boolean crossZoneEnabled; 
        private Boolean dryRun; 
        private HealthCheckConfig healthCheckConfig; 
        private String ipVersionAffinityMode; 
        private String scheduler; 
        private String serverGroupId; 
        private String serverGroupName; 
        private String serviceName; 
        private SlowStartConfig slowStartConfig; 
        private StickySessionConfig stickySessionConfig; 
        private UchConfig uchConfig; 
        private Boolean upstreamKeepaliveEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServerGroupAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionDrainConfig = request.connectionDrainConfig;
            this.crossZoneEnabled = request.crossZoneEnabled;
            this.dryRun = request.dryRun;
            this.healthCheckConfig = request.healthCheckConfig;
            this.ipVersionAffinityMode = request.ipVersionAffinityMode;
            this.scheduler = request.scheduler;
            this.serverGroupId = request.serverGroupId;
            this.serverGroupName = request.serverGroupName;
            this.serviceName = request.serviceName;
            this.slowStartConfig = request.slowStartConfig;
            this.stickySessionConfig = request.stickySessionConfig;
            this.uchConfig = request.uchConfig;
            this.upstreamKeepaliveEnabled = request.upstreamKeepaliveEnabled;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The graceful connection break configuration.</p>
         * <p>After the graceful connection break is enabled, load balancing allows existing connections to be normally transmitted within a specified period after a backend server is removed or a health check is failed.</p>
         * <blockquote>
         * <ul>
         * <li>Basic Edition instances do not support connection draining. Only Standard Edition and WAF-enhanced Edition instances support this feature.</li>
         * <li>Server group types that support connection draining include server type and IP type. Function Compute type is not supported.</li>
         * </ul>
         * </blockquote>
         */
        public Builder connectionDrainConfig(ConnectionDrainConfig connectionDrainConfig) {
            this.putQueryParameter("ConnectionDrainConfig", connectionDrainConfig);
            this.connectionDrainConfig = connectionDrainConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable cross-zone load balancing for the server group. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables cross-zone load balancing (default).</p>
         * </li>
         * <li><p><strong>false</strong>: disables cross-zone load balancing.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Basic Edition instances do not support server groups with cross-zone load balancing disabled. Only Standard Edition and WAF-enhanced Edition instances support this feature.</li>
         * <li>Server group types that support disabling cross-zone load balancing include server type and IP type. Function Compute type is not supported.</li>
         * <li>Session persistence cannot be enabled when cross-zone load balancing is disabled.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder crossZoneEnabled(Boolean crossZoneEnabled) {
            this.putQueryParameter("CrossZoneEnabled", crossZoneEnabled);
            this.crossZoneEnabled = crossZoneEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run and does not modify resources. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the actual request. If the request passes the dry run, an HTTP <code>2xx</code> status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The health check configuration struct.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>The IP version affinity mode. Valid values:</p>
         * <ul>
         * <li>NonAffinity (default): no affinity mode.</li>
         * <li>Affinity: affinity mode.</li>
         * </ul>
         * <p>This parameter takes effect only when Ipv6Enabled is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Affinity</p>
         */
        public Builder ipVersionAffinityMode(String ipVersionAffinityMode) {
            this.putQueryParameter("IpVersionAffinityMode", ipVersionAffinityMode);
            this.ipVersionAffinityMode = ipVersionAffinityMode;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>Wrr</strong>: weighted round-robin. Backend servers with higher weights receive more requests.</li>
         * <li><strong>Wlc</strong>: weighted least connections. Requests are distributed based on the weights and actual loads (number of connections) of backend servers. If backend servers have the same weight, the server with the fewest connections receives more requests.</li>
         * <li><strong>Sch</strong>: consistent hashing. Requests with the same hash factor are scheduled to the same backend server. If the UchConfig parameter is not configured, the default hash factor is the source IP address, and requests from the same source IP address are distributed to the same backend server. If the UchConfig parameter is configured, the hash factor is the URL parameter, and requests with the same URL parameter are distributed to the same backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Wrr</p>
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * <p>The ID of the server group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtop****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putQueryParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * <p>The name of the server group.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. It must start with a letter or a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder serverGroupName(String serverGroupName) {
            this.putQueryParameter("ServerGroupName", serverGroupName);
            this.serverGroupName = serverGroupName;
            return this;
        }

        /**
         * <p>This parameter is applicable only to ALB Ingress scenarios and specifies the name of the <code>K8s Service</code> that corresponds to the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The slow start configuration.</p>
         * <p>After slow start is enabled, newly added backend servers in the backend server group are warmed up within the specified time period, and the number of requests forwarded to the servers increases linearly.</p>
         * <blockquote>
         * <ul>
         * <li>Basic Edition instances do not support slow start. Only Standard Edition and WAF-enhanced Edition instances support this feature.</li>
         * <li>Server group types that support slow start include server type and IP type. Function Compute type is not supported.</li>
         * <li>Slow start can be enabled only when the backend scheduling algorithm is weighted round-robin polling.</li>
         * </ul>
         * </blockquote>
         */
        public Builder slowStartConfig(SlowStartConfig slowStartConfig) {
            this.putQueryParameter("SlowStartConfig", slowStartConfig);
            this.slowStartConfig = slowStartConfig;
            return this;
        }

        /**
         * <p>The session persistence configuration struct.</p>
         */
        public Builder stickySessionConfig(StickySessionConfig stickySessionConfig) {
            this.putQueryParameter("StickySessionConfig", stickySessionConfig);
            this.stickySessionConfig = stickySessionConfig;
            return this;
        }

        /**
         * <p>The URL consistent hashing parameter settings.</p>
         */
        public Builder uchConfig(UchConfig uchConfig) {
            this.putQueryParameter("UchConfig", uchConfig);
            this.uchConfig = uchConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable backend keep-alive. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables backend keep-alive.</p>
         * </li>
         * <li><p><strong>false</strong>: disables backend keep-alive.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder upstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
            this.putQueryParameter("UpstreamKeepaliveEnabled", upstreamKeepaliveEnabled);
            this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
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
             * <li><strong>true</strong>: enables connection draining.</li>
             * <li><strong>false</strong>: disables connection draining.</li>
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
             * <p>The connection draining timeout period.</p>
             * <p>Valid values: <strong>0</strong> to <strong>900</strong>.</p>
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
        @com.aliyun.core.annotation.NameInMap("HealthCheckCodes")
        private java.util.List<String> healthCheckCodes;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        @com.aliyun.core.annotation.Validation(maximum = 65535)
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHost")
        private String healthCheckHost;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @com.aliyun.core.annotation.NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @com.aliyun.core.annotation.NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
        @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 1)
        private Integer healthCheckTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 2)
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 2)
        private Integer unhealthyThreshold;

        private HealthCheckConfig(Builder builder) {
            this.healthCheckCodes = builder.healthCheckCodes;
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckHost = builder.healthCheckHost;
            this.healthCheckHttpVersion = builder.healthCheckHttpVersion;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckMethod = builder.healthCheckMethod;
            this.healthCheckPath = builder.healthCheckPath;
            this.healthCheckProtocol = builder.healthCheckProtocol;
            this.healthCheckTimeout = builder.healthCheckTimeout;
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
         * @return healthCheckCodes
         */
        public java.util.List<String> getHealthCheckCodes() {
            return this.healthCheckCodes;
        }

        /**
         * @return healthCheckConnectPort
         */
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        /**
         * @return healthCheckEnabled
         */
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        /**
         * @return healthCheckHost
         */
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        /**
         * @return healthCheckHttpVersion
         */
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckMethod
         */
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
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
         * @return healthCheckTimeout
         */
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
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
            private java.util.List<String> healthCheckCodes; 
            private Integer healthCheckConnectPort; 
            private Boolean healthCheckEnabled; 
            private String healthCheckHost; 
            private String healthCheckHttpVersion; 
            private Integer healthCheckInterval; 
            private String healthCheckMethod; 
            private String healthCheckPath; 
            private String healthCheckProtocol; 
            private Integer healthCheckTimeout; 
            private Integer healthyThreshold; 
            private Integer unhealthyThreshold; 

            private Builder() {
            } 

            private Builder(HealthCheckConfig model) {
                this.healthCheckCodes = model.healthCheckCodes;
                this.healthCheckConnectPort = model.healthCheckConnectPort;
                this.healthCheckEnabled = model.healthCheckEnabled;
                this.healthCheckHost = model.healthCheckHost;
                this.healthCheckHttpVersion = model.healthCheckHttpVersion;
                this.healthCheckInterval = model.healthCheckInterval;
                this.healthCheckMethod = model.healthCheckMethod;
                this.healthCheckPath = model.healthCheckPath;
                this.healthCheckProtocol = model.healthCheckProtocol;
                this.healthCheckTimeout = model.healthCheckTimeout;
                this.healthyThreshold = model.healthyThreshold;
                this.unhealthyThreshold = model.unhealthyThreshold;
            } 

            /**
             * <p>The list of status codes that indicate a successful health check.</p>
             */
            public Builder healthCheckCodes(java.util.List<String> healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * <p>The port of the backend server that is used for health checks.</p>
             * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
             * <p>A value of <strong>0</strong> indicates that the port of the backend server is used for health checks.</p>
             * <blockquote>
             * <p>The parameter settings take effect only when <strong>HealthCheckEnabled</strong> is set to <strong>true</strong> for the server group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>Specifies whether to enable health checks. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables health checks.</li>
             * <li><strong>false</strong>: disables health checks.</li>
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
             * <p>The domain name that is used for health checks.</p>
             * <ul>
             * <li><p><strong>Internal IP address of the backend server</strong> (default): The internal IP address of the backend server is used as the domain name for health checks.</p>
             * </li>
             * <li><p><strong>Custom domain name</strong>: Enter a domain name.</p>
             * <ul>
             * <li><p>The domain name must be 1 to 80 characters in length.</p>
             * </li>
             * <li><p>It can contain lowercase letters, digits, hyphens (-), and periods (.).</p>
             * </li>
             * <li><p>It must contain at least one period (.), and the period (.) cannot be at the beginning or end.</p>
             * </li>
             * <li><p>The rightmost domain label can contain only letters, and cannot contain digits or hyphens (-).</p>
             * </li>
             * <li><p>The domain name cannot start or end with a hyphen (-).</p>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * <p>The HTTP version that is used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>HTTP1.0</strong></li>
             * <li><strong>HTTP1.1</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckEnabled</strong> is set to true and <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong> for the server group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP1.1</p>
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * <p>The interval between two consecutive health checks. Unit: seconds. </p>
             * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
             * <blockquote>
             * <p>The parameter settings take effect only when <strong>HealthCheckEnabled</strong> is set to <strong>true</strong> for the server group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The HTTP method that is used for health checks. Valid values:</p>
             * <ul>
             * <li><p><strong>GET</strong>: If the length of the response message exceeds 8 KB, the message is truncated. However, the health check result is not affected.</p>
             * </li>
             * <li><p><strong>POST</strong>: The POST method is used by default for gRPC listener health checks.</p>
             * </li>
             * <li><p><strong>HEAD</strong>: The HEAD method is used by default for HTTP and HTTPS listener health checks.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckEnabled</strong> is set to true and <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong> for the server group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * <p>The path that is used for health checks.</p>
             * <p>The path must be 1 to 80 characters in length, and can contain only letters, digits, the characters <code>-/.%?#&amp;=</code>, and the extension characters <code>_;~!()*[]@$^:\&quot;,+</code>. The path must start with a forward slash.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckEnabled</strong> is set to <strong>true</strong> and the <strong>HealthCheckProtocol</strong> settings are <strong>HTTP</strong> or <strong>HTTPS</strong> for the server group.</p>
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
             * <li><p><strong>HTTP</strong>: sends HEAD or GET requests for browser impersonation to check whether the server application is healthy.</p>
             * </li>
             * <li><p><strong>HTTPS</strong>: sends HEAD or GET requests for browser impersonation to check whether the server application is healthy. (Data encryption makes it more secure than HTTP.)</p>
             * </li>
             * <li><p><strong>TCP</strong>: sends SYN handshake packets to check whether the server port is alive.</p>
             * </li>
             * <li><p><strong>gRPC</strong>: sends POST or GET requests to check whether the server application is healthy.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * <p>The timeout period to accept a response from a health check. If the backend ECS instance does not respond correctly within the specified time, the health check is failed. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
             * <blockquote>
             * <p>The parameter settings take effect only when <strong>HealthCheckEnabled</strong> is set to <strong>true</strong> for the server group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * <p>The number of consecutive successful health checks that must occur before the health check status of a backend server changes from <strong>fail</strong> to <strong>success</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The number of consecutive failed health checks that must occur before the health check status of a backend server changes from <strong>success</strong> to <strong>fail</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
    /**
     * 
     * {@link UpdateServerGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateServerGroupAttributeRequest</p>
     */
    public static class SlowStartConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlowStartDuration")
        private Integer slowStartDuration;

        @com.aliyun.core.annotation.NameInMap("SlowStartEnabled")
        private Boolean slowStartEnabled;

        private SlowStartConfig(Builder builder) {
            this.slowStartDuration = builder.slowStartDuration;
            this.slowStartEnabled = builder.slowStartEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlowStartConfig create() {
            return builder().build();
        }

        /**
         * @return slowStartDuration
         */
        public Integer getSlowStartDuration() {
            return this.slowStartDuration;
        }

        /**
         * @return slowStartEnabled
         */
        public Boolean getSlowStartEnabled() {
            return this.slowStartEnabled;
        }

        public static final class Builder {
            private Integer slowStartDuration; 
            private Boolean slowStartEnabled; 

            private Builder() {
            } 

            private Builder(SlowStartConfig model) {
                this.slowStartDuration = model.slowStartDuration;
                this.slowStartEnabled = model.slowStartEnabled;
            } 

            /**
             * <p>The slow start duration.</p>
             * <p>Valid values: <strong>30</strong> to <strong>900</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder slowStartDuration(Integer slowStartDuration) {
                this.slowStartDuration = slowStartDuration;
                return this;
            }

            /**
             * <p>Specifies whether to enable slow start. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables slow start.</li>
             * <li><strong>false</strong>: disables slow start.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder slowStartEnabled(Boolean slowStartEnabled) {
                this.slowStartEnabled = slowStartEnabled;
                return this;
            }

            public SlowStartConfig build() {
                return new SlowStartConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServerGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateServerGroupAttributeRequest</p>
     */
    public static class StickySessionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("CookieTimeout")
        @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 1)
        private Integer cookieTimeout;

        @com.aliyun.core.annotation.NameInMap("StickySessionEnabled")
        private Boolean stickySessionEnabled;

        @com.aliyun.core.annotation.NameInMap("StickySessionType")
        private String stickySessionType;

        private StickySessionConfig(Builder builder) {
            this.cookie = builder.cookie;
            this.cookieTimeout = builder.cookieTimeout;
            this.stickySessionEnabled = builder.stickySessionEnabled;
            this.stickySessionType = builder.stickySessionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StickySessionConfig create() {
            return builder().build();
        }

        /**
         * @return cookie
         */
        public String getCookie() {
            return this.cookie;
        }

        /**
         * @return cookieTimeout
         */
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        /**
         * @return stickySessionEnabled
         */
        public Boolean getStickySessionEnabled() {
            return this.stickySessionEnabled;
        }

        /**
         * @return stickySessionType
         */
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public static final class Builder {
            private String cookie; 
            private Integer cookieTimeout; 
            private Boolean stickySessionEnabled; 
            private String stickySessionType; 

            private Builder() {
            } 

            private Builder(StickySessionConfig model) {
                this.cookie = model.cookie;
                this.cookieTimeout = model.cookieTimeout;
                this.stickySessionEnabled = model.stickySessionEnabled;
                this.stickySessionType = model.stickySessionType;
            } 

            /**
             * <p>The cookie configured on the server.</p>
             * <p>The cookie must be 1 to 200 characters in length, and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces, and cannot start with a dollar sign ($).</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>Server</strong> for the server group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>B490B5EBF6F3CD402E515D22B******</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>The timeout period of the cookie. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>Insert</strong> for the server group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * <p>Specifies whether to enable session persistence. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables session persistence.</li>
             * <li><strong>false</strong>: disables session persistence.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stickySessionEnabled(Boolean stickySessionEnabled) {
                this.stickySessionEnabled = stickySessionEnabled;
                return this;
            }

            /**
             * <p>The method that is used to handle cookies. Valid values:</p>
             * <ul>
             * <li><strong>Insert</strong>: inserts a cookie.
             * When a client accesses the server for the first time, load balancing inserts a cookie (SERVERID) into the HTTP or HTTPS response. The next time the client accesses the server with this cookie, the load balancing service forwards the request to the recorded backend server.</li>
             * <li><strong>Server</strong>: rewrites a cookie.
             * When ALB detects a user-defined cookie, it rewrites the original cookie. The next time the client accesses the server with the new cookie, ALB forwards the request to the recorded backend server.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> for the server group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Insert</p>
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            public StickySessionConfig build() {
                return new StickySessionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServerGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateServerGroupAttributeRequest</p>
     */
    public static class UchConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private UchConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UchConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(UchConfig model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The parameter type. Only QueryString is supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>QueryString</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The consistent hashing parameter value.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UchConfig build() {
                return new UchConfig(this);
            } 

        } 

    }
}
