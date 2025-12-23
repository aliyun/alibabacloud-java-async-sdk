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
    @com.aliyun.core.annotation.NameInMap("disableSessionIdReuse")
    private Boolean disableSessionIdReuse;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

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

    private CreateSessionInput(Builder builder) {
        this.disableSessionIdReuse = builder.disableSessionIdReuse;
        this.nasConfig = builder.nasConfig;
        this.ossMountConfig = builder.ossMountConfig;
        this.polarFsConfig = builder.polarFsConfig;
        this.sessionId = builder.sessionId;
        this.sessionIdleTimeoutInSeconds = builder.sessionIdleTimeoutInSeconds;
        this.sessionTTLInSeconds = builder.sessionTTLInSeconds;
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
     * @return disableSessionIdReuse
     */
    public Boolean getDisableSessionIdReuse() {
        return this.disableSessionIdReuse;
    }

    /**
     * @return nasConfig
     */
    public NASConfig getNasConfig() {
        return this.nasConfig;
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

    public static final class Builder {
        private Boolean disableSessionIdReuse; 
        private NASConfig nasConfig; 
        private OSSMountConfig ossMountConfig; 
        private PolarFsConfig polarFsConfig; 
        private String sessionId; 
        private Long sessionIdleTimeoutInSeconds; 
        private Long sessionTTLInSeconds; 

        private Builder() {
        } 

        private Builder(CreateSessionInput model) {
            this.disableSessionIdReuse = model.disableSessionIdReuse;
            this.nasConfig = model.nasConfig;
            this.ossMountConfig = model.ossMountConfig;
            this.polarFsConfig = model.polarFsConfig;
            this.sessionId = model.sessionId;
            this.sessionIdleTimeoutInSeconds = model.sessionIdleTimeoutInSeconds;
            this.sessionTTLInSeconds = model.sessionTTLInSeconds;
        } 

        /**
         * disableSessionIdReuse.
         */
        public Builder disableSessionIdReuse(Boolean disableSessionIdReuse) {
            this.disableSessionIdReuse = disableSessionIdReuse;
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

        public CreateSessionInput build() {
            return new CreateSessionInput(this);
        } 

    } 

}
