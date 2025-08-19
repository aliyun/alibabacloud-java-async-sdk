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
 * {@link ResidentResourceAllocation} extends {@link TeaModel}
 *
 * <p>ResidentResourceAllocation</p>
 */
public class ResidentResourceAllocation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("instanceCount")
    private Integer instanceCount;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("totalCpuCores")
    private Double totalCpuCores;

    @com.aliyun.core.annotation.NameInMap("totalDiskSize")
    private Double totalDiskSize;

    @com.aliyun.core.annotation.NameInMap("totalGpuMemorySize")
    private Double totalGpuMemorySize;

    @com.aliyun.core.annotation.NameInMap("totalMemorySize")
    private Double totalMemorySize;

    private ResidentResourceAllocation(Builder builder) {
        this.functionName = builder.functionName;
        this.instanceCount = builder.instanceCount;
        this.qualifier = builder.qualifier;
        this.totalCpuCores = builder.totalCpuCores;
        this.totalDiskSize = builder.totalDiskSize;
        this.totalGpuMemorySize = builder.totalGpuMemorySize;
        this.totalMemorySize = builder.totalMemorySize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResidentResourceAllocation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return totalCpuCores
     */
    public Double getTotalCpuCores() {
        return this.totalCpuCores;
    }

    /**
     * @return totalDiskSize
     */
    public Double getTotalDiskSize() {
        return this.totalDiskSize;
    }

    /**
     * @return totalGpuMemorySize
     */
    public Double getTotalGpuMemorySize() {
        return this.totalGpuMemorySize;
    }

    /**
     * @return totalMemorySize
     */
    public Double getTotalMemorySize() {
        return this.totalMemorySize;
    }

    public static final class Builder {
        private String functionName; 
        private Integer instanceCount; 
        private String qualifier; 
        private Double totalCpuCores; 
        private Double totalDiskSize; 
        private Double totalGpuMemorySize; 
        private Double totalMemorySize; 

        private Builder() {
        } 

        private Builder(ResidentResourceAllocation model) {
            this.functionName = model.functionName;
            this.instanceCount = model.instanceCount;
            this.qualifier = model.qualifier;
            this.totalCpuCores = model.totalCpuCores;
            this.totalDiskSize = model.totalDiskSize;
            this.totalGpuMemorySize = model.totalGpuMemorySize;
            this.totalMemorySize = model.totalMemorySize;
        } 

        /**
         * <p>使用该资源池的函数名</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>实例数</p>
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * <p>函数的别名</p>
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>CPU 占用总核数</p>
         */
        public Builder totalCpuCores(Double totalCpuCores) {
            this.totalCpuCores = totalCpuCores;
            return this;
        }

        /**
         * <p>占用磁盘大小，单位 GB</p>
         */
        public Builder totalDiskSize(Double totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }

        /**
         * <p>占用显存大小，单位 GB</p>
         */
        public Builder totalGpuMemorySize(Double totalGpuMemorySize) {
            this.totalGpuMemorySize = totalGpuMemorySize;
            return this;
        }

        /**
         * <p>内存占用大小，单位 GB</p>
         */
        public Builder totalMemorySize(Double totalMemorySize) {
            this.totalMemorySize = totalMemorySize;
            return this;
        }

        public ResidentResourceAllocation build() {
            return new ResidentResourceAllocation(this);
        } 

    } 

}
