// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link CostInstanceType} extends {@link TeaModel}
 *
 * <p>CostInstanceType</p>
 */
public class CostInstanceType extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("DataDisks")
    private java.util.List<DataDisk> dataDisks;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    private CostInstanceType(Builder builder) {
        this.cpu = builder.cpu;
        this.dataDisks = builder.dataDisks;
        this.instanceType = builder.instanceType;
        this.memory = builder.memory;
        this.systemDisk = builder.systemDisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostInstanceType create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return dataDisks
     */
    public java.util.List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public static final class Builder {
        private Integer cpu; 
        private java.util.List<DataDisk> dataDisks; 
        private String instanceType; 
        private Integer memory; 
        private SystemDisk systemDisk; 

        private Builder() {
        } 

        private Builder(CostInstanceType model) {
            this.cpu = model.cpu;
            this.dataDisks = model.dataDisks;
            this.instanceType = model.instanceType;
            this.memory = model.memory;
            this.systemDisk = model.systemDisk;
        } 

        /**
         * <p>CPU核数。</p>
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>数据盘列表。</p>
         */
        public Builder dataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * <p>实例类型列表。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ecs.g6.4xlarge&quot;]</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>内存大小。</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>系统盘信息。</p>
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        public CostInstanceType build() {
            return new CostInstanceType(this);
        } 

    } 

}
