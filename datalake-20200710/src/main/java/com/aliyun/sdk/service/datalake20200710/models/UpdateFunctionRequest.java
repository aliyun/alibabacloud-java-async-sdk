// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionRequest} extends {@link RequestModel}
 *
 * <p>UpdateFunctionRequest</p>
 */
public class UpdateFunctionRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("FunctionInput")
    private FunctionInput functionInput;

    @Body
    @NameInMap("FunctionName")
    private String functionName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateFunctionRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.functionInput = builder.functionInput;
        this.functionName = builder.functionName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionRequest create() {
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
     * @return functionInput
     */
    public FunctionInput getFunctionInput() {
        return this.functionInput;
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

    public static final class Builder extends Request.Builder<UpdateFunctionRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private FunctionInput functionInput; 
        private String functionName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFunctionRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.functionInput = response.functionInput;
            this.functionName = response.functionName;
            this.regionId = response.regionId;
        } 

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * FunctionInput.
         */
        public Builder functionInput(FunctionInput functionInput) {
            this.putBodyParameter("FunctionInput", functionInput);
            this.functionInput = functionInput;
            return this;
        }

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putBodyParameter("FunctionName", functionName);
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
        public UpdateFunctionRequest build() {
            return new UpdateFunctionRequest(this);
        } 

    } 

}
