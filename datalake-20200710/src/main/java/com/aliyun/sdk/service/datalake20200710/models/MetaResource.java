// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MetaResource} extends {@link TeaModel}
 *
 * <p>MetaResource</p>
 */
public class MetaResource extends TeaModel {
    @NameInMap("ColumnResource")
    private ColumnResource columnResource;

    @NameInMap("DatabaseResource")
    private DatabaseResource databaseResource;

    @NameInMap("FunctionResource")
    private FunctionResource functionResource;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("TableResource")
    private TableResource tableResource;

    private MetaResource(Builder builder) {
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
        private ColumnResource columnResource; 
        private DatabaseResource databaseResource; 
        private FunctionResource functionResource; 
        private String resourceType; 
        private TableResource tableResource; 

        /**
         * column resource
         */
        public Builder columnResource(ColumnResource columnResource) {
            this.columnResource = columnResource;
            return this;
        }

        /**
         * database resource
         */
        public Builder databaseResource(DatabaseResource databaseResource) {
            this.databaseResource = databaseResource;
            return this;
        }

        /**
         * function resource
         */
        public Builder functionResource(FunctionResource functionResource) {
            this.functionResource = functionResource;
            return this;
        }

        /**
         * DATABASE, TABLE, FUNCTION, COLUMN任选其一
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * table resource
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
