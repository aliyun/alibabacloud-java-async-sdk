// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDriveUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudDriveUsersResponseBody</p>
 */
public class DescribeCloudDriveUsersResponseBody extends TeaModel {
    @NameInMap("CloudDriveUsers")
    private java.util.List < CloudDriveUsers> cloudDriveUsers;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCloudDriveUsersResponseBody(Builder builder) {
        this.cloudDriveUsers = builder.cloudDriveUsers;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDriveUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudDriveUsers
     */
    public java.util.List < CloudDriveUsers> getCloudDriveUsers() {
        return this.cloudDriveUsers;
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
        private java.util.List < CloudDriveUsers> cloudDriveUsers; 
        private String nextToken; 
        private String requestId; 

        /**
         * CloudDriveUsers.
         */
        public Builder cloudDriveUsers(java.util.List < CloudDriveUsers> cloudDriveUsers) {
            this.cloudDriveUsers = cloudDriveUsers;
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

        public DescribeCloudDriveUsersResponseBody build() {
            return new DescribeCloudDriveUsersResponseBody(this);
        } 

    } 

    public static class CloudDriveUsers extends TeaModel {
        @NameInMap("DriveId")
        private String driveId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalSize")
        private Long totalSize;

        @NameInMap("UsedSize")
        private Long usedSize;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        private CloudDriveUsers(Builder builder) {
            this.driveId = builder.driveId;
            this.status = builder.status;
            this.totalSize = builder.totalSize;
            this.usedSize = builder.usedSize;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudDriveUsers create() {
            return builder().build();
        }

        /**
         * @return driveId
         */
        public String getDriveId() {
            return this.driveId;
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
        public Long getUsedSize() {
            return this.usedSize;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String driveId; 
            private String status; 
            private Long totalSize; 
            private Long usedSize; 
            private String userId; 
            private String userName; 

            /**
             * DriveId.
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
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
            public Builder usedSize(Long usedSize) {
                this.usedSize = usedSize;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public CloudDriveUsers build() {
                return new CloudDriveUsers(this);
            } 

        } 

    }
}
