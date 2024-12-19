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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
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
         * <p>The information about data flow tasks.</p>
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

            /**
             * <p>The actual amount of data for which the data flow task is complete. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>131092971520</p>
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * <p>The actual number of files for which the data flow task is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder actualFiles(Long actualFiles) {
                this.actualFiles = actualFiles;
                return this;
            }

            /**
             * <p>The average flow velocity. Unit: bytes/s.</p>
             * 
             * <strong>example:</strong>
             * <p>342279299</p>
             */
            public Builder averageSpeed(Long averageSpeed) {
                this.averageSpeed = averageSpeed;
                return this;
            }

            /**
             * <p>The amount of data (including skipped data) for which the data flow task is complete. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>131092971520</p>
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * <p>The amount of data scanned on the source. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>131092971520</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * <p>The number of files (including skipped files) for which the data flow task is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder filesDone(Long filesDone) {
                this.filesDone = filesDone;
                return this;
            }

            /**
             * <p>The number of files scanned on the source.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder filesTotal(Long filesTotal) {
                this.filesTotal = filesTotal;
                return this;
            }

            /**
             * <p>The estimated remaining execution time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>437</p>
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

            /**
             * <p>The name of the report.</p>
             * <ul>
             * <li><p>CPFS:</p>
             * <p>TotalFilesReport: task reports.</p>
             * </li>
             * <li><p>CPFS for LINGJUN:</p>
             * <ul>
             * <li>FailedFilesReport: failed file reports.</li>
             * <li>SkippedFilesReport: skipped file reports.</li>
             * <li>SuccessFilesReport: successful file reports.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TotalFilesReport</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The report URL.</p>
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

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("FileSystemPath")
        private String fileSystemPath;

        @com.aliyun.core.annotation.NameInMap("FilesystemId")
        private String filesystemId;

        @com.aliyun.core.annotation.NameInMap("FsPath")
        private String fsPath;

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

        private Task(Builder builder) {
            this.conflictPolicy = builder.conflictPolicy;
            this.createTime = builder.createTime;
            this.dataFlowId = builder.dataFlowId;
            this.dataType = builder.dataType;
            this.directory = builder.directory;
            this.dstDirectory = builder.dstDirectory;
            this.endTime = builder.endTime;
            this.errorMsg = builder.errorMsg;
            this.fileSystemPath = builder.fileSystemPath;
            this.filesystemId = builder.filesystemId;
            this.fsPath = builder.fsPath;
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

        public static final class Builder {
            private String conflictPolicy; 
            private String createTime; 
            private String dataFlowId; 
            private String dataType; 
            private String directory; 
            private String dstDirectory; 
            private String endTime; 
            private String errorMsg; 
            private String fileSystemPath; 
            private String filesystemId; 
            private String fsPath; 
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

            /**
             * <p>The conflict policy for files with the same name. Valid values:</p>
             * <ul>
             * <li>SKIP_THE_FILE: skips files with the same name.</li>
             * <li>KEEP_LATEST: compares the update time and keeps the latest version.</li>
             * <li>OVERWRITE_EXISTING: forcibly overwrites the existing file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KEEP_LATEST</p>
             */
            public Builder conflictPolicy(String conflictPolicy) {
                this.conflictPolicy = conflictPolicy;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-04 18:27:35</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the data flow.</p>
             * 
             * <strong>example:</strong>
             * <p>dfid-194433a5be3****</p>
             */
            public Builder dataFlowId(String dataFlowId) {
                this.dataFlowId = dataFlowId;
                return this;
            }

            /**
             * <p>The type of data on which operations are performed by the data flow task. Valid values:</p>
             * <ul>
             * <li>Metadata: the metadata of a file, including the timestamp, ownership, and permission information of the file. If you select Metadata, only the metadata of the file is imported. You can only query the file. When you access the file data, the file is loaded from the source storage as required.</li>
             * <li>Data: the data blocks of the file.</li>
             * <li>MetaAndData: the metadata and data blocks of the file.</li>
             * </ul>
             * <blockquote>
             * <p> CPFS for LINGJUN supports only the MetaAndData type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Metadata</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The directory in which the data flow task is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>/path_in_cpfs/</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The directory mapped to the data flow task.</p>
             * 
             * <strong>example:</strong>
             * <p>/path_in_cpfs/</p>
             */
            public Builder dstDirectory(String dstDirectory) {
                this.dstDirectory = dstDirectory;
                return this;
            }

            /**
             * <p>The time when the task ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-04 18:27:35</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The cause of the task exception.</p>
             * <blockquote>
             * <p> If this parameter is not returned or the return value is empty, no error occurs.</p>
             * </blockquote>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The directory of the fileset in the CPFS file system.</p>
             * <p>Limits:</p>
             * <ul>
             * <li>The directory must be 2 to 1024 characters in length.</li>
             * <li>The directory must be encoded in UTF-8.</li>
             * <li>The directory must start and end with a forward slash (/).</li>
             * <li>The directory must be a fileset directory in the CPFS file system.</li>
             * </ul>
             * <blockquote>
             * <p> Only CPFS supports this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/a/b/c/</p>
             */
            public Builder fileSystemPath(String fileSystemPath) {
                this.fileSystemPath = fileSystemPath;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>cpfs-099394bd928c****</p>
             */
            public Builder filesystemId(String filesystemId) {
                this.filesystemId = filesystemId;
                return this;
            }

            /**
             * <p>The path of the smart directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/aa/</p>
             */
            public Builder fsPath(String fsPath) {
                this.fsPath = fsPath;
                return this;
            }

            /**
             * <p>The initiator of the data flow task. Valid values:</p>
             * <ul>
             * <li>User: The task is initiated by a user.</li>
             * <li>System: The task is automatically initiated by CPFS based on the automatic update interval.</li>
             * </ul>
             * <blockquote>
             * <p> Only CPFS supports this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder originator(String originator) {
                this.originator = originator;
                return this;
            }

            /**
             * <p>The progress of the data flow task. The number of operations that have been performed by the data flow task.</p>
             * 
             * <strong>example:</strong>
             * <p>240</p>
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The progress of the data flow task.</p>
             */
            public Builder progressStats(ProgressStats progressStats) {
                this.progressStats = progressStats;
                return this;
            }

            /**
             * <p>The save path of data flow task reports in the CPFS file system.</p>
             * <ul>
             * <li>The task reports for a CPFS file system are generated in the <code>.dataflow_report</code> directory of the CPFS file system.</li>
             * <li>CPFS for LINGJUN returns an OSS download link for you to download the task reports.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/path_in_cpfs/reportfile.cvs</p>
             */
            public Builder reportPath(String reportPath) {
                this.reportPath = reportPath;
                return this;
            }

            /**
             * <p>The reports.</p>
             * <blockquote>
             * <p> Streaming tasks do not support reports.</p>
             * </blockquote>
             */
            public Builder reports(Reports reports) {
                this.reports = reports;
                return this;
            }

            /**
             * <p>The access path of the source storage. Format: <code>&lt;storage type&gt;://[&lt;account id&gt;:]&lt;path&gt;</code>.</p>
             * <p>Parameters:</p>
             * <ul>
             * <li><p>storage type: Only Object Storage Service (OSS) is supported.</p>
             * </li>
             * <li><p>account id: the UID of the account of the source storage.</p>
             * </li>
             * <li><p>path: the name of the OSS bucket. Limits:</p>
             * <ul>
             * <li>The name can contain only lowercase letters, digits, and hyphens (-). The name must start and end with a lowercase letter or digit.</li>
             * <li>The name can be up to 128 characters in length.</li>
             * <li>The name must be encoded in UTF-8.</li>
             * </ul>
             * </li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>The OSS bucket must be an existing bucket in the region.</p>
             * </li>
             * <li><p>Only CPFS for LINGJUN V2.6.0 and later support the account id parameter.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket1</p>
             */
            public Builder sourceStorage(String sourceStorage) {
                this.sourceStorage = sourceStorage;
                return this;
            }

            /**
             * <p>The time when the task started.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-04 18:27:35</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the data flow task. Valid values:</p>
             * <ul>
             * <li>Pending: The data flow task has been created and has not started.</li>
             * <li>Executing: The data flow task is being executed.</li>
             * <li>Failed: The data flow task failed to be executed. You can view the cause of the failure in the data flow task report.</li>
             * <li>Completed: The data flow task is completed. You can check that all the files have been correctly transferred in the data flow task report.</li>
             * <li>Canceled: The data flow task is canceled and is not completed.</li>
             * <li>Canceling: The data flow task is being canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the data flow task. Valid values:</p>
             * <ul>
             * <li>Import: imports data stored in the source storage to a CPFS file system.</li>
             * <li>Export: exports specified data from a CPFS file system to the source storage.</li>
             * <li>StreamImport: imports the specified data from the source storage to a CPFS file system in streaming mode.</li>
             * <li>StreamExport: exports specified data from a CPFS file system to the source storage in streaming mode.</li>
             * <li>Evict: releases the data blocks of a file in a CPFS file system. After the eviction, only the metadata of the file is retained in the CPFS file system. You can still query the file. However, the data blocks of the file are cleared and do not occupy the storage space in the CPFS file system. When you access the file data, the file is loaded from the source storage as required.</li>
             * <li>Inventory: obtains the inventory list managed by a data flow from the CPFS file system, providing the cache status of inventories in the data flow.</li>
             * </ul>
             * <blockquote>
             * <p> Only CPFS for LINGJUN V2.6.0 and later support StreamImport and StreamExport.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Import</p>
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * <p>The ID of the data flow task.</p>
             * 
             * <strong>example:</strong>
             * <p>taskId-12345678</p>
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
