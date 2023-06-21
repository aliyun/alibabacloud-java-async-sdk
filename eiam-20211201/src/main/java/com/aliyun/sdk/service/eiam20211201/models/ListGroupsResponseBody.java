// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsResponseBody</p>
 */
public class ListGroupsResponseBody extends TeaModel {
    @NameInMap("Groups")
    private java.util.List < Groups> groups;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListGroupsResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public java.util.List < Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Groups> groups; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The queried account groups.
         */
        public Builder groups(java.util.List < Groups> groups) {
            this.groups = groups;
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
         * The total number of entries returned. The maximum number of entries returned at a time depends on the value of PageSize.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGroupsResponseBody build() {
            return new ListGroupsResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupExternalId")
        private String groupExternalId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupSourceId")
        private String groupSourceId;

        @NameInMap("GroupSourceType")
        private String groupSourceType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Groups(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.groupExternalId = builder.groupExternalId;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.groupSourceId = builder.groupSourceId;
            this.groupSourceType = builder.groupSourceType;
            this.instanceId = builder.instanceId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupExternalId
         */
        public String getGroupExternalId() {
            return this.groupExternalId;
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
         * @return groupSourceId
         */
        public String getGroupSourceId() {
            return this.groupSourceId;
        }

        /**
         * @return groupSourceType
         */
        public String getGroupSourceType() {
            return this.groupSourceType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String groupExternalId; 
            private String groupId; 
            private String groupName; 
            private String groupSourceId; 
            private String groupSourceType; 
            private String instanceId; 
            private Long updateTime; 

            /**
             * The time at which the group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The external ID of the group, which can be used to associate the group with an external system. By default, the external ID is the group ID.
             */
            public Builder groupExternalId(String groupExternalId) {
                this.groupExternalId = groupExternalId;
                return this;
            }

            /**
             * The group ID.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The source ID of the group. If the group was imported from other services, this value indicates the external source ID. By default, the source ID is the instance ID.
             */
            public Builder groupSourceId(String groupSourceId) {
                this.groupSourceId = groupSourceId;
                return this;
            }

            /**
             * The source type of the group. Only build_in may be returned, which indicates that the group was created in IDaaS.
             * <p>
             * 
             * *
             */
            public Builder groupSourceType(String groupSourceType) {
                this.groupSourceType = groupSourceType;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time at which the group was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
