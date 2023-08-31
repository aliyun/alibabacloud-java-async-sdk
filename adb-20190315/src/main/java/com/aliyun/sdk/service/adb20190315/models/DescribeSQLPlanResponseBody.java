// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLPlanResponseBody</p>
 */
public class DescribeSQLPlanResponseBody extends TeaModel {
    @NameInMap("Detail")
    private Detail detail;

    @NameInMap("OriginInfo")
    private String originInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StageList")
    private java.util.List < StageList> stageList;

    private DescribeSQLPlanResponseBody(Builder builder) {
        this.detail = builder.detail;
        this.originInfo = builder.originInfo;
        this.requestId = builder.requestId;
        this.stageList = builder.stageList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return detail
     */
    public Detail getDetail() {
        return this.detail;
    }

    /**
     * @return originInfo
     */
    public String getOriginInfo() {
        return this.originInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stageList
     */
    public java.util.List < StageList> getStageList() {
        return this.stageList;
    }

    public static final class Builder {
        private Detail detail; 
        private String originInfo; 
        private String requestId; 
        private java.util.List < StageList> stageList; 

        /**
         * Details about the execution of the SQL statement.
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * The original details of the SQL statement.
         */
        public Builder originInfo(String originInfo) {
            this.originInfo = originInfo;
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
         * Details about the plan stages.
         */
        public Builder stageList(java.util.List < StageList> stageList) {
            this.stageList = stageList;
            return this;
        }

        public DescribeSQLPlanResponseBody build() {
            return new DescribeSQLPlanResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @NameInMap("CPUTime")
        private Long CPUTime;

        @NameInMap("ClientIP")
        private String clientIP;

        @NameInMap("Database")
        private String database;

        @NameInMap("OutputRows")
        private Long outputRows;

        @NameInMap("OutputSize")
        private Long outputSize;

        @NameInMap("PeakMemory")
        private Long peakMemory;

        @NameInMap("PlanningTime")
        private Long planningTime;

        @NameInMap("QueuedTime")
        private Long queuedTime;

        @NameInMap("SQL")
        private String SQL;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("TotalStage")
        private Long totalStage;

        @NameInMap("TotalTask")
        private Long totalTask;

        @NameInMap("TotalTime")
        private Long totalTime;

        @NameInMap("User")
        private String user;

        private Detail(Builder builder) {
            this.CPUTime = builder.CPUTime;
            this.clientIP = builder.clientIP;
            this.database = builder.database;
            this.outputRows = builder.outputRows;
            this.outputSize = builder.outputSize;
            this.peakMemory = builder.peakMemory;
            this.planningTime = builder.planningTime;
            this.queuedTime = builder.queuedTime;
            this.SQL = builder.SQL;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.totalStage = builder.totalStage;
            this.totalTask = builder.totalTask;
            this.totalTime = builder.totalTime;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return CPUTime
         */
        public Long getCPUTime() {
            return this.CPUTime;
        }

        /**
         * @return clientIP
         */
        public String getClientIP() {
            return this.clientIP;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return outputRows
         */
        public Long getOutputRows() {
            return this.outputRows;
        }

        /**
         * @return outputSize
         */
        public Long getOutputSize() {
            return this.outputSize;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return planningTime
         */
        public Long getPlanningTime() {
            return this.planningTime;
        }

        /**
         * @return queuedTime
         */
        public Long getQueuedTime() {
            return this.queuedTime;
        }

        /**
         * @return SQL
         */
        public String getSQL() {
            return this.SQL;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return totalStage
         */
        public Long getTotalStage() {
            return this.totalStage;
        }

        /**
         * @return totalTask
         */
        public Long getTotalTask() {
            return this.totalTask;
        }

        /**
         * @return totalTime
         */
        public Long getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Long CPUTime; 
            private String clientIP; 
            private String database; 
            private Long outputRows; 
            private Long outputSize; 
            private Long peakMemory; 
            private Long planningTime; 
            private Long queuedTime; 
            private String SQL; 
            private String startTime; 
            private String state; 
            private Long totalStage; 
            private Long totalTask; 
            private Long totalTime; 
            private String user; 

            /**
             * The total CPU time consumed by all operators on multithreaded servers when the SQL statement is executed. Unit: milliseconds.
             */
            public Builder CPUTime(Long CPUTime) {
                this.CPUTime = CPUTime;
                return this;
            }

            /**
             * The IP address of the client that is used to execute the SQL statement.
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * The name of the database on which the SQL statement is executed.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The total number of rows generated by the SQL statement.
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * The total amount of data generated by the SQL statement. Unit: byte.
             */
            public Builder outputSize(Long outputSize) {
                this.outputSize = outputSize;
                return this;
            }

            /**
             * The maximum memory usage when the SQL statement is executed. Unit: byte.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * The time when the execution plan of the SQL statement is generated. Unit: milliseconds.
             */
            public Builder planningTime(Long planningTime) {
                this.planningTime = planningTime;
                return this;
            }

            /**
             * The amount of time that the SQL statement is queued before it is executed. Unit: milliseconds.
             */
            public Builder queuedTime(Long queuedTime) {
                this.queuedTime = queuedTime;
                return this;
            }

            /**
             * The SQL statement.
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * The beginning of the time range in which the SQL statement is executed. The time is in the UNIX timestamp format. Unit: milliseconds.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The final execution state of the SQL statement. Valid values:
             * <p>
             * 
             * *   FINISHED
             * *   FAILED
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The total number of stages in the SQL statement.
             */
            public Builder totalStage(Long totalStage) {
                this.totalStage = totalStage;
                return this;
            }

            /**
             * The total number of tasks in the SQL statement.
             */
            public Builder totalTask(Long totalTask) {
                this.totalTask = totalTask;
                return this;
            }

            /**
             * The time consumed to execute the SQL statement. Unit: milliseconds.
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * The name of the user who submitted the SQL statement.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class StageList extends TeaModel {
        @NameInMap("CPUTimeAvg")
        private Long CPUTimeAvg;

        @NameInMap("CPUTimeMax")
        private Long CPUTimeMax;

        @NameInMap("CPUTimeMin")
        private Long CPUTimeMin;

        @NameInMap("InputSizeAvg")
        private Long inputSizeAvg;

        @NameInMap("InputSizeMax")
        private Long inputSizeMax;

        @NameInMap("InputSizeMin")
        private Long inputSizeMin;

        @NameInMap("OperatorCost")
        private Long operatorCost;

        @NameInMap("PeakMemory")
        private Long peakMemory;

        @NameInMap("ScanSizeAvg")
        private Long scanSizeAvg;

        @NameInMap("ScanSizeMax")
        private Long scanSizeMax;

        @NameInMap("ScanSizeMin")
        private Long scanSizeMin;

        @NameInMap("ScanTimeAvg")
        private Long scanTimeAvg;

        @NameInMap("ScanTimeMax")
        private Long scanTimeMax;

        @NameInMap("ScanTimeMin")
        private Long scanTimeMin;

        @NameInMap("StageId")
        private Integer stageId;

        @NameInMap("State")
        private String state;

        private StageList(Builder builder) {
            this.CPUTimeAvg = builder.CPUTimeAvg;
            this.CPUTimeMax = builder.CPUTimeMax;
            this.CPUTimeMin = builder.CPUTimeMin;
            this.inputSizeAvg = builder.inputSizeAvg;
            this.inputSizeMax = builder.inputSizeMax;
            this.inputSizeMin = builder.inputSizeMin;
            this.operatorCost = builder.operatorCost;
            this.peakMemory = builder.peakMemory;
            this.scanSizeAvg = builder.scanSizeAvg;
            this.scanSizeMax = builder.scanSizeMax;
            this.scanSizeMin = builder.scanSizeMin;
            this.scanTimeAvg = builder.scanTimeAvg;
            this.scanTimeMax = builder.scanTimeMax;
            this.scanTimeMin = builder.scanTimeMin;
            this.stageId = builder.stageId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageList create() {
            return builder().build();
        }

        /**
         * @return CPUTimeAvg
         */
        public Long getCPUTimeAvg() {
            return this.CPUTimeAvg;
        }

        /**
         * @return CPUTimeMax
         */
        public Long getCPUTimeMax() {
            return this.CPUTimeMax;
        }

        /**
         * @return CPUTimeMin
         */
        public Long getCPUTimeMin() {
            return this.CPUTimeMin;
        }

        /**
         * @return inputSizeAvg
         */
        public Long getInputSizeAvg() {
            return this.inputSizeAvg;
        }

        /**
         * @return inputSizeMax
         */
        public Long getInputSizeMax() {
            return this.inputSizeMax;
        }

        /**
         * @return inputSizeMin
         */
        public Long getInputSizeMin() {
            return this.inputSizeMin;
        }

        /**
         * @return operatorCost
         */
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return scanSizeAvg
         */
        public Long getScanSizeAvg() {
            return this.scanSizeAvg;
        }

        /**
         * @return scanSizeMax
         */
        public Long getScanSizeMax() {
            return this.scanSizeMax;
        }

        /**
         * @return scanSizeMin
         */
        public Long getScanSizeMin() {
            return this.scanSizeMin;
        }

        /**
         * @return scanTimeAvg
         */
        public Long getScanTimeAvg() {
            return this.scanTimeAvg;
        }

        /**
         * @return scanTimeMax
         */
        public Long getScanTimeMax() {
            return this.scanTimeMax;
        }

        /**
         * @return scanTimeMin
         */
        public Long getScanTimeMin() {
            return this.scanTimeMin;
        }

        /**
         * @return stageId
         */
        public Integer getStageId() {
            return this.stageId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long CPUTimeAvg; 
            private Long CPUTimeMax; 
            private Long CPUTimeMin; 
            private Long inputSizeAvg; 
            private Long inputSizeMax; 
            private Long inputSizeMin; 
            private Long operatorCost; 
            private Long peakMemory; 
            private Long scanSizeAvg; 
            private Long scanSizeMax; 
            private Long scanSizeMin; 
            private Long scanTimeAvg; 
            private Long scanTimeMax; 
            private Long scanTimeMin; 
            private Integer stageId; 
            private String state; 

            /**
             * The average `CPU Time` value on each compute node in the stage. Unit: milliseconds.
             */
            public Builder CPUTimeAvg(Long CPUTimeAvg) {
                this.CPUTimeAvg = CPUTimeAvg;
                return this;
            }

            /**
             * The maximum `CPU Time` value on each compute node in the stage. Unit: milliseconds.
             */
            public Builder CPUTimeMax(Long CPUTimeMax) {
                this.CPUTimeMax = CPUTimeMax;
                return this;
            }

            /**
             * The minimum `CPU Time` value on each compute node in the stage. Unit: milliseconds.
             */
            public Builder CPUTimeMin(Long CPUTimeMin) {
                this.CPUTimeMin = CPUTimeMin;
                return this;
            }

            /**
             * The average amount of input data on each compute node in the stage. Unit: byte.
             */
            public Builder inputSizeAvg(Long inputSizeAvg) {
                this.inputSizeAvg = inputSizeAvg;
                return this;
            }

            /**
             * The maximum amount of input data on each compute node in the stage. Unit: byte.
             */
            public Builder inputSizeMax(Long inputSizeMax) {
                this.inputSizeMax = inputSizeMax;
                return this;
            }

            /**
             * The minimum amount of input data on each compute node in the stage. Unit: byte.
             */
            public Builder inputSizeMin(Long inputSizeMin) {
                this.inputSizeMin = inputSizeMin;
                return this;
            }

            /**
             * The total CPU time consumed by all operators in the stage, which is equivalent to the total CPU time of the stage. You can use this parameter to determine which parts of the stage consume a large amount of computing resources. Unit: milliseconds.
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * The maximum memory usage when the SQL statement is executed. Unit: byte.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * The average amount of data scanned by a scan operator on each storage node in the stage. Unit: byte.
             */
            public Builder scanSizeAvg(Long scanSizeAvg) {
                this.scanSizeAvg = scanSizeAvg;
                return this;
            }

            /**
             * The maximum amount of data scanned by a scan operator on each storage node in the stage. Unit: byte.
             */
            public Builder scanSizeMax(Long scanSizeMax) {
                this.scanSizeMax = scanSizeMax;
                return this;
            }

            /**
             * The minimum amount of data scanned by a scan operator on each storage node in the stage. Unit: byte.
             */
            public Builder scanSizeMin(Long scanSizeMin) {
                this.scanSizeMin = scanSizeMin;
                return this;
            }

            /**
             * The average amount of time consumed by a scan operator to read data on each storage node in the stage. Unit: milliseconds.
             */
            public Builder scanTimeAvg(Long scanTimeAvg) {
                this.scanTimeAvg = scanTimeAvg;
                return this;
            }

            /**
             * The maximum amount of time consumed by a scan operator to read data on each storage node in the stage. Unit: milliseconds.
             */
            public Builder scanTimeMax(Long scanTimeMax) {
                this.scanTimeMax = scanTimeMax;
                return this;
            }

            /**
             * The minimum amount of time consumed by a scan operator to read data on each storage node in the stage. Unit: milliseconds.
             */
            public Builder scanTimeMin(Long scanTimeMin) {
                this.scanTimeMin = scanTimeMin;
                return this;
            }

            /**
             * The ID of the stage.
             */
            public Builder stageId(Integer stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * The final execution state of the stage. Valid values:
             * <p>
             * 
             * *   FINISHED
             * *   CANCELED
             * *   ABORTED
             * *   FAILED
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public StageList build() {
                return new StageList(this);
            } 

        } 

    }
}
