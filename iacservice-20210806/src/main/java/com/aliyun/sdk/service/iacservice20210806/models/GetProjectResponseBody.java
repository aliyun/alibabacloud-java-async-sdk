// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
    @com.aliyun.core.annotation.NameInMap("project")
    private Project project;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
         * <p>The project details.</p>
         */
        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7FA0FF4A-ABD4-54F6-BEAC-B4273EBA10A2</p>
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
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("taskCnt")
        private Long taskCnt;

        private Project(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.taskCnt = builder.taskCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return taskCnt
         */
        public Long getTaskCnt() {
            return this.taskCnt;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String projectId; 
            private Long taskCnt; 

            private Builder() {
            } 

            private Builder(Project model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.projectId = model.projectId;
                this.taskCnt = model.taskCnt;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-06T06:11:27Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The project description. Length: 0 to 1024 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>p-433aead7560572f8d95b25775c</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder taskCnt(Long taskCnt) {
                this.taskCnt = taskCnt;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
}
