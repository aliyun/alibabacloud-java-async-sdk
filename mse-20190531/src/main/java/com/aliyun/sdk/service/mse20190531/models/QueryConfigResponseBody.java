// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConfigResponseBody</p>
 */
public class QueryConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("emptyProtect")
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
             * emptyProtect.
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
        @NameInMap("AutopurgePurgeInterval")
        private String autopurgePurgeInterval;

        @NameInMap("AutopurgeSnapRetainCount")
        private String autopurgeSnapRetainCount;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ConfigAuthEnabled")
        private Boolean configAuthEnabled;

        @NameInMap("ConfigAuthSupported")
        private Boolean configAuthSupported;

        @NameInMap("ConfigContentLimit")
        private Long configContentLimit;

        @NameInMap("ConfigSecretEnabled")
        private Boolean configSecretEnabled;

        @NameInMap("ConfigSecretSupported")
        private Boolean configSecretSupported;

        @NameInMap("InitLimit")
        private String initLimit;

        @NameInMap("JuteMaxbuffer")
        private String juteMaxbuffer;

        @NameInMap("JvmFlagsCustom")
        private String jvmFlagsCustom;

        @NameInMap("MCPEnabled")
        private Boolean MCPEnabled;

        @NameInMap("MCPSupported")
        private Boolean MCPSupported;

        @NameInMap("MaxClientCnxns")
        private String maxClientCnxns;

        @NameInMap("MaxSessionTimeout")
        private String maxSessionTimeout;

        @NameInMap("MinSessionTimeout")
        private String minSessionTimeout;

        @NameInMap("NacosRunningEnv")
        private NacosRunningEnv nacosRunningEnv;

        @NameInMap("NamingAuthEnabled")
        private Boolean namingAuthEnabled;

        @NameInMap("NamingAuthSupported")
        private Boolean namingAuthSupported;

        @NameInMap("NamingCreateServiceSupported")
        private Boolean namingCreateServiceSupported;

        @NameInMap("OpenSuperAcl")
        private Boolean openSuperAcl;

        @NameInMap("PassWord")
        private String passWord;

        @NameInMap("RestartFlag")
        private Boolean restartFlag;

        @NameInMap("SnapshotCount")
        private String snapshotCount;

        @NameInMap("SyncLimit")
        private String syncLimit;

        @NameInMap("TickTime")
        private String tickTime;

        @NameInMap("UserName")
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
            private String tickTime; 
            private String userName; 

            /**
             * AutopurgePurgeInterval.
             */
            public Builder autopurgePurgeInterval(String autopurgePurgeInterval) {
                this.autopurgePurgeInterval = autopurgePurgeInterval;
                return this;
            }

            /**
             * AutopurgeSnapRetainCount.
             */
            public Builder autopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
                this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ConfigAuthEnabled.
             */
            public Builder configAuthEnabled(Boolean configAuthEnabled) {
                this.configAuthEnabled = configAuthEnabled;
                return this;
            }

            /**
             * ConfigAuthSupported.
             */
            public Builder configAuthSupported(Boolean configAuthSupported) {
                this.configAuthSupported = configAuthSupported;
                return this;
            }

            /**
             * ConfigContentLimit.
             */
            public Builder configContentLimit(Long configContentLimit) {
                this.configContentLimit = configContentLimit;
                return this;
            }

            /**
             * ConfigSecretEnabled.
             */
            public Builder configSecretEnabled(Boolean configSecretEnabled) {
                this.configSecretEnabled = configSecretEnabled;
                return this;
            }

            /**
             * ConfigSecretSupported.
             */
            public Builder configSecretSupported(Boolean configSecretSupported) {
                this.configSecretSupported = configSecretSupported;
                return this;
            }

            /**
             * InitLimit.
             */
            public Builder initLimit(String initLimit) {
                this.initLimit = initLimit;
                return this;
            }

            /**
             * JuteMaxbuffer.
             */
            public Builder juteMaxbuffer(String juteMaxbuffer) {
                this.juteMaxbuffer = juteMaxbuffer;
                return this;
            }

            /**
             * JvmFlagsCustom.
             */
            public Builder jvmFlagsCustom(String jvmFlagsCustom) {
                this.jvmFlagsCustom = jvmFlagsCustom;
                return this;
            }

            /**
             * MCPEnabled.
             */
            public Builder MCPEnabled(Boolean MCPEnabled) {
                this.MCPEnabled = MCPEnabled;
                return this;
            }

            /**
             * MCPSupported.
             */
            public Builder MCPSupported(Boolean MCPSupported) {
                this.MCPSupported = MCPSupported;
                return this;
            }

            /**
             * MaxClientCnxns.
             */
            public Builder maxClientCnxns(String maxClientCnxns) {
                this.maxClientCnxns = maxClientCnxns;
                return this;
            }

            /**
             * 最大超时时间
             */
            public Builder maxSessionTimeout(String maxSessionTimeout) {
                this.maxSessionTimeout = maxSessionTimeout;
                return this;
            }

            /**
             * 最小超时时间
             */
            public Builder minSessionTimeout(String minSessionTimeout) {
                this.minSessionTimeout = minSessionTimeout;
                return this;
            }

            /**
             * NacosRunningEnv.
             */
            public Builder nacosRunningEnv(NacosRunningEnv nacosRunningEnv) {
                this.nacosRunningEnv = nacosRunningEnv;
                return this;
            }

            /**
             * NamingAuthEnabled.
             */
            public Builder namingAuthEnabled(Boolean namingAuthEnabled) {
                this.namingAuthEnabled = namingAuthEnabled;
                return this;
            }

            /**
             * NamingAuthSupported.
             */
            public Builder namingAuthSupported(Boolean namingAuthSupported) {
                this.namingAuthSupported = namingAuthSupported;
                return this;
            }

            /**
             * NamingCreateServiceSupported.
             */
            public Builder namingCreateServiceSupported(Boolean namingCreateServiceSupported) {
                this.namingCreateServiceSupported = namingCreateServiceSupported;
                return this;
            }

            /**
             * OpenSuperAcl.
             */
            public Builder openSuperAcl(Boolean openSuperAcl) {
                this.openSuperAcl = openSuperAcl;
                return this;
            }

            /**
             * PassWord.
             */
            public Builder passWord(String passWord) {
                this.passWord = passWord;
                return this;
            }

            /**
             * RestartFlag.
             */
            public Builder restartFlag(Boolean restartFlag) {
                this.restartFlag = restartFlag;
                return this;
            }

            /**
             * SnapshotCount.
             */
            public Builder snapshotCount(String snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * SyncLimit.
             */
            public Builder syncLimit(String syncLimit) {
                this.syncLimit = syncLimit;
                return this;
            }

            /**
             * TickTime.
             */
            public Builder tickTime(String tickTime) {
                this.tickTime = tickTime;
                return this;
            }

            /**
             * UserName.
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
