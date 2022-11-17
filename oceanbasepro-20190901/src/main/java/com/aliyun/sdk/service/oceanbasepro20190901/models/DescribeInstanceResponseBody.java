// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Instance")
    private Instance instance;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        /**
         * OceanBase 集群信息。
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * 请求 ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
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
        @NameInMap("DataUsedSize")
        private Double dataUsedSize;

        @NameInMap("MaxDiskUsedObServer")
        private java.util.List < String > maxDiskUsedObServer;

        @NameInMap("MaxDiskUsedPercent")
        private Double maxDiskUsedPercent;

        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        private DiskSize(Builder builder) {
            this.dataUsedSize = builder.dataUsedSize;
            this.maxDiskUsedObServer = builder.maxDiskUsedObServer;
            this.maxDiskUsedPercent = builder.maxDiskUsedPercent;
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
         * @return dataUsedSize
         */
        public Double getDataUsedSize() {
            return this.dataUsedSize;
        }

        /**
         * @return maxDiskUsedObServer
         */
        public java.util.List < String > getMaxDiskUsedObServer() {
            return this.maxDiskUsedObServer;
        }

        /**
         * @return maxDiskUsedPercent
         */
        public Double getMaxDiskUsedPercent() {
            return this.maxDiskUsedPercent;
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
            private Double dataUsedSize; 
            private java.util.List < String > maxDiskUsedObServer; 
            private Double maxDiskUsedPercent; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * DataUsedSize.
             */
            public Builder dataUsedSize(Double dataUsedSize) {
                this.dataUsedSize = dataUsedSize;
                return this;
            }

            /**
             * MaxDiskUsedObServer.
             */
            public Builder maxDiskUsedObServer(java.util.List < String > maxDiskUsedObServer) {
                this.maxDiskUsedObServer = maxDiskUsedObServer;
                return this;
            }

            /**
             * MaxDiskUsedPercent.
             */
            public Builder maxDiskUsedPercent(Double maxDiskUsedPercent) {
                this.maxDiskUsedPercent = maxDiskUsedPercent;
                return this;
            }

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
    public static class LogDiskSize extends TeaModel {
        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        private LogDiskSize(Builder builder) {
            this.totalDiskSize = builder.totalDiskSize;
            this.unitDiskSize = builder.unitDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogDiskSize create() {
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

        public static final class Builder {
            private Long totalDiskSize; 
            private Long unitDiskSize; 

            /**
             * 集群总日志盘空间，单位GB。
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * 集群每个副本的日志存储空间，单位：GB
             */
            public Builder unitDiskSize(Long unitDiskSize) {
                this.unitDiskSize = unitDiskSize;
                return this;
            }

            public LogDiskSize build() {
                return new LogDiskSize(this);
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

        @NameInMap("LogDiskSize")
        private LogDiskSize logDiskSize;

        @NameInMap("Memory")
        private Memory memory;

        @NameInMap("UnitCount")
        private Long unitCount;

        private Resource(Builder builder) {
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.logDiskSize = builder.logDiskSize;
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
         * @return logDiskSize
         */
        public LogDiskSize getLogDiskSize() {
            return this.logDiskSize;
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
            private LogDiskSize logDiskSize; 
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
             * 集群的日志盘资源信息
             */
            public Builder logDiskSize(LogDiskSize logDiskSize) {
                this.logDiskSize = logDiskSize;
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
    public static class Instance extends TeaModel {
        @NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @NameInMap("AutoUpgradeObVersion")
        private Boolean autoUpgradeObVersion;

        @NameInMap("AvailableZones")
        private java.util.List < String > availableZones;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataMergeTime")
        private String dataMergeTime;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("EnableUpgradeLogDisk")
        private Boolean enableUpgradeLogDisk;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("IsLatestObVersion")
        private Boolean isLatestObVersion;

        @NameInMap("IsTrustEcs")
        private Boolean isTrustEcs;

        @NameInMap("MaintainTime")
        private String maintainTime;

        @NameInMap("ObRpmVersion")
        private String obRpmVersion;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Resource")
        private Resource resource;

        @NameInMap("Series")
        private String series;

        @NameInMap("Status")
        private String status;

        @NameInMap("Version")
        private String version;

        private Instance(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.autoUpgradeObVersion = builder.autoUpgradeObVersion;
            this.availableZones = builder.availableZones;
            this.createTime = builder.createTime;
            this.dataMergeTime = builder.dataMergeTime;
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.diskType = builder.diskType;
            this.enableUpgradeLogDisk = builder.enableUpgradeLogDisk;
            this.expireTime = builder.expireTime;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.isLatestObVersion = builder.isLatestObVersion;
            this.isTrustEcs = builder.isTrustEcs;
            this.maintainTime = builder.maintainTime;
            this.obRpmVersion = builder.obRpmVersion;
            this.payType = builder.payType;
            this.resource = builder.resource;
            this.series = builder.series;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return autoUpgradeObVersion
         */
        public Boolean getAutoUpgradeObVersion() {
            return this.autoUpgradeObVersion;
        }

        /**
         * @return availableZones
         */
        public java.util.List < String > getAvailableZones() {
            return this.availableZones;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataMergeTime
         */
        public String getDataMergeTime() {
            return this.dataMergeTime;
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
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return enableUpgradeLogDisk
         */
        public Boolean getEnableUpgradeLogDisk() {
            return this.enableUpgradeLogDisk;
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
         * @return isLatestObVersion
         */
        public Boolean getIsLatestObVersion() {
            return this.isLatestObVersion;
        }

        /**
         * @return isTrustEcs
         */
        public Boolean getIsTrustEcs() {
            return this.isTrustEcs;
        }

        /**
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
        }

        /**
         * @return obRpmVersion
         */
        public String getObRpmVersion() {
            return this.obRpmVersion;
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
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean autoRenewal; 
            private Boolean autoUpgradeObVersion; 
            private java.util.List < String > availableZones; 
            private String createTime; 
            private String dataMergeTime; 
            private String deployMode; 
            private String deployType; 
            private String diskType; 
            private Boolean enableUpgradeLogDisk; 
            private String expireTime; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private Boolean isLatestObVersion; 
            private Boolean isTrustEcs; 
            private String maintainTime; 
            private String obRpmVersion; 
            private String payType; 
            private Resource resource; 
            private String series; 
            private String status; 
            private String version; 

            /**
             * 是否开启自动续费。该参数只在预付费（PREPAY）集群有意义。
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * 是否开启自动升级 OBServer 版本。
             */
            public Builder autoUpgradeObVersion(Boolean autoUpgradeObVersion) {
                this.autoUpgradeObVersion = autoUpgradeObVersion;
                return this;
            }

            /**
             * 可用区列表。
             */
            public Builder availableZones(java.util.List < String > availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * 集群的创建时间（UTC时间）。
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 集群的数据合并时间。
             */
            public Builder dataMergeTime(String dataMergeTime) {
                this.dataMergeTime = dataMergeTime;
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
             * 集群的部署类型。<br> - multiple：多机房 <br>- single：单机房 <br>- dual：双机房
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
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
             * 是否允许升级日志盘规格。
             */
            public Builder enableUpgradeLogDisk(Boolean enableUpgradeLogDisk) {
                this.enableUpgradeLogDisk = enableUpgradeLogDisk;
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
             * 集群规格信息。<br> 当前支持四种套餐：<br> - 8C32G：8核 32GB <br>- 14C70G：14核 70GB<br> - 30C180G：30核 180GB<br> - 62C400G：62核 400GB。
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * OceanBase 集群 ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OceanBase 集群名称。
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * OBServer版本是否为最新版本。
             */
            public Builder isLatestObVersion(Boolean isLatestObVersion) {
                this.isLatestObVersion = isLatestObVersion;
                return this;
            }

            /**
             * 是否使用可信ecs
             */
            public Builder isTrustEcs(Boolean isTrustEcs) {
                this.isTrustEcs = isTrustEcs;
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
             * OBServer 详细版本信息。
             */
            public Builder obRpmVersion(String obRpmVersion) {
                this.obRpmVersion = obRpmVersion;
                return this;
            }

            /**
             * OceanBase 集群的付费类型 <br>- PREPAY：预付费 <br>- POSTPAY：按量付费
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
             * OceanBase 集群的系列 <br>- NORMAL：高可用版本 <br>- BASIC：基础版本
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * 集群状态。 <br>- PENDING_CREATE: 创建中 <br>- ONLINE: 运行中 <br>- TENANT_CREATING：租户创建中 <br>- TENANT_SPEC_MODIFYING：租户规格修改中 <br>- EXPANDING: 节点扩容中 <br>- REDUCING: 节点缩容中 <br>- SPEC_UPGRADING:套餐规格扩容中 <br>- DISK_UPGRADING:存储规格扩容中 <br>- WHITE_LIST_MODIFYING: 修改白名单中 <br>- PARAMETER_MODIFYING: 修改参数中 <br>- SSL_MODIFYING: SSL变更中 <br>- PREPAID_EXPIRE_CLOSED: 预付费集群欠费中 <br>- ARREARS_CLOSED: 后付费集群欠费中 <br>- PENDING_DELETE: 删除中。 集群一般为运行中的状态（ONLINE）。
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * OBServer 版本信息。
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
