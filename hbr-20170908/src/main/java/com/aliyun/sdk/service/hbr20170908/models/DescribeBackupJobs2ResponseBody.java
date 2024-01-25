// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupJobs2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupJobs2ResponseBody</p>
 */
public class DescribeBackupJobs2ResponseBody extends TeaModel {
    @NameInMap("BackupJobs")
    private BackupJobs backupJobs;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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

        /**
         * The backup jobs that meet the specified conditions.
         */
        public Builder backupJobs(BackupJobs backupJobs) {
            this.backupJobs = backupJobs;
            return this;
        }

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned backup jobs that meet the specified conditions.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBackupJobs2ResponseBody build() {
            return new DescribeBackupJobs2ResponseBody(this);
        } 

    } 

    public static class DiskNativeSnapshotIdList extends TeaModel {
        @NameInMap("DiskNativeSnapshotId")
        private java.util.List < String > diskNativeSnapshotId;

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
        public java.util.List < String > getDiskNativeSnapshotId() {
            return this.diskNativeSnapshotId;
        }

        public static final class Builder {
            private java.util.List < String > diskNativeSnapshotId; 

            /**
             * DiskNativeSnapshotId.
             */
            public Builder diskNativeSnapshotId(java.util.List < String > diskNativeSnapshotId) {
                this.diskNativeSnapshotId = diskNativeSnapshotId;
                return this;
            }

            public DiskNativeSnapshotIdList build() {
                return new DiskNativeSnapshotIdList(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @NameInMap("DestinationNativeSnapshotErrorMessage")
        private String destinationNativeSnapshotErrorMessage;

        @NameInMap("DestinationNativeSnapshotId")
        private String destinationNativeSnapshotId;

        @NameInMap("DestinationNativeSnapshotProgress")
        private Integer destinationNativeSnapshotProgress;

        @NameInMap("DestinationNativeSnapshotStatus")
        private String destinationNativeSnapshotStatus;

        @NameInMap("DestinationRetention")
        private Long destinationRetention;

        @NameInMap("DestinationSnapshotId")
        private String destinationSnapshotId;

        @NameInMap("DiskNativeSnapshotIdList")
        private DiskNativeSnapshotIdList diskNativeSnapshotIdList;

        @NameInMap("DoCopy")
        private Boolean doCopy;

        @NameInMap("NativeSnapshotId")
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
            private String nativeSnapshotId; 

            /**
             * The information about the remote replication failure.
             */
            public Builder destinationNativeSnapshotErrorMessage(String destinationNativeSnapshotErrorMessage) {
                this.destinationNativeSnapshotErrorMessage = destinationNativeSnapshotErrorMessage;
                return this;
            }

            /**
             * The ID of the remote replication snapshot.
             */
            public Builder destinationNativeSnapshotId(String destinationNativeSnapshotId) {
                this.destinationNativeSnapshotId = destinationNativeSnapshotId;
                return this;
            }

            /**
             * The progress of the remote replication.
             */
            public Builder destinationNativeSnapshotProgress(Integer destinationNativeSnapshotProgress) {
                this.destinationNativeSnapshotProgress = destinationNativeSnapshotProgress;
                return this;
            }

            /**
             * The state of the remote replication.
             */
            public Builder destinationNativeSnapshotStatus(String destinationNativeSnapshotStatus) {
                this.destinationNativeSnapshotStatus = destinationNativeSnapshotStatus;
                return this;
            }

            /**
             * The retention period of the remote replication backup.
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * The ID of the remote replication backup.
             */
            public Builder destinationSnapshotId(String destinationSnapshotId) {
                this.destinationSnapshotId = destinationSnapshotId;
                return this;
            }

            /**
             * The mapping between snapshots and disks.
             */
            public Builder diskNativeSnapshotIdList(DiskNativeSnapshotIdList diskNativeSnapshotIdList) {
                this.diskNativeSnapshotIdList = diskNativeSnapshotIdList;
                return this;
            }

            /**
             * Indicates whether remote replication is enabled.
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * The ID of the backup snapshot.
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
    public static class TableNames extends TeaModel {
        @NameInMap("TableName")
        private java.util.List < String > tableName;

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
        public java.util.List < String > getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List < String > tableName; 

            /**
             * TableName.
             */
            public Builder tableName(java.util.List < String > tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableNames build() {
                return new TableNames(this);
            } 

        } 

    }
    public static class OtsDetail extends TeaModel {
        @NameInMap("TableNames")
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

            /**
             * The names of the tables in the Tablestore instance.
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
    public static class Paths extends TeaModel {
        @NameInMap("Path")
        private java.util.List < String > path;

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
        public java.util.List < String > getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List < String > path; 

            /**
             * Path.
             */
            public Builder path(java.util.List < String > path) {
                this.path = path;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    public static class BackupJob extends TeaModel {
        @NameInMap("ActualBytes")
        private Long actualBytes;

        @NameInMap("ActualFiles")
        private Long actualFiles;

        @NameInMap("ActualItems")
        private Long actualItems;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("BytesDone")
        private Long bytesDone;

        @NameInMap("BytesTotal")
        private Long bytesTotal;

        @NameInMap("ChangeListPath")
        private String changeListPath;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("CompleteTime")
        private Long completeTime;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @NameInMap("CrossAccountType")
        private String crossAccountType;

        @NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @NameInMap("DestDataSourceDetail")
        private String destDataSourceDetail;

        @NameInMap("DestDataSourceId")
        private String destDataSourceId;

        @NameInMap("DestSourceType")
        private String destSourceType;

        @NameInMap("Detail")
        private Detail detail;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Exclude")
        private String exclude;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("FilesDone")
        private Long filesDone;

        @NameInMap("FilesTotal")
        private Long filesTotal;

        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("Include")
        private String include;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("ItemsDone")
        private Long itemsDone;

        @NameInMap("ItemsTotal")
        private Long itemsTotal;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("Options")
        private String options;

        @NameInMap("OtsDetail")
        private OtsDetail otsDetail;

        @NameInMap("Paths")
        private Paths paths;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("Prefix")
        private String prefix;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Speed")
        private Long speed;

        @NameInMap("SpeedLimit")
        private String speedLimit;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("VaultId")
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
            this.sourceType = builder.sourceType;
            this.speed = builder.speed;
            this.speedLimit = builder.speedLimit;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.tableName = builder.tableName;
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
            private String sourceType; 
            private Long speed; 
            private String speedLimit; 
            private Long startTime; 
            private String status; 
            private String tableName; 
            private Long updatedTime; 
            private String vaultId; 

            /**
             * The actual amount of data that is backed up after the system removes duplicate files. Unit: bytes.
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * The number of files that are actually processed.
             */
            public Builder actualFiles(Long actualFiles) {
                this.actualFiles = actualFiles;
                return this;
            }

            /**
             * The actual number of objects that are backed up by the backup job. This parameter is returned only if the value of **SourceType** is **ECS_FILE**.
             */
            public Builder actualItems(Long actualItems) {
                this.actualItems = actualItems;
                return this;
            }

            /**
             * The backup type. Only **COMPLETE** may be returned, which indicates full backup.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * The name of the OSS bucket that is backed up. This parameter is returned only if the value of **SourceType** is **OSS**.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The actual amount of data that is generated by incremental backups. Unit: bytes.
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * The total amount of data that is backed up from the data source. Unit: bytes.
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * The configurations of the incremental file synchronization. This parameter is returned only for data synchronization.
             */
            public Builder changeListPath(String changeListPath) {
                this.changeListPath = changeListPath;
                return this;
            }

            /**
             * The ID of the backup client. This parameter is returned only if the value of **SourceType** is **ECS_FILE**.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The time when the backup job was complete. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The time when the file system was created. This parameter is returned only if the value of **SourceType** is **NAS**. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the backup job was created. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * The backup type. Valid values:
             * <p>
             * 
             * *   SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.
             * *   CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * The data source details at the destination. This parameter is returned only for data synchronization.
             */
            public Builder destDataSourceDetail(String destDataSourceDetail) {
                this.destDataSourceDetail = destDataSourceDetail;
                return this;
            }

            /**
             * The data source ID at the destination. This parameter is returned only for data synchronization.
             */
            public Builder destDataSourceId(String destDataSourceId) {
                this.destDataSourceId = destDataSourceId;
                return this;
            }

            /**
             * The data source type at the destination. This parameter is returned only for data synchronization.
             */
            public Builder destSourceType(String destSourceType) {
                this.destSourceType = destSourceType;
                return this;
            }

            /**
             * The details of the ECS instance backup job.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The error message that is returned for the backup job.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The paths to the files that are excluded from the backup job. This parameter is returned only if the value of **SourceType** is **ECS_FILE**. The value can be up to 255 characters in length.
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * The ID of the NAS file system. This parameter is returned only if the value of **SourceType** is **NAS**.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The number of files that have been processed.
             */
            public Builder filesDone(Long filesDone) {
                this.filesDone = filesDone;
                return this;
            }

            /**
             * The total number of files to be processed.
             */
            public Builder filesTotal(Long filesTotal) {
                this.filesTotal = filesTotal;
                return this;
            }

            /**
             * The identifier of the cluster that is backed up in the container backup job. This parameter is returned only if the value of SourceType is CONTAINER. If the cluster is a Container Service for Kubernetes (ACK) cluster, the value of this parameter is the ACK cluster ID.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * The paths to the files that are included in the backup job.
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * The ID of the ECS instance. This parameter is returned only if the value of **SourceType** is **NAS**.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the Tablestore instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The number of objects that are backed up. This parameter is returned only if the value of **SourceType** is **ECS_FILE**.
             */
            public Builder itemsDone(Long itemsDone) {
                this.itemsDone = itemsDone;
                return this;
            }

            /**
             * The total number of objects in the data source. This parameter is returned only if the value of **SourceType** is **ECS_FILE**.
             */
            public Builder itemsTotal(Long itemsTotal) {
                this.itemsTotal = itemsTotal;
                return this;
            }

            /**
             * The ID of the backup job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The name of the backup job.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a source path. This parameter is returned only if the value of **SourceType** is **ECS_FILE**.
             * <p>
             * 
             * *   This parameter is available only for Windows ECS instances.
             * *   A value of `["UseVSS":true]` indicates that the consistency between the source data and backup data is ensured while data changes occur in the source data.
             * *   If VSS is used, multiple directories cannot be backed up at a time.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * The details of the Tablestore instance.
             */
            public Builder otsDetail(OtsDetail otsDetail) {
                this.otsDetail = otsDetail;
                return this;
            }

            /**
             * The source paths.
             */
            public Builder paths(Paths paths) {
                this.paths = paths;
                return this;
            }

            /**
             * The ID of the backup plan.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * The prefix of objects that are backed up. This parameter is returned only if the value of **SourceType** is **OSS**.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * The backup progress. Valid values: 0 to 10000. For example, a value of 10000 indicates that the progress is 100%.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   **ECS_FILE**: ECS file.
             * *   **OSS**: OSS bucket.
             * *   **NAS**: NAS file system.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The average speed at which data is backed up. Unit: KB/s.
             */
            public Builder speed(Long speed) {
                this.speed = speed;
                return this;
            }

            /**
             * The throttling rules. This parameter is returned only if the value of **SourceType** is **ECS_FILE**. Format: `{start}:{end}:{bandwidth}`. Multiple throttling rules are separated by vertical bars (`|`). The time ranges of the throttling rules cannot overlap.
             * <p>
             * 
             * *   **start**: the start hour.
             * *   **end**: the end hour
             * *   **bandwidth**: the bandwidth. Unit: KB/s.
             */
            public Builder speedLimit(String speedLimit) {
                this.speedLimit = speedLimit;
                return this;
            }

            /**
             * The time when the backup job started. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the backup job. Valid values:
             * <p>
             * 
             * *   **COMPLETE**
             * *   **PARTIAL_COMPLETE**
             * *   **FAILED**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the table in the Tablestore instance.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The time when the backup job was last updated. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * The ID of the backup vault.
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
    public static class BackupJobs extends TeaModel {
        @NameInMap("BackupJob")
        private java.util.List < BackupJob> backupJob;

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
        public java.util.List < BackupJob> getBackupJob() {
            return this.backupJob;
        }

        public static final class Builder {
            private java.util.List < BackupJob> backupJob; 

            /**
             * BackupJob.
             */
            public Builder backupJob(java.util.List < BackupJob> backupJob) {
                this.backupJob = backupJob;
                return this;
            }

            public BackupJobs build() {
                return new BackupJobs(this);
            } 

        } 

    }
}
