// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFunctionRequest} extends {@link RequestModel}
 *
 * <p>DeleteFunctionRequest</p>
 */
public class DeleteFunctionRequest extends Request {
    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("FunctionName")
    private String functionName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteFunctionRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.functionName = builder.functionName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteFunctionRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private String functionName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFunctionRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.functionName = response.functionName;
            this.regionId = response.regionId;
        } 

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * FunctionName
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteFunctionRequest build() {
            return new DeleteFunctionRequest(this);
        } 

    } 

}
