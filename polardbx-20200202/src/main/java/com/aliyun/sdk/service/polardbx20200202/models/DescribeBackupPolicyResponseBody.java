// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BackupPeriod")
        private String backupPeriod;

        @NameInMap("BackupPlanBegin")
        private String backupPlanBegin;

        @NameInMap("BackupSetRetention")
        private Integer backupSetRetention;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("BackupWay")
        private String backupWay;

        @NameInMap("DBInstanceName")
        private String DBInstanceName;

        @NameInMap("ForceCleanOnHighSpaceUsage")
        private Integer forceCleanOnHighSpaceUsage;

        @NameInMap("IsEnabled")
        private Integer isEnabled;

        @NameInMap("LocalLogRetention")
        private Integer localLogRetention;

        @NameInMap("LogLocalRetentionSpace")
        private Integer logLocalRetentionSpace;

        @NameInMap("RemoveLogRetention")
        private Integer removeLogRetention;

        private Data(Builder builder) {
            this.backupPeriod = builder.backupPeriod;
            this.backupPlanBegin = builder.backupPlanBegin;
            this.backupSetRetention = builder.backupSetRetention;
            this.backupType = builder.backupType;
            this.backupWay = builder.backupWay;
            this.DBInstanceName = builder.DBInstanceName;
            this.forceCleanOnHighSpaceUsage = builder.forceCleanOnHighSpaceUsage;
            this.isEnabled = builder.isEnabled;
            this.localLogRetention = builder.localLogRetention;
            this.logLocalRetentionSpace = builder.logLocalRetentionSpace;
            this.removeLogRetention = builder.removeLogRetention;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupPeriod
         */
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        /**
         * @return backupPlanBegin
         */
        public String getBackupPlanBegin() {
            return this.backupPlanBegin;
        }

        /**
         * @return backupSetRetention
         */
        public Integer getBackupSetRetention() {
            return this.backupSetRetention;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return backupWay
         */
        public String getBackupWay() {
            return this.backupWay;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return forceCleanOnHighSpaceUsage
         */
        public Integer getForceCleanOnHighSpaceUsage() {
            return this.forceCleanOnHighSpaceUsage;
        }

        /**
         * @return isEnabled
         */
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        /**
         * @return localLogRetention
         */
        public Integer getLocalLogRetention() {
            return this.localLogRetention;
        }

        /**
         * @return logLocalRetentionSpace
         */
        public Integer getLogLocalRetentionSpace() {
            return this.logLocalRetentionSpace;
        }

        /**
         * @return removeLogRetention
         */
        public Integer getRemoveLogRetention() {
            return this.removeLogRetention;
        }

        public static final class Builder {
            private String backupPeriod; 
            private String backupPlanBegin; 
            private Integer backupSetRetention; 
            private String backupType; 
            private String backupWay; 
            private String DBInstanceName; 
            private Integer forceCleanOnHighSpaceUsage; 
            private Integer isEnabled; 
            private Integer localLogRetention; 
            private Integer logLocalRetentionSpace; 
            private Integer removeLogRetention; 

            /**
             * BackupPeriod.
             */
            public Builder backupPeriod(String backupPeriod) {
                this.backupPeriod = backupPeriod;
                return this;
            }

            /**
             * BackupPlanBegin.
             */
            public Builder backupPlanBegin(String backupPlanBegin) {
                this.backupPlanBegin = backupPlanBegin;
                return this;
            }

            /**
             * BackupSetRetention.
             */
            public Builder backupSetRetention(Integer backupSetRetention) {
                this.backupSetRetention = backupSetRetention;
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
             * BackupWay.
             */
            public Builder backupWay(String backupWay) {
                this.backupWay = backupWay;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * ForceCleanOnHighSpaceUsage.
             */
            public Builder forceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
                this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
                return this;
            }

            /**
             * IsEnabled.
             */
            public Builder isEnabled(Integer isEnabled) {
                this.isEnabled = isEnabled;
                return this;
            }

            /**
             * LocalLogRetention.
             */
            public Builder localLogRetention(Integer localLogRetention) {
                this.localLogRetention = localLogRetention;
                return this;
            }

            /**
             * LogLocalRetentionSpace.
             */
            public Builder logLocalRetentionSpace(Integer logLocalRetentionSpace) {
                this.logLocalRetentionSpace = logLocalRetentionSpace;
                return this;
            }

            /**
             * RemoveLogRetention.
             */
            public Builder removeLogRetention(Integer removeLogRetention) {
                this.removeLogRetention = removeLogRetention;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
