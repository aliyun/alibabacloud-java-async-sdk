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
 * {@link UpdateSessionInput} extends {@link TeaModel}
 *
 * <p>UpdateSessionInput</p>
 */
public class UpdateSessionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disableSessionIdReuse")
    private Boolean disableSessionIdReuse;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @com.aliyun.core.annotation.NameInMap("polarFsConfig")
    private PolarFsConfig polarFsConfig;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutInSeconds")
    private Long sessionIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sessionTTLInSeconds")
    private Long sessionTTLInSeconds;

    private UpdateSessionInput(Builder builder) {
        this.disableSessionIdReuse = builder.disableSessionIdReuse;
        this.nasConfig = builder.nasConfig;
        this.ossMountConfig = builder.ossMountConfig;
        this.polarFsConfig = builder.polarFsConfig;
        this.sessionIdleTimeoutInSeconds = builder.sessionIdleTimeoutInSeconds;
        this.sessionTTLInSeconds = builder.sessionTTLInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSessionInput create() {
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
        private Long sessionIdleTimeoutInSeconds; 
        private Long sessionTTLInSeconds; 

        private Builder() {
        } 

        private Builder(UpdateSessionInput model) {
            this.disableSessionIdReuse = model.disableSessionIdReuse;
            this.nasConfig = model.nasConfig;
            this.ossMountConfig = model.ossMountConfig;
            this.polarFsConfig = model.polarFsConfig;
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

        public UpdateSessionInput build() {
            return new UpdateSessionInput(this);
        } 

    } 

}
