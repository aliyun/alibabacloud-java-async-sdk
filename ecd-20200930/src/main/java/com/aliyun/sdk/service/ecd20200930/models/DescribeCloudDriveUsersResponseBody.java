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
 * {@link DescribeCloudDriveUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudDriveUsersResponseBody</p>
 */
public class DescribeCloudDriveUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudDriveUsers")
    private java.util.List<CloudDriveUsers> cloudDriveUsers;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudDriveUsers
     */
    public java.util.List<CloudDriveUsers> getCloudDriveUsers() {
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
        private java.util.List<CloudDriveUsers> cloudDriveUsers; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCloudDriveUsersResponseBody model) {
            this.cloudDriveUsers = model.cloudDriveUsers;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * CloudDriveUsers.
         */
        public Builder cloudDriveUsers(java.util.List<CloudDriveUsers> cloudDriveUsers) {
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

    /**
     * 
     * {@link DescribeCloudDriveUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudDriveUsersResponseBody</p>
     */
    public static class CloudDriveUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DriveId")
        private String driveId;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        @com.aliyun.core.annotation.NameInMap("UsedSize")
        private Long usedSize;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private CloudDriveUsers(Builder builder) {
            this.driveId = builder.driveId;
            this.endUserId = builder.endUserId;
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
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
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
            private String endUserId; 
            private String status; 
            private Long totalSize; 
            private Long usedSize; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(CloudDriveUsers model) {
                this.driveId = model.driveId;
                this.endUserId = model.endUserId;
                this.status = model.status;
                this.totalSize = model.totalSize;
                this.usedSize = model.usedSize;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * DriveId.
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
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
