// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerGroupsResponseBody</p>
 */
public class ListServerGroupsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServerGroups")
    private java.util.List < ServerGroups> serverGroups;

    @NameInMap("TotalCount")
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
         * The backend server groups.
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

    public static class HealthCheckConfig extends TeaModel {
        @NameInMap("HealthCheckCodes")
        private java.util.List < String > healthCheckCodes;

        @NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @NameInMap("HealthCheckHost")
        private String healthCheckHost;

        @NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("UnhealthyThreshold")
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
             * The HTTP status codes that indicate whether the backend server passes the health check.
             */
            public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * The backend port that is used for health checks. Valid values: **0** to **65535**.
             * <p>
             * 
             * A value of **0** indicates that the port on a backend server is used for health checks.
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
             * The HTTP version that is used for health checks.
             * <p>
             * 
             * Valid values: **HTTP1.0** and **HTTP1.1**.
             * 
             * > This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP**.
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
             * The method that you want to use for the health check. Valid values:
             * <p>
             * 
             * *   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.
             * *   **POST**: gRPC health checks automatically use the POST method.
             * *   **HEAD**: HTTP health checks automatically use the HEAD method.
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
             * *   **HTTP**: To perform HTTP health checks, ALB sends HEAD or GET requests to a backend server to check whether the backend server is healthy.
             * *   **TCP**: To perform TCP health checks, ALB sends SYN packets to a backend server to check whether the port of the backend server is available to receive requests.
             * *   **gRPC**: To perform gRPC health checks, ALB sends POST or GET requests to a backend server to check whether the backend server is healthy.
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * The timeout period of a health check. If a backend server does not respond within the specified timeout period, the backend server is declared unhealthy. Unit: seconds.
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
    public static class StickySessionConfig extends TeaModel {
        @NameInMap("Cookie")
        private String cookie;

        @NameInMap("CookieTimeout")
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
             * The cookie that is configured on the server.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * The timeout period of a cookie. Unit: seconds. Valid values: **1** to **86400**.
             * <p>
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
             * *   **false**
             */
            public Builder stickySessionEnabled(Boolean stickySessionEnabled) {
                this.stickySessionEnabled = stickySessionEnabled;
                return this;
            }

            /**
             * The method that is used to handle a cookie. Valid values:
             * <p>
             * 
             * *   **Insert**: inserts a cookie.
             * 
             * ALB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client contains this cookie and the listener forwards this request to the recorded backend server.
             * 
             * *   **Server**: rewrites a cookie.
             * 
             * When ALB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. Subsequent requests to ALB carry this user-defined cookie, and ALB determines the destination servers of the requests based on the cookies.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The tag value.
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
        @NameInMap("ConfigManagedEnabled")
        private Boolean configManagedEnabled;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("HealthCheckConfig")
        private HealthCheckConfig healthCheckConfig;

        @NameInMap("Ipv6Enabled")
        private Boolean ipv6Enabled;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Scheduler")
        private String scheduler;

        @NameInMap("ServerCount")
        private Integer serverCount;

        @NameInMap("ServerGroupId")
        private String serverGroupId;

        @NameInMap("ServerGroupName")
        private String serverGroupName;

        @NameInMap("ServerGroupStatus")
        private String serverGroupStatus;

        @NameInMap("ServerGroupType")
        private String serverGroupType;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("StickySessionConfig")
        private StickySessionConfig stickySessionConfig;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UchConfig")
        private UchConfig uchConfig;

        @NameInMap("UpstreamKeepaliveEnabled")
        private Boolean upstreamKeepaliveEnabled;

        @NameInMap("VpcId")
        private String vpcId;

        private ServerGroups(Builder builder) {
            this.configManagedEnabled = builder.configManagedEnabled;
            this.createTime = builder.createTime;
            this.healthCheckConfig = builder.healthCheckConfig;
            this.ipv6Enabled = builder.ipv6Enabled;
            this.protocol = builder.protocol;
            this.resourceGroupId = builder.resourceGroupId;
            this.scheduler = builder.scheduler;
            this.serverCount = builder.serverCount;
            this.serverGroupId = builder.serverGroupId;
            this.serverGroupName = builder.serverGroupName;
            this.serverGroupStatus = builder.serverGroupStatus;
            this.serverGroupType = builder.serverGroupType;
            this.serviceName = builder.serviceName;
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
            private String createTime; 
            private HealthCheckConfig healthCheckConfig; 
            private Boolean ipv6Enabled; 
            private String protocol; 
            private String resourceGroupId; 
            private String scheduler; 
            private Integer serverCount; 
            private String serverGroupId; 
            private String serverGroupName; 
            private String serverGroupStatus; 
            private String serverGroupType; 
            private String serviceName; 
            private StickySessionConfig stickySessionConfig; 
            private java.util.List < Tags> tags; 
            private UchConfig uchConfig; 
            private Boolean upstreamKeepaliveEnabled; 
            private String vpcId; 

            /**
             * Indicates whether configuration management is enabled. Valid values:
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
             * CreateTime.
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
             * Indicates whether IPv6 is supported. Valid values:
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
             * The backend protocol. Valid values:
             * <p>
             * 
             * *   **HTTP**: allows you to associate an HTTPS, HTTP, or QUIC listener with the server group.
             * *   **HTTPS**: allows you to associate HTTPS listeners with backend servers.
             * *   **GRPC**: allows you to associate an HTTPS or QUIC listener with the server group.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The ID of the resource group to which the resource belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The scheduling algorithm. Valid values:
             * <p>
             * 
             * *   **Wrr**: Backend servers with higher weights receive more requests than backend servers with lower weights.
             * *   **Wlc**: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.
             * *   **Sch**: The consistent hashing algorithm is used. Requests from the same source IP address are distributed to the same backend server.
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
             * The status of the server group. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Available**
             * *   **Configuring**
             */
            public Builder serverGroupStatus(String serverGroupStatus) {
                this.serverGroupStatus = serverGroupStatus;
                return this;
            }

            /**
             * The type of server group. Valid values:
             * <p>
             * 
             * *   **Instance**
             * *   **Ip**
             * *   **Fc**
             */
            public Builder serverGroupType(String serverGroupType) {
                this.serverGroupType = serverGroupType;
                return this;
            }

            /**
             * The service name.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
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
             * UchConfig.
             */
            public Builder uchConfig(UchConfig uchConfig) {
                this.uchConfig = uchConfig;
                return this;
            }

            /**
             * Indicates whether persistent TCP connections are enabled. Valid values:
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
             * The ID of the virtual private cloud (VPC).
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
