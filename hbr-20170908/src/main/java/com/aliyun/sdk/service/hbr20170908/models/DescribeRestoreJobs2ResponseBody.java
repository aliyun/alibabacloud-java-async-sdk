// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
         * <p>The response status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
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
         * <p>The queried restore jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RestoreJob&quot;: []}</p>
         */
        public Builder restoreJobs(RestoreJobs restoreJobs) {
            this.restoreJobs = restoreJobs;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The total number of entries returned.</p>
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

            /**
             * <p>The number of channels processed by each Tablestore restore job.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder batchChannelCount(Integer batchChannelCount) {
                this.batchChannelCount = batchChannelCount;
                return this;
            }

            /**
             * <p>Indicates whether the existing Tablestore restore job was overwritten.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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

            /**
             * <p>The files that failed to be executed.</p>
             * 
             * <strong>example:</strong>
             * <p>/temp/report/158975xxxxxx4625/r-0001hfxxxxxymsspjjtl/job-0001hfxxxxxymsspjjtl_failed.zip</p>
             */
            public Builder failedFiles(String failedFiles) {
                this.failedFiles = failedFiles;
                return this;
            }

            /**
             * <p>The status of the report generation.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder reportTaskStatus(String reportTaskStatus) {
                this.reportTaskStatus = reportTaskStatus;
                return this;
            }

            /**
             * <p>The skipped files.</p>
             * 
             * <strong>example:</strong>
             * <p>/temp/report/158975xxxxxx4625/r-0001hfxxxxxymsspjjtl/job-0001hfxxxxxymsspjjtl_skipped.zip</p>
             */
            public Builder skippedFiles(String skippedFiles) {
                this.skippedFiles = skippedFiles;
                return this;
            }

            /**
             * <p>The files that are successfully executed.</p>
             * 
             * <strong>example:</strong>
             * <p>/temp/report/158975xxxxxx4625/r-0001hfxxxxxymsspjjtl/job-0001hfxxxxxymsspjjtl_success.zip</p>
             */
            public Builder successFiles(String successFiles) {
                this.successFiles = successFiles;
                return this;
            }

            /**
             * <p>The full files that are restored based on the file list.</p>
             * 
             * <strong>example:</strong>
             * <p>/temp/report/158975xxxxxx4625/job-0001hfxxxxxymsspjjtl/job-0001hfxxxxxymsspjjtl_total.csv</p>
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
             * <p>The actual amount of data that is restored after duplicates are removed. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the actual number of objects that are restored by the restore job.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder actualItems(Long actualItems) {
                this.actualItems = actualItems;
                return this;
            }

            /**
             * <p>The amount of data that was restored. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * <p>The total amount of data that was backed up from the data source. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * <p>The ID of the client group used for restoration.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-000******hp6</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the restore job was completed. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the restore job was created. This value is a UNIX timestamp. Unit: seconds.</p>
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
             * <p>Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
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
             * <p>158975xxxxxx4625</p>
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * <p>The files that failed to be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;test.csv&quot;</p>
             */
            public Builder errorFile(String errorFile) {
                this.errorFile = errorFile;
                return this;
            }

            /**
             * <p>The error message that is returned for the restore job.</p>
             * 
             * <strong>example:</strong>
             * <p>PARTIAL_COMPLETE</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the paths to the files that are excluded from the restore job. The value can be up to 255 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>The time when the restore job expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1634714531</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The details about the VMware failback task.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpu&quot;:4,&quot;extra&quot;:&quot;{&quot;restoreVMNamePrefix&quot;:&quot;627-&quot;,&quot;dataCenterName&quot;:&quot;SDDC-Datacenter&quot;,&quot;dataStoreId&quot;:&quot;datastore-50&quot;,&quot;folderId&quot;:&quot;group-v49&quot;,&quot;resourcePoolId&quot;:&quot;resgroup-46&quot;,&quot;locationName&quot;:&quot;vcenter.pc-uf600arcwi9td3eyj641.acvs.aliyuncs.com/SDDC-Datacenter/Workloads&quot;,&quot;computeResourceName&quot;:&quot;SDDC-Datacenter/Default_c-uf600arcwi9td3eyj640&quot;,&quot;dataStoreName&quot;:&quot;Default_c-uf600arcwi9td3eyj640/WorkloadDatastore&quot;,&quot;networkMoReference&quot;:&quot;DistributedVirtualPortgroup:dvportgroup-1001&quot;,&quot;useHotAdd&quot;:false}&quot;,&quot;instanceId&quot;:&quot;i-2vc357i2eannmmotcagz&quot;,&quot;memoryInMB&quot;:8192,&quot;serverId&quot;:&quot;0fdc0c86-eb92-4e05-91ab-eeaf9fb6ad01&quot;,&quot;uefiBoot&quot;:false}</p>
             */
            public Builder failbackDetail(String failbackDetail) {
                this.failbackDetail = failbackDetail;
                return this;
            }

            /**
             * <p>The paths to the files that are included in the restore job.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the number of restored objects.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder itemsDone(Long itemsDone) {
                this.itemsDone = itemsDone;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the total number of objects in the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder itemsTotal(Long itemsTotal) {
                this.itemsTotal = itemsTotal;
                return this;
            }

            /**
             * <p>The amount of data that was restored. Unit: bytes. This parameter is valid only if the StorageClass parameter is set to ARCHIVE. The minimum billable size of the data stored at the Archive tier is 1 MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1048576</p>
             */
            public Builder meteringBytesDone(Long meteringBytesDone) {
                this.meteringBytesDone = meteringBytesDone;
                return this;
            }

            /**
             * <p>The total amount of data that was backed up from the data source. Unit: bytes. This parameter is valid only if the StorageClass parameter is set to ARCHIVE. The minimum billable size of the data stored at the Archive tier is 1 MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1048576</p>
             */
            public Builder meteringBytesTotal(Long meteringBytesTotal) {
                this.meteringBytesTotal = meteringBytesTotal;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a restoration path.</p>
             * <ul>
             * <li>This parameter is available only for Windows ECS instances.</li>
             * <li>If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to <code>[&quot;UseVSS&quot;:true]</code>.</li>
             * <li>If you use VSS, you cannot restore data from multiple directories.</li>
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
             * <p>The details about the Tablestore instance.</p>
             */
            public Builder otsDetail(OtsDetail otsDetail) {
                this.otsDetail = otsDetail;
                return this;
            }

            /**
             * <p>The ID of the parent job.</p>
             * 
             * <strong>example:</strong>
             * <p>r-0003hd2an3x4dyv0l18b</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The progress of the restore job. Valid values: [0,10000]. For example, 10000 indicates that the progress is 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The report of the restore job.</p>
             */
            public Builder report(Report report) {
                this.report = report;
                return this;
            }

            /**
             * <p>The ID of the restore job.</p>
             * 
             * <strong>example:</strong>
             * <p>r-0003*****8a</p>
             */
            public Builder restoreId(String restoreId) {
                this.restoreId = restoreId;
                return this;
            }

            /**
             * <p>The type of the restore job.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_FILE</p>
             */
            public Builder restoreType(String restoreType) {
                this.restoreType = restoreType;
                return this;
            }

            /**
             * <p>The hash value of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>f2fe...</p>
             */
            public Builder snapshotHash(String snapshotHash) {
                this.snapshotHash = snapshotHash;
                return this;
            }

            /**
             * <p>The ID of the snapshot used for restoration.</p>
             * 
             * <strong>example:</strong>
             * <p>s-0002******ga88</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><strong>ECS_FILE</strong>: ECS files</li>
             * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets</li>
             * <li><strong>NAS</strong>: Apsara File Storage NAS (NAS) file systems</li>
             * <li><strong>OTS_TABLE</strong>: Tablestore instances</li>
             * <li><strong>UDM_ECS</strong>: ECS instances</li>
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
             * <p>The time when the restore job started. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the restore job. Valid values:</p>
             * <ul>
             * <li><strong>COMPLETE</strong>: The job is completed.</li>
             * <li><strong>PARTIAL_COMPLETE</strong>: The job is partially completed.</li>
             * <li><strong>FAILED</strong>: The job failed.</li>
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
             * <p>The storage class of the backup data. Valid values:</p>
             * <ul>
             * <li><strong>STANDARD</strong></li>
             * <li><strong>ARCHIVE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>The name of the destination OSS bucket. This parameter is returned only for OSS buckets.</p>
             * 
             * <strong>example:</strong>
             * <p>target-bucket</p>
             */
            public Builder targetBucket(String targetBucket) {
                this.targetBucket = targetBucket;
                return this;
            }

            /**
             * <p>The ID of the destination client.</p>
             * 
             * <strong>example:</strong>
             * <p>c-000e*****397</p>
             */
            public Builder targetClientId(String targetClientId) {
                this.targetClientId = targetClientId;
                return this;
            }

            /**
             * <p>The time when the file system was created. This parameter is returned only for NAS file systems.</p>
             * 
             * <strong>example:</strong>
             * <p>1634714531</p>
             */
            public Builder targetCreateTime(Long targetCreateTime) {
                this.targetCreateTime = targetCreateTime;
                return this;
            }

            /**
             * <p>The ID of the destination data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-000*****997</p>
             */
            public Builder targetDataSourceId(String targetDataSourceId) {
                this.targetDataSourceId = targetDataSourceId;
                return this;
            }

            /**
             * <p>The ID of the destination NAS file system. This parameter is returned only for NAS file systems.</p>
             * 
             * <strong>example:</strong>
             * <p>0be9****9c9</p>
             */
            public Builder targetFileSystemId(String targetFileSystemId) {
                this.targetFileSystemId = targetFileSystemId;
                return this;
            }

            /**
             * <p>The ID of the destination instance for the restore job.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze3m7ktcgw******cs</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * <p>The name of the destination Tablestore instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instancename</p>
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * <p>The destination file path of the restore job.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;D:\rebk&quot;</p>
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * <p>The prefix of the objects that are restored. This parameter is returned only for OSS buckets.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;/target&quot;</p>
             */
            public Builder targetPrefix(String targetPrefix) {
                this.targetPrefix = targetPrefix;
                return this;
            }

            /**
             * <p>The name of the destination table in the Tablestore instance.</p>
             * 
             * <strong>example:</strong>
             * <p>tablename</p>
             */
            public Builder targetTableName(String targetTableName) {
                this.targetTableName = targetTableName;
                return this;
            }

            /**
             * <p>The time when the Tablestore instance was backed up. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642560261</p>
             */
            public Builder targetTime(Long targetTime) {
                this.targetTime = targetTime;
                return this;
            }

            /**
             * <p>The details about Elastic Compute Service (ECS) instance backup.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;doCopy&quot;:true,&quot;doBackup&quot;:false,&quot;instanceName&quot;:&quot;instance example&quot;,&quot;appConsistent&quot;:false,&quot;destinationRegionId&quot;:&quot;cn-shanghai&quot;,&quot;enableFsFreeze&quot;:true,&quot;osNameEn&quot;:&quot;Windows Server  2019 Data Center Edition 64bit Chinese Edition&quot;,&quot;osName&quot;:&quot;Windows Server  2019 Data Center Edition 64bit Chinese Edition&quot;,&quot;diskIdList&quot;:[],&quot;backupVaultId&quot;:&quot;&quot;,&quot;snapshotGroup&quot;:true,&quot;destinationRetention&quot;:35,&quot;platform&quot;:&quot;Windows Server 2012&quot;,&quot;timeoutInSeconds&quot;:60,&quot;backupRetention&quot;:1,&quot;osType&quot;:&quot;windows&quot;,&quot;preScriptPath&quot;:&quot;&quot;,&quot;postScriptPath&quot;:&quot;&quot;,&quot;enableWriters&quot;:true,&quot;ecsDeleted&quot;:false}</p>
             */
            public Builder udmDetail(String udmDetail) {
                this.udmDetail = udmDetail;
                return this;
            }

            /**
             * <p>The time when the restore job was updated. This value is a UNIX timestamp. Unit: seconds.</p>
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
