// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerGroupsResponseBody</p>
 */
public class ListServerGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerGroups")
    private java.util.List < ServerGroups> serverGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListServerGroupsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serverGroups = builder.serverGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerGroupsResponseBody create() {
        return builder().build();
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
     * @return serverGroups
     */
    public java.util.List < ServerGroups> getServerGroups() {
        return this.serverGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ServerGroups> serverGroups; 
        private Integer totalCount; 

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If **NextToken** is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of server groups.
         */
        public Builder serverGroups(java.util.List < ServerGroups> serverGroups) {
            this.serverGroups = serverGroups;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServerGroupsResponseBody build() {
            return new ListServerGroupsResponseBody(this);
        } 

    } 

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
             * Indicates whether connection draining is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder connectionDrainEnabled(Boolean connectionDrainEnabled) {
                this.connectionDrainEnabled = connectionDrainEnabled;
                return this;
            }

            /**
             * The timeout period of connection draining.
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
    public static class HealthCheckConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthCheckCodes")
        private java.util.List < String > healthCheckCodes;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHost")
        private String healthCheckHost;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @com.aliyun.core.annotation.NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @com.aliyun.core.annotation.NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
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
             * The HTTP status codes that indicate healthy backend servers.
             */
            public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * The backend port that is used for health checks. Valid values: **0** to **65535**.
             * <p>
             * 
             * A value of **0** indicates that the port of a backend server is used for health checks.
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
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * The domain name that is used for health checks. The domain name meets the following requirements:
             * <p>
             * 
             * *   The domain name must be 1 to 80 characters in length.
             * *   The domain name can contain lowercase letters, digits, hyphens (-), and periods (.).
             * *   The domain name can contain at least one period (.) but cannot start or end with a period (.).
             * *   The rightmost domain label of the domain name can contain only letters, and cannot contain digits or hyphens (-).
             * *   The domain name cannot start or end with a hyphen (-).
             * 
             * >  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the **ALB** tab, and then apply for the privilege to use HTTPS.
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * The HTTP version for health checks.
             * <p>
             * 
             * Valid values: **HTTP1.0** and **HTTP1.1**.
             * 
             * >  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the **ALB** tab, and then apply for the privilege to use HTTPS.
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * The interval at which health checks are performed. Unit: seconds. Valid values: **1** to **50**.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * The HTTP method that is used for health checks. Valid value:
             * <p>
             * 
             * *   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.
             * *   **POST**: gRPC health checks use the POST method by default.
             * *   **HEAD**: HTTP and HTTPS health checks use the HEAD method by default.
             * 
             * >  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, or **gRPC**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the **ALB** tab, and then apply for the privilege to use HTTPS.
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * The URL that is used for health checks.
             * <p>
             * 
             * >  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the **ALB** tab, and then apply for the privilege to use HTTPS.
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * The protocol that you want to use for health checks. Valid value:
             * <p>
             * 
             * *   **HTTP**: HTTP health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers.
             * *   **HTTPS**: HTTPS health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers. HTTPS supports encryption and provides higher security than HTTP.
             * *   **TCP**: TCP health checks send TCP SYN packets to a backend server to check whether the port of the backend server is reachable.
             * *   **gRPC**: gRPC health checks send POST or GET requests to a backend server to check whether the backend server is healthy.
             * 
             * >  HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the **ALB** tab, and then apply for the privilege to use HTTPS.
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the backend server is declared unhealthy. Unit: seconds.
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.
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
             * The duration of a slow start.
             */
            public Builder slowStartDuration(Integer slowStartDuration) {
                this.slowStartDuration = slowStartDuration;
                return this;
            }

            /**
             * Indicates whether slow starts are enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
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
    public static class StickySessionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("CookieTimeout")
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
             * The cookie configured for the server.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * The timeout period of the cookie. Unit: seconds. Valid values: **1** to **86400**.
             * <p>
             * 
             * >  This parameter takes effect only when **StickySessionEnabled** is set to **true** and **StickySessionType** is set to **Insert**.
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * Indicates whether session persistence is enabled. Valid value:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder stickySessionEnabled(Boolean stickySessionEnabled) {
                this.stickySessionEnabled = stickySessionEnabled;
                return this;
            }

            /**
             * The method that is used to handle the cookie. Valid value:
             * <p>
             * 
             * *   **insert**: inserts the cookie. The first time a client accesses ALB, ALB inserts the SERVERID cookie into the HTTP or HTTPS response packet. Subsequent requests from the client that carry this cookie are forwarded to the same backend server as the first request.
             * *   **Server**: rewrites the cookie. ALB rewrites the custom cookies in requests from a client. Subsequent requests from the client that carry the new cookie are forwarded to the same backend server as the first request.
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class UchConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The parameter type. Valid value: QueryString.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The hash value.
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
    public static class ServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigManagedEnabled")
        private Boolean configManagedEnabled;

        @com.aliyun.core.annotation.NameInMap("ConnectionDrainConfig")
        private ConnectionDrainConfig connectionDrainConfig;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConfig")
        private HealthCheckConfig healthCheckConfig;

        @com.aliyun.core.annotation.NameInMap("Ipv6Enabled")
        private Boolean ipv6Enabled;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RelatedLoadBalancerIds")
        private java.util.List < String > relatedLoadBalancerIds;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Scheduler")
        private String scheduler;

        @com.aliyun.core.annotation.NameInMap("ServerCount")
        private Integer serverCount;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("ServerGroupName")
        private String serverGroupName;

        @com.aliyun.core.annotation.NameInMap("ServerGroupStatus")
        private String serverGroupStatus;

        @com.aliyun.core.annotation.NameInMap("ServerGroupType")
        private String serverGroupType;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SlowStartConfig")
        private SlowStartConfig slowStartConfig;

        @com.aliyun.core.annotation.NameInMap("StickySessionConfig")
        private StickySessionConfig stickySessionConfig;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UchConfig")
        private UchConfig uchConfig;

        @com.aliyun.core.annotation.NameInMap("UpstreamKeepaliveEnabled")
        private Boolean upstreamKeepaliveEnabled;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ServerGroups(Builder builder) {
            this.configManagedEnabled = builder.configManagedEnabled;
            this.connectionDrainConfig = builder.connectionDrainConfig;
            this.createTime = builder.createTime;
            this.healthCheckConfig = builder.healthCheckConfig;
            this.ipv6Enabled = builder.ipv6Enabled;
            this.protocol = builder.protocol;
            this.relatedLoadBalancerIds = builder.relatedLoadBalancerIds;
            this.resourceGroupId = builder.resourceGroupId;
            this.scheduler = builder.scheduler;
            this.serverCount = builder.serverCount;
            this.serverGroupId = builder.serverGroupId;
            this.serverGroupName = builder.serverGroupName;
            this.serverGroupStatus = builder.serverGroupStatus;
            this.serverGroupType = builder.serverGroupType;
            this.serviceName = builder.serviceName;
            this.slowStartConfig = builder.slowStartConfig;
            this.stickySessionConfig = builder.stickySessionConfig;
            this.tags = builder.tags;
            this.uchConfig = builder.uchConfig;
            this.upstreamKeepaliveEnabled = builder.upstreamKeepaliveEnabled;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroups create() {
            return builder().build();
        }

        /**
         * @return configManagedEnabled
         */
        public Boolean getConfigManagedEnabled() {
            return this.configManagedEnabled;
        }

        /**
         * @return connectionDrainConfig
         */
        public ConnectionDrainConfig getConnectionDrainConfig() {
            return this.connectionDrainConfig;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return healthCheckConfig
         */
        public HealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
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
         * @return relatedLoadBalancerIds
         */
        public java.util.List < String > getRelatedLoadBalancerIds() {
            return this.relatedLoadBalancerIds;
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
         * @return serverCount
         */
        public Integer getServerCount() {
            return this.serverCount;
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
         * @return serverGroupStatus
         */
        public String getServerGroupStatus() {
            return this.serverGroupStatus;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
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

        public static final class Builder {
            private Boolean configManagedEnabled; 
            private ConnectionDrainConfig connectionDrainConfig; 
            private String createTime; 
            private HealthCheckConfig healthCheckConfig; 
            private Boolean ipv6Enabled; 
            private String protocol; 
            private java.util.List < String > relatedLoadBalancerIds; 
            private String resourceGroupId; 
            private String scheduler; 
            private Integer serverCount; 
            private String serverGroupId; 
            private String serverGroupName; 
            private String serverGroupStatus; 
            private String serverGroupType; 
            private String serviceName; 
            private SlowStartConfig slowStartConfig; 
            private StickySessionConfig stickySessionConfig; 
            private java.util.List < Tags> tags; 
            private UchConfig uchConfig; 
            private Boolean upstreamKeepaliveEnabled; 
            private String vpcId; 

            /**
             * Indicates whether configuration management is enabled. Valid value:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder configManagedEnabled(Boolean configManagedEnabled) {
                this.configManagedEnabled = configManagedEnabled;
                return this;
            }

            /**
             * The configurations of connection draining.
             * <p>
             * 
             * After connection draining is enabled, ALB maintains data transmission for a period of time after the backend server is removed or declared unhealthy.
             * 
             * > *   By default, connection draining is disabled. To enable connection draining, contact your account manager.
             * >*   Basic ALB instances do not support connection draining. Standard and WAF-enabled ALB instances support connection draining.
             * >*   Server groups of the instance and IP types support connection draining. Server groups of the Function Compute type do not support connection draining.
             */
            public Builder connectionDrainConfig(ConnectionDrainConfig connectionDrainConfig) {
                this.connectionDrainConfig = connectionDrainConfig;
                return this;
            }

            /**
             * The time when the resource was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The health check configurations.
             */
            public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
                this.healthCheckConfig = healthCheckConfig;
                return this;
            }

            /**
             * Indicates whether IPv6 is supported. Valid value:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder ipv6Enabled(Boolean ipv6Enabled) {
                this.ipv6Enabled = ipv6Enabled;
                return this;
            }

            /**
             * The backend protocol. Valid value:
             * <p>
             * 
             * *   **HTTP**: allows you to associate HTTPS, HTTP, or QUIC listeners with backend servers.
             * *   **HTTPS**: allows you to associate HTTPS listeners with backend servers.
             * *   **GRPC**: allows you to associate HTTPS and QUIC listeners with backend servers.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The ID of the ALB instance associated with the server group.
             */
            public Builder relatedLoadBalancerIds(java.util.List < String > relatedLoadBalancerIds) {
                this.relatedLoadBalancerIds = relatedLoadBalancerIds;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The scheduling algorithm. Valid value:
             * <p>
             * 
             * *   **Wrr**: Backend servers with higher weights receive more requests than backend servers with lower weights.
             * *   **Wlc**: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If multiple backend servers have the same weight, requests are forwarded to the backend server with the least number of connections.
             * *   **Sch**: consistent hashing. Requests that have the same hash factors are distributed to the same backend server. If you do not specify the UchConfig parameter, the source IP address is used as the hash factor by default. Requests that are from the same IP address are distributed to the same backend server. If you specify the UchConfig parameter, the URL string is used as the hash factor. Requests that have the same URL string are distributed to the same backend server.
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * The number of backend servers in the server group.
             */
            public Builder serverCount(Integer serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * The server group ID.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The server group name.
             */
            public Builder serverGroupName(String serverGroupName) {
                this.serverGroupName = serverGroupName;
                return this;
            }

            /**
             * The status of the server group. Valid value:
             * <p>
             * 
             * *   **Creating**.
             * *   **Available**
             * *   **Configuring**
             */
            public Builder serverGroupStatus(String serverGroupStatus) {
                this.serverGroupStatus = serverGroupStatus;
                return this;
            }

            /**
             * The server group type. Valid value:
             * <p>
             * 
             * *   **Instance**: instances, including Elastic Compute Service (ECS) instances, elastic network interfaces (ENIs), and elastic container instances.
             * *   **Ip**: IP addresses.
             * *   **Fc**: Function Compute
             */
            public Builder serverGroupType(String serverGroupType) {
                this.serverGroupType = serverGroupType;
                return this;
            }

            /**
             * The name of the server group.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The configurations of slow starts.
             * <p>
             * 
             * After slow starts are enabled, ALB prefetches data to newly added backend servers. Requests distributed to the backend servers gradually increase.
             * 
             * > *   Basic ALB instances do not support slow starts. Standard and WAF-enabled ALB instances support slow starts.
             * >*   Server groups of the instance and IP types support slow starts. Server groups of the Function Compute type do not support slow starts.
             * >*   Slow start is supported only by the weighted round-robin scheduling algorithm.
             */
            public Builder slowStartConfig(SlowStartConfig slowStartConfig) {
                this.slowStartConfig = slowStartConfig;
                return this;
            }

            /**
             * The configuration of session persistence.
             */
            public Builder stickySessionConfig(StickySessionConfig stickySessionConfig) {
                this.stickySessionConfig = stickySessionConfig;
                return this;
            }

            /**
             * The tags that are added to the server group.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The configuration of consistent hashing based on URLs.
             */
            public Builder uchConfig(UchConfig uchConfig) {
                this.uchConfig = uchConfig;
                return this;
            }

            /**
             * Indicates whether persistent TCP connections are enabled. Valid value:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder upstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
                this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
                return this;
            }

            /**
             * The ID of the VPC to which the ALB instance belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ServerGroups build() {
                return new ServerGroups(this);
            } 

        } 

    }
}
