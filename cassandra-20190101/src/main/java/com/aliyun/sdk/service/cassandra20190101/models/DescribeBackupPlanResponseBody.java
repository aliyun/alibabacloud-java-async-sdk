// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlanResponseBody</p>
 */
public class DescribeBackupPlanResponseBody extends TeaModel {
    @NameInMap("BackupPlan")
    private BackupPlan backupPlan;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupPlanResponseBody(Builder builder) {
        this.backupPlan = builder.backupPlan;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupPlan
     */
    public BackupPlan getBackupPlan() {
        return this.backupPlan;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackupPlan backupPlan; 
        private String requestId; 

        /**
         * BackupPlan.
         */
        public Builder backupPlan(BackupPlan backupPlan) {
            this.backupPlan = backupPlan;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPlanResponseBody build() {
            return new DescribeBackupPlanResponseBody(this);
        } 

    } 

    public static class BackupPlan extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("BackupPeriod")
        private String backupPeriod;

        @NameInMap("BackupTime")
        private String backupTime;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DataCenterId")
        private String dataCenterId;

        @NameInMap("RetentionPeriod")
        private Integer retentionPeriod;

        private BackupPlan(Builder builder) {
            this.active = builder.active;
            this.backupPeriod = builder.backupPeriod;
            this.backupTime = builder.backupTime;
            this.clusterId = builder.clusterId;
            this.createdTime = builder.createdTime;
            this.dataCenterId = builder.dataCenterId;
            this.retentionPeriod = builder.retentionPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupPlan create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return backupPeriod
         */
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        /**
         * @return backupTime
         */
        public String getBackupTime() {
            return this.backupTime;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dataCenterId
         */
        public String getDataCenterId() {
            return this.dataCenterId;
        }

        /**
         * @return retentionPeriod
         */
        public Integer getRetentionPeriod() {
            return this.retentionPeriod;
        }

        public static final class Builder {
            private Boolean active; 
            private String backupPeriod; 
            private String backupTime; 
            private String clusterId; 
            private String createdTime; 
            private String dataCenterId; 
            private Integer retentionPeriod; 

            /**
             * Active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * BackupPeriod.
             */
            public Builder backupPeriod(String backupPeriod) {
                this.backupPeriod = backupPeriod;
                return this;
            }

            /**
             * BackupTime.
             */
            public Builder backupTime(String backupTime) {
                this.backupTime = backupTime;
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
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * RetentionPeriod.
             */
            public Builder retentionPeriod(Integer retentionPeriod) {
                this.retentionPeriod = retentionPeriod;
                return this;
            }

            public BackupPlan build() {
                return new BackupPlan(this);
            } 

        } 

    }
}
