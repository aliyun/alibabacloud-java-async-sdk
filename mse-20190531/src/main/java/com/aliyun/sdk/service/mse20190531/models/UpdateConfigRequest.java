// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigRequest</p>
 */
public class UpdateConfigRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AutopurgePurgeInterval")
    private String autopurgePurgeInterval;

    @Query
    @NameInMap("AutopurgeSnapRetainCount")
    private String autopurgeSnapRetainCount;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ConfigAuthEnabled")
    private Boolean configAuthEnabled;

    @Query
    @NameInMap("ConfigSecretEnabled")
    private Boolean configSecretEnabled;

    @Query
    @NameInMap("ConfigType")
    private String configType;

    @Query
    @NameInMap("ExtendedTypesEnable")
    private String extendedTypesEnable;

    @Query
    @NameInMap("InitLimit")
    private String initLimit;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("JuteMaxbuffer")
    private String juteMaxbuffer;

    @Query
    @NameInMap("MCPEnabled")
    private Boolean MCPEnabled;

    @Query
    @NameInMap("MaxClientCnxns")
    private String maxClientCnxns;

    @Query
    @NameInMap("MaxSessionTimeout")
    private String maxSessionTimeout;

    @Query
    @NameInMap("MinSessionTimeout")
    private String minSessionTimeout;

    @Query
    @NameInMap("NamingAuthEnabled")
    private Boolean namingAuthEnabled;

    @Body
    @NameInMap("OpenSuperAcl")
    private String openSuperAcl;

    @Query
    @NameInMap("PassWord")
    private String passWord;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    @Query
    @NameInMap("SnapshotCount")
    private String snapshotCount;

    @Query
    @NameInMap("SyncLimit")
    private String syncLimit;

    @Query
    @NameInMap("TickTime")
    private String tickTime;

    @Query
    @NameInMap("UserName")
    private String userName;

    private UpdateConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.autopurgePurgeInterval = builder.autopurgePurgeInterval;
        this.autopurgeSnapRetainCount = builder.autopurgeSnapRetainCount;
        this.clusterId = builder.clusterId;
        this.configAuthEnabled = builder.configAuthEnabled;
        this.configSecretEnabled = builder.configSecretEnabled;
        this.configType = builder.configType;
        this.extendedTypesEnable = builder.extendedTypesEnable;
        this.initLimit = builder.initLimit;
        this.instanceId = builder.instanceId;
        this.juteMaxbuffer = builder.juteMaxbuffer;
        this.MCPEnabled = builder.MCPEnabled;
        this.maxClientCnxns = builder.maxClientCnxns;
        this.maxSessionTimeout = builder.maxSessionTimeout;
        this.minSessionTimeout = builder.minSessionTimeout;
        this.namingAuthEnabled = builder.namingAuthEnabled;
        this.openSuperAcl = builder.openSuperAcl;
        this.passWord = builder.passWord;
        this.requestPars = builder.requestPars;
        this.snapshotCount = builder.snapshotCount;
        this.syncLimit = builder.syncLimit;
        this.tickTime = builder.tickTime;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configAuthEnabled
     */
    public Boolean getConfigAuthEnabled() {
        return this.configAuthEnabled;
    }

    /**
     * @return configSecretEnabled
     */
    public Boolean getConfigSecretEnabled() {
        return this.configSecretEnabled;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return extendedTypesEnable
     */
    public String getExtendedTypesEnable() {
        return this.extendedTypesEnable;
    }

    /**
     * @return initLimit
     */
    public String getInitLimit() {
        return this.initLimit;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return juteMaxbuffer
     */
    public String getJuteMaxbuffer() {
        return this.juteMaxbuffer;
    }

    /**
     * @return MCPEnabled
     */
    public Boolean getMCPEnabled() {
        return this.MCPEnabled;
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
     * @return namingAuthEnabled
     */
    public Boolean getNamingAuthEnabled() {
        return this.namingAuthEnabled;
    }

    /**
     * @return openSuperAcl
     */
    public String getOpenSuperAcl() {
        return this.openSuperAcl;
    }

    /**
     * @return passWord
     */
    public String getPassWord() {
        return this.passWord;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
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

    public static final class Builder extends Request.Builder<UpdateConfigRequest, Builder> {
        private String acceptLanguage; 
        private String autopurgePurgeInterval; 
        private String autopurgeSnapRetainCount; 
        private String clusterId; 
        private Boolean configAuthEnabled; 
        private Boolean configSecretEnabled; 
        private String configType; 
        private String extendedTypesEnable; 
        private String initLimit; 
        private String instanceId; 
        private String juteMaxbuffer; 
        private Boolean MCPEnabled; 
        private String maxClientCnxns; 
        private String maxSessionTimeout; 
        private String minSessionTimeout; 
        private Boolean namingAuthEnabled; 
        private String openSuperAcl; 
        private String passWord; 
        private String requestPars; 
        private String snapshotCount; 
        private String syncLimit; 
        private String tickTime; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.autopurgePurgeInterval = request.autopurgePurgeInterval;
            this.autopurgeSnapRetainCount = request.autopurgeSnapRetainCount;
            this.clusterId = request.clusterId;
            this.configAuthEnabled = request.configAuthEnabled;
            this.configSecretEnabled = request.configSecretEnabled;
            this.configType = request.configType;
            this.extendedTypesEnable = request.extendedTypesEnable;
            this.initLimit = request.initLimit;
            this.instanceId = request.instanceId;
            this.juteMaxbuffer = request.juteMaxbuffer;
            this.MCPEnabled = request.MCPEnabled;
            this.maxClientCnxns = request.maxClientCnxns;
            this.maxSessionTimeout = request.maxSessionTimeout;
            this.minSessionTimeout = request.minSessionTimeout;
            this.namingAuthEnabled = request.namingAuthEnabled;
            this.openSuperAcl = request.openSuperAcl;
            this.passWord = request.passWord;
            this.requestPars = request.requestPars;
            this.snapshotCount = request.snapshotCount;
            this.syncLimit = request.syncLimit;
            this.tickTime = request.tickTime;
            this.userName = request.userName;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder autopurgePurgeInterval(String autopurgePurgeInterval) {
            this.putQueryParameter("AutopurgePurgeInterval", autopurgePurgeInterval);
            this.autopurgePurgeInterval = autopurgePurgeInterval;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder autopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
            this.putQueryParameter("AutopurgeSnapRetainCount", autopurgeSnapRetainCount);
            this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to enable RAM authorization for a configuration center. This parameter is valid for Nacos instances. Valid values:
         * <p>
         * 
         * *   `true`: yes
         * *   `false`: no
         * 
         * > Before you set this parameter, you must call the QueryConfig operation to obtain the ConfigAuthSupported parameter value to check whether the instance supports this feature.
         */
        public Builder configAuthEnabled(Boolean configAuthEnabled) {
            this.putQueryParameter("ConfigAuthEnabled", configAuthEnabled);
            this.configAuthEnabled = configAuthEnabled;
            return this;
        }

        /**
         * Specifies whether to enable configuration encryption for a configuration center. This parameter is valid for Nacos instances. Valid values:
         * <p>
         * 
         * *   `true`: yes
         * *   `false`: no
         * 
         * > Before you set this parameter, you must call the QueryConfig operation to obtain the ConfigSecretSupported parameter value to check whether the instance supports this feature.
         */
        public Builder configSecretEnabled(Boolean configSecretEnabled) {
            this.putQueryParameter("ConfigSecretEnabled", configSecretEnabled);
            this.configSecretEnabled = configSecretEnabled;
            return this;
        }

        /**
         * The format of the configuration. Supported formats include TEXT, JSON, XML, and HTML.
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * zookeeper参数，是否开启TTL配置。
         */
        public Builder extendedTypesEnable(String extendedTypesEnable) {
            this.putQueryParameter("ExtendedTypesEnable", extendedTypesEnable);
            this.extendedTypesEnable = extendedTypesEnable;
            return this;
        }

        /**
         * The maximum connection duration of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.
         */
        public Builder initLimit(String initLimit) {
            this.putQueryParameter("InitLimit", initLimit);
            this.initLimit = initLimit;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The maximum amount of data on each node. This parameter is valid for ZooKeeper instances. The default maximum data amount on each node is 1 megabyte. Unit: bytes.
         */
        public Builder juteMaxbuffer(String juteMaxbuffer) {
            this.putQueryParameter("JuteMaxbuffer", juteMaxbuffer);
            this.juteMaxbuffer = juteMaxbuffer;
            return this;
        }

        /**
         * Specifies whether to enable Mesh Configuration Protocol (MCP). This parameter is valid for Nacos instances. Valid values:
         * <p>
         * 
         * *   `true`: yes
         * *   `false`: no
         * 
         * > Before you set this parameter, you must call the QueryConfig operation to obtain the MCPSupported parameter value to check whether the instance supports this feature.
         */
        public Builder MCPEnabled(Boolean MCPEnabled) {
            this.putQueryParameter("MCPEnabled", MCPEnabled);
            this.MCPEnabled = MCPEnabled;
            return this;
        }

        /**
         * The number of connections between a client and a server. This parameter is valid for ZooKeeper instances.\
         * <p>
         * If this parameter is set to 0, no limits are imposed on the number of connections.
         */
        public Builder maxClientCnxns(String maxClientCnxns) {
            this.putQueryParameter("MaxClientCnxns", maxClientCnxns);
            this.maxClientCnxns = maxClientCnxns;
            return this;
        }

        /**
         * The maximum timeout period. This parameter is valid for ZooKeeper instances. Unit: seconds.
         */
        public Builder maxSessionTimeout(String maxSessionTimeout) {
            this.putQueryParameter("MaxSessionTimeout", maxSessionTimeout);
            this.maxSessionTimeout = maxSessionTimeout;
            return this;
        }

        /**
         * The minimum timeout period. This parameter is valid for ZooKeeper instances. Unit: seconds.
         */
        public Builder minSessionTimeout(String minSessionTimeout) {
            this.putQueryParameter("MinSessionTimeout", minSessionTimeout);
            this.minSessionTimeout = minSessionTimeout;
            return this;
        }

        /**
         * Specifies whether to enable RAM authorization for a registry. This parameter is valid for Nacos instances. Valid values:
         * <p>
         * 
         * *   `true`: yes
         * *   `false`: no
         * 
         * > Before you set this parameter, you must call the QueryConfig operation to obtain the NamingAuthSupported parameter value to check whether the instance supports this feature.
         */
        public Builder namingAuthEnabled(Boolean namingAuthEnabled) {
            this.putQueryParameter("NamingAuthEnabled", namingAuthEnabled);
            this.namingAuthEnabled = namingAuthEnabled;
            return this;
        }

        /**
         * Specifies whether to enable super permissions. This parameter is valid for ZooKeeper instances. Valid values:
         * <p>
         * 
         * *   `true`: yes
         * *   `false`: no
         */
        public Builder openSuperAcl(String openSuperAcl) {
            this.putBodyParameter("OpenSuperAcl", openSuperAcl);
            this.openSuperAcl = openSuperAcl;
            return this;
        }

        /**
         * The password that corresponds to the username.
         * <p>
         * 
         * > You must specify this parameter if OpenSuperAcl is set to true.
         */
        public Builder passWord(String passWord) {
            this.putQueryParameter("PassWord", passWord);
            this.passWord = passWord;
            return this;
        }

        /**
         * The extended request parameters in the JSON format.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * The frequency for generating snapshots. This parameter is valid for ZooKeeper instances.
         */
        public Builder snapshotCount(String snapshotCount) {
            this.putQueryParameter("SnapshotCount", snapshotCount);
            this.snapshotCount = snapshotCount;
            return this;
        }

        /**
         * The connection timeout period of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.
         */
        public Builder syncLimit(String syncLimit) {
            this.putQueryParameter("SyncLimit", syncLimit);
            this.syncLimit = syncLimit;
            return this;
        }

        /**
         * The time unit. This parameter is valid for ZooKeeper instances. Default value: 2000. Unit: milliseconds.
         */
        public Builder tickTime(String tickTime) {
            this.putQueryParameter("TickTime", tickTime);
            this.tickTime = tickTime;
            return this;
        }

        /**
         * The username.
         * <p>
         * 
         * > You must specify this parameter if OpenSuperAcl is set to true.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public UpdateConfigRequest build() {
            return new UpdateConfigRequest(this);
        } 

    } 

}
