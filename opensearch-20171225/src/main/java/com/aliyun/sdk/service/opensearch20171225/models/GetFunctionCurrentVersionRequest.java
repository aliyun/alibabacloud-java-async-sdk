// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionCurrentVersionRequest} extends {@link RequestModel}
 *
 * <p>GetFunctionCurrentVersionRequest</p>
 */
public class GetFunctionCurrentVersionRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("category")
    private String category;

    @Query
    @NameInMap("domain")
    private String domain;

    @Query
    @NameInMap("functionType")
    private String functionType;

    @Query
    @NameInMap("modelType")
    @Validation(required = true)
    private String modelType;

    private GetFunctionCurrentVersionRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.category = builder.category;
        this.domain = builder.domain;
        this.functionType = builder.functionType;
        this.modelType = builder.modelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionCurrentVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    public static final class Builder extends Request.Builder<GetFunctionCurrentVersionRequest, Builder> {
        private String functionName; 
        private String category; 
        private String domain; 
        private String functionType; 
        private String modelType; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionCurrentVersionRequest response) {
            super(response);
            this.functionName = response.functionName;
            this.category = response.category;
            this.domain = response.domain;
            this.functionType = response.functionType;
            this.modelType = response.modelType;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * functionType.
         */
        public Builder functionType(String functionType) {
            this.putQueryParameter("functionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * modelType.
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        @Override
        public GetFunctionCurrentVersionRequest build() {
            return new GetFunctionCurrentVersionRequest(this);
        } 

    } 

}
