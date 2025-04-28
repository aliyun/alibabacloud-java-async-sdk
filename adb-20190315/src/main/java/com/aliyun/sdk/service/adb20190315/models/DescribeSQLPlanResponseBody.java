// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeSQLPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLPlanResponseBody</p>
 */
public class DescribeSQLPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Detail")
    private Detail detail;

    @com.aliyun.core.annotation.NameInMap("OriginInfo")
    private String originInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StageList")
    private java.util.List<StageList> stageList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<StageList> getStageList() {
        return this.stageList;
    }

    public static final class Builder {
        private Detail detail; 
        private String originInfo; 
        private String requestId; 
        private java.util.List<StageList> stageList; 

        private Builder() {
        } 

        private Builder(DescribeSQLPlanResponseBody model) {
            this.detail = model.detail;
            this.originInfo = model.originInfo;
            this.requestId = model.requestId;
            this.stageList = model.stageList;
        } 

        /**
         * <p>The execution information about the SQL statement.</p>
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The original information about the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;queryId&quot;:&quot;20210527_160443_10581_hdhzr&quot;,&quot;session&quot;:{&quot;queryId&quot;:&quot;20210527_160443_10581_hdhzr&quot;,&quot;hasSharedStage&quot;:false,&quot;parentId&quot;:0}}</p>
         */
        public Builder originInfo(String originInfo) {
            this.originInfo = originInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22D6DEF0-CBC7-4388-A41C-D5FD62******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried plan in different stages.</p>
         */
        public Builder stageList(java.util.List<StageList> stageList) {
            this.stageList = stageList;
            return this;
        }

        public DescribeSQLPlanResponseBody build() {
            return new DescribeSQLPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLPlanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLPlanResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPUTime")
        private Long CPUTime;

        @com.aliyun.core.annotation.NameInMap("ClientIP")
        private String clientIP;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("OutputRows")
        private Long outputRows;

        @com.aliyun.core.annotation.NameInMap("OutputSize")
        private Long outputSize;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("PlanningTime")
        private Long planningTime;

        @com.aliyun.core.annotation.NameInMap("QueuedTime")
        private Long queuedTime;

        @com.aliyun.core.annotation.NameInMap("SQL")
        private String SQL;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TotalStage")
        private Long totalStage;

        @com.aliyun.core.annotation.NameInMap("TotalTask")
        private Long totalTask;

        @com.aliyun.core.annotation.NameInMap("TotalTime")
        private Long totalTime;

        @com.aliyun.core.annotation.NameInMap("User")
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

            private Builder() {
            } 

            private Builder(Detail model) {
                this.CPUTime = model.CPUTime;
                this.clientIP = model.clientIP;
                this.database = model.database;
                this.outputRows = model.outputRows;
                this.outputSize = model.outputSize;
                this.peakMemory = model.peakMemory;
                this.planningTime = model.planningTime;
                this.queuedTime = model.queuedTime;
                this.SQL = model.SQL;
                this.startTime = model.startTime;
                this.state = model.state;
                this.totalStage = model.totalStage;
                this.totalTask = model.totalTask;
                this.totalTime = model.totalTime;
                this.user = model.user;
            } 

            /**
             * <p>The total CPU time consumed by all operators on multithreaded servers when the SQL statement is executed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>6100</p>
             */
            public Builder CPUTime(Long CPUTime) {
                this.CPUTime = CPUTime;
                return this;
            }

            /**
             * <p>The IP address of the client that is used to execute the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.<em><strong>.</strong></em></p>
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * <p>The name of the database on which the SQL statement was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>adb_demo</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The total number of rows generated by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * <p>The total amount of data generated by the SQL statement. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder outputSize(Long outputSize) {
                this.outputSize = outputSize;
                return this;
            }

            /**
             * <p>The maximum memory usage when the SQL statement is executed. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>441802</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The amount of time consumed to generate the execution plan of the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder planningTime(Long planningTime) {
                this.planningTime = planningTime;
                return this;
            }

            /**
             * <p>The amount of time consumed to queue the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queuedTime(Long queuedTime) {
                this.queuedTime = queuedTime;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>INSERT OVERWRITE INTO hdfs_import_external\nSELECT *\nFROM adb_hdfs_import_source</p>
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * <p>The execution start time of the SQL statement. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1622102683243</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The final execution state of the SQL statement. Valid values:</p>
             * <ul>
             * <li>FINISHED</li>
             * <li>FAILED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The total number of stages in the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalStage(Long totalStage) {
                this.totalStage = totalStage;
                return this;
            }

            /**
             * <p>The total number of tasks in the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalTask(Long totalTask) {
                this.totalTask = totalTask;
                return this;
            }

            /**
             * <p>The total amount of time consumed to execute the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2340</p>
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * <p>The name of the user who submitted the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>test_acc</p>
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
    /**
     * 
     * {@link DescribeSQLPlanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLPlanResponseBody</p>
     */
    public static class StageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPUTimeAvg")
        private Long CPUTimeAvg;

        @com.aliyun.core.annotation.NameInMap("CPUTimeMax")
        private Long CPUTimeMax;

        @com.aliyun.core.annotation.NameInMap("CPUTimeMin")
        private Long CPUTimeMin;

        @com.aliyun.core.annotation.NameInMap("InputSizeAvg")
        private Long inputSizeAvg;

        @com.aliyun.core.annotation.NameInMap("InputSizeMax")
        private Long inputSizeMax;

        @com.aliyun.core.annotation.NameInMap("InputSizeMin")
        private Long inputSizeMin;

        @com.aliyun.core.annotation.NameInMap("OperatorCost")
        private Long operatorCost;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("ScanSizeAvg")
        private Long scanSizeAvg;

        @com.aliyun.core.annotation.NameInMap("ScanSizeMax")
        private Long scanSizeMax;

        @com.aliyun.core.annotation.NameInMap("ScanSizeMin")
        private Long scanSizeMin;

        @com.aliyun.core.annotation.NameInMap("ScanTimeAvg")
        private Long scanTimeAvg;

        @com.aliyun.core.annotation.NameInMap("ScanTimeMax")
        private Long scanTimeMax;

        @com.aliyun.core.annotation.NameInMap("ScanTimeMin")
        private Long scanTimeMin;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private Integer stageId;

        @com.aliyun.core.annotation.NameInMap("State")
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

            private Builder() {
            } 

            private Builder(StageList model) {
                this.CPUTimeAvg = model.CPUTimeAvg;
                this.CPUTimeMax = model.CPUTimeMax;
                this.CPUTimeMin = model.CPUTimeMin;
                this.inputSizeAvg = model.inputSizeAvg;
                this.inputSizeMax = model.inputSizeMax;
                this.inputSizeMin = model.inputSizeMin;
                this.operatorCost = model.operatorCost;
                this.peakMemory = model.peakMemory;
                this.scanSizeAvg = model.scanSizeAvg;
                this.scanSizeMax = model.scanSizeMax;
                this.scanSizeMin = model.scanSizeMin;
                this.scanTimeAvg = model.scanTimeAvg;
                this.scanTimeMax = model.scanTimeMax;
                this.scanTimeMin = model.scanTimeMin;
                this.stageId = model.stageId;
                this.state = model.state;
            } 

            /**
             * <p>The average <code>CPU Time</code> value on each compute node in the stage. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5984</p>
             */
            public Builder CPUTimeAvg(Long CPUTimeAvg) {
                this.CPUTimeAvg = CPUTimeAvg;
                return this;
            }

            /**
             * <p>The maximum <code>CPU Time</code> value on each compute node in the stage. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5984</p>
             */
            public Builder CPUTimeMax(Long CPUTimeMax) {
                this.CPUTimeMax = CPUTimeMax;
                return this;
            }

            /**
             * <p>The minimum <code>CPU Time</code> value on each compute node in the stage. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder CPUTimeMin(Long CPUTimeMin) {
                this.CPUTimeMin = CPUTimeMin;
                return this;
            }

            /**
             * <p>The average amount of input data on each compute node in the stage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>173</p>
             */
            public Builder inputSizeAvg(Long inputSizeAvg) {
                this.inputSizeAvg = inputSizeAvg;
                return this;
            }

            /**
             * <p>The maximum amount of input data on each compute node in the stage. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>173</p>
             */
            public Builder inputSizeMax(Long inputSizeMax) {
                this.inputSizeMax = inputSizeMax;
                return this;
            }

            /**
             * <p>The minimum amount of input data on each compute node in the stage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>173</p>
             */
            public Builder inputSizeMin(Long inputSizeMin) {
                this.inputSizeMin = inputSizeMin;
                return this;
            }

            /**
             * <p>The total CPU time consumed by all operators in the stage, which is equivalent to the total CPU time of the stage. You can use this parameter to determine which parts of the stage consume a large amount of computing resources. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5984</p>
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * <p>The maximum memory usage when the SQL statement is executed. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>74208</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The average amount of data scanned by a scan operator on each storage node in the stage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanSizeAvg(Long scanSizeAvg) {
                this.scanSizeAvg = scanSizeAvg;
                return this;
            }

            /**
             * <p>The maximum amount of data scanned by a scan operator on each storage node in the stage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanSizeMax(Long scanSizeMax) {
                this.scanSizeMax = scanSizeMax;
                return this;
            }

            /**
             * <p>The minimum amount of data scanned by a scan operator on each storage node in the stage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanSizeMin(Long scanSizeMin) {
                this.scanSizeMin = scanSizeMin;
                return this;
            }

            /**
             * <p>The average amount of time consumed by a scan operator to read data on each storage node in the stage. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanTimeAvg(Long scanTimeAvg) {
                this.scanTimeAvg = scanTimeAvg;
                return this;
            }

            /**
             * <p>The maximum amount of time consumed by a scan operator to read data on each storage node in the stage. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanTimeMax(Long scanTimeMax) {
                this.scanTimeMax = scanTimeMax;
                return this;
            }

            /**
             * <p>The minimum amount of time consumed by a scan operator to read data on each storage node in the stage. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanTimeMin(Long scanTimeMin) {
                this.scanTimeMin = scanTimeMin;
                return this;
            }

            /**
             * <p>The stage ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stageId(Integer stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The final execution state of the stage. Valid values:</p>
             * <ul>
             * <li>FINISHED</li>
             * <li>CANCELED</li>
             * <li>ABORTED</li>
             * <li>FAILED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
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
