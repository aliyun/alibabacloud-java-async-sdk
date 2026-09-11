// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeDataFlowTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataFlowTasksResponseBody</p>
 */
public class DescribeDataFlowTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDataFlowTasksResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.taskInfo = model.taskInfo;
        } 

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If the return results are truncated, you can use NextToken to initiate a new request to retrieve the content after the truncation point.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
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

    /**
     * 
     * {@link DescribeDataFlowTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowTasksResponseBody</p>
     */
    public static class ProgressStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private Long actualBytes;

        @com.aliyun.core.annotation.NameInMap("ActualFiles")
        private Long actualFiles;

        @com.aliyun.core.annotation.NameInMap("AverageSpeed")
        private Long averageSpeed;

        @com.aliyun.core.annotation.NameInMap("BytesDone")
        private Long bytesDone;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("FilesDone")
        private Long filesDone;

        @com.aliyun.core.annotation.NameInMap("FilesTotal")
        private Long filesTotal;

        @com.aliyun.core.annotation.NameInMap("RemainTime")
        private Long remainTime;

        private ProgressStats(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.actualFiles = builder.actualFiles;
            this.averageSpeed = builder.averageSpeed;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
            this.filesDone = builder.filesDone;
            this.filesTotal = builder.filesTotal;
            this.remainTime = builder.remainTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgressStats create() {
            return builder().build();
        }

        /**
         * @return actualBytes
         */
        public Long getActualBytes() {
            return this.actualBytes;
        }

        /**
         * @return actualFiles
         */
        public Long getActualFiles() {
            return this.actualFiles;
        }

        /**
         * @return averageSpeed
         */
        public Long getAverageSpeed() {
            return this.averageSpeed;
        }

        /**
         * @return bytesDone
         */
        public Long getBytesDone() {
            return this.bytesDone;
        }

        /**
         * @return bytesTotal
         */
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        /**
         * @return filesDone
         */
        public Long getFilesDone() {
            return this.filesDone;
        }

        /**
         * @return filesTotal
         */
        public Long getFilesTotal() {
            return this.filesTotal;
        }

        /**
         * @return remainTime
         */
        public Long getRemainTime() {
            return this.remainTime;
        }

        public static final class Builder {
            private Long actualBytes; 
            private Long actualFiles; 
            private Long averageSpeed; 
            private Long bytesDone; 
            private Long bytesTotal; 
            private Long filesDone; 
            private Long filesTotal; 
            private Long remainTime; 

            private Builder() {
            } 

            private Builder(ProgressStats model) {
                this.actualBytes = model.actualBytes;
                this.actualFiles = model.actualFiles;
                this.averageSpeed = model.averageSpeed;
                this.bytesDone = model.bytesDone;
                this.bytesTotal = model.bytesTotal;
                this.filesDone = model.filesDone;
                this.filesTotal = model.filesTotal;
                this.remainTime = model.remainTime;
            } 

            /**
             * ActualBytes.
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * ActualFiles.
             */
            public Builder actualFiles(Long actualFiles) {
                this.actualFiles = actualFiles;
                return this;
            }

            /**
             * AverageSpeed.
             */
            public Builder averageSpeed(Long averageSpeed) {
                this.averageSpeed = averageSpeed;
                return this;
            }

            /**
             * BytesDone.
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * BytesTotal.
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * FilesDone.
             */
            public Builder filesDone(Long filesDone) {
                this.filesDone = filesDone;
                return this;
            }

            /**
             * FilesTotal.
             */
            public Builder filesTotal(Long filesTotal) {
                this.filesTotal = filesTotal;
                return this;
            }

            /**
             * RemainTime.
             */
            public Builder remainTime(Long remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            public ProgressStats build() {
                return new ProgressStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataFlowTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowTasksResponseBody</p>
     */
    public static class Report extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private Report(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Report create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String name; 
            private String path; 

            private Builder() {
            } 

            private Builder(Report model) {
                this.name = model.name;
                this.path = model.path;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Report build() {
                return new Report(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataFlowTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowTasksResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Report")
        private java.util.List<Report> report;

        private Reports(Builder builder) {
            this.report = builder.report;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return report
         */
        public java.util.List<Report> getReport() {
            return this.report;
        }

        public static final class Builder {
            private java.util.List<Report> report; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.report = model.report;
            } 

            /**
             * Report.
             */
            public Builder report(java.util.List<Report> report) {
                this.report = report;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataFlowTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowTasksResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConflictPolicy")
        private String conflictPolicy;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataFlowId")
        private String dataFlowId;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("DstDirectory")
        private String dstDirectory;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EntryList")
        private String entryList;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("FileSystemPath")
        private String fileSystemPath;

        @com.aliyun.core.annotation.NameInMap("FilesystemId")
        private String filesystemId;

        @com.aliyun.core.annotation.NameInMap("FsPath")
        private String fsPath;

        @com.aliyun.core.annotation.NameInMap("Includes")
        private String includes;

        @com.aliyun.core.annotation.NameInMap("Originator")
        private String originator;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Long progress;

        @com.aliyun.core.annotation.NameInMap("ProgressStats")
        private ProgressStats progressStats;

        @com.aliyun.core.annotation.NameInMap("ReportPath")
        @Deprecated
        private String reportPath;

        @com.aliyun.core.annotation.NameInMap("Reports")
        private Reports reports;

        @com.aliyun.core.annotation.NameInMap("SourceStorage")
        private String sourceStorage;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskAction")
        private String taskAction;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TransferFileListPath")
        private String transferFileListPath;

        private Task(Builder builder) {
            this.conflictPolicy = builder.conflictPolicy;
            this.createTime = builder.createTime;
            this.dataFlowId = builder.dataFlowId;
            this.dataType = builder.dataType;
            this.directory = builder.directory;
            this.dstDirectory = builder.dstDirectory;
            this.endTime = builder.endTime;
            this.entryList = builder.entryList;
            this.errorMsg = builder.errorMsg;
            this.fileSystemPath = builder.fileSystemPath;
            this.filesystemId = builder.filesystemId;
            this.fsPath = builder.fsPath;
            this.includes = builder.includes;
            this.originator = builder.originator;
            this.progress = builder.progress;
            this.progressStats = builder.progressStats;
            this.reportPath = builder.reportPath;
            this.reports = builder.reports;
            this.sourceStorage = builder.sourceStorage;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskAction = builder.taskAction;
            this.taskId = builder.taskId;
            this.transferFileListPath = builder.transferFileListPath;
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
         * @return dstDirectory
         */
        public String getDstDirectory() {
            return this.dstDirectory;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return entryList
         */
        public String getEntryList() {
            return this.entryList;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
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
         * @return includes
         */
        public String getIncludes() {
            return this.includes;
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
         * @return progressStats
         */
        public ProgressStats getProgressStats() {
            return this.progressStats;
        }

        /**
         * @return reportPath
         */
        public String getReportPath() {
            return this.reportPath;
        }

        /**
         * @return reports
         */
        public Reports getReports() {
            return this.reports;
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

        /**
         * @return transferFileListPath
         */
        public String getTransferFileListPath() {
            return this.transferFileListPath;
        }

        public static final class Builder {
            private String conflictPolicy; 
            private String createTime; 
            private String dataFlowId; 
            private String dataType; 
            private String directory; 
            private String dstDirectory; 
            private String endTime; 
            private String entryList; 
            private String errorMsg; 
            private String fileSystemPath; 
            private String filesystemId; 
            private String fsPath; 
            private String includes; 
            private String originator; 
            private Long progress; 
            private ProgressStats progressStats; 
            private String reportPath; 
            private Reports reports; 
            private String sourceStorage; 
            private String startTime; 
            private String status; 
            private String taskAction; 
            private String taskId; 
            private String transferFileListPath; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.conflictPolicy = model.conflictPolicy;
                this.createTime = model.createTime;
                this.dataFlowId = model.dataFlowId;
                this.dataType = model.dataType;
                this.directory = model.directory;
                this.dstDirectory = model.dstDirectory;
                this.endTime = model.endTime;
                this.entryList = model.entryList;
                this.errorMsg = model.errorMsg;
                this.fileSystemPath = model.fileSystemPath;
                this.filesystemId = model.filesystemId;
                this.fsPath = model.fsPath;
                this.includes = model.includes;
                this.originator = model.originator;
                this.progress = model.progress;
                this.progressStats = model.progressStats;
                this.reportPath = model.reportPath;
                this.reports = model.reports;
                this.sourceStorage = model.sourceStorage;
                this.startTime = model.startTime;
                this.status = model.status;
                this.taskAction = model.taskAction;
                this.taskId = model.taskId;
                this.transferFileListPath = model.transferFileListPath;
            } 

            /**
             * ConflictPolicy.
             */
            public Builder conflictPolicy(String conflictPolicy) {
                this.conflictPolicy = conflictPolicy;
                return this;
            }

            /**
             * CreateTime.
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
             * DataType.
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
             * DstDirectory.
             */
            public Builder dstDirectory(String dstDirectory) {
                this.dstDirectory = dstDirectory;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EntryList.
             */
            public Builder entryList(String entryList) {
                this.entryList = entryList;
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
             * FileSystemPath.
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
             * FsPath.
             */
            public Builder fsPath(String fsPath) {
                this.fsPath = fsPath;
                return this;
            }

            /**
             * Includes.
             */
            public Builder includes(String includes) {
                this.includes = includes;
                return this;
            }

            /**
             * Originator.
             */
            public Builder originator(String originator) {
                this.originator = originator;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ProgressStats.
             */
            public Builder progressStats(ProgressStats progressStats) {
                this.progressStats = progressStats;
                return this;
            }

            /**
             * ReportPath.
             */
            public Builder reportPath(String reportPath) {
                this.reportPath = reportPath;
                return this;
            }

            /**
             * Reports.
             */
            public Builder reports(Reports reports) {
                this.reports = reports;
                return this;
            }

            /**
             * SourceStorage.
             */
            public Builder sourceStorage(String sourceStorage) {
                this.sourceStorage = sourceStorage;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * TaskAction.
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

            /**
             * TransferFileListPath.
             */
            public Builder transferFileListPath(String transferFileListPath) {
                this.transferFileListPath = transferFileListPath;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataFlowTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowTasksResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Task")
        private java.util.List<Task> task;

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
        public java.util.List<Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List<Task> task; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.task = model.task;
            } 

            /**
             * Task.
             */
            public Builder task(java.util.List<Task> task) {
                this.task = task;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
