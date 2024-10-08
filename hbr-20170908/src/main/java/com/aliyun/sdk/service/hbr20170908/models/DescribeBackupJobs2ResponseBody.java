// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
         * <p>The backup jobs that meet the specified conditions.</p>
         */
        public Builder backupJobs(BackupJobs backupJobs) {
            this.backupJobs = backupJobs;
            return this;
        }

        /**
         * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
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
         * <p>The total number of returned backup jobs that meet the specified conditions.</p>
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
        private java.util.Map < String, ? > instanceInfos;

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
        public java.util.Map < String, ? > getInstanceInfos() {
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
            private java.util.Map < String, ? > instanceInfos; 
            private String nativeSnapshotId; 

            /**
             * <p>The information about the remote replication failure.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS.CreatingSnapshot</p>
             */
            public Builder destinationNativeSnapshotErrorMessage(String destinationNativeSnapshotErrorMessage) {
                this.destinationNativeSnapshotErrorMessage = destinationNativeSnapshotErrorMessage;
                return this;
            }

            /**
             * <p>The ID of the remote replication snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-******************</p>
             */
            public Builder destinationNativeSnapshotId(String destinationNativeSnapshotId) {
                this.destinationNativeSnapshotId = destinationNativeSnapshotId;
                return this;
            }

            /**
             * <p>The progress of the remote replication.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder destinationNativeSnapshotProgress(Integer destinationNativeSnapshotProgress) {
                this.destinationNativeSnapshotProgress = destinationNativeSnapshotProgress;
                return this;
            }

            /**
             * <p>The state of the remote replication.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder destinationNativeSnapshotStatus(String destinationNativeSnapshotStatus) {
                this.destinationNativeSnapshotStatus = destinationNativeSnapshotStatus;
                return this;
            }

            /**
             * <p>The retention period of the remote replication backup.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * <p>The ID of the remote replication backup.</p>
             * 
             * <strong>example:</strong>
             * <p>s-******************</p>
             */
            public Builder destinationSnapshotId(String destinationSnapshotId) {
                this.destinationSnapshotId = destinationSnapshotId;
                return this;
            }

            /**
             * <p>The mapping between snapshots and disks.</p>
             */
            public Builder diskNativeSnapshotIdList(DiskNativeSnapshotIdList diskNativeSnapshotIdList) {
                this.diskNativeSnapshotIdList = diskNativeSnapshotIdList;
                return this;
            }

            /**
             * <p>Indicates whether remote replication is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * InstanceInfos.
             */
            public Builder instanceInfos(java.util.Map < String, ? > instanceInfos) {
                this.instanceInfos = instanceInfos;
                return this;
            }

            /**
             * <p>The ID of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-******************</p>
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

            /**
             * <p>The names of the tables in the Tablestore instance.</p>
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
             * <p>The actual amount of data that is backed up after the system removes duplicate files. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * <p>The number of files that are actually processed.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder actualFiles(Long actualFiles) {
                this.actualFiles = actualFiles;
                return this;
            }

            /**
             * <p>The actual number of objects that are backed up by the backup job. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>ECS_FILE</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder actualItems(Long actualItems) {
                this.actualItems = actualItems;
                return this;
            }

            /**
             * <p>The backup type. Only <strong>COMPLETE</strong> may be returned, which indicates full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The name of the OSS bucket that is backed up. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>OSS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>hbr-backup-oss</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The actual amount of data that is generated by incremental backups. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * <p>The total amount of data that is backed up from the data source. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * <p>The configurations of the incremental file synchronization. This parameter is returned only for data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dataSourceId&quot;: &quot;ds-123456789&quot;, &quot;path&quot;: &quot;/changelist&quot;}</p>
             */
            public Builder changeListPath(String changeListPath) {
                this.changeListPath = changeListPath;
                return this;
            }

            /**
             * <p>The ID of the backup client. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>ECS_FILE</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>c-*********************</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The time when the backup job was complete. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the file system was created. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>NAS</strong>. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1607436917</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the backup job was created. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>BackupRole</p>
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li>SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</li>
             * <li>CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SELF_ACCOUNT</p>
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>158975xxxxx4625</p>
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * <p>The data source details at the destination. This parameter is returned only for data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;prefix&quot;:&quot;/&quot;}</p>
             */
            public Builder destDataSourceDetail(String destDataSourceDetail) {
                this.destDataSourceDetail = destDataSourceDetail;
                return this;
            }

            /**
             * <p>The data source ID at the destination. This parameter is returned only for data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-000cov4ufudxklj24zdk</p>
             */
            public Builder destDataSourceId(String destDataSourceId) {
                this.destDataSourceId = destDataSourceId;
                return this;
            }

            /**
             * <p>The data source type at the destination. This parameter is returned only for data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder destSourceType(String destSourceType) {
                this.destSourceType = destSourceType;
                return this;
            }

            /**
             * <p>The details of the ECS instance backup job.</p>
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message that is returned for the backup job.</p>
             * 
             * <strong>example:</strong>
             * <p>PARTIAL_COMPLETE</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The paths to the files that are excluded from the backup job. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>ECS_FILE</strong>. The value can be up to 255 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>The ID of the NAS file system. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>NAS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>005494</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The number of files that have been processed.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder filesDone(Long filesDone) {
                this.filesDone = filesDone;
                return this;
            }

            /**
             * <p>The total number of files to be processed.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder filesTotal(Long filesTotal) {
                this.filesTotal = filesTotal;
                return this;
            }

            /**
             * <p>The identifier of the cluster that is backed up in the container backup job. This parameter is returned only if the value of SourceType is CONTAINER. If the cluster is a Container Service for Kubernetes (ACK) cluster, the value of this parameter is the ACK cluster ID.</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The paths to the files that are included in the backup job.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * <p>The ID of the ECS instance. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>NAS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>i-*********************</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the Tablestore instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instancename</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The number of objects that are backed up. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>ECS_FILE</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder itemsDone(Long itemsDone) {
                this.itemsDone = itemsDone;
                return this;
            }

            /**
             * <p>The total number of objects in the data source. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>ECS_FILE</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder itemsTotal(Long itemsTotal) {
                this.itemsTotal = itemsTotal;
                return this;
            }

            /**
             * <p>The ID of the backup job.</p>
             * 
             * <strong>example:</strong>
             * <p>job-000g********w7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The name of the backup job.</p>
             * 
             * <strong>example:</strong>
             * <p>jobname</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>Indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a source path. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>ECS_FILE</strong>.</p>
             * <ul>
             * <li>This parameter is available only for Windows ECS instances.</li>
             * <li>A value of <code>[&quot;UseVSS&quot;:true]</code> indicates that the consistency between the source data and backup data is ensured while data changes occur in the source data.</li>
             * <li>If VSS is used, multiple directories cannot be backed up at a time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;UseVSS&quot;:false}</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The details of the Tablestore instance.</p>
             */
            public Builder otsDetail(OtsDetail otsDetail) {
                this.otsDetail = otsDetail;
                return this;
            }

            /**
             * <p>The source paths.</p>
             */
            public Builder paths(Paths paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The ID of the backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>plan-20********35</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The prefix of objects that are backed up. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>OSS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>example/</p>
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * <p>The backup progress. Valid values: 0 to 10000. For example, a value of 10000 indicates that the progress is 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><strong>ECS_FILE</strong>: ECS file.</li>
             * <li><strong>OSS</strong>: OSS bucket.</li>
             * <li><strong>NAS</strong>: NAS file system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS_FILE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The average speed at which data is backed up. Unit: KB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder speed(Long speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>The throttling rules. This parameter is returned only if the value of <strong>SourceType</strong> is <strong>ECS_FILE</strong>. Format: <code>{start}:{end}:{bandwidth}</code>. Multiple throttling rules are separated by vertical bars (<code>|</code>). The time ranges of the throttling rules cannot overlap.</p>
             * <ul>
             * <li><strong>start</strong>: the start hour.</li>
             * <li><strong>end</strong>: the end hour</li>
             * <li><strong>bandwidth</strong>: the bandwidth. Unit: KB/s.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0:24:5120</p>
             */
            public Builder speedLimit(String speedLimit) {
                this.speedLimit = speedLimit;
                return this;
            }

            /**
             * <p>The time when the backup job started. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the backup job. Valid values:</p>
             * <ul>
             * <li><strong>COMPLETE</strong></li>
             * <li><strong>PARTIAL_COMPLETE</strong></li>
             * <li><strong>FAILED</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the table in the Tablestore instance.</p>
             * 
             * <strong>example:</strong>
             * <p>table1</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The time when the backup job was last updated. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>The ID of the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>v-0006******q</p>
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
