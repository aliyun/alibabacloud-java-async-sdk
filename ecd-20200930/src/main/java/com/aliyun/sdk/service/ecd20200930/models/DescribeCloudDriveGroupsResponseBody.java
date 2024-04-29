// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDriveGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudDriveGroupsResponseBody</p>
 */
public class DescribeCloudDriveGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudDriveGroups")
    private java.util.List < CloudDriveGroups> cloudDriveGroups;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCloudDriveGroupsResponseBody(Builder builder) {
        this.cloudDriveGroups = builder.cloudDriveGroups;
        this.count = builder.count;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDriveGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudDriveGroups
     */
    public java.util.List < CloudDriveGroups> getCloudDriveGroups() {
        return this.cloudDriveGroups;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < CloudDriveGroups> cloudDriveGroups; 
        private Long count; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        /**
         * The list of team spaces.
         */
        public Builder cloudDriveGroups(java.util.List < CloudDriveGroups> cloudDriveGroups) {
            this.cloudDriveGroups = cloudDriveGroups;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudDriveGroupsResponseBody build() {
            return new DescribeCloudDriveGroupsResponseBody(this);
        } 

    } 

    public static class AdminUserInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        private AdminUserInfos(Builder builder) {
            this.endUserId = builder.endUserId;
            this.nickName = builder.nickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdminUserInfos create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        public static final class Builder {
            private String endUserId; 
            private String nickName; 

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            public AdminUserInfos build() {
                return new AdminUserInfos(this);
            } 

        } 

    }
    public static class CloudDriveGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminUserIds")
        private String adminUserIds;

        @com.aliyun.core.annotation.NameInMap("AdminUserInfos")
        private java.util.List < AdminUserInfos> adminUserInfos;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DriveId")
        private String driveId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        @com.aliyun.core.annotation.NameInMap("UsedSize")
        private String usedSize;

        private CloudDriveGroups(Builder builder) {
            this.adminUserIds = builder.adminUserIds;
            this.adminUserInfos = builder.adminUserInfos;
            this.createTime = builder.createTime;
            this.directoryId = builder.directoryId;
            this.driveId = builder.driveId;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.orgId = builder.orgId;
            this.status = builder.status;
            this.totalSize = builder.totalSize;
            this.usedSize = builder.usedSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudDriveGroups create() {
            return builder().build();
        }

        /**
         * @return adminUserIds
         */
        public String getAdminUserIds() {
            return this.adminUserIds;
        }

        /**
         * @return adminUserInfos
         */
        public java.util.List < AdminUserInfos> getAdminUserInfos() {
            return this.adminUserInfos;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return driveId
         */
        public String getDriveId() {
            return this.driveId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        /**
         * @return usedSize
         */
        public String getUsedSize() {
            return this.usedSize;
        }

        public static final class Builder {
            private String adminUserIds; 
            private java.util.List < AdminUserInfos> adminUserInfos; 
            private String createTime; 
            private String directoryId; 
            private String driveId; 
            private String groupId; 
            private String groupName; 
            private String orgId; 
            private String status; 
            private Long totalSize; 
            private String usedSize; 

            /**
             * AdminUserIds.
             */
            public Builder adminUserIds(String adminUserIds) {
                this.adminUserIds = adminUserIds;
                return this;
            }

            /**
             * AdminUserInfos.
             */
            public Builder adminUserInfos(java.util.List < AdminUserInfos> adminUserInfos) {
                this.adminUserInfos = adminUserInfos;
                return this;
            }

            /**
             * The time when the team space was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The workspace ID.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The team space ID.
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
                return this;
            }

            /**
             * The team ID.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the team space.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * The team space status. Valid values:
             * <p>
             * 
             * *   enabled
             * *   disabled
             * 
             * Default value: enabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The total capacity of the team space.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            /**
             * The capacity of the used space. Unit: bytes.
             */
            public Builder usedSize(String usedSize) {
                this.usedSize = usedSize;
                return this;
            }

            public CloudDriveGroups build() {
                return new CloudDriveGroups(this);
            } 

        } 

    }
}
