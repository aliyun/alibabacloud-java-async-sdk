// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessPointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessPointResponseBody</p>
 */
public class DescribeAccessPointResponseBody extends TeaModel {
    @NameInMap("AccessPoint")
    private AccessPoint accessPoint;

    @NameInMap("RequestId")
    @Validation(required = true)
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
         * AccessPoint.
         */
        public Builder accessPoint(AccessPoint accessPoint) {
            this.accessPoint = accessPoint;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("PosixGroupId")
        private Integer posixGroupId;

        @NameInMap("PosixSecondaryGroupIds")
        private java.util.List < Integer > posixSecondaryGroupIds;

        @NameInMap("PosixUserId")
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
             * PosixGroupId.
             */
            public Builder posixGroupId(Integer posixGroupId) {
                this.posixGroupId = posixGroupId;
                return this;
            }

            /**
             * PosixSecondaryGroupIds.
             */
            public Builder posixSecondaryGroupIds(java.util.List < Integer > posixSecondaryGroupIds) {
                this.posixSecondaryGroupIds = posixSecondaryGroupIds;
                return this;
            }

            /**
             * PosixUserId.
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
        @NameInMap("OwnerGroupId")
        private Integer ownerGroupId;

        @NameInMap("OwnerUserId")
        private Integer ownerUserId;

        @NameInMap("Permission")
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
             * OwnerGroupId.
             */
            public Builder ownerGroupId(Integer ownerGroupId) {
                this.ownerGroupId = ownerGroupId;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(Integer ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * Permission.
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
        @NameInMap("ARN")
        private String ARN;

        @NameInMap("AccessGroup")
        private String accessGroup;

        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("AccessPointName")
        private String accessPointName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("EnabledRam")
        private Boolean enabledRam;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("PosixUser")
        private PosixUser posixUser;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RootPath")
        private String rootPath;

        @NameInMap("RootPathPermission")
        private RootPathPermission rootPathPermission;

        @NameInMap("RootPathStatus")
        private String rootPathStatus;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
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
             * ARN.
             */
            public Builder ARN(String ARN) {
                this.ARN = ARN;
                return this;
            }

            /**
             * AccessGroup.
             */
            public Builder accessGroup(String accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * AccessPointName.
             */
            public Builder accessPointName(String accessPointName) {
                this.accessPointName = accessPointName;
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
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * EnabledRam.
             */
            public Builder enabledRam(Boolean enabledRam) {
                this.enabledRam = enabledRam;
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
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * PosixUser.
             */
            public Builder posixUser(PosixUser posixUser) {
                this.posixUser = posixUser;
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
             * RootPath.
             */
            public Builder rootPath(String rootPath) {
                this.rootPath = rootPath;
                return this;
            }

            /**
             * RootPathPermission.
             */
            public Builder rootPathPermission(RootPathPermission rootPathPermission) {
                this.rootPathPermission = rootPathPermission;
                return this;
            }

            /**
             * RootPathStatus.
             */
            public Builder rootPathStatus(String rootPathStatus) {
                this.rootPathStatus = rootPathStatus;
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
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
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
