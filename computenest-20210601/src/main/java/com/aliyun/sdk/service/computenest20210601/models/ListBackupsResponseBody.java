// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link ListBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBackupsResponseBody</p>
 */
public class ListBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Backups")
    private java.util.List<Backups> backups;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListBackupsResponseBody(Builder builder) {
        this.backups = builder.backups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBackupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backups
     */
    public java.util.List<Backups> getBackups() {
        return this.backups;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Backups> backups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListBackupsResponseBody model) {
            this.backups = model.backups;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the backup.</p>
         */
        public Builder backups(java.util.List<Backups> backups) {
            this.backups = backups;
            return this;
        }

        /**
         * <p>The maximum number of records returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Indicates the read position returned by the current call. An empty value means all data has been read.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLYoaeZA6xVdkCrmG9EmGshtmECUGpq9Qm7x5vQkpz9NXH0XzUc9t4Kxaf3UtuPY4a0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BB58FE53-ED8F-5D12-9746-CD3A5F463D95</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total data count under the current request conditions (optional; not returned by default).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBackupsResponseBody build() {
            return new ListBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBackupsResponseBody</p>
     */
    public static class Backups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RetentionDays")
        private Integer retentionDays;

        @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
        private String serviceInstanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDetail")
        private String statusDetail;

        private Backups(Builder builder) {
            this.backupId = builder.backupId;
            this.backupMode = builder.backupMode;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.modifiedTime = builder.modifiedTime;
            this.retentionDays = builder.retentionDays;
            this.serviceInstanceId = builder.serviceInstanceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusDetail = builder.statusDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backups create() {
            return builder().build();
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return retentionDays
         */
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        /**
         * @return serviceInstanceId
         */
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDetail
         */
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public static final class Builder {
            private String backupId; 
            private String backupMode; 
            private String createTime; 
            private String description; 
            private String endTime; 
            private String modifiedTime; 
            private Integer retentionDays; 
            private String serviceInstanceId; 
            private String startTime; 
            private String status; 
            private String statusDetail; 

            private Builder() {
            } 

            private Builder(Backups model) {
                this.backupId = model.backupId;
                this.backupMode = model.backupMode;
                this.createTime = model.createTime;
                this.description = model.description;
                this.endTime = model.endTime;
                this.modifiedTime = model.modifiedTime;
                this.retentionDays = model.retentionDays;
                this.serviceInstanceId = model.serviceInstanceId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusDetail = model.statusDetail;
            } 

            /**
             * <p>The backup ID.</p>
             * 
             * <strong>example:</strong>
             * <p>backup-4e13aa8ca6a34150addd</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The backup mode. Valid values:</p>
             * <ul>
             * <li><strong>Manual</strong>: manual backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-03T19:54:38+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>No description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end time of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-15T02:24:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-03T19:54:38+08:00</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>Retention Days. Resources will be cleared upon expiration. Defaults to no expiration if left blank.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * <p>The ID of the service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>si-7b6138dfce1e4c41ab71</p>
             */
            public Builder serviceInstanceId(String serviceInstanceId) {
                this.serviceInstanceId = serviceInstanceId;
                return this;
            }

            /**
             * <p>The start time of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the backup task. Valid values:</p>
             * <ul>
             * <li>Creating</li>
             * <li>Created</li>
             * <li>CreateFailed</li>
             * <li>Deleting</li>
             * <li>Deleted</li>
             * <li>DeleteFailed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The description of the service instance deployment information.</p>
             * 
             * <strong>example:</strong>
             * <p>Disk i-xxxx backup failed, error message: error</p>
             */
            public Builder statusDetail(String statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            public Backups build() {
                return new Backups(this);
            } 

        } 

    }
}
