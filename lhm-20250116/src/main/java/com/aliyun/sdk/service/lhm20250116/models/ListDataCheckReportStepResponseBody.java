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
 * {@link ListDataCheckReportStepResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCheckReportStepResponseBody</p>
 */
public class ListDataCheckReportStepResponseBody extends TeaModel {
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

    private ListDataCheckReportStepResponseBody(Builder builder) {
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

    public static ListDataCheckReportStepResponseBody create() {
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

        private Builder(ListDataCheckReportStepResponseBody model) {
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
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for troubleshooting.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that meet the query conditions. This value is used for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataCheckReportStepResponseBody build() {
            return new ListDataCheckReportStepResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCheckReportStepResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCheckReportStepResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boundary")
        private String boundary;

        @com.aliyun.core.annotation.NameInMap("checkColumCount")
        private Long checkColumCount;

        @com.aliyun.core.annotation.NameInMap("dstCount")
        private String dstCount;

        @com.aliyun.core.annotation.NameInMap("dstSql")
        private String dstSql;

        @com.aliyun.core.annotation.NameInMap("errMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtEnd")
        private String gmtEnd;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("gmtStart")
        private String gmtStart;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("isConsistent")
        private Integer isConsistent;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("metricColumCount")
        private Long metricColumCount;

        @com.aliyun.core.annotation.NameInMap("metricPassColumCount")
        private Long metricPassColumCount;

        @com.aliyun.core.annotation.NameInMap("passColumCount")
        private Long passColumCount;

        @com.aliyun.core.annotation.NameInMap("resultId")
        private String resultId;

        @com.aliyun.core.annotation.NameInMap("signNameList")
        private java.util.List<String> signNameList;

        @com.aliyun.core.annotation.NameInMap("sourcePtName")
        private String sourcePtName;

        @com.aliyun.core.annotation.NameInMap("srcCount")
        private String srcCount;

        @com.aliyun.core.annotation.NameInMap("srcSql")
        private String srcSql;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("stepId")
        private String stepId;

        @com.aliyun.core.annotation.NameInMap("targetPtName")
        private String targetPtName;

        private Data(Builder builder) {
            this.boundary = builder.boundary;
            this.checkColumCount = builder.checkColumCount;
            this.dstCount = builder.dstCount;
            this.dstSql = builder.dstSql;
            this.errMessage = builder.errMessage;
            this.extra = builder.extra;
            this.gmtCreate = builder.gmtCreate;
            this.gmtEnd = builder.gmtEnd;
            this.gmtModified = builder.gmtModified;
            this.gmtStart = builder.gmtStart;
            this.id = builder.id;
            this.isConsistent = builder.isConsistent;
            this.jobId = builder.jobId;
            this.metricColumCount = builder.metricColumCount;
            this.metricPassColumCount = builder.metricPassColumCount;
            this.passColumCount = builder.passColumCount;
            this.resultId = builder.resultId;
            this.signNameList = builder.signNameList;
            this.sourcePtName = builder.sourcePtName;
            this.srcCount = builder.srcCount;
            this.srcSql = builder.srcSql;
            this.status = builder.status;
            this.stepId = builder.stepId;
            this.targetPtName = builder.targetPtName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return boundary
         */
        public String getBoundary() {
            return this.boundary;
        }

        /**
         * @return checkColumCount
         */
        public Long getCheckColumCount() {
            return this.checkColumCount;
        }

        /**
         * @return dstCount
         */
        public String getDstCount() {
            return this.dstCount;
        }

        /**
         * @return dstSql
         */
        public String getDstSql() {
            return this.dstSql;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
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
         * @return gmtEnd
         */
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtStart
         */
        public String getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isConsistent
         */
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
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
         * @return passColumCount
         */
        public Long getPassColumCount() {
            return this.passColumCount;
        }

        /**
         * @return resultId
         */
        public String getResultId() {
            return this.resultId;
        }

        /**
         * @return signNameList
         */
        public java.util.List<String> getSignNameList() {
            return this.signNameList;
        }

        /**
         * @return sourcePtName
         */
        public String getSourcePtName() {
            return this.sourcePtName;
        }

        /**
         * @return srcCount
         */
        public String getSrcCount() {
            return this.srcCount;
        }

        /**
         * @return srcSql
         */
        public String getSrcSql() {
            return this.srcSql;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return stepId
         */
        public String getStepId() {
            return this.stepId;
        }

        /**
         * @return targetPtName
         */
        public String getTargetPtName() {
            return this.targetPtName;
        }

        public static final class Builder {
            private String boundary; 
            private Long checkColumCount; 
            private String dstCount; 
            private String dstSql; 
            private String errMessage; 
            private String extra; 
            private String gmtCreate; 
            private String gmtEnd; 
            private String gmtModified; 
            private String gmtStart; 
            private Long id; 
            private Integer isConsistent; 
            private Long jobId; 
            private Long metricColumCount; 
            private Long metricPassColumCount; 
            private Long passColumCount; 
            private String resultId; 
            private java.util.List<String> signNameList; 
            private String sourcePtName; 
            private String srcCount; 
            private String srcSql; 
            private Integer status; 
            private String stepId; 
            private String targetPtName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.boundary = model.boundary;
                this.checkColumCount = model.checkColumCount;
                this.dstCount = model.dstCount;
                this.dstSql = model.dstSql;
                this.errMessage = model.errMessage;
                this.extra = model.extra;
                this.gmtCreate = model.gmtCreate;
                this.gmtEnd = model.gmtEnd;
                this.gmtModified = model.gmtModified;
                this.gmtStart = model.gmtStart;
                this.id = model.id;
                this.isConsistent = model.isConsistent;
                this.jobId = model.jobId;
                this.metricColumCount = model.metricColumCount;
                this.metricPassColumCount = model.metricPassColumCount;
                this.passColumCount = model.passColumCount;
                this.resultId = model.resultId;
                this.signNameList = model.signNameList;
                this.sourcePtName = model.sourcePtName;
                this.srcCount = model.srcCount;
                this.srcSql = model.srcSql;
                this.status = model.status;
                this.stepId = model.stepId;
                this.targetPtName = model.targetPtName;
            } 

            /**
             * <p>The shard boundary information.</p>
             * 
             * <strong>example:</strong>
             * <p>R[1-&gt;1000)</p>
             */
            public Builder boundary(String boundary) {
                this.boundary = boundary;
                return this;
            }

            /**
             * <p>The number of verified fields.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder checkColumCount(Long checkColumCount) {
                this.checkColumCount = checkColumCount;
                return this;
            }

            /**
             * <p>The destination data volume. For single-SQL verification, this indicates the data volume of the destination result set. For data volume verification and full verification, this indicates the total data volume on the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder dstCount(String dstCount) {
                this.dstCount = dstCount;
                return this;
            }

            /**
             * <p>The SQL statement executed on the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM dst_table;</p>
             */
            public Builder dstSql(String dstSql) {
                this.dstSql = dstSql;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
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
             * <p>2026-01-16T10:00:00Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The job end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16T10:00:00Z</p>
             */
            public Builder gmtEnd(String gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16T10:00:00Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The job start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16T10:00:00Z</p>
             */
            public Builder gmtStart(String gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * <p>The primary key ID that uniquely identifies a record.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the data is consistent. Valid values:</p>
             * <ul>
             * <li>0: inconsistent.</li>
             * <li>1: consistent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isConsistent(Integer isConsistent) {
                this.isConsistent = isConsistent;
                return this;
            }

            /**
             * <p>The unique job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The number of verified metrics.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder metricColumCount(Long metricColumCount) {
                this.metricColumCount = metricColumCount;
                return this;
            }

            /**
             * <p>The number of metrics that passed verification.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder metricPassColumCount(Long metricPassColumCount) {
                this.metricPassColumCount = metricPassColumCount;
                return this;
            }

            /**
             * <p>The number of fields that passed verification.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder passColumCount(Long passColumCount) {
                this.passColumCount = passColumCount;
                return this;
            }

            /**
             * <p>The unique ID of the verification result.</p>
             * 
             * <strong>example:</strong>
             * <p>30001</p>
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * <p>The list of label names.</p>
             */
            public Builder signNameList(java.util.List<String> signNameList) {
                this.signNameList = signNameList;
                return this;
            }

            /**
             * <p>The source partition name.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20260116</p>
             */
            public Builder sourcePtName(String sourcePtName) {
                this.sourcePtName = sourcePtName;
                return this;
            }

            /**
             * <p>The source data volume. For single-SQL verification, this indicates the data volume of the source result set. For data volume verification and full verification, this indicates the total data volume on the source.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder srcCount(String srcCount) {
                this.srcCount = srcCount;
                return this;
            }

            /**
             * <p>The SQL statement executed on the source.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM src_table;</p>
             */
            public Builder srcSql(String srcSql) {
                this.srcSql = srcSql;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>0: created.</li>
             * <li>1: running.</li>
             * <li>2: completed.</li>
             * <li>3: stopped.</li>
             * <li>4: canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The step ID that uniquely identifies an execution step within the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stepId(String stepId) {
                this.stepId = stepId;
                return this;
            }

            /**
             * <p>The destination partition name.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20260116</p>
             */
            public Builder targetPtName(String targetPtName) {
                this.targetPtName = targetPtName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
