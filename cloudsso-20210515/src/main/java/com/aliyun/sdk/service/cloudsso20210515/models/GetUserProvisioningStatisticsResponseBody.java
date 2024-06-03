// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserProvisioningStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserProvisioningStatisticsResponseBody</p>
 */
public class GetUserProvisioningStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserProvisioningStatistics")
    private UserProvisioningStatistics userProvisioningStatistics;

    private GetUserProvisioningStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userProvisioningStatistics = builder.userProvisioningStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userProvisioningStatistics
     */
    public UserProvisioningStatistics getUserProvisioningStatistics() {
        return this.userProvisioningStatistics;
    }

    public static final class Builder {
        private String requestId; 
        private UserProvisioningStatistics userProvisioningStatistics; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The statistics of the RAM user provisioning.
         */
        public Builder userProvisioningStatistics(UserProvisioningStatistics userProvisioningStatistics) {
            this.userProvisioningStatistics = userProvisioningStatistics;
            return this;
        }

        public GetUserProvisioningStatisticsResponseBody build() {
            return new GetUserProvisioningStatisticsResponseBody(this);
        } 

    } 

    public static class UserProvisioningStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("FailedEventCount")
        private Long failedEventCount;

        @com.aliyun.core.annotation.NameInMap("LatestAsyncTime")
        private String latestAsyncTime;

        @com.aliyun.core.annotation.NameInMap("OwnerPk")
        private String ownerPk;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UserProvisioningStatistics(Builder builder) {
            this.directoryId = builder.directoryId;
            this.entityId = builder.entityId;
            this.failedEventCount = builder.failedEventCount;
            this.latestAsyncTime = builder.latestAsyncTime;
            this.ownerPk = builder.ownerPk;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProvisioningStatistics create() {
            return builder().build();
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return failedEventCount
         */
        public Long getFailedEventCount() {
            return this.failedEventCount;
        }

        /**
         * @return latestAsyncTime
         */
        public String getLatestAsyncTime() {
            return this.latestAsyncTime;
        }

        /**
         * @return ownerPk
         */
        public String getOwnerPk() {
            return this.ownerPk;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String directoryId; 
            private String entityId; 
            private Long failedEventCount; 
            private String latestAsyncTime; 
            private String ownerPk; 
            private String type; 

            /**
             * The ID of the resource directory.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The entity ID, which is the ID of the RAM user provisioning.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The number of failed RAM user provisioning events that are associated with the RAM user provisioning.
             */
            public Builder failedEventCount(Long failedEventCount) {
                this.failedEventCount = failedEventCount;
                return this;
            }

            /**
             * The time when the RAM user provisioning was last performed.
             */
            public Builder latestAsyncTime(String latestAsyncTime) {
                this.latestAsyncTime = latestAsyncTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the resource directory belongs.
             */
            public Builder ownerPk(String ownerPk) {
                this.ownerPk = ownerPk;
                return this;
            }

            /**
             * The entity type. The value is fixed as `User Provisioning`.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserProvisioningStatistics build() {
                return new UserProvisioningStatistics(this);
            } 

        } 

    }
}
