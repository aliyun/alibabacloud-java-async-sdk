// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link ModifyBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBackupPolicyResponseBody</p>
 */
public class ModifyBackupPolicyResponseBody extends TeaModel {
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

    private ModifyBackupPolicyResponseBody(Builder builder) {
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

    public static ModifyBackupPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyBackupPolicyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the backup policy.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceName can not be empty.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D570F209-A166-50C6-98A3-155A20B218B7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ModifyBackupPolicyResponseBody build() {
            return new ModifyBackupPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("OnlyPreserveOneEachDay")
        private Boolean onlyPreserveOneEachDay;

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

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        private AdvanceDataPolicies(Builder builder) {
            this.autoCreated = builder.autoCreated;
            this.bakType = builder.bakType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.dumpAction = builder.dumpAction;
            this.filterKey = builder.filterKey;
            this.filterType = builder.filterType;
            this.filterValue = builder.filterValue;
            this.onlyPreserveOneEachDay = builder.onlyPreserveOneEachDay;
            this.policyId = builder.policyId;
            this.retentionType = builder.retentionType;
            this.retentionValue = builder.retentionValue;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
            this.storageClass = builder.storageClass;
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
         * @return onlyPreserveOneEachDay
         */
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
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
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
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
            private Boolean onlyPreserveOneEachDay; 
            private String policyId; 
            private String retentionType; 
            private String retentionValue; 
            private String srcRegion; 
            private String srcType; 
            private String storageClass; 

            private Builder() {
            } 

            private Builder(AdvanceDataPolicies model) {
                this.autoCreated = model.autoCreated;
                this.bakType = model.bakType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.dumpAction = model.dumpAction;
                this.filterKey = model.filterKey;
                this.filterType = model.filterType;
                this.filterValue = model.filterValue;
                this.onlyPreserveOneEachDay = model.onlyPreserveOneEachDay;
                this.policyId = model.policyId;
                this.retentionType = model.retentionType;
                this.retentionValue = model.retentionValue;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
                this.storageClass = model.storageClass;
            } 

            /**
             * <p>Indicates whether the backup policy is generated by the system. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The backup policy is generated by the system.</li>
             * <li><strong>false</strong>: The backup policy is a custom one.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoCreated(Boolean autoCreated) {
                this.autoCreated = autoCreated;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>F</strong>: full backup.</li>
             * <li><strong>L</strong>: log backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>F</p>
             */
            public Builder bakType(String bakType) {
                this.bakType = bakType;
                return this;
            }

            /**
             * <p>The region in which backup files are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The storage method of backup files. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level1</p>
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * <p>The information about the dump policy. Valid values:</p>
             * <ul>
             * <li><strong>copy</strong>: The backup data is copied from the data source to the destination.</li>
             * <li><strong>move</strong>: The backup data is moved from the data source to the destination.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>copy</p>
             */
            public Builder dumpAction(String dumpAction) {
                this.dumpAction = dumpAction;
                return this;
            }

            /**
             * <p>The scheduling cycle. Valid values:</p>
             * <ul>
             * <li><strong>dayOfWeek</strong>: scheduling by week.</li>
             * <li><strong>dayOfMonth</strong>: scheduling by month.</li>
             * <li><strong>dayOfYear</strong>: scheduling by year.</li>
             * <li><strong>backupInterval</strong>: scheduling at a specific interval.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only when FilterType is set to <strong>crontab</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>backupInterval</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The scheduling mode of the advanced backup policy. Valid values:</p>
             * <ul>
             * <li><strong>crontab</strong>: periodic scheduling.</li>
             * <li><strong>event</strong>: event-based scheduling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>crontab</p>
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * <p>The backup cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * OnlyPreserveOneEachDay.
             */
            public Builder onlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
                this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
                return this;
            }

            /**
             * <p>The ID of the advanced backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>dc13b153acc91141789122c23835****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The retention type of backup sets. Valid values:</p>
             * <ul>
             * <li><strong>never</strong>: Backup sets never expire.</li>
             * <li><strong>delay</strong>: Backup sets are retained for a specific number of days.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>delay</p>
             */
            public Builder retentionType(String retentionType) {
                this.retentionType = retentionType;
                return this;
            }

            /**
             * <p>The retention period. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder retentionValue(String retentionValue) {
                this.retentionValue = retentionValue;
                return this;
            }

            /**
             * <p>The region in which the data source of the backup policy resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the data source of the backup policy. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            public AdvanceDataPolicies build() {
                return new AdvanceDataPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyResponseBody</p>
     */
    public static class AdvanceIncPolicies extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("OnlyPreserveOneEachDay")
        private Boolean onlyPreserveOneEachDay;

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

        private AdvanceIncPolicies(Builder builder) {
            this.autoCreated = builder.autoCreated;
            this.bakType = builder.bakType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.dumpAction = builder.dumpAction;
            this.filterKey = builder.filterKey;
            this.filterType = builder.filterType;
            this.filterValue = builder.filterValue;
            this.onlyPreserveOneEachDay = builder.onlyPreserveOneEachDay;
            this.policyId = builder.policyId;
            this.retentionType = builder.retentionType;
            this.retentionValue = builder.retentionValue;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceIncPolicies create() {
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
         * @return onlyPreserveOneEachDay
         */
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
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

        public static final class Builder {
            private Boolean autoCreated; 
            private String bakType; 
            private String destRegion; 
            private String destType; 
            private String dumpAction; 
            private String filterKey; 
            private String filterType; 
            private String filterValue; 
            private Boolean onlyPreserveOneEachDay; 
            private String policyId; 
            private String retentionType; 
            private String retentionValue; 
            private String srcRegion; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(AdvanceIncPolicies model) {
                this.autoCreated = model.autoCreated;
                this.bakType = model.bakType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.dumpAction = model.dumpAction;
                this.filterKey = model.filterKey;
                this.filterType = model.filterType;
                this.filterValue = model.filterValue;
                this.onlyPreserveOneEachDay = model.onlyPreserveOneEachDay;
                this.policyId = model.policyId;
                this.retentionType = model.retentionType;
                this.retentionValue = model.retentionValue;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
            } 

            /**
             * <p>Indicates whether the backup policy is generated by the system. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The backup policy is generated by the system.</li>
             * <li><strong>false</strong>: The backup policy is a custom one.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoCreated(Boolean autoCreated) {
                this.autoCreated = autoCreated;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>F</strong>: full backup.</li>
             * <li><strong>L</strong>: log backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>F</p>
             */
            public Builder bakType(String bakType) {
                this.bakType = bakType;
                return this;
            }

            /**
             * <p>The region in which backup files are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The storage method of backup files. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level1</p>
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * <p>The information about the dump policy. Valid values:</p>
             * <ul>
             * <li><strong>copy</strong>: The backup data is copied from the data source to the destination.</li>
             * <li><strong>move</strong>: The backup data is moved from the data source to the destination.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>copy</p>
             */
            public Builder dumpAction(String dumpAction) {
                this.dumpAction = dumpAction;
                return this;
            }

            /**
             * <p>The scheduling cycle. Valid values:</p>
             * <ul>
             * <li><strong>dayOfWeek</strong>: scheduling by week.</li>
             * <li><strong>dayOfMonth</strong>: scheduling by month.</li>
             * <li><strong>dayOfYear</strong>: scheduling by year.</li>
             * <li><strong>backupInterval</strong>: scheduling at a specific interval.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only when FilterType is set to <strong>crontab</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>backupInterval</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The scheduling mode of the advanced backup policy. Valid values:</p>
             * <ul>
             * <li><strong>crontab</strong>: periodic scheduling.</li>
             * <li><strong>event</strong>: event-based scheduling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>crontab</p>
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * <p>The backup cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * OnlyPreserveOneEachDay.
             */
            public Builder onlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
                this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
                return this;
            }

            /**
             * <p>The ID of the advanced backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>dc13b153acc91141789122c23835****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The retention type of backup sets. Valid values:</p>
             * <ul>
             * <li><strong>never</strong>: Backup sets never expire.</li>
             * <li><strong>delay</strong>: Backup sets are retained for a specific number of days.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>delay</p>
             */
            public Builder retentionType(String retentionType) {
                this.retentionType = retentionType;
                return this;
            }

            /**
             * <p>The retention period. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder retentionValue(String retentionValue) {
                this.retentionValue = retentionValue;
                return this;
            }

            /**
             * <p>The region in which the data source of the backup policy resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the data source of the backup policy. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public AdvanceIncPolicies build() {
                return new AdvanceIncPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyResponseBody</p>
     */
    public static class AdvanceLogPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("EnableLogBackup")
        private Long enableLogBackup;

        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterType")
        private String filterType;

        @com.aliyun.core.annotation.NameInMap("FilterValue")
        private String filterValue;

        @com.aliyun.core.annotation.NameInMap("LogRetentionType")
        private String logRetentionType;

        @com.aliyun.core.annotation.NameInMap("LogRetentionValue")
        private String logRetentionValue;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        private AdvanceLogPolicies(Builder builder) {
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.enableLogBackup = builder.enableLogBackup;
            this.filterKey = builder.filterKey;
            this.filterType = builder.filterType;
            this.filterValue = builder.filterValue;
            this.logRetentionType = builder.logRetentionType;
            this.logRetentionValue = builder.logRetentionValue;
            this.policyId = builder.policyId;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
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
        public Long getEnableLogBackup() {
            return this.enableLogBackup;
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
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
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

        public static final class Builder {
            private String destRegion; 
            private String destType; 
            private Long enableLogBackup; 
            private String filterKey; 
            private String filterType; 
            private String filterValue; 
            private String logRetentionType; 
            private String logRetentionValue; 
            private String policyId; 
            private String srcRegion; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(AdvanceLogPolicies model) {
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.enableLogBackup = model.enableLogBackup;
                this.filterKey = model.filterKey;
                this.filterType = model.filterType;
                this.filterValue = model.filterValue;
                this.logRetentionType = model.logRetentionType;
                this.logRetentionValue = model.logRetentionValue;
                this.policyId = model.policyId;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
            } 

            /**
             * <p>The region in which backup files are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The storage method of backup files. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level1</p>
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * EnableLogBackup.
             */
            public Builder enableLogBackup(Long enableLogBackup) {
                this.enableLogBackup = enableLogBackup;
                return this;
            }

            /**
             * <p>The scheduling cycle. Valid values:</p>
             * <ul>
             * <li><strong>dayOfWeek</strong>: scheduling by week.</li>
             * <li><strong>dayOfMonth</strong>: scheduling by month.</li>
             * <li><strong>dayOfYear</strong>: scheduling by year.</li>
             * <li><strong>backupInterval</strong>: scheduling at a specific interval.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only when FilterType is set to <strong>crontab</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>backupInterval</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The scheduling mode of the advanced backup policy. Valid values:</p>
             * <ul>
             * <li><strong>crontab</strong>: periodic scheduling.</li>
             * <li><strong>event</strong>: event-based scheduling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>crontab</p>
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * <p>The backup cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
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
             * <p>The ID of the advanced backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>dc13b153acc91141789122c23835****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The region in which the data source of the backup policy resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the data source of the backup policy. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public AdvanceLogPolicies build() {
                return new AdvanceLogPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvanceDataPolicies")
        private java.util.List<AdvanceDataPolicies> advanceDataPolicies;

        @com.aliyun.core.annotation.NameInMap("AdvanceIncPolicies")
        private java.util.List<AdvanceIncPolicies> advanceIncPolicies;

        @com.aliyun.core.annotation.NameInMap("AdvanceLogPolicies")
        private java.util.List<AdvanceLogPolicies> advanceLogPolicies;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupPriority")
        private Integer backupPriority;

        @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
        private String backupRetentionPolicyOnClusterDeletion;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("EnableIncBackup")
        private Boolean enableIncBackup;

        @com.aliyun.core.annotation.NameInMap("PreferredBackupWindow")
        private String preferredBackupWindow;

        @com.aliyun.core.annotation.NameInMap("PreferredBackupWindowBegin")
        private String preferredBackupWindowBegin;

        private Data(Builder builder) {
            this.advanceDataPolicies = builder.advanceDataPolicies;
            this.advanceIncPolicies = builder.advanceIncPolicies;
            this.advanceLogPolicies = builder.advanceLogPolicies;
            this.backupMethod = builder.backupMethod;
            this.backupPriority = builder.backupPriority;
            this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
            this.category = builder.category;
            this.enableIncBackup = builder.enableIncBackup;
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
        public java.util.List<AdvanceDataPolicies> getAdvanceDataPolicies() {
            return this.advanceDataPolicies;
        }

        /**
         * @return advanceIncPolicies
         */
        public java.util.List<AdvanceIncPolicies> getAdvanceIncPolicies() {
            return this.advanceIncPolicies;
        }

        /**
         * @return advanceLogPolicies
         */
        public java.util.List<AdvanceLogPolicies> getAdvanceLogPolicies() {
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
         * @return enableIncBackup
         */
        public Boolean getEnableIncBackup() {
            return this.enableIncBackup;
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
            private java.util.List<AdvanceDataPolicies> advanceDataPolicies; 
            private java.util.List<AdvanceIncPolicies> advanceIncPolicies; 
            private java.util.List<AdvanceLogPolicies> advanceLogPolicies; 
            private String backupMethod; 
            private Integer backupPriority; 
            private String backupRetentionPolicyOnClusterDeletion; 
            private String category; 
            private Boolean enableIncBackup; 
            private String preferredBackupWindow; 
            private String preferredBackupWindowBegin; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.advanceDataPolicies = model.advanceDataPolicies;
                this.advanceIncPolicies = model.advanceIncPolicies;
                this.advanceLogPolicies = model.advanceLogPolicies;
                this.backupMethod = model.backupMethod;
                this.backupPriority = model.backupPriority;
                this.backupRetentionPolicyOnClusterDeletion = model.backupRetentionPolicyOnClusterDeletion;
                this.category = model.category;
                this.enableIncBackup = model.enableIncBackup;
                this.preferredBackupWindow = model.preferredBackupWindow;
                this.preferredBackupWindowBegin = model.preferredBackupWindowBegin;
            } 

            /**
             * <p>The details of data backup policies.</p>
             */
            public Builder advanceDataPolicies(java.util.List<AdvanceDataPolicies> advanceDataPolicies) {
                this.advanceDataPolicies = advanceDataPolicies;
                return this;
            }

            /**
             * AdvanceIncPolicies.
             */
            public Builder advanceIncPolicies(java.util.List<AdvanceIncPolicies> advanceIncPolicies) {
                this.advanceIncPolicies = advanceIncPolicies;
                return this;
            }

            /**
             * AdvanceLogPolicies.
             */
            public Builder advanceLogPolicies(java.util.List<AdvanceLogPolicies> advanceLogPolicies) {
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
             * EnableIncBackup.
             */
            public Builder enableIncBackup(Boolean enableIncBackup) {
                this.enableIncBackup = enableIncBackup;
                return this;
            }

            /**
             * <p>The time period during which a basic backup is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>17:00Z-18:00Z</p>
             */
            public Builder preferredBackupWindow(String preferredBackupWindow) {
                this.preferredBackupWindow = preferredBackupWindow;
                return this;
            }

            /**
             * <p>The start time of a basic backup.</p>
             * 
             * <strong>example:</strong>
             * <p>17:00Z</p>
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
