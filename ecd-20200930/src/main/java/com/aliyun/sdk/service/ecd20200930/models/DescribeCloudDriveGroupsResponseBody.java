// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDriveGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudDriveGroupsResponseBody</p>
 */
public class DescribeCloudDriveGroupsResponseBody extends TeaModel {
    @NameInMap("CloudDriveGroups")
    private java.util.List < CloudDriveGroups> cloudDriveGroups;

    @NameInMap("Count")
    private Long count;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class CloudDriveGroups extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DriveId")
        private String driveId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalSize")
        private Long totalSize;

        @NameInMap("UsedSize")
        private String usedSize;

        private CloudDriveGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.directoryId = builder.directoryId;
            this.driveId = builder.driveId;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
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
            private String createTime; 
            private String directoryId; 
            private String driveId; 
            private String groupId; 
            private String groupName; 
            private String status; 
            private Long totalSize; 
            private String usedSize; 

            /**
             * The time when the team space was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The ID of the team space.
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
                return this;
            }

            /**
             * The ID of the team.
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
             * The status of the team space. Valid values:
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
             * The size of the used space. Unit: bytes.
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
