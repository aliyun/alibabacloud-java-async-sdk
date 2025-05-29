// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ListRenderingProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRenderingProjectsResponseBody</p>
 */
public class ListRenderingProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Projects")
    private java.util.List<Projects> projects;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRenderingProjectsResponseBody(Builder builder) {
        this.projects = builder.projects;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projects
     */
    public java.util.List<Projects> getProjects() {
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
        private java.util.List<Projects> projects; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRenderingProjectsResponseBody model) {
            this.projects = model.projects;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Projects.
         */
        public Builder projects(java.util.List<Projects> projects) {
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

        public ListRenderingProjectsResponseBody build() {
            return new ListRenderingProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRenderingProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRenderingProjectsResponseBody</p>
     */
    public static class SessionAttribs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StartMode")
        private String startMode;

        private SessionAttribs(Builder builder) {
            this.startMode = builder.startMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionAttribs create() {
            return builder().build();
        }

        /**
         * @return startMode
         */
        public String getStartMode() {
            return this.startMode;
        }

        public static final class Builder {
            private String startMode; 

            private Builder() {
            } 

            private Builder(SessionAttribs model) {
                this.startMode = model.startMode;
            } 

            /**
             * StartMode.
             */
            public Builder startMode(String startMode) {
                this.startMode = startMode;
                return this;
            }

            public SessionAttribs build() {
                return new SessionAttribs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRenderingProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRenderingProjectsResponseBody</p>
     */
    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SessionAttribs")
        private SessionAttribs sessionAttribs;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Projects(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.sessionAttribs = builder.sessionAttribs;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return sessionAttribs
         */
        public SessionAttribs getSessionAttribs() {
            return this.sessionAttribs;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String projectId; 
            private String projectName; 
            private SessionAttribs sessionAttribs; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Projects model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.sessionAttribs = model.sessionAttribs;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * SessionAttribs.
             */
            public Builder sessionAttribs(SessionAttribs sessionAttribs) {
                this.sessionAttribs = sessionAttribs;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
}
