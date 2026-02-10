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
 * {@link OneMetaTableIndex} extends {@link TeaModel}
 *
 * <p>OneMetaTableIndex</p>
 */
public class OneMetaTableIndex extends TeaModel {
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

    private OneMetaTableIndex(Builder builder) {
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

    public static OneMetaTableIndex create() {
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

        private Builder(OneMetaTableIndex model) {
            this.columnNames = model.columnNames;
            this.description = model.description;
            this.indexName = model.indexName;
            this.indexType = model.indexType;
            this.primary = model.primary;
            this.realColumnNames = model.realColumnNames;
            this.unique = model.unique;
        } 

        /**
         * ColumnNames.
         */
        public Builder columnNames(java.util.List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * IndexName.
         */
        public Builder indexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        /**
         * IndexType.
         */
        public Builder indexType(String indexType) {
            this.indexType = indexType;
            return this;
        }

        /**
         * Primary.
         */
        public Builder primary(Boolean primary) {
            this.primary = primary;
            return this;
        }

        /**
         * RealColumnNames.
         */
        public Builder realColumnNames(java.util.List<String> realColumnNames) {
            this.realColumnNames = realColumnNames;
            return this;
        }

        /**
         * Unique.
         */
        public Builder unique(Boolean unique) {
            this.unique = unique;
            return this;
        }

        public OneMetaTableIndex build() {
            return new OneMetaTableIndex(this);
        } 

    } 

}
