// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreCheckStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreCheckStatusResponseBody</p>
 */
public class DescribePreCheckStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorItem")
    private Integer errorItem;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobName")
    private String jobName;

    @NameInMap("JobProgress")
    private java.util.List < JobProgress> jobProgress;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageRecordCount")
    private Long pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    @NameInMap("SubDistributedJobStatus")
    private java.util.List < SubDistributedJobStatus> subDistributedJobStatus;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribePreCheckStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorItem = builder.errorItem;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.jobProgress = builder.jobProgress;
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
        private String code; 
        private Integer errorItem; 
        private Integer httpStatusCode; 
        private String jobId; 
        private String jobName; 
        private java.util.List < JobProgress> jobProgress; 
        private Long pageNumber; 
        private Long pageRecordCount; 
        private String requestId; 
        private String state; 
        private java.util.List < SubDistributedJobStatus> subDistributedJobStatus; 
        private Boolean success; 
        private Integer total; 
        private Long totalRecordCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorItem.
         */
        public Builder errorItem(Integer errorItem) {
            this.errorItem = errorItem;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * JobName.
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * JobProgress.
         */
        public Builder jobProgress(java.util.List < JobProgress> jobProgress) {
            this.jobProgress = jobProgress;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Long pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * SubDistributedJobStatus.
         */
        public Builder subDistributedJobStatus(java.util.List < SubDistributedJobStatus> subDistributedJobStatus) {
            this.subDistributedJobStatus = subDistributedJobStatus;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * TotalRecordCount.
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
        @NameInMap("ErrData")
        private String errData;

        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("ErrType")
        private String errType;

        @NameInMap("LogLevel")
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
    public static class JobProgress extends TeaModel {
        @NameInMap("BootTime")
        private String bootTime;

        @NameInMap("CanSkip")
        private Boolean canSkip;

        @NameInMap("DdlSql")
        private String ddlSql;

        @NameInMap("DelaySeconds")
        private Integer delaySeconds;

        @NameInMap("DestSchema")
        private String destSchema;

        @NameInMap("DiffRow")
        private Long diffRow;

        @NameInMap("ErrDetail")
        private String errDetail;

        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("IgnoreFlag")
        private String ignoreFlag;

        @NameInMap("Item")
        private String item;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Logs")
        private java.util.List < Logs> logs;

        @NameInMap("Names")
        private String names;

        @NameInMap("OrderNum")
        private Integer orderNum;

        @NameInMap("ParentObj")
        private String parentObj;

        @NameInMap("RepairMethod")
        private String repairMethod;

        @NameInMap("Skip")
        private Boolean skip;

        @NameInMap("SourceSchema")
        private String sourceSchema;

        @NameInMap("State")
        private String state;

        @NameInMap("Sub")
        private String sub;

        @NameInMap("TargetNames")
        private String targetNames;

        @NameInMap("Total")
        private Integer total;

        private JobProgress(Builder builder) {
            this.bootTime = builder.bootTime;
            this.canSkip = builder.canSkip;
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
             * JobId.
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
             * State.
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
             * Total.
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
    public static class JobProgressLogs extends TeaModel {
        @NameInMap("ErrData")
        private String errData;

        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("ErrType")
        private String errType;

        @NameInMap("LogLevel")
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
    public static class SubDistributedJobStatusJobProgress extends TeaModel {
        @NameInMap("BootTime")
        private String bootTime;

        @NameInMap("CanSkip")
        private Boolean canSkip;

        @NameInMap("DdlSql")
        private String ddlSql;

        @NameInMap("DelaySeconds")
        private Integer delaySeconds;

        @NameInMap("DestSchema")
        private String destSchema;

        @NameInMap("DiffRow")
        private Long diffRow;

        @NameInMap("ErrDetail")
        private String errDetail;

        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("IgnoreFlag")
        private String ignoreFlag;

        @NameInMap("Item")
        private String item;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Logs")
        private java.util.List < JobProgressLogs> logs;

        @NameInMap("Names")
        private String names;

        @NameInMap("OrderNum")
        private Integer orderNum;

        @NameInMap("ParentObj")
        private String parentObj;

        @NameInMap("RepairMethod")
        private String repairMethod;

        @NameInMap("Skip")
        private Boolean skip;

        @NameInMap("SourceSchema")
        private String sourceSchema;

        @NameInMap("State")
        private String state;

        @NameInMap("Sub")
        private String sub;

        @NameInMap("TargetNames")
        private String targetNames;

        @NameInMap("Total")
        private Integer total;

        private SubDistributedJobStatusJobProgress(Builder builder) {
            this.bootTime = builder.bootTime;
            this.canSkip = builder.canSkip;
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
             * JobId.
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
             * State.
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
             * Total.
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
        @NameInMap("Code")
        private String code;

        @NameInMap("ErrorItem")
        private Integer errorItem;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("JobProgress")
        private java.util.List < SubDistributedJobStatusJobProgress> jobProgress;

        @NameInMap("State")
        private String state;

        @NameInMap("Total")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ErrorItem.
             */
            public Builder errorItem(Integer errorItem) {
                this.errorItem = errorItem;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * JobProgress.
             */
            public Builder jobProgress(java.util.List < SubDistributedJobStatusJobProgress> jobProgress) {
                this.jobProgress = jobProgress;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Total.
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
