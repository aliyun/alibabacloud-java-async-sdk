// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessPointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessPointResponseBody</p>
 */
public class DescribeAccessPointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPoint")
    private AccessPoint accessPoint;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private DescribeAccessPointResponseBody(Builder builder) {
        this.accessPoint = builder.accessPoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessPointResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessPoint
     */
    public AccessPoint getAccessPoint() {
        return this.accessPoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessPoint accessPoint; 
        private String requestId; 

        /**
         * The information about the access point.
         */
        public Builder accessPoint(AccessPoint accessPoint) {
            this.accessPoint = accessPoint;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccessPointResponseBody build() {
            return new DescribeAccessPointResponseBody(this);
        } 

    } 

    public static class PosixUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PosixGroupId")
        private Integer posixGroupId;

        @com.aliyun.core.annotation.NameInMap("PosixSecondaryGroupIds")
        private java.util.List < Integer > posixSecondaryGroupIds;

        @com.aliyun.core.annotation.NameInMap("PosixUserId")
        private Integer posixUserId;

        private PosixUser(Builder builder) {
            this.posixGroupId = builder.posixGroupId;
            this.posixSecondaryGroupIds = builder.posixSecondaryGroupIds;
            this.posixUserId = builder.posixUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PosixUser create() {
            return builder().build();
        }

        /**
         * @return posixGroupId
         */
        public Integer getPosixGroupId() {
            return this.posixGroupId;
        }

        /**
         * @return posixSecondaryGroupIds
         */
        public java.util.List < Integer > getPosixSecondaryGroupIds() {
            return this.posixSecondaryGroupIds;
        }

        /**
         * @return posixUserId
         */
        public Integer getPosixUserId() {
            return this.posixUserId;
        }

        public static final class Builder {
            private Integer posixGroupId; 
            private java.util.List < Integer > posixSecondaryGroupIds; 
            private Integer posixUserId; 

            /**
             * The ID of the POSIX user group.
             */
            public Builder posixGroupId(Integer posixGroupId) {
                this.posixGroupId = posixGroupId;
                return this;
            }

            /**
             * The IDs of the secondary user groups.
             */
            public Builder posixSecondaryGroupIds(java.util.List < Integer > posixSecondaryGroupIds) {
                this.posixSecondaryGroupIds = posixSecondaryGroupIds;
                return this;
            }

            /**
             * The ID of the POSIX user.
             */
            public Builder posixUserId(Integer posixUserId) {
                this.posixUserId = posixUserId;
                return this;
            }

            public PosixUser build() {
                return new PosixUser(this);
            } 

        } 

    }
    public static class RootPathPermission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerGroupId")
        private Integer ownerGroupId;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private Integer ownerUserId;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private String permission;

        private RootPathPermission(Builder builder) {
            this.ownerGroupId = builder.ownerGroupId;
            this.ownerUserId = builder.ownerUserId;
            this.permission = builder.permission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RootPathPermission create() {
            return builder().build();
        }

        /**
         * @return ownerGroupId
         */
        public Integer getOwnerGroupId() {
            return this.ownerGroupId;
        }

        /**
         * @return ownerUserId
         */
        public Integer getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        public static final class Builder {
            private Integer ownerGroupId; 
            private Integer ownerUserId; 
            private String permission; 

            /**
             * The ID of the owner group.
             */
            public Builder ownerGroupId(Integer ownerGroupId) {
                this.ownerGroupId = ownerGroupId;
                return this;
            }

            /**
             * The owner ID.
             */
            public Builder ownerUserId(Integer ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * The POSIX permission.
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            public RootPathPermission build() {
                return new RootPathPermission(this);
            } 

        } 

    }
    public static class AccessPoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ARN")
        private String ARN;

        @com.aliyun.core.annotation.NameInMap("AccessGroup")
        private String accessGroup;

        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("AccessPointName")
        private String accessPointName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EnabledRam")
        private Boolean enabledRam;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("PosixUser")
        private PosixUser posixUser;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RootPath")
        private String rootPath;

        @com.aliyun.core.annotation.NameInMap("RootPathPermission")
        private RootPathPermission rootPathPermission;

        @com.aliyun.core.annotation.NameInMap("RootPathStatus")
        private String rootPathStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AccessPoint(Builder builder) {
            this.ARN = builder.ARN;
            this.accessGroup = builder.accessGroup;
            this.accessPointId = builder.accessPointId;
            this.accessPointName = builder.accessPointName;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.enabledRam = builder.enabledRam;
            this.fileSystemId = builder.fileSystemId;
            this.modifyTime = builder.modifyTime;
            this.posixUser = builder.posixUser;
            this.regionId = builder.regionId;
            this.rootPath = builder.rootPath;
            this.rootPathPermission = builder.rootPathPermission;
            this.rootPathStatus = builder.rootPathStatus;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPoint create() {
            return builder().build();
        }

        /**
         * @return ARN
         */
        public String getARN() {
            return this.ARN;
        }

        /**
         * @return accessGroup
         */
        public String getAccessGroup() {
            return this.accessGroup;
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return accessPointName
         */
        public String getAccessPointName() {
            return this.accessPointName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return enabledRam
         */
        public Boolean getEnabledRam() {
            return this.enabledRam;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return posixUser
         */
        public PosixUser getPosixUser() {
            return this.posixUser;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return rootPath
         */
        public String getRootPath() {
            return this.rootPath;
        }

        /**
         * @return rootPathPermission
         */
        public RootPathPermission getRootPathPermission() {
            return this.rootPathPermission;
        }

        /**
         * @return rootPathStatus
         */
        public String getRootPathStatus() {
            return this.rootPathStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String ARN; 
            private String accessGroup; 
            private String accessPointId; 
            private String accessPointName; 
            private String createTime; 
            private String domainName; 
            private Boolean enabledRam; 
            private String fileSystemId; 
            private String modifyTime; 
            private PosixUser posixUser; 
            private String regionId; 
            private String rootPath; 
            private RootPathPermission rootPathPermission; 
            private String rootPathStatus; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the access point.
             */
            public Builder ARN(String ARN) {
                this.ARN = ARN;
                return this;
            }

            /**
             * The name of the permission group.
             */
            public Builder accessGroup(String accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            /**
             * The ID of the access point.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * The name of the access point.
             */
            public Builder accessPointName(String accessPointName) {
                this.accessPointName = accessPointName;
                return this;
            }

            /**
             * The time when the access point was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The domain name of the access point.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Indicates whether the RAM policy is enabled.
             */
            public Builder enabledRam(Boolean enabledRam) {
                this.enabledRam = enabledRam;
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
             * The time when the access point was modified.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The POSIX user.
             */
            public Builder posixUser(PosixUser posixUser) {
                this.posixUser = posixUser;
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
             * The root directory.
             */
            public Builder rootPath(String rootPath) {
                this.rootPath = rootPath;
                return this;
            }

            /**
             * The permissions to create the root directory.
             */
            public Builder rootPathPermission(RootPathPermission rootPathPermission) {
                this.rootPathPermission = rootPathPermission;
                return this;
            }

            /**
             * The status of the root directory.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: The rootpath status is unknown.
             * *   1: The rootpath does not exist and may be deleted.
             * *   2: The rootpath is normal.
             */
            public Builder rootPathStatus(String rootPathStatus) {
                this.rootPathStatus = rootPathStatus;
                return this;
            }

            /**
             * The status of the access point.
             * <p>
             * 
             * Valid values:
             * 
             * *   Active: The access point is available.
             * *   Inactive: The access point is unavailable.
             * *   Pending: The access point is being created.
             * *   Deleting: The access point is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             * <p>
             * 
             * You must select the VPC of the Elastic Compute Service (ECS) instance on which you want to mount the file system.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AccessPoint build() {
                return new AccessPoint(this);
            } 

        } 

    }
}
