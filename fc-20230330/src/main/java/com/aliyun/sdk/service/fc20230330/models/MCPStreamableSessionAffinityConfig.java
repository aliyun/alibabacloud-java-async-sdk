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
 * {@link MCPStreamableSessionAffinityConfig} extends {@link TeaModel}
 *
 * <p>MCPStreamableSessionAffinityConfig</p>
 */
public class MCPStreamableSessionAffinityConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("sessionConcurrencyPerInstance")
    private Long sessionConcurrencyPerInstance;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutInSeconds")
    private Long sessionIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sessionTTLInSeconds")
    private Long sessionTTLInSeconds;

    private MCPStreamableSessionAffinityConfig(Builder builder) {
        this.sessionConcurrencyPerInstance = builder.sessionConcurrencyPerInstance;
        this.sessionIdleTimeoutInSeconds = builder.sessionIdleTimeoutInSeconds;
        this.sessionTTLInSeconds = builder.sessionTTLInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPStreamableSessionAffinityConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Long sessionConcurrencyPerInstance; 
        private Long sessionIdleTimeoutInSeconds; 
        private Long sessionTTLInSeconds; 

        private Builder() {
        } 

        private Builder(MCPStreamableSessionAffinityConfig model) {
            this.sessionConcurrencyPerInstance = model.sessionConcurrencyPerInstance;
            this.sessionIdleTimeoutInSeconds = model.sessionIdleTimeoutInSeconds;
            this.sessionTTLInSeconds = model.sessionTTLInSeconds;
        } 

        /**
         * <p>The maximum number of sessions for simultaneous processing by a single instance. Valid values: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder sessionConcurrencyPerInstance(Long sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }

        /**
         * <p>The maximum idle time in seconds before a session enters an idle state due to user inactivity. The maximum duration is the upper limit of a single session lifecycle. Valid values: 0 to 21600.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder sessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
            this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
            return this;
        }

        /**
         * <p>The time-to-live of a session in seconds, covering the entire process from creation and usage to final destruction. If the time-to-live is exceeded, Function Compute automatically destroys the session and no longer guarantees affinity. Valid values: 1 to 21600.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        public Builder sessionTTLInSeconds(Long sessionTTLInSeconds) {
            this.sessionTTLInSeconds = sessionTTLInSeconds;
            return this;
        }

        public MCPStreamableSessionAffinityConfig build() {
            return new MCPStreamableSessionAffinityConfig(this);
        } 

    } 

}
