// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVaultsResponseBody</p>
 */
public class DescribeVaultsResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Vaults")
    private Vaults vaults;

    private DescribeVaultsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.vaults = builder.vaults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVaultsResponseBody create() {
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

    /**
     * @return vaults
     */
    public Vaults getVaults() {
        return this.vaults;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private Vaults vaults; 

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

        /**
         * <p>The backup vaults.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Vault&quot;: []}</p>
         */
        public Builder vaults(Vaults vaults) {
            this.vaults = vaults;
            return this;
        }

        public DescribeVaultsResponseBody build() {
            return new DescribeVaultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class BackupPlanStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Archive")
        private Integer archive;

        @com.aliyun.core.annotation.NameInMap("CommonNas")
        private Integer commonNas;

        @com.aliyun.core.annotation.NameInMap("Csg")
        private Integer csg;

        @com.aliyun.core.annotation.NameInMap("EcsFile")
        private Integer ecsFile;

        @com.aliyun.core.annotation.NameInMap("EcsHana")
        private Integer ecsHana;

        @com.aliyun.core.annotation.NameInMap("Isilon")
        private Integer isilon;

        @com.aliyun.core.annotation.NameInMap("LocalFile")
        private Integer localFile;

        @com.aliyun.core.annotation.NameInMap("LocalVm")
        private Integer localVm;

        @com.aliyun.core.annotation.NameInMap("MySql")
        private Integer mySql;

        @com.aliyun.core.annotation.NameInMap("Nas")
        private Integer nas;

        @com.aliyun.core.annotation.NameInMap("Oracle")
        private Integer oracle;

        @com.aliyun.core.annotation.NameInMap("Oss")
        private Integer oss;

        @com.aliyun.core.annotation.NameInMap("Ots")
        private Integer ots;

        @com.aliyun.core.annotation.NameInMap("SqlServer")
        private Integer sqlServer;

        private BackupPlanStatistics(Builder builder) {
            this.archive = builder.archive;
            this.commonNas = builder.commonNas;
            this.csg = builder.csg;
            this.ecsFile = builder.ecsFile;
            this.ecsHana = builder.ecsHana;
            this.isilon = builder.isilon;
            this.localFile = builder.localFile;
            this.localVm = builder.localVm;
            this.mySql = builder.mySql;
            this.nas = builder.nas;
            this.oracle = builder.oracle;
            this.oss = builder.oss;
            this.ots = builder.ots;
            this.sqlServer = builder.sqlServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupPlanStatistics create() {
            return builder().build();
        }

        /**
         * @return archive
         */
        public Integer getArchive() {
            return this.archive;
        }

        /**
         * @return commonNas
         */
        public Integer getCommonNas() {
            return this.commonNas;
        }

        /**
         * @return csg
         */
        public Integer getCsg() {
            return this.csg;
        }

        /**
         * @return ecsFile
         */
        public Integer getEcsFile() {
            return this.ecsFile;
        }

        /**
         * @return ecsHana
         */
        public Integer getEcsHana() {
            return this.ecsHana;
        }

        /**
         * @return isilon
         */
        public Integer getIsilon() {
            return this.isilon;
        }

        /**
         * @return localFile
         */
        public Integer getLocalFile() {
            return this.localFile;
        }

        /**
         * @return localVm
         */
        public Integer getLocalVm() {
            return this.localVm;
        }

        /**
         * @return mySql
         */
        public Integer getMySql() {
            return this.mySql;
        }

        /**
         * @return nas
         */
        public Integer getNas() {
            return this.nas;
        }

        /**
         * @return oracle
         */
        public Integer getOracle() {
            return this.oracle;
        }

        /**
         * @return oss
         */
        public Integer getOss() {
            return this.oss;
        }

        /**
         * @return ots
         */
        public Integer getOts() {
            return this.ots;
        }

        /**
         * @return sqlServer
         */
        public Integer getSqlServer() {
            return this.sqlServer;
        }

        public static final class Builder {
            private Integer archive; 
            private Integer commonNas; 
            private Integer csg; 
            private Integer ecsFile; 
            private Integer ecsHana; 
            private Integer isilon; 
            private Integer localFile; 
            private Integer localVm; 
            private Integer mySql; 
            private Integer nas; 
            private Integer oracle; 
            private Integer oss; 
            private Integer ots; 
            private Integer sqlServer; 

            /**
             * <p>The number of archive plans.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder archive(Integer archive) {
                this.archive = archive;
                return this;
            }

            /**
             * <p>The number of backup plans for General-purpose NAS file systems.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder commonNas(Integer commonNas) {
                this.commonNas = commonNas;
                return this;
            }

            /**
             * <p>The number of backup plans for Cloud Storage Gateway (CSG) gateways.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder csg(Integer csg) {
                this.csg = csg;
                return this;
            }

            /**
             * <p>The number of backup plans for ECS files.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ecsFile(Integer ecsFile) {
                this.ecsFile = ecsFile;
                return this;
            }

            /**
             * <p>The number of backup plans for SAP HANA instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ecsHana(Integer ecsHana) {
                this.ecsHana = ecsHana;
                return this;
            }

            /**
             * <p>The number of backup plans for Isilon storage systems.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isilon(Integer isilon) {
                this.isilon = isilon;
                return this;
            }

            /**
             * <p>The number of backup plans for on-premises servers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder localFile(Integer localFile) {
                this.localFile = localFile;
                return this;
            }

            /**
             * <p>The number of backup plans for on-premises virtual machines (VMs).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder localVm(Integer localVm) {
                this.localVm = localVm;
                return this;
            }

            /**
             * <p>The number of backup plans for MySQL databases.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mySql(Integer mySql) {
                this.mySql = mySql;
                return this;
            }

            /**
             * <p>The number of backup plans for NAS file systems.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nas(Integer nas) {
                this.nas = nas;
                return this;
            }

            /**
             * <p>The number of backup plans for Oracle databases.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder oracle(Integer oracle) {
                this.oracle = oracle;
                return this;
            }

            /**
             * <p>The number of backup plans for OSS buckets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder oss(Integer oss) {
                this.oss = oss;
                return this;
            }

            /**
             * <p>The number of backup plans for Tablestore instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ots(Integer ots) {
                this.ots = ots;
                return this;
            }

            /**
             * <p>The number of backup plans for SQL Server databases.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sqlServer(Integer sqlServer) {
                this.sqlServer = sqlServer;
                return this;
            }

            public BackupPlanStatistics build() {
                return new BackupPlanStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class ReplicationProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HistoricalReplicationProgress")
        private Integer historicalReplicationProgress;

        @com.aliyun.core.annotation.NameInMap("NewReplicationProgress")
        private Long newReplicationProgress;

        private ReplicationProgress(Builder builder) {
            this.historicalReplicationProgress = builder.historicalReplicationProgress;
            this.newReplicationProgress = builder.newReplicationProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationProgress create() {
            return builder().build();
        }

        /**
         * @return historicalReplicationProgress
         */
        public Integer getHistoricalReplicationProgress() {
            return this.historicalReplicationProgress;
        }

        /**
         * @return newReplicationProgress
         */
        public Long getNewReplicationProgress() {
            return this.newReplicationProgress;
        }

        public static final class Builder {
            private Integer historicalReplicationProgress; 
            private Long newReplicationProgress; 

            /**
             * <p>The progress of historical data synchronization from the backup vault to the mirror vault. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder historicalReplicationProgress(Integer historicalReplicationProgress) {
                this.historicalReplicationProgress = historicalReplicationProgress;
                return this;
            }

            /**
             * <p>The latest synchronization time of incremental data in the mirror vault.</p>
             * 
             * <strong>example:</strong>
             * <p>1579413159</p>
             */
            public Builder newReplicationProgress(Long newReplicationProgress) {
                this.newReplicationProgress = newReplicationProgress;
                return this;
            }

            public ReplicationProgress build() {
                return new ReplicationProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class SourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceType")
        private java.util.List < String > sourceType;

        private SourceTypes(Builder builder) {
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceTypes create() {
            return builder().build();
        }

        /**
         * @return sourceType
         */
        public java.util.List < String > getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private java.util.List < String > sourceType; 

            /**
             * SourceType.
             */
            public Builder sourceType(java.util.List < String > sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public SourceTypes build() {
                return new SourceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key of the backup vault. Valid values of N: 1 to 20.</p>
             * <ul>
             * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
             * <li>The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
             * <li>The tag key cannot be an empty string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the backup vault. Valid values of N: 1 to 20.</p>
             * <ul>
             * <li>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
             * <li>The tag value cannot contain <code>http://</code> or <code>https://</code>.</li>
             * <li>The tag value cannot be an empty string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>a1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class TrialInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeepAfterTrialExpiration")
        private Boolean keepAfterTrialExpiration;

        @com.aliyun.core.annotation.NameInMap("TrialExpireTime")
        private Long trialExpireTime;

        @com.aliyun.core.annotation.NameInMap("TrialStartTime")
        private Long trialStartTime;

        @com.aliyun.core.annotation.NameInMap("TrialVaultReleaseTime")
        private Long trialVaultReleaseTime;

        private TrialInfo(Builder builder) {
            this.keepAfterTrialExpiration = builder.keepAfterTrialExpiration;
            this.trialExpireTime = builder.trialExpireTime;
            this.trialStartTime = builder.trialStartTime;
            this.trialVaultReleaseTime = builder.trialVaultReleaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrialInfo create() {
            return builder().build();
        }

        /**
         * @return keepAfterTrialExpiration
         */
        public Boolean getKeepAfterTrialExpiration() {
            return this.keepAfterTrialExpiration;
        }

        /**
         * @return trialExpireTime
         */
        public Long getTrialExpireTime() {
            return this.trialExpireTime;
        }

        /**
         * @return trialStartTime
         */
        public Long getTrialStartTime() {
            return this.trialStartTime;
        }

        /**
         * @return trialVaultReleaseTime
         */
        public Long getTrialVaultReleaseTime() {
            return this.trialVaultReleaseTime;
        }

        public static final class Builder {
            private Boolean keepAfterTrialExpiration; 
            private Long trialExpireTime; 
            private Long trialStartTime; 
            private Long trialVaultReleaseTime; 

            /**
             * <p>Indicates whether you are billed based on the pay-as-you-go method after the free trial ends.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder keepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
                this.keepAfterTrialExpiration = keepAfterTrialExpiration;
                return this;
            }

            /**
             * <p>The expiration time of the free trial.</p>
             * 
             * <strong>example:</strong>
             * <p>1584597600</p>
             */
            public Builder trialExpireTime(Long trialExpireTime) {
                this.trialExpireTime = trialExpireTime;
                return this;
            }

            /**
             * <p>The start time of the free trial.</p>
             * 
             * <strong>example:</strong>
             * <p>1579413159</p>
             */
            public Builder trialStartTime(Long trialStartTime) {
                this.trialStartTime = trialStartTime;
                return this;
            }

            /**
             * <p>The time when the free-trial backup vault is released.</p>
             * 
             * <strong>example:</strong>
             * <p>1594965600</p>
             */
            public Builder trialVaultReleaseTime(Long trialVaultReleaseTime) {
                this.trialVaultReleaseTime = trialVaultReleaseTime;
                return this;
            }

            public TrialInfo build() {
                return new TrialInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class Vault extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveBytesDone")
        private Long archiveBytesDone;

        @com.aliyun.core.annotation.NameInMap("ArchiveStorageSize")
        private Long archiveStorageSize;

        @com.aliyun.core.annotation.NameInMap("BackupPlanStatistics")
        private BackupPlanStatistics backupPlanStatistics;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("BytesDone")
        private Long bytesDone;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ChargedStorageSize")
        private Long chargedStorageSize;

        @com.aliyun.core.annotation.NameInMap("CompressionAlgorithm")
        private String compressionAlgorithm;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Dedup")
        private Boolean dedup;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("IndexAvailable")
        private Boolean indexAvailable;

        @com.aliyun.core.annotation.NameInMap("IndexLevel")
        private String indexLevel;

        @com.aliyun.core.annotation.NameInMap("IndexUpdateTime")
        private Long indexUpdateTime;

        @com.aliyun.core.annotation.NameInMap("KmsKeyId")
        private String kmsKeyId;

        @com.aliyun.core.annotation.NameInMap("LatestReplicationTime")
        private Long latestReplicationTime;

        @com.aliyun.core.annotation.NameInMap("RedundancyType")
        private String redundancyType;

        @com.aliyun.core.annotation.NameInMap("Replication")
        private Boolean replication;

        @com.aliyun.core.annotation.NameInMap("ReplicationProgress")
        private ReplicationProgress replicationProgress;

        @com.aliyun.core.annotation.NameInMap("ReplicationSourceRegionId")
        private String replicationSourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ReplicationSourceVault")
        private Boolean replicationSourceVault;

        @com.aliyun.core.annotation.NameInMap("ReplicationSourceVaultId")
        private String replicationSourceVaultId;

        @com.aliyun.core.annotation.NameInMap("ReplicationTargetRegionId")
        private String replicationTargetRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("SearchEnabled")
        private Boolean searchEnabled;

        @com.aliyun.core.annotation.NameInMap("SnapshotCount")
        private Long snapshotCount;

        @com.aliyun.core.annotation.NameInMap("SourceTypes")
        private SourceTypes sourceTypes;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Long storageSize;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TrialInfo")
        private TrialInfo trialInfo;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        @com.aliyun.core.annotation.NameInMap("VaultName")
        private String vaultName;

        @com.aliyun.core.annotation.NameInMap("VaultRegionId")
        private String vaultRegionId;

        @com.aliyun.core.annotation.NameInMap("VaultStatusMessage")
        private String vaultStatusMessage;

        @com.aliyun.core.annotation.NameInMap("VaultStorageClass")
        private String vaultStorageClass;

        @com.aliyun.core.annotation.NameInMap("VaultType")
        private String vaultType;

        @com.aliyun.core.annotation.NameInMap("WormEnabled")
        private Boolean wormEnabled;

        private Vault(Builder builder) {
            this.archiveBytesDone = builder.archiveBytesDone;
            this.archiveStorageSize = builder.archiveStorageSize;
            this.backupPlanStatistics = builder.backupPlanStatistics;
            this.bucketName = builder.bucketName;
            this.bytesDone = builder.bytesDone;
            this.chargeType = builder.chargeType;
            this.chargedStorageSize = builder.chargedStorageSize;
            this.compressionAlgorithm = builder.compressionAlgorithm;
            this.createdTime = builder.createdTime;
            this.dedup = builder.dedup;
            this.description = builder.description;
            this.encryptType = builder.encryptType;
            this.indexAvailable = builder.indexAvailable;
            this.indexLevel = builder.indexLevel;
            this.indexUpdateTime = builder.indexUpdateTime;
            this.kmsKeyId = builder.kmsKeyId;
            this.latestReplicationTime = builder.latestReplicationTime;
            this.redundancyType = builder.redundancyType;
            this.replication = builder.replication;
            this.replicationProgress = builder.replicationProgress;
            this.replicationSourceRegionId = builder.replicationSourceRegionId;
            this.replicationSourceVault = builder.replicationSourceVault;
            this.replicationSourceVaultId = builder.replicationSourceVaultId;
            this.replicationTargetRegionId = builder.replicationTargetRegionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.retention = builder.retention;
            this.searchEnabled = builder.searchEnabled;
            this.snapshotCount = builder.snapshotCount;
            this.sourceTypes = builder.sourceTypes;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.tags = builder.tags;
            this.trialInfo = builder.trialInfo;
            this.updatedTime = builder.updatedTime;
            this.vaultId = builder.vaultId;
            this.vaultName = builder.vaultName;
            this.vaultRegionId = builder.vaultRegionId;
            this.vaultStatusMessage = builder.vaultStatusMessage;
            this.vaultStorageClass = builder.vaultStorageClass;
            this.vaultType = builder.vaultType;
            this.wormEnabled = builder.wormEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vault create() {
            return builder().build();
        }

        /**
         * @return archiveBytesDone
         */
        public Long getArchiveBytesDone() {
            return this.archiveBytesDone;
        }

        /**
         * @return archiveStorageSize
         */
        public Long getArchiveStorageSize() {
            return this.archiveStorageSize;
        }

        /**
         * @return backupPlanStatistics
         */
        public BackupPlanStatistics getBackupPlanStatistics() {
            return this.backupPlanStatistics;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return bytesDone
         */
        public Long getBytesDone() {
            return this.bytesDone;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return chargedStorageSize
         */
        public Long getChargedStorageSize() {
            return this.chargedStorageSize;
        }

        /**
         * @return compressionAlgorithm
         */
        public String getCompressionAlgorithm() {
            return this.compressionAlgorithm;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dedup
         */
        public Boolean getDedup() {
            return this.dedup;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encryptType
         */
        public String getEncryptType() {
            return this.encryptType;
        }

        /**
         * @return indexAvailable
         */
        public Boolean getIndexAvailable() {
            return this.indexAvailable;
        }

        /**
         * @return indexLevel
         */
        public String getIndexLevel() {
            return this.indexLevel;
        }

        /**
         * @return indexUpdateTime
         */
        public Long getIndexUpdateTime() {
            return this.indexUpdateTime;
        }

        /**
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        /**
         * @return latestReplicationTime
         */
        public Long getLatestReplicationTime() {
            return this.latestReplicationTime;
        }

        /**
         * @return redundancyType
         */
        public String getRedundancyType() {
            return this.redundancyType;
        }

        /**
         * @return replication
         */
        public Boolean getReplication() {
            return this.replication;
        }

        /**
         * @return replicationProgress
         */
        public ReplicationProgress getReplicationProgress() {
            return this.replicationProgress;
        }

        /**
         * @return replicationSourceRegionId
         */
        public String getReplicationSourceRegionId() {
            return this.replicationSourceRegionId;
        }

        /**
         * @return replicationSourceVault
         */
        public Boolean getReplicationSourceVault() {
            return this.replicationSourceVault;
        }

        /**
         * @return replicationSourceVaultId
         */
        public String getReplicationSourceVaultId() {
            return this.replicationSourceVaultId;
        }

        /**
         * @return replicationTargetRegionId
         */
        public String getReplicationTargetRegionId() {
            return this.replicationTargetRegionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return retention
         */
        public Long getRetention() {
            return this.retention;
        }

        /**
         * @return searchEnabled
         */
        public Boolean getSearchEnabled() {
            return this.searchEnabled;
        }

        /**
         * @return snapshotCount
         */
        public Long getSnapshotCount() {
            return this.snapshotCount;
        }

        /**
         * @return sourceTypes
         */
        public SourceTypes getSourceTypes() {
            return this.sourceTypes;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return trialInfo
         */
        public TrialInfo getTrialInfo() {
            return this.trialInfo;
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

        /**
         * @return vaultName
         */
        public String getVaultName() {
            return this.vaultName;
        }

        /**
         * @return vaultRegionId
         */
        public String getVaultRegionId() {
            return this.vaultRegionId;
        }

        /**
         * @return vaultStatusMessage
         */
        public String getVaultStatusMessage() {
            return this.vaultStatusMessage;
        }

        /**
         * @return vaultStorageClass
         */
        public String getVaultStorageClass() {
            return this.vaultStorageClass;
        }

        /**
         * @return vaultType
         */
        public String getVaultType() {
            return this.vaultType;
        }

        /**
         * @return wormEnabled
         */
        public Boolean getWormEnabled() {
            return this.wormEnabled;
        }

        public static final class Builder {
            private Long archiveBytesDone; 
            private Long archiveStorageSize; 
            private BackupPlanStatistics backupPlanStatistics; 
            private String bucketName; 
            private Long bytesDone; 
            private String chargeType; 
            private Long chargedStorageSize; 
            private String compressionAlgorithm; 
            private Long createdTime; 
            private Boolean dedup; 
            private String description; 
            private String encryptType; 
            private Boolean indexAvailable; 
            private String indexLevel; 
            private Long indexUpdateTime; 
            private String kmsKeyId; 
            private Long latestReplicationTime; 
            private String redundancyType; 
            private Boolean replication; 
            private ReplicationProgress replicationProgress; 
            private String replicationSourceRegionId; 
            private Boolean replicationSourceVault; 
            private String replicationSourceVaultId; 
            private String replicationTargetRegionId; 
            private String resourceGroupId; 
            private Long retention; 
            private Boolean searchEnabled; 
            private Long snapshotCount; 
            private SourceTypes sourceTypes; 
            private String status; 
            private Long storageSize; 
            private Tags tags; 
            private TrialInfo trialInfo; 
            private Long updatedTime; 
            private String vaultId; 
            private String vaultName; 
            private String vaultRegionId; 
            private String vaultStatusMessage; 
            private String vaultStorageClass; 
            private String vaultType; 
            private Boolean wormEnabled; 

            /**
             * ArchiveBytesDone.
             */
            public Builder archiveBytesDone(Long archiveBytesDone) {
                this.archiveBytesDone = archiveBytesDone;
                return this;
            }

            /**
             * <p>The billable storage usage of the Archive tier. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024000</p>
             */
            public Builder archiveStorageSize(Long archiveStorageSize) {
                this.archiveStorageSize = archiveStorageSize;
                return this;
            }

            /**
             * <p>The statistics of backup plans that use the backup vault.</p>
             */
            public Builder backupPlanStatistics(BackupPlanStatistics backupPlanStatistics) {
                this.backupPlanStatistics = backupPlanStatistics;
                return this;
            }

            /**
             * <p>The name of the OSS bucket used by the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>hbr-0005i51******t58</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The amount of data that is backed up. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * <p>The billing method of the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>FREE</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The billable storage usage of the archive vault. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024000</p>
             */
            public Builder chargedStorageSize(Long chargedStorageSize) {
                this.chargedStorageSize = chargedStorageSize;
                return this;
            }

            /**
             * <p>The encryption algorithm used to compress the backup vault. Valid values:</p>
             * <ul>
             * <li>DISABLED: The backup vault is not compressed.</li>
             * <li>SNAPPY: The backup vault is compressed by using the SNAPPY encryption algorithm.</li>
             * <li>ZSTD: The backup vault is compressed by using Zstandard, a fast lossless compression algorithm.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ZSTD</p>
             */
            public Builder compressionAlgorithm(String compressionAlgorithm) {
                this.compressionAlgorithm = compressionAlgorithm;
                return this;
            }

            /**
             * <p>The time when the backup vault was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Indicates whether the deduplication feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dedup(Boolean dedup) {
                this.dedup = dedup;
                return this;
            }

            /**
             * <p>The description of the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>vault description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The encryption type of the backup vault. Valid values:</p>
             * <ul>
             * <li>NONE: The backup vault is not encrypted.</li>
             * <li>HBR_PRIVATE (default): The backup vault is encrypted by using a key provided by Cloud Backup.</li>
             * <li>KMS: The backup vault is encrypted by using a custom master key (CMK) created in Key Management Service (KMS).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HBR_PRIVATE</p>
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * <p>Indicates whether indexes are available. Indexes are available when they are not being updated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder indexAvailable(Boolean indexAvailable) {
                this.indexAvailable = indexAvailable;
                return this;
            }

            /**
             * <p>The index level.</p>
             * <ul>
             * <li>OFF: No indexes are created.</li>
             * <li>META: Metadata indexes are created.</li>
             * <li>ALL: Full-text indexes are created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OFF</p>
             */
            public Builder indexLevel(String indexLevel) {
                this.indexLevel = indexLevel;
                return this;
            }

            /**
             * <p>The time when the index was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1639645628</p>
             */
            public Builder indexUpdateTime(Long indexUpdateTime) {
                this.indexUpdateTime = indexUpdateTime;
                return this;
            }

            /**
             * <p>The ID or alias of the CMK created in KMS. This parameter is returned only when EncryptType is set to KMS.</p>
             * 
             * <strong>example:</strong>
             * <p>alias/acs/acm</p>
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * <p>The time when the last remote backup was synchronized. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder latestReplicationTime(Long latestReplicationTime) {
                this.latestReplicationTime = latestReplicationTime;
                return this;
            }

            /**
             * <p>The data redundancy type of the backup vault. Valid values:</p>
             * <ul>
             * <li>LRS: Locally redundant storage (LRS) is enabled for the backup vault. Cloud Backup stores the copies of each object on multiple devices of different facilities in the same zone. This way, Cloud Backup ensures data durability and availability even if hardware failures occur.</li>
             * <li>ZRS: Zone-redundant storage (ZRS) is enabled for the backup vault. Cloud Backup uses the multi-zone mechanism to distribute data across three zones within the same region. If a zone fails, the data that is stored in the other two zones is still accessible.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LRS</p>
             */
            public Builder redundancyType(String redundancyType) {
                this.redundancyType = redundancyType;
                return this;
            }

            /**
             * <p>Indicates whether the backup vault is a remote backup vault. Valid values:</p>
             * <ul>
             * <li>true: The backup vault is a remote backup vault.</li>
             * <li>false: The backup vault is a local backup vault.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder replication(Boolean replication) {
                this.replication = replication;
                return this;
            }

            /**
             * <p>The progress of data synchronization from the backup vault to the mirror vault.</p>
             */
            public Builder replicationProgress(ReplicationProgress replicationProgress) {
                this.replicationProgress = replicationProgress;
                return this;
            }

            /**
             * <p>The ID of the region in which the source vault resides. This parameter is valid only for remote backup vaults.</p>
             * 
             * <strong>example:</strong>
             * <p>v-*********************</p>
             */
            public Builder replicationSourceRegionId(String replicationSourceRegionId) {
                this.replicationSourceRegionId = replicationSourceRegionId;
                return this;
            }

            /**
             * <p>Indicate whether the backup vault is the source vault that corresponds to the remote backup vault. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder replicationSourceVault(Boolean replicationSourceVault) {
                this.replicationSourceVault = replicationSourceVault;
                return this;
            }

            /**
             * <p>The ID of the source vault that corresponds to the remote backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>v-*********************</p>
             */
            public Builder replicationSourceVaultId(String replicationSourceVaultId) {
                this.replicationSourceVaultId = replicationSourceVaultId;
                return this;
            }

            /**
             * ReplicationTargetRegionId.
             */
            public Builder replicationTargetRegionId(String replicationTargetRegionId) {
                this.replicationTargetRegionId = replicationTargetRegionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-*********************</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The retention period of the backup vault. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>Indicates whether the backup search feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder searchEnabled(Boolean searchEnabled) {
                this.searchEnabled = searchEnabled;
                return this;
            }

            /**
             * <p>The number of snapshots in the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder snapshotCount(Long snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * <p>The data source types of the backup vault.</p>
             */
            public Builder sourceTypes(SourceTypes sourceTypes) {
                this.sourceTypes = sourceTypes;
                return this;
            }

            /**
             * <p>The status of the backup vault. Valid values:</p>
             * <ul>
             * <li><strong>UNKNOWN</strong>: The backup vault is in an unknown state.</li>
             * <li><strong>INITIALIZING</strong>: The backup vault is being initialized.</li>
             * <li><strong>CREATED</strong>: The backup vault is created.</li>
             * <li><strong>ERROR</strong>: An error occurs on the backup vault.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The usage of the backup vault. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The tags of the backup vault.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The free trial information.</p>
             */
            public Builder trialInfo(TrialInfo trialInfo) {
                this.trialInfo = trialInfo;
                return this;
            }

            /**
             * <p>The time when the backup vault was updated. The value is a UNIX timestamp. Unit: seconds.</p>
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
             * <p>v-*********************</p>
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            /**
             * <p>The name of the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>vaultname</p>
             */
            public Builder vaultName(String vaultName) {
                this.vaultName = vaultName;
                return this;
            }

            /**
             * <p>The ID of the region in which the backup vault resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder vaultRegionId(String vaultRegionId) {
                this.vaultRegionId = vaultRegionId;
                return this;
            }

            /**
             * <p>The status message that is returned when the backup vault is in the ERROR state. This parameter is valid only for remote backup vaults. Valid values:</p>
             * <ul>
             * <li><strong>UNKNOWN_ERROR</strong>: An unknown error occurs.</li>
             * <li><strong>SOURCE_VAULT_ALREADY_HAS_REPLICATION</strong>: A mirror vault is configured for the source vault.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SOURCE_VAULT_ALREADY_HAS_REPLICATION</p>
             */
            public Builder vaultStatusMessage(String vaultStatusMessage) {
                this.vaultStatusMessage = vaultStatusMessage;
                return this;
            }

            /**
             * <p>The storage class of the backup vault. Valid value: <strong>STANDARD</strong>, which indicates standard storage.</p>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder vaultStorageClass(String vaultStorageClass) {
                this.vaultStorageClass = vaultStorageClass;
                return this;
            }

            /**
             * <p>The type of the backup vault. Valid value: <strong>STANDARD</strong>, which indicates a standard backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder vaultType(String vaultType) {
                this.vaultType = vaultType;
                return this;
            }

            /**
             * <p>Indicates whether the immutable backup feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder wormEnabled(Boolean wormEnabled) {
                this.wormEnabled = wormEnabled;
                return this;
            }

            public Vault build() {
                return new Vault(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class Vaults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vault")
        private java.util.List < Vault> vault;

        private Vaults(Builder builder) {
            this.vault = builder.vault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vaults create() {
            return builder().build();
        }

        /**
         * @return vault
         */
        public java.util.List < Vault> getVault() {
            return this.vault;
        }

        public static final class Builder {
            private java.util.List < Vault> vault; 

            /**
             * Vault.
             */
            public Builder vault(java.util.List < Vault> vault) {
                this.vault = vault;
                return this;
            }

            public Vaults build() {
                return new Vaults(this);
            } 

        } 

    }
}
