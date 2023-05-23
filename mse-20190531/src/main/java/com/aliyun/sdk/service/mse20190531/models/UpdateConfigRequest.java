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
    @NameInMap("EurekaSupported")
    private Boolean eurekaSupported;

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
    @NameInMap("TLSEnabled")
    private Boolean TLSEnabled;

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
        this.eurekaSupported = builder.eurekaSupported;
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
        this.TLSEnabled = builder.TLSEnabled;
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
     * @return eurekaSupported
     */
    public Boolean getEurekaSupported() {
        return this.eurekaSupported;
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

    public static final class Builder extends Request.Builder<UpdateConfigRequest, Builder> {
        private String acceptLanguage; 
        private String autopurgePurgeInterval; 
        private String autopurgeSnapRetainCount; 
        private String clusterId; 
        private Boolean configAuthEnabled; 
        private Boolean configSecretEnabled; 
        private String configType; 
        private Boolean eurekaSupported; 
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
        private Boolean TLSEnabled; 
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
            this.eurekaSupported = request.eurekaSupported;
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
            this.TLSEnabled = request.TLSEnabled;
            this.tickTime = request.tickTime;
            this.userName = request.userName;
        } 

        /**
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AutopurgePurgeInterval.
         */
        public Builder autopurgePurgeInterval(String autopurgePurgeInterval) {
            this.putQueryParameter("AutopurgePurgeInterval", autopurgePurgeInterval);
            this.autopurgePurgeInterval = autopurgePurgeInterval;
            return this;
        }

        /**
         * AutopurgeSnapRetainCount.
         */
        public Builder autopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
            this.putQueryParameter("AutopurgeSnapRetainCount", autopurgeSnapRetainCount);
            this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ConfigAuthEnabled.
         */
        public Builder configAuthEnabled(Boolean configAuthEnabled) {
            this.putQueryParameter("ConfigAuthEnabled", configAuthEnabled);
            this.configAuthEnabled = configAuthEnabled;
            return this;
        }

        /**
         * ConfigSecretEnabled.
         */
        public Builder configSecretEnabled(Boolean configSecretEnabled) {
            this.putQueryParameter("ConfigSecretEnabled", configSecretEnabled);
            this.configSecretEnabled = configSecretEnabled;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * EurekaSupported.
         */
        public Builder eurekaSupported(Boolean eurekaSupported) {
            this.putQueryParameter("EurekaSupported", eurekaSupported);
            this.eurekaSupported = eurekaSupported;
            return this;
        }

        /**
         * ExtendedTypesEnable.
         */
        public Builder extendedTypesEnable(String extendedTypesEnable) {
            this.putQueryParameter("ExtendedTypesEnable", extendedTypesEnable);
            this.extendedTypesEnable = extendedTypesEnable;
            return this;
        }

        /**
         * InitLimit.
         */
        public Builder initLimit(String initLimit) {
            this.putQueryParameter("InitLimit", initLimit);
            this.initLimit = initLimit;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JuteMaxbuffer.
         */
        public Builder juteMaxbuffer(String juteMaxbuffer) {
            this.putQueryParameter("JuteMaxbuffer", juteMaxbuffer);
            this.juteMaxbuffer = juteMaxbuffer;
            return this;
        }

        /**
         * MCPEnabled.
         */
        public Builder MCPEnabled(Boolean MCPEnabled) {
            this.putQueryParameter("MCPEnabled", MCPEnabled);
            this.MCPEnabled = MCPEnabled;
            return this;
        }

        /**
         * MaxClientCnxns.
         */
        public Builder maxClientCnxns(String maxClientCnxns) {
            this.putQueryParameter("MaxClientCnxns", maxClientCnxns);
            this.maxClientCnxns = maxClientCnxns;
            return this;
        }

        /**
         * 最大超时时间
         */
        public Builder maxSessionTimeout(String maxSessionTimeout) {
            this.putQueryParameter("MaxSessionTimeout", maxSessionTimeout);
            this.maxSessionTimeout = maxSessionTimeout;
            return this;
        }

        /**
         * 最小超时时间
         */
        public Builder minSessionTimeout(String minSessionTimeout) {
            this.putQueryParameter("MinSessionTimeout", minSessionTimeout);
            this.minSessionTimeout = minSessionTimeout;
            return this;
        }

        /**
         * NamingAuthEnabled.
         */
        public Builder namingAuthEnabled(Boolean namingAuthEnabled) {
            this.putQueryParameter("NamingAuthEnabled", namingAuthEnabled);
            this.namingAuthEnabled = namingAuthEnabled;
            return this;
        }

        /**
         * OpenSuperAcl.
         */
        public Builder openSuperAcl(String openSuperAcl) {
            this.putBodyParameter("OpenSuperAcl", openSuperAcl);
            this.openSuperAcl = openSuperAcl;
            return this;
        }

        /**
         * PassWord.
         */
        public Builder passWord(String passWord) {
            this.putQueryParameter("PassWord", passWord);
            this.passWord = passWord;
            return this;
        }

        /**
         * RequestPars.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * SnapshotCount.
         */
        public Builder snapshotCount(String snapshotCount) {
            this.putQueryParameter("SnapshotCount", snapshotCount);
            this.snapshotCount = snapshotCount;
            return this;
        }

        /**
         * SyncLimit.
         */
        public Builder syncLimit(String syncLimit) {
            this.putQueryParameter("SyncLimit", syncLimit);
            this.syncLimit = syncLimit;
            return this;
        }

        /**
         * TLSEnabled.
         */
        public Builder TLSEnabled(Boolean TLSEnabled) {
            this.putQueryParameter("TLSEnabled", TLSEnabled);
            this.TLSEnabled = TLSEnabled;
            return this;
        }

        /**
         * TickTime.
         */
        public Builder tickTime(String tickTime) {
            this.putQueryParameter("TickTime", tickTime);
            this.tickTime = tickTime;
            return this;
        }

        /**
         * UserName.
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
