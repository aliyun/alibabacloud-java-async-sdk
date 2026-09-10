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
 * {@link GetDataCheckTaskConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCheckTaskConfigResponseBody</p>
 */
public class GetDataCheckTaskConfigResponseBody extends TeaModel {
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

    private GetDataCheckTaskConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCheckTaskConfigResponseBody create() {
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

        private Builder(GetDataCheckTaskConfigResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data body returned by the operation. For the field structure, see the descriptions of child fields.</p>
         */
        public Builder data(Data data) {
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
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for troubleshooting.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCheckTaskConfigResponseBody build() {
            return new GetDataCheckTaskConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataCheckTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCheckTaskConfigResponseBody</p>
     */
    public static class DataCheckConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithm")
        private Integer algorithm;

        @com.aliyun.core.annotation.NameInMap("batchId")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("batchSize")
        private Integer batchSize;

        @com.aliyun.core.annotation.NameInMap("checkType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("comparator")
        private String comparator;

        @com.aliyun.core.annotation.NameInMap("extra")
        private Object extra;

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

        @com.aliyun.core.annotation.NameInMap("taskConfigId")
        private Long taskConfigId;

        @com.aliyun.core.annotation.NameInMap("taskConfigInfo")
        private String taskConfigInfo;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("totalCountThreshold")
        private Float totalCountThreshold;

        private DataCheckConfig(Builder builder) {
            this.algorithm = builder.algorithm;
            this.batchId = builder.batchId;
            this.batchSize = builder.batchSize;
            this.checkType = builder.checkType;
            this.comparator = builder.comparator;
            this.extra = builder.extra;
            this.groupCountThreshold = builder.groupCountThreshold;
            this.id = builder.id;
            this.isFullTableCount = builder.isFullTableCount;
            this.isSkipped = builder.isSkipped;
            this.metricType = builder.metricType;
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
            this.taskConfigId = builder.taskConfigId;
            this.taskConfigInfo = builder.taskConfigInfo;
            this.token = builder.token;
            this.totalCountThreshold = builder.totalCountThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCheckConfig create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return batchId
         */
        public Long getBatchId() {
            return this.batchId;
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
        public Object getExtra() {
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
         * @return taskConfigId
         */
        public Long getTaskConfigId() {
            return this.taskConfigId;
        }

        /**
         * @return taskConfigInfo
         */
        public String getTaskConfigInfo() {
            return this.taskConfigInfo;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return totalCountThreshold
         */
        public Float getTotalCountThreshold() {
            return this.totalCountThreshold;
        }

        public static final class Builder {
            private Integer algorithm; 
            private Long batchId; 
            private Integer batchSize; 
            private Integer checkType; 
            private String comparator; 
            private Object extra; 
            private Float groupCountThreshold; 
            private Long id; 
            private Integer isFullTableCount; 
            private Integer isSkipped; 
            private String metricType; 
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
            private Long taskConfigId; 
            private String taskConfigInfo; 
            private String token; 
            private Float totalCountThreshold; 

            private Builder() {
            } 

            private Builder(DataCheckConfig model) {
                this.algorithm = model.algorithm;
                this.batchId = model.batchId;
                this.batchSize = model.batchSize;
                this.checkType = model.checkType;
                this.comparator = model.comparator;
                this.extra = model.extra;
                this.groupCountThreshold = model.groupCountThreshold;
                this.id = model.id;
                this.isFullTableCount = model.isFullTableCount;
                this.isSkipped = model.isSkipped;
                this.metricType = model.metricType;
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
                this.taskConfigId = model.taskConfigId;
                this.taskConfigInfo = model.taskConfigInfo;
                this.token = model.token;
                this.totalCountThreshold = model.totalCountThreshold;
            } 

            /**
             * <p>The validation algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
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
             * <p>The validation rule type. Valid values:</p>
             * <ul>
             * <li>0: data volume comparison.</li>
             * <li>1: metric comparison.</li>
             * <li>2: weak content comparison.</li>
             * <li>3: custom comparison.</li>
             * <li>4: full-text comparison.</li>
             * <li>5: null value ratio comparison.</li>
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
            public Builder extra(Object extra) {
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
             * <p>Specifies whether to perform a full table count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isFullTableCount(Integer isFullTableCount) {
                this.isFullTableCount = isFullTableCount;
                return this;
            }

            /**
             * <p>Specifies whether to skip the task. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
             * </ul>
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
             * <p>The source comparison key (the key field used for data comparison between the source and destination).</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder sourceCompareKey(String sourceCompareKey) {
                this.sourceCompareKey = sourceCompareKey;
                return this;
            }

            /**
             * <p>The source data source name.</p>
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
             * sourceHint.
             */
            public Builder sourceHint(String sourceHint) {
                this.sourceHint = sourceHint;
                return this;
            }

            /**
             * <p>The source data source ID.</p>
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
             * <p>The source SQL statement.</p>
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
             * <p>The source data source type.</p>
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
             * <p>The destination table columns. You can specify multiple columns separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder targetColumns(String targetColumns) {
                this.targetColumns = targetColumns;
                return this;
            }

            /**
             * <p>The destination comparison key (the key field used for data comparison between the source and destination).</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder targetCompareKey(String targetCompareKey) {
                this.targetCompareKey = targetCompareKey;
                return this;
            }

            /**
             * <p>The destination data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder targetDataSource(String targetDataSource) {
                this.targetDataSource = targetDataSource;
                return this;
            }

            /**
             * <p>The GROUP BY clause for the destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder targetGroupClause(String targetGroupClause) {
                this.targetGroupClause = targetGroupClause;
                return this;
            }

            /**
             * targetHint.
             */
            public Builder targetHint(String targetHint) {
                this.targetHint = targetHint;
                return this;
            }

            /**
             * <p>The destination ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
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
             * <p>The destination SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM t;</p>
             */
            public Builder targetSql(String targetSql) {
                this.targetSql = targetSql;
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
             * <p>The WHERE clause for the destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
             */
            public Builder targetWhereClause(String targetWhereClause) {
                this.targetWhereClause = targetWhereClause;
                return this;
            }

            /**
             * <p>The validation task configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder taskConfigId(Long taskConfigId) {
                this.taskConfigId = taskConfigId;
                return this;
            }

            /**
             * <p>The validation task configuration information (regular expression matching rules). This parameter takes effect only when taskMode is set to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>lhm|lhm_dw|*</p>
             */
            public Builder taskConfigInfo(String taskConfigInfo) {
                this.taskConfigInfo = taskConfigInfo;
                return this;
            }

            /**
             * <p>The validation batch token. Together with batchId, it identifies the result records generated by a validation batch.</p>
             * 
             * <strong>example:</strong>
             * <p>9f2c7a1e4b8d****</p>
             */
            public Builder token(String token) {
                this.token = token;
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

            public DataCheckConfig build() {
                return new DataCheckConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCheckTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCheckTaskConfigResponseBody</p>
     */
    public static class ScopeFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("end")
        private String end;

        @com.aliyun.core.annotation.NameInMap("lastN")
        private Integer lastN;

        @com.aliyun.core.annotation.NameInMap("scopeFilterType")
        private Integer scopeFilterType;

        @com.aliyun.core.annotation.NameInMap("start")
        private String start;

        private ScopeFilter(Builder builder) {
            this.end = builder.end;
            this.lastN = builder.lastN;
            this.scopeFilterType = builder.scopeFilterType;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeFilter create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return lastN
         */
        public Integer getLastN() {
            return this.lastN;
        }

        /**
         * @return scopeFilterType
         */
        public Integer getScopeFilterType() {
            return this.scopeFilterType;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private Integer lastN; 
            private Integer scopeFilterType; 
            private String start; 

            private Builder() {
            } 

            private Builder(ScopeFilter model) {
                this.end = model.end;
                this.lastN = model.lastN;
                this.scopeFilterType = model.scopeFilterType;
                this.start = model.start;
            } 

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-14 13:59:00</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The last N parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder lastN(Integer lastN) {
                this.lastN = lastN;
                return this;
            }

            /**
             * <p>The filter type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scopeFilterType(Integer scopeFilterType) {
                this.scopeFilterType = scopeFilterType;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-14 11:21:00</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public ScopeFilter build() {
                return new ScopeFilter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCheckTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCheckTaskConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchId")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("checkGlobalParams")
        private String checkGlobalParams;

        @com.aliyun.core.annotation.NameInMap("checkTemplateId")
        private String checkTemplateId;

        @com.aliyun.core.annotation.NameInMap("checkType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("concurrency")
        private Integer concurrency;

        @com.aliyun.core.annotation.NameInMap("cronExp")
        private String cronExp;

        @com.aliyun.core.annotation.NameInMap("dataCheckConfig")
        private java.util.List<DataCheckConfig> dataCheckConfig;

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

        @com.aliyun.core.annotation.NameInMap("executeType")
        private Integer executeType;

        @com.aliyun.core.annotation.NameInMap("fullTableCount")
        private Integer fullTableCount;

        @com.aliyun.core.annotation.NameInMap("groupCountThreshold")
        private Float groupCountThreshold;

        @com.aliyun.core.annotation.NameInMap("isBuiltin")
        private Integer isBuiltin;

        @com.aliyun.core.annotation.NameInMap("isScheduled")
        private Integer isScheduled;

        @com.aliyun.core.annotation.NameInMap("isWhiteList")
        private Integer isWhiteList;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("scheduleId")
        private Long scheduleId;

        @com.aliyun.core.annotation.NameInMap("scopeFilter")
        private ScopeFilter scopeFilter;

        @com.aliyun.core.annotation.NameInMap("sourceGlobalParams")
        private String sourceGlobalParams;

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

        @com.aliyun.core.annotation.NameInMap("startImmediately")
        private Integer startImmediately;

        @com.aliyun.core.annotation.NameInMap("targetGlobalParams")
        private String targetGlobalParams;

        @com.aliyun.core.annotation.NameInMap("taskConfigInfo")
        private String taskConfigInfo;

        @com.aliyun.core.annotation.NameInMap("taskDescription")
        private String taskDescription;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("taskMode")
        private Integer taskMode;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("totalCountThreshold")
        private Float totalCountThreshold;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.batchId = builder.batchId;
            this.checkGlobalParams = builder.checkGlobalParams;
            this.checkTemplateId = builder.checkTemplateId;
            this.checkType = builder.checkType;
            this.concurrency = builder.concurrency;
            this.cronExp = builder.cronExp;
            this.dataCheckConfig = builder.dataCheckConfig;
            this.dstDsId = builder.dstDsId;
            this.dstDsName = builder.dstDsName;
            this.dstDsType = builder.dstDsType;
            this.dstEngineId = builder.dstEngineId;
            this.dstEngineName = builder.dstEngineName;
            this.dstEngineType = builder.dstEngineType;
            this.executeType = builder.executeType;
            this.fullTableCount = builder.fullTableCount;
            this.groupCountThreshold = builder.groupCountThreshold;
            this.isBuiltin = builder.isBuiltin;
            this.isScheduled = builder.isScheduled;
            this.isWhiteList = builder.isWhiteList;
            this.requestId = builder.requestId;
            this.scheduleId = builder.scheduleId;
            this.scopeFilter = builder.scopeFilter;
            this.sourceGlobalParams = builder.sourceGlobalParams;
            this.srcDsId = builder.srcDsId;
            this.srcDsName = builder.srcDsName;
            this.srcDsType = builder.srcDsType;
            this.srcEngineId = builder.srcEngineId;
            this.srcEngineName = builder.srcEngineName;
            this.srcEngineType = builder.srcEngineType;
            this.startImmediately = builder.startImmediately;
            this.targetGlobalParams = builder.targetGlobalParams;
            this.taskConfigInfo = builder.taskConfigInfo;
            this.taskDescription = builder.taskDescription;
            this.taskId = builder.taskId;
            this.taskMode = builder.taskMode;
            this.taskName = builder.taskName;
            this.templateName = builder.templateName;
            this.tenantId = builder.tenantId;
            this.totalCountThreshold = builder.totalCountThreshold;
            this.uid = builder.uid;
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
         * @return checkGlobalParams
         */
        public String getCheckGlobalParams() {
            return this.checkGlobalParams;
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
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return cronExp
         */
        public String getCronExp() {
            return this.cronExp;
        }

        /**
         * @return dataCheckConfig
         */
        public java.util.List<DataCheckConfig> getDataCheckConfig() {
            return this.dataCheckConfig;
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
         * @return executeType
         */
        public Integer getExecuteType() {
            return this.executeType;
        }

        /**
         * @return fullTableCount
         */
        public Integer getFullTableCount() {
            return this.fullTableCount;
        }

        /**
         * @return groupCountThreshold
         */
        public Float getGroupCountThreshold() {
            return this.groupCountThreshold;
        }

        /**
         * @return isBuiltin
         */
        public Integer getIsBuiltin() {
            return this.isBuiltin;
        }

        /**
         * @return isScheduled
         */
        public Integer getIsScheduled() {
            return this.isScheduled;
        }

        /**
         * @return isWhiteList
         */
        public Integer getIsWhiteList() {
            return this.isWhiteList;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return scheduleId
         */
        public Long getScheduleId() {
            return this.scheduleId;
        }

        /**
         * @return scopeFilter
         */
        public ScopeFilter getScopeFilter() {
            return this.scopeFilter;
        }

        /**
         * @return sourceGlobalParams
         */
        public String getSourceGlobalParams() {
            return this.sourceGlobalParams;
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
         * @return startImmediately
         */
        public Integer getStartImmediately() {
            return this.startImmediately;
        }

        /**
         * @return targetGlobalParams
         */
        public String getTargetGlobalParams() {
            return this.targetGlobalParams;
        }

        /**
         * @return taskConfigInfo
         */
        public String getTaskConfigInfo() {
            return this.taskConfigInfo;
        }

        /**
         * @return taskDescription
         */
        public String getTaskDescription() {
            return this.taskDescription;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
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

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return totalCountThreshold
         */
        public Float getTotalCountThreshold() {
            return this.totalCountThreshold;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Long batchId; 
            private String checkGlobalParams; 
            private String checkTemplateId; 
            private Integer checkType; 
            private Integer concurrency; 
            private String cronExp; 
            private java.util.List<DataCheckConfig> dataCheckConfig; 
            private String dstDsId; 
            private String dstDsName; 
            private String dstDsType; 
            private String dstEngineId; 
            private String dstEngineName; 
            private String dstEngineType; 
            private Integer executeType; 
            private Integer fullTableCount; 
            private Float groupCountThreshold; 
            private Integer isBuiltin; 
            private Integer isScheduled; 
            private Integer isWhiteList; 
            private String requestId; 
            private Long scheduleId; 
            private ScopeFilter scopeFilter; 
            private String sourceGlobalParams; 
            private String srcDsId; 
            private String srcDsName; 
            private String srcDsType; 
            private String srcEngineId; 
            private String srcEngineName; 
            private String srcEngineType; 
            private Integer startImmediately; 
            private String targetGlobalParams; 
            private String taskConfigInfo; 
            private String taskDescription; 
            private Long taskId; 
            private Integer taskMode; 
            private String taskName; 
            private String templateName; 
            private String tenantId; 
            private Float totalCountThreshold; 
            private String uid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.batchId = model.batchId;
                this.checkGlobalParams = model.checkGlobalParams;
                this.checkTemplateId = model.checkTemplateId;
                this.checkType = model.checkType;
                this.concurrency = model.concurrency;
                this.cronExp = model.cronExp;
                this.dataCheckConfig = model.dataCheckConfig;
                this.dstDsId = model.dstDsId;
                this.dstDsName = model.dstDsName;
                this.dstDsType = model.dstDsType;
                this.dstEngineId = model.dstEngineId;
                this.dstEngineName = model.dstEngineName;
                this.dstEngineType = model.dstEngineType;
                this.executeType = model.executeType;
                this.fullTableCount = model.fullTableCount;
                this.groupCountThreshold = model.groupCountThreshold;
                this.isBuiltin = model.isBuiltin;
                this.isScheduled = model.isScheduled;
                this.isWhiteList = model.isWhiteList;
                this.requestId = model.requestId;
                this.scheduleId = model.scheduleId;
                this.scopeFilter = model.scopeFilter;
                this.sourceGlobalParams = model.sourceGlobalParams;
                this.srcDsId = model.srcDsId;
                this.srcDsName = model.srcDsName;
                this.srcDsType = model.srcDsType;
                this.srcEngineId = model.srcEngineId;
                this.srcEngineName = model.srcEngineName;
                this.srcEngineType = model.srcEngineType;
                this.startImmediately = model.startImmediately;
                this.targetGlobalParams = model.targetGlobalParams;
                this.taskConfigInfo = model.taskConfigInfo;
                this.taskDescription = model.taskDescription;
                this.taskId = model.taskId;
                this.taskMode = model.taskMode;
                this.taskName = model.taskName;
                this.templateName = model.templateName;
                this.tenantId = model.tenantId;
                this.totalCountThreshold = model.totalCountThreshold;
                this.uid = model.uid;
            } 

            /**
             * <p>The batch ID that uniquely identifies a data validation batch.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The global node parameter settings (built-in configuration of the data validation service).</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder checkGlobalParams(String checkGlobalParams) {
                this.checkGlobalParams = checkGlobalParams;
                return this;
            }

            /**
             * <p>The validation template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder checkTemplateId(String checkTemplateId) {
                this.checkTemplateId = checkTemplateId;
                return this;
            }

            /**
             * <p>The validation rule type. Valid values:</p>
             * <ul>
             * <li>0: data volume comparison.</li>
             * <li>1: metric comparison.</li>
             * <li>2: weak content comparison.</li>
             * <li>3: custom comparison.</li>
             * <li>4: full-text comparison.</li>
             * <li>5: null value ratio comparison.</li>
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
             * <p>The batch concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>The scheduling cycle expression (cron expression).</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 * * ?</p>
             */
            public Builder cronExp(String cronExp) {
                this.cronExp = cronExp;
                return this;
            }

            /**
             * <p>The task configuration table.</p>
             */
            public Builder dataCheckConfig(java.util.List<DataCheckConfig> dataCheckConfig) {
                this.dataCheckConfig = dataCheckConfig;
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
             * <p>The ID of the destination verification engine.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder dstEngineId(String dstEngineId) {
                this.dstEngineId = dstEngineId;
                return this;
            }

            /**
             * <p>The name of the destination verification engine.</p>
             * 
             * <strong>example:</strong>
             * <p>engine_demo</p>
             */
            public Builder dstEngineName(String dstEngineName) {
                this.dstEngineName = dstEngineName;
                return this;
            }

            /**
             * <p>The type of the destination verification engine.</p>
             * 
             * <strong>example:</strong>
             * <p>Tez</p>
             */
            public Builder dstEngineType(String dstEngineType) {
                this.dstEngineType = dstEngineType;
                return this;
            }

            /**
             * <p>The execution type. Valid values:</p>
             * <ul>
             * <li>0: immediate execution</li>
             * <li>1: scheduled execution</li>
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
             * <p>The count mode. Valid values:</p>
             * <ul>
             * <li>0: count by partition</li>
             * <li>1: count the entire table</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fullTableCount(Integer fullTableCount) {
                this.fullTableCount = fullTableCount;
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
             * <p>Indicates whether the template is a built-in template. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isBuiltin(Integer isBuiltin) {
                this.isBuiltin = isBuiltin;
                return this;
            }

            /**
             * <p>Indicates whether scheduling is enabled. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
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
             * <p>Indicates whether the task is on the whitelist. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isWhiteList(Integer isWhiteList) {
                this.isWhiteList = isWhiteList;
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
             * <p>The ID of the scheduled task (scheduling ID).</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder scheduleId(Long scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            /**
             * <p>The scope filter JSON data.</p>
             */
            public Builder scopeFilter(ScopeFilter scopeFilter) {
                this.scopeFilter = scopeFilter;
                return this;
            }

            /**
             * <p>The source node parameter settings (source execute parameters).</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder sourceGlobalParams(String sourceGlobalParams) {
                this.sourceGlobalParams = sourceGlobalParams;
                return this;
            }

            /**
             * <p>The ID of the source data source.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder srcDsId(String srcDsId) {
                this.srcDsId = srcDsId;
                return this;
            }

            /**
             * <p>The name of the source data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder srcDsName(String srcDsName) {
                this.srcDsName = srcDsName;
                return this;
            }

            /**
             * <p>The type of the source data source.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder srcDsType(String srcDsType) {
                this.srcDsType = srcDsType;
                return this;
            }

            /**
             * <p>The ID of the source verification engine.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder srcEngineId(String srcEngineId) {
                this.srcEngineId = srcEngineId;
                return this;
            }

            /**
             * <p>The name of the source verification engine.</p>
             * 
             * <strong>example:</strong>
             * <p>engine_demo</p>
             */
            public Builder srcEngineName(String srcEngineName) {
                this.srcEngineName = srcEngineName;
                return this;
            }

            /**
             * <p>The type of the source verification engine.</p>
             * 
             * <strong>example:</strong>
             * <p>Tez</p>
             */
            public Builder srcEngineType(String srcEngineType) {
                this.srcEngineType = srcEngineType;
                return this;
            }

            /**
             * <p>Indicates whether to start the task immediately. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startImmediately(Integer startImmediately) {
                this.startImmediately = startImmediately;
                return this;
            }

            /**
             * <p>The destination node parameter settings (destination execute parameters).</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder targetGlobalParams(String targetGlobalParams) {
                this.targetGlobalParams = targetGlobalParams;
                return this;
            }

            /**
             * <p>The regular expression information of the verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>lhm|lhm_dw|*</p>
             */
            public Builder taskConfigInfo(String taskConfigInfo) {
                this.taskConfigInfo = taskConfigInfo;
                return this;
            }

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>Data validation node description</p>
             */
            public Builder taskDescription(String taskDescription) {
                this.taskDescription = taskDescription;
                return this;
            }

            /**
             * <p>The task ID, which uniquely identifies a task.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The parameter creation mode. Valid values:</p>
             * <ul>
             * <li>0: fine-grained creation on a per-table basis</li>
             * <li>1: batch creation with the same pattern</li>
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
             * <p>The task name. When used as a query condition, fuzzy matching with % is supported (SQL syntax).</p>
             * 
             * <strong>example:</strong>
             * <p>data_check_task_demo</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The name of the verification template.</p>
             * 
             * <strong>example:</strong>
             * <p>Data volume verification template</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
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

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
