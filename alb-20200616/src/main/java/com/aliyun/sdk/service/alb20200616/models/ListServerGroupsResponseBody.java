// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If <strong>NextToken</strong> is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f8****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The server groups.</p>
         */
        public Builder serverGroups(java.util.List < ServerGroups> serverGroups) {
            this.serverGroups = serverGroups;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServerGroupsResponseBody build() {
            return new ListServerGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
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
             * <p>Indicates whether connection draining is enabled. Valid values:</p>
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
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
     */
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
             * <p>The HTTP status codes that indicate healthy backend servers.</p>
             */
            public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * <p>The backend port that is used for health checks. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
             * <p>A value of <strong>0</strong> indicates that the port of a backend server is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>Indicates whether the health check feature is enabled. Valid values:</p>
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
             * <p>The domain name that is used for health checks. The domain name meets the following requirements:</p>
             * <ul>
             * <li>The domain name is 1 to 80 characters in length.</li>
             * <li>The domain name contains lowercase letters, digits, hyphens (-), and periods (.).</li>
             * <li>The domain name contains at least one period (.) but does not start or end with a period (.).</li>
             * <li>The rightmost domain label of the domain name contains only letters, and does not contain digits or hyphens (-).</li>
             * <li>The domain name does not start or end with a hyphen (-).</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only if you set <strong>HealthCheckProtocol</strong> to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
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
             * <p>The HTTP version that is used for health checks.</p>
             * <p>Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
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
             * <p>The interval at which health checks are performed. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
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
             * <li><strong>GET</strong>: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</li>
             * <li><strong>POST</strong>: gRPC health checks use the POST method by default.</li>
             * <li><strong>HEAD</strong>: HTTP and HTTPS health checks use the HEAD method by default.</li>
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
             * <p>The URL that is used for health checks.</p>
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
             * <li><strong>HTTPS</strong>: HTTPS health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers. HTTPS supports encryption and provides higher security than HTTP.</li>
             * <li><strong>TCP</strong>: TCP health checks send TCP SYN packets to a backend server to check whether the port of the backend server is reachable.</li>
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
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
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
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
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
             * <p>The duration of a slow start.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder slowStartDuration(Integer slowStartDuration) {
                this.slowStartDuration = slowStartDuration;
                return this;
            }

            /**
             * <p>Indicates whether slow starts are enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
     */
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
             * <p>The cookie configured for the server.</p>
             * 
             * <strong>example:</strong>
             * <p>B490B5EBF6F3CD402E515D22BCDA****</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>The timeout period of the cookie. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
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
             * <p>Indicates whether session persistence is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The method that is used to handle the cookie. Valid values:</p>
             * <ul>
             * <li><strong>insert</strong>: inserts the cookie. The first time a client accesses ALB, ALB inserts the SERVERID cookie into the HTTP or HTTPS response packet. Subsequent requests from the client that carry this cookie are forwarded to the same backend server as the first request.</li>
             * <li><strong>Server</strong>: rewrites the cookie. ALB rewrites the custom cookies in requests from a client. Subsequent requests from the client that carry the new cookie are forwarded to the same backend server as the first request.</li>
             * </ul>
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
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
     */
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
    /**
     * 
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
     */
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
             * <p>The parameter type. Valid value: QueryString.</p>
             * 
             * <strong>example:</strong>
             * <p>QueryString</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The hash value.</p>
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
    /**
     * 
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
     */
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
             * <p>Indicates whether configuration management is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder configManagedEnabled(Boolean configManagedEnabled) {
                this.configManagedEnabled = configManagedEnabled;
                return this;
            }

            /**
             * <p>The configurations of connection draining.</p>
             * <p>After connection draining is enabled, ALB maintains data transmission for a period of time after the backend server is removed or declared unhealthy.</p>
             * <blockquote>
             * <ul>
             * <li>Basic ALB instances do not support connection draining. Standard and WAF-enabled ALB instances support connection draining. </li>
             * <li>Server groups of the instance and IP types support connection draining. Server groups of the Function Compute type do not support connection draining.</li>
             * </ul>
             * </blockquote>
             */
            public Builder connectionDrainConfig(ConnectionDrainConfig connectionDrainConfig) {
                this.connectionDrainConfig = connectionDrainConfig;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-02T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The health check configurations.</p>
             */
            public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
                this.healthCheckConfig = healthCheckConfig;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ipv6Enabled(Boolean ipv6Enabled) {
                this.ipv6Enabled = ipv6Enabled;
                return this;
            }

            /**
             * <p>The backend protocol. Valid values:</p>
             * <ul>
             * <li><strong>HTTP</strong>: allows you to associate HTTPS, HTTP, or QUIC listeners with backend servers.</li>
             * <li><strong>HTTPS</strong>: allows you to associate HTTPS listeners with backend servers.</li>
             * <li><strong>GRPC</strong>: allows you to associate HTTPS and QUIC listeners with backend servers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The ID of the ALB instance associated with the server group.</p>
             */
            public Builder relatedLoadBalancerIds(java.util.List < String > relatedLoadBalancerIds) {
                this.relatedLoadBalancerIds = relatedLoadBalancerIds;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-atstuj3rtop****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The scheduling algorithm. Valid values:</p>
             * <ul>
             * <li><strong>Wrr</strong>: weighted round-robin. Backend servers with higher weights receive more requests than backend servers with lower weights.</li>
             * <li><strong>Wlc</strong>: weighted least connections. Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If multiple backend servers have the same weight, requests are forwarded to the backend server with the least number of connections.</li>
             * <li><strong>Sch</strong>: consistent hashing. Requests that have the same hash factors are distributed to the same backend server. If you do not specify the UchConfig parameter, the source IP address is used as the hash factor by default. Requests that are from the same IP address are distributed to the same backend server. If you specify the UchConfig parameter, the URL string is used as the hash factor. Requests that have the same URL string are distributed to the same backend server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Wrr</p>
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * <p>The number of backend servers in the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serverCount(Integer serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * <p>The server group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-cige6j****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The server group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Group3</p>
             */
            public Builder serverGroupName(String serverGroupName) {
                this.serverGroupName = serverGroupName;
                return this;
            }

            /**
             * <p>The status of the server group. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>.</li>
             * <li><strong>Available</strong></li>
             * <li><strong>Configuring</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder serverGroupStatus(String serverGroupStatus) {
                this.serverGroupStatus = serverGroupStatus;
                return this;
            }

            /**
             * <p>The server group type. Valid values:</p>
             * <ul>
             * <li><strong>Instance</strong>: instances, including ECS instances, ENIs, and elastic container instances.</li>
             * <li><strong>Ip</strong>: IP addresses.</li>
             * <li><strong>Fc</strong>: Function Compute</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder serverGroupType(String serverGroupType) {
                this.serverGroupType = serverGroupType;
                return this;
            }

            /**
             * <p>The name of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The configurations of slow starts.</p>
             * <p>After slow starts are enabled, ALB prefetches data to newly added backend servers. Requests distributed to the backend servers gradually increase.</p>
             * <blockquote>
             * <ul>
             * <li>Basic ALB instances do not support slow starts. Standard and WAF-enabled ALB instances support slow starts.</li>
             * <li>Server groups of the instance and IP types support slow starts. Server groups of the Function Compute type do not support slow starts.</li>
             * <li>Slow start is supported only by the weighted round-robin scheduling algorithm.</li>
             * </ul>
             * </blockquote>
             */
            public Builder slowStartConfig(SlowStartConfig slowStartConfig) {
                this.slowStartConfig = slowStartConfig;
                return this;
            }

            /**
             * <p>The configuration of session persistence.</p>
             */
            public Builder stickySessionConfig(StickySessionConfig stickySessionConfig) {
                this.stickySessionConfig = stickySessionConfig;
                return this;
            }

            /**
             * <p>The tags that are added to the server group.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The configuration of consistent hashing based on URLs.</p>
             */
            public Builder uchConfig(UchConfig uchConfig) {
                this.uchConfig = uchConfig;
                return this;
            }

            /**
             * <p>Indicates whether persistent TCP connections are enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder upstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
                this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the ALB instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp15zckdt37pq72zv****</p>
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
