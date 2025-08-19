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
 * {@link ResidentResourceCapacity} extends {@link TeaModel}
 *
 * <p>ResidentResourceCapacity</p>
 */
public class ResidentResourceCapacity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("gpuType")
    private String gpuType;

    @com.aliyun.core.annotation.NameInMap("totalCpuCores")
    private Long totalCpuCores;

    @com.aliyun.core.annotation.NameInMap("totalDiskSize")
    private Long totalDiskSize;

    @com.aliyun.core.annotation.NameInMap("totalGpuCards")
    private Long totalGpuCards;

    @com.aliyun.core.annotation.NameInMap("totalGpuMemorySize")
    private Long totalGpuMemorySize;

    @com.aliyun.core.annotation.NameInMap("totalMemorySize")
    private Long totalMemorySize;

    private ResidentResourceCapacity(Builder builder) {
        this.gpuType = builder.gpuType;
        this.totalCpuCores = builder.totalCpuCores;
        this.totalDiskSize = builder.totalDiskSize;
        this.totalGpuCards = builder.totalGpuCards;
        this.totalGpuMemorySize = builder.totalGpuMemorySize;
        this.totalMemorySize = builder.totalMemorySize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResidentResourceCapacity create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    /**
     * @return totalCpuCores
     */
    public Long getTotalCpuCores() {
        return this.totalCpuCores;
    }

    /**
     * @return totalDiskSize
     */
    public Long getTotalDiskSize() {
        return this.totalDiskSize;
    }

    /**
     * @return totalGpuCards
     */
    public Long getTotalGpuCards() {
        return this.totalGpuCards;
    }

    /**
     * @return totalGpuMemorySize
     */
    public Long getTotalGpuMemorySize() {
        return this.totalGpuMemorySize;
    }

    /**
     * @return totalMemorySize
     */
    public Long getTotalMemorySize() {
        return this.totalMemorySize;
    }

    public static final class Builder {
        private String gpuType; 
        private Long totalCpuCores; 
        private Long totalDiskSize; 
        private Long totalGpuCards; 
        private Long totalGpuMemorySize; 
        private Long totalMemorySize; 

        private Builder() {
        } 

        private Builder(ResidentResourceCapacity model) {
            this.gpuType = model.gpuType;
            this.totalCpuCores = model.totalCpuCores;
            this.totalDiskSize = model.totalDiskSize;
            this.totalGpuCards = model.totalGpuCards;
            this.totalGpuMemorySize = model.totalGpuMemorySize;
            this.totalMemorySize = model.totalMemorySize;
        } 

        /**
         * <p>GPU 卡型</p>
         */
        public Builder gpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }

        /**
         * <p>CPU 总核数</p>
         */
        public Builder totalCpuCores(Long totalCpuCores) {
            this.totalCpuCores = totalCpuCores;
            return this;
        }

        /**
         * <p>总磁盘大小，单位 GB</p>
         */
        public Builder totalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }

        /**
         * <p>GPU总卡数</p>
         */
        public Builder totalGpuCards(Long totalGpuCards) {
            this.totalGpuCards = totalGpuCards;
            return this;
        }

        /**
         * <p>总显存大小，单位 GB</p>
         */
        public Builder totalGpuMemorySize(Long totalGpuMemorySize) {
            this.totalGpuMemorySize = totalGpuMemorySize;
            return this;
        }

        /**
         * <p>总内存大小，单位 GB</p>
         */
        public Builder totalMemorySize(Long totalMemorySize) {
            this.totalMemorySize = totalMemorySize;
            return this;
        }

        public ResidentResourceCapacity build() {
            return new ResidentResourceCapacity(this);
        } 

    } 

}
