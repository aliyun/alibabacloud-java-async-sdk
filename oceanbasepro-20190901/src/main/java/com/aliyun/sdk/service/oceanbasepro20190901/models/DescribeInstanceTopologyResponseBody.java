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
         * The number of CPU cores used by the node.
         */
        public Builder instanceTopology(InstanceTopology instanceTopology) {
            this.instanceTopology = instanceTopology;
            return this;
        }

        /**
         * The information about the CPU resources of the node.
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

        @NameInMap("ReplicaType")
        private String replicaType;

        @NameInMap("UnitCpu")
        private Float unitCpu;

        @NameInMap("UnitDataSize")
        private Long unitDataSize;

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
            this.replicaType = builder.replicaType;
            this.unitCpu = builder.unitCpu;
            this.unitDataSize = builder.unitDataSize;
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
         * @return replicaType
         */
        public String getReplicaType() {
            return this.replicaType;
        }

        /**
         * @return unitCpu
         */
        public Float getUnitCpu() {
            return this.unitCpu;
        }

        /**
         * @return unitDataSize
         */
        public Long getUnitDataSize() {
            return this.unitDataSize;
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
            private String replicaType; 
            private Float unitCpu; 
            private Long unitDataSize; 
            private String unitId; 
            private Float unitMemory; 
            private String unitStatus; 

            /**
             * Indicates whether the migration can be canceled.   
             * <p>
             * This field is valid only for units that are being manually immigrated or emigrated.
             */
            public Builder enableCancelMigrateUnit(Boolean enableCancelMigrateUnit) {
                this.enableCancelMigrateUnit = enableCancelMigrateUnit;
                return this;
            }

            /**
             * The return result of the request.
             */
            public Builder enableMigrateUnit(Boolean enableMigrateUnit) {
                this.enableMigrateUnit = enableMigrateUnit;
                return this;
            }

            /**
             * The return result of the request.
             */
            public Builder manualMigrate(Boolean manualMigrate) {
                this.manualMigrate = manualMigrate;
                return this;
            }

            /**
             * It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * ReplicaType.
             */
            public Builder replicaType(String replicaType) {
                this.replicaType = replicaType;
                return this;
            }

            /**
             * Alibaba Cloud CLI
             */
            public Builder unitCpu(Float unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * The operation that you want to perform.   
             * <p>
             * Set the value to **DescribeInstanceTopology**.
             */
            public Builder unitDataSize(Long unitDataSize) {
                this.unitDataSize = unitDataSize;
                return this;
            }

            /**
             * The topology of the cluster.
             */
            public Builder unitId(String unitId) {
                this.unitId = unitId;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder unitMemory(Float unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * You can call this operation to query the topology of an OceanBase cluster.
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
             * The maximum disk usage, in percentage.
             */
            public Builder isPrimaryTenantZone(String isPrimaryTenantZone) {
                this.isPrimaryTenantZone = isPrimaryTenantZone;
                return this;
            }

            /**
             * The server with the highest disk usage.
             */
            public Builder tenantZoneId(String tenantZoneId) {
                this.tenantZoneId = tenantZoneId;
                return this;
            }

            /**
             * The information of zones.
             */
            public Builder tenantZoneRole(String tenantZoneRole) {
                this.tenantZoneRole = tenantZoneRole;
                return this;
            }

            /**
             * The information about the storage resources.
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
        @NameInMap("PrimaryZoneDeployType")
        private String primaryZoneDeployType;

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
            this.primaryZoneDeployType = builder.primaryZoneDeployType;
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
         * @return primaryZoneDeployType
         */
        public String getPrimaryZoneDeployType() {
            return this.primaryZoneDeployType;
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
            private String primaryZoneDeployType; 
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
             * The server with the highest disk usage.
             */
            public Builder primaryZoneDeployType(String primaryZoneDeployType) {
                this.primaryZoneDeployType = primaryZoneDeployType;
                return this;
            }

            /**
             * The information about the memory resources of the node.
             */
            public Builder tenantCpu(Float tenantCpu) {
                this.tenantCpu = tenantCpu;
                return this;
            }

            /**
             * The name of the tenant.
             */
            public Builder tenantDeployType(String tenantDeployType) {
                this.tenantDeployType = tenantDeployType;
                return this;
            }

            /**
             * The size of used memory of the node, in GB.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The total storage space of the node, in GB.
             */
            public Builder tenantMemory(Float tenantMemory) {
                this.tenantMemory = tenantMemory;
                return this;
            }

            /**
             * The size of used storage space of the node, in GB.
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * The total memory size of the node, in GB.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * The size of used memory of the node, in GB.
             */
            public Builder tenantStatus(String tenantStatus) {
                this.tenantStatus = tenantStatus;
                return this;
            }

            /**
             * The number of CPU cores of the tenant.
             */
            public Builder tenantUnitNum(Integer tenantUnitNum) {
                this.tenantUnitNum = tenantUnitNum;
                return this;
            }

            /**
             * The information about the storage resources of the node.
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
             * The size of used storage space of the node, in GB.
             */
            public Builder totalCpu(Integer totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * Indicates whether migration can be performed.
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
        private Double totalDiskSize;

        @NameInMap("UsedDiskSize")
        private Double usedDiskSize;

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
        public Double getTotalDiskSize() {
            return this.totalDiskSize;
        }

        /**
         * @return usedDiskSize
         */
        public Double getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public static final class Builder {
            private Double totalDiskSize; 
            private Double usedDiskSize; 

            /**
             * The deployment type of the primary zone.
             */
            public Builder totalDiskSize(Double totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * The status of the tenant.   
             * <p>
             * - PENDING_CREATE: The tenant is being created.   
             * - RESTORE: The tenant is being recovered.   
             * - ONLINE: The tenant is running.   
             * - SPEC_MODIFYING: The specification of the tenant is being modified.   
             * - ALLOCATING_INTERNET_ADDRESS: An Internet address is being allocated.   
             * - PENDING_OFFLINE_INTERNET_ADDRESS: The Internet address is being disabled.   
             * - PRIMARY_ZONE_MODIFYING: The tenant is switching to a new primary zone.   
             * - PARAMETER_MODIFYING: Parameters are being modified.   
             * - WHITE_LIST_MODIFYING: The whitelist is being modified.
             */
            public Builder usedDiskSize(Double usedDiskSize) {
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
             * The ID of the replica node.
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * The information of node resources.
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
             * The memory size of the tenant, in GB.
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The information about the CPU resources of the node.
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The role to access the zone. Valid values:   
             * <p>
             *  - ReadWrite: a role that has the read and write privileges.
             *  - ReadOnly: a role that has only the read-only privilege.
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
        @NameInMap("FullCopyId")
        private Long fullCopyId;

        @NameInMap("NodeCopyId")
        private Long nodeCopyId;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeResource")
        private java.util.List < NodeResource> nodeResource;

        @NameInMap("NodeStatus")
        private String nodeStatus;

        @NameInMap("ReadOnlyCopyId")
        private Long readOnlyCopyId;

        @NameInMap("ReplicaType")
        private String replicaType;

        private Nodes(Builder builder) {
            this.fullCopyId = builder.fullCopyId;
            this.nodeCopyId = builder.nodeCopyId;
            this.nodeId = builder.nodeId;
            this.nodeResource = builder.nodeResource;
            this.nodeStatus = builder.nodeStatus;
            this.readOnlyCopyId = builder.readOnlyCopyId;
            this.replicaType = builder.replicaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return fullCopyId
         */
        public Long getFullCopyId() {
            return this.fullCopyId;
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

        /**
         * @return readOnlyCopyId
         */
        public Long getReadOnlyCopyId() {
            return this.readOnlyCopyId;
        }

        /**
         * @return replicaType
         */
        public String getReplicaType() {
            return this.replicaType;
        }

        public static final class Builder {
            private Long fullCopyId; 
            private Long nodeCopyId; 
            private String nodeId; 
            private java.util.List < NodeResource> nodeResource; 
            private String nodeStatus; 
            private Long readOnlyCopyId; 
            private String replicaType; 

            /**
             * FullCopyId.
             */
            public Builder fullCopyId(Long fullCopyId) {
                this.fullCopyId = fullCopyId;
                return this;
            }

            /**
             * The information of zones.
             */
            public Builder nodeCopyId(Long nodeCopyId) {
                this.nodeCopyId = nodeCopyId;
                return this;
            }

            /**
             * The ID of the resource unit.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder nodeResource(java.util.List < NodeResource> nodeResource) {
                this.nodeResource = nodeResource;
                return this;
            }

            /**
             * The ID of the OBServer where the resource unit resides.
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * ReadOnlyCopyId.
             */
            public Builder readOnlyCopyId(Long readOnlyCopyId) {
                this.readOnlyCopyId = readOnlyCopyId;
                return this;
            }

            /**
             * ReplicaType.
             */
            public Builder replicaType(String replicaType) {
                this.replicaType = replicaType;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class ZoneResourceDiskSize extends TeaModel {
        @NameInMap("MaxDiskUsedObServer")
        private java.util.List < String > maxDiskUsedObServer;

        @NameInMap("MaxDiskUsedPercent")
        private Double maxDiskUsedPercent;

        private ZoneResourceDiskSize(Builder builder) {
            this.maxDiskUsedObServer = builder.maxDiskUsedObServer;
            this.maxDiskUsedPercent = builder.maxDiskUsedPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneResourceDiskSize create() {
            return builder().build();
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

        public static final class Builder {
            private java.util.List < String > maxDiskUsedObServer; 
            private Double maxDiskUsedPercent; 

            /**
             * MaxDiskUsedObServer.
             */
            public Builder maxDiskUsedObServer(java.util.List < String > maxDiskUsedObServer) {
                this.maxDiskUsedObServer = maxDiskUsedObServer;
                return this;
            }

            /**
             * DescribeInstanceTopology
             */
            public Builder maxDiskUsedPercent(Double maxDiskUsedPercent) {
                this.maxDiskUsedPercent = maxDiskUsedPercent;
                return this;
            }

            public ZoneResourceDiskSize build() {
                return new ZoneResourceDiskSize(this);
            } 

        } 

    }
    public static class ZoneResource extends TeaModel {
        @NameInMap("DiskSize")
        private ZoneResourceDiskSize diskSize;

        private ZoneResource(Builder builder) {
            this.diskSize = builder.diskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneResource create() {
            return builder().build();
        }

        /**
         * @return diskSize
         */
        public ZoneResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public static final class Builder {
            private ZoneResourceDiskSize diskSize; 

            /**
             * The information about the CPU resources of the node.
             */
            public Builder diskSize(ZoneResourceDiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            public ZoneResource build() {
                return new ZoneResource(this);
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

        @NameInMap("ZoneResource")
        private ZoneResource zoneResource;

        private Zones(Builder builder) {
            this.nodes = builder.nodes;
            this.region = builder.region;
            this.zoneDisk = builder.zoneDisk;
            this.zoneId = builder.zoneId;
            this.zoneResource = builder.zoneResource;
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

        /**
         * @return zoneResource
         */
        public ZoneResource getZoneResource() {
            return this.zoneResource;
        }

        public static final class Builder {
            private java.util.List < Nodes> nodes; 
            private String region; 
            private String zoneDisk; 
            private String zoneId; 
            private ZoneResource zoneResource; 

            /**
             * The ID of the region.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * The zone information of the cluster.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The information about the memory resources of the node.
             */
            public Builder zoneDisk(String zoneDisk) {
                this.zoneDisk = zoneDisk;
                return this;
            }

            /**
             * The information of the tenant.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * Example 1
             */
            public Builder zoneResource(ZoneResource zoneResource) {
                this.zoneResource = zoneResource;
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
             * The total number of CPU cores for the node.
             */
            public Builder tenants(java.util.List < Tenants> tenants) {
                this.tenants = tenants;
                return this;
            }

            /**
             * The information about resource units.
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
