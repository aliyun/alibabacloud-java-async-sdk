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
 * {@link CreateServerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateServerGroupRequest</p>
 */
public class CreateServerGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AnyPortEnabled")
    private Boolean anyPortEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionDrainEnabled")
    private Boolean connectionDrainEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer connectionDrainTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckConfig")
    private HealthCheckConfig healthCheckConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreserveClientIpEnabled")
    private Boolean preserveClientIpEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerGroupType")
    private String serverGroupType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreateServerGroupRequest(Builder builder) {
        super(builder);
        this.addressIPVersion = builder.addressIPVersion;
        this.anyPortEnabled = builder.anyPortEnabled;
        this.clientToken = builder.clientToken;
        this.connectionDrainEnabled = builder.connectionDrainEnabled;
        this.connectionDrainTimeout = builder.connectionDrainTimeout;
        this.dryRun = builder.dryRun;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.preserveClientIpEnabled = builder.preserveClientIpEnabled;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.scheduler = builder.scheduler;
        this.serverGroupName = builder.serverGroupName;
        this.serverGroupType = builder.serverGroupType;
        this.tag = builder.tag;
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
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return anyPortEnabled
     */
    public Boolean getAnyPortEnabled() {
        return this.anyPortEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return preserveClientIpEnabled
     */
    public Boolean getPreserveClientIpEnabled() {
        return this.preserveClientIpEnabled;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateServerGroupRequest, Builder> {
        private String addressIPVersion; 
        private Boolean anyPortEnabled; 
        private String clientToken; 
        private Boolean connectionDrainEnabled; 
        private Integer connectionDrainTimeout; 
        private Boolean dryRun; 
        private HealthCheckConfig healthCheckConfig; 
        private Boolean preserveClientIpEnabled; 
        private String protocol; 
        private String regionId; 
        private String resourceGroupId; 
        private String scheduler; 
        private String serverGroupName; 
        private String serverGroupType; 
        private java.util.List<Tag> tag; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateServerGroupRequest request) {
            super(request);
            this.addressIPVersion = request.addressIPVersion;
            this.anyPortEnabled = request.anyPortEnabled;
            this.clientToken = request.clientToken;
            this.connectionDrainEnabled = request.connectionDrainEnabled;
            this.connectionDrainTimeout = request.connectionDrainTimeout;
            this.dryRun = request.dryRun;
            this.healthCheckConfig = request.healthCheckConfig;
            this.preserveClientIpEnabled = request.preserveClientIpEnabled;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.scheduler = request.scheduler;
            this.serverGroupName = request.serverGroupName;
            this.serverGroupType = request.serverGroupType;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The protocol version. Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong> (default): IPv4</li>
         * <li><strong>DualStack</strong>: dual stack</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.putBodyParameter("AddressIPVersion", addressIPVersion);
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable all-port forwarding. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder anyPortEnabled(Boolean anyPortEnabled) {
            this.putBodyParameter("AnyPortEnabled", anyPortEnabled);
            this.anyPortEnabled = anyPortEnabled;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

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
            this.putBodyParameter("ConnectionDrainEnabled", connectionDrainEnabled);
            this.connectionDrainEnabled = connectionDrainEnabled;
            return this;
        }

        /**
         * <p>The timeout period of connection draining. Unit: seconds. Valid values: <strong>0</strong> to <strong>900</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
            this.putBodyParameter("ConnectionDrainTimeout", connectionDrainTimeout);
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The configuration of health checks.</p>
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.putBodyParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable client IP preservation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you set the value to <strong>true</strong> and <strong>Protocol</strong> to <strong>TCP</strong>, the server group cannot be associated with <strong>TCPSSL</strong> listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder preserveClientIpEnabled(Boolean preserveClientIpEnabled) {
            this.putBodyParameter("PreserveClientIpEnabled", preserveClientIpEnabled);
            this.preserveClientIpEnabled = preserveClientIpEnabled;
            return this;
        }

        /**
         * <p>The protocol between the NLB instance and backend servers. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong> (default)</li>
         * <li><strong>UDP</strong></li>
         * <li><strong>TCP_UDP</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set the value to <strong>UDP</strong>, you can associate the server group only with <strong>UDP</strong> listeners.</li>
         * <li>If you set the value to <strong>TCP</strong> and <strong>PreserveClientIpEnabled</strong> to <strong>true</strong>, you can associate the server group only with <strong>TCP</strong> listeners.</li>
         * <li>If you set the value to <strong>TCP</strong> and <strong>PreserveClientIpEnabled</strong> to <strong>false</strong>, you can associate the server group with <strong>TCP/SSL</strong> and <strong>TCP</strong> listeners.</li>
         * <li>If you set the value to <strong>TCP_UDP</strong>, you can associate the server group with <strong>TCP</strong> and <strong>UDP</strong> listeners.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the server group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>Wrr:</strong> The weighted round-robin algorithm is used. Backend servers with higher weights receive more requests than backend servers with lower weights. This is the default value.</li>
         * <li><strong>rr:</strong> The round-robin algorithm is used. Requests are forwarded to backend servers in sequence.</li>
         * <li><strong>sch:</strong> Source IP hashing is used. Requests from the same source IP address are forwarded to the same backend server.</li>
         * <li><strong>tch:</strong> Four-element hashing is used. It specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are forwarded to the same backend server.</li>
         * <li><strong>qch</strong>: QUIC ID hashing. Requests that contain the same QUIC ID are forwarded to the same backend server.</li>
         * </ul>
         * <blockquote>
         * <p>QUIC ID hashing is supported only when the backend protocol is set to UDP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Wrr</p>
         */
        public Builder scheduler(String scheduler) {
            this.putBodyParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * <p>The name of the server group.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB_ServerGroup</p>
         */
        public Builder serverGroupName(String serverGroupName) {
            this.putBodyParameter("ServerGroupName", serverGroupName);
            this.serverGroupName = serverGroupName;
            return this;
        }

        /**
         * <p>The type of server group. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong> (default): allows you to specify servers of the <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> type.</li>
         * <li><strong>Ip</strong>: allows you to add servers of by specifying IP addresses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder serverGroupType(String serverGroupType) {
            this.putBodyParameter("ServerGroupType", serverGroupType);
            this.serverGroupType = serverGroupType;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the server group belongs.</p>
         * <blockquote>
         * <p>If <strong>ServerGroupType</strong> is set to <strong>Instance</strong>, only servers in the specified VPC can be added to the server group.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72zv****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
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
    public static class HealthCheckConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectTimeout")
        private Integer healthCheckConnectTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("HealthCheckExp")
        private String healthCheckExp;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
        private java.util.List<String> healthCheckHttpCode;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckReq")
        private String healthCheckReq;

        @com.aliyun.core.annotation.NameInMap("HealthCheckType")
        private String healthCheckType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("HttpCheckMethod")
        private String httpCheckMethod;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheckConfig(Builder builder) {
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
            this.healthCheckDomain = builder.healthCheckDomain;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckExp = builder.healthCheckExp;
            this.healthCheckHttpCode = builder.healthCheckHttpCode;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckReq = builder.healthCheckReq;
            this.healthCheckType = builder.healthCheckType;
            this.healthCheckUrl = builder.healthCheckUrl;
            this.healthyThreshold = builder.healthyThreshold;
            this.httpCheckMethod = builder.httpCheckMethod;
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
         * @return healthCheckExp
         */
        public String getHealthCheckExp() {
            return this.healthCheckExp;
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
         * @return healthCheckReq
         */
        public String getHealthCheckReq() {
            return this.healthCheckReq;
        }

        /**
         * @return healthCheckType
         */
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        /**
         * @return healthCheckUrl
         */
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return httpCheckMethod
         */
        public String getHttpCheckMethod() {
            return this.httpCheckMethod;
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
            private String healthCheckExp; 
            private java.util.List<String> healthCheckHttpCode; 
            private Integer healthCheckInterval; 
            private String healthCheckReq; 
            private String healthCheckType; 
            private String healthCheckUrl; 
            private Integer healthyThreshold; 
            private String httpCheckMethod; 
            private Integer unhealthyThreshold; 

            /**
             * <p>The port that you want to use for health checks on backend servers.</p>
             * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
             * <p>Default value: <strong>0</strong>. If you set the value to 0, the port of a backend server is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The maximum timeout period of a health check. Unit: seconds. Valid values: <strong>1</strong> to <strong>300</strong>. Default value: <strong>5</strong>.</p>
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
             * <p> This parameter takes effect only if you set <strong>HealthCheckType</strong> to <strong>HTTP</strong>.</p>
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
             * <li><strong>true</strong> (default)</li>
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
             * <p>The request string for UDP listener health checks. The string must be 1 to 64 characters in length and can contain only letters and digits.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder healthCheckExp(String healthCheckExp) {
                this.healthCheckExp = healthCheckExp;
                return this;
            }

            /**
             * <p>The HTTP status codes to return for health checks. Separate multiple HTTP status codes with commas (,). Valid values: <strong>http_2xx</strong> (default), <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
             * <blockquote>
             * <p> This parameter takes effect only if you set <strong>HealthCheckType</strong> to <strong>HTTP</strong>.</p>
             * </blockquote>
             */
            public Builder healthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * <p>The interval at which health checks are performed. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
             * <p>Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The request string for UDP listener health checks. The string must be 1 to 64 characters in length and can contain only letters and digits.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder healthCheckReq(String healthCheckReq) {
                this.healthCheckReq = healthCheckReq;
                return this;
            }

            /**
             * <p>The protocol that is used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong></li>
             * <li><strong>HTTP</strong></li>
             * <li><strong>UDP</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * <p>The URL that is used for health checks.</p>
             * <p>The URL must be 1 to 80 characters in length, and can contain letters, digits, and the following special characters: <code>- / . % ? # &amp; </code>. The URL must start with a forward slash (/).</p>
             * <blockquote>
             * <p> This parameter takes effect only if you set <strong>HealthCheckType</strong> to <strong>HTTP</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/test/index.html</p>
             */
            public Builder healthCheckUrl(String healthCheckUrl) {
                this.healthCheckUrl = healthCheckUrl;
                return this;
            }

            /**
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from <strong>fail</strong> to <strong>success</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * <p>Default value: <strong>2</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The HTTP method that is used for health checks. Valid values: <strong>GET</strong> (default) and <strong>HEAD</strong>.</p>
             * <blockquote>
             * <p> This parameter takes effect only if you set <strong>HealthCheckType</strong> to <strong>HTTP</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder httpCheckMethod(String httpCheckMethod) {
                this.httpCheckMethod = httpCheckMethod;
                return this;
            }

            /**
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from <strong>success</strong> to <strong>fail</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * <p>Default value: <strong>2</strong>.</p>
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
             * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can add up to 20 tags in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can add up to 20 tags in each call.</p>
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
}
