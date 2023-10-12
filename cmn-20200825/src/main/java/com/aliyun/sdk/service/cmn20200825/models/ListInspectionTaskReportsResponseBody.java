// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInspectionTaskReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInspectionTaskReportsResponseBody</p>
 */
public class ListInspectionTaskReportsResponseBody extends TeaModel {
    @NameInMap("InspectionTask")
    private java.util.List < InspectionTask> inspectionTask;

    @NameInMap("RequestId")
    private String requestId;

    private ListInspectionTaskReportsResponseBody(Builder builder) {
        this.inspectionTask = builder.inspectionTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInspectionTaskReportsResponseBody create() {
        return builder().build();
    }

    /**
     * @return inspectionTask
     */
    public java.util.List < InspectionTask> getInspectionTask() {
        return this.inspectionTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InspectionTask> inspectionTask; 
        private String requestId; 

        /**
         * InspectionTask.
         */
        public Builder inspectionTask(java.util.List < InspectionTask> inspectionTask) {
            this.inspectionTask = inspectionTask;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInspectionTaskReportsResponseBody build() {
            return new ListInspectionTaskReportsResponseBody(this);
        } 

    } 

    public static class AlarmStatistic extends TeaModel {
        @NameInMap("CriticalNumber")
        private Long criticalNumber;

        @NameInMap("InspectionItem")
        private String inspectionItem;

        @NameInMap("Model")
        private String model;

        @NameInMap("Vendor")
        private String vendor;

        @NameInMap("WarningNumber")
        private Long warningNumber;

        private AlarmStatistic(Builder builder) {
            this.criticalNumber = builder.criticalNumber;
            this.inspectionItem = builder.inspectionItem;
            this.model = builder.model;
            this.vendor = builder.vendor;
            this.warningNumber = builder.warningNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmStatistic create() {
            return builder().build();
        }

        /**
         * @return criticalNumber
         */
        public Long getCriticalNumber() {
            return this.criticalNumber;
        }

        /**
         * @return inspectionItem
         */
        public String getInspectionItem() {
            return this.inspectionItem;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        /**
         * @return warningNumber
         */
        public Long getWarningNumber() {
            return this.warningNumber;
        }

        public static final class Builder {
            private Long criticalNumber; 
            private String inspectionItem; 
            private String model; 
            private String vendor; 
            private Long warningNumber; 

            /**
             * CriticalNumber.
             */
            public Builder criticalNumber(Long criticalNumber) {
                this.criticalNumber = criticalNumber;
                return this;
            }

            /**
             * InspectionItem.
             */
            public Builder inspectionItem(String inspectionItem) {
                this.inspectionItem = inspectionItem;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * WarningNumber.
             */
            public Builder warningNumber(Long warningNumber) {
                this.warningNumber = warningNumber;
                return this;
            }

            public AlarmStatistic build() {
                return new AlarmStatistic(this);
            } 

        } 

    }
    public static class InspectionTask extends TeaModel {
        @NameInMap("ActualDeviceNumber")
        private Long actualDeviceNumber;

        @NameInMap("AlarmNumber")
        private Long alarmNumber;

        @NameInMap("AlarmStatistic")
        private java.util.List < AlarmStatistic> alarmStatistic;

        @NameInMap("CriticalNumber")
        private Long criticalNumber;

        @NameInMap("CriticalRate")
        private String criticalRate;

        @NameInMap("DeviceRate")
        private String deviceRate;

        @NameInMap("FailureStatistic")
        private String failureStatistic;

        @NameInMap("FailureTaskNumber")
        private Long failureTaskNumber;

        @NameInMap("FailureTaskRate")
        private String failureTaskRate;

        @NameInMap("NormalNumber")
        private Long normalNumber;

        @NameInMap("NormalRate")
        private String normalRate;

        @NameInMap("RunningTaskNumber")
        private Long runningTaskNumber;

        @NameInMap("RunningTaskRate")
        private String runningTaskRate;

        @NameInMap("SuccessTaskNumber")
        private Long successTaskNumber;

        @NameInMap("SuccessTaskRate")
        private String successTaskRate;

        @NameInMap("TaskNumber")
        private Long taskNumber;

        @NameInMap("TotalDeviceNumber")
        private Long totalDeviceNumber;

        @NameInMap("WarningNumber")
        private Long warningNumber;

        @NameInMap("WarningRate")
        private String warningRate;

        private InspectionTask(Builder builder) {
            this.actualDeviceNumber = builder.actualDeviceNumber;
            this.alarmNumber = builder.alarmNumber;
            this.alarmStatistic = builder.alarmStatistic;
            this.criticalNumber = builder.criticalNumber;
            this.criticalRate = builder.criticalRate;
            this.deviceRate = builder.deviceRate;
            this.failureStatistic = builder.failureStatistic;
            this.failureTaskNumber = builder.failureTaskNumber;
            this.failureTaskRate = builder.failureTaskRate;
            this.normalNumber = builder.normalNumber;
            this.normalRate = builder.normalRate;
            this.runningTaskNumber = builder.runningTaskNumber;
            this.runningTaskRate = builder.runningTaskRate;
            this.successTaskNumber = builder.successTaskNumber;
            this.successTaskRate = builder.successTaskRate;
            this.taskNumber = builder.taskNumber;
            this.totalDeviceNumber = builder.totalDeviceNumber;
            this.warningNumber = builder.warningNumber;
            this.warningRate = builder.warningRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionTask create() {
            return builder().build();
        }

        /**
         * @return actualDeviceNumber
         */
        public Long getActualDeviceNumber() {
            return this.actualDeviceNumber;
        }

        /**
         * @return alarmNumber
         */
        public Long getAlarmNumber() {
            return this.alarmNumber;
        }

        /**
         * @return alarmStatistic
         */
        public java.util.List < AlarmStatistic> getAlarmStatistic() {
            return this.alarmStatistic;
        }

        /**
         * @return criticalNumber
         */
        public Long getCriticalNumber() {
            return this.criticalNumber;
        }

        /**
         * @return criticalRate
         */
        public String getCriticalRate() {
            return this.criticalRate;
        }

        /**
         * @return deviceRate
         */
        public String getDeviceRate() {
            return this.deviceRate;
        }

        /**
         * @return failureStatistic
         */
        public String getFailureStatistic() {
            return this.failureStatistic;
        }

        /**
         * @return failureTaskNumber
         */
        public Long getFailureTaskNumber() {
            return this.failureTaskNumber;
        }

        /**
         * @return failureTaskRate
         */
        public String getFailureTaskRate() {
            return this.failureTaskRate;
        }

        /**
         * @return normalNumber
         */
        public Long getNormalNumber() {
            return this.normalNumber;
        }

        /**
         * @return normalRate
         */
        public String getNormalRate() {
            return this.normalRate;
        }

        /**
         * @return runningTaskNumber
         */
        public Long getRunningTaskNumber() {
            return this.runningTaskNumber;
        }

        /**
         * @return runningTaskRate
         */
        public String getRunningTaskRate() {
            return this.runningTaskRate;
        }

        /**
         * @return successTaskNumber
         */
        public Long getSuccessTaskNumber() {
            return this.successTaskNumber;
        }

        /**
         * @return successTaskRate
         */
        public String getSuccessTaskRate() {
            return this.successTaskRate;
        }

        /**
         * @return taskNumber
         */
        public Long getTaskNumber() {
            return this.taskNumber;
        }

        /**
         * @return totalDeviceNumber
         */
        public Long getTotalDeviceNumber() {
            return this.totalDeviceNumber;
        }

        /**
         * @return warningNumber
         */
        public Long getWarningNumber() {
            return this.warningNumber;
        }

        /**
         * @return warningRate
         */
        public String getWarningRate() {
            return this.warningRate;
        }

        public static final class Builder {
            private Long actualDeviceNumber; 
            private Long alarmNumber; 
            private java.util.List < AlarmStatistic> alarmStatistic; 
            private Long criticalNumber; 
            private String criticalRate; 
            private String deviceRate; 
            private String failureStatistic; 
            private Long failureTaskNumber; 
            private String failureTaskRate; 
            private Long normalNumber; 
            private String normalRate; 
            private Long runningTaskNumber; 
            private String runningTaskRate; 
            private Long successTaskNumber; 
            private String successTaskRate; 
            private Long taskNumber; 
            private Long totalDeviceNumber; 
            private Long warningNumber; 
            private String warningRate; 

            /**
             * ActualDeviceNumber.
             */
            public Builder actualDeviceNumber(Long actualDeviceNumber) {
                this.actualDeviceNumber = actualDeviceNumber;
                return this;
            }

            /**
             * AlarmNumber.
             */
            public Builder alarmNumber(Long alarmNumber) {
                this.alarmNumber = alarmNumber;
                return this;
            }

            /**
             * AlarmStatistic.
             */
            public Builder alarmStatistic(java.util.List < AlarmStatistic> alarmStatistic) {
                this.alarmStatistic = alarmStatistic;
                return this;
            }

            /**
             * CriticalNumber.
             */
            public Builder criticalNumber(Long criticalNumber) {
                this.criticalNumber = criticalNumber;
                return this;
            }

            /**
             * CriticalRate.
             */
            public Builder criticalRate(String criticalRate) {
                this.criticalRate = criticalRate;
                return this;
            }

            /**
             * DeviceRate.
             */
            public Builder deviceRate(String deviceRate) {
                this.deviceRate = deviceRate;
                return this;
            }

            /**
             * FailureStatistic.
             */
            public Builder failureStatistic(String failureStatistic) {
                this.failureStatistic = failureStatistic;
                return this;
            }

            /**
             * FailureTaskNumber.
             */
            public Builder failureTaskNumber(Long failureTaskNumber) {
                this.failureTaskNumber = failureTaskNumber;
                return this;
            }

            /**
             * FailureTaskRate.
             */
            public Builder failureTaskRate(String failureTaskRate) {
                this.failureTaskRate = failureTaskRate;
                return this;
            }

            /**
             * NormalNumber.
             */
            public Builder normalNumber(Long normalNumber) {
                this.normalNumber = normalNumber;
                return this;
            }

            /**
             * NormalRate.
             */
            public Builder normalRate(String normalRate) {
                this.normalRate = normalRate;
                return this;
            }

            /**
             * RunningTaskNumber.
             */
            public Builder runningTaskNumber(Long runningTaskNumber) {
                this.runningTaskNumber = runningTaskNumber;
                return this;
            }

            /**
             * RunningTaskRate.
             */
            public Builder runningTaskRate(String runningTaskRate) {
                this.runningTaskRate = runningTaskRate;
                return this;
            }

            /**
             * SuccessTaskNumber.
             */
            public Builder successTaskNumber(Long successTaskNumber) {
                this.successTaskNumber = successTaskNumber;
                return this;
            }

            /**
             * SuccessTaskRate.
             */
            public Builder successTaskRate(String successTaskRate) {
                this.successTaskRate = successTaskRate;
                return this;
            }

            /**
             * TaskNumber.
             */
            public Builder taskNumber(Long taskNumber) {
                this.taskNumber = taskNumber;
                return this;
            }

            /**
             * TotalDeviceNumber.
             */
            public Builder totalDeviceNumber(Long totalDeviceNumber) {
                this.totalDeviceNumber = totalDeviceNumber;
                return this;
            }

            /**
             * WarningNumber.
             */
            public Builder warningNumber(Long warningNumber) {
                this.warningNumber = warningNumber;
                return this;
            }

            /**
             * WarningRate.
             */
            public Builder warningRate(String warningRate) {
                this.warningRate = warningRate;
                return this;
            }

            public InspectionTask build() {
                return new InspectionTask(this);
            } 

        } 

    }
}
