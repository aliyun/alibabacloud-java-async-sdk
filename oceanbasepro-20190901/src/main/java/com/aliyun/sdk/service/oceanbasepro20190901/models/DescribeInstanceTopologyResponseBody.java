// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTopologyResponseBody</p>
 */
public class DescribeInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("InstanceTopology")
    private InstanceTopology instanceTopology;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceTopologyResponseBody(Builder builder) {
        this.instanceTopology = builder.instanceTopology;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTopologyResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTopology
     */
    public InstanceTopology getInstanceTopology() {
        return this.instanceTopology;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceTopology instanceTopology; 
        private String requestId; 

        /**
         * 集群的拓扑信息。
         */
        public Builder instanceTopology(InstanceTopology instanceTopology) {
            this.instanceTopology = instanceTopology;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTopologyResponseBody build() {
            return new DescribeInstanceTopologyResponseBody(this);
        } 

    } 

    public static class Units extends TeaModel {
        @NameInMap("EnableCancelMigrateUnit")
        private Boolean enableCancelMigrateUnit;

        @NameInMap("EnableMigrateUnit")
        private Boolean enableMigrateUnit;

        @NameInMap("ManualMigrate")
        private Boolean manualMigrate;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("UnitCpu")
        private Float unitCpu;

        @NameInMap("UnitId")
        private String unitId;

        @NameInMap("UnitMemory")
        private Float unitMemory;

        @NameInMap("UnitStatus")
        private String unitStatus;

        private Units(Builder builder) {
            this.enableCancelMigrateUnit = builder.enableCancelMigrateUnit;
            this.enableMigrateUnit = builder.enableMigrateUnit;
            this.manualMigrate = builder.manualMigrate;
            this.nodeId = builder.nodeId;
            this.unitCpu = builder.unitCpu;
            this.unitId = builder.unitId;
            this.unitMemory = builder.unitMemory;
            this.unitStatus = builder.unitStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Units create() {
            return builder().build();
        }

        /**
         * @return enableCancelMigrateUnit
         */
        public Boolean getEnableCancelMigrateUnit() {
            return this.enableCancelMigrateUnit;
        }

        /**
         * @return enableMigrateUnit
         */
        public Boolean getEnableMigrateUnit() {
            return this.enableMigrateUnit;
        }

        /**
         * @return manualMigrate
         */
        public Boolean getManualMigrate() {
            return this.manualMigrate;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return unitCpu
         */
        public Float getUnitCpu() {
            return this.unitCpu;
        }

        /**
         * @return unitId
         */
        public String getUnitId() {
            return this.unitId;
        }

        /**
         * @return unitMemory
         */
        public Float getUnitMemory() {
            return this.unitMemory;
        }

        /**
         * @return unitStatus
         */
        public String getUnitStatus() {
            return this.unitStatus;
        }

        public static final class Builder {
            private Boolean enableCancelMigrateUnit; 
            private Boolean enableMigrateUnit; 
            private Boolean manualMigrate; 
            private String nodeId; 
            private Float unitCpu; 
            private String unitId; 
            private Float unitMemory; 
            private String unitStatus; 

            /**
             * 是否可以取消迁移。该字段只对正在手动迁入中或手动迁出中的unit有效。
             */
            public Builder enableCancelMigrateUnit(Boolean enableCancelMigrateUnit) {
                this.enableCancelMigrateUnit = enableCancelMigrateUnit;
                return this;
            }

            /**
             * 是否可做迁移。
             */
            public Builder enableMigrateUnit(Boolean enableMigrateUnit) {
                this.enableMigrateUnit = enableMigrateUnit;
                return this;
            }

            /**
             * 是否为手动迁移。
             */
            public Builder manualMigrate(Boolean manualMigrate) {
                this.manualMigrate = manualMigrate;
                return this;
            }

            /**
             * 资源节点所在的observer节点ID
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * 资源节点CPU，单位：核。
             */
            public Builder unitCpu(Float unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * 资源节点ID
             */
            public Builder unitId(String unitId) {
                this.unitId = unitId;
                return this;
            }

            /**
             * 资源节点内存大小，单位：GB。
             */
            public Builder unitMemory(Float unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * 资源节点的状态。 ONLINE: 运行中 IMMIGRATING 迁入中 EMIGRATING: 迁出中 CANCEL_EMIGRATING: 取消迁入中 CANCEL_EMIGRATING：取消迁出中 DELETING：删除中
             */
            public Builder unitStatus(String unitStatus) {
                this.unitStatus = unitStatus;
                return this;
            }

            public Units build() {
                return new Units(this);
            } 

        } 

    }
    public static class TenantZones extends TeaModel {
        @NameInMap("IsPrimaryTenantZone")
        private String isPrimaryTenantZone;

        @NameInMap("TenantZoneId")
        private String tenantZoneId;

        @NameInMap("TenantZoneRole")
        private String tenantZoneRole;

        @NameInMap("Units")
        private java.util.List < Units> units;

        private TenantZones(Builder builder) {
            this.isPrimaryTenantZone = builder.isPrimaryTenantZone;
            this.tenantZoneId = builder.tenantZoneId;
            this.tenantZoneRole = builder.tenantZoneRole;
            this.units = builder.units;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantZones create() {
            return builder().build();
        }

        /**
         * @return isPrimaryTenantZone
         */
        public String getIsPrimaryTenantZone() {
            return this.isPrimaryTenantZone;
        }

        /**
         * @return tenantZoneId
         */
        public String getTenantZoneId() {
            return this.tenantZoneId;
        }

        /**
         * @return tenantZoneRole
         */
        public String getTenantZoneRole() {
            return this.tenantZoneRole;
        }

        /**
         * @return units
         */
        public java.util.List < Units> getUnits() {
            return this.units;
        }

        public static final class Builder {
            private String isPrimaryTenantZone; 
            private String tenantZoneId; 
            private String tenantZoneRole; 
            private java.util.List < Units> units; 

            /**
             * 是否为主可用区
             */
            public Builder isPrimaryTenantZone(String isPrimaryTenantZone) {
                this.isPrimaryTenantZone = isPrimaryTenantZone;
                return this;
            }

            /**
             * 可用区ID。
             */
            public Builder tenantZoneId(String tenantZoneId) {
                this.tenantZoneId = tenantZoneId;
                return this;
            }

            /**
             * 可用区的访问角色。 - ReadWrite：可读可写 - ReadOnly：只读。
             */
            public Builder tenantZoneRole(String tenantZoneRole) {
                this.tenantZoneRole = tenantZoneRole;
                return this;
            }

            /**
             * 资源节点信息列表
             */
            public Builder units(java.util.List < Units> units) {
                this.units = units;
                return this;
            }

            public TenantZones build() {
                return new TenantZones(this);
            } 

        } 

    }
    public static class Tenants extends TeaModel {
        @NameInMap("TenantCpu")
        private Float tenantCpu;

        @NameInMap("TenantDeployType")
        private String tenantDeployType;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TenantMemory")
        private Float tenantMemory;

        @NameInMap("TenantMode")
        private String tenantMode;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("TenantStatus")
        private String tenantStatus;

        @NameInMap("TenantUnitNum")
        private Integer tenantUnitNum;

        @NameInMap("TenantZones")
        private java.util.List < TenantZones> tenantZones;

        private Tenants(Builder builder) {
            this.tenantCpu = builder.tenantCpu;
            this.tenantDeployType = builder.tenantDeployType;
            this.tenantId = builder.tenantId;
            this.tenantMemory = builder.tenantMemory;
            this.tenantMode = builder.tenantMode;
            this.tenantName = builder.tenantName;
            this.tenantStatus = builder.tenantStatus;
            this.tenantUnitNum = builder.tenantUnitNum;
            this.tenantZones = builder.tenantZones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tenants create() {
            return builder().build();
        }

        /**
         * @return tenantCpu
         */
        public Float getTenantCpu() {
            return this.tenantCpu;
        }

        /**
         * @return tenantDeployType
         */
        public String getTenantDeployType() {
            return this.tenantDeployType;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantMemory
         */
        public Float getTenantMemory() {
            return this.tenantMemory;
        }

        /**
         * @return tenantMode
         */
        public String getTenantMode() {
            return this.tenantMode;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return tenantStatus
         */
        public String getTenantStatus() {
            return this.tenantStatus;
        }

        /**
         * @return tenantUnitNum
         */
        public Integer getTenantUnitNum() {
            return this.tenantUnitNum;
        }

        /**
         * @return tenantZones
         */
        public java.util.List < TenantZones> getTenantZones() {
            return this.tenantZones;
        }

        public static final class Builder {
            private Float tenantCpu; 
            private String tenantDeployType; 
            private String tenantId; 
            private Float tenantMemory; 
            private String tenantMode; 
            private String tenantName; 
            private String tenantStatus; 
            private Integer tenantUnitNum; 
            private java.util.List < TenantZones> tenantZones; 

            /**
             * 租户CPU，单位：核。
             */
            public Builder tenantCpu(Float tenantCpu) {
                this.tenantCpu = tenantCpu;
                return this;
            }

            /**
             * 租户的部署类型。 - multiple：多机房 - single：单机房 - dual：双机房。
             */
            public Builder tenantDeployType(String tenantDeployType) {
                this.tenantDeployType = tenantDeployType;
                return this;
            }

            /**
             * 租户ID。
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * 租户内存大小，单位：GB。
             */
            public Builder tenantMemory(Float tenantMemory) {
                this.tenantMemory = tenantMemory;
                return this;
            }

            /**
             * 租户模式。 - Oracle：Oracle模式 - MySQL：MySQL模式。
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * 租户名称。
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * 租户状态。 - PENDING_CREATE: 创建中 - RESTORE: 恢复中 - ONLINE: 运行中 - SPEC_MODIFYING: 规格修改中 - ALLOCATING_INTERNET_ADDRESS: 公网地址分配中 - PENDING_OFFLINE_INTERNET_ADDRESS: 公网地址关闭中 - PRIMARY_ZONE_MODIFYING: 切主可用区中 - PARAMETER_MODIFYING: 参数修改中 - WHITE_LIST_MODIFING: 白名单修改中
             */
            public Builder tenantStatus(String tenantStatus) {
                this.tenantStatus = tenantStatus;
                return this;
            }

            /**
             * 租户的unit个数。
             */
            public Builder tenantUnitNum(Integer tenantUnitNum) {
                this.tenantUnitNum = tenantUnitNum;
                return this;
            }

            /**
             * 租户的可用区信息。
             */
            public Builder tenantZones(java.util.List < TenantZones> tenantZones) {
                this.tenantZones = tenantZones;
                return this;
            }

            public Tenants build() {
                return new Tenants(this);
            } 

        } 

    }
    public static class Cpu extends TeaModel {
        @NameInMap("TotalCpu")
        private Integer totalCpu;

        @NameInMap("UsedCpu")
        private Float usedCpu;

        private Cpu(Builder builder) {
            this.totalCpu = builder.totalCpu;
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
        public Integer getTotalCpu() {
            return this.totalCpu;
        }

        /**
         * @return usedCpu
         */
        public Float getUsedCpu() {
            return this.usedCpu;
        }

        public static final class Builder {
            private Integer totalCpu; 
            private Float usedCpu; 

            /**
             * 节点总的CPU，单位：核。
             */
            public Builder totalCpu(Integer totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * 节点已使用的CPU，单位：核。
             */
            public Builder usedCpu(Float usedCpu) {
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

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        private DiskSize(Builder builder) {
            this.totalDiskSize = builder.totalDiskSize;
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
         * @return usedDiskSize
         */
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public static final class Builder {
            private Long totalDiskSize; 
            private Long usedDiskSize; 

            /**
             * 节点总存储空间，单位：GB。
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * 节点已使用的存储空间，单位：GB。
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

        @NameInMap("UsedMemory")
        private Float usedMemory;

        private Memory(Builder builder) {
            this.totalMemory = builder.totalMemory;
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
         * @return usedMemory
         */
        public Float getUsedMemory() {
            return this.usedMemory;
        }

        public static final class Builder {
            private Long totalMemory; 
            private Float usedMemory; 

            /**
             * 节点的总内存，单位：GB。
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * 节点已使用的内存，单位：GB。
             */
            public Builder usedMemory(Float usedMemory) {
                this.usedMemory = usedMemory;
                return this;
            }

            public Memory build() {
                return new Memory(this);
            } 

        } 

    }
    public static class NodeResource extends TeaModel {
        @NameInMap("Cpu")
        private Cpu cpu;

        @NameInMap("DiskSize")
        private DiskSize diskSize;

        @NameInMap("Memory")
        private Memory memory;

        private NodeResource(Builder builder) {
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeResource create() {
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

        public static final class Builder {
            private Cpu cpu; 
            private DiskSize diskSize; 
            private Memory memory; 

            /**
             * 节点CPU资源信息。
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * 节点存储资源信息。
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * 节点内存资源信息。
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            public NodeResource build() {
                return new NodeResource(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("NodeCopyId")
        private Long nodeCopyId;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeResource")
        private java.util.List < NodeResource> nodeResource;

        @NameInMap("NodeStatus")
        private String nodeStatus;

        private Nodes(Builder builder) {
            this.nodeCopyId = builder.nodeCopyId;
            this.nodeId = builder.nodeId;
            this.nodeResource = builder.nodeResource;
            this.nodeStatus = builder.nodeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return nodeCopyId
         */
        public Long getNodeCopyId() {
            return this.nodeCopyId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeResource
         */
        public java.util.List < NodeResource> getNodeResource() {
            return this.nodeResource;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public static final class Builder {
            private Long nodeCopyId; 
            private String nodeId; 
            private java.util.List < NodeResource> nodeResource; 
            private String nodeStatus; 

            /**
             * 节点归属的副本ID。
             */
            public Builder nodeCopyId(Long nodeCopyId) {
                this.nodeCopyId = nodeCopyId;
                return this;
            }

            /**
             * 节点ID。
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * 节点资源信息。
             */
            public Builder nodeResource(java.util.List < NodeResource> nodeResource) {
                this.nodeResource = nodeResource;
                return this;
            }

            /**
             * 节点运行状态。
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("Region")
        private String region;

        @NameInMap("ZoneDisk")
        private String zoneDisk;

        @NameInMap("ZoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.nodes = builder.nodes;
            this.region = builder.region;
            this.zoneDisk = builder.zoneDisk;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return zoneDisk
         */
        public String getZoneDisk() {
            return this.zoneDisk;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List < Nodes> nodes; 
            private String region; 
            private String zoneDisk; 
            private String zoneId; 

            /**
             * 节点信息。
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * 地域ID。
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * 可用区的存储容量。
             */
            public Builder zoneDisk(String zoneDisk) {
                this.zoneDisk = zoneDisk;
                return this;
            }

            /**
             * 可用区ID。
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    public static class InstanceTopology extends TeaModel {
        @NameInMap("Tenants")
        private java.util.List < Tenants> tenants;

        @NameInMap("Zones")
        private java.util.List < Zones> zones;

        private InstanceTopology(Builder builder) {
            this.tenants = builder.tenants;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTopology create() {
            return builder().build();
        }

        /**
         * @return tenants
         */
        public java.util.List < Tenants> getTenants() {
            return this.tenants;
        }

        /**
         * @return zones
         */
        public java.util.List < Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private java.util.List < Tenants> tenants; 
            private java.util.List < Zones> zones; 

            /**
             * 租户信息。
             */
            public Builder tenants(java.util.List < Tenants> tenants) {
                this.tenants = tenants;
                return this;
            }

            /**
             * 集群的可用区信息。
             */
            public Builder zones(java.util.List < Zones> zones) {
                this.zones = zones;
                return this;
            }

            public InstanceTopology build() {
                return new InstanceTopology(this);
            } 

        } 

    }
}
