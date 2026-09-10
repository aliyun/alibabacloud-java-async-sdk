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
 * {@link GetStepResultOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetStepResultOverviewResponseBody</p>
 */
public class GetStepResultOverviewResponseBody extends TeaModel {
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

    private GetStepResultOverviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStepResultOverviewResponseBody create() {
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

        private Builder(GetStepResultOverviewResponseBody model) {
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
         * <p>The fault message code.</p>
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
         * <p>not supported.pos 10960, line 327, column 26, token IDENTIFIER settings</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>512AF06E-3B95-5932-81D8-717B15143359</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStepResultOverviewResponseBody build() {
            return new GetStepResultOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStepResultOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetStepResultOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkColumnCount")
        private Long checkColumnCount;

        @com.aliyun.core.annotation.NameInMap("dstMetricName")
        private String dstMetricName;

        @com.aliyun.core.annotation.NameInMap("isConsistent")
        private Integer isConsistent;

        @com.aliyun.core.annotation.NameInMap("metricColumnCount")
        private Long metricColumnCount;

        @com.aliyun.core.annotation.NameInMap("metricPassColumnCount")
        private Long metricPassColumnCount;

        @com.aliyun.core.annotation.NameInMap("passColumnCount")
        private Long passColumnCount;

        @com.aliyun.core.annotation.NameInMap("resultId")
        private String resultId;

        @com.aliyun.core.annotation.NameInMap("sourcePtName")
        private String sourcePtName;

        @com.aliyun.core.annotation.NameInMap("sourceTable")
        private String sourceTable;

        @com.aliyun.core.annotation.NameInMap("srcMetricName")
        private String srcMetricName;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("targetPtName")
        private String targetPtName;

        @com.aliyun.core.annotation.NameInMap("targetTable")
        private String targetTable;

        private Data(Builder builder) {
            this.checkColumnCount = builder.checkColumnCount;
            this.dstMetricName = builder.dstMetricName;
            this.isConsistent = builder.isConsistent;
            this.metricColumnCount = builder.metricColumnCount;
            this.metricPassColumnCount = builder.metricPassColumnCount;
            this.passColumnCount = builder.passColumnCount;
            this.resultId = builder.resultId;
            this.sourcePtName = builder.sourcePtName;
            this.sourceTable = builder.sourceTable;
            this.srcMetricName = builder.srcMetricName;
            this.status = builder.status;
            this.targetPtName = builder.targetPtName;
            this.targetTable = builder.targetTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkColumnCount
         */
        public Long getCheckColumnCount() {
            return this.checkColumnCount;
        }

        /**
         * @return dstMetricName
         */
        public String getDstMetricName() {
            return this.dstMetricName;
        }

        /**
         * @return isConsistent
         */
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

        /**
         * @return metricColumnCount
         */
        public Long getMetricColumnCount() {
            return this.metricColumnCount;
        }

        /**
         * @return metricPassColumnCount
         */
        public Long getMetricPassColumnCount() {
            return this.metricPassColumnCount;
        }

        /**
         * @return passColumnCount
         */
        public Long getPassColumnCount() {
            return this.passColumnCount;
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
         * @return sourceTable
         */
        public String getSourceTable() {
            return this.sourceTable;
        }

        /**
         * @return srcMetricName
         */
        public String getSrcMetricName() {
            return this.srcMetricName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return targetPtName
         */
        public String getTargetPtName() {
            return this.targetPtName;
        }

        /**
         * @return targetTable
         */
        public String getTargetTable() {
            return this.targetTable;
        }

        public static final class Builder {
            private Long checkColumnCount; 
            private String dstMetricName; 
            private Integer isConsistent; 
            private Long metricColumnCount; 
            private Long metricPassColumnCount; 
            private Long passColumnCount; 
            private String resultId; 
            private String sourcePtName; 
            private String sourceTable; 
            private String srcMetricName; 
            private Integer status; 
            private String targetPtName; 
            private String targetTable; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkColumnCount = model.checkColumnCount;
                this.dstMetricName = model.dstMetricName;
                this.isConsistent = model.isConsistent;
                this.metricColumnCount = model.metricColumnCount;
                this.metricPassColumnCount = model.metricPassColumnCount;
                this.passColumnCount = model.passColumnCount;
                this.resultId = model.resultId;
                this.sourcePtName = model.sourcePtName;
                this.sourceTable = model.sourceTable;
                this.srcMetricName = model.srcMetricName;
                this.status = model.status;
                this.targetPtName = model.targetPtName;
                this.targetTable = model.targetTable;
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
             * <p>The metric name of the target.</p>
             * 
             * <strong>example:</strong>
             * <p>amount</p>
             */
            public Builder dstMetricName(String dstMetricName) {
                this.dstMetricName = dstMetricName;
                return this;
            }

            /**
             * <p>Indicates whether the source and target are consistent. Valid values:</p>
             * <ul>
             * <li>0: Inconsistent.</li>
             * <li>1: Consistent.</li>
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
             * <p>The number of validated metrics.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder metricColumnCount(Long metricColumnCount) {
                this.metricColumnCount = metricColumnCount;
                return this;
            }

            /**
             * <p>The number of metrics that passed validation.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder metricPassColumnCount(Long metricPassColumnCount) {
                this.metricPassColumnCount = metricPassColumnCount;
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
             * <p>The unique ID of the validation result.</p>
             * 
             * <strong>example:</strong>
             * <p>30001</p>
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * <p>The partition name of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20260116</p>
             */
            public Builder sourcePtName(String sourcePtName) {
                this.sourcePtName = sourcePtName;
                return this;
            }

            /**
             * <p>The table name of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>table_demo</p>
             */
            public Builder sourceTable(String sourceTable) {
                this.sourceTable = sourceTable;
                return this;
            }

            /**
             * <p>The metric name of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>amount</p>
             */
            public Builder srcMetricName(String srcMetricName) {
                this.srcMetricName = srcMetricName;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>0: Created.</li>
             * <li>1: Running.</li>
             * <li>2: Completed.</li>
             * <li>3: Stopped.</li>
             * <li>4: Canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The partition name of the target.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20260116</p>
             */
            public Builder targetPtName(String targetPtName) {
                this.targetPtName = targetPtName;
                return this;
            }

            /**
             * <p>The table name of the target.</p>
             * 
             * <strong>example:</strong>
             * <p>table_demo</p>
             */
            public Builder targetTable(String targetTable) {
                this.targetTable = targetTable;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
