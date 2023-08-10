// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SchemaTablesValue} extends {@link TeaModel}
 *
 * <p>SchemaTablesValue</p>
 */
public class SchemaTablesValue extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("primaryTable")
    private Boolean primaryTable;

    @NameInMap("fields")
    private java.util.Map < String, SchemaTablesValueFieldsValue > fields;

    private SchemaTablesValue(Builder builder) {
        this.name = builder.name;
        this.primaryTable = builder.primaryTable;
        this.fields = builder.fields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchemaTablesValue create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return primaryTable
     */
    public Boolean getPrimaryTable() {
        return this.primaryTable;
    }

    /**
     * @return fields
     */
    public java.util.Map < String, SchemaTablesValueFieldsValue > getFields() {
        return this.fields;
    }

    public static final class Builder {
        private String name; 
        private Boolean primaryTable; 
        private java.util.Map < String, SchemaTablesValueFieldsValue > fields; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * primaryTable.
         */
        public Builder primaryTable(Boolean primaryTable) {
            this.primaryTable = primaryTable;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(java.util.Map < String, SchemaTablesValueFieldsValue > fields) {
            this.fields = fields;
            return this;
        }

        public SchemaTablesValue build() {
            return new SchemaTablesValue(this);
        } 

    } 

}
