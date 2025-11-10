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
 * {@link GetApiDefinitionRequest} extends {@link RequestModel}
 *
 * <p>GetApiDefinitionRequest</p>
 */
public class GetApiDefinitionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("api")
    @com.aliyun.core.annotation.Validation(required = true)
    private String api;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    private GetApiDefinitionRequest(Builder builder) {
        super(builder);
        this.api = builder.api;
        this.apiVersion = builder.apiVersion;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiDefinitionRequest create() {
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
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<GetApiDefinitionRequest, Builder> {
        private String api; 
        private String apiVersion; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(GetApiDefinitionRequest request) {
            super(request);
            this.api = request.api;
            this.apiVersion = request.apiVersion;
            this.product = request.product;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribeRegions</p>
         */
        public Builder api(String api) {
            this.putQueryParameter("api", api);
            this.api = api;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("apiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("product", product);
            this.product = product;
            return this;
        }

        @Override
        public GetApiDefinitionRequest build() {
            return new GetApiDefinitionRequest(this);
        } 

    } 

}
