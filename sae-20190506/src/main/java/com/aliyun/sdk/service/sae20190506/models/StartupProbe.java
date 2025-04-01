// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link StartupProbe} extends {@link TeaModel}
 *
 * <p>StartupProbe</p>
 */
public class StartupProbe extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailureThreshold")
    private Integer failureThreshold;

    @com.aliyun.core.annotation.NameInMap("InitialDelaySeconds")
    private Integer initialDelaySeconds;

    @com.aliyun.core.annotation.NameInMap("PeriodSeconds")
    private Integer periodSeconds;

    @com.aliyun.core.annotation.NameInMap("ProbeHandler")
    private ProbeHandler probeHandler;

    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    private Integer timeoutSeconds;

    private StartupProbe(Builder builder) {
        this.failureThreshold = builder.failureThreshold;
        this.initialDelaySeconds = builder.initialDelaySeconds;
        this.periodSeconds = builder.periodSeconds;
        this.probeHandler = builder.probeHandler;
        this.timeoutSeconds = builder.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartupProbe create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failureThreshold
     */
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * @return initialDelaySeconds
     */
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    /**
     * @return periodSeconds
     */
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    /**
     * @return probeHandler
     */
    public ProbeHandler getProbeHandler() {
        return this.probeHandler;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static final class Builder {
        private Integer failureThreshold; 
        private Integer initialDelaySeconds; 
        private Integer periodSeconds; 
        private ProbeHandler probeHandler; 
        private Integer timeoutSeconds; 

        private Builder() {
        } 

        private Builder(StartupProbe model) {
            this.failureThreshold = model.failureThreshold;
            this.initialDelaySeconds = model.initialDelaySeconds;
            this.periodSeconds = model.periodSeconds;
            this.probeHandler = model.probeHandler;
            this.timeoutSeconds = model.timeoutSeconds;
        } 

        /**
         * FailureThreshold.
         */
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * InitialDelaySeconds.
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * PeriodSeconds.
         */
        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * ProbeHandler.
         */
        public Builder probeHandler(ProbeHandler probeHandler) {
            this.probeHandler = probeHandler;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public StartupProbe build() {
            return new StartupProbe(this);
        } 

    } 

}
