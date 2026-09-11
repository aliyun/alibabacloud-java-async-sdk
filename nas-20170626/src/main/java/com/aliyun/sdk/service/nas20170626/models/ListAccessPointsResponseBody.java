// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link ListAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessPointsResponseBody</p>
 */
public class ListAccessPointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPoints")
    private java.util.List<AccessPoints> accessPoints;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAccessPointsResponseBody(Builder builder) {
        this.accessPoints = builder.accessPoints;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessPointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPoints
     */
    public java.util.List<AccessPoints> getAccessPoints() {
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
        private java.util.List<AccessPoints> accessPoints; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAccessPointsResponseBody model) {
            this.accessPoints = model.accessPoints;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The access point information.</p>
         */
        public Builder accessPoints(java.util.List<AccessPoints> accessPoints) {
            this.accessPoints = accessPoints;
            return this;
        }

        /**
         * <p>The query token. Set this parameter to the value of NextToken that was returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>52frCAAAAABoZS90cm****==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of access points.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAccessPointsResponseBody build() {
            return new ListAccessPointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessPointsResponseBody</p>
     */
    public static class PosixUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PosixGroupId")
        private Integer posixGroupId;

        @com.aliyun.core.annotation.NameInMap("PosixSecondaryGroupIds")
        private java.util.List<Integer> posixSecondaryGroupIds;

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
        public java.util.List<Integer> getPosixSecondaryGroupIds() {
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
            private java.util.List<Integer> posixSecondaryGroupIds; 
            private Integer posixUserId; 

            private Builder() {
            } 

            private Builder(PosixUser model) {
                this.posixGroupId = model.posixGroupId;
                this.posixSecondaryGroupIds = model.posixSecondaryGroupIds;
                this.posixUserId = model.posixUserId;
            } 

            /**
             * <p>The POSIX group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder posixGroupId(Integer posixGroupId) {
                this.posixGroupId = posixGroupId;
                return this;
            }

            /**
             * <p>The secondary group ID.</p>
             */
            public Builder posixSecondaryGroupIds(java.util.List<Integer> posixSecondaryGroupIds) {
                this.posixSecondaryGroupIds = posixSecondaryGroupIds;
                return this;
            }

            /**
             * <p>The POSIX user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>156</p>
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
    /**
     * 
     * {@link ListAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessPointsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RootPathPermission model) {
                this.ownerGroupId = model.ownerGroupId;
                this.ownerUserId = model.ownerUserId;
                this.permission = model.permission;
            } 

            /**
             * <p>The owner group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ownerGroupId(Long ownerGroupId) {
                this.ownerGroupId = ownerGroupId;
                return this;
            }

            /**
             * <p>The owner user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ownerUserId(Long ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The POSIX permission.</p>
             * 
             * <strong>example:</strong>
             * <p>0755</p>
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
    /**
     * 
     * {@link ListAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessPointsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessPointsResponseBody</p>
     */
    public static class AccessPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ARN")
        private String ARN;

        @com.aliyun.core.annotation.NameInMap("AccessGroup")
        private String accessGroup;

        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("AccessPointName")
        private String accessPointName;

        @com.aliyun.core.annotation.NameInMap("AgenticSpaceId")
        private String agenticSpaceId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeUtc")
        private String createTimeUtc;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EnabledRam")
        private Boolean enabledRam;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTimeUtc")
        private String modifyTimeUtc;

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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AccessPoints(Builder builder) {
            this.ARN = builder.ARN;
            this.accessGroup = builder.accessGroup;
            this.accessPointId = builder.accessPointId;
            this.accessPointName = builder.accessPointName;
            this.agenticSpaceId = builder.agenticSpaceId;
            this.createTime = builder.createTime;
            this.createTimeUtc = builder.createTimeUtc;
            this.domainName = builder.domainName;
            this.enabledRam = builder.enabledRam;
            this.fileSystemId = builder.fileSystemId;
            this.modifyTime = builder.modifyTime;
            this.modifyTimeUtc = builder.modifyTimeUtc;
            this.posixUser = builder.posixUser;
            this.rootPath = builder.rootPath;
            this.rootPathPermission = builder.rootPathPermission;
            this.rootPathStatus = builder.rootPathStatus;
            this.status = builder.status;
            this.tags = builder.tags;
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
         * @return agenticSpaceId
         */
        public String getAgenticSpaceId() {
            return this.agenticSpaceId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimeUtc
         */
        public String getCreateTimeUtc() {
            return this.createTimeUtc;
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
         * @return modifyTimeUtc
         */
        public String getModifyTimeUtc() {
            return this.modifyTimeUtc;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private String agenticSpaceId; 
            private String createTime; 
            private String createTimeUtc; 
            private String domainName; 
            private Boolean enabledRam; 
            private String fileSystemId; 
            private String modifyTime; 
            private String modifyTimeUtc; 
            private PosixUser posixUser; 
            private String rootPath; 
            private RootPathPermission rootPathPermission; 
            private String rootPathStatus; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(AccessPoints model) {
                this.ARN = model.ARN;
                this.accessGroup = model.accessGroup;
                this.accessPointId = model.accessPointId;
                this.accessPointName = model.accessPointName;
                this.agenticSpaceId = model.agenticSpaceId;
                this.createTime = model.createTime;
                this.createTimeUtc = model.createTimeUtc;
                this.domainName = model.domainName;
                this.enabledRam = model.enabledRam;
                this.fileSystemId = model.fileSystemId;
                this.modifyTime = model.modifyTime;
                this.modifyTimeUtc = model.modifyTimeUtc;
                this.posixUser = model.posixUser;
                this.rootPath = model.rootPath;
                this.rootPathPermission = model.rootPathPermission;
                this.rootPathStatus = model.rootPathStatus;
                this.status = model.status;
                this.tags = model.tags;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The access point ARN.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:nas:cn-hangzhou:178321033379****:accesspoint/ap-ie15yd****</p>
             */
            public Builder ARN(String ARN) {
                this.ARN = ARN;
                return this;
            }

            /**
             * <p>The permission group name.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_VPC_GROUP_NAME</p>
             */
            public Builder accessGroup(String accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            /**
             * <p>The access point ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-ie15y*****</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The access point name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder accessPointName(String accessPointName) {
                this.accessPointName = accessPointName;
                return this;
            }

            /**
             * <p>AgenticSpace Id。</p>
             * 
             * <strong>example:</strong>
             * <p>agentic-229oypxjgpau2****</p>
             */
            public Builder agenticSpaceId(String agenticSpaceId) {
                this.agenticSpaceId = agenticSpaceId;
                return this;
            }

            /**
             * <p>The time when the access point was created. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-28T06:32:14Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the agentic space was created. The time follows the ISO 8601 standard. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-10T10:08:08Z</p>
             */
            public Builder createTimeUtc(String createTimeUtc) {
                this.createTimeUtc = createTimeUtc;
                return this;
            }

            /**
             * <p>The access point domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-ie15ydanoz.001014****-w****.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Indicates whether the RAM policy is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabledRam(Boolean enabledRam) {
                this.enabledRam = enabledRam;
                return this;
            }

            /**
             * <p>The file system ID.</p>
             * 
             * <strong>example:</strong>
             * <p>091yj49baxscll2****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The time when the access point was last modified. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-24T02:10:23Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The time when the agentic space was last modified. The time follows the ISO 8601 standard. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-10T10:08:08Z</p>
             */
            public Builder modifyTimeUtc(String modifyTimeUtc) {
                this.modifyTimeUtc = modifyTimeUtc;
                return this;
            }

            /**
             * <p>The POSIX user.</p>
             */
            public Builder posixUser(PosixUser posixUser) {
                this.posixUser = posixUser;
                return this;
            }

            /**
             * <p>The root directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder rootPath(String rootPath) {
                this.rootPath = rootPath;
                return this;
            }

            /**
             * <p>The root directory permission.</p>
             */
            public Builder rootPathPermission(RootPathPermission rootPathPermission) {
                this.rootPathPermission = rootPathPermission;
                return this;
            }

            /**
             * <p>The current root directory status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: The root path status is unknown.</li>
             * <li>1: The root path does not exist. It may have been deleted by the user.</li>
             * <li>2: The root path status is normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rootPathStatus(String rootPathStatus) {
                this.rootPathStatus = rootPathStatus;
                return this;
            }

            /**
             * <p>The current access point status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Active: Available.</li>
             * <li>Inactive: Unavailable.</li>
             * <li>Pending: Being created.</li>
             * <li>Deleting: Being deleted.</li>
             * </ul>
             * <blockquote>
             * <p>You can mount a file system only when the status is Active.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The access point tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zevmwkwyztjuoffg****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zesj9afh3y518k9o****</p>
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
