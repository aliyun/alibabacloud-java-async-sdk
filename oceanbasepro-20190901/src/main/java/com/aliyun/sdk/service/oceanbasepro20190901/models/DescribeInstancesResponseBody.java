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
         * Oceanbase集群列表。
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 查询到的Oceanbase集群个数。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class Cpu extends TeaModel {
        @NameInMap("TotalCpu")
        private Long totalCpu;

        @NameInMap("UnitCpu")
        private Long unitCpu;

        @NameInMap("UsedCpu")
        private Long usedCpu;

        private Cpu(Builder builder) {
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
            private Long totalCpu; 
            private Long unitCpu; 
            private Long usedCpu; 

            /**
             * 集群总CPU，单位：核数
             */
            public Builder totalCpu(Long totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * 集群中每个副本节点的CPU，单位：核数
             */
            public Builder unitCpu(Long unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * 集群已使用的CPU，单位：核数
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
        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        private DiskSize(Builder builder) {
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
            private Long totalDiskSize; 
            private Long unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * 集群总存储空间，单位：GB
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * 集群每个副本的存储空间，单位：GB
             */
            public Builder unitDiskSize(Long unitDiskSize) {
                this.unitDiskSize = unitDiskSize;
                return this;
            }

            /**
             * 集群已使用的存储空间，单位：GB
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
        @NameInMap("TotalMemory")
        private Long totalMemory;

        @NameInMap("UnitMemory")
        private Long unitMemory;

        @NameInMap("UsedMemory")
        private Long usedMemory;

        private Memory(Builder builder) {
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
            private Long totalMemory; 
            private Long unitMemory; 
            private Long usedMemory; 

            /**
             * 集群总内存，单位：GB
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * 集群中每个副本的内存，单位：GB
             */
            public Builder unitMemory(Long unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * 集群已使用的内存，单位：GB
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
        @NameInMap("Cpu")
        private Cpu cpu;

        @NameInMap("DiskSize")
        private DiskSize diskSize;

        @NameInMap("Memory")
        private Memory memory;

        @NameInMap("UnitCount")
        private Long unitCount;

        private Resource(Builder builder) {
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
            private Cpu cpu; 
            private DiskSize diskSize; 
            private Memory memory; 
            private Long unitCount; 

            /**
             * 集群的CPU资源信息
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * 集群的存储资源信息
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * 集群的内存资源信息
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * 集群的资源Unit数量。
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

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

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

        @NameInMap("SecurityIps")
        private java.util.List < String > securityIps;

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
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.enableUpgradeNodes = builder.enableUpgradeNodes;
            this.expireSeconds = builder.expireSeconds;
            this.expireTime = builder.expireTime;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.maintainTime = builder.maintainTime;
            this.mem = builder.mem;
            this.payType = builder.payType;
            this.resource = builder.resource;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityIps = builder.securityIps;
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
         * @return securityIps
         */
        public java.util.List < String > getSecurityIps() {
            return this.securityIps;
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
            private String deployMode; 
            private String deployType; 
            private String diskSize; 
            private String diskType; 
            private Boolean enableUpgradeNodes; 
            private Integer expireSeconds; 
            private String expireTime; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private String maintainTime; 
            private Long mem; 
            private String payType; 
            private Resource resource; 
            private String resourceGroupId; 
            private java.util.List < String > securityIps; 
            private String series; 
            private String state; 
            private Long usedDiskSize; 
            private String version; 
            private String vpcId; 

            /**
             * 集群部署所在的可用区信息。
             */
            public Builder availableZones(java.util.List < String > availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * Oceanbase集群的产品码。 - oceanbase_oceanbasepre_public_cn：国内站云数据库包年包月套餐。 - oceanbase_oceanbasepost_public_cn：国内站云数据库按小时付费套餐。 - oceanbase_obpre_public_intl：国际站云数据库包年包月套餐。
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * 集群的CPU核数。
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * 集群的创建时间，UTC时间。
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 集群的数据副本模式。 单机房为n，双机房为n-n，多机房为n-n-n，其中n为各机房的observer节点数。
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * 集群的部署类型。 - multiple：多机房 - single：单机房 - dual：双机房
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * 存储空间大小，单位GB。
             */
            public Builder diskSize(String diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * 集群部署的存储类型。默认为cloud_essd_pl1：ESSD云盘。
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * 是否允许新增节点。
             */
            public Builder enableUpgradeNodes(Boolean enableUpgradeNodes) {
                this.enableUpgradeNodes = enableUpgradeNodes;
                return this;
            }

            /**
             * 集群已过期时间，单位：秒(s)。
             */
            public Builder expireSeconds(Integer expireSeconds) {
                this.expireSeconds = expireSeconds;
                return this;
            }

            /**
             * 集群过期时间（UTC格式）。
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * 集群规格信息。 当前支持四种套餐： - 8C32G：8核 32GB - 14C70G：14核 70GB - 30C180G：30核 180GB - 62C400G：62核 400GB。
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * Oceanbase集群ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Oceanbase集群名称。
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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
             * 集群的每天例行维护时间，UTC时间。
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * 实例的内存大小，单位GB。
             */
            public Builder mem(Long mem) {
                this.mem = mem;
                return this;
            }

            /**
             * Oceanbase集群的付费类型 - PREPAY：预付费 - POSTPAY：按量付费
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * 集群的资源信息
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * 资源组ID信息。
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * 集群的白名单信息。（待废弃）
             */
            public Builder securityIps(java.util.List < String > securityIps) {
                this.securityIps = securityIps;
                return this;
            }

            /**
             * Oceanbase集群的系列 - NORMAL：高可用版本 - BASIC：基础版本
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * 集群状态。 - PENDING_CREATE: 创建中 - ONLINE: 运行中 - TENANT_CREATING：租户创建中 - TENANT_SPEC_MODIFYING：租户规格修改中 - EXPANDING: 节点扩容中 - REDUCING: 节点缩容中 - SPEC_UPGRADING:套餐规格扩容中 - DISK_UPGRADING:存储规格扩容中 - WHITE_LIST_MODIFYING: 修改白名单中 - PARAMETER_MODIFYING: 修改参数中 - SSL_MODIFYING: SSL变更中 - PREPAID_EXPIRE_CLOSED: 预付费集群欠费中 - ARREARS_CLOSED: 后付费集群欠费中 - PENDING_DELETE: 删除中。 集群一般为运行中的状态（ONLINE）。
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * 已使用的存储空间，单位GB。
             */
            public Builder usedDiskSize(Long usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            /**
             * Observer版本信息。
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
