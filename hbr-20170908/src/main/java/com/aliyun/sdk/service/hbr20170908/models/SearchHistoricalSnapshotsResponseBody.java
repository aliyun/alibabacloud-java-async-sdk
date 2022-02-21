// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchHistoricalSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchHistoricalSnapshotsResponseBody</p>
 */
public class SearchHistoricalSnapshotsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Limit")
    private Integer limit;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Snapshots")
    private Snapshots snapshots;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private SearchHistoricalSnapshotsResponseBody(Builder builder) {
        this.code = builder.code;
        this.limit = builder.limit;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.snapshots = builder.snapshots;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchHistoricalSnapshotsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return snapshots
     */
    public Snapshots getSnapshots() {
        return this.snapshots;
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
        private Integer limit; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Snapshots snapshots; 
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
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Snapshots.
         */
        public Builder snapshots(Snapshots snapshots) {
            this.snapshots = snapshots;
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

        public SearchHistoricalSnapshotsResponseBody build() {
            return new SearchHistoricalSnapshotsResponseBody(this);
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
    public static class Snapshot extends TeaModel {
        @NameInMap("ActualBytes")
        private Long actualBytes;

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

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("CompleteTime")
        private Long completeTime;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("ErrorFile")
        private String errorFile;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ItemsDone")
        private Long itemsDone;

        @NameInMap("ItemsTotal")
        private Long itemsTotal;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("ParentSnapshotHash")
        private String parentSnapshotHash;

        @NameInMap("Path")
        private String path;

        @NameInMap("Paths")
        private Paths paths;

        @NameInMap("Prefix")
        private String prefix;

        @NameInMap("Retention")
        private Long retention;

        @NameInMap("SnapshotHash")
        private String snapshotHash;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("VaultId")
        private String vaultId;

        private Snapshot(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.actualItems = builder.actualItems;
            this.backupType = builder.backupType;
            this.bucket = builder.bucket;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
            this.clientId = builder.clientId;
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.createdTime = builder.createdTime;
            this.errorFile = builder.errorFile;
            this.fileSystemId = builder.fileSystemId;
            this.instanceId = builder.instanceId;
            this.itemsDone = builder.itemsDone;
            this.itemsTotal = builder.itemsTotal;
            this.jobId = builder.jobId;
            this.parentSnapshotHash = builder.parentSnapshotHash;
            this.path = builder.path;
            this.paths = builder.paths;
            this.prefix = builder.prefix;
            this.retention = builder.retention;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.updatedTime = builder.updatedTime;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
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
         * @return errorFile
         */
        public String getErrorFile() {
            return this.errorFile;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
         * @return parentSnapshotHash
         */
        public String getParentSnapshotHash() {
            return this.parentSnapshotHash;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return paths
         */
        public Paths getPaths() {
            return this.paths;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return retention
         */
        public Long getRetention() {
            return this.retention;
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
            private String backupType; 
            private String bucket; 
            private Long bytesDone; 
            private Long bytesTotal; 
            private String clientId; 
            private Long completeTime; 
            private Long createTime; 
            private Long createdTime; 
            private String errorFile; 
            private String fileSystemId; 
            private String instanceId; 
            private Long itemsDone; 
            private Long itemsTotal; 
            private String jobId; 
            private String parentSnapshotHash; 
            private String path; 
            private Paths paths; 
            private String prefix; 
            private Long retention; 
            private String snapshotHash; 
            private String snapshotId; 
            private String sourceType; 
            private Long startTime; 
            private String status; 
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
             * ErrorFile.
             */
            public Builder errorFile(String errorFile) {
                this.errorFile = errorFile;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * ParentSnapshotHash.
             */
            public Builder parentSnapshotHash(String parentSnapshotHash) {
                this.parentSnapshotHash = parentSnapshotHash;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
             * Prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * Retention.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
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

            public Snapshot build() {
                return new Snapshot(this);
            } 

        } 

    }
    public static class Snapshots extends TeaModel {
        @NameInMap("Snapshot")
        private java.util.List < Snapshot> snapshot;

        private Snapshots(Builder builder) {
            this.snapshot = builder.snapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return snapshot
         */
        public java.util.List < Snapshot> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List < Snapshot> snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List < Snapshot> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
