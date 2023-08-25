// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The total storage space of the cluster, in GB.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class DataDiskAutoScaleConfig extends TeaModel {
        @NameInMap("AutoScale")
        private Boolean autoScale;

        @NameInMap("MaxDiskSize")
        private Long maxDiskSize;

        @NameInMap("ScaleStepInMerge")
        private Long scaleStepInMerge;

        @NameInMap("ScaleStepInNormal")
        private Long scaleStepInNormal;

        @NameInMap("UpperMergeThreshold")
        private Long upperMergeThreshold;

        @NameInMap("UpperThreshold")
        private Long upperThreshold;

        @NameInMap("Upperbound")
        private Long upperbound;

        private DataDiskAutoScaleConfig(Builder builder) {
            this.autoScale = builder.autoScale;
            this.maxDiskSize = builder.maxDiskSize;
            this.scaleStepInMerge = builder.scaleStepInMerge;
            this.scaleStepInNormal = builder.scaleStepInNormal;
            this.upperMergeThreshold = builder.upperMergeThreshold;
            this.upperThreshold = builder.upperThreshold;
            this.upperbound = builder.upperbound;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiskAutoScaleConfig create() {
            return builder().build();
        }

        /**
         * @return autoScale
         */
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        /**
         * @return maxDiskSize
         */
        public Long getMaxDiskSize() {
            return this.maxDiskSize;
        }

        /**
         * @return scaleStepInMerge
         */
        public Long getScaleStepInMerge() {
            return this.scaleStepInMerge;
        }

        /**
         * @return scaleStepInNormal
         */
        public Long getScaleStepInNormal() {
            return this.scaleStepInNormal;
        }

        /**
         * @return upperMergeThreshold
         */
        public Long getUpperMergeThreshold() {
            return this.upperMergeThreshold;
        }

        /**
         * @return upperThreshold
         */
        public Long getUpperThreshold() {
            return this.upperThreshold;
        }

        /**
         * @return upperbound
         */
        public Long getUpperbound() {
            return this.upperbound;
        }

        public static final class Builder {
            private Boolean autoScale; 
            private Long maxDiskSize; 
            private Long scaleStepInMerge; 
            private Long scaleStepInNormal; 
            private Long upperMergeThreshold; 
            private Long upperThreshold; 
            private Long upperbound; 

            /**
             * AutoScale.
             */
            public Builder autoScale(Boolean autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * MaxDiskSize.
             */
            public Builder maxDiskSize(Long maxDiskSize) {
                this.maxDiskSize = maxDiskSize;
                return this;
            }

            /**
             * ScaleStepInMerge.
             */
            public Builder scaleStepInMerge(Long scaleStepInMerge) {
                this.scaleStepInMerge = scaleStepInMerge;
                return this;
            }

            /**
             * ScaleStepInNormal.
             */
            public Builder scaleStepInNormal(Long scaleStepInNormal) {
                this.scaleStepInNormal = scaleStepInNormal;
                return this;
            }

            /**
             * UpperMergeThreshold.
             */
            public Builder upperMergeThreshold(Long upperMergeThreshold) {
                this.upperMergeThreshold = upperMergeThreshold;
                return this;
            }

            /**
             * UpperThreshold.
             */
            public Builder upperThreshold(Long upperThreshold) {
                this.upperThreshold = upperThreshold;
                return this;
            }

            /**
             * Upperbound.
             */
            public Builder upperbound(Long upperbound) {
                this.upperbound = upperbound;
                return this;
            }

            public DataDiskAutoScaleConfig build() {
                return new DataDiskAutoScaleConfig(this);
            } 

        } 

    }
    public static class CapacityUnit extends TeaModel {
        @NameInMap("MaxCapacityUnit")
        private Integer maxCapacityUnit;

        @NameInMap("MinCapacityUnit")
        private Integer minCapacityUnit;

        @NameInMap("UsedCapacityUnit")
        private Integer usedCapacityUnit;

        private CapacityUnit(Builder builder) {
            this.maxCapacityUnit = builder.maxCapacityUnit;
            this.minCapacityUnit = builder.minCapacityUnit;
            this.usedCapacityUnit = builder.usedCapacityUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityUnit create() {
            return builder().build();
        }

        /**
         * @return maxCapacityUnit
         */
        public Integer getMaxCapacityUnit() {
            return this.maxCapacityUnit;
        }

        /**
         * @return minCapacityUnit
         */
        public Integer getMinCapacityUnit() {
            return this.minCapacityUnit;
        }

        /**
         * @return usedCapacityUnit
         */
        public Integer getUsedCapacityUnit() {
            return this.usedCapacityUnit;
        }

        public static final class Builder {
            private Integer maxCapacityUnit; 
            private Integer minCapacityUnit; 
            private Integer usedCapacityUnit; 

            /**
             * MaxCapacityUnit.
             */
            public Builder maxCapacityUnit(Integer maxCapacityUnit) {
                this.maxCapacityUnit = maxCapacityUnit;
                return this;
            }

            /**
             * MinCapacityUnit.
             */
            public Builder minCapacityUnit(Integer minCapacityUnit) {
                this.minCapacityUnit = minCapacityUnit;
                return this;
            }

            /**
             * UsedCapacityUnit.
             */
            public Builder usedCapacityUnit(Integer usedCapacityUnit) {
                this.usedCapacityUnit = usedCapacityUnit;
                return this;
            }

            public CapacityUnit build() {
                return new CapacityUnit(this);
            } 

        } 

    }
    public static class Cpu extends TeaModel {
        @NameInMap("OriginalTotalCpu")
        private Long originalTotalCpu;

        @NameInMap("TotalCpu")
        private Long totalCpu;

        @NameInMap("UnitCpu")
        private Long unitCpu;

        @NameInMap("UsedCpu")
        private Long usedCpu;

        private Cpu(Builder builder) {
            this.originalTotalCpu = builder.originalTotalCpu;
            this.totalCpu = builder.totalCpu;
            this.unitCpu = builder.unitCpu;
            this.usedCpu = builder.usedCpu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cpu create() {
            return builder().build();
        }

        /**
         * @return originalTotalCpu
         */
        public Long getOriginalTotalCpu() {
            return this.originalTotalCpu;
        }

        /**
         * @return totalCpu
         */
        public Long getTotalCpu() {
            return this.totalCpu;
        }

        /**
         * @return unitCpu
         */
        public Long getUnitCpu() {
            return this.unitCpu;
        }

        /**
         * @return usedCpu
         */
        public Long getUsedCpu() {
            return this.usedCpu;
        }

        public static final class Builder {
            private Long originalTotalCpu; 
            private Long totalCpu; 
            private Long unitCpu; 
            private Long usedCpu; 

            /**
             * OriginalTotalCpu.
             */
            public Builder originalTotalCpu(Long originalTotalCpu) {
                this.originalTotalCpu = originalTotalCpu;
                return this;
            }

            /**
             * The name of the OceanBase cluster.    
             * <p>
             * It must be 1 to 20 characters in length.   
             * If this parameter is not specified, the value is the instance ID of the cluster by default.
             */
            public Builder totalCpu(Long totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * The data replica distribution mode of the cluster. Valid values:    
             * <p>
             * 
             * - n: indicates the single-IDC mode.  
             * - n-n: indicates the dual-IDC mode.  
             * - n-n-n: indicates the multi-IDC mode. The integer n represents the number of OBServer nodes in each IDC.
             */
            public Builder unitCpu(Long unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * The search keyword.
             */
            public Builder usedCpu(Long usedCpu) {
                this.usedCpu = usedCpu;
                return this;
            }

            public Cpu build() {
                return new Cpu(this);
            } 

        } 

    }
    public static class DiskSize extends TeaModel {
        @NameInMap("OriginalTotalDiskSize")
        private Long originalTotalDiskSize;

        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        private DiskSize(Builder builder) {
            this.originalTotalDiskSize = builder.originalTotalDiskSize;
            this.totalDiskSize = builder.totalDiskSize;
            this.unitDiskSize = builder.unitDiskSize;
            this.usedDiskSize = builder.usedDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskSize create() {
            return builder().build();
        }

        /**
         * @return originalTotalDiskSize
         */
        public Long getOriginalTotalDiskSize() {
            return this.originalTotalDiskSize;
        }

        /**
         * @return totalDiskSize
         */
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        /**
         * @return unitDiskSize
         */
        public Long getUnitDiskSize() {
            return this.unitDiskSize;
        }

        /**
         * @return usedDiskSize
         */
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public static final class Builder {
            private Long originalTotalDiskSize; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * OriginalTotalDiskSize.
             */
            public Builder originalTotalDiskSize(Long originalTotalDiskSize) {
                this.originalTotalDiskSize = originalTotalDiskSize;
                return this;
            }

            /**
             * The request ID.
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * Example 1
             */
            public Builder unitDiskSize(Long unitDiskSize) {
                this.unitDiskSize = unitDiskSize;
                return this;
            }

            /**
             * $.parameters[7].schema.example
             */
            public Builder usedDiskSize(Long usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            public DiskSize build() {
                return new DiskSize(this);
            } 

        } 

    }
    public static class Memory extends TeaModel {
        @NameInMap("OriginalTotalMemory")
        private Long originalTotalMemory;

        @NameInMap("TotalMemory")
        private Long totalMemory;

        @NameInMap("UnitMemory")
        private Long unitMemory;

        @NameInMap("UsedMemory")
        private Long usedMemory;

        private Memory(Builder builder) {
            this.originalTotalMemory = builder.originalTotalMemory;
            this.totalMemory = builder.totalMemory;
            this.unitMemory = builder.unitMemory;
            this.usedMemory = builder.usedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memory create() {
            return builder().build();
        }

        /**
         * @return originalTotalMemory
         */
        public Long getOriginalTotalMemory() {
            return this.originalTotalMemory;
        }

        /**
         * @return totalMemory
         */
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        /**
         * @return unitMemory
         */
        public Long getUnitMemory() {
            return this.unitMemory;
        }

        /**
         * @return usedMemory
         */
        public Long getUsedMemory() {
            return this.usedMemory;
        }

        public static final class Builder {
            private Long originalTotalMemory; 
            private Long totalMemory; 
            private Long unitMemory; 
            private Long usedMemory; 

            /**
             * OriginalTotalMemory.
             */
            public Builder originalTotalMemory(Long originalTotalMemory) {
                this.originalTotalMemory = originalTotalMemory;
                return this;
            }

            /**
             * The number of CPU cores of the cluster.
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * The size of used storage space of the cluster, in GB.
             */
            public Builder unitMemory(Long unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * The size of used memory in the cluster, in GB.
             */
            public Builder usedMemory(Long usedMemory) {
                this.usedMemory = usedMemory;
                return this;
            }

            public Memory build() {
                return new Memory(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @NameInMap("CapacityUnit")
        private CapacityUnit capacityUnit;

        @NameInMap("Cpu")
        private Cpu cpu;

        @NameInMap("DiskSize")
        private DiskSize diskSize;

        @NameInMap("Memory")
        private Memory memory;

        @NameInMap("UnitCount")
        private Long unitCount;

        private Resource(Builder builder) {
            this.capacityUnit = builder.capacityUnit;
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.memory = builder.memory;
            this.unitCount = builder.unitCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return capacityUnit
         */
        public CapacityUnit getCapacityUnit() {
            return this.capacityUnit;
        }

        /**
         * @return cpu
         */
        public Cpu getCpu() {
            return this.cpu;
        }

        /**
         * @return diskSize
         */
        public DiskSize getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return memory
         */
        public Memory getMemory() {
            return this.memory;
        }

        /**
         * @return unitCount
         */
        public Long getUnitCount() {
            return this.unitCount;
        }

        public static final class Builder {
            private CapacityUnit capacityUnit; 
            private Cpu cpu; 
            private DiskSize diskSize; 
            private Memory memory; 
            private Long unitCount; 

            /**
             * CapacityUnit.
             */
            public Builder capacityUnit(CapacityUnit capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * Indicates whether new nodes can be added.
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time elapsed since the expiration of the cluster, in seconds.
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The status of the cluster. Valid values:   
             * <p>
             * - PENDING_CREATE: The cluster is being created.  
             * - ONLINE: The cluster is running.  
             * - TENANT_CREATING: The tenant is being created.  
             * - TENANT_SPEC_MODIFYING: The tenant specifications are being modified.  
             * - EXPANDING: Nodes are being added to the cluster to increase its capacity.  
             * - REDUCING: Nodes are being removed from the cluster to reduce its capacity.  
             * - SPEC_UPGRADING: The service plan is being upgraded.  
             * - DISK_UPGRADING: The storage space is being expanded.  
             * - WHITE_LIST_MODIFYING: The whitelist is being modified.  
             * - PARAMETER_MODIFYING: Parameters are being modified.  
             * - SSL_MODIFYING: The SSL certificate is being changed.  
             * - PREPAID_EXPIRE_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to PREPAY.  
             * - ARREARS_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to POSTPAY.  
             * - PENDING_DELETE: The cluster is being deleted.   
             * Generally, the cluster is in the ONLINE state.
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * UnitCount.
             */
            public Builder unitCount(Long unitCount) {
                this.unitCount = unitCount;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("AvailableZones")
        private java.util.List < String > availableZones;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataDiskAutoScaleConfig")
        private DataDiskAutoScaleConfig dataDiskAutoScaleConfig;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DiskSize")
        private String diskSize;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("EnableUpgradeNodes")
        private Boolean enableUpgradeNodes;

        @NameInMap("ExpireSeconds")
        private Integer expireSeconds;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InTempCapacityStatus")
        private Boolean inTempCapacityStatus;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceRole")
        private String instanceRole;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MaintainTime")
        private String maintainTime;

        @NameInMap("Mem")
        private Long mem;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Resource")
        private Resource resource;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Series")
        private String series;

        @NameInMap("State")
        private String state;

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        @NameInMap("Version")
        private String version;

        @NameInMap("VpcId")
        private String vpcId;

        private Instances(Builder builder) {
            this.availableZones = builder.availableZones;
            this.commodityCode = builder.commodityCode;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.dataDiskAutoScaleConfig = builder.dataDiskAutoScaleConfig;
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.enableUpgradeNodes = builder.enableUpgradeNodes;
            this.expireSeconds = builder.expireSeconds;
            this.expireTime = builder.expireTime;
            this.inTempCapacityStatus = builder.inTempCapacityStatus;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRole = builder.instanceRole;
            this.instanceType = builder.instanceType;
            this.maintainTime = builder.maintainTime;
            this.mem = builder.mem;
            this.payType = builder.payType;
            this.resource = builder.resource;
            this.resourceGroupId = builder.resourceGroupId;
            this.series = builder.series;
            this.state = builder.state;
            this.usedDiskSize = builder.usedDiskSize;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return availableZones
         */
        public java.util.List < String > getAvailableZones() {
            return this.availableZones;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataDiskAutoScaleConfig
         */
        public DataDiskAutoScaleConfig getDataDiskAutoScaleConfig() {
            return this.dataDiskAutoScaleConfig;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return diskSize
         */
        public String getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return enableUpgradeNodes
         */
        public Boolean getEnableUpgradeNodes() {
            return this.enableUpgradeNodes;
        }

        /**
         * @return expireSeconds
         */
        public Integer getExpireSeconds() {
            return this.expireSeconds;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return inTempCapacityStatus
         */
        public Boolean getInTempCapacityStatus() {
            return this.inTempCapacityStatus;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceRole
         */
        public String getInstanceRole() {
            return this.instanceRole;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
        }

        /**
         * @return mem
         */
        public Long getMem() {
            return this.mem;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return usedDiskSize
         */
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List < String > availableZones; 
            private String commodityCode; 
            private Integer cpu; 
            private String createTime; 
            private DataDiskAutoScaleConfig dataDiskAutoScaleConfig; 
            private String deployMode; 
            private String deployType; 
            private String diskSize; 
            private String diskType; 
            private Boolean enableUpgradeNodes; 
            private Integer expireSeconds; 
            private String expireTime; 
            private Boolean inTempCapacityStatus; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private String instanceRole; 
            private String instanceType; 
            private String maintainTime; 
            private Long mem; 
            private String payType; 
            private Resource resource; 
            private String resourceGroupId; 
            private String series; 
            private String state; 
            private Long usedDiskSize; 
            private String version; 
            private String vpcId; 

            /**
             * The time in UTC when the cluster expires.
             */
            public Builder availableZones(java.util.List < String > availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * The storage space of each replica node in the cluster, in GB.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The product code of the OceanBase cluster.   
             * <p>
             * - oceanbase_oceanbasepre_public_cn: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in a China site.  
             * - oceanbase_oceanbasepost_public_cn: indicates an OceanBase cluster that is billed based on the pay-as-you-go plan and that is deployed in a China site.  
             * - oceanbase_obpre_public_intl: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in an international site.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The number of OceanBase clusters queried.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataDiskAutoScaleConfig.
             */
            public Builder dataDiskAutoScaleConfig(DataDiskAutoScaleConfig dataDiskAutoScaleConfig) {
                this.dataDiskAutoScaleConfig = dataDiskAutoScaleConfig;
                return this;
            }

            /**
             * The request ID.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * The information about the memory resources of the cluster.
             */
            public Builder diskSize(String diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The number of CPU cores used in the cluster.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The ID of the OceanBase cluster.
             */
            public Builder enableUpgradeNodes(Boolean enableUpgradeNodes) {
                this.enableUpgradeNodes = enableUpgradeNodes;
                return this;
            }

            /**
             * The whitelist information of the cluster.
             */
            public Builder expireSeconds(Integer expireSeconds) {
                this.expireSeconds = expireSeconds;
                return this;
            }

            /**
             * The information about the storage resources of the cluster.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InTempCapacityStatus.
             */
            public Builder inTempCapacityStatus(Boolean inTempCapacityStatus) {
                this.inTempCapacityStatus = inTempCapacityStatus;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The total storage space of the cluster, in GB.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The return result of the request.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceRole.
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * You can call this operation to obtain the list of OceanBase clusters.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The return result of the request.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * The information about the CPU resources of the cluster.
             */
            public Builder mem(Long mem) {
                this.mem = mem;
                return this;
            }

            /**
             * It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The type of the storage disk where the cluster is deployed.   
             * <p>
             * The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The number of OceanBase clusters queried.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The billing method for the OceanBase cluster. Valid values:  
             * <p>
             * - PREPAY: the subscription billing method.  
             * - POSTPAY: the pay-as-you-go billing method.
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * The number of resource units in the cluster.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The number of resource units in the cluster.
             */
            public Builder usedDiskSize(Long usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            /**
             * The total number of CPU cores of the cluster.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * vpcId
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
