// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTopologyResponseBody</p>
 */
public class DescribeInstanceTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTopology")
    private InstanceTopology instanceTopology;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceTopologyResponseBody model) {
            this.instanceTopology = model.instanceTopology;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The topology of the cluster.</p>
         */
        public Builder instanceTopology(InstanceTopology instanceTopology) {
            this.instanceTopology = instanceTopology;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTopologyResponseBody build() {
            return new DescribeInstanceTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class Cpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalCpu")
        private Integer totalCpu;

        @com.aliyun.core.annotation.NameInMap("UsedCpu")
        private Integer usedCpu;

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
        public Integer getUsedCpu() {
            return this.usedCpu;
        }

        public static final class Builder {
            private Integer totalCpu; 
            private Integer usedCpu; 

            private Builder() {
            } 

            private Builder(Cpu model) {
                this.totalCpu = model.totalCpu;
                this.usedCpu = model.usedCpu;
            } 

            /**
             * <p>The total number of CPU cores of the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder totalCpu(Integer totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * <p>The number of CPU cores used by the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder usedCpu(Integer usedCpu) {
                this.usedCpu = usedCpu;
                return this;
            }

            public Cpu build() {
                return new Cpu(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class DiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @com.aliyun.core.annotation.NameInMap("UsedDiskSize")
        private Float usedDiskSize;

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
        public Float getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public static final class Builder {
            private Long totalDiskSize; 
            private Float usedDiskSize; 

            private Builder() {
            } 

            private Builder(DiskSize model) {
                this.totalDiskSize = model.totalDiskSize;
                this.usedDiskSize = model.usedDiskSize;
            } 

            /**
             * <p>The total disk space of the replica, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * <p>The disk space used by the replica, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder usedDiskSize(Float usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            public DiskSize build() {
                return new DiskSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class Memory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Long totalMemory;

        @com.aliyun.core.annotation.NameInMap("UsedMemory")
        private Long usedMemory;

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
        public Long getUsedMemory() {
            return this.usedMemory;
        }

        public static final class Builder {
            private Long totalMemory; 
            private Long usedMemory; 

            private Builder() {
            } 

            private Builder(Memory model) {
                this.totalMemory = model.totalMemory;
                this.usedMemory = model.usedMemory;
            } 

            /**
             * <p>The total memory size of the replica, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * <p>The size of memory used by the replica, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
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
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class ReplicaResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Cpu cpu;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private DiskSize diskSize;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Memory memory;

        private ReplicaResource(Builder builder) {
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaResource create() {
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

            private Builder() {
            } 

            private Builder(ReplicaResource model) {
                this.cpu = model.cpu;
                this.diskSize = model.diskSize;
                this.memory = model.memory;
            } 

            /**
             * <p>The information about the CPU resources of the replica.</p>
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The information about the data disk of the replica.</p>
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The information about the memory resources of the replica.</p>
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            public ReplicaResource build() {
                return new ReplicaResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class Replicas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogicalZone")
        private String logicalZone;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyReplicaType")
        private String readOnlyReplicaType;

        @com.aliyun.core.annotation.NameInMap("ReplicaResource")
        private ReplicaResource replicaResource;

        @com.aliyun.core.annotation.NameInMap("ReplicaType")
        private String replicaType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ZoneLogicalId")
        private Integer zoneLogicalId;

        @com.aliyun.core.annotation.NameInMap("ZoneLogicalName")
        private String zoneLogicalName;

        @com.aliyun.core.annotation.NameInMap("ZoneRegionName")
        private String zoneRegionName;

        private Replicas(Builder builder) {
            this.logicalZone = builder.logicalZone;
            this.nodeNum = builder.nodeNum;
            this.readOnlyReplicaType = builder.readOnlyReplicaType;
            this.replicaResource = builder.replicaResource;
            this.replicaType = builder.replicaType;
            this.status = builder.status;
            this.zoneLogicalId = builder.zoneLogicalId;
            this.zoneLogicalName = builder.zoneLogicalName;
            this.zoneRegionName = builder.zoneRegionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Replicas create() {
            return builder().build();
        }

        /**
         * @return logicalZone
         */
        public String getLogicalZone() {
            return this.logicalZone;
        }

        /**
         * @return nodeNum
         */
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return readOnlyReplicaType
         */
        public String getReadOnlyReplicaType() {
            return this.readOnlyReplicaType;
        }

        /**
         * @return replicaResource
         */
        public ReplicaResource getReplicaResource() {
            return this.replicaResource;
        }

        /**
         * @return replicaType
         */
        public String getReplicaType() {
            return this.replicaType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return zoneLogicalId
         */
        public Integer getZoneLogicalId() {
            return this.zoneLogicalId;
        }

        /**
         * @return zoneLogicalName
         */
        public String getZoneLogicalName() {
            return this.zoneLogicalName;
        }

        /**
         * @return zoneRegionName
         */
        public String getZoneRegionName() {
            return this.zoneRegionName;
        }

        public static final class Builder {
            private String logicalZone; 
            private Integer nodeNum; 
            private String readOnlyReplicaType; 
            private ReplicaResource replicaResource; 
            private String replicaType; 
            private String status; 
            private Integer zoneLogicalId; 
            private String zoneLogicalName; 
            private String zoneRegionName; 

            private Builder() {
            } 

            private Builder(Replicas model) {
                this.logicalZone = model.logicalZone;
                this.nodeNum = model.nodeNum;
                this.readOnlyReplicaType = model.readOnlyReplicaType;
                this.replicaResource = model.replicaResource;
                this.replicaType = model.replicaType;
                this.status = model.status;
                this.zoneLogicalId = model.zoneLogicalId;
                this.zoneLogicalName = model.zoneLogicalName;
                this.zoneRegionName = model.zoneRegionName;
            } 

            /**
             * <p>The ID of the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h-z0</p>
             */
            public Builder logicalZone(String logicalZone) {
                this.logicalZone = logicalZone;
                return this;
            }

            /**
             * <p>The number of nodes of the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * <p>The type of the read-only replica.</p>
             * 
             * <strong>example:</strong>
             * <p>ROW_STORE</p>
             */
            public Builder readOnlyReplicaType(String readOnlyReplicaType) {
                this.readOnlyReplicaType = readOnlyReplicaType;
                return this;
            }

            /**
             * <p>The information about the replica resources.</p>
             */
            public Builder replicaResource(ReplicaResource replicaResource) {
                this.replicaResource = replicaResource;
                return this;
            }

            /**
             * <p>The type of the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>FULL</p>
             */
            public Builder replicaType(String replicaType) {
                this.replicaType = replicaType;
                return this;
            }

            /**
             * <p>The status of the replica. Valid values: ACTIVE, INACTIVE, and UNKNOWN.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The serial number of the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder zoneLogicalId(Integer zoneLogicalId) {
                this.zoneLogicalId = zoneLogicalId;
                return this;
            }

            /**
             * <p>The region of the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneLogicalName(String zoneLogicalName) {
                this.zoneLogicalName = zoneLogicalName;
                return this;
            }

            /**
             * <p>The zone of the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneRegionName(String zoneRegionName) {
                this.zoneRegionName = zoneRegionName;
                return this;
            }

            public Replicas build() {
                return new Replicas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class Units extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableCancelMigrateUnit")
        private Boolean enableCancelMigrateUnit;

        @com.aliyun.core.annotation.NameInMap("EnableMigrateUnit")
        private Boolean enableMigrateUnit;

        @com.aliyun.core.annotation.NameInMap("ManualMigrate")
        private Boolean manualMigrate;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ReplicaType")
        private String replicaType;

        @com.aliyun.core.annotation.NameInMap("UnitCpu")
        private Float unitCpu;

        @com.aliyun.core.annotation.NameInMap("UnitDataSize")
        private Long unitDataSize;

        @com.aliyun.core.annotation.NameInMap("UnitId")
        private String unitId;

        @com.aliyun.core.annotation.NameInMap("UnitMemory")
        private Float unitMemory;

        @com.aliyun.core.annotation.NameInMap("UnitStatus")
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

            private Builder() {
            } 

            private Builder(Units model) {
                this.enableCancelMigrateUnit = model.enableCancelMigrateUnit;
                this.enableMigrateUnit = model.enableMigrateUnit;
                this.manualMigrate = model.manualMigrate;
                this.nodeId = model.nodeId;
                this.replicaType = model.replicaType;
                this.unitCpu = model.unitCpu;
                this.unitDataSize = model.unitDataSize;
                this.unitId = model.unitId;
                this.unitMemory = model.unitMemory;
                this.unitStatus = model.unitStatus;
            } 

            /**
             * <p>Indicates whether the migration can be canceled. This parameter is valid only for resource units that are being manually immigrated or emigrated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableCancelMigrateUnit(Boolean enableCancelMigrateUnit) {
                this.enableCancelMigrateUnit = enableCancelMigrateUnit;
                return this;
            }

            /**
             * <p>Indicates whether the resource unit can be migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableMigrateUnit(Boolean enableMigrateUnit) {
                this.enableMigrateUnit = enableMigrateUnit;
                return this;
            }

            /**
             * <p>Indicates whether the resource unit is manually migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder manualMigrate(Boolean manualMigrate) {
                this.manualMigrate = manualMigrate;
                return this;
            }

            /**
             * <p>The ID of the OBServer node in which the resource unit resides.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp16niirq4zdmgvm****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The type of the replica. Node filtering conditions are configured based on the replica type when you query the monitoring data of the OceanBase cluster. </p>
             * <ul>
             * <li>By default, the replica type is not specified when you query the monitoring data of OceanBase clusters or the access proxy. If you do not specify the replica type when you query the monitoring data of an OceanBase cluster, the monitoring data of all nodes is queried. </li>
             * <li>If you set the replica type to FULL when you query the monitoring data of an OceanBase cluster, the monitoring data of only the full-featured replica nodes is queried. </li>
             * <li>If you set the replica type to READONLY when you query the monitoring data of an OceanBase cluster, the monitoring data of only the read-only replica nodes is queried.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FULL</p>
             */
            public Builder replicaType(String replicaType) {
                this.replicaType = replicaType;
                return this;
            }

            /**
             * <p>The number of CPU cores of the resource unit.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder unitCpu(Float unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * <p>The data size of the resource unit.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unitDataSize(Long unitDataSize) {
                this.unitDataSize = unitDataSize;
                return this;
            }

            /**
             * <p>The ID of the resource unit.</p>
             * 
             * <strong>example:</strong>
             * <p>1002</p>
             */
            public Builder unitId(String unitId) {
                this.unitId = unitId;
                return this;
            }

            /**
             * <p>The memory size of the resource unit, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unitMemory(Float unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * <p>The status of the resource unit. Valid values: </p>
             * <ul>
             * <li>ONLINE: The resource unit is running. </li>
             * <li>IMMIGRATING: The resource unit is being immigrated. </li>
             * <li>EMIGRATING: The resource unit is being emigrated. </li>
             * <li>CANCEL_EMIGRATING: The immigration of the resource unit is being canceled. </li>
             * <li>CANCEL_EMIGRATING: The emigration of the resource unit is being canceled. </li>
             * <li>DELETING: The resource unit is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
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
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class TenantZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsPrimaryTenantZone")
        private Boolean isPrimaryTenantZone;

        @com.aliyun.core.annotation.NameInMap("LogicalZone")
        private String logicalZone;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyReplicaType")
        private String readOnlyReplicaType;

        @com.aliyun.core.annotation.NameInMap("ReplicaType")
        private String replicaType;

        @com.aliyun.core.annotation.NameInMap("TenantZoneId")
        private String tenantZoneId;

        @com.aliyun.core.annotation.NameInMap("TenantZoneRole")
        private String tenantZoneRole;

        @com.aliyun.core.annotation.NameInMap("Units")
        private java.util.List<Units> units;

        private TenantZones(Builder builder) {
            this.isPrimaryTenantZone = builder.isPrimaryTenantZone;
            this.logicalZone = builder.logicalZone;
            this.readOnlyReplicaType = builder.readOnlyReplicaType;
            this.replicaType = builder.replicaType;
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
        public Boolean getIsPrimaryTenantZone() {
            return this.isPrimaryTenantZone;
        }

        /**
         * @return logicalZone
         */
        public String getLogicalZone() {
            return this.logicalZone;
        }

        /**
         * @return readOnlyReplicaType
         */
        public String getReadOnlyReplicaType() {
            return this.readOnlyReplicaType;
        }

        /**
         * @return replicaType
         */
        public String getReplicaType() {
            return this.replicaType;
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
        public java.util.List<Units> getUnits() {
            return this.units;
        }

        public static final class Builder {
            private Boolean isPrimaryTenantZone; 
            private String logicalZone; 
            private String readOnlyReplicaType; 
            private String replicaType; 
            private String tenantZoneId; 
            private String tenantZoneRole; 
            private java.util.List<Units> units; 

            private Builder() {
            } 

            private Builder(TenantZones model) {
                this.isPrimaryTenantZone = model.isPrimaryTenantZone;
                this.logicalZone = model.logicalZone;
                this.readOnlyReplicaType = model.readOnlyReplicaType;
                this.replicaType = model.replicaType;
                this.tenantZoneId = model.tenantZoneId;
                this.tenantZoneRole = model.tenantZoneRole;
                this.units = model.units;
            } 

            /**
             * <p>Indicates whether the zone is the primary zone.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPrimaryTenantZone(Boolean isPrimaryTenantZone) {
                this.isPrimaryTenantZone = isPrimaryTenantZone;
                return this;
            }

            /**
             * <p>The ID of the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h-z0</p>
             */
            public Builder logicalZone(String logicalZone) {
                this.logicalZone = logicalZone;
                return this;
            }

            /**
             * <p>The type of the read-only replica.</p>
             * 
             * <strong>example:</strong>
             * <p>ROW_STORE</p>
             */
            public Builder readOnlyReplicaType(String readOnlyReplicaType) {
                this.readOnlyReplicaType = readOnlyReplicaType;
                return this;
            }

            /**
             * <p>The replica type of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>FULL</p>
             */
            public Builder replicaType(String replicaType) {
                this.replicaType = replicaType;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder tenantZoneId(String tenantZoneId) {
                this.tenantZoneId = tenantZoneId;
                return this;
            }

            /**
             * <p>The role to access the zone. Valid values: </p>
             * <ul>
             * <li>ReadWrite: a role that has the read and write privileges. </li>
             * <li>ReadOnly: a role that has only the read-only privilege.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReadWrite</p>
             */
            public Builder tenantZoneRole(String tenantZoneRole) {
                this.tenantZoneRole = tenantZoneRole;
                return this;
            }

            /**
             * <p>The information about the resource units.</p>
             */
            public Builder units(java.util.List<Units> units) {
                this.units = units;
                return this;
            }

            public TenantZones build() {
                return new TenantZones(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class Tenants extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrimaryZoneDeployType")
        private String primaryZoneDeployType;

        @com.aliyun.core.annotation.NameInMap("TenantCpu")
        private Float tenantCpu;

        @com.aliyun.core.annotation.NameInMap("TenantDeployType")
        private String tenantDeployType;

        @com.aliyun.core.annotation.NameInMap("TenantDiskSize")
        private Float tenantDiskSize;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantMemory")
        private Float tenantMemory;

        @com.aliyun.core.annotation.NameInMap("TenantMode")
        private String tenantMode;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TenantStatus")
        private String tenantStatus;

        @com.aliyun.core.annotation.NameInMap("TenantUnitCpu")
        private Float tenantUnitCpu;

        @com.aliyun.core.annotation.NameInMap("TenantUnitMemory")
        private Float tenantUnitMemory;

        @com.aliyun.core.annotation.NameInMap("TenantUnitNum")
        private Integer tenantUnitNum;

        @com.aliyun.core.annotation.NameInMap("TenantZones")
        private java.util.List<TenantZones> tenantZones;

        private Tenants(Builder builder) {
            this.primaryZoneDeployType = builder.primaryZoneDeployType;
            this.tenantCpu = builder.tenantCpu;
            this.tenantDeployType = builder.tenantDeployType;
            this.tenantDiskSize = builder.tenantDiskSize;
            this.tenantId = builder.tenantId;
            this.tenantMemory = builder.tenantMemory;
            this.tenantMode = builder.tenantMode;
            this.tenantName = builder.tenantName;
            this.tenantStatus = builder.tenantStatus;
            this.tenantUnitCpu = builder.tenantUnitCpu;
            this.tenantUnitMemory = builder.tenantUnitMemory;
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
         * @return tenantDiskSize
         */
        public Float getTenantDiskSize() {
            return this.tenantDiskSize;
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
         * @return tenantUnitCpu
         */
        public Float getTenantUnitCpu() {
            return this.tenantUnitCpu;
        }

        /**
         * @return tenantUnitMemory
         */
        public Float getTenantUnitMemory() {
            return this.tenantUnitMemory;
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
        public java.util.List<TenantZones> getTenantZones() {
            return this.tenantZones;
        }

        public static final class Builder {
            private String primaryZoneDeployType; 
            private Float tenantCpu; 
            private String tenantDeployType; 
            private Float tenantDiskSize; 
            private String tenantId; 
            private Float tenantMemory; 
            private String tenantMode; 
            private String tenantName; 
            private String tenantStatus; 
            private Float tenantUnitCpu; 
            private Float tenantUnitMemory; 
            private Integer tenantUnitNum; 
            private java.util.List<TenantZones> tenantZones; 

            private Builder() {
            } 

            private Builder(Tenants model) {
                this.primaryZoneDeployType = model.primaryZoneDeployType;
                this.tenantCpu = model.tenantCpu;
                this.tenantDeployType = model.tenantDeployType;
                this.tenantDiskSize = model.tenantDiskSize;
                this.tenantId = model.tenantId;
                this.tenantMemory = model.tenantMemory;
                this.tenantMode = model.tenantMode;
                this.tenantName = model.tenantName;
                this.tenantStatus = model.tenantStatus;
                this.tenantUnitCpu = model.tenantUnitCpu;
                this.tenantUnitMemory = model.tenantUnitMemory;
                this.tenantUnitNum = model.tenantUnitNum;
                this.tenantZones = model.tenantZones;
            } 

            /**
             * <p>The deployment mode of the primary zone. Valid values: </p>
             * <ul>
             * <li>RANDOM. </li>
             * <li>STATIC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RANDOM</p>
             */
            public Builder primaryZoneDeployType(String primaryZoneDeployType) {
                this.primaryZoneDeployType = primaryZoneDeployType;
                return this;
            }

            /**
             * <p>The number of CPU cores of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder tenantCpu(Float tenantCpu) {
                this.tenantCpu = tenantCpu;
                return this;
            }

            /**
             * <p>The deployment type of the tenant. Valid values: </p>
             * <ul>
             * <li>multiple: multi-IDC deployment. </li>
             * <li>single: single-IDC deployment. </li>
             * <li>dual: dual-IDC deployment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>multiple</p>
             */
            public Builder tenantDeployType(String tenantDeployType) {
                this.tenantDeployType = tenantDeployType;
                return this;
            }

            /**
             * <p>The disk space of the tenant, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder tenantDiskSize(Float tenantDiskSize) {
                this.tenantDiskSize = tenantDiskSize;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>t33h8y08k****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The memory size of the tenant, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder tenantMemory(Float tenantMemory) {
                this.tenantMemory = tenantMemory;
                return this;
            }

            /**
             * <p>The mode of the tenant. Valid values: </p>
             * <ul>
             * <li>Oracle  </li>
             * <li>MySQL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Oracle</p>
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * <p>The name of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>pay_online</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>The status of the tenant. Valid values: </p>
             * <ul>
             * <li>PENDING_CREATE: The tenant is being created. </li>
             * <li>RESTORE: The tenant is being restored. </li>
             * <li>ONLINE: The tenant is running. </li>
             * <li>SPEC_MODIFYING: The specification of the tenant is being modified. </li>
             * <li>ALLOCATING_INTERNET_ADDRESS: A public IP address is being allocated to the tenant. </li>
             * <li>PENDING_OFFLINE_INTERNET_ADDRESS: The public IP address is being disabled. </li>
             * <li>PRIMARY_ZONE_MODIFYING: The tenant is being switched to a new primary zone. </li>
             * <li>PARAMETER_MODIFYING: Parameters are being modified. </li>
             * <li>WHITE_LIST_MODIFYING: The allowlist is being modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder tenantStatus(String tenantStatus) {
                this.tenantStatus = tenantStatus;
                return this;
            }

            /**
             * <p>The number of CPU cores of a single node in the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder tenantUnitCpu(Float tenantUnitCpu) {
                this.tenantUnitCpu = tenantUnitCpu;
                return this;
            }

            /**
             * <p>The memory size of a single node in the tenant, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder tenantUnitMemory(Float tenantUnitMemory) {
                this.tenantUnitMemory = tenantUnitMemory;
                return this;
            }

            /**
             * <p>The number of resource units in the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tenantUnitNum(Integer tenantUnitNum) {
                this.tenantUnitNum = tenantUnitNum;
                return this;
            }

            /**
             * <p>The information about the zones.</p>
             */
            public Builder tenantZones(java.util.List<TenantZones> tenantZones) {
                this.tenantZones = tenantZones;
                return this;
            }

            public Tenants build() {
                return new Tenants(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class NodeResourceCpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalCpu")
        private Integer totalCpu;

        @com.aliyun.core.annotation.NameInMap("UsedCpu")
        private Float usedCpu;

        private NodeResourceCpu(Builder builder) {
            this.totalCpu = builder.totalCpu;
            this.usedCpu = builder.usedCpu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeResourceCpu create() {
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

            private Builder() {
            } 

            private Builder(NodeResourceCpu model) {
                this.totalCpu = model.totalCpu;
                this.usedCpu = model.usedCpu;
            } 

            /**
             * <p>The total number of CPU cores of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder totalCpu(Integer totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * <p>The number of CPU cores used by the node.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder usedCpu(Float usedCpu) {
                this.usedCpu = usedCpu;
                return this;
            }

            public NodeResourceCpu build() {
                return new NodeResourceCpu(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class NodeResourceDiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalDiskSize")
        private Double totalDiskSize;

        @com.aliyun.core.annotation.NameInMap("UsedDiskSize")
        private Double usedDiskSize;

        private NodeResourceDiskSize(Builder builder) {
            this.totalDiskSize = builder.totalDiskSize;
            this.usedDiskSize = builder.usedDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeResourceDiskSize create() {
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

            private Builder() {
            } 

            private Builder(NodeResourceDiskSize model) {
                this.totalDiskSize = model.totalDiskSize;
                this.usedDiskSize = model.usedDiskSize;
            } 

            /**
             * <p>The total storage space of the node, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalDiskSize(Double totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * <p>The size of storage space used by the node, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder usedDiskSize(Double usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            public NodeResourceDiskSize build() {
                return new NodeResourceDiskSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class NodeResourceMemory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Long totalMemory;

        @com.aliyun.core.annotation.NameInMap("UsedMemory")
        private Float usedMemory;

        private NodeResourceMemory(Builder builder) {
            this.totalMemory = builder.totalMemory;
            this.usedMemory = builder.usedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeResourceMemory create() {
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

            private Builder() {
            } 

            private Builder(NodeResourceMemory model) {
                this.totalMemory = model.totalMemory;
                this.usedMemory = model.usedMemory;
            } 

            /**
             * <p>The total memory size of the node, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * <p>The size of memory used by the node, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedMemory(Float usedMemory) {
                this.usedMemory = usedMemory;
                return this;
            }

            public NodeResourceMemory build() {
                return new NodeResourceMemory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class NodeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private NodeResourceCpu cpu;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private NodeResourceDiskSize diskSize;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private NodeResourceMemory memory;

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
        public NodeResourceCpu getCpu() {
            return this.cpu;
        }

        /**
         * @return diskSize
         */
        public NodeResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return memory
         */
        public NodeResourceMemory getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private NodeResourceCpu cpu; 
            private NodeResourceDiskSize diskSize; 
            private NodeResourceMemory memory; 

            private Builder() {
            } 

            private Builder(NodeResource model) {
                this.cpu = model.cpu;
                this.diskSize = model.diskSize;
                this.memory = model.memory;
            } 

            /**
             * <p>The information about the CPU resources of the node.</p>
             */
            public Builder cpu(NodeResourceCpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The information about the storage resources of the node.</p>
             */
            public Builder diskSize(NodeResourceDiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The information about the memory resources of the node.</p>
             */
            public Builder memory(NodeResourceMemory memory) {
                this.memory = memory;
                return this;
            }

            public NodeResource build() {
                return new NodeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullCopyId")
        private Long fullCopyId;

        @com.aliyun.core.annotation.NameInMap("LogicalZone")
        private String logicalZone;

        @com.aliyun.core.annotation.NameInMap("NodeCopyId")
        private Long nodeCopyId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeResource")
        private NodeResource nodeResource;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private String nodeStatus;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyCopyId")
        private Long readOnlyCopyId;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyReplicaType")
        private String readOnlyReplicaType;

        @com.aliyun.core.annotation.NameInMap("ReplicaType")
        private String replicaType;

        private Nodes(Builder builder) {
            this.fullCopyId = builder.fullCopyId;
            this.logicalZone = builder.logicalZone;
            this.nodeCopyId = builder.nodeCopyId;
            this.nodeId = builder.nodeId;
            this.nodeResource = builder.nodeResource;
            this.nodeStatus = builder.nodeStatus;
            this.readOnlyCopyId = builder.readOnlyCopyId;
            this.readOnlyReplicaType = builder.readOnlyReplicaType;
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
         * @return logicalZone
         */
        public String getLogicalZone() {
            return this.logicalZone;
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
        public NodeResource getNodeResource() {
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
         * @return readOnlyReplicaType
         */
        public String getReadOnlyReplicaType() {
            return this.readOnlyReplicaType;
        }

        /**
         * @return replicaType
         */
        public String getReplicaType() {
            return this.replicaType;
        }

        public static final class Builder {
            private Long fullCopyId; 
            private String logicalZone; 
            private Long nodeCopyId; 
            private String nodeId; 
            private NodeResource nodeResource; 
            private String nodeStatus; 
            private Long readOnlyCopyId; 
            private String readOnlyReplicaType; 
            private String replicaType; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.fullCopyId = model.fullCopyId;
                this.logicalZone = model.logicalZone;
                this.nodeCopyId = model.nodeCopyId;
                this.nodeId = model.nodeId;
                this.nodeResource = model.nodeResource;
                this.nodeStatus = model.nodeStatus;
                this.readOnlyCopyId = model.readOnlyCopyId;
                this.readOnlyReplicaType = model.readOnlyReplicaType;
                this.replicaType = model.replicaType;
            } 

            /**
             * <p>The ID of the full-featured replica.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fullCopyId(Long fullCopyId) {
                this.fullCopyId = fullCopyId;
                return this;
            }

            /**
             * <p>The ID of the replica.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h-z0</p>
             */
            public Builder logicalZone(String logicalZone) {
                this.logicalZone = logicalZone;
                return this;
            }

            /**
             * <p>The ID of the replica node.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeCopyId(Long nodeCopyId) {
                this.nodeCopyId = nodeCopyId;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp16niirq4zdmgvm****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The information about node resources.</p>
             */
            public Builder nodeResource(NodeResource nodeResource) {
                this.nodeResource = nodeResource;
                return this;
            }

            /**
             * <p>The status of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>The ID of the read-only replica.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder readOnlyCopyId(Long readOnlyCopyId) {
                this.readOnlyCopyId = readOnlyCopyId;
                return this;
            }

            /**
             * <p>The type of the read-only replica.</p>
             * 
             * <strong>example:</strong>
             * <p>ROW_STORE</p>
             */
            public Builder readOnlyReplicaType(String readOnlyReplicaType) {
                this.readOnlyReplicaType = readOnlyReplicaType;
                return this;
            }

            /**
             * <p>The type of the replica. Valid values: </p>
             * <ul>
             * <li>FULL. </li>
             * <li>READONLY.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FULL</p>
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
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class ZoneResourceDiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxDiskUsedObServer")
        private java.util.List<String> maxDiskUsedObServer;

        @com.aliyun.core.annotation.NameInMap("MaxDiskUsedPercent")
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
        public java.util.List<String> getMaxDiskUsedObServer() {
            return this.maxDiskUsedObServer;
        }

        /**
         * @return maxDiskUsedPercent
         */
        public Double getMaxDiskUsedPercent() {
            return this.maxDiskUsedPercent;
        }

        public static final class Builder {
            private java.util.List<String> maxDiskUsedObServer; 
            private Double maxDiskUsedPercent; 

            private Builder() {
            } 

            private Builder(ZoneResourceDiskSize model) {
                this.maxDiskUsedObServer = model.maxDiskUsedObServer;
                this.maxDiskUsedPercent = model.maxDiskUsedPercent;
            } 

            /**
             * <p>The IDs of OBServer nodes that use the maximum disk space.</p>
             */
            public Builder maxDiskUsedObServer(java.util.List<String> maxDiskUsedObServer) {
                this.maxDiskUsedObServer = maxDiskUsedObServer;
                return this;
            }

            /**
             * <p>The maximum disk usage, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.14</p>
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
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class ZoneResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskSize")
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

            private Builder() {
            } 

            private Builder(ZoneResource model) {
                this.diskSize = model.diskSize;
            } 

            /**
             * <p>The information about the storage resources of the node.</p>
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
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ZoneDisk")
        private String zoneDisk;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneResource")
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
        public java.util.List<Nodes> getNodes() {
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
            private java.util.List<Nodes> nodes; 
            private String region; 
            private String zoneDisk; 
            private String zoneId; 
            private ZoneResource zoneResource; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.nodes = model.nodes;
                this.region = model.region;
                this.zoneDisk = model.zoneDisk;
                this.zoneId = model.zoneId;
                this.zoneResource = model.zoneResource;
            } 

            /**
             * <p>The information about the nodes.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The storage capacity of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>200 GB</p>
             */
            public Builder zoneDisk(String zoneDisk) {
                this.zoneDisk = zoneDisk;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The information about zones.</p>
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
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class InstanceTopology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Replicas")
        private java.util.List<Replicas> replicas;

        @com.aliyun.core.annotation.NameInMap("Tenants")
        private java.util.List<Tenants> tenants;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<Zones> zones;

        private InstanceTopology(Builder builder) {
            this.replicas = builder.replicas;
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
         * @return replicas
         */
        public java.util.List<Replicas> getReplicas() {
            return this.replicas;
        }

        /**
         * @return tenants
         */
        public java.util.List<Tenants> getTenants() {
            return this.tenants;
        }

        /**
         * @return zones
         */
        public java.util.List<Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private java.util.List<Replicas> replicas; 
            private java.util.List<Tenants> tenants; 
            private java.util.List<Zones> zones; 

            private Builder() {
            } 

            private Builder(InstanceTopology model) {
                this.replicas = model.replicas;
                this.tenants = model.tenants;
                this.zones = model.zones;
            } 

            /**
             * <p>The information about replicas.</p>
             */
            public Builder replicas(java.util.List<Replicas> replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>The information about the tenants.</p>
             */
            public Builder tenants(java.util.List<Tenants> tenants) {
                this.tenants = tenants;
                return this;
            }

            /**
             * <p>The information about the zones in which the cluster is deployed.</p>
             */
            public Builder zones(java.util.List<Zones> zones) {
                this.zones = zones;
                return this;
            }

            public InstanceTopology build() {
                return new InstanceTopology(this);
            } 

        } 

    }
}
