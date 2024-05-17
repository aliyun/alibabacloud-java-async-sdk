// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

    public static class AdvanceDataPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoCreated")
        private Boolean autoCreated;

        @com.aliyun.core.annotation.NameInMap("BakType")
        private String bakType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("DumpAction")
        private String dumpAction;

        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterType")
        private String filterType;

        @com.aliyun.core.annotation.NameInMap("FilterValue")
        private String filterValue;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("RetentionType")
        private String retentionType;

        @com.aliyun.core.annotation.NameInMap("RetentionValue")
        private String retentionValue;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        private AdvanceDataPolicies(Builder builder) {
            this.autoCreated = builder.autoCreated;
            this.bakType = builder.bakType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.dumpAction = builder.dumpAction;
            this.filterKey = builder.filterKey;
            this.filterType = builder.filterType;
            this.filterValue = builder.filterValue;
            this.policyId = builder.policyId;
            this.retentionType = builder.retentionType;
            this.retentionValue = builder.retentionValue;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceDataPolicies create() {
            return builder().build();
        }

        /**
         * @return autoCreated
         */
        public Boolean getAutoCreated() {
            return this.autoCreated;
        }

        /**
         * @return bakType
         */
        public String getBakType() {
            return this.bakType;
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * @return dumpAction
         */
        public String getDumpAction() {
            return this.dumpAction;
        }

        /**
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterType
         */
        public String getFilterType() {
            return this.filterType;
        }

        /**
         * @return filterValue
         */
        public String getFilterValue() {
            return this.filterValue;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return retentionType
         */
        public String getRetentionType() {
            return this.retentionType;
        }

        /**
         * @return retentionValue
         */
        public String getRetentionValue() {
            return this.retentionValue;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private Boolean autoCreated; 
            private String bakType; 
            private String destRegion; 
            private String destType; 
            private String dumpAction; 
            private String filterKey; 
            private String filterType; 
            private String filterValue; 
            private String policyId; 
            private String retentionType; 
            private String retentionValue; 
            private String srcRegion; 
            private String srcType; 
            private String strategyId; 

            /**
             * AutoCreated.
             */
            public Builder autoCreated(Boolean autoCreated) {
                this.autoCreated = autoCreated;
                return this;
            }

            /**
             * BakType.
             */
            public Builder bakType(String bakType) {
                this.bakType = bakType;
                return this;
            }

            /**
             * DestRegion.
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * DestType.
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * DumpAction.
             */
            public Builder dumpAction(String dumpAction) {
                this.dumpAction = dumpAction;
                return this;
            }

            /**
             * FilterKey.
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * FilterType.
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * FilterValue.
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * RetentionType.
             */
            public Builder retentionType(String retentionType) {
                this.retentionType = retentionType;
                return this;
            }

            /**
             * RetentionValue.
             */
            public Builder retentionValue(String retentionValue) {
                this.retentionValue = retentionValue;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * SrcType.
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public AdvanceDataPolicies build() {
                return new AdvanceDataPolicies(this);
            } 

        } 

    }
    public static class AdvanceLogPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("EnableLogBackup")
        private Boolean enableLogBackup;

        @com.aliyun.core.annotation.NameInMap("LogRetentionType")
        private String logRetentionType;

        @com.aliyun.core.annotation.NameInMap("LogRetentionValue")
        private String logRetentionValue;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        private AdvanceLogPolicies(Builder builder) {
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.enableLogBackup = builder.enableLogBackup;
            this.logRetentionType = builder.logRetentionType;
            this.logRetentionValue = builder.logRetentionValue;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceLogPolicies create() {
            return builder().build();
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * @return enableLogBackup
         */
        public Boolean getEnableLogBackup() {
            return this.enableLogBackup;
        }

        /**
         * @return logRetentionType
         */
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        /**
         * @return logRetentionValue
         */
        public String getLogRetentionValue() {
            return this.logRetentionValue;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String destRegion; 
            private String destType; 
            private Boolean enableLogBackup; 
            private String logRetentionType; 
            private String logRetentionValue; 
            private String srcRegion; 
            private String srcType; 
            private String strategyId; 

            /**
             * DestRegion.
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * DestType.
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * EnableLogBackup.
             */
            public Builder enableLogBackup(Boolean enableLogBackup) {
                this.enableLogBackup = enableLogBackup;
                return this;
            }

            /**
             * LogRetentionType.
             */
            public Builder logRetentionType(String logRetentionType) {
                this.logRetentionType = logRetentionType;
                return this;
            }

            /**
             * LogRetentionValue.
             */
            public Builder logRetentionValue(String logRetentionValue) {
                this.logRetentionValue = logRetentionValue;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * SrcType.
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public AdvanceLogPolicies build() {
                return new AdvanceLogPolicies(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvanceDataPolicies")
        private java.util.List < AdvanceDataPolicies> advanceDataPolicies;

        @com.aliyun.core.annotation.NameInMap("AdvanceLogPolicies")
        private java.util.List < AdvanceLogPolicies> advanceLogPolicies;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupPriority")
        private Integer backupPriority;

        @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
        private Integer backupRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
        private String backupRetentionPolicyOnClusterDeletion;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("EnableBackup")
        private Integer enableBackup;

        @com.aliyun.core.annotation.NameInMap("EnableIncBackup")
        private Integer enableIncBackup;

        @com.aliyun.core.annotation.NameInMap("EnableLogBackup")
        private Integer enableLogBackup;

        @com.aliyun.core.annotation.NameInMap("HighFrequencyBakInterval")
        private Integer highFrequencyBakInterval;

        @com.aliyun.core.annotation.NameInMap("HighSpaceUsageProtection")
        private String highSpaceUsageProtection;

        @com.aliyun.core.annotation.NameInMap("IncBackupInterval")
        private Integer incBackupInterval;

        @com.aliyun.core.annotation.NameInMap("LocalLogRetentionSpace")
        private Integer localLogRetentionSpace;

        @com.aliyun.core.annotation.NameInMap("LogBackupLocalRetentionNumber")
        private String logBackupLocalRetentionNumber;

        @com.aliyun.core.annotation.NameInMap("LogBackupRetention")
        private Integer logBackupRetention;

        @com.aliyun.core.annotation.NameInMap("PreferredBackupDate")
        private String preferredBackupDate;

        @com.aliyun.core.annotation.NameInMap("PreferredBackupWindow")
        private String preferredBackupWindow;

        @com.aliyun.core.annotation.NameInMap("PreferredBackupWindowBegin")
        private String preferredBackupWindowBegin;

        private Data(Builder builder) {
            this.advanceDataPolicies = builder.advanceDataPolicies;
            this.advanceLogPolicies = builder.advanceLogPolicies;
            this.backupMethod = builder.backupMethod;
            this.backupPriority = builder.backupPriority;
            this.backupRetentionPeriod = builder.backupRetentionPeriod;
            this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
            this.category = builder.category;
            this.enableBackup = builder.enableBackup;
            this.enableIncBackup = builder.enableIncBackup;
            this.enableLogBackup = builder.enableLogBackup;
            this.highFrequencyBakInterval = builder.highFrequencyBakInterval;
            this.highSpaceUsageProtection = builder.highSpaceUsageProtection;
            this.incBackupInterval = builder.incBackupInterval;
            this.localLogRetentionSpace = builder.localLogRetentionSpace;
            this.logBackupLocalRetentionNumber = builder.logBackupLocalRetentionNumber;
            this.logBackupRetention = builder.logBackupRetention;
            this.preferredBackupDate = builder.preferredBackupDate;
            this.preferredBackupWindow = builder.preferredBackupWindow;
            this.preferredBackupWindowBegin = builder.preferredBackupWindowBegin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return advanceDataPolicies
         */
        public java.util.List < AdvanceDataPolicies> getAdvanceDataPolicies() {
            return this.advanceDataPolicies;
        }

        /**
         * @return advanceLogPolicies
         */
        public java.util.List < AdvanceLogPolicies> getAdvanceLogPolicies() {
            return this.advanceLogPolicies;
        }

        /**
         * @return backupMethod
         */
        public String getBackupMethod() {
            return this.backupMethod;
        }

        /**
         * @return backupPriority
         */
        public Integer getBackupPriority() {
            return this.backupPriority;
        }

        /**
         * @return backupRetentionPeriod
         */
        public Integer getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        /**
         * @return backupRetentionPolicyOnClusterDeletion
         */
        public String getBackupRetentionPolicyOnClusterDeletion() {
            return this.backupRetentionPolicyOnClusterDeletion;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return enableBackup
         */
        public Integer getEnableBackup() {
            return this.enableBackup;
        }

        /**
         * @return enableIncBackup
         */
        public Integer getEnableIncBackup() {
            return this.enableIncBackup;
        }

        /**
         * @return enableLogBackup
         */
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        /**
         * @return highFrequencyBakInterval
         */
        public Integer getHighFrequencyBakInterval() {
            return this.highFrequencyBakInterval;
        }

        /**
         * @return highSpaceUsageProtection
         */
        public String getHighSpaceUsageProtection() {
            return this.highSpaceUsageProtection;
        }

        /**
         * @return incBackupInterval
         */
        public Integer getIncBackupInterval() {
            return this.incBackupInterval;
        }

        /**
         * @return localLogRetentionSpace
         */
        public Integer getLocalLogRetentionSpace() {
            return this.localLogRetentionSpace;
        }

        /**
         * @return logBackupLocalRetentionNumber
         */
        public String getLogBackupLocalRetentionNumber() {
            return this.logBackupLocalRetentionNumber;
        }

        /**
         * @return logBackupRetention
         */
        public Integer getLogBackupRetention() {
            return this.logBackupRetention;
        }

        /**
         * @return preferredBackupDate
         */
        public String getPreferredBackupDate() {
            return this.preferredBackupDate;
        }

        /**
         * @return preferredBackupWindow
         */
        public String getPreferredBackupWindow() {
            return this.preferredBackupWindow;
        }

        /**
         * @return preferredBackupWindowBegin
         */
        public String getPreferredBackupWindowBegin() {
            return this.preferredBackupWindowBegin;
        }

        public static final class Builder {
            private java.util.List < AdvanceDataPolicies> advanceDataPolicies; 
            private java.util.List < AdvanceLogPolicies> advanceLogPolicies; 
            private String backupMethod; 
            private Integer backupPriority; 
            private Integer backupRetentionPeriod; 
            private String backupRetentionPolicyOnClusterDeletion; 
            private String category; 
            private Integer enableBackup; 
            private Integer enableIncBackup; 
            private Integer enableLogBackup; 
            private Integer highFrequencyBakInterval; 
            private String highSpaceUsageProtection; 
            private Integer incBackupInterval; 
            private Integer localLogRetentionSpace; 
            private String logBackupLocalRetentionNumber; 
            private Integer logBackupRetention; 
            private String preferredBackupDate; 
            private String preferredBackupWindow; 
            private String preferredBackupWindowBegin; 

            /**
             * AdvanceDataPolicies.
             */
            public Builder advanceDataPolicies(java.util.List < AdvanceDataPolicies> advanceDataPolicies) {
                this.advanceDataPolicies = advanceDataPolicies;
                return this;
            }

            /**
             * AdvanceLogPolicies.
             */
            public Builder advanceLogPolicies(java.util.List < AdvanceLogPolicies> advanceLogPolicies) {
                this.advanceLogPolicies = advanceLogPolicies;
                return this;
            }

            /**
             * BackupMethod.
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * BackupPriority.
             */
            public Builder backupPriority(Integer backupPriority) {
                this.backupPriority = backupPriority;
                return this;
            }

            /**
             * BackupRetentionPeriod.
             */
            public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
                this.backupRetentionPeriod = backupRetentionPeriod;
                return this;
            }

            /**
             * BackupRetentionPolicyOnClusterDeletion.
             */
            public Builder backupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
                this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * EnableBackup.
             */
            public Builder enableBackup(Integer enableBackup) {
                this.enableBackup = enableBackup;
                return this;
            }

            /**
             * EnableIncBackup.
             */
            public Builder enableIncBackup(Integer enableIncBackup) {
                this.enableIncBackup = enableIncBackup;
                return this;
            }

            /**
             * EnableLogBackup.
             */
            public Builder enableLogBackup(Integer enableLogBackup) {
                this.enableLogBackup = enableLogBackup;
                return this;
            }

            /**
             * HighFrequencyBakInterval.
             */
            public Builder highFrequencyBakInterval(Integer highFrequencyBakInterval) {
                this.highFrequencyBakInterval = highFrequencyBakInterval;
                return this;
            }

            /**
             * HighSpaceUsageProtection.
             */
            public Builder highSpaceUsageProtection(String highSpaceUsageProtection) {
                this.highSpaceUsageProtection = highSpaceUsageProtection;
                return this;
            }

            /**
             * IncBackupInterval.
             */
            public Builder incBackupInterval(Integer incBackupInterval) {
                this.incBackupInterval = incBackupInterval;
                return this;
            }

            /**
             * LocalLogRetentionSpace.
             */
            public Builder localLogRetentionSpace(Integer localLogRetentionSpace) {
                this.localLogRetentionSpace = localLogRetentionSpace;
                return this;
            }

            /**
             * LogBackupLocalRetentionNumber.
             */
            public Builder logBackupLocalRetentionNumber(String logBackupLocalRetentionNumber) {
                this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
                return this;
            }

            /**
             * LogBackupRetention.
             */
            public Builder logBackupRetention(Integer logBackupRetention) {
                this.logBackupRetention = logBackupRetention;
                return this;
            }

            /**
             * PreferredBackupDate.
             */
            public Builder preferredBackupDate(String preferredBackupDate) {
                this.preferredBackupDate = preferredBackupDate;
                return this;
            }

            /**
             * PreferredBackupWindow.
             */
            public Builder preferredBackupWindow(String preferredBackupWindow) {
                this.preferredBackupWindow = preferredBackupWindow;
                return this;
            }

            /**
             * PreferredBackupWindowBegin.
             */
            public Builder preferredBackupWindowBegin(String preferredBackupWindowBegin) {
                this.preferredBackupWindowBegin = preferredBackupWindowBegin;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
