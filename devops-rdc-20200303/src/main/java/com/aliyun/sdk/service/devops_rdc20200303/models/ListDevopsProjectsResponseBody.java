// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDevopsProjectsResponseBody</p>
 */
public class ListDevopsProjectsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Object")
    private Object object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successful")
    private Boolean successful;

    private ListDevopsProjectsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevopsProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return object
     */
    public Object getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successful
     */
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private Object object; 
        private String requestId; 
        private Boolean successful; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(Object object) {
            this.object = object;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Successful.
         */
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        public ListDevopsProjectsResponseBody build() {
            return new ListDevopsProjectsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Created")
        private String created;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsArchived")
        private Boolean isArchived;

        @NameInMap("IsPublic")
        private Boolean isPublic;

        @NameInMap("IsStar")
        private Boolean isStar;

        @NameInMap("IsTemplate")
        private Boolean isTemplate;

        @NameInMap("Logo")
        private String logo;

        @NameInMap("MembersCount")
        private Integer membersCount;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("RoleId")
        private String roleId;

        @NameInMap("TasksCount")
        private Integer tasksCount;

        @NameInMap("Updated")
        private String updated;

        @NameInMap("Visibility")
        private String visibility;

        private Result(Builder builder) {
            this.created = builder.created;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.id = builder.id;
            this.isArchived = builder.isArchived;
            this.isPublic = builder.isPublic;
            this.isStar = builder.isStar;
            this.isTemplate = builder.isTemplate;
            this.logo = builder.logo;
            this.membersCount = builder.membersCount;
            this.name = builder.name;
            this.organizationId = builder.organizationId;
            this.roleId = builder.roleId;
            this.tasksCount = builder.tasksCount;
            this.updated = builder.updated;
            this.visibility = builder.visibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isArchived
         */
        public Boolean getIsArchived() {
            return this.isArchived;
        }

        /**
         * @return isPublic
         */
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        /**
         * @return isStar
         */
        public Boolean getIsStar() {
            return this.isStar;
        }

        /**
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return membersCount
         */
        public Integer getMembersCount() {
            return this.membersCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return tasksCount
         */
        public Integer getTasksCount() {
            return this.tasksCount;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private String created; 
            private String creatorId; 
            private String description; 
            private String id; 
            private Boolean isArchived; 
            private Boolean isPublic; 
            private Boolean isStar; 
            private Boolean isTemplate; 
            private String logo; 
            private Integer membersCount; 
            private String name; 
            private String organizationId; 
            private String roleId; 
            private Integer tasksCount; 
            private String updated; 
            private String visibility; 

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsArchived.
             */
            public Builder isArchived(Boolean isArchived) {
                this.isArchived = isArchived;
                return this;
            }

            /**
             * IsPublic.
             */
            public Builder isPublic(Boolean isPublic) {
                this.isPublic = isPublic;
                return this;
            }

            /**
             * IsStar.
             */
            public Builder isStar(Boolean isStar) {
                this.isStar = isStar;
                return this;
            }

            /**
             * IsTemplate.
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * Logo.
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * MembersCount.
             */
            public Builder membersCount(Integer membersCount) {
                this.membersCount = membersCount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * RoleId.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * TasksCount.
             */
            public Builder tasksCount(Integer tasksCount) {
                this.tasksCount = tasksCount;
                return this;
            }

            /**
             * Updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * Visibility.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Object extends TeaModel {
        @NameInMap("NextPageToken")
        private String nextPageToken;

        @NameInMap("Result")
        private java.util.List < Result> result;

        private Object(Builder builder) {
            this.nextPageToken = builder.nextPageToken;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private String nextPageToken; 
            private java.util.List < Result> result; 

            /**
             * NextPageToken.
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
