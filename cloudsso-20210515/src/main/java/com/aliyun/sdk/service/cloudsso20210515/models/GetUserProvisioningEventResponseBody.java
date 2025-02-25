// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserProvisioningEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserProvisioningEventResponseBody</p>
 */
public class GetUserProvisioningEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserProvisioningEvent")
    private UserProvisioningEvent userProvisioningEvent;

    private GetUserProvisioningEventResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userProvisioningEvent = builder.userProvisioningEvent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userProvisioningEvent
     */
    public UserProvisioningEvent getUserProvisioningEvent() {
        return this.userProvisioningEvent;
    }

    public static final class Builder {
        private String requestId; 
        private UserProvisioningEvent userProvisioningEvent; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B801715C-97EA-3067-AC97-EF1EBECBB39C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The RAM user provisioning event.</p>
         */
        public Builder userProvisioningEvent(UserProvisioningEvent userProvisioningEvent) {
            this.userProvisioningEvent = userProvisioningEvent;
            return this;
        }

        public GetUserProvisioningEventResponseBody build() {
            return new GetUserProvisioningEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserProvisioningEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserProvisioningEventResponseBody</p>
     */
    public static class UserProvisioningEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeletionStrategy")
        private String deletionStrategy;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DuplicationStrategy")
        private String duplicationStrategy;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("LatestAsyncTime")
        private String latestAsyncTime;

        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetPath")
        private String targetPath;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserProvisioningId")
        private String userProvisioningId;

        private UserProvisioningEvent(Builder builder) {
            this.createTime = builder.createTime;
            this.deletionStrategy = builder.deletionStrategy;
            this.directoryId = builder.directoryId;
            this.duplicationStrategy = builder.duplicationStrategy;
            this.errorCount = builder.errorCount;
            this.errorInfo = builder.errorInfo;
            this.eventId = builder.eventId;
            this.latestAsyncTime = builder.latestAsyncTime;
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.sourceType = builder.sourceType;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetPath = builder.targetPath;
            this.targetType = builder.targetType;
            this.updateTime = builder.updateTime;
            this.userProvisioningId = builder.userProvisioningId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProvisioningEvent create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deletionStrategy
         */
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return duplicationStrategy
         */
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return latestAsyncTime
         */
        public String getLatestAsyncTime() {
            return this.latestAsyncTime;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userProvisioningId
         */
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

        public static final class Builder {
            private String createTime; 
            private String deletionStrategy; 
            private String directoryId; 
            private String duplicationStrategy; 
            private Long errorCount; 
            private String errorInfo; 
            private String eventId; 
            private String latestAsyncTime; 
            private String principalId; 
            private String principalName; 
            private String principalType; 
            private String sourceType; 
            private String targetId; 
            private String targetName; 
            private String targetPath; 
            private String targetType; 
            private String updateTime; 
            private String userProvisioningId; 

            /**
             * <p>The creation time. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-28T03:55:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The deletion policy. The policy is used to manage synchronized users when you delete the RAM user provisioning. Valid values:</p>
             * <ul>
             * <li>Delete: When you delete the RAM user provisioning, the system deletes the synchronized users.</li>
             * <li>Keep: When you delete the RAM user provisioning, the system retains the synchronized users.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Delete</p>
             */
            public Builder deletionStrategy(String deletionStrategy) {
                this.deletionStrategy = deletionStrategy;
                return this;
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
             * <p>The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:</p>
             * <ul>
             * <li>KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix <code>_sso</code>.</li>
             * <li>TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KeepBoth</p>
             */
            public Builder duplicationStrategy(String duplicationStrategy) {
                this.duplicationStrategy = duplicationStrategy;
                return this;
            }

            /**
             * <p>The number of execution failures.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * <p>The error message that is displayed when the last execution of the RAM user provisioning event failed.</p>
             * 
             * <strong>example:</strong>
             * <p>OperationConflict.UserProvisioning.Process.fail.ImsUserExists</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * <p>The ID of the RAM user provisioning event.</p>
             * 
             * <strong>example:</strong>
             * <p>upe-wjKyNDmZvyZOiRcJ****</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The time at which the RAM user provisioning event was last executed. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-28T03:55:42Z</p>
             */
            public Builder latestAsyncTime(String latestAsyncTime) {
                this.latestAsyncTime = latestAsyncTime;
                return this;
            }

            /**
             * <p>The identity ID of the RAM user provisioning. Valid values:</p>
             * <ul>
             * <li>If <code>Group</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the ID of a CloudSSO user group (g-********).</li>
             * <li>If <code>User</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the ID of a CloudSSO user (u-********).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>g-02ha881d*****</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The identity name of the RAM user provisioning. Valid values:</p>
             * <ul>
             * <li>If <code>Group</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the name of a CloudSSO user group.</li>
             * <li>If <code>User</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the name of a CloudSSO user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exampleGroupName</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The identity type of the RAM user provisioning. Valid values:</p>
             * <ul>
             * <li>User: The identity of the RAM user provisioning is a CloudSSO user.</li>
             * <li>Group: The identity of the RAM user provisioning is a CloudSSO user group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Group</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * <p>The type of the source operation. Valid values:</p>
             * <ul>
             * <li>StartProvisioning: enables the RAM user provisioning.</li>
             * <li>DeleteProvisioning: deletes the RAM user provisioning.</li>
             * <li>AddUserToGroup: adds a user to a user group.</li>
             * <li>RemoveUserFromGroup: removes a user from a user group.</li>
             * <li>UserProvisioningDeletionClearing: deletes the RAM user provisioning and clears resources in the background.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AddUserToGroup</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The ID of the object for which you create the RAM user provisioning.</p>
             * <p>The value is fixed as the ID of the member in the resource directory.````</p>
             * 
             * <strong>example:</strong>
             * <p>1743382******</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the object for which you create the RAM user provisioning.</p>
             * <p>The value is fixed as the name of the member in the resource directory.````</p>
             * 
             * <strong>example:</strong>
             * <p>exampleRdMember</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The path of the resource directory in which you create the RAM user provisioning for the object.</p>
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * <p>The object for which you create the RAM user provisioning. The value is fixed as <code>RD-Account</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>RD-Account</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The modification time. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-28T03:55:42Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the RAM user provisioning event.</p>
             * 
             * <strong>example:</strong>
             * <p>up-002axzhapcbz6e63****</p>
             */
            public Builder userProvisioningId(String userProvisioningId) {
                this.userProvisioningId = userProvisioningId;
                return this;
            }

            public UserProvisioningEvent build() {
                return new UserProvisioningEvent(this);
            } 

        } 

    }
}
