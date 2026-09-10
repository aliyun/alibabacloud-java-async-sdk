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
 * {@link ListDataCheckColumnResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCheckColumnResultsResponseBody</p>
 */
public class ListDataCheckColumnResultsResponseBody extends TeaModel {
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

    private ListDataCheckColumnResultsResponseBody(Builder builder) {
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

    public static ListDataCheckColumnResultsResponseBody create() {
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

        private Builder(ListDataCheckColumnResultsResponseBody model) {
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
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
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
         * <p>not supported.pos 3222, line 112, column 14, token IDENTIFIER settings</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The page number that indicates the requested page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>016D6CE5-51C6-5767-A8F9-D2818FC56509</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataCheckColumnResultsResponseBody build() {
            return new ListDataCheckColumnResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCheckColumnResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCheckColumnResultsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actualThreshold")
        private String actualThreshold;

        @com.aliyun.core.annotation.NameInMap("checkResult")
        private Integer checkResult;

        @com.aliyun.core.annotation.NameInMap("checkRule")
        private String checkRule;

        @com.aliyun.core.annotation.NameInMap("dstAlias")
        private String dstAlias;

        @com.aliyun.core.annotation.NameInMap("dstColumnName")
        private String dstColumnName;

        @com.aliyun.core.annotation.NameInMap("dstColumnType")
        private String dstColumnType;

        @com.aliyun.core.annotation.NameInMap("dstMetricColumn")
        private String dstMetricColumn;

        @com.aliyun.core.annotation.NameInMap("dstResult")
        private String dstResult;

        @com.aliyun.core.annotation.NameInMap("expectThreshold")
        private String expectThreshold;

        @com.aliyun.core.annotation.NameInMap("isConsistent")
        private Integer isConsistent;

        @com.aliyun.core.annotation.NameInMap("srcAlias")
        private String srcAlias;

        @com.aliyun.core.annotation.NameInMap("srcColumnName")
        private String srcColumnName;

        @com.aliyun.core.annotation.NameInMap("srcColumnType")
        private String srcColumnType;

        @com.aliyun.core.annotation.NameInMap("srcMetricColumn")
        private String srcMetricColumn;

        @com.aliyun.core.annotation.NameInMap("srcResult")
        private String srcResult;

        @com.aliyun.core.annotation.NameInMap("stepId")
        private Long stepId;

        private Data(Builder builder) {
            this.actualThreshold = builder.actualThreshold;
            this.checkResult = builder.checkResult;
            this.checkRule = builder.checkRule;
            this.dstAlias = builder.dstAlias;
            this.dstColumnName = builder.dstColumnName;
            this.dstColumnType = builder.dstColumnType;
            this.dstMetricColumn = builder.dstMetricColumn;
            this.dstResult = builder.dstResult;
            this.expectThreshold = builder.expectThreshold;
            this.isConsistent = builder.isConsistent;
            this.srcAlias = builder.srcAlias;
            this.srcColumnName = builder.srcColumnName;
            this.srcColumnType = builder.srcColumnType;
            this.srcMetricColumn = builder.srcMetricColumn;
            this.srcResult = builder.srcResult;
            this.stepId = builder.stepId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actualThreshold
         */
        public String getActualThreshold() {
            return this.actualThreshold;
        }

        /**
         * @return checkResult
         */
        public Integer getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return checkRule
         */
        public String getCheckRule() {
            return this.checkRule;
        }

        /**
         * @return dstAlias
         */
        public String getDstAlias() {
            return this.dstAlias;
        }

        /**
         * @return dstColumnName
         */
        public String getDstColumnName() {
            return this.dstColumnName;
        }

        /**
         * @return dstColumnType
         */
        public String getDstColumnType() {
            return this.dstColumnType;
        }

        /**
         * @return dstMetricColumn
         */
        public String getDstMetricColumn() {
            return this.dstMetricColumn;
        }

        /**
         * @return dstResult
         */
        public String getDstResult() {
            return this.dstResult;
        }

        /**
         * @return expectThreshold
         */
        public String getExpectThreshold() {
            return this.expectThreshold;
        }

        /**
         * @return isConsistent
         */
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

        /**
         * @return srcAlias
         */
        public String getSrcAlias() {
            return this.srcAlias;
        }

        /**
         * @return srcColumnName
         */
        public String getSrcColumnName() {
            return this.srcColumnName;
        }

        /**
         * @return srcColumnType
         */
        public String getSrcColumnType() {
            return this.srcColumnType;
        }

        /**
         * @return srcMetricColumn
         */
        public String getSrcMetricColumn() {
            return this.srcMetricColumn;
        }

        /**
         * @return srcResult
         */
        public String getSrcResult() {
            return this.srcResult;
        }

        /**
         * @return stepId
         */
        public Long getStepId() {
            return this.stepId;
        }

        public static final class Builder {
            private String actualThreshold; 
            private Integer checkResult; 
            private String checkRule; 
            private String dstAlias; 
            private String dstColumnName; 
            private String dstColumnType; 
            private String dstMetricColumn; 
            private String dstResult; 
            private String expectThreshold; 
            private Integer isConsistent; 
            private String srcAlias; 
            private String srcColumnName; 
            private String srcColumnType; 
            private String srcMetricColumn; 
            private String srcResult; 
            private Long stepId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.actualThreshold = model.actualThreshold;
                this.checkResult = model.checkResult;
                this.checkRule = model.checkRule;
                this.dstAlias = model.dstAlias;
                this.dstColumnName = model.dstColumnName;
                this.dstColumnType = model.dstColumnType;
                this.dstMetricColumn = model.dstMetricColumn;
                this.dstResult = model.dstResult;
                this.expectThreshold = model.expectThreshold;
                this.isConsistent = model.isConsistent;
                this.srcAlias = model.srcAlias;
                this.srcColumnName = model.srcColumnName;
                this.srcColumnType = model.srcColumnType;
                this.srcMetricColumn = model.srcMetricColumn;
                this.srcResult = model.srcResult;
                this.stepId = model.stepId;
            } 

            /**
             * <p>The actual difference.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00</p>
             */
            public Builder actualThreshold(String actualThreshold) {
                this.actualThreshold = actualThreshold;
                return this;
            }

            /**
             * <p>The execution result. Valid values:</p>
             * <ul>
             * <li>0: no record.</li>
             * <li>1: passed.</li>
             * <li>2: failed.</li>
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
             * <p>The comparison rule.</p>
             * 
             * <strong>example:</strong>
             * <p>SUM</p>
             */
            public Builder checkRule(String checkRule) {
                this.checkRule = checkRule;
                return this;
            }

            /**
             * <p>The alias of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>dst</p>
             */
            public Builder dstAlias(String dstAlias) {
                this.dstAlias = dstAlias;
                return this;
            }

            /**
             * <p>The field name of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>amount</p>
             */
            public Builder dstColumnName(String dstColumnName) {
                this.dstColumnName = dstColumnName;
                return this;
            }

            /**
             * <p>The field type of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>decimal(38,18)</p>
             */
            public Builder dstColumnType(String dstColumnType) {
                this.dstColumnType = dstColumnType;
                return this;
            }

            /**
             * <p>The metric key of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>dst_sum_amount</p>
             */
            public Builder dstMetricColumn(String dstMetricColumn) {
                this.dstMetricColumn = dstMetricColumn;
                return this;
            }

            /**
             * <p>The result value of the destination field.</p>
             * 
             * <strong>example:</strong>
             * <p>1000.00</p>
             */
            public Builder dstResult(String dstResult) {
                this.dstResult = dstResult;
                return this;
            }

            /**
             * <p>The expected threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00</p>
             */
            public Builder expectThreshold(String expectThreshold) {
                this.expectThreshold = expectThreshold;
                return this;
            }

            /**
             * <p>The validation result. Valid values:</p>
             * <ul>
             * <li>0: inconsistent.</li>
             * <li>1: consistent.</li>
             * <li>2: manually repaired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isConsistent(Integer isConsistent) {
                this.isConsistent = isConsistent;
                return this;
            }

            /**
             * <p>The alias of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>src</p>
             */
            public Builder srcAlias(String srcAlias) {
                this.srcAlias = srcAlias;
                return this;
            }

            /**
             * <p>The field name of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>amount</p>
             */
            public Builder srcColumnName(String srcColumnName) {
                this.srcColumnName = srcColumnName;
                return this;
            }

            /**
             * <p>The field type of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>decimal(38,18)</p>
             */
            public Builder srcColumnType(String srcColumnType) {
                this.srcColumnType = srcColumnType;
                return this;
            }

            /**
             * <p>The metric key of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>src_sum_amount</p>
             */
            public Builder srcMetricColumn(String srcMetricColumn) {
                this.srcMetricColumn = srcMetricColumn;
                return this;
            }

            /**
             * <p>The result value of the source field.</p>
             * 
             * <strong>example:</strong>
             * <p>1000.00</p>
             */
            public Builder srcResult(String srcResult) {
                this.srcResult = srcResult;
                return this;
            }

            /**
             * <p>The step ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stepId(Long stepId) {
                this.stepId = stepId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
