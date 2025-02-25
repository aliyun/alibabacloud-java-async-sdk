// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterBackupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterBackupListResponseBody</p>
 */
public class DescribeClusterBackupListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterBackups")
    private java.util.List < ClusterBackups> clusterBackups;

    @com.aliyun.core.annotation.NameInMap("FreeSize")
    private Long freeSize;

    @com.aliyun.core.annotation.NameInMap("FullStorageSize")
    private Long fullStorageSize;

    @com.aliyun.core.annotation.NameInMap("LogStorageSize")
    private Long logStorageSize;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterBackupListResponseBody(Builder builder) {
        this.clusterBackups = builder.clusterBackups;
        this.freeSize = builder.freeSize;
        this.fullStorageSize = builder.fullStorageSize;
        this.logStorageSize = builder.logStorageSize;
        this.maxResults = builder.maxResults;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterBackupListResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterBackups
     */
    public java.util.List < ClusterBackups> getClusterBackups() {
        return this.clusterBackups;
    }

    /**
     * @return freeSize
     */
    public Long getFreeSize() {
        return this.freeSize;
    }

    /**
     * @return fullStorageSize
     */
    public Long getFullStorageSize() {
        return this.fullStorageSize;
    }

    /**
     * @return logStorageSize
     */
    public Long getLogStorageSize() {
        return this.logStorageSize;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    public static final class Builder {
        private java.util.List < ClusterBackups> clusterBackups; 
        private Long freeSize; 
        private Long fullStorageSize; 
        private Long logStorageSize; 
        private Integer maxResults; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        /**
         * <p>The backup sets of the instance. An instance backup contains the backup sets of all nodes in the instance.</p>
         */
        public Builder clusterBackups(java.util.List < ClusterBackups> clusterBackups) {
            this.clusterBackups = clusterBackups;
            return this;
        }

        /**
         * <p>This parameter does not take effect. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder freeSize(Long freeSize) {
            this.freeSize = freeSize;
            return this;
        }

        /**
         * <p>The size of the full backup file of the instance. Unit: bytes. Full backups originate from scheduled backups, manual backups, and backups generated during cache analysis.</p>
         * <blockquote>
         * <p> The value of this parameter is independent of the number and size of returned backup sets. Instead, it represents the size of all valid full backups of the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder fullStorageSize(Long fullStorageSize) {
            this.fullStorageSize = fullStorageSize;
            return this;
        }

        /**
         * <p>The size of the log backup file of the instance. Unit: bytes. This parameter is valid only when flashback is enabled.</p>
         * <blockquote>
         * <p> The value of this parameter is independent of the number and size of returned backup sets. Instead, it represents the size of all valid log backups of the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder logStorageSize(Long logStorageSize) {
            this.logStorageSize = logStorageSize;
            return this;
        }

        /**
         * <p>The number of entries to return per page. Valid values: 1 to 100.
         * Default value: 30.</p>
         * <blockquote>
         * <p>If you specify this parameter, PageSize and PageNumber are unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C009DA42-3B19-5B81-963D-1509DE2408DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterBackupListResponseBody build() {
            return new DescribeClusterBackupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterBackupListResponseBody</p>
     */
    public static class ExtraInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustinsDbVersion")
        private String custinsDbVersion;

        private ExtraInfo(Builder builder) {
            this.custinsDbVersion = builder.custinsDbVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return custinsDbVersion
         */
        public String getCustinsDbVersion() {
            return this.custinsDbVersion;
        }

        public static final class Builder {
            private String custinsDbVersion; 

            /**
             * <p>The engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0</p>
             */
            public Builder custinsDbVersion(String custinsDbVersion) {
                this.custinsDbVersion = custinsDbVersion;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterBackupListResponseBody</p>
     */
    public static class Backups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupDownloadURL")
        private String backupDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupIntranetDownloadURL")
        private String backupIntranetDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupName")
        private String backupName;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private String backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private ExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private String isAvail;

        @com.aliyun.core.annotation.NameInMap("RecoverConfigMode")
        private String recoverConfigMode;

        private Backups(Builder builder) {
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupIntranetDownloadURL = builder.backupIntranetDownloadURL;
            this.backupName = builder.backupName;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.engine = builder.engine;
            this.extraInfo = builder.extraInfo;
            this.instanceName = builder.instanceName;
            this.isAvail = builder.isAvail;
            this.recoverConfigMode = builder.recoverConfigMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backups create() {
            return builder().build();
        }

        /**
         * @return backupDownloadURL
         */
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupIntranetDownloadURL
         */
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        /**
         * @return backupName
         */
        public String getBackupName() {
            return this.backupName;
        }

        /**
         * @return backupSize
         */
        public String getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return extraInfo
         */
        public ExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return isAvail
         */
        public String getIsAvail() {
            return this.isAvail;
        }

        /**
         * @return recoverConfigMode
         */
        public String getRecoverConfigMode() {
            return this.recoverConfigMode;
        }

        public static final class Builder {
            private String backupDownloadURL; 
            private String backupEndTime; 
            private String backupId; 
            private String backupIntranetDownloadURL; 
            private String backupName; 
            private String backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String engine; 
            private ExtraInfo extraInfo; 
            private String instanceName; 
            private String isAvail; 
            private String recoverConfigMode; 

            /**
             * <p>The public download URL of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsbakbucket-huhehaote-v2.oss-cn-huhehaote.aliyuncs.com/custins424747958/hins100322105_data_20240110012135.rdb">http://rdsbakbucket-huhehaote-v2.oss-cn-huhehaote.aliyuncs.com/custins424747958/hins100322105_data_20240110012135.rdb</a></p>
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * <p>The end time of the backup. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-09T17:21:57</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The ID of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>514645788</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The internal download URL of the backup file.</p>
             * <blockquote>
             * <p> You can use this URL to download the backup file from an Elastic Compute Service (ECS) instance that is connected to the ApsaraDB for Redis instance. The ECS instance must belong to the same classic network or reside in the same virtual private cloud (VPC) as the ApsaraDB for Redis instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsbakbucket-huhehaote-v2.oss-cn-huhehaote-internal.aliyuncs.com/custins424747958/hins100322105_data_20240110012135.rdb">http://rdsbakbucket-huhehaote-v2.oss-cn-huhehaote-internal.aliyuncs.com/custins424747958/hins100322105_data_20240110012135.rdb</a></p>
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * <p>The backup name.</p>
             * 
             * <strong>example:</strong>
             * <p>hins100322105_data_20240110012135.rdb</p>
             */
            public Builder backupName(String backupName) {
                this.backupName = backupName;
                return this;
            }

            /**
             * <p>The size of the backup file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder backupSize(String backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The start time of the backup. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-09T17:21:30Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The status of the backup. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong></li>
             * <li><strong>ERROR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The database engine. The return value is <strong>redis</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>redis</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The additional information.</p>
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hins100322105_data_20240108012127.rdb</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Indicates whether the backup set is available. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unavailable</li>
             * <li><strong>1</strong>: available</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAvail(String isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * RecoverConfigMode.
             */
            public Builder recoverConfigMode(String recoverConfigMode) {
                this.recoverConfigMode = recoverConfigMode;
                return this;
            }

            public Backups build() {
                return new Backups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterBackupListResponseBody</p>
     */
    public static class ClusterBackups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backups")
        private java.util.List < Backups> backups;

        @com.aliyun.core.annotation.NameInMap("ClusterBackupEndTime")
        private String clusterBackupEndTime;

        @com.aliyun.core.annotation.NameInMap("ClusterBackupId")
        private String clusterBackupId;

        @com.aliyun.core.annotation.NameInMap("ClusterBackupMode")
        private String clusterBackupMode;

        @com.aliyun.core.annotation.NameInMap("ClusterBackupSize")
        private String clusterBackupSize;

        @com.aliyun.core.annotation.NameInMap("ClusterBackupStartTime")
        private String clusterBackupStartTime;

        @com.aliyun.core.annotation.NameInMap("ClusterBackupStatus")
        private String clusterBackupStatus;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private Integer isAvail;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ShardClassMemory")
        private Integer shardClassMemory;

        private ClusterBackups(Builder builder) {
            this.backups = builder.backups;
            this.clusterBackupEndTime = builder.clusterBackupEndTime;
            this.clusterBackupId = builder.clusterBackupId;
            this.clusterBackupMode = builder.clusterBackupMode;
            this.clusterBackupSize = builder.clusterBackupSize;
            this.clusterBackupStartTime = builder.clusterBackupStartTime;
            this.clusterBackupStatus = builder.clusterBackupStatus;
            this.isAvail = builder.isAvail;
            this.progress = builder.progress;
            this.shardClassMemory = builder.shardClassMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterBackups create() {
            return builder().build();
        }

        /**
         * @return backups
         */
        public java.util.List < Backups> getBackups() {
            return this.backups;
        }

        /**
         * @return clusterBackupEndTime
         */
        public String getClusterBackupEndTime() {
            return this.clusterBackupEndTime;
        }

        /**
         * @return clusterBackupId
         */
        public String getClusterBackupId() {
            return this.clusterBackupId;
        }

        /**
         * @return clusterBackupMode
         */
        public String getClusterBackupMode() {
            return this.clusterBackupMode;
        }

        /**
         * @return clusterBackupSize
         */
        public String getClusterBackupSize() {
            return this.clusterBackupSize;
        }

        /**
         * @return clusterBackupStartTime
         */
        public String getClusterBackupStartTime() {
            return this.clusterBackupStartTime;
        }

        /**
         * @return clusterBackupStatus
         */
        public String getClusterBackupStatus() {
            return this.clusterBackupStatus;
        }

        /**
         * @return isAvail
         */
        public Integer getIsAvail() {
            return this.isAvail;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return shardClassMemory
         */
        public Integer getShardClassMemory() {
            return this.shardClassMemory;
        }

        public static final class Builder {
            private java.util.List < Backups> backups; 
            private String clusterBackupEndTime; 
            private String clusterBackupId; 
            private String clusterBackupMode; 
            private String clusterBackupSize; 
            private String clusterBackupStartTime; 
            private String clusterBackupStatus; 
            private Integer isAvail; 
            private String progress; 
            private Integer shardClassMemory; 

            /**
             * <p>The backup sets of all nodes in the instance.</p>
             */
            public Builder backups(java.util.List < Backups> backups) {
                this.backups = backups;
                return this;
            }

            /**
             * <p>The end time of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-10T17:21:55Z</p>
             */
            public Builder clusterBackupEndTime(String clusterBackupEndTime) {
                this.clusterBackupEndTime = clusterBackupEndTime;
                return this;
            }

            /**
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>cb-zmdqj2m3xyxjtdt0</p>
             */
            public Builder clusterBackupId(String clusterBackupId) {
                this.clusterBackupId = clusterBackupId;
                return this;
            }

            /**
             * <p>The backup mode.</p>
             * 
             * <strong>example:</strong>
             * <p>Automated</p>
             */
            public Builder clusterBackupMode(String clusterBackupMode) {
                this.clusterBackupMode = clusterBackupMode;
                return this;
            }

            /**
             * <p>The size of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder clusterBackupSize(String clusterBackupSize) {
                this.clusterBackupSize = clusterBackupSize;
                return this;
            }

            /**
             * <p>The start time of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-10T17:21:25Z</p>
             */
            public Builder clusterBackupStartTime(String clusterBackupStartTime) {
                this.clusterBackupStartTime = clusterBackupStartTime;
                return this;
            }

            /**
             * <p>The status of the backup set.</p>
             * <ul>
             * <li>OK</li>
             * <li>RUNNING</li>
             * <li>Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder clusterBackupStatus(String clusterBackupStatus) {
                this.clusterBackupStatus = clusterBackupStatus;
                return this;
            }

            /**
             * <p>Indicates whether the backup set is valid. A value of 0 indicates that node-level backups failed or have not been completed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * <p>The backup progress. The system displays only the progress of running backup tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The memory size of a single node during a full backup. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder shardClassMemory(Integer shardClassMemory) {
                this.shardClassMemory = shardClassMemory;
                return this;
            }

            public ClusterBackups build() {
                return new ClusterBackups(this);
            } 

        } 

    }
}
