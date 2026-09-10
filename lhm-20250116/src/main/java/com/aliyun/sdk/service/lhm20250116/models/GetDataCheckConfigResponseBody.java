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
 * {@link GetDataCheckConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCheckConfigResponseBody</p>
 */
public class GetDataCheckConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetDataCheckConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCheckConfigResponseBody create() {
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
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataCheckConfigResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check the values of errCode and errMessage for troubleshooting.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCheckConfigResponseBody build() {
            return new GetDataCheckConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataCheckConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCheckConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithm")
        private Integer algorithm;

        @com.aliyun.core.annotation.NameInMap("batchSize")
        private Integer batchSize;

        @com.aliyun.core.annotation.NameInMap("checkType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("comparator")
        private String comparator;

        @com.aliyun.core.annotation.NameInMap("extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("groupCountThreshold")
        private Float groupCountThreshold;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("isFullTableCount")
        private Integer isFullTableCount;

        @com.aliyun.core.annotation.NameInMap("isSkipped")
        private Integer isSkipped;

        @com.aliyun.core.annotation.NameInMap("metricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("sourceCheckAllColumn")
        private Integer sourceCheckAllColumn;

        @com.aliyun.core.annotation.NameInMap("sourceColumns")
        private String sourceColumns;

        @com.aliyun.core.annotation.NameInMap("sourceCompareKey")
        private String sourceCompareKey;

        @com.aliyun.core.annotation.NameInMap("sourceDataSource")
        private String sourceDataSource;

        @com.aliyun.core.annotation.NameInMap("sourceGroupClause")
        private String sourceGroupClause;

        @com.aliyun.core.annotation.NameInMap("sourceHint")
        private String sourceHint;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("sourcePartition")
        private String sourcePartition;

        @com.aliyun.core.annotation.NameInMap("sourceSql")
        private String sourceSql;

        @com.aliyun.core.annotation.NameInMap("sourceTable")
        private String sourceTable;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("sourceWhereClause")
        private String sourceWhereClause;

        @com.aliyun.core.annotation.NameInMap("targetCheckAllColumn")
        private Integer targetCheckAllColumn;

        @com.aliyun.core.annotation.NameInMap("targetColumns")
        private String targetColumns;

        @com.aliyun.core.annotation.NameInMap("targetCompareKey")
        private String targetCompareKey;

        @com.aliyun.core.annotation.NameInMap("targetDataSource")
        private String targetDataSource;

        @com.aliyun.core.annotation.NameInMap("targetGroupClause")
        private String targetGroupClause;

        @com.aliyun.core.annotation.NameInMap("targetHint")
        private String targetHint;

        @com.aliyun.core.annotation.NameInMap("targetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("targetPartition")
        private String targetPartition;

        @com.aliyun.core.annotation.NameInMap("targetSql")
        private String targetSql;

        @com.aliyun.core.annotation.NameInMap("targetTable")
        private String targetTable;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("targetWhereClause")
        private String targetWhereClause;

        @com.aliyun.core.annotation.NameInMap("taskConfigInfo")
        private String taskConfigInfo;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("totalCountThreshold")
        private Float totalCountThreshold;

        private Data(Builder builder) {
            this.algorithm = builder.algorithm;
            this.batchSize = builder.batchSize;
            this.checkType = builder.checkType;
            this.comparator = builder.comparator;
            this.extra = builder.extra;
            this.groupCountThreshold = builder.groupCountThreshold;
            this.id = builder.id;
            this.isFullTableCount = builder.isFullTableCount;
            this.isSkipped = builder.isSkipped;
            this.metricType = builder.metricType;
            this.sourceCheckAllColumn = builder.sourceCheckAllColumn;
            this.sourceColumns = builder.sourceColumns;
            this.sourceCompareKey = builder.sourceCompareKey;
            this.sourceDataSource = builder.sourceDataSource;
            this.sourceGroupClause = builder.sourceGroupClause;
            this.sourceHint = builder.sourceHint;
            this.sourceId = builder.sourceId;
            this.sourcePartition = builder.sourcePartition;
            this.sourceSql = builder.sourceSql;
            this.sourceTable = builder.sourceTable;
            this.sourceType = builder.sourceType;
            this.sourceWhereClause = builder.sourceWhereClause;
            this.targetCheckAllColumn = builder.targetCheckAllColumn;
            this.targetColumns = builder.targetColumns;
            this.targetCompareKey = builder.targetCompareKey;
            this.targetDataSource = builder.targetDataSource;
            this.targetGroupClause = builder.targetGroupClause;
            this.targetHint = builder.targetHint;
            this.targetId = builder.targetId;
            this.targetPartition = builder.targetPartition;
            this.targetSql = builder.targetSql;
            this.targetTable = builder.targetTable;
            this.targetType = builder.targetType;
            this.targetWhereClause = builder.targetWhereClause;
            this.taskConfigInfo = builder.taskConfigInfo;
            this.taskId = builder.taskId;
            this.totalCountThreshold = builder.totalCountThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return batchSize
         */
        public Integer getBatchSize() {
            return this.batchSize;
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return comparator
         */
        public String getComparator() {
            return this.comparator;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return groupCountThreshold
         */
        public Float getGroupCountThreshold() {
            return this.groupCountThreshold;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isFullTableCount
         */
        public Integer getIsFullTableCount() {
            return this.isFullTableCount;
        }

        /**
         * @return isSkipped
         */
        public Integer getIsSkipped() {
            return this.isSkipped;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        /**
         * @return sourceCheckAllColumn
         */
        public Integer getSourceCheckAllColumn() {
            return this.sourceCheckAllColumn;
        }

        /**
         * @return sourceColumns
         */
        public String getSourceColumns() {
            return this.sourceColumns;
        }

        /**
         * @return sourceCompareKey
         */
        public String getSourceCompareKey() {
            return this.sourceCompareKey;
        }

        /**
         * @return sourceDataSource
         */
        public String getSourceDataSource() {
            return this.sourceDataSource;
        }

        /**
         * @return sourceGroupClause
         */
        public String getSourceGroupClause() {
            return this.sourceGroupClause;
        }

        /**
         * @return sourceHint
         */
        public String getSourceHint() {
            return this.sourceHint;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourcePartition
         */
        public String getSourcePartition() {
            return this.sourcePartition;
        }

        /**
         * @return sourceSql
         */
        public String getSourceSql() {
            return this.sourceSql;
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
         * @return targetCheckAllColumn
         */
        public Integer getTargetCheckAllColumn() {
            return this.targetCheckAllColumn;
        }

        /**
         * @return targetColumns
         */
        public String getTargetColumns() {
            return this.targetColumns;
        }

        /**
         * @return targetCompareKey
         */
        public String getTargetCompareKey() {
            return this.targetCompareKey;
        }

        /**
         * @return targetDataSource
         */
        public String getTargetDataSource() {
            return this.targetDataSource;
        }

        /**
         * @return targetGroupClause
         */
        public String getTargetGroupClause() {
            return this.targetGroupClause;
        }

        /**
         * @return targetHint
         */
        public String getTargetHint() {
            return this.targetHint;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetPartition
         */
        public String getTargetPartition() {
            return this.targetPartition;
        }

        /**
         * @return targetSql
         */
        public String getTargetSql() {
            return this.targetSql;
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
         * @return taskConfigInfo
         */
        public String getTaskConfigInfo() {
            return this.taskConfigInfo;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return totalCountThreshold
         */
        public Float getTotalCountThreshold() {
            return this.totalCountThreshold;
        }

        public static final class Builder {
            private Integer algorithm; 
            private Integer batchSize; 
            private Integer checkType; 
            private String comparator; 
            private String extra; 
            private Float groupCountThreshold; 
            private Long id; 
            private Integer isFullTableCount; 
            private Integer isSkipped; 
            private String metricType; 
            private Integer sourceCheckAllColumn; 
            private String sourceColumns; 
            private String sourceCompareKey; 
            private String sourceDataSource; 
            private String sourceGroupClause; 
            private String sourceHint; 
            private String sourceId; 
            private String sourcePartition; 
            private String sourceSql; 
            private String sourceTable; 
            private String sourceType; 
            private String sourceWhereClause; 
            private Integer targetCheckAllColumn; 
            private String targetColumns; 
            private String targetCompareKey; 
            private String targetDataSource; 
            private String targetGroupClause; 
            private String targetHint; 
            private String targetId; 
            private String targetPartition; 
            private String targetSql; 
            private String targetTable; 
            private String targetType; 
            private String targetWhereClause; 
            private String taskConfigInfo; 
            private Long taskId; 
            private Float totalCountThreshold; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.algorithm = model.algorithm;
                this.batchSize = model.batchSize;
                this.checkType = model.checkType;
                this.comparator = model.comparator;
                this.extra = model.extra;
                this.groupCountThreshold = model.groupCountThreshold;
                this.id = model.id;
                this.isFullTableCount = model.isFullTableCount;
                this.isSkipped = model.isSkipped;
                this.metricType = model.metricType;
                this.sourceCheckAllColumn = model.sourceCheckAllColumn;
                this.sourceColumns = model.sourceColumns;
                this.sourceCompareKey = model.sourceCompareKey;
                this.sourceDataSource = model.sourceDataSource;
                this.sourceGroupClause = model.sourceGroupClause;
                this.sourceHint = model.sourceHint;
                this.sourceId = model.sourceId;
                this.sourcePartition = model.sourcePartition;
                this.sourceSql = model.sourceSql;
                this.sourceTable = model.sourceTable;
                this.sourceType = model.sourceType;
                this.sourceWhereClause = model.sourceWhereClause;
                this.targetCheckAllColumn = model.targetCheckAllColumn;
                this.targetColumns = model.targetColumns;
                this.targetCompareKey = model.targetCompareKey;
                this.targetDataSource = model.targetDataSource;
                this.targetGroupClause = model.targetGroupClause;
                this.targetHint = model.targetHint;
                this.targetId = model.targetId;
                this.targetPartition = model.targetPartition;
                this.targetSql = model.targetSql;
                this.targetTable = model.targetTable;
                this.targetType = model.targetType;
                this.targetWhereClause = model.targetWhereClause;
                this.taskConfigInfo = model.taskConfigInfo;
                this.taskId = model.taskId;
                this.totalCountThreshold = model.totalCountThreshold;
            } 

            /**
             * <p>The check algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The batch size.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>The check type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The comparison type. Valid values: =, !=, &gt;, &lt;, &gt;=, &lt;=, contains, does not contain, and ==.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder comparator(String comparator) {
                this.comparator = comparator;
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
             * <p>The group data volume comparison threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder groupCountThreshold(Float groupCountThreshold) {
                this.groupCountThreshold = groupCountThreshold;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether a full table count is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isFullTableCount(Integer isFullTableCount) {
                this.isFullTableCount = isFullTableCount;
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
             * <p>The metric type. Valid values:</p>
             * <ul>
             * <li>CUSTOM_METRIC_NUM: built-in NUM mode.</li>
             * <li>CUSTOM_METRIC_LEN: built-in LEN mode.</li>
             * <li>CUSTOM_METRIC_MIX: built-in MIX mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM_METRIC_MIX</p>
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * <p>Indicates whether all columns are checked on the source side. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceCheckAllColumn(Integer sourceCheckAllColumn) {
                this.sourceCheckAllColumn = sourceCheckAllColumn;
                return this;
            }

            /**
             * <p>The source table columns. You can specify multiple columns separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder sourceColumns(String sourceColumns) {
                this.sourceColumns = sourceColumns;
                return this;
            }

            /**
             * <p>The source comparison key.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder sourceCompareKey(String sourceCompareKey) {
                this.sourceCompareKey = sourceCompareKey;
                return this;
            }

            /**
             * <p>The name of the source datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder sourceDataSource(String sourceDataSource) {
                this.sourceDataSource = sourceDataSource;
                return this;
            }

            /**
             * <p>The GROUP BY clause for the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder sourceGroupClause(String sourceGroupClause) {
                this.sourceGroupClause = sourceGroupClause;
                return this;
            }

            /**
             * <p>The hint for the source side.</p>
             */
            public Builder sourceHint(String sourceHint) {
                this.sourceHint = sourceHint;
                return this;
            }

            /**
             * <p>The ID of the source datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
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
             * <p>The SQL statement for the source side.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM t;</p>
             */
            public Builder sourceSql(String sourceSql) {
                this.sourceSql = sourceSql;
                return this;
            }

            /**
             * <p>The source table.</p>
             * 
             * <strong>example:</strong>
             * <p>table_demo</p>
             */
            public Builder sourceTable(String sourceTable) {
                this.sourceTable = sourceTable;
                return this;
            }

            /**
             * <p>The type of the source datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The WHERE clause for the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
             */
            public Builder sourceWhereClause(String sourceWhereClause) {
                this.sourceWhereClause = sourceWhereClause;
                return this;
            }

            /**
             * <p>Indicates whether all columns are checked on the target side. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder targetCheckAllColumn(Integer targetCheckAllColumn) {
                this.targetCheckAllColumn = targetCheckAllColumn;
                return this;
            }

            /**
             * <p>The target table columns. You can specify multiple columns separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder targetColumns(String targetColumns) {
                this.targetColumns = targetColumns;
                return this;
            }

            /**
             * <p>The target comparison key.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder targetCompareKey(String targetCompareKey) {
                this.targetCompareKey = targetCompareKey;
                return this;
            }

            /**
             * <p>The target datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder targetDataSource(String targetDataSource) {
                this.targetDataSource = targetDataSource;
                return this;
            }

            /**
             * <p>The GROUP BY clause for the target table.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder targetGroupClause(String targetGroupClause) {
                this.targetGroupClause = targetGroupClause;
                return this;
            }

            /**
             * <p>The hint for the target side.</p>
             */
            public Builder targetHint(String targetHint) {
                this.targetHint = targetHint;
                return this;
            }

            /**
             * <p>The ID of the target datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The target partition.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20260116</p>
             */
            public Builder targetPartition(String targetPartition) {
                this.targetPartition = targetPartition;
                return this;
            }

            /**
             * <p>The SQL statement for the target side.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM t;</p>
             */
            public Builder targetSql(String targetSql) {
                this.targetSql = targetSql;
                return this;
            }

            /**
             * <p>The target table.</p>
             * 
             * <strong>example:</strong>
             * <p>table_demo</p>
             */
            public Builder targetTable(String targetTable) {
                this.targetTable = targetTable;
                return this;
            }

            /**
             * <p>The type of the target datasource.</p>
             * 
             * <strong>example:</strong>
             * <p>hive</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The WHERE clause for the target table.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
             */
            public Builder targetWhereClause(String targetWhereClause) {
                this.targetWhereClause = targetWhereClause;
                return this;
            }

            /**
             * <p>The configuration details.</p>
             * 
             * <strong>example:</strong>
             * <p>lhm|lhm_dw|*</p>
             */
            public Builder taskConfigInfo(String taskConfigInfo) {
                this.taskConfigInfo = taskConfigInfo;
                return this;
            }

            /**
             * <p>The batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The total data volume comparison threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder totalCountThreshold(Float totalCountThreshold) {
                this.totalCountThreshold = totalCountThreshold;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
