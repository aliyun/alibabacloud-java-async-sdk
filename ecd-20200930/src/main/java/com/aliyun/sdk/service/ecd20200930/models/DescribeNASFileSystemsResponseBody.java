// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNASFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNASFileSystemsResponseBody</p>
 */
public class DescribeNASFileSystemsResponseBody extends TeaModel {
    @NameInMap("FileSystems")
    private java.util.List < FileSystems> fileSystems;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
    public java.util.List < FileSystems> getFileSystems() {
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
        private java.util.List < FileSystems> fileSystems; 
        private String nextToken; 
        private String requestId; 

        /**
         * Details about the NAS file systems.
         */
        public Builder fileSystems(java.util.List < FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * The token that determines the start point of the next query. This parameter is empty if no additional results exist.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNASFileSystemsResponseBody build() {
            return new DescribeNASFileSystemsResponseBody(this);
        } 

    } 

    public static class DesktopGroups extends TeaModel {
        @NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @NameInMap("DesktopGroupName")
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
             * The ID of the desktop group.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * The name of the desktop group.
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
    public static class FileSystems extends TeaModel {
        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DesktopGroups")
        private java.util.List < DesktopGroups> desktopGroups;

        @NameInMap("EncryptionEnabled")
        private Boolean encryptionEnabled;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("FileSystemName")
        private String fileSystemName;

        @NameInMap("FileSystemStatus")
        private String fileSystemStatus;

        @NameInMap("FileSystemType")
        private String fileSystemType;

        @NameInMap("MeteredSize")
        private Long meteredSize;

        @NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @NameInMap("MountTargetStatus")
        private String mountTargetStatus;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteName")
        private String officeSiteName;

        @NameInMap("ProfileCompatible")
        private Boolean profileCompatible;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("SupportAcl")
        private Boolean supportAcl;

        @NameInMap("ZoneId")
        private String zoneId;

        private FileSystems(Builder builder) {
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
            this.profileCompatible = builder.profileCompatible;
            this.regionId = builder.regionId;
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
        public java.util.List < DesktopGroups> getDesktopGroups() {
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
            private Long capacity; 
            private String createTime; 
            private String description; 
            private java.util.List < DesktopGroups> desktopGroups; 
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
            private Boolean profileCompatible; 
            private String regionId; 
            private String storageType; 
            private Boolean supportAcl; 
            private String zoneId; 

            /**
             * The total capacity of the NAS file system. Unit: GiB.
             * <p>
             * 
             * *   The Capacity type has 10 PiB of storage, which is equal to 10,485,760 GiB.
             * *   The Performance type has 1 PiB of storage, which is equal to 1,048,576 GiB.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The time when the NAS file system was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the NAS file system.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The desktop groups that are associated with the NAS file systems that support the UPM feature.
             */
            public Builder desktopGroups(java.util.List < DesktopGroups> desktopGroups) {
                this.desktopGroups = desktopGroups;
                return this;
            }

            /**
             * Indicates whether disk encryption is enabled.
             */
            public Builder encryptionEnabled(Boolean encryptionEnabled) {
                this.encryptionEnabled = encryptionEnabled;
                return this;
            }

            /**
             * The ID of the NAS file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The name of the NAS file system.
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * The status of the NAS file system. The possible values include:
             * <p>
             * 
             * *   Pending: The NAS file system is being created.
             * *   Running: The NAS file system is running.
             * *   Stopped: The NAS file system is stopped.
             * *   Deleting: The NAS file system is being deleted.
             * *   Deleted: The NAS file system is deleted.
             * *   Invalid: The NAS file system is invalid.
             */
            public Builder fileSystemStatus(String fileSystemStatus) {
                this.fileSystemStatus = fileSystemStatus;
                return this;
            }

            /**
             * The type of the NAS file system. Valid value: Universal NAS. This value indicates that the NAS file system is a General-purpose one.
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * The used storage of the NAS file system. Unit: byte.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
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
             * The status of the mount target. The possible values include:
             * <p>
             * 
             * *   Pending: The mount target is being created.
             * *   Active: The mount target is enabled.
             * *   Inactive: The mount target is disabled.
             * *   Deleting: The mount target is being deleted.
             * *   Invalid: The mount target is invalid.
             */
            public Builder mountTargetStatus(String mountTargetStatus) {
                this.mountTargetStatus = mountTargetStatus;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * Indicates whether the User Profile Management (UPM) feature is supported.
             */
            public Builder profileCompatible(Boolean profileCompatible) {
                this.profileCompatible = profileCompatible;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The storage type of the NAS file system. Valid values:
             * <p>
             * 
             * *   Capacity
             * *   Performance
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * Indicates whether the Server Message Block (SMB) access control list (ACL) feature was enabled.
             */
            public Builder supportAcl(Boolean supportAcl) {
                this.supportAcl = supportAcl;
                return this;
            }

            /**
             * The ID of the zone where the NAS file system resides.
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
