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
         * columnTypes.
         */
        public Builder columnTypes(java.util.List<String> columnTypes) {
            this.columnTypes = columnTypes;
            return this;
        }

        /**
         * columns.
         */
        public Builder columns(java.util.List<String> columns) {
            this.columns = columns;
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

        /**
         * rows.
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
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("affectedRows")
        private Integer affectedRows;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("elapsedMillisecond")
        private Long elapsedMillisecond;

        @com.aliyun.core.annotation.NameInMap("progress")
        private String progress;

        private Meta(Builder builder) {
            this.affectedRows = builder.affectedRows;
            this.count = builder.count;
            this.elapsedMillisecond = builder.elapsedMillisecond;
            this.progress = builder.progress;
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

        public static final class Builder {
            private Integer affectedRows; 
            private Integer count; 
            private Long elapsedMillisecond; 
            private String progress; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.affectedRows = model.affectedRows;
                this.count = model.count;
                this.elapsedMillisecond = model.elapsedMillisecond;
                this.progress = model.progress;
            } 

            /**
             * affectedRows.
             */
            public Builder affectedRows(Integer affectedRows) {
                this.affectedRows = affectedRows;
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
             * elapsedMillisecond.
             */
            public Builder elapsedMillisecond(Long elapsedMillisecond) {
                this.elapsedMillisecond = elapsedMillisecond;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
