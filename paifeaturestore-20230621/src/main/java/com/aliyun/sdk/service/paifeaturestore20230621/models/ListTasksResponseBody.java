// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link ListTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksResponseBody</p>
 */
public class ListTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tasks> tasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTasksResponseBody model) {
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTasksResponseBody build() {
            return new ListTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtExecutedTime")
        private String gmtExecutedTime;

        @com.aliyun.core.annotation.NameInMap("GmtFinishedTime")
        private String gmtFinishedTime;

        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Tasks(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtExecutedTime = builder.gmtExecutedTime;
            this.gmtFinishedTime = builder.gmtFinishedTime;
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtExecutedTime
         */
        public String getGmtExecutedTime() {
            return this.gmtExecutedTime;
        }

        /**
         * @return gmtFinishedTime
         */
        public String getGmtFinishedTime() {
            return this.gmtFinishedTime;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtExecutedTime; 
            private String gmtFinishedTime; 
            private String objectId; 
            private String objectType; 
            private String projectId; 
            private String projectName; 
            private String status; 
            private String taskId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtExecutedTime = model.gmtExecutedTime;
                this.gmtFinishedTime = model.gmtFinishedTime;
                this.objectId = model.objectId;
                this.objectType = model.objectType;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.status = model.status;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtExecutedTime.
             */
            public Builder gmtExecutedTime(String gmtExecutedTime) {
                this.gmtExecutedTime = gmtExecutedTime;
                return this;
            }

            /**
             * GmtFinishedTime.
             */
            public Builder gmtFinishedTime(String gmtFinishedTime) {
                this.gmtFinishedTime = gmtFinishedTime;
                return this;
            }

            /**
             * ObjectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
