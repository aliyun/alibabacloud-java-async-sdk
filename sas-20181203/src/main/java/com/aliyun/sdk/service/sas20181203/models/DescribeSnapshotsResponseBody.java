// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotsResponseBody</p>
 */
public class DescribeSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Snapshots")
    private java.util.List<Snapshots> snapshots;

    private DescribeSnapshotsResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.snapshots = builder.snapshots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotsResponseBody create() {
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
     * @return snapshots
     */
    public java.util.List<Snapshots> getSnapshots() {
        return this.snapshots;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<Snapshots> snapshots; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB393****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the backup snapshots.</p>
         */
        public Builder snapshots(java.util.List<Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        public DescribeSnapshotsResponseBody build() {
            return new DescribeSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotsResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.nextToken = builder.nextToken;
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
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
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
            private String nextToken; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The token that is used to initiate the next call.</p>
             * 
             * <strong>example:</strong>
             * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAGYXFWIAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM1Mzc3Njc4MzA2ODY5NmI2YTY1Nzg2NTcxNjE2NDc4****</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>149</p>
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
    /**
     * 
     * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private Long actualBytes;

        @com.aliyun.core.annotation.NameInMap("ActualItems")
        private Long actualItems;

        @com.aliyun.core.annotation.NameInMap("BytesDone")
        private Long bytesDone;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("ErrorFile")
        private String errorFile;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

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
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

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

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        private Snapshots(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.actualItems = builder.actualItems;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
            this.clientId = builder.clientId;
            this.clientVersion = builder.clientVersion;
            this.createdTime = builder.createdTime;
            this.errorFile = builder.errorFile;
            this.instanceId = builder.instanceId;
            this.itemsDone = builder.itemsDone;
            this.itemsTotal = builder.itemsTotal;
            this.jobId = builder.jobId;
            this.parentSnapshotHash = builder.parentSnapshotHash;
            this.path = builder.path;
            this.paths = builder.paths;
            this.planId = builder.planId;
            this.regionId = builder.regionId;
            this.retention = builder.retention;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.uuid = builder.uuid;
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
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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

        public static final class Builder {
            private Long actualBytes; 
            private Long actualItems; 
            private Long bytesDone; 
            private Long bytesTotal; 
            private String clientId; 
            private String clientVersion; 
            private Long createdTime; 
            private String errorFile; 
            private String instanceId; 
            private Long itemsDone; 
            private Long itemsTotal; 
            private String jobId; 
            private String parentSnapshotHash; 
            private String path; 
            private java.util.List<String> paths; 
            private String planId; 
            private String regionId; 
            private Long retention; 
            private String snapshotHash; 
            private String snapshotId; 
            private String sourceType; 
            private String status; 
            private String uuid; 
            private String vaultId; 

            /**
             * <p>The actual data amount of backup snapshots after duplicates are removed. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>686188****</p>
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * <p>The actual number of backup objects.</p>
             * <blockquote>
             * <p> This parameter is available only for file backup.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder actualItems(Long actualItems) {
                this.actualItems = actualItems;
                return this;
            }

            /**
             * <p>The actual amount of data that is generated by incremental backup. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * <p>The total data amount of the data source. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>3484541815****</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * <p>This parameter is returned only if the value of the <strong>SourceType</strong> parameter is <strong>ECS_FILE</strong>. This parameter indicates the ID of the Hybrid Backup Recovery (HBR) agent.</p>
             * 
             * <strong>example:</strong>
             * <p>c-000dbefaw9f7gnbw****</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The version of the anti-ransomware agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2.10.0</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1646793988</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The file that records the information about backup failures, including the information about partially completed backup tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>s-0008ndhgrflh55i5****.csv</p>
             */
            public Builder errorFile(String errorFile) {
                this.errorFile = errorFile;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze78zfakirgh1yl****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number of backup objects.</p>
             * <blockquote>
             * <p> This parameter is available only for file backup.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder itemsDone(Long itemsDone) {
                this.itemsDone = itemsDone;
                return this;
            }

            /**
             * <p>The total number of objects in the data source.</p>
             * <blockquote>
             * <p> This parameter is available only for file backup.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder itemsTotal(Long itemsTotal) {
                this.itemsTotal = itemsTotal;
                return this;
            }

            /**
             * <p>The ID of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>job-000a2q5vg6awgo01****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The hash value of the parent backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>a0181606689c9562f092b3190bddb8a62bb5a24784424ba2102bc7fe92ae****</p>
             */
            public Builder parentSnapshotHash(String parentSnapshotHash) {
                this.parentSnapshotHash = parentSnapshotHash;
                return this;
            }

            /**
             * <p>This parameter is returned only if the value of the <strong>SourceType</strong> parameter is <strong>ECS_FILE</strong>. This parameter indicates the path to the backup files.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/home&quot;]</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>This parameter is returned only if the value of the <strong>SourceType</strong> parameter is <strong>NAS</strong>. This parameter indicates the path to the backup files.</p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The ID of the backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>plan-000ee8gh2ljelsnb****</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The ID of the region in which backup snapshot is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The retention period of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The hash value of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>9ee47cf12351e4ddecce8c12f4957d3946cd96fbe24cd4ab264c7200839d****</p>
             */
            public Builder snapshotHash(String snapshotHash) {
                this.snapshotHash = snapshotHash;
                return this;
            }

            /**
             * <p>The ID of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-0003ahfuqpjdztsg****</p>
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
             * <li><strong>NAS</strong>: File Storage NAS file systems</li>
             * <li><strong>OTS_TABLE</strong>: Tablestore instances</li>
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
             * <p>The status of backup tasks. Valid values:</p>
             * <ul>
             * <li><strong>COMPLETE</strong>: complete</li>
             * <li><strong>PARTIAL_COMPLETE</strong>: partial complete</li>
             * <li><strong>FAILED</strong>: failed</li>
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
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>d332af48-1269-4a55-a6db-8543a80f****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The ID of the backup vault that stores the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>v-000ccok3zmw7fbzz****</p>
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
