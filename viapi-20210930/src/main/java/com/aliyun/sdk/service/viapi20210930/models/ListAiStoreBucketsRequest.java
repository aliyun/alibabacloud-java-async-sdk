// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAiStoreBucketsRequest} extends {@link RequestModel}
 *
 * <p>ListAiStoreBucketsRequest</p>
 */
public class ListAiStoreBucketsRequest extends Request {
    @Body
    @NameInMap("ApiName")
    private String apiName;

    @Body
    @NameInMap("Product")
    private String product;

    private ListAiStoreBucketsRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAiStoreBucketsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<ListAiStoreBucketsRequest, Builder> {
        private String apiName; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(ListAiStoreBucketsRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.product = request.product;
        } 

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putBodyParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putBodyParameter("Product", product);
            this.product = product;
            return this;
        }

        @Override
        public ListAiStoreBucketsRequest build() {
            return new ListAiStoreBucketsRequest(this);
        } 

    } 

}
