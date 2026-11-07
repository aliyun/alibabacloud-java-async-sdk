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
 * {@link UpdateConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigRequest</p>
 */
public class UpdateConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthEnabled")
    private Boolean authEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutopurgePurgeInterval")
    private String autopurgePurgeInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutopurgeSnapRetainCount")
    private String autopurgeSnapRetainCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigAuthEnabled")
    private Boolean configAuthEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigSecretEnabled")
    private Boolean configSecretEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleUIEnabled")
    private Boolean consoleUIEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable4lw")
    private Boolean enable4lw;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EurekaSupported")
    private Boolean eurekaSupported;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendedTypesEnable")
    private String extendedTypesEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitLimit")
    private String initLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JuteMaxbuffer")
    private String juteMaxbuffer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MCPEnabled")
    private Boolean MCPEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxClientCnxns")
    private String maxClientCnxns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSessionTimeout")
    private String maxSessionTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinSessionTimeout")
    private String minSessionTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamingAuthEnabled")
    private Boolean namingAuthEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenSuperAcl")
    private String openSuperAcl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PassWord")
    private String passWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotCount")
    private String snapshotCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncLimit")
    private String syncLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TLSEnabled")
    private Boolean TLSEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TickTime")
    private String tickTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private UpdateConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.authEnabled = builder.authEnabled;
        this.autopurgePurgeInterval = builder.autopurgePurgeInterval;
        this.autopurgeSnapRetainCount = builder.autopurgeSnapRetainCount;
        this.clusterId = builder.clusterId;
        this.configAuthEnabled = builder.configAuthEnabled;
        this.configSecretEnabled = builder.configSecretEnabled;
        this.configType = builder.configType;
        this.consoleUIEnabled = builder.consoleUIEnabled;
        this.enable4lw = builder.enable4lw;
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
        private Boolean authEnabled; 
        private String autopurgePurgeInterval; 
        private String autopurgeSnapRetainCount; 
        private String clusterId; 
        private Boolean configAuthEnabled; 
        private Boolean configSecretEnabled; 
        private String configType; 
        private Boolean consoleUIEnabled; 
        private Boolean enable4lw; 
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
            this.authEnabled = request.authEnabled;
            this.autopurgePurgeInterval = request.autopurgePurgeInterval;
            this.autopurgeSnapRetainCount = request.autopurgeSnapRetainCount;
            this.clusterId = request.clusterId;
            this.configAuthEnabled = request.configAuthEnabled;
            this.configSecretEnabled = request.configSecretEnabled;
            this.configType = request.configType;
            this.consoleUIEnabled = request.consoleUIEnabled;
            this.enable4lw = request.enable4lw;
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><p>zh: Chinese</p>
         * </li>
         * <li><p>en: English</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to enable forced Simple Authentication and Security Layer (SASL) authentication. After this feature is enabled, clients that do not perform SASL authentication cannot access the cluster</p>
         */
        public Builder authEnabled(Boolean authEnabled) {
            this.putQueryParameter("AuthEnabled", authEnabled);
            this.authEnabled = authEnabled;
            return this;
        }

        /**
         * <p>The reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder autopurgePurgeInterval(String autopurgePurgeInterval) {
            this.putQueryParameter("AutopurgePurgeInterval", autopurgePurgeInterval);
            this.autopurgePurgeInterval = autopurgePurgeInterval;
            return this;
        }

        /**
         * <p>The reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder autopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
            this.putQueryParameter("AutopurgeSnapRetainCount", autopurgeSnapRetainCount);
            this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-09k1q11****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable RAM authentication for the configuration center in Nacos:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Before you set this parameter, call the QueryConfig operation to obtain the ConfigAuthSupported parameter to check whether the current cluster supports this feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder configAuthEnabled(Boolean configAuthEnabled) {
            this.putQueryParameter("ConfigAuthEnabled", configAuthEnabled);
            this.configAuthEnabled = configAuthEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable the configuration encryption feature for the configuration center in Nacos. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The request was successful.</p>
         * </li>
         * <li><p><code>false</code>: The request failed.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Before you set this parameter, call the QueryConfig operation to obtain the ConfigSecretSupported parameter to check whether the current cluster supports this feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder configSecretEnabled(Boolean configSecretEnabled) {
            this.putQueryParameter("ConfigSecretEnabled", configSecretEnabled);
            this.configSecretEnabled = configSecretEnabled;
            return this;
        }

        /**
         * <p>The format of the configurations. Supported formats include TEXT, JSON, XML, and HTML.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Nacos open-source console</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder consoleUIEnabled(Boolean consoleUIEnabled) {
            this.putQueryParameter("ConsoleUIEnabled", consoleUIEnabled);
            this.consoleUIEnabled = consoleUIEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable the four-character command access feature</p>
         */
        public Builder enable4lw(Boolean enable4lw) {
            this.putQueryParameter("Enable4lw", enable4lw);
            this.enable4lw = enable4lw;
            return this;
        }

        /**
         * <p>Specifies whether to enable Eureka protocol support in Nacos</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder eurekaSupported(Boolean eurekaSupported) {
            this.putQueryParameter("EurekaSupported", eurekaSupported);
            this.eurekaSupported = eurekaSupported;
            return this;
        }

        /**
         * <p>Specifies whether to enable TTL configuration in ZooKeeper parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder extendedTypesEnable(String extendedTypesEnable) {
            this.putQueryParameter("ExtendedTypesEnable", extendedTypesEnable);
            this.extendedTypesEnable = extendedTypesEnable;
            return this;
        }

        /**
         * <p>The maximum connection duration of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder initLimit(String initLimit) {
            this.putQueryParameter("InitLimit", initLimit);
            this.initLimit = initLimit;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-st2212****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum amount of data on each node. This parameter is valid for ZooKeeper instances. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048575</p>
         */
        public Builder juteMaxbuffer(String juteMaxbuffer) {
            this.putQueryParameter("JuteMaxbuffer", juteMaxbuffer);
            this.juteMaxbuffer = juteMaxbuffer;
            return this;
        }

        /**
         * <p>Specifies whether MCP is enabled in Nacos configuration. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Before you set this parameter, call the QueryConfig operation to obtain the MCPSupported parameter to check whether the current cluster supports this feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder MCPEnabled(Boolean MCPEnabled) {
            this.putQueryParameter("MCPEnabled", MCPEnabled);
            this.MCPEnabled = MCPEnabled;
            return this;
        }

        /**
         * <p>The number of connections between a single client and a single server in ZooKeeper configuration.<br>
         * If this parameter is set to 0, no limits are imposed on the number of connections.<br></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxClientCnxns(String maxClientCnxns) {
            this.putQueryParameter("MaxClientCnxns", maxClientCnxns);
            this.maxClientCnxns = maxClientCnxns;
            return this;
        }

        /**
         * <p>The maximum timeout period in ZooKeeper configuration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxSessionTimeout(String maxSessionTimeout) {
            this.putQueryParameter("MaxSessionTimeout", maxSessionTimeout);
            this.maxSessionTimeout = maxSessionTimeout;
            return this;
        }

        /**
         * <p>The minimum timeout period in ZooKeeper configuration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder minSessionTimeout(String minSessionTimeout) {
            this.putQueryParameter("MinSessionTimeout", minSessionTimeout);
            this.minSessionTimeout = minSessionTimeout;
            return this;
        }

        /**
         * <p>Specifies whether to enable RAM authentication for the Accreditation Centre in Nacos:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Before you set this parameter, call the QueryConfig operation to obtain the NamingAuthSupporte parameter to check whether the current cluster supports this feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder namingAuthEnabled(Boolean namingAuthEnabled) {
            this.putQueryParameter("NamingAuthEnabled", namingAuthEnabled);
            this.namingAuthEnabled = namingAuthEnabled;
            return this;
        }

        /**
         * <p>Specifies whether super permissions are enabled. This parameter is valid for ZooKeeper instances. Valid values:</p>
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
        public Builder openSuperAcl(String openSuperAcl) {
            this.putBodyParameter("OpenSuperAcl", openSuperAcl);
            this.openSuperAcl = openSuperAcl;
            return this;
        }

        /**
         * <p>The password of the account.</p>
         * <blockquote>
         * <p>This parameter is required when OpenSuperAcl is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        public Builder passWord(String passWord) {
            this.putQueryParameter("PassWord", passWord);
            this.passWord = passWord;
            return this;
        }

        /**
         * <p>The extended request parameter in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * <p>The frequency at which snapshots are generated in ZooKeeper configuration</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder snapshotCount(String snapshotCount) {
            this.putQueryParameter("SnapshotCount", snapshotCount);
            this.snapshotCount = snapshotCount;
            return this;
        }

        /**
         * <p>The connection timeout period of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder syncLimit(String syncLimit) {
            this.putQueryParameter("SyncLimit", syncLimit);
            this.syncLimit = syncLimit;
            return this;
        }

        /**
         * <p>Specifies whether to enable TLS transmission link encryption in Nacos</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder TLSEnabled(Boolean TLSEnabled) {
            this.putQueryParameter("TLSEnabled", TLSEnabled);
            this.TLSEnabled = TLSEnabled;
            return this;
        }

        /**
         * <p>The time unit. This parameter is valid for ZooKeeper instances. Default value: 2000. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder tickTime(String tickTime) {
            this.putQueryParameter("TickTime", tickTime);
            this.tickTime = tickTime;
            return this;
        }

        /**
         * <p>The username of the account.</p>
         * <blockquote>
         * <p>This parameter is required when OpenSuperAcl is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>name</p>
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
