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

        private Builder() {
        } 

        private Builder(DescribeVaultsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.vaults = model.vaults;
        } 

        /**
         * <p>The return code. 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message. &quot;successful&quot; is returned for a successful request, and the corresponding error message is returned if an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Minimum value: 1. Maximum value: 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
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
         * <p>The total number of backup vaults returned.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
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

    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class BackupPlanStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Archive")
        private Integer archive;

        @com.aliyun.core.annotation.NameInMap("CommonFileSystem")
        private Integer commonFileSystem;

        @com.aliyun.core.annotation.NameInMap("CommonNas")
        private Integer commonNas;

        @com.aliyun.core.annotation.NameInMap("Cpfs")
        private Integer cpfs;

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
            this.commonFileSystem = builder.commonFileSystem;
            this.commonNas = builder.commonNas;
            this.cpfs = builder.cpfs;
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
         * @return commonFileSystem
         */
        public Integer getCommonFileSystem() {
            return this.commonFileSystem;
        }

        /**
         * @return commonNas
         */
        public Integer getCommonNas() {
            return this.commonNas;
        }

        /**
         * @return cpfs
         */
        public Integer getCpfs() {
            return this.cpfs;
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
            private Integer commonFileSystem; 
            private Integer commonNas; 
            private Integer cpfs; 
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

            private Builder() {
            } 

            private Builder(BackupPlanStatistics model) {
                this.archive = model.archive;
                this.commonFileSystem = model.commonFileSystem;
                this.commonNas = model.commonNas;
                this.cpfs = model.cpfs;
                this.csg = model.csg;
                this.ecsFile = model.ecsFile;
                this.ecsHana = model.ecsHana;
                this.isilon = model.isilon;
                this.localFile = model.localFile;
                this.localVm = model.localVm;
                this.mySql = model.mySql;
                this.nas = model.nas;
                this.oracle = model.oracle;
                this.oss = model.oss;
                this.ots = model.ots;
                this.sqlServer = model.sqlServer;
            } 

            /**
             * Archive.
             */
            public Builder archive(Integer archive) {
                this.archive = archive;
                return this;
            }

            /**
             * CommonFileSystem.
             */
            public Builder commonFileSystem(Integer commonFileSystem) {
                this.commonFileSystem = commonFileSystem;
                return this;
            }

            /**
             * CommonNas.
             */
            public Builder commonNas(Integer commonNas) {
                this.commonNas = commonNas;
                return this;
            }

            /**
             * Cpfs.
             */
            public Builder cpfs(Integer cpfs) {
                this.cpfs = cpfs;
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

            private Builder() {
            } 

            private Builder(ReplicationProgress model) {
                this.historicalReplicationProgress = model.historicalReplicationProgress;
                this.newReplicationProgress = model.newReplicationProgress;
            } 

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
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class RsTargetAccountIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RsTargetAccountId")
        private java.util.List<Long> rsTargetAccountId;

        private RsTargetAccountIds(Builder builder) {
            this.rsTargetAccountId = builder.rsTargetAccountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RsTargetAccountIds create() {
            return builder().build();
        }

        /**
         * @return rsTargetAccountId
         */
        public java.util.List<Long> getRsTargetAccountId() {
            return this.rsTargetAccountId;
        }

        public static final class Builder {
            private java.util.List<Long> rsTargetAccountId; 

            private Builder() {
            } 

            private Builder(RsTargetAccountIds model) {
                this.rsTargetAccountId = model.rsTargetAccountId;
            } 

            /**
             * RsTargetAccountId.
             */
            public Builder rsTargetAccountId(java.util.List<Long> rsTargetAccountId) {
                this.rsTargetAccountId = rsTargetAccountId;
                return this;
            }

            public RsTargetAccountIds build() {
                return new RsTargetAccountIds(this);
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
        private java.util.List<String> sourceType;

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
        public java.util.List<String> getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private java.util.List<String> sourceType; 

            private Builder() {
            } 

            private Builder(SourceTypes model) {
                this.sourceType = model.sourceType;
            } 

            /**
             * SourceType.
             */
            public Builder sourceType(java.util.List<String> sourceType) {
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

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
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
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

            private Builder() {
            } 

            private Builder(TrialInfo model) {
                this.keepAfterTrialExpiration = model.keepAfterTrialExpiration;
                this.trialExpireTime = model.trialExpireTime;
                this.trialStartTime = model.trialStartTime;
                this.trialVaultReleaseTime = model.trialVaultReleaseTime;
            } 

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

        @com.aliyun.core.annotation.NameInMap("ReplicationSourceOwnerId")
        private Long replicationSourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ReplicationSourceRegionId")
        private String replicationSourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ReplicationSourceVault")
        private Boolean replicationSourceVault;

        @com.aliyun.core.annotation.NameInMap("ReplicationSourceVaultId")
        private String replicationSourceVaultId;

        @com.aliyun.core.annotation.NameInMap("ReplicationStatus")
        private String replicationStatus;

        @com.aliyun.core.annotation.NameInMap("ReplicationTargetOwnerId")
        private Long replicationTargetOwnerId;

        @com.aliyun.core.annotation.NameInMap("ReplicationTargetRegionId")
        private String replicationTargetRegionId;

        @com.aliyun.core.annotation.NameInMap("ReplicationTargetVaultId")
        private String replicationTargetVaultId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("RsTargetAccountIds")
        private RsTargetAccountIds rsTargetAccountIds;

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

        @com.aliyun.core.annotation.NameInMap("VaultOwnerId")
        private Long vaultOwnerId;

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
            this.replicationSourceOwnerId = builder.replicationSourceOwnerId;
            this.replicationSourceRegionId = builder.replicationSourceRegionId;
            this.replicationSourceVault = builder.replicationSourceVault;
            this.replicationSourceVaultId = builder.replicationSourceVaultId;
            this.replicationStatus = builder.replicationStatus;
            this.replicationTargetOwnerId = builder.replicationTargetOwnerId;
            this.replicationTargetRegionId = builder.replicationTargetRegionId;
            this.replicationTargetVaultId = builder.replicationTargetVaultId;
            this.resourceGroupId = builder.resourceGroupId;
            this.retention = builder.retention;
            this.rsTargetAccountIds = builder.rsTargetAccountIds;
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
            this.vaultOwnerId = builder.vaultOwnerId;
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
         * @return replicationSourceOwnerId
         */
        public Long getReplicationSourceOwnerId() {
            return this.replicationSourceOwnerId;
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
         * @return replicationStatus
         */
        public String getReplicationStatus() {
            return this.replicationStatus;
        }

        /**
         * @return replicationTargetOwnerId
         */
        public Long getReplicationTargetOwnerId() {
            return this.replicationTargetOwnerId;
        }

        /**
         * @return replicationTargetRegionId
         */
        public String getReplicationTargetRegionId() {
            return this.replicationTargetRegionId;
        }

        /**
         * @return replicationTargetVaultId
         */
        public String getReplicationTargetVaultId() {
            return this.replicationTargetVaultId;
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
         * @return rsTargetAccountIds
         */
        public RsTargetAccountIds getRsTargetAccountIds() {
            return this.rsTargetAccountIds;
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
         * @return vaultOwnerId
         */
        public Long getVaultOwnerId() {
            return this.vaultOwnerId;
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
            private Long replicationSourceOwnerId; 
            private String replicationSourceRegionId; 
            private Boolean replicationSourceVault; 
            private String replicationSourceVaultId; 
            private String replicationStatus; 
            private Long replicationTargetOwnerId; 
            private String replicationTargetRegionId; 
            private String replicationTargetVaultId; 
            private String resourceGroupId; 
            private Long retention; 
            private RsTargetAccountIds rsTargetAccountIds; 
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
            private Long vaultOwnerId; 
            private String vaultRegionId; 
            private String vaultStatusMessage; 
            private String vaultStorageClass; 
            private String vaultType; 
            private Boolean wormEnabled; 

            private Builder() {
            } 

            private Builder(Vault model) {
                this.archiveBytesDone = model.archiveBytesDone;
                this.archiveStorageSize = model.archiveStorageSize;
                this.backupPlanStatistics = model.backupPlanStatistics;
                this.bucketName = model.bucketName;
                this.bytesDone = model.bytesDone;
                this.chargeType = model.chargeType;
                this.chargedStorageSize = model.chargedStorageSize;
                this.compressionAlgorithm = model.compressionAlgorithm;
                this.createdTime = model.createdTime;
                this.dedup = model.dedup;
                this.description = model.description;
                this.encryptType = model.encryptType;
                this.indexAvailable = model.indexAvailable;
                this.indexLevel = model.indexLevel;
                this.indexUpdateTime = model.indexUpdateTime;
                this.kmsKeyId = model.kmsKeyId;
                this.latestReplicationTime = model.latestReplicationTime;
                this.redundancyType = model.redundancyType;
                this.replication = model.replication;
                this.replicationProgress = model.replicationProgress;
                this.replicationSourceOwnerId = model.replicationSourceOwnerId;
                this.replicationSourceRegionId = model.replicationSourceRegionId;
                this.replicationSourceVault = model.replicationSourceVault;
                this.replicationSourceVaultId = model.replicationSourceVaultId;
                this.replicationStatus = model.replicationStatus;
                this.replicationTargetOwnerId = model.replicationTargetOwnerId;
                this.replicationTargetRegionId = model.replicationTargetRegionId;
                this.replicationTargetVaultId = model.replicationTargetVaultId;
                this.resourceGroupId = model.resourceGroupId;
                this.retention = model.retention;
                this.rsTargetAccountIds = model.rsTargetAccountIds;
                this.searchEnabled = model.searchEnabled;
                this.snapshotCount = model.snapshotCount;
                this.sourceTypes = model.sourceTypes;
                this.status = model.status;
                this.storageSize = model.storageSize;
                this.tags = model.tags;
                this.trialInfo = model.trialInfo;
                this.updatedTime = model.updatedTime;
                this.vaultId = model.vaultId;
                this.vaultName = model.vaultName;
                this.vaultOwnerId = model.vaultOwnerId;
                this.vaultRegionId = model.vaultRegionId;
                this.vaultStatusMessage = model.vaultStatusMessage;
                this.vaultStorageClass = model.vaultStorageClass;
                this.vaultType = model.vaultType;
                this.wormEnabled = model.wormEnabled;
            } 

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
             * ReplicationSourceOwnerId.
             */
            public Builder replicationSourceOwnerId(Long replicationSourceOwnerId) {
                this.replicationSourceOwnerId = replicationSourceOwnerId;
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
             * ReplicationStatus.
             */
            public Builder replicationStatus(String replicationStatus) {
                this.replicationStatus = replicationStatus;
                return this;
            }

            /**
             * ReplicationTargetOwnerId.
             */
            public Builder replicationTargetOwnerId(Long replicationTargetOwnerId) {
                this.replicationTargetOwnerId = replicationTargetOwnerId;
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
             * ReplicationTargetVaultId.
             */
            public Builder replicationTargetVaultId(String replicationTargetVaultId) {
                this.replicationTargetVaultId = replicationTargetVaultId;
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
             * RsTargetAccountIds.
             */
            public Builder rsTargetAccountIds(RsTargetAccountIds rsTargetAccountIds) {
                this.rsTargetAccountIds = rsTargetAccountIds;
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
             * VaultOwnerId.
             */
            public Builder vaultOwnerId(Long vaultOwnerId) {
                this.vaultOwnerId = vaultOwnerId;
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
    /**
     * 
     * {@link DescribeVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVaultsResponseBody</p>
     */
    public static class Vaults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vault")
        private java.util.List<Vault> vault;

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
        public java.util.List<Vault> getVault() {
            return this.vault;
        }

        public static final class Builder {
            private java.util.List<Vault> vault; 

            private Builder() {
            } 

            private Builder(Vaults model) {
                this.vault = model.vault;
            } 

            /**
             * Vault.
             */
            public Builder vault(java.util.List<Vault> vault) {
                this.vault = vault;
                return this;
            }

            public Vaults build() {
                return new Vaults(this);
            } 

        } 

    }
}
