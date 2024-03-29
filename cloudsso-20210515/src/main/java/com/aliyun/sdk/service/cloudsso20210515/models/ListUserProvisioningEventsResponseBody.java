// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserProvisioningEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserProvisioningEventsResponseBody</p>
 */
public class ListUserProvisioningEventsResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCounts")
    private Integer totalCounts;

    @NameInMap("UserProvisioningEvents")
    private java.util.List < UserProvisioningEvents> userProvisioningEvents;

    private ListUserProvisioningEventsResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
        this.userProvisioningEvents = builder.userProvisioningEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserProvisioningEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    /**
     * @return userProvisioningEvents
     */
    public java.util.List < UserProvisioningEvents> getUserProvisioningEvents() {
        return this.userProvisioningEvents;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCounts; 
        private java.util.List < UserProvisioningEvents> userProvisioningEvents; 

        /**
         * Indicates whether the queried entries are truncated. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The maximum number of entries per page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to initiate the next request.
         * <p>
         * 
         * >  This parameter is returned only when the `IsTruncated` parameter is set to `true`.
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
         * The total number of entries returned.
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        /**
         * The RAM user provisioning events.
         */
        public Builder userProvisioningEvents(java.util.List < UserProvisioningEvents> userProvisioningEvents) {
            this.userProvisioningEvents = userProvisioningEvents;
            return this;
        }

        public ListUserProvisioningEventsResponseBody build() {
            return new ListUserProvisioningEventsResponseBody(this);
        } 

    } 

    public static class UserProvisioningEvents extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeletionStrategy")
        private String deletionStrategy;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DuplicationStrategy")
        private String duplicationStrategy;

        @NameInMap("ErrorCount")
        private Long errorCount;

        @NameInMap("ErrorInfo")
        private String errorInfo;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("LatestAsyncTime")
        private String latestAsyncTime;

        @NameInMap("PrincipalId")
        private String principalId;

        @NameInMap("PrincipalName")
        private String principalName;

        @NameInMap("PrincipalType")
        private String principalType;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetPath")
        private String targetPath;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UserProvisioningId")
        private String userProvisioningId;

        private UserProvisioningEvents(Builder builder) {
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

        public static UserProvisioningEvents create() {
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
             * The creation time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The deletion policy. The policy is used to manage synchronized users when you delete the RAM user provisioning. Valid values:
             * <p>
             * 
             * *   Delete: When you delete the RAM user provisioning, the system deletes the synchronized users.
             * *   Keep: When you delete the RAM user provisioning, the system retains the synchronized users.
             */
            public Builder deletionStrategy(String deletionStrategy) {
                this.deletionStrategy = deletionStrategy;
                return this;
            }

            /**
             * The ID of the resource directory.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:
             * <p>
             * 
             * *   KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix `_sso`.
             * *   TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.
             */
            public Builder duplicationStrategy(String duplicationStrategy) {
                this.duplicationStrategy = duplicationStrategy;
                return this;
            }

            /**
             * The number of execution failures.
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * The error message that is displayed when the last execution of the RAM user provisioning event failed.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * The ID of the RAM user provisioning event.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The time at which the RAM user provisioning event was last executed.
             */
            public Builder latestAsyncTime(String latestAsyncTime) {
                this.latestAsyncTime = latestAsyncTime;
                return this;
            }

            /**
             * The identity ID of the RAM user provisioning. Valid values:
             * <p>
             * 
             * *   If `Group` is returned for the `PrincipalType` parameter, the value of this parameter is the ID of a CloudSSO user group (g-\*\*\*\*\*\*\*\*).
             * *   If `User` is returned for the `PrincipalType` parameter, the value of this parameter is the ID of a CloudSSO user (u-\*\*\*\*\*\*\*\*).
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * The identity name of the RAM user provisioning. Valid values:
             * <p>
             * 
             * *   If `Group` is returned for the `PrincipalType` parameter, the value of this parameter is the name of a CloudSSO user group.
             * *   If `User` is returned for the `PrincipalType` parameter, the value of this parameter is the name of a CloudSSO user.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * The identity type of the RAM user provisioning. Valid values:
             * <p>
             * 
             * *   User: The identity of the RAM user provisioning is a CloudSSO user.
             * *   Group: The identity of the RAM user provisioning is a CloudSSO user group.
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * The type of the source operation. Valid values:
             * <p>
             * 
             * *   StartProvisioning: enables the RAM user provisioning.
             * *   DeleteProvisioning: deletes the RAM user provisioning.
             * *   AddUserToGroup: adds a user to a user group.
             * *   RemoveUserFromGroup: removes a user from a user group.
             * *   UserProvisioningDeletionClearing: deletes the RAM user provisioning and clears resources in the background.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The ID of the object for which you create the RAM user provisioning.
             * <p>
             * 
             * The value is fixed as the ID of the account in the resource directory.````
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The name of the object for which you create the RAM user provisioning.
             * <p>
             * 
             * If `RD-Account` is returned, the value of this parameter is the name of the account that is used to access the instance.``
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The path of the resource directory in which you create the RAM user provisioning for the object.
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * The object for which you create the RAM user provisioning. The value is fixed as `RD-Account`.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the RAM user provisioning.
             */
            public Builder userProvisioningId(String userProvisioningId) {
                this.userProvisioningId = userProvisioningId;
                return this;
            }

            public UserProvisioningEvents build() {
                return new UserProvisioningEvents(this);
            } 

        } 

    }
}
