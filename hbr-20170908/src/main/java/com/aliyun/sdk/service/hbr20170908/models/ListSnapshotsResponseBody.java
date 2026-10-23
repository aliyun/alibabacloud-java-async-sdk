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
 * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSnapshotsResponseBody</p>
 */
public class ListSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Snapshots")
    private java.util.List<Snapshots> snapshots;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSnapshotsResponseBody(Builder builder) {
        this.code = builder.code;
        this.maxResults = builder.maxResults;
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

    public static ListSnapshotsResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
    public java.util.List<Snapshots> getSnapshots() {
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
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Snapshots> snapshots; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSnapshotsResponseBody model) {
            this.code = model.code;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.snapshots = model.snapshots;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The return code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The maximum number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned message. A value of successful indicates success. If an error occurs, the corresponding error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token for the next page. If NextToken is empty, no more pages exist.</p>
         * 
         * <strong>example:</strong>
         * <p>aWQj********MCMy</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17189276-<strong><strong>-</strong></strong>-****-0FF51B5A41A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of backup points.</p>
         */
        public Builder snapshots(java.util.List<Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
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
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSnapshotsResponseBody build() {
            return new ListSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private Long actualBytes;

        @com.aliyun.core.annotation.NameInMap("ActualItems")
        private Long actualItems;

        @com.aliyun.core.annotation.NameInMap("ArchiveTime")
        private Long archiveTime;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

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

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

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

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        private Snapshots(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.actualItems = builder.actualItems;
            this.archiveTime = builder.archiveTime;
            this.backupType = builder.backupType;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
            this.clientId = builder.clientId;
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.createdTime = builder.createdTime;
            this.errorFile = builder.errorFile;
            this.exclude = builder.exclude;
            this.expireTime = builder.expireTime;
            this.include = builder.include;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.itemsDone = builder.itemsDone;
            this.itemsTotal = builder.itemsTotal;
            this.jobId = builder.jobId;
            this.path = builder.path;
            this.paths = builder.paths;
            this.planId = builder.planId;
            this.protectedDataSize = builder.protectedDataSize;
            this.rangeEnd = builder.rangeEnd;
            this.rangeStart = builder.rangeStart;
            this.retention = builder.retention;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.tableName = builder.tableName;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
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
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
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
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
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
            private Long bytesDone; 
            private Long bytesTotal; 
            private String clientId; 
            private Long completeTime; 
            private Long createTime; 
            private Long createdTime; 
            private String errorFile; 
            private String exclude; 
            private Long expireTime; 
            private String include; 
            private String instanceId; 
            private String instanceName; 
            private Long itemsDone; 
            private Long itemsTotal; 
            private String jobId; 
            private String path; 
            private java.util.List<String> paths; 
            private String planId; 
            private Long protectedDataSize; 
            private Long rangeEnd; 
            private Long rangeStart; 
            private Long retention; 
            private String snapshotHash; 
            private String snapshotId; 
            private String sourceType; 
            private String status; 
            private String storageClass; 
            private String tableName; 
            private String vaultId; 

            private Builder() {
            } 

            private Builder(Snapshots model) {
                this.actualBytes = model.actualBytes;
                this.actualItems = model.actualItems;
                this.archiveTime = model.archiveTime;
                this.backupType = model.backupType;
                this.bytesDone = model.bytesDone;
                this.bytesTotal = model.bytesTotal;
                this.clientId = model.clientId;
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.createdTime = model.createdTime;
                this.errorFile = model.errorFile;
                this.exclude = model.exclude;
                this.expireTime = model.expireTime;
                this.include = model.include;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.itemsDone = model.itemsDone;
                this.itemsTotal = model.itemsTotal;
                this.jobId = model.jobId;
                this.path = model.path;
                this.paths = model.paths;
                this.planId = model.planId;
                this.protectedDataSize = model.protectedDataSize;
                this.rangeEnd = model.rangeEnd;
                this.rangeStart = model.rangeStart;
                this.retention = model.retention;
                this.snapshotHash = model.snapshotHash;
                this.snapshotId = model.snapshotId;
                this.sourceType = model.sourceType;
                this.status = model.status;
                this.storageClass = model.storageClass;
                this.tableName = model.tableName;
                this.vaultId = model.vaultId;
            } 

            /**
             * <p>The actual amount of data written, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * <p>The actual number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder actualItems(Long actualItems) {
                this.actualItems = actualItems;
                return this;
            }

            /**
             * <p>The archive time.</p>
             * 
             * <strong>example:</strong>
             * <p>1640334062</p>
             */
            public Builder archiveTime(Long archiveTime) {
                this.archiveTime = archiveTime;
                return this;
            }

            /**
             * <p>The backup type. A value of <strong>COMPLETE</strong> indicates a full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The amount of backed up data, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * <p>The total amount of data to back up, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * <p>The ID of the backup client when the value of <strong>SourceType</strong> is <strong>ECS_FILE</strong> or <strong>File</strong>. In other cases, this parameter indicates the ID of the backup data source.</p>
             * 
             * <strong>example:</strong>
             * <p>c-*********************</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The backup completion time. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642496679</p>
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The creation time of the backup point, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1607436917</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The backup creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1642496679</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The file that records backup failure information, including information about partially completed backups.</p>
             * 
             * <strong>example:</strong>
             * <p>temp/report/123456789/job-xxxxxxxxx_failed.zip</p>
             */
            public Builder errorFile(String errorFile) {
                this.errorFile = errorFile;
                return this;
            }

            /**
             * <p>The source paths excluded from the backup job.</p>
             * 
             * <strong>example:</strong>
             * <p>[\&quot;/test/example_cn-hangzhou_7.txt\&quot;, \&quot;/test/example_cn-hangzhou_1.txt\&quot;, \&quot;/test/example_cn-hangzhou_3.txt\&quot;, \&quot;/test/example_cn-hangzhou_9.txt\&quot;, \&quot;/test/example_cn-hangzhou_6.txt\&quot;]</p>
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>The expiration time of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>1771901707</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The source paths included in the backup job.</p>
             * 
             * <strong>example:</strong>
             * <p>[\&quot;/test/example_cn-huhehaote_3.txt\&quot;, \&quot;/test/example_cn-huhehaote_9.txt\&quot;, \&quot;/test/example_cn-huhehaote_5.txt\&quot;, \&quot;/test/example_cn-huhehaote_1.txt\&quot;, \&quot;/test/example_cn-huhehaote_7.txt\&quot;]</p>
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * <p>The instance ID of the backup data source.</p>
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
             * <p>The number of backed up items.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder itemsDone(Long itemsDone) {
                this.itemsDone = itemsDone;
                return this;
            }

            /**
             * <p>The total number of items to back up.</p>
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
             * <p>job-00030j3chkt******2</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The backup path.</p>
             * 
             * <strong>example:</strong>
             * <p>/home</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The list of backup paths.</p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The ID of the backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>po-123***7890</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The size of the protected source data, in bytes. When the value of SourceType is ECS_FILE, this parameter indicates the capacity of the protected cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>42949672960</p>
             */
            public Builder protectedDataSize(Long protectedDataSize) {
                this.protectedDataSize = protectedDataSize;
                return this;
            }

            /**
             * <p>The end time of the Tablestore backup job. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642521709966</p>
             */
            public Builder rangeEnd(Long rangeEnd) {
                this.rangeEnd = rangeEnd;
                return this;
            }

            /**
             * <p>The start time of the Tablestore backup job. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642492553038</p>
             */
            public Builder rangeStart(Long rangeStart) {
                this.rangeStart = rangeStart;
                return this;
            }

            /**
             * <p>The retention period of the backup, in days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The hash value of the backup point.</p>
             * 
             * <strong>example:</strong>
             * <p>f2ac5fd243**********************bc4451777be019</p>
             */
            public Builder snapshotHash(String snapshotHash) {
                this.snapshotHash = snapshotHash;
                return this;
            }

            /**
             * <p>The ID of the backup point.</p>
             * 
             * <strong>example:</strong>
             * <p>s-00047mxg17p26*****b</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The data source type. Valid values:</p>
             * <ul>
             * <li><strong>ECS_FILE</strong>: ECS file backup</li>
             * <li><strong>File</strong>: on-premises file backup</li>
             * <li><strong>OSS</strong>: OSS backup</li>
             * <li><strong>NAS</strong>: Alibaba Cloud NAS backup</li>
             * <li><strong>COMMON_NAS</strong>: on-premises NAS backup</li>
             * <li><strong>CONTAINER</strong>: container backup</li>
             * <li><strong>OTS_TABLE</strong>: Tablestore backup</li>
             * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup</li>
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
             * <p>The status of the backup point. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage class. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>The name of the data table in the Tablestore instance.</p>
             * 
             * <strong>example:</strong>
             * <p>table2</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The ID of the vault that stores the backup data.</p>
             * 
             * <strong>example:</strong>
             * <p>v-00030j*******sn</p>
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
