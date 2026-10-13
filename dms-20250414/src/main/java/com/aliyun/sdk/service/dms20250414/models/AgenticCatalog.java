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

    @com.aliyun.core.annotation.NameInMap("DataSourceUuid")
    private String dataSourceUuid;

    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

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
        this.dataSourceUuid = builder.dataSourceUuid;
        this.dbType = builder.dbType;
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
     * @return dataSourceUuid
     */
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
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
        private String dataSourceUuid; 
        private String dbType; 
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
            this.dataSourceUuid = model.dataSourceUuid;
            this.dbType = model.dbType;
            this.description = model.description;
            this.name = model.name;
            this.properties = model.properties;
            this.regionId = model.regionId;
            this.state = model.state;
            this.storageLocation = model.storageLocation;
        } 

        /**
         * <p>The business attributes of the catalog, returned as key-value pairs. The following keys may be included:</p>
         * <ul>
         * <li><strong>ALIAS</strong>: the alias of the data source</li>
         * <li><strong>HOST</strong>: the endpoint of the data source</li>
         * <li><strong>PORT</strong>: the connection port of the data source</li>
         * <li><strong>ENV_TYPE</strong>: the environment type of the data source</li>
         * <li><strong>VERSION</strong>: the database version of the data source</li>
         * <li><strong>SYNC_ALIAS</strong>: whether automatic synchronization of instance aliases is enabled</li>
         * </ul>
         */
        public Builder catalogBizAttrs(java.util.Map<String, ?> catalogBizAttrs) {
            this.catalogBizAttrs = catalogBizAttrs;
            return this;
        }

        /**
         * <p>The type of the catalog. Valid values:</p>
         * <ul>
         * <li><strong>JDBC</strong>: relational database catalog</li>
         * <li><strong>DataLake</strong>: data lake catalog</li>
         * <li><strong>Dataset</strong>: knowledge base catalog</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JDBC</p>
         */
        public Builder catalogType(String catalogType) {
            this.catalogType = catalogType;
            return this;
        }

        /**
         * <p>The unique identifier of the catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-OfjcNc2z***</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * <p>The unique identifier of the data source associated with the catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-HZ-Xk2Pq9Lm***</p>
         */
        public Builder dataSourceUuid(String dataSourceUuid) {
            this.dataSourceUuid = dataSourceUuid;
            return this;
        }

        /**
         * <p>The database type of the data source associated with the catalog. The value is the uppercase name of the database type, such as MYSQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The description of the catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>Order production database</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_mysql_order</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The extended properties of the catalog, returned as key-value pairs.</p>
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>The region ID of the data source associated with the catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The status of the catalog. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Normal. This value is set when the data source is created.</li>
         * <li><strong>-1</strong>: Deleted. This value is set when the data source is deleted.</li>
         * </ul>
         * <p>Disabling a data source does not change the status of the catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The storage location. This property is returned only for catalogs of the DataLake type.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/datalake/</p>
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
