// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private java.util.List<String> VIPs;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getVIPs() {
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
        private java.util.List<String> VIPs; 

        private Builder() {
        } 

        private Builder(GetEdgeContainerStagingDeployStatusResponseBody model) {
            this.containersReady = model.containersReady;
            this.creationTimestamp = model.creationTimestamp;
            this.initialized = model.initialized;
            this.phase = model.phase;
            this.podRestartState = model.podRestartState;
            this.ready = model.ready;
            this.requestId = model.requestId;
            this.scheduled = model.scheduled;
            this.VIPs = model.VIPs;
        } 

        /**
         * <p>Indicates whether the container status is ready. Valid values:</p>
         * <ul>
         * <li><p><strong>ok</strong>: Ready.</p>
         * </li>
         * <li><p><strong>unready</strong>: Not ready.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder containersReady(String containersReady) {
            this.containersReady = containersReady;
            return this;
        }

        /**
         * <p>The creation time (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-24T06:46:35Z</p>
         */
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        /**
         * <p>The container initialization status. Valid values:</p>
         * <ul>
         * <li><p><strong>ok</strong>: Succeeded.</p>
         * </li>
         * <li><p><strong>unready</strong>: Not completed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder initialized(String initialized) {
            this.initialized = initialized;
            return this;
        }

        /**
         * <p>The status of the container in the staging environment. Valid values:</p>
         * <ul>
         * <li>NoContainer: no container.</li>
         * <li>Pending: pending deployment.</li>
         * <li>ContainerCreating: the container is being created.</li>
         * <li>Running: running.</li>
         * <li>Succeeded: completed.</li>
         * <li>ImagePullBackOff: image pull failed.</li>
         * <li>CrashLoopBackOff: abnormal container startup.</li>
         * <li>Failed: failed.</li>
         * <li>Unknown: unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * <p>The container restart status.</p>
         */
        public Builder podRestartState(PodRestartState podRestartState) {
            this.podRestartState = podRestartState;
            return this;
        }

        /**
         * <p>Indicates whether the container is ready to receive traffic. Valid values:</p>
         * <ul>
         * <li><p><strong>ok</strong>: Ready.</p>
         * </li>
         * <li><p><strong>unready</strong>: Not ready.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder ready(String ready) {
            this.ready = ready;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F2C992B-3FE2-5EBB-A61F-F9DD4EB257DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The container scheduling status. Valid values:</p>
         * <ul>
         * <li><p><strong>ok</strong>: Succeeded.</p>
         * </li>
         * <li><p><strong>unready</strong>: Not completed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder scheduled(String scheduled) {
            this.scheduled = scheduled;
            return this;
        }

        /**
         * <p>The list of VIPs.</p>
         */
        public Builder VIPs(java.util.List<String> VIPs) {
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

            private Builder() {
            } 

            private Builder(PodRestartState model) {
                this.lastTerminatedReason = model.lastTerminatedReason;
                this.restartCount = model.restartCount;
            } 

            /**
             * <p>The reason for the last restart.</p>
             * 
             * <strong>example:</strong>
             * <p>OOMKilled</p>
             */
            public Builder lastTerminatedReason(String lastTerminatedReason) {
                this.lastTerminatedReason = lastTerminatedReason;
                return this;
            }

            /**
             * <p>The number of restarts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
