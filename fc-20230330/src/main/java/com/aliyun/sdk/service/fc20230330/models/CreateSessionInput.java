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
         * juiceFsConfig.
         */
        public Builder juiceFsConfig(JuiceFsConfig juiceFsConfig) {
            this.juiceFsConfig = juiceFsConfig;
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
         * sessionTTLInSeconds.
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
