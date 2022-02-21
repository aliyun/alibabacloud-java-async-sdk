// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Instances")
    private Instances instances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private Instances instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
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

    public static class DataDisk extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("device_type")
        private String deviceType;

        @NameInMap("disk_type")
        private String diskType;

        @NameInMap("name")
        private String name;

        @NameInMap("storage")
        private Integer storage;

        @NameInMap("uuid")
        private String uuid;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.size = builder.size;
            this.deviceType = builder.deviceType;
            this.diskType = builder.diskType;
            this.name = builder.name;
            this.storage = builder.storage;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String category; 
            private String diskId; 
            private String diskName; 
            private Integer size; 
            private String deviceType; 
            private String diskType; 
            private String name; 
            private Integer storage; 
            private String uuid; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * DiskName.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * device_type.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * disk_type.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * storage.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class InstanceDataDisk extends TeaModel {
        @NameInMap("DataDisk")
        private java.util.List < DataDisk> dataDisk;

        private InstanceDataDisk(Builder builder) {
            this.dataDisk = builder.dataDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDataDisk create() {
            return builder().build();
        }

        /**
         * @return dataDisk
         */
        public java.util.List < DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public static final class Builder {
            private java.util.List < DataDisk> dataDisk; 

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            public InstanceDataDisk build() {
                return new InstanceDataDisk(this);
            } 

        } 

    }
    public static class InnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private InnerIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InnerIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public InnerIpAddress build() {
                return new InnerIpAddress(this);
            } 

        } 

    }
    public static class PrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private PrivateIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PrivateIpAddress build() {
                return new PrivateIpAddress(this);
            } 

        } 

    }
    public static class NetworkAttributes extends TeaModel {
        @NameInMap("NetworkId")
        private String networkId;

        @NameInMap("PrivateIpAddress")
        private PrivateIpAddress privateIpAddress;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkAttributes(Builder builder) {
            this.networkId = builder.networkId;
            this.privateIpAddress = builder.privateIpAddress;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAttributes create() {
            return builder().build();
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return privateIpAddress
         */
        public PrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String networkId; 
            private PrivateIpAddress privateIpAddress; 
            private String vSwitchId; 

            /**
             * NetworkId.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(PrivateIpAddress privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NetworkAttributes build() {
                return new NetworkAttributes(this);
            } 

        } 

    }
    public static class PrivateIpAddressesPrivateIpAddress extends TeaModel {
        @NameInMap("GateWay")
        private String gateWay;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Isp")
        private String isp;

        private PrivateIpAddressesPrivateIpAddress(Builder builder) {
            this.gateWay = builder.gateWay;
            this.ip = builder.ip;
            this.isp = builder.isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpAddressesPrivateIpAddress create() {
            return builder().build();
        }

        /**
         * @return gateWay
         */
        public String getGateWay() {
            return this.gateWay;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        public static final class Builder {
            private String gateWay; 
            private String ip; 
            private String isp; 

            /**
             * GateWay.
             */
            public Builder gateWay(String gateWay) {
                this.gateWay = gateWay;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            public PrivateIpAddressesPrivateIpAddress build() {
                return new PrivateIpAddressesPrivateIpAddress(this);
            } 

        } 

    }
    public static class PrivateIpAddresses extends TeaModel {
        @NameInMap("PrivateIpAddress")
        private java.util.List < PrivateIpAddressesPrivateIpAddress> privateIpAddress;

        private PrivateIpAddresses(Builder builder) {
            this.privateIpAddress = builder.privateIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpAddresses create() {
            return builder().build();
        }

        /**
         * @return privateIpAddress
         */
        public java.util.List < PrivateIpAddressesPrivateIpAddress> getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private java.util.List < PrivateIpAddressesPrivateIpAddress> privateIpAddress; 

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(java.util.List < PrivateIpAddressesPrivateIpAddress> privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            public PrivateIpAddresses build() {
                return new PrivateIpAddresses(this);
            } 

        } 

    }
    public static class PublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private PublicIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PublicIpAddress build() {
                return new PublicIpAddress(this);
            } 

        } 

    }
    public static class PublicIpAddressesPublicIpAddress extends TeaModel {
        @NameInMap("GateWay")
        private String gateWay;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Isp")
        private String isp;

        private PublicIpAddressesPublicIpAddress(Builder builder) {
            this.gateWay = builder.gateWay;
            this.ip = builder.ip;
            this.isp = builder.isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddressesPublicIpAddress create() {
            return builder().build();
        }

        /**
         * @return gateWay
         */
        public String getGateWay() {
            return this.gateWay;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        public static final class Builder {
            private String gateWay; 
            private String ip; 
            private String isp; 

            /**
             * GateWay.
             */
            public Builder gateWay(String gateWay) {
                this.gateWay = gateWay;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            public PublicIpAddressesPublicIpAddress build() {
                return new PublicIpAddressesPublicIpAddress(this);
            } 

        } 

    }
    public static class PublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddress")
        private java.util.List < PublicIpAddressesPublicIpAddress> publicIpAddress;

        private PublicIpAddresses(Builder builder) {
            this.publicIpAddress = builder.publicIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddresses create() {
            return builder().build();
        }

        /**
         * @return publicIpAddress
         */
        public java.util.List < PublicIpAddressesPublicIpAddress> getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public static final class Builder {
            private java.util.List < PublicIpAddressesPublicIpAddress> publicIpAddress; 

            /**
             * PublicIpAddress.
             */
            public Builder publicIpAddress(java.util.List < PublicIpAddressesPublicIpAddress> publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            public PublicIpAddresses build() {
                return new PublicIpAddresses(this);
            } 

        } 

    }
    public static class SecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        private java.util.List < String > securityGroupId;

        private SecurityGroupIds(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupIds create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List < String > getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List < String > securityGroupId; 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List < String > securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIds build() {
                return new SecurityGroupIds(this);
            } 

        } 

    }
    public static class SystemDisk extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("device_type")
        private String deviceType;

        @NameInMap("disk_type")
        private String diskType;

        @NameInMap("name")
        private String name;

        @NameInMap("storage")
        private Integer storage;

        @NameInMap("uuid")
        private String uuid;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.size = builder.size;
            this.deviceType = builder.deviceType;
            this.diskType = builder.diskType;
            this.name = builder.name;
            this.storage = builder.storage;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String category; 
            private String diskId; 
            private String diskName; 
            private Integer size; 
            private String deviceType; 
            private String diskType; 
            private String name; 
            private Integer storage; 
            private String uuid; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * DiskName.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * device_type.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * disk_type.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * storage.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("Cpu")
        private String cpu;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DataDisk")
        private InstanceDataDisk dataDisk;

        @NameInMap("Disk")
        private Integer disk;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InnerIpAddress")
        private InnerIpAddress innerIpAddress;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceResourceType")
        private String instanceResourceType;

        @NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("NetworkAttributes")
        private NetworkAttributes networkAttributes;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("PrivateIpAddresses")
        private PrivateIpAddresses privateIpAddresses;

        @NameInMap("PublicIpAddress")
        private PublicIpAddress publicIpAddress;

        @NameInMap("PublicIpAddresses")
        private PublicIpAddresses publicIpAddresses;

        @NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        @NameInMap("SpecName")
        private String specName;

        @NameInMap("Status")
        private String status;

        @NameInMap("SystemDisk")
        private SystemDisk systemDisk;

        private Instance(Builder builder) {
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.dataDisk = builder.dataDisk;
            this.disk = builder.disk;
            this.ensRegionId = builder.ensRegionId;
            this.expiredTime = builder.expiredTime;
            this.hostName = builder.hostName;
            this.imageId = builder.imageId;
            this.innerIpAddress = builder.innerIpAddress;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceResourceType = builder.instanceResourceType;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.memory = builder.memory;
            this.networkAttributes = builder.networkAttributes;
            this.OSName = builder.OSName;
            this.privateIpAddresses = builder.privateIpAddresses;
            this.publicIpAddress = builder.publicIpAddress;
            this.publicIpAddresses = builder.publicIpAddresses;
            this.securityGroupIds = builder.securityGroupIds;
            this.specName = builder.specName;
            this.status = builder.status;
            this.systemDisk = builder.systemDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataDisk
         */
        public InstanceDataDisk getDataDisk() {
            return this.dataDisk;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return innerIpAddress
         */
        public InnerIpAddress getInnerIpAddress() {
            return this.innerIpAddress;
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
         * @return instanceResourceType
         */
        public String getInstanceResourceType() {
            return this.instanceResourceType;
        }

        /**
         * @return internetMaxBandwidthIn
         */
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return networkAttributes
         */
        public NetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        /**
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
        }

        /**
         * @return privateIpAddresses
         */
        public PrivateIpAddresses getPrivateIpAddresses() {
            return this.privateIpAddresses;
        }

        /**
         * @return publicIpAddress
         */
        public PublicIpAddress getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return publicIpAddresses
         */
        public PublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        /**
         * @return securityGroupIds
         */
        public SecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemDisk
         */
        public SystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public static final class Builder {
            private String cpu; 
            private String creationTime; 
            private InstanceDataDisk dataDisk; 
            private Integer disk; 
            private String ensRegionId; 
            private String expiredTime; 
            private String hostName; 
            private String imageId; 
            private InnerIpAddress innerIpAddress; 
            private String instanceId; 
            private String instanceName; 
            private String instanceResourceType; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private Integer memory; 
            private NetworkAttributes networkAttributes; 
            private String OSName; 
            private PrivateIpAddresses privateIpAddresses; 
            private PublicIpAddress publicIpAddress; 
            private PublicIpAddresses publicIpAddresses; 
            private SecurityGroupIds securityGroupIds; 
            private String specName; 
            private String status; 
            private SystemDisk systemDisk; 

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataDisk.
             */
            public Builder dataDisk(InstanceDataDisk dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * Disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
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
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InnerIpAddress.
             */
            public Builder innerIpAddress(InnerIpAddress innerIpAddress) {
                this.innerIpAddress = innerIpAddress;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceResourceType.
             */
            public Builder instanceResourceType(String instanceResourceType) {
                this.instanceResourceType = instanceResourceType;
                return this;
            }

            /**
             * InternetMaxBandwidthIn.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * InternetMaxBandwidthOut.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
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
             * NetworkAttributes.
             */
            public Builder networkAttributes(NetworkAttributes networkAttributes) {
                this.networkAttributes = networkAttributes;
                return this;
            }

            /**
             * OSName.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * PrivateIpAddresses.
             */
            public Builder privateIpAddresses(PrivateIpAddresses privateIpAddresses) {
                this.privateIpAddresses = privateIpAddresses;
                return this;
            }

            /**
             * PublicIpAddress.
             */
            public Builder publicIpAddress(PublicIpAddress publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * PublicIpAddresses.
             */
            public Builder publicIpAddresses(PublicIpAddresses publicIpAddresses) {
                this.publicIpAddresses = publicIpAddresses;
                return this;
            }

            /**
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
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
             * SystemDisk.
             */
            public Builder systemDisk(SystemDisk systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
