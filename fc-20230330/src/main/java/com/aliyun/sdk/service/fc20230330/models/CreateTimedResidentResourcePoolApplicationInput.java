// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link CreateTimedResidentResourcePoolApplicationInput} extends {@link TeaModel}
 *
 * <p>CreateTimedResidentResourcePoolApplicationInput</p>
 */
public class CreateTimedResidentResourcePoolApplicationInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("associatedPoolId")
    private String associatedPoolId;

    @com.aliyun.core.annotation.NameInMap("diskSizeInGB")
    private Long diskSizeInGB;

    @com.aliyun.core.annotation.NameInMap("gpuType")
    private String gpuType;

    @com.aliyun.core.annotation.NameInMap("memorySizeInGB")
    private Long memorySizeInGB;

    @com.aliyun.core.annotation.NameInMap("operationType")
    private String operationType;

    @com.aliyun.core.annotation.NameInMap("poolName")
    private String poolName;

    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("timedConfig")
    private TimedPoolConfig timedConfig;

    @com.aliyun.core.annotation.NameInMap("timedPoolId")
    private String timedPoolId;

    @com.aliyun.core.annotation.NameInMap("totalGPUCards")
    private Long totalGPUCards;

    @com.aliyun.core.annotation.NameInMap("vCpuCores")
    private Long vCpuCores;

    private CreateTimedResidentResourcePoolApplicationInput(Builder builder) {
        this.associatedPoolId = builder.associatedPoolId;
        this.diskSizeInGB = builder.diskSizeInGB;
        this.gpuType = builder.gpuType;
        this.memorySizeInGB = builder.memorySizeInGB;
        this.operationType = builder.operationType;
        this.poolName = builder.poolName;
        this.reason = builder.reason;
        this.timedConfig = builder.timedConfig;
        this.timedPoolId = builder.timedPoolId;
        this.totalGPUCards = builder.totalGPUCards;
        this.vCpuCores = builder.vCpuCores;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTimedResidentResourcePoolApplicationInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associatedPoolId
     */
    public String getAssociatedPoolId() {
        return this.associatedPoolId;
    }

    /**
     * @return diskSizeInGB
     */
    public Long getDiskSizeInGB() {
        return this.diskSizeInGB;
    }

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    /**
     * @return memorySizeInGB
     */
    public Long getMemorySizeInGB() {
        return this.memorySizeInGB;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return poolName
     */
    public String getPoolName() {
        return this.poolName;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return timedConfig
     */
    public TimedPoolConfig getTimedConfig() {
        return this.timedConfig;
    }

    /**
     * @return timedPoolId
     */
    public String getTimedPoolId() {
        return this.timedPoolId;
    }

    /**
     * @return totalGPUCards
     */
    public Long getTotalGPUCards() {
        return this.totalGPUCards;
    }

    /**
     * @return vCpuCores
     */
    public Long getVCpuCores() {
        return this.vCpuCores;
    }

    public static final class Builder {
        private String associatedPoolId; 
        private Long diskSizeInGB; 
        private String gpuType; 
        private Long memorySizeInGB; 
        private String operationType; 
        private String poolName; 
        private String reason; 
        private TimedPoolConfig timedConfig; 
        private String timedPoolId; 
        private Long totalGPUCards; 
        private Long vCpuCores; 

        private Builder() {
        } 

        private Builder(CreateTimedResidentResourcePoolApplicationInput model) {
            this.associatedPoolId = model.associatedPoolId;
            this.diskSizeInGB = model.diskSizeInGB;
            this.gpuType = model.gpuType;
            this.memorySizeInGB = model.memorySizeInGB;
            this.operationType = model.operationType;
            this.poolName = model.poolName;
            this.reason = model.reason;
            this.timedConfig = model.timedConfig;
            this.timedPoolId = model.timedPoolId;
            this.totalGPUCards = model.totalGPUCards;
            this.vCpuCores = model.vCpuCores;
        } 

        /**
         * associatedPoolId.
         */
        public Builder associatedPoolId(String associatedPoolId) {
            this.associatedPoolId = associatedPoolId;
            return this;
        }

        /**
         * diskSizeInGB.
         */
        public Builder diskSizeInGB(Long diskSizeInGB) {
            this.diskSizeInGB = diskSizeInGB;
            return this;
        }

        /**
         * gpuType.
         */
        public Builder gpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }

        /**
         * memorySizeInGB.
         */
        public Builder memorySizeInGB(Long memorySizeInGB) {
            this.memorySizeInGB = memorySizeInGB;
            return this;
        }

        /**
         * operationType.
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * poolName.
         */
        public Builder poolName(String poolName) {
            this.poolName = poolName;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * timedConfig.
         */
        public Builder timedConfig(TimedPoolConfig timedConfig) {
            this.timedConfig = timedConfig;
            return this;
        }

        /**
         * timedPoolId.
         */
        public Builder timedPoolId(String timedPoolId) {
            this.timedPoolId = timedPoolId;
            return this;
        }

        /**
         * totalGPUCards.
         */
        public Builder totalGPUCards(Long totalGPUCards) {
            this.totalGPUCards = totalGPUCards;
            return this;
        }

        /**
         * vCpuCores.
         */
        public Builder vCpuCores(Long vCpuCores) {
            this.vCpuCores = vCpuCores;
            return this;
        }

        public CreateTimedResidentResourcePoolApplicationInput build() {
            return new CreateTimedResidentResourcePoolApplicationInput(this);
        } 

    } 

}
