// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataFlowTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataFlowTasksResponseBody</p>
 */
public class DescribeDataFlowTasksResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    private DescribeDataFlowTasksResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.taskInfo = builder.taskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataFlowTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private TaskInfo taskInfo; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TaskInfo.
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        public DescribeDataFlowTasksResponseBody build() {
            return new DescribeDataFlowTasksResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @NameInMap("ConflictPolicy")
        private String conflictPolicy;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataFlowId")
        private String dataFlowId;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Directory")
        private String directory;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FileSystemPath")
        private String fileSystemPath;

        @NameInMap("FilesystemId")
        private String filesystemId;

        @NameInMap("FsPath")
        private String fsPath;

        @NameInMap("Originator")
        private String originator;

        @NameInMap("Progress")
        private Long progress;

        @NameInMap("ReportPath")
        private String reportPath;

        @NameInMap("SourceStorage")
        private String sourceStorage;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskAction")
        private String taskAction;

        @NameInMap("TaskId")
        private String taskId;

        private Task(Builder builder) {
            this.conflictPolicy = builder.conflictPolicy;
            this.createTime = builder.createTime;
            this.dataFlowId = builder.dataFlowId;
            this.dataType = builder.dataType;
            this.directory = builder.directory;
            this.endTime = builder.endTime;
            this.fileSystemPath = builder.fileSystemPath;
            this.filesystemId = builder.filesystemId;
            this.fsPath = builder.fsPath;
            this.originator = builder.originator;
            this.progress = builder.progress;
            this.reportPath = builder.reportPath;
            this.sourceStorage = builder.sourceStorage;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskAction = builder.taskAction;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return conflictPolicy
         */
        public String getConflictPolicy() {
            return this.conflictPolicy;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataFlowId
         */
        public String getDataFlowId() {
            return this.dataFlowId;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fileSystemPath
         */
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        /**
         * @return filesystemId
         */
        public String getFilesystemId() {
            return this.filesystemId;
        }

        /**
         * @return fsPath
         */
        public String getFsPath() {
            return this.fsPath;
        }

        /**
         * @return originator
         */
        public String getOriginator() {
            return this.originator;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        /**
         * @return reportPath
         */
        public String getReportPath() {
            return this.reportPath;
        }

        /**
         * @return sourceStorage
         */
        public String getSourceStorage() {
            return this.sourceStorage;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskAction
         */
        public String getTaskAction() {
            return this.taskAction;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String conflictPolicy; 
            private String createTime; 
            private String dataFlowId; 
            private String dataType; 
            private String directory; 
            private String endTime; 
            private String fileSystemPath; 
            private String filesystemId; 
            private String fsPath; 
            private String originator; 
            private Long progress; 
            private String reportPath; 
            private String sourceStorage; 
            private String startTime; 
            private String status; 
            private String taskAction; 
            private String taskId; 

            /**
             * ConflictPolicy.
             */
            public Builder conflictPolicy(String conflictPolicy) {
                this.conflictPolicy = conflictPolicy;
                return this;
            }

            /**
             * The time when the task was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataFlowId.
             */
            public Builder dataFlowId(String dataFlowId) {
                this.dataFlowId = dataFlowId;
                return this;
            }

            /**
             * null Valid values:
             * <p>
             * 
             * *   null null
             * *   null
             * *   null
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * The time when the task ended.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * *
             * <p>
             * *
             * *
             * *   null
             */
            public Builder fileSystemPath(String fileSystemPath) {
                this.fileSystemPath = fileSystemPath;
                return this;
            }

            /**
             * FilesystemId.
             */
            public Builder filesystemId(String filesystemId) {
                this.filesystemId = filesystemId;
                return this;
            }

            /**
             * null
             */
            public Builder fsPath(String fsPath) {
                this.fsPath = fsPath;
                return this;
            }

            /**
             * null Valid values:
             * <p>
             * 
             * *   null
             * *   null
             */
            public Builder originator(String originator) {
                this.originator = originator;
                return this;
            }

            /**
             * null null
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * null
             * <p>
             * 
             * null``
             * 
             * Limits:
             * 
             * *   null
             * *   The name must be encoded in UTF-8.
             */
            public Builder reportPath(String reportPath) {
                this.reportPath = reportPath;
                return this;
            }

            /**
             * ://
             * <p>
             * 
             * *
             * *   *
             *     *
             *     *
             *     *   [](http://https://。)
             * 
             * **
             * 
             * ****
             */
            public Builder sourceStorage(String sourceStorage) {
                this.sourceStorage = sourceStorage;
                return this;
            }

            /**
             * null
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * null Valid values:
             * <p>
             * 
             * *   null
             * *   null
             * *   null
             * *   null
             * *   null
             * *   null
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * null Valid values:
             * <p>
             * 
             * *   null
             * *   null
             * *   null null
             * *   null
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    public static class TaskInfo extends TeaModel {
        @NameInMap("Task")
        private java.util.List < Task> task;

        private TaskInfo(Builder builder) {
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return task
         */
        public java.util.List < Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List < Task> task; 

            /**
             * Task.
             */
            public Builder task(java.util.List < Task> task) {
                this.task = task;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
