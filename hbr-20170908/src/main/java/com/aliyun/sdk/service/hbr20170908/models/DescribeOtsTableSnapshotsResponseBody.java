// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOtsTableSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOtsTableSnapshotsResponseBody</p>
 */
public class DescribeOtsTableSnapshotsResponseBody extends TeaModel {
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
    private java.util.List < Snapshots> snapshots;

    @NameInMap("Success")
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
    public java.util.List < Snapshots> getSnapshots() {
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
        private java.util.List < Snapshots> snapshots; 
        private Boolean success; 

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
        public Builder snapshots(java.util.List < Snapshots> snapshots) {
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

        public DescribeOtsTableSnapshotsResponseBody build() {
            return new DescribeOtsTableSnapshotsResponseBody(this);
        } 

    } 

    public static class Snapshots extends TeaModel {
        @NameInMap("ActualBytes")
        private String actualBytes;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("BytesTotal")
        private Long bytesTotal;

        @NameInMap("CompleteTime")
        private Long completeTime;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("ParentSnapshotHash")
        private String parentSnapshotHash;

        @NameInMap("RangeEnd")
        private Long rangeEnd;

        @NameInMap("RangeStart")
        private Long rangeStart;

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

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("VaultId")
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
             * ActualBytes.
             */
            public Builder actualBytes(String actualBytes) {
                this.actualBytes = actualBytes;
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
             * BytesTotal.
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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
             * VaultId.
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
