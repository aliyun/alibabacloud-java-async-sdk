// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Projects")
    private java.util.List < Projects> projects;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListProjectsResponseBody(Builder builder) {
        this.projects = builder.projects;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return projects
     */
    public java.util.List < Projects> getProjects() {
        return this.projects;
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
        private java.util.List < Projects> projects; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Projects.
         */
        public Builder projects(java.util.List < Projects> projects) {
            this.projects = projects;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("DefaultDomainId")
        private String defaultDomainId;

        @com.aliyun.core.annotation.NameInMap("DefaultLayerId")
        private String defaultLayerId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Projects(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.defaultDomainId = builder.defaultDomainId;
            this.defaultLayerId = builder.defaultLayerId;
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return defaultDomainId
         */
        public String getDefaultDomainId() {
            return this.defaultDomainId;
        }

        /**
         * @return defaultLayerId
         */
        public String getDefaultLayerId() {
            return this.defaultLayerId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String aliyunId; 
            private String defaultDomainId; 
            private String defaultLayerId; 
            private String description; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String name; 
            private String projectId; 
            private String workspaceId; 

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * DefaultDomainId.
             */
            public Builder defaultDomainId(String defaultDomainId) {
                this.defaultDomainId = defaultDomainId;
                return this;
            }

            /**
             * DefaultLayerId.
             */
            public Builder defaultLayerId(String defaultLayerId) {
                this.defaultLayerId = defaultLayerId;
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
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
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
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
}
