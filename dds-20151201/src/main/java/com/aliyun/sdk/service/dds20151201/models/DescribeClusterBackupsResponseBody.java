// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterBackupsResponseBody</p>
 */
public class DescribeClusterBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterBackups")
    private java.util.List < ClusterBackups> clusterBackups;

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

    /**
     * @return clusterBackups
     */
    public java.util.List < ClusterBackups> getClusterBackups() {
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
        private java.util.List < ClusterBackups> clusterBackups; 
        private Integer maxResults; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        /**
         * The cluster backup sets. A cluster backup file contains the backup sets of each node.
         */
        public Builder clusterBackups(java.util.List < ClusterBackups> clusterBackups) {
            this.clusterBackups = clusterBackups;
            return this;
        }

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The page number of the page returned.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterBackupsResponseBody build() {
            return new DescribeClusterBackupsResponseBody(this);
        } 

    } 

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

            /**
             * The instance type of the node.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The node type.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The storage capacity of the node. Unit: MB.
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

            /**
             * The URL that is used to download the backup set over the Internet. If the backup set cannot be downloaded, an empty string is returned.
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * The end time of the backup. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * The ID of the backup set.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * The URL that is used to download the backup set over an internal network. If the backup set cannot be downloaded, null is returned.
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * The backup name.
             */
            public Builder backupName(String backupName) {
                this.backupName = backupName;
                return this;
            }

            /**
             * The size of the backup file. Unit: bytes.
             */
            public Builder backupSize(String backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * The start time of the backup. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * The status of the backup task. Valid values:
             * <p>
             * 
             * *   **Success**: The backup task is successful.
             * *   **Failed**: The backup task failed.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * The information of the node associated with the backup.
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * The shard name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Indicates whether the backup set is available. Valid values:
             * <p>
             * 
             * *   **0**: unavailable
             * *   **1**: available
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

            /**
             * Indicates whether the cluster backups are migrated from the historical backup sets. If the value of this parameter is **1**, the cluster backups are migrated from the historical backup sets.
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
    public static class ClusterBackups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachLogStatus")
        private String attachLogStatus;

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

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private ClusterBackupsExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private Integer isAvail;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        private ClusterBackups(Builder builder) {
            this.attachLogStatus = builder.attachLogStatus;
            this.backups = builder.backups;
            this.clusterBackupEndTime = builder.clusterBackupEndTime;
            this.clusterBackupId = builder.clusterBackupId;
            this.clusterBackupMode = builder.clusterBackupMode;
            this.clusterBackupSize = builder.clusterBackupSize;
            this.clusterBackupStartTime = builder.clusterBackupStartTime;
            this.clusterBackupStatus = builder.clusterBackupStatus;
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
            private java.util.List < Backups> backups; 
            private String clusterBackupEndTime; 
            private String clusterBackupId; 
            private String clusterBackupMode; 
            private String clusterBackupSize; 
            private String clusterBackupStartTime; 
            private String clusterBackupStatus; 
            private ClusterBackupsExtraInfo extraInfo; 
            private Integer isAvail; 
            private String progress; 

            /**
             * The backup status. Valid values:
             * <p>
             * 
             * *   **init**: The backup is being initialized.
             * *   **No_Need**: Log backup is not performed.
             * *   **Running**: Log backup is being performed.
             * *   **Ready**: Log backup is complete.
             * *   **Failed**: Log backup failed.
             * 
             * >  If the **ClusterBackupStatus** parameter is set to OK, full backup is successful. If you want to perform point-in-time-restoration on an instance for which log backup is enabled or to implement consistency restoration, make sure that log backup is complete.
             */
            public Builder attachLogStatus(String attachLogStatus) {
                this.attachLogStatus = attachLogStatus;
                return this;
            }

            /**
             * The collection of the backup sets of each child node in a cluster backup set.
             */
            public Builder backups(java.util.List < Backups> backups) {
                this.backups = backups;
                return this;
            }

            /**
             * The end of the time range within which the cluster backup is performed.
             */
            public Builder clusterBackupEndTime(String clusterBackupEndTime) {
                this.clusterBackupEndTime = clusterBackupEndTime;
                return this;
            }

            /**
             * The backup set ID.
             */
            public Builder clusterBackupId(String clusterBackupId) {
                this.clusterBackupId = clusterBackupId;
                return this;
            }

            /**
             * The cluster backup mode.
             */
            public Builder clusterBackupMode(String clusterBackupMode) {
                this.clusterBackupMode = clusterBackupMode;
                return this;
            }

            /**
             * The size of the cluster backup set. Unit: bytes.
             */
            public Builder clusterBackupSize(String clusterBackupSize) {
                this.clusterBackupSize = clusterBackupSize;
                return this;
            }

            /**
             * The beginning of the time range within which the cluster backup is performed.
             */
            public Builder clusterBackupStartTime(String clusterBackupStartTime) {
                this.clusterBackupStartTime = clusterBackupStartTime;
                return this;
            }

            /**
             * The status of the cluster backup set.
             */
            public Builder clusterBackupStatus(String clusterBackupStatus) {
                this.clusterBackupStatus = clusterBackupStatus;
                return this;
            }

            /**
             * The additional information in the JSON format.
             */
            public Builder extraInfo(ClusterBackupsExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * Indicates whether the cluster backup sets take effect. Valid values:
             * <p>
             * 
             * *   **1**: The cluster backup sets take effect.
             * *   **0**: The backup sets of child nodes are incomplete or fail.
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * The progress of the backup task. Unit: %. The progress is returned only for running backup tasks.
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
