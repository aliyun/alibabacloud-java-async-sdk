// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The returned service code. 0 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned instance information. It is an array that consists of InstanceAttributesType data.</p>
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("EncryptKeyId")
        private String encryptKeyId;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("device_type")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("disk_type")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("storage")
        private Integer storage;

        @com.aliyun.core.annotation.NameInMap("uuid")
        private String uuid;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.diskSize = builder.diskSize;
            this.encryptKeyId = builder.encryptKeyId;
            this.encrypted = builder.encrypted;
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
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return encryptKeyId
         */
        public String getEncryptKeyId() {
            return this.encryptKeyId;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
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
            private Integer diskSize; 
            private String encryptKeyId; 
            private Boolean encrypted; 
            private Integer size; 
            private String deviceType; 
            private String diskType; 
            private String name; 
            private Integer storage; 
            private String uuid; 

            /**
             * <p>The category of the cloud disk or local disk. Valid values:</p>
             * <ul>
             * <li><strong>file</strong>: local disk.</li>
             * <li><strong>pangu</strong>: ultra disk.</li>
             * <li><strong>local_hdd</strong>: local HDD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The ID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-5ip4c2dhmas0vjd5u1r****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The name of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>DiskName</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * EncryptKeyId.
             */
            public Builder encryptKeyId(String encryptKeyId) {
                this.encryptKeyId = encryptKeyId;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>51200</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The extended field of the disk category. Valid values:</p>
             * <ul>
             * <li><strong>file</strong>: local disk.</li>
             * <li><strong>pangu</strong>: ultra disk.</li>
             * <li><strong>local_hdd</strong>: local HDD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pangu</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The type of the cloud disk or local disk. Valid values:</p>
             * <p><strong>system</strong>: system disk. <strong>data</strong>: data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The name of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20480</p>
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The UUID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-5itef1wtxj961mbff8xe9****</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class InstanceDataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDisk")
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class InnerIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class NetworkAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private PrivateIpAddress privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
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
             * <p>The ID of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>n-2zeuphj08tt7q3brd****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>Details of the private IP addresses.</p>
             */
            public Builder privateIpAddress(PrivateIpAddress privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zeh0r1pabwtg6wcs****</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Ipv6Set extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        private Ipv6Set(Builder builder) {
            this.ipv6Address = builder.ipv6Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Set create() {
            return builder().build();
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private String ipv6Address; 

            /**
             * Ipv6Address.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            public Ipv6Set build() {
                return new Ipv6Set(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Ipv6Sets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Set")
        private java.util.List < Ipv6Set> ipv6Set;

        private Ipv6Sets(Builder builder) {
            this.ipv6Set = builder.ipv6Set;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Sets create() {
            return builder().build();
        }

        /**
         * @return ipv6Set
         */
        public java.util.List < Ipv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

        public static final class Builder {
            private java.util.List < Ipv6Set> ipv6Set; 

            /**
             * Ipv6Set.
             */
            public Builder ipv6Set(java.util.List < Ipv6Set> ipv6Set) {
                this.ipv6Set = ipv6Set;
                return this;
            }

            public Ipv6Sets build() {
                return new Ipv6Sets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateIpSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        private PrivateIpSet(Builder builder) {
            this.primary = builder.primary;
            this.privateIpAddress = builder.privateIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSet create() {
            return builder().build();
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private Boolean primary; 
            private String privateIpAddress; 

            /**
             * Primary.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * <p>Details of the private IP addresses.</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            public PrivateIpSet build() {
                return new PrivateIpSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateIpSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateIpSet")
        private java.util.List < PrivateIpSet> privateIpSet;

        private PrivateIpSets(Builder builder) {
            this.privateIpSet = builder.privateIpSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSets create() {
            return builder().build();
        }

        /**
         * @return privateIpSet
         */
        public java.util.List < PrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

        public static final class Builder {
            private java.util.List < PrivateIpSet> privateIpSet; 

            /**
             * PrivateIpSet.
             */
            public Builder privateIpSet(java.util.List < PrivateIpSet> privateIpSet) {
                this.privateIpSet = privateIpSet;
                return this;
            }

            public PrivateIpSets build() {
                return new PrivateIpSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class NetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Sets")
        private Ipv6Sets ipv6Sets;

        @com.aliyun.core.annotation.NameInMap("MacAddress")
        private String macAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @com.aliyun.core.annotation.NameInMap("PrivateIpSets")
        private PrivateIpSets privateIpSets;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private NetworkInterfaces(Builder builder) {
            this.ipv6Sets = builder.ipv6Sets;
            this.macAddress = builder.macAddress;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.privateIpSets = builder.privateIpSets;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaces create() {
            return builder().build();
        }

        /**
         * @return ipv6Sets
         */
        public Ipv6Sets getIpv6Sets() {
            return this.ipv6Sets;
        }

        /**
         * @return macAddress
         */
        public String getMacAddress() {
            return this.macAddress;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return primaryIpAddress
         */
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        /**
         * @return privateIpSets
         */
        public PrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Ipv6Sets ipv6Sets; 
            private String macAddress; 
            private String networkInterfaceId; 
            private String primaryIpAddress; 
            private PrivateIpSets privateIpSets; 
            private String type; 

            /**
             * Ipv6Sets.
             */
            public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
                this.ipv6Sets = ipv6Sets;
                return this;
            }

            /**
             * MacAddress.
             */
            public Builder macAddress(String macAddress) {
                this.macAddress = macAddress;
                return this;
            }

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * PrimaryIpAddress.
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * PrivateIpSets.
             */
            public Builder privateIpSets(PrivateIpSets privateIpSets) {
                this.privateIpSets = privateIpSets;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NetworkInterfaces build() {
                return new NetworkInterfaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class InstanceNetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaces")
        private java.util.List < NetworkInterfaces> networkInterfaces;

        private InstanceNetworkInterfaces(Builder builder) {
            this.networkInterfaces = builder.networkInterfaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceNetworkInterfaces create() {
            return builder().build();
        }

        /**
         * @return networkInterfaces
         */
        public java.util.List < NetworkInterfaces> getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        public static final class Builder {
            private java.util.List < NetworkInterfaces> networkInterfaces; 

            /**
             * NetworkInterfaces.
             */
            public Builder networkInterfaces(java.util.List < NetworkInterfaces> networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            public InstanceNetworkInterfaces build() {
                return new InstanceNetworkInterfaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateIpAddressesPrivateIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GateWay")
        private String gateWay;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Isp")
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
             * <p>The gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>119.147.xx.xx</p>
             */
            public Builder gateWay(String gateWay) {
                this.gateWay = gateWay;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>119.147.xx.xx</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
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
             * <p>Details of the private IP addresses.</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PublicIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PublicIpAddressesPublicIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GateWay")
        private String gateWay;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Isp")
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
             * <p>The gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>119.147.xx.xx</p>
             */
            public Builder gateWay(String gateWay) {
                this.gateWay = gateWay;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>119.147.xx.xx</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP).</p>
             * 
             * <strong>example:</strong>
             * <p>unicom</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PublicIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class SecurityGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("device_type")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("disk_type")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("storage")
        private Integer storage;

        @com.aliyun.core.annotation.NameInMap("uuid")
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
             * <p>The category of the cloud disk or local disk. Valid values:</p>
             * <ul>
             * <li><strong>file</strong>: local disk.</li>
             * <li><strong>pangu</strong>: ultra disk.</li>
             * <li><strong>local_hdd</strong>: local HDD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The ID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-5ip4c2dhmas0rn7rt0p9****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The name of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>DiskName</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>51200</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The extended field of the disk category. Valid values:</p>
             * <ul>
             * <li><strong>file</strong>: local disk.</li>
             * <li><strong>pangu</strong>: ultra disk.</li>
             * <li><strong>local_hdd</strong>: local HDD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pangu</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The type of the cloud disk or local disk. Valid values:</p>
             * <ul>
             * <li><strong>system</strong>: system disk.</li>
             * <li><strong>data</strong>: data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The name of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>DiskName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20480</p>
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The UUID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-5ip4c2dhmas0rn7rt0p96****</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class InstanceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private InstanceTags(Builder builder) {
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTags create() {
            return builder().build();
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List < Tags> tags; 

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public InstanceTags build() {
                return new InstanceTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private InstanceDataDisk dataDisk;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InnerIpAddress")
        private InnerIpAddress innerIpAddress;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceResourceType")
        private String instanceResourceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("NetworkAttributes")
        private NetworkAttributes networkAttributes;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaces")
        private InstanceNetworkInterfaces networkInterfaces;

        @com.aliyun.core.annotation.NameInMap("OSName")
        private String OSName;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddresses")
        private PrivateIpAddresses privateIpAddresses;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private PublicIpAddress publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddresses")
        private PublicIpAddresses publicIpAddresses;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SystemDisk")
        private SystemDisk systemDisk;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private InstanceTags tags;

        private Instance(Builder builder) {
            this.autoReleaseTime = builder.autoReleaseTime;
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
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.keyPairName = builder.keyPairName;
            this.memory = builder.memory;
            this.networkAttributes = builder.networkAttributes;
            this.networkInterfaces = builder.networkInterfaces;
            this.OSName = builder.OSName;
            this.privateIpAddresses = builder.privateIpAddresses;
            this.publicIpAddress = builder.publicIpAddress;
            this.publicIpAddresses = builder.publicIpAddresses;
            this.securityGroupIds = builder.securityGroupIds;
            this.specName = builder.specName;
            this.spotStrategy = builder.spotStrategy;
            this.status = builder.status;
            this.systemDisk = builder.systemDisk;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
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
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
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
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
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
         * @return networkInterfaces
         */
        public InstanceNetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
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
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
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

        /**
         * @return tags
         */
        public InstanceTags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String autoReleaseTime; 
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
            private String instanceTypeFamily; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private String keyPairName; 
            private Integer memory; 
            private NetworkAttributes networkAttributes; 
            private InstanceNetworkInterfaces networkInterfaces; 
            private String OSName; 
            private PrivateIpAddresses privateIpAddresses; 
            private PublicIpAddress publicIpAddress; 
            private PublicIpAddresses publicIpAddresses; 
            private SecurityGroupIds securityGroupIds; 
            private String specName; 
            private String spotStrategy; 
            private String status; 
            private SystemDisk systemDisk; 
            private InstanceTags tags; 

            /**
             * <p>The automatic release time of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-28T14:38:52Z</p>
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-26T06:40:43Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Details of the data disk.</p>
             */
            public Builder dataDisk(InstanceDataDisk dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * <p>The total size of the disk. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>71680</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-telecom</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The expiration time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2119-07-13T02:38:57Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The hostname of the instance.</p>
             * <ul>
             * <li>The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</li>
             * <li>For a Windows instance, the hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). The hostname cannot contain periods (.) or contain only digits.</li>
             * <li>For an instance that runs another operating system such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testHostName</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The private IP addresses of the instances.</p>
             */
            public Builder innerIpAddress(InnerIpAddress innerIpAddress) {
                this.innerIpAddress = innerIpAddress;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-instanc****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5itef0f28t17bcdw9deu6meub</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The category of the instance. Valid values:</p>
             * <ul>
             * <li>EnsInstance: ENS instances that you purchase.</li>
             * <li>EnsService: ENS instances that belong to edge services.</li>
             * <li>BuildMachine: ENS instances that are configured with image builders.</li>
             * <li>EnsPostPaidInstance: pay-as-you-go ENS instances that you purchase.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EnsService</p>
             */
            public Builder instanceResourceType(String instanceResourceType) {
                this.instanceResourceType = instanceResourceType;
                return this;
            }

            /**
             * <p>The instance family. Valid values:</p>
             * <ul>
             * <li>x86_vm: x86-based computing instance.</li>
             * <li>x86_pm: x86-based physical machine.</li>
             * <li>x86_bmi: x86-based bare metal instance.</li>
             * <li>x86_bm: bare metal instance with the SmartNIC.</li>
             * <li>pc_bmi: heterogeneous bare metal instance.</li>
             * <li>pc_vm: heterogeneous virtual machine.</li>
             * <li>arm_bmi: Arm-based computing instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x86_vm</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>The maximum outbound bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * <p>The minimum inbound bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The memory size. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Details of the network.</p>
             */
            public Builder networkAttributes(NetworkAttributes networkAttributes) {
                this.networkAttributes = networkAttributes;
                return this;
            }

            /**
             * NetworkInterfaces.
             */
            public Builder networkInterfaces(InstanceNetworkInterfaces networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos 6.8 x86_64</p>
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * <p>Details of the private IP addresses.</p>
             */
            public Builder privateIpAddresses(PrivateIpAddresses privateIpAddresses) {
                this.privateIpAddresses = privateIpAddresses;
                return this;
            }

            /**
             * <p>The public IP addresses of the instances.</p>
             */
            public Builder publicIpAddress(PublicIpAddress publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * <p>Details of the public IP addresses.</p>
             */
            public Builder publicIpAddresses(PublicIpAddresses publicIpAddresses) {
                this.publicIpAddresses = publicIpAddresses;
                return this;
            }

            /**
             * <p>The IDs of the security groups.</p>
             */
            public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ens.sn1.stiny</p>
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            /**
             * <p>The bidding policy of the preemptible instance.</p>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>Running</li>
             * <li>Expired</li>
             * <li>Stopped</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Details of the system disk.</p>
             */
            public Builder systemDisk(SystemDisk systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            /**
             * <p>The tags of the instance.</p>
             * <blockquote>
             * <p> This operation does not return tag information. You can call this operation in combination with the tag-related operations.</p>
             * </blockquote>
             */
            public Builder tags(InstanceTags tags) {
                this.tags = tags;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
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
