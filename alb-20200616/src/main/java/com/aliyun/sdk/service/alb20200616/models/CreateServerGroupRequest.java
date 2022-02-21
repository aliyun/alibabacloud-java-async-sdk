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
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateServerGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.healthCheckConfig = response.healthCheckConfig;
            this.protocol = response.protocol;
            this.resourceGroupId = response.resourceGroupId;
            this.scheduler = response.scheduler;
            this.serverGroupName = response.serverGroupName;
            this.serverGroupType = response.serverGroupType;
            this.serviceName = response.serviceName;
            this.stickySessionConfig = response.stickySessionConfig;
            this.vpcId = response.vpcId;
        } 

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 健康检查配置
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * 后端协议类型
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * 资源组id
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 调度策略
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * 服务器组名称
         */
        public Builder serverGroupName(String serverGroupName) {
            this.putQueryParameter("ServerGroupName", serverGroupName);
            this.serverGroupName = serverGroupName;
            return this;
        }

        /**
         * 服务器组类型
         */
        public Builder serverGroupType(String serverGroupType) {
            this.putQueryParameter("ServerGroupType", serverGroupType);
            this.serverGroupType = serverGroupType;
            return this;
        }

        /**
         * 服务器名称
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 会话保持配置
         */
        public Builder stickySessionConfig(StickySessionConfig stickySessionConfig) {
            this.putQueryParameter("StickySessionConfig", stickySessionConfig);
            this.stickySessionConfig = stickySessionConfig;
            return this;
        }

        /**
         * VpcId
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
             * 健康检查正常的状态码
             */
            public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * 健康检查端口
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
             * 健康检查域名
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * 健康检查HTTP协议版本
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * 健康检查间隔
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * 健康检查方法
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * 健康检查Path
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * 健康检查协议类型
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * 健康检查超时时间
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * 健康检查成功判定阈值
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * 健康检查不成功判定阈值
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
             * 服务器上配置的Cookie
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * 服务器上配置的Cookie
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * 是否启用会话保持
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
}
