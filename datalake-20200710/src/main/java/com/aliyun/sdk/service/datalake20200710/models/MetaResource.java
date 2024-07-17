// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MetaResource} extends {@link TeaModel}
 *
 * <p>MetaResource</p>
 */
public class MetaResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogResource")
    private CatalogResource catalogResource;

    @com.aliyun.core.annotation.NameInMap("ColumnResource")
    private ColumnResource columnResource;

    @com.aliyun.core.annotation.NameInMap("DatabaseResource")
    private DatabaseResource databaseResource;

    @com.aliyun.core.annotation.NameInMap("FunctionResource")
    private FunctionResource functionResource;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("TableResource")
    private TableResource tableResource;

    private MetaResource(Builder builder) {
        this.catalogResource = builder.catalogResource;
        this.columnResource = builder.columnResource;
        this.databaseResource = builder.databaseResource;
        this.functionResource = builder.functionResource;
        this.resourceType = builder.resourceType;
        this.tableResource = builder.tableResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaResource create() {
        return builder().build();
    }

    /**
     * @return catalogResource
     */
    public CatalogResource getCatalogResource() {
        return this.catalogResource;
    }

    /**
     * @return columnResource
     */
    public ColumnResource getColumnResource() {
        return this.columnResource;
    }

    /**
     * @return databaseResource
     */
    public DatabaseResource getDatabaseResource() {
        return this.databaseResource;
    }

    /**
     * @return functionResource
     */
    public FunctionResource getFunctionResource() {
        return this.functionResource;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tableResource
     */
    public TableResource getTableResource() {
        return this.tableResource;
    }

    public static final class Builder {
        private CatalogResource catalogResource; 
        private ColumnResource columnResource; 
        private DatabaseResource databaseResource; 
        private FunctionResource functionResource; 
        private String resourceType; 
        private TableResource tableResource; 

        /**
         * CatalogResource.
         */
        public Builder catalogResource(CatalogResource catalogResource) {
            this.catalogResource = catalogResource;
            return this;
        }

        /**
         * ColumnResource.
         */
        public Builder columnResource(ColumnResource columnResource) {
            this.columnResource = columnResource;
            return this;
        }

        /**
         * DatabaseResource.
         */
        public Builder databaseResource(DatabaseResource databaseResource) {
            this.databaseResource = databaseResource;
            return this;
        }

        /**
         * FunctionResource.
         */
        public Builder functionResource(FunctionResource functionResource) {
            this.functionResource = functionResource;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TableResource.
         */
        public Builder tableResource(TableResource tableResource) {
            this.tableResource = tableResource;
            return this;
        }

        public MetaResource build() {
            return new MetaResource(this);
        } 

    } 

}
