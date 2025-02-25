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
        this.instanceStatus = builder.instanceStatus;
        this.instanceSystemDiskSize = builder.instanceSystemDiskSize;
        this.instanceTenantIp = builder.instanceTenantIp;
        this.instanceType = builder.instanceType;
        this.instanceUsedCpu = builder.instanceUsedCpu;
        this.instanceUsedGpu = builder.instanceUsedGpu;
        this.instanceUsedGpuMemory = builder.instanceUsedGpuMemory;
        this.instanceUsedMemory = builder.instanceUsedMemory;
        this.labels = builder.labels;
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
        private String instanceStatus; 
        private Integer instanceSystemDiskSize; 
        private String instanceTenantIp; 
        private String instanceType; 
        private Float instanceUsedCpu; 
        private Float instanceUsedGpu; 
        private String instanceUsedGpuMemory; 
        private String instanceUsedMemory; 
        private java.util.List<Labels> labels; 
        private String region; 
        private String resourceId; 
        private String zone; 

        /**
         * Arch.
         */
        public Builder arch(String arch) {
            this.arch = arch;
            return this;
        }

        /**
         * AutoRenewal.
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * InstanceCpuCount.
         */
        public Builder instanceCpuCount(Integer instanceCpuCount) {
            this.instanceCpuCount = instanceCpuCount;
            return this;
        }

        /**
         * InstanceGpuCount.
         */
        public Builder instanceGpuCount(Integer instanceGpuCount) {
            this.instanceGpuCount = instanceGpuCount;
            return this;
        }

        /**
         * InstanceGpuMemory.
         */
        public Builder instanceGpuMemory(String instanceGpuMemory) {
            this.instanceGpuMemory = instanceGpuMemory;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceIp.
         */
        public Builder instanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * InstanceMemory.
         */
        public Builder instanceMemory(String instanceMemory) {
            this.instanceMemory = instanceMemory;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * InstanceSystemDiskSize.
         */
        public Builder instanceSystemDiskSize(Integer instanceSystemDiskSize) {
            this.instanceSystemDiskSize = instanceSystemDiskSize;
            return this;
        }

        /**
         * InstanceTenantIp.
         */
        public Builder instanceTenantIp(String instanceTenantIp) {
            this.instanceTenantIp = instanceTenantIp;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * InstanceUsedCpu.
         */
        public Builder instanceUsedCpu(Float instanceUsedCpu) {
            this.instanceUsedCpu = instanceUsedCpu;
            return this;
        }

        /**
         * InstanceUsedGpu.
         */
        public Builder instanceUsedGpu(Float instanceUsedGpu) {
            this.instanceUsedGpu = instanceUsedGpu;
            return this;
        }

        /**
         * InstanceUsedGpuMemory.
         */
        public Builder instanceUsedGpuMemory(String instanceUsedGpuMemory) {
            this.instanceUsedGpuMemory = instanceUsedGpuMemory;
            return this;
        }

        /**
         * InstanceUsedMemory.
         */
        public Builder instanceUsedMemory(String instanceUsedMemory) {
            this.instanceUsedMemory = instanceUsedMemory;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Zone.
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

            /**
             * LabelKey.
             */
            public Builder labelKey(String labelKey) {
                this.labelKey = labelKey;
                return this;
            }

            /**
             * LabelValue.
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
