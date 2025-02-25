// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAiStoreReceiveConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAiStoreReceiveConfigRequest</p>
 */
public class CreateAiStoreReceiveConfigRequest extends Request {
    @Body
    @NameInMap("ApiName")
    private String apiName;

    @Body
    @NameInMap("Product")
    private String product;

    private CreateAiStoreReceiveConfigRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiStoreReceiveConfigRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAiStoreReceiveConfigRequest, Builder> {
        private String apiName; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiStoreReceiveConfigRequest request) {
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
        public CreateAiStoreReceiveConfigRequest build() {
            return new CreateAiStoreReceiveConfigRequest(this);
        } 

    } 

}
