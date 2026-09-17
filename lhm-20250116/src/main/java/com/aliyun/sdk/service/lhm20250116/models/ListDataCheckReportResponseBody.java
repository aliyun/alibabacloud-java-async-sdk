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
 * {@link ListDataCheckReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCheckReportResponseBody</p>
 */
public class ListDataCheckReportResponseBody extends TeaModel {
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

    private ListDataCheckReportResponseBody(Builder builder) {
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

    public static ListDataCheckReportResponseBody create() {
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

        private Builder(ListDataCheckReportResponseBody model) {
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
         * <p>The data list returned by the operation. For the structure of each element, see the child field descriptions.</p>
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
         * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
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
         * <p>The total number of records that match the query conditions. This value is used for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataCheckReportResponseBody build() {
            return new ListDataCheckReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCheckReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCheckReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchId")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("checkColumCount")
        private Long checkColumCount;

        @com.aliyun.core.annotation.NameInMap("checkResult")
        private Integer checkResult;

        @com.aliyun.core.annotation.NameInMap("compareRowCount")
        private Long compareRowCount;

        @com.aliyun.core.annotation.NameInMap("completionRate")
        private String completionRate;

        @com.aliyun.core.annotation.NameInMap("diffRate")
        private String diffRate;

        @com.aliyun.core.annotation.NameInMap("dstCompareColumn")
        private String dstCompareColumn;

        @com.aliyun.core.annotation.NameInMap("dstHint")
        private String dstHint;

        @com.aliyun.core.annotation.NameInMap("dstMetricName")
        private String dstMetricName;

        @com.aliyun.core.annotation.NameInMap("dstSqlList")
        private java.util.List<String> dstSqlList;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("execTime")
        private String execTime;

        @com.aliyun.core.annotation.NameInMap("expDiffCount")
        private String expDiffCount;

        @com.aliyun.core.annotation.NameInMap("finishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("isSkipped")
        private Integer isSkipped;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("jobStatus")
        private Integer jobStatus;

        @com.aliyun.core.annotation.NameInMap("metricColumCount")
        private Long metricColumCount;

        @com.aliyun.core.annotation.NameInMap("metricPassColumCount")
        private Long metricPassColumCount;

        @com.aliyun.core.annotation.NameInMap("onlyDstCount")
        private Long onlyDstCount;

        @com.aliyun.core.annotation.NameInMap("onlySrcCount")
        private Long onlySrcCount;

        @com.aliyun.core.annotation.NameInMap("passColumCount")
        private Long passColumCount;

        @com.aliyun.core.annotation.NameInMap("realDiffCount")
        private Long realDiffCount;

        @com.aliyun.core.annotation.NameInMap("realSameCount")
        private Long realSameCount;

        @com.aliyun.core.annotation.NameInMap("resultId")
        private String resultId;

        @com.aliyun.core.annotation.NameInMap("sourceColumn")
        private String sourceColumn;

        @com.aliyun.core.annotation.NameInMap("sourceCount")
        private String sourceCount;

        @com.aliyun.core.annotation.NameInMap("sourceDataSource")
        private String sourceDataSource;

        @com.aliyun.core.annotation.NameInMap("sourceError")
        private String sourceError;

        @com.aliyun.core.annotation.NameInMap("sourceGroupClause")
        private String sourceGroupClause;

        @com.aliyun.core.annotation.NameInMap("sourcePartition")
        private String sourcePartition;

        @com.aliyun.core.annotation.NameInMap("sourceTable")
        private String sourceTable;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("sourceWhereClause")
        private String sourceWhereClause;

        @com.aliyun.core.annotation.NameInMap("srcCompareColumn")
        private String srcCompareColumn;

        @com.aliyun.core.annotation.NameInMap("srcHint")
        private String srcHint;

        @com.aliyun.core.annotation.NameInMap("srcMetricName")
        private String srcMetricName;

        @com.aliyun.core.annotation.NameInMap("srcSqlList")
        private java.util.List<String> srcSqlList;

        @com.aliyun.core.annotation.NameInMap("targetColumn")
        private String targetColumn;

        @com.aliyun.core.annotation.NameInMap("targetCount")
        private String targetCount;

        @com.aliyun.core.annotation.NameInMap("targetDataSource")
        private String targetDataSource;

        @com.aliyun.core.annotation.NameInMap("targetError")
        private String targetError;

        @com.aliyun.core.annotation.NameInMap("targetGroupClause")
        private String targetGroupClause;

        @com.aliyun.core.annotation.NameInMap("targetPartition")
        private String targetPartition;

        @com.aliyun.core.annotation.NameInMap("targetTable")
        private String targetTable;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("targetWhereClause")
        private String targetWhereClause;

        @com.aliyun.core.annotation.NameInMap("taskConfigId")
        private Long taskConfigId;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("totalCountThreshold")
        private String totalCountThreshold;

        private Data(Builder builder) {
            this.batchId = builder.batchId;
            this.checkColumCount = builder.checkColumCount;
            this.checkResult = builder.checkResult;
            this.compareRowCount = builder.compareRowCount;
            this.completionRate = builder.completionRate;
            this.diffRate = builder.diffRate;
            this.dstCompareColumn = builder.dstCompareColumn;
            this.dstHint = builder.dstHint;
            this.dstMetricName = builder.dstMetricName;
            this.dstSqlList = builder.dstSqlList;
            this.errorMsg = builder.errorMsg;
            this.execTime = builder.execTime;
            this.expDiffCount = builder.expDiffCount;
            this.finishTime = builder.finishTime;
            this.isSkipped = builder.isSkipped;
            this.jobId = builder.jobId;
            this.jobStatus = builder.jobStatus;
            this.metricColumCount = builder.metricColumCount;
            this.metricPassColumCount = builder.metricPassColumCount;
            this.onlyDstCount = builder.onlyDstCount;
            this.onlySrcCount = builder.onlySrcCount;
            this.passColumCount = builder.passColumCount;
            this.realDiffCount = builder.realDiffCount;
            this.realSameCount = builder.realSameCount;
            this.resultId = builder.resultId;
            this.sourceColumn = builder.sourceColumn;
            this.sourceCount = builder.sourceCount;
            this.sourceDataSource = builder.sourceDataSource;
            this.sourceError = builder.sourceError;
            this.sourceGroupClause = builder.sourceGroupClause;
            this.sourcePartition = builder.sourcePartition;
            this.sourceTable = builder.sourceTable;
            this.sourceType = builder.sourceType;
            this.sourceWhereClause = builder.sourceWhereClause;
            this.srcCompareColumn = builder.srcCompareColumn;
            this.srcHint = builder.srcHint;
            this.srcMetricName = builder.srcMetricName;
            this.srcSqlList = builder.srcSqlList;
            this.targetColumn = builder.targetColumn;
            this.targetCount = builder.targetCount;
            this.targetDataSource = builder.targetDataSource;
            this.targetError = builder.targetError;
            this.targetGroupClause = builder.targetGroupClause;
            this.targetPartition = builder.targetPartition;
            this.targetTable = builder.targetTable;
            this.targetType = builder.targetType;
            this.targetWhereClause = builder.targetWhereClause;
            this.taskConfigId = builder.taskConfigId;
            this.templateName = builder.templateName;
            this.threshold = builder.threshold;
            this.totalCountThreshold = builder.totalCountThreshold;
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
         * @return checkColumCount
         */
        public Long getCheckColumCount() {
            return this.checkColumCount;
        }

        /**
         * @return checkResult
         */
        public Integer getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return compareRowCount
         */
        public Long getCompareRowCount() {
            return this.compareRowCount;
        }

        /**
         * @return completionRate
         */
        public String getCompletionRate() {
            return this.completionRate;
        }

        /**
         * @return diffRate
         */
        public String getDiffRate() {
            return this.diffRate;
        }

        /**
         * @return dstCompareColumn
         */
        public String getDstCompareColumn() {
            return this.dstCompareColumn;
        }

        /**
         * @return dstHint
         */
        public String getDstHint() {
            return this.dstHint;
        }

        /**
         * @return dstMetricName
         */
        public String getDstMetricName() {
            return this.dstMetricName;
        }

        /**
         * @return dstSqlList
         */
        public java.util.List<String> getDstSqlList() {
            return this.dstSqlList;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return execTime
         */
        public String getExecTime() {
            return this.execTime;
        }

        /**
         * @return expDiffCount
         */
        public String getExpDiffCount() {
            return this.expDiffCount;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return isSkipped
         */
        public Integer getIsSkipped() {
            return this.isSkipped;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobStatus
         */
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return metricColumCount
         */
        public Long getMetricColumCount() {
            return this.metricColumCount;
        }

        /**
         * @return metricPassColumCount
         */
        public Long getMetricPassColumCount() {
            return this.metricPassColumCount;
        }

        /**
         * @return onlyDstCount
         */
        public Long getOnlyDstCount() {
            return this.onlyDstCount;
        }

        /**
         * @return onlySrcCount
         */
        public Long getOnlySrcCount() {
            return this.onlySrcCount;
        }

        /**
         * @return passColumCount
         */
        public Long getPassColumCount() {
            return this.passColumCount;
        }

        /**
         * @return realDiffCount
         */
        public Long getRealDiffCount() {
            return this.realDiffCount;
        }

        /**
         * @return realSameCount
         */
        public Long getRealSameCount() {
            return this.realSameCount;
        }

        /**
         * @return resultId
         */
        public String getResultId() {
            return this.resultId;
        }

        /**
         * @return sourceColumn
         */
        public String getSourceColumn() {
            return this.sourceColumn;
        }

        /**
         * @return sourceCount
         */
        public String getSourceCount() {
            return this.sourceCount;
        }

        /**
         * @return sourceDataSource
         */
        public String getSourceDataSource() {
            return this.sourceDataSource;
        }

        /**
         * @return sourceError
         */
        public String getSourceError() {
            return this.sourceError;
        }

        /**
         * @return sourceGroupClause
         */
        public String getSourceGroupClause() {
            return this.sourceGroupClause;
        }

        /**
         * @return sourcePartition
         */
        public String getSourcePartition() {
            return this.sourcePartition;
        }

        /**
         * @return sourceTable
         */
        public String getSourceTable() {
            return this.sourceTable;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceWhereClause
         */
        public String getSourceWhereClause() {
            return this.sourceWhereClause;
        }

        /**
         * @return srcCompareColumn
         */
        public String getSrcCompareColumn() {
            return this.srcCompareColumn;
        }

        /**
         * @return srcHint
         */
        public String getSrcHint() {
            return this.srcHint;
        }

        /**
         * @return srcMetricName
         */
        public String getSrcMetricName() {
            return this.srcMetricName;
        }

        /**
         * @return srcSqlList
         */
        public java.util.List<String> getSrcSqlList() {
            return this.srcSqlList;
        }

        /**
         * @return targetColumn
         */
        public String getTargetColumn() {
            return this.targetColumn;
        }

        /**
         * @return targetCount
         */
        public String getTargetCount() {
            return this.targetCount;
        }

        /**
         * @return targetDataSource
         */
        public String getTargetDataSource() {
            return this.targetDataSource;
        }

        /**
         * @return targetError
         */
        public String getTargetError() {
            return this.targetError;
        }

        /**
         * @return targetGroupClause
         */
        public String getTargetGroupClause() {
            return this.targetGroupClause;
        }

        /**
         * @return targetPartition
         */
        public String getTargetPartition() {
            return this.targetPartition;
        }

        /**
         * @return targetTable
         */
        public String getTargetTable() {
            return this.targetTable;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return targetWhereClause
         */
        public String getTargetWhereClause() {
            return this.targetWhereClause;
        }

        /**
         * @return taskConfigId
         */
        public Long getTaskConfigId() {
            return this.taskConfigId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return totalCountThreshold
         */
        public String getTotalCountThreshold() {
            return this.totalCountThreshold;
        }

        public static final class Builder {
            private Long batchId; 
            private Long checkColumCount; 
            private Integer checkResult; 
            private Long compareRowCount; 
            private String completionRate; 
            private String diffRate; 
            private String dstCompareColumn; 
            private String dstHint; 
            private String dstMetricName; 
            private java.util.List<String> dstSqlList; 
            private String errorMsg; 
            private String execTime; 
            private String expDiffCount; 
            private String finishTime; 
            private Integer isSkipped; 
            private String jobId; 
            private Integer jobStatus; 
            private Long metricColumCount; 
            private Long metricPassColumCount; 
            private Long onlyDstCount; 
            private Long onlySrcCount; 
            private Long passColumCount; 
            private Long realDiffCount; 
            private Long realSameCount; 
            private String resultId; 
            private String sourceColumn; 
            private String sourceCount; 
            private String sourceDataSource; 
            private String sourceError; 
            private String sourceGroupClause; 
            private String sourcePartition; 
            private String sourceTable; 
            private String sourceType; 
            private String sourceWhereClause; 
            private String srcCompareColumn; 
            private String srcHint; 
            private String srcMetricName; 
            private java.util.List<String> srcSqlList; 
            private String targetColumn; 
            private String targetCount; 
            private String targetDataSource; 
            private String targetError; 
            private String targetGroupClause; 
            private String targetPartition; 
            private String targetTable; 
            private String targetType; 
            private String targetWhereClause; 
            private Long taskConfigId; 
            private String templateName; 
            private Float threshold; 
            private String totalCountThreshold; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.batchId = model.batchId;
                this.checkColumCount = model.checkColumCount;
                this.checkResult = model.checkResult;
                this.compareRowCount = model.compareRowCount;
                this.completionRate = model.completionRate;
                this.diffRate = model.diffRate;
                this.dstCompareColumn = model.dstCompareColumn;
                this.dstHint = model.dstHint;
                this.dstMetricName = model.dstMetricName;
                this.dstSqlList = model.dstSqlList;
                this.errorMsg = model.errorMsg;
                this.execTime = model.execTime;
                this.expDiffCount = model.expDiffCount;
                this.finishTime = model.finishTime;
                this.isSkipped = model.isSkipped;
                this.jobId = model.jobId;
                this.jobStatus = model.jobStatus;
                this.metricColumCount = model.metricColumCount;
                this.metricPassColumCount = model.metricPassColumCount;
                this.onlyDstCount = model.onlyDstCount;
                this.onlySrcCount = model.onlySrcCount;
                this.passColumCount = model.passColumCount;
                this.realDiffCount = model.realDiffCount;
                this.realSameCount = model.realSameCount;
                this.resultId = model.resultId;
                this.sourceColumn = model.sourceColumn;
                this.sourceCount = model.sourceCount;
                this.sourceDataSource = model.sourceDataSource;
                this.sourceError = model.sourceError;
                this.sourceGroupClause = model.sourceGroupClause;
                this.sourcePartition = model.sourcePartition;
                this.sourceTable = model.sourceTable;
                this.sourceType = model.sourceType;
                this.sourceWhereClause = model.sourceWhereClause;
                this.srcCompareColumn = model.srcCompareColumn;
                this.srcHint = model.srcHint;
                this.srcMetricName = model.srcMetricName;
                this.srcSqlList = model.srcSqlList;
                this.targetColumn = model.targetColumn;
                this.targetCount = model.targetCount;
                this.targetDataSource = model.targetDataSource;
                this.targetError = model.targetError;
                this.targetGroupClause = model.targetGroupClause;
                this.targetPartition = model.targetPartition;
                this.targetTable = model.targetTable;
                this.targetType = model.targetType;
                this.targetWhereClause = model.targetWhereClause;
                this.taskConfigId = model.taskConfigId;
                this.templateName = model.templateName;
                this.threshold = model.threshold;
                this.totalCountThreshold = model.totalCountThreshold;
            } 

            /**
             * <p>The validation job (batch) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The number of columns checked.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder checkColumCount(Long checkColumCount) {
                this.checkColumCount = checkColumCount;
                return this;
            }

            /**
             * <p>The check result. Valid values:</p>
             * <ul>
             * <li>0: No records.</li>
             * <li>1: Passed.</li>
             * <li>2: Failed.</li>
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
             * <p>The number of rows compared.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder compareRowCount(Long compareRowCount) {
                this.compareRowCount = compareRowCount;
                return this;
            }

            /**
             * <p>The job completion rate.</p>
             * 
             * <strong>example:</strong>
             * <p>95.00%</p>
             */
            public Builder completionRate(String completionRate) {
                this.completionRate = completionRate;
                return this;
            }

            /**
             * <p>The difference rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00%</p>
             */
            public Builder diffRate(String diffRate) {
                this.diffRate = diffRate;
                return this;
            }

            /**
             * <p>The primary key or composite primary key of the destination. This is the comparison column on the destination used during row-by-row, column-by-column comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder dstCompareColumn(String dstCompareColumn) {
                this.dstCompareColumn = dstCompareColumn;
                return this;
            }

            /**
             * dstHint.
             */
            public Builder dstHint(String dstHint) {
                this.dstHint = dstHint;
                return this;
            }

            /**
             * <p>The metric field of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>amount</p>
             */
            public Builder dstMetricName(String dstMetricName) {
                this.dstMetricName = dstMetricName;
                return this;
            }

            /**
             * <p>The SQL list of the destination.</p>
             */
            public Builder dstSqlList(java.util.List<String> dstSqlList) {
                this.dstSqlList = dstSqlList;
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
             * <p>The execution time of this check report detail.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 10:00:00</p>
             */
            public Builder execTime(String execTime) {
                this.execTime = execTime;
                return this;
            }

            /**
             * <p>The expected number of different rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expDiffCount(String expDiffCount) {
                this.expDiffCount = expDiffCount;
                return this;
            }

            /**
             * <p>The completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16T10:00:00Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>Indicates whether the check is skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isSkipped(Integer isSkipped) {
                this.isSkipped = isSkipped;
                return this;
            }

            /**
             * <p>The ID of the check sub-job.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>0: INIT (pending).</li>
             * <li>1: RUNNING (running).</li>
             * <li>2: FINISHED (completed).</li>
             * <li>3: STOPPED (stopped).</li>
             * <li>4: FAIL (failed).</li>
             * <li>6: READY (ready).</li>
             * <li>7: SKIPPED (skipped).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder jobStatus(Integer jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The number of metrics checked.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder metricColumCount(Long metricColumCount) {
                this.metricColumCount = metricColumCount;
                return this;
            }

            /**
             * <p>The number of metrics that passed the check.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder metricPassColumCount(Long metricPassColumCount) {
                this.metricPassColumCount = metricPassColumCount;
                return this;
            }

            /**
             * <p>The number of rows that exist only on the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onlyDstCount(Long onlyDstCount) {
                this.onlyDstCount = onlyDstCount;
                return this;
            }

            /**
             * <p>The number of rows that exist only on the source.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onlySrcCount(Long onlySrcCount) {
                this.onlySrcCount = onlySrcCount;
                return this;
            }

            /**
             * <p>The number of columns that passed the check.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder passColumCount(Long passColumCount) {
                this.passColumCount = passColumCount;
                return this;
            }

            /**
             * <p>The actual number of different rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder realDiffCount(Long realDiffCount) {
                this.realDiffCount = realDiffCount;
                return this;
            }

            /**
             * <p>The actual number of identical rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder realSameCount(Long realSameCount) {
                this.realSameCount = realSameCount;
                return this;
            }

            /**
             * <p>The ID of the check result.</p>
             * 
             * <strong>example:</strong>
             * <p>30001</p>
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * <p>The name of the source column.</p>
             * 
             * <strong>example:</strong>
             * <p>amount</p>
             */
            public Builder sourceColumn(String sourceColumn) {
                this.sourceColumn = sourceColumn;
                return this;
            }

            /**
             * <p>The number of rows in the source data.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder sourceCount(String sourceCount) {
                this.sourceCount = sourceCount;
                return this;
            }

            /**
             * <p>The source data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder sourceDataSource(String sourceDataSource) {
                this.sourceDataSource = sourceDataSource;
                return this;
            }

            /**
             * <p>The error message of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>Table \&quot;src_db.src_table\&quot; doesn\&quot;t exist</p>
             */
            public Builder sourceError(String sourceError) {
                this.sourceError = sourceError;
                return this;
            }

            /**
             * <p>The GROUP BY clause of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder sourceGroupClause(String sourceGroupClause) {
                this.sourceGroupClause = sourceGroupClause;
                return this;
            }

            /**
             * <p>The source partition.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20260116</p>
             */
            public Builder sourcePartition(String sourcePartition) {
                this.sourcePartition = sourcePartition;
                return this;
            }

            /**
             * <p>The name of the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>table_demo</p>
             */
            public Builder sourceTable(String sourceTable) {
                this.sourceTable = sourceTable;
                return this;
            }

            /**
             * <p>The data type of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The WHERE clause of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
             */
            public Builder sourceWhereClause(String sourceWhereClause) {
                this.sourceWhereClause = sourceWhereClause;
                return this;
            }

            /**
             * <p>The primary key or composite primary key of the source. This is the comparison column on the source used during row-by-row, column-by-column comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder srcCompareColumn(String srcCompareColumn) {
                this.srcCompareColumn = srcCompareColumn;
                return this;
            }

            /**
             * srcHint.
             */
            public Builder srcHint(String srcHint) {
                this.srcHint = srcHint;
                return this;
            }

            /**
             * <p>The metric field of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>amount</p>
             */
            public Builder srcMetricName(String srcMetricName) {
                this.srcMetricName = srcMetricName;
                return this;
            }

            /**
             * <p>The SQL list of the source.</p>
             */
            public Builder srcSqlList(java.util.List<String> srcSqlList) {
                this.srcSqlList = srcSqlList;
                return this;
            }

            /**
             * <p>The column of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>amount</p>
             */
            public Builder targetColumn(String targetColumn) {
                this.targetColumn = targetColumn;
                return this;
            }

            /**
             * <p>The number of rows in the destination data.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder targetCount(String targetCount) {
                this.targetCount = targetCount;
                return this;
            }

            /**
             * <p>The data source of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder targetDataSource(String targetDataSource) {
                this.targetDataSource = targetDataSource;
                return this;
            }

            /**
             * <p>The error message of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>Table \&quot;dst_db.dst_table\&quot; doesn\&quot;t exist</p>
             */
            public Builder targetError(String targetError) {
                this.targetError = targetError;
                return this;
            }

            /**
             * <p>The GROUP BY clause of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder targetGroupClause(String targetGroupClause) {
                this.targetGroupClause = targetGroupClause;
                return this;
            }

            /**
             * <p>The destination partition.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20260116</p>
             */
            public Builder targetPartition(String targetPartition) {
                this.targetPartition = targetPartition;
                return this;
            }

            /**
             * <p>The destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>table_demo</p>
             */
            public Builder targetTable(String targetTable) {
                this.targetTable = targetTable;
                return this;
            }

            /**
             * <p>The destination data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>hive</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The destination WHERE clause.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
             */
            public Builder targetWhereClause(String targetWhereClause) {
                this.targetWhereClause = targetWhereClause;
                return this;
            }

            /**
             * <p>The ID of the validation task configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder taskConfigId(Long taskConfigId) {
                this.taskConfigId = taskConfigId;
                return this;
            }

            /**
             * <p>The validation template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Volume Validation Template</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The threshold for comparing grouped data volumes.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder totalCountThreshold(String totalCountThreshold) {
                this.totalCountThreshold = totalCountThreshold;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
