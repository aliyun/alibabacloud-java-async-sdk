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
         * FileSystems.
         */
        public Builder fileSystems(java.util.List < FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNASFileSystemsResponseBody build() {
            return new DescribeNASFileSystemsResponseBody(this);
        } 

    } 

    public static class FileSystems extends TeaModel {
        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

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
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemName = builder.fileSystemName;
            this.fileSystemStatus = builder.fileSystemStatus;
            this.fileSystemType = builder.fileSystemType;
            this.meteredSize = builder.meteredSize;
            this.mountTargetDomain = builder.mountTargetDomain;
            this.mountTargetStatus = builder.mountTargetStatus;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
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
            private String fileSystemId; 
            private String fileSystemName; 
            private String fileSystemStatus; 
            private String fileSystemType; 
            private Long meteredSize; 
            private String mountTargetDomain; 
            private String mountTargetStatus; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String regionId; 
            private String storageType; 
            private Boolean supportAcl; 
            private String zoneId; 

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * FileSystemName.
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * FileSystemStatus.
             */
            public Builder fileSystemStatus(String fileSystemStatus) {
                this.fileSystemStatus = fileSystemStatus;
                return this;
            }

            /**
             * FileSystemType.
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * MeteredSize.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * MountTargetDomain.
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * MountTargetStatus.
             */
            public Builder mountTargetStatus(String mountTargetStatus) {
                this.mountTargetStatus = mountTargetStatus;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * OfficeSiteName.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * SupportAcl.
             */
            public Builder supportAcl(Boolean supportAcl) {
                this.supportAcl = supportAcl;
                return this;
            }

            /**
             * ZoneId.
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
