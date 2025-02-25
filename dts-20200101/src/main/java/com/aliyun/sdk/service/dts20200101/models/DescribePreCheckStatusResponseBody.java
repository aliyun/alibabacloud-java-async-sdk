// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreCheckStatusResponseBody</p>
 */
public class DescribePreCheckStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnalysisJobProgress")
    private java.util.List<AnalysisJobProgress> analysisJobProgress;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorAnalysisItem")
    private Integer errorAnalysisItem;

    @com.aliyun.core.annotation.NameInMap("ErrorItem")
    private Integer errorItem;

    @com.aliyun.core.annotation.NameInMap("FullNetCheckJobStatus")
    private java.util.List<FullNetCheckJobStatus> fullNetCheckJobStatus;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.NameInMap("JobProgress")
    private java.util.List<JobProgress> jobProgress;

    @com.aliyun.core.annotation.NameInMap("NetworkDiagnosisResult")
    private NetworkDiagnosisResult networkDiagnosisResult;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Long pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("SubDistributedJobStatus")
    private java.util.List<SubDistributedJobStatus> subDistributedJobStatus;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribePreCheckStatusResponseBody(Builder builder) {
        this.analysisJobProgress = builder.analysisJobProgress;
        this.code = builder.code;
        this.errorAnalysisItem = builder.errorAnalysisItem;
        this.errorItem = builder.errorItem;
        this.fullNetCheckJobStatus = builder.fullNetCheckJobStatus;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.jobProgress = builder.jobProgress;
        this.networkDiagnosisResult = builder.networkDiagnosisResult;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.subDistributedJobStatus = builder.subDistributedJobStatus;
        this.success = builder.success;
        this.total = builder.total;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePreCheckStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return analysisJobProgress
     */
    public java.util.List<AnalysisJobProgress> getAnalysisJobProgress() {
        return this.analysisJobProgress;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorAnalysisItem
     */
    public Integer getErrorAnalysisItem() {
        return this.errorAnalysisItem;
    }

    /**
     * @return errorItem
     */
    public Integer getErrorItem() {
        return this.errorItem;
    }

    /**
     * @return fullNetCheckJobStatus
     */
    public java.util.List<FullNetCheckJobStatus> getFullNetCheckJobStatus() {
        return this.fullNetCheckJobStatus;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return jobProgress
     */
    public java.util.List<JobProgress> getJobProgress() {
        return this.jobProgress;
    }

    /**
     * @return networkDiagnosisResult
     */
    public NetworkDiagnosisResult getNetworkDiagnosisResult() {
        return this.networkDiagnosisResult;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return subDistributedJobStatus
     */
    public java.util.List<SubDistributedJobStatus> getSubDistributedJobStatus() {
        return this.subDistributedJobStatus;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<AnalysisJobProgress> analysisJobProgress; 
        private String code; 
        private Integer errorAnalysisItem; 
        private Integer errorItem; 
        private java.util.List<FullNetCheckJobStatus> fullNetCheckJobStatus; 
        private Integer httpStatusCode; 
        private String jobId; 
        private String jobName; 
        private java.util.List<JobProgress> jobProgress; 
        private NetworkDiagnosisResult networkDiagnosisResult; 
        private Long pageNumber; 
        private Long pageRecordCount; 
        private String requestId; 
        private String state; 
        private java.util.List<SubDistributedJobStatus> subDistributedJobStatus; 
        private Boolean success; 
        private Integer total; 
        private Long totalRecordCount; 

        /**
         * <p>Display list of evaluation tasks</p>
         */
        public Builder analysisJobProgress(java.util.List<AnalysisJobProgress> analysisJobProgress) {
            this.analysisJobProgress = analysisJobProgress;
            return this;
        }

        /**
         * <p>The task code that indicates the type of the subtask. Valid values:</p>
         * <ul>
         * <li><strong>01</strong>: precheck.</li>
         * <li><strong>02</strong>: schema migration or initial schema synchronization.</li>
         * <li><strong>03</strong>: full data migration or initial full data synchronization.</li>
         * <li><strong>04</strong>: incremental data migration or synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Number of failed evaluation items</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorAnalysisItem(Integer errorAnalysisItem) {
            this.errorAnalysisItem = errorAnalysisItem;
            return this;
        }

        /**
         * <p>The total number of subtask failures.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorItem(Integer errorItem) {
            this.errorItem = errorItem;
            return this;
        }

        /**
         * <p>Network-wide inspection results.</p>
         */
        public Builder fullNetCheckJobStatus(java.util.List<FullNetCheckJobStatus> fullNetCheckJobStatus) {
            this.fullNetCheckJobStatus = fullNetCheckJobStatus;
            return this;
        }

        /**
         * <p>The status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the data migration or synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>b4my3zg929a****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The name of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The subtasks and the progress of each subtask.</p>
         */
        public Builder jobProgress(java.util.List<JobProgress> jobProgress) {
            this.jobProgress = jobProgress;
            return this;
        }

        /**
         * <p>Network diagnosis result</p>
         */
        public Builder networkDiagnosisResult(NetworkDiagnosisResult networkDiagnosisResult) {
            this.networkDiagnosisResult = networkDiagnosisResult;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageRecordCount(Long pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C096FA97-B6BA-4575-899D-61E12B59****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the subtask. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The subtask is not started.</li>
         * <li><strong>Suspending</strong>: The subtask is paused.</li>
         * <li><strong>Checking</strong>: The subtask is being checked.</li>
         * <li><strong>Migrating</strong>: The subtask is in progress. Data is being migrated.</li>
         * <li><strong>Failed</strong>: The subtask failed.</li>
         * <li><strong>Catched</strong>: The subtask is in progress. Incremental data is being migrated or synchronized.</li>
         * <li><strong>Finished</strong>: The subtask is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The information about the distributed subtasks.</p>
         */
        public Builder subDistributedJobStatus(java.util.List<SubDistributedJobStatus> subDistributedJobStatus) {
            this.subDistributedJobStatus = subDistributedJobStatus;
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

        /**
         * <p>The total number of subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribePreCheckStatusResponseBody build() {
            return new DescribePreCheckStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrData")
        private String errData;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ErrType")
        private String errType;

        @com.aliyun.core.annotation.NameInMap("LogLevel")
        private String logLevel;

        private Logs(Builder builder) {
            this.errData = builder.errData;
            this.errMsg = builder.errMsg;
            this.errType = builder.errType;
            this.logLevel = builder.logLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return errData
         */
        public String getErrData() {
            return this.errData;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return errType
         */
        public String getErrType() {
            return this.errType;
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        public static final class Builder {
            private String errData; 
            private String errMsg; 
            private String errType; 
            private String logLevel; 

            /**
             * <p>Error message</p>
             * 
             * <strong>example:</strong>
             * <p>Please modify this object</p>
             */
            public Builder errData(String errData) {
                this.errData = errData;
                return this;
            }

            /**
             * <p>Error message from DTS when a specific project encounters an error.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: Table &quot;customer&quot; already exists</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>Error type.</p>
             * 
             * <strong>example:</strong>
             * <p>ForeignKey</p>
             */
            public Builder errType(String errType) {
                this.errType = errType;
                return this;
            }

            /**
             * <p>The level of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>ERROR</p>
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class AnalysisJobProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootTime")
        private String bootTime;

        @com.aliyun.core.annotation.NameInMap("CanSkip")
        private Boolean canSkip;

        @com.aliyun.core.annotation.NameInMap("Current")
        private String current;

        @com.aliyun.core.annotation.NameInMap("DdlSql")
        private String ddlSql;

        @com.aliyun.core.annotation.NameInMap("DelaySeconds")
        private Integer delaySeconds;

        @com.aliyun.core.annotation.NameInMap("DestSchema")
        private String destSchema;

        @com.aliyun.core.annotation.NameInMap("DiffRow")
        private Long diffRow;

        @com.aliyun.core.annotation.NameInMap("ErrDetail")
        private String errDetail;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IgnoreFlag")
        private String ignoreFlag;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<Logs> logs;

        @com.aliyun.core.annotation.NameInMap("Names")
        private String names;

        @com.aliyun.core.annotation.NameInMap("OrderNum")
        private Integer orderNum;

        @com.aliyun.core.annotation.NameInMap("ParentObj")
        private String parentObj;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
        private String repairMethod;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private Boolean skip;

        @com.aliyun.core.annotation.NameInMap("SourceSchema")
        private String sourceSchema;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Sub")
        private String sub;

        @com.aliyun.core.annotation.NameInMap("TargetNames")
        private String targetNames;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private AnalysisJobProgress(Builder builder) {
            this.bootTime = builder.bootTime;
            this.canSkip = builder.canSkip;
            this.current = builder.current;
            this.ddlSql = builder.ddlSql;
            this.delaySeconds = builder.delaySeconds;
            this.destSchema = builder.destSchema;
            this.diffRow = builder.diffRow;
            this.errDetail = builder.errDetail;
            this.errMsg = builder.errMsg;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.ignoreFlag = builder.ignoreFlag;
            this.item = builder.item;
            this.jobId = builder.jobId;
            this.logs = builder.logs;
            this.names = builder.names;
            this.orderNum = builder.orderNum;
            this.parentObj = builder.parentObj;
            this.repairMethod = builder.repairMethod;
            this.skip = builder.skip;
            this.sourceSchema = builder.sourceSchema;
            this.state = builder.state;
            this.sub = builder.sub;
            this.targetNames = builder.targetNames;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalysisJobProgress create() {
            return builder().build();
        }

        /**
         * @return bootTime
         */
        public String getBootTime() {
            return this.bootTime;
        }

        /**
         * @return canSkip
         */
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        /**
         * @return current
         */
        public String getCurrent() {
            return this.current;
        }

        /**
         * @return ddlSql
         */
        public String getDdlSql() {
            return this.ddlSql;
        }

        /**
         * @return delaySeconds
         */
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        /**
         * @return destSchema
         */
        public String getDestSchema() {
            return this.destSchema;
        }

        /**
         * @return diffRow
         */
        public Long getDiffRow() {
            return this.diffRow;
        }

        /**
         * @return errDetail
         */
        public String getErrDetail() {
            return this.errDetail;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ignoreFlag
         */
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return logs
         */
        public java.util.List<Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return names
         */
        public String getNames() {
            return this.names;
        }

        /**
         * @return orderNum
         */
        public Integer getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return parentObj
         */
        public String getParentObj() {
            return this.parentObj;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        /**
         * @return skip
         */
        public Boolean getSkip() {
            return this.skip;
        }

        /**
         * @return sourceSchema
         */
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return sub
         */
        public String getSub() {
            return this.sub;
        }

        /**
         * @return targetNames
         */
        public String getTargetNames() {
            return this.targetNames;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String bootTime; 
            private Boolean canSkip; 
            private String current; 
            private String ddlSql; 
            private Integer delaySeconds; 
            private String destSchema; 
            private Long diffRow; 
            private String errDetail; 
            private String errMsg; 
            private String finishTime; 
            private String id; 
            private String ignoreFlag; 
            private String item; 
            private String jobId; 
            private java.util.List<Logs> logs; 
            private String names; 
            private Integer orderNum; 
            private String parentObj; 
            private String repairMethod; 
            private Boolean skip; 
            private String sourceSchema; 
            private String state; 
            private String sub; 
            private String targetNames; 
            private Integer total; 

            /**
             * <p>The specific project start time, formatted as <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:31.000+00:00</p>
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * <p>Whether to support skipping this sub-item.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * <p>The number of currently running subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * <p>The DDL operation to be executed.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE TABLE ****</p>
             */
            public Builder ddlSql(String ddlSql) {
                this.ddlSql = ddlSql;
                return this;
            }

            /**
             * <p>Task delay time</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delaySeconds(Integer delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * <p>Name of the database to which the migration objects in the target instance belong.</p>
             * 
             * <strong>example:</strong>
             * <p>dest</p>
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * <p>This parameter will be deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diffRow(Long diffRow) {
                this.diffRow = diffRow;
                return this;
            }

            /**
             * <p>Error details when the project encounters an error.</p>
             * 
             * <strong>example:</strong>
             * <p>ANALYSIS_MYSQL</p>
             */
            public Builder errDetail(String errDetail) {
                this.errDetail = errDetail;
                return this;
            }

            /**
             * <p>Specific error message.</p>
             * 
             * <strong>example:</strong>
             * <p>ANALYSIS_</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The end time of the evaluation task, formatted as <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:31.000+00:00</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of this evaluation item in the database.</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Whether to directly ignore this specific item and move to the next one. Return values:</p>
             * <ul>
             * <li><strong>N</strong>: No. - <strong>Y</strong>: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder ignoreFlag(String ignoreFlag) {
                this.ignoreFlag = ignoreFlag;
                return this;
            }

            /**
             * <p>Name of the evaluation item</p>
             * 
             * <strong>example:</strong>
             * <p>ANALYSIS_MYSQL_4_ITEM</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The ID of the evaluation task.</p>
             * 
             * <strong>example:</strong>
             * <p>11234234xc</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Sub-assessment item.</p>
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>Name of the evaluation item</p>
             * 
             * <strong>example:</strong>
             * <p>ANALYSIS_MYSQL_4_DETAIL</p>
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * <p>The number of the evaluation item.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>This parameter will be deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder parentObj(String parentObj) {
                this.parentObj = parentObj;
                return this;
            }

            /**
             * <p>Remediation method for the evaluation item.</p>
             * 
             * <strong>example:</strong>
             * <p>ANALYSIS_</p>
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            /**
             * <p>If this evaluation item fails, whether you set to skip this item. Return values: * <strong>true</strong>: Yes * <strong>false</strong>: No</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>Name of the database to which the migration objects in the source instance belong.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * <p>The result of the evaluation, with return values being: - <strong>Failed</strong>: Failure. - <strong>Success</strong>: Success.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Progress of sub-projects under a specific project. &gt; If it returns <b>[]</b>, it indicates there are no sub-projects.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * <p>Name of the target object</p>
             * 
             * <strong>example:</strong>
             * <p>testTable</p>
             */
            public Builder targetNames(String targetNames) {
                this.targetNames = targetNames;
                return this;
            }

            /**
             * <p>The total number of specific items in the sub-task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public AnalysisJobProgress build() {
                return new AnalysisJobProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class JobProgressLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrData")
        private String errData;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ErrType")
        private String errType;

        @com.aliyun.core.annotation.NameInMap("LogLevel")
        private String logLevel;

        private JobProgressLogs(Builder builder) {
            this.errData = builder.errData;
            this.errMsg = builder.errMsg;
            this.errType = builder.errType;
            this.logLevel = builder.logLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobProgressLogs create() {
            return builder().build();
        }

        /**
         * @return errData
         */
        public String getErrData() {
            return this.errData;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return errType
         */
        public String getErrType() {
            return this.errType;
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        public static final class Builder {
            private String errData; 
            private String errMsg; 
            private String errType; 
            private String logLevel; 

            /**
             * <p>Error record.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> ****</p>
             */
            public Builder errData(String errData) {
                this.errData = errData;
                return this;
            }

            /**
             * <p>Specific error message.</p>
             * 
             * <strong>example:</strong>
             * <p>get metric list fail</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>Type of error.</p>
             * 
             * <strong>example:</strong>
             * <p>ForeignKey</p>
             */
            public Builder errType(String errType) {
                this.errType = errType;
                return this;
            }

            /**
             * <p>The level of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            public JobProgressLogs build() {
                return new JobProgressLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class FullNetCheckJobStatusJobProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootTime")
        private String bootTime;

        @com.aliyun.core.annotation.NameInMap("CanSkip")
        private Boolean canSkip;

        @com.aliyun.core.annotation.NameInMap("Current")
        private String current;

        @com.aliyun.core.annotation.NameInMap("DdlSql")
        private String ddlSql;

        @com.aliyun.core.annotation.NameInMap("DelaySeconds")
        private Integer delaySeconds;

        @com.aliyun.core.annotation.NameInMap("DestSchema")
        private String destSchema;

        @com.aliyun.core.annotation.NameInMap("DiffRow")
        private Long diffRow;

        @com.aliyun.core.annotation.NameInMap("ErrDetail")
        private String errDetail;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IgnoreFlag")
        private String ignoreFlag;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<JobProgressLogs> logs;

        @com.aliyun.core.annotation.NameInMap("Names")
        private String names;

        @com.aliyun.core.annotation.NameInMap("OrderNum")
        private Integer orderNum;

        @com.aliyun.core.annotation.NameInMap("ParentObj")
        private String parentObj;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
        private String repairMethod;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private Boolean skip;

        @com.aliyun.core.annotation.NameInMap("SourceSchema")
        private String sourceSchema;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Sub")
        private String sub;

        @com.aliyun.core.annotation.NameInMap("TargetNames")
        private String targetNames;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private FullNetCheckJobStatusJobProgress(Builder builder) {
            this.bootTime = builder.bootTime;
            this.canSkip = builder.canSkip;
            this.current = builder.current;
            this.ddlSql = builder.ddlSql;
            this.delaySeconds = builder.delaySeconds;
            this.destSchema = builder.destSchema;
            this.diffRow = builder.diffRow;
            this.errDetail = builder.errDetail;
            this.errMsg = builder.errMsg;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.ignoreFlag = builder.ignoreFlag;
            this.item = builder.item;
            this.jobId = builder.jobId;
            this.logs = builder.logs;
            this.names = builder.names;
            this.orderNum = builder.orderNum;
            this.parentObj = builder.parentObj;
            this.repairMethod = builder.repairMethod;
            this.skip = builder.skip;
            this.sourceSchema = builder.sourceSchema;
            this.state = builder.state;
            this.sub = builder.sub;
            this.targetNames = builder.targetNames;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullNetCheckJobStatusJobProgress create() {
            return builder().build();
        }

        /**
         * @return bootTime
         */
        public String getBootTime() {
            return this.bootTime;
        }

        /**
         * @return canSkip
         */
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        /**
         * @return current
         */
        public String getCurrent() {
            return this.current;
        }

        /**
         * @return ddlSql
         */
        public String getDdlSql() {
            return this.ddlSql;
        }

        /**
         * @return delaySeconds
         */
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        /**
         * @return destSchema
         */
        public String getDestSchema() {
            return this.destSchema;
        }

        /**
         * @return diffRow
         */
        public Long getDiffRow() {
            return this.diffRow;
        }

        /**
         * @return errDetail
         */
        public String getErrDetail() {
            return this.errDetail;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ignoreFlag
         */
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return logs
         */
        public java.util.List<JobProgressLogs> getLogs() {
            return this.logs;
        }

        /**
         * @return names
         */
        public String getNames() {
            return this.names;
        }

        /**
         * @return orderNum
         */
        public Integer getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return parentObj
         */
        public String getParentObj() {
            return this.parentObj;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        /**
         * @return skip
         */
        public Boolean getSkip() {
            return this.skip;
        }

        /**
         * @return sourceSchema
         */
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return sub
         */
        public String getSub() {
            return this.sub;
        }

        /**
         * @return targetNames
         */
        public String getTargetNames() {
            return this.targetNames;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String bootTime; 
            private Boolean canSkip; 
            private String current; 
            private String ddlSql; 
            private Integer delaySeconds; 
            private String destSchema; 
            private Long diffRow; 
            private String errDetail; 
            private String errMsg; 
            private String finishTime; 
            private String id; 
            private String ignoreFlag; 
            private String item; 
            private String jobId; 
            private java.util.List<JobProgressLogs> logs; 
            private String names; 
            private Integer orderNum; 
            private String parentObj; 
            private String repairMethod; 
            private Boolean skip; 
            private String sourceSchema; 
            private String state; 
            private String sub; 
            private String targetNames; 
            private Integer total; 

            /**
             * <p>The specific project start time, formatted as <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-30T03:36:11.000+00:00</p>
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * <p>Whether DTS supports skipping a project after it fails. Return values: * <strong>true</strong>: Yes * <strong>false</strong>: No</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * <p>The number of currently running tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * <p>The DDL operation to be executed.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE TABLE ****</p>
             */
            public Builder ddlSql(String ddlSql) {
                this.ddlSql = ddlSql;
                return this;
            }

            /**
             * <p>Task delay time</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delaySeconds(Integer delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * <p>Name of the database to which the migration objects in the target instance belong.</p>
             * 
             * <strong>example:</strong>
             * <p>dest</p>
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * <p>This parameter will be deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diffRow(Long diffRow) {
                this.diffRow = diffRow;
                return this;
            }

            /**
             * <p>Details of the error when a specific project fails.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ_DETAIL</p>
             */
            public Builder errDetail(String errDetail) {
                this.errDetail = errDetail;
                return this;
            }

            /**
             * <p>Error message prompt when a specific project encounters an error.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS project does not exist odps.`huijin</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>Task completion time, formatted as yyyy-MM-ddTHH:mm:ssZ (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-31T03:36:11.000+00:00</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the record in the metadata database.</p>
             * 
             * <strong>example:</strong>
             * <p>922305811766881****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Whether to directly ignore this specific item and move to the next one. Return values:</p>
             * <ul>
             * <li><strong>N</strong>: No. - <strong>Y</strong>: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder ignoreFlag(String ignoreFlag) {
                this.ignoreFlag = ignoreFlag;
                return this;
            }

            /**
             * <p>Specific project name.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>l3m1213ye7l****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Error execution log information.</p>
             */
            public Builder logs(java.util.List<JobProgressLogs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>Specific project name.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC_DETAIL</p>
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * <p>Project number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>This parameter will be deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder parentObj(String parentObj) {
                this.parentObj = parentObj;
                return this;
            }

            /**
             * <p>The corresponding remediation method when the pre-check fails.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ_REPAIR</p>
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            /**
             * <p>After this specific item fails, do you set to skip this item. Return values: * <strong>true</strong>: Yes * <strong>false</strong>: No</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>Name of the database to which the migration objects in the source instance belong.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * <p>Check result, the return value is: - <strong>Failed</strong>: Failure. - <strong>Success</strong>: Completed.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Progress of sub-projects under a specific project. &gt; If it returns <b>[]</b>, it indicates there are no sub-projects.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * <p>Name of the target object</p>
             * 
             * <strong>example:</strong>
             * <p>order</p>
             */
            public Builder targetNames(String targetNames) {
                this.targetNames = targetNames;
                return this;
            }

            /**
             * <p>The total number of projects.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public FullNetCheckJobStatusJobProgress build() {
                return new FullNetCheckJobStatusJobProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class FullNetCheckJobStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestRegionCidr")
        private String destRegionCidr;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointType")
        private String destinationEndpointType;

        @com.aliyun.core.annotation.NameInMap("ErrorItem")
        private Integer errorItem;

        @com.aliyun.core.annotation.NameInMap("HostRegion")
        private String hostRegion;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobProgress")
        private java.util.List<FullNetCheckJobStatusJobProgress> jobProgress;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointType")
        private String sourceEndpointType;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcRegionCidr")
        private String srcRegionCidr;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private FullNetCheckJobStatus(Builder builder) {
            this.code = builder.code;
            this.destRegion = builder.destRegion;
            this.destRegionCidr = builder.destRegionCidr;
            this.destinationEndpointType = builder.destinationEndpointType;
            this.errorItem = builder.errorItem;
            this.hostRegion = builder.hostRegion;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.jobProgress = builder.jobProgress;
            this.sourceEndpointType = builder.sourceEndpointType;
            this.srcRegion = builder.srcRegion;
            this.srcRegionCidr = builder.srcRegionCidr;
            this.state = builder.state;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullNetCheckJobStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destRegionCidr
         */
        public String getDestRegionCidr() {
            return this.destRegionCidr;
        }

        /**
         * @return destinationEndpointType
         */
        public String getDestinationEndpointType() {
            return this.destinationEndpointType;
        }

        /**
         * @return errorItem
         */
        public Integer getErrorItem() {
            return this.errorItem;
        }

        /**
         * @return hostRegion
         */
        public String getHostRegion() {
            return this.hostRegion;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobProgress
         */
        public java.util.List<FullNetCheckJobStatusJobProgress> getJobProgress() {
            return this.jobProgress;
        }

        /**
         * @return sourceEndpointType
         */
        public String getSourceEndpointType() {
            return this.sourceEndpointType;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return srcRegionCidr
         */
        public String getSrcRegionCidr() {
            return this.srcRegionCidr;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String code; 
            private String destRegion; 
            private String destRegionCidr; 
            private String destinationEndpointType; 
            private Integer errorItem; 
            private String hostRegion; 
            private String jobId; 
            private String jobName; 
            private java.util.List<FullNetCheckJobStatusJobProgress> jobProgress; 
            private String sourceEndpointType; 
            private String srcRegion; 
            private String srcRegionCidr; 
            private String state; 
            private Integer total; 

            /**
             * <p>Task code, <strong>01</strong> represents pre-check.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>ID of the region to which the target network segment belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>Destination network segment.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.XX.XXX/XX</p>
             */
            public Builder destRegionCidr(String destRegionCidr) {
                this.destRegionCidr = destRegionCidr;
                return this;
            }

            /**
             * <p>The access method of the target instance, with return values as follows: - <strong>ALIYUN</strong>: Access method is <strong>cloud instance</strong>. - <strong>OTHER</strong>: Access method is <strong>public IP</strong>. - <strong>ECS</strong>: Access method is <strong>ECS self-built database</strong>. - <strong>EXPRESS</strong>: Access method is <strong>Express Connect / VPN Gateway / Smart Gateway</strong>. - <strong>CEN</strong>: Access method is <strong>Cloud Enterprise Network (CEN)</strong>. - <strong>DG</strong>: Access method is <strong>Database Gateway (DG)</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>CEN</p>
             */
            public Builder destinationEndpointType(String destinationEndpointType) {
                this.destinationEndpointType = destinationEndpointType;
                return this;
            }

            /**
             * <p>Number of pre-check failed items</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errorItem(Integer errorItem) {
                this.errorItem = errorItem;
                return this;
            }

            /**
             * <p>The region ID of the instance&quot;s running node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder hostRegion(String hostRegion) {
                this.hostRegion = hostRegion;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>l3m1213ye7l****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Task name.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.step.fullnetcheck</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>A list of specific items for the task and their execution progress.</p>
             */
            public Builder jobProgress(java.util.List<FullNetCheckJobStatusJobProgress> jobProgress) {
                this.jobProgress = jobProgress;
                return this;
            }

            /**
             * <p>The access method of the source instance, with return values as follows: - <strong>ALIYUN</strong>: Access method is <strong>cloud instance</strong>. - <strong>OTHER</strong>: Access method is <strong>public IP</strong>. - <strong>ECS</strong>: Access method is <strong>ECS self-built database</strong>. - <strong>EXPRESS</strong>: Access method is <strong>dedicated line/VPN gateway/smart gateway</strong>. - <strong>CEN</strong>: Access method is <strong>Cloud Enterprise Network CEN</strong>. - <strong>DG</strong>: Access method is <strong>Database Gateway DG</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>CEN</p>
             */
            public Builder sourceEndpointType(String sourceEndpointType) {
                this.sourceEndpointType = sourceEndpointType;
                return this;
            }

            /**
             * <p>ID of the region to which the source network segment belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>Source network segment.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.XX.XXX/XX</p>
             */
            public Builder srcRegionCidr(String srcRegionCidr) {
                this.srcRegionCidr = srcRegionCidr;
                return this;
            }

            /**
             * <p>Check result, the return value is: - <strong>Failed</strong>: Failure. - <strong>Success</strong>: Completed.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Total number of items in the project.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public FullNetCheckJobStatus build() {
                return new FullNetCheckJobStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class DescribePreCheckStatusResponseBodyJobProgressLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrData")
        private String errData;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ErrType")
        private String errType;

        @com.aliyun.core.annotation.NameInMap("LogLevel")
        private String logLevel;

        private DescribePreCheckStatusResponseBodyJobProgressLogs(Builder builder) {
            this.errData = builder.errData;
            this.errMsg = builder.errMsg;
            this.errType = builder.errType;
            this.logLevel = builder.logLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribePreCheckStatusResponseBodyJobProgressLogs create() {
            return builder().build();
        }

        /**
         * @return errData
         */
        public String getErrData() {
            return this.errData;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return errType
         */
        public String getErrType() {
            return this.errType;
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        public static final class Builder {
            private String errData; 
            private String errMsg; 
            private String errType; 
            private String logLevel; 

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> (\n<code>runoob_id</code>  int(10) unsigned   auto_increment  COMMENT &quot;&quot;   NOT NULL   , \n<code>runoob_title</code>  varchar(100)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT &quot;&quot;   NOT NULL   , \n<code>runoob_author1216</code>  varchar(40)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT &quot;&quot;   NOT NULL   , \n<code>submission_date1216</code>  date     COMMENT &quot;&quot;   NULL   \n, PRIMARY KEY (<code>runoob_id</code>)) engine=InnoDB AUTO_INCREMENT=200001 DEFAULT CHARSET=<code>utf8</code> DEFAULT COLLATE <code>utf8_general_ci</code> ROW_FORMAT= Dynamic comment = &quot;&quot; ;\n</p>
             */
            public Builder errData(String errData) {
                this.errData = errData;
                return this;
            }

            /**
             * <p>The error message that is returned when an error occurs on the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: Table &quot;customer&quot; already exists</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The error type.</p>
             * 
             * <strong>example:</strong>
             * <p>ForeignKey</p>
             */
            public Builder errType(String errType) {
                this.errType = errType;
                return this;
            }

            /**
             * <p>The level of logs.</p>
             * 
             * <strong>example:</strong>
             * <p>ERROR</p>
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            public DescribePreCheckStatusResponseBodyJobProgressLogs build() {
                return new DescribePreCheckStatusResponseBodyJobProgressLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class JobProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootTime")
        private String bootTime;

        @com.aliyun.core.annotation.NameInMap("CanSkip")
        private Boolean canSkip;

        @com.aliyun.core.annotation.NameInMap("Current")
        private String current;

        @com.aliyun.core.annotation.NameInMap("DdlSql")
        private String ddlSql;

        @com.aliyun.core.annotation.NameInMap("DelaySeconds")
        private Integer delaySeconds;

        @com.aliyun.core.annotation.NameInMap("DestSchema")
        private String destSchema;

        @com.aliyun.core.annotation.NameInMap("DiffRow")
        private Long diffRow;

        @com.aliyun.core.annotation.NameInMap("ErrDetail")
        private String errDetail;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IgnoreFlag")
        private String ignoreFlag;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> logs;

        @com.aliyun.core.annotation.NameInMap("Names")
        private String names;

        @com.aliyun.core.annotation.NameInMap("OrderNum")
        private Integer orderNum;

        @com.aliyun.core.annotation.NameInMap("ParentObj")
        private String parentObj;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
        private String repairMethod;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private Boolean skip;

        @com.aliyun.core.annotation.NameInMap("SourceSchema")
        private String sourceSchema;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Sub")
        private String sub;

        @com.aliyun.core.annotation.NameInMap("TargetNames")
        private String targetNames;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private JobProgress(Builder builder) {
            this.bootTime = builder.bootTime;
            this.canSkip = builder.canSkip;
            this.current = builder.current;
            this.ddlSql = builder.ddlSql;
            this.delaySeconds = builder.delaySeconds;
            this.destSchema = builder.destSchema;
            this.diffRow = builder.diffRow;
            this.errDetail = builder.errDetail;
            this.errMsg = builder.errMsg;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.ignoreFlag = builder.ignoreFlag;
            this.item = builder.item;
            this.jobId = builder.jobId;
            this.logs = builder.logs;
            this.names = builder.names;
            this.orderNum = builder.orderNum;
            this.parentObj = builder.parentObj;
            this.repairMethod = builder.repairMethod;
            this.skip = builder.skip;
            this.sourceSchema = builder.sourceSchema;
            this.state = builder.state;
            this.sub = builder.sub;
            this.targetNames = builder.targetNames;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobProgress create() {
            return builder().build();
        }

        /**
         * @return bootTime
         */
        public String getBootTime() {
            return this.bootTime;
        }

        /**
         * @return canSkip
         */
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        /**
         * @return current
         */
        public String getCurrent() {
            return this.current;
        }

        /**
         * @return ddlSql
         */
        public String getDdlSql() {
            return this.ddlSql;
        }

        /**
         * @return delaySeconds
         */
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        /**
         * @return destSchema
         */
        public String getDestSchema() {
            return this.destSchema;
        }

        /**
         * @return diffRow
         */
        public Long getDiffRow() {
            return this.diffRow;
        }

        /**
         * @return errDetail
         */
        public String getErrDetail() {
            return this.errDetail;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ignoreFlag
         */
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return logs
         */
        public java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> getLogs() {
            return this.logs;
        }

        /**
         * @return names
         */
        public String getNames() {
            return this.names;
        }

        /**
         * @return orderNum
         */
        public Integer getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return parentObj
         */
        public String getParentObj() {
            return this.parentObj;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        /**
         * @return skip
         */
        public Boolean getSkip() {
            return this.skip;
        }

        /**
         * @return sourceSchema
         */
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return sub
         */
        public String getSub() {
            return this.sub;
        }

        /**
         * @return targetNames
         */
        public String getTargetNames() {
            return this.targetNames;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String bootTime; 
            private Boolean canSkip; 
            private String current; 
            private String ddlSql; 
            private Integer delaySeconds; 
            private String destSchema; 
            private Long diffRow; 
            private String errDetail; 
            private String errMsg; 
            private String finishTime; 
            private String id; 
            private String ignoreFlag; 
            private String item; 
            private String jobId; 
            private java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> logs; 
            private String names; 
            private Integer orderNum; 
            private String parentObj; 
            private String repairMethod; 
            private Boolean skip; 
            private String sourceSchema; 
            private String state; 
            private String sub; 
            private String targetNames; 
            private Integer total; 

            /**
             * <p>The time when the subtask was started. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-16T08:01:31.000+00:00</p>
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * <p>Indicates whether the subtask can be ignored if it fails.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * <p>The number of the subtasks that are running.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * <p>The DDL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE TABLE <code>dtstestdata</code>.<code>order</code> (\n<code>orderid</code>  int(11)     COMMENT &quot;&quot;   NOT NULL   , \n<code>username</code>  char(32)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT &quot;&quot;   NULL   , \n<code>ordertime</code>  datetime     COMMENT &quot;&quot;   NULL   , \n<code>commodity</code>  varchar(32)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT &quot;&quot;   NULL   , \n<code>phonenumber</code>  int(11)     COMMENT &quot;&quot;   NULL   , \n<code>address</code>  text  CHARSET <code>utf8mb4</code> COLLATE <code>utf8mb4_general_ci</code>    COMMENT &quot;&quot;   NULL   \n, PRIMARY KEY (<code>orderid</code>)) engine=InnoDB DEFAULT CHARSET=<code>gbk</code> DEFAULT COLLATE <code>gbk_chinese_ci</code> ROW_FORMAT= Dynamic comment = &quot;&quot; ;\n</p>
             */
            public Builder ddlSql(String ddlSql) {
                this.ddlSql = ddlSql;
                return this;
            }

            /**
             * <p>The latency of incremental data migration or synchronization.</p>
             * <blockquote>
             * <p>If you query data migration tasks, the unit of this parameter is milliseconds. If you query data synchronization tasks, the unit of this parameter is seconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delaySeconds(Integer delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * <p>The name of the database to which the object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata_new</p>
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * <p>This parameter will be removed in the future.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diffRow(Long diffRow) {
                this.diffRow = diffRow;
                return this;
            }

            /**
             * <p>The error details of the subtask failure.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ_DETAIL</p>
             */
            public Builder errDetail(String errDetail) {
                this.errDetail = errDetail;
                return this;
            }

            /**
             * <p>The error message of the subtask failure.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The time when the subtask was complete. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-16T08:01:34.000+00:00</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the entry in the metadatabase.</p>
             * 
             * <strong>example:</strong>
             * <p>5632</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether DTS ignores the subtask and proceeds with the next subtask. Valid values:</p>
             * <ul>
             * <li><strong>N</strong>: no.</li>
             * <li><strong>Y</strong>: yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder ignoreFlag(String ignoreFlag) {
                this.ignoreFlag = ignoreFlag;
                return this;
            }

            /**
             * <p>The shortened name of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_DEST</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The subtask ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fj1c33ro168****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The logs of subtask failures.</p>
             */
            public Builder logs(java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>The name of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_DEST_DETAIL</p>
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * <p>The serial number of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>This parameter will be removed in the future.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder parentObj(String parentObj) {
                this.parentObj = parentObj;
                return this;
            }

            /**
             * <p>The method to fix the subtask failure.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ_REPAIR</p>
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            /**
             * <p>Indicates whether the subtask is ignored if it fails. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>The name of the database to which the object in the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * <p>The status of the subtask. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The subtask is not started.</li>
             * <li><strong>Checking</strong>: The subtask is being checked.</li>
             * <li><strong>Migrating</strong>: The subtask is in progress. Data is being migrated.</li>
             * <li><strong>Failed</strong>: The subtask failed.</li>
             * <li><strong>Warning</strong>: The subtask encounters an exception.</li>
             * <li><strong>Success</strong>: The subtask is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The sub-item progress of the subtask.</p>
             * <blockquote>
             * <p>If **[]** is returned, the subtask has no sub-items.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * <p>The names of the objects that are migrated or synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>order</p>
             */
            public Builder targetNames(String targetNames) {
                this.targetNames = targetNames;
                return this;
            }

            /**
             * <p>The total number of sub-items of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public JobProgress build() {
                return new JobProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class Diagnosis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnDocUrl")
        private String cnDocUrl;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("InternationalDocUrl")
        private String internationalDocUrl;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private Diagnosis(Builder builder) {
            this.cnDocUrl = builder.cnDocUrl;
            this.code = builder.code;
            this.endpointType = builder.endpointType;
            this.internationalDocUrl = builder.internationalDocUrl;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Diagnosis create() {
            return builder().build();
        }

        /**
         * @return cnDocUrl
         */
        public String getCnDocUrl() {
            return this.cnDocUrl;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return internationalDocUrl
         */
        public String getInternationalDocUrl() {
            return this.internationalDocUrl;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private String cnDocUrl; 
            private String code; 
            private String endpointType; 
            private String internationalDocUrl; 
            private String result; 

            /**
             * <p>Document address for China region.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<em><strong>.ali</strong></em>.com/document_detail/470447.html</p>
             */
            public Builder cnDocUrl(String cnDocUrl) {
                this.cnDocUrl = cnDocUrl;
                return this;
            }

            /**
             * <p>Diagnostic code.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.kunlun.diagnosis.network.express_doc</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Access point, the return values are: - <strong>source</strong>: source end. - <strong>destination</strong>: destination end. - <strong>unknown</strong>: unknown.</p>
             * 
             * <strong>example:</strong>
             * <p>source</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>Overseas region document address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.ali***.com/help/en/data-transmission-service/latest/how-to-solve-an-error-when-accessing-a-database-instance-to-dts-using-vpn">https://www.ali***.com/help/en/data-transmission-service/latest/how-to-solve-an-error-when-accessing-a-database-instance-to-dts-using-vpn</a></p>
             */
            public Builder internationalDocUrl(String internationalDocUrl) {
                this.internationalDocUrl = internationalDocUrl;
                return this;
            }

            /**
             * <p>Reserved field for diagnostic results, default is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public Diagnosis build() {
                return new Diagnosis(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class NetworkDiagnosisResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Diagnosis")
        private java.util.List<Diagnosis> diagnosis;

        @com.aliyun.core.annotation.NameInMap("ModelVersion")
        private String modelVersion;

        private NetworkDiagnosisResult(Builder builder) {
            this.diagnosis = builder.diagnosis;
            this.modelVersion = builder.modelVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkDiagnosisResult create() {
            return builder().build();
        }

        /**
         * @return diagnosis
         */
        public java.util.List<Diagnosis> getDiagnosis() {
            return this.diagnosis;
        }

        /**
         * @return modelVersion
         */
        public String getModelVersion() {
            return this.modelVersion;
        }

        public static final class Builder {
            private java.util.List<Diagnosis> diagnosis; 
            private String modelVersion; 

            /**
             * <p>Network diagnostic report</p>
             */
            public Builder diagnosis(java.util.List<Diagnosis> diagnosis) {
                this.diagnosis = diagnosis;
                return this;
            }

            /**
             * <p>Diagnose model version.</p>
             * 
             * <strong>example:</strong>
             * <p>network-v0.2</p>
             */
            public Builder modelVersion(String modelVersion) {
                this.modelVersion = modelVersion;
                return this;
            }

            public NetworkDiagnosisResult build() {
                return new NetworkDiagnosisResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class SubDistributedJobStatusJobProgressLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrData")
        private String errData;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ErrType")
        private String errType;

        @com.aliyun.core.annotation.NameInMap("LogLevel")
        private String logLevel;

        private SubDistributedJobStatusJobProgressLogs(Builder builder) {
            this.errData = builder.errData;
            this.errMsg = builder.errMsg;
            this.errType = builder.errType;
            this.logLevel = builder.logLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobStatusJobProgressLogs create() {
            return builder().build();
        }

        /**
         * @return errData
         */
        public String getErrData() {
            return this.errData;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return errType
         */
        public String getErrType() {
            return this.errType;
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        public static final class Builder {
            private String errData; 
            private String errMsg; 
            private String errType; 
            private String logLevel; 

            /**
             * <p>The record of errors.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> (\n<code>runoob_id</code> int(10) unsigned auto_increment COMMENT &quot;&quot; NOT NULL , \n<code>runoob_title</code> varchar(100) CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code> COMMENT &quot;&quot; NOT NULL , \n<code>runoob_author1216</code> varchar(40) CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code> COMMENT &quot;&quot; NOT NULL , \n<code>submission_date1216</code> date COMMENT &quot;&quot; NULL \n, PRIMARY KEY (<code>runoob_id</code>)) engine=InnoDB AUTO_INCREMENT=200001 DEFAULT CHARSET=<code>utf8</code> DEFAULT COLLATE <code>utf8_general_ci</code> ROW_FORMAT= Dynamic comment = &quot;&quot; ;\n</p>
             */
            public Builder errData(String errData) {
                this.errData = errData;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>get metric list fail</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The error type.</p>
             * 
             * <strong>example:</strong>
             * <p>ForeignKey</p>
             */
            public Builder errType(String errType) {
                this.errType = errType;
                return this;
            }

            /**
             * <p>The level of logs.</p>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            public SubDistributedJobStatusJobProgressLogs build() {
                return new SubDistributedJobStatusJobProgressLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class SubDistributedJobStatusJobProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootTime")
        private String bootTime;

        @com.aliyun.core.annotation.NameInMap("CanSkip")
        private Boolean canSkip;

        @com.aliyun.core.annotation.NameInMap("Current")
        private String current;

        @com.aliyun.core.annotation.NameInMap("DdlSql")
        private String ddlSql;

        @com.aliyun.core.annotation.NameInMap("DelaySeconds")
        private Integer delaySeconds;

        @com.aliyun.core.annotation.NameInMap("DestSchema")
        private String destSchema;

        @com.aliyun.core.annotation.NameInMap("DiffRow")
        private Long diffRow;

        @com.aliyun.core.annotation.NameInMap("ErrDetail")
        private String errDetail;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IgnoreFlag")
        private String ignoreFlag;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<SubDistributedJobStatusJobProgressLogs> logs;

        @com.aliyun.core.annotation.NameInMap("Names")
        private String names;

        @com.aliyun.core.annotation.NameInMap("OrderNum")
        private Integer orderNum;

        @com.aliyun.core.annotation.NameInMap("ParentObj")
        private String parentObj;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
        private String repairMethod;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private Boolean skip;

        @com.aliyun.core.annotation.NameInMap("SourceSchema")
        private String sourceSchema;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Sub")
        private String sub;

        @com.aliyun.core.annotation.NameInMap("TargetNames")
        private String targetNames;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private SubDistributedJobStatusJobProgress(Builder builder) {
            this.bootTime = builder.bootTime;
            this.canSkip = builder.canSkip;
            this.current = builder.current;
            this.ddlSql = builder.ddlSql;
            this.delaySeconds = builder.delaySeconds;
            this.destSchema = builder.destSchema;
            this.diffRow = builder.diffRow;
            this.errDetail = builder.errDetail;
            this.errMsg = builder.errMsg;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.ignoreFlag = builder.ignoreFlag;
            this.item = builder.item;
            this.jobId = builder.jobId;
            this.logs = builder.logs;
            this.names = builder.names;
            this.orderNum = builder.orderNum;
            this.parentObj = builder.parentObj;
            this.repairMethod = builder.repairMethod;
            this.skip = builder.skip;
            this.sourceSchema = builder.sourceSchema;
            this.state = builder.state;
            this.sub = builder.sub;
            this.targetNames = builder.targetNames;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobStatusJobProgress create() {
            return builder().build();
        }

        /**
         * @return bootTime
         */
        public String getBootTime() {
            return this.bootTime;
        }

        /**
         * @return canSkip
         */
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        /**
         * @return current
         */
        public String getCurrent() {
            return this.current;
        }

        /**
         * @return ddlSql
         */
        public String getDdlSql() {
            return this.ddlSql;
        }

        /**
         * @return delaySeconds
         */
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        /**
         * @return destSchema
         */
        public String getDestSchema() {
            return this.destSchema;
        }

        /**
         * @return diffRow
         */
        public Long getDiffRow() {
            return this.diffRow;
        }

        /**
         * @return errDetail
         */
        public String getErrDetail() {
            return this.errDetail;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ignoreFlag
         */
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return logs
         */
        public java.util.List<SubDistributedJobStatusJobProgressLogs> getLogs() {
            return this.logs;
        }

        /**
         * @return names
         */
        public String getNames() {
            return this.names;
        }

        /**
         * @return orderNum
         */
        public Integer getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return parentObj
         */
        public String getParentObj() {
            return this.parentObj;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        /**
         * @return skip
         */
        public Boolean getSkip() {
            return this.skip;
        }

        /**
         * @return sourceSchema
         */
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return sub
         */
        public String getSub() {
            return this.sub;
        }

        /**
         * @return targetNames
         */
        public String getTargetNames() {
            return this.targetNames;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String bootTime; 
            private Boolean canSkip; 
            private String current; 
            private String ddlSql; 
            private Integer delaySeconds; 
            private String destSchema; 
            private Long diffRow; 
            private String errDetail; 
            private String errMsg; 
            private String finishTime; 
            private String id; 
            private String ignoreFlag; 
            private String item; 
            private String jobId; 
            private java.util.List<SubDistributedJobStatusJobProgressLogs> logs; 
            private String names; 
            private Integer orderNum; 
            private String parentObj; 
            private String repairMethod; 
            private Boolean skip; 
            private String sourceSchema; 
            private String state; 
            private String sub; 
            private String targetNames; 
            private Integer total; 

            /**
             * <p>The time when the subtask was started. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-30T03:36:11.000+00:00</p>
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * <p>Indicates whether the subtask can be ignored if it fails. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * <p>The number of the subtasks that are running.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * <p>The DDL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder ddlSql(String ddlSql) {
                this.ddlSql = ddlSql;
                return this;
            }

            /**
             * <p>The latency of incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delaySeconds(Integer delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * <p>The name of the database to which the object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>databasetest</p>
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * <p>This parameter will be removed in the future.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder diffRow(Long diffRow) {
                this.diffRow = diffRow;
                return this;
            }

            /**
             * <p>The error details of the subtask failure.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ_DETAIL</p>
             */
            public Builder errDetail(String errDetail) {
                this.errDetail = errDetail;
                return this;
            }

            /**
             * <p>The error message of the subtask failure.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS project does not exist odps.`huijin</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The time when the subtask was complete. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-31T03:36:11.000+00:00</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the entry in the metadatabase.</p>
             * 
             * <strong>example:</strong>
             * <p>3890</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether DTS ignores the subtask and proceeds with the next subtask. Valid values:</p>
             * <ul>
             * <li><strong>N</strong>: no.</li>
             * <li><strong>Y</strong>: yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder ignoreFlag(String ignoreFlag) {
                this.ignoreFlag = ignoreFlag;
                return this;
            }

            /**
             * <p>The name of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>login_common_time</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The subtask ID.</p>
             * 
             * <strong>example:</strong>
             * <p>l3m1213ye7l****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The operations logs of errors.</p>
             */
            public Builder logs(java.util.List<SubDistributedJobStatusJobProgressLogs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>The name of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>metricRuleTargets-20180308houe</p>
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * <p>The serial number of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>This parameter will be removed in the future.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder parentObj(String parentObj) {
                this.parentObj = parentObj;
                return this;
            }

            /**
             * <p>The method to fix a precheck failure.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ_REPAIR</p>
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            /**
             * <p>Indicates whether the subtask was ignored. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>The name of the database to which the object in the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>databasetest</p>
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * <p>The status of the subtask. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The subtask is not started.</li>
             * <li><strong>Suspending</strong>: The subtask is paused.</li>
             * <li><strong>Checking</strong>: The subtask is being checked.</li>
             * <li><strong>Migrating</strong>: The subtask is in progress. Data is being migrated.</li>
             * <li><strong>Failed</strong>: The subtask failed.</li>
             * <li><strong>Catched</strong>: The subtask is in progress. Incremental data is being migrated or synchronized.</li>
             * <li><strong>Finished</strong>: The subtask is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The sub-item progress of the subtask.</p>
             * <blockquote>
             * <p>If **[]** is returned, the subtask has no sub-item.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * <p>The names of the objects that are migrated or synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>order</p>
             */
            public Builder targetNames(String targetNames) {
                this.targetNames = targetNames;
                return this;
            }

            /**
             * <p>The total number of subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public SubDistributedJobStatusJobProgress build() {
                return new SubDistributedJobStatusJobProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckStatusResponseBody</p>
     */
    public static class SubDistributedJobStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ErrorItem")
        private Integer errorItem;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobProgress")
        private java.util.List<SubDistributedJobStatusJobProgress> jobProgress;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private SubDistributedJobStatus(Builder builder) {
            this.code = builder.code;
            this.errorItem = builder.errorItem;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.jobProgress = builder.jobProgress;
            this.state = builder.state;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return errorItem
         */
        public Integer getErrorItem() {
            return this.errorItem;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobProgress
         */
        public java.util.List<SubDistributedJobStatusJobProgress> getJobProgress() {
            return this.jobProgress;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String code; 
            private Integer errorItem; 
            private String jobId; 
            private String jobName; 
            private java.util.List<SubDistributedJobStatusJobProgress> jobProgress; 
            private String state; 
            private Integer total; 

            /**
             * <p>The task code that indicates the type of the subtask. Valid values:</p>
             * <ul>
             * <li><strong>01</strong>: precheck.</li>
             * <li><strong>02</strong>: schema migration or initial schema synchronization.</li>
             * <li><strong>03</strong>: full data migration or initial full data synchronization.</li>
             * <li><strong>04</strong>: incremental data migration or synchronization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>02</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The number of subtasks that failed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errorItem(Integer errorItem) {
                this.errorItem = errorItem;
                return this;
            }

            /**
             * <p>The subtask ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n0gm1682j6563np</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The name of distributed subtasks associated with the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.step.struct.load</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The subtasks and the progress of each subtask.</p>
             */
            public Builder jobProgress(java.util.List<SubDistributedJobStatusJobProgress> jobProgress) {
                this.jobProgress = jobProgress;
                return this;
            }

            /**
             * <p>The status of the subtask. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The subtask is not started.</li>
             * <li><strong>Suspending</strong>: The subtask is paused.</li>
             * <li><strong>Checking</strong>: The subtask is being checked.</li>
             * <li><strong>Migrating</strong>: The subtask is in progress. Data is being migrated.</li>
             * <li><strong>Failed</strong>: The subtask failed.</li>
             * <li><strong>Catched</strong>: The subtask is in progress. Incremental data is being migrated or synchronized.</li>
             * <li><strong>Finished</strong>: The subtask is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The total number of entries that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public SubDistributedJobStatus build() {
                return new SubDistributedJobStatus(this);
            } 

        } 

    }
}
