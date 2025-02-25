// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSource} extends {@link TeaModel}
 *
 * <p>DataSource</p>
 */
public class DataSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List < java.util.Map<String, String>> fields;

    @com.aliyun.core.annotation.NameInMap("keyField")
    private String keyField;

    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.NameInMap("plugins")
    private java.util.Map < String, DataSourcePluginsValue > plugins;

    @com.aliyun.core.annotation.NameInMap("schemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DataSource(Builder builder) {
        this.fields = builder.fields;
        this.keyField = builder.keyField;
        this.parameters = builder.parameters;
        this.plugins = builder.plugins;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSource create() {
        return builder().build();
    }

    /**
     * @return fields
     */
    public java.util.List < java.util.Map<String, String>> getFields() {
        return this.fields;
    }

    /**
     * @return keyField
     */
    public String getKeyField() {
        return this.keyField;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return plugins
     */
    public java.util.Map < String, DataSourcePluginsValue > getPlugins() {
        return this.plugins;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < java.util.Map<String, String>> fields; 
        private String keyField; 
        private java.util.Map < String, ? > parameters; 
        private java.util.Map < String, DataSourcePluginsValue > plugins; 
        private String schemaName; 
        private String tableName; 
        private String type; 

        /**
         * fields.
         */
        public Builder fields(java.util.List < java.util.Map<String, String>> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * keyField.
         */
        public Builder keyField(String keyField) {
            this.keyField = keyField;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * plugins.
         */
        public Builder plugins(java.util.Map < String, DataSourcePluginsValue > plugins) {
            this.plugins = plugins;
            return this;
        }

        /**
         * schemaName.
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DataSource build() {
            return new DataSource(this);
        } 

    } 

}
