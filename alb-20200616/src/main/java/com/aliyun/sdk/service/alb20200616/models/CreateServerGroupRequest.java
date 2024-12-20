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
 * {@link CreateServerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateServerGroupRequest</p>
 */
public class CreateServerGroupRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private HealthCheckConfig healthCheckConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroupType")
    private String serverGroupType;

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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UchConfig")
    private UchConfig uchConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpstreamKeepaliveEnabled")
    private Boolean upstreamKeepaliveEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateServerGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionDrainConfig = builder.connectionDrainConfig;
        this.crossZoneEnabled = builder.crossZoneEnabled;
        this.dryRun = builder.dryRun;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.protocol = builder.protocol;
        this.resourceGroupId = builder.resourceGroupId;
        this.scheduler = builder.scheduler;
        this.serverGroupName = builder.serverGroupName;
        this.serverGroupType = builder.serverGroupType;
        this.serviceName = builder.serviceName;
        this.slowStartConfig = builder.slowStartConfig;
        this.stickySessionConfig = builder.stickySessionConfig;
        this.tag = builder.tag;
        this.uchConfig = builder.uchConfig;
        this.upstreamKeepaliveEnabled = builder.upstreamKeepaliveEnabled;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServerGroupRequest create() {
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
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return serverGroupName
     */
    public String getServerGroupName() {
        return this.serverGroupName;
    }

    /**
     * @return serverGroupType
     */
    public String getServerGroupType() {
        return this.serverGroupType;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateServerGroupRequest, Builder> {
        private String clientToken; 
        private ConnectionDrainConfig connectionDrainConfig; 
        private Boolean crossZoneEnabled; 
        private Boolean dryRun; 
        private HealthCheckConfig healthCheckConfig; 
        private String protocol; 
        private String resourceGroupId; 
        private String scheduler; 
        private String serverGroupName; 
        private String serverGroupType; 
        private String serviceName; 
        private SlowStartConfig slowStartConfig; 
        private StickySessionConfig stickySessionConfig; 
        private java.util.List<Tag> tag; 
        private UchConfig uchConfig; 
        private Boolean upstreamKeepaliveEnabled; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateServerGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionDrainConfig = request.connectionDrainConfig;
            this.crossZoneEnabled = request.crossZoneEnabled;
            this.dryRun = request.dryRun;
            this.healthCheckConfig = request.healthCheckConfig;
            this.protocol = request.protocol;
            this.resourceGroupId = request.resourceGroupId;
            this.scheduler = request.scheduler;
            this.serverGroupName = request.serverGroupName;
            this.serverGroupType = request.serverGroupType;
            this.serviceName = request.serviceName;
            this.slowStartConfig = request.slowStartConfig;
            this.stickySessionConfig = request.stickySessionConfig;
            this.tag = request.tag;
            this.uchConfig = request.uchConfig;
            this.upstreamKeepaliveEnabled = request.upstreamKeepaliveEnabled;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The configurations of connection draining.</p>
         * <p>After connection draining is enabled, ALB maintains data transmission for a period of time after the backend server is removed or declared unhealthy.</p>
         * <blockquote>
         * <ul>
         * <li>Basic ALB instances do not support connection draining. Standard and WAF-enabled ALB instances support connection draining.</li>
         * <li>Server groups of the instance and IP types support connection draining. Server groups of the Function Compute type do not support connection draining.</li>
         * </ul>
         * </blockquote>
         */
        public Builder connectionDrainConfig(ConnectionDrainConfig connectionDrainConfig) {
            this.putQueryParameter("ConnectionDrainConfig", connectionDrainConfig);
            this.connectionDrainConfig = connectionDrainConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable cross-zone load balancing. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Basic ALB instances do not support server groups that have cross-zone load balancing disabled. Only Standard and WAF-enabled ALB instances support server groups that have cross-zone load balancing.</p>
         * </li>
         * <li><p>Cross-zone load balancing can be disabled for server groups of the server and IP type, but not for server groups of the Function Compute type.</p>
         * </li>
         * <li><p>When cross-zone load balancing is disabled, session persistence cannot be enabled.</p>
         * </li>
         * </ul>
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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The configuration of the health check feature.</p>
         * <p>This parameter is required.</p>
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>The backend protocol. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong>: allows you to associate an HTTPS, HTTP, or QUIC listener with the server group. This is the default value.</li>
         * <li><strong>HTTPS</strong>: allows you to associate HTTPS listeners with backend servers.</li>
         * <li><strong>gRPC</strong>: allows you to associate an HTTPS or QUIC listener with the server group.</li>
         * </ul>
         * <blockquote>
         * <p> You do not need to specify a backend protocol if you set <strong>ServerGroupType</strong> to <strong>Fc</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>Wrr</strong> (default): The weighted round-robin algorithm is used. Backend servers that have higher weights receive more requests than those that have lower weights.</li>
         * <li><strong>Wlc</strong>: The weighted least connections algorithm is used. Requests are distributed based on the weights and the number of connections to backend servers. If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.</li>
         * <li><strong>Sch</strong>: The consistent hashing algorithm is used. Requests from the same source IP address are distributed to the same backend server.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect when the <strong>ServerGroupType</strong> parameter is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
         * </blockquote>
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
         * <p>The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-atstuj3rtoptyui****</p>
         */
        public Builder serverGroupName(String serverGroupName) {
            this.putQueryParameter("ServerGroupName", serverGroupName);
            this.serverGroupName = serverGroupName;
            return this;
        }

        /**
         * <p>The type of server group. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong> (default): allows you to add servers by specifying <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong>.</li>
         * <li><strong>Ip</strong>: allows you to add servers by specifying IP addresses.</li>
         * <li><strong>Fc</strong>: allows you to add servers by specifying functions of Function Compute.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder serverGroupType(String serverGroupType) {
            this.putQueryParameter("ServerGroupType", serverGroupType);
            this.serverGroupType = serverGroupType;
            return this;
        }

        /**
         * <p>This parameter is available only if the ALB Ingress controller is used. In this case, set this parameter to the name of the <code>Kubernetes Service</code> that is associated with the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The configurations of slow starts.
         * After slow starts are enabled, SLB prefetches data to newly added backend servers. Requests distributed to the backend servers gradually increase.</p>
         * <blockquote>
         * <ul>
         * <li>Basic SLB instances do not support slow starts. Standard and WAF-enabled SLB instances support slow starts.</li>
         * </ul>
         * <ul>
         * <li>Server groups of the server and IP types support slow starts. Server groups of the Function Compute type do not support slow starts.</li>
         * <li>Slow start is supported only by the weighted round-robin scheduling algorithm.</li>
         * </ul>
         * </blockquote>
         */
        public Builder slowStartConfig(SlowStartConfig slowStartConfig) {
            this.putQueryParameter("SlowStartConfig", slowStartConfig);
            this.slowStartConfig = slowStartConfig;
            return this;
        }

        /**
         * <p>The configuration of session persistence.</p>
         * <blockquote>
         * <p> This parameter takes effect when the <strong>ServerGroupType</strong> parameter is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
         * </blockquote>
         */
        public Builder stickySessionConfig(StickySessionConfig stickySessionConfig) {
            this.putQueryParameter("StickySessionConfig", stickySessionConfig);
            this.stickySessionConfig = stickySessionConfig;
            return this;
        }

        /**
         * <p>The tag.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The configuration of consistent hashing based on URLs.</p>
         */
        public Builder uchConfig(UchConfig uchConfig) {
            this.putQueryParameter("UchConfig", uchConfig);
            this.uchConfig = uchConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable persistent TCP connections.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder upstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
            this.putQueryParameter("UpstreamKeepaliveEnabled", upstreamKeepaliveEnabled);
            this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC). You can add only servers that are deployed in the specified VPC to the server group.</p>
         * <blockquote>
         * <p> This parameter takes effect when the <strong>ServerGroupType</strong> parameter is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72zv****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateServerGroupRequest build() {
            return new CreateServerGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateServerGroupRequest</p>
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

            /**
             * <p>Specifies whether to enable connection draining. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
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
             * <p>Valid values: <strong>0</strong> to <strong>900</strong>.</p>
             * <p>Default value: <strong>300</strong>.</p>
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
     * {@link CreateServerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateServerGroupRequest</p>
     */
    public static class HealthCheckConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthCheckCodes")
        private java.util.List<String> healthCheckCodes;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        @com.aliyun.core.annotation.Validation(maximum = 65535)
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        @com.aliyun.core.annotation.Validation(required = true)
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

            /**
             * <p>The HTTP status codes that indicate healthy backend servers.</p>
             */
            public Builder healthCheckCodes(java.util.List<String> healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * <p>The backend port that is used for health checks.</p>
             * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
             * <p>The default value is <strong>0</strong>, which specifies that the port of a backend server is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>Specifies whether to enable the health check feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> If the <strong>ServerGroupType</strong> parameter is set to <strong>Instance</strong> or <strong>Ip</strong>, the health check feature is enabled by default. If the <strong>ServerGroupType</strong> parameter is set to <strong>Fc</strong>, the health check feature is disabled by default.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
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
             * <li><p><strong>Backend Server Internal IP</strong> (default): Use the internal IP address of backend servers as the health check domain name.</p>
             * </li>
             * <li><p><strong>Custom Domain Name</strong>: Enter a domain name.</p>
             * <ul>
             * <li>The domain name must be 1 to 80 characters in length.</li>
             * <li>The domain name can contain lowercase letters, digits, hyphens (-), and periods (.).</li>
             * <li>The domain name can contain at least one period (.) but cannot start or end with a period (.).</li>
             * <li>The rightmost domain label of the domain name can contain only letters, and cannot contain digits or hyphens (-).</li>
             * <li>The domain name cannot start or end with a hyphen (-).</li>
             * </ul>
             * </li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * <p>The version of the HTTP protocol. Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>. Default value: HTTP1.1.</p>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
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
             * <p>The interval at which health checks are performed. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
             * <p>Default value: <strong>2</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The HTTP method that is used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>GET</strong>: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</li>
             * <li><strong>POST</strong>: By default, gRPC health checks use the POST method.</li>
             * <li><strong>HEAD</strong> (default): By default, HTTP and HTTPS use the HEAD method.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
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
             * <p>The URL must be 1 to 80 characters in length, and can contain letters, digits, and the following special characters: <code>- / . % ? # &amp; =</code>. It can also contain the following extended characters: <code>_ ; ~ ! ( ) * [ ] @ $ ^ : \&quot; , +</code>. The URL must start with a forward slash (/).</p>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
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
             * <li><strong>HTTP</strong>: HTTP health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers.</li>
             * <li><strong>HTTPS</strong>: HTTPS health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers. HTTPS provides higher security than HTTP because HTTPS supports data encryption.</li>
             * <li><strong>TCP</strong>: TCP health checks send TCP SYN packets to a backend server to probe the availability of backend servers.</li>
             * <li><strong>gRPC</strong>: gRPC health checks send POST or GET requests to a backend server to check whether the backend server is healthy.</li>
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
             * <p>The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the backend server is declared unhealthy. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
             * <p>Default value: <strong>5</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health check status of the backend server changes from <strong>fail</strong> to <strong>success</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * <p>Default value: <strong>3</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health check status of the backend server changes from <strong>success</strong> to <strong>fail</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * <p>Default value: <strong>3</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
     * {@link CreateServerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateServerGroupRequest</p>
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

            /**
             * <p>The duration of a slow start.
             * Valid values: 30 to 900.
             * Default value: 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder slowStartDuration(Integer slowStartDuration) {
                this.slowStartDuration = slowStartDuration;
                return this;
            }

            /**
             * <p>Specifies whether to enable slow starts. Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * </li>
             * <li><p>false(default)</p>
             * </li>
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
     * {@link CreateServerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateServerGroupRequest</p>
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

            /**
             * <p>The cookie that you want to configure for the server.</p>
             * <p>The cookie must be 1 to 200 characters in length, and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).</p>
             * <blockquote>
             * <p> This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>B490B5EBF6F3CD402E515D22BCDA****</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>The maximum amount of time to wait before the session cookie expires. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
             * <p>Default value: <strong>1000</strong>.</p>
             * <blockquote>
             * <p> This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>Insert</strong>.</p>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect when the <strong>ServerGroupType</strong> parameter is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
             * </blockquote>
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
             * <li><strong>Insert</strong> (default value): inserts a cookie. The first time a client accesses SLB, SLB inserts the SERVERID cookie into the HTTP or HTTPS response packet. Subsequent requests from the client that carry this cookie are forwarded to the same backend server as the first request.</li>
             * <li><strong>Server</strong>: rewrites a cookie. SLB rewrites the custom cookies in requests from a client. Subsequent requests from the client that carry the new cookie are forwarded to the same backend server as the first request.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect when the <strong>StickySessionEnabled</strong> parameter is set to <strong>true</strong>.</p>
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
     * {@link CreateServerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateServerGroupRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key. The tag key can be up to 128 characters in length, and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length, and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateServerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateServerGroupRequest</p>
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

            /**
             * <p>The type of the parameter.</p>
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
             * <p>The parameter value for consistent hashing.</p>
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
