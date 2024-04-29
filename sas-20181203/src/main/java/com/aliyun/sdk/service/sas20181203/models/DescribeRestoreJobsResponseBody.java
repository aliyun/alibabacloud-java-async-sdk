// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreJobsResponseBody</p>
 */
public class DescribeRestoreJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoreJobs")
    private java.util.List < RestoreJobs> restoreJobs;

    private DescribeRestoreJobsResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.restoreJobs = builder.restoreJobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
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
    public java.util.List < RestoreJobs> getRestoreJobs() {
        return this.restoreJobs;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < RestoreJobs> restoreJobs; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the restoration tasks.
         */
        public Builder restoreJobs(java.util.List < RestoreJobs> restoreJobs) {
            this.restoreJobs = restoreJobs;
            return this;
        }

        public DescribeRestoreJobsResponseBody build() {
            return new DescribeRestoreJobsResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of restoration tasks returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **10**.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of restoration tasks returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class RestoreJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private Long actualBytes;

        @com.aliyun.core.annotation.NameInMap("BytesDone")
        private Long bytesDone;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        @com.aliyun.core.annotation.NameInMap("ErrorFile")
        private String errorFile;

        @com.aliyun.core.annotation.NameInMap("ErrorFileUrl")
        private String errorFileUrl;

        @com.aliyun.core.annotation.NameInMap("ErrorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("Eta")
        private Long eta;

        @com.aliyun.core.annotation.NameInMap("Excludes")
        private String excludes;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private String exitCode;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Includes")
        private String includes;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("ItemsDone")
        private Long itemsDone;

        @com.aliyun.core.annotation.NameInMap("ItemsTotal")
        private Long itemsTotal;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RestoreId")
        private String restoreId;

        @com.aliyun.core.annotation.NameInMap("RestoreName")
        private String restoreName;

        @com.aliyun.core.annotation.NameInMap("RestoreType")
        private String restoreType;

        @com.aliyun.core.annotation.NameInMap("SnapshotHash")
        private String snapshotHash;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SnapshotVersion")
        private String snapshotVersion;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceClientId")
        private String sourceClientId;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private Long speed;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        @com.aliyun.core.annotation.NameInMap("VaultRegionId")
        private String vaultRegionId;

        private RestoreJobs(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
            this.clientId = builder.clientId;
            this.completeTime = builder.completeTime;
            this.createdTime = builder.createdTime;
            this.duration = builder.duration;
            this.errorCount = builder.errorCount;
            this.errorFile = builder.errorFile;
            this.errorFileUrl = builder.errorFileUrl;
            this.errorType = builder.errorType;
            this.eta = builder.eta;
            this.excludes = builder.excludes;
            this.exitCode = builder.exitCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.includes = builder.includes;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.itemsDone = builder.itemsDone;
            this.itemsTotal = builder.itemsTotal;
            this.message = builder.message;
            this.percentage = builder.percentage;
            this.requestId = builder.requestId;
            this.restoreId = builder.restoreId;
            this.restoreName = builder.restoreName;
            this.restoreType = builder.restoreType;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.snapshotVersion = builder.snapshotVersion;
            this.source = builder.source;
            this.sourceClientId = builder.sourceClientId;
            this.speed = builder.speed;
            this.status = builder.status;
            this.target = builder.target;
            this.updatedTime = builder.updatedTime;
            this.uuid = builder.uuid;
            this.vaultId = builder.vaultId;
            this.vaultRegionId = builder.vaultRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreJobs create() {
            return builder().build();
        }

        /**
         * @return actualBytes
         */
        public Long getActualBytes() {
            return this.actualBytes;
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
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorFile
         */
        public String getErrorFile() {
            return this.errorFile;
        }

        /**
         * @return errorFileUrl
         */
        public String getErrorFileUrl() {
            return this.errorFileUrl;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return eta
         */
        public Long getEta() {
            return this.eta;
        }

        /**
         * @return excludes
         */
        public String getExcludes() {
            return this.excludes;
        }

        /**
         * @return exitCode
         */
        public String getExitCode() {
            return this.exitCode;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return includes
         */
        public String getIncludes() {
            return this.includes;
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
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
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
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return restoreId
         */
        public String getRestoreId() {
            return this.restoreId;
        }

        /**
         * @return restoreName
         */
        public String getRestoreName() {
            return this.restoreName;
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
         * @return snapshotVersion
         */
        public String getSnapshotVersion() {
            return this.snapshotVersion;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceClientId
         */
        public String getSourceClientId() {
            return this.sourceClientId;
        }

        /**
         * @return speed
         */
        public Long getSpeed() {
            return this.speed;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        /**
         * @return vaultRegionId
         */
        public String getVaultRegionId() {
            return this.vaultRegionId;
        }

        public static final class Builder {
            private Long actualBytes; 
            private Long bytesDone; 
            private Long bytesTotal; 
            private String clientId; 
            private Long completeTime; 
            private Long createdTime; 
            private Long duration; 
            private Long errorCount; 
            private String errorFile; 
            private String errorFileUrl; 
            private String errorType; 
            private Long eta; 
            private String excludes; 
            private String exitCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private String includes; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long itemsDone; 
            private Long itemsTotal; 
            private String message; 
            private Integer percentage; 
            private String requestId; 
            private String restoreId; 
            private String restoreName; 
            private String restoreType; 
            private String snapshotHash; 
            private String snapshotId; 
            private String snapshotVersion; 
            private String source; 
            private String sourceClientId; 
            private Long speed; 
            private String status; 
            private String target; 
            private Long updatedTime; 
            private String uuid; 
            private String vaultId; 
            private String vaultRegionId; 

            /**
             * The size of backup data. Unit: bytes.
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * The total size of data that is restored. Unit: bytes.
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * The total size of data that you want to restore. Unit: bytes.
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * The ID of the anti-ransomware agent that is used to restore data.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The timestamp when the restoration task is complete. Unit: milliseconds.
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The timestamp when the restoration task is created. Unit: milliseconds.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The duration of the restoration task. Unit: seconds.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The number of the restoration tasks on which errors occur.
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * The name of the CSV file. The CSV file contains the files that fail to be restored.
             */
            public Builder errorFile(String errorFile) {
                this.errorFile = errorFile;
                return this;
            }

            /**
             * The URL to download the CSV file. The CSV file contains the files that fail to be restored.
             */
            public Builder errorFileUrl(String errorFileUrl) {
                this.errorFileUrl = errorFileUrl;
                return this;
            }

            /**
             * The error code that is returned for the restoration task.
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * The timestamp when the in-progress restoration task is expected to be complete. Unit: seconds.
             */
            public Builder eta(Long eta) {
                this.eta = eta;
                return this;
            }

            /**
             * The directory excluded from the anti-ransomware policy. The value is the directory that you specify to skip protection when you create the anti-ransomware policy.
             */
            public Builder excludes(String excludes) {
                this.excludes = excludes;
                return this;
            }

            /**
             * The return value of the restoration task.
             */
            public Builder exitCode(String exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The time when the restoration task is created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the restoration task is updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The included directory based on which the files to restore are located. The value is the directory that you specify for protection when you create the anti-ransomware policy
             */
            public Builder includes(String includes) {
                this.includes = includes;
                return this;
            }

            /**
             * The ID of the server whose data you want to restore.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server whose data you want to restore.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server whose data you want to restore.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The internal IP address of the server whose data you want to restore.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The number of files that are backed up.
             */
            public Builder itemsDone(Long itemsDone) {
                this.itemsDone = itemsDone;
                return this;
            }

            /**
             * The total number of files that you want to restore.
             */
            public Builder itemsTotal(Long itemsTotal) {
                this.itemsTotal = itemsTotal;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The progress of the restoration task in percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * The ID of the request, which is used to locate and troubleshoot issues.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * The ID of the restoration task.
             */
            public Builder restoreId(String restoreId) {
                this.restoreId = restoreId;
                return this;
            }

            /**
             * The name of the restoration task.
             */
            public Builder restoreName(String restoreName) {
                this.restoreName = restoreName;
                return this;
            }

            /**
             * The type of the file that is restored. Valid values:
             * <p>
             * 
             * *   **ECS_FILE**: files on Elastic Compute Service (ECS) instances
             * *   **FILE**: files on servers in data centers
             */
            public Builder restoreType(String restoreType) {
                this.restoreType = restoreType;
                return this;
            }

            /**
             * The hash value of the snapshot that stores backup data when the data is backed up.
             */
            public Builder snapshotHash(String snapshotHash) {
                this.snapshotHash = snapshotHash;
                return this;
            }

            /**
             * The hash value ID of the snapshot that stores backup data when the data is backed up.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The version of the backup data.
             */
            public Builder snapshotVersion(String snapshotVersion) {
                this.snapshotVersion = snapshotVersion;
                return this;
            }

            /**
             * The path to the source file that you want to restore.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The ID of the anti-ransomware agent that is used to back up data.
             */
            public Builder sourceClientId(String sourceClientId) {
                this.sourceClientId = sourceClientId;
                return this;
            }

            /**
             * The speed of data restoration. Unit: byte/s.
             */
            public Builder speed(Long speed) {
                this.speed = speed;
                return this;
            }

            /**
             * The status of the restoration task. Valid values:
             * <p>
             * 
             * *   **RUNNING**: The task is running.
             * *   **COMPLETE**: The task is complete.
             * *   **FAILED**: The task fails.
             * *   **CANCELING**: The task is being canceled.
             * *   **CANCELED**: The task is canceled.
             * *   **PARTIAL_COMPLETE**: The task is partially successful.
             * *   **CREATED**: The task is created but is not run.
             * *   **EXPIRED**: The task is not updated.
             * *   **QUEUED**: The task is waiting to be run.
             * *   **CLIENT_DELETED**: The task fails because the anti-ransomware agent is uninstalled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The folder to which the backup data is restored. After you create the restoration task, the backup data is restored to the specified folder.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The timestamp when the restoration task was last updated. Unit: milliseconds.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * The UUID of the server whose data you want to restore.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The ID of the backup vault in which the backup data is stored.
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            /**
             * The ID of the region where the backup vault resides.
             */
            public Builder vaultRegionId(String vaultRegionId) {
                this.vaultRegionId = vaultRegionId;
                return this;
            }

            public RestoreJobs build() {
                return new RestoreJobs(this);
            } 

        } 

    }
}
