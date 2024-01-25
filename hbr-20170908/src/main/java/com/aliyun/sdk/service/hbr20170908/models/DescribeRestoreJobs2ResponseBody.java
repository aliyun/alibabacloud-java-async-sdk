// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreJobs2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreJobs2ResponseBody</p>
 */
public class DescribeRestoreJobs2ResponseBody extends TeaModel {
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

    @NameInMap("RestoreJobs")
    private RestoreJobs restoreJobs;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRestoreJobs2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.restoreJobs = builder.restoreJobs;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreJobs2ResponseBody create() {
        return builder().build();
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
     * @return restoreJobs
     */
    public RestoreJobs getRestoreJobs() {
        return this.restoreJobs;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private RestoreJobs restoreJobs; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * The response status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response message. If the request was successful, "successful" is returned. If the request failed, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details about the restore jobs.
         */
        public Builder restoreJobs(RestoreJobs restoreJobs) {
            this.restoreJobs = restoreJobs;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRestoreJobs2ResponseBody build() {
            return new DescribeRestoreJobs2ResponseBody(this);
        } 

    } 

    public static class OtsDetail extends TeaModel {
        @NameInMap("BatchChannelCount")
        private Integer batchChannelCount;

        @NameInMap("OverwriteExisting")
        private Boolean overwriteExisting;

        private OtsDetail(Builder builder) {
            this.batchChannelCount = builder.batchChannelCount;
            this.overwriteExisting = builder.overwriteExisting;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtsDetail create() {
            return builder().build();
        }

        /**
         * @return batchChannelCount
         */
        public Integer getBatchChannelCount() {
            return this.batchChannelCount;
        }

        /**
         * @return overwriteExisting
         */
        public Boolean getOverwriteExisting() {
            return this.overwriteExisting;
        }

        public static final class Builder {
            private Integer batchChannelCount; 
            private Boolean overwriteExisting; 

            /**
             * The number of channels processed by each Tablestore restore job.
             */
            public Builder batchChannelCount(Integer batchChannelCount) {
                this.batchChannelCount = batchChannelCount;
                return this;
            }

            /**
             * Indicates whether the existing Tablestore restore job was overwritten.
             */
            public Builder overwriteExisting(Boolean overwriteExisting) {
                this.overwriteExisting = overwriteExisting;
                return this;
            }

            public OtsDetail build() {
                return new OtsDetail(this);
            } 

        } 

    }
    public static class Report extends TeaModel {
        @NameInMap("FailedFiles")
        private String failedFiles;

        @NameInMap("ReportTaskStatus")
        private String reportTaskStatus;

        @NameInMap("SkippedFiles")
        private String skippedFiles;

        @NameInMap("SuccessFiles")
        private String successFiles;

        @NameInMap("TotalFiles")
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
    public static class RestoreJob extends TeaModel {
        @NameInMap("ActualBytes")
        private Long actualBytes;

        @NameInMap("ActualItems")
        private Long actualItems;

        @NameInMap("BytesDone")
        private Long bytesDone;

        @NameInMap("BytesTotal")
        private Long bytesTotal;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CompleteTime")
        private Long completeTime;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @NameInMap("CrossAccountType")
        private String crossAccountType;

        @NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @NameInMap("ErrorFile")
        private String errorFile;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Exclude")
        private String exclude;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("FailbackDetail")
        private String failbackDetail;

        @NameInMap("Include")
        private String include;

        @NameInMap("ItemsDone")
        private Long itemsDone;

        @NameInMap("ItemsTotal")
        private Long itemsTotal;

        @NameInMap("MeteringBytesDone")
        private Long meteringBytesDone;

        @NameInMap("MeteringBytesTotal")
        private Long meteringBytesTotal;

        @NameInMap("Options")
        private String options;

        @NameInMap("OtsDetail")
        private OtsDetail otsDetail;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("Report")
        private Report report;

        @NameInMap("RestoreId")
        private String restoreId;

        @NameInMap("RestoreType")
        private String restoreType;

        @NameInMap("SnapshotHash")
        private String snapshotHash;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Speed")
        private Long speed;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("TargetBucket")
        private String targetBucket;

        @NameInMap("TargetClientId")
        private String targetClientId;

        @NameInMap("TargetCreateTime")
        private Long targetCreateTime;

        @NameInMap("TargetDataSourceId")
        private String targetDataSourceId;

        @NameInMap("TargetFileSystemId")
        private String targetFileSystemId;

        @NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @NameInMap("TargetInstanceName")
        private String targetInstanceName;

        @NameInMap("TargetPath")
        private String targetPath;

        @NameInMap("TargetPrefix")
        private String targetPrefix;

        @NameInMap("TargetTableName")
        private String targetTableName;

        @NameInMap("TargetTime")
        private Long targetTime;

        @NameInMap("UdmDetail")
        private String udmDetail;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("VaultId")
        private String vaultId;

        private RestoreJob(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.actualItems = builder.actualItems;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
            this.clusterId = builder.clusterId;
            this.completeTime = builder.completeTime;
            this.createdTime = builder.createdTime;
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
            this.errorFile = builder.errorFile;
            this.errorMessage = builder.errorMessage;
            this.exclude = builder.exclude;
            this.expireTime = builder.expireTime;
            this.failbackDetail = builder.failbackDetail;
            this.include = builder.include;
            this.itemsDone = builder.itemsDone;
            this.itemsTotal = builder.itemsTotal;
            this.meteringBytesDone = builder.meteringBytesDone;
            this.meteringBytesTotal = builder.meteringBytesTotal;
            this.options = builder.options;
            this.otsDetail = builder.otsDetail;
            this.parentId = builder.parentId;
            this.progress = builder.progress;
            this.report = builder.report;
            this.restoreId = builder.restoreId;
            this.restoreType = builder.restoreType;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.sourceType = builder.sourceType;
            this.speed = builder.speed;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.targetBucket = builder.targetBucket;
            this.targetClientId = builder.targetClientId;
            this.targetCreateTime = builder.targetCreateTime;
            this.targetDataSourceId = builder.targetDataSourceId;
            this.targetFileSystemId = builder.targetFileSystemId;
            this.targetInstanceId = builder.targetInstanceId;
            this.targetInstanceName = builder.targetInstanceName;
            this.targetPath = builder.targetPath;
            this.targetPrefix = builder.targetPrefix;
            this.targetTableName = builder.targetTableName;
            this.targetTime = builder.targetTime;
            this.udmDetail = builder.udmDetail;
            this.updatedTime = builder.updatedTime;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreJob create() {
            return builder().build();
        }

        /**
         * @return actualBytes
         */
        public Long getActualBytes() {
            return this.actualBytes;
        }

        /**
         * @return actualItems
         */
        public Long getActualItems() {
            return this.actualItems;
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
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return completeTime
         */
        public Long getCompleteTime() {
            return this.completeTime;
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
         * @return errorFile
         */
        public String getErrorFile() {
            return this.errorFile;
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
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return failbackDetail
         */
        public String getFailbackDetail() {
            return this.failbackDetail;
        }

        /**
         * @return include
         */
        public String getInclude() {
            return this.include;
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
         * @return meteringBytesDone
         */
        public Long getMeteringBytesDone() {
            return this.meteringBytesDone;
        }

        /**
         * @return meteringBytesTotal
         */
        public Long getMeteringBytesTotal() {
            return this.meteringBytesTotal;
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
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
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
         * @return restoreId
         */
        public String getRestoreId() {
            return this.restoreId;
        }

        /**
         * @return restoreType
         */
        public String getRestoreType() {
            return this.restoreType;
        }

        /**
         * @return snapshotHash
         */
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
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
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return targetBucket
         */
        public String getTargetBucket() {
            return this.targetBucket;
        }

        /**
         * @return targetClientId
         */
        public String getTargetClientId() {
            return this.targetClientId;
        }

        /**
         * @return targetCreateTime
         */
        public Long getTargetCreateTime() {
            return this.targetCreateTime;
        }

        /**
         * @return targetDataSourceId
         */
        public String getTargetDataSourceId() {
            return this.targetDataSourceId;
        }

        /**
         * @return targetFileSystemId
         */
        public String getTargetFileSystemId() {
            return this.targetFileSystemId;
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        /**
         * @return targetInstanceName
         */
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetPrefix
         */
        public String getTargetPrefix() {
            return this.targetPrefix;
        }

        /**
         * @return targetTableName
         */
        public String getTargetTableName() {
            return this.targetTableName;
        }

        /**
         * @return targetTime
         */
        public Long getTargetTime() {
            return this.targetTime;
        }

        /**
         * @return udmDetail
         */
        public String getUdmDetail() {
            return this.udmDetail;
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
            private Long actualItems; 
            private Long bytesDone; 
            private Long bytesTotal; 
            private String clusterId; 
            private Long completeTime; 
            private Long createdTime; 
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 
            private String errorFile; 
            private String errorMessage; 
            private String exclude; 
            private Long expireTime; 
            private String failbackDetail; 
            private String include; 
            private Long itemsDone; 
            private Long itemsTotal; 
            private Long meteringBytesDone; 
            private Long meteringBytesTotal; 
            private String options; 
            private OtsDetail otsDetail; 
            private String parentId; 
            private Integer progress; 
            private Report report; 
            private String restoreId; 
            private String restoreType; 
            private String snapshotHash; 
            private String snapshotId; 
            private String sourceType; 
            private Long speed; 
            private Long startTime; 
            private String status; 
            private String storageClass; 
            private String targetBucket; 
            private String targetClientId; 
            private Long targetCreateTime; 
            private String targetDataSourceId; 
            private String targetFileSystemId; 
            private String targetInstanceId; 
            private String targetInstanceName; 
            private String targetPath; 
            private String targetPrefix; 
            private String targetTableName; 
            private Long targetTime; 
            private String udmDetail; 
            private Long updatedTime; 
            private String vaultId; 

            /**
             * The actual amount of data that is restored after duplicates are removed. Unit: bytes.
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * This parameter is valid only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the actual number of objects that are restored by the restore job.
             */
            public Builder actualItems(Long actualItems) {
                this.actualItems = actualItems;
                return this;
            }

            /**
             * The amount of data that was restored. Unit: bytes.
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
             * The ID of the client group used for restoration.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The time when the restore job was completed. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The time when the restore job was created. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:
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
             * The list of the files that failed to be restored.
             */
            public Builder errorFile(String errorFile) {
                this.errorFile = errorFile;
                return this;
            }

            /**
             * The error message that is returned for the restore job.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the paths to the files that are excluded from the restore job. The value can be 1 to 255 characters in length.
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * The time when the restore job expires.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * FailbackDetail.
             */
            public Builder failbackDetail(String failbackDetail) {
                this.failbackDetail = failbackDetail;
                return this;
            }

            /**
             * The paths to the files that are included in the restore job.
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * This parameter is valid only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the number of restored objects.
             */
            public Builder itemsDone(Long itemsDone) {
                this.itemsDone = itemsDone;
                return this;
            }

            /**
             * This parameter is valid only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the total number of objects in the data source.
             */
            public Builder itemsTotal(Long itemsTotal) {
                this.itemsTotal = itemsTotal;
                return this;
            }

            /**
             * MeteringBytesDone.
             */
            public Builder meteringBytesDone(Long meteringBytesDone) {
                this.meteringBytesDone = meteringBytesDone;
                return this;
            }

            /**
             * MeteringBytesTotal.
             */
            public Builder meteringBytesTotal(Long meteringBytesTotal) {
                this.meteringBytesTotal = meteringBytesTotal;
                return this;
            }

            /**
             * This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a restoration path.
             * <p>
             * 
             * *   This parameter is available only for Windows ECS instances.
             * *   If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to `["UseVSS":true]`.
             * *   If you use VSS, you cannot restore data from multiple directories.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * The details about the Tablestore instance.
             */
            public Builder otsDetail(OtsDetail otsDetail) {
                this.otsDetail = otsDetail;
                return this;
            }

            /**
             * The ID of the parent job.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The progress of the restore job. For example, 10000 indicates that the progress is 100%.
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
             * The ID of the restore job.
             */
            public Builder restoreId(String restoreId) {
                this.restoreId = restoreId;
                return this;
            }

            /**
             * The type of the restore job.
             */
            public Builder restoreType(String restoreType) {
                this.restoreType = restoreType;
                return this;
            }

            /**
             * The hash value of the backup snapshot.
             */
            public Builder snapshotHash(String snapshotHash) {
                this.snapshotHash = snapshotHash;
                return this;
            }

            /**
             * The ID of the snapshot used for restoration.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   **ECS_FILE**: ECS files
             * *   **OSS**: OSS buckets
             * *   **NAS**: NAS file systems
             * *   **OTS_TABLE**: Tablestore instances
             * *   **UDM_ECS**: ECS instances
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
             * The time when the restore job starts. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the restore job. Valid values:
             * <p>
             * 
             * *   **COMPLETE**: The restore job is completed.
             * *   **PARTIAL_COMPLETE**: The restore job is partially completed.
             * *   **FAILED**: The restore job has failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * The name of the destination OSS bucket. This parameter is returned only for OSS buckets.
             */
            public Builder targetBucket(String targetBucket) {
                this.targetBucket = targetBucket;
                return this;
            }

            /**
             * The ID of the destination client.
             */
            public Builder targetClientId(String targetClientId) {
                this.targetClientId = targetClientId;
                return this;
            }

            /**
             * This parameter is returned only for NAS file systems. This parameter indicates the time when the file system was created.
             */
            public Builder targetCreateTime(Long targetCreateTime) {
                this.targetCreateTime = targetCreateTime;
                return this;
            }

            /**
             * The ID of the destination data source.
             */
            public Builder targetDataSourceId(String targetDataSourceId) {
                this.targetDataSourceId = targetDataSourceId;
                return this;
            }

            /**
             * The ID of the destination NAS file system. This parameter is returned only for NAS file systems.
             */
            public Builder targetFileSystemId(String targetFileSystemId) {
                this.targetFileSystemId = targetFileSystemId;
                return this;
            }

            /**
             * The ID of the destination instance for the restore job.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * The name of the destination Tablestore instance.
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * The destination file path of the restore job.
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * The prefix of the objects that are restored. This parameter is returned only for OSS buckets.
             */
            public Builder targetPrefix(String targetPrefix) {
                this.targetPrefix = targetPrefix;
                return this;
            }

            /**
             * The name of the destination table in the Tablestore instance.
             */
            public Builder targetTableName(String targetTableName) {
                this.targetTableName = targetTableName;
                return this;
            }

            /**
             * The time when the Tablestore instance was backed up. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder targetTime(Long targetTime) {
                this.targetTime = targetTime;
                return this;
            }

            /**
             * The details about ECS instance backup.
             */
            public Builder udmDetail(String udmDetail) {
                this.udmDetail = udmDetail;
                return this;
            }

            /**
             * The time when the restore job was updated. The value is a UNIX timestamp. Unit: seconds.
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

            public RestoreJob build() {
                return new RestoreJob(this);
            } 

        } 

    }
    public static class RestoreJobs extends TeaModel {
        @NameInMap("RestoreJob")
        private java.util.List < RestoreJob> restoreJob;

        private RestoreJobs(Builder builder) {
            this.restoreJob = builder.restoreJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreJobs create() {
            return builder().build();
        }

        /**
         * @return restoreJob
         */
        public java.util.List < RestoreJob> getRestoreJob() {
            return this.restoreJob;
        }

        public static final class Builder {
            private java.util.List < RestoreJob> restoreJob; 

            /**
             * RestoreJob.
             */
            public Builder restoreJob(java.util.List < RestoreJob> restoreJob) {
                this.restoreJob = restoreJob;
                return this;
            }

            public RestoreJobs build() {
                return new RestoreJobs(this);
            } 

        } 

    }
}
