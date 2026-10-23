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
 * {@link SearchHistoricalSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchHistoricalSnapshotsResponseBody</p>
 */
public class SearchHistoricalSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Snapshots")
    private Snapshots snapshots;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

        private Builder() {
        } 

        private Builder(SearchHistoricalSnapshotsResponseBody model) {
            this.code = model.code;
            this.limit = model.limit;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.snapshots = model.snapshots;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of historical snapshots displayed on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * <p>The returned message. The value &quot;successful&quot; is returned for successful requests. An error message is returned for failed requests.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token required to retrieve the next page of snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>BE</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Snapshots.
         */
        public Builder snapshots(Snapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
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
         * <p>The total number of snapshots that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchHistoricalSnapshotsResponseBody build() {
            return new SearchHistoricalSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchHistoricalSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchHistoricalSnapshotsResponseBody</p>
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
     * {@link SearchHistoricalSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchHistoricalSnapshotsResponseBody</p>
     */
    public static class Snapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private Long actualBytes;

        @com.aliyun.core.annotation.NameInMap("ActualItems")
        private Long actualItems;

        @com.aliyun.core.annotation.NameInMap("ArchiveTime")
        private Long archiveTime;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("BytesDone")
        private Long bytesDone;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("ErrorFile")
        private String errorFile;

        @com.aliyun.core.annotation.NameInMap("Exclude")
        private String exclude;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

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

        @com.aliyun.core.annotation.NameInMap("ParentSnapshotHash")
        private String parentSnapshotHash;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private Paths paths;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("ProtectedDataSize")
        private Long protectedDataSize;

        @com.aliyun.core.annotation.NameInMap("RangeEnd")
        private Long rangeEnd;

        @com.aliyun.core.annotation.NameInMap("RangeStart")
        private Long rangeStart;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("SnapshotHash")
        private String snapshotHash;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SourceParentSnapshotHash")
        private String sourceParentSnapshotHash;

        @com.aliyun.core.annotation.NameInMap("SourceSnapshotHash")
        private String sourceSnapshotHash;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("UseCommonNas")
        private Boolean useCommonNas;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        private Snapshot(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.actualItems = builder.actualItems;
            this.archiveTime = builder.archiveTime;
            this.backupType = builder.backupType;
            this.bucket = builder.bucket;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
            this.clientId = builder.clientId;
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.createdTime = builder.createdTime;
            this.errorFile = builder.errorFile;
            this.exclude = builder.exclude;
            this.expireTime = builder.expireTime;
            this.fileSystemId = builder.fileSystemId;
            this.include = builder.include;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.itemsDone = builder.itemsDone;
            this.itemsTotal = builder.itemsTotal;
            this.jobId = builder.jobId;
            this.parentSnapshotHash = builder.parentSnapshotHash;
            this.path = builder.path;
            this.paths = builder.paths;
            this.prefix = builder.prefix;
            this.protectedDataSize = builder.protectedDataSize;
            this.rangeEnd = builder.rangeEnd;
            this.rangeStart = builder.rangeStart;
            this.retention = builder.retention;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.sourceParentSnapshotHash = builder.sourceParentSnapshotHash;
            this.sourceSnapshotHash = builder.sourceSnapshotHash;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.tableName = builder.tableName;
            this.updatedTime = builder.updatedTime;
            this.useCommonNas = builder.useCommonNas;
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
         * @return archiveTime
         */
        public Long getArchiveTime() {
            return this.archiveTime;
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
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
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
         * @return protectedDataSize
         */
        public Long getProtectedDataSize() {
            return this.protectedDataSize;
        }

        /**
         * @return rangeEnd
         */
        public Long getRangeEnd() {
            return this.rangeEnd;
        }

        /**
         * @return rangeStart
         */
        public Long getRangeStart() {
            return this.rangeStart;
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
         * @return sourceParentSnapshotHash
         */
        public String getSourceParentSnapshotHash() {
            return this.sourceParentSnapshotHash;
        }

        /**
         * @return sourceSnapshotHash
         */
        public String getSourceSnapshotHash() {
            return this.sourceSnapshotHash;
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
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
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
         * @return useCommonNas
         */
        public Boolean getUseCommonNas() {
            return this.useCommonNas;
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
            private Long archiveTime; 
            private String backupType; 
            private String bucket; 
            private Long bytesDone; 
            private Long bytesTotal; 
            private String clientId; 
            private Long completeTime; 
            private Long createTime; 
            private Long createdTime; 
            private String errorFile; 
            private String exclude; 
            private Long expireTime; 
            private String fileSystemId; 
            private String include; 
            private String instanceId; 
            private String instanceName; 
            private Long itemsDone; 
            private Long itemsTotal; 
            private String jobId; 
            private String parentSnapshotHash; 
            private String path; 
            private Paths paths; 
            private String prefix; 
            private Long protectedDataSize; 
            private Long rangeEnd; 
            private Long rangeStart; 
            private Long retention; 
            private String snapshotHash; 
            private String snapshotId; 
            private String sourceParentSnapshotHash; 
            private String sourceSnapshotHash; 
            private String sourceType; 
            private Long startTime; 
            private String status; 
            private String storageClass; 
            private String tableName; 
            private Long updatedTime; 
            private Boolean useCommonNas; 
            private String vaultId; 

            private Builder() {
            } 

            private Builder(Snapshot model) {
                this.actualBytes = model.actualBytes;
                this.actualItems = model.actualItems;
                this.archiveTime = model.archiveTime;
                this.backupType = model.backupType;
                this.bucket = model.bucket;
                this.bytesDone = model.bytesDone;
                this.bytesTotal = model.bytesTotal;
                this.clientId = model.clientId;
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.createdTime = model.createdTime;
                this.errorFile = model.errorFile;
                this.exclude = model.exclude;
                this.expireTime = model.expireTime;
                this.fileSystemId = model.fileSystemId;
                this.include = model.include;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.itemsDone = model.itemsDone;
                this.itemsTotal = model.itemsTotal;
                this.jobId = model.jobId;
                this.parentSnapshotHash = model.parentSnapshotHash;
                this.path = model.path;
                this.paths = model.paths;
                this.prefix = model.prefix;
                this.protectedDataSize = model.protectedDataSize;
                this.rangeEnd = model.rangeEnd;
                this.rangeStart = model.rangeStart;
                this.retention = model.retention;
                this.snapshotHash = model.snapshotHash;
                this.snapshotId = model.snapshotId;
                this.sourceParentSnapshotHash = model.sourceParentSnapshotHash;
                this.sourceSnapshotHash = model.sourceSnapshotHash;
                this.sourceType = model.sourceType;
                this.startTime = model.startTime;
                this.status = model.status;
                this.storageClass = model.storageClass;
                this.tableName = model.tableName;
                this.updatedTime = model.updatedTime;
                this.useCommonNas = model.useCommonNas;
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
             * ArchiveTime.
             */
            public Builder archiveTime(Long archiveTime) {
                this.archiveTime = archiveTime;
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
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
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
             * ProtectedDataSize.
             */
            public Builder protectedDataSize(Long protectedDataSize) {
                this.protectedDataSize = protectedDataSize;
                return this;
            }

            /**
             * RangeEnd.
             */
            public Builder rangeEnd(Long rangeEnd) {
                this.rangeEnd = rangeEnd;
                return this;
            }

            /**
             * RangeStart.
             */
            public Builder rangeStart(Long rangeStart) {
                this.rangeStart = rangeStart;
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
             * SourceParentSnapshotHash.
             */
            public Builder sourceParentSnapshotHash(String sourceParentSnapshotHash) {
                this.sourceParentSnapshotHash = sourceParentSnapshotHash;
                return this;
            }

            /**
             * SourceSnapshotHash.
             */
            public Builder sourceSnapshotHash(String sourceSnapshotHash) {
                this.sourceSnapshotHash = sourceSnapshotHash;
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
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
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
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * UseCommonNas.
             */
            public Builder useCommonNas(Boolean useCommonNas) {
                this.useCommonNas = useCommonNas;
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
    /**
     * 
     * {@link SearchHistoricalSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchHistoricalSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
        private java.util.List<Snapshot> snapshot;

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
        public java.util.List<Snapshot> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List<Snapshot> snapshot; 

            private Builder() {
            } 

            private Builder(Snapshots model) {
                this.snapshot = model.snapshot;
            } 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List<Snapshot> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
