// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBackupRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListBackupRecordResponseBody</p>
 */
public class ListBackupRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupRecordList")
    private java.util.List < BackupRecordList> backupRecordList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBackupRecordResponseBody(Builder builder) {
        this.backupRecordList = builder.backupRecordList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBackupRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupRecordList
     */
    public java.util.List < BackupRecordList> getBackupRecordList() {
        return this.backupRecordList;
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

    public static final class Builder {
        private java.util.List < BackupRecordList> backupRecordList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The details of the backup record.
         */
        public Builder backupRecordList(java.util.List < BackupRecordList> backupRecordList) {
            this.backupRecordList = backupRecordList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBackupRecordResponseBody build() {
            return new ListBackupRecordResponseBody(this);
        } 

    } 

    public static class BackupRecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private Long backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupJobId")
        private String backupJobId;

        @com.aliyun.core.annotation.NameInMap("BackupPlanId")
        private String backupPlanId;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private Long backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private BackupRecordList(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupJobId = builder.backupJobId;
            this.backupPlanId = builder.backupPlanId;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.clientId = builder.clientId;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.regionId = builder.regionId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupRecordList create() {
            return builder().build();
        }

        /**
         * @return backupEndTime
         */
        public Long getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupJobId
         */
        public String getBackupJobId() {
            return this.backupJobId;
        }

        /**
         * @return backupPlanId
         */
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        /**
         * @return backupStartTime
         */
        public Long getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
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
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long backupEndTime; 
            private String backupJobId; 
            private String backupPlanId; 
            private Long backupStartTime; 
            private String backupStatus; 
            private String clientId; 
            private String errorCode; 
            private String errorMessage; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String regionId; 
            private String uuid; 

            /**
             * The timestamp when the backup task ended. Unit: milliseconds.
             */
            public Builder backupEndTime(Long backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * The backup task ID.
             */
            public Builder backupJobId(String backupJobId) {
                this.backupJobId = backupJobId;
                return this;
            }

            /**
             * The backup plan ID.
             */
            public Builder backupPlanId(String backupPlanId) {
                this.backupPlanId = backupPlanId;
                return this;
            }

            /**
             * The timestamp when the backup task started. Unit: milliseconds.
             */
            public Builder backupStartTime(Long backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * The backup task status. Valid value:
             * <p>
             * 
             * *   **BACKUP_COMPLETE**: The backup task is successful.
             * *   **BACKUP_FAILED**: The backup task failed.
             * *   **PARTIAL_COMPLETE**: The backup task is partially successful.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * The ID of the anti-ransomware agent.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The error code of the backup task.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message of the backup task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The instance ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The IP address of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the region in which the backup is stored.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The UUID of the server whose data is backed up based on the anti-ransomware policy.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public BackupRecordList build() {
                return new BackupRecordList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
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
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
}
