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
         * ????????????????????????
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * ?????????Cpu??????
         */
        public Builder instanceCpuCount(Integer instanceCpuCount) {
            this.instanceCpuCount = instanceCpuCount;
            return this;
        }

        /**
         * ?????????Gpu??????
         */
        public Builder instanceGpuCount(Integer instanceGpuCount) {
            this.instanceGpuCount = instanceGpuCount;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ??????IP
         */
        public Builder instanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder instanceMemory(String instanceMemory) {
            this.instanceMemory = instanceMemory;
            return this;
        }

        /**
         * ????????????
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * ????????????
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * ??????????????????CPU??????
         */
        public Builder instanceUsedCpu(Float instanceUsedCpu) {
            this.instanceUsedCpu = instanceUsedCpu;
            return this;
        }

        /**
         * ??????????????????GPU??????
         */
        public Builder instanceUsedGpu(Integer instanceUsedGpu) {
            this.instanceUsedGpu = instanceUsedGpu;
            return this;
        }

        /**
         * ??????????????????????????????
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
