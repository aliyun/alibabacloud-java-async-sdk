// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowResponseBody</p>
 */
public class DescribeWorkflowResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("taskRelations")
    private java.util.List < TaskRelations> taskRelations;

    @NameInMap("tasks")
    private java.util.List < Tasks> tasks;

    private DescribeWorkflowResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskRelations = builder.taskRelations;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskRelations
     */
    public java.util.List < TaskRelations> getTaskRelations() {
        return this.taskRelations;
    }

    /**
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TaskRelations> taskRelations; 
        private java.util.List < Tasks> tasks; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * taskRelations.
         */
        public Builder taskRelations(java.util.List < TaskRelations> taskRelations) {
            this.taskRelations = taskRelations;
            return this;
        }

        /**
         * tasks.
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public DescribeWorkflowResponseBody build() {
            return new DescribeWorkflowResponseBody(this);
        } 

    } 

    public static class TaskRelations extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("postTaskId")
        private Long postTaskId;

        @NameInMap("postTaskVersion")
        private Integer postTaskVersion;

        @NameInMap("preTaskId")
        private Long preTaskId;

        @NameInMap("preTaskVersion")
        private Integer preTaskVersion;

        private TaskRelations(Builder builder) {
            this.name = builder.name;
            this.postTaskId = builder.postTaskId;
            this.postTaskVersion = builder.postTaskVersion;
            this.preTaskId = builder.preTaskId;
            this.preTaskVersion = builder.preTaskVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskRelations create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return postTaskId
         */
        public Long getPostTaskId() {
            return this.postTaskId;
        }

        /**
         * @return postTaskVersion
         */
        public Integer getPostTaskVersion() {
            return this.postTaskVersion;
        }

        /**
         * @return preTaskId
         */
        public Long getPreTaskId() {
            return this.preTaskId;
        }

        /**
         * @return preTaskVersion
         */
        public Integer getPreTaskVersion() {
            return this.preTaskVersion;
        }

        public static final class Builder {
            private String name; 
            private Long postTaskId; 
            private Integer postTaskVersion; 
            private Long preTaskId; 
            private Integer preTaskVersion; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * postTaskId.
             */
            public Builder postTaskId(Long postTaskId) {
                this.postTaskId = postTaskId;
                return this;
            }

            /**
             * postTaskVersion.
             */
            public Builder postTaskVersion(Integer postTaskVersion) {
                this.postTaskVersion = postTaskVersion;
                return this;
            }

            /**
             * preTaskId.
             */
            public Builder preTaskId(Long preTaskId) {
                this.preTaskId = preTaskId;
                return this;
            }

            /**
             * preTaskVersion.
             */
            public Builder preTaskVersion(Integer preTaskVersion) {
                this.preTaskVersion = preTaskVersion;
                return this;
            }

            public TaskRelations build() {
                return new TaskRelations(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("name")
        private String name;

        @NameInMap("taskId")
        private Long taskId;

        @NameInMap("version")
        private Integer version;

        private Tasks(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.taskId = builder.taskId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
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
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private Long taskId; 
            private Integer version; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
