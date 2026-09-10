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
 * {@link ListDataCheckTaskHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCheckTaskHistoryResponseBody</p>
 */
public class ListDataCheckTaskHistoryResponseBody extends TeaModel {
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

    private ListDataCheckTaskHistoryResponseBody(Builder builder) {
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

    public static ListDataCheckTaskHistoryResponseBody create() {
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

        private Builder(ListDataCheckTaskHistoryResponseBody model) {
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
         * <p>The data list returned by the operation. For the element structure, see the child field descriptions.</p>
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
         * <p>The page size, which is the number of records returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for troubleshooting.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that match the query conditions. This value is used for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataCheckTaskHistoryResponseBody build() {
            return new ListDataCheckTaskHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCheckTaskHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCheckTaskHistoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchId")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("biz")
        private String biz;

        @com.aliyun.core.annotation.NameInMap("checkResult")
        private Integer checkResult;

        @com.aliyun.core.annotation.NameInMap("checkTableNum")
        private Long checkTableNum;

        @com.aliyun.core.annotation.NameInMap("concurrency")
        private Long concurrency;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("cronExp")
        private String cronExp;

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

        @com.aliyun.core.annotation.NameInMap("extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("originBatchId")
        private Long originBatchId;

        @com.aliyun.core.annotation.NameInMap("passProcess")
        private Double passProcess;

        @com.aliyun.core.annotation.NameInMap("passProcessExport")
        private String passProcessExport;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Double progress;

        @com.aliyun.core.annotation.NameInMap("reportTime")
        private String reportTime;

        @com.aliyun.core.annotation.NameInMap("reportTitle")
        private String reportTitle;

        @com.aliyun.core.annotation.NameInMap("scheduleId")
        private Long scheduleId;

        @com.aliyun.core.annotation.NameInMap("seqId")
        private String seqId;

        @com.aliyun.core.annotation.NameInMap("skipTableNum")
        private Integer skipTableNum;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("successfulTableNum")
        private Long successfulTableNum;

        private Data(Builder builder) {
            this.batchId = builder.batchId;
            this.biz = builder.biz;
            this.checkResult = builder.checkResult;
            this.checkTableNum = builder.checkTableNum;
            this.concurrency = builder.concurrency;
            this.creator = builder.creator;
            this.cronExp = builder.cronExp;
            this.endTime = builder.endTime;
            this.errorMsg = builder.errorMsg;
            this.errorTableNum = builder.errorTableNum;
            this.execStatus = builder.execStatus;
            this.execTime = builder.execTime;
            this.extra = builder.extra;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.operator = builder.operator;
            this.originBatchId = builder.originBatchId;
            this.passProcess = builder.passProcess;
            this.passProcessExport = builder.passProcessExport;
            this.progress = builder.progress;
            this.reportTime = builder.reportTime;
            this.reportTitle = builder.reportTitle;
            this.scheduleId = builder.scheduleId;
            this.seqId = builder.seqId;
            this.skipTableNum = builder.skipTableNum;
            this.startTime = builder.startTime;
            this.successfulTableNum = builder.successfulTableNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public Long getBatchId() {
            return this.batchId;
        }

        /**
         * @return biz
         */
        public String getBiz() {
            return this.biz;
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
         * @return concurrency
         */
        public Long getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return cronExp
         */
        public String getCronExp() {
            return this.cronExp;
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
         * @return extra
         */
        public String getExtra() {
            return this.extra;
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
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return originBatchId
         */
        public Long getOriginBatchId() {
            return this.originBatchId;
        }

        /**
         * @return passProcess
         */
        public Double getPassProcess() {
            return this.passProcess;
        }

        /**
         * @return passProcessExport
         */
        public String getPassProcessExport() {
            return this.passProcessExport;
        }

        /**
         * @return progress
         */
        public Double getProgress() {
            return this.progress;
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
         * @return scheduleId
         */
        public Long getScheduleId() {
            return this.scheduleId;
        }

        /**
         * @return seqId
         */
        public String getSeqId() {
            return this.seqId;
        }

        /**
         * @return skipTableNum
         */
        public Integer getSkipTableNum() {
            return this.skipTableNum;
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

        public static final class Builder {
            private Long batchId; 
            private String biz; 
            private Integer checkResult; 
            private Long checkTableNum; 
            private Long concurrency; 
            private String creator; 
            private String cronExp; 
            private String endTime; 
            private String errorMsg; 
            private Long errorTableNum; 
            private Integer execStatus; 
            private String execTime; 
            private String extra; 
            private String gmtCreate; 
            private String gmtModified; 
            private String operator; 
            private Long originBatchId; 
            private Double passProcess; 
            private String passProcessExport; 
            private Double progress; 
            private String reportTime; 
            private String reportTitle; 
            private Long scheduleId; 
            private String seqId; 
            private Integer skipTableNum; 
            private String startTime; 
            private Long successfulTableNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.batchId = model.batchId;
                this.biz = model.biz;
                this.checkResult = model.checkResult;
                this.checkTableNum = model.checkTableNum;
                this.concurrency = model.concurrency;
                this.creator = model.creator;
                this.cronExp = model.cronExp;
                this.endTime = model.endTime;
                this.errorMsg = model.errorMsg;
                this.errorTableNum = model.errorTableNum;
                this.execStatus = model.execStatus;
                this.execTime = model.execTime;
                this.extra = model.extra;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.operator = model.operator;
                this.originBatchId = model.originBatchId;
                this.passProcess = model.passProcess;
                this.passProcessExport = model.passProcessExport;
                this.progress = model.progress;
                this.reportTime = model.reportTime;
                this.reportTitle = model.reportTitle;
                this.scheduleId = model.scheduleId;
                this.seqId = model.seqId;
                this.skipTableNum = model.skipTableNum;
                this.startTime = model.startTime;
                this.successfulTableNum = model.successfulTableNum;
            } 

            /**
             * <p>The batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The business field.</p>
             * 
             * <strong>example:</strong>
             * <p>lhm</p>
             */
            public Builder biz(String biz) {
                this.biz = biz;
                return this;
            }

            /**
             * <p>The execution result. Valid values: no record, passed, or not passed.</p>
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
             * <p>The concurrency of the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder concurrency(Long concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>user001</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The scheduling cycle expression.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 * * ?</p>
             */
            public Builder cronExp(String cronExp) {
                this.cronExp = cronExp;
                return this;
            }

            /**
             * <p>The end time, in the format of YYYY-MM-DD HH:MM:SS.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 12:00:00</p>
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
             * <p>The execution status. Valid values: pending, running, stopped, failed, or completed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder execStatus(Integer execStatus) {
                this.execStatus = execStatus;
                return this;
            }

            /**
             * <p>The execution duration, in the format of HH:MM:SS.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 10:00:00</p>
             */
            public Builder execTime(String execTime) {
                this.execTime = execTime;
                return this;
            }

            /**
             * <p>The reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
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
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 10:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The updater.</p>
             * 
             * <strong>example:</strong>
             * <p>user001</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The original batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder originBatchId(Long originBatchId) {
                this.originBatchId = originBatchId;
                return this;
            }

            /**
             * <p>The check pass rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.95</p>
             */
            public Builder passProcess(Double passProcess) {
                this.passProcess = passProcess;
                return this;
            }

            /**
             * <p>The pass rate (export report field), calculated by dividing the number of passed tables by the total number of checked tables. The value is returned as a string with a percent sign and two decimal places (for example, 100.00%). If no checked table data exists, the value is -.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00%</p>
             */
            public Builder passProcessExport(String passProcessExport) {
                this.passProcessExport = passProcessExport;
                return this;
            }

            /**
             * <p>The task progress.</p>
             * 
             * <strong>example:</strong>
             * <p>0.95</p>
             */
            public Builder progress(Double progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The check report time, which is the completion time of the last job.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 12:00:00</p>
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * <p>The check report title.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Validation Report</p>
             */
            public Builder reportTitle(String reportTitle) {
                this.reportTitle = reportTitle;
                return this;
            }

            /**
             * <p>The scheduled task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder scheduleId(Long scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            /**
             * <p>The task number.</p>
             * 
             * <strong>example:</strong>
             * <p>SEQ20260116001</p>
             */
            public Builder seqId(String seqId) {
                this.seqId = seqId;
                return this;
            }

            /**
             * <p>The number of skipped tables.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder skipTableNum(Integer skipTableNum) {
                this.skipTableNum = skipTableNum;
                return this;
            }

            /**
             * <p>The start time, in the format of YYYY-MM-DD HH:MM:SS.</p>
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
