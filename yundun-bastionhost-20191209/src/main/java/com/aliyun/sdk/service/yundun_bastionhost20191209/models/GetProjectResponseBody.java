// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectResponseBody</p>
 */
public class GetProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Project")
    private Project project;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProjectResponseBody(Builder builder) {
        this.project = builder.project;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public Project getProject() {
        return this.project;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Project project; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProjectResponseBody model) {
            this.project = model.project;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A short description of struct</p>
         */
        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class NotifyReceivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("ReceiverId")
        private String receiverId;

        private NotifyReceivers(Builder builder) {
            this.email = builder.email;
            this.name = builder.name;
            this.phone = builder.phone;
            this.receiverId = builder.receiverId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyReceivers create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return receiverId
         */
        public String getReceiverId() {
            return this.receiverId;
        }

        public static final class Builder {
            private String email; 
            private String name; 
            private String phone; 
            private String receiverId; 

            private Builder() {
            } 

            private Builder(NotifyReceivers model) {
                this.email = model.email;
                this.name = model.name;
                this.phone = model.phone;
                this.receiverId = model.receiverId;
            } 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
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
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * ReceiverId.
             */
            public Builder receiverId(String receiverId) {
                this.receiverId = receiverId;
                return this;
            }

            public NotifyReceivers build() {
                return new NotifyReceivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCount")
        private Integer appCount;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("DatabaseCount")
        private Integer databaseCount;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HostCount")
        private Integer hostCount;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("MemberIds")
        private java.util.List<String> memberIds;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotifyReceivers")
        private java.util.List<NotifyReceivers> notifyReceivers;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private Long updatedAt;

        private Project(Builder builder) {
            this.appCount = builder.appCount;
            this.createdAt = builder.createdAt;
            this.databaseCount = builder.databaseCount;
            this.description = builder.description;
            this.hostCount = builder.hostCount;
            this.isDefault = builder.isDefault;
            this.memberIds = builder.memberIds;
            this.name = builder.name;
            this.notifyReceivers = builder.notifyReceivers;
            this.projectId = builder.projectId;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return appCount
         */
        public Integer getAppCount() {
            return this.appCount;
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return databaseCount
         */
        public Integer getDatabaseCount() {
            return this.databaseCount;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hostCount
         */
        public Integer getHostCount() {
            return this.hostCount;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return memberIds
         */
        public java.util.List<String> getMemberIds() {
            return this.memberIds;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notifyReceivers
         */
        public java.util.List<NotifyReceivers> getNotifyReceivers() {
            return this.notifyReceivers;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Integer appCount; 
            private Long createdAt; 
            private Integer databaseCount; 
            private String description; 
            private Integer hostCount; 
            private Boolean isDefault; 
            private java.util.List<String> memberIds; 
            private String name; 
            private java.util.List<NotifyReceivers> notifyReceivers; 
            private Long projectId; 
            private Long updatedAt; 

            private Builder() {
            } 

            private Builder(Project model) {
                this.appCount = model.appCount;
                this.createdAt = model.createdAt;
                this.databaseCount = model.databaseCount;
                this.description = model.description;
                this.hostCount = model.hostCount;
                this.isDefault = model.isDefault;
                this.memberIds = model.memberIds;
                this.name = model.name;
                this.notifyReceivers = model.notifyReceivers;
                this.projectId = model.projectId;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * AppCount.
             */
            public Builder appCount(Integer appCount) {
                this.appCount = appCount;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * DatabaseCount.
             */
            public Builder databaseCount(Integer databaseCount) {
                this.databaseCount = databaseCount;
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
             * HostCount.
             */
            public Builder hostCount(Integer hostCount) {
                this.hostCount = hostCount;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * MemberIds.
             */
            public Builder memberIds(java.util.List<String> memberIds) {
                this.memberIds = memberIds;
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
             * NotifyReceivers.
             */
            public Builder notifyReceivers(java.util.List<NotifyReceivers> notifyReceivers) {
                this.notifyReceivers = notifyReceivers;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
}
