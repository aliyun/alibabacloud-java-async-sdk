// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CatalogInput} extends {@link TeaModel}
 *
 * <p>CatalogInput</p>
 */
public class CatalogInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("CatalogType")
    private String catalogType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("JdbcEnabled")
    private Boolean jdbcEnabled;

    @com.aliyun.core.annotation.NameInMap("LocationUri")
    private String locationUri;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("StorageAccessConfig")
    private String storageAccessConfig;

    @com.aliyun.core.annotation.NameInMap("ThriftEnabled")
    private Boolean thriftEnabled;

    private CatalogInput(Builder builder) {
        this.catalogId = builder.catalogId;
        this.catalogType = builder.catalogType;
        this.description = builder.description;
        this.jdbcEnabled = builder.jdbcEnabled;
        this.locationUri = builder.locationUri;
        this.owner = builder.owner;
        this.storageAccessConfig = builder.storageAccessConfig;
        this.thriftEnabled = builder.thriftEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogInput create() {
        return builder().build();
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return catalogType
     */
    public String getCatalogType() {
        return this.catalogType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return jdbcEnabled
     */
    public Boolean getJdbcEnabled() {
        return this.jdbcEnabled;
    }

    /**
     * @return locationUri
     */
    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return storageAccessConfig
     */
    public String getStorageAccessConfig() {
        return this.storageAccessConfig;
    }

    /**
     * @return thriftEnabled
     */
    public Boolean getThriftEnabled() {
        return this.thriftEnabled;
    }

    public static final class Builder {
        private String catalogId; 
        private String catalogType; 
        private String description; 
        private Boolean jdbcEnabled; 
        private String locationUri; 
        private String owner; 
        private String storageAccessConfig; 
        private Boolean thriftEnabled; 

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * CatalogType.
         */
        public Builder catalogType(String catalogType) {
            this.catalogType = catalogType;
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
         * JdbcEnabled.
         */
        public Builder jdbcEnabled(Boolean jdbcEnabled) {
            this.jdbcEnabled = jdbcEnabled;
            return this;
        }

        /**
         * LocationUri.
         */
        public Builder locationUri(String locationUri) {
            this.locationUri = locationUri;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * StorageAccessConfig.
         */
        public Builder storageAccessConfig(String storageAccessConfig) {
            this.storageAccessConfig = storageAccessConfig;
            return this;
        }

        /**
         * ThriftEnabled.
         */
        public Builder thriftEnabled(Boolean thriftEnabled) {
            this.thriftEnabled = thriftEnabled;
            return this;
        }

        public CatalogInput build() {
            return new CatalogInput(this);
        } 

    } 

}
