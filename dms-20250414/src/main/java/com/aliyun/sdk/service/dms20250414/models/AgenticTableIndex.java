// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link AgenticTableIndex} extends {@link TeaModel}
 *
 * <p>AgenticTableIndex</p>
 */
public class AgenticTableIndex extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnNames")
    private java.util.List<String> columnNames;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("IndexName")
    private String indexName;

    @com.aliyun.core.annotation.NameInMap("IndexType")
    private String indexType;

    @com.aliyun.core.annotation.NameInMap("Primary")
    private Boolean primary;

    @com.aliyun.core.annotation.NameInMap("RealColumnNames")
    private java.util.List<String> realColumnNames;

    @com.aliyun.core.annotation.NameInMap("Unique")
    private Boolean unique;

    private AgenticTableIndex(Builder builder) {
        this.columnNames = builder.columnNames;
        this.description = builder.description;
        this.indexName = builder.indexName;
        this.indexType = builder.indexType;
        this.primary = builder.primary;
        this.realColumnNames = builder.realColumnNames;
        this.unique = builder.unique;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticTableIndex create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnNames
     */
    public java.util.List<String> getColumnNames() {
        return this.columnNames;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return indexType
     */
    public String getIndexType() {
        return this.indexType;
    }

    /**
     * @return primary
     */
    public Boolean getPrimary() {
        return this.primary;
    }

    /**
     * @return realColumnNames
     */
    public java.util.List<String> getRealColumnNames() {
        return this.realColumnNames;
    }

    /**
     * @return unique
     */
    public Boolean getUnique() {
        return this.unique;
    }

    public static final class Builder {
        private java.util.List<String> columnNames; 
        private String description; 
        private String indexName; 
        private String indexType; 
        private Boolean primary; 
        private java.util.List<String> realColumnNames; 
        private Boolean unique; 

        private Builder() {
        } 

        private Builder(AgenticTableIndex model) {
            this.columnNames = model.columnNames;
            this.description = model.description;
            this.indexName = model.indexName;
            this.indexType = model.indexType;
            this.primary = model.primary;
            this.realColumnNames = model.realColumnNames;
            this.unique = model.unique;
        } 

        /**
         * <p>An array of column names included in the index.</p>
         */
        public Builder columnNames(java.util.List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }

        /**
         * <p>An optional, user-defined description for the index.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The unique name of the index within the table.</p>
         */
        public Builder indexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        /**
         * <p>The type of the index, such as PRIMARY, UNIQUE, or NORMAL.</p>
         */
        public Builder indexType(String indexType) {
            this.indexType = indexType;
            return this;
        }

        /**
         * <p>Specifies if the index is the primary key. A table can have only one primary key.</p>
         */
        public Builder primary(Boolean primary) {
            this.primary = primary;
            return this;
        }

        /**
         * <p>An array of physical column names from the database. Use this parameter when the names in ColumnNames are aliases or logical names.</p>
         */
        public Builder realColumnNames(java.util.List<String> realColumnNames) {
            this.realColumnNames = realColumnNames;
            return this;
        }

        /**
         * <p>Specifies if the index enforces a unique constraint, requiring all its values to be unique across rows.</p>
         */
        public Builder unique(Boolean unique) {
            this.unique = unique;
            return this;
        }

        public AgenticTableIndex build() {
            return new AgenticTableIndex(this);
        } 

    } 

}
