// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateServerGroupRequest</p>
 */
public class CreateServerGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("HealthCheckConfig")
    @Validation(required = true)
    private HealthCheckConfig healthCheckConfig;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Scheduler")
    private String scheduler;

    @Query
    @NameInMap("ServerGroupName")
    @Validation(required = true)
    private String serverGroupName;

    @Query
    @NameInMap("ServerGroupType")
    private String serverGroupType;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("StickySessionConfig")
    private StickySessionConfig stickySessionConfig;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UchConfig")
    private UchConfig uchConfig;

    @Query
    @NameInMap("UpstreamKeepaliveEnabled")
    private Boolean upstreamKeepaliveEnabled;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private CreateServerGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.protocol = builder.protocol;
        this.resourceGroupId = builder.resourceGroupId;
        this.scheduler = builder.scheduler;
        this.serverGroupName = builder.serverGroupName;
        this.serverGroupType = builder.serverGroupType;
        this.serviceName = builder.serviceName;
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
     * @return stickySessionConfig
     */
    public StickySessionConfig getStickySessionConfig() {
        return this.stickySessionConfig;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
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
        private Boolean dryRun; 
        private HealthCheckConfig healthCheckConfig; 
        private String protocol; 
        private String resourceGroupId; 
        private String scheduler; 
        private String serverGroupName; 
        private String serverGroupType; 
        private String serviceName; 
        private StickySessionConfig stickySessionConfig; 
        private java.util.List < Tag> tag; 
        private UchConfig uchConfig; 
        private Boolean upstreamKeepaliveEnabled; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateServerGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.healthCheckConfig = request.healthCheckConfig;
            this.protocol = request.protocol;
            this.resourceGroupId = request.resourceGroupId;
            this.scheduler = request.scheduler;
            this.serverGroupName = request.serverGroupName;
            this.serverGroupType = request.serverGroupType;
            this.serviceName = request.serviceName;
            this.stickySessionConfig = request.stickySessionConfig;
            this.tag = request.tag;
            this.uchConfig = request.uchConfig;
            this.upstreamKeepaliveEnabled = request.upstreamKeepaliveEnabled;
            this.vpcId = request.vpcId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The configuration of health checks.
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * The backend protocol. Valid values:
         * <p>
         * 
         * *   **HTTP** (default): The server group can be associated with HTTPS, HTTP, and QUIC listeners.
         * *   **HTTPS**: The server group can be associated with HTTPS listeners.
         * *   **gRPC**: The server group can be associated with HTTPS and QUIC listeners.
         * 
         * > If the **ServerGroupType** parameter is set to **Fc**, you can set Protocol only to **HTTP**.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The scheduling algorithm. Valid values:
         * <p>
         * 
         * *   **Wrr** (default): The weighted round-robin algorithm is used. Backend servers that have higher weights receive more requests than those that have lower weights.
         * *   **Wlc**: The weighted least connections algorithm is used. Requests are distributed based on the weights and the number of connections to backend servers. If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.
         * *   **Sch**: The consistent hashing algorithm is used. Requests from the same source IP address are distributed to the same backend server.
         * 
         * > This parameter takes effect when the **ServerGroupType** parameter is set to **Instance** or **Ip**.
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder serverGroupName(String serverGroupName) {
            this.putQueryParameter("ServerGroupName", serverGroupName);
            this.serverGroupName = serverGroupName;
            return this;
        }

        /**
         * The type of server group. Valid values:
         * <p>
         * 
         * *   **Instance** (default): allows you to add servers by specifying **Ecs**, **Ens**, or **Eci**.
         * *   **Ip**: allows you to add servers by specifying IP addresses.
         * *   **Fc**: allows you to add servers by specifying functions of Function Compute.
         */
        public Builder serverGroupType(String serverGroupType) {
            this.putQueryParameter("ServerGroupType", serverGroupType);
            this.serverGroupType = serverGroupType;
            return this;
        }

        /**
         * This parameter is available only if the ALB Ingress controller is used. In this case, set this parameter to the name of the `Kubernetes Service` that is associated with the server group.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The configuration of session persistence.
         * <p>
         * 
         * > This parameter takes effect when the **ServerGroupType** parameter is set to **Instance** or **Ip**.
         */
        public Builder stickySessionConfig(StickySessionConfig stickySessionConfig) {
            this.putQueryParameter("StickySessionConfig", stickySessionConfig);
            this.stickySessionConfig = stickySessionConfig;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The setting of consistent hashing based on URLs.
         */
        public Builder uchConfig(UchConfig uchConfig) {
            this.putQueryParameter("UchConfig", uchConfig);
            this.uchConfig = uchConfig;
            return this;
        }

        /**
         * UpstreamKeepaliveEnabled.
         */
        public Builder upstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
            this.putQueryParameter("UpstreamKeepaliveEnabled", upstreamKeepaliveEnabled);
            this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC). You can add only backend servers that are deployed in the specified VPC to the server group.
         * <p>
         * 
         * > This parameter takes effect when the **ServerGroupType** parameter is set to **Instance** or **Ip**.
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

    public static class HealthCheckConfig extends TeaModel {
        @NameInMap("HealthCheckCodes")
        private java.util.List < String > healthCheckCodes;

        @NameInMap("HealthCheckConnectPort")
        @Validation(maximum = 65535)
        private Integer healthCheckConnectPort;

        @NameInMap("HealthCheckEnabled")
        @Validation(required = true)
        private Boolean healthCheckEnabled;

        @NameInMap("HealthCheckHost")
        private String healthCheckHost;

        @NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @NameInMap("HealthCheckInterval")
        @Validation(maximum = 50, minimum = 1)
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @NameInMap("HealthCheckTimeout")
        @Validation(maximum = 300, minimum = 1)
        private Integer healthCheckTimeout;

        @NameInMap("HealthyThreshold")
        @Validation(maximum = 10, minimum = 2)
        private Integer healthyThreshold;

        @NameInMap("UnhealthyThreshold")
        @Validation(maximum = 10, minimum = 2)
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
        public java.util.List < String > getHealthCheckCodes() {
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
            private java.util.List < String > healthCheckCodes; 
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
             * The HTTP status codes that are used to determine whether the backend server passes the health check.
             */
            public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * The port that you want to use for health checks on backend servers.
             * <p>
             * 
             * Valid values: **0** to **65535**.
             * 
             * Default value: **0**. If you set the value to 0, the port of a backend server is used for health checks.
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * Indicates whether the health check feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > If the **ServerGroupType** parameter is set to **Instance** or **Ip**, the health check feature is enabled by default. If the **ServerGroupType** parameter is set to **Fc**, the health check feature is disabled by default.
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * The domain name that is used for health checks. The domain name must meet the following requirements:
             * <p>
             * 
             * *   The domain name must be 1 to 80 characters in length.
             * *   The domain name can contain lowercase letters, digits, hyphens (-), and periods (.).
             * *   It must contain at least one period (.) but cannot start or end with a period (.).
             * *   The rightmost domain label of the domain name can contain only letters, and cannot contain digits or hyphens (-).
             * *   The domain name cannot start or end with a hyphen (-).
             * 
             * > This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP**.
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * The HTTP version. Valid values: **HTTP1.0** and **HTTP1.1**. Default value: HTTP1.1.
             * <p>
             * 
             * > This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP**.
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * The interval at which health checks are performed. Unit: seconds.
             * <p>
             * 
             * Valid values: **1** to **50**.
             * 
             * Default value: **2**.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * The HTTP method that is used for health checks. Valid values:
             * <p>
             * 
             * *   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.
             * *   **POST**: gRPC health checks automatically use the POST method.
             * *   **HEAD**: By default, HTTP health checks use the HEAD method.
             * 
             * > This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * The path that is used for health checks.
             * <p>
             * 
             * The path must be 1 to 80 characters in length and can contain only letters, digits, and the following special characters: `- / . % ? # & =`. It can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \" , +`. The URL must start with a forward slash (/).
             * 
             * > This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP**.
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * The protocol that is used for health checks. Valid values:
             * <p>
             * 
             * *   **HTTP**: To perform HTTP health checks, Application Load Balancer (ALB) sends HEAD or GET requests to a backend server to check whether the backend server is healthy.
             * *   **HTTPS**: To perform HTTPS health checks, ALB sends SYN packets to a backend server to check whether the port of the backend server is available to receive requests.
             * *   **gRPC**: To perform gRPC health checks, ALB sends POST or GET requests to a backend server to check whether the backend server is healthy.
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * Specify the timeout period of a health check response. If a backend server, such as an Elastic Compute Service (ECS) instance, does not return a health check response within the specified timeout period, the server fails the health check. Unit: seconds.
             * <p>
             * 
             * Valid values: **1** to **300**.
             * 
             * Default value: **5**.
             * 
             * > If the value of the **HealthCheckTimeout** parameter is smaller than that of the **HealthCheckInterval** parameter, the timeout period specified by the **HealthCheckTimeout** parameter is ignored and the value of the **HealthCheckInterval** parameter is used as the timeout period.
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.
             * <p>
             * 
             * Valid values: **2** to **10**.
             * 
             * Default value: **3**.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.
             * <p>
             * 
             * Valid values: **2** to **10**.
             * 
             * Default value: **3**.
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
    public static class StickySessionConfig extends TeaModel {
        @NameInMap("Cookie")
        private String cookie;

        @NameInMap("CookieTimeout")
        @Validation(maximum = 86400, minimum = 1)
        private Integer cookieTimeout;

        @NameInMap("StickySessionEnabled")
        private Boolean stickySessionEnabled;

        @NameInMap("StickySessionType")
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
             * The cookie to be configured on the server.
             * <p>
             * 
             * The cookie must be 1 to 200 characters in length and can contain only ASCII characters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).
             * 
             * > This parameter takes effect when the **StickySessionEnabled** parameter is set to **true** and the **StickySessionType** parameter is set to **Server**.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * The timeout period of a cookie. Unit: seconds.
             * <p>
             * 
             * Valid values: **1** to **86400**.
             * 
             * Default value: **1000**.
             * 
             * > This parameter takes effect only when the **StickySessionEnabled** parameter is set to **true** and the **StickySessionType** parameter is set to **Insert**.
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * Specifies whether to enable session persistence. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             * 
             * > This parameter takes effect when the **ServerGroupType** parameter is set to **Instance** or **Ip**.
             */
            public Builder stickySessionEnabled(Boolean stickySessionEnabled) {
                this.stickySessionEnabled = stickySessionEnabled;
                return this;
            }

            /**
             * The method that is used to handle a cookie. Valid values:
             * <p>
             * 
             * *   **Insert** (default): inserts a cookie.
             * 
             * ALB inserts a session cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. Subsequent requests to ALB carry this cookie, and ALB determines the destination servers of the requests based on the cookies.
             * 
             * *   **Server**: rewrites a cookie.
             * 
             * When ALB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. Subsequent requests to ALB carry this user-defined cookie, and ALB determines the destination servers of the requests based on the cookies.
             * 
             * > This parameter takes effect when the **StickySessionEnabled** parameter is set to **true**.
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
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class UchConfig extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        @NameInMap("Value")
        @Validation(required = true)
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
             * Type
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The setting of consistent hashing.
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
