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
 * {@link AgenticDatabaseEngineMeta} extends {@link TeaModel}
 *
 * <p>AgenticDatabaseEngineMeta</p>
 */
public class AgenticDatabaseEngineMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("Encoding")
    private String encoding;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("StorageCapacity")
    private Long storageCapacity;

    private AgenticDatabaseEngineMeta(Builder builder) {
        this.catalogName = builder.catalogName;
        this.encoding = builder.encoding;
        this.schemaName = builder.schemaName;
        this.storageCapacity = builder.storageCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticDatabaseEngineMeta create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return storageCapacity
     */
    public Long getStorageCapacity() {
        return this.storageCapacity;
    }

    public static final class Builder {
        private String catalogName; 
        private String encoding; 
        private String schemaName; 
        private Long storageCapacity; 

        private Builder() {
        } 

        private Builder(AgenticDatabaseEngineMeta model) {
            this.catalogName = model.catalogName;
            this.encoding = model.encoding;
            this.schemaName = model.schemaName;
            this.storageCapacity = model.storageCapacity;
        } 

        /**
         * <p>The catalog name in the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The character set encoding of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * <p>The schema name.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The storage capacity of the database, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder storageCapacity(Long storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public AgenticDatabaseEngineMeta build() {
            return new AgenticDatabaseEngineMeta(this);
        } 

    } 

}
