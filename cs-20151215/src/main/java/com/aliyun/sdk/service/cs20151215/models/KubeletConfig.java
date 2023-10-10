// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KubeletConfig} extends {@link TeaModel}
 *
 * <p>KubeletConfig</p>
 */
public class KubeletConfig extends TeaModel {
    @NameInMap("allowedUnsafeSysctls")
    private java.util.List < String > allowedUnsafeSysctls;

    @NameInMap("containerLogMaxFiles")
    private Long containerLogMaxFiles;

    @NameInMap("containerLogMaxSize")
    private String containerLogMaxSize;

    @NameInMap("cpuManagerPolicy")
    private String cpuManagerPolicy;

    @NameInMap("eventBurst")
    private Long eventBurst;

    @NameInMap("eventRecordQPS")
    private Long eventRecordQPS;

    @NameInMap("evictionHard")
    private java.util.Map < String, ? > evictionHard;

    @NameInMap("evictionSoft")
    private java.util.Map < String, ? > evictionSoft;

    @NameInMap("evictionSoftGracePeriod")
    private java.util.Map < String, ? > evictionSoftGracePeriod;

    @NameInMap("featureGates")
    private java.util.Map < String, ? > featureGates;

    @NameInMap("kubeAPIBurst")
    private Long kubeAPIBurst;

    @NameInMap("kubeAPIQPS")
    private Long kubeAPIQPS;

    @NameInMap("kubeReserved")
    private java.util.Map < String, ? > kubeReserved;

    @NameInMap("maxPods")
    private Long maxPods;

    @NameInMap("readOnlyPort")
    private Long readOnlyPort;

    @NameInMap("registryBurst")
    private Long registryBurst;

    @NameInMap("registryPullQPS")
    private Long registryPullQPS;

    @NameInMap("serializeImagePulls")
    private Boolean serializeImagePulls;

    @NameInMap("systemReserved")
    private java.util.Map < String, ? > systemReserved;

    private KubeletConfig(Builder builder) {
        this.allowedUnsafeSysctls = builder.allowedUnsafeSysctls;
        this.containerLogMaxFiles = builder.containerLogMaxFiles;
        this.containerLogMaxSize = builder.containerLogMaxSize;
        this.cpuManagerPolicy = builder.cpuManagerPolicy;
        this.eventBurst = builder.eventBurst;
        this.eventRecordQPS = builder.eventRecordQPS;
        this.evictionHard = builder.evictionHard;
        this.evictionSoft = builder.evictionSoft;
        this.evictionSoftGracePeriod = builder.evictionSoftGracePeriod;
        this.featureGates = builder.featureGates;
        this.kubeAPIBurst = builder.kubeAPIBurst;
        this.kubeAPIQPS = builder.kubeAPIQPS;
        this.kubeReserved = builder.kubeReserved;
        this.maxPods = builder.maxPods;
        this.readOnlyPort = builder.readOnlyPort;
        this.registryBurst = builder.registryBurst;
        this.registryPullQPS = builder.registryPullQPS;
        this.serializeImagePulls = builder.serializeImagePulls;
        this.systemReserved = builder.systemReserved;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KubeletConfig create() {
        return builder().build();
    }

    /**
     * @return allowedUnsafeSysctls
     */
    public java.util.List < String > getAllowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls;
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
    public java.util.Map < String, ? > getEvictionHard() {
        return this.evictionHard;
    }

    /**
     * @return evictionSoft
     */
    public java.util.Map < String, ? > getEvictionSoft() {
        return this.evictionSoft;
    }

    /**
     * @return evictionSoftGracePeriod
     */
    public java.util.Map < String, ? > getEvictionSoftGracePeriod() {
        return this.evictionSoftGracePeriod;
    }

    /**
     * @return featureGates
     */
    public java.util.Map < String, ? > getFeatureGates() {
        return this.featureGates;
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
    public java.util.Map < String, ? > getKubeReserved() {
        return this.kubeReserved;
    }

    /**
     * @return maxPods
     */
    public Long getMaxPods() {
        return this.maxPods;
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
     * @return serializeImagePulls
     */
    public Boolean getSerializeImagePulls() {
        return this.serializeImagePulls;
    }

    /**
     * @return systemReserved
     */
    public java.util.Map < String, ? > getSystemReserved() {
        return this.systemReserved;
    }

    public static final class Builder {
        private java.util.List < String > allowedUnsafeSysctls; 
        private Long containerLogMaxFiles; 
        private String containerLogMaxSize; 
        private String cpuManagerPolicy; 
        private Long eventBurst; 
        private Long eventRecordQPS; 
        private java.util.Map < String, ? > evictionHard; 
        private java.util.Map < String, ? > evictionSoft; 
        private java.util.Map < String, ? > evictionSoftGracePeriod; 
        private java.util.Map < String, ? > featureGates; 
        private Long kubeAPIBurst; 
        private Long kubeAPIQPS; 
        private java.util.Map < String, ? > kubeReserved; 
        private Long maxPods; 
        private Long readOnlyPort; 
        private Long registryBurst; 
        private Long registryPullQPS; 
        private Boolean serializeImagePulls; 
        private java.util.Map < String, ? > systemReserved; 

        /**
         * allowedUnsafeSysctls.
         */
        public Builder allowedUnsafeSysctls(java.util.List < String > allowedUnsafeSysctls) {
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
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
        public Builder evictionHard(java.util.Map < String, ? > evictionHard) {
            this.evictionHard = evictionHard;
            return this;
        }

        /**
         * evictionSoft.
         */
        public Builder evictionSoft(java.util.Map < String, ? > evictionSoft) {
            this.evictionSoft = evictionSoft;
            return this;
        }

        /**
         * evictionSoftGracePeriod.
         */
        public Builder evictionSoftGracePeriod(java.util.Map < String, ? > evictionSoftGracePeriod) {
            this.evictionSoftGracePeriod = evictionSoftGracePeriod;
            return this;
        }

        /**
         * featureGates.
         */
        public Builder featureGates(java.util.Map < String, ? > featureGates) {
            this.featureGates = featureGates;
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
        public Builder kubeReserved(java.util.Map < String, ? > kubeReserved) {
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
         * serializeImagePulls.
         */
        public Builder serializeImagePulls(Boolean serializeImagePulls) {
            this.serializeImagePulls = serializeImagePulls;
            return this;
        }

        /**
         * systemReserved.
         */
        public Builder systemReserved(java.util.Map < String, ? > systemReserved) {
            this.systemReserved = systemReserved;
            return this;
        }

        public KubeletConfig build() {
            return new KubeletConfig(this);
        } 

    } 

}
