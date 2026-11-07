// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data overview.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is processed successfully.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8BD1E58D-0755-42AC-A599-E6B55112EC53</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The request was successful.</p>
         * </li>
         * <li><p><code>false</code>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryConfigResponseBody build() {
            return new QueryConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConfigResponseBody</p>
     */
    public static class FencePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabledModules")
        private java.util.List<String> enabledModules;

        @com.aliyun.core.annotation.NameInMap("interceptPolicy")
        private java.util.Map<String, String> interceptPolicy;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        private FencePolicy(Builder builder) {
            this.enabledModules = builder.enabledModules;
            this.interceptPolicy = builder.interceptPolicy;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FencePolicy create() {
            return builder().build();
        }

        /**
         * @return enabledModules
         */
        public java.util.List<String> getEnabledModules() {
            return this.enabledModules;
        }

        /**
         * @return interceptPolicy
         */
        public java.util.Map<String, String> getInterceptPolicy() {
            return this.interceptPolicy;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List<String> enabledModules; 
            private java.util.Map<String, String> interceptPolicy; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(FencePolicy model) {
                this.enabledModules = model.enabledModules;
                this.interceptPolicy = model.interceptPolicy;
                this.serviceName = model.serviceName;
            } 

            /**
             * enabledModules.
             */
            public Builder enabledModules(java.util.List<String> enabledModules) {
                this.enabledModules = enabledModules;
                return this;
            }

            /**
             * interceptPolicy.
             */
            public Builder interceptPolicy(java.util.Map<String, String> interceptPolicy) {
                this.interceptPolicy = interceptPolicy;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FencePolicy build() {
                return new FencePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConfigResponseBody</p>
     */
    public static class NacosRunningEnv extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("emptyProtect")
        private Boolean emptyProtect;

        @com.aliyun.core.annotation.NameInMap("fenceEnabled")
        private Boolean fenceEnabled;

        @com.aliyun.core.annotation.NameInMap("fencePolicy")
        private FencePolicy fencePolicy;

        @com.aliyun.core.annotation.NameInMap("grayAuth")
        private String grayAuth;

        private NacosRunningEnv(Builder builder) {
            this.emptyProtect = builder.emptyProtect;
            this.fenceEnabled = builder.fenceEnabled;
            this.fencePolicy = builder.fencePolicy;
            this.grayAuth = builder.grayAuth;
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

        /**
         * @return fenceEnabled
         */
        public Boolean getFenceEnabled() {
            return this.fenceEnabled;
        }

        /**
         * @return fencePolicy
         */
        public FencePolicy getFencePolicy() {
            return this.fencePolicy;
        }

        /**
         * @return grayAuth
         */
        public String getGrayAuth() {
            return this.grayAuth;
        }

        public static final class Builder {
            private Boolean emptyProtect; 
            private Boolean fenceEnabled; 
            private FencePolicy fencePolicy; 
            private String grayAuth; 

            private Builder() {
            } 

            private Builder(NacosRunningEnv model) {
                this.emptyProtect = model.emptyProtect;
                this.fenceEnabled = model.fenceEnabled;
                this.fencePolicy = model.fencePolicy;
                this.grayAuth = model.grayAuth;
            } 

            /**
             * <p>The switch for push-empty protection.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder emptyProtect(Boolean emptyProtect) {
                this.emptyProtect = emptyProtect;
                return this;
            }

            /**
             * fenceEnabled.
             */
            public Builder fenceEnabled(Boolean fenceEnabled) {
                this.fenceEnabled = fenceEnabled;
                return this;
            }

            /**
             * fencePolicy.
             */
            public Builder fencePolicy(FencePolicy fencePolicy) {
                this.fencePolicy = fencePolicy;
                return this;
            }

            /**
             * grayAuth.
             */
            public Builder grayAuth(String grayAuth) {
                this.grayAuth = grayAuth;
                return this;
            }

            public NacosRunningEnv build() {
                return new NacosRunningEnv(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthEnabled")
        private Boolean authEnabled;

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

        @com.aliyun.core.annotation.NameInMap("Enable4lw")
        private Boolean enable4lw;

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

        @com.aliyun.core.annotation.NameInMap("PrometheusSdProtocolEnabled")
        private String prometheusSdProtocolEnabled;

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
            this.authEnabled = builder.authEnabled;
            this.autopurgePurgeInterval = builder.autopurgePurgeInterval;
            this.autopurgeSnapRetainCount = builder.autopurgeSnapRetainCount;
            this.clusterName = builder.clusterName;
            this.configAuthEnabled = builder.configAuthEnabled;
            this.configAuthSupported = builder.configAuthSupported;
            this.configContentLimit = builder.configContentLimit;
            this.configSecretEnabled = builder.configSecretEnabled;
            this.configSecretSupported = builder.configSecretSupported;
            this.consoleUIEnabled = builder.consoleUIEnabled;
            this.enable4lw = builder.enable4lw;
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
            this.prometheusSdProtocolEnabled = builder.prometheusSdProtocolEnabled;
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
         * @return authEnabled
         */
        public Boolean getAuthEnabled() {
            return this.authEnabled;
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
         * @return enable4lw
         */
        public Boolean getEnable4lw() {
            return this.enable4lw;
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
         * @return prometheusSdProtocolEnabled
         */
        public String getPrometheusSdProtocolEnabled() {
            return this.prometheusSdProtocolEnabled;
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
            private Boolean authEnabled; 
            private String autopurgePurgeInterval; 
            private String autopurgeSnapRetainCount; 
            private String clusterName; 
            private Boolean configAuthEnabled; 
            private Boolean configAuthSupported; 
            private Long configContentLimit; 
            private Boolean configSecretEnabled; 
            private Boolean configSecretSupported; 
            private Boolean consoleUIEnabled; 
            private Boolean enable4lw; 
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
            private String prometheusSdProtocolEnabled; 
            private Boolean restartFlag; 
            private String snapshotCount; 
            private String syncLimit; 
            private Boolean TLSEnabled; 
            private String tickTime; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authEnabled = model.authEnabled;
                this.autopurgePurgeInterval = model.autopurgePurgeInterval;
                this.autopurgeSnapRetainCount = model.autopurgeSnapRetainCount;
                this.clusterName = model.clusterName;
                this.configAuthEnabled = model.configAuthEnabled;
                this.configAuthSupported = model.configAuthSupported;
                this.configContentLimit = model.configContentLimit;
                this.configSecretEnabled = model.configSecretEnabled;
                this.configSecretSupported = model.configSecretSupported;
                this.consoleUIEnabled = model.consoleUIEnabled;
                this.enable4lw = model.enable4lw;
                this.eurekaSupported = model.eurekaSupported;
                this.extendedTypesEnable = model.extendedTypesEnable;
                this.initLimit = model.initLimit;
                this.juteMaxbuffer = model.juteMaxbuffer;
                this.jvmFlagsCustom = model.jvmFlagsCustom;
                this.MCPEnabled = model.MCPEnabled;
                this.MCPSupported = model.MCPSupported;
                this.maxClientCnxns = model.maxClientCnxns;
                this.maxSessionTimeout = model.maxSessionTimeout;
                this.minSessionTimeout = model.minSessionTimeout;
                this.nacosRunningEnv = model.nacosRunningEnv;
                this.namingAuthEnabled = model.namingAuthEnabled;
                this.namingAuthSupported = model.namingAuthSupported;
                this.namingCreateServiceSupported = model.namingCreateServiceSupported;
                this.openSuperAcl = model.openSuperAcl;
                this.passWord = model.passWord;
                this.prometheusSdProtocolEnabled = model.prometheusSdProtocolEnabled;
                this.restartFlag = model.restartFlag;
                this.snapshotCount = model.snapshotCount;
                this.syncLimit = model.syncLimit;
                this.TLSEnabled = model.TLSEnabled;
                this.tickTime = model.tickTime;
                this.userName = model.userName;
            } 

            /**
             * <p>The switch for ZooKeeper SASL-based forced identity authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authEnabled(Boolean authEnabled) {
                this.authEnabled = authEnabled;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder autopurgePurgeInterval(String autopurgePurgeInterval) {
                this.autopurgePurgeInterval = autopurgePurgeInterval;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder autopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
                this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The Nacos configuration. This parameter indicates whether RAM authentication is enabled for the configuration center. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: enabled</p>
             * </li>
             * <li><p><code>false</code>: disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder configAuthEnabled(Boolean configAuthEnabled) {
                this.configAuthEnabled = configAuthEnabled;
                return this;
            }

            /**
             * <p>The Nacos configuration. This parameter indicates whether the configuration center of the current cluster supports RAM authentication. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: supported</p>
             * </li>
             * <li><p><code>false</code>: not supported</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder configAuthSupported(Boolean configAuthSupported) {
                this.configAuthSupported = configAuthSupported;
                return this;
            }

            /**
             * <p>The maximum size of the content of a single configuration. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder configContentLimit(Long configContentLimit) {
                this.configContentLimit = configContentLimit;
                return this;
            }

            /**
             * <p>The Nacos configuration. This parameter indicates whether configuration encryption is enabled for the cluster. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: enabled</p>
             * </li>
             * <li><p><code>false</code>: disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder configSecretEnabled(Boolean configSecretEnabled) {
                this.configSecretEnabled = configSecretEnabled;
                return this;
            }

            /**
             * <p>The Nacos configuration. This parameter indicates whether the cluster supports configuration encryption. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: supported</p>
             * </li>
             * <li><p><code>false</code>: not supported</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder configSecretSupported(Boolean configSecretSupported) {
                this.configSecretSupported = configSecretSupported;
                return this;
            }

            /**
             * <p>Specifies whether to enable the Nacos open source console.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder consoleUIEnabled(Boolean consoleUIEnabled) {
                this.consoleUIEnabled = consoleUIEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable the four-letter words command.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable4lw(Boolean enable4lw) {
                this.enable4lw = enable4lw;
                return this;
            }

            /**
             * <p>Specifies whether to enable port 8761 for access to the Eureka protocol. If you disable this port, applications cannot use the Eureka protocol for service registration and discovery.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder eurekaSupported(Boolean eurekaSupported) {
                this.eurekaSupported = eurekaSupported;
                return this;
            }

            /**
             * <p>The ZooKeeper parameter that specifies whether to enable the TTL configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder extendedTypesEnable(Boolean extendedTypesEnable) {
                this.extendedTypesEnable = extendedTypesEnable;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration. This parameter indicates the maximum connection duration of an instance. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder initLimit(String initLimit) {
                this.initLimit = initLimit;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration. This parameter indicates the maximum data size of each node. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder juteMaxbuffer(String juteMaxbuffer) {
                this.juteMaxbuffer = juteMaxbuffer;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder jvmFlagsCustom(String jvmFlagsCustom) {
                this.jvmFlagsCustom = jvmFlagsCustom;
                return this;
            }

            /**
             * <p>The Nacos configuration. This parameter indicates whether Mesh Configuration Protocol (MCP) is enabled. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: enabled</p>
             * </li>
             * <li><p><code>false</code>: disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder MCPEnabled(Boolean MCPEnabled) {
                this.MCPEnabled = MCPEnabled;
                return this;
            }

            /**
             * <p>The Nacos configuration. This parameter indicates whether MCP is supported. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: supported</p>
             * </li>
             * <li><p><code>false</code>: not supported</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder MCPSupported(Boolean MCPSupported) {
                this.MCPSupported = MCPSupported;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration. This parameter indicates the number of connections between a client and a server.<br>
             * If this parameter is set to 0, no limit is imposed.<br></p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxClientCnxns(String maxClientCnxns) {
                this.maxClientCnxns = maxClientCnxns;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration. This parameter indicates the maximum timeout duration.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder maxSessionTimeout(String maxSessionTimeout) {
                this.maxSessionTimeout = maxSessionTimeout;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration. This parameter indicates the minimum timeout duration.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder minSessionTimeout(String minSessionTimeout) {
                this.minSessionTimeout = minSessionTimeout;
                return this;
            }

            /**
             * <p>The runtime configuration of Nacos.</p>
             */
            public Builder nacosRunningEnv(NacosRunningEnv nacosRunningEnv) {
                this.nacosRunningEnv = nacosRunningEnv;
                return this;
            }

            /**
             * <p>The Nacos configuration. This parameter indicates whether RAM authentication is enabled for the service registry. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: enabled</p>
             * </li>
             * <li><p><code>false</code>: disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder namingAuthEnabled(Boolean namingAuthEnabled) {
                this.namingAuthEnabled = namingAuthEnabled;
                return this;
            }

            /**
             * <p>The Nacos configuration. This parameter indicates whether the cluster supports RAM authentication for services. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: supported</p>
             * </li>
             * <li><p><code>false</code>: not supported</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder namingAuthSupported(Boolean namingAuthSupported) {
                this.namingAuthSupported = namingAuthSupported;
                return this;
            }

            /**
             * <p>The Nacos configuration. This parameter indicates whether the cluster supports service creation. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: supported</p>
             * </li>
             * <li><p><code>false</code>: not supported</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder namingCreateServiceSupported(Boolean namingCreateServiceSupported) {
                this.namingCreateServiceSupported = namingCreateServiceSupported;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration. This parameter indicates whether the super permission is enabled. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: enabled</p>
             * </li>
             * <li><p><code>false</code>: disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder openSuperAcl(Boolean openSuperAcl) {
                this.openSuperAcl = openSuperAcl;
                return this;
            }

            /**
             * <p>The password. This parameter is returned only when OpenSuperAcl is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder passWord(String passWord) {
                this.passWord = passWord;
                return this;
            }

            /**
             * PrometheusSdProtocolEnabled.
             */
            public Builder prometheusSdProtocolEnabled(String prometheusSdProtocolEnabled) {
                this.prometheusSdProtocolEnabled = prometheusSdProtocolEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the cluster is restarted and the new configuration is applied. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: The cluster is restarted.</p>
             * </li>
             * <li><p><code>false</code>: The cluster fails to be restarted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder restartFlag(Boolean restartFlag) {
                this.restartFlag = restartFlag;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration. This parameter indicates the frequency of generating snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder snapshotCount(String snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration. This parameter indicates the connection timeout duration of an instance. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder syncLimit(String syncLimit) {
                this.syncLimit = syncLimit;
                return this;
            }

            /**
             * <p>MSE Nacos instances of version 2.1.2.1 or later support Transport Layer Security (TLS) encryption. The version of the Nacos client must be 2.2.1 or later. After you enable TLS, the performance may decrease by about 10%. You must evaluate the system capacity. For more information about the operations, see Nacos TLS transport encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder TLSEnabled(Boolean TLSEnabled) {
                this.TLSEnabled = TLSEnabled;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration. This parameter indicates a unit of time in the engine. The default value is 2000. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder tickTime(String tickTime) {
                this.tickTime = tickTime;
                return this;
            }

            /**
             * <p>The username. This parameter is returned only when OpenSuperAcl is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
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
