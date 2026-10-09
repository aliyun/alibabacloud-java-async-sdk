// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link PreviewPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewPipelineResponseBody</p>
 */
public class PreviewPipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<java.util.Map<String, String>> data;

    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PreviewPipelineResponseBody(Builder builder) {
        this.data = builder.data;
        this.meta = builder.meta;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewPipelineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<java.util.Map<String, String>> data; 
        private Meta meta; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PreviewPipelineResponseBody model) {
            this.data = model.data;
            this.meta = model.meta;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The collection of sample rows for the preview result. Each row is a key-value structure. The array contains only the first N rows, up to 5 rows by default, and does not reflect the complete write plan.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;status&quot;:&quot;200&quot;,&quot;method&quot;:&quot;POST&quot;}]</p>
         */
        public Builder data(java.util.List<java.util.Map<String, String>> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The query metadata.</p>
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate the request when you troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreviewPipelineResponseBody build() {
            return new PreviewPipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreviewPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewPipelineResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aggQuery")
        private String aggQuery;

        @com.aliyun.core.annotation.NameInMap("columnTypes")
        private java.util.List<String> columnTypes;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("cpuCores")
        private Integer cpuCores;

        @com.aliyun.core.annotation.NameInMap("cpuSec")
        private Double cpuSec;

        @com.aliyun.core.annotation.NameInMap("elapsedMillisecond")
        private Long elapsedMillisecond;

        @com.aliyun.core.annotation.NameInMap("hasSQL")
        private Boolean hasSQL;

        @com.aliyun.core.annotation.NameInMap("isAccurate")
        private Boolean isAccurate;

        @com.aliyun.core.annotation.NameInMap("keys")
        private java.util.List<String> keys;

        @com.aliyun.core.annotation.NameInMap("limited")
        private Integer limited;

        @com.aliyun.core.annotation.NameInMap("mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("processedBytes")
        private Long processedBytes;

        @com.aliyun.core.annotation.NameInMap("processedRows")
        private Long processedRows;

        @com.aliyun.core.annotation.NameInMap("progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("scanBytes")
        private Long scanBytes;

        @com.aliyun.core.annotation.NameInMap("schema")
        private java.util.Map<String, MetaSchemaValue> schema;

        @com.aliyun.core.annotation.NameInMap("terms")
        private java.util.List<java.util.Map<String, ?>> terms;

        @com.aliyun.core.annotation.NameInMap("whereQuery")
        private String whereQuery;

        private Meta(Builder builder) {
            this.aggQuery = builder.aggQuery;
            this.columnTypes = builder.columnTypes;
            this.count = builder.count;
            this.cpuCores = builder.cpuCores;
            this.cpuSec = builder.cpuSec;
            this.elapsedMillisecond = builder.elapsedMillisecond;
            this.hasSQL = builder.hasSQL;
            this.isAccurate = builder.isAccurate;
            this.keys = builder.keys;
            this.limited = builder.limited;
            this.mode = builder.mode;
            this.processedBytes = builder.processedBytes;
            this.processedRows = builder.processedRows;
            this.progress = builder.progress;
            this.scanBytes = builder.scanBytes;
            this.schema = builder.schema;
            this.terms = builder.terms;
            this.whereQuery = builder.whereQuery;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return aggQuery
         */
        public String getAggQuery() {
            return this.aggQuery;
        }

        /**
         * @return columnTypes
         */
        public java.util.List<String> getColumnTypes() {
            return this.columnTypes;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return cpuCores
         */
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return cpuSec
         */
        public Double getCpuSec() {
            return this.cpuSec;
        }

        /**
         * @return elapsedMillisecond
         */
        public Long getElapsedMillisecond() {
            return this.elapsedMillisecond;
        }

        /**
         * @return hasSQL
         */
        public Boolean getHasSQL() {
            return this.hasSQL;
        }

        /**
         * @return isAccurate
         */
        public Boolean getIsAccurate() {
            return this.isAccurate;
        }

        /**
         * @return keys
         */
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        /**
         * @return limited
         */
        public Integer getLimited() {
            return this.limited;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return processedBytes
         */
        public Long getProcessedBytes() {
            return this.processedBytes;
        }

        /**
         * @return processedRows
         */
        public Long getProcessedRows() {
            return this.processedRows;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return scanBytes
         */
        public Long getScanBytes() {
            return this.scanBytes;
        }

        /**
         * @return schema
         */
        public java.util.Map<String, MetaSchemaValue> getSchema() {
            return this.schema;
        }

        /**
         * @return terms
         */
        public java.util.List<java.util.Map<String, ?>> getTerms() {
            return this.terms;
        }

        /**
         * @return whereQuery
         */
        public String getWhereQuery() {
            return this.whereQuery;
        }

        public static final class Builder {
            private String aggQuery; 
            private java.util.List<String> columnTypes; 
            private Integer count; 
            private Integer cpuCores; 
            private Double cpuSec; 
            private Long elapsedMillisecond; 
            private Boolean hasSQL; 
            private Boolean isAccurate; 
            private java.util.List<String> keys; 
            private Integer limited; 
            private Integer mode; 
            private Long processedBytes; 
            private Long processedRows; 
            private String progress; 
            private Long scanBytes; 
            private java.util.Map<String, MetaSchemaValue> schema; 
            private java.util.List<java.util.Map<String, ?>> terms; 
            private String whereQuery; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.aggQuery = model.aggQuery;
                this.columnTypes = model.columnTypes;
                this.count = model.count;
                this.cpuCores = model.cpuCores;
                this.cpuSec = model.cpuSec;
                this.elapsedMillisecond = model.elapsedMillisecond;
                this.hasSQL = model.hasSQL;
                this.isAccurate = model.isAccurate;
                this.keys = model.keys;
                this.limited = model.limited;
                this.mode = model.mode;
                this.processedBytes = model.processedBytes;
                this.processedRows = model.processedRows;
                this.progress = model.progress;
                this.scanBytes = model.scanBytes;
                this.schema = model.schema;
                this.terms = model.terms;
                this.whereQuery = model.whereQuery;
            } 

            /**
             * <p>The SPL statement for aggregation analysis.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>| SELECT status, count(*) AS cnt GROUP BY status</li>
             * </ul>
             */
            public Builder aggQuery(String aggQuery) {
                this.aggQuery = aggQuery;
                return this;
            }

            /**
             * <p>The list of data types for each column. This field provides a mapping from column names to data types, such as string, long, double, and json.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;long&quot;,&quot;string&quot;]</p>
             */
            public Builder columnTypes(java.util.List<String> columnTypes) {
                this.columnTypes = columnTypes;
                return this;
            }

            /**
             * <p>The number of matched log entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The number of consumed CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The consumed CPU time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder cpuSec(Double cpuSec) {
                this.cpuSec = cpuSec;
                return this;
            }

            /**
             * <p>The query duration in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder elapsedMillisecond(Long elapsedMillisecond) {
                this.elapsedMillisecond = elapsedMillisecond;
                return this;
            }

            /**
             * <p>Specifies whether an SQL query is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasSQL(Boolean hasSQL) {
                this.hasSQL = hasSQL;
                return this;
            }

            /**
             * <p>Specifies whether nanosecond-level ordering is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAccurate(Boolean isAccurate) {
                this.isAccurate = isAccurate;
                return this;
            }

            /**
             * <p>The list of result column names.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;status&quot;,&quot;method&quot;,&quot;path&quot;]</p>
             */
            public Builder keys(java.util.List<String> keys) {
                this.keys = keys;
                return this;
            }

            /**
             * <p>The maximum number of rows returned in the result.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder limited(Integer limited) {
                this.limited = limited;
                return this;
            }

            /**
             * <p>The identifier of the query mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The number of bytes of processed data.</p>
             * 
             * <strong>example:</strong>
             * <p>524288</p>
             */
            public Builder processedBytes(Long processedBytes) {
                this.processedBytes = processedBytes;
                return this;
            }

            /**
             * <p>The number of processed log rows.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder processedRows(Long processedRows) {
                this.processedRows = processedRows;
                return this;
            }

            /**
             * <p>The Simple Log Service (SLS) query progress. A value of Complete indicates that the query is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>Complete</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The number of bytes of scanned raw data.</p>
             * 
             * <strong>example:</strong>
             * <p>1048576</p>
             */
            public Builder scanBytes(Long scanBytes) {
                this.scanBytes = scanBytes;
                return this;
            }

            /**
             * <p>The dataset schema of the final pipeline output. The keys are field names, and the type in the values supports text, long, double, and json. The field order is determined by the keys.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;status&quot;:{&quot;type&quot;:&quot;long&quot;}}</p>
             */
            public Builder schema(java.util.Map<String, MetaSchemaValue> schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The column types and aggregation information.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;column&quot;:&quot;status&quot;,&quot;type&quot;:&quot;long&quot;}]</p>
             */
            public Builder terms(java.util.List<java.util.Map<String, ?>> terms) {
                this.terms = terms;
                return this;
            }

            /**
             * <p>The SPL statement for the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>status: 200</p>
             */
            public Builder whereQuery(String whereQuery) {
                this.whereQuery = whereQuery;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
