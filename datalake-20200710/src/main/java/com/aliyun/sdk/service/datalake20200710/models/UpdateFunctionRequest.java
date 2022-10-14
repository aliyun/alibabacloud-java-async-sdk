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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private UpdateFunctionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.functionInput = builder.functionInput;
        this.functionName = builder.functionName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdateFunctionRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private FunctionInput functionInput; 
        private String functionName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFunctionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.functionInput = request.functionInput;
            this.functionName = request.functionName;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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

        @Override
        public UpdateFunctionRequest build() {
            return new UpdateFunctionRequest(this);
        } 

    } 

}
