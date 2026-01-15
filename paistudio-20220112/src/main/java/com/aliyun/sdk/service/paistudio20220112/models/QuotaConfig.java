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
 * {@link QuotaConfig} extends {@link TeaModel}
 *
 * <p>QuotaConfig</p>
 */
public class QuotaConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ACS")
    private ACS ACS;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ControlPlaneClusterId")
    private String controlPlaneClusterId;

    @com.aliyun.core.annotation.NameInMap("DefaultGPUDriver")
    private String defaultGPUDriver;

    @com.aliyun.core.annotation.NameInMap("EnableGPUShare")
    private Boolean enableGPUShare;

    @com.aliyun.core.annotation.NameInMap("EnablePreemptSubquotaWorkloads")
    private Boolean enablePreemptSubquotaWorkloads;

    @com.aliyun.core.annotation.NameInMap("EnableSelfQuotaPreemption")
    private Boolean enableSelfQuotaPreemption;

    @com.aliyun.core.annotation.NameInMap("EnableSubQuotaPreemption")
    private Boolean enableSubQuotaPreemption;

    @com.aliyun.core.annotation.NameInMap("EniCacheConfig")
    private EniCacheConfig eniCacheConfig;

    @com.aliyun.core.annotation.NameInMap("OversoldUsageConfig")
    private OversoldUsageConfig oversoldUsageConfig;

    @com.aliyun.core.annotation.NameInMap("ResourceSpecs")
    private java.util.List<WorkspaceSpecs> resourceSpecs;

    @com.aliyun.core.annotation.NameInMap("SandboxCacheConfig")
    private SandboxCacheConfig sandboxCacheConfig;

    @com.aliyun.core.annotation.NameInMap("SelfQuotaPreemptionConfig")
    private SelfQuotaPreemptionConfig selfQuotaPreemptionConfig;

    @com.aliyun.core.annotation.NameInMap("SubQuotaPreemptionConfig")
    private SubQuotaPreemptionConfig subQuotaPreemptionConfig;

    @com.aliyun.core.annotation.NameInMap("SupportGPUDrivers")
    private java.util.List<String> supportGPUDrivers;

    @com.aliyun.core.annotation.NameInMap("SupportRDMA")
    private Boolean supportRDMA;

    @com.aliyun.core.annotation.NameInMap("UseCase")
    private String useCase;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    private QuotaConfig(Builder builder) {
        this.ACS = builder.ACS;
        this.clusterId = builder.clusterId;
        this.controlPlaneClusterId = builder.controlPlaneClusterId;
        this.defaultGPUDriver = builder.defaultGPUDriver;
        this.enableGPUShare = builder.enableGPUShare;
        this.enablePreemptSubquotaWorkloads = builder.enablePreemptSubquotaWorkloads;
        this.enableSelfQuotaPreemption = builder.enableSelfQuotaPreemption;
        this.enableSubQuotaPreemption = builder.enableSubQuotaPreemption;
        this.eniCacheConfig = builder.eniCacheConfig;
        this.oversoldUsageConfig = builder.oversoldUsageConfig;
        this.resourceSpecs = builder.resourceSpecs;
        this.sandboxCacheConfig = builder.sandboxCacheConfig;
        this.selfQuotaPreemptionConfig = builder.selfQuotaPreemptionConfig;
        this.subQuotaPreemptionConfig = builder.subQuotaPreemptionConfig;
        this.supportGPUDrivers = builder.supportGPUDrivers;
        this.supportRDMA = builder.supportRDMA;
        this.useCase = builder.useCase;
        this.userVpc = builder.userVpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ACS
     */
    public ACS getACS() {
        return this.ACS;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return controlPlaneClusterId
     */
    public String getControlPlaneClusterId() {
        return this.controlPlaneClusterId;
    }

    /**
     * @return defaultGPUDriver
     */
    public String getDefaultGPUDriver() {
        return this.defaultGPUDriver;
    }

    /**
     * @return enableGPUShare
     */
    public Boolean getEnableGPUShare() {
        return this.enableGPUShare;
    }

    /**
     * @return enablePreemptSubquotaWorkloads
     */
    public Boolean getEnablePreemptSubquotaWorkloads() {
        return this.enablePreemptSubquotaWorkloads;
    }

    /**
     * @return enableSelfQuotaPreemption
     */
    public Boolean getEnableSelfQuotaPreemption() {
        return this.enableSelfQuotaPreemption;
    }

    /**
     * @return enableSubQuotaPreemption
     */
    public Boolean getEnableSubQuotaPreemption() {
        return this.enableSubQuotaPreemption;
    }

    /**
     * @return eniCacheConfig
     */
    public EniCacheConfig getEniCacheConfig() {
        return this.eniCacheConfig;
    }

    /**
     * @return oversoldUsageConfig
     */
    public OversoldUsageConfig getOversoldUsageConfig() {
        return this.oversoldUsageConfig;
    }

    /**
     * @return resourceSpecs
     */
    public java.util.List<WorkspaceSpecs> getResourceSpecs() {
        return this.resourceSpecs;
    }

    /**
     * @return sandboxCacheConfig
     */
    public SandboxCacheConfig getSandboxCacheConfig() {
        return this.sandboxCacheConfig;
    }

    /**
     * @return selfQuotaPreemptionConfig
     */
    public SelfQuotaPreemptionConfig getSelfQuotaPreemptionConfig() {
        return this.selfQuotaPreemptionConfig;
    }

    /**
     * @return subQuotaPreemptionConfig
     */
    public SubQuotaPreemptionConfig getSubQuotaPreemptionConfig() {
        return this.subQuotaPreemptionConfig;
    }

    /**
     * @return supportGPUDrivers
     */
    public java.util.List<String> getSupportGPUDrivers() {
        return this.supportGPUDrivers;
    }

    /**
     * @return supportRDMA
     */
    public Boolean getSupportRDMA() {
        return this.supportRDMA;
    }

    /**
     * @return useCase
     */
    public String getUseCase() {
        return this.useCase;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static final class Builder {
        private ACS ACS; 
        private String clusterId; 
        private String controlPlaneClusterId; 
        private String defaultGPUDriver; 
        private Boolean enableGPUShare; 
        private Boolean enablePreemptSubquotaWorkloads; 
        private Boolean enableSelfQuotaPreemption; 
        private Boolean enableSubQuotaPreemption; 
        private EniCacheConfig eniCacheConfig; 
        private OversoldUsageConfig oversoldUsageConfig; 
        private java.util.List<WorkspaceSpecs> resourceSpecs; 
        private SandboxCacheConfig sandboxCacheConfig; 
        private SelfQuotaPreemptionConfig selfQuotaPreemptionConfig; 
        private SubQuotaPreemptionConfig subQuotaPreemptionConfig; 
        private java.util.List<String> supportGPUDrivers; 
        private Boolean supportRDMA; 
        private String useCase; 
        private UserVpc userVpc; 

        private Builder() {
        } 

        private Builder(QuotaConfig model) {
            this.ACS = model.ACS;
            this.clusterId = model.clusterId;
            this.controlPlaneClusterId = model.controlPlaneClusterId;
            this.defaultGPUDriver = model.defaultGPUDriver;
            this.enableGPUShare = model.enableGPUShare;
            this.enablePreemptSubquotaWorkloads = model.enablePreemptSubquotaWorkloads;
            this.enableSelfQuotaPreemption = model.enableSelfQuotaPreemption;
            this.enableSubQuotaPreemption = model.enableSubQuotaPreemption;
            this.eniCacheConfig = model.eniCacheConfig;
            this.oversoldUsageConfig = model.oversoldUsageConfig;
            this.resourceSpecs = model.resourceSpecs;
            this.sandboxCacheConfig = model.sandboxCacheConfig;
            this.selfQuotaPreemptionConfig = model.selfQuotaPreemptionConfig;
            this.subQuotaPreemptionConfig = model.subQuotaPreemptionConfig;
            this.supportGPUDrivers = model.supportGPUDrivers;
            this.supportRDMA = model.supportRDMA;
            this.useCase = model.useCase;
            this.userVpc = model.userVpc;
        } 

        /**
         * ACS.
         */
        public Builder ACS(ACS ACS) {
            this.ACS = ACS;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ControlPlaneClusterId.
         */
        public Builder controlPlaneClusterId(String controlPlaneClusterId) {
            this.controlPlaneClusterId = controlPlaneClusterId;
            return this;
        }

        /**
         * DefaultGPUDriver.
         */
        public Builder defaultGPUDriver(String defaultGPUDriver) {
            this.defaultGPUDriver = defaultGPUDriver;
            return this;
        }

        /**
         * EnableGPUShare.
         */
        public Builder enableGPUShare(Boolean enableGPUShare) {
            this.enableGPUShare = enableGPUShare;
            return this;
        }

        /**
         * EnablePreemptSubquotaWorkloads.
         */
        public Builder enablePreemptSubquotaWorkloads(Boolean enablePreemptSubquotaWorkloads) {
            this.enablePreemptSubquotaWorkloads = enablePreemptSubquotaWorkloads;
            return this;
        }

        /**
         * EnableSelfQuotaPreemption.
         */
        public Builder enableSelfQuotaPreemption(Boolean enableSelfQuotaPreemption) {
            this.enableSelfQuotaPreemption = enableSelfQuotaPreemption;
            return this;
        }

        /**
         * EnableSubQuotaPreemption.
         */
        public Builder enableSubQuotaPreemption(Boolean enableSubQuotaPreemption) {
            this.enableSubQuotaPreemption = enableSubQuotaPreemption;
            return this;
        }

        /**
         * EniCacheConfig.
         */
        public Builder eniCacheConfig(EniCacheConfig eniCacheConfig) {
            this.eniCacheConfig = eniCacheConfig;
            return this;
        }

        /**
         * OversoldUsageConfig.
         */
        public Builder oversoldUsageConfig(OversoldUsageConfig oversoldUsageConfig) {
            this.oversoldUsageConfig = oversoldUsageConfig;
            return this;
        }

        /**
         * ResourceSpecs.
         */
        public Builder resourceSpecs(java.util.List<WorkspaceSpecs> resourceSpecs) {
            this.resourceSpecs = resourceSpecs;
            return this;
        }

        /**
         * SandboxCacheConfig.
         */
        public Builder sandboxCacheConfig(SandboxCacheConfig sandboxCacheConfig) {
            this.sandboxCacheConfig = sandboxCacheConfig;
            return this;
        }

        /**
         * SelfQuotaPreemptionConfig.
         */
        public Builder selfQuotaPreemptionConfig(SelfQuotaPreemptionConfig selfQuotaPreemptionConfig) {
            this.selfQuotaPreemptionConfig = selfQuotaPreemptionConfig;
            return this;
        }

        /**
         * SubQuotaPreemptionConfig.
         */
        public Builder subQuotaPreemptionConfig(SubQuotaPreemptionConfig subQuotaPreemptionConfig) {
            this.subQuotaPreemptionConfig = subQuotaPreemptionConfig;
            return this;
        }

        /**
         * SupportGPUDrivers.
         */
        public Builder supportGPUDrivers(java.util.List<String> supportGPUDrivers) {
            this.supportGPUDrivers = supportGPUDrivers;
            return this;
        }

        /**
         * SupportRDMA.
         */
        public Builder supportRDMA(Boolean supportRDMA) {
            this.supportRDMA = supportRDMA;
            return this;
        }

        /**
         * UseCase.
         */
        public Builder useCase(String useCase) {
            this.useCase = useCase;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        public QuotaConfig build() {
            return new QuotaConfig(this);
        } 

    } 

}
