// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link Table} extends {@link TeaModel}
 *
 * <p>Table</p>
 */
public class Table extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, String> metadata;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("partitionKeys")
    private java.util.List<String> partitionKeys;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.NameInMap("schema")
    private Schema schema;

    @com.aliyun.core.annotation.NameInMap("tableType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableType;

    private Table(Builder builder) {
        this.comment = builder.comment;
        this.metadata = builder.metadata;
        this.name = builder.name;
        this.partitionKeys = builder.partitionKeys;
        this.properties = builder.properties;
        this.schema = builder.schema;
        this.tableType = builder.tableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Table create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return partitionKeys
     */
    public java.util.List<String> getPartitionKeys() {
        return this.partitionKeys;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    /**
     * @return schema
     */
    public Schema getSchema() {
        return this.schema;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    public static final class Builder {
        private String comment; 
        private java.util.Map<String, String> metadata; 
        private String name; 
        private java.util.List<String> partitionKeys; 
        private java.util.Map<String, ?> properties; 
        private Schema schema; 
        private String tableType; 

        private Builder() {
        } 

        private Builder(Table model) {
            this.comment = model.comment;
            this.metadata = model.metadata;
            this.name = model.name;
            this.partitionKeys = model.partitionKeys;
            this.properties = model.properties;
            this.schema = model.schema;
            this.tableType = model.tableType;
        } 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * partitionKeys.
         */
        public Builder partitionKeys(java.util.List<String> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        /**
         * properties.
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(Schema schema) {
            this.schema = schema;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        public Table build() {
            return new Table(this);
        } 

    } 

}
