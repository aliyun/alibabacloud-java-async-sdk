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
 * {@link DescribeRestoreJobs2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreJobs2ResponseBody</p>
 */
public class DescribeRestoreJobs2ResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RestoreJobs")
    private RestoreJobs restoreJobs;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRestoreJobs2ResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.restoreJobs = model.restoreJobs;
            this.success = model.success;
            this.totalCount = model.totalCount;
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
         * <p>The response message. If the request is successful, &quot;successful&quot; is returned. Otherwise, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page. Pages start from 1. Default: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 99. Default: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>A container for the restore job details.</p>
         */
        public Builder restoreJobs(RestoreJobs restoreJobs) {
            this.restoreJobs = restoreJobs;
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
         * <p>The total number of entries that match the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRestoreJobs2ResponseBody build() {
            return new DescribeRestoreJobs2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRestoreJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreJobs2ResponseBody</p>
     */
    public static class OtsDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchChannelCount")
        private Integer batchChannelCount;

        @com.aliyun.core.annotation.NameInMap("OverwriteExisting")
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

            private Builder() {
            } 

            private Builder(OtsDetail model) {
                this.batchChannelCount = model.batchChannelCount;
                this.overwriteExisting = model.overwriteExisting;
            } 

            /**
             * BatchChannelCount.
             */
            public Builder batchChannelCount(Integer batchChannelCount) {
                this.batchChannelCount = batchChannelCount;
                return this;
            }

            /**
             * OverwriteExisting.
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
    /**
     * 
     * {@link DescribeRestoreJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreJobs2ResponseBody</p>
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
     * {@link DescribeRestoreJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreJobs2ResponseBody</p>
     */
    public static class RestoreJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private Long actualBytes;

        @com.aliyun.core.annotation.NameInMap("ActualItems")
        private Long actualItems;

        @com.aliyun.core.annotation.NameInMap("BytesDone")
        private Long bytesDone;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CrossAccountType")
        private String crossAccountType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @com.aliyun.core.annotation.NameInMap("ErrorFile")
        private String errorFile;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Exclude")
        private String exclude;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("FailbackDetail")
        private String failbackDetail;

        @com.aliyun.core.annotation.NameInMap("Include")
        private String include;

        @com.aliyun.core.annotation.NameInMap("ItemsDone")
        private Long itemsDone;

        @com.aliyun.core.annotation.NameInMap("ItemsTotal")
        private Long itemsTotal;

        @com.aliyun.core.annotation.NameInMap("MeteringBytesDone")
        private Long meteringBytesDone;

        @com.aliyun.core.annotation.NameInMap("MeteringBytesTotal")
        private Long meteringBytesTotal;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("OtsDetail")
        private OtsDetail otsDetail;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Report")
        private Report report;

        @com.aliyun.core.annotation.NameInMap("RestoreId")
        private String restoreId;

        @com.aliyun.core.annotation.NameInMap("RestoreType")
        private String restoreType;

        @com.aliyun.core.annotation.NameInMap("SnapshotHash")
        private String snapshotHash;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceResourceId")
        private String sourceResourceId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private Long speed;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("TargetBucket")
        private String targetBucket;

        @com.aliyun.core.annotation.NameInMap("TargetClientId")
        private String targetClientId;

        @com.aliyun.core.annotation.NameInMap("TargetCreateTime")
        private Long targetCreateTime;

        @com.aliyun.core.annotation.NameInMap("TargetDataSourceId")
        private String targetDataSourceId;

        @com.aliyun.core.annotation.NameInMap("TargetFileSystemId")
        private String targetFileSystemId;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceName")
        private String targetInstanceName;

        @com.aliyun.core.annotation.NameInMap("TargetPath")
        private String targetPath;

        @com.aliyun.core.annotation.NameInMap("TargetPrefix")
        private String targetPrefix;

        @com.aliyun.core.annotation.NameInMap("TargetTableName")
        private String targetTableName;

        @com.aliyun.core.annotation.NameInMap("TargetTime")
        private Long targetTime;

        @com.aliyun.core.annotation.NameInMap("UdmDetail")
        private String udmDetail;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("VaultId")
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
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceResourceId = builder.sourceResourceId;
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
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceResourceId
         */
        public String getSourceResourceId() {
            return this.sourceResourceId;
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
            private String sourceInstanceId; 
            private String sourceResourceId; 
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

            private Builder() {
            } 

            private Builder(RestoreJob model) {
                this.actualBytes = model.actualBytes;
                this.actualItems = model.actualItems;
                this.bytesDone = model.bytesDone;
                this.bytesTotal = model.bytesTotal;
                this.clusterId = model.clusterId;
                this.completeTime = model.completeTime;
                this.createdTime = model.createdTime;
                this.crossAccountRoleName = model.crossAccountRoleName;
                this.crossAccountType = model.crossAccountType;
                this.crossAccountUserId = model.crossAccountUserId;
                this.errorFile = model.errorFile;
                this.errorMessage = model.errorMessage;
                this.exclude = model.exclude;
                this.expireTime = model.expireTime;
                this.failbackDetail = model.failbackDetail;
                this.include = model.include;
                this.itemsDone = model.itemsDone;
                this.itemsTotal = model.itemsTotal;
                this.meteringBytesDone = model.meteringBytesDone;
                this.meteringBytesTotal = model.meteringBytesTotal;
                this.options = model.options;
                this.otsDetail = model.otsDetail;
                this.parentId = model.parentId;
                this.progress = model.progress;
                this.report = model.report;
                this.restoreId = model.restoreId;
                this.restoreType = model.restoreType;
                this.snapshotHash = model.snapshotHash;
                this.snapshotId = model.snapshotId;
                this.sourceInstanceId = model.sourceInstanceId;
                this.sourceResourceId = model.sourceResourceId;
                this.sourceType = model.sourceType;
                this.speed = model.speed;
                this.startTime = model.startTime;
                this.status = model.status;
                this.storageClass = model.storageClass;
                this.targetBucket = model.targetBucket;
                this.targetClientId = model.targetClientId;
                this.targetCreateTime = model.targetCreateTime;
                this.targetDataSourceId = model.targetDataSourceId;
                this.targetFileSystemId = model.targetFileSystemId;
                this.targetInstanceId = model.targetInstanceId;
                this.targetInstanceName = model.targetInstanceName;
                this.targetPath = model.targetPath;
                this.targetPrefix = model.targetPrefix;
                this.targetTableName = model.targetTableName;
                this.targetTime = model.targetTime;
                this.udmDetail = model.udmDetail;
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
             * ActualItems.
             */
            public Builder actualItems(Long actualItems) {
                this.actualItems = actualItems;
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
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
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
             * ErrorFile.
             */
            public Builder errorFile(String errorFile) {
                this.errorFile = errorFile;
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
             * ExpireTime.
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
             * Include.
             */
            public Builder include(String include) {
                this.include = include;
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
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
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
             * RestoreId.
             */
            public Builder restoreId(String restoreId) {
                this.restoreId = restoreId;
                return this;
            }

            /**
             * RestoreType.
             */
            public Builder restoreType(String restoreType) {
                this.restoreType = restoreType;
                return this;
            }

            /**
             * SnapshotHash.
             */
            public Builder snapshotHash(String snapshotHash) {
                this.snapshotHash = snapshotHash;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * SourceInstanceId.
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * SourceResourceId.
             */
            public Builder sourceResourceId(String sourceResourceId) {
                this.sourceResourceId = sourceResourceId;
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
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * TargetBucket.
             */
            public Builder targetBucket(String targetBucket) {
                this.targetBucket = targetBucket;
                return this;
            }

            /**
             * TargetClientId.
             */
            public Builder targetClientId(String targetClientId) {
                this.targetClientId = targetClientId;
                return this;
            }

            /**
             * TargetCreateTime.
             */
            public Builder targetCreateTime(Long targetCreateTime) {
                this.targetCreateTime = targetCreateTime;
                return this;
            }

            /**
             * TargetDataSourceId.
             */
            public Builder targetDataSourceId(String targetDataSourceId) {
                this.targetDataSourceId = targetDataSourceId;
                return this;
            }

            /**
             * TargetFileSystemId.
             */
            public Builder targetFileSystemId(String targetFileSystemId) {
                this.targetFileSystemId = targetFileSystemId;
                return this;
            }

            /**
             * TargetInstanceId.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * TargetInstanceName.
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * TargetPath.
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * TargetPrefix.
             */
            public Builder targetPrefix(String targetPrefix) {
                this.targetPrefix = targetPrefix;
                return this;
            }

            /**
             * TargetTableName.
             */
            public Builder targetTableName(String targetTableName) {
                this.targetTableName = targetTableName;
                return this;
            }

            /**
             * TargetTime.
             */
            public Builder targetTime(Long targetTime) {
                this.targetTime = targetTime;
                return this;
            }

            /**
             * UdmDetail.
             */
            public Builder udmDetail(String udmDetail) {
                this.udmDetail = udmDetail;
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

            public RestoreJob build() {
                return new RestoreJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRestoreJobs2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreJobs2ResponseBody</p>
     */
    public static class RestoreJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RestoreJob")
        private java.util.List<RestoreJob> restoreJob;

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
        public java.util.List<RestoreJob> getRestoreJob() {
            return this.restoreJob;
        }

        public static final class Builder {
            private java.util.List<RestoreJob> restoreJob; 

            private Builder() {
            } 

            private Builder(RestoreJobs model) {
                this.restoreJob = model.restoreJob;
            } 

            /**
             * RestoreJob.
             */
            public Builder restoreJob(java.util.List<RestoreJob> restoreJob) {
                this.restoreJob = restoreJob;
                return this;
            }

            public RestoreJobs build() {
                return new RestoreJobs(this);
            } 

        } 

    }
}
