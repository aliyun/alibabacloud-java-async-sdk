// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHostResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterHostResponseBody</p>
 */
public class ListClusterHostResponseBody extends TeaModel {
    @NameInMap("HostList")
    private HostList hostList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListClusterHostResponseBody(Builder builder) {
        this.hostList = builder.hostList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterHostResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostList
     */
    public HostList getHostList() {
        return this.hostList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private HostList hostList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * HostList.
         */
        public Builder hostList(HostList hostList) {
            this.hostList = hostList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListClusterHostResponseBody build() {
            return new ListClusterHostResponseBody(this);
        } 

    } 

    public static class Disk extends TeaModel {
        @NameInMap("BlockMountPoint")
        private String blockMountPoint;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskMountPoint")
        private String diskMountPoint;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("Event")
        private String event;

        @NameInMap("Type")
        private String type;

        private Disk(Builder builder) {
            this.blockMountPoint = builder.blockMountPoint;
            this.device = builder.device;
            this.diskId = builder.diskId;
            this.diskMountPoint = builder.diskMountPoint;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.event = builder.event;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return blockMountPoint
         */
        public String getBlockMountPoint() {
            return this.blockMountPoint;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskMountPoint
         */
        public String getDiskMountPoint() {
            return this.diskMountPoint;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String blockMountPoint; 
            private String device; 
            private String diskId; 
            private String diskMountPoint; 
            private Integer diskSize; 
            private String diskType; 
            private String event; 
            private String type; 

            /**
             * BlockMountPoint.
             */
            public Builder blockMountPoint(String blockMountPoint) {
                this.blockMountPoint = blockMountPoint;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * DiskMountPoint.
             */
            public Builder diskMountPoint(String diskMountPoint) {
                this.diskMountPoint = diskMountPoint;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
    public static class DiskList extends TeaModel {
        @NameInMap("Disk")
        private java.util.List < Disk> disk;

        private DiskList(Builder builder) {
            this.disk = builder.disk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskList create() {
            return builder().build();
        }

        /**
         * @return disk
         */
        public java.util.List < Disk> getDisk() {
            return this.disk;
        }

        public static final class Builder {
            private java.util.List < Disk> disk; 

            /**
             * Disk.
             */
            public Builder disk(java.util.List < Disk> disk) {
                this.disk = disk;
                return this;
            }

            public DiskList build() {
                return new DiskList(this);
            } 

        } 

    }
    public static class HostListHost extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DiskList")
        private DiskList diskList;

        @NameInMap("EmrExpiredTime")
        private String emrExpiredTime;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostInstanceId")
        private String hostInstanceId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("PublicIp")
        private String publicIp;

        @NameInMap("Role")
        private String role;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupportIpV6")
        private Boolean supportIpV6;

        @NameInMap("Type")
        private String type;

        @NameInMap("ZoneId")
        private String zoneId;

        private HostListHost(Builder builder) {
            this.chargeType = builder.chargeType;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.diskList = builder.diskList;
            this.emrExpiredTime = builder.emrExpiredTime;
            this.expiredTime = builder.expiredTime;
            this.hostGroupId = builder.hostGroupId;
            this.hostInstanceId = builder.hostInstanceId;
            this.hostName = builder.hostName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.role = builder.role;
            this.serialNumber = builder.serialNumber;
            this.status = builder.status;
            this.supportIpV6 = builder.supportIpV6;
            this.type = builder.type;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostListHost create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
         * @return diskList
         */
        public DiskList getDiskList() {
            return this.diskList;
        }

        /**
         * @return emrExpiredTime
         */
        public String getEmrExpiredTime() {
            return this.emrExpiredTime;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return hostInstanceId
         */
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportIpV6
         */
        public Boolean getSupportIpV6() {
            return this.supportIpV6;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String chargeType; 
            private Integer cpu; 
            private String createTime; 
            private DiskList diskList; 
            private String emrExpiredTime; 
            private Long expiredTime; 
            private String hostGroupId; 
            private String hostInstanceId; 
            private String hostName; 
            private String instanceStatus; 
            private String instanceType; 
            private Integer memory; 
            private String privateIp; 
            private String publicIp; 
            private String role; 
            private String serialNumber; 
            private String status; 
            private Boolean supportIpV6; 
            private String type; 
            private String zoneId; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
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
             * DiskList.
             */
            public Builder diskList(DiskList diskList) {
                this.diskList = diskList;
                return this;
            }

            /**
             * EmrExpiredTime.
             */
            public Builder emrExpiredTime(String emrExpiredTime) {
                this.emrExpiredTime = emrExpiredTime;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * HostGroupId.
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * HostInstanceId.
             */
            public Builder hostInstanceId(String hostInstanceId) {
                this.hostInstanceId = hostInstanceId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SupportIpV6.
             */
            public Builder supportIpV6(Boolean supportIpV6) {
                this.supportIpV6 = supportIpV6;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public HostListHost build() {
                return new HostListHost(this);
            } 

        } 

    }
    public static class HostList extends TeaModel {
        @NameInMap("Host")
        private java.util.List < HostListHost> host;

        private HostList(Builder builder) {
            this.host = builder.host;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostList create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public java.util.List < HostListHost> getHost() {
            return this.host;
        }

        public static final class Builder {
            private java.util.List < HostListHost> host; 

            /**
             * Host.
             */
            public Builder host(java.util.List < HostListHost> host) {
                this.host = host;
                return this;
            }

            public HostList build() {
                return new HostList(this);
            } 

        } 

    }
}
