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
         * <p>The instance ID of the function associated with the session.</p>
         * 
         * <strong>example:</strong>
         * <p>c-68999e02-16a1955c-d2a03d1ccs</p>
         */
        public Builder containerId(String containerId) {
            this.containerId = containerId;
            return this;
        }

        /**
         * <p>The time when the session was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-01T08:15:27Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>Specifies whether to disable session ID reuse after the session expires. Valid values:</p>
         * <ul>
         * <li>False: After the session expires, you can use the same session ID to initiate requests. The system treats it as a new session and binds it to a new instance.</li>
         * <li>True: After the session expires, the session ID cannot be reused.</li>
         * </ul>
         * <p>Default value: False.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The name of the function to which the session belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>functionName1</p>
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
         * <p>The time when the session was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-01T18:15:27Z</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The NAS configuration. After configuration, the instance associated with the session can access the specified NAS resource.</p>
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
         * <p>The qualifier passed when the customer created the session. If not specified, the default value is LATEST.</p>
         * 
         * <strong>example:</strong>
         * <p>AliasName1</p>
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>The session affinity type.</p>
         * 
         * <strong>example:</strong>
         * <p>HEADER_FIELD</p>
         */
        public Builder sessionAffinityType(String sessionAffinityType) {
            this.sessionAffinityType = sessionAffinityType;
            return this;
        }

        /**
         * <p>The unique identifier of the function session.</p>
         * 
         * <strong>example:</strong>
         * <p>81f70ae156904eb9b7d43e12f511fe58</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The session idle timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder sessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
            this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
            return this;
        }

        /**
         * <p>The session status. Valid values:</p>
         * <ul>
         * <li>Active: The session is valid.</li>
         * <li>Expired: The session has expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder sessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }

        /**
         * <p>The maximum session lifetime.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
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
