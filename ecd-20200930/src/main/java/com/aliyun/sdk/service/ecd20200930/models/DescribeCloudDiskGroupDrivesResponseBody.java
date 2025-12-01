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
 * {@link DescribeCloudDiskGroupDrivesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudDiskGroupDrivesResponseBody</p>
 */
public class DescribeCloudDiskGroupDrivesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudDriveGroups")
    private java.util.List<CloudDriveGroups> cloudDriveGroups;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCloudDiskGroupDrivesResponseBody(Builder builder) {
        this.cloudDriveGroups = builder.cloudDriveGroups;
        this.count = builder.count;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDiskGroupDrivesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudDriveGroups
     */
    public java.util.List<CloudDriveGroups> getCloudDriveGroups() {
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
        private java.util.List<CloudDriveGroups> cloudDriveGroups; 
        private Long count; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCloudDiskGroupDrivesResponseBody model) {
            this.cloudDriveGroups = model.cloudDriveGroups;
            this.count = model.count;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * CloudDriveGroups.
         */
        public Builder cloudDriveGroups(java.util.List<CloudDriveGroups> cloudDriveGroups) {
            this.cloudDriveGroups = cloudDriveGroups;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudDiskGroupDrivesResponseBody build() {
            return new DescribeCloudDiskGroupDrivesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudDiskGroupDrivesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudDiskGroupDrivesResponseBody</p>
     */
    public static class CloudDriveGroups extends TeaModel {
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
            private String createTime; 
            private String directoryId; 
            private String driveId; 
            private String groupId; 
            private String groupName; 
            private String orgId; 
            private String status; 
            private Long totalSize; 
            private String usedSize; 

            private Builder() {
            } 

            private Builder(CloudDriveGroups model) {
                this.createTime = model.createTime;
                this.directoryId = model.directoryId;
                this.driveId = model.driveId;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.orgId = model.orgId;
                this.status = model.status;
                this.totalSize = model.totalSize;
                this.usedSize = model.usedSize;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * DriveId.
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            /**
             * UsedSize.
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
