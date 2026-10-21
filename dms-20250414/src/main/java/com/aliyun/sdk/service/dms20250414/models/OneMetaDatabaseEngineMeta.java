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
 * {@link OneMetaDatabaseEngineMeta} extends {@link TeaModel}
 *
 * <p>OneMetaDatabaseEngineMeta</p>
 */
public class OneMetaDatabaseEngineMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("Encoding")
    private String encoding;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("StorageCapacity")
    private Long storageCapacity;

    private OneMetaDatabaseEngineMeta(Builder builder) {
        this.catalogName = builder.catalogName;
        this.encoding = builder.encoding;
        this.schemaName = builder.schemaName;
        this.storageCapacity = builder.storageCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OneMetaDatabaseEngineMeta create() {
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

        private Builder(OneMetaDatabaseEngineMeta model) {
            this.catalogName = model.catalogName;
            this.encoding = model.encoding;
            this.schemaName = model.schemaName;
            this.storageCapacity = model.storageCapacity;
        } 

        /**
         * CatalogName.
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * Encoding.
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * StorageCapacity.
         */
        public Builder storageCapacity(Long storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public OneMetaDatabaseEngineMeta build() {
            return new OneMetaDatabaseEngineMeta(this);
        } 

    } 

}
