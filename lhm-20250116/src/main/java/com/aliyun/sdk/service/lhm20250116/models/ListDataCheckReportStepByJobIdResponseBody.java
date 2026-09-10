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
 * {@link ListDataCheckReportStepByJobIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCheckReportStepByJobIdResponseBody</p>
 */
public class ListDataCheckReportStepByJobIdResponseBody extends TeaModel {
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

    private ListDataCheckReportStepByJobIdResponseBody(Builder builder) {
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

    public static ListDataCheckReportStepByJobIdResponseBody create() {
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

        private Builder(ListDataCheckReportStepByJobIdResponseBody model) {
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
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * pageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataCheckReportStepByJobIdResponseBody build() {
            return new ListDataCheckReportStepByJobIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCheckReportStepByJobIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCheckReportStepByJobIdResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("gmtEnd")
        private String gmtEnd;

        @com.aliyun.core.annotation.NameInMap("gmtStart")
        private String gmtStart;

        @com.aliyun.core.annotation.NameInMap("isConsistent")
        private Integer isConsistent;

        @com.aliyun.core.annotation.NameInMap("metricColumCount")
        private Long metricColumCount;

        @com.aliyun.core.annotation.NameInMap("metricPassColumCount")
        private Long metricPassColumCount;

        @com.aliyun.core.annotation.NameInMap("passColumCount")
        private Long passColumCount;

        @com.aliyun.core.annotation.NameInMap("resultId")
        private String resultId;

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
            this.gmtEnd = builder.gmtEnd;
            this.gmtStart = builder.gmtStart;
            this.isConsistent = builder.isConsistent;
            this.metricColumCount = builder.metricColumCount;
            this.metricPassColumCount = builder.metricPassColumCount;
            this.passColumCount = builder.passColumCount;
            this.resultId = builder.resultId;
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
         * @return gmtEnd
         */
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtStart
         */
        public String getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return isConsistent
         */
        public Integer getIsConsistent() {
            return this.isConsistent;
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
            private String gmtEnd; 
            private String gmtStart; 
            private Integer isConsistent; 
            private Long metricColumCount; 
            private Long metricPassColumCount; 
            private Long passColumCount; 
            private String resultId; 
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
                this.gmtEnd = model.gmtEnd;
                this.gmtStart = model.gmtStart;
                this.isConsistent = model.isConsistent;
                this.metricColumCount = model.metricColumCount;
                this.metricPassColumCount = model.metricPassColumCount;
                this.passColumCount = model.passColumCount;
                this.resultId = model.resultId;
                this.sourcePtName = model.sourcePtName;
                this.srcCount = model.srcCount;
                this.srcSql = model.srcSql;
                this.status = model.status;
                this.stepId = model.stepId;
                this.targetPtName = model.targetPtName;
            } 

            /**
             * boundary.
             */
            public Builder boundary(String boundary) {
                this.boundary = boundary;
                return this;
            }

            /**
             * checkColumCount.
             */
            public Builder checkColumCount(Long checkColumCount) {
                this.checkColumCount = checkColumCount;
                return this;
            }

            /**
             * dstCount.
             */
            public Builder dstCount(String dstCount) {
                this.dstCount = dstCount;
                return this;
            }

            /**
             * dstSql.
             */
            public Builder dstSql(String dstSql) {
                this.dstSql = dstSql;
                return this;
            }

            /**
             * errMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * gmtEnd.
             */
            public Builder gmtEnd(String gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * gmtStart.
             */
            public Builder gmtStart(String gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * isConsistent.
             */
            public Builder isConsistent(Integer isConsistent) {
                this.isConsistent = isConsistent;
                return this;
            }

            /**
             * metricColumCount.
             */
            public Builder metricColumCount(Long metricColumCount) {
                this.metricColumCount = metricColumCount;
                return this;
            }

            /**
             * metricPassColumCount.
             */
            public Builder metricPassColumCount(Long metricPassColumCount) {
                this.metricPassColumCount = metricPassColumCount;
                return this;
            }

            /**
             * passColumCount.
             */
            public Builder passColumCount(Long passColumCount) {
                this.passColumCount = passColumCount;
                return this;
            }

            /**
             * resultId.
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * sourcePtName.
             */
            public Builder sourcePtName(String sourcePtName) {
                this.sourcePtName = sourcePtName;
                return this;
            }

            /**
             * srcCount.
             */
            public Builder srcCount(String srcCount) {
                this.srcCount = srcCount;
                return this;
            }

            /**
             * srcSql.
             */
            public Builder srcSql(String srcSql) {
                this.srcSql = srcSql;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * stepId.
             */
            public Builder stepId(String stepId) {
                this.stepId = stepId;
                return this;
            }

            /**
             * targetPtName.
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
