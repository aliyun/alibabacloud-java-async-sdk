// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVirusScanConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetVirusScanConfigResponseBody</p>
 */
public class GetVirusScanConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVirusScanConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVirusScanConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned if the request was successful.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVirusScanConfigResponseBody build() {
            return new GetVirusScanConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("IntervalPeriod")
        private Integer intervalPeriod;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("ScanPath")
        private java.util.List < String > scanPath;

        @com.aliyun.core.annotation.NameInMap("ScanType")
        private String scanType;

        @com.aliyun.core.annotation.NameInMap("SelectionKey")
        private String selectionKey;

        @com.aliyun.core.annotation.NameInMap("TargetEndTime")
        private Integer targetEndTime;

        @com.aliyun.core.annotation.NameInMap("TargetStartTime")
        private Integer targetStartTime;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Data(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.intervalPeriod = builder.intervalPeriod;
            this.periodUnit = builder.periodUnit;
            this.scanPath = builder.scanPath;
            this.scanType = builder.scanType;
            this.selectionKey = builder.selectionKey;
            this.targetEndTime = builder.targetEndTime;
            this.targetStartTime = builder.targetStartTime;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return intervalPeriod
         */
        public Integer getIntervalPeriod() {
            return this.intervalPeriod;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return scanPath
         */
        public java.util.List < String > getScanPath() {
            return this.scanPath;
        }

        /**
         * @return scanType
         */
        public String getScanType() {
            return this.scanType;
        }

        /**
         * @return selectionKey
         */
        public String getSelectionKey() {
            return this.selectionKey;
        }

        /**
         * @return targetEndTime
         */
        public Integer getTargetEndTime() {
            return this.targetEndTime;
        }

        /**
         * @return targetStartTime
         */
        public Integer getTargetStartTime() {
            return this.targetStartTime;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String configId; 
            private Integer enable; 
            private Integer intervalPeriod; 
            private String periodUnit; 
            private java.util.List < String > scanPath; 
            private String scanType; 
            private String selectionKey; 
            private Integer targetEndTime; 
            private Integer targetStartTime; 
            private String taskType; 

            /**
             * The ID of the task configuration.
             * <p>
             * 
             * > You can call the [DescribeCycleTaskList](~~DescribeCycleTaskList~~) operation to query the IDs of task configurations.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Indicates whether the periodic scan feature is enabled. Valid value:
             * <p>
             * 
             * *   **1**: The feature is enabled
             * *   **0**: The feature is disabled.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The interval at which virus scan tasks are run.
             */
            public Builder intervalPeriod(Integer intervalPeriod) {
                this.intervalPeriod = intervalPeriod;
                return this;
            }

            /**
             * The unit of the interval at which virus scan tasks are run.
             * <p>
             * 
             * *   The value is fixed as **day**.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The file paths.
             */
            public Builder scanPath(java.util.List < String > scanPath) {
                this.scanPath = scanPath;
                return this;
            }

            /**
             * The type of the virus scan task. Valid values:
             * <p>
             * 
             * *   **system**: automatic scan.
             * *   **user**: custom scan.
             */
            public Builder scanType(String scanType) {
                this.scanType = scanType;
                return this;
            }

            /**
             * The key that stores the asset information.
             * <p>
             * 
             * > You can call the [GetAssetSelectionConfig](~~GetAssetSelectionConfig~~) operation to obtain the key value.
             */
            public Builder selectionKey(String selectionKey) {
                this.selectionKey = selectionKey;
                return this;
            }

            /**
             * The end time of the virus scan task. The time is a time frame.
             */
            public Builder targetEndTime(Integer targetEndTime) {
                this.targetEndTime = targetEndTime;
                return this;
            }

            /**
             * The start time of the virus scan task. The time is a time frame.
             */
            public Builder targetStartTime(Integer targetStartTime) {
                this.targetStartTime = targetStartTime;
                return this;
            }

            /**
             * The type of the task. Valid value:
             * <p>
             * 
             * *   **VIRUS_VUL_SCHEDULE_SCAN**: a virus scan task.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
