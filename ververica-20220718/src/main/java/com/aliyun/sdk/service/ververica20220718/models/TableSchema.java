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
 * {@link TableSchema} extends {@link TeaModel}
 *
 * <p>TableSchema</p>
 */
public class TableSchema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("schema")
    private Schema schema;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    private TableSchema(Builder builder) {
        this.schema = builder.schema;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableSchema create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return schema
     */
    public Schema getSchema() {
        return this.schema;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private Schema schema; 
        private String tableName; 

        private Builder() {
        } 

        private Builder(TableSchema model) {
            this.schema = model.schema;
            this.tableName = model.tableName;
        } 

        /**
         * schema.
         */
        public Builder schema(Schema schema) {
            this.schema = schema;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public TableSchema build() {
            return new TableSchema(this);
        } 

    } 

}
