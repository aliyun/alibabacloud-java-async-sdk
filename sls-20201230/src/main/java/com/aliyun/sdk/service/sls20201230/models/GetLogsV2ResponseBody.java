// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetLogsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogsV2ResponseBody</p>
 */
public class GetLogsV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<java.util.Map<String, String>> data;

    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    private GetLogsV2ResponseBody(Builder builder) {
        this.data = builder.data;
        this.meta = builder.meta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogsV2ResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private java.util.List<java.util.Map<String, String>> data; 
        private Meta meta; 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(java.util.List<java.util.Map<String, String>> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The metadata of the returned data.</p>
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public GetLogsV2ResponseBody build() {
            return new GetLogsV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLogsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>GetLogsV2ResponseBody</p>
     */
    public static class PhraseQueryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("beginOffset")
        private Long beginOffset;

        @com.aliyun.core.annotation.NameInMap("endOffset")
        private Long endOffset;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("scanAll")
        private Boolean scanAll;

        private PhraseQueryInfo(Builder builder) {
            this.beginOffset = builder.beginOffset;
            this.endOffset = builder.endOffset;
            this.endTime = builder.endTime;
            this.scanAll = builder.scanAll;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhraseQueryInfo create() {
            return builder().build();
        }

        /**
         * @return beginOffset
         */
        public Long getBeginOffset() {
            return this.beginOffset;
        }

        /**
         * @return endOffset
         */
        public Long getEndOffset() {
            return this.endOffset;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return scanAll
         */
        public Boolean getScanAll() {
            return this.scanAll;
        }

        public static final class Builder {
            private Long beginOffset; 
            private Long endOffset; 
            private Long endTime; 
            private Boolean scanAll; 

            /**
             * beginOffset.
             */
            public Builder beginOffset(Long beginOffset) {
                this.beginOffset = beginOffset;
                return this;
            }

            /**
             * endOffset.
             */
            public Builder endOffset(Long endOffset) {
                this.endOffset = endOffset;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * scanAll.
             */
            public Builder scanAll(Boolean scanAll) {
                this.scanAll = scanAll;
                return this;
            }

            public PhraseQueryInfo build() {
                return new PhraseQueryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLogsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>GetLogsV2ResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("highlights")
        private java.util.List<java.util.List<LogContent>> highlights;

        @com.aliyun.core.annotation.NameInMap("isAccurate")
        private Boolean isAccurate;

        @com.aliyun.core.annotation.NameInMap("keys")
        private java.util.List<String> keys;

        @com.aliyun.core.annotation.NameInMap("limited")
        private Integer limited;

        @com.aliyun.core.annotation.NameInMap("mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("phraseQueryInfo")
        private PhraseQueryInfo phraseQueryInfo;

        @com.aliyun.core.annotation.NameInMap("processedBytes")
        private Long processedBytes;

        @com.aliyun.core.annotation.NameInMap("processedRows")
        private Long processedRows;

        @com.aliyun.core.annotation.NameInMap("progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("scanBytes")
        private Long scanBytes;

        @com.aliyun.core.annotation.NameInMap("telementryType")
        private String telementryType;

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
            this.highlights = builder.highlights;
            this.isAccurate = builder.isAccurate;
            this.keys = builder.keys;
            this.limited = builder.limited;
            this.mode = builder.mode;
            this.phraseQueryInfo = builder.phraseQueryInfo;
            this.processedBytes = builder.processedBytes;
            this.processedRows = builder.processedRows;
            this.progress = builder.progress;
            this.scanBytes = builder.scanBytes;
            this.telementryType = builder.telementryType;
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
         * @return highlights
         */
        public java.util.List<java.util.List<LogContent>> getHighlights() {
            return this.highlights;
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
         * @return phraseQueryInfo
         */
        public PhraseQueryInfo getPhraseQueryInfo() {
            return this.phraseQueryInfo;
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
         * @return telementryType
         */
        public String getTelementryType() {
            return this.telementryType;
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
            private java.util.List<java.util.List<LogContent>> highlights; 
            private Boolean isAccurate; 
            private java.util.List<String> keys; 
            private Integer limited; 
            private Integer mode; 
            private PhraseQueryInfo phraseQueryInfo; 
            private Long processedBytes; 
            private Long processedRows; 
            private String progress; 
            private Long scanBytes; 
            private String telementryType; 
            private java.util.List<java.util.Map<String, ?>> terms; 
            private String whereQuery; 

            /**
             * <p>The SQL statement after | in the query statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select *</p>
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
             * <p>The number of rows that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The amount of time that is consumed by the request. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder elapsedMillisecond(Long elapsedMillisecond) {
                this.elapsedMillisecond = elapsedMillisecond;
                return this;
            }

            /**
             * <p>Indicates whether the query is an SQL query.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasSQL(Boolean hasSQL) {
                this.hasSQL = hasSQL;
                return this;
            }

            /**
             * highlights.
             */
            public Builder highlights(java.util.List<java.util.List<LogContent>> highlights) {
                this.highlights = highlights;
                return this;
            }

            /**
             * <p>Indicates whether the returned result is accurate to seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAccurate(Boolean isAccurate) {
                this.isAccurate = isAccurate;
                return this;
            }

            /**
             * <p>All keys in the query result.</p>
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
             * phraseQueryInfo.
             */
            public Builder phraseQueryInfo(PhraseQueryInfo phraseQueryInfo) {
                this.phraseQueryInfo = phraseQueryInfo;
                return this;
            }

            /**
             * <p>The number of logs that are processed in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder processedBytes(Long processedBytes) {
                this.processedBytes = processedBytes;
                return this;
            }

            /**
             * <p>The number of rows that are processed in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder processedRows(Long processedRows) {
                this.processedRows = processedRows;
                return this;
            }

            /**
             * <p>Indicates whether the query result is complete. Valid values:</p>
             * <ul>
             * <li>Complete: The query was successful, and the complete result is returned.</li>
             * <li>Incomplete: The query was successful, but the query result is incomplete. To obtain the complete result, you must call the operation again.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Complete</p>
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
             * <p>The type of observable data.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder telementryType(String telementryType) {
                this.telementryType = telementryType;
                return this;
            }

            /**
             * <p>All terms in the query statement.</p>
             */
            public Builder terms(java.util.List<java.util.Map<String, ?>> terms) {
                this.terms = terms;
                return this;
            }

            /**
             * <p>The part before | in the query statement.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
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
