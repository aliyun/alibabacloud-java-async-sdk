// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ResourceInstance} extends {@link TeaModel}
 *
 * <p>ResourceInstance</p>
 */
public class ResourceInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arch")
    private String arch;

    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("InstanceCpuCount")
    private Integer instanceCpuCount;

    @com.aliyun.core.annotation.NameInMap("InstanceGpuCount")
    private Integer instanceGpuCount;

    @com.aliyun.core.annotation.NameInMap("InstanceGpuMemory")
    private String instanceGpuMemory;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceIp")
    private String instanceIp;

    @com.aliyun.core.annotation.NameInMap("InstanceMemory")
    private String instanceMemory;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstancePhase")
    private String instancePhase;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("InstanceSystemDiskSize")
    private Integer instanceSystemDiskSize;

    @com.aliyun.core.annotation.NameInMap("InstanceTenantIp")
    private String instanceTenantIp;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("InstanceUsedCpu")
    private Float instanceUsedCpu;

    @com.aliyun.core.annotation.NameInMap("InstanceUsedGpu")
    private Float instanceUsedGpu;

    @com.aliyun.core.annotation.NameInMap("InstanceUsedGpuMemory")
    private String instanceUsedGpuMemory;

    @com.aliyun.core.annotation.NameInMap("InstanceUsedMemory")
    private String instanceUsedMemory;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("LastCordonOperator")
    private String lastCordonOperator;

    @com.aliyun.core.annotation.NameInMap("LastCordonReason")
    private String lastCordonReason;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("Zone")
    private String zone;

    private ResourceInstance(Builder builder) {
        this.arch = builder.arch;
        this.autoRenewal = builder.autoRenewal;
        this.chargeType = builder.chargeType;
        this.createTime = builder.createTime;
        this.expiredTime = builder.expiredTime;
        this.instanceCpuCount = builder.instanceCpuCount;
        this.instanceGpuCount = builder.instanceGpuCount;
        this.instanceGpuMemory = builder.instanceGpuMemory;
        this.instanceId = builder.instanceId;
        this.instanceIp = builder.instanceIp;
        this.instanceMemory = builder.instanceMemory;
        this.instanceName = builder.instanceName;
        this.instancePhase = builder.instancePhase;
        this.instanceStatus = builder.instanceStatus;
        this.instanceSystemDiskSize = builder.instanceSystemDiskSize;
        this.instanceTenantIp = builder.instanceTenantIp;
        this.instanceType = builder.instanceType;
        this.instanceUsedCpu = builder.instanceUsedCpu;
        this.instanceUsedGpu = builder.instanceUsedGpu;
        this.instanceUsedGpuMemory = builder.instanceUsedGpuMemory;
        this.instanceUsedMemory = builder.instanceUsedMemory;
        this.labels = builder.labels;
        this.lastCordonOperator = builder.lastCordonOperator;
        this.lastCordonReason = builder.lastCordonReason;
        this.region = builder.region;
        this.resourceId = builder.resourceId;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arch
     */
    public String getArch() {
        return this.arch;
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
     * @return instanceGpuMemory
     */
    public String getInstanceGpuMemory() {
        return this.instanceGpuMemory;
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
     * @return instancePhase
     */
    public String getInstancePhase() {
        return this.instancePhase;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return instanceSystemDiskSize
     */
    public Integer getInstanceSystemDiskSize() {
        return this.instanceSystemDiskSize;
    }

    /**
     * @return instanceTenantIp
     */
    public String getInstanceTenantIp() {
        return this.instanceTenantIp;
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
    public Float getInstanceUsedGpu() {
        return this.instanceUsedGpu;
    }

    /**
     * @return instanceUsedGpuMemory
     */
    public String getInstanceUsedGpuMemory() {
        return this.instanceUsedGpuMemory;
    }

    /**
     * @return instanceUsedMemory
     */
    public String getInstanceUsedMemory() {
        return this.instanceUsedMemory;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return lastCordonOperator
     */
    public String getLastCordonOperator() {
        return this.lastCordonOperator;
    }

    /**
     * @return lastCordonReason
     */
    public String getLastCordonReason() {
        return this.lastCordonReason;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder {
        private String arch; 
        private Boolean autoRenewal; 
        private String chargeType; 
        private String createTime; 
        private String expiredTime; 
        private Integer instanceCpuCount; 
        private Integer instanceGpuCount; 
        private String instanceGpuMemory; 
        private String instanceId; 
        private String instanceIp; 
        private String instanceMemory; 
        private String instanceName; 
        private String instancePhase; 
        private String instanceStatus; 
        private Integer instanceSystemDiskSize; 
        private String instanceTenantIp; 
        private String instanceType; 
        private Float instanceUsedCpu; 
        private Float instanceUsedGpu; 
        private String instanceUsedGpuMemory; 
        private String instanceUsedMemory; 
        private java.util.List<Labels> labels; 
        private String lastCordonOperator; 
        private String lastCordonReason; 
        private String region; 
        private String resourceId; 
        private String zone; 

        private Builder() {
        } 

        private Builder(ResourceInstance model) {
            this.arch = model.arch;
            this.autoRenewal = model.autoRenewal;
            this.chargeType = model.chargeType;
            this.createTime = model.createTime;
            this.expiredTime = model.expiredTime;
            this.instanceCpuCount = model.instanceCpuCount;
            this.instanceGpuCount = model.instanceGpuCount;
            this.instanceGpuMemory = model.instanceGpuMemory;
            this.instanceId = model.instanceId;
            this.instanceIp = model.instanceIp;
            this.instanceMemory = model.instanceMemory;
            this.instanceName = model.instanceName;
            this.instancePhase = model.instancePhase;
            this.instanceStatus = model.instanceStatus;
            this.instanceSystemDiskSize = model.instanceSystemDiskSize;
            this.instanceTenantIp = model.instanceTenantIp;
            this.instanceType = model.instanceType;
            this.instanceUsedCpu = model.instanceUsedCpu;
            this.instanceUsedGpu = model.instanceUsedGpu;
            this.instanceUsedGpuMemory = model.instanceUsedGpuMemory;
            this.instanceUsedMemory = model.instanceUsedMemory;
            this.labels = model.labels;
            this.lastCordonOperator = model.lastCordonOperator;
            this.lastCordonReason = model.lastCordonReason;
            this.region = model.region;
            this.resourceId = model.resourceId;
            this.zone = model.zone;
        } 

        /**
         * <p>The system architecture of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>arm64</p>
         */
        public Builder arch(String arch) {
            this.arch = arch;
            return this;
        }

        /**
         * <p>Indicates whether auto-renewal is enabled for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * <p>The billing method for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-05T22:51:32Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-05T22:51:32Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The number of CPUs for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder instanceCpuCount(Integer instanceCpuCount) {
            this.instanceCpuCount = instanceCpuCount;
            return this;
        }

        /**
         * <p>The number of GPUs for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder instanceGpuCount(Integer instanceGpuCount) {
            this.instanceGpuCount = instanceGpuCount;
            return this;
        }

        /**
         * <p>The VRAM size of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0G</p>
         */
        public Builder instanceGpuMemory(String instanceGpuMemory) {
            this.instanceGpuMemory = instanceGpuMemory;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-i-1800z74n30kao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>11.227.XX.XX</p>
         */
        public Builder instanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * <p>The memory size of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8192M</p>
         */
        public Builder instanceMemory(String instanceMemory) {
            this.instanceMemory = instanceMemory;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>eas01122713204*****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The lifecycle phase of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        public Builder instancePhase(String instancePhase) {
            this.instancePhase = instancePhase;
            return this;
        }

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>The system disk size of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder instanceSystemDiskSize(Integer instanceSystemDiskSize) {
            this.instanceSystemDiskSize = instanceSystemDiskSize;
            return this;
        }

        /**
         * <p>The IP address of the instance in a dedicated network.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        public Builder instanceTenantIp(String instanceTenantIp) {
            this.instanceTenantIp = instanceTenantIp;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.s6-c1m2.xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The number of CPUs in use.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4</p>
         */
        public Builder instanceUsedCpu(Float instanceUsedCpu) {
            this.instanceUsedCpu = instanceUsedCpu;
            return this;
        }

        /**
         * <p>The number of GPUs in use.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder instanceUsedGpu(Float instanceUsedGpu) {
            this.instanceUsedGpu = instanceUsedGpu;
            return this;
        }

        /**
         * <p>The amount of VRAM in use.</p>
         * 
         * <strong>example:</strong>
         * <p>470M</p>
         */
        public Builder instanceUsedGpuMemory(String instanceUsedGpuMemory) {
            this.instanceUsedGpuMemory = instanceUsedGpuMemory;
            return this;
        }

        /**
         * <p>The amount of memory in use.</p>
         * 
         * <strong>example:</strong>
         * <p>1000M</p>
         */
        public Builder instanceUsedMemory(String instanceUsedMemory) {
            this.instanceUsedMemory = instanceUsedMemory;
            return this;
        }

        /**
         * <p>The labels of the instance.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The operator who performed the last cordon.</p>
         * 
         * <strong>example:</strong>
         * <p>24340xxxxxxxx</p>
         */
        public Builder lastCordonOperator(String lastCordonOperator) {
            this.lastCordonOperator = lastCordonOperator;
            return this;
        }

        /**
         * <p>The reason for the last cordon.</p>
         * 
         * <strong>example:</strong>
         * <p>operating</p>
         */
        public Builder lastCordonReason(String lastCordonReason) {
            this.lastCordonReason = lastCordonReason;
            return this;
        }

        /**
         * <p>The region of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-xxxxx</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The zone of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zone(String zone) {
            this.zone = zone;
            return this;
        }

        public ResourceInstance build() {
            return new ResourceInstance(this);
        } 

    } 

    /**
     * 
     * {@link ResourceInstance} extends {@link TeaModel}
     *
     * <p>ResourceInstance</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelKey")
        private String labelKey;

        @com.aliyun.core.annotation.NameInMap("LabelValue")
        private String labelValue;

        private Labels(Builder builder) {
            this.labelKey = builder.labelKey;
            this.labelValue = builder.labelValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return labelKey
         */
        public String getLabelKey() {
            return this.labelKey;
        }

        /**
         * @return labelValue
         */
        public String getLabelValue() {
            return this.labelValue;
        }

        public static final class Builder {
            private String labelKey; 
            private String labelValue; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.labelKey = model.labelKey;
                this.labelValue = model.labelValue;
            } 

            /**
             * <p>The label key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder labelKey(String labelKey) {
                this.labelKey = labelKey;
                return this;
            }

            /**
             * <p>The label value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder labelValue(String labelValue) {
                this.labelValue = labelValue;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
