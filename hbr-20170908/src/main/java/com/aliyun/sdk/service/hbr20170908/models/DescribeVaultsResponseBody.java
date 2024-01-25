// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVaultsResponseBody</p>
 */
public class DescribeVaultsResponseBody extends TeaModel {
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

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Vaults")
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
         * Vaults.
         */
        public Builder vaults(Vaults vaults) {
            this.vaults = vaults;
            return this;
        }

        public DescribeVaultsResponseBody build() {
            return new DescribeVaultsResponseBody(this);
        } 

    } 

    public static class BackupPlanStatistics extends TeaModel {
        @NameInMap("CommonNas")
        private Integer commonNas;

        @NameInMap("Csg")
        private Integer csg;

        @NameInMap("EcsFile")
        private Integer ecsFile;

        @NameInMap("EcsHana")
        private Integer ecsHana;

        @NameInMap("Isilon")
        private Integer isilon;

        @NameInMap("LocalFile")
        private Integer localFile;

        @NameInMap("LocalVm")
        private Integer localVm;

        @NameInMap("MySql")
        private Integer mySql;

        @NameInMap("Nas")
        private Integer nas;

        @NameInMap("Oracle")
        private Integer oracle;

        @NameInMap("Oss")
        private Integer oss;

        @NameInMap("Ots")
        private Integer ots;

        @NameInMap("SqlServer")
        private Integer sqlServer;

        private BackupPlanStatistics(Builder builder) {
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
             * CommonNas.
             */
            public Builder commonNas(Integer commonNas) {
                this.commonNas = commonNas;
                return this;
            }

            /**
             * Csg.
             */
            public Builder csg(Integer csg) {
                this.csg = csg;
                return this;
            }

            /**
             * EcsFile.
             */
            public Builder ecsFile(Integer ecsFile) {
                this.ecsFile = ecsFile;
                return this;
            }

            /**
             * EcsHana.
             */
            public Builder ecsHana(Integer ecsHana) {
                this.ecsHana = ecsHana;
                return this;
            }

            /**
             * Isilon.
             */
            public Builder isilon(Integer isilon) {
                this.isilon = isilon;
                return this;
            }

            /**
             * LocalFile.
             */
            public Builder localFile(Integer localFile) {
                this.localFile = localFile;
                return this;
            }

            /**
             * LocalVm.
             */
            public Builder localVm(Integer localVm) {
                this.localVm = localVm;
                return this;
            }

            /**
             * MySql.
             */
            public Builder mySql(Integer mySql) {
                this.mySql = mySql;
                return this;
            }

            /**
             * Nas.
             */
            public Builder nas(Integer nas) {
                this.nas = nas;
                return this;
            }

            /**
             * Oracle.
             */
            public Builder oracle(Integer oracle) {
                this.oracle = oracle;
                return this;
            }

            /**
             * Oss.
             */
            public Builder oss(Integer oss) {
                this.oss = oss;
                return this;
            }

            /**
             * Ots.
             */
            public Builder ots(Integer ots) {
                this.ots = ots;
                return this;
            }

            /**
             * SqlServer.
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
    public static class ReplicationProgress extends TeaModel {
        @NameInMap("HistoricalReplicationProgress")
        private Integer historicalReplicationProgress;

        @NameInMap("NewReplicationProgress")
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
             * HistoricalReplicationProgress.
             */
            public Builder historicalReplicationProgress(Integer historicalReplicationProgress) {
                this.historicalReplicationProgress = historicalReplicationProgress;
                return this;
            }

            /**
             * NewReplicationProgress.
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
    public static class SourceTypes extends TeaModel {
        @NameInMap("SourceType")
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
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
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
    public static class TrialInfo extends TeaModel {
        @NameInMap("KeepAfterTrialExpiration")
        private Boolean keepAfterTrialExpiration;

        @NameInMap("TrialExpireTime")
        private Long trialExpireTime;

        @NameInMap("TrialStartTime")
        private Long trialStartTime;

        @NameInMap("TrialVaultReleaseTime")
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
             * KeepAfterTrialExpiration.
             */
            public Builder keepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
                this.keepAfterTrialExpiration = keepAfterTrialExpiration;
                return this;
            }

            /**
             * TrialExpireTime.
             */
            public Builder trialExpireTime(Long trialExpireTime) {
                this.trialExpireTime = trialExpireTime;
                return this;
            }

            /**
             * TrialStartTime.
             */
            public Builder trialStartTime(Long trialStartTime) {
                this.trialStartTime = trialStartTime;
                return this;
            }

            /**
             * TrialVaultReleaseTime.
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
    public static class Vault extends TeaModel {
        @NameInMap("ArchiveBytesDone")
        private Long archiveBytesDone;

        @NameInMap("ArchiveStorageSize")
        private Long archiveStorageSize;

        @NameInMap("BackupPlanStatistics")
        private BackupPlanStatistics backupPlanStatistics;

        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("BytesDone")
        private Long bytesDone;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ChargedStorageSize")
        private Long chargedStorageSize;

        @NameInMap("CompressionAlgorithm")
        private String compressionAlgorithm;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("Dedup")
        private Boolean dedup;

        @NameInMap("Description")
        private String description;

        @NameInMap("EncryptType")
        private String encryptType;

        @NameInMap("IndexAvailable")
        private Boolean indexAvailable;

        @NameInMap("IndexLevel")
        private String indexLevel;

        @NameInMap("IndexUpdateTime")
        private Long indexUpdateTime;

        @NameInMap("KmsKeyId")
        private String kmsKeyId;

        @NameInMap("LatestReplicationTime")
        private Long latestReplicationTime;

        @NameInMap("RedundancyType")
        private String redundancyType;

        @NameInMap("Replication")
        private Boolean replication;

        @NameInMap("ReplicationProgress")
        private ReplicationProgress replicationProgress;

        @NameInMap("ReplicationSourceRegionId")
        private String replicationSourceRegionId;

        @NameInMap("ReplicationSourceVault")
        private Boolean replicationSourceVault;

        @NameInMap("ReplicationSourceVaultId")
        private String replicationSourceVaultId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Retention")
        private Long retention;

        @NameInMap("SearchEnabled")
        private Boolean searchEnabled;

        @NameInMap("SnapshotCount")
        private Long snapshotCount;

        @NameInMap("SourceTypes")
        private SourceTypes sourceTypes;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageSize")
        private Long storageSize;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("TrialInfo")
        private TrialInfo trialInfo;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("VaultId")
        private String vaultId;

        @NameInMap("VaultName")
        private String vaultName;

        @NameInMap("VaultRegionId")
        private String vaultRegionId;

        @NameInMap("VaultStatusMessage")
        private String vaultStatusMessage;

        @NameInMap("VaultStorageClass")
        private String vaultStorageClass;

        @NameInMap("VaultType")
        private String vaultType;

        @NameInMap("WormEnabled")
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
             * ArchiveStorageSize.
             */
            public Builder archiveStorageSize(Long archiveStorageSize) {
                this.archiveStorageSize = archiveStorageSize;
                return this;
            }

            /**
             * BackupPlanStatistics.
             */
            public Builder backupPlanStatistics(BackupPlanStatistics backupPlanStatistics) {
                this.backupPlanStatistics = backupPlanStatistics;
                return this;
            }

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
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
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ChargedStorageSize.
             */
            public Builder chargedStorageSize(Long chargedStorageSize) {
                this.chargedStorageSize = chargedStorageSize;
                return this;
            }

            /**
             * CompressionAlgorithm.
             */
            public Builder compressionAlgorithm(String compressionAlgorithm) {
                this.compressionAlgorithm = compressionAlgorithm;
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
             * Dedup.
             */
            public Builder dedup(Boolean dedup) {
                this.dedup = dedup;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EncryptType.
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * IndexAvailable.
             */
            public Builder indexAvailable(Boolean indexAvailable) {
                this.indexAvailable = indexAvailable;
                return this;
            }

            /**
             * IndexLevel.
             */
            public Builder indexLevel(String indexLevel) {
                this.indexLevel = indexLevel;
                return this;
            }

            /**
             * IndexUpdateTime.
             */
            public Builder indexUpdateTime(Long indexUpdateTime) {
                this.indexUpdateTime = indexUpdateTime;
                return this;
            }

            /**
             * KmsKeyId.
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * LatestReplicationTime.
             */
            public Builder latestReplicationTime(Long latestReplicationTime) {
                this.latestReplicationTime = latestReplicationTime;
                return this;
            }

            /**
             * RedundancyType.
             */
            public Builder redundancyType(String redundancyType) {
                this.redundancyType = redundancyType;
                return this;
            }

            /**
             * Replication.
             */
            public Builder replication(Boolean replication) {
                this.replication = replication;
                return this;
            }

            /**
             * ReplicationProgress.
             */
            public Builder replicationProgress(ReplicationProgress replicationProgress) {
                this.replicationProgress = replicationProgress;
                return this;
            }

            /**
             * ReplicationSourceRegionId.
             */
            public Builder replicationSourceRegionId(String replicationSourceRegionId) {
                this.replicationSourceRegionId = replicationSourceRegionId;
                return this;
            }

            /**
             * ReplicationSourceVault.
             */
            public Builder replicationSourceVault(Boolean replicationSourceVault) {
                this.replicationSourceVault = replicationSourceVault;
                return this;
            }

            /**
             * ReplicationSourceVaultId.
             */
            public Builder replicationSourceVaultId(String replicationSourceVaultId) {
                this.replicationSourceVaultId = replicationSourceVaultId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * SearchEnabled.
             */
            public Builder searchEnabled(Boolean searchEnabled) {
                this.searchEnabled = searchEnabled;
                return this;
            }

            /**
             * SnapshotCount.
             */
            public Builder snapshotCount(Long snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * SourceTypes.
             */
            public Builder sourceTypes(SourceTypes sourceTypes) {
                this.sourceTypes = sourceTypes;
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
             * StorageSize.
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TrialInfo.
             */
            public Builder trialInfo(TrialInfo trialInfo) {
                this.trialInfo = trialInfo;
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

            /**
             * VaultName.
             */
            public Builder vaultName(String vaultName) {
                this.vaultName = vaultName;
                return this;
            }

            /**
             * VaultRegionId.
             */
            public Builder vaultRegionId(String vaultRegionId) {
                this.vaultRegionId = vaultRegionId;
                return this;
            }

            /**
             * VaultStatusMessage.
             */
            public Builder vaultStatusMessage(String vaultStatusMessage) {
                this.vaultStatusMessage = vaultStatusMessage;
                return this;
            }

            /**
             * VaultStorageClass.
             */
            public Builder vaultStorageClass(String vaultStorageClass) {
                this.vaultStorageClass = vaultStorageClass;
                return this;
            }

            /**
             * VaultType.
             */
            public Builder vaultType(String vaultType) {
                this.vaultType = vaultType;
                return this;
            }

            /**
             * WormEnabled.
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
    public static class Vaults extends TeaModel {
        @NameInMap("Vault")
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
