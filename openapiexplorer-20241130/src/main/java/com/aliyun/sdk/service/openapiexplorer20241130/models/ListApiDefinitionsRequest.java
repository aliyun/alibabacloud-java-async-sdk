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
 * {@link ListApiDefinitionsRequest} extends {@link RequestModel}
 *
 * <p>ListApiDefinitionsRequest</p>
 */
public class ListApiDefinitionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    private ListApiDefinitionsRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiDefinitionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListApiDefinitionsRequest, Builder> {
        private String apiVersion; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(ListApiDefinitionsRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.product = request.product;
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
        public ListApiDefinitionsRequest build() {
            return new ListApiDefinitionsRequest(this);
        } 

    } 

}
