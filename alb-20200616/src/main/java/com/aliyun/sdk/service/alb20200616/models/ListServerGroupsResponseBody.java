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
         * 本次查询返回记录数量
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务器组
         */
        public Builder serverGroups(java.util.List < ServerGroups> serverGroups) {
            this.serverGroups = serverGroups;
            return this;
        }

        /**
         * 总记录数
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
             * 状态码
             */
            public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * 端口
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * 是否启用健康检查
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * 域名
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * 版本
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * 间隔时间
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * 方法
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * uri
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * 协议
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * 超时时间
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * 健康阈值
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * 不健康阈值
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
             * Cookie
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * Cookie超时时间
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * 是否开启会话保持
             */
            public Builder stickySessionEnabled(Boolean stickySessionEnabled) {
                this.stickySessionEnabled = stickySessionEnabled;
                return this;
            }

            /**
             * 会话保持类型
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
             * 标签键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值
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
    public static class ServerGroups extends TeaModel {
        @NameInMap("ConfigManagedEnabled")
        private Boolean configManagedEnabled;

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

        @NameInMap("UpstreamKeepaliveEnabled")
        private Boolean upstreamKeepaliveEnabled;

        @NameInMap("VpcId")
        private String vpcId;

        private ServerGroups(Builder builder) {
            this.configManagedEnabled = builder.configManagedEnabled;
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
            private Boolean upstreamKeepaliveEnabled; 
            private String vpcId; 

            /**
             * 是否开启配置管理
             */
            public Builder configManagedEnabled(Boolean configManagedEnabled) {
                this.configManagedEnabled = configManagedEnabled;
                return this;
            }

            /**
             * 健康检查配置
             */
            public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
                this.healthCheckConfig = healthCheckConfig;
                return this;
            }

            /**
             * 是否支持Ipv6
             */
            public Builder ipv6Enabled(Boolean ipv6Enabled) {
                this.ipv6Enabled = ipv6Enabled;
                return this;
            }

            /**
             * 服务器组协议
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * 资源组id
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * 调度策略
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * 服务器组内服务器数量
             */
            public Builder serverCount(Integer serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * 服务器组Id
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * 服务器组名称
             */
            public Builder serverGroupName(String serverGroupName) {
                this.serverGroupName = serverGroupName;
                return this;
            }

            /**
             * 服务器组状态
             */
            public Builder serverGroupStatus(String serverGroupStatus) {
                this.serverGroupStatus = serverGroupStatus;
                return this;
            }

            /**
             * 服务器组类型
             */
            public Builder serverGroupType(String serverGroupType) {
                this.serverGroupType = serverGroupType;
                return this;
            }

            /**
             * 服务器名称
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * 会话保持配置
             */
            public Builder stickySessionConfig(StickySessionConfig stickySessionConfig) {
                this.stickySessionConfig = stickySessionConfig;
                return this;
            }

            /**
             * 标签列表
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * 是否开启后端长链接
             */
            public Builder upstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
                this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
                return this;
            }

            /**
             * 服务器组所在VpcId
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
