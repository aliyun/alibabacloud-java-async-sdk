// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link Session} extends {@link TeaModel}
 *
 * <p>Session</p>
 */
public class Session extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowInternetAccess")
    private Boolean allowInternetAccess;

    @com.aliyun.core.annotation.NameInMap("containerId")
    private String containerId;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("disableSessionIdReuse")
    private Boolean disableSessionIdReuse;

    @com.aliyun.core.annotation.NameInMap("enableAutoPause")
    private Boolean enableAutoPause;

    @com.aliyun.core.annotation.NameInMap("enableAutoResume")
    private Boolean enableAutoResume;

    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("juiceFsConfig")
    private JuiceFsConfig juiceFsConfig;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("network")
    private CreateSessionNetworkConfig network;

    @com.aliyun.core.annotation.NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @com.aliyun.core.annotation.NameInMap("polarFsConfig")
    private PolarFsConfig polarFsConfig;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("sessionAffinityType")
    private String sessionAffinityType;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutInSeconds")
    private Long sessionIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sessionStatus")
    private String sessionStatus;

    @com.aliyun.core.annotation.NameInMap("sessionTTLInSeconds")
    private Long sessionTTLInSeconds;

    @com.aliyun.core.annotation.NameInMap("trafficAccessToken")
    private String trafficAccessToken;

    private Session(Builder builder) {
        this.allowInternetAccess = builder.allowInternetAccess;
        this.containerId = builder.containerId;
        this.createdTime = builder.createdTime;
        this.disableSessionIdReuse = builder.disableSessionIdReuse;
        this.enableAutoPause = builder.enableAutoPause;
        this.enableAutoResume = builder.enableAutoResume;
        this.functionName = builder.functionName;
        this.juiceFsConfig = builder.juiceFsConfig;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.nasConfig = builder.nasConfig;
        this.network = builder.network;
        this.ossMountConfig = builder.ossMountConfig;
        this.polarFsConfig = builder.polarFsConfig;
        this.qualifier = builder.qualifier;
        this.sessionAffinityType = builder.sessionAffinityType;
        this.sessionId = builder.sessionId;
        this.sessionIdleTimeoutInSeconds = builder.sessionIdleTimeoutInSeconds;
        this.sessionStatus = builder.sessionStatus;
        this.sessionTTLInSeconds = builder.sessionTTLInSeconds;
        this.trafficAccessToken = builder.trafficAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Session create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowInternetAccess
     */
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
    }

    /**
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return disableSessionIdReuse
     */
    public Boolean getDisableSessionIdReuse() {
        return this.disableSessionIdReuse;
    }

    /**
     * @return enableAutoPause
     */
    public Boolean getEnableAutoPause() {
        return this.enableAutoPause;
    }

    /**
     * @return enableAutoResume
     */
    public Boolean getEnableAutoResume() {
        return this.enableAutoResume;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return juiceFsConfig
     */
    public JuiceFsConfig getJuiceFsConfig() {
        return this.juiceFsConfig;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return nasConfig
     */
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    /**
     * @return network
     */
    public CreateSessionNetworkConfig getNetwork() {
        return this.network;
    }

    /**
     * @return ossMountConfig
     */
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    /**
     * @return polarFsConfig
     */
    public PolarFsConfig getPolarFsConfig() {
        return this.polarFsConfig;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sessionAffinityType
     */
    public String getSessionAffinityType() {
        return this.sessionAffinityType;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionIdleTimeoutInSeconds
     */
    public Long getSessionIdleTimeoutInSeconds() {
        return this.sessionIdleTimeoutInSeconds;
    }

    /**
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    /**
     * @return sessionTTLInSeconds
     */
    public Long getSessionTTLInSeconds() {
        return this.sessionTTLInSeconds;
    }

    /**
     * @return trafficAccessToken
     */
    public String getTrafficAccessToken() {
        return this.trafficAccessToken;
    }

    public static final class Builder {
        private Boolean allowInternetAccess; 
        private String containerId; 
        private String createdTime; 
        private Boolean disableSessionIdReuse; 
        private Boolean enableAutoPause; 
        private Boolean enableAutoResume; 
        private String functionName; 
        private JuiceFsConfig juiceFsConfig; 
        private String lastModifiedTime; 
        private NASConfig nasConfig; 
        private CreateSessionNetworkConfig network; 
        private OSSMountConfig ossMountConfig; 
        private PolarFsConfig polarFsConfig; 
        private String qualifier; 
        private String sessionAffinityType; 
        private String sessionId; 
        private Long sessionIdleTimeoutInSeconds; 
        private String sessionStatus; 
        private Long sessionTTLInSeconds; 
        private String trafficAccessToken; 

        private Builder() {
        } 

        private Builder(Session model) {
            this.allowInternetAccess = model.allowInternetAccess;
            this.containerId = model.containerId;
            this.createdTime = model.createdTime;
            this.disableSessionIdReuse = model.disableSessionIdReuse;
            this.enableAutoPause = model.enableAutoPause;
            this.enableAutoResume = model.enableAutoResume;
            this.functionName = model.functionName;
            this.juiceFsConfig = model.juiceFsConfig;
            this.lastModifiedTime = model.lastModifiedTime;
            this.nasConfig = model.nasConfig;
            this.network = model.network;
            this.ossMountConfig = model.ossMountConfig;
            this.polarFsConfig = model.polarFsConfig;
            this.qualifier = model.qualifier;
            this.sessionAffinityType = model.sessionAffinityType;
            this.sessionId = model.sessionId;
            this.sessionIdleTimeoutInSeconds = model.sessionIdleTimeoutInSeconds;
            this.sessionStatus = model.sessionStatus;
            this.sessionTTLInSeconds = model.sessionTTLInSeconds;
            this.trafficAccessToken = model.trafficAccessToken;
        } 

        /**
         * allowInternetAccess.
         */
        public Builder allowInternetAccess(Boolean allowInternetAccess) {
            this.allowInternetAccess = allowInternetAccess;
            return this;
        }

        /**
         * containerId.
         */
        public Builder containerId(String containerId) {
            this.containerId = containerId;
            return this;
        }

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * disableSessionIdReuse.
         */
        public Builder disableSessionIdReuse(Boolean disableSessionIdReuse) {
            this.disableSessionIdReuse = disableSessionIdReuse;
            return this;
        }

        /**
         * enableAutoPause.
         */
        public Builder enableAutoPause(Boolean enableAutoPause) {
            this.enableAutoPause = enableAutoPause;
            return this;
        }

        /**
         * enableAutoResume.
         */
        public Builder enableAutoResume(Boolean enableAutoResume) {
            this.enableAutoResume = enableAutoResume;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * juiceFsConfig.
         */
        public Builder juiceFsConfig(JuiceFsConfig juiceFsConfig) {
            this.juiceFsConfig = juiceFsConfig;
            return this;
        }

        /**
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * nasConfig.
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * network.
         */
        public Builder network(CreateSessionNetworkConfig network) {
            this.network = network;
            return this;
        }

        /**
         * ossMountConfig.
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * polarFsConfig.
         */
        public Builder polarFsConfig(PolarFsConfig polarFsConfig) {
            this.polarFsConfig = polarFsConfig;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * sessionAffinityType.
         */
        public Builder sessionAffinityType(String sessionAffinityType) {
            this.sessionAffinityType = sessionAffinityType;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * sessionIdleTimeoutInSeconds.
         */
        public Builder sessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
            this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
            return this;
        }

        /**
         * sessionStatus.
         */
        public Builder sessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }

        /**
         * sessionTTLInSeconds.
         */
        public Builder sessionTTLInSeconds(Long sessionTTLInSeconds) {
            this.sessionTTLInSeconds = sessionTTLInSeconds;
            return this;
        }

        /**
         * trafficAccessToken.
         */
        public Builder trafficAccessToken(String trafficAccessToken) {
            this.trafficAccessToken = trafficAccessToken;
            return this;
        }

        public Session build() {
            return new Session(this);
        } 

    } 

}
