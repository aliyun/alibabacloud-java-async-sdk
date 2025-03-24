// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeNASFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNASFileSystemsResponseBody</p>
 */
public class DescribeNASFileSystemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystems")
    private java.util.List<FileSystems> fileSystems;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNASFileSystemsResponseBody(Builder builder) {
        this.fileSystems = builder.fileSystems;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNASFileSystemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileSystems
     */
    public java.util.List<FileSystems> getFileSystems() {
        return this.fileSystems;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FileSystems> fileSystems; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>Details about the NAS file systems.</p>
         */
        public Builder fileSystems(java.util.List<FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * <p>The token that determines the start point of the next query. This parameter is empty if no additional results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNASFileSystemsResponseBody build() {
            return new DescribeNASFileSystemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNASFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNASFileSystemsResponseBody</p>
     */
    public static class AppInstanceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
        private String appInstanceGroupName;

        private AppInstanceGroups(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceGroupName = builder.appInstanceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstanceGroups create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceGroupName
         */
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String appInstanceGroupName; 

            /**
             * <p>The ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-0bz55ibznu9p7****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The name of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoDeliveryGroup</p>
             */
            public Builder appInstanceGroupName(String appInstanceGroupName) {
                this.appInstanceGroupName = appInstanceGroupName;
                return this;
            }

            public AppInstanceGroups build() {
                return new AppInstanceGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNASFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNASFileSystemsResponseBody</p>
     */
    public static class DesktopGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupName")
        private String desktopGroupName;

        private DesktopGroups(Builder builder) {
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopGroupName = builder.desktopGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopGroups create() {
            return builder().build();
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        /**
         * @return desktopGroupName
         */
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        public static final class Builder {
            private String desktopGroupId; 
            private String desktopGroupName; 

            /**
             * <p>The ID of the desktop group.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-9eeyf15b25nyl****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The name of the desktop group.</p>
             * 
             * <strong>example:</strong>
             * <p>test_dg</p>
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            public DesktopGroups build() {
                return new DesktopGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNASFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNASFileSystemsResponseBody</p>
     */
    public static class OfficeSites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        private OfficeSites(Builder builder) {
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfficeSites create() {
            return builder().build();
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public static final class Builder {
            private String officeSiteId; 
            private String officeSiteName; 

            /**
             * <p>The ID of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The name of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoOfficeNetwork</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            public OfficeSites build() {
                return new OfficeSites(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNASFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNASFileSystemsResponseBody</p>
     */
    public static class FileSystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowOperateUserDrive")
        private Boolean allowOperateUserDrive;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroups")
        private java.util.List<AppInstanceGroups> appInstanceGroups;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesktopGroups")
        private java.util.List<DesktopGroups> desktopGroups;

        @com.aliyun.core.annotation.NameInMap("EncryptionEnabled")
        private Boolean encryptionEnabled;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemName")
        private String fileSystemName;

        @com.aliyun.core.annotation.NameInMap("FileSystemStatus")
        private String fileSystemStatus;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("MeteredSize")
        private Long meteredSize;

        @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("MountTargetStatus")
        private String mountTargetStatus;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSites")
        private java.util.List<OfficeSites> officeSites;

        @com.aliyun.core.annotation.NameInMap("ProfileCompatible")
        private Boolean profileCompatible;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("SupportAcl")
        private Boolean supportAcl;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private FileSystems(Builder builder) {
            this.allowOperateUserDrive = builder.allowOperateUserDrive;
            this.appInstanceGroups = builder.appInstanceGroups;
            this.capacity = builder.capacity;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.desktopGroups = builder.desktopGroups;
            this.encryptionEnabled = builder.encryptionEnabled;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemName = builder.fileSystemName;
            this.fileSystemStatus = builder.fileSystemStatus;
            this.fileSystemType = builder.fileSystemType;
            this.meteredSize = builder.meteredSize;
            this.mountTargetDomain = builder.mountTargetDomain;
            this.mountTargetStatus = builder.mountTargetStatus;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSites = builder.officeSites;
            this.profileCompatible = builder.profileCompatible;
            this.regionId = builder.regionId;
            this.scene = builder.scene;
            this.storageType = builder.storageType;
            this.supportAcl = builder.supportAcl;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystems create() {
            return builder().build();
        }

        /**
         * @return allowOperateUserDrive
         */
        public Boolean getAllowOperateUserDrive() {
            return this.allowOperateUserDrive;
        }

        /**
         * @return appInstanceGroups
         */
        public java.util.List<AppInstanceGroups> getAppInstanceGroups() {
            return this.appInstanceGroups;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
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
         * @return desktopGroups
         */
        public java.util.List<DesktopGroups> getDesktopGroups() {
            return this.desktopGroups;
        }

        /**
         * @return encryptionEnabled
         */
        public Boolean getEncryptionEnabled() {
            return this.encryptionEnabled;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return fileSystemName
         */
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        /**
         * @return fileSystemStatus
         */
        public String getFileSystemStatus() {
            return this.fileSystemStatus;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        /**
         * @return meteredSize
         */
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        /**
         * @return mountTargetDomain
         */
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        /**
         * @return mountTargetStatus
         */
        public String getMountTargetStatus() {
            return this.mountTargetStatus;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        /**
         * @return officeSites
         */
        public java.util.List<OfficeSites> getOfficeSites() {
            return this.officeSites;
        }

        /**
         * @return profileCompatible
         */
        public Boolean getProfileCompatible() {
            return this.profileCompatible;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return supportAcl
         */
        public Boolean getSupportAcl() {
            return this.supportAcl;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean allowOperateUserDrive; 
            private java.util.List<AppInstanceGroups> appInstanceGroups; 
            private Long capacity; 
            private String createTime; 
            private String description; 
            private java.util.List<DesktopGroups> desktopGroups; 
            private Boolean encryptionEnabled; 
            private String fileSystemId; 
            private String fileSystemName; 
            private String fileSystemStatus; 
            private String fileSystemType; 
            private Long meteredSize; 
            private String mountTargetDomain; 
            private String mountTargetStatus; 
            private String officeSiteId; 
            private String officeSiteName; 
            private java.util.List<OfficeSites> officeSites; 
            private Boolean profileCompatible; 
            private String regionId; 
            private String scene; 
            private String storageType; 
            private Boolean supportAcl; 
            private String zoneId; 

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             */
            public Builder allowOperateUserDrive(Boolean allowOperateUserDrive) {
                this.allowOperateUserDrive = allowOperateUserDrive;
                return this;
            }

            /**
             * <p>The array of the app steaming delivery groups bound with UPM-supported NAS.</p>
             */
            public Builder appInstanceGroups(java.util.List<AppInstanceGroups> appInstanceGroups) {
                this.appInstanceGroups = appInstanceGroups;
                return this;
            }

            /**
             * <p>The total capacity of the NAS file system. Unit: GiB.</p>
             * <ul>
             * <li>The Capacity type has 10 PiB of storage, which is equal to 10,485,760 GiB.</li>
             * <li>The Performance type has 1 PiB of storage, which is equal to 1,048,576 GiB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10485760</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The time when the NAS file system was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-10T11:39Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the NAS file system.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The desktop groups that are associated with the NAS file systems that support the UPM feature.</p>
             */
            public Builder desktopGroups(java.util.List<DesktopGroups> desktopGroups) {
                this.desktopGroups = desktopGroups;
                return this;
            }

            /**
             * <p>Indicates whether disk encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encryptionEnabled(Boolean encryptionEnabled) {
                this.encryptionEnabled = encryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the NAS file system.</p>
             * 
             * <strong>example:</strong>
             * <p>04f314****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The name of the NAS file system.</p>
             * 
             * <strong>example:</strong>
             * <p>testNAS</p>
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * <p>The status of the NAS file system. The possible values include:</p>
             * <ul>
             * <li>Pending: The NAS file system is being created.</li>
             * <li>Running: The NAS file system is running.</li>
             * <li>Stopped: The NAS file system is stopped.</li>
             * <li>Deleting: The NAS file system is being deleted.</li>
             * <li>Deleted: The NAS file system is deleted.</li>
             * <li>Invalid: The NAS file system is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder fileSystemStatus(String fileSystemStatus) {
                this.fileSystemStatus = fileSystemStatus;
                return this;
            }

            /**
             * <p>The type of the NAS file system. Valid value: Universal NAS. This value indicates that the NAS file system is a General-purpose one.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * <p>The used storage of the NAS file system. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * <p>The domain name of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>04f314****-at***.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * <p>The status of the mount target. The possible values include:</p>
             * <ul>
             * <li>Pending: The mount target is being created.</li>
             * <li>Active: The mount target is enabled.</li>
             * <li>Inactive: The mount target is disabled.</li>
             * <li>Deleting: The mount target is being deleted.</li>
             * <li>Invalid: The mount target is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder mountTargetStatus(String mountTargetStatus) {
                this.mountTargetStatus = mountTargetStatus;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The array of office networks.</p>
             */
            public Builder officeSites(java.util.List<OfficeSites> officeSites) {
                this.officeSites = officeSites;
                return this;
            }

            /**
             * <p>Indicates whether the User Profile Management (UPM) feature is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder profileCompatible(Boolean profileCompatible) {
                this.profileCompatible = profileCompatible;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The storage type of the NAS file system. Valid values:</p>
             * <ul>
             * <li>Upm: UPM NAS</li>
             * <li>ShareNas: Shared NAS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Upm</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The storage type of the NAS file system. Valid values:</p>
             * <ul>
             * <li>Capacity</li>
             * <li>Performance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Capacity</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>Indicates whether the Server Message Block (SMB) access control list (ACL) feature was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportAcl(Boolean supportAcl) {
                this.supportAcl = supportAcl;
                return this;
            }

            /**
             * <p>The ID of the zone where the NAS file system resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-f</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public FileSystems build() {
                return new FileSystems(this);
            } 

        } 

    }
}
