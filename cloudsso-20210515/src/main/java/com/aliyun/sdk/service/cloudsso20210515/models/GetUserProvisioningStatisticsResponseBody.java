// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetUserProvisioningStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.userProvisioningStatistics = model.userProvisioningStatistics;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6F90F3D-4502-5877-B80B-97476F6AE2CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics of the RAM user provisioning.</p>
         */
        public Builder userProvisioningStatistics(UserProvisioningStatistics userProvisioningStatistics) {
            this.userProvisioningStatistics = userProvisioningStatistics;
            return this;
        }

        public GetUserProvisioningStatisticsResponseBody build() {
            return new GetUserProvisioningStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserProvisioningStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserProvisioningStatisticsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(UserProvisioningStatistics model) {
                this.directoryId = model.directoryId;
                this.entityId = model.entityId;
                this.failedEventCount = model.failedEventCount;
                this.latestAsyncTime = model.latestAsyncTime;
                this.ownerPk = model.ownerPk;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>d-003qew84****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The entity ID, which is the ID of the RAM user provisioning.</p>
             * 
             * <strong>example:</strong>
             * <p>up-002axzhapcbz6e63****</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The number of failed RAM user provisioning events that are associated with the RAM user provisioning.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder failedEventCount(Long failedEventCount) {
                this.failedEventCount = failedEventCount;
                return this;
            }

            /**
             * <p>The time when the RAM user provisioning was last performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-28T03:55:42Z</p>
             */
            public Builder latestAsyncTime(String latestAsyncTime) {
                this.latestAsyncTime = latestAsyncTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource directory belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>139665787317****</p>
             */
            public Builder ownerPk(String ownerPk) {
                this.ownerPk = ownerPk;
                return this;
            }

            /**
             * <p>The entity type. The value is fixed as <code>User Provisioning</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>User Provisioning</p>
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
