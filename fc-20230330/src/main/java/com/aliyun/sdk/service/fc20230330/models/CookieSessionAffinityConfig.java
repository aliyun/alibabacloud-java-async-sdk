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
 * {@link CookieSessionAffinityConfig} extends {@link TeaModel}
 *
 * <p>CookieSessionAffinityConfig</p>
 */
public class CookieSessionAffinityConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disableSessionIdReuse")
    private Boolean disableSessionIdReuse;

    @com.aliyun.core.annotation.NameInMap("sessionConcurrencyPerInstance")
    private Long sessionConcurrencyPerInstance;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutInSeconds")
    private Long sessionIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sessionTTLInSeconds")
    private Long sessionTTLInSeconds;

    private CookieSessionAffinityConfig(Builder builder) {
        this.disableSessionIdReuse = builder.disableSessionIdReuse;
        this.sessionConcurrencyPerInstance = builder.sessionConcurrencyPerInstance;
        this.sessionIdleTimeoutInSeconds = builder.sessionIdleTimeoutInSeconds;
        this.sessionTTLInSeconds = builder.sessionTTLInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CookieSessionAffinityConfig create() {
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
        private Boolean disableSessionIdReuse; 
        private Long sessionConcurrencyPerInstance; 
        private Long sessionIdleTimeoutInSeconds; 
        private Long sessionTTLInSeconds; 

        private Builder() {
        } 

        private Builder(CookieSessionAffinityConfig model) {
            this.disableSessionIdReuse = model.disableSessionIdReuse;
            this.sessionConcurrencyPerInstance = model.sessionConcurrencyPerInstance;
            this.sessionIdleTimeoutInSeconds = model.sessionIdleTimeoutInSeconds;
            this.sessionTTLInSeconds = model.sessionTTLInSeconds;
        } 

        /**
         * <p>The default value is \<code>false\\</code>. When set to \<code>false\\</code>, a request with the same session ID can be sent after the session expires. The system treats this as a new session and attaches it to a new instance. When set to \<code>true\\</code>, the session ID cannot be reused after the session expires.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableSessionIdReuse(Boolean disableSessionIdReuse) {
            this.disableSessionIdReuse = disableSessionIdReuse;
            return this;
        }

        /**
         * <p>The maximum number of sessions that a single instance can process at the same time. The value must be an integer from 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder sessionConcurrencyPerInstance(Long sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }

        /**
         * <p>The duration in seconds that a session can remain idle. If a user is inactive for this period, the session is considered idle. The maximum duration is limited by the session\&quot;s lifecycle. The value must be between 0 and 21,600.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder sessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
            this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
            return this;
        }

        /**
         * <p>The total lifecycle of a session in seconds, from creation to destruction. After this period, Function Compute automatically destroys the session and no longer guarantees affinity. The value must be an integer from 1 to 21,600.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        public Builder sessionTTLInSeconds(Long sessionTTLInSeconds) {
            this.sessionTTLInSeconds = sessionTTLInSeconds;
            return this;
        }

        public CookieSessionAffinityConfig build() {
            return new CookieSessionAffinityConfig(this);
        } 

    } 

}
