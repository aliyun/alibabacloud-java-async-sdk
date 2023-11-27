// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserProvisioningRdAccountStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserProvisioningRdAccountStatisticsResponseBody</p>
 */
public class GetUserProvisioningRdAccountStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserProvisioningStatistics")
    private UserProvisioningStatistics userProvisioningStatistics;

    private GetUserProvisioningRdAccountStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userProvisioningStatistics = builder.userProvisioningStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningRdAccountStatisticsResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserProvisioningStatistics.
         */
        public Builder userProvisioningStatistics(UserProvisioningStatistics userProvisioningStatistics) {
            this.userProvisioningStatistics = userProvisioningStatistics;
            return this;
        }

        public GetUserProvisioningRdAccountStatisticsResponseBody build() {
            return new GetUserProvisioningRdAccountStatisticsResponseBody(this);
        } 

    } 

    public static class UserProvisioningStatistics extends TeaModel {
        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("FailedEventCount")
        private Long failedEventCount;

        @NameInMap("LatestAsyncTime")
        private String latestAsyncTime;

        @NameInMap("OwnerPk")
        private String ownerPk;

        @NameInMap("Type")
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
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * FailedEventCount.
             */
            public Builder failedEventCount(Long failedEventCount) {
                this.failedEventCount = failedEventCount;
                return this;
            }

            /**
             * LatestAsyncTime.
             */
            public Builder latestAsyncTime(String latestAsyncTime) {
                this.latestAsyncTime = latestAsyncTime;
                return this;
            }

            /**
             * OwnerPk.
             */
            public Builder ownerPk(String ownerPk) {
                this.ownerPk = ownerPk;
                return this;
            }

            /**
             * Type.
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
