// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessPointsResponseBody</p>
 */
public class DescribeAccessPointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPoints")
    private java.util.List < AccessPoints> accessPoints;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccessPointsResponseBody(Builder builder) {
        this.accessPoints = builder.accessPoints;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessPointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessPoints
     */
    public java.util.List < AccessPoints> getAccessPoints() {
        return this.accessPoints;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AccessPoints> accessPoints; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AccessPoints.
         */
        public Builder accessPoints(java.util.List < AccessPoints> accessPoints) {
            this.accessPoints = accessPoints;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccessPointsResponseBody build() {
            return new DescribeAccessPointsResponseBody(this);
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
        @com.aliyun.core.annotation.NameInMap("OwnerGroupId")
        private Long ownerGroupId;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private Long ownerUserId;

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
        public Long getOwnerGroupId() {
            return this.ownerGroupId;
        }

        /**
         * @return ownerUserId
         */
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        public static final class Builder {
            private Long ownerGroupId; 
            private Long ownerUserId; 
            private String permission; 

            /**
             * OwnerGroupId.
             */
            public Builder ownerGroupId(Long ownerGroupId) {
                this.ownerGroupId = ownerGroupId;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(Long ownerUserId) {
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
    public static class AccessPoints extends TeaModel {
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

        private AccessPoints(Builder builder) {
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

        public static AccessPoints create() {
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

            public AccessPoints build() {
                return new AccessPoints(this);
            } 

        } 

    }
}
