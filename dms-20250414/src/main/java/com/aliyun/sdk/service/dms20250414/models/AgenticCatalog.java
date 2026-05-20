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
 * {@link AgenticCatalog} extends {@link TeaModel}
 *
 * <p>AgenticCatalog</p>
 */
public class AgenticCatalog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogBizAttrs")
    private java.util.Map<String, ?> catalogBizAttrs;

    @com.aliyun.core.annotation.NameInMap("CatalogType")
    private String catalogType;

    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("DataSourceUuid")
    private String dataSourceUuid;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    private AgenticCatalog(Builder builder) {
        this.catalogBizAttrs = builder.catalogBizAttrs;
        this.catalogType = builder.catalogType;
        this.catalogUuid = builder.catalogUuid;
        this.dataSourceType = builder.dataSourceType;
        this.dataSourceUuid = builder.dataSourceUuid;
        this.description = builder.description;
        this.name = builder.name;
        this.properties = builder.properties;
        this.regionId = builder.regionId;
        this.state = builder.state;
        this.storageLocation = builder.storageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticCatalog create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogBizAttrs
     */
    public java.util.Map<String, ?> getCatalogBizAttrs() {
        return this.catalogBizAttrs;
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
     * @return dataSourceUuid
     */
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private java.util.Map<String, ?> catalogBizAttrs; 
        private String catalogType; 
        private String catalogUuid; 
        private String dataSourceType; 
        private String dataSourceUuid; 
        private String description; 
        private String name; 
        private java.util.Map<String, ?> properties; 
        private String regionId; 
        private Integer state; 
        private String storageLocation; 

        private Builder() {
        } 

        private Builder(AgenticCatalog model) {
            this.catalogBizAttrs = model.catalogBizAttrs;
            this.catalogType = model.catalogType;
            this.catalogUuid = model.catalogUuid;
            this.dataSourceType = model.dataSourceType;
            this.dataSourceUuid = model.dataSourceUuid;
            this.description = model.description;
            this.name = model.name;
            this.properties = model.properties;
            this.regionId = model.regionId;
            this.state = model.state;
            this.storageLocation = model.storageLocation;
        } 

        /**
         * CatalogBizAttrs.
         */
        public Builder catalogBizAttrs(java.util.Map<String, ?> catalogBizAttrs) {
            this.catalogBizAttrs = catalogBizAttrs;
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
         * DataSourceUuid.
         */
        public Builder dataSourceUuid(String dataSourceUuid) {
            this.dataSourceUuid = dataSourceUuid;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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

        public AgenticCatalog build() {
            return new AgenticCatalog(this);
        } 

    } 

}
