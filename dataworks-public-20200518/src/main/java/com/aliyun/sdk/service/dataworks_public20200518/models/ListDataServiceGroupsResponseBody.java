// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceGroupsResponseBody</p>
 */
public class ListDataServiceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupPagingResult")
    private GroupPagingResult groupPagingResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataServiceGroupsResponseBody(Builder builder) {
        this.groupPagingResult = builder.groupPagingResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupPagingResult
     */
    public GroupPagingResult getGroupPagingResult() {
        return this.groupPagingResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GroupPagingResult groupPagingResult; 
        private String requestId; 

        /**
         * The paging result for the business processes.
         */
        public Builder groupPagingResult(GroupPagingResult groupPagingResult) {
            this.groupPagingResult = groupPagingResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataServiceGroupsResponseBody build() {
            return new ListDataServiceGroupsResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
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

        private Groups(Builder builder) {
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

        public static Groups create() {
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
             * The ID of the API Gateway group to which the workflow is bound.
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
             * The time when the business process was modified.
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

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    public static class GroupPagingResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List < Groups> groups;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private GroupPagingResult(Builder builder) {
            this.groups = builder.groups;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupPagingResult create() {
            return builder().build();
        }

        /**
         * @return groups
         */
        public java.util.List < Groups> getGroups() {
            return this.groups;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Groups> groups; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The business processes.
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * The page number. The value of this parameter is the same as that of the PageNumber parameter in the request.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page. Valid values: 1 to 100. Default value: 10.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public GroupPagingResult build() {
                return new GroupPagingResult(this);
            } 

        } 

    }
}
