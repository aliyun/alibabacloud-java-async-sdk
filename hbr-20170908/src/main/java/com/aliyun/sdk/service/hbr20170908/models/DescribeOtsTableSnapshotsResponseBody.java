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
 * {@link DescribeOtsTableSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOtsTableSnapshotsResponseBody</p>
 */
public class DescribeOtsTableSnapshotsResponseBody extends TeaModel {
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
    private java.util.List<Snapshots> snapshots;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeOtsTableSnapshotsResponseBody(Builder builder) {
        this.code = builder.code;
        this.limit = builder.limit;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.snapshots = builder.snapshots;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOtsTableSnapshotsResponseBody create() {
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
    public java.util.List<Snapshots> getSnapshots() {
        return this.snapshots;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer limit; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Snapshots> snapshots; 
        private Boolean success; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of backup snapshots that are displayed on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token that is required to obtain the next page of backup snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>09376812-6290-5E36-B504-E8010D72D1F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The backup snapshots.</p>
         */
        public Builder snapshots(java.util.List<Snapshots> snapshots) {
            this.snapshots = snapshots;
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

        public DescribeOtsTableSnapshotsResponseBody build() {
            return new DescribeOtsTableSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOtsTableSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOtsTableSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private String actualBytes;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ParentSnapshotHash")
        private String parentSnapshotHash;

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

        private Snapshots(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.backupType = builder.backupType;
            this.bytesTotal = builder.bytesTotal;
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.createdTime = builder.createdTime;
            this.instanceName = builder.instanceName;
            this.jobId = builder.jobId;
            this.parentSnapshotHash = builder.parentSnapshotHash;
            this.rangeEnd = builder.rangeEnd;
            this.rangeStart = builder.rangeStart;
            this.retention = builder.retention;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.tableName = builder.tableName;
            this.updatedTime = builder.updatedTime;
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
        public String getActualBytes() {
            return this.actualBytes;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return bytesTotal
         */
        public Long getBytesTotal() {
            return this.bytesTotal;
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
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
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
            private String actualBytes; 
            private String backupType; 
            private Long bytesTotal; 
            private Long completeTime; 
            private Long createTime; 
            private Long createdTime; 
            private String instanceName; 
            private String jobId; 
            private String parentSnapshotHash; 
            private Long rangeEnd; 
            private Long rangeStart; 
            private Long retention; 
            private String snapshotHash; 
            private String snapshotId; 
            private String sourceType; 
            private Long startTime; 
            private String status; 
            private String tableName; 
            private Long updatedTime; 
            private String vaultId; 

            /**
             * <p>The actual data amount of backup snapshots after duplicates are removed. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder actualBytes(String actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * <p>The backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The total amount of data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * <p>The time when the backup snapshot was completed. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642496679</p>
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the Tablestore instance was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1607436917</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642496679</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
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
             * <p>The hash value of the parent backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>f2fe..</p>
             */
            public Builder parentSnapshotHash(String parentSnapshotHash) {
                this.parentSnapshotHash = parentSnapshotHash;
                return this;
            }

            /**
             * <p>The time when the backup job ended. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642521709966</p>
             */
            public Builder rangeEnd(Long rangeEnd) {
                this.rangeEnd = rangeEnd;
                return this;
            }

            /**
             * <p>The time when the backup job started. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642492553038</p>
             */
            public Builder rangeStart(Long rangeStart) {
                this.rangeStart = rangeStart;
                return this;
            }

            /**
             * <p>The retention period of the backup snapshot. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>730</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
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
             * <p>The ID of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-00047mxg17p26*****b</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><strong>ECS_FILE</strong>: backup snapshots for Elastic Compute Service (ECS) files</li>
             * <li><strong>OSS</strong>: backup snapshots for Object Storage Service (OSS) buckets</li>
             * <li><strong>NAS</strong>: backup snapshots for Apsara File Storage NAS file systems</li>
             * <li><strong>OTS_TABLE</strong>: backup snapshots for Tablestore instances</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OTS_TABLE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The time when the backup snapshot started. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642496543</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the backup job. Valid values:</p>
             * <ul>
             * <li><strong>COMPLETE</strong>: The backup job is completed.</li>
             * <li><strong>PARTIAL_COMPLETE</strong>: The backup job is partially completed.</li>
             * <li><strong>FAILED</strong>: The backup job has failed.</li>
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
             * <p>table2</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The time when the backup snapshot was updated. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642496679</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>The ID of the backup vault that stores the backup snapshot.</p>
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
