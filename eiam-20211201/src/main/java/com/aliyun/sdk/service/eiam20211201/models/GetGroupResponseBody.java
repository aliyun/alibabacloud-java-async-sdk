// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetGroupResponseBody</p>
 */
public class GetGroupResponseBody extends TeaModel {
    @NameInMap("Group")
    private Group group;

    @NameInMap("RequestId")
    private String requestId;

    private GetGroupResponseBody(Builder builder) {
        this.group = builder.group;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return group
     */
    public Group getGroup() {
        return this.group;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Group group; 
        private String requestId; 

        /**
         * Group.
         */
        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGroupResponseBody build() {
            return new GetGroupResponseBody(this);
        } 

    } 

    public static class Group extends TeaModel {
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

        private Group(Builder builder) {
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

        public static Group create() {
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
             * 组创建时间, Unix时间戳格式，单位为毫秒。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 组描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 组外部标识。
             */
            public Builder groupExternalId(String groupExternalId) {
                this.groupExternalId = groupExternalId;
                return this;
            }

            /**
             * 组ID。
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * 组名称。
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * 组来源ID。
             */
            public Builder groupSourceId(String groupSourceId) {
                this.groupSourceId = groupSourceId;
                return this;
            }

            /**
             * 组来源类型，build_in[自建],ding_talk[钉钉导入],ad[AD导入],ldap[LDAP导入]。
             */
            public Builder groupSourceType(String groupSourceType) {
                this.groupSourceType = groupSourceType;
                return this;
            }

            /**
             * 实例ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 组最近一次更新时间，Unix时间戳格式，单位为毫秒。
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
}
