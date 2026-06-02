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
 * {@link OneMetaDatabase} extends {@link TeaModel}
 *
 * <p>OneMetaDatabase</p>
 */
public class OneMetaDatabase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("CatalogType")
    private String catalogType;

    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("DatabaseBizAttrs")
    private java.util.Map<String, ?> databaseBizAttrs;

    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EngineMeta")
    private OneMetaDatabaseEngineMeta engineMeta;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("SearchName")
    private String searchName;

    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    private OneMetaDatabase(Builder builder) {
        this.catalogName = builder.catalogName;
        this.catalogType = builder.catalogType;
        this.catalogUuid = builder.catalogUuid;
        this.dataSourceType = builder.dataSourceType;
        this.databaseBizAttrs = builder.databaseBizAttrs;
        this.databaseUuid = builder.databaseUuid;
        this.description = builder.description;
        this.engineMeta = builder.engineMeta;
        this.name = builder.name;
        this.properties = builder.properties;
        this.qualifiedName = builder.qualifiedName;
        this.regionId = builder.regionId;
        this.searchName = builder.searchName;
        this.state = builder.state;
        this.storageLocation = builder.storageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OneMetaDatabase create() {
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
     * @return catalogType
     */
    public String getCatalogType() {
        return this.catalogType;
    }

    /**
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return databaseBizAttrs
     */
    public java.util.Map<String, ?> getDatabaseBizAttrs() {
        return this.databaseBizAttrs;
    }

    /**
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return engineMeta
     */
    public OneMetaDatabaseEngineMeta getEngineMeta() {
        return this.engineMeta;
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
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public static final class Builder {
        private String catalogName; 
        private String catalogType; 
        private String catalogUuid; 
        private String dataSourceType; 
        private java.util.Map<String, ?> databaseBizAttrs; 
        private String databaseUuid; 
        private String description; 
        private OneMetaDatabaseEngineMeta engineMeta; 
        private String name; 
        private java.util.Map<String, ?> properties; 
        private String qualifiedName; 
        private String regionId; 
        private String searchName; 
        private Integer state; 
        private String storageLocation; 

        private Builder() {
        } 

        private Builder(OneMetaDatabase model) {
            this.catalogName = model.catalogName;
            this.catalogType = model.catalogType;
            this.catalogUuid = model.catalogUuid;
            this.dataSourceType = model.dataSourceType;
            this.databaseBizAttrs = model.databaseBizAttrs;
            this.databaseUuid = model.databaseUuid;
            this.description = model.description;
            this.engineMeta = model.engineMeta;
            this.name = model.name;
            this.properties = model.properties;
            this.qualifiedName = model.qualifiedName;
            this.regionId = model.regionId;
            this.searchName = model.searchName;
            this.state = model.state;
            this.storageLocation = model.storageLocation;
        } 

        /**
         * CatalogName.
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
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
         * CatalogUuid.
         */
        public Builder catalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DatabaseBizAttrs.
         */
        public Builder databaseBizAttrs(java.util.Map<String, ?> databaseBizAttrs) {
            this.databaseBizAttrs = databaseBizAttrs;
            return this;
        }

        /**
         * DatabaseUuid.
         */
        public Builder databaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
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
         * EngineMeta.
         */
        public Builder engineMeta(OneMetaDatabaseEngineMeta engineMeta) {
            this.engineMeta = engineMeta;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * SearchName.
         */
        public Builder searchName(String searchName) {
            this.searchName = searchName;
            return this;
        }

        /**
         * State.
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        /**
         * StorageLocation.
         */
        public Builder storageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }

        public OneMetaDatabase build() {
            return new OneMetaDatabase(this);
        } 

    } 

}
