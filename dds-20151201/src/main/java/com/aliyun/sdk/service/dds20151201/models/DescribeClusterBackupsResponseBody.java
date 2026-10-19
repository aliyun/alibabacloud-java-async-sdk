// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeClusterBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterBackupsResponseBody</p>
 */
public class DescribeClusterBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterBackups")
    private java.util.List<ClusterBackups> clusterBackups;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterBackupsResponseBody(Builder builder) {
        this.clusterBackups = builder.clusterBackups;
        this.maxResults = builder.maxResults;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterBackupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterBackups
     */
    public java.util.List<ClusterBackups> getClusterBackups() {
        return this.clusterBackups;
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
        private java.util.List<ClusterBackups> clusterBackups; 
        private Integer maxResults; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClusterBackupsResponseBody model) {
            this.clusterBackups = model.clusterBackups;
            this.maxResults = model.maxResults;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the cluster backup sets. A cluster backup contains the backup sets of all nodes.</p>
         */
        public Builder clusterBackups(java.util.List<ClusterBackups> clusterBackups) {
            this.clusterBackups = clusterBackups;
            return this;
        }

        /**
         * <p>The maximum number of entries returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F42BB4E-461F-5B55-A37C-53B1141C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterBackupsResponseBody build() {
            return new DescribeClusterBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterBackupsResponseBody</p>
     */
    public static class ExtraInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private String storageSize;

        private ExtraInfo(Builder builder) {
            this.instanceClass = builder.instanceClass;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return storageSize
         */
        public String getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private String instanceClass; 
            private String nodeId; 
            private String nodeType; 
            private String storageSize; 

            private Builder() {
            } 

            private Builder(ExtraInfo model) {
                this.instanceClass = model.instanceClass;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
                this.storageSize = model.storageSize;
            } 

            /**
             * <p>The specifications of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>mdb.shard.4x.large.d</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>d-2ze75ab1fa5d****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The storage space of the node, in MB.</p>
             * 
             * <strong>example:</strong>
             * <p>20480</p>
             */
            public Builder storageSize(String storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterBackupsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private ExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private String isAvail;

        private Backups(Builder builder) {
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupIntranetDownloadURL = builder.backupIntranetDownloadURL;
            this.backupName = builder.backupName;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.extraInfo = builder.extraInfo;
            this.instanceName = builder.instanceName;
            this.isAvail = builder.isAvail;
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

        public static final class Builder {
            private String backupDownloadURL; 
            private String backupEndTime; 
            private String backupId; 
            private String backupIntranetDownloadURL; 
            private String backupName; 
            private String backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private ExtraInfo extraInfo; 
            private String instanceName; 
            private String isAvail; 

            private Builder() {
            } 

            private Builder(Backups model) {
                this.backupDownloadURL = model.backupDownloadURL;
                this.backupEndTime = model.backupEndTime;
                this.backupId = model.backupId;
                this.backupIntranetDownloadURL = model.backupIntranetDownloadURL;
                this.backupName = model.backupName;
                this.backupSize = model.backupSize;
                this.backupStartTime = model.backupStartTime;
                this.backupStatus = model.backupStatus;
                this.extraInfo = model.extraInfo;
                this.instanceName = model.instanceName;
                this.isAvail = model.isAvail;
            } 

            /**
             * <p>The public URL from which you can download the backup file. If the backup file is unavailable for download, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://oss.com/xxx">http://oss.com/xxx</a></p>
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * <p>The time when the backup finished. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-16T19:33:20Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The ID of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>738025367</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The internal URL from which you can download the backup file. If the backup file is unavailable for download, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://oss.com/xxx">http://oss.com/xxx</a></p>
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * <p>The name of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678.tar.gz</p>
             */
            public Builder backupName(String backupName) {
                this.backupName = backupName;
                return this;
            }

            /**
             * <p>The size of the backup file, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>77544597650</p>
             */
            public Builder backupSize(String backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The time when the backup started. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-16T19:33:20Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The backup status. Valid values:</p>
             * <ul>
             * <li><p><strong>Success</strong>: The backup is successful.</p>
             * </li>
             * <li><p><strong>Failed</strong>: The backup failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The information about the instance node that is associated with the backup.</p>
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The name of the shard in the MongoDB cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp16cb162771****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Indicates whether the backup set is available. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: unavailable.</p>
             * </li>
             * <li><p><strong>1</strong>: available.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAvail(String isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            public Backups build() {
                return new Backups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterBackupsResponseBody</p>
     */
    public static class ClusterBackupsExtraInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegistryFromHistory")
        private String registryFromHistory;

        private ClusterBackupsExtraInfo(Builder builder) {
            this.registryFromHistory = builder.registryFromHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterBackupsExtraInfo create() {
            return builder().build();
        }

        /**
         * @return registryFromHistory
         */
        public String getRegistryFromHistory() {
            return this.registryFromHistory;
        }

        public static final class Builder {
            private String registryFromHistory; 

            private Builder() {
            } 

            private Builder(ClusterBackupsExtraInfo model) {
                this.registryFromHistory = model.registryFromHistory;
            } 

            /**
             * <p>Indicates whether the backup set was migrated from a historical backup. A value of <strong>1</strong> indicates that the backup was migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder registryFromHistory(String registryFromHistory) {
                this.registryFromHistory = registryFromHistory;
                return this;
            }

            public ClusterBackupsExtraInfo build() {
                return new ClusterBackupsExtraInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterBackupsResponseBody</p>
     */
    public static class ClusterBackups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachLogStatus")
        private String attachLogStatus;

        @com.aliyun.core.annotation.NameInMap("BackupExpireTime")
        private String backupExpireTime;

        @com.aliyun.core.annotation.NameInMap("Backups")
        private java.util.List<Backups> backups;

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

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private ClusterBackupsExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private Integer isAvail;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        private ClusterBackups(Builder builder) {
            this.attachLogStatus = builder.attachLogStatus;
            this.backupExpireTime = builder.backupExpireTime;
            this.backups = builder.backups;
            this.clusterBackupEndTime = builder.clusterBackupEndTime;
            this.clusterBackupId = builder.clusterBackupId;
            this.clusterBackupMode = builder.clusterBackupMode;
            this.clusterBackupSize = builder.clusterBackupSize;
            this.clusterBackupStartTime = builder.clusterBackupStartTime;
            this.clusterBackupStatus = builder.clusterBackupStatus;
            this.engineVersion = builder.engineVersion;
            this.extraInfo = builder.extraInfo;
            this.isAvail = builder.isAvail;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterBackups create() {
            return builder().build();
        }

        /**
         * @return attachLogStatus
         */
        public String getAttachLogStatus() {
            return this.attachLogStatus;
        }

        /**
         * @return backupExpireTime
         */
        public String getBackupExpireTime() {
            return this.backupExpireTime;
        }

        /**
         * @return backups
         */
        public java.util.List<Backups> getBackups() {
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
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return extraInfo
         */
        public ClusterBackupsExtraInfo getExtraInfo() {
            return this.extraInfo;
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

        public static final class Builder {
            private String attachLogStatus; 
            private String backupExpireTime; 
            private java.util.List<Backups> backups; 
            private String clusterBackupEndTime; 
            private String clusterBackupId; 
            private String clusterBackupMode; 
            private String clusterBackupSize; 
            private String clusterBackupStartTime; 
            private String clusterBackupStatus; 
            private String engineVersion; 
            private ClusterBackupsExtraInfo extraInfo; 
            private Integer isAvail; 
            private String progress; 

            private Builder() {
            } 

            private Builder(ClusterBackups model) {
                this.attachLogStatus = model.attachLogStatus;
                this.backupExpireTime = model.backupExpireTime;
                this.backups = model.backups;
                this.clusterBackupEndTime = model.clusterBackupEndTime;
                this.clusterBackupId = model.clusterBackupId;
                this.clusterBackupMode = model.clusterBackupMode;
                this.clusterBackupSize = model.clusterBackupSize;
                this.clusterBackupStartTime = model.clusterBackupStartTime;
                this.clusterBackupStatus = model.clusterBackupStatus;
                this.engineVersion = model.engineVersion;
                this.extraInfo = model.extraInfo;
                this.isAvail = model.isAvail;
                this.progress = model.progress;
            } 

            /**
             * <p>The status of the attached log backup. Valid values:</p>
             * <ul>
             * <li><p><strong>Init</strong>: initialization.</p>
             * </li>
             * <li><p><strong>No_Need</strong>: No attached log backup is available.</p>
             * </li>
             * <li><p><strong>Running</strong>: The attached log backup is in progress.</p>
             * </li>
             * <li><p><strong>Ready</strong>: The attached log backup is complete.</p>
             * </li>
             * <li><p><strong>Failed</strong>: The attached log backup failed.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If the value of the <strong>ClusterBackupStatus</strong> parameter is OK, it only indicates that the full backup was successful. For a cluster instance for which log backup is enabled, the attached log backup must be complete before you can perform a point-in-time restore or ensure data consistency.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder attachLogStatus(String attachLogStatus) {
                this.attachLogStatus = attachLogStatus;
                return this;
            }

            /**
             * <p>The time when the backup expires. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and is displayed in UTC.</p>
             * <blockquote>
             * <p>Notice: </p>
             * </blockquote>
             * <p>A value of &quot;9999-01-01T00:00:00Z&quot; indicates that the backup is permanently retained.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-29T03:47:12Z</p>
             */
            public Builder backupExpireTime(String backupExpireTime) {
                this.backupExpireTime = backupExpireTime;
                return this;
            }

            /**
             * <p>The backup sets of each child node in the cluster backup.</p>
             */
            public Builder backups(java.util.List<Backups> backups) {
                this.backups = backups;
                return this;
            }

            /**
             * <p>The time when the cluster backup finished.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-16T19:33:20Z</p>
             */
            public Builder clusterBackupEndTime(String clusterBackupEndTime) {
                this.clusterBackupEndTime = clusterBackupEndTime;
                return this;
            }

            /**
             * <p>The ID of the cluster backup.</p>
             * 
             * <strong>example:</strong>
             * <p>cb-o8c2ugnxo26kx***</p>
             */
            public Builder clusterBackupId(String clusterBackupId) {
                this.clusterBackupId = clusterBackupId;
                return this;
            }

            /**
             * <p>The mode of the cluster backup.</p>
             * 
             * <strong>example:</strong>
             * <p>Automated</p>
             */
            public Builder clusterBackupMode(String clusterBackupMode) {
                this.clusterBackupMode = clusterBackupMode;
                return this;
            }

            /**
             * <p>The size of the cluster backup set, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>107374182400</p>
             */
            public Builder clusterBackupSize(String clusterBackupSize) {
                this.clusterBackupSize = clusterBackupSize;
                return this;
            }

            /**
             * <p>The time when the cluster backup started.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-16T19:33:20Z</p>
             */
            public Builder clusterBackupStartTime(String clusterBackupStartTime) {
                this.clusterBackupStartTime = clusterBackupStartTime;
                return this;
            }

            /**
             * <p>The status of the cluster backup.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder clusterBackupStatus(String clusterBackupStatus) {
                this.clusterBackupStatus = clusterBackupStatus;
                return this;
            }

            /**
             * <p>The database engine version of the instance when the backup was created. Valid values:</p>
             * <ul>
             * <li><p><strong>7.0</strong></p>
             * </li>
             * <li><p><strong>6.0</strong></p>
             * </li>
             * <li><p><strong>5.0</strong></p>
             * </li>
             * <li><p><strong>4.4</strong></p>
             * </li>
             * <li><p><strong>4.2</strong></p>
             * </li>
             * <li><p><strong>4.0</strong></p>
             * </li>
             * <li><p><strong>3.4</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4.2</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The supplementary information. The value is a JSON-formatted string.</p>
             */
            public Builder extraInfo(ClusterBackupsExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>Indicates whether the cluster backup set is valid. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: The cluster backup set is valid.</p>
             * </li>
             * <li><p><strong>0</strong>: The backup sets of child nodes are not complete or have failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * <p>The backup progress in percentage.
             * This parameter is returned only for backups that are in progress.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public ClusterBackups build() {
                return new ClusterBackups(this);
            } 

        } 

    }
}
