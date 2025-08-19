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
 * {@link HeaderFieldSessionAffinityConfig} extends {@link TeaModel}
 *
 * <p>HeaderFieldSessionAffinityConfig</p>
 */
public class HeaderFieldSessionAffinityConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("affinityHeaderFieldName")
    private String affinityHeaderFieldName;

    @com.aliyun.core.annotation.NameInMap("sessionConcurrencyPerInstance")
    private Long sessionConcurrencyPerInstance;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutInSeconds")
    private Long sessionIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sessionTTLInSeconds")
    private Long sessionTTLInSeconds;

    private HeaderFieldSessionAffinityConfig(Builder builder) {
        this.affinityHeaderFieldName = builder.affinityHeaderFieldName;
        this.sessionConcurrencyPerInstance = builder.sessionConcurrencyPerInstance;
        this.sessionIdleTimeoutInSeconds = builder.sessionIdleTimeoutInSeconds;
        this.sessionTTLInSeconds = builder.sessionTTLInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HeaderFieldSessionAffinityConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affinityHeaderFieldName
     */
    public String getAffinityHeaderFieldName() {
        return this.affinityHeaderFieldName;
    }

    /**
     * @return sessionConcurrencyPerInstance
     */
    public Long getSessionConcurrencyPerInstance() {
        return this.sessionConcurrencyPerInstance;
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
        private String affinityHeaderFieldName; 
        private Long sessionConcurrencyPerInstance; 
        private Long sessionIdleTimeoutInSeconds; 
        private Long sessionTTLInSeconds; 

        private Builder() {
        } 

        private Builder(HeaderFieldSessionAffinityConfig model) {
            this.affinityHeaderFieldName = model.affinityHeaderFieldName;
            this.sessionConcurrencyPerInstance = model.sessionConcurrencyPerInstance;
            this.sessionIdleTimeoutInSeconds = model.sessionIdleTimeoutInSeconds;
            this.sessionTTLInSeconds = model.sessionTTLInSeconds;
        } 

        /**
         * affinityHeaderFieldName.
         */
        public Builder affinityHeaderFieldName(String affinityHeaderFieldName) {
            this.affinityHeaderFieldName = affinityHeaderFieldName;
            return this;
        }

        /**
         * sessionConcurrencyPerInstance.
         */
        public Builder sessionConcurrencyPerInstance(Long sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
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

        public HeaderFieldSessionAffinityConfig build() {
            return new HeaderFieldSessionAffinityConfig(this);
        } 

    } 

}
