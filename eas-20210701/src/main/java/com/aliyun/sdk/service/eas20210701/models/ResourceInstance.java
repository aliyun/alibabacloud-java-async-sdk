// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceInstance} extends {@link TeaModel}
 *
 * <p>ResourceInstance</p>
 */
public class ResourceInstance extends TeaModel {
    @NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @NameInMap("ChargeType")
    private String chargeType;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("InstanceCpuCount")
    private Integer instanceCpuCount;

    @NameInMap("InstanceGpuCount")
    private Integer instanceGpuCount;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceIp")
    private String instanceIp;

    @NameInMap("InstanceMemory")
    private String instanceMemory;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("InstanceStatus")
    private String instanceStatus;

    @NameInMap("InstanceType")
    private String instanceType;

    @NameInMap("InstanceUsedCpu")
    private Float instanceUsedCpu;

    @NameInMap("InstanceUsedGpu")
    private Integer instanceUsedGpu;

    @NameInMap("InstanceUsedMemory")
    private String instanceUsedMemory;

    private ResourceInstance(Builder builder) {
        this.autoRenewal = builder.autoRenewal;
        this.chargeType = builder.chargeType;
        this.createTime = builder.createTime;
        this.expiredTime = builder.expiredTime;
        this.instanceCpuCount = builder.instanceCpuCount;
        this.instanceGpuCount = builder.instanceGpuCount;
        this.instanceId = builder.instanceId;
        this.instanceIp = builder.instanceIp;
        this.instanceMemory = builder.instanceMemory;
        this.instanceName = builder.instanceName;
        this.instanceStatus = builder.instanceStatus;
        this.instanceType = builder.instanceType;
        this.instanceUsedCpu = builder.instanceUsedCpu;
        this.instanceUsedGpu = builder.instanceUsedGpu;
        this.instanceUsedMemory = builder.instanceUsedMemory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceInstance create() {
        return builder().build();
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return instanceCpuCount
     */
    public Integer getInstanceCpuCount() {
        return this.instanceCpuCount;
    }

    /**
     * @return instanceGpuCount
     */
    public Integer getInstanceGpuCount() {
        return this.instanceGpuCount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIp
     */
    public String getInstanceIp() {
        return this.instanceIp;
    }

    /**
     * @return instanceMemory
     */
    public String getInstanceMemory() {
        return this.instanceMemory;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceUsedCpu
     */
    public Float getInstanceUsedCpu() {
        return this.instanceUsedCpu;
    }

    /**
     * @return instanceUsedGpu
     */
    public Integer getInstanceUsedGpu() {
        return this.instanceUsedGpu;
    }

    /**
     * @return instanceUsedMemory
     */
    public String getInstanceUsedMemory() {
        return this.instanceUsedMemory;
    }

    public static final class Builder {
        private Boolean autoRenewal; 
        private String chargeType; 
        private String createTime; 
        private String expiredTime; 
        private Integer instanceCpuCount; 
        private Integer instanceGpuCount; 
        private String instanceId; 
        private String instanceIp; 
        private String instanceMemory; 
        private String instanceName; 
        private String instanceStatus; 
        private String instanceType; 
        private Float instanceUsedCpu; 
        private Integer instanceUsedGpu; 
        private String instanceUsedMemory; 

        /**
         * 实例是否自动续费
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * 实例的计费类型
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * 实例的创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 实例过期时间
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * 实例的Cpu个数
         */
        public Builder instanceCpuCount(Integer instanceCpuCount) {
            this.instanceCpuCount = instanceCpuCount;
            return this;
        }

        /**
         * 实例的Gpu个数
         */
        public Builder instanceGpuCount(Integer instanceGpuCount) {
            this.instanceGpuCount = instanceGpuCount;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 实例IP
         */
        public Builder instanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * 实例的内存大小
         */
        public Builder instanceMemory(String instanceMemory) {
            this.instanceMemory = instanceMemory;
            return this;
        }

        /**
         * 实例名称
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 实例状态
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * 实例的机型
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * 实例被使用的CPU数量
         */
        public Builder instanceUsedCpu(Float instanceUsedCpu) {
            this.instanceUsedCpu = instanceUsedCpu;
            return this;
        }

        /**
         * 实例被使用的GPU数量
         */
        public Builder instanceUsedGpu(Integer instanceUsedGpu) {
            this.instanceUsedGpu = instanceUsedGpu;
            return this;
        }

        /**
         * 实例被使用的内存大小
         */
        public Builder instanceUsedMemory(String instanceUsedMemory) {
            this.instanceUsedMemory = instanceUsedMemory;
            return this;
        }

        public ResourceInstance build() {
            return new ResourceInstance(this);
        } 

    } 

}
