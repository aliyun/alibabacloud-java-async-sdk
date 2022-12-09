// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantResponseBody</p>
 */
public class DescribeTenantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tenant")
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 租户信息。
         */
        public Builder tenant(Tenant tenant) {
            this.tenant = tenant;
            return this;
        }

        public DescribeTenantResponseBody build() {
            return new DescribeTenantResponseBody(this);
        } 

    } 

    public static class TenantConnections extends TeaModel {
        @NameInMap("AddressType")
        private String addressType;

        @NameInMap("ConnectionRole")
        private String connectionRole;

        @NameInMap("ConnectionZones")
        private java.util.List < String > connectionZones;

        @NameInMap("InternetAddress")
        private String internetAddress;

        @NameInMap("InternetAddressStatus")
        private String internetAddressStatus;

        @NameInMap("InternetPort")
        private Integer internetPort;

        @NameInMap("IntranetAddress")
        private String intranetAddress;

        @NameInMap("IntranetAddressMasterZoneId")
        private String intranetAddressMasterZoneId;

        @NameInMap("IntranetAddressSlaveZoneId")
        private String intranetAddressSlaveZoneId;

        @NameInMap("IntranetAddressStatus")
        private String intranetAddressStatus;

        @NameInMap("IntranetPort")
        private Integer intranetPort;

        @NameInMap("TransactionSplit")
        private Boolean transactionSplit;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private TenantConnections(Builder builder) {
            this.addressType = builder.addressType;
            this.connectionRole = builder.connectionRole;
            this.connectionZones = builder.connectionZones;
            this.internetAddress = builder.internetAddress;
            this.internetAddressStatus = builder.internetAddressStatus;
            this.internetPort = builder.internetPort;
            this.intranetAddress = builder.intranetAddress;
            this.intranetAddressMasterZoneId = builder.intranetAddressMasterZoneId;
            this.intranetAddressSlaveZoneId = builder.intranetAddressSlaveZoneId;
            this.intranetAddressStatus = builder.intranetAddressStatus;
            this.intranetPort = builder.intranetPort;
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
         * @return connectionRole
         */
        public String getConnectionRole() {
            return this.connectionRole;
        }

        /**
         * @return connectionZones
         */
        public java.util.List < String > getConnectionZones() {
            return this.connectionZones;
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
         * @return internetPort
         */
        public Integer getInternetPort() {
            return this.internetPort;
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
            private String connectionRole; 
            private java.util.List < String > connectionZones; 
            private String internetAddress; 
            private String internetAddressStatus; 
            private Integer internetPort; 
            private String intranetAddress; 
            private String intranetAddressMasterZoneId; 
            private String intranetAddressSlaveZoneId; 
            private String intranetAddressStatus; 
            private Integer intranetPort; 
            private Boolean transactionSplit; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * 地址类型
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * 连接地址的服务模式。 ReadWrite：可读可写，提供强一致读写服务 ReadOnly：只读，保证数据最终一致性 Clog：事务日志服务
             */
            public Builder connectionRole(String connectionRole) {
                this.connectionRole = connectionRole;
                return this;
            }

            /**
             * 租户连接对应的访问可用区列表。
             */
            public Builder connectionZones(java.util.List < String > connectionZones) {
                this.connectionZones = connectionZones;
                return this;
            }

            /**
             * 访问租户的公网连接地址。
             */
            public Builder internetAddress(String internetAddress) {
                this.internetAddress = internetAddress;
                return this;
            }

            /**
             * 访问租户的公网连接开通状态。 CLOSED：关闭 ALLOCATING_INTERNET_ADDRESS：申请中 PENDING_OFFLINE_INTERNET_ADDRESS: 公网地址关闭中 ONLINE：服务中
             */
            public Builder internetAddressStatus(String internetAddressStatus) {
                this.internetAddressStatus = internetAddressStatus;
                return this;
            }

            /**
             * 访问租户的公网连接端口。
             */
            public Builder internetPort(Integer internetPort) {
                this.internetPort = internetPort;
                return this;
            }

            /**
             * 访问租户的私网连接地址。
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * 访问租户的连接地址对应的主可用区。
             */
            public Builder intranetAddressMasterZoneId(String intranetAddressMasterZoneId) {
                this.intranetAddressMasterZoneId = intranetAddressMasterZoneId;
                return this;
            }

            /**
             * 访问租户的连接地址对应的备可用区。
             */
            public Builder intranetAddressSlaveZoneId(String intranetAddressSlaveZoneId) {
                this.intranetAddressSlaveZoneId = intranetAddressSlaveZoneId;
                return this;
            }

            /**
             * 访问租户的私网连接地址状态。 ONLINE: 服务中
             */
            public Builder intranetAddressStatus(String intranetAddressStatus) {
                this.intranetAddressStatus = intranetAddressStatus;
                return this;
            }

            /**
             * 访问租户的私网连接端口。
             */
            public Builder intranetPort(Integer intranetPort) {
                this.intranetPort = intranetPort;
                return this;
            }

            /**
             * 是否开启事务拆分
             */
            public Builder transactionSplit(Boolean transactionSplit) {
                this.transactionSplit = transactionSplit;
                return this;
            }

            /**
             * 虚拟交换机（VSwitch） ID。
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * 专有网络（VPC） ID。
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
    public static class Cpu extends TeaModel {
        @NameInMap("TotalCpu")
        private Float totalCpu;

        @NameInMap("UnitCpu")
        private Float unitCpu;

        @NameInMap("UsedCpu")
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
             * 租户总的CPU核数，单位：Core。
             */
            public Builder totalCpu(Float totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * 租户每个Unit的CPU核数，单位：Core。
             */
            public Builder unitCpu(Float unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * 租户已使用的CPU核数，单位：Core。
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
        @NameInMap("UsedDiskSize")
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
             * 租户已使用的磁盘大小，单位：GB。
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
    public static class Memory extends TeaModel {
        @NameInMap("TotalMemory")
        private Float totalMemory;

        @NameInMap("UnitMemory")
        private Float unitMemory;

        @NameInMap("UsedMemory")
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
             * 租户总的内存大小，单位：GB。
             */
            public Builder totalMemory(Float totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * 租户每个Unit的内存大小，单位：GB。
             */
            public Builder unitMemory(Float unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * 租户已使用的内存，单位：GB。
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
    public static class TenantResource extends TeaModel {
        @NameInMap("Cpu")
        private Cpu cpu;

        @NameInMap("DiskSize")
        private DiskSize diskSize;

        @NameInMap("Memory")
        private Memory memory;

        @NameInMap("UnitNum")
        private Integer unitNum;

        private TenantResource(Builder builder) {
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
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
         * @return unitNum
         */
        public Integer getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private Cpu cpu; 
            private DiskSize diskSize; 
            private Memory memory; 
            private Integer unitNum; 

            /**
             * 租户的CPU资源信息。
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * 租户磁盘资源信息。
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * 租户内存资源信息。
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * 租户的unit个数。
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
    public static class TenantZones extends TeaModel {
        @NameInMap("Region")
        private String region;

        @NameInMap("TenantZoneId")
        private String tenantZoneId;

        @NameInMap("TenantZoneRole")
        private String tenantZoneRole;

        private TenantZones(Builder builder) {
            this.region = builder.region;
            this.tenantZoneId = builder.tenantZoneId;
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
         * @return tenantZoneRole
         */
        public String getTenantZoneRole() {
            return this.tenantZoneRole;
        }

        public static final class Builder {
            private String region; 
            private String tenantZoneId; 
            private String tenantZoneRole; 

            /**
             * 租户可用区所属的地域。
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * 租户可用区ID。
             */
            public Builder tenantZoneId(String tenantZoneId) {
                this.tenantZoneId = tenantZoneId;
                return this;
            }

            /**
             * 租户可用区的请求类型。 ReadWrite：可读可写 ReadOnly：只读 对于多机房高可用集群，其主可用区为ReadWrite。备可用区为ReadOnly; 对于单机房高可用集群，其所有可用区均为ReadWrite。
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
        @NameInMap("AvailableZones")
        private java.util.List < String > availableZones;

        @NameInMap("Charset")
        private String charset;

        @NameInMap("ClogServiceStatus")
        private String clogServiceStatus;

        @NameInMap("Collation")
        private String collation;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("Description")
        private String description;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("EnableClogService")
        private Boolean enableClogService;

        @NameInMap("EnableInternetAddressService")
        private Boolean enableInternetAddressService;

        @NameInMap("EnableReadWriteSplit")
        private Boolean enableReadWriteSplit;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MasterIntranetAddressZone")
        private String masterIntranetAddressZone;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("PrimaryZone")
        private String primaryZone;

        @NameInMap("PrimaryZoneDeployType")
        private String primaryZoneDeployType;

        @NameInMap("Series")
        private String series;

        @NameInMap("Status")
        private String status;

        @NameInMap("TenantConnections")
        private java.util.List < TenantConnections> tenantConnections;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TenantMode")
        private String tenantMode;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("TenantResource")
        private TenantResource tenantResource;

        @NameInMap("TenantZones")
        private java.util.List < TenantZones> tenantZones;

        @NameInMap("VpcId")
        private String vpcId;

        private Tenant(Builder builder) {
            this.availableZones = builder.availableZones;
            this.charset = builder.charset;
            this.clogServiceStatus = builder.clogServiceStatus;
            this.collation = builder.collation;
            this.createTime = builder.createTime;
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.diskType = builder.diskType;
            this.enableClogService = builder.enableClogService;
            this.enableInternetAddressService = builder.enableInternetAddressService;
            this.enableReadWriteSplit = builder.enableReadWriteSplit;
            this.instanceType = builder.instanceType;
            this.masterIntranetAddressZone = builder.masterIntranetAddressZone;
            this.payType = builder.payType;
            this.primaryZone = builder.primaryZone;
            this.primaryZoneDeployType = builder.primaryZoneDeployType;
            this.series = builder.series;
            this.status = builder.status;
            this.tenantConnections = builder.tenantConnections;
            this.tenantId = builder.tenantId;
            this.tenantMode = builder.tenantMode;
            this.tenantName = builder.tenantName;
            this.tenantResource = builder.tenantResource;
            this.tenantZones = builder.tenantZones;
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
         * @return masterIntranetAddressZone
         */
        public String getMasterIntranetAddressZone() {
            return this.masterIntranetAddressZone;
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
            private String deployMode; 
            private String deployType; 
            private String description; 
            private String diskType; 
            private Boolean enableClogService; 
            private Boolean enableInternetAddressService; 
            private Boolean enableReadWriteSplit; 
            private String instanceType; 
            private String masterIntranetAddressZone; 
            private String payType; 
            private String primaryZone; 
            private String primaryZoneDeployType; 
            private String series; 
            private String status; 
            private java.util.List < TenantConnections> tenantConnections; 
            private String tenantId; 
            private String tenantMode; 
            private String tenantName; 
            private TenantResource tenantResource; 
            private java.util.List < TenantZones> tenantZones; 
            private String vpcId; 

            /**
             * 可用区
             */
            public Builder availableZones(java.util.List < String > availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * 字符集
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * Clog服务开启状态。 CLOSED: 关闭 ONLINE：服务中
             */
            public Builder clogServiceStatus(String clogServiceStatus) {
                this.clogServiceStatus = clogServiceStatus;
                return this;
            }

            /**
             * 字符序
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 租户的数据副本模式。 对于高可用版本：三地域为N-N-N，两可用区和单可用区均为N-N； 对于基础版为N。 其中，N为单可用区内的节点数。
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * 集群的部署类型。 multiple：多机房 single：单机房 dual：双机房
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * 租户描述信息。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 磁盘类型
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * 是否可使用Clog服务，如需开启，请工单联系。
             */
            public Builder enableClogService(Boolean enableClogService) {
                this.enableClogService = enableClogService;
                return this;
            }

            /**
             * 是否可开启租户公网地址。
             */
            public Builder enableInternetAddressService(Boolean enableInternetAddressService) {
                this.enableInternetAddressService = enableInternetAddressService;
                return this;
            }

            /**
             * 是否允许开启读写分离地址
             */
            public Builder enableReadWriteSplit(Boolean enableReadWriteSplit) {
                this.enableReadWriteSplit = enableReadWriteSplit;
                return this;
            }

            /**
             * 实例类型
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 租户主地址可用区
             */
            public Builder masterIntranetAddressZone(String masterIntranetAddressZone) {
                this.masterIntranetAddressZone = masterIntranetAddressZone;
                return this;
            }

            /**
             * 付费类型
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * 租户的主可用区。
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * 租户主可用区部署模式
             */
            public Builder primaryZoneDeployType(String primaryZoneDeployType) {
                this.primaryZoneDeployType = primaryZoneDeployType;
                return this;
            }

            /**
             * 实例系列
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * 租户的状态。 PENDING_CREATE: 创建中 RESTORE: 恢复中 ONLINE: 运行中 SPEC_MODIFYING: 规格修改中 ALLOCATING_INTERNET_ADDRESS: 公网地址分配中 PENDING_OFFLINE_INTERNET_ADDRESS: 公网地址关闭中 PRIMARY_ZONE_MODIFYING: 切主可用区中 PARAMETER_MODIFYING: 参数修改中 WHITE_LIST_MODIFING: 白名单修改中
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 租户的连接访问信息。
             */
            public Builder tenantConnections(java.util.List < TenantConnections> tenantConnections) {
                this.tenantConnections = tenantConnections;
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
             * 租户模式。 当前支持： Oracle：Oracle模式 MySQL: MySQL模式
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
             * 租户的资源信息。
             */
            public Builder tenantResource(TenantResource tenantResource) {
                this.tenantResource = tenantResource;
                return this;
            }

            /**
             * 租户可用区信息。
             */
            public Builder tenantZones(java.util.List < TenantZones> tenantZones) {
                this.tenantZones = tenantZones;
                return this;
            }

            /**
             * 专有网络（VPC） ID。 如果没有合适的 VPC，请根据页面提示创建一个 VPC，详情参见 什么是专有网络
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
