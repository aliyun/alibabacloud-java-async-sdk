// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConfigResponseBody</p>
 */
public class QueryConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryConfigResponseBody build() {
            return new QueryConfigResponseBody(this);
        } 

    } 

    public static class NacosRunningEnv extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("emptyProtect")
        private Boolean emptyProtect;

        private NacosRunningEnv(Builder builder) {
            this.emptyProtect = builder.emptyProtect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NacosRunningEnv create() {
            return builder().build();
        }

        /**
         * @return emptyProtect
         */
        public Boolean getEmptyProtect() {
            return this.emptyProtect;
        }

        public static final class Builder {
            private Boolean emptyProtect; 

            /**
             * Indicates whether empty list protection is enabled.
             */
            public Builder emptyProtect(Boolean emptyProtect) {
                this.emptyProtect = emptyProtect;
                return this;
            }

            public NacosRunningEnv build() {
                return new NacosRunningEnv(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutopurgePurgeInterval")
        private String autopurgePurgeInterval;

        @com.aliyun.core.annotation.NameInMap("AutopurgeSnapRetainCount")
        private String autopurgeSnapRetainCount;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ConfigAuthEnabled")
        private Boolean configAuthEnabled;

        @com.aliyun.core.annotation.NameInMap("ConfigAuthSupported")
        private Boolean configAuthSupported;

        @com.aliyun.core.annotation.NameInMap("ConfigContentLimit")
        private Long configContentLimit;

        @com.aliyun.core.annotation.NameInMap("ConfigSecretEnabled")
        private Boolean configSecretEnabled;

        @com.aliyun.core.annotation.NameInMap("ConfigSecretSupported")
        private Boolean configSecretSupported;

        @com.aliyun.core.annotation.NameInMap("ConsoleUIEnabled")
        private Boolean consoleUIEnabled;

        @com.aliyun.core.annotation.NameInMap("EurekaSupported")
        private Boolean eurekaSupported;

        @com.aliyun.core.annotation.NameInMap("ExtendedTypesEnable")
        private Boolean extendedTypesEnable;

        @com.aliyun.core.annotation.NameInMap("InitLimit")
        private String initLimit;

        @com.aliyun.core.annotation.NameInMap("JuteMaxbuffer")
        private String juteMaxbuffer;

        @com.aliyun.core.annotation.NameInMap("JvmFlagsCustom")
        private String jvmFlagsCustom;

        @com.aliyun.core.annotation.NameInMap("MCPEnabled")
        private Boolean MCPEnabled;

        @com.aliyun.core.annotation.NameInMap("MCPSupported")
        private Boolean MCPSupported;

        @com.aliyun.core.annotation.NameInMap("MaxClientCnxns")
        private String maxClientCnxns;

        @com.aliyun.core.annotation.NameInMap("MaxSessionTimeout")
        private String maxSessionTimeout;

        @com.aliyun.core.annotation.NameInMap("MinSessionTimeout")
        private String minSessionTimeout;

        @com.aliyun.core.annotation.NameInMap("NacosRunningEnv")
        private NacosRunningEnv nacosRunningEnv;

        @com.aliyun.core.annotation.NameInMap("NamingAuthEnabled")
        private Boolean namingAuthEnabled;

        @com.aliyun.core.annotation.NameInMap("NamingAuthSupported")
        private Boolean namingAuthSupported;

        @com.aliyun.core.annotation.NameInMap("NamingCreateServiceSupported")
        private Boolean namingCreateServiceSupported;

        @com.aliyun.core.annotation.NameInMap("OpenSuperAcl")
        private Boolean openSuperAcl;

        @com.aliyun.core.annotation.NameInMap("PassWord")
        private String passWord;

        @com.aliyun.core.annotation.NameInMap("RestartFlag")
        private Boolean restartFlag;

        @com.aliyun.core.annotation.NameInMap("SnapshotCount")
        private String snapshotCount;

        @com.aliyun.core.annotation.NameInMap("SyncLimit")
        private String syncLimit;

        @com.aliyun.core.annotation.NameInMap("TLSEnabled")
        private Boolean TLSEnabled;

        @com.aliyun.core.annotation.NameInMap("TickTime")
        private String tickTime;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.autopurgePurgeInterval = builder.autopurgePurgeInterval;
            this.autopurgeSnapRetainCount = builder.autopurgeSnapRetainCount;
            this.clusterName = builder.clusterName;
            this.configAuthEnabled = builder.configAuthEnabled;
            this.configAuthSupported = builder.configAuthSupported;
            this.configContentLimit = builder.configContentLimit;
            this.configSecretEnabled = builder.configSecretEnabled;
            this.configSecretSupported = builder.configSecretSupported;
            this.consoleUIEnabled = builder.consoleUIEnabled;
            this.eurekaSupported = builder.eurekaSupported;
            this.extendedTypesEnable = builder.extendedTypesEnable;
            this.initLimit = builder.initLimit;
            this.juteMaxbuffer = builder.juteMaxbuffer;
            this.jvmFlagsCustom = builder.jvmFlagsCustom;
            this.MCPEnabled = builder.MCPEnabled;
            this.MCPSupported = builder.MCPSupported;
            this.maxClientCnxns = builder.maxClientCnxns;
            this.maxSessionTimeout = builder.maxSessionTimeout;
            this.minSessionTimeout = builder.minSessionTimeout;
            this.nacosRunningEnv = builder.nacosRunningEnv;
            this.namingAuthEnabled = builder.namingAuthEnabled;
            this.namingAuthSupported = builder.namingAuthSupported;
            this.namingCreateServiceSupported = builder.namingCreateServiceSupported;
            this.openSuperAcl = builder.openSuperAcl;
            this.passWord = builder.passWord;
            this.restartFlag = builder.restartFlag;
            this.snapshotCount = builder.snapshotCount;
            this.syncLimit = builder.syncLimit;
            this.TLSEnabled = builder.TLSEnabled;
            this.tickTime = builder.tickTime;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autopurgePurgeInterval
         */
        public String getAutopurgePurgeInterval() {
            return this.autopurgePurgeInterval;
        }

        /**
         * @return autopurgeSnapRetainCount
         */
        public String getAutopurgeSnapRetainCount() {
            return this.autopurgeSnapRetainCount;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return configAuthEnabled
         */
        public Boolean getConfigAuthEnabled() {
            return this.configAuthEnabled;
        }

        /**
         * @return configAuthSupported
         */
        public Boolean getConfigAuthSupported() {
            return this.configAuthSupported;
        }

        /**
         * @return configContentLimit
         */
        public Long getConfigContentLimit() {
            return this.configContentLimit;
        }

        /**
         * @return configSecretEnabled
         */
        public Boolean getConfigSecretEnabled() {
            return this.configSecretEnabled;
        }

        /**
         * @return configSecretSupported
         */
        public Boolean getConfigSecretSupported() {
            return this.configSecretSupported;
        }

        /**
         * @return consoleUIEnabled
         */
        public Boolean getConsoleUIEnabled() {
            return this.consoleUIEnabled;
        }

        /**
         * @return eurekaSupported
         */
        public Boolean getEurekaSupported() {
            return this.eurekaSupported;
        }

        /**
         * @return extendedTypesEnable
         */
        public Boolean getExtendedTypesEnable() {
            return this.extendedTypesEnable;
        }

        /**
         * @return initLimit
         */
        public String getInitLimit() {
            return this.initLimit;
        }

        /**
         * @return juteMaxbuffer
         */
        public String getJuteMaxbuffer() {
            return this.juteMaxbuffer;
        }

        /**
         * @return jvmFlagsCustom
         */
        public String getJvmFlagsCustom() {
            return this.jvmFlagsCustom;
        }

        /**
         * @return MCPEnabled
         */
        public Boolean getMCPEnabled() {
            return this.MCPEnabled;
        }

        /**
         * @return MCPSupported
         */
        public Boolean getMCPSupported() {
            return this.MCPSupported;
        }

        /**
         * @return maxClientCnxns
         */
        public String getMaxClientCnxns() {
            return this.maxClientCnxns;
        }

        /**
         * @return maxSessionTimeout
         */
        public String getMaxSessionTimeout() {
            return this.maxSessionTimeout;
        }

        /**
         * @return minSessionTimeout
         */
        public String getMinSessionTimeout() {
            return this.minSessionTimeout;
        }

        /**
         * @return nacosRunningEnv
         */
        public NacosRunningEnv getNacosRunningEnv() {
            return this.nacosRunningEnv;
        }

        /**
         * @return namingAuthEnabled
         */
        public Boolean getNamingAuthEnabled() {
            return this.namingAuthEnabled;
        }

        /**
         * @return namingAuthSupported
         */
        public Boolean getNamingAuthSupported() {
            return this.namingAuthSupported;
        }

        /**
         * @return namingCreateServiceSupported
         */
        public Boolean getNamingCreateServiceSupported() {
            return this.namingCreateServiceSupported;
        }

        /**
         * @return openSuperAcl
         */
        public Boolean getOpenSuperAcl() {
            return this.openSuperAcl;
        }

        /**
         * @return passWord
         */
        public String getPassWord() {
            return this.passWord;
        }

        /**
         * @return restartFlag
         */
        public Boolean getRestartFlag() {
            return this.restartFlag;
        }

        /**
         * @return snapshotCount
         */
        public String getSnapshotCount() {
            return this.snapshotCount;
        }

        /**
         * @return syncLimit
         */
        public String getSyncLimit() {
            return this.syncLimit;
        }

        /**
         * @return TLSEnabled
         */
        public Boolean getTLSEnabled() {
            return this.TLSEnabled;
        }

        /**
         * @return tickTime
         */
        public String getTickTime() {
            return this.tickTime;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String autopurgePurgeInterval; 
            private String autopurgeSnapRetainCount; 
            private String clusterName; 
            private Boolean configAuthEnabled; 
            private Boolean configAuthSupported; 
            private Long configContentLimit; 
            private Boolean configSecretEnabled; 
            private Boolean configSecretSupported; 
            private Boolean consoleUIEnabled; 
            private Boolean eurekaSupported; 
            private Boolean extendedTypesEnable; 
            private String initLimit; 
            private String juteMaxbuffer; 
            private String jvmFlagsCustom; 
            private Boolean MCPEnabled; 
            private Boolean MCPSupported; 
            private String maxClientCnxns; 
            private String maxSessionTimeout; 
            private String minSessionTimeout; 
            private NacosRunningEnv nacosRunningEnv; 
            private Boolean namingAuthEnabled; 
            private Boolean namingAuthSupported; 
            private Boolean namingCreateServiceSupported; 
            private Boolean openSuperAcl; 
            private String passWord; 
            private Boolean restartFlag; 
            private String snapshotCount; 
            private String syncLimit; 
            private Boolean TLSEnabled; 
            private String tickTime; 
            private String userName; 

            /**
             * A reserved parameter.
             */
            public Builder autopurgePurgeInterval(String autopurgePurgeInterval) {
                this.autopurgePurgeInterval = autopurgePurgeInterval;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder autopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
                this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * Indicates whether RAM authentication of a configuration center is enabled. This parameter is valid for Nacos instances. Valid values:
             * <p>
             * 
             * *   `true`: enabled.
             * *   `false`: disabled.
             */
            public Builder configAuthEnabled(Boolean configAuthEnabled) {
                this.configAuthEnabled = configAuthEnabled;
                return this;
            }

            /**
             * Indicates whether RAM authentication is supported by a configuration center of the instance. This parameter is valid for Nacos instances. Valid values:
             * <p>
             * 
             * *   `true`: supported.
             * *   `false`: not supported.
             */
            public Builder configAuthSupported(Boolean configAuthSupported) {
                this.configAuthSupported = configAuthSupported;
                return this;
            }

            /**
             * The maximum size of contents in a configuration. Unit: KB.
             */
            public Builder configContentLimit(Long configContentLimit) {
                this.configContentLimit = configContentLimit;
                return this;
            }

            /**
             * Indicates whether configuration encryption of a configuration center is enabled by the instance. This parameter is valid for Nacos instances. Valid values:
             * <p>
             * 
             * *   `true`: enabled.
             * *   `false`: disabled.
             */
            public Builder configSecretEnabled(Boolean configSecretEnabled) {
                this.configSecretEnabled = configSecretEnabled;
                return this;
            }

            /**
             * Indicates whether configuration encryption of a configuration center is supported by the instance. This parameter is valid for Nacos instances. Valid values:
             * <p>
             * 
             * *   `true`: supported.
             * *   `false`: not supported.
             */
            public Builder configSecretSupported(Boolean configSecretSupported) {
                this.configSecretSupported = configSecretSupported;
                return this;
            }

            /**
             * Indicates whether the Nacos open source console is enabled.
             */
            public Builder consoleUIEnabled(Boolean consoleUIEnabled) {
                this.consoleUIEnabled = consoleUIEnabled;
                return this;
            }

            /**
             * Indicates whether access port 8761 was enabled for Eureka. If this port is disabled, applications cannot use the Eureka protocol for service registration and discovery.
             */
            public Builder eurekaSupported(Boolean eurekaSupported) {
                this.eurekaSupported = eurekaSupported;
                return this;
            }

            /**
             * Indicates whether the time to live (TTL) configuration is enabled. This parameter is valid for ZooKeeper instances.
             */
            public Builder extendedTypesEnable(Boolean extendedTypesEnable) {
                this.extendedTypesEnable = extendedTypesEnable;
                return this;
            }

            /**
             * The maximum connection duration of the instance. Unit: seconds. This parameter is valid for ZooKeeper instances.
             */
            public Builder initLimit(String initLimit) {
                this.initLimit = initLimit;
                return this;
            }

            /**
             * The maximum amount of data on each node. This parameter is valid for ZooKeeper instances. Unit: bytes.
             */
            public Builder juteMaxbuffer(String juteMaxbuffer) {
                this.juteMaxbuffer = juteMaxbuffer;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder jvmFlagsCustom(String jvmFlagsCustom) {
                this.jvmFlagsCustom = jvmFlagsCustom;
                return this;
            }

            /**
             * Indicates whether Mesh Configuration Protocol (MCP) is enabled. This parameter is valid for Nacos instances. Valid values:
             * <p>
             * 
             * *   `true`: enabled.
             * *   `false`: disabled.
             */
            public Builder MCPEnabled(Boolean MCPEnabled) {
                this.MCPEnabled = MCPEnabled;
                return this;
            }

            /**
             * Indicates whether MCP is supported. This parameter is valid for Nacos instances. Valid values:
             * <p>
             * 
             * *   `true`: supported.
             * *   `false`: not supported.
             */
            public Builder MCPSupported(Boolean MCPSupported) {
                this.MCPSupported = MCPSupported;
                return this;
            }

            /**
             * The number of connections between a client and a server. This parameter is valid for ZooKeeper instances.\
             * <p>
             * If this parameter is set to 0, no limits are imposed on the number of connections.
             */
            public Builder maxClientCnxns(String maxClientCnxns) {
                this.maxClientCnxns = maxClientCnxns;
                return this;
            }

            /**
             * The maximum timeout period. This parameter is valid for ZooKeeper instances.
             */
            public Builder maxSessionTimeout(String maxSessionTimeout) {
                this.maxSessionTimeout = maxSessionTimeout;
                return this;
            }

            /**
             * The minimum timeout period. This parameter is valid for ZooKeeper instances.
             */
            public Builder minSessionTimeout(String minSessionTimeout) {
                this.minSessionTimeout = minSessionTimeout;
                return this;
            }

            /**
             * The runtime configuration of the Nacos instance.
             */
            public Builder nacosRunningEnv(NacosRunningEnv nacosRunningEnv) {
                this.nacosRunningEnv = nacosRunningEnv;
                return this;
            }

            /**
             * Indicates whether RAM authentication of a registry is enabled. This parameter is valid for Nacos instances. Valid values:
             * <p>
             * 
             * *   `true`: enabled.
             * *   `false`: disabled.
             */
            public Builder namingAuthEnabled(Boolean namingAuthEnabled) {
                this.namingAuthEnabled = namingAuthEnabled;
                return this;
            }

            /**
             * Indicates whether RAM authentication of services is supported by the instance. This parameter is valid for Nacos instances. Valid values:
             * <p>
             * 
             * *   `true`: supported.
             * *   `false`: not supported.
             */
            public Builder namingAuthSupported(Boolean namingAuthSupported) {
                this.namingAuthSupported = namingAuthSupported;
                return this;
            }

            /**
             * Indicates whether service creation is supported for the instance. This parameter is valid for Nacos instances. Valid values:
             * <p>
             * 
             * *   `true`: supported.
             * *   `false`: not supported.
             */
            public Builder namingCreateServiceSupported(Boolean namingCreateServiceSupported) {
                this.namingCreateServiceSupported = namingCreateServiceSupported;
                return this;
            }

            /**
             * Indicates whether super permissions are enabled. This parameter is valid for ZooKeeper instances. Valid values:
             * <p>
             * 
             * *   `true`: enabled.
             * *   `false`: disabled.
             */
            public Builder openSuperAcl(Boolean openSuperAcl) {
                this.openSuperAcl = openSuperAcl;
                return this;
            }

            /**
             * The password that corresponds to the username. This parameter is valid only if OpenSuperAcl is set to true.
             */
            public Builder passWord(String passWord) {
                this.passWord = passWord;
                return this;
            }

            /**
             * Indicates whether the instance was restarted and new configurations have taken effect. Valid values:
             * <p>
             * 
             * *   `true`: The restart was successful.
             * *   `false`: The restart failed.
             */
            public Builder restartFlag(Boolean restartFlag) {
                this.restartFlag = restartFlag;
                return this;
            }

            /**
             * The frequency for generating snapshots. This parameter is valid for ZooKeeper instances.
             */
            public Builder snapshotCount(String snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * The connection timeout period of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.
             */
            public Builder syncLimit(String syncLimit) {
                this.syncLimit = syncLimit;
                return this;
            }

            /**
             * MSE Nacos supports TLS transmission link encryption since version 2.1.2.1. Nacos clients must be upgraded to version 2.2.1 or later. After TLS is enabled, the system performance will decrease by about 10%. You must evaluate the system capacity. For more information about the relevant operations, see Nacos TLS transmission encryption.
             */
            public Builder TLSEnabled(Boolean TLSEnabled) {
                this.TLSEnabled = TLSEnabled;
                return this;
            }

            /**
             * The time unit of the engine. This parameter is valid for ZooKeeper instances. Default value: 2000. Unit: milliseconds.
             */
            public Builder tickTime(String tickTime) {
                this.tickTime = tickTime;
                return this;
            }

            /**
             * The username of the user. This parameter is valid only if OpenSuperAcl is set to true.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
