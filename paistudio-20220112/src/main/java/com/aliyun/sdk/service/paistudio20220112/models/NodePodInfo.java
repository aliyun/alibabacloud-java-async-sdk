// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NodePodInfo} extends {@link TeaModel}
 *
 * <p>NodePodInfo</p>
 */
public class NodePodInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("PodIP")
    private String podIP;

    @com.aliyun.core.annotation.NameInMap("PodName")
    private String podName;

    @com.aliyun.core.annotation.NameInMap("PodNamespace")
    private String podNamespace;

    @com.aliyun.core.annotation.NameInMap("ResourceSpec")
    private ResourceAmount resourceSpec;

    @com.aliyun.core.annotation.NameInMap("WorkloadId")
    private String workloadId;

    @com.aliyun.core.annotation.NameInMap("WorkloadType")
    private String workloadType;

    private NodePodInfo(Builder builder) {
        this.phase = builder.phase;
        this.podIP = builder.podIP;
        this.podName = builder.podName;
        this.podNamespace = builder.podNamespace;
        this.resourceSpec = builder.resourceSpec;
        this.workloadId = builder.workloadId;
        this.workloadType = builder.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodePodInfo create() {
        return builder().build();
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return podIP
     */
    public String getPodIP() {
        return this.podIP;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * @return podNamespace
     */
    public String getPodNamespace() {
        return this.podNamespace;
    }

    /**
     * @return resourceSpec
     */
    public ResourceAmount getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * @return workloadId
     */
    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @return workloadType
     */
    public String getWorkloadType() {
        return this.workloadType;
    }

    public static final class Builder {
        private String phase; 
        private String podIP; 
        private String podName; 
        private String podNamespace; 
        private ResourceAmount resourceSpec; 
        private String workloadId; 
        private String workloadType; 

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * PodIP.
         */
        public Builder podIP(String podIP) {
            this.podIP = podIP;
            return this;
        }

        /**
         * PodName.
         */
        public Builder podName(String podName) {
            this.podName = podName;
            return this;
        }

        /**
         * PodNamespace.
         */
        public Builder podNamespace(String podNamespace) {
            this.podNamespace = podNamespace;
            return this;
        }

        /**
         * ResourceSpec.
         */
        public Builder resourceSpec(ResourceAmount resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * WorkloadId.
         */
        public Builder workloadId(String workloadId) {
            this.workloadId = workloadId;
            return this;
        }

        /**
         * WorkloadType.
         */
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public NodePodInfo build() {
            return new NodePodInfo(this);
        } 

    } 

}
