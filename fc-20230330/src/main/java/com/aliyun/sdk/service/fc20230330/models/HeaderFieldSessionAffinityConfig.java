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

    @com.aliyun.core.annotation.NameInMap("disableSessionIdReuse")
    private Boolean disableSessionIdReuse;

    @com.aliyun.core.annotation.NameInMap("sessionConcurrencyPerInstance")
    private Long sessionConcurrencyPerInstance;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutInSeconds")
    private Long sessionIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sessionTTLInSeconds")
    private Long sessionTTLInSeconds;

    private HeaderFieldSessionAffinityConfig(Builder builder) {
        this.affinityHeaderFieldName = builder.affinityHeaderFieldName;
        this.disableSessionIdReuse = builder.disableSessionIdReuse;
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
        private String affinityHeaderFieldName; 
        private Boolean disableSessionIdReuse; 
        private Long sessionConcurrencyPerInstance; 
        private Long sessionIdleTimeoutInSeconds; 
        private Long sessionTTLInSeconds; 

        private Builder() {
        } 

        private Builder(HeaderFieldSessionAffinityConfig model) {
            this.affinityHeaderFieldName = model.affinityHeaderFieldName;
            this.disableSessionIdReuse = model.disableSessionIdReuse;
            this.sessionConcurrencyPerInstance = model.sessionConcurrencyPerInstance;
            this.sessionIdleTimeoutInSeconds = model.sessionIdleTimeoutInSeconds;
            this.sessionTTLInSeconds = model.sessionTTLInSeconds;
        } 

        /**
         * <p>The name of the HTTP request header that passes the client session identity. The name must be 5 to 40 characters long, start with a letter, and contain only letters, numbers, hyphens (-), and underscores (_). The name cannot start with the x-fc- prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>test-session-header1</p>
         */
        public Builder affinityHeaderFieldName(String affinityHeaderFieldName) {
            this.affinityHeaderFieldName = affinityHeaderFieldName;
            return this;
        }

        /**
         * <p>The default value is False. If set to False, a session ID can be reused in a new request after the original session expires. The system treats this as a new session and attaches it to a new instance. If set to True, an expired session ID cannot be reused.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableSessionIdReuse(Boolean disableSessionIdReuse) {
            this.disableSessionIdReuse = disableSessionIdReuse;
            return this;
        }

        /**
         * <p>The maximum number of sessions that a single instance can process simultaneously. The value must be an integer from 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder sessionConcurrencyPerInstance(Long sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }

        /**
         * <p>The idle timeout period for a session in seconds. A session becomes idle if no operations are performed within this period. The maximum value cannot exceed the session\&quot;s TTL. The value must be an integer from 0 to 21600.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder sessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
            this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
            return this;
        }

        /**
         * <p>The session\&quot;s Time to Live (TTL) in seconds. This defines the entire lifecycle of a session, from creation to destruction. After this period expires, Function Compute automatically destroys the session and no longer guarantees affinity. The value must be an integer from 1 to 21600.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
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
