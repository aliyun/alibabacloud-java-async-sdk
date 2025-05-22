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
 * {@link PriceEstimateFeature} extends {@link TeaModel}
 *
 * <p>PriceEstimateFeature</p>
 */
public class PriceEstimateFeature extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.NameInMap("CpuCore")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float cpuCore;

    @com.aliyun.core.annotation.NameInMap("CpuStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cpuStrategy;

    @com.aliyun.core.annotation.NameInMap("CpuUtilLevel")
    private String cpuUtilLevel;

    @com.aliyun.core.annotation.NameInMap("CpuUtilMetrics")
    private java.util.List<Float> cpuUtilMetrics;

    @com.aliyun.core.annotation.NameInMap("EnableCpuIdle")
    private Boolean enableCpuIdle;

    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String envType;

    @com.aliyun.core.annotation.NameInMap("EphemeralStorageGiB")
    private Long ephemeralStorageGiB;

    @com.aliyun.core.annotation.NameInMap("HighLoadInstanceCount")
    private Long highLoadInstanceCount;

    @com.aliyun.core.annotation.NameInMap("HighLoadQps")
    private Float highLoadQps;

    @com.aliyun.core.annotation.NameInMap("HighLoadSeconds")
    private Long highLoadSeconds;

    @com.aliyun.core.annotation.NameInMap("InstanceQps")
    private Float instanceQps;

    @com.aliyun.core.annotation.NameInMap("InternetOutboundGiB")
    private Float internetOutboundGiB;

    @com.aliyun.core.annotation.NameInMap("LowLoadInstanceCount")
    private Long lowLoadInstanceCount;

    @com.aliyun.core.annotation.NameInMap("LowLoadQps")
    private Float lowLoadQps;

    @com.aliyun.core.annotation.NameInMap("LowLoadSeconds")
    private Long lowLoadSeconds;

    @com.aliyun.core.annotation.NameInMap("MaxInstanceCount")
    private Long maxInstanceCount;

    @com.aliyun.core.annotation.NameInMap("MemoryGiB")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float memoryGiB;

    @com.aliyun.core.annotation.NameInMap("MinInstanceCount")
    private Long minInstanceCount;

    @com.aliyun.core.annotation.NameInMap("NewSaeVersion")
    private String newSaeVersion;

    @com.aliyun.core.annotation.NameInMap("NoneLoadInstanceCount")
    private Long noneLoadInstanceCount;

    @com.aliyun.core.annotation.NameInMap("NoneLoadSeconds")
    private Long noneLoadSeconds;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private PriceEstimateFeature(Builder builder) {
        this.appType = builder.appType;
        this.cpuCore = builder.cpuCore;
        this.cpuStrategy = builder.cpuStrategy;
        this.cpuUtilLevel = builder.cpuUtilLevel;
        this.cpuUtilMetrics = builder.cpuUtilMetrics;
        this.enableCpuIdle = builder.enableCpuIdle;
        this.envType = builder.envType;
        this.ephemeralStorageGiB = builder.ephemeralStorageGiB;
        this.highLoadInstanceCount = builder.highLoadInstanceCount;
        this.highLoadQps = builder.highLoadQps;
        this.highLoadSeconds = builder.highLoadSeconds;
        this.instanceQps = builder.instanceQps;
        this.internetOutboundGiB = builder.internetOutboundGiB;
        this.lowLoadInstanceCount = builder.lowLoadInstanceCount;
        this.lowLoadQps = builder.lowLoadQps;
        this.lowLoadSeconds = builder.lowLoadSeconds;
        this.maxInstanceCount = builder.maxInstanceCount;
        this.memoryGiB = builder.memoryGiB;
        this.minInstanceCount = builder.minInstanceCount;
        this.newSaeVersion = builder.newSaeVersion;
        this.noneLoadInstanceCount = builder.noneLoadInstanceCount;
        this.noneLoadSeconds = builder.noneLoadSeconds;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PriceEstimateFeature create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return cpuCore
     */
    public Float getCpuCore() {
        return this.cpuCore;
    }

    /**
     * @return cpuStrategy
     */
    public String getCpuStrategy() {
        return this.cpuStrategy;
    }

    /**
     * @return cpuUtilLevel
     */
    public String getCpuUtilLevel() {
        return this.cpuUtilLevel;
    }

    /**
     * @return cpuUtilMetrics
     */
    public java.util.List<Float> getCpuUtilMetrics() {
        return this.cpuUtilMetrics;
    }

    /**
     * @return enableCpuIdle
     */
    public Boolean getEnableCpuIdle() {
        return this.enableCpuIdle;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return ephemeralStorageGiB
     */
    public Long getEphemeralStorageGiB() {
        return this.ephemeralStorageGiB;
    }

    /**
     * @return highLoadInstanceCount
     */
    public Long getHighLoadInstanceCount() {
        return this.highLoadInstanceCount;
    }

    /**
     * @return highLoadQps
     */
    public Float getHighLoadQps() {
        return this.highLoadQps;
    }

    /**
     * @return highLoadSeconds
     */
    public Long getHighLoadSeconds() {
        return this.highLoadSeconds;
    }

    /**
     * @return instanceQps
     */
    public Float getInstanceQps() {
        return this.instanceQps;
    }

    /**
     * @return internetOutboundGiB
     */
    public Float getInternetOutboundGiB() {
        return this.internetOutboundGiB;
    }

    /**
     * @return lowLoadInstanceCount
     */
    public Long getLowLoadInstanceCount() {
        return this.lowLoadInstanceCount;
    }

    /**
     * @return lowLoadQps
     */
    public Float getLowLoadQps() {
        return this.lowLoadQps;
    }

    /**
     * @return lowLoadSeconds
     */
    public Long getLowLoadSeconds() {
        return this.lowLoadSeconds;
    }

    /**
     * @return maxInstanceCount
     */
    public Long getMaxInstanceCount() {
        return this.maxInstanceCount;
    }

    /**
     * @return memoryGiB
     */
    public Float getMemoryGiB() {
        return this.memoryGiB;
    }

    /**
     * @return minInstanceCount
     */
    public Long getMinInstanceCount() {
        return this.minInstanceCount;
    }

    /**
     * @return newSaeVersion
     */
    public String getNewSaeVersion() {
        return this.newSaeVersion;
    }

    /**
     * @return noneLoadInstanceCount
     */
    public Long getNoneLoadInstanceCount() {
        return this.noneLoadInstanceCount;
    }

    /**
     * @return noneLoadSeconds
     */
    public Long getNoneLoadSeconds() {
        return this.noneLoadSeconds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private String appType; 
        private Float cpuCore; 
        private String cpuStrategy; 
        private String cpuUtilLevel; 
        private java.util.List<Float> cpuUtilMetrics; 
        private Boolean enableCpuIdle; 
        private String envType; 
        private Long ephemeralStorageGiB; 
        private Long highLoadInstanceCount; 
        private Float highLoadQps; 
        private Long highLoadSeconds; 
        private Float instanceQps; 
        private Float internetOutboundGiB; 
        private Long lowLoadInstanceCount; 
        private Float lowLoadQps; 
        private Long lowLoadSeconds; 
        private Long maxInstanceCount; 
        private Float memoryGiB; 
        private Long minInstanceCount; 
        private String newSaeVersion; 
        private Long noneLoadInstanceCount; 
        private Long noneLoadSeconds; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(PriceEstimateFeature model) {
            this.appType = model.appType;
            this.cpuCore = model.cpuCore;
            this.cpuStrategy = model.cpuStrategy;
            this.cpuUtilLevel = model.cpuUtilLevel;
            this.cpuUtilMetrics = model.cpuUtilMetrics;
            this.enableCpuIdle = model.enableCpuIdle;
            this.envType = model.envType;
            this.ephemeralStorageGiB = model.ephemeralStorageGiB;
            this.highLoadInstanceCount = model.highLoadInstanceCount;
            this.highLoadQps = model.highLoadQps;
            this.highLoadSeconds = model.highLoadSeconds;
            this.instanceQps = model.instanceQps;
            this.internetOutboundGiB = model.internetOutboundGiB;
            this.lowLoadInstanceCount = model.lowLoadInstanceCount;
            this.lowLoadQps = model.lowLoadQps;
            this.lowLoadSeconds = model.lowLoadSeconds;
            this.maxInstanceCount = model.maxInstanceCount;
            this.memoryGiB = model.memoryGiB;
            this.minInstanceCount = model.minInstanceCount;
            this.newSaeVersion = model.newSaeVersion;
            this.noneLoadInstanceCount = model.noneLoadInstanceCount;
            this.noneLoadSeconds = model.noneLoadSeconds;
            this.regionId = model.regionId;
            this.resourceType = model.resourceType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Web/MicroService</p>
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuCore(Float cpuCore) {
            this.cpuCore = cpuCore;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Request/Always</p>
         */
        public Builder cpuStrategy(String cpuStrategy) {
            this.cpuStrategy = cpuStrategy;
            return this;
        }

        /**
         * CpuUtilLevel.
         */
        public Builder cpuUtilLevel(String cpuUtilLevel) {
            this.cpuUtilLevel = cpuUtilLevel;
            return this;
        }

        /**
         * CpuUtilMetrics.
         */
        public Builder cpuUtilMetrics(java.util.List<Float> cpuUtilMetrics) {
            this.cpuUtilMetrics = cpuUtilMetrics;
            return this;
        }

        /**
         * EnableCpuIdle.
         */
        public Builder enableCpuIdle(Boolean enableCpuIdle) {
            this.enableCpuIdle = enableCpuIdle;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test/Production</p>
         */
        public Builder envType(String envType) {
            this.envType = envType;
            return this;
        }

        /**
         * EphemeralStorageGiB.
         */
        public Builder ephemeralStorageGiB(Long ephemeralStorageGiB) {
            this.ephemeralStorageGiB = ephemeralStorageGiB;
            return this;
        }

        /**
         * HighLoadInstanceCount.
         */
        public Builder highLoadInstanceCount(Long highLoadInstanceCount) {
            this.highLoadInstanceCount = highLoadInstanceCount;
            return this;
        }

        /**
         * HighLoadQps.
         */
        public Builder highLoadQps(Float highLoadQps) {
            this.highLoadQps = highLoadQps;
            return this;
        }

        /**
         * HighLoadSeconds.
         */
        public Builder highLoadSeconds(Long highLoadSeconds) {
            this.highLoadSeconds = highLoadSeconds;
            return this;
        }

        /**
         * InstanceQps.
         */
        public Builder instanceQps(Float instanceQps) {
            this.instanceQps = instanceQps;
            return this;
        }

        /**
         * InternetOutboundGiB.
         */
        public Builder internetOutboundGiB(Float internetOutboundGiB) {
            this.internetOutboundGiB = internetOutboundGiB;
            return this;
        }

        /**
         * LowLoadInstanceCount.
         */
        public Builder lowLoadInstanceCount(Long lowLoadInstanceCount) {
            this.lowLoadInstanceCount = lowLoadInstanceCount;
            return this;
        }

        /**
         * LowLoadQps.
         */
        public Builder lowLoadQps(Float lowLoadQps) {
            this.lowLoadQps = lowLoadQps;
            return this;
        }

        /**
         * LowLoadSeconds.
         */
        public Builder lowLoadSeconds(Long lowLoadSeconds) {
            this.lowLoadSeconds = lowLoadSeconds;
            return this;
        }

        /**
         * MaxInstanceCount.
         */
        public Builder maxInstanceCount(Long maxInstanceCount) {
            this.maxInstanceCount = maxInstanceCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder memoryGiB(Float memoryGiB) {
            this.memoryGiB = memoryGiB;
            return this;
        }

        /**
         * MinInstanceCount.
         */
        public Builder minInstanceCount(Long minInstanceCount) {
            this.minInstanceCount = minInstanceCount;
            return this;
        }

        /**
         * NewSaeVersion.
         */
        public Builder newSaeVersion(String newSaeVersion) {
            this.newSaeVersion = newSaeVersion;
            return this;
        }

        /**
         * NoneLoadInstanceCount.
         */
        public Builder noneLoadInstanceCount(Long noneLoadInstanceCount) {
            this.noneLoadInstanceCount = noneLoadInstanceCount;
            return this;
        }

        /**
         * NoneLoadSeconds.
         */
        public Builder noneLoadSeconds(Long noneLoadSeconds) {
            this.noneLoadSeconds = noneLoadSeconds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public PriceEstimateFeature build() {
            return new PriceEstimateFeature(this);
        } 

    } 

}
