// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVirusScanLatestTaskStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetVirusScanLatestTaskStatisticResponseBody</p>
 */
public class GetVirusScanLatestTaskStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVirusScanLatestTaskStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVirusScanLatestTaskStatisticResponseBody create() {
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
         * The information about the virus scan task.
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

        public GetVirusScanLatestTaskStatisticResponseBody build() {
            return new GetVirusScanLatestTaskStatisticResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteMachine")
        private Integer completeMachine;

        @com.aliyun.core.annotation.NameInMap("MachineName")
        private String machineName;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SafeMachine")
        private Integer safeMachine;

        @com.aliyun.core.annotation.NameInMap("ScanMachine")
        private Integer scanMachine;

        @com.aliyun.core.annotation.NameInMap("ScanPath")
        private java.util.List < String > scanPath;

        @com.aliyun.core.annotation.NameInMap("ScanTime")
        private Long scanTime;

        @com.aliyun.core.annotation.NameInMap("ScanType")
        private String scanType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SuspiciousCount")
        private Integer suspiciousCount;

        @com.aliyun.core.annotation.NameInMap("SuspiciousMachine")
        private Integer suspiciousMachine;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UnCompleteMachine")
        private Integer unCompleteMachine;

        private Data(Builder builder) {
            this.completeMachine = builder.completeMachine;
            this.machineName = builder.machineName;
            this.progress = builder.progress;
            this.riskLevel = builder.riskLevel;
            this.safeMachine = builder.safeMachine;
            this.scanMachine = builder.scanMachine;
            this.scanPath = builder.scanPath;
            this.scanTime = builder.scanTime;
            this.scanType = builder.scanType;
            this.status = builder.status;
            this.suspiciousCount = builder.suspiciousCount;
            this.suspiciousMachine = builder.suspiciousMachine;
            this.taskId = builder.taskId;
            this.unCompleteMachine = builder.unCompleteMachine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completeMachine
         */
        public Integer getCompleteMachine() {
            return this.completeMachine;
        }

        /**
         * @return machineName
         */
        public String getMachineName() {
            return this.machineName;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return safeMachine
         */
        public Integer getSafeMachine() {
            return this.safeMachine;
        }

        /**
         * @return scanMachine
         */
        public Integer getScanMachine() {
            return this.scanMachine;
        }

        /**
         * @return scanPath
         */
        public java.util.List < String > getScanPath() {
            return this.scanPath;
        }

        /**
         * @return scanTime
         */
        public Long getScanTime() {
            return this.scanTime;
        }

        /**
         * @return scanType
         */
        public String getScanType() {
            return this.scanType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return suspiciousCount
         */
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

        /**
         * @return suspiciousMachine
         */
        public Integer getSuspiciousMachine() {
            return this.suspiciousMachine;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return unCompleteMachine
         */
        public Integer getUnCompleteMachine() {
            return this.unCompleteMachine;
        }

        public static final class Builder {
            private Integer completeMachine; 
            private String machineName; 
            private String progress; 
            private String riskLevel; 
            private Integer safeMachine; 
            private Integer scanMachine; 
            private java.util.List < String > scanPath; 
            private Long scanTime; 
            private String scanType; 
            private Integer status; 
            private Integer suspiciousCount; 
            private Integer suspiciousMachine; 
            private String taskId; 
            private Integer unCompleteMachine; 

            /**
             * The number of machines on which the virus scan task is complete.
             */
            public Builder completeMachine(Integer completeMachine) {
                this.completeMachine = completeMachine;
                return this;
            }

            /**
             * The name of the machine.
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * The progress of the virus scan task in percentage.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The highest risk level of the detected alerts. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The number of safe machines that are detected.
             */
            public Builder safeMachine(Integer safeMachine) {
                this.safeMachine = safeMachine;
                return this;
            }

            /**
             * The number of machines that are scanned.
             */
            public Builder scanMachine(Integer scanMachine) {
                this.scanMachine = scanMachine;
                return this;
            }

            /**
             * The paths of files that were scanned. This value is returned only when ScanType is set to user.
             */
            public Builder scanPath(java.util.List < String > scanPath) {
                this.scanPath = scanPath;
                return this;
            }

            /**
             * The timestamp generated when the virus scan task was performed. Unit: milliseconds.
             */
            public Builder scanTime(Long scanTime) {
                this.scanTime = scanTime;
                return this;
            }

            /**
             * The type of the virus scan. Valid values:
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
             * The status of the virus scan task.
             * <p>
             * 
             * **Valid values for a main task**:
             * 
             * *   **0**: The main task is to be started.
             * *   **10**: The main task is running.
             * *   **100**: The main task is complete.
             * 
             * **Valid values for a subtask**:
             * 
             * *   **0**: The subtask is to be started.
             * *   **20**: The scan script is sent.
             * *   **50**: The subtask is running.
             * *   **100**: The subtask is complete.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The number of alerts that are detected.
             */
            public Builder suspiciousCount(Integer suspiciousCount) {
                this.suspiciousCount = suspiciousCount;
                return this;
            }

            /**
             * The number of suspicious machines that are detected.
             */
            public Builder suspiciousMachine(Integer suspiciousMachine) {
                this.suspiciousMachine = suspiciousMachine;
                return this;
            }

            /**
             * The ID of the virus scan task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The number of machines on which the virus scan task was not complete or failed.
             */
            public Builder unCompleteMachine(Integer unCompleteMachine) {
                this.unCompleteMachine = unCompleteMachine;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
