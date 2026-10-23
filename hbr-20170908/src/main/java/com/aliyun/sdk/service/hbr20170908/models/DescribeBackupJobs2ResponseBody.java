// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupJobs2ResponseBody</p>
 */
public class DescribeBackupJobs2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupJobs")
    private BackupJobs backupJobs;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeBackupJobs2ResponseBody(Builder builder) {
        this.backupJobs = builder.backupJobs;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupJobs2ResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupJobs
     */
    public BackupJobs getBackupJobs() {
        return this.backupJobs;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private BackupJobs backupJobs; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBackupJobs2ResponseBody model) {
            this.backupJobs = model.backupJobs;
            this.code = model.code;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * BackupJobs.
         */
        public Builder backupJobs(BackupJobs backupJobs) {
            this.backupJobs = backupJobs;
            return this;
        }

        /**
         * <p>The return code. A value of 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned. If the request was successful, successful is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 99. The default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li><p>true: The request was successful.</p>
         * </li>
         * <li><p>false: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of backup jobs that meet the specified criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBackupJobs2ResponseBody build() {
            return new DescribeBackupJobs2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupJobs2ResponseBody</p>
     */
    public static class DiskNativeSnapshotIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskNativeSnapshotId")
        private java.util.List<String> diskNativeSnapshotId;

        private DiskNativeSnapshotIdList(Builder builder) {
            this.diskNativeSnapshotId = builder.diskNativeSnapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskNativeSnapshotIdList create() {
            return builder().build();
        }

        /**
         * @return diskNativeSnapshotId
         */
        public java.util.List<String> getDiskNativeSnapshotId() {
            return this.diskNativeSnapshotId;
        }

        public static final class Builder {
            private java.util.List<String> diskNativeSnapshotId; 

            private Builder() {
            } 

            private Builder(DiskNativeSnapshotIdList model) {
                this.diskNativeSnapshotId = model.diskNativeSnapshotId;
            } 

            /**
             * DiskNativeSnapshotId.
             */
            public Builder diskNativeSnapshotId(java.util.List<String> diskNativeSnapshotId) {
                this.diskNativeSnapshotId = diskNativeSnapshotId;
                return this;
            }

            public DiskNativeSnapshotIdList build() {
                return new DiskNativeSnapshotIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupJobs2ResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationNativeSnapshotErrorMessage")
        private String destinationNativeSnapshotErrorMessage;

        @com.aliyun.core.annotation.NameInMap("DestinationNativeSnapshotId")
        private String destinationNativeSnapshotId;

        @com.aliyun.core.annotation.NameInMap("DestinationNativeSnapshotProgress")
        private Integer destinationNativeSnapshotProgress;

        @com.aliyun.core.annotation.NameInMap("DestinationNativeSnapshotStatus")
        private String destinationNativeSnapshotStatus;

        @com.aliyun.core.annotation.NameInMap("DestinationRetention")
        private Long destinationRetention;

        @com.aliyun.core.annotation.NameInMap("DestinationSnapshotId")
        private String destinationSnapshotId;

        @com.aliyun.core.annotation.NameInMap("DiskNativeSnapshotIdList")
        private DiskNativeSnapshotIdList diskNativeSnapshotIdList;

        @com.aliyun.core.annotation.NameInMap("DoCopy")
        private Boolean doCopy;

        @com.aliyun.core.annotation.NameInMap("InstanceInfos")
        private java.util.Map<String, ?> instanceInfos;

        @com.aliyun.core.annotation.NameInMap("NativeSnapshotId")
        private String nativeSnapshotId;

        private Detail(Builder builder) {
            this.destinationNativeSnapshotErrorMessage = builder.destinationNativeSnapshotErrorMessage;
            this.destinationNativeSnapshotId = builder.destinationNativeSnapshotId;
            this.destinationNativeSnapshotProgress = builder.destinationNativeSnapshotProgress;
            this.destinationNativeSnapshotStatus = builder.destinationNativeSnapshotStatus;
            this.destinationRetention = builder.destinationRetention;
            this.destinationSnapshotId = builder.destinationSnapshotId;
            this.diskNativeSnapshotIdList = builder.diskNativeSnapshotIdList;
            this.doCopy = builder.doCopy;
            this.instanceInfos = builder.instanceInfos;
            this.nativeSnapshotId = builder.nativeSnapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return destinationNativeSnapshotErrorMessage
         */
        public String getDestinationNativeSnapshotErrorMessage() {
            return this.destinationNativeSnapshotErrorMessage;
        }

        /**
         * @return destinationNativeSnapshotId
         */
        public String getDestinationNativeSnapshotId() {
            return this.destinationNativeSnapshotId;
        }

        /**
         * @return destinationNativeSnapshotProgress
         */
        public Integer getDestinationNativeSnapshotProgress() {
            return this.destinationNativeSnapshotProgress;
        }

        /**
         * @return destinationNativeSnapshotStatus
         */
        public String getDestinationNativeSnapshotStatus() {
            return this.destinationNativeSnapshotStatus;
        }

        /**
         * @return destinationRetention
         */
        public Long getDestinationRetention() {
            return this.destinationRetention;
        }

        /**
         * @return destinationSnapshotId
         */
        public String getDestinationSnapshotId() {
            return this.destinationSnapshotId;
        }

        /**
         * @return diskNativeSnapshotIdList
         */
        public DiskNativeSnapshotIdList getDiskNativeSnapshotIdList() {
            return this.diskNativeSnapshotIdList;
        }

        /**
         * @return doCopy
         */
        public Boolean getDoCopy() {
            return this.doCopy;
        }

        /**
         * @return instanceInfos
         */
        public java.util.Map<String, ?> getInstanceInfos() {
            return this.instanceInfos;
        }

        /**
         * @return nativeSnapshotId
         */
        public String getNativeSnapshotId() {
            return this.nativeSnapshotId;
        }

        public static final class Builder {
            private String destinationNativeSnapshotErrorMessage; 
            private String destinationNativeSnapshotId; 
            private Integer destinationNativeSnapshotProgress; 
            private String destinationNativeSnapshotStatus; 
            private Long destinationRetention; 
            private String destinationSnapshotId; 
            private DiskNativeSnapshotIdList diskNativeSnapshotIdList; 
            private Boolean doCopy; 
            private java.util.Map<String, ?> instanceInfos; 
            private String nativeSnapshotId; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.destinationNativeSnapshotErrorMessage = model.destinationNativeSnapshotErrorMessage;
                this.destinationNativeSnapshotId = model.destinationNativeSnapshotId;
                this.destinationNativeSnapshotProgress = model.destinationNativeSnapshotProgress;
                this.destinationNativeSnapshotStatus = model.destinationNativeSnapshotStatus;
                this.destinationRetention = model.destinationRetention;
                this.destinationSnapshotId = model.destinationSnapshotId;
                this.diskNativeSnapshotIdList = model.diskNativeSnapshotIdList;
                this.doCopy = model.doCopy;
                this.instanceInfos = model.instanceInfos;
                this.nativeSnapshotId = model.nativeSnapshotId;
            } 

            /**
             * DestinationNativeSnapshotErrorMessage.
             */
            public Builder destinationNativeSnapshotErrorMessage(String destinationNativeSnapshotErrorMessage) {
                this.destinationNativeSnapshotErrorMessage = destinationNativeSnapshotErrorMessage;
                return this;
            }

            /**
             * DestinationNativeSnapshotId.
             */
            public Builder destinationNativeSnapshotId(String destinationNativeSnapshotId) {
                this.destinationNativeSnapshotId = destinationNativeSnapshotId;
                return this;
            }

            /**
             * DestinationNativeSnapshotProgress.
             */
            public Builder destinationNativeSnapshotProgress(Integer destinationNativeSnapshotProgress) {
                this.destinationNativeSnapshotProgress = destinationNativeSnapshotProgress;
                return this;
            }

            /**
             * DestinationNativeSnapshotStatus.
             */
            public Builder destinationNativeSnapshotStatus(String destinationNativeSnapshotStatus) {
                this.destinationNativeSnapshotStatus = destinationNativeSnapshotStatus;
                return this;
            }

            /**
             * DestinationRetention.
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * DestinationSnapshotId.
             */
            public Builder destinationSnapshotId(String destinationSnapshotId) {
                this.destinationSnapshotId = destinationSnapshotId;
                return this;
            }

            /**
             * DiskNativeSnapshotIdList.
             */
            public Builder diskNativeSnapshotIdList(DiskNativeSnapshotIdList diskNativeSnapshotIdList) {
                this.diskNativeSnapshotIdList = diskNativeSnapshotIdList;
                return this;
            }

            /**
             * DoCopy.
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * InstanceInfos.
             */
            public Builder instanceInfos(java.util.Map<String, ?> instanceInfos) {
                this.instanceInfos = instanceInfos;
                return this;
            }

            /**
             * NativeSnapshotId.
             */
            public Builder nativeSnapshotId(String nativeSnapshotId) {
                this.nativeSnapshotId = nativeSnapshotId;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupJobs2ResponseBody</p>
     */
    public static class TableNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableName")
        private java.util.List<String> tableName;

        private TableNames(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableNames create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public java.util.List<String> getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List<String> tableName; 

            private Builder() {
            } 

            private Builder(TableNames model) {
                this.tableName = model.tableName;
            } 

            /**
             * TableName.
             */
            public Builder tableName(java.util.List<String> tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableNames build() {
                return new TableNames(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupJobs2ResponseBody</p>
     */
    public static class OtsDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableNames")
        private TableNames tableNames;

        private OtsDetail(Builder builder) {
            this.tableNames = builder.tableNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtsDetail create() {
            return builder().build();
        }

        /**
         * @return tableNames
         */
        public TableNames getTableNames() {
            return this.tableNames;
        }

        public static final class Builder {
            private TableNames tableNames; 

            private Builder() {
            } 

            private Builder(OtsDetail model) {
                this.tableNames = model.tableNames;
            } 

            /**
             * TableNames.
             */
            public Builder tableNames(TableNames tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            public OtsDetail build() {
                return new OtsDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupJobs2ResponseBody</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private java.util.List<String> path;

        private Paths(Builder builder) {
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paths create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public java.util.List<String> getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List<String> path; 

            private Builder() {
            } 

            private Builder(Paths model) {
                this.path = model.path;
            } 

            /**
             * Path.
             */
            public Builder path(java.util.List<String> path) {
                this.path = path;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupJobs2ResponseBody</p>
     */
    public static class Report extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedFiles")
        private String failedFiles;

        @com.aliyun.core.annotation.NameInMap("ReportTaskStatus")
        private String reportTaskStatus;

        @com.aliyun.core.annotation.NameInMap("SkippedFiles")
        private String skippedFiles;

        @com.aliyun.core.annotation.NameInMap("SuccessFiles")
        private String successFiles;

        @com.aliyun.core.annotation.NameInMap("TotalFiles")
        private String totalFiles;

        private Report(Builder builder) {
            this.failedFiles = builder.failedFiles;
            this.reportTaskStatus = builder.reportTaskStatus;
            this.skippedFiles = builder.skippedFiles;
            this.successFiles = builder.successFiles;
            this.totalFiles = builder.totalFiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Report create() {
            return builder().build();
        }

        /**
         * @return failedFiles
         */
        public String getFailedFiles() {
            return this.failedFiles;
        }

        /**
         * @return reportTaskStatus
         */
        public String getReportTaskStatus() {
            return this.reportTaskStatus;
        }

        /**
         * @return skippedFiles
         */
        public String getSkippedFiles() {
            return this.skippedFiles;
        }

        /**
         * @return successFiles
         */
        public String getSuccessFiles() {
            return this.successFiles;
        }

        /**
         * @return totalFiles
         */
        public String getTotalFiles() {
            return this.totalFiles;
        }

        public static final class Builder {
            private String failedFiles; 
            private String reportTaskStatus; 
            private String skippedFiles; 
            private String successFiles; 
            private String totalFiles; 

            private Builder() {
            } 

            private Builder(Report model) {
                this.failedFiles = model.failedFiles;
                this.reportTaskStatus = model.reportTaskStatus;
                this.skippedFiles = model.skippedFiles;
                this.successFiles = model.successFiles;
                this.totalFiles = model.totalFiles;
            } 

            /**
             * FailedFiles.
             */
            public Builder failedFiles(String failedFiles) {
                this.failedFiles = failedFiles;
                return this;
            }

            /**
             * ReportTaskStatus.
             */
            public Builder reportTaskStatus(String reportTaskStatus) {
                this.reportTaskStatus = reportTaskStatus;
                return this;
            }

            /**
             * SkippedFiles.
             */
            public Builder skippedFiles(String skippedFiles) {
                this.skippedFiles = skippedFiles;
                return this;
            }

            /**
             * SuccessFiles.
             */
            public Builder successFiles(String successFiles) {
                this.successFiles = successFiles;
                return this;
            }

            /**
             * TotalFiles.
             */
            public Builder totalFiles(String totalFiles) {
                this.totalFiles = totalFiles;
                return this;
            }

            public Report build() {
                return new Report(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupJobs2ResponseBody</p>
     */
    public static class BackupJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private Long actualBytes;

        @com.aliyun.core.annotation.NameInMap("ActualFiles")
        private Long actualFiles;

        @com.aliyun.core.annotation.NameInMap("ActualItems")
        private Long actualItems;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("BytesDone")
        private Long bytesDone;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("ChangeListPath")
        private String changeListPath;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CrossAccountType")
        private String crossAccountType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @com.aliyun.core.annotation.NameInMap("DestDataSourceDetail")
        private String destDataSourceDetail;

        @com.aliyun.core.annotation.NameInMap("DestDataSourceId")
        private String destDataSourceId;

        @com.aliyun.core.annotation.NameInMap("DestSourceType")
        private String destSourceType;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private Detail detail;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Exclude")
        private String exclude;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FilesDone")
        private Long filesDone;

        @com.aliyun.core.annotation.NameInMap("FilesTotal")
        private Long filesTotal;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Include")
        private String include;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("ItemsDone")
        private Long itemsDone;

        @com.aliyun.core.annotation.NameInMap("ItemsTotal")
        private Long itemsTotal;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("OtsDetail")
        private OtsDetail otsDetail;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private Paths paths;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Report")
        private Report report;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private Long speed;

        @com.aliyun.core.annotation.NameInMap("SpeedLimit")
        private String speedLimit;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TriggerMode")
        private String triggerMode;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        private BackupJob(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.actualFiles = builder.actualFiles;
            this.actualItems = builder.actualItems;
            this.backupType = builder.backupType;
            this.bucket = builder.bucket;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
            this.changeListPath = builder.changeListPath;
            this.clientId = builder.clientId;
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.createdTime = builder.createdTime;
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
            this.destDataSourceDetail = builder.destDataSourceDetail;
            this.destDataSourceId = builder.destDataSourceId;
            this.destSourceType = builder.destSourceType;
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.exclude = builder.exclude;
            this.fileSystemId = builder.fileSystemId;
            this.filesDone = builder.filesDone;
            this.filesTotal = builder.filesTotal;
            this.identifier = builder.identifier;
            this.include = builder.include;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.itemsDone = builder.itemsDone;
            this.itemsTotal = builder.itemsTotal;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.options = builder.options;
            this.otsDetail = builder.otsDetail;
            this.paths = builder.paths;
            this.planId = builder.planId;
            this.prefix = builder.prefix;
            this.progress = builder.progress;
            this.report = builder.report;
            this.sourceType = builder.sourceType;
            this.speed = builder.speed;
            this.speedLimit = builder.speedLimit;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.tableName = builder.tableName;
            this.triggerMode = builder.triggerMode;
            this.updatedTime = builder.updatedTime;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupJob create() {
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
         * @return actualItems
         */
        public Long getActualItems() {
            return this.actualItems;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
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
         * @return changeListPath
         */
        public String getChangeListPath() {
            return this.changeListPath;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return completeTime
         */
        public Long getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return crossAccountRoleName
         */
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        /**
         * @return crossAccountType
         */
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        /**
         * @return crossAccountUserId
         */
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        /**
         * @return destDataSourceDetail
         */
        public String getDestDataSourceDetail() {
            return this.destDataSourceDetail;
        }

        /**
         * @return destDataSourceId
         */
        public String getDestDataSourceId() {
            return this.destDataSourceId;
        }

        /**
         * @return destSourceType
         */
        public String getDestSourceType() {
            return this.destSourceType;
        }

        /**
         * @return detail
         */
        public Detail getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return exclude
         */
        public String getExclude() {
            return this.exclude;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
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
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return include
         */
        public String getInclude() {
            return this.include;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return itemsDone
         */
        public Long getItemsDone() {
            return this.itemsDone;
        }

        /**
         * @return itemsTotal
         */
        public Long getItemsTotal() {
            return this.itemsTotal;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return otsDetail
         */
        public OtsDetail getOtsDetail() {
            return this.otsDetail;
        }

        /**
         * @return paths
         */
        public Paths getPaths() {
            return this.paths;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return report
         */
        public Report getReport() {
            return this.report;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return speed
         */
        public Long getSpeed() {
            return this.speed;
        }

        /**
         * @return speedLimit
         */
        public String getSpeedLimit() {
            return this.speedLimit;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return triggerMode
         */
        public String getTriggerMode() {
            return this.triggerMode;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private Long actualBytes; 
            private Long actualFiles; 
            private Long actualItems; 
            private String backupType; 
            private String bucket; 
            private Long bytesDone; 
            private Long bytesTotal; 
            private String changeListPath; 
            private String clientId; 
            private Long completeTime; 
            private Long createTime; 
            private Long createdTime; 
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 
            private String destDataSourceDetail; 
            private String destDataSourceId; 
            private String destSourceType; 
            private Detail detail; 
            private String errorMessage; 
            private String exclude; 
            private String fileSystemId; 
            private Long filesDone; 
            private Long filesTotal; 
            private String identifier; 
            private String include; 
            private String instanceId; 
            private String instanceName; 
            private Long itemsDone; 
            private Long itemsTotal; 
            private String jobId; 
            private String jobName; 
            private String options; 
            private OtsDetail otsDetail; 
            private Paths paths; 
            private String planId; 
            private String prefix; 
            private Integer progress; 
            private Report report; 
            private String sourceType; 
            private Long speed; 
            private String speedLimit; 
            private Long startTime; 
            private String status; 
            private String tableName; 
            private String triggerMode; 
            private Long updatedTime; 
            private String vaultId; 

            private Builder() {
            } 

            private Builder(BackupJob model) {
                this.actualBytes = model.actualBytes;
                this.actualFiles = model.actualFiles;
                this.actualItems = model.actualItems;
                this.backupType = model.backupType;
                this.bucket = model.bucket;
                this.bytesDone = model.bytesDone;
                this.bytesTotal = model.bytesTotal;
                this.changeListPath = model.changeListPath;
                this.clientId = model.clientId;
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.createdTime = model.createdTime;
                this.crossAccountRoleName = model.crossAccountRoleName;
                this.crossAccountType = model.crossAccountType;
                this.crossAccountUserId = model.crossAccountUserId;
                this.destDataSourceDetail = model.destDataSourceDetail;
                this.destDataSourceId = model.destDataSourceId;
                this.destSourceType = model.destSourceType;
                this.detail = model.detail;
                this.errorMessage = model.errorMessage;
                this.exclude = model.exclude;
                this.fileSystemId = model.fileSystemId;
                this.filesDone = model.filesDone;
                this.filesTotal = model.filesTotal;
                this.identifier = model.identifier;
                this.include = model.include;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.itemsDone = model.itemsDone;
                this.itemsTotal = model.itemsTotal;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.options = model.options;
                this.otsDetail = model.otsDetail;
                this.paths = model.paths;
                this.planId = model.planId;
                this.prefix = model.prefix;
                this.progress = model.progress;
                this.report = model.report;
                this.sourceType = model.sourceType;
                this.speed = model.speed;
                this.speedLimit = model.speedLimit;
                this.startTime = model.startTime;
                this.status = model.status;
                this.tableName = model.tableName;
                this.triggerMode = model.triggerMode;
                this.updatedTime = model.updatedTime;
                this.vaultId = model.vaultId;
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
             * ActualItems.
             */
            public Builder actualItems(Long actualItems) {
                this.actualItems = actualItems;
                return this;
            }

            /**
             * BackupType.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
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
             * ChangeListPath.
             */
            public Builder changeListPath(String changeListPath) {
                this.changeListPath = changeListPath;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * CompleteTime.
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * CrossAccountRoleName.
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * CrossAccountType.
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * CrossAccountUserId.
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * DestDataSourceDetail.
             */
            public Builder destDataSourceDetail(String destDataSourceDetail) {
                this.destDataSourceDetail = destDataSourceDetail;
                return this;
            }

            /**
             * DestDataSourceId.
             */
            public Builder destDataSourceId(String destDataSourceId) {
                this.destDataSourceId = destDataSourceId;
                return this;
            }

            /**
             * DestSourceType.
             */
            public Builder destSourceType(String destSourceType) {
                this.destSourceType = destSourceType;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Exclude.
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
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
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * Include.
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * ItemsDone.
             */
            public Builder itemsDone(Long itemsDone) {
                this.itemsDone = itemsDone;
                return this;
            }

            /**
             * ItemsTotal.
             */
            public Builder itemsTotal(Long itemsTotal) {
                this.itemsTotal = itemsTotal;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * OtsDetail.
             */
            public Builder otsDetail(OtsDetail otsDetail) {
                this.otsDetail = otsDetail;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(Paths paths) {
                this.paths = paths;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * Prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Report.
             */
            public Builder report(Report report) {
                this.report = report;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(Long speed) {
                this.speed = speed;
                return this;
            }

            /**
             * SpeedLimit.
             */
            public Builder speedLimit(String speedLimit) {
                this.speedLimit = speedLimit;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
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
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TriggerMode.
             */
            public Builder triggerMode(String triggerMode) {
                this.triggerMode = triggerMode;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * VaultId.
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            public BackupJob build() {
                return new BackupJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupJobs2ResponseBody</p>
     */
    public static class BackupJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupJob")
        private java.util.List<BackupJob> backupJob;

        private BackupJobs(Builder builder) {
            this.backupJob = builder.backupJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupJobs create() {
            return builder().build();
        }

        /**
         * @return backupJob
         */
        public java.util.List<BackupJob> getBackupJob() {
            return this.backupJob;
        }

        public static final class Builder {
            private java.util.List<BackupJob> backupJob; 

            private Builder() {
            } 

            private Builder(BackupJobs model) {
                this.backupJob = model.backupJob;
            } 

            /**
             * BackupJob.
             */
            public Builder backupJob(java.util.List<BackupJob> backupJob) {
                this.backupJob = backupJob;
                return this;
            }

            public BackupJobs build() {
                return new BackupJobs(this);
            } 

        } 

    }
}
