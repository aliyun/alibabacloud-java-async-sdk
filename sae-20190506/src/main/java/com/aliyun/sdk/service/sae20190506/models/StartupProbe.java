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
         * <p>The minimum number of consecutive failures that is considered a failure after a successful probe. Default value: 3. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * <p>The duration after the container is started before health checks are initiated. For more information, see <a href="https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes">Probes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * <p>The health check interval. Default value: 10. Unit: seconds. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * <p>The operation to determine the health of the container.</p>
         */
        public Builder probeHandler(ProbeHandler probeHandler) {
            this.probeHandler = probeHandler;
            return this;
        }

        /**
         * <p>The timeout period of a health check. Default value: 1. Minimum value: 1. For more information, see <a href="https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes">Container probes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
