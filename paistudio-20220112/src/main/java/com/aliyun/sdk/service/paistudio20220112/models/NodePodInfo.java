// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link NodePodInfo} extends {@link TeaModel}
 *
 * <p>NodePodInfo</p>
 */
public class NodePodInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GPUIndexes")
    private java.util.List<Integer> GPUIndexes;

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
        this.GPUIndexes = builder.GPUIndexes;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return GPUIndexes
     */
    public java.util.List<Integer> getGPUIndexes() {
        return this.GPUIndexes;
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
        private java.util.List<Integer> GPUIndexes; 
        private String phase; 
        private String podIP; 
        private String podName; 
        private String podNamespace; 
        private ResourceAmount resourceSpec; 
        private String workloadId; 
        private String workloadType; 

        private Builder() {
        } 

        private Builder(NodePodInfo model) {
            this.GPUIndexes = model.GPUIndexes;
            this.phase = model.phase;
            this.podIP = model.podIP;
            this.podName = model.podName;
            this.podNamespace = model.podNamespace;
            this.resourceSpec = model.resourceSpec;
            this.workloadId = model.workloadId;
            this.workloadType = model.workloadType;
        } 

        /**
         * <p>The occupied GPU indexes.</p>
         */
        public Builder GPUIndexes(java.util.List<Integer> GPUIndexes) {
            this.GPUIndexes = GPUIndexes;
            return this;
        }

        /**
         * <p>The Pod status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * <p>The IP address of the Pod.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.2</p>
         */
        public Builder podIP(String podIP) {
            this.podIP = podIP;
            return this;
        }

        /**
         * <p>The Pod name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder podName(String podName) {
            this.podName = podName;
            return this;
        }

        /**
         * <p>The namespace of the Pod.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder podNamespace(String podNamespace) {
            this.podNamespace = podNamespace;
            return this;
        }

        /**
         * <p>The resource usage information.</p>
         */
        public Builder resourceSpec(ResourceAmount resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * <p>The task ID or service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc19de9s6vn3acr</p>
         */
        public Builder workloadId(String workloadId) {
            this.workloadId = workloadId;
            return this;
        }

        /**
         * <p>The sub-product that the Pod belongs to.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc</p>
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
