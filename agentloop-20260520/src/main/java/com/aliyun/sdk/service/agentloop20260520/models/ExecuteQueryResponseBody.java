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
 * {@link ExecuteQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteQueryResponseBody</p>
 */
public class ExecuteQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columnTypes")
    private java.util.List<String> columnTypes;

    @com.aliyun.core.annotation.NameInMap("columns")
    private java.util.List<String> columns;

    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("rows")
    private java.util.List<java.util.List<?>> rows;

    private ExecuteQueryResponseBody(Builder builder) {
        this.columnTypes = builder.columnTypes;
        this.columns = builder.columns;
        this.meta = builder.meta;
        this.requestId = builder.requestId;
        this.rows = builder.rows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnTypes
     */
    public java.util.List<String> getColumnTypes() {
        return this.columnTypes;
    }

    /**
     * @return columns
     */
    public java.util.List<String> getColumns() {
        return this.columns;
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

    /**
     * @return rows
     */
    public java.util.List<java.util.List<?>> getRows() {
        return this.rows;
    }

    public static final class Builder {
        private java.util.List<String> columnTypes; 
        private java.util.List<String> columns; 
        private Meta meta; 
        private String requestId; 
        private java.util.List<java.util.List<?>> rows; 

        private Builder() {
        } 

        private Builder(ExecuteQueryResponseBody model) {
            this.columnTypes = model.columnTypes;
            this.columns = model.columns;
            this.meta = model.meta;
            this.requestId = model.requestId;
            this.rows = model.rows;
        } 

        /**
         * <p>The result column types.</p>
         */
        public Builder columnTypes(java.util.List<String> columnTypes) {
            this.columnTypes = columnTypes;
            return this;
        }

        /**
         * <p>The result column information.</p>
         */
        public Builder columns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>The metadata of the response.</p>
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EB27D183-8F6C-5C5A-A6A3-E0508AF54F78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result rows.</p>
         */
        public Builder rows(java.util.List<java.util.List<?>> rows) {
            this.rows = rows;
            return this;
        }

        public ExecuteQueryResponseBody build() {
            return new ExecuteQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteQueryResponseBody</p>
     */
    public static class Truncation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("truncated")
        private Boolean truncated;

        @com.aliyun.core.annotation.NameInMap("truncatedColumnIndexes")
        private java.util.List<java.util.List<Integer>> truncatedColumnIndexes;

        private Truncation(Builder builder) {
            this.truncated = builder.truncated;
            this.truncatedColumnIndexes = builder.truncatedColumnIndexes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Truncation create() {
            return builder().build();
        }

        /**
         * @return truncated
         */
        public Boolean getTruncated() {
            return this.truncated;
        }

        /**
         * @return truncatedColumnIndexes
         */
        public java.util.List<java.util.List<Integer>> getTruncatedColumnIndexes() {
            return this.truncatedColumnIndexes;
        }

        public static final class Builder {
            private Boolean truncated; 
            private java.util.List<java.util.List<Integer>> truncatedColumnIndexes; 

            private Builder() {
            } 

            private Builder(Truncation model) {
                this.truncated = model.truncated;
                this.truncatedColumnIndexes = model.truncatedColumnIndexes;
            } 

            /**
             * <p>Indicates whether the result is truncated.</p>
             */
            public Builder truncated(Boolean truncated) {
                this.truncated = truncated;
                return this;
            }

            /**
             * <p>The truncation details of result rows.</p>
             */
            public Builder truncatedColumnIndexes(java.util.List<java.util.List<Integer>> truncatedColumnIndexes) {
                this.truncatedColumnIndexes = truncatedColumnIndexes;
                return this;
            }

            public Truncation build() {
                return new Truncation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteQueryResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("affectedRows")
        private Integer affectedRows;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("elapsedMillisecond")
        private Long elapsedMillisecond;

        @com.aliyun.core.annotation.NameInMap("progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("truncation")
        private Truncation truncation;

        private Meta(Builder builder) {
            this.affectedRows = builder.affectedRows;
            this.count = builder.count;
            this.elapsedMillisecond = builder.elapsedMillisecond;
            this.progress = builder.progress;
            this.truncation = builder.truncation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return affectedRows
         */
        public Integer getAffectedRows() {
            return this.affectedRows;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return elapsedMillisecond
         */
        public Long getElapsedMillisecond() {
            return this.elapsedMillisecond;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return truncation
         */
        public Truncation getTruncation() {
            return this.truncation;
        }

        public static final class Builder {
            private Integer affectedRows; 
            private Integer count; 
            private Long elapsedMillisecond; 
            private String progress; 
            private Truncation truncation; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.affectedRows = model.affectedRows;
                this.count = model.count;
                this.elapsedMillisecond = model.elapsedMillisecond;
                this.progress = model.progress;
                this.truncation = model.truncation;
            } 

            /**
             * <p>The number of log rows scanned or processed.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder affectedRows(Integer affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * <p>The number of log rows returned by this query request.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The time consumed by this execution, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder elapsedMillisecond(Long elapsedMillisecond) {
                this.elapsedMillisecond = elapsedMillisecond;
                return this;
            }

            /**
             * <p>Indicates whether the query result is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>Complete</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The result truncation details.</p>
             */
            public Builder truncation(Truncation truncation) {
                this.truncation = truncation;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
