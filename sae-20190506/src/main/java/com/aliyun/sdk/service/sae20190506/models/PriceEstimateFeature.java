// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String envType;

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

    @com.aliyun.core.annotation.NameInMap("NoneLoadInstanceCount")
    private Long noneLoadInstanceCount;

    @com.aliyun.core.annotation.NameInMap("NoneLoadSeconds")
    private Long noneLoadSeconds;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private PriceEstimateFeature(Builder builder) {
        this.appType = builder.appType;
        this.cpuCore = builder.cpuCore;
        this.cpuStrategy = builder.cpuStrategy;
        this.envType = builder.envType;
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
        this.noneLoadInstanceCount = builder.noneLoadInstanceCount;
        this.noneLoadSeconds = builder.noneLoadSeconds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PriceEstimateFeature create() {
        return builder().build();
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
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
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

    public static final class Builder {
        private String appType; 
        private Float cpuCore; 
        private String cpuStrategy; 
        private String envType; 
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
        private Long noneLoadInstanceCount; 
        private Long noneLoadSeconds; 
        private String regionId; 

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * CpuCore.
         */
        public Builder cpuCore(Float cpuCore) {
            this.cpuCore = cpuCore;
            return this;
        }

        /**
         * CpuStrategy.
         */
        public Builder cpuStrategy(String cpuStrategy) {
            this.cpuStrategy = cpuStrategy;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.envType = envType;
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
         * MemoryGiB.
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public PriceEstimateFeature build() {
            return new PriceEstimateFeature(this);
        } 

    } 

}
