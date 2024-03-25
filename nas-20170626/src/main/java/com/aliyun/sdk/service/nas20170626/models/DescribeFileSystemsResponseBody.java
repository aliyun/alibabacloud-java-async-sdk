// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileSystemsResponseBody</p>
 */
public class DescribeFileSystemsResponseBody extends TeaModel {
    @NameInMap("FileSystems")
    private FileSystems fileSystems;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFileSystemsResponseBody(Builder builder) {
        this.fileSystems = builder.fileSystems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileSystemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileSystems
     */
    public FileSystems getFileSystems() {
        return this.fileSystems;
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
        private FileSystems fileSystems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried file systems.
         */
        public Builder fileSystems(FileSystems fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of file systems.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFileSystemsResponseBody build() {
            return new DescribeFileSystemsResponseBody(this);
        } 

    } 

    public static class Ldap extends TeaModel {
        @NameInMap("BindDN")
        private String bindDN;

        @NameInMap("SearchBase")
        private String searchBase;

        @NameInMap("URI")
        private String URI;

        private Ldap(Builder builder) {
            this.bindDN = builder.bindDN;
            this.searchBase = builder.searchBase;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ldap create() {
            return builder().build();
        }

        /**
         * @return bindDN
         */
        public String getBindDN() {
            return this.bindDN;
        }

        /**
         * @return searchBase
         */
        public String getSearchBase() {
            return this.searchBase;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String bindDN; 
            private String searchBase; 
            private String URI; 

            /**
             * An LDAP entry.
             */
            public Builder bindDN(String bindDN) {
                this.bindDN = bindDN;
                return this;
            }

            /**
             * An LDAP search base.
             */
            public Builder searchBase(String searchBase) {
                this.searchBase = searchBase;
                return this;
            }

            /**
             * An LDAP URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Ldap build() {
                return new Ldap(this);
            } 

        } 

    }
    public static class ClientMasterNode extends TeaModel {
        @NameInMap("DefaultPasswd")
        private String defaultPasswd;

        @NameInMap("EcsId")
        private String ecsId;

        @NameInMap("EcsIp")
        private String ecsIp;

        private ClientMasterNode(Builder builder) {
            this.defaultPasswd = builder.defaultPasswd;
            this.ecsId = builder.ecsId;
            this.ecsIp = builder.ecsIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientMasterNode create() {
            return builder().build();
        }

        /**
         * @return defaultPasswd
         */
        public String getDefaultPasswd() {
            return this.defaultPasswd;
        }

        /**
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
        }

        /**
         * @return ecsIp
         */
        public String getEcsIp() {
            return this.ecsIp;
        }

        public static final class Builder {
            private String defaultPasswd; 
            private String ecsId; 
            private String ecsIp; 

            /**
             * The default logon password of the ECS instance on the client management node.
             */
            public Builder defaultPasswd(String defaultPasswd) {
                this.defaultPasswd = defaultPasswd;
                return this;
            }

            /**
             * The ID of the ECS instance on the client management node.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * The IP address of the ECS instance on the client management node.
             */
            public Builder ecsIp(String ecsIp) {
                this.ecsIp = ecsIp;
                return this;
            }

            public ClientMasterNode build() {
                return new ClientMasterNode(this);
            } 

        } 

    }
    public static class ClientMasterNodes extends TeaModel {
        @NameInMap("ClientMasterNode")
        private java.util.List < ClientMasterNode> clientMasterNode;

        private ClientMasterNodes(Builder builder) {
            this.clientMasterNode = builder.clientMasterNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientMasterNodes create() {
            return builder().build();
        }

        /**
         * @return clientMasterNode
         */
        public java.util.List < ClientMasterNode> getClientMasterNode() {
            return this.clientMasterNode;
        }

        public static final class Builder {
            private java.util.List < ClientMasterNode> clientMasterNode; 

            /**
             * ClientMasterNode.
             */
            public Builder clientMasterNode(java.util.List < ClientMasterNode> clientMasterNode) {
                this.clientMasterNode = clientMasterNode;
                return this;
            }

            public ClientMasterNodes build() {
                return new ClientMasterNodes(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class MountTarget extends TeaModel {
        @NameInMap("AccessGroupName")
        private String accessGroupName;

        @NameInMap("ClientMasterNodes")
        private ClientMasterNodes clientMasterNodes;

        @NameInMap("DualStackMountTargetDomain")
        private String dualStackMountTargetDomain;

        @NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswId")
        private String vswId;

        private MountTarget(Builder builder) {
            this.accessGroupName = builder.accessGroupName;
            this.clientMasterNodes = builder.clientMasterNodes;
            this.dualStackMountTargetDomain = builder.dualStackMountTargetDomain;
            this.mountTargetDomain = builder.mountTargetDomain;
            this.networkType = builder.networkType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
            this.vswId = builder.vswId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTarget create() {
            return builder().build();
        }

        /**
         * @return accessGroupName
         */
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        /**
         * @return clientMasterNodes
         */
        public ClientMasterNodes getClientMasterNodes() {
            return this.clientMasterNodes;
        }

        /**
         * @return dualStackMountTargetDomain
         */
        public String getDualStackMountTargetDomain() {
            return this.dualStackMountTargetDomain;
        }

        /**
         * @return mountTargetDomain
         */
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        public static final class Builder {
            private String accessGroupName; 
            private ClientMasterNodes clientMasterNodes; 
            private String dualStackMountTargetDomain; 
            private String mountTargetDomain; 
            private String networkType; 
            private String status; 
            private Tags tags; 
            private String vpcId; 
            private String vswId; 

            /**
             * The name of the permission group that is attached to the mount target.
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * The information about client management nodes.
             * <p>
             * 
             * This parameter is available only for CPFS file systems.
             */
            public Builder clientMasterNodes(ClientMasterNodes clientMasterNodes) {
                this.clientMasterNodes = clientMasterNodes;
                return this;
            }

            /**
             * The dual-stack (IPv4 and IPv6) domain name of the mount target.
             * <p>
             * 
             * > Only Extreme NAS file systems that reside in the Chinese mainland support IPv6.
             */
            public Builder dualStackMountTargetDomain(String dualStackMountTargetDomain) {
                this.dualStackMountTargetDomain = dualStackMountTargetDomain;
                return this;
            }

            /**
             * The domain name of the mount target.
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * The network type. Valid value: vpc.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The status of the mount target.
             * <p>
             * 
             * Valid values:
             * 
             * *   Active: The mount target is available.
             * *   Inactive: The mount target is unavailable.
             * *   Pending: The mount target is being created or modified.
             * *   Deleting: The mount target is being deleted.
             * *   Hibernating: The mount target is being hibernated.
             * *   Hibernated: The mount target is hibernated.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags that are attached to the mount target.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            public MountTarget build() {
                return new MountTarget(this);
            } 

        } 

    }
    public static class MountTargets extends TeaModel {
        @NameInMap("MountTarget")
        private java.util.List < MountTarget> mountTarget;

        private MountTargets(Builder builder) {
            this.mountTarget = builder.mountTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTargets create() {
            return builder().build();
        }

        /**
         * @return mountTarget
         */
        public java.util.List < MountTarget> getMountTarget() {
            return this.mountTarget;
        }

        public static final class Builder {
            private java.util.List < MountTarget> mountTarget; 

            /**
             * MountTarget.
             */
            public Builder mountTarget(java.util.List < MountTarget> mountTarget) {
                this.mountTarget = mountTarget;
                return this;
            }

            public MountTargets build() {
                return new MountTargets(this);
            } 

        } 

    }
    public static class Package extends TeaModel {
        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("PackageId")
        private String packageId;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("Size")
        private Long size;

        @NameInMap("StartTime")
        private String startTime;

        private Package(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.packageId = builder.packageId;
            this.packageType = builder.packageType;
            this.size = builder.size;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Package create() {
            return builder().build();
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String expiredTime; 
            private String packageId; 
            private String packageType; 
            private Long size; 
            private String startTime; 

            /**
             * The end time of the validity period for the storage plan.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The ID of the storage plan.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * The type of the storage plan.
             * <p>
             * 
             * Valid values:
             * 
             * *   ssd: the storage plan for Performance NAS file systems
             * *   hybrid: the storage plan for Capacity NAS file systems
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * The capacity of the storage plan. Unit: bytes.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The start time of the validity period for the storage plan.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Package build() {
                return new Package(this);
            } 

        } 

    }
    public static class Packages extends TeaModel {
        @NameInMap("Package")
        private java.util.List < Package> _package;

        private Packages(Builder builder) {
            this._package = builder._package;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return _package
         */
        public java.util.List < Package> get_package() {
            return this._package;
        }

        public static final class Builder {
            private java.util.List < Package> _package; 

            /**
             * Package.
             */
            public Builder _package(java.util.List < Package> _package) {
                this._package = _package;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    public static class SupportedFeatures extends TeaModel {
        @NameInMap("SupportedFeature")
        private java.util.List < String > supportedFeature;

        private SupportedFeatures(Builder builder) {
            this.supportedFeature = builder.supportedFeature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedFeatures create() {
            return builder().build();
        }

        /**
         * @return supportedFeature
         */
        public java.util.List < String > getSupportedFeature() {
            return this.supportedFeature;
        }

        public static final class Builder {
            private java.util.List < String > supportedFeature; 

            /**
             * SupportedFeature.
             */
            public Builder supportedFeature(java.util.List < String > supportedFeature) {
                this.supportedFeature = supportedFeature;
                return this;
            }

            public SupportedFeatures build() {
                return new SupportedFeatures(this);
            } 

        } 

    }
    public static class TagsTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TagsTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagsTag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagsTag build() {
                return new TagsTag(this);
            } 

        } 

    }
    public static class FileSystemTags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < TagsTag> tag;

        private FileSystemTags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystemTags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < TagsTag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < TagsTag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < TagsTag> tag) {
                this.tag = tag;
                return this;
            }

            public FileSystemTags build() {
                return new FileSystemTags(this);
            } 

        } 

    }
    public static class FileSystem extends TeaModel {
        @NameInMap("AccessPointCount")
        private String accessPointCount;

        @NameInMap("Bandwidth")
        private Long bandwidth;

        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EncryptType")
        private Integer encryptType;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("FileSystemType")
        private String fileSystemType;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("Ldap")
        private Ldap ldap;

        @NameInMap("MeteredArchiveSize")
        private Long meteredArchiveSize;

        @NameInMap("MeteredIASize")
        private Long meteredIASize;

        @NameInMap("MeteredSize")
        private Long meteredSize;

        @NameInMap("MountTargets")
        private MountTargets mountTargets;

        @NameInMap("Packages")
        private Packages packages;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("SupportedFeatures")
        private SupportedFeatures supportedFeatures;

        @NameInMap("Tags")
        private FileSystemTags tags;

        @NameInMap("Version")
        private String version;

        @NameInMap("ZoneId")
        private String zoneId;

        private FileSystem(Builder builder) {
            this.accessPointCount = builder.accessPointCount;
            this.bandwidth = builder.bandwidth;
            this.capacity = builder.capacity;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.encryptType = builder.encryptType;
            this.expiredTime = builder.expiredTime;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemType = builder.fileSystemType;
            this.KMSKeyId = builder.KMSKeyId;
            this.ldap = builder.ldap;
            this.meteredArchiveSize = builder.meteredArchiveSize;
            this.meteredIASize = builder.meteredIASize;
            this.meteredSize = builder.meteredSize;
            this.mountTargets = builder.mountTargets;
            this.packages = builder.packages;
            this.protocolType = builder.protocolType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.supportedFeatures = builder.supportedFeatures;
            this.tags = builder.tags;
            this.version = builder.version;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystem create() {
            return builder().build();
        }

        /**
         * @return accessPointCount
         */
        public String getAccessPointCount() {
            return this.accessPointCount;
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encryptType
         */
        public Integer getEncryptType() {
            return this.encryptType;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return ldap
         */
        public Ldap getLdap() {
            return this.ldap;
        }

        /**
         * @return meteredArchiveSize
         */
        public Long getMeteredArchiveSize() {
            return this.meteredArchiveSize;
        }

        /**
         * @return meteredIASize
         */
        public Long getMeteredIASize() {
            return this.meteredIASize;
        }

        /**
         * @return meteredSize
         */
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        /**
         * @return mountTargets
         */
        public MountTargets getMountTargets() {
            return this.mountTargets;
        }

        /**
         * @return packages
         */
        public Packages getPackages() {
            return this.packages;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return supportedFeatures
         */
        public SupportedFeatures getSupportedFeatures() {
            return this.supportedFeatures;
        }

        /**
         * @return tags
         */
        public FileSystemTags getTags() {
            return this.tags;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accessPointCount; 
            private Long bandwidth; 
            private Long capacity; 
            private String chargeType; 
            private String createTime; 
            private String description; 
            private Integer encryptType; 
            private String expiredTime; 
            private String fileSystemId; 
            private String fileSystemType; 
            private String KMSKeyId; 
            private Ldap ldap; 
            private Long meteredArchiveSize; 
            private Long meteredIASize; 
            private Long meteredSize; 
            private MountTargets mountTargets; 
            private Packages packages; 
            private String protocolType; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private String storageType; 
            private SupportedFeatures supportedFeatures; 
            private FileSystemTags tags; 
            private String version; 
            private String zoneId; 

            /**
             * AccessPointCount.
             */
            public Builder accessPointCount(String accessPointCount) {
                this.accessPointCount = accessPointCount;
                return this;
            }

            /**
             * The bandwidth of the file system.
             * <p>
             * 
             * Unit: MB/s. This parameter is unavailable for General-purpose NAS file systems.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The capacity of the file system.
             * <p>
             * 
             * Unit: GiB.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The billing method.
             * <p>
             * 
             * Valid values:
             * 
             * *   Subscription: The subscription billing method is used.
             * *   PayAsYouGo: The pay-as-you-go billing method is used.
             * *   Package: A storage plan is attached to the file system.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The time when the file system was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the file system.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The encryption type.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: The data in the file system is not encrypted.
             * *   1: A NAS-managed key is used to encrypt the data in the file system.
             * *   2: A KMS-managed key is used to encrypt the data in the file system.
             */
            public Builder encryptType(Integer encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * The time when the file system expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The type of the file system.
             * <p>
             * 
             * Valid values:
             * 
             * *   standard: General-purpose NAS file system
             * *   extreme: Extreme NAS file system
             * *   cpfs: CPFS file system
             * 
             * > CPFS file systems are available only on the China site (aliyun.com).
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * The ID of the key that is managed by Key Management Service (KMS).
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The Lightweight Directory Access Protocol (LDAP) configurations.
             * <p>
             * 
             * This parameter is available only for CPFS file systems.
             */
            public Builder ldap(Ldap ldap) {
                this.ldap = ldap;
                return this;
            }

            /**
             * MeteredArchiveSize.
             */
            public Builder meteredArchiveSize(Long meteredArchiveSize) {
                this.meteredArchiveSize = meteredArchiveSize;
                return this;
            }

            /**
             * The storage usage of the Infrequent Access (IA) storage medium.
             * <p>
             * 
             * Unit: bytes.
             */
            public Builder meteredIASize(Long meteredIASize) {
                this.meteredIASize = meteredIASize;
                return this;
            }

            /**
             * The storage usage of the file system.
             * <p>
             * 
             * The value of this parameter is the maximum storage usage of the file system over the last hour. Unit: bytes.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * The information about mount targets.
             */
            public Builder mountTargets(MountTargets mountTargets) {
                this.mountTargets = mountTargets;
                return this;
            }

            /**
             * The information about storage plans.
             */
            public Builder packages(Packages packages) {
                this.packages = packages;
                return this;
            }

            /**
             * The protocol type of the file system.
             * <p>
             * 
             * Valid values:
             * 
             * *   NFS: Network File System (NFS)
             * *   SMB: Server Message Block (SMB)
             * *   cpfs: the protocol type supported by the CPFS file system
             * 
             * > CPFS file systems are available only on the China site (aliyun.com).
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the file system. Valid values:
             * <p>
             * 
             * *   Pending: The file system is being created or modified.
             * *   Running: The file system is available. Before you create a mount target for the file system, make sure that the file system is in the Running state.
             * *   Stopped: The file system is unavailable.
             * *   Extending: The file system is being scaled up.
             * *   Stopping: The file system is being stopped.
             * *   Deleting: The file system is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The storage type.
             * <p>
             * 
             * Valid values:
             * 
             * *   Valid values for General-purpose NAS file systems: Capacity and Performance.
             * *   Valid values for Extreme NAS file systems: standard and advance.
             * *   Valid values for CPFS file systems: advance\_100 (100 MB/s/TiB baseline) and advance\_200 (200 MB/s/TiB baseline).
             * 
             * > CPFS file systems are available only on the China site (aliyun.com).
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * The features that are supported by the file system.
             */
            public Builder supportedFeatures(SupportedFeatures supportedFeatures) {
                this.supportedFeatures = supportedFeatures;
                return this;
            }

            /**
             * The tags that are attached to the file system.
             */
            public Builder tags(FileSystemTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The version number of the file system.
             * <p>
             * 
             * This parameter is available only for Extreme NAS file systems.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * The ID of the zone where the file system resides.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public FileSystem build() {
                return new FileSystem(this);
            } 

        } 

    }
    public static class FileSystems extends TeaModel {
        @NameInMap("FileSystem")
        private java.util.List < FileSystem> fileSystem;

        private FileSystems(Builder builder) {
            this.fileSystem = builder.fileSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystems create() {
            return builder().build();
        }

        /**
         * @return fileSystem
         */
        public java.util.List < FileSystem> getFileSystem() {
            return this.fileSystem;
        }

        public static final class Builder {
            private java.util.List < FileSystem> fileSystem; 

            /**
             * FileSystem.
             */
            public Builder fileSystem(java.util.List < FileSystem> fileSystem) {
                this.fileSystem = fileSystem;
                return this;
            }

            public FileSystems build() {
                return new FileSystems(this);
            } 

        } 

    }
}
