// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("partitionKeys")
    private java.util.List < String > partitionKeys;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map < String, ? > properties;

    @com.aliyun.core.annotation.NameInMap("schema")
    private Schema schema;

    private Table(Builder builder) {
        this.comment = builder.comment;
        this.name = builder.name;
        this.partitionKeys = builder.partitionKeys;
        this.properties = builder.properties;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Table create() {
        return builder().build();
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
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
    public java.util.List < String > getPartitionKeys() {
        return this.partitionKeys;
    }

    /**
     * @return properties
     */
    public java.util.Map < String, ? > getProperties() {
        return this.properties;
    }

    /**
     * @return schema
     */
    public Schema getSchema() {
        return this.schema;
    }

    public static final class Builder {
        private String comment; 
        private String name; 
        private java.util.List < String > partitionKeys; 
        private java.util.Map < String, ? > properties; 
        private Schema schema; 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * partitionKeys.
         */
        public Builder partitionKeys(java.util.List < String > partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        /**
         * properties.
         */
        public Builder properties(java.util.Map < String, ? > properties) {
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

        public Table build() {
            return new Table(this);
        } 

    } 

}
