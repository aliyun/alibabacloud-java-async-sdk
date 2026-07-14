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
         * data.
         */
        public Builder data(java.util.List<java.util.Map<String, String>> data) {
            this.data = data;
            return this;
        }

        /**
         * meta.
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * requestId.
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
                this.terms = model.terms;
                this.whereQuery = model.whereQuery;
            } 

            /**
             * aggQuery.
             */
            public Builder aggQuery(String aggQuery) {
                this.aggQuery = aggQuery;
                return this;
            }

            /**
             * columnTypes.
             */
            public Builder columnTypes(java.util.List<String> columnTypes) {
                this.columnTypes = columnTypes;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * cpuCores.
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * cpuSec.
             */
            public Builder cpuSec(Double cpuSec) {
                this.cpuSec = cpuSec;
                return this;
            }

            /**
             * elapsedMillisecond.
             */
            public Builder elapsedMillisecond(Long elapsedMillisecond) {
                this.elapsedMillisecond = elapsedMillisecond;
                return this;
            }

            /**
             * hasSQL.
             */
            public Builder hasSQL(Boolean hasSQL) {
                this.hasSQL = hasSQL;
                return this;
            }

            /**
             * isAccurate.
             */
            public Builder isAccurate(Boolean isAccurate) {
                this.isAccurate = isAccurate;
                return this;
            }

            /**
             * keys.
             */
            public Builder keys(java.util.List<String> keys) {
                this.keys = keys;
                return this;
            }

            /**
             * limited.
             */
            public Builder limited(Integer limited) {
                this.limited = limited;
                return this;
            }

            /**
             * mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * processedBytes.
             */
            public Builder processedBytes(Long processedBytes) {
                this.processedBytes = processedBytes;
                return this;
            }

            /**
             * processedRows.
             */
            public Builder processedRows(Long processedRows) {
                this.processedRows = processedRows;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * scanBytes.
             */
            public Builder scanBytes(Long scanBytes) {
                this.scanBytes = scanBytes;
                return this;
            }

            /**
             * terms.
             */
            public Builder terms(java.util.List<java.util.Map<String, ?>> terms) {
                this.terms = terms;
                return this;
            }

            /**
             * whereQuery.
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
