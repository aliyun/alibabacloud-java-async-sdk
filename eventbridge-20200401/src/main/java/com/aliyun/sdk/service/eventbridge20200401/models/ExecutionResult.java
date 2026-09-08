// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ExecutionResult} extends {@link TeaModel}
 *
 * <p>ExecutionResult</p>
 */
public class ExecutionResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("RowCount")
    private Integer rowCount;

    @com.aliyun.core.annotation.NameInMap("Rows")
    private String rows;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private java.util.List<SchemaColumn> schema;

    @com.aliyun.core.annotation.NameInMap("TotalRows")
    private Integer totalRows;

    private ExecutionResult(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.rowCount = builder.rowCount;
        this.rows = builder.rows;
        this.schema = builder.schema;
        this.totalRows = builder.totalRows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecutionResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return rowCount
     */
    public Integer getRowCount() {
        return this.rowCount;
    }

    /**
     * @return rows
     */
    public String getRows() {
        return this.rows;
    }

    /**
     * @return schema
     */
    public java.util.List<SchemaColumn> getSchema() {
        return this.schema;
    }

    /**
     * @return totalRows
     */
    public Integer getTotalRows() {
        return this.totalRows;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private Integer rowCount; 
        private String rows; 
        private java.util.List<SchemaColumn> schema; 
        private Integer totalRows; 

        private Builder() {
        } 

        private Builder(ExecutionResult model) {
            this.isTruncated = model.isTruncated;
            this.rowCount = model.rowCount;
            this.rows = model.rows;
            this.schema = model.schema;
            this.totalRows = model.totalRows;
        } 

        /**
         * <p>Whether truncated due to the maxRows limit</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>Number of rows returned this time</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * <p>Two-dimensional array, one array per row</p>
         * 
         * <strong>example:</strong>
         * <p>[[&quot;北京&quot;,120],[&quot;上海&quot;,98]]</p>
         */
        public Builder rows(String rows) {
            this.rows = rows;
            return this;
        }

        /**
         * <p>Schema information</p>
         */
        public Builder schema(java.util.List<SchemaColumn> schema) {
            this.schema = schema;
            return this;
        }

        /**
         * <p>Total number of rows that meet the criteria. Different from RowCount when IsTruncated=true</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRows(Integer totalRows) {
            this.totalRows = totalRows;
            return this;
        }

        public ExecutionResult build() {
            return new ExecutionResult(this);
        } 

    } 

}
