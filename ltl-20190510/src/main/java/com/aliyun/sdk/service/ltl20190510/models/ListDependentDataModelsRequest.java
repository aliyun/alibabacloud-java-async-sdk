// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDependentDataModelsRequest} extends {@link RequestModel}
 *
 * <p>ListDependentDataModelsRequest</p>
 */
public class ListDependentDataModelsRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    private String apiVersion;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private ListDependentDataModelsRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDependentDataModelsRequest create() {
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<ListDependentDataModelsRequest, Builder> {
        private String apiVersion; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ListDependentDataModelsRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.productKey = request.productKey;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public ListDependentDataModelsRequest build() {
            return new ListDependentDataModelsRequest(this);
        } 

    } 

}
