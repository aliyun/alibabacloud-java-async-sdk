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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * RestoreJobs.
         */
        public Builder restoreJobs(RestoreJobs restoreJobs) {
            this.restoreJobs = restoreJobs;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRestoreJobs2ResponseBody build() {
            return new DescribeRestoreJobs2ResponseBody(this);
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

        @NameInMap("ErrorFile")
        private String errorFile;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Exclude")
        private String exclude;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("Include")
        private String include;

        @NameInMap("ItemsDone")
        private Long itemsDone;

        @NameInMap("ItemsTotal")
        private Long itemsTotal;

        @NameInMap("Options")
        private String options;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("Progress")
        private Integer progress;

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
            this.errorFile = builder.errorFile;
            this.errorMessage = builder.errorMessage;
            this.exclude = builder.exclude;
            this.expireTime = builder.expireTime;
            this.include = builder.include;
            this.itemsDone = builder.itemsDone;
            this.itemsTotal = builder.itemsTotal;
            this.options = builder.options;
            this.parentId = builder.parentId;
            this.progress = builder.progress;
            this.restoreId = builder.restoreId;
            this.restoreType = builder.restoreType;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.sourceType = builder.sourceType;
            this.speed = builder.speed;
            this.startTime = builder.startTime;
            this.status = builder.status;
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
         * @return options
         */
        public String getOptions() {
            return this.options;
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
            private String errorFile; 
            private String errorMessage; 
            private String exclude; 
            private Long expireTime; 
            private String include; 
            private Long itemsDone; 
            private Long itemsTotal; 
            private String options; 
            private String parentId; 
            private Integer progress; 
            private String restoreId; 
            private String restoreType; 
            private String snapshotHash; 
            private String snapshotId; 
            private String sourceType; 
            private Long speed; 
            private Long startTime; 
            private String status; 
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
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
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
