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
 * {@link UpdateServerGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateServerGroupAttributeRequest</p>
 */
public class UpdateServerGroupAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionDrainEnabled")
    private Boolean connectionDrainEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

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
        this.connectionDrainEnabled = builder.connectionDrainEnabled;
        this.connectionDrainTimeout = builder.connectionDrainTimeout;
        this.dryRun = builder.dryRun;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.preserveClientIpEnabled = builder.preserveClientIpEnabled;
        this.regionId = builder.regionId;
        this.scheduler = builder.scheduler;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdateServerGroupAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean connectionDrainEnabled; 
        private Integer connectionDrainTimeout; 
        private Boolean dryRun; 
        private HealthCheckConfig healthCheckConfig; 
        private Boolean preserveClientIpEnabled; 
        private String regionId; 
        private String scheduler; 
        private String serverGroupId; 
        private String serverGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServerGroupAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionDrainEnabled = request.connectionDrainEnabled;
            this.connectionDrainTimeout = request.connectionDrainTimeout;
            this.dryRun = request.dryRun;
            this.healthCheckConfig = request.healthCheckConfig;
            this.preserveClientIpEnabled = request.preserveClientIpEnabled;
            this.regionId = request.regionId;
            this.scheduler = request.scheduler;
            this.serverGroupId = request.serverGroupId;
            this.serverGroupName = request.serverGroupName;
        } 

        /**
         * <p>The client token used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. Only ASCII characters are allowed.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the value of <strong>RequestId</strong> is used.**** The value of <strong>RequestId</strong> is different for each request.</p>
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
         * <li><strong>false</strong></li>
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
         * <p>Specify a timeout period for connection draining. Unit: seconds. Valid values: <strong>0</strong> to <strong>900</strong>.</p>
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
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
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
         * <p>Health check configurations.</p>
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.putBodyParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable client IP preservation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> You cannot set this parameter to <strong>true</strong> if <strong>PreserveClientIpEnabled</strong> is set to <strong>false</strong> and the server group is associated with a listener that uses <strong>SSL over TCP</strong>.</p>
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
         * <p>The ID of the region where the NLB instance is deployed.</p>
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
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>Wrr</strong>: weighted round-robin. Backend servers with higher weights receive more requests.</li>
         * <li><strong>Wlc</strong>: weighted least connections. Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If multiple backend servers have the same weight, requests are forwarded to the backend server with the least connections.</li>
         * <li><strong>rr</strong>: Requests are forwarded to backend servers in sequence.</li>
         * <li><strong>sch</strong>: source IP hash. Requests from the same source IP address are forwarded to the same backend server.</li>
         * <li><strong>tch</strong>: consistent hashing based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same four factors are forwarded to the same backend server.</li>
         * <li><strong>qch</strong>: QUIC ID hash. Requests that contain the same QUIC ID are forwarded to the same backend server.</li>
         * </ul>
         * <blockquote>
         * <p> QUIC ID hash is supported only when the backend protocol is set to UDP.</p>
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
         * <p>The new name of the server group.</p>
         * <p>The name must be 2 to 128 characters in length, can contain digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB_ServerGroup1</p>
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

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

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
            this.healthCheckHttpVersion = builder.healthCheckHttpVersion;
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
            private String healthCheckHttpVersion; 
            private Integer healthCheckInterval; 
            private String healthCheckReq; 
            private String healthCheckType; 
            private String healthCheckUrl; 
            private Integer healthyThreshold; 
            private String httpCheckMethod; 
            private Integer unhealthyThreshold; 

            private Builder() {
            } 

            private Builder(HealthCheckConfig model) {
                this.healthCheckConnectPort = model.healthCheckConnectPort;
                this.healthCheckConnectTimeout = model.healthCheckConnectTimeout;
                this.healthCheckDomain = model.healthCheckDomain;
                this.healthCheckEnabled = model.healthCheckEnabled;
                this.healthCheckExp = model.healthCheckExp;
                this.healthCheckHttpCode = model.healthCheckHttpCode;
                this.healthCheckHttpVersion = model.healthCheckHttpVersion;
                this.healthCheckInterval = model.healthCheckInterval;
                this.healthCheckReq = model.healthCheckReq;
                this.healthCheckType = model.healthCheckType;
                this.healthCheckUrl = model.healthCheckUrl;
                this.healthyThreshold = model.healthyThreshold;
                this.httpCheckMethod = model.httpCheckMethod;
                this.unhealthyThreshold = model.unhealthyThreshold;
            } 

            /**
             * <p>The backend port that is used for health checks. Valid values: <strong>0</strong> to <strong>65535</strong>. If you set this parameter to <strong>0</strong>, the port that the backend server uses to provide services is also used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The timeout period for a health check response. Unit: seconds. Valid values: <strong>1 to 300</strong>. Default value: <strong>5</strong></p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * <p>The domain name used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>$SERVER_IP</strong>: the internal IP address of a backend server.</li>
             * <li><strong>domain</strong>: the specified domain name. The domain name must be 1 to 80 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.).</li>
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
             * <p>Specifies whether to enable health checks. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * <p>The response string of UDP health checks. The string must be 1 to 512 characters in length, and can contain letters and digits.</p>
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
             * HealthCheckHttpVersion.
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * <p>The interval at which health checks are performed. Unit: seconds. Default value: <strong>5</strong></p>
             * <ul>
             * <li>If you set <strong>HealthCheckType</strong> to <strong>TCP</strong> or <strong>HTTP</strong>, valid values are <strong>1 to 50</strong>.</li>
             * <li>If you set <strong>HealthCheckType</strong> to <strong>UDP</strong>, valid values are <strong>1 to 300</strong>. Set the health check interval equal to or larger than the response timeout period to ensure that UDP response timeouts are not determined as no responses.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The request string of UDP health checks. The string must be 1 to 512 characters in length, and can contain letters and digits.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder healthCheckReq(String healthCheckReq) {
                this.healthCheckReq = healthCheckReq;
                return this;
            }

            /**
             * <p>The protocol that you want to use for health checks. Valid values:</p>
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
             * <p>The path to which health check probes are sent.</p>
             * <p>The path must be 1 to 80 characters in length and can contain only letters, digits, and the following special characters: <code>- / . % ? # &amp; =</code>. It can also contain the following extended characters: <code>_ ; ~ ! ( ) * [ ] @ $ ^ : \&quot; , +</code>. It must start with a forward slash (/).</p>
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
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from <strong>fail</strong> to <strong>success</strong>. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The HTTP method used for health checks. Valid values: <strong>GET</strong> and <strong>HEAD</strong>.</p>
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
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from <strong>success</strong> to <strong>fail</strong>. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
}
