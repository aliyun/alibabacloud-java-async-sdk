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
 * {@link Catalog} extends {@link TeaModel}
 *
 * <p>Catalog</p>
 */
public class Catalog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    private String connectionName;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private Catalog(Builder builder) {
        this.comment = builder.comment;
        this.connectionName = builder.connectionName;
        this.name = builder.name;
        this.properties = builder.properties;
        this.provider = builder.provider;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Catalog create() {
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
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String comment; 
        private String connectionName; 
        private String name; 
        private java.util.Map<String, ?> properties; 
        private String provider; 
        private String type; 

        private Builder() {
        } 

        private Builder(Catalog model) {
            this.comment = model.comment;
            this.connectionName = model.connectionName;
            this.name = model.name;
            this.properties = model.properties;
            this.provider = model.provider;
            this.type = model.type;
        } 

        /**
         * <p>The comment or description of the data catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>Test data catalog</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The connection name associated with a mounted catalog. This parameter has a value only when Provider is set to MySQL, PostgreSQL, Elasticsearch, OSS_TABLES, SLS, OTS, MaxCompute, MongoDB, Redis, SQLServer, ClickHouse, Oracle, Hive, or Iceberg.</p>
         * 
         * <strong>example:</strong>
         * <p>my_connection</p>
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>The unique identifier name of the data catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The extended properties (JSON object). For the Elasticsearch type, this includes information such as IndexPattern.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;IndexPattern&quot;:&quot;my-index-*&quot;}</p>
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>The data source provider. EventHouse indicates built-in storage. MySQL, PostgreSQL, Elasticsearch, OSS_TABLES, SLS, OTS, MaxCompute, MongoDB, Redis, SQLServer, ClickHouse, Oracle, Hive, and Iceberg indicate externally mounted sources.</p>
         * 
         * <strong>example:</strong>
         * <p>EventHouse</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>The type of the data catalog, such as RELATIONAL.</p>
         * 
         * <strong>example:</strong>
         * <p>RELATIONAL</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Catalog build() {
            return new Catalog(this);
        } 

    } 

}
