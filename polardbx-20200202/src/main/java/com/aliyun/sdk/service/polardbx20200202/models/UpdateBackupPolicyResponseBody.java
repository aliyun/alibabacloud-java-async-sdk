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
         * <p>The returned policy details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message. If the call is successful, success is returned. If the call fails, the corresponding error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        @com.aliyun.core.annotation.NameInMap("CrossRegionFilterValue")
        private String crossRegionFilterValue;

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
            this.crossRegionFilterValue = builder.crossRegionFilterValue;
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
         * @return crossRegionFilterValue
         */
        public String getCrossRegionFilterValue() {
            return this.crossRegionFilterValue;
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
            private String crossRegionFilterValue; 
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
                this.crossRegionFilterValue = model.crossRegionFilterValue;
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
             * <p>The backup cycle. Specify at least two days. The value is a 7-digit string, where each digit from left to right represents whether backups are enabled for Monday through Sunday. A value of 0 indicates that backups are disabled, and a value of 1 indicates that backups are enabled:</p>
             * <ul>
             * <li>First digit: Monday</li>
             * <li>Second digit: Tuesday</li>
             * <li>Third digit: Wednesday</li>
             * <li>Fourth digit: Thursday</li>
             * <li>Fifth digit: Friday</li>
             * <li>Sixth digit: Saturday</li>
             * <li>Seventh digit: Sunday</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1001000</p>
             */
            public Builder backupPeriod(String backupPeriod) {
                this.backupPeriod = backupPeriod;
                return this;
            }

            /**
             * <p>The time when the daily backup starts, in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>03:00Z</p>
             */
            public Builder backupPlanBegin(String backupPlanBegin) {
                this.backupPlanBegin = backupPlanBegin;
                return this;
            }

            /**
             * <p>The retention period of the backup set, in days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder backupSetRetention(Integer backupSetRetention) {
                this.backupSetRetention = backupSetRetention;
                return this;
            }

            /**
             * <p>The backup type. A value of 0 indicates a quick backup.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The backup method. Valid values:</p>
             * <ul>
             * <li><strong>P</strong>: physical backup</li>
             * <li><strong>L</strong>: logical backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>P</p>
             */
            public Builder backupWay(String backupWay) {
                this.backupWay = backupWay;
                return this;
            }

            /**
             * <p>The interval at which cold data is backed up, in days. Valid values: 1 to 59.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder coldDataBackupInterval(Integer coldDataBackupInterval) {
                this.coldDataBackupInterval = coldDataBackupInterval;
                return this;
            }

            /**
             * <p>The retention period of cold data backups, in days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder coldDataBackupRetention(Integer coldDataBackupRetention) {
                this.coldDataBackupRetention = coldDataBackupRetention;
                return this;
            }

            /**
             * <p>The retention period of cross-region data backups, in days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder crossRegionDataBackupRetention(Integer crossRegionDataBackupRetention) {
                this.crossRegionDataBackupRetention = crossRegionDataBackupRetention;
                return this;
            }

            /**
             * <p>The number of days selected for cross-region backups.</p>
             * 
             * <strong>example:</strong>
             * <p>3,7,1,5,6,2,4</p>
             */
            public Builder crossRegionFilterValue(String crossRegionFilterValue) {
                this.crossRegionFilterValue = crossRegionFilterValue;
                return this;
            }

            /**
             * <p>The retention period of cross-region log backups, in days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder crossRegionLogBackupRetention(Integer crossRegionLogBackupRetention) {
                this.crossRegionLogBackupRetention = crossRegionLogBackupRetention;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzjasdyuoo</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The destination region for cross-region backups.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destCrossRegion(String destCrossRegion) {
                this.destCrossRegion = destCrossRegion;
                return this;
            }

            /**
             * <p>Specifies whether to forcibly clear binary logs when the storage usage of the instance is excessively high. A value of 1 indicates yes, and a value of 0 indicates no.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder forceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
                this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
                return this;
            }

            /**
             * <p>Specifies whether to enable cross-region data backups. Default value: false.</p>
             */
            public Builder isCrossRegionDataBackupEnabled(Boolean isCrossRegionDataBackupEnabled) {
                this.isCrossRegionDataBackupEnabled = isCrossRegionDataBackupEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable cross-region log backups. Default value: false.</p>
             */
            public Builder isCrossRegionLogBackupEnabled(Boolean isCrossRegionLogBackupEnabled) {
                this.isCrossRegionLogBackupEnabled = isCrossRegionLogBackupEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable backups. The fixed value is 1, which indicates that backups are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isEnabled(Integer isEnabled) {
                this.isEnabled = isEnabled;
                return this;
            }

            /**
             * <p>The local retention period of log backups, in hours. Valid values: 0 to 168. A value of 0 indicates that log backups are not retained. Default value: 7.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder localLogRetention(Integer localLogRetention) {
                this.localLogRetention = localLogRetention;
                return this;
            }

            /**
             * <p>The number of local binary logs to retain. Valid values: 6 to 100. Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder localLogRetentionNumber(Integer localLogRetentionNumber) {
                this.localLogRetentionNumber = localLogRetentionNumber;
                return this;
            }

            /**
             * <p>The maximum space usage for binary logs. The parameter value ranges from 0 to 50. This is a loop space. Default value: 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder logLocalRetentionSpace(Integer logLocalRetentionSpace) {
                this.logLocalRetentionSpace = logLocalRetentionSpace;
                return this;
            }

            /**
             * <p>The remote retention period of log backups, in days. Valid values: 7 to 730. Default value: 7.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
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
