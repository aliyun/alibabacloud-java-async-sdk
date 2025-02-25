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

    @com.aliyun.core.annotation.NameInMap("DefaultGPUDriver")
    private String defaultGPUDriver;

    @com.aliyun.core.annotation.NameInMap("EnablePreemptSubquotaWorkloads")
    private Boolean enablePreemptSubquotaWorkloads;

    @com.aliyun.core.annotation.NameInMap("EnableSubQuotaPreemption")
    private Boolean enableSubQuotaPreemption;

    @com.aliyun.core.annotation.NameInMap("ResourceSpecs")
    private java.util.List<WorkspaceSpecs> resourceSpecs;

    @com.aliyun.core.annotation.NameInMap("SubQuotaPreemptionConfig")
    private SubQuotaPreemptionConfig subQuotaPreemptionConfig;

    @com.aliyun.core.annotation.NameInMap("SupportGPUDrivers")
    private java.util.List<String> supportGPUDrivers;

    @com.aliyun.core.annotation.NameInMap("SupportRDMA")
    private Boolean supportRDMA;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    private QuotaConfig(Builder builder) {
        this.ACS = builder.ACS;
        this.clusterId = builder.clusterId;
        this.defaultGPUDriver = builder.defaultGPUDriver;
        this.enablePreemptSubquotaWorkloads = builder.enablePreemptSubquotaWorkloads;
        this.enableSubQuotaPreemption = builder.enableSubQuotaPreemption;
        this.resourceSpecs = builder.resourceSpecs;
        this.subQuotaPreemptionConfig = builder.subQuotaPreemptionConfig;
        this.supportGPUDrivers = builder.supportGPUDrivers;
        this.supportRDMA = builder.supportRDMA;
        this.userVpc = builder.userVpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaConfig create() {
        return builder().build();
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
     * @return defaultGPUDriver
     */
    public String getDefaultGPUDriver() {
        return this.defaultGPUDriver;
    }

    /**
     * @return enablePreemptSubquotaWorkloads
     */
    public Boolean getEnablePreemptSubquotaWorkloads() {
        return this.enablePreemptSubquotaWorkloads;
    }

    /**
     * @return enableSubQuotaPreemption
     */
    public Boolean getEnableSubQuotaPreemption() {
        return this.enableSubQuotaPreemption;
    }

    /**
     * @return resourceSpecs
     */
    public java.util.List<WorkspaceSpecs> getResourceSpecs() {
        return this.resourceSpecs;
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
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static final class Builder {
        private ACS ACS; 
        private String clusterId; 
        private String defaultGPUDriver; 
        private Boolean enablePreemptSubquotaWorkloads; 
        private Boolean enableSubQuotaPreemption; 
        private java.util.List<WorkspaceSpecs> resourceSpecs; 
        private SubQuotaPreemptionConfig subQuotaPreemptionConfig; 
        private java.util.List<String> supportGPUDrivers; 
        private Boolean supportRDMA; 
        private UserVpc userVpc; 

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
         * DefaultGPUDriver.
         */
        public Builder defaultGPUDriver(String defaultGPUDriver) {
            this.defaultGPUDriver = defaultGPUDriver;
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
         * EnableSubQuotaPreemption.
         */
        public Builder enableSubQuotaPreemption(Boolean enableSubQuotaPreemption) {
            this.enableSubQuotaPreemption = enableSubQuotaPreemption;
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
