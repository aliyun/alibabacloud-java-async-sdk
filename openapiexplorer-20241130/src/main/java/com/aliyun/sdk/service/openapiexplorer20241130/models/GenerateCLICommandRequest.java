// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link GenerateCLICommandRequest} extends {@link RequestModel}
 *
 * <p>GenerateCLICommandRequest</p>
 */
public class GenerateCLICommandRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("api")
    @com.aliyun.core.annotation.Validation(required = true)
    private String api;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiParams")
    @Deprecated
    private java.util.Map<String, ?> apiParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jsonApiParams")
    private String jsonApiParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GenerateCLICommandRequest(Builder builder) {
        super(builder);
        this.api = builder.api;
        this.apiParams = builder.apiParams;
        this.apiVersion = builder.apiVersion;
        this.jsonApiParams = builder.jsonApiParams;
        this.product = builder.product;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCLICommandRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return api
     */
    public String getApi() {
        return this.api;
    }

    /**
     * @return apiParams
     */
    public java.util.Map<String, ?> getApiParams() {
        return this.apiParams;
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return jsonApiParams
     */
    public String getJsonApiParams() {
        return this.jsonApiParams;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GenerateCLICommandRequest, Builder> {
        private String api; 
        private java.util.Map<String, ?> apiParams; 
        private String apiVersion; 
        private String jsonApiParams; 
        private String product; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateCLICommandRequest request) {
            super(request);
            this.api = request.api;
            this.apiParams = request.apiParams;
            this.apiVersion = request.apiVersion;
            this.jsonApiParams = request.jsonApiParams;
            this.product = request.product;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder api(String api) {
            this.putBodyParameter("api", api);
            this.api = api;
            return this;
        }

        /**
         * apiParams.
         */
        public Builder apiParams(java.util.Map<String, ?> apiParams) {
            String apiParamsShrink = shrink(apiParams, "apiParams", "json");
            this.putBodyParameter("apiParams", apiParamsShrink);
            this.apiParams = apiParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.putBodyParameter("apiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * jsonApiParams.
         */
        public Builder jsonApiParams(String jsonApiParams) {
            this.putBodyParameter("jsonApiParams", jsonApiParams);
            this.jsonApiParams = jsonApiParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder product(String product) {
            this.putBodyParameter("product", product);
            this.product = product;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GenerateCLICommandRequest build() {
            return new GenerateCLICommandRequest(this);
        } 

    } 

}
