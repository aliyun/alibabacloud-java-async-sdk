// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ResultSpecInfoMapValue} extends {@link TeaModel}
 *
 * <p>ResultSpecInfoMapValue</p>
 */
public class ResultSpecInfoMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private String cpuCount;

    @com.aliyun.core.annotation.NameInMap("memorySize")
    private String memorySize;

    @com.aliyun.core.annotation.NameInMap("enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("spec")
    private String spec;

    @com.aliyun.core.annotation.NameInMap("specGroupType")
    private String specGroupType;

    @com.aliyun.core.annotation.NameInMap("disk")
    private String disk;

    @com.aliyun.core.annotation.NameInMap("diskType")
    private String diskType;

    private ResultSpecInfoMapValue(Builder builder) {
        this.cpuCount = builder.cpuCount;
        this.memorySize = builder.memorySize;
        this.enable = builder.enable;
        this.spec = builder.spec;
        this.specGroupType = builder.specGroupType;
        this.disk = builder.disk;
        this.diskType = builder.diskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResultSpecInfoMapValue create() {
        return builder().build();
    }

    /**
     * @return cpuCount
     */
    public String getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return memorySize
     */
    public String getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return specGroupType
     */
    public String getSpecGroupType() {
        return this.specGroupType;
    }

    /**
     * @return disk
     */
    public String getDisk() {
        return this.disk;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    public static final class Builder {
        private String cpuCount; 
        private String memorySize; 
        private String enable; 
        private String spec; 
        private String specGroupType; 
        private String disk; 
        private String diskType; 

        /**
         * cpuCount.
         */
        public Builder cpuCount(String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * memorySize.
         */
        public Builder memorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * spec.
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * specGroupType.
         */
        public Builder specGroupType(String specGroupType) {
            this.specGroupType = specGroupType;
            return this;
        }

        /**
         * disk.
         */
        public Builder disk(String disk) {
            this.disk = disk;
            return this;
        }

        /**
         * diskType.
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        public ResultSpecInfoMapValue build() {
            return new ResultSpecInfoMapValue(this);
        } 

    } 

}
