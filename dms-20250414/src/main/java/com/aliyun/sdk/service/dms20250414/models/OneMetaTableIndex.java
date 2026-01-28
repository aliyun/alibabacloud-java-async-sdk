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

    private OneMetaTableIndex(Builder builder) {
        this.columnNames = builder.columnNames;
        this.description = builder.description;
        this.indexName = builder.indexName;
        this.indexType = builder.indexType;
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

    public static final class Builder {
        private java.util.List<String> columnNames; 
        private String description; 
        private String indexName; 
        private String indexType; 

        private Builder() {
        } 

        private Builder(OneMetaTableIndex model) {
            this.columnNames = model.columnNames;
            this.description = model.description;
            this.indexName = model.indexName;
            this.indexType = model.indexType;
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

        public OneMetaTableIndex build() {
            return new OneMetaTableIndex(this);
        } 

    } 

}
