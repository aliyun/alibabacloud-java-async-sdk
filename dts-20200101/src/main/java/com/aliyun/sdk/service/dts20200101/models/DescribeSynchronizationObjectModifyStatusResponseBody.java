// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationObjectModifyStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationObjectModifyStatusResponseBody</p>
 */
public class DescribeSynchronizationObjectModifyStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
    private DataInitializationStatus dataInitializationStatus;

    @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
    private DataSynchronizationStatus dataSynchronizationStatus;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
    private PrecheckStatus precheckStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
    private StructureInitializationStatus structureInitializationStatus;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSynchronizationObjectModifyStatusResponseBody(Builder builder) {
        this.dataInitializationStatus = builder.dataInitializationStatus;
        this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.errorMessage = builder.errorMessage;
        this.precheckStatus = builder.precheckStatus;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.structureInitializationStatus = builder.structureInitializationStatus;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationObjectModifyStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInitializationStatus
     */
    public DataInitializationStatus getDataInitializationStatus() {
        return this.dataInitializationStatus;
    }

    /**
     * @return dataSynchronizationStatus
     */
    public DataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return precheckStatus
     */
    public PrecheckStatus getPrecheckStatus() {
        return this.precheckStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return structureInitializationStatus
     */
    public StructureInitializationStatus getStructureInitializationStatus() {
        return this.structureInitializationStatus;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DataInitializationStatus dataInitializationStatus; 
        private DataSynchronizationStatus dataSynchronizationStatus; 
        private String errCode; 
        private String errMessage; 
        private String errorMessage; 
        private PrecheckStatus precheckStatus; 
        private String requestId; 
        private String status; 
        private StructureInitializationStatus structureInitializationStatus; 
        private String success; 

        /**
         * The status of full data synchronization.
         */
        public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }

        /**
         * The status of incremental data synchronization.
         * <p>
         * 
         * >  This parameter and its sub-parameters will be removed in the future.
         */
        public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The error message returned if the task failed to modify the objects to be synchronized.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The precheck status.
         */
        public Builder precheckStatus(PrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the task that changes the objects to be synchronized. Valid values:
         * <p>
         * 
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is being prechecked.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **Migrating**: The task is running.
         * *   **Failed**: The task failed.
         * *   **Finished**: The task is completed.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The status of schema synchronization.
         */
        public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBody build() {
            return new DescribeSynchronizationObjectModifyStatusResponseBody(this);
        } 

    } 

    public static class DataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if full data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of full data synchronization. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of records that have been synchronized during full data synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status of full data synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Full data synchronization is not started.
             * *   **Migrating**: Full data synchronization is in progress.
             * *   **Failed**: Full data synchronization failed.
             * *   **Finished**: Full data synchronization is completed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataInitializationStatus build() {
                return new DataInitializationStatus(this);
            } 

        } 

    }
    public static class DataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private String delay;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataSynchronizationStatus(Builder builder) {
            this.delay = builder.delay;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public String getDelay() {
            return this.delay;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String delay; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * The synchronization latency, in seconds.
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The error message returned if incremental data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of incremental data synchronization. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The status of incremental data synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Incremental data synchronization is not started.
             * *   **Migrating**: Incremental data synchronization is in progress.
             * *   **Failed**: Incremental data synchronization failed.
             * *   **Finished**: Incremental data synchronization is completed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataSynchronizationStatus build() {
                return new DataSynchronizationStatus(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
        private String repairMethod;

        private Detail(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.errorMessage = builder.errorMessage;
            this.itemName = builder.itemName;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkStatus; 
            private String errorMessage; 
            private String itemName; 
            private String repairMethod; 

            /**
             * The precheck result. Valid values:
             * <p>
             * 
             * *   Success: The task passed the precheck.
             * *   Failed: The task failed to pass the precheck.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * The error message returned if the task failed to pass the precheck.
             * <p>
             * 
             * >  This parameter is returned only if the return value of the **CheckStatus** parameter is **Failed**.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The name of the precheck item.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * The method to fix the precheck failure.
             * <p>
             * 
             * >  This parameter is returned only if the return value of the **CheckStatus** parameter is Failed.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class PrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List < Detail> detail;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 
            private String percent; 
            private String status; 

            /**
             * The result of each precheck item.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The precheck progress. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The precheck status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrecheckStatus build() {
                return new PrecheckStatus(this);
            } 

        } 

    }
    public static class StructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if schema synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of schema synchronization. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of tables whose schemas have been synchronized.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status of schema synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Schema synchronization is not started.
             * *   **Migrating**: Schema synchronization is in progress.
             * *   **Failed**: Schema synchronization failed.
             * *   **Finished**: Schema synchronization is completed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StructureInitializationStatus build() {
                return new StructureInitializationStatus(this);
            } 

        } 

    }
}
