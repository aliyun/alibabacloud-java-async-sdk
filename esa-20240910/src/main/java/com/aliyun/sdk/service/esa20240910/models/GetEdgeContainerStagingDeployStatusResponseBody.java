// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEdgeContainerStagingDeployStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerStagingDeployStatusResponseBody</p>
 */
public class GetEdgeContainerStagingDeployStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainersReady")
    private String containersReady;

    @com.aliyun.core.annotation.NameInMap("CreationTimestamp")
    private String creationTimestamp;

    @com.aliyun.core.annotation.NameInMap("Initialized")
    private String initialized;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("PodRestartState")
    private PodRestartState podRestartState;

    @com.aliyun.core.annotation.NameInMap("Ready")
    private String ready;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scheduled")
    private String scheduled;

    @com.aliyun.core.annotation.NameInMap("VIPs")
    private java.util.List < String > VIPs;

    private GetEdgeContainerStagingDeployStatusResponseBody(Builder builder) {
        this.containersReady = builder.containersReady;
        this.creationTimestamp = builder.creationTimestamp;
        this.initialized = builder.initialized;
        this.phase = builder.phase;
        this.podRestartState = builder.podRestartState;
        this.ready = builder.ready;
        this.requestId = builder.requestId;
        this.scheduled = builder.scheduled;
        this.VIPs = builder.VIPs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerStagingDeployStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return containersReady
     */
    public String getContainersReady() {
        return this.containersReady;
    }

    /**
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * @return initialized
     */
    public String getInitialized() {
        return this.initialized;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return podRestartState
     */
    public PodRestartState getPodRestartState() {
        return this.podRestartState;
    }

    /**
     * @return ready
     */
    public String getReady() {
        return this.ready;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduled
     */
    public String getScheduled() {
        return this.scheduled;
    }

    /**
     * @return VIPs
     */
    public java.util.List < String > getVIPs() {
        return this.VIPs;
    }

    public static final class Builder {
        private String containersReady; 
        private String creationTimestamp; 
        private String initialized; 
        private String phase; 
        private PodRestartState podRestartState; 
        private String ready; 
        private String requestId; 
        private String scheduled; 
        private java.util.List < String > VIPs; 

        /**
         * ContainersReady.
         */
        public Builder containersReady(String containersReady) {
            this.containersReady = containersReady;
            return this;
        }

        /**
         * CreationTimestamp.
         */
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        /**
         * Initialized.
         */
        public Builder initialized(String initialized) {
            this.initialized = initialized;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * PodRestartState.
         */
        public Builder podRestartState(PodRestartState podRestartState) {
            this.podRestartState = podRestartState;
            return this;
        }

        /**
         * Ready.
         */
        public Builder ready(String ready) {
            this.ready = ready;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scheduled.
         */
        public Builder scheduled(String scheduled) {
            this.scheduled = scheduled;
            return this;
        }

        /**
         * VIPs.
         */
        public Builder VIPs(java.util.List < String > VIPs) {
            this.VIPs = VIPs;
            return this;
        }

        public GetEdgeContainerStagingDeployStatusResponseBody build() {
            return new GetEdgeContainerStagingDeployStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEdgeContainerStagingDeployStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerStagingDeployStatusResponseBody</p>
     */
    public static class PodRestartState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastTerminatedReason")
        private String lastTerminatedReason;

        @com.aliyun.core.annotation.NameInMap("RestartCount")
        private Integer restartCount;

        private PodRestartState(Builder builder) {
            this.lastTerminatedReason = builder.lastTerminatedReason;
            this.restartCount = builder.restartCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodRestartState create() {
            return builder().build();
        }

        /**
         * @return lastTerminatedReason
         */
        public String getLastTerminatedReason() {
            return this.lastTerminatedReason;
        }

        /**
         * @return restartCount
         */
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public static final class Builder {
            private String lastTerminatedReason; 
            private Integer restartCount; 

            /**
             * LastTerminatedReason.
             */
            public Builder lastTerminatedReason(String lastTerminatedReason) {
                this.lastTerminatedReason = lastTerminatedReason;
                return this;
            }

            /**
             * RestartCount.
             */
            public Builder restartCount(Integer restartCount) {
                this.restartCount = restartCount;
                return this;
            }

            public PodRestartState build() {
                return new PodRestartState(this);
            } 

        } 

    }
}
