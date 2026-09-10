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
 * {@link GetDataCheckReportOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCheckReportOverviewResponseBody</p>
 */
public class GetDataCheckReportOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetDataCheckReportOverviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCheckReportOverviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
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

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataCheckReportOverviewResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The fault information code.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>not supported.pos 5459, line 196, column 14, token IDENTIFIER settings</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The request ID. This value uniquely identifies the call. Provide this value when troubleshooting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>FFF386FC-295C-5D2E-B2FE-410003095F06</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCheckReportOverviewResponseBody build() {
            return new GetDataCheckReportOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataCheckReportOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCheckReportOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchId")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("checkColumnCount")
        private Long checkColumnCount;

        @com.aliyun.core.annotation.NameInMap("checkPtCount")
        private Long checkPtCount;

        @com.aliyun.core.annotation.NameInMap("checkResult")
        private Integer checkResult;

        @com.aliyun.core.annotation.NameInMap("checkRowCount")
        private Long checkRowCount;

        @com.aliyun.core.annotation.NameInMap("checkRowPassCount")
        private Long checkRowPassCount;

        @com.aliyun.core.annotation.NameInMap("checkRowPassExport")
        private String checkRowPassExport;

        @com.aliyun.core.annotation.NameInMap("checkSqlNum")
        private Long checkSqlNum;

        @com.aliyun.core.annotation.NameInMap("checkTableNum")
        private Long checkTableNum;

        @com.aliyun.core.annotation.NameInMap("checkTemplateId")
        private String checkTemplateId;

        @com.aliyun.core.annotation.NameInMap("checkTemplateName")
        private String checkTemplateName;

        @com.aliyun.core.annotation.NameInMap("checkType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("dstDsName")
        private String dstDsName;

        @com.aliyun.core.annotation.NameInMap("dstDsType")
        private String dstDsType;

        @com.aliyun.core.annotation.NameInMap("errorTableNum")
        private Long errorTableNum;

        @com.aliyun.core.annotation.NameInMap("passColumnCount")
        private Long passColumnCount;

        @com.aliyun.core.annotation.NameInMap("passColumnRate")
        private Double passColumnRate;

        @com.aliyun.core.annotation.NameInMap("passProcess")
        private Double passProcess;

        @com.aliyun.core.annotation.NameInMap("passProcessExport")
        private String passProcessExport;

        @com.aliyun.core.annotation.NameInMap("passPtNum")
        private Long passPtNum;

        @com.aliyun.core.annotation.NameInMap("passPtProcessExport")
        private String passPtProcessExport;

        @com.aliyun.core.annotation.NameInMap("passTableNum")
        private Long passTableNum;

        @com.aliyun.core.annotation.NameInMap("ptPassProcess")
        private Double ptPassProcess;

        @com.aliyun.core.annotation.NameInMap("reportGenerateMessage")
        private String reportGenerateMessage;

        @com.aliyun.core.annotation.NameInMap("reportStatus")
        private Integer reportStatus;

        @com.aliyun.core.annotation.NameInMap("reportTime")
        private String reportTime;

        @com.aliyun.core.annotation.NameInMap("reportTitle")
        private String reportTitle;

        @com.aliyun.core.annotation.NameInMap("skipPtNum")
        private Long skipPtNum;

        @com.aliyun.core.annotation.NameInMap("skipTableNum")
        private Integer skipTableNum;

        @com.aliyun.core.annotation.NameInMap("srcDsName")
        private String srcDsName;

        @com.aliyun.core.annotation.NameInMap("srcDsType")
        private String srcDsType;

        @com.aliyun.core.annotation.NameInMap("taskCreateTime")
        private String taskCreateTime;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("taskModifyTime")
        private String taskModifyTime;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        private Data(Builder builder) {
            this.batchId = builder.batchId;
            this.checkColumnCount = builder.checkColumnCount;
            this.checkPtCount = builder.checkPtCount;
            this.checkResult = builder.checkResult;
            this.checkRowCount = builder.checkRowCount;
            this.checkRowPassCount = builder.checkRowPassCount;
            this.checkRowPassExport = builder.checkRowPassExport;
            this.checkSqlNum = builder.checkSqlNum;
            this.checkTableNum = builder.checkTableNum;
            this.checkTemplateId = builder.checkTemplateId;
            this.checkTemplateName = builder.checkTemplateName;
            this.checkType = builder.checkType;
            this.dstDsName = builder.dstDsName;
            this.dstDsType = builder.dstDsType;
            this.errorTableNum = builder.errorTableNum;
            this.passColumnCount = builder.passColumnCount;
            this.passColumnRate = builder.passColumnRate;
            this.passProcess = builder.passProcess;
            this.passProcessExport = builder.passProcessExport;
            this.passPtNum = builder.passPtNum;
            this.passPtProcessExport = builder.passPtProcessExport;
            this.passTableNum = builder.passTableNum;
            this.ptPassProcess = builder.ptPassProcess;
            this.reportGenerateMessage = builder.reportGenerateMessage;
            this.reportStatus = builder.reportStatus;
            this.reportTime = builder.reportTime;
            this.reportTitle = builder.reportTitle;
            this.skipPtNum = builder.skipPtNum;
            this.skipTableNum = builder.skipTableNum;
            this.srcDsName = builder.srcDsName;
            this.srcDsType = builder.srcDsType;
            this.taskCreateTime = builder.taskCreateTime;
            this.taskId = builder.taskId;
            this.taskModifyTime = builder.taskModifyTime;
            this.taskName = builder.taskName;
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
         * @return checkColumnCount
         */
        public Long getCheckColumnCount() {
            return this.checkColumnCount;
        }

        /**
         * @return checkPtCount
         */
        public Long getCheckPtCount() {
            return this.checkPtCount;
        }

        /**
         * @return checkResult
         */
        public Integer getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return checkRowCount
         */
        public Long getCheckRowCount() {
            return this.checkRowCount;
        }

        /**
         * @return checkRowPassCount
         */
        public Long getCheckRowPassCount() {
            return this.checkRowPassCount;
        }

        /**
         * @return checkRowPassExport
         */
        public String getCheckRowPassExport() {
            return this.checkRowPassExport;
        }

        /**
         * @return checkSqlNum
         */
        public Long getCheckSqlNum() {
            return this.checkSqlNum;
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
         * @return checkTemplateName
         */
        public String getCheckTemplateName() {
            return this.checkTemplateName;
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
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
         * @return errorTableNum
         */
        public Long getErrorTableNum() {
            return this.errorTableNum;
        }

        /**
         * @return passColumnCount
         */
        public Long getPassColumnCount() {
            return this.passColumnCount;
        }

        /**
         * @return passColumnRate
         */
        public Double getPassColumnRate() {
            return this.passColumnRate;
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
         * @return passPtNum
         */
        public Long getPassPtNum() {
            return this.passPtNum;
        }

        /**
         * @return passPtProcessExport
         */
        public String getPassPtProcessExport() {
            return this.passPtProcessExport;
        }

        /**
         * @return passTableNum
         */
        public Long getPassTableNum() {
            return this.passTableNum;
        }

        /**
         * @return ptPassProcess
         */
        public Double getPtPassProcess() {
            return this.ptPassProcess;
        }

        /**
         * @return reportGenerateMessage
         */
        public String getReportGenerateMessage() {
            return this.reportGenerateMessage;
        }

        /**
         * @return reportStatus
         */
        public Integer getReportStatus() {
            return this.reportStatus;
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
         * @return skipPtNum
         */
        public Long getSkipPtNum() {
            return this.skipPtNum;
        }

        /**
         * @return skipTableNum
         */
        public Integer getSkipTableNum() {
            return this.skipTableNum;
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
         * @return taskCreateTime
         */
        public String getTaskCreateTime() {
            return this.taskCreateTime;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskModifyTime
         */
        public String getTaskModifyTime() {
            return this.taskModifyTime;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private Long batchId; 
            private Long checkColumnCount; 
            private Long checkPtCount; 
            private Integer checkResult; 
            private Long checkRowCount; 
            private Long checkRowPassCount; 
            private String checkRowPassExport; 
            private Long checkSqlNum; 
            private Long checkTableNum; 
            private String checkTemplateId; 
            private String checkTemplateName; 
            private Integer checkType; 
            private String dstDsName; 
            private String dstDsType; 
            private Long errorTableNum; 
            private Long passColumnCount; 
            private Double passColumnRate; 
            private Double passProcess; 
            private String passProcessExport; 
            private Long passPtNum; 
            private String passPtProcessExport; 
            private Long passTableNum; 
            private Double ptPassProcess; 
            private String reportGenerateMessage; 
            private Integer reportStatus; 
            private String reportTime; 
            private String reportTitle; 
            private Long skipPtNum; 
            private Integer skipTableNum; 
            private String srcDsName; 
            private String srcDsType; 
            private String taskCreateTime; 
            private Long taskId; 
            private String taskModifyTime; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.batchId = model.batchId;
                this.checkColumnCount = model.checkColumnCount;
                this.checkPtCount = model.checkPtCount;
                this.checkResult = model.checkResult;
                this.checkRowCount = model.checkRowCount;
                this.checkRowPassCount = model.checkRowPassCount;
                this.checkRowPassExport = model.checkRowPassExport;
                this.checkSqlNum = model.checkSqlNum;
                this.checkTableNum = model.checkTableNum;
                this.checkTemplateId = model.checkTemplateId;
                this.checkTemplateName = model.checkTemplateName;
                this.checkType = model.checkType;
                this.dstDsName = model.dstDsName;
                this.dstDsType = model.dstDsType;
                this.errorTableNum = model.errorTableNum;
                this.passColumnCount = model.passColumnCount;
                this.passColumnRate = model.passColumnRate;
                this.passProcess = model.passProcess;
                this.passProcessExport = model.passProcessExport;
                this.passPtNum = model.passPtNum;
                this.passPtProcessExport = model.passPtProcessExport;
                this.passTableNum = model.passTableNum;
                this.ptPassProcess = model.ptPassProcess;
                this.reportGenerateMessage = model.reportGenerateMessage;
                this.reportStatus = model.reportStatus;
                this.reportTime = model.reportTime;
                this.reportTitle = model.reportTitle;
                this.skipPtNum = model.skipPtNum;
                this.skipTableNum = model.skipTableNum;
                this.srcDsName = model.srcDsName;
                this.srcDsType = model.srcDsType;
                this.taskCreateTime = model.taskCreateTime;
                this.taskId = model.taskId;
                this.taskModifyTime = model.taskModifyTime;
                this.taskName = model.taskName;
            } 

            /**
             * <p>The ID of the validation job (batch).</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The number of validated fields.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder checkColumnCount(Long checkColumnCount) {
                this.checkColumnCount = checkColumnCount;
                return this;
            }

            /**
             * <p>The number of validated partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder checkPtCount(Long checkPtCount) {
                this.checkPtCount = checkPtCount;
                return this;
            }

            /**
             * <p>The validation result. Valid values:</p>
             * <ul>
             * <li>0: No record.</li>
             * <li>1: Passed.</li>
             * <li>2: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder checkResult(Integer checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The number of validated data rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder checkRowCount(Long checkRowCount) {
                this.checkRowCount = checkRowCount;
                return this;
            }

            /**
             * <p>The number of rows that passed validation.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder checkRowPassCount(Long checkRowPassCount) {
                this.checkRowPassCount = checkRowPassCount;
                return this;
            }

            /**
             * <p>The row pass rate for the export report. This value is calculated by dividing the number of passed rows by the total number of validated rows. The value is returned as a percentage string with two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00%</p>
             */
            public Builder checkRowPassExport(String checkRowPassExport) {
                this.checkRowPassExport = checkRowPassExport;
                return this;
            }

            /**
             * <p>The number of validation SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder checkSqlNum(Long checkSqlNum) {
                this.checkSqlNum = checkSqlNum;
                return this;
            }

            /**
             * <p>The number of validated tables.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder checkTableNum(Long checkTableNum) {
                this.checkTableNum = checkTableNum;
                return this;
            }

            /**
             * <p>The validation template name. This field is available only for metric validation.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder checkTemplateId(String checkTemplateId) {
                this.checkTemplateId = checkTemplateId;
                return this;
            }

            /**
             * <p>The validation template name. This field is available only for metric validation.</p>
             * 
             * <strong>example:</strong>
             * <p>Data volume comparison built-in template</p>
             */
            public Builder checkTemplateName(String checkTemplateName) {
                this.checkTemplateName = checkTemplateName;
                return this;
            }

            /**
             * <p>The validation type. Valid values:</p>
             * <ul>
             * <li>0: data volume comparison.</li>
             * <li>1: metric comparison.</li>
             * <li>2: weak content comparison.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The name of the destination datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder dstDsName(String dstDsName) {
                this.dstDsName = dstDsName;
                return this;
            }

            /**
             * <p>The type of the destination datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder dstDsType(String dstDsType) {
                this.dstDsType = dstDsType;
                return this;
            }

            /**
             * <p>The number of tables with errors.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder errorTableNum(Long errorTableNum) {
                this.errorTableNum = errorTableNum;
                return this;
            }

            /**
             * <p>The number of fields that passed validation.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder passColumnCount(Long passColumnCount) {
                this.passColumnCount = passColumnCount;
                return this;
            }

            /**
             * <p>The number of metrics that passed validation.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder passColumnRate(Double passColumnRate) {
                this.passColumnRate = passColumnRate;
                return this;
            }

            /**
             * <p>The pass rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.95</p>
             */
            public Builder passProcess(Double passProcess) {
                this.passProcess = passProcess;
                return this;
            }

            /**
             * <p>The pass rate for the export report. This value is calculated by dividing the number of passed tables by the total number of validated tables. The value is returned as a percentage string with two decimal places (for example, 100.00%). A hyphen (-) is returned when no validated table data exists.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00%</p>
             */
            public Builder passProcessExport(String passProcessExport) {
                this.passProcessExport = passProcessExport;
                return this;
            }

            /**
             * <p>The number of partitions that passed validation.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder passPtNum(Long passPtNum) {
                this.passPtNum = passPtNum;
                return this;
            }

            /**
             * <p>The partition pass rate for the export report. This value is calculated by dividing the number of passed partitions by the total number of validated partitions. The value is returned as a percentage string with four decimal places. A hyphen (-) is returned when no partition data exists.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0000%</p>
             */
            public Builder passPtProcessExport(String passPtProcessExport) {
                this.passPtProcessExport = passPtProcessExport;
                return this;
            }

            /**
             * <p>The number of tables that passed validation.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder passTableNum(Long passTableNum) {
                this.passTableNum = passTableNum;
                return this;
            }

            /**
             * <p>The partition pass rate.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder ptPassProcess(Double ptPassProcess) {
                this.ptPassProcess = ptPassProcess;
                return this;
            }

            /**
             * <p>The report generation message.</p>
             * 
             * <strong>example:</strong>
             * <p>Validation report refresh completed</p>
             */
            public Builder reportGenerateMessage(String reportGenerateMessage) {
                this.reportGenerateMessage = reportGenerateMessage;
                return this;
            }

            /**
             * <p>The validation report status. Valid values:</p>
             * <ul>
             * <li>0: Not generated.</li>
             * <li>1: Generating.</li>
             * <li>2: Generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reportStatus(Integer reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * <p>The time when the report was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 12:00:00</p>
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * <p>The title of the validation report.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Validation Report</p>
             */
            public Builder reportTitle(String reportTitle) {
                this.reportTitle = reportTitle;
                return this;
            }

            /**
             * <p>The number of skipped partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder skipPtNum(Long skipPtNum) {
                this.skipPtNum = skipPtNum;
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
             * <p>The name of the source datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder srcDsName(String srcDsName) {
                this.srcDsName = srcDsName;
                return this;
            }

            /**
             * <p>The type of the source datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder srcDsType(String srcDsType) {
                this.srcDsType = srcDsType;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 11:00:00</p>
             */
            public Builder taskCreateTime(String taskCreateTime) {
                this.taskCreateTime = taskCreateTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>551</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The time when the task was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 12:00:00</p>
             */
            public Builder taskModifyTime(String taskModifyTime) {
                this.taskModifyTime = taskModifyTime;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
