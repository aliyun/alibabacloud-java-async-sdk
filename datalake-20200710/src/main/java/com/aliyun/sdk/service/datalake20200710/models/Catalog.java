// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Catalog} extends {@link TeaModel}
 *
 * <p>Catalog</p>
 */
public class Catalog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("CatalogType")
    private String catalogType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CreatedBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("DefaultCatalog")
    private Boolean defaultCatalog;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("JdbcEnabled")
    private Boolean jdbcEnabled;

    @com.aliyun.core.annotation.NameInMap("LocationUri")
    private String locationUri;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StorageAccessConfig")
    private String storageAccessConfig;

    @com.aliyun.core.annotation.NameInMap("ThriftEnabled")
    private Boolean thriftEnabled;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Long updateTime;

    private Catalog(Builder builder) {
        this.catalogId = builder.catalogId;
        this.catalogType = builder.catalogType;
        this.createTime = builder.createTime;
        this.createdBy = builder.createdBy;
        this.defaultCatalog = builder.defaultCatalog;
        this.description = builder.description;
        this.jdbcEnabled = builder.jdbcEnabled;
        this.locationUri = builder.locationUri;
        this.owner = builder.owner;
        this.status = builder.status;
        this.storageAccessConfig = builder.storageAccessConfig;
        this.thriftEnabled = builder.thriftEnabled;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Catalog create() {
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
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return defaultCatalog
     */
    public Boolean getDefaultCatalog() {
        return this.defaultCatalog;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String catalogId; 
        private String catalogType; 
        private Long createTime; 
        private String createdBy; 
        private Boolean defaultCatalog; 
        private String description; 
        private Boolean jdbcEnabled; 
        private String locationUri; 
        private String owner; 
        private String status; 
        private String storageAccessConfig; 
        private Boolean thriftEnabled; 
        private Long updateTime; 

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
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatedBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * DefaultCatalog.
         */
        public Builder defaultCatalog(Boolean defaultCatalog) {
            this.defaultCatalog = defaultCatalog;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
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

        /**
         * UpdateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Catalog build() {
            return new Catalog(this);
        } 

    } 

}
