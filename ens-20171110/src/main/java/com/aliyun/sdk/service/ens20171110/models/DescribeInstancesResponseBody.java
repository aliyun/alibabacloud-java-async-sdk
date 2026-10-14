// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstancesResponseBody model) {
            this.code = model.code;
            this.instances = model.instances;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business code returned. A value of 0 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The page number of the instance list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page that was specified in the request.</p>
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
         * <p>The total number of instances returned.</p>
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

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.category = model.category;
                this.diskId = model.diskId;
                this.diskName = model.diskName;
                this.diskSize = model.diskSize;
                this.encryptKeyId = model.encryptKeyId;
                this.encrypted = model.encrypted;
                this.size = model.size;
                this.deviceType = model.deviceType;
                this.diskType = model.diskType;
                this.name = model.name;
                this.storage = model.storage;
                this.uuid = model.uuid;
            } 

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
             * DiskSize.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class InstanceDataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List<DataDisk> dataDisk;

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
        public java.util.List<DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public static final class Builder {
            private java.util.List<DataDisk> dataDisk; 

            private Builder() {
            } 

            private Builder(InstanceDataDisk model) {
                this.dataDisk = model.dataDisk;
            } 

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
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
        private java.util.List<String> ipAddress;

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
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(InnerIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
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
        private java.util.List<String> ipAddress;

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
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(PrivateIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
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

            private Builder() {
            } 

            private Builder(NetworkAttributes model) {
                this.networkId = model.networkId;
                this.privateIpAddress = model.privateIpAddress;
                this.vSwitchId = model.vSwitchId;
            } 

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

            private Builder() {
            } 

            private Builder(Ipv6Set model) {
                this.ipv6Address = model.ipv6Address;
            } 

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
        private java.util.List<Ipv6Set> ipv6Set;

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
        public java.util.List<Ipv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

        public static final class Builder {
            private java.util.List<Ipv6Set> ipv6Set; 

            private Builder() {
            } 

            private Builder(Ipv6Sets model) {
                this.ipv6Set = model.ipv6Set;
            } 

            /**
             * Ipv6Set.
             */
            public Builder ipv6Set(java.util.List<Ipv6Set> ipv6Set) {
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

            private Builder() {
            } 

            private Builder(PrivateIpSet model) {
                this.primary = model.primary;
                this.privateIpAddress = model.privateIpAddress;
            } 

            /**
             * Primary.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * PrivateIpAddress.
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
        private java.util.List<PrivateIpSet> privateIpSet;

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
        public java.util.List<PrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

        public static final class Builder {
            private java.util.List<PrivateIpSet> privateIpSet; 

            private Builder() {
            } 

            private Builder(PrivateIpSets model) {
                this.privateIpSet = model.privateIpSet;
            } 

            /**
             * PrivateIpSet.
             */
            public Builder privateIpSet(java.util.List<PrivateIpSet> privateIpSet) {
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

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("VpdVSwitchId")
        private String vpdVSwitchId;

        private NetworkInterfaces(Builder builder) {
            this.ipv6Sets = builder.ipv6Sets;
            this.macAddress = builder.macAddress;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.privateIpSets = builder.privateIpSets;
            this.type = builder.type;
            this.vpdId = builder.vpdId;
            this.vpdVSwitchId = builder.vpdVSwitchId;
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

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return vpdVSwitchId
         */
        public String getVpdVSwitchId() {
            return this.vpdVSwitchId;
        }

        public static final class Builder {
            private Ipv6Sets ipv6Sets; 
            private String macAddress; 
            private String networkInterfaceId; 
            private String primaryIpAddress; 
            private PrivateIpSets privateIpSets; 
            private String type; 
            private String vpdId; 
            private String vpdVSwitchId; 

            private Builder() {
            } 

            private Builder(NetworkInterfaces model) {
                this.ipv6Sets = model.ipv6Sets;
                this.macAddress = model.macAddress;
                this.networkInterfaceId = model.networkInterfaceId;
                this.primaryIpAddress = model.primaryIpAddress;
                this.privateIpSets = model.privateIpSets;
                this.type = model.type;
                this.vpdId = model.vpdId;
                this.vpdVSwitchId = model.vpdVSwitchId;
            } 

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

            /**
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * VpdVSwitchId.
             */
            public Builder vpdVSwitchId(String vpdVSwitchId) {
                this.vpdVSwitchId = vpdVSwitchId;
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
        private java.util.List<NetworkInterfaces> networkInterfaces;

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
        public java.util.List<NetworkInterfaces> getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        public static final class Builder {
            private java.util.List<NetworkInterfaces> networkInterfaces; 

            private Builder() {
            } 

            private Builder(InstanceNetworkInterfaces model) {
                this.networkInterfaces = model.networkInterfaces;
            } 

            /**
             * NetworkInterfaces.
             */
            public Builder networkInterfaces(java.util.List<NetworkInterfaces> networkInterfaces) {
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

            private Builder() {
            } 

            private Builder(PrivateIpAddressesPrivateIpAddress model) {
                this.gateWay = model.gateWay;
                this.ip = model.ip;
                this.isp = model.isp;
            } 

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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private java.util.List<PrivateIpAddressesPrivateIpAddress> privateIpAddress;

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
        public java.util.List<PrivateIpAddressesPrivateIpAddress> getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private java.util.List<PrivateIpAddressesPrivateIpAddress> privateIpAddress; 

            private Builder() {
            } 

            private Builder(PrivateIpAddresses model) {
                this.privateIpAddress = model.privateIpAddress;
            } 

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(java.util.List<PrivateIpAddressesPrivateIpAddress> privateIpAddress) {
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
        private java.util.List<String> ipAddress;

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
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(PublicIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
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

            private Builder() {
            } 

            private Builder(PublicIpAddressesPublicIpAddress model) {
                this.gateWay = model.gateWay;
                this.ip = model.ip;
                this.isp = model.isp;
            } 

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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PublicIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private java.util.List<PublicIpAddressesPublicIpAddress> publicIpAddress;

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
        public java.util.List<PublicIpAddressesPublicIpAddress> getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public static final class Builder {
            private java.util.List<PublicIpAddressesPublicIpAddress> publicIpAddress; 

            private Builder() {
            } 

            private Builder(PublicIpAddresses model) {
                this.publicIpAddress = model.publicIpAddress;
            } 

            /**
             * PublicIpAddress.
             */
            public Builder publicIpAddress(java.util.List<PublicIpAddressesPublicIpAddress> publicIpAddress) {
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
        private java.util.List<String> securityGroupId;

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
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List<String> securityGroupId; 

            private Builder() {
            } 

            private Builder(SecurityGroupIds model) {
                this.securityGroupId = model.securityGroupId;
            } 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List<String> securityGroupId) {
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

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.category = model.category;
                this.diskId = model.diskId;
                this.diskName = model.diskName;
                this.size = model.size;
                this.deviceType = model.deviceType;
                this.diskType = model.diskType;
                this.name = model.name;
                this.storage = model.storage;
                this.uuid = model.uuid;
            } 

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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(InstanceTags model) {
                this.tags = model.tags;
            } 

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
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

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

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

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

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
            this.deletionProtection = builder.deletionProtection;
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
            this.serviceStatus = builder.serviceStatus;
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
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
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
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
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
            private Boolean deletionProtection; 
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
            private String serviceStatus; 
            private String specName; 
            private String spotStrategy; 
            private String status; 
            private SystemDisk systemDisk; 
            private InstanceTags tags; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.autoReleaseTime = model.autoReleaseTime;
                this.cpu = model.cpu;
                this.creationTime = model.creationTime;
                this.dataDisk = model.dataDisk;
                this.deletionProtection = model.deletionProtection;
                this.disk = model.disk;
                this.ensRegionId = model.ensRegionId;
                this.expiredTime = model.expiredTime;
                this.hostName = model.hostName;
                this.imageId = model.imageId;
                this.innerIpAddress = model.innerIpAddress;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceResourceType = model.instanceResourceType;
                this.instanceTypeFamily = model.instanceTypeFamily;
                this.internetMaxBandwidthIn = model.internetMaxBandwidthIn;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.keyPairName = model.keyPairName;
                this.memory = model.memory;
                this.networkAttributes = model.networkAttributes;
                this.networkInterfaces = model.networkInterfaces;
                this.OSName = model.OSName;
                this.privateIpAddresses = model.privateIpAddresses;
                this.publicIpAddress = model.publicIpAddress;
                this.publicIpAddresses = model.publicIpAddresses;
                this.securityGroupIds = model.securityGroupIds;
                this.serviceStatus = model.serviceStatus;
                this.specName = model.specName;
                this.spotStrategy = model.spotStrategy;
                this.status = model.status;
                this.systemDisk = model.systemDisk;
                this.tags = model.tags;
            } 

            /**
             * AutoReleaseTime.
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

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
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
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
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
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
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
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
             * NetworkInterfaces.
             */
            public Builder networkInterfaces(InstanceNetworkInterfaces networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
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
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
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
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
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

            /**
             * Tags.
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
        private java.util.List<Instance> instance;

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
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instance = model.instance;
            } 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
