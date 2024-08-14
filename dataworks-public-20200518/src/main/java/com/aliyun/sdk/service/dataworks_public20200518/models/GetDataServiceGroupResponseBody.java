// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServiceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceGroupResponseBody</p>
 */
public class GetDataServiceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Group")
    private Group group;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataServiceGroupResponseBody(Builder builder) {
        this.group = builder.group;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceGroupResponseBody create() {
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
         * The details of the business process.
         */
        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataServiceGroupResponseBody build() {
            return new GetDataServiceGroupResponseBody(this);
        } 

    } 

    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiGatewayGroupId")
        private String apiGatewayGroupId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private Group(Builder builder) {
            this.apiGatewayGroupId = builder.apiGatewayGroupId;
            this.createdTime = builder.createdTime;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return apiGatewayGroupId
         */
        public String getApiGatewayGroupId() {
            return this.apiGatewayGroupId;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String apiGatewayGroupId; 
            private String createdTime; 
            private String creatorId; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String modifiedTime; 
            private Long projectId; 
            private Long tenantId; 

            /**
             * The ID of the API group that is associated with the business process in the API Gateway console.
             */
            public Builder apiGatewayGroupId(String apiGatewayGroupId) {
                this.apiGatewayGroupId = apiGatewayGroupId;
                return this;
            }

            /**
             * The time when the business process was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The user identifier (UID) of the creator of the business process. The value of this parameter may be empty for creators of some existing business processes.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The description of the business process.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The business process ID.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the business process.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The time when the business process was last modified.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The workspace ID.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
}
