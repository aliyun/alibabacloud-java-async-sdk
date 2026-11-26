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
    private java.util.List<ServerGroups> serverGroups;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ServerGroups> getServerGroups() {
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
        private java.util.List<ServerGroups> serverGroups; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServerGroupsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.serverGroups = model.serverGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned per request in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to retrieve the next page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no more results are available.</li>
         * <li>If <strong>NextToken</strong> is returned, the value is the token for the next query.</li>
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
         * <p>CEF72CEB-54B6-4AE8-B225-F876******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of backend server groups.</p>
         */
        public Builder serverGroups(java.util.List<ServerGroups> serverGroups) {
            this.serverGroups = serverGroups;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
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

            private Builder() {
            } 

            private Builder(ConnectionDrainConfig model) {
                this.connectionDrainEnabled = model.connectionDrainEnabled;
                this.connectionDrainTimeout = model.connectionDrainTimeout;
            } 

            /**
             * <p>Specifies whether to enable connection draining.</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
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
             * <p>The timeout period for connection draining.</p>
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
        private java.util.List<String> healthCheckCodes;

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
             * <p>The port of the backend server used for health checks. Valid values: <strong>0</strong> to <strong>65535</strong>. A value of <strong>0</strong> indicates that the port of the backend server is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>Indicates whether health checks are enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
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
             * <p>The domain name used for health checks.</p>
             * <ul>
             * <li><p><strong>Use the internal IP address of the backend server</strong> (default): The internal IP address of the backend server is used as the domain name for health checks.</p>
             * </li>
             * <li><p><strong>Specify a domain name</strong>: Enter a domain name.</p>
             * <ul>
             * <li><p>The domain name must be 1 to 80 characters in length.</p>
             * </li>
             * <li><p>It can contain lowercase letters, digits, hyphens (-), and periods (.).</p>
             * </li>
             * <li><p>It must contain at least one period (.), and the period (.) cannot be at the beginning or end.</p>
             * </li>
             * <li><p>The rightmost domain label can contain only letters, and cannot contain digits or hyphens (-).</p>
             * </li>
             * <li><p>A hyphen (-) cannot be at the beginning or end.</p>
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
             * <p>The HTTP version for health checks. Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
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
             * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The HTTP method used for health checks. Valid values:</p>
             * <ul>
             * <li><p><strong>GET</strong>: If the response message exceeds 8 KB, it is truncated. However, this does not affect the health check result.</p>
             * </li>
             * <li><p><strong>POST</strong>: The POST method is used by default for gRPC listener health checks.</p>
             * </li>
             * <li><p><strong>HEAD</strong>: The HEAD method is used by default for HTTP and HTTPS listener health checks.</p>
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
             * <li><p><strong>HTTP</strong>: Sends HEAD or GET requests for browser impersonation to check whether the server application is healthy.</p>
             * </li>
             * <li><p><strong>HTTPS</strong>: Sends HEAD or GET requests for browser impersonation to check whether the server application is healthy. (Data encryption, more secure than HTTP.)</p>
             * </li>
             * <li><p><strong>TCP</strong>: Sends SYN handshake messages to check whether the server port is alive.</p>
             * </li>
             * <li><p><strong>gRPC</strong>: Sends POST or GET requests to check whether the server application is healthy.</p>
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
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * <p>The number of consecutive successful health checks required to change the health check status of a backend server from <strong>Failed</strong> to <strong>Successful</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The number of consecutive failed health checks required to change the health check status of a backend server from <strong>Successful</strong> to <strong>Failed</strong>.</p>
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

            private Builder() {
            } 

            private Builder(SlowStartConfig model) {
                this.slowStartDuration = model.slowStartDuration;
                this.slowStartEnabled = model.slowStartEnabled;
            } 

            /**
             * <p>The duration of slow start.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder slowStartDuration(Integer slowStartDuration) {
                this.slowStartDuration = slowStartDuration;
                return this;
            }

            /**
             * <p>Specifies whether to enable slow start.</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
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
             * <p>Indicates whether session persistence is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
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
             * <p>The method used to handle cookies. Valid values:</p>
             * <ul>
             * <li><strong>Insert</strong>: Insert a cookie. When a client accesses the service for the first time, the load balancing inserts a cookie (that is, inserts SERVERID into the HTTP or HTTPS response message). The next time the client accesses the service with this cookie, the load balancing service forwards the request to the previously recorded backend server.</li>
             * <li><strong>Server</strong>: Rewrite a cookie. When the load balancing detects a user-defined cookie, it rewrites the original cookie. The next time the client accesses the service with the new cookie, the load balancing service forwards the request to the previously recorded backend server.</li>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            private Builder() {
            } 

            private Builder(UchConfig model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The parameter type. Only QueryString is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>QueryString</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The consistent hash parameter value.</p>
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

        @com.aliyun.core.annotation.NameInMap("CrossZoneEnabled")
        private Boolean crossZoneEnabled;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConfig")
        private HealthCheckConfig healthCheckConfig;

        @com.aliyun.core.annotation.NameInMap("IpVersionAffinityMode")
        private String ipVersionAffinityMode;

        @com.aliyun.core.annotation.NameInMap("Ipv6Enabled")
        private Boolean ipv6Enabled;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RelatedLoadBalancerIds")
        private java.util.List<String> relatedLoadBalancerIds;

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
        private java.util.List<Tags> tags;

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
            this.crossZoneEnabled = builder.crossZoneEnabled;
            this.healthCheckConfig = builder.healthCheckConfig;
            this.ipVersionAffinityMode = builder.ipVersionAffinityMode;
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
         * @return crossZoneEnabled
         */
        public Boolean getCrossZoneEnabled() {
            return this.crossZoneEnabled;
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
         * @return relatedLoadBalancerIds
         */
        public java.util.List<String> getRelatedLoadBalancerIds() {
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
        public java.util.List<Tags> getTags() {
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
            private Boolean crossZoneEnabled; 
            private HealthCheckConfig healthCheckConfig; 
            private String ipVersionAffinityMode; 
            private Boolean ipv6Enabled; 
            private String protocol; 
            private java.util.List<String> relatedLoadBalancerIds; 
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
            private java.util.List<Tags> tags; 
            private UchConfig uchConfig; 
            private Boolean upstreamKeepaliveEnabled; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(ServerGroups model) {
                this.configManagedEnabled = model.configManagedEnabled;
                this.connectionDrainConfig = model.connectionDrainConfig;
                this.createTime = model.createTime;
                this.crossZoneEnabled = model.crossZoneEnabled;
                this.healthCheckConfig = model.healthCheckConfig;
                this.ipVersionAffinityMode = model.ipVersionAffinityMode;
                this.ipv6Enabled = model.ipv6Enabled;
                this.protocol = model.protocol;
                this.relatedLoadBalancerIds = model.relatedLoadBalancerIds;
                this.resourceGroupId = model.resourceGroupId;
                this.scheduler = model.scheduler;
                this.serverCount = model.serverCount;
                this.serverGroupId = model.serverGroupId;
                this.serverGroupName = model.serverGroupName;
                this.serverGroupStatus = model.serverGroupStatus;
                this.serverGroupType = model.serverGroupType;
                this.serviceName = model.serviceName;
                this.slowStartConfig = model.slowStartConfig;
                this.stickySessionConfig = model.stickySessionConfig;
                this.tags = model.tags;
                this.uchConfig = model.uchConfig;
                this.upstreamKeepaliveEnabled = model.upstreamKeepaliveEnabled;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>Indicates whether configuration management is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
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
             * <p>The graceful connection break configuration.</p>
             * <p>When graceful connection break is enabled, load balancing allows existing connections to be transmitted normally within a specified period after a backend server is removed or a health check failed.</p>
             * <blockquote>
             * <ul>
             * <li>Graceful connection break is not supported by Basic Edition instances. Only Standard Edition and WAF Enhanced Edition instances support this feature.</li>
             * <li>Graceful connection break is supported by server groups of the server type and IP type, but not by server groups of the Function Compute type.</li>
             * </ul>
             * </blockquote>
             */
            public Builder connectionDrainConfig(ConnectionDrainConfig connectionDrainConfig) {
                this.connectionDrainConfig = connectionDrainConfig;
                return this;
            }

            /**
             * <p>The time when the resource was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-02T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies whether to enable cross-zone load balancing for the server group. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled. This is the default value.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder crossZoneEnabled(Boolean crossZoneEnabled) {
                this.crossZoneEnabled = crossZoneEnabled;
                return this;
            }

            /**
             * <p>The health check configuration.</p>
             */
            public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
                this.healthCheckConfig = healthCheckConfig;
                return this;
            }

            /**
             * <p>The IP version affinity mode. Valid values:</p>
             * <ul>
             * <li>NonAffinity: No affinity mode. This is the default value.</li>
             * <li>Affinity: Affinity mode.</li>
             * </ul>
             * <p>This parameter takes effect only when Ipv6Enabled is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>Affinity</p>
             */
            public Builder ipVersionAffinityMode(String ipVersionAffinityMode) {
                this.ipVersionAffinityMode = ipVersionAffinityMode;
                return this;
            }

            /**
             * <p>Indicates whether the IP protocol version used by the load balancing to forward traffic to the backend server group supports IPv6. Valid values:</p>
             * <ul>
             * <li><strong>false</strong> (default): IPv6 is not supported. For the IPv4 type, only IPv4 backend servers can be added.</li>
             * <li><strong>true</strong>: Dual-stack type. Both IPv4 and IPv6 backend servers can be added.</li>
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
             * <p>The backend protocol type. Valid values:</p>
             * <ul>
             * <li><p><strong>HTTP</strong>: Supports association with HTTPS, HTTP, and QUIC listeners.</p>
             * </li>
             * <li><p><strong>HTTPS</strong>: Supports association with HTTPS listeners.</p>
             * </li>
             * <li><p><strong>GRPC</strong>: Supports association with HTTPS and QUIC listeners.</p>
             * </li>
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
             * <p>The IDs of the associated instances.</p>
             */
            public Builder relatedLoadBalancerIds(java.util.List<String> relatedLoadBalancerIds) {
                this.relatedLoadBalancerIds = relatedLoadBalancerIds;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
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
             * <li><strong>Wrr</strong>: Weighted round-robin. Backend servers with higher weights are more likely to be polled.</li>
             * <li><strong>Wlc</strong>: Weighted least connections. In addition to the weight of each backend server, the actual load (number of connections) is also considered. When weights are the same, backend servers with fewer current connections are more likely to be polled.</li>
             * <li><strong>Sch</strong>: Consistent hashing. Requests with the same hash factor calculation result are scheduled to the same backend server. If the UchConfig parameter is not configured, the default hash factor is the source IP address, and requests from the same source IP address are distributed to the same backend server. If the UchConfig parameter is configured, the hash factor is the URL parameter, and requests with the same URL parameter are distributed to the same backend server.</li>
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
             * <p>The number of servers in the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serverCount(Integer serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * <p>The ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-cige6j****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The name of the server group.</p>
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
             * <li><p><strong>Creating</strong>: The server group is being created.</p>
             * </li>
             * <li><p><strong>Available</strong>: The server group is available.</p>
             * </li>
             * <li><p><strong>Configuring</strong>: The server group is being reconfigured.</p>
             * </li>
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
             * <p>The type of the server group. Valid values:</p>
             * <ul>
             * <li><p><strong>Instance</strong>: Server type, including ECS, ENI, and ECI instances.</p>
             * </li>
             * <li><p><strong>Ip</strong>: IP address type.</p>
             * </li>
             * <li><p><strong>Fc</strong>: Function Compute type.</p>
             * </li>
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
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The slow start configuration.</p>
             * <p>After slow start is enabled, newly added backend servers in the backend server group are warmed up within a specified period, and the number of requests forwarded to the servers increases linearly.</p>
             * <blockquote>
             * <ul>
             * <li>Slow start is not supported by Basic Edition instances. Only Standard Edition and WAF Enhanced Edition instances support this feature.</li>
             * <li>Slow start can be configured for server groups of the server type and IP type, but not for server groups of the Function Compute type.</li>
             * <li>Slow start can be enabled only when the backend scheduling algorithm is set to the weighted polling algorithm.</li>
             * </ul>
             * </blockquote>
             */
            public Builder slowStartConfig(SlowStartConfig slowStartConfig) {
                this.slowStartConfig = slowStartConfig;
                return this;
            }

            /**
             * <p>The session persistence configuration.</p>
             */
            public Builder stickySessionConfig(StickySessionConfig stickySessionConfig) {
                this.stickySessionConfig = stickySessionConfig;
                return this;
            }

            /**
             * <p>The list of tags bound to the server group.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The URL consistent hash parameter settings.</p>
             */
            public Builder uchConfig(UchConfig uchConfig) {
                this.uchConfig = uchConfig;
                return this;
            }

            /**
             * <p>Indicates whether upstream keep-alive is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
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
             * <p>The VPC-connected instance ID.</p>
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
