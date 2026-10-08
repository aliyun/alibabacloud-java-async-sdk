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
 * {@link CreateSessionInput} extends {@link TeaModel}
 *
 * <p>CreateSessionInput</p>
 */
public class CreateSessionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowInternetAccess")
    private Boolean allowInternetAccess;

    @com.aliyun.core.annotation.NameInMap("disableSessionIdReuse")
    private Boolean disableSessionIdReuse;

    @com.aliyun.core.annotation.NameInMap("enableAutoPause")
    private Boolean enableAutoPause;

    @com.aliyun.core.annotation.NameInMap("enableAutoResume")
    private Boolean enableAutoResume;

    @com.aliyun.core.annotation.NameInMap("juiceFsConfig")
    private JuiceFsConfig juiceFsConfig;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("network")
    private CreateSessionNetworkConfig network;

    @com.aliyun.core.annotation.NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @com.aliyun.core.annotation.NameInMap("polarFsConfig")
    private PolarFsConfig polarFsConfig;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutInSeconds")
    private Long sessionIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sessionTTLInSeconds")
    private Long sessionTTLInSeconds;

    @com.aliyun.core.annotation.NameInMap("snapshotId")
    private String snapshotId;

    private CreateSessionInput(Builder builder) {
        this.allowInternetAccess = builder.allowInternetAccess;
        this.disableSessionIdReuse = builder.disableSessionIdReuse;
        this.enableAutoPause = builder.enableAutoPause;
        this.enableAutoResume = builder.enableAutoResume;
        this.juiceFsConfig = builder.juiceFsConfig;
        this.nasConfig = builder.nasConfig;
        this.network = builder.network;
        this.ossMountConfig = builder.ossMountConfig;
        this.polarFsConfig = builder.polarFsConfig;
        this.sessionId = builder.sessionId;
        this.sessionIdleTimeoutInSeconds = builder.sessionIdleTimeoutInSeconds;
        this.sessionTTLInSeconds = builder.sessionTTLInSeconds;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSessionInput create() {
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
     * @return juiceFsConfig
     */
    public JuiceFsConfig getJuiceFsConfig() {
        return this.juiceFsConfig;
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
     * @return sessionTTLInSeconds
     */
    public Long getSessionTTLInSeconds() {
        return this.sessionTTLInSeconds;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder {
        private Boolean allowInternetAccess; 
        private Boolean disableSessionIdReuse; 
        private Boolean enableAutoPause; 
        private Boolean enableAutoResume; 
        private JuiceFsConfig juiceFsConfig; 
        private NASConfig nasConfig; 
        private CreateSessionNetworkConfig network; 
        private OSSMountConfig ossMountConfig; 
        private PolarFsConfig polarFsConfig; 
        private String sessionId; 
        private Long sessionIdleTimeoutInSeconds; 
        private Long sessionTTLInSeconds; 
        private String snapshotId; 

        private Builder() {
        } 

        private Builder(CreateSessionInput model) {
            this.allowInternetAccess = model.allowInternetAccess;
            this.disableSessionIdReuse = model.disableSessionIdReuse;
            this.enableAutoPause = model.enableAutoPause;
            this.enableAutoResume = model.enableAutoResume;
            this.juiceFsConfig = model.juiceFsConfig;
            this.nasConfig = model.nasConfig;
            this.network = model.network;
            this.ossMountConfig = model.ossMountConfig;
            this.polarFsConfig = model.polarFsConfig;
            this.sessionId = model.sessionId;
            this.sessionIdleTimeoutInSeconds = model.sessionIdleTimeoutInSeconds;
            this.sessionTTLInSeconds = model.sessionTTLInSeconds;
            this.snapshotId = model.snapshotId;
        } 

        /**
         * allowInternetAccess.
         */
        public Builder allowInternetAccess(Boolean allowInternetAccess) {
            this.allowInternetAccess = allowInternetAccess;
            return this;
        }

        /**
         * <p>Specifies whether to disable session ID reuse. Default value: False, which indicates that after a session expires, you can use the same SessionID to initiate requests. The system treats this as a new session and binds it to a new instance. If set to True, the SessionID cannot be reused after the session expires.</p>
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
         * <p>The JuiceFs mount configuration.</p>
         */
        public Builder juiceFsConfig(JuiceFsConfig juiceFsConfig) {
            this.juiceFsConfig = juiceFsConfig;
            return this;
        }

        /**
         * <p>The NAS configuration. After this parameter is configured, instances associated with the session can access the specified NAS resources.</p>
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
         * <p>The OSS configuration. After this parameter is configured, instances associated with the session can access the specified OSS resources.</p>
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * <p>The PolarFs configuration. After this parameter is configured, instances associated with the session can access the specified PolarFs resources.</p>
         */
        public Builder polarFsConfig(PolarFsConfig polarFsConfig) {
            this.polarFsConfig = polarFsConfig;
            return this;
        }

        /**
         * <p>The custom session ID. If not configured, the server generates one. If configured, this value is used as the session ID. This parameter is applicable only to the HEADER_FIELD affinity mode. Format: The length is limited to [0,64]. The first character must be from <strong>a-zA-Z0-9_</strong>. Subsequent characters can be from <strong>a-zA-Z0-9_-</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-test-session-id</p>
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
         * <p>The session lifetime.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        public Builder sessionTTLInSeconds(Long sessionTTLInSeconds) {
            this.sessionTTLInSeconds = sessionTTLInSeconds;
            return this;
        }

        /**
         * snapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public CreateSessionInput build() {
            return new CreateSessionInput(this);
        } 

    } 

}
