// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileSystemsResponseBody</p>
 */
public class DescribeFileSystemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystems")
    private FileSystems fileSystems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The queried file systems.</p>
         */
        public Builder fileSystems(FileSystems fileSystems) {
            this.fileSystems = fileSystems;
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
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>035B3A3A-E514-4B41-B906-5D906CFB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFileSystemsResponseBody build() {
            return new DescribeFileSystemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class Ldap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindDN")
        private String bindDN;

        @com.aliyun.core.annotation.NameInMap("SearchBase")
        private String searchBase;

        @com.aliyun.core.annotation.NameInMap("URI")
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
             * <p>An LDAP entry.</p>
             * 
             * <strong>example:</strong>
             * <p>cn=alibaba,dc=com</p>
             */
            public Builder bindDN(String bindDN) {
                this.bindDN = bindDN;
                return this;
            }

            /**
             * <p>An LDAP search base.</p>
             * 
             * <strong>example:</strong>
             * <p>dc=example</p>
             */
            public Builder searchBase(String searchBase) {
                this.searchBase = searchBase;
                return this;
            }

            /**
             * <p>An LDAP URI.</p>
             * 
             * <strong>example:</strong>
             * <p>ldap://ldap.example.example</p>
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class ClientMasterNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultPasswd")
        private String defaultPasswd;

        @com.aliyun.core.annotation.NameInMap("EcsId")
        private String ecsId;

        @com.aliyun.core.annotation.NameInMap("EcsIp")
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
             * <p>The default logon password of the ECS instance on the client management node.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder defaultPasswd(String defaultPasswd) {
                this.defaultPasswd = defaultPasswd;
                return this;
            }

            /**
             * <p>The ID of the ECS instance on the client management node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hp3i3odi5ory1buo****</p>
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * <p>The IP address of the ECS instance on the client management node.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0</p>
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class ClientMasterNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientMasterNode")
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test-value</p>
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class MountTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroupName")
        private String accessGroupName;

        @com.aliyun.core.annotation.NameInMap("ClientMasterNodes")
        private ClientMasterNodes clientMasterNodes;

        @com.aliyun.core.annotation.NameInMap("DualStackMountTargetDomain")
        private String dualStackMountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswId")
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
             * <p>The name of the permission group that is attached to the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>test-001</p>
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * <p>The information about client management nodes.</p>
             * <p>This parameter is available only for CPFS file systems.</p>
             */
            public Builder clientMasterNodes(ClientMasterNodes clientMasterNodes) {
                this.clientMasterNodes = clientMasterNodes;
                return this;
            }

            /**
             * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
             * <blockquote>
             * <p>Only Extreme NAS file systems that reside in the Chinese mainland support IPv6.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>174494b666-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder dualStackMountTargetDomain(String dualStackMountTargetDomain) {
                this.dualStackMountTargetDomain = dualStackMountTargetDomain;
                return this;
            }

            /**
             * <p>The domain name of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>109c042666-w****.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * <p>The network type. Valid value: vpc.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The status of the mount target.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Active: The mount target is available.</li>
             * <li>Inactive: The mount target is unavailable.</li>
             * <li>Pending: The mount target is being processed.</li>
             * <li>Deleting: The mount target is being deleted.</li>
             * <li>Hibernating: The mount target is being hibernated.</li>
             * <li>Hibernated: The mount target is hibernated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags that are attached to the mount target.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1sevsgtqvk5gxbl****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1omfzsszekkvaxn****</p>
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class MountTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountTarget")
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableOplock")
        private Boolean enableOplock;

        private Options(Builder builder) {
            this.enableOplock = builder.enableOplock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return enableOplock
         */
        public Boolean getEnableOplock() {
            return this.enableOplock;
        }

        public static final class Builder {
            private Boolean enableOplock; 

            /**
             * <p>Specifies whether to enable the oplock feature. Valid values:</p>
             * <ul>
             * <li>true: enables the feature.</li>
             * <li>false: disables the feature.</li>
             * </ul>
             * <blockquote>
             * <p> Only Server Message Block (SMB) file systems support this feature.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOplock(Boolean enableOplock) {
                this.enableOplock = enableOplock;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class Package extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * <p>The end time of the validity period for the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-05T16:00:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The ID of the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>naspackage-0be9c4b624-37****</p>
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * <p>The type of the storage plan.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ssd: the storage plan for Performance NAS file systems.</li>
             * <li>hybrid: the storage plan for Capacity NAS file systems.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hybrid</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The capacity of the storage plan. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>107374182400</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The start time of the validity period for the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-05T01:40:56Z</p>
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Package")
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class SupportedFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedFeature")
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class TagsTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test-value</p>
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class FileSystemTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class VswIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VswId")
        private java.util.List < String > vswId;

        private VswIds(Builder builder) {
            this.vswId = builder.vswId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VswIds create() {
            return builder().build();
        }

        /**
         * @return vswId
         */
        public java.util.List < String > getVswId() {
            return this.vswId;
        }

        public static final class Builder {
            private java.util.List < String > vswId; 

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1omfzsszekkvaxn****</p>
             */
            public Builder vswId(java.util.List < String > vswId) {
                this.vswId = vswId;
                return this;
            }

            public VswIds build() {
                return new VswIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class FileSystem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointCount")
        private String accessPointCount;

        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private Integer encryptType;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("Ldap")
        private Ldap ldap;

        @com.aliyun.core.annotation.NameInMap("MeteredArchiveSize")
        private Long meteredArchiveSize;

        @com.aliyun.core.annotation.NameInMap("MeteredIASize")
        private Long meteredIASize;

        @com.aliyun.core.annotation.NameInMap("MeteredSize")
        private Long meteredSize;

        @com.aliyun.core.annotation.NameInMap("MountTargets")
        private MountTargets mountTargets;

        @com.aliyun.core.annotation.NameInMap("Options")
        private Options options;

        @com.aliyun.core.annotation.NameInMap("Packages")
        private Packages packages;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("QuorumVswId")
        private String quorumVswId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("SupportedFeatures")
        private SupportedFeatures supportedFeatures;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private FileSystemTags tags;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswIds")
        private VswIds vswIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private FileSystem(Builder builder) {
            this.accessPointCount = builder.accessPointCount;
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
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
            this.options = builder.options;
            this.packages = builder.packages;
            this.protocolType = builder.protocolType;
            this.quorumVswId = builder.quorumVswId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.supportedFeatures = builder.supportedFeatures;
            this.tags = builder.tags;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
            this.vswIds = builder.vswIds;
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
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
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
         * @return options
         */
        public Options getOptions() {
            return this.options;
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
         * @return quorumVswId
         */
        public String getQuorumVswId() {
            return this.quorumVswId;
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
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswIds
         */
        public VswIds getVswIds() {
            return this.vswIds;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accessPointCount; 
            private String autoSnapshotPolicyId; 
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
            private Options options; 
            private Packages packages; 
            private String protocolType; 
            private String quorumVswId; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private String storageType; 
            private SupportedFeatures supportedFeatures; 
            private FileSystemTags tags; 
            private String version; 
            private String vpcId; 
            private VswIds vswIds; 
            private String zoneId; 

            /**
             * <p>Number of access points.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder accessPointCount(String accessPointCount) {
                this.accessPointCount = accessPointCount;
                return this;
            }

            /**
             * AutoSnapshotPolicyId.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>The bandwidth of the file system.</p>
             * <p>Unit: MB/s. This parameter is unavailable for General-purpose NAS file systems.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The capacity of the file system.</p>
             * <p>Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Subscription: The subscription billing method is used.</li>
             * <li>PayAsYouGo: The pay-as-you-go billing method is used.</li>
             * <li>Package: A storage plan is attached to the file system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the file system was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-05T16:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The encryption type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: The data in the file system is not encrypted.</li>
             * <li>1: A NAS-managed key is used to encrypt the data in the file system.</li>
             * <li>2: A KMS-managed key is used to encrypt the data in the file system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder encryptType(Integer encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * <p>The time when the file system expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-05T16:00:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>109c04****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The type of the file system.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>standard: General-purpose NAS file system</li>
             * <li>extreme: Extreme NAS file system</li>
             * <li>cpfs: CPFS file system<blockquote>
             * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * <p>The ID of the key that is managed by Key Management Service (KMS).</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The Lightweight Directory Access Protocol (LDAP) configurations.</p>
             * <p>This parameter is available only for CPFS file systems.</p>
             */
            public Builder ldap(Ldap ldap) {
                this.ldap = ldap;
                return this;
            }

            /**
             * <p>Archive storage usage.</p>
             * <p>Unit: Byte.</p>
             * 
             * <strong>example:</strong>
             * <p>1611661312</p>
             */
            public Builder meteredArchiveSize(Long meteredArchiveSize) {
                this.meteredArchiveSize = meteredArchiveSize;
                return this;
            }

            /**
             * <p>The storage usage of the Infrequent Access (IA) storage medium.</p>
             * <p>Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>362832</p>
             */
            public Builder meteredIASize(Long meteredIASize) {
                this.meteredIASize = meteredIASize;
                return this;
            }

            /**
             * <p>The storage usage of the file system.</p>
             * <p>The value of this parameter is the maximum storage usage of the file system over the last hour. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1611661312</p>
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * <p>The information about mount targets.</p>
             */
            public Builder mountTargets(MountTargets mountTargets) {
                this.mountTargets = mountTargets;
                return this;
            }

            /**
             * <p>The options.</p>
             */
            public Builder options(Options options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The information about storage plans.</p>
             */
            public Builder packages(Packages packages) {
                this.packages = packages;
                return this;
            }

            /**
             * <p>The protocol type of the file system.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>NFS: Network File System (NFS)</li>
             * <li>SMB: Server Message Block (SMB)</li>
             * <li>cpfs: the protocol type supported by the CPFS file system</li>
             * </ul>
             * <blockquote>
             * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>NFS</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * QuorumVswId.
             */
            public Builder quorumVswId(String quorumVswId) {
                this.quorumVswId = quorumVswId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * <p>You can log on to the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a> to view resource group IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmwavnfdf****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the file system. Valid values:</p>
             * <ul>
             * <li>Pending: The file system is being created or modified.</li>
             * <li>Running: The file system is available. Before you create a mount target for the file system, make sure that the file system is in the Running state.</li>
             * <li>Stopped: The file system is unavailable.</li>
             * <li>Extending: The file system is being scaled up.</li>
             * <li>Stopping: The file system is being stopped.</li>
             * <li>Deleting: The file system is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Valid values for General-purpose NAS file systems: Capacity,Premium and Performance.</li>
             * <li>Valid values for Extreme NAS file systems: standard and advance.</li>
             * <li>Valid values for CPFS file systems: advance_100 (100 MB/s/TiB baseline) and advance_200 (200 MB/s/TiB baseline).<blockquote>
             * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Performance</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The features that are supported by the file system.</p>
             */
            public Builder supportedFeatures(SupportedFeatures supportedFeatures) {
                this.supportedFeatures = supportedFeatures;
                return this;
            }

            /**
             * <p>The tags that are attached to the file system.</p>
             */
            public Builder tags(FileSystemTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The version number of the file system.</p>
             * <p>This parameter is available only for Extreme NAS file systems and CPFS file systems.</p>
             * 
             * <strong>example:</strong>
             * <p>2.3.4</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1sevsgtqvk5gxbl****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswIds.
             */
            public Builder vswIds(VswIds vswIds) {
                this.vswIds = vswIds;
                return this;
            }

            /**
             * <p>The ID of the zone where the file system resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class FileSystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystem")
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
