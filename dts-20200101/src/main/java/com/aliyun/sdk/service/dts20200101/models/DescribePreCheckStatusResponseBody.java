// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreCheckStatusResponseBody</p>
 */
public class DescribePreCheckStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnalysisJobProgress")
    private java.util.List < AnalysisJobProgress> analysisJobProgress;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorAnalysisItem")
    private Integer errorAnalysisItem;

    @com.aliyun.core.annotation.NameInMap("ErrorItem")
    private Integer errorItem;

    @com.aliyun.core.annotation.NameInMap("FullNetCheckJobStatus")
    private java.util.List < FullNetCheckJobStatus> fullNetCheckJobStatus;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.NameInMap("JobProgress")
    private java.util.List < JobProgress> jobProgress;

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
    private java.util.List < SubDistributedJobStatus> subDistributedJobStatus;

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
    public java.util.List < AnalysisJobProgress> getAnalysisJobProgress() {
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
    public java.util.List < FullNetCheckJobStatus> getFullNetCheckJobStatus() {
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
    public java.util.List < JobProgress> getJobProgress() {
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
    public java.util.List < SubDistributedJobStatus> getSubDistributedJobStatus() {
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
        private java.util.List < AnalysisJobProgress> analysisJobProgress; 
        private String code; 
        private Integer errorAnalysisItem; 
        private Integer errorItem; 
        private java.util.List < FullNetCheckJobStatus> fullNetCheckJobStatus; 
        private Integer httpStatusCode; 
        private String jobId; 
        private String jobName; 
        private java.util.List < JobProgress> jobProgress; 
        private NetworkDiagnosisResult networkDiagnosisResult; 
        private Long pageNumber; 
        private Long pageRecordCount; 
        private String requestId; 
        private String state; 
        private java.util.List < SubDistributedJobStatus> subDistributedJobStatus; 
        private Boolean success; 
        private Integer total; 
        private Long totalRecordCount; 

        /**
         * AnalysisJobProgress.
         */
        public Builder analysisJobProgress(java.util.List < AnalysisJobProgress> analysisJobProgress) {
            this.analysisJobProgress = analysisJobProgress;
            return this;
        }

        /**
         * The task code that indicates the subtask type. Valid values:
         * <p>
         * 
         * *   **01**: precheck
         * *   **02**: schema migration or initial schema synchronization
         * *   **03**: full data migration or initial full data synchronization
         * *   **04**: incremental data migration or synchronization
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorAnalysisItem.
         */
        public Builder errorAnalysisItem(Integer errorAnalysisItem) {
            this.errorAnalysisItem = errorAnalysisItem;
            return this;
        }

        /**
         * The total number of subtask failures.
         */
        public Builder errorItem(Integer errorItem) {
            this.errorItem = errorItem;
            return this;
        }

        /**
         * FullNetCheckJobStatus.
         */
        public Builder fullNetCheckJobStatus(java.util.List < FullNetCheckJobStatus> fullNetCheckJobStatus) {
            this.fullNetCheckJobStatus = fullNetCheckJobStatus;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the data migration or synchronization task.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * The name of the subtask.
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * The list of subtasks and the progress of each subtask.
         */
        public Builder jobProgress(java.util.List < JobProgress> jobProgress) {
            this.jobProgress = jobProgress;
            return this;
        }

        /**
         * NetworkDiagnosisResult.
         */
        public Builder networkDiagnosisResult(NetworkDiagnosisResult networkDiagnosisResult) {
            this.networkDiagnosisResult = networkDiagnosisResult;
            return this;
        }

        /**
         * The number of the page returned. The value is an integer that is greater than **0** and does not exceed the maximum value of the Integer data type. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Long pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * The status of the subtask. Valid values:
         * <p>
         * 
         * *   **NotStarted**: The subtask is not started.
         * *   **Suspending**: The subtask is paused.
         * *   **Checking**: The subtask is being checked.
         * *   **Migrating**: The subtask is in progress. Data is being migrated.
         * *   **Failed**: The subtask failed.
         * *   **Catched**: The subtask is in progress. Incremental data is being migrated or synchronized.
         * *   **Finished**: The subtask is complete.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The state of the distributed subtask.
         */
        public Builder subDistributedJobStatus(java.util.List < SubDistributedJobStatus> subDistributedJobStatus) {
            this.subDistributedJobStatus = subDistributedJobStatus;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of subtasks.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * The total number of returned records.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribePreCheckStatusResponseBody build() {
            return new DescribePreCheckStatusResponseBody(this);
        } 

    } 

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
             * ErrData.
             */
            public Builder errData(String errData) {
                this.errData = errData;
                return this;
            }

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * ErrType.
             */
            public Builder errType(String errType) {
                this.errType = errType;
                return this;
            }

            /**
             * LogLevel.
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
        private java.util.List < Logs> logs;

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
        public java.util.List < Logs> getLogs() {
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
            private java.util.List < Logs> logs; 
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
             * BootTime.
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * CanSkip.
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * Current.
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * DdlSql.
             */
            public Builder ddlSql(String ddlSql) {
                this.ddlSql = ddlSql;
                return this;
            }

            /**
             * DelaySeconds.
             */
            public Builder delaySeconds(Integer delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * DestSchema.
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * DiffRow.
             */
            public Builder diffRow(Long diffRow) {
                this.diffRow = diffRow;
                return this;
            }

            /**
             * ErrDetail.
             */
            public Builder errDetail(String errDetail) {
                this.errDetail = errDetail;
                return this;
            }

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IgnoreFlag.
             */
            public Builder ignoreFlag(String ignoreFlag) {
                this.ignoreFlag = ignoreFlag;
                return this;
            }

            /**
             * Item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The ID of the data migration or synchronization task.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List < Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Names.
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * OrderNum.
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * ParentObj.
             */
            public Builder parentObj(String parentObj) {
                this.parentObj = parentObj;
                return this;
            }

            /**
             * RepairMethod.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            /**
             * Skip.
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * SourceSchema.
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * The status of the subtask. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The subtask is not started.
             * *   **Suspending**: The subtask is paused.
             * *   **Checking**: The subtask is being checked.
             * *   **Migrating**: The subtask is in progress. Data is being migrated.
             * *   **Failed**: The subtask failed.
             * *   **Catched**: The subtask is in progress. Incremental data is being migrated or synchronized.
             * *   **Finished**: The subtask is complete.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Sub.
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * TargetNames.
             */
            public Builder targetNames(String targetNames) {
                this.targetNames = targetNames;
                return this;
            }

            /**
             * The total number of subtasks.
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
             * ErrData.
             */
            public Builder errData(String errData) {
                this.errData = errData;
                return this;
            }

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * ErrType.
             */
            public Builder errType(String errType) {
                this.errType = errType;
                return this;
            }

            /**
             * LogLevel.
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
        private java.util.List < JobProgressLogs> logs;

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
        public java.util.List < JobProgressLogs> getLogs() {
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
            private java.util.List < JobProgressLogs> logs; 
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
             * BootTime.
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * CanSkip.
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * Current.
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * DdlSql.
             */
            public Builder ddlSql(String ddlSql) {
                this.ddlSql = ddlSql;
                return this;
            }

            /**
             * DelaySeconds.
             */
            public Builder delaySeconds(Integer delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * DestSchema.
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * DiffRow.
             */
            public Builder diffRow(Long diffRow) {
                this.diffRow = diffRow;
                return this;
            }

            /**
             * ErrDetail.
             */
            public Builder errDetail(String errDetail) {
                this.errDetail = errDetail;
                return this;
            }

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IgnoreFlag.
             */
            public Builder ignoreFlag(String ignoreFlag) {
                this.ignoreFlag = ignoreFlag;
                return this;
            }

            /**
             * Item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The ID of the data migration or synchronization task.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List < JobProgressLogs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Names.
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * OrderNum.
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * ParentObj.
             */
            public Builder parentObj(String parentObj) {
                this.parentObj = parentObj;
                return this;
            }

            /**
             * RepairMethod.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            /**
             * Skip.
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * SourceSchema.
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * The status of the subtask. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The subtask is not started.
             * *   **Suspending**: The subtask is paused.
             * *   **Checking**: The subtask is being checked.
             * *   **Migrating**: The subtask is in progress. Data is being migrated.
             * *   **Failed**: The subtask failed.
             * *   **Catched**: The subtask is in progress. Incremental data is being migrated or synchronized.
             * *   **Finished**: The subtask is complete.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Sub.
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * TargetNames.
             */
            public Builder targetNames(String targetNames) {
                this.targetNames = targetNames;
                return this;
            }

            /**
             * The total number of subtasks.
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
        private java.util.List < FullNetCheckJobStatusJobProgress> jobProgress;

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
        public java.util.List < FullNetCheckJobStatusJobProgress> getJobProgress() {
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
            private java.util.List < FullNetCheckJobStatusJobProgress> jobProgress; 
            private String sourceEndpointType; 
            private String srcRegion; 
            private String srcRegionCidr; 
            private String state; 
            private Integer total; 

            /**
             * The task code that indicates the subtask type. Valid values:
             * <p>
             * 
             * *   **01**: precheck
             * *   **02**: schema migration or initial schema synchronization
             * *   **03**: full data migration or initial full data synchronization
             * *   **04**: incremental data migration or synchronization
             */
            public Builder code(String code) {
                this.code = code;
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
             * DestRegionCidr.
             */
            public Builder destRegionCidr(String destRegionCidr) {
                this.destRegionCidr = destRegionCidr;
                return this;
            }

            /**
             * DestinationEndpointType.
             */
            public Builder destinationEndpointType(String destinationEndpointType) {
                this.destinationEndpointType = destinationEndpointType;
                return this;
            }

            /**
             * The total number of subtask failures.
             */
            public Builder errorItem(Integer errorItem) {
                this.errorItem = errorItem;
                return this;
            }

            /**
             * HostRegion.
             */
            public Builder hostRegion(String hostRegion) {
                this.hostRegion = hostRegion;
                return this;
            }

            /**
             * The ID of the data migration or synchronization task.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The name of the subtask.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * The list of subtasks and the progress of each subtask.
             */
            public Builder jobProgress(java.util.List < FullNetCheckJobStatusJobProgress> jobProgress) {
                this.jobProgress = jobProgress;
                return this;
            }

            /**
             * SourceEndpointType.
             */
            public Builder sourceEndpointType(String sourceEndpointType) {
                this.sourceEndpointType = sourceEndpointType;
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
             * SrcRegionCidr.
             */
            public Builder srcRegionCidr(String srcRegionCidr) {
                this.srcRegionCidr = srcRegionCidr;
                return this;
            }

            /**
             * The status of the subtask. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The subtask is not started.
             * *   **Suspending**: The subtask is paused.
             * *   **Checking**: The subtask is being checked.
             * *   **Migrating**: The subtask is in progress. Data is being migrated.
             * *   **Failed**: The subtask failed.
             * *   **Catched**: The subtask is in progress. Incremental data is being migrated or synchronized.
             * *   **Finished**: The subtask is complete.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The total number of subtasks.
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
             * The error message.
             */
            public Builder errData(String errData) {
                this.errData = errData;
                return this;
            }

            /**
             * The error message returned when an error occurs on the subtask.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * The error type.
             */
            public Builder errType(String errType) {
                this.errType = errType;
                return this;
            }

            /**
             * The level of logs.
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
        private java.util.List < DescribePreCheckStatusResponseBodyJobProgressLogs> logs;

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
        public java.util.List < DescribePreCheckStatusResponseBodyJobProgressLogs> getLogs() {
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
            private java.util.List < DescribePreCheckStatusResponseBodyJobProgressLogs> logs; 
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
             * The time when the subtask was started. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * Indicates whether the subtask can be ignored if it fails.
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * The number of the subtasks that are running.
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * The DDL statements.
             */
            public Builder ddlSql(String ddlSql) {
                this.ddlSql = ddlSql;
                return this;
            }

            /**
             * The latency of incremental data migration or synchronization.
             * <p>
             * 
             * >  For data migration tasks, the unit of this parameter is milliseconds. For data synchronization tasks, the unit of this parameter is seconds.
             */
            public Builder delaySeconds(Integer delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * The name of the database to which the object in the destination instance belongs.
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * This parameter will be removed in the future.
             */
            public Builder diffRow(Long diffRow) {
                this.diffRow = diffRow;
                return this;
            }

            /**
             * The error details of the subtask failure.
             */
            public Builder errDetail(String errDetail) {
                this.errDetail = errDetail;
                return this;
            }

            /**
             * The error message of the subtask failure.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * The time when the subtask was complete. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The ID recorded in the metadatabase.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether DTS ignores the subtask and proceeds with the next subtask. Valid values:
             * <p>
             * 
             * *   **N**: no
             * *   **Y**: yes
             */
            public Builder ignoreFlag(String ignoreFlag) {
                this.ignoreFlag = ignoreFlag;
                return this;
            }

            /**
             * The shortened name of the subtask.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The ID of the subtask.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The logs of subtask failures.
             */
            public Builder logs(java.util.List < DescribePreCheckStatusResponseBodyJobProgressLogs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * The name of the subtask.
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * The serial number of the subtask.
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * This parameter will be removed in the future.
             */
            public Builder parentObj(String parentObj) {
                this.parentObj = parentObj;
                return this;
            }

            /**
             * The method to fix the subtask failure.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            /**
             * Indicates whether the subtask is ignored if it fails. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * The name of the database to which the object in the source instance belongs.
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * The status of the subtask. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The subtask is not started.
             * *   **Checking**: The subtask is being checked.
             * *   **Migrating**: The subtask is in progress. Data is being migrated.
             * *   **Failed**: The subtask failed.
             * *   **Warning**: The subtask encounters an exception.
             * *   **Success**: The subtask is complete.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The sub-item progress of the subtask.
             * <p>
             * 
             * >  If **\[]** is returned, the subtask has no sub-items.
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * The names of the objects that are migrated or synchronized.
             */
            public Builder targetNames(String targetNames) {
                this.targetNames = targetNames;
                return this;
            }

            /**
             * The total number of subtasks.
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
             * CnDocUrl.
             */
            public Builder cnDocUrl(String cnDocUrl) {
                this.cnDocUrl = cnDocUrl;
                return this;
            }

            /**
             * The task code that indicates the subtask type. Valid values:
             * <p>
             * 
             * *   **01**: precheck
             * *   **02**: schema migration or initial schema synchronization
             * *   **03**: full data migration or initial full data synchronization
             * *   **04**: incremental data migration or synchronization
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * EndpointType.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * InternationalDocUrl.
             */
            public Builder internationalDocUrl(String internationalDocUrl) {
                this.internationalDocUrl = internationalDocUrl;
                return this;
            }

            /**
             * Result.
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
    public static class NetworkDiagnosisResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Diagnosis")
        private java.util.List < Diagnosis> diagnosis;

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
        public java.util.List < Diagnosis> getDiagnosis() {
            return this.diagnosis;
        }

        /**
         * @return modelVersion
         */
        public String getModelVersion() {
            return this.modelVersion;
        }

        public static final class Builder {
            private java.util.List < Diagnosis> diagnosis; 
            private String modelVersion; 

            /**
             * Diagnosis.
             */
            public Builder diagnosis(java.util.List < Diagnosis> diagnosis) {
                this.diagnosis = diagnosis;
                return this;
            }

            /**
             * ModelVersion.
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
             * The record of errors.
             */
            public Builder errData(String errData) {
                this.errData = errData;
                return this;
            }

            /**
             * The error message.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * The error type.
             */
            public Builder errType(String errType) {
                this.errType = errType;
                return this;
            }

            /**
             * The level of logs.
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
        private java.util.List < SubDistributedJobStatusJobProgressLogs> logs;

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
        public java.util.List < SubDistributedJobStatusJobProgressLogs> getLogs() {
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
            private java.util.List < SubDistributedJobStatusJobProgressLogs> logs; 
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
             * The time when the subtask was started. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * Indicates whether the subtask can be ignored if it fails. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * The number of the subtasks that are running.
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * The DDL statements.
             */
            public Builder ddlSql(String ddlSql) {
                this.ddlSql = ddlSql;
                return this;
            }

            /**
             * The latency of incremental data migration or synchronization.
             */
            public Builder delaySeconds(Integer delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * The name of the database to which the object in the destination instance belongs.
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * This parameter will be removed in the future.
             */
            public Builder diffRow(Long diffRow) {
                this.diffRow = diffRow;
                return this;
            }

            /**
             * The error details of the subtask failure.
             */
            public Builder errDetail(String errDetail) {
                this.errDetail = errDetail;
                return this;
            }

            /**
             * The error message of the subtask failure.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * The time when the instance was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The ID of the entry in the metadatabase.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether DTS ignores the subtask and proceeds with the next subtask. Valid values:
             * <p>
             * 
             * *   **N**: no
             * *   **Y**: yes
             */
            public Builder ignoreFlag(String ignoreFlag) {
                this.ignoreFlag = ignoreFlag;
                return this;
            }

            /**
             * The name of the subtask.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The ID of the subtask.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The operations logs of errors.
             */
            public Builder logs(java.util.List < SubDistributedJobStatusJobProgressLogs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * The name of the subtask.
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * The serial number of the subtask.
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * This parameter will be removed in the future.
             */
            public Builder parentObj(String parentObj) {
                this.parentObj = parentObj;
                return this;
            }

            /**
             * The method used to fix a precheck failure.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            /**
             * Indicates whether the subtask was skipped. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * The name of the database to which the object in the source instance belongs.
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * The status of the subtask. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The subtask is not started.
             * *   **Suspending**: The subtask is paused.
             * *   **Checking**: The subtask is being checked.
             * *   **Migrating**: The subtask is in progress. Data is being migrated.
             * *   **Failed**: The subtask failed.
             * *   **Catched**: The subtask is in progress. Incremental data is being migrated or synchronized.
             * *   **Finished**: The subtask is complete.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The sub-item progress of the subtask.
             * <p>
             * 
             * >  If **\[]** is returned, the subtask has no sub-items.
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * The names of the objects that are migrated or synchronized.
             */
            public Builder targetNames(String targetNames) {
                this.targetNames = targetNames;
                return this;
            }

            /**
             * The total number of subtasks.
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
        private java.util.List < SubDistributedJobStatusJobProgress> jobProgress;

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
        public java.util.List < SubDistributedJobStatusJobProgress> getJobProgress() {
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
            private java.util.List < SubDistributedJobStatusJobProgress> jobProgress; 
            private String state; 
            private Integer total; 

            /**
             * The task code that indicates the subtask type. Valid values:
             * <p>
             * 
             * *   **01**: precheck
             * *   **02**: schema migration or initial schema synchronization
             * *   **03**: full data migration or initial full data synchronization
             * *   **04**: incremental data migration or synchronization
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The number of subtasks that failed.
             */
            public Builder errorItem(Integer errorItem) {
                this.errorItem = errorItem;
                return this;
            }

            /**
             * The ID of the subtask.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The name of distributed subtasks associated with the subtask.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * The list of subtasks and the progress of each subtask.
             */
            public Builder jobProgress(java.util.List < SubDistributedJobStatusJobProgress> jobProgress) {
                this.jobProgress = jobProgress;
                return this;
            }

            /**
             * The status of the subtask. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The subtask is not started.
             * *   **Suspending**: The subtask is paused.
             * *   **Checking**: The subtask is being checked.
             * *   **Migrating**: The subtask is in progress. Data is being migrated.
             * *   **Failed**: The subtask failed.
             * *   **Catched**: The subtask is in progress. Incremental data is being migrated or synchronized.
             * *   **Finished**: The subtask is complete.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The total number of returned entries.
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
