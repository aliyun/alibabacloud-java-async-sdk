// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetDataCheckTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCheckTaskListResponseBody</p>
 */
public class GetDataCheckTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private GetDataCheckTaskListResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCheckTaskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetDataCheckTaskListResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The task list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The page size, which indicates the number of records returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues related to this call.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for details.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that match the query conditions. This parameter is used for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetDataCheckTaskListResponseBody build() {
            return new GetDataCheckTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataCheckTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCheckTaskListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkResult")
        private Integer checkResult;

        @com.aliyun.core.annotation.NameInMap("checkTableNum")
        private Long checkTableNum;

        @com.aliyun.core.annotation.NameInMap("checkTemplateId")
        private String checkTemplateId;

        @com.aliyun.core.annotation.NameInMap("checkType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("dstDsId")
        private String dstDsId;

        @com.aliyun.core.annotation.NameInMap("dstDsName")
        private String dstDsName;

        @com.aliyun.core.annotation.NameInMap("dstDsType")
        private String dstDsType;

        @com.aliyun.core.annotation.NameInMap("dstEngineId")
        private String dstEngineId;

        @com.aliyun.core.annotation.NameInMap("dstEngineName")
        private String dstEngineName;

        @com.aliyun.core.annotation.NameInMap("dstEngineType")
        private String dstEngineType;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("errorTableNum")
        private Long errorTableNum;

        @com.aliyun.core.annotation.NameInMap("execStatus")
        private Integer execStatus;

        @com.aliyun.core.annotation.NameInMap("execTime")
        private String execTime;

        @com.aliyun.core.annotation.NameInMap("executeType")
        private Integer executeType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("isScheduled")
        private Integer isScheduled;

        @com.aliyun.core.annotation.NameInMap("lastBatchId")
        private Long lastBatchId;

        @com.aliyun.core.annotation.NameInMap("lastFinishedId")
        private Long lastFinishedId;

        @com.aliyun.core.annotation.NameInMap("passProcess")
        private java.util.Map<String, ?> passProcess;

        @com.aliyun.core.annotation.NameInMap("process")
        private Double process;

        @com.aliyun.core.annotation.NameInMap("reportTime")
        private String reportTime;

        @com.aliyun.core.annotation.NameInMap("reportTitle")
        private String reportTitle;

        @com.aliyun.core.annotation.NameInMap("skipTableNum")
        private Long skipTableNum;

        @com.aliyun.core.annotation.NameInMap("srcDsId")
        private String srcDsId;

        @com.aliyun.core.annotation.NameInMap("srcDsName")
        private String srcDsName;

        @com.aliyun.core.annotation.NameInMap("srcDsType")
        private String srcDsType;

        @com.aliyun.core.annotation.NameInMap("srcEngineId")
        private String srcEngineId;

        @com.aliyun.core.annotation.NameInMap("srcEngineName")
        private String srcEngineName;

        @com.aliyun.core.annotation.NameInMap("srcEngineType")
        private String srcEngineType;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("successfulTableNum")
        private Long successfulTableNum;

        @com.aliyun.core.annotation.NameInMap("taskDescription")
        private String taskDescription;

        @com.aliyun.core.annotation.NameInMap("taskMode")
        private Integer taskMode;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        private Data(Builder builder) {
            this.checkResult = builder.checkResult;
            this.checkTableNum = builder.checkTableNum;
            this.checkTemplateId = builder.checkTemplateId;
            this.checkType = builder.checkType;
            this.dstDsId = builder.dstDsId;
            this.dstDsName = builder.dstDsName;
            this.dstDsType = builder.dstDsType;
            this.dstEngineId = builder.dstEngineId;
            this.dstEngineName = builder.dstEngineName;
            this.dstEngineType = builder.dstEngineType;
            this.endTime = builder.endTime;
            this.errorMsg = builder.errorMsg;
            this.errorTableNum = builder.errorTableNum;
            this.execStatus = builder.execStatus;
            this.execTime = builder.execTime;
            this.executeType = builder.executeType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isScheduled = builder.isScheduled;
            this.lastBatchId = builder.lastBatchId;
            this.lastFinishedId = builder.lastFinishedId;
            this.passProcess = builder.passProcess;
            this.process = builder.process;
            this.reportTime = builder.reportTime;
            this.reportTitle = builder.reportTitle;
            this.skipTableNum = builder.skipTableNum;
            this.srcDsId = builder.srcDsId;
            this.srcDsName = builder.srcDsName;
            this.srcDsType = builder.srcDsType;
            this.srcEngineId = builder.srcEngineId;
            this.srcEngineName = builder.srcEngineName;
            this.srcEngineType = builder.srcEngineType;
            this.startTime = builder.startTime;
            this.successfulTableNum = builder.successfulTableNum;
            this.taskDescription = builder.taskDescription;
            this.taskMode = builder.taskMode;
            this.taskName = builder.taskName;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkResult
         */
        public Integer getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return checkTableNum
         */
        public Long getCheckTableNum() {
            return this.checkTableNum;
        }

        /**
         * @return checkTemplateId
         */
        public String getCheckTemplateId() {
            return this.checkTemplateId;
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return dstDsId
         */
        public String getDstDsId() {
            return this.dstDsId;
        }

        /**
         * @return dstDsName
         */
        public String getDstDsName() {
            return this.dstDsName;
        }

        /**
         * @return dstDsType
         */
        public String getDstDsType() {
            return this.dstDsType;
        }

        /**
         * @return dstEngineId
         */
        public String getDstEngineId() {
            return this.dstEngineId;
        }

        /**
         * @return dstEngineName
         */
        public String getDstEngineName() {
            return this.dstEngineName;
        }

        /**
         * @return dstEngineType
         */
        public String getDstEngineType() {
            return this.dstEngineType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return errorTableNum
         */
        public Long getErrorTableNum() {
            return this.errorTableNum;
        }

        /**
         * @return execStatus
         */
        public Integer getExecStatus() {
            return this.execStatus;
        }

        /**
         * @return execTime
         */
        public String getExecTime() {
            return this.execTime;
        }

        /**
         * @return executeType
         */
        public Integer getExecuteType() {
            return this.executeType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isScheduled
         */
        public Integer getIsScheduled() {
            return this.isScheduled;
        }

        /**
         * @return lastBatchId
         */
        public Long getLastBatchId() {
            return this.lastBatchId;
        }

        /**
         * @return lastFinishedId
         */
        public Long getLastFinishedId() {
            return this.lastFinishedId;
        }

        /**
         * @return passProcess
         */
        public java.util.Map<String, ?> getPassProcess() {
            return this.passProcess;
        }

        /**
         * @return process
         */
        public Double getProcess() {
            return this.process;
        }

        /**
         * @return reportTime
         */
        public String getReportTime() {
            return this.reportTime;
        }

        /**
         * @return reportTitle
         */
        public String getReportTitle() {
            return this.reportTitle;
        }

        /**
         * @return skipTableNum
         */
        public Long getSkipTableNum() {
            return this.skipTableNum;
        }

        /**
         * @return srcDsId
         */
        public String getSrcDsId() {
            return this.srcDsId;
        }

        /**
         * @return srcDsName
         */
        public String getSrcDsName() {
            return this.srcDsName;
        }

        /**
         * @return srcDsType
         */
        public String getSrcDsType() {
            return this.srcDsType;
        }

        /**
         * @return srcEngineId
         */
        public String getSrcEngineId() {
            return this.srcEngineId;
        }

        /**
         * @return srcEngineName
         */
        public String getSrcEngineName() {
            return this.srcEngineName;
        }

        /**
         * @return srcEngineType
         */
        public String getSrcEngineType() {
            return this.srcEngineType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return successfulTableNum
         */
        public Long getSuccessfulTableNum() {
            return this.successfulTableNum;
        }

        /**
         * @return taskDescription
         */
        public String getTaskDescription() {
            return this.taskDescription;
        }

        /**
         * @return taskMode
         */
        public Integer getTaskMode() {
            return this.taskMode;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private Integer checkResult; 
            private Long checkTableNum; 
            private String checkTemplateId; 
            private Integer checkType; 
            private String dstDsId; 
            private String dstDsName; 
            private String dstDsType; 
            private String dstEngineId; 
            private String dstEngineName; 
            private String dstEngineType; 
            private String endTime; 
            private String errorMsg; 
            private Long errorTableNum; 
            private Integer execStatus; 
            private String execTime; 
            private Integer executeType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Integer isScheduled; 
            private Long lastBatchId; 
            private Long lastFinishedId; 
            private java.util.Map<String, ?> passProcess; 
            private Double process; 
            private String reportTime; 
            private String reportTitle; 
            private Long skipTableNum; 
            private String srcDsId; 
            private String srcDsName; 
            private String srcDsType; 
            private String srcEngineId; 
            private String srcEngineName; 
            private String srcEngineType; 
            private String startTime; 
            private Long successfulTableNum; 
            private String taskDescription; 
            private Integer taskMode; 
            private String taskName; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkResult = model.checkResult;
                this.checkTableNum = model.checkTableNum;
                this.checkTemplateId = model.checkTemplateId;
                this.checkType = model.checkType;
                this.dstDsId = model.dstDsId;
                this.dstDsName = model.dstDsName;
                this.dstDsType = model.dstDsType;
                this.dstEngineId = model.dstEngineId;
                this.dstEngineName = model.dstEngineName;
                this.dstEngineType = model.dstEngineType;
                this.endTime = model.endTime;
                this.errorMsg = model.errorMsg;
                this.errorTableNum = model.errorTableNum;
                this.execStatus = model.execStatus;
                this.execTime = model.execTime;
                this.executeType = model.executeType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.isScheduled = model.isScheduled;
                this.lastBatchId = model.lastBatchId;
                this.lastFinishedId = model.lastFinishedId;
                this.passProcess = model.passProcess;
                this.process = model.process;
                this.reportTime = model.reportTime;
                this.reportTitle = model.reportTitle;
                this.skipTableNum = model.skipTableNum;
                this.srcDsId = model.srcDsId;
                this.srcDsName = model.srcDsName;
                this.srcDsType = model.srcDsType;
                this.srcEngineId = model.srcEngineId;
                this.srcEngineName = model.srcEngineName;
                this.srcEngineType = model.srcEngineType;
                this.startTime = model.startTime;
                this.successfulTableNum = model.successfulTableNum;
                this.taskDescription = model.taskDescription;
                this.taskMode = model.taskMode;
                this.taskName = model.taskName;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The check result. Valid values:</p>
             * <ul>
             * <li>0: no record.</li>
             * <li>1: passed.</li>
             * <li>2: failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkResult(Integer checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The number of checked tables.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder checkTableNum(Long checkTableNum) {
                this.checkTableNum = checkTableNum;
                return this;
            }

            /**
             * <p>The check template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder checkTemplateId(String checkTemplateId) {
                this.checkTemplateId = checkTemplateId;
                return this;
            }

            /**
             * <p>The check type. Valid values:</p>
             * <ul>
             * <li>0: data volume comparison.</li>
             * <li>1: metric comparison.</li>
             * <li>2: weak content comparison.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The destination data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder dstDsId(String dstDsId) {
                this.dstDsId = dstDsId;
                return this;
            }

            /**
             * <p>The destination data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder dstDsName(String dstDsName) {
                this.dstDsName = dstDsName;
                return this;
            }

            /**
             * <p>The destination data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder dstDsType(String dstDsType) {
                this.dstDsType = dstDsType;
                return this;
            }

            /**
             * <p>The destination check engine ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder dstEngineId(String dstEngineId) {
                this.dstEngineId = dstEngineId;
                return this;
            }

            /**
             * <p>The destination check engine name.</p>
             * 
             * <strong>example:</strong>
             * <p>engine_demo</p>
             */
            public Builder dstEngineName(String dstEngineName) {
                this.dstEngineName = dstEngineName;
                return this;
            }

            /**
             * <p>The destination check engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>Tez</p>
             */
            public Builder dstEngineType(String dstEngineType) {
                this.dstEngineType = dstEngineType;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 10:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>connection timeout</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The number of error tables.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder errorTableNum(Long errorTableNum) {
                this.errorTableNum = errorTableNum;
                return this;
            }

            /**
             * <p>The execution status. Valid values:</p>
             * <ul>
             * <li>0: pending.</li>
             * <li>1: running.</li>
             * <li>2: stopped.</li>
             * <li>3: failed.</li>
             * <li>4: completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder execStatus(Integer execStatus) {
                this.execStatus = execStatus;
                return this;
            }

            /**
             * <p>The execution duration.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 10:00:00</p>
             */
            public Builder execTime(String execTime) {
                this.execTime = execTime;
                return this;
            }

            /**
             * <p>The execution type. Valid values:</p>
             * <ul>
             * <li>0: immediate execution.</li>
             * <li>1: scheduled execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder executeType(Integer executeType) {
                this.executeType = executeType;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 10:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modified time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 10:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether scheduling is enabled. Valid values:</p>
             * <ul>
             * <li>0: Disabled.</li>
             * <li>1: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isScheduled(Integer isScheduled) {
                this.isScheduled = isScheduled;
                return this;
            }

            /**
             * <p>The latest batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder lastBatchId(Long lastBatchId) {
                this.lastBatchId = lastBatchId;
                return this;
            }

            /**
             * <p>The latest completed batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>833</p>
             */
            public Builder lastFinishedId(Long lastFinishedId) {
                this.lastFinishedId = lastFinishedId;
                return this;
            }

            /**
             * <p>The check pass rate.</p>
             */
            public Builder passProcess(java.util.Map<String, ?> passProcess) {
                this.passProcess = passProcess;
                return this;
            }

            /**
             * <p>The execution progress (0-1).</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder process(Double process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The report time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 12:00:00</p>
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * <p>The report title.</p>
             * 
             * <strong>example:</strong>
             * <p>Data validation report</p>
             */
            public Builder reportTitle(String reportTitle) {
                this.reportTitle = reportTitle;
                return this;
            }

            /**
             * <p>The number of skipped tables.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder skipTableNum(Long skipTableNum) {
                this.skipTableNum = skipTableNum;
                return this;
            }

            /**
             * <p>The source data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder srcDsId(String srcDsId) {
                this.srcDsId = srcDsId;
                return this;
            }

            /**
             * <p>The source data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder srcDsName(String srcDsName) {
                this.srcDsName = srcDsName;
                return this;
            }

            /**
             * <p>The source data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder srcDsType(String srcDsType) {
                this.srcDsType = srcDsType;
                return this;
            }

            /**
             * <p>The source check engine ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder srcEngineId(String srcEngineId) {
                this.srcEngineId = srcEngineId;
                return this;
            }

            /**
             * <p>The source check engine name.</p>
             * 
             * <strong>example:</strong>
             * <p>engine_demo</p>
             */
            public Builder srcEngineName(String srcEngineName) {
                this.srcEngineName = srcEngineName;
                return this;
            }

            /**
             * <p>The source check engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>Tez</p>
             */
            public Builder srcEngineType(String srcEngineType) {
                this.srcEngineType = srcEngineType;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 10:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The number of successful tables.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder successfulTableNum(Long successfulTableNum) {
                this.successfulTableNum = successfulTableNum;
                return this;
            }

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>Data validation task description</p>
             */
            public Builder taskDescription(String taskDescription) {
                this.taskDescription = taskDescription;
                return this;
            }

            /**
             * <p>The creation mode. Valid values:</p>
             * <ul>
             * <li>0: table-by-table fine-grained mode.</li>
             * <li>1: same-schema batch mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskMode(Integer taskMode) {
                this.taskMode = taskMode;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>data_check_task_demo</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The check template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Row Count Validation Template</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
