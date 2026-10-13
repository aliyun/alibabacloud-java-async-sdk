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
         * <p>The list of fields included in the index. Fields with a specified prefix length include a length expression, such as name(10).</p>
         */
        public Builder columnNames(java.util.List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }

        /**
         * <p>The index description.</p>
         * 
         * <strong>example:</strong>
         * <p>Index on user_id</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The index name.</p>
         * 
         * <strong>example:</strong>
         * <p>idx_user_id</p>
         */
        public Builder indexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        /**
         * <p>The index type. Valid values:</p>
         * <ul>
         * <li><strong>Primary</strong>: primary key index</li>
         * <li><strong>Unique</strong>: unique index</li>
         * <li><strong>Normal</strong>: normal index</li>
         * <li><strong>FullText</strong>: full-text index</li>
         * <li><strong>Spatial</strong>: spatial index</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder indexType(String indexType) {
            this.indexType = indexType;
            return this;
        }

        /**
         * <p>Specifies whether the index is a primary key index.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder primary(Boolean primary) {
            this.primary = primary;
            return this;
        }

        /**
         * <p>The list of actual field names referenced by the index, with prefix length expressions removed from ColumnNames.</p>
         */
        public Builder realColumnNames(java.util.List<String> realColumnNames) {
            this.realColumnNames = realColumnNames;
            return this;
        }

        /**
         * <p>Specifies whether the index is a unique index.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
