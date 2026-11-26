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
    @com.aliyun.core.annotation.NameInMap("IpVersionAffinityMode")
    private String ipVersionAffinityMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6Enabled")
    private Boolean ipv6Enabled;

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
        this.ipVersionAffinityMode = builder.ipVersionAffinityMode;
        this.ipv6Enabled = builder.ipv6Enabled;
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
     * @return ipVersionAffinityMode
     */
    public String getIpVersionAffinityMode() {
        return this.ipVersionAffinityMode;
    }

    /**
     * @return ipv6Enabled
     */
    public Boolean getIpv6Enabled() {
        return this.ipv6Enabled;
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
        private String ipVersionAffinityMode; 
        private Boolean ipv6Enabled; 
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
            this.ipVersionAffinityMode = request.ipVersionAffinityMode;
            this.ipv6Enabled = request.ipv6Enabled;
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
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CAF0E-5718-45B5-9D4D-70B******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The graceful connection break configuration.</p>
         * <p>After graceful connection break is enabled, load balancing allows existing connections to be transmitted normally within a specified period of time after a backend server is removed or a health check failed.</p>
         * <blockquote>
         * <ul>
         * <li>Basic Edition instances do not support graceful connection break. Only Standard Edition and WAF-enhanced Edition instances support this feature.</li>
         * <li>Server type and IP type server groups support graceful connection break. Function Compute type server groups do not support this feature.</li>
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
         * <li>Basic Edition instances do not support associating with server groups that have cross-zone load balancing disabled. Only Standard Edition and WAF-enhanced Edition instances support this feature.</li>
         * <li>Server type and IP type server groups support disabling cross-zone load balancing. Function Compute type server groups do not support this feature.</li>
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
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prechecks the request without creating the server group. The system checks whether the required parameters are specified, the request format, and the service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the DryRunOperation error code is returned.</li>
         * <li><strong>false</strong> (default): sends the normal request. After the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
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
         * <p>The health check configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-123</p>
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>The IP version affinity mode. Valid values:</p>
         * <ul>
         * <li>NonAffinity: non-affinity mode. This is the default value.</li>
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
         * <p>Specifies whether the IP protocol version used by load balancing to forward traffic to the backend server group supports IPv6. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): IPv6 is not supported. The IPv4 type supports adding only IPv4 backend servers.</li>
         * <li><strong>true</strong>: the dual-stack type is used. Both IPv4 and IPv6 backend servers can be added.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ipv6Enabled(Boolean ipv6Enabled) {
            this.putQueryParameter("Ipv6Enabled", ipv6Enabled);
            this.ipv6Enabled = ipv6Enabled;
            return this;
        }

        /**
         * <p>The backend protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong> (default): supports associating with HTTPS, HTTP, and QUIC listeners.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: supports associating with HTTP and HTTPS listeners.</p>
         * </li>
         * <li><p><strong>gRPC</strong>: associates with HTTPS listeners.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You do not need to configure the backend protocol when <strong>ServerGroupType</strong> is set to <strong>Fc</strong>.</p>
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
         * <p>rg-atstuj3rsop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><p><strong>Wrr</strong> (default): weighted round-robin. Backend servers with higher weights are more likely to be polled.</p>
         * </li>
         * <li><p><strong>Wlc</strong>: weighted least connections. In addition to polling based on the weight of each backend server, this algorithm also considers the actual load (number of connections) of the backend servers. When the weights are the same, backend servers with fewer current connections are more likely to be polled.</p>
         * </li>
         * <li><p><strong>Sch</strong>: consistent hashing. Requests with the same hash factor calculation result are scheduled to the same backend server. If the <strong>UchConfig</strong> parameter is not configured, the default hash factor is the source IP address, and requests from the same source IP address are distributed to the same backend server. If the <strong>UchConfig</strong> parameter is configured, the hash factor is the URL parameter, and requests with the same URL parameter are distributed to the same backend server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
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
         * <p>The name of the server group. The name must be 2 to 128 characters in length, and must start with a letter, Chinese character, or digit. It can contain digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
         * <p>This parameter is required.</p>
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
         * <p>The type of the server group. Valid values:</p>
         * <ul>
         * <li><p><strong>Instance</strong> (default): server type. This type of server group supports adding <strong>Ecs</strong>, <strong>Eni</strong>, and <strong>Eci</strong> instances.</p>
         * </li>
         * <li><p><strong>Ip</strong>: IP address type. This type of server group supports adding backend servers by IP address.</p>
         * </li>
         * <li><p><strong>Fc</strong>: Function Compute type. This type of server group supports adding Function Compute backend servers.</p>
         * </li>
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
         * <p>The name of the <code>K8s Service</code> that corresponds to the server group. This parameter is applicable only to ALB Ingress scenarios.</p>
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
         * <p>The slow start configuration.</p>
         * <p>After slow start is enabled, newly added backend servers in the server group are warmed up within the specified time period, and the number of requests forwarded to the servers increases linearly.</p>
         * <blockquote>
         * <ul>
         * <li>Basic Edition instances do not support slow start. Only Standard Edition and WAF-enhanced Edition instances support this feature.</li>
         * <li>Server type and IP backend server groups support slow start. Function Compute backend server groups do not support this feature.</li>
         * <li>Slow start can be enabled only when the backend scheduling algorithm is weighted round-robin.</li>
         * </ul>
         * </blockquote>
         */
        public Builder slowStartConfig(SlowStartConfig slowStartConfig) {
            this.putQueryParameter("SlowStartConfig", slowStartConfig);
            this.slowStartConfig = slowStartConfig;
            return this;
        }

        /**
         * <p>The session persistence configuration.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
         * </blockquote>
         */
        public Builder stickySessionConfig(StickySessionConfig stickySessionConfig) {
            this.putQueryParameter("StickySessionConfig", stickySessionConfig);
            this.stickySessionConfig = stickySessionConfig;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
         * <li><strong>true</strong>: enables backend keep-alive.</li>
         * <li><strong>false</strong> (default): disables backend keep-alive.</li>
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

        /**
         * <p>The VPC-connected instance ID. Only servers in this VPC can be added to the server group.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zdkdt37pq72zv****</p>
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
             * <li><strong>false</strong>: disables connection draining (default).</li>
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
             * <p>The port of the backend server used for health checks.</p>
             * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
             * <p>Default value: <strong>0</strong>, which indicates that the port of the backend server is used for health checks.</p>
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
             * <li><p><strong>true</strong>: enables health checks.</p>
             * </li>
             * <li><p><strong>false</strong>: disables health checks.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>By default, health checks are enabled when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>, and disabled when <strong>ServerGroupType</strong> is set to <strong>Fc</strong>.</p>
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
             * <p>The domain name used for health checks. Valid values:</p>
             * <ul>
             * <li><p><strong>Internal IP address of the backend server</strong> (default): uses the internal IP address of the backend server as the domain name for health checks.</p>
             * </li>
             * <li><p><strong>Custom domain name</strong>: specifies a domain name.</p>
             * <ul>
             * <li><p>The domain name must be 1 to 80 characters in length.</p>
             * </li>
             * <li><p>It can contain lowercase letters, digits, hyphens (-), and periods (.).</p>
             * </li>
             * <li><p>It must contain at least one period (.), and the period (.) cannot be at the beginning or end.</p>
             * </li>
             * <li><p>The rightmost domain label can contain only letters, and cannot contain digits or hyphens (-).</p>
             * </li>
             * <li><p>The hyphen (-) cannot be at the beginning or end.</p>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
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
             * <p>The HTTP version used for health checks. Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong> (default).</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
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
             * <p>The interval between two consecutive health checks. Unit: seconds.</p>
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
             * <p>The HTTP method used for health checks. Valid values:</p>
             * <ul>
             * <li><p><strong>GET</strong>: if the length of the response message exceeds 8 KB, it is truncated, but this does not affect the health check result.</p>
             * </li>
             * <li><p><strong>POST</strong>: the default method for gRPC listener health checks.</p>
             * </li>
             * <li><p><strong>HEAD</strong> (default): the default method for HTTP and HTTPS listener health checks.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
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
             * <p>The path used for health checks.</p>
             * <p>The path must be 1 to 80 characters in length, and can contain only letters, digits, and the following special characters: <code>-/.%?#&amp;=</code> and extended characters <code>_;~!()*[]@$^:\&quot;,+</code>. The URL must start with a forward slash (/).</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
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
             * <p>The protocol used for health checks. Valid values:</p>
             * <ul>
             * <li><p><strong>HTTP</strong>: sends HEAD or GET requests to perform impersonation of browser access and check whether the server application is healthy.</p>
             * </li>
             * <li><p><strong>HTTPS</strong>: sends HEAD or GET requests to perform impersonation of browser access and check whether the server application is healthy (data encryption, which makes it more secure than HTTP).</p>
             * </li>
             * <li><p><strong>TCP</strong>: sends SYN handshake messages to check whether the server port is alive.</p>
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
             * <p>The timeout period for a health check response. If the backend server does not respond within the specified timeout period, the health check fails. Unit: seconds.</p>
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
             * <p>The number of consecutive successful health checks required to change the health check status of a backend server from <strong>Failed</strong> to <strong>Successful</strong>.</p>
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
             * <p>The number of consecutive failed health checks required to change the health check status of a backend server from <strong>Successful</strong> to <strong>Failed</strong>.</p>
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

            private Builder() {
            } 

            private Builder(SlowStartConfig model) {
                this.slowStartDuration = model.slowStartDuration;
                this.slowStartEnabled = model.slowStartEnabled;
            } 

            /**
             * <p>The slow start duration.</p>
             * <p>Valid values: <strong>30</strong> to <strong>900</strong>.</p>
             * <p>Default value: <strong>30</strong>.</p>
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
             * <li><strong>false</strong>: disables slow start (default).</li>
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
             * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>B490B6EBF6F3CD402E515D22BCDA****</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>The timeout period of the cookie. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
             * <p>Default value: <strong>1000</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>Insert</strong>.</p>
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
             * <blockquote>
             * <p>This parameter takes effect only when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
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
             * <p>The method used to handle cookies. Valid values:</p>
             * <ul>
             * <li><p><strong>Insert</strong> (default): inserts a cookie.
             * When a client accesses the server for the first time, load balancing inserts a cookie (that is, inserts SERVERID into the HTTP or HTTPS response message). The next time the client accesses the server with this cookie, load balancing forwards the request to the previously recorded backend server.</p>
             * </li>
             * <li><p><strong>Server</strong>: rewrites a cookie.
             * When load balancing detects a user-defined cookie, it rewrites the original cookie. The next time the client accesses the server with the new cookie, load balancing forwards the request to the previously recorded backend server.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong>.</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
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

            private Builder() {
            } 

            private Builder(UchConfig model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The parameter type. Set the value to <strong>QueryString</strong>.</p>
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
