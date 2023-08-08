// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNodePoolNodeConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyNodePoolNodeConfigRequest</p>
 */
public class ModifyNodePoolNodeConfigRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("NodepoolId")
    @Validation(required = true)
    private String nodepoolId;

    @Body
    @NameInMap("kubelet_config")
    private KubeletConfig kubeletConfig;

    @Body
    @NameInMap("rolling_policy")
    private RollingPolicy rollingPolicy;

    private ModifyNodePoolNodeConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.kubeletConfig = builder.kubeletConfig;
        this.rollingPolicy = builder.rollingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNodePoolNodeConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return kubeletConfig
     */
    public KubeletConfig getKubeletConfig() {
        return this.kubeletConfig;
    }

    /**
     * @return rollingPolicy
     */
    public RollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public static final class Builder extends Request.Builder<ModifyNodePoolNodeConfigRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private KubeletConfig kubeletConfig; 
        private RollingPolicy rollingPolicy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNodePoolNodeConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.kubeletConfig = request.kubeletConfig;
            this.rollingPolicy = request.rollingPolicy;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * NodepoolId.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * kubelet_config.
         */
        public Builder kubeletConfig(KubeletConfig kubeletConfig) {
            this.putBodyParameter("kubelet_config", kubeletConfig);
            this.kubeletConfig = kubeletConfig;
            return this;
        }

        /**
         * rolling_policy.
         */
        public Builder rollingPolicy(RollingPolicy rollingPolicy) {
            this.putBodyParameter("rolling_policy", rollingPolicy);
            this.rollingPolicy = rollingPolicy;
            return this;
        }

        @Override
        public ModifyNodePoolNodeConfigRequest build() {
            return new ModifyNodePoolNodeConfigRequest(this);
        } 

    } 

    public static class KubeletConfig extends TeaModel {
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

        @NameInMap("kubeAPIBurst")
        private Long kubeAPIBurst;

        @NameInMap("kubeAPIQPS")
        private Long kubeAPIQPS;

        @NameInMap("kubeReserved")
        private java.util.Map < String, ? > kubeReserved;

        @NameInMap("registryBurst")
        private Long registryBurst;

        @NameInMap("registryPullQPS")
        private Long registryPullQPS;

        @NameInMap("serializeImagePulls")
        private Boolean serializeImagePulls;

        @NameInMap("systemReserved")
        private java.util.Map < String, ? > systemReserved;

        private KubeletConfig(Builder builder) {
            this.cpuManagerPolicy = builder.cpuManagerPolicy;
            this.eventBurst = builder.eventBurst;
            this.eventRecordQPS = builder.eventRecordQPS;
            this.evictionHard = builder.evictionHard;
            this.evictionSoft = builder.evictionSoft;
            this.evictionSoftGracePeriod = builder.evictionSoftGracePeriod;
            this.kubeAPIBurst = builder.kubeAPIBurst;
            this.kubeAPIQPS = builder.kubeAPIQPS;
            this.kubeReserved = builder.kubeReserved;
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
            private String cpuManagerPolicy; 
            private Long eventBurst; 
            private Long eventRecordQPS; 
            private java.util.Map < String, ? > evictionHard; 
            private java.util.Map < String, ? > evictionSoft; 
            private java.util.Map < String, ? > evictionSoftGracePeriod; 
            private Long kubeAPIBurst; 
            private Long kubeAPIQPS; 
            private java.util.Map < String, ? > kubeReserved; 
            private Long registryBurst; 
            private Long registryPullQPS; 
            private Boolean serializeImagePulls; 
            private java.util.Map < String, ? > systemReserved; 

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
    public static class RollingPolicy extends TeaModel {
        @NameInMap("max_parallelism")
        private Long maxParallelism;

        private RollingPolicy(Builder builder) {
            this.maxParallelism = builder.maxParallelism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RollingPolicy create() {
            return builder().build();
        }

        /**
         * @return maxParallelism
         */
        public Long getMaxParallelism() {
            return this.maxParallelism;
        }

        public static final class Builder {
            private Long maxParallelism; 

            /**
             * max_parallelism.
             */
            public Builder maxParallelism(Long maxParallelism) {
                this.maxParallelism = maxParallelism;
                return this;
            }

            public RollingPolicy build() {
                return new RollingPolicy(this);
            } 

        } 

    }
}
