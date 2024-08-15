// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantResponseBody</p>
 */
public class DescribeTenantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tenant")
    private Tenant tenant;

    private DescribeTenantResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenant = builder.tenant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenant
     */
    public Tenant getTenant() {
        return this.tenant;
    }

    public static final class Builder {
        private String requestId; 
        private Tenant tenant; 

        /**
         * The zone information of the tenant.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the zone.
         */
        public Builder tenant(Tenant tenant) {
            this.tenant = tenant;
            return this;
        }

        public DescribeTenantResponseBody build() {
            return new DescribeTenantResponseBody(this);
        } 

    } 

    public static class CapacityUnit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCapacityUnit")
        private Integer maxCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("MinCapacityUnit")
        private Integer minCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("UsedCapacit")
        private Integer usedCapacit;

        private CapacityUnit(Builder builder) {
            this.maxCapacityUnit = builder.maxCapacityUnit;
            this.minCapacityUnit = builder.minCapacityUnit;
            this.usedCapacit = builder.usedCapacit;
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
         * @return usedCapacit
         */
        public Integer getUsedCapacit() {
            return this.usedCapacit;
        }

        public static final class Builder {
            private Integer maxCapacityUnit; 
            private Integer minCapacityUnit; 
            private Integer usedCapacit; 

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
             * UsedCapacit.
             */
            public Builder usedCapacit(Integer usedCapacit) {
                this.usedCapacit = usedCapacit;
                return this;
            }

            public CapacityUnit build() {
                return new CapacityUnit(this);
            } 

        } 

    }
    public static class Cpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalCpu")
        private Float totalCpu;

        @com.aliyun.core.annotation.NameInMap("UnitCpu")
        private Float unitCpu;

        @com.aliyun.core.annotation.NameInMap("UsedCpu")
        private Float usedCpu;

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
        public Float getTotalCpu() {
            return this.totalCpu;
        }

        /**
         * @return unitCpu
         */
        public Float getUnitCpu() {
            return this.unitCpu;
        }

        /**
         * @return usedCpu
         */
        public Float getUsedCpu() {
            return this.usedCpu;
        }

        public static final class Builder {
            private Float totalCpu; 
            private Float unitCpu; 
            private Float usedCpu; 

            /**
             * TotalCpu.
             */
            public Builder totalCpu(Float totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * UnitCpu.
             */
            public Builder unitCpu(Float unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * UsedCpu.
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
        @com.aliyun.core.annotation.NameInMap("UsedDiskSize")
        private Float usedDiskSize;

        private DiskSize(Builder builder) {
            this.usedDiskSize = builder.usedDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskSize create() {
            return builder().build();
        }

        /**
         * @return usedDiskSize
         */
        public Float getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public static final class Builder {
            private Float usedDiskSize; 

            /**
             * UsedDiskSize.
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
    public static class LogDiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalLogDisk")
        private Integer totalLogDisk;

        @com.aliyun.core.annotation.NameInMap("UnitLogDisk")
        private Integer unitLogDisk;

        private LogDiskSize(Builder builder) {
            this.totalLogDisk = builder.totalLogDisk;
            this.unitLogDisk = builder.unitLogDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogDiskSize create() {
            return builder().build();
        }

        /**
         * @return totalLogDisk
         */
        public Integer getTotalLogDisk() {
            return this.totalLogDisk;
        }

        /**
         * @return unitLogDisk
         */
        public Integer getUnitLogDisk() {
            return this.unitLogDisk;
        }

        public static final class Builder {
            private Integer totalLogDisk; 
            private Integer unitLogDisk; 

            /**
             * TotalLogDisk.
             */
            public Builder totalLogDisk(Integer totalLogDisk) {
                this.totalLogDisk = totalLogDisk;
                return this;
            }

            /**
             * UnitLogDisk.
             */
            public Builder unitLogDisk(Integer unitLogDisk) {
                this.unitLogDisk = unitLogDisk;
                return this;
            }

            public LogDiskSize build() {
                return new LogDiskSize(this);
            } 

        } 

    }
    public static class Memory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Float totalMemory;

        @com.aliyun.core.annotation.NameInMap("UnitMemory")
        private Float unitMemory;

        @com.aliyun.core.annotation.NameInMap("UsedMemory")
        private Float usedMemory;

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
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        /**
         * @return unitMemory
         */
        public Float getUnitMemory() {
            return this.unitMemory;
        }

        /**
         * @return usedMemory
         */
        public Float getUsedMemory() {
            return this.usedMemory;
        }

        public static final class Builder {
            private Float totalMemory; 
            private Float unitMemory; 
            private Float usedMemory; 

            /**
             * TotalMemory.
             */
            public Builder totalMemory(Float totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * UnitMemory.
             */
            public Builder unitMemory(Float unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * UsedMemory.
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
    public static class ReadOnlyResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private CapacityUnit capacityUnit;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Cpu cpu;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private DiskSize diskSize;

        @com.aliyun.core.annotation.NameInMap("LogDiskSize")
        private LogDiskSize logDiskSize;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Memory memory;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
        private Integer unitNum;

        private ReadOnlyResource(Builder builder) {
            this.capacityUnit = builder.capacityUnit;
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.logDiskSize = builder.logDiskSize;
            this.memory = builder.memory;
            this.unitNum = builder.unitNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyResource create() {
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
         * @return unitNum
         */
        public Integer getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private CapacityUnit capacityUnit; 
            private Cpu cpu; 
            private DiskSize diskSize; 
            private LogDiskSize logDiskSize; 
            private Memory memory; 
            private Integer unitNum; 

            /**
             * CapacityUnit.
             */
            public Builder capacityUnit(CapacityUnit capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * LogDiskSize.
             */
            public Builder logDiskSize(LogDiskSize logDiskSize) {
                this.logDiskSize = logDiskSize;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * UnitNum.
             */
            public Builder unitNum(Integer unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            public ReadOnlyResource build() {
                return new ReadOnlyResource(this);
            } 

        } 

    }
    public static class TenantConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("ConnectionLogicalZones")
        private java.util.List < String > connectionLogicalZones;

        @com.aliyun.core.annotation.NameInMap("ConnectionReplicaType")
        private String connectionReplicaType;

        @com.aliyun.core.annotation.NameInMap("ConnectionZones")
        private java.util.List < String > connectionZones;

        @com.aliyun.core.annotation.NameInMap("EnableTransactionSplit")
        private Boolean enableTransactionSplit;

        @com.aliyun.core.annotation.NameInMap("InternetAddress")
        private String internetAddress;

        @com.aliyun.core.annotation.NameInMap("InternetAddressStatus")
        private String internetAddressStatus;

        @com.aliyun.core.annotation.NameInMap("InternetMaxConnectionLimit")
        private Long internetMaxConnectionLimit;

        @com.aliyun.core.annotation.NameInMap("InternetMaxConnectionNum")
        private Long internetMaxConnectionNum;

        @com.aliyun.core.annotation.NameInMap("InternetPort")
        private Integer internetPort;

        @com.aliyun.core.annotation.NameInMap("InternetRpcPort")
        private Integer internetRpcPort;

        @com.aliyun.core.annotation.NameInMap("IntranetAddress")
        private String intranetAddress;

        @com.aliyun.core.annotation.NameInMap("IntranetAddressMasterZoneId")
        private String intranetAddressMasterZoneId;

        @com.aliyun.core.annotation.NameInMap("IntranetAddressSlaveZoneId")
        private String intranetAddressSlaveZoneId;

        @com.aliyun.core.annotation.NameInMap("IntranetAddressStatus")
        private String intranetAddressStatus;

        @com.aliyun.core.annotation.NameInMap("IntranetPort")
        private Integer intranetPort;

        @com.aliyun.core.annotation.NameInMap("IntranetRpcPort")
        private Integer intranetRpcPort;

        @com.aliyun.core.annotation.NameInMap("IntranetSqlPort")
        private Integer intranetSqlPort;

        @com.aliyun.core.annotation.NameInMap("MaxConnectionLimit")
        private Long maxConnectionLimit;

        @com.aliyun.core.annotation.NameInMap("MaxConnectionNum")
        private Long maxConnectionNum;

        @com.aliyun.core.annotation.NameInMap("OdpVersion")
        private String odpVersion;

        @com.aliyun.core.annotation.NameInMap("ParallelQueryDegree")
        private Long parallelQueryDegree;

        @com.aliyun.core.annotation.NameInMap("ProxyClusterId")
        private String proxyClusterId;

        @com.aliyun.core.annotation.NameInMap("TenantEndpointId")
        private String tenantEndpointId;

        @com.aliyun.core.annotation.NameInMap("TransactionSplit")
        private Boolean transactionSplit;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private TenantConnections(Builder builder) {
            this.addressType = builder.addressType;
            this.connectionLogicalZones = builder.connectionLogicalZones;
            this.connectionReplicaType = builder.connectionReplicaType;
            this.connectionZones = builder.connectionZones;
            this.enableTransactionSplit = builder.enableTransactionSplit;
            this.internetAddress = builder.internetAddress;
            this.internetAddressStatus = builder.internetAddressStatus;
            this.internetMaxConnectionLimit = builder.internetMaxConnectionLimit;
            this.internetMaxConnectionNum = builder.internetMaxConnectionNum;
            this.internetPort = builder.internetPort;
            this.internetRpcPort = builder.internetRpcPort;
            this.intranetAddress = builder.intranetAddress;
            this.intranetAddressMasterZoneId = builder.intranetAddressMasterZoneId;
            this.intranetAddressSlaveZoneId = builder.intranetAddressSlaveZoneId;
            this.intranetAddressStatus = builder.intranetAddressStatus;
            this.intranetPort = builder.intranetPort;
            this.intranetRpcPort = builder.intranetRpcPort;
            this.intranetSqlPort = builder.intranetSqlPort;
            this.maxConnectionLimit = builder.maxConnectionLimit;
            this.maxConnectionNum = builder.maxConnectionNum;
            this.odpVersion = builder.odpVersion;
            this.parallelQueryDegree = builder.parallelQueryDegree;
            this.proxyClusterId = builder.proxyClusterId;
            this.tenantEndpointId = builder.tenantEndpointId;
            this.transactionSplit = builder.transactionSplit;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantConnections create() {
            return builder().build();
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return connectionLogicalZones
         */
        public java.util.List < String > getConnectionLogicalZones() {
            return this.connectionLogicalZones;
        }

        /**
         * @return connectionReplicaType
         */
        public String getConnectionReplicaType() {
            return this.connectionReplicaType;
        }

        /**
         * @return connectionZones
         */
        public java.util.List < String > getConnectionZones() {
            return this.connectionZones;
        }

        /**
         * @return enableTransactionSplit
         */
        public Boolean getEnableTransactionSplit() {
            return this.enableTransactionSplit;
        }

        /**
         * @return internetAddress
         */
        public String getInternetAddress() {
            return this.internetAddress;
        }

        /**
         * @return internetAddressStatus
         */
        public String getInternetAddressStatus() {
            return this.internetAddressStatus;
        }

        /**
         * @return internetMaxConnectionLimit
         */
        public Long getInternetMaxConnectionLimit() {
            return this.internetMaxConnectionLimit;
        }

        /**
         * @return internetMaxConnectionNum
         */
        public Long getInternetMaxConnectionNum() {
            return this.internetMaxConnectionNum;
        }

        /**
         * @return internetPort
         */
        public Integer getInternetPort() {
            return this.internetPort;
        }

        /**
         * @return internetRpcPort
         */
        public Integer getInternetRpcPort() {
            return this.internetRpcPort;
        }

        /**
         * @return intranetAddress
         */
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        /**
         * @return intranetAddressMasterZoneId
         */
        public String getIntranetAddressMasterZoneId() {
            return this.intranetAddressMasterZoneId;
        }

        /**
         * @return intranetAddressSlaveZoneId
         */
        public String getIntranetAddressSlaveZoneId() {
            return this.intranetAddressSlaveZoneId;
        }

        /**
         * @return intranetAddressStatus
         */
        public String getIntranetAddressStatus() {
            return this.intranetAddressStatus;
        }

        /**
         * @return intranetPort
         */
        public Integer getIntranetPort() {
            return this.intranetPort;
        }

        /**
         * @return intranetRpcPort
         */
        public Integer getIntranetRpcPort() {
            return this.intranetRpcPort;
        }

        /**
         * @return intranetSqlPort
         */
        public Integer getIntranetSqlPort() {
            return this.intranetSqlPort;
        }

        /**
         * @return maxConnectionLimit
         */
        public Long getMaxConnectionLimit() {
            return this.maxConnectionLimit;
        }

        /**
         * @return maxConnectionNum
         */
        public Long getMaxConnectionNum() {
            return this.maxConnectionNum;
        }

        /**
         * @return odpVersion
         */
        public String getOdpVersion() {
            return this.odpVersion;
        }

        /**
         * @return parallelQueryDegree
         */
        public Long getParallelQueryDegree() {
            return this.parallelQueryDegree;
        }

        /**
         * @return proxyClusterId
         */
        public String getProxyClusterId() {
            return this.proxyClusterId;
        }

        /**
         * @return tenantEndpointId
         */
        public String getTenantEndpointId() {
            return this.tenantEndpointId;
        }

        /**
         * @return transactionSplit
         */
        public Boolean getTransactionSplit() {
            return this.transactionSplit;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String addressType; 
            private java.util.List < String > connectionLogicalZones; 
            private String connectionReplicaType; 
            private java.util.List < String > connectionZones; 
            private Boolean enableTransactionSplit; 
            private String internetAddress; 
            private String internetAddressStatus; 
            private Long internetMaxConnectionLimit; 
            private Long internetMaxConnectionNum; 
            private Integer internetPort; 
            private Integer internetRpcPort; 
            private String intranetAddress; 
            private String intranetAddressMasterZoneId; 
            private String intranetAddressSlaveZoneId; 
            private String intranetAddressStatus; 
            private Integer intranetPort; 
            private Integer intranetRpcPort; 
            private Integer intranetSqlPort; 
            private Long maxConnectionLimit; 
            private Long maxConnectionNum; 
            private String odpVersion; 
            private Long parallelQueryDegree; 
            private String proxyClusterId; 
            private String tenantEndpointId; 
            private Boolean transactionSplit; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The primary zone of the tenant.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * ConnectionLogicalZones.
             */
            public Builder connectionLogicalZones(java.util.List < String > connectionLogicalZones) {
                this.connectionLogicalZones = connectionLogicalZones;
                return this;
            }

            /**
             * ConnectionReplicaType.
             */
            public Builder connectionReplicaType(String connectionReplicaType) {
                this.connectionReplicaType = connectionReplicaType;
                return this;
            }

            /**
             * The Internet address for accessing the tenant.
             */
            public Builder connectionZones(java.util.List < String > connectionZones) {
                this.connectionZones = connectionZones;
                return this;
            }

            /**
             * EnableTransactionSplit.
             */
            public Builder enableTransactionSplit(Boolean enableTransactionSplit) {
                this.enableTransactionSplit = enableTransactionSplit;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder internetAddress(String internetAddress) {
                this.internetAddress = internetAddress;
                return this;
            }

            /**
             * 实例系列
             */
            public Builder internetAddressStatus(String internetAddressStatus) {
                this.internetAddressStatus = internetAddressStatus;
                return this;
            }

            /**
             * InternetMaxConnectionLimit.
             */
            public Builder internetMaxConnectionLimit(Long internetMaxConnectionLimit) {
                this.internetMaxConnectionLimit = internetMaxConnectionLimit;
                return this;
            }

            /**
             * InternetMaxConnectionNum.
             */
            public Builder internetMaxConnectionNum(Long internetMaxConnectionNum) {
                this.internetMaxConnectionNum = internetMaxConnectionNum;
                return this;
            }

            /**
             * 实例类型
             */
            public Builder internetPort(Integer internetPort) {
                this.internetPort = internetPort;
                return this;
            }

            /**
             * InternetRpcPort.
             */
            public Builder internetRpcPort(Integer internetRpcPort) {
                this.internetRpcPort = internetRpcPort;
                return this;
            }

            /**
             * The deployment type of the cluster. Valid values:  
             * <p>
             * - multiple: multi-IDC deployment   
             * - single: single-IDC deployment   
             * - dual: dual-IDC deployment
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * PayCore business database
             */
            public Builder intranetAddressMasterZoneId(String intranetAddressMasterZoneId) {
                this.intranetAddressMasterZoneId = intranetAddressMasterZoneId;
                return this;
            }

            /**
             * The total number of CPU cores of the tenant.
             */
            public Builder intranetAddressSlaveZoneId(String intranetAddressSlaveZoneId) {
                this.intranetAddressSlaveZoneId = intranetAddressSlaveZoneId;
                return this;
            }

            /**
             * 付费类型
             */
            public Builder intranetAddressStatus(String intranetAddressStatus) {
                this.intranetAddressStatus = intranetAddressStatus;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder intranetPort(Integer intranetPort) {
                this.intranetPort = intranetPort;
                return this;
            }

            /**
             * IntranetRpcPort.
             */
            public Builder intranetRpcPort(Integer intranetRpcPort) {
                this.intranetRpcPort = intranetRpcPort;
                return this;
            }

            /**
             * IntranetSqlPort.
             */
            public Builder intranetSqlPort(Integer intranetSqlPort) {
                this.intranetSqlPort = intranetSqlPort;
                return this;
            }

            /**
             * MaxConnectionLimit.
             */
            public Builder maxConnectionLimit(Long maxConnectionLimit) {
                this.maxConnectionLimit = maxConnectionLimit;
                return this;
            }

            /**
             * MaxConnectionNum.
             */
            public Builder maxConnectionNum(Long maxConnectionNum) {
                this.maxConnectionNum = maxConnectionNum;
                return this;
            }

            /**
             * OdpVersion.
             */
            public Builder odpVersion(String odpVersion) {
                this.odpVersion = odpVersion;
                return this;
            }

            /**
             * ParallelQueryDegree.
             */
            public Builder parallelQueryDegree(Long parallelQueryDegree) {
                this.parallelQueryDegree = parallelQueryDegree;
                return this;
            }

            /**
             * ProxyClusterId.
             */
            public Builder proxyClusterId(String proxyClusterId) {
                this.proxyClusterId = proxyClusterId;
                return this;
            }

            /**
             * TenantEndpointId.
             */
            public Builder tenantEndpointId(String tenantEndpointId) {
                this.tenantEndpointId = tenantEndpointId;
                return this;
            }

            /**
             * The primary zone corresponding to the address for accessing the tenant.
             */
            public Builder transactionSplit(Boolean transactionSplit) {
                this.transactionSplit = transactionSplit;
                return this;
            }

            /**
             * The connection access information of the tenant.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The service mode of the connection address. Valid values:  
             * <p>
             * ReadWrite: provides strong-consistency read and write services.   
             * ReadOnly: provides the read-only service to ensure ultimate consistency of data.   
             * Clog: provides transaction log services.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public TenantConnections build() {
                return new TenantConnections(this);
            } 

        } 

    }
    public static class TenantResourceCapacityUnit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCapacityUnit")
        private Integer maxCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("MinCapacityUnit")
        private Integer minCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("UsedCapacit")
        private Integer usedCapacit;

        private TenantResourceCapacityUnit(Builder builder) {
            this.maxCapacityUnit = builder.maxCapacityUnit;
            this.minCapacityUnit = builder.minCapacityUnit;
            this.usedCapacit = builder.usedCapacit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantResourceCapacityUnit create() {
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
         * @return usedCapacit
         */
        public Integer getUsedCapacit() {
            return this.usedCapacit;
        }

        public static final class Builder {
            private Integer maxCapacityUnit; 
            private Integer minCapacityUnit; 
            private Integer usedCapacit; 

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
             * UsedCapacit.
             */
            public Builder usedCapacit(Integer usedCapacit) {
                this.usedCapacit = usedCapacit;
                return this;
            }

            public TenantResourceCapacityUnit build() {
                return new TenantResourceCapacityUnit(this);
            } 

        } 

    }
    public static class TenantResourceCpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalCpu")
        private Float totalCpu;

        @com.aliyun.core.annotation.NameInMap("UnitCpu")
        private Float unitCpu;

        @com.aliyun.core.annotation.NameInMap("UsedCpu")
        private Float usedCpu;

        private TenantResourceCpu(Builder builder) {
            this.totalCpu = builder.totalCpu;
            this.unitCpu = builder.unitCpu;
            this.usedCpu = builder.usedCpu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantResourceCpu create() {
            return builder().build();
        }

        /**
         * @return totalCpu
         */
        public Float getTotalCpu() {
            return this.totalCpu;
        }

        /**
         * @return unitCpu
         */
        public Float getUnitCpu() {
            return this.unitCpu;
        }

        /**
         * @return usedCpu
         */
        public Float getUsedCpu() {
            return this.usedCpu;
        }

        public static final class Builder {
            private Float totalCpu; 
            private Float unitCpu; 
            private Float usedCpu; 

            /**
             * The data replica distribution mode of the tenant.    
             * <p>
             * 
             * - For the high availability version, N-N-N indicates the three-zone mode, and N-N indicates the dual-zone or single-zone mode.
             * - For the basic version, N indicates the single-zone mode. 
             * 
             * > <br>N represents the number of nodes in a single zone.
             */
            public Builder totalCpu(Float totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * The zone corresponding to the tenant connection.
             */
            public Builder unitCpu(Float unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * The tenant mode.   
             * <p>
             * Valid values: 
             * Oracle   
             * MySQL
             */
            public Builder usedCpu(Float usedCpu) {
                this.usedCpu = usedCpu;
                return this;
            }

            public TenantResourceCpu build() {
                return new TenantResourceCpu(this);
            } 

        } 

    }
    public static class TenantResourceDiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsedDiskSize")
        private Float usedDiskSize;

        private TenantResourceDiskSize(Builder builder) {
            this.usedDiskSize = builder.usedDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantResourceDiskSize create() {
            return builder().build();
        }

        /**
         * @return usedDiskSize
         */
        public Float getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public static final class Builder {
            private Float usedDiskSize; 

            /**
             * The total memory size of the tenant, in GB.
             */
            public Builder usedDiskSize(Float usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            public TenantResourceDiskSize build() {
                return new TenantResourceDiskSize(this);
            } 

        } 

    }
    public static class TenantResourceLogDiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalLogDisk")
        private Integer totalLogDisk;

        @com.aliyun.core.annotation.NameInMap("UnitLogDisk")
        private Integer unitLogDisk;

        private TenantResourceLogDiskSize(Builder builder) {
            this.totalLogDisk = builder.totalLogDisk;
            this.unitLogDisk = builder.unitLogDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantResourceLogDiskSize create() {
            return builder().build();
        }

        /**
         * @return totalLogDisk
         */
        public Integer getTotalLogDisk() {
            return this.totalLogDisk;
        }

        /**
         * @return unitLogDisk
         */
        public Integer getUnitLogDisk() {
            return this.unitLogDisk;
        }

        public static final class Builder {
            private Integer totalLogDisk; 
            private Integer unitLogDisk; 

            /**
             * TotalLogDisk.
             */
            public Builder totalLogDisk(Integer totalLogDisk) {
                this.totalLogDisk = totalLogDisk;
                return this;
            }

            /**
             * UnitLogDisk.
             */
            public Builder unitLogDisk(Integer unitLogDisk) {
                this.unitLogDisk = unitLogDisk;
                return this;
            }

            public TenantResourceLogDiskSize build() {
                return new TenantResourceLogDiskSize(this);
            } 

        } 

    }
    public static class TenantResourceMemory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Float totalMemory;

        @com.aliyun.core.annotation.NameInMap("UnitMemory")
        private Float unitMemory;

        @com.aliyun.core.annotation.NameInMap("UsedMemory")
        private Float usedMemory;

        private TenantResourceMemory(Builder builder) {
            this.totalMemory = builder.totalMemory;
            this.unitMemory = builder.unitMemory;
            this.usedMemory = builder.usedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantResourceMemory create() {
            return builder().build();
        }

        /**
         * @return totalMemory
         */
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        /**
         * @return unitMemory
         */
        public Float getUnitMemory() {
            return this.unitMemory;
        }

        /**
         * @return usedMemory
         */
        public Float getUsedMemory() {
            return this.usedMemory;
        }

        public static final class Builder {
            private Float totalMemory; 
            private Float unitMemory; 
            private Float usedMemory; 

            /**
             * The information about the memory resources of the tenant.
             */
            public Builder totalMemory(Float totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * The time when the tenant was created.
             */
            public Builder unitMemory(Float unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * The status of the Internet address for accessing the tenant. Valid values:   
             * <p>
             * Closed: The address is disabled.   
             * - ALLOCATING_INTERNET_ADDRESS: An address is being applied for.   
             * - PENDING_OFFLINE_INTERNET_ADDRESS: The address is being disabled.   
             * - ONLINE: The address is in service.
             */
            public Builder usedMemory(Float usedMemory) {
                this.usedMemory = usedMemory;
                return this;
            }

            public TenantResourceMemory build() {
                return new TenantResourceMemory(this);
            } 

        } 

    }
    public static class TenantResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private TenantResourceCapacityUnit capacityUnit;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private TenantResourceCpu cpu;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private TenantResourceDiskSize diskSize;

        @com.aliyun.core.annotation.NameInMap("LogDiskSize")
        private TenantResourceLogDiskSize logDiskSize;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private TenantResourceMemory memory;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
        private Integer unitNum;

        private TenantResource(Builder builder) {
            this.capacityUnit = builder.capacityUnit;
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.logDiskSize = builder.logDiskSize;
            this.memory = builder.memory;
            this.unitNum = builder.unitNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantResource create() {
            return builder().build();
        }

        /**
         * @return capacityUnit
         */
        public TenantResourceCapacityUnit getCapacityUnit() {
            return this.capacityUnit;
        }

        /**
         * @return cpu
         */
        public TenantResourceCpu getCpu() {
            return this.cpu;
        }

        /**
         * @return diskSize
         */
        public TenantResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return logDiskSize
         */
        public TenantResourceLogDiskSize getLogDiskSize() {
            return this.logDiskSize;
        }

        /**
         * @return memory
         */
        public TenantResourceMemory getMemory() {
            return this.memory;
        }

        /**
         * @return unitNum
         */
        public Integer getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private TenantResourceCapacityUnit capacityUnit; 
            private TenantResourceCpu cpu; 
            private TenantResourceDiskSize diskSize; 
            private TenantResourceLogDiskSize logDiskSize; 
            private TenantResourceMemory memory; 
            private Integer unitNum; 

            /**
             * CapacityUnit.
             */
            public Builder capacityUnit(TenantResourceCapacityUnit capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * The enabling status of the Clog service.  
             * <p>
             * CLOSED: The Clog service is disabled.  
             * - ONLINE: The Clog service is running.
             */
            public Builder cpu(TenantResourceCpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The status of the intranet address for accessing the tenant.  
             * <p>
             * The value ONLINE indicates that the address is in service.
             */
            public Builder diskSize(TenantResourceDiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * LogDiskSize.
             */
            public Builder logDiskSize(TenantResourceLogDiskSize logDiskSize) {
                this.logDiskSize = logDiskSize;
                return this;
            }

            /**
             * The description of the tenant.
             */
            public Builder memory(TenantResourceMemory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Alibaba Cloud CLI
             */
            public Builder unitNum(Integer unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            public TenantResource build() {
                return new TenantResource(this);
            } 

        } 

    }
    public static class TenantZoneReplicas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullCopyId")
        private Integer fullCopyId;

        @com.aliyun.core.annotation.NameInMap("LogicZoneName")
        private String logicZoneName;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyCopyId")
        private String readOnlyCopyId;

        @com.aliyun.core.annotation.NameInMap("ZoneCopyId")
        private Integer zoneCopyId;

        @com.aliyun.core.annotation.NameInMap("ZoneNodes")
        private String zoneNodes;

        @com.aliyun.core.annotation.NameInMap("ZoneReplicaType")
        private String zoneReplicaType;

        private TenantZoneReplicas(Builder builder) {
            this.fullCopyId = builder.fullCopyId;
            this.logicZoneName = builder.logicZoneName;
            this.readOnlyCopyId = builder.readOnlyCopyId;
            this.zoneCopyId = builder.zoneCopyId;
            this.zoneNodes = builder.zoneNodes;
            this.zoneReplicaType = builder.zoneReplicaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantZoneReplicas create() {
            return builder().build();
        }

        /**
         * @return fullCopyId
         */
        public Integer getFullCopyId() {
            return this.fullCopyId;
        }

        /**
         * @return logicZoneName
         */
        public String getLogicZoneName() {
            return this.logicZoneName;
        }

        /**
         * @return readOnlyCopyId
         */
        public String getReadOnlyCopyId() {
            return this.readOnlyCopyId;
        }

        /**
         * @return zoneCopyId
         */
        public Integer getZoneCopyId() {
            return this.zoneCopyId;
        }

        /**
         * @return zoneNodes
         */
        public String getZoneNodes() {
            return this.zoneNodes;
        }

        /**
         * @return zoneReplicaType
         */
        public String getZoneReplicaType() {
            return this.zoneReplicaType;
        }

        public static final class Builder {
            private Integer fullCopyId; 
            private String logicZoneName; 
            private String readOnlyCopyId; 
            private Integer zoneCopyId; 
            private String zoneNodes; 
            private String zoneReplicaType; 

            /**
             * FullCopyId.
             */
            public Builder fullCopyId(Integer fullCopyId) {
                this.fullCopyId = fullCopyId;
                return this;
            }

            /**
             * LogicZoneName.
             */
            public Builder logicZoneName(String logicZoneName) {
                this.logicZoneName = logicZoneName;
                return this;
            }

            /**
             * ReadOnlyCopyId.
             */
            public Builder readOnlyCopyId(String readOnlyCopyId) {
                this.readOnlyCopyId = readOnlyCopyId;
                return this;
            }

            /**
             * ZoneCopyId.
             */
            public Builder zoneCopyId(Integer zoneCopyId) {
                this.zoneCopyId = zoneCopyId;
                return this;
            }

            /**
             * ZoneNodes.
             */
            public Builder zoneNodes(String zoneNodes) {
                this.zoneNodes = zoneNodes;
                return this;
            }

            /**
             * ZoneReplicaType.
             */
            public Builder zoneReplicaType(String zoneReplicaType) {
                this.zoneReplicaType = zoneReplicaType;
                return this;
            }

            public TenantZoneReplicas build() {
                return new TenantZoneReplicas(this);
            } 

        } 

    }
    public static class TenantZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("TenantZoneId")
        private String tenantZoneId;

        @com.aliyun.core.annotation.NameInMap("TenantZoneReplicas")
        private java.util.List < TenantZoneReplicas> tenantZoneReplicas;

        @com.aliyun.core.annotation.NameInMap("TenantZoneRole")
        private String tenantZoneRole;

        private TenantZones(Builder builder) {
            this.region = builder.region;
            this.tenantZoneId = builder.tenantZoneId;
            this.tenantZoneReplicas = builder.tenantZoneReplicas;
            this.tenantZoneRole = builder.tenantZoneRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantZones create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return tenantZoneId
         */
        public String getTenantZoneId() {
            return this.tenantZoneId;
        }

        /**
         * @return tenantZoneReplicas
         */
        public java.util.List < TenantZoneReplicas> getTenantZoneReplicas() {
            return this.tenantZoneReplicas;
        }

        /**
         * @return tenantZoneRole
         */
        public String getTenantZoneRole() {
            return this.tenantZoneRole;
        }

        public static final class Builder {
            private String region; 
            private String tenantZoneId; 
            private java.util.List < TenantZoneReplicas> tenantZoneReplicas; 
            private String tenantZoneRole; 

            /**
             * 是否允许开启读写分离地址
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The intranet port for accessing the tenant.
             */
            public Builder tenantZoneId(String tenantZoneId) {
                this.tenantZoneId = tenantZoneId;
                return this;
            }

            /**
             * TenantZoneReplicas.
             */
            public Builder tenantZoneReplicas(java.util.List < TenantZoneReplicas> tenantZoneReplicas) {
                this.tenantZoneReplicas = tenantZoneReplicas;
                return this;
            }

            /**
             * The character set.
             */
            public Builder tenantZoneRole(String tenantZoneRole) {
                this.tenantZoneRole = tenantZoneRole;
                return this;
            }

            public TenantZones build() {
                return new TenantZones(this);
            } 

        } 

    }
    public static class Tenant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableZones")
        private java.util.List < String > availableZones;

        @com.aliyun.core.annotation.NameInMap("Charset")
        private String charset;

        @com.aliyun.core.annotation.NameInMap("ClogServiceStatus")
        private String clogServiceStatus;

        @com.aliyun.core.annotation.NameInMap("Collation")
        private String collation;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataMergeTime")
        private String dataMergeTime;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("EnableBinlogService")
        private Boolean enableBinlogService;

        @com.aliyun.core.annotation.NameInMap("EnableClogService")
        private Boolean enableClogService;

        @com.aliyun.core.annotation.NameInMap("EnableInternetAddressService")
        private Boolean enableInternetAddressService;

        @com.aliyun.core.annotation.NameInMap("EnableParallelQuery")
        private Boolean enableParallelQuery;

        @com.aliyun.core.annotation.NameInMap("EnableReadOnlyReplica")
        private Boolean enableReadOnlyReplica;

        @com.aliyun.core.annotation.NameInMap("EnableReadWriteSplit")
        private Boolean enableReadWriteSplit;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("LowerCaseTableNames")
        private Integer lowerCaseTableNames;

        @com.aliyun.core.annotation.NameInMap("MasterIntranetAddressZone")
        private String masterIntranetAddressZone;

        @com.aliyun.core.annotation.NameInMap("MaxParallelQueryDegree")
        private Long maxParallelQueryDegree;

        @com.aliyun.core.annotation.NameInMap("OdpVersion")
        private String odpVersion;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PrimaryZone")
        private String primaryZone;

        @com.aliyun.core.annotation.NameInMap("PrimaryZoneDeployType")
        private String primaryZoneDeployType;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyResource")
        private ReadOnlyResource readOnlyResource;

        @com.aliyun.core.annotation.NameInMap("RecycleBinStatus")
        private String recycleBinStatus;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantConnections")
        private java.util.List < TenantConnections> tenantConnections;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantMode")
        private String tenantMode;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TenantResource")
        private TenantResource tenantResource;

        @com.aliyun.core.annotation.NameInMap("TenantZones")
        private java.util.List < TenantZones> tenantZones;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Tenant(Builder builder) {
            this.availableZones = builder.availableZones;
            this.charset = builder.charset;
            this.clogServiceStatus = builder.clogServiceStatus;
            this.collation = builder.collation;
            this.createTime = builder.createTime;
            this.dataMergeTime = builder.dataMergeTime;
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.diskType = builder.diskType;
            this.enableBinlogService = builder.enableBinlogService;
            this.enableClogService = builder.enableClogService;
            this.enableInternetAddressService = builder.enableInternetAddressService;
            this.enableParallelQuery = builder.enableParallelQuery;
            this.enableReadOnlyReplica = builder.enableReadOnlyReplica;
            this.enableReadWriteSplit = builder.enableReadWriteSplit;
            this.instanceType = builder.instanceType;
            this.lowerCaseTableNames = builder.lowerCaseTableNames;
            this.masterIntranetAddressZone = builder.masterIntranetAddressZone;
            this.maxParallelQueryDegree = builder.maxParallelQueryDegree;
            this.odpVersion = builder.odpVersion;
            this.payType = builder.payType;
            this.primaryZone = builder.primaryZone;
            this.primaryZoneDeployType = builder.primaryZoneDeployType;
            this.readOnlyResource = builder.readOnlyResource;
            this.recycleBinStatus = builder.recycleBinStatus;
            this.series = builder.series;
            this.status = builder.status;
            this.tenantConnections = builder.tenantConnections;
            this.tenantId = builder.tenantId;
            this.tenantMode = builder.tenantMode;
            this.tenantName = builder.tenantName;
            this.tenantResource = builder.tenantResource;
            this.tenantZones = builder.tenantZones;
            this.timeZone = builder.timeZone;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tenant create() {
            return builder().build();
        }

        /**
         * @return availableZones
         */
        public java.util.List < String > getAvailableZones() {
            return this.availableZones;
        }

        /**
         * @return charset
         */
        public String getCharset() {
            return this.charset;
        }

        /**
         * @return clogServiceStatus
         */
        public String getClogServiceStatus() {
            return this.clogServiceStatus;
        }

        /**
         * @return collation
         */
        public String getCollation() {
            return this.collation;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return enableBinlogService
         */
        public Boolean getEnableBinlogService() {
            return this.enableBinlogService;
        }

        /**
         * @return enableClogService
         */
        public Boolean getEnableClogService() {
            return this.enableClogService;
        }

        /**
         * @return enableInternetAddressService
         */
        public Boolean getEnableInternetAddressService() {
            return this.enableInternetAddressService;
        }

        /**
         * @return enableParallelQuery
         */
        public Boolean getEnableParallelQuery() {
            return this.enableParallelQuery;
        }

        /**
         * @return enableReadOnlyReplica
         */
        public Boolean getEnableReadOnlyReplica() {
            return this.enableReadOnlyReplica;
        }

        /**
         * @return enableReadWriteSplit
         */
        public Boolean getEnableReadWriteSplit() {
            return this.enableReadWriteSplit;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return lowerCaseTableNames
         */
        public Integer getLowerCaseTableNames() {
            return this.lowerCaseTableNames;
        }

        /**
         * @return masterIntranetAddressZone
         */
        public String getMasterIntranetAddressZone() {
            return this.masterIntranetAddressZone;
        }

        /**
         * @return maxParallelQueryDegree
         */
        public Long getMaxParallelQueryDegree() {
            return this.maxParallelQueryDegree;
        }

        /**
         * @return odpVersion
         */
        public String getOdpVersion() {
            return this.odpVersion;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return primaryZone
         */
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        /**
         * @return primaryZoneDeployType
         */
        public String getPrimaryZoneDeployType() {
            return this.primaryZoneDeployType;
        }

        /**
         * @return readOnlyResource
         */
        public ReadOnlyResource getReadOnlyResource() {
            return this.readOnlyResource;
        }

        /**
         * @return recycleBinStatus
         */
        public String getRecycleBinStatus() {
            return this.recycleBinStatus;
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
         * @return tenantConnections
         */
        public java.util.List < TenantConnections> getTenantConnections() {
            return this.tenantConnections;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
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
         * @return tenantResource
         */
        public TenantResource getTenantResource() {
            return this.tenantResource;
        }

        /**
         * @return tenantZones
         */
        public java.util.List < TenantZones> getTenantZones() {
            return this.tenantZones;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
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
            private String charset; 
            private String clogServiceStatus; 
            private String collation; 
            private String createTime; 
            private String dataMergeTime; 
            private String deployMode; 
            private String deployType; 
            private String description; 
            private String diskType; 
            private Boolean enableBinlogService; 
            private Boolean enableClogService; 
            private Boolean enableInternetAddressService; 
            private Boolean enableParallelQuery; 
            private Boolean enableReadOnlyReplica; 
            private Boolean enableReadWriteSplit; 
            private String instanceType; 
            private Integer lowerCaseTableNames; 
            private String masterIntranetAddressZone; 
            private Long maxParallelQueryDegree; 
            private String odpVersion; 
            private String payType; 
            private String primaryZone; 
            private String primaryZoneDeployType; 
            private ReadOnlyResource readOnlyResource; 
            private String recycleBinStatus; 
            private String series; 
            private String status; 
            private java.util.List < TenantConnections> tenantConnections; 
            private String tenantId; 
            private String tenantMode; 
            private String tenantName; 
            private TenantResource tenantResource; 
            private java.util.List < TenantZones> tenantZones; 
            private String timeZone; 
            private String version; 
            private String vpcId; 

            /**
             * DescribeTenant
             */
            public Builder availableZones(java.util.List < String > availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * The number of CPU cores in each resource unit of the tenant.
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * 地址类型
             */
            public Builder clogServiceStatus(String clogServiceStatus) {
                this.clogServiceStatus = clogServiceStatus;
                return this;
            }

            /**
             * The request ID.
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * You can call this operation to create a single tenant in a specific cluster.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataMergeTime.
             */
            public Builder dataMergeTime(String dataMergeTime) {
                this.dataMergeTime = dataMergeTime;
                return this;
            }

            /**
             * The list of zones.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * The series of the instance.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * Indicates whether to enable read/write splitting endpoint.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * You can call this operation to query the information of a specific tenant in a specific cluster.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * 是否可以申请Binlog服务
             */
            public Builder enableBinlogService(Boolean enableBinlogService) {
                this.enableBinlogService = enableBinlogService;
                return this;
            }

            /**
             * The intranet address for accessing the tenant.
             */
            public Builder enableClogService(Boolean enableClogService) {
                this.enableClogService = enableClogService;
                return this;
            }

            /**
             * The deployment type of the primary zone.
             */
            public Builder enableInternetAddressService(Boolean enableInternetAddressService) {
                this.enableInternetAddressService = enableInternetAddressService;
                return this;
            }

            /**
             * EnableParallelQuery.
             */
            public Builder enableParallelQuery(Boolean enableParallelQuery) {
                this.enableParallelQuery = enableParallelQuery;
                return this;
            }

            /**
             * EnableReadOnlyReplica.
             */
            public Builder enableReadOnlyReplica(Boolean enableReadOnlyReplica) {
                this.enableReadOnlyReplica = enableReadOnlyReplica;
                return this;
            }

            /**
             * EnableReadWriteSplit.
             */
            public Builder enableReadWriteSplit(Boolean enableReadWriteSplit) {
                this.enableReadWriteSplit = enableReadWriteSplit;
                return this;
            }

            /**
             * {
             * <p>
             *     "RequestId": "EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C",
             *     "Tenant": {
             *         "TenantId": "t33h8y08k****",
             *         "TenantName": "pay_online",
             *         "TenantMode": "Oracle",
             *         "VpcId": "vpc-bp1d2q3mhg9i23ofi****",
             *         "Status": "ONLINE",
             *         "PrimaryZone": "cn-hangzhou-i",
             *         "DeployType": "multiple",
             *         "DeployMode": "1-1-1",
             *         "Description": "PayCore business database",
             *         "CreateTime": "2021-09-17 15:52:17",
             *         "TenantResource": {
             *             "UnitNum": 1,
             *             "Cpu": {
             *                 "UsedCpu": 8,
             *                 "TotalCpu": 10,
             *                 "UnitCpu": 8
             *             },
             *             "Memory": {
             *                 "UsedMemory": 30,
             *                 "TotalMemory": 64,
             *                 "UnitMemory": 32
             *             },
             *             "DiskSize": {
             *                 "UsedDiskSize": 86
             *             }
             *         },
             *         "TenantConnections": [
             *             {
             *                 "ConnectionRole": "ReadWrite",
             *                 "IntranetAddress": "t32a7ru5u****.oceanbase.aliyuncs.com",
             *                 "IntranetPort": 3306,
             *                 "InternetAddress": "t32a7ru5u****mo.oceanbase.aliyuncs.com",
             *                 "InternetPort": 3306,
             *                 "VpcId": "vpc-bp1qiail1asmfe23t****",
             *                 "VSwitchId": "vsw-bp11k1aypnzu1l3whi****",
             *                 "IntranetAddressMasterZoneId": "cn-hangzhou-i",
             *                 "IntranetAddressSlaveZoneId": "cn-hangzhou-j",
             *                 "IntranetAddressStatus": "ONLINE",
             *                 "ConnectionZones": [
             *                     "cn-hangzhou-i"
             *                 ],
             *                 "InternetAddressStatus": "CLOSED"
             *             }
             *         ],
             *         "TenantZones": [
             *             {
             *                 "TenantZoneId": "cn-hangzhou-i",
             *                 "Region": "cn-hangzhou",
             *                 "TenantZoneRole": "ReadOnly"
             *             }
             *         ],
             *         "ClogServiceStatus": "CLOSED"
             *     }
             * }
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * LowerCaseTableNames.
             */
            public Builder lowerCaseTableNames(Integer lowerCaseTableNames) {
                this.lowerCaseTableNames = lowerCaseTableNames;
                return this;
            }

            /**
             * ```
             * <p>
             * http(s)://[Endpoint]/?Action=DescribeTenant
             * &InstanceId=ob317v4uif****
             * &TenantId=ob2mr3oae0****
             * &Common request parameters
             * ```
             */
            public Builder masterIntranetAddressZone(String masterIntranetAddressZone) {
                this.masterIntranetAddressZone = masterIntranetAddressZone;
                return this;
            }

            /**
             * MaxParallelQueryDegree.
             */
            public Builder maxParallelQueryDegree(Long maxParallelQueryDegree) {
                this.maxParallelQueryDegree = maxParallelQueryDegree;
                return this;
            }

            /**
             * OdpVersion.
             */
            public Builder odpVersion(String odpVersion) {
                this.odpVersion = odpVersion;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The type of the payment.
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * Example 1
             */
            public Builder primaryZoneDeployType(String primaryZoneDeployType) {
                this.primaryZoneDeployType = primaryZoneDeployType;
                return this;
            }

            /**
             * ReadOnlyResource.
             */
            public Builder readOnlyResource(ReadOnlyResource readOnlyResource) {
                this.readOnlyResource = readOnlyResource;
                return this;
            }

            /**
             * RecycleBinStatus.
             */
            public Builder recycleBinStatus(String recycleBinStatus) {
                this.recycleBinStatus = recycleBinStatus;
                return this;
            }

            /**
             * <DescribeTenantResponse>
             * <p>
             *     <RequestId>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</RequestId>
             *     <Tenant>
             *         <TenantId>t33h8y08k****</TenantId>
             *         <TenantName>pay_online</TenantName>
             *         <TenantMode>Oracle</TenantMode>
             *         <VpcId>vpc-bp1d2q3mhg9i23ofi****</VpcId>
             *         <Status>ONLINE</Status>
             *         <PrimaryZone>cn-hangzhou-i</PrimaryZone>
             *         <DeployType>multiple</DeployType>
             *         <DeployMode>1-1-1</DeployMode>
             *         <Description>PayCore business database</Description>
             *         <CreateTime>2021-09-17 15:52:17</CreateTime>
             *         <TenantResource>
             *             <UnitNum>1</UnitNum>
             *             <Cpu>
             *                 <UsedCpu>8</UsedCpu>
             *                 <TotalCpu>10</TotalCpu>
             *                 <UnitCpu>8</UnitCpu>
             *             </Cpu>
             *             <Memory>
             *                 <UsedMemory>30</UsedMemory>
             *                 <TotalMemory>64</TotalMemory>
             *                 <UnitMemory>32</UnitMemory>
             *             </Memory>
             *             <DiskSize>
             *                 <UsedDiskSize>86</UsedDiskSize>
             *             </DiskSize>
             *         </TenantResource>
             *         <TenantConnections>
             *             <ConnectionRole>ReadWrite</ConnectionRole>
             *             <IntranetAddress>t32a7ru5u****.oceanbase.aliyuncs.com</IntranetAddress>
             *             <IntranetPort>3306</IntranetPort>
             *             <InternetAddress>t32a7ru5u****mo.oceanbase.aliyuncs.com</InternetAddress>
             *             <InternetPort>3306</InternetPort>
             *             <VpcId>vpc-bp1qiail1asmfe23t****</VpcId>
             *             <VSwitchId>vsw-bp11k1aypnzu1l3whi****</VSwitchId>
             *             <IntranetAddressMasterZoneId>cn-hangzhou-i</IntranetAddressMasterZoneId>
             *             <IntranetAddressSlaveZoneId>cn-hangzhou-j</IntranetAddressSlaveZoneId>
             *             <IntranetAddressStatus>ONLINE</IntranetAddressStatus>
             *             <ConnectionZones>cn-hangzhou-i</ConnectionZones>
             *             <InternetAddressStatus>CLOSED</InternetAddressStatus>
             *         </TenantConnections>
             *         <TenantZones>
             *             <TenantZoneId>cn-hangzhou-i</TenantZoneId>
             *             <Region>cn-hangzhou</Region>
             *             <TenantZoneRole>ReadOnly</TenantZoneRole>
             *         </TenantZones>
             *         <ClogServiceStatus>CLOSED</ClogServiceStatus>
             *     </Tenant>
             * </DescribeTenantResponse>
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * The character set.
             */
            public Builder status(String status) {
                this.status = status;
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
            public Builder tenantConnections(java.util.List < TenantConnections> tenantConnections) {
                this.tenantConnections = tenantConnections;
                return this;
            }

            /**
             * The region where the zone of the tenant resides.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The enabling status of the clog service.  
             * <p>
             * - CLOSED: The clog service is disabled.  
             * - ONLINE: The clog service is running.
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * The request type of the zone of the tenant.  ReadWrite: The zone supports data reads and writes. ReadOnly: The zone supports only data reads. For a high availability cluster with multiple IDCs, the primary zone provides ReadWrite services, and the standby zone provides ReadOnly services. For a high availability cluster with a single IDC, all zones provide ReadWrite services.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.
             */
            public Builder tenantResource(TenantResource tenantResource) {
                this.tenantResource = tenantResource;
                return this;
            }

            /**
             * The standby zone corresponding to the address for accessing the tenant.
             */
            public Builder tenantZones(java.util.List < TenantZones> tenantZones) {
                this.tenantZones = tenantZones;
                return this;
            }

            /**
             * TimeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * Indicates whether the clog service is available. To enable the clog service, submit a ticket.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Tenant build() {
                return new Tenant(this);
            } 

        } 

    }
}
