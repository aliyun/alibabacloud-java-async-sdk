// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link KubeletConfig} extends {@link TeaModel}
 *
 * <p>KubeletConfig</p>
 */
public class KubeletConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowedUnsafeSysctls")
    private java.util.List<String> allowedUnsafeSysctls;

    @com.aliyun.core.annotation.NameInMap("clusterDNS")
    private java.util.List<String> clusterDNS;

    @com.aliyun.core.annotation.NameInMap("containerLogMaxFiles")
    private Long containerLogMaxFiles;

    @com.aliyun.core.annotation.NameInMap("containerLogMaxSize")
    private String containerLogMaxSize;

    @com.aliyun.core.annotation.NameInMap("containerLogMaxWorkers")
    private Integer containerLogMaxWorkers;

    @com.aliyun.core.annotation.NameInMap("containerLogMonitorInterval")
    private String containerLogMonitorInterval;

    @com.aliyun.core.annotation.NameInMap("cpuCFSQuota")
    private Boolean cpuCFSQuota;

    @com.aliyun.core.annotation.NameInMap("cpuCFSQuotaPeriod")
    private String cpuCFSQuotaPeriod;

    @com.aliyun.core.annotation.NameInMap("cpuManagerPolicy")
    private String cpuManagerPolicy;

    @com.aliyun.core.annotation.NameInMap("eventBurst")
    private Long eventBurst;

    @com.aliyun.core.annotation.NameInMap("eventRecordQPS")
    private Long eventRecordQPS;

    @com.aliyun.core.annotation.NameInMap("evictionHard")
    private java.util.Map<String, ?> evictionHard;

    @com.aliyun.core.annotation.NameInMap("evictionSoft")
    private java.util.Map<String, ?> evictionSoft;

    @com.aliyun.core.annotation.NameInMap("evictionSoftGracePeriod")
    private java.util.Map<String, ?> evictionSoftGracePeriod;

    @com.aliyun.core.annotation.NameInMap("featureGates")
    private java.util.Map<String, ?> featureGates;

    @com.aliyun.core.annotation.NameInMap("imageGCHighThresholdPercent")
    private Integer imageGCHighThresholdPercent;

    @com.aliyun.core.annotation.NameInMap("imageGCLowThresholdPercent")
    private Integer imageGCLowThresholdPercent;

    @com.aliyun.core.annotation.NameInMap("kubeAPIBurst")
    private Long kubeAPIBurst;

    @com.aliyun.core.annotation.NameInMap("kubeAPIQPS")
    private Long kubeAPIQPS;

    @com.aliyun.core.annotation.NameInMap("kubeReserved")
    private java.util.Map<String, ?> kubeReserved;

    @com.aliyun.core.annotation.NameInMap("maxPods")
    private Long maxPods;

    @com.aliyun.core.annotation.NameInMap("memoryManagerPolicy")
    private String memoryManagerPolicy;

    @com.aliyun.core.annotation.NameInMap("podPidsLimit")
    private Long podPidsLimit;

    @com.aliyun.core.annotation.NameInMap("readOnlyPort")
    private Long readOnlyPort;

    @com.aliyun.core.annotation.NameInMap("registryBurst")
    private Long registryBurst;

    @com.aliyun.core.annotation.NameInMap("registryPullQPS")
    private Long registryPullQPS;

    @com.aliyun.core.annotation.NameInMap("reservedMemory")
    private java.util.List<ReservedMemory> reservedMemory;

    @com.aliyun.core.annotation.NameInMap("serializeImagePulls")
    private Boolean serializeImagePulls;

    @com.aliyun.core.annotation.NameInMap("systemReserved")
    private java.util.Map<String, ?> systemReserved;

    @com.aliyun.core.annotation.NameInMap("topologyManagerPolicy")
    private String topologyManagerPolicy;

    @com.aliyun.core.annotation.NameInMap("tracing")
    private Tracing tracing;

    private KubeletConfig(Builder builder) {
        this.allowedUnsafeSysctls = builder.allowedUnsafeSysctls;
        this.clusterDNS = builder.clusterDNS;
        this.containerLogMaxFiles = builder.containerLogMaxFiles;
        this.containerLogMaxSize = builder.containerLogMaxSize;
        this.containerLogMaxWorkers = builder.containerLogMaxWorkers;
        this.containerLogMonitorInterval = builder.containerLogMonitorInterval;
        this.cpuCFSQuota = builder.cpuCFSQuota;
        this.cpuCFSQuotaPeriod = builder.cpuCFSQuotaPeriod;
        this.cpuManagerPolicy = builder.cpuManagerPolicy;
        this.eventBurst = builder.eventBurst;
        this.eventRecordQPS = builder.eventRecordQPS;
        this.evictionHard = builder.evictionHard;
        this.evictionSoft = builder.evictionSoft;
        this.evictionSoftGracePeriod = builder.evictionSoftGracePeriod;
        this.featureGates = builder.featureGates;
        this.imageGCHighThresholdPercent = builder.imageGCHighThresholdPercent;
        this.imageGCLowThresholdPercent = builder.imageGCLowThresholdPercent;
        this.kubeAPIBurst = builder.kubeAPIBurst;
        this.kubeAPIQPS = builder.kubeAPIQPS;
        this.kubeReserved = builder.kubeReserved;
        this.maxPods = builder.maxPods;
        this.memoryManagerPolicy = builder.memoryManagerPolicy;
        this.podPidsLimit = builder.podPidsLimit;
        this.readOnlyPort = builder.readOnlyPort;
        this.registryBurst = builder.registryBurst;
        this.registryPullQPS = builder.registryPullQPS;
        this.reservedMemory = builder.reservedMemory;
        this.serializeImagePulls = builder.serializeImagePulls;
        this.systemReserved = builder.systemReserved;
        this.topologyManagerPolicy = builder.topologyManagerPolicy;
        this.tracing = builder.tracing;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KubeletConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedUnsafeSysctls
     */
    public java.util.List<String> getAllowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls;
    }

    /**
     * @return clusterDNS
     */
    public java.util.List<String> getClusterDNS() {
        return this.clusterDNS;
    }

    /**
     * @return containerLogMaxFiles
     */
    public Long getContainerLogMaxFiles() {
        return this.containerLogMaxFiles;
    }

    /**
     * @return containerLogMaxSize
     */
    public String getContainerLogMaxSize() {
        return this.containerLogMaxSize;
    }

    /**
     * @return containerLogMaxWorkers
     */
    public Integer getContainerLogMaxWorkers() {
        return this.containerLogMaxWorkers;
    }

    /**
     * @return containerLogMonitorInterval
     */
    public String getContainerLogMonitorInterval() {
        return this.containerLogMonitorInterval;
    }

    /**
     * @return cpuCFSQuota
     */
    public Boolean getCpuCFSQuota() {
        return this.cpuCFSQuota;
    }

    /**
     * @return cpuCFSQuotaPeriod
     */
    public String getCpuCFSQuotaPeriod() {
        return this.cpuCFSQuotaPeriod;
    }

    /**
     * @return cpuManagerPolicy
     */
    public String getCpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    /**
     * @return eventBurst
     */
    public Long getEventBurst() {
        return this.eventBurst;
    }

    /**
     * @return eventRecordQPS
     */
    public Long getEventRecordQPS() {
        return this.eventRecordQPS;
    }

    /**
     * @return evictionHard
     */
    public java.util.Map<String, ?> getEvictionHard() {
        return this.evictionHard;
    }

    /**
     * @return evictionSoft
     */
    public java.util.Map<String, ?> getEvictionSoft() {
        return this.evictionSoft;
    }

    /**
     * @return evictionSoftGracePeriod
     */
    public java.util.Map<String, ?> getEvictionSoftGracePeriod() {
        return this.evictionSoftGracePeriod;
    }

    /**
     * @return featureGates
     */
    public java.util.Map<String, ?> getFeatureGates() {
        return this.featureGates;
    }

    /**
     * @return imageGCHighThresholdPercent
     */
    public Integer getImageGCHighThresholdPercent() {
        return this.imageGCHighThresholdPercent;
    }

    /**
     * @return imageGCLowThresholdPercent
     */
    public Integer getImageGCLowThresholdPercent() {
        return this.imageGCLowThresholdPercent;
    }

    /**
     * @return kubeAPIBurst
     */
    public Long getKubeAPIBurst() {
        return this.kubeAPIBurst;
    }

    /**
     * @return kubeAPIQPS
     */
    public Long getKubeAPIQPS() {
        return this.kubeAPIQPS;
    }

    /**
     * @return kubeReserved
     */
    public java.util.Map<String, ?> getKubeReserved() {
        return this.kubeReserved;
    }

    /**
     * @return maxPods
     */
    public Long getMaxPods() {
        return this.maxPods;
    }

    /**
     * @return memoryManagerPolicy
     */
    public String getMemoryManagerPolicy() {
        return this.memoryManagerPolicy;
    }

    /**
     * @return podPidsLimit
     */
    public Long getPodPidsLimit() {
        return this.podPidsLimit;
    }

    /**
     * @return readOnlyPort
     */
    public Long getReadOnlyPort() {
        return this.readOnlyPort;
    }

    /**
     * @return registryBurst
     */
    public Long getRegistryBurst() {
        return this.registryBurst;
    }

    /**
     * @return registryPullQPS
     */
    public Long getRegistryPullQPS() {
        return this.registryPullQPS;
    }

    /**
     * @return reservedMemory
     */
    public java.util.List<ReservedMemory> getReservedMemory() {
        return this.reservedMemory;
    }

    /**
     * @return serializeImagePulls
     */
    public Boolean getSerializeImagePulls() {
        return this.serializeImagePulls;
    }

    /**
     * @return systemReserved
     */
    public java.util.Map<String, ?> getSystemReserved() {
        return this.systemReserved;
    }

    /**
     * @return topologyManagerPolicy
     */
    public String getTopologyManagerPolicy() {
        return this.topologyManagerPolicy;
    }

    /**
     * @return tracing
     */
    public Tracing getTracing() {
        return this.tracing;
    }

    public static final class Builder {
        private java.util.List<String> allowedUnsafeSysctls; 
        private java.util.List<String> clusterDNS; 
        private Long containerLogMaxFiles; 
        private String containerLogMaxSize; 
        private Integer containerLogMaxWorkers; 
        private String containerLogMonitorInterval; 
        private Boolean cpuCFSQuota; 
        private String cpuCFSQuotaPeriod; 
        private String cpuManagerPolicy; 
        private Long eventBurst; 
        private Long eventRecordQPS; 
        private java.util.Map<String, ?> evictionHard; 
        private java.util.Map<String, ?> evictionSoft; 
        private java.util.Map<String, ?> evictionSoftGracePeriod; 
        private java.util.Map<String, ?> featureGates; 
        private Integer imageGCHighThresholdPercent; 
        private Integer imageGCLowThresholdPercent; 
        private Long kubeAPIBurst; 
        private Long kubeAPIQPS; 
        private java.util.Map<String, ?> kubeReserved; 
        private Long maxPods; 
        private String memoryManagerPolicy; 
        private Long podPidsLimit; 
        private Long readOnlyPort; 
        private Long registryBurst; 
        private Long registryPullQPS; 
        private java.util.List<ReservedMemory> reservedMemory; 
        private Boolean serializeImagePulls; 
        private java.util.Map<String, ?> systemReserved; 
        private String topologyManagerPolicy; 
        private Tracing tracing; 

        private Builder() {
        } 

        private Builder(KubeletConfig model) {
            this.allowedUnsafeSysctls = model.allowedUnsafeSysctls;
            this.clusterDNS = model.clusterDNS;
            this.containerLogMaxFiles = model.containerLogMaxFiles;
            this.containerLogMaxSize = model.containerLogMaxSize;
            this.containerLogMaxWorkers = model.containerLogMaxWorkers;
            this.containerLogMonitorInterval = model.containerLogMonitorInterval;
            this.cpuCFSQuota = model.cpuCFSQuota;
            this.cpuCFSQuotaPeriod = model.cpuCFSQuotaPeriod;
            this.cpuManagerPolicy = model.cpuManagerPolicy;
            this.eventBurst = model.eventBurst;
            this.eventRecordQPS = model.eventRecordQPS;
            this.evictionHard = model.evictionHard;
            this.evictionSoft = model.evictionSoft;
            this.evictionSoftGracePeriod = model.evictionSoftGracePeriod;
            this.featureGates = model.featureGates;
            this.imageGCHighThresholdPercent = model.imageGCHighThresholdPercent;
            this.imageGCLowThresholdPercent = model.imageGCLowThresholdPercent;
            this.kubeAPIBurst = model.kubeAPIBurst;
            this.kubeAPIQPS = model.kubeAPIQPS;
            this.kubeReserved = model.kubeReserved;
            this.maxPods = model.maxPods;
            this.memoryManagerPolicy = model.memoryManagerPolicy;
            this.podPidsLimit = model.podPidsLimit;
            this.readOnlyPort = model.readOnlyPort;
            this.registryBurst = model.registryBurst;
            this.registryPullQPS = model.registryPullQPS;
            this.reservedMemory = model.reservedMemory;
            this.serializeImagePulls = model.serializeImagePulls;
            this.systemReserved = model.systemReserved;
            this.topologyManagerPolicy = model.topologyManagerPolicy;
            this.tracing = model.tracing;
        } 

        /**
         * allowedUnsafeSysctls.
         */
        public Builder allowedUnsafeSysctls(java.util.List<String> allowedUnsafeSysctls) {
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }

        /**
         * clusterDNS.
         */
        public Builder clusterDNS(java.util.List<String> clusterDNS) {
            this.clusterDNS = clusterDNS;
            return this;
        }

        /**
         * containerLogMaxFiles.
         */
        public Builder containerLogMaxFiles(Long containerLogMaxFiles) {
            this.containerLogMaxFiles = containerLogMaxFiles;
            return this;
        }

        /**
         * containerLogMaxSize.
         */
        public Builder containerLogMaxSize(String containerLogMaxSize) {
            this.containerLogMaxSize = containerLogMaxSize;
            return this;
        }

        /**
         * containerLogMaxWorkers.
         */
        public Builder containerLogMaxWorkers(Integer containerLogMaxWorkers) {
            this.containerLogMaxWorkers = containerLogMaxWorkers;
            return this;
        }

        /**
         * containerLogMonitorInterval.
         */
        public Builder containerLogMonitorInterval(String containerLogMonitorInterval) {
            this.containerLogMonitorInterval = containerLogMonitorInterval;
            return this;
        }

        /**
         * cpuCFSQuota.
         */
        public Builder cpuCFSQuota(Boolean cpuCFSQuota) {
            this.cpuCFSQuota = cpuCFSQuota;
            return this;
        }

        /**
         * cpuCFSQuotaPeriod.
         */
        public Builder cpuCFSQuotaPeriod(String cpuCFSQuotaPeriod) {
            this.cpuCFSQuotaPeriod = cpuCFSQuotaPeriod;
            return this;
        }

        /**
         * cpuManagerPolicy.
         */
        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }

        /**
         * eventBurst.
         */
        public Builder eventBurst(Long eventBurst) {
            this.eventBurst = eventBurst;
            return this;
        }

        /**
         * eventRecordQPS.
         */
        public Builder eventRecordQPS(Long eventRecordQPS) {
            this.eventRecordQPS = eventRecordQPS;
            return this;
        }

        /**
         * evictionHard.
         */
        public Builder evictionHard(java.util.Map<String, ?> evictionHard) {
            this.evictionHard = evictionHard;
            return this;
        }

        /**
         * evictionSoft.
         */
        public Builder evictionSoft(java.util.Map<String, ?> evictionSoft) {
            this.evictionSoft = evictionSoft;
            return this;
        }

        /**
         * evictionSoftGracePeriod.
         */
        public Builder evictionSoftGracePeriod(java.util.Map<String, ?> evictionSoftGracePeriod) {
            this.evictionSoftGracePeriod = evictionSoftGracePeriod;
            return this;
        }

        /**
         * featureGates.
         */
        public Builder featureGates(java.util.Map<String, ?> featureGates) {
            this.featureGates = featureGates;
            return this;
        }

        /**
         * imageGCHighThresholdPercent.
         */
        public Builder imageGCHighThresholdPercent(Integer imageGCHighThresholdPercent) {
            this.imageGCHighThresholdPercent = imageGCHighThresholdPercent;
            return this;
        }

        /**
         * imageGCLowThresholdPercent.
         */
        public Builder imageGCLowThresholdPercent(Integer imageGCLowThresholdPercent) {
            this.imageGCLowThresholdPercent = imageGCLowThresholdPercent;
            return this;
        }

        /**
         * kubeAPIBurst.
         */
        public Builder kubeAPIBurst(Long kubeAPIBurst) {
            this.kubeAPIBurst = kubeAPIBurst;
            return this;
        }

        /**
         * kubeAPIQPS.
         */
        public Builder kubeAPIQPS(Long kubeAPIQPS) {
            this.kubeAPIQPS = kubeAPIQPS;
            return this;
        }

        /**
         * kubeReserved.
         */
        public Builder kubeReserved(java.util.Map<String, ?> kubeReserved) {
            this.kubeReserved = kubeReserved;
            return this;
        }

        /**
         * maxPods.
         */
        public Builder maxPods(Long maxPods) {
            this.maxPods = maxPods;
            return this;
        }

        /**
         * memoryManagerPolicy.
         */
        public Builder memoryManagerPolicy(String memoryManagerPolicy) {
            this.memoryManagerPolicy = memoryManagerPolicy;
            return this;
        }

        /**
         * podPidsLimit.
         */
        public Builder podPidsLimit(Long podPidsLimit) {
            this.podPidsLimit = podPidsLimit;
            return this;
        }

        /**
         * readOnlyPort.
         */
        public Builder readOnlyPort(Long readOnlyPort) {
            this.readOnlyPort = readOnlyPort;
            return this;
        }

        /**
         * registryBurst.
         */
        public Builder registryBurst(Long registryBurst) {
            this.registryBurst = registryBurst;
            return this;
        }

        /**
         * registryPullQPS.
         */
        public Builder registryPullQPS(Long registryPullQPS) {
            this.registryPullQPS = registryPullQPS;
            return this;
        }

        /**
         * reservedMemory.
         */
        public Builder reservedMemory(java.util.List<ReservedMemory> reservedMemory) {
            this.reservedMemory = reservedMemory;
            return this;
        }

        /**
         * serializeImagePulls.
         */
        public Builder serializeImagePulls(Boolean serializeImagePulls) {
            this.serializeImagePulls = serializeImagePulls;
            return this;
        }

        /**
         * systemReserved.
         */
        public Builder systemReserved(java.util.Map<String, ?> systemReserved) {
            this.systemReserved = systemReserved;
            return this;
        }

        /**
         * topologyManagerPolicy.
         */
        public Builder topologyManagerPolicy(String topologyManagerPolicy) {
            this.topologyManagerPolicy = topologyManagerPolicy;
            return this;
        }

        /**
         * tracing.
         */
        public Builder tracing(Tracing tracing) {
            this.tracing = tracing;
            return this;
        }

        public KubeletConfig build() {
            return new KubeletConfig(this);
        } 

    } 

    /**
     * 
     * {@link KubeletConfig} extends {@link TeaModel}
     *
     * <p>KubeletConfig</p>
     */
    public static class ReservedMemory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limits")
        private java.util.Map<String, ?> limits;

        @com.aliyun.core.annotation.NameInMap("numaNode")
        private Integer numaNode;

        private ReservedMemory(Builder builder) {
            this.limits = builder.limits;
            this.numaNode = builder.numaNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedMemory create() {
            return builder().build();
        }

        /**
         * @return limits
         */
        public java.util.Map<String, ?> getLimits() {
            return this.limits;
        }

        /**
         * @return numaNode
         */
        public Integer getNumaNode() {
            return this.numaNode;
        }

        public static final class Builder {
            private java.util.Map<String, ?> limits; 
            private Integer numaNode; 

            private Builder() {
            } 

            private Builder(ReservedMemory model) {
                this.limits = model.limits;
                this.numaNode = model.numaNode;
            } 

            /**
             * limits.
             */
            public Builder limits(java.util.Map<String, ?> limits) {
                this.limits = limits;
                return this;
            }

            /**
             * numaNode.
             */
            public Builder numaNode(Integer numaNode) {
                this.numaNode = numaNode;
                return this;
            }

            public ReservedMemory build() {
                return new ReservedMemory(this);
            } 

        } 

    }
    /**
     * 
     * {@link KubeletConfig} extends {@link TeaModel}
     *
     * <p>KubeletConfig</p>
     */
    public static class Tracing extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("samplingRatePerMillion")
        private Integer samplingRatePerMillion;

        private Tracing(Builder builder) {
            this.endpoint = builder.endpoint;
            this.samplingRatePerMillion = builder.samplingRatePerMillion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tracing create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return samplingRatePerMillion
         */
        public Integer getSamplingRatePerMillion() {
            return this.samplingRatePerMillion;
        }

        public static final class Builder {
            private String endpoint; 
            private Integer samplingRatePerMillion; 

            private Builder() {
            } 

            private Builder(Tracing model) {
                this.endpoint = model.endpoint;
                this.samplingRatePerMillion = model.samplingRatePerMillion;
            } 

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * samplingRatePerMillion.
             */
            public Builder samplingRatePerMillion(Integer samplingRatePerMillion) {
                this.samplingRatePerMillion = samplingRatePerMillion;
                return this;
            }

            public Tracing build() {
                return new Tracing(this);
            } 

        } 

    }
}
