// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link UpdateBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBackupPolicyResponseBody</p>
 */
public class UpdateBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateBackupPolicyResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBackupPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateBackupPolicyResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public UpdateBackupPolicyResponseBody build() {
            return new UpdateBackupPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateBackupPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupPeriod")
        private String backupPeriod;

        @com.aliyun.core.annotation.NameInMap("BackupPlanBegin")
        private String backupPlanBegin;

        @com.aliyun.core.annotation.NameInMap("BackupSetRetention")
        private Integer backupSetRetention;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("BackupWay")
        private String backupWay;

        @com.aliyun.core.annotation.NameInMap("ColdDataBackupInterval")
        private Integer coldDataBackupInterval;

        @com.aliyun.core.annotation.NameInMap("ColdDataBackupRetention")
        private Integer coldDataBackupRetention;

        @com.aliyun.core.annotation.NameInMap("CrossRegionDataBackupRetention")
        private Integer crossRegionDataBackupRetention;

        @com.aliyun.core.annotation.NameInMap("CrossRegionLogBackupRetention")
        private Integer crossRegionLogBackupRetention;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DestCrossRegion")
        private String destCrossRegion;

        @com.aliyun.core.annotation.NameInMap("ForceCleanOnHighSpaceUsage")
        private Integer forceCleanOnHighSpaceUsage;

        @com.aliyun.core.annotation.NameInMap("IsCrossRegionDataBackupEnabled")
        private Boolean isCrossRegionDataBackupEnabled;

        @com.aliyun.core.annotation.NameInMap("IsCrossRegionLogBackupEnabled")
        private Boolean isCrossRegionLogBackupEnabled;

        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Integer isEnabled;

        @com.aliyun.core.annotation.NameInMap("LocalLogRetention")
        private Integer localLogRetention;

        @com.aliyun.core.annotation.NameInMap("LocalLogRetentionNumber")
        private Integer localLogRetentionNumber;

        @com.aliyun.core.annotation.NameInMap("LogLocalRetentionSpace")
        private Integer logLocalRetentionSpace;

        @com.aliyun.core.annotation.NameInMap("RemoveLogRetention")
        private Integer removeLogRetention;

        private Data(Builder builder) {
            this.backupPeriod = builder.backupPeriod;
            this.backupPlanBegin = builder.backupPlanBegin;
            this.backupSetRetention = builder.backupSetRetention;
            this.backupType = builder.backupType;
            this.backupWay = builder.backupWay;
            this.coldDataBackupInterval = builder.coldDataBackupInterval;
            this.coldDataBackupRetention = builder.coldDataBackupRetention;
            this.crossRegionDataBackupRetention = builder.crossRegionDataBackupRetention;
            this.crossRegionLogBackupRetention = builder.crossRegionLogBackupRetention;
            this.DBInstanceName = builder.DBInstanceName;
            this.destCrossRegion = builder.destCrossRegion;
            this.forceCleanOnHighSpaceUsage = builder.forceCleanOnHighSpaceUsage;
            this.isCrossRegionDataBackupEnabled = builder.isCrossRegionDataBackupEnabled;
            this.isCrossRegionLogBackupEnabled = builder.isCrossRegionLogBackupEnabled;
            this.isEnabled = builder.isEnabled;
            this.localLogRetention = builder.localLogRetention;
            this.localLogRetentionNumber = builder.localLogRetentionNumber;
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
         * @return coldDataBackupInterval
         */
        public Integer getColdDataBackupInterval() {
            return this.coldDataBackupInterval;
        }

        /**
         * @return coldDataBackupRetention
         */
        public Integer getColdDataBackupRetention() {
            return this.coldDataBackupRetention;
        }

        /**
         * @return crossRegionDataBackupRetention
         */
        public Integer getCrossRegionDataBackupRetention() {
            return this.crossRegionDataBackupRetention;
        }

        /**
         * @return crossRegionLogBackupRetention
         */
        public Integer getCrossRegionLogBackupRetention() {
            return this.crossRegionLogBackupRetention;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return destCrossRegion
         */
        public String getDestCrossRegion() {
            return this.destCrossRegion;
        }

        /**
         * @return forceCleanOnHighSpaceUsage
         */
        public Integer getForceCleanOnHighSpaceUsage() {
            return this.forceCleanOnHighSpaceUsage;
        }

        /**
         * @return isCrossRegionDataBackupEnabled
         */
        public Boolean getIsCrossRegionDataBackupEnabled() {
            return this.isCrossRegionDataBackupEnabled;
        }

        /**
         * @return isCrossRegionLogBackupEnabled
         */
        public Boolean getIsCrossRegionLogBackupEnabled() {
            return this.isCrossRegionLogBackupEnabled;
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
         * @return localLogRetentionNumber
         */
        public Integer getLocalLogRetentionNumber() {
            return this.localLogRetentionNumber;
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
            private Integer coldDataBackupInterval; 
            private Integer coldDataBackupRetention; 
            private Integer crossRegionDataBackupRetention; 
            private Integer crossRegionLogBackupRetention; 
            private String DBInstanceName; 
            private String destCrossRegion; 
            private Integer forceCleanOnHighSpaceUsage; 
            private Boolean isCrossRegionDataBackupEnabled; 
            private Boolean isCrossRegionLogBackupEnabled; 
            private Integer isEnabled; 
            private Integer localLogRetention; 
            private Integer localLogRetentionNumber; 
            private Integer logLocalRetentionSpace; 
            private Integer removeLogRetention; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.backupPeriod = model.backupPeriod;
                this.backupPlanBegin = model.backupPlanBegin;
                this.backupSetRetention = model.backupSetRetention;
                this.backupType = model.backupType;
                this.backupWay = model.backupWay;
                this.coldDataBackupInterval = model.coldDataBackupInterval;
                this.coldDataBackupRetention = model.coldDataBackupRetention;
                this.crossRegionDataBackupRetention = model.crossRegionDataBackupRetention;
                this.crossRegionLogBackupRetention = model.crossRegionLogBackupRetention;
                this.DBInstanceName = model.DBInstanceName;
                this.destCrossRegion = model.destCrossRegion;
                this.forceCleanOnHighSpaceUsage = model.forceCleanOnHighSpaceUsage;
                this.isCrossRegionDataBackupEnabled = model.isCrossRegionDataBackupEnabled;
                this.isCrossRegionLogBackupEnabled = model.isCrossRegionLogBackupEnabled;
                this.isEnabled = model.isEnabled;
                this.localLogRetention = model.localLogRetention;
                this.localLogRetentionNumber = model.localLogRetentionNumber;
                this.logLocalRetentionSpace = model.logLocalRetentionSpace;
                this.removeLogRetention = model.removeLogRetention;
            } 

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
             * ColdDataBackupInterval.
             */
            public Builder coldDataBackupInterval(Integer coldDataBackupInterval) {
                this.coldDataBackupInterval = coldDataBackupInterval;
                return this;
            }

            /**
             * ColdDataBackupRetention.
             */
            public Builder coldDataBackupRetention(Integer coldDataBackupRetention) {
                this.coldDataBackupRetention = coldDataBackupRetention;
                return this;
            }

            /**
             * CrossRegionDataBackupRetention.
             */
            public Builder crossRegionDataBackupRetention(Integer crossRegionDataBackupRetention) {
                this.crossRegionDataBackupRetention = crossRegionDataBackupRetention;
                return this;
            }

            /**
             * CrossRegionLogBackupRetention.
             */
            public Builder crossRegionLogBackupRetention(Integer crossRegionLogBackupRetention) {
                this.crossRegionLogBackupRetention = crossRegionLogBackupRetention;
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
             * DestCrossRegion.
             */
            public Builder destCrossRegion(String destCrossRegion) {
                this.destCrossRegion = destCrossRegion;
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
             * IsCrossRegionDataBackupEnabled.
             */
            public Builder isCrossRegionDataBackupEnabled(Boolean isCrossRegionDataBackupEnabled) {
                this.isCrossRegionDataBackupEnabled = isCrossRegionDataBackupEnabled;
                return this;
            }

            /**
             * IsCrossRegionLogBackupEnabled.
             */
            public Builder isCrossRegionLogBackupEnabled(Boolean isCrossRegionLogBackupEnabled) {
                this.isCrossRegionLogBackupEnabled = isCrossRegionLogBackupEnabled;
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
             * LocalLogRetentionNumber.
             */
            public Builder localLogRetentionNumber(Integer localLogRetentionNumber) {
                this.localLogRetentionNumber = localLogRetentionNumber;
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
