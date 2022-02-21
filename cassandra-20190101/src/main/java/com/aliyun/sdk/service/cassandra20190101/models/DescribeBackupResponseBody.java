// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupResponseBody</p>
 */
public class DescribeBackupResponseBody extends TeaModel {
    @NameInMap("Backup")
    private Backup backup;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupResponseBody(Builder builder) {
        this.backup = builder.backup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupResponseBody create() {
        return builder().build();
    }

    /**
     * @return backup
     */
    public Backup getBackup() {
        return this.backup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Backup backup; 
        private String requestId; 

        /**
         * Backup.
         */
        public Builder backup(Backup backup) {
            this.backup = backup;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupResponseBody build() {
            return new DescribeBackupResponseBody(this);
        } 

    } 

    public static class Backup extends TeaModel {
        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("DataCenterId")
        private String dataCenterId;

        @NameInMap("Details")
        private String details;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Size")
        private Long size;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private Backup(Builder builder) {
            this.backupId = builder.backupId;
            this.backupType = builder.backupType;
            this.clusterId = builder.clusterId;
            this.dataCenterId = builder.dataCenterId;
            this.details = builder.details;
            this.endTime = builder.endTime;
            this.size = builder.size;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backup create() {
            return builder().build();
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return dataCenterId
         */
        public String getDataCenterId() {
            return this.dataCenterId;
        }

        /**
         * @return details
         */
        public String getDetails() {
            return this.details;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
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

        public static final class Builder {
            private String backupId; 
            private String backupType; 
            private String clusterId; 
            private String dataCenterId; 
            private String details; 
            private String endTime; 
            private Long size; 
            private String startTime; 
            private String status; 

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
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
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * DataCenterId.
             */
            public Builder dataCenterId(String dataCenterId) {
                this.dataCenterId = dataCenterId;
                return this;
            }

            /**
             * Details.
             */
            public Builder details(String details) {
                this.details = details;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
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

            public Backup build() {
                return new Backup(this);
            } 

        } 

    }
}
